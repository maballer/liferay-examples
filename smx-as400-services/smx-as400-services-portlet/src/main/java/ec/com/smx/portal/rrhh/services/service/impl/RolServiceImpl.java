package ec.com.smx.portal.rrhh.services.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.RoleLocalServiceUtil;

import ec.com.smx.portal.rrhh.services.model.Rol;
import ec.com.smx.portal.rrhh.services.service.RolLocalServiceUtil;
import ec.com.smx.portal.rrhh.services.service.base.RolServiceBaseImpl;

/**
 * The implementation of the rol remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ec.com.smx.portal.rrhh.services.service.RolService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author maballe
 * @see ec.com.smx.portal.rrhh.services.service.base.RolServiceBaseImpl
 * @see ec.com.smx.portal.rrhh.services.service.RolServiceUtil
 */
public class RolServiceImpl extends RolServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link ec.com.smx.portal.rrhh.services.service.RolServiceUtil} to access the rol remote service.
     */
	/**
	 * Returns all the rols.
	 *
	 * @return the rols
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public List<Rol> findAll() throws SystemException {
		return RolLocalServiceUtil.findAll();
	}
}
