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
//			MediaBrowserCompatApi21, MediaBrowserCompatApi23, MediaBrowserCompatApi26, MediaDescriptionCompat, 
//			MediaBrowserCompatUtils

public final class MediaBrowserCompat
{
	private static class CallbackHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			Object obj = ((Object) (mCallbacksMessengerRef));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field WeakReference mCallbacksMessengerRef>
		//    2    4:astore_2        
			if(obj == null || ((WeakReference) (obj)).get() == null) goto _L2; else goto _L1
		//    3    5:aload_2         
		//    4    6:ifnull          288
		//    5    9:aload_2         
		//    6   10:invokevirtual   #35  <Method Object WeakReference.get()>
		//    7   13:ifnull          288
_L1:
			Messenger messenger;
			Bundle bundle;
			if(mCallbackImplRef.get() == null)
		//*   8   16:aload_0         
		//*   9   17:getfield        #24  <Field WeakReference mCallbackImplRef>
		//*  10   20:invokevirtual   #35  <Method Object WeakReference.get()>
		//*  11   23:ifnonnull       27
				return;
		//   12   26:return          
			bundle = message.getData();
		//   13   27:aload_1         
		//   14   28:invokevirtual   #41  <Method Bundle Message.getData()>
		//   15   31:astore          4
			MediaSessionCompat.ensureClassLoader(bundle);
		//   16   33:aload           4
		//   17   35:invokestatic    #47  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			obj = ((Object) ((MediaBrowserServiceCallbackImpl)mCallbackImplRef.get()));
		//   18   38:aload_0         
		//   19   39:getfield        #24  <Field WeakReference mCallbackImplRef>
		//   20   42:invokevirtual   #35  <Method Object WeakReference.get()>
		//   21   45:checkcast       #49  <Class MediaBrowserCompat$MediaBrowserServiceCallbackImpl>
		//   22   48:astore_2        
			messenger = (Messenger)mCallbacksMessengerRef.get();
		//   23   49:aload_0         
		//   24   50:getfield        #31  <Field WeakReference mCallbacksMessengerRef>
		//   25   53:invokevirtual   #35  <Method Object WeakReference.get()>
		//   26   56:checkcast       #51  <Class Messenger>
		//   27   59:astore_3        
			message.what;
		//   28   60:aload_1         
		//   29   61:getfield        #55  <Field int Message.what>
			JVM INSTR tableswitch 1 3: default 294
		//		               1 154
		//		               2 146
		//		               3 92;
		//   30   64:tableswitch     1 3: default 294
		//		               1 154
		//		               2 146
		//		               3 92
			   goto _L3 _L4 _L5 _L6
_L6:
			Bundle bundle1 = bundle.getBundle("data_options");
		//   31   92:aload           4
		//   32   94:ldc1            #57  <String "data_options">
		//   33   96:invokevirtual   #63  <Method Bundle Bundle.getBundle(String)>
		//   34   99:astore          5
			MediaSessionCompat.ensureClassLoader(bundle1);
		//   35  101:aload           5
		//   36  103:invokestatic    #47  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			Bundle bundle3 = bundle.getBundle("data_notify_children_changed_options");
		//   37  106:aload           4
		//   38  108:ldc1            #65  <String "data_notify_children_changed_options">
		//   39  110:invokevirtual   #63  <Method Bundle Bundle.getBundle(String)>
		//   40  113:astore          6
			MediaSessionCompat.ensureClassLoader(bundle3);
		//   41  115:aload           6
		//   42  117:invokestatic    #47  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			((MediaBrowserServiceCallbackImpl) (obj)).onLoadChildren(messenger, bundle.getString("data_media_item_id"), ((List) (bundle.getParcelableArrayList("data_media_item_list"))), bundle1, bundle3);
		//   43  120:aload_2         
		//   44  121:aload_3         
		//   45  122:aload           4
		//   46  124:ldc1            #67  <String "data_media_item_id">
		//   47  126:invokevirtual   #71  <Method String Bundle.getString(String)>
		//   48  129:aload           4
		//   49  131:ldc1            #73  <String "data_media_item_list">
		//   50  133:invokevirtual   #77  <Method ArrayList Bundle.getParcelableArrayList(String)>
		//   51  136:aload           5
		//   52  138:aload           6
		//   53  140:invokeinterface #81  <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onLoadChildren(Messenger, String, List, Bundle, Bundle)>
			return;
		//   54  145:return          
		//*  55  146:aload_2         
		//*  56  147:aload_3         
		//*  57  148:invokeinterface #85  <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onConnectionFailed(Messenger)>
		//*  58  153:return          
_L4:
			Bundle bundle2 = bundle.getBundle("data_root_hints");
		//   59  154:aload           4
		//   60  156:ldc1            #87  <String "data_root_hints">
		//   61  158:invokevirtual   #63  <Method Bundle Bundle.getBundle(String)>
		//   62  161:astore          5
			MediaSessionCompat.ensureClassLoader(bundle2);
		//   63  163:aload           5
		//   64  165:invokestatic    #47  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			((MediaBrowserServiceCallbackImpl) (obj)).onServiceConnected(messenger, bundle.getString("data_media_item_id"), (android.support.v4.media.session.MediaSessionCompat.Token)bundle.getParcelable("data_media_session_token"), bundle2);
		//   65  168:aload_2         
		//   66  169:aload_3         
		//   67  170:aload           4
		//   68  172:ldc1            #67  <String "data_media_item_id">
		//   69  174:invokevirtual   #71  <Method String Bundle.getString(String)>
		//   70  177:aload           4
		//   71  179:ldc1            #89  <String "data_media_session_token">
		//   72  181:invokevirtual   #93  <Method Parcelable Bundle.getParcelable(String)>
		//   73  184:checkcast       #95  <Class android.support.v4.media.session.MediaSessionCompat$Token>
		//   74  187:aload           5
		//   75  189:invokeinterface #99  <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onServiceConnected(Messenger, String, android.support.v4.media.session.MediaSessionCompat$Token, Bundle)>
			return;
		//   76  194:return          
_L3:
			StringBuilder stringbuilder = new StringBuilder();
		//   77  195:new             #101 <Class StringBuilder>
		//   78  198:dup             
		//   79  199:invokespecial   #102 <Method void StringBuilder()>
		//   80  202:astore          4
			stringbuilder.append("Unhandled message: ");
		//   81  204:aload           4
		//   82  206:ldc1            #104 <String "Unhandled message: ">
		//   83  208:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   84  211:pop             
			stringbuilder.append(((Object) (message)));
		//   85  212:aload           4
		//   86  214:aload_1         
		//   87  215:invokevirtual   #111 <Method StringBuilder StringBuilder.append(Object)>
		//   88  218:pop             
			stringbuilder.append("\n  Client version: ");
		//   89  219:aload           4
		//   90  221:ldc1            #113 <String "\n  Client version: ">
		//   91  223:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   92  226:pop             
			stringbuilder.append(1);
		//   93  227:aload           4
		//   94  229:iconst_1        
		//   95  230:invokevirtual   #116 <Method StringBuilder StringBuilder.append(int)>
		//   96  233:pop             
			stringbuilder.append("\n  Service version: ");
		//   97  234:aload           4
		//   98  236:ldc1            #118 <String "\n  Service version: ">
		//   99  238:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//  100  241:pop             
			stringbuilder.append(message.arg1);
		//  101  242:aload           4
		//  102  244:aload_1         
		//  103  245:getfield        #121 <Field int Message.arg1>
		//  104  248:invokevirtual   #116 <Method StringBuilder StringBuilder.append(int)>
		//  105  251:pop             
			Log.w("MediaBrowserCompat", stringbuilder.toString());
		//  106  252:ldc1            #123 <String "MediaBrowserCompat">
		//  107  254:aload           4
		//  108  256:invokevirtual   #127 <Method String StringBuilder.toString()>
		//  109  259:invokestatic    #133 <Method int Log.w(String, String)>
		//  110  262:pop             
			return;
		//  111  263:return          
_L5:
			try
			{
				((MediaBrowserServiceCallbackImpl) (obj)).onConnectionFailed(messenger);
				return;
			}
		//* 112  264:ldc1            #123 <String "MediaBrowserCompat">
		//* 113  266:ldc1            #135 <String "Could not unparcel the data.">
		//* 114  268:invokestatic    #138 <Method int Log.e(String, String)>
		//* 115  271:pop             
		//* 116  272:aload_1         
		//* 117  273:getfield        #55  <Field int Message.what>
		//* 118  276:iconst_1        
		//* 119  277:icmpne          287
		//* 120  280:aload_2         
		//* 121  281:aload_3         
		//* 122  282:invokeinterface #85  <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onConnectionFailed(Messenger)>
		//* 123  287:return          
		//* 124  288:return          
			// Misplaced declaration of an exception variable
			catch(BadParcelableException badparcelableexception)
			{
				Log.e("MediaBrowserCompat", "Could not unparcel the data.");
			}
			if(message.what == 1)
				((MediaBrowserServiceCallbackImpl) (obj)).onConnectionFailed(messenger);
			return;
_L2:
			BadParcelableException badparcelableexception;
		//* 125  289:astore          4
		//* 126  291:goto            264
		//* 127  294:goto            195
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
			MediaSessionCompat.ensureClassLoader(bundle);
		//    4    8:aload_2         
		//    5    9:invokestatic    #33  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			switch(i)
		//*   6   12:iload_1         
			{
		//*   7   13:tableswitch     -1 1: default 40
		//		               -1 142
		//		               0 125
		//		               1 108
			default:
				StringBuilder stringbuilder = new StringBuilder();
		//    8   40:new             #35  <Class StringBuilder>
		//    9   43:dup             
		//   10   44:invokespecial   #38  <Method void StringBuilder()>
		//   11   47:astore_3        
				stringbuilder.append("Unknown result code: ");
		//   12   48:aload_3         
		//   13   49:ldc1            #40  <String "Unknown result code: ">
		//   14   51:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
		//   15   54:pop             
				stringbuilder.append(i);
		//   16   55:aload_3         
		//   17   56:iload_1         
		//   18   57:invokevirtual   #47  <Method StringBuilder StringBuilder.append(int)>
		//   19   60:pop             
				stringbuilder.append(" (extras=");
		//   20   61:aload_3         
		//   21   62:ldc1            #49  <String " (extras=">
		//   22   64:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
		//   23   67:pop             
				stringbuilder.append(((Object) (mExtras)));
		//   24   68:aload_3         
		//   25   69:aload_0         
		//   26   70:getfield        #22  <Field Bundle mExtras>
		//   27   73:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
		//   28   76:pop             
				stringbuilder.append(", resultData=");
		//   29   77:aload_3         
		//   30   78:ldc1            #54  <String ", resultData=">
		//   31   80:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
		//   32   83:pop             
				stringbuilder.append(((Object) (bundle)));
		//   33   84:aload_3         
		//   34   85:aload_2         
		//   35   86:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
		//   36   89:pop             
				stringbuilder.append(")");
		//   37   90:aload_3         
		//   38   91:ldc1            #56  <String ")">
		//   39   93:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
		//   40   96:pop             
				Log.w("MediaBrowserCompat", stringbuilder.toString());
		//   41   97:ldc1            #58  <String "MediaBrowserCompat">
		//   42   99:aload_3         
		//   43  100:invokevirtual   #62  <Method String StringBuilder.toString()>
		//   44  103:invokestatic    #68  <Method int Log.w(String, String)>
		//   45  106:pop             
				return;
		//   46  107:return          

			case 1: // '\001'
				mCallback.onProgressUpdate(mAction, mExtras, bundle);
		//   47  108:aload_0         
		//   48  109:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
		//   49  112:aload_0         
		//   50  113:getfield        #20  <Field String mAction>
		//   51  116:aload_0         
		//   52  117:getfield        #22  <Field Bundle mExtras>
		//   53  120:aload_2         
		//   54  121:invokevirtual   #74  <Method void MediaBrowserCompat$CustomActionCallback.onProgressUpdate(String, Bundle, Bundle)>
				return;
		//   55  124:return          

			case 0: // '\0'
				mCallback.onResult(mAction, mExtras, bundle);
		//   56  125:aload_0         
		//   57  126:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
		//   58  129:aload_0         
		//   59  130:getfield        #20  <Field String mAction>
		//   60  133:aload_0         
		//   61  134:getfield        #22  <Field Bundle mExtras>
		//   62  137:aload_2         
		//   63  138:invokevirtual   #77  <Method void MediaBrowserCompat$CustomActionCallback.onResult(String, Bundle, Bundle)>
				return;
		//   64  141:return          

			case -1: 
				mCallback.onError(mAction, mExtras, bundle);
		//   65  142:aload_0         
		//   66  143:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
		//   67  146:aload_0         
		//   68  147:getfield        #20  <Field String mAction>
		//   69  150:aload_0         
		//   70  151:getfield        #22  <Field Bundle mExtras>
		//   71  154:aload_2         
		//   72  155:invokevirtual   #80  <Method void MediaBrowserCompat$CustomActionCallback.onError(String, Bundle, Bundle)>
				return;
		//   73  158:return          
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
			MediaSessionCompat.ensureClassLoader(bundle);
		//    0    0:aload_2         
		//    1    1:invokestatic    #29  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			if(i == 0 && bundle != null && bundle.containsKey("media_item"))
		//*   2    4:iload_1         
		//*   3    5:ifne            69
		//*   4    8:aload_2         
		//*   5    9:ifnull          69
		//*   6   12:aload_2         
		//*   7   13:ldc1            #31  <String "media_item">
		//*   8   15:invokevirtual   #37  <Method boolean Bundle.containsKey(String)>
		//*   9   18:ifne            24
		//*  10   21:goto            69
			{
				bundle = ((Bundle) (bundle.getParcelable("media_item")));
		//   11   24:aload_2         
		//   12   25:ldc1            #31  <String "media_item">
		//   13   27:invokevirtual   #41  <Method Parcelable Bundle.getParcelable(String)>
		//   14   30:astore_2        
				if(bundle != null && !(bundle instanceof MediaItem))
		//*  15   31:aload_2         
		//*  16   32:ifnull          57
		//*  17   35:aload_2         
		//*  18   36:instanceof      #43  <Class MediaBrowserCompat$MediaItem>
		//*  19   39:ifeq            45
		//*  20   42:goto            57
				{
					mCallback.onError(mMediaId);
		//   21   45:aload_0         
		//   22   46:getfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
		//   23   49:aload_0         
		//   24   50:getfield        #18  <Field String mMediaId>
		//   25   53:invokevirtual   #49  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
					return;
		//   26   56:return          
				} else
				{
					mCallback.onItemLoaded((MediaItem)bundle);
		//   27   57:aload_0         
		//   28   58:getfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
		//   29   61:aload_2         
		//   30   62:checkcast       #43  <Class MediaBrowserCompat$MediaItem>
		//   31   65:invokevirtual   #53  <Method void MediaBrowserCompat$ItemCallback.onItemLoaded(MediaBrowserCompat$MediaItem)>
					return;
		//   32   68:return          
				}
			} else
			{
				mCallback.onError(mMediaId);
		//   33   69:aload_0         
		//   34   70:getfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
		//   35   73:aload_0         
		//   36   74:getfield        #18  <Field String mMediaId>
		//   37   77:invokevirtual   #49  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
				return;
		//   38   80:return          
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

		public abstract Bundle getNotifyChildrenChangedOptions();

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
		//    1    1:getfield        #100 <Field Object mBrowserObj>
		//    2    4:invokestatic    #105 <Method void MediaBrowserCompatApi21.connect(Object)>
		//    3    7:return          
		}

		public void disconnect()
		{
			RemoteException remoteexception;
			ServiceBinderWrapper servicebinderwrapper = mServiceBinderWrapper;
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

		public void getItem(String s, final ItemCallback cb)
		{
			RemoteException remoteexception;
			if(!TextUtils.isEmpty(((CharSequence) (s))))
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
					Object obj = ((Object) (new ItemReceiver(s, cb, ((Handler) (mHandler)))));
		//   38   74:new             #162 <Class MediaBrowserCompat$ItemReceiver>
		//   39   77:dup             
		//   40   78:aload_1         
		//   41   79:aload_2         
		//   42   80:aload_0         
		//   43   81:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   44   84:invokespecial   #165 <Method void MediaBrowserCompat$ItemReceiver(String, MediaBrowserCompat$ItemCallback, Handler)>
		//   45   87:astore_3        
					try
					{
						mServiceBinderWrapper.getMediaItem(s, ((ResultReceiver) (obj)), mCallbacksMessenger);
		//   46   88:aload_0         
		//   47   89:getfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   48   92:aload_1         
		//   49   93:aload_3         
		//   50   94:aload_0         
		//   51   95:getfield        #112 <Field Messenger mCallbacksMessenger>
		//   52   98:invokevirtual   #169 <Method void MediaBrowserCompat$ServiceBinderWrapper.getMediaItem(String, ResultReceiver, Messenger)>
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
					((StringBuilder) (obj)).append(s);
					Log.i("MediaBrowserCompat", ((StringBuilder) (obj)).toString());
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
			IBinder ibinder = BundleCompat.getBinder(((Bundle) (obj)), "extra_messenger");
		//   13   24:aload_1         
		//   14   25:ldc1            #230 <String "extra_messenger">
		//   15   27:invokestatic    #236 <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//   16   30:astore_2        
			if(ibinder != null)
		//*  17   31:aload_2         
		//*  18   32:ifnull          103
			{
				mServiceBinderWrapper = new ServiceBinderWrapper(ibinder, mRootHints);
		//   19   35:aload_0         
		//   20   36:new             #114 <Class MediaBrowserCompat$ServiceBinderWrapper>
		//   21   39:dup             
		//   22   40:aload_2         
		//   23   41:aload_0         
		//   24   42:getfield        #77  <Field Bundle mRootHints>
		//   25   45:invokespecial   #239 <Method void MediaBrowserCompat$ServiceBinderWrapper(IBinder, Bundle)>
		//   26   48:putfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
				mCallbacksMessenger = new Messenger(((Handler) (mHandler)));
		//   27   51:aload_0         
		//   28   52:new             #241 <Class Messenger>
		//   29   55:dup             
		//   30   56:aload_0         
		//   31   57:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   32   60:invokespecial   #244 <Method void Messenger(Handler)>
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
		//*  53  106:invokestatic    #236 <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//*  54  109:invokestatic    #261 <Method android.support.v4.media.session.IMediaSession android.support.v4.media.session.IMediaSession$Stub.asInterface(IBinder)>
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
			messenger = ((Messenger) ((Subscription)mSubscriptions.get(((Object) (s)))));
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
			messenger = ((Messenger) (((Subscription) (messenger)).getCallback(bundle)));
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
						((SubscriptionCallback) (messenger)).onError(s);
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
						((SubscriptionCallback) (messenger)).onChildrenLoaded(s, list);
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
					((SubscriptionCallback) (messenger)).onError(s, bundle);
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
				((SubscriptionCallback) (messenger)).onChildrenLoaded(s, list, bundle);
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

		public void search(final String query, Bundle bundle, final SearchCallback callback)
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
				SearchResultReceiver searchresultreceiver = new SearchResultReceiver(query, bundle, callback, ((Handler) (mHandler)));
		//   22   43:new             #314 <Class MediaBrowserCompat$SearchResultReceiver>
		//   23   46:dup             
		//   24   47:aload_1         
		//   25   48:aload_2         
		//   26   49:aload_3         
		//   27   50:aload_0         
		//   28   51:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   29   54:invokespecial   #317 <Method void MediaBrowserCompat$SearchResultReceiver(String, Bundle, MediaBrowserCompat$SearchCallback, Handler)>
		//   30   57:astore          4
				try
				{
					mServiceBinderWrapper.search(query, bundle, ((ResultReceiver) (searchresultreceiver)), mCallbacksMessenger);
		//   31   59:aload_0         
		//   32   60:getfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   33   63:aload_1         
		//   34   64:aload_2         
		//   35   65:aload           4
		//   36   67:aload_0         
		//   37   68:getfield        #112 <Field Messenger mCallbacksMessenger>
		//   38   71:invokevirtual   #320 <Method void MediaBrowserCompat$ServiceBinderWrapper.search(String, Bundle, ResultReceiver, Messenger)>
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

		public void sendCustomAction(final String action, Bundle bundle, final CustomActionCallback callback)
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
				CustomActionResultReceiver customactionresultreceiver = new CustomActionResultReceiver(action, bundle, callback, ((Handler) (mHandler)));
		//   23   46:new             #340 <Class MediaBrowserCompat$CustomActionResultReceiver>
		//   24   49:dup             
		//   25   50:aload_1         
		//   26   51:aload_2         
		//   27   52:aload_3         
		//   28   53:aload_0         
		//   29   54:getfield        #62  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   30   57:invokespecial   #343 <Method void MediaBrowserCompat$CustomActionResultReceiver(String, Bundle, MediaBrowserCompat$CustomActionCallback, Handler)>
		//   31   60:astore          4
				try
				{
					mServiceBinderWrapper.sendCustomAction(action, bundle, ((ResultReceiver) (customactionresultreceiver)), mCallbacksMessenger);
		//   32   62:aload_0         
		//   33   63:getfield        #110 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   34   66:aload_1         
		//   35   67:aload_2         
		//   36   68:aload           4
		//   37   70:aload_0         
		//   38   71:getfield        #112 <Field Messenger mCallbacksMessenger>
		//   39   74:invokevirtual   #345 <Method void MediaBrowserCompat$ServiceBinderWrapper.sendCustomAction(String, Bundle, ResultReceiver, Messenger)>
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
					stringbuilder.append(((Object) (bundle)));
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
				callback = ((CustomActionCallback) (new StringBuilder()));
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
				((StringBuilder) (callback)).append(((Object) (bundle)));
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

		public void subscribe(String s, Bundle bundle, SubscriptionCallback subscriptioncallback)
		{
			Subscription subscription = (Subscription)mSubscriptions.get(((Object) (s)));
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
				obj = ((Object) (new Subscription()));
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
			subscriptioncallback.setSubscription(((Subscription) (obj)));
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
			((Subscription) (obj)).putCallback(bundle, subscriptioncallback);
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
				((ServiceBinderWrapper) (obj)).addSubscription(s, subscriptioncallback.mToken, bundle, mCallbacksMessenger);
		//   49   97:aload           4
		//   50   99:aload_1         
		//   51  100:aload_3         
		//   52  101:getfield        #388 <Field IBinder MediaBrowserCompat$SubscriptionCallback.mToken>
		//   53  104:aload_2         
		//   54  105:aload_0         
		//   55  106:getfield        #112 <Field Messenger mCallbacksMessenger>
		//   56  109:invokevirtual   #392 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
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

		public void unsubscribe(String s, SubscriptionCallback subscriptioncallback)
		{
			Subscription subscription;
			Object obj;
			subscription = (Subscription)mSubscriptions.get(((Object) (s)));
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
				((ServiceBinderWrapper) (obj)).removeSubscription(s, ((IBinder) (null)), mCallbacksMessenger);
		//   62  135:aload           5
		//   63  137:aload_1         
		//   64  138:aconst_null     
		//   65  139:aload_0         
		//   66  140:getfield        #112 <Field Messenger mCallbacksMessenger>
		//   67  143:invokevirtual   #422 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
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
		//*  91  195:getfield        #388 <Field IBinder MediaBrowserCompat$SubscriptionCallback.mToken>
		//*  92  198:aload_0         
		//*  93  199:getfield        #112 <Field Messenger mCallbacksMessenger>
		//*  94  202:invokevirtual   #422 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
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
		protected final CallbackHandler mHandler = new CallbackHandler(((MediaBrowserServiceCallbackImpl) (this)));
		private android.support.v4.media.session.MediaSessionCompat.Token mMediaSessionToken;
		private Bundle mNotifyChildrenChangedOptions;
		protected final Bundle mRootHints;
		protected ServiceBinderWrapper mServiceBinderWrapper;
		protected int mServiceVersion;
		private final ArrayMap mSubscriptions = new ArrayMap();

		MediaBrowserImplApi21(Context context, ComponentName componentname, ConnectionCallback connectioncallback, Bundle bundle)
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
			connectioncallback.setInternalConnectionCallback(((ConnectionCallback.ConnectionCallbackInternal) (this)));
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

		MediaBrowserImplApi23(Context context, ComponentName componentname, ConnectionCallback connectioncallback, Bundle bundle)
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

	static class MediaBrowserImplApi26 extends MediaBrowserImplApi23
	{

		public void subscribe(String s, Bundle bundle, SubscriptionCallback subscriptioncallback)
		{
			if(mServiceBinderWrapper != null && mServiceVersion >= 2)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//*   2    4:ifnull          26
		//*   3    7:aload_0         
		//*   4    8:getfield        #27  <Field int mServiceVersion>
		//*   5   11:iconst_2        
		//*   6   12:icmpge          18
		//*   7   15:goto            26
			{
				super.subscribe(s, bundle, subscriptioncallback);
		//    8   18:aload_0         
		//    9   19:aload_1         
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:invokespecial   #29  <Method void MediaBrowserCompat$MediaBrowserImplApi23.subscribe(String, Bundle, MediaBrowserCompat$SubscriptionCallback)>
				return;
		//   13   25:return          
			}
			if(bundle == null)
		//*  14   26:aload_2         
		//*  15   27:ifnonnull       43
			{
				MediaBrowserCompatApi21.subscribe(mBrowserObj, s, subscriptioncallback.mSubscriptionCallbackObj);
		//   16   30:aload_0         
		//   17   31:getfield        #33  <Field Object mBrowserObj>
		//   18   34:aload_1         
		//   19   35:aload_3         
		//   20   36:getfield        #38  <Field Object MediaBrowserCompat$SubscriptionCallback.mSubscriptionCallbackObj>
		//   21   39:invokestatic    #43  <Method void MediaBrowserCompatApi21.subscribe(Object, String, Object)>
				return;
		//   22   42:return          
			} else
			{
				MediaBrowserCompatApi26.subscribe(mBrowserObj, s, bundle, subscriptioncallback.mSubscriptionCallbackObj);
		//   23   43:aload_0         
		//   24   44:getfield        #33  <Field Object mBrowserObj>
		//   25   47:aload_1         
		//   26   48:aload_2         
		//   27   49:aload_3         
		//   28   50:getfield        #38  <Field Object MediaBrowserCompat$SubscriptionCallback.mSubscriptionCallbackObj>
		//   29   53:invokestatic    #48  <Method void MediaBrowserCompatApi26.subscribe(Object, String, Bundle, Object)>
				return;
		//   30   56:return          
			}
		}

		public void unsubscribe(String s, SubscriptionCallback subscriptioncallback)
		{
			if(mServiceBinderWrapper != null && mServiceVersion >= 2)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//*   2    4:ifnull          25
		//*   3    7:aload_0         
		//*   4    8:getfield        #27  <Field int mServiceVersion>
		//*   5   11:iconst_2        
		//*   6   12:icmpge          18
		//*   7   15:goto            25
			{
				super.unsubscribe(s, subscriptioncallback);
		//    8   18:aload_0         
		//    9   19:aload_1         
		//   10   20:aload_2         
		//   11   21:invokespecial   #53  <Method void MediaBrowserCompat$MediaBrowserImplApi23.unsubscribe(String, MediaBrowserCompat$SubscriptionCallback)>
				return;
		//   12   24:return          
			}
			if(subscriptioncallback == null)
		//*  13   25:aload_2         
		//*  14   26:ifnonnull       38
			{
				MediaBrowserCompatApi21.unsubscribe(mBrowserObj, s);
		//   15   29:aload_0         
		//   16   30:getfield        #33  <Field Object mBrowserObj>
		//   17   33:aload_1         
		//   18   34:invokestatic    #56  <Method void MediaBrowserCompatApi21.unsubscribe(Object, String)>
				return;
		//   19   37:return          
			} else
			{
				MediaBrowserCompatApi26.unsubscribe(mBrowserObj, s, subscriptioncallback.mSubscriptionCallbackObj);
		//   20   38:aload_0         
		//   21   39:getfield        #33  <Field Object mBrowserObj>
		//   22   42:aload_1         
		//   23   43:aload_2         
		//   24   44:getfield        #38  <Field Object MediaBrowserCompat$SubscriptionCallback.mSubscriptionCallbackObj>
		//   25   47:invokestatic    #58  <Method void MediaBrowserCompatApi26.unsubscribe(Object, String, Object)>
				return;
		//   26   50:return          
			}
		}

		MediaBrowserImplApi26(Context context, ComponentName componentname, ConnectionCallback connectioncallback, Bundle bundle)
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
		//		               0 74
		//		               1 71
		//		               2 68
		//		               3 65
		//		               4 62
			default:
				StringBuilder stringbuilder = new StringBuilder();
		//    2   36:new             #115 <Class StringBuilder>
		//    3   39:dup             
		//    4   40:invokespecial   #116 <Method void StringBuilder()>
		//    5   43:astore_1        
				stringbuilder.append("UNKNOWN/");
		//    6   44:aload_1         
		//    7   45:ldc1            #118 <String "UNKNOWN/">
		//    8   47:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//    9   50:pop             
				stringbuilder.append(i);
		//   10   51:aload_1         
		//   11   52:iload_0         
		//   12   53:invokevirtual   #125 <Method StringBuilder StringBuilder.append(int)>
		//   13   56:pop             
				return stringbuilder.toString();
		//   14   57:aload_1         
		//   15   58:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   16   61:areturn         

			case 4: // '\004'
				return "CONNECT_STATE_SUSPENDED";
		//   17   62:ldc1            #130 <String "CONNECT_STATE_SUSPENDED">
		//   18   64:areturn         

			case 3: // '\003'
				return "CONNECT_STATE_CONNECTED";
		//   19   65:ldc1            #131 <String "CONNECT_STATE_CONNECTED">
		//   20   67:areturn         

			case 2: // '\002'
				return "CONNECT_STATE_CONNECTING";
		//   21   68:ldc1            #132 <String "CONNECT_STATE_CONNECTING">
		//   22   70:areturn         

			case 1: // '\001'
				return "CONNECT_STATE_DISCONNECTED";
		//   23   71:ldc1            #133 <String "CONNECT_STATE_DISCONNECTED">
		//   24   73:areturn         

			case 0: // '\0'
				return "CONNECT_STATE_DISCONNECTING";
		//   25   74:ldc1            #134 <String "CONNECT_STATE_DISCONNECTING">
		//   26   76:areturn         
			}
		}

		private boolean isCurrent(Messenger messenger, String s)
		{
			if(mCallbacksMessenger == messenger)
		//*   0    0:aload_0         
		//*   1    1:getfield        #138 <Field Messenger mCallbacksMessenger>
		//*   2    4:aload_1         
		//*   3    5:if_acmpne       27
			{
				int i = mState;
		//    4    8:aload_0         
		//    5    9:getfield        #86  <Field int mState>
		//    6   12:istore_3        
				if(i != 0 && i != 1)
		//*   7   13:iload_3         
		//*   8   14:ifeq            27
		//*   9   17:iload_3         
		//*  10   18:iconst_1        
		//*  11   19:icmpne          25
		//*  12   22:goto            27
					return true;
		//   13   25:iconst_1        
		//   14   26:ireturn         
			}
			int j = mState;
		//   15   27:aload_0         
		//   16   28:getfield        #86  <Field int mState>
		//   17   31:istore_3        
			if(j != 0 && j != 1)
		//*  18   32:iload_3         
		//*  19   33:ifeq            110
		//*  20   36:iload_3         
		//*  21   37:iconst_1        
		//*  22   38:icmpeq          110
			{
				messenger = ((Messenger) (new StringBuilder()));
		//   23   41:new             #115 <Class StringBuilder>
		//   24   44:dup             
		//   25   45:invokespecial   #116 <Method void StringBuilder()>
		//   26   48:astore_1        
				((StringBuilder) (messenger)).append(s);
		//   27   49:aload_1         
		//   28   50:aload_2         
		//   29   51:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   30   54:pop             
				((StringBuilder) (messenger)).append(" for ");
		//   31   55:aload_1         
		//   32   56:ldc1            #140 <String " for ">
		//   33   58:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   34   61:pop             
				((StringBuilder) (messenger)).append(((Object) (mServiceComponent)));
		//   35   62:aload_1         
		//   36   63:aload_0         
		//   37   64:getfield        #90  <Field ComponentName mServiceComponent>
		//   38   67:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//   39   70:pop             
				((StringBuilder) (messenger)).append(" with mCallbacksMessenger=");
		//   40   71:aload_1         
		//   41   72:ldc1            #145 <String " with mCallbacksMessenger=">
		//   42   74:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   43   77:pop             
				((StringBuilder) (messenger)).append(((Object) (mCallbacksMessenger)));
		//   44   78:aload_1         
		//   45   79:aload_0         
		//   46   80:getfield        #138 <Field Messenger mCallbacksMessenger>
		//   47   83:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//   48   86:pop             
				((StringBuilder) (messenger)).append(" this=");
		//   49   87:aload_1         
		//   50   88:ldc1            #147 <String " this=">
		//   51   90:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   52   93:pop             
				((StringBuilder) (messenger)).append(((Object) (this)));
		//   53   94:aload_1         
		//   54   95:aload_0         
		//   55   96:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//   56   99:pop             
				Log.i("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
		//   57  100:ldc1            #149 <String "MediaBrowserCompat">
		//   58  102:aload_1         
		//   59  103:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   60  106:invokestatic    #155 <Method int Log.i(String, String)>
		//   61  109:pop             
			}
			return false;
		//   62  110:iconst_0        
		//   63  111:ireturn         
		}

		public void connect()
		{
			int i = mState;
		//    0    0:aload_0         
		//    1    1:getfield        #86  <Field int mState>
		//    2    4:istore_1        
			if(i != 0 && i != 1)
		//*   3    5:iload_1         
		//*   4    6:ifeq            63
		//*   5    9:iload_1         
		//*   6   10:iconst_1        
		//*   7   11:icmpne          17
		//*   8   14:goto            63
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    9   17:new             #115 <Class StringBuilder>
		//   10   20:dup             
		//   11   21:invokespecial   #116 <Method void StringBuilder()>
		//   12   24:astore_2        
				stringbuilder.append("connect() called while neigther disconnecting nor disconnected (state=");
		//   13   25:aload_2         
		//   14   26:ldc1            #158 <String "connect() called while neigther disconnecting nor disconnected (state=">
		//   15   28:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   16   31:pop             
				stringbuilder.append(getStateLabel(mState));
		//   17   32:aload_2         
		//   18   33:aload_0         
		//   19   34:getfield        #86  <Field int mState>
		//   20   37:invokestatic    #160 <Method String getStateLabel(int)>
		//   21   40:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   22   43:pop             
				stringbuilder.append(")");
		//   23   44:aload_2         
		//   24   45:ldc1            #162 <String ")">
		//   25   47:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   26   50:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   27   51:new             #164 <Class IllegalStateException>
		//   28   54:dup             
		//   29   55:aload_2         
		//   30   56:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   31   59:invokespecial   #165 <Method void IllegalStateException(String)>
		//   32   62:athrow          
			} else
			{
				mState = 2;
		//   33   63:aload_0         
		//   34   64:iconst_2        
		//   35   65:putfield        #86  <Field int mState>
				mHandler.post(new Runnable() {

					public void run()
					{
						if(mState == 0)
					//*   0    0:aload_0         
					//*   1    1:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//*   2    4:getfield        #30  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
					//*   3    7:ifne            11
							return;
					//    4   10:return          
						mState = 2;
					//    5   11:aload_0         
					//    6   12:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//    7   15:iconst_2        
					//    8   16:putfield        #30  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
						if(MediaBrowserCompat.DEBUG && mServiceConnection != null)
					//*   9   19:getstatic       #34  <Field boolean MediaBrowserCompat.DEBUG>
					//*  10   22:ifeq            77
					//*  11   25:aload_0         
					//*  12   26:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//*  13   29:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
					//*  14   32:ifnonnull       38
					//*  15   35:goto            77
						{
							StringBuilder stringbuilder = new StringBuilder();
					//   16   38:new             #40  <Class StringBuilder>
					//   17   41:dup             
					//   18   42:invokespecial   #41  <Method void StringBuilder()>
					//   19   45:astore_3        
							stringbuilder.append("mServiceConnection should be null. Instead it is ");
					//   20   46:aload_3         
					//   21   47:ldc1            #43  <String "mServiceConnection should be null. Instead it is ">
					//   22   49:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
					//   23   52:pop             
							stringbuilder.append(((Object) (mServiceConnection)));
					//   24   53:aload_3         
					//   25   54:aload_0         
					//   26   55:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   27   58:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
					//   28   61:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
					//   29   64:pop             
							throw new RuntimeException(stringbuilder.toString());
					//   30   65:new             #52  <Class RuntimeException>
					//   31   68:dup             
					//   32   69:aload_3         
					//   33   70:invokevirtual   #56  <Method String StringBuilder.toString()>
					//   34   73:invokespecial   #59  <Method void RuntimeException(String)>
					//   35   76:athrow          
						}
						if(mServiceBinderWrapper != null) goto _L2; else goto _L1
					//   36   77:aload_0         
					//   37   78:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   38   81:getfield        #63  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
					//   39   84:ifnonnull       285
_L1:
						if(mCallbacksMessenger != null) goto _L4; else goto _L3
					//   40   87:aload_0         
					//   41   88:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   42   91:getfield        #67  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
					//   43   94:ifnonnull       246
_L3:
						boolean flag;
						Intent intent;
						intent = new Intent("android.media.browse.MediaBrowserService");
					//   44   97:new             #69  <Class Intent>
					//   45  100:dup             
					//   46  101:ldc1            #71  <String "android.media.browse.MediaBrowserService">
					//   47  103:invokespecial   #72  <Method void Intent(String)>
					//   48  106:astore_3        
						intent.setComponent(mServiceComponent);
					//   49  107:aload_3         
					//   50  108:aload_0         
					//   51  109:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   52  112:getfield        #76  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
					//   53  115:invokevirtual   #80  <Method Intent Intent.setComponent(ComponentName)>
					//   54  118:pop             
						MediaBrowserImplBase mediabrowserimplbase = MediaBrowserImplBase.this;
					//   55  119:aload_0         
					//   56  120:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   57  123:astore          4
						mediabrowserimplbase.mServiceConnection = ((MediaBrowserImplBase.MediaServiceConnection) (mediabrowserimplbase)). new MediaBrowserImplBase.MediaServiceConnection();
					//   58  125:aload           4
					//   59  127:new             #82  <Class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection>
					//   60  130:dup             
					//   61  131:aload           4
					//   62  133:invokespecial   #84  <Method void MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection(MediaBrowserCompat$MediaBrowserImplBase)>
					//   63  136:putfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
						flag = false;
					//   64  139:iconst_0        
					//   65  140:istore_1        
						boolean flag1 = mContext.bindService(intent, ((ServiceConnection) (mServiceConnection)), 1);
					//   66  141:aload_0         
					//   67  142:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   68  145:getfield        #88  <Field Context MediaBrowserCompat$MediaBrowserImplBase.mContext>
					//   69  148:aload_3         
					//   70  149:aload_0         
					//   71  150:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   72  153:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
					//   73  156:iconst_1        
					//   74  157:invokevirtual   #94  <Method boolean Context.bindService(Intent, ServiceConnection, int)>
					//   75  160:istore_2        
						flag = flag1;
					//   76  161:iload_2         
					//   77  162:istore_1        
						  goto _L5
					//*  78  163:goto            203
_L7:
						StringBuilder stringbuilder1 = new StringBuilder();
					//   79  166:new             #40  <Class StringBuilder>
					//   80  169:dup             
					//   81  170:invokespecial   #41  <Method void StringBuilder()>
					//   82  173:astore_3        
						stringbuilder1.append("Failed binding to service ");
					//   83  174:aload_3         
					//   84  175:ldc1            #96  <String "Failed binding to service ">
					//   85  177:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
					//   86  180:pop             
						stringbuilder1.append(((Object) (mServiceComponent)));
					//   87  181:aload_3         
					//   88  182:aload_0         
					//   89  183:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   90  186:getfield        #76  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
					//   91  189:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
					//   92  192:pop             
						Log.e("MediaBrowserCompat", stringbuilder1.toString());
					//   93  193:ldc1            #98  <String "MediaBrowserCompat">
					//   94  195:aload_3         
					//   95  196:invokevirtual   #56  <Method String StringBuilder.toString()>
					//   96  199:invokestatic    #104 <Method int Log.e(String, String)>
					//   97  202:pop             
_L5:
						if(!flag)
					//*  98  203:iload_1         
					//*  99  204:ifne            224
						{
							forceCloseConnection();
					//  100  207:aload_0         
					//  101  208:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//  102  211:invokevirtual   #107 <Method void MediaBrowserCompat$MediaBrowserImplBase.forceCloseConnection()>
							mCallback.onConnectionFailed();
					//  103  214:aload_0         
					//  104  215:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//  105  218:getfield        #111 <Field MediaBrowserCompat$ConnectionCallback MediaBrowserCompat$MediaBrowserImplBase.mCallback>
					//  106  221:invokevirtual   #116 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
						}
						if(MediaBrowserCompat.DEBUG)
					//* 107  224:getstatic       #34  <Field boolean MediaBrowserCompat.DEBUG>
					//* 108  227:ifeq            245
						{
							Log.d("MediaBrowserCompat", "connect...");
					//  109  230:ldc1            #98  <String "MediaBrowserCompat">
					//  110  232:ldc1            #118 <String "connect...">
					//  111  234:invokestatic    #121 <Method int Log.d(String, String)>
					//  112  237:pop             
							dump();
					//  113  238:aload_0         
					//  114  239:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//  115  242:invokevirtual   #124 <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
						}
						return;
					//  116  245:return          
_L4:
						StringBuilder stringbuilder2 = new StringBuilder();
					//  117  246:new             #40  <Class StringBuilder>
					//  118  249:dup             
					//  119  250:invokespecial   #41  <Method void StringBuilder()>
					//  120  253:astore_3        
						stringbuilder2.append("mCallbacksMessenger should be null. Instead it is ");
					//  121  254:aload_3         
					//  122  255:ldc1            #126 <String "mCallbacksMessenger should be null. Instead it is ">
					//  123  257:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
					//  124  260:pop             
						stringbuilder2.append(((Object) (mCallbacksMessenger)));
					//  125  261:aload_3         
					//  126  262:aload_0         
					//  127  263:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//  128  266:getfield        #67  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
					//  129  269:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
					//  130  272:pop             
						throw new RuntimeException(stringbuilder2.toString());
					//  131  273:new             #52  <Class RuntimeException>
					//  132  276:dup             
					//  133  277:aload_3         
					//  134  278:invokevirtual   #56  <Method String StringBuilder.toString()>
					//  135  281:invokespecial   #59  <Method void RuntimeException(String)>
					//  136  284:athrow          
_L2:
						StringBuilder stringbuilder3 = new StringBuilder();
					//  137  285:new             #40  <Class StringBuilder>
					//  138  288:dup             
					//  139  289:invokespecial   #41  <Method void StringBuilder()>
					//  140  292:astore_3        
						stringbuilder3.append("mServiceBinderWrapper should be null. Instead it is ");
					//  141  293:aload_3         
					//  142  294:ldc1            #128 <String "mServiceBinderWrapper should be null. Instead it is ">
					//  143  296:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
					//  144  299:pop             
						stringbuilder3.append(((Object) (mServiceBinderWrapper)));
					//  145  300:aload_3         
					//  146  301:aload_0         
					//  147  302:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//  148  305:getfield        #63  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
					//  149  308:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
					//  150  311:pop             
						throw new RuntimeException(stringbuilder3.toString());
					//  151  312:new             #52  <Class RuntimeException>
					//  152  315:dup             
					//  153  316:aload_3         
					//  154  317:invokevirtual   #56  <Method String StringBuilder.toString()>
					//  155  320:invokespecial   #59  <Method void RuntimeException(String)>
					//  156  323:athrow          
						Exception exception;
						exception;
					//  157  324:astore_3        
						if(true) goto _L7; else goto _L6
_L6:
					//* 158  325:goto            166
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
		//   36   68:aload_0         
		//   37   69:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   38   72:new             #13  <Class MediaBrowserCompat$MediaBrowserImplBase$1>
		//   39   75:dup             
		//   40   76:aload_0         
		//   41   77:invokespecial   #168 <Method void MediaBrowserCompat$MediaBrowserImplBase$1(MediaBrowserCompat$MediaBrowserImplBase)>
		//   42   80:invokevirtual   #172 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   43   83:pop             
				return;
		//   44   84:return          
			}
		}

		public void disconnect()
		{
			mState = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #86  <Field int mState>
			mHandler.post(new Runnable() {

				public void run()
				{
					RemoteException remoteexception;
					StringBuilder stringbuilder;
					if(mCallbacksMessenger != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//*   2    4:getfield        #30  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
				//*   3    7:ifnull          67
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
				//*  11   27:goto            67
				//*  12   30:new             #41  <Class StringBuilder>
				//*  13   33:dup             
				//*  14   34:invokespecial   #42  <Method void StringBuilder()>
				//*  15   37:astore_2        
				//*  16   38:aload_2         
				//*  17   39:ldc1            #44  <String "RemoteException during connect for ">
				//*  18   41:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
				//*  19   44:pop             
				//*  20   45:aload_2         
				//*  21   46:aload_0         
				//*  22   47:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//*  23   50:getfield        #52  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
				//*  24   53:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
				//*  25   56:pop             
				//*  26   57:ldc1            #57  <String "MediaBrowserCompat">
				//*  27   59:aload_2         
				//*  28   60:invokevirtual   #61  <Method String StringBuilder.toString()>
				//*  29   63:invokestatic    #67  <Method int Log.w(String, String)>
				//*  30   66:pop             
				//*  31   67:aload_0         
				//*  32   68:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//*  33   71:getfield        #71  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
				//*  34   74:istore_1        
				//*  35   75:aload_0         
				//*  36   76:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//*  37   79:invokevirtual   #74  <Method void MediaBrowserCompat$MediaBrowserImplBase.forceCloseConnection()>
				//*  38   82:iload_1         
				//*  39   83:ifeq            94
				//*  40   86:aload_0         
				//*  41   87:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//*  42   90:iload_1         
				//*  43   91:putfield        #71  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
				//*  44   94:getstatic       #78  <Field boolean MediaBrowserCompat.DEBUG>
				//*  45   97:ifeq            115
				//*  46  100:ldc1            #57  <String "MediaBrowserCompat">
				//*  47  102:ldc1            #80  <String "disconnect...">
				//*  48  104:invokestatic    #83  <Method int Log.d(String, String)>
				//*  49  107:pop             
				//*  50  108:aload_0         
				//*  51  109:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//*  52  112:invokevirtual   #86  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
				//*  53  115:return          
						// Misplaced declaration of an exception variable
						catch(RemoteException remoteexception)
						{
							stringbuilder = new StringBuilder();
							stringbuilder.append("RemoteException during connect for ");
							stringbuilder.append(((Object) (mServiceComponent)));
							Log.w("MediaBrowserCompat", stringbuilder.toString());
						}
					int i = mState;
					forceCloseConnection();
					if(i != 0)
						mState = i;
					if(MediaBrowserCompat.DEBUG)
					{
						Log.d("MediaBrowserCompat", "disconnect...");
						dump();
					}
				//*  54  116:astore_2        
				//*  55  117:goto            30
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
		//    4    6:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//    5    9:new             #15  <Class MediaBrowserCompat$MediaBrowserImplBase$2>
		//    6   12:dup             
		//    7   13:aload_0         
		//    8   14:invokespecial   #174 <Method void MediaBrowserCompat$MediaBrowserImplBase$2(MediaBrowserCompat$MediaBrowserImplBase)>
		//    9   17:invokevirtual   #172 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   10   20:pop             
		//   11   21:return          
		}

		void dump()
		{
			Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
		//    0    0:ldc1            #149 <String "MediaBrowserCompat">
		//    1    2:ldc1            #177 <String "MediaBrowserCompat...">
		//    2    4:invokestatic    #180 <Method int Log.d(String, String)>
		//    3    7:pop             
			StringBuilder stringbuilder = new StringBuilder();
		//    4    8:new             #115 <Class StringBuilder>
		//    5   11:dup             
		//    6   12:invokespecial   #116 <Method void StringBuilder()>
		//    7   15:astore_1        
			stringbuilder.append("  mServiceComponent=");
		//    8   16:aload_1         
		//    9   17:ldc1            #182 <String "  mServiceComponent=">
		//   10   19:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   11   22:pop             
			stringbuilder.append(((Object) (mServiceComponent)));
		//   12   23:aload_1         
		//   13   24:aload_0         
		//   14   25:getfield        #90  <Field ComponentName mServiceComponent>
		//   15   28:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//   16   31:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//   17   32:ldc1            #149 <String "MediaBrowserCompat">
		//   18   34:aload_1         
		//   19   35:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   20   38:invokestatic    #180 <Method int Log.d(String, String)>
		//   21   41:pop             
			stringbuilder = new StringBuilder();
		//   22   42:new             #115 <Class StringBuilder>
		//   23   45:dup             
		//   24   46:invokespecial   #116 <Method void StringBuilder()>
		//   25   49:astore_1        
			stringbuilder.append("  mCallback=");
		//   26   50:aload_1         
		//   27   51:ldc1            #184 <String "  mCallback=">
		//   28   53:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   29   56:pop             
			stringbuilder.append(((Object) (mCallback)));
		//   30   57:aload_1         
		//   31   58:aload_0         
		//   32   59:getfield        #92  <Field MediaBrowserCompat$ConnectionCallback mCallback>
		//   33   62:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//   34   65:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//   35   66:ldc1            #149 <String "MediaBrowserCompat">
		//   36   68:aload_1         
		//   37   69:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   38   72:invokestatic    #180 <Method int Log.d(String, String)>
		//   39   75:pop             
			stringbuilder = new StringBuilder();
		//   40   76:new             #115 <Class StringBuilder>
		//   41   79:dup             
		//   42   80:invokespecial   #116 <Method void StringBuilder()>
		//   43   83:astore_1        
			stringbuilder.append("  mRootHints=");
		//   44   84:aload_1         
		//   45   85:ldc1            #186 <String "  mRootHints=">
		//   46   87:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   47   90:pop             
			stringbuilder.append(((Object) (mRootHints)));
		//   48   91:aload_1         
		//   49   92:aload_0         
		//   50   93:getfield        #99  <Field Bundle mRootHints>
		//   51   96:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//   52   99:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//   53  100:ldc1            #149 <String "MediaBrowserCompat">
		//   54  102:aload_1         
		//   55  103:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   56  106:invokestatic    #180 <Method int Log.d(String, String)>
		//   57  109:pop             
			stringbuilder = new StringBuilder();
		//   58  110:new             #115 <Class StringBuilder>
		//   59  113:dup             
		//   60  114:invokespecial   #116 <Method void StringBuilder()>
		//   61  117:astore_1        
			stringbuilder.append("  mState=");
		//   62  118:aload_1         
		//   63  119:ldc1            #188 <String "  mState=">
		//   64  121:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   65  124:pop             
			stringbuilder.append(getStateLabel(mState));
		//   66  125:aload_1         
		//   67  126:aload_0         
		//   68  127:getfield        #86  <Field int mState>
		//   69  130:invokestatic    #160 <Method String getStateLabel(int)>
		//   70  133:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   71  136:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//   72  137:ldc1            #149 <String "MediaBrowserCompat">
		//   73  139:aload_1         
		//   74  140:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   75  143:invokestatic    #180 <Method int Log.d(String, String)>
		//   76  146:pop             
			stringbuilder = new StringBuilder();
		//   77  147:new             #115 <Class StringBuilder>
		//   78  150:dup             
		//   79  151:invokespecial   #116 <Method void StringBuilder()>
		//   80  154:astore_1        
			stringbuilder.append("  mServiceConnection=");
		//   81  155:aload_1         
		//   82  156:ldc1            #190 <String "  mServiceConnection=">
		//   83  158:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   84  161:pop             
			stringbuilder.append(((Object) (mServiceConnection)));
		//   85  162:aload_1         
		//   86  163:aload_0         
		//   87  164:getfield        #192 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
		//   88  167:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//   89  170:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//   90  171:ldc1            #149 <String "MediaBrowserCompat">
		//   91  173:aload_1         
		//   92  174:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   93  177:invokestatic    #180 <Method int Log.d(String, String)>
		//   94  180:pop             
			stringbuilder = new StringBuilder();
		//   95  181:new             #115 <Class StringBuilder>
		//   96  184:dup             
		//   97  185:invokespecial   #116 <Method void StringBuilder()>
		//   98  188:astore_1        
			stringbuilder.append("  mServiceBinderWrapper=");
		//   99  189:aload_1         
		//  100  190:ldc1            #194 <String "  mServiceBinderWrapper=">
		//  101  192:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//  102  195:pop             
			stringbuilder.append(((Object) (mServiceBinderWrapper)));
		//  103  196:aload_1         
		//  104  197:aload_0         
		//  105  198:getfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//  106  201:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//  107  204:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//  108  205:ldc1            #149 <String "MediaBrowserCompat">
		//  109  207:aload_1         
		//  110  208:invokevirtual   #129 <Method String StringBuilder.toString()>
		//  111  211:invokestatic    #180 <Method int Log.d(String, String)>
		//  112  214:pop             
			stringbuilder = new StringBuilder();
		//  113  215:new             #115 <Class StringBuilder>
		//  114  218:dup             
		//  115  219:invokespecial   #116 <Method void StringBuilder()>
		//  116  222:astore_1        
			stringbuilder.append("  mCallbacksMessenger=");
		//  117  223:aload_1         
		//  118  224:ldc1            #198 <String "  mCallbacksMessenger=">
		//  119  226:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//  120  229:pop             
			stringbuilder.append(((Object) (mCallbacksMessenger)));
		//  121  230:aload_1         
		//  122  231:aload_0         
		//  123  232:getfield        #138 <Field Messenger mCallbacksMessenger>
		//  124  235:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//  125  238:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//  126  239:ldc1            #149 <String "MediaBrowserCompat">
		//  127  241:aload_1         
		//  128  242:invokevirtual   #129 <Method String StringBuilder.toString()>
		//  129  245:invokestatic    #180 <Method int Log.d(String, String)>
		//  130  248:pop             
			stringbuilder = new StringBuilder();
		//  131  249:new             #115 <Class StringBuilder>
		//  132  252:dup             
		//  133  253:invokespecial   #116 <Method void StringBuilder()>
		//  134  256:astore_1        
			stringbuilder.append("  mRootId=");
		//  135  257:aload_1         
		//  136  258:ldc1            #200 <String "  mRootId=">
		//  137  260:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//  138  263:pop             
			stringbuilder.append(mRootId);
		//  139  264:aload_1         
		//  140  265:aload_0         
		//  141  266:getfield        #202 <Field String mRootId>
		//  142  269:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//  143  272:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//  144  273:ldc1            #149 <String "MediaBrowserCompat">
		//  145  275:aload_1         
		//  146  276:invokevirtual   #129 <Method String StringBuilder.toString()>
		//  147  279:invokestatic    #180 <Method int Log.d(String, String)>
		//  148  282:pop             
			stringbuilder = new StringBuilder();
		//  149  283:new             #115 <Class StringBuilder>
		//  150  286:dup             
		//  151  287:invokespecial   #116 <Method void StringBuilder()>
		//  152  290:astore_1        
			stringbuilder.append("  mMediaSessionToken=");
		//  153  291:aload_1         
		//  154  292:ldc1            #204 <String "  mMediaSessionToken=">
		//  155  294:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//  156  297:pop             
			stringbuilder.append(((Object) (mMediaSessionToken)));
		//  157  298:aload_1         
		//  158  299:aload_0         
		//  159  300:getfield        #206 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		//  160  303:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//  161  306:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//  162  307:ldc1            #149 <String "MediaBrowserCompat">
		//  163  309:aload_1         
		//  164  310:invokevirtual   #129 <Method String StringBuilder.toString()>
		//  165  313:invokestatic    #180 <Method int Log.d(String, String)>
		//  166  316:pop             
		//  167  317:return          
		}

		void forceCloseConnection()
		{
			MediaServiceConnection mediaserviceconnection = mServiceConnection;
		//    0    0:aload_0         
		//    1    1:getfield        #192 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
		//    2    4:astore_1        
			if(mediaserviceconnection != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          17
				mContext.unbindService(((ServiceConnection) (mediaserviceconnection)));
		//    5    9:aload_0         
		//    6   10:getfield        #88  <Field Context mContext>
		//    7   13:aload_1         
		//    8   14:invokevirtual   #213 <Method void Context.unbindService(ServiceConnection)>
			mState = 1;
		//    9   17:aload_0         
		//   10   18:iconst_1        
		//   11   19:putfield        #86  <Field int mState>
			mServiceConnection = null;
		//   12   22:aload_0         
		//   13   23:aconst_null     
		//   14   24:putfield        #192 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
			mServiceBinderWrapper = null;
		//   15   27:aload_0         
		//   16   28:aconst_null     
		//   17   29:putfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
			mCallbacksMessenger = null;
		//   18   32:aload_0         
		//   19   33:aconst_null     
		//   20   34:putfield        #138 <Field Messenger mCallbacksMessenger>
			mHandler.setCallbacksMessenger(((Messenger) (null)));
		//   21   37:aload_0         
		//   22   38:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   23   41:aconst_null     
		//   24   42:invokevirtual   #217 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
			mRootId = null;
		//   25   45:aload_0         
		//   26   46:aconst_null     
		//   27   47:putfield        #202 <Field String mRootId>
			mMediaSessionToken = null;
		//   28   50:aload_0         
		//   29   51:aconst_null     
		//   30   52:putfield        #206 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		//   31   55:return          
		}

		public Bundle getExtras()
		{
			if(isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #224 <Method boolean isConnected()>
		//*   2    4:ifeq            12
			{
				return mExtras;
		//    3    7:aload_0         
		//    4    8:getfield        #226 <Field Bundle mExtras>
		//    5   11:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    6   12:new             #115 <Class StringBuilder>
		//    7   15:dup             
		//    8   16:invokespecial   #116 <Method void StringBuilder()>
		//    9   19:astore_1        
				stringbuilder.append("getExtras() called while not connected (state=");
		//   10   20:aload_1         
		//   11   21:ldc1            #228 <String "getExtras() called while not connected (state=">
		//   12   23:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
				stringbuilder.append(getStateLabel(mState));
		//   14   27:aload_1         
		//   15   28:aload_0         
		//   16   29:getfield        #86  <Field int mState>
		//   17   32:invokestatic    #160 <Method String getStateLabel(int)>
		//   18   35:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   19   38:pop             
				stringbuilder.append(")");
		//   20   39:aload_1         
		//   21   40:ldc1            #162 <String ")">
		//   22   42:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   23   45:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   24   46:new             #164 <Class IllegalStateException>
		//   25   49:dup             
		//   26   50:aload_1         
		//   27   51:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   28   54:invokespecial   #165 <Method void IllegalStateException(String)>
		//   29   57:athrow          
			}
		}

		public void getItem(String s, final ItemCallback cb)
		{
			RemoteException remoteexception;
			if(!TextUtils.isEmpty(((CharSequence) (s))))
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #240 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   2    4:ifne            135
			{
				if(cb != null)
		//*   3    7:aload_2         
		//*   4    8:ifnull          124
				{
					if(!isConnected())
		//*   5   11:aload_0         
		//*   6   12:invokevirtual   #224 <Method boolean isConnected()>
		//*   7   15:ifne            45
					{
						Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
		//    8   18:ldc1            #149 <String "MediaBrowserCompat">
		//    9   20:ldc1            #242 <String "Not connected, unable to retrieve the MediaItem.">
		//   10   22:invokestatic    #155 <Method int Log.i(String, String)>
		//   11   25:pop             
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
		//   12   26:aload_0         
		//   13   27:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   14   30:new             #17  <Class MediaBrowserCompat$MediaBrowserImplBase$3>
		//   15   33:dup             
		//   16   34:aload_0         
		//   17   35:aload_2         
		//   18   36:aload_1         
		//   19   37:invokespecial   #245 <Method void MediaBrowserCompat$MediaBrowserImplBase$3(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$ItemCallback, String)>
		//   20   40:invokevirtual   #172 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   21   43:pop             
						return;
		//   22   44:return          
					}
					Object obj = ((Object) (new ItemReceiver(s, cb, ((Handler) (mHandler)))));
		//   23   45:new             #247 <Class MediaBrowserCompat$ItemReceiver>
		//   24   48:dup             
		//   25   49:aload_1         
		//   26   50:aload_2         
		//   27   51:aload_0         
		//   28   52:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   29   55:invokespecial   #250 <Method void MediaBrowserCompat$ItemReceiver(String, MediaBrowserCompat$ItemCallback, Handler)>
		//   30   58:astore_3        
					try
					{
						mServiceBinderWrapper.getMediaItem(s, ((ResultReceiver) (obj)), mCallbacksMessenger);
		//   31   59:aload_0         
		//   32   60:getfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   33   63:aload_1         
		//   34   64:aload_3         
		//   35   65:aload_0         
		//   36   66:getfield        #138 <Field Messenger mCallbacksMessenger>
		//   37   69:invokevirtual   #256 <Method void MediaBrowserCompat$ServiceBinderWrapper.getMediaItem(String, ResultReceiver, Messenger)>
						return;
		//   38   72:return          
					}
		//*  39   73:new             #115 <Class StringBuilder>
		//*  40   76:dup             
		//*  41   77:invokespecial   #116 <Method void StringBuilder()>
		//*  42   80:astore_3        
		//*  43   81:aload_3         
		//*  44   82:ldc2            #258 <String "Remote error getting media item: ">
		//*  45   85:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//*  46   88:pop             
		//*  47   89:aload_3         
		//*  48   90:aload_1         
		//*  49   91:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//*  50   94:pop             
		//*  51   95:ldc1            #149 <String "MediaBrowserCompat">
		//*  52   97:aload_3         
		//*  53   98:invokevirtual   #129 <Method String StringBuilder.toString()>
		//*  54  101:invokestatic    #155 <Method int Log.i(String, String)>
		//*  55  104:pop             
		//*  56  105:aload_0         
		//*  57  106:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//*  58  109:new             #19  <Class MediaBrowserCompat$MediaBrowserImplBase$4>
		//*  59  112:dup             
		//*  60  113:aload_0         
		//*  61  114:aload_2         
		//*  62  115:aload_1         
		//*  63  116:invokespecial   #259 <Method void MediaBrowserCompat$MediaBrowserImplBase$4(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$ItemCallback, String)>
		//*  64  119:invokevirtual   #172 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//*  65  122:pop             
		//*  66  123:return          
		//*  67  124:new             #101 <Class IllegalArgumentException>
		//*  68  127:dup             
		//*  69  128:ldc2            #261 <String "cb is null">
		//*  70  131:invokespecial   #106 <Method void IllegalArgumentException(String)>
		//*  71  134:athrow          
		//*  72  135:new             #101 <Class IllegalArgumentException>
		//*  73  138:dup             
		//*  74  139:ldc2            #263 <String "mediaId is empty">
		//*  75  142:invokespecial   #106 <Method void IllegalArgumentException(String)>
		//*  76  145:athrow          
					// Misplaced declaration of an exception variable
					catch(RemoteException remoteexception)
					{
						obj = ((Object) (new StringBuilder()));
					}
					((StringBuilder) (obj)).append("Remote error getting media item: ");
					((StringBuilder) (obj)).append(s);
					Log.i("MediaBrowserCompat", ((StringBuilder) (obj)).toString());
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
					return;
				} else
				{
					throw new IllegalArgumentException("cb is null");
				}
			} else
			{
				throw new IllegalArgumentException("mediaId is empty");
			}
		//*  77  146:astore_3        
		//*  78  147:goto            73
		}

		public Bundle getNotifyChildrenChangedOptions()
		{
			return mNotifyChildrenChangedOptions;
		//    0    0:aload_0         
		//    1    1:getfield        #267 <Field Bundle mNotifyChildrenChangedOptions>
		//    2    4:areturn         
		}

		public String getRoot()
		{
			if(isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #224 <Method boolean isConnected()>
		//*   2    4:ifeq            12
			{
				return mRootId;
		//    3    7:aload_0         
		//    4    8:getfield        #202 <Field String mRootId>
		//    5   11:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    6   12:new             #115 <Class StringBuilder>
		//    7   15:dup             
		//    8   16:invokespecial   #116 <Method void StringBuilder()>
		//    9   19:astore_1        
				stringbuilder.append("getRoot() called while not connected(state=");
		//   10   20:aload_1         
		//   11   21:ldc2            #270 <String "getRoot() called while not connected(state=">
		//   12   24:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   13   27:pop             
				stringbuilder.append(getStateLabel(mState));
		//   14   28:aload_1         
		//   15   29:aload_0         
		//   16   30:getfield        #86  <Field int mState>
		//   17   33:invokestatic    #160 <Method String getStateLabel(int)>
		//   18   36:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   19   39:pop             
				stringbuilder.append(")");
		//   20   40:aload_1         
		//   21   41:ldc1            #162 <String ")">
		//   22   43:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   23   46:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   24   47:new             #164 <Class IllegalStateException>
		//   25   50:dup             
		//   26   51:aload_1         
		//   27   52:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   28   55:invokespecial   #165 <Method void IllegalStateException(String)>
		//   29   58:athrow          
			}
		}

		public ComponentName getServiceComponent()
		{
			if(isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #224 <Method boolean isConnected()>
		//*   2    4:ifeq            12
			{
				return mServiceComponent;
		//    3    7:aload_0         
		//    4    8:getfield        #90  <Field ComponentName mServiceComponent>
		//    5   11:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    6   12:new             #115 <Class StringBuilder>
		//    7   15:dup             
		//    8   16:invokespecial   #116 <Method void StringBuilder()>
		//    9   19:astore_1        
				stringbuilder.append("getServiceComponent() called while not connected (state=");
		//   10   20:aload_1         
		//   11   21:ldc2            #274 <String "getServiceComponent() called while not connected (state=">
		//   12   24:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   13   27:pop             
				stringbuilder.append(mState);
		//   14   28:aload_1         
		//   15   29:aload_0         
		//   16   30:getfield        #86  <Field int mState>
		//   17   33:invokevirtual   #125 <Method StringBuilder StringBuilder.append(int)>
		//   18   36:pop             
				stringbuilder.append(")");
		//   19   37:aload_1         
		//   20   38:ldc1            #162 <String ")">
		//   21   40:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   22   43:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   23   44:new             #164 <Class IllegalStateException>
		//   24   47:dup             
		//   25   48:aload_1         
		//   26   49:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   27   52:invokespecial   #165 <Method void IllegalStateException(String)>
		//   28   55:athrow          
			}
		}

		public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
		{
			if(isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #224 <Method boolean isConnected()>
		//*   2    4:ifeq            12
			{
				return mMediaSessionToken;
		//    3    7:aload_0         
		//    4    8:getfield        #206 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		//    5   11:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    6   12:new             #115 <Class StringBuilder>
		//    7   15:dup             
		//    8   16:invokespecial   #116 <Method void StringBuilder()>
		//    9   19:astore_1        
				stringbuilder.append("getSessionToken() called while not connected(state=");
		//   10   20:aload_1         
		//   11   21:ldc2            #278 <String "getSessionToken() called while not connected(state=">
		//   12   24:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   13   27:pop             
				stringbuilder.append(mState);
		//   14   28:aload_1         
		//   15   29:aload_0         
		//   16   30:getfield        #86  <Field int mState>
		//   17   33:invokevirtual   #125 <Method StringBuilder StringBuilder.append(int)>
		//   18   36:pop             
				stringbuilder.append(")");
		//   19   37:aload_1         
		//   20   38:ldc1            #162 <String ")">
		//   21   40:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   22   43:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   23   44:new             #164 <Class IllegalStateException>
		//   24   47:dup             
		//   25   48:aload_1         
		//   26   49:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   27   52:invokespecial   #165 <Method void IllegalStateException(String)>
		//   28   55:athrow          
			}
		}

		public boolean isConnected()
		{
			return mState == 3;
		//    0    0:aload_0         
		//    1    1:getfield        #86  <Field int mState>
		//    2    4:iconst_3        
		//    3    5:icmpne          10
		//    4    8:iconst_1        
		//    5    9:ireturn         
		//    6   10:iconst_0        
		//    7   11:ireturn         
		}

		public void onConnectionFailed(Messenger messenger)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #115 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #116 <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("onConnectFailed for ");
		//    4    8:aload_2         
		//    5    9:ldc2            #281 <String "onConnectFailed for ">
		//    6   12:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//    7   15:pop             
			stringbuilder.append(((Object) (mServiceComponent)));
		//    8   16:aload_2         
		//    9   17:aload_0         
		//   10   18:getfield        #90  <Field ComponentName mServiceComponent>
		//   11   21:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//   12   24:pop             
			Log.e("MediaBrowserCompat", stringbuilder.toString());
		//   13   25:ldc1            #149 <String "MediaBrowserCompat">
		//   14   27:aload_2         
		//   15   28:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   16   31:invokestatic    #284 <Method int Log.e(String, String)>
		//   17   34:pop             
			if(!isCurrent(messenger, "onConnectFailed"))
		//*  18   35:aload_0         
		//*  19   36:aload_1         
		//*  20   37:ldc2            #286 <String "onConnectFailed">
		//*  21   40:invokespecial   #288 <Method boolean isCurrent(Messenger, String)>
		//*  22   43:ifne            47
				return;
		//   23   46:return          
			if(mState != 2)
		//*  24   47:aload_0         
		//*  25   48:getfield        #86  <Field int mState>
		//*  26   51:iconst_2        
		//*  27   52:icmpeq          102
			{
				messenger = ((Messenger) (new StringBuilder()));
		//   28   55:new             #115 <Class StringBuilder>
		//   29   58:dup             
		//   30   59:invokespecial   #116 <Method void StringBuilder()>
		//   31   62:astore_1        
				((StringBuilder) (messenger)).append("onConnect from service while mState=");
		//   32   63:aload_1         
		//   33   64:ldc2            #290 <String "onConnect from service while mState=">
		//   34   67:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   35   70:pop             
				((StringBuilder) (messenger)).append(getStateLabel(mState));
		//   36   71:aload_1         
		//   37   72:aload_0         
		//   38   73:getfield        #86  <Field int mState>
		//   39   76:invokestatic    #160 <Method String getStateLabel(int)>
		//   40   79:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   41   82:pop             
				((StringBuilder) (messenger)).append("... ignoring");
		//   42   83:aload_1         
		//   43   84:ldc2            #292 <String "... ignoring">
		//   44   87:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   45   90:pop             
				Log.w("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
		//   46   91:ldc1            #149 <String "MediaBrowserCompat">
		//   47   93:aload_1         
		//   48   94:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   49   97:invokestatic    #295 <Method int Log.w(String, String)>
		//   50  100:pop             
				return;
		//   51  101:return          
			} else
			{
				forceCloseConnection();
		//   52  102:aload_0         
		//   53  103:invokevirtual   #297 <Method void forceCloseConnection()>
				mCallback.onConnectionFailed();
		//   54  106:aload_0         
		//   55  107:getfield        #92  <Field MediaBrowserCompat$ConnectionCallback mCallback>
		//   56  110:invokevirtual   #301 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
				return;
		//   57  113:return          
			}
		}

		public void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle, Bundle bundle1)
		{
			if(!isCurrent(messenger, "onLoadChildren"))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:ldc2            #304 <String "onLoadChildren">
		//*   3    5:invokespecial   #288 <Method boolean isCurrent(Messenger, String)>
		//*   4    8:ifne            12
				return;
		//    5   11:return          
			if(MediaBrowserCompat.DEBUG)
		//*   6   12:getstatic       #308 <Field boolean MediaBrowserCompat.DEBUG>
		//*   7   15:ifeq            67
			{
				messenger = ((Messenger) (new StringBuilder()));
		//    8   18:new             #115 <Class StringBuilder>
		//    9   21:dup             
		//   10   22:invokespecial   #116 <Method void StringBuilder()>
		//   11   25:astore_1        
				((StringBuilder) (messenger)).append("onLoadChildren for ");
		//   12   26:aload_1         
		//   13   27:ldc2            #310 <String "onLoadChildren for ">
		//   14   30:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   15   33:pop             
				((StringBuilder) (messenger)).append(((Object) (mServiceComponent)));
		//   16   34:aload_1         
		//   17   35:aload_0         
		//   18   36:getfield        #90  <Field ComponentName mServiceComponent>
		//   19   39:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//   20   42:pop             
				((StringBuilder) (messenger)).append(" id=");
		//   21   43:aload_1         
		//   22   44:ldc2            #312 <String " id=">
		//   23   47:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   24   50:pop             
				((StringBuilder) (messenger)).append(s);
		//   25   51:aload_1         
		//   26   52:aload_2         
		//   27   53:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   28   56:pop             
				Log.d("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
		//   29   57:ldc1            #149 <String "MediaBrowserCompat">
		//   30   59:aload_1         
		//   31   60:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   32   63:invokestatic    #180 <Method int Log.d(String, String)>
		//   33   66:pop             
			}
			messenger = ((Messenger) ((Subscription)mSubscriptions.get(((Object) (s)))));
		//   34   67:aload_0         
		//   35   68:getfield        #84  <Field ArrayMap mSubscriptions>
		//   36   71:aload_2         
		//   37   72:invokevirtual   #316 <Method Object ArrayMap.get(Object)>
		//   38   75:checkcast       #318 <Class MediaBrowserCompat$Subscription>
		//   39   78:astore_1        
			if(messenger == null)
		//*  40   79:aload_1         
		//*  41   80:ifnonnull       122
			{
				if(MediaBrowserCompat.DEBUG)
		//*  42   83:getstatic       #308 <Field boolean MediaBrowserCompat.DEBUG>
		//*  43   86:ifeq            121
				{
					messenger = ((Messenger) (new StringBuilder()));
		//   44   89:new             #115 <Class StringBuilder>
		//   45   92:dup             
		//   46   93:invokespecial   #116 <Method void StringBuilder()>
		//   47   96:astore_1        
					((StringBuilder) (messenger)).append("onLoadChildren for id that isn't subscribed id=");
		//   48   97:aload_1         
		//   49   98:ldc2            #320 <String "onLoadChildren for id that isn't subscribed id=">
		//   50  101:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   51  104:pop             
					((StringBuilder) (messenger)).append(s);
		//   52  105:aload_1         
		//   53  106:aload_2         
		//   54  107:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   55  110:pop             
					Log.d("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
		//   56  111:ldc1            #149 <String "MediaBrowserCompat">
		//   57  113:aload_1         
		//   58  114:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   59  117:invokestatic    #180 <Method int Log.d(String, String)>
		//   60  120:pop             
				}
				return;
		//   61  121:return          
			}
			messenger = ((Messenger) (((Subscription) (messenger)).getCallback(bundle)));
		//   62  122:aload_1         
		//   63  123:aload           4
		//   64  125:invokevirtual   #324 <Method MediaBrowserCompat$SubscriptionCallback MediaBrowserCompat$Subscription.getCallback(Bundle)>
		//   65  128:astore_1        
			if(messenger != null)
		//*  66  129:aload_1         
		//*  67  130:ifnull          197
			{
				if(bundle == null)
		//*  68  133:aload           4
		//*  69  135:ifnonnull       166
					if(list == null)
		//*  70  138:aload_3         
		//*  71  139:ifnonnull       148
					{
						((SubscriptionCallback) (messenger)).onError(s);
		//   72  142:aload_1         
		//   73  143:aload_2         
		//   74  144:invokevirtual   #329 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
						return;
		//   75  147:return          
					} else
					{
						mNotifyChildrenChangedOptions = bundle1;
		//   76  148:aload_0         
		//   77  149:aload           5
		//   78  151:putfield        #267 <Field Bundle mNotifyChildrenChangedOptions>
						((SubscriptionCallback) (messenger)).onChildrenLoaded(s, list);
		//   79  154:aload_1         
		//   80  155:aload_2         
		//   81  156:aload_3         
		//   82  157:invokevirtual   #333 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
						mNotifyChildrenChangedOptions = null;
		//   83  160:aload_0         
		//   84  161:aconst_null     
		//   85  162:putfield        #267 <Field Bundle mNotifyChildrenChangedOptions>
						return;
		//   86  165:return          
					}
				if(list == null)
		//*  87  166:aload_3         
		//*  88  167:ifnonnull       178
				{
					((SubscriptionCallback) (messenger)).onError(s, bundle);
		//   89  170:aload_1         
		//   90  171:aload_2         
		//   91  172:aload           4
		//   92  174:invokevirtual   #336 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
					return;
		//   93  177:return          
				}
				mNotifyChildrenChangedOptions = bundle1;
		//   94  178:aload_0         
		//   95  179:aload           5
		//   96  181:putfield        #267 <Field Bundle mNotifyChildrenChangedOptions>
				((SubscriptionCallback) (messenger)).onChildrenLoaded(s, list, bundle);
		//   97  184:aload_1         
		//   98  185:aload_2         
		//   99  186:aload_3         
		//  100  187:aload           4
		//  101  189:invokevirtual   #339 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
				mNotifyChildrenChangedOptions = null;
		//  102  192:aload_0         
		//  103  193:aconst_null     
		//  104  194:putfield        #267 <Field Bundle mNotifyChildrenChangedOptions>
			}
		//  105  197:return          
		}

		public void onServiceConnected(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
		{
			if(!isCurrent(messenger, "onConnect"))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:ldc2            #343 <String "onConnect">
		//*   3    5:invokespecial   #288 <Method boolean isCurrent(Messenger, String)>
		//*   4    8:ifne            12
				return;
		//    5   11:return          
			if(mState != 2)
		//*   6   12:aload_0         
		//*   7   13:getfield        #86  <Field int mState>
		//*   8   16:iconst_2        
		//*   9   17:icmpeq          67
			{
				messenger = ((Messenger) (new StringBuilder()));
		//   10   20:new             #115 <Class StringBuilder>
		//   11   23:dup             
		//   12   24:invokespecial   #116 <Method void StringBuilder()>
		//   13   27:astore_1        
				((StringBuilder) (messenger)).append("onConnect from service while mState=");
		//   14   28:aload_1         
		//   15   29:ldc2            #290 <String "onConnect from service while mState=">
		//   16   32:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   17   35:pop             
				((StringBuilder) (messenger)).append(getStateLabel(mState));
		//   18   36:aload_1         
		//   19   37:aload_0         
		//   20   38:getfield        #86  <Field int mState>
		//   21   41:invokestatic    #160 <Method String getStateLabel(int)>
		//   22   44:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   23   47:pop             
				((StringBuilder) (messenger)).append("... ignoring");
		//   24   48:aload_1         
		//   25   49:ldc2            #292 <String "... ignoring">
		//   26   52:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   27   55:pop             
				Log.w("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
		//   28   56:ldc1            #149 <String "MediaBrowserCompat">
		//   29   58:aload_1         
		//   30   59:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   31   62:invokestatic    #295 <Method int Log.w(String, String)>
		//   32   65:pop             
				return;
		//   33   66:return          
			}
			mRootId = s;
		//   34   67:aload_0         
		//   35   68:aload_2         
		//   36   69:putfield        #202 <Field String mRootId>
			mMediaSessionToken = token;
		//   37   72:aload_0         
		//   38   73:aload_3         
		//   39   74:putfield        #206 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
			mExtras = bundle;
		//   40   77:aload_0         
		//   41   78:aload           4
		//   42   80:putfield        #226 <Field Bundle mExtras>
			mState = 3;
		//   43   83:aload_0         
		//   44   84:iconst_3        
		//   45   85:putfield        #86  <Field int mState>
			if(MediaBrowserCompat.DEBUG)
		//*  46   88:getstatic       #308 <Field boolean MediaBrowserCompat.DEBUG>
		//*  47   91:ifeq            107
			{
				Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
		//   48   94:ldc1            #149 <String "MediaBrowserCompat">
		//   49   96:ldc2            #345 <String "ServiceCallbacks.onConnect...">
		//   50   99:invokestatic    #180 <Method int Log.d(String, String)>
		//   51  102:pop             
				dump();
		//   52  103:aload_0         
		//   53  104:invokevirtual   #347 <Method void dump()>
			}
			mCallback.onConnected();
		//   54  107:aload_0         
		//   55  108:getfield        #92  <Field MediaBrowserCompat$ConnectionCallback mCallback>
		//   56  111:invokevirtual   #350 <Method void MediaBrowserCompat$ConnectionCallback.onConnected()>
			messenger = ((Messenger) (mSubscriptions.entrySet().iterator()));
		//   57  114:aload_0         
		//   58  115:getfield        #84  <Field ArrayMap mSubscriptions>
		//   59  118:invokevirtual   #354 <Method Set ArrayMap.entrySet()>
		//   60  121:invokeinterface #360 <Method Iterator Set.iterator()>
		//   61  126:astore_1        
_L4:
			if(!((Iterator) (messenger)).hasNext())
				break; /* Loop/switch isn't completed */
		//   62  127:aload_1         
		//   63  128:invokeinterface #365 <Method boolean Iterator.hasNext()>
		//   64  133:ifeq            250
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) ((java.util.Map.Entry)((Iterator) (messenger)).next()));
		//   65  136:aload_1         
		//   66  137:invokeinterface #369 <Method Object Iterator.next()>
		//   67  142:checkcast       #371 <Class java.util.Map$Entry>
		//   68  145:astore_3        
			s = (String)((java.util.Map.Entry) (token)).getKey();
		//   69  146:aload_3         
		//   70  147:invokeinterface #374 <Method Object java.util.Map$Entry.getKey()>
		//   71  152:checkcast       #376 <Class String>
		//   72  155:astore_2        
			bundle = ((Bundle) ((Subscription)((java.util.Map.Entry) (token)).getValue()));
		//   73  156:aload_3         
		//   74  157:invokeinterface #379 <Method Object java.util.Map$Entry.getValue()>
		//   75  162:checkcast       #318 <Class MediaBrowserCompat$Subscription>
		//   76  165:astore          4
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) (((Subscription) (bundle)).getCallbacks()));
		//   77  167:aload           4
		//   78  169:invokevirtual   #383 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
		//   79  172:astore_3        
			bundle = ((Bundle) (((Subscription) (bundle)).getOptionsList()));
		//   80  173:aload           4
		//   81  175:invokevirtual   #386 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
		//   82  178:astore          4
			int i = 0;
		//   83  180:iconst_0        
		//   84  181:istore          5
_L2:
			if(i >= ((List) (token)).size())
				break; /* Loop/switch isn't completed */
		//   85  183:iload           5
		//   86  185:aload_3         
		//   87  186:invokeinterface #392 <Method int List.size()>
		//   88  191:icmpge          127
			mServiceBinderWrapper.addSubscription(s, ((SubscriptionCallback)((List) (token)).get(i)).mToken, (Bundle)((List) (bundle)).get(i), mCallbacksMessenger);
		//   89  194:aload_0         
		//   90  195:getfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   91  198:aload_2         
		//   92  199:aload_3         
		//   93  200:iload           5
		//   94  202:invokeinterface #395 <Method Object List.get(int)>
		//   95  207:checkcast       #326 <Class MediaBrowserCompat$SubscriptionCallback>
		//   96  210:getfield        #399 <Field IBinder MediaBrowserCompat$SubscriptionCallback.mToken>
		//   97  213:aload           4
		//   98  215:iload           5
		//   99  217:invokeinterface #395 <Method Object List.get(int)>
		//  100  222:checkcast       #94  <Class Bundle>
		//  101  225:aload_0         
		//  102  226:getfield        #138 <Field Messenger mCallbacksMessenger>
		//  103  229:invokevirtual   #403 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
			i++;
		//  104  232:iload           5
		//  105  234:iconst_1        
		//  106  235:iadd            
		//  107  236:istore          5
			if(true) goto _L2; else goto _L1
		//  108  238:goto            183
_L1:
			if(true) goto _L4; else goto _L3
_L6:
			Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
		//  109  241:ldc1            #149 <String "MediaBrowserCompat">
		//  110  243:ldc2            #405 <String "addSubscription failed with RemoteException.">
		//  111  246:invokestatic    #180 <Method int Log.d(String, String)>
		//  112  249:pop             
_L3:
			return;
		//  113  250:return          
			messenger;
		//  114  251:astore_1        
			if(true) goto _L6; else goto _L5
_L5:
		//* 115  252:goto            241
		}

		public void search(final String query, Bundle bundle, final SearchCallback callback)
		{
			if(isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #224 <Method boolean isConnected()>
		//*   2    4:ifeq            99
			{
				SearchResultReceiver searchresultreceiver = new SearchResultReceiver(query, bundle, callback, ((Handler) (mHandler)));
		//    3    7:new             #409 <Class MediaBrowserCompat$SearchResultReceiver>
		//    4   10:dup             
		//    5   11:aload_1         
		//    6   12:aload_2         
		//    7   13:aload_3         
		//    8   14:aload_0         
		//    9   15:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   10   18:invokespecial   #412 <Method void MediaBrowserCompat$SearchResultReceiver(String, Bundle, MediaBrowserCompat$SearchCallback, Handler)>
		//   11   21:astore          4
				try
				{
					mServiceBinderWrapper.search(query, bundle, ((ResultReceiver) (searchresultreceiver)), mCallbacksMessenger);
		//   12   23:aload_0         
		//   13   24:getfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   14   27:aload_1         
		//   15   28:aload_2         
		//   16   29:aload           4
		//   17   31:aload_0         
		//   18   32:getfield        #138 <Field Messenger mCallbacksMessenger>
		//   19   35:invokevirtual   #415 <Method void MediaBrowserCompat$ServiceBinderWrapper.search(String, Bundle, ResultReceiver, Messenger)>
					return;
		//   20   38:return          
				}
				catch(RemoteException remoteexception)
		//*  21   39:astore          4
				{
					StringBuilder stringbuilder = new StringBuilder();
		//   22   41:new             #115 <Class StringBuilder>
		//   23   44:dup             
		//   24   45:invokespecial   #116 <Method void StringBuilder()>
		//   25   48:astore          5
					stringbuilder.append("Remote error searching items with query: ");
		//   26   50:aload           5
		//   27   52:ldc2            #417 <String "Remote error searching items with query: ">
		//   28   55:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   29   58:pop             
					stringbuilder.append(query);
		//   30   59:aload           5
		//   31   61:aload_1         
		//   32   62:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   33   65:pop             
					Log.i("MediaBrowserCompat", stringbuilder.toString(), ((Throwable) (remoteexception)));
		//   34   66:ldc1            #149 <String "MediaBrowserCompat">
		//   35   68:aload           5
		//   36   70:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   37   73:aload           4
		//   38   75:invokestatic    #420 <Method int Log.i(String, String, Throwable)>
		//   39   78:pop             
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
		//   40   79:aload_0         
		//   41   80:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   42   83:new             #21  <Class MediaBrowserCompat$MediaBrowserImplBase$5>
		//   43   86:dup             
		//   44   87:aload_0         
		//   45   88:aload_3         
		//   46   89:aload_1         
		//   47   90:aload_2         
		//   48   91:invokespecial   #423 <Method void MediaBrowserCompat$MediaBrowserImplBase$5(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$SearchCallback, String, Bundle)>
		//   49   94:invokevirtual   #172 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   50   97:pop             
					return;
		//   51   98:return          
				}
			} else
			{
				query = ((String) (new StringBuilder()));
		//   52   99:new             #115 <Class StringBuilder>
		//   53  102:dup             
		//   54  103:invokespecial   #116 <Method void StringBuilder()>
		//   55  106:astore_1        
				((StringBuilder) (query)).append("search() called while not connected (state=");
		//   56  107:aload_1         
		//   57  108:ldc2            #425 <String "search() called while not connected (state=">
		//   58  111:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   59  114:pop             
				((StringBuilder) (query)).append(getStateLabel(mState));
		//   60  115:aload_1         
		//   61  116:aload_0         
		//   62  117:getfield        #86  <Field int mState>
		//   63  120:invokestatic    #160 <Method String getStateLabel(int)>
		//   64  123:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   65  126:pop             
				((StringBuilder) (query)).append(")");
		//   66  127:aload_1         
		//   67  128:ldc1            #162 <String ")">
		//   68  130:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   69  133:pop             
				throw new IllegalStateException(((StringBuilder) (query)).toString());
		//   70  134:new             #164 <Class IllegalStateException>
		//   71  137:dup             
		//   72  138:aload_1         
		//   73  139:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   74  142:invokespecial   #165 <Method void IllegalStateException(String)>
		//   75  145:athrow          
			}
		}

		public void sendCustomAction(final String action, Bundle bundle, final CustomActionCallback callback)
		{
			if(isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #224 <Method boolean isConnected()>
		//*   2    4:ifeq            119
			{
				CustomActionResultReceiver customactionresultreceiver = new CustomActionResultReceiver(action, bundle, callback, ((Handler) (mHandler)));
		//    3    7:new             #429 <Class MediaBrowserCompat$CustomActionResultReceiver>
		//    4   10:dup             
		//    5   11:aload_1         
		//    6   12:aload_2         
		//    7   13:aload_3         
		//    8   14:aload_0         
		//    9   15:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   10   18:invokespecial   #432 <Method void MediaBrowserCompat$CustomActionResultReceiver(String, Bundle, MediaBrowserCompat$CustomActionCallback, Handler)>
		//   11   21:astore          4
				try
				{
					mServiceBinderWrapper.sendCustomAction(action, bundle, ((ResultReceiver) (customactionresultreceiver)), mCallbacksMessenger);
		//   12   23:aload_0         
		//   13   24:getfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   14   27:aload_1         
		//   15   28:aload_2         
		//   16   29:aload           4
		//   17   31:aload_0         
		//   18   32:getfield        #138 <Field Messenger mCallbacksMessenger>
		//   19   35:invokevirtual   #434 <Method void MediaBrowserCompat$ServiceBinderWrapper.sendCustomAction(String, Bundle, ResultReceiver, Messenger)>
					return;
		//   20   38:return          
				}
				catch(RemoteException remoteexception)
		//*  21   39:astore          4
				{
					StringBuilder stringbuilder = new StringBuilder();
		//   22   41:new             #115 <Class StringBuilder>
		//   23   44:dup             
		//   24   45:invokespecial   #116 <Method void StringBuilder()>
		//   25   48:astore          5
					stringbuilder.append("Remote error sending a custom action: action=");
		//   26   50:aload           5
		//   27   52:ldc2            #436 <String "Remote error sending a custom action: action=">
		//   28   55:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   29   58:pop             
					stringbuilder.append(action);
		//   30   59:aload           5
		//   31   61:aload_1         
		//   32   62:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   33   65:pop             
					stringbuilder.append(", extras=");
		//   34   66:aload           5
		//   35   68:ldc2            #438 <String ", extras=">
		//   36   71:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   37   74:pop             
					stringbuilder.append(((Object) (bundle)));
		//   38   75:aload           5
		//   39   77:aload_2         
		//   40   78:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//   41   81:pop             
					Log.i("MediaBrowserCompat", stringbuilder.toString(), ((Throwable) (remoteexception)));
		//   42   82:ldc1            #149 <String "MediaBrowserCompat">
		//   43   84:aload           5
		//   44   86:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   45   89:aload           4
		//   46   91:invokestatic    #420 <Method int Log.i(String, String, Throwable)>
		//   47   94:pop             
				}
				if(callback != null)
		//*  48   95:aload_3         
		//*  49   96:ifnull          118
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
		//   50   99:aload_0         
		//   51  100:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   52  103:new             #23  <Class MediaBrowserCompat$MediaBrowserImplBase$6>
		//   53  106:dup             
		//   54  107:aload_0         
		//   55  108:aload_3         
		//   56  109:aload_1         
		//   57  110:aload_2         
		//   58  111:invokespecial   #441 <Method void MediaBrowserCompat$MediaBrowserImplBase$6(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$CustomActionCallback, String, Bundle)>
		//   59  114:invokevirtual   #172 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   60  117:pop             
				return;
		//   61  118:return          
			} else
			{
				callback = ((CustomActionCallback) (new StringBuilder()));
		//   62  119:new             #115 <Class StringBuilder>
		//   63  122:dup             
		//   64  123:invokespecial   #116 <Method void StringBuilder()>
		//   65  126:astore_3        
				((StringBuilder) (callback)).append("Cannot send a custom action (");
		//   66  127:aload_3         
		//   67  128:ldc2            #443 <String "Cannot send a custom action (">
		//   68  131:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   69  134:pop             
				((StringBuilder) (callback)).append(action);
		//   70  135:aload_3         
		//   71  136:aload_1         
		//   72  137:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   73  140:pop             
				((StringBuilder) (callback)).append(") with ");
		//   74  141:aload_3         
		//   75  142:ldc2            #445 <String ") with ">
		//   76  145:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   77  148:pop             
				((StringBuilder) (callback)).append("extras ");
		//   78  149:aload_3         
		//   79  150:ldc2            #447 <String "extras ">
		//   80  153:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   81  156:pop             
				((StringBuilder) (callback)).append(((Object) (bundle)));
		//   82  157:aload_3         
		//   83  158:aload_2         
		//   84  159:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//   85  162:pop             
				((StringBuilder) (callback)).append(" because the browser is not connected to the ");
		//   86  163:aload_3         
		//   87  164:ldc2            #449 <String " because the browser is not connected to the ">
		//   88  167:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   89  170:pop             
				((StringBuilder) (callback)).append("service.");
		//   90  171:aload_3         
		//   91  172:ldc2            #451 <String "service.">
		//   92  175:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   93  178:pop             
				throw new IllegalStateException(((StringBuilder) (callback)).toString());
		//   94  179:new             #164 <Class IllegalStateException>
		//   95  182:dup             
		//   96  183:aload_3         
		//   97  184:invokevirtual   #129 <Method String StringBuilder.toString()>
		//   98  187:invokespecial   #165 <Method void IllegalStateException(String)>
		//   99  190:athrow          
			}
		}

		public void subscribe(String s, Bundle bundle, SubscriptionCallback subscriptioncallback)
		{
			Subscription subscription1 = (Subscription)mSubscriptions.get(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #84  <Field ArrayMap mSubscriptions>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #316 <Method Object ArrayMap.get(Object)>
		//    4    8:checkcast       #318 <Class MediaBrowserCompat$Subscription>
		//    5   11:astore          5
			Subscription subscription = subscription1;
		//    6   13:aload           5
		//    7   15:astore          4
			if(subscription1 == null)
		//*   8   17:aload           5
		//*   9   19:ifnonnull       42
			{
				subscription = new Subscription();
		//   10   22:new             #318 <Class MediaBrowserCompat$Subscription>
		//   11   25:dup             
		//   12   26:invokespecial   #454 <Method void MediaBrowserCompat$Subscription()>
		//   13   29:astore          4
				mSubscriptions.put(((Object) (s)), ((Object) (subscription)));
		//   14   31:aload_0         
		//   15   32:getfield        #84  <Field ArrayMap mSubscriptions>
		//   16   35:aload_1         
		//   17   36:aload           4
		//   18   38:invokevirtual   #458 <Method Object ArrayMap.put(Object, Object)>
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
		//   25   51:new             #94  <Class Bundle>
		//   26   54:dup             
		//   27   55:aload_2         
		//   28   56:invokespecial   #97  <Method void Bundle(Bundle)>
		//   29   59:astore_2        
			subscription.putCallback(bundle, subscriptioncallback);
		//   30   60:aload           4
		//   31   62:aload_2         
		//   32   63:aload_3         
		//   33   64:invokevirtual   #462 <Method void MediaBrowserCompat$Subscription.putCallback(Bundle, MediaBrowserCompat$SubscriptionCallback)>
			if(isConnected())
		//*  34   67:aload_0         
		//*  35   68:invokevirtual   #224 <Method boolean isConnected()>
		//*  36   71:ifeq            124
			{
				try
				{
					mServiceBinderWrapper.addSubscription(s, subscriptioncallback.mToken, bundle, mCallbacksMessenger);
		//   37   74:aload_0         
		//   38   75:getfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   39   78:aload_1         
		//   40   79:aload_3         
		//   41   80:getfield        #399 <Field IBinder MediaBrowserCompat$SubscriptionCallback.mToken>
		//   42   83:aload_2         
		//   43   84:aload_0         
		//   44   85:getfield        #138 <Field Messenger mCallbacksMessenger>
		//   45   88:invokevirtual   #403 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
					return;
		//   46   91:return          
				}
		//*  47   92:new             #115 <Class StringBuilder>
		//*  48   95:dup             
		//*  49   96:invokespecial   #116 <Method void StringBuilder()>
		//*  50   99:astore_2        
		//*  51  100:aload_2         
		//*  52  101:ldc2            #464 <String "addSubscription failed with RemoteException parentId=">
		//*  53  104:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//*  54  107:pop             
		//*  55  108:aload_2         
		//*  56  109:aload_1         
		//*  57  110:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//*  58  113:pop             
		//*  59  114:ldc1            #149 <String "MediaBrowserCompat">
		//*  60  116:aload_2         
		//*  61  117:invokevirtual   #129 <Method String StringBuilder.toString()>
		//*  62  120:invokestatic    #180 <Method int Log.d(String, String)>
		//*  63  123:pop             
		//*  64  124:return          
				// Misplaced declaration of an exception variable
				catch(Bundle bundle)
				{
					bundle = ((Bundle) (new StringBuilder()));
				}
				((StringBuilder) (bundle)).append("addSubscription failed with RemoteException parentId=");
				((StringBuilder) (bundle)).append(s);
				Log.d("MediaBrowserCompat", ((StringBuilder) (bundle)).toString());
			}
		//*  65  125:astore_2        
		//*  66  126:goto            92
		}

		public void unsubscribe(String s, SubscriptionCallback subscriptioncallback)
		{
			Subscription subscription;
			subscription = (Subscription)mSubscriptions.get(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #84  <Field ArrayMap mSubscriptions>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #316 <Method Object ArrayMap.get(Object)>
		//    4    8:checkcast       #318 <Class MediaBrowserCompat$Subscription>
		//    5   11:astore          4
			if(subscription == null)
		//*   6   13:aload           4
		//*   7   15:ifnonnull       19
				return;
		//    8   18:return          
			if(subscriptioncallback != null) goto _L2; else goto _L1
		//    9   19:aload_2         
		//   10   20:ifnonnull       46
_L1:
			int i;
			Object obj;
			List list;
			try
			{
				if(isConnected())
		//*  11   23:aload_0         
		//*  12   24:invokevirtual   #224 <Method boolean isConnected()>
		//*  13   27:ifeq            170
					mServiceBinderWrapper.removeSubscription(s, ((IBinder) (null)), mCallbacksMessenger);
		//   14   30:aload_0         
		//   15   31:getfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   16   34:aload_1         
		//   17   35:aconst_null     
		//   18   36:aload_0         
		//   19   37:getfield        #138 <Field Messenger mCallbacksMessenger>
		//   20   40:invokevirtual   #470 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
			}
		//*  21   43:goto            170
		//*  22   46:aload           4
		//*  23   48:invokevirtual   #383 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
		//*  24   51:astore          5
		//*  25   53:aload           4
		//*  26   55:invokevirtual   #386 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
		//*  27   58:astore          6
		//*  28   60:aload           5
		//*  29   62:invokeinterface #392 <Method int List.size()>
		//*  30   67:iconst_1        
		//*  31   68:isub            
		//*  32   69:istore_3        
		//*  33   70:iload_3         
		//*  34   71:iflt            170
		//*  35   74:aload           5
		//*  36   76:iload_3         
		//*  37   77:invokeinterface #395 <Method Object List.get(int)>
		//*  38   82:aload_2         
		//*  39   83:if_acmpne       127
		//*  40   86:aload_0         
		//*  41   87:invokevirtual   #224 <Method boolean isConnected()>
		//*  42   90:ifeq            109
		//*  43   93:aload_0         
		//*  44   94:getfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//*  45   97:aload_1         
		//*  46   98:aload_2         
		//*  47   99:getfield        #399 <Field IBinder MediaBrowserCompat$SubscriptionCallback.mToken>
		//*  48  102:aload_0         
		//*  49  103:getfield        #138 <Field Messenger mCallbacksMessenger>
		//*  50  106:invokevirtual   #470 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
		//*  51  109:aload           5
		//*  52  111:iload_3         
		//*  53  112:invokeinterface #473 <Method Object List.remove(int)>
		//*  54  117:pop             
		//*  55  118:aload           6
		//*  56  120:iload_3         
		//*  57  121:invokeinterface #473 <Method Object List.remove(int)>
		//*  58  126:pop             
		//*  59  127:iload_3         
		//*  60  128:iconst_1        
		//*  61  129:isub            
		//*  62  130:istore_3        
		//*  63  131:goto            70
		//*  64  134:new             #115 <Class StringBuilder>
		//*  65  137:dup             
		//*  66  138:invokespecial   #116 <Method void StringBuilder()>
		//*  67  141:astore          5
		//*  68  143:aload           5
		//*  69  145:ldc2            #475 <String "removeSubscription failed with RemoteException parentId=">
		//*  70  148:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//*  71  151:pop             
		//*  72  152:aload           5
		//*  73  154:aload_1         
		//*  74  155:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//*  75  158:pop             
		//*  76  159:ldc1            #149 <String "MediaBrowserCompat">
		//*  77  161:aload           5
		//*  78  163:invokevirtual   #129 <Method String StringBuilder.toString()>
		//*  79  166:invokestatic    #180 <Method int Log.d(String, String)>
		//*  80  169:pop             
		//*  81  170:aload           4
		//*  82  172:invokevirtual   #477 <Method boolean MediaBrowserCompat$Subscription.isEmpty()>
		//*  83  175:ifne            182
		//*  84  178:aload_2         
		//*  85  179:ifnonnull       191
		//*  86  182:aload_0         
		//*  87  183:getfield        #84  <Field ArrayMap mSubscriptions>
		//*  88  186:aload_1         
		//*  89  187:invokevirtual   #479 <Method Object ArrayMap.remove(Object)>
		//*  90  190:pop             
		//*  91  191:return          
			// Misplaced declaration of an exception variable
			catch(RemoteException remoteexception)
			{
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append("removeSubscription failed with RemoteException parentId=");
				((StringBuilder) (obj)).append(s);
				Log.d("MediaBrowserCompat", ((StringBuilder) (obj)).toString());
			}
			  goto _L3
_L2:
			obj = ((Object) (subscription.getCallbacks()));
			list = subscription.getOptionsList();
			i = ((List) (obj)).size() - 1;
_L4:
			if(i < 0)
				break; /* Loop/switch isn't completed */
			if(((List) (obj)).get(i) == subscriptioncallback)
			{
				if(isConnected())
					mServiceBinderWrapper.removeSubscription(s, subscriptioncallback.mToken, mCallbacksMessenger);
				((List) (obj)).remove(i);
				list.remove(i);
			}
			i--;
			if(true) goto _L4; else goto _L3
_L3:
			RemoteException remoteexception;
			if(subscription.isEmpty() || subscriptioncallback == null)
				mSubscriptions.remove(((Object) (s)));
			return;
		//*  92  192:astore          5
		//*  93  194:goto            134
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
		private Bundle mNotifyChildrenChangedOptions;
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
		//    1    1:invokespecial   #72  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #74  <Class MediaBrowserCompat$CallbackHandler>
		//    4    8:dup             
		//    5    9:aload_0         
		//    6   10:invokespecial   #77  <Method void MediaBrowserCompat$CallbackHandler(MediaBrowserCompat$MediaBrowserServiceCallbackImpl)>
		//    7   13:putfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//    8   16:aload_0         
		//    9   17:new             #81  <Class ArrayMap>
		//   10   20:dup             
		//   11   21:invokespecial   #82  <Method void ArrayMap()>
		//   12   24:putfield        #84  <Field ArrayMap mSubscriptions>
			mState = 1;
		//   13   27:aload_0         
		//   14   28:iconst_1        
		//   15   29:putfield        #86  <Field int mState>
			if(context != null)
		//*  16   32:aload_1         
		//*  17   33:ifnull          105
			{
				if(componentname != null)
		//*  18   36:aload_2         
		//*  19   37:ifnull          95
				{
					if(connectioncallback != null)
		//*  20   40:aload_3         
		//*  21   41:ifnull          85
					{
						mContext = context;
		//   22   44:aload_0         
		//   23   45:aload_1         
		//   24   46:putfield        #88  <Field Context mContext>
						mServiceComponent = componentname;
		//   25   49:aload_0         
		//   26   50:aload_2         
		//   27   51:putfield        #90  <Field ComponentName mServiceComponent>
						mCallback = connectioncallback;
		//   28   54:aload_0         
		//   29   55:aload_3         
		//   30   56:putfield        #92  <Field MediaBrowserCompat$ConnectionCallback mCallback>
						if(bundle == null)
		//*  31   59:aload           4
		//*  32   61:ifnonnull       69
							context = null;
		//   33   64:aconst_null     
		//   34   65:astore_1        
						else
		//*  35   66:goto            79
							context = ((Context) (new Bundle(bundle)));
		//   36   69:new             #94  <Class Bundle>
		//   37   72:dup             
		//   38   73:aload           4
		//   39   75:invokespecial   #97  <Method void Bundle(Bundle)>
		//   40   78:astore_1        
						mRootHints = ((Bundle) (context));
		//   41   79:aload_0         
		//   42   80:aload_1         
		//   43   81:putfield        #99  <Field Bundle mRootHints>
						return;
		//   44   84:return          
					} else
					{
						throw new IllegalArgumentException("connection callback must not be null");
		//   45   85:new             #101 <Class IllegalArgumentException>
		//   46   88:dup             
		//   47   89:ldc1            #103 <String "connection callback must not be null">
		//   48   91:invokespecial   #106 <Method void IllegalArgumentException(String)>
		//   49   94:athrow          
					}
				} else
				{
					throw new IllegalArgumentException("service component must not be null");
		//   50   95:new             #101 <Class IllegalArgumentException>
		//   51   98:dup             
		//   52   99:ldc1            #108 <String "service component must not be null">
		//   53  101:invokespecial   #106 <Method void IllegalArgumentException(String)>
		//   54  104:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("context must not be null");
		//   55  105:new             #101 <Class IllegalArgumentException>
		//   56  108:dup             
		//   57  109:ldc1            #110 <String "context must not be null">
		//   58  111:invokespecial   #106 <Method void IllegalArgumentException(String)>
		//   59  114:athrow          
			}
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
			if(mServiceConnection == this && mState != 0 && mState != 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*   2    4:getfield        #64  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
		//*   3    7:aload_0         
		//*   4    8:if_acmpne       37
		//*   5   11:aload_0         
		//*   6   12:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*   7   15:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		//*   8   18:ifeq            37
		//*   9   21:aload_0         
		//*  10   22:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*  11   25:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		//*  12   28:iconst_1        
		//*  13   29:icmpne          35
		//*  14   32:goto            37
				return true;
		//   15   35:iconst_1        
		//   16   36:ireturn         
			if(mState != 0 && mState != 1)
		//*  17   37:aload_0         
		//*  18   38:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*  19   41:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		//*  20   44:ifeq            133
		//*  21   47:aload_0         
		//*  22   48:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*  23   51:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		//*  24   54:iconst_1        
		//*  25   55:icmpeq          133
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   26   58:new             #70  <Class StringBuilder>
		//   27   61:dup             
		//   28   62:invokespecial   #71  <Method void StringBuilder()>
		//   29   65:astore_2        
				stringbuilder.append(s);
		//   30   66:aload_2         
		//   31   67:aload_1         
		//   32   68:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   33   71:pop             
				stringbuilder.append(" for ");
		//   34   72:aload_2         
		//   35   73:ldc1            #77  <String " for ">
		//   36   75:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   37   78:pop             
				stringbuilder.append(((Object) (mServiceComponent)));
		//   38   79:aload_2         
		//   39   80:aload_0         
		//   40   81:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//   41   84:getfield        #81  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
		//   42   87:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
		//   43   90:pop             
				stringbuilder.append(" with mServiceConnection=");
		//   44   91:aload_2         
		//   45   92:ldc1            #86  <String " with mServiceConnection=">
		//   46   94:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   47   97:pop             
				stringbuilder.append(((Object) (mServiceConnection)));
		//   48   98:aload_2         
		//   49   99:aload_0         
		//   50  100:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//   51  103:getfield        #64  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
		//   52  106:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
		//   53  109:pop             
				stringbuilder.append(" this=");
		//   54  110:aload_2         
		//   55  111:ldc1            #88  <String " this=">
		//   56  113:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   57  116:pop             
				stringbuilder.append(((Object) (this)));
		//   58  117:aload_2         
		//   59  118:aload_0         
		//   60  119:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
		//   61  122:pop             
				Log.i("MediaBrowserCompat", stringbuilder.toString());
		//   62  123:ldc1            #90  <String "MediaBrowserCompat">
		//   63  125:aload_2         
		//   64  126:invokevirtual   #94  <Method String StringBuilder.toString()>
		//   65  129:invokestatic    #100 <Method int Log.i(String, String)>
		//   66  132:pop             
			}
			return false;
		//   67  133:iconst_0        
		//   68  134:ireturn         
		}

		public void onServiceConnected(final ComponentName name, IBinder ibinder)
		{
			postOrRun(((_cls1) (ibinder)). new Runnable() {

				public void run()
				{
					RemoteException remoteexception;
					if(MediaBrowserCompat.DEBUG)
				//*   0    0:getstatic       #42  <Field boolean MediaBrowserCompat.DEBUG>
				//*   1    3:ifeq            66
					{
						StringBuilder stringbuilder = new StringBuilder();
				//    2    6:new             #44  <Class StringBuilder>
				//    3    9:dup             
				//    4   10:invokespecial   #45  <Method void StringBuilder()>
				//    5   13:astore_1        
						stringbuilder.append("MediaServiceConnection.onServiceConnected name=");
				//    6   14:aload_1         
				//    7   15:ldc1            #47  <String "MediaServiceConnection.onServiceConnected name=">
				//    8   17:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
				//    9   20:pop             
						stringbuilder.append(((Object) (name)));
				//   10   21:aload_1         
				//   11   22:aload_0         
				//   12   23:getfield        #29  <Field ComponentName val$name>
				//   13   26:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
				//   14   29:pop             
						stringbuilder.append(" binder=");
				//   15   30:aload_1         
				//   16   31:ldc1            #56  <String " binder=">
				//   17   33:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
				//   18   36:pop             
						stringbuilder.append(((Object) (binder)));
				//   19   37:aload_1         
				//   20   38:aload_0         
				//   21   39:getfield        #31  <Field IBinder val$binder>
				//   22   42:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
				//   23   45:pop             
						Log.d("MediaBrowserCompat", stringbuilder.toString());
				//   24   46:ldc1            #58  <String "MediaBrowserCompat">
				//   25   48:aload_1         
				//   26   49:invokevirtual   #62  <Method String StringBuilder.toString()>
				//   27   52:invokestatic    #68  <Method int Log.d(String, String)>
				//   28   55:pop             
						dump();
				//   29   56:aload_0         
				//   30   57:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   31   60:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   32   63:invokevirtual   #75  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
					}
					if(!isCurrent("onServiceConnected"))
				//*  33   66:aload_0         
				//*  34   67:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//*  35   70:ldc1            #76  <String "onServiceConnected">
				//*  36   72:invokevirtual   #80  <Method boolean MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.isCurrent(String)>
				//*  37   75:ifne            79
						return;
				//   38   78:return          
					mServiceBinderWrapper = new ServiceBinderWrapper(binder, mRootHints);
				//   39   79:aload_0         
				//   40   80:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   41   83:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   42   86:new             #82  <Class MediaBrowserCompat$ServiceBinderWrapper>
				//   43   89:dup             
				//   44   90:aload_0         
				//   45   91:getfield        #31  <Field IBinder val$binder>
				//   46   94:aload_0         
				//   47   95:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   48   98:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   49  101:getfield        #86  <Field Bundle MediaBrowserCompat$MediaBrowserImplBase.mRootHints>
				//   50  104:invokespecial   #89  <Method void MediaBrowserCompat$ServiceBinderWrapper(IBinder, Bundle)>
				//   51  107:putfield        #93  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
					mCallbacksMessenger = new Messenger(((Handler) (mHandler)));
				//   52  110:aload_0         
				//   53  111:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   54  114:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   55  117:new             #95  <Class Messenger>
				//   56  120:dup             
				//   57  121:aload_0         
				//   58  122:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   59  125:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   60  128:getfield        #99  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
				//   61  131:invokespecial   #102 <Method void Messenger(Handler)>
				//   62  134:putfield        #106 <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
					mHandler.setCallbacksMessenger(mCallbacksMessenger);
				//   63  137:aload_0         
				//   64  138:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   65  141:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   66  144:getfield        #99  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
				//   67  147:aload_0         
				//   68  148:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   69  151:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   70  154:getfield        #106 <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
				//   71  157:invokevirtual   #112 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
					mState = 2;
				//   72  160:aload_0         
				//   73  161:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   74  164:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   75  167:iconst_2        
				//   76  168:putfield        #116 <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
					StringBuilder stringbuilder1;
					try
					{
						if(MediaBrowserCompat.DEBUG)
				//*  77  171:getstatic       #42  <Field boolean MediaBrowserCompat.DEBUG>
				//*  78  174:ifeq            195
						{
							Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
				//   79  177:ldc1            #58  <String "MediaBrowserCompat">
				//   80  179:ldc1            #118 <String "ServiceCallbacks.onConnect...">
				//   81  181:invokestatic    #68  <Method int Log.d(String, String)>
				//   82  184:pop             
							dump();
				//   83  185:aload_0         
				//   84  186:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   85  189:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   86  192:invokevirtual   #75  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
						}
						mServiceBinderWrapper.connect(mContext, mCallbacksMessenger);
				//   87  195:aload_0         
				//   88  196:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   89  199:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   90  202:getfield        #93  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
				//   91  205:aload_0         
				//   92  206:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   93  209:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   94  212:getfield        #122 <Field Context MediaBrowserCompat$MediaBrowserImplBase.mContext>
				//   95  215:aload_0         
				//   96  216:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   97  219:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   98  222:getfield        #106 <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
				//   99  225:invokevirtual   #126 <Method void MediaBrowserCompat$ServiceBinderWrapper.connect(Context, Messenger)>
						return;
				//  100  228:return          
					}
				//* 101  229:new             #44  <Class StringBuilder>
				//* 102  232:dup             
				//* 103  233:invokespecial   #45  <Method void StringBuilder()>
				//* 104  236:astore_1        
				//* 105  237:aload_1         
				//* 106  238:ldc1            #128 <String "RemoteException during connect for ">
				//* 107  240:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
				//* 108  243:pop             
				//* 109  244:aload_1         
				//* 110  245:aload_0         
				//* 111  246:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//* 112  249:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//* 113  252:getfield        #131 <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
				//* 114  255:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
				//* 115  258:pop             
				//* 116  259:ldc1            #58  <String "MediaBrowserCompat">
				//* 117  261:aload_1         
				//* 118  262:invokevirtual   #62  <Method String StringBuilder.toString()>
				//* 119  265:invokestatic    #134 <Method int Log.w(String, String)>
				//* 120  268:pop             
				//* 121  269:getstatic       #42  <Field boolean MediaBrowserCompat.DEBUG>
				//* 122  272:ifeq            293
				//* 123  275:ldc1            #58  <String "MediaBrowserCompat">
				//* 124  277:ldc1            #118 <String "ServiceCallbacks.onConnect...">
				//* 125  279:invokestatic    #68  <Method int Log.d(String, String)>
				//* 126  282:pop             
				//* 127  283:aload_0         
				//* 128  284:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//* 129  287:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//* 130  290:invokevirtual   #75  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
				//* 131  293:return          
					// Misplaced declaration of an exception variable
					catch(RemoteException remoteexception)
					{
						stringbuilder1 = new StringBuilder();
					}
					stringbuilder1.append("RemoteException during connect for ");
					stringbuilder1.append(((Object) (mServiceComponent)));
					Log.w("MediaBrowserCompat", stringbuilder1.toString());
					if(MediaBrowserCompat.DEBUG)
					{
						Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
						dump();
					}
				//* 132  294:astore_1        
				//* 133  295:goto            229
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
				//*   1    3:ifeq            85
					{
						StringBuilder stringbuilder = new StringBuilder();
				//    2    6:new             #38  <Class StringBuilder>
				//    3    9:dup             
				//    4   10:invokespecial   #39  <Method void StringBuilder()>
				//    5   13:astore_1        
						stringbuilder.append("MediaServiceConnection.onServiceDisconnected name=");
				//    6   14:aload_1         
				//    7   15:ldc1            #41  <String "MediaServiceConnection.onServiceDisconnected name=">
				//    8   17:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
				//    9   20:pop             
						stringbuilder.append(((Object) (name)));
				//   10   21:aload_1         
				//   11   22:aload_0         
				//   12   23:getfield        #27  <Field ComponentName val$name>
				//   13   26:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
				//   14   29:pop             
						stringbuilder.append(" this=");
				//   15   30:aload_1         
				//   16   31:ldc1            #50  <String " this=">
				//   17   33:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
				//   18   36:pop             
						stringbuilder.append(((Object) (this)));
				//   19   37:aload_1         
				//   20   38:aload_0         
				//   21   39:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
				//   22   42:pop             
						stringbuilder.append(" mServiceConnection=");
				//   23   43:aload_1         
				//   24   44:ldc1            #52  <String " mServiceConnection=">
				//   25   46:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
				//   26   49:pop             
						stringbuilder.append(((Object) (mServiceConnection)));
				//   27   50:aload_1         
				//   28   51:aload_0         
				//   29   52:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   30   55:getfield        #56  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   31   58:getfield        #59  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
				//   32   61:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
				//   33   64:pop             
						Log.d("MediaBrowserCompat", stringbuilder.toString());
				//   34   65:ldc1            #61  <String "MediaBrowserCompat">
				//   35   67:aload_1         
				//   36   68:invokevirtual   #65  <Method String StringBuilder.toString()>
				//   37   71:invokestatic    #71  <Method int Log.d(String, String)>
				//   38   74:pop             
						dump();
				//   39   75:aload_0         
				//   40   76:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   41   79:getfield        #56  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   42   82:invokevirtual   #74  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
					}
					if(!isCurrent("onServiceDisconnected"))
				//*  43   85:aload_0         
				//*  44   86:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//*  45   89:ldc1            #75  <String "onServiceDisconnected">
				//*  46   91:invokevirtual   #79  <Method boolean MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.isCurrent(String)>
				//*  47   94:ifne            98
					{
						return;
				//   48   97:return          
					} else
					{
						mServiceBinderWrapper = null;
				//   49   98:aload_0         
				//   50   99:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   51  102:getfield        #56  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   52  105:aconst_null     
				//   53  106:putfield        #83  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
						mCallbacksMessenger = null;
				//   54  109:aload_0         
				//   55  110:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   56  113:getfield        #56  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   57  116:aconst_null     
				//   58  117:putfield        #87  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
						mHandler.setCallbacksMessenger(((Messenger) (null)));
				//   59  120:aload_0         
				//   60  121:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   61  124:getfield        #56  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   62  127:getfield        #91  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
				//   63  130:aconst_null     
				//   64  131:invokevirtual   #97  <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
						mState = 4;
				//   65  134:aload_0         
				//   66  135:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   67  138:getfield        #56  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   68  141:iconst_4        
				//   69  142:putfield        #101 <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
						mCallback.onConnectionSuspended();
				//   70  145:aload_0         
				//   71  146:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   72  149:getfield        #56  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   73  152:getfield        #105 <Field MediaBrowserCompat$ConnectionCallback MediaBrowserCompat$MediaBrowserImplBase.mCallback>
				//   74  155:invokevirtual   #110 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionSuspended()>
						return;
				//   75  158:return          
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

		public abstract void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle, Bundle bundle1);

		public abstract void onServiceConnected(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle);
	}

	public static class MediaItem
		implements Parcelable
	{

		public static MediaItem fromMediaItem(Object obj)
		{
			if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          36
		//*   2    4:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmpge          15
		//*   5   12:goto            36
			{
				int i = MediaBrowserCompatApi21.MediaItem.getFlags(obj);
		//    6   15:aload_0         
		//    7   16:invokestatic    #89  <Method int MediaBrowserCompatApi21$MediaItem.getFlags(Object)>
		//    8   19:istore_1        
				return new MediaItem(MediaDescriptionCompat.fromMediaDescription(MediaBrowserCompatApi21.MediaItem.getDescription(obj)), i);
		//    9   20:new             #2   <Class MediaBrowserCompat$MediaItem>
		//   10   23:dup             
		//   11   24:aload_0         
		//   12   25:invokestatic    #93  <Method Object MediaBrowserCompatApi21$MediaItem.getDescription(Object)>
		//   13   28:invokestatic    #97  <Method MediaDescriptionCompat MediaDescriptionCompat.fromMediaDescription(Object)>
		//   14   31:iload_1         
		//   15   32:invokespecial   #99  <Method void MediaBrowserCompat$MediaItem(MediaDescriptionCompat, int)>
		//   16   35:areturn         
			} else
			{
				return null;
		//   17   36:aconst_null     
		//   18   37:areturn         
			}
		}

		public static List fromMediaItemList(List list)
		{
			if(list != null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          66
		//*   2    4:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmpge          15
		//*   5   12:goto            66
			{
				ArrayList arraylist = new ArrayList(list.size());
		//    6   15:new             #103 <Class ArrayList>
		//    7   18:dup             
		//    8   19:aload_0         
		//    9   20:invokeinterface #108 <Method int List.size()>
		//   10   25:invokespecial   #111 <Method void ArrayList(int)>
		//   11   28:astore_1        
				for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (fromMediaItem(((Iterator) (list)).next())))));
		//   12   29:aload_0         
		//   13   30:invokeinterface #115 <Method Iterator List.iterator()>
		//   14   35:astore_0        
		//   15   36:aload_0         
		//   16   37:invokeinterface #121 <Method boolean Iterator.hasNext()>
		//   17   42:ifeq            64
		//   18   45:aload_1         
		//   19   46:aload_0         
		//   20   47:invokeinterface #125 <Method Object Iterator.next()>
		//   21   52:invokestatic    #127 <Method MediaBrowserCompat$MediaItem fromMediaItem(Object)>
		//   22   55:invokeinterface #131 <Method boolean List.add(Object)>
		//   23   60:pop             
		//*  24   61:goto            36
				return ((List) (arraylist));
		//   25   64:aload_1         
		//   26   65:areturn         
			} else
			{
				return null;
		//   27   66:aconst_null     
		//   28   67:areturn         
			}
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
		//    2    4:invokevirtual   #60  <Method String MediaDescriptionCompat.getMediaId()>
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
			stringbuilder.append("mFlags=");
		//    5   10:aload_1         
		//    6   11:ldc1            #147 <String "mFlags=">
		//    7   13:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
		//    8   16:pop             
			stringbuilder.append(mFlags);
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:getfield        #43  <Field int mFlags>
		//   12   22:invokevirtual   #154 <Method StringBuilder StringBuilder.append(int)>
		//   13   25:pop             
			stringbuilder.append(", mDescription=");
		//   14   26:aload_1         
		//   15   27:ldc1            #156 <String ", mDescription=">
		//   16   29:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
		//   17   32:pop             
			stringbuilder.append(((Object) (mDescription)));
		//   18   33:aload_1         
		//   19   34:aload_0         
		//   20   35:getfield        #54  <Field MediaDescriptionCompat mDescription>
		//   21   38:invokevirtual   #159 <Method StringBuilder StringBuilder.append(Object)>
		//   22   41:pop             
			stringbuilder.append('}');
		//   23   42:aload_1         
		//   24   43:bipush          125
		//   25   45:invokevirtual   #162 <Method StringBuilder StringBuilder.append(char)>
		//   26   48:pop             
			return stringbuilder.toString();
		//   27   49:aload_1         
		//   28   50:invokevirtual   #164 <Method String StringBuilder.toString()>
		//   29   53:areturn         
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
			if(mediadescriptioncompat != null)
		//*   2    4:aload_1         
		//*   3    5:ifnull          39
			{
				if(!TextUtils.isEmpty(((CharSequence) (mediadescriptioncompat.getMediaId()))))
		//*   4    8:aload_1         
		//*   5    9:invokevirtual   #60  <Method String MediaDescriptionCompat.getMediaId()>
		//*   6   12:invokestatic    #66  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   7   15:ifne            29
				{
					mFlags = i;
		//    8   18:aload_0         
		//    9   19:iload_2         
		//   10   20:putfield        #43  <Field int mFlags>
					mDescription = mediadescriptioncompat;
		//   11   23:aload_0         
		//   12   24:aload_1         
		//   13   25:putfield        #54  <Field MediaDescriptionCompat mDescription>
					return;
		//   14   28:return          
				} else
				{
					throw new IllegalArgumentException("description must have a non-empty media id");
		//   15   29:new             #68  <Class IllegalArgumentException>
		//   16   32:dup             
		//   17   33:ldc1            #70  <String "description must have a non-empty media id">
		//   18   35:invokespecial   #73  <Method void IllegalArgumentException(String)>
		//   19   38:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("description cannot be null");
		//   20   39:new             #68  <Class IllegalArgumentException>
		//   21   42:dup             
		//   22   43:ldc1            #75  <String "description cannot be null">
		//   23   45:invokespecial   #73  <Method void IllegalArgumentException(String)>
		//   24   48:athrow          
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
			MediaSessionCompat.ensureClassLoader(bundle);
		//    0    0:aload_2         
		//    1    1:invokestatic    #33  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			if(i == 0 && bundle != null && bundle.containsKey("search_results"))
		//*   2    4:iload_1         
		//*   3    5:ifne            101
		//*   4    8:aload_2         
		//*   5    9:ifnull          101
		//*   6   12:aload_2         
		//*   7   13:ldc1            #35  <String "search_results">
		//*   8   15:invokevirtual   #41  <Method boolean Bundle.containsKey(String)>
		//*   9   18:ifne            24
		//*  10   21:goto            101
			{
				Parcelable aparcelable[] = bundle.getParcelableArray("search_results");
		//   11   24:aload_2         
		//   12   25:ldc1            #35  <String "search_results">
		//   13   27:invokevirtual   #45  <Method Parcelable[] Bundle.getParcelableArray(String)>
		//   14   30:astore          5
				bundle = null;
		//   15   32:aconst_null     
		//   16   33:astore_2        
				if(aparcelable != null)
		//*  17   34:aload           5
		//*  18   36:ifnull          84
				{
					ArrayList arraylist = new ArrayList();
		//   19   39:new             #47  <Class ArrayList>
		//   20   42:dup             
		//   21   43:invokespecial   #50  <Method void ArrayList()>
		//   22   46:astore          4
					int j = aparcelable.length;
		//   23   48:aload           5
		//   24   50:arraylength     
		//   25   51:istore_3        
					i = 0;
		//   26   52:iconst_0        
		//   27   53:istore_1        
					do
					{
						bundle = ((Bundle) (arraylist));
		//   28   54:aload           4
		//   29   56:astore_2        
						if(i >= j)
							break;
		//   30   57:iload_1         
		//   31   58:iload_3         
		//   32   59:icmpge          84
						((List) (arraylist)).add(((Object) ((MediaItem)aparcelable[i])));
		//   33   62:aload           4
		//   34   64:aload           5
		//   35   66:iload_1         
		//   36   67:aaload          
		//   37   68:checkcast       #52  <Class MediaBrowserCompat$MediaItem>
		//   38   71:invokeinterface #58  <Method boolean List.add(Object)>
		//   39   76:pop             
						i++;
		//   40   77:iload_1         
		//   41   78:iconst_1        
		//   42   79:iadd            
		//   43   80:istore_1        
					} while(true);
		//   44   81:goto            54
				}
				mCallback.onSearchResult(mQuery, mExtras, ((List) (bundle)));
		//   45   84:aload_0         
		//   46   85:getfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
		//   47   88:aload_0         
		//   48   89:getfield        #20  <Field String mQuery>
		//   49   92:aload_0         
		//   50   93:getfield        #22  <Field Bundle mExtras>
		//   51   96:aload_2         
		//   52   97:invokevirtual   #64  <Method void MediaBrowserCompat$SearchCallback.onSearchResult(String, Bundle, List)>
				return;
		//   53  100:return          
			} else
			{
				mCallback.onError(mQuery, mExtras);
		//   54  101:aload_0         
		//   55  102:getfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
		//   56  105:aload_0         
		//   57  106:getfield        #20  <Field String mQuery>
		//   58  109:aload_0         
		//   59  110:getfield        #22  <Field Bundle mExtras>
		//   60  113:invokevirtual   #68  <Method void MediaBrowserCompat$SearchCallback.onError(String, Bundle)>
				return;
		//   61  116:return          
			}
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

		void registerCallbackMessenger(Context context, Messenger messenger)
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
			sendRequest(6, bundle, messenger);
		//   14   28:aload_0         
		//   15   29:bipush          6
		//   16   31:aload_3         
		//   17   32:aload_2         
		//   18   33:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
		//   19   36:return          
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

		void setSubscription(Subscription subscription)
		{
			mSubscriptionRef = new WeakReference(((Object) (subscription)));
		//    0    0:aload_0         
		//    1    1:new             #68  <Class WeakReference>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #71  <Method void WeakReference(Object)>
		//    5    9:putfield        #73  <Field WeakReference mSubscriptionRef>
		//    6   12:return          
		}

		final Object mSubscriptionCallbackObj;
		WeakReference mSubscriptionRef;
		final IBinder mToken = new Binder();

		public SubscriptionCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #26  <Class Binder>
		//    4    8:dup             
		//    5    9:invokespecial   #27  <Method void Binder()>
		//    6   12:putfield        #29  <Field IBinder mToken>
			if(android.os.Build.VERSION.SDK_INT >= 26)
		//*   7   15:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
		//*   8   18:bipush          26
		//*   9   20:icmplt          39
			{
				mSubscriptionCallbackObj = MediaBrowserCompatApi26.createSubscriptionCallback(((MediaBrowserCompatApi26.SubscriptionCallback) (new StubApi26())));
		//   10   23:aload_0         
		//   11   24:new             #12  <Class MediaBrowserCompat$SubscriptionCallback$StubApi26>
		//   12   27:dup             
		//   13   28:aload_0         
		//   14   29:invokespecial   #38  <Method void MediaBrowserCompat$SubscriptionCallback$StubApi26(MediaBrowserCompat$SubscriptionCallback)>
		//   15   32:invokestatic    #44  <Method Object MediaBrowserCompatApi26.createSubscriptionCallback(MediaBrowserCompatApi26$SubscriptionCallback)>
		//   16   35:putfield        #46  <Field Object mSubscriptionCallbackObj>
				return;
		//   17   38:return          
			}
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*  18   39:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
		//*  19   42:bipush          21
		//*  20   44:icmplt          63
			{
				mSubscriptionCallbackObj = MediaBrowserCompatApi21.createSubscriptionCallback(((MediaBrowserCompatApi21.SubscriptionCallback) (new StubApi21())));
		//   21   47:aload_0         
		//   22   48:new             #9   <Class MediaBrowserCompat$SubscriptionCallback$StubApi21>
		//   23   51:dup             
		//   24   52:aload_0         
		//   25   53:invokespecial   #47  <Method void MediaBrowserCompat$SubscriptionCallback$StubApi21(MediaBrowserCompat$SubscriptionCallback)>
		//   26   56:invokestatic    #52  <Method Object MediaBrowserCompatApi21.createSubscriptionCallback(MediaBrowserCompatApi21$SubscriptionCallback)>
		//   27   59:putfield        #46  <Field Object mSubscriptionCallbackObj>
				return;
		//   28   62:return          
			} else
			{
				mSubscriptionCallbackObj = null;
		//   29   63:aload_0         
		//   30   64:aconst_null     
		//   31   65:putfield        #46  <Field Object mSubscriptionCallbackObj>
				return;
		//   32   68:return          
			}
		}
	}

	private class SubscriptionCallback.StubApi21
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
			int i1 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
		//    9   14:aload_2         
		//   10   15:ldc1            #34  <String "android.media.browse.extra.PAGE_SIZE">
		//   11   17:iconst_m1       
		//   12   18:invokevirtual   #32  <Method int Bundle.getInt(String, int)>
		//   13   21:istore          6
			if(i == -1 && i1 == -1)
		//*  14   23:iload_3         
		//*  15   24:iconst_m1       
		//*  16   25:icmpne          36
		//*  17   28:iload           6
		//*  18   30:iconst_m1       
		//*  19   31:icmpne          36
				return list;
		//   20   34:aload_1         
		//   21   35:areturn         
			int l = i1 * i;
		//   22   36:iload           6
		//   23   38:iload_3         
		//   24   39:imul            
		//   25   40:istore          5
			int k = l + i1;
		//   26   42:iload           5
		//   27   44:iload           6
		//   28   46:iadd            
		//   29   47:istore          4
			if(i >= 0 && i1 >= 1 && l < list.size())
		//*  30   49:iload_3         
		//*  31   50:iflt            104
		//*  32   53:iload           6
		//*  33   55:iconst_1        
		//*  34   56:icmplt          104
		//*  35   59:iload           5
		//*  36   61:aload_1         
		//*  37   62:invokeinterface #40  <Method int List.size()>
		//*  38   67:icmplt          73
		//*  39   70:goto            104
			{
				int j = k;
		//   40   73:iload           4
		//   41   75:istore_3        
				if(k > list.size())
		//*  42   76:iload           4
		//*  43   78:aload_1         
		//*  44   79:invokeinterface #40  <Method int List.size()>
		//*  45   84:icmple          94
					j = list.size();
		//   46   87:aload_1         
		//   47   88:invokeinterface #40  <Method int List.size()>
		//   48   93:istore_3        
				return list.subList(l, j);
		//   49   94:aload_1         
		//   50   95:iload           5
		//   51   97:iload_3         
		//   52   98:invokeinterface #44  <Method List List.subList(int, int)>
		//   53  103:areturn         
			} else
			{
				return Collections.emptyList();
		//   54  104:invokestatic    #50  <Method List Collections.emptyList()>
		//   55  107:areturn         
			}
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
		//   26   56:invokevirtual   #78  <Method List MediaBrowserCompat$Subscription.getCallbacks()>
		//   27   59:astore          5
			obj = ((Object) (((Subscription) (obj)).getOptionsList()));
		//   28   61:aload           4
		//   29   63:invokevirtual   #81  <Method List MediaBrowserCompat$Subscription.getOptionsList()>
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
		//   39   84:invokeinterface #84  <Method Object List.get(int)>
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
		//   56  120:invokevirtual   #86  <Method List applyOptions(List, Bundle)>
		//   57  123:aload           6
		//   58  125:invokevirtual   #89  <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
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
		//    3    5:invokevirtual   #95  <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
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

	private class SubscriptionCallback.StubApi26 extends SubscriptionCallback.StubApi21
		implements MediaBrowserCompatApi26.SubscriptionCallback
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

		SubscriptionCallback.StubApi26()
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
			mImpl = ((MediaBrowserImpl) (new MediaBrowserImplApi26(context, componentname, connectioncallback, bundle)));
	//    5   12:aload_0         
	//    6   13:new             #56  <Class MediaBrowserCompat$MediaBrowserImplApi26>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:aload_2         
	//   10   19:aload_3         
	//   11   20:aload           4
	//   12   22:invokespecial   #159 <Method void MediaBrowserCompat$MediaBrowserImplApi26(Context, ComponentName, MediaBrowserCompat$ConnectionCallback, Bundle)>
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

	public Bundle getNotifyChildrenChangedOptions()
	{
		return mImpl.getNotifyChildrenChangedOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #189 <Method Bundle MediaBrowserCompat$MediaBrowserImpl.getNotifyChildrenChangedOptions()>
	//    3    9:areturn         
	}

	public String getRoot()
	{
		return mImpl.getRoot();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #193 <Method String MediaBrowserCompat$MediaBrowserImpl.getRoot()>
	//    3    9:areturn         
	}

	public ComponentName getServiceComponent()
	{
		return mImpl.getServiceComponent();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #197 <Method ComponentName MediaBrowserCompat$MediaBrowserImpl.getServiceComponent()>
	//    3    9:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
	{
		return mImpl.getSessionToken();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #201 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserCompat$MediaBrowserImpl.getSessionToken()>
	//    3    9:areturn         
	}

	public boolean isConnected()
	{
		return mImpl.isConnected();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    2    4:invokeinterface #205 <Method boolean MediaBrowserCompat$MediaBrowserImpl.isConnected()>
	//    3    9:ireturn         
	}

	public void search(String s, Bundle bundle, SearchCallback searchcallback)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #213 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            34
		{
			if(searchcallback != null)
	//*   3    7:aload_3         
	//*   4    8:ifnull          24
			{
				mImpl.search(s, bundle, searchcallback);
	//    5   11:aload_0         
	//    6   12:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:aload_3         
	//   10   18:invokeinterface #215 <Method void MediaBrowserCompat$MediaBrowserImpl.search(String, Bundle, MediaBrowserCompat$SearchCallback)>
				return;
	//   11   23:return          
			} else
			{
				throw new IllegalArgumentException("callback cannot be null");
	//   12   24:new             #217 <Class IllegalArgumentException>
	//   13   27:dup             
	//   14   28:ldc1            #219 <String "callback cannot be null">
	//   15   30:invokespecial   #222 <Method void IllegalArgumentException(String)>
	//   16   33:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("query cannot be empty");
	//   17   34:new             #217 <Class IllegalArgumentException>
	//   18   37:dup             
	//   19   38:ldc1            #224 <String "query cannot be empty">
	//   20   40:invokespecial   #222 <Method void IllegalArgumentException(String)>
	//   21   43:athrow          
		}
	}

	public void sendCustomAction(String s, Bundle bundle, CustomActionCallback customactioncallback)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #213 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            20
		{
			mImpl.sendCustomAction(s, bundle, customactioncallback);
	//    3    7:aload_0         
	//    4    8:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokeinterface #228 <Method void MediaBrowserCompat$MediaBrowserImpl.sendCustomAction(String, Bundle, MediaBrowserCompat$CustomActionCallback)>
			return;
	//    9   19:return          
		} else
		{
			throw new IllegalArgumentException("action cannot be empty");
	//   10   20:new             #217 <Class IllegalArgumentException>
	//   11   23:dup             
	//   12   24:ldc1            #230 <String "action cannot be empty">
	//   13   26:invokespecial   #222 <Method void IllegalArgumentException(String)>
	//   14   29:athrow          
		}
	}

	public void subscribe(String s, Bundle bundle, SubscriptionCallback subscriptioncallback)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #213 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            48
		{
			if(subscriptioncallback != null)
	//*   3    7:aload_3         
	//*   4    8:ifnull          38
			{
				if(bundle != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          28
				{
					mImpl.subscribe(s, bundle, subscriptioncallback);
	//    7   15:aload_0         
	//    8   16:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokeinterface #234 <Method void MediaBrowserCompat$MediaBrowserImpl.subscribe(String, Bundle, MediaBrowserCompat$SubscriptionCallback)>
					return;
	//   13   27:return          
				} else
				{
					throw new IllegalArgumentException("options are null");
	//   14   28:new             #217 <Class IllegalArgumentException>
	//   15   31:dup             
	//   16   32:ldc1            #236 <String "options are null">
	//   17   34:invokespecial   #222 <Method void IllegalArgumentException(String)>
	//   18   37:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("callback is null");
	//   19   38:new             #217 <Class IllegalArgumentException>
	//   20   41:dup             
	//   21   42:ldc1            #238 <String "callback is null">
	//   22   44:invokespecial   #222 <Method void IllegalArgumentException(String)>
	//   23   47:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("parentId is empty");
	//   24   48:new             #217 <Class IllegalArgumentException>
	//   25   51:dup             
	//   26   52:ldc1            #240 <String "parentId is empty">
	//   27   54:invokespecial   #222 <Method void IllegalArgumentException(String)>
	//   28   57:athrow          
		}
	}

	public void subscribe(String s, SubscriptionCallback subscriptioncallback)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #213 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            34
		{
			if(subscriptioncallback != null)
	//*   3    7:aload_2         
	//*   4    8:ifnull          24
			{
				mImpl.subscribe(s, ((Bundle) (null)), subscriptioncallback);
	//    5   11:aload_0         
	//    6   12:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    7   15:aload_1         
	//    8   16:aconst_null     
	//    9   17:aload_2         
	//   10   18:invokeinterface #234 <Method void MediaBrowserCompat$MediaBrowserImpl.subscribe(String, Bundle, MediaBrowserCompat$SubscriptionCallback)>
				return;
	//   11   23:return          
			} else
			{
				throw new IllegalArgumentException("callback is null");
	//   12   24:new             #217 <Class IllegalArgumentException>
	//   13   27:dup             
	//   14   28:ldc1            #238 <String "callback is null">
	//   15   30:invokespecial   #222 <Method void IllegalArgumentException(String)>
	//   16   33:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("parentId is empty");
	//   17   34:new             #217 <Class IllegalArgumentException>
	//   18   37:dup             
	//   19   38:ldc1            #240 <String "parentId is empty">
	//   20   40:invokespecial   #222 <Method void IllegalArgumentException(String)>
	//   21   43:athrow          
		}
	}

	public void unsubscribe(String s)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #213 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            19
		{
			mImpl.unsubscribe(s, ((SubscriptionCallback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    5   11:aload_1         
	//    6   12:aconst_null     
	//    7   13:invokeinterface #244 <Method void MediaBrowserCompat$MediaBrowserImpl.unsubscribe(String, MediaBrowserCompat$SubscriptionCallback)>
			return;
	//    8   18:return          
		} else
		{
			throw new IllegalArgumentException("parentId is empty");
	//    9   19:new             #217 <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #240 <String "parentId is empty">
	//   12   25:invokespecial   #222 <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
		}
	}

	public void unsubscribe(String s, SubscriptionCallback subscriptioncallback)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #213 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            33
		{
			if(subscriptioncallback != null)
	//*   3    7:aload_2         
	//*   4    8:ifnull          23
			{
				mImpl.unsubscribe(s, subscriptioncallback);
	//    5   11:aload_0         
	//    6   12:getfield        #161 <Field MediaBrowserCompat$MediaBrowserImpl mImpl>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokeinterface #244 <Method void MediaBrowserCompat$MediaBrowserImpl.unsubscribe(String, MediaBrowserCompat$SubscriptionCallback)>
				return;
	//   10   22:return          
			} else
			{
				throw new IllegalArgumentException("callback is null");
	//   11   23:new             #217 <Class IllegalArgumentException>
	//   12   26:dup             
	//   13   27:ldc1            #238 <String "callback is null">
	//   14   29:invokespecial   #222 <Method void IllegalArgumentException(String)>
	//   15   32:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("parentId is empty");
	//   16   33:new             #217 <Class IllegalArgumentException>
	//   17   36:dup             
	//   18   37:ldc1            #240 <String "parentId is empty">
	//   19   39:invokespecial   #222 <Method void IllegalArgumentException(String)>
	//   20   42:athrow          
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
