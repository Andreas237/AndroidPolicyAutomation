// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.*;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj, zzgi

final class zzei extends zzbq
{

	public zzei()
	{
		super(ID, new String[0]);
	//    0    0:aload_0         
	//    1    1:getstatic       #22  <Field String ID>
	//    2    4:iconst_0        
	//    3    5:anewarray       String[]
	//    4    8:invokespecial   #43  <Method void zzbq(String, String[])>
	//    5   11:return          
	}

	public final zzp zzc(Map map)
	{
		double d;
		double d1;
label0:
		{
			Object obj = ((Object) ((zzp)map.get(((Object) (zzbek)))));
	//    0    0:aload_1         
	//    1    1:getstatic       #31  <Field String zzbek>
	//    2    4:invokeinterface #51  <Method Object Map.get(Object)>
	//    3    9:checkcast       #53  <Class zzp>
	//    4   12:astore          6
			map = ((Map) ((zzp)map.get(((Object) (zzbel)))));
	//    5   14:aload_1         
	//    6   15:getstatic       #36  <Field String zzbel>
	//    7   18:invokeinterface #51  <Method Object Map.get(Object)>
	//    8   23:checkcast       #53  <Class zzp>
	//    9   26:astore_1        
			if(obj != null && obj != zzgj.zzqq() && map != null && map != zzgj.zzqq())
	//*  10   27:aload           6
	//*  11   29:ifnull          100
	//*  12   32:aload           6
	//*  13   34:invokestatic    #59  <Method zzp zzgj.zzqq()>
	//*  14   37:if_acmpeq       100
	//*  15   40:aload_1         
	//*  16   41:ifnull          100
	//*  17   44:aload_1         
	//*  18   45:invokestatic    #59  <Method zzp zzgj.zzqq()>
	//*  19   48:if_acmpeq       100
			{
				obj = ((Object) (zzgj.zzd(((zzp) (obj)))));
	//   20   51:aload           6
	//   21   53:invokestatic    #63  <Method zzgi zzgj.zzd(zzp)>
	//   22   56:astore          6
				map = ((Map) (zzgj.zzd(((zzp) (map)))));
	//   23   58:aload_1         
	//   24   59:invokestatic    #63  <Method zzgi zzgj.zzd(zzp)>
	//   25   62:astore_1        
				if(obj != zzgj.zzqo() && map != zzgj.zzqo())
	//*  26   63:aload           6
	//*  27   65:invokestatic    #67  <Method zzgi zzgj.zzqo()>
	//*  28   68:if_acmpeq       100
	//*  29   71:aload_1         
	//*  30   72:invokestatic    #67  <Method zzgi zzgj.zzqo()>
	//*  31   75:if_acmpeq       100
				{
					d = ((zzgi) (obj)).doubleValue();
	//   32   78:aload           6
	//   33   80:invokevirtual   #73  <Method double zzgi.doubleValue()>
	//   34   83:dstore_2        
					d1 = ((zzgi) (map)).doubleValue();
	//   35   84:aload_1         
	//   36   85:invokevirtual   #73  <Method double zzgi.doubleValue()>
	//   37   88:dstore          4
					if(d <= d1)
	//*  38   90:dload_2         
	//*  39   91:dload           4
	//*  40   93:dcmpg           
	//*  41   94:ifgt            100
						break label0;
	//   42   97:goto            107
				}
			}
			d = 0.0D;
	//   43  100:dconst_0        
	//   44  101:dstore_2        
			d1 = 2147483647D;
	//   45  102:ldc2w           #74  <Double 2147483647D>
	//   46  105:dstore          4
		}
		return zzgj.zzj(((Object) (Long.valueOf(Math.round(Math.random() * (d1 - d) + d)))));
	//   47  107:invokestatic    #80  <Method double Math.random()>
	//   48  110:dload           4
	//   49  112:dload_2         
	//   50  113:dsub            
	//   51  114:dmul            
	//   52  115:dload_2         
	//   53  116:dadd            
	//   54  117:invokestatic    #84  <Method long Math.round(double)>
	//   55  120:invokestatic    #90  <Method Long Long.valueOf(long)>
	//   56  123:invokestatic    #94  <Method zzp zzgj.zzj(Object)>
	//   57  126:areturn         
	}

	public final boolean zznk()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static final String ID;
	private static final String zzbek;
	private static final String zzbel;

	static 
	{
		ID = zza.zzz.toString();
	//    0    0:getstatic       #16  <Field zza zza.zzz>
	//    1    3:invokevirtual   #20  <Method String zza.toString()>
	//    2    6:putstatic       #22  <Field String ID>
		zzbek = zzb.zzji.toString();
	//    3    9:getstatic       #28  <Field zzb zzb.zzji>
	//    4   12:invokevirtual   #29  <Method String zzb.toString()>
	//    5   15:putstatic       #31  <Field String zzbek>
		zzbel = zzb.zzjg.toString();
	//    6   18:getstatic       #34  <Field zzb zzb.zzjg>
	//    7   21:invokevirtual   #29  <Method String zzb.toString()>
	//    8   24:putstatic       #36  <Field String zzbel>
	//*   9   27:return          
	}
}
