// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ui, zzwb, kp

final class uj
	implements Runnable
{

	uj(ui ui1, zzwb zzwb, kp kp)
	{
		c = ui1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ui c>
		a = zzwb;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field zzwb a>
		b = kp;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field kp b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public final void run()
	{
		ui.a(c, a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ui c>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field zzwb a>
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field kp b>
	//    6   12:invokestatic    #29  <Method void ui.a(ui, zzwb, kp)>
	//    7   15:return          
	}

	private final zzwb a;
	private final kp b;
	private final ui c;
}
