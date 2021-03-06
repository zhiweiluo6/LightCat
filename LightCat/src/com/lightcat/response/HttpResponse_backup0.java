package com.lightcat.response;

import java.io.IOException;
import java.util.Collection;

import com.lightcat.cookie.Cookie;

public interface HttpResponse_backup0
    extends Response
{

    public abstract void addCookie(Cookie cookie);

    public abstract boolean containsHeader(String s);

    public abstract String encodeURL(String s);

    public abstract String encodeRedirectURL(String s);

    /**
     * @deprecated Method encodeUrl is deprecated
     */

    public abstract String encodeUrl(String s);

    /**
     * @deprecated Method encodeRedirectUrl is deprecated
     */

    public abstract String encodeRedirectUrl(String s);

    public abstract void sendError(int i, String s)
        throws IOException;

    public abstract void sendError(int i)
        throws IOException;

    public abstract void sendRedirect(String s)
        throws IOException;

    public abstract void setDateHeader(String s, long l);

    public abstract void addDateHeader(String s, long l);

    public abstract void setHeader(String s, String s1);

    public abstract void addHeader(String s, String s1);

    public abstract void setIntHeader(String s, int i);

    public abstract void addIntHeader(String s, int i);

    public abstract void setStatus(int i);

    /**
     * @deprecated Method setStatus is deprecated
     */

    public abstract void setStatus(int i, String s);

    public abstract int getStatus();

    public abstract String getHeader(String s);

    public abstract Collection getHeaders(String s);

    public abstract Collection getHeaderNames();

    public static final int SC_CONTINUE = 100;
    public static final int SC_SWITCHING_PROTOCOLS = 101;
    public static final int SC_OK = 200;
    public static final int SC_CREATED = 201;
    public static final int SC_ACCEPTED = 202;
    public static final int SC_NON_AUTHORITATIVE_INFORMATION = 203;
    public static final int SC_NO_CONTENT = 204;
    public static final int SC_RESET_CONTENT = 205;
    public static final int SC_PARTIAL_CONTENT = 206;
    public static final int SC_MULTIPLE_CHOICES = 300;
    public static final int SC_MOVED_PERMANENTLY = 301;
    public static final int SC_MOVED_TEMPORARILY = 302;
    public static final int SC_FOUND = 302;
    public static final int SC_SEE_OTHER = 303;
    public static final int SC_NOT_MODIFIED = 304;
    public static final int SC_USE_PROXY = 305;
    public static final int SC_TEMPORARY_REDIRECT = 307;
    public static final int SC_BAD_REQUEST = 400;
    public static final int SC_UNAUTHORIZED = 401;
    public static final int SC_PAYMENT_REQUIRED = 402;
    public static final int SC_FORBIDDEN = 403;
    public static final int SC_NOT_FOUND = 404;
    public static final int SC_METHOD_NOT_ALLOWED = 405;
    public static final int SC_NOT_ACCEPTABLE = 406;
    public static final int SC_PROXY_AUTHENTICATION_REQUIRED = 407;
    public static final int SC_REQUEST_TIMEOUT = 408;
    public static final int SC_CONFLICT = 409;
    public static final int SC_GONE = 410;
    public static final int SC_LENGTH_REQUIRED = 411;
    public static final int SC_PRECONDITION_FAILED = 412;
    public static final int SC_REQUEST_ENTITY_TOO_LARGE = 413;
    public static final int SC_REQUEST_URI_TOO_LONG = 414;
    public static final int SC_UNSUPPORTED_MEDIA_TYPE = 415;
    public static final int SC_REQUESTED_RANGE_NOT_SATISFIABLE = 416;
    public static final int SC_EXPECTATION_FAILED = 417;
    public static final int SC_INTERNAL_SERVER_ERROR = 500;
    public static final int SC_NOT_IMPLEMENTED = 501;
    public static final int SC_BAD_GATEWAY = 502;
    public static final int SC_SERVICE_UNAVAILABLE = 503;
    public static final int SC_GATEWAY_TIMEOUT = 504;
    public static final int SC_HTTP_VERSION_NOT_SUPPORTED = 505;
}
