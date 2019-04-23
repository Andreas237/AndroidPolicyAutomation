// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			abt, zzasi, re, rp

final class rf
	implements abt
{

	rf(re re1, rp rp)
	{
		b = re1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field re b>
		a = rp;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field rp a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void a(Object obj)
	{
		obj = ((Object) ((zzasi)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #23  <Class zzasi>
	//    2    4:astore_1        
		if(!b.a(a, ((zzasi) (obj))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #14  <Field re b>
	//*   5    9:aload_0         
	//*   6   10:getfield        #16  <Field rp a>
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #28  <Method boolean re.a(rp, zzasi)>
	//*   9   17:ifne            27
			b.a();
	//   10   20:aload_0         
	//   11   21:getfield        #14  <Field re b>
	//   12   24:invokevirtual   #30  <Method void re.a()>
	//   13   27:return          
	}

	private final rp a;
	private final re b;
}
