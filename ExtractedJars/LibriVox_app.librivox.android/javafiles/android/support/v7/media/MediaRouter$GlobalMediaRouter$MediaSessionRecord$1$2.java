// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;


class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$2
	implements Runnable
{

	public void run()
	{
		if(mSelectedRoute != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
	//*   2    4:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
	//*   3    7:getfield        #33  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
	//*   4   10:getfield        #39  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
	//*   5   13:ifnull          36
			mSelectedRoute.requestUpdateVolume(val$direction);
	//    6   16:aload_0         
	//    7   17:getfield        #14  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
	//    8   20:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
	//    9   23:getfield        #33  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
	//   10   26:getfield        #39  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
	//   11   29:aload_0         
	//   12   30:getfield        #16  <Field int val$direction>
	//   13   33:invokevirtual   #45  <Method void MediaRouter$RouteInfo.requestUpdateVolume(int)>
	//   14   36:return          
	}

	final MediaRouter.GlobalMediaRouter.MediaSessionRecord._cls1 this$2;
	final int val$direction;

	MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$2()
	{
		this$2 = final__pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
		val$direction = I.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #16  <Field int val$direction>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}
}
