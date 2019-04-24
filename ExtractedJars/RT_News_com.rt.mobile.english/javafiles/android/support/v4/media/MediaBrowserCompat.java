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
			if(mCallbacksMessengerRef == null || mCallbacksMessengerRef.get() == null) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field WeakReference mCallbacksMessengerRef>
		//    2    4:ifnull          258
		//    3    7:aload_0         
		//    4    8:getfield        #31  <Field WeakReference mCallbacksMessengerRef>
		//    5   11:invokevirtual   #35  <Method Object WeakReference.get()>
		//    6   14:ifnull          258
_L1:
			MediaBrowserServiceCallbackImpl mediabrowserservicecallbackimpl;
			Messenger messenger;
			Bundle bundle;
			if(mCallbackImplRef.get() == null)
		//*   7   17:aload_0         
		//*   8   18:getfield        #24  <Field WeakReference mCallbackImplRef>
		//*   9   21:invokevirtual   #35  <Method Object WeakReference.get()>
		//*  10   24:ifnonnull       28
				return;
		//   11   27:return          
			bundle = message.getData();
		//   12   28:aload_1         
		//   13   29:invokevirtual   #41  <Method Bundle Message.getData()>
		//   14   32:astore          4
			bundle.setClassLoader(((Class) (android/support/v4/media/session/MediaSessionCompat)).getClassLoader());
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
			JVM INSTR tableswitch 1 3: default 264
		//		               1 133
		//		               2 125
		//		               3 96;
		//   31   70:tableswitch     1 3: default 264
		//		               1 133
		//		               2 125
		//		               3 96
			   goto _L3 _L4 _L5 _L6
_L6:
			mediabrowserservicecallbackimpl.onLoadChildren(messenger, bundle.getString("data_media_item_id"), ((List) (bundle.getParcelableArrayList("data_media_item_list"))), bundle.getBundle("data_options"));
		//   32   96:aload_2         
		//   33   97:aload_3         
		//   34   98:aload           4
		//   35  100:ldc1            #65  <String "data_media_item_id">
		//   36  102:invokevirtual   #69  <Method String Bundle.getString(String)>
		//   37  105:aload           4
		//   38  107:ldc1            #71  <String "data_media_item_list">
		//   39  109:invokevirtual   #75  <Method ArrayList Bundle.getParcelableArrayList(String)>
		//   40  112:aload           4
		//   41  114:ldc1            #77  <String "data_options">
		//   42  116:invokevirtual   #81  <Method Bundle Bundle.getBundle(String)>
		//   43  119:invokeinterface #85  <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onLoadChildren(Messenger, String, List, Bundle)>
			return;
		//   44  124:return          
		//*  45  125:aload_2         
		//*  46  126:aload_3         
		//*  47  127:invokeinterface #89  <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onConnectionFailed(Messenger)>
		//*  48  132:return          
_L4:
			mediabrowserservicecallbackimpl.onServiceConnected(messenger, bundle.getString("data_media_item_id"), (android.support.v4.media.session.MediaSessionCompat.Token)bundle.getParcelable("data_media_session_token"), bundle.getBundle("data_root_hints"));
		//   49  133:aload_2         
		//   50  134:aload_3         
		//   51  135:aload           4
		//   52  137:ldc1            #65  <String "data_media_item_id">
		//   53  139:invokevirtual   #69  <Method String Bundle.getString(String)>
		//   54  142:aload           4
		//   55  144:ldc1            #91  <String "data_media_session_token">
		//   56  146:invokevirtual   #95  <Method Parcelable Bundle.getParcelable(String)>
		//   57  149:checkcast       #97  <Class android.support.v4.media.session.MediaSessionCompat$Token>
		//   58  152:aload           4
		//   59  154:ldc1            #99  <String "data_root_hints">
		//   60  156:invokevirtual   #81  <Method Bundle Bundle.getBundle(String)>
		//   61  159:invokeinterface #103 <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onServiceConnected(Messenger, String, android.support.v4.media.session.MediaSessionCompat$Token, Bundle)>
			return;
		//   62  164:return          
_L3:
			StringBuilder stringbuilder = new StringBuilder();
		//   63  165:new             #105 <Class StringBuilder>
		//   64  168:dup             
		//   65  169:invokespecial   #106 <Method void StringBuilder()>
		//   66  172:astore          4
			stringbuilder.append("Unhandled message: ");
		//   67  174:aload           4
		//   68  176:ldc1            #108 <String "Unhandled message: ">
		//   69  178:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
		//   70  181:pop             
			stringbuilder.append(((Object) (message)));
		//   71  182:aload           4
		//   72  184:aload_1         
		//   73  185:invokevirtual   #115 <Method StringBuilder StringBuilder.append(Object)>
		//   74  188:pop             
			stringbuilder.append("\n  Client version: ");
		//   75  189:aload           4
		//   76  191:ldc1            #117 <String "\n  Client version: ">
		//   77  193:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
		//   78  196:pop             
			stringbuilder.append(1);
		//   79  197:aload           4
		//   80  199:iconst_1        
		//   81  200:invokevirtual   #120 <Method StringBuilder StringBuilder.append(int)>
		//   82  203:pop             
			stringbuilder.append("\n  Service version: ");
		//   83  204:aload           4
		//   84  206:ldc1            #122 <String "\n  Service version: ">
		//   85  208:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
		//   86  211:pop             
			stringbuilder.append(message.arg1);
		//   87  212:aload           4
		//   88  214:aload_1         
		//   89  215:getfield        #125 <Field int Message.arg1>
		//   90  218:invokevirtual   #120 <Method StringBuilder StringBuilder.append(int)>
		//   91  221:pop             
			Log.w("MediaBrowserCompat", stringbuilder.toString());
		//   92  222:ldc1            #127 <String "MediaBrowserCompat">
		//   93  224:aload           4
		//   94  226:invokevirtual   #131 <Method String StringBuilder.toString()>
		//   95  229:invokestatic    #137 <Method int Log.w(String, String)>
		//   96  232:pop             
			return;
		//   97  233:return          
_L5:
			try
			{
				mediabrowserservicecallbackimpl.onConnectionFailed(messenger);
				return;
			}
		//*  98  234:ldc1            #127 <String "MediaBrowserCompat">
		//*  99  236:ldc1            #139 <String "Could not unparcel the data.">
		//* 100  238:invokestatic    #142 <Method int Log.e(String, String)>
		//* 101  241:pop             
		//* 102  242:aload_1         
		//* 103  243:getfield        #63  <Field int Message.what>
		//* 104  246:iconst_1        
		//* 105  247:icmpne          257
		//* 106  250:aload_2         
		//* 107  251:aload_3         
		//* 108  252:invokeinterface #89  <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onConnectionFailed(Messenger)>
		//* 109  257:return          
		//* 110  258:return          
			// Misplaced declaration of an exception variable
			catch(BadParcelableException badparcelableexception)
			{
				Log.e("MediaBrowserCompat", "Could not unparcel the data.");
			}
			if(message.what == 1)
				mediabrowserservicecallbackimpl.onConnectionFailed(messenger);
			return;
