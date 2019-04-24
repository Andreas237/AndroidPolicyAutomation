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
		Object obj = ((Object) (message.getData()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method Bundle Message.getData()>
	//    2    4:astore_2        
		switch(message.what)
	//*   3    5:aload_1         
	//*   4    6:getfield        #37  <Field int Message.what>
		{
	//*   5    9:tableswitch     1 9: default 60
	//	               1 366
	//	               2 347
	//	               3 310
	//	               4 279
	//	               5 245
	//	               6 220
	//	               7 201
	//	               8 161
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
			mServiceBinderImpl.sendCustomAction(((Bundle) (obj)).getString("data_custom_action"), ((Bundle) (obj)).getBundle("data_custom_action_extras"), (ResultReceiver)((Bundle) (obj)).getParcelable("data_result_receiver"), ((s) (new sCompat(message.replyTo))));
	//   41  121:aload_0         
	//   42  122:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   43  125:aload_2         
	//   44  126:ldc1            #73  <String "data_custom_action">
	//   45  128:invokevirtual   #79  <Method String Bundle.getString(String)>
	//   46  131:aload_2         
	//   47  132:ldc1            #81  <String "data_custom_action_extras">
	//   48  134:invokevirtual   #85  <Method Bundle Bundle.getBundle(String)>
	//   49  137:aload_2         
	//   50  138:ldc1            #87  <String "data_result_receiver">
	//   51  140:invokevirtual   #91  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   52  143:checkcast       #93  <Class ResultReceiver>
	//   53  146:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   54  149:dup             
	//   55  150:aload_1         
	//   56  151:getfield        #99  <Field android.os.Messenger Message.replyTo>
	//   57  154:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//   58  157:invokevirtual   #106 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.sendCustomAction(String, Bundle, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//   59  160:return          

		case 8: // '\b'
			mServiceBinderImpl.search(((Bundle) (obj)).getString("data_search_query"), ((Bundle) (obj)).getBundle("data_search_extras"), (ResultReceiver)((Bundle) (obj)).getParcelable("data_result_receiver"), ((s) (new sCompat(message.replyTo))));
	//   60  161:aload_0         
	//   61  162:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   62  165:aload_2         
	//   63  166:ldc1            #108 <String "data_search_query">
	//   64  168:invokevirtual   #79  <Method String Bundle.getString(String)>
	//   65  171:aload_2         
	//   66  172:ldc1            #110 <String "data_search_extras">
	//   67  174:invokevirtual   #85  <Method Bundle Bundle.getBundle(String)>
	//   68  177:aload_2         
	//   69  178:ldc1            #87  <String "data_result_receiver">
	//   70  180:invokevirtual   #91  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   71  183:checkcast       #93  <Class ResultReceiver>
	//   72  186:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   73  189:dup             
	//   74  190:aload_1         
	//   75  191:getfield        #99  <Field android.os.Messenger Message.replyTo>
	//   76  194:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//   77  197:invokevirtual   #113 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.search(String, Bundle, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//   78  200:return          

		case 7: // '\007'
			mServiceBinderImpl.unregisterCallbacks(((s) (new sCompat(message.replyTo))));
	//   79  201:aload_0         
	//   80  202:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   81  205:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   82  208:dup             
	//   83  209:aload_1         
	//   84  210:getfield        #99  <Field android.os.Messenger Message.replyTo>
	//   85  213:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//   86  216:invokevirtual   #117 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.unregisterCallbacks(MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//   87  219:return          

		case 6: // '\006'
			mServiceBinderImpl.registerCallbacks(((s) (new sCompat(message.replyTo))), ((Bundle) (obj)).getBundle("data_root_hints"));
	//   88  220:aload_0         
	//   89  221:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   90  224:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   91  227:dup             
	//   92  228:aload_1         
	//   93  229:getfield        #99  <Field android.os.Messenger Message.replyTo>
	//   94  232:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//   95  235:aload_2         
	//   96  236:ldc1            #119 <String "data_root_hints">
	//   97  238:invokevirtual   #85  <Method Bundle Bundle.getBundle(String)>
	//   98  241:invokevirtual   #123 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.registerCallbacks(MediaBrowserServiceCompat$ServiceCallbacks, Bundle)>
			return;
	//   99  244:return          

		case 5: // '\005'
			mServiceBinderImpl.getMediaItem(((Bundle) (obj)).getString("data_media_item_id"), (ResultReceiver)((Bundle) (obj)).getParcelable("data_result_receiver"), ((s) (new sCompat(message.replyTo))));
	//  100  245:aload_0         
	//  101  246:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  102  249:aload_2         
	//  103  250:ldc1            #125 <String "data_media_item_id">
	//  104  252:invokevirtual   #79  <Method String Bundle.getString(String)>
	//  105  255:aload_2         
	//  106  256:ldc1            #87  <String "data_result_receiver">
	//  107  258:invokevirtual   #91  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//  108  261:checkcast       #93  <Class ResultReceiver>
	//  109  264:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  110  267:dup             
	//  111  268:aload_1         
	//  112  269:getfield        #99  <Field android.os.Messenger Message.replyTo>
	//  113  272:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//  114  275:invokevirtual   #129 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.getMediaItem(String, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//  115  278:return          

		case 4: // '\004'
			mServiceBinderImpl.removeSubscription(((Bundle) (obj)).getString("data_media_item_id"), BundleCompat.getBinder(((Bundle) (obj)), "data_callback_token"), ((s) (new sCompat(message.replyTo))));
	//  116  279:aload_0         
	//  117  280:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  118  283:aload_2         
	//  119  284:ldc1            #125 <String "data_media_item_id">
	//  120  286:invokevirtual   #79  <Method String Bundle.getString(String)>
	//  121  289:aload_2         
	//  122  290:ldc1            #131 <String "data_callback_token">
	//  123  292:invokestatic    #137 <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//  124  295:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  125  298:dup             
	//  126  299:aload_1         
	//  127  300:getfield        #99  <Field android.os.Messenger Message.replyTo>
	//  128  303:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//  129  306:invokevirtual   #141 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.removeSubscription(String, android.os.IBinder, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//  130  309:return          

		case 3: // '\003'
			mServiceBinderImpl.addSubscription(((Bundle) (obj)).getString("data_media_item_id"), BundleCompat.getBinder(((Bundle) (obj)), "data_callback_token"), ((Bundle) (obj)).getBundle("data_options"), ((s) (new sCompat(message.replyTo))));
	//  131  310:aload_0         
	//  132  311:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  133  314:aload_2         
	//  134  315:ldc1            #125 <String "data_media_item_id">
	//  135  317:invokevirtual   #79  <Method String Bundle.getString(String)>
	//  136  320:aload_2         
	//  137  321:ldc1            #131 <String "data_callback_token">
	//  138  323:invokestatic    #137 <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//  139  326:aload_2         
	//  140  327:ldc1            #143 <String "data_options">
	//  141  329:invokevirtual   #85  <Method Bundle Bundle.getBundle(String)>
	//  142  332:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  143  335:dup             
	//  144  336:aload_1         
	//  145  337:getfield        #99  <Field android.os.Messenger Message.replyTo>
	//  146  340:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//  147  343:invokevirtual   #147 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.addSubscription(String, android.os.IBinder, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//  148  346:return          

		case 2: // '\002'
			mServiceBinderImpl.disconnect(((s) (new sCompat(message.replyTo))));
	//  149  347:aload_0         
	//  150  348:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  151  351:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  152  354:dup             
	//  153  355:aload_1         
	//  154  356:getfield        #99  <Field android.os.Messenger Message.replyTo>
	//  155  359:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//  156  362:invokevirtual   #150 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.disconnect(MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//  157  365:return          

		case 1: // '\001'
			mServiceBinderImpl.connect(((Bundle) (obj)).getString("data_package_name"), ((Bundle) (obj)).getInt("data_calling_uid"), ((Bundle) (obj)).getBundle("data_root_hints"), ((s) (new sCompat(message.replyTo))));
	//  158  366:aload_0         
	//  159  367:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  160  370:aload_2         
	//  161  371:ldc1            #152 <String "data_package_name">
	//  162  373:invokevirtual   #79  <Method String Bundle.getString(String)>
	//  163  376:aload_2         
	//  164  377:ldc1            #154 <String "data_calling_uid">
	//  165  379:invokevirtual   #158 <Method int Bundle.getInt(String)>
	//  166  382:aload_2         
	//  167  383:ldc1            #119 <String "data_root_hints">
	//  168  385:invokevirtual   #85  <Method Bundle Bundle.getBundle(String)>
	//  169  388:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  170  391:dup             
	//  171  392:aload_1         
	//  172  393:getfield        #99  <Field android.os.Messenger Message.replyTo>
	//  173  396:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(android.os.Messenger)>
	//  174  399:invokevirtual   #162 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.connect(String, int, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//  175  402:return          
		}
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
	//    8   18:ldc1            #154 <String "data_calling_uid">
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
