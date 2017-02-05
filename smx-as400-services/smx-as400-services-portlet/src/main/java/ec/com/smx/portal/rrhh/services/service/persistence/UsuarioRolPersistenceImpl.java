package ec.com.smx.portal.rrhh.services.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException;
import ec.com.smx.portal.rrhh.services.model.UsuarioRol;
import ec.com.smx.portal.rrhh.services.model.impl.UsuarioRolImpl;
import ec.com.smx.portal.rrhh.services.model.impl.UsuarioRolModelImpl;
import ec.com.smx.portal.rrhh.services.service.persistence.UsuarioRolPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the usuario rol service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author maballe
 * @see UsuarioRolPersistence
 * @see UsuarioRolUtil
 * @generated
 */
public class UsuarioRolPersistenceImpl extends BasePersistenceImpl<UsuarioRol>
    implements UsuarioRolPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link UsuarioRolUtil} to access the usuario rol persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = UsuarioRolImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioRolModelImpl.FINDER_CACHE_ENABLED, UsuarioRolImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioRolModelImpl.FINDER_CACHE_ENABLED, UsuarioRolImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioRolModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USUARIOID =
        new FinderPath(UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioRolModelImpl.FINDER_CACHE_ENABLED, UsuarioRolImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUsuarioId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USUARIOID =
        new FinderPath(UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioRolModelImpl.FINDER_CACHE_ENABLED, UsuarioRolImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUsuarioId",
            new String[] { Long.class.getName() },
            UsuarioRolModelImpl.USUARIOID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_USUARIOID = new FinderPath(UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioRolModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUsuarioId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_USUARIOID_USUARIOID_2 = "usuarioRol.usuarioId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ROLID = new FinderPath(UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioRolModelImpl.FINDER_CACHE_ENABLED, UsuarioRolImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRolId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROLID = new FinderPath(UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioRolModelImpl.FINDER_CACHE_ENABLED, UsuarioRolImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRolId",
            new String[] { Long.class.getName() },
            UsuarioRolModelImpl.ROLID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ROLID = new FinderPath(UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioRolModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRolId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_ROLID_ROLID_2 = "usuarioRol.rolId = ?";
    private static final String _SQL_SELECT_USUARIOROL = "SELECT usuarioRol FROM UsuarioRol usuarioRol";
    private static final String _SQL_SELECT_USUARIOROL_WHERE = "SELECT usuarioRol FROM UsuarioRol usuarioRol WHERE ";
    private static final String _SQL_COUNT_USUARIOROL = "SELECT COUNT(usuarioRol) FROM UsuarioRol usuarioRol";
    private static final String _SQL_COUNT_USUARIOROL_WHERE = "SELECT COUNT(usuarioRol) FROM UsuarioRol usuarioRol WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "usuarioRol.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UsuarioRol exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UsuarioRol exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(UsuarioRolPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "UsuarioRolId", "usuarioId", "rolId"
            });
    private static UsuarioRol _nullUsuarioRol = new UsuarioRolImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<UsuarioRol> toCacheModel() {
                return _nullUsuarioRolCacheModel;
            }
        };

    private static CacheModel<UsuarioRol> _nullUsuarioRolCacheModel = new CacheModel<UsuarioRol>() {
            @Override
            public UsuarioRol toEntityModel() {
                return _nullUsuarioRol;
            }
        };

    public UsuarioRolPersistenceImpl() {
        setModelClass(UsuarioRol.class);
    }

    /**
     * Returns all the usuario rols where usuarioId = &#63;.
     *
     * @param usuarioId the usuario ID
     * @return the matching usuario rols
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UsuarioRol> findByUsuarioId(long usuarioId)
        throws SystemException {
        return findByUsuarioId(usuarioId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the usuario rols where usuarioId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioRolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param usuarioId the usuario ID
     * @param start the lower bound of the range of usuario rols
     * @param end the upper bound of the range of usuario rols (not inclusive)
     * @return the range of matching usuario rols
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UsuarioRol> findByUsuarioId(long usuarioId, int start, int end)
        throws SystemException {
        return findByUsuarioId(usuarioId, start, end, null);
    }

    /**
     * Returns an ordered range of all the usuario rols where usuarioId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioRolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param usuarioId the usuario ID
     * @param start the lower bound of the range of usuario rols
     * @param end the upper bound of the range of usuario rols (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching usuario rols
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UsuarioRol> findByUsuarioId(long usuarioId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USUARIOID;
            finderArgs = new Object[] { usuarioId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USUARIOID;
            finderArgs = new Object[] { usuarioId, start, end, orderByComparator };
        }

        List<UsuarioRol> list = (List<UsuarioRol>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (UsuarioRol usuarioRol : list) {
                if ((usuarioId != usuarioRol.getUsuarioId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_USUARIOROL_WHERE);

            query.append(_FINDER_COLUMN_USUARIOID_USUARIOID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(UsuarioRolModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(usuarioId);

                if (!pagination) {
                    list = (List<UsuarioRol>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UsuarioRol>(list);
                } else {
                    list = (List<UsuarioRol>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first usuario rol in the ordered set where usuarioId = &#63;.
     *
     * @param usuarioId the usuario ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching usuario rol
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a matching usuario rol could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioRol findByUsuarioId_First(long usuarioId,
        OrderByComparator orderByComparator)
        throws NoSuchUsuarioRolException, SystemException {
        UsuarioRol usuarioRol = fetchByUsuarioId_First(usuarioId,
                orderByComparator);

        if (usuarioRol != null) {
            return usuarioRol;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("usuarioId=");
        msg.append(usuarioId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUsuarioRolException(msg.toString());
    }

    /**
     * Returns the first usuario rol in the ordered set where usuarioId = &#63;.
     *
     * @param usuarioId the usuario ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching usuario rol, or <code>null</code> if a matching usuario rol could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioRol fetchByUsuarioId_First(long usuarioId,
        OrderByComparator orderByComparator) throws SystemException {
        List<UsuarioRol> list = findByUsuarioId(usuarioId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last usuario rol in the ordered set where usuarioId = &#63;.
     *
     * @param usuarioId the usuario ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching usuario rol
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a matching usuario rol could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioRol findByUsuarioId_Last(long usuarioId,
        OrderByComparator orderByComparator)
        throws NoSuchUsuarioRolException, SystemException {
        UsuarioRol usuarioRol = fetchByUsuarioId_Last(usuarioId,
                orderByComparator);

        if (usuarioRol != null) {
            return usuarioRol;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("usuarioId=");
        msg.append(usuarioId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUsuarioRolException(msg.toString());
    }

    /**
     * Returns the last usuario rol in the ordered set where usuarioId = &#63;.
     *
     * @param usuarioId the usuario ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching usuario rol, or <code>null</code> if a matching usuario rol could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioRol fetchByUsuarioId_Last(long usuarioId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUsuarioId(usuarioId);

        if (count == 0) {
            return null;
        }

        List<UsuarioRol> list = findByUsuarioId(usuarioId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the usuario rols before and after the current usuario rol in the ordered set where usuarioId = &#63;.
     *
     * @param UsuarioRolId the primary key of the current usuario rol
     * @param usuarioId the usuario ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next usuario rol
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a usuario rol with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioRol[] findByUsuarioId_PrevAndNext(long UsuarioRolId,
        long usuarioId, OrderByComparator orderByComparator)
        throws NoSuchUsuarioRolException, SystemException {
        UsuarioRol usuarioRol = findByPrimaryKey(UsuarioRolId);

        Session session = null;

        try {
            session = openSession();

            UsuarioRol[] array = new UsuarioRolImpl[3];

            array[0] = getByUsuarioId_PrevAndNext(session, usuarioRol,
                    usuarioId, orderByComparator, true);

            array[1] = usuarioRol;

            array[2] = getByUsuarioId_PrevAndNext(session, usuarioRol,
                    usuarioId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected UsuarioRol getByUsuarioId_PrevAndNext(Session session,
        UsuarioRol usuarioRol, long usuarioId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_USUARIOROL_WHERE);

        query.append(_FINDER_COLUMN_USUARIOID_USUARIOID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(UsuarioRolModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(usuarioId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(usuarioRol);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<UsuarioRol> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the usuario rols where usuarioId = &#63; from the database.
     *
     * @param usuarioId the usuario ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUsuarioId(long usuarioId) throws SystemException {
        for (UsuarioRol usuarioRol : findByUsuarioId(usuarioId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(usuarioRol);
        }
    }

    /**
     * Returns the number of usuario rols where usuarioId = &#63;.
     *
     * @param usuarioId the usuario ID
     * @return the number of matching usuario rols
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUsuarioId(long usuarioId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_USUARIOID;

        Object[] finderArgs = new Object[] { usuarioId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_USUARIOROL_WHERE);

            query.append(_FINDER_COLUMN_USUARIOID_USUARIOID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(usuarioId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the usuario rols where rolId = &#63;.
     *
     * @param rolId the rol ID
     * @return the matching usuario rols
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UsuarioRol> findByRolId(long rolId) throws SystemException {
        return findByRolId(rolId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the usuario rols where rolId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioRolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param rolId the rol ID
     * @param start the lower bound of the range of usuario rols
     * @param end the upper bound of the range of usuario rols (not inclusive)
     * @return the range of matching usuario rols
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UsuarioRol> findByRolId(long rolId, int start, int end)
        throws SystemException {
        return findByRolId(rolId, start, end, null);
    }

    /**
     * Returns an ordered range of all the usuario rols where rolId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioRolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param rolId the rol ID
     * @param start the lower bound of the range of usuario rols
     * @param end the upper bound of the range of usuario rols (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching usuario rols
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UsuarioRol> findByRolId(long rolId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROLID;
            finderArgs = new Object[] { rolId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ROLID;
            finderArgs = new Object[] { rolId, start, end, orderByComparator };
        }

        List<UsuarioRol> list = (List<UsuarioRol>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (UsuarioRol usuarioRol : list) {
                if ((rolId != usuarioRol.getRolId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_USUARIOROL_WHERE);

            query.append(_FINDER_COLUMN_ROLID_ROLID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(UsuarioRolModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(rolId);

                if (!pagination) {
                    list = (List<UsuarioRol>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UsuarioRol>(list);
                } else {
                    list = (List<UsuarioRol>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first usuario rol in the ordered set where rolId = &#63;.
     *
     * @param rolId the rol ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching usuario rol
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a matching usuario rol could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioRol findByRolId_First(long rolId,
        OrderByComparator orderByComparator)
        throws NoSuchUsuarioRolException, SystemException {
        UsuarioRol usuarioRol = fetchByRolId_First(rolId, orderByComparator);

        if (usuarioRol != null) {
            return usuarioRol;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("rolId=");
        msg.append(rolId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUsuarioRolException(msg.toString());
    }

    /**
     * Returns the first usuario rol in the ordered set where rolId = &#63;.
     *
     * @param rolId the rol ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching usuario rol, or <code>null</code> if a matching usuario rol could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioRol fetchByRolId_First(long rolId,
        OrderByComparator orderByComparator) throws SystemException {
        List<UsuarioRol> list = findByRolId(rolId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last usuario rol in the ordered set where rolId = &#63;.
     *
     * @param rolId the rol ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching usuario rol
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a matching usuario rol could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioRol findByRolId_Last(long rolId,
        OrderByComparator orderByComparator)
        throws NoSuchUsuarioRolException, SystemException {
        UsuarioRol usuarioRol = fetchByRolId_Last(rolId, orderByComparator);

        if (usuarioRol != null) {
            return usuarioRol;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("rolId=");
        msg.append(rolId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUsuarioRolException(msg.toString());
    }

    /**
     * Returns the last usuario rol in the ordered set where rolId = &#63;.
     *
     * @param rolId the rol ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching usuario rol, or <code>null</code> if a matching usuario rol could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioRol fetchByRolId_Last(long rolId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByRolId(rolId);

        if (count == 0) {
            return null;
        }

        List<UsuarioRol> list = findByRolId(rolId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the usuario rols before and after the current usuario rol in the ordered set where rolId = &#63;.
     *
     * @param UsuarioRolId the primary key of the current usuario rol
     * @param rolId the rol ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next usuario rol
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a usuario rol with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioRol[] findByRolId_PrevAndNext(long UsuarioRolId, long rolId,
        OrderByComparator orderByComparator)
        throws NoSuchUsuarioRolException, SystemException {
        UsuarioRol usuarioRol = findByPrimaryKey(UsuarioRolId);

        Session session = null;

        try {
            session = openSession();

            UsuarioRol[] array = new UsuarioRolImpl[3];

            array[0] = getByRolId_PrevAndNext(session, usuarioRol, rolId,
                    orderByComparator, true);

            array[1] = usuarioRol;

            array[2] = getByRolId_PrevAndNext(session, usuarioRol, rolId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected UsuarioRol getByRolId_PrevAndNext(Session session,
        UsuarioRol usuarioRol, long rolId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_USUARIOROL_WHERE);

        query.append(_FINDER_COLUMN_ROLID_ROLID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(UsuarioRolModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(rolId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(usuarioRol);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<UsuarioRol> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the usuario rols where rolId = &#63; from the database.
     *
     * @param rolId the rol ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByRolId(long rolId) throws SystemException {
        for (UsuarioRol usuarioRol : findByRolId(rolId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(usuarioRol);
        }
    }

    /**
     * Returns the number of usuario rols where rolId = &#63;.
     *
     * @param rolId the rol ID
     * @return the number of matching usuario rols
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByRolId(long rolId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ROLID;

        Object[] finderArgs = new Object[] { rolId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_USUARIOROL_WHERE);

            query.append(_FINDER_COLUMN_ROLID_ROLID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(rolId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the usuario rol in the entity cache if it is enabled.
     *
     * @param usuarioRol the usuario rol
     */
    @Override
    public void cacheResult(UsuarioRol usuarioRol) {
        EntityCacheUtil.putResult(UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioRolImpl.class, usuarioRol.getPrimaryKey(), usuarioRol);

        usuarioRol.resetOriginalValues();
    }

    /**
     * Caches the usuario rols in the entity cache if it is enabled.
     *
     * @param usuarioRols the usuario rols
     */
    @Override
    public void cacheResult(List<UsuarioRol> usuarioRols) {
        for (UsuarioRol usuarioRol : usuarioRols) {
            if (EntityCacheUtil.getResult(
                        UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
                        UsuarioRolImpl.class, usuarioRol.getPrimaryKey()) == null) {
                cacheResult(usuarioRol);
            } else {
                usuarioRol.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all usuario rols.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(UsuarioRolImpl.class.getName());
        }

        EntityCacheUtil.clearCache(UsuarioRolImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the usuario rol.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(UsuarioRol usuarioRol) {
        EntityCacheUtil.removeResult(UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioRolImpl.class, usuarioRol.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<UsuarioRol> usuarioRols) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (UsuarioRol usuarioRol : usuarioRols) {
            EntityCacheUtil.removeResult(UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
                UsuarioRolImpl.class, usuarioRol.getPrimaryKey());
        }
    }

    /**
     * Creates a new usuario rol with the primary key. Does not add the usuario rol to the database.
     *
     * @param UsuarioRolId the primary key for the new usuario rol
     * @return the new usuario rol
     */
    @Override
    public UsuarioRol create(long UsuarioRolId) {
        UsuarioRol usuarioRol = new UsuarioRolImpl();

        usuarioRol.setNew(true);
        usuarioRol.setPrimaryKey(UsuarioRolId);

        return usuarioRol;
    }

    /**
     * Removes the usuario rol with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param UsuarioRolId the primary key of the usuario rol
     * @return the usuario rol that was removed
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a usuario rol with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioRol remove(long UsuarioRolId)
        throws NoSuchUsuarioRolException, SystemException {
        return remove((Serializable) UsuarioRolId);
    }

    /**
     * Removes the usuario rol with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the usuario rol
     * @return the usuario rol that was removed
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a usuario rol with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioRol remove(Serializable primaryKey)
        throws NoSuchUsuarioRolException, SystemException {
        Session session = null;

        try {
            session = openSession();

            UsuarioRol usuarioRol = (UsuarioRol) session.get(UsuarioRolImpl.class,
                    primaryKey);

            if (usuarioRol == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchUsuarioRolException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(usuarioRol);
        } catch (NoSuchUsuarioRolException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected UsuarioRol removeImpl(UsuarioRol usuarioRol)
        throws SystemException {
        usuarioRol = toUnwrappedModel(usuarioRol);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(usuarioRol)) {
                usuarioRol = (UsuarioRol) session.get(UsuarioRolImpl.class,
                        usuarioRol.getPrimaryKeyObj());
            }

            if (usuarioRol != null) {
                session.delete(usuarioRol);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (usuarioRol != null) {
            clearCache(usuarioRol);
        }

        return usuarioRol;
    }

    @Override
    public UsuarioRol updateImpl(
        ec.com.smx.portal.rrhh.services.model.UsuarioRol usuarioRol)
        throws SystemException {
        usuarioRol = toUnwrappedModel(usuarioRol);

        boolean isNew = usuarioRol.isNew();

        UsuarioRolModelImpl usuarioRolModelImpl = (UsuarioRolModelImpl) usuarioRol;

        Session session = null;

        try {
            session = openSession();

            if (usuarioRol.isNew()) {
                session.save(usuarioRol);

                usuarioRol.setNew(false);
            } else {
                session.merge(usuarioRol);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !UsuarioRolModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((usuarioRolModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USUARIOID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        usuarioRolModelImpl.getOriginalUsuarioId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USUARIOID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USUARIOID,
                    args);

                args = new Object[] { usuarioRolModelImpl.getUsuarioId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USUARIOID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USUARIOID,
                    args);
            }

            if ((usuarioRolModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROLID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        usuarioRolModelImpl.getOriginalRolId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ROLID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROLID,
                    args);

                args = new Object[] { usuarioRolModelImpl.getRolId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ROLID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROLID,
                    args);
            }
        }

        EntityCacheUtil.putResult(UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioRolImpl.class, usuarioRol.getPrimaryKey(), usuarioRol);

        return usuarioRol;
    }

    protected UsuarioRol toUnwrappedModel(UsuarioRol usuarioRol) {
        if (usuarioRol instanceof UsuarioRolImpl) {
            return usuarioRol;
        }

        UsuarioRolImpl usuarioRolImpl = new UsuarioRolImpl();

        usuarioRolImpl.setNew(usuarioRol.isNew());
        usuarioRolImpl.setPrimaryKey(usuarioRol.getPrimaryKey());

        usuarioRolImpl.setUsuarioRolId(usuarioRol.getUsuarioRolId());
        usuarioRolImpl.setUsuarioId(usuarioRol.getUsuarioId());
        usuarioRolImpl.setRolId(usuarioRol.getRolId());

        return usuarioRolImpl;
    }

    /**
     * Returns the usuario rol with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the usuario rol
     * @return the usuario rol
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a usuario rol with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioRol findByPrimaryKey(Serializable primaryKey)
        throws NoSuchUsuarioRolException, SystemException {
        UsuarioRol usuarioRol = fetchByPrimaryKey(primaryKey);

        if (usuarioRol == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchUsuarioRolException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return usuarioRol;
    }

    /**
     * Returns the usuario rol with the primary key or throws a {@link ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException} if it could not be found.
     *
     * @param UsuarioRolId the primary key of the usuario rol
     * @return the usuario rol
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a usuario rol with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioRol findByPrimaryKey(long UsuarioRolId)
        throws NoSuchUsuarioRolException, SystemException {
        return findByPrimaryKey((Serializable) UsuarioRolId);
    }

    /**
     * Returns the usuario rol with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the usuario rol
     * @return the usuario rol, or <code>null</code> if a usuario rol with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioRol fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        UsuarioRol usuarioRol = (UsuarioRol) EntityCacheUtil.getResult(UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
                UsuarioRolImpl.class, primaryKey);

        if (usuarioRol == _nullUsuarioRol) {
            return null;
        }

        if (usuarioRol == null) {
            Session session = null;

            try {
                session = openSession();

                usuarioRol = (UsuarioRol) session.get(UsuarioRolImpl.class,
                        primaryKey);

                if (usuarioRol != null) {
                    cacheResult(usuarioRol);
                } else {
                    EntityCacheUtil.putResult(UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
                        UsuarioRolImpl.class, primaryKey, _nullUsuarioRol);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(UsuarioRolModelImpl.ENTITY_CACHE_ENABLED,
                    UsuarioRolImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return usuarioRol;
    }

    /**
     * Returns the usuario rol with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param UsuarioRolId the primary key of the usuario rol
     * @return the usuario rol, or <code>null</code> if a usuario rol with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsuarioRol fetchByPrimaryKey(long UsuarioRolId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) UsuarioRolId);
    }

    /**
     * Returns all the usuario rols.
     *
     * @return the usuario rols
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UsuarioRol> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the usuario rols.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioRolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of usuario rols
     * @param end the upper bound of the range of usuario rols (not inclusive)
     * @return the range of usuario rols
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UsuarioRol> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the usuario rols.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioRolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of usuario rols
     * @param end the upper bound of the range of usuario rols (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of usuario rols
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UsuarioRol> findAll(int start, int end,
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

        List<UsuarioRol> list = (List<UsuarioRol>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_USUARIOROL);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_USUARIOROL;

                if (pagination) {
                    sql = sql.concat(UsuarioRolModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<UsuarioRol>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UsuarioRol>(list);
                } else {
                    list = (List<UsuarioRol>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Removes all the usuario rols from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (UsuarioRol usuarioRol : findAll()) {
            remove(usuarioRol);
        }
    }

    /**
     * Returns the number of usuario rols.
     *
     * @return the number of usuario rols
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

                Query q = session.createQuery(_SQL_COUNT_USUARIOROL);

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
     * Initializes the usuario rol persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ec.com.smx.portal.rrhh.services.model.UsuarioRol")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<UsuarioRol>> listenersList = new ArrayList<ModelListener<UsuarioRol>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<UsuarioRol>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(UsuarioRolImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
