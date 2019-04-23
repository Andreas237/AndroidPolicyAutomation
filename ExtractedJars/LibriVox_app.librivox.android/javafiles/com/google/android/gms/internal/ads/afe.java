// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.webkit.*;
import android.widget.*;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.ads.internal.bt;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.common.util.o;

// Referenced classes of package com.google.android.gms.internal.ads:
//			afn, agv, afl, afk, 
//			afj, afi, afh, aff, 
//			wx, afm, xg, p, 
//			bwk, m, vo

public final class afe extends WebChromeClient
{

	public afe(afn afn1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void WebChromeClient()>
		a = afn1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field afn a>
	//    5    9:return          
	}

	private static Context a(WebView webview)
	{
		if(!(webview instanceof afn))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #21  <Class afn>
	//*   2    4:ifne            12
			return webview.getContext();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #27  <Method Context WebView.getContext()>
	//    5   11:areturn         
		webview = ((WebView) ((afn)webview));
	//    6   12:aload_0         
	//    7   13:checkcast       #21  <Class afn>
	//    8   16:astore_0        
		android.app.Activity activity = ((afn) (webview)).d();
	//    9   17:aload_0         
	//   10   18:invokeinterface #31  <Method android.app.Activity afn.d()>
	//   11   23:astore_1        
		if(activity != null)
	//*  12   24:aload_1         
	//*  13   25:ifnull          30
			return ((Context) (activity));
	//   14   28:aload_1         
	//   15   29:areturn         
		else
			return ((afn) (webview)).getContext();
	//   16   30:aload_0         
	//   17   31:invokeinterface #32  <Method Context afn.getContext()>
	//   18   36:areturn         
	}

