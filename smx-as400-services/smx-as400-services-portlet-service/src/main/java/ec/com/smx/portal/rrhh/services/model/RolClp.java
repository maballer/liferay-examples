package ec.com.smx.portal.rrhh.services.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ec.com.smx.portal.rrhh.services.service.ClpSerializer;
import ec.com.smx.portal.rrhh.services.service.RolLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class RolClp extends BaseModelImpl<Rol> implements Rol {
    private long _rolId;
    private String _nombre;
    private BaseModel<?> _rolRemoteModel;
    private Class<?> _clpSerializerClass = ec.com.smx.portal.rrhh.services.service.ClpSerializer.class;

    public RolClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Rol.class;
    }

    @Override
    public String getModelClassName() {
        return Rol.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _rolId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setRolId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _rolId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("rolId", getRolId());
        attributes.put("nombre", getNombre());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long rolId = (Long) attributes.get("rolId");

        if (rolId != null) {
            setRolId(rolId);
        }

        String nombre = (String) attributes.get("nombre");

        if (nombre != null) {
            setNombre(nombre);
        }
    }

    @Override
    public long getRolId() {
        return _rolId;
    }

    @Override
    public void setRolId(long rolId) {
        _rolId = rolId;

        if (_rolRemoteModel != null) {
            try {
                Class<?> clazz = _rolRemoteModel.getClass();

                Method method = clazz.getMethod("setRolId", long.class);

                method.invoke(_rolRemoteModel, rolId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNombre() {
        return _nombre;
    }

    @Override
    public void setNombre(String nombre) {
        _nombre = nombre;

        if (_rolRemoteModel != null) {
            try {
                Class<?> clazz = _rolRemoteModel.getClass();

                Method method = clazz.getMethod("setNombre", String.class);

                method.invoke(_rolRemoteModel, nombre);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRolRemoteModel() {
        return _rolRemoteModel;
    }

    public void setRolRemoteModel(BaseModel<?> rolRemoteModel) {
        _rolRemoteModel = rolRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _rolRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_rolRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RolLocalServiceUtil.addRol(this);
        } else {
            RolLocalServiceUtil.updateRol(this);
        }
    }

    @Override
    public Rol toEscapedModel() {
        return (Rol) ProxyUtil.newProxyInstance(Rol.class.getClassLoader(),
            new Class[] { Rol.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RolClp clone = new RolClp();

        clone.setRolId(getRolId());
        clone.setNombre(getNombre());

        return clone;
    }

    @Override
    public int compareTo(Rol rol) {
        long primaryKey = rol.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RolClp)) {
            return false;
        }

        RolClp rol = (RolClp) obj;

        long primaryKey = rol.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{rolId=");
        sb.append(getRolId());
        sb.append(", nombre=");
        sb.append(getNombre());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("ec.com.smx.portal.rrhh.services.model.Rol");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>rolId</column-name><column-value><![CDATA[");
        sb.append(getRolId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nombre</column-name><column-value><![CDATA[");
        sb.append(getNombre());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
