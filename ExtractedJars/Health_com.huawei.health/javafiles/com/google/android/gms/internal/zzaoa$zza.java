// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzaoa

public static class zzaoa$zza
{

	public boolean zzg(double d)
	{
		return d >= zzaUA && d <= zzaUB;
	//    0    0:dload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field double zzaUA>
	//    3    5:dcmpl           
	//    4    6:iflt            20
	//    5    9:dload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field double zzaUB>
	//    8   14:dcmpg           
	//    9   15:ifgt            20
	//   10   18:iconst_1        
	//   11   19:ireturn         
	//   12   20:iconst_0        
	//   13   21:ireturn         
	}

	private final double zzaUA;
	private final double zzaUB;

	private zzaoa$zza(double d, double d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzaUA = d;
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:putfield        #17  <Field double zzaUA>
		zzaUB = d1;
	//    5    9:aload_0         
	//    6   10:dload_3         
	//    7   11:putfield        #19  <Field double zzaUB>
	//    8   14:return          
	}

	zzaoa$zza(double d, double d1, zzaoa._cls1 _pcls1)
	{
		this(d, d1);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:dload_3         
	//    3    3:invokespecial   #23  <Method void zzaoa$zza(double, double)>
	//    4    6:return          
	}
}
