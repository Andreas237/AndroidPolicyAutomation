// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.content.Context;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			p

public static class p$a extends p
{

	protected Class a()
	{
		return android/R$drawable;
	//    0    0:ldc1            #21  <Class android.R$drawable>
	//    1    2:areturn         
	}

	protected String a(Context context)
	{
		context = ((Context) (new StringBuilder()));
	//    0    0:new             #26  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (context)).append(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #13  <Field String a>
	//    7   13:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		((StringBuilder) (context)).append(".R$drawable");
	//    9   17:aload_1         
	//   10   18:ldc1            #34  <String ".R$drawable">
	//   11   20:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		return ((StringBuilder) (context)).toString();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   15   28:areturn         
	}

	private final String a;

	protected p$a(String s, Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #11  <Method void p(Context)>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #13  <Field String a>
		b();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #17  <Method void b()>
	//    8   14:return          
	}
}
