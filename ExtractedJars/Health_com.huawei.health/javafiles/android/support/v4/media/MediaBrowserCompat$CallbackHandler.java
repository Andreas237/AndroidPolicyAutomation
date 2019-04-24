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

static class MediaBrowserCompat$CallbackHandler extends Handler
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
	//	               1 75
	//	               2 122
	//	               3 148
	//*  22   72:goto            192
		case 1: // '\001'
			((iceCallbackImpl)mCallbackImplRef.get()).onServiceConnected((Messenger)mCallbacksMessengerRef.get(), bundle.getString("data_media_item_id"), (android.support.v4.media.session.MediaSessionCompat.Token)bundle.getParcelable("data_media_session_token"), bundle.getBundle("data_root_hints"));
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
	//   36  104:invokevirtual   #73  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   37  107:checkcast       #75  <Class android.support.v4.media.session.MediaSessionCompat$Token>
	//   38  110:aload_2         
	//   39  111:ldc1            #77  <String "data_root_hints">
	//   40  113:invokevirtual   #81  <Method Bundle Bundle.getBundle(String)>
	//   41  116:invokeinterface #85  <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onServiceConnected(Messenger, String, android.support.v4.media.session.MediaSessionCompat$Token, Bundle)>
			return;
	//   42  121:return          

		case 2: // '\002'
			((iceCallbackImpl)mCallbackImplRef.get()).onConnectionFailed((Messenger)mCallbacksMessengerRef.get());
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
			((iceCallbackImpl)mCallbackImplRef.get()).onLoadChildren((Messenger)mCallbacksMessengerRef.get(), bundle.getString("data_media_item_id"), ((java.util.List) (bundle.getParcelableArrayList("data_media_item_list"))), bundle.getBundle("data_options"));
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
	//   66  177:invokevirtual   #95  <Method java.util.ArrayList Bundle.getParcelableArrayList(String)>
	//   67  180:aload_2         
	//   68  181:ldc1            #97  <String "data_options">
	//   69  183:invokevirtual   #81  <Method Bundle Bundle.getBundle(String)>
	//   70  186:invokeinterface #101 <Method void MediaBrowserCompat$MediaBrowserServiceCallbackImpl.onLoadChildren(Messenger, String, java.util.List, Bundle)>
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
