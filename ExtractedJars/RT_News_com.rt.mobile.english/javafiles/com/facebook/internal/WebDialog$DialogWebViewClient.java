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
		if(!s.startsWith(WebDialog.access$100(WebDialog.this))) goto _L2; else goto _L1
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
