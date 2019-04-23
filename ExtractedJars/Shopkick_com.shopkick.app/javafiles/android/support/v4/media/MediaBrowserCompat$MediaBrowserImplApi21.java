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
	//    1    1:getfield        #100 <Field Object mBrowserObj>
	//    2    4:invokestatic    #105 <Method void MediaBrowserCompatApi21.connect(Object)>
	//    3    7:return          
	}

	public void disconnect()
	{
		RemoteException remoteexception;
		MediaBrowserCompat.ServiceBinderWrapper servicebinderwrapper = mServiceBinderWrapper;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//    2    4:astore_1        
		if(servicebinderwrapper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          34
		{
			Messenger messenger = mCallbacksMessenger;
	//    5    9:aload_0         
	//    6   10:getfield        #112 <Field Messenger mCallbacksMessenger>
	//    7   13:astore_2        
			if(messenger != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          34
				try
				{
					servicebinderwrapper.unregisterCallbackMessenger(messenger);
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #118 <Method void MediaBrowserCompat$ServiceBinderWrapper.unregisterCallbackMessenger(Messenger)>
				}
	//*  13   23:goto            34
	//*  14   26:ldc1            #120 <String "MediaBrowserCompat">
	//*  15   28:ldc1            #122 <String "Remote error unregistering client messenger.">
	//*  16   30:invokestatic    #128 <Method int Log.i(String, String)>
	//*  17   33:pop             
	//*  18   34:aload_0         
	//*  19   35:getfield        #100 <Field Object mBrowserObj>
	//*  20   38:invokestatic    #130 <Method void MediaBrowserCompatApi21.disconnect(Object)>
	//*  21   41:return          
				// Misplaced declaration of an exception variable
				catch(RemoteException remoteexception)
				{
					Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
				}
		}
		MediaBrowserCompatApi21.disconnect(mBrowserObj);
	//*  22   42:astore_1        
	//*  23   43:goto            26
	}

	public Bundle getExtras()
	{
		return MediaBrowserCompatApi21.getExtras(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Object mBrowserObj>
	//    2    4:invokestatic    #136 <Method Bundle MediaBrowserCompatApi21.getExtras(Object)>
	//    3    7:areturn         
	}

	public void getItem(final String mediaId, final MediaBrowserCompat.ItemCallback cb)
	{
		RemoteException remoteexception;
		if(!TextUtils.isEmpty(((CharSequence) (mediaId))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #146 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            162
		{
			if(cb != null)
	//*   3    7:aload_2         
	//*   4    8:ifnull          152
			{
				if(!MediaBrowserCompatApi21.isConnected(mBrowserObj))
	//*   5   11:aload_0         
	//*   6   12:getfield        #100 <Field Object mBrowserObj>
	//*   7   15:invokestatic    #150 <Method boolean MediaBrowserCompatApi21.isConnected(Object)>
	//*   8   18:ifne            48
				{
					Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
	//    9   21:ldc1            #120 <String "MediaBrowserCompat">
	//   10   23:ldc1            #152 <String "Not connected, unable to retrieve the MediaItem.">
	//   11   25:invokestatic    #128 <Method int Log.i(String, String)>
	//   12   28:pop             
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
	//   13   29:aload_0         
	//   14   30:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   15   33:new             #15  <Class MediaBrowserCompat$MediaBrowserImplApi21$1>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:aload_2         
	//   19   39:aload_1         
	//   20   40:invokespecial   #155 <Method void MediaBrowserCompat$MediaBrowserImplApi21$1(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$ItemCallback, String)>
	//   21   43:invokevirtual   #159 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   22   46:pop             
					return;
	//   23   47:return          
				}
				if(mServiceBinderWrapper == null)
	//*  24   48:aload_0         
	//*  25   49:getfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  26   52:ifnonnull       74
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
	//   27   55:aload_0         
	//   28   56:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   29   59:new             #17  <Class MediaBrowserCompat$MediaBrowserImplApi21$2>
	//   30   62:dup             
	//   31   63:aload_0         
	//   32   64:aload_2         
	//   33   65:aload_1         
	//   34   66:invokespecial   #160 <Method void MediaBrowserCompat$MediaBrowserImplApi21$2(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$ItemCallback, String)>
	//   35   69:invokevirtual   #159 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   36   72:pop             
					return;
	//   37   73:return          
				}
				Object obj = ((Object) (new MediaBrowserCompat.ItemReceiver(mediaId, cb, ((android.os.Handler) (mHandler)))));
	//   38   74:new             #162 <Class MediaBrowserCompat$ItemReceiver>
	//   39   77:dup             
	//   40   78:aload_1         
	//   41   79:aload_2         
	//   42   80:aload_0         
	//   43   81:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   44   84:invokespecial   #165 <Method void MediaBrowserCompat$ItemReceiver(String, MediaBrowserCompat$ItemCallback, android.os.Handler)>
	//   45   87:astore_3        
				try
				{
					mServiceBinderWrapper.getMediaItem(mediaId, ((android.support.v4.os.ResultReceiver) (obj)), mCallbacksMessenger);
	//   46   88:aload_0         
	//   47   89:getfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   48   92:aload_1         
	//   49   93:aload_3         
	//   50   94:aload_0         
	//   51   95:getfield        #112 <Field Messenger mCallbacksMessenger>
	//   52   98:invokevirtual   #169 <Method void MediaBrowserCompat$ServiceBinderWrapper.getMediaItem(String, android.support.v4.os.ResultReceiver, Messenger)>
					return;
	//   53  101:return          
				}
	//*  54  102:new             #171 <Class StringBuilder>
	//*  55  105:dup             
	//*  56  106:invokespecial   #172 <Method void StringBuilder()>
	//*  57  109:astore_3        
	//*  58  110:aload_3         
	//*  59  111:ldc1            #174 <String "Remote error getting media item: ">
	//*  60  113:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//*  61  116:pop             
	//*  62  117:aload_3         
	//*  63  118:aload_1         
	//*  64  119:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//*  65  122:pop             
	//*  66  123:ldc1            #120 <String "MediaBrowserCompat">
	//*  67  125:aload_3         
	//*  68  126:invokevirtual   #182 <Method String StringBuilder.toString()>
	//*  69  129:invokestatic    #128 <Method int Log.i(String, String)>
	//*  70  132:pop             
	//*  71  133:aload_0         
	//*  72  134:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//*  73  137:new             #19  <Class MediaBrowserCompat$MediaBrowserImplApi21$3>
	//*  74  140:dup             
	//*  75  141:aload_0         
	//*  76  142:aload_2         
	//*  77  143:aload_1         
	//*  78  144:invokespecial   #183 <Method void MediaBrowserCompat$MediaBrowserImplApi21$3(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$ItemCallback, String)>
	//*  79  147:invokevirtual   #159 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//*  80  150:pop             
	//*  81  151:return          
	//*  82  152:new             #185 <Class IllegalArgumentException>
	//*  83  155:dup             
	//*  84  156:ldc1            #187 <String "cb is null">
	//*  85  158:invokespecial   #190 <Method void IllegalArgumentException(String)>
	//*  86  161:athrow          
	//*  87  162:new             #185 <Class IllegalArgumentException>
	//*  88  165:dup             
	//*  89  166:ldc1            #192 <String "mediaId is empty">
	//*  90  168:invokespecial   #190 <Method void IllegalArgumentException(String)>
	//*  91  171:athrow          
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
				return;
			} else
			{
				throw new IllegalArgumentException("cb is null");
			}
		} else
		{
			throw new IllegalArgumentException("mediaId is empty");
		}
	//*  92  172:astore_3        
	//*  93  173:goto            102
	}

	public Bundle getNotifyChildrenChangedOptions()
	{
		return mNotifyChildrenChangedOptions;
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field Bundle mNotifyChildrenChangedOptions>
	//    2    4:areturn         
	}

	public String getRoot()
	{
		return MediaBrowserCompatApi21.getRoot(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Object mBrowserObj>
	//    2    4:invokestatic    #200 <Method String MediaBrowserCompatApi21.getRoot(Object)>
	//    3    7:areturn         
	}

	public ComponentName getServiceComponent()
	{
		return MediaBrowserCompatApi21.getServiceComponent(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Object mBrowserObj>
	//    2    4:invokestatic    #205 <Method ComponentName MediaBrowserCompatApi21.getServiceComponent(Object)>
	//    3    7:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
	{
		if(mMediaSessionToken == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #209 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//*   2    4:ifnonnull       21
			mMediaSessionToken = android.support.v4.media.session.MediaSessionCompat.Token.fromToken(MediaBrowserCompatApi21.getSessionToken(mBrowserObj));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #100 <Field Object mBrowserObj>
	//    6   12:invokestatic    #212 <Method Object MediaBrowserCompatApi21.getSessionToken(Object)>
	//    7   15:invokestatic    #218 <Method android.support.v4.media.session.MediaSessionCompat$Token android.support.v4.media.session.MediaSessionCompat$Token.fromToken(Object)>
	//    8   18:putfield        #209 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		return mMediaSessionToken;
	//    9   21:aload_0         
	//   10   22:getfield        #209 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//   11   25:areturn         
	}

	public boolean isConnected()
	{
		return MediaBrowserCompatApi21.isConnected(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Object mBrowserObj>
	//    2    4:invokestatic    #150 <Method boolean MediaBrowserCompatApi21.isConnected(Object)>
	//    3    7:ireturn         
	}

	public void onConnected()
	{
		RemoteException remoteexception;
		Object obj = ((Object) (MediaBrowserCompatApi21.getExtras(mBrowserObj)));
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Object mBrowserObj>
	//    2    4:invokestatic    #136 <Method Bundle MediaBrowserCompatApi21.getExtras(Object)>
	//    3    7:astore_1        
		if(obj == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		mServiceVersion = ((Bundle) (obj)).getInt("extra_service_version", 0);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:ldc1            #222 <String "extra_service_version">
	//   10   17:iconst_0        
	//   11   18:invokevirtual   #226 <Method int Bundle.getInt(String, int)>
	//   12   21:putfield        #228 <Field int mServiceVersion>
		android.os.IBinder ibinder = BundleCompat.getBinder(((Bundle) (obj)), "extra_messenger");
	//   13   24:aload_1         
	//   14   25:ldc1            #230 <String "extra_messenger">
	//   15   27:invokestatic    #236 <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//   16   30:astore_2        
		if(ibinder != null)
	//*  17   31:aload_2         
	//*  18   32:ifnull          103
		{
			mServiceBinderWrapper = new MediaBrowserCompat.ServiceBinderWrapper(ibinder, mRootHints);
	//   19   35:aload_0         
	//   20   36:new             #114 <Class MediaBrowserCompat$ServiceBinderWrapper>
	//   21   39:dup             
	//   22   40:aload_2         
	//   23   41:aload_0         
	//   24   42:getfield        #77  <Field Bundle mRootHints>
	//   25   45:invokespecial   #239 <Method void MediaBrowserCompat$ServiceBinderWrapper(android.os.IBinder, Bundle)>
	//   26   48:putfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
			mCallbacksMessenger = new Messenger(((android.os.Handler) (mHandler)));
	//   27   51:aload_0         
	//   28   52:new             #241 <Class Messenger>
	//   29   55:dup             
	//   30   56:aload_0         
	//   31   57:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   32   60:invokespecial   #244 <Method void Messenger(android.os.Handler)>
	//   33   63:putfield        #112 <Field Messenger mCallbacksMessenger>
			mHandler.setCallbacksMessenger(mCallbacksMessenger);
	//   34   66:aload_0         
	//   35   67:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   36   70:aload_0         
	//   37   71:getfield        #112 <Field Messenger mCallbacksMessenger>
	//   38   74:invokevirtual   #247 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
			try
			{
				mServiceBinderWrapper.registerCallbackMessenger(mContext, mCallbacksMessenger);
	//   39   77:aload_0         
	//   40   78:getfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   41   81:aload_0         
	//   42   82:getfield        #69  <Field Context mContext>
	//   43   85:aload_0         
	//   44   86:getfield        #112 <Field Messenger mCallbacksMessenger>
	//   45   89:invokevirtual   #251 <Method void MediaBrowserCompat$ServiceBinderWrapper.registerCallbackMessenger(Context, Messenger)>
			}
	//*  46   92:goto            103
	//*  47   95:ldc1            #120 <String "MediaBrowserCompat">
	//*  48   97:ldc1            #253 <String "Remote error registering client messenger.">
	//*  49   99:invokestatic    #128 <Method int Log.i(String, String)>
	//*  50  102:pop             
	//*  51  103:aload_1         
	//*  52  104:ldc1            #255 <String "extra_session_binder">
	//*  53  106:invokestatic    #236 <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//*  54  109:invokestatic    #261 <Method android.support.v4.media.session.IMediaSession android.support.v4.media.session.IMediaSession$Stub.asInterface(android.os.IBinder)>
	//*  55  112:astore_1        
	//*  56  113:aload_1         
	//*  57  114:ifnull          132
	//*  58  117:aload_0         
	//*  59  118:aload_0         
	//*  60  119:getfield        #100 <Field Object mBrowserObj>
	//*  61  122:invokestatic    #212 <Method Object MediaBrowserCompatApi21.getSessionToken(Object)>
	//*  62  125:aload_1         
	//*  63  126:invokestatic    #264 <Method android.support.v4.media.session.MediaSessionCompat$Token android.support.v4.media.session.MediaSessionCompat$Token.fromToken(Object, android.support.v4.media.session.IMediaSession)>
	//*  64  129:putfield        #209 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//*  65  132:return          
			// Misplaced declaration of an exception variable
			catch(RemoteException remoteexception)
			{
				Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
			}
		}
		obj = ((Object) (android.support.v4.media.session.IMediaSession.Stub.asInterface(BundleCompat.getBinder(((Bundle) (obj)), "extra_session_binder"))));
		if(obj != null)
			mMediaSessionToken = android.support.v4.media.session.MediaSessionCompat.Token.fromToken(MediaBrowserCompatApi21.getSessionToken(mBrowserObj), ((android.support.v4.media.session.IMediaSession) (obj)));
	//*  66  133:astore_2        
	//*  67  134:goto            95
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
	//    2    2:putfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		mCallbacksMessenger = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #112 <Field Messenger mCallbacksMessenger>
		mMediaSessionToken = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #209 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		mHandler.setCallbacksMessenger(((Messenger) (null)));
	//    9   15:aload_0         
	//   10   16:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   11   19:aconst_null     
	//   12   20:invokevirtual   #247 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
	//   13   23:return          
	}

	public void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle, Bundle bundle1)
	{
		if(mCallbacksMessenger != messenger)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field Messenger mCallbacksMessenger>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       9
			return;
	//    4    8:return          
		messenger = ((Messenger) ((MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)))));
	//    5    9:aload_0         
	//    6   10:getfield        #67  <Field ArrayMap mSubscriptions>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #271 <Method Object ArrayMap.get(Object)>
	//    9   17:checkcast       #273 <Class MediaBrowserCompat$Subscription>
	//   10   20:astore_1        
		if(messenger == null)
	//*  11   21:aload_1         
	//*  12   22:ifnonnull       64
		{
			if(MediaBrowserCompat.DEBUG)
	//*  13   25:getstatic       #277 <Field boolean MediaBrowserCompat.DEBUG>
	//*  14   28:ifeq            63
			{
				messenger = ((Messenger) (new StringBuilder()));
	//   15   31:new             #171 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #172 <Method void StringBuilder()>
	//   18   38:astore_1        
				((StringBuilder) (messenger)).append("onLoadChildren for id that isn't subscribed id=");
	//   19   39:aload_1         
	//   20   40:ldc2            #279 <String "onLoadChildren for id that isn't subscribed id=">
	//   21   43:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
				((StringBuilder) (messenger)).append(s);
	//   23   47:aload_1         
	//   24   48:aload_2         
	//   25   49:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
				Log.d("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
	//   27   53:ldc1            #120 <String "MediaBrowserCompat">
	//   28   55:aload_1         
	//   29   56:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   30   59:invokestatic    #282 <Method int Log.d(String, String)>
	//   31   62:pop             
			}
			return;
	//   32   63:return          
		}
		messenger = ((Messenger) (((MediaBrowserCompat.Subscription) (messenger)).getCallback(bundle)));
	//   33   64:aload_1         
	//   34   65:aload           4
	//   35   67:invokevirtual   #286 <Method MediaBrowserCompat$SubscriptionCallback MediaBrowserCompat$Subscription.getCallback(Bundle)>
	//   36   70:astore_1        
		if(messenger != null)
	//*  37   71:aload_1         
	//*  38   72:ifnull          139
		{
			if(bundle == null)
	//*  39   75:aload           4
	//*  40   77:ifnonnull       108
				if(list == null)
	//*  41   80:aload_3         
	//*  42   81:ifnonnull       90
				{
					((MediaBrowserCompat.SubscriptionCallback) (messenger)).onError(s);
	//   43   84:aload_1         
	//   44   85:aload_2         
	//   45   86:invokevirtual   #291 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
					return;
	//   46   89:return          
				} else
				{
					mNotifyChildrenChangedOptions = bundle1;
	//   47   90:aload_0         
	//   48   91:aload           5
	//   49   93:putfield        #196 <Field Bundle mNotifyChildrenChangedOptions>
					((MediaBrowserCompat.SubscriptionCallback) (messenger)).onChildrenLoaded(s, list);
	//   50   96:aload_1         
	//   51   97:aload_2         
	//   52   98:aload_3         
	//   53   99:invokevirtual   #295 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
					mNotifyChildrenChangedOptions = null;
	//   54  102:aload_0         
	//   55  103:aconst_null     
	//   56  104:putfield        #196 <Field Bundle mNotifyChildrenChangedOptions>
					return;
	//   57  107:return          
				}
			if(list == null)
	//*  58  108:aload_3         
	//*  59  109:ifnonnull       120
			{
				((MediaBrowserCompat.SubscriptionCallback) (messenger)).onError(s, bundle);
	//   60  112:aload_1         
	//   61  113:aload_2         
	//   62  114:aload           4
	//   63  116:invokevirtual   #298 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
				return;
	//   64  119:return          
			}
			mNotifyChildrenChangedOptions = bundle1;
	//   65  120:aload_0         
	//   66  121:aload           5
	//   67  123:putfield        #196 <Field Bundle mNotifyChildrenChangedOptions>
			((MediaBrowserCompat.SubscriptionCallback) (messenger)).onChildrenLoaded(s, list, bundle);
	//   68  126:aload_1         
	//   69  127:aload_2         
	//   70  128:aload_3         
	//   71  129:aload           4
	//   72  131:invokevirtual   #301 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
			mNotifyChildrenChangedOptions = null;
	//   73  134:aload_0         
	//   74  135:aconst_null     
	//   75  136:putfield        #196 <Field Bundle mNotifyChildrenChangedOptions>
		}
	//   76  139:return          
	}

	public void onServiceConnected(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
	{
	//    0    0:return          
	}

	public void search(final String query, final Bundle extras, final MediaBrowserCompat.SearchCallback callback)
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #307 <Method boolean isConnected()>
	//*   2    4:ifeq            135
		{
			if(mServiceBinderWrapper == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*   5   11:ifnonnull       43
			{
				Log.i("MediaBrowserCompat", "The connected service doesn't support search.");
	//    6   14:ldc1            #120 <String "MediaBrowserCompat">
	//    7   16:ldc2            #309 <String "The connected service doesn't support search.">
	//    8   19:invokestatic    #128 <Method int Log.i(String, String)>
	//    9   22:pop             
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
	//   10   23:aload_0         
	//   11   24:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   12   27:new             #21  <Class MediaBrowserCompat$MediaBrowserImplApi21$4>
	//   13   30:dup             
	//   14   31:aload_0         
	//   15   32:aload_3         
	//   16   33:aload_1         
	//   17   34:aload_2         
	//   18   35:invokespecial   #312 <Method void MediaBrowserCompat$MediaBrowserImplApi21$4(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$SearchCallback, String, Bundle)>
	//   19   38:invokevirtual   #159 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   20   41:pop             
				return;
	//   21   42:return          
			}
			MediaBrowserCompat.SearchResultReceiver searchresultreceiver = new MediaBrowserCompat.SearchResultReceiver(query, extras, callback, ((android.os.Handler) (mHandler)));
	//   22   43:new             #314 <Class MediaBrowserCompat$SearchResultReceiver>
	//   23   46:dup             
	//   24   47:aload_1         
	//   25   48:aload_2         
	//   26   49:aload_3         
	//   27   50:aload_0         
	//   28   51:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   29   54:invokespecial   #317 <Method void MediaBrowserCompat$SearchResultReceiver(String, Bundle, MediaBrowserCompat$SearchCallback, android.os.Handler)>
	//   30   57:astore          4
			try
			{
				mServiceBinderWrapper.search(query, extras, ((android.support.v4.os.ResultReceiver) (searchresultreceiver)), mCallbacksMessenger);
	//   31   59:aload_0         
	//   32   60:getfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   33   63:aload_1         
	//   34   64:aload_2         
	//   35   65:aload           4
	//   36   67:aload_0         
	//   37   68:getfield        #112 <Field Messenger mCallbacksMessenger>
	//   38   71:invokevirtual   #320 <Method void MediaBrowserCompat$ServiceBinderWrapper.search(String, Bundle, android.support.v4.os.ResultReceiver, Messenger)>
				return;
	//   39   74:return          
			}
			catch(RemoteException remoteexception)
	//*  40   75:astore          4
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   41   77:new             #171 <Class StringBuilder>
	//   42   80:dup             
	//   43   81:invokespecial   #172 <Method void StringBuilder()>
	//   44   84:astore          5
				stringbuilder.append("Remote error searching items with query: ");
	//   45   86:aload           5
	//   46   88:ldc2            #322 <String "Remote error searching items with query: ">
	//   47   91:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   48   94:pop             
				stringbuilder.append(query);
	//   49   95:aload           5
	//   50   97:aload_1         
	//   51   98:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   52  101:pop             
				Log.i("MediaBrowserCompat", stringbuilder.toString(), ((Throwable) (remoteexception)));
	//   53  102:ldc1            #120 <String "MediaBrowserCompat">
	//   54  104:aload           5
	//   55  106:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   56  109:aload           4
	//   57  111:invokestatic    #325 <Method int Log.i(String, String, Throwable)>
	//   58  114:pop             
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
	//   59  115:aload_0         
	//   60  116:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   61  119:new             #23  <Class MediaBrowserCompat$MediaBrowserImplApi21$5>
	//   62  122:dup             
	//   63  123:aload_0         
	//   64  124:aload_3         
	//   65  125:aload_1         
	//   66  126:aload_2         
	//   67  127:invokespecial   #326 <Method void MediaBrowserCompat$MediaBrowserImplApi21$5(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$SearchCallback, String, Bundle)>
	//   68  130:invokevirtual   #159 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   69  133:pop             
				return;
	//   70  134:return          
			}
		} else
		{
			throw new IllegalStateException("search() called while not connected");
	//   71  135:new             #328 <Class IllegalStateException>
	//   72  138:dup             
	//   73  139:ldc2            #330 <String "search() called while not connected">
	//   74  142:invokespecial   #331 <Method void IllegalStateException(String)>
	//   75  145:athrow          
		}
	}

	public void sendCustomAction(final String action, final Bundle extras, final MediaBrowserCompat.CustomActionCallback callback)
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #307 <Method boolean isConnected()>
	//*   2    4:ifeq            158
		{
			if(mServiceBinderWrapper == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*   5   11:ifnonnull       46
			{
				Log.i("MediaBrowserCompat", "The connected service doesn't support sendCustomAction.");
	//    6   14:ldc1            #120 <String "MediaBrowserCompat">
	//    7   16:ldc2            #335 <String "The connected service doesn't support sendCustomAction.">
	//    8   19:invokestatic    #128 <Method int Log.i(String, String)>
	//    9   22:pop             
				if(callback != null)
	//*  10   23:aload_3         
	//*  11   24:ifnull          46
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
	//   12   27:aload_0         
	//   13   28:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   14   31:new             #25  <Class MediaBrowserCompat$MediaBrowserImplApi21$6>
	//   15   34:dup             
	//   16   35:aload_0         
	//   17   36:aload_3         
	//   18   37:aload_1         
	//   19   38:aload_2         
	//   20   39:invokespecial   #338 <Method void MediaBrowserCompat$MediaBrowserImplApi21$6(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$CustomActionCallback, String, Bundle)>
	//   21   42:invokevirtual   #159 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   22   45:pop             
			}
			iver iver = new iver(action, extras, callback, ((android.os.Handler) (mHandler)));
	//   23   46:new             #340 <Class MediaBrowserCompat$CustomActionResultReceiver>
	//   24   49:dup             
	//   25   50:aload_1         
	//   26   51:aload_2         
	//   27   52:aload_3         
	//   28   53:aload_0         
	//   29   54:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   30   57:invokespecial   #343 <Method void MediaBrowserCompat$CustomActionResultReceiver(String, Bundle, MediaBrowserCompat$CustomActionCallback, android.os.Handler)>
	//   31   60:astore          4
			try
			{
				mServiceBinderWrapper.sendCustomAction(action, extras, ((android.support.v4.os.ResultReceiver) (iver)), mCallbacksMessenger);
	//   32   62:aload_0         
	//   33   63:getfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   34   66:aload_1         
	//   35   67:aload_2         
	//   36   68:aload           4
	//   37   70:aload_0         
	//   38   71:getfield        #112 <Field Messenger mCallbacksMessenger>
	//   39   74:invokevirtual   #345 <Method void MediaBrowserCompat$ServiceBinderWrapper.sendCustomAction(String, Bundle, android.support.v4.os.ResultReceiver, Messenger)>
				return;
	//   40   77:return          
			}
			catch(RemoteException remoteexception)
	//*  41   78:astore          4
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   42   80:new             #171 <Class StringBuilder>
	//   43   83:dup             
	//   44   84:invokespecial   #172 <Method void StringBuilder()>
	//   45   87:astore          5
				stringbuilder.append("Remote error sending a custom action: action=");
	//   46   89:aload           5
	//   47   91:ldc2            #347 <String "Remote error sending a custom action: action=">
	//   48   94:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   49   97:pop             
				stringbuilder.append(action);
	//   50   98:aload           5
	//   51  100:aload_1         
	//   52  101:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   53  104:pop             
				stringbuilder.append(", extras=");
	//   54  105:aload           5
	//   55  107:ldc2            #349 <String ", extras=">
	//   56  110:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   57  113:pop             
				stringbuilder.append(((Object) (extras)));
	//   58  114:aload           5
	//   59  116:aload_2         
	//   60  117:invokevirtual   #352 <Method StringBuilder StringBuilder.append(Object)>
	//   61  120:pop             
				Log.i("MediaBrowserCompat", stringbuilder.toString(), ((Throwable) (remoteexception)));
	//   62  121:ldc1            #120 <String "MediaBrowserCompat">
	//   63  123:aload           5
	//   64  125:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   65  128:aload           4
	//   66  130:invokestatic    #325 <Method int Log.i(String, String, Throwable)>
	//   67  133:pop             
			}
			if(callback != null)
	//*  68  134:aload_3         
	//*  69  135:ifnull          157
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
	//   70  138:aload_0         
	//   71  139:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   72  142:new             #27  <Class MediaBrowserCompat$MediaBrowserImplApi21$7>
	//   73  145:dup             
	//   74  146:aload_0         
	//   75  147:aload_3         
	//   76  148:aload_1         
	//   77  149:aload_2         
	//   78  150:invokespecial   #353 <Method void MediaBrowserCompat$MediaBrowserImplApi21$7(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$CustomActionCallback, String, Bundle)>
	//   79  153:invokevirtual   #159 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   80  156:pop             
			return;
	//   81  157:return          
		} else
		{
			callback = ((MediaBrowserCompat.CustomActionCallback) (new StringBuilder()));
	//   82  158:new             #171 <Class StringBuilder>
	//   83  161:dup             
	//   84  162:invokespecial   #172 <Method void StringBuilder()>
	//   85  165:astore_3        
			((StringBuilder) (callback)).append("Cannot send a custom action (");
	//   86  166:aload_3         
	//   87  167:ldc2            #355 <String "Cannot send a custom action (">
	//   88  170:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   89  173:pop             
			((StringBuilder) (callback)).append(action);
	//   90  174:aload_3         
	//   91  175:aload_1         
	//   92  176:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   93  179:pop             
			((StringBuilder) (callback)).append(") with ");
	//   94  180:aload_3         
	//   95  181:ldc2            #357 <String ") with ">
	//   96  184:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   97  187:pop             
			((StringBuilder) (callback)).append("extras ");
	//   98  188:aload_3         
	//   99  189:ldc2            #359 <String "extras ">
	//  100  192:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  101  195:pop             
			((StringBuilder) (callback)).append(((Object) (extras)));
	//  102  196:aload_3         
	//  103  197:aload_2         
	//  104  198:invokevirtual   #352 <Method StringBuilder StringBuilder.append(Object)>
	//  105  201:pop             
			((StringBuilder) (callback)).append(" because the browser is not connected to the ");
	//  106  202:aload_3         
	//  107  203:ldc2            #361 <String " because the browser is not connected to the ">
	//  108  206:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  109  209:pop             
			((StringBuilder) (callback)).append("service.");
	//  110  210:aload_3         
	//  111  211:ldc2            #363 <String "service.">
	//  112  214:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//  113  217:pop             
			throw new IllegalStateException(((StringBuilder) (callback)).toString());
	//  114  218:new             #328 <Class IllegalStateException>
	//  115  221:dup             
	//  116  222:aload_3         
	//  117  223:invokevirtual   #182 <Method String StringBuilder.toString()>
	//  118  226:invokespecial   #331 <Method void IllegalStateException(String)>
	//  119  229:athrow          
		}
	}

	public void subscribe(String s, Bundle bundle, MediaBrowserCompat.SubscriptionCallback subscriptioncallback)
	{
		MediaBrowserCompat.Subscription subscription = (MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field ArrayMap mSubscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #271 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #273 <Class MediaBrowserCompat$Subscription>
	//    5   11:astore          5
		Object obj = ((Object) (subscription));
	//    6   13:aload           5
	//    7   15:astore          4
		if(subscription == null)
	//*   8   17:aload           5
	//*   9   19:ifnonnull       42
		{
			obj = ((Object) (new MediaBrowserCompat.Subscription()));
	//   10   22:new             #273 <Class MediaBrowserCompat$Subscription>
	//   11   25:dup             
	//   12   26:invokespecial   #366 <Method void MediaBrowserCompat$Subscription()>
	//   13   29:astore          4
			mSubscriptions.put(((Object) (s)), obj);
	//   14   31:aload_0         
	//   15   32:getfield        #67  <Field ArrayMap mSubscriptions>
	//   16   35:aload_1         
	//   17   36:aload           4
	//   18   38:invokevirtual   #370 <Method Object ArrayMap.put(Object, Object)>
	//   19   41:pop             
		}
		subscriptioncallback.setSubscription(((MediaBrowserCompat.Subscription) (obj)));
	//   20   42:aload_3         
	//   21   43:aload           4
	//   22   45:invokevirtual   #374 <Method void MediaBrowserCompat$SubscriptionCallback.setSubscription(MediaBrowserCompat$Subscription)>
		if(bundle == null)
	//*  23   48:aload_2         
	//*  24   49:ifnonnull       57
			bundle = null;
	//   25   52:aconst_null     
	//   26   53:astore_2        
		else
	//*  27   54:goto            66
			bundle = new Bundle(bundle);
	//   28   57:new             #71  <Class Bundle>
	//   29   60:dup             
	//   30   61:aload_2         
	//   31   62:invokespecial   #74  <Method void Bundle(Bundle)>
	//   32   65:astore_2        
		((MediaBrowserCompat.Subscription) (obj)).putCallback(bundle, subscriptioncallback);
	//   33   66:aload           4
	//   34   68:aload_2         
	//   35   69:aload_3         
	//   36   70:invokevirtual   #378 <Method void MediaBrowserCompat$Subscription.putCallback(Bundle, MediaBrowserCompat$SubscriptionCallback)>
		obj = ((Object) (mServiceBinderWrapper));
	//   37   73:aload_0         
	//   38   74:getfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   39   77:astore          4
		if(obj == null)
	//*  40   79:aload           4
	//*  41   81:ifnonnull       97
		{
			MediaBrowserCompatApi21.subscribe(mBrowserObj, s, subscriptioncallback.mSubscriptionCallbackObj);
	//   42   84:aload_0         
	//   43   85:getfield        #100 <Field Object mBrowserObj>
	//   44   88:aload_1         
	//   45   89:aload_3         
	//   46   90:getfield        #381 <Field Object MediaBrowserCompat$SubscriptionCallback.mSubscriptionCallbackObj>
	//   47   93:invokestatic    #384 <Method void MediaBrowserCompatApi21.subscribe(Object, String, Object)>
			return;
	//   48   96:return          
		}
		try
		{
			((MediaBrowserCompat.ServiceBinderWrapper) (obj)).addSubscription(s, subscriptioncallback.mToken, bundle, mCallbacksMessenger);
	//   49   97:aload           4
	//   50   99:aload_1         
	//   51  100:aload_3         
	//   52  101:getfield        #388 <Field android.os.IBinder MediaBrowserCompat$SubscriptionCallback.mToken>
	//   53  104:aload_2         
	//   54  105:aload_0         
	//   55  106:getfield        #112 <Field Messenger mCallbacksMessenger>
	//   56  109:invokevirtual   #392 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, android.os.IBinder, Bundle, Messenger)>
			return;
	//   57  112:return          
		}
	//*  58  113:new             #171 <Class StringBuilder>
	//*  59  116:dup             
	//*  60  117:invokespecial   #172 <Method void StringBuilder()>
	//*  61  120:astore_2        
	//*  62  121:aload_2         
	//*  63  122:ldc2            #394 <String "Remote error subscribing media item: ">
	//*  64  125:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//*  65  128:pop             
	//*  66  129:aload_2         
	//*  67  130:aload_1         
	//*  68  131:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//*  69  134:pop             
	//*  70  135:ldc1            #120 <String "MediaBrowserCompat">
	//*  71  137:aload_2         
	//*  72  138:invokevirtual   #182 <Method String StringBuilder.toString()>
	//*  73  141:invokestatic    #128 <Method int Log.i(String, String)>
	//*  74  144:pop             
	//*  75  145:return          
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
		{
			bundle = ((Bundle) (new StringBuilder()));
		}
		((StringBuilder) (bundle)).append("Remote error subscribing media item: ");
		((StringBuilder) (bundle)).append(s);
		Log.i("MediaBrowserCompat", ((StringBuilder) (bundle)).toString());
	//*  76  146:astore_2        
	//*  77  147:goto            113
	}

	public void unsubscribe(String s, MediaBrowserCompat.SubscriptionCallback subscriptioncallback)
	{
		MediaBrowserCompat.Subscription subscription;
		Object obj;
		subscription = (MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field ArrayMap mSubscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #271 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #273 <Class MediaBrowserCompat$Subscription>
	//    5   11:astore          4
		if(subscription == null)
	//*   6   13:aload           4
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		obj = ((Object) (mServiceBinderWrapper));
	//    9   19:aload_0         
	//   10   20:getfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   11   23:astore          5
		if(obj != null) goto _L2; else goto _L1
	//   12   25:aload           5
	//   13   27:ifnonnull       131
_L1:
		if(subscriptioncallback == null)
	//*  14   30:aload_2         
	//*  15   31:ifnonnull       45
		{
			MediaBrowserCompatApi21.unsubscribe(mBrowserObj, s);
	//   16   34:aload_0         
	//   17   35:getfield        #100 <Field Object mBrowserObj>
	//   18   38:aload_1         
	//   19   39:invokestatic    #399 <Method void MediaBrowserCompatApi21.unsubscribe(Object, String)>
		} else
	//*  20   42:goto            266
		{
			obj = ((Object) (subscription.getCallbacks()));
	//   21   45:aload           4
	//   22   47:invokevirtual   #403 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
	//   23   50:astore          5
			List list = subscription.getOptionsList();
	//   24   52:aload           4
	//   25   54:invokevirtual   #406 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
	//   26   57:astore          6
			for(int i = ((List) (obj)).size() - 1; i >= 0; i--)
	//*  27   59:aload           5
	//*  28   61:invokeinterface #412 <Method int List.size()>
	//*  29   66:iconst_1        
	//*  30   67:isub            
	//*  31   68:istore_3        
	//*  32   69:iload_3         
	//*  33   70:iflt            110
				if(((List) (obj)).get(i) == subscriptioncallback)
	//*  34   73:aload           5
	//*  35   75:iload_3         
	//*  36   76:invokeinterface #415 <Method Object List.get(int)>
	//*  37   81:aload_2         
	//*  38   82:if_acmpne       103
				{
					((List) (obj)).remove(i);
	//   39   85:aload           5
	//   40   87:iload_3         
	//   41   88:invokeinterface #418 <Method Object List.remove(int)>
	//   42   93:pop             
					list.remove(i);
	//   43   94:aload           6
	//   44   96:iload_3         
	//   45   97:invokeinterface #418 <Method Object List.remove(int)>
	//   46  102:pop             
				}

	//   47  103:iload_3         
	//   48  104:iconst_1        
	//   49  105:isub            
	//   50  106:istore_3        
	//*  51  107:goto            69
			if(((List) (obj)).size() == 0)
	//*  52  110:aload           5
	//*  53  112:invokeinterface #412 <Method int List.size()>
	//*  54  117:ifne            266
				MediaBrowserCompatApi21.unsubscribe(mBrowserObj, s);
	//   55  120:aload_0         
	//   56  121:getfield        #100 <Field Object mBrowserObj>
	//   57  124:aload_1         
	//   58  125:invokestatic    #399 <Method void MediaBrowserCompatApi21.unsubscribe(Object, String)>
		}
		  goto _L3
	//*  59  128:goto            266
_L2:
		if(subscriptioncallback != null) goto _L5; else goto _L4
	//   60  131:aload_2         
	//   61  132:ifnonnull       149
_L4:
		int j;
		List list1;
		try
		{
			((MediaBrowserCompat.ServiceBinderWrapper) (obj)).removeSubscription(s, ((android.os.IBinder) (null)), mCallbacksMessenger);
	//   62  135:aload           5
	//   63  137:aload_1         
	//   64  138:aconst_null     
	//   65  139:aload_0         
	//   66  140:getfield        #112 <Field Messenger mCallbacksMessenger>
	//   67  143:invokevirtual   #422 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, android.os.IBinder, Messenger)>
		}
	//*  68  146:goto            266
	//*  69  149:aload           4
	//*  70  151:invokevirtual   #403 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
	//*  71  154:astore          5
	//*  72  156:aload           4
	//*  73  158:invokevirtual   #406 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
	//*  74  161:astore          6
	//*  75  163:aload           5
	//*  76  165:invokeinterface #412 <Method int List.size()>
	//*  77  170:iconst_1        
	//*  78  171:isub            
	//*  79  172:istore_3        
	//*  80  173:iload_3         
	//*  81  174:iflt            266
	//*  82  177:aload           5
	//*  83  179:iload_3         
	//*  84  180:invokeinterface #415 <Method Object List.get(int)>
	//*  85  185:aload_2         
	//*  86  186:if_acmpne       223
	//*  87  189:aload_0         
	//*  88  190:getfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  89  193:aload_1         
	//*  90  194:aload_2         
	//*  91  195:getfield        #388 <Field android.os.IBinder MediaBrowserCompat$SubscriptionCallback.mToken>
	//*  92  198:aload_0         
	//*  93  199:getfield        #112 <Field Messenger mCallbacksMessenger>
	//*  94  202:invokevirtual   #422 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, android.os.IBinder, Messenger)>
	//*  95  205:aload           5
	//*  96  207:iload_3         
	//*  97  208:invokeinterface #418 <Method Object List.remove(int)>
	//*  98  213:pop             
	//*  99  214:aload           6
	//* 100  216:iload_3         
	//* 101  217:invokeinterface #418 <Method Object List.remove(int)>
	//* 102  222:pop             
	//* 103  223:iload_3         
	//* 104  224:iconst_1        
	//* 105  225:isub            
	//* 106  226:istore_3        
	//* 107  227:goto            173
	//* 108  230:new             #171 <Class StringBuilder>
	//* 109  233:dup             
	//* 110  234:invokespecial   #172 <Method void StringBuilder()>
	//* 111  237:astore          5
	//* 112  239:aload           5
	//* 113  241:ldc2            #424 <String "removeSubscription failed with RemoteException parentId=">
	//* 114  244:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//* 115  247:pop             
	//* 116  248:aload           5
	//* 117  250:aload_1         
	//* 118  251:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//* 119  254:pop             
	//* 120  255:ldc1            #120 <String "MediaBrowserCompat">
	//* 121  257:aload           5
	//* 122  259:invokevirtual   #182 <Method String StringBuilder.toString()>
	//* 123  262:invokestatic    #282 <Method int Log.d(String, String)>
	//* 124  265:pop             
	//* 125  266:aload           4
	//* 126  268:invokevirtual   #426 <Method boolean MediaBrowserCompat$Subscription.isEmpty()>
	//* 127  271:ifne            278
	//* 128  274:aload_2         
	//* 129  275:ifnonnull       287
	//* 130  278:aload_0         
	//* 131  279:getfield        #67  <Field ArrayMap mSubscriptions>
	//* 132  282:aload_1         
	//* 133  283:invokevirtual   #428 <Method Object ArrayMap.remove(Object)>
	//* 134  286:pop             
	//* 135  287:return          
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
		list1 = subscription.getOptionsList();
		j = ((List) (obj)).size() - 1;
_L6:
		if(j < 0)
			break; /* Loop/switch isn't completed */
		if(((List) (obj)).get(j) == subscriptioncallback)
		{
			mServiceBinderWrapper.removeSubscription(s, subscriptioncallback.mToken, mCallbacksMessenger);
			((List) (obj)).remove(j);
			list1.remove(j);
		}
		j--;
		if(true) goto _L6; else goto _L3
_L3:
		RemoteException remoteexception;
		if(subscription.isEmpty() || subscriptioncallback == null)
			mSubscriptions.remove(((Object) (s)));
		return;
	//* 136  288:astore          5
	//* 137  290:goto            230
	}

	protected final Object mBrowserObj;
	protected Messenger mCallbacksMessenger;
	final Context mContext;
	protected final MediaBrowserCompat.CallbackHandler mHandler = new MediaBrowserCompat.CallbackHandler(((lbackImpl) (this)));
	private android.support.v4.media.session.MediaSessionCompat.Token mMediaSessionToken;
	private Bundle mNotifyChildrenChangedOptions;
	protected final Bundle mRootHints;
	protected MediaBrowserCompat.ServiceBinderWrapper mServiceBinderWrapper;
	protected int mServiceVersion;
	private final ArrayMap mSubscriptions = new ArrayMap();

	MediaBrowserCompat$MediaBrowserImplApi21(Context context, ComponentName componentname, MediaBrowserCompat.ConnectionCallback connectioncallback, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #57  <Class MediaBrowserCompat$CallbackHandler>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #60  <Method void MediaBrowserCompat$CallbackHandler(MediaBrowserCompat$MediaBrowserServiceCallbackImpl)>
	//    7   13:putfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//    8   16:aload_0         
	//    9   17:new             #64  <Class ArrayMap>
	//   10   20:dup             
	//   11   21:invokespecial   #65  <Method void ArrayMap()>
	//   12   24:putfield        #67  <Field ArrayMap mSubscriptions>
		mContext = context;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #69  <Field Context mContext>
		if(bundle != null)
	//*  16   32:aload           4
	//*  17   34:ifnull          51
			bundle = new Bundle(bundle);
	//   18   37:new             #71  <Class Bundle>
	//   19   40:dup             
	//   20   41:aload           4
	//   21   43:invokespecial   #74  <Method void Bundle(Bundle)>
	//   22   46:astore          4
		else
	//*  23   48:goto            60
			bundle = new Bundle();
	//   24   51:new             #71  <Class Bundle>
	//   25   54:dup             
	//   26   55:invokespecial   #75  <Method void Bundle()>
	//   27   58:astore          4
		mRootHints = bundle;
	//   28   60:aload_0         
	//   29   61:aload           4
	//   30   63:putfield        #77  <Field Bundle mRootHints>
		mRootHints.putInt("extra_client_version", 1);
	//   31   66:aload_0         
	//   32   67:getfield        #77  <Field Bundle mRootHints>
	//   33   70:ldc1            #79  <String "extra_client_version">
	//   34   72:iconst_1        
	//   35   73:invokevirtual   #83  <Method void Bundle.putInt(String, int)>
		connectioncallback.setInternalConnectionCallback(((nectionCallbackInternal) (this)));
	//   36   76:aload_3         
	//   37   77:aload_0         
	//   38   78:invokevirtual   #89  <Method void MediaBrowserCompat$ConnectionCallback.setInternalConnectionCallback(MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal)>
		mBrowserObj = MediaBrowserCompatApi21.createBrowser(context, componentname, connectioncallback.mConnectionCallbackObj, mRootHints);
	//   39   81:aload_0         
	//   40   82:aload_1         
	//   41   83:aload_2         
	//   42   84:aload_3         
	//   43   85:getfield        #92  <Field Object MediaBrowserCompat$ConnectionCallback.mConnectionCallbackObj>
	//   44   88:aload_0         
	//   45   89:getfield        #77  <Field Bundle mRootHints>
	//   46   92:invokestatic    #98  <Method Object MediaBrowserCompatApi21.createBrowser(Context, ComponentName, Object, Bundle)>
	//   47   95:putfield        #100 <Field Object mBrowserObj>
	//   48   98:return          
	}
}
