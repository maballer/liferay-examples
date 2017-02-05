package ec.com.smx.portal.rrhh.services.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for UsuarioRol. This utility wraps
 * {@link ec.com.smx.portal.rrhh.services.service.impl.UsuarioRolLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author maballe
 * @see UsuarioRolLocalService
 * @see ec.com.smx.portal.rrhh.services.service.base.UsuarioRolLocalServiceBaseImpl
 * @see ec.com.smx.portal.rrhh.services.service.impl.UsuarioRolLocalServiceImpl
 * @generated
 */
public class UsuarioRolLocalServiceUtil {
    private static UsuarioRolLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link ec.com.smx.portal.rrhh.services.service.impl.UsuarioRolLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the usuario rol to the database. Also notifies the appropriate model listeners.
    *
    * @param usuarioRol the usuario rol
    * @return the usuario rol that was added
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol addUsuarioRol(
        ec.com.smx.portal.rrhh.services.model.UsuarioRol usuarioRol)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addUsuarioRol(usuarioRol);
    }

    /**
    * Creates a new usuario rol with the primary key. Does not add the usuario rol to the database.
    *
    * @param UsuarioRolId the primary key for the new usuario rol
    * @return the new usuario rol
    */
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol createUsuarioRol(
        long UsuarioRolId) {
        return getService().createUsuarioRol(UsuarioRolId);
    }

    /**
    * Deletes the usuario rol with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param UsuarioRolId the primary key of the usuario rol
    * @return the usuario rol that was removed
    * @throws PortalException if a usuario rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol deleteUsuarioRol(
        long UsuarioRolId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteUsuarioRol(UsuarioRolId);
    }

    /**
    * Deletes the usuario rol from the database. Also notifies the appropriate model listeners.
    *
    * @param usuarioRol the usuario rol
    * @return the usuario rol that was removed
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol deleteUsuarioRol(
        ec.com.smx.portal.rrhh.services.model.UsuarioRol usuarioRol)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteUsuarioRol(usuarioRol);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioRolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ec.com.smx.portal.rrhh.services.model.impl.UsuarioRolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol fetchUsuarioRol(
        long UsuarioRolId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchUsuarioRol(UsuarioRolId);
    }

    /**
    * Returns the usuario rol with the primary key.
    *
    * @param UsuarioRolId the primary key of the usuario rol
    * @return the usuario rol
    * @throws PortalException if a usuario rol with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol getUsuarioRol(
        long UsuarioRolId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getUsuarioRol(UsuarioRolId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<ec.com.smx.portal.rrhh.services.model.UsuarioRol> getUsuarioRols(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getUsuarioRols(start, end);
    }

    /**
    * Returns the number of usuario rols.
    *
    * @return the number of usuario rols
    * @throws SystemException if a system exception occurred
    */
    public static int getUsuarioRolsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getUsuarioRolsCount();
    }

    /**
    * Updates the usuario rol in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param usuarioRol the usuario rol
    * @return the usuario rol that was updated
    * @throws SystemException if a system exception occurred
    */
    public static ec.com.smx.portal.rrhh.services.model.UsuarioRol updateUsuarioRol(
        ec.com.smx.portal.rrhh.services.model.UsuarioRol usuarioRol)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateUsuarioRol(usuarioRol);
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

    public static void clearService() {
        _service = null;
    }

    public static UsuarioRolLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    UsuarioRolLocalService.class.getName());

            if (invokableLocalService instanceof UsuarioRolLocalService) {
                _service = (UsuarioRolLocalService) invokableLocalService;
            } else {
                _service = new UsuarioRolLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(UsuarioRolLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(UsuarioRolLocalService service) {
    }
}
