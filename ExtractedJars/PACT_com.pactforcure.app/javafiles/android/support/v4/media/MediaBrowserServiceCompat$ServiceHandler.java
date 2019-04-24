// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.*;
import android.support.v4.app.BundleCompat;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat, MediaBrowserCompat

private final class MediaBrowserServiceCompat$ServiceHandler extends Handler
{

	public void handleMessage(Message message)
	{
		Bundle bundle = message.getData();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method Bundle Message.getData()>
	//    2    4:astore_2        
		switch(message.what)
	//*   3    5:aload_1         
	//*   4    6:getfield        #37  <Field int Message.what>
		{
	//*   5    9:tableswitch     1 9: default 60
	//	               1 107
	//	               2 144
	//	               3 163
	//	               4 200
	//	               5 231
	//	               6 265
	//	               7 290
	//	               8 309
	//	               9 349
		default:
			Log.w("MBServiceCompat", (new StringBuilder()).append("Unhandled message: ").append(((Object) (message))).append("\n  Service version: ").append(1).append("\n  Client version: ").append(message.arg1).toString());
	//    6   60:ldc1            #39  <String "MBServiceCompat">
	//    7   62:new             #41  <Class StringBuilder>
	//    8   65:dup             
	//    9   66:invokespecial   #42  <Method void StringBuilder()>
	//   10   69:ldc1            #44  <String "Unhandled message: ">
	//   11   71:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   12   74:aload_1         
	//   13   75:invokevirtual   #51  <Method StringBuilder StringBuilder.append(Object)>
	//   14   78:ldc1            #53  <String "\n  Service version: ">
	//   15   80:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   16   83:iconst_1        
	//   17   84:invokevirtual   #56  <Method StringBuilder StringBuilder.append(int)>
	//   18   87:ldc1            #58  <String "\n  Client version: ">
	//   19   89:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   20   92:aload_1         
	//   21   93:getfield        #61  <Field int Message.arg1>
	//   22   96:invokevirtual   #56  <Method StringBuilder StringBuilder.append(int)>
	//   23   99:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   24  102:invokestatic    #71  <Method int Log.w(String, String)>
	//   25  105:pop             
			return;
	//   26  106:return          

		case 1: // '\001'
			mServiceBinderImpl.connect(bundle.getString("data_package_name"), bundle.getInt("data_calling_uid"), bundle.getBundle("data_root_hints"), ((s) (new sCompat(message.replyTo))));
	//   27  107:aload_0         
	//   28  108:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   29  111:aload_2         
	//   30  112:ldc1            #73  <String "data_package_name">
	//   31  114:invokevirtual   #79  <Method String Bundle.getString(String)>
	//   32  117:aload_2         
	//   33  118:ldc1            #81  <String "data_calling_uid">
	//   34  120:invokevirtual   #85  <Method int Bundle.getInt(String)>
	//   35  123:aload_2         
	//   36  124:ldc1            #87  <String "data_root_hints">
	//   37  126:invokevirtual   #91  <Method Bundle Bundle.getBundle(String)>
	//   38  129:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   39  132:dup             
	//   40  133:aload_1         
	//   41  134:getfield        #97  <Field android.os.Messenger Message.replyTo>
	//   42  137:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//   43  140:invokevirtual   #104 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.connect(String, int, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//   44  143:return          

		case 2: // '\002'
			mServiceBinderImpl.disconnect(((s) (new sCompat(message.replyTo))));
	//   45  144:aload_0         
	//   46  145:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   47  148:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   48  151:dup             
	//   49  152:aload_1         
	//   50  153:getfield        #97  <Field android.os.Messenger Message.replyTo>
	//   51  156:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//   52  159:invokevirtual   #108 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.disconnect(MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//   53  162:return          

		case 3: // '\003'
			mServiceBinderImpl.addSubscription(bundle.getString("data_media_item_id"), BundleCompat.getBinder(bundle, "data_callback_token"), bundle.getBundle("data_options"), ((s) (new sCompat(message.replyTo))));
	//   54  163:aload_0         
	//   55  164:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   56  167:aload_2         
	//   57  168:ldc1            #110 <String "data_media_item_id">
	//   58  170:invokevirtual   #79  <Method String Bundle.getString(String)>
	//   59  173:aload_2         
	//   60  174:ldc1            #112 <String "data_callback_token">
	//   61  176:invokestatic    #118 <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//   62  179:aload_2         
	//   63  180:ldc1            #120 <String "data_options">
	//   64  182:invokevirtual   #91  <Method Bundle Bundle.getBundle(String)>
	//   65  185:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   66  188:dup             
	//   67  189:aload_1         
	//   68  190:getfield        #97  <Field android.os.Messenger Message.replyTo>
	//   69  193:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//   70  196:invokevirtual   #124 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.addSubscription(String, android.os.IBinder, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//   71  199:return          

		case 4: // '\004'
			mServiceBinderImpl.removeSubscription(bundle.getString("data_media_item_id"), BundleCompat.getBinder(bundle, "data_callback_token"), ((s) (new sCompat(message.replyTo))));
	//   72  200:aload_0         
	//   73  201:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   74  204:aload_2         
	//   75  205:ldc1            #110 <String "data_media_item_id">
	//   76  207:invokevirtual   #79  <Method String Bundle.getString(String)>
	//   77  210:aload_2         
	//   78  211:ldc1            #112 <String "data_callback_token">
	//   79  213:invokestatic    #118 <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//   80  216:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   81  219:dup             
	//   82  220:aload_1         
	//   83  221:getfield        #97  <Field android.os.Messenger Message.replyTo>
	//   84  224:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//   85  227:invokevirtual   #128 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.removeSubscription(String, android.os.IBinder, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//   86  230:return          

		case 5: // '\005'
			mServiceBinderImpl.getMediaItem(bundle.getString("data_media_item_id"), (ResultReceiver)bundle.getParcelable("data_result_receiver"), ((s) (new sCompat(message.replyTo))));
	//   87  231:aload_0         
	//   88  232:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   89  235:aload_2         
	//   90  236:ldc1            #110 <String "data_media_item_id">
	//   91  238:invokevirtual   #79  <Method String Bundle.getString(String)>
	//   92  241:aload_2         
	//   93  242:ldc1            #130 <String "data_result_receiver">
	//   94  244:invokevirtual   #134 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   95  247:checkcast       #136 <Class ResultReceiver>
	//   96  250:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   97  253:dup             
	//   98  254:aload_1         
	//   99  255:getfield        #97  <Field android.os.Messenger Message.replyTo>
	//  100  258:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//  101  261:invokevirtual   #140 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.getMediaItem(String, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//  102  264:return          

		case 6: // '\006'
			mServiceBinderImpl.registerCallbacks(((s) (new sCompat(message.replyTo))), bundle.getBundle("data_root_hints"));
	//  103  265:aload_0         
	//  104  266:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  105  269:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  106  272:dup             
	//  107  273:aload_1         
	//  108  274:getfield        #97  <Field android.os.Messenger Message.replyTo>
	//  109  277:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//  110  280:aload_2         
	//  111  281:ldc1            #87  <String "data_root_hints">
	//  112  283:invokevirtual   #91  <Method Bundle Bundle.getBundle(String)>
	//  113  286:invokevirtual   #144 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.registerCallbacks(MediaBrowserServiceCompat$ServiceCallbacks, Bundle)>
			return;
	//  114  289:return          

		case 7: // '\007'
			mServiceBinderImpl.unregisterCallbacks(((s) (new sCompat(message.replyTo))));
	//  115  290:aload_0         
	//  116  291:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  117  294:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  118  297:dup             
	//  119  298:aload_1         
	//  120  299:getfield        #97  <Field android.os.Messenger Message.replyTo>
	//  121  302:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//  122  305:invokevirtual   #147 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.unregisterCallbacks(MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//  123  308:return          

		case 8: // '\b'
			mServiceBinderImpl.search(bundle.getString("data_search_query"), bundle.getBundle("data_search_extras"), (ResultReceiver)bundle.getParcelable("data_result_receiver"), ((s) (new sCompat(message.replyTo))));
	//  124  309:aload_0         
	//  125  310:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  126  313:aload_2         
	//  127  314:ldc1            #149 <String "data_search_query">
	//  128  316:invokevirtual   #79  <Method String Bundle.getString(String)>
	//  129  319:aload_2         
	//  130  320:ldc1            #151 <String "data_search_extras">
	//  131  322:invokevirtual   #91  <Method Bundle Bundle.getBundle(String)>
	//  132  325:aload_2         
	//  133  326:ldc1            #130 <String "data_result_receiver">
	//  134  328:invokevirtual   #134 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//  135  331:checkcast       #136 <Class ResultReceiver>
	//  136  334:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  137  337:dup             
	//  138  338:aload_1         
	//  139  339:getfield        #97  <Field android.os.Messenger Message.replyTo>
	//  140  342:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//  141  345:invokevirtual   #155 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.search(String, Bundle, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//  142  348:return          

		case 9: // '\t'
			mServiceBinderImpl.sendCustomAction(bundle.getString("data_custom_action"), bundle.getBundle("data_custom_action_extras"), (ResultReceiver)bundle.getParcelable("data_result_receiver"), ((s) (new sCompat(message.replyTo))));
	//  143  349:aload_0         
	//  144  350:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  145  353:aload_2         
	//  146  354:ldc1            #157 <String "data_custom_action">
	//  147  356:invokevirtual   #79  <Method String Bundle.getString(String)>
	//  148  359:aload_2         
	//  149  360:ldc1            #159 <String "data_custom_action_extras">
	//  150  362:invokevirtual   #91  <Method Bundle Bundle.getBundle(String)>
	//  151  365:aload_2         
	//  152  366:ldc1            #130 <String "data_result_receiver">
	//  153  368:invokevirtual   #134 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//  154  371:checkcast       #136 <Class ResultReceiver>
	//  155  374:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  156  377:dup             
	//  157  378:aload_1         
	//  158  379:getfield        #97  <Field android.os.Messenger Message.replyTo>
	//  159  382:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//  160  385:invokevirtual   #162 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.sendCustomAction(String, Bundle, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
			break;
		}
	//  161  388:return          
	}