_L2:
			BadParcelableException badparcelableexception;
		//* 111  259:astore          4
		//* 112  261:goto            234
		//* 113  264:goto            165
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
		//		               -1 138
		//		               0 121
		//		               1 104
			default:
				StringBuilder stringbuilder = new StringBuilder();
		//    6   36:new             #29  <Class StringBuilder>
		//    7   39:dup             
		//    8   40:invokespecial   #32  <Method void StringBuilder()>
		//    9   43:astore_3        
				stringbuilder.append("Unknown result code: ");
		//   10   44:aload_3         
		//   11   45:ldc1            #34  <String "Unknown result code: ">
		//   12   47:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//   13   50:pop             
				stringbuilder.append(i);
		//   14   51:aload_3         
		//   15   52:iload_1         
		//   16   53:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
		//   17   56:pop             
				stringbuilder.append(" (extras=");
		//   18   57:aload_3         
		//   19   58:ldc1            #43  <String " (extras=">
		//   20   60:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//   21   63:pop             
				stringbuilder.append(((Object) (mExtras)));
		//   22   64:aload_3         
		//   23   65:aload_0         
		//   24   66:getfield        #22  <Field Bundle mExtras>
		//   25   69:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
		//   26   72:pop             
				stringbuilder.append(", resultData=");
		//   27   73:aload_3         
		//   28   74:ldc1            #48  <String ", resultData=">
		//   29   76:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//   30   79:pop             
				stringbuilder.append(((Object) (bundle)));
		//   31   80:aload_3         
		//   32   81:aload_2         
		//   33   82:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
		//   34   85:pop             
				stringbuilder.append(")");
		//   35   86:aload_3         
		//   36   87:ldc1            #50  <String ")">
		//   37   89:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//   38   92:pop             
				Log.w("MediaBrowserCompat", stringbuilder.toString());
		//   39   93:ldc1            #52  <String "MediaBrowserCompat">
		//   40   95:aload_3         
		//   41   96:invokevirtual   #56  <Method String StringBuilder.toString()>
		//   42   99:invokestatic    #62  <Method int Log.w(String, String)>
		//   43  102:pop             
				return;
		//   44  103:return          

			case 1: // '\001'
				mCallback.onProgressUpdate(mAction, mExtras, bundle);
		//   45  104:aload_0         
		//   46  105:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
		//   47  108:aload_0         
		//   48  109:getfield        #20  <Field String mAction>
		//   49  112:aload_0         
		//   50  113:getfield        #22  <Field Bundle mExtras>
		//   51  116:aload_2         
		//   52  117:invokevirtual   #68  <Method void MediaBrowserCompat$CustomActionCallback.onProgressUpdate(String, Bundle, Bundle)>
				return;
		//   53  120:return          

			case 0: // '\0'
				mCallback.onResult(mAction, mExtras, bundle);
		//   54  121:aload_0         
		//   55  122:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
		//   56  125:aload_0         
		//   57  126:getfield        #20  <Field String mAction>
		//   58  129:aload_0         
		//   59  130:getfield        #22  <Field Bundle mExtras>
		//   60  133:aload_2         
		//   61  134:invokevirtual   #71  <Method void MediaBrowserCompat$CustomActionCallback.onResult(String, Bundle, Bundle)>
				return;
		//   62  137:return          

			case -1: 
				mCallback.onError(mAction, mExtras, bundle);
		//   63  138:aload_0         
		//   64  139:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
		//   65  142:aload_0         
		//   66  143:getfield        #20  <Field String mAction>
		//   67  146:aload_0         
		//   68  147:getfield        #22  <Field Bundle mExtras>
		//   69  150:aload_2         
		//   70  151:invokevirtual   #74  <Method void MediaBrowserCompat$CustomActionCallback.onError(String, Bundle, Bundle)>
				return;
		//   71  154:return          
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
			if(i == 0 && bundle != null && bundle.containsKey("media_item"))
		//*   6   13:iload_1         
		//*   7   14:ifne            78
		//*   8   17:aload_2         
		//*   9   18:ifnull          78
		//*  10   21:aload_2         
		//*  11   22:ldc1            #37  <String "media_item">
		//*  12   24:invokevirtual   #41  <Method boolean Bundle.containsKey(String)>
		//*  13   27:ifne            33
		//*  14   30:goto            78
			{
				bundle = ((Bundle) (bundle.getParcelable("media_item")));
		//   15   33:aload_2         
		//   16   34:ldc1            #37  <String "media_item">
		//   17   36:invokevirtual   #45  <Method Parcelable Bundle.getParcelable(String)>
		//   18   39:astore_2        
				if(bundle != null && !(bundle instanceof MediaItem))
		//*  19   40:aload_2         
		//*  20   41:ifnull          66
		//*  21   44:aload_2         
		//*  22   45:instanceof      #47  <Class MediaBrowserCompat$MediaItem>
		//*  23   48:ifeq            54
		//*  24   51:goto            66
				{
					mCallback.onError(mMediaId);
		//   25   54:aload_0         
		//   26   55:getfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
		//   27   58:aload_0         
		//   28   59:getfield        #18  <Field String mMediaId>
		//   29   62:invokevirtual   #53  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
					return;
		//   30   65:return          
				} else
				{
					mCallback.onItemLoaded((MediaItem)bundle);
		//   31   66:aload_0         
		//   32   67:getfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
		//   33   70:aload_2         
		//   34   71:checkcast       #47  <Class MediaBrowserCompat$MediaItem>
		//   35   74:invokevirtual   #57  <Method void MediaBrowserCompat$ItemCallback.onItemLoaded(MediaBrowserCompat$MediaItem)>
					return;
		//   36   77:return          
				}
			} else
			{
				mCallback.onError(mMediaId);
		//   37   78:aload_0         
		//   38   79:getfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
		//   39   82:aload_0         
		//   40   83:getfield        #18  <Field String mMediaId>
		//   41   86:invokevirtual   #53  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
				return;
		//   42   89:return          
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

		public void getItem(String s, final ItemCallback cb)
		{
			RemoteException remoteexception;
			if(TextUtils.isEmpty(((CharSequence) (s))))
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
			Object obj = ((Object) (new ItemReceiver(s, cb, ((Handler) (mHandler)))));
		//   48   94:new             #170 <Class MediaBrowserCompat$ItemReceiver>
		//   49   97:dup             
		//   50   98:aload_1         
		//   51   99:aload_2         
		//   52  100:aload_0         
		//   53  101:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   54  104:invokespecial   #173 <Method void MediaBrowserCompat$ItemReceiver(String, MediaBrowserCompat$ItemCallback, Handler)>
		//   55  107:astore_3        
			try
			{
				mServiceBinderWrapper.getMediaItem(s, ((ResultReceiver) (obj)), mCallbacksMessenger);
		//   56  108:aload_0         
		//   57  109:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   58  112:aload_1         
		//   59  113:aload_3         
		//   60  114:aload_0         
		//   61  115:getfield        #111 <Field Messenger mCallbacksMessenger>
		//   62  118:invokevirtual   #177 <Method void MediaBrowserCompat$ServiceBinderWrapper.getMediaItem(String, ResultReceiver, Messenger)>
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
			IBinder ibinder = BundleCompat.getBinder(((Bundle) (obj)), "extra_messenger");
		//   13   24:aload_1         
		//   14   25:ldc1            #226 <String "extra_messenger">
		//   15   27:invokestatic    #232 <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//   16   30:astore_2        
			if(ibinder != null)
		//*  17   31:aload_2         
		//*  18   32:ifnull          99
			{
				mServiceBinderWrapper = new ServiceBinderWrapper(ibinder, mRootHints);
		//   19   35:aload_0         
		//   20   36:new             #113 <Class MediaBrowserCompat$ServiceBinderWrapper>
		//   21   39:dup             
		//   22   40:aload_2         
		//   23   41:aload_0         
		//   24   42:getfield        #82  <Field Bundle mRootHints>
		//   25   45:invokespecial   #235 <Method void MediaBrowserCompat$ServiceBinderWrapper(IBinder, Bundle)>
		//   26   48:putfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
				mCallbacksMessenger = new Messenger(((Handler) (mHandler)));
		//   27   51:aload_0         
		//   28   52:new             #237 <Class Messenger>
		//   29   55:dup             
		//   30   56:aload_0         
		//   31   57:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   32   60:invokespecial   #240 <Method void Messenger(Handler)>
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
		//*  51  102:invokestatic    #232 <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//*  52  105:invokestatic    #256 <Method android.support.v4.media.session.IMediaSession android.support.v4.media.session.IMediaSession$Stub.asInterface(IBinder)>
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
			messenger = ((Messenger) ((Subscription)mSubscriptions.get(((Object) (s)))));
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
			messenger = ((Messenger) (((Subscription) (messenger)).getCallback(mContext, bundle)));
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
						((SubscriptionCallback) (messenger)).onError(s);
		//   45   88:aload_1         
		//   46   89:aload_2         
		//   47   90:invokevirtual   #286 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
						return;
		//   48   93:return          
					} else
					{
						((SubscriptionCallback) (messenger)).onChildrenLoaded(s, list);
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
					((SubscriptionCallback) (messenger)).onError(s, bundle);
		//   56  105:aload_1         
		//   57  106:aload_2         
		//   58  107:aload           4
		//   59  109:invokevirtual   #293 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
					return;
		//   60  112:return          
				}
				((SubscriptionCallback) (messenger)).onChildrenLoaded(s, list, bundle);
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

		public void search(final String query, Bundle bundle, final SearchCallback callback)
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
			SearchResultReceiver searchresultreceiver = new SearchResultReceiver(query, bundle, callback, ((Handler) (mHandler)));
		//   27   54:new             #314 <Class MediaBrowserCompat$SearchResultReceiver>
		//   28   57:dup             
		//   29   58:aload_1         
		//   30   59:aload_2         
		//   31   60:aload_3         
		//   32   61:aload_0         
		//   33   62:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   34   65:invokespecial   #317 <Method void MediaBrowserCompat$SearchResultReceiver(String, Bundle, MediaBrowserCompat$SearchCallback, Handler)>
		//   35   68:astore          4
			try
			{
				mServiceBinderWrapper.search(query, bundle, ((ResultReceiver) (searchresultreceiver)), mCallbacksMessenger);
		//   36   70:aload_0         
		//   37   71:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   38   74:aload_1         
		//   39   75:aload_2         
		//   40   76:aload           4
		//   41   78:aload_0         
		//   42   79:getfield        #111 <Field Messenger mCallbacksMessenger>
		//   43   82:invokevirtual   #320 <Method void MediaBrowserCompat$ServiceBinderWrapper.search(String, Bundle, ResultReceiver, Messenger)>
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

		public void sendCustomAction(final String action, Bundle bundle, final CustomActionCallback callback)
		{
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #302 <Method boolean isConnected()>
		//*   2    4:ifne            79
			{
				callback = ((CustomActionCallback) (new StringBuilder()));
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
				((StringBuilder) (callback)).append(((Object) (bundle)));
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
			CustomActionResultReceiver customactionresultreceiver = new CustomActionResultReceiver(action, bundle, callback, ((Handler) (mHandler)));
		//   61  118:new             #348 <Class MediaBrowserCompat$CustomActionResultReceiver>
		//   62  121:dup             
		//   63  122:aload_1         
		//   64  123:aload_2         
		//   65  124:aload_3         
		//   66  125:aload_0         
		//   67  126:getfield        #61  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   68  129:invokespecial   #351 <Method void MediaBrowserCompat$CustomActionResultReceiver(String, Bundle, MediaBrowserCompat$CustomActionCallback, Handler)>
		//   69  132:astore          4
			try
			{
				mServiceBinderWrapper.sendCustomAction(action, bundle, ((ResultReceiver) (customactionresultreceiver)), mCallbacksMessenger);
		//   70  134:aload_0         
		//   71  135:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   72  138:aload_1         
		//   73  139:aload_2         
		//   74  140:aload           4
		//   75  142:aload_0         
		//   76  143:getfield        #111 <Field Messenger mCallbacksMessenger>
		//   77  146:invokevirtual   #353 <Method void MediaBrowserCompat$ServiceBinderWrapper.sendCustomAction(String, Bundle, ResultReceiver, Messenger)>
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
				stringbuilder.append(((Object) (bundle)));
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

		public void subscribe(String s, Bundle bundle, SubscriptionCallback subscriptioncallback)
		{
			Subscription subscription1 = (Subscription)mSubscriptions.get(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field ArrayMap mSubscriptions>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #266 <Method Object ArrayMap.get(Object)>
		//    4    8:checkcast       #268 <Class MediaBrowserCompat$Subscription>
		//    5   11:astore          5
			Subscription subscription = subscription1;
		//    6   13:aload           5
		//    7   15:astore          4
			if(subscription1 == null)
		//*   8   17:aload           5
		//*   9   19:ifnonnull       42
			{
				subscription = new Subscription();
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
			subscriptioncallback.setSubscription(subscription);
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
				MediaBrowserCompatApi21.subscribe(mBrowserObj, s, subscriptioncallback.mSubscriptionCallbackObj);
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
				mServiceBinderWrapper.addSubscription(s, subscriptioncallback.mToken, bundle, mCallbacksMessenger);
		//   49   97:aload_0         
		//   50   98:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   51  101:aload_1         
		//   52  102:aload_3         
		//   53  103:invokestatic    #384 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
		//   54  106:aload_2         
		//   55  107:aload_0         
		//   56  108:getfield        #111 <Field Messenger mCallbacksMessenger>
		//   57  111:invokevirtual   #388 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
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

		public void unsubscribe(String s, SubscriptionCallback subscriptioncallback)
		{
			Subscription subscription;
			subscription = (Subscription)mSubscriptions.get(((Object) (s)));
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
				mServiceBinderWrapper.removeSubscription(s, ((IBinder) (null)), mCallbacksMessenger);
		//   60  131:aload_0         
		//   61  132:getfield        #109 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   62  135:aload_1         
		//   63  136:aconst_null     
		//   64  137:aload_0         
		//   65  138:getfield        #111 <Field Messenger mCallbacksMessenger>
		//   66  141:invokevirtual   #418 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
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
		//*  90  193:invokestatic    #384 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
		//*  91  196:aload_0         
		//*  92  197:getfield        #111 <Field Messenger mCallbacksMessenger>
		//*  93  200:invokevirtual   #418 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
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
				mServiceBinderWrapper.removeSubscription(s, subscriptioncallback.mToken, mCallbacksMessenger);
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
		protected final CallbackHandler mHandler = new CallbackHandler(((MediaBrowserServiceCallbackImpl) (this)));
		private android.support.v4.media.session.MediaSessionCompat.Token mMediaSessionToken;
		protected final Bundle mRootHints;
		protected ServiceBinderWrapper mServiceBinderWrapper;
		protected int mServiceVersion;
		private final ArrayMap mSubscriptions = new ArrayMap();

		MediaBrowserImplApi21(Context context, ComponentName componentname, ConnectionCallback connectioncallback, Bundle bundle)
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
			connectioncallback.setInternalConnectionCallback(((ConnectionCallback.ConnectionCallbackInternal) (this)));
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
		//   20   36:invokestatic    #39  <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
		//   21   39:invokestatic    #44  <Method void MediaBrowserCompatApi21.subscribe(Object, String, Object)>
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
		//   28   50:invokestatic    #39  <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
		//   29   53:invokestatic    #49  <Method void MediaBrowserCompatApi26.subscribe(Object, String, Bundle, Object)>
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
		//   11   21:invokespecial   #54  <Method void MediaBrowserCompat$MediaBrowserImplApi23.unsubscribe(String, MediaBrowserCompat$SubscriptionCallback)>
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
		//   18   34:invokestatic    #57  <Method void MediaBrowserCompatApi21.unsubscribe(Object, String)>
				return;
		//   19   37:return          
			} else
			{
				MediaBrowserCompatApi26.unsubscribe(mBrowserObj, s, subscriptioncallback.mSubscriptionCallbackObj);
		//   20   38:aload_0         
		//   21   39:getfield        #33  <Field Object mBrowserObj>
		//   22   42:aload_1         
		//   23   43:aload_2         
		//   24   44:invokestatic    #39  <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
		//   25   47:invokestatic    #59  <Method void MediaBrowserCompatApi26.unsubscribe(Object, String, Object)>
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
		//    2   36:new             #114 <Class StringBuilder>
		//    3   39:dup             
		//    4   40:invokespecial   #115 <Method void StringBuilder()>
		//    5   43:astore_1        
				stringbuilder.append("UNKNOWN/");
		//    6   44:aload_1         
		//    7   45:ldc1            #117 <String "UNKNOWN/">
		//    8   47:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//    9   50:pop             
				stringbuilder.append(i);
		//   10   51:aload_1         
		//   11   52:iload_0         
		//   12   53:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
		//   13   56:pop             
				return stringbuilder.toString();
		//   14   57:aload_1         
		//   15   58:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   16   61:areturn         

			case 4: // '\004'
				return "CONNECT_STATE_SUSPENDED";
		//   17   62:ldc1            #129 <String "CONNECT_STATE_SUSPENDED">
		//   18   64:areturn         

			case 3: // '\003'
				return "CONNECT_STATE_CONNECTED";
		//   19   65:ldc1            #130 <String "CONNECT_STATE_CONNECTED">
		//   20   67:areturn         

			case 2: // '\002'
				return "CONNECT_STATE_CONNECTING";
		//   21   68:ldc1            #131 <String "CONNECT_STATE_CONNECTING">
		//   22   70:areturn         

			case 1: // '\001'
				return "CONNECT_STATE_DISCONNECTED";
		//   23   71:ldc1            #132 <String "CONNECT_STATE_DISCONNECTED">
		//   24   73:areturn         

			case 0: // '\0'
				return "CONNECT_STATE_DISCONNECTING";
		//   25   74:ldc1            #133 <String "CONNECT_STATE_DISCONNECTING">
		//   26   76:areturn         
			}
		}

		private boolean isCurrent(Messenger messenger, String s)
		{
			if(mCallbacksMessenger == messenger && mState != 0 && mState != 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #137 <Field Messenger mCallbacksMessenger>
		//*   2    4:aload_1         
		//*   3    5:if_acmpne       28
		//*   4    8:aload_0         
		//*   5    9:getfield        #85  <Field int mState>
		//*   6   12:ifeq            28
		//*   7   15:aload_0         
		//*   8   16:getfield        #85  <Field int mState>
		//*   9   19:iconst_1        
		//*  10   20:icmpne          26
		//*  11   23:goto            28
				return true;
		//   12   26:iconst_1        
		//   13   27:ireturn         
			if(mState != 0 && mState != 1)
		//*  14   28:aload_0         
		//*  15   29:getfield        #85  <Field int mState>
		//*  16   32:ifeq            112
		//*  17   35:aload_0         
		//*  18   36:getfield        #85  <Field int mState>
		//*  19   39:iconst_1        
		//*  20   40:icmpeq          112
			{
				messenger = ((Messenger) (new StringBuilder()));
		//   21   43:new             #114 <Class StringBuilder>
		//   22   46:dup             
		//   23   47:invokespecial   #115 <Method void StringBuilder()>
		//   24   50:astore_1        
				((StringBuilder) (messenger)).append(s);
		//   25   51:aload_1         
		//   26   52:aload_2         
		//   27   53:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   28   56:pop             
				((StringBuilder) (messenger)).append(" for ");
		//   29   57:aload_1         
		//   30   58:ldc1            #139 <String " for ">
		//   31   60:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   32   63:pop             
				((StringBuilder) (messenger)).append(((Object) (mServiceComponent)));
		//   33   64:aload_1         
		//   34   65:aload_0         
		//   35   66:getfield        #100 <Field ComponentName mServiceComponent>
		//   36   69:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
		//   37   72:pop             
				((StringBuilder) (messenger)).append(" with mCallbacksMessenger=");
		//   38   73:aload_1         
		//   39   74:ldc1            #144 <String " with mCallbacksMessenger=">
		//   40   76:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   41   79:pop             
				((StringBuilder) (messenger)).append(((Object) (mCallbacksMessenger)));
		//   42   80:aload_1         
		//   43   81:aload_0         
		//   44   82:getfield        #137 <Field Messenger mCallbacksMessenger>
		//   45   85:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
		//   46   88:pop             
				((StringBuilder) (messenger)).append(" this=");
		//   47   89:aload_1         
		//   48   90:ldc1            #146 <String " this=">
		//   49   92:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   50   95:pop             
				((StringBuilder) (messenger)).append(((Object) (this)));
		//   51   96:aload_1         
		//   52   97:aload_0         
		//   53   98:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
		//   54  101:pop             
				Log.i("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
		//   55  102:ldc1            #148 <String "MediaBrowserCompat">
		//   56  104:aload_1         
		//   57  105:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   58  108:invokestatic    #154 <Method int Log.i(String, String)>
		//   59  111:pop             
			}
			return false;
		//   60  112:iconst_0        
		//   61  113:ireturn         
		}

		public void connect()
		{
			if(mState != 0 && mState != 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #85  <Field int mState>
		//*   2    4:ifeq            61
		//*   3    7:aload_0         
		//*   4    8:getfield        #85  <Field int mState>
		//*   5   11:iconst_1        
		//*   6   12:icmpeq          61
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    7   15:new             #114 <Class StringBuilder>
		//    8   18:dup             
		//    9   19:invokespecial   #115 <Method void StringBuilder()>
		//   10   22:astore_1        
				stringbuilder.append("connect() called while neigther disconnecting nor disconnected (state=");
		//   11   23:aload_1         
		//   12   24:ldc1            #157 <String "connect() called while neigther disconnecting nor disconnected (state=">
		//   13   26:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   14   29:pop             
				stringbuilder.append(getStateLabel(mState));
		//   15   30:aload_1         
		//   16   31:aload_0         
		//   17   32:getfield        #85  <Field int mState>
		//   18   35:invokestatic    #159 <Method String getStateLabel(int)>
		//   19   38:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   20   41:pop             
				stringbuilder.append(")");
		//   21   42:aload_1         
		//   22   43:ldc1            #161 <String ")">
		//   23   45:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   24   48:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   25   49:new             #163 <Class IllegalStateException>
		//   26   52:dup             
		//   27   53:aload_1         
		//   28   54:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   29   57:invokespecial   #164 <Method void IllegalStateException(String)>
		//   30   60:athrow          
			} else
			{
				mState = 2;
		//   31   61:aload_0         
		//   32   62:iconst_2        
		//   33   63:putfield        #85  <Field int mState>
				mHandler.post(new Runnable() {

					public void run()
					{
						Exception exception;
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
					//*  10   22:ifeq            74
					//*  11   25:aload_0         
					//*  12   26:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//*  13   29:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
					//*  14   32:ifnull          74
						{
							StringBuilder stringbuilder = new StringBuilder();
					//   15   35:new             #40  <Class StringBuilder>
					//   16   38:dup             
					//   17   39:invokespecial   #41  <Method void StringBuilder()>
					//   18   42:astore_2        
							stringbuilder.append("mServiceConnection should be null. Instead it is ");
					//   19   43:aload_2         
					//   20   44:ldc1            #43  <String "mServiceConnection should be null. Instead it is ">
					//   21   46:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
					//   22   49:pop             
							stringbuilder.append(((Object) (mServiceConnection)));
					//   23   50:aload_2         
					//   24   51:aload_0         
					//   25   52:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   26   55:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
					//   27   58:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
					//   28   61:pop             
							throw new RuntimeException(stringbuilder.toString());
					//   29   62:new             #52  <Class RuntimeException>
					//   30   65:dup             
					//   31   66:aload_2         
					//   32   67:invokevirtual   #56  <Method String StringBuilder.toString()>
					//   33   70:invokespecial   #59  <Method void RuntimeException(String)>
					//   34   73:athrow          
						}
						if(mServiceBinderWrapper != null)
					//*  35   74:aload_0         
					//*  36   75:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//*  37   78:getfield        #63  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
					//*  38   81:ifnull          123
						{
							StringBuilder stringbuilder1 = new StringBuilder();
					//   39   84:new             #40  <Class StringBuilder>
					//   40   87:dup             
					//   41   88:invokespecial   #41  <Method void StringBuilder()>
					//   42   91:astore_2        
							stringbuilder1.append("mServiceBinderWrapper should be null. Instead it is ");
					//   43   92:aload_2         
					//   44   93:ldc1            #65  <String "mServiceBinderWrapper should be null. Instead it is ">
					//   45   95:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
					//   46   98:pop             
							stringbuilder1.append(((Object) (mServiceBinderWrapper)));
					//   47   99:aload_2         
					//   48  100:aload_0         
					//   49  101:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   50  104:getfield        #63  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
					//   51  107:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
					//   52  110:pop             
							throw new RuntimeException(stringbuilder1.toString());
					//   53  111:new             #52  <Class RuntimeException>
					//   54  114:dup             
					//   55  115:aload_2         
					//   56  116:invokevirtual   #56  <Method String StringBuilder.toString()>
					//   57  119:invokespecial   #59  <Method void RuntimeException(String)>
					//   58  122:athrow          
						}
						if(mCallbacksMessenger != null)
					//*  59  123:aload_0         
					//*  60  124:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//*  61  127:getfield        #69  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
					//*  62  130:ifnull          172
						{
							StringBuilder stringbuilder2 = new StringBuilder();
					//   63  133:new             #40  <Class StringBuilder>
					//   64  136:dup             
					//   65  137:invokespecial   #41  <Method void StringBuilder()>
					//   66  140:astore_2        
							stringbuilder2.append("mCallbacksMessenger should be null. Instead it is ");
					//   67  141:aload_2         
					//   68  142:ldc1            #71  <String "mCallbacksMessenger should be null. Instead it is ">
					//   69  144:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
					//   70  147:pop             
							stringbuilder2.append(((Object) (mCallbacksMessenger)));
					//   71  148:aload_2         
					//   72  149:aload_0         
					//   73  150:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   74  153:getfield        #69  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
					//   75  156:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
					//   76  159:pop             
							throw new RuntimeException(stringbuilder2.toString());
					//   77  160:new             #52  <Class RuntimeException>
					//   78  163:dup             
					//   79  164:aload_2         
					//   80  165:invokevirtual   #56  <Method String StringBuilder.toString()>
					//   81  168:invokespecial   #59  <Method void RuntimeException(String)>
					//   82  171:athrow          
						}
						Object obj = ((Object) (new Intent("android.media.browse.MediaBrowserService")));
					//   83  172:new             #73  <Class Intent>
					//   84  175:dup             
					//   85  176:ldc1            #75  <String "android.media.browse.MediaBrowserService">
					//   86  178:invokespecial   #76  <Method void Intent(String)>
					//   87  181:astore_2        
						((Intent) (obj)).setComponent(mServiceComponent);
					//   88  182:aload_2         
					//   89  183:aload_0         
					//   90  184:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   91  187:getfield        #80  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
					//   92  190:invokevirtual   #84  <Method Intent Intent.setComponent(ComponentName)>
					//   93  193:pop             
						mServiceConnection = new MediaBrowserImplBase.MediaServiceConnection();
					//   94  194:aload_0         
					//   95  195:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//   96  198:new             #86  <Class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection>
					//   97  201:dup             
					//   98  202:aload_0         
					//   99  203:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//  100  206:invokespecial   #88  <Method void MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection(MediaBrowserCompat$MediaBrowserImplBase)>
					//  101  209:putfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
						boolean flag;
						try
						{
							flag = mContext.bindService(((Intent) (obj)), ((ServiceConnection) (mServiceConnection)), 1);
					//  102  212:aload_0         
					//  103  213:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//  104  216:getfield        #92  <Field Context MediaBrowserCompat$MediaBrowserImplBase.mContext>
					//  105  219:aload_2         
					//  106  220:aload_0         
					//  107  221:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//  108  224:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
					//  109  227:iconst_1        
					//  110  228:invokevirtual   #98  <Method boolean Context.bindService(Intent, ServiceConnection, int)>
					//  111  231:istore_1        
						}
					//* 112  232:goto            274
					//* 113  235:new             #40  <Class StringBuilder>
					//* 114  238:dup             
					//* 115  239:invokespecial   #41  <Method void StringBuilder()>
					//* 116  242:astore_2        
					//* 117  243:aload_2         
					//* 118  244:ldc1            #100 <String "Failed binding to service ">
					//* 119  246:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
					//* 120  249:pop             
					//* 121  250:aload_2         
					//* 122  251:aload_0         
					//* 123  252:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//* 124  255:getfield        #80  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
					//* 125  258:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
					//* 126  261:pop             
					//* 127  262:ldc1            #102 <String "MediaBrowserCompat">
					//* 128  264:aload_2         
					//* 129  265:invokevirtual   #56  <Method String StringBuilder.toString()>
					//* 130  268:invokestatic    #108 <Method int Log.e(String, String)>
					//* 131  271:pop             
					//* 132  272:iconst_0        
					//* 133  273:istore_1        
					//* 134  274:iload_1         
					//* 135  275:ifne            295
					//* 136  278:aload_0         
					//* 137  279:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//* 138  282:invokevirtual   #111 <Method void MediaBrowserCompat$MediaBrowserImplBase.forceCloseConnection()>
					//* 139  285:aload_0         
					//* 140  286:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//* 141  289:getfield        #115 <Field MediaBrowserCompat$ConnectionCallback MediaBrowserCompat$MediaBrowserImplBase.mCallback>
					//* 142  292:invokevirtual   #120 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
					//* 143  295:getstatic       #34  <Field boolean MediaBrowserCompat.DEBUG>
					//* 144  298:ifeq            316
					//* 145  301:ldc1            #102 <String "MediaBrowserCompat">
					//* 146  303:ldc1            #122 <String "connect...">
					//* 147  305:invokestatic    #125 <Method int Log.d(String, String)>
					//* 148  308:pop             
					//* 149  309:aload_0         
					//* 150  310:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
					//* 151  313:invokevirtual   #128 <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
					//* 152  316:return          
						// Misplaced declaration of an exception variable
						catch(Exception exception)
						{
							obj = ((Object) (new StringBuilder()));
							((StringBuilder) (obj)).append("Failed binding to service ");
							((StringBuilder) (obj)).append(((Object) (mServiceComponent)));
							Log.e("MediaBrowserCompat", ((StringBuilder) (obj)).toString());
							flag = false;
						}
						if(!flag)
						{
							forceCloseConnection();
							mCallback.onConnectionFailed();
						}
						if(MediaBrowserCompat.DEBUG)
						{
							Log.d("MediaBrowserCompat", "connect...");
							dump();
						}
					//* 153  317:astore_2        
					//* 154  318:goto            235
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
		//   34   66:aload_0         
		//   35   67:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   36   70:new             #13  <Class MediaBrowserCompat$MediaBrowserImplBase$1>
		//   37   73:dup             
		//   38   74:aload_0         
		//   39   75:invokespecial   #167 <Method void MediaBrowserCompat$MediaBrowserImplBase$1(MediaBrowserCompat$MediaBrowserImplBase)>
		//   40   78:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   41   81:pop             
				return;
		//   42   82:return          
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
		//    0    0:ldc1            #148 <String "MediaBrowserCompat">
		//    1    2:ldc1            #176 <String "MediaBrowserCompat...">
		//    2    4:invokestatic    #179 <Method int Log.d(String, String)>
		//    3    7:pop             
			StringBuilder stringbuilder = new StringBuilder();
		//    4    8:new             #114 <Class StringBuilder>
		//    5   11:dup             
		//    6   12:invokespecial   #115 <Method void StringBuilder()>
		//    7   15:astore_1        
			stringbuilder.append("  mServiceComponent=");
		//    8   16:aload_1         
		//    9   17:ldc1            #181 <String "  mServiceComponent=">
		//   10   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   11   22:pop             
			stringbuilder.append(((Object) (mServiceComponent)));
		//   12   23:aload_1         
		//   13   24:aload_0         
		//   14   25:getfield        #100 <Field ComponentName mServiceComponent>
		//   15   28:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
		//   16   31:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//   17   32:ldc1            #148 <String "MediaBrowserCompat">
		//   18   34:aload_1         
		//   19   35:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   20   38:invokestatic    #179 <Method int Log.d(String, String)>
		//   21   41:pop             
			stringbuilder = new StringBuilder();
		//   22   42:new             #114 <Class StringBuilder>
		//   23   45:dup             
		//   24   46:invokespecial   #115 <Method void StringBuilder()>
		//   25   49:astore_1        
			stringbuilder.append("  mCallback=");
		//   26   50:aload_1         
		//   27   51:ldc1            #183 <String "  mCallback=">
		//   28   53:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   29   56:pop             
			stringbuilder.append(((Object) (mCallback)));
		//   30   57:aload_1         
		//   31   58:aload_0         
		//   32   59:getfield        #102 <Field MediaBrowserCompat$ConnectionCallback mCallback>
		//   33   62:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
		//   34   65:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//   35   66:ldc1            #148 <String "MediaBrowserCompat">
		//   36   68:aload_1         
		//   37   69:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   38   72:invokestatic    #179 <Method int Log.d(String, String)>
		//   39   75:pop             
			stringbuilder = new StringBuilder();
		//   40   76:new             #114 <Class StringBuilder>
		//   41   79:dup             
		//   42   80:invokespecial   #115 <Method void StringBuilder()>
		//   43   83:astore_1        
			stringbuilder.append("  mRootHints=");
		//   44   84:aload_1         
		//   45   85:ldc1            #185 <String "  mRootHints=">
		//   46   87:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   47   90:pop             
			stringbuilder.append(((Object) (mRootHints)));
		//   48   91:aload_1         
		//   49   92:aload_0         
		//   50   93:getfield        #109 <Field Bundle mRootHints>
		//   51   96:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
		//   52   99:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//   53  100:ldc1            #148 <String "MediaBrowserCompat">
		//   54  102:aload_1         
		//   55  103:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   56  106:invokestatic    #179 <Method int Log.d(String, String)>
		//   57  109:pop             
			stringbuilder = new StringBuilder();
		//   58  110:new             #114 <Class StringBuilder>
		//   59  113:dup             
		//   60  114:invokespecial   #115 <Method void StringBuilder()>
		//   61  117:astore_1        
			stringbuilder.append("  mState=");
		//   62  118:aload_1         
		//   63  119:ldc1            #187 <String "  mState=">
		//   64  121:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   65  124:pop             
			stringbuilder.append(getStateLabel(mState));
		//   66  125:aload_1         
		//   67  126:aload_0         
		//   68  127:getfield        #85  <Field int mState>
		//   69  130:invokestatic    #159 <Method String getStateLabel(int)>
		//   70  133:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   71  136:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//   72  137:ldc1            #148 <String "MediaBrowserCompat">
		//   73  139:aload_1         
		//   74  140:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   75  143:invokestatic    #179 <Method int Log.d(String, String)>
		//   76  146:pop             
			stringbuilder = new StringBuilder();
		//   77  147:new             #114 <Class StringBuilder>
		//   78  150:dup             
		//   79  151:invokespecial   #115 <Method void StringBuilder()>
		//   80  154:astore_1        
			stringbuilder.append("  mServiceConnection=");
		//   81  155:aload_1         
		//   82  156:ldc1            #189 <String "  mServiceConnection=">
		//   83  158:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   84  161:pop             
			stringbuilder.append(((Object) (mServiceConnection)));
		//   85  162:aload_1         
		//   86  163:aload_0         
		//   87  164:getfield        #191 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
		//   88  167:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
		//   89  170:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//   90  171:ldc1            #148 <String "MediaBrowserCompat">
		//   91  173:aload_1         
		//   92  174:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   93  177:invokestatic    #179 <Method int Log.d(String, String)>
		//   94  180:pop             
			stringbuilder = new StringBuilder();
		//   95  181:new             #114 <Class StringBuilder>
		//   96  184:dup             
		//   97  185:invokespecial   #115 <Method void StringBuilder()>
		//   98  188:astore_1        
			stringbuilder.append("  mServiceBinderWrapper=");
		//   99  189:aload_1         
		//  100  190:ldc1            #193 <String "  mServiceBinderWrapper=">
		//  101  192:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//  102  195:pop             
			stringbuilder.append(((Object) (mServiceBinderWrapper)));
		//  103  196:aload_1         
		//  104  197:aload_0         
		//  105  198:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//  106  201:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
		//  107  204:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//  108  205:ldc1            #148 <String "MediaBrowserCompat">
		//  109  207:aload_1         
		//  110  208:invokevirtual   #128 <Method String StringBuilder.toString()>
		//  111  211:invokestatic    #179 <Method int Log.d(String, String)>
		//  112  214:pop             
			stringbuilder = new StringBuilder();
		//  113  215:new             #114 <Class StringBuilder>
		//  114  218:dup             
		//  115  219:invokespecial   #115 <Method void StringBuilder()>
		//  116  222:astore_1        
			stringbuilder.append("  mCallbacksMessenger=");
		//  117  223:aload_1         
		//  118  224:ldc1            #197 <String "  mCallbacksMessenger=">
		//  119  226:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//  120  229:pop             
			stringbuilder.append(((Object) (mCallbacksMessenger)));
		//  121  230:aload_1         
		//  122  231:aload_0         
		//  123  232:getfield        #137 <Field Messenger mCallbacksMessenger>
		//  124  235:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
		//  125  238:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//  126  239:ldc1            #148 <String "MediaBrowserCompat">
		//  127  241:aload_1         
		//  128  242:invokevirtual   #128 <Method String StringBuilder.toString()>
		//  129  245:invokestatic    #179 <Method int Log.d(String, String)>
		//  130  248:pop             
			stringbuilder = new StringBuilder();
		//  131  249:new             #114 <Class StringBuilder>
		//  132  252:dup             
		//  133  253:invokespecial   #115 <Method void StringBuilder()>
		//  134  256:astore_1        
			stringbuilder.append("  mRootId=");
		//  135  257:aload_1         
		//  136  258:ldc1            #199 <String "  mRootId=">
		//  137  260:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//  138  263:pop             
			stringbuilder.append(mRootId);
		//  139  264:aload_1         
		//  140  265:aload_0         
		//  141  266:getfield        #201 <Field String mRootId>
		//  142  269:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//  143  272:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//  144  273:ldc1            #148 <String "MediaBrowserCompat">
		//  145  275:aload_1         
		//  146  276:invokevirtual   #128 <Method String StringBuilder.toString()>
		//  147  279:invokestatic    #179 <Method int Log.d(String, String)>
		//  148  282:pop             
			stringbuilder = new StringBuilder();
		//  149  283:new             #114 <Class StringBuilder>
		//  150  286:dup             
		//  151  287:invokespecial   #115 <Method void StringBuilder()>
		//  152  290:astore_1        
			stringbuilder.append("  mMediaSessionToken=");
		//  153  291:aload_1         
		//  154  292:ldc1            #203 <String "  mMediaSessionToken=">
		//  155  294:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//  156  297:pop             
			stringbuilder.append(((Object) (mMediaSessionToken)));
		//  157  298:aload_1         
		//  158  299:aload_0         
		//  159  300:getfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		//  160  303:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
		//  161  306:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//  162  307:ldc1            #148 <String "MediaBrowserCompat">
		//  163  309:aload_1         
		//  164  310:invokevirtual   #128 <Method String StringBuilder.toString()>
		//  165  313:invokestatic    #179 <Method int Log.d(String, String)>
		//  166  316:pop             
		//  167  317:return          
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
		//*   2    4:ifne            53
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    3    7:new             #114 <Class StringBuilder>
		//    4   10:dup             
		//    5   11:invokespecial   #115 <Method void StringBuilder()>
		//    6   14:astore_1        
				stringbuilder.append("getExtras() called while not connected (state=");
		//    7   15:aload_1         
		//    8   16:ldc1            #225 <String "getExtras() called while not connected (state=">
		//    9   18:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   21:pop             
				stringbuilder.append(getStateLabel(mState));
		//   11   22:aload_1         
		//   12   23:aload_0         
		//   13   24:getfield        #85  <Field int mState>
		//   14   27:invokestatic    #159 <Method String getStateLabel(int)>
		//   15   30:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   16   33:pop             
				stringbuilder.append(")");
		//   17   34:aload_1         
		//   18   35:ldc1            #161 <String ")">
		//   19   37:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   20   40:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   21   41:new             #163 <Class IllegalStateException>
		//   22   44:dup             
		//   23   45:aload_1         
		//   24   46:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   25   49:invokespecial   #164 <Method void IllegalStateException(String)>
		//   26   52:athrow          
			} else
			{
				return mExtras;
		//   27   53:aload_0         
		//   28   54:getfield        #227 <Field Bundle mExtras>
		//   29   57:areturn         
			}
		}

		public void getItem(String s, final ItemCallback cb)
		{
			RemoteException remoteexception;
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
		//   18   38:ldc1            #148 <String "MediaBrowserCompat">
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
			Object obj = ((Object) (new ItemReceiver(s, cb, ((Handler) (mHandler)))));
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
				mServiceBinderWrapper.getMediaItem(s, ((ResultReceiver) (obj)), mCallbacksMessenger);
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
		//*  49   93:new             #114 <Class StringBuilder>
		//*  50   96:dup             
		//*  51   97:invokespecial   #115 <Method void StringBuilder()>
		//*  52  100:astore_3        
		//*  53  101:aload_3         
		//*  54  102:ldc2            #261 <String "Remote error getting media item: ">
		//*  55  105:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//*  56  108:pop             
		//*  57  109:aload_3         
		//*  58  110:aload_1         
		//*  59  111:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//*  60  114:pop             
		//*  61  115:ldc1            #148 <String "MediaBrowserCompat">
		//*  62  117:aload_3         
		//*  63  118:invokevirtual   #128 <Method String StringBuilder.toString()>
		//*  64  121:invokestatic    #154 <Method int Log.i(String, String)>
		//*  65  124:pop             
		//*  66  125:aload_0         
		//*  67  126:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//*  68  129:new             #19  <Class MediaBrowserCompat$MediaBrowserImplBase$4>
		//*  69  132:dup             
		//*  70  133:aload_0         
		//*  71  134:aload_2         
		//*  72  135:aload_1         
		//*  73  136:invokespecial   #262 <Method void MediaBrowserCompat$MediaBrowserImplBase$4(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$ItemCallback, String)>
		//*  74  139:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//*  75  142:pop             
		//*  76  143:return          
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
		//*  77  144:astore_3        
		//*  78  145:goto            93
		}

		public String getRoot()
		{
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
		//*   2    4:ifne            54
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    3    7:new             #114 <Class StringBuilder>
		//    4   10:dup             
		//    5   11:invokespecial   #115 <Method void StringBuilder()>
		//    6   14:astore_1        
				stringbuilder.append("getRoot() called while not connected(state=");
		//    7   15:aload_1         
		//    8   16:ldc2            #266 <String "getRoot() called while not connected(state=">
		//    9   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   22:pop             
				stringbuilder.append(getStateLabel(mState));
		//   11   23:aload_1         
		//   12   24:aload_0         
		//   13   25:getfield        #85  <Field int mState>
		//   14   28:invokestatic    #159 <Method String getStateLabel(int)>
		//   15   31:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   16   34:pop             
				stringbuilder.append(")");
		//   17   35:aload_1         
		//   18   36:ldc1            #161 <String ")">
		//   19   38:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   20   41:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   21   42:new             #163 <Class IllegalStateException>
		//   22   45:dup             
		//   23   46:aload_1         
		//   24   47:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   25   50:invokespecial   #164 <Method void IllegalStateException(String)>
		//   26   53:athrow          
			} else
			{
				return mRootId;
		//   27   54:aload_0         
		//   28   55:getfield        #201 <Field String mRootId>
		//   29   58:areturn         
			}
		}

		public ComponentName getServiceComponent()
		{
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
		//*   2    4:ifne            51
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    3    7:new             #114 <Class StringBuilder>
		//    4   10:dup             
		//    5   11:invokespecial   #115 <Method void StringBuilder()>
		//    6   14:astore_1        
				stringbuilder.append("getServiceComponent() called while not connected (state=");
		//    7   15:aload_1         
		//    8   16:ldc2            #270 <String "getServiceComponent() called while not connected (state=">
		//    9   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   22:pop             
				stringbuilder.append(mState);
		//   11   23:aload_1         
		//   12   24:aload_0         
		//   13   25:getfield        #85  <Field int mState>
		//   14   28:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
		//   15   31:pop             
				stringbuilder.append(")");
		//   16   32:aload_1         
		//   17   33:ldc1            #161 <String ")">
		//   18   35:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   19   38:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   20   39:new             #163 <Class IllegalStateException>
		//   21   42:dup             
		//   22   43:aload_1         
		//   23   44:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   24   47:invokespecial   #164 <Method void IllegalStateException(String)>
		//   25   50:athrow          
			} else
			{
				return mServiceComponent;
		//   26   51:aload_0         
		//   27   52:getfield        #100 <Field ComponentName mServiceComponent>
		//   28   55:areturn         
			}
		}

		public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
		{
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
		//*   2    4:ifne            51
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    3    7:new             #114 <Class StringBuilder>
		//    4   10:dup             
		//    5   11:invokespecial   #115 <Method void StringBuilder()>
		//    6   14:astore_1        
				stringbuilder.append("getSessionToken() called while not connected(state=");
		//    7   15:aload_1         
		//    8   16:ldc2            #274 <String "getSessionToken() called while not connected(state=">
		//    9   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   22:pop             
				stringbuilder.append(mState);
		//   11   23:aload_1         
		//   12   24:aload_0         
		//   13   25:getfield        #85  <Field int mState>
		//   14   28:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
		//   15   31:pop             
				stringbuilder.append(")");
		//   16   32:aload_1         
		//   17   33:ldc1            #161 <String ")">
		//   18   35:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   19   38:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   20   39:new             #163 <Class IllegalStateException>
		//   21   42:dup             
		//   22   43:aload_1         
		//   23   44:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   24   47:invokespecial   #164 <Method void IllegalStateException(String)>
		//   25   50:athrow          
			} else
			{
				return mMediaSessionToken;
		//   26   51:aload_0         
		//   27   52:getfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		//   28   55:areturn         
			}
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
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #114 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #115 <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("onConnectFailed for ");
		//    4    8:aload_2         
		//    5    9:ldc2            #277 <String "onConnectFailed for ">
		//    6   12:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//    7   15:pop             
			stringbuilder.append(((Object) (mServiceComponent)));
		//    8   16:aload_2         
		//    9   17:aload_0         
		//   10   18:getfield        #100 <Field ComponentName mServiceComponent>
		//   11   21:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
		//   12   24:pop             
			Log.e("MediaBrowserCompat", stringbuilder.toString());
		//   13   25:ldc1            #148 <String "MediaBrowserCompat">
		//   14   27:aload_2         
		//   15   28:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   16   31:invokestatic    #280 <Method int Log.e(String, String)>
		//   17   34:pop             
			if(!isCurrent(messenger, "onConnectFailed"))
		//*  18   35:aload_0         
		//*  19   36:aload_1         
		//*  20   37:ldc2            #282 <String "onConnectFailed">
		//*  21   40:invokespecial   #284 <Method boolean isCurrent(Messenger, String)>
		//*  22   43:ifne            47
				return;
		//   23   46:return          
			if(mState != 2)
		//*  24   47:aload_0         
		//*  25   48:getfield        #85  <Field int mState>
		//*  26   51:iconst_2        
		//*  27   52:icmpeq          102
			{
				messenger = ((Messenger) (new StringBuilder()));
		//   28   55:new             #114 <Class StringBuilder>
		//   29   58:dup             
		//   30   59:invokespecial   #115 <Method void StringBuilder()>
		//   31   62:astore_1        
				((StringBuilder) (messenger)).append("onConnect from service while mState=");
		//   32   63:aload_1         
		//   33   64:ldc2            #286 <String "onConnect from service while mState=">
		//   34   67:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   35   70:pop             
				((StringBuilder) (messenger)).append(getStateLabel(mState));
		//   36   71:aload_1         
		//   37   72:aload_0         
		//   38   73:getfield        #85  <Field int mState>
		//   39   76:invokestatic    #159 <Method String getStateLabel(int)>
		//   40   79:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   41   82:pop             
				((StringBuilder) (messenger)).append("... ignoring");
		//   42   83:aload_1         
		//   43   84:ldc2            #288 <String "... ignoring">
		//   44   87:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   45   90:pop             
				Log.w("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
		//   46   91:ldc1            #148 <String "MediaBrowserCompat">
		//   47   93:aload_1         
		//   48   94:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   49   97:invokestatic    #291 <Method int Log.w(String, String)>
		//   50  100:pop             
				return;
		//   51  101:return          
			} else
			{
				forceCloseConnection();
		//   52  102:aload_0         
		//   53  103:invokevirtual   #293 <Method void forceCloseConnection()>
				mCallback.onConnectionFailed();
		//   54  106:aload_0         
		//   55  107:getfield        #102 <Field MediaBrowserCompat$ConnectionCallback mCallback>
		//   56  110:invokevirtual   #297 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
				return;
		//   57  113:return          
			}
		}

		public void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle)
		{
			if(!isCurrent(messenger, "onLoadChildren"))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:ldc2            #300 <String "onLoadChildren">
		//*   3    5:invokespecial   #284 <Method boolean isCurrent(Messenger, String)>
		//*   4    8:ifne            12
				return;
		//    5   11:return          
			if(MediaBrowserCompat.DEBUG)
		//*   6   12:getstatic       #304 <Field boolean MediaBrowserCompat.DEBUG>
		//*   7   15:ifeq            67
			{
				messenger = ((Messenger) (new StringBuilder()));
		//    8   18:new             #114 <Class StringBuilder>
		//    9   21:dup             
		//   10   22:invokespecial   #115 <Method void StringBuilder()>
		//   11   25:astore_1        
				((StringBuilder) (messenger)).append("onLoadChildren for ");
		//   12   26:aload_1         
		//   13   27:ldc2            #306 <String "onLoadChildren for ">
		//   14   30:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   15   33:pop             
				((StringBuilder) (messenger)).append(((Object) (mServiceComponent)));
		//   16   34:aload_1         
		//   17   35:aload_0         
		//   18   36:getfield        #100 <Field ComponentName mServiceComponent>
		//   19   39:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
		//   20   42:pop             
				((StringBuilder) (messenger)).append(" id=");
		//   21   43:aload_1         
		//   22   44:ldc2            #308 <String " id=">
		//   23   47:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   24   50:pop             
				((StringBuilder) (messenger)).append(s);
		//   25   51:aload_1         
		//   26   52:aload_2         
		//   27   53:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   28   56:pop             
				Log.d("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
		//   29   57:ldc1            #148 <String "MediaBrowserCompat">
		//   30   59:aload_1         
		//   31   60:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   32   63:invokestatic    #179 <Method int Log.d(String, String)>
		//   33   66:pop             
			}
			messenger = ((Messenger) ((Subscription)mSubscriptions.get(((Object) (s)))));
		//   34   67:aload_0         
		//   35   68:getfield        #83  <Field ArrayMap mSubscriptions>
		//   36   71:aload_2         
		//   37   72:invokevirtual   #312 <Method Object ArrayMap.get(Object)>
		//   38   75:checkcast       #314 <Class MediaBrowserCompat$Subscription>
		//   39   78:astore_1        
			if(messenger == null)
		//*  40   79:aload_1         
		//*  41   80:ifnonnull       122
			{
				if(MediaBrowserCompat.DEBUG)
		//*  42   83:getstatic       #304 <Field boolean MediaBrowserCompat.DEBUG>
		//*  43   86:ifeq            121
				{
					messenger = ((Messenger) (new StringBuilder()));
		//   44   89:new             #114 <Class StringBuilder>
		//   45   92:dup             
		//   46   93:invokespecial   #115 <Method void StringBuilder()>
		//   47   96:astore_1        
					((StringBuilder) (messenger)).append("onLoadChildren for id that isn't subscribed id=");
		//   48   97:aload_1         
		//   49   98:ldc2            #316 <String "onLoadChildren for id that isn't subscribed id=">
		//   50  101:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   51  104:pop             
					((StringBuilder) (messenger)).append(s);
		//   52  105:aload_1         
		//   53  106:aload_2         
		//   54  107:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   55  110:pop             
					Log.d("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
		//   56  111:ldc1            #148 <String "MediaBrowserCompat">
		//   57  113:aload_1         
		//   58  114:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   59  117:invokestatic    #179 <Method int Log.d(String, String)>
		//   60  120:pop             
				}
				return;
		//   61  121:return          
			}
			messenger = ((Messenger) (((Subscription) (messenger)).getCallback(mContext, bundle)));
		//   62  122:aload_1         
		//   63  123:aload_0         
		//   64  124:getfield        #98  <Field Context mContext>
		//   65  127:aload           4
		//   66  129:invokevirtual   #320 <Method MediaBrowserCompat$SubscriptionCallback MediaBrowserCompat$Subscription.getCallback(Context, Bundle)>
		//   67  132:astore_1        
			if(messenger != null)
		//*  68  133:aload_1         
		//*  69  134:ifnull          179
			{
				if(bundle == null)
		//*  70  137:aload           4
		//*  71  139:ifnonnull       159
					if(list == null)
		//*  72  142:aload_3         
		//*  73  143:ifnonnull       152
					{
						((SubscriptionCallback) (messenger)).onError(s);
		//   74  146:aload_1         
		//   75  147:aload_2         
		//   76  148:invokevirtual   #325 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
						return;
		//   77  151:return          
					} else
					{
						((SubscriptionCallback) (messenger)).onChildrenLoaded(s, list);
		//   78  152:aload_1         
		//   79  153:aload_2         
		//   80  154:aload_3         
		//   81  155:invokevirtual   #329 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
						return;
		//   82  158:return          
					}
				if(list == null)
		//*  83  159:aload_3         
		//*  84  160:ifnonnull       171
				{
					((SubscriptionCallback) (messenger)).onError(s, bundle);
		//   85  163:aload_1         
		//   86  164:aload_2         
		//   87  165:aload           4
		//   88  167:invokevirtual   #332 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
					return;
		//   89  170:return          
				}
				((SubscriptionCallback) (messenger)).onChildrenLoaded(s, list, bundle);
		//   90  171:aload_1         
		//   91  172:aload_2         
		//   92  173:aload_3         
		//   93  174:aload           4
		//   94  176:invokevirtual   #335 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
			}
		//   95  179:return          
		}

		public void onServiceConnected(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
		{
			if(!isCurrent(messenger, "onConnect"))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:ldc2            #339 <String "onConnect">
		//*   3    5:invokespecial   #284 <Method boolean isCurrent(Messenger, String)>
		//*   4    8:ifne            12
				return;
		//    5   11:return          
			if(mState != 2)
		//*   6   12:aload_0         
		//*   7   13:getfield        #85  <Field int mState>
		//*   8   16:iconst_2        
		//*   9   17:icmpeq          67
			{
				messenger = ((Messenger) (new StringBuilder()));
		//   10   20:new             #114 <Class StringBuilder>
		//   11   23:dup             
		//   12   24:invokespecial   #115 <Method void StringBuilder()>
		//   13   27:astore_1        
				((StringBuilder) (messenger)).append("onConnect from service while mState=");
		//   14   28:aload_1         
		//   15   29:ldc2            #286 <String "onConnect from service while mState=">
		//   16   32:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   17   35:pop             
				((StringBuilder) (messenger)).append(getStateLabel(mState));
		//   18   36:aload_1         
		//   19   37:aload_0         
		//   20   38:getfield        #85  <Field int mState>
		//   21   41:invokestatic    #159 <Method String getStateLabel(int)>
		//   22   44:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   23   47:pop             
				((StringBuilder) (messenger)).append("... ignoring");
		//   24   48:aload_1         
		//   25   49:ldc2            #288 <String "... ignoring">
		//   26   52:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   27   55:pop             
				Log.w("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
		//   28   56:ldc1            #148 <String "MediaBrowserCompat">
		//   29   58:aload_1         
		//   30   59:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   31   62:invokestatic    #291 <Method int Log.w(String, String)>
		//   32   65:pop             
				return;
		//   33   66:return          
			}
			mRootId = s;
		//   34   67:aload_0         
		//   35   68:aload_2         
		//   36   69:putfield        #201 <Field String mRootId>
			mMediaSessionToken = token;
		//   37   72:aload_0         
		//   38   73:aload_3         
		//   39   74:putfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
			mExtras = bundle;
		//   40   77:aload_0         
		//   41   78:aload           4
		//   42   80:putfield        #227 <Field Bundle mExtras>
			mState = 3;
		//   43   83:aload_0         
		//   44   84:iconst_3        
		//   45   85:putfield        #85  <Field int mState>
			if(MediaBrowserCompat.DEBUG)
		//*  46   88:getstatic       #304 <Field boolean MediaBrowserCompat.DEBUG>
		//*  47   91:ifeq            107
			{
				Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
		//   48   94:ldc1            #148 <String "MediaBrowserCompat">
		//   49   96:ldc2            #341 <String "ServiceCallbacks.onConnect...">
		//   50   99:invokestatic    #179 <Method int Log.d(String, String)>
		//   51  102:pop             
				dump();
		//   52  103:aload_0         
		//   53  104:invokevirtual   #343 <Method void dump()>
			}
			mCallback.onConnected();
		//   54  107:aload_0         
		//   55  108:getfield        #102 <Field MediaBrowserCompat$ConnectionCallback mCallback>
		//   56  111:invokevirtual   #346 <Method void MediaBrowserCompat$ConnectionCallback.onConnected()>
			messenger = ((Messenger) (mSubscriptions.entrySet().iterator()));
		//   57  114:aload_0         
		//   58  115:getfield        #83  <Field ArrayMap mSubscriptions>
		//   59  118:invokevirtual   #350 <Method Set ArrayMap.entrySet()>
		//   60  121:invokeinterface #356 <Method Iterator Set.iterator()>
		//   61  126:astore_1        
_L4:
			if(!((Iterator) (messenger)).hasNext())
				break; /* Loop/switch isn't completed */
		//   62  127:aload_1         
		//   63  128:invokeinterface #361 <Method boolean Iterator.hasNext()>
		//   64  133:ifeq            250
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) ((java.util.Map.Entry)((Iterator) (messenger)).next()));
		//   65  136:aload_1         
		//   66  137:invokeinterface #365 <Method Object Iterator.next()>
		//   67  142:checkcast       #367 <Class java.util.Map$Entry>
		//   68  145:astore_3        
			s = (String)((java.util.Map.Entry) (token)).getKey();
		//   69  146:aload_3         
		//   70  147:invokeinterface #370 <Method Object java.util.Map$Entry.getKey()>
		//   71  152:checkcast       #372 <Class String>
		//   72  155:astore_2        
			bundle = ((Bundle) ((Subscription)((java.util.Map.Entry) (token)).getValue()));
		//   73  156:aload_3         
		//   74  157:invokeinterface #375 <Method Object java.util.Map$Entry.getValue()>
		//   75  162:checkcast       #314 <Class MediaBrowserCompat$Subscription>
		//   76  165:astore          4
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) (((Subscription) (bundle)).getCallbacks()));
		//   77  167:aload           4
		//   78  169:invokevirtual   #379 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
		//   79  172:astore_3        
			bundle = ((Bundle) (((Subscription) (bundle)).getOptionsList()));
		//   80  173:aload           4
		//   81  175:invokevirtual   #382 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
		//   82  178:astore          4
			int i = 0;
		//   83  180:iconst_0        
		//   84  181:istore          5
_L2:
			if(i >= ((List) (token)).size())
				break; /* Loop/switch isn't completed */
		//   85  183:iload           5
		//   86  185:aload_3         
		//   87  186:invokeinterface #388 <Method int List.size()>
		//   88  191:icmpge          127
			mServiceBinderWrapper.addSubscription(s, ((SubscriptionCallback)((List) (token)).get(i)).mToken, (Bundle)((List) (bundle)).get(i), mCallbacksMessenger);
		//   89  194:aload_0         
		//   90  195:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   91  198:aload_2         
		//   92  199:aload_3         
		//   93  200:iload           5
		//   94  202:invokeinterface #391 <Method Object List.get(int)>
		//   95  207:checkcast       #322 <Class MediaBrowserCompat$SubscriptionCallback>
		//   96  210:invokestatic    #395 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
		//   97  213:aload           4
		//   98  215:iload           5
		//   99  217:invokeinterface #391 <Method Object List.get(int)>
		//  100  222:checkcast       #104 <Class Bundle>
		//  101  225:aload_0         
		//  102  226:getfield        #137 <Field Messenger mCallbacksMessenger>
		//  103  229:invokevirtual   #399 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
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
		//  109  241:ldc1            #148 <String "MediaBrowserCompat">
		//  110  243:ldc2            #401 <String "addSubscription failed with RemoteException.">
		//  111  246:invokestatic    #179 <Method int Log.d(String, String)>
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
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
		//*   2    4:ifne            54
			{
				query = ((String) (new StringBuilder()));
		//    3    7:new             #114 <Class StringBuilder>
		//    4   10:dup             
		//    5   11:invokespecial   #115 <Method void StringBuilder()>
		//    6   14:astore_1        
				((StringBuilder) (query)).append("search() called while not connected (state=");
		//    7   15:aload_1         
		//    8   16:ldc2            #405 <String "search() called while not connected (state=">
		//    9   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   22:pop             
				((StringBuilder) (query)).append(getStateLabel(mState));
		//   11   23:aload_1         
		//   12   24:aload_0         
		//   13   25:getfield        #85  <Field int mState>
		//   14   28:invokestatic    #159 <Method String getStateLabel(int)>
		//   15   31:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   16   34:pop             
				((StringBuilder) (query)).append(")");
		//   17   35:aload_1         
		//   18   36:ldc1            #161 <String ")">
		//   19   38:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   20   41:pop             
				throw new IllegalStateException(((StringBuilder) (query)).toString());
		//   21   42:new             #163 <Class IllegalStateException>
		//   22   45:dup             
		//   23   46:aload_1         
		//   24   47:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   25   50:invokespecial   #164 <Method void IllegalStateException(String)>
		//   26   53:athrow          
			}
			SearchResultReceiver searchresultreceiver = new SearchResultReceiver(query, bundle, callback, ((Handler) (mHandler)));
		//   27   54:new             #407 <Class MediaBrowserCompat$SearchResultReceiver>
		//   28   57:dup             
		//   29   58:aload_1         
		//   30   59:aload_2         
		//   31   60:aload_3         
		//   32   61:aload_0         
		//   33   62:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   34   65:invokespecial   #410 <Method void MediaBrowserCompat$SearchResultReceiver(String, Bundle, MediaBrowserCompat$SearchCallback, Handler)>
		//   35   68:astore          4
			try
			{
				mServiceBinderWrapper.search(query, bundle, ((ResultReceiver) (searchresultreceiver)), mCallbacksMessenger);
		//   36   70:aload_0         
		//   37   71:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   38   74:aload_1         
		//   39   75:aload_2         
		//   40   76:aload           4
		//   41   78:aload_0         
		//   42   79:getfield        #137 <Field Messenger mCallbacksMessenger>
		//   43   82:invokevirtual   #413 <Method void MediaBrowserCompat$ServiceBinderWrapper.search(String, Bundle, ResultReceiver, Messenger)>
				return;
		//   44   85:return          
			}
			catch(RemoteException remoteexception)
		//*  45   86:astore          4
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   46   88:new             #114 <Class StringBuilder>
		//   47   91:dup             
		//   48   92:invokespecial   #115 <Method void StringBuilder()>
		//   49   95:astore          5
				stringbuilder.append("Remote error searching items with query: ");
		//   50   97:aload           5
		//   51   99:ldc2            #415 <String "Remote error searching items with query: ">
		//   52  102:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   53  105:pop             
				stringbuilder.append(query);
		//   54  106:aload           5
		//   55  108:aload_1         
		//   56  109:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   57  112:pop             
				Log.i("MediaBrowserCompat", stringbuilder.toString(), ((Throwable) (remoteexception)));
		//   58  113:ldc1            #148 <String "MediaBrowserCompat">
		//   59  115:aload           5
		//   60  117:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   61  120:aload           4
		//   62  122:invokestatic    #418 <Method int Log.i(String, String, Throwable)>
		//   63  125:pop             
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
		//   64  126:aload_0         
		//   65  127:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   66  130:new             #21  <Class MediaBrowserCompat$MediaBrowserImplBase$5>
		//   67  133:dup             
		//   68  134:aload_0         
		//   69  135:aload_3         
		//   70  136:aload_1         
		//   71  137:aload_2         
		//   72  138:invokespecial   #421 <Method void MediaBrowserCompat$MediaBrowserImplBase$5(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$SearchCallback, String, Bundle)>
		//   73  141:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   74  144:pop             
				return;
		//   75  145:return          
			}
		}

		public void sendCustomAction(final String action, Bundle bundle, final CustomActionCallback callback)
		{
			if(!isConnected())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
		//*   2    4:ifne            79
			{
				callback = ((CustomActionCallback) (new StringBuilder()));
		//    3    7:new             #114 <Class StringBuilder>
		//    4   10:dup             
		//    5   11:invokespecial   #115 <Method void StringBuilder()>
		//    6   14:astore_3        
				((StringBuilder) (callback)).append("Cannot send a custom action (");
		//    7   15:aload_3         
		//    8   16:ldc2            #425 <String "Cannot send a custom action (">
		//    9   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   22:pop             
				((StringBuilder) (callback)).append(action);
		//   11   23:aload_3         
		//   12   24:aload_1         
		//   13   25:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   14   28:pop             
				((StringBuilder) (callback)).append(") with ");
		//   15   29:aload_3         
		//   16   30:ldc2            #427 <String ") with ">
		//   17   33:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   18   36:pop             
				((StringBuilder) (callback)).append("extras ");
		//   19   37:aload_3         
		//   20   38:ldc2            #429 <String "extras ">
		//   21   41:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   22   44:pop             
				((StringBuilder) (callback)).append(((Object) (bundle)));
		//   23   45:aload_3         
		//   24   46:aload_2         
		//   25   47:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
		//   26   50:pop             
				((StringBuilder) (callback)).append(" because the browser is not connected to the ");
		//   27   51:aload_3         
		//   28   52:ldc2            #431 <String " because the browser is not connected to the ">
		//   29   55:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   30   58:pop             
				((StringBuilder) (callback)).append("service.");
		//   31   59:aload_3         
		//   32   60:ldc2            #433 <String "service.">
		//   33   63:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   34   66:pop             
				throw new IllegalStateException(((StringBuilder) (callback)).toString());
		//   35   67:new             #163 <Class IllegalStateException>
		//   36   70:dup             
		//   37   71:aload_3         
		//   38   72:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   39   75:invokespecial   #164 <Method void IllegalStateException(String)>
		//   40   78:athrow          
			}
			CustomActionResultReceiver customactionresultreceiver = new CustomActionResultReceiver(action, bundle, callback, ((Handler) (mHandler)));
		//   41   79:new             #435 <Class MediaBrowserCompat$CustomActionResultReceiver>
		//   42   82:dup             
		//   43   83:aload_1         
		//   44   84:aload_2         
		//   45   85:aload_3         
		//   46   86:aload_0         
		//   47   87:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   48   90:invokespecial   #438 <Method void MediaBrowserCompat$CustomActionResultReceiver(String, Bundle, MediaBrowserCompat$CustomActionCallback, Handler)>
		//   49   93:astore          4
			try
			{
				mServiceBinderWrapper.sendCustomAction(action, bundle, ((ResultReceiver) (customactionresultreceiver)), mCallbacksMessenger);
		//   50   95:aload_0         
		//   51   96:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   52   99:aload_1         
		//   53  100:aload_2         
		//   54  101:aload           4
		//   55  103:aload_0         
		//   56  104:getfield        #137 <Field Messenger mCallbacksMessenger>
		//   57  107:invokevirtual   #440 <Method void MediaBrowserCompat$ServiceBinderWrapper.sendCustomAction(String, Bundle, ResultReceiver, Messenger)>
				return;
		//   58  110:return          
			}
			catch(RemoteException remoteexception)
		//*  59  111:astore          4
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   60  113:new             #114 <Class StringBuilder>
		//   61  116:dup             
		//   62  117:invokespecial   #115 <Method void StringBuilder()>
		//   63  120:astore          5
				stringbuilder.append("Remote error sending a custom action: action=");
		//   64  122:aload           5
		//   65  124:ldc2            #442 <String "Remote error sending a custom action: action=">
		//   66  127:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   67  130:pop             
				stringbuilder.append(action);
		//   68  131:aload           5
		//   69  133:aload_1         
		//   70  134:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   71  137:pop             
				stringbuilder.append(", extras=");
		//   72  138:aload           5
		//   73  140:ldc2            #444 <String ", extras=">
		//   74  143:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   75  146:pop             
				stringbuilder.append(((Object) (bundle)));
		//   76  147:aload           5
		//   77  149:aload_2         
		//   78  150:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
		//   79  153:pop             
				Log.i("MediaBrowserCompat", stringbuilder.toString(), ((Throwable) (remoteexception)));
		//   80  154:ldc1            #148 <String "MediaBrowserCompat">
		//   81  156:aload           5
		//   82  158:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   83  161:aload           4
		//   84  163:invokestatic    #418 <Method int Log.i(String, String, Throwable)>
		//   85  166:pop             
			}
			if(callback != null)
		//*  86  167:aload_3         
		//*  87  168:ifnull          190
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
		//   88  171:aload_0         
		//   89  172:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
		//   90  175:new             #23  <Class MediaBrowserCompat$MediaBrowserImplBase$6>
		//   91  178:dup             
		//   92  179:aload_0         
		//   93  180:aload_3         
		//   94  181:aload_1         
		//   95  182:aload_2         
		//   96  183:invokespecial   #447 <Method void MediaBrowserCompat$MediaBrowserImplBase$6(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$CustomActionCallback, String, Bundle)>
		//   97  186:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
		//   98  189:pop             
		//   99  190:return          
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
		//*  21   43:ifnonnull       51
				bundle = null;
		//   22   46:aconst_null     
		//   23   47:astore_2        
			else
		//*  24   48:goto            60
				bundle = new Bundle(bundle);
		//   25   51:new             #104 <Class Bundle>
		//   26   54:dup             
		//   27   55:aload_2         
		//   28   56:invokespecial   #107 <Method void Bundle(Bundle)>
		//   29   59:astore_2        
			subscription.putCallback(mContext, bundle, subscriptioncallback);
		//   30   60:aload           4
		//   31   62:aload_0         
		//   32   63:getfield        #98  <Field Context mContext>
		//   33   66:aload_2         
		//   34   67:aload_3         
		//   35   68:invokevirtual   #458 <Method void MediaBrowserCompat$Subscription.putCallback(Context, Bundle, MediaBrowserCompat$SubscriptionCallback)>
			if(isConnected())
		//*  36   71:aload_0         
		//*  37   72:invokevirtual   #223 <Method boolean isConnected()>
		//*  38   75:ifeq            128
			{
				try
				{
					mServiceBinderWrapper.addSubscription(s, subscriptioncallback.mToken, bundle, mCallbacksMessenger);
		//   39   78:aload_0         
		//   40   79:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   41   82:aload_1         
		//   42   83:aload_3         
		//   43   84:invokestatic    #395 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
		//   44   87:aload_2         
		//   45   88:aload_0         
		//   46   89:getfield        #137 <Field Messenger mCallbacksMessenger>
		//   47   92:invokevirtual   #399 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
					return;
		//   48   95:return          
				}
		//*  49   96:new             #114 <Class StringBuilder>
		//*  50   99:dup             
		//*  51  100:invokespecial   #115 <Method void StringBuilder()>
		//*  52  103:astore_2        
		//*  53  104:aload_2         
		//*  54  105:ldc2            #460 <String "addSubscription failed with RemoteException parentId=">
		//*  55  108:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//*  56  111:pop             
		//*  57  112:aload_2         
		//*  58  113:aload_1         
		//*  59  114:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//*  60  117:pop             
		//*  61  118:ldc1            #148 <String "MediaBrowserCompat">
		//*  62  120:aload_2         
		//*  63  121:invokevirtual   #128 <Method String StringBuilder.toString()>
		//*  64  124:invokestatic    #179 <Method int Log.d(String, String)>
		//*  65  127:pop             
		//*  66  128:return          
				// Misplaced declaration of an exception variable
				catch(Bundle bundle)
				{
					bundle = ((Bundle) (new StringBuilder()));
				}
				((StringBuilder) (bundle)).append("addSubscription failed with RemoteException parentId=");
				((StringBuilder) (bundle)).append(s);
				Log.d("MediaBrowserCompat", ((StringBuilder) (bundle)).toString());
			}
		//*  67  129:astore_2        
		//*  68  130:goto            96
		}

		public void unsubscribe(String s, SubscriptionCallback subscriptioncallback)
		{
			Subscription subscription;
			subscription = (Subscription)mSubscriptions.get(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #83  <Field ArrayMap mSubscriptions>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #312 <Method Object ArrayMap.get(Object)>
		//    4    8:checkcast       #314 <Class MediaBrowserCompat$Subscription>
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
		//*  12   24:invokevirtual   #223 <Method boolean isConnected()>
		//*  13   27:ifeq            170
					mServiceBinderWrapper.removeSubscription(s, ((IBinder) (null)), mCallbacksMessenger);
		//   14   30:aload_0         
		//   15   31:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//   16   34:aload_1         
		//   17   35:aconst_null     
		//   18   36:aload_0         
		//   19   37:getfield        #137 <Field Messenger mCallbacksMessenger>
		//   20   40:invokevirtual   #466 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
			}
		//*  21   43:goto            170
		//*  22   46:aload           4
		//*  23   48:invokevirtual   #379 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
		//*  24   51:astore          5
		//*  25   53:aload           4
		//*  26   55:invokevirtual   #382 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
		//*  27   58:astore          6
		//*  28   60:aload           5
		//*  29   62:invokeinterface #388 <Method int List.size()>
		//*  30   67:iconst_1        
		//*  31   68:isub            
		//*  32   69:istore_3        
		//*  33   70:iload_3         
		//*  34   71:iflt            170
		//*  35   74:aload           5
		//*  36   76:iload_3         
		//*  37   77:invokeinterface #391 <Method Object List.get(int)>
		//*  38   82:aload_2         
		//*  39   83:if_acmpne       127
		//*  40   86:aload_0         
		//*  41   87:invokevirtual   #223 <Method boolean isConnected()>
		//*  42   90:ifeq            109
		//*  43   93:aload_0         
		//*  44   94:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		//*  45   97:aload_1         
		//*  46   98:aload_2         
		//*  47   99:invokestatic    #395 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
		//*  48  102:aload_0         
		//*  49  103:getfield        #137 <Field Messenger mCallbacksMessenger>
		//*  50  106:invokevirtual   #466 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
		//*  51  109:aload           5
		//*  52  111:iload_3         
		//*  53  112:invokeinterface #469 <Method Object List.remove(int)>
		//*  54  117:pop             
		//*  55  118:aload           6
		//*  56  120:iload_3         
		//*  57  121:invokeinterface #469 <Method Object List.remove(int)>
		//*  58  126:pop             
		//*  59  127:iload_3         
		//*  60  128:iconst_1        
		//*  61  129:isub            
		//*  62  130:istore_3        
		//*  63  131:goto            70
		//*  64  134:new             #114 <Class StringBuilder>
		//*  65  137:dup             
		//*  66  138:invokespecial   #115 <Method void StringBuilder()>
		//*  67  141:astore          5
		//*  68  143:aload           5
		//*  69  145:ldc2            #471 <String "removeSubscription failed with RemoteException parentId=">
		//*  70  148:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//*  71  151:pop             
		//*  72  152:aload           5
		//*  73  154:aload_1         
		//*  74  155:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//*  75  158:pop             
		//*  76  159:ldc1            #148 <String "MediaBrowserCompat">
		//*  77  161:aload           5
		//*  78  163:invokevirtual   #128 <Method String StringBuilder.toString()>
		//*  79  166:invokestatic    #179 <Method int Log.d(String, String)>
		//*  80  169:pop             
		//*  81  170:aload           4
		//*  82  172:invokevirtual   #473 <Method boolean MediaBrowserCompat$Subscription.isEmpty()>
		//*  83  175:ifne            182
		//*  84  178:aload_2         
		//*  85  179:ifnonnull       191
		//*  86  182:aload_0         
		//*  87  183:getfield        #83  <Field ArrayMap mSubscriptions>
		//*  88  186:aload_1         
		//*  89  187:invokevirtual   #475 <Method Object ArrayMap.remove(Object)>
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
		//*  47   91:ifnonnull       99
				context = null;
		//   48   94:aconst_null     
		//   49   95:astore_1        
			else
		//*  50   96:goto            109
				context = ((Context) (new Bundle(bundle)));
		//   51   99:new             #104 <Class Bundle>
		//   52  102:dup             
		//   53  103:aload           4
		//   54  105:invokespecial   #107 <Method void Bundle(Bundle)>
		//   55  108:astore_1        
			mRootHints = ((Bundle) (context));
		//   56  109:aload_0         
		//   57  110:aload_1         
		//   58  111:putfield        #109 <Field Bundle mRootHints>
		//   59  114:return          
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

		public abstract void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle);

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
			if(i == 0 && bundle != null && bundle.containsKey("search_results"))
		//*   6   13:iload_1         
		//*   7   14:ifne            110
		//*   8   17:aload_2         
		//*   9   18:ifnull          110
		//*  10   21:aload_2         
		//*  11   22:ldc1            #41  <String "search_results">
		//*  12   24:invokevirtual   #45  <Method boolean Bundle.containsKey(String)>
		//*  13   27:ifne            33
		//*  14   30:goto            110
			{
				Parcelable aparcelable[] = bundle.getParcelableArray("search_results");
		//   15   33:aload_2         
		//   16   34:ldc1            #41  <String "search_results">
		//   17   36:invokevirtual   #49  <Method Parcelable[] Bundle.getParcelableArray(String)>
		//   18   39:astore          5
				bundle = null;
		//   19   41:aconst_null     
		//   20   42:astore_2        
				if(aparcelable != null)
		//*  21   43:aload           5
		//*  22   45:ifnull          93
				{
					ArrayList arraylist = new ArrayList();
		//   23   48:new             #51  <Class ArrayList>
		//   24   51:dup             
		//   25   52:invokespecial   #54  <Method void ArrayList()>
		//   26   55:astore          4
					int j = aparcelable.length;
		//   27   57:aload           5
		//   28   59:arraylength     
		//   29   60:istore_3        
					i = 0;
		//   30   61:iconst_0        
		//   31   62:istore_1        
					do
					{
						bundle = ((Bundle) (arraylist));
		//   32   63:aload           4
		//   33   65:astore_2        
						if(i >= j)
							break;
		//   34   66:iload_1         
		//   35   67:iload_3         
		//   36   68:icmpge          93
						((List) (arraylist)).add(((Object) ((MediaItem)aparcelable[i])));
		//   37   71:aload           4
		//   38   73:aload           5
		//   39   75:iload_1         
		//   40   76:aaload          
		//   41   77:checkcast       #56  <Class MediaBrowserCompat$MediaItem>
		//   42   80:invokeinterface #62  <Method boolean List.add(Object)>
		//   43   85:pop             
						i++;
		//   44   86:iload_1         
		//   45   87:iconst_1        
		//   46   88:iadd            
		//   47   89:istore_1        
					} while(true);
		//   48   90:goto            63
				}
				mCallback.onSearchResult(mQuery, mExtras, ((List) (bundle)));
		//   49   93:aload_0         
		//   50   94:getfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
		//   51   97:aload_0         
		//   52   98:getfield        #20  <Field String mQuery>
		//   53  101:aload_0         
		//   54  102:getfield        #22  <Field Bundle mExtras>
		//   55  105:aload_2         
		//   56  106:invokevirtual   #68  <Method void MediaBrowserCompat$SearchCallback.onSearchResult(String, Bundle, List)>
				return;
		//   57  109:return          
			} else
			{
				mCallback.onError(mQuery, mExtras);
		//   58  110:aload_0         
		//   59  111:getfield        #24  <Field MediaBrowserCompat$SearchCallback mCallback>
		//   60  114:aload_0         
		//   61  115:getfield        #20  <Field String mQuery>
		//   62  118:aload_0         
		//   63  119:getfield        #22  <Field Bundle mExtras>
		//   64  122:invokevirtual   #72  <Method void MediaBrowserCompat$SearchCallback.onError(String, Bundle)>
				return;
		//   65  125:return          
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
		private final IBinder mToken = new Binder();


/*
		static IBinder access$000(SubscriptionCallback subscriptioncallback)
		{
			return subscriptioncallback.mToken;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field IBinder mToken>
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
		//    1    1:getfield        #46  <Field Object mSubscriptionCallbackObj>
		//    2    4:areturn         
		}

*/

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
				return Collections.EMPTY_LIST;
		//   54  104:getstatic       #50  <Field List Collections.EMPTY_LIST>
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
