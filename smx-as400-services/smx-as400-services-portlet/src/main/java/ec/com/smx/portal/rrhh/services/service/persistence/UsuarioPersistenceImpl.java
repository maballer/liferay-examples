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
import com.liferay.portal.kernel.util.CharPool;
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

import ec.com.smx.portal.rrhh.services.NoSuchUsuarioException;
import ec.com.smx.portal.rrhh.services.model.Usuario;
import ec.com.smx.portal.rrhh.services.model.impl.UsuarioImpl;
import ec.com.smx.portal.rrhh.services.model.impl.UsuarioModelImpl;
import ec.com.smx.portal.rrhh.services.service.persistence.UsuarioPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author maballe
 * @see UsuarioPersistence
 * @see UsuarioUtil
 * @generated
 */
public class UsuarioPersistenceImpl extends BasePersistenceImpl<Usuario>
    implements UsuarioPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link UsuarioUtil} to access the usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = UsuarioImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioModelImpl.FINDER_CACHE_ENABLED, UsuarioImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioModelImpl.FINDER_CACHE_ENABLED, UsuarioImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NOMBREKEYWORD =
        new FinderPath(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioModelImpl.FINDER_CACHE_ENABLED, UsuarioImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNombreKeyWord",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_NOMBREKEYWORD =
        new FinderPath(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByNombreKeyWord",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_NOMBREKEYWORD_NOMBRE_1 = "usuario.nombre LIKE NULL";
    private static final String _FINDER_COLUMN_NOMBREKEYWORD_NOMBRE_2 = "usuario.nombre LIKE ?";
    private static final String _FINDER_COLUMN_NOMBREKEYWORD_NOMBRE_3 = "(usuario.nombre IS NULL OR usuario.nombre LIKE '')";
    private static final String _SQL_SELECT_USUARIO = "SELECT usuario FROM Usuario usuario";
    private static final String _SQL_SELECT_USUARIO_WHERE = "SELECT usuario FROM Usuario usuario WHERE ";
    private static final String _SQL_COUNT_USUARIO = "SELECT COUNT(usuario) FROM Usuario usuario";
    private static final String _SQL_COUNT_USUARIO_WHERE = "SELECT COUNT(usuario) FROM Usuario usuario WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "usuario.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Usuario exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Usuario exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(UsuarioPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "usuarioId", "roleId"
            });
    private static Usuario _nullUsuario = new UsuarioImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Usuario> toCacheModel() {
                return _nullUsuarioCacheModel;
            }
        };

    private static CacheModel<Usuario> _nullUsuarioCacheModel = new CacheModel<Usuario>() {
            @Override
            public Usuario toEntityModel() {
                return _nullUsuario;
            }
        };

    public UsuarioPersistenceImpl() {
        setModelClass(Usuario.class);
    }

    /**
     * Returns all the usuarios where nombre LIKE &#63;.
     *
     * @param nombre the nombre
     * @return the matching usuarios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Usuario> findByNombreKeyWord(String nombre)
        throws SystemException {
        return findByNombreKeyWord(nombre, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the usuarios where nombre LIKE &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param nombre the nombre
     * @param start the lower bound of the range of usuarios
     * @param end the upper bound of the range of usuarios (not inclusive)
     * @return the range of matching usuarios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Usuario> findByNombreKeyWord(String nombre, int start, int end)
        throws SystemException {
        return findByNombreKeyWord(nombre, start, end, null);
    }

    /**
     * Returns an ordered range of all the usuarios where nombre LIKE &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param nombre the nombre
     * @param start the lower bound of the range of usuarios
     * @param end the upper bound of the range of usuarios (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching usuarios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Usuario> findByNombreKeyWord(String nombre, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NOMBREKEYWORD;
        finderArgs = new Object[] { nombre, start, end, orderByComparator };

        List<Usuario> list = (List<Usuario>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Usuario usuario : list) {
                if (!StringUtil.wildcardMatches(usuario.getNombre(), nombre,
                            CharPool.UNDERLINE, CharPool.PERCENT,
                            CharPool.BACK_SLASH, true)) {
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

            query.append(_SQL_SELECT_USUARIO_WHERE);

            boolean bindNombre = false;

            if (nombre == null) {
                query.append(_FINDER_COLUMN_NOMBREKEYWORD_NOMBRE_1);
            } else if (nombre.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NOMBREKEYWORD_NOMBRE_3);
            } else {
                bindNombre = true;

                query.append(_FINDER_COLUMN_NOMBREKEYWORD_NOMBRE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(UsuarioModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindNombre) {
                    qPos.add(nombre);
                }

                if (!pagination) {
                    list = (List<Usuario>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Usuario>(list);
                } else {
                    list = (List<Usuario>) QueryUtil.list(q, getDialect(),
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
     * Returns the first usuario in the ordered set where nombre LIKE &#63;.
     *
     * @param nombre the nombre
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching usuario
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException if a matching usuario could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario findByNombreKeyWord_First(String nombre,
        OrderByComparator orderByComparator)
        throws NoSuchUsuarioException, SystemException {
        Usuario usuario = fetchByNombreKeyWord_First(nombre, orderByComparator);

        if (usuario != null) {
            return usuario;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("nombre=");
        msg.append(nombre);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUsuarioException(msg.toString());
    }

    /**
     * Returns the first usuario in the ordered set where nombre LIKE &#63;.
     *
     * @param nombre the nombre
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching usuario, or <code>null</code> if a matching usuario could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario fetchByNombreKeyWord_First(String nombre,
        OrderByComparator orderByComparator) throws SystemException {
        List<Usuario> list = findByNombreKeyWord(nombre, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last usuario in the ordered set where nombre LIKE &#63;.
     *
     * @param nombre the nombre
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching usuario
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException if a matching usuario could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario findByNombreKeyWord_Last(String nombre,
        OrderByComparator orderByComparator)
        throws NoSuchUsuarioException, SystemException {
        Usuario usuario = fetchByNombreKeyWord_Last(nombre, orderByComparator);

        if (usuario != null) {
            return usuario;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("nombre=");
        msg.append(nombre);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUsuarioException(msg.toString());
    }

    /**
     * Returns the last usuario in the ordered set where nombre LIKE &#63;.
     *
     * @param nombre the nombre
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching usuario, or <code>null</code> if a matching usuario could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario fetchByNombreKeyWord_Last(String nombre,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByNombreKeyWord(nombre);

        if (count == 0) {
            return null;
        }

        List<Usuario> list = findByNombreKeyWord(nombre, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the usuarios before and after the current usuario in the ordered set where nombre LIKE &#63;.
     *
     * @param usuarioId the primary key of the current usuario
     * @param nombre the nombre
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next usuario
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException if a usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario[] findByNombreKeyWord_PrevAndNext(long usuarioId,
        String nombre, OrderByComparator orderByComparator)
        throws NoSuchUsuarioException, SystemException {
        Usuario usuario = findByPrimaryKey(usuarioId);

        Session session = null;

        try {
            session = openSession();

            Usuario[] array = new UsuarioImpl[3];

            array[0] = getByNombreKeyWord_PrevAndNext(session, usuario, nombre,
                    orderByComparator, true);

            array[1] = usuario;

            array[2] = getByNombreKeyWord_PrevAndNext(session, usuario, nombre,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Usuario getByNombreKeyWord_PrevAndNext(Session session,
        Usuario usuario, String nombre, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_USUARIO_WHERE);

        boolean bindNombre = false;

        if (nombre == null) {
            query.append(_FINDER_COLUMN_NOMBREKEYWORD_NOMBRE_1);
        } else if (nombre.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_NOMBREKEYWORD_NOMBRE_3);
        } else {
            bindNombre = true;

            query.append(_FINDER_COLUMN_NOMBREKEYWORD_NOMBRE_2);
        }

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
            query.append(UsuarioModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindNombre) {
            qPos.add(nombre);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(usuario);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Usuario> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the usuarios where nombre LIKE &#63; from the database.
     *
     * @param nombre the nombre
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByNombreKeyWord(String nombre) throws SystemException {
        for (Usuario usuario : findByNombreKeyWord(nombre, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(usuario);
        }
    }

    /**
     * Returns the number of usuarios where nombre LIKE &#63;.
     *
     * @param nombre the nombre
     * @return the number of matching usuarios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByNombreKeyWord(String nombre) throws SystemException {
        FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_NOMBREKEYWORD;

        Object[] finderArgs = new Object[] { nombre };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_USUARIO_WHERE);

            boolean bindNombre = false;

            if (nombre == null) {
                query.append(_FINDER_COLUMN_NOMBREKEYWORD_NOMBRE_1);
            } else if (nombre.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NOMBREKEYWORD_NOMBRE_3);
            } else {
                bindNombre = true;

                query.append(_FINDER_COLUMN_NOMBREKEYWORD_NOMBRE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindNombre) {
                    qPos.add(nombre);
                }

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
     * Caches the usuario in the entity cache if it is enabled.
     *
     * @param usuario the usuario
     */
    @Override
    public void cacheResult(Usuario usuario) {
        EntityCacheUtil.putResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioImpl.class, usuario.getPrimaryKey(), usuario);

        usuario.resetOriginalValues();
    }

    /**
     * Caches the usuarios in the entity cache if it is enabled.
     *
     * @param usuarios the usuarios
     */
    @Override
    public void cacheResult(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            if (EntityCacheUtil.getResult(
                        UsuarioModelImpl.ENTITY_CACHE_ENABLED,
                        UsuarioImpl.class, usuario.getPrimaryKey()) == null) {
                cacheResult(usuario);
            } else {
                usuario.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all usuarios.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(UsuarioImpl.class.getName());
        }

        EntityCacheUtil.clearCache(UsuarioImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the usuario.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Usuario usuario) {
        EntityCacheUtil.removeResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioImpl.class, usuario.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Usuario> usuarios) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Usuario usuario : usuarios) {
            EntityCacheUtil.removeResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
                UsuarioImpl.class, usuario.getPrimaryKey());
        }
    }

    /**
     * Creates a new usuario with the primary key. Does not add the usuario to the database.
     *
     * @param usuarioId the primary key for the new usuario
     * @return the new usuario
     */
    @Override
    public Usuario create(long usuarioId) {
        Usuario usuario = new UsuarioImpl();

        usuario.setNew(true);
        usuario.setPrimaryKey(usuarioId);

        return usuario;
    }

    /**
     * Removes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param usuarioId the primary key of the usuario
     * @return the usuario that was removed
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException if a usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario remove(long usuarioId)
        throws NoSuchUsuarioException, SystemException {
        return remove((Serializable) usuarioId);
    }

    /**
     * Removes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the usuario
     * @return the usuario that was removed
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException if a usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario remove(Serializable primaryKey)
        throws NoSuchUsuarioException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Usuario usuario = (Usuario) session.get(UsuarioImpl.class,
                    primaryKey);

            if (usuario == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(usuario);
        } catch (NoSuchUsuarioException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Usuario removeImpl(Usuario usuario) throws SystemException {
        usuario = toUnwrappedModel(usuario);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(usuario)) {
                usuario = (Usuario) session.get(UsuarioImpl.class,
                        usuario.getPrimaryKeyObj());
            }

            if (usuario != null) {
                session.delete(usuario);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (usuario != null) {
            clearCache(usuario);
        }

        return usuario;
    }

    @Override
    public Usuario updateImpl(
        ec.com.smx.portal.rrhh.services.model.Usuario usuario)
        throws SystemException {
        usuario = toUnwrappedModel(usuario);

        boolean isNew = usuario.isNew();

        Session session = null;

        try {
            session = openSession();

            if (usuario.isNew()) {
                session.save(usuario);

                usuario.setNew(false);
            } else {
                session.merge(usuario);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !UsuarioModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioImpl.class, usuario.getPrimaryKey(), usuario);

        return usuario;
    }

    protected Usuario toUnwrappedModel(Usuario usuario) {
        if (usuario instanceof UsuarioImpl) {
            return usuario;
        }

        UsuarioImpl usuarioImpl = new UsuarioImpl();

        usuarioImpl.setNew(usuario.isNew());
        usuarioImpl.setPrimaryKey(usuario.getPrimaryKey());

        usuarioImpl.setUsuarioId(usuario.getUsuarioId());
        usuarioImpl.setNombre(usuario.getNombre());
        usuarioImpl.setRoleId(usuario.getRoleId());

        return usuarioImpl;
    }

    /**
     * Returns the usuario with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the usuario
     * @return the usuario
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException if a usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario findByPrimaryKey(Serializable primaryKey)
        throws NoSuchUsuarioException, SystemException {
        Usuario usuario = fetchByPrimaryKey(primaryKey);

        if (usuario == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return usuario;
    }

    /**
     * Returns the usuario with the primary key or throws a {@link ec.com.smx.portal.rrhh.services.NoSuchUsuarioException} if it could not be found.
     *
     * @param usuarioId the primary key of the usuario
     * @return the usuario
     * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException if a usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario findByPrimaryKey(long usuarioId)
        throws NoSuchUsuarioException, SystemException {
        return findByPrimaryKey((Serializable) usuarioId);
    }

    /**
     * Returns the usuario with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the usuario
     * @return the usuario, or <code>null</code> if a usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Usuario usuario = (Usuario) EntityCacheUtil.getResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
                UsuarioImpl.class, primaryKey);

        if (usuario == _nullUsuario) {
            return null;
        }

        if (usuario == null) {
            Session session = null;

            try {
                session = openSession();

                usuario = (Usuario) session.get(UsuarioImpl.class, primaryKey);

                if (usuario != null) {
                    cacheResult(usuario);
                } else {
                    EntityCacheUtil.putResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
                        UsuarioImpl.class, primaryKey, _nullUsuario);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
                    UsuarioImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return usuario;
    }

    /**
     * Returns the usuario with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param usuarioId the primary key of the usuario
     * @return the usuario, or <code>null</code> if a usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario fetchByPrimaryKey(long usuarioId) throws SystemException {
        return fetchByPrimaryKey((Serializable) usuarioId);
    }

    /**
     * Returns all the usuarios.
     *
     * @return the usuarios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Usuario> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the usuarios.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of usuarios
     * @param end the upper bound of the range of usuarios (not inclusive)
     * @return the range of usuarios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Usuario> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the usuarios.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of usuarios
     * @param end the upper bound of the range of usuarios (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of usuarios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Usuario> findAll(int start, int end,
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

        List<Usuario> list = (List<Usuario>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_USUARIO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_USUARIO;

                if (pagination) {
                    sql = sql.concat(UsuarioModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Usuario>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Usuario>(list);
                } else {
                    list = (List<Usuario>) QueryUtil.list(q, getDialect(),
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
     * Removes all the usuarios from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Usuario usuario : findAll()) {
            remove(usuario);
        }
    }

    /**
     * Returns the number of usuarios.
     *
     * @return the number of usuarios
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

                Query q = session.createQuery(_SQL_COUNT_USUARIO);

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
     * Initializes the usuario persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ec.com.smx.portal.rrhh.services.model.Usuario")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Usuario>> listenersList = new ArrayList<ModelListener<Usuario>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Usuario>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(UsuarioImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
