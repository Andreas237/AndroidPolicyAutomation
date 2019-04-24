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
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzx;
import com.google.android.gms.common.util.PlatformVersion;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaqw, zzasc, zzaqu, zzaqt, 
//			zzaqs, zzaqr, zzaqq, zzaqp, 
//			zzakb, zzaqv, zzakk, zznk, 
//			zzkb, zzni, zzait

public final class zzaqo extends WebChromeClient
{

	public zzaqo(zzaqw zzaqw1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void WebChromeClient()>
		zzbnd = zzaqw1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzaqw zzbnd>
	//    5    9:return          
	}

	private static Context zza(WebView webview)
	{
		if(!(webview instanceof zzaqw))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #22  <Class zzaqw>
	//*   2    4:ifne            12
			return webview.getContext();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #28  <Method Context WebView.getContext()>
	//    5   11:areturn         
		webview = ((WebView) ((zzaqw)webview));
	//    6   12:aload_0         
	//    7   13:checkcast       #22  <Class zzaqw>
	//    8   16:astore_0        
		android.app.Activity activity = ((zzaqw) (webview)).zzto();
	//    9   17:aload_0         
	//   10   18:invokeinterface #32  <Method android.app.Activity zzaqw.zzto()>
	//   11   23:astore_1        
		if(activity != null)
	//*  12   24:aload_1         
	//*  13   25:ifnull          30
			return ((Context) (activity));
	//   14   28:aload_1         
	//   15   29:areturn         
		else
			return ((zzaqw) (webview)).getContext();
	//   16   30:aload_0         
	//   17   31:invokeinterface #33  <Method Context zzaqw.getContext()>
	//   18   36:areturn         
	}

