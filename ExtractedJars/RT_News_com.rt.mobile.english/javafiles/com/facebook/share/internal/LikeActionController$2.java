// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;


// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

static final class LikeActionController$2
	implements Runnable
{

	public void run()
	{
		LikeActionController.access$200(val$controllerToRefresh);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field LikeActionController val$controllerToRefresh>
	//    2    4:invokestatic    #25  <Method void LikeActionController.access$200(LikeActionController)>
	//    3    7:return          
	}

	final LikeActionController val$controllerToRefresh;

	LikeActionController$2(LikeActionController likeactioncontroller)
	{
		val$controllerToRefresh = likeactioncontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field LikeActionController val$controllerToRefresh>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
