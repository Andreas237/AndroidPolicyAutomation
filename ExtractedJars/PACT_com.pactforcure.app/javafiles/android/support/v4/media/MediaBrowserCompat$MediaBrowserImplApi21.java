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
	//    1    1:getfield        #97  <Field Object mBrowserObj>
	//    2    4:invokestatic    #102 <Method void MediaBrowserCompatApi21.connect(Object)>
	//    3    7:return          
	}

	public void disconnect()
	{
		if(mServiceBinderWrapper != null && mCallbacksMessenger != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #109 <Field Messenger mCallbacksMessenger>
	//*   5   11:ifnull          25
			try
			{
				mServiceBinderWrapper.unregisterCallbackMessenger(mCallbacksMessenger);
	//    6   14:aload_0         
	//    7   15:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//    8   18:aload_0         
	//    9   19:getfield        #109 <Field Messenger mCallbacksMessenger>
	//   10   22:invokevirtual   #115 <Method void MediaBrowserCompat$ServiceBinderWrapper.unregisterCallbackMessenger(Messenger)>
			}
	//*  11   25:aload_0         
	//*  12   26:getfield        #97  <Field Object mBrowserObj>
	//*  13   29:invokestatic    #117 <Method void MediaBrowserCompatApi21.disconnect(Object)>
	//*  14   32:return          
			catch(RemoteException remoteexception)
	//*  15   33:astore_1        
			{
				Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
	//   16   34:ldc1            #119 <String "MediaBrowserCompat">
	//   17   36:ldc1            #121 <String "Remote error unregistering client messenger.">
	//   18   38:invokestatic    #127 <Method int Log.i(String, String)>
	//   19   41:pop             
			}
		MediaBrowserCompatApi21.disconnect(mBrowserObj);
	//*  20   42:goto            25
	}

	public Bundle getExtras()
	{
		return MediaBrowserCompatApi21.getExtras(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Object mBrowserObj>
	//    2    4:invokestatic    #133 <Method Bundle MediaBrowserCompatApi21.getExtras(Object)>
	//    3    7:areturn         
	}

	public void getItem(final String mediaId, final MediaBrowserCompat.ItemCallback cb)
	{
		if(TextUtils.isEmpty(((CharSequence) (mediaId))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #143 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("mediaId is empty");
	//    3    7:new             #145 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #147 <String "mediaId is empty">
	//    6   13:invokespecial   #150 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(cb == null)
	//*   8   17:aload_2         
	//*   9   18:ifnonnull       31
			throw new IllegalArgumentException("cb is null");
	//   10   21:new             #145 <Class IllegalArgumentException>
	//   11   24:dup             
	//   12   25:ldc1            #152 <String "cb is null">
	//   13   27:invokespecial   #150 <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
		if(!MediaBrowserCompatApi21.isConnected(mBrowserObj))
	//*  15   31:aload_0         
	//*  16   32:getfield        #97  <Field Object mBrowserObj>
	//*  17   35:invokestatic    #156 <Method boolean MediaBrowserCompatApi21.isConnected(Object)>
	//*  18   38:ifne            68
		{
			Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
	//   19   41:ldc1            #119 <String "MediaBrowserCompat">
	//   20   43:ldc1            #158 <String "Not connected, unable to retrieve the MediaItem.">
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
	//   24   50:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   25   53:new             #15  <Class MediaBrowserCompat$MediaBrowserImplApi21$1>
	//   26   56:dup             
	//   27   57:aload_0         
	//   28   58:aload_2         
	//   29   59:aload_1         
	//   30   60:invokespecial   #161 <Method void MediaBrowserCompat$MediaBrowserImplApi21$1(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$ItemCallback, String)>
	//   31   63:invokevirtual   #165 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   32   66:pop             
			return;
	//   33   67:return          
		}
		if(mServiceBinderWrapper == null)
	//*  34   68:aload_0         
	//*  35   69:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
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
	//   38   76:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   39   79:new             #17  <Class MediaBrowserCompat$MediaBrowserImplApi21$2>
	//   40   82:dup             
	//   41   83:aload_0         
	//   42   84:aload_2         
	//   43   85:aload_1         
	//   44   86:invokespecial   #166 <Method void MediaBrowserCompat$MediaBrowserImplApi21$2(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$ItemCallback, String)>
	//   45   89:invokevirtual   #165 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   46   92:pop             
			return;
	//   47   93:return          
		}
		MediaBrowserCompat.ItemReceiver itemreceiver = new MediaBrowserCompat.ItemReceiver(mediaId, cb, ((android.os.Handler) (mHandler)));
	//   48   94:new             #168 <Class MediaBrowserCompat$ItemReceiver>
	//   49   97:dup             
	//   50   98:aload_1         
	//   51   99:aload_2         
	//   52  100:aload_0         
	//   53  101:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   54  104:invokespecial   #171 <Method void MediaBrowserCompat$ItemReceiver(String, MediaBrowserCompat$ItemCallback, android.os.Handler)>
	//   55  107:astore_3        
		try
		{
			mServiceBinderWrapper.getMediaItem(mediaId, ((android.support.v4.os.ResultReceiver) (itemreceiver)), mCallbacksMessenger);
	//   56  108:aload_0         
	//   57  109:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   58  112:aload_1         
	//   59  113:aload_3         
	//   60  114:aload_0         
	//   61  115:getfield        #109 <Field Messenger mCallbacksMessenger>
	//   62  118:invokevirtual   #175 <Method void MediaBrowserCompat$ServiceBinderWrapper.getMediaItem(String, android.support.v4.os.ResultReceiver, Messenger)>
			return;
	//   63  121:return          
		}
		catch(RemoteException remoteexception)
	//*  64  122:astore_3        
		{
			Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error getting media item: ").append(mediaId).toString());
	//   65  123:ldc1            #119 <String "MediaBrowserCompat">
	//   66  125:new             #177 <Class StringBuilder>
	//   67  128:dup             
	//   68  129:invokespecial   #178 <Method void StringBuilder()>
	//   69  132:ldc1            #180 <String "Remote error getting media item: ">
	//   70  134:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   71  137:aload_1         
	//   72  138:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   73  141:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   74  144:invokestatic    #127 <Method int Log.i(String, String)>
	//   75  147:pop             
		}
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
	//   76  148:aload_0         
	//   77  149:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   78  152:new             #19  <Class MediaBrowserCompat$MediaBrowserImplApi21$3>
	//   79  155:dup             
	//   80  156:aload_0         
	//   81  157:aload_2         
	//   82  158:aload_1         
	//   83  159:invokespecial   #189 <Method void MediaBrowserCompat$MediaBrowserImplApi21$3(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$ItemCallback, String)>
	//   84  162:invokevirtual   #165 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   85  165:pop             
	//   86  166:return          
	}

	public String getRoot()
	{
		return MediaBrowserCompatApi21.getRoot(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Object mBrowserObj>
	//    2    4:invokestatic    #194 <Method String MediaBrowserCompatApi21.getRoot(Object)>
	//    3    7:areturn         
	}

	public ComponentName getServiceComponent()
	{
		return MediaBrowserCompatApi21.getServiceComponent(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Object mBrowserObj>
	//    2    4:invokestatic    #199 <Method ComponentName MediaBrowserCompatApi21.getServiceComponent(Object)>
	//    3    7:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
	{
		if(mMediaSessionToken == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #203 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//*   2    4:ifnonnull       21
			mMediaSessionToken = android.support.v4.media.session.MediaSessionCompat.Token.fromToken(MediaBrowserCompatApi21.getSessionToken(mBrowserObj));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #97  <Field Object mBrowserObj>
	//    6   12:invokestatic    #206 <Method Object MediaBrowserCompatApi21.getSessionToken(Object)>
	//    7   15:invokestatic    #212 <Method android.support.v4.media.session.MediaSessionCompat$Token android.support.v4.media.session.MediaSessionCompat$Token.fromToken(Object)>
	//    8   18:putfield        #203 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		return mMediaSessionToken;
	//    9   21:aload_0         
	//   10   22:getfield        #203 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//   11   25:areturn         
	}

	public boolean isConnected()
	{
		return MediaBrowserCompatApi21.isConnected(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Object mBrowserObj>
	//    2    4:invokestatic    #156 <Method boolean MediaBrowserCompatApi21.isConnected(Object)>
	//    3    7:ireturn         
	}

	public void onConnected()
	{
		Object obj = ((Object) (MediaBrowserCompatApi21.getExtras(mBrowserObj)));
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Object mBrowserObj>
	//    2    4:invokestatic    #133 <Method Bundle MediaBrowserCompatApi21.getExtras(Object)>
	//    3    7:astore_1        
		if(obj != null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       13
	//*   6   12:return          
		{
			android.os.IBinder ibinder = BundleCompat.getBinder(((Bundle) (obj)), "extra_messenger");
	//    7   13:aload_1         
	//    8   14:ldc1            #216 <String "extra_messenger">
	//    9   16:invokestatic    #222 <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//   10   19:astore_2        
			if(ibinder != null)
	//*  11   20:aload_2         
	//*  12   21:ifnull          77
			{
				mServiceBinderWrapper = new MediaBrowserCompat.ServiceBinderWrapper(ibinder, mRootHints);
	//   13   24:aload_0         
	//   14   25:new             #111 <Class MediaBrowserCompat$ServiceBinderWrapper>
	//   15   28:dup             
	//   16   29:aload_2         
	//   17   30:aload_0         
	//   18   31:getfield        #80  <Field Bundle mRootHints>
	//   19   34:invokespecial   #225 <Method void MediaBrowserCompat$ServiceBinderWrapper(android.os.IBinder, Bundle)>
	//   20   37:putfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
				mCallbacksMessenger = new Messenger(((android.os.Handler) (mHandler)));
	//   21   40:aload_0         
	//   22   41:new             #227 <Class Messenger>
	//   23   44:dup             
	//   24   45:aload_0         
	//   25   46:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   26   49:invokespecial   #230 <Method void Messenger(android.os.Handler)>
	//   27   52:putfield        #109 <Field Messenger mCallbacksMessenger>
				mHandler.setCallbacksMessenger(mCallbacksMessenger);
	//   28   55:aload_0         
	//   29   56:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   30   59:aload_0         
	//   31   60:getfield        #109 <Field Messenger mCallbacksMessenger>
	//   32   63:invokevirtual   #233 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
				try
				{
					mServiceBinderWrapper.registerCallbackMessenger(mCallbacksMessenger);
	//   33   66:aload_0         
	//   34   67:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   35   70:aload_0         
	//   36   71:getfield        #109 <Field Messenger mCallbacksMessenger>
	//   37   74:invokevirtual   #236 <Method void MediaBrowserCompat$ServiceBinderWrapper.registerCallbackMessenger(Messenger)>
				}
	//*  38   77:aload_1         
	//*  39   78:ldc1            #238 <String "extra_session_binder">
	//*  40   80:invokestatic    #222 <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//*  41   83:invokestatic    #244 <Method android.support.v4.media.session.IMediaSession android.support.v4.media.session.IMediaSession$Stub.asInterface(android.os.IBinder)>
	//*  42   86:astore_1        
	//*  43   87:aload_1         
	//*  44   88:ifnull          12
	//*  45   91:aload_0         
	//*  46   92:aload_0         
	//*  47   93:getfield        #97  <Field Object mBrowserObj>
	//*  48   96:invokestatic    #206 <Method Object MediaBrowserCompatApi21.getSessionToken(Object)>
	//*  49   99:aload_1         
	//*  50  100:invokestatic    #247 <Method android.support.v4.media.session.MediaSessionCompat$Token android.support.v4.media.session.MediaSessionCompat$Token.fromToken(Object, android.support.v4.media.session.IMediaSession)>
	//*  51  103:putfield        #203 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//*  52  106:return          
				catch(RemoteException remoteexception)
	//*  53  107:astore_2        
				{
					Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
	//   54  108:ldc1            #119 <String "MediaBrowserCompat">
	//   55  110:ldc1            #249 <String "Remote error registering client messenger.">
	//   56  112:invokestatic    #127 <Method int Log.i(String, String)>
	//   57  115:pop             
				}
			}
			obj = ((Object) (android.support.v4.media.session.IMediaSession.Stub.asInterface(BundleCompat.getBinder(((Bundle) (obj)), "extra_session_binder"))));
			if(obj != null)
			{
				mMediaSessionToken = android.support.v4.media.session.MediaSessionCompat.Token.fromToken(MediaBrowserCompatApi21.getSessionToken(mBrowserObj), ((android.support.v4.media.session.IMediaSession) (obj)));
				return;
			}
		}
	//*  58  116:goto            77
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
	//    2    2:putfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		mCallbacksMessenger = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #109 <Field Messenger mCallbacksMessenger>
		mMediaSessionToken = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #203 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		mHandler.setCallbacksMessenger(((Messenger) (null)));
	//    9   15:aload_0         
	//   10   16:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   11   19:aconst_null     
	//   12   20:invokevirtual   #233 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
	//   13   23:return          
	}

	public void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle)
	{
		if(mCallbacksMessenger == messenger) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Messenger mCallbacksMessenger>
	//    2    4:aload_1         
	//    3    5:if_acmpeq       9
_L1:
		return;
	//    4    8:return          
_L2:
		messenger = ((Messenger) ((MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)))));
	//    5    9:aload_0         
	//    6   10:getfield        #64  <Field ArrayMap mSubscriptions>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #256 <Method Object ArrayMap.get(Object)>
	//    9   17:checkcast       #258 <Class MediaBrowserCompat$Subscription>
	//   10   20:astore_1        
		if(messenger != null)
			break; /* Loop/switch isn't completed */
	//   11   21:aload_1         
	//   12   22:ifnonnull       58
		if(MediaBrowserCompat.DEBUG)
	//*  13   25:getstatic       #262 <Field boolean MediaBrowserCompat.DEBUG>
	//*  14   28:ifeq            8
		{
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("onLoadChildren for id that isn't subscribed id=").append(s).toString());
	//   15   31:ldc1            #119 <String "MediaBrowserCompat">
	//   16   33:new             #177 <Class StringBuilder>
	//   17   36:dup             
	//   18   37:invokespecial   #178 <Method void StringBuilder()>
	//   19   40:ldc2            #264 <String "onLoadChildren for id that isn't subscribed id=">
	//   20   43:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:aload_2         
	//   22   47:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   23   50:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   24   53:invokestatic    #267 <Method int Log.d(String, String)>
	//   25   56:pop             
			return;
	//   26   57:return          
		}
		if(true) goto _L1; else goto _L3
_L3:
		messenger = ((Messenger) (((MediaBrowserCompat.Subscription) (messenger)).getCallback(mContext, bundle)));
	//   27   58:aload_1         
	//   28   59:aload_0         
	//   29   60:getfield        #66  <Field Context mContext>
	//   30   63:aload           4
	//   31   65:invokevirtual   #271 <Method MediaBrowserCompat$SubscriptionCallback MediaBrowserCompat$Subscription.getCallback(Context, Bundle)>
	//   32   68:astore_1        
		if(messenger != null)
	//*  33   69:aload_1         
	//*  34   70:ifnull          8
		{
			if(bundle == null)
	//*  35   73:aload           4
	//*  36   75:ifnonnull       95
				if(list == null)
	//*  37   78:aload_3         
	//*  38   79:ifnonnull       88
				{
					((MediaBrowserCompat.SubscriptionCallback) (messenger)).onError(s);
	//   39   82:aload_1         
	//   40   83:aload_2         
	//   41   84:invokevirtual   #276 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
					return;
	//   42   87:return          
				} else
				{
					((MediaBrowserCompat.SubscriptionCallback) (messenger)).onChildrenLoaded(s, list);
	//   43   88:aload_1         
	//   44   89:aload_2         
	//   45   90:aload_3         
	//   46   91:invokevirtual   #280 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
					return;
	//   47   94:return          
				}
			if(list == null)
	//*  48   95:aload_3         
	//*  49   96:ifnonnull       107
			{
				((MediaBrowserCompat.SubscriptionCallback) (messenger)).onError(s, bundle);
	//   50   99:aload_1         
	//   51  100:aload_2         
	//   52  101:aload           4
	//   53  103:invokevirtual   #283 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
				return;
	//   54  106:return          
			} else
			{
				((MediaBrowserCompat.SubscriptionCallback) (messenger)).onChildrenLoaded(s, list, bundle);
	//   55  107:aload_1         
	//   56  108:aload_2         
	//   57  109:aload_3         
	//   58  110:aload           4
	//   59  112:invokevirtual   #286 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
				return;
	//   60  115:return          
			}
		}
		if(true) goto _L1; else goto _L4
_L4:
	}

	public void onServiceConnected(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
	{
	//    0    0:return          
	}

	public void search(final String query, final Bundle extras, final MediaBrowserCompat.SearchCallback callback)
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #292 <Method boolean isConnected()>
	//*   2    4:ifne            18
			throw new IllegalStateException("search() called while not connected");
	//    3    7:new             #294 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #296 <String "search() called while not connected">
	//    6   14:invokespecial   #297 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(mServiceBinderWrapper == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  10   22:ifnonnull       54
		{
			Log.i("MediaBrowserCompat", "The connected service doesn't support search.");
	//   11   25:ldc1            #119 <String "MediaBrowserCompat">
	//   12   27:ldc2            #299 <String "The connected service doesn't support search.">
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
	//   16   35:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   17   38:new             #21  <Class MediaBrowserCompat$MediaBrowserImplApi21$4>
	//   18   41:dup             
	//   19   42:aload_0         
	//   20   43:aload_3         
	//   21   44:aload_1         
	//   22   45:aload_2         
	//   23   46:invokespecial   #302 <Method void MediaBrowserCompat$MediaBrowserImplApi21$4(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$SearchCallback, String, Bundle)>
	//   24   49:invokevirtual   #165 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   25   52:pop             
			return;
	//   26   53:return          
		}
		MediaBrowserCompat.SearchResultReceiver searchresultreceiver = new MediaBrowserCompat.SearchResultReceiver(query, extras, callback, ((android.os.Handler) (mHandler)));
	//   27   54:new             #304 <Class MediaBrowserCompat$SearchResultReceiver>
	//   28   57:dup             
	//   29   58:aload_1         
	//   30   59:aload_2         
	//   31   60:aload_3         
	//   32   61:aload_0         
	//   33   62:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   34   65:invokespecial   #307 <Method void MediaBrowserCompat$SearchResultReceiver(String, Bundle, MediaBrowserCompat$SearchCallback, android.os.Handler)>
	//   35   68:astore          4
		try
		{
			mServiceBinderWrapper.search(query, extras, ((android.support.v4.os.ResultReceiver) (searchresultreceiver)), mCallbacksMessenger);
	//   36   70:aload_0         
	//   37   71:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   38   74:aload_1         
	//   39   75:aload_2         
	//   40   76:aload           4
	//   41   78:aload_0         
	//   42   79:getfield        #109 <Field Messenger mCallbacksMessenger>
	//   43   82:invokevirtual   #310 <Method void MediaBrowserCompat$ServiceBinderWrapper.search(String, Bundle, android.support.v4.os.ResultReceiver, Messenger)>
			return;
	//   44   85:return          
		}
		catch(RemoteException remoteexception)
	//*  45   86:astore          4
		{
			Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error searching items with query: ").append(query).toString(), ((Throwable) (remoteexception)));
	//   46   88:ldc1            #119 <String "MediaBrowserCompat">
	//   47   90:new             #177 <Class StringBuilder>
	//   48   93:dup             
	//   49   94:invokespecial   #178 <Method void StringBuilder()>
	//   50   97:ldc2            #312 <String "Remote error searching items with query: ">
	//   51  100:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   52  103:aload_1         
	//   53  104:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   54  107:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   55  110:aload           4
	//   56  112:invokestatic    #315 <Method int Log.i(String, String, Throwable)>
	//   57  115:pop             
		}
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
	//   58  116:aload_0         
	//   59  117:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   60  120:new             #23  <Class MediaBrowserCompat$MediaBrowserImplApi21$5>
	//   61  123:dup             
	//   62  124:aload_0         
	//   63  125:aload_3         
	//   64  126:aload_1         
	//   65  127:aload_2         
	//   66  128:invokespecial   #316 <Method void MediaBrowserCompat$MediaBrowserImplApi21$5(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$SearchCallback, String, Bundle)>
	//   67  131:invokevirtual   #165 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   68  134:pop             
	//   69  135:return          
	}

	public void sendCustomAction(final String action, final Bundle extras, final MediaBrowserCompat.CustomActionCallback callback)
	{
		iver iver;
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #292 <Method boolean isConnected()>
	//*   2    4:ifne            63
			throw new IllegalStateException((new StringBuilder()).append("Cannot send a custom action (").append(action).append(") with ").append("extras ").append(((Object) (extras))).append(" because the browser is not connected to the ").append("service.").toString());
	//    3    7:new             #294 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #177 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #178 <Method void StringBuilder()>
	//    8   18:ldc2            #320 <String "Cannot send a custom action (">
	//    9   21:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_1         
	//   11   25:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:ldc2            #322 <String ") with ">
	//   13   31:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:ldc2            #324 <String "extras ">
	//   15   37:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   16   40:aload_2         
	//   17   41:invokevirtual   #327 <Method StringBuilder StringBuilder.append(Object)>
	//   18   44:ldc2            #329 <String " because the browser is not connected to the ">
	//   19   47:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   20   50:ldc2            #331 <String "service.">
	//   21   53:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   22   56:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   23   59:invokespecial   #297 <Method void IllegalStateException(String)>
	//   24   62:athrow          
		if(mServiceBinderWrapper == null)
	//*  25   63:aload_0         
	//*  26   64:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  27   67:ifnonnull       102
		{
			Log.i("MediaBrowserCompat", "The connected service doesn't support sendCustomAction.");
	//   28   70:ldc1            #119 <String "MediaBrowserCompat">
	//   29   72:ldc2            #333 <String "The connected service doesn't support sendCustomAction.">
	//   30   75:invokestatic    #127 <Method int Log.i(String, String)>
	//   31   78:pop             
			if(callback != null)
	//*  32   79:aload_3         
	//*  33   80:ifnull          102
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
	//   34   83:aload_0         
	//   35   84:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   36   87:new             #25  <Class MediaBrowserCompat$MediaBrowserImplApi21$6>
	//   37   90:dup             
	//   38   91:aload_0         
	//   39   92:aload_3         
	//   40   93:aload_1         
	//   41   94:aload_2         
	//   42   95:invokespecial   #336 <Method void MediaBrowserCompat$MediaBrowserImplApi21$6(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$CustomActionCallback, String, Bundle)>
	//   43   98:invokevirtual   #165 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   44  101:pop             
		}
		iver = new iver(action, extras, callback, ((android.os.Handler) (mHandler)));
	//   45  102:new             #338 <Class MediaBrowserCompat$CustomActionResultReceiver>
	//   46  105:dup             
	//   47  106:aload_1         
	//   48  107:aload_2         
	//   49  108:aload_3         
	//   50  109:aload_0         
	//   51  110:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   52  113:invokespecial   #341 <Method void MediaBrowserCompat$CustomActionResultReceiver(String, Bundle, MediaBrowserCompat$CustomActionCallback, android.os.Handler)>
	//   53  116:astore          4
		mServiceBinderWrapper.sendCustomAction(action, extras, ((android.support.v4.os.ResultReceiver) (iver)), mCallbacksMessenger);
	//   54  118:aload_0         
	//   55  119:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   56  122:aload_1         
	//   57  123:aload_2         
	//   58  124:aload           4
	//   59  126:aload_0         
	//   60  127:getfield        #109 <Field Messenger mCallbacksMessenger>
	//   61  130:invokevirtual   #343 <Method void MediaBrowserCompat$ServiceBinderWrapper.sendCustomAction(String, Bundle, android.support.v4.os.ResultReceiver, Messenger)>
_L1:
		return;
	//   62  133:return          
		RemoteException remoteexception;
		remoteexception;
	//   63  134:astore          4
		Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error sending a custom action: action=").append(action).append(", extras=").append(((Object) (extras))).toString(), ((Throwable) (remoteexception)));
	//   64  136:ldc1            #119 <String "MediaBrowserCompat">
	//   65  138:new             #177 <Class StringBuilder>
	//   66  141:dup             
	//   67  142:invokespecial   #178 <Method void StringBuilder()>
	//   68  145:ldc2            #345 <String "Remote error sending a custom action: action=">
	//   69  148:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   70  151:aload_1         
	//   71  152:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   72  155:ldc2            #347 <String ", extras=">
	//   73  158:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   74  161:aload_2         
	//   75  162:invokevirtual   #327 <Method StringBuilder StringBuilder.append(Object)>
	//   76  165:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   77  168:aload           4
	//   78  170:invokestatic    #315 <Method int Log.i(String, String, Throwable)>
	//   79  173:pop             
		if(callback != null)
	//*  80  174:aload_3         
	//*  81  175:ifnull          133
		{
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
	//   82  178:aload_0         
	//   83  179:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   84  182:new             #27  <Class MediaBrowserCompat$MediaBrowserImplApi21$7>
	//   85  185:dup             
	//   86  186:aload_0         
	//   87  187:aload_3         
	//   88  188:aload_1         
	//   89  189:aload_2         
	//   90  190:invokespecial   #348 <Method void MediaBrowserCompat$MediaBrowserImplApi21$7(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$CustomActionCallback, String, Bundle)>
	//   91  193:invokevirtual   #165 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   92  196:pop             
			return;
	//   93  197:return          
		}
		  goto _L1
	}

	public void subscribe(String s, Bundle bundle, MediaBrowserCompat.SubscriptionCallback subscriptioncallback)
	{
		MediaBrowserCompat.Subscription subscription1 = (MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ArrayMap mSubscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #256 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #258 <Class MediaBrowserCompat$Subscription>
	//    5   11:astore          5
		MediaBrowserCompat.Subscription subscription = subscription1;
	//    6   13:aload           5
	//    7   15:astore          4
		if(subscription1 == null)
	//*   8   17:aload           5
	//*   9   19:ifnonnull       42
		{
			subscription = new MediaBrowserCompat.Subscription();
	//   10   22:new             #258 <Class MediaBrowserCompat$Subscription>
	//   11   25:dup             
	//   12   26:invokespecial   #351 <Method void MediaBrowserCompat$Subscription()>
	//   13   29:astore          4
			mSubscriptions.put(((Object) (s)), ((Object) (subscription)));
	//   14   31:aload_0         
	//   15   32:getfield        #64  <Field ArrayMap mSubscriptions>
	//   16   35:aload_1         
	//   17   36:aload           4
	//   18   38:invokevirtual   #355 <Method Object ArrayMap.put(Object, Object)>
	//   19   41:pop             
		}
		MediaBrowserCompat.SubscriptionCallback.access$100(subscriptioncallback, subscription);
	//   20   42:aload_3         
	//   21   43:aload           4
	//   22   45:invokestatic    #359 <Method void MediaBrowserCompat$SubscriptionCallback.access$100(MediaBrowserCompat$SubscriptionCallback, MediaBrowserCompat$Subscription)>
		if(bundle == null)
	//*  23   48:aload_2         
	//*  24   49:ifnonnull       85
			bundle = null;
	//   25   52:aconst_null     
	//   26   53:astore_2        
		else
	//*  27   54:aload           4
	//*  28   56:aload_0         
	//*  29   57:getfield        #66  <Field Context mContext>
	//*  30   60:aload_2         
	//*  31   61:aload_3         
	//*  32   62:invokevirtual   #363 <Method void MediaBrowserCompat$Subscription.putCallback(Context, Bundle, MediaBrowserCompat$SubscriptionCallback)>
	//*  33   65:aload_0         
	//*  34   66:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  35   69:ifnonnull       97
	//*  36   72:aload_0         
	//*  37   73:getfield        #97  <Field Object mBrowserObj>
	//*  38   76:aload_1         
	//*  39   77:aload_3         
	//*  40   78:invokestatic    #367 <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
	//*  41   81:invokestatic    #370 <Method void MediaBrowserCompatApi21.subscribe(Object, String, Object)>
	//*  42   84:return          
			bundle = new Bundle(bundle);
	//   43   85:new             #68  <Class Bundle>
	//   44   88:dup             
	//   45   89:aload_2         
	//   46   90:invokespecial   #78  <Method void Bundle(Bundle)>
	//   47   93:astore_2        
		subscription.putCallback(mContext, bundle, subscriptioncallback);
		if(mServiceBinderWrapper == null)
		{
			MediaBrowserCompatApi21.subscribe(mBrowserObj, s, MediaBrowserCompat.SubscriptionCallback.access$200(subscriptioncallback));
			return;
		}
	//*  48   94:goto            54
		try
		{
			mServiceBinderWrapper.addSubscription(s, MediaBrowserCompat.SubscriptionCallback.access$000(subscriptioncallback), bundle, mCallbacksMessenger);
	//   49   97:aload_0         
	//   50   98:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   51  101:aload_1         
	//   52  102:aload_3         
	//   53  103:invokestatic    #374 <Method android.os.IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
	//   54  106:aload_2         
	//   55  107:aload_0         
	//   56  108:getfield        #109 <Field Messenger mCallbacksMessenger>
	//   57  111:invokevirtual   #378 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, android.os.IBinder, Bundle, Messenger)>
			return;
	//   58  114:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  59  115:astore_2        
		{
			Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error subscribing media item: ").append(s).toString());
	//   60  116:ldc1            #119 <String "MediaBrowserCompat">
	//   61  118:new             #177 <Class StringBuilder>
	//   62  121:dup             
	//   63  122:invokespecial   #178 <Method void StringBuilder()>
	//   64  125:ldc2            #380 <String "Remote error subscribing media item: ">
	//   65  128:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   66  131:aload_1         
	//   67  132:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   68  135:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   69  138:invokestatic    #127 <Method int Log.i(String, String)>
	//   70  141:pop             
		}
	//   71  142:return          
	}

	public void unsubscribe(String s, MediaBrowserCompat.SubscriptionCallback subscriptioncallback)
	{
		MediaBrowserCompat.Subscription subscription = (MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ArrayMap mSubscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #256 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #258 <Class MediaBrowserCompat$Subscription>
	//    5   11:astore          4
		if(subscription != null) goto _L2; else goto _L1
	//    6   13:aload           4
	//    7   15:ifnonnull       19
_L1:
		return;
	//    8   18:return          
_L2:
		if(mServiceBinderWrapper != null)
			break; /* Loop/switch isn't completed */
	//    9   19:aload_0         
	//   10   20:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   11   23:ifnonnull       146
		if(subscriptioncallback == null)
	//*  12   26:aload_2         
	//*  13   27:ifnonnull       60
		{
			MediaBrowserCompatApi21.unsubscribe(mBrowserObj, s);
	//   14   30:aload_0         
	//   15   31:getfield        #97  <Field Object mBrowserObj>
	//   16   34:aload_1         
	//   17   35:invokestatic    #385 <Method void MediaBrowserCompatApi21.unsubscribe(Object, String)>
		} else
	//*  18   38:aload           4
	//*  19   40:invokevirtual   #387 <Method boolean MediaBrowserCompat$Subscription.isEmpty()>
	//*  20   43:ifne            50
	//*  21   46:aload_2         
	//*  22   47:ifnonnull       18
	//*  23   50:aload_0         
	//*  24   51:getfield        #64  <Field ArrayMap mSubscriptions>
	//*  25   54:aload_1         
	//*  26   55:invokevirtual   #390 <Method Object ArrayMap.remove(Object)>
	//*  27   58:pop             
	//*  28   59:return          
		{
			List list = subscription.getCallbacks();
	//   29   60:aload           4
	//   30   62:invokevirtual   #394 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
	//   31   65:astore          5
			List list2 = subscription.getOptionsList();
	//   32   67:aload           4
	//   33   69:invokevirtual   #397 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
	//   34   72:astore          6
			for(int i = list.size() - 1; i >= 0; i--)
	//*  35   74:aload           5
	//*  36   76:invokeinterface #403 <Method int List.size()>
	//*  37   81:iconst_1        
	//*  38   82:isub            
	//*  39   83:istore_3        
	//*  40   84:iload_3         
	//*  41   85:iflt            125
				if(list.get(i) == subscriptioncallback)
	//*  42   88:aload           5
	//*  43   90:iload_3         
	//*  44   91:invokeinterface #406 <Method Object List.get(int)>
	//*  45   96:aload_2         
	//*  46   97:if_acmpne       118
				{
					list.remove(i);
	//   47  100:aload           5
	//   48  102:iload_3         
	//   49  103:invokeinterface #408 <Method Object List.remove(int)>
	//   50  108:pop             
					list2.remove(i);
	//   51  109:aload           6
	//   52  111:iload_3         
	//   53  112:invokeinterface #408 <Method Object List.remove(int)>
	//   54  117:pop             
				}

	//   55  118:iload_3         
	//   56  119:iconst_1        
	//   57  120:isub            
	//   58  121:istore_3        
	//*  59  122:goto            84
			if(list.size() == 0)
	//*  60  125:aload           5
	//*  61  127:invokeinterface #403 <Method int List.size()>
	//*  62  132:ifne            38
				MediaBrowserCompatApi21.unsubscribe(mBrowserObj, s);
	//   63  135:aload_0         
	//   64  136:getfield        #97  <Field Object mBrowserObj>
	//   65  139:aload_1         
	//   66  140:invokestatic    #385 <Method void MediaBrowserCompatApi21.unsubscribe(Object, String)>
		}
_L4:
		if(subscription.isEmpty() || subscriptioncallback == null)
		{
			mSubscriptions.remove(((Object) (s)));
			return;
		}
		if(true) goto _L1; else goto _L3
	//*  67  143:goto            38
_L3:
label0:
		{
			if(subscriptioncallback != null)
				break label0;
	//   68  146:aload_2         
	//   69  147:ifnonnull       197
			try
			{
				mServiceBinderWrapper.removeSubscription(s, ((android.os.IBinder) (null)), mCallbacksMessenger);
	//   70  150:aload_0         
	//   71  151:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   72  154:aload_1         
	//   73  155:aconst_null     
	//   74  156:aload_0         
	//   75  157:getfield        #109 <Field Messenger mCallbacksMessenger>
	//   76  160:invokevirtual   #412 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, android.os.IBinder, Messenger)>
			}
	//*  77  163:goto            38
			catch(RemoteException remoteexception)
	//*  78  166:astore          5
			{
				Log.d("MediaBrowserCompat", (new StringBuilder()).append("removeSubscription failed with RemoteException parentId=").append(s).toString());
	//   79  168:ldc1            #119 <String "MediaBrowserCompat">
	//   80  170:new             #177 <Class StringBuilder>
	//   81  173:dup             
	//   82  174:invokespecial   #178 <Method void StringBuilder()>
	//   83  177:ldc2            #414 <String "removeSubscription failed with RemoteException parentId=">
	//   84  180:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   85  183:aload_1         
	//   86  184:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   87  187:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   88  190:invokestatic    #267 <Method int Log.d(String, String)>
	//   89  193:pop             
			}
		}
		  goto _L4
	//*  90  194:goto            38
		int j;
		List list1;
		List list3;
		list1 = subscription.getCallbacks();
	//   91  197:aload           4
	//   92  199:invokevirtual   #394 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
	//   93  202:astore          5
		list3 = subscription.getOptionsList();
	//   94  204:aload           4
	//   95  206:invokevirtual   #397 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
	//   96  209:astore          6
		j = list1.size() - 1;
	//   97  211:aload           5
	//   98  213:invokeinterface #403 <Method int List.size()>
	//   99  218:iconst_1        
	//  100  219:isub            
	//  101  220:istore_3        
_L6:
		if(j < 0) goto _L4; else goto _L5
	//  102  221:iload_3         
	//  103  222:iflt            38
_L5:
		if(list1.get(j) == subscriptioncallback)
	//* 104  225:aload           5
	//* 105  227:iload_3         
	//* 106  228:invokeinterface #406 <Method Object List.get(int)>
	//* 107  233:aload_2         
	//* 108  234:if_acmpne       271
		{
			mServiceBinderWrapper.removeSubscription(s, MediaBrowserCompat.SubscriptionCallback.access$000(subscriptioncallback), mCallbacksMessenger);
	//  109  237:aload_0         
	//  110  238:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//  111  241:aload_1         
	//  112  242:aload_2         
	//  113  243:invokestatic    #374 <Method android.os.IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
	//  114  246:aload_0         
	//  115  247:getfield        #109 <Field Messenger mCallbacksMessenger>
	//  116  250:invokevirtual   #412 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, android.os.IBinder, Messenger)>
			list1.remove(j);
	//  117  253:aload           5
	//  118  255:iload_3         
	//  119  256:invokeinterface #408 <Method Object List.remove(int)>
	//  120  261:pop             
			list3.remove(j);
	//  121  262:aload           6
	//  122  264:iload_3         
	//  123  265:invokeinterface #408 <Method Object List.remove(int)>
	//  124  270:pop             
		}
		j--;
	//  125  271:iload_3         
	//  126  272:iconst_1        
	//  127  273:isub            
	//  128  274:istore_3        
		  goto _L6
	//* 129  275:goto            221
	}

	protected final Object mBrowserObj;
	protected Messenger mCallbacksMessenger;
	final Context mContext;
	protected final MediaBrowserCompat.CallbackHandler mHandler = new MediaBrowserCompat.CallbackHandler(((lbackImpl) (this)));
	private android.support.v4.media.session.MediaSessionCompat.Token mMediaSessionToken;
	protected final Bundle mRootHints;
	protected MediaBrowserCompat.ServiceBinderWrapper mServiceBinderWrapper;
	private final ArrayMap mSubscriptions = new ArrayMap();

	public MediaBrowserCompat$MediaBrowserImplApi21(Context context, ComponentName componentname, MediaBrowserCompat.ConnectionCallback connectioncallback, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #54  <Class MediaBrowserCompat$CallbackHandler>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #57  <Method void MediaBrowserCompat$CallbackHandler(MediaBrowserCompat$MediaBrowserServiceCallbackImpl)>
	//    7   13:putfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//    8   16:aload_0         
	//    9   17:new             #61  <Class ArrayMap>
	//   10   20:dup             
	//   11   21:invokespecial   #62  <Method void ArrayMap()>
	//   12   24:putfield        #64  <Field ArrayMap mSubscriptions>
		mContext = context;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #66  <Field Context mContext>
		Bundle bundle1 = bundle;
	//   16   32:aload           4
	//   17   34:astore          5
		if(bundle == null)
	//*  18   36:aload           4
	//*  19   38:ifnonnull       50
			bundle1 = new Bundle();
	//   20   41:new             #68  <Class Bundle>
	//   21   44:dup             
	//   22   45:invokespecial   #69  <Method void Bundle()>
	//   23   48:astore          5
		bundle1.putInt("extra_client_version", 1);
	//   24   50:aload           5
	//   25   52:ldc1            #71  <String "extra_client_version">
	//   26   54:iconst_1        
	//   27   55:invokevirtual   #75  <Method void Bundle.putInt(String, int)>
		mRootHints = new Bundle(bundle1);
	//   28   58:aload_0         
	//   29   59:new             #68  <Class Bundle>
	//   30   62:dup             
	//   31   63:aload           5
	//   32   65:invokespecial   #78  <Method void Bundle(Bundle)>
	//   33   68:putfield        #80  <Field Bundle mRootHints>
		connectioncallback.setInternalConnectionCallback(((nectionCallbackInternal) (this)));
	//   34   71:aload_3         
	//   35   72:aload_0         
	//   36   73:invokevirtual   #86  <Method void MediaBrowserCompat$ConnectionCallback.setInternalConnectionCallback(MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal)>
		mBrowserObj = MediaBrowserCompatApi21.createBrowser(context, componentname, connectioncallback.mConnectionCallbackObj, mRootHints);
	//   37   76:aload_0         
	//   38   77:aload_1         
	//   39   78:aload_2         
	//   40   79:aload_3         
	//   41   80:getfield        #89  <Field Object MediaBrowserCompat$ConnectionCallback.mConnectionCallbackObj>
	//   42   83:aload_0         
	//   43   84:getfield        #80  <Field Bundle mRootHints>
	//   44   87:invokestatic    #95  <Method Object MediaBrowserCompatApi21.createBrowser(Context, ComponentName, Object, Bundle)>
	//   45   90:putfield        #97  <Field Object mBrowserObj>
	//   46   93:return          
	}
}
