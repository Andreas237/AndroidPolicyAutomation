// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;

// Referenced classes of package com.irobot.home.view:
//			RevealableView

private static class RevealableView$c
{

	static RevealableView$b a(RevealableView$c revealableview$c)
	{
		return revealableview$c.e;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field RevealableView$b e>
	//    2    4:areturn         
	}

	static RevealableView$b a(RevealableView$c revealableview$c, RevealableView$b revealableview$b)
	{
		revealableview$c.e = revealableview$b;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field RevealableView$b e>
		return revealableview$b;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static String b(RevealableView$c revealableview$c)
	{
		return revealableview$c.d;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String d>
	//    2    4:areturn         
	}

	int a;
	int b;
	private Context c;
	private String d;
	private RevealableView$b e;

	RevealableView$c(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		b = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #22  <Field int b>
		c = context;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #24  <Field Context c>
	//    8   14:return          
	}
}
