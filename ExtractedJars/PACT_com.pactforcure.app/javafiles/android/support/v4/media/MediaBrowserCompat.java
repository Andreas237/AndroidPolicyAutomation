// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.*;
import android.os.*;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.session.MediaSessionCompat;
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
	private static class CallbackHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			if(mCallbacksMessengerRef != null && mCallbacksMessengerRef.get() != null && mCallbackImplRef.get() != null) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field WeakReference mCallbacksMessengerRef>
		//    2    4:ifnull          27
		//    3    7:aload_0         
		//    4    8:getfield        #31  <Field WeakReference mCallbacksMessengerRef>
		//    5   11:invokevirtual   #35  <Method Object WeakReference.get()>
		//    6   14:ifnull          27
		//    7   17:aload_0         
		//    8   18:getfield        #24  <Field WeakReference mCallbackImplRef>
		//    9   21:invokevirtual   #35  <Method Object WeakReference.get()>
		//   10   24:ifnonnull       28
_L1:
			return;
		//   11   27:return          
_L2:
			MediaBrowserServiceCallbackImpl mediabrowserservicecallbackimpl;
			Messenger messenger;
			Object obj;
			obj = ((Object) (message.getData()));
		//   12   28:aload_1         
		//   13   29:invokevirtual   #41  <Method Bundle Message.getData()>
		//   14   32:astore          4
			((Bundle) (obj)).setClassLoader(((Class) (android/support/v4/media/session/MediaSessionCompat)).getClassLoader());
		//   15   34:aload           4
		//   16   36:ldc1            #43  <Class MediaSessionCompat>
		//   17   38:invokevirtual   #49  <Method ClassLoader Class.getClassLoader()>
		//   18   41:invokevirtual   #55  <Method void Bundle.setClassLoader(ClassLoader)>
			mediabrowserservicecallbackimpl = (MediaBrowserServiceCallbackImpl)mCallbackImplRef.get();
		//   19   44:aload_0         
		//   20   45:getfield        #24  <Field WeakReference mCallbackImplRef>
		//   21   48:invokevirtual   #35  <Method Object WeakReference.get()>
		//   22   51:checkcast       #57  <Class MediaBrowserCompat$MediaBrowserServiceCallbackImpl>
		//   23   54:astore_2        
			messenger = (Messenger)mCallbacksMessengerRef.get();
		//   24   55:aload_0         
		//   25   56:getfield        #31  <Field WeakReference mCallbacksMessengerRef>
		//   26   59:invokevirtual   #35  <Method Object WeakReference.get()>
		//   27   62:checkcast       #59  <Class Messenger>
		//   28   65:astore_3        
			message.what;
		//   29   66:aload_1         
		//   30   67:getfield        #63  <Field int Message.what>
			JVM INSTR tableswitch 1 3: default 238
		//		               1 169
		//		               2 201
		//		               3 209;
		//   31   70:tableswitch     1 3: default 238
		//		               1 169
		//		               2 201
		//		               3 209
			   goto _L3 _L4 _L5 _L6
_L3:
			Log.w("MediaBrowserCompat", (new StringBuilder()).append("Unhandled message: ").append(((Object) (message))).append("\n  Client version: ").append(1).append("\n  Service version: ").append(message.arg1).toString());
		//   32   96:ldc1            #65  <String "MediaBrowserCompat">
		//   33   98:new             #67  <Class StringBuilder>
		//   34  101:dup             
		//   35  102:invokespecial   #68  <Method void StringBuilder()>
		//   36  105:ldc1            #70  <String "Unhandled message: ">
		//   37  107:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   38  110:aload_1         
		//   39  111:invokevirtual   #77  <Method StringBuilder StringBuilder.append(Object)>
		//   40  114:ldc1            #79  <String "\n  Client version: ">
		//   41  116:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   42  119:iconst_1        
		//   43  120:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
		//   44  123:ldc1            #84  <String "\n  Service version: ">
		//   45  125:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   46  128:aload_1         
		//   47  129:getfield        #87  <Field int Message.arg1>
		//   48  132:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
		//   49  135:invokevirtual   #91  <Method String StringBuilder.toString()>
		//   50  138:invokestatic    #97  <Method int Log.w(String, String)>
		//   51  141:pop             
			return;
		//   52  142:return          
		//*  53  143:astore          4
		//*  54  145:ldc1            #65  <String "MediaBrowserCompat">
		//*  55  147:ldc1            #99  <String "Could not unparcel the data.">
		//*  56  149:invokestatic    #102 <Method int Log.e(String, String)>
		//*  57  152:pop             
		//*  58  153:aload_1         
		//*  59  154:getfield        #63  <Field int Message.what>
		//*  60  157:iconst_1        
		//*  61  158:icmpne          27
		//*  62  161:aload_2         
		//*  63  162:aload_3         
		//*  64  163:invokeinterface #106 <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onConnectionFailed(Messenger)>
		//*  65  168:return          
_L4:
			try
			{
				mediabrowserservicecallbackimpl.onServiceConnected(messenger, ((Bundle) (obj)).getString("data_media_item_id"), (android.support.v4.media.session.MediaSessionCompat.Token)((Bundle) (obj)).getParcelable("data_media_session_token"), ((Bundle) (obj)).getBundle("data_root_hints"));
		//   66  169:aload_2         
		//   67  170:aload_3         
		//   68  171:aload           4
		//   69  173:ldc1            #108 <String "data_media_item_id">
		//   70  175:invokevirtual   #112 <Method String Bundle.getString(String)>
		//   71  178:aload           4
		//   72  180:ldc1            #114 <String "data_media_session_token">
		//   73  182:invokevirtual   #118 <Method Parcelable Bundle.getParcelable(String)>
		//   74  185:checkcast       #120 <Class android.support.v4.media.session.MediaSessionCompat$Token>
		//   75  188:aload           4
		//   76  190:ldc1            #122 <String "data_root_hints">
		//   77  192:invokevirtual   #126 <Method Bundle Bundle.getBundle(String)>
		//   78  195:invokeinterface #130 <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onServiceConnected(Messenger, String, android.support.v4.media.session.MediaSessionCompat$Token, Bundle)>
				return;
		//   79  200:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				Log.e("MediaBrowserCompat", "Could not unparcel the data.");
			}
			if(message.what == 1)
			{
				mediabrowserservicecallbackimpl.onConnectionFailed(messenger);
				return;
			}
			  goto _L1
_L5:
			mediabrowserservicecallbackimpl.onConnectionFailed(messenger);
		//   80  201:aload_2         
		//   81  202:aload_3         
		//   82  203:invokeinterface #106 <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onConnectionFailed(Messenger)>
			return;
		//   83  208:return          
