// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			GraphRequest

private static class GraphRequest$Attachment
{

	public GraphRequest getRequest()
	{
		return request;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field GraphRequest request>
	//    2    4:areturn         
	}

	public Object getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Object value>
	//    2    4:areturn         
	}

	private final GraphRequest request;
	private final Object value;

	public GraphRequest$Attachment(GraphRequest graphrequest, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		request = graphrequest;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field GraphRequest request>
		value = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field Object value>
	//    8   14:return          
	}
}
