// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.*;
import android.util.Log;

// Referenced classes of package android.support.v7.media:
//			RemotePlaybackClient, MediaSessionStatus, MediaItemStatus

private final class RemotePlaybackClient$ActionReceiver extends BroadcastReceiver
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
	//   15   31:invokevirtual   #52  <Method android.os.Bundle Intent.getBundleExtra(String)>
	//   16   34:invokestatic    #58  <Method MediaSessionStatus MediaSessionStatus.fromBundle(android.os.Bundle)>
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
	//   38   79:invokevirtual   #52  <Method android.os.Bundle Intent.getBundleExtra(String)>
	//   39   82:invokestatic    #81  <Method MediaItemStatus MediaItemStatus.fromBundle(android.os.Bundle)>
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
	//   99  207:invokevirtual   #119 <Method android.os.Bundle Intent.getExtras()>
	//  100  210:aload_1         
	//  101  211:aload_3         
	//  102  212:aload           4
	//  103  214:aload           5
	//  104  216:invokevirtual   #125 <Method void RemotePlaybackClient$StatusCallback.onItemStatusChanged(android.os.Bundle, String, MediaSessionStatus, String, MediaItemStatus)>
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
	//  152  317:invokevirtual   #119 <Method android.os.Bundle Intent.getExtras()>
	//  153  320:aload_1         
	//  154  321:aload_3         
	//  155  322:invokevirtual   #133 <Method void RemotePlaybackClient$StatusCallback.onSessionStatusChanged(android.os.Bundle, String, MediaSessionStatus)>
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
	//  190  394:invokevirtual   #52  <Method android.os.Bundle Intent.getBundleExtra(String)>
	//  191  397:invokeinterface #147 <Method void RemotePlaybackClient$OnMessageReceivedListener.onMessageReceived(String, android.os.Bundle)>
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

	RemotePlaybackClient$ActionReceiver()
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