	public void postOrRun(Runnable runnable)
	{
		if(Thread.currentThread() == getLooper().getThread())
	//*   0    0:invokestatic    #170 <Method Thread Thread.currentThread()>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #174 <Method Looper getLooper()>
	//*   3    7:invokevirtual   #179 <Method Thread Looper.getThread()>
	//*   4   10:if_acmpne       20
		{
			runnable.run();
	//    5   13:aload_1         
	//    6   14:invokeinterface #184 <Method void Runnable.run()>
			return;
	//    7   19:return          
		} else
		{
			post(runnable);
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:invokevirtual   #188 <Method boolean post(Runnable)>
	//   11   25:pop             
			return;
	//   12   26:return          
		}
	}

	public boolean sendMessageAtTime(Message message, long l)
	{
		Bundle bundle = message.getData();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method Bundle Message.getData()>
	//    2    4:astore          4
		bundle.setClassLoader(((Class) (android/support/v4/media/MediaBrowserCompat)).getClassLoader());
	//    3    6:aload           4
	//    4    8:ldc1            #192 <Class MediaBrowserCompat>
	//    5   10:invokevirtual   #198 <Method ClassLoader Class.getClassLoader()>
	//    6   13:invokevirtual   #202 <Method void Bundle.setClassLoader(ClassLoader)>
		bundle.putInt("data_calling_uid", Binder.getCallingUid());
	//    7   16:aload           4
	//    8   18:ldc1            #81  <String "data_calling_uid">
	//    9   20:invokestatic    #208 <Method int Binder.getCallingUid()>
	//   10   23:invokevirtual   #212 <Method void Bundle.putInt(String, int)>
		return super.sendMessageAtTime(message, l);
	//   11   26:aload_0         
	//   12   27:aload_1         
	//   13   28:lload_2         
	//   14   29:invokespecial   #214 <Method boolean Handler.sendMessageAtTime(Message, long)>
	//   15   32:ireturn         
	}

	private final pl mServiceBinderImpl;
	final MediaBrowserServiceCompat this$0;

	MediaBrowserServiceCompat$ServiceHandler()
	{
		this$0 = MediaBrowserServiceCompat.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field MediaBrowserServiceCompat this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Handler()>
		mServiceBinderImpl = new pl(MediaBrowserServiceCompat.this);
	//    5    9:aload_0         
	//    6   10:new             #20  <Class MediaBrowserServiceCompat$ServiceBinderImpl>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #15  <Field MediaBrowserServiceCompat this$0>
	//   10   18:invokespecial   #22  <Method void MediaBrowserServiceCompat$ServiceBinderImpl(MediaBrowserServiceCompat)>
	//   11   21:putfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   12   24:return          
	}
}
