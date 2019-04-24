// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.common.util.PlatformVersion;

final class zzasy
{

	private zzasy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	static void zza(WebView webview, String s)
	{
		if(PlatformVersion.isAtLeastKitKat() && zzb(webview))
	//*   0    0:invokestatic    #26  <Method boolean PlatformVersion.isAtLeastKitKat()>
	//*   1    3:ifeq            20
	//*   2    6:aload_0         
	//*   3    7:invokestatic    #30  <Method boolean zzb(WebView)>
	//*   4   10:ifeq            20
		{
			webview.evaluateJavascript(s, ((android.webkit.ValueCallback) (null)));
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #36  <Method void WebView.evaluateJavascript(String, android.webkit.ValueCallback)>
			return;
	//    9   19:return          
		}
		s = String.valueOf(((Object) (s)));
	//   10   20:aload_1         
	//   11   21:invokestatic    #42  <Method String String.valueOf(Object)>
	//   12   24:astore_1        
		if(s.length() != 0)
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #46  <Method int String.length()>
	//*  15   29:ifeq            42
			s = "javascript:".concat(s);
	//   16   32:ldc1            #48  <String "javascript:">
	//   17   34:aload_1         
	//   18   35:invokevirtual   #52  <Method String String.concat(String)>
	//   19   38:astore_1        
		else
	//*  20   39:goto            52
			s = new String("javascript:");
	//   21   42:new             #38  <Class String>
	//   22   45:dup             
	//   23   46:ldc1            #48  <String "javascript:">
	//   24   48:invokespecial   #55  <Method void String(String)>
	//   25   51:astore_1        
		webview.loadUrl(s);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #58  <Method void WebView.loadUrl(String)>
	//   29   57:return          
	}

	private static boolean zzb(WebView webview)
	{
		com/google/android/gms/internal/ads/zzasy;
	//    0    0:ldc1            #2   <Class zzasy>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Boolean boolean1 = zzdfk;
	//    2    3:getstatic       #63  <Field Boolean zzdfk>
	//    3    6:astore_2        
		if(boolean1 != null) goto _L2; else goto _L1
	//    4    7:aload_2         
	//    5    8:ifnonnull       35
_L1:
		webview.evaluateJavascript("(function(){})()", ((android.webkit.ValueCallback) (null)));
	//    6   11:aload_0         
	//    7   12:ldc1            #65  <String "(function(){})()">
	//    8   14:aconst_null     
	//    9   15:invokevirtual   #36  <Method void WebView.evaluateJavascript(String, android.webkit.ValueCallback)>
		zzdfk = Boolean.valueOf(true);
	//   10   18:iconst_1        
	//   11   19:invokestatic    #70  <Method Boolean Boolean.valueOf(boolean)>
	//   12   22:putstatic       #63  <Field Boolean zzdfk>
		  goto _L2
	//*  13   25:goto            35
_L4:
		zzdfk = Boolean.valueOf(false);
	//   14   28:iconst_0        
	//   15   29:invokestatic    #70  <Method Boolean Boolean.valueOf(boolean)>
	//   16   32:putstatic       #63  <Field Boolean zzdfk>
_L2:
		boolean flag = zzdfk.booleanValue();
	//   17   35:getstatic       #63  <Field Boolean zzdfk>
	//   18   38:invokevirtual   #73  <Method boolean Boolean.booleanValue()>
	//   19   41:istore_1        
		com/google/android/gms/internal/ads/zzasy;
	//   20   42:ldc1            #2   <Class zzasy>
		JVM INSTR monitorexit ;
	//   21   44:monitorexit     
		return flag;
	//   22   45:iload_1         
	//   23   46:ireturn         
		webview;
	//   24   47:astore_0        
		com/google/android/gms/internal/ads/zzasy;
	//   25   48:ldc1            #2   <Class zzasy>
		JVM INSTR monitorexit ;
	//   26   50:monitorexit     
		throw webview;
	//   27   51:aload_0         
	//   28   52:athrow          
		webview;
	//   29   53:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//*  30   54:goto            28
	}

	private static Boolean zzdfk;
}
