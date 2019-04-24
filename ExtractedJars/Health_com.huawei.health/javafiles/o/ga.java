// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.webkit.SslErrorHandler;

// Referenced classes of package o:
//			gh, gd, hy

public final class ga
	implements Runnable
{

	public ga(com.alipay.sdk.auth.AuthActivity.b b, SslErrorHandler sslerrorhandler)
	{
		a = b;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field com.alipay.sdk.auth.AuthActivity$b a>
		e = sslerrorhandler;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field SslErrorHandler e>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		hy.e(((android.content.Context) (a.a)), "\u5B89\u5168\u8B66\u544A", "\u7531\u4E8E\u60A8\u7684\u8BBE\u5907\u7F3A\u5C11\u6839\u8BC1\u4E66\uFF0C\u5C06\u65E0\u6CD5\u6821\u9A8C\u8BE5\u8BBF\u95EE\u7AD9\u70B9\u7684\u5B89\u5168\u6027\uFF0C\u53EF\u80FD\u5B58\u5728\u98CE\u9669\uFF0C\u8BF7\u9009\u62E9\u662F\u5426\u7EE7\u7EED\uFF1F", "\u7EE7\u7EED", ((android.content.DialogInterface.OnClickListener) (new gh(this))), "\u9000\u51FA", ((android.content.DialogInterface.OnClickListener) (new gd(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field com.alipay.sdk.auth.AuthActivity$b a>
	//    2    4:getfield        #26  <Field com.alipay.sdk.auth.AuthActivity com.alipay.sdk.auth.AuthActivity$b.a>
	//    3    7:ldc1            #28  <String "\u5B89\u5168\u8B66\u544A">
	//    4    9:ldc1            #30  <String "\u7531\u4E8E\u60A8\u7684\u8BBE\u5907\u7F3A\u5C11\u6839\u8BC1\u4E66\uFF0C\u5C06\u65E0\u6CD5\u6821\u9A8C\u8BE5\u8BBF\u95EE\u7AD9\u70B9\u7684\u5B89\u5168\u6027\uFF0C\u53EF\u80FD\u5B58\u5728\u98CE\u9669\uFF0C\u8BF7\u9009\u62E9\u662F\u5426\u7EE7\u7EED\uFF1F">
	//    5   11:ldc1            #32  <String "\u7EE7\u7EED">
	//    6   13:new             #34  <Class gh>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #37  <Method void gh(ga)>
	//   10   21:ldc1            #39  <String "\u9000\u51FA">
	//   11   23:new             #41  <Class gd>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokespecial   #42  <Method void gd(ga)>
	//   15   31:invokestatic    #47  <Method android.app.Dialog hy.e(android.content.Context, String, String, String, android.content.DialogInterface$OnClickListener, String, android.content.DialogInterface$OnClickListener)>
	//   16   34:pop             
	//   17   35:return          
	}

	final com.alipay.sdk.auth.AuthActivity.b a;
	final SslErrorHandler e;
}
