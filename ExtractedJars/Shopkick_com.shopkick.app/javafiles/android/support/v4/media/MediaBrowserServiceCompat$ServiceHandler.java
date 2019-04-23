// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.*;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat, MediaBrowserCompat

private final class MediaBrowserServiceCompat$ServiceHandler extends Handler
{

	public void handleMessage(Message message)
	{
		Object obj = ((Object) (message.getData()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method Bundle Message.getData()>
	//    2    4:astore_2        
		switch(message.what)
	//*   3    5:aload_1         
	//*   4    6:getfield        #37  <Field int Message.what>
		{
	//*   5    9:tableswitch     1 9: default 60
	//	               1 408
	//	               2 389
	//	               3 346
	//	               4 315
	//	               5 281
	//	               6 232
	//	               7 213
	//	               8 167
	//	               9 121
		default:
			obj = ((Object) (new StringBuilder()));
	//    6   60:new             #39  <Class StringBuilder>
	//    7   63:dup             
	//    8   64:invokespecial   #40  <Method void StringBuilder()>
	//    9   67:astore_2        
			((StringBuilder) (obj)).append("Unhandled message: ");
	//   10   68:aload_2         
	//   11   69:ldc1            #42  <String "Unhandled message: ">
	//   12   71:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   13   74:pop             
			((StringBuilder) (obj)).append(((Object) (message)));
	//   14   75:aload_2         
	//   15   76:aload_1         
	//   16   77:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
	//   17   80:pop             
			((StringBuilder) (obj)).append("\n  Service version: ");
	//   18   81:aload_2         
	//   19   82:ldc1            #51  <String "\n  Service version: ">
	//   20   84:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   21   87:pop             
			((StringBuilder) (obj)).append(2);
	//   22   88:aload_2         
	//   23   89:iconst_2        
	//   24   90:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   25   93:pop             
			((StringBuilder) (obj)).append("\n  Client version: ");
	//   26   94:aload_2         
	//   27   95:ldc1            #56  <String "\n  Client version: ">
	//   28   97:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   29  100:pop             
			((StringBuilder) (obj)).append(message.arg1);
	//   30  101:aload_2         
	//   31  102:aload_1         
	//   32  103:getfield        #59  <Field int Message.arg1>
	//   33  106:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   34  109:pop             
			Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
	//   35  110:ldc1            #61  <String "MBServiceCompat">
	//   36  112:aload_2         
	//   37  113:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   38  116:invokestatic    #71  <Method int Log.w(String, String)>
	//   39  119:pop             
			return;
	//   40  120:return          

		case 9: // '\t'
			Bundle bundle = ((Bundle) (obj)).getBundle("data_custom_action_extras");
	//   41  121:aload_2         
	//   42  122:ldc1            #73  <String "data_custom_action_extras">
	//   43  124:invokevirtual   #79  <Method Bundle Bundle.getBundle(String)>
	//   44  127:astore_3        
			MediaSessionCompat.ensureClassLoader(bundle);
	//   45  128:aload_3         
	//   46  129:invokestatic    #85  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			mServiceBinderImpl.sendCustomAction(((Bundle) (obj)).getString("data_custom_action"), bundle, (ResultReceiver)((Bundle) (obj)).getParcelable("data_result_receiver"), ((s) (new sCompat(message.replyTo))));
	//   47  132:aload_0         
	//   48  133:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   49  136:aload_2         
	//   50  137:ldc1            #87  <String "data_custom_action">
	//   51  139:invokevirtual   #91  <Method String Bundle.getString(String)>
	//   52  142:aload_3         
	//   53  143:aload_2         
	//   54  144:ldc1            #93  <String "data_result_receiver">
	//   55  146:invokevirtual   #97  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   56  149:checkcast       #99  <Class ResultReceiver>
	//   57  152:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   58  155:dup             
	//   59  156:aload_1         
	//   60  157:getfield        #105 <Field android.os.Messenger Message.replyTo>
	//   61  160:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//   62  163:invokevirtual   #112 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.sendCustomAction(String, Bundle, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//   63  166:return          

		case 8: // '\b'
			Bundle bundle1 = ((Bundle) (obj)).getBundle("data_search_extras");
	//   64  167:aload_2         
	//   65  168:ldc1            #114 <String "data_search_extras">
	//   66  170:invokevirtual   #79  <Method Bundle Bundle.getBundle(String)>
	//   67  173:astore_3        
			MediaSessionCompat.ensureClassLoader(bundle1);
	//   68  174:aload_3         
	//   69  175:invokestatic    #85  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			mServiceBinderImpl.search(((Bundle) (obj)).getString("data_search_query"), bundle1, (ResultReceiver)((Bundle) (obj)).getParcelable("data_result_receiver"), ((s) (new sCompat(message.replyTo))));
	//   70  178:aload_0         
	//   71  179:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   72  182:aload_2         
	//   73  183:ldc1            #116 <String "data_search_query">
	//   74  185:invokevirtual   #91  <Method String Bundle.getString(String)>
	//   75  188:aload_3         
	//   76  189:aload_2         
	//   77  190:ldc1            #93  <String "data_result_receiver">
	//   78  192:invokevirtual   #97  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   79  195:checkcast       #99  <Class ResultReceiver>
	//   80  198:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   81  201:dup             
	//   82  202:aload_1         
	//   83  203:getfield        #105 <Field android.os.Messenger Message.replyTo>
	//   84  206:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//   85  209:invokevirtual   #119 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.search(String, Bundle, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//   86  212:return          

		case 7: // '\007'
			mServiceBinderImpl.unregisterCallbacks(((s) (new sCompat(message.replyTo))));
	//   87  213:aload_0         
	//   88  214:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   89  217:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   90  220:dup             
	//   91  221:aload_1         
	//   92  222:getfield        #105 <Field android.os.Messenger Message.replyTo>
	//   93  225:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//   94  228:invokevirtual   #123 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.unregisterCallbacks(MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//   95  231:return          

		case 6: // '\006'
			Bundle bundle2 = ((Bundle) (obj)).getBundle("data_root_hints");
	//   96  232:aload_2         
	//   97  233:ldc1            #125 <String "data_root_hints">
	//   98  235:invokevirtual   #79  <Method Bundle Bundle.getBundle(String)>
	//   99  238:astore_3        
			MediaSessionCompat.ensureClassLoader(bundle2);
	//  100  239:aload_3         
	//  101  240:invokestatic    #85  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			mServiceBinderImpl.registerCallbacks(((s) (new sCompat(message.replyTo))), ((Bundle) (obj)).getString("data_package_name"), ((Bundle) (obj)).getInt("data_calling_pid"), ((Bundle) (obj)).getInt("data_calling_uid"), bundle2);
	//  102  243:aload_0         
	//  103  244:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  104  247:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  105  250:dup             
	//  106  251:aload_1         
	//  107  252:getfield        #105 <Field android.os.Messenger Message.replyTo>
	//  108  255:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//  109  258:aload_2         
	//  110  259:ldc1            #127 <String "data_package_name">
	//  111  261:invokevirtual   #91  <Method String Bundle.getString(String)>
	//  112  264:aload_2         
	//  113  265:ldc1            #129 <String "data_calling_pid">
	//  114  267:invokevirtual   #133 <Method int Bundle.getInt(String)>
	//  115  270:aload_2         
	//  116  271:ldc1            #135 <String "data_calling_uid">
	//  117  273:invokevirtual   #133 <Method int Bundle.getInt(String)>
	//  118  276:aload_3         
	//  119  277:invokevirtual   #139 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.registerCallbacks(MediaBrowserServiceCompat$ServiceCallbacks, String, int, int, Bundle)>
			return;
	//  120  280:return          

		case 5: // '\005'
			mServiceBinderImpl.getMediaItem(((Bundle) (obj)).getString("data_media_item_id"), (ResultReceiver)((Bundle) (obj)).getParcelable("data_result_receiver"), ((s) (new sCompat(message.replyTo))));
	//  121  281:aload_0         
	//  122  282:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  123  285:aload_2         
	//  124  286:ldc1            #141 <String "data_media_item_id">
	//  125  288:invokevirtual   #91  <Method String Bundle.getString(String)>
	//  126  291:aload_2         
	//  127  292:ldc1            #93  <String "data_result_receiver">
	//  128  294:invokevirtual   #97  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//  129  297:checkcast       #99  <Class ResultReceiver>
	//  130  300:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  131  303:dup             
	//  132  304:aload_1         
	//  133  305:getfield        #105 <Field android.os.Messenger Message.replyTo>
	//  134  308:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//  135  311:invokevirtual   #145 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.getMediaItem(String, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//  136  314:return          

		case 4: // '\004'
			mServiceBinderImpl.removeSubscription(((Bundle) (obj)).getString("data_media_item_id"), BundleCompat.getBinder(((Bundle) (obj)), "data_callback_token"), ((s) (new sCompat(message.replyTo))));
	//  137  315:aload_0         
	//  138  316:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  139  319:aload_2         
	//  140  320:ldc1            #141 <String "data_media_item_id">
	//  141  322:invokevirtual   #91  <Method String Bundle.getString(String)>
	//  142  325:aload_2         
	//  143  326:ldc1            #147 <String "data_callback_token">
	//  144  328:invokestatic    #153 <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//  145  331:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  146  334:dup             
	//  147  335:aload_1         
	//  148  336:getfield        #105 <Field android.os.Messenger Message.replyTo>
	//  149  339:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//  150  342:invokevirtual   #157 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.removeSubscription(String, android.os.IBinder, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//  151  345:return          

		case 3: // '\003'
			Bundle bundle3 = ((Bundle) (obj)).getBundle("data_options");
	//  152  346:aload_2         
	//  153  347:ldc1            #159 <String "data_options">
	//  154  349:invokevirtual   #79  <Method Bundle Bundle.getBundle(String)>
	//  155  352:astore_3        
			MediaSessionCompat.ensureClassLoader(bundle3);
	//  156  353:aload_3         
	//  157  354:invokestatic    #85  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			mServiceBinderImpl.addSubscription(((Bundle) (obj)).getString("data_media_item_id"), BundleCompat.getBinder(((Bundle) (obj)), "data_callback_token"), bundle3, ((s) (new sCompat(message.replyTo))));
	//  158  357:aload_0         
	//  159  358:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  160  361:aload_2         
	//  161  362:ldc1            #141 <String "data_media_item_id">
	//  162  364:invokevirtual   #91  <Method String Bundle.getString(String)>
	//  163  367:aload_2         
	//  164  368:ldc1            #147 <String "data_callback_token">
	//  165  370:invokestatic    #153 <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//  166  373:aload_3         
	//  167  374:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  168  377:dup             
	//  169  378:aload_1         
	//  170  379:getfield        #105 <Field android.os.Messenger Message.replyTo>
	//  171  382:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//  172  385:invokevirtual   #163 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.addSubscription(String, android.os.IBinder, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//  173  388:return          

		case 2: // '\002'
			mServiceBinderImpl.disconnect(((s) (new sCompat(message.replyTo))));
	//  174  389:aload_0         
	//  175  390:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  176  393:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  177  396:dup             
	//  178  397:aload_1         
	//  179  398:getfield        #105 <Field android.os.Messenger Message.replyTo>
	//  180  401:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//  181  404:invokevirtual   #166 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.disconnect(MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//  182  407:return          

		case 1: // '\001'
			Bundle bundle4 = ((Bundle) (obj)).getBundle("data_root_hints");
	//  183  408:aload_2         
	//  184  409:ldc1            #125 <String "data_root_hints">
	//  185  411:invokevirtual   #79  <Method Bundle Bundle.getBundle(String)>
	//  186  414:astore_3        
			MediaSessionCompat.ensureClassLoader(bundle4);
	//  187  415:aload_3         
	//  188  416:invokestatic    #85  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			mServiceBinderImpl.connect(((Bundle) (obj)).getString("data_package_name"), ((Bundle) (obj)).getInt("data_calling_pid"), ((Bundle) (obj)).getInt("data_calling_uid"), bundle4, ((s) (new sCompat(message.replyTo))));
	//  189  419:aload_0         
	//  190  420:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  191  423:aload_2         
	//  192  424:ldc1            #127 <String "data_package_name">
	//  193  426:invokevirtual   #91  <Method String Bundle.getString(String)>
	//  194  429:aload_2         
	//  195  430:ldc1            #129 <String "data_calling_pid">
	//  196  432:invokevirtual   #133 <Method int Bundle.getInt(String)>
	//  197  435:aload_2         
	//  198  436:ldc1            #135 <String "data_calling_uid">
	//  199  438:invokevirtual   #133 <Method int Bundle.getInt(String)>
	//  200  441:aload_3         
	//  201  442:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  202  445:dup             
	//  203  446:aload_1         
	//  204  447:getfield        #105 <Field android.os.Messenger Message.replyTo>
	//  205  450:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//  206  453:invokevirtual   #170 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.connect(String, int, int, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//  207  456:return          
		}
	}

	public void postOrRun(Runnable runnable)
	{
		if(Thread.currentThread() == getLooper().getThread())
	//*   0    0:invokestatic    #178 <Method Thread Thread.currentThread()>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #182 <Method Looper getLooper()>
	//*   3    7:invokevirtual   #187 <Method Thread Looper.getThread()>
	//*   4   10:if_acmpne       20
		{
			runnable.run();
	//    5   13:aload_1         
	//    6   14:invokeinterface #192 <Method void Runnable.run()>
			return;
	//    7   19:return          
		} else
		{
			post(runnable);
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:invokevirtual   #196 <Method boolean post(Runnable)>
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
	//    4    8:ldc1            #200 <Class MediaBrowserCompat>
	//    5   10:invokevirtual   #206 <Method ClassLoader Class.getClassLoader()>
	//    6   13:invokevirtual   #210 <Method void Bundle.setClassLoader(ClassLoader)>
		bundle.putInt("data_calling_uid", Binder.getCallingUid());
	//    7   16:aload           4
	//    8   18:ldc1            #135 <String "data_calling_uid">
	//    9   20:invokestatic    #216 <Method int Binder.getCallingUid()>
	//   10   23:invokevirtual   #220 <Method void Bundle.putInt(String, int)>
		bundle.putInt("data_calling_pid", Binder.getCallingPid());
	//   11   26:aload           4
	//   12   28:ldc1            #129 <String "data_calling_pid">
	//   13   30:invokestatic    #223 <Method int Binder.getCallingPid()>
	//   14   33:invokevirtual   #220 <Method void Bundle.putInt(String, int)>
		return super.sendMessageAtTime(message, l);
	//   15   36:aload_0         
	//   16   37:aload_1         
	//   17   38:lload_2         
	//   18   39:invokespecial   #225 <Method boolean Handler.sendMessageAtTime(Message, long)>
	//   19   42:ireturn         
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
