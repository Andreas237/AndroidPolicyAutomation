// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.*;

// Referenced classes of package com.facebook.login:
//			WebLoginMethodHandler, LoginClient

class WebViewLoginMethodHandler extends WebLoginMethodHandler
{
	static class AuthDialogBuilder extends com.facebook.internal.WebDialog.Builder
	{

		public WebDialog build()
		{
			Bundle bundle = getParameters();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #30  <Method Bundle getParameters()>
		//    2    4:astore_1        
			bundle.putString("redirect_uri", redirect_uri);
		//    3    5:aload_1         
		//    4    6:ldc1            #31  <String "redirect_uri">
		//    5    8:aload_0         
		//    6    9:getfield        #23  <Field String redirect_uri>
		//    7   12:invokevirtual   #37  <Method void Bundle.putString(String, String)>
			bundle.putString("client_id", getApplicationId());
		//    8   15:aload_1         
		//    9   16:ldc1            #39  <String "client_id">
		//   10   18:aload_0         
		//   11   19:invokevirtual   #43  <Method String getApplicationId()>
		//   12   22:invokevirtual   #37  <Method void Bundle.putString(String, String)>
			bundle.putString("e2e", e2e);
		//   13   25:aload_1         
		//   14   26:ldc1            #44  <String "e2e">
		//   15   28:aload_0         
		//   16   29:getfield        #46  <Field String e2e>
		//   17   32:invokevirtual   #37  <Method void Bundle.putString(String, String)>
			bundle.putString("response_type", "token,signed_request");
		//   18   35:aload_1         
		//   19   36:ldc1            #48  <String "response_type">
		//   20   38:ldc1            #50  <String "token,signed_request">
		//   21   40:invokevirtual   #37  <Method void Bundle.putString(String, String)>
			bundle.putString("return_scopes", "true");
		//   22   43:aload_1         
		//   23   44:ldc1            #52  <String "return_scopes">
		//   24   46:ldc1            #54  <String "true">
		//   25   48:invokevirtual   #37  <Method void Bundle.putString(String, String)>
			bundle.putString("auth_type", authType);
		//   26   51:aload_1         
		//   27   52:ldc1            #56  <String "auth_type">
		//   28   54:aload_0         
		//   29   55:getfield        #58  <Field String authType>
		//   30   58:invokevirtual   #37  <Method void Bundle.putString(String, String)>
			return WebDialog.newInstance(getContext(), "oauth", bundle, getTheme(), getListener());
		//   31   61:aload_0         
		//   32   62:invokevirtual   #62  <Method Context getContext()>
		//   33   65:ldc1            #11  <String "oauth">
		//   34   67:aload_1         
		//   35   68:aload_0         
		//   36   69:invokevirtual   #66  <Method int getTheme()>
		//   37   72:aload_0         
		//   38   73:invokevirtual   #70  <Method com.facebook.internal.WebDialog$OnCompleteListener getListener()>
		//   39   76:invokestatic    #76  <Method WebDialog WebDialog.newInstance(Context, String, Bundle, int, com.facebook.internal.WebDialog$OnCompleteListener)>
		//   40   79:areturn         
		}

