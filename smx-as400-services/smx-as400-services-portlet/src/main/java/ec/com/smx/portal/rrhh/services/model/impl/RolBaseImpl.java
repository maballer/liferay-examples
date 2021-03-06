package ec.com.smx.portal.rrhh.services.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import ec.com.smx.portal.rrhh.services.model.Rol;
import ec.com.smx.portal.rrhh.services.service.RolLocalServiceUtil;

/**
 * The extended model base implementation for the Rol service. Represents a row in the &quot;rolid&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RolImpl}.
 * </p>
 *
 * @author maballe
 * @see RolImpl
 * @see ec.com.smx.portal.rrhh.services.model.Rol
 * @generated
 */
public abstract class RolBaseImpl extends RolModelImpl implements Rol {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a rol model instance should use the {@link Rol} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RolLocalServiceUtil.addRol(this);
        } else {
            RolLocalServiceUtil.updateRol(this);
        }
    }
}
