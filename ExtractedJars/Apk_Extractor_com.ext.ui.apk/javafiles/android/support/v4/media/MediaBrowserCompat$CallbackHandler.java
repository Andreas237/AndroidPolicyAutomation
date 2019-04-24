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
		iceCallbackImpl icecallbackimpl;
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
		icecallbackimpl = (iceCallbackImpl)mCallbackImplRef.get();
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
	//	               1 169
	//	               2 201
	//	               3 209;
	//   31   70:tableswitch     1 3: default 238
	//	               1 169
	//	               2 201
	//	               3 209
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
			icecallbackimpl.onServiceConnected(messenger, ((Bundle) (obj)).getString("data_media_item_id"), (android.support.v4.media.session.MediaSessionCompat.Token)((Bundle) (obj)).getParcelable("data_media_session_token"), ((Bundle) (obj)).getBundle("data_root_hints"));
	//   66  169:aload_2         
	//   67  170:aload_3         
	//   68  171:aload           4
	//   69  173:ldc1            #108 <String "data_media_item_id">
	//   70  175:invokevirtual   #112 <Method String Bundle.getString(String)>
	//   71  178:aload           4
	//   72  180:ldc1            #114 <String "data_media_session_token">
	//   73  182:invokevirtual   #118 <Method android.os.Parcelable Bundle.getParcelable(String)>
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
			icecallbackimpl.onConnectionFailed(messenger);
			return;
		}
		  goto _L1
_L5:
		icecallbackimpl.onConnectionFailed(messenger);
	//   80  201:aload_2         
	//   81  202:aload_3         
	//   82  203:invokeinterface #106 <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onConnectionFailed(Messenger)>
		return;
	//   83  208:return          
_L6:
		icecallbackimpl.onLoadChildren(messenger, ((Bundle) (obj)).getString("data_media_item_id"), ((java.util.List) (((Bundle) (obj)).getParcelableArrayList("data_media_item_list"))), ((Bundle) (obj)).getBundle("data_options"));
	//   84  209:aload_2         
	//   85  210:aload_3         
	//   86  211:aload           4
	//   87  213:ldc1            #108 <String "data_media_item_id">
	//   88  215:invokevirtual   #112 <Method String Bundle.getString(String)>
	//   89  218:aload           4
	//   90  220:ldc1            #132 <String "data_media_item_list">
	//   91  222:invokevirtual   #136 <Method java.util.ArrayList Bundle.getParcelableArrayList(String)>
	//   92  225:aload           4
	//   93  227:ldc1            #138 <String "data_options">
	//   94  229:invokevirtual   #126 <Method Bundle Bundle.getBundle(String)>
	//   95  232:invokeinterface #142 <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onLoadChildren(Messenger, String, java.util.List, Bundle)>
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
