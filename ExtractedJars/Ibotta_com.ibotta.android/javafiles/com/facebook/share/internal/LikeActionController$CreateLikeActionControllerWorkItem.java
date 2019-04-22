// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;


// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

private static class LikeActionController$CreateLikeActionControllerWorkItem
	implements Runnable
{

	public void run()
	{
		LikeActionController.access$2700(objectId, objectType, callback);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String objectId>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field com.facebook.share.widget.LikeView$ObjectType objectType>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field LikeActionController$CreationCallback callback>
	//    6   12:invokestatic    #31  <Method void LikeActionController.access$2700(String, com.facebook.share.widget.LikeView$ObjectType, LikeActionController$CreationCallback)>
	//    7   15:return          
	}

	private LikeActionController.CreationCallback callback;
	private String objectId;
	private com.facebook.share.widget.LikeView.ObjectType objectType;

	LikeActionController$CreateLikeActionControllerWorkItem(String s, com.facebook.share.widget.LikeView.ObjectType objecttype, LikeActionController.CreationCallback creationcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		objectId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field String objectId>
		objectType = objecttype;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field com.facebook.share.widget.LikeView$ObjectType objectType>
		callback = creationcallback;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field LikeActionController$CreationCallback callback>
	//   11   19:return          
	}
}
