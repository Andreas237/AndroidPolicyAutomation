// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.ui.WebViewFragment;

// Referenced classes of package com.gigya.socialize.android.login:
//			ProviderSelection

class ProviderSelection$1$1
	implements com.gigya.socialize.android.ui.wFragmentHandler
{

	public void onResult(GSObject gsobject)
	{
		if(gsobject.getInt("errorCode", 0) != 0)
	//*   0    0:aload_1         
	//*   1    1:ldc1            #29  <String "errorCode">
	//*   2    3:iconst_0        
	//*   3    4:invokevirtual   #35  <Method int GSObject.getInt(String, int)>
	//*   4    7:ifeq            35
		{
			val$callback.onError(this$0, val$activity, gsobject);
	//    5   10:aload_0         
	//    6   11:getfield        #19  <Field ProviderSelection$1 this$1>
	//    7   14:getfield        #39  <Field ProviderSelection$ProviderSelectionHandler ProviderSelection$1.val$callback>
	//    8   17:aload_0         
	//    9   18:getfield        #19  <Field ProviderSelection$1 this$1>
	//   10   21:getfield        #43  <Field ProviderSelection ProviderSelection$1.this$0>
	//   11   24:aload_0         
	//   12   25:getfield        #21  <Field FragmentActivity val$activity>
	//   13   28:aload_1         
	//   14   29:invokeinterface #49  <Method void ProviderSelection$ProviderSelectionHandler.onError(ProviderSelection, FragmentActivity, GSObject)>
			return;
	//   15   34:return          
		}
		if(!ProviderSelection.access$100(this$0))
	//*  16   35:aload_0         
	//*  17   36:getfield        #19  <Field ProviderSelection$1 this$1>
	//*  18   39:getfield        #43  <Field ProviderSelection ProviderSelection$1.this$0>
	//*  19   42:invokestatic    #55  <Method boolean ProviderSelection.access$100(ProviderSelection)>
	//*  20   45:ifne            87
			val$callback.onSelect(this$0, val$activity, gsobject.getString("provider", ""), gsobject.getString("displayName", ""));
	//   21   48:aload_0         
	//   22   49:getfield        #19  <Field ProviderSelection$1 this$1>
	//   23   52:getfield        #39  <Field ProviderSelection$ProviderSelectionHandler ProviderSelection$1.val$callback>
	//   24   55:aload_0         
	//   25   56:getfield        #19  <Field ProviderSelection$1 this$1>
	//   26   59:getfield        #43  <Field ProviderSelection ProviderSelection$1.this$0>
	//   27   62:aload_0         
	//   28   63:getfield        #21  <Field FragmentActivity val$activity>
	//   29   66:aload_1         
	//   30   67:ldc1            #57  <String "provider">
	//   31   69:ldc1            #59  <String "">
	//   32   71:invokevirtual   #63  <Method String GSObject.getString(String, String)>
	//   33   74:aload_1         
	//   34   75:ldc1            #65  <String "displayName">
	//   35   77:ldc1            #59  <String "">
	//   36   79:invokevirtual   #63  <Method String GSObject.getString(String, String)>
	//   37   82:invokeinterface #69  <Method void ProviderSelection$ProviderSelectionHandler.onSelect(ProviderSelection, FragmentActivity, String, String)>
	//   38   87:return          
	}

	final ProviderSelection._cls1 this$1;
	final FragmentActivity val$activity;

	ProviderSelection$1$1()
	{
		this$1 = final__pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ProviderSelection$1 this$1>
		val$activity = FragmentActivity.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field FragmentActivity val$activity>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class com/gigya/socialize/android/login/ProviderSelection$1

/* anonymous class */
	class ProviderSelection._cls1
		implements com.gigya.socialize.android.ui.HostActivity.HostActivityHandler
	{

		public void onActivityResult(FragmentActivity fragmentactivity, int i, int j, Intent intent)
		{
		//    0    0:return          
		}

		public void onCancel(FragmentActivity fragmentactivity)
		{
			callback.onCancel(ProviderSelection.this, fragmentactivity);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field ProviderSelection$ProviderSelectionHandler val$callback>
		//    2    4:aload_0         
		//    3    5:getfield        #25  <Field ProviderSelection this$0>
		//    4    8:aload_1         
		//    5    9:invokeinterface #44  <Method void ProviderSelection$ProviderSelectionHandler.onCancel(ProviderSelection, FragmentActivity)>
		//    6   14:return          
		}

		public void onCreate(FragmentActivity fragmentactivity, Bundle bundle)
		{
			if(bundle == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       123
			{
				if(mode.equals(((Object) (com.gigya.socialize.android.GSLoginRequest.LoginRequestType.addConnection))))
		//*   2    4:aload_0         
		//*   3    5:getfield        #27  <Field com.gigya.socialize.android.GSLoginRequest$LoginRequestType val$mode>
		//*   4    8:getstatic       #51  <Field com.gigya.socialize.android.GSLoginRequest$LoginRequestType com.gigya.socialize.android.GSLoginRequest$LoginRequestType.addConnection>
		//*   5   11:invokevirtual   #55  <Method boolean com.gigya.socialize.android.GSLoginRequest$LoginRequestType.equals(Object)>
		//*   6   14:ifeq            23
					bundle = "Add A Connection";
		//    7   17:ldc1            #57  <String "Add A Connection">
		//    8   19:astore_2        
				else
		//*   9   20:goto            26
					bundle = "Sign In";
		//   10   23:ldc1            #59  <String "Sign In">
		//   11   25:astore_2        
				bundle = ((Bundle) (params.getString("captionText", ((String) (bundle)))));
		//   12   26:aload_0         
		//   13   27:getfield        #29  <Field GSObject val$params>
		//   14   30:ldc1            #61  <String "captionText">
		//   15   32:aload_2         
		//   16   33:invokevirtual   #67  <Method String GSObject.getString(String, String)>
		//   17   36:astore_2        
				ProviderSelection.access$002(ProviderSelection.this, (WebViewFragment)fragmentactivity.getSupportFragmentManager().findFragmentByTag("GigyaWebViewFragment"));
		//   18   37:aload_0         
		//   19   38:getfield        #25  <Field ProviderSelection this$0>
		//   20   41:aload_1         
		//   21   42:invokevirtual   #73  <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
		//   22   45:ldc1            #75  <String "GigyaWebViewFragment">
		//   23   47:invokevirtual   #81  <Method android.support.v4.app.Fragment FragmentManager.findFragmentByTag(String)>
		//   24   50:checkcast       #83  <Class WebViewFragment>
		//   25   53:invokestatic    #87  <Method WebViewFragment ProviderSelection.access$002(ProviderSelection, WebViewFragment)>
		//   26   56:pop             
				if(ProviderSelection.access$000(ProviderSelection.this) == null)
		//*  27   57:aload_0         
		//*  28   58:getfield        #25  <Field ProviderSelection this$0>
		//*  29   61:invokestatic    #91  <Method WebViewFragment ProviderSelection.access$000(ProviderSelection)>
		//*  30   64:ifnonnull       123
				{
					ProviderSelection.access$002(ProviderSelection.this, WebViewFragment.create(fragmentactivity, "GigyaWebViewFragment", ((String) (bundle)), getUrl(mode, params), "gsapi://result/", ((com.gigya.socialize.android.ui.WebViewFragment.WebViewFragmentHandler) (((ProviderSelection._cls1._cls1) (fragmentactivity)). new ProviderSelection._cls1._cls1())), Boolean.valueOf(false)));
		//   31   67:aload_0         
		//   32   68:getfield        #25  <Field ProviderSelection this$0>
		//   33   71:aload_1         
		//   34   72:ldc1            #75  <String "GigyaWebViewFragment">
		//   35   74:aload_2         
		//   36   75:aload_0         
		//   37   76:getfield        #25  <Field ProviderSelection this$0>
		//   38   79:aload_0         
		//   39   80:getfield        #27  <Field com.gigya.socialize.android.GSLoginRequest$LoginRequestType val$mode>
		//   40   83:aload_0         
		//   41   84:getfield        #29  <Field GSObject val$params>
		//   42   87:invokevirtual   #95  <Method String ProviderSelection.getUrl(com.gigya.socialize.android.GSLoginRequest$LoginRequestType, GSObject)>
		//   43   90:ldc1            #97  <String "gsapi://result/">
		//   44   92:new             #13  <Class ProviderSelection$1$1>
		//   45   95:dup             
		//   46   96:aload_0         
		//   47   97:aload_1         
		//   48   98:invokespecial   #100 <Method void ProviderSelection$1$1(ProviderSelection$1, FragmentActivity)>
		//   49  101:iconst_0        
		//   50  102:invokestatic    #106 <Method Boolean Boolean.valueOf(boolean)>
		//   51  105:invokestatic    #110 <Method WebViewFragment WebViewFragment.create(FragmentActivity, String, String, String, String, com.gigya.socialize.android.ui.WebViewFragment$WebViewFragmentHandler, Boolean)>
		//   52  108:invokestatic    #87  <Method WebViewFragment ProviderSelection.access$002(ProviderSelection, WebViewFragment)>
		//   53  111:pop             
					ProviderSelection.access$000(ProviderSelection.this).setRetainInstance(true);
		//   54  112:aload_0         
		//   55  113:getfield        #25  <Field ProviderSelection this$0>
		//   56  116:invokestatic    #91  <Method WebViewFragment ProviderSelection.access$000(ProviderSelection)>
		//   57  119:iconst_1        
		//   58  120:invokevirtual   #114 <Method void WebViewFragment.setRetainInstance(boolean)>
				}
			}
		//   59  123:return          
		}

		public void onResume(FragmentActivity fragmentactivity)
		{
		//    0    0:return          
		}

		public void onStart(FragmentActivity fragmentactivity)
		{
			callback.onShow(ProviderSelection.this, fragmentactivity);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field ProviderSelection$ProviderSelectionHandler val$callback>
		//    2    4:aload_0         
		//    3    5:getfield        #25  <Field ProviderSelection this$0>
		//    4    8:aload_1         
		//    5    9:invokeinterface #119 <Method void ProviderSelection$ProviderSelectionHandler.onShow(ProviderSelection, FragmentActivity)>
		//    6   14:return          
		}

		final ProviderSelection this$0;
		final ProviderSelection.ProviderSelectionHandler val$callback;
		final com.gigya.socialize.android.GSLoginRequest.LoginRequestType val$mode;
		final GSObject val$params;

			
			{
				this$0 = final_providerselection;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field ProviderSelection this$0>
				mode = loginrequesttype;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field com.gigya.socialize.android.GSLoginRequest$LoginRequestType val$mode>
				params = gsobject;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field GSObject val$params>
				callback = ProviderSelection.ProviderSelectionHandler.this;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #31  <Field ProviderSelection$ProviderSelectionHandler val$callback>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #34  <Method void Object()>
			//   14   25:return          
			}
	}

}
