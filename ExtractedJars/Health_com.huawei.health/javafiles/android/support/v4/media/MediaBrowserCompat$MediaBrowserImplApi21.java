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
	//    1    1:getfield        #92  <Field Object mBrowserObj>
	//    2    4:invokestatic    #97  <Method void MediaBrowserCompatApi21.connect(Object)>
	//    3    7:return          
	}

	public void disconnect()
	{
		if(mServiceBinderWrapper != null && mCallbacksMessenger != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*   2    4:ifnull          37
	//*   3    7:aload_0         
	//*   4    8:getfield        #104 <Field Messenger mCallbacksMessenger>
	//*   5   11:ifnull          37
			try
			{
				mServiceBinderWrapper.unregisterCallbackMessenger(mCallbacksMessenger);
	//    6   14:aload_0         
	//    7   15:getfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//    8   18:aload_0         
	//    9   19:getfield        #104 <Field Messenger mCallbacksMessenger>
	//   10   22:invokevirtual   #110 <Method void MediaBrowserCompat$ServiceBinderWrapper.unregisterCallbackMessenger(Messenger)>
			}
	//*  11   25:goto            37
			catch(RemoteException remoteexception)
	//*  12   28:astore_1        
			{
				Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
	//   13   29:ldc1            #112 <String "MediaBrowserCompat">
	//   14   31:ldc1            #114 <String "Remote error unregistering client messenger.">
	//   15   33:invokestatic    #120 <Method int Log.i(String, String)>
	//   16   36:pop             
			}
		MediaBrowserCompatApi21.disconnect(mBrowserObj);
	//   17   37:aload_0         
	//   18   38:getfield        #92  <Field Object mBrowserObj>
	//   19   41:invokestatic    #122 <Method void MediaBrowserCompatApi21.disconnect(Object)>
	//   20   44:return          
	}

	public Bundle getExtras()
	{
		return MediaBrowserCompatApi21.getExtras(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Object mBrowserObj>
	//    2    4:invokestatic    #128 <Method Bundle MediaBrowserCompatApi21.getExtras(Object)>
	//    3    7:areturn         
	}

	public void getItem(final String mediaId, final MediaBrowserCompat.ItemCallback cb)
	{
		if(TextUtils.isEmpty(((CharSequence) (mediaId))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #138 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("mediaId is empty");
	//    3    7:new             #140 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #142 <String "mediaId is empty">
	//    6   13:invokespecial   #145 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(cb == null)
	//*   8   17:aload_2         
	//*   9   18:ifnonnull       31
			throw new IllegalArgumentException("cb is null");
	//   10   21:new             #140 <Class IllegalArgumentException>
	//   11   24:dup             
	//   12   25:ldc1            #147 <String "cb is null">
	//   13   27:invokespecial   #145 <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
		if(!MediaBrowserCompatApi21.isConnected(mBrowserObj))
	//*  15   31:aload_0         
	//*  16   32:getfield        #92  <Field Object mBrowserObj>
	//*  17   35:invokestatic    #151 <Method boolean MediaBrowserCompatApi21.isConnected(Object)>
	//*  18   38:ifne            68
		{
			Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
	//   19   41:ldc1            #112 <String "MediaBrowserCompat">
	//   20   43:ldc1            #153 <String "Not connected, unable to retrieve the MediaItem.">
	//   21   45:invokestatic    #120 <Method int Log.i(String, String)>
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
	//   24   50:getfield        #50  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   25   53:new             #15  <Class MediaBrowserCompat$MediaBrowserImplApi21$1>
	//   26   56:dup             
	//   27   57:aload_0         
	//   28   58:aload_2         
	//   29   59:aload_1         
	//   30   60:invokespecial   #156 <Method void MediaBrowserCompat$MediaBrowserImplApi21$1(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$ItemCallback, String)>
	//   31   63:invokevirtual   #160 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   32   66:pop             
			return;
	//   33   67:return          
		}
		if(mServiceBinderWrapper == null)
	//*  34   68:aload_0         
	//*  35   69:getfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
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
	//   38   76:getfield        #50  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   39   79:new             #17  <Class MediaBrowserCompat$MediaBrowserImplApi21$2>
	//   40   82:dup             
	//   41   83:aload_0         
	//   42   84:aload_2         
	//   43   85:aload_1         
	//   44   86:invokespecial   #161 <Method void MediaBrowserCompat$MediaBrowserImplApi21$2(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$ItemCallback, String)>
	//   45   89:invokevirtual   #160 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   46   92:pop             
			return;
	//   47   93:return          
		}
		MediaBrowserCompat.ItemReceiver itemreceiver = new MediaBrowserCompat.ItemReceiver(mediaId, cb, ((android.os.Handler) (mHandler)));
	//   48   94:new             #163 <Class MediaBrowserCompat$ItemReceiver>
	//   49   97:dup             
	//   50   98:aload_1         
	//   51   99:aload_2         
	//   52  100:aload_0         
	//   53  101:getfield        #50  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   54  104:invokespecial   #166 <Method void MediaBrowserCompat$ItemReceiver(String, MediaBrowserCompat$ItemCallback, android.os.Handler)>
	//   55  107:astore_3        
		try
		{
			mServiceBinderWrapper.getMediaItem(mediaId, ((android.support.v4.os.ResultReceiver) (itemreceiver)), mCallbacksMessenger);
	//   56  108:aload_0         
	//   57  109:getfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   58  112:aload_1         
	//   59  113:aload_3         
	//   60  114:aload_0         
	//   61  115:getfield        #104 <Field Messenger mCallbacksMessenger>
	//   62  118:invokevirtual   #170 <Method void MediaBrowserCompat$ServiceBinderWrapper.getMediaItem(String, android.support.v4.os.ResultReceiver, Messenger)>
			return;
	//   63  121:return          
		}
		catch(RemoteException remoteexception)
	//*  64  122:astore_3        
		{
			Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error getting media item: ").append(mediaId).toString());
	//   65  123:ldc1            #112 <String "MediaBrowserCompat">
	//   66  125:new             #172 <Class StringBuilder>
	//   67  128:dup             
	//   68  129:invokespecial   #173 <Method void StringBuilder()>
	//   69  132:ldc1            #175 <String "Remote error getting media item: ">
	//   70  134:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   71  137:aload_1         
	//   72  138:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   73  141:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   74  144:invokestatic    #120 <Method int Log.i(String, String)>
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
	//   77  149:getfield        #50  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   78  152:new             #19  <Class MediaBrowserCompat$MediaBrowserImplApi21$3>
	//   79  155:dup             
	//   80  156:aload_0         
	//   81  157:aload_2         
	//   82  158:aload_1         
	//   83  159:invokespecial   #184 <Method void MediaBrowserCompat$MediaBrowserImplApi21$3(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$ItemCallback, String)>
	//   84  162:invokevirtual   #160 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   85  165:pop             
	//   86  166:return          
	}

	public String getRoot()
	{
		return MediaBrowserCompatApi21.getRoot(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Object mBrowserObj>
	//    2    4:invokestatic    #189 <Method String MediaBrowserCompatApi21.getRoot(Object)>
	//    3    7:areturn         
	}

	public ComponentName getServiceComponent()
	{
		return MediaBrowserCompatApi21.getServiceComponent(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Object mBrowserObj>
	//    2    4:invokestatic    #194 <Method ComponentName MediaBrowserCompatApi21.getServiceComponent(Object)>
	//    3    7:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
	{
		return android.support.v4.media.session.MediaSessionCompat.Token.fromToken(MediaBrowserCompatApi21.getSessionToken(mBrowserObj));
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Object mBrowserObj>
	//    2    4:invokestatic    #199 <Method Object MediaBrowserCompatApi21.getSessionToken(Object)>
	//    3    7:invokestatic    #205 <Method android.support.v4.media.session.MediaSessionCompat$Token android.support.v4.media.session.MediaSessionCompat$Token.fromToken(Object)>
	//    4   10:areturn         
	}

	public boolean isConnected()
	{
		return MediaBrowserCompatApi21.isConnected(mBrowserObj);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Object mBrowserObj>
	//    2    4:invokestatic    #151 <Method boolean MediaBrowserCompatApi21.isConnected(Object)>
	//    3    7:ireturn         
	}

	public void onConnected()
	{
		Object obj = ((Object) (MediaBrowserCompatApi21.getExtras(mBrowserObj)));
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Object mBrowserObj>
	//    2    4:invokestatic    #128 <Method Bundle MediaBrowserCompatApi21.getExtras(Object)>
	//    3    7:astore_1        
		if(obj == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		obj = ((Object) (BundleCompat.getBinder(((Bundle) (obj)), "extra_messenger")));
	//    7   13:aload_1         
	//    8   14:ldc1            #209 <String "extra_messenger">
	//    9   16:invokestatic    #215 <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//   10   19:astore_1        
		if(obj != null)
	//*  11   20:aload_1         
	//*  12   21:ifnull          87
		{
			mServiceBinderWrapper = new MediaBrowserCompat.ServiceBinderWrapper(((android.os.IBinder) (obj)), mRootHints);
	//   13   24:aload_0         
	//   14   25:new             #106 <Class MediaBrowserCompat$ServiceBinderWrapper>
	//   15   28:dup             
	//   16   29:aload_1         
	//   17   30:aload_0         
	//   18   31:getfield        #75  <Field Bundle mRootHints>
	//   19   34:invokespecial   #218 <Method void MediaBrowserCompat$ServiceBinderWrapper(android.os.IBinder, Bundle)>
	//   20   37:putfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
			mCallbacksMessenger = new Messenger(((android.os.Handler) (mHandler)));
	//   21   40:aload_0         
	//   22   41:new             #220 <Class Messenger>
	//   23   44:dup             
	//   24   45:aload_0         
	//   25   46:getfield        #50  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   26   49:invokespecial   #223 <Method void Messenger(android.os.Handler)>
	//   27   52:putfield        #104 <Field Messenger mCallbacksMessenger>
			mHandler.setCallbacksMessenger(mCallbacksMessenger);
	//   28   55:aload_0         
	//   29   56:getfield        #50  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   30   59:aload_0         
	//   31   60:getfield        #104 <Field Messenger mCallbacksMessenger>
	//   32   63:invokevirtual   #226 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
			try
			{
				mServiceBinderWrapper.registerCallbackMessenger(mCallbacksMessenger);
	//   33   66:aload_0         
	//   34   67:getfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   35   70:aload_0         
	//   36   71:getfield        #104 <Field Messenger mCallbacksMessenger>
	//   37   74:invokevirtual   #229 <Method void MediaBrowserCompat$ServiceBinderWrapper.registerCallbackMessenger(Messenger)>
				return;
	//   38   77:return          
			}
			catch(RemoteException remoteexception)
	//*  39   78:astore_1        
			{
				Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
	//   40   79:ldc1            #112 <String "MediaBrowserCompat">
	//   41   81:ldc1            #231 <String "Remote error registering client messenger.">
	//   42   83:invokestatic    #120 <Method int Log.i(String, String)>
	//   43   86:pop             
			}
		}
	//   44   87:return          
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
	//    2    2:putfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		mCallbacksMessenger = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #104 <Field Messenger mCallbacksMessenger>
		mHandler.setCallbacksMessenger(((Messenger) (null)));
	//    6   10:aload_0         
	//    7   11:getfield        #50  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//    8   14:aconst_null     
	//    9   15:invokevirtual   #226 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
	//   10   18:return          
	}

	public void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle)
	{
		if(mCallbacksMessenger != messenger)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field Messenger mCallbacksMessenger>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       9
			return;
	//    4    8:return          
		messenger = ((Messenger) ((MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)))));
	//    5    9:aload_0         
	//    6   10:getfield        #55  <Field ArrayMap mSubscriptions>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #238 <Method Object ArrayMap.get(Object)>
	//    9   17:checkcast       #240 <Class MediaBrowserCompat$Subscription>
	//   10   20:astore_1        
		if(messenger == null)
	//*  11   21:aload_1         
	//*  12   22:ifnonnull       57
		{
			if(MediaBrowserCompat.DEBUG)
	//*  13   25:getstatic       #244 <Field boolean MediaBrowserCompat.DEBUG>
	//*  14   28:ifeq            56
				Log.d("MediaBrowserCompat", (new StringBuilder()).append("onLoadChildren for id that isn't subscribed id=").append(s).toString());
	//   15   31:ldc1            #112 <String "MediaBrowserCompat">
	//   16   33:new             #172 <Class StringBuilder>
	//   17   36:dup             
	//   18   37:invokespecial   #173 <Method void StringBuilder()>
	//   19   40:ldc1            #246 <String "onLoadChildren for id that isn't subscribed id=">
	//   20   42:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   21   45:aload_2         
	//   22   46:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   24   52:invokestatic    #249 <Method int Log.d(String, String)>
	//   25   55:pop             
			return;
	//   26   56:return          
		}
		messenger = ((Messenger) (((MediaBrowserCompat.Subscription) (messenger)).getCallback(bundle)));
	//   27   57:aload_1         
	//   28   58:aload           4
	//   29   60:invokevirtual   #253 <Method MediaBrowserCompat$SubscriptionCallback MediaBrowserCompat$Subscription.getCallback(Bundle)>
	//   30   63:astore_1        
		if(messenger != null)
	//*  31   64:aload_1         
	//*  32   65:ifnull          110
		{
			if(bundle == null)
	//*  33   68:aload           4
	//*  34   70:ifnonnull       90
				if(list == null)
	//*  35   73:aload_3         
	//*  36   74:ifnonnull       83
				{
					((MediaBrowserCompat.SubscriptionCallback) (messenger)).onError(s);
	//   37   77:aload_1         
	//   38   78:aload_2         
	//   39   79:invokevirtual   #258 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
					return;
	//   40   82:return          
				} else
				{
					((MediaBrowserCompat.SubscriptionCallback) (messenger)).onChildrenLoaded(s, list);
	//   41   83:aload_1         
	//   42   84:aload_2         
	//   43   85:aload_3         
	//   44   86:invokevirtual   #262 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
					return;
	//   45   89:return          
				}
			if(list == null)
	//*  46   90:aload_3         
	//*  47   91:ifnonnull       102
			{
				((MediaBrowserCompat.SubscriptionCallback) (messenger)).onError(s, bundle);
	//   48   94:aload_1         
	//   49   95:aload_2         
	//   50   96:aload           4
	//   51   98:invokevirtual   #265 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
				return;
	//   52  101:return          
			}
			((MediaBrowserCompat.SubscriptionCallback) (messenger)).onChildrenLoaded(s, list, bundle);
	//   53  102:aload_1         
	//   54  103:aload_2         
	//   55  104:aload_3         
	//   56  105:aload           4
	//   57  107:invokevirtual   #268 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
		}
	//   58  110:return          
	}

	public void onServiceConnected(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
	{
	//    0    0:return          
	}

	public void search(final String query, final Bundle extras, final MediaBrowserCompat.SearchCallback callback)
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #274 <Method boolean isConnected()>
	//*   2    4:ifne            36
		{
			Log.i("MediaBrowserCompat", "Not connected, unable to search.");
	//    3    7:ldc1            #112 <String "MediaBrowserCompat">
	//    4    9:ldc2            #276 <String "Not connected, unable to search.">
	//    5   12:invokestatic    #120 <Method int Log.i(String, String)>
	//    6   15:pop             
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
	//    7   16:aload_0         
	//    8   17:getfield        #50  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//    9   20:new             #21  <Class MediaBrowserCompat$MediaBrowserImplApi21$4>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:aload_3         
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:invokespecial   #279 <Method void MediaBrowserCompat$MediaBrowserImplApi21$4(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$SearchCallback, String, Bundle)>
	//   16   31:invokevirtual   #160 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   17   34:pop             
			return;
	//   18   35:return          
		}
		if(mServiceBinderWrapper == null)
	//*  19   36:aload_0         
	//*  20   37:getfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  21   40:ifnonnull       72
		{
			Log.i("MediaBrowserCompat", "The connected service doesn't support search.");
	//   22   43:ldc1            #112 <String "MediaBrowserCompat">
	//   23   45:ldc2            #281 <String "The connected service doesn't support search.">
	//   24   48:invokestatic    #120 <Method int Log.i(String, String)>
	//   25   51:pop             
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
	//   26   52:aload_0         
	//   27   53:getfield        #50  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   28   56:new             #23  <Class MediaBrowserCompat$MediaBrowserImplApi21$5>
	//   29   59:dup             
	//   30   60:aload_0         
	//   31   61:aload_3         
	//   32   62:aload_1         
	//   33   63:aload_2         
	//   34   64:invokespecial   #282 <Method void MediaBrowserCompat$MediaBrowserImplApi21$5(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$SearchCallback, String, Bundle)>
	//   35   67:invokevirtual   #160 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   36   70:pop             
			return;
	//   37   71:return          
		}
		MediaBrowserCompat.SearchResultReceiver searchresultreceiver = new MediaBrowserCompat.SearchResultReceiver(query, extras, callback, ((android.os.Handler) (mHandler)));
	//   38   72:new             #284 <Class MediaBrowserCompat$SearchResultReceiver>
	//   39   75:dup             
	//   40   76:aload_1         
	//   41   77:aload_2         
	//   42   78:aload_3         
	//   43   79:aload_0         
	//   44   80:getfield        #50  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   45   83:invokespecial   #287 <Method void MediaBrowserCompat$SearchResultReceiver(String, Bundle, MediaBrowserCompat$SearchCallback, android.os.Handler)>
	//   46   86:astore          4
		try
		{
			mServiceBinderWrapper.search(query, extras, ((android.support.v4.os.ResultReceiver) (searchresultreceiver)), mCallbacksMessenger);
	//   47   88:aload_0         
	//   48   89:getfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   49   92:aload_1         
	//   50   93:aload_2         
	//   51   94:aload           4
	//   52   96:aload_0         
	//   53   97:getfield        #104 <Field Messenger mCallbacksMessenger>
	//   54  100:invokevirtual   #290 <Method void MediaBrowserCompat$ServiceBinderWrapper.search(String, Bundle, android.support.v4.os.ResultReceiver, Messenger)>
			return;
	//   55  103:return          
		}
		catch(RemoteException remoteexception)
	//*  56  104:astore          4
		{
			Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error searching items with query: ").append(query).toString(), ((Throwable) (remoteexception)));
	//   57  106:ldc1            #112 <String "MediaBrowserCompat">
	//   58  108:new             #172 <Class StringBuilder>
	//   59  111:dup             
	//   60  112:invokespecial   #173 <Method void StringBuilder()>
	//   61  115:ldc2            #292 <String "Remote error searching items with query: ">
	//   62  118:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   63  121:aload_1         
	//   64  122:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   65  125:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   66  128:aload           4
	//   67  130:invokestatic    #295 <Method int Log.i(String, String, Throwable)>
	//   68  133:pop             
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
	//   69  134:aload_0         
	//   70  135:getfield        #50  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   71  138:new             #25  <Class MediaBrowserCompat$MediaBrowserImplApi21$6>
	//   72  141:dup             
	//   73  142:aload_0         
	//   74  143:aload_3         
	//   75  144:aload_1         
	//   76  145:aload_2         
	//   77  146:invokespecial   #296 <Method void MediaBrowserCompat$MediaBrowserImplApi21$6(MediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$SearchCallback, String, Bundle)>
	//   78  149:invokevirtual   #160 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   79  152:pop             
	//   80  153:return          
	}

	public void subscribe(String s, Bundle bundle, MediaBrowserCompat.SubscriptionCallback subscriptioncallback)
	{
		MediaBrowserCompat.Subscription subscription1 = (MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field ArrayMap mSubscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #238 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #240 <Class MediaBrowserCompat$Subscription>
	//    5   11:astore          5
		MediaBrowserCompat.Subscription subscription = subscription1;
	//    6   13:aload           5
	//    7   15:astore          4
		if(subscription1 == null)
	//*   8   17:aload           5
	//*   9   19:ifnonnull       42
		{
			subscription = new MediaBrowserCompat.Subscription();
	//   10   22:new             #240 <Class MediaBrowserCompat$Subscription>
	//   11   25:dup             
	//   12   26:invokespecial   #299 <Method void MediaBrowserCompat$Subscription()>
	//   13   29:astore          4
			mSubscriptions.put(((Object) (s)), ((Object) (subscription)));
	//   14   31:aload_0         
	//   15   32:getfield        #55  <Field ArrayMap mSubscriptions>
	//   16   35:aload_1         
	//   17   36:aload           4
	//   18   38:invokevirtual   #303 <Method Object ArrayMap.put(Object, Object)>
	//   19   41:pop             
		}
		MediaBrowserCompat.SubscriptionCallback.access$100(subscriptioncallback, subscription);
	//   20   42:aload_3         
	//   21   43:aload           4
	//   22   45:invokestatic    #307 <Method void MediaBrowserCompat$SubscriptionCallback.access$100(MediaBrowserCompat$SubscriptionCallback, MediaBrowserCompat$Subscription)>
		if(bundle == null)
	//*  23   48:aload_2         
	//*  24   49:ifnonnull       57
			bundle = null;
	//   25   52:aconst_null     
	//   26   53:astore_2        
		else
	//*  27   54:goto            66
			bundle = new Bundle(bundle);
	//   28   57:new             #63  <Class Bundle>
	//   29   60:dup             
	//   30   61:aload_2         
	//   31   62:invokespecial   #73  <Method void Bundle(Bundle)>
	//   32   65:astore_2        
		subscription.putCallback(bundle, subscriptioncallback);
	//   33   66:aload           4
	//   34   68:aload_2         
	//   35   69:aload_3         
	//   36   70:invokevirtual   #311 <Method void MediaBrowserCompat$Subscription.putCallback(Bundle, MediaBrowserCompat$SubscriptionCallback)>
		if(mServiceBinderWrapper == null)
	//*  37   73:aload_0         
	//*  38   74:getfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  39   77:ifnonnull       93
		{
			MediaBrowserCompatApi21.subscribe(mBrowserObj, s, MediaBrowserCompat.SubscriptionCallback.access$200(subscriptioncallback));
	//   40   80:aload_0         
	//   41   81:getfield        #92  <Field Object mBrowserObj>
	//   42   84:aload_1         
	//   43   85:aload_3         
	//   44   86:invokestatic    #315 <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
	//   45   89:invokestatic    #318 <Method void MediaBrowserCompatApi21.subscribe(Object, String, Object)>
			return;
	//   46   92:return          
		}
		try
		{
			mServiceBinderWrapper.addSubscription(s, MediaBrowserCompat.SubscriptionCallback.access$000(subscriptioncallback), bundle, mCallbacksMessenger);
	//   47   93:aload_0         
	//   48   94:getfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   49   97:aload_1         
	//   50   98:aload_3         
	//   51   99:invokestatic    #322 <Method android.os.IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
	//   52  102:aload_2         
	//   53  103:aload_0         
	//   54  104:getfield        #104 <Field Messenger mCallbacksMessenger>
	//   55  107:invokevirtual   #326 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, android.os.IBinder, Bundle, Messenger)>
			return;
	//   56  110:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  57  111:astore_2        
		{
			Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error subscribing media item: ").append(s).toString());
	//   58  112:ldc1            #112 <String "MediaBrowserCompat">
	//   59  114:new             #172 <Class StringBuilder>
	//   60  117:dup             
	//   61  118:invokespecial   #173 <Method void StringBuilder()>
	//   62  121:ldc2            #328 <String "Remote error subscribing media item: ">
	//   63  124:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   64  127:aload_1         
	//   65  128:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   66  131:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   67  134:invokestatic    #120 <Method int Log.i(String, String)>
	//   68  137:pop             
		}
	//   69  138:return          
	}

	public void unsubscribe(String s, MediaBrowserCompat.SubscriptionCallback subscriptioncallback)
	{
		MediaBrowserCompat.Subscription subscription;
		subscription = (MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field ArrayMap mSubscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #238 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #240 <Class MediaBrowserCompat$Subscription>
	//    5   11:astore          4
		if(subscription == null)
	//*   6   13:aload           4
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		if(mServiceBinderWrapper == null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  11   23:ifnonnull       127
		{
			if(subscriptioncallback == null)
	//*  12   26:aload_2         
	//*  13   27:ifnonnull       41
			{
				MediaBrowserCompatApi21.unsubscribe(mBrowserObj, s);
	//   14   30:aload_0         
	//   15   31:getfield        #92  <Field Object mBrowserObj>
	//   16   34:aload_1         
	//   17   35:invokestatic    #333 <Method void MediaBrowserCompatApi21.unsubscribe(Object, String)>
			} else
	//*  18   38:goto            259
			{
				List list = subscription.getCallbacks();
	//   19   41:aload           4
	//   20   43:invokevirtual   #337 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
	//   21   46:astore          5
				List list2 = subscription.getOptionsList();
	//   22   48:aload           4
	//   23   50:invokevirtual   #340 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
	//   24   53:astore          6
				for(int i = list.size() - 1; i >= 0; i--)
	//*  25   55:aload           5
	//*  26   57:invokeinterface #346 <Method int List.size()>
	//*  27   62:iconst_1        
	//*  28   63:isub            
	//*  29   64:istore_3        
	//*  30   65:iload_3         
	//*  31   66:iflt            106
					if(list.get(i) == subscriptioncallback)
	//*  32   69:aload           5
	//*  33   71:iload_3         
	//*  34   72:invokeinterface #349 <Method Object List.get(int)>
	//*  35   77:aload_2         
	//*  36   78:if_acmpne       99
					{
						list.remove(i);
	//   37   81:aload           5
	//   38   83:iload_3         
	//   39   84:invokeinterface #352 <Method Object List.remove(int)>
	//   40   89:pop             
						list2.remove(i);
	//   41   90:aload           6
	//   42   92:iload_3         
	//   43   93:invokeinterface #352 <Method Object List.remove(int)>
	//   44   98:pop             
					}

	//   45   99:iload_3         
	//   46  100:iconst_1        
	//   47  101:isub            
	//   48  102:istore_3        
	//*  49  103:goto            65
				if(list.size() == 0)
	//*  50  106:aload           5
	//*  51  108:invokeinterface #346 <Method int List.size()>
	//*  52  113:ifne            124
					MediaBrowserCompatApi21.unsubscribe(mBrowserObj, s);
	//   53  116:aload_0         
	//   54  117:getfield        #92  <Field Object mBrowserObj>
	//   55  120:aload_1         
	//   56  121:invokestatic    #333 <Method void MediaBrowserCompatApi21.unsubscribe(Object, String)>
			}
			break MISSING_BLOCK_LABEL_259;
	//   57  124:goto            259
		}
		if(subscriptioncallback == null)
	//*  58  127:aload_2         
	//*  59  128:ifnonnull       147
		{
			int j;
			List list1;
			List list3;
			try
			{
				mServiceBinderWrapper.removeSubscription(s, ((android.os.IBinder) (null)), mCallbacksMessenger);
	//   60  131:aload_0         
	//   61  132:getfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   62  135:aload_1         
	//   63  136:aconst_null     
	//   64  137:aload_0         
	//   65  138:getfield        #104 <Field Messenger mCallbacksMessenger>
	//   66  141:invokevirtual   #356 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, android.os.IBinder, Messenger)>
			}
	//*  67  144:goto            228
	//*  68  147:aload           4
	//*  69  149:invokevirtual   #337 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
	//*  70  152:astore          5
	//*  71  154:aload           4
	//*  72  156:invokevirtual   #340 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
	//*  73  159:astore          6
	//*  74  161:aload           5
	//*  75  163:invokeinterface #346 <Method int List.size()>
	//*  76  168:iconst_1        
	//*  77  169:isub            
	//*  78  170:istore_3        
	//*  79  171:iload_3         
	//*  80  172:iflt            228
	//*  81  175:aload           5
	//*  82  177:iload_3         
	//*  83  178:invokeinterface #349 <Method Object List.get(int)>
	//*  84  183:aload_2         
	//*  85  184:if_acmpne       221
	//*  86  187:aload_0         
	//*  87  188:getfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  88  191:aload_1         
	//*  89  192:aload_2         
	//*  90  193:invokestatic    #322 <Method android.os.IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
	//*  91  196:aload_0         
	//*  92  197:getfield        #104 <Field Messenger mCallbacksMessenger>
	//*  93  200:invokevirtual   #356 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, android.os.IBinder, Messenger)>
	//*  94  203:aload           5
	//*  95  205:iload_3         
	//*  96  206:invokeinterface #352 <Method Object List.remove(int)>
	//*  97  211:pop             
	//*  98  212:aload           6
	//*  99  214:iload_3         
	//* 100  215:invokeinterface #352 <Method Object List.remove(int)>
	//* 101  220:pop             
	//* 102  221:iload_3         
	//* 103  222:iconst_1        
	//* 104  223:isub            
	//* 105  224:istore_3        
	//* 106  225:goto            171
	//* 107  228:goto            259
			catch(RemoteException remoteexception)
	//* 108  231:astore          5
			{
				Log.d("MediaBrowserCompat", (new StringBuilder()).append("removeSubscription failed with RemoteException parentId=").append(s).toString());
	//  109  233:ldc1            #112 <String "MediaBrowserCompat">
	//  110  235:new             #172 <Class StringBuilder>
	//  111  238:dup             
	//  112  239:invokespecial   #173 <Method void StringBuilder()>
	//  113  242:ldc2            #358 <String "removeSubscription failed with RemoteException parentId=">
	//  114  245:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//  115  248:aload_1         
	//  116  249:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//  117  252:invokevirtual   #183 <Method String StringBuilder.toString()>
	//  118  255:invokestatic    #249 <Method int Log.d(String, String)>
	//  119  258:pop             
			}
			break MISSING_BLOCK_LABEL_259;
		}
		list1 = subscription.getCallbacks();
		list3 = subscription.getOptionsList();
		j = list1.size() - 1;
_L3:
		if(j < 0) goto _L2; else goto _L1
_L1:
		if(list1.get(j) == subscriptioncallback)
		{
			mServiceBinderWrapper.removeSubscription(s, MediaBrowserCompat.SubscriptionCallback.access$000(subscriptioncallback), mCallbacksMessenger);
			list1.remove(j);
			list3.remove(j);
		}
		j--;
		  goto _L3
_L2:
		if(subscription.isEmpty() || subscriptioncallback == null)
	//* 120  259:aload           4
	//* 121  261:invokevirtual   #360 <Method boolean MediaBrowserCompat$Subscription.isEmpty()>
	//* 122  264:ifne            271
	//* 123  267:aload_2         
	//* 124  268:ifnonnull       280
			mSubscriptions.remove(((Object) (s)));
	//  125  271:aload_0         
	//  126  272:getfield        #55  <Field ArrayMap mSubscriptions>
	//  127  275:aload_1         
	//  128  276:invokevirtual   #362 <Method Object ArrayMap.remove(Object)>
	//  129  279:pop             
		return;
	//  130  280:return          
	}

	protected final Object mBrowserObj;
	protected Messenger mCallbacksMessenger;
	protected final MediaBrowserCompat.CallbackHandler mHandler = new MediaBrowserCompat.CallbackHandler(((lbackImpl) (this)));
	protected final Bundle mRootHints;
	protected MediaBrowserCompat.ServiceBinderWrapper mServiceBinderWrapper;
	private final ArrayMap mSubscriptions = new ArrayMap();

	public MediaBrowserCompat$MediaBrowserImplApi21(Context context, ComponentName componentname, MediaBrowserCompat.ConnectionCallback connectioncallback, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #45  <Class MediaBrowserCompat$CallbackHandler>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #48  <Method void MediaBrowserCompat$CallbackHandler(MediaBrowserCompat$MediaBrowserServiceCallbackImpl)>
	//    7   13:putfield        #50  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//    8   16:aload_0         
	//    9   17:new             #52  <Class ArrayMap>
	//   10   20:dup             
	//   11   21:invokespecial   #53  <Method void ArrayMap()>
	//   12   24:putfield        #55  <Field ArrayMap mSubscriptions>
		if(android.os.Build.VERSION.SDK_INT <= 25)
	//*  13   27:getstatic       #61  <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   30:bipush          25
	//*  15   32:icmpgt          77
		{
			Bundle bundle1 = bundle;
	//   16   35:aload           4
	//   17   37:astore          5
			if(bundle == null)
	//*  18   39:aload           4
	//*  19   41:ifnonnull       53
				bundle1 = new Bundle();
	//   20   44:new             #63  <Class Bundle>
	//   21   47:dup             
	//   22   48:invokespecial   #64  <Method void Bundle()>
	//   23   51:astore          5
			bundle1.putInt("extra_client_version", 1);
	//   24   53:aload           5
	//   25   55:ldc1            #66  <String "extra_client_version">
	//   26   57:iconst_1        
	//   27   58:invokevirtual   #70  <Method void Bundle.putInt(String, int)>
			mRootHints = new Bundle(bundle1);
	//   28   61:aload_0         
	//   29   62:new             #63  <Class Bundle>
	//   30   65:dup             
	//   31   66:aload           5
	//   32   68:invokespecial   #73  <Method void Bundle(Bundle)>
	//   33   71:putfield        #75  <Field Bundle mRootHints>
		} else
	//*  34   74:goto            105
		{
			if(bundle == null)
	//*  35   77:aload           4
	//*  36   79:ifnonnull       88
				bundle = null;
	//   37   82:aconst_null     
	//   38   83:astore          4
			else
	//*  39   85:goto            99
				bundle = new Bundle(bundle);
	//   40   88:new             #63  <Class Bundle>
	//   41   91:dup             
	//   42   92:aload           4
	//   43   94:invokespecial   #73  <Method void Bundle(Bundle)>
	//   44   97:astore          4
			mRootHints = bundle;
	//   45   99:aload_0         
	//   46  100:aload           4
	//   47  102:putfield        #75  <Field Bundle mRootHints>
		}
		connectioncallback.setInternalConnectionCallback(((nectionCallbackInternal) (this)));
	//   48  105:aload_3         
	//   49  106:aload_0         
	//   50  107:invokevirtual   #81  <Method void MediaBrowserCompat$ConnectionCallback.setInternalConnectionCallback(MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal)>
		mBrowserObj = MediaBrowserCompatApi21.createBrowser(context, componentname, connectioncallback.mConnectionCallbackObj, mRootHints);
	//   51  110:aload_0         
	//   52  111:aload_1         
	//   53  112:aload_2         
	//   54  113:aload_3         
	//   55  114:getfield        #84  <Field Object MediaBrowserCompat$ConnectionCallback.mConnectionCallbackObj>
	//   56  117:aload_0         
	//   57  118:getfield        #75  <Field Bundle mRootHints>
	//   58  121:invokestatic    #90  <Method Object MediaBrowserCompatApi21.createBrowser(Context, ComponentName, Object, Bundle)>
	//   59  124:putfield        #92  <Field Object mBrowserObj>
	//   60  127:return          
	}
}
