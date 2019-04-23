// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.paypal.android.sdk.fa;
import com.paypal.android.sdk.fc;

// Referenced classes of package com.paypal.android.sdk.payments:
//			i, j, cd, h

public final class FuturePaymentInfoActivity extends Activity
{

	public FuturePaymentInfoActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Activity()>
	//    2    4:return          
	}

	protected final void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void Activity.onCreate(Bundle)>
		bundle = ((Bundle) ((i)getIntent().getExtras().getSerializable("com.paypal.details.scope")));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #19  <Method Intent getIntent()>
	//    5    9:invokevirtual   #25  <Method Bundle Intent.getExtras()>
	//    6   12:ldc1            #27  <String "com.paypal.details.scope">
	//    7   14:invokevirtual   #33  <Method java.io.Serializable Bundle.getSerializable(String)>
	//    8   17:checkcast       #35  <Class i>
	//    9   20:astore_1        
		((Activity)this).setTheme(0x103006e);
	//   10   21:aload_0         
	//   11   22:ldc1            #36  <Int 0x103006e>
	//   12   24:invokevirtual   #40  <Method void Activity.setTheme(int)>
		((Activity)this).requestWindowFeature(8);
	//   13   27:aload_0         
	//   14   28:bipush          8
	//   15   30:invokevirtual   #44  <Method boolean Activity.requestWindowFeature(int)>
	//   16   33:pop             
		a = new j(((android.content.Context) (this)), ((i) (bundle)));
	//   17   34:aload_0         
	//   18   35:new             #46  <Class j>
	//   19   38:dup             
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:invokespecial   #49  <Method void j(android.content.Context, i)>
	//   23   44:putfield        #51  <Field j a>
		setContentView(a.a);
	//   24   47:aload_0         
	//   25   48:aload_0         
	//   26   49:getfield        #51  <Field j a>
	//   27   52:getfield        #54  <Field android.view.View j.a>
	//   28   55:invokevirtual   #58  <Method void setContentView(android.view.View)>
		cd.a(((Activity) (this)), a.b, ((fc) (null)));
	//   29   58:aload_0         
	//   30   59:aload_0         
	//   31   60:getfield        #51  <Field j a>
	//   32   63:getfield        #62  <Field android.widget.TextView j.b>
	//   33   66:aconst_null     
	//   34   67:invokestatic    #67  <Method void cd.a(Activity, android.widget.TextView, fc)>
		a.c.setText(((CharSequence) (fa.a(fc.d))));
	//   35   70:aload_0         
	//   36   71:getfield        #51  <Field j a>
	//   37   74:getfield        #71  <Field Button j.c>
	//   38   77:getstatic       #77  <Field fc fc.d>
	//   39   80:invokestatic    #82  <Method String fa.a(fc)>
	//   40   83:invokevirtual   #88  <Method void Button.setText(CharSequence)>
		a.c.setOnClickListener(((android.view.View.OnClickListener) (new h(this))));
	//   41   86:aload_0         
	//   42   87:getfield        #51  <Field j a>
	//   43   90:getfield        #71  <Field Button j.c>
	//   44   93:new             #90  <Class h>
	//   45   96:dup             
	//   46   97:aload_0         
	//   47   98:invokespecial   #93  <Method void h(FuturePaymentInfoActivity)>
	//   48  101:invokevirtual   #97  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
	//   49  104:return          
	}

	private j a;
}
