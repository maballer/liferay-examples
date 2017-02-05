package ec.com.smx.portal.rrhh.services.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ec.com.smx.portal.rrhh.services.model.Usuario;

import java.util.List;

/**
 * The persistence utility for the usuario service. This utility wraps {@link UsuarioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author maballe
 * @see UsuarioPersistence
 * @see UsuarioPersistenceImpl
 * @generated
 */
public class UsuarioUtil {
    private static UsuarioPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Usuario usuario) {
        getPersistence().clearCache(usuario);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Usuario> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Usuario> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Usuario> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Usuario update(Usuario usuario) throws SystemException {
        return getPersistence().update(usuario);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Usuario update(Usuario usuario, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(usuario, serviceContext);
    }

    /**
    * Returns all the usuarios where nombre LIKE &#63;.
    *
    * @param nombre the nombre
    * @return the matching usuarios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> findByNombreKeyWord(
        java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNombreKeyWord(nombre);
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
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> findByNombreKeyWord(
        java.lang.String nombre, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNombreKeyWord(nombre, start, end);
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
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> findByNombreKeyWord(
        java.lang.String nombre, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNombreKeyWord(nombre, start, end, orderByComparator);
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
    public static ec.com.smx.portal.rrhh.services.model.Usuario findByNombreKeyWord_First(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioException {
        return getPersistence()
                   .findByNombreKeyWord_First(nombre, orderByComparator);
    }

    /**
    * Returns the first usuario in the ordered set where nombre LIKE &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching usuario, or <code>null</code> if a matching usuario could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.Usuario fetchByNombreKeyWord_First(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByNombreKeyWord_First(nombre, orderByComparator);
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
    public static ec.com.smx.portal.rrhh.services.model.Usuario findByNombreKeyWord_Last(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioException {
        return getPersistence()
                   .findByNombreKeyWord_Last(nombre, orderByComparator);
    }

    /**
    * Returns the last usuario in the ordered set where nombre LIKE &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching usuario, or <code>null</code> if a matching usuario could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.Usuario fetchByNombreKeyWord_Last(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByNombreKeyWord_Last(nombre, orderByComparator);
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
    public static ec.com.smx.portal.rrhh.services.model.Usuario[] findByNombreKeyWord_PrevAndNext(
        long usuarioId, java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioException {
        return getPersistence()
                   .findByNombreKeyWord_PrevAndNext(usuarioId, nombre,
            orderByComparator);
    }

    /**
    * Removes all the usuarios where nombre LIKE &#63; from the database.
    *
    * @param nombre the nombre
    * @throws SystemException if a system exception occurred
    */
    public static void removeByNombreKeyWord(java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByNombreKeyWord(nombre);
    }

    /**
    * Returns the number of usuarios where nombre LIKE &#63;.
    *
    * @param nombre the nombre
    * @return the number of matching usuarios
    * @throws SystemException if a system exception occurred
    */
    public static int countByNombreKeyWord(java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByNombreKeyWord(nombre);
    }

    /**
    * Caches the usuario in the entity cache if it is enabled.
    *
    * @param usuario the usuario
    */
    public static void cacheResult(
        ec.com.smx.portal.rrhh.services.model.Usuario usuario) {
        getPersistence().cacheResult(usuario);
    }

    /**
    * Caches the usuarios in the entity cache if it is enabled.
    *
    * @param usuarios the usuarios
    */
    public static void cacheResult(
        java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> usuarios) {
        getPersistence().cacheResult(usuarios);
    }

    /**
    * Creates a new usuario with the primary key. Does not add the usuario to the database.
    *
    * @param usuarioId the primary key for the new usuario
    * @return the new usuario
    */
    public static ec.com.smx.portal.rrhh.services.model.Usuario create(
        long usuarioId) {
        return getPersistence().create(usuarioId);
    }

    /**
    * Removes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param usuarioId the primary key of the usuario
    * @return the usuario that was removed
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException if a usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.Usuario remove(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioException {
        return getPersistence().remove(usuarioId);
    }

    public static ec.com.smx.portal.rrhh.services.model.Usuario updateImpl(
        ec.com.smx.portal.rrhh.services.model.Usuario usuario)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(usuario);
    }

    /**
    * Returns the usuario with the primary key or throws a {@link ec.com.smx.portal.rrhh.services.NoSuchUsuarioException} if it could not be found.
    *
    * @param usuarioId the primary key of the usuario
    * @return the usuario
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException if a usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.Usuario findByPrimaryKey(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioException {
        return getPersistence().findByPrimaryKey(usuarioId);
    }

    /**
    * Returns the usuario with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param usuarioId the primary key of the usuario
    * @return the usuario, or <code>null</code> if a usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.Usuario fetchByPrimaryKey(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(usuarioId);
    }

    /**
    * Returns all the usuarios.
    *
    * @return the usuarios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the usuarios from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of usuarios.
    *
    * @return the number of usuarios
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static UsuarioPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (UsuarioPersistence) PortletBeanLocatorUtil.locate(ec.com.smx.portal.rrhh.services.service.ClpSerializer.getServletContextName(),
                    UsuarioPersistence.class.getName());

            ReferenceRegistry.registerReference(UsuarioUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(UsuarioPersistence persistence) {
    }
}
