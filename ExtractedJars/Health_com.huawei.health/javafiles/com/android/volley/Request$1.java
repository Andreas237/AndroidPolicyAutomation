// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;


// Referenced classes of package com.android.volley:
//			Request

class Request$1
	implements Runnable
{

	public void run()
	{
		Request.access$000(Request.this).add(val$tag, val$threadId);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Request this$0>
	//    2    4:invokestatic    #34  <Method VolleyLog$MarkerLog Request.access$000(Request)>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field String val$tag>
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field long val$threadId>
	//    7   15:invokevirtual   #40  <Method void VolleyLog$MarkerLog.add(String, long)>
		Request.access$000(Request.this).finish(((Object)this).toString());
	//    8   18:aload_0         
	//    9   19:getfield        #21  <Field Request this$0>
	//   10   22:invokestatic    #34  <Method VolleyLog$MarkerLog Request.access$000(Request)>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #44  <Method String Object.toString()>
	//   13   29:invokevirtual   #45  <Method void VolleyLog$MarkerLog.finish(String)>
	//   14   32:return          
	}

	final Request this$0;
	final String val$tag;
	final long val$threadId;

	Request$1()
	{
		this$0 = final_request;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Request this$0>
		val$tag = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field String val$tag>
		val$threadId = J.this;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #25  <Field long val$threadId>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
