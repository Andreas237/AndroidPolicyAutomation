// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.alipay.sdk.auth;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

// Referenced classes of package com.alipay.sdk.auth:
//			AuthActivity

final class AuthActivity$a extends WebChromeClient
{

	public final boolean onConsoleMessage(ConsoleMessage consolemessage)
	{
		String s1 = consolemessage.message();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method String ConsoleMessage.message()>
	//    2    4:astore_3        
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   3    5:aload_3         
	//*   4    6:invokestatic    #34  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifeq            18
			return super.onConsoleMessage(consolemessage);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #36  <Method boolean WebChromeClient.onConsoleMessage(ConsoleMessage)>
	//    9   17:ireturn         
		String s = null;
	//   10   18:aconst_null     
	//   11   19:astore_2        
		if(s1.startsWith("h5container.message: "))
	//*  12   20:aload_3         
	//*  13   21:ldc1            #38  <String "h5container.message: ">
	//*  14   23:invokevirtual   #44  <Method boolean String.startsWith(String)>
	//*  15   26:ifeq            38
			s = s1.replaceFirst("h5container.message: ", "");
	//   16   29:aload_3         
	//   17   30:ldc1            #38  <String "h5container.message: ">
	//   18   32:ldc1            #46  <String "">
	//   19   34:invokevirtual   #50  <Method String String.replaceFirst(String, String)>
	//   20   37:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  21   38:aload_2         
	//*  22   39:invokestatic    #34  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  23   42:ifeq            51
		{
			return super.onConsoleMessage(consolemessage);
	//   24   45:aload_0         
	//   25   46:aload_1         
	//   26   47:invokespecial   #36  <Method boolean WebChromeClient.onConsoleMessage(ConsoleMessage)>
	//   27   50:ireturn         
		} else
		{
			AuthActivity.e(e, s);
	//   28   51:aload_0         
	//   29   52:getfield        #13  <Field AuthActivity e>
	//   30   55:aload_2         
	//   31   56:invokestatic    #53  <Method void AuthActivity.e(AuthActivity, String)>
			return super.onConsoleMessage(consolemessage);
	//   32   59:aload_0         
	//   33   60:aload_1         
	//   34   61:invokespecial   #36  <Method boolean WebChromeClient.onConsoleMessage(ConsoleMessage)>
	//   35   64:ireturn         
		}
	}

	final AuthActivity e;

	private AuthActivity$a(AuthActivity authactivity)
	{
		e = authactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field AuthActivity e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void WebChromeClient()>
	//    5    9:return          
	}

	AuthActivity$a(AuthActivity authactivity, byte byte0)
	{
		this(authactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void AuthActivity$a(AuthActivity)>
	//    3    5:return          
	}
}