_L6:
			mediabrowserservicecallbackimpl.onLoadChildren(messenger, ((Bundle) (obj)).getString("data_media_item_id"), ((List) (((Bundle) (obj)).getParcelableArrayList("data_media_item_list"))), ((Bundle) (obj)).getBundle("data_options"));
		//   84  209:aload_2         
		//   85  210:aload_3         
		//   86  211:aload           4
		//   87  213:ldc1            #108 <String "data_media_item_id">
		//   88  215:invokevirtual   #112 <Method String Bundle.getString(String)>
		//   89  218:aload           4
		//   90  220:ldc1            #132 <String "data_media_item_list">
		//   91  222:invokevirtual   #136 <Method ArrayList Bundle.getParcelableArrayList(String)>
		//   92  225:aload           4
		//   93  227:ldc1            #138 <String "data_options">
		//   94  229:invokevirtual   #126 <Method Bundle Bundle.getBundle(String)>
		//   95  232:invokeinterface #142 <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onLoadChildren(Messenger, String, List, Bundle)>
			return;
		//   96  237:return          
		//*  97  238:goto            96
		}

		void setCallbacksMessenger(Messenger messenger)
		{
			mCallbacksMessengerRef = new WeakReference(((Object) (messenger)));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class WeakReference>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #22  <Method void WeakReference(Object)>
		//    5    9:putfield        #31  <Field WeakReference mCallbacksMessengerRef>
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

	private class ConnectionCallback.StubApi21
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

	public static abstract class CustomActionCallback
	{

		public void onError(String s, Bundle bundle, Bundle bundle1)
		{
		//    0    0:return          
		}

		public void onProgressUpdate(String s, Bundle bundle, Bundle bundle1)
		{
		//    0    0:return          
		}

		public void onResult(String s, Bundle bundle, Bundle bundle1)
		{
		//    0    0:return          
		}

		public CustomActionCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class CustomActionResultReceiver extends ResultReceiver
	{

		protected void onReceiveResult(int i, Bundle bundle)
		{
			if(mCallback == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
		//*   2    4:ifnonnull       8
				return;
		//    3    7:return          
			switch(i)
		//*   4    8:iload_1         
			{
		//*   5    9:tableswitch     -1 1: default 36
		//		               -1 122
		//		               0 105
		//		               1 88
			default:
				Log.w("MediaBrowserCompat", (new StringBuilder()).append("Unknown result code: ").append(i).append(" (extras=").append(((Object) (mExtras))).append(", resultData=").append(((Object) (bundle))).append(")").toString());
		//    6   36:ldc1            #29  <String "MediaBrowserCompat">
		//    7   38:new             #31  <Class StringBuilder>
		//    8   41:dup             
		//    9   42:invokespecial   #34  <Method void StringBuilder()>
		//   10   45:ldc1            #36  <String "Unknown result code: ">
		//   11   47:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   12   50:iload_1         
		//   13   51:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
		//   14   54:ldc1            #45  <String " (extras=">
		//   15   56:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   16   59:aload_0         
		//   17   60:getfield        #22  <Field Bundle mExtras>
		//   18   63:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
		//   19   66:ldc1            #50  <String ", resultData=">
		//   20   68:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   21   71:aload_2         
		//   22   72:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
		//   23   75:ldc1            #52  <String ")">
		//   24   77:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   25   80:invokevirtual   #56  <Method String StringBuilder.toString()>
		//   26   83:invokestatic    #62  <Method int Log.w(String, String)>
		//   27   86:pop             
				return;
		//   28   87:return          

			case 1: // '\001'
				mCallback.onProgressUpdate(mAction, mExtras, bundle);
		//   29   88:aload_0         
		//   30   89:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
		//   31   92:aload_0         
		//   32   93:getfield        #20  <Field String mAction>
		//   33   96:aload_0         
		//   34   97:getfield        #22  <Field Bundle mExtras>
		//   35  100:aload_2         
		//   36  101:invokevirtual   #68  <Method void MediaBrowserCompat$CustomActionCallback.onProgressUpdate(String, Bundle, Bundle)>
				return;
		//   37  104:return          

			case 0: // '\0'
				mCallback.onResult(mAction, mExtras, bundle);
		//   38  105:aload_0         
		//   39  106:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
		//   40  109:aload_0         
		//   41  110:getfield        #20  <Field String mAction>
		//   42  113:aload_0         
		//   43  114:getfield        #22  <Field Bundle mExtras>
		//   44  117:aload_2         
		//   45  118:invokevirtual   #71  <Method void MediaBrowserCompat$CustomActionCallback.onResult(String, Bundle, Bundle)>
				return;
		//   46  121:return          

			case -1: 
				mCallback.onError(mAction, mExtras, bundle);
		//   47  122:aload_0         
		//   48  123:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
		//   49  126:aload_0         
		//   50  127:getfield        #20  <Field String mAction>
		//   51  130:aload_0         
		//   52  131:getfield        #22  <Field Bundle mExtras>
		//   53  134:aload_2         
		//   54  135:invokevirtual   #74  <Method void MediaBrowserCompat$CustomActionCallback.onError(String, Bundle, Bundle)>
				return;
		//   55  138:return          
			}
		}

		private final String mAction;
		private final CustomActionCallback mCallback;
		private final Bundle mExtras;

		CustomActionResultReceiver(String s, Bundle bundle, CustomActionCallback customactioncallback, Handler handler)
		{
			super(handler);
		//    0    0:aload_0         
		//    1    1:aload           4
		//    2    3:invokespecial   #18  <Method void ResultReceiver(Handler)>
			mAction = s;
		//    3    6:aload_0         
		//    4    7:aload_1         
		//    5    8:putfield        #20  <Field String mAction>
			mExtras = bundle;
		//    6   11:aload_0         
		//    7   12:aload_2         
		//    8   13:putfield        #22  <Field Bundle mExtras>
			mCallback = customactioncallback;
		//    9   16:aload_0         
		//   10   17:aload_3         
		//   11   18:putfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
		//   12   21:return          
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

	private class ItemCallback.StubApi23
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

	private static class ItemReceiver extends ResultReceiver
	{

		protected void onReceiveResult(int i, Bundle bundle)
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

		public abstract void sendCustomAction(String s, Bundle bundle, CustomActionCallback customactioncallback);

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

		public void getItem(String s, final ItemCallback cb)
		{
			if(TextUtils.isEmpty(((CharSequence) (s))))
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
			ItemReceiver itemreceiver = new ItemReceiver(s, cb, ((Handler) (mHandler)));
		//   48   94:new             #168 <Class MediaBrowserCompat$ItemReceiver>
		//   49   97:dup             
		//   50   98:aload_1         
		//   51   99:aload_2         
		//   52  100:aload_0         
		//   53  101:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   54  104:invokespecial   #171 <Method void MediaBrowserCompat$ItemReceiver(String, MediaBrowserCompat$ItemCallback, Handler)>
		//   55  107:astore_3        
			try
			{
				mServiceBinderWrapper.getMediaItem(s, ((ResultReceiver) (itemreceiver)), mCallbacksMessenger);
		//   56  108:aload_0         
		//   57  109:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   58  112:aload_1         
		//   59  113:aload_3         
		//   60  114:aload_0         
		//   61  115:getfield        #109 <Field Messenger mCallbacksMessenger>
		//   62  118:invokevirtual   #175 <Method void MediaBrowserCompat$ServiceBinderWrapper.getMediaItem(String, ResultReceiver, Messenger)>
				return;
		//   63  121:return          
			}
			catch(RemoteException remoteexception)
		//*  64  122:astore_3        
			{
				Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error getting media item: ").append(s).toString());
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
				IBinder ibinder = BundleCompat.getBinder(((Bundle) (obj)), "extra_messenger");
		//    7   13:aload_1         
		//    8   14:ldc1            #216 <String "extra_messenger">
		//    9   16:invokestatic    #222 <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//   10   19:astore_2        
				if(ibinder != null)
		//*  11   20:aload_2         
		//*  12   21:ifnull          77
				{
					mServiceBinderWrapper = new ServiceBinderWrapper(ibinder, mRootHints);
		//   13   24:aload_0         
		//   14   25:new             #111 <Class MediaBrowserCompat$ServiceBinderWrapper>
		//   15   28:dup             
		//   16   29:aload_2         
		//   17   30:aload_0         
		//   18   31:getfield        #80  <Field Bundle mRootHints>
		//   19   34:invokespecial   #225 <Method void MediaBrowserCompat$ServiceBinderWrapper(IBinder, Bundle)>
		//   20   37:putfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
					mCallbacksMessenger = new Messenger(((Handler) (mHandler)));
		//   21   40:aload_0         
		//   22   41:new             #227 <Class Messenger>
		//   23   44:dup             
		//   24   45:aload_0         
		//   25   46:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   26   49:invokespecial   #230 <Method void Messenger(Handler)>
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
		//*  40   80:invokestatic    #222 <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//*  41   83:invokestatic    #244 <Method android.support.v4.media.session.IMediaSession android.support.v4.media.session.IMediaSession$Stub.asInterface(IBinder)>
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
			messenger = ((Messenger) ((Subscription)mSubscriptions.get(((Object) (s)))));
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
			messenger = ((Messenger) (((Subscription) (messenger)).getCallback(mContext, bundle)));
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
						((SubscriptionCallback) (messenger)).onError(s);
		//   39   82:aload_1         
		//   40   83:aload_2         
		//   41   84:invokevirtual   #276 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
						return;
		//   42   87:return          
					} else
					{
						((SubscriptionCallback) (messenger)).onChildrenLoaded(s, list);
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
					((SubscriptionCallback) (messenger)).onError(s, bundle);
		//   50   99:aload_1         
		//   51  100:aload_2         
		//   52  101:aload           4
		//   53  103:invokevirtual   #283 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
					return;
		//   54  106:return          
				} else
				{
					((SubscriptionCallback) (messenger)).onChildrenLoaded(s, list, bundle);
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

		public void search(final String query, Bundle bundle, final SearchCallback callback)
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
			SearchResultReceiver searchresultreceiver = new SearchResultReceiver(query, bundle, callback, ((Handler) (mHandler)));
		//   27   54:new             #304 <Class MediaBrowserCompat$SearchResultReceiver>
		//   28   57:dup             
		//   29   58:aload_1         
		//   30   59:aload_2         
		//   31   60:aload_3         
		//   32   61:aload_0         
		//   33   62:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   34   65:invokespecial   #307 <Method void MediaBrowserCompat$SearchResultReceiver(String, Bundle, MediaBrowserCompat$SearchCallback, Handler)>
		//   35   68:astore          4
			try
			{
				mServiceBinderWrapper.search(query, bundle, ((ResultReceiver) (searchresultreceiver)), mCallbacksMessenger);
		//   36   70:aload_0         
		//   37   71:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   38   74:aload_1         
		//   39   75:aload_2         
		//   40   76:aload           4
		//   41   78:aload_0         
		//   42   79:getfield        #109 <Field Messenger mCallbacksMessenger>
		//   43   82:invokevirtual   #310 <Method void MediaBrowserCompat$ServiceBinderWrapper.search(String, Bundle, ResultReceiver, Messenger)>
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

		public void sendCustomAction(final String action, Bundle bundle, final CustomActionCallback callback)
		{
			CustomActionResultReceiver customactionresultreceiver;
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #292 <Method boolean isConnected()>
		//*   2    4:ifne            63
				throw new IllegalStateException((new StringBuilder()).append("Cannot send a custom action (").append(action).append(") with ").append("extras ").append(((Object) (bundle))).append(" because the browser is not connected to the ").append("service.").toString());
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
					mHandler.post(((_cls6) (bundle)). new Runnable() {

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

						final MediaBrowserImplApi21 this$0;
						final String val$action;
						final CustomActionCallback val$callback;
						final Bundle val$extras;

			
			{
				this$0 = final_mediabrowserimplapi21;
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
			customactionresultreceiver = new CustomActionResultReceiver(action, bundle, callback, ((Handler) (mHandler)));
		//   45  102:new             #338 <Class MediaBrowserCompat$CustomActionResultReceiver>
		//   46  105:dup             
		//   47  106:aload_1         
		//   48  107:aload_2         
		//   49  108:aload_3         
		//   50  109:aload_0         
		//   51  110:getfield        #59  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   52  113:invokespecial   #341 <Method void MediaBrowserCompat$CustomActionResultReceiver(String, Bundle, MediaBrowserCompat$CustomActionCallback, Handler)>
		//   53  116:astore          4
			mServiceBinderWrapper.sendCustomAction(action, bundle, ((ResultReceiver) (customactionresultreceiver)), mCallbacksMessenger);
		//   54  118:aload_0         
		//   55  119:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   56  122:aload_1         
		//   57  123:aload_2         
		//   58  124:aload           4
		//   59  126:aload_0         
		//   60  127:getfield        #109 <Field Messenger mCallbacksMessenger>
		//   61  130:invokevirtual   #343 <Method void MediaBrowserCompat$ServiceBinderWrapper.sendCustomAction(String, Bundle, ResultReceiver, Messenger)>
_L1:
			return;
		//   62  133:return          
			RemoteException remoteexception;
			remoteexception;
		//   63  134:astore          4
			Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error sending a custom action: action=").append(action).append(", extras=").append(((Object) (bundle))).toString(), ((Throwable) (remoteexception)));
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
				mHandler.post(((_cls7) (bundle)). new Runnable() {

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

					final MediaBrowserImplApi21 this$0;
					final String val$action;
					final CustomActionCallback val$callback;
					final Bundle val$extras;

			
			{
				this$0 = final_mediabrowserimplapi21;
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

		public void subscribe(String s, Bundle bundle, SubscriptionCallback subscriptioncallback)
		{
			Subscription subscription1 = (Subscription)mSubscriptions.get(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field ArrayMap mSubscriptions>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #256 <Method Object ArrayMap.get(Object)>
		//    4    8:checkcast       #258 <Class MediaBrowserCompat$Subscription>
		//    5   11:astore          5
			Subscription subscription = subscription1;
		//    6   13:aload           5
		//    7   15:astore          4
			if(subscription1 == null)
		//*   8   17:aload           5
		//*   9   19:ifnonnull       42
			{
				subscription = new Subscription();
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
			subscriptioncallback.setSubscription(subscription);
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
				MediaBrowserCompatApi21.subscribe(mBrowserObj, s, subscriptioncallback.mSubscriptionCallbackObj);
				return;
			}
		//*  48   94:goto            54
			try
			{
				mServiceBinderWrapper.addSubscription(s, subscriptioncallback.mToken, bundle, mCallbacksMessenger);
		//   49   97:aload_0         
		//   50   98:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   51  101:aload_1         
		//   52  102:aload_3         
		//   53  103:invokestatic    #374 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
		//   54  106:aload_2         
		//   55  107:aload_0         
		//   56  108:getfield        #109 <Field Messenger mCallbacksMessenger>
		//   57  111:invokevirtual   #378 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
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

		public void unsubscribe(String s, SubscriptionCallback subscriptioncallback)
		{
			Subscription subscription = (Subscription)mSubscriptions.get(((Object) (s)));
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
					mServiceBinderWrapper.removeSubscription(s, ((IBinder) (null)), mCallbacksMessenger);
		//   70  150:aload_0         
		//   71  151:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   72  154:aload_1         
		//   73  155:aconst_null     
		//   74  156:aload_0         
		//   75  157:getfield        #109 <Field Messenger mCallbacksMessenger>
		//   76  160:invokevirtual   #412 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
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
				mServiceBinderWrapper.removeSubscription(s, subscriptioncallback.mToken, mCallbacksMessenger);
		//  109  237:aload_0         
		//  110  238:getfield        #107 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//  111  241:aload_1         
		//  112  242:aload_2         
		//  113  243:invokestatic    #374 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
		//  114  246:aload_0         
		//  115  247:getfield        #109 <Field Messenger mCallbacksMessenger>
		//  116  250:invokevirtual   #412 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
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
		protected final CallbackHandler mHandler = new CallbackHandler(((MediaBrowserServiceCallbackImpl) (this)));
		private android.support.v4.media.session.MediaSessionCompat.Token mMediaSessionToken;
		protected final Bundle mRootHints;
		protected ServiceBinderWrapper mServiceBinderWrapper;
		private final ArrayMap mSubscriptions = new ArrayMap();

		public MediaBrowserImplApi21(Context context, ComponentName componentname, ConnectionCallback connectioncallback, Bundle bundle)
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
			connectioncallback.setInternalConnectionCallback(((ConnectionCallback.ConnectionCallbackInternal) (this)));
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

	static class MediaBrowserImplApi23 extends MediaBrowserImplApi21
	{

		public void getItem(String s, ItemCallback itemcallback)
		{
			if(mServiceBinderWrapper == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//*   2    4:ifnonnull       20
			{
				MediaBrowserCompatApi23.getItem(mBrowserObj, s, itemcallback.mItemCallbackObj);
		//    3    7:aload_0         
		//    4    8:getfield        #26  <Field Object mBrowserObj>
		//    5   11:aload_1         
		//    6   12:aload_2         
		//    7   13:getfield        #31  <Field Object MediaBrowserCompat$ItemCallback.mItemCallbackObj>
		//    8   16:invokestatic    #36  <Method void MediaBrowserCompatApi23.getItem(Object, String, Object)>
				return;
		//    9   19:return          
			} else
			{
				super.getItem(s, itemcallback);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:aload_2         
		//   13   23:invokespecial   #38  <Method void MediaBrowserCompat$MediaBrowserImplApi21.getItem(String, MediaBrowserCompat$ItemCallback)>
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
		//    5    6:invokespecial   #14  <Method void MediaBrowserCompat$MediaBrowserImplApi21(Context, ComponentName, MediaBrowserCompat$ConnectionCallback, Bundle)>
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
		//    3    5:getfield        #22  <Field Object mBrowserObj>
		//    4    8:aload_1         
		//    5    9:aload_3         
		//    6   10:invokestatic    #28  <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
		//    7   13:invokestatic    #33  <Method void MediaBrowserCompatApi21.subscribe(Object, String, Object)>
				return;
		//    8   16:return          
			} else
			{
				MediaBrowserCompatApi24.subscribe(mBrowserObj, s, bundle, subscriptioncallback.mSubscriptionCallbackObj);
		//    9   17:aload_0         
		//   10   18:getfield        #22  <Field Object mBrowserObj>
		//   11   21:aload_1         
		//   12   22:aload_2         
		//   13   23:aload_3         
		//   14   24:invokestatic    #28  <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
		//   15   27:invokestatic    #38  <Method void MediaBrowserCompatApi24.subscribe(Object, String, Bundle, Object)>
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
		//    3    5:getfield        #22  <Field Object mBrowserObj>
		//    4    8:aload_1         
		//    5    9:invokestatic    #44  <Method void MediaBrowserCompatApi21.unsubscribe(Object, String)>
				return;
		//    6   12:return          
			} else
			{
				MediaBrowserCompatApi24.unsubscribe(mBrowserObj, s, subscriptioncallback.mSubscriptionCallbackObj);
		//    7   13:aload_0         
		//    8   14:getfield        #22  <Field Object mBrowserObj>
		//    9   17:aload_1         
		//   10   18:aload_2         
		//   11   19:invokestatic    #28  <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
		//   12   22:invokestatic    #46  <Method void MediaBrowserCompatApi24.unsubscribe(Object, String, Object)>
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
		//    5    6:invokespecial   #14  <Method void MediaBrowserCompat$MediaBrowserImplApi23(Context, ComponentName, MediaBrowserCompat$ConnectionCallback, Bundle)>
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
		//*   1    1:tableswitch     0 4: default 36
		//		               0 56
		//		               1 59
		//		               2 62
		//		               3 65
		//		               4 68
			default:
				return (new StringBuilder()).append("UNKNOWN/").append(i).toString();
		//    2   36:new             #114 <Class StringBuilder>
		//    3   39:dup             
		//    4   40:invokespecial   #115 <Method void StringBuilder()>
		//    5   43:ldc1            #117 <String "UNKNOWN/">
		//    6   45:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//    7   48:iload_0         
		//    8   49:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
		//    9   52:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   10   55:areturn         

			case 0: // '\0'
				return "CONNECT_STATE_DISCONNECTING";
		//   11   56:ldc1            #129 <String "CONNECT_STATE_DISCONNECTING">
		//   12   58:areturn         

			case 1: // '\001'
				return "CONNECT_STATE_DISCONNECTED";
		//   13   59:ldc1            #130 <String "CONNECT_STATE_DISCONNECTED">
		//   14   61:areturn         

			case 2: // '\002'
				return "CONNECT_STATE_CONNECTING";
		//   15   62:ldc1            #131 <String "CONNECT_STATE_CONNECTING">
		//   16   64:areturn         

			case 3: // '\003'
				return "CONNECT_STATE_CONNECTED";
		//   17   65:ldc1            #132 <String "CONNECT_STATE_CONNECTED">
		//   18   67:areturn         

			case 4: // '\004'
				return "CONNECT_STATE_SUSPENDED";
		//   19   68:ldc1            #133 <String "CONNECT_STATE_SUSPENDED">
		//   20   70:areturn         
			}
		}

		private boolean isCurrent(Messenger messenger, String s)
		{
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_3        
			if(mCallbacksMessenger != messenger || mState == 0 || mState == 1)
		//*   2    2:aload_0         
		//*   3    3:getfield        #137 <Field Messenger mCallbacksMessenger>
		//*   4    6:aload_1         
		//*   5    7:if_acmpne       25
		//*   6   10:aload_0         
		//*   7   11:getfield        #85  <Field int mState>
		//*   8   14:ifeq            25
		//*   9   17:aload_0         
		//*  10   18:getfield        #85  <Field int mState>
		//*  11   21:iconst_1        
		//*  12   22:icmpne          95
			{
				if(mState != 0 && mState != 1)
		//*  13   25:aload_0         
		//*  14   26:getfield        #85  <Field int mState>
		//*  15   29:ifeq            93
		//*  16   32:aload_0         
		//*  17   33:getfield        #85  <Field int mState>
		//*  18   36:iconst_1        
		//*  19   37:icmpeq          93
					Log.i("MediaBrowserCompat", (new StringBuilder()).append(s).append(" for ").append(((Object) (mServiceComponent))).append(" with mCallbacksMessenger=").append(((Object) (mCallbacksMessenger))).append(" this=").append(((Object) (this))).toString());
		//   20   40:ldc1            #139 <String "MediaBrowserCompat">
		//   21   42:new             #114 <Class StringBuilder>
		//   22   45:dup             
		//   23   46:invokespecial   #115 <Method void StringBuilder()>
		//   24   49:aload_2         
		//   25   50:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   26   53:ldc1            #141 <String " for ">
		//   27   55:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   28   58:aload_0         
		//   29   59:getfield        #100 <Field ComponentName mServiceComponent>
		//   30   62:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
		//   31   65:ldc1            #146 <String " with mCallbacksMessenger=">
		//   32   67:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   33   70:aload_0         
		//   34   71:getfield        #137 <Field Messenger mCallbacksMessenger>
		//   35   74:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
		//   36   77:ldc1            #148 <String " this=">
		//   37   79:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   38   82:aload_0         
		//   39   83:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
		//   40   86:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   41   89:invokestatic    #154 <Method int Log.i(String, String)>
		//   42   92:pop             
				flag = false;
		//   43   93:iconst_0        
		//   44   94:istore_3        
			}
			return flag;
		//   45   95:iload_3         
		//   46   96:ireturn         
		}

		public void connect()
		{
			if(mState != 0 && mState != 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #85  <Field int mState>
		//*   2    4:ifeq            53
		//*   3    7:aload_0         
		//*   4    8:getfield        #85  <Field int mState>
		//*   5   11:iconst_1        
		//*   6   12:icmpeq          53
			{
				throw new IllegalStateException((new StringBuilder()).append("connect() called while neigther disconnecting nor disconnected (state=").append(getStateLabel(mState)).append(")").toString());
		//    7   15:new             #157 <Class IllegalStateException>
		//    8   18:dup             
		//    9   19:new             #114 <Class StringBuilder>
		//   10   22:dup             
		//   11   23:invokespecial   #115 <Method void StringBuilder()>
		//   12   26:ldc1            #159 <String "connect() called while neigther disconnecting nor disconnected (state=">
		//   13   28:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   14   31:aload_0         
		//   15   32:getfield        #85  <Field int mState>
		//   16   35:invokestatic    #161 <Method String getStateLabel(int)>
		//   17   38:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   18   41:ldc1            #163 <String ")">
		//   19   43:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   20   46:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   21   49:invokespecial   #164 <Method void IllegalStateException(String)>
		//   22   52:athrow          
			} else
			{
				mState = 2;
		//   23   53:aload_0         
		//   24   54:iconst_2        
		//   25   55:putfield        #85  <Field int mState>
				mHandler.post(new Runnable() {

					public void run()
					{
						if(mState != 0) goto _L2; else goto _L1
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//    2    4:getfield        #30  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
					//    3    7:ifne            11
_L1:
						return;
					//    4   10:return          
_L2:
						boolean flag;
						Intent intent;
						mState = 2;
					//    5   11:aload_0         
					//    6   12:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//    7   15:iconst_2        
					//    8   16:putfield        #30  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
						if(MediaBrowserCompat.DEBUG && mServiceConnection != null)
					//*   9   19:getstatic       #34  <Field boolean MediaBrowserCompat.DEBUG>
					//*  10   22:ifeq            68
					//*  11   25:aload_0         
					//*  12   26:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//*  13   29:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
					//*  14   32:ifnull          68
							throw new RuntimeException((new StringBuilder()).append("mServiceConnection should be null. Instead it is ").append(((Object) (mServiceConnection))).toString());
					//   15   35:new             #40  <Class RuntimeException>
					//   16   38:dup             
					//   17   39:new             #42  <Class StringBuilder>
					//   18   42:dup             
					//   19   43:invokespecial   #43  <Method void StringBuilder()>
					//   20   46:ldc1            #45  <String "mServiceConnection should be null. Instead it is ">
					//   21   48:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
					//   22   51:aload_0         
					//   23   52:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   24   55:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
					//   25   58:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
					//   26   61:invokevirtual   #56  <Method String StringBuilder.toString()>
					//   27   64:invokespecial   #59  <Method void RuntimeException(String)>
					//   28   67:athrow          
						if(mServiceBinderWrapper != null)
					//*  29   68:aload_0         
					//*  30   69:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//*  31   72:getfield        #63  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
					//*  32   75:ifnull          111
							throw new RuntimeException((new StringBuilder()).append("mServiceBinderWrapper should be null. Instead it is ").append(((Object) (mServiceBinderWrapper))).toString());
					//   33   78:new             #40  <Class RuntimeException>
					//   34   81:dup             
					//   35   82:new             #42  <Class StringBuilder>
					//   36   85:dup             
					//   37   86:invokespecial   #43  <Method void StringBuilder()>
					//   38   89:ldc1            #65  <String "mServiceBinderWrapper should be null. Instead it is ">
					//   39   91:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
					//   40   94:aload_0         
					//   41   95:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   42   98:getfield        #63  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
					//   43  101:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
					//   44  104:invokevirtual   #56  <Method String StringBuilder.toString()>
					//   45  107:invokespecial   #59  <Method void RuntimeException(String)>
					//   46  110:athrow          
						if(mCallbacksMessenger != null)
					//*  47  111:aload_0         
					//*  48  112:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//*  49  115:getfield        #69  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
					//*  50  118:ifnull          154
							throw new RuntimeException((new StringBuilder()).append("mCallbacksMessenger should be null. Instead it is ").append(((Object) (mCallbacksMessenger))).toString());
					//   51  121:new             #40  <Class RuntimeException>
					//   52  124:dup             
					//   53  125:new             #42  <Class StringBuilder>
					//   54  128:dup             
					//   55  129:invokespecial   #43  <Method void StringBuilder()>
					//   56  132:ldc1            #71  <String "mCallbacksMessenger should be null. Instead it is ">
					//   57  134:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
					//   58  137:aload_0         
					//   59  138:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   60  141:getfield        #69  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
					//   61  144:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
					//   62  147:invokevirtual   #56  <Method String StringBuilder.toString()>
					//   63  150:invokespecial   #59  <Method void RuntimeException(String)>
					//   64  153:athrow          
						intent = new Intent("android.media.browse.MediaBrowserService");
					//   65  154:new             #73  <Class Intent>
					//   66  157:dup             
					//   67  158:ldc1            #75  <String "android.media.browse.MediaBrowserService">
					//   68  160:invokespecial   #76  <Method void Intent(String)>
					//   69  163:astore_3        
						intent.setComponent(mServiceComponent);
					//   70  164:aload_3         
					//   71  165:aload_0         
					//   72  166:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   73  169:getfield        #80  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
					//   74  172:invokevirtual   #84  <Method Intent Intent.setComponent(ComponentName)>
					//   75  175:pop             
						mServiceConnection = new MediaBrowserImplBase.MediaServiceConnection();
					//   76  176:aload_0         
					//   77  177:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   78  180:new             #86  <Class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection>
					//   79  183:dup             
					//   80  184:aload_0         
					//   81  185:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   82  188:invokespecial   #88  <Method void MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection(MediaBrowserCompat$MediaBrowserImplBase)>
					//   83  191:putfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
						flag = false;
					//   84  194:iconst_0        
					//   85  195:istore_1        
						boolean flag1 = mContext.bindService(intent, ((ServiceConnection) (mServiceConnection)), 1);
					//   86  196:aload_0         
					//   87  197:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   88  200:getfield        #92  <Field Context MediaBrowserCompat$MediaBrowserImplBase.mContext>
					//   89  203:aload_3         
					//   90  204:aload_0         
					//   91  205:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   92  208:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
					//   93  211:iconst_1        
					//   94  212:invokevirtual   #98  <Method boolean Context.bindService(Intent, ServiceConnection, int)>
					//   95  215:istore_2        
						flag = flag1;
					//   96  216:iload_2         
					//   97  217:istore_1        
_L4:
						if(!flag)
					//*  98  218:iload_1         
					//*  99  219:ifne            239
						{
							forceCloseConnection();
					//  100  222:aload_0         
					//  101  223:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//  102  226:invokevirtual   #101 <Method void MediaBrowserCompat$MediaBrowserImplBase.forceCloseConnection()>
							mCallback.onConnectionFailed();
					//  103  229:aload_0         
					//  104  230:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//  105  233:getfield        #105 <Field MediaBrowserCompat$ConnectionCallback MediaBrowserCompat$MediaBrowserImplBase.mCallback>
					//  106  236:invokevirtual   #110 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
						}
						if(MediaBrowserCompat.DEBUG)
					//* 107  239:getstatic       #34  <Field boolean MediaBrowserCompat.DEBUG>
					//* 108  242:ifeq            10
						{
							Log.d("MediaBrowserCompat", "connect...");
					//  109  245:ldc1            #112 <String "MediaBrowserCompat">
					//  110  247:ldc1            #114 <String "connect...">
					//  111  249:invokestatic    #120 <Method int Log.d(String, String)>
					//  112  252:pop             
							dump();
					//  113  253:aload_0         
					//  114  254:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//  115  257:invokevirtual   #123 <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
							return;
					//  116  260:return          
						}
						if(true) goto _L1; else goto _L3
_L3:
						Exception exception;
						exception;
					//  117  261:astore_3        
						Log.e("MediaBrowserCompat", (new StringBuilder()).append("Failed binding to service ").append(((Object) (mServiceComponent))).toString());
					//  118  262:ldc1            #112 <String "MediaBrowserCompat">
					//  119  264:new             #42  <Class StringBuilder>
					//  120  267:dup             
					//  121  268:invokespecial   #43  <Method void StringBuilder()>
					//  122  271:ldc1            #125 <String "Failed binding to service ">
					//  123  273:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
					//  124  276:aload_0         
					//  125  277:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//  126  280:getfield        #80  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
					//  127  283:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
					//  128  286:invokevirtual   #56  <Method String StringBuilder.toString()>
					//  129  289:invokestatic    #128 <Method int Log.e(String, String)>
					//  130  292:pop             
						  goto _L4
					//* 131  293:goto            218
					}

					final MediaBrowserImplBase this$0;

			
			{
				this$0 = MediaBrowserImplBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
				}
);
		//   26   58:aload_0         
		//   27   59:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   28   62:new             #13  <Class MediaBrowserCompat$MediaBrowserImplBase$1>
		//   29   65:dup             
		//   30   66:aload_0         
		//   31   67:invokespecial   #167 <Method void MediaBrowserCompat$MediaBrowserImplBase$1(MediaBrowserCompat$MediaBrowserImplBase)>
		//   32   70:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   33   73:pop             
				return;
		//   34   74:return          
			}
		}

		public void disconnect()
		{
			mState = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #85  <Field int mState>
			mHandler.post(new Runnable() {

				public void run()
				{
					int i;
					if(mCallbacksMessenger != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//*   2    4:getfield        #30  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
				//*   3    7:ifnull          27
						try
						{
							mServiceBinderWrapper.disconnect(mCallbacksMessenger);
				//    4   10:aload_0         
				//    5   11:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//    6   14:getfield        #34  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
				//    7   17:aload_0         
				//    8   18:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//    9   21:getfield        #30  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
				//   10   24:invokevirtual   #39  <Method void MediaBrowserCompat$ServiceBinderWrapper.disconnect(Messenger)>
						}
				//*  11   27:aload_0         
				//*  12   28:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//*  13   31:getfield        #43  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
				//*  14   34:istore_1        
				//*  15   35:aload_0         
				//*  16   36:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//*  17   39:invokevirtual   #46  <Method void MediaBrowserCompat$MediaBrowserImplBase.forceCloseConnection()>
				//*  18   42:iload_1         
				//*  19   43:ifeq            54
				//*  20   46:aload_0         
				//*  21   47:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//*  22   50:iload_1         
				//*  23   51:putfield        #43  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
				//*  24   54:getstatic       #50  <Field boolean MediaBrowserCompat.DEBUG>
				//*  25   57:ifeq            75
				//*  26   60:ldc1            #52  <String "MediaBrowserCompat">
				//*  27   62:ldc1            #54  <String "disconnect...">
				//*  28   64:invokestatic    #60  <Method int Log.d(String, String)>
				//*  29   67:pop             
				//*  30   68:aload_0         
				//*  31   69:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//*  32   72:invokevirtual   #63  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
				//*  33   75:return          
						catch(RemoteException remoteexception)
				//*  34   76:astore_2        
						{
							Log.w("MediaBrowserCompat", (new StringBuilder()).append("RemoteException during connect for ").append(((Object) (mServiceComponent))).toString());
				//   35   77:ldc1            #52  <String "MediaBrowserCompat">
				//   36   79:new             #65  <Class StringBuilder>
				//   37   82:dup             
				//   38   83:invokespecial   #66  <Method void StringBuilder()>
				//   39   86:ldc1            #68  <String "RemoteException during connect for ">
				//   40   88:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
				//   41   91:aload_0         
				//   42   92:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//   43   95:getfield        #76  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
				//   44   98:invokevirtual   #79  <Method StringBuilder StringBuilder.append(Object)>
				//   45  101:invokevirtual   #83  <Method String StringBuilder.toString()>
				//   46  104:invokestatic    #86  <Method int Log.w(String, String)>
				//   47  107:pop             
						}
					i = mState;
					forceCloseConnection();
					if(i != 0)
						mState = i;
					if(MediaBrowserCompat.DEBUG)
					{
						Log.d("MediaBrowserCompat", "disconnect...");
						dump();
					}
				//*  48  108:goto            27
				}

				final MediaBrowserImplBase this$0;

			
			{
				this$0 = MediaBrowserImplBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
			}
);
		//    3    5:aload_0         
		//    4    6:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//    5    9:new             #15  <Class MediaBrowserCompat$MediaBrowserImplBase$2>
		//    6   12:dup             
		//    7   13:aload_0         
		//    8   14:invokespecial   #173 <Method void MediaBrowserCompat$MediaBrowserImplBase$2(MediaBrowserCompat$MediaBrowserImplBase)>
		//    9   17:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   10   20:pop             
		//   11   21:return          
		}

		void dump()
		{
			Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
		//    0    0:ldc1            #139 <String "MediaBrowserCompat">
		//    1    2:ldc1            #176 <String "MediaBrowserCompat...">
		//    2    4:invokestatic    #179 <Method int Log.d(String, String)>
		//    3    7:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mServiceComponent=").append(((Object) (mServiceComponent))).toString());
		//    4    8:ldc1            #139 <String "MediaBrowserCompat">
		//    5   10:new             #114 <Class StringBuilder>
		//    6   13:dup             
		//    7   14:invokespecial   #115 <Method void StringBuilder()>
		//    8   17:ldc1            #181 <String "  mServiceComponent=">
		//    9   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   22:aload_0         
		//   11   23:getfield        #100 <Field ComponentName mServiceComponent>
		//   12   26:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
		//   13   29:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   14   32:invokestatic    #179 <Method int Log.d(String, String)>
		//   15   35:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mCallback=").append(((Object) (mCallback))).toString());
		//   16   36:ldc1            #139 <String "MediaBrowserCompat">
		//   17   38:new             #114 <Class StringBuilder>
		//   18   41:dup             
		//   19   42:invokespecial   #115 <Method void StringBuilder()>
		//   20   45:ldc1            #183 <String "  mCallback=">
		//   21   47:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   22   50:aload_0         
		//   23   51:getfield        #102 <Field MediaBrowserCompat$ConnectionCallback mCallback>
		//   24   54:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
		//   25   57:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   26   60:invokestatic    #179 <Method int Log.d(String, String)>
		//   27   63:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mRootHints=").append(((Object) (mRootHints))).toString());
		//   28   64:ldc1            #139 <String "MediaBrowserCompat">
		//   29   66:new             #114 <Class StringBuilder>
		//   30   69:dup             
		//   31   70:invokespecial   #115 <Method void StringBuilder()>
		//   32   73:ldc1            #185 <String "  mRootHints=">
		//   33   75:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   34   78:aload_0         
		//   35   79:getfield        #104 <Field Bundle mRootHints>
		//   36   82:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
		//   37   85:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   38   88:invokestatic    #179 <Method int Log.d(String, String)>
		//   39   91:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mState=").append(getStateLabel(mState)).toString());
		//   40   92:ldc1            #139 <String "MediaBrowserCompat">
		//   41   94:new             #114 <Class StringBuilder>
		//   42   97:dup             
		//   43   98:invokespecial   #115 <Method void StringBuilder()>
		//   44  101:ldc1            #187 <String "  mState=">
		//   45  103:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   46  106:aload_0         
		//   47  107:getfield        #85  <Field int mState>
		//   48  110:invokestatic    #161 <Method String getStateLabel(int)>
		//   49  113:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   50  116:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   51  119:invokestatic    #179 <Method int Log.d(String, String)>
		//   52  122:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mServiceConnection=").append(((Object) (mServiceConnection))).toString());
		//   53  123:ldc1            #139 <String "MediaBrowserCompat">
		//   54  125:new             #114 <Class StringBuilder>
		//   55  128:dup             
		//   56  129:invokespecial   #115 <Method void StringBuilder()>
		//   57  132:ldc1            #189 <String "  mServiceConnection=">
		//   58  134:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   59  137:aload_0         
		//   60  138:getfield        #191 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
		//   61  141:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
		//   62  144:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   63  147:invokestatic    #179 <Method int Log.d(String, String)>
		//   64  150:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mServiceBinderWrapper=").append(((Object) (mServiceBinderWrapper))).toString());
		//   65  151:ldc1            #139 <String "MediaBrowserCompat">
		//   66  153:new             #114 <Class StringBuilder>
		//   67  156:dup             
		//   68  157:invokespecial   #115 <Method void StringBuilder()>
		//   69  160:ldc1            #193 <String "  mServiceBinderWrapper=">
		//   70  162:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   71  165:aload_0         
		//   72  166:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   73  169:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
		//   74  172:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   75  175:invokestatic    #179 <Method int Log.d(String, String)>
		//   76  178:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mCallbacksMessenger=").append(((Object) (mCallbacksMessenger))).toString());
		//   77  179:ldc1            #139 <String "MediaBrowserCompat">
		//   78  181:new             #114 <Class StringBuilder>
		//   79  184:dup             
		//   80  185:invokespecial   #115 <Method void StringBuilder()>
		//   81  188:ldc1            #197 <String "  mCallbacksMessenger=">
		//   82  190:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   83  193:aload_0         
		//   84  194:getfield        #137 <Field Messenger mCallbacksMessenger>
		//   85  197:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
		//   86  200:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   87  203:invokestatic    #179 <Method int Log.d(String, String)>
		//   88  206:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mRootId=").append(mRootId).toString());
		//   89  207:ldc1            #139 <String "MediaBrowserCompat">
		//   90  209:new             #114 <Class StringBuilder>
		//   91  212:dup             
		//   92  213:invokespecial   #115 <Method void StringBuilder()>
		//   93  216:ldc1            #199 <String "  mRootId=">
		//   94  218:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   95  221:aload_0         
		//   96  222:getfield        #201 <Field String mRootId>
		//   97  225:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   98  228:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   99  231:invokestatic    #179 <Method int Log.d(String, String)>
		//  100  234:pop             
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mMediaSessionToken=").append(((Object) (mMediaSessionToken))).toString());
		//  101  235:ldc1            #139 <String "MediaBrowserCompat">
		//  102  237:new             #114 <Class StringBuilder>
		//  103  240:dup             
		//  104  241:invokespecial   #115 <Method void StringBuilder()>
		//  105  244:ldc1            #203 <String "  mMediaSessionToken=">
		//  106  246:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//  107  249:aload_0         
		//  108  250:getfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		//  109  253:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
		//  110  256:invokevirtual   #128 <Method String StringBuilder.toString()>
		//  111  259:invokestatic    #179 <Method int Log.d(String, String)>
		//  112  262:pop             
		//  113  263:return          
		}

		void forceCloseConnection()
		{
			if(mServiceConnection != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #191 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
		//*   2    4:ifnull          18
				mContext.unbindService(((ServiceConnection) (mServiceConnection)));
		//    3    7:aload_0         
		//    4    8:getfield        #98  <Field Context mContext>
		//    5   11:aload_0         
		//    6   12:getfield        #191 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
		//    7   15:invokevirtual   #212 <Method void Context.unbindService(ServiceConnection)>
			mState = 1;
		//    8   18:aload_0         
		//    9   19:iconst_1        
		//   10   20:putfield        #85  <Field int mState>
			mServiceConnection = null;
		//   11   23:aload_0         
		//   12   24:aconst_null     
		//   13   25:putfield        #191 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
			mServiceBinderWrapper = null;
		//   14   28:aload_0         
		//   15   29:aconst_null     
		//   16   30:putfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
			mCallbacksMessenger = null;
		//   17   33:aload_0         
		//   18   34:aconst_null     
		//   19   35:putfield        #137 <Field Messenger mCallbacksMessenger>
			mHandler.setCallbacksMessenger(((Messenger) (null)));
		//   20   38:aload_0         
		//   21   39:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   22   42:aconst_null     
		//   23   43:invokevirtual   #216 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
			mRootId = null;
		//   24   46:aload_0         
		//   25   47:aconst_null     
		//   26   48:putfield        #201 <Field String mRootId>
			mMediaSessionToken = null;
		//   27   51:aload_0         
		//   28   52:aconst_null     
		//   29   53:putfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		//   30   56:return          
		}

		public Bundle getExtras()
		{
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
		//*   2    4:ifne            45
				throw new IllegalStateException((new StringBuilder()).append("getExtras() called while not connected (state=").append(getStateLabel(mState)).append(")").toString());
		//    3    7:new             #157 <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:new             #114 <Class StringBuilder>
		//    6   14:dup             
		//    7   15:invokespecial   #115 <Method void StringBuilder()>
		//    8   18:ldc1            #225 <String "getExtras() called while not connected (state=">
		//    9   20:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   23:aload_0         
		//   11   24:getfield        #85  <Field int mState>
		//   12   27:invokestatic    #161 <Method String getStateLabel(int)>
		//   13   30:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   14   33:ldc1            #163 <String ")">
		//   15   35:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   16   38:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   17   41:invokespecial   #164 <Method void IllegalStateException(String)>
		//   18   44:athrow          
			else
				return mExtras;
		//   19   45:aload_0         
		//   20   46:getfield        #227 <Field Bundle mExtras>
		//   21   49:areturn         
		}

		public void getItem(String s, final ItemCallback cb)
		{
			if(TextUtils.isEmpty(((CharSequence) (s))))
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #239 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   2    4:ifeq            17
				throw new IllegalArgumentException("mediaId is empty");
		//    3    7:new             #87  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #241 <String "mediaId is empty">
		//    6   13:invokespecial   #92  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			if(cb == null)
		//*   8   17:aload_2         
		//*   9   18:ifnonnull       31
				throw new IllegalArgumentException("cb is null");
		//   10   21:new             #87  <Class IllegalArgumentException>
		//   11   24:dup             
		//   12   25:ldc1            #243 <String "cb is null">
		//   13   27:invokespecial   #92  <Method void IllegalArgumentException(String)>
		//   14   30:athrow          
			if(!isConnected())
		//*  15   31:aload_0         
		//*  16   32:invokevirtual   #223 <Method boolean isConnected()>
		//*  17   35:ifne            65
			{
				Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
		//   18   38:ldc1            #139 <String "MediaBrowserCompat">
		//   19   40:ldc1            #245 <String "Not connected, unable to retrieve the MediaItem.">
		//   20   42:invokestatic    #154 <Method int Log.i(String, String)>
		//   21   45:pop             
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
		//   22   46:aload_0         
		//   23   47:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   24   50:new             #17  <Class MediaBrowserCompat$MediaBrowserImplBase$3>
		//   25   53:dup             
		//   26   54:aload_0         
		//   27   55:aload_2         
		//   28   56:aload_1         
		//   29   57:invokespecial   #248 <Method void MediaBrowserCompat$MediaBrowserImplBase$3(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$ItemCallback, String)>
		//   30   60:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   31   63:pop             
				return;
		//   32   64:return          
			}
			ItemReceiver itemreceiver = new ItemReceiver(s, cb, ((Handler) (mHandler)));
		//   33   65:new             #250 <Class MediaBrowserCompat$ItemReceiver>
		//   34   68:dup             
		//   35   69:aload_1         
		//   36   70:aload_2         
		//   37   71:aload_0         
		//   38   72:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   39   75:invokespecial   #253 <Method void MediaBrowserCompat$ItemReceiver(String, MediaBrowserCompat$ItemCallback, Handler)>
		//   40   78:astore_3        
			try
			{
				mServiceBinderWrapper.getMediaItem(s, ((ResultReceiver) (itemreceiver)), mCallbacksMessenger);
		//   41   79:aload_0         
		//   42   80:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   43   83:aload_1         
		//   44   84:aload_3         
		//   45   85:aload_0         
		//   46   86:getfield        #137 <Field Messenger mCallbacksMessenger>
		//   47   89:invokevirtual   #259 <Method void MediaBrowserCompat$ServiceBinderWrapper.getMediaItem(String, ResultReceiver, Messenger)>
				return;
		//   48   92:return          
			}
			catch(RemoteException remoteexception)
		//*  49   93:astore_3        
			{
				Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error getting media item: ").append(s).toString());
		//   50   94:ldc1            #139 <String "MediaBrowserCompat">
		//   51   96:new             #114 <Class StringBuilder>
		//   52   99:dup             
		//   53  100:invokespecial   #115 <Method void StringBuilder()>
		//   54  103:ldc2            #261 <String "Remote error getting media item: ">
		//   55  106:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   56  109:aload_1         
		//   57  110:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   58  113:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   59  116:invokestatic    #154 <Method int Log.i(String, String)>
		//   60  119:pop             
			}
			mHandler.post(((_cls4) (s)). new Runnable() {

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
		//   61  120:aload_0         
		//   62  121:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   63  124:new             #19  <Class MediaBrowserCompat$MediaBrowserImplBase$4>
		//   64  127:dup             
		//   65  128:aload_0         
		//   66  129:aload_2         
		//   67  130:aload_1         
		//   68  131:invokespecial   #262 <Method void MediaBrowserCompat$MediaBrowserImplBase$4(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$ItemCallback, String)>
		//   69  134:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   70  137:pop             
		//   71  138:return          
		}

		public String getRoot()
		{
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
		//*   2    4:ifne            46
				throw new IllegalStateException((new StringBuilder()).append("getRoot() called while not connected(state=").append(getStateLabel(mState)).append(")").toString());
		//    3    7:new             #157 <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:new             #114 <Class StringBuilder>
		//    6   14:dup             
		//    7   15:invokespecial   #115 <Method void StringBuilder()>
		//    8   18:ldc2            #266 <String "getRoot() called while not connected(state=">
		//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   24:aload_0         
		//   11   25:getfield        #85  <Field int mState>
		//   12   28:invokestatic    #161 <Method String getStateLabel(int)>
		//   13   31:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   14   34:ldc1            #163 <String ")">
		//   15   36:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   16   39:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   17   42:invokespecial   #164 <Method void IllegalStateException(String)>
		//   18   45:athrow          
			else
				return mRootId;
		//   19   46:aload_0         
		//   20   47:getfield        #201 <Field String mRootId>
		//   21   50:areturn         
		}

		public ComponentName getServiceComponent()
		{
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
		//*   2    4:ifne            43
				throw new IllegalStateException((new StringBuilder()).append("getServiceComponent() called while not connected (state=").append(mState).append(")").toString());
		//    3    7:new             #157 <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:new             #114 <Class StringBuilder>
		//    6   14:dup             
		//    7   15:invokespecial   #115 <Method void StringBuilder()>
		//    8   18:ldc2            #270 <String "getServiceComponent() called while not connected (state=">
		//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   24:aload_0         
		//   11   25:getfield        #85  <Field int mState>
		//   12   28:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
		//   13   31:ldc1            #163 <String ")">
		//   14   33:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   15   36:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   16   39:invokespecial   #164 <Method void IllegalStateException(String)>
		//   17   42:athrow          
			else
				return mServiceComponent;
		//   18   43:aload_0         
		//   19   44:getfield        #100 <Field ComponentName mServiceComponent>
		//   20   47:areturn         
		}

		public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
		{
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
		//*   2    4:ifne            43
				throw new IllegalStateException((new StringBuilder()).append("getSessionToken() called while not connected(state=").append(mState).append(")").toString());
		//    3    7:new             #157 <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:new             #114 <Class StringBuilder>
		//    6   14:dup             
		//    7   15:invokespecial   #115 <Method void StringBuilder()>
		//    8   18:ldc2            #274 <String "getSessionToken() called while not connected(state=">
		//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   24:aload_0         
		//   11   25:getfield        #85  <Field int mState>
		//   12   28:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
		//   13   31:ldc1            #163 <String ")">
		//   14   33:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   15   36:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   16   39:invokespecial   #164 <Method void IllegalStateException(String)>
		//   17   42:athrow          
			else
				return mMediaSessionToken;
		//   18   43:aload_0         
		//   19   44:getfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		//   20   47:areturn         
		}

		public boolean isConnected()
		{
			return mState == 3;
		//    0    0:aload_0         
		//    1    1:getfield        #85  <Field int mState>
		//    2    4:iconst_3        
		//    3    5:icmpne          10
		//    4    8:iconst_1        
		//    5    9:ireturn         
		//    6   10:iconst_0        
		//    7   11:ireturn         
		}

		public void onConnectionFailed(Messenger messenger)
		{
			Log.e("MediaBrowserCompat", (new StringBuilder()).append("onConnectFailed for ").append(((Object) (mServiceComponent))).toString());
		//    0    0:ldc1            #139 <String "MediaBrowserCompat">
		//    1    2:new             #114 <Class StringBuilder>
		//    2    5:dup             
		//    3    6:invokespecial   #115 <Method void StringBuilder()>
		//    4    9:ldc2            #277 <String "onConnectFailed for ">
		//    5   12:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//    6   15:aload_0         
		//    7   16:getfield        #100 <Field ComponentName mServiceComponent>
		//    8   19:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
		//    9   22:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   10   25:invokestatic    #280 <Method int Log.e(String, String)>
		//   11   28:pop             
			if(!isCurrent(messenger, "onConnectFailed"))
		//*  12   29:aload_0         
		//*  13   30:aload_1         
		//*  14   31:ldc2            #282 <String "onConnectFailed">
		//*  15   34:invokespecial   #284 <Method boolean isCurrent(Messenger, String)>
		//*  16   37:ifne            41
				return;
		//   17   40:return          
			if(mState != 2)
		//*  18   41:aload_0         
		//*  19   42:getfield        #85  <Field int mState>
		//*  20   45:iconst_2        
		//*  21   46:icmpeq          88
			{
				Log.w("MediaBrowserCompat", (new StringBuilder()).append("onConnect from service while mState=").append(getStateLabel(mState)).append("... ignoring").toString());
		//   22   49:ldc1            #139 <String "MediaBrowserCompat">
		//   23   51:new             #114 <Class StringBuilder>
		//   24   54:dup             
		//   25   55:invokespecial   #115 <Method void StringBuilder()>
		//   26   58:ldc2            #286 <String "onConnect from service while mState=">
		//   27   61:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   28   64:aload_0         
		//   29   65:getfield        #85  <Field int mState>
		//   30   68:invokestatic    #161 <Method String getStateLabel(int)>
		//   31   71:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   32   74:ldc2            #288 <String "... ignoring">
		//   33   77:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   34   80:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   35   83:invokestatic    #291 <Method int Log.w(String, String)>
		//   36   86:pop             
				return;
		//   37   87:return          
			} else
			{
				forceCloseConnection();
		//   38   88:aload_0         
		//   39   89:invokevirtual   #293 <Method void forceCloseConnection()>
				mCallback.onConnectionFailed();
		//   40   92:aload_0         
		//   41   93:getfield        #102 <Field MediaBrowserCompat$ConnectionCallback mCallback>
		//   42   96:invokevirtual   #297 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
				return;
		//   43   99:return          
			}
		}

		public void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle)
		{
			if(isCurrent(messenger, "onLoadChildren")) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc2            #300 <String "onLoadChildren">
		//    3    5:invokespecial   #284 <Method boolean isCurrent(Messenger, String)>
		//    4    8:ifne            12
_L1:
			return;
		//    5   11:return          
_L2:
			if(MediaBrowserCompat.DEBUG)
		//*   6   12:getstatic       #304 <Field boolean MediaBrowserCompat.DEBUG>
		//*   7   15:ifeq            57
				Log.d("MediaBrowserCompat", (new StringBuilder()).append("onLoadChildren for ").append(((Object) (mServiceComponent))).append(" id=").append(s).toString());
		//    8   18:ldc1            #139 <String "MediaBrowserCompat">
		//    9   20:new             #114 <Class StringBuilder>
		//   10   23:dup             
		//   11   24:invokespecial   #115 <Method void StringBuilder()>
		//   12   27:ldc2            #306 <String "onLoadChildren for ">
		//   13   30:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   14   33:aload_0         
		//   15   34:getfield        #100 <Field ComponentName mServiceComponent>
		//   16   37:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
		//   17   40:ldc2            #308 <String " id=">
		//   18   43:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   19   46:aload_2         
		//   20   47:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   21   50:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   22   53:invokestatic    #179 <Method int Log.d(String, String)>
		//   23   56:pop             
			messenger = ((Messenger) ((Subscription)mSubscriptions.get(((Object) (s)))));
		//   24   57:aload_0         
		//   25   58:getfield        #83  <Field ArrayMap mSubscriptions>
		//   26   61:aload_2         
		//   27   62:invokevirtual   #312 <Method Object ArrayMap.get(Object)>
		//   28   65:checkcast       #314 <Class MediaBrowserCompat$Subscription>
		//   29   68:astore_1        
			if(messenger != null)
				break; /* Loop/switch isn't completed */
		//   30   69:aload_1         
		//   31   70:ifnonnull       106
			if(MediaBrowserCompat.DEBUG)
		//*  32   73:getstatic       #304 <Field boolean MediaBrowserCompat.DEBUG>
		//*  33   76:ifeq            11
			{
				Log.d("MediaBrowserCompat", (new StringBuilder()).append("onLoadChildren for id that isn't subscribed id=").append(s).toString());
		//   34   79:ldc1            #139 <String "MediaBrowserCompat">
		//   35   81:new             #114 <Class StringBuilder>
		//   36   84:dup             
		//   37   85:invokespecial   #115 <Method void StringBuilder()>
		//   38   88:ldc2            #316 <String "onLoadChildren for id that isn't subscribed id=">
		//   39   91:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   40   94:aload_2         
		//   41   95:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   42   98:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   43  101:invokestatic    #179 <Method int Log.d(String, String)>
		//   44  104:pop             
				return;
		//   45  105:return          
			}
			if(true) goto _L1; else goto _L3
_L3:
			messenger = ((Messenger) (((Subscription) (messenger)).getCallback(mContext, bundle)));
		//   46  106:aload_1         
		//   47  107:aload_0         
		//   48  108:getfield        #98  <Field Context mContext>
		//   49  111:aload           4
		//   50  113:invokevirtual   #320 <Method MediaBrowserCompat$SubscriptionCallback MediaBrowserCompat$Subscription.getCallback(Context, Bundle)>
		//   51  116:astore_1        
			if(messenger != null)
		//*  52  117:aload_1         
		//*  53  118:ifnull          11
			{
				if(bundle == null)
		//*  54  121:aload           4
		//*  55  123:ifnonnull       143
					if(list == null)
		//*  56  126:aload_3         
		//*  57  127:ifnonnull       136
					{
						((SubscriptionCallback) (messenger)).onError(s);
		//   58  130:aload_1         
		//   59  131:aload_2         
		//   60  132:invokevirtual   #325 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
						return;
		//   61  135:return          
					} else
					{
						((SubscriptionCallback) (messenger)).onChildrenLoaded(s, list);
		//   62  136:aload_1         
		//   63  137:aload_2         
		//   64  138:aload_3         
		//   65  139:invokevirtual   #329 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
						return;
		//   66  142:return          
					}
				if(list == null)
		//*  67  143:aload_3         
		//*  68  144:ifnonnull       155
				{
					((SubscriptionCallback) (messenger)).onError(s, bundle);
		//   69  147:aload_1         
		//   70  148:aload_2         
		//   71  149:aload           4
		//   72  151:invokevirtual   #332 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
					return;
		//   73  154:return          
				} else
				{
					((SubscriptionCallback) (messenger)).onChildrenLoaded(s, list, bundle);
		//   74  155:aload_1         
		//   75  156:aload_2         
		//   76  157:aload_3         
		//   77  158:aload           4
		//   78  160:invokevirtual   #335 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
					return;
		//   79  163:return          
				}
			}
			if(true) goto _L1; else goto _L4
_L4:
		}

		public void onServiceConnected(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
		{
			if(isCurrent(messenger, "onConnect")) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc2            #339 <String "onConnect">
		//    3    5:invokespecial   #284 <Method boolean isCurrent(Messenger, String)>
		//    4    8:ifne            12
_L1:
			return;
		//    5   11:return          
_L2:
			if(mState != 2)
		//*   6   12:aload_0         
		//*   7   13:getfield        #85  <Field int mState>
		//*   8   16:iconst_2        
		//*   9   17:icmpeq          59
			{
				Log.w("MediaBrowserCompat", (new StringBuilder()).append("onConnect from service while mState=").append(getStateLabel(mState)).append("... ignoring").toString());
		//   10   20:ldc1            #139 <String "MediaBrowserCompat">
		//   11   22:new             #114 <Class StringBuilder>
		//   12   25:dup             
		//   13   26:invokespecial   #115 <Method void StringBuilder()>
		//   14   29:ldc2            #286 <String "onConnect from service while mState=">
		//   15   32:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   16   35:aload_0         
		//   17   36:getfield        #85  <Field int mState>
		//   18   39:invokestatic    #161 <Method String getStateLabel(int)>
		//   19   42:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   20   45:ldc2            #288 <String "... ignoring">
		//   21   48:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   22   51:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   23   54:invokestatic    #291 <Method int Log.w(String, String)>
		//   24   57:pop             
				return;
		//   25   58:return          
			}
			mRootId = s;
		//   26   59:aload_0         
		//   27   60:aload_2         
		//   28   61:putfield        #201 <Field String mRootId>
			mMediaSessionToken = token;
		//   29   64:aload_0         
		//   30   65:aload_3         
		//   31   66:putfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
			mExtras = bundle;
		//   32   69:aload_0         
		//   33   70:aload           4
		//   34   72:putfield        #227 <Field Bundle mExtras>
			mState = 3;
		//   35   75:aload_0         
		//   36   76:iconst_3        
		//   37   77:putfield        #85  <Field int mState>
			if(MediaBrowserCompat.DEBUG)
		//*  38   80:getstatic       #304 <Field boolean MediaBrowserCompat.DEBUG>
		//*  39   83:ifeq            99
			{
				Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
		//   40   86:ldc1            #139 <String "MediaBrowserCompat">
		//   41   88:ldc2            #341 <String "ServiceCallbacks.onConnect...">
		//   42   91:invokestatic    #179 <Method int Log.d(String, String)>
		//   43   94:pop             
				dump();
		//   44   95:aload_0         
		//   45   96:invokevirtual   #343 <Method void dump()>
			}
			mCallback.onConnected();
		//   46   99:aload_0         
		//   47  100:getfield        #102 <Field MediaBrowserCompat$ConnectionCallback mCallback>
		//   48  103:invokevirtual   #346 <Method void MediaBrowserCompat$ConnectionCallback.onConnected()>
			messenger = ((Messenger) (mSubscriptions.entrySet().iterator()));
		//   49  106:aload_0         
		//   50  107:getfield        #83  <Field ArrayMap mSubscriptions>
		//   51  110:invokevirtual   #350 <Method Set ArrayMap.entrySet()>
		//   52  113:invokeinterface #356 <Method Iterator Set.iterator()>
		//   53  118:astore_1        
_L4:
			if(!((Iterator) (messenger)).hasNext())
				continue; /* Loop/switch isn't completed */
		//   54  119:aload_1         
		//   55  120:invokeinterface #361 <Method boolean Iterator.hasNext()>
		//   56  125:ifeq            11
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) ((java.util.Map.Entry)((Iterator) (messenger)).next()));
		//   57  128:aload_1         
		//   58  129:invokeinterface #365 <Method Object Iterator.next()>
		//   59  134:checkcast       #367 <Class java.util.Map$Entry>
		//   60  137:astore_3        
			s = (String)((java.util.Map.Entry) (token)).getKey();
		//   61  138:aload_3         
		//   62  139:invokeinterface #370 <Method Object java.util.Map$Entry.getKey()>
		//   63  144:checkcast       #372 <Class String>
		//   64  147:astore_2        
			bundle = ((Bundle) ((Subscription)((java.util.Map.Entry) (token)).getValue()));
		//   65  148:aload_3         
		//   66  149:invokeinterface #375 <Method Object java.util.Map$Entry.getValue()>
		//   67  154:checkcast       #314 <Class MediaBrowserCompat$Subscription>
		//   68  157:astore          4
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) (((Subscription) (bundle)).getCallbacks()));
		//   69  159:aload           4
		//   70  161:invokevirtual   #379 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
		//   71  164:astore_3        
			bundle = ((Bundle) (((Subscription) (bundle)).getOptionsList()));
		//   72  165:aload           4
		//   73  167:invokevirtual   #382 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
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
		//   79  178:invokeinterface #388 <Method int List.size()>
		//   80  183:icmpge          119
					mServiceBinderWrapper.addSubscription(s, ((SubscriptionCallback)((List) (token)).get(i)).mToken, (Bundle)((List) (bundle)).get(i), mCallbacksMessenger);
		//   81  186:aload_0         
		//   82  187:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   83  190:aload_2         
		//   84  191:aload_3         
		//   85  192:iload           5
		//   86  194:invokeinterface #391 <Method Object List.get(int)>
		//   87  199:checkcast       #322 <Class MediaBrowserCompat$SubscriptionCallback>
		//   88  202:invokestatic    #395 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
		//   89  205:aload           4
		//   90  207:iload           5
		//   91  209:invokeinterface #391 <Method Object List.get(int)>
		//   92  214:checkcast       #106 <Class Bundle>
		//   93  217:aload_0         
		//   94  218:getfield        #137 <Field Messenger mCallbacksMessenger>
		//   95  221:invokevirtual   #399 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
				}
		//*  96  224:iload           5
		//*  97  226:iconst_1        
		//*  98  227:iadd            
		//*  99  228:istore          5
		//* 100  230:goto            175
				// Misplaced declaration of an exception variable
				catch(Messenger messenger)
		//* 101  233:astore_1        
				{
					Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
		//  102  234:ldc1            #139 <String "MediaBrowserCompat">
		//  103  236:ldc2            #401 <String "addSubscription failed with RemoteException.">
		//  104  239:invokestatic    #179 <Method int Log.d(String, String)>
		//  105  242:pop             
					return;
		//  106  243:return          
				}
				i++;
			} while(true);
			if(true) goto _L4; else goto _L3
_L3:
			if(true) goto _L1; else goto _L5
_L5:
		}

		public void search(final String query, Bundle bundle, final SearchCallback callback)
		{
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
		//*   2    4:ifne            46
				throw new IllegalStateException((new StringBuilder()).append("search() called while not connected (state=").append(getStateLabel(mState)).append(")").toString());
		//    3    7:new             #157 <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:new             #114 <Class StringBuilder>
		//    6   14:dup             
		//    7   15:invokespecial   #115 <Method void StringBuilder()>
		//    8   18:ldc2            #405 <String "search() called while not connected (state=">
		//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   24:aload_0         
		//   11   25:getfield        #85  <Field int mState>
		//   12   28:invokestatic    #161 <Method String getStateLabel(int)>
		//   13   31:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   14   34:ldc1            #163 <String ")">
		//   15   36:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   16   39:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   17   42:invokespecial   #164 <Method void IllegalStateException(String)>
		//   18   45:athrow          
			SearchResultReceiver searchresultreceiver = new SearchResultReceiver(query, bundle, callback, ((Handler) (mHandler)));
		//   19   46:new             #407 <Class MediaBrowserCompat$SearchResultReceiver>
		//   20   49:dup             
		//   21   50:aload_1         
		//   22   51:aload_2         
		//   23   52:aload_3         
		//   24   53:aload_0         
		//   25   54:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   26   57:invokespecial   #410 <Method void MediaBrowserCompat$SearchResultReceiver(String, Bundle, MediaBrowserCompat$SearchCallback, Handler)>
		//   27   60:astore          4
			try
			{
				mServiceBinderWrapper.search(query, bundle, ((ResultReceiver) (searchresultreceiver)), mCallbacksMessenger);
		//   28   62:aload_0         
		//   29   63:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   30   66:aload_1         
		//   31   67:aload_2         
		//   32   68:aload           4
		//   33   70:aload_0         
		//   34   71:getfield        #137 <Field Messenger mCallbacksMessenger>
		//   35   74:invokevirtual   #413 <Method void MediaBrowserCompat$ServiceBinderWrapper.search(String, Bundle, ResultReceiver, Messenger)>
				return;
		//   36   77:return          
			}
			catch(RemoteException remoteexception)
		//*  37   78:astore          4
			{
				Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error searching items with query: ").append(query).toString(), ((Throwable) (remoteexception)));
		//   38   80:ldc1            #139 <String "MediaBrowserCompat">
		//   39   82:new             #114 <Class StringBuilder>
		//   40   85:dup             
		//   41   86:invokespecial   #115 <Method void StringBuilder()>
		//   42   89:ldc2            #415 <String "Remote error searching items with query: ">
		//   43   92:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   44   95:aload_1         
		//   45   96:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   46   99:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   47  102:aload           4
		//   48  104:invokestatic    #418 <Method int Log.i(String, String, Throwable)>
		//   49  107:pop             
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
		//   50  108:aload_0         
		//   51  109:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   52  112:new             #21  <Class MediaBrowserCompat$MediaBrowserImplBase$5>
		//   53  115:dup             
		//   54  116:aload_0         
		//   55  117:aload_3         
		//   56  118:aload_1         
		//   57  119:aload_2         
		//   58  120:invokespecial   #421 <Method void MediaBrowserCompat$MediaBrowserImplBase$5(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$SearchCallback, String, Bundle)>
		//   59  123:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   60  126:pop             
		//   61  127:return          
		}

		public void sendCustomAction(final String action, Bundle bundle, final CustomActionCallback callback)
		{
			CustomActionResultReceiver customactionresultreceiver;
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
		//*   2    4:ifne            63
				throw new IllegalStateException((new StringBuilder()).append("Cannot send a custom action (").append(action).append(") with ").append("extras ").append(((Object) (bundle))).append(" because the browser is not connected to the ").append("service.").toString());
		//    3    7:new             #157 <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:new             #114 <Class StringBuilder>
		//    6   14:dup             
		//    7   15:invokespecial   #115 <Method void StringBuilder()>
		//    8   18:ldc2            #425 <String "Cannot send a custom action (">
		//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   24:aload_1         
		//   11   25:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   12   28:ldc2            #427 <String ") with ">
		//   13   31:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   14   34:ldc2            #429 <String "extras ">
		//   15   37:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   16   40:aload_2         
		//   17   41:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
		//   18   44:ldc2            #431 <String " because the browser is not connected to the ">
		//   19   47:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   20   50:ldc2            #433 <String "service.">
		//   21   53:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   22   56:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   23   59:invokespecial   #164 <Method void IllegalStateException(String)>
		//   24   62:athrow          
			customactionresultreceiver = new CustomActionResultReceiver(action, bundle, callback, ((Handler) (mHandler)));
		//   25   63:new             #435 <Class MediaBrowserCompat$CustomActionResultReceiver>
		//   26   66:dup             
		//   27   67:aload_1         
		//   28   68:aload_2         
		//   29   69:aload_3         
		//   30   70:aload_0         
		//   31   71:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   32   74:invokespecial   #438 <Method void MediaBrowserCompat$CustomActionResultReceiver(String, Bundle, MediaBrowserCompat$CustomActionCallback, Handler)>
		//   33   77:astore          4
			mServiceBinderWrapper.sendCustomAction(action, bundle, ((ResultReceiver) (customactionresultreceiver)), mCallbacksMessenger);
		//   34   79:aload_0         
		//   35   80:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   36   83:aload_1         
		//   37   84:aload_2         
		//   38   85:aload           4
		//   39   87:aload_0         
		//   40   88:getfield        #137 <Field Messenger mCallbacksMessenger>
		//   41   91:invokevirtual   #440 <Method void MediaBrowserCompat$ServiceBinderWrapper.sendCustomAction(String, Bundle, ResultReceiver, Messenger)>
_L1:
			return;
		//   42   94:return          
			RemoteException remoteexception;
			remoteexception;
		//   43   95:astore          4
			Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error sending a custom action: action=").append(action).append(", extras=").append(((Object) (bundle))).toString(), ((Throwable) (remoteexception)));
		//   44   97:ldc1            #139 <String "MediaBrowserCompat">
		//   45   99:new             #114 <Class StringBuilder>
		//   46  102:dup             
		//   47  103:invokespecial   #115 <Method void StringBuilder()>
		//   48  106:ldc2            #442 <String "Remote error sending a custom action: action=">
		//   49  109:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   50  112:aload_1         
		//   51  113:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   52  116:ldc2            #444 <String ", extras=">
		//   53  119:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   54  122:aload_2         
		//   55  123:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
		//   56  126:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   57  129:aload           4
		//   58  131:invokestatic    #418 <Method int Log.i(String, String, Throwable)>
		//   59  134:pop             
			if(callback != null)
		//*  60  135:aload_3         
		//*  61  136:ifnull          94
			{
				mHandler.post(((_cls6) (bundle)). new Runnable() {

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

					final MediaBrowserImplBase this$0;
					final String val$action;
					final CustomActionCallback val$callback;
					final Bundle val$extras;

			
			{
				this$0 = final_mediabrowserimplbase;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				callback = customactioncallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field MediaBrowserCompat$CustomActionCallback val$callback>
				action = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String val$action>
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
		//   62  139:aload_0         
		//   63  140:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   64  143:new             #23  <Class MediaBrowserCompat$MediaBrowserImplBase$6>
		//   65  146:dup             
		//   66  147:aload_0         
		//   67  148:aload_3         
		//   68  149:aload_1         
		//   69  150:aload_2         
		//   70  151:invokespecial   #447 <Method void MediaBrowserCompat$MediaBrowserImplBase$6(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$CustomActionCallback, String, Bundle)>
		//   71  154:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   72  157:pop             
				return;
		//   73  158:return          
			}
			  goto _L1
		}

		public void subscribe(String s, Bundle bundle, SubscriptionCallback subscriptioncallback)
		{
			Subscription subscription1 = (Subscription)mSubscriptions.get(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #83  <Field ArrayMap mSubscriptions>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #312 <Method Object ArrayMap.get(Object)>
		//    4    8:checkcast       #314 <Class MediaBrowserCompat$Subscription>
		//    5   11:astore          5
			Subscription subscription = subscription1;
		//    6   13:aload           5
		//    7   15:astore          4
			if(subscription1 == null)
		//*   8   17:aload           5
		//*   9   19:ifnonnull       42
			{
				subscription = new Subscription();
		//   10   22:new             #314 <Class MediaBrowserCompat$Subscription>
		//   11   25:dup             
		//   12   26:invokespecial   #450 <Method void MediaBrowserCompat$Subscription()>
		//   13   29:astore          4
				mSubscriptions.put(((Object) (s)), ((Object) (subscription)));
		//   14   31:aload_0         
		//   15   32:getfield        #83  <Field ArrayMap mSubscriptions>
		//   16   35:aload_1         
		//   17   36:aload           4
		//   18   38:invokevirtual   #454 <Method Object ArrayMap.put(Object, Object)>
		//   19   41:pop             
			}
			if(bundle == null)
		//*  20   42:aload_2         
		//*  21   43:ifnonnull       84
				bundle = null;
		//   22   46:aconst_null     
		//   23   47:astore_2        
			else
		//*  24   48:aload           4
		//*  25   50:aload_0         
		//*  26   51:getfield        #98  <Field Context mContext>
		//*  27   54:aload_2         
		//*  28   55:aload_3         
		//*  29   56:invokevirtual   #458 <Method void MediaBrowserCompat$Subscription.putCallback(Context, Bundle, MediaBrowserCompat$SubscriptionCallback)>
		//*  30   59:aload_0         
		//*  31   60:invokevirtual   #223 <Method boolean isConnected()>
		//*  32   63:ifeq            83
		//*  33   66:aload_0         
		//*  34   67:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//*  35   70:aload_1         
		//*  36   71:aload_3         
		//*  37   72:invokestatic    #395 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
		//*  38   75:aload_2         
		//*  39   76:aload_0         
		//*  40   77:getfield        #137 <Field Messenger mCallbacksMessenger>
		//*  41   80:invokevirtual   #399 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
		//*  42   83:return          
				bundle = new Bundle(bundle);
		//   43   84:new             #106 <Class Bundle>
		//   44   87:dup             
		//   45   88:aload_2         
		//   46   89:invokespecial   #109 <Method void Bundle(Bundle)>
		//   47   92:astore_2        
			subscription.putCallback(mContext, bundle, subscriptioncallback);
			if(!isConnected())
				break MISSING_BLOCK_LABEL_83;
			mServiceBinderWrapper.addSubscription(s, subscriptioncallback.mToken, bundle, mCallbacksMessenger);
			return;
		//*  48   93:goto            48
			bundle;
		//   49   96:astore_2        
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("addSubscription failed with RemoteException parentId=").append(s).toString());
		//   50   97:ldc1            #139 <String "MediaBrowserCompat">
		//   51   99:new             #114 <Class StringBuilder>
		//   52  102:dup             
		//   53  103:invokespecial   #115 <Method void StringBuilder()>
		//   54  106:ldc2            #460 <String "addSubscription failed with RemoteException parentId=">
		//   55  109:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   56  112:aload_1         
		//   57  113:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   58  116:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   59  119:invokestatic    #179 <Method int Log.d(String, String)>
		//   60  122:pop             
			return;
		//   61  123:return          
		}

		public void unsubscribe(String s, SubscriptionCallback subscriptioncallback)
		{
			Subscription subscription = (Subscription)mSubscriptions.get(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #83  <Field ArrayMap mSubscriptions>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #312 <Method Object ArrayMap.get(Object)>
		//    4    8:checkcast       #314 <Class MediaBrowserCompat$Subscription>
		//    5   11:astore          4
			if(subscription != null) goto _L2; else goto _L1
		//    6   13:aload           4
		//    7   15:ifnonnull       19
_L1:
			return;
		//    8   18:return          
_L2:
			if(subscriptioncallback != null) goto _L4; else goto _L3
		//    9   19:aload_2         
		//   10   20:ifnonnull       65
_L3:
			int i;
			List list;
			List list1;
			try
			{
				if(isConnected())
		//*  11   23:aload_0         
		//*  12   24:invokevirtual   #223 <Method boolean isConnected()>
		//*  13   27:ifeq            43
					mServiceBinderWrapper.removeSubscription(s, ((IBinder) (null)), mCallbacksMessenger);
		//   14   30:aload_0         
		//   15   31:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   16   34:aload_1         
		//   17   35:aconst_null     
		//   18   36:aload_0         
		//   19   37:getfield        #137 <Field Messenger mCallbacksMessenger>
		//   20   40:invokevirtual   #466 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
			}
		//*  21   43:aload           4
		//*  22   45:invokevirtual   #468 <Method boolean MediaBrowserCompat$Subscription.isEmpty()>
		//*  23   48:ifne            55
		//*  24   51:aload_2         
		//*  25   52:ifnonnull       18
		//*  26   55:aload_0         
		//*  27   56:getfield        #83  <Field ArrayMap mSubscriptions>
		//*  28   59:aload_1         
		//*  29   60:invokevirtual   #471 <Method Object ArrayMap.remove(Object)>
		//*  30   63:pop             
		//*  31   64:return          
		//*  32   65:aload           4
		//*  33   67:invokevirtual   #379 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
		//*  34   70:astore          5
		//*  35   72:aload           4
		//*  36   74:invokevirtual   #382 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
		//*  37   77:astore          6
		//*  38   79:aload           5
		//*  39   81:invokeinterface #388 <Method int List.size()>
		//*  40   86:iconst_1        
		//*  41   87:isub            
		//*  42   88:istore_3        
		//*  43   89:iload_3         
		//*  44   90:iflt            43
		//*  45   93:aload           5
		//*  46   95:iload_3         
		//*  47   96:invokeinterface #391 <Method Object List.get(int)>
		//*  48  101:aload_2         
		//*  49  102:if_acmpne       146
		//*  50  105:aload_0         
		//*  51  106:invokevirtual   #223 <Method boolean isConnected()>
		//*  52  109:ifeq            128
		//*  53  112:aload_0         
		//*  54  113:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//*  55  116:aload_1         
		//*  56  117:aload_2         
		//*  57  118:invokestatic    #395 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
		//*  58  121:aload_0         
		//*  59  122:getfield        #137 <Field Messenger mCallbacksMessenger>
		//*  60  125:invokevirtual   #466 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
		//*  61  128:aload           5
		//*  62  130:iload_3         
		//*  63  131:invokeinterface #473 <Method Object List.remove(int)>
		//*  64  136:pop             
		//*  65  137:aload           6
		//*  66  139:iload_3         
		//*  67  140:invokeinterface #473 <Method Object List.remove(int)>
		//*  68  145:pop             
		//*  69  146:iload_3         
		//*  70  147:iconst_1        
		//*  71  148:isub            
		//*  72  149:istore_3        
		//*  73  150:goto            89
			catch(RemoteException remoteexception)
		//*  74  153:astore          5
			{
				Log.d("MediaBrowserCompat", (new StringBuilder()).append("removeSubscription failed with RemoteException parentId=").append(s).toString());
		//   75  155:ldc1            #139 <String "MediaBrowserCompat">
		//   76  157:new             #114 <Class StringBuilder>
		//   77  160:dup             
		//   78  161:invokespecial   #115 <Method void StringBuilder()>
		//   79  164:ldc2            #475 <String "removeSubscription failed with RemoteException parentId=">
		//   80  167:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   81  170:aload_1         
		//   82  171:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   83  174:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   84  177:invokestatic    #179 <Method int Log.d(String, String)>
		//   85  180:pop             
			}
			if(subscription.isEmpty() || subscriptioncallback == null)
			{
				mSubscriptions.remove(((Object) (s)));
				return;
			}
			  goto _L5
_L4:
			list = subscription.getCallbacks();
			list1 = subscription.getOptionsList();
			i = list.size() - 1;
_L8:
			if(i < 0) goto _L7; else goto _L6
_L6:
			if(list.get(i) == subscriptioncallback)
			{
				if(isConnected())
					mServiceBinderWrapper.removeSubscription(s, subscriptioncallback.mToken, mCallbacksMessenger);
				list.remove(i);
				list1.remove(i);
			}
			i--;
			if(true) goto _L8; else goto _L7
_L7:
			if(false)
				break MISSING_BLOCK_LABEL_149;
			else
				break MISSING_BLOCK_LABEL_43;
_L5:
			if(true) goto _L1; else goto _L9
_L9:
		//*  86  181:goto            43
		}

		static final int CONNECT_STATE_CONNECTED = 3;
		static final int CONNECT_STATE_CONNECTING = 2;
		static final int CONNECT_STATE_DISCONNECTED = 1;
		static final int CONNECT_STATE_DISCONNECTING = 0;
		static final int CONNECT_STATE_SUSPENDED = 4;
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
		//    1    1:invokespecial   #71  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #73  <Class MediaBrowserCompat$CallbackHandler>
		//    4    8:dup             
		//    5    9:aload_0         
		//    6   10:invokespecial   #76  <Method void MediaBrowserCompat$CallbackHandler(MediaBrowserCompat$MediaBrowserServiceCallbackImpl)>
		//    7   13:putfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//    8   16:aload_0         
		//    9   17:new             #80  <Class ArrayMap>
		//   10   20:dup             
		//   11   21:invokespecial   #81  <Method void ArrayMap()>
		//   12   24:putfield        #83  <Field ArrayMap mSubscriptions>
			mState = 1;
		//   13   27:aload_0         
		//   14   28:iconst_1        
		//   15   29:putfield        #85  <Field int mState>
			if(context == null)
		//*  16   32:aload_1         
		//*  17   33:ifnonnull       46
				throw new IllegalArgumentException("context must not be null");
		//   18   36:new             #87  <Class IllegalArgumentException>
		//   19   39:dup             
		//   20   40:ldc1            #89  <String "context must not be null">
		//   21   42:invokespecial   #92  <Method void IllegalArgumentException(String)>
		//   22   45:athrow          
			if(componentname == null)
		//*  23   46:aload_2         
		//*  24   47:ifnonnull       60
				throw new IllegalArgumentException("service component must not be null");
		//   25   50:new             #87  <Class IllegalArgumentException>
		//   26   53:dup             
		//   27   54:ldc1            #94  <String "service component must not be null">
		//   28   56:invokespecial   #92  <Method void IllegalArgumentException(String)>
		//   29   59:athrow          
			if(connectioncallback == null)
		//*  30   60:aload_3         
		//*  31   61:ifnonnull       74
				throw new IllegalArgumentException("connection callback must not be null");
		//   32   64:new             #87  <Class IllegalArgumentException>
		//   33   67:dup             
		//   34   68:ldc1            #96  <String "connection callback must not be null">
		//   35   70:invokespecial   #92  <Method void IllegalArgumentException(String)>
		//   36   73:athrow          
			mContext = context;
		//   37   74:aload_0         
		//   38   75:aload_1         
		//   39   76:putfield        #98  <Field Context mContext>
			mServiceComponent = componentname;
		//   40   79:aload_0         
		//   41   80:aload_2         
		//   42   81:putfield        #100 <Field ComponentName mServiceComponent>
			mCallback = connectioncallback;
		//   43   84:aload_0         
		//   44   85:aload_3         
		//   45   86:putfield        #102 <Field MediaBrowserCompat$ConnectionCallback mCallback>
			if(bundle == null)
		//*  46   89:aload           4
		//*  47   91:ifnonnull       102
				context = null;
		//   48   94:aconst_null     
		//   49   95:astore_1        
			else
		//*  50   96:aload_0         
		//*  51   97:aload_1         
		//*  52   98:putfield        #104 <Field Bundle mRootHints>
		//*  53  101:return          
				context = ((Context) (new Bundle(bundle)));
		//   54  102:new             #106 <Class Bundle>
		//   55  105:dup             
		//   56  106:aload           4
		//   57  108:invokespecial   #109 <Method void Bundle(Bundle)>
		//   58  111:astore_1        
			mRootHints = ((Bundle) (context));
		//*  59  112:goto            96
		}
	}

	private class MediaBrowserImplBase.MediaServiceConnection
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
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_2        
			if(mServiceConnection != this || mState == 0 || mState == 1)
		//*   2    2:aload_0         
		//*   3    3:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*   4    6:getfield        #64  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
		//*   5    9:aload_0         
		//*   6   10:if_acmpne       34
		//*   7   13:aload_0         
		//*   8   14:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*   9   17:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		//*  10   20:ifeq            34
		//*  11   23:aload_0         
		//*  12   24:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*  13   27:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		//*  14   30:iconst_1        
		//*  15   31:icmpne          116
			{
				if(mState != 0 && mState != 1)
		//*  16   34:aload_0         
		//*  17   35:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*  18   38:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		//*  19   41:ifeq            114
		//*  20   44:aload_0         
		//*  21   45:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*  22   48:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		//*  23   51:iconst_1        
		//*  24   52:icmpeq          114
					Log.i("MediaBrowserCompat", (new StringBuilder()).append(s).append(" for ").append(((Object) (mServiceComponent))).append(" with mServiceConnection=").append(((Object) (mServiceConnection))).append(" this=").append(((Object) (this))).toString());
		//   25   55:ldc1            #70  <String "MediaBrowserCompat">
		//   26   57:new             #72  <Class StringBuilder>
		//   27   60:dup             
		//   28   61:invokespecial   #73  <Method void StringBuilder()>
		//   29   64:aload_1         
		//   30   65:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   31   68:ldc1            #79  <String " for ">
		//   32   70:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   33   73:aload_0         
		//   34   74:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//   35   77:getfield        #83  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
		//   36   80:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
		//   37   83:ldc1            #88  <String " with mServiceConnection=">
		//   38   85:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   39   88:aload_0         
		//   40   89:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//   41   92:getfield        #64  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
		//   42   95:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
		//   43   98:ldc1            #90  <String " this=">
		//   44  100:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   45  103:aload_0         
		//   46  104:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
		//   47  107:invokevirtual   #94  <Method String StringBuilder.toString()>
		//   48  110:invokestatic    #100 <Method int Log.i(String, String)>
		//   49  113:pop             
				flag = false;
		//   50  114:iconst_0        
		//   51  115:istore_2        
			}
			return flag;
		//   52  116:iload_2         
		//   53  117:ireturn         
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
					if(isCurrent("onServiceConnected"))
				//*  23   56:aload_0         
				//*  24   57:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//*  25   60:ldc1            #76  <String "onServiceConnected">
				//*  26   62:invokevirtual   #80  <Method boolean MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.isCurrent(String)>
				//*  27   65:ifne            69
				//*  28   68:return          
					{
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
						mState = 2;
				//   62  150:aload_0         
				//   63  151:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   64  154:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   65  157:iconst_2        
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
				//* 107  257:ifeq            68
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
							return;
				//  116  278:return          
						}
					}
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
						mState = 4;
				//   51  120:aload_0         
				//   52  121:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   53  124:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   54  127:iconst_4        
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
			if(list != null && android.os.Build.VERSION.SDK_INT >= 21) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:ifnull          12
		//    2    4:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
		//    3    7:bipush          21
		//    4    9:icmpge          16
_L1:
			list = null;
		//    5   12:aconst_null     
		//    6   13:astore_0        
_L4:
			return list;
		//    7   14:aload_0         
		//    8   15:areturn         
_L2:
			ArrayList arraylist = new ArrayList(list.size());
		//    9   16:new             #103 <Class ArrayList>
		//   10   19:dup             
		//   11   20:aload_0         
		//   12   21:invokeinterface #108 <Method int List.size()>
		//   13   26:invokespecial   #111 <Method void ArrayList(int)>
		//   14   29:astore_1        
			Iterator iterator = list.iterator();
		//   15   30:aload_0         
		//   16   31:invokeinterface #115 <Method Iterator List.iterator()>
		//   17   36:astore_2        
			do
			{
				list = ((List) (arraylist));
		//   18   37:aload_1         
		//   19   38:astore_0        
				if(!iterator.hasNext())
					continue;
		//   20   39:aload_2         
		//   21   40:invokeinterface #121 <Method boolean Iterator.hasNext()>
		//   22   45:ifeq            14
				((List) (arraylist)).add(((Object) (fromMediaItem(iterator.next()))));
		//   23   48:aload_1         
		//   24   49:aload_2         
		//   25   50:invokeinterface #125 <Method Object Iterator.next()>
		//   26   55:invokestatic    #127 <Method MediaBrowserCompat$MediaItem fromMediaItem(Object)>
		//   27   58:invokeinterface #131 <Method boolean List.add(Object)>
		//   28   63:pop             
			} while(true);
		//   29   64:goto            37
			if(true) goto _L4; else goto _L3
_L3:
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

	private static class SearchResultReceiver extends ResultReceiver
	{

		protected void onReceiveResult(int i, Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_2         
		//*   1    1:ifnull          13
				bundle.setClassLoader(((Class) (android/support/v4/media/MediaBrowserCompat)).getClassLoader());
		//    2    4:aload_2         
		//    3    5:ldc1            #6   <Class MediaBrowserCompat>
		//    4    7:invokevirtual   #33  <Method ClassLoader Class.getClassLoader()>
		//    5   10:invokevirtual   #39  <Method void Bundle.setClassLoader(ClassLoader)>
			if(i != 0 || bundle == null || !bundle.containsKey("search_results"))
		//*   6   13:iload_1         
		//*   7   14:ifne            30
		//*   8   17:aload_2         
		//*   9   18:ifnull          30
		//*  10   21:aload_2         
		//*  11   22:ldc1            #41  <String "search_results">
		//*  12   24:invokevirtual   #45  <Method boolean Bundle.containsKey(String)>
		//*  13   27:ifne            46
			{
				mCallback.onError(mQuery, mExtras);
		//   14   30:aload_0         
		//   15   31:getfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
		//   16   34:aload_0         
		//   17   35:getfield        #20  <Field String mQuery>
		//   18   38:aload_0         
		//   19   39:getfield        #22  <Field Bundle mExtras>
		//   20   42:invokevirtual   #51  <Method void MediaBrowserCompat$SearchCallback.onError(String, Bundle)>
				return;
		//   21   45:return          
			}
			Parcelable aparcelable[] = bundle.getParcelableArray("search_results");
		//   22   46:aload_2         
		//   23   47:ldc1            #41  <String "search_results">
		//   24   49:invokevirtual   #55  <Method Parcelable[] Bundle.getParcelableArray(String)>
		//   25   52:astore          5
			bundle = null;
		//   26   54:aconst_null     
		//   27   55:astore_2        
			if(aparcelable != null)
		//*  28   56:aload           5
		//*  29   58:ifnull          106
			{
				ArrayList arraylist = new ArrayList();
		//   30   61:new             #57  <Class ArrayList>
		//   31   64:dup             
		//   32   65:invokespecial   #60  <Method void ArrayList()>
		//   33   68:astore          4
				int j = aparcelable.length;
		//   34   70:aload           5
		//   35   72:arraylength     
		//   36   73:istore_3        
				i = 0;
		//   37   74:iconst_0        
		//   38   75:istore_1        
				do
				{
					bundle = ((Bundle) (arraylist));
		//   39   76:aload           4
		//   40   78:astore_2        
					if(i >= j)
						break;
		//   41   79:iload_1         
		//   42   80:iload_3         
		//   43   81:icmpge          106
					((List) (arraylist)).add(((Object) ((MediaItem)aparcelable[i])));
		//   44   84:aload           4
		//   45   86:aload           5
		//   46   88:iload_1         
		//   47   89:aaload          
		//   48   90:checkcast       #62  <Class MediaBrowserCompat$MediaItem>
		//   49   93:invokeinterface #68  <Method boolean List.add(Object)>
		//   50   98:pop             
					i++;
		//   51   99:iload_1         
		//   52  100:iconst_1        
		//   53  101:iadd            
		//   54  102:istore_1        
				} while(true);
		//   55  103:goto            76
			}
			mCallback.onSearchResult(mQuery, mExtras, ((List) (bundle)));
		//   56  106:aload_0         
		//   57  107:getfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
		//   58  110:aload_0         
		//   59  111:getfield        #20  <Field String mQuery>
		//   60  114:aload_0         
		//   61  115:getfield        #22  <Field Bundle mExtras>
		//   62  118:aload_2         
		//   63  119:invokevirtual   #72  <Method void MediaBrowserCompat$SearchCallback.onSearchResult(String, Bundle, List)>
		//   64  122:return          
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

	private static class ServiceBinderWrapper
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

		void sendCustomAction(String s, Bundle bundle, ResultReceiver resultreceiver, Messenger messenger)
			throws RemoteException
		{
			Bundle bundle1 = new Bundle();
		//    0    0:new             #59  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #60  <Method void Bundle()>
		//    3    7:astore          5
			bundle1.putString("data_custom_action", s);
		//    4    9:aload           5
		//    5   11:ldc1            #116 <String "data_custom_action">
		//    6   13:aload_1         
		//    7   14:invokevirtual   #66  <Method void Bundle.putString(String, String)>
			bundle1.putBundle("data_custom_action_extras", bundle);
		//    8   17:aload           5
		//    9   19:ldc1            #118 <String "data_custom_action_extras">
		//   10   21:aload_2         
		//   11   22:invokevirtual   #80  <Method void Bundle.putBundle(String, Bundle)>
			bundle1.putParcelable("data_result_receiver", ((Parcelable) (resultreceiver)));
		//   12   25:aload           5
		//   13   27:ldc1            #100 <String "data_result_receiver">
		//   14   29:aload_3         
		//   15   30:invokevirtual   #104 <Method void Bundle.putParcelable(String, Parcelable)>
			sendRequest(9, bundle1, messenger);
		//   16   33:aload_0         
		//   17   34:bipush          9
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

	private static class Subscription
	{

		public SubscriptionCallback getCallback(Context context, Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_2         
		//*   1    1:ifnull          12
				bundle.setClassLoader(context.getClassLoader());
		//    2    4:aload_2         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #32  <Method ClassLoader Context.getClassLoader()>
		//    5    9:invokevirtual   #38  <Method void Bundle.setClassLoader(ClassLoader)>
			for(int i = 0; i < mOptionsList.size(); i++)
		//*   6   12:iconst_0        
		//*   7   13:istore_3        
		//*   8   14:iload_3         
		//*   9   15:aload_0         
		//*  10   16:getfield        #23  <Field List mOptionsList>
		//*  11   19:invokeinterface #44  <Method int List.size()>
		//*  12   24:icmpge          68
				if(MediaBrowserCompatUtils.areSameOptions((Bundle)mOptionsList.get(i), bundle))
		//*  13   27:aload_0         
		//*  14   28:getfield        #23  <Field List mOptionsList>
		//*  15   31:iload_3         
		//*  16   32:invokeinterface #48  <Method Object List.get(int)>
		//*  17   37:checkcast       #34  <Class Bundle>
		//*  18   40:aload_2         
		//*  19   41:invokestatic    #54  <Method boolean MediaBrowserCompatUtils.areSameOptions(Bundle, Bundle)>
		//*  20   44:ifeq            61
					return (SubscriptionCallback)mCallbacks.get(i);
		//   21   47:aload_0         
		//   22   48:getfield        #21  <Field List mCallbacks>
		//   23   51:iload_3         
		//   24   52:invokeinterface #48  <Method Object List.get(int)>
		//   25   57:checkcast       #56  <Class MediaBrowserCompat$SubscriptionCallback>
		//   26   60:areturn         

		//   27   61:iload_3         
		//   28   62:iconst_1        
		//   29   63:iadd            
		//   30   64:istore_3        
		//*  31   65:goto            14
			return null;
		//   32   68:aconst_null     
		//   33   69:areturn         
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
		//    2    4:invokeinterface #66  <Method boolean List.isEmpty()>
		//    3    9:ireturn         
		}

		public void putCallback(Context context, Bundle bundle, SubscriptionCallback subscriptioncallback)
		{
			if(bundle != null)
		//*   0    0:aload_2         
		//*   1    1:ifnull          12
				bundle.setClassLoader(context.getClassLoader());
		//    2    4:aload_2         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #32  <Method ClassLoader Context.getClassLoader()>
		//    5    9:invokevirtual   #38  <Method void Bundle.setClassLoader(ClassLoader)>
			for(int i = 0; i < mOptionsList.size(); i++)
		//*   6   12:iconst_0        
		//*   7   13:istore          4
		//*   8   15:iload           4
		//*   9   17:aload_0         
		//*  10   18:getfield        #23  <Field List mOptionsList>
		//*  11   21:invokeinterface #44  <Method int List.size()>
		//*  12   26:icmpge          73
				if(MediaBrowserCompatUtils.areSameOptions((Bundle)mOptionsList.get(i), bundle))
		//*  13   29:aload_0         
		//*  14   30:getfield        #23  <Field List mOptionsList>
		//*  15   33:iload           4
		//*  16   35:invokeinterface #48  <Method Object List.get(int)>
		//*  17   40:checkcast       #34  <Class Bundle>
		//*  18   43:aload_2         
		//*  19   44:invokestatic    #54  <Method boolean MediaBrowserCompatUtils.areSameOptions(Bundle, Bundle)>
		//*  20   47:ifeq            64
				{
					mCallbacks.set(i, ((Object) (subscriptioncallback)));
		//   21   50:aload_0         
		//   22   51:getfield        #21  <Field List mCallbacks>
		//   23   54:iload           4
		//   24   56:aload_3         
		//   25   57:invokeinterface #72  <Method Object List.set(int, Object)>
		//   26   62:pop             
					return;
		//   27   63:return          
				}

		//   28   64:iload           4
		//   29   66:iconst_1        
		//   30   67:iadd            
		//   31   68:istore          4
		//*  32   70:goto            15
			mCallbacks.add(((Object) (subscriptioncallback)));
		//   33   73:aload_0         
		//   34   74:getfield        #21  <Field List mCallbacks>
		//   35   77:aload_3         
		//   36   78:invokeinterface #76  <Method boolean List.add(Object)>
		//   37   83:pop             
			mOptionsList.add(((Object) (bundle)));
		//   38   84:aload_0         
		//   39   85:getfield        #23  <Field List mOptionsList>
		//   40   88:aload_2         
		//   41   89:invokeinterface #76  <Method boolean List.add(Object)>
		//   42   94:pop             
		//   43   95:return          
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
		//    1    1:new             #65  <Class WeakReference>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #68  <Method void WeakReference(Object)>
		//    5    9:putfield        #70  <Field WeakReference mSubscriptionRef>
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
		//    1    1:getfield        #43  <Field IBinder mToken>
		//    2    4:areturn         
		}

*/


/*
		static void access$100(SubscriptionCallback subscriptioncallback, Subscription subscription)
		{
			subscriptioncallback.setSubscription(subscription);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #61  <Method void setSubscription(MediaBrowserCompat$Subscription)>
			return;
		//    3    5:return          
		}

*/


/*
		static Object access$200(SubscriptionCallback subscriptioncallback)
		{
			return subscriptioncallback.mSubscriptionCallbackObj;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field Object mSubscriptionCallbackObj>
		//    2    4:areturn         
		}

*/

		public SubscriptionCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			if(android.os.Build.VERSION.SDK_INT >= 26)
		//*   2    4:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          26
		//*   4    9:icmplt          33
			{
				mSubscriptionCallbackObj = MediaBrowserCompatApi24.createSubscriptionCallback(((MediaBrowserCompatApi24.SubscriptionCallback) (new StubApi24())));
		//    5   12:aload_0         
		//    6   13:new             #12  <Class MediaBrowserCompat$SubscriptionCallback$StubApi24>
		//    7   16:dup             
		//    8   17:aload_0         
		//    9   18:invokespecial   #33  <Method void MediaBrowserCompat$SubscriptionCallback$StubApi24(MediaBrowserCompat$SubscriptionCallback)>
		//   10   21:invokestatic    #39  <Method Object MediaBrowserCompatApi24.createSubscriptionCallback(MediaBrowserCompatApi24$SubscriptionCallback)>
		//   11   24:putfield        #41  <Field Object mSubscriptionCallbackObj>
				mToken = null;
		//   12   27:aload_0         
		//   13   28:aconst_null     
		//   14   29:putfield        #43  <Field IBinder mToken>
				return;
		//   15   32:return          
			}
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*  16   33:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
		//*  17   36:bipush          21
		//*  18   38:icmplt          68
			{
				mSubscriptionCallbackObj = MediaBrowserCompatApi21.createSubscriptionCallback(((MediaBrowserCompatApi21.SubscriptionCallback) (new StubApi21())));
		//   19   41:aload_0         
		//   20   42:new             #9   <Class MediaBrowserCompat$SubscriptionCallback$StubApi21>
		//   21   45:dup             
		//   22   46:aload_0         
		//   23   47:invokespecial   #44  <Method void MediaBrowserCompat$SubscriptionCallback$StubApi21(MediaBrowserCompat$SubscriptionCallback)>
		//   24   50:invokestatic    #49  <Method Object MediaBrowserCompatApi21.createSubscriptionCallback(MediaBrowserCompatApi21$SubscriptionCallback)>
		//   25   53:putfield        #41  <Field Object mSubscriptionCallbackObj>
				mToken = ((IBinder) (new Binder()));
		//   26   56:aload_0         
		//   27   57:new             #51  <Class Binder>
		//   28   60:dup             
		//   29   61:invokespecial   #52  <Method void Binder()>
		//   30   64:putfield        #43  <Field IBinder mToken>
				return;
		//   31   67:return          
			} else
			{
				mSubscriptionCallbackObj = null;
		//   32   68:aload_0         
		//   33   69:aconst_null     
		//   34   70:putfield        #41  <Field Object mSubscriptionCallbackObj>
				mToken = ((IBinder) (new Binder()));
		//   35   73:aload_0         
		//   36   74:new             #51  <Class Binder>
		//   37   77:dup             
		//   38   78:invokespecial   #52  <Method void Binder()>
		//   39   81:putfield        #43  <Field IBinder mToken>
				return;
		//   40   84:return          
			}
		}
	}

	private class SubscriptionCallback.StubApi21
		implements MediaBrowserCompatApi21.SubscriptionCallback
	{

		List applyOptions(List list, Bundle bundle)
		{
			if(list != null) goto _L2; else goto _L1
		//    0    0:aload_1         
		//    1    1:ifnonnull       8
_L1:
			bundle = null;
		//    2    4:aconst_null     
		//    3    5:astore_2        
_L4:
			return ((List) (bundle));
		//    4    6:aload_2         
		//    5    7:areturn         
_L2:
			int i;
			int l;
			i = bundle.getInt("android.media.browse.extra.PAGE", -1);
		//    6    8:aload_2         
		//    7    9:ldc1            #26  <String "android.media.browse.extra.PAGE">
		//    8   11:iconst_m1       
		//    9   12:invokevirtual   #32  <Method int Bundle.getInt(String, int)>
		//   10   15:istore_3        
			l = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
		//   11   16:aload_2         
		//   12   17:ldc1            #34  <String "android.media.browse.extra.PAGE_SIZE">
		//   13   19:iconst_m1       
		//   14   20:invokevirtual   #32  <Method int Bundle.getInt(String, int)>
		//   15   23:istore          6
			if(i != -1)
				break; /* Loop/switch isn't completed */
		//   16   25:iload_3         
		//   17   26:iconst_m1       
		//   18   27:icmpne          38
			bundle = ((Bundle) (list));
		//   19   30:aload_1         
		//   20   31:astore_2        
			if(l == -1) goto _L4; else goto _L3
		//   21   32:iload           6
		//   22   34:iconst_m1       
		//   23   35:icmpeq          6
_L3:
			int k = l * i;
		//   24   38:iload           6
		//   25   40:iload_3         
		//   26   41:imul            
		//   27   42:istore          5
			int j = k + l;
		//   28   44:iload           5
		//   29   46:iload           6
		//   30   48:iadd            
		//   31   49:istore          4
			if(i < 0 || l < 1 || k >= list.size())
		//*  32   51:iload_3         
		//*  33   52:iflt            72
		//*  34   55:iload           6
		//*  35   57:iconst_1        
		//*  36   58:icmplt          72
		//*  37   61:iload           5
		//*  38   63:aload_1         
		//*  39   64:invokeinterface #40  <Method int List.size()>
		//*  40   69:icmplt          76
				return Collections.EMPTY_LIST;
		//   41   72:getstatic       #46  <Field List Collections.EMPTY_LIST>
		//   42   75:areturn         
			i = j;
		//   43   76:iload           4
		//   44   78:istore_3        
			if(j > list.size())
		//*  45   79:iload           4
		//*  46   81:aload_1         
		//*  47   82:invokeinterface #40  <Method int List.size()>
		//*  48   87:icmple          97
				i = list.size();
		//   49   90:aload_1         
		//   50   91:invokeinterface #40  <Method int List.size()>
		//   51   96:istore_3        
			return list.subList(k, i);
		//   52   97:aload_1         
		//   53   98:iload           5
		//   54  100:iload_3         
		//   55  101:invokeinterface #50  <Method List List.subList(int, int)>
		//   56  106:areturn         
		}

		public void onChildrenLoaded(String s, List list)
		{
			Object obj;
			if(mSubscriptionRef == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//*   2    4:getfield        #59  <Field WeakReference MediaBrowserCompat$SubscriptionCallback.mSubscriptionRef>
		//*   3    7:ifnonnull       31
				obj = null;
		//    4   10:aconst_null     
		//    5   11:astore          4
			else
		//*   6   13:aload           4
		//*   7   15:ifnonnull       49
		//*   8   18:aload_0         
		//*   9   19:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//*  10   22:aload_1         
		//*  11   23:aload_2         
		//*  12   24:invokestatic    #65  <Method List MediaBrowserCompat$MediaItem.fromMediaItemList(List)>
		//*  13   27:invokevirtual   #67  <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
		//*  14   30:return          
				obj = ((Object) ((Subscription)mSubscriptionRef.get()));
		//   15   31:aload_0         
		//   16   32:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//   17   35:getfield        #59  <Field WeakReference MediaBrowserCompat$SubscriptionCallback.mSubscriptionRef>
		//   18   38:invokevirtual   #73  <Method Object WeakReference.get()>
		//   19   41:checkcast       #75  <Class MediaBrowserCompat$Subscription>
		//   20   44:astore          4
			if(obj == null)
			{
				SubscriptionCallback.this.onChildrenLoaded(s, MediaItem.fromMediaItemList(list));
			} else
		//*  21   46:goto            13
			{
				list = MediaItem.fromMediaItemList(list);
		//   22   49:aload_2         
		//   23   50:invokestatic    #65  <Method List MediaBrowserCompat$MediaItem.fromMediaItemList(List)>
		//   24   53:astore_2        
				List list1 = ((Subscription) (obj)).getCallbacks();
		//   25   54:aload           4
		//   26   56:invokevirtual   #79  <Method List MediaBrowserCompat$Subscription.getCallbacks()>
		//   27   59:astore          5
				obj = ((Object) (((Subscription) (obj)).getOptionsList()));
		//   28   61:aload           4
		//   29   63:invokevirtual   #82  <Method List MediaBrowserCompat$Subscription.getOptionsList()>
		//   30   66:astore          4
				int i = 0;
		//   31   68:iconst_0        
		//   32   69:istore_3        
				while(i < list1.size()) 
		//*  33   70:iload_3         
		//*  34   71:aload           5
		//*  35   73:invokeinterface #40  <Method int List.size()>
		//*  36   78:icmpge          30
				{
					Bundle bundle = (Bundle)((List) (obj)).get(i);
		//   37   81:aload           4
		//   38   83:iload_3         
		//   39   84:invokeinterface #85  <Method Object List.get(int)>
		//   40   89:checkcast       #28  <Class Bundle>
		//   41   92:astore          6
					if(bundle == null)
		//*  42   94:aload           6
		//*  43   96:ifnonnull       115
						SubscriptionCallback.this.onChildrenLoaded(s, list);
		//   44   99:aload_0         
		//   45  100:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//   46  103:aload_1         
		//   47  104:aload_2         
		//   48  105:invokevirtual   #67  <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
					else
		//*  49  108:iload_3         
		//*  50  109:iconst_1        
		//*  51  110:iadd            
		//*  52  111:istore_3        
		//*  53  112:goto            70
						SubscriptionCallback.this.onChildrenLoaded(s, applyOptions(list, bundle), bundle);
		//   54  115:aload_0         
		//   55  116:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		//   56  119:aload_1         
		//   57  120:aload_0         
		//   58  121:aload_2         
		//   59  122:aload           6
		//   60  124:invokevirtual   #87  <Method List applyOptions(List, Bundle)>
		//   61  127:aload           6
		//   62  129:invokevirtual   #90  <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
					i++;
				}
			}
		//*  63  132:goto            108
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

	private class SubscriptionCallback.StubApi24 extends SubscriptionCallback.StubApi21
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
	//    1    1:invokespecial   #151 <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   2    4:getstatic       #157 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          26
	//*   4    9:icmplt          29
		{
			mImpl = ((MediaBrowserImpl) (new MediaBrowserImplApi24(context, componentname, connectioncallback, bundle)));
	//    5   12:aload_0         
	//    6   13:new             #56  <Class MediaBrowserCompat$MediaBrowserImplApi24>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:aload_2         
	//   10   19:aload_3         
	//   11   20:aload           4
	//   12   22:invokespecial   #159 <Method void MediaBrowserCompat$MediaBrowserImplApi24(Context, ComponentName, MediaBrowserCompat$ConnectionCallback, Bundle)>
	//   13   25:putfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
			return;
	//   14   28:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  15   29:getstatic       #157 <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   32:bipush          23
	//*  17   34:icmplt          54
		{
			mImpl = ((MediaBrowserImpl) (new MediaBrowserImplApi23(context, componentname, connectioncallback, bundle)));
	//   18   37:aload_0         
	//   19   38:new             #53  <Class MediaBrowserCompat$MediaBrowserImplApi23>
	//   20   41:dup             
	//   21   42:aload_1         
	//   22   43:aload_2         
	//   23   44:aload_3         
	//   24   45:aload           4
	//   25   47:invokespecial   #162 <Method void MediaBrowserCompat$MediaBrowserImplApi23(Context, ComponentName, MediaBrowserCompat$ConnectionCallback, Bundle)>
	//   26   50:putfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
			return;
	//   27   53:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  28   54:getstatic       #157 <Field int android.os.Build$VERSION.SDK_INT>
	//*  29   57:bipush          21
	//*  30   59:icmplt          79
		{
			mImpl = ((MediaBrowserImpl) (new MediaBrowserImplApi21(context, componentname, connectioncallback, bundle)));
	//   31   62:aload_0         
	//   32   63:new             #36  <Class MediaBrowserCompat$MediaBrowserImplApi21>
	//   33   66:dup             
	//   34   67:aload_1         
	//   35   68:aload_2         
	//   36   69:aload_3         
	//   37   70:aload           4
	//   38   72:invokespecial   #163 <Method void MediaBrowserCompat$MediaBrowserImplApi21(Context, ComponentName, MediaBrowserCompat$ConnectionCallback, Bundle)>
	//   39   75:putfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
			return;
	//   40   78:return          
		} else
		{
			mImpl = ((MediaBrowserImpl) (new MediaBrowserImplBase(context, componentname, connectioncallback, bundle)));
	//   41   79:aload_0         
	//   42   80:new             #59  <Class MediaBrowserCompat$MediaBrowserImplBase>
	//   43   83:dup             
	//   44   84:aload_1         
	//   45   85:aload_2         
	//   46   86:aload_3         
	//   47   87:aload           4
	//   48   89:invokespecial   #164 <Method void MediaBrowserCompat$MediaBrowserImplBase(Context, ComponentName, MediaBrowserCompat$ConnectionCallback, Bundle)>
	//   49   92:putfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
			return;
	//   50   95:return          
		}
	}

	public void connect()
	{
		mImpl.connect();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #167 <Method void MediaBrowserCompat$MediaBrowserImpl.connect()>
	//    3    9:return          
	}

	public void disconnect()
	{
		mImpl.disconnect();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #170 <Method void MediaBrowserCompat$MediaBrowserImpl.disconnect()>
	//    3    9:return          
	}

	public Bundle getExtras()
	{
		return mImpl.getExtras();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #175 <Method Bundle MediaBrowserCompat$MediaBrowserImpl.getExtras()>
	//    3    9:areturn         
	}

	public void getItem(String s, ItemCallback itemcallback)
	{
		mImpl.getItem(s, itemcallback);
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #181 <Method void MediaBrowserCompat$MediaBrowserImpl.getItem(String, MediaBrowserCompat$ItemCallback)>
	//    5   11:return          
	}

	public String getRoot()
	{
		return mImpl.getRoot();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #186 <Method String MediaBrowserCompat$MediaBrowserImpl.getRoot()>
	//    3    9:areturn         
	}

	public ComponentName getServiceComponent()
	{
		return mImpl.getServiceComponent();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #190 <Method ComponentName MediaBrowserCompat$MediaBrowserImpl.getServiceComponent()>
	//    3    9:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
	{
		return mImpl.getSessionToken();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #194 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserCompat$MediaBrowserImpl.getSessionToken()>
	//    3    9:areturn         
	}

	public boolean isConnected()
	{
		return mImpl.isConnected();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #198 <Method boolean MediaBrowserCompat$MediaBrowserImpl.isConnected()>
	//    3    9:ireturn         
	}

	public void search(String s, Bundle bundle, SearchCallback searchcallback)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #206 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("query cannot be empty");
	//    3    7:new             #208 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #210 <String "query cannot be empty">
	//    6   13:invokespecial   #213 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(searchcallback == null)
	//*   8   17:aload_3         
	//*   9   18:ifnonnull       31
		{
			throw new IllegalArgumentException("callback cannot be null");
	//   10   21:new             #208 <Class IllegalArgumentException>
	//   11   24:dup             
	//   12   25:ldc1            #215 <String "callback cannot be null">
	//   13   27:invokespecial   #213 <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
		} else
		{
			mImpl.search(s, bundle, searchcallback);
	//   15   31:aload_0         
	//   16   32:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//   17   35:aload_1         
	//   18   36:aload_2         
	//   19   37:aload_3         
	//   20   38:invokeinterface #217 <Method void MediaBrowserCompat$MediaBrowserImpl.search(String, Bundle, MediaBrowserCompat$SearchCallback)>
			return;
	//   21   43:return          
		}
	}

	public void sendCustomAction(String s, Bundle bundle, CustomActionCallback customactioncallback)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #206 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
		{
			throw new IllegalArgumentException("action cannot be empty");
	//    3    7:new             #208 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #221 <String "action cannot be empty">
	//    6   13:invokespecial   #213 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		} else
		{
			mImpl.sendCustomAction(s, bundle, customactioncallback);
	//    8   17:aload_0         
	//    9   18:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//   10   21:aload_1         
	//   11   22:aload_2         
	//   12   23:aload_3         
	//   13   24:invokeinterface #223 <Method void MediaBrowserCompat$MediaBrowserImpl.sendCustomAction(String, Bundle, MediaBrowserCompat$CustomActionCallback)>
			return;
	//   14   29:return          
		}
	}

	public void subscribe(String s, Bundle bundle, SubscriptionCallback subscriptioncallback)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #206 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("parentId is empty");
	//    3    7:new             #208 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #227 <String "parentId is empty">
	//    6   13:invokespecial   #213 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(subscriptioncallback == null)
	//*   8   17:aload_3         
	//*   9   18:ifnonnull       31
			throw new IllegalArgumentException("callback is null");
	//   10   21:new             #208 <Class IllegalArgumentException>
	//   11   24:dup             
	//   12   25:ldc1            #229 <String "callback is null">
	//   13   27:invokespecial   #213 <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
		if(bundle == null)
	//*  15   31:aload_2         
	//*  16   32:ifnonnull       45
		{
			throw new IllegalArgumentException("options are null");
	//   17   35:new             #208 <Class IllegalArgumentException>
	//   18   38:dup             
	//   19   39:ldc1            #231 <String "options are null">
	//   20   41:invokespecial   #213 <Method void IllegalArgumentException(String)>
	//   21   44:athrow          
		} else
		{
			mImpl.subscribe(s, bundle, subscriptioncallback);
	//   22   45:aload_0         
	//   23   46:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//   24   49:aload_1         
	//   25   50:aload_2         
	//   26   51:aload_3         
	//   27   52:invokeinterface #233 <Method void MediaBrowserCompat$MediaBrowserImpl.subscribe(String, Bundle, MediaBrowserCompat$SubscriptionCallback)>
			return;
	//   28   57:return          
		}
	}

	public void subscribe(String s, SubscriptionCallback subscriptioncallback)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #206 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("parentId is empty");
	//    3    7:new             #208 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #227 <String "parentId is empty">
	//    6   13:invokespecial   #213 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(subscriptioncallback == null)
	//*   8   17:aload_2         
	//*   9   18:ifnonnull       31
		{
			throw new IllegalArgumentException("callback is null");
	//   10   21:new             #208 <Class IllegalArgumentException>
	//   11   24:dup             
	//   12   25:ldc1            #229 <String "callback is null">
	//   13   27:invokespecial   #213 <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
		} else
		{
			mImpl.subscribe(s, ((Bundle) (null)), subscriptioncallback);
	//   15   31:aload_0         
	//   16   32:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//   17   35:aload_1         
	//   18   36:aconst_null     
	//   19   37:aload_2         
	//   20   38:invokeinterface #233 <Method void MediaBrowserCompat$MediaBrowserImpl.subscribe(String, Bundle, MediaBrowserCompat$SubscriptionCallback)>
			return;
	//   21   43:return          
		}
	}

	public void unsubscribe(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #206 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
		{
			throw new IllegalArgumentException("parentId is empty");
	//    3    7:new             #208 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #227 <String "parentId is empty">
	//    6   13:invokespecial   #213 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		} else
		{
			mImpl.unsubscribe(s, ((SubscriptionCallback) (null)));
	//    8   17:aload_0         
	//    9   18:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//   10   21:aload_1         
	//   11   22:aconst_null     
	//   12   23:invokeinterface #237 <Method void MediaBrowserCompat$MediaBrowserImpl.unsubscribe(String, MediaBrowserCompat$SubscriptionCallback)>
			return;
	//   13   28:return          
		}
	}

	public void unsubscribe(String s, SubscriptionCallback subscriptioncallback)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #206 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("parentId is empty");
	//    3    7:new             #208 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #227 <String "parentId is empty">
	//    6   13:invokespecial   #213 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(subscriptioncallback == null)
	//*   8   17:aload_2         
	//*   9   18:ifnonnull       31
		{
			throw new IllegalArgumentException("callback is null");
	//   10   21:new             #208 <Class IllegalArgumentException>
	//   11   24:dup             
	//   12   25:ldc1            #229 <String "callback is null">
	//   13   27:invokespecial   #213 <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
		} else
		{
			mImpl.unsubscribe(s, subscriptioncallback);
	//   15   31:aload_0         
	//   16   32:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//   17   35:aload_1         
	//   18   36:aload_2         
	//   19   37:invokeinterface #237 <Method void MediaBrowserCompat$MediaBrowserImpl.unsubscribe(String, MediaBrowserCompat$SubscriptionCallback)>
			return;
	//   20   42:return          
		}
	}

	public static final String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
	public static final String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
	static final boolean DEBUG = Log.isLoggable("MediaBrowserCompat", 3);
	public static final String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
	public static final String EXTRA_MEDIA_ID = "android.media.browse.extra.MEDIA_ID";
	public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
	public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
	static final String TAG = "MediaBrowserCompat";
	private final MediaBrowserImpl mImpl;

	static 
	{
	//    0    0:ldc1            #134 <String "MediaBrowserCompat">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #144 <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #146 <Field boolean DEBUG>
	//*   4    9:return          
	}
}
