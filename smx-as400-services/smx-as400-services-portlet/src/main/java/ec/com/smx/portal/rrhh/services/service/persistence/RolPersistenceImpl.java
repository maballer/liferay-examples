package ec.com.smx.portal.rrhh.services.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import ec.com.smx.portal.rrhh.services.NoSuchRolException;
import ec.com.smx.portal.rrhh.services.model.Rol;
import ec.com.smx.portal.rrhh.services.model.impl.RolImpl;
import ec.com.smx.portal.rrhh.services.model.impl.RolModelImpl;
import ec.com.smx.portal.rrhh.services.service.persistence.RolPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the rol service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author maballe
 * @see RolPersistence
 * @see RolUtil
 * @generated
 */
public class RolPersistenceImpl extends BasePersistenceImpl<Rol>
    implements RolPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RolUtil} to access the rol persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RolImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RolModelImpl.ENTITY_CACHE_ENABLED,
            RolModelImpl.FINDER_CACHE_ENABLED, RolImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RolModelImpl.ENTITY_CACHE_ENABLED,
            RolModelImpl.FINDER_CACHE_ENABLED, RolImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RolModelImpl.ENTITY_CACHE_ENABLED,
            RolModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ROL = "SELECT rol FROM Rol rol";
    private static final String _SQL_COUNT_ROL = "SELECT COUNT(rol) FROM Rol rol";
    private static final String _ORDER_BY_ENTITY_ALIAS = "rol.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Rol exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RolPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "rolId"
            });
    private static Rol _nullRol = new RolImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Rol> toCacheModel() {
                return _nullRolCacheModel;
            }
        };

    private static CacheModel<Rol> _nullRolCacheModel = new CacheModel<Rol>() {
            @Override
            public Rol toEntityModel() {
                return _nullRol;
            }
        };

    public RolPersistenceImpl() {
        setModelClass(Rol.class);
    }

    /**
     * Caches the rol in the entity cache if it is enabled.
     *
     * @param rol the rol
     */
    @Override
    public void cacheResult(Rol rol) {
        EntityCacheUtil.putResult(RolModelImpl.ENTITY_CACHE_ENABLED,
            RolImpl.class, rol.getPrimaryKey(), rol);

        rol.resetOriginalValues();
    }

    /**
     * Caches the rols in the entity cache if it is enabled.
     *
     * @param rols the rols
     */
    @Override
    public void cacheResult(List<Rol> rols) {
        for (Rol rol : rols) {
            if (EntityCacheUtil.getResult(RolModelImpl.ENTITY_CACHE_ENABLED,
                        RolImpl.class, rol.getPrimaryKey()) == null) {
                cacheResult(rol);
            } else {
                rol.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all rols.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RolImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RolImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the rol.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Rol rol) {
        EntityCacheUtil.removeResult(RolModelImpl.ENTITY_CACHE_ENABLED,
            RolImpl.class, rol.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Rol> rols) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Rol rol : rols) {
            EntityCacheUtil.removeResult(RolModelImpl.ENTITY_CACHE_ENABLED,
                RolImpl.class, rol.getPrimaryKey());
        }
    }

    /**
     * Creates a new rol with the primary key. Does not add the rol to the database.
     *
     * @param rolId the primary key for the new rol
     * @return the new rol
     */
    @Override
    public Rol create(long rolId) {
        Rol rol = new RolImpl();

        rol.setNew(true);
        rol.setPrimaryKey(rolId);

        return rol;
    }

    /**
     * Removes the rol with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param rolId the primary key of the rol
     * @return the rol that was removed
     * @throws ec.com.smx.portal.rrhh.services.NoSuchRolException if a rol with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rol remove(long rolId) throws NoSuchRolException, SystemException {
        return remove((Serializable) rolId);
    }

    /**
     * Removes the rol with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the rol
     * @return the rol that was removed
     * @throws ec.com.smx.portal.rrhh.services.NoSuchRolException if a rol with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rol remove(Serializable primaryKey)
        throws NoSuchRolException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Rol rol = (Rol) session.get(RolImpl.class, primaryKey);

            if (rol == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRolException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(rol);
        } catch (NoSuchRolException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Rol removeImpl(Rol rol) throws SystemException {
        rol = toUnwrappedModel(rol);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(rol)) {
                rol = (Rol) session.get(RolImpl.class, rol.getPrimaryKeyObj());
            }

            if (rol != null) {
                session.delete(rol);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (rol != null) {
            clearCache(rol);
        }

        return rol;
    }

    @Override
    public Rol updateImpl(ec.com.smx.portal.rrhh.services.model.Rol rol)
        throws SystemException {
        rol = toUnwrappedModel(rol);

        boolean isNew = rol.isNew();

        Session session = null;

        try {
            session = openSession();

            if (rol.isNew()) {
                session.save(rol);

                rol.setNew(false);
            } else {
                session.merge(rol);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(RolModelImpl.ENTITY_CACHE_ENABLED,
            RolImpl.class, rol.getPrimaryKey(), rol);

        return rol;
    }

    protected Rol toUnwrappedModel(Rol rol) {
        if (rol instanceof RolImpl) {
            return rol;
        }

        RolImpl rolImpl = new RolImpl();

        rolImpl.setNew(rol.isNew());
        rolImpl.setPrimaryKey(rol.getPrimaryKey());

        rolImpl.setRolId(rol.getRolId());
        rolImpl.setNombre(rol.getNombre());

        return rolImpl;
    }

    /**
     * Returns the rol with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the rol
     * @return the rol
     * @throws ec.com.smx.portal.rrhh.services.NoSuchRolException if a rol with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rol findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRolException, SystemException {
        Rol rol = fetchByPrimaryKey(primaryKey);

        if (rol == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRolException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return rol;
    }

    /**
     * Returns the rol with the primary key or throws a {@link ec.com.smx.portal.rrhh.services.NoSuchRolException} if it could not be found.
     *
     * @param rolId the primary key of the rol
     * @return the rol
     * @throws ec.com.smx.portal.rrhh.services.NoSuchRolException if a rol with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rol findByPrimaryKey(long rolId)
        throws NoSuchRolException, SystemException {
        return findByPrimaryKey((Serializable) rolId);
    }

    /**
     * Returns the rol with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the rol
     * @return the rol, or <code>null</code> if a rol with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rol fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Rol rol = (Rol) EntityCacheUtil.getResult(RolModelImpl.ENTITY_CACHE_ENABLED,
                RolImpl.class, primaryKey);

        if (rol == _nullRol) {
            return null;
        }

        if (rol == null) {
            Session session = null;

            try {
                session = openSession();

                rol = (Rol) session.get(RolImpl.class, primaryKey);

                if (rol != null) {
                    cacheResult(rol);
                } else {
                    EntityCacheUtil.putResult(RolModelImpl.ENTITY_CACHE_ENABLED,
                        RolImpl.class, primaryKey, _nullRol);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RolModelImpl.ENTITY_CACHE_ENABLED,
                    RolImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return rol;
    }

    /**
     * Returns the rol with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param rolId the primary key of the rol
     * @return the rol, or <code>null</code> if a rol with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rol fetchByPrimaryKey(long rolId) throws SystemException {
        return fetchByPrimaryKey((Serializable) rolId);
    }

    /**
     * Returns all the rols.
     *
     * @return the rols
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Rol> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the rols.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.RolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of rols
     * @param end the upper bound of the range of rols (not inclusive)
     * @return the range of rols
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Rol> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the rols.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.RolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of rols
     * @param end the upper bound of the range of rols (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of rols
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Rol> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Rol> list = (List<Rol>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ROL);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ROL;

                if (pagination) {
                    sql = sql.concat(RolModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Rol>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Rol>(list);
                } else {
                    list = (List<Rol>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the rols from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Rol rol : findAll()) {
            remove(rol);
        }
    }

    /**
     * Returns the number of rols.
     *
     * @return the number of rols
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_ROL);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the rol persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ec.com.smx.portal.rrhh.services.model.Rol")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Rol>> listenersList = new ArrayList<ModelListener<Rol>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Rol>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RolImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
