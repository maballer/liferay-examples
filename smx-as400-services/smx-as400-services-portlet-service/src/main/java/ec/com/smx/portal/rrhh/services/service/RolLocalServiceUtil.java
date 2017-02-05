package ec.com.smx.portal.rrhh.services.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Rol. This utility wraps
 * {@link ec.com.smx.portal.rrhh.services.service.impl.RolLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author maballe
 * @see RolLocalService
 * @see ec.com.smx.portal.rrhh.services.service.base.RolLocalServiceBaseImpl
 * @see ec.com.smx.portal.rrhh.services.service.impl.RolLocalServiceImpl
 * @generated
 */
public class RolLocalServiceUtil {
    private static RolLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link ec.com.smx.portal.rrhh.services.service.impl.RolLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the rol to the database. Also notifies the appropriate model listeners.
    *
    * @param rol the rol
    * @return the rol that was added
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.Rol addRol(
        ec.com.smx.portal.rrhh.services.model.Rol rol)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addRol(rol);
    }

    /**
    * Creates a new rol with the primary key. Does not add the rol to the database.
    *
    * @param rolId the primary key for the new rol
    * @return the new rol
    */
    public static ec.com.smx.portal.rrhh.services.model.Rol createRol(
        long rolId) {
        return getService().createRol(rolId);
    }

    /**
    * Deletes the rol with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rolId the primary key of the rol
    * @return the rol that was removed
    * @throws PortalException if a rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.Rol deleteRol(
        long rolId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRol(rolId);
    }

    /**
    * Deletes the rol from the database. Also notifies the appropriate model listeners.
    *
    * @param rol the rol
    * @return the rol that was removed
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.Rol deleteRol(
        ec.com.smx.portal.rrhh.services.model.Rol rol)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRol(rol);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.RolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.RolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static ec.com.smx.portal.rrhh.services.model.Rol fetchRol(long rolId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRol(rolId);
    }

    /**
    * Returns the rol with the primary key.
    *
    * @param rolId the primary key of the rol
    * @return the rol
    * @throws PortalException if a rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.Rol getRol(long rolId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRol(rolId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.Rol> getRols(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRols(start, end);
    }

    /**
    * Returns the number of rols.
    *
    * @return the number of rols
    * @throws SystemException if a system exception occurred
    */
    public static int getRolsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRolsCount();
    }

    /**
    * Updates the rol in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param rol the rol
    * @return the rol that was updated
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.Rol updateRol(
        ec.com.smx.portal.rrhh.services.model.Rol rol)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateRol(rol);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Returns all the rols.
    *
    * @return the rols
    * @throws SystemException
    if a system exception occurred
    */
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.Rol> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findAll();
    }

    public static void clearService() {
        _service = null;
    }

    public static RolLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    RolLocalService.class.getName());

            if (invokableLocalService instanceof RolLocalService) {
                _service = (RolLocalService) invokableLocalService;
            } else {
                _service = new RolLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(RolLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RolLocalService service) {
    }
}
