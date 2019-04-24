// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.webkit.SslErrorHandler;

// Referenced classes of package o:
//			fs, fq, fo, hy

final class fp
	implements Runnable
{

	fp(fs fs1, SslErrorHandler sslerrorhandler)
	{
		b = fs1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field fs b>
		d = sslerrorhandler;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field SslErrorHandler d>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		hy.e(((android.content.Context) (fs.a(b))), "\u5B89\u5168\u8B66\u544A", "\u5B89\u5168\u8FDE\u63A5\u8BC1\u4E66\u6821\u9A8C\u65E0\u6548\uFF0C\u5C06\u65E0\u6CD5\u4FDD\u8BC1\u8BBF\u95EE\u6570\u636E\u7684\u5B89\u5168\u6027\uFF0C\u53EF\u80FD\u5B58\u5728\u98CE\u9669\uFF0C\u8BF7\u9009\u62E9\u662F\u5426\u7EE7\u7EED\uFF1F", "\u7EE7\u7EED", ((android.content.DialogInterface.OnClickListener) (new fq(this))), "\u9000\u51FA", ((android.content.DialogInterface.OnClickListener) (new fo(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field fs b>
	//    2    4:invokestatic    #27  <Method android.app.Activity fs.a(fs)>
	//    3    7:ldc1            #29  <String "\u5B89\u5168\u8B66\u544A">
	//    4    9:ldc1            #31  <String "\u5B89\u5168\u8FDE\u63A5\u8BC1\u4E66\u6821\u9A8C\u65E0\u6548\uFF0C\u5C06\u65E0\u6CD5\u4FDD\u8BC1\u8BBF\u95EE\u6570\u636E\u7684\u5B89\u5168\u6027\uFF0C\u53EF\u80FD\u5B58\u5728\u98CE\u9669\uFF0C\u8BF7\u9009\u62E9\u662F\u5426\u7EE7\u7EED\uFF1F">
	//    5   11:ldc1            #33  <String "\u7EE7\u7EED">
	//    6   13:new             #35  <Class fq>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #38  <Method void fq(fp)>
	//   10   21:ldc1            #40  <String "\u9000\u51FA">
	//   11   23:new             #42  <Class fo>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokespecial   #43  <Method void fo(fp)>
	//   15   31:invokestatic    #49  <Method android.app.Dialog hy.e(android.content.Context, String, String, String, android.content.DialogInterface$OnClickListener, String, android.content.DialogInterface$OnClickListener)>
	//   16   34:pop             
	//   17   35:return          
	}

	final fs b;
	final SslErrorHandler d;
}
