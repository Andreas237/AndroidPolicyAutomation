// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package o:
//			cd

final class cd$d
	implements HttpRequestInterceptor
{

	public final void process(HttpRequest httprequest, HttpContext httpcontext)
	{
		httpcontext = ((HttpContext) (cd.e(c)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field cd c>
	//    2    4:invokestatic    #28  <Method cd$e cd.e(cd)>
	//    3    7:astore_2        
		if(httpcontext != null && cd$e.c(((cd$e) (httpcontext))) && (httprequest instanceof HttpUriRequest))
	//*   4    8:aload_2         
	//*   5    9:ifnull          37
	//*   6   12:aload_2         
	//*   7   13:invokestatic    #33  <Method boolean cd$e.c(cd$e)>
	//*   8   16:ifeq            37
	//*   9   19:aload_1         
	//*  10   20:instanceof      #35  <Class HttpUriRequest>
	//*  11   23:ifeq            37
			cd$e.b(((cd$e) (httpcontext)), cd.c((HttpUriRequest)httprequest));
	//   12   26:aload_2         
	//   13   27:aload_1         
	//   14   28:checkcast       #35  <Class HttpUriRequest>
	//   15   31:invokestatic    #38  <Method String cd.c(HttpUriRequest)>
	//   16   34:invokestatic    #42  <Method void cd$e.b(cd$e, String)>
	//   17   37:return          
	}

	final cd c;

	private cd$d(cd cd1)
	{
		c = cd1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field cd c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	cd$d(cd cd1, byte byte0)
	{
		this(cd1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void cd$d(cd)>
	//    3    5:return          
	}
}
