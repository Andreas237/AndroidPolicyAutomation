// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.GSRequest;
import com.gigya.socialize.android.GSAPI;
import com.gigya.socialize.android.GSSession;
import com.gigya.socialize.android.ui.HostActivity;
import com.gigya.socialize.android.ui.WebViewFragment;

public class ProviderSelection
{
	public static interface ProviderSelectionHandler
	{

		public abstract void onCancel(ProviderSelection providerselection, FragmentActivity fragmentactivity);

		public abstract void onError(ProviderSelection providerselection, FragmentActivity fragmentactivity, GSObject gsobject);

		public abstract void onSelect(ProviderSelection providerselection, FragmentActivity fragmentactivity, String s, String s1);

		public abstract void onShow(ProviderSelection providerselection, FragmentActivity fragmentactivity);
	}


	public ProviderSelection()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		disableSelection = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #27  <Field boolean disableSelection>
	//    5    9:return          
	}

	public void dismissProgressDialog()
	{
		HostActivity.getActivity(hostActivityId).dismissProgressDialog();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Integer hostActivityId>
	//    2    4:invokestatic    #45  <Method HostActivity HostActivity.getActivity(Integer)>
	//    3    7:invokevirtual   #47  <Method void HostActivity.dismissProgressDialog()>
	//    4   10:return          
	}

	public void finish()
	{
		HostActivity.getActivity(hostActivityId).finish();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Integer hostActivityId>
	//    2    4:invokestatic    #45  <Method HostActivity HostActivity.getActivity(Integer)>
	//    3    7:invokevirtual   #50  <Method void HostActivity.finish()>
	//    4   10:return          
	}

	public String getUrl(com.gigya.socialize.android.GSLoginRequest.LoginRequestType loginrequesttype, GSObject gsobject)
	{
		GSObject gsobject1 = new GSObject();
	//    0    0:new             #54  <Class GSObject>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void GSObject()>
	//    3    7:astore_3        
		gsobject1.put("apiKey", GSAPI.getInstance().getAPIKey());
	//    4    8:aload_3         
	//    5    9:ldc1            #57  <String "apiKey">
	//    6   11:invokestatic    #63  <Method GSAPI GSAPI.getInstance()>
	//    7   14:invokevirtual   #67  <Method String GSAPI.getAPIKey()>
	//    8   17:invokevirtual   #71  <Method void GSObject.put(String, String)>
		gsobject1.put("requestType", loginrequesttype.toString());
	//    9   20:aload_3         
	//   10   21:ldc1            #73  <String "requestType">
	//   11   23:aload_1         
	//   12   24:invokevirtual   #78  <Method String com.gigya.socialize.android.GSLoginRequest$LoginRequestType.toString()>
	//   13   27:invokevirtual   #71  <Method void GSObject.put(String, String)>
		gsobject1.put("enabledProviders", gsobject.getString("enabledProviders", ((String) (null))));
	//   14   30:aload_3         
	//   15   31:ldc1            #80  <String "enabledProviders">
	//   16   33:aload_2         
	//   17   34:ldc1            #80  <String "enabledProviders">
	//   18   36:aconst_null     
	//   19   37:invokevirtual   #84  <Method String GSObject.getString(String, String)>
	//   20   40:invokevirtual   #71  <Method void GSObject.put(String, String)>
		gsobject1.put("disabledProviders", gsobject.getString("disabledProviders", ((String) (null))));
	//   21   43:aload_3         
	//   22   44:ldc1            #86  <String "disabledProviders">
	//   23   46:aload_2         
	//   24   47:ldc1            #86  <String "disabledProviders">
	//   25   49:aconst_null     
	//   26   50:invokevirtual   #84  <Method String GSObject.getString(String, String)>
	//   27   53:invokevirtual   #71  <Method void GSObject.put(String, String)>
		gsobject1.put("lang", gsobject.getString("lang", ((String) (null))));
	//   28   56:aload_3         
	//   29   57:ldc1            #88  <String "lang">
	//   30   59:aload_2         
	//   31   60:ldc1            #88  <String "lang">
	//   32   62:aconst_null     
	//   33   63:invokevirtual   #84  <Method String GSObject.getString(String, String)>
	//   34   66:invokevirtual   #71  <Method void GSObject.put(String, String)>
		gsobject1.put("cid", gsobject.getString("cid", ((String) (null))));
	//   35   69:aload_3         
	//   36   70:ldc1            #90  <String "cid">
	//   37   72:aload_2         
	//   38   73:ldc1            #90  <String "cid">
	//   39   75:aconst_null     
	//   40   76:invokevirtual   #84  <Method String GSObject.getString(String, String)>
	//   41   79:invokevirtual   #71  <Method void GSObject.put(String, String)>
		gsobject1.put("sdk", "android_3.3.26");
	//   42   82:aload_3         
	//   43   83:ldc1            #92  <String "sdk">
	//   44   85:ldc1            #94  <String "android_3.3.26">
	//   45   87:invokevirtual   #71  <Method void GSObject.put(String, String)>
		gsobject1.put("lastLoginProvider", GSAPI.getInstance().getLastLoginProvider());
	//   46   90:aload_3         
	//   47   91:ldc1            #96  <String "lastLoginProvider">
	//   48   93:invokestatic    #63  <Method GSAPI GSAPI.getInstance()>
	//   49   96:invokevirtual   #99  <Method String GSAPI.getLastLoginProvider()>
	//   50   99:invokevirtual   #71  <Method void GSObject.put(String, String)>
		gsobject1.put("redirect_uri", "gsapi://result/");
	//   51  102:aload_3         
	//   52  103:ldc1            #101 <String "redirect_uri">
	//   53  105:ldc1            #15  <String "gsapi://result/">
	//   54  107:invokevirtual   #71  <Method void GSObject.put(String, String)>
		gsobject1.put("sdk", "android_3.3.26");
	//   55  110:aload_3         
	//   56  111:ldc1            #92  <String "sdk">
	//   57  113:ldc1            #94  <String "android_3.3.26">
	//   58  115:invokevirtual   #71  <Method void GSObject.put(String, String)>
		if(loginrequesttype.equals(((Object) (com.gigya.socialize.android.GSLoginRequest.LoginRequestType.addConnection))))
	//*  59  118:aload_1         
	//*  60  119:getstatic       #105 <Field com.gigya.socialize.android.GSLoginRequest$LoginRequestType com.gigya.socialize.android.GSLoginRequest$LoginRequestType.addConnection>
	//*  61  122:invokevirtual   #109 <Method boolean com.gigya.socialize.android.GSLoginRequest$LoginRequestType.equals(Object)>
	//*  62  125:ifeq            143
			gsobject1.put("oauth_token", GSAPI.getInstance().getSession().getToken());
	//   63  128:aload_3         
	//   64  129:ldc1            #111 <String "oauth_token">
	//   65  131:invokestatic    #63  <Method GSAPI GSAPI.getInstance()>
	//   66  134:invokevirtual   #115 <Method GSSession GSAPI.getSession()>
	//   67  137:invokevirtual   #120 <Method String GSSession.getToken()>
	//   68  140:invokevirtual   #71  <Method void GSObject.put(String, String)>
		loginrequesttype = ((com.gigya.socialize.android.GSLoginRequest.LoginRequestType) (GSRequest.buildQS(gsobject1)));
	//   69  143:aload_3         
	//   70  144:invokestatic    #126 <Method String GSRequest.buildQS(GSObject)>
	//   71  147:astore_1        
		return String.format("%s://%s.%s/%s?%s", new Object[] {
			"https", "socialize", GSAPI.getInstance().getAPIDomain(), "gs/mobile/loginui.aspx", loginrequesttype
		});
	//   72  148:ldc1            #128 <String "%s://%s.%s/%s?%s">
	//   73  150:iconst_5        
	//   74  151:anewarray       Object[]
	//   75  154:dup             
	//   76  155:iconst_0        
	//   77  156:ldc1            #130 <String "https">
	//   78  158:aastore         
	//   79  159:dup             
	//   80  160:iconst_1        
	//   81  161:ldc1            #132 <String "socialize">
	//   82  163:aastore         
	//   83  164:dup             
	//   84  165:iconst_2        
	//   85  166:invokestatic    #63  <Method GSAPI GSAPI.getInstance()>
	//   86  169:invokevirtual   #135 <Method String GSAPI.getAPIDomain()>
	//   87  172:aastore         
	//   88  173:dup             
	//   89  174:iconst_3        
	//   90  175:ldc1            #137 <String "gs/mobile/loginui.aspx">
	//   91  177:aastore         
	//   92  178:dup             
	//   93  179:iconst_4        
	//   94  180:aload_1         
	//   95  181:aastore         
	//   96  182:invokestatic    #143 <Method String String.format(String, Object[])>
	//   97  185:areturn         
	}

	public void setDisableSelection(boolean flag)
	{
		disableSelection = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field boolean disableSelection>
	//    3    5:return          
	}

	public void show()
	{
		HostActivity hostactivity = HostActivity.getActivity(hostActivityId);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Integer hostActivityId>
	//    2    4:invokestatic    #45  <Method HostActivity HostActivity.getActivity(Integer)>
	//    3    7:astore_1        
		fragment.show(((FragmentActivity) (hostactivity)));
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field WebViewFragment fragment>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #151 <Method void WebViewFragment.show(FragmentActivity)>
	//    8   16:return          
	}

	public void show(final com.gigya.socialize.android.GSLoginRequest.LoginRequestType mode, final GSObject params, final ProviderSelectionHandler callback)
	{
		hostActivityId = HostActivity.create(GSAPI.getInstance().getContext(), new com.gigya.socialize.android.ui.HostActivity.HostActivityHandler() {

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
					fragment = (WebViewFragment)fragmentactivity.getSupportFragmentManager().findFragmentByTag("GigyaWebViewFragment");
			//   18   37:aload_0         
			//   19   38:getfield        #25  <Field ProviderSelection this$0>
			//   20   41:aload_1         
			//   21   42:invokevirtual   #73  <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
			//   22   45:ldc1            #75  <String "GigyaWebViewFragment">
			//   23   47:invokevirtual   #81  <Method android.support.v4.app.Fragment FragmentManager.findFragmentByTag(String)>
			//   24   50:checkcast       #83  <Class WebViewFragment>
			//   25   53:invokestatic    #87  <Method WebViewFragment ProviderSelection.access$002(ProviderSelection, WebViewFragment)>
			//   26   56:pop             
					if(fragment == null)
			//*  27   57:aload_0         
			//*  28   58:getfield        #25  <Field ProviderSelection this$0>
			//*  29   61:invokestatic    #91  <Method WebViewFragment ProviderSelection.access$000(ProviderSelection)>
			//*  30   64:ifnonnull       123
					{
						fragment = WebViewFragment.create(fragmentactivity, "GigyaWebViewFragment", ((String) (bundle)), getUrl(mode, params), "gsapi://result/", ((_cls1) (fragmentactivity)). new com.gigya.socialize.android.ui.WebViewFragment.WebViewFragmentHandler() {

							public void onResult(GSObject gsobject)
							{
								if(gsobject.getInt("errorCode", 0) != 0)
							//*   0    0:aload_1         
							//*   1    1:ldc1            #29  <String "errorCode">
							//*   2    3:iconst_0        
							//*   3    4:invokevirtual   #35  <Method int GSObject.getInt(String, int)>
							//*   4    7:ifeq            35
								{
									callback.onError(_fld0, activity, gsobject);
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
								if(!disableSelection)
							//*  16   35:aload_0         
							//*  17   36:getfield        #19  <Field ProviderSelection$1 this$1>
							//*  18   39:getfield        #43  <Field ProviderSelection ProviderSelection$1.this$0>
							//*  19   42:invokestatic    #55  <Method boolean ProviderSelection.access$100(ProviderSelection)>
							//*  20   45:ifne            87
									callback.onSelect(_fld0, activity, gsobject.getString("provider", ""), gsobject.getString("displayName", ""));
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

							final _cls1 this$1;
							final FragmentActivity val$activity;

			
			{
				this$1 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ProviderSelection$1 this$1>
				activity = FragmentActivity.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field FragmentActivity val$activity>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
						}
, Boolean.valueOf(false));
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
						fragment.setRetainInstance(true);
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
			final ProviderSelectionHandler val$callback;
			final com.gigya.socialize.android.GSLoginRequest.LoginRequestType val$mode;
			final GSObject val$params;

			
			{
				this$0 = ProviderSelection.this;
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
				callback = providerselectionhandler;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #31  <Field ProviderSelection$ProviderSelectionHandler val$callback>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #34  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:invokestatic    #63  <Method GSAPI GSAPI.getInstance()>
	//    2    4:invokevirtual   #156 <Method android.content.Context GSAPI.getContext()>
	//    3    7:new             #6   <Class ProviderSelection$1>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokespecial   #159 <Method void ProviderSelection$1(ProviderSelection, com.gigya.socialize.android.GSLoginRequest$LoginRequestType, GSObject, ProviderSelection$ProviderSelectionHandler)>
	//   10   18:invokestatic    #163 <Method Integer HostActivity.create(android.content.Context, com.gigya.socialize.android.ui.HostActivity$HostActivityHandler)>
	//   11   21:putfield        #39  <Field Integer hostActivityId>
	//   12   24:return          
	}

	public void showProgressDialog(String s)
	{
		HostActivity.getActivity(hostActivityId).showProgressDialog(s);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Integer hostActivityId>
	//    2    4:invokestatic    #45  <Method HostActivity HostActivity.getActivity(Integer)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #167 <Method void HostActivity.showProgressDialog(String)>
	//    5   11:return          
	}

	private static final String GSAPIURL_RESULT = "gsapi://result/";
	private boolean disableSelection;
	private WebViewFragment fragment;
	private Integer hostActivityId;


/*
	static WebViewFragment access$000(ProviderSelection providerselection)
	{
		return providerselection.fragment;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field WebViewFragment fragment>
	//    2    4:areturn         
	}

*/


/*
	static WebViewFragment access$002(ProviderSelection providerselection, WebViewFragment webviewfragment)
	{
		providerselection.fragment = webviewfragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field WebViewFragment fragment>
		return webviewfragment;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static boolean access$100(ProviderSelection providerselection)
	{
		return providerselection.disableSelection;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field boolean disableSelection>
	//    2    4:ireturn         
	}

*/
}
