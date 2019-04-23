// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ax;

class MediaRouter$GlobalMediaRouter$1
	implements ax
{

	public void onActiveChanged()
	{
		if(mRccMediaSession != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field MediaRouter$GlobalMediaRouter this$0>
	//*   2    4:getfield        #23  <Field MediaSessionCompat MediaRouter$GlobalMediaRouter.mRccMediaSession>
	//*   3    7:ifnull          56
		{
			if(mRccMediaSession.a())
	//*   4   10:aload_0         
	//*   5   11:getfield        #12  <Field MediaRouter$GlobalMediaRouter this$0>
	//*   6   14:getfield        #23  <Field MediaSessionCompat MediaRouter$GlobalMediaRouter.mRccMediaSession>
	//*   7   17:invokevirtual   #29  <Method boolean MediaSessionCompat.a()>
	//*   8   20:ifeq            40
			{
				MediaRouter.GlobalMediaRouter globalmediarouter = MediaRouter.GlobalMediaRouter.this;
	//    9   23:aload_0         
	//   10   24:getfield        #12  <Field MediaRouter$GlobalMediaRouter this$0>
	//   11   27:astore_1        
				globalmediarouter.addRemoteControlClient(globalmediarouter.mRccMediaSession.e());
	//   12   28:aload_1         
	//   13   29:aload_1         
	//   14   30:getfield        #23  <Field MediaSessionCompat MediaRouter$GlobalMediaRouter.mRccMediaSession>
	//   15   33:invokevirtual   #33  <Method Object MediaSessionCompat.e()>
	//   16   36:invokevirtual   #37  <Method void MediaRouter$GlobalMediaRouter.addRemoteControlClient(Object)>
				return;
	//   17   39:return          
			}
			MediaRouter.GlobalMediaRouter globalmediarouter1 = MediaRouter.GlobalMediaRouter.this;
	//   18   40:aload_0         
	//   19   41:getfield        #12  <Field MediaRouter$GlobalMediaRouter this$0>
	//   20   44:astore_1        
			globalmediarouter1.removeRemoteControlClient(globalmediarouter1.mRccMediaSession.e());
	//   21   45:aload_1         
	//   22   46:aload_1         
	//   23   47:getfield        #23  <Field MediaSessionCompat MediaRouter$GlobalMediaRouter.mRccMediaSession>
	//   24   50:invokevirtual   #33  <Method Object MediaSessionCompat.e()>
	//   25   53:invokevirtual   #40  <Method void MediaRouter$GlobalMediaRouter.removeRemoteControlClient(Object)>
		}
	//   26   56:return          
	}

	final MediaRouter.GlobalMediaRouter this$0;

	MediaRouter$GlobalMediaRouter$1()
	{
		this$0 = MediaRouter.GlobalMediaRouter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MediaRouter$GlobalMediaRouter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
