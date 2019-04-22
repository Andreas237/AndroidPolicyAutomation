// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.app.ProgressDialog;
import android.content.*;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.*;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.*;

// Referenced classes of package com.facebook.internal:
//			WebDialog, Utility

private class WebDialog$DialogWebViewClient extends WebViewClient
{

	public void onPageFinished(WebView webview, String s)
	{
		super.onPageFinished(webview, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void WebViewClient.onPageFinished(WebView, String)>
		if(!WebDialog.access$200(WebDialog.this))
	//*   4    6:aload_0         
	//*   5    7:getfield        #13  <Field WebDialog this$0>
	//*   6   10:invokestatic    #28  <Method boolean WebDialog.access$200(WebDialog)>
	//*   7   13:ifne            26
			WebDialog.access$300(WebDialog.this).dismiss();
	//    8   16:aload_0         
	//    9   17:getfield        #13  <Field WebDialog this$0>
	//   10   20:invokestatic    #32  <Method ProgressDialog WebDialog.access$300(WebDialog)>
	//   11   23:invokevirtual   #37  <Method void ProgressDialog.dismiss()>
		WebDialog.access$400(WebDialog.this).setBackgroundColor(0);
	//   12   26:aload_0         
	//   13   27:getfield        #13  <Field WebDialog this$0>
	//   14   30:invokestatic    #41  <Method FrameLayout WebDialog.access$400(WebDialog)>
	//   15   33:iconst_0        
	//   16   34:invokevirtual   #47  <Method void FrameLayout.setBackgroundColor(int)>
		WebDialog.access$500(WebDialog.this).setVisibility(0);
	//   17   37:aload_0         
	//   18   38:getfield        #13  <Field WebDialog this$0>
	//   19   41:invokestatic    #51  <Method WebView WebDialog.access$500(WebDialog)>
	//   20   44:iconst_0        
	//   21   45:invokevirtual   #56  <Method void WebView.setVisibility(int)>
		WebDialog.access$600(WebDialog.this).setVisibility(0);
	//   22   48:aload_0         
	//   23   49:getfield        #13  <Field WebDialog this$0>
	//   24   52:invokestatic    #60  <Method ImageView WebDialog.access$600(WebDialog)>
	//   25   55:iconst_0        
	//   26   56:invokevirtual   #63  <Method void ImageView.setVisibility(int)>
		WebDialog.access$702(WebDialog.this, true);
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
		if(!WebDialog.access$200(WebDialog.this))
	//*  21   41:aload_0         
	//*  22   42:getfield        #13  <Field WebDialog this$0>
	//*  23   45:invokestatic    #28  <Method boolean WebDialog.access$200(WebDialog)>
	//*  24   48:ifne            61
			WebDialog.access$300(WebDialog.this).show();
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
		if(s.startsWith(WebDialog.access$100(WebDialog.this)))
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

	private WebDialog$DialogWebViewClient()
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

	WebDialog$DialogWebViewClient(WebDialog._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void WebDialog$DialogWebViewClient(WebDialog)>
	//    3    5:return          
	}
}
