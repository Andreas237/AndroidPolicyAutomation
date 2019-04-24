// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.*;
import android.os.*;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.BuildCompat;
import android.support.v4.os.ResultReceiver;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompatApi21, MediaBrowserCompatApi23, MediaBrowserCompatApi24, MediaDescriptionCompat, 
//			MediaBrowserCompatUtils

public final class MediaBrowserCompat
{
	static class CallbackHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			if(mCallbacksMessengerRef == null || mCallbacksMessengerRef.get() == null || mCallbackImplRef.get() == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field WeakReference mCallbacksMessengerRef>
		//*   2    4:ifnull          27
		//*   3    7:aload_0         
		//*   4    8:getfield        #29  <Field WeakReference mCallbacksMessengerRef>
		//*   5   11:invokevirtual   #33  <Method Object WeakReference.get()>
		//*   6   14:ifnull          27
		//*   7   17:aload_0         
		//*   8   18:getfield        #24  <Field WeakReference mCallbackImplRef>
		//*   9   21:invokevirtual   #33  <Method Object WeakReference.get()>
		//*  10   24:ifnonnull       28
				return;
		//   11   27:return          
			Bundle bundle = message.getData();
		//   12   28:aload_1         
		//   13   29:invokevirtual   #39  <Method Bundle Message.getData()>
		//   14   32:astore_2        
			bundle.setClassLoader(((Class) (android/support/v4/media/session/MediaSessionCompat)).getClassLoader());
		//   15   33:aload_2         
		//   16   34:ldc1            #41  <Class MediaSessionCompat>
		//   17   36:invokevirtual   #47  <Method ClassLoader Class.getClassLoader()>
		//   18   39:invokevirtual   #53  <Method void Bundle.setClassLoader(ClassLoader)>
			switch(message.what)
		//*  19   42:aload_1         
		//*  20   43:getfield        #57  <Field int Message.what>
			{
		//*  21   46:tableswitch     1 3: default 72
		//		               1 75
		//		               2 122
		//		               3 148
		//*  22   72:goto            192
			case 1: // '\001'
				((MediaBrowserServiceCallbackImpl)mCallbackImplRef.get()).onServiceConnected((Messenger)mCallbacksMessengerRef.get(), bundle.getString("data_media_item_id"), (android.support.v4.media.session.MediaSessionCompat.Token)bundle.getParcelable("data_media_session_token"), bundle.getBundle("data_root_hints"));
		//   23   75:aload_0         
		//   24   76:getfield        #24  <Field WeakReference mCallbackImplRef>
		//   25   79:invokevirtual   #33  <Method Object WeakReference.get()>
		//   26   82:checkcast       #59  <Class MediaBrowserCompat$MediaBrowserServiceCallbackImpl>
		//   27   85:aload_0         
		//   28   86:getfield        #29  <Field WeakReference mCallbacksMessengerRef>
		//   29   89:invokevirtual   #33  <Method Object WeakReference.get()>
		//   30   92:checkcast       #61  <Class Messenger>
		//   31   95:aload_2         
		//   32   96:ldc1            #63  <String "data_media_item_id">
		//   33   98:invokevirtual   #67  <Method String Bundle.getString(String)>
		//   34  101:aload_2         
		//   35  102:ldc1            #69  <String "data_media_session_token">
		//   36  104:invokevirtual   #73  <Method Parcelable Bundle.getParcelable(String)>
		//   37  107:checkcast       #75  <Class android.support.v4.media.session.MediaSessionCompat$Token>
		//   38  110:aload_2         
		//   39  111:ldc1            #77  <String "data_root_hints">
		//   40  113:invokevirtual   #81  <Method Bundle Bundle.getBundle(String)>
		//   41  116:invokeinterface #85  <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onServiceConnected(Messenger, String, android.support.v4.media.session.MediaSessionCompat$Token, Bundle)>
				return;
		//   42  121:return          

			case 2: // '\002'
				((MediaBrowserServiceCallbackImpl)mCallbackImplRef.get()).onConnectionFailed((Messenger)mCallbacksMessengerRef.get());
		//   43  122:aload_0         
		//   44  123:getfield        #24  <Field WeakReference mCallbackImplRef>
		//   45  126:invokevirtual   #33  <Method Object WeakReference.get()>
		//   46  129:checkcast       #59  <Class MediaBrowserCompat$MediaBrowserServiceCallbackImpl>
		//   47  132:aload_0         
		//   48  133:getfield        #29  <Field WeakReference mCallbacksMessengerRef>
		//   49  136:invokevirtual   #33  <Method Object WeakReference.get()>
		//   50  139:checkcast       #61  <Class Messenger>
		//   51  142:invokeinterface #89  <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onConnectionFailed(Messenger)>
				return;
		//   52  147:return          

			case 3: // '\003'
				((MediaBrowserServiceCallbackImpl)mCallbackImplRef.get()).onLoadChildren((Messenger)mCallbacksMessengerRef.get(), bundle.getString("data_media_item_id"), ((List) (bundle.getParcelableArrayList("data_media_item_list"))), bundle.getBundle("data_options"));
		//   53  148:aload_0         
		//   54  149:getfield        #24  <Field WeakReference mCallbackImplRef>
		//   55  152:invokevirtual   #33  <Method Object WeakReference.get()>
		//   56  155:checkcast       #59  <Class MediaBrowserCompat$MediaBrowserServiceCallbackImpl>
		//   57  158:aload_0         
		//   58  159:getfield        #29  <Field WeakReference mCallbacksMessengerRef>
		//   59  162:invokevirtual   #33  <Method Object WeakReference.get()>
		//   60  165:checkcast       #61  <Class Messenger>
		//   61  168:aload_2         
		//   62  169:ldc1            #63  <String "data_media_item_id">
		//   63  171:invokevirtual   #67  <Method String Bundle.getString(String)>
		//   64  174:aload_2         
		//   65  175:ldc1            #91  <String "data_media_item_list">
		//   66  177:invokevirtual   #95  <Method ArrayList Bundle.getParcelableArrayList(String)>
		//   67  180:aload_2         
		//   68  181:ldc1            #97  <String "data_options">
		//   69  183:invokevirtual   #81  <Method Bundle Bundle.getBundle(String)>
		//   70  186:invokeinterface #101 <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onLoadChildren(Messenger, String, List, Bundle)>
				return;
		//   71  191:return          
			}
			Log.w("MediaBrowserCompat", (new StringBuilder()).append("Unhandled message: ").append(((Object) (message))).append("\n  Client version: ").append(1).append("\n  Service version: ").append(message.arg1).toString());
		//   72  192:ldc1            #103 <String "MediaBrowserCompat">
		//   73  194:new             #105 <Class StringBuilder>
		//   74  197:dup             
		//   75  198:invokespecial   #106 <Method void StringBuilder()>
		//   76  201:ldc1            #108 <String "Unhandled message: ">
		//   77  203:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
		//   78  206:aload_1         
		//   79  207:invokevirtual   #115 <Method StringBuilder StringBuilder.append(Object)>
		//   80  210:ldc1            #117 <String "\n  Client version: ">
		//   81  212:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
		//   82  215:iconst_1        
		//   83  216:invokevirtual   #120 <Method StringBuilder StringBuilder.append(int)>
		//   84  219:ldc1            #122 <String "\n  Service version: ">
		//   85  221:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
		//   86  224:aload_1         
		//   87  225:getfield        #125 <Field int Message.arg1>
		//   88  228:invokevirtual   #120 <Method StringBuilder StringBuilder.append(int)>
		//   89  231:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   90  234:invokestatic    #135 <Method int Log.w(String, String)>
		//   91  237:pop             
		//   92  238:return          
		}

		void setCallbacksMessenger(Messenger messenger)
		{
			mCallbacksMessengerRef = new WeakReference(((Object) (messenger)));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class WeakReference>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #22  <Method void WeakReference(Object)>
		//    5    9:putfield        #29  <Field WeakReference mCallbacksMessengerRef>
		//    6   12:return          
		}

		private final WeakReference mCallbackImplRef;
		private WeakReference mCallbacksMessengerRef;

