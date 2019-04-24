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

final class MediaBrowserServiceCompat$ServiceHandler extends Handler
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
	//*   5    9:tableswitch     1 8: default 56
	//	               1 59
	//	               2 100
	//	               3 123
	//	               4 164
	//	               5 199
	//	               6 237
	//	               7 266
	//	               8 289
	//*   6   56:goto            333
		case 1: // '\001'
			mServiceBinderImpl.connect(bundle.getString("data_package_name"), bundle.getInt("data_calling_uid"), bundle.getBundle("data_root_hints"), ((s) (new sCompat(MediaBrowserServiceCompat.this, message.replyTo))));
	//    7   59:aload_0         
	//    8   60:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//    9   63:aload_2         
	//   10   64:ldc1            #39  <String "data_package_name">
	//   11   66:invokevirtual   #45  <Method String Bundle.getString(String)>
	//   12   69:aload_2         
	//   13   70:ldc1            #47  <String "data_calling_uid">
	//   14   72:invokevirtual   #51  <Method int Bundle.getInt(String)>
	//   15   75:aload_2         
	//   16   76:ldc1            #53  <String "data_root_hints">
	//   17   78:invokevirtual   #57  <Method Bundle Bundle.getBundle(String)>
	//   18   81:new             #59  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   19   84:dup             
	//   20   85:aload_0         
	//   21   86:getfield        #15  <Field MediaBrowserServiceCompat this$0>
	//   22   89:aload_1         
	//   23   90:getfield        #63  <Field android.os.Messenger Message.replyTo>
	//   24   93:invokespecial   #66  <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(MediaBrowserServiceCompat, android.os.Messenger)>
	//   25   96:invokevirtual   #70  <Method void MediaBrowserServiceCompat$ServiceBinderImpl.connect(String, int, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//   26   99:return          

		case 2: // '\002'
			mServiceBinderImpl.disconnect(((s) (new sCompat(MediaBrowserServiceCompat.this, message.replyTo))));
	//   27  100:aload_0         
	//   28  101:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   29  104:new             #59  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   30  107:dup             
	//   31  108:aload_0         
	//   32  109:getfield        #15  <Field MediaBrowserServiceCompat this$0>
	//   33  112:aload_1         
	//   34  113:getfield        #63  <Field android.os.Messenger Message.replyTo>
	//   35  116:invokespecial   #66  <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(MediaBrowserServiceCompat, android.os.Messenger)>
	//   36  119:invokevirtual   #74  <Method void MediaBrowserServiceCompat$ServiceBinderImpl.disconnect(MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//   37  122:return          

		case 3: // '\003'
			mServiceBinderImpl.addSubscription(bundle.getString("data_media_item_id"), BundleCompat.getBinder(bundle, "data_callback_token"), bundle.getBundle("data_options"), ((s) (new sCompat(MediaBrowserServiceCompat.this, message.replyTo))));
	//   38  123:aload_0         
	//   39  124:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   40  127:aload_2         
	//   41  128:ldc1            #76  <String "data_media_item_id">
	//   42  130:invokevirtual   #45  <Method String Bundle.getString(String)>
	//   43  133:aload_2         
	//   44  134:ldc1            #78  <String "data_callback_token">
	//   45  136:invokestatic    #84  <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//   46  139:aload_2         
	//   47  140:ldc1            #86  <String "data_options">
	//   48  142:invokevirtual   #57  <Method Bundle Bundle.getBundle(String)>
	//   49  145:new             #59  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   50  148:dup             
	//   51  149:aload_0         
	//   52  150:getfield        #15  <Field MediaBrowserServiceCompat this$0>
	//   53  153:aload_1         
	//   54  154:getfield        #63  <Field android.os.Messenger Message.replyTo>
	//   55  157:invokespecial   #66  <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(MediaBrowserServiceCompat, android.os.Messenger)>
	//   56  160:invokevirtual   #90  <Method void MediaBrowserServiceCompat$ServiceBinderImpl.addSubscription(String, android.os.IBinder, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//   57  163:return          

		case 4: // '\004'
			mServiceBinderImpl.removeSubscription(bundle.getString("data_media_item_id"), BundleCompat.getBinder(bundle, "data_callback_token"), ((s) (new sCompat(MediaBrowserServiceCompat.this, message.replyTo))));
	//   58  164:aload_0         
	//   59  165:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   60  168:aload_2         
	//   61  169:ldc1            #76  <String "data_media_item_id">
	//   62  171:invokevirtual   #45  <Method String Bundle.getString(String)>
	//   63  174:aload_2         
	//   64  175:ldc1            #78  <String "data_callback_token">
	//   65  177:invokestatic    #84  <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//   66  180:new             #59  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   67  183:dup             
	//   68  184:aload_0         
	//   69  185:getfield        #15  <Field MediaBrowserServiceCompat this$0>
	//   70  188:aload_1         
	//   71  189:getfield        #63  <Field android.os.Messenger Message.replyTo>
	//   72  192:invokespecial   #66  <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(MediaBrowserServiceCompat, android.os.Messenger)>
	//   73  195:invokevirtual   #94  <Method void MediaBrowserServiceCompat$ServiceBinderImpl.removeSubscription(String, android.os.IBinder, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//   74  198:return          

		case 5: // '\005'
			mServiceBinderImpl.getMediaItem(bundle.getString("data_media_item_id"), (ResultReceiver)bundle.getParcelable("data_result_receiver"), ((s) (new sCompat(MediaBrowserServiceCompat.this, message.replyTo))));
	//   75  199:aload_0         
	//   76  200:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   77  203:aload_2         
	//   78  204:ldc1            #76  <String "data_media_item_id">
	//   79  206:invokevirtual   #45  <Method String Bundle.getString(String)>
	//   80  209:aload_2         
	//   81  210:ldc1            #96  <String "data_result_receiver">
	//   82  212:invokevirtual   #100 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   83  215:checkcast       #102 <Class ResultReceiver>
	//   84  218:new             #59  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   85  221:dup             
	//   86  222:aload_0         
	//   87  223:getfield        #15  <Field MediaBrowserServiceCompat this$0>
	//   88  226:aload_1         
	//   89  227:getfield        #63  <Field android.os.Messenger Message.replyTo>
	//   90  230:invokespecial   #66  <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(MediaBrowserServiceCompat, android.os.Messenger)>
	//   91  233:invokevirtual   #106 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.getMediaItem(String, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//   92  236:return          

		case 6: // '\006'
			mServiceBinderImpl.registerCallbacks(((s) (new sCompat(MediaBrowserServiceCompat.this, message.replyTo))), bundle.getBundle("data_root_hints"));
	//   93  237:aload_0         
	//   94  238:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//   95  241:new             #59  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//   96  244:dup             
	//   97  245:aload_0         
	//   98  246:getfield        #15  <Field MediaBrowserServiceCompat this$0>
	//   99  249:aload_1         
	//  100  250:getfield        #63  <Field android.os.Messenger Message.replyTo>
	//  101  253:invokespecial   #66  <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(MediaBrowserServiceCompat, android.os.Messenger)>
	//  102  256:aload_2         
	//  103  257:ldc1            #53  <String "data_root_hints">
	//  104  259:invokevirtual   #57  <Method Bundle Bundle.getBundle(String)>
	//  105  262:invokevirtual   #110 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.registerCallbacks(MediaBrowserServiceCompat$ServiceCallbacks, Bundle)>
			return;
	//  106  265:return          

		case 7: // '\007'
			mServiceBinderImpl.unregisterCallbacks(((s) (new sCompat(MediaBrowserServiceCompat.this, message.replyTo))));
	//  107  266:aload_0         
	//  108  267:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  109  270:new             #59  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  110  273:dup             
	//  111  274:aload_0         
	//  112  275:getfield        #15  <Field MediaBrowserServiceCompat this$0>
	//  113  278:aload_1         
	//  114  279:getfield        #63  <Field android.os.Messenger Message.replyTo>
	//  115  282:invokespecial   #66  <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(MediaBrowserServiceCompat, android.os.Messenger)>
	//  116  285:invokevirtual   #113 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.unregisterCallbacks(MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//  117  288:return          

		case 8: // '\b'
			mServiceBinderImpl.search(bundle.getString("data_search_query"), bundle.getBundle("data_search_extras"), (ResultReceiver)bundle.getParcelable("data_result_receiver"), ((s) (new sCompat(MediaBrowserServiceCompat.this, message.replyTo))));
	//  118  289:aload_0         
	//  119  290:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
	//  120  293:aload_2         
	//  121  294:ldc1            #115 <String "data_search_query">
	//  122  296:invokevirtual   #45  <Method String Bundle.getString(String)>
	//  123  299:aload_2         
	//  124  300:ldc1            #117 <String "data_search_extras">
	//  125  302:invokevirtual   #57  <Method Bundle Bundle.getBundle(String)>
	//  126  305:aload_2         
	//  127  306:ldc1            #96  <String "data_result_receiver">
	//  128  308:invokevirtual   #100 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//  129  311:checkcast       #102 <Class ResultReceiver>
	//  130  314:new             #59  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
	//  131  317:dup             
	//  132  318:aload_0         
	//  133  319:getfield        #15  <Field MediaBrowserServiceCompat this$0>
	//  134  322:aload_1         
	//  135  323:getfield        #63  <Field android.os.Messenger Message.replyTo>
	//  136  326:invokespecial   #66  <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(MediaBrowserServiceCompat, android.os.Messenger)>
	//  137  329:invokevirtual   #121 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.search(String, Bundle, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
			return;
	//  138  332:return          
		}
		Log.w("MBServiceCompat", (new StringBuilder()).append("Unhandled message: ").append(((Object) (message))).append("\n  Service version: ").append(1).append("\n  Client version: ").append(message.arg1).toString());
	//  139  333:ldc1            #123 <String "MBServiceCompat">
	//  140  335:new             #125 <Class StringBuilder>
	//  141  338:dup             
	//  142  339:invokespecial   #126 <Method void StringBuilder()>
	//  143  342:ldc1            #128 <String "Unhandled message: ">
	//  144  344:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//  145  347:aload_1         
	//  146  348:invokevirtual   #135 <Method StringBuilder StringBuilder.append(Object)>
	//  147  351:ldc1            #137 <String "\n  Service version: ">
	//  148  353:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//  149  356:iconst_1        
	//  150  357:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//  151  360:ldc1            #142 <String "\n  Client version: ">
	//  152  362:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//  153  365:aload_1         
	//  154  366:getfield        #145 <Field int Message.arg1>
	//  155  369:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//  156  372:invokevirtual   #149 <Method String StringBuilder.toString()>
	//  157  375:invokestatic    #155 <Method int Log.w(String, String)>
	//  158  378:pop             
	//  159  379:return          
	}

	public void postOrRun(Runnable runnable)
	{
		if(Thread.currentThread() == getLooper().getThread())
	//*   0    0:invokestatic    #163 <Method Thread Thread.currentThread()>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #167 <Method Looper getLooper()>
	//*   3    7:invokevirtual   #172 <Method Thread Looper.getThread()>
	//*   4   10:if_acmpne       20
		{
			runnable.run();
	//    5   13:aload_1         
	//    6   14:invokeinterface #177 <Method void Runnable.run()>
			return;
	//    7   19:return          
		} else
		{
			post(runnable);
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:invokevirtual   #181 <Method boolean post(Runnable)>
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
	//    4    8:ldc1            #185 <Class MediaBrowserCompat>
	//    5   10:invokevirtual   #191 <Method ClassLoader Class.getClassLoader()>
	//    6   13:invokevirtual   #195 <Method void Bundle.setClassLoader(ClassLoader)>
		bundle.putInt("data_calling_uid", Binder.getCallingUid());
	//    7   16:aload           4
	//    8   18:ldc1            #47  <String "data_calling_uid">
	//    9   20:invokestatic    #201 <Method int Binder.getCallingUid()>
	//   10   23:invokevirtual   #205 <Method void Bundle.putInt(String, int)>
		return super.sendMessageAtTime(message, l);
	//   11   26:aload_0         
	//   12   27:aload_1         
	//   13   28:lload_2         
	//   14   29:invokespecial   #207 <Method boolean Handler.sendMessageAtTime(Message, long)>
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
