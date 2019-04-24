// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap;


// Referenced classes of package com.autonavi.ae.gmap:
//			GLMapEngine

class GLMapEngine$2
	implements Runnable
{

	public void run()
	{
		try
		{
			val$cancelableCallback.onCancel();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field com.amap.api.maps.AMap$CancelableCallback val$cancelableCallback>
	//    2    4:invokeinterface #33  <Method void com.amap.api.maps.AMap$CancelableCallback.onCancel()>
			return;
	//    3    9:return          
		}
		catch(Throwable throwable)
	//*   4   10:astore_1        
		{
			throwable.printStackTrace();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #36  <Method void Throwable.printStackTrace()>
		}
	//    7   15:return          
	}

	final GLMapEngine this$0;
	final com.amap.api.maps.eCallback val$cancelableCallback;

	GLMapEngine$2()
	{
		this$0 = final_glmapengine;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GLMapEngine this$0>
		val$cancelableCallback = com.amap.api.maps.eCallback.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field com.amap.api.maps.AMap$CancelableCallback val$cancelableCallback>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
