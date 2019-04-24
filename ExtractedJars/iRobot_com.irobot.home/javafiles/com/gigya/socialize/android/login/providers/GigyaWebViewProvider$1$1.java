// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.GSAPI;
import com.gigya.socialize.android.ui.WebViewFragment;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			GigyaWebViewProvider, PostRequest

class GigyaWebViewProvider$1$1
	implements com.gigya.socialize.android.ui.agmentHandler
{

	public void onResult(GSObject gsobject)
	{
		val$callback.onResponse(gsobject);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field GigyaWebViewProvider$1 this$1>
	//    2    4:getfield        #31  <Field LoginProvider$ProviderCallback GigyaWebViewProvider$1.val$callback>
	//    3    7:aload_1         
	//    4    8:invokeinterface #36  <Method void LoginProvider$ProviderCallback.onResponse(GSObject)>
		val$activity.finish();
	//    5   13:aload_0         
	//    6   14:getfield        #21  <Field FragmentActivity val$activity>
	//    7   17:invokevirtual   #41  <Method void FragmentActivity.finish()>
	//    8   20:return          
	}

	final GigyaWebViewProvider._cls1 this$1;
	final FragmentActivity val$activity;

	GigyaWebViewProvider$1$1()
	{
		this$1 = final__pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GigyaWebViewProvider$1 this$1>
		val$activity = FragmentActivity.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field FragmentActivity val$activity>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class com/gigya/socialize/android/login/providers/GigyaWebViewProvider$1

/* anonymous class */
	class GigyaWebViewProvider._cls1
		implements com.gigya.socialize.android.ui.HostActivity.HostActivityHandler
	{

		public void onActivityResult(FragmentActivity fragmentactivity, int i, int j, Intent intent)
		{
		//    0    0:return          
		}

		public void onCancel(FragmentActivity fragmentactivity)
		{
			cancel(callback);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field GigyaWebViewProvider this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #27  <Field LoginProvider$ProviderCallback val$callback>
		//    4    8:invokevirtual   #39  <Method void GigyaWebViewProvider.cancel(LoginProvider$ProviderCallback)>
		//    5   11:return          
		}

		public void onCreate(FragmentActivity fragmentactivity, Bundle bundle)
		{
			bundle = ((Bundle) (new StringBuilder()));
		//    0    0:new             #43  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #44  <Method void StringBuilder()>
		//    3    7:astore_2        
			((StringBuilder) (bundle)).append(params.getString("provider", "provider"));
		//    4    8:aload_2         
		//    5    9:aload_0         
		//    6   10:getfield        #25  <Field GSObject val$params>
		//    7   13:ldc1            #46  <String "provider">
		//    8   15:ldc1            #46  <String "provider">
		//    9   17:invokevirtual   #52  <Method String GSObject.getString(String, String)>
		//   10   20:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   11   23:pop             
			((StringBuilder) (bundle)).append("WebViewFragment");
		//   12   24:aload_2         
		//   13   25:ldc1            #58  <String "WebViewFragment">
		//   14   27:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   15   30:pop             
			bundle = ((Bundle) (((StringBuilder) (bundle)).toString()));
		//   16   31:aload_2         
		//   17   32:invokevirtual   #62  <Method String StringBuilder.toString()>
		//   18   35:astore_2        
			if(fragmentactivity.getSupportFragmentManager().findFragmentByTag(((String) (bundle))) == null)
		//*  19   36:aload_1         
		//*  20   37:invokevirtual   #68  <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
		//*  21   40:aload_2         
		//*  22   41:invokevirtual   #74  <Method android.support.v4.app.Fragment FragmentManager.findFragmentByTag(String)>
		//*  23   44:ifnonnull       139
			{
				PostRequest postrequest = (PostRequest)getUrl(true, "gsapi://login_result", params.getString("endPoint", "socialize.login"), GSAPI.getInstance().getAPIDomain(), params, GigyaProvider.HttpMethod.POST);
		//   24   47:aload_0         
		//   25   48:getfield        #23  <Field GigyaWebViewProvider this$0>
		//   26   51:iconst_1        
		//   27   52:ldc1            #76  <String "gsapi://login_result">
		//   28   54:aload_0         
		//   29   55:getfield        #25  <Field GSObject val$params>
		//   30   58:ldc1            #78  <String "endPoint">
		//   31   60:ldc1            #80  <String "socialize.login">
		//   32   62:invokevirtual   #52  <Method String GSObject.getString(String, String)>
		//   33   65:invokestatic    #86  <Method GSAPI GSAPI.getInstance()>
		//   34   68:invokevirtual   #89  <Method String GSAPI.getAPIDomain()>
		//   35   71:aload_0         
		//   36   72:getfield        #25  <Field GSObject val$params>
		//   37   75:getstatic       #95  <Field GigyaProvider$HttpMethod GigyaProvider$HttpMethod.POST>
		//   38   78:invokevirtual   #99  <Method Object GigyaWebViewProvider.getUrl(boolean, String, String, String, GSObject, GigyaProvider$HttpMethod)>
		//   39   81:checkcast       #101 <Class PostRequest>
		//   40   84:astore_3        
				GigyaWebViewProvider.access$002(GigyaWebViewProvider.this, WebViewFragment.create(fragmentactivity, ((String) (bundle)), params.getString("captionText", ""), postrequest, "gsapi://login_result", ((com.gigya.socialize.android.ui.WebViewFragment.WebViewFragmentHandler) (((GigyaWebViewProvider._cls1._cls1) (fragmentactivity)). new GigyaWebViewProvider._cls1._cls1())), isTransparent));
		//   41   85:aload_0         
		//   42   86:getfield        #23  <Field GigyaWebViewProvider this$0>
		//   43   89:aload_1         
		//   44   90:aload_2         
		//   45   91:aload_0         
		//   46   92:getfield        #25  <Field GSObject val$params>
		//   47   95:ldc1            #103 <String "captionText">
		//   48   97:ldc1            #105 <String "">
		//   49   99:invokevirtual   #52  <Method String GSObject.getString(String, String)>
		//   50  102:aload_3         
		//   51  103:ldc1            #76  <String "gsapi://login_result">
		//   52  105:new             #13  <Class GigyaWebViewProvider$1$1>
		//   53  108:dup             
		//   54  109:aload_0         
		//   55  110:aload_1         
		//   56  111:invokespecial   #108 <Method void GigyaWebViewProvider$1$1(GigyaWebViewProvider$1, FragmentActivity)>
		//   57  114:aload_0         
		//   58  115:getfield        #23  <Field GigyaWebViewProvider this$0>
		//   59  118:getfield        #112 <Field Boolean GigyaWebViewProvider.isTransparent>
		//   60  121:invokestatic    #118 <Method WebViewFragment WebViewFragment.create(FragmentActivity, String, String, PostRequest, String, com.gigya.socialize.android.ui.WebViewFragment$WebViewFragmentHandler, Boolean)>
		//   61  124:invokestatic    #122 <Method WebViewFragment GigyaWebViewProvider.access$002(GigyaWebViewProvider, WebViewFragment)>
		//   62  127:pop             
				GigyaWebViewProvider.access$000(GigyaWebViewProvider.this).setRetainInstance(true);
		//   63  128:aload_0         
		//   64  129:getfield        #23  <Field GigyaWebViewProvider this$0>
		//   65  132:invokestatic    #126 <Method WebViewFragment GigyaWebViewProvider.access$000(GigyaWebViewProvider)>
		//   66  135:iconst_1        
		//   67  136:invokevirtual   #130 <Method void WebViewFragment.setRetainInstance(boolean)>
			}
		//   68  139:return          
		}

		public void onResume(FragmentActivity fragmentactivity)
		{
		//    0    0:return          
		}

		public void onStart(FragmentActivity fragmentactivity)
		{
		//    0    0:return          
		}

		final GigyaWebViewProvider this$0;
		final LoginProvider.ProviderCallback val$callback;
		final GSObject val$params;

			
			{
				this$0 = final_gigyawebviewprovider;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field GigyaWebViewProvider this$0>
				params = gsobject;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field GSObject val$params>
				callback = LoginProvider.ProviderCallback.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field LoginProvider$ProviderCallback val$callback>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
	}

}
