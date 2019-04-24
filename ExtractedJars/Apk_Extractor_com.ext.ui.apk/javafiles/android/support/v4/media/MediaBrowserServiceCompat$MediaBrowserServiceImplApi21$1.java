// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.session.IMediaSession;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat, MediaBrowserServiceCompatApi21

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1
	implements Runnable
{

	public void run()
	{
		if(!mRootExtrasList.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
	//*   2    4:getfield        #33  <Field List MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.mRootExtrasList>
	//*   3    7:invokeinterface #39  <Method boolean List.isEmpty()>
	//*   4   12:ifne            84
		{
			IMediaSession imediasession = val$token.getExtraBinder();
	//    5   15:aload_0         
	//    6   16:getfield        #24  <Field android.support.v4.media.session.MediaSessionCompat$Token val$token>
	//    7   19:invokevirtual   #45  <Method IMediaSession android.support.v4.media.session.MediaSessionCompat$Token.getExtraBinder()>
	//    8   22:astore_1        
			if(imediasession != null)
	//*   9   23:aload_1         
	//*  10   24:ifnull          72
			{
				for(Iterator iterator = mRootExtrasList.iterator(); iterator.hasNext(); BundleCompat.putBinder((Bundle)iterator.next(), "extra_session_binder", imediasession.asBinder()));
	//   11   27:aload_0         
	//   12   28:getfield        #22  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
	//   13   31:getfield        #33  <Field List MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.mRootExtrasList>
	//   14   34:invokeinterface #49  <Method Iterator List.iterator()>
	//   15   39:astore_2        
	//   16   40:aload_2         
	//   17   41:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//   18   46:ifeq            72
	//   19   49:aload_2         
	//   20   50:invokeinterface #58  <Method Object Iterator.next()>
	//   21   55:checkcast       #60  <Class Bundle>
	//   22   58:ldc1            #62  <String "extra_session_binder">
	//   23   60:aload_1         
	//   24   61:invokeinterface #68  <Method android.os.IBinder IMediaSession.asBinder()>
	//   25   66:invokestatic    #74  <Method void BundleCompat.putBinder(Bundle, String, android.os.IBinder)>
			}
	//*  26   69:goto            40
			mRootExtrasList.clear();
	//   27   72:aload_0         
	//   28   73:getfield        #22  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
	//   29   76:getfield        #33  <Field List MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.mRootExtrasList>
	//   30   79:invokeinterface #77  <Method void List.clear()>
		}
		MediaBrowserServiceCompatApi21.setSessionToken(mServiceObj, val$token.getToken());
	//   31   84:aload_0         
	//   32   85:getfield        #22  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
	//   33   88:getfield        #81  <Field Object MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.mServiceObj>
	//   34   91:aload_0         
	//   35   92:getfield        #24  <Field android.support.v4.media.session.MediaSessionCompat$Token val$token>
	//   36   95:invokevirtual   #84  <Method Object android.support.v4.media.session.MediaSessionCompat$Token.getToken()>
	//   37   98:invokestatic    #89  <Method void MediaBrowserServiceCompatApi21.setSessionToken(Object, Object)>
	//   38  101:return          
	}

	final MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 this$1;
	final android.support.v4.media.session.MediaSessionCompat.Token val$token;

	MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1()
	{
		this$1 = final_mediabrowserserviceimplapi21;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
		val$token = android.support.v4.media.session.MediaSessionCompat.Token.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field android.support.v4.media.session.MediaSessionCompat$Token val$token>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
