package ec.com.smx.portal.rrhh.services.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ec.com.smx.portal.rrhh.services.model.Rol;

import java.util.List;

/**
 * The persistence utility for the rol service. This utility wraps {@link RolPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author maballe
 * @see RolPersistence
 * @see RolPersistenceImpl
 * @generated
 */
public class RolUtil {
    private static RolPersistence _persistence;

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
    public static void clearCache(Rol rol) {
        getPersistence().clearCache(rol);
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
    public static List<Rol> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Rol> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Rol> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Rol update(Rol rol) throws SystemException {
        return getPersistence().update(rol);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Rol update(Rol rol, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(rol, serviceContext);
    }

    /**
    * Caches the rol in the entity cache if it is enabled.
    *
    * @param rol the rol
    */
    public static void cacheResult(
        ec.com.smx.portal.rrhh.services.model.Rol rol) {
        getPersistence().cacheResult(rol);
    }

    /**
    * Caches the rols in the entity cache if it is enabled.
    *
    * @param rols the rols
    */
    public static void cacheResult(
        java.util.List<ec.com.smx.portal.rrhh.services.model.Rol> rols) {
        getPersistence().cacheResult(rols);
    }

    /**
    * Creates a new rol with the primary key. Does not add the rol to the database.
    *
    * @param rolId the primary key for the new rol
    * @return the new rol
    */
    public static ec.com.smx.portal.rrhh.services.model.Rol create(long rolId) {
        return getPersistence().create(rolId);
    }

    /**
    * Removes the rol with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rolId the primary key of the rol
    * @return the rol that was removed
    * @throws ec.com.smx.portal.rrhh.services.NoSuchRolException if a rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.Rol remove(long rolId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchRolException {
        return getPersistence().remove(rolId);
    }

    public static ec.com.smx.portal.rrhh.services.model.Rol updateImpl(
        ec.com.smx.portal.rrhh.services.model.Rol rol)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(rol);
    }

    /**
    * Returns the rol with the primary key or throws a {@link ec.com.smx.portal.rrhh.services.NoSuchRolException} if it could not be found.
    *
    * @param rolId the primary key of the rol
    * @return the rol
    * @throws ec.com.smx.portal.rrhh.services.NoSuchRolException if a rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.Rol findByPrimaryKey(
        long rolId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchRolException {
        return getPersistence().findByPrimaryKey(rolId);
    }

    /**
    * Returns the rol with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param rolId the primary key of the rol
    * @return the rol, or <code>null</code> if a rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.Rol fetchByPrimaryKey(
        long rolId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(rolId);
    }

    /**
    * Returns all the rols.
    *
    * @return the rols
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.Rol> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.Rol> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.Rol> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the rols from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of rols.
    *
    * @return the number of rols
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static RolPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (RolPersistence) PortletBeanLocatorUtil.locate(ec.com.smx.portal.rrhh.services.service.ClpSerializer.getServletContextName(),
                    RolPersistence.class.getName());

            ReferenceRegistry.registerReference(RolUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(RolPersistence persistence) {
    }
}
