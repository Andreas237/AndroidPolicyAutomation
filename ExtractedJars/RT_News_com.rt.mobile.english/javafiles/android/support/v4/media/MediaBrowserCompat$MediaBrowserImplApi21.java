// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.*;
import android.support.v4.app.BundleCompat;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, MediaBrowserCompatApi21

static class MediaBrowserCompat$MediaBrowserImplApi21
	implements MediaBrowserCompat.MediaBrowserImpl, lbackImpl, nectionCallbackInternal
{

	public void connect()
	{
		MediaBrowserCompatApi21.connect(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Object mBrowserObj>
	//    2    4:invokestatic    #104 <Method void MediaBrowserCompatApi21.connect(Object)>
	//    3    7:return          
	}

	public void disconnect()
	{
		RemoteException remoteexception;
		if(mServiceBinderWrapper != null && mCallbacksMessenger != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*   2    4:ifnull          36
	//*   3    7:aload_0         
	//*   4    8:getfield        #111 <Field Messenger mCallbacksMessenger>
	//*   5   11:ifnull          36
			try
			{
				mServiceBinderWrapper.unregisterCallbackMessenger(mCallbacksMessenger);
	//    6   14:aload_0         
	//    7   15:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//    8   18:aload_0         
	//    9   19:getfield        #111 <Field Messenger mCallbacksMessenger>
	//   10   22:invokevirtual   #117 <Method void MediaBrowserCompat$ServiceBinderWrapper.unregisterCallbackMessenger(Messenger)>
			}
	//*  11   25:goto            36
	//*  12   28:ldc1            #119 <String "MediaBrowserCompat">
	//*  13   30:ldc1            #121 <String "Remote error unregistering client messenger.">
	//*  14   32:invokestatic    #127 <Method int Log.i(String, String)>
	//*  15   35:pop             
	//*  16   36:aload_0         
	//*  17   37:getfield        #99  <Field Object mBrowserObj>
	//*  18   40:invokestatic    #129 <Method void MediaBrowserCompatApi21.disconnect(Object)>
	//*  19   43:return          
			// Misplaced declaration of an exception variable
			catch(RemoteException remoteexception)
			{
				Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
			}
		MediaBrowserCompatApi21.disconnect(mBrowserObj);
	//*  20   44:astore_1        
	//*  21   45:goto            28
	}

	public Bundle getExtras()
	{
		return MediaBrowserCompatApi21.getExtras(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Object mBrowserObj>
	//    2    4:invokestatic    #135 <Method Bundle MediaBrowserCompatApi21.getExtras(Object)>
	//    3    7:areturn         
	}

	public void getItem(final String mediaId, final MediaBrowserCompat.ItemCallback cb)
	{
		RemoteException remoteexception;
		if(TextUtils.isEmpty(((CharSequence) (mediaId))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #145 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("mediaId is empty");
	//    3    7:new             #147 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #149 <String "mediaId is empty">
	//    6   13:invokespecial   #152 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(cb == null)
	//*   8   17:aload_2         
	//*   9   18:ifnonnull       31
			throw new IllegalArgumentException("cb is null");
	//   10   21:new             #147 <Class IllegalArgumentException>
	//   11   24:dup             
	//   12   25:ldc1            #154 <String "cb is null">
	//   13   27:invokespecial   #152 <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
		if(!MediaBrowserCompatApi21.isConnected(mBrowserObj))
	//*  15   31:aload_0         
	//*  16   32:getfield        #99  <Field Object mBrowserObj>
	//*  17   35:invokestatic    #158 <Method boolean MediaBrowserCompatApi21.isConnected(Object)>
	//*  18   38:ifne            68
		{
			Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
	//   19   41:ldc1            #119 <String "MediaBrowserCompat">
	//   20   43:ldc1            #160 <String "Not connected, unable to retrieve the MediaItem.">
	//   21   45:invokestatic    #127 <Method int Log.i(String, String)>
	//   22   48:pop             
			mHandler.post(new Runnable() {

				public void run()
				{
					cb.onError(mediaId);
				//    0    0:aload_0         
				//    1    1:getfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
				//    2    4:aload_0         
				//    3    5:getfield        #28  <Field String val$mediaId>
				//    4    8:invokevirtual   #39  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
				//    5   11:return          
				}

				final MediaBrowserCompat.MediaBrowserImplApi21 this$0;
				final MediaBrowserCompat.ItemCallback val$cb;
				final String val$mediaId;

			
			{
				this$0 = MediaBrowserCompat.MediaBrowserImplApi21.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserCompat$MediaBrowserImplApi21 this$0>
				cb = itemcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
				mediaId = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field String val$mediaId>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   23   49:aload_0         
	//   24   50:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   25   53:new             #15  <Class MediaBrowserCompat$MediaBrowserImplApi21$1>
	//   26   56:dup             
	//   27   57:aload_0         
	//   28   58:aload_2         
	//   29   59:aload_1         
	//   30   60:invokespecial   #163 <Method void MediaBrowserCompat$MediaBrowserImplApi21$1(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$ItemCallback, String)>
	//   31   63:invokevirtual   #167 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   32   66:pop             
			return;
	//   33   67:return          
		}
		if(mServiceBinderWrapper == null)
	//*  34   68:aload_0         
	//*  35   69:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  36   72:ifnonnull       94
		{
			mHandler.post(new Runnable() {

				public void run()
				{
					cb.onError(mediaId);
				//    0    0:aload_0         
				//    1    1:getfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
				//    2    4:aload_0         
				//    3    5:getfield        #28  <Field String val$mediaId>
				//    4    8:invokevirtual   #39  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
				//    5   11:return          
				}

				final MediaBrowserCompat.MediaBrowserImplApi21 this$0;
				final MediaBrowserCompat.ItemCallback val$cb;
				final String val$mediaId;

			
			{
				this$0 = MediaBrowserCompat.MediaBrowserImplApi21.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserCompat$MediaBrowserImplApi21 this$0>
				cb = itemcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
				mediaId = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field String val$mediaId>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   37   75:aload_0         
	//   38   76:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   39   79:new             #17  <Class MediaBrowserCompat$MediaBrowserImplApi21$2>
	//   40   82:dup             
	//   41   83:aload_0         
	//   42   84:aload_2         
	//   43   85:aload_1         
	//   44   86:invokespecial   #168 <Method void MediaBrowserCompat$MediaBrowserImplApi21$2(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$ItemCallback, String)>
	//   45   89:invokevirtual   #167 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   46   92:pop             
			return;
	//   47   93:return          
		}
		Object obj = ((Object) (new MediaBrowserCompat.ItemReceiver(mediaId, cb, ((android.os.Handler) (mHandler)))));
	//   48   94:new             #170 <Class MediaBrowserCompat$ItemReceiver>
	//   49   97:dup             
	//   50   98:aload_1         
	//   51   99:aload_2         
	//   52  100:aload_0         
	//   53  101:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   54  104:invokespecial   #173 <Method void MediaBrowserCompat$ItemReceiver(String, MediaBrowserCompat$ItemCallback, android.os.Handler)>
	//   55  107:astore_3        
		try
		{
			mServiceBinderWrapper.getMediaItem(mediaId, ((android.support.v4.os.ResultReceiver) (obj)), mCallbacksMessenger);
	//   56  108:aload_0         
	//   57  109:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   58  112:aload_1         
	//   59  113:aload_3         
	//   60  114:aload_0         
	//   61  115:getfield        #111 <Field Messenger mCallbacksMessenger>
	//   62  118:invokevirtual   #177 <Method void MediaBrowserCompat$ServiceBinderWrapper.getMediaItem(String, android.support.v4.os.ResultReceiver, Messenger)>
			return;
	//   63  121:return          
		}
	//*  64  122:new             #179 <Class StringBuilder>
	//*  65  125:dup             
	//*  66  126:invokespecial   #180 <Method void StringBuilder()>
	//*  67  129:astore_3        
	//*  68  130:aload_3         
	//*  69  131:ldc1            #182 <String "Remote error getting media item: ">
	//*  70  133:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//*  71  136:pop             
	//*  72  137:aload_3         
	//*  73  138:aload_1         
	//*  74  139:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//*  75  142:pop             
	//*  76  143:ldc1            #119 <String "MediaBrowserCompat">
	//*  77  145:aload_3         
	//*  78  146:invokevirtual   #190 <Method String StringBuilder.toString()>
	//*  79  149:invokestatic    #127 <Method int Log.i(String, String)>
	//*  80  152:pop             
	//*  81  153:aload_0         
	//*  82  154:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//*  83  157:new             #19  <Class MediaBrowserCompat$MediaBrowserImplApi21$3>
	//*  84  160:dup             
	//*  85  161:aload_0         
	//*  86  162:aload_2         
	//*  87  163:aload_1         
	//*  88  164:invokespecial   #191 <Method void MediaBrowserCompat$MediaBrowserImplApi21$3(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$ItemCallback, String)>
	//*  89  167:invokevirtual   #167 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//*  90  170:pop             
	//*  91  171:return          
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			obj = ((Object) (new StringBuilder()));
		}
		((StringBuilder) (obj)).append("Remote error getting media item: ");
		((StringBuilder) (obj)).append(mediaId);
		Log.i("MediaBrowserCompat", ((StringBuilder) (obj)).toString());
		mHandler.post(new Runnable() {

			public void run()
			{
				cb.onError(mediaId);
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
			//    2    4:aload_0         
			//    3    5:getfield        #28  <Field String val$mediaId>
			//    4    8:invokevirtual   #39  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
			//    5   11:return          
			}

			final MediaBrowserCompat.MediaBrowserImplApi21 this$0;
			final MediaBrowserCompat.ItemCallback val$cb;
			final String val$mediaId;

			
			{
				this$0 = MediaBrowserCompat.MediaBrowserImplApi21.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserCompat$MediaBrowserImplApi21 this$0>
				cb = itemcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
				mediaId = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field String val$mediaId>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//*  92  172:astore_3        
	//*  93  173:goto            122
	}

	public String getRoot()
	{
		return MediaBrowserCompatApi21.getRoot(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Object mBrowserObj>
	//    2    4:invokestatic    #196 <Method String MediaBrowserCompatApi21.getRoot(Object)>
	//    3    7:areturn         
	}

	public ComponentName getServiceComponent()
	{
		return MediaBrowserCompatApi21.getServiceComponent(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Object mBrowserObj>
	//    2    4:invokestatic    #201 <Method ComponentName MediaBrowserCompatApi21.getServiceComponent(Object)>
	//    3    7:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
	{
		if(mMediaSessionToken == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//*   2    4:ifnonnull       21
			mMediaSessionToken = android.support.v4.media.session.MediaSessionCompat.Token.fromToken(MediaBrowserCompatApi21.getSessionToken(mBrowserObj));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #99  <Field Object mBrowserObj>
	//    6   12:invokestatic    #208 <Method Object MediaBrowserCompatApi21.getSessionToken(Object)>
	//    7   15:invokestatic    #214 <Method android.support.v4.media.session.MediaSessionCompat$Token android.support.v4.media.session.MediaSessionCompat$Token.fromToken(Object)>
	//    8   18:putfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		return mMediaSessionToken;
	//    9   21:aload_0         
	//   10   22:getfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//   11   25:areturn         
	}

	public boolean isConnected()
	{
		return MediaBrowserCompatApi21.isConnected(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Object mBrowserObj>
	//    2    4:invokestatic    #158 <Method boolean MediaBrowserCompatApi21.isConnected(Object)>
	//    3    7:ireturn         
	}

	public void onConnected()
	{
		RemoteException remoteexception;
		Object obj = ((Object) (MediaBrowserCompatApi21.getExtras(mBrowserObj)));
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Object mBrowserObj>
	//    2    4:invokestatic    #135 <Method Bundle MediaBrowserCompatApi21.getExtras(Object)>
	//    3    7:astore_1        
		if(obj == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		mServiceVersion = ((Bundle) (obj)).getInt("extra_service_version", 0);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:ldc1            #218 <String "extra_service_version">
	//   10   17:iconst_0        
	//   11   18:invokevirtual   #222 <Method int Bundle.getInt(String, int)>
	//   12   21:putfield        #224 <Field int mServiceVersion>
		android.os.IBinder ibinder = BundleCompat.getBinder(((Bundle) (obj)), "extra_messenger");
	//   13   24:aload_1         
	//   14   25:ldc1            #226 <String "extra_messenger">
	//   15   27:invokestatic    #232 <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//   16   30:astore_2        
		if(ibinder != null)
	//*  17   31:aload_2         
	//*  18   32:ifnull          99
		{
			mServiceBinderWrapper = new MediaBrowserCompat.ServiceBinderWrapper(ibinder, mRootHints);
	//   19   35:aload_0         
	//   20   36:new             #113 <Class MediaBrowserCompat$ServiceBinderWrapper>
	//   21   39:dup             
	//   22   40:aload_2         
	//   23   41:aload_0         
	//   24   42:getfield        #82  <Field Bundle mRootHints>
	//   25   45:invokespecial   #235 <Method void MediaBrowserCompat$ServiceBinderWrapper(android.os.IBinder, Bundle)>
	//   26   48:putfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
			mCallbacksMessenger = new Messenger(((android.os.Handler) (mHandler)));
	//   27   51:aload_0         
	//   28   52:new             #237 <Class Messenger>
	//   29   55:dup             
	//   30   56:aload_0         
	//   31   57:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   32   60:invokespecial   #240 <Method void Messenger(android.os.Handler)>
	//   33   63:putfield        #111 <Field Messenger mCallbacksMessenger>
			mHandler.setCallbacksMessenger(mCallbacksMessenger);
	//   34   66:aload_0         
	//   35   67:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   36   70:aload_0         
	//   37   71:getfield        #111 <Field Messenger mCallbacksMessenger>
	//   38   74:invokevirtual   #243 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
			try
			{
				mServiceBinderWrapper.registerCallbackMessenger(mCallbacksMessenger);
	//   39   77:aload_0         
	//   40   78:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   41   81:aload_0         
	//   42   82:getfield        #111 <Field Messenger mCallbacksMessenger>
	//   43   85:invokevirtual   #246 <Method void MediaBrowserCompat$ServiceBinderWrapper.registerCallbackMessenger(Messenger)>
			}
	//*  44   88:goto            99
	//*  45   91:ldc1            #119 <String "MediaBrowserCompat">
	//*  46   93:ldc1            #248 <String "Remote error registering client messenger.">
	//*  47   95:invokestatic    #127 <Method int Log.i(String, String)>
	//*  48   98:pop             
	//*  49   99:aload_1         
	//*  50  100:ldc1            #250 <String "extra_session_binder">
	//*  51  102:invokestatic    #232 <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//*  52  105:invokestatic    #256 <Method android.support.v4.media.session.IMediaSession android.support.v4.media.session.IMediaSession$Stub.asInterface(android.os.IBinder)>
	//*  53  108:astore_1        
	//*  54  109:aload_1         
	//*  55  110:ifnull          128
	//*  56  113:aload_0         
	//*  57  114:aload_0         
	//*  58  115:getfield        #99  <Field Object mBrowserObj>
	//*  59  118:invokestatic    #208 <Method Object MediaBrowserCompatApi21.getSessionToken(Object)>
	//*  60  121:aload_1         
	//*  61  122:invokestatic    #259 <Method android.support.v4.media.session.MediaSessionCompat$Token android.support.v4.media.session.MediaSessionCompat$Token.fromToken(Object, android.support.v4.media.session.IMediaSession)>
	//*  62  125:putfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//*  63  128:return          
			// Misplaced declaration of an exception variable
			catch(RemoteException remoteexception)
			{
				Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
			}
		}
		obj = ((Object) (android.support.v4.media.session.IMediaSession.Stub.asInterface(BundleCompat.getBinder(((Bundle) (obj)), "extra_session_binder"))));
		if(obj != null)
			mMediaSessionToken = android.support.v4.media.session.MediaSessionCompat.Token.fromToken(MediaBrowserCompatApi21.getSessionToken(mBrowserObj), ((android.support.v4.media.session.IMediaSession) (obj)));
	//*  64  129:astore_2        
	//*  65  130:goto            91
	}

	public void onConnectionFailed()
	{
	//    0    0:return          
	}

	public void onConnectionFailed(Messenger messenger)
	{
	//    0    0:return          
	}

	public void onConnectionSuspended()
	{
		mServiceBinderWrapper = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		mCallbacksMessenger = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #111 <Field Messenger mCallbacksMessenger>
		mMediaSessionToken = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		mHandler.setCallbacksMessenger(((Messenger) (null)));
	//    9   15:aload_0         
	//   10   16:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   11   19:aconst_null     
	//   12   20:invokevirtual   #243 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
	//   13   23:return          
	}

	public void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle)
	{
		if(mCallbacksMessenger != messenger)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field Messenger mCallbacksMessenger>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       9
			return;
	//    4    8:return          
		messenger = ((Messenger) ((MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)))));
	//    5    9:aload_0         
	//    6   10:getfield        #66  <Field ArrayMap mSubscriptions>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #266 <Method Object ArrayMap.get(Object)>
	//    9   17:checkcast       #268 <Class MediaBrowserCompat$Subscription>
	//   10   20:astore_1        
		if(messenger == null)
	//*  11   21:aload_1         
	//*  12   22:ifnonnull       64
		{
			if(MediaBrowserCompat.DEBUG)
	//*  13   25:getstatic       #272 <Field boolean MediaBrowserCompat.DEBUG>
	//*  14   28:ifeq            63
			{
				messenger = ((Messenger) (new StringBuilder()));
	//   15   31:new             #179 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #180 <Method void StringBuilder()>
	//   18   38:astore_1        
				((StringBuilder) (messenger)).append("onLoadChildren for id that isn't subscribed id=");
	//   19   39:aload_1         
	//   20   40:ldc2            #274 <String "onLoadChildren for id that isn't subscribed id=">
	//   21   43:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
				((StringBuilder) (messenger)).append(s);
	//   23   47:aload_1         
	//   24   48:aload_2         
	//   25   49:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
				Log.d("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
	//   27   53:ldc1            #119 <String "MediaBrowserCompat">
	//   28   55:aload_1         
	//   29   56:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   30   59:invokestatic    #277 <Method int Log.d(String, String)>
	//   31   62:pop             
			}
			return;
	//   32   63:return          
		}
		messenger = ((Messenger) (((MediaBrowserCompat.Subscription) (messenger)).getCallback(mContext, bundle)));
	//   33   64:aload_1         
	//   34   65:aload_0         
	//   35   66:getfield        #68  <Field Context mContext>
	//   36   69:aload           4
	//   37   71:invokevirtual   #281 <Method MediaBrowserCompat$SubscriptionCallback MediaBrowserCompat$Subscription.getCallback(Context, Bundle)>
	//   38   74:astore_1        
		if(messenger != null)
	//*  39   75:aload_1         
	//*  40   76:ifnull          121
		{
			if(bundle == null)
	//*  41   79:aload           4
	//*  42   81:ifnonnull       101
				if(list == null)
	//*  43   84:aload_3         
	//*  44   85:ifnonnull       94
				{
					((MediaBrowserCompat.SubscriptionCallback) (messenger)).onError(s);
	//   45   88:aload_1         
	//   46   89:aload_2         
	//   47   90:invokevirtual   #286 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
					return;
	//   48   93:return          
				} else
				{
					((MediaBrowserCompat.SubscriptionCallback) (messenger)).onChildrenLoaded(s, list);
	//   49   94:aload_1         
	//   50   95:aload_2         
	//   51   96:aload_3         
	//   52   97:invokevirtual   #290 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
					return;
	//   53  100:return          
				}
			if(list == null)
	//*  54  101:aload_3         
	//*  55  102:ifnonnull       113
			{
				((MediaBrowserCompat.SubscriptionCallback) (messenger)).onError(s, bundle);
	//   56  105:aload_1         
	//   57  106:aload_2         
	//   58  107:aload           4
	//   59  109:invokevirtual   #293 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
				return;
	//   60  112:return          
			}
			((MediaBrowserCompat.SubscriptionCallback) (messenger)).onChildrenLoaded(s, list, bundle);
	//   61  113:aload_1         
	//   62  114:aload_2         
	//   63  115:aload_3         
	//   64  116:aload           4
	//   65  118:invokevirtual   #296 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
		}
	//   66  121:return          
	}

	public void onServiceConnected(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
	{
	//    0    0:return          
	}

	public void search(final String query, final Bundle extras, final MediaBrowserCompat.SearchCallback callback)
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #302 <Method boolean isConnected()>
	//*   2    4:ifne            18
			throw new IllegalStateException("search() called while not connected");
	//    3    7:new             #304 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #306 <String "search() called while not connected">
	//    6   14:invokespecial   #307 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(mServiceBinderWrapper == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  10   22:ifnonnull       54
		{
			Log.i("MediaBrowserCompat", "The connected service doesn't support search.");
	//   11   25:ldc1            #119 <String "MediaBrowserCompat">
	//   12   27:ldc2            #309 <String "The connected service doesn't support search.">
	//   13   30:invokestatic    #127 <Method int Log.i(String, String)>
	//   14   33:pop             
			mHandler.post(new Runnable() {

				public void run()
				{
					callback.onError(query, extras);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field MediaBrowserCompat$SearchCallback val$callback>
				//    2    4:aload_0         
				//    3    5:getfield        #30  <Field String val$query>
				//    4    8:aload_0         
				//    5    9:getfield        #32  <Field Bundle val$extras>
				//    6   12:invokevirtual   #43  <Method void MediaBrowserCompat$SearchCallback.onError(String, Bundle)>
				//    7   15:return          
				}

				final MediaBrowserCompat.MediaBrowserImplApi21 this$0;
				final MediaBrowserCompat.SearchCallback val$callback;
				final Bundle val$extras;
				final String val$query;

			
			{
				this$0 = MediaBrowserCompat.MediaBrowserImplApi21.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaBrowserCompat$MediaBrowserImplApi21 this$0>
				callback = searchcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field MediaBrowserCompat$SearchCallback val$callback>
				query = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String val$query>
				extras = bundle;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field Bundle val$extras>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   15   34:aload_0         
	//   16   35:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   17   38:new             #21  <Class MediaBrowserCompat$MediaBrowserImplApi21$4>
	//   18   41:dup             
	//   19   42:aload_0         
	//   20   43:aload_3         
	//   21   44:aload_1         
	//   22   45:aload_2         
	//   23   46:invokespecial   #312 <Method void MediaBrowserCompat$MediaBrowserImplApi21$4(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$SearchCallback, String, Bundle)>
	//   24   49:invokevirtual   #167 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   25   52:pop             
			return;
	//   26   53:return          
		}
		MediaBrowserCompat.SearchResultReceiver searchresultreceiver = new MediaBrowserCompat.SearchResultReceiver(query, extras, callback, ((android.os.Handler) (mHandler)));
	//   27   54:new             #314 <Class MediaBrowserCompat$SearchResultReceiver>
	//   28   57:dup             
	//   29   58:aload_1         
	//   30   59:aload_2         
	//   31   60:aload_3         
	//   32   61:aload_0         
	//   33   62:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   34   65:invokespecial   #317 <Method void MediaBrowserCompat$SearchResultReceiver(String, Bundle, MediaBrowserCompat$SearchCallback, android.os.Handler)>
	//   35   68:astore          4
		try
		{
			mServiceBinderWrapper.search(query, extras, ((android.support.v4.os.ResultReceiver) (searchresultreceiver)), mCallbacksMessenger);
	//   36   70:aload_0         
	//   37   71:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   38   74:aload_1         
	//   39   75:aload_2         
	//   40   76:aload           4
	//   41   78:aload_0         
	//   42   79:getfield        #111 <Field Messenger mCallbacksMessenger>
	//   43   82:invokevirtual   #320 <Method void MediaBrowserCompat$ServiceBinderWrapper.search(String, Bundle, android.support.v4.os.ResultReceiver, Messenger)>
			return;
	//   44   85:return          
		}
		catch(RemoteException remoteexception)
	//*  45   86:astore          4
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   46   88:new             #179 <Class StringBuilder>
	//   47   91:dup             
	//   48   92:invokespecial   #180 <Method void StringBuilder()>
	//   49   95:astore          5
			stringbuilder.append("Remote error searching items with query: ");
	//   50   97:aload           5
	//   51   99:ldc2            #322 <String "Remote error searching items with query: ">
	//   52  102:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   53  105:pop             
			stringbuilder.append(query);
	//   54  106:aload           5
	//   55  108:aload_1         
	//   56  109:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   57  112:pop             
			Log.i("MediaBrowserCompat", stringbuilder.toString(), ((Throwable) (remoteexception)));
	//   58  113:ldc1            #119 <String "MediaBrowserCompat">
	//   59  115:aload           5
	//   60  117:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   61  120:aload           4
	//   62  122:invokestatic    #325 <Method int Log.i(String, String, Throwable)>
	//   63  125:pop             
			mHandler.post(new Runnable() {

				public void run()
				{
					callback.onError(query, extras);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field MediaBrowserCompat$SearchCallback val$callback>
				//    2    4:aload_0         
				//    3    5:getfield        #30  <Field String val$query>
				//    4    8:aload_0         
				//    5    9:getfield        #32  <Field Bundle val$extras>
				//    6   12:invokevirtual   #43  <Method void MediaBrowserCompat$SearchCallback.onError(String, Bundle)>
				//    7   15:return          
				}

				final MediaBrowserCompat.MediaBrowserImplApi21 this$0;
				final MediaBrowserCompat.SearchCallback val$callback;
				final Bundle val$extras;
				final String val$query;

			
			{
				this$0 = MediaBrowserCompat.MediaBrowserImplApi21.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaBrowserCompat$MediaBrowserImplApi21 this$0>
				callback = searchcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field MediaBrowserCompat$SearchCallback val$callback>
				query = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String val$query>
				extras = bundle;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field Bundle val$extras>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   64  126:aload_0         
	//   65  127:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   66  130:new             #23  <Class MediaBrowserCompat$MediaBrowserImplApi21$5>
	//   67  133:dup             
	//   68  134:aload_0         
	//   69  135:aload_3         
	//   70  136:aload_1         
	//   71  137:aload_2         
	//   72  138:invokespecial   #326 <Method void MediaBrowserCompat$MediaBrowserImplApi21$5(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$SearchCallback, String, Bundle)>
	//   73  141:invokevirtual   #167 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   74  144:pop             
			return;
	//   75  145:return          
		}
	}

	public void sendCustomAction(final String action, final Bundle extras, final MediaBrowserCompat.CustomActionCallback callback)
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #302 <Method boolean isConnected()>
	//*   2    4:ifne            79
		{
			callback = ((MediaBrowserCompat.CustomActionCallback) (new StringBuilder()));
	//    3    7:new             #179 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #180 <Method void StringBuilder()>
	//    6   14:astore_3        
			((StringBuilder) (callback)).append("Cannot send a custom action (");
	//    7   15:aload_3         
	//    8   16:ldc2            #330 <String "Cannot send a custom action (">
	//    9   19:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			((StringBuilder) (callback)).append(action);
	//   11   23:aload_3         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
			((StringBuilder) (callback)).append(") with ");
	//   15   29:aload_3         
	//   16   30:ldc2            #332 <String ") with ">
	//   17   33:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			((StringBuilder) (callback)).append("extras ");
	//   19   37:aload_3         
	//   20   38:ldc2            #334 <String "extras ">
	//   21   41:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
			((StringBuilder) (callback)).append(((Object) (extras)));
	//   23   45:aload_3         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #337 <Method StringBuilder StringBuilder.append(Object)>
	//   26   50:pop             
			((StringBuilder) (callback)).append(" because the browser is not connected to the ");
	//   27   51:aload_3         
	//   28   52:ldc2            #339 <String " because the browser is not connected to the ">
	//   29   55:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
			((StringBuilder) (callback)).append("service.");
	//   31   59:aload_3         
	//   32   60:ldc2            #341 <String "service.">
	//   33   63:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
			throw new IllegalStateException(((StringBuilder) (callback)).toString());
	//   35   67:new             #304 <Class IllegalStateException>
	//   36   70:dup             
	//   37   71:aload_3         
	//   38   72:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   39   75:invokespecial   #307 <Method void IllegalStateException(String)>
	//   40   78:athrow          
		}
		if(mServiceBinderWrapper == null)
	//*  41   79:aload_0         
	//*  42   80:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  43   83:ifnonnull       118
		{
			Log.i("MediaBrowserCompat", "The connected service doesn't support sendCustomAction.");
	//   44   86:ldc1            #119 <String "MediaBrowserCompat">
	//   45   88:ldc2            #343 <String "The connected service doesn't support sendCustomAction.">
	//   46   91:invokestatic    #127 <Method int Log.i(String, String)>
	//   47   94:pop             
			if(callback != null)
	//*  48   95:aload_3         
	//*  49   96:ifnull          118
				mHandler.post(new Runnable() {

					public void run()
					{
						callback.onError(action, extras, ((Bundle) (null)));
					//    0    0:aload_0         
					//    1    1:getfield        #28  <Field MediaBrowserCompat$CustomActionCallback val$callback>
					//    2    4:aload_0         
					//    3    5:getfield        #30  <Field String val$action>
					//    4    8:aload_0         
					//    5    9:getfield        #32  <Field Bundle val$extras>
					//    6   12:aconst_null     
					//    7   13:invokevirtual   #43  <Method void MediaBrowserCompat$CustomActionCallback.onError(String, Bundle, Bundle)>
					//    8   16:return          
					}

					final MediaBrowserCompat.MediaBrowserImplApi21 this$0;
					final String val$action;
					final MediaBrowserCompat.CustomActionCallback val$callback;
					final Bundle val$extras;

			
			{
				this$0 = MediaBrowserCompat.MediaBrowserImplApi21.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaBrowserCompat$MediaBrowserImplApi21 this$0>
				callback = customactioncallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field MediaBrowserCompat$CustomActionCallback val$callback>
				action = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String val$action>
				extras = bundle;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field Bundle val$extras>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
				}
);
	//   50   99:aload_0         
	//   51  100:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   52  103:new             #25  <Class MediaBrowserCompat$MediaBrowserImplApi21$6>
	//   53  106:dup             
	//   54  107:aload_0         
	//   55  108:aload_3         
	//   56  109:aload_1         
	//   57  110:aload_2         
	//   58  111:invokespecial   #346 <Method void MediaBrowserCompat$MediaBrowserImplApi21$6(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$CustomActionCallback, String, Bundle)>
	//   59  114:invokevirtual   #167 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   60  117:pop             
		}
		iver iver = new iver(action, extras, callback, ((android.os.Handler) (mHandler)));
	//   61  118:new             #348 <Class MediaBrowserCompat$CustomActionResultReceiver>
	//   62  121:dup             
	//   63  122:aload_1         
	//   64  123:aload_2         
	//   65  124:aload_3         
	//   66  125:aload_0         
	//   67  126:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   68  129:invokespecial   #351 <Method void MediaBrowserCompat$CustomActionResultReceiver(String, Bundle, MediaBrowserCompat$CustomActionCallback, android.os.Handler)>
	//   69  132:astore          4
		try
		{
			mServiceBinderWrapper.sendCustomAction(action, extras, ((android.support.v4.os.ResultReceiver) (iver)), mCallbacksMessenger);
	//   70  134:aload_0         
	//   71  135:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   72  138:aload_1         
	//   73  139:aload_2         
	//   74  140:aload           4
	//   75  142:aload_0         
	//   76  143:getfield        #111 <Field Messenger mCallbacksMessenger>
	//   77  146:invokevirtual   #353 <Method void MediaBrowserCompat$ServiceBinderWrapper.sendCustomAction(String, Bundle, android.support.v4.os.ResultReceiver, Messenger)>
			return;
	//   78  149:return          
		}
		catch(RemoteException remoteexception)
	//*  79  150:astore          4
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   80  152:new             #179 <Class StringBuilder>
	//   81  155:dup             
	//   82  156:invokespecial   #180 <Method void StringBuilder()>
	//   83  159:astore          5
			stringbuilder.append("Remote error sending a custom action: action=");
	//   84  161:aload           5
	//   85  163:ldc2            #355 <String "Remote error sending a custom action: action=">
	//   86  166:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   87  169:pop             
			stringbuilder.append(action);
	//   88  170:aload           5
	//   89  172:aload_1         
	//   90  173:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   91  176:pop             
			stringbuilder.append(", extras=");
	//   92  177:aload           5
	//   93  179:ldc2            #357 <String ", extras=">
	//   94  182:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   95  185:pop             
			stringbuilder.append(((Object) (extras)));
	//   96  186:aload           5
	//   97  188:aload_2         
	//   98  189:invokevirtual   #337 <Method StringBuilder StringBuilder.append(Object)>
	//   99  192:pop             
			Log.i("MediaBrowserCompat", stringbuilder.toString(), ((Throwable) (remoteexception)));
	//  100  193:ldc1            #119 <String "MediaBrowserCompat">
	//  101  195:aload           5
	//  102  197:invokevirtual   #190 <Method String StringBuilder.toString()>
	//  103  200:aload           4
	//  104  202:invokestatic    #325 <Method int Log.i(String, String, Throwable)>
	//  105  205:pop             
		}
		if(callback != null)
	//* 106  206:aload_3         
	//* 107  207:ifnull          229
			mHandler.post(new Runnable() {

				public void run()
				{
					callback.onError(action, extras, ((Bundle) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field MediaBrowserCompat$CustomActionCallback val$callback>
				//    2    4:aload_0         
				//    3    5:getfield        #30  <Field String val$action>
				//    4    8:aload_0         
				//    5    9:getfield        #32  <Field Bundle val$extras>
				//    6   12:aconst_null     
				//    7   13:invokevirtual   #43  <Method void MediaBrowserCompat$CustomActionCallback.onError(String, Bundle, Bundle)>
				//    8   16:return          
				}

				final MediaBrowserCompat.MediaBrowserImplApi21 this$0;
				final String val$action;
				final MediaBrowserCompat.CustomActionCallback val$callback;
				final Bundle val$extras;

			
			{
				this$0 = MediaBrowserCompat.MediaBrowserImplApi21.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaBrowserCompat$MediaBrowserImplApi21 this$0>
				callback = customactioncallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field MediaBrowserCompat$CustomActionCallback val$callback>
				action = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String val$action>
				extras = bundle;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field Bundle val$extras>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//  108  210:aload_0         
	//  109  211:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//  110  214:new             #27  <Class MediaBrowserCompat$MediaBrowserImplApi21$7>
	//  111  217:dup             
	//  112  218:aload_0         
	//  113  219:aload_3         
	//  114  220:aload_1         
	//  115  221:aload_2         
	//  116  222:invokespecial   #358 <Method void MediaBrowserCompat$MediaBrowserImplApi21$7(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$CustomActionCallback, String, Bundle)>
	//  117  225:invokevirtual   #167 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//  118  228:pop             
	//  119  229:return          
	}

	public void subscribe(String s, Bundle bundle, MediaBrowserCompat.SubscriptionCallback subscriptioncallback)
	{
		MediaBrowserCompat.Subscription subscription1 = (MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field ArrayMap mSubscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #266 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #268 <Class MediaBrowserCompat$Subscription>
	//    5   11:astore          5
		MediaBrowserCompat.Subscription subscription = subscription1;
	//    6   13:aload           5
	//    7   15:astore          4
		if(subscription1 == null)
	//*   8   17:aload           5
	//*   9   19:ifnonnull       42
		{
			subscription = new MediaBrowserCompat.Subscription();
	//   10   22:new             #268 <Class MediaBrowserCompat$Subscription>
	//   11   25:dup             
	//   12   26:invokespecial   #361 <Method void MediaBrowserCompat$Subscription()>
	//   13   29:astore          4
			mSubscriptions.put(((Object) (s)), ((Object) (subscription)));
	//   14   31:aload_0         
	//   15   32:getfield        #66  <Field ArrayMap mSubscriptions>
	//   16   35:aload_1         
	//   17   36:aload           4
	//   18   38:invokevirtual   #365 <Method Object ArrayMap.put(Object, Object)>
	//   19   41:pop             
		}
		MediaBrowserCompat.SubscriptionCallback.access$100(subscriptioncallback, subscription);
	//   20   42:aload_3         
	//   21   43:aload           4
	//   22   45:invokestatic    #369 <Method void MediaBrowserCompat$SubscriptionCallback.access$100(MediaBrowserCompat$SubscriptionCallback, MediaBrowserCompat$Subscription)>
		if(bundle == null)
	//*  23   48:aload_2         
	//*  24   49:ifnonnull       57
			bundle = null;
	//   25   52:aconst_null     
	//   26   53:astore_2        
		else
	//*  27   54:goto            66
			bundle = new Bundle(bundle);
	//   28   57:new             #70  <Class Bundle>
	//   29   60:dup             
	//   30   61:aload_2         
	//   31   62:invokespecial   #80  <Method void Bundle(Bundle)>
	//   32   65:astore_2        
		subscription.putCallback(mContext, bundle, subscriptioncallback);
	//   33   66:aload           4
	//   34   68:aload_0         
	//   35   69:getfield        #68  <Field Context mContext>
	//   36   72:aload_2         
	//   37   73:aload_3         
	//   38   74:invokevirtual   #373 <Method void MediaBrowserCompat$Subscription.putCallback(Context, Bundle, MediaBrowserCompat$SubscriptionCallback)>
		if(mServiceBinderWrapper == null)
	//*  39   77:aload_0         
	//*  40   78:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  41   81:ifnonnull       97
		{
			MediaBrowserCompatApi21.subscribe(mBrowserObj, s, MediaBrowserCompat.SubscriptionCallback.access$200(subscriptioncallback));
	//   42   84:aload_0         
	//   43   85:getfield        #99  <Field Object mBrowserObj>
	//   44   88:aload_1         
	//   45   89:aload_3         
	//   46   90:invokestatic    #377 <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
	//   47   93:invokestatic    #380 <Method void MediaBrowserCompatApi21.subscribe(Object, String, Object)>
			return;
	//   48   96:return          
		}
		try
		{
			mServiceBinderWrapper.addSubscription(s, MediaBrowserCompat.SubscriptionCallback.access$000(subscriptioncallback), bundle, mCallbacksMessenger);
	//   49   97:aload_0         
	//   50   98:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   51  101:aload_1         
	//   52  102:aload_3         
	//   53  103:invokestatic    #384 <Method android.os.IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
	//   54  106:aload_2         
	//   55  107:aload_0         
	//   56  108:getfield        #111 <Field Messenger mCallbacksMessenger>
	//   57  111:invokevirtual   #388 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, android.os.IBinder, Bundle, Messenger)>
			return;
	//   58  114:return          
		}
	//*  59  115:new             #179 <Class StringBuilder>
	//*  60  118:dup             
	//*  61  119:invokespecial   #180 <Method void StringBuilder()>
	//*  62  122:astore_2        
	//*  63  123:aload_2         
	//*  64  124:ldc2            #390 <String "Remote error subscribing media item: ">
	//*  65  127:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//*  66  130:pop             
	//*  67  131:aload_2         
	//*  68  132:aload_1         
	//*  69  133:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//*  70  136:pop             
	//*  71  137:ldc1            #119 <String "MediaBrowserCompat">
	//*  72  139:aload_2         
	//*  73  140:invokevirtual   #190 <Method String StringBuilder.toString()>
	//*  74  143:invokestatic    #127 <Method int Log.i(String, String)>
	//*  75  146:pop             
	//*  76  147:return          
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
		{
			bundle = ((Bundle) (new StringBuilder()));
		}
		((StringBuilder) (bundle)).append("Remote error subscribing media item: ");
		((StringBuilder) (bundle)).append(s);
		Log.i("MediaBrowserCompat", ((StringBuilder) (bundle)).toString());
	//*  77  148:astore_2        
	//*  78  149:goto            115
	}

	public void unsubscribe(String s, MediaBrowserCompat.SubscriptionCallback subscriptioncallback)
	{
		MediaBrowserCompat.Subscription subscription;
		subscription = (MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field ArrayMap mSubscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #266 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #268 <Class MediaBrowserCompat$Subscription>
	//    5   11:astore          4
		if(subscription == null)
	//*   6   13:aload           4
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		if(mServiceBinderWrapper != null) goto _L2; else goto _L1
	//    9   19:aload_0         
	//   10   20:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   11   23:ifnonnull       127
_L1:
		if(subscriptioncallback == null)
	//*  12   26:aload_2         
	//*  13   27:ifnonnull       41
		{
			MediaBrowserCompatApi21.unsubscribe(mBrowserObj, s);
	//   14   30:aload_0         
	//   15   31:getfield        #99  <Field Object mBrowserObj>
	//   16   34:aload_1         
	//   17   35:invokestatic    #395 <Method void MediaBrowserCompatApi21.unsubscribe(Object, String)>
		} else
	//*  18   38:goto            264
		{
			List list = subscription.getCallbacks();
	//   19   41:aload           4
	//   20   43:invokevirtual   #399 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
	//   21   46:astore          5
			List list1 = subscription.getOptionsList();
	//   22   48:aload           4
	//   23   50:invokevirtual   #402 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
	//   24   53:astore          6
			for(int i = list.size() - 1; i >= 0; i--)
	//*  25   55:aload           5
	//*  26   57:invokeinterface #408 <Method int List.size()>
	//*  27   62:iconst_1        
	//*  28   63:isub            
	//*  29   64:istore_3        
	//*  30   65:iload_3         
	//*  31   66:iflt            106
				if(list.get(i) == subscriptioncallback)
	//*  32   69:aload           5
	//*  33   71:iload_3         
	//*  34   72:invokeinterface #411 <Method Object List.get(int)>
	//*  35   77:aload_2         
	//*  36   78:if_acmpne       99
				{
					list.remove(i);
	//   37   81:aload           5
	//   38   83:iload_3         
	//   39   84:invokeinterface #414 <Method Object List.remove(int)>
	//   40   89:pop             
					list1.remove(i);
	//   41   90:aload           6
	//   42   92:iload_3         
	//   43   93:invokeinterface #414 <Method Object List.remove(int)>
	//   44   98:pop             
				}

	//   45   99:iload_3         
	//   46  100:iconst_1        
	//   47  101:isub            
	//   48  102:istore_3        
	//*  49  103:goto            65
			if(list.size() == 0)
	//*  50  106:aload           5
	//*  51  108:invokeinterface #408 <Method int List.size()>
	//*  52  113:ifne            264
				MediaBrowserCompatApi21.unsubscribe(mBrowserObj, s);
	//   53  116:aload_0         
	//   54  117:getfield        #99  <Field Object mBrowserObj>
	//   55  120:aload_1         
	//   56  121:invokestatic    #395 <Method void MediaBrowserCompatApi21.unsubscribe(Object, String)>
		}
		  goto _L3
	//*  57  124:goto            264
_L2:
		if(subscriptioncallback != null) goto _L5; else goto _L4
	//   58  127:aload_2         
	//   59  128:ifnonnull       147
_L4:
		int j;
		Object obj;
		List list2;
		try
		{
			mServiceBinderWrapper.removeSubscription(s, ((android.os.IBinder) (null)), mCallbacksMessenger);
	//   60  131:aload_0         
	//   61  132:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   62  135:aload_1         
	//   63  136:aconst_null     
	//   64  137:aload_0         
	//   65  138:getfield        #111 <Field Messenger mCallbacksMessenger>
	//   66  141:invokevirtual   #418 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, android.os.IBinder, Messenger)>
		}
	//*  67  144:goto            264
	//*  68  147:aload           4
	//*  69  149:invokevirtual   #399 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
	//*  70  152:astore          5
	//*  71  154:aload           4
	//*  72  156:invokevirtual   #402 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
	//*  73  159:astore          6
	//*  74  161:aload           5
	//*  75  163:invokeinterface #408 <Method int List.size()>
	//*  76  168:iconst_1        
	//*  77  169:isub            
	//*  78  170:istore_3        
	//*  79  171:iload_3         
	//*  80  172:iflt            264
	//*  81  175:aload           5
	//*  82  177:iload_3         
	//*  83  178:invokeinterface #411 <Method Object List.get(int)>
	//*  84  183:aload_2         
	//*  85  184:if_acmpne       221
	//*  86  187:aload_0         
	//*  87  188:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  88  191:aload_1         
	//*  89  192:aload_2         
	//*  90  193:invokestatic    #384 <Method android.os.IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
	//*  91  196:aload_0         
	//*  92  197:getfield        #111 <Field Messenger mCallbacksMessenger>
	//*  93  200:invokevirtual   #418 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, android.os.IBinder, Messenger)>
	//*  94  203:aload           5
	//*  95  205:iload_3         
	//*  96  206:invokeinterface #414 <Method Object List.remove(int)>
	//*  97  211:pop             
	//*  98  212:aload           6
	//*  99  214:iload_3         
	//* 100  215:invokeinterface #414 <Method Object List.remove(int)>
	//* 101  220:pop             
	//* 102  221:iload_3         
	//* 103  222:iconst_1        
	//* 104  223:isub            
	//* 105  224:istore_3        
	//* 106  225:goto            171
	//* 107  228:new             #179 <Class StringBuilder>
	//* 108  231:dup             
	//* 109  232:invokespecial   #180 <Method void StringBuilder()>
	//* 110  235:astore          5
	//* 111  237:aload           5
	//* 112  239:ldc2            #420 <String "removeSubscription failed with RemoteException parentId=">
	//* 113  242:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//* 114  245:pop             
	//* 115  246:aload           5
	//* 116  248:aload_1         
	//* 117  249:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//* 118  252:pop             
	//* 119  253:ldc1            #119 <String "MediaBrowserCompat">
	//* 120  255:aload           5
	//* 121  257:invokevirtual   #190 <Method String StringBuilder.toString()>
	//* 122  260:invokestatic    #277 <Method int Log.d(String, String)>
	//* 123  263:pop             
	//* 124  264:aload           4
	//* 125  266:invokevirtual   #422 <Method boolean MediaBrowserCompat$Subscription.isEmpty()>
	//* 126  269:ifne            276
	//* 127  272:aload_2         
	//* 128  273:ifnonnull       285
	//* 129  276:aload_0         
	//* 130  277:getfield        #66  <Field ArrayMap mSubscriptions>
	//* 131  280:aload_1         
	//* 132  281:invokevirtual   #424 <Method Object ArrayMap.remove(Object)>
	//* 133  284:pop             
	//* 134  285:return          
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("removeSubscription failed with RemoteException parentId=");
			((StringBuilder) (obj)).append(s);
			Log.d("MediaBrowserCompat", ((StringBuilder) (obj)).toString());
		}
		  goto _L3
_L5:
		obj = ((Object) (subscription.getCallbacks()));
		list2 = subscription.getOptionsList();
		j = ((List) (obj)).size() - 1;
_L6:
		if(j < 0)
			break; /* Loop/switch isn't completed */
		if(((List) (obj)).get(j) == subscriptioncallback)
		{
			mServiceBinderWrapper.removeSubscription(s, MediaBrowserCompat.SubscriptionCallback.access$000(subscriptioncallback), mCallbacksMessenger);
			((List) (obj)).remove(j);
			list2.remove(j);
		}
		j--;
		if(true) goto _L6; else goto _L3
_L3:
		RemoteException remoteexception;
		if(subscription.isEmpty() || subscriptioncallback == null)
			mSubscriptions.remove(((Object) (s)));
		return;
	//* 135  286:astore          5
	//* 136  288:goto            228
	}

	protected final Object mBrowserObj;
	protected Messenger mCallbacksMessenger;
	final Context mContext;
	protected final MediaBrowserCompat.CallbackHandler mHandler = new MediaBrowserCompat.CallbackHandler(((lbackImpl) (this)));
	private android.support.v4.media.session.MediaSessionCompat.Token mMediaSessionToken;
	protected final Bundle mRootHints;
	protected MediaBrowserCompat.ServiceBinderWrapper mServiceBinderWrapper;
	protected int mServiceVersion;
	private final ArrayMap mSubscriptions = new ArrayMap();

	MediaBrowserCompat$MediaBrowserImplApi21(Context context, ComponentName componentname, MediaBrowserCompat.ConnectionCallback connectioncallback, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #56  <Class MediaBrowserCompat$CallbackHandler>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #59  <Method void MediaBrowserCompat$CallbackHandler(MediaBrowserCompat$MediaBrowserServiceCallbackImpl)>
	//    7   13:putfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//    8   16:aload_0         
	//    9   17:new             #63  <Class ArrayMap>
	//   10   20:dup             
	//   11   21:invokespecial   #64  <Method void ArrayMap()>
	//   12   24:putfield        #66  <Field ArrayMap mSubscriptions>
		mContext = context;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #68  <Field Context mContext>
		Bundle bundle1 = bundle;
	//   16   32:aload           4
	//   17   34:astore          5
		if(bundle == null)
	//*  18   36:aload           4
	//*  19   38:ifnonnull       50
			bundle1 = new Bundle();
	//   20   41:new             #70  <Class Bundle>
	//   21   44:dup             
	//   22   45:invokespecial   #71  <Method void Bundle()>
	//   23   48:astore          5
		bundle1.putInt("extra_client_version", 1);
	//   24   50:aload           5
	//   25   52:ldc1            #73  <String "extra_client_version">
	//   26   54:iconst_1        
	//   27   55:invokevirtual   #77  <Method void Bundle.putInt(String, int)>
		mRootHints = new Bundle(bundle1);
	//   28   58:aload_0         
	//   29   59:new             #70  <Class Bundle>
	//   30   62:dup             
	//   31   63:aload           5
	//   32   65:invokespecial   #80  <Method void Bundle(Bundle)>
	//   33   68:putfield        #82  <Field Bundle mRootHints>
		connectioncallback.setInternalConnectionCallback(((nectionCallbackInternal) (this)));
	//   34   71:aload_3         
	//   35   72:aload_0         
	//   36   73:invokevirtual   #88  <Method void MediaBrowserCompat$ConnectionCallback.setInternalConnectionCallback(MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal)>
		mBrowserObj = MediaBrowserCompatApi21.createBrowser(context, componentname, connectioncallback.mConnectionCallbackObj, mRootHints);
	//   37   76:aload_0         
	//   38   77:aload_1         
	//   39   78:aload_2         
	//   40   79:aload_3         
	//   41   80:getfield        #91  <Field Object MediaBrowserCompat$ConnectionCallback.mConnectionCallbackObj>
	//   42   83:aload_0         
	//   43   84:getfield        #82  <Field Bundle mRootHints>
	//   44   87:invokestatic    #97  <Method Object MediaBrowserCompatApi21.createBrowser(Context, ComponentName, Object, Bundle)>
	//   45   90:putfield        #99  <Field Object mBrowserObj>
	//   46   93:return          
	}
}
