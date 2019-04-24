// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.gigya.socialize.*;
import com.gigya.socialize.android.GSAPI;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			GigyaProvider, WebLoginActivity

public class GigyaBrowserProvider extends GigyaProvider
{

	public GigyaBrowserProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void GigyaProvider()>
	//    2    4:return          
	}

	private void openLoginUrl(GSObject gsobject, final LoginProvider.ProviderCallback callback)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #21  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void StringBuilder()>
	//    3    7:astore_3        
		((StringBuilder) (obj)).append(GSAPI.getInstance().getContext().getPackageName());
	//    4    8:aload_3         
	//    5    9:invokestatic    #28  <Method GSAPI GSAPI.getInstance()>
	//    6   12:invokevirtual   #32  <Method Context GSAPI.getContext()>
	//    7   15:invokevirtual   #38  <Method String Context.getPackageName()>
	//    8   18:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		((StringBuilder) (obj)).append("://gsapi/login_result");
	//   10   22:aload_3         
	//   11   23:ldc1            #44  <String "://gsapi/login_result">
	//   12   25:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
		gsobject = ((GSObject) ((String)getUrl(true, ((StringBuilder) (obj)).toString(), gsobject.getString("endPoint", "socialize.login"), GSAPI.getInstance().getAPIDomain(), gsobject, GigyaProvider.HttpMethod.GET)));
	//   14   29:aload_0         
	//   15   30:iconst_1        
	//   16   31:aload_3         
	//   17   32:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   18   35:aload_1         
	//   19   36:ldc1            #49  <String "endPoint">
	//   20   38:ldc1            #51  <String "socialize.login">
	//   21   40:invokevirtual   #57  <Method String GSObject.getString(String, String)>
	//   22   43:invokestatic    #28  <Method GSAPI GSAPI.getInstance()>
	//   23   46:invokevirtual   #60  <Method String GSAPI.getAPIDomain()>
	//   24   49:aload_1         
	//   25   50:getstatic       #66  <Field GigyaProvider$HttpMethod GigyaProvider$HttpMethod.GET>
	//   26   53:invokevirtual   #70  <Method Object getUrl(boolean, String, String, String, GSObject, GigyaProvider$HttpMethod)>
	//   27   56:checkcast       #72  <Class String>
	//   28   59:astore_1        
		WebLoginActivity.setCallback(new WebLoginActivity.WebLoginActivityCallback() {

			public void onResponse(GSObject gsobject1)
			{
				if(callback != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field LoginProvider$ProviderCallback val$callback>
			//*   2    4:ifnull          17
					callback.onResponse(gsobject1);
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field LoginProvider$ProviderCallback val$callback>
			//    5   11:aload_1         
			//    6   12:invokeinterface #31  <Method void LoginProvider$ProviderCallback.onResponse(GSObject)>
			//    7   17:return          
			}

			final GigyaBrowserProvider this$0;
			final LoginProvider.ProviderCallback val$callback;

			
			{
				this$0 = GigyaBrowserProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GigyaBrowserProvider this$0>
				callback = providercallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field LoginProvider$ProviderCallback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   29   60:new             #8   <Class GigyaBrowserProvider$2>
	//   30   63:dup             
	//   31   64:aload_0         
	//   32   65:aload_2         
	//   33   66:invokespecial   #75  <Method void GigyaBrowserProvider$2(GigyaBrowserProvider, LoginProvider$ProviderCallback)>
	//   34   69:invokestatic    #81  <Method void WebLoginActivity.setCallback(WebLoginActivity$WebLoginActivityCallback)>
		callback = ((LoginProvider.ProviderCallback) (GSAPI.getInstance().getContext()));
	//   35   72:invokestatic    #28  <Method GSAPI GSAPI.getInstance()>
	//   36   75:invokevirtual   #32  <Method Context GSAPI.getContext()>
	//   37   78:astore_2        
		obj = ((Object) (new Intent(((Context) (callback)), com/gigya/socialize/android/login/providers/WebLoginActivity)));
	//   38   79:new             #83  <Class Intent>
	//   39   82:dup             
	//   40   83:aload_2         
	//   41   84:ldc1            #77  <Class WebLoginActivity>
	//   42   86:invokespecial   #86  <Method void Intent(Context, Class)>
	//   43   89:astore_3        
		((Intent) (obj)).putExtra("url", ((String) (gsobject)));
	//   44   90:aload_3         
	//   45   91:ldc1            #88  <String "url">
	//   46   93:aload_1         
	//   47   94:invokevirtual   #92  <Method Intent Intent.putExtra(String, String)>
	//   48   97:pop             
		((Intent) (obj)).setFlags(0x10000000);
	//   49   98:aload_3         
	//   50   99:ldc1            #93  <Int 0x10000000>
	//   51  101:invokevirtual   #97  <Method Intent Intent.setFlags(int)>
	//   52  104:pop             
		((Context) (callback)).startActivity(((Intent) (obj)));
	//   53  105:aload_2         
	//   54  106:aload_3         
	//   55  107:invokevirtual   #101 <Method void Context.startActivity(Intent)>
	//   56  110:return          
	}

	public void login(Activity activity, final GSObject params, final LoginProvider.ProviderCallback callback)
	{
		if(params.get("gmid", ((Object) (null))) != null)
	//*   0    0:aload_2         
	//*   1    1:ldc1            #105 <String "gmid">
	//*   2    3:aconst_null     
	//*   3    4:invokevirtual   #109 <Method Object GSObject.get(String, Object)>
	//*   4    7:ifnull          38
		{
			params.remove("gmid");
	//    5   10:aload_2         
	//    6   11:ldc1            #105 <String "gmid">
	//    7   13:invokevirtual   #113 <Method void GSObject.remove(String)>
			GSAPI.getInstance().sendRequest("socialize.getGmidTicket", ((GSObject) (null)), true, new GSResponseListener() {

				public void onGSResponse(String s, GSResponse gsresponse, Object obj)
				{
					if(gsresponse.getErrorCode() == 0)
				//*   0    0:aload_2         
				//*   1    1:invokevirtual   #37  <Method int GSResponse.getErrorCode()>
				//*   2    4:ifne            24
						params.put("gmidTicket", gsresponse.getString("gmidTicket", ""));
				//    3    7:aload_0         
				//    4    8:getfield        #23  <Field GSObject val$params>
				//    5   11:ldc1            #39  <String "gmidTicket">
				//    6   13:aload_2         
				//    7   14:ldc1            #39  <String "gmidTicket">
				//    8   16:ldc1            #41  <String "">
				//    9   18:invokevirtual   #45  <Method String GSResponse.getString(String, String)>
				//   10   21:invokevirtual   #51  <Method void GSObject.put(String, String)>
					openLoginUrl(params, callback);
				//   11   24:aload_0         
				//   12   25:getfield        #21  <Field GigyaBrowserProvider this$0>
				//   13   28:aload_0         
				//   14   29:getfield        #23  <Field GSObject val$params>
				//   15   32:aload_0         
				//   16   33:getfield        #25  <Field LoginProvider$ProviderCallback val$callback>
				//   17   36:invokestatic    #54  <Method void GigyaBrowserProvider.access$000(GigyaBrowserProvider, GSObject, LoginProvider$ProviderCallback)>
				//   18   39:return          
				}

				final GigyaBrowserProvider this$0;
				final LoginProvider.ProviderCallback val$callback;
				final GSObject val$params;

			
			{
				this$0 = GigyaBrowserProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GigyaBrowserProvider this$0>
				params = gsobject;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field GSObject val$params>
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
, ((Object) (null)));
	//    8   16:invokestatic    #28  <Method GSAPI GSAPI.getInstance()>
	//    9   19:ldc1            #115 <String "socialize.getGmidTicket">
	//   10   21:aconst_null     
	//   11   22:iconst_1        
	//   12   23:new             #6   <Class GigyaBrowserProvider$1>
	//   13   26:dup             
	//   14   27:aload_0         
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:invokespecial   #117 <Method void GigyaBrowserProvider$1(GigyaBrowserProvider, GSObject, LoginProvider$ProviderCallback)>
	//   18   33:aconst_null     
	//   19   34:invokevirtual   #121 <Method void GSAPI.sendRequest(String, GSObject, boolean, GSResponseListener, Object)>
			return;
	//   20   37:return          
		} else
		{
			openLoginUrl(params, callback);
	//   21   38:aload_0         
	//   22   39:aload_2         
	//   23   40:aload_3         
	//   24   41:invokespecial   #19  <Method void openLoginUrl(GSObject, LoginProvider$ProviderCallback)>
			return;
	//   25   44:return          
		}
	}


/*
	static void access$000(GigyaBrowserProvider gigyabrowserprovider, GSObject gsobject, LoginProvider.ProviderCallback providercallback)
	{
		gigyabrowserprovider.openLoginUrl(gsobject, providercallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void openLoginUrl(GSObject, LoginProvider$ProviderCallback)>
		return;
	//    4    6:return          
	}

*/
}
