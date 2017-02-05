package ec.com.smx.portal.rrhh.services.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import ec.com.smx.portal.rrhh.services.NoSuchUsuarioException;
import ec.com.smx.portal.rrhh.services.model.Usuario;
import ec.com.smx.portal.rrhh.services.service.UsuarioLocalServiceUtil;
import ec.com.smx.portal.rrhh.services.service.base.UsuarioServiceBaseImpl;

/**
 * The implementation of the usuario remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link ec.com.smx.portal.rrhh.services.service.UsuarioService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author maballe
 * @see ec.com.smx.portal.rrhh.services.service.base.UsuarioServiceBaseImpl
 * @see ec.com.smx.portal.rrhh.services.service.UsuarioServiceUtil
 */
public class UsuarioServiceImpl extends UsuarioServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * ec.com.smx.portal.rrhh.services.service.UsuarioServiceUtil} to access the
	 * usuario remote service.
	 */
	/**
	 * Returns all the usuarios.
	 *
	 * @return the usuarios
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public List<Usuario> search() throws SystemException {
		return UsuarioLocalServiceUtil.findAll();
	}

	/**
	 * Returns the usuario with the primary key or throws a
	 * {@link ec.com.smx.portal.rrhh.services.NoSuchUsuarioException} if it
	 * could not be found.
	 *
	 * @param usuarioId
	 *            the primary key of the usuario
	 * @return the usuario
	 * @throws ec.com.smx.portal.rrhh.services.NoSuchUsuarioException
	 *             if a usuario with the primary key could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */

	public Usuario getUsuario(long usuarioId) throws NoSuchUsuarioException,
			SystemException {
		return UsuarioLocalServiceUtil.findByPrimaryKey(usuarioId);
	}

	/**
	 * Returns the number of usuarios.
	 *
	 * @return the number of usuarios
	 * @throws SystemException
	 *             if a system exception occurred
	 */

	public int count() throws SystemException {
		return UsuarioLocalServiceUtil.countAll();
	}

//	public List<Usuario> searchNameByKeyWord(String nombre)
//			throws SystemException {
//		return UsuarioLocalServiceUtil.findByfindNombreByKeyWord(nombre);
//	}

	public String getHola(String text) {
		if (text != null)
			text = "hola";
		return text;
	}

}
