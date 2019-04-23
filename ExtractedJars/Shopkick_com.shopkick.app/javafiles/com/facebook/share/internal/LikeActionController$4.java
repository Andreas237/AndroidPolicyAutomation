// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.FacebookException;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

static final class LikeActionController$4
	implements Runnable
{

	public void run()
	{
		val$callback.onComplete(val$controller, val$error);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field LikeActionController$CreationCallback val$callback>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field LikeActionController val$controller>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field FacebookException val$error>
	//    6   12:invokeinterface #35  <Method void LikeActionController$CreationCallback.onComplete(LikeActionController, FacebookException)>
	//    7   17:return          
	}

	final eationCallback val$callback;
	final LikeActionController val$controller;
	final FacebookException val$error;

	LikeActionController$4(eationCallback eationcallback, LikeActionController likeactioncontroller, FacebookException facebookexception)
	{
		val$callback = eationcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field LikeActionController$CreationCallback val$callback>
		val$controller = likeactioncontroller;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field LikeActionController val$controller>
		val$error = facebookexception;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field FacebookException val$error>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
