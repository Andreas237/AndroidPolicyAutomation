// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package o:
//			ci

final class cl
	implements ConnectionKeepAliveStrategy
{

	cl(ci ci)
	{
		b = ci;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ci b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final long getKeepAliveDuration(HttpResponse httpresponse, HttpContext httpcontext)
	{
		return 0x2bf20L;
	//    0    0:ldc2w           #19  <Long 0x2bf20L>
	//    1    3:lreturn         
	}

	final ci b;
}
