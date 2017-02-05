package ec.com.smx.portal.rrhh.services.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import ec.com.smx.portal.rrhh.services.model.Rol;
import ec.com.smx.portal.rrhh.services.service.base.RolLocalServiceBaseImpl;

/**
 * The implementation of the rol local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link ec.com.smx.portal.rrhh.services.service.RolLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author maballe
 * @see ec.com.smx.portal.rrhh.services.service.base.RolLocalServiceBaseImpl
 * @see ec.com.smx.portal.rrhh.services.service.RolLocalServiceUtil
 */
public class RolLocalServiceImpl extends RolLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * ec.com.smx.portal.rrhh.services.service.RolLocalServiceUtil} to access
	 * the rol local service.
	 */
	/**
	 * Returns all the rols.
	 *
	 * @return the rols
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public List<Rol> findAll() throws SystemException {
		return rolPersistence.findAll();
	}
}
