// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;


// Referenced classes of package com.android.volley:
//			RequestQueue, Request

class RequestQueue$1
	implements questFilter
{

	public boolean apply(Request request)
	{
		return request.getTag() == val$tag;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method Object Request.getTag()>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Object val$tag>
	//    4    8:if_acmpne       13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	final RequestQueue this$0;
	final Object val$tag;

	RequestQueue$1()
	{
		this$0 = final_requestqueue;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RequestQueue this$0>
		val$tag = Object.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Object val$tag>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
