package ec.com.smx.portal.rrhh.services.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ec.com.smx.portal.rrhh.services.model.UsuarioRol;

import java.util.List;

/**
 * The persistence utility for the usuario rol service. This utility wraps {@link UsuarioRolPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author maballe
 * @see UsuarioRolPersistence
 * @see UsuarioRolPersistenceImpl
 * @generated
 */
public class UsuarioRolUtil {
    private static UsuarioRolPersistence _persistence;

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
    public static void clearCache(UsuarioRol usuarioRol) {
        getPersistence().clearCache(usuarioRol);
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
    public static List<UsuarioRol> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<UsuarioRol> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<UsuarioRol> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static UsuarioRol update(UsuarioRol usuarioRol)
        throws SystemException {
        return getPersistence().update(usuarioRol);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static UsuarioRol update(UsuarioRol usuarioRol,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(usuarioRol, serviceContext);
    }

    /**
    * Returns all the usuario rols where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @return the matching usuario rols
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findByUsuarioId(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUsuarioId(usuarioId);
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
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findByUsuarioId(
        long usuarioId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUsuarioId(usuarioId, start, end);
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
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findByUsuarioId(
        long usuarioId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUsuarioId(usuarioId, start, end, orderByComparator);
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
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol findByUsuarioId_First(
        long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException {
        return getPersistence()
                   .findByUsuarioId_First(usuarioId, orderByComparator);
    }

    /**
    * Returns the first usuario rol in the ordered set where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching usuario rol, or <code>null</code> if a matching usuario rol could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol fetchByUsuarioId_First(
        long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUsuarioId_First(usuarioId, orderByComparator);
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
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol findByUsuarioId_Last(
        long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException {
        return getPersistence()
                   .findByUsuarioId_Last(usuarioId, orderByComparator);
    }

    /**
    * Returns the last usuario rol in the ordered set where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching usuario rol, or <code>null</code> if a matching usuario rol could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol fetchByUsuarioId_Last(
        long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUsuarioId_Last(usuarioId, orderByComparator);
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
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol[] findByUsuarioId_PrevAndNext(
        long UsuarioRolId, long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException {
        return getPersistence()
                   .findByUsuarioId_PrevAndNext(UsuarioRolId, usuarioId,
            orderByComparator);
    }

    /**
    * Removes all the usuario rols where usuarioId = &#63; from the database.
    *
    * @param usuarioId the usuario ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUsuarioId(long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUsuarioId(usuarioId);
    }

    /**
    * Returns the number of usuario rols where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @return the number of matching usuario rols
    * @throws SystemException if a system exception occurred
    */
    public static int countByUsuarioId(long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUsuarioId(usuarioId);
    }

    /**
    * Returns all the usuario rols where rolId = &#63;.
    *
    * @param rolId the rol ID
    * @return the matching usuario rols
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findByRolId(
        long rolId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRolId(rolId);
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
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findByRolId(
        long rolId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRolId(rolId, start, end);
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
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findByRolId(
        long rolId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRolId(rolId, start, end, orderByComparator);
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
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol findByRolId_First(
        long rolId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException {
        return getPersistence().findByRolId_First(rolId, orderByComparator);
    }

    /**
    * Returns the first usuario rol in the ordered set where rolId = &#63;.
    *
    * @param rolId the rol ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching usuario rol, or <code>null</code> if a matching usuario rol could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol fetchByRolId_First(
        long rolId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByRolId_First(rolId, orderByComparator);
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
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol findByRolId_Last(
        long rolId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException {
        return getPersistence().findByRolId_Last(rolId, orderByComparator);
    }

    /**
    * Returns the last usuario rol in the ordered set where rolId = &#63;.
    *
    * @param rolId the rol ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching usuario rol, or <code>null</code> if a matching usuario rol could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol fetchByRolId_Last(
        long rolId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByRolId_Last(rolId, orderByComparator);
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
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol[] findByRolId_PrevAndNext(
        long UsuarioRolId, long rolId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException {
        return getPersistence()
                   .findByRolId_PrevAndNext(UsuarioRolId, rolId,
            orderByComparator);
    }

    /**
    * Removes all the usuario rols where rolId = &#63; from the database.
    *
    * @param rolId the rol ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByRolId(long rolId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByRolId(rolId);
    }

    /**
    * Returns the number of usuario rols where rolId = &#63;.
    *
    * @param rolId the rol ID
    * @return the number of matching usuario rols
    * @throws SystemException if a system exception occurred
    */
    public static int countByRolId(long rolId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByRolId(rolId);
    }

    /**
    * Caches the usuario rol in the entity cache if it is enabled.
    *
    * @param usuarioRol the usuario rol
    */
    public static void cacheResult(
        ec.com.smx.portal.rrhh.services.model.UsuarioRol usuarioRol) {
        getPersistence().cacheResult(usuarioRol);
    }

    /**
    * Caches the usuario rols in the entity cache if it is enabled.
    *
    * @param usuarioRols the usuario rols
    */
    public static void cacheResult(
        java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> usuarioRols) {
        getPersistence().cacheResult(usuarioRols);
    }

    /**
    * Creates a new usuario rol with the primary key. Does not add the usuario rol to the database.
    *
    * @param UsuarioRolId the primary key for the new usuario rol
    * @return the new usuario rol
    */
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol create(
        long UsuarioRolId) {
        return getPersistence().create(UsuarioRolId);
    }

    /**
    * Removes the usuario rol with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param UsuarioRolId the primary key of the usuario rol
    * @return the usuario rol that was removed
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a usuario rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol remove(
        long UsuarioRolId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException {
        return getPersistence().remove(UsuarioRolId);
    }

    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol updateImpl(
        ec.com.smx.portal.rrhh.services.model.UsuarioRol usuarioRol)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(usuarioRol);
    }

    /**
    * Returns the usuario rol with the primary key or throws a {@link ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException} if it could not be found.
    *
    * @param UsuarioRolId the primary key of the usuario rol
    * @return the usuario rol
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException if a usuario rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol findByPrimaryKey(
        long UsuarioRolId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioRolException {
        return getPersistence().findByPrimaryKey(UsuarioRolId);
    }

    /**
    * Returns the usuario rol with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param UsuarioRolId the primary key of the usuario rol
    * @return the usuario rol, or <code>null</code> if a usuario rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol fetchByPrimaryKey(
        long UsuarioRolId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(UsuarioRolId);
    }

    /**
    * Returns all the usuario rols.
    *
    * @return the usuario rols
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the usuario rols from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of usuario rols.
    *
    * @return the number of usuario rols
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static UsuarioRolPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (UsuarioRolPersistence) PortletBeanLocatorUtil.locate(ec.com.smx.portal.rrhh.services.service.ClpSerializer.getServletContextName(),
                    UsuarioRolPersistence.class.getName());

            ReferenceRegistry.registerReference(UsuarioRolUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(UsuarioRolPersistence persistence) {
    }
}
