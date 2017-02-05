package ec.com.smx.portal.rrhh.services.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ec.com.smx.portal.rrhh.services.service.ClpSerializer;
import ec.com.smx.portal.rrhh.services.service.UsuarioRolLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class UsuarioRolClp extends BaseModelImpl<UsuarioRol>
    implements UsuarioRol {
    private long _UsuarioRolId;
    private long _usuarioId;
    private long _rolId;
    private BaseModel<?> _usuarioRolRemoteModel;
    private Class<?> _clpSerializerClass = ec.com.smx.portal.rrhh.services.service.ClpSerializer.class;

    public UsuarioRolClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return UsuarioRol.class;
    }

    @Override
    public String getModelClassName() {
        return UsuarioRol.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _UsuarioRolId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setUsuarioRolId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _UsuarioRolId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("UsuarioRolId", getUsuarioRolId());
        attributes.put("usuarioId", getUsuarioId());
        attributes.put("rolId", getRolId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long UsuarioRolId = (Long) attributes.get("UsuarioRolId");

        if (UsuarioRolId != null) {
            setUsuarioRolId(UsuarioRolId);
        }

        Long usuarioId = (Long) attributes.get("usuarioId");

        if (usuarioId != null) {
            setUsuarioId(usuarioId);
        }

        Long rolId = (Long) attributes.get("rolId");

        if (rolId != null) {
            setRolId(rolId);
        }
    }

    @Override
    public long getUsuarioRolId() {
        return _UsuarioRolId;
    }

    @Override
    public void setUsuarioRolId(long UsuarioRolId) {
        _UsuarioRolId = UsuarioRolId;

        if (_usuarioRolRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRolRemoteModel.getClass();

                Method method = clazz.getMethod("setUsuarioRolId", long.class);

                method.invoke(_usuarioRolRemoteModel, UsuarioRolId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUsuarioId() {
        return _usuarioId;
    }

    @Override
    public void setUsuarioId(long usuarioId) {
        _usuarioId = usuarioId;

        if (_usuarioRolRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRolRemoteModel.getClass();

                Method method = clazz.getMethod("setUsuarioId", long.class);

                method.invoke(_usuarioRolRemoteModel, usuarioId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getRolId() {
        return _rolId;
    }

    @Override
    public void setRolId(long rolId) {
        _rolId = rolId;

        if (_usuarioRolRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRolRemoteModel.getClass();

                Method method = clazz.getMethod("setRolId", long.class);

                method.invoke(_usuarioRolRemoteModel, rolId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getUsuarioRolRemoteModel() {
        return _usuarioRolRemoteModel;
    }

    public void setUsuarioRolRemoteModel(BaseModel<?> usuarioRolRemoteModel) {
        _usuarioRolRemoteModel = usuarioRolRemoteModel;
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

        Class<?> remoteModelClass = _usuarioRolRemoteModel.getClass();

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

        Object returnValue = method.invoke(_usuarioRolRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            UsuarioRolLocalServiceUtil.addUsuarioRol(this);
        } else {
            UsuarioRolLocalServiceUtil.updateUsuarioRol(this);
        }
    }

    @Override
    public UsuarioRol toEscapedModel() {
        return (UsuarioRol) ProxyUtil.newProxyInstance(UsuarioRol.class.getClassLoader(),
            new Class[] { UsuarioRol.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        UsuarioRolClp clone = new UsuarioRolClp();

        clone.setUsuarioRolId(getUsuarioRolId());
        clone.setUsuarioId(getUsuarioId());
        clone.setRolId(getRolId());

        return clone;
    }

    @Override
    public int compareTo(UsuarioRol usuarioRol) {
        long primaryKey = usuarioRol.getPrimaryKey();

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

        if (!(obj instanceof UsuarioRolClp)) {
            return false;
        }

        UsuarioRolClp usuarioRol = (UsuarioRolClp) obj;

        long primaryKey = usuarioRol.getPrimaryKey();

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
        StringBundler sb = new StringBundler(7);

        sb.append("{UsuarioRolId=");
        sb.append(getUsuarioRolId());
        sb.append(", usuarioId=");
        sb.append(getUsuarioId());
        sb.append(", rolId=");
        sb.append(getRolId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("ec.com.smx.portal.rrhh.services.model.UsuarioRol");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>UsuarioRolId</column-name><column-value><![CDATA[");
        sb.append(getUsuarioRolId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>usuarioId</column-name><column-value><![CDATA[");
        sb.append(getUsuarioId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rolId</column-name><column-value><![CDATA[");
        sb.append(getRolId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
