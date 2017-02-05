package ec.com.smx.portal.rrhh.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ec.com.smx.portal.rrhh.services.model.UsuarioRol;
import ec.com.smx.portal.rrhh.services.service.UsuarioRolLocalServiceUtil;

/**
 * @author maballe
 * @generated
 */
public abstract class UsuarioRolActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UsuarioRolActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UsuarioRolLocalServiceUtil.getService());
        setClass(UsuarioRol.class);

        setClassLoader(ec.com.smx.portal.rrhh.services.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("UsuarioRolId");
    }
}
