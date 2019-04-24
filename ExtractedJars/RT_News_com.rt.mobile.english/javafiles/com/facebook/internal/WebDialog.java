// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.*;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.*;
import android.webkit.*;
import android.widget.*;
import com.facebook.*;
import java.util.Locale;

// Referenced classes of package com.facebook.internal:
//			ServerProtocol, Utility, Validate

public class WebDialog extends Dialog
{
	public static class Builder
	{

		private void finishInit(Context context1, String s, Bundle bundle)
		{
			context = context1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #65  <Field Context context>
			action = s;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #67  <Field String action>
			if(bundle != null)
		//*   6   10:aload_3         
		//*   7   11:ifnull          20
			{
				parameters = bundle;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #69  <Field Bundle parameters>
				return;
		//   11   19:return          
			} else
			{
				parameters = new Bundle();
		//   12   20:aload_0         
		//   13   21:new             #71  <Class Bundle>
		//   14   24:dup             
		//   15   25:invokespecial   #72  <Method void Bundle()>
		//   16   28:putfield        #69  <Field Bundle parameters>
				return;
		//   17   31:return          
			}
		}

		public WebDialog build()
		{
			if(accessToken != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #36  <Field AccessToken accessToken>
		//*   2    4:ifnull          42
			{
				parameters.putString("app_id", accessToken.getApplicationId());
		//    3    7:aload_0         
		//    4    8:getfield        #69  <Field Bundle parameters>
		//    5   11:ldc1            #76  <String "app_id">
		//    6   13:aload_0         
		//    7   14:getfield        #36  <Field AccessToken accessToken>
		//    8   17:invokevirtual   #80  <Method String AccessToken.getApplicationId()>
		//    9   20:invokevirtual   #83  <Method void Bundle.putString(String, String)>
				parameters.putString("access_token", accessToken.getToken());
		//   10   23:aload_0         
		//   11   24:getfield        #69  <Field Bundle parameters>
		//   12   27:ldc1            #85  <String "access_token">
		//   13   29:aload_0         
		//   14   30:getfield        #36  <Field AccessToken accessToken>
		//   15   33:invokevirtual   #88  <Method String AccessToken.getToken()>
		//   16   36:invokevirtual   #83  <Method void Bundle.putString(String, String)>
			} else
		//*  17   39:goto            55
			{
				parameters.putString("app_id", applicationId);
		//   18   42:aload_0         
		//   19   43:getfield        #69  <Field Bundle parameters>
		//   20   46:ldc1            #76  <String "app_id">
		//   21   48:aload_0         
		//   22   49:getfield        #44  <Field String applicationId>
		//   23   52:invokevirtual   #83  <Method void Bundle.putString(String, String)>
			}
			return new WebDialog(context, action, parameters, theme, listener);
		//   24   55:new             #6   <Class WebDialog>
		//   25   58:dup             
		//   26   59:aload_0         
		//   27   60:getfield        #65  <Field Context context>
		//   28   63:aload_0         
		//   29   64:getfield        #67  <Field String action>
		//   30   67:aload_0         
		//   31   68:getfield        #69  <Field Bundle parameters>
		//   32   71:aload_0         
		//   33   72:getfield        #28  <Field int theme>
		//   34   75:aload_0         
		//   35   76:getfield        #90  <Field WebDialog$OnCompleteListener listener>
		//   36   79:invokespecial   #93  <Method void WebDialog(Context, String, Bundle, int, WebDialog$OnCompleteListener)>
		//   37   82:areturn         
		}

		public String getApplicationId()
		{
			return applicationId;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field String applicationId>
		//    2    4:areturn         
		}

		public Context getContext()
		{
			return context;
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Context context>
		//    2    4:areturn         
		}

		public OnCompleteListener getListener()
		{
			return listener;
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field WebDialog$OnCompleteListener listener>
		//    2    4:areturn         
		}

		public Bundle getParameters()
		{
			return parameters;
		//    0    0:aload_0         
		//    1    1:getfield        #69  <Field Bundle parameters>
		//    2    4:areturn         
		}

		public int getTheme()
		{
			return theme;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field int theme>
		//    2    4:ireturn         
		}

		public Builder setOnCompleteListener(OnCompleteListener oncompletelistener)
		{
			listener = oncompletelistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #90  <Field WebDialog$OnCompleteListener listener>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTheme(int i)
		{
			theme = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #28  <Field int theme>
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
			theme = 0x1030010;
		//    2    4:aload_0         
		//    3    5:ldc1            #26  <Int 0x1030010>
		//    4    7:putfield        #28  <Field int theme>
			accessToken = AccessToken.getCurrentAccessToken();
		//    5   10:aload_0         
		//    6   11:invokestatic    #34  <Method AccessToken AccessToken.getCurrentAccessToken()>
		//    7   14:putfield        #36  <Field AccessToken accessToken>
			if(accessToken == null)
		//*   8   17:aload_0         
		//*   9   18:getfield        #36  <Field AccessToken accessToken>
		//*  10   21:ifnonnull       54
			{
				String s1 = Utility.getMetadataApplicationId(context1);
		//   11   24:aload_1         
		//   12   25:invokestatic    #42  <Method String Utility.getMetadataApplicationId(Context)>
		//   13   28:astore          4
				if(s1 != null)
		//*  14   30:aload           4
		//*  15   32:ifnull          44
					applicationId = s1;
		//   16   35:aload_0         
		//   17   36:aload           4
		//   18   38:putfield        #44  <Field String applicationId>
				else
		//*  19   41:goto            54
					throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
		//   20   44:new             #46  <Class FacebookException>
		//   21   47:dup             
		//   22   48:ldc1            #48  <String "Attempted to create a builder without a valid access token or a valid default Application ID.">
		//   23   50:invokespecial   #51  <Method void FacebookException(String)>
		//   24   53:athrow          
			}
			finishInit(context1, s, bundle);
		//   25   54:aload_0         
		//   26   55:aload_1         
		//   27   56:aload_2         
		//   28   57:aload_3         
		//   29   58:invokespecial   #54  <Method void finishInit(Context, String, Bundle)>
		//   30   61:return          
		}

		public Builder(Context context1, String s, String s1, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			theme = 0x1030010;
		//    2    4:aload_0         
		//    3    5:ldc1            #26  <Int 0x1030010>
		//    4    7:putfield        #28  <Field int theme>
			String s2 = s;
		//    5   10:aload_2         
		//    6   11:astore          5
			if(s == null)
		//*   7   13:aload_2         
		//*   8   14:ifnonnull       23
				s2 = Utility.getMetadataApplicationId(context1);
		//    9   17:aload_1         
		//   10   18:invokestatic    #42  <Method String Utility.getMetadataApplicationId(Context)>
		//   11   21:astore          5
			Validate.notNullOrEmpty(s2, "applicationId");
		//   12   23:aload           5
		//   13   25:ldc1            #57  <String "applicationId">
		//   14   27:invokestatic    #63  <Method void Validate.notNullOrEmpty(String, String)>
			applicationId = s2;
		//   15   30:aload_0         
		//   16   31:aload           5
		//   17   33:putfield        #44  <Field String applicationId>
			finishInit(context1, s1, bundle);
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:aload_3         
		//   21   39:aload           4
		//   22   41:invokespecial   #54  <Method void finishInit(Context, String, Bundle)>
		//   23   44:return          
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
			if(!s.startsWith(expectedRedirectUrl)) goto _L2; else goto _L1
		//   16   30:aload_2         
		//   17   31:aload_0         
		//   18   32:getfield        #13  <Field WebDialog this$0>
		//   19   35:invokestatic    #129 <Method String WebDialog.access$100(WebDialog)>
		//   20   38:invokevirtual   #135 <Method boolean String.startsWith(String)>
		//   21   41:ifeq            251
_L1:
			Object obj;
			Bundle bundle;
			bundle = parseResponseUri(s);
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
			obj = ((Object) (bundle.getString("error_msg")));
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
			if(Utility.isNullOrEmpty(((String) (webview)))) goto _L4; else goto _L3
		//   63  125:aload_1         
		//   64  126:invokestatic    #160 <Method boolean Utility.isNullOrEmpty(String)>
		//   65  129:ifne            140
_L3:
			int i = Integer.parseInt(((String) (webview)));
		//   66  132:aload_1         
		//   67  133:invokestatic    #166 <Method int Integer.parseInt(String)>
		//   68  136:istore_3        
			  goto _L5
		//*  69  137:goto            142
_L4:
			i = -1;
		//   70  140:iconst_m1       
		//   71  141:istore_3        
_L5:
			if(Utility.isNullOrEmpty(s) && Utility.isNullOrEmpty(((String) (obj))) && i == -1)
		//*  72  142:aload_2         
		//*  73  143:invokestatic    #160 <Method boolean Utility.isNullOrEmpty(String)>
		//*  74  146:ifeq            173
		//*  75  149:aload           4
		//*  76  151:invokestatic    #160 <Method boolean Utility.isNullOrEmpty(String)>
		//*  77  154:ifeq            173
		//*  78  157:iload_3         
		//*  79  158:iconst_m1       
		//*  80  159:icmpne          173
			{
				sendSuccessToListener(bundle);
		//   81  162:aload_0         
		//   82  163:getfield        #13  <Field WebDialog this$0>
		//   83  166:aload           5
		//   84  168:invokevirtual   #170 <Method void WebDialog.sendSuccessToListener(Bundle)>
				return true;
		//   85  171:iconst_1        
		//   86  172:ireturn         
			}
			if(s != null && (s.equals("access_denied") || s.equals("OAuthAccessDeniedException")))
		//*  87  173:aload_2         
		//*  88  174:ifnull          204
		//*  89  177:aload_2         
		//*  90  178:ldc1            #172 <String "access_denied">
		//*  91  180:invokevirtual   #176 <Method boolean String.equals(Object)>
		//*  92  183:ifne            195
		//*  93  186:aload_2         
		//*  94  187:ldc1            #178 <String "OAuthAccessDeniedException">
		//*  95  189:invokevirtual   #176 <Method boolean String.equals(Object)>
		//*  96  192:ifeq            204
			{
				cancel();
		//   97  195:aload_0         
		//   98  196:getfield        #13  <Field WebDialog this$0>
		//   99  199:invokevirtual   #179 <Method void WebDialog.cancel()>
				return true;
		//  100  202:iconst_1        
		//  101  203:ireturn         
			}
			if(i == 4201)
		//* 102  204:iload_3         
		//* 103  205:sipush          4201
		//* 104  208:icmpne          220
			{
				cancel();
		//  105  211:aload_0         
		//  106  212:getfield        #13  <Field WebDialog this$0>
		//  107  215:invokevirtual   #179 <Method void WebDialog.cancel()>
				return true;
		//  108  218:iconst_1        
		//  109  219:ireturn         
			} else
			{
				webview = ((WebView) (new FacebookRequestError(i, s, ((String) (obj)))));
		//  110  220:new             #181 <Class FacebookRequestError>
		//  111  223:dup             
		//  112  224:iload_3         
		//  113  225:aload_2         
		//  114  226:aload           4
		//  115  228:invokespecial   #184 <Method void FacebookRequestError(int, String, String)>
		//  116  231:astore_1        
				sendErrorToListener(((Throwable) (new FacebookServiceException(((FacebookRequestError) (webview)), ((String) (obj))))));
		//  117  232:aload_0         
		//  118  233:getfield        #13  <Field WebDialog this$0>
		//  119  236:new             #186 <Class FacebookServiceException>
		//  120  239:dup             
		//  121  240:aload_1         
		//  122  241:aload           4
		//  123  243:invokespecial   #189 <Method void FacebookServiceException(FacebookRequestError, String)>
		//  124  246:invokevirtual   #108 <Method void WebDialog.sendErrorToListener(Throwable)>
				return true;
		//  125  249:iconst_1        
		//  126  250:ireturn         
			}
_L2:
			if(s.startsWith("fbconnect://cancel"))
		//* 127  251:aload_2         
		//* 128  252:ldc1            #191 <String "fbconnect://cancel">
		//* 129  254:invokevirtual   #135 <Method boolean String.startsWith(String)>
		//* 130  257:ifeq            269
			{
				cancel();
		//  131  260:aload_0         
		//  132  261:getfield        #13  <Field WebDialog this$0>
		//  133  264:invokevirtual   #179 <Method void WebDialog.cancel()>
				return true;
		//  134  267:iconst_1        
		//  135  268:ireturn         
			}
			if(s.contains("touch"))
		//* 136  269:aload_2         
		//* 137  270:ldc1            #193 <String "touch">
		//* 138  272:invokevirtual   #197 <Method boolean String.contains(CharSequence)>
		//* 139  275:ifeq            280
				return false;
		//  140  278:iconst_0        
		//  141  279:ireturn         
			try
			{
				getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
		//  142  280:aload_0         
		//  143  281:getfield        #13  <Field WebDialog this$0>
		//  144  284:invokevirtual   #201 <Method Context WebDialog.getContext()>
		//  145  287:new             #203 <Class Intent>
		//  146  290:dup             
		//  147  291:ldc1            #205 <String "android.intent.action.VIEW">
		//  148  293:aload_2         
		//  149  294:invokestatic    #211 <Method Uri Uri.parse(String)>
		//  150  297:invokespecial   #214 <Method void Intent(String, Uri)>
		//  151  300:invokevirtual   #220 <Method void Context.startActivity(Intent)>
			}
		//* 152  303:iconst_1        
		//* 153  304:ireturn         
		//* 154  305:astore_1        
		//* 155  306:goto            140
			// Misplaced declaration of an exception variable
			catch(WebView webview)
		//* 156  309:astore_1        
			{
				return false;
		//  157  310:iconst_0        
		//  158  311:ireturn         
			}
			return true;
			webview;
			if(true) goto _L4; else goto _L6
_L6:
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


	public WebDialog(Context context, String s)
	{
		this(context, s, 0x1030010);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #32  <Int 0x1030010>
	//    4    5:invokespecial   #75  <Method void WebDialog(Context, String, int)>
	//    5    8:return          
	}

	public WebDialog(Context context, String s, int i)
	{
		int j = i;
	//    0    0:iload_3         
	//    1    1:istore          4
		if(i == 0)
	//*   2    3:iload_3         
	//*   3    4:ifne            11
			j = 0x1030010;
	//    4    7:ldc1            #32  <Int 0x1030010>
	//    5    9:istore          4
		super(context, j);
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:iload           4
	//    9   15:invokespecial   #79  <Method void Dialog(Context, int)>
		expectedRedirectUrl = "fbconnect://success";
	//   10   18:aload_0         
	//   11   19:ldc1            #55  <String "fbconnect://success">
	//   12   21:putfield        #81  <Field String expectedRedirectUrl>
		listenerCalled = false;
	//   13   24:aload_0         
	//   14   25:iconst_0        
	//   15   26:putfield        #83  <Field boolean listenerCalled>
		isDetached = false;
	//   16   29:aload_0         
	//   17   30:iconst_0        
	//   18   31:putfield        #85  <Field boolean isDetached>
		isPageFinished = false;
	//   19   34:aload_0         
	//   20   35:iconst_0        
	//   21   36:putfield        #87  <Field boolean isPageFinished>
		url = s;
	//   22   39:aload_0         
	//   23   40:aload_2         
	//   24   41:putfield        #89  <Field String url>
	//   25   44:return          
	}

	public WebDialog(Context context, String s, Bundle bundle, int i, OnCompleteListener oncompletelistener)
	{
		int j = i;
	//    0    0:iload           4
	//    1    2:istore          6
		if(i == 0)
	//*   2    4:iload           4
	//*   3    6:ifne            13
			j = 0x1030010;
	//    4    9:ldc1            #32  <Int 0x1030010>
	//    5   11:istore          6
		super(context, j);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:iload           6
	//    9   17:invokespecial   #79  <Method void Dialog(Context, int)>
		expectedRedirectUrl = "fbconnect://success";
	//   10   20:aload_0         
	//   11   21:ldc1            #55  <String "fbconnect://success">
	//   12   23:putfield        #81  <Field String expectedRedirectUrl>
		listenerCalled = false;
	//   13   26:aload_0         
	//   14   27:iconst_0        
	//   15   28:putfield        #83  <Field boolean listenerCalled>
		isDetached = false;
	//   16   31:aload_0         
	//   17   32:iconst_0        
	//   18   33:putfield        #85  <Field boolean isDetached>
		isPageFinished = false;
	//   19   36:aload_0         
	//   20   37:iconst_0        
	//   21   38:putfield        #87  <Field boolean isPageFinished>
		context = ((Context) (bundle));
	//   22   41:aload_3         
	//   23   42:astore_1        
		if(bundle == null)
	//*  24   43:aload_3         
	//*  25   44:ifnonnull       55
			context = ((Context) (new Bundle()));
	//   26   47:new             #92  <Class Bundle>
	//   27   50:dup             
	//   28   51:invokespecial   #95  <Method void Bundle()>
	//   29   54:astore_1        
		((Bundle) (context)).putString("redirect_uri", "fbconnect://success");
	//   30   55:aload_1         
	//   31   56:ldc1            #97  <String "redirect_uri">
	//   32   58:ldc1            #55  <String "fbconnect://success">
	//   33   60:invokevirtual   #101 <Method void Bundle.putString(String, String)>
		((Bundle) (context)).putString("display", "touch");
	//   34   63:aload_1         
	//   35   64:ldc1            #103 <String "display">
	//   36   66:ldc1            #38  <String "touch">
	//   37   68:invokevirtual   #101 <Method void Bundle.putString(String, String)>
		((Bundle) (context)).putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[] {
			FacebookSdk.getSdkVersion()
		}));
	//   38   71:aload_1         
	//   39   72:ldc1            #105 <String "sdk">
	//   40   74:getstatic       #111 <Field Locale Locale.ROOT>
	//   41   77:ldc1            #113 <String "android-%s">
	//   42   79:iconst_1        
	//   43   80:anewarray       Object[]
	//   44   83:dup             
	//   45   84:iconst_0        
	//   46   85:invokestatic    #121 <Method String FacebookSdk.getSdkVersion()>
	//   47   88:aastore         
	//   48   89:invokestatic    #127 <Method String String.format(Locale, String, Object[])>
	//   49   92:invokevirtual   #101 <Method void Bundle.putString(String, String)>
		bundle = ((Bundle) (ServerProtocol.getDialogAuthority()));
	//   50   95:invokestatic    #132 <Method String ServerProtocol.getDialogAuthority()>
	//   51   98:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   52   99:new             #134 <Class StringBuilder>
	//   53  102:dup             
	//   54  103:invokespecial   #135 <Method void StringBuilder()>
	//   55  106:astore          7
		stringbuilder.append(ServerProtocol.getAPIVersion());
	//   56  108:aload           7
	//   57  110:invokestatic    #138 <Method String ServerProtocol.getAPIVersion()>
	//   58  113:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   59  116:pop             
		stringbuilder.append("/");
	//   60  117:aload           7
	//   61  119:ldc1            #144 <String "/">
	//   62  121:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   63  124:pop             
		stringbuilder.append("dialog/");
	//   64  125:aload           7
	//   65  127:ldc1            #146 <String "dialog/">
	//   66  129:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   67  132:pop             
		stringbuilder.append(s);
	//   68  133:aload           7
	//   69  135:aload_2         
	//   70  136:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   71  139:pop             
		url = Utility.buildUri(((String) (bundle)), stringbuilder.toString(), ((Bundle) (context))).toString();
	//   72  140:aload_0         
	//   73  141:aload_3         
	//   74  142:aload           7
	//   75  144:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   76  147:aload_1         
	//   77  148:invokestatic    #155 <Method Uri Utility.buildUri(String, String, Bundle)>
	//   78  151:invokevirtual   #158 <Method String Uri.toString()>
	//   79  154:putfield        #89  <Field String url>
		onCompleteListener = oncompletelistener;
	//   80  157:aload_0         
	//   81  158:aload           5
	//   82  160:putfield        #160 <Field WebDialog$OnCompleteListener onCompleteListener>
	//   83  163:return          
	}

	private void createCrossImage()
	{
		crossImageView = new ImageView(getContext());
	//    0    0:aload_0         
	//    1    1:new             #185 <Class ImageView>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #189 <Method Context getContext()>
	//    5    9:invokespecial   #192 <Method void ImageView(Context)>
	//    6   12:putfield        #180 <Field ImageView crossImageView>
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
	//    8   16:getfield        #180 <Field ImageView crossImageView>
	//    9   19:new             #8   <Class WebDialog$2>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #195 <Method void WebDialog$2(WebDialog)>
	//   13   27:invokevirtual   #199 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		Drawable drawable = getContext().getResources().getDrawable(com.facebook.R.drawable.com_facebook_close);
	//   14   30:aload_0         
	//   15   31:invokevirtual   #189 <Method Context getContext()>
	//   16   34:invokevirtual   #205 <Method Resources Context.getResources()>
	//   17   37:getstatic       #210 <Field int com.facebook.R$drawable.com_facebook_close>
	//   18   40:invokevirtual   #216 <Method Drawable Resources.getDrawable(int)>
	//   19   43:astore_1        
		crossImageView.setImageDrawable(drawable);
	//   20   44:aload_0         
	//   21   45:getfield        #180 <Field ImageView crossImageView>
	//   22   48:aload_1         
	//   23   49:invokevirtual   #220 <Method void ImageView.setImageDrawable(Drawable)>
		crossImageView.setVisibility(4);
	//   24   52:aload_0         
	//   25   53:getfield        #180 <Field ImageView crossImageView>
	//   26   56:iconst_4        
	//   27   57:invokevirtual   #224 <Method void ImageView.setVisibility(int)>
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
	//    6    7:ldc2w           #48  <Double 0.5D>
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
	//   18   34:ldc2w           #48  <Double 0.5D>
	//   19   37:iload           4
	//   20   39:iload           7
	//   21   41:isub            
	//   22   42:i2d             
	//   23   43:iload           4
	//   24   45:iload_3         
	//   25   46:isub            
	//   26   47:i2d             
	//   27   48:ddiv            
	//   28   49:ldc2w           #48  <Double 0.5D>
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

	private void setUpWebView(int i)
	{
		LinearLayout linearlayout = new LinearLayout(getContext());
	//    0    0:new             #232 <Class LinearLayout>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #189 <Method Context getContext()>
	//    4    8:invokespecial   #233 <Method void LinearLayout(Context)>
	//    5   11:astore_2        
		webView = ((WebView) (new WebView(getContext().getApplicationContext()) {

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
	//   11   19:invokevirtual   #189 <Method Context getContext()>
	//   12   22:invokevirtual   #236 <Method Context Context.getApplicationContext()>
	//   13   25:invokespecial   #239 <Method void WebDialog$3(WebDialog, Context)>
	//   14   28:putfield        #176 <Field WebView webView>
		webView.setVerticalScrollBarEnabled(false);
	//   15   31:aload_0         
	//   16   32:getfield        #176 <Field WebView webView>
	//   17   35:iconst_0        
	//   18   36:invokevirtual   #245 <Method void WebView.setVerticalScrollBarEnabled(boolean)>
		webView.setHorizontalScrollBarEnabled(false);
	//   19   39:aload_0         
	//   20   40:getfield        #176 <Field WebView webView>
	//   21   43:iconst_0        
	//   22   44:invokevirtual   #248 <Method void WebView.setHorizontalScrollBarEnabled(boolean)>
		webView.setWebViewClient(((WebViewClient) (new DialogWebViewClient())));
	//   23   47:aload_0         
	//   24   48:getfield        #176 <Field WebView webView>
	//   25   51:new             #17  <Class WebDialog$DialogWebViewClient>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:aconst_null     
	//   29   57:invokespecial   #251 <Method void WebDialog$DialogWebViewClient(WebDialog, WebDialog$1)>
	//   30   60:invokevirtual   #255 <Method void WebView.setWebViewClient(WebViewClient)>
		webView.getSettings().setJavaScriptEnabled(true);
	//   31   63:aload_0         
	//   32   64:getfield        #176 <Field WebView webView>
	//   33   67:invokevirtual   #259 <Method WebSettings WebView.getSettings()>
	//   34   70:iconst_1        
	//   35   71:invokevirtual   #264 <Method void WebSettings.setJavaScriptEnabled(boolean)>
		webView.loadUrl(url);
	//   36   74:aload_0         
	//   37   75:getfield        #176 <Field WebView webView>
	//   38   78:aload_0         
	//   39   79:getfield        #89  <Field String url>
	//   40   82:invokevirtual   #268 <Method void WebView.loadUrl(String)>
		webView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   41   85:aload_0         
	//   42   86:getfield        #176 <Field WebView webView>
	//   43   89:new             #270 <Class android.widget.FrameLayout$LayoutParams>
	//   44   92:dup             
	//   45   93:iconst_m1       
	//   46   94:iconst_m1       
	//   47   95:invokespecial   #273 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   48   98:invokevirtual   #277 <Method void WebView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		webView.setVisibility(4);
	//   49  101:aload_0         
	//   50  102:getfield        #176 <Field WebView webView>
	//   51  105:iconst_4        
	//   52  106:invokevirtual   #278 <Method void WebView.setVisibility(int)>
		webView.getSettings().setSavePassword(false);
	//   53  109:aload_0         
	//   54  110:getfield        #176 <Field WebView webView>
	//   55  113:invokevirtual   #259 <Method WebSettings WebView.getSettings()>
	//   56  116:iconst_0        
	//   57  117:invokevirtual   #281 <Method void WebSettings.setSavePassword(boolean)>
		webView.getSettings().setSaveFormData(false);
	//   58  120:aload_0         
	//   59  121:getfield        #176 <Field WebView webView>
	//   60  124:invokevirtual   #259 <Method WebSettings WebView.getSettings()>
	//   61  127:iconst_0        
	//   62  128:invokevirtual   #284 <Method void WebSettings.setSaveFormData(boolean)>
		webView.setFocusable(true);
	//   63  131:aload_0         
	//   64  132:getfield        #176 <Field WebView webView>
	//   65  135:iconst_1        
	//   66  136:invokevirtual   #287 <Method void WebView.setFocusable(boolean)>
		webView.setFocusableInTouchMode(true);
	//   67  139:aload_0         
	//   68  140:getfield        #176 <Field WebView webView>
	//   69  143:iconst_1        
	//   70  144:invokevirtual   #290 <Method void WebView.setFocusableInTouchMode(boolean)>
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
	//   71  147:aload_0         
	//   72  148:getfield        #176 <Field WebView webView>
	//   73  151:new             #12  <Class WebDialog$4>
	//   74  154:dup             
	//   75  155:aload_0         
	//   76  156:invokespecial   #291 <Method void WebDialog$4(WebDialog)>
	//   77  159:invokevirtual   #295 <Method void WebView.setOnTouchListener(android.view.View$OnTouchListener)>
		linearlayout.setPadding(i, i, i, i);
	//   78  162:aload_2         
	//   79  163:iload_1         
	//   80  164:iload_1         
	//   81  165:iload_1         
	//   82  166:iload_1         
	//   83  167:invokevirtual   #299 <Method void LinearLayout.setPadding(int, int, int, int)>
		linearlayout.addView(((View) (webView)));
	//   84  170:aload_2         
	//   85  171:aload_0         
	//   86  172:getfield        #176 <Field WebView webView>
	//   87  175:invokevirtual   #303 <Method void LinearLayout.addView(View)>
		linearlayout.setBackgroundColor(0xcc000000);
	//   88  178:aload_2         
	//   89  179:ldc1            #26  <Int 0xcc000000>
	//   90  181:invokevirtual   #306 <Method void LinearLayout.setBackgroundColor(int)>
		contentFrameLayout.addView(((View) (linearlayout)));
	//   91  184:aload_0         
	//   92  185:getfield        #172 <Field FrameLayout contentFrameLayout>
	//   93  188:aload_2         
	//   94  189:invokevirtual   #309 <Method void FrameLayout.addView(View)>
	//   95  192:return          
	}

	public void cancel()
	{
		if(onCompleteListener != null && !listenerCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field WebDialog$OnCompleteListener onCompleteListener>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #83  <Field boolean listenerCalled>
	//*   5   11:ifne            25
			sendErrorToListener(((Throwable) (new FacebookOperationCanceledException())));
	//    6   14:aload_0         
	//    7   15:new             #313 <Class FacebookOperationCanceledException>
	//    8   18:dup             
	//    9   19:invokespecial   #314 <Method void FacebookOperationCanceledException()>
	//   10   22:invokevirtual   #318 <Method void sendErrorToListener(Throwable)>
	//   11   25:return          
	}

	public void dismiss()
	{
		if(webView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #176 <Field WebView webView>
	//*   2    4:ifnull          14
			webView.stopLoading();
	//    3    7:aload_0         
	//    4    8:getfield        #176 <Field WebView webView>
	//    5   11:invokevirtual   #322 <Method void WebView.stopLoading()>
		if(!isDetached && spinner != null && spinner.isShowing())
	//*   6   14:aload_0         
	//*   7   15:getfield        #85  <Field boolean isDetached>
	//*   8   18:ifne            45
	//*   9   21:aload_0         
	//*  10   22:getfield        #168 <Field ProgressDialog spinner>
	//*  11   25:ifnull          45
	//*  12   28:aload_0         
	//*  13   29:getfield        #168 <Field ProgressDialog spinner>
	//*  14   32:invokevirtual   #328 <Method boolean ProgressDialog.isShowing()>
	//*  15   35:ifeq            45
			spinner.dismiss();
	//   16   38:aload_0         
	//   17   39:getfield        #168 <Field ProgressDialog spinner>
	//   18   42:invokevirtual   #330 <Method void ProgressDialog.dismiss()>
		super.dismiss();
	//   19   45:aload_0         
	//   20   46:invokespecial   #331 <Method void Dialog.dismiss()>
	//   21   49:return          
	}

	public OnCompleteListener getOnCompleteListener()
	{
		return onCompleteListener;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field WebDialog$OnCompleteListener onCompleteListener>
	//    2    4:areturn         
	}

	protected WebView getWebView()
	{
		return webView;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field WebView webView>
	//    2    4:areturn         
	}

	protected boolean isListenerCalled()
	{
		return listenerCalled;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field boolean listenerCalled>
	//    2    4:ireturn         
	}

	protected boolean isPageFinished()
	{
		return isPageFinished;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field boolean isPageFinished>
	//    2    4:ireturn         
	}

	public void onAttachedToWindow()
	{
		isDetached = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #85  <Field boolean isDetached>
		super.onAttachedToWindow();
	//    3    5:aload_0         
	//    4    6:invokespecial   #339 <Method void Dialog.onAttachedToWindow()>
	//    5    9:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #343 <Method void Dialog.onCreate(Bundle)>
		spinner = new ProgressDialog(getContext());
	//    3    5:aload_0         
	//    4    6:new             #324 <Class ProgressDialog>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokevirtual   #189 <Method Context getContext()>
	//    8   14:invokespecial   #344 <Method void ProgressDialog(Context)>
	//    9   17:putfield        #168 <Field ProgressDialog spinner>
		spinner.requestWindowFeature(1);
	//   10   20:aload_0         
	//   11   21:getfield        #168 <Field ProgressDialog spinner>
	//   12   24:iconst_1        
	//   13   25:invokevirtual   #348 <Method boolean ProgressDialog.requestWindowFeature(int)>
	//   14   28:pop             
		spinner.setMessage(((CharSequence) (getContext().getString(com.facebook.R.string.com_facebook_loading))));
	//   15   29:aload_0         
	//   16   30:getfield        #168 <Field ProgressDialog spinner>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #189 <Method Context getContext()>
	//   19   37:getstatic       #353 <Field int com.facebook.R$string.com_facebook_loading>
	//   20   40:invokevirtual   #357 <Method String Context.getString(int)>
	//   21   43:invokevirtual   #361 <Method void ProgressDialog.setMessage(CharSequence)>
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
	//   22   46:aload_0         
	//   23   47:getfield        #168 <Field ProgressDialog spinner>
	//   24   50:new             #6   <Class WebDialog$1>
	//   25   53:dup             
	//   26   54:aload_0         
	//   27   55:invokespecial   #362 <Method void WebDialog$1(WebDialog)>
	//   28   58:invokevirtual   #366 <Method void ProgressDialog.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
		requestWindowFeature(1);
	//   29   61:aload_0         
	//   30   62:iconst_1        
	//   31   63:invokevirtual   #367 <Method boolean requestWindowFeature(int)>
	//   32   66:pop             
		contentFrameLayout = new FrameLayout(getContext());
	//   33   67:aload_0         
	//   34   68:new             #308 <Class FrameLayout>
	//   35   71:dup             
	//   36   72:aload_0         
	//   37   73:invokevirtual   #189 <Method Context getContext()>
	//   38   76:invokespecial   #368 <Method void FrameLayout(Context)>
	//   39   79:putfield        #172 <Field FrameLayout contentFrameLayout>
		resize();
	//   40   82:aload_0         
	//   41   83:invokevirtual   #371 <Method void resize()>
		getWindow().setGravity(17);
	//   42   86:aload_0         
	//   43   87:invokevirtual   #375 <Method Window getWindow()>
	//   44   90:bipush          17
	//   45   92:invokevirtual   #380 <Method void Window.setGravity(int)>
		getWindow().setSoftInputMode(16);
	//   46   95:aload_0         
	//   47   96:invokevirtual   #375 <Method Window getWindow()>
	//   48   99:bipush          16
	//   49  101:invokevirtual   #383 <Method void Window.setSoftInputMode(int)>
		createCrossImage();
	//   50  104:aload_0         
	//   51  105:invokespecial   #385 <Method void createCrossImage()>
		setUpWebView(crossImageView.getDrawable().getIntrinsicWidth() / 2 + 1);
	//   52  108:aload_0         
	//   53  109:aload_0         
	//   54  110:getfield        #180 <Field ImageView crossImageView>
	//   55  113:invokevirtual   #388 <Method Drawable ImageView.getDrawable()>
	//   56  116:invokevirtual   #394 <Method int Drawable.getIntrinsicWidth()>
	//   57  119:iconst_2        
	//   58  120:idiv            
	//   59  121:iconst_1        
	//   60  122:iadd            
	//   61  123:invokespecial   #396 <Method void setUpWebView(int)>
		contentFrameLayout.addView(((View) (crossImageView)), new android.view.ViewGroup.LayoutParams(-2, -2));
	//   62  126:aload_0         
	//   63  127:getfield        #172 <Field FrameLayout contentFrameLayout>
	//   64  130:aload_0         
	//   65  131:getfield        #180 <Field ImageView crossImageView>
	//   66  134:new             #398 <Class android.view.ViewGroup$LayoutParams>
	//   67  137:dup             
	//   68  138:bipush          -2
	//   69  140:bipush          -2
	//   70  142:invokespecial   #399 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   71  145:invokevirtual   #402 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		setContentView(((View) (contentFrameLayout)));
	//   72  148:aload_0         
	//   73  149:aload_0         
	//   74  150:getfield        #172 <Field FrameLayout contentFrameLayout>
	//   75  153:invokevirtual   #405 <Method void setContentView(View)>
	//   76  156:return          
	}

	public void onDetachedFromWindow()
	{
		isDetached = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #85  <Field boolean isDetached>
		super.onDetachedFromWindow();
	//    3    5:aload_0         
	//    4    6:invokespecial   #408 <Method void Dialog.onDetachedFromWindow()>
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
	//    4    6:invokevirtual   #412 <Method void cancel()>
		return super.onKeyDown(i, keyevent);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #414 <Method boolean Dialog.onKeyDown(int, KeyEvent)>
	//    9   15:ireturn         
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #417 <Method void Dialog.onStart()>
		resize();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #371 <Method void resize()>
	//    4    8:return          
	}

	protected Bundle parseResponseUri(String s)
	{
		s = ((String) (Uri.parse(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #423 <Method Uri Uri.parse(String)>
	//    2    4:astore_1        
		Bundle bundle = Utility.parseUrlQueryString(((Uri) (s)).getQuery());
	//    3    5:aload_1         
	//    4    6:invokevirtual   #426 <Method String Uri.getQuery()>
	//    5    9:invokestatic    #429 <Method Bundle Utility.parseUrlQueryString(String)>
	//    6   12:astore_2        
		bundle.putAll(Utility.parseUrlQueryString(((Uri) (s)).getFragment()));
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #432 <Method String Uri.getFragment()>
	//   10   18:invokestatic    #429 <Method Bundle Utility.parseUrlQueryString(String)>
	//   11   21:invokevirtual   #435 <Method void Bundle.putAll(Bundle)>
		return bundle;
	//   12   24:aload_2         
	//   13   25:areturn         
	}

	public void resize()
	{
		Display display = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #189 <Method Context getContext()>
	//    2    4:ldc2            #437 <String "window">
	//    3    7:invokevirtual   #441 <Method Object Context.getSystemService(String)>
	//    4   10:checkcast       #443 <Class WindowManager>
	//    5   13:invokeinterface #447 <Method Display WindowManager.getDefaultDisplay()>
	//    6   18:astore_3        
		DisplayMetrics displaymetrics = new DisplayMetrics();
	//    7   19:new             #449 <Class DisplayMetrics>
	//    8   22:dup             
	//    9   23:invokespecial   #450 <Method void DisplayMetrics()>
	//   10   26:astore          4
		display.getMetrics(displaymetrics);
	//   11   28:aload_3         
	//   12   29:aload           4
	//   13   31:invokevirtual   #456 <Method void Display.getMetrics(DisplayMetrics)>
		int i;
		if(displaymetrics.widthPixels < displaymetrics.heightPixels)
	//*  14   34:aload           4
	//*  15   36:getfield        #459 <Field int DisplayMetrics.widthPixels>
	//*  16   39:aload           4
	//*  17   41:getfield        #462 <Field int DisplayMetrics.heightPixels>
	//*  18   44:icmpge          56
			i = displaymetrics.widthPixels;
	//   19   47:aload           4
	//   20   49:getfield        #459 <Field int DisplayMetrics.widthPixels>
	//   21   52:istore_1        
		else
	//*  22   53:goto            62
			i = displaymetrics.heightPixels;
	//   23   56:aload           4
	//   24   58:getfield        #462 <Field int DisplayMetrics.heightPixels>
	//   25   61:istore_1        
		int j;
		if(displaymetrics.widthPixels < displaymetrics.heightPixels)
	//*  26   62:aload           4
	//*  27   64:getfield        #459 <Field int DisplayMetrics.widthPixels>
	//*  28   67:aload           4
	//*  29   69:getfield        #462 <Field int DisplayMetrics.heightPixels>
	//*  30   72:icmpge          84
			j = displaymetrics.heightPixels;
	//   31   75:aload           4
	//   32   77:getfield        #462 <Field int DisplayMetrics.heightPixels>
	//   33   80:istore_2        
		else
	//*  34   81:goto            90
			j = displaymetrics.widthPixels;
	//   35   84:aload           4
	//   36   86:getfield        #459 <Field int DisplayMetrics.widthPixels>
	//   37   89:istore_2        
		i = Math.min(getScaledSize(i, displaymetrics.density, 480, 800), displaymetrics.widthPixels);
	//   38   90:aload_0         
	//   39   91:iload_1         
	//   40   92:aload           4
	//   41   94:getfield        #466 <Field float DisplayMetrics.density>
	//   42   97:sipush          480
	//   43  100:sipush          800
	//   44  103:invokespecial   #468 <Method int getScaledSize(int, float, int, int)>
	//   45  106:aload           4
	//   46  108:getfield        #459 <Field int DisplayMetrics.widthPixels>
	//   47  111:invokestatic    #474 <Method int Math.min(int, int)>
	//   48  114:istore_1        
		j = Math.min(getScaledSize(j, displaymetrics.density, 800, 1280), displaymetrics.heightPixels);
	//   49  115:aload_0         
	//   50  116:iload_2         
	//   51  117:aload           4
	//   52  119:getfield        #466 <Field float DisplayMetrics.density>
	//   53  122:sipush          800
	//   54  125:sipush          1280
	//   55  128:invokespecial   #468 <Method int getScaledSize(int, float, int, int)>
	//   56  131:aload           4
	//   57  133:getfield        #462 <Field int DisplayMetrics.heightPixels>
	//   58  136:invokestatic    #474 <Method int Math.min(int, int)>
	//   59  139:istore_2        
		getWindow().setLayout(i, j);
	//   60  140:aload_0         
	//   61  141:invokevirtual   #375 <Method Window getWindow()>
	//   62  144:iload_1         
	//   63  145:iload_2         
	//   64  146:invokevirtual   #477 <Method void Window.setLayout(int, int)>
	//   65  149:return          
	}

	protected void sendErrorToListener(Throwable throwable)
	{
		if(onCompleteListener != null && !listenerCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field WebDialog$OnCompleteListener onCompleteListener>
	//*   2    4:ifnull          58
	//*   3    7:aload_0         
	//*   4    8:getfield        #83  <Field boolean listenerCalled>
	//*   5   11:ifne            58
		{
			listenerCalled = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #83  <Field boolean listenerCalled>
			if(throwable instanceof FacebookException)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #479 <Class FacebookException>
	//*  11   23:ifeq            34
				throwable = ((Throwable) ((FacebookException)throwable));
	//   12   26:aload_1         
	//   13   27:checkcast       #479 <Class FacebookException>
	//   14   30:astore_1        
			else
	//*  15   31:goto            43
				throwable = ((Throwable) (new FacebookException(throwable)));
	//   16   34:new             #479 <Class FacebookException>
	//   17   37:dup             
	//   18   38:aload_1         
	//   19   39:invokespecial   #481 <Method void FacebookException(Throwable)>
	//   20   42:astore_1        
			onCompleteListener.onComplete(((Bundle) (null)), ((FacebookException) (throwable)));
	//   21   43:aload_0         
	//   22   44:getfield        #160 <Field WebDialog$OnCompleteListener onCompleteListener>
	//   23   47:aconst_null     
	//   24   48:aload_1         
	//   25   49:invokeinterface #485 <Method void WebDialog$OnCompleteListener.onComplete(Bundle, FacebookException)>
			dismiss();
	//   26   54:aload_0         
	//   27   55:invokevirtual   #486 <Method void dismiss()>
		}
	//   28   58:return          
	}

	protected void sendSuccessToListener(Bundle bundle)
	{
		if(onCompleteListener != null && !listenerCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field WebDialog$OnCompleteListener onCompleteListener>
	//*   2    4:ifnull          34
	//*   3    7:aload_0         
	//*   4    8:getfield        #83  <Field boolean listenerCalled>
	//*   5   11:ifne            34
		{
			listenerCalled = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #83  <Field boolean listenerCalled>
			onCompleteListener.onComplete(bundle, ((FacebookException) (null)));
	//    9   19:aload_0         
	//   10   20:getfield        #160 <Field WebDialog$OnCompleteListener onCompleteListener>
	//   11   23:aload_1         
	//   12   24:aconst_null     
	//   13   25:invokeinterface #485 <Method void WebDialog$OnCompleteListener.onComplete(Bundle, FacebookException)>
			dismiss();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #486 <Method void dismiss()>
		}
	//   16   34:return          
	}

	protected void setExpectedRedirectUrl(String s)
	{
		expectedRedirectUrl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field String expectedRedirectUrl>
	//    3    5:return          
	}

	public void setOnCompleteListener(OnCompleteListener oncompletelistener)
	{
		onCompleteListener = oncompletelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #160 <Field WebDialog$OnCompleteListener onCompleteListener>
	//    3    5:return          
	}

	private static final int API_EC_DIALOG_CANCEL = 4201;
	private static final int BACKGROUND_GRAY = 0xcc000000;
	static final String CANCEL_URI = "fbconnect://cancel";
	public static final int DEFAULT_THEME = 0x1030010;
	static final boolean DISABLE_SSL_CHECK_FOR_TESTING = false;
	private static final String DISPLAY_TOUCH = "touch";
	private static final String LOG_TAG = "FacebookSDK.WebDialog";
	private static final int MAX_PADDING_SCREEN_HEIGHT = 1280;
	private static final int MAX_PADDING_SCREEN_WIDTH = 800;
	private static final double MIN_SCALE_FACTOR = 0.5D;
	private static final int NO_PADDING_SCREEN_HEIGHT = 800;
	private static final int NO_PADDING_SCREEN_WIDTH = 480;
	static final String REDIRECT_URI = "fbconnect://success";
	private FrameLayout contentFrameLayout;
	private ImageView crossImageView;
	private String expectedRedirectUrl;
	private boolean isDetached;
	private boolean isPageFinished;
	private boolean listenerCalled;
	private OnCompleteListener onCompleteListener;
	private ProgressDialog spinner;
	private String url;
	private WebView webView;


/*
	static String access$100(WebDialog webdialog)
	{
		return webdialog.expectedRedirectUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field String expectedRedirectUrl>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$200(WebDialog webdialog)
	{
		return webdialog.isDetached;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field boolean isDetached>
	//    2    4:ireturn         
	}

*/


/*
	static ProgressDialog access$300(WebDialog webdialog)
	{
		return webdialog.spinner;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field ProgressDialog spinner>
	//    2    4:areturn         
	}

*/


/*
	static FrameLayout access$400(WebDialog webdialog)
	{
		return webdialog.contentFrameLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field FrameLayout contentFrameLayout>
	//    2    4:areturn         
	}

*/


/*
	static WebView access$500(WebDialog webdialog)
	{
		return webdialog.webView;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field WebView webView>
	//    2    4:areturn         
	}

*/


/*
	static ImageView access$600(WebDialog webdialog)
	{
		return webdialog.crossImageView;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field ImageView crossImageView>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$702(WebDialog webdialog, boolean flag)
	{
		webdialog.isPageFinished = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #87  <Field boolean isPageFinished>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
