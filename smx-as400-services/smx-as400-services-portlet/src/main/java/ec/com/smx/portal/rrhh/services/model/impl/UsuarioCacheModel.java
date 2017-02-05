package ec.com.smx.portal.rrhh.services.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ec.com.smx.portal.rrhh.services.model.Usuario;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Usuario in entity cache.
 *
 * @author maballe
 * @see Usuario
 * @generated
 */
public class UsuarioCacheModel implements CacheModel<Usuario>, Externalizable {
    public long usuarioId;
    public String nombre;
    public long roleId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{usuarioId=");
        sb.append(usuarioId);
        sb.append(", nombre=");
        sb.append(nombre);
        sb.append(", roleId=");
        sb.append(roleId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Usuario toEntityModel() {
        UsuarioImpl usuarioImpl = new UsuarioImpl();

        usuarioImpl.setUsuarioId(usuarioId);

        if (nombre == null) {
            usuarioImpl.setNombre(StringPool.BLANK);
        } else {
            usuarioImpl.setNombre(nombre);
        }

        usuarioImpl.setRoleId(roleId);

        usuarioImpl.resetOriginalValues();

        return usuarioImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        usuarioId = objectInput.readLong();
        nombre = objectInput.readUTF();
        roleId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(usuarioId);

        if (nombre == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nombre);
        }

        objectOutput.writeLong(roleId);
    }
}
