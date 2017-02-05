package ec.com.smx.portal.rrhh.services.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ec.com.smx.portal.rrhh.services.model.Rol;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Rol in entity cache.
 *
 * @author maballe
 * @see Rol
 * @generated
 */
public class RolCacheModel implements CacheModel<Rol>, Externalizable {
    public long rolId;
    public String nombre;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{rolId=");
        sb.append(rolId);
        sb.append(", nombre=");
        sb.append(nombre);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Rol toEntityModel() {
        RolImpl rolImpl = new RolImpl();

        rolImpl.setRolId(rolId);

        if (nombre == null) {
            rolImpl.setNombre(StringPool.BLANK);
        } else {
            rolImpl.setNombre(nombre);
        }

        rolImpl.resetOriginalValues();

        return rolImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        rolId = objectInput.readLong();
        nombre = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(rolId);

        if (nombre == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nombre);
        }
    }
}
