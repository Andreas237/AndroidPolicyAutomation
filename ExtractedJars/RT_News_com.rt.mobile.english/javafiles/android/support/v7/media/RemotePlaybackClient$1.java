// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package android.support.v7.media:
//			RemotePlaybackClient, MediaSessionStatus, MediaItemStatus

class RemotePlaybackClient$1 extends estCallback
{

	public void onError(String s, Bundle bundle)
	{
		handleError(val$intent, ((tionCallback) (val$callback)), s, bundle);
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

	public void onResult(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          218
		{
			String s = RemotePlaybackClient.inferMissingResult(val$sessionId, bundle.getString("android.media.intent.extra.SESSION_ID"));
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field String val$sessionId>
	//    4    8:aload_1         
	//    5    9:ldc1            #44  <String "android.media.intent.extra.SESSION_ID">
	//    6   11:invokevirtual   #50  <Method String Bundle.getString(String)>
	//    7   14:invokestatic    #54  <Method String RemotePlaybackClient.inferMissingResult(String, String)>
	//    8   17:astore_2        
			MediaSessionStatus mediasessionstatus = MediaSessionStatus.fromBundle(bundle.getBundle("android.media.intent.extra.SESSION_STATUS"));
	//    9   18:aload_1         
	//   10   19:ldc1            #56  <String "android.media.intent.extra.SESSION_STATUS">
	//   11   21:invokevirtual   #60  <Method Bundle Bundle.getBundle(String)>
	//   12   24:invokestatic    #66  <Method MediaSessionStatus MediaSessionStatus.fromBundle(Bundle)>
	//   13   27:astore_3        
			String s1 = RemotePlaybackClient.inferMissingResult(val$itemId, bundle.getString("android.media.intent.extra.ITEM_ID"));
	//   14   28:aload_0         
	//   15   29:getfield        #26  <Field String val$itemId>
	//   16   32:aload_1         
	//   17   33:ldc1            #68  <String "android.media.intent.extra.ITEM_ID">
	//   18   35:invokevirtual   #50  <Method String Bundle.getString(String)>
	//   19   38:invokestatic    #54  <Method String RemotePlaybackClient.inferMissingResult(String, String)>
	//   20   41:astore          4
			MediaItemStatus mediaitemstatus = MediaItemStatus.fromBundle(bundle.getBundle("android.media.intent.extra.ITEM_STATUS"));
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
					stringbuilder.append(val$intent.getAction());
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
					stringbuilder.append(RemotePlaybackClient.bundleToString(bundle));
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
				val$callback.onResult(bundle, s, mediasessionstatus, s1, mediaitemstatus);
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
		handleInvalidResult(val$intent, ((tionCallback) (val$callback)), bundle);
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
	final emActionCallback val$callback;
	final Intent val$intent;
	final String val$itemId;
	final String val$sessionId;

	RemotePlaybackClient$1()
	{
		this$0 = final_remoteplaybackclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field RemotePlaybackClient this$0>
		val$sessionId = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field String val$sessionId>
		val$itemId = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field String val$itemId>
		val$intent = intent1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field Intent val$intent>
		val$callback = emActionCallback.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #30  <Field RemotePlaybackClient$ItemActionCallback val$callback>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #33  <Method void MediaRouter$ControlRequestCallback()>
	//   17   31:return          
	}
}