	private final boolean zza(Context context, String s, String s1, String s2, String s3, JsResult jsresult, JsPromptResult jspromptresult, 
			boolean flag)
	{
		zzx zzx1;
		if(zzbnd == null || zzbnd.zzuf() == null || zzbnd.zzuf().zzut() == null)
			break MISSING_BLOCK_LABEL_137;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaqw zzbnd>
	//    2    4:ifnull          137
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field zzaqw zzbnd>
	//    5   11:invokeinterface #40  <Method zzasc zzaqw.zzuf()>
	//    6   16:ifnull          137
	//    7   19:aload_0         
	//    8   20:getfield        #17  <Field zzaqw zzbnd>
	//    9   23:invokeinterface #40  <Method zzasc zzaqw.zzuf()>
	//   10   28:invokeinterface #46  <Method zzx zzasc.zzut()>
	//   11   33:ifnull          137
		zzx1 = zzbnd.zzuf().zzut();
	//   12   36:aload_0         
	//   13   37:getfield        #17  <Field zzaqw zzbnd>
	//   14   40:invokeinterface #40  <Method zzasc zzaqw.zzuf()>
	//   15   45:invokeinterface #46  <Method zzx zzasc.zzut()>
	//   16   50:astore          9
		if(zzx1 == null)
			break MISSING_BLOCK_LABEL_137;
	//   17   52:aload           9
	//   18   54:ifnull          137
		if(zzx1.zzcy())
			break MISSING_BLOCK_LABEL_137;
	//   19   57:aload           9
	//   20   59:invokevirtual   #52  <Method boolean zzx.zzcy()>
	//   21   62:ifne            137
		context = ((Context) (new StringBuilder(11 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s2))).length())));
	//   22   65:new             #54  <Class StringBuilder>
	//   23   68:dup             
	//   24   69:bipush          11
	//   25   71:aload_2         
	//   26   72:invokestatic    #60  <Method String String.valueOf(Object)>
	//   27   75:invokevirtual   #64  <Method int String.length()>
	//   28   78:iadd            
	//   29   79:aload           4
	//   30   81:invokestatic    #60  <Method String String.valueOf(Object)>
	//   31   84:invokevirtual   #64  <Method int String.length()>
	//   32   87:iadd            
	//   33   88:invokespecial   #67  <Method void StringBuilder(int)>
	//   34   91:astore_1        
		((StringBuilder) (context)).append("window.");
	//   35   92:aload_1         
	//   36   93:ldc1            #69  <String "window.">
	//   37   95:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   38   98:pop             
		((StringBuilder) (context)).append(s);
	//   39   99:aload_1         
	//   40  100:aload_2         
	//   41  101:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   42  104:pop             
		((StringBuilder) (context)).append("('");
	//   43  105:aload_1         
	//   44  106:ldc1            #75  <String "('">
	//   45  108:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   46  111:pop             
		((StringBuilder) (context)).append(s2);
	//   47  112:aload_1         
	//   48  113:aload           4
	//   49  115:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   50  118:pop             
		((StringBuilder) (context)).append("')");
	//   51  119:aload_1         
	//   52  120:ldc1            #77  <String "')">
	//   53  122:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   54  125:pop             
		zzx1.zzs(((StringBuilder) (context)).toString());
	//   55  126:aload           9
	//   56  128:aload_1         
	//   57  129:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   58  132:invokevirtual   #85  <Method void zzx.zzs(String)>
		return false;
	//   59  135:iconst_0        
	//   60  136:ireturn         
		try
		{
			s = ((String) (new android.app.AlertDialog.Builder(context)));
	//   61  137:new             #87  <Class android.app.AlertDialog$Builder>
	//   62  140:dup             
	//   63  141:aload_1         
	//   64  142:invokespecial   #90  <Method void android.app.AlertDialog$Builder(Context)>
	//   65  145:astore_2        
			((android.app.AlertDialog.Builder) (s)).setTitle(((CharSequence) (s1)));
	//   66  146:aload_2         
	//   67  147:aload_3         
	//   68  148:invokevirtual   #94  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   69  151:pop             
		}
	//*  70  152:iload           8
	//*  71  154:ifeq            270
	//*  72  157:new             #96  <Class LinearLayout>
	//*  73  160:dup             
	//*  74  161:aload_1         
	//*  75  162:invokespecial   #97  <Method void LinearLayout(Context)>
	//*  76  165:astore_3        
	//*  77  166:aload_3         
	//*  78  167:iconst_1        
	//*  79  168:invokevirtual   #100 <Method void LinearLayout.setOrientation(int)>
	//*  80  171:new             #102 <Class TextView>
	//*  81  174:dup             
	//*  82  175:aload_1         
	//*  83  176:invokespecial   #103 <Method void TextView(Context)>
	//*  84  179:astore          6
	//*  85  181:aload           6
	//*  86  183:aload           4
	//*  87  185:invokevirtual   #107 <Method void TextView.setText(CharSequence)>
	//*  88  188:new             #109 <Class EditText>
	//*  89  191:dup             
	//*  90  192:aload_1         
	//*  91  193:invokespecial   #110 <Method void EditText(Context)>
	//*  92  196:astore_1        
	//*  93  197:aload_1         
	//*  94  198:aload           5
	//*  95  200:invokevirtual   #111 <Method void EditText.setText(CharSequence)>
	//*  96  203:aload_3         
	//*  97  204:aload           6
	//*  98  206:invokevirtual   #115 <Method void LinearLayout.addView(View)>
	//*  99  209:aload_3         
	//* 100  210:aload_1         
	//* 101  211:invokevirtual   #115 <Method void LinearLayout.addView(View)>
	//* 102  214:aload_2         
	//* 103  215:aload_3         
	//* 104  216:invokevirtual   #119 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(View)>
	//* 105  219:ldc1            #120 <Int 0x104000a>
	//* 106  221:new             #122 <Class zzaqu>
	//* 107  224:dup             
	//* 108  225:aload           7
	//* 109  227:aload_1         
	//* 110  228:invokespecial   #125 <Method void zzaqu(JsPromptResult, EditText)>
	//* 111  231:invokevirtual   #129 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//* 112  234:ldc1            #130 <Int 0x1040000>
	//* 113  236:new             #132 <Class zzaqt>
	//* 114  239:dup             
	//* 115  240:aload           7
	//* 116  242:invokespecial   #135 <Method void zzaqt(JsPromptResult)>
	//* 117  245:invokevirtual   #138 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//* 118  248:new             #140 <Class zzaqs>
	//* 119  251:dup             
	//* 120  252:aload           7
	//* 121  254:invokespecial   #141 <Method void zzaqs(JsPromptResult)>
	//* 122  257:invokevirtual   #145 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
	//* 123  260:invokevirtual   #149 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//* 124  263:astore_1        
	//* 125  264:aload_1         
	//* 126  265:invokevirtual   #154 <Method void AlertDialog.show()>
	//* 127  268:iconst_1        
	//* 128  269:ireturn         
	//* 129  270:aload_2         
	//* 130  271:aload           4
	//* 131  273:invokevirtual   #157 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//* 132  276:ldc1            #120 <Int 0x104000a>
	//* 133  278:new             #159 <Class zzaqr>
	//* 134  281:dup             
	//* 135  282:aload           6
	//* 136  284:invokespecial   #162 <Method void zzaqr(JsResult)>
	//* 137  287:invokevirtual   #129 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//* 138  290:ldc1            #130 <Int 0x1040000>
	//* 139  292:new             #164 <Class zzaqq>
	//* 140  295:dup             
	//* 141  296:aload           6
	//* 142  298:invokespecial   #165 <Method void zzaqq(JsResult)>
	//* 143  301:invokevirtual   #138 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//* 144  304:new             #167 <Class zzaqp>
	//* 145  307:dup             
	//* 146  308:aload           6
	//* 147  310:invokespecial   #168 <Method void zzaqp(JsResult)>
	//* 148  313:invokevirtual   #145 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
	//* 149  316:invokevirtual   #149 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//* 150  319:astore_1        
	//* 151  320:goto            264
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 152  323:astore_1        
		{
			zzakb.zzc("Fail to display Dialog.", ((Throwable) (context)));
	//  153  324:ldc1            #170 <String "Fail to display Dialog.">
	//  154  326:aload_1         
	//  155  327:invokestatic    #176 <Method void zzakb.zzc(String, Throwable)>
			return true;
	//  156  330:iconst_1        
	//  157  331:ireturn         
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_270;
		s1 = ((String) (new LinearLayout(context)));
		((LinearLayout) (s1)).setOrientation(1);
		jsresult = ((JsResult) (new TextView(context)));
		((TextView) (jsresult)).setText(((CharSequence) (s2)));
		context = ((Context) (new EditText(context)));
		((EditText) (context)).setText(((CharSequence) (s3)));
		((LinearLayout) (s1)).addView(((View) (jsresult)));
		((LinearLayout) (s1)).addView(((View) (context)));
		context = ((Context) (((android.app.AlertDialog.Builder) (s)).setView(((View) (s1))).setPositiveButton(0x104000a, ((android.content.DialogInterface.OnClickListener) (new zzaqu(jspromptresult, ((EditText) (context)))))).setNegativeButton(0x1040000, ((android.content.DialogInterface.OnClickListener) (new zzaqt(jspromptresult)))).setOnCancelListener(((android.content.DialogInterface.OnCancelListener) (new zzaqs(jspromptresult)))).create()));
_L1:
		((AlertDialog) (context)).show();
		return true;
		context = ((Context) (((android.app.AlertDialog.Builder) (s)).setMessage(((CharSequence) (s2))).setPositiveButton(0x104000a, ((android.content.DialogInterface.OnClickListener) (new zzaqr(jsresult)))).setNegativeButton(0x1040000, ((android.content.DialogInterface.OnClickListener) (new zzaqq(jsresult)))).setOnCancelListener(((android.content.DialogInterface.OnCancelListener) (new zzaqp(jsresult)))).create()));
		  goto _L1
	}

	public final void onCloseWindow(WebView webview)
	{
		if(!(webview instanceof zzaqw))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #22  <Class zzaqw>
	//*   2    4:ifne            15
		{
			webview = "Tried to close a WebView that wasn't an AdWebView.";
	//    3    7:ldc1            #180 <String "Tried to close a WebView that wasn't an AdWebView.">
	//    4    9:astore_1        
		} else
	//*   5   10:aload_1         
	//*   6   11:invokestatic    #183 <Method void zzakb.zzdk(String)>
	//*   7   14:return          
		{
			webview = ((WebView) (((zzaqw)webview).zzub()));
	//    8   15:aload_1         
	//    9   16:checkcast       #22  <Class zzaqw>
	//   10   19:invokeinterface #187 <Method zzd zzaqw.zzub()>
	//   11   24:astore_1        
			if(webview == null)
	//*  12   25:aload_1         
	//*  13   26:ifnonnull       35
			{
				webview = "Tried to close an AdWebView not associated with an overlay.";
	//   14   29:ldc1            #189 <String "Tried to close an AdWebView not associated with an overlay.">
	//   15   31:astore_1        
			} else
	//*  16   32:goto            10
			{
				((zzd) (webview)).close();
	//   17   35:aload_1         
	//   18   36:invokevirtual   #194 <Method void zzd.close()>
				return;
	//   19   39:return          
			}
		}
		zzakb.zzdk(((String) (webview)));
	}

	public final boolean onConsoleMessage(ConsoleMessage consolemessage)
	{
		String s = consolemessage.message();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #201 <Method String ConsoleMessage.message()>
	//    2    4:astore_3        
		String s1 = consolemessage.sourceId();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #204 <Method String ConsoleMessage.sourceId()>
	//    5    9:astore          4
		int i = consolemessage.lineNumber();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #207 <Method int ConsoleMessage.lineNumber()>
	//    8   15:istore_2        
		StringBuilder stringbuilder = new StringBuilder(19 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length());
	//    9   16:new             #54  <Class StringBuilder>
	//   10   19:dup             
	//   11   20:bipush          19
	//   12   22:aload_3         
	//   13   23:invokestatic    #60  <Method String String.valueOf(Object)>
	//   14   26:invokevirtual   #64  <Method int String.length()>
	//   15   29:iadd            
	//   16   30:aload           4
	//   17   32:invokestatic    #60  <Method String String.valueOf(Object)>
	//   18   35:invokevirtual   #64  <Method int String.length()>
	//   19   38:iadd            
	//   20   39:invokespecial   #67  <Method void StringBuilder(int)>
	//   21   42:astore          5
		stringbuilder.append("JS: ");
	//   22   44:aload           5
	//   23   46:ldc1            #209 <String "JS: ">
	//   24   48:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		stringbuilder.append(s);
	//   26   52:aload           5
	//   27   54:aload_3         
	//   28   55:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
		stringbuilder.append(" (");
	//   30   59:aload           5
	//   31   61:ldc1            #211 <String " (">
	//   32   63:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
		stringbuilder.append(s1);
	//   34   67:aload           5
	//   35   69:aload           4
	//   36   71:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   37   74:pop             
		stringbuilder.append(":");
	//   38   75:aload           5
	//   39   77:ldc1            #213 <String ":">
	//   40   79:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   41   82:pop             
		stringbuilder.append(i);
	//   42   83:aload           5
	//   43   85:iload_2         
	//   44   86:invokevirtual   #216 <Method StringBuilder StringBuilder.append(int)>
	//   45   89:pop             
		stringbuilder.append(")");
	//   46   90:aload           5
	//   47   92:ldc1            #218 <String ")">
	//   48   94:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   49   97:pop             
		s = stringbuilder.toString();
	//   50   98:aload           5
	//   51  100:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   52  103:astore_3        
		if(s.contains("Application Cache"))
	//*  53  104:aload_3         
	//*  54  105:ldc1            #220 <String "Application Cache">
	//*  55  107:invokevirtual   #224 <Method boolean String.contains(CharSequence)>
	//*  56  110:ifeq            119
			return super.onConsoleMessage(consolemessage);
	//   57  113:aload_0         
	//   58  114:aload_1         
	//   59  115:invokespecial   #226 <Method boolean WebChromeClient.onConsoleMessage(ConsoleMessage)>
	//   60  118:ireturn         
		switch(zzaqv.zzdbn[consolemessage.messageLevel().ordinal()])
	//*  61  119:getstatic       #232 <Field int[] zzaqv.zzdbn>
	//*  62  122:aload_1         
	//*  63  123:invokevirtual   #236 <Method android.webkit.ConsoleMessage$MessageLevel ConsoleMessage.messageLevel()>
	//*  64  126:invokevirtual   #241 <Method int android.webkit.ConsoleMessage$MessageLevel.ordinal()>
	//*  65  129:iaload          
		{
	//*  66  130:tableswitch     1 5: default 164
	//	               1 185
	//	               2 178
	//	               3 164
	//	               4 164
	//	               5 171
		case 3: // '\003'
		case 4: // '\004'
		default:
			zzakb.zzdj(s);
	//   67  164:aload_3         
	//   68  165:invokestatic    #244 <Method void zzakb.zzdj(String)>
			break;

	//*  69  168:goto            189
		case 5: // '\005'
			zzakb.zzck(s);
	//   70  171:aload_3         
	//   71  172:invokestatic    #247 <Method void zzakb.zzck(String)>
			break;

	//*  72  175:goto            189
		case 2: // '\002'
			zzakb.zzdk(s);
	//   73  178:aload_3         
	//   74  179:invokestatic    #183 <Method void zzakb.zzdk(String)>
			break;

	//*  75  182:goto            189
		case 1: // '\001'
			zzakb.e(s);
	//   76  185:aload_3         
	//   77  186:invokestatic    #250 <Method void zzakb.e(String)>
			break;
		}
		return super.onConsoleMessage(consolemessage);
	//   78  189:aload_0         
	//   79  190:aload_1         
	//   80  191:invokespecial   #226 <Method boolean WebChromeClient.onConsoleMessage(ConsoleMessage)>
	//   81  194:ireturn         
	}

	public final boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
	{
		android.webkit.WebView.WebViewTransport webviewtransport = (android.webkit.WebView.WebViewTransport)message.obj;
	//    0    0:aload           4
	//    1    2:getfield        #258 <Field Object Message.obj>
	//    2    5:checkcast       #260 <Class android.webkit.WebView$WebViewTransport>
	//    3    8:astore          5
		webview = new WebView(webview.getContext());
	//    4   10:new             #24  <Class WebView>
	//    5   13:dup             
	//    6   14:aload_1         
	//    7   15:invokevirtual   #28  <Method Context WebView.getContext()>
	//    8   18:invokespecial   #261 <Method void WebView(Context)>
	//    9   21:astore_1        
		if(zzbnd.zzug() != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #17  <Field zzaqw zzbnd>
	//*  12   26:invokeinterface #265 <Method android.webkit.WebViewClient zzaqw.zzug()>
	//*  13   31:ifnull          47
			webview.setWebViewClient(zzbnd.zzug());
	//   14   34:aload_1         
	//   15   35:aload_0         
	//   16   36:getfield        #17  <Field zzaqw zzbnd>
	//   17   39:invokeinterface #265 <Method android.webkit.WebViewClient zzaqw.zzug()>
	//   18   44:invokevirtual   #269 <Method void WebView.setWebViewClient(android.webkit.WebViewClient)>
		webviewtransport.setWebView(webview);
	//   19   47:aload           5
	//   20   49:aload_1         
	//   21   50:invokevirtual   #272 <Method void android.webkit.WebView$WebViewTransport.setWebView(WebView)>
		message.sendToTarget();
	//   22   53:aload           4
	//   23   55:invokevirtual   #275 <Method void Message.sendToTarget()>
		return true;
	//   24   58:iconst_1        
	//   25   59:ireturn         
	}

	public final void onExceededDatabaseQuota(String s, String s1, long l, long l1, long l2, android.webkit.WebStorage.QuotaUpdater quotaupdater)
	{
		long l3;
		l3 = 0x500000L - l2;
	//    0    0:ldc2w           #278 <Long 0x500000L>
	//    1    3:lload           7
	//    2    5:lsub            
	//    3    6:lstore          10
		l2 = 0L;
	//    4    8:lconst_0        
	//    5    9:lstore          7
		if(l3 <= 0L)
	//*   6   11:lload           10
	//*   7   13:lconst_0        
	//*   8   14:lcmp            
	//*   9   15:ifgt            27
		{
			quotaupdater.updateQuota(l);
	//   10   18:aload           9
	//   11   20:lload_3         
	//   12   21:invokeinterface #285 <Method void android.webkit.WebStorage$QuotaUpdater.updateQuota(long)>
			return;
	//   13   26:return          
		}
		if(l == 0L)
	//*  14   27:lload_3         
	//*  15   28:lconst_0        
	//*  16   29:lcmp            
	//*  17   30:ifne            62
		{
			l = l2;
	//   18   33:lload           7
	//   19   35:lstore_3        
			if(l1 <= l3)
	//*  20   36:lload           5
	//*  21   38:lload           10
	//*  22   40:lcmp            
	//*  23   41:ifgt            117
			{
				l = l2;
	//   24   44:lload           7
	//   25   46:lstore_3        
				if(l1 <= 0x100000L)
	//*  26   47:lload           5
	//*  27   49:ldc2w           #286 <Long 0x100000L>
	//*  28   52:lcmp            
	//*  29   53:ifgt            117
					l = l1;
	//   30   56:lload           5
	//   31   58:lstore_3        
			}
			break MISSING_BLOCK_LABEL_117;
	//   32   59:goto            117
		}
		if(l1 != 0L) goto _L2; else goto _L1
	//   33   62:lload           5
	//   34   64:lconst_0        
	//   35   65:lcmp            
	//   36   66:ifne            93
_L1:
		l2 = Math.min(l + Math.min(0x20000L, l3), 0x100000L);
	//   37   69:lload_3         
	//   38   70:ldc2w           #288 <Long 0x20000L>
	//   39   73:lload           10
	//   40   75:invokestatic    #295 <Method long Math.min(long, long)>
	//   41   78:ladd            
	//   42   79:ldc2w           #286 <Long 0x100000L>
	//   43   82:invokestatic    #295 <Method long Math.min(long, long)>
	//   44   85:lstore          7
_L4:
		l = l2;
	//   45   87:lload           7
	//   46   89:lstore_3        
		break MISSING_BLOCK_LABEL_117;
	//   47   90:goto            117
_L2:
		l2 = l;
	//   48   93:lload_3         
	//   49   94:lstore          7
		if(l1 > Math.min(0x100000L - l, l3)) goto _L4; else goto _L3
	//   50   96:lload           5
	//   51   98:ldc2w           #286 <Long 0x100000L>
	//   52  101:lload_3         
	//   53  102:lsub            
	//   54  103:lload           10
	//   55  105:invokestatic    #295 <Method long Math.min(long, long)>
	//   56  108:lcmp            
	//   57  109:ifgt            87
_L3:
		l += l1;
	//   58  112:lload_3         
	//   59  113:lload           5
	//   60  115:ladd            
	//   61  116:lstore_3        
		quotaupdater.updateQuota(l);
	//   62  117:aload           9
	//   63  119:lload_3         
	//   64  120:invokeinterface #285 <Method void android.webkit.WebStorage$QuotaUpdater.updateQuota(long)>
		return;
	//   65  125:return          
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
				zzbv.zzek();
	//    2    4:invokestatic    #303 <Method zzakk zzbv.zzek()>
	//    3    7:pop             
				if(!zzakk.zzl(zzbnd.getContext(), "android.permission.ACCESS_FINE_LOCATION"))
	//*   4    8:aload_0         
	//*   5    9:getfield        #17  <Field zzaqw zzbnd>
	//*   6   12:invokeinterface #33  <Method Context zzaqw.getContext()>
	//*   7   17:ldc2            #305 <String "android.permission.ACCESS_FINE_LOCATION">
	//*   8   20:invokestatic    #311 <Method boolean zzakk.zzl(Context, String)>
	//*   9   23:ifne            56
				{
					zzbv.zzek();
	//   10   26:invokestatic    #303 <Method zzakk zzbv.zzek()>
	//   11   29:pop             
					if(!zzakk.zzl(zzbnd.getContext(), "android.permission.ACCESS_COARSE_LOCATION"))
	//*  12   30:aload_0         
	//*  13   31:getfield        #17  <Field zzaqw zzbnd>
	//*  14   34:invokeinterface #33  <Method Context zzaqw.getContext()>
	//*  15   39:ldc2            #313 <String "android.permission.ACCESS_COARSE_LOCATION">
	//*  16   42:invokestatic    #311 <Method boolean zzakk.zzl(Context, String)>
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
	//   28   62:invokeinterface #319 <Method void android.webkit.GeolocationPermissions$Callback.invoke(String, boolean, boolean)>
		}
	//   29   67:return          
	}

	public final void onHideCustomView()
	{
		zzd zzd1 = zzbnd.zzub();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaqw zzbnd>
	//    2    4:invokeinterface #187 <Method zzd zzaqw.zzub()>
	//    3    9:astore_1        
		if(zzd1 == null)
	//*   4   10:aload_1         
	//*   5   11:ifnonnull       21
		{
			zzakb.zzdk("Could not get ad overlay when hiding custom view.");
	//    6   14:ldc2            #322 <String "Could not get ad overlay when hiding custom view.">
	//    7   17:invokestatic    #183 <Method void zzakb.zzdk(String)>
			return;
	//    8   20:return          
		} else
		{
			zzd1.zznh();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #325 <Method void zzd.zznh()>
			return;
	//   11   25:return          
		}
	}

	public final boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
	{
		return zza(zza(webview), "alert", s, s1, ((String) (null)), jsresult, ((JsPromptResult) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #329 <Method Context zza(WebView)>
	//    3    5:ldc2            #331 <String "alert">
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:aload           4
	//    8   13:aconst_null     
	//    9   14:iconst_0        
	//   10   15:invokespecial   #333 <Method boolean zza(Context, String, String, String, String, JsResult, JsPromptResult, boolean)>
	//   11   18:ireturn         
	}

	public final boolean onJsBeforeUnload(WebView webview, String s, String s1, JsResult jsresult)
	{
		return zza(zza(webview), "onBeforeUnload", s, s1, ((String) (null)), jsresult, ((JsPromptResult) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #329 <Method Context zza(WebView)>
	//    3    5:ldc2            #336 <String "onBeforeUnload">
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:aload           4
	//    8   13:aconst_null     
	//    9   14:iconst_0        
	//   10   15:invokespecial   #333 <Method boolean zza(Context, String, String, String, String, JsResult, JsPromptResult, boolean)>
	//   11   18:ireturn         
	}

	public final boolean onJsConfirm(WebView webview, String s, String s1, JsResult jsresult)
	{
		return zza(zza(webview), "confirm", s, s1, ((String) (null)), jsresult, ((JsPromptResult) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #329 <Method Context zza(WebView)>
	//    3    5:ldc2            #339 <String "confirm">
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:aload           4
	//    8   13:aconst_null     
	//    9   14:iconst_0        
	//   10   15:invokespecial   #333 <Method boolean zza(Context, String, String, String, String, JsResult, JsPromptResult, boolean)>
	//   11   18:ireturn         
	}

	public final boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
	{
		return zza(zza(webview), "prompt", s, s1, s2, ((JsResult) (null)), jspromptresult, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #329 <Method Context zza(WebView)>
	//    3    5:ldc2            #343 <String "prompt">
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:aconst_null     
	//    8   13:aload           5
	//    9   15:iconst_1        
	//   10   16:invokespecial   #333 <Method boolean zza(Context, String, String, String, String, JsResult, JsPromptResult, boolean)>
	//   11   19:ireturn         
	}

	public final void onPermissionRequest(PermissionRequest permissionrequest)
	{
		if(PlatformVersion.isAtLeastLollipop())
	//*   0    0:invokestatic    #351 <Method boolean PlatformVersion.isAtLeastLollipop()>
	//*   1    3:ifeq            114
		{
			zzna zzna = zznk.zzayb;
	//    2    6:getstatic       #357 <Field zzna zznk.zzayb>
	//    3    9:astore_2        
			if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   4   10:invokestatic    #363 <Method zzni zzkb.zzik()>
	//*   5   13:aload_2         
	//*   6   14:invokevirtual   #369 <Method Object com.google.android.gms.internal.ads.zzni.zzd(zzna)>
	//*   7   17:checkcast       #371 <Class Boolean>
	//*   8   20:invokevirtual   #374 <Method boolean Boolean.booleanValue()>
	//*   9   23:ifeq            29
	//*  10   26:goto            114
				if(zzbnd != null && zzbnd.zzuf() != null && zzbnd.zzuf().zzvf() != null)
	//*  11   29:aload_0         
	//*  12   30:getfield        #17  <Field zzaqw zzbnd>
	//*  13   33:ifnull          108
	//*  14   36:aload_0         
	//*  15   37:getfield        #17  <Field zzaqw zzbnd>
	//*  16   40:invokeinterface #40  <Method zzasc zzaqw.zzuf()>
	//*  17   45:ifnull          108
	//*  18   48:aload_0         
	//*  19   49:getfield        #17  <Field zzaqw zzbnd>
	//*  20   52:invokeinterface #40  <Method zzasc zzaqw.zzuf()>
	//*  21   57:invokeinterface #378 <Method zzait zzasc.zzvf()>
	//*  22   62:ifnonnull       68
	//*  23   65:goto            108
				{
					String as[] = zzbnd.zzuf().zzvf().zzb(permissionrequest.getResources());
	//   24   68:aload_0         
	//   25   69:getfield        #17  <Field zzaqw zzbnd>
	//   26   72:invokeinterface #40  <Method zzasc zzaqw.zzuf()>
	//   27   77:invokeinterface #378 <Method zzait zzasc.zzvf()>
	//   28   82:aload_1         
	//   29   83:invokevirtual   #384 <Method String[] PermissionRequest.getResources()>
	//   30   86:invokeinterface #390 <Method String[] zzait.zzb(String[])>
	//   31   91:astore_2        
					if(as.length > 0)
	//*  32   92:aload_2         
	//*  33   93:arraylength     
	//*  34   94:ifle            103
					{
						permissionrequest.grant(as);
	//   35   97:aload_1         
	//   36   98:aload_2         
	//   37   99:invokevirtual   #394 <Method void PermissionRequest.grant(String[])>
						return;
	//   38  102:return          
					} else
					{
						permissionrequest.deny();
	//   39  103:aload_1         
	//   40  104:invokevirtual   #397 <Method void PermissionRequest.deny()>
						return;
	//   41  107:return          
					}
				} else
				{
					super.onPermissionRequest(permissionrequest);
	//   42  108:aload_0         
	//   43  109:aload_1         
	//   44  110:invokespecial   #399 <Method void WebChromeClient.onPermissionRequest(PermissionRequest)>
					return;
	//   45  113:return          
				}
		}
		super.onPermissionRequest(permissionrequest);
	//   46  114:aload_0         
	//   47  115:aload_1         
	//   48  116:invokespecial   #399 <Method void WebChromeClient.onPermissionRequest(PermissionRequest)>
	//   49  119:return          
	}

	public final void onReachedMaxAppCacheSize(long l, long l1, android.webkit.WebStorage.QuotaUpdater quotaupdater)
	{
		l += 0x20000L;
	//    0    0:lload_1         
	//    1    1:ldc2w           #288 <Long 0x20000L>
	//    2    4:ladd            
	//    3    5:lstore_1        
		if(0x500000L - l1 < l)
	//*   4    6:ldc2w           #278 <Long 0x500000L>
	//*   5    9:lload_3         
	//*   6   10:lsub            
	//*   7   11:lload_1         
	//*   8   12:lcmp            
	//*   9   13:ifge            25
		{
			quotaupdater.updateQuota(0L);
	//   10   16:aload           5
	//   11   18:lconst_0        
	//   12   19:invokeinterface #285 <Method void android.webkit.WebStorage$QuotaUpdater.updateQuota(long)>
			return;
	//   13   24:return          
		} else
		{
			quotaupdater.updateQuota(l);
	//   14   25:aload           5
	//   15   27:lload_1         
	//   16   28:invokeinterface #285 <Method void android.webkit.WebStorage$QuotaUpdater.updateQuota(long)>
			return;
	//   17   33:return          
		}
	}

	public final void onShowCustomView(View view, int i, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
	{
		zzd zzd1 = zzbnd.zzub();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaqw zzbnd>
	//    2    4:invokeinterface #187 <Method zzd zzaqw.zzub()>
	//    3    9:astore          4
		if(zzd1 == null)
	//*   4   11:aload           4
	//*   5   13:ifnonnull       29
		{
			zzakb.zzdk("Could not get ad overlay when showing custom view.");
	//    6   16:ldc2            #407 <String "Could not get ad overlay when showing custom view.">
	//    7   19:invokestatic    #183 <Method void zzakb.zzdk(String)>
			customviewcallback.onCustomViewHidden();
	//    8   22:aload_3         
	//    9   23:invokeinterface #412 <Method void android.webkit.WebChromeClient$CustomViewCallback.onCustomViewHidden()>
			return;
	//   10   28:return          
		} else
		{
			zzd1.zza(view, customviewcallback);
	//   11   29:aload           4
	//   12   31:aload_1         
	//   13   32:aload_3         
	//   14   33:invokevirtual   #415 <Method void zzd.zza(View, android.webkit.WebChromeClient$CustomViewCallback)>
			zzd1.setRequestedOrientation(i);
	//   15   36:aload           4
	//   16   38:iload_2         
	//   17   39:invokevirtual   #418 <Method void zzd.setRequestedOrientation(int)>
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
	//    4    4:invokevirtual   #421 <Method void onShowCustomView(View, int, android.webkit.WebChromeClient$CustomViewCallback)>
	//    5    7:return          
	}

	private final zzaqw zzbnd;
}
