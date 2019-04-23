// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.*;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

private static class MediaBrowserCompat$CallbackHandler extends Handler
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
		obj = ((Object) ((iceCallbackImpl)mCallbackImplRef.get()));
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
	//	               1 154
	//	               2 146
	//	               3 92;
	//   30   64:tableswitch     1 3: default 294
	//	               1 154
	//	               2 146
	//	               3 92
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
		((iceCallbackImpl) (obj)).onLoadChildren(messenger, bundle.getString("data_media_item_id"), ((java.util.List) (bundle.getParcelableArrayList("data_media_item_list"))), bundle1, bundle3);
	//   43  120:aload_2         
	//   44  121:aload_3         
	//   45  122:aload           4
	//   46  124:ldc1            #67  <String "data_media_item_id">
	//   47  126:invokevirtual   #71  <Method String Bundle.getString(String)>
	//   48  129:aload           4
	//   49  131:ldc1            #73  <String "data_media_item_list">
	//   50  133:invokevirtual   #77  <Method java.util.ArrayList Bundle.getParcelableArrayList(String)>
	//   51  136:aload           5
	//   52  138:aload           6
	//   53  140:invokeinterface #81  <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onLoadChildren(Messenger, String, java.util.List, Bundle, Bundle)>
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
		((iceCallbackImpl) (obj)).onServiceConnected(messenger, bundle.getString("data_media_item_id"), (android.support.v4.media.session.MediaSessionCompat.Token)bundle.getParcelable("data_media_session_token"), bundle2);
	//   65  168:aload_2         
	//   66  169:aload_3         
	//   67  170:aload           4
	//   68  172:ldc1            #67  <String "data_media_item_id">
	//   69  174:invokevirtual   #71  <Method String Bundle.getString(String)>
	//   70  177:aload           4
	//   71  179:ldc1            #89  <String "data_media_session_token">
	//   72  181:invokevirtual   #93  <Method android.os.Parcelable Bundle.getParcelable(String)>
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
			((iceCallbackImpl) (obj)).onConnectionFailed(messenger);
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
			((iceCallbackImpl) (obj)).onConnectionFailed(messenger);
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

	MediaBrowserCompat$CallbackHandler(iceCallbackImpl icecallbackimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Handler()>
		mCallbackImplRef = new WeakReference(((Object) (icecallbackimpl)));
	//    2    4:aload_0         
	//    3    5:new             #19  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #22  <Method void WeakReference(Object)>
	//    7   13:putfield        #24  <Field WeakReference mCallbackImplRef>
	//    8   16:return          
	}
}
