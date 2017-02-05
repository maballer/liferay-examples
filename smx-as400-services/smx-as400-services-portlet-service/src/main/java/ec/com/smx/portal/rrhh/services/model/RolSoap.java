package ec.com.smx.portal.rrhh.services.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ec.com.smx.portal.rrhh.services.service.http.RolServiceSoap}.
 *
 * @author maballe
 * @see ec.com.smx.portal.rrhh.services.service.http.RolServiceSoap
 * @generated
 */
public class RolSoap implements Serializable {
    private long _rolId;
    private String _nombre;

    public RolSoap() {
    }

    public static RolSoap toSoapModel(Rol model) {
        RolSoap soapModel = new RolSoap();

        soapModel.setRolId(model.getRolId());
        soapModel.setNombre(model.getNombre());

        return soapModel;
    }

    public static RolSoap[] toSoapModels(Rol[] models) {
        RolSoap[] soapModels = new RolSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RolSoap[][] toSoapModels(Rol[][] models) {
        RolSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RolSoap[models.length][models[0].length];
        } else {
            soapModels = new RolSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RolSoap[] toSoapModels(List<Rol> models) {
        List<RolSoap> soapModels = new ArrayList<RolSoap>(models.size());

        for (Rol model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RolSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _rolId;
    }

    public void setPrimaryKey(long pk) {
        setRolId(pk);
    }

    public long getRolId() {
        return _rolId;
    }

    public void setRolId(long rolId) {
        _rolId = rolId;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String nombre) {
        _nombre = nombre;
    }
}
