// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzwk, zzuv, zzte, zzxy

abstract class zzxd
{

	zzxd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	abstract void zza(Object obj, int i, long l);

	abstract void zza(Object obj, int i, zzte zzte);

	abstract void zza(Object obj, int i, Object obj1);

	abstract void zza(Object obj, zzxy zzxy)
		throws IOException;

	abstract boolean zza(zzwk zzwk1);

	final boolean zza(Object obj, zzwk zzwk1)
		throws IOException
	{
		int i = zzwk1.getTag();
	//    0    0:aload_2         
	//    1    1:invokeinterface #25  <Method int zzwk.getTag()>
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
			throw zzuv.zzwu();
	//   11   56:invokestatic    #31  <Method zzuw zzuv.zzwu()>
	//   12   59:athrow          

		case 5: // '\005'
			zzc(obj, j, zzwk1.zzuo());
	//   13   60:aload_0         
	//   14   61:aload_1         
	//   15   62:iload           4
	//   16   64:aload_2         
	//   17   65:invokeinterface #34  <Method int zzwk.zzuo()>
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
			for(obj1 = zzyk(); zzwk1.zzvh() != 0x7fffffff && zza(obj1, zzwk1););
	//   23   77:aload_0         
	//   24   78:invokevirtual   #42  <Method Object zzyk()>
	//   25   81:astore          5
	//   26   83:aload_2         
	//   27   84:invokeinterface #45  <Method int zzwk.zzvh()>
	//   28   89:ldc1            #46  <Int 0x7fffffff>
	//   29   91:icmpeq          104
	//   30   94:aload_0         
	//   31   95:aload           5
	//   32   97:aload_2         
	//   33   98:invokevirtual   #48  <Method boolean zza(Object, zzwk)>
	//   34  101:ifne            83
			if((j << 3 | 4) == zzwk1.getTag())
	//*  35  104:iload           4
	//*  36  106:iconst_3        
	//*  37  107:ishl            
	//*  38  108:iconst_4        
	//*  39  109:ior             
	//*  40  110:aload_2         
	//*  41  111:invokeinterface #25  <Method int zzwk.getTag()>
	//*  42  116:icmpne          134
			{
				zza(obj, j, zzaf(obj1));
	//   43  119:aload_0         
	//   44  120:aload_1         
	//   45  121:iload           4
	//   46  123:aload_0         
	//   47  124:aload           5
	//   48  126:invokevirtual   #52  <Method Object zzaf(Object)>
	//   49  129:invokevirtual   #54  <Method void zza(Object, int, Object)>
				return true;
	//   50  132:iconst_1        
	//   51  133:ireturn         
			} else
			{
				throw zzuv.zzwt();
	//   52  134:invokestatic    #58  <Method zzuv zzuv.zzwt()>
	//   53  137:athrow          
			}

		case 2: // '\002'
			zza(obj, j, zzwk1.zzur());
	//   54  138:aload_0         
	//   55  139:aload_1         
	//   56  140:iload           4
	//   57  142:aload_2         
	//   58  143:invokeinterface #62  <Method zzte zzwk.zzur()>
	//   59  148:invokevirtual   #64  <Method void zza(Object, int, zzte)>
			return true;
	//   60  151:iconst_1        
	//   61  152:ireturn         

		case 1: // '\001'
			zzb(obj, j, zzwk1.zzun());
	//   62  153:aload_0         
	//   63  154:aload_1         
	//   64  155:iload           4
	//   65  157:aload_2         
	//   66  158:invokeinterface #68  <Method long zzwk.zzun()>
	//   67  163:invokevirtual   #71  <Method void zzb(Object, int, long)>
			return true;
	//   68  166:iconst_1        
	//   69  167:ireturn         

		case 0: // '\0'
			zza(obj, j, zzwk1.zzul());
	//   70  168:aload_0         
	//   71  169:aload_1         
	//   72  170:iload           4
	//   73  172:aload_2         
	//   74  173:invokeinterface #74  <Method long zzwk.zzul()>
	//   75  178:invokevirtual   #76  <Method void zza(Object, int, long)>
			return true;
	//   76  181:iconst_1        
	//   77  182:ireturn         
		}
	}

	abstract Object zzaf(Object obj);

	abstract int zzai(Object obj);

	abstract Object zzal(Object obj);

	abstract Object zzam(Object obj);

	abstract int zzan(Object obj);

	abstract void zzb(Object obj, int i, long l);

	abstract void zzc(Object obj, int i, int j);

	abstract void zzc(Object obj, zzxy zzxy)
		throws IOException;

	abstract void zzf(Object obj, Object obj1);

	abstract void zzg(Object obj, Object obj1);

	abstract Object zzh(Object obj, Object obj1);

	abstract void zzy(Object obj);

	abstract Object zzyk();
}
