// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzhv, zzgf, zzeo, zzjj

abstract class zzio
{

	zzio()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	abstract void zza(Object obj, int i, long l);

	abstract void zza(Object obj, int i, zzeo zzeo);

	abstract void zza(Object obj, int i, Object obj1);

	abstract void zza(Object obj, zzjj zzjj)
		throws IOException;

	abstract boolean zza(zzhv zzhv1);

	final boolean zza(Object obj, zzhv zzhv1)
		throws IOException
	{
		int i = zzhv1.getTag();
	//    0    0:aload_2         
	//    1    1:invokeinterface #25  <Method int zzhv.getTag()>
	//    2    6:istore_3        
		int j = i >>> 3;
	//    3    7:iload_3         
	//    4    8:iconst_3        
	//    5    9:iushr           
	//    6   10:istore          4
		switch(i & 7)
	//*   7   12:iload_3         
	//*   8   13:bipush          7
	//*   9   15:iand            
		{
	//*  10   16:tableswitch     0 5: default 56
	//	               0 168
	//	               1 153
	//	               2 138
	//	               3 77
	//	               4 75
	//	               5 60
		default:
			throw zzgf.zzfm();
	//   11   56:invokestatic    #31  <Method zzgg zzgf.zzfm()>
	//   12   59:athrow          

		case 5: // '\005'
			zzc(obj, j, zzhv1.zzct());
	//   13   60:aload_0         
	//   14   61:aload_1         
	//   15   62:iload           4
	//   16   64:aload_2         
	//   17   65:invokeinterface #34  <Method int zzhv.zzct()>
	//   18   70:invokevirtual   #38  <Method void zzc(Object, int, int)>
			return true;
	//   19   73:iconst_1        
	//   20   74:ireturn         

		case 4: // '\004'
			return false;
	//   21   75:iconst_0        
	//   22   76:ireturn         

		case 3: // '\003'
			Object obj1;
			for(obj1 = zzhd(); zzhv1.zzcn() != 0x7fffffff && zza(obj1, zzhv1););
	//   23   77:aload_0         
	//   24   78:invokevirtual   #42  <Method Object zzhd()>
	//   25   81:astore          5
	//   26   83:aload_2         
	//   27   84:invokeinterface #45  <Method int zzhv.zzcn()>
	//   28   89:ldc1            #46  <Int 0x7fffffff>
	//   29   91:icmpeq          104
	//   30   94:aload_0         
	//   31   95:aload           5
	//   32   97:aload_2         
	//   33   98:invokevirtual   #48  <Method boolean zza(Object, zzhv)>
	//   34  101:ifne            83
			if((j << 3 | 4) == zzhv1.getTag())
	//*  35  104:iload           4
	//*  36  106:iconst_3        
	//*  37  107:ishl            
	//*  38  108:iconst_4        
	//*  39  109:ior             
	//*  40  110:aload_2         
	//*  41  111:invokeinterface #25  <Method int zzhv.getTag()>
	//*  42  116:icmpne          134
			{
				zza(obj, j, zzm(obj1));
	//   43  119:aload_0         
	//   44  120:aload_1         
	//   45  121:iload           4
	//   46  123:aload_0         
	//   47  124:aload           5
	//   48  126:invokevirtual   #52  <Method Object zzm(Object)>
	//   49  129:invokevirtual   #54  <Method void zza(Object, int, Object)>
				return true;
	//   50  132:iconst_1        
	//   51  133:ireturn         
			} else
			{
				throw zzgf.zzfl();
	//   52  134:invokestatic    #58  <Method zzgf zzgf.zzfl()>
	//   53  137:athrow          
			}

		case 2: // '\002'
			zza(obj, j, zzhv1.zzcw());
	//   54  138:aload_0         
	//   55  139:aload_1         
	//   56  140:iload           4
	//   57  142:aload_2         
	//   58  143:invokeinterface #62  <Method zzeo zzhv.zzcw()>
	//   59  148:invokevirtual   #64  <Method void zza(Object, int, zzeo)>
			return true;
	//   60  151:iconst_1        
	//   61  152:ireturn         

		case 1: // '\001'
			zzb(obj, j, zzhv1.zzcs());
	//   62  153:aload_0         
	//   63  154:aload_1         
	//   64  155:iload           4
	//   65  157:aload_2         
	//   66  158:invokeinterface #68  <Method long zzhv.zzcs()>
	//   67  163:invokevirtual   #71  <Method void zzb(Object, int, long)>
			return true;
	//   68  166:iconst_1        
	//   69  167:ireturn         

		case 0: // '\0'
			zza(obj, j, zzhv1.zzcq());
	//   70  168:aload_0         
	//   71  169:aload_1         
	//   72  170:iload           4
	//   73  172:aload_2         
	//   74  173:invokeinterface #74  <Method long zzhv.zzcq()>
	//   75  178:invokevirtual   #76  <Method void zza(Object, int, long)>
			return true;
	//   76  181:iconst_1        
	//   77  182:ireturn         
		}
	}

	abstract void zzb(Object obj, int i, long l);

	abstract void zzc(Object obj, int i, int j);

	abstract void zzc(Object obj, zzjj zzjj)
		throws IOException;

	abstract void zze(Object obj);

	abstract void zze(Object obj, Object obj1);

	abstract void zzf(Object obj, Object obj1);

	abstract Object zzg(Object obj, Object obj1);

	abstract Object zzhd();

	abstract Object zzm(Object obj);

	abstract int zzp(Object obj);

	abstract Object zzt(Object obj);

	abstract Object zzu(Object obj);

	abstract int zzv(Object obj);
}
