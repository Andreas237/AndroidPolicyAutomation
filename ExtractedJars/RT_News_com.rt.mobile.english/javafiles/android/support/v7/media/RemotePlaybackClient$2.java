// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package android.support.v7.media:
//			RemotePlaybackClient, MediaSessionStatus

class RemotePlaybackClient$2 extends estCallback
{

	public void onError(String s, Bundle bundle)
	{
		handleError(val$intent, ((tionCallback) (val$callback)), s, bundle);
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

	public void onResult(Bundle bundle)
	{
		String s;
		MediaSessionStatus mediasessionstatus;
		if(bundle == null)
			break MISSING_BLOCK_LABEL_223;
	//    0    0:aload_1         
	//    1    1:ifnull          223
		s = RemotePlaybackClient.inferMissingResult(val$sessionId, bundle.getString("android.media.intent.extra.SESSION_ID"));
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field String val$sessionId>
	//    4    8:aload_1         
	//    5    9:ldc1            #41  <String "android.media.intent.extra.SESSION_ID">
	//    6   11:invokevirtual   #47  <Method String Bundle.getString(String)>
	//    7   14:invokestatic    #51  <Method String RemotePlaybackClient.inferMissingResult(String, String)>
	//    8   17:astore_2        
		mediasessionstatus = MediaSessionStatus.fromBundle(bundle.getBundle("android.media.intent.extra.SESSION_STATUS"));
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
			stringbuilder.append(val$intent.getAction());
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
			stringbuilder.append(RemotePlaybackClient.bundleToString(bundle));
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
		val$callback.onResult(bundle, s, mediasessionstatus);
	//   66  135:aload_0         
	//   67  136:getfield        #27  <Field RemotePlaybackClient$SessionActionCallback val$callback>
	//   68  139:aload_1         
	//   69  140:aload_2         
	//   70  141:aload_3         
	//   71  142:invokevirtual   #115 <Method void RemotePlaybackClient$SessionActionCallback.onResult(Bundle, String, MediaSessionStatus)>
		if(val$intent.getAction().equals("android.media.intent.action.END_SESSION") && s.equals(((Object) (mSessionId))))
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
		bundle;
	//   89  183:astore_1        
		if(val$intent.getAction().equals("android.media.intent.action.END_SESSION") && s.equals(((Object) (mSessionId))))
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
		throw bundle;
	//  106  221:aload_1         
	//  107  222:athrow          
		handleInvalidResult(val$intent, ((tionCallback) (val$callback)), bundle);
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
	final ssionActionCallback val$callback;
	final Intent val$intent;
	final String val$sessionId;

	RemotePlaybackClient$2()
	{
		this$0 = final_remoteplaybackclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field RemotePlaybackClient this$0>
		val$sessionId = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field String val$sessionId>
		val$intent = intent1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field Intent val$intent>
		val$callback = ssionActionCallback.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #27  <Field RemotePlaybackClient$SessionActionCallback val$callback>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void MediaRouter$ControlRequestCallback()>
	//   14   25:return          
	}
}
