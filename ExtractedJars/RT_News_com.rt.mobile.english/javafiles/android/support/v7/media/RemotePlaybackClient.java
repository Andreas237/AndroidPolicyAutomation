// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.app.PendingIntent;
import android.content.*;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.util.ObjectsCompat;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//			MediaSessionStatus, MediaItemStatus

public class RemotePlaybackClient
{
	public static abstract class ActionCallback
	{

		public void onError(String s, int i, Bundle bundle)
		{
		//    0    0:return          
		}

		public ActionCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	private final class ActionReceiver extends BroadcastReceiver
	{

		public void onReceive(Context context, Intent intent)
		{
			context = ((Context) (intent.getStringExtra("android.media.intent.extra.SESSION_ID")));
		//    0    0:aload_2         
		//    1    1:ldc1            #31  <String "android.media.intent.extra.SESSION_ID">
		//    2    3:invokevirtual   #37  <Method String Intent.getStringExtra(String)>
		//    3    6:astore_1        
			if(context != null && ((String) (context)).equals(((Object) (mSessionId))))
		//*   4    7:aload_1         
		//*   5    8:ifnull          403
		//*   6   11:aload_1         
		//*   7   12:aload_0         
		//*   8   13:getfield        #23  <Field RemotePlaybackClient this$0>
		//*   9   16:getfield        #40  <Field String RemotePlaybackClient.mSessionId>
		//*  10   19:invokevirtual   #46  <Method boolean String.equals(Object)>
		//*  11   22:ifne            28
		//*  12   25:goto            403
			{
				MediaSessionStatus mediasessionstatus = MediaSessionStatus.fromBundle(intent.getBundleExtra("android.media.intent.extra.SESSION_STATUS"));
		//   13   28:aload_2         
		//   14   29:ldc1            #48  <String "android.media.intent.extra.SESSION_STATUS">
		//   15   31:invokevirtual   #52  <Method Bundle Intent.getBundleExtra(String)>
		//   16   34:invokestatic    #58  <Method MediaSessionStatus MediaSessionStatus.fromBundle(Bundle)>
		//   17   37:astore_3        
				Object obj = ((Object) (intent.getAction()));
		//   18   38:aload_2         
		//   19   39:invokevirtual   #62  <Method String Intent.getAction()>
		//   20   42:astore          4
				if(((String) (obj)).equals("android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED"))
		//*  21   44:aload           4
		//*  22   46:ldc1            #11  <String "android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED">
		//*  23   48:invokevirtual   #46  <Method boolean String.equals(Object)>
		//*  24   51:ifeq            220
				{
					obj = ((Object) (intent.getStringExtra("android.media.intent.extra.ITEM_ID")));
		//   25   54:aload_2         
		//   26   55:ldc1            #64  <String "android.media.intent.extra.ITEM_ID">
		//   27   57:invokevirtual   #37  <Method String Intent.getStringExtra(String)>
		//   28   60:astore          4
					if(obj == null)
		//*  29   62:aload           4
		//*  30   64:ifnonnull       76
					{
						Log.w("RemotePlaybackClient", "Discarding spurious status callback with missing item id.");
		//   31   67:ldc1            #66  <String "RemotePlaybackClient">
		//   32   69:ldc1            #68  <String "Discarding spurious status callback with missing item id.">
		//   33   71:invokestatic    #74  <Method int Log.w(String, String)>
		//   34   74:pop             
						return;
		//   35   75:return          
					}
					MediaItemStatus mediaitemstatus = MediaItemStatus.fromBundle(intent.getBundleExtra("android.media.intent.extra.ITEM_STATUS"));
		//   36   76:aload_2         
		//   37   77:ldc1            #76  <String "android.media.intent.extra.ITEM_STATUS">
		//   38   79:invokevirtual   #52  <Method Bundle Intent.getBundleExtra(String)>
		//   39   82:invokestatic    #81  <Method MediaItemStatus MediaItemStatus.fromBundle(Bundle)>
		//   40   85:astore          5
					if(mediaitemstatus == null)
		//*  41   87:aload           5
		//*  42   89:ifnonnull       101
					{
						Log.w("RemotePlaybackClient", "Discarding spurious status callback with missing item status.");
		//   43   92:ldc1            #66  <String "RemotePlaybackClient">
		//   44   94:ldc1            #83  <String "Discarding spurious status callback with missing item status.">
		//   45   96:invokestatic    #74  <Method int Log.w(String, String)>
		//   46   99:pop             
						return;
		//   47  100:return          
					}
					if(RemotePlaybackClient.DEBUG)
		//*  48  101:getstatic       #87  <Field boolean RemotePlaybackClient.DEBUG>
		//*  49  104:ifeq            189
					{
						StringBuilder stringbuilder1 = new StringBuilder();
		//   50  107:new             #89  <Class StringBuilder>
		//   51  110:dup             
		//   52  111:invokespecial   #90  <Method void StringBuilder()>
		//   53  114:astore          6
						stringbuilder1.append("Received item status callback: sessionId=");
		//   54  116:aload           6
		//   55  118:ldc1            #92  <String "Received item status callback: sessionId=">
		//   56  120:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
		//   57  123:pop             
						stringbuilder1.append(((String) (context)));
		//   58  124:aload           6
		//   59  126:aload_1         
		//   60  127:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
		//   61  130:pop             
						stringbuilder1.append(", sessionStatus=");
		//   62  131:aload           6
		//   63  133:ldc1            #98  <String ", sessionStatus=">
		//   64  135:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
		//   65  138:pop             
						stringbuilder1.append(((Object) (mediasessionstatus)));
		//   66  139:aload           6
		//   67  141:aload_3         
		//   68  142:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
		//   69  145:pop             
						stringbuilder1.append(", itemId=");
		//   70  146:aload           6
		//   71  148:ldc1            #103 <String ", itemId=">
		//   72  150:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
		//   73  153:pop             
						stringbuilder1.append(((String) (obj)));
		//   74  154:aload           6
		//   75  156:aload           4
		//   76  158:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
		//   77  161:pop             
						stringbuilder1.append(", itemStatus=");
		//   78  162:aload           6
		//   79  164:ldc1            #105 <String ", itemStatus=">
		//   80  166:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
		//   81  169:pop             
						stringbuilder1.append(((Object) (mediaitemstatus)));
		//   82  170:aload           6
		//   83  172:aload           5
		//   84  174:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
		//   85  177:pop             
						Log.d("RemotePlaybackClient", stringbuilder1.toString());
		//   86  178:ldc1            #66  <String "RemotePlaybackClient">
		//   87  180:aload           6
		//   88  182:invokevirtual   #108 <Method String StringBuilder.toString()>
		//   89  185:invokestatic    #111 <Method int Log.d(String, String)>
		//   90  188:pop             
					}
					if(mStatusCallback != null)
		//*  91  189:aload_0         
		//*  92  190:getfield        #23  <Field RemotePlaybackClient this$0>
		//*  93  193:getfield        #115 <Field RemotePlaybackClient$StatusCallback RemotePlaybackClient.mStatusCallback>
		//*  94  196:ifnull          402
					{
						mStatusCallback.onItemStatusChanged(intent.getExtras(), ((String) (context)), mediasessionstatus, ((String) (obj)), mediaitemstatus);
		//   95  199:aload_0         
		//   96  200:getfield        #23  <Field RemotePlaybackClient this$0>
		//   97  203:getfield        #115 <Field RemotePlaybackClient$StatusCallback RemotePlaybackClient.mStatusCallback>
		//   98  206:aload_2         
		//   99  207:invokevirtual   #119 <Method Bundle Intent.getExtras()>
		//  100  210:aload_1         
		//  101  211:aload_3         
		//  102  212:aload           4
		//  103  214:aload           5
		//  104  216:invokevirtual   #125 <Method void RemotePlaybackClient$StatusCallback.onItemStatusChanged(Bundle, String, MediaSessionStatus, String, MediaItemStatus)>
						return;
		//  105  219:return          
					}
				} else
				if(((String) (obj)).equals("android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED"))
		//* 106  220:aload           4
		//* 107  222:ldc1            #17  <String "android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED">
		//* 108  224:invokevirtual   #46  <Method boolean String.equals(Object)>
		//* 109  227:ifeq            326
				{
					if(mediasessionstatus == null)
		//* 110  230:aload_3         
		//* 111  231:ifnonnull       243
					{
						Log.w("RemotePlaybackClient", "Discarding spurious media status callback with missing session status.");
		//  112  234:ldc1            #66  <String "RemotePlaybackClient">
		//  113  236:ldc1            #127 <String "Discarding spurious media status callback with missing session status.">
		//  114  238:invokestatic    #74  <Method int Log.w(String, String)>
		//  115  241:pop             
						return;
		//  116  242:return          
					}
					if(RemotePlaybackClient.DEBUG)
		//* 117  243:getstatic       #87  <Field boolean RemotePlaybackClient.DEBUG>
		//* 118  246:ifeq            299
					{
						obj = ((Object) (new StringBuilder()));
		//  119  249:new             #89  <Class StringBuilder>
		//  120  252:dup             
		//  121  253:invokespecial   #90  <Method void StringBuilder()>
		//  122  256:astore          4
						((StringBuilder) (obj)).append("Received session status callback: sessionId=");
		//  123  258:aload           4
		//  124  260:ldc1            #129 <String "Received session status callback: sessionId=">
		//  125  262:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
		//  126  265:pop             
						((StringBuilder) (obj)).append(((String) (context)));
		//  127  266:aload           4
		//  128  268:aload_1         
		//  129  269:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
		//  130  272:pop             
						((StringBuilder) (obj)).append(", sessionStatus=");
		//  131  273:aload           4
		//  132  275:ldc1            #98  <String ", sessionStatus=">
		//  133  277:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
		//  134  280:pop             
						((StringBuilder) (obj)).append(((Object) (mediasessionstatus)));
		//  135  281:aload           4
		//  136  283:aload_3         
		//  137  284:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
		//  138  287:pop             
						Log.d("RemotePlaybackClient", ((StringBuilder) (obj)).toString());
		//  139  288:ldc1            #66  <String "RemotePlaybackClient">
		//  140  290:aload           4
		//  141  292:invokevirtual   #108 <Method String StringBuilder.toString()>
		//  142  295:invokestatic    #111 <Method int Log.d(String, String)>
		//  143  298:pop             
					}
					if(mStatusCallback != null)
		//* 144  299:aload_0         
		//* 145  300:getfield        #23  <Field RemotePlaybackClient this$0>
		//* 146  303:getfield        #115 <Field RemotePlaybackClient$StatusCallback RemotePlaybackClient.mStatusCallback>
		//* 147  306:ifnull          402
					{
						mStatusCallback.onSessionStatusChanged(intent.getExtras(), ((String) (context)), mediasessionstatus);
		//  148  309:aload_0         
		//  149  310:getfield        #23  <Field RemotePlaybackClient this$0>
		//  150  313:getfield        #115 <Field RemotePlaybackClient$StatusCallback RemotePlaybackClient.mStatusCallback>
		//  151  316:aload_2         
		//  152  317:invokevirtual   #119 <Method Bundle Intent.getExtras()>
		//  153  320:aload_1         
		//  154  321:aload_3         
		//  155  322:invokevirtual   #133 <Method void RemotePlaybackClient$StatusCallback.onSessionStatusChanged(Bundle, String, MediaSessionStatus)>
						return;
		//  156  325:return          
					}
				} else
				if(((String) (obj)).equals("android.support.v7.media.actions.ACTION_MESSAGE_RECEIVED"))
		//* 157  326:aload           4
		//* 158  328:ldc1            #14  <String "android.support.v7.media.actions.ACTION_MESSAGE_RECEIVED">
		//* 159  330:invokevirtual   #46  <Method boolean String.equals(Object)>
		//* 160  333:ifeq            402
				{
					if(RemotePlaybackClient.DEBUG)
		//* 161  336:getstatic       #87  <Field boolean RemotePlaybackClient.DEBUG>
		//* 162  339:ifeq            373
					{
						StringBuilder stringbuilder = new StringBuilder();
		//  163  342:new             #89  <Class StringBuilder>
		//  164  345:dup             
		//  165  346:invokespecial   #90  <Method void StringBuilder()>
		//  166  349:astore_3        
						stringbuilder.append("Received message callback: sessionId=");
		//  167  350:aload_3         
		//  168  351:ldc1            #135 <String "Received message callback: sessionId=">
		//  169  353:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
		//  170  356:pop             
						stringbuilder.append(((String) (context)));
		//  171  357:aload_3         
		//  172  358:aload_1         
		//  173  359:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
		//  174  362:pop             
						Log.d("RemotePlaybackClient", stringbuilder.toString());
		//  175  363:ldc1            #66  <String "RemotePlaybackClient">
		//  176  365:aload_3         
		//  177  366:invokevirtual   #108 <Method String StringBuilder.toString()>
		//  178  369:invokestatic    #111 <Method int Log.d(String, String)>
		//  179  372:pop             
					}
					if(mOnMessageReceivedListener != null)
		//* 180  373:aload_0         
		//* 181  374:getfield        #23  <Field RemotePlaybackClient this$0>
		//* 182  377:getfield        #139 <Field RemotePlaybackClient$OnMessageReceivedListener RemotePlaybackClient.mOnMessageReceivedListener>
		//* 183  380:ifnull          402
						mOnMessageReceivedListener.onMessageReceived(((String) (context)), intent.getBundleExtra("android.media.intent.extra.MESSAGE"));
		//  184  383:aload_0         
		//  185  384:getfield        #23  <Field RemotePlaybackClient this$0>
		//  186  387:getfield        #139 <Field RemotePlaybackClient$OnMessageReceivedListener RemotePlaybackClient.mOnMessageReceivedListener>
		//  187  390:aload_1         
		//  188  391:aload_2         
		//  189  392:ldc1            #141 <String "android.media.intent.extra.MESSAGE">
		//  190  394:invokevirtual   #52  <Method Bundle Intent.getBundleExtra(String)>
		//  191  397:invokeinterface #147 <Method void RemotePlaybackClient$OnMessageReceivedListener.onMessageReceived(String, Bundle)>
				}
				return;
		//  192  402:return          
			} else
			{
				intent = ((Intent) (new StringBuilder()));
		//  193  403:new             #89  <Class StringBuilder>
		//  194  406:dup             
		//  195  407:invokespecial   #90  <Method void StringBuilder()>
		//  196  410:astore_2        
				((StringBuilder) (intent)).append("Discarding spurious status callback with missing or invalid session id: sessionId=");
		//  197  411:aload_2         
		//  198  412:ldc1            #149 <String "Discarding spurious status callback with missing or invalid session id: sessionId=">
		//  199  414:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
		//  200  417:pop             
				((StringBuilder) (intent)).append(((String) (context)));
		//  201  418:aload_2         
		//  202  419:aload_1         
		//  203  420:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
		//  204  423:pop             
				Log.w("RemotePlaybackClient", ((StringBuilder) (intent)).toString());
		//  205  424:ldc1            #66  <String "RemotePlaybackClient">
		//  206  426:aload_2         
		//  207  427:invokevirtual   #108 <Method String StringBuilder.toString()>
		//  208  430:invokestatic    #74  <Method int Log.w(String, String)>
		//  209  433:pop             
				return;
		//  210  434:return          
			}
		}

		public static final String ACTION_ITEM_STATUS_CHANGED = "android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED";
		public static final String ACTION_MESSAGE_RECEIVED = "android.support.v7.media.actions.ACTION_MESSAGE_RECEIVED";
		public static final String ACTION_SESSION_STATUS_CHANGED = "android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED";
		final RemotePlaybackClient this$0;

		ActionReceiver()
		{
			this$0 = RemotePlaybackClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field RemotePlaybackClient this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #26  <Method void BroadcastReceiver()>
		//    5    9:return          
		}
	}

