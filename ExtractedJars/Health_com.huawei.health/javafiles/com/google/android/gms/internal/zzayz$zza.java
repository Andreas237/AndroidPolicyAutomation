// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//			zzayz

public static class zzayz$zza
	implements Comparator
{

	public int compare(Object obj, Object obj1)
	{
		return zza((zzayz)obj, (zzayz)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class zzayz>
	//    3    5:aload_2         
	//    4    6:checkcast       #9   <Class zzayz>
	//    5    9:invokevirtual   #20  <Method int zza(zzayz, zzayz)>
	//    6   12:ireturn         
	}

	public int zza(zzayz zzayz1, zzayz zzayz2)
	{
		if(zzayz1.zzbBF == zzayz2.zzbBF)
	//*   0    0:aload_1         
	//*   1    1:getfield        #24  <Field int zzayz.zzbBF>
	//*   2    4:aload_2         
	//*   3    5:getfield        #24  <Field int zzayz.zzbBF>
	//*   4    8:icmpne          23
			return zzayz1.name.compareTo(zzayz2.name);
	//    5   11:aload_1         
	//    6   12:getfield        #28  <Field String zzayz.name>
	//    7   15:aload_2         
	//    8   16:getfield        #28  <Field String zzayz.name>
	//    9   19:invokevirtual   #34  <Method int String.compareTo(String)>
	//   10   22:ireturn         
		else
			return zzayz1.zzbBF - zzayz2.zzbBF;
	//   11   23:aload_1         
	//   12   24:getfield        #24  <Field int zzayz.zzbBF>
	//   13   27:aload_2         
	//   14   28:getfield        #24  <Field int zzayz.zzbBF>
	//   15   31:isub            
	//   16   32:ireturn         
	}

	public zzayz$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
