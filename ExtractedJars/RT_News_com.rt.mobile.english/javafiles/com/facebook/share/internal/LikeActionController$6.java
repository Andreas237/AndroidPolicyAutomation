// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.*;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.*;
import java.util.UUID;

// Referenced classes of package com.facebook.share.internal:
//			ResultProcessor, LikeActionController

class LikeActionController$6 extends ResultProcessor
{

	public void onCancel(AppCall appcall)
	{
		onError(appcall, ((FacebookException) (new FacebookOperationCanceledException())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #27  <Class FacebookOperationCanceledException>
	//    3    5:dup             
	//    4    6:invokespecial   #30  <Method void FacebookOperationCanceledException()>
	//    5    9:invokevirtual   #34  <Method void onError(AppCall, FacebookException)>
	//    6   12:return          
	}

	public void onError(AppCall appcall, FacebookException facebookexception)
	{
		Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Like Dialog failed with error : %s", new Object[] {
			facebookexception
		});
	//    0    0:getstatic       #40  <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//    1    3:invokestatic    #44  <Method String LikeActionController.access$100()>
	//    2    6:ldc1            #46  <String "Like Dialog failed with error : %s">
	//    3    8:iconst_1        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_2         
	//    8   15:aastore         
	//    9   16:invokestatic    #54  <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		Bundle bundle;
		if(val$analyticsParameters == null)
	//*  10   19:aload_0         
	//*  11   20:getfield        #19  <Field Bundle val$analyticsParameters>
	//*  12   23:ifnonnull       37
			bundle = new Bundle();
	//   13   26:new             #56  <Class Bundle>
	//   14   29:dup             
	//   15   30:invokespecial   #57  <Method void Bundle()>
	//   16   33:astore_3        
		else
	//*  17   34:goto            42
			bundle = val$analyticsParameters;
	//   18   37:aload_0         
	//   19   38:getfield        #19  <Field Bundle val$analyticsParameters>
	//   20   41:astore_3        
		bundle.putString("call_id", appcall.getCallId().toString());
	//   21   42:aload_3         
	//   22   43:ldc1            #59  <String "call_id">
	//   23   45:aload_1         
	//   24   46:invokevirtual   #65  <Method UUID AppCall.getCallId()>
	//   25   49:invokevirtual   #70  <Method String UUID.toString()>
	//   26   52:invokevirtual   #74  <Method void Bundle.putString(String, String)>
		LikeActionController.access$1400(LikeActionController.this, "present_dialog", bundle);
	//   27   55:aload_0         
	//   28   56:getfield        #17  <Field LikeActionController this$0>
	//   29   59:ldc1            #76  <String "present_dialog">
	//   30   61:aload_3         
	//   31   62:invokestatic    #80  <Method void LikeActionController.access$1400(LikeActionController, String, Bundle)>
		LikeActionController.access$1500(LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", NativeProtocol.createBundleForException(facebookexception));
	//   32   65:aload_0         
	//   33   66:getfield        #17  <Field LikeActionController this$0>
	//   34   69:ldc1            #82  <String "com.facebook.sdk.LikeActionController.DID_ERROR">
	//   35   71:aload_2         
	//   36   72:invokestatic    #88  <Method Bundle NativeProtocol.createBundleForException(FacebookException)>
	//   37   75:invokestatic    #91  <Method void LikeActionController.access$1500(LikeActionController, String, Bundle)>
	//   38   78:return          
	}

	public void onSuccess(AppCall appcall, Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          207
		{
			if(!bundle.containsKey("object_is_liked"))
	//*   2    4:aload_2         
	//*   3    5:ldc1            #95  <String "object_is_liked">
	//*   4    7:invokevirtual   #99  <Method boolean Bundle.containsKey(String)>
	//*   5   10:ifne            14
				return;
	//    6   13:return          
			boolean flag = bundle.getBoolean("object_is_liked");
	//    7   14:aload_2         
	//    8   15:ldc1            #95  <String "object_is_liked">
	//    9   17:invokevirtual   #102 <Method boolean Bundle.getBoolean(String)>
	//   10   20:istore_3        
			String s = LikeActionController.access$700(LikeActionController.this);
	//   11   21:aload_0         
	//   12   22:getfield        #17  <Field LikeActionController this$0>
	//   13   25:invokestatic    #106 <Method String LikeActionController.access$700(LikeActionController)>
	//   14   28:astore          4
			String s1 = LikeActionController.access$800(LikeActionController.this);
	//   15   30:aload_0         
	//   16   31:getfield        #17  <Field LikeActionController this$0>
	//   17   34:invokestatic    #109 <Method String LikeActionController.access$800(LikeActionController)>
	//   18   37:astore          5
			if(bundle.containsKey("like_count_string"))
	//*  19   39:aload_2         
	//*  20   40:ldc1            #111 <String "like_count_string">
	//*  21   42:invokevirtual   #99  <Method boolean Bundle.containsKey(String)>
	//*  22   45:ifeq            63
			{
				s = bundle.getString("like_count_string");
	//   23   48:aload_2         
	//   24   49:ldc1            #111 <String "like_count_string">
	//   25   51:invokevirtual   #115 <Method String Bundle.getString(String)>
	//   26   54:astore          4
				s1 = s;
	//   27   56:aload           4
	//   28   58:astore          5
			}
	//*  29   60:goto            63
			String s2 = LikeActionController.access$900(LikeActionController.this);
	//   30   63:aload_0         
	//   31   64:getfield        #17  <Field LikeActionController this$0>
	//   32   67:invokestatic    #118 <Method String LikeActionController.access$900(LikeActionController)>
	//   33   70:astore          6
			String s3 = LikeActionController.access$1000(LikeActionController.this);
	//   34   72:aload_0         
	//   35   73:getfield        #17  <Field LikeActionController this$0>
	//   36   76:invokestatic    #121 <Method String LikeActionController.access$1000(LikeActionController)>
	//   37   79:astore          7
			if(bundle.containsKey("social_sentence"))
	//*  38   81:aload_2         
	//*  39   82:ldc1            #123 <String "social_sentence">
	//*  40   84:invokevirtual   #99  <Method boolean Bundle.containsKey(String)>
	//*  41   87:ifeq            105
			{
				s2 = bundle.getString("social_sentence");
	//   42   90:aload_2         
	//   43   91:ldc1            #123 <String "social_sentence">
	//   44   93:invokevirtual   #115 <Method String Bundle.getString(String)>
	//   45   96:astore          6
				s3 = s2;
	//   46   98:aload           6
	//   47  100:astore          7
			}
	//*  48  102:goto            105
			if(bundle.containsKey("object_is_liked"))
	//*  49  105:aload_2         
	//*  50  106:ldc1            #95  <String "object_is_liked">
	//*  51  108:invokevirtual   #99  <Method boolean Bundle.containsKey(String)>
	//*  52  111:ifeq            124
				bundle = ((Bundle) (bundle.getString("unlike_token")));
	//   53  114:aload_2         
	//   54  115:ldc1            #125 <String "unlike_token">
	//   55  117:invokevirtual   #115 <Method String Bundle.getString(String)>
	//   56  120:astore_2        
			else
	//*  57  121:goto            135
				bundle = ((Bundle) (LikeActionController.access$1100(LikeActionController.this)));
	//   58  124:aload_0         
	//   59  125:getfield        #17  <Field LikeActionController this$0>
	//   60  128:invokestatic    #128 <Method String LikeActionController.access$1100(LikeActionController)>
	//   61  131:astore_2        
	//*  62  132:goto            121
			Bundle bundle1;
			if(val$analyticsParameters == null)
	//*  63  135:aload_0         
	//*  64  136:getfield        #19  <Field Bundle val$analyticsParameters>
	//*  65  139:ifnonnull       154
				bundle1 = new Bundle();
	//   66  142:new             #56  <Class Bundle>
	//   67  145:dup             
	//   68  146:invokespecial   #57  <Method void Bundle()>
	//   69  149:astore          8
			else
	//*  70  151:goto            160
				bundle1 = val$analyticsParameters;
	//   71  154:aload_0         
	//   72  155:getfield        #19  <Field Bundle val$analyticsParameters>
	//   73  158:astore          8
			bundle1.putString("call_id", appcall.getCallId().toString());
	//   74  160:aload           8
	//   75  162:ldc1            #59  <String "call_id">
	//   76  164:aload_1         
	//   77  165:invokevirtual   #65  <Method UUID AppCall.getCallId()>
	//   78  168:invokevirtual   #70  <Method String UUID.toString()>
	//   79  171:invokevirtual   #74  <Method void Bundle.putString(String, String)>
			LikeActionController.access$1200(LikeActionController.this).logSdkEvent("fb_like_control_dialog_did_succeed", ((Double) (null)), bundle1);
	//   80  174:aload_0         
	//   81  175:getfield        #17  <Field LikeActionController this$0>
	//   82  178:invokestatic    #132 <Method AppEventsLogger LikeActionController.access$1200(LikeActionController)>
	//   83  181:ldc1            #134 <String "fb_like_control_dialog_did_succeed">
	//   84  183:aconst_null     
	//   85  184:aload           8
	//   86  186:invokevirtual   #140 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
			LikeActionController.access$1300(LikeActionController.this, flag, s, s1, s2, s3, ((String) (bundle)));
	//   87  189:aload_0         
	//   88  190:getfield        #17  <Field LikeActionController this$0>
	//   89  193:iload_3         
	//   90  194:aload           4
	//   91  196:aload           5
	//   92  198:aload           6
	//   93  200:aload           7
	//   94  202:aload_2         
	//   95  203:invokestatic    #144 <Method void LikeActionController.access$1300(LikeActionController, boolean, String, String, String, String, String)>
			return;
	//   96  206:return          
		} else
		{
			return;
	//   97  207:return          
		}
	}

	final LikeActionController this$0;
	final Bundle val$analyticsParameters;

	LikeActionController$6(Bundle bundle)
	{
		this$0 = final_likeactioncontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field LikeActionController this$0>
		val$analyticsParameters = bundle;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #19  <Field Bundle val$analyticsParameters>
		super(FacebookCallback.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #22  <Method void ResultProcessor(FacebookCallback)>
	//    9   15:return          
	}
}