	public static abstract class ItemActionCallback extends ActionCallback
	{

		public void onResult(Bundle bundle, String s, MediaSessionStatus mediasessionstatus, String s1, MediaItemStatus mediaitemstatus)
		{
		//    0    0:return          
		}

		public ItemActionCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void RemotePlaybackClient$ActionCallback()>
		//    2    4:return          
		}
	}

	public static interface OnMessageReceivedListener
	{

		public abstract void onMessageReceived(String s, Bundle bundle);
	}

	public static abstract class SessionActionCallback extends ActionCallback
	{

		public void onResult(Bundle bundle, String s, MediaSessionStatus mediasessionstatus)
		{
		//    0    0:return          
		}

		public SessionActionCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void RemotePlaybackClient$ActionCallback()>
		//    2    4:return          
		}
	}

	public static abstract class StatusCallback
	{

		public void onItemStatusChanged(Bundle bundle, String s, MediaSessionStatus mediasessionstatus, String s1, MediaItemStatus mediaitemstatus)
		{
		//    0    0:return          
		}

		public void onSessionChanged(String s)
		{
		//    0    0:return          
		}

		public void onSessionStatusChanged(Bundle bundle, String s, MediaSessionStatus mediasessionstatus)
		{
		//    0    0:return          
		}

		public StatusCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public RemotePlaybackClient(Context context, MediaRouter.RouteInfo routeinfo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
		if(context == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("context must not be null");
	//    4    8:new             #68  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #70  <String "context must not be null">
	//    7   14:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		if(routeinfo == null)
	//*   9   18:aload_2         
	//*  10   19:ifnonnull       32
		{
			throw new IllegalArgumentException("route must not be null");
	//   11   22:new             #68  <Class IllegalArgumentException>
	//   12   25:dup             
	//   13   26:ldc1            #75  <String "route must not be null">
	//   14   28:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//   15   31:athrow          
		} else
		{
			mContext = context;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:putfield        #77  <Field Context mContext>
			mRoute = routeinfo;
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:putfield        #79  <Field MediaRouter$RouteInfo mRoute>
			routeinfo = ((MediaRouter.RouteInfo) (new IntentFilter()));
	//   22   42:new             #81  <Class IntentFilter>
	//   23   45:dup             
	//   24   46:invokespecial   #82  <Method void IntentFilter()>
	//   25   49:astore_2        
			((IntentFilter) (routeinfo)).addAction("android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED");
	//   26   50:aload_2         
	//   27   51:ldc1            #84  <String "android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED">
	//   28   53:invokevirtual   #87  <Method void IntentFilter.addAction(String)>
			((IntentFilter) (routeinfo)).addAction("android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED");
	//   29   56:aload_2         
	//   30   57:ldc1            #89  <String "android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED">
	//   31   59:invokevirtual   #87  <Method void IntentFilter.addAction(String)>
			((IntentFilter) (routeinfo)).addAction("android.support.v7.media.actions.ACTION_MESSAGE_RECEIVED");
	//   32   62:aload_2         
	//   33   63:ldc1            #91  <String "android.support.v7.media.actions.ACTION_MESSAGE_RECEIVED">
	//   34   65:invokevirtual   #87  <Method void IntentFilter.addAction(String)>
			mActionReceiver = new ActionReceiver();
	//   35   68:aload_0         
	//   36   69:new             #13  <Class RemotePlaybackClient$ActionReceiver>
	//   37   72:dup             
	//   38   73:aload_0         
	//   39   74:invokespecial   #94  <Method void RemotePlaybackClient$ActionReceiver(RemotePlaybackClient)>
	//   40   77:putfield        #96  <Field RemotePlaybackClient$ActionReceiver mActionReceiver>
			context.registerReceiver(((BroadcastReceiver) (mActionReceiver)), ((IntentFilter) (routeinfo)));
	//   41   80:aload_1         
	//   42   81:aload_0         
	//   43   82:getfield        #96  <Field RemotePlaybackClient$ActionReceiver mActionReceiver>
	//   44   85:aload_2         
	//   45   86:invokevirtual   #102 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   46   89:pop             
			routeinfo = ((MediaRouter.RouteInfo) (new Intent("android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED")));
	//   47   90:new             #104 <Class Intent>
	//   48   93:dup             
	//   49   94:ldc1            #84  <String "android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED">
	//   50   96:invokespecial   #105 <Method void Intent(String)>
	//   51   99:astore_2        
			((Intent) (routeinfo)).setPackage(context.getPackageName());
	//   52  100:aload_2         
	//   53  101:aload_1         
	//   54  102:invokevirtual   #109 <Method String Context.getPackageName()>
	//   55  105:invokevirtual   #113 <Method Intent Intent.setPackage(String)>
	//   56  108:pop             
			mItemStatusPendingIntent = PendingIntent.getBroadcast(context, 0, ((Intent) (routeinfo)), 0);
	//   57  109:aload_0         
	//   58  110:aload_1         
	//   59  111:iconst_0        
	//   60  112:aload_2         
	//   61  113:iconst_0        
	//   62  114:invokestatic    #119 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   63  117:putfield        #121 <Field PendingIntent mItemStatusPendingIntent>
			routeinfo = ((MediaRouter.RouteInfo) (new Intent("android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED")));
	//   64  120:new             #104 <Class Intent>
	//   65  123:dup             
	//   66  124:ldc1            #89  <String "android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED">
	//   67  126:invokespecial   #105 <Method void Intent(String)>
	//   68  129:astore_2        
			((Intent) (routeinfo)).setPackage(context.getPackageName());
	//   69  130:aload_2         
	//   70  131:aload_1         
	//   71  132:invokevirtual   #109 <Method String Context.getPackageName()>
	//   72  135:invokevirtual   #113 <Method Intent Intent.setPackage(String)>
	//   73  138:pop             
			mSessionStatusPendingIntent = PendingIntent.getBroadcast(context, 0, ((Intent) (routeinfo)), 0);
	//   74  139:aload_0         
	//   75  140:aload_1         
	//   76  141:iconst_0        
	//   77  142:aload_2         
	//   78  143:iconst_0        
	//   79  144:invokestatic    #119 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   80  147:putfield        #123 <Field PendingIntent mSessionStatusPendingIntent>
			routeinfo = ((MediaRouter.RouteInfo) (new Intent("android.support.v7.media.actions.ACTION_MESSAGE_RECEIVED")));
	//   81  150:new             #104 <Class Intent>
	//   82  153:dup             
	//   83  154:ldc1            #91  <String "android.support.v7.media.actions.ACTION_MESSAGE_RECEIVED">
	//   84  156:invokespecial   #105 <Method void Intent(String)>
	//   85  159:astore_2        
			((Intent) (routeinfo)).setPackage(context.getPackageName());
	//   86  160:aload_2         
	//   87  161:aload_1         
	//   88  162:invokevirtual   #109 <Method String Context.getPackageName()>
	//   89  165:invokevirtual   #113 <Method Intent Intent.setPackage(String)>
	//   90  168:pop             
			mMessagePendingIntent = PendingIntent.getBroadcast(context, 0, ((Intent) (routeinfo)), 0);
	//   91  169:aload_0         
	//   92  170:aload_1         
	//   93  171:iconst_0        
	//   94  172:aload_2         
	//   95  173:iconst_0        
	//   96  174:invokestatic    #119 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   97  177:putfield        #125 <Field PendingIntent mMessagePendingIntent>
			detectFeatures();
	//   98  180:aload_0         
	//   99  181:invokespecial   #128 <Method void detectFeatures()>
			return;
	//  100  184:return          
		}
	}

	static String bundleToString(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
		{
			bundle.size();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #136 <Method int Bundle.size()>
	//    4    8:pop             
			return bundle.toString();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #139 <Method String Bundle.toString()>
	//    7   13:areturn         
		} else
		{
			return "null";
	//    8   14:ldc1            #141 <String "null">
	//    9   16:areturn         
		}
	}

	private void detectFeatures()
	{
		boolean flag = routeSupportsAction("android.media.intent.action.PLAY");
	//    0    0:aload_0         
	//    1    1:ldc1            #143 <String "android.media.intent.action.PLAY">
	//    2    3:invokespecial   #147 <Method boolean routeSupportsAction(String)>
	//    3    6:istore_1        
		boolean flag1 = false;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		if(flag && routeSupportsAction("android.media.intent.action.SEEK") && routeSupportsAction("android.media.intent.action.GET_STATUS") && routeSupportsAction("android.media.intent.action.PAUSE") && routeSupportsAction("android.media.intent.action.RESUME") && routeSupportsAction("android.media.intent.action.STOP"))
	//*   6    9:iload_1         
	//*   7   10:ifeq            63
	//*   8   13:aload_0         
	//*   9   14:ldc1            #149 <String "android.media.intent.action.SEEK">
	//*  10   16:invokespecial   #147 <Method boolean routeSupportsAction(String)>
	//*  11   19:ifeq            63
	//*  12   22:aload_0         
	//*  13   23:ldc1            #151 <String "android.media.intent.action.GET_STATUS">
	//*  14   25:invokespecial   #147 <Method boolean routeSupportsAction(String)>
	//*  15   28:ifeq            63
	//*  16   31:aload_0         
	//*  17   32:ldc1            #153 <String "android.media.intent.action.PAUSE">
	//*  18   34:invokespecial   #147 <Method boolean routeSupportsAction(String)>
	//*  19   37:ifeq            63
	//*  20   40:aload_0         
	//*  21   41:ldc1            #155 <String "android.media.intent.action.RESUME">
	//*  22   43:invokespecial   #147 <Method boolean routeSupportsAction(String)>
	//*  23   46:ifeq            63
	//*  24   49:aload_0         
	//*  25   50:ldc1            #157 <String "android.media.intent.action.STOP">
	//*  26   52:invokespecial   #147 <Method boolean routeSupportsAction(String)>
	//*  27   55:ifeq            63
			flag = true;
	//   28   58:iconst_1        
	//   29   59:istore_1        
		else
	//*  30   60:goto            65
			flag = false;
	//   31   63:iconst_0        
	//   32   64:istore_1        
		mRouteSupportsRemotePlayback = flag;
	//   33   65:aload_0         
	//   34   66:iload_1         
	//   35   67:putfield        #159 <Field boolean mRouteSupportsRemotePlayback>
		if(mRouteSupportsRemotePlayback && routeSupportsAction("android.media.intent.action.ENQUEUE") && routeSupportsAction("android.media.intent.action.REMOVE"))
	//*  36   70:aload_0         
	//*  37   71:getfield        #159 <Field boolean mRouteSupportsRemotePlayback>
	//*  38   74:ifeq            100
	//*  39   77:aload_0         
	//*  40   78:ldc1            #161 <String "android.media.intent.action.ENQUEUE">
	//*  41   80:invokespecial   #147 <Method boolean routeSupportsAction(String)>
	//*  42   83:ifeq            100
	//*  43   86:aload_0         
	//*  44   87:ldc1            #163 <String "android.media.intent.action.REMOVE">
	//*  45   89:invokespecial   #147 <Method boolean routeSupportsAction(String)>
	//*  46   92:ifeq            100
			flag = true;
	//   47   95:iconst_1        
	//   48   96:istore_1        
		else
	//*  49   97:goto            102
			flag = false;
	//   50  100:iconst_0        
	//   51  101:istore_1        
		mRouteSupportsQueuing = flag;
	//   52  102:aload_0         
	//   53  103:iload_1         
	//   54  104:putfield        #165 <Field boolean mRouteSupportsQueuing>
		flag = flag1;
	//   55  107:iload_2         
	//   56  108:istore_1        
		if(mRouteSupportsRemotePlayback)
	//*  57  109:aload_0         
	//*  58  110:getfield        #159 <Field boolean mRouteSupportsRemotePlayback>
	//*  59  113:ifeq            151
		{
			flag = flag1;
	//   60  116:iload_2         
	//   61  117:istore_1        
			if(routeSupportsAction("android.media.intent.action.START_SESSION"))
	//*  62  118:aload_0         
	//*  63  119:ldc1            #167 <String "android.media.intent.action.START_SESSION">
	//*  64  121:invokespecial   #147 <Method boolean routeSupportsAction(String)>
	//*  65  124:ifeq            151
			{
				flag = flag1;
	//   66  127:iload_2         
	//   67  128:istore_1        
				if(routeSupportsAction("android.media.intent.action.GET_SESSION_STATUS"))
	//*  68  129:aload_0         
	//*  69  130:ldc1            #169 <String "android.media.intent.action.GET_SESSION_STATUS">
	//*  70  132:invokespecial   #147 <Method boolean routeSupportsAction(String)>
	//*  71  135:ifeq            151
				{
					flag = flag1;
	//   72  138:iload_2         
	//   73  139:istore_1        
					if(routeSupportsAction("android.media.intent.action.END_SESSION"))
	//*  74  140:aload_0         
	//*  75  141:ldc1            #171 <String "android.media.intent.action.END_SESSION">
	//*  76  143:invokespecial   #147 <Method boolean routeSupportsAction(String)>
	//*  77  146:ifeq            151
						flag = true;
	//   78  149:iconst_1        
	//   79  150:istore_1        
				}
			}
		}
		mRouteSupportsSessionManagement = flag;
	//   80  151:aload_0         
	//   81  152:iload_1         
	//   82  153:putfield        #173 <Field boolean mRouteSupportsSessionManagement>
		mRouteSupportsMessaging = doesRouteSupportMessaging();
	//   83  156:aload_0         
	//   84  157:aload_0         
	//   85  158:invokespecial   #177 <Method boolean doesRouteSupportMessaging()>
	//   86  161:putfield        #179 <Field boolean mRouteSupportsMessaging>
	//   87  164:return          
	}

	private boolean doesRouteSupportMessaging()
	{
		for(Iterator iterator = mRoute.getControlFilters().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field MediaRouter$RouteInfo mRoute>
	//*   2    4:invokevirtual   #185 <Method List MediaRouter$RouteInfo.getControlFilters()>
	//*   3    7:invokeinterface #191 <Method Iterator List.iterator()>
	//*   4   12:astore_1        
	//*   5   13:aload_1         
	//*   6   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            41
			if(((IntentFilter)iterator.next()).hasAction("android.media.intent.action.SEND_MESSAGE"))
	//*   8   22:aload_1         
	//*   9   23:invokeinterface #200 <Method Object Iterator.next()>
	//*  10   28:checkcast       #81  <Class IntentFilter>
	//*  11   31:ldc1            #202 <String "android.media.intent.action.SEND_MESSAGE">
	//*  12   33:invokevirtual   #205 <Method boolean IntentFilter.hasAction(String)>
	//*  13   36:ifeq            13
				return true;
	//   14   39:iconst_1        
	//   15   40:ireturn         

		return false;
	//   16   41:iconst_0        
	//   17   42:ireturn         
	}

	static String inferMissingResult(String s, String s1)
	{
		if(s1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return s;
	//    2    4:aload_0         
	//    3    5:areturn         
		if(s != null)
	//*   4    6:aload_0         
	//*   5    7:ifnull          22
		{
			if(s.equals(((Object) (s1))))
	//*   6   10:aload_0         
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #213 <Method boolean String.equals(Object)>
	//*   9   15:ifeq            20
				return s1;
	//   10   18:aload_1         
	//   11   19:areturn         
			else
				return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
		} else
		{
			return s1;
	//   14   22:aload_1         
	//   15   23:areturn         
		}
	}

	private static void logRequest(Intent intent)
	{
		if(DEBUG)
	//*   0    0:getstatic       #61  <Field boolean DEBUG>
	//*   1    3:ifeq            37
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #217 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #218 <Method void StringBuilder()>
	//    5   13:astore_1        
			stringbuilder.append("Sending request: ");
	//    6   14:aload_1         
	//    7   15:ldc1            #220 <String "Sending request: ">
	//    8   17:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			stringbuilder.append(((Object) (intent)));
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:invokevirtual   #227 <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:pop             
			Log.d("RemotePlaybackClient", stringbuilder.toString());
	//   14   27:ldc1            #32  <String "RemotePlaybackClient">
	//   15   29:aload_1         
	//   16   30:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #232 <Method int Log.d(String, String)>
	//   18   36:pop             
		}
	//   19   37:return          
	}

	private void performItemAction(final Intent intent, final String sessionId, final String itemId, Bundle bundle, final ItemActionCallback callback)
	{
		intent.addCategory("android.media.intent.category.REMOTE_PLAYBACK");
	//    0    0:aload_1         
	//    1    1:ldc1            #236 <String "android.media.intent.category.REMOTE_PLAYBACK">
	//    2    3:invokevirtual   #239 <Method Intent Intent.addCategory(String)>
	//    3    6:pop             
		if(sessionId != null)
	//*   4    7:aload_2         
	//*   5    8:ifnull          19
			intent.putExtra("android.media.intent.extra.SESSION_ID", sessionId);
	//    6   11:aload_1         
	//    7   12:ldc1            #241 <String "android.media.intent.extra.SESSION_ID">
	//    8   14:aload_2         
	//    9   15:invokevirtual   #245 <Method Intent Intent.putExtra(String, String)>
	//   10   18:pop             
		if(itemId != null)
	//*  11   19:aload_3         
	//*  12   20:ifnull          31
			intent.putExtra("android.media.intent.extra.ITEM_ID", itemId);
	//   13   23:aload_1         
	//   14   24:ldc1            #247 <String "android.media.intent.extra.ITEM_ID">
	//   15   26:aload_3         
	//   16   27:invokevirtual   #245 <Method Intent Intent.putExtra(String, String)>
	//   17   30:pop             
		if(bundle != null)
	//*  18   31:aload           4
	//*  19   33:ifnull          43
			intent.putExtras(bundle);
	//   20   36:aload_1         
	//   21   37:aload           4
	//   22   39:invokevirtual   #251 <Method Intent Intent.putExtras(Bundle)>
	//   23   42:pop             
		logRequest(intent);
	//   24   43:aload_1         
	//   25   44:invokestatic    #253 <Method void logRequest(Intent)>
		mRoute.sendControlRequest(intent, ((MediaRouter.ControlRequestCallback) (new MediaRouter.ControlRequestCallback() {

			public void onError(String s, Bundle bundle1)
			{
				handleError(intent, ((ActionCallback) (callback)), s, bundle1);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field RemotePlaybackClient this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #28  <Field Intent val$intent>
			//    4    8:aload_0         
			//    5    9:getfield        #30  <Field RemotePlaybackClient$ItemActionCallback val$callback>
			//    6   12:aload_1         
			//    7   13:aload_2         
			//    8   14:invokevirtual   #40  <Method void RemotePlaybackClient.handleError(Intent, RemotePlaybackClient$ActionCallback, String, Bundle)>
			//    9   17:return          
			}

			public void onResult(Bundle bundle1)
			{
				if(bundle1 != null)
			//*   0    0:aload_1         
			//*   1    1:ifnull          218
				{
					String s = RemotePlaybackClient.inferMissingResult(sessionId, bundle1.getString("android.media.intent.extra.SESSION_ID"));
			//    2    4:aload_0         
			//    3    5:getfield        #24  <Field String val$sessionId>
			//    4    8:aload_1         
			//    5    9:ldc1            #44  <String "android.media.intent.extra.SESSION_ID">
			//    6   11:invokevirtual   #50  <Method String Bundle.getString(String)>
			//    7   14:invokestatic    #54  <Method String RemotePlaybackClient.inferMissingResult(String, String)>
			//    8   17:astore_2        
					MediaSessionStatus mediasessionstatus = MediaSessionStatus.fromBundle(bundle1.getBundle("android.media.intent.extra.SESSION_STATUS"));
			//    9   18:aload_1         
			//   10   19:ldc1            #56  <String "android.media.intent.extra.SESSION_STATUS">
			//   11   21:invokevirtual   #60  <Method Bundle Bundle.getBundle(String)>
			//   12   24:invokestatic    #66  <Method MediaSessionStatus MediaSessionStatus.fromBundle(Bundle)>
			//   13   27:astore_3        
					String s1 = RemotePlaybackClient.inferMissingResult(itemId, bundle1.getString("android.media.intent.extra.ITEM_ID"));
			//   14   28:aload_0         
			//   15   29:getfield        #26  <Field String val$itemId>
			//   16   32:aload_1         
			//   17   33:ldc1            #68  <String "android.media.intent.extra.ITEM_ID">
			//   18   35:invokevirtual   #50  <Method String Bundle.getString(String)>
			//   19   38:invokestatic    #54  <Method String RemotePlaybackClient.inferMissingResult(String, String)>
			//   20   41:astore          4
					MediaItemStatus mediaitemstatus = MediaItemStatus.fromBundle(bundle1.getBundle("android.media.intent.extra.ITEM_STATUS"));
			//   21   43:aload_1         
			//   22   44:ldc1            #70  <String "android.media.intent.extra.ITEM_STATUS">
			//   23   46:invokevirtual   #60  <Method Bundle Bundle.getBundle(String)>
			//   24   49:invokestatic    #75  <Method MediaItemStatus MediaItemStatus.fromBundle(Bundle)>
			//   25   52:astore          5
					adoptSession(s);
			//   26   54:aload_0         
			//   27   55:getfield        #22  <Field RemotePlaybackClient this$0>
			//   28   58:aload_2         
			//   29   59:invokevirtual   #79  <Method void RemotePlaybackClient.adoptSession(String)>
					if(s != null && s1 != null && mediaitemstatus != null)
			//*  30   62:aload_2         
			//*  31   63:ifnull          218
			//*  32   66:aload           4
			//*  33   68:ifnull          218
			//*  34   71:aload           5
			//*  35   73:ifnull          218
					{
						if(RemotePlaybackClient.DEBUG)
			//*  36   76:getstatic       #83  <Field boolean RemotePlaybackClient.DEBUG>
			//*  37   79:ifeq            203
						{
							StringBuilder stringbuilder = new StringBuilder();
			//   38   82:new             #85  <Class StringBuilder>
			//   39   85:dup             
			//   40   86:invokespecial   #86  <Method void StringBuilder()>
			//   41   89:astore          6
							stringbuilder.append("Received result from ");
			//   42   91:aload           6
			//   43   93:ldc1            #88  <String "Received result from ">
			//   44   95:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
			//   45   98:pop             
							stringbuilder.append(intent.getAction());
			//   46   99:aload           6
			//   47  101:aload_0         
			//   48  102:getfield        #28  <Field Intent val$intent>
			//   49  105:invokevirtual   #98  <Method String Intent.getAction()>
			//   50  108:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
			//   51  111:pop             
							stringbuilder.append(": data=");
			//   52  112:aload           6
			//   53  114:ldc1            #100 <String ": data=">
			//   54  116:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
			//   55  119:pop             
							stringbuilder.append(RemotePlaybackClient.bundleToString(bundle1));
			//   56  120:aload           6
			//   57  122:aload_1         
			//   58  123:invokestatic    #104 <Method String RemotePlaybackClient.bundleToString(Bundle)>
			//   59  126:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
			//   60  129:pop             
							stringbuilder.append(", sessionId=");
			//   61  130:aload           6
			//   62  132:ldc1            #106 <String ", sessionId=">
			//   63  134:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
			//   64  137:pop             
							stringbuilder.append(s);
			//   65  138:aload           6
			//   66  140:aload_2         
			//   67  141:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
			//   68  144:pop             
							stringbuilder.append(", sessionStatus=");
			//   69  145:aload           6
			//   70  147:ldc1            #108 <String ", sessionStatus=">
			//   71  149:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
			//   72  152:pop             
							stringbuilder.append(((Object) (mediasessionstatus)));
			//   73  153:aload           6
			//   74  155:aload_3         
			//   75  156:invokevirtual   #111 <Method StringBuilder StringBuilder.append(Object)>
			//   76  159:pop             
							stringbuilder.append(", itemId=");
			//   77  160:aload           6
			//   78  162:ldc1            #113 <String ", itemId=">
			//   79  164:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
			//   80  167:pop             
							stringbuilder.append(s1);
			//   81  168:aload           6
			//   82  170:aload           4
			//   83  172:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
			//   84  175:pop             
							stringbuilder.append(", itemStatus=");
			//   85  176:aload           6
			//   86  178:ldc1            #115 <String ", itemStatus=">
			//   87  180:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
			//   88  183:pop             
							stringbuilder.append(((Object) (mediaitemstatus)));
			//   89  184:aload           6
			//   90  186:aload           5
			//   91  188:invokevirtual   #111 <Method StringBuilder StringBuilder.append(Object)>
			//   92  191:pop             
							Log.d("RemotePlaybackClient", stringbuilder.toString());
			//   93  192:ldc1            #117 <String "RemotePlaybackClient">
			//   94  194:aload           6
			//   95  196:invokevirtual   #120 <Method String StringBuilder.toString()>
			//   96  199:invokestatic    #126 <Method int Log.d(String, String)>
			//   97  202:pop             
						}
						callback.onResult(bundle1, s, mediasessionstatus, s1, mediaitemstatus);
			//   98  203:aload_0         
			//   99  204:getfield        #30  <Field RemotePlaybackClient$ItemActionCallback val$callback>
			//  100  207:aload_1         
			//  101  208:aload_2         
			//  102  209:aload_3         
			//  103  210:aload           4
			//  104  212:aload           5
			//  105  214:invokevirtual   #131 <Method void RemotePlaybackClient$ItemActionCallback.onResult(Bundle, String, MediaSessionStatus, String, MediaItemStatus)>
						return;
			//  106  217:return          
					}
				}
				handleInvalidResult(intent, ((ActionCallback) (callback)), bundle1);
			//  107  218:aload_0         
			//  108  219:getfield        #22  <Field RemotePlaybackClient this$0>
			//  109  222:aload_0         
			//  110  223:getfield        #28  <Field Intent val$intent>
			//  111  226:aload_0         
			//  112  227:getfield        #30  <Field RemotePlaybackClient$ItemActionCallback val$callback>
			//  113  230:aload_1         
			//  114  231:invokevirtual   #135 <Method void RemotePlaybackClient.handleInvalidResult(Intent, RemotePlaybackClient$ActionCallback, Bundle)>
			//  115  234:return          
			}

			final RemotePlaybackClient this$0;
			final ItemActionCallback val$callback;
			final Intent val$intent;
			final String val$itemId;
			final String val$sessionId;

			
			{
				this$0 = RemotePlaybackClient.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field RemotePlaybackClient this$0>
				sessionId = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field String val$sessionId>
				itemId = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field String val$itemId>
				intent = intent1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field Intent val$intent>
				callback = itemactioncallback;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #30  <Field RemotePlaybackClient$ItemActionCallback val$callback>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #33  <Method void MediaRouter$ControlRequestCallback()>
			//   17   31:return          
			}
		}
)));
	//   26   47:aload_0         
	//   27   48:getfield        #79  <Field MediaRouter$RouteInfo mRoute>
	//   28   51:aload_1         
	//   29   52:new             #6   <Class RemotePlaybackClient$1>
	//   30   55:dup             
	//   31   56:aload_0         
	//   32   57:aload_2         
	//   33   58:aload_3         
	//   34   59:aload_1         
	//   35   60:aload           5
	//   36   62:invokespecial   #256 <Method void RemotePlaybackClient$1(RemotePlaybackClient, String, String, Intent, RemotePlaybackClient$ItemActionCallback)>
	//   37   65:invokevirtual   #260 <Method void MediaRouter$RouteInfo.sendControlRequest(Intent, MediaRouter$ControlRequestCallback)>
	//   38   68:return          
	}

	private void performSessionAction(final Intent intent, final String sessionId, Bundle bundle, final SessionActionCallback callback)
	{
		intent.addCategory("android.media.intent.category.REMOTE_PLAYBACK");
	//    0    0:aload_1         
	//    1    1:ldc1            #236 <String "android.media.intent.category.REMOTE_PLAYBACK">
	//    2    3:invokevirtual   #239 <Method Intent Intent.addCategory(String)>
	//    3    6:pop             
		if(sessionId != null)
	//*   4    7:aload_2         
	//*   5    8:ifnull          19
			intent.putExtra("android.media.intent.extra.SESSION_ID", sessionId);
	//    6   11:aload_1         
	//    7   12:ldc1            #241 <String "android.media.intent.extra.SESSION_ID">
	//    8   14:aload_2         
	//    9   15:invokevirtual   #245 <Method Intent Intent.putExtra(String, String)>
	//   10   18:pop             
		if(bundle != null)
	//*  11   19:aload_3         
	//*  12   20:ifnull          29
			intent.putExtras(bundle);
	//   13   23:aload_1         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #251 <Method Intent Intent.putExtras(Bundle)>
	//   16   28:pop             
		logRequest(intent);
	//   17   29:aload_1         
	//   18   30:invokestatic    #253 <Method void logRequest(Intent)>
		mRoute.sendControlRequest(intent, ((MediaRouter.ControlRequestCallback) (new MediaRouter.ControlRequestCallback() {

			public void onError(String s, Bundle bundle1)
			{
				handleError(intent, ((ActionCallback) (callback)), s, bundle1);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field RemotePlaybackClient this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #25  <Field Intent val$intent>
			//    4    8:aload_0         
			//    5    9:getfield        #27  <Field RemotePlaybackClient$SessionActionCallback val$callback>
			//    6   12:aload_1         
			//    7   13:aload_2         
			//    8   14:invokevirtual   #37  <Method void RemotePlaybackClient.handleError(Intent, RemotePlaybackClient$ActionCallback, String, Bundle)>
			//    9   17:return          
			}

			public void onResult(Bundle bundle1)
			{
				String s;
				MediaSessionStatus mediasessionstatus;
				if(bundle1 == null)
					break MISSING_BLOCK_LABEL_223;
			//    0    0:aload_1         
			//    1    1:ifnull          223
				s = RemotePlaybackClient.inferMissingResult(sessionId, bundle1.getString("android.media.intent.extra.SESSION_ID"));
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field String val$sessionId>
			//    4    8:aload_1         
			//    5    9:ldc1            #41  <String "android.media.intent.extra.SESSION_ID">
			//    6   11:invokevirtual   #47  <Method String Bundle.getString(String)>
			//    7   14:invokestatic    #51  <Method String RemotePlaybackClient.inferMissingResult(String, String)>
			//    8   17:astore_2        
				mediasessionstatus = MediaSessionStatus.fromBundle(bundle1.getBundle("android.media.intent.extra.SESSION_STATUS"));
			//    9   18:aload_1         
			//   10   19:ldc1            #53  <String "android.media.intent.extra.SESSION_STATUS">
			//   11   21:invokevirtual   #57  <Method Bundle Bundle.getBundle(String)>
			//   12   24:invokestatic    #63  <Method MediaSessionStatus MediaSessionStatus.fromBundle(Bundle)>
			//   13   27:astore_3        
				adoptSession(s);
			//   14   28:aload_0         
			//   15   29:getfield        #21  <Field RemotePlaybackClient this$0>
			//   16   32:aload_2         
			//   17   33:invokevirtual   #67  <Method void RemotePlaybackClient.adoptSession(String)>
				if(s == null)
					break MISSING_BLOCK_LABEL_223;
			//   18   36:aload_2         
			//   19   37:ifnull          223
				if(RemotePlaybackClient.DEBUG)
			//*  20   40:getstatic       #71  <Field boolean RemotePlaybackClient.DEBUG>
			//*  21   43:ifeq            135
				{
					StringBuilder stringbuilder = new StringBuilder();
			//   22   46:new             #73  <Class StringBuilder>
			//   23   49:dup             
			//   24   50:invokespecial   #74  <Method void StringBuilder()>
			//   25   53:astore          4
					stringbuilder.append("Received result from ");
			//   26   55:aload           4
			//   27   57:ldc1            #76  <String "Received result from ">
			//   28   59:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   29   62:pop             
					stringbuilder.append(intent.getAction());
			//   30   63:aload           4
			//   31   65:aload_0         
			//   32   66:getfield        #25  <Field Intent val$intent>
			//   33   69:invokevirtual   #86  <Method String Intent.getAction()>
			//   34   72:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   35   75:pop             
					stringbuilder.append(": data=");
			//   36   76:aload           4
			//   37   78:ldc1            #88  <String ": data=">
			//   38   80:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   39   83:pop             
					stringbuilder.append(RemotePlaybackClient.bundleToString(bundle1));
			//   40   84:aload           4
			//   41   86:aload_1         
			//   42   87:invokestatic    #92  <Method String RemotePlaybackClient.bundleToString(Bundle)>
			//   43   90:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   44   93:pop             
					stringbuilder.append(", sessionId=");
			//   45   94:aload           4
			//   46   96:ldc1            #94  <String ", sessionId=">
			//   47   98:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   48  101:pop             
					stringbuilder.append(s);
			//   49  102:aload           4
			//   50  104:aload_2         
			//   51  105:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   52  108:pop             
					stringbuilder.append(", sessionStatus=");
			//   53  109:aload           4
			//   54  111:ldc1            #96  <String ", sessionStatus=">
			//   55  113:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   56  116:pop             
					stringbuilder.append(((Object) (mediasessionstatus)));
			//   57  117:aload           4
			//   58  119:aload_3         
			//   59  120:invokevirtual   #99  <Method StringBuilder StringBuilder.append(Object)>
			//   60  123:pop             
					Log.d("RemotePlaybackClient", stringbuilder.toString());
			//   61  124:ldc1            #101 <String "RemotePlaybackClient">
			//   62  126:aload           4
			//   63  128:invokevirtual   #104 <Method String StringBuilder.toString()>
			//   64  131:invokestatic    #110 <Method int Log.d(String, String)>
			//   65  134:pop             
				}
				callback.onResult(bundle1, s, mediasessionstatus);
			//   66  135:aload_0         
			//   67  136:getfield        #27  <Field RemotePlaybackClient$SessionActionCallback val$callback>
			//   68  139:aload_1         
			//   69  140:aload_2         
			//   70  141:aload_3         
			//   71  142:invokevirtual   #115 <Method void RemotePlaybackClient$SessionActionCallback.onResult(Bundle, String, MediaSessionStatus)>
				if(intent.getAction().equals("android.media.intent.action.END_SESSION") && s.equals(((Object) (mSessionId))))
			//*  72  145:aload_0         
			//*  73  146:getfield        #25  <Field Intent val$intent>
			//*  74  149:invokevirtual   #86  <Method String Intent.getAction()>
			//*  75  152:ldc1            #117 <String "android.media.intent.action.END_SESSION">
			//*  76  154:invokevirtual   #123 <Method boolean String.equals(Object)>
			//*  77  157:ifeq            182
			//*  78  160:aload_2         
			//*  79  161:aload_0         
			//*  80  162:getfield        #21  <Field RemotePlaybackClient this$0>
			//*  81  165:getfield        #126 <Field String RemotePlaybackClient.mSessionId>
			//*  82  168:invokevirtual   #123 <Method boolean String.equals(Object)>
			//*  83  171:ifeq            182
					setSessionId(((String) (null)));
			//   84  174:aload_0         
			//   85  175:getfield        #21  <Field RemotePlaybackClient this$0>
			//   86  178:aconst_null     
			//   87  179:invokevirtual   #129 <Method void RemotePlaybackClient.setSessionId(String)>
				return;
			//   88  182:return          
				bundle1;
			//   89  183:astore_1        
				if(intent.getAction().equals("android.media.intent.action.END_SESSION") && s.equals(((Object) (mSessionId))))
			//*  90  184:aload_0         
			//*  91  185:getfield        #25  <Field Intent val$intent>
			//*  92  188:invokevirtual   #86  <Method String Intent.getAction()>
			//*  93  191:ldc1            #117 <String "android.media.intent.action.END_SESSION">
			//*  94  193:invokevirtual   #123 <Method boolean String.equals(Object)>
			//*  95  196:ifeq            221
			//*  96  199:aload_2         
			//*  97  200:aload_0         
			//*  98  201:getfield        #21  <Field RemotePlaybackClient this$0>
			//*  99  204:getfield        #126 <Field String RemotePlaybackClient.mSessionId>
			//* 100  207:invokevirtual   #123 <Method boolean String.equals(Object)>
			//* 101  210:ifeq            221
					setSessionId(((String) (null)));
			//  102  213:aload_0         
			//  103  214:getfield        #21  <Field RemotePlaybackClient this$0>
			//  104  217:aconst_null     
			//  105  218:invokevirtual   #129 <Method void RemotePlaybackClient.setSessionId(String)>
				throw bundle1;
			//  106  221:aload_1         
			//  107  222:athrow          
				handleInvalidResult(intent, ((ActionCallback) (callback)), bundle1);
			//  108  223:aload_0         
			//  109  224:getfield        #21  <Field RemotePlaybackClient this$0>
			//  110  227:aload_0         
			//  111  228:getfield        #25  <Field Intent val$intent>
			//  112  231:aload_0         
			//  113  232:getfield        #27  <Field RemotePlaybackClient$SessionActionCallback val$callback>
			//  114  235:aload_1         
			//  115  236:invokevirtual   #133 <Method void RemotePlaybackClient.handleInvalidResult(Intent, RemotePlaybackClient$ActionCallback, Bundle)>
				return;
			//  116  239:return          
			}

			final RemotePlaybackClient this$0;
			final SessionActionCallback val$callback;
			final Intent val$intent;
			final String val$sessionId;

			
			{
				this$0 = RemotePlaybackClient.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field RemotePlaybackClient this$0>
				sessionId = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String val$sessionId>
				intent = intent1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Intent val$intent>
				callback = sessionactioncallback;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #27  <Field RemotePlaybackClient$SessionActionCallback val$callback>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void MediaRouter$ControlRequestCallback()>
			//   14   25:return          
			}
		}
)));
	//   19   33:aload_0         
	//   20   34:getfield        #79  <Field MediaRouter$RouteInfo mRoute>
	//   21   37:aload_1         
	//   22   38:new             #8   <Class RemotePlaybackClient$2>
	//   23   41:dup             
	//   24   42:aload_0         
	//   25   43:aload_2         
	//   26   44:aload_1         
	//   27   45:aload           4
	//   28   47:invokespecial   #265 <Method void RemotePlaybackClient$2(RemotePlaybackClient, String, Intent, RemotePlaybackClient$SessionActionCallback)>
	//   29   50:invokevirtual   #260 <Method void MediaRouter$RouteInfo.sendControlRequest(Intent, MediaRouter$ControlRequestCallback)>
	//   30   53:return          
	}

	private void playOrEnqueue(Uri uri, String s, Bundle bundle, long l, Bundle bundle1, ItemActionCallback itemactioncallback, 
			String s1)
	{
		if(uri == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("contentUri must not be null");
	//    2    4:new             #68  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #269 <String "contentUri must not be null">
	//    5   11:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		throwIfRemotePlaybackNotSupported();
	//    7   15:aload_0         
	//    8   16:invokespecial   #272 <Method void throwIfRemotePlaybackNotSupported()>
		if(s1.equals("android.media.intent.action.ENQUEUE"))
	//*   9   19:aload           8
	//*  10   21:ldc1            #161 <String "android.media.intent.action.ENQUEUE">
	//*  11   23:invokevirtual   #213 <Method boolean String.equals(Object)>
	//*  12   26:ifeq            33
			throwIfQueuingNotSupported();
	//   13   29:aload_0         
	//   14   30:invokespecial   #275 <Method void throwIfQueuingNotSupported()>
		s1 = ((String) (new Intent(s1)));
	//   15   33:new             #104 <Class Intent>
	//   16   36:dup             
	//   17   37:aload           8
	//   18   39:invokespecial   #105 <Method void Intent(String)>
	//   19   42:astore          8
		((Intent) (s1)).setDataAndType(uri, s);
	//   20   44:aload           8
	//   21   46:aload_1         
	//   22   47:aload_2         
	//   23   48:invokevirtual   #279 <Method Intent Intent.setDataAndType(Uri, String)>
	//   24   51:pop             
		((Intent) (s1)).putExtra("android.media.intent.extra.ITEM_STATUS_UPDATE_RECEIVER", ((android.os.Parcelable) (mItemStatusPendingIntent)));
	//   25   52:aload           8
	//   26   54:ldc2            #281 <String "android.media.intent.extra.ITEM_STATUS_UPDATE_RECEIVER">
	//   27   57:aload_0         
	//   28   58:getfield        #121 <Field PendingIntent mItemStatusPendingIntent>
	//   29   61:invokevirtual   #284 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   30   64:pop             
		if(bundle != null)
	//*  31   65:aload_3         
	//*  32   66:ifnull          79
			((Intent) (s1)).putExtra("android.media.intent.extra.ITEM_METADATA", bundle);
	//   33   69:aload           8
	//   34   71:ldc2            #286 <String "android.media.intent.extra.ITEM_METADATA">
	//   35   74:aload_3         
	//   36   75:invokevirtual   #289 <Method Intent Intent.putExtra(String, Bundle)>
	//   37   78:pop             
		if(l != 0L)
	//*  38   79:lload           4
	//*  39   81:lconst_0        
	//*  40   82:lcmp            
	//*  41   83:ifeq            97
			((Intent) (s1)).putExtra("android.media.intent.extra.ITEM_POSITION", l);
	//   42   86:aload           8
	//   43   88:ldc2            #291 <String "android.media.intent.extra.ITEM_POSITION">
	//   44   91:lload           4
	//   45   93:invokevirtual   #294 <Method Intent Intent.putExtra(String, long)>
	//   46   96:pop             
		performItemAction(((Intent) (s1)), mSessionId, ((String) (null)), bundle1, itemactioncallback);
	//   47   97:aload_0         
	//   48   98:aload           8
	//   49  100:aload_0         
	//   50  101:getfield        #296 <Field String mSessionId>
	//   51  104:aconst_null     
	//   52  105:aload           6
	//   53  107:aload           7
	//   54  109:invokespecial   #298 <Method void performItemAction(Intent, String, String, Bundle, RemotePlaybackClient$ItemActionCallback)>
	//   55  112:return          
	}

	private boolean routeSupportsAction(String s)
	{
		return mRoute.supportsControlAction("android.media.intent.category.REMOTE_PLAYBACK", s);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field MediaRouter$RouteInfo mRoute>
	//    2    4:ldc1            #236 <String "android.media.intent.category.REMOTE_PLAYBACK">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #302 <Method boolean MediaRouter$RouteInfo.supportsControlAction(String, String)>
	//    5   10:ireturn         
	}

	private void throwIfMessageNotSupported()
	{
		if(!mRouteSupportsMessaging)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field boolean mRouteSupportsMessaging>
	//*   2    4:ifne            18
			throw new UnsupportedOperationException("The route does not support message.");
	//    3    7:new             #305 <Class UnsupportedOperationException>
	//    4   10:dup             
	//    5   11:ldc2            #307 <String "The route does not support message.">
	//    6   14:invokespecial   #308 <Method void UnsupportedOperationException(String)>
	//    7   17:athrow          
		else
			return;
	//    8   18:return          
	}

	private void throwIfNoCurrentSession()
	{
		if(mSessionId == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #296 <Field String mSessionId>
	//*   2    4:ifnonnull       18
			throw new IllegalStateException("There is no current session.");
	//    3    7:new             #311 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #313 <String "There is no current session.">
	//    6   14:invokespecial   #314 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		else
			return;
	//    8   18:return          
	}

	private void throwIfQueuingNotSupported()
	{
		if(!mRouteSupportsQueuing)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field boolean mRouteSupportsQueuing>
	//*   2    4:ifne            18
			throw new UnsupportedOperationException("The route does not support queuing.");
	//    3    7:new             #305 <Class UnsupportedOperationException>
	//    4   10:dup             
	//    5   11:ldc2            #316 <String "The route does not support queuing.">
	//    6   14:invokespecial   #308 <Method void UnsupportedOperationException(String)>
	//    7   17:athrow          
		else
			return;
	//    8   18:return          
	}

	private void throwIfRemotePlaybackNotSupported()
	{
		if(!mRouteSupportsRemotePlayback)
	//*   0    0:aload_0         
	//*   1    1:getfield        #159 <Field boolean mRouteSupportsRemotePlayback>
	//*   2    4:ifne            18
			throw new UnsupportedOperationException("The route does not support remote playback.");
	//    3    7:new             #305 <Class UnsupportedOperationException>
	//    4   10:dup             
	//    5   11:ldc2            #318 <String "The route does not support remote playback.">
	//    6   14:invokespecial   #308 <Method void UnsupportedOperationException(String)>
	//    7   17:athrow          
		else
			return;
	//    8   18:return          
	}

	private void throwIfSessionManagementNotSupported()
	{
		if(!mRouteSupportsSessionManagement)
	//*   0    0:aload_0         
	//*   1    1:getfield        #173 <Field boolean mRouteSupportsSessionManagement>
	//*   2    4:ifne            18
			throw new UnsupportedOperationException("The route does not support session management.");
	//    3    7:new             #305 <Class UnsupportedOperationException>
	//    4   10:dup             
	//    5   11:ldc2            #321 <String "The route does not support session management.">
	//    6   14:invokespecial   #308 <Method void UnsupportedOperationException(String)>
	//    7   17:athrow          
		else
			return;
	//    8   18:return          
	}

	void adoptSession(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			setSessionId(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #325 <Method void setSessionId(String)>
	//    5    9:return          
	}

	public void endSession(Bundle bundle, SessionActionCallback sessionactioncallback)
	{
		throwIfSessionManagementNotSupported();
	//    0    0:aload_0         
	//    1    1:invokespecial   #329 <Method void throwIfSessionManagementNotSupported()>
		throwIfNoCurrentSession();
	//    2    4:aload_0         
	//    3    5:invokespecial   #331 <Method void throwIfNoCurrentSession()>
		performSessionAction(new Intent("android.media.intent.action.END_SESSION"), mSessionId, bundle, sessionactioncallback);
	//    4    8:aload_0         
	//    5    9:new             #104 <Class Intent>
	//    6   12:dup             
	//    7   13:ldc1            #171 <String "android.media.intent.action.END_SESSION">
	//    8   15:invokespecial   #105 <Method void Intent(String)>
	//    9   18:aload_0         
	//   10   19:getfield        #296 <Field String mSessionId>
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:invokespecial   #333 <Method void performSessionAction(Intent, String, Bundle, RemotePlaybackClient$SessionActionCallback)>
	//   14   27:return          
	}

	public void enqueue(Uri uri, String s, Bundle bundle, long l, Bundle bundle1, ItemActionCallback itemactioncallback)
	{
		playOrEnqueue(uri, s, bundle, l, bundle1, itemactioncallback, "android.media.intent.action.ENQUEUE");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:lload           4
	//    5    6:aload           6
	//    6    8:aload           7
	//    7   10:ldc1            #161 <String "android.media.intent.action.ENQUEUE">
	//    8   12:invokespecial   #337 <Method void playOrEnqueue(Uri, String, Bundle, long, Bundle, RemotePlaybackClient$ItemActionCallback, String)>
	//    9   15:return          
	}

	public String getSessionId()
	{
		return mSessionId;
	//    0    0:aload_0         
	//    1    1:getfield        #296 <Field String mSessionId>
	//    2    4:areturn         
	}

	public void getSessionStatus(Bundle bundle, SessionActionCallback sessionactioncallback)
	{
		throwIfSessionManagementNotSupported();
	//    0    0:aload_0         
	//    1    1:invokespecial   #329 <Method void throwIfSessionManagementNotSupported()>
		throwIfNoCurrentSession();
	//    2    4:aload_0         
	//    3    5:invokespecial   #331 <Method void throwIfNoCurrentSession()>
		performSessionAction(new Intent("android.media.intent.action.GET_SESSION_STATUS"), mSessionId, bundle, sessionactioncallback);
	//    4    8:aload_0         
	//    5    9:new             #104 <Class Intent>
	//    6   12:dup             
	//    7   13:ldc1            #169 <String "android.media.intent.action.GET_SESSION_STATUS">
	//    8   15:invokespecial   #105 <Method void Intent(String)>
	//    9   18:aload_0         
	//   10   19:getfield        #296 <Field String mSessionId>
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:invokespecial   #333 <Method void performSessionAction(Intent, String, Bundle, RemotePlaybackClient$SessionActionCallback)>
	//   14   27:return          
	}

	public void getStatus(String s, Bundle bundle, ItemActionCallback itemactioncallback)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("itemId must not be null");
	//    2    4:new             #68  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #343 <String "itemId must not be null">
	//    5   11:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			throwIfNoCurrentSession();
	//    7   15:aload_0         
	//    8   16:invokespecial   #331 <Method void throwIfNoCurrentSession()>
			performItemAction(new Intent("android.media.intent.action.GET_STATUS"), mSessionId, s, bundle, itemactioncallback);
	//    9   19:aload_0         
	//   10   20:new             #104 <Class Intent>
	//   11   23:dup             
	//   12   24:ldc1            #151 <String "android.media.intent.action.GET_STATUS">
	//   13   26:invokespecial   #105 <Method void Intent(String)>
	//   14   29:aload_0         
	//   15   30:getfield        #296 <Field String mSessionId>
	//   16   33:aload_1         
	//   17   34:aload_2         
	//   18   35:aload_3         
	//   19   36:invokespecial   #298 <Method void performItemAction(Intent, String, String, Bundle, RemotePlaybackClient$ItemActionCallback)>
			return;
	//   20   39:return          
		}
	}

	void handleError(Intent intent, ActionCallback actioncallback, String s, Bundle bundle)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(bundle != null)
	//*   2    3:aload           4
	//*   3    5:ifnull          19
			i = bundle.getInt("android.media.intent.extra.ERROR_CODE", 0);
	//    4    8:aload           4
	//    5   10:ldc2            #347 <String "android.media.intent.extra.ERROR_CODE">
	//    6   13:iconst_0        
	//    7   14:invokevirtual   #351 <Method int Bundle.getInt(String, int)>
	//    8   17:istore          5
		if(DEBUG)
	//*   9   19:getstatic       #61  <Field boolean DEBUG>
	//*  10   22:ifeq            117
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   25:new             #217 <Class StringBuilder>
	//   12   28:dup             
	//   13   29:invokespecial   #218 <Method void StringBuilder()>
	//   14   32:astore          6
			stringbuilder.append("Received error from ");
	//   15   34:aload           6
	//   16   36:ldc2            #353 <String "Received error from ">
	//   17   39:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   18   42:pop             
			stringbuilder.append(intent.getAction());
	//   19   43:aload           6
	//   20   45:aload_1         
	//   21   46:invokevirtual   #356 <Method String Intent.getAction()>
	//   22   49:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   23   52:pop             
			stringbuilder.append(": error=");
	//   24   53:aload           6
	//   25   55:ldc2            #358 <String ": error=">
	//   26   58:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   27   61:pop             
			stringbuilder.append(s);
	//   28   62:aload           6
	//   29   64:aload_3         
	//   30   65:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   31   68:pop             
			stringbuilder.append(", code=");
	//   32   69:aload           6
	//   33   71:ldc2            #360 <String ", code=">
	//   34   74:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   35   77:pop             
			stringbuilder.append(i);
	//   36   78:aload           6
	//   37   80:iload           5
	//   38   82:invokevirtual   #363 <Method StringBuilder StringBuilder.append(int)>
	//   39   85:pop             
			stringbuilder.append(", data=");
	//   40   86:aload           6
	//   41   88:ldc2            #365 <String ", data=">
	//   42   91:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   43   94:pop             
			stringbuilder.append(bundleToString(bundle));
	//   44   95:aload           6
	//   45   97:aload           4
	//   46   99:invokestatic    #367 <Method String bundleToString(Bundle)>
	//   47  102:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   48  105:pop             
			Log.w("RemotePlaybackClient", stringbuilder.toString());
	//   49  106:ldc1            #32  <String "RemotePlaybackClient">
	//   50  108:aload           6
	//   51  110:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   52  113:invokestatic    #370 <Method int Log.w(String, String)>
	//   53  116:pop             
		}
		actioncallback.onError(s, i, bundle);
	//   54  117:aload_2         
	//   55  118:aload_3         
	//   56  119:iload           5
	//   57  121:aload           4
	//   58  123:invokevirtual   #374 <Method void RemotePlaybackClient$ActionCallback.onError(String, int, Bundle)>
	//   59  126:return          
	}

	void handleInvalidResult(Intent intent, ActionCallback actioncallback, Bundle bundle)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #217 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #218 <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("Received invalid result data from ");
	//    4    9:aload           4
	//    5   11:ldc2            #378 <String "Received invalid result data from ">
	//    6   14:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:pop             
		stringbuilder.append(intent.getAction());
	//    8   18:aload           4
	//    9   20:aload_1         
	//   10   21:invokevirtual   #356 <Method String Intent.getAction()>
	//   11   24:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
		stringbuilder.append(": data=");
	//   13   28:aload           4
	//   14   30:ldc2            #380 <String ": data=">
	//   15   33:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:pop             
		stringbuilder.append(bundleToString(bundle));
	//   17   37:aload           4
	//   18   39:aload_3         
	//   19   40:invokestatic    #367 <Method String bundleToString(Bundle)>
	//   20   43:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
		Log.w("RemotePlaybackClient", stringbuilder.toString());
	//   22   47:ldc1            #32  <String "RemotePlaybackClient">
	//   23   49:aload           4
	//   24   51:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   25   54:invokestatic    #370 <Method int Log.w(String, String)>
	//   26   57:pop             
		actioncallback.onError(((String) (null)), 0, bundle);
	//   27   58:aload_2         
	//   28   59:aconst_null     
	//   29   60:iconst_0        
	//   30   61:aload_3         
	//   31   62:invokevirtual   #374 <Method void RemotePlaybackClient$ActionCallback.onError(String, int, Bundle)>
	//   32   65:return          
	}

	public boolean hasSession()
	{
		return mSessionId != null;
	//    0    0:aload_0         
	//    1    1:getfield        #296 <Field String mSessionId>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isMessagingSupported()
	{
		return mRouteSupportsMessaging;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field boolean mRouteSupportsMessaging>
	//    2    4:ireturn         
	}

	public boolean isQueuingSupported()
	{
		return mRouteSupportsQueuing;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field boolean mRouteSupportsQueuing>
	//    2    4:ireturn         
	}

	public boolean isRemotePlaybackSupported()
	{
		return mRouteSupportsRemotePlayback;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field boolean mRouteSupportsRemotePlayback>
	//    2    4:ireturn         
	}

	public boolean isSessionManagementSupported()
	{
		return mRouteSupportsSessionManagement;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field boolean mRouteSupportsSessionManagement>
	//    2    4:ireturn         
	}

	public void pause(Bundle bundle, SessionActionCallback sessionactioncallback)
	{
		throwIfNoCurrentSession();
	//    0    0:aload_0         
	//    1    1:invokespecial   #331 <Method void throwIfNoCurrentSession()>
		performSessionAction(new Intent("android.media.intent.action.PAUSE"), mSessionId, bundle, sessionactioncallback);
	//    2    4:aload_0         
	//    3    5:new             #104 <Class Intent>
	//    4    8:dup             
	//    5    9:ldc1            #153 <String "android.media.intent.action.PAUSE">
	//    6   11:invokespecial   #105 <Method void Intent(String)>
	//    7   14:aload_0         
	//    8   15:getfield        #296 <Field String mSessionId>
	//    9   18:aload_1         
	//   10   19:aload_2         
	//   11   20:invokespecial   #333 <Method void performSessionAction(Intent, String, Bundle, RemotePlaybackClient$SessionActionCallback)>
	//   12   23:return          
	}

	public void play(Uri uri, String s, Bundle bundle, long l, Bundle bundle1, ItemActionCallback itemactioncallback)
	{
		playOrEnqueue(uri, s, bundle, l, bundle1, itemactioncallback, "android.media.intent.action.PLAY");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:lload           4
	//    5    6:aload           6
	//    6    8:aload           7
	//    7   10:ldc1            #143 <String "android.media.intent.action.PLAY">
	//    8   12:invokespecial   #337 <Method void playOrEnqueue(Uri, String, Bundle, long, Bundle, RemotePlaybackClient$ItemActionCallback, String)>
	//    9   15:return          
	}

	public void release()
	{
		mContext.unregisterReceiver(((BroadcastReceiver) (mActionReceiver)));
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #96  <Field RemotePlaybackClient$ActionReceiver mActionReceiver>
	//    4    8:invokevirtual   #392 <Method void Context.unregisterReceiver(BroadcastReceiver)>
	//    5   11:return          
	}

	public void remove(String s, Bundle bundle, ItemActionCallback itemactioncallback)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("itemId must not be null");
	//    2    4:new             #68  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #343 <String "itemId must not be null">
	//    5   11:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			throwIfQueuingNotSupported();
	//    7   15:aload_0         
	//    8   16:invokespecial   #275 <Method void throwIfQueuingNotSupported()>
			throwIfNoCurrentSession();
	//    9   19:aload_0         
	//   10   20:invokespecial   #331 <Method void throwIfNoCurrentSession()>
			performItemAction(new Intent("android.media.intent.action.REMOVE"), mSessionId, s, bundle, itemactioncallback);
	//   11   23:aload_0         
	//   12   24:new             #104 <Class Intent>
	//   13   27:dup             
	//   14   28:ldc1            #163 <String "android.media.intent.action.REMOVE">
	//   15   30:invokespecial   #105 <Method void Intent(String)>
	//   16   33:aload_0         
	//   17   34:getfield        #296 <Field String mSessionId>
	//   18   37:aload_1         
	//   19   38:aload_2         
	//   20   39:aload_3         
	//   21   40:invokespecial   #298 <Method void performItemAction(Intent, String, String, Bundle, RemotePlaybackClient$ItemActionCallback)>
			return;
	//   22   43:return          
		}
	}

	public void resume(Bundle bundle, SessionActionCallback sessionactioncallback)
	{
		throwIfNoCurrentSession();
	//    0    0:aload_0         
	//    1    1:invokespecial   #331 <Method void throwIfNoCurrentSession()>
		performSessionAction(new Intent("android.media.intent.action.RESUME"), mSessionId, bundle, sessionactioncallback);
	//    2    4:aload_0         
	//    3    5:new             #104 <Class Intent>
	//    4    8:dup             
	//    5    9:ldc1            #155 <String "android.media.intent.action.RESUME">
	//    6   11:invokespecial   #105 <Method void Intent(String)>
	//    7   14:aload_0         
	//    8   15:getfield        #296 <Field String mSessionId>
	//    9   18:aload_1         
	//   10   19:aload_2         
	//   11   20:invokespecial   #333 <Method void performSessionAction(Intent, String, Bundle, RemotePlaybackClient$SessionActionCallback)>
	//   12   23:return          
	}

	public void seek(String s, long l, Bundle bundle, ItemActionCallback itemactioncallback)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("itemId must not be null");
	//    2    4:new             #68  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #343 <String "itemId must not be null">
	//    5   11:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			throwIfNoCurrentSession();
	//    7   15:aload_0         
	//    8   16:invokespecial   #331 <Method void throwIfNoCurrentSession()>
			Intent intent = new Intent("android.media.intent.action.SEEK");
	//    9   19:new             #104 <Class Intent>
	//   10   22:dup             
	//   11   23:ldc1            #149 <String "android.media.intent.action.SEEK">
	//   12   25:invokespecial   #105 <Method void Intent(String)>
	//   13   28:astore          6
			intent.putExtra("android.media.intent.extra.ITEM_POSITION", l);
	//   14   30:aload           6
	//   15   32:ldc2            #291 <String "android.media.intent.extra.ITEM_POSITION">
	//   16   35:lload_2         
	//   17   36:invokevirtual   #294 <Method Intent Intent.putExtra(String, long)>
	//   18   39:pop             
			performItemAction(intent, mSessionId, s, bundle, itemactioncallback);
	//   19   40:aload_0         
	//   20   41:aload           6
	//   21   43:aload_0         
	//   22   44:getfield        #296 <Field String mSessionId>
	//   23   47:aload_1         
	//   24   48:aload           4
	//   25   50:aload           5
	//   26   52:invokespecial   #298 <Method void performItemAction(Intent, String, String, Bundle, RemotePlaybackClient$ItemActionCallback)>
			return;
	//   27   55:return          
		}
	}

	public void sendMessage(Bundle bundle, SessionActionCallback sessionactioncallback)
	{
		throwIfNoCurrentSession();
	//    0    0:aload_0         
	//    1    1:invokespecial   #331 <Method void throwIfNoCurrentSession()>
		throwIfMessageNotSupported();
	//    2    4:aload_0         
	//    3    5:invokespecial   #399 <Method void throwIfMessageNotSupported()>
		performSessionAction(new Intent("android.media.intent.action.SEND_MESSAGE"), mSessionId, bundle, sessionactioncallback);
	//    4    8:aload_0         
	//    5    9:new             #104 <Class Intent>
	//    6   12:dup             
	//    7   13:ldc1            #202 <String "android.media.intent.action.SEND_MESSAGE">
	//    8   15:invokespecial   #105 <Method void Intent(String)>
	//    9   18:aload_0         
	//   10   19:getfield        #296 <Field String mSessionId>
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:invokespecial   #333 <Method void performSessionAction(Intent, String, Bundle, RemotePlaybackClient$SessionActionCallback)>
	//   14   27:return          
	}

	public void setOnMessageReceivedListener(OnMessageReceivedListener onmessagereceivedlistener)
	{
		mOnMessageReceivedListener = onmessagereceivedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #403 <Field RemotePlaybackClient$OnMessageReceivedListener mOnMessageReceivedListener>
	//    3    5:return          
	}

	public void setSessionId(String s)
	{
		if(!ObjectsCompat.equals(((Object) (mSessionId)), ((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #296 <Field String mSessionId>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #408 <Method boolean ObjectsCompat.equals(Object, Object)>
	//*   4    8:ifne            69
		{
			if(DEBUG)
	//*   5   11:getstatic       #61  <Field boolean DEBUG>
	//*   6   14:ifeq            49
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    7   17:new             #217 <Class StringBuilder>
	//    8   20:dup             
	//    9   21:invokespecial   #218 <Method void StringBuilder()>
	//   10   24:astore_2        
				stringbuilder.append("Session id is now: ");
	//   11   25:aload_2         
	//   12   26:ldc2            #410 <String "Session id is now: ">
	//   13   29:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:pop             
				stringbuilder.append(s);
	//   15   33:aload_2         
	//   16   34:aload_1         
	//   17   35:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
				Log.d("RemotePlaybackClient", stringbuilder.toString());
	//   19   39:ldc1            #32  <String "RemotePlaybackClient">
	//   20   41:aload_2         
	//   21   42:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   22   45:invokestatic    #232 <Method int Log.d(String, String)>
	//   23   48:pop             
			}
			mSessionId = s;
	//   24   49:aload_0         
	//   25   50:aload_1         
	//   26   51:putfield        #296 <Field String mSessionId>
			if(mStatusCallback != null)
	//*  27   54:aload_0         
	//*  28   55:getfield        #412 <Field RemotePlaybackClient$StatusCallback mStatusCallback>
	//*  29   58:ifnull          69
				mStatusCallback.onSessionChanged(s);
	//   30   61:aload_0         
	//   31   62:getfield        #412 <Field RemotePlaybackClient$StatusCallback mStatusCallback>
	//   32   65:aload_1         
	//   33   66:invokevirtual   #415 <Method void RemotePlaybackClient$StatusCallback.onSessionChanged(String)>
		}
	//   34   69:return          
	}

	public void setStatusCallback(StatusCallback statuscallback)
	{
		mStatusCallback = statuscallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #412 <Field RemotePlaybackClient$StatusCallback mStatusCallback>
	//    3    5:return          
	}

	public void startSession(Bundle bundle, SessionActionCallback sessionactioncallback)
	{
		throwIfSessionManagementNotSupported();
	//    0    0:aload_0         
	//    1    1:invokespecial   #329 <Method void throwIfSessionManagementNotSupported()>
		Intent intent = new Intent("android.media.intent.action.START_SESSION");
	//    2    4:new             #104 <Class Intent>
	//    3    7:dup             
	//    4    8:ldc1            #167 <String "android.media.intent.action.START_SESSION">
	//    5   10:invokespecial   #105 <Method void Intent(String)>
	//    6   13:astore_3        
		intent.putExtra("android.media.intent.extra.SESSION_STATUS_UPDATE_RECEIVER", ((android.os.Parcelable) (mSessionStatusPendingIntent)));
	//    7   14:aload_3         
	//    8   15:ldc2            #420 <String "android.media.intent.extra.SESSION_STATUS_UPDATE_RECEIVER">
	//    9   18:aload_0         
	//   10   19:getfield        #123 <Field PendingIntent mSessionStatusPendingIntent>
	//   11   22:invokevirtual   #284 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   12   25:pop             
		if(mRouteSupportsMessaging)
	//*  13   26:aload_0         
	//*  14   27:getfield        #179 <Field boolean mRouteSupportsMessaging>
	//*  15   30:ifeq            45
			intent.putExtra("android.media.intent.extra.MESSAGE_RECEIVER", ((android.os.Parcelable) (mMessagePendingIntent)));
	//   16   33:aload_3         
	//   17   34:ldc2            #422 <String "android.media.intent.extra.MESSAGE_RECEIVER">
	//   18   37:aload_0         
	//   19   38:getfield        #125 <Field PendingIntent mMessagePendingIntent>
	//   20   41:invokevirtual   #284 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   21   44:pop             
		performSessionAction(intent, ((String) (null)), bundle, sessionactioncallback);
	//   22   45:aload_0         
	//   23   46:aload_3         
	//   24   47:aconst_null     
	//   25   48:aload_1         
	//   26   49:aload_2         
	//   27   50:invokespecial   #333 <Method void performSessionAction(Intent, String, Bundle, RemotePlaybackClient$SessionActionCallback)>
	//   28   53:return          
	}

	public void stop(Bundle bundle, SessionActionCallback sessionactioncallback)
	{
		throwIfNoCurrentSession();
	//    0    0:aload_0         
	//    1    1:invokespecial   #331 <Method void throwIfNoCurrentSession()>
		performSessionAction(new Intent("android.media.intent.action.STOP"), mSessionId, bundle, sessionactioncallback);
	//    2    4:aload_0         
	//    3    5:new             #104 <Class Intent>
	//    4    8:dup             
	//    5    9:ldc1            #157 <String "android.media.intent.action.STOP">
	//    6   11:invokespecial   #105 <Method void Intent(String)>
	//    7   14:aload_0         
	//    8   15:getfield        #296 <Field String mSessionId>
	//    9   18:aload_1         
	//   10   19:aload_2         
	//   11   20:invokespecial   #333 <Method void performSessionAction(Intent, String, Bundle, RemotePlaybackClient$SessionActionCallback)>
	//   12   23:return          
	}

	static final boolean DEBUG = Log.isLoggable("RemotePlaybackClient", 3);
	static final String TAG = "RemotePlaybackClient";
	private final ActionReceiver mActionReceiver;
	private final Context mContext;
	private final PendingIntent mItemStatusPendingIntent;
	private final PendingIntent mMessagePendingIntent;
	OnMessageReceivedListener mOnMessageReceivedListener;
	private final MediaRouter.RouteInfo mRoute;
	private boolean mRouteSupportsMessaging;
	private boolean mRouteSupportsQueuing;
	private boolean mRouteSupportsRemotePlayback;
	private boolean mRouteSupportsSessionManagement;
	String mSessionId;
	private final PendingIntent mSessionStatusPendingIntent;
	StatusCallback mStatusCallback;

	static 
	{
	//    0    0:ldc1            #32  <String "RemotePlaybackClient">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #59  <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #61  <Field boolean DEBUG>
	//*   4    9:return          
	}
}
