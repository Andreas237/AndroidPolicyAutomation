// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgp, zzha

public final class zzhb
	implements Comparator
{

	public zzhb(zzha zzha)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public final int compare(Object obj, Object obj1)
	{
		obj = ((Object) ((zzgp)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #17  <Class zzgp>
	//    2    4:astore_1        
		obj1 = ((Object) ((zzgp)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #17  <Class zzgp>
	//    5    9:astore_2        
		if(((zzgp) (obj)).zzhc() < ((zzgp) (obj1)).zzhc())
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #21  <Method float zzgp.zzhc()>
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #21  <Method float zzgp.zzhc()>
	//*  10   18:fcmpg           
	//*  11   19:ifge            24
			return -1;
	//   12   22:iconst_m1       
	//   13   23:ireturn         
		if(((zzgp) (obj)).zzhc() > ((zzgp) (obj1)).zzhc())
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #21  <Method float zzgp.zzhc()>
	//*  16   28:aload_2         
	//*  17   29:invokevirtual   #21  <Method float zzgp.zzhc()>
	//*  18   32:fcmpl           
	//*  19   33:ifle            38
			return 1;
	//   20   36:iconst_1        
	//   21   37:ireturn         
		if(((zzgp) (obj)).zzhb() < ((zzgp) (obj1)).zzhb())
	//*  22   38:aload_1         
	//*  23   39:invokevirtual   #24  <Method float zzgp.zzhb()>
	//*  24   42:aload_2         
	//*  25   43:invokevirtual   #24  <Method float zzgp.zzhb()>
	//*  26   46:fcmpg           
	//*  27   47:ifge            52
			return -1;
	//   28   50:iconst_m1       
	//   29   51:ireturn         
		if(((zzgp) (obj)).zzhb() > ((zzgp) (obj1)).zzhb())
	//*  30   52:aload_1         
	//*  31   53:invokevirtual   #24  <Method float zzgp.zzhb()>
	//*  32   56:aload_2         
	//*  33   57:invokevirtual   #24  <Method float zzgp.zzhb()>
	//*  34   60:fcmpl           
	//*  35   61:ifle            66
			return 1;
	//   36   64:iconst_1        
	//   37   65:ireturn         
		float f = (((zzgp) (obj)).zzhe() - ((zzgp) (obj)).zzhc()) * (((zzgp) (obj)).zzhd() - ((zzgp) (obj)).zzhb());
	//   38   66:aload_1         
	//   39   67:invokevirtual   #27  <Method float zzgp.zzhe()>
	//   40   70:aload_1         
	//   41   71:invokevirtual   #21  <Method float zzgp.zzhc()>
	//   42   74:fsub            
	//   43   75:aload_1         
	//   44   76:invokevirtual   #30  <Method float zzgp.zzhd()>
	//   45   79:aload_1         
	//   46   80:invokevirtual   #24  <Method float zzgp.zzhb()>
	//   47   83:fsub            
	//   48   84:fmul            
	//   49   85:fstore_3        
		float f1 = (((zzgp) (obj1)).zzhe() - ((zzgp) (obj1)).zzhc()) * (((zzgp) (obj1)).zzhd() - ((zzgp) (obj1)).zzhb());
	//   50   86:aload_2         
	//   51   87:invokevirtual   #27  <Method float zzgp.zzhe()>
	//   52   90:aload_2         
	//   53   91:invokevirtual   #21  <Method float zzgp.zzhc()>
	//   54   94:fsub            
	//   55   95:aload_2         
	//   56   96:invokevirtual   #30  <Method float zzgp.zzhd()>
	//   57   99:aload_2         
	//   58  100:invokevirtual   #24  <Method float zzgp.zzhb()>
	//   59  103:fsub            
	//   60  104:fmul            
	//   61  105:fstore          4
		if(f > f1)
	//*  62  107:fload_3         
	//*  63  108:fload           4
	//*  64  110:fcmpl           
	//*  65  111:ifle            116
			return -1;
	//   66  114:iconst_m1       
	//   67  115:ireturn         
		return f >= f1 ? 0 : 1;
	//   68  116:fload_3         
	//   69  117:fload           4
	//   70  119:fcmpg           
	//   71  120:ifge            125
	//   72  123:iconst_1        
	//   73  124:ireturn         
	//   74  125:iconst_0        
	//   75  126:ireturn         
	}
}
