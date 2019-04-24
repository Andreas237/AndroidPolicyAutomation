// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.location:
//			zzf, zzd

final class zzf$1
	implements Comparator
{

	public int compare(Object obj, Object obj1)
	{
		return zza((zzd)obj, (zzd)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class zzd>
	//    3    5:aload_2         
	//    4    6:checkcast       #18  <Class zzd>
	//    5    9:invokevirtual   #22  <Method int zza(zzd, zzd)>
	//    6   12:ireturn         
	}

	public int zza(zzd zzd1, zzd zzd2)
	{
		int i = zzd1.zzBW();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method int zzd.zzBW()>
	//    2    4:istore_3        
		int j = zzd2.zzBW();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #26  <Method int zzd.zzBW()>
	//    5    9:istore          4
		if(i != j)
	//*   6   11:iload_3         
	//*   7   12:iload           4
	//*   8   14:icmpeq          27
			return i >= j ? 1 : -1;
	//    9   17:iload_3         
	//   10   18:iload           4
	//   11   20:icmpge          25
	//   12   23:iconst_m1       
	//   13   24:ireturn         
	//   14   25:iconst_1        
	//   15   26:ireturn         
		i = zzd1.zzIc();
	//   16   27:aload_1         
	//   17   28:invokevirtual   #29  <Method int zzd.zzIc()>
	//   18   31:istore_3        
		j = zzd2.zzIc();
	//   19   32:aload_2         
	//   20   33:invokevirtual   #29  <Method int zzd.zzIc()>
	//   21   36:istore          4
		if(i == j)
	//*  22   38:iload_3         
	//*  23   39:iload           4
	//*  24   41:icmpne          46
			return 0;
	//   25   44:iconst_0        
	//   26   45:ireturn         
		return i >= j ? 1 : -1;
	//   27   46:iload_3         
	//   28   47:iload           4
	//   29   49:icmpge          54
	//   30   52:iconst_m1       
	//   31   53:ireturn         
	//   32   54:iconst_1        
	//   33   55:ireturn         
	}

	zzf$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