	private final boolean a(Context context, String s, String s1, String s2, String s3, JsResult jsresult, JsPromptResult jspromptresult, 
			boolean flag)
	{
		bt bt1;
		if(a == null || a.w() == null || a.w().a() == null)
			break MISSING_BLOCK_LABEL_137;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field afn a>
	//    2    4:ifnull          137
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field afn a>
	//    5   11:invokeinterface #39  <Method agv afn.w()>
	//    6   16:ifnull          137
	//    7   19:aload_0         
	//    8   20:getfield        #17  <Field afn a>
	//    9   23:invokeinterface #39  <Method agv afn.w()>
	//   10   28:invokeinterface #44  <Method bt agv.a()>
	//   11   33:ifnull          137
		bt1 = a.w().a();
	//   12   36:aload_0         
	//   13   37:getfield        #17  <Field afn a>
	//   14   40:invokeinterface #39  <Method agv afn.w()>
	//   15   45:invokeinterface #44  <Method bt agv.a()>
	//   16   50:astore          9
		if(bt1 == null)
			break MISSING_BLOCK_LABEL_137;
	//   17   52:aload           9
	//   18   54:ifnull          137
		if(bt1.b())
			break MISSING_BLOCK_LABEL_137;
	//   19   57:aload           9
	//   20   59:invokevirtual   #50  <Method boolean bt.b()>
	//   21   62:ifne            137
		context = ((Context) (new StringBuilder(String.valueOf(((Object) (s))).length() + 11 + String.valueOf(((Object) (s2))).length())));
	//   22   65:new             #52  <Class StringBuilder>
	//   23   68:dup             
	//   24   69:aload_2         
	//   25   70:invokestatic    #58  <Method String String.valueOf(Object)>
	//   26   73:invokevirtual   #62  <Method int String.length()>
	//   27   76:bipush          11
	//   28   78:iadd            
	//   29   79:aload           4
	//   30   81:invokestatic    #58  <Method String String.valueOf(Object)>
	//   31   84:invokevirtual   #62  <Method int String.length()>
	//   32   87:iadd            
	//   33   88:invokespecial   #65  <Method void StringBuilder(int)>
	//   34   91:astore_1        
		((StringBuilder) (context)).append("window.");
	//   35   92:aload_1         
	//   36   93:ldc1            #67  <String "window.">
	//   37   95:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   38   98:pop             
		((StringBuilder) (context)).append(s);
	//   39   99:aload_1         
	//   40  100:aload_2         
	//   41  101:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   42  104:pop             
		((StringBuilder) (context)).append("('");
	//   43  105:aload_1         
	//   44  106:ldc1            #73  <String "('">
	//   45  108:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   46  111:pop             
		((StringBuilder) (context)).append(s2);
	//   47  112:aload_1         
	//   48  113:aload           4
	//   49  115:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   50  118:pop             
		((StringBuilder) (context)).append("')");
	//   51  119:aload_1         
	//   52  120:ldc1            #75  <String "')">
	//   53  122:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   54  125:pop             
		bt1.a(((StringBuilder) (context)).toString());
	//   55  126:aload           9
	//   56  128:aload_1         
	//   57  129:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   58  132:invokevirtual   #82  <Method void bt.a(String)>
		return false;
	//   59  135:iconst_0        
	//   60  136:ireturn         
		try
		{
			s = ((String) (new android.app.AlertDialog.Builder(context)));
	//   61  137:new             #84  <Class android.app.AlertDialog$Builder>
	//   62  140:dup             
	//   63  141:aload_1         
	//   64  142:invokespecial   #87  <Method void android.app.AlertDialog$Builder(Context)>
	//   65  145:astore_2        
			((android.app.AlertDialog.Builder) (s)).setTitle(((CharSequence) (s1)));
	//   66  146:aload_2         
	//   67  147:aload_3         
	//   68  148:invokevirtual   #91  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   69  151:pop             
		}
	//*  70  152:iload           8
	//*  71  154:ifeq            268
	//*  72  157:new             #93  <Class LinearLayout>
	//*  73  160:dup             
	//*  74  161:aload_1         
	//*  75  162:invokespecial   #94  <Method void LinearLayout(Context)>
	//*  76  165:astore_3        
	//*  77  166:aload_3         
	//*  78  167:iconst_1        
	//*  79  168:invokevirtual   #97  <Method void LinearLayout.setOrientation(int)>
	//*  80  171:new             #99  <Class TextView>
	//*  81  174:dup             
	//*  82  175:aload_1         
	//*  83  176:invokespecial   #100 <Method void TextView(Context)>
	//*  84  179:astore          6
	//*  85  181:aload           6
	//*  86  183:aload           4
	//*  87  185:invokevirtual   #104 <Method void TextView.setText(CharSequence)>
	//*  88  188:new             #106 <Class EditText>
	//*  89  191:dup             
	//*  90  192:aload_1         
	//*  91  193:invokespecial   #107 <Method void EditText(Context)>
	//*  92  196:astore_1        
	//*  93  197:aload_1         
	//*  94  198:aload           5
	//*  95  200:invokevirtual   #108 <Method void EditText.setText(CharSequence)>
	//*  96  203:aload_3         
	//*  97  204:aload           6
	//*  98  206:invokevirtual   #112 <Method void LinearLayout.addView(View)>
	//*  99  209:aload_3         
	//* 100  210:aload_1         
	//* 101  211:invokevirtual   #112 <Method void LinearLayout.addView(View)>
	//* 102  214:aload_2         
	//* 103  215:aload_3         
	//* 104  216:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(View)>
	//* 105  219:ldc1            #117 <Int 0x104000a>
	//* 106  221:new             #119 <Class afl>
	//* 107  224:dup             
	//* 108  225:aload           7
	//* 109  227:aload_1         
	//* 110  228:invokespecial   #122 <Method void afl(JsPromptResult, EditText)>
	//* 111  231:invokevirtual   #126 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//* 112  234:ldc1            #127 <Int 0x1040000>
	//* 113  236:new             #129 <Class afk>
	//* 114  239:dup             
	//* 115  240:aload           7
	//* 116  242:invokespecial   #132 <Method void afk(JsPromptResult)>
	//* 117  245:invokevirtual   #135 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//* 118  248:new             #137 <Class afj>
	//* 119  251:dup             
	//* 120  252:aload           7
	//* 121  254:invokespecial   #138 <Method void afj(JsPromptResult)>
	//* 122  257:invokevirtual   #142 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
	//* 123  260:invokevirtual   #146 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//* 124  263:invokevirtual   #151 <Method void AlertDialog.show()>
	//* 125  266:iconst_1        
	//* 126  267:ireturn         
	//* 127  268:aload_2         
	//* 128  269:aload           4
	//* 129  271:invokevirtual   #154 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//* 130  274:ldc1            #117 <Int 0x104000a>
	//* 131  276:new             #156 <Class afi>
	//* 132  279:dup             
	//* 133  280:aload           6
	//* 134  282:invokespecial   #159 <Method void afi(JsResult)>
	//* 135  285:invokevirtual   #126 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//* 136  288:ldc1            #127 <Int 0x1040000>
	//* 137  290:new             #161 <Class afh>
	//* 138  293:dup             
	//* 139  294:aload           6
	//* 140  296:invokespecial   #162 <Method void afh(JsResult)>
	//* 141  299:invokevirtual   #135 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//* 142  302:new             #164 <Class aff>
	//* 143  305:dup             
	//* 144  306:aload           6
	//* 145  308:invokespecial   #165 <Method void aff(JsResult)>
	//* 146  311:invokevirtual   #142 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
	//* 147  314:invokevirtual   #146 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//* 148  317:invokevirtual   #151 <Method void AlertDialog.show()>
	//* 149  320:iconst_1        
	//* 150  321:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 151  322:astore_1        
		{
			com.google.android.gms.internal.ads.wx.c("Fail to display Dialog.", ((Throwable) (context)));
	//  152  323:ldc1            #167 <String "Fail to display Dialog.">
	//  153  325:aload_1         
	//  154  326:invokestatic    #173 <Method void com.google.android.gms.internal.ads.wx.c(String, Throwable)>
			return true;
	//  155  329:iconst_1        
	//  156  330:ireturn         
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_268;
		s1 = ((String) (new LinearLayout(context)));
		((LinearLayout) (s1)).setOrientation(1);
		jsresult = ((JsResult) (new TextView(context)));
		((TextView) (jsresult)).setText(((CharSequence) (s2)));
		context = ((Context) (new EditText(context)));
		((EditText) (context)).setText(((CharSequence) (s3)));
		((LinearLayout) (s1)).addView(((View) (jsresult)));
		((LinearLayout) (s1)).addView(((View) (context)));
		((android.app.AlertDialog.Builder) (s)).setView(((View) (s1))).setPositiveButton(0x104000a, ((android.content.DialogInterface.OnClickListener) (new afl(jspromptresult, ((EditText) (context)))))).setNegativeButton(0x1040000, ((android.content.DialogInterface.OnClickListener) (new afk(jspromptresult)))).setOnCancelListener(((android.content.DialogInterface.OnCancelListener) (new afj(jspromptresult)))).create().show();
		return true;
		((android.app.AlertDialog.Builder) (s)).setMessage(((CharSequence) (s2))).setPositiveButton(0x104000a, ((android.content.DialogInterface.OnClickListener) (new afi(jsresult)))).setNegativeButton(0x1040000, ((android.content.DialogInterface.OnClickListener) (new afh(jsresult)))).setOnCancelListener(((android.content.DialogInterface.OnCancelListener) (new aff(jsresult)))).create().show();
		return true;
	}

	public final void onCloseWindow(WebView webview)
	{
		if(!(webview instanceof afn))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #21  <Class afn>
	//*   2    4:ifne            13
		{
			wx.e("Tried to close a WebView that wasn't an AdWebView.");
	//    3    7:ldc1            #177 <String "Tried to close a WebView that wasn't an AdWebView.">
	//    4    9:invokestatic    #180 <Method void wx.e(String)>
			return;
	//    5   12:return          
		}
		webview = ((WebView) (((afn)webview).s()));
	//    6   13:aload_1         
	//    7   14:checkcast       #21  <Class afn>
	//    8   17:invokeinterface #184 <Method c afn.s()>
	//    9   22:astore_1        
		if(webview == null)
	//*  10   23:aload_1         
	//*  11   24:ifnonnull       33
		{
			wx.e("Tried to close an AdWebView not associated with an overlay.");
	//   12   27:ldc1            #186 <String "Tried to close an AdWebView not associated with an overlay.">
	//   13   29:invokestatic    #180 <Method void wx.e(String)>
			return;
	//   14   32:return          
		} else
		{
			((c) (webview)).a();
	//   15   33:aload_1         
	//   16   34:invokevirtual   #190 <Method void c.a()>
			return;
	//   17   37:return          
		}
	}

	public final boolean onConsoleMessage(ConsoleMessage consolemessage)
	{
		String s = consolemessage.message();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #197 <Method String ConsoleMessage.message()>
	//    2    4:astore_3        
		String s1 = consolemessage.sourceId();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #200 <Method String ConsoleMessage.sourceId()>
	//    5    9:astore          4
		int i = consolemessage.lineNumber();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #203 <Method int ConsoleMessage.lineNumber()>
	//    8   15:istore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 19 + String.valueOf(((Object) (s1))).length());
	//    9   16:new             #52  <Class StringBuilder>
	//   10   19:dup             
	//   11   20:aload_3         
	//   12   21:invokestatic    #58  <Method String String.valueOf(Object)>
	//   13   24:invokevirtual   #62  <Method int String.length()>
	//   14   27:bipush          19
	//   15   29:iadd            
	//   16   30:aload           4
	//   17   32:invokestatic    #58  <Method String String.valueOf(Object)>
	//   18   35:invokevirtual   #62  <Method int String.length()>
	//   19   38:iadd            
	//   20   39:invokespecial   #65  <Method void StringBuilder(int)>
	//   21   42:astore          5
		stringbuilder.append("JS: ");
	//   22   44:aload           5
	//   23   46:ldc1            #205 <String "JS: ">
	//   24   48:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		stringbuilder.append(s);
	//   26   52:aload           5
	//   27   54:aload_3         
	//   28   55:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
		stringbuilder.append(" (");
	//   30   59:aload           5
	//   31   61:ldc1            #207 <String " (">
	//   32   63:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
		stringbuilder.append(s1);
	//   34   67:aload           5
	//   35   69:aload           4
	//   36   71:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   37   74:pop             
		stringbuilder.append(":");
	//   38   75:aload           5
	//   39   77:ldc1            #209 <String ":">
	//   40   79:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   41   82:pop             
		stringbuilder.append(i);
	//   42   83:aload           5
	//   43   85:iload_2         
	//   44   86:invokevirtual   #212 <Method StringBuilder StringBuilder.append(int)>
	//   45   89:pop             
		stringbuilder.append(")");
	//   46   90:aload           5
	//   47   92:ldc1            #214 <String ")">
	//   48   94:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   49   97:pop             
		s = stringbuilder.toString();
	//   50   98:aload           5
	//   51  100:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   52  103:astore_3        
		if(s.contains("Application Cache"))
	//*  53  104:aload_3         
	//*  54  105:ldc1            #216 <String "Application Cache">
	//*  55  107:invokevirtual   #220 <Method boolean String.contains(CharSequence)>
	//*  56  110:ifeq            119
			return super.onConsoleMessage(consolemessage);
	//   57  113:aload_0         
	//   58  114:aload_1         
	//   59  115:invokespecial   #222 <Method boolean WebChromeClient.onConsoleMessage(ConsoleMessage)>
	//   60  118:ireturn         
		switch(afm.a[consolemessage.messageLevel().ordinal()])
	//*  61  119:getstatic       #227 <Field int[] afm.a>
	//*  62  122:aload_1         
	//*  63  123:invokevirtual   #231 <Method android.webkit.ConsoleMessage$MessageLevel ConsoleMessage.messageLevel()>
	//*  64  126:invokevirtual   #236 <Method int android.webkit.ConsoleMessage$MessageLevel.ordinal()>
	//*  65  129:iaload          
		{
	//*  66  130:tableswitch     1 5: default 164
	//	               1 192
	//	               2 185
	//	               3 178
	//	               4 178
	//	               5 171
		default:
			wx.d(s);
	//   67  164:aload_3         
	//   68  165:invokestatic    #238 <Method void wx.d(String)>
			break;

	//*  69  168:goto            196
		case 5: // '\005'
			wx.b(s);
	//   70  171:aload_3         
	//   71  172:invokestatic    #240 <Method void wx.b(String)>
			break;

	//*  72  175:goto            196
		case 3: // '\003'
		case 4: // '\004'
			wx.d(s);
	//   73  178:aload_3         
	//   74  179:invokestatic    #238 <Method void wx.d(String)>
			break;

	//*  75  182:goto            196
		case 2: // '\002'
			wx.e(s);
	//   76  185:aload_3         
	//   77  186:invokestatic    #180 <Method void wx.e(String)>
			break;

	//*  78  189:goto            196
		case 1: // '\001'
			com.google.android.gms.internal.ads.wx.c(s);
	//   79  192:aload_3         
	//   80  193:invokestatic    #242 <Method void com.google.android.gms.internal.ads.wx.c(String)>
			break;
		}
		return super.onConsoleMessage(consolemessage);
	//   81  196:aload_0         
	//   82  197:aload_1         
	//   83  198:invokespecial   #222 <Method boolean WebChromeClient.onConsoleMessage(ConsoleMessage)>
	//   84  201:ireturn         
	}

	public final boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
	{
		android.webkit.WebView.WebViewTransport webviewtransport = (android.webkit.WebView.WebViewTransport)message.obj;
	//    0    0:aload           4
	//    1    2:getfield        #250 <Field Object Message.obj>
	//    2    5:checkcast       #252 <Class android.webkit.WebView$WebViewTransport>
	//    3    8:astore          5
		webview = new WebView(webview.getContext());
	//    4   10:new             #23  <Class WebView>
	//    5   13:dup             
	//    6   14:aload_1         
	//    7   15:invokevirtual   #27  <Method Context WebView.getContext()>
	//    8   18:invokespecial   #253 <Method void WebView(Context)>
	//    9   21:astore_1        
		if(a.x() != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #17  <Field afn a>
	//*  12   26:invokeinterface #257 <Method android.webkit.WebViewClient afn.x()>
	//*  13   31:ifnull          47
			webview.setWebViewClient(a.x());
	//   14   34:aload_1         
	//   15   35:aload_0         
	//   16   36:getfield        #17  <Field afn a>
	//   17   39:invokeinterface #257 <Method android.webkit.WebViewClient afn.x()>
	//   18   44:invokevirtual   #261 <Method void WebView.setWebViewClient(android.webkit.WebViewClient)>
		webviewtransport.setWebView(webview);
	//   19   47:aload           5
	//   20   49:aload_1         
	//   21   50:invokevirtual   #264 <Method void android.webkit.WebView$WebViewTransport.setWebView(WebView)>
		message.sendToTarget();
	//   22   53:aload           4
	//   23   55:invokevirtual   #267 <Method void Message.sendToTarget()>
		return true;
	//   24   58:iconst_1        
	//   25   59:ireturn         
	}

	public final void onExceededDatabaseQuota(String s, String s1, long l, long l1, long l2, android.webkit.WebStorage.QuotaUpdater quotaupdater)
	{
		long l3 = 0x500000L - l2;
	//    0    0:ldc2w           #270 <Long 0x500000L>
	//    1    3:lload           7
	//    2    5:lsub            
	//    3    6:lstore          10
		if(l3 <= 0L)
	//*   4    8:lload           10
	//*   5   10:lconst_0        
	//*   6   11:lcmp            
	//*   7   12:ifgt            24
		{
			quotaupdater.updateQuota(l);
	//    8   15:aload           9
	//    9   17:lload_3         
	//   10   18:invokeinterface #277 <Method void android.webkit.WebStorage$QuotaUpdater.updateQuota(long)>
			return;
	//   11   23:return          
		}
		if(l == 0L)
	//*  12   24:lload_3         
	//*  13   25:lconst_0        
	//*  14   26:lcmp            
	//*  15   27:ifne            56
		{
			if(l1 > l3 || l1 > 0x100000L)
	//*  16   30:lload           5
	//*  17   32:lload           10
	//*  18   34:lcmp            
	//*  19   35:ifgt            50
	//*  20   38:lload           5
	//*  21   40:ldc2w           #278 <Long 0x100000L>
	//*  22   43:lcmp            
	//*  23   44:ifgt            50
	//*  24   47:goto            113
				l1 = 0L;
	//   25   50:lconst_0        
	//   26   51:lstore          5
		} else
	//*  27   53:goto            113
		if(l1 == 0L)
	//*  28   56:lload           5
	//*  29   58:lconst_0        
	//*  30   59:lcmp            
	//*  31   60:ifne            84
		{
			l1 = Math.min(l + Math.min(0x20000L, l3), 0x100000L);
	//   32   63:lload_3         
	//   33   64:ldc2w           #280 <Long 0x20000L>
	//   34   67:lload           10
	//   35   69:invokestatic    #287 <Method long Math.min(long, long)>
	//   36   72:ladd            
	//   37   73:ldc2w           #278 <Long 0x100000L>
	//   38   76:invokestatic    #287 <Method long Math.min(long, long)>
	//   39   79:lstore          5
		} else
	//*  40   81:goto            113
		{
			l2 = l;
	//   41   84:lload_3         
	//   42   85:lstore          7
			if(l1 <= Math.min(0x100000L - l, l3))
	//*  43   87:lload           5
	//*  44   89:ldc2w           #278 <Long 0x100000L>
	//*  45   92:lload_3         
	//*  46   93:lsub            
	//*  47   94:lload           10
	//*  48   96:invokestatic    #287 <Method long Math.min(long, long)>
	//*  49   99:lcmp            
	//*  50  100:ifgt            109
				l2 = l + l1;
	//   51  103:lload_3         
	//   52  104:lload           5
	//   53  106:ladd            
	//   54  107:lstore          7
			l1 = l2;
	//   55  109:lload           7
	//   56  111:lstore          5
		}
		quotaupdater.updateQuota(l1);
	//   57  113:aload           9
	//   58  115:lload           5
	//   59  117:invokeinterface #277 <Method void android.webkit.WebStorage$QuotaUpdater.updateQuota(long)>
	//   60  122:return          
	}

	public final void onGeolocationPermissionsShowPrompt(String s, android.webkit.GeolocationPermissions.Callback callback)
	{
label0:
		{
			boolean flag;
label1:
			{
				if(callback == null)
					break label0;
	//    0    0:aload_2         
	//    1    1:ifnull          67
				aw.e();
	//    2    4:invokestatic    #294 <Method xg aw.e()>
	//    3    7:pop             
				if(!xg.a(a.getContext(), "android.permission.ACCESS_FINE_LOCATION"))
	//*   4    8:aload_0         
	//*   5    9:getfield        #17  <Field afn a>
	//*   6   12:invokeinterface #32  <Method Context afn.getContext()>
	//*   7   17:ldc2            #296 <String "android.permission.ACCESS_FINE_LOCATION">
	//*   8   20:invokestatic    #301 <Method boolean xg.a(Context, String)>
	//*   9   23:ifne            56
				{
					aw.e();
	//   10   26:invokestatic    #294 <Method xg aw.e()>
	//   11   29:pop             
					if(!xg.a(a.getContext(), "android.permission.ACCESS_COARSE_LOCATION"))
	//*  12   30:aload_0         
	//*  13   31:getfield        #17  <Field afn a>
	//*  14   34:invokeinterface #32  <Method Context afn.getContext()>
	//*  15   39:ldc2            #303 <String "android.permission.ACCESS_COARSE_LOCATION">
	//*  16   42:invokestatic    #301 <Method boolean xg.a(Context, String)>
	//*  17   45:ifeq            51
	//*  18   48:goto            56
					{
						flag = false;
	//   19   51:iconst_0        
	//   20   52:istore_3        
						break label1;
	//   21   53:goto            58
					}
				}
				flag = true;
	//   22   56:iconst_1        
	//   23   57:istore_3        
			}
			callback.invoke(s, flag, true);
	//   24   58:aload_2         
	//   25   59:aload_1         
	//   26   60:iload_3         
	//   27   61:iconst_1        
	//   28   62:invokeinterface #309 <Method void android.webkit.GeolocationPermissions$Callback.invoke(String, boolean, boolean)>
		}
	//   29   67:return          
	}

	public final void onHideCustomView()
	{
		c c1 = a.s();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field afn a>
	//    2    4:invokeinterface #184 <Method c afn.s()>
	//    3    9:astore_1        
		if(c1 == null)
	//*   4   10:aload_1         
	//*   5   11:ifnonnull       21
		{
			wx.e("Could not get ad overlay when hiding custom view.");
	//    6   14:ldc2            #312 <String "Could not get ad overlay when hiding custom view.">
	//    7   17:invokestatic    #180 <Method void wx.e(String)>
			return;
	//    8   20:return          
		} else
		{
			c1.b();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #314 <Method void c.b()>
			return;
	//   11   25:return          
		}
	}

	public final boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
	{
		return a(a(webview), "alert", s, s1, ((String) (null)), jsresult, ((JsPromptResult) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #318 <Method Context a(WebView)>
	//    3    5:ldc2            #320 <String "alert">
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:aload           4
	//    8   13:aconst_null     
	//    9   14:iconst_0        
	//   10   15:invokespecial   #322 <Method boolean a(Context, String, String, String, String, JsResult, JsPromptResult, boolean)>
	//   11   18:ireturn         
	}

	public final boolean onJsBeforeUnload(WebView webview, String s, String s1, JsResult jsresult)
	{
		return a(a(webview), "onBeforeUnload", s, s1, ((String) (null)), jsresult, ((JsPromptResult) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #318 <Method Context a(WebView)>
	//    3    5:ldc2            #325 <String "onBeforeUnload">
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:aload           4
	//    8   13:aconst_null     
	//    9   14:iconst_0        
	//   10   15:invokespecial   #322 <Method boolean a(Context, String, String, String, String, JsResult, JsPromptResult, boolean)>
	//   11   18:ireturn         
	}

	public final boolean onJsConfirm(WebView webview, String s, String s1, JsResult jsresult)
	{
		return a(a(webview), "confirm", s, s1, ((String) (null)), jsresult, ((JsPromptResult) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #318 <Method Context a(WebView)>
	//    3    5:ldc2            #328 <String "confirm">
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:aload           4
	//    8   13:aconst_null     
	//    9   14:iconst_0        
	//   10   15:invokespecial   #322 <Method boolean a(Context, String, String, String, String, JsResult, JsPromptResult, boolean)>
	//   11   18:ireturn         
	}

	public final boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
	{
		return a(a(webview), "prompt", s, s1, s2, ((JsResult) (null)), jspromptresult, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #318 <Method Context a(WebView)>
	//    3    5:ldc2            #332 <String "prompt">
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:aconst_null     
	//    8   13:aload           5
	//    9   15:iconst_1        
	//   10   16:invokespecial   #322 <Method boolean a(Context, String, String, String, String, JsResult, JsPromptResult, boolean)>
	//   11   19:ireturn         
	}

	public final void onPermissionRequest(PermissionRequest permissionrequest)
	{
		if(o.h())
	//*   0    0:invokestatic    #340 <Method boolean o.h()>
	//*   1    3:ifeq            113
		{
			e e = p.ap;
	//    2    6:getstatic       #346 <Field e p.ap>
	//    3    9:astore_2        
			if(!((Boolean)bwk.e().a(e)).booleanValue())
	//*   4   10:invokestatic    #351 <Method m bwk.e()>
	//*   5   13:aload_2         
	//*   6   14:invokevirtual   #356 <Method Object m.a(e)>
	//*   7   17:checkcast       #358 <Class Boolean>
	//*   8   20:invokevirtual   #361 <Method boolean Boolean.booleanValue()>
	//*   9   23:ifeq            29
	//*  10   26:goto            113
			{
				afn afn1 = a;
	//   11   29:aload_0         
	//   12   30:getfield        #17  <Field afn a>
	//   13   33:astore_2        
				if(afn1 != null && afn1.w() != null && a.w().m() != null)
	//*  14   34:aload_2         
	//*  15   35:ifnull          107
	//*  16   38:aload_2         
	//*  17   39:invokeinterface #39  <Method agv afn.w()>
	//*  18   44:ifnull          107
	//*  19   47:aload_0         
	//*  20   48:getfield        #17  <Field afn a>
	//*  21   51:invokeinterface #39  <Method agv afn.w()>
	//*  22   56:invokeinterface #365 <Method vo agv.m()>
	//*  23   61:ifnonnull       67
	//*  24   64:goto            107
				{
					String as[] = a.w().m().a(permissionrequest.getResources());
	//   25   67:aload_0         
	//   26   68:getfield        #17  <Field afn a>
	//   27   71:invokeinterface #39  <Method agv afn.w()>
	//   28   76:invokeinterface #365 <Method vo agv.m()>
	//   29   81:aload_1         
	//   30   82:invokevirtual   #371 <Method String[] PermissionRequest.getResources()>
	//   31   85:invokeinterface #376 <Method String[] vo.a(String[])>
	//   32   90:astore_2        
					if(as.length > 0)
	//*  33   91:aload_2         
	//*  34   92:arraylength     
	//*  35   93:ifle            102
					{
						permissionrequest.grant(as);
	//   36   96:aload_1         
	//   37   97:aload_2         
	//   38   98:invokevirtual   #380 <Method void PermissionRequest.grant(String[])>
						return;
	//   39  101:return          
					} else
					{
						permissionrequest.deny();
	//   40  102:aload_1         
	//   41  103:invokevirtual   #383 <Method void PermissionRequest.deny()>
						return;
	//   42  106:return          
					}
				} else
				{
					super.onPermissionRequest(permissionrequest);
	//   43  107:aload_0         
	//   44  108:aload_1         
	//   45  109:invokespecial   #385 <Method void WebChromeClient.onPermissionRequest(PermissionRequest)>
					return;
	//   46  112:return          
				}
			}
		}
		super.onPermissionRequest(permissionrequest);
	//   47  113:aload_0         
	//   48  114:aload_1         
	//   49  115:invokespecial   #385 <Method void WebChromeClient.onPermissionRequest(PermissionRequest)>
	//   50  118:return          
	}

	public final void onReachedMaxAppCacheSize(long l, long l1, android.webkit.WebStorage.QuotaUpdater quotaupdater)
	{
		l += 0x20000L;
	//    0    0:lload_1         
	//    1    1:ldc2w           #280 <Long 0x20000L>
	//    2    4:ladd            
	//    3    5:lstore_1        
		if(0x500000L - l1 < l)
	//*   4    6:ldc2w           #270 <Long 0x500000L>
	//*   5    9:lload_3         
	//*   6   10:lsub            
	//*   7   11:lload_1         
	//*   8   12:lcmp            
	//*   9   13:ifge            25
		{
			quotaupdater.updateQuota(0L);
	//   10   16:aload           5
	//   11   18:lconst_0        
	//   12   19:invokeinterface #277 <Method void android.webkit.WebStorage$QuotaUpdater.updateQuota(long)>
			return;
	//   13   24:return          
		} else
		{
			quotaupdater.updateQuota(l);
	//   14   25:aload           5
	//   15   27:lload_1         
	//   16   28:invokeinterface #277 <Method void android.webkit.WebStorage$QuotaUpdater.updateQuota(long)>
			return;
	//   17   33:return          
		}
	}

	public final void onShowCustomView(View view, int i, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
	{
		c c1 = a.s();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field afn a>
	//    2    4:invokeinterface #184 <Method c afn.s()>
	//    3    9:astore          4
		if(c1 == null)
	//*   4   11:aload           4
	//*   5   13:ifnonnull       29
		{
			wx.e("Could not get ad overlay when showing custom view.");
	//    6   16:ldc2            #393 <String "Could not get ad overlay when showing custom view.">
	//    7   19:invokestatic    #180 <Method void wx.e(String)>
			customviewcallback.onCustomViewHidden();
	//    8   22:aload_3         
	//    9   23:invokeinterface #398 <Method void android.webkit.WebChromeClient$CustomViewCallback.onCustomViewHidden()>
			return;
	//   10   28:return          
		} else
		{
			c1.a(view, customviewcallback);
	//   11   29:aload           4
	//   12   31:aload_1         
	//   13   32:aload_3         
	//   14   33:invokevirtual   #401 <Method void c.a(View, android.webkit.WebChromeClient$CustomViewCallback)>
			c1.a(i);
	//   15   36:aload           4
	//   16   38:iload_2         
	//   17   39:invokevirtual   #403 <Method void c.a(int)>
			return;
	//   18   42:return          
		}
	}

	public final void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
	{
		onShowCustomView(view, -1, customviewcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:aload_2         
	//    4    4:invokevirtual   #406 <Method void onShowCustomView(View, int, android.webkit.WebChromeClient$CustomViewCallback)>
	//    5    7:return          
	}

	private final afn a;
}
