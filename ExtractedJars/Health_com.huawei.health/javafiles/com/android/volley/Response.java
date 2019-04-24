// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;


// Referenced classes of package com.android.volley:
//			VolleyError

public class Response
{
	public static interface ErrorListener
	{

		public abstract void onErrorResponse(VolleyError volleyerror);
	}

	public static interface Listener
	{

		public abstract void onResponse(Object obj);
	}


	private Response(VolleyError volleyerror)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		intermediate = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #27  <Field boolean intermediate>
		result = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #29  <Field Object result>
		cacheEntry = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #31  <Field Cache$Entry cacheEntry>
		error = volleyerror;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #33  <Field VolleyError error>
	//   14   24:return          
	}

	private Response(Object obj, Cache.Entry entry)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		intermediate = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #27  <Field boolean intermediate>
		result = obj;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #29  <Field Object result>
		cacheEntry = entry;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #31  <Field Cache$Entry cacheEntry>
		error = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #33  <Field VolleyError error>
	//   14   24:return          
	}

	public static Response error(VolleyError volleyerror)
	{
		return new Response(volleyerror);
	//    0    0:new             #2   <Class Response>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #40  <Method void Response(VolleyError)>
	//    4    8:areturn         
	}

	public static Response success(Object obj, Cache.Entry entry)
	{
		return new Response(obj, entry);
	//    0    0:new             #2   <Class Response>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #45  <Method void Response(Object, Cache$Entry)>
	//    5    9:areturn         
	}

	public boolean isSuccess()
	{
		return error == null;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field VolleyError error>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final Cache.Entry cacheEntry;
	public final VolleyError error;
	public boolean intermediate;
	public final Object result;
}
