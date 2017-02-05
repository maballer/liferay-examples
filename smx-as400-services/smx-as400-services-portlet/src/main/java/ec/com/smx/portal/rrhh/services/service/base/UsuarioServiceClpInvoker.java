package ec.com.smx.portal.rrhh.services.service.base;

import ec.com.smx.portal.rrhh.services.service.UsuarioServiceUtil;

import java.util.Arrays;

/**
 * @author maballe
 * @generated
 */
public class UsuarioServiceClpInvoker {
    private String _methodName30;
    private String[] _methodParameterTypes30;
    private String _methodName31;
    private String[] _methodParameterTypes31;
    private String _methodName36;
    private String[] _methodParameterTypes36;
    private String _methodName37;
    private String[] _methodParameterTypes37;
    private String _methodName38;
    private String[] _methodParameterTypes38;
    private String _methodName39;
    private String[] _methodParameterTypes39;

    public UsuarioServiceClpInvoker() {
        _methodName30 = "getBeanIdentifier";

        _methodParameterTypes30 = new String[] {  };

        _methodName31 = "setBeanIdentifier";

        _methodParameterTypes31 = new String[] { "java.lang.String" };

        _methodName36 = "search";

        _methodParameterTypes36 = new String[] {  };

        _methodName37 = "getUsuario";

        _methodParameterTypes37 = new String[] { "long" };

        _methodName38 = "count";

        _methodParameterTypes38 = new String[] {  };

        _methodName39 = "getHola";

        _methodParameterTypes39 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName30.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
            return UsuarioServiceUtil.getBeanIdentifier();
        }

        if (_methodName31.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
            UsuarioServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName36.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
            return UsuarioServiceUtil.search();
        }

        if (_methodName37.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
            return UsuarioServiceUtil.getUsuario(((Long) arguments[0]).longValue());
        }

        if (_methodName38.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes38, parameterTypes)) {
            return UsuarioServiceUtil.count();
        }

        if (_methodName39.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes39, parameterTypes)) {
            return UsuarioServiceUtil.getHola((java.lang.String) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
