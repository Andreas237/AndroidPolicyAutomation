// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.support.v4.media.session.MediaSessionCompat;

// Referenced classes of package android.support.v7.media:
//			MediaRouter

class MediaRouter$GlobalMediaRouter$1
	implements android.support.v4.media.session.eListener
{

	public void onActiveChanged()
	{
		if(mRccMediaSession != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
	//*   2    4:getfield        #26  <Field MediaSessionCompat MediaRouter$GlobalMediaRouter.mRccMediaSession>
	//*   3    7:ifnull          58
		{
			if(mRccMediaSession.isActive())
	//*   4   10:aload_0         
	//*   5   11:getfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
	//*   6   14:getfield        #26  <Field MediaSessionCompat MediaRouter$GlobalMediaRouter.mRccMediaSession>
	//*   7   17:invokevirtual   #32  <Method boolean MediaSessionCompat.isActive()>
	//*   8   20:ifeq            41
			{
				addRemoteControlClient(mRccMediaSession.getRemoteControlClient());
	//    9   23:aload_0         
	//   10   24:getfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
	//   11   27:aload_0         
	//   12   28:getfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
	//   13   31:getfield        #26  <Field MediaSessionCompat MediaRouter$GlobalMediaRouter.mRccMediaSession>
	//   14   34:invokevirtual   #36  <Method Object MediaSessionCompat.getRemoteControlClient()>
	//   15   37:invokevirtual   #40  <Method void MediaRouter$GlobalMediaRouter.addRemoteControlClient(Object)>
				return;
	//   16   40:return          
			}
			removeRemoteControlClient(mRccMediaSession.getRemoteControlClient());
	//   17   41:aload_0         
	//   18   42:getfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
	//   19   45:aload_0         
	//   20   46:getfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
	//   21   49:getfield        #26  <Field MediaSessionCompat MediaRouter$GlobalMediaRouter.mRccMediaSession>
	//   22   52:invokevirtual   #36  <Method Object MediaSessionCompat.getRemoteControlClient()>
	//   23   55:invokevirtual   #43  <Method void MediaRouter$GlobalMediaRouter.removeRemoteControlClient(Object)>
		}
	//   24   58:return          
	}

	final MediaRouter.GlobalMediaRouter this$0;

	MediaRouter$GlobalMediaRouter$1()
	{
		this$0 = MediaRouter.GlobalMediaRouter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
