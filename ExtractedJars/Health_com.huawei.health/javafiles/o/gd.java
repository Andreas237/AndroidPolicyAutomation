// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.DialogInterface;
import android.webkit.SslErrorHandler;
import com.alipay.sdk.auth.AuthActivity;

// Referenced classes of package o:
//			ga, gg

final class gd
	implements android.content.DialogInterface.OnClickListener
{

	gd(ga ga1)
	{
		b = ga1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ga b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
		b.e.cancel();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ga b>
	//    2    4:getfield        #24  <Field SslErrorHandler ga.e>
	//    3    7:invokevirtual   #29  <Method void SslErrorHandler.cancel()>
		AuthActivity.a(b.a.a, false);
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field ga b>
	//    6   14:getfield        #33  <Field com.alipay.sdk.auth.AuthActivity$b ga.a>
	//    7   17:getfield        #38  <Field AuthActivity com.alipay.sdk.auth.AuthActivity$b.a>
	//    8   20:iconst_0        
	//    9   21:invokestatic    #43  <Method boolean AuthActivity.a(AuthActivity, boolean)>
	//   10   24:pop             
		dialoginterface = ((DialogInterface) ((new StringBuilder()).append(AuthActivity.e(b.a.a)).append("?resultCode=150").toString()));
	//   11   25:new             #45  <Class StringBuilder>
	//   12   28:dup             
	//   13   29:invokespecial   #46  <Method void StringBuilder()>
	//   14   32:aload_0         
	//   15   33:getfield        #12  <Field ga b>
	//   16   36:getfield        #33  <Field com.alipay.sdk.auth.AuthActivity$b ga.a>
	//   17   39:getfield        #38  <Field AuthActivity com.alipay.sdk.auth.AuthActivity$b.a>
	//   18   42:invokestatic    #49  <Method String AuthActivity.e(AuthActivity)>
	//   19   45:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:ldc1            #55  <String "?resultCode=150">
	//   21   50:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   22   53:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   23   56:astore_1        
		gg.b(((android.app.Activity) (b.a.a)), ((String) (dialoginterface)));
	//   24   57:aload_0         
	//   25   58:getfield        #12  <Field ga b>
	//   26   61:getfield        #33  <Field com.alipay.sdk.auth.AuthActivity$b ga.a>
	//   27   64:getfield        #38  <Field AuthActivity com.alipay.sdk.auth.AuthActivity$b.a>
	//   28   67:aload_1         
	//   29   68:invokestatic    #64  <Method void gg.b(android.app.Activity, String)>
		b.a.a.finish();
	//   30   71:aload_0         
	//   31   72:getfield        #12  <Field ga b>
	//   32   75:getfield        #33  <Field com.alipay.sdk.auth.AuthActivity$b ga.a>
	//   33   78:getfield        #38  <Field AuthActivity com.alipay.sdk.auth.AuthActivity$b.a>
	//   34   81:invokevirtual   #67  <Method void AuthActivity.finish()>
	//   35   84:return          
	}

	final ga b;
}
