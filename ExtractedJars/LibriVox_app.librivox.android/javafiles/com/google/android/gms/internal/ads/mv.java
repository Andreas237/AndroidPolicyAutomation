// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			mu, xg

final class mv
	implements android.content.DialogInterface.OnClickListener
{

	mv(mu mu1)
	{
		a = mu1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field mu a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
		dialoginterface = ((DialogInterface) (a.b()));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field mu a>
	//    2    4:invokevirtual   #24  <Method android.content.Intent mu.b()>
	//    3    7:astore_1        
		aw.e();
	//    4    8:invokestatic    #30  <Method xg aw.e()>
	//    5   11:pop             
		xg.a(mu.a(a), ((android.content.Intent) (dialoginterface)));
	//    6   12:aload_0         
	//    7   13:getfield        #12  <Field mu a>
	//    8   16:invokestatic    #33  <Method android.content.Context mu.a(mu)>
	//    9   19:aload_1         
	//   10   20:invokestatic    #38  <Method void xg.a(android.content.Context, android.content.Intent)>
	//   11   23:return          
	}

	private final mu a;
}
