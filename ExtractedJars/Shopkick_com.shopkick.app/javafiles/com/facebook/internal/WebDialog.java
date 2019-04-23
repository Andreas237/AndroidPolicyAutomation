// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.app.*;
import android.content.*;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.*;
import android.webkit.*;
import android.widget.*;
import com.facebook.*;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//			Utility, ServerProtocol, Validate

public class WebDialog extends Dialog
{
	public static class Builder
	{

		private void finishInit(Context context1, String s, Bundle bundle)
		{
			context = context1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #66  <Field Context context>
			action = s;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #68  <Field String action>
			if(bundle != null)
		//*   6   10:aload_3         
		//*   7   11:ifnull          20
			{
				parameters = bundle;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #70  <Field Bundle parameters>
				return;
		//   11   19:return          
			} else
			{
				parameters = new Bundle();
		//   12   20:aload_0         
		//   13   21:new             #72  <Class Bundle>
		//   14   24:dup             
		//   15   25:invokespecial   #73  <Method void Bundle()>
		//   16   28:putfield        #70  <Field Bundle parameters>
				return;
		//   17   31:return          
			}
		}

		public WebDialog build()
		{
			AccessToken accesstoken = accessToken;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field AccessToken accessToken>
		//    2    4:astore_1        
			if(accesstoken != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          41
			{
				parameters.putString("app_id", accesstoken.getApplicationId());
		//    5    9:aload_0         
		//    6   10:getfield        #70  <Field Bundle parameters>
		//    7   13:ldc1            #77  <String "app_id">
		//    8   15:aload_1         
		//    9   16:invokevirtual   #81  <Method String AccessToken.getApplicationId()>
		//   10   19:invokevirtual   #84  <Method void Bundle.putString(String, String)>
				parameters.putString("access_token", accessToken.getToken());
		//   11   22:aload_0         
		//   12   23:getfield        #70  <Field Bundle parameters>
		//   13   26:ldc1            #86  <String "access_token">
		//   14   28:aload_0         
		//   15   29:getfield        #33  <Field AccessToken accessToken>
		//   16   32:invokevirtual   #89  <Method String AccessToken.getToken()>
		//   17   35:invokevirtual   #84  <Method void Bundle.putString(String, String)>
			} else
		//*  18   38:goto            54
			{
				parameters.putString("app_id", applicationId);
		//   19   41:aload_0         
		//   20   42:getfield        #70  <Field Bundle parameters>
		//   21   45:ldc1            #77  <String "app_id">
		//   22   47:aload_0         
		//   23   48:getfield        #45  <Field String applicationId>
		//   24   51:invokevirtual   #84  <Method void Bundle.putString(String, String)>
			}
			return WebDialog.newInstance(context, action, parameters, theme, listener);
		//   25   54:aload_0         
		//   26   55:getfield        #66  <Field Context context>
		//   27   58:aload_0         
		//   28   59:getfield        #68  <Field String action>
		//   29   62:aload_0         
		//   30   63:getfield        #70  <Field Bundle parameters>
		//   31   66:aload_0         
		//   32   67:getfield        #91  <Field int theme>
		//   33   70:aload_0         
		//   34   71:getfield        #93  <Field WebDialog$OnCompleteListener listener>
		//   35   74:invokestatic    #97  <Method WebDialog WebDialog.newInstance(Context, String, Bundle, int, WebDialog$OnCompleteListener)>
		//   36   77:areturn         
		}

		public String getApplicationId()
		{
			return applicationId;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field String applicationId>
		//    2    4:areturn         
		}

		public Context getContext()
		{
			return context;
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field Context context>
		//    2    4:areturn         
		}

		public OnCompleteListener getListener()
		{
			return listener;
		//    0    0:aload_0         
		//    1    1:getfield        #93  <Field WebDialog$OnCompleteListener listener>
		//    2    4:areturn         
		}

		public Bundle getParameters()
		{
			return parameters;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field Bundle parameters>
		//    2    4:areturn         
		}

		public int getTheme()
		{
			return theme;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field int theme>
		//    2    4:ireturn         
		}

		public Builder setOnCompleteListener(OnCompleteListener oncompletelistener)
		{
			listener = oncompletelistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #93  <Field WebDialog$OnCompleteListener listener>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTheme(int i)
		{
			theme = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #91  <Field int theme>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private AccessToken accessToken;
		private String action;
		private String applicationId;
		private Context context;
		private OnCompleteListener listener;
		private Bundle parameters;
		private int theme;

		public Builder(Context context1, String s, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			accessToken = AccessToken.getCurrentAccessToken();
		//    2    4:aload_0         
		//    3    5:invokestatic    #31  <Method AccessToken AccessToken.getCurrentAccessToken()>
		//    4    8:putfield        #33  <Field AccessToken accessToken>
			if(!AccessToken.isCurrentAccessTokenActive())
		//*   5   11:invokestatic    #37  <Method boolean AccessToken.isCurrentAccessTokenActive()>
		//*   6   14:ifne            47
			{
				String s1 = Utility.getMetadataApplicationId(context1);
		//    7   17:aload_1         
		//    8   18:invokestatic    #43  <Method String Utility.getMetadataApplicationId(Context)>
		//    9   21:astore          4
				if(s1 != null)
		//*  10   23:aload           4
		//*  11   25:ifnull          37
					applicationId = s1;
		//   12   28:aload_0         
		//   13   29:aload           4
		//   14   31:putfield        #45  <Field String applicationId>
				else
		//*  15   34:goto            47
					throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
		//   16   37:new             #47  <Class FacebookException>
		//   17   40:dup             
		//   18   41:ldc1            #49  <String "Attempted to create a builder without a valid access token or a valid default Application ID.">
		//   19   43:invokespecial   #52  <Method void FacebookException(String)>
		//   20   46:athrow          
			}
			finishInit(context1, s, bundle);
		//   21   47:aload_0         
		//   22   48:aload_1         
		//   23   49:aload_2         
		//   24   50:aload_3         
		//   25   51:invokespecial   #55  <Method void finishInit(Context, String, Bundle)>
		//   26   54:return          
		}

		public Builder(Context context1, String s, String s1, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			String s2 = s;
		//    2    4:aload_2         
		//    3    5:astore          5
			if(s == null)
		//*   4    7:aload_2         
		//*   5    8:ifnonnull       17
				s2 = Utility.getMetadataApplicationId(context1);
		//    6   11:aload_1         
		//    7   12:invokestatic    #43  <Method String Utility.getMetadataApplicationId(Context)>
		//    8   15:astore          5
			Validate.notNullOrEmpty(s2, "applicationId");
		//    9   17:aload           5
		//   10   19:ldc1            #58  <String "applicationId">
		//   11   21:invokestatic    #64  <Method void Validate.notNullOrEmpty(String, String)>
			applicationId = s2;
		//   12   24:aload_0         
		//   13   25:aload           5
		//   14   27:putfield        #45  <Field String applicationId>
			finishInit(context1, s1, bundle);
		//   15   30:aload_0         
		//   16   31:aload_1         
		//   17   32:aload_3         
		//   18   33:aload           4
		//   19   35:invokespecial   #55  <Method void finishInit(Context, String, Bundle)>
		//   20   38:return          
		}
	}

	private class DialogWebViewClient extends WebViewClient
	{

		public void onPageFinished(WebView webview, String s)
		{
			super.onPageFinished(webview, s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #24  <Method void WebViewClient.onPageFinished(WebView, String)>
			if(!isDetached)
		//*   4    6:aload_0         
		//*   5    7:getfield        #13  <Field WebDialog this$0>
		//*   6   10:invokestatic    #28  <Method boolean WebDialog.access$200(WebDialog)>
		//*   7   13:ifne            26
				spinner.dismiss();
		//    8   16:aload_0         
		//    9   17:getfield        #13  <Field WebDialog this$0>
		//   10   20:invokestatic    #32  <Method ProgressDialog WebDialog.access$300(WebDialog)>
		//   11   23:invokevirtual   #37  <Method void ProgressDialog.dismiss()>
			contentFrameLayout.setBackgroundColor(0);
		//   12   26:aload_0         
		//   13   27:getfield        #13  <Field WebDialog this$0>
		//   14   30:invokestatic    #41  <Method FrameLayout WebDialog.access$400(WebDialog)>
		//   15   33:iconst_0        
		//   16   34:invokevirtual   #47  <Method void FrameLayout.setBackgroundColor(int)>
			webView.setVisibility(0);
		//   17   37:aload_0         
		//   18   38:getfield        #13  <Field WebDialog this$0>
		//   19   41:invokestatic    #51  <Method WebView WebDialog.access$500(WebDialog)>
		//   20   44:iconst_0        
		//   21   45:invokevirtual   #56  <Method void WebView.setVisibility(int)>
			crossImageView.setVisibility(0);
		//   22   48:aload_0         
		//   23   49:getfield        #13  <Field WebDialog this$0>
		//   24   52:invokestatic    #60  <Method ImageView WebDialog.access$600(WebDialog)>
		//   25   55:iconst_0        
		//   26   56:invokevirtual   #63  <Method void ImageView.setVisibility(int)>
			isPageFinished = true;
		//   27   59:aload_0         
		//   28   60:getfield        #13  <Field WebDialog this$0>
		//   29   63:iconst_1        
		//   30   64:invokestatic    #67  <Method boolean WebDialog.access$702(WebDialog, boolean)>
		//   31   67:pop             
		//   32   68:return          
		}

		public void onPageStarted(WebView webview, String s, Bitmap bitmap)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #71  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #72  <Method void StringBuilder()>
		//    3    7:astore          4
			stringbuilder.append("Webview loading URL: ");
		//    4    9:aload           4
		//    5   11:ldc1            #74  <String "Webview loading URL: ">
		//    6   13:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
		//    7   16:pop             
			stringbuilder.append(s);
		//    8   17:aload           4
		//    9   19:aload_2         
		//   10   20:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
		//   11   23:pop             
			Utility.logd("FacebookSDK.WebDialog", stringbuilder.toString());
		//   12   24:ldc1            #80  <String "FacebookSDK.WebDialog">
		//   13   26:aload           4
		//   14   28:invokevirtual   #84  <Method String StringBuilder.toString()>
		//   15   31:invokestatic    #90  <Method void Utility.logd(String, String)>
			super.onPageStarted(webview, s, bitmap);
		//   16   34:aload_0         
		//   17   35:aload_1         
		//   18   36:aload_2         
		//   19   37:aload_3         
		//   20   38:invokespecial   #92  <Method void WebViewClient.onPageStarted(WebView, String, Bitmap)>
			if(!isDetached)
		//*  21   41:aload_0         
		//*  22   42:getfield        #13  <Field WebDialog this$0>
		//*  23   45:invokestatic    #28  <Method boolean WebDialog.access$200(WebDialog)>
		//*  24   48:ifne            61
				spinner.show();
		//   25   51:aload_0         
		//   26   52:getfield        #13  <Field WebDialog this$0>
		//   27   55:invokestatic    #32  <Method ProgressDialog WebDialog.access$300(WebDialog)>
		//   28   58:invokevirtual   #95  <Method void ProgressDialog.show()>
		//   29   61:return          
		}

		public void onReceivedError(WebView webview, int i, String s, String s1)
		{
			super.onReceivedError(webview, i, s, s1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #99  <Method void WebViewClient.onReceivedError(WebView, int, String, String)>
			sendErrorToListener(((Throwable) (new FacebookDialogException(s, i, s1))));
		//    6    9:aload_0         
		//    7   10:getfield        #13  <Field WebDialog this$0>
		//    8   13:new             #101 <Class FacebookDialogException>
		//    9   16:dup             
		//   10   17:aload_3         
		//   11   18:iload_2         
		//   12   19:aload           4
		//   13   21:invokespecial   #104 <Method void FacebookDialogException(String, int, String)>
		//   14   24:invokevirtual   #108 <Method void WebDialog.sendErrorToListener(Throwable)>
		//   15   27:return          
		}

		public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
		{
			super.onReceivedSslError(webview, sslerrorhandler, sslerror);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #112 <Method void WebViewClient.onReceivedSslError(WebView, SslErrorHandler, SslError)>
			sslerrorhandler.cancel();
		//    5    7:aload_2         
		//    6    8:invokevirtual   #117 <Method void SslErrorHandler.cancel()>
			sendErrorToListener(((Throwable) (new FacebookDialogException(((String) (null)), -11, ((String) (null))))));
		//    7   11:aload_0         
		//    8   12:getfield        #13  <Field WebDialog this$0>
		//    9   15:new             #101 <Class FacebookDialogException>
		//   10   18:dup             
		//   11   19:aconst_null     
		//   12   20:bipush          -11
		//   13   22:aconst_null     
		//   14   23:invokespecial   #104 <Method void FacebookDialogException(String, int, String)>
		//   15   26:invokevirtual   #108 <Method void WebDialog.sendErrorToListener(Throwable)>
		//   16   29:return          
		}

		public boolean shouldOverrideUrlLoading(WebView webview, String s)
		{
			webview = ((WebView) (new StringBuilder()));
		//    0    0:new             #71  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #72  <Method void StringBuilder()>
		//    3    7:astore_1        
			((StringBuilder) (webview)).append("Redirect URL: ");
		//    4    8:aload_1         
		//    5    9:ldc1            #125 <String "Redirect URL: ">
		//    6   11:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			((StringBuilder) (webview)).append(s);
		//    8   15:aload_1         
		//    9   16:aload_2         
		//   10   17:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
		//   11   20:pop             
			Utility.logd("FacebookSDK.WebDialog", ((StringBuilder) (webview)).toString());
		//   12   21:ldc1            #80  <String "FacebookSDK.WebDialog">
		//   13   23:aload_1         
		//   14   24:invokevirtual   #84  <Method String StringBuilder.toString()>
		//   15   27:invokestatic    #90  <Method void Utility.logd(String, String)>
			if(s.startsWith(expectedRedirectUrl))
		//*  16   30:aload_2         
		//*  17   31:aload_0         
		//*  18   32:getfield        #13  <Field WebDialog this$0>
		//*  19   35:invokestatic    #129 <Method String WebDialog.access$100(WebDialog)>
		//*  20   38:invokevirtual   #135 <Method boolean String.startsWith(String)>
		//*  21   41:ifeq            256
			{
				Bundle bundle = parseResponseUri(s);
		//   22   44:aload_0         
		//   23   45:getfield        #13  <Field WebDialog this$0>
		//   24   48:aload_2         
		//   25   49:invokevirtual   #139 <Method Bundle WebDialog.parseResponseUri(String)>
		//   26   52:astore          5
				webview = ((WebView) (bundle.getString("error")));
		//   27   54:aload           5
		//   28   56:ldc1            #141 <String "error">
		//   29   58:invokevirtual   #147 <Method String Bundle.getString(String)>
		//   30   61:astore_1        
				s = ((String) (webview));
		//   31   62:aload_1         
		//   32   63:astore_2        
				if(webview == null)
		//*  33   64:aload_1         
		//*  34   65:ifnonnull       76
					s = bundle.getString("error_type");
		//   35   68:aload           5
		//   36   70:ldc1            #149 <String "error_type">
		//   37   72:invokevirtual   #147 <Method String Bundle.getString(String)>
		//   38   75:astore_2        
				Object obj = ((Object) (bundle.getString("error_msg")));
		//   39   76:aload           5
		//   40   78:ldc1            #151 <String "error_msg">
		//   41   80:invokevirtual   #147 <Method String Bundle.getString(String)>
		//   42   83:astore          4
				webview = ((WebView) (obj));
		//   43   85:aload           4
		//   44   87:astore_1        
				if(obj == null)
		//*  45   88:aload           4
		//*  46   90:ifnonnull       101
					webview = ((WebView) (bundle.getString("error_message")));
		//   47   93:aload           5
		//   48   95:ldc1            #153 <String "error_message">
		//   49   97:invokevirtual   #147 <Method String Bundle.getString(String)>
		//   50  100:astore_1        
				obj = ((Object) (webview));
		//   51  101:aload_1         
		//   52  102:astore          4
				if(webview == null)
		//*  53  104:aload_1         
		//*  54  105:ifnonnull       117
					obj = ((Object) (bundle.getString("error_description")));
		//   55  108:aload           5
		//   56  110:ldc1            #155 <String "error_description">
		//   57  112:invokevirtual   #147 <Method String Bundle.getString(String)>
		//   58  115:astore          4
				webview = ((WebView) (bundle.getString("error_code")));
		//   59  117:aload           5
		//   60  119:ldc1            #157 <String "error_code">
		//   61  121:invokevirtual   #147 <Method String Bundle.getString(String)>
		//   62  124:astore_1        
				int i;
				if(!Utility.isNullOrEmpty(((String) (webview))))
		//*  63  125:aload_1         
		//*  64  126:invokestatic    #160 <Method boolean Utility.isNullOrEmpty(String)>
		//*  65  129:ifne            145
					try
					{
						i = Integer.parseInt(((String) (webview)));
		//   66  132:aload_1         
		//   67  133:invokestatic    #166 <Method int Integer.parseInt(String)>
		//   68  136:istore_3        
					}
		//*  69  137:goto            147
		//*  70  140:iconst_m1       
		//*  71  141:istore_3        
		//*  72  142:goto            147
		//*  73  145:iconst_m1       
		//*  74  146:istore_3        
		//*  75  147:aload_2         
		//*  76  148:invokestatic    #160 <Method boolean Utility.isNullOrEmpty(String)>
		//*  77  151:ifeq            178
		//*  78  154:aload           4
		//*  79  156:invokestatic    #160 <Method boolean Utility.isNullOrEmpty(String)>
		//*  80  159:ifeq            178
		//*  81  162:iload_3         
		//*  82  163:iconst_m1       
		//*  83  164:icmpne          178
		//*  84  167:aload_0         
		//*  85  168:getfield        #13  <Field WebDialog this$0>
		//*  86  171:aload           5
		//*  87  173:invokevirtual   #170 <Method void WebDialog.sendSuccessToListener(Bundle)>
		//*  88  176:iconst_1        
		//*  89  177:ireturn         
		//*  90  178:aload_2         
		//*  91  179:ifnull          209
		//*  92  182:aload_2         
		//*  93  183:ldc1            #172 <String "access_denied">
		//*  94  185:invokevirtual   #176 <Method boolean String.equals(Object)>
		//*  95  188:ifne            200
		//*  96  191:aload_2         
		//*  97  192:ldc1            #178 <String "OAuthAccessDeniedException">
		//*  98  194:invokevirtual   #176 <Method boolean String.equals(Object)>
		//*  99  197:ifeq            209
		//* 100  200:aload_0         
		//* 101  201:getfield        #13  <Field WebDialog this$0>
		//* 102  204:invokevirtual   #179 <Method void WebDialog.cancel()>
		//* 103  207:iconst_1        
		//* 104  208:ireturn         
		//* 105  209:iload_3         
		//* 106  210:sipush          4201
		//* 107  213:icmpne          225
		//* 108  216:aload_0         
		//* 109  217:getfield        #13  <Field WebDialog this$0>
		//* 110  220:invokevirtual   #179 <Method void WebDialog.cancel()>
		//* 111  223:iconst_1        
		//* 112  224:ireturn         
		//* 113  225:new             #181 <Class FacebookRequestError>
		//* 114  228:dup             
		//* 115  229:iload_3         
		//* 116  230:aload_2         
		//* 117  231:aload           4
		//* 118  233:invokespecial   #184 <Method void FacebookRequestError(int, String, String)>
		//* 119  236:astore_1        
		//* 120  237:aload_0         
		//* 121  238:getfield        #13  <Field WebDialog this$0>
		//* 122  241:new             #186 <Class FacebookServiceException>
		//* 123  244:dup             
		//* 124  245:aload_1         
		//* 125  246:aload           4
		//* 126  248:invokespecial   #189 <Method void FacebookServiceException(FacebookRequestError, String)>
		//* 127  251:invokevirtual   #108 <Method void WebDialog.sendErrorToListener(Throwable)>
		//* 128  254:iconst_1        
		//* 129  255:ireturn         
		//* 130  256:aload_2         
		//* 131  257:ldc1            #191 <String "fbconnect://cancel">
		//* 132  259:invokevirtual   #135 <Method boolean String.startsWith(String)>
		//* 133  262:ifeq            274
		//* 134  265:aload_0         
		//* 135  266:getfield        #13  <Field WebDialog this$0>
		//* 136  269:invokevirtual   #179 <Method void WebDialog.cancel()>
		//* 137  272:iconst_1        
		//* 138  273:ireturn         
		//* 139  274:aload_2         
		//* 140  275:ldc1            #193 <String "touch">
		//* 141  277:invokevirtual   #197 <Method boolean String.contains(CharSequence)>
		//* 142  280:ifeq            285
		//* 143  283:iconst_0        
		//* 144  284:ireturn         
		//* 145  285:aload_0         
		//* 146  286:getfield        #13  <Field WebDialog this$0>
		//* 147  289:invokevirtual   #201 <Method Context WebDialog.getContext()>
		//* 148  292:new             #203 <Class Intent>
		//* 149  295:dup             
		//* 150  296:ldc1            #205 <String "android.intent.action.VIEW">
		//* 151  298:aload_2         
		//* 152  299:invokestatic    #211 <Method Uri Uri.parse(String)>
		//* 153  302:invokespecial   #214 <Method void Intent(String, Uri)>
		//* 154  305:invokevirtual   #220 <Method void Context.startActivity(Intent)>
		//* 155  308:iconst_1        
		//* 156  309:ireturn         
					// Misplaced declaration of an exception variable
					catch(WebView webview)
					{
						i = -1;
					}
				else
					i = -1;
				if(Utility.isNullOrEmpty(s) && Utility.isNullOrEmpty(((String) (obj))) && i == -1)
				{
					sendSuccessToListener(bundle);
					return true;
				}
				if(s != null && (s.equals("access_denied") || s.equals("OAuthAccessDeniedException")))
				{
					cancel();
					return true;
				}
				if(i == 4201)
				{
					cancel();
					return true;
				} else
				{
					webview = ((WebView) (new FacebookRequestError(i, s, ((String) (obj)))));
					sendErrorToListener(((Throwable) (new FacebookServiceException(((FacebookRequestError) (webview)), ((String) (obj))))));
					return true;
				}
			}
			if(s.startsWith("fbconnect://cancel"))
			{
				cancel();
				return true;
			}
			if(s.contains("touch"))
				return false;
			try
			{
				getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
			}
		//* 157  310:astore_1        
		//* 158  311:goto            140
			// Misplaced declaration of an exception variable
			catch(WebView webview)
		//* 159  314:astore_1        
			{
				return false;
		//  160  315:iconst_0        
		//  161  316:ireturn         
			}
			return true;
		}

		final WebDialog this$0;

		private DialogWebViewClient()
		{
			this$0 = WebDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field WebDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void WebViewClient()>
		//    5    9:return          
		}

	}

	public static interface OnCompleteListener
	{

		public abstract void onComplete(Bundle bundle, FacebookException facebookexception);
	}

	private class UploadStagingResourcesTask extends AsyncTask
	{

		protected volatile Object doInBackground(Object aobj[])
		{
			return ((Object) (doInBackground((Void[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #38  <Class Void[]>
		//    3    5:invokevirtual   #41  <Method String[] doInBackground(Void[])>
		//    4    8:areturn         
		}

		protected transient String[] doInBackground(Void avoid[])
		{
			final int writeIndex;
			Object obj;
			final String results[];
			CountDownLatch countdownlatch;
			AccessToken accesstoken;
			obj = ((Object) (parameters.getStringArray("media")));
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field Bundle parameters>
		//    2    4:ldc1            #45  <String "media">
		//    3    6:invokevirtual   #51  <Method String[] Bundle.getStringArray(String)>
		//    4    9:astore_3        
			results = new String[obj.length];
		//    5   10:aload_3         
		//    6   11:arraylength     
		//    7   12:anewarray       String[]
		//    8   15:astore          4
			exceptions = new Exception[obj.length];
		//    9   17:aload_0         
		//   10   18:aload_3         
		//   11   19:arraylength     
		//   12   20:anewarray       Exception[]
		//   13   23:putfield        #34  <Field Exception[] exceptions>
			countdownlatch = new CountDownLatch(obj.length);
		//   14   26:new             #55  <Class CountDownLatch>
		//   15   29:dup             
		//   16   30:aload_3         
		//   17   31:arraylength     
		//   18   32:invokespecial   #58  <Method void CountDownLatch(int)>
		//   19   35:astore          5
			avoid = ((Void []) (new ConcurrentLinkedQueue()));
		//   20   37:new             #60  <Class ConcurrentLinkedQueue>
		//   21   40:dup             
		//   22   41:invokespecial   #61  <Method void ConcurrentLinkedQueue()>
		//   23   44:astore_1        
			accesstoken = AccessToken.getCurrentAccessToken();
		//   24   45:invokestatic    #67  <Method AccessToken AccessToken.getCurrentAccessToken()>
		//   25   48:astore          6
			writeIndex = 0;
		//   26   50:iconst_0        
		//   27   51:istore_2        
_L2:
			if(writeIndex >= obj.length)
				break MISSING_BLOCK_LABEL_160;
		//   28   52:iload_2         
		//   29   53:aload_3         
		//   30   54:arraylength     
		//   31   55:icmpge          160
			if(isCancelled())
		//*  32   58:aload_0         
		//*  33   59:invokevirtual   #71  <Method boolean isCancelled()>
		//*  34   62:ifeq            96
			{
				for(obj = ((Object) (((ConcurrentLinkedQueue) (avoid)).iterator())); ((Iterator) (obj)).hasNext(); ((AsyncTask)((Iterator) (obj)).next()).cancel(true));
		//   35   65:aload_1         
		//   36   66:invokevirtual   #75  <Method Iterator ConcurrentLinkedQueue.iterator()>
		//   37   69:astore_3        
		//   38   70:aload_3         
		//   39   71:invokeinterface #80  <Method boolean Iterator.hasNext()>
		//   40   76:ifeq            205
		//   41   79:aload_3         
		//   42   80:invokeinterface #84  <Method Object Iterator.next()>
		//   43   85:checkcast       #5   <Class AsyncTask>
		//   44   88:iconst_1        
		//   45   89:invokevirtual   #88  <Method boolean AsyncTask.cancel(boolean)>
		//   46   92:pop             
				break MISSING_BLOCK_LABEL_205;
		//   47   93:goto            70
			}
			Uri uri = Uri.parse(((String) (obj[writeIndex])));
		//   48   96:aload_3         
		//   49   97:iload_2         
		//   50   98:aaload          
		//   51   99:invokestatic    #94  <Method Uri Uri.parse(String)>
		//   52  102:astore          7
			if(Utility.isWebUri(uri))
		//*  53  104:aload           7
		//*  54  106:invokestatic    #100 <Method boolean Utility.isWebUri(Uri)>
		//*  55  109:ifeq            129
			{
				results[writeIndex] = uri.toString();
		//   56  112:aload           4
		//   57  114:iload_2         
		//   58  115:aload           7
		//   59  117:invokevirtual   #104 <Method String Uri.toString()>
		//   60  120:aastore         
				countdownlatch.countDown();
		//   61  121:aload           5
		//   62  123:invokevirtual   #107 <Method void CountDownLatch.countDown()>
				break MISSING_BLOCK_LABEL_207;
		//   63  126:goto            207
			}
			try
			{
				((ConcurrentLinkedQueue) (avoid)).add(((Object) (ShareInternalUtility.newUploadStagingResourceWithImageRequest(accesstoken, uri, ((_cls1) (countdownlatch)). new com.facebook.GraphRequest.Callback() {

					public void onCompleted(GraphResponse graphresponse)
					{
						Object obj = ((Object) (graphresponse.getError()));
					//    0    0:aload_1         
					//    1    1:invokevirtual   #46  <Method FacebookRequestError GraphResponse.getError()>
					//    2    4:astore_2        
						if(obj == null)
							break MISSING_BLOCK_LABEL_33;
					//    3    5:aload_2         
					//    4    6:ifnull          33
						String s = ((FacebookRequestError) (obj)).getErrorMessage();
					//    5    9:aload_2         
					//    6   10:invokevirtual   #52  <Method String FacebookRequestError.getErrorMessage()>
					//    7   13:astore_3        
						obj = ((Object) (s));
					//    8   14:aload_3         
					//    9   15:astore_2        
						if(s == null)
					//*  10   16:aload_3         
					//*  11   17:ifnonnull       23
							obj = "Error staging photo.";
					//   12   20:ldc1            #54  <String "Error staging photo.">
					//   13   22:astore_2        
						throw new FacebookGraphResponseException(graphresponse, ((String) (obj)));
					//   14   23:new             #56  <Class FacebookGraphResponseException>
					//   15   26:dup             
					//   16   27:aload_1         
					//   17   28:aload_2         
					//   18   29:invokespecial   #59  <Method void FacebookGraphResponseException(GraphResponse, String)>
					//   19   32:athrow          
						graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
					//   20   33:aload_1         
					//   21   34:invokevirtual   #63  <Method JSONObject GraphResponse.getJSONObject()>
					//   22   37:astore_1        
						if(graphresponse == null)
							break MISSING_BLOCK_LABEL_76;
					//   23   38:aload_1         
					//   24   39:ifnull          76
						graphresponse = ((GraphResponse) (((JSONObject) (graphresponse)).optString("uri")));
					//   25   42:aload_1         
					//   26   43:ldc1            #65  <String "uri">
					//   27   45:invokevirtual   #71  <Method String JSONObject.optString(String)>
					//   28   48:astore_1        
						if(graphresponse != null)
					//*  29   49:aload_1         
					//*  30   50:ifnull          66
						{
							try
							{
								results[writeIndex] = ((String) (graphresponse));
					//   31   53:aload_0         
					//   32   54:getfield        #28  <Field String[] val$results>
					//   33   57:aload_0         
					//   34   58:getfield        #30  <Field int val$writeIndex>
					//   35   61:aload_1         
					//   36   62:aastore         
							}
					//*  37   63:goto            100
					//*  38   66:new             #73  <Class FacebookException>
					//*  39   69:dup             
					//*  40   70:ldc1            #54  <String "Error staging photo.">
					//*  41   72:invokespecial   #76  <Method void FacebookException(String)>
					//*  42   75:athrow          
					//*  43   76:new             #73  <Class FacebookException>
					//*  44   79:dup             
					//*  45   80:ldc1            #54  <String "Error staging photo.">
					//*  46   82:invokespecial   #76  <Method void FacebookException(String)>
					//*  47   85:athrow          
							// Misplaced declaration of an exception variable
							catch(GraphResponse graphresponse)
					//*  48   86:astore_1        
							{
								exceptions[writeIndex] = ((Exception) (graphresponse));
					//   49   87:aload_0         
					//   50   88:getfield        #26  <Field WebDialog$UploadStagingResourcesTask this$1>
					//   51   91:invokestatic    #80  <Method Exception[] WebDialog$UploadStagingResourcesTask.access$800(WebDialog$UploadStagingResourcesTask)>
					//   52   94:aload_0         
					//   53   95:getfield        #30  <Field int val$writeIndex>
					//   54   98:aload_1         
					//   55   99:aastore         
							}
							break MISSING_BLOCK_LABEL_100;
						}
						throw new FacebookException("Error staging photo.");
						throw new FacebookException("Error staging photo.");
						latch.countDown();
					//   56  100:aload_0         
					//   57  101:getfield        #32  <Field CountDownLatch val$latch>
					//   58  104:invokevirtual   #85  <Method void CountDownLatch.countDown()>
						return;
					//   59  107:return          
					}

					final UploadStagingResourcesTask this$1;
					final CountDownLatch val$latch;
					final String val$results[];
					final int val$writeIndex;

			
			{
				this$1 = final_uploadstagingresourcestask;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field WebDialog$UploadStagingResourcesTask this$1>
				results = as;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field String[] val$results>
				writeIndex = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #30  <Field int val$writeIndex>
				latch = CountDownLatch.this;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field CountDownLatch val$latch>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
				}
).executeAsync())));
		//   64  129:aload_1         
		//   65  130:aload           6
		//   66  132:aload           7
		//   67  134:new             #10  <Class WebDialog$UploadStagingResourcesTask$1>
		//   68  137:dup             
		//   69  138:aload_0         
		//   70  139:aload           4
		//   71  141:iload_2         
		//   72  142:aload           5
		//   73  144:invokespecial   #110 <Method void WebDialog$UploadStagingResourcesTask$1(WebDialog$UploadStagingResourcesTask, String[], int, CountDownLatch)>
		//   74  147:invokestatic    #116 <Method GraphRequest ShareInternalUtility.newUploadStagingResourceWithImageRequest(AccessToken, Uri, com.facebook.GraphRequest$Callback)>
		//   75  150:invokevirtual   #122 <Method com.facebook.GraphRequestAsyncTask GraphRequest.executeAsync()>
		//   76  153:invokevirtual   #126 <Method boolean ConcurrentLinkedQueue.add(Object)>
		//   77  156:pop             
			}
		//*  78  157:goto            207
		//*  79  160:aload           5
		//*  80  162:invokevirtual   #129 <Method void CountDownLatch.await()>
		//*  81  165:aload           4
		//*  82  167:areturn         
		//*  83  168:aload_1         
		//*  84  169:invokevirtual   #75  <Method Iterator ConcurrentLinkedQueue.iterator()>
		//*  85  172:astore_1        
		//*  86  173:aload_1         
		//*  87  174:invokeinterface #80  <Method boolean Iterator.hasNext()>
		//*  88  179:ifeq            199
		//*  89  182:aload_1         
		//*  90  183:invokeinterface #84  <Method Object Iterator.next()>
		//*  91  188:checkcast       #5   <Class AsyncTask>
		//*  92  191:iconst_1        
		//*  93  192:invokevirtual   #88  <Method boolean AsyncTask.cancel(boolean)>
		//*  94  195:pop             
		//*  95  196:goto            173
		//*  96  199:aconst_null     
		//*  97  200:areturn         
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				for(avoid = ((Void []) (((ConcurrentLinkedQueue) (avoid)).iterator())); ((Iterator) (avoid)).hasNext(); ((AsyncTask)((Iterator) (avoid)).next()).cancel(true));
				return null;
			}
			break MISSING_BLOCK_LABEL_207;
			countdownlatch.await();
			Exception exception;
			return results;
		//*  98  201:astore_3        
		//*  99  202:goto            168
			return null;
		//  100  205:aconst_null     
		//  101  206:areturn         
			writeIndex++;
		//  102  207:iload_2         
		//  103  208:iconst_1        
		//  104  209:iadd            
		//  105  210:istore_2        
			if(true) goto _L2; else goto _L1
		//  106  211:goto            52
_L1:
		}

		protected volatile void onPostExecute(Object obj)
		{
			onPostExecute((String[])obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #133 <Class String[]>
		//    3    5:invokevirtual   #136 <Method void onPostExecute(String[])>
		//    4    8:return          
		}

		protected void onPostExecute(String as[])
		{
			spinner.dismiss();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field WebDialog this$0>
		//    2    4:invokestatic    #140 <Method ProgressDialog WebDialog.access$300(WebDialog)>
		//    3    7:invokevirtual   #145 <Method void ProgressDialog.dismiss()>
			Exception aexception[] = exceptions;
		//    4   10:aload_0         
		//    5   11:getfield        #34  <Field Exception[] exceptions>
		//    6   14:astore          4
			int k = aexception.length;
		//    7   16:aload           4
		//    8   18:arraylength     
		//    9   19:istore_3        
			for(int i = 0; i < k; i++)
		//*  10   20:iconst_0        
		//*  11   21:istore_2        
		//*  12   22:iload_2         
		//*  13   23:iload_3         
		//*  14   24:icmpge          55
			{
				Exception exception = aexception[i];
		//   15   27:aload           4
		//   16   29:iload_2         
		//   17   30:aaload          
		//   18   31:astore          5
				if(exception != null)
		//*  19   33:aload           5
		//*  20   35:ifnull          48
				{
					sendErrorToListener(((Throwable) (exception)));
		//   21   38:aload_0         
		//   22   39:getfield        #22  <Field WebDialog this$0>
		//   23   42:aload           5
		//   24   44:invokevirtual   #149 <Method void WebDialog.sendErrorToListener(Throwable)>
					return;
		//   25   47:return          
				}
			}

		//   26   48:iload_2         
		//   27   49:iconst_1        
		//   28   50:iadd            
		//   29   51:istore_2        
		//*  30   52:goto            22
			if(as == null)
		//*  31   55:aload_1         
		//*  32   56:ifnonnull       76
			{
				sendErrorToListener(((Throwable) (new FacebookException("Failed to stage photos for web dialog"))));
		//   33   59:aload_0         
		//   34   60:getfield        #22  <Field WebDialog this$0>
		//   35   63:new             #151 <Class FacebookException>
		//   36   66:dup             
		//   37   67:ldc1            #153 <String "Failed to stage photos for web dialog">
		//   38   69:invokespecial   #156 <Method void FacebookException(String)>
		//   39   72:invokevirtual   #149 <Method void WebDialog.sendErrorToListener(Throwable)>
				return;
		//   40   75:return          
			}
			as = ((String []) (Arrays.asList(((Object []) (as)))));
		//   41   76:aload_1         
		//   42   77:invokestatic    #162 <Method List Arrays.asList(Object[])>
		//   43   80:astore_1        
			if(((List) (as)).contains(((Object) (null))))
		//*  44   81:aload_1         
		//*  45   82:aconst_null     
		//*  46   83:invokeinterface #167 <Method boolean List.contains(Object)>
		//*  47   88:ifeq            108
			{
				sendErrorToListener(((Throwable) (new FacebookException("Failed to stage photos for web dialog"))));
		//   48   91:aload_0         
		//   49   92:getfield        #22  <Field WebDialog this$0>
		//   50   95:new             #151 <Class FacebookException>
		//   51   98:dup             
		//   52   99:ldc1            #153 <String "Failed to stage photos for web dialog">
		//   53  101:invokespecial   #156 <Method void FacebookException(String)>
		//   54  104:invokevirtual   #149 <Method void WebDialog.sendErrorToListener(Throwable)>
				return;
		//   55  107:return          
			} else
			{
				Utility.putJSONValueInBundle(parameters, "media", ((Object) (new JSONArray(((java.util.Collection) (as))))));
		//   56  108:aload_0         
		//   57  109:getfield        #29  <Field Bundle parameters>
		//   58  112:ldc1            #45  <String "media">
		//   59  114:new             #169 <Class JSONArray>
		//   60  117:dup             
		//   61  118:aload_1         
		//   62  119:invokespecial   #172 <Method void JSONArray(java.util.Collection)>
		//   63  122:invokestatic    #176 <Method boolean Utility.putJSONValueInBundle(Bundle, String, Object)>
		//   64  125:pop             
				as = ((String []) (ServerProtocol.getDialogAuthority()));
		//   65  126:invokestatic    #181 <Method String ServerProtocol.getDialogAuthority()>
		//   66  129:astore_1        
				StringBuilder stringbuilder = new StringBuilder();
		//   67  130:new             #183 <Class StringBuilder>
		//   68  133:dup             
		//   69  134:invokespecial   #184 <Method void StringBuilder()>
		//   70  137:astore          4
				stringbuilder.append(FacebookSdk.getGraphApiVersion());
		//   71  139:aload           4
		//   72  141:invokestatic    #189 <Method String FacebookSdk.getGraphApiVersion()>
		//   73  144:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
		//   74  147:pop             
				stringbuilder.append("/");
		//   75  148:aload           4
		//   76  150:ldc1            #195 <String "/">
		//   77  152:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
		//   78  155:pop             
				stringbuilder.append("dialog/");
		//   79  156:aload           4
		//   80  158:ldc1            #197 <String "dialog/">
		//   81  160:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
		//   82  163:pop             
				stringbuilder.append(action);
		//   83  164:aload           4
		//   84  166:aload_0         
		//   85  167:getfield        #27  <Field String action>
		//   86  170:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
		//   87  173:pop             
				as = ((String []) (Utility.buildUri(((String) (as)), stringbuilder.toString(), parameters)));
		//   88  174:aload_1         
		//   89  175:aload           4
		//   90  177:invokevirtual   #198 <Method String StringBuilder.toString()>
		//   91  180:aload_0         
		//   92  181:getfield        #29  <Field Bundle parameters>
		//   93  184:invokestatic    #202 <Method Uri Utility.buildUri(String, String, Bundle)>
		//   94  187:astore_1        
				url = ((Uri) (as)).toString();
		//   95  188:aload_0         
		//   96  189:getfield        #22  <Field WebDialog this$0>
		//   97  192:aload_1         
		//   98  193:invokevirtual   #104 <Method String Uri.toString()>
		//   99  196:invokestatic    #206 <Method String WebDialog.access$902(WebDialog, String)>
		//  100  199:pop             
				int j = crossImageView.getDrawable().getIntrinsicWidth();
		//  101  200:aload_0         
		//  102  201:getfield        #22  <Field WebDialog this$0>
		//  103  204:invokestatic    #210 <Method ImageView WebDialog.access$600(WebDialog)>
		//  104  207:invokevirtual   #216 <Method Drawable ImageView.getDrawable()>
		//  105  210:invokevirtual   #222 <Method int Drawable.getIntrinsicWidth()>
		//  106  213:istore_2        
				setUpWebView(j / 2 + 1);
		//  107  214:aload_0         
		//  108  215:getfield        #22  <Field WebDialog this$0>
		//  109  218:iload_2         
		//  110  219:iconst_2        
		//  111  220:idiv            
		//  112  221:iconst_1        
		//  113  222:iadd            
		//  114  223:invokestatic    #226 <Method void WebDialog.access$1000(WebDialog, int)>
				return;
		//  115  226:return          
			}
		}

		private String action;
		private Exception exceptions[];
		private Bundle parameters;
		final WebDialog this$0;


/*
		static Exception[] access$800(UploadStagingResourcesTask uploadstagingresourcestask)
		{
			return uploadstagingresourcestask.exceptions;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field Exception[] exceptions>
		//    2    4:areturn         
		}

*/

		UploadStagingResourcesTask(String s, Bundle bundle)
		{
			this$0 = WebDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field WebDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #25  <Method void AsyncTask()>
			action = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #27  <Field String action>
			parameters = bundle;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #29  <Field Bundle parameters>
		//   11   19:return          
		}
	}


	protected WebDialog(Context context, String s)
	{
		this(context, s, getWebDialogTheme());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #89  <Method int getWebDialogTheme()>
	//    4    6:invokespecial   #92  <Method void WebDialog(Context, String, int)>
	//    5    9:return          
	}

	private WebDialog(Context context, String s, int i)
	{
		int j = i;
	//    0    0:iload_3         
	//    1    1:istore          4
		if(i == 0)
	//*   2    3:iload_3         
	//*   3    4:ifne            12
			j = getWebDialogTheme();
	//    4    7:invokestatic    #89  <Method int getWebDialogTheme()>
	//    5   10:istore          4
		super(context, j);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iload           4
	//    9   16:invokespecial   #95  <Method void Dialog(Context, int)>
		expectedRedirectUrl = "fbconnect://success";
	//   10   19:aload_0         
	//   11   20:ldc1            #97  <String "fbconnect://success">
	//   12   22:putfield        #99  <Field String expectedRedirectUrl>
		listenerCalled = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #101 <Field boolean listenerCalled>
		isDetached = false;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #103 <Field boolean isDetached>
		isPageFinished = false;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #105 <Field boolean isPageFinished>
		url = s;
	//   22   40:aload_0         
	//   23   41:aload_2         
	//   24   42:putfield        #107 <Field String url>
	//   25   45:return          
	}

	private WebDialog(Context context, String s, Bundle bundle, int i, OnCompleteListener oncompletelistener)
	{
		int j = i;
	//    0    0:iload           4
	//    1    2:istore          6
		if(i == 0)
	//*   2    4:iload           4
	//*   3    6:ifne            14
			j = getWebDialogTheme();
	//    4    9:invokestatic    #89  <Method int getWebDialogTheme()>
	//    5   12:istore          6
		super(context, j);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:iload           6
	//    9   18:invokespecial   #95  <Method void Dialog(Context, int)>
		expectedRedirectUrl = "fbconnect://success";
	//   10   21:aload_0         
	//   11   22:ldc1            #97  <String "fbconnect://success">
	//   12   24:putfield        #99  <Field String expectedRedirectUrl>
		listenerCalled = false;
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:putfield        #101 <Field boolean listenerCalled>
		isDetached = false;
	//   16   32:aload_0         
	//   17   33:iconst_0        
	//   18   34:putfield        #103 <Field boolean isDetached>
		isPageFinished = false;
	//   19   37:aload_0         
	//   20   38:iconst_0        
	//   21   39:putfield        #105 <Field boolean isPageFinished>
		Bundle bundle1 = bundle;
	//   22   42:aload_3         
	//   23   43:astore          7
		if(bundle == null)
	//*  24   45:aload_3         
	//*  25   46:ifnonnull       58
			bundle1 = new Bundle();
	//   26   49:new             #110 <Class Bundle>
	//   27   52:dup             
	//   28   53:invokespecial   #112 <Method void Bundle()>
	//   29   56:astore          7
		if(Utility.isChromeOS(context))
	//*  30   58:aload_1         
	//*  31   59:invokestatic    #118 <Method boolean Utility.isChromeOS(Context)>
	//*  32   62:ifeq            71
			context = "fbconnect://chrome_os_success";
	//   33   65:ldc1            #120 <String "fbconnect://chrome_os_success">
	//   34   67:astore_1        
		else
	//*  35   68:goto            74
			context = "fbconnect://success";
	//   36   71:ldc1            #97  <String "fbconnect://success">
	//   37   73:astore_1        
		expectedRedirectUrl = ((String) (context));
	//   38   74:aload_0         
	//   39   75:aload_1         
	//   40   76:putfield        #99  <Field String expectedRedirectUrl>
		bundle1.putString("redirect_uri", expectedRedirectUrl);
	//   41   79:aload           7
	//   42   81:ldc1            #122 <String "redirect_uri">
	//   43   83:aload_0         
	//   44   84:getfield        #99  <Field String expectedRedirectUrl>
	//   45   87:invokevirtual   #126 <Method void Bundle.putString(String, String)>
		bundle1.putString("display", "touch");
	//   46   90:aload           7
	//   47   92:ldc1            #128 <String "display">
	//   48   94:ldc1            #39  <String "touch">
	//   49   96:invokevirtual   #126 <Method void Bundle.putString(String, String)>
		bundle1.putString("client_id", FacebookSdk.getApplicationId());
	//   50   99:aload           7
	//   51  101:ldc1            #130 <String "client_id">
	//   52  103:invokestatic    #136 <Method String FacebookSdk.getApplicationId()>
	//   53  106:invokevirtual   #126 <Method void Bundle.putString(String, String)>
		bundle1.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[] {
			FacebookSdk.getSdkVersion()
		}));
	//   54  109:aload           7
	//   55  111:ldc1            #138 <String "sdk">
	//   56  113:getstatic       #144 <Field Locale Locale.ROOT>
	//   57  116:ldc1            #146 <String "android-%s">
	//   58  118:iconst_1        
	//   59  119:anewarray       Object[]
	//   60  122:dup             
	//   61  123:iconst_0        
	//   62  124:invokestatic    #151 <Method String FacebookSdk.getSdkVersion()>
	//   63  127:aastore         
	//   64  128:invokestatic    #157 <Method String String.format(Locale, String, Object[])>
	//   65  131:invokevirtual   #126 <Method void Bundle.putString(String, String)>
		onCompleteListener = oncompletelistener;
	//   66  134:aload_0         
	//   67  135:aload           5
	//   68  137:putfield        #159 <Field WebDialog$OnCompleteListener onCompleteListener>
		if(s.equals("share") && bundle1.containsKey("media"))
	//*  69  140:aload_2         
	//*  70  141:ldc1            #161 <String "share">
	//*  71  143:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  72  146:ifeq            175
	//*  73  149:aload           7
	//*  74  151:ldc1            #167 <String "media">
	//*  75  153:invokevirtual   #171 <Method boolean Bundle.containsKey(String)>
	//*  76  156:ifeq            175
		{
			uploadTask = new UploadStagingResourcesTask(s, bundle1);
	//   77  159:aload_0         
	//   78  160:new             #23  <Class WebDialog$UploadStagingResourcesTask>
	//   79  163:dup             
	//   80  164:aload_0         
	//   81  165:aload_2         
	//   82  166:aload           7
	//   83  168:invokespecial   #174 <Method void WebDialog$UploadStagingResourcesTask(WebDialog, String, Bundle)>
	//   84  171:putfield        #176 <Field WebDialog$UploadStagingResourcesTask uploadTask>
			return;
	//   85  174:return          
		} else
		{
			context = ((Context) (ServerProtocol.getDialogAuthority()));
	//   86  175:invokestatic    #181 <Method String ServerProtocol.getDialogAuthority()>
	//   87  178:astore_1        
			bundle = ((Bundle) (new StringBuilder()));
	//   88  179:new             #183 <Class StringBuilder>
	//   89  182:dup             
	//   90  183:invokespecial   #184 <Method void StringBuilder()>
	//   91  186:astore_3        
			((StringBuilder) (bundle)).append(FacebookSdk.getGraphApiVersion());
	//   92  187:aload_3         
	//   93  188:invokestatic    #187 <Method String FacebookSdk.getGraphApiVersion()>
	//   94  191:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   95  194:pop             
			((StringBuilder) (bundle)).append("/");
	//   96  195:aload_3         
	//   97  196:ldc1            #193 <String "/">
	//   98  198:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   99  201:pop             
			((StringBuilder) (bundle)).append("dialog/");
	//  100  202:aload_3         
	//  101  203:ldc1            #195 <String "dialog/">
	//  102  205:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  103  208:pop             
			((StringBuilder) (bundle)).append(s);
	//  104  209:aload_3         
	//  105  210:aload_2         
	//  106  211:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  107  214:pop             
			url = Utility.buildUri(((String) (context)), ((StringBuilder) (bundle)).toString(), bundle1).toString();
	//  108  215:aload_0         
	//  109  216:aload_1         
	//  110  217:aload_3         
	//  111  218:invokevirtual   #198 <Method String StringBuilder.toString()>
	//  112  221:aload           7
	//  113  223:invokestatic    #202 <Method Uri Utility.buildUri(String, String, Bundle)>
	//  114  226:invokevirtual   #205 <Method String Uri.toString()>
	//  115  229:putfield        #107 <Field String url>
			return;
	//  116  232:return          
		}
	}

	private void createCrossImage()
	{
		crossImageView = new ImageView(getContext());
	//    0    0:aload_0         
	//    1    1:new             #238 <Class ImageView>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #242 <Method Context getContext()>
	//    5    9:invokespecial   #245 <Method void ImageView(Context)>
	//    6   12:putfield        #231 <Field ImageView crossImageView>
		crossImageView.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				cancel();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field WebDialog this$0>
			//    2    4:invokevirtual   #25  <Method void WebDialog.cancel()>
			//    3    7:return          
			}

			final WebDialog this$0;

			
			{
				this$0 = WebDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    7   15:aload_0         
	//    8   16:getfield        #231 <Field ImageView crossImageView>
	//    9   19:new             #8   <Class WebDialog$2>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #248 <Method void WebDialog$2(WebDialog)>
	//   13   27:invokevirtual   #252 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		Drawable drawable = getContext().getResources().getDrawable(com.facebook.common.R.drawable.com_facebook_close);
	//   14   30:aload_0         
	//   15   31:invokevirtual   #242 <Method Context getContext()>
	//   16   34:invokevirtual   #258 <Method Resources Context.getResources()>
	//   17   37:getstatic       #263 <Field int com.facebook.common.R$drawable.com_facebook_close>
	//   18   40:invokevirtual   #269 <Method Drawable Resources.getDrawable(int)>
	//   19   43:astore_1        
		crossImageView.setImageDrawable(drawable);
	//   20   44:aload_0         
	//   21   45:getfield        #231 <Field ImageView crossImageView>
	//   22   48:aload_1         
	//   23   49:invokevirtual   #273 <Method void ImageView.setImageDrawable(Drawable)>
		crossImageView.setVisibility(4);
	//   24   52:aload_0         
	//   25   53:getfield        #231 <Field ImageView crossImageView>
	//   26   56:iconst_4        
	//   27   57:invokevirtual   #276 <Method void ImageView.setVisibility(int)>
	//   28   60:return          
	}

	private int getScaledSize(int i, float f, int j, int k)
	{
		int l = (int)((float)i / f);
	//    0    0:iload_1         
	//    1    1:i2f             
	//    2    2:fload_2         
	//    3    3:fdiv            
	//    4    4:f2i             
	//    5    5:istore          7
		double d = 0.5D;
	//    6    7:ldc2w           #49  <Double 0.5D>
	//    7   10:dstore          5
		if(l <= j)
	//*   8   12:iload           7
	//*   9   14:iload_3         
	//*  10   15:icmpgt          24
			d = 1.0D;
	//   11   18:dconst_1        
	//   12   19:dstore          5
		else
	//*  13   21:goto            56
		if(l < k)
	//*  14   24:iload           7
	//*  15   26:iload           4
	//*  16   28:icmplt          34
	//*  17   31:goto            56
			d = 0.5D + ((double)(k - l) / (double)(k - j)) * 0.5D;
	//   18   34:ldc2w           #49  <Double 0.5D>
	//   19   37:iload           4
	//   20   39:iload           7
	//   21   41:isub            
	//   22   42:i2d             
	//   23   43:iload           4
	//   24   45:iload_3         
	//   25   46:isub            
	//   26   47:i2d             
	//   27   48:ddiv            
	//   28   49:ldc2w           #49  <Double 0.5D>
	//   29   52:dmul            
	//   30   53:dadd            
	//   31   54:dstore          5
		return (int)((double)i * d);
	//   32   56:iload_1         
	//   33   57:i2d             
	//   34   58:dload           5
	//   35   60:dmul            
	//   36   61:d2i             
	//   37   62:ireturn         
	}

	public static int getWebDialogTheme()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #283 <Method void Validate.sdkInitialized()>
		return webDialogTheme;
	//    1    3:getstatic       #285 <Field int webDialogTheme>
	//    2    6:ireturn         
	}

	protected static void initDefaultTheme(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		try
		{
			context = ((Context) (context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #292 <Method PackageManager Context.getPackageManager()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #295 <Method String Context.getPackageName()>
	//    7   13:sipush          128
	//    8   16:invokevirtual   #301 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    9   19:astore_0        
		}
	//*  10   20:aload_0         
	//*  11   21:ifnull          52
	//*  12   24:aload_0         
	//*  13   25:getfield        #307 <Field Bundle ApplicationInfo.metaData>
	//*  14   28:ifnonnull       32
	//*  15   31:return          
	//*  16   32:getstatic       #285 <Field int webDialogTheme>
	//*  17   35:ifne            51
	//*  18   38:aload_0         
	//*  19   39:getfield        #307 <Field Bundle ApplicationInfo.metaData>
	//*  20   42:ldc2            #309 <String "com.facebook.sdk.WebDialogTheme">
	//*  21   45:invokevirtual   #313 <Method int Bundle.getInt(String)>
	//*  22   48:invokestatic    #316 <Method void setWebDialogTheme(int)>
	//*  23   51:return          
	//*  24   52:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  25   53:astore_0        
		{
			return;
	//   26   54:return          
		}
		if(context != null)
		{
			if(((ApplicationInfo) (context)).metaData == null)
				return;
			if(webDialogTheme == 0)
				setWebDialogTheme(((ApplicationInfo) (context)).metaData.getInt("com.facebook.sdk.WebDialogTheme"));
			return;
		} else
		{
			return;
		}
	}

	public static WebDialog newInstance(Context context, String s, Bundle bundle, int i, OnCompleteListener oncompletelistener)
	{
		initDefaultTheme(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #320 <Method void initDefaultTheme(Context)>
		return new WebDialog(context, s, bundle, i, oncompletelistener);
	//    2    4:new             #2   <Class WebDialog>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:aload           4
	//    9   14:invokespecial   #322 <Method void WebDialog(Context, String, Bundle, int, WebDialog$OnCompleteListener)>
	//   10   17:areturn         
	}

	private void setUpWebView(int i)
	{
		LinearLayout linearlayout = new LinearLayout(getContext());
	//    0    0:new             #327 <Class LinearLayout>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #242 <Method Context getContext()>
	//    4    8:invokespecial   #328 <Method void LinearLayout(Context)>
	//    5   11:astore_2        
		webView = ((WebView) (new WebView(getContext()) {

			public void onWindowFocusChanged(boolean flag)
			{
				try
				{
					super.onWindowFocusChanged(flag);
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokespecial   #25  <Method void WebView.onWindowFocusChanged(boolean)>
					return;
			//    3    5:return          
				}
				catch(NullPointerException nullpointerexception)
			//*   4    6:astore_2        
				{
					return;
			//    5    7:return          
				}
			}

			final WebDialog this$0;

			
			{
				this$0 = WebDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field WebDialog this$0>
				super(context);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void WebView(Context)>
			//    6   10:return          
			}
		}
));
	//    6   12:aload_0         
	//    7   13:new             #10  <Class WebDialog$3>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #242 <Method Context getContext()>
	//   12   22:invokespecial   #331 <Method void WebDialog$3(WebDialog, Context)>
	//   13   25:putfield        #227 <Field WebView webView>
		webView.setVerticalScrollBarEnabled(false);
	//   14   28:aload_0         
	//   15   29:getfield        #227 <Field WebView webView>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #337 <Method void WebView.setVerticalScrollBarEnabled(boolean)>
		webView.setHorizontalScrollBarEnabled(false);
	//   18   36:aload_0         
	//   19   37:getfield        #227 <Field WebView webView>
	//   20   40:iconst_0        
	//   21   41:invokevirtual   #340 <Method void WebView.setHorizontalScrollBarEnabled(boolean)>
		webView.setWebViewClient(((WebViewClient) (new DialogWebViewClient())));
	//   22   44:aload_0         
	//   23   45:getfield        #227 <Field WebView webView>
	//   24   48:new             #17  <Class WebDialog$DialogWebViewClient>
	//   25   51:dup             
	//   26   52:aload_0         
	//   27   53:aconst_null     
	//   28   54:invokespecial   #343 <Method void WebDialog$DialogWebViewClient(WebDialog, WebDialog$1)>
	//   29   57:invokevirtual   #347 <Method void WebView.setWebViewClient(WebViewClient)>
		webView.getSettings().setJavaScriptEnabled(true);
	//   30   60:aload_0         
	//   31   61:getfield        #227 <Field WebView webView>
	//   32   64:invokevirtual   #351 <Method WebSettings WebView.getSettings()>
	//   33   67:iconst_1        
	//   34   68:invokevirtual   #356 <Method void WebSettings.setJavaScriptEnabled(boolean)>
		webView.loadUrl(url);
	//   35   71:aload_0         
	//   36   72:getfield        #227 <Field WebView webView>
	//   37   75:aload_0         
	//   38   76:getfield        #107 <Field String url>
	//   39   79:invokevirtual   #360 <Method void WebView.loadUrl(String)>
		webView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   40   82:aload_0         
	//   41   83:getfield        #227 <Field WebView webView>
	//   42   86:new             #362 <Class android.widget.FrameLayout$LayoutParams>
	//   43   89:dup             
	//   44   90:iconst_m1       
	//   45   91:iconst_m1       
	//   46   92:invokespecial   #365 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   47   95:invokevirtual   #369 <Method void WebView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		webView.setVisibility(4);
	//   48   98:aload_0         
	//   49   99:getfield        #227 <Field WebView webView>
	//   50  102:iconst_4        
	//   51  103:invokevirtual   #370 <Method void WebView.setVisibility(int)>
		webView.getSettings().setSavePassword(false);
	//   52  106:aload_0         
	//   53  107:getfield        #227 <Field WebView webView>
	//   54  110:invokevirtual   #351 <Method WebSettings WebView.getSettings()>
	//   55  113:iconst_0        
	//   56  114:invokevirtual   #373 <Method void WebSettings.setSavePassword(boolean)>
		webView.getSettings().setSaveFormData(false);
	//   57  117:aload_0         
	//   58  118:getfield        #227 <Field WebView webView>
	//   59  121:invokevirtual   #351 <Method WebSettings WebView.getSettings()>
	//   60  124:iconst_0        
	//   61  125:invokevirtual   #376 <Method void WebSettings.setSaveFormData(boolean)>
		webView.setFocusable(true);
	//   62  128:aload_0         
	//   63  129:getfield        #227 <Field WebView webView>
	//   64  132:iconst_1        
	//   65  133:invokevirtual   #379 <Method void WebView.setFocusable(boolean)>
		webView.setFocusableInTouchMode(true);
	//   66  136:aload_0         
	//   67  137:getfield        #227 <Field WebView webView>
	//   68  140:iconst_1        
	//   69  141:invokevirtual   #382 <Method void WebView.setFocusableInTouchMode(boolean)>
		webView.setOnTouchListener(new android.view.View.OnTouchListener() {

			public boolean onTouch(View view, MotionEvent motionevent)
			{
				if(!view.hasFocus())
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #29  <Method boolean View.hasFocus()>
			//*   2    4:ifne            12
					view.requestFocus();
			//    3    7:aload_1         
			//    4    8:invokevirtual   #32  <Method boolean View.requestFocus()>
			//    5   11:pop             
				return false;
			//    6   12:iconst_0        
			//    7   13:ireturn         
			}

			final WebDialog this$0;

			
			{
				this$0 = WebDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   70  144:aload_0         
	//   71  145:getfield        #227 <Field WebView webView>
	//   72  148:new             #12  <Class WebDialog$4>
	//   73  151:dup             
	//   74  152:aload_0         
	//   75  153:invokespecial   #383 <Method void WebDialog$4(WebDialog)>
	//   76  156:invokevirtual   #387 <Method void WebView.setOnTouchListener(android.view.View$OnTouchListener)>
		linearlayout.setPadding(i, i, i, i);
	//   77  159:aload_2         
	//   78  160:iload_1         
	//   79  161:iload_1         
	//   80  162:iload_1         
	//   81  163:iload_1         
	//   82  164:invokevirtual   #391 <Method void LinearLayout.setPadding(int, int, int, int)>
		linearlayout.addView(((View) (webView)));
	//   83  167:aload_2         
	//   84  168:aload_0         
	//   85  169:getfield        #227 <Field WebView webView>
	//   86  172:invokevirtual   #395 <Method void LinearLayout.addView(View)>
		linearlayout.setBackgroundColor(0xcc000000);
	//   87  175:aload_2         
	//   88  176:ldc1            #31  <Int 0xcc000000>
	//   89  178:invokevirtual   #398 <Method void LinearLayout.setBackgroundColor(int)>
		contentFrameLayout.addView(((View) (linearlayout)));
	//   90  181:aload_0         
	//   91  182:getfield        #223 <Field FrameLayout contentFrameLayout>
	//   92  185:aload_2         
	//   93  186:invokevirtual   #401 <Method void FrameLayout.addView(View)>
	//   94  189:return          
	}

	public static void setWebDialogTheme(int i)
	{
		if(i == 0)
	//*   0    0:iload_0         
	//*   1    1:ifeq            7
	//*   2    4:goto            11
			i = DEFAULT_THEME;
	//    3    7:getstatic       #82  <Field int DEFAULT_THEME>
	//    4   10:istore_0        
		webDialogTheme = i;
	//    5   11:iload_0         
	//    6   12:putstatic       #285 <Field int webDialogTheme>
	//    7   15:return          
	}

	public void cancel()
	{
		if(onCompleteListener != null && !listenerCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #159 <Field WebDialog$OnCompleteListener onCompleteListener>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #101 <Field boolean listenerCalled>
	//*   5   11:ifne            25
			sendErrorToListener(((Throwable) (new FacebookOperationCanceledException())));
	//    6   14:aload_0         
	//    7   15:new             #405 <Class FacebookOperationCanceledException>
	//    8   18:dup             
	//    9   19:invokespecial   #406 <Method void FacebookOperationCanceledException()>
	//   10   22:invokevirtual   #410 <Method void sendErrorToListener(Throwable)>
	//   11   25:return          
	}

	public void dismiss()
	{
		WebView webview = webView;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field WebView webView>
	//    2    4:astore_1        
		if(webview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			webview.stopLoading();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #414 <Method void WebView.stopLoading()>
		if(!isDetached)
	//*   7   13:aload_0         
	//*   8   14:getfield        #103 <Field boolean isDetached>
	//*   9   17:ifne            43
		{
			ProgressDialog progressdialog = spinner;
	//   10   20:aload_0         
	//   11   21:getfield        #219 <Field ProgressDialog spinner>
	//   12   24:astore_1        
			if(progressdialog != null && progressdialog.isShowing())
	//*  13   25:aload_1         
	//*  14   26:ifnull          43
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #420 <Method boolean ProgressDialog.isShowing()>
	//*  17   33:ifeq            43
				spinner.dismiss();
	//   18   36:aload_0         
	//   19   37:getfield        #219 <Field ProgressDialog spinner>
	//   20   40:invokevirtual   #422 <Method void ProgressDialog.dismiss()>
		}
		super.dismiss();
	//   21   43:aload_0         
	//   22   44:invokespecial   #423 <Method void Dialog.dismiss()>
	//   23   47:return          
	}

	public OnCompleteListener getOnCompleteListener()
	{
		return onCompleteListener;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field WebDialog$OnCompleteListener onCompleteListener>
	//    2    4:areturn         
	}

	protected WebView getWebView()
	{
		return webView;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field WebView webView>
	//    2    4:areturn         
	}

	protected boolean isListenerCalled()
	{
		return listenerCalled;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field boolean listenerCalled>
	//    2    4:ireturn         
	}

	protected boolean isPageFinished()
	{
		return isPageFinished;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field boolean isPageFinished>
	//    2    4:ireturn         
	}

	public void onAttachedToWindow()
	{
		isDetached = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #103 <Field boolean isDetached>
		if(Utility.mustFixWindowParamsForAutofill(getContext()))
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #242 <Method Context getContext()>
	//*   5    9:invokestatic    #432 <Method boolean Utility.mustFixWindowParamsForAutofill(Context)>
	//*   6   12:ifeq            88
		{
			android.view.WindowManager.LayoutParams layoutparams = windowParams;
	//    7   15:aload_0         
	//    8   16:getfield        #434 <Field android.view.WindowManager$LayoutParams windowParams>
	//    9   19:astore_1        
			if(layoutparams != null && layoutparams.token == null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          88
	//*  12   24:aload_1         
	//*  13   25:getfield        #440 <Field android.os.IBinder android.view.WindowManager$LayoutParams.token>
	//*  14   28:ifnonnull       88
			{
				windowParams.token = getOwnerActivity().getWindow().getAttributes().token;
	//   15   31:aload_0         
	//   16   32:getfield        #434 <Field android.view.WindowManager$LayoutParams windowParams>
	//   17   35:aload_0         
	//   18   36:invokevirtual   #444 <Method Activity getOwnerActivity()>
	//   19   39:invokevirtual   #450 <Method Window Activity.getWindow()>
	//   20   42:invokevirtual   #456 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
	//   21   45:getfield        #440 <Field android.os.IBinder android.view.WindowManager$LayoutParams.token>
	//   22   48:putfield        #440 <Field android.os.IBinder android.view.WindowManager$LayoutParams.token>
				StringBuilder stringbuilder = new StringBuilder();
	//   23   51:new             #183 <Class StringBuilder>
	//   24   54:dup             
	//   25   55:invokespecial   #184 <Method void StringBuilder()>
	//   26   58:astore_1        
				stringbuilder.append("Set token on onAttachedToWindow(): ");
	//   27   59:aload_1         
	//   28   60:ldc2            #458 <String "Set token on onAttachedToWindow(): ">
	//   29   63:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   30   66:pop             
				stringbuilder.append(((Object) (windowParams.token)));
	//   31   67:aload_1         
	//   32   68:aload_0         
	//   33   69:getfield        #434 <Field android.view.WindowManager$LayoutParams windowParams>
	//   34   72:getfield        #440 <Field android.os.IBinder android.view.WindowManager$LayoutParams.token>
	//   35   75:invokevirtual   #461 <Method StringBuilder StringBuilder.append(Object)>
	//   36   78:pop             
				Utility.logd("FacebookSDK.WebDialog", stringbuilder.toString());
	//   37   79:ldc1            #42  <String "FacebookSDK.WebDialog">
	//   38   81:aload_1         
	//   39   82:invokevirtual   #198 <Method String StringBuilder.toString()>
	//   40   85:invokestatic    #464 <Method void Utility.logd(String, String)>
			}
		}
		super.onAttachedToWindow();
	//   41   88:aload_0         
	//   42   89:invokespecial   #466 <Method void Dialog.onAttachedToWindow()>
	//   43   92:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #470 <Method void Dialog.onCreate(Bundle)>
		spinner = new ProgressDialog(getContext());
	//    3    5:aload_0         
	//    4    6:new             #416 <Class ProgressDialog>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokevirtual   #242 <Method Context getContext()>
	//    8   14:invokespecial   #471 <Method void ProgressDialog(Context)>
	//    9   17:putfield        #219 <Field ProgressDialog spinner>
		spinner.requestWindowFeature(1);
	//   10   20:aload_0         
	//   11   21:getfield        #219 <Field ProgressDialog spinner>
	//   12   24:iconst_1        
	//   13   25:invokevirtual   #475 <Method boolean ProgressDialog.requestWindowFeature(int)>
	//   14   28:pop             
		spinner.setMessage(((CharSequence) (getContext().getString(com.facebook.common.R.string.com_facebook_loading))));
	//   15   29:aload_0         
	//   16   30:getfield        #219 <Field ProgressDialog spinner>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #242 <Method Context getContext()>
	//   19   37:getstatic       #480 <Field int com.facebook.common.R$string.com_facebook_loading>
	//   20   40:invokevirtual   #484 <Method String Context.getString(int)>
	//   21   43:invokevirtual   #488 <Method void ProgressDialog.setMessage(CharSequence)>
		spinner.setCanceledOnTouchOutside(false);
	//   22   46:aload_0         
	//   23   47:getfield        #219 <Field ProgressDialog spinner>
	//   24   50:iconst_0        
	//   25   51:invokevirtual   #491 <Method void ProgressDialog.setCanceledOnTouchOutside(boolean)>
		spinner.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

			public void onCancel(DialogInterface dialoginterface)
			{
				cancel();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field WebDialog this$0>
			//    2    4:invokevirtual   #26  <Method void WebDialog.cancel()>
			//    3    7:return          
			}

			final WebDialog this$0;

			
			{
				this$0 = WebDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   26   54:aload_0         
	//   27   55:getfield        #219 <Field ProgressDialog spinner>
	//   28   58:new             #6   <Class WebDialog$1>
	//   29   61:dup             
	//   30   62:aload_0         
	//   31   63:invokespecial   #492 <Method void WebDialog$1(WebDialog)>
	//   32   66:invokevirtual   #496 <Method void ProgressDialog.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
		requestWindowFeature(1);
	//   33   69:aload_0         
	//   34   70:iconst_1        
	//   35   71:invokevirtual   #497 <Method boolean requestWindowFeature(int)>
	//   36   74:pop             
		contentFrameLayout = new FrameLayout(getContext());
	//   37   75:aload_0         
	//   38   76:new             #400 <Class FrameLayout>
	//   39   79:dup             
	//   40   80:aload_0         
	//   41   81:invokevirtual   #242 <Method Context getContext()>
	//   42   84:invokespecial   #498 <Method void FrameLayout(Context)>
	//   43   87:putfield        #223 <Field FrameLayout contentFrameLayout>
		resize();
	//   44   90:aload_0         
	//   45   91:invokevirtual   #501 <Method void resize()>
		getWindow().setGravity(17);
	//   46   94:aload_0         
	//   47   95:invokevirtual   #502 <Method Window getWindow()>
	//   48   98:bipush          17
	//   49  100:invokevirtual   #505 <Method void Window.setGravity(int)>
		getWindow().setSoftInputMode(16);
	//   50  103:aload_0         
	//   51  104:invokevirtual   #502 <Method Window getWindow()>
	//   52  107:bipush          16
	//   53  109:invokevirtual   #508 <Method void Window.setSoftInputMode(int)>
		createCrossImage();
	//   54  112:aload_0         
	//   55  113:invokespecial   #510 <Method void createCrossImage()>
		if(url != null)
	//*  56  116:aload_0         
	//*  57  117:getfield        #107 <Field String url>
	//*  58  120:ifnull          141
			setUpWebView(crossImageView.getDrawable().getIntrinsicWidth() / 2 + 1);
	//   59  123:aload_0         
	//   60  124:aload_0         
	//   61  125:getfield        #231 <Field ImageView crossImageView>
	//   62  128:invokevirtual   #513 <Method Drawable ImageView.getDrawable()>
	//   63  131:invokevirtual   #518 <Method int Drawable.getIntrinsicWidth()>
	//   64  134:iconst_2        
	//   65  135:idiv            
	//   66  136:iconst_1        
	//   67  137:iadd            
	//   68  138:invokespecial   #213 <Method void setUpWebView(int)>
		contentFrameLayout.addView(((View) (crossImageView)), new android.view.ViewGroup.LayoutParams(-2, -2));
	//   69  141:aload_0         
	//   70  142:getfield        #223 <Field FrameLayout contentFrameLayout>
	//   71  145:aload_0         
	//   72  146:getfield        #231 <Field ImageView crossImageView>
	//   73  149:new             #520 <Class android.view.ViewGroup$LayoutParams>
	//   74  152:dup             
	//   75  153:bipush          -2
	//   76  155:bipush          -2
	//   77  157:invokespecial   #521 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   78  160:invokevirtual   #524 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		setContentView(((View) (contentFrameLayout)));
	//   79  163:aload_0         
	//   80  164:aload_0         
	//   81  165:getfield        #223 <Field FrameLayout contentFrameLayout>
	//   82  168:invokevirtual   #527 <Method void setContentView(View)>
	//   83  171:return          
	}

	public void onDetachedFromWindow()
	{
		isDetached = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #103 <Field boolean isDetached>
		super.onDetachedFromWindow();
	//    3    5:aload_0         
	//    4    6:invokespecial   #530 <Method void Dialog.onDetachedFromWindow()>
	//    5    9:return          
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(i == 4)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          9
			cancel();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #534 <Method void cancel()>
		return super.onKeyDown(i, keyevent);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #536 <Method boolean Dialog.onKeyDown(int, KeyEvent)>
	//    9   15:ireturn         
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #539 <Method void Dialog.onStart()>
		UploadStagingResourcesTask uploadstagingresourcestask = uploadTask;
	//    2    4:aload_0         
	//    3    5:getfield        #176 <Field WebDialog$UploadStagingResourcesTask uploadTask>
	//    4    8:astore_1        
		if(uploadstagingresourcestask != null && uploadstagingresourcestask.getStatus() == android.os.AsyncTask.Status.PENDING)
	//*   5    9:aload_1         
	//*   6   10:ifnull          43
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #543 <Method android.os.AsyncTask$Status WebDialog$UploadStagingResourcesTask.getStatus()>
	//*   9   17:getstatic       #549 <Field android.os.AsyncTask$Status android.os.AsyncTask$Status.PENDING>
	//*  10   20:if_acmpne       43
		{
			uploadTask.execute(((Object []) (new Void[0])));
	//   11   23:aload_0         
	//   12   24:getfield        #176 <Field WebDialog$UploadStagingResourcesTask uploadTask>
	//   13   27:iconst_0        
	//   14   28:anewarray       Void[]
	//   15   31:invokevirtual   #555 <Method AsyncTask WebDialog$UploadStagingResourcesTask.execute(Object[])>
	//   16   34:pop             
			spinner.show();
	//   17   35:aload_0         
	//   18   36:getfield        #219 <Field ProgressDialog spinner>
	//   19   39:invokevirtual   #558 <Method void ProgressDialog.show()>
			return;
	//   20   42:return          
		} else
		{
			resize();
	//   21   43:aload_0         
	//   22   44:invokevirtual   #501 <Method void resize()>
			return;
	//   23   47:return          
		}
	}

	protected void onStop()
	{
		UploadStagingResourcesTask uploadstagingresourcestask = uploadTask;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field WebDialog$UploadStagingResourcesTask uploadTask>
	//    2    4:astore_1        
		if(uploadstagingresourcestask != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
		{
			uploadstagingresourcestask.cancel(true);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #562 <Method boolean WebDialog$UploadStagingResourcesTask.cancel(boolean)>
	//    8   14:pop             
			spinner.dismiss();
	//    9   15:aload_0         
	//   10   16:getfield        #219 <Field ProgressDialog spinner>
	//   11   19:invokevirtual   #422 <Method void ProgressDialog.dismiss()>
		}
		super.onStop();
	//   12   22:aload_0         
	//   13   23:invokespecial   #564 <Method void Dialog.onStop()>
	//   14   26:return          
	}

	public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutparams)
	{
		if(layoutparams.token == null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #440 <Field android.os.IBinder android.view.WindowManager$LayoutParams.token>
	//*   2    4:ifnonnull       12
			windowParams = layoutparams;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #434 <Field android.view.WindowManager$LayoutParams windowParams>
		super.onWindowAttributesChanged(layoutparams);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #568 <Method void Dialog.onWindowAttributesChanged(android.view.WindowManager$LayoutParams)>
	//    9   17:return          
	}

	protected Bundle parseResponseUri(String s)
	{
		s = ((String) (Uri.parse(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #574 <Method Uri Uri.parse(String)>
	//    2    4:astore_1        
		Bundle bundle = Utility.parseUrlQueryString(((Uri) (s)).getQuery());
	//    3    5:aload_1         
	//    4    6:invokevirtual   #577 <Method String Uri.getQuery()>
	//    5    9:invokestatic    #580 <Method Bundle Utility.parseUrlQueryString(String)>
	//    6   12:astore_2        
		bundle.putAll(Utility.parseUrlQueryString(((Uri) (s)).getFragment()));
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #583 <Method String Uri.getFragment()>
	//   10   18:invokestatic    #580 <Method Bundle Utility.parseUrlQueryString(String)>
	//   11   21:invokevirtual   #586 <Method void Bundle.putAll(Bundle)>
		return bundle;
	//   12   24:aload_2         
	//   13   25:areturn         
	}

	public void resize()
	{
		Display display = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #242 <Method Context getContext()>
	//    2    4:ldc2            #588 <String "window">
	//    3    7:invokevirtual   #592 <Method Object Context.getSystemService(String)>
	//    4   10:checkcast       #594 <Class WindowManager>
	//    5   13:invokeinterface #598 <Method Display WindowManager.getDefaultDisplay()>
	//    6   18:astore_3        
		DisplayMetrics displaymetrics = new DisplayMetrics();
	//    7   19:new             #600 <Class DisplayMetrics>
	//    8   22:dup             
	//    9   23:invokespecial   #601 <Method void DisplayMetrics()>
	//   10   26:astore          4
		display.getMetrics(displaymetrics);
	//   11   28:aload_3         
	//   12   29:aload           4
	//   13   31:invokevirtual   #607 <Method void Display.getMetrics(DisplayMetrics)>
		int i;
		if(displaymetrics.widthPixels < displaymetrics.heightPixels)
	//*  14   34:aload           4
	//*  15   36:getfield        #610 <Field int DisplayMetrics.widthPixels>
	//*  16   39:aload           4
	//*  17   41:getfield        #613 <Field int DisplayMetrics.heightPixels>
	//*  18   44:icmpge          56
			i = displaymetrics.widthPixels;
	//   19   47:aload           4
	//   20   49:getfield        #610 <Field int DisplayMetrics.widthPixels>
	//   21   52:istore_1        
		else
	//*  22   53:goto            62
			i = displaymetrics.heightPixels;
	//   23   56:aload           4
	//   24   58:getfield        #613 <Field int DisplayMetrics.heightPixels>
	//   25   61:istore_1        
		int j;
		if(displaymetrics.widthPixels < displaymetrics.heightPixels)
	//*  26   62:aload           4
	//*  27   64:getfield        #610 <Field int DisplayMetrics.widthPixels>
	//*  28   67:aload           4
	//*  29   69:getfield        #613 <Field int DisplayMetrics.heightPixels>
	//*  30   72:icmpge          84
			j = displaymetrics.heightPixels;
	//   31   75:aload           4
	//   32   77:getfield        #613 <Field int DisplayMetrics.heightPixels>
	//   33   80:istore_2        
		else
	//*  34   81:goto            90
			j = displaymetrics.widthPixels;
	//   35   84:aload           4
	//   36   86:getfield        #610 <Field int DisplayMetrics.widthPixels>
	//   37   89:istore_2        
		i = Math.min(getScaledSize(i, displaymetrics.density, 480, 800), displaymetrics.widthPixels);
	//   38   90:aload_0         
	//   39   91:iload_1         
	//   40   92:aload           4
	//   41   94:getfield        #617 <Field float DisplayMetrics.density>
	//   42   97:sipush          480
	//   43  100:sipush          800
	//   44  103:invokespecial   #619 <Method int getScaledSize(int, float, int, int)>
	//   45  106:aload           4
	//   46  108:getfield        #610 <Field int DisplayMetrics.widthPixels>
	//   47  111:invokestatic    #625 <Method int Math.min(int, int)>
	//   48  114:istore_1        
		j = Math.min(getScaledSize(j, displaymetrics.density, 800, 1280), displaymetrics.heightPixels);
	//   49  115:aload_0         
	//   50  116:iload_2         
	//   51  117:aload           4
	//   52  119:getfield        #617 <Field float DisplayMetrics.density>
	//   53  122:sipush          800
	//   54  125:sipush          1280
	//   55  128:invokespecial   #619 <Method int getScaledSize(int, float, int, int)>
	//   56  131:aload           4
	//   57  133:getfield        #613 <Field int DisplayMetrics.heightPixels>
	//   58  136:invokestatic    #625 <Method int Math.min(int, int)>
	//   59  139:istore_2        
		getWindow().setLayout(i, j);
	//   60  140:aload_0         
	//   61  141:invokevirtual   #502 <Method Window getWindow()>
	//   62  144:iload_1         
	//   63  145:iload_2         
	//   64  146:invokevirtual   #628 <Method void Window.setLayout(int, int)>
	//   65  149:return          
	}

	protected void sendErrorToListener(Throwable throwable)
	{
		if(onCompleteListener != null && !listenerCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #159 <Field WebDialog$OnCompleteListener onCompleteListener>
	//*   2    4:ifnull          58
	//*   3    7:aload_0         
	//*   4    8:getfield        #101 <Field boolean listenerCalled>
	//*   5   11:ifne            58
		{
			listenerCalled = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #101 <Field boolean listenerCalled>
			if(throwable instanceof FacebookException)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #630 <Class FacebookException>
	//*  11   23:ifeq            34
				throwable = ((Throwable) ((FacebookException)throwable));
	//   12   26:aload_1         
	//   13   27:checkcast       #630 <Class FacebookException>
	//   14   30:astore_1        
			else
	//*  15   31:goto            43
				throwable = ((Throwable) (new FacebookException(throwable)));
	//   16   34:new             #630 <Class FacebookException>
	//   17   37:dup             
	//   18   38:aload_1         
	//   19   39:invokespecial   #632 <Method void FacebookException(Throwable)>
	//   20   42:astore_1        
			onCompleteListener.onComplete(((Bundle) (null)), ((FacebookException) (throwable)));
	//   21   43:aload_0         
	//   22   44:getfield        #159 <Field WebDialog$OnCompleteListener onCompleteListener>
	//   23   47:aconst_null     
	//   24   48:aload_1         
	//   25   49:invokeinterface #636 <Method void WebDialog$OnCompleteListener.onComplete(Bundle, FacebookException)>
			dismiss();
	//   26   54:aload_0         
	//   27   55:invokevirtual   #637 <Method void dismiss()>
		}
	//   28   58:return          
	}

	protected void sendSuccessToListener(Bundle bundle)
	{
		OnCompleteListener oncompletelistener = onCompleteListener;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field WebDialog$OnCompleteListener onCompleteListener>
	//    2    4:astore_2        
		if(oncompletelistener != null && !listenerCalled)
	//*   3    5:aload_2         
	//*   4    6:ifnull          33
	//*   5    9:aload_0         
	//*   6   10:getfield        #101 <Field boolean listenerCalled>
	//*   7   13:ifne            33
		{
			listenerCalled = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #101 <Field boolean listenerCalled>
			oncompletelistener.onComplete(bundle, ((FacebookException) (null)));
	//   11   21:aload_2         
	//   12   22:aload_1         
	//   13   23:aconst_null     
	//   14   24:invokeinterface #636 <Method void WebDialog$OnCompleteListener.onComplete(Bundle, FacebookException)>
			dismiss();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #637 <Method void dismiss()>
		}
	//   17   33:return          
	}

	protected void setExpectedRedirectUrl(String s)
	{
		expectedRedirectUrl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #99  <Field String expectedRedirectUrl>
	//    3    5:return          
	}

	public void setOnCompleteListener(OnCompleteListener oncompletelistener)
	{
		onCompleteListener = oncompletelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #159 <Field WebDialog$OnCompleteListener onCompleteListener>
	//    3    5:return          
	}

	private static final int API_EC_DIALOG_CANCEL = 4201;
	private static final int BACKGROUND_GRAY = 0xcc000000;
	private static final int DEFAULT_THEME;
	static final boolean DISABLE_SSL_CHECK_FOR_TESTING = false;
	private static final String DISPLAY_TOUCH = "touch";
	private static final String LOG_TAG = "FacebookSDK.WebDialog";
	private static final int MAX_PADDING_SCREEN_HEIGHT = 1280;
	private static final int MAX_PADDING_SCREEN_WIDTH = 800;
	private static final double MIN_SCALE_FACTOR = 0.5D;
	private static final int NO_PADDING_SCREEN_HEIGHT = 800;
	private static final int NO_PADDING_SCREEN_WIDTH = 480;
	private static volatile int webDialogTheme;
	private FrameLayout contentFrameLayout;
	private ImageView crossImageView;
	private String expectedRedirectUrl;
	private boolean isDetached;
	private boolean isPageFinished;
	private boolean listenerCalled;
	private OnCompleteListener onCompleteListener;
	private ProgressDialog spinner;
	private UploadStagingResourcesTask uploadTask;
	private String url;
	private WebView webView;
	private android.view.WindowManager.LayoutParams windowParams;

	static 
	{
		DEFAULT_THEME = com.facebook.common.R.style.com_facebook_activity_theme;
	//    0    0:getstatic       #80  <Field int com.facebook.common.R$style.com_facebook_activity_theme>
	//    1    3:putstatic       #82  <Field int DEFAULT_THEME>
	//*   2    6:return          
	}


/*
	static String access$100(WebDialog webdialog)
	{
		return webdialog.expectedRedirectUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field String expectedRedirectUrl>
	//    2    4:areturn         
	}

*/


/*
	static void access$1000(WebDialog webdialog, int i)
	{
		webdialog.setUpWebView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #213 <Method void setUpWebView(int)>
		return;
	//    3    5:return          
	}

*/


/*
	static boolean access$200(WebDialog webdialog)
	{
		return webdialog.isDetached;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field boolean isDetached>
	//    2    4:ireturn         
	}

*/


/*
	static ProgressDialog access$300(WebDialog webdialog)
	{
		return webdialog.spinner;
	//    0    0:aload_0         
	//    1    1:getfield        #219 <Field ProgressDialog spinner>
	//    2    4:areturn         
	}

*/


/*
	static FrameLayout access$400(WebDialog webdialog)
	{
		return webdialog.contentFrameLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field FrameLayout contentFrameLayout>
	//    2    4:areturn         
	}

*/


/*
	static WebView access$500(WebDialog webdialog)
	{
		return webdialog.webView;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field WebView webView>
	//    2    4:areturn         
	}

*/


/*
	static ImageView access$600(WebDialog webdialog)
	{
		return webdialog.crossImageView;
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field ImageView crossImageView>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$702(WebDialog webdialog, boolean flag)
	{
		webdialog.isPageFinished = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #105 <Field boolean isPageFinished>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static String access$902(WebDialog webdialog, String s)
	{
		webdialog.url = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #107 <Field String url>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
