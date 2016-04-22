package app.milleniuminfinity.com.assignment6.repository.internet.Impl;

import java.sql.SQLException;

import javax.naming.Context;

import app.milleniuminfinity.com.assignment6.conf.databases.DBConstants;
import app.milleniuminfinity.com.assignment6.domain.internet.Internet;
import app.milleniuminfinity.com.assignment6.repository.internet.InternetRepository;

/**
 * Created by Chad on 4/21/2016.
 */
public class InternetRepositoryImpl extends SQLiteOpenHelper implements InternetRepository{
    public static final String TABLE_INTERNET = "internet";
    private SQLiteDatabase database;

    public static final String COLUMN_ISP = "isp";
    public static final String COLUMN_PLANNAME = "planname";
    public static final String COLUMN_PRICE = "price";
    public static final String COLUMN_DATAALLOWANCE = "dataallowance";

    //Database table creation
    private static final String DATABASE_CREATE = " CREATE TABLE "
            + TABLE_INTERNET + "("
            + COLUMN_ISP + " TEXT PRIMARY KEY, "
            + COLUMN_PLANNAME + " TEXT NOT NULL, "
            + COLUMN_PRICE + " INTEGER NOT NULL, "
            + COLUMN_DATAALLOWANCE + " INTEGER NOT NULL);";

    public InternetRepositoryImpl(Context context)
    {
        super(context, DBConstants.DATABASE_NAME, null, DBConstants.DATABASE_VERSION);
    }

    public void open() throws SQLException
    {
        database = this.getWritableDatabase();
    }

    public void close()
    {
        this.close();
    }

    @Override
    public Internet findById(String isp)
    {
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor cursor = database.query(
                TABLE_INTERNET,
                new String[]{
                        COLUMN_ISP,
                        COLUMN_PLANNAME,
                        COLUMN_PRICE,
                        COLUMN_DATAALLOWANCE},
                COLUMN_ISP + " =? ",
                new String[]{String valueOf(isp)},
                null,
                null,
                null,
                null);

        if(cursor.moveToFirst()){
            final Internet internet = new
        }
        )
    }
}
