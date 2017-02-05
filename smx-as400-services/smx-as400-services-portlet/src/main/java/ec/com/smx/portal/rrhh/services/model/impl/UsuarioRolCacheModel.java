package ec.com.smx.portal.rrhh.services.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import ec.com.smx.portal.rrhh.services.model.UsuarioRol;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UsuarioRol in entity cache.
 *
 * @author maballe
 * @see UsuarioRol
 * @generated
 */
public class UsuarioRolCacheModel implements CacheModel<UsuarioRol>,
    Externalizable {
    public long UsuarioRolId;
    public long usuarioId;
    public long rolId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{UsuarioRolId=");
        sb.append(UsuarioRolId);
        sb.append(", usuarioId=");
        sb.append(usuarioId);
        sb.append(", rolId=");
        sb.append(rolId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public UsuarioRol toEntityModel() {
        UsuarioRolImpl usuarioRolImpl = new UsuarioRolImpl();

        usuarioRolImpl.setUsuarioRolId(UsuarioRolId);
        usuarioRolImpl.setUsuarioId(usuarioId);
        usuarioRolImpl.setRolId(rolId);

        usuarioRolImpl.resetOriginalValues();

        return usuarioRolImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        UsuarioRolId = objectInput.readLong();
        usuarioId = objectInput.readLong();
        rolId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(UsuarioRolId);
        objectOutput.writeLong(usuarioId);
        objectOutput.writeLong(rolId);
    }
}
