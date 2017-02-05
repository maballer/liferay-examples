package ec.com.smx.portal.rrhh.services.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for Usuario. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author maballe
 * @see UsuarioServiceUtil
 * @see ec.com.smx.portal.rrhh.services.service.base.UsuarioServiceBaseImpl
 * @see ec.com.smx.portal.rrhh.services.service.impl.UsuarioServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface UsuarioService extends BaseService, InvokableService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link UsuarioServiceUtil} to access the usuario remote service. Add custom service methods to {@link ec.com.smx.portal.rrhh.services.service.impl.UsuarioServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    /**
    * Returns all the usuarios.
    *
    * @return the usuarios
    * @throws SystemException
    if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<ec.com.smx.portal.rrhh.services.model.Usuario> search()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the usuario with the primary key or throws a
    * {@link ec.com.smx.portal.rrhh.services.NoSuchUsuarioException} if it
    * could not be found.
    *
    * @param usuarioId
    the primary key of the usuario
    * @return the usuario
    * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException
    if a usuario with the primary key could not be found
    * @throws SystemException
    if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public ec.com.smx.portal.rrhh.services.model.Usuario getUsuario(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ec.com.smx.portal.rrhh.services.NoSuchUsuarioException;

    /**
    * Returns the number of usuarios.
    *
    * @return the number of usuarios
    * @throws SystemException
    if a system exception occurred
    */
    public int count()
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.lang.String getHola(java.lang.String text);
}