		CallbackHandler(MediaBrowserServiceCallbackImpl mediabrowserservicecallbackimpl)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Handler()>
			mCallbackImplRef = new WeakReference(((Object) (mediabrowserservicecallbackimpl)));
		//    2    4:aload_0         
		//    3    5:new             #19  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #22  <Method void WeakReference(Object)>
		//    7   13:putfield        #24  <Field WeakReference mCallbackImplRef>
		//    8   16:return          
		}
	}

	public static class ConnectionCallback
	{

		public void onConnected()
		{
		//    0    0:return          
		}

		public void onConnectionFailed()
		{
		//    0    0:return          
		}

		public void onConnectionSuspended()
		{
		//    0    0:return          
		}

		void setInternalConnectionCallback(ConnectionCallbackInternal connectioncallbackinternal)
		{
			mConnectionCallbackInternal = connectioncallbackinternal;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #46  <Field MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal mConnectionCallbackInternal>
		//    3    5:return          
		}

		ConnectionCallbackInternal mConnectionCallbackInternal;
		final Object mConnectionCallbackObj;

		public ConnectionCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   2    4:getstatic       #27  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmplt          28
			{
				mConnectionCallbackObj = MediaBrowserCompatApi21.createConnectionCallback(((MediaBrowserCompatApi21.ConnectionCallback) (new StubApi21())));
		//    5   12:aload_0         
		//    6   13:new             #12  <Class MediaBrowserCompat$ConnectionCallback$StubApi21>
		//    7   16:dup             
		//    8   17:aload_0         
		//    9   18:invokespecial   #30  <Method void MediaBrowserCompat$ConnectionCallback$StubApi21(MediaBrowserCompat$ConnectionCallback)>
		//   10   21:invokestatic    #36  <Method Object MediaBrowserCompatApi21.createConnectionCallback(MediaBrowserCompatApi21$ConnectionCallback)>
		//   11   24:putfield        #38  <Field Object mConnectionCallbackObj>
				return;
		//   12   27:return          
			} else
			{
				mConnectionCallbackObj = null;
		//   13   28:aload_0         
		//   14   29:aconst_null     
		//   15   30:putfield        #38  <Field Object mConnectionCallbackObj>
				return;
		//   16   33:return          
			}
		}
	}

	static interface ConnectionCallback.ConnectionCallbackInternal
	{

		public abstract void onConnected();

		public abstract void onConnectionFailed();

		public abstract void onConnectionSuspended();
	}

	class ConnectionCallback.StubApi21
		implements MediaBrowserCompatApi21.ConnectionCallback
	{

		public void onConnected()
		{
			if(mConnectionCallbackInternal != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//*   2    4:getfield        #27  <Field MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal MediaBrowserCompat$ConnectionCallback.mConnectionCallbackInternal>
		//*   3    7:ifnull          22
				mConnectionCallbackInternal.onConnected();
		//    4   10:aload_0         
		//    5   11:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//    6   14:getfield        #27  <Field MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal MediaBrowserCompat$ConnectionCallback.mConnectionCallbackInternal>
		//    7   17:invokeinterface #31  <Method void MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal.onConnected()>
			ConnectionCallback.this.onConnected();
		//    8   22:aload_0         
		//    9   23:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//   10   26:invokevirtual   #32  <Method void MediaBrowserCompat$ConnectionCallback.onConnected()>
		//   11   29:return          
		}

		public void onConnectionFailed()
		{
			if(mConnectionCallbackInternal != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//*   2    4:getfield        #27  <Field MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal MediaBrowserCompat$ConnectionCallback.mConnectionCallbackInternal>
		//*   3    7:ifnull          22
				mConnectionCallbackInternal.onConnectionFailed();
		//    4   10:aload_0         
		//    5   11:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//    6   14:getfield        #27  <Field MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal MediaBrowserCompat$ConnectionCallback.mConnectionCallbackInternal>
		//    7   17:invokeinterface #35  <Method void MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal.onConnectionFailed()>
			ConnectionCallback.this.onConnectionFailed();
		//    8   22:aload_0         
		//    9   23:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//   10   26:invokevirtual   #36  <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
		//   11   29:return          
		}

		public void onConnectionSuspended()
		{
			if(mConnectionCallbackInternal != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//*   2    4:getfield        #27  <Field MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal MediaBrowserCompat$ConnectionCallback.mConnectionCallbackInternal>
		//*   3    7:ifnull          22
				mConnectionCallbackInternal.onConnectionSuspended();
		//    4   10:aload_0         
		//    5   11:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//    6   14:getfield        #27  <Field MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal MediaBrowserCompat$ConnectionCallback.mConnectionCallbackInternal>
		//    7   17:invokeinterface #39  <Method void MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal.onConnectionSuspended()>
			ConnectionCallback.this.onConnectionSuspended();
		//    8   22:aload_0         
		//    9   23:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//   10   26:invokevirtual   #40  <Method void MediaBrowserCompat$ConnectionCallback.onConnectionSuspended()>
		//   11   29:return          
		}

		final ConnectionCallback this$0;

		ConnectionCallback.StubApi21()
		{
			this$0 = ConnectionCallback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}
	}

	public static abstract class ItemCallback
	{

		public void onError(String s)
		{
		//    0    0:return          
		}

		public void onItemLoaded(MediaItem mediaitem)
		{
		//    0    0:return          
		}

		final Object mItemCallbackObj;

		public ItemCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			if(android.os.Build.VERSION.SDK_INT >= 23)
		//*   2    4:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          23
		//*   4    9:icmplt          28
			{
				mItemCallbackObj = MediaBrowserCompatApi23.createItemCallback(((MediaBrowserCompatApi23.ItemCallback) (new StubApi23())));
		//    5   12:aload_0         
		//    6   13:new             #9   <Class MediaBrowserCompat$ItemCallback$StubApi23>
		//    7   16:dup             
		//    8   17:aload_0         
		//    9   18:invokespecial   #25  <Method void MediaBrowserCompat$ItemCallback$StubApi23(MediaBrowserCompat$ItemCallback)>
		//   10   21:invokestatic    #31  <Method Object MediaBrowserCompatApi23.createItemCallback(MediaBrowserCompatApi23$ItemCallback)>
		//   11   24:putfield        #33  <Field Object mItemCallbackObj>
				return;
		//   12   27:return          
			} else
			{
				mItemCallbackObj = null;
		//   13   28:aload_0         
		//   14   29:aconst_null     
		//   15   30:putfield        #33  <Field Object mItemCallbackObj>
				return;
		//   16   33:return          
			}
		}
	}

	class ItemCallback.StubApi23
		implements MediaBrowserCompatApi23.ItemCallback
	{

		public void onError(String s)
		{
			ItemCallback.this.onError(s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaBrowserCompat$ItemCallback this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #27  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
		//    4    8:return          
		}

		public void onItemLoaded(Parcel parcel)
		{
			if(parcel == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				ItemCallback.this.onItemLoaded(((MediaItem) (null)));
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field MediaBrowserCompat$ItemCallback this$0>
		//    4    8:aconst_null     
		//    5    9:invokevirtual   #33  <Method void MediaBrowserCompat$ItemCallback.onItemLoaded(MediaBrowserCompat$MediaItem)>
				return;
		//    6   12:return          
			} else
			{
				parcel.setDataPosition(0);
		//    7   13:aload_1         
		//    8   14:iconst_0        
		//    9   15:invokevirtual   #39  <Method void Parcel.setDataPosition(int)>
				MediaItem mediaitem = (MediaItem)MediaItem.CREATOR.createFromParcel(parcel);
		//   10   18:getstatic       #45  <Field android.os.Parcelable$Creator MediaBrowserCompat$MediaItem.CREATOR>
		//   11   21:aload_1         
		//   12   22:invokeinterface #51  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   13   27:checkcast       #41  <Class MediaBrowserCompat$MediaItem>
		//   14   30:astore_2        
				parcel.recycle();
		//   15   31:aload_1         
		//   16   32:invokevirtual   #54  <Method void Parcel.recycle()>
				ItemCallback.this.onItemLoaded(mediaitem);
		//   17   35:aload_0         
		//   18   36:getfield        #18  <Field MediaBrowserCompat$ItemCallback this$0>
		//   19   39:aload_2         
		//   20   40:invokevirtual   #33  <Method void MediaBrowserCompat$ItemCallback.onItemLoaded(MediaBrowserCompat$MediaItem)>
				return;
		//   21   43:return          
			}
		}

		final ItemCallback this$0;

		ItemCallback.StubApi23()
		{
			this$0 = ItemCallback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaBrowserCompat$ItemCallback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}
	}

	static class ItemReceiver extends ResultReceiver
	{

		public void onReceiveResult(int i, Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_2         
		//*   1    1:ifnull          13
				bundle.setClassLoader(((Class) (android/support/v4/media/MediaBrowserCompat)).getClassLoader());
		//    2    4:aload_2         
		//    3    5:ldc1            #6   <Class MediaBrowserCompat>
		//    4    7:invokevirtual   #29  <Method ClassLoader Class.getClassLoader()>
		//    5   10:invokevirtual   #35  <Method void Bundle.setClassLoader(ClassLoader)>
			if(i != 0 || bundle == null || !bundle.containsKey("media_item"))
		//*   6   13:iload_1         
		//*   7   14:ifne            30
		//*   8   17:aload_2         
		//*   9   18:ifnull          30
		//*  10   21:aload_2         
		//*  11   22:ldc1            #37  <String "media_item">
		//*  12   24:invokevirtual   #41  <Method boolean Bundle.containsKey(String)>
		//*  13   27:ifne            42
			{
				mCallback.onError(mMediaId);
		//   14   30:aload_0         
		//   15   31:getfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
		//   16   34:aload_0         
		//   17   35:getfield        #18  <Field String mMediaId>
		//   18   38:invokevirtual   #47  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
				return;
		//   19   41:return          
			}
			bundle = ((Bundle) (bundle.getParcelable("media_item")));
		//   20   42:aload_2         
		//   21   43:ldc1            #37  <String "media_item">
		//   22   45:invokevirtual   #51  <Method Parcelable Bundle.getParcelable(String)>
		//   23   48:astore_2        
			if(bundle == null || (bundle instanceof MediaItem))
		//*  24   49:aload_2         
		//*  25   50:ifnull          60
		//*  26   53:aload_2         
		//*  27   54:instanceof      #53  <Class MediaBrowserCompat$MediaItem>
		//*  28   57:ifeq            72
			{
				mCallback.onItemLoaded((MediaItem)bundle);
		//   29   60:aload_0         
		//   30   61:getfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
		//   31   64:aload_2         
		//   32   65:checkcast       #53  <Class MediaBrowserCompat$MediaItem>
		//   33   68:invokevirtual   #57  <Method void MediaBrowserCompat$ItemCallback.onItemLoaded(MediaBrowserCompat$MediaItem)>
				return;
		//   34   71:return          
			} else
			{
				mCallback.onError(mMediaId);
		//   35   72:aload_0         
		//   36   73:getfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
		//   37   76:aload_0         
		//   38   77:getfield        #18  <Field String mMediaId>
		//   39   80:invokevirtual   #47  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
				return;
		//   40   83:return          
			}
		}

		private final ItemCallback mCallback;
		private final String mMediaId;

		ItemReceiver(String s, ItemCallback itemcallback, Handler handler)
		{
			super(handler);
		//    0    0:aload_0         
		//    1    1:aload_3         
		//    2    2:invokespecial   #16  <Method void ResultReceiver(Handler)>
			mMediaId = s;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #18  <Field String mMediaId>
			mCallback = itemcallback;
		//    6   10:aload_0         
		//    7   11:aload_2         
		//    8   12:putfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
		//    9   15:return          
		}
	}

	static interface MediaBrowserImpl
	{

		public abstract void connect();

		public abstract void disconnect();

		public abstract Bundle getExtras();

		public abstract void getItem(String s, ItemCallback itemcallback);

		public abstract String getRoot();

		public abstract ComponentName getServiceComponent();

		public abstract android.support.v4.media.session.MediaSessionCompat.Token getSessionToken();

		public abstract boolean isConnected();

		public abstract void search(String s, Bundle bundle, SearchCallback searchcallback);

		public abstract void subscribe(String s, Bundle bundle, SubscriptionCallback subscriptioncallback);

		public abstract void unsubscribe(String s, SubscriptionCallback subscriptioncallback);
	}

	static class MediaBrowserImplApi21
		implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl, ConnectionCallback.ConnectionCallbackInternal
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

		public void getItem(String s, final ItemCallback cb)
		{
			if(TextUtils.isEmpty(((CharSequence) (s))))
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
				mHandler.post(((_cls1) (s)). new Runnable() {

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

					final MediaBrowserImplApi21 this$0;
					final ItemCallback val$cb;
					final String val$mediaId;

			
			{
				this$0 = final_mediabrowserimplapi21;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserCompat$MediaBrowserImplApi21 this$0>
				cb = itemcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
				mediaId = String.this;
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
				mHandler.post(((_cls2) (s)). new Runnable() {

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

					final MediaBrowserImplApi21 this$0;
					final ItemCallback val$cb;
					final String val$mediaId;

			
			{
				this$0 = final_mediabrowserimplapi21;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserCompat$MediaBrowserImplApi21 this$0>
				cb = itemcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
				mediaId = String.this;
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
			ItemReceiver itemreceiver = new ItemReceiver(s, cb, ((Handler) (mHandler)));
		//   48   94:new             #163 <Class MediaBrowserCompat$ItemReceiver>
		//   49   97:dup             
		//   50   98:aload_1         
		//   51   99:aload_2         
		//   52  100:aload_0         
		//   53  101:getfield        #50  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   54  104:invokespecial   #166 <Method void MediaBrowserCompat$ItemReceiver(String, MediaBrowserCompat$ItemCallback, Handler)>
		//   55  107:astore_3        
			try
			{
				mServiceBinderWrapper.getMediaItem(s, ((ResultReceiver) (itemreceiver)), mCallbacksMessenger);
		//   56  108:aload_0         
		//   57  109:getfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   58  112:aload_1         
		//   59  113:aload_3         
		//   60  114:aload_0         
		//   61  115:getfield        #104 <Field Messenger mCallbacksMessenger>
		//   62  118:invokevirtual   #170 <Method void MediaBrowserCompat$ServiceBinderWrapper.getMediaItem(String, ResultReceiver, Messenger)>
				return;
		//   63  121:return          
			}
			catch(RemoteException remoteexception)
		//*  64  122:astore_3        
			{
				Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error getting media item: ").append(s).toString());
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
			mHandler.post(((_cls3) (s)). new Runnable() {

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

				final MediaBrowserImplApi21 this$0;
				final ItemCallback val$cb;
				final String val$mediaId;

			
			{
				this$0 = final_mediabrowserimplapi21;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserCompat$MediaBrowserImplApi21 this$0>
				cb = itemcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
				mediaId = String.this;
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
		//    9   16:invokestatic    #215 <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//   10   19:astore_1        
			if(obj != null)
		//*  11   20:aload_1         
		//*  12   21:ifnull          87
			{
				mServiceBinderWrapper = new ServiceBinderWrapper(((IBinder) (obj)), mRootHints);
		//   13   24:aload_0         
		//   14   25:new             #106 <Class MediaBrowserCompat$ServiceBinderWrapper>
		//   15   28:dup             
		//   16   29:aload_1         
		//   17   30:aload_0         
		//   18   31:getfield        #75  <Field Bundle mRootHints>
		//   19   34:invokespecial   #218 <Method void MediaBrowserCompat$ServiceBinderWrapper(IBinder, Bundle)>
		//   20   37:putfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
				mCallbacksMessenger = new Messenger(((Handler) (mHandler)));
		//   21   40:aload_0         
		//   22   41:new             #220 <Class Messenger>
		//   23   44:dup             
		//   24   45:aload_0         
		//   25   46:getfield        #50  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   26   49:invokespecial   #223 <Method void Messenger(Handler)>
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
			messenger = ((Messenger) ((Subscription)mSubscriptions.get(((Object) (s)))));
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
			messenger = ((Messenger) (((Subscription) (messenger)).getCallback(bundle)));
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
						((SubscriptionCallback) (messenger)).onError(s);
		//   37   77:aload_1         
		//   38   78:aload_2         
		//   39   79:invokevirtual   #258 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
						return;
		//   40   82:return          
					} else
					{
						((SubscriptionCallback) (messenger)).onChildrenLoaded(s, list);
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
					((SubscriptionCallback) (messenger)).onError(s, bundle);
		//   48   94:aload_1         
		//   49   95:aload_2         
		//   50   96:aload           4
		//   51   98:invokevirtual   #265 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
					return;
		//   52  101:return          
				}
				((SubscriptionCallback) (messenger)).onChildrenLoaded(s, list, bundle);
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

		public void search(final String query, Bundle bundle, final SearchCallback callback)
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
				mHandler.post(((_cls4) (bundle)). new Runnable() {

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

					final MediaBrowserImplApi21 this$0;
					final SearchCallback val$callback;
					final Bundle val$extras;
					final String val$query;

			
			{
				this$0 = final_mediabrowserimplapi21;
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
				extras = Bundle.this;
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
				mHandler.post(((_cls5) (bundle)). new Runnable() {

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

					final MediaBrowserImplApi21 this$0;
					final SearchCallback val$callback;
					final Bundle val$extras;
					final String val$query;

			
			{
				this$0 = final_mediabrowserimplapi21;
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
				extras = Bundle.this;
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
			SearchResultReceiver searchresultreceiver = new SearchResultReceiver(query, bundle, callback, ((Handler) (mHandler)));
		//   38   72:new             #284 <Class MediaBrowserCompat$SearchResultReceiver>
		//   39   75:dup             
		//   40   76:aload_1         
		//   41   77:aload_2         
		//   42   78:aload_3         
		//   43   79:aload_0         
		//   44   80:getfield        #50  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   45   83:invokespecial   #287 <Method void MediaBrowserCompat$SearchResultReceiver(String, Bundle, MediaBrowserCompat$SearchCallback, Handler)>
		//   46   86:astore          4
			try
			{
				mServiceBinderWrapper.search(query, bundle, ((ResultReceiver) (searchresultreceiver)), mCallbacksMessenger);
		//   47   88:aload_0         
		//   48   89:getfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   49   92:aload_1         
		//   50   93:aload_2         
		//   51   94:aload           4
		//   52   96:aload_0         
		//   53   97:getfield        #104 <Field Messenger mCallbacksMessenger>
		//   54  100:invokevirtual   #290 <Method void MediaBrowserCompat$ServiceBinderWrapper.search(String, Bundle, ResultReceiver, Messenger)>
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
			mHandler.post(((_cls6) (bundle)). new Runnable() {

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

				final MediaBrowserImplApi21 this$0;
				final SearchCallback val$callback;
				final Bundle val$extras;
				final String val$query;

			
			{
				this$0 = final_mediabrowserimplapi21;
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
				extras = Bundle.this;
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

		public void subscribe(String s, Bundle bundle, SubscriptionCallback subscriptioncallback)
		{
			Subscription subscription1 = (Subscription)mSubscriptions.get(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field ArrayMap mSubscriptions>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #238 <Method Object ArrayMap.get(Object)>
		//    4    8:checkcast       #240 <Class MediaBrowserCompat$Subscription>
		//    5   11:astore          5
			Subscription subscription = subscription1;
		//    6   13:aload           5
		//    7   15:astore          4
			if(subscription1 == null)
		//*   8   17:aload           5
		//*   9   19:ifnonnull       42
			{
				subscription = new Subscription();
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
			subscriptioncallback.setSubscription(subscription);
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
				MediaBrowserCompatApi21.subscribe(mBrowserObj, s, subscriptioncallback.mSubscriptionCallbackObj);
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
				mServiceBinderWrapper.addSubscription(s, subscriptioncallback.mToken, bundle, mCallbacksMessenger);
		//   47   93:aload_0         
		//   48   94:getfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   49   97:aload_1         
		//   50   98:aload_3         
		//   51   99:invokestatic    #322 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
		//   52  102:aload_2         
		//   53  103:aload_0         
		//   54  104:getfield        #104 <Field Messenger mCallbacksMessenger>
		//   55  107:invokevirtual   #326 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
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

		public void unsubscribe(String s, SubscriptionCallback subscriptioncallback)
		{
			Subscription subscription;
			subscription = (Subscription)mSubscriptions.get(((Object) (s)));
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
					mServiceBinderWrapper.removeSubscription(s, ((IBinder) (null)), mCallbacksMessenger);
		//   60  131:aload_0         
		//   61  132:getfield        #102 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   62  135:aload_1         
		//   63  136:aconst_null     
		//   64  137:aload_0         
		//   65  138:getfield        #104 <Field Messenger mCallbacksMessenger>
		//   66  141:invokevirtual   #356 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
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
		//*  90  193:invokestatic    #322 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
		//*  91  196:aload_0         
		//*  92  197:getfield        #104 <Field Messenger mCallbacksMessenger>
		//*  93  200:invokevirtual   #356 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
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
				mServiceBinderWrapper.removeSubscription(s, subscriptioncallback.mToken, mCallbacksMessenger);
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
		protected final CallbackHandler mHandler = new CallbackHandler(((MediaBrowserServiceCallbackImpl) (this)));
		protected final Bundle mRootHints;
		protected ServiceBinderWrapper mServiceBinderWrapper;
		private final ArrayMap mSubscriptions = new ArrayMap();

		public MediaBrowserImplApi21(Context context, ComponentName componentname, ConnectionCallback connectioncallback, Bundle bundle)
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
			connectioncallback.setInternalConnectionCallback(((ConnectionCallback.ConnectionCallbackInternal) (this)));
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

	static class MediaBrowserImplApi23 extends MediaBrowserImplApi21
	{

		public void getItem(String s, ItemCallback itemcallback)
		{
			if(mServiceBinderWrapper == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//*   2    4:ifnonnull       20
			{
				MediaBrowserCompatApi23.getItem(mBrowserObj, s, itemcallback.mItemCallbackObj);
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field Object mBrowserObj>
		//    5   11:aload_1         
		//    6   12:aload_2         
		//    7   13:getfield        #28  <Field Object MediaBrowserCompat$ItemCallback.mItemCallbackObj>
		//    8   16:invokestatic    #33  <Method void MediaBrowserCompatApi23.getItem(Object, String, Object)>
				return;
		//    9   19:return          
			} else
			{
				super.getItem(s, itemcallback);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:aload_2         
		//   13   23:invokespecial   #35  <Method void MediaBrowserCompat$MediaBrowserImplApi21.getItem(String, MediaBrowserCompat$ItemCallback)>
				return;
		//   14   26:return          
			}
		}

		public MediaBrowserImplApi23(Context context, ComponentName componentname, ConnectionCallback connectioncallback, Bundle bundle)
		{
			super(context, componentname, connectioncallback, bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #11  <Method void MediaBrowserCompat$MediaBrowserImplApi21(Context, ComponentName, MediaBrowserCompat$ConnectionCallback, Bundle)>
		//    6    9:return          
		}
	}

	static class MediaBrowserImplApi24 extends MediaBrowserImplApi23
	{

		public void subscribe(String s, Bundle bundle, SubscriptionCallback subscriptioncallback)
		{
			if(bundle == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       17
			{
				MediaBrowserCompatApi21.subscribe(mBrowserObj, s, subscriptioncallback.mSubscriptionCallbackObj);
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field Object mBrowserObj>
		//    4    8:aload_1         
		//    5    9:aload_3         
		//    6   10:invokestatic    #25  <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
		//    7   13:invokestatic    #30  <Method void MediaBrowserCompatApi21.subscribe(Object, String, Object)>
				return;
		//    8   16:return          
			} else
			{
				MediaBrowserCompatApi24.subscribe(mBrowserObj, s, bundle, subscriptioncallback.mSubscriptionCallbackObj);
		//    9   17:aload_0         
		//   10   18:getfield        #19  <Field Object mBrowserObj>
		//   11   21:aload_1         
		//   12   22:aload_2         
		//   13   23:aload_3         
		//   14   24:invokestatic    #25  <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
		//   15   27:invokestatic    #35  <Method void MediaBrowserCompatApi24.subscribe(Object, String, Bundle, Object)>
				return;
		//   16   30:return          
			}
		}

		public void unsubscribe(String s, SubscriptionCallback subscriptioncallback)
		{
			if(subscriptioncallback == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       13
			{
				MediaBrowserCompatApi21.unsubscribe(mBrowserObj, s);
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field Object mBrowserObj>
		//    4    8:aload_1         
		//    5    9:invokestatic    #41  <Method void MediaBrowserCompatApi21.unsubscribe(Object, String)>
				return;
		//    6   12:return          
			} else
			{
				MediaBrowserCompatApi24.unsubscribe(mBrowserObj, s, subscriptioncallback.mSubscriptionCallbackObj);
		//    7   13:aload_0         
		//    8   14:getfield        #19  <Field Object mBrowserObj>
		//    9   17:aload_1         
		//   10   18:aload_2         
		//   11   19:invokestatic    #25  <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
		//   12   22:invokestatic    #43  <Method void MediaBrowserCompatApi24.unsubscribe(Object, String, Object)>
				return;
		//   13   25:return          
			}
		}

		public MediaBrowserImplApi24(Context context, ComponentName componentname, ConnectionCallback connectioncallback, Bundle bundle)
		{
			super(context, componentname, connectioncallback, bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #11  <Method void MediaBrowserCompat$MediaBrowserImplApi23(Context, ComponentName, MediaBrowserCompat$ConnectionCallback, Bundle)>
		//    6    9:return          
		}
	}

	static class MediaBrowserImplBase
		implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl
	{

		private static String getStateLabel(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     0 3: default 32
		//		               0 35
		//		               1 38
		//		               2 41
		//		               3 44
		//*   2   32:goto            47
			case 0: // '\0'
				return "CONNECT_STATE_DISCONNECTED";
		//    3   35:ldc1            #109 <String "CONNECT_STATE_DISCONNECTED">
		//    4   37:areturn         

			case 1: // '\001'
				return "CONNECT_STATE_CONNECTING";
		//    5   38:ldc1            #110 <String "CONNECT_STATE_CONNECTING">
		//    6   40:areturn         

			case 2: // '\002'
				return "CONNECT_STATE_CONNECTED";
		//    7   41:ldc1            #111 <String "CONNECT_STATE_CONNECTED">
		//    8   43:areturn         

			case 3: // '\003'
				return "CONNECT_STATE_SUSPENDED";
		//    9   44:ldc1            #112 <String "CONNECT_STATE_SUSPENDED">
		//   10   46:areturn         
			}
			return (new StringBuilder()).append("UNKNOWN/").append(i).toString();
		//   11   47:new             #114 <Class StringBuilder>
		//   12   50:dup             
		//   13   51:invokespecial   #115 <Method void StringBuilder()>
		//   14   54:ldc1            #117 <String "UNKNOWN/">
		//   15   56:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   16   59:iload_0         
		//   17   60:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
		//   18   63:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   19   66:areturn         
		}

		private boolean isCurrent(Messenger messenger, String s)
		{
			if(mCallbacksMessenger != messenger)
		//*   0    0:aload_0         
		//*   1    1:getfield        #132 <Field Messenger mCallbacksMessenger>
		//*   2    4:aload_1         
		//*   3    5:if_acmpeq       70
			{
				if(mState != 0)
		//*   4    8:aload_0         
		//*   5    9:getfield        #81  <Field int mState>
		//*   6   12:ifeq            68
					Log.i("MediaBrowserCompat", (new StringBuilder()).append(s).append(" for ").append(((Object) (mServiceComponent))).append(" with mCallbacksMessenger=").append(((Object) (mCallbacksMessenger))).append(" this=").append(((Object) (this))).toString());
		//    7   15:ldc1            #134 <String "MediaBrowserCompat">
		//    8   17:new             #114 <Class StringBuilder>
		//    9   20:dup             
		//   10   21:invokespecial   #115 <Method void StringBuilder()>
		//   11   24:aload_2         
		//   12   25:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   13   28:ldc1            #136 <String " for ">
		//   14   30:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   15   33:aload_0         
		//   16   34:getfield        #96  <Field ComponentName mServiceComponent>
		//   17   37:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//   18   40:ldc1            #141 <String " with mCallbacksMessenger=">
		//   19   42:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   20   45:aload_0         
		//   21   46:getfield        #132 <Field Messenger mCallbacksMessenger>
		//   22   49:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//   23   52:ldc1            #143 <String " this=">
		//   24   54:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   25   57:aload_0         
		//   26   58:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//   27   61:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   28   64:invokestatic    #149 <Method int Log.i(String, String)>
		//   29   67:pop             
				return false;
		//   30   68:iconst_0        
		//   31   69:ireturn         
			} else
			{
				return true;
		//   32   70:iconst_1        
		//   33   71:ireturn         
			}
		}

		public void connect()
		{
			boolean flag;
			MediaServiceConnection mediaserviceconnection;
			Intent intent;
			if(mState != 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #81  <Field int mState>
		//*   2    4:ifeq            45
				throw new IllegalStateException((new StringBuilder()).append("connect() called while not disconnected (state=").append(getStateLabel(mState)).append(")").toString());
		//    3    7:new             #154 <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:new             #114 <Class StringBuilder>
		//    6   14:dup             
		//    7   15:invokespecial   #115 <Method void StringBuilder()>
		//    8   18:ldc1            #156 <String "connect() called while not disconnected (state=">
		//    9   20:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   23:aload_0         
		//   11   24:getfield        #81  <Field int mState>
		//   12   27:invokestatic    #158 <Method String getStateLabel(int)>
		//   13   30:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   14   33:ldc1            #160 <String ")">
		//   15   35:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   16   38:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   17   41:invokespecial   #161 <Method void IllegalStateException(String)>
		//   18   44:athrow          
			if(MediaBrowserCompat.DEBUG && mServiceConnection != null)
		//*  19   45:getstatic       #165 <Field boolean MediaBrowserCompat.DEBUG>
		//*  20   48:ifeq            88
		//*  21   51:aload_0         
		//*  22   52:getfield        #167 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
		//*  23   55:ifnull          88
				throw new RuntimeException((new StringBuilder()).append("mServiceConnection should be null. Instead it is ").append(((Object) (mServiceConnection))).toString());
		//   24   58:new             #169 <Class RuntimeException>
		//   25   61:dup             
		//   26   62:new             #114 <Class StringBuilder>
		//   27   65:dup             
		//   28   66:invokespecial   #115 <Method void StringBuilder()>
		//   29   69:ldc1            #171 <String "mServiceConnection should be null. Instead it is ">
		//   30   71:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   31   74:aload_0         
		//   32   75:getfield        #167 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
		//   33   78:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//   34   81:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   35   84:invokespecial   #172 <Method void RuntimeException(String)>
		//   36   87:athrow          
			if(mServiceBinderWrapper != null)
		//*  37   88:aload_0         
		//*  38   89:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//*  39   92:ifnull          125
				throw new RuntimeException((new StringBuilder()).append("mServiceBinderWrapper should be null. Instead it is ").append(((Object) (mServiceBinderWrapper))).toString());
		//   40   95:new             #169 <Class RuntimeException>
		//   41   98:dup             
		//   42   99:new             #114 <Class StringBuilder>
		//   43  102:dup             
		//   44  103:invokespecial   #115 <Method void StringBuilder()>
		//   45  106:ldc1            #176 <String "mServiceBinderWrapper should be null. Instead it is ">
		//   46  108:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   47  111:aload_0         
		//   48  112:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   49  115:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//   50  118:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   51  121:invokespecial   #172 <Method void RuntimeException(String)>
		//   52  124:athrow          
			if(mCallbacksMessenger != null)
		//*  53  125:aload_0         
		//*  54  126:getfield        #132 <Field Messenger mCallbacksMessenger>
		//*  55  129:ifnull          162
				throw new RuntimeException((new StringBuilder()).append("mCallbacksMessenger should be null. Instead it is ").append(((Object) (mCallbacksMessenger))).toString());
		//   56  132:new             #169 <Class RuntimeException>
		//   57  135:dup             
		//   58  136:new             #114 <Class StringBuilder>
		//   59  139:dup             
		//   60  140:invokespecial   #115 <Method void StringBuilder()>
		//   61  143:ldc1            #178 <String "mCallbacksMessenger should be null. Instead it is ">
		//   62  145:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   63  148:aload_0         
		//   64  149:getfield        #132 <Field Messenger mCallbacksMessenger>
		//   65  152:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//   66  155:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   67  158:invokespecial   #172 <Method void RuntimeException(String)>
		//   68  161:athrow          
			mState = 1;
		//   69  162:aload_0         
		//   70  163:iconst_1        
		//   71  164:putfield        #81  <Field int mState>
			intent = new Intent("android.media.browse.MediaBrowserService");
		//   72  167:new             #180 <Class Intent>
		//   73  170:dup             
		//   74  171:ldc1            #182 <String "android.media.browse.MediaBrowserService">
		//   75  173:invokespecial   #183 <Method void Intent(String)>
		//   76  176:astore          4
			intent.setComponent(mServiceComponent);
		//   77  178:aload           4
		//   78  180:aload_0         
		//   79  181:getfield        #96  <Field ComponentName mServiceComponent>
		//   80  184:invokevirtual   #187 <Method Intent Intent.setComponent(ComponentName)>
		//   81  187:pop             
			mediaserviceconnection = new MediaServiceConnection();
		//   82  188:new             #23  <Class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection>
		//   83  191:dup             
		//   84  192:aload_0         
		//   85  193:invokespecial   #190 <Method void MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection(MediaBrowserCompat$MediaBrowserImplBase)>
		//   86  196:astore_3        
			mServiceConnection = mediaserviceconnection;
		//   87  197:aload_0         
		//   88  198:aload_3         
		//   89  199:putfield        #167 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
			flag = false;
		//   90  202:iconst_0        
		//   91  203:istore_1        
			boolean flag1 = mContext.bindService(intent, ((ServiceConnection) (mServiceConnection)), 1);
		//   92  204:aload_0         
		//   93  205:getfield        #94  <Field Context mContext>
		//   94  208:aload           4
		//   95  210:aload_0         
		//   96  211:getfield        #167 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
		//   97  214:iconst_1        
		//   98  215:invokevirtual   #196 <Method boolean Context.bindService(Intent, ServiceConnection, int)>
		//   99  218:istore_2        
			flag = flag1;
		//  100  219:iload_2         
		//  101  220:istore_1        
			break MISSING_BLOCK_LABEL_254;
		//  102  221:goto            254
			Exception exception;
			exception;
		//  103  224:astore          4
			Log.e("MediaBrowserCompat", (new StringBuilder()).append("Failed binding to service ").append(((Object) (mServiceComponent))).toString());
		//  104  226:ldc1            #134 <String "MediaBrowserCompat">
		//  105  228:new             #114 <Class StringBuilder>
		//  106  231:dup             
		//  107  232:invokespecial   #115 <Method void StringBuilder()>
		//  108  235:ldc1            #198 <String "Failed binding to service ">
		//  109  237:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//  110  240:aload_0         
		//  111  241:getfield        #96  <Field ComponentName mServiceComponent>
		//  112  244:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//  113  247:invokevirtual   #128 <Method String StringBuilder.toString()>
		//  114  250:invokestatic    #201 <Method int Log.e(String, String)>
		//  115  253:pop             
			if(!flag)
		//* 116  254:iload_1         
		//* 117  255:ifne            275
				mHandler.post(((_cls1) (mediaserviceconnection)). new Runnable() {

					public void run()
					{
						if(thisConnection == mServiceConnection)
					//*   0    0:aload_0         
					//*   1    1:getfield        #24  <Field ServiceConnection val$thisConnection>
					//*   2    4:aload_0         
					//*   3    5:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//*   4    8:getfield        #32  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
					//*   5   11:if_acmpne       31
						{
							forceCloseConnection();
					//    6   14:aload_0         
					//    7   15:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//    8   18:invokevirtual   #35  <Method void MediaBrowserCompat$MediaBrowserImplBase.forceCloseConnection()>
							mCallback.onConnectionFailed();
					//    9   21:aload_0         
					//   10   22:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   11   25:getfield        #39  <Field MediaBrowserCompat$ConnectionCallback MediaBrowserCompat$MediaBrowserImplBase.mCallback>
					//   12   28:invokevirtual   #44  <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
						}
					//   13   31:return          
					}

					final MediaBrowserImplBase this$0;
					final ServiceConnection val$thisConnection;

			
			{
				this$0 = final_mediabrowserimplbase;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				thisConnection = ServiceConnection.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field ServiceConnection val$thisConnection>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
				}
);
		//  118  258:aload_0         
		//  119  259:getfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//  120  262:new             #13  <Class MediaBrowserCompat$MediaBrowserImplBase$1>
		//  121  265:dup             
		//  122  266:aload_0         
		//  123  267:aload_3         
		//  124  268:invokespecial   #204 <Method void MediaBrowserCompat$MediaBrowserImplBase$1(MediaBrowserCompat$MediaBrowserImplBase, ServiceConnection)>
		//  125  271:invokevirtual   #208 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//  126  274:pop             
			if(MediaBrowserCompat.DEBUG)
		//* 127  275:getstatic       #165 <Field boolean MediaBrowserCompat.DEBUG>
		//* 128  278:ifeq            293
			{
				Log.d("MediaBrowserCompat", "connect...");
		//  129  281:ldc1            #134 <String "MediaBrowserCompat">
		//  130  283:ldc1            #210 <String "connect...">
		//  131  285:invokestatic    #213 <Method int Log.d(String, String)>
		//  132  288:pop             
				dump();
		//  133  289:aload_0         
		//  134  290:invokevirtual   #216 <Method void dump()>
			}
			return;
		//  135  293:return          
		}

		public void disconnect()
		{
			if(mCallbacksMessenger != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #132 <Field Messenger mCallbacksMessenger>
		//*   2    4:ifnull          50
				try
				{
					mServiceBinderWrapper.disconnect(mCallbacksMessenger);
		//    3    7:aload_0         
		//    4    8:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//    5   11:aload_0         
		//    6   12:getfield        #132 <Field Messenger mCallbacksMessenger>
		//    7   15:invokevirtual   #224 <Method void MediaBrowserCompat$ServiceBinderWrapper.disconnect(Messenger)>
				}
		//*   8   18:goto            50
				catch(RemoteException remoteexception)
		//*   9   21:astore_1        
				{
					Log.w("MediaBrowserCompat", (new StringBuilder()).append("RemoteException during connect for ").append(((Object) (mServiceComponent))).toString());
		//   10   22:ldc1            #134 <String "MediaBrowserCompat">
		//   11   24:new             #114 <Class StringBuilder>
		//   12   27:dup             
		//   13   28:invokespecial   #115 <Method void StringBuilder()>
		//   14   31:ldc1            #226 <String "RemoteException during connect for ">
		//   15   33:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   16   36:aload_0         
		//   17   37:getfield        #96  <Field ComponentName mServiceComponent>
		//   18   40:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//   19   43:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   20   46:invokestatic    #229 <Method int Log.w(String, String)>
		//   21   49:pop             
				}
			forceCloseConnection();
		//   22   50:aload_0         
		//   23   51:invokevirtual   #232 <Method void forceCloseConnection()>
			if(MediaBrowserCompat.DEBUG)
		//*  24   54:getstatic       #165 <Field boolean MediaBrowserCompat.DEBUG>
		//*  25   57:ifeq            72
			{
				Log.d("MediaBrowserCompat", "disconnect...");
		//   26   60:ldc1            #134 <String "MediaBrowserCompat">
		//   27   62:ldc1            #234 <String "disconnect...">
		//   28   64:invokestatic    #213 <Method int Log.d(String, String)>
		//   29   67:pop             
				dump();
		//   30   68:aload_0         
		//   31   69:invokevirtual   #216 <Method void dump()>
			}
		//   32   72:return          
		}

		void dump()
		{
			Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
		//    0    0:ldc1            #134 <String "MediaBrowserCompat">
		//    1    2:ldc1            #236 <String "MediaBrowserCompat...">
		//    2    4:invokestatic    #213 <Method int Log.d(String, String)>
		//    3    7:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mServiceComponent=").append(((Object) (mServiceComponent))).toString());
		//    4    8:ldc1            #134 <String "MediaBrowserCompat">
		//    5   10:new             #114 <Class StringBuilder>
		//    6   13:dup             
		//    7   14:invokespecial   #115 <Method void StringBuilder()>
		//    8   17:ldc1            #238 <String "  mServiceComponent=">
		//    9   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   22:aload_0         
		//   11   23:getfield        #96  <Field ComponentName mServiceComponent>
		//   12   26:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//   13   29:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   14   32:invokestatic    #213 <Method int Log.d(String, String)>
		//   15   35:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mCallback=").append(((Object) (mCallback))).toString());
		//   16   36:ldc1            #134 <String "MediaBrowserCompat">
		//   17   38:new             #114 <Class StringBuilder>
		//   18   41:dup             
		//   19   42:invokespecial   #115 <Method void StringBuilder()>
		//   20   45:ldc1            #240 <String "  mCallback=">
		//   21   47:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   22   50:aload_0         
		//   23   51:getfield        #98  <Field MediaBrowserCompat$ConnectionCallback mCallback>
		//   24   54:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//   25   57:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   26   60:invokestatic    #213 <Method int Log.d(String, String)>
		//   27   63:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mRootHints=").append(((Object) (mRootHints))).toString());
		//   28   64:ldc1            #134 <String "MediaBrowserCompat">
		//   29   66:new             #114 <Class StringBuilder>
		//   30   69:dup             
		//   31   70:invokespecial   #115 <Method void StringBuilder()>
		//   32   73:ldc1            #242 <String "  mRootHints=">
		//   33   75:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   34   78:aload_0         
		//   35   79:getfield        #105 <Field Bundle mRootHints>
		//   36   82:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//   37   85:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   38   88:invokestatic    #213 <Method int Log.d(String, String)>
		//   39   91:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mState=").append(getStateLabel(mState)).toString());
		//   40   92:ldc1            #134 <String "MediaBrowserCompat">
		//   41   94:new             #114 <Class StringBuilder>
		//   42   97:dup             
		//   43   98:invokespecial   #115 <Method void StringBuilder()>
		//   44  101:ldc1            #244 <String "  mState=">
		//   45  103:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   46  106:aload_0         
		//   47  107:getfield        #81  <Field int mState>
		//   48  110:invokestatic    #158 <Method String getStateLabel(int)>
		//   49  113:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   50  116:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   51  119:invokestatic    #213 <Method int Log.d(String, String)>
		//   52  122:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mServiceConnection=").append(((Object) (mServiceConnection))).toString());
		//   53  123:ldc1            #134 <String "MediaBrowserCompat">
		//   54  125:new             #114 <Class StringBuilder>
		//   55  128:dup             
		//   56  129:invokespecial   #115 <Method void StringBuilder()>
		//   57  132:ldc1            #246 <String "  mServiceConnection=">
		//   58  134:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   59  137:aload_0         
		//   60  138:getfield        #167 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
		//   61  141:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//   62  144:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   63  147:invokestatic    #213 <Method int Log.d(String, String)>
		//   64  150:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mServiceBinderWrapper=").append(((Object) (mServiceBinderWrapper))).toString());
		//   65  151:ldc1            #134 <String "MediaBrowserCompat">
		//   66  153:new             #114 <Class StringBuilder>
		//   67  156:dup             
		//   68  157:invokespecial   #115 <Method void StringBuilder()>
		//   69  160:ldc1            #248 <String "  mServiceBinderWrapper=">
		//   70  162:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   71  165:aload_0         
		//   72  166:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   73  169:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//   74  172:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   75  175:invokestatic    #213 <Method int Log.d(String, String)>
		//   76  178:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mCallbacksMessenger=").append(((Object) (mCallbacksMessenger))).toString());
		//   77  179:ldc1            #134 <String "MediaBrowserCompat">
		//   78  181:new             #114 <Class StringBuilder>
		//   79  184:dup             
		//   80  185:invokespecial   #115 <Method void StringBuilder()>
		//   81  188:ldc1            #250 <String "  mCallbacksMessenger=">
		//   82  190:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   83  193:aload_0         
		//   84  194:getfield        #132 <Field Messenger mCallbacksMessenger>
		//   85  197:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//   86  200:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   87  203:invokestatic    #213 <Method int Log.d(String, String)>
		//   88  206:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mRootId=").append(mRootId).toString());
		//   89  207:ldc1            #134 <String "MediaBrowserCompat">
		//   90  209:new             #114 <Class StringBuilder>
		//   91  212:dup             
		//   92  213:invokespecial   #115 <Method void StringBuilder()>
		//   93  216:ldc1            #252 <String "  mRootId=">
		//   94  218:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   95  221:aload_0         
		//   96  222:getfield        #254 <Field String mRootId>
		//   97  225:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   98  228:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   99  231:invokestatic    #213 <Method int Log.d(String, String)>
		//  100  234:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mMediaSessionToken=").append(((Object) (mMediaSessionToken))).toString());
		//  101  235:ldc1            #134 <String "MediaBrowserCompat">
		//  102  237:new             #114 <Class StringBuilder>
		//  103  240:dup             
		//  104  241:invokespecial   #115 <Method void StringBuilder()>
		//  105  244:ldc2            #256 <String "  mMediaSessionToken=">
		//  106  247:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//  107  250:aload_0         
		//  108  251:getfield        #258 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		//  109  254:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//  110  257:invokevirtual   #128 <Method String StringBuilder.toString()>
		//  111  260:invokestatic    #213 <Method int Log.d(String, String)>
		//  112  263:pop             
		//  113  264:return          
		}

		void forceCloseConnection()
		{
			if(mServiceConnection != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #167 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
		//*   2    4:ifnull          18
				mContext.unbindService(((ServiceConnection) (mServiceConnection)));
		//    3    7:aload_0         
		//    4    8:getfield        #94  <Field Context mContext>
		//    5   11:aload_0         
		//    6   12:getfield        #167 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
		//    7   15:invokevirtual   #262 <Method void Context.unbindService(ServiceConnection)>
			mState = 0;
		//    8   18:aload_0         
		//    9   19:iconst_0        
		//   10   20:putfield        #81  <Field int mState>
			mServiceConnection = null;
		//   11   23:aload_0         
		//   12   24:aconst_null     
		//   13   25:putfield        #167 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
			mServiceBinderWrapper = null;
		//   14   28:aload_0         
		//   15   29:aconst_null     
		//   16   30:putfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
			mCallbacksMessenger = null;
		//   17   33:aload_0         
		//   18   34:aconst_null     
		//   19   35:putfield        #132 <Field Messenger mCallbacksMessenger>
			mHandler.setCallbacksMessenger(((Messenger) (null)));
		//   20   38:aload_0         
		//   21   39:getfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   22   42:aconst_null     
		//   23   43:invokevirtual   #265 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
			mRootId = null;
		//   24   46:aload_0         
		//   25   47:aconst_null     
		//   26   48:putfield        #254 <Field String mRootId>
			mMediaSessionToken = null;
		//   27   51:aload_0         
		//   28   52:aconst_null     
		//   29   53:putfield        #258 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		//   30   56:return          
		}

		public Bundle getExtras()
		{
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #272 <Method boolean isConnected()>
		//*   2    4:ifne            46
				throw new IllegalStateException((new StringBuilder()).append("getExtras() called while not connected (state=").append(getStateLabel(mState)).append(")").toString());
		//    3    7:new             #154 <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:new             #114 <Class StringBuilder>
		//    6   14:dup             
		//    7   15:invokespecial   #115 <Method void StringBuilder()>
		//    8   18:ldc2            #274 <String "getExtras() called while not connected (state=">
		//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   24:aload_0         
		//   11   25:getfield        #81  <Field int mState>
		//   12   28:invokestatic    #158 <Method String getStateLabel(int)>
		//   13   31:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   14   34:ldc1            #160 <String ")">
		//   15   36:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   16   39:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   17   42:invokespecial   #161 <Method void IllegalStateException(String)>
		//   18   45:athrow          
			else
				return mExtras;
		//   19   46:aload_0         
		//   20   47:getfield        #276 <Field Bundle mExtras>
		//   21   50:areturn         
		}

		public void getItem(String s, final ItemCallback cb)
		{
			if(TextUtils.isEmpty(((CharSequence) (s))))
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #286 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   2    4:ifeq            18
				throw new IllegalArgumentException("mediaId is empty");
		//    3    7:new             #83  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc2            #288 <String "mediaId is empty">
		//    6   14:invokespecial   #88  <Method void IllegalArgumentException(String)>
		//    7   17:athrow          
			if(cb == null)
		//*   8   18:aload_2         
		//*   9   19:ifnonnull       33
				throw new IllegalArgumentException("cb is null");
		//   10   22:new             #83  <Class IllegalArgumentException>
		//   11   25:dup             
		//   12   26:ldc2            #290 <String "cb is null">
		//   13   29:invokespecial   #88  <Method void IllegalArgumentException(String)>
		//   14   32:athrow          
			if(mState != 2)
		//*  15   33:aload_0         
		//*  16   34:getfield        #81  <Field int mState>
		//*  17   37:iconst_2        
		//*  18   38:icmpeq          69
			{
				Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
		//   19   41:ldc1            #134 <String "MediaBrowserCompat">
		//   20   43:ldc2            #292 <String "Not connected, unable to retrieve the MediaItem.">
		//   21   46:invokestatic    #149 <Method int Log.i(String, String)>
		//   22   49:pop             
				mHandler.post(((_cls2) (s)). new Runnable() {

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

					final MediaBrowserImplBase this$0;
					final ItemCallback val$cb;
					final String val$mediaId;

			
			{
				this$0 = final_mediabrowserimplbase;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				cb = itemcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
				mediaId = String.this;
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
		//   23   50:aload_0         
		//   24   51:getfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   25   54:new             #15  <Class MediaBrowserCompat$MediaBrowserImplBase$2>
		//   26   57:dup             
		//   27   58:aload_0         
		//   28   59:aload_2         
		//   29   60:aload_1         
		//   30   61:invokespecial   #295 <Method void MediaBrowserCompat$MediaBrowserImplBase$2(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$ItemCallback, String)>
		//   31   64:invokevirtual   #208 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   32   67:pop             
				return;
		//   33   68:return          
			}
			ItemReceiver itemreceiver = new ItemReceiver(s, cb, ((Handler) (mHandler)));
		//   34   69:new             #297 <Class MediaBrowserCompat$ItemReceiver>
		//   35   72:dup             
		//   36   73:aload_1         
		//   37   74:aload_2         
		//   38   75:aload_0         
		//   39   76:getfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   40   79:invokespecial   #300 <Method void MediaBrowserCompat$ItemReceiver(String, MediaBrowserCompat$ItemCallback, Handler)>
		//   41   82:astore_3        
			try
			{
				mServiceBinderWrapper.getMediaItem(s, ((ResultReceiver) (itemreceiver)), mCallbacksMessenger);
		//   42   83:aload_0         
		//   43   84:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   44   87:aload_1         
		//   45   88:aload_3         
		//   46   89:aload_0         
		//   47   90:getfield        #132 <Field Messenger mCallbacksMessenger>
		//   48   93:invokevirtual   #304 <Method void MediaBrowserCompat$ServiceBinderWrapper.getMediaItem(String, ResultReceiver, Messenger)>
				return;
		//   49   96:return          
			}
			catch(RemoteException remoteexception)
		//*  50   97:astore_3        
			{
				Log.i("MediaBrowserCompat", "Remote error getting media item.");
		//   51   98:ldc1            #134 <String "MediaBrowserCompat">
		//   52  100:ldc2            #306 <String "Remote error getting media item.">
		//   53  103:invokestatic    #149 <Method int Log.i(String, String)>
		//   54  106:pop             
			}
			mHandler.post(((_cls3) (s)). new Runnable() {

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

				final MediaBrowserImplBase this$0;
				final ItemCallback val$cb;
				final String val$mediaId;

			
			{
				this$0 = final_mediabrowserimplbase;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				cb = itemcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
				mediaId = String.this;
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
		//   55  107:aload_0         
		//   56  108:getfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   57  111:new             #17  <Class MediaBrowserCompat$MediaBrowserImplBase$3>
		//   58  114:dup             
		//   59  115:aload_0         
		//   60  116:aload_2         
		//   61  117:aload_1         
		//   62  118:invokespecial   #307 <Method void MediaBrowserCompat$MediaBrowserImplBase$3(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$ItemCallback, String)>
		//   63  121:invokevirtual   #208 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   64  124:pop             
		//   65  125:return          
		}

		public String getRoot()
		{
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #272 <Method boolean isConnected()>
		//*   2    4:ifne            46
				throw new IllegalStateException((new StringBuilder()).append("getRoot() called while not connected(state=").append(getStateLabel(mState)).append(")").toString());
		//    3    7:new             #154 <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:new             #114 <Class StringBuilder>
		//    6   14:dup             
		//    7   15:invokespecial   #115 <Method void StringBuilder()>
		//    8   18:ldc2            #311 <String "getRoot() called while not connected(state=">
		//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   24:aload_0         
		//   11   25:getfield        #81  <Field int mState>
		//   12   28:invokestatic    #158 <Method String getStateLabel(int)>
		//   13   31:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   14   34:ldc1            #160 <String ")">
		//   15   36:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   16   39:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   17   42:invokespecial   #161 <Method void IllegalStateException(String)>
		//   18   45:athrow          
			else
				return mRootId;
		//   19   46:aload_0         
		//   20   47:getfield        #254 <Field String mRootId>
		//   21   50:areturn         
		}

		public ComponentName getServiceComponent()
		{
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #272 <Method boolean isConnected()>
		//*   2    4:ifne            43
				throw new IllegalStateException((new StringBuilder()).append("getServiceComponent() called while not connected (state=").append(mState).append(")").toString());
		//    3    7:new             #154 <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:new             #114 <Class StringBuilder>
		//    6   14:dup             
		//    7   15:invokespecial   #115 <Method void StringBuilder()>
		//    8   18:ldc2            #315 <String "getServiceComponent() called while not connected (state=">
		//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   24:aload_0         
		//   11   25:getfield        #81  <Field int mState>
		//   12   28:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
		//   13   31:ldc1            #160 <String ")">
		//   14   33:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   15   36:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   16   39:invokespecial   #161 <Method void IllegalStateException(String)>
		//   17   42:athrow          
			else
				return mServiceComponent;
		//   18   43:aload_0         
		//   19   44:getfield        #96  <Field ComponentName mServiceComponent>
		//   20   47:areturn         
		}

		public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
		{
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #272 <Method boolean isConnected()>
		//*   2    4:ifne            43
				throw new IllegalStateException((new StringBuilder()).append("getSessionToken() called while not connected(state=").append(mState).append(")").toString());
		//    3    7:new             #154 <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:new             #114 <Class StringBuilder>
		//    6   14:dup             
		//    7   15:invokespecial   #115 <Method void StringBuilder()>
		//    8   18:ldc2            #319 <String "getSessionToken() called while not connected(state=">
		//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   24:aload_0         
		//   11   25:getfield        #81  <Field int mState>
		//   12   28:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
		//   13   31:ldc1            #160 <String ")">
		//   14   33:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   15   36:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   16   39:invokespecial   #161 <Method void IllegalStateException(String)>
		//   17   42:athrow          
			else
				return mMediaSessionToken;
		//   18   43:aload_0         
		//   19   44:getfield        #258 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		//   20   47:areturn         
		}

		public boolean isConnected()
		{
			return mState == 2;
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field int mState>
		//    2    4:iconst_2        
		//    3    5:icmpne          10
		//    4    8:iconst_1        
		//    5    9:ireturn         
		//    6   10:iconst_0        
		//    7   11:ireturn         
		}

		public void onConnectionFailed(Messenger messenger)
		{
			Log.e("MediaBrowserCompat", (new StringBuilder()).append("onConnectFailed for ").append(((Object) (mServiceComponent))).toString());
		//    0    0:ldc1            #134 <String "MediaBrowserCompat">
		//    1    2:new             #114 <Class StringBuilder>
		//    2    5:dup             
		//    3    6:invokespecial   #115 <Method void StringBuilder()>
		//    4    9:ldc2            #322 <String "onConnectFailed for ">
		//    5   12:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//    6   15:aload_0         
		//    7   16:getfield        #96  <Field ComponentName mServiceComponent>
		//    8   19:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//    9   22:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   10   25:invokestatic    #201 <Method int Log.e(String, String)>
		//   11   28:pop             
			if(!isCurrent(messenger, "onConnectFailed"))
		//*  12   29:aload_0         
		//*  13   30:aload_1         
		//*  14   31:ldc2            #324 <String "onConnectFailed">
		//*  15   34:invokespecial   #326 <Method boolean isCurrent(Messenger, String)>
		//*  16   37:ifne            41
				return;
		//   17   40:return          
			if(mState != 1)
		//*  18   41:aload_0         
		//*  19   42:getfield        #81  <Field int mState>
		//*  20   45:iconst_1        
		//*  21   46:icmpeq          88
			{
				Log.w("MediaBrowserCompat", (new StringBuilder()).append("onConnect from service while mState=").append(getStateLabel(mState)).append("... ignoring").toString());
		//   22   49:ldc1            #134 <String "MediaBrowserCompat">
		//   23   51:new             #114 <Class StringBuilder>
		//   24   54:dup             
		//   25   55:invokespecial   #115 <Method void StringBuilder()>
		//   26   58:ldc2            #328 <String "onConnect from service while mState=">
		//   27   61:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   28   64:aload_0         
		//   29   65:getfield        #81  <Field int mState>
		//   30   68:invokestatic    #158 <Method String getStateLabel(int)>
		//   31   71:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   32   74:ldc2            #330 <String "... ignoring">
		//   33   77:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   34   80:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   35   83:invokestatic    #229 <Method int Log.w(String, String)>
		//   36   86:pop             
				return;
		//   37   87:return          
			} else
			{
				forceCloseConnection();
		//   38   88:aload_0         
		//   39   89:invokevirtual   #232 <Method void forceCloseConnection()>
				mCallback.onConnectionFailed();
		//   40   92:aload_0         
		//   41   93:getfield        #98  <Field MediaBrowserCompat$ConnectionCallback mCallback>
		//   42   96:invokevirtual   #334 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
				return;
		//   43   99:return          
			}
		}

		public void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle)
		{
			if(!isCurrent(messenger, "onLoadChildren"))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:ldc2            #337 <String "onLoadChildren">
		//*   3    5:invokespecial   #326 <Method boolean isCurrent(Messenger, String)>
		//*   4    8:ifne            12
				return;
		//    5   11:return          
			if(MediaBrowserCompat.DEBUG)
		//*   6   12:getstatic       #165 <Field boolean MediaBrowserCompat.DEBUG>
		//*   7   15:ifeq            57
				Log.d("MediaBrowserCompat", (new StringBuilder()).append("onLoadChildren for ").append(((Object) (mServiceComponent))).append(" id=").append(s).toString());
		//    8   18:ldc1            #134 <String "MediaBrowserCompat">
		//    9   20:new             #114 <Class StringBuilder>
		//   10   23:dup             
		//   11   24:invokespecial   #115 <Method void StringBuilder()>
		//   12   27:ldc2            #339 <String "onLoadChildren for ">
		//   13   30:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   14   33:aload_0         
		//   15   34:getfield        #96  <Field ComponentName mServiceComponent>
		//   16   37:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//   17   40:ldc2            #341 <String " id=">
		//   18   43:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   19   46:aload_2         
		//   20   47:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   21   50:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   22   53:invokestatic    #213 <Method int Log.d(String, String)>
		//   23   56:pop             
			messenger = ((Messenger) ((Subscription)mSubscriptions.get(((Object) (s)))));
		//   24   57:aload_0         
		//   25   58:getfield        #79  <Field ArrayMap mSubscriptions>
		//   26   61:aload_2         
		//   27   62:invokevirtual   #345 <Method Object ArrayMap.get(Object)>
		//   28   65:checkcast       #347 <Class MediaBrowserCompat$Subscription>
		//   29   68:astore_1        
			if(messenger == null)
		//*  30   69:aload_1         
		//*  31   70:ifnonnull       106
			{
				if(MediaBrowserCompat.DEBUG)
		//*  32   73:getstatic       #165 <Field boolean MediaBrowserCompat.DEBUG>
		//*  33   76:ifeq            105
					Log.d("MediaBrowserCompat", (new StringBuilder()).append("onLoadChildren for id that isn't subscribed id=").append(s).toString());
		//   34   79:ldc1            #134 <String "MediaBrowserCompat">
		//   35   81:new             #114 <Class StringBuilder>
		//   36   84:dup             
		//   37   85:invokespecial   #115 <Method void StringBuilder()>
		//   38   88:ldc2            #349 <String "onLoadChildren for id that isn't subscribed id=">
		//   39   91:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   40   94:aload_2         
		//   41   95:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   42   98:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   43  101:invokestatic    #213 <Method int Log.d(String, String)>
		//   44  104:pop             
				return;
		//   45  105:return          
			}
			messenger = ((Messenger) (((Subscription) (messenger)).getCallback(bundle)));
		//   46  106:aload_1         
		//   47  107:aload           4
		//   48  109:invokevirtual   #353 <Method MediaBrowserCompat$SubscriptionCallback MediaBrowserCompat$Subscription.getCallback(Bundle)>
		//   49  112:astore_1        
			if(messenger != null)
		//*  50  113:aload_1         
		//*  51  114:ifnull          159
			{
				if(bundle == null)
		//*  52  117:aload           4
		//*  53  119:ifnonnull       139
					if(list == null)
		//*  54  122:aload_3         
		//*  55  123:ifnonnull       132
					{
						((SubscriptionCallback) (messenger)).onError(s);
		//   56  126:aload_1         
		//   57  127:aload_2         
		//   58  128:invokevirtual   #358 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
						return;
		//   59  131:return          
					} else
					{
						((SubscriptionCallback) (messenger)).onChildrenLoaded(s, list);
		//   60  132:aload_1         
		//   61  133:aload_2         
		//   62  134:aload_3         
		//   63  135:invokevirtual   #362 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
						return;
		//   64  138:return          
					}
				if(list == null)
		//*  65  139:aload_3         
		//*  66  140:ifnonnull       151
				{
					((SubscriptionCallback) (messenger)).onError(s, bundle);
		//   67  143:aload_1         
		//   68  144:aload_2         
		//   69  145:aload           4
		//   70  147:invokevirtual   #365 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
					return;
		//   71  150:return          
				}
				((SubscriptionCallback) (messenger)).onChildrenLoaded(s, list, bundle);
		//   72  151:aload_1         
		//   73  152:aload_2         
		//   74  153:aload_3         
		//   75  154:aload           4
		//   76  156:invokevirtual   #368 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
			}
		//   77  159:return          
		}

		public void onServiceConnected(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
		{
			if(!isCurrent(messenger, "onConnect"))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:ldc2            #372 <String "onConnect">
		//*   3    5:invokespecial   #326 <Method boolean isCurrent(Messenger, String)>
		//*   4    8:ifne            12
				return;
		//    5   11:return          
			if(mState != 1)
		//*   6   12:aload_0         
		//*   7   13:getfield        #81  <Field int mState>
		//*   8   16:iconst_1        
		//*   9   17:icmpeq          59
			{
				Log.w("MediaBrowserCompat", (new StringBuilder()).append("onConnect from service while mState=").append(getStateLabel(mState)).append("... ignoring").toString());
		//   10   20:ldc1            #134 <String "MediaBrowserCompat">
		//   11   22:new             #114 <Class StringBuilder>
		//   12   25:dup             
		//   13   26:invokespecial   #115 <Method void StringBuilder()>
		//   14   29:ldc2            #328 <String "onConnect from service while mState=">
		//   15   32:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   16   35:aload_0         
		//   17   36:getfield        #81  <Field int mState>
		//   18   39:invokestatic    #158 <Method String getStateLabel(int)>
		//   19   42:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   20   45:ldc2            #330 <String "... ignoring">
		//   21   48:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   22   51:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   23   54:invokestatic    #229 <Method int Log.w(String, String)>
		//   24   57:pop             
				return;
		//   25   58:return          
			}
			mRootId = s;
		//   26   59:aload_0         
		//   27   60:aload_2         
		//   28   61:putfield        #254 <Field String mRootId>
			mMediaSessionToken = token;
		//   29   64:aload_0         
		//   30   65:aload_3         
		//   31   66:putfield        #258 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
			mExtras = bundle;
		//   32   69:aload_0         
		//   33   70:aload           4
		//   34   72:putfield        #276 <Field Bundle mExtras>
			mState = 2;
		//   35   75:aload_0         
		//   36   76:iconst_2        
		//   37   77:putfield        #81  <Field int mState>
			if(MediaBrowserCompat.DEBUG)
		//*  38   80:getstatic       #165 <Field boolean MediaBrowserCompat.DEBUG>
		//*  39   83:ifeq            99
			{
				Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
		//   40   86:ldc1            #134 <String "MediaBrowserCompat">
		//   41   88:ldc2            #374 <String "ServiceCallbacks.onConnect...">
		//   42   91:invokestatic    #213 <Method int Log.d(String, String)>
		//   43   94:pop             
				dump();
		//   44   95:aload_0         
		//   45   96:invokevirtual   #216 <Method void dump()>
			}
			mCallback.onConnected();
		//   46   99:aload_0         
		//   47  100:getfield        #98  <Field MediaBrowserCompat$ConnectionCallback mCallback>
		//   48  103:invokevirtual   #377 <Method void MediaBrowserCompat$ConnectionCallback.onConnected()>
			messenger = ((Messenger) (mSubscriptions.entrySet().iterator()));
		//   49  106:aload_0         
		//   50  107:getfield        #79  <Field ArrayMap mSubscriptions>
		//   51  110:invokevirtual   #381 <Method Set ArrayMap.entrySet()>
		//   52  113:invokeinterface #387 <Method Iterator Set.iterator()>
		//   53  118:astore_1        
_L2:
			if(!((Iterator) (messenger)).hasNext())
				break; /* Loop/switch isn't completed */
		//   54  119:aload_1         
		//   55  120:invokeinterface #392 <Method boolean Iterator.hasNext()>
		//   56  125:ifeq            236
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) ((java.util.Map.Entry)((Iterator) (messenger)).next()));
		//   57  128:aload_1         
		//   58  129:invokeinterface #396 <Method Object Iterator.next()>
		//   59  134:checkcast       #398 <Class java.util.Map$Entry>
		//   60  137:astore_3        
			s = (String)((java.util.Map.Entry) (token)).getKey();
		//   61  138:aload_3         
		//   62  139:invokeinterface #401 <Method Object java.util.Map$Entry.getKey()>
		//   63  144:checkcast       #403 <Class String>
		//   64  147:astore_2        
			bundle = ((Bundle) ((Subscription)((java.util.Map.Entry) (token)).getValue()));
		//   65  148:aload_3         
		//   66  149:invokeinterface #406 <Method Object java.util.Map$Entry.getValue()>
		//   67  154:checkcast       #347 <Class MediaBrowserCompat$Subscription>
		//   68  157:astore          4
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) (((Subscription) (bundle)).getCallbacks()));
		//   69  159:aload           4
		//   70  161:invokevirtual   #410 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
		//   71  164:astore_3        
			bundle = ((Bundle) (((Subscription) (bundle)).getOptionsList()));
		//   72  165:aload           4
		//   73  167:invokevirtual   #413 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
		//   74  170:astore          4
			int i = 0;
		//   75  172:iconst_0        
		//   76  173:istore          5
			do
			{
				try
				{
					if(i >= ((List) (token)).size())
						break;
		//   77  175:iload           5
		//   78  177:aload_3         
		//   79  178:invokeinterface #419 <Method int List.size()>
		//   80  183:icmpge          233
					mServiceBinderWrapper.addSubscription(s, ((SubscriptionCallback)((List) (token)).get(i)).mToken, (Bundle)((List) (bundle)).get(i), mCallbacksMessenger);
		//   81  186:aload_0         
		//   82  187:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   83  190:aload_2         
		//   84  191:aload_3         
		//   85  192:iload           5
		//   86  194:invokeinterface #422 <Method Object List.get(int)>
		//   87  199:checkcast       #355 <Class MediaBrowserCompat$SubscriptionCallback>
		//   88  202:invokestatic    #426 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
		//   89  205:aload           4
		//   90  207:iload           5
		//   91  209:invokeinterface #422 <Method Object List.get(int)>
		//   92  214:checkcast       #100 <Class Bundle>
		//   93  217:aload_0         
		//   94  218:getfield        #132 <Field Messenger mCallbacksMessenger>
		//   95  221:invokevirtual   #430 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
				}
		//*  96  224:iload           5
		//*  97  226:iconst_1        
		//*  98  227:iadd            
		//*  99  228:istore          5
		//* 100  230:goto            175
		//* 101  233:goto            119
		//* 102  236:return          
				// Misplaced declaration of an exception variable
				catch(Messenger messenger)
		//* 103  237:astore_1        
				{
					Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
		//  104  238:ldc1            #134 <String "MediaBrowserCompat">
		//  105  240:ldc2            #432 <String "addSubscription failed with RemoteException.">
		//  106  243:invokestatic    #213 <Method int Log.d(String, String)>
		//  107  246:pop             
					return;
		//  108  247:return          
				}
				i++;
			} while(true);
			if(true) goto _L2; else goto _L1
_L1:
		}

		public void search(final String query, Bundle bundle, final SearchCallback callback)
		{
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #272 <Method boolean isConnected()>
		//*   2    4:ifne            36
			{
				Log.i("MediaBrowserCompat", "Not connected, unable to search.");
		//    3    7:ldc1            #134 <String "MediaBrowserCompat">
		//    4    9:ldc2            #436 <String "Not connected, unable to search.">
		//    5   12:invokestatic    #149 <Method int Log.i(String, String)>
		//    6   15:pop             
				mHandler.post(((_cls4) (bundle)). new Runnable() {

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

					final MediaBrowserImplBase this$0;
					final SearchCallback val$callback;
					final Bundle val$extras;
					final String val$query;

			
			{
				this$0 = final_mediabrowserimplbase;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				callback = searchcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field MediaBrowserCompat$SearchCallback val$callback>
				query = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String val$query>
				extras = Bundle.this;
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
		//    8   17:getfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//    9   20:new             #19  <Class MediaBrowserCompat$MediaBrowserImplBase$4>
		//   10   23:dup             
		//   11   24:aload_0         
		//   12   25:aload_3         
		//   13   26:aload_1         
		//   14   27:aload_2         
		//   15   28:invokespecial   #439 <Method void MediaBrowserCompat$MediaBrowserImplBase$4(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$SearchCallback, String, Bundle)>
		//   16   31:invokevirtual   #208 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   17   34:pop             
				return;
		//   18   35:return          
			}
			SearchResultReceiver searchresultreceiver = new SearchResultReceiver(query, bundle, callback, ((Handler) (mHandler)));
		//   19   36:new             #441 <Class MediaBrowserCompat$SearchResultReceiver>
		//   20   39:dup             
		//   21   40:aload_1         
		//   22   41:aload_2         
		//   23   42:aload_3         
		//   24   43:aload_0         
		//   25   44:getfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   26   47:invokespecial   #444 <Method void MediaBrowserCompat$SearchResultReceiver(String, Bundle, MediaBrowserCompat$SearchCallback, Handler)>
		//   27   50:astore          4
			try
			{
				mServiceBinderWrapper.search(query, bundle, ((ResultReceiver) (searchresultreceiver)), mCallbacksMessenger);
		//   28   52:aload_0         
		//   29   53:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   30   56:aload_1         
		//   31   57:aload_2         
		//   32   58:aload           4
		//   33   60:aload_0         
		//   34   61:getfield        #132 <Field Messenger mCallbacksMessenger>
		//   35   64:invokevirtual   #447 <Method void MediaBrowserCompat$ServiceBinderWrapper.search(String, Bundle, ResultReceiver, Messenger)>
				return;
		//   36   67:return          
			}
			catch(RemoteException remoteexception)
		//*  37   68:astore          4
			{
				Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error searching items with query: ").append(query).toString(), ((Throwable) (remoteexception)));
		//   38   70:ldc1            #134 <String "MediaBrowserCompat">
		//   39   72:new             #114 <Class StringBuilder>
		//   40   75:dup             
		//   41   76:invokespecial   #115 <Method void StringBuilder()>
		//   42   79:ldc2            #449 <String "Remote error searching items with query: ">
		//   43   82:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   44   85:aload_1         
		//   45   86:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   46   89:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   47   92:aload           4
		//   48   94:invokestatic    #452 <Method int Log.i(String, String, Throwable)>
		//   49   97:pop             
			}
			mHandler.post(((_cls5) (bundle)). new Runnable() {

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

				final MediaBrowserImplBase this$0;
				final SearchCallback val$callback;
				final Bundle val$extras;
				final String val$query;

			
			{
				this$0 = final_mediabrowserimplbase;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				callback = searchcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field MediaBrowserCompat$SearchCallback val$callback>
				query = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String val$query>
				extras = Bundle.this;
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
		//   50   98:aload_0         
		//   51   99:getfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   52  102:new             #21  <Class MediaBrowserCompat$MediaBrowserImplBase$5>
		//   53  105:dup             
		//   54  106:aload_0         
		//   55  107:aload_3         
		//   56  108:aload_1         
		//   57  109:aload_2         
		//   58  110:invokespecial   #453 <Method void MediaBrowserCompat$MediaBrowserImplBase$5(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$SearchCallback, String, Bundle)>
		//   59  113:invokevirtual   #208 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   60  116:pop             
		//   61  117:return          
		}

		public void subscribe(String s, Bundle bundle, SubscriptionCallback subscriptioncallback)
		{
			Subscription subscription1 = (Subscription)mSubscriptions.get(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #79  <Field ArrayMap mSubscriptions>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #345 <Method Object ArrayMap.get(Object)>
		//    4    8:checkcast       #347 <Class MediaBrowserCompat$Subscription>
		//    5   11:astore          5
			Subscription subscription = subscription1;
		//    6   13:aload           5
		//    7   15:astore          4
			if(subscription1 == null)
		//*   8   17:aload           5
		//*   9   19:ifnonnull       42
			{
				subscription = new Subscription();
		//   10   22:new             #347 <Class MediaBrowserCompat$Subscription>
		//   11   25:dup             
		//   12   26:invokespecial   #456 <Method void MediaBrowserCompat$Subscription()>
		//   13   29:astore          4
				mSubscriptions.put(((Object) (s)), ((Object) (subscription)));
		//   14   31:aload_0         
		//   15   32:getfield        #79  <Field ArrayMap mSubscriptions>
		//   16   35:aload_1         
		//   17   36:aload           4
		//   18   38:invokevirtual   #460 <Method Object ArrayMap.put(Object, Object)>
		//   19   41:pop             
			}
			if(bundle == null)
		//*  20   42:aload_2         
		//*  21   43:ifnonnull       51
				bundle = null;
		//   22   46:aconst_null     
		//   23   47:astore_2        
			else
		//*  24   48:goto            60
				bundle = new Bundle(bundle);
		//   25   51:new             #100 <Class Bundle>
		//   26   54:dup             
		//   27   55:aload_2         
		//   28   56:invokespecial   #103 <Method void Bundle(Bundle)>
		//   29   59:astore_2        
			subscription.putCallback(bundle, subscriptioncallback);
		//   30   60:aload           4
		//   31   62:aload_2         
		//   32   63:aload_3         
		//   33   64:invokevirtual   #464 <Method void MediaBrowserCompat$Subscription.putCallback(Bundle, MediaBrowserCompat$SubscriptionCallback)>
			if(mState == 2)
		//*  34   67:aload_0         
		//*  35   68:getfield        #81  <Field int mState>
		//*  36   71:iconst_2        
		//*  37   72:icmpne          120
				try
				{
					mServiceBinderWrapper.addSubscription(s, subscriptioncallback.mToken, bundle, mCallbacksMessenger);
		//   38   75:aload_0         
		//   39   76:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   40   79:aload_1         
		//   41   80:aload_3         
		//   42   81:invokestatic    #426 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
		//   43   84:aload_2         
		//   44   85:aload_0         
		//   45   86:getfield        #132 <Field Messenger mCallbacksMessenger>
		//   46   89:invokevirtual   #430 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
					return;
		//   47   92:return          
				}
				// Misplaced declaration of an exception variable
				catch(Bundle bundle)
		//*  48   93:astore_2        
				{
					Log.d("MediaBrowserCompat", (new StringBuilder()).append("addSubscription failed with RemoteException parentId=").append(s).toString());
		//   49   94:ldc1            #134 <String "MediaBrowserCompat">
		//   50   96:new             #114 <Class StringBuilder>
		//   51   99:dup             
		//   52  100:invokespecial   #115 <Method void StringBuilder()>
		//   53  103:ldc2            #466 <String "addSubscription failed with RemoteException parentId=">
		//   54  106:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   55  109:aload_1         
		//   56  110:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   57  113:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   58  116:invokestatic    #213 <Method int Log.d(String, String)>
		//   59  119:pop             
				}
		//   60  120:return          
		}

		public void unsubscribe(String s, SubscriptionCallback subscriptioncallback)
		{
			Subscription subscription;
			subscription = (Subscription)mSubscriptions.get(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #79  <Field ArrayMap mSubscriptions>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #345 <Method Object ArrayMap.get(Object)>
		//    4    8:checkcast       #347 <Class MediaBrowserCompat$Subscription>
		//    5   11:astore          4
			if(subscription == null)
		//*   6   13:aload           4
		//*   7   15:ifnonnull       19
				return;
		//    8   18:return          
			if(subscriptioncallback == null)
		//*   9   19:aload_2         
		//*  10   20:ifnonnull       47
			{
				int i;
				List list;
				List list1;
				try
				{
					if(mState == 2)
		//*  11   23:aload_0         
		//*  12   24:getfield        #81  <Field int mState>
		//*  13   27:iconst_2        
		//*  14   28:icmpne          136
						mServiceBinderWrapper.removeSubscription(s, ((IBinder) (null)), mCallbacksMessenger);
		//   15   31:aload_0         
		//   16   32:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   17   35:aload_1         
		//   18   36:aconst_null     
		//   19   37:aload_0         
		//   20   38:getfield        #132 <Field Messenger mCallbacksMessenger>
		//   21   41:invokevirtual   #472 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
				}
		//*  22   44:goto            136
		//*  23   47:aload           4
		//*  24   49:invokevirtual   #410 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
		//*  25   52:astore          5
		//*  26   54:aload           4
		//*  27   56:invokevirtual   #413 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
		//*  28   59:astore          6
		//*  29   61:aload           5
		//*  30   63:invokeinterface #419 <Method int List.size()>
		//*  31   68:iconst_1        
		//*  32   69:isub            
		//*  33   70:istore_3        
		//*  34   71:iload_3         
		//*  35   72:iflt            136
		//*  36   75:aload           5
		//*  37   77:iload_3         
		//*  38   78:invokeinterface #422 <Method Object List.get(int)>
		//*  39   83:aload_2         
		//*  40   84:if_acmpne       129
		//*  41   87:aload_0         
		//*  42   88:getfield        #81  <Field int mState>
		//*  43   91:iconst_2        
		//*  44   92:icmpne          111
		//*  45   95:aload_0         
		//*  46   96:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//*  47   99:aload_1         
		//*  48  100:aload_2         
		//*  49  101:invokestatic    #426 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
		//*  50  104:aload_0         
		//*  51  105:getfield        #132 <Field Messenger mCallbacksMessenger>
		//*  52  108:invokevirtual   #472 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
		//*  53  111:aload           5
		//*  54  113:iload_3         
		//*  55  114:invokeinterface #475 <Method Object List.remove(int)>
		//*  56  119:pop             
		//*  57  120:aload           6
		//*  58  122:iload_3         
		//*  59  123:invokeinterface #475 <Method Object List.remove(int)>
		//*  60  128:pop             
		//*  61  129:iload_3         
		//*  62  130:iconst_1        
		//*  63  131:isub            
		//*  64  132:istore_3        
		//*  65  133:goto            71
		//*  66  136:goto            167
				catch(RemoteException remoteexception)
		//*  67  139:astore          5
				{
					Log.d("MediaBrowserCompat", (new StringBuilder()).append("removeSubscription failed with RemoteException parentId=").append(s).toString());
		//   68  141:ldc1            #134 <String "MediaBrowserCompat">
		//   69  143:new             #114 <Class StringBuilder>
		//   70  146:dup             
		//   71  147:invokespecial   #115 <Method void StringBuilder()>
		//   72  150:ldc2            #477 <String "removeSubscription failed with RemoteException parentId=">
		//   73  153:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   74  156:aload_1         
		//   75  157:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   76  160:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   77  163:invokestatic    #213 <Method int Log.d(String, String)>
		//   78  166:pop             
				}
				break MISSING_BLOCK_LABEL_167;
			}
			list = subscription.getCallbacks();
			list1 = subscription.getOptionsList();
			i = list.size() - 1;
_L3:
			if(i < 0) goto _L2; else goto _L1
_L1:
			if(list.get(i) != subscriptioncallback)
				continue; /* Loop/switch isn't completed */
			if(mState == 2)
				mServiceBinderWrapper.removeSubscription(s, subscriptioncallback.mToken, mCallbacksMessenger);
			list.remove(i);
			list1.remove(i);
			i--;
			  goto _L3
_L2:
			if(subscription.isEmpty() || subscriptioncallback == null)
		//*  79  167:aload           4
		//*  80  169:invokevirtual   #479 <Method boolean MediaBrowserCompat$Subscription.isEmpty()>
		//*  81  172:ifne            179
		//*  82  175:aload_2         
		//*  83  176:ifnonnull       188
				mSubscriptions.remove(((Object) (s)));
		//   84  179:aload_0         
		//   85  180:getfield        #79  <Field ArrayMap mSubscriptions>
		//   86  183:aload_1         
		//   87  184:invokevirtual   #481 <Method Object ArrayMap.remove(Object)>
		//   88  187:pop             
			return;
		//   89  188:return          
		}

		private static final int CONNECT_STATE_CONNECTED = 2;
		static final int CONNECT_STATE_CONNECTING = 1;
		static final int CONNECT_STATE_DISCONNECTED = 0;
		static final int CONNECT_STATE_SUSPENDED = 3;
		final ConnectionCallback mCallback;
		Messenger mCallbacksMessenger;
		final Context mContext;
		private Bundle mExtras;
		final CallbackHandler mHandler = new CallbackHandler(((MediaBrowserServiceCallbackImpl) (this)));
		private android.support.v4.media.session.MediaSessionCompat.Token mMediaSessionToken;
		final Bundle mRootHints;
		private String mRootId;
		ServiceBinderWrapper mServiceBinderWrapper;
		final ComponentName mServiceComponent;
		MediaServiceConnection mServiceConnection;
		int mState;
		private final ArrayMap mSubscriptions = new ArrayMap();

		public MediaBrowserImplBase(Context context, ComponentName componentname, ConnectionCallback connectioncallback, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #67  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #69  <Class MediaBrowserCompat$CallbackHandler>
		//    4    8:dup             
		//    5    9:aload_0         
		//    6   10:invokespecial   #72  <Method void MediaBrowserCompat$CallbackHandler(MediaBrowserCompat$MediaBrowserServiceCallbackImpl)>
		//    7   13:putfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//    8   16:aload_0         
		//    9   17:new             #76  <Class ArrayMap>
		//   10   20:dup             
		//   11   21:invokespecial   #77  <Method void ArrayMap()>
		//   12   24:putfield        #79  <Field ArrayMap mSubscriptions>
			mState = 0;
		//   13   27:aload_0         
		//   14   28:iconst_0        
		//   15   29:putfield        #81  <Field int mState>
			if(context == null)
		//*  16   32:aload_1         
		//*  17   33:ifnonnull       46
				throw new IllegalArgumentException("context must not be null");
		//   18   36:new             #83  <Class IllegalArgumentException>
		//   19   39:dup             
		//   20   40:ldc1            #85  <String "context must not be null">
		//   21   42:invokespecial   #88  <Method void IllegalArgumentException(String)>
		//   22   45:athrow          
			if(componentname == null)
		//*  23   46:aload_2         
		//*  24   47:ifnonnull       60
				throw new IllegalArgumentException("service component must not be null");
		//   25   50:new             #83  <Class IllegalArgumentException>
		//   26   53:dup             
		//   27   54:ldc1            #90  <String "service component must not be null">
		//   28   56:invokespecial   #88  <Method void IllegalArgumentException(String)>
		//   29   59:athrow          
			if(connectioncallback == null)
		//*  30   60:aload_3         
		//*  31   61:ifnonnull       74
				throw new IllegalArgumentException("connection callback must not be null");
		//   32   64:new             #83  <Class IllegalArgumentException>
		//   33   67:dup             
		//   34   68:ldc1            #92  <String "connection callback must not be null">
		//   35   70:invokespecial   #88  <Method void IllegalArgumentException(String)>
		//   36   73:athrow          
			mContext = context;
		//   37   74:aload_0         
		//   38   75:aload_1         
		//   39   76:putfield        #94  <Field Context mContext>
			mServiceComponent = componentname;
		//   40   79:aload_0         
		//   41   80:aload_2         
		//   42   81:putfield        #96  <Field ComponentName mServiceComponent>
			mCallback = connectioncallback;
		//   43   84:aload_0         
		//   44   85:aload_3         
		//   45   86:putfield        #98  <Field MediaBrowserCompat$ConnectionCallback mCallback>
			if(bundle == null)
		//*  46   89:aload           4
		//*  47   91:ifnonnull       99
				context = null;
		//   48   94:aconst_null     
		//   49   95:astore_1        
			else
		//*  50   96:goto            109
				context = ((Context) (new Bundle(bundle)));
		//   51   99:new             #100 <Class Bundle>
		//   52  102:dup             
		//   53  103:aload           4
		//   54  105:invokespecial   #103 <Method void Bundle(Bundle)>
		//   55  108:astore_1        
			mRootHints = ((Bundle) (context));
		//   56  109:aload_0         
		//   57  110:aload_1         
		//   58  111:putfield        #105 <Field Bundle mRootHints>
		//   59  114:return          
		}
	}

	class MediaBrowserImplBase.MediaServiceConnection
		implements ServiceConnection
	{

		private void postOrRun(Runnable runnable)
		{
			if(Thread.currentThread() == mHandler.getLooper().getThread())
		//*   0    0:invokestatic    #34  <Method Thread Thread.currentThread()>
		//*   1    3:aload_0         
		//*   2    4:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*   3    7:getfield        #38  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
		//*   4   10:invokevirtual   #44  <Method Looper MediaBrowserCompat$CallbackHandler.getLooper()>
		//*   5   13:invokevirtual   #49  <Method Thread Looper.getThread()>
		//*   6   16:if_acmpne       26
			{
				runnable.run();
		//    7   19:aload_1         
		//    8   20:invokeinterface #54  <Method void Runnable.run()>
				return;
		//    9   25:return          
			} else
			{
				mHandler.post(runnable);
		//   10   26:aload_0         
		//   11   27:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//   12   30:getfield        #38  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
		//   13   33:aload_1         
		//   14   34:invokevirtual   #58  <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   15   37:pop             
				return;
		//   16   38:return          
			}
		}

		boolean isCurrent(String s)
		{
			if(mServiceConnection != this)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*   2    4:getfield        #64  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
		//*   3    7:aload_0         
		//*   4    8:if_acmpeq       82
			{
				if(mState != 0)
		//*   5   11:aload_0         
		//*   6   12:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*   7   15:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		//*   8   18:ifeq            80
					Log.i("MediaBrowserCompat", (new StringBuilder()).append(s).append(" for ").append(((Object) (mServiceComponent))).append(" with mServiceConnection=").append(((Object) (mServiceConnection))).append(" this=").append(((Object) (this))).toString());
		//    9   21:ldc1            #70  <String "MediaBrowserCompat">
		//   10   23:new             #72  <Class StringBuilder>
		//   11   26:dup             
		//   12   27:invokespecial   #73  <Method void StringBuilder()>
		//   13   30:aload_1         
		//   14   31:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   15   34:ldc1            #79  <String " for ">
		//   16   36:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   17   39:aload_0         
		//   18   40:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//   19   43:getfield        #83  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
		//   20   46:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
		//   21   49:ldc1            #88  <String " with mServiceConnection=">
		//   22   51:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   23   54:aload_0         
		//   24   55:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//   25   58:getfield        #64  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
		//   26   61:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
		//   27   64:ldc1            #90  <String " this=">
		//   28   66:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   29   69:aload_0         
		//   30   70:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
		//   31   73:invokevirtual   #94  <Method String StringBuilder.toString()>
		//   32   76:invokestatic    #100 <Method int Log.i(String, String)>
		//   33   79:pop             
				return false;
		//   34   80:iconst_0        
		//   35   81:ireturn         
			} else
			{
				return true;
		//   36   82:iconst_1        
		//   37   83:ireturn         
			}
		}

		public void onServiceConnected(final ComponentName name, IBinder ibinder)
		{
			postOrRun(((_cls1) (ibinder)). new Runnable() {

				public void run()
				{
					if(MediaBrowserCompat.DEBUG)
				//*   0    0:getstatic       #42  <Field boolean MediaBrowserCompat.DEBUG>
				//*   1    3:ifeq            56
					{
						Log.d("MediaBrowserCompat", (new StringBuilder()).append("MediaServiceConnection.onServiceConnected name=").append(((Object) (name))).append(" binder=").append(((Object) (binder))).toString());
				//    2    6:ldc1            #44  <String "MediaBrowserCompat">
				//    3    8:new             #46  <Class StringBuilder>
				//    4   11:dup             
				//    5   12:invokespecial   #47  <Method void StringBuilder()>
				//    6   15:ldc1            #49  <String "MediaServiceConnection.onServiceConnected name=">
				//    7   17:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
				//    8   20:aload_0         
				//    9   21:getfield        #29  <Field ComponentName val$name>
				//   10   24:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
				//   11   27:ldc1            #58  <String " binder=">
				//   12   29:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
				//   13   32:aload_0         
				//   14   33:getfield        #31  <Field IBinder val$binder>
				//   15   36:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
				//   16   39:invokevirtual   #62  <Method String StringBuilder.toString()>
				//   17   42:invokestatic    #68  <Method int Log.d(String, String)>
				//   18   45:pop             
						dump();
				//   19   46:aload_0         
				//   20   47:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   21   50:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   22   53:invokevirtual   #75  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
					}
					if(!isCurrent("onServiceConnected"))
				//*  23   56:aload_0         
				//*  24   57:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//*  25   60:ldc1            #76  <String "onServiceConnected">
				//*  26   62:invokevirtual   #80  <Method boolean MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.isCurrent(String)>
				//*  27   65:ifne            69
						return;
				//   28   68:return          
					mServiceBinderWrapper = new ServiceBinderWrapper(binder, mRootHints);
				//   29   69:aload_0         
				//   30   70:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   31   73:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   32   76:new             #82  <Class MediaBrowserCompat$ServiceBinderWrapper>
				//   33   79:dup             
				//   34   80:aload_0         
				//   35   81:getfield        #31  <Field IBinder val$binder>
				//   36   84:aload_0         
				//   37   85:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   38   88:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   39   91:getfield        #86  <Field Bundle MediaBrowserCompat$MediaBrowserImplBase.mRootHints>
				//   40   94:invokespecial   #89  <Method void MediaBrowserCompat$ServiceBinderWrapper(IBinder, Bundle)>
				//   41   97:putfield        #93  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
					mCallbacksMessenger = new Messenger(((Handler) (mHandler)));
				//   42  100:aload_0         
				//   43  101:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   44  104:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   45  107:new             #95  <Class Messenger>
				//   46  110:dup             
				//   47  111:aload_0         
				//   48  112:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   49  115:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   50  118:getfield        #99  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
				//   51  121:invokespecial   #102 <Method void Messenger(Handler)>
				//   52  124:putfield        #106 <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
					mHandler.setCallbacksMessenger(mCallbacksMessenger);
				//   53  127:aload_0         
				//   54  128:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   55  131:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   56  134:getfield        #99  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
				//   57  137:aload_0         
				//   58  138:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   59  141:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   60  144:getfield        #106 <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
				//   61  147:invokevirtual   #112 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
					mState = 1;
				//   62  150:aload_0         
				//   63  151:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   64  154:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   65  157:iconst_1        
				//   66  158:putfield        #116 <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
					try
					{
						if(MediaBrowserCompat.DEBUG)
				//*  67  161:getstatic       #42  <Field boolean MediaBrowserCompat.DEBUG>
				//*  68  164:ifeq            185
						{
							Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
				//   69  167:ldc1            #44  <String "MediaBrowserCompat">
				//   70  169:ldc1            #118 <String "ServiceCallbacks.onConnect...">
				//   71  171:invokestatic    #68  <Method int Log.d(String, String)>
				//   72  174:pop             
							dump();
				//   73  175:aload_0         
				//   74  176:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   75  179:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   76  182:invokevirtual   #75  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
						}
						mServiceBinderWrapper.connect(mContext, mCallbacksMessenger);
				//   77  185:aload_0         
				//   78  186:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   79  189:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   80  192:getfield        #93  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
				//   81  195:aload_0         
				//   82  196:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   83  199:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   84  202:getfield        #122 <Field Context MediaBrowserCompat$MediaBrowserImplBase.mContext>
				//   85  205:aload_0         
				//   86  206:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   87  209:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   88  212:getfield        #106 <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
				//   89  215:invokevirtual   #126 <Method void MediaBrowserCompat$ServiceBinderWrapper.connect(Context, Messenger)>
						return;
				//   90  218:return          
					}
					catch(RemoteException remoteexception)
				//*  91  219:astore_1        
					{
						Log.w("MediaBrowserCompat", (new StringBuilder()).append("RemoteException during connect for ").append(((Object) (mServiceComponent))).toString());
				//   92  220:ldc1            #44  <String "MediaBrowserCompat">
				//   93  222:new             #46  <Class StringBuilder>
				//   94  225:dup             
				//   95  226:invokespecial   #47  <Method void StringBuilder()>
				//   96  229:ldc1            #128 <String "RemoteException during connect for ">
				//   97  231:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
				//   98  234:aload_0         
				//   99  235:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//  100  238:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//  101  241:getfield        #131 <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
				//  102  244:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
				//  103  247:invokevirtual   #62  <Method String StringBuilder.toString()>
				//  104  250:invokestatic    #134 <Method int Log.w(String, String)>
				//  105  253:pop             
					}
					if(MediaBrowserCompat.DEBUG)
				//* 106  254:getstatic       #42  <Field boolean MediaBrowserCompat.DEBUG>
				//* 107  257:ifeq            278
					{
						Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
				//  108  260:ldc1            #44  <String "MediaBrowserCompat">
				//  109  262:ldc1            #118 <String "ServiceCallbacks.onConnect...">
				//  110  264:invokestatic    #68  <Method int Log.d(String, String)>
				//  111  267:pop             
						dump();
				//  112  268:aload_0         
				//  113  269:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//  114  272:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//  115  275:invokevirtual   #75  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
					}
				//  116  278:return          
				}

				final MediaBrowserImplBase.MediaServiceConnection this$1;
				final IBinder val$binder;
				final ComponentName val$name;

			
			{
				this$1 = final_mediaserviceconnection;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				name = componentname;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #29  <Field ComponentName val$name>
				binder = IBinder.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #31  <Field IBinder val$binder>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #34  <Method void Object()>
			//   11   19:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:new             #14  <Class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:invokespecial   #105 <Method void MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1(MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection, ComponentName, IBinder)>
		//    7   11:invokespecial   #107 <Method void postOrRun(Runnable)>
		//    8   14:return          
		}

		public void onServiceDisconnected(ComponentName componentname)
		{
			postOrRun(((_cls2) (componentname)). new Runnable() {

				public void run()
				{
					if(MediaBrowserCompat.DEBUG)
				//*   0    0:getstatic       #36  <Field boolean MediaBrowserCompat.DEBUG>
				//*   1    3:ifeq            71
					{
						Log.d("MediaBrowserCompat", (new StringBuilder()).append("MediaServiceConnection.onServiceDisconnected name=").append(((Object) (name))).append(" this=").append(((Object) (this))).append(" mServiceConnection=").append(((Object) (mServiceConnection))).toString());
				//    2    6:ldc1            #38  <String "MediaBrowserCompat">
				//    3    8:new             #40  <Class StringBuilder>
				//    4   11:dup             
				//    5   12:invokespecial   #41  <Method void StringBuilder()>
				//    6   15:ldc1            #43  <String "MediaServiceConnection.onServiceDisconnected name=">
				//    7   17:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
				//    8   20:aload_0         
				//    9   21:getfield        #27  <Field ComponentName val$name>
				//   10   24:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
				//   11   27:ldc1            #52  <String " this=">
				//   12   29:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
				//   13   32:aload_0         
				//   14   33:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
				//   15   36:ldc1            #54  <String " mServiceConnection=">
				//   16   38:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
				//   17   41:aload_0         
				//   18   42:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   19   45:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   20   48:getfield        #61  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
				//   21   51:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
				//   22   54:invokevirtual   #65  <Method String StringBuilder.toString()>
				//   23   57:invokestatic    #71  <Method int Log.d(String, String)>
				//   24   60:pop             
						dump();
				//   25   61:aload_0         
				//   26   62:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   27   65:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   28   68:invokevirtual   #74  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
					}
					if(!isCurrent("onServiceDisconnected"))
				//*  29   71:aload_0         
				//*  30   72:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//*  31   75:ldc1            #75  <String "onServiceDisconnected">
				//*  32   77:invokevirtual   #79  <Method boolean MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.isCurrent(String)>
				//*  33   80:ifne            84
					{
						return;
				//   34   83:return          
					} else
					{
						mServiceBinderWrapper = null;
				//   35   84:aload_0         
				//   36   85:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   37   88:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   38   91:aconst_null     
				//   39   92:putfield        #83  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
						mCallbacksMessenger = null;
				//   40   95:aload_0         
				//   41   96:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   42   99:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   43  102:aconst_null     
				//   44  103:putfield        #87  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
						mHandler.setCallbacksMessenger(((Messenger) (null)));
				//   45  106:aload_0         
				//   46  107:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   47  110:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   48  113:getfield        #91  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
				//   49  116:aconst_null     
				//   50  117:invokevirtual   #97  <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
						mState = 3;
				//   51  120:aload_0         
				//   52  121:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   53  124:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   54  127:iconst_3        
				//   55  128:putfield        #101 <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
						mCallback.onConnectionSuspended();
				//   56  131:aload_0         
				//   57  132:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   58  135:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   59  138:getfield        #105 <Field MediaBrowserCompat$ConnectionCallback MediaBrowserCompat$MediaBrowserImplBase.mCallback>
				//   60  141:invokevirtual   #110 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionSuspended()>
						return;
				//   61  144:return          
					}
				}

				final MediaBrowserImplBase.MediaServiceConnection this$1;
				final ComponentName val$name;

			
			{
				this$1 = final_mediaserviceconnection;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				name = ComponentName.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field ComponentName val$name>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #30  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:new             #16  <Class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #112 <Method void MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2(MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection, ComponentName)>
		//    6   10:invokespecial   #107 <Method void postOrRun(Runnable)>
		//    7   13:return          
		}

		final MediaBrowserImplBase this$0;

		MediaBrowserImplBase.MediaServiceConnection()
		{
			this$0 = MediaBrowserImplBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #25  <Method void Object()>
		//    5    9:return          
		}
	}

	static interface MediaBrowserServiceCallbackImpl
	{

		public abstract void onConnectionFailed(Messenger messenger);

		public abstract void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle);

		public abstract void onServiceConnected(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle);
	}

	public static class MediaItem
		implements Parcelable
	{

		public static MediaItem fromMediaItem(Object obj)
		{
			if(obj == null || android.os.Build.VERSION.SDK_INT < 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          12
		//*   2    4:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmpge          14
			{
				return null;
		//    5   12:aconst_null     
		//    6   13:areturn         
			} else
			{
				int i = MediaBrowserCompatApi21.MediaItem.getFlags(obj);
		//    7   14:aload_0         
		//    8   15:invokestatic    #89  <Method int MediaBrowserCompatApi21$MediaItem.getFlags(Object)>
		//    9   18:istore_1        
				return new MediaItem(MediaDescriptionCompat.fromMediaDescription(MediaBrowserCompatApi21.MediaItem.getDescription(obj)), i);
		//   10   19:new             #2   <Class MediaBrowserCompat$MediaItem>
		//   11   22:dup             
		//   12   23:aload_0         
		//   13   24:invokestatic    #93  <Method Object MediaBrowserCompatApi21$MediaItem.getDescription(Object)>
		//   14   27:invokestatic    #97  <Method MediaDescriptionCompat MediaDescriptionCompat.fromMediaDescription(Object)>
		//   15   30:iload_1         
		//   16   31:invokespecial   #99  <Method void MediaBrowserCompat$MediaItem(MediaDescriptionCompat, int)>
		//   17   34:areturn         
			}
		}

		public static List fromMediaItemList(List list)
		{
			if(list == null || android.os.Build.VERSION.SDK_INT < 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          12
		//*   2    4:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmpge          14
				return null;
		//    5   12:aconst_null     
		//    6   13:areturn         
			ArrayList arraylist = new ArrayList(list.size());
		//    7   14:new             #103 <Class ArrayList>
		//    8   17:dup             
		//    9   18:aload_0         
		//   10   19:invokeinterface #108 <Method int List.size()>
		//   11   24:invokespecial   #111 <Method void ArrayList(int)>
		//   12   27:astore_1        
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (fromMediaItem(((Iterator) (list)).next())))));
		//   13   28:aload_0         
		//   14   29:invokeinterface #115 <Method Iterator List.iterator()>
		//   15   34:astore_0        
		//   16   35:aload_0         
		//   17   36:invokeinterface #121 <Method boolean Iterator.hasNext()>
		//   18   41:ifeq            63
		//   19   44:aload_1         
		//   20   45:aload_0         
		//   21   46:invokeinterface #125 <Method Object Iterator.next()>
		//   22   51:invokestatic    #127 <Method MediaBrowserCompat$MediaItem fromMediaItem(Object)>
		//   23   54:invokeinterface #131 <Method boolean List.add(Object)>
		//   24   59:pop             
		//*  25   60:goto            35
			return ((List) (arraylist));
		//   26   63:aload_1         
		//   27   64:areturn         
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public MediaDescriptionCompat getDescription()
		{
			return mDescription;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field MediaDescriptionCompat mDescription>
		//    2    4:areturn         
		}

		public int getFlags()
		{
			return mFlags;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field int mFlags>
		//    2    4:ireturn         
		}

		public String getMediaId()
		{
			return mDescription.getMediaId();
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field MediaDescriptionCompat mDescription>
		//    2    4:invokevirtual   #67  <Method String MediaDescriptionCompat.getMediaId()>
		//    3    7:areturn         
		}

		public boolean isBrowsable()
		{
			return (mFlags & 1) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field int mFlags>
		//    2    4:iconst_1        
		//    3    5:iand            
		//    4    6:ifeq            11
		//    5    9:iconst_1        
		//    6   10:ireturn         
		//    7   11:iconst_0        
		//    8   12:ireturn         
		}

		public boolean isPlayable()
		{
			return (mFlags & 2) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field int mFlags>
		//    2    4:iconst_2        
		//    3    5:iand            
		//    4    6:ifeq            11
		//    5    9:iconst_1        
		//    6   10:ireturn         
		//    7   11:iconst_0        
		//    8   12:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder("MediaItem{");
		//    0    0:new             #142 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:ldc1            #144 <String "MediaItem{">
		//    3    6:invokespecial   #145 <Method void StringBuilder(String)>
		//    4    9:astore_1        
			stringbuilder.append("mFlags=").append(mFlags);
		//    5   10:aload_1         
		//    6   11:ldc1            #147 <String "mFlags=">
		//    7   13:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
		//    8   16:aload_0         
		//    9   17:getfield        #43  <Field int mFlags>
		//   10   20:invokevirtual   #154 <Method StringBuilder StringBuilder.append(int)>
		//   11   23:pop             
			stringbuilder.append(", mDescription=").append(((Object) (mDescription)));
		//   12   24:aload_1         
		//   13   25:ldc1            #156 <String ", mDescription=">
		//   14   27:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
		//   15   30:aload_0         
		//   16   31:getfield        #54  <Field MediaDescriptionCompat mDescription>
		//   17   34:invokevirtual   #159 <Method StringBuilder StringBuilder.append(Object)>
		//   18   37:pop             
			stringbuilder.append('}');
		//   19   38:aload_1         
		//   20   39:bipush          125
		//   21   41:invokevirtual   #162 <Method StringBuilder StringBuilder.append(char)>
		//   22   44:pop             
			return stringbuilder.toString();
		//   23   45:aload_1         
		//   24   46:invokevirtual   #164 <Method String StringBuilder.toString()>
		//   25   49:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			parcel.writeInt(mFlags);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #43  <Field int mFlags>
		//    3    5:invokevirtual   #169 <Method void Parcel.writeInt(int)>
			mDescription.writeToParcel(parcel, i);
		//    4    8:aload_0         
		//    5    9:getfield        #54  <Field MediaDescriptionCompat mDescription>
		//    6   12:aload_1         
		//    7   13:iload_2         
		//    8   14:invokevirtual   #171 <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
		//    9   17:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public MediaItem createFromParcel(Parcel parcel)
			{
				return new MediaItem(parcel);
			//    0    0:new             #9   <Class MediaBrowserCompat$MediaItem>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void MediaBrowserCompat$MediaItem(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method MediaBrowserCompat$MediaItem createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public MediaItem[] newArray(int i)
			{
				return new MediaItem[i];
			//    0    0:iload_1         
			//    1    1:anewarray       MediaItem[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #30  <Method MediaBrowserCompat$MediaItem[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		public static final int FLAG_BROWSABLE = 1;
		public static final int FLAG_PLAYABLE = 2;
		private final MediaDescriptionCompat mDescription;
		private final int mFlags;

		static 
		{
		//    0    0:new             #11  <Class MediaBrowserCompat$MediaItem$1>
		//    1    3:dup             
		//    2    4:invokespecial   #30  <Method void MediaBrowserCompat$MediaItem$1()>
		//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		MediaItem(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
			mFlags = parcel.readInt();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #41  <Method int Parcel.readInt()>
		//    5    9:putfield        #43  <Field int mFlags>
			mDescription = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
		//    6   12:aload_0         
		//    7   13:getstatic       #46  <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
		//    8   16:aload_1         
		//    9   17:invokeinterface #52  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   10   22:checkcast       #45  <Class MediaDescriptionCompat>
		//   11   25:putfield        #54  <Field MediaDescriptionCompat mDescription>
		//   12   28:return          
		}

		public MediaItem(MediaDescriptionCompat mediadescriptioncompat, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
			if(mediadescriptioncompat == null)
		//*   2    4:aload_1         
		//*   3    5:ifnonnull       18
				throw new IllegalArgumentException("description cannot be null");
		//    4    8:new             #58  <Class IllegalArgumentException>
		//    5   11:dup             
		//    6   12:ldc1            #60  <String "description cannot be null">
		//    7   14:invokespecial   #63  <Method void IllegalArgumentException(String)>
		//    8   17:athrow          
			if(TextUtils.isEmpty(((CharSequence) (mediadescriptioncompat.getMediaId()))))
		//*   9   18:aload_1         
		//*  10   19:invokevirtual   #67  <Method String MediaDescriptionCompat.getMediaId()>
		//*  11   22:invokestatic    #73  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  12   25:ifeq            38
			{
				throw new IllegalArgumentException("description must have a non-empty media id");
		//   13   28:new             #58  <Class IllegalArgumentException>
		//   14   31:dup             
		//   15   32:ldc1            #75  <String "description must have a non-empty media id">
		//   16   34:invokespecial   #63  <Method void IllegalArgumentException(String)>
		//   17   37:athrow          
			} else
			{
				mFlags = i;
		//   18   38:aload_0         
		//   19   39:iload_2         
		//   20   40:putfield        #43  <Field int mFlags>
				mDescription = mediadescriptioncompat;
		//   21   43:aload_0         
		//   22   44:aload_1         
		//   23   45:putfield        #54  <Field MediaDescriptionCompat mDescription>
				return;
		//   24   48:return          
			}
		}
	}

	public static interface MediaItem.Flags
		extends Annotation
	{
	}

	public static abstract class SearchCallback
	{

		public void onError(String s, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onSearchResult(String s, Bundle bundle, List list)
		{
		//    0    0:return          
		}

		public SearchCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	static class SearchResultReceiver extends ResultReceiver
	{

		public void onReceiveResult(int i, Bundle bundle)
		{
			if(i != 0 || bundle == null || !bundle.containsKey("search_results"))
		//*   0    0:iload_1         
		//*   1    1:ifne            17
		//*   2    4:aload_2         
		//*   3    5:ifnull          17
		//*   4    8:aload_2         
		//*   5    9:ldc1            #29  <String "search_results">
		//*   6   11:invokevirtual   #35  <Method boolean Bundle.containsKey(String)>
		//*   7   14:ifne            33
			{
				mCallback.onError(mQuery, mExtras);
		//    8   17:aload_0         
		//    9   18:getfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
		//   10   21:aload_0         
		//   11   22:getfield        #20  <Field String mQuery>
		//   12   25:aload_0         
		//   13   26:getfield        #22  <Field Bundle mExtras>
		//   14   29:invokevirtual   #41  <Method void MediaBrowserCompat$SearchCallback.onError(String, Bundle)>
				return;
		//   15   32:return          
			}
			Parcelable aparcelable[] = bundle.getParcelableArray("search_results");
		//   16   33:aload_2         
		//   17   34:ldc1            #29  <String "search_results">
		//   18   36:invokevirtual   #45  <Method Parcelable[] Bundle.getParcelableArray(String)>
		//   19   39:astore          5
			bundle = null;
		//   20   41:aconst_null     
		//   21   42:astore_2        
			if(aparcelable != null)
		//*  22   43:aload           5
		//*  23   45:ifnull          93
			{
				ArrayList arraylist = new ArrayList();
		//   24   48:new             #47  <Class ArrayList>
		//   25   51:dup             
		//   26   52:invokespecial   #50  <Method void ArrayList()>
		//   27   55:astore          4
				int j = aparcelable.length;
		//   28   57:aload           5
		//   29   59:arraylength     
		//   30   60:istore_3        
				i = 0;
		//   31   61:iconst_0        
		//   32   62:istore_1        
				do
				{
					bundle = ((Bundle) (arraylist));
		//   33   63:aload           4
		//   34   65:astore_2        
					if(i >= j)
						break;
		//   35   66:iload_1         
		//   36   67:iload_3         
		//   37   68:icmpge          93
					((List) (arraylist)).add(((Object) ((MediaItem)aparcelable[i])));
		//   38   71:aload           4
		//   39   73:aload           5
		//   40   75:iload_1         
		//   41   76:aaload          
		//   42   77:checkcast       #52  <Class MediaBrowserCompat$MediaItem>
		//   43   80:invokeinterface #58  <Method boolean List.add(Object)>
		//   44   85:pop             
					i++;
		//   45   86:iload_1         
		//   46   87:iconst_1        
		//   47   88:iadd            
		//   48   89:istore_1        
				} while(true);
		//   49   90:goto            63
			}
			mCallback.onSearchResult(mQuery, mExtras, ((List) (bundle)));
		//   50   93:aload_0         
		//   51   94:getfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
		//   52   97:aload_0         
		//   53   98:getfield        #20  <Field String mQuery>
		//   54  101:aload_0         
		//   55  102:getfield        #22  <Field Bundle mExtras>
		//   56  105:aload_2         
		//   57  106:invokevirtual   #62  <Method void MediaBrowserCompat$SearchCallback.onSearchResult(String, Bundle, List)>
		//   58  109:return          
		}

		private final SearchCallback mCallback;
		private final Bundle mExtras;
		private final String mQuery;

		SearchResultReceiver(String s, Bundle bundle, SearchCallback searchcallback, Handler handler)
		{
			super(handler);
		//    0    0:aload_0         
		//    1    1:aload           4
		//    2    3:invokespecial   #18  <Method void ResultReceiver(Handler)>
			mQuery = s;
		//    3    6:aload_0         
		//    4    7:aload_1         
		//    5    8:putfield        #20  <Field String mQuery>
			mExtras = bundle;
		//    6   11:aload_0         
		//    7   12:aload_2         
		//    8   13:putfield        #22  <Field Bundle mExtras>
			mCallback = searchcallback;
		//    9   16:aload_0         
		//   10   17:aload_3         
		//   11   18:putfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
		//   12   21:return          
		}
	}

	static class ServiceBinderWrapper
	{

		private void sendRequest(int i, Bundle bundle, Messenger messenger)
			throws RemoteException
		{
			Message message = Message.obtain();
		//    0    0:invokestatic    #36  <Method Message Message.obtain()>
		//    1    3:astore          4
			message.what = i;
		//    2    5:aload           4
		//    3    7:iload_1         
		//    4    8:putfield        #40  <Field int Message.what>
			message.arg1 = 1;
		//    5   11:aload           4
		//    6   13:iconst_1        
		//    7   14:putfield        #43  <Field int Message.arg1>
			message.setData(bundle);
		//    8   17:aload           4
		//    9   19:aload_2         
		//   10   20:invokevirtual   #47  <Method void Message.setData(Bundle)>
			message.replyTo = messenger;
		//   11   23:aload           4
		//   12   25:aload_3         
		//   13   26:putfield        #50  <Field Messenger Message.replyTo>
			mMessenger.send(message);
		//   14   29:aload_0         
		//   15   30:getfield        #23  <Field Messenger mMessenger>
		//   16   33:aload           4
		//   17   35:invokevirtual   #54  <Method void Messenger.send(Message)>
		//   18   38:return          
		}

		void addSubscription(String s, IBinder ibinder, Bundle bundle, Messenger messenger)
			throws RemoteException
		{
			Bundle bundle1 = new Bundle();
		//    0    0:new             #59  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #60  <Method void Bundle()>
		//    3    7:astore          5
			bundle1.putString("data_media_item_id", s);
		//    4    9:aload           5
		//    5   11:ldc1            #62  <String "data_media_item_id">
		//    6   13:aload_1         
		//    7   14:invokevirtual   #66  <Method void Bundle.putString(String, String)>
			BundleCompat.putBinder(bundle1, "data_callback_token", ibinder);
		//    8   17:aload           5
		//    9   19:ldc1            #68  <String "data_callback_token">
		//   10   21:aload_2         
		//   11   22:invokestatic    #74  <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
			bundle1.putBundle("data_options", bundle);
		//   12   25:aload           5
		//   13   27:ldc1            #76  <String "data_options">
		//   14   29:aload_3         
		//   15   30:invokevirtual   #80  <Method void Bundle.putBundle(String, Bundle)>
			sendRequest(3, bundle1, messenger);
		//   16   33:aload_0         
		//   17   34:iconst_3        
		//   18   35:aload           5
		//   19   37:aload           4
		//   20   39:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
		//   21   42:return          
		}

		void connect(Context context, Messenger messenger)
			throws RemoteException
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #59  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #60  <Method void Bundle()>
		//    3    7:astore_3        
			bundle.putString("data_package_name", context.getPackageName());
		//    4    8:aload_3         
		//    5    9:ldc1            #86  <String "data_package_name">
		//    6   11:aload_1         
		//    7   12:invokevirtual   #92  <Method String Context.getPackageName()>
		//    8   15:invokevirtual   #66  <Method void Bundle.putString(String, String)>
			bundle.putBundle("data_root_hints", mRootHints);
		//    9   18:aload_3         
		//   10   19:ldc1            #94  <String "data_root_hints">
		//   11   21:aload_0         
		//   12   22:getfield        #25  <Field Bundle mRootHints>
		//   13   25:invokevirtual   #80  <Method void Bundle.putBundle(String, Bundle)>
			sendRequest(1, bundle, messenger);
		//   14   28:aload_0         
		//   15   29:iconst_1        
		//   16   30:aload_3         
		//   17   31:aload_2         
		//   18   32:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
		//   19   35:return          
		}

		void disconnect(Messenger messenger)
			throws RemoteException
		{
			sendRequest(2, ((Bundle) (null)), messenger);
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:aconst_null     
		//    3    3:aload_1         
		//    4    4:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
		//    5    7:return          
		}

		void getMediaItem(String s, ResultReceiver resultreceiver, Messenger messenger)
			throws RemoteException
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #59  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #60  <Method void Bundle()>
		//    3    7:astore          4
			bundle.putString("data_media_item_id", s);
		//    4    9:aload           4
		//    5   11:ldc1            #62  <String "data_media_item_id">
		//    6   13:aload_1         
		//    7   14:invokevirtual   #66  <Method void Bundle.putString(String, String)>
			bundle.putParcelable("data_result_receiver", ((Parcelable) (resultreceiver)));
		//    8   17:aload           4
		//    9   19:ldc1            #100 <String "data_result_receiver">
		//   10   21:aload_2         
		//   11   22:invokevirtual   #104 <Method void Bundle.putParcelable(String, Parcelable)>
			sendRequest(5, bundle, messenger);
		//   12   25:aload_0         
		//   13   26:iconst_5        
		//   14   27:aload           4
		//   15   29:aload_3         
		//   16   30:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
		//   17   33:return          
		}

		void registerCallbackMessenger(Messenger messenger)
			throws RemoteException
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #59  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #60  <Method void Bundle()>
		//    3    7:astore_2        
			bundle.putBundle("data_root_hints", mRootHints);
		//    4    8:aload_2         
		//    5    9:ldc1            #94  <String "data_root_hints">
		//    6   11:aload_0         
		//    7   12:getfield        #25  <Field Bundle mRootHints>
		//    8   15:invokevirtual   #80  <Method void Bundle.putBundle(String, Bundle)>
			sendRequest(6, bundle, messenger);
		//    9   18:aload_0         
		//   10   19:bipush          6
		//   11   21:aload_2         
		//   12   22:aload_1         
		//   13   23:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
		//   14   26:return          
		}

		void removeSubscription(String s, IBinder ibinder, Messenger messenger)
			throws RemoteException
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #59  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #60  <Method void Bundle()>
		//    3    7:astore          4
			bundle.putString("data_media_item_id", s);
		//    4    9:aload           4
		//    5   11:ldc1            #62  <String "data_media_item_id">
		//    6   13:aload_1         
		//    7   14:invokevirtual   #66  <Method void Bundle.putString(String, String)>
			BundleCompat.putBinder(bundle, "data_callback_token", ibinder);
		//    8   17:aload           4
		//    9   19:ldc1            #68  <String "data_callback_token">
		//   10   21:aload_2         
		//   11   22:invokestatic    #74  <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
			sendRequest(4, bundle, messenger);
		//   12   25:aload_0         
		//   13   26:iconst_4        
		//   14   27:aload           4
		//   15   29:aload_3         
		//   16   30:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
		//   17   33:return          
		}

		void search(String s, Bundle bundle, ResultReceiver resultreceiver, Messenger messenger)
			throws RemoteException
		{
			Bundle bundle1 = new Bundle();
		//    0    0:new             #59  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #60  <Method void Bundle()>
		//    3    7:astore          5
			bundle1.putString("data_search_query", s);
		//    4    9:aload           5
		//    5   11:ldc1            #111 <String "data_search_query">
		//    6   13:aload_1         
		//    7   14:invokevirtual   #66  <Method void Bundle.putString(String, String)>
			bundle1.putBundle("data_search_extras", bundle);
		//    8   17:aload           5
		//    9   19:ldc1            #113 <String "data_search_extras">
		//   10   21:aload_2         
		//   11   22:invokevirtual   #80  <Method void Bundle.putBundle(String, Bundle)>
			bundle1.putParcelable("data_result_receiver", ((Parcelable) (resultreceiver)));
		//   12   25:aload           5
		//   13   27:ldc1            #100 <String "data_result_receiver">
		//   14   29:aload_3         
		//   15   30:invokevirtual   #104 <Method void Bundle.putParcelable(String, Parcelable)>
			sendRequest(8, bundle1, messenger);
		//   16   33:aload_0         
		//   17   34:bipush          8
		//   18   36:aload           5
		//   19   38:aload           4
		//   20   40:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
		//   21   43:return          
		}

		void unregisterCallbackMessenger(Messenger messenger)
			throws RemoteException
		{
			sendRequest(7, ((Bundle) (null)), messenger);
		//    0    0:aload_0         
		//    1    1:bipush          7
		//    2    3:aconst_null     
		//    3    4:aload_1         
		//    4    5:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
		//    5    8:return          
		}

		private Messenger mMessenger;
		private Bundle mRootHints;

		public ServiceBinderWrapper(IBinder ibinder, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mMessenger = new Messenger(ibinder);
		//    2    4:aload_0         
		//    3    5:new             #18  <Class Messenger>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #21  <Method void Messenger(IBinder)>
		//    7   13:putfield        #23  <Field Messenger mMessenger>
			mRootHints = bundle;
		//    8   16:aload_0         
		//    9   17:aload_2         
		//   10   18:putfield        #25  <Field Bundle mRootHints>
		//   11   21:return          
		}
	}

	static class Subscription
	{

		public SubscriptionCallback getCallback(Bundle bundle)
		{
			for(int i = 0; i < mOptionsList.size(); i++)
		//*   0    0:iconst_0        
		//*   1    1:istore_2        
		//*   2    2:iload_2         
		//*   3    3:aload_0         
		//*   4    4:getfield        #23  <Field List mOptionsList>
		//*   5    7:invokeinterface #32  <Method int List.size()>
		//*   6   12:icmpge          56
				if(MediaBrowserCompatUtils.areSameOptions((Bundle)mOptionsList.get(i), bundle))
		//*   7   15:aload_0         
		//*   8   16:getfield        #23  <Field List mOptionsList>
		//*   9   19:iload_2         
		//*  10   20:invokeinterface #36  <Method Object List.get(int)>
		//*  11   25:checkcast       #38  <Class Bundle>
		//*  12   28:aload_1         
		//*  13   29:invokestatic    #44  <Method boolean MediaBrowserCompatUtils.areSameOptions(Bundle, Bundle)>
		//*  14   32:ifeq            49
					return (SubscriptionCallback)mCallbacks.get(i);
		//   15   35:aload_0         
		//   16   36:getfield        #21  <Field List mCallbacks>
		//   17   39:iload_2         
		//   18   40:invokeinterface #36  <Method Object List.get(int)>
		//   19   45:checkcast       #46  <Class MediaBrowserCompat$SubscriptionCallback>
		//   20   48:areturn         

		//   21   49:iload_2         
		//   22   50:iconst_1        
		//   23   51:iadd            
		//   24   52:istore_2        
		//*  25   53:goto            2
			return null;
		//   26   56:aconst_null     
		//   27   57:areturn         
		}

		public List getCallbacks()
		{
			return mCallbacks;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field List mCallbacks>
		//    2    4:areturn         
		}

		public List getOptionsList()
		{
			return mOptionsList;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field List mOptionsList>
		//    2    4:areturn         
		}

		public boolean isEmpty()
		{
			return mCallbacks.isEmpty();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field List mCallbacks>
		//    2    4:invokeinterface #56  <Method boolean List.isEmpty()>
		//    3    9:ireturn         
		}

		public void putCallback(Bundle bundle, SubscriptionCallback subscriptioncallback)
		{
			for(int i = 0; i < mOptionsList.size(); i++)
		//*   0    0:iconst_0        
		//*   1    1:istore_3        
		//*   2    2:iload_3         
		//*   3    3:aload_0         
		//*   4    4:getfield        #23  <Field List mOptionsList>
		//*   5    7:invokeinterface #32  <Method int List.size()>
		//*   6   12:icmpge          55
				if(MediaBrowserCompatUtils.areSameOptions((Bundle)mOptionsList.get(i), bundle))
		//*   7   15:aload_0         
		//*   8   16:getfield        #23  <Field List mOptionsList>
		//*   9   19:iload_3         
		//*  10   20:invokeinterface #36  <Method Object List.get(int)>
		//*  11   25:checkcast       #38  <Class Bundle>
		//*  12   28:aload_1         
		//*  13   29:invokestatic    #44  <Method boolean MediaBrowserCompatUtils.areSameOptions(Bundle, Bundle)>
		//*  14   32:ifeq            48
				{
					mCallbacks.set(i, ((Object) (subscriptioncallback)));
		//   15   35:aload_0         
		//   16   36:getfield        #21  <Field List mCallbacks>
		//   17   39:iload_3         
		//   18   40:aload_2         
		//   19   41:invokeinterface #62  <Method Object List.set(int, Object)>
		//   20   46:pop             
					return;
		//   21   47:return          
				}

		//   22   48:iload_3         
		//   23   49:iconst_1        
		//   24   50:iadd            
		//   25   51:istore_3        
		//*  26   52:goto            2
			mCallbacks.add(((Object) (subscriptioncallback)));
		//   27   55:aload_0         
		//   28   56:getfield        #21  <Field List mCallbacks>
		//   29   59:aload_2         
		//   30   60:invokeinterface #66  <Method boolean List.add(Object)>
		//   31   65:pop             
			mOptionsList.add(((Object) (bundle)));
		//   32   66:aload_0         
		//   33   67:getfield        #23  <Field List mOptionsList>
		//   34   70:aload_1         
		//   35   71:invokeinterface #66  <Method boolean List.add(Object)>
		//   36   76:pop             
		//   37   77:return          
		}

		private final List mCallbacks = new ArrayList();
		private final List mOptionsList = new ArrayList();

		public Subscription()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #18  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #19  <Method void ArrayList()>
		//    6   12:putfield        #21  <Field List mCallbacks>
		//    7   15:aload_0         
		//    8   16:new             #18  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #19  <Method void ArrayList()>
		//   11   23:putfield        #23  <Field List mOptionsList>
		//   12   26:return          
		}
	}

	public static abstract class SubscriptionCallback
	{

		private void setSubscription(Subscription subscription)
		{
			mSubscriptionRef = new WeakReference(((Object) (subscription)));
		//    0    0:aload_0         
		//    1    1:new             #71  <Class WeakReference>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #74  <Method void WeakReference(Object)>
		//    5    9:putfield        #76  <Field WeakReference mSubscriptionRef>
		//    6   12:return          
		}

		public void onChildrenLoaded(String s, List list)
		{
		//    0    0:return          
		}

		public void onChildrenLoaded(String s, List list, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onError(String s)
		{
		//    0    0:return          
		}

		public void onError(String s, Bundle bundle)
		{
		//    0    0:return          
		}

		private final Object mSubscriptionCallbackObj;
		WeakReference mSubscriptionRef;
		private final IBinder mToken;


/*
		static IBinder access$000(SubscriptionCallback subscriptioncallback)
		{
			return subscriptioncallback.mToken;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field IBinder mToken>
		//    2    4:areturn         
		}

*/


/*
		static void access$100(SubscriptionCallback subscriptioncallback, Subscription subscription)
		{
			subscriptioncallback.setSubscription(subscription);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #67  <Method void setSubscription(MediaBrowserCompat$Subscription)>
			return;
		//    3    5:return          
		}

*/


/*
		static Object access$200(SubscriptionCallback subscriptioncallback)
		{
			return subscriptioncallback.mSubscriptionCallbackObj;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field Object mSubscriptionCallbackObj>
		//    2    4:areturn         
		}

*/

		public SubscriptionCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			if(android.os.Build.VERSION.SDK_INT >= 26 || BuildCompat.isAtLeastO())
		//*   2    4:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          26
		//*   4    9:icmpge          18
		//*   5   12:invokestatic    #36  <Method boolean BuildCompat.isAtLeastO()>
		//*   6   15:ifeq            39
			{
				mSubscriptionCallbackObj = MediaBrowserCompatApi24.createSubscriptionCallback(((MediaBrowserCompatApi24.SubscriptionCallback) (new StubApi24())));
		//    7   18:aload_0         
		//    8   19:new             #12  <Class MediaBrowserCompat$SubscriptionCallback$StubApi24>
		//    9   22:dup             
		//   10   23:aload_0         
		//   11   24:invokespecial   #39  <Method void MediaBrowserCompat$SubscriptionCallback$StubApi24(MediaBrowserCompat$SubscriptionCallback)>
		//   12   27:invokestatic    #45  <Method Object MediaBrowserCompatApi24.createSubscriptionCallback(MediaBrowserCompatApi24$SubscriptionCallback)>
		//   13   30:putfield        #47  <Field Object mSubscriptionCallbackObj>
				mToken = null;
		//   14   33:aload_0         
		//   15   34:aconst_null     
		//   16   35:putfield        #49  <Field IBinder mToken>
				return;
		//   17   38:return          
			}
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*  18   39:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
		//*  19   42:bipush          21
		//*  20   44:icmplt          74
			{
				mSubscriptionCallbackObj = MediaBrowserCompatApi21.createSubscriptionCallback(((MediaBrowserCompatApi21.SubscriptionCallback) (new StubApi21())));
		//   21   47:aload_0         
		//   22   48:new             #9   <Class MediaBrowserCompat$SubscriptionCallback$StubApi21>
		//   23   51:dup             
		//   24   52:aload_0         
		//   25   53:invokespecial   #50  <Method void MediaBrowserCompat$SubscriptionCallback$StubApi21(MediaBrowserCompat$SubscriptionCallback)>
		//   26   56:invokestatic    #55  <Method Object MediaBrowserCompatApi21.createSubscriptionCallback(MediaBrowserCompatApi21$SubscriptionCallback)>
		//   27   59:putfield        #47  <Field Object mSubscriptionCallbackObj>
				mToken = ((IBinder) (new Binder()));
		//   28   62:aload_0         
		//   29   63:new             #57  <Class Binder>
		//   30   66:dup             
		//   31   67:invokespecial   #58  <Method void Binder()>
		//   32   70:putfield        #49  <Field IBinder mToken>
				return;
		//   33   73:return          
			} else
			{
				mSubscriptionCallbackObj = null;
		//   34   74:aload_0         
		//   35   75:aconst_null     
		//   36   76:putfield        #47  <Field Object mSubscriptionCallbackObj>
				mToken = ((IBinder) (new Binder()));
		//   37   79:aload_0         
		//   38   80:new             #57  <Class Binder>
		//   39   83:dup             
		//   40   84:invokespecial   #58  <Method void Binder()>
		//   41   87:putfield        #49  <Field IBinder mToken>
				return;
		//   42   90:return          
			}
		}
	}

	class SubscriptionCallback.StubApi21
		implements MediaBrowserCompatApi21.SubscriptionCallback
	{

		List applyOptions(List list, Bundle bundle)
		{
			if(list == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
		//    4    6:aload_2         
		//    5    7:ldc1            #26  <String "android.media.browse.extra.PAGE">
		//    6    9:iconst_m1       
		//    7   10:invokevirtual   #32  <Method int Bundle.getInt(String, int)>
		//    8   13:istore_3        
			int l = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
		//    9   14:aload_2         
		//   10   15:ldc1            #34  <String "android.media.browse.extra.PAGE_SIZE">
		//   11   17:iconst_m1       
		//   12   18:invokevirtual   #32  <Method int Bundle.getInt(String, int)>
		//   13   21:istore          6
			if(i == -1 && l == -1)
		//*  14   23:iload_3         
		//*  15   24:iconst_m1       
		//*  16   25:icmpne          36
		//*  17   28:iload           6
		//*  18   30:iconst_m1       
		//*  19   31:icmpne          36
				return list;
		//   20   34:aload_1         
		//   21   35:areturn         
			int k = l * i;
		//   22   36:iload           6
		//   23   38:iload_3         
		//   24   39:imul            
		//   25   40:istore          5
			int j = k + l;
		//   26   42:iload           5
		//   27   44:iload           6
		//   28   46:iadd            
		//   29   47:istore          4
			if(i < 0 || l < 1 || k >= list.size())
		//*  30   49:iload_3         
		//*  31   50:iflt            70
		//*  32   53:iload           6
		//*  33   55:iconst_1        
		//*  34   56:icmplt          70
		//*  35   59:iload           5
		//*  36   61:aload_1         
		//*  37   62:invokeinterface #40  <Method int List.size()>
		//*  38   67:icmplt          74
				return Collections.EMPTY_LIST;
		//   39   70:getstatic       #46  <Field List Collections.EMPTY_LIST>
		//   40   73:areturn         
			i = j;
		//   41   74:iload           4
		//   42   76:istore_3        
			if(j > list.size())
		//*  43   77:iload           4
		//*  44   79:aload_1         
		//*  45   80:invokeinterface #40  <Method int List.size()>
		//*  46   85:icmple          95
				i = list.size();
		//   47   88:aload_1         
		//   48   89:invokeinterface #40  <Method int List.size()>
		//   49   94:istore_3        
			return list.subList(k, i);
		//   50   95:aload_1         
		//   51   96:iload           5
		//   52   98:iload_3         
		//   53   99:invokeinterface #50  <Method List List.subList(int, int)>
		//   54  104:areturn         
		}

		public void onChildrenLoaded(String s, List list)
		{
			Object obj;
			if(mSubscriptionRef == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//*   2    4:getfield        #59  <Field WeakReference MediaBrowserCompat$SubscriptionCallback.mSubscriptionRef>
		//*   3    7:ifnonnull       16
				obj = null;
		//    4   10:aconst_null     
		//    5   11:astore          4
			else
		//*   6   13:goto            31
				obj = ((Object) ((Subscription)mSubscriptionRef.get()));
		//    7   16:aload_0         
		//    8   17:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//    9   20:getfield        #59  <Field WeakReference MediaBrowserCompat$SubscriptionCallback.mSubscriptionRef>
		//   10   23:invokevirtual   #65  <Method Object WeakReference.get()>
		//   11   26:checkcast       #67  <Class MediaBrowserCompat$Subscription>
		//   12   29:astore          4
			if(obj == null)
		//*  13   31:aload           4
		//*  14   33:ifnonnull       49
			{
				SubscriptionCallback.this.onChildrenLoaded(s, MediaItem.fromMediaItemList(list));
		//   15   36:aload_0         
		//   16   37:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//   17   40:aload_1         
		//   18   41:aload_2         
		//   19   42:invokestatic    #73  <Method List MediaBrowserCompat$MediaItem.fromMediaItemList(List)>
		//   20   45:invokevirtual   #75  <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
				return;
		//   21   48:return          
			}
			list = MediaItem.fromMediaItemList(list);
		//   22   49:aload_2         
		//   23   50:invokestatic    #73  <Method List MediaBrowserCompat$MediaItem.fromMediaItemList(List)>
		//   24   53:astore_2        
			List list1 = ((Subscription) (obj)).getCallbacks();
		//   25   54:aload           4
		//   26   56:invokevirtual   #79  <Method List MediaBrowserCompat$Subscription.getCallbacks()>
		//   27   59:astore          5
			obj = ((Object) (((Subscription) (obj)).getOptionsList()));
		//   28   61:aload           4
		//   29   63:invokevirtual   #82  <Method List MediaBrowserCompat$Subscription.getOptionsList()>
		//   30   66:astore          4
			for(int i = 0; i < list1.size(); i++)
		//*  31   68:iconst_0        
		//*  32   69:istore_3        
		//*  33   70:iload_3         
		//*  34   71:aload           5
		//*  35   73:invokeinterface #40  <Method int List.size()>
		//*  36   78:icmpge          135
			{
				Bundle bundle = (Bundle)((List) (obj)).get(i);
		//   37   81:aload           4
		//   38   83:iload_3         
		//   39   84:invokeinterface #85  <Method Object List.get(int)>
		//   40   89:checkcast       #28  <Class Bundle>
		//   41   92:astore          6
				if(bundle == null)
		//*  42   94:aload           6
		//*  43   96:ifnonnull       111
					SubscriptionCallback.this.onChildrenLoaded(s, list);
		//   44   99:aload_0         
		//   45  100:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//   46  103:aload_1         
		//   47  104:aload_2         
		//   48  105:invokevirtual   #75  <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
				else
		//*  49  108:goto            128
					SubscriptionCallback.this.onChildrenLoaded(s, applyOptions(list, bundle), bundle);
		//   50  111:aload_0         
		//   51  112:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//   52  115:aload_1         
		//   53  116:aload_0         
		//   54  117:aload_2         
		//   55  118:aload           6
		//   56  120:invokevirtual   #87  <Method List applyOptions(List, Bundle)>
		//   57  123:aload           6
		//   58  125:invokevirtual   #90  <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
			}

		//   59  128:iload_3         
		//   60  129:iconst_1        
		//   61  130:iadd            
		//   62  131:istore_3        
		//*  63  132:goto            70
		//   64  135:return          
		}

		public void onError(String s)
		{
			SubscriptionCallback.this.onError(s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #96  <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
		//    4    8:return          
		}

		final SubscriptionCallback this$0;

		SubscriptionCallback.StubApi21()
		{
			this$0 = SubscriptionCallback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}
	}

	class SubscriptionCallback.StubApi24 extends SubscriptionCallback.StubApi21
		implements MediaBrowserCompatApi24.SubscriptionCallback
	{

		public void onChildrenLoaded(String s, List list, Bundle bundle)
		{
			SubscriptionCallback.this.onChildrenLoaded(s, MediaItem.fromMediaItemList(list), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #30  <Method List MediaBrowserCompat$MediaItem.fromMediaItemList(List)>
		//    5    9:aload_3         
		//    6   10:invokevirtual   #32  <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
		//    7   13:return          
		}

		public void onError(String s, Bundle bundle)
		{
			SubscriptionCallback.this.onError(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #39  <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
		//    5    9:return          
		}

		final SubscriptionCallback this$0;

		SubscriptionCallback.StubApi24()
		{
			this$0 = SubscriptionCallback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #20  <Method void MediaBrowserCompat$SubscriptionCallback$StubApi21(MediaBrowserCompat$SubscriptionCallback)>
		//    6   10:return          
		}
	}


	public MediaBrowserCompat(Context context, ComponentName componentname, ConnectionCallback connectioncallback, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #129 <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 26 || BuildCompat.isAtLeastO())
	//*   2    4:getstatic       #135 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          26
	//*   4    9:icmpge          18
	//*   5   12:invokestatic    #141 <Method boolean BuildCompat.isAtLeastO()>
	//*   6   15:ifeq            35
		{
			mImpl = ((MediaBrowserImpl) (new MediaBrowserImplApi24(context, componentname, connectioncallback, bundle)));
	//    7   18:aload_0         
	//    8   19:new             #48  <Class MediaBrowserCompat$MediaBrowserImplApi24>
	//    9   22:dup             
	//   10   23:aload_1         
	//   11   24:aload_2         
	//   12   25:aload_3         
	//   13   26:aload           4
	//   14   28:invokespecial   #143 <Method void MediaBrowserCompat$MediaBrowserImplApi24(Context, ComponentName, MediaBrowserCompat$ConnectionCallback, Bundle)>
	//   15   31:putfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
			return;
	//   16   34:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  17   35:getstatic       #135 <Field int android.os.Build$VERSION.SDK_INT>
	//*  18   38:bipush          23
	//*  19   40:icmplt          60
		{
			mImpl = ((MediaBrowserImpl) (new MediaBrowserImplApi23(context, componentname, connectioncallback, bundle)));
	//   20   43:aload_0         
	//   21   44:new             #45  <Class MediaBrowserCompat$MediaBrowserImplApi23>
	//   22   47:dup             
	//   23   48:aload_1         
	//   24   49:aload_2         
	//   25   50:aload_3         
	//   26   51:aload           4
	//   27   53:invokespecial   #146 <Method void MediaBrowserCompat$MediaBrowserImplApi23(Context, ComponentName, MediaBrowserCompat$ConnectionCallback, Bundle)>
	//   28   56:putfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
			return;
	//   29   59:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  30   60:getstatic       #135 <Field int android.os.Build$VERSION.SDK_INT>
	//*  31   63:bipush          21
	//*  32   65:icmplt          85
		{
			mImpl = ((MediaBrowserImpl) (new MediaBrowserImplApi21(context, componentname, connectioncallback, bundle)));
	//   33   68:aload_0         
	//   34   69:new             #30  <Class MediaBrowserCompat$MediaBrowserImplApi21>
	//   35   72:dup             
	//   36   73:aload_1         
	//   37   74:aload_2         
	//   38   75:aload_3         
	//   39   76:aload           4
	//   40   78:invokespecial   #147 <Method void MediaBrowserCompat$MediaBrowserImplApi21(Context, ComponentName, MediaBrowserCompat$ConnectionCallback, Bundle)>
	//   41   81:putfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
			return;
	//   42   84:return          
		} else
		{
			mImpl = ((MediaBrowserImpl) (new MediaBrowserImplBase(context, componentname, connectioncallback, bundle)));
	//   43   85:aload_0         
	//   44   86:new             #51  <Class MediaBrowserCompat$MediaBrowserImplBase>
	//   45   89:dup             
	//   46   90:aload_1         
	//   47   91:aload_2         
	//   48   92:aload_3         
	//   49   93:aload           4
	//   50   95:invokespecial   #148 <Method void MediaBrowserCompat$MediaBrowserImplBase(Context, ComponentName, MediaBrowserCompat$ConnectionCallback, Bundle)>
	//   51   98:putfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
			return;
	//   52  101:return          
		}
	}

	public void connect()
	{
		mImpl.connect();
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #151 <Method void MediaBrowserCompat$MediaBrowserImpl.connect()>
	//    3    9:return          
	}

	public void disconnect()
	{
		mImpl.disconnect();
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #154 <Method void MediaBrowserCompat$MediaBrowserImpl.disconnect()>
	//    3    9:return          
	}

	public Bundle getExtras()
	{
		return mImpl.getExtras();
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #159 <Method Bundle MediaBrowserCompat$MediaBrowserImpl.getExtras()>
	//    3    9:areturn         
	}

	public void getItem(String s, ItemCallback itemcallback)
	{
		mImpl.getItem(s, itemcallback);
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #165 <Method void MediaBrowserCompat$MediaBrowserImpl.getItem(String, MediaBrowserCompat$ItemCallback)>
	//    5   11:return          
	}

	public String getRoot()
	{
		return mImpl.getRoot();
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #170 <Method String MediaBrowserCompat$MediaBrowserImpl.getRoot()>
	//    3    9:areturn         
	}

	public ComponentName getServiceComponent()
	{
		return mImpl.getServiceComponent();
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #174 <Method ComponentName MediaBrowserCompat$MediaBrowserImpl.getServiceComponent()>
	//    3    9:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
	{
		return mImpl.getSessionToken();
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #178 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserCompat$MediaBrowserImpl.getSessionToken()>
	//    3    9:areturn         
	}

	public boolean isConnected()
	{
		return mImpl.isConnected();
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #181 <Method boolean MediaBrowserCompat$MediaBrowserImpl.isConnected()>
	//    3    9:ireturn         
	}

	public void search(String s, Bundle bundle, SearchCallback searchcallback)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #189 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("query cannot be empty");
	//    3    7:new             #191 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #193 <String "query cannot be empty">
	//    6   13:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(searchcallback == null)
	//*   8   17:aload_3         
	//*   9   18:ifnonnull       31
		{
			throw new IllegalArgumentException("callback cannot be null");
	//   10   21:new             #191 <Class IllegalArgumentException>
	//   11   24:dup             
	//   12   25:ldc1            #198 <String "callback cannot be null">
	//   13   27:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
		} else
		{
			mImpl.search(s, bundle, searchcallback);
	//   15   31:aload_0         
	//   16   32:getfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//   17   35:aload_1         
	//   18   36:aload_2         
	//   19   37:aload_3         
	//   20   38:invokeinterface #200 <Method void MediaBrowserCompat$MediaBrowserImpl.search(String, Bundle, MediaBrowserCompat$SearchCallback)>
			return;
	//   21   43:return          
		}
	}

	public void subscribe(String s, Bundle bundle, SubscriptionCallback subscriptioncallback)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #189 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("parentId is empty");
	//    3    7:new             #191 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #204 <String "parentId is empty">
	//    6   13:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(subscriptioncallback == null)
	//*   8   17:aload_3         
	//*   9   18:ifnonnull       31
			throw new IllegalArgumentException("callback is null");
	//   10   21:new             #191 <Class IllegalArgumentException>
	//   11   24:dup             
	//   12   25:ldc1            #206 <String "callback is null">
	//   13   27:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
		if(bundle == null)
	//*  15   31:aload_2         
	//*  16   32:ifnonnull       45
		{
			throw new IllegalArgumentException("options are null");
	//   17   35:new             #191 <Class IllegalArgumentException>
	//   18   38:dup             
	//   19   39:ldc1            #208 <String "options are null">
	//   20   41:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   21   44:athrow          
		} else
		{
			mImpl.subscribe(s, bundle, subscriptioncallback);
	//   22   45:aload_0         
	//   23   46:getfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//   24   49:aload_1         
	//   25   50:aload_2         
	//   26   51:aload_3         
	//   27   52:invokeinterface #210 <Method void MediaBrowserCompat$MediaBrowserImpl.subscribe(String, Bundle, MediaBrowserCompat$SubscriptionCallback)>
			return;
	//   28   57:return          
		}
	}

	public void subscribe(String s, SubscriptionCallback subscriptioncallback)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #189 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("parentId is empty");
	//    3    7:new             #191 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #204 <String "parentId is empty">
	//    6   13:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(subscriptioncallback == null)
	//*   8   17:aload_2         
	//*   9   18:ifnonnull       31
		{
			throw new IllegalArgumentException("callback is null");
	//   10   21:new             #191 <Class IllegalArgumentException>
	//   11   24:dup             
	//   12   25:ldc1            #206 <String "callback is null">
	//   13   27:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
		} else
		{
			mImpl.subscribe(s, ((Bundle) (null)), subscriptioncallback);
	//   15   31:aload_0         
	//   16   32:getfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//   17   35:aload_1         
	//   18   36:aconst_null     
	//   19   37:aload_2         
	//   20   38:invokeinterface #210 <Method void MediaBrowserCompat$MediaBrowserImpl.subscribe(String, Bundle, MediaBrowserCompat$SubscriptionCallback)>
			return;
	//   21   43:return          
		}
	}

	public void unsubscribe(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #189 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
		{
			throw new IllegalArgumentException("parentId is empty");
	//    3    7:new             #191 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #204 <String "parentId is empty">
	//    6   13:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		} else
		{
			mImpl.unsubscribe(s, ((SubscriptionCallback) (null)));
	//    8   17:aload_0         
	//    9   18:getfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//   10   21:aload_1         
	//   11   22:aconst_null     
	//   12   23:invokeinterface #214 <Method void MediaBrowserCompat$MediaBrowserImpl.unsubscribe(String, MediaBrowserCompat$SubscriptionCallback)>
			return;
	//   13   28:return          
		}
	}

	public void unsubscribe(String s, SubscriptionCallback subscriptioncallback)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #189 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("parentId is empty");
	//    3    7:new             #191 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #204 <String "parentId is empty">
	//    6   13:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(subscriptioncallback == null)
	//*   8   17:aload_2         
	//*   9   18:ifnonnull       31
		{
			throw new IllegalArgumentException("callback is null");
	//   10   21:new             #191 <Class IllegalArgumentException>
	//   11   24:dup             
	//   12   25:ldc1            #206 <String "callback is null">
	//   13   27:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
		} else
		{
			mImpl.unsubscribe(s, subscriptioncallback);
	//   15   31:aload_0         
	//   16   32:getfield        #145 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//   17   35:aload_1         
	//   18   36:aload_2         
	//   19   37:invokeinterface #214 <Method void MediaBrowserCompat$MediaBrowserImpl.unsubscribe(String, MediaBrowserCompat$SubscriptionCallback)>
			return;
	//   20   42:return          
		}
	}

	static final boolean DEBUG = Log.isLoggable("MediaBrowserCompat", 3);
	public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
	public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
	static final String TAG = "MediaBrowserCompat";
	private final MediaBrowserImpl mImpl;

	static 
	{
	//    0    0:ldc1            #112 <String "MediaBrowserCompat">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #122 <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #124 <Field boolean DEBUG>
	//*   4    9:return          
	}
}
