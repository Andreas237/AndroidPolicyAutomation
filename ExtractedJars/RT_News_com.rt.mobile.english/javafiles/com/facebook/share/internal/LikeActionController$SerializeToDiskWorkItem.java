// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;


// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

private static class LikeActionController$SerializeToDiskWorkItem
	implements Runnable
{

	public void run()
	{
		LikeActionController.access$2600(cacheKey, controllerJson);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String cacheKey>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field String controllerJson>
	//    4    8:invokestatic    #26  <Method void LikeActionController.access$2600(String, String)>
	//    5   11:return          
	}

	private String cacheKey;
	private String controllerJson;

	LikeActionController$SerializeToDiskWorkItem(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		cacheKey = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String cacheKey>
		controllerJson = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field String controllerJson>
	//    8   14:return          
	}
}
