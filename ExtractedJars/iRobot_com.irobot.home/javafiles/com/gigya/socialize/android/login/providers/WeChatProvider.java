// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.GSAPI;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			LoginProvider

public class WeChatProvider extends LoginProvider
{

	public WeChatProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void LoginProvider()>
	//    2    4:return          
	}

	public static boolean isConfigured()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		boolean flag;
		boolean flag2;
		String s;
		try
		{
			Context context = GSAPI.getInstance().getContext();
	//    2    2:invokestatic    #29  <Method GSAPI GSAPI.getInstance()>
	//    3    5:invokevirtual   #33  <Method Context GSAPI.getContext()>
	//    4    8:astore_3        
			s = (String)context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("wechatAppID");
	//    5    9:aload_3         
	//    6   10:invokevirtual   #39  <Method PackageManager Context.getPackageManager()>
	//    7   13:aload_3         
	//    8   14:invokevirtual   #43  <Method String Context.getPackageName()>
	//    9   17:sipush          128
	//   10   20:invokevirtual   #49  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   11   23:getfield        #55  <Field Bundle ApplicationInfo.metaData>
	//   12   26:ldc1            #57  <String "wechatAppID">
	//   13   28:invokevirtual   #63  <Method Object Bundle.get(String)>
	//   14   31:checkcast       #65  <Class String>
	//   15   34:astore          4
			api = WXAPIFactory.createWXAPI(context, s, false);
	//   16   36:aload_3         
	//   17   37:aload           4
	//   18   39:iconst_0        
	//   19   40:invokestatic    #71  <Method IWXAPI WXAPIFactory.createWXAPI(Context, String, boolean)>
	//   20   43:putstatic       #73  <Field IWXAPI api>
			flag2 = api.registerApp(s);
	//   21   46:getstatic       #73  <Field IWXAPI api>
	//   22   49:aload           4
	//   23   51:invokeinterface #79  <Method boolean IWXAPI.registerApp(String)>
	//   24   56:istore_2        
		}
	//*  25   57:iload_1         
	//*  26   58:istore_0        
	//*  27   59:aload           4
	//*  28   61:ifnull          87
	//*  29   64:iload_1         
	//*  30   65:istore_0        
	//*  31   66:iload_2         
	//*  32   67:ifeq            87
	//*  33   70:getstatic       #73  <Field IWXAPI api>
	//*  34   73:invokeinterface #82  <Method boolean IWXAPI.isWXAppInstalled()>
	//*  35   78:istore_2        
	//*  36   79:iload_1         
	//*  37   80:istore_0        
	//*  38   81:iload_2         
	//*  39   82:ifeq            87
	//*  40   85:iconst_1        
	//*  41   86:istore_0        
	//*  42   87:iload_0         
	//*  43   88:ireturn         
		catch(Throwable throwable)
	//*  44   89:astore_3        
		{
			return false;
	//   45   90:iconst_0        
	//   46   91:ireturn         
		}
		flag = flag1;
		if(s == null)
			break MISSING_BLOCK_LABEL_87;
		flag = flag1;
		if(!flag2)
			break MISSING_BLOCK_LABEL_87;
		flag2 = api.isWXAppInstalled();
		flag = flag1;
		if(flag2)
			flag = true;
		return flag;
	}

	public static void onResponse(BaseResp baseresp)
	{
		resp = baseresp;
	//    0    0:aload_0         
	//    1    1:putstatic       #19  <Field BaseResp resp>
	//    2    4:return          
	}

	public void clearSession()
	{
	//    0    0:return          
	}

	protected void finish()
	{
	//    0    0:return          
	}

	public void login(final Activity appInfo, GSObject gsobject, Boolean boolean1, final LoginProvider.ProviderCallback callback)
	{
		appInfo = ((Activity) (GSAPI.getInstance().getContext()));
	//    0    0:invokestatic    #29  <Method GSAPI GSAPI.getInstance()>
	//    1    3:invokevirtual   #33  <Method Context GSAPI.getContext()>
	//    2    6:astore_1        
		appInfo = ((Activity) (((Context) (appInfo)).getPackageManager().getApplicationInfo(((Context) (appInfo)).getPackageName(), 128)));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #39  <Method PackageManager Context.getPackageManager()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #43  <Method String Context.getPackageName()>
	//    7   15:sipush          128
	//    8   18:invokevirtual   #49  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    9   21:astore_1        
		resp = null;
	//   10   22:aconst_null     
	//   11   23:putstatic       #19  <Field BaseResp resp>
		createActivity(new com.gigya.socialize.android.ui.HostActivity.HostActivityHandler() {

			public void onActivityResult(FragmentActivity fragmentactivity, int i, int j, Intent intent)
			{
			//    0    0:return          
			}

			public void onCancel(FragmentActivity fragmentactivity)
			{
				fragmentactivity.finish();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #38  <Method void FragmentActivity.finish()>
				cancel(callback);
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field WeChatProvider this$0>
			//    4    8:aload_0         
			//    5    9:getfield        #25  <Field LoginProvider$ProviderCallback val$callback>
			//    6   12:invokevirtual   #42  <Method void WeChatProvider.cancel(LoginProvider$ProviderCallback)>
			//    7   15:return          
			}

			public void onCreate(FragmentActivity fragmentactivity, Bundle bundle)
			{
				fragmentactivity = ((FragmentActivity) ((String)appInfo.metaData.get("wechatAppID")));
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
				if(WeChatProvider.resp != null)
			//*   0    0:invokestatic    #91  <Method BaseResp WeChatProvider.access$000()>
			//*   1    3:ifnull          88
				{
					fragmentactivity.finish();
			//    2    6:aload_1         
			//    3    7:invokevirtual   #38  <Method void FragmentActivity.finish()>
					int i = WeChatProvider.resp.errCode;
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
							fragmentactivity = ((FragmentActivity) ((com.tencent.mm.opensdk.modelmsg.SendAuth.Resp)WeChatProvider.resp));
			//   16   34:invokestatic    #91  <Method BaseResp WeChatProvider.access$000()>
			//   17   37:checkcast       #99  <Class com.tencent.mm.opensdk.modelmsg.SendAuth$Resp>
			//   18   40:astore_1        
							success(callback, ((com.tencent.mm.opensdk.modelmsg.SendAuth.Resp) (fragmentactivity)).code, -1L);
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
							fail(callback, ((Exception) (fragmentactivity)).getMessage());
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
					cancel(callback);
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
			final LoginProvider.ProviderCallback val$callback;

			
			{
				this$0 = WeChatProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field WeChatProvider this$0>
				appInfo = applicationinfo;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ApplicationInfo val$appInfo>
				callback = providercallback;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field LoginProvider$ProviderCallback val$callback>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   12   26:aload_0         
	//   13   27:new             #6   <Class WeChatProvider$1>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:aload           4
	//   18   35:invokespecial   #91  <Method void WeChatProvider$1(WeChatProvider, ApplicationInfo, LoginProvider$ProviderCallback)>
	//   19   38:invokevirtual   #95  <Method void createActivity(com.gigya.socialize.android.ui.HostActivity$HostActivityHandler)>
	//   20   41:return          
	}

	public static IWXAPI api;
	private static BaseResp resp;


/*
	static BaseResp access$000()
	{
		return resp;
	//    0    0:getstatic       #19  <Field BaseResp resp>
	//    1    3:areturn         
	}

*/
}
