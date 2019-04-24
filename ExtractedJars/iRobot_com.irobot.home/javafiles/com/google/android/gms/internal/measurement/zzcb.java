// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.zzk;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzau, zzat, zzac, zzaw

public final class zzcb extends zzau
{

	zzcb(zzaw zzaw)
	{
		super(zzaw);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void zzau(zzaw)>
	//    3    5:return          
	}

	protected final void zzag()
	{
	//    0    0:return          
	}

	public final zzac zzek()
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method void zzau.zzcl()>
		return ((zzat)this).zzca().zzae();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #24  <Method zzk zzat.zzca()>
	//    4    8:invokevirtual   #29  <Method zzac zzk.zzae()>
	//    5   11:areturn         
	}

	public final String zzel()
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method void zzau.zzcl()>
		Object obj = ((Object) (zzek()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #33  <Method zzac zzek()>
	//    4    8:astore_3        
		int i = ((zzac) (obj)).zzuh;
	//    5    9:aload_3         
	//    6   10:getfield        #39  <Field int zzac.zzuh>
	//    7   13:istore_1        
		int j = ((zzac) (obj)).zzui;
	//    8   14:aload_3         
	//    9   15:getfield        #42  <Field int zzac.zzui>
	//   10   18:istore_2        
		obj = ((Object) (new StringBuilder(23)));
	//   11   19:new             #44  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:bipush          23
	//   14   25:invokespecial   #47  <Method void StringBuilder(int)>
	//   15   28:astore_3        
		((StringBuilder) (obj)).append(i);
	//   16   29:aload_3         
	//   17   30:iload_1         
	//   18   31:invokevirtual   #51  <Method StringBuilder StringBuilder.append(int)>
	//   19   34:pop             
		((StringBuilder) (obj)).append("x");
	//   20   35:aload_3         
	//   21   36:ldc1            #53  <String "x">
	//   22   38:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   23   41:pop             
		((StringBuilder) (obj)).append(j);
	//   24   42:aload_3         
	//   25   43:iload_2         
	//   26   44:invokevirtual   #51  <Method StringBuilder StringBuilder.append(int)>
	//   27   47:pop             
		return ((StringBuilder) (obj)).toString();
	//   28   48:aload_3         
	//   29   49:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   30   52:areturn         
	}
}
