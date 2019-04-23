// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			boq, ef

final class bpr
	implements Runnable
{

	bpr(boq boq1, String s, long l)
	{
		c = boq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field boq c>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field String a>
		b = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #20  <Field long b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public final void run()
	{
		boq.a(c).a(a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field boq c>
	//    2    4:invokestatic    #30  <Method ef boq.a(boq)>
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field String a>
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field long b>
	//    7   15:invokevirtual   #35  <Method void ef.a(String, long)>
		boq.a(c).a(c.toString());
	//    8   18:aload_0         
	//    9   19:getfield        #16  <Field boq c>
	//   10   22:invokestatic    #30  <Method ef boq.a(boq)>
	//   11   25:aload_0         
	//   12   26:getfield        #16  <Field boq c>
	//   13   29:invokevirtual   #39  <Method String boq.toString()>
	//   14   32:invokevirtual   #42  <Method void ef.a(String)>
	//   15   35:return          
	}

	private final String a;
	private final long b;
	private final boq c;
}
