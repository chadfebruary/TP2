package app.milleniuminfinity.com.assignment6.repository;

import java.util.Set;

/**
 * Created by 208023429 on 4/21/2016.
 */
public interface Repository <Entity, Identity> {

    Entity findByIdentity(Identity id);
    Entity save(Entity entity) throws Exception;
    Entity update(Entity entity);
    Entity delete (Entity entity);

    Set<Entity> findAll();
}