		public AuthDialogBuilder setAuthType(String s)
		{
			authType = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #58  <Field String authType>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public AuthDialogBuilder setE2E(String s)
		{
			e2e = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #46  <Field String e2e>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public AuthDialogBuilder setIsChromeOS(boolean flag)
		{
			String s;
			if(flag)
		//*   0    0:iload_1         
		//*   1    1:ifeq            10
				s = "fbconnect://chrome_os_success";
		//    2    4:ldc1            #83  <String "fbconnect://chrome_os_success">
		//    3    6:astore_2        
			else
		//*   4    7:goto            13
				s = "fbconnect://success";
		//    5   10:ldc1            #21  <String "fbconnect://success">
		//    6   12:astore_2        
			redirect_uri = s;
		//    7   13:aload_0         
		//    8   14:aload_2         
		//    9   15:putfield        #23  <Field String redirect_uri>
			return this;
		//   10   18:aload_0         
		//   11   19:areturn         
		}

		public AuthDialogBuilder setIsRerequest(boolean flag)
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		private static final String OAUTH_DIALOG = "oauth";
		private String authType;
		private String e2e;
		private String redirect_uri;

		public AuthDialogBuilder(Context context, String s, Bundle bundle)
		{
			super(context, s, "oauth", bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:ldc1            #11  <String "oauth">
		//    4    5:aload_3         
		//    5    6:invokespecial   #19  <Method void com.facebook.internal.WebDialog$Builder(Context, String, String, Bundle)>
			redirect_uri = "fbconnect://success";
		//    6    9:aload_0         
		//    7   10:ldc1            #21  <String "fbconnect://success">
		//    8   12:putfield        #23  <Field String redirect_uri>
		//    9   15:return          
		}
	}


	WebViewLoginMethodHandler(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void WebLoginMethodHandler(Parcel)>
		e2e = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #35  <Method String Parcel.readString()>
	//    6   10:putfield        #37  <Field String e2e>
	//    7   13:return          
	}

	WebViewLoginMethodHandler(LoginClient loginclient)
	{
		super(loginclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method void WebLoginMethodHandler(LoginClient)>
	//    3    5:return          
	}

	void cancel()
	{
		WebDialog webdialog = loginDialog;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WebDialog loginDialog>
	//    2    4:astore_1        
		if(webdialog != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			webdialog.cancel();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #47  <Method void WebDialog.cancel()>
			loginDialog = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #43  <Field WebDialog loginDialog>
		}
	//   10   18:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	String getNameForLogging()
	{
		return "web_view";
	//    0    0:ldc1            #52  <String "web_view">
	//    1    2:areturn         
	}

	AccessTokenSource getTokenSource()
	{
		return AccessTokenSource.WEB_VIEW;
	//    0    0:getstatic       #60  <Field AccessTokenSource AccessTokenSource.WEB_VIEW>
	//    1    3:areturn         
	}

	boolean needsInternetPermission()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	void onWebDialogComplete(LoginClient.Request request, Bundle bundle, FacebookException facebookexception)
	{
		super.onComplete(request, bundle, facebookexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #67  <Method void WebLoginMethodHandler.onComplete(LoginClient$Request, Bundle, FacebookException)>
	//    5    7:return          
	}

	boolean tryAuthorize(final LoginClient.Request request)
	{
		Bundle bundle = getParameters(request);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #73  <Method Bundle getParameters(LoginClient$Request)>
	//    3    5:astore          4
		com.facebook.internal.WebDialog.OnCompleteListener oncompletelistener = new com.facebook.internal.WebDialog.OnCompleteListener() {

			public void onComplete(Bundle bundle1, FacebookException facebookexception)
			{
				onWebDialogComplete(request, bundle1, facebookexception);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field WebViewLoginMethodHandler this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field LoginClient$Request val$request>
			//    4    8:aload_1         
			//    5    9:aload_2         
			//    6   10:invokevirtual   #31  <Method void WebViewLoginMethodHandler.onWebDialogComplete(LoginClient$Request, Bundle, FacebookException)>
			//    7   13:return          
			}

			final WebViewLoginMethodHandler this$0;
			final LoginClient.Request val$request;

			
			{
				this$0 = WebViewLoginMethodHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field WebViewLoginMethodHandler this$0>
				request = request1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field LoginClient$Request val$request>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    4    7:new             #6   <Class WebViewLoginMethodHandler$1>
	//    5   10:dup             
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:invokespecial   #76  <Method void WebViewLoginMethodHandler$1(WebViewLoginMethodHandler, LoginClient$Request)>
	//    9   16:astore          5
		e2e = LoginClient.getE2E();
	//   10   18:aload_0         
	//   11   19:invokestatic    #81  <Method String LoginClient.getE2E()>
	//   12   22:putfield        #37  <Field String e2e>
		addLoggingExtra("e2e", ((Object) (e2e)));
	//   13   25:aload_0         
	//   14   26:ldc1            #82  <String "e2e">
	//   15   28:aload_0         
	//   16   29:getfield        #37  <Field String e2e>
	//   17   32:invokevirtual   #86  <Method void addLoggingExtra(String, Object)>
		FragmentActivity fragmentactivity = loginClient.getActivity();
	//   18   35:aload_0         
	//   19   36:getfield        #90  <Field LoginClient loginClient>
	//   20   39:invokevirtual   #94  <Method FragmentActivity LoginClient.getActivity()>
	//   21   42:astore_3        
		boolean flag = Utility.isChromeOS(((Context) (fragmentactivity)));
	//   22   43:aload_3         
	//   23   44:invokestatic    #100 <Method boolean Utility.isChromeOS(Context)>
	//   24   47:istore_2        
		loginDialog = (new AuthDialogBuilder(((Context) (fragmentactivity)), request.getApplicationId(), bundle)).setE2E(e2e).setIsChromeOS(flag).setAuthType(request.getAuthType()).setOnCompleteListener(oncompletelistener).build();
	//   25   48:aload_0         
	//   26   49:new             #10  <Class WebViewLoginMethodHandler$AuthDialogBuilder>
	//   27   52:dup             
	//   28   53:aload_3         
	//   29   54:aload_1         
	//   30   55:invokevirtual   #105 <Method String LoginClient$Request.getApplicationId()>
	//   31   58:aload           4
	//   32   60:invokespecial   #108 <Method void WebViewLoginMethodHandler$AuthDialogBuilder(Context, String, Bundle)>
	//   33   63:aload_0         
	//   34   64:getfield        #37  <Field String e2e>
	//   35   67:invokevirtual   #112 <Method WebViewLoginMethodHandler$AuthDialogBuilder WebViewLoginMethodHandler$AuthDialogBuilder.setE2E(String)>
	//   36   70:iload_2         
	//   37   71:invokevirtual   #116 <Method WebViewLoginMethodHandler$AuthDialogBuilder WebViewLoginMethodHandler$AuthDialogBuilder.setIsChromeOS(boolean)>
	//   38   74:aload_1         
	//   39   75:invokevirtual   #119 <Method String LoginClient$Request.getAuthType()>
	//   40   78:invokevirtual   #122 <Method WebViewLoginMethodHandler$AuthDialogBuilder WebViewLoginMethodHandler$AuthDialogBuilder.setAuthType(String)>
	//   41   81:aload           5
	//   42   83:invokevirtual   #126 <Method com.facebook.internal.WebDialog$Builder WebViewLoginMethodHandler$AuthDialogBuilder.setOnCompleteListener(com.facebook.internal.WebDialog$OnCompleteListener)>
	//   43   86:invokevirtual   #132 <Method WebDialog com.facebook.internal.WebDialog$Builder.build()>
	//   44   89:putfield        #43  <Field WebDialog loginDialog>
		request = ((LoginClient.Request) (new FacebookDialogFragment()));
	//   45   92:new             #134 <Class FacebookDialogFragment>
	//   46   95:dup             
	//   47   96:invokespecial   #135 <Method void FacebookDialogFragment()>
	//   48   99:astore_1        
		((FacebookDialogFragment) (request)).setRetainInstance(true);
	//   49  100:aload_1         
	//   50  101:iconst_1        
	//   51  102:invokevirtual   #139 <Method void FacebookDialogFragment.setRetainInstance(boolean)>
		((FacebookDialogFragment) (request)).setDialog(((android.app.Dialog) (loginDialog)));
	//   52  105:aload_1         
	//   53  106:aload_0         
	//   54  107:getfield        #43  <Field WebDialog loginDialog>
	//   55  110:invokevirtual   #143 <Method void FacebookDialogFragment.setDialog(android.app.Dialog)>
		((FacebookDialogFragment) (request)).show(fragmentactivity.getSupportFragmentManager(), "FacebookDialogFragment");
	//   56  113:aload_1         
	//   57  114:aload_3         
	//   58  115:invokevirtual   #149 <Method android.support.v4.app.FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   59  118:ldc1            #151 <String "FacebookDialogFragment">
	//   60  120:invokevirtual   #155 <Method void FacebookDialogFragment.show(android.support.v4.app.FragmentManager, String)>
		return true;
	//   61  123:iconst_1        
	//   62  124:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #159 <Method void WebLoginMethodHandler.writeToParcel(Parcel, int)>
		parcel.writeString(e2e);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field String e2e>
	//    7   11:invokevirtual   #163 <Method void Parcel.writeString(String)>
	//    8   14:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public WebViewLoginMethodHandler createFromParcel(Parcel parcel)
		{
			return new WebViewLoginMethodHandler(parcel);
		//    0    0:new             #9   <Class WebViewLoginMethodHandler>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void WebViewLoginMethodHandler(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method WebViewLoginMethodHandler createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public WebViewLoginMethodHandler[] newArray(int i)
		{
			return new WebViewLoginMethodHandler[i];
		//    0    0:iload_1         
		//    1    1:anewarray       WebViewLoginMethodHandler[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method WebViewLoginMethodHandler[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private String e2e;
	private WebDialog loginDialog;

	static 
	{
	//    0    0:new             #8   <Class WebViewLoginMethodHandler$2>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void WebViewLoginMethodHandler$2()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
