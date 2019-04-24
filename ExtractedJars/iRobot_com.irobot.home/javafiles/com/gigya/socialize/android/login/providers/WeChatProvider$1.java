// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			WeChatProvider

class WeChatProvider$1
	implements com.gigya.socialize.android.ui.ActivityHandler
{

	public void onActivityResult(FragmentActivity fragmentactivity, int i, int j, Intent intent)
	{
	//    0    0:return          
	}

	public void onCancel(FragmentActivity fragmentactivity)
	{
		fragmentactivity.finish();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #38  <Method void FragmentActivity.finish()>
		cancel(val$callback);
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field WeChatProvider this$0>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field LoginProvider$ProviderCallback val$callback>
	//    6   12:invokevirtual   #42  <Method void WeChatProvider.cancel(LoginProvider$ProviderCallback)>
	//    7   15:return          
	}

	public void onCreate(FragmentActivity fragmentactivity, Bundle bundle)
	{
		fragmentactivity = ((FragmentActivity) ((String)val$appInfo.metaData.get("wechatAppID")));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ApplicationInfo val$appInfo>
	//    2    4:getfield        #50  <Field Bundle ApplicationInfo.metaData>
	//    3    7:ldc1            #52  <String "wechatAppID">
	//    4    9:invokevirtual   #58  <Method Object Bundle.get(String)>
	//    5   12:checkcast       #60  <Class String>
	//    6   15:astore_1        
		fragmentactivity = ((FragmentActivity) (new com.tencent.mm.opensdk.modelmsg.SendAuth.Req()));
	//    7   16:new             #62  <Class com.tencent.mm.opensdk.modelmsg.SendAuth$Req>
	//    8   19:dup             
	//    9   20:invokespecial   #63  <Method void com.tencent.mm.opensdk.modelmsg.SendAuth$Req()>
	//   10   23:astore_1        
		fragmentactivity.scope = "snsapi_userinfo";
	//   11   24:aload_1         
	//   12   25:ldc1            #65  <String "snsapi_userinfo">
	//   13   27:putfield        #69  <Field String com.tencent.mm.opensdk.modelmsg.SendAuth$Req.scope>
		fragmentactivity.state = "";
	//   14   30:aload_1         
	//   15   31:ldc1            #71  <String "">
	//   16   33:putfield        #74  <Field String com.tencent.mm.opensdk.modelmsg.SendAuth$Req.state>
		WeChatProvider.api.sendReq(((com.tencent.mm.opensdk.modelbase.BaseReq) (fragmentactivity)));
	//   17   36:getstatic       #78  <Field IWXAPI WeChatProvider.api>
	//   18   39:aload_1         
	//   19   40:invokeinterface #84  <Method boolean IWXAPI.sendReq(com.tencent.mm.opensdk.modelbase.BaseReq)>
	//   20   45:pop             
	//   21   46:return          
	}

	public void onResume(FragmentActivity fragmentactivity)
	{
		if(WeChatProvider.access$000() != null)
	//*   0    0:invokestatic    #91  <Method BaseResp WeChatProvider.access$000()>
	//*   1    3:ifnull          88
		{
			fragmentactivity.finish();
	//    2    6:aload_1         
	//    3    7:invokevirtual   #38  <Method void FragmentActivity.finish()>
			int i = WeChatProvider.access$000().errCode;
	//    4   10:invokestatic    #91  <Method BaseResp WeChatProvider.access$000()>
	//    5   13:getfield        #97  <Field int BaseResp.errCode>
	//    6   16:istore_2        
			if(i != -4 && i != -2)
	//*   7   17:iload_2         
	//*   8   18:bipush          -4
	//*   9   20:icmpeq          77
	//*  10   23:iload_2         
	//*  11   24:bipush          -2
	//*  12   26:icmpeq          77
			{
				if(i != 0)
	//*  13   29:iload_2         
	//*  14   30:ifeq            34
					return;
	//   15   33:return          
				try
				{
					fragmentactivity = ((FragmentActivity) ((com.tencent.mm.opensdk.modelmsg.SendAuth.Resp)WeChatProvider.access$000()));
	//   16   34:invokestatic    #91  <Method BaseResp WeChatProvider.access$000()>
	//   17   37:checkcast       #99  <Class com.tencent.mm.opensdk.modelmsg.SendAuth$Resp>
	//   18   40:astore_1        
					success(val$callback, ((com.tencent.mm.opensdk.modelmsg.SendAuth.Resp) (fragmentactivity)).code, -1L);
	//   19   41:aload_0         
	//   20   42:getfield        #21  <Field WeChatProvider this$0>
	//   21   45:aload_0         
	//   22   46:getfield        #25  <Field LoginProvider$ProviderCallback val$callback>
	//   23   49:aload_1         
	//   24   50:getfield        #102 <Field String com.tencent.mm.opensdk.modelmsg.SendAuth$Resp.code>
	//   25   53:ldc2w           #103 <Long -1L>
	//   26   56:invokevirtual   #108 <Method void WeChatProvider.success(LoginProvider$ProviderCallback, String, long)>
					return;
	//   27   59:return          
				}
				// Misplaced declaration of an exception variable
				catch(FragmentActivity fragmentactivity)
	//*  28   60:astore_1        
				{
					fail(val$callback, ((Exception) (fragmentactivity)).getMessage());
	//   29   61:aload_0         
	//   30   62:getfield        #21  <Field WeChatProvider this$0>
	//   31   65:aload_0         
	//   32   66:getfield        #25  <Field LoginProvider$ProviderCallback val$callback>
	//   33   69:aload_1         
	//   34   70:invokevirtual   #112 <Method String Exception.getMessage()>
	//   35   73:invokevirtual   #116 <Method void WeChatProvider.fail(LoginProvider$ProviderCallback, String)>
				}
				return;
	//   36   76:return          
			}
			cancel(val$callback);
	//   37   77:aload_0         
	//   38   78:getfield        #21  <Field WeChatProvider this$0>
	//   39   81:aload_0         
	//   40   82:getfield        #25  <Field LoginProvider$ProviderCallback val$callback>
	//   41   85:invokevirtual   #42  <Method void WeChatProvider.cancel(LoginProvider$ProviderCallback)>
		}
	//   42   88:return          
	}

	public void onStart(FragmentActivity fragmentactivity)
	{
	//    0    0:return          
	}

	final WeChatProvider this$0;
	final ApplicationInfo val$appInfo;
	final viderCallback val$callback;

	WeChatProvider$1()
	{
		this$0 = final_wechatprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field WeChatProvider this$0>
		val$appInfo = applicationinfo;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field ApplicationInfo val$appInfo>
		val$callback = viderCallback.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field LoginProvider$ProviderCallback val$callback>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
