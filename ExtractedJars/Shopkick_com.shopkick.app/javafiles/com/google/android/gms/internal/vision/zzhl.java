// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzhw, zzfl, zzio, zzfp, 
//			zzhf, zzhg, zzhv, zzgf, 
//			zzfr, zzji, zzgk, zzgm, 
//			zzjj, zzfy, zzip, zzeh, 
//			zzei, zzeo, zzhy, zzfk

final class zzhl
	implements zzhw
{

	private zzhl(zzio zzio1, zzfl zzfl1, zzhf zzhf1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzzr = zzio1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field zzio zzzr>
		zzzi = zzfl1.zze(zzhf1);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #30  <Method boolean zzfl.zze(zzhf)>
	//    9   15:putfield        #32  <Field boolean zzzi>
		zzzs = zzfl1;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #34  <Field zzfl zzzs>
		zzzh = zzhf1;
	//   13   23:aload_0         
	//   14   24:aload_3         
	//   15   25:putfield        #36  <Field zzhf zzzh>
	//   16   28:return          
	}

	static zzhl zza(zzio zzio1, zzfl zzfl1, zzhf zzhf1)
	{
		return new zzhl(zzio1, zzfl1, zzhf1);
	//    0    0:new             #2   <Class zzhl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #43  <Method void zzhl(zzio, zzfl, zzhf)>
	//    6   10:areturn         
	}

	public final boolean equals(Object obj, Object obj1)
	{
		if(!zzzr.zzt(obj).equals(zzzr.zzt(obj1)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field zzio zzzr>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #52  <Method Object zzio.zzt(Object)>
	//*   4    8:aload_0         
	//*   5    9:getfield        #24  <Field zzio zzzr>
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #52  <Method Object zzio.zzt(Object)>
	//*   8   16:invokevirtual   #55  <Method boolean Object.equals(Object)>
	//*   9   19:ifne            24
			return false;
	//   10   22:iconst_0        
	//   11   23:ireturn         
		if(zzzi)
	//*  12   24:aload_0         
	//*  13   25:getfield        #32  <Field boolean zzzi>
	//*  14   28:ifeq            51
			return zzzs.zzc(obj).equals(((Object) (zzzs.zzc(obj1))));
	//   15   31:aload_0         
	//   16   32:getfield        #34  <Field zzfl zzzs>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #59  <Method zzfp zzfl.zzc(Object)>
	//   19   39:aload_0         
	//   20   40:getfield        #34  <Field zzfl zzzs>
	//   21   43:aload_2         
	//   22   44:invokevirtual   #59  <Method zzfp zzfl.zzc(Object)>
	//   23   47:invokevirtual   #62  <Method boolean zzfp.equals(Object)>
	//   24   50:ireturn         
		else
			return true;
	//   25   51:iconst_1        
	//   26   52:ireturn         
	}

	public final int hashCode(Object obj)
	{
		int j = zzzr.zzt(obj).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzio zzzr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method Object zzio.zzt(Object)>
	//    4    8:invokevirtual   #68  <Method int Object.hashCode()>
	//    5   11:istore_3        
		int i = j;
	//    6   12:iload_3         
	//    7   13:istore_2        
		if(zzzi)
	//*   8   14:aload_0         
	//*   9   15:getfield        #32  <Field boolean zzzi>
	//*  10   18:ifeq            38
			i = j * 53 + zzzs.zzc(obj).hashCode();
	//   11   21:iload_3         
	//   12   22:bipush          53
	//   13   24:imul            
	//   14   25:aload_0         
	//   15   26:getfield        #34  <Field zzfl zzzs>
	//   16   29:aload_1         
	//   17   30:invokevirtual   #59  <Method zzfp zzfl.zzc(Object)>
	//   18   33:invokevirtual   #69  <Method int zzfp.hashCode()>
	//   19   36:iadd            
	//   20   37:istore_2        
		return i;
	//   21   38:iload_2         
	//   22   39:ireturn         
	}

	public final Object newInstance()
	{
		return ((Object) (zzzh.zzfa().zzff()));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field zzhf zzzh>
	//    2    4:invokeinterface #78  <Method zzhg zzhf.zzfa()>
	//    3    9:invokeinterface #84  <Method zzhf zzhg.zzff()>
	//    4   14:areturn         
	}

	public final void zza(Object obj, zzhv zzhv1, zzfk zzfk)
		throws IOException
	{
		zzio zzio1;
		Object obj2;
		zzfl zzfl1;
		zzfp zzfp1;
		zzio1 = zzzr;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzio zzzr>
	//    2    4:astore          9
		zzfl1 = zzzs;
	//    3    6:aload_0         
	//    4    7:getfield        #34  <Field zzfl zzzs>
	//    5   10:astore          11
		obj2 = zzio1.zzu(obj);
	//    6   12:aload           9
	//    7   14:aload_1         
	//    8   15:invokevirtual   #91  <Method Object zzio.zzu(Object)>
	//    9   18:astore          10
		zzfp1 = zzfl1.zzd(obj);
	//   10   20:aload           11
	//   11   22:aload_1         
	//   12   23:invokevirtual   #94  <Method zzfp zzfl.zzd(Object)>
	//   13   26:astore          12
_L17:
		int i = zzhv1.zzcn();
	//   14   28:aload_2         
	//   15   29:invokeinterface #99  <Method int zzhv.zzcn()>
	//   16   34:istore          4
		if(i == 0x7fffffff)
	//*  17   36:iload           4
	//*  18   38:ldc1            #100 <Int 0x7fffffff>
	//*  19   40:icmpne          52
		{
			zzio1.zzf(obj, obj2);
	//   20   43:aload           9
	//   21   45:aload_1         
	//   22   46:aload           10
	//   23   48:invokevirtual   #104 <Method void zzio.zzf(Object, Object)>
			return;
	//   24   51:return          
		}
		i = zzhv1.getTag();
	//   25   52:aload_2         
	//   26   53:invokeinterface #107 <Method int zzhv.getTag()>
	//   27   58:istore          4
		if(i == 11)
			break MISSING_BLOCK_LABEL_311;
	//   28   60:iload           4
	//   29   62:bipush          11
	//   30   64:icmpeq          311
		if((i & 7) != 2) goto _L2; else goto _L1
	//   31   67:iload           4
	//   32   69:bipush          7
	//   33   71:iand            
	//   34   72:iconst_2        
	//   35   73:icmpne          124
_L1:
		Object obj1 = zzfl1.zza(zzfk, zzzh, i >>> 3);
	//   36   76:aload           11
	//   37   78:aload_3         
	//   38   79:aload_0         
	//   39   80:getfield        #36  <Field zzhf zzzh>
	//   40   83:iload           4
	//   41   85:iconst_3        
	//   42   86:iushr           
	//   43   87:invokevirtual   #110 <Method Object zzfl.zza(zzfk, zzhf, int)>
	//   44   90:astore          7
		if(obj1 == null) goto _L4; else goto _L3
	//   45   92:aload           7
	//   46   94:ifnull          111
_L3:
		zzfl1.zza(zzhv1, obj1, zzfk, zzfp1);
	//   47   97:aload           11
	//   48   99:aload_2         
	//   49  100:aload           7
	//   50  102:aload_3         
	//   51  103:aload           12
	//   52  105:invokevirtual   #113 <Method void zzfl.zza(zzhv, Object, zzfk, zzfp)>
		  goto _L5
	//*  53  108:goto            279
_L4:
		boolean flag;
		flag = zzio1.zza(obj2, zzhv1);
	//   54  111:aload           9
	//   55  113:aload           10
	//   56  115:aload_2         
	//   57  116:invokevirtual   #116 <Method boolean zzio.zza(Object, zzhv)>
	//   58  119:istore          6
		continue; /* Loop/switch isn't completed */
	//   59  121:goto            282
_L2:
		flag = zzhv1.zzco();
	//   60  124:aload_2         
	//   61  125:invokeinterface #120 <Method boolean zzhv.zzco()>
	//   62  130:istore          6
		continue; /* Loop/switch isn't completed */
	//   63  132:goto            282
_L8:
		if(zzhv1.zzcn() == 0x7fffffff) goto _L7; else goto _L6
	//   64  135:aload_2         
	//   65  136:invokeinterface #99  <Method int zzhv.zzcn()>
	//   66  141:ldc1            #100 <Int 0x7fffffff>
	//   67  143:icmpeq          232
_L6:
		int j = zzhv1.getTag();
	//   68  146:aload_2         
	//   69  147:invokeinterface #107 <Method int zzhv.getTag()>
	//   70  152:istore          5
		if(j != 16)
			break MISSING_BLOCK_LABEL_186;
	//   71  154:iload           5
	//   72  156:bipush          16
	//   73  158:icmpne          186
		i = zzhv1.zzcx();
	//   74  161:aload_2         
	//   75  162:invokeinterface #123 <Method int zzhv.zzcx()>
	//   76  167:istore          4
		obj1 = zzfl1.zza(zzfk, zzzh, i);
	//   77  169:aload           11
	//   78  171:aload_3         
	//   79  172:aload_0         
	//   80  173:getfield        #36  <Field zzhf zzzh>
	//   81  176:iload           4
	//   82  178:invokevirtual   #110 <Method Object zzfl.zza(zzfk, zzhf, int)>
	//   83  181:astore          7
		  goto _L8
	//*  84  183:goto            135
		if(j != 26) goto _L10; else goto _L9
	//   85  186:iload           5
	//   86  188:bipush          26
	//   87  190:icmpne          223
_L9:
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_212;
	//   88  193:aload           7
	//   89  195:ifnull          212
		zzfl1.zza(zzhv1, obj1, zzfk, zzfp1);
	//   90  198:aload           11
	//   91  200:aload_2         
	//   92  201:aload           7
	//   93  203:aload_3         
	//   94  204:aload           12
	//   95  206:invokevirtual   #113 <Method void zzfl.zza(zzhv, Object, zzfk, zzfp)>
		  goto _L8
	//*  96  209:goto            135
		zzeo zzeo1 = zzhv1.zzcw();
	//   97  212:aload_2         
	//   98  213:invokeinterface #127 <Method zzeo zzhv.zzcw()>
	//   99  218:astore          8
		  goto _L8
	//* 100  220:goto            135
_L10:
		if(zzhv1.zzco()) goto _L8; else goto _L7
	//  101  223:aload_2         
	//  102  224:invokeinterface #120 <Method boolean zzhv.zzco()>
	//  103  229:ifne            135
_L7:
		if(zzhv1.getTag() != 12) goto _L12; else goto _L11
	//  104  232:aload_2         
	//  105  233:invokeinterface #107 <Method int zzhv.getTag()>
	//  106  238:bipush          12
	//  107  240:icmpne          296
_L11:
		if(zzeo1 == null) goto _L5; else goto _L13
	//  108  243:aload           8
	//  109  245:ifnull          279
_L13:
		if(obj1 == null) goto _L15; else goto _L14
	//  110  248:aload           7
	//  111  250:ifnull          268
_L14:
		zzfl1.zza(zzeo1, obj1, zzfk, zzfp1);
	//  112  253:aload           11
	//  113  255:aload           8
	//  114  257:aload           7
	//  115  259:aload_3         
	//  116  260:aload           12
	//  117  262:invokevirtual   #130 <Method void zzfl.zza(zzeo, Object, zzfk, zzfp)>
		  goto _L5
	//* 118  265:goto            279
_L15:
		zzio1.zza(obj2, i, zzeo1);
	//  119  268:aload           9
	//  120  270:aload           10
	//  121  272:iload           4
	//  122  274:aload           8
	//  123  276:invokevirtual   #133 <Method void zzio.zza(Object, int, zzeo)>
_L5:
		flag = true;
	//  124  279:iconst_1        
	//  125  280:istore          6
		if(flag) goto _L17; else goto _L16
	//  126  282:iload           6
	//  127  284:ifne            28
_L16:
		zzio1.zzf(obj, obj2);
	//  128  287:aload           9
	//  129  289:aload_1         
	//  130  290:aload           10
	//  131  292:invokevirtual   #104 <Method void zzio.zzf(Object, Object)>
		return;
	//  132  295:return          
_L12:
		throw zzgf.zzfl();
	//  133  296:invokestatic    #139 <Method zzgf zzgf.zzfl()>
	//  134  299:athrow          
		zzhv1;
	//  135  300:astore_2        
		zzio1.zzf(obj, obj2);
	//  136  301:aload           9
	//  137  303:aload_1         
	//  138  304:aload           10
	//  139  306:invokevirtual   #104 <Method void zzio.zzf(Object, Object)>
		throw zzhv1;
	//  140  309:aload_2         
	//  141  310:athrow          
		i = 0;
	//  142  311:iconst_0        
	//  143  312:istore          4
		obj1 = null;
	//  144  314:aconst_null     
	//  145  315:astore          7
		zzeo1 = null;
	//  146  317:aconst_null     
	//  147  318:astore          8
		  goto _L8
	//* 148  320:goto            135
	}

	public final void zza(Object obj, zzjj zzjj1)
		throws IOException
	{
		for(Iterator iterator = zzzs.zzc(obj).iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field zzfl zzzs>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #59  <Method zzfp zzfl.zzc(Object)>
	//*   4    8:invokevirtual   #146 <Method Iterator zzfp.iterator()>
	//*   5   11:astore_3        
	//*   6   12:aload_3         
	//*   7   13:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            145
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//    9   21:aload_3         
	//   10   22:invokeinterface #154 <Method Object Iterator.next()>
	//   11   27:checkcast       #156 <Class java.util.Map$Entry>
	//   12   30:astore          4
			zzfr zzfr1 = (zzfr)entry.getKey();
	//   13   32:aload           4
	//   14   34:invokeinterface #159 <Method Object java.util.Map$Entry.getKey()>
	//   15   39:checkcast       #161 <Class zzfr>
	//   16   42:astore          5
			if(zzfr1.zzet() == zzji.zzacx && !zzfr1.zzeu() && !zzfr1.zzev())
	//*  17   44:aload           5
	//*  18   46:invokeinterface #165 <Method zzji zzfr.zzet()>
	//*  19   51:getstatic       #171 <Field zzji zzji.zzacx>
	//*  20   54:if_acmpne       135
	//*  21   57:aload           5
	//*  22   59:invokeinterface #174 <Method boolean zzfr.zzeu()>
	//*  23   64:ifne            135
	//*  24   67:aload           5
	//*  25   69:invokeinterface #177 <Method boolean zzfr.zzev()>
	//*  26   74:ifne            135
			{
				if(entry instanceof zzgk)
	//*  27   77:aload           4
	//*  28   79:instanceof      #179 <Class zzgk>
	//*  29   82:ifeq            112
					zzjj1.zza(zzfr1.zzr(), ((Object) (((zzgm) (((zzgk)entry).zzfs())).zzce())));
	//   30   85:aload_2         
	//   31   86:aload           5
	//   32   88:invokeinterface #182 <Method int zzfr.zzr()>
	//   33   93:aload           4
	//   34   95:checkcast       #179 <Class zzgk>
	//   35   98:invokevirtual   #186 <Method zzgi zzgk.zzfs()>
	//   36  101:invokevirtual   #191 <Method zzeo zzgm.zzce()>
	//   37  104:invokeinterface #196 <Method void zzjj.zza(int, Object)>
				else
	//*  38  109:goto            12
					zzjj1.zza(zzfr1.zzr(), entry.getValue());
	//   39  112:aload_2         
	//   40  113:aload           5
	//   41  115:invokeinterface #182 <Method int zzfr.zzr()>
	//   42  120:aload           4
	//   43  122:invokeinterface #199 <Method Object java.util.Map$Entry.getValue()>
	//   44  127:invokeinterface #196 <Method void zzjj.zza(int, Object)>
			} else
	//*  45  132:goto            12
			{
				throw new IllegalStateException("Found invalid MessageSet item.");
	//   46  135:new             #201 <Class IllegalStateException>
	//   47  138:dup             
	//   48  139:ldc1            #203 <String "Found invalid MessageSet item.">
	//   49  141:invokespecial   #206 <Method void IllegalStateException(String)>
	//   50  144:athrow          
			}
		}

		zzio zzio1 = zzzr;
	//   51  145:aload_0         
	//   52  146:getfield        #24  <Field zzio zzzr>
	//   53  149:astore_3        
		zzio1.zzc(zzio1.zzt(obj), zzjj1);
	//   54  150:aload_3         
	//   55  151:aload_3         
	//   56  152:aload_1         
	//   57  153:invokevirtual   #52  <Method Object zzio.zzt(Object)>
	//   58  156:aload_2         
	//   59  157:invokevirtual   #208 <Method void zzio.zzc(Object, zzjj)>
	//   60  160:return          
	}

	public final void zza(Object obj, byte abyte0[], int i, int j, zzei zzei1)
		throws IOException
	{
		zzfy zzfy1 = (zzfy)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #212 <Class zzfy>
	//    2    4:astore          9
		obj = ((Object) (zzfy1.zzwj));
	//    3    6:aload           9
	//    4    8:getfield        #216 <Field zzip zzfy.zzwj>
	//    5   11:astore_1        
		if(obj == zzip.zzhe())
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #222 <Method zzip zzip.zzhe()>
	//*   8   16:if_acmpne       32
		{
			obj = ((Object) (zzip.zzhf()));
	//    9   19:invokestatic    #225 <Method zzip zzip.zzhf()>
	//   10   22:astore_1        
			zzfy1.zzwj = ((zzip) (obj));
	//   11   23:aload           9
	//   12   25:aload_1         
	//   13   26:putfield        #216 <Field zzip zzfy.zzwj>
		}
	//*  14   29:goto            32
		while(i < j) 
	//*  15   32:iload_3         
	//*  16   33:iload           4
	//*  17   35:icmpge          265
		{
			i = zzeh.zza(abyte0, i, zzei1);
	//   18   38:aload_2         
	//   19   39:iload_3         
	//   20   40:aload           5
	//   21   42:invokestatic    #230 <Method int zzeh.zza(byte[], int, zzei)>
	//   22   45:istore_3        
			int k = zzei1.zzro;
	//   23   46:aload           5
	//   24   48:getfield        #236 <Field int zzei.zzro>
	//   25   51:istore          6
			if(k != 11)
	//*  26   53:iload           6
	//*  27   55:bipush          11
	//*  28   57:icmpeq          100
			{
				if((k & 7) == 2)
	//*  29   60:iload           6
	//*  30   62:bipush          7
	//*  31   64:iand            
	//*  32   65:iconst_2        
	//*  33   66:icmpne          85
					i = zzeh.zza(k, abyte0, i, j, ((zzip) (obj)), zzei1);
	//   34   69:iload           6
	//   35   71:aload_2         
	//   36   72:iload_3         
	//   37   73:iload           4
	//   38   75:aload_1         
	//   39   76:aload           5
	//   40   78:invokestatic    #239 <Method int zzeh.zza(int, byte[], int, int, zzip, zzei)>
	//   41   81:istore_3        
				else
	//*  42   82:goto            32
					i = zzeh.zza(k, abyte0, i, j, zzei1);
	//   43   85:iload           6
	//   44   87:aload_2         
	//   45   88:iload_3         
	//   46   89:iload           4
	//   47   91:aload           5
	//   48   93:invokestatic    #242 <Method int zzeh.zza(int, byte[], int, int, zzei)>
	//   49   96:istore_3        
			} else
	//*  50   97:goto            32
			{
				int i1 = 0;
	//   51  100:iconst_0        
	//   52  101:istore          7
				zzeo zzeo1 = null;
	//   53  103:aconst_null     
	//   54  104:astore          9
				int l;
				do
				{
					l = i;
	//   55  106:iload_3         
	//   56  107:istore          6
					if(i >= j)
						break;
	//   57  109:iload_3         
	//   58  110:iload           4
	//   59  112:icmpge          242
					i = zzeh.zza(abyte0, i, zzei1);
	//   60  115:aload_2         
	//   61  116:iload_3         
	//   62  117:aload           5
	//   63  119:invokestatic    #230 <Method int zzeh.zza(byte[], int, zzei)>
	//   64  122:istore_3        
					int j1 = zzei1.zzro;
	//   65  123:aload           5
	//   66  125:getfield        #236 <Field int zzei.zzro>
	//   67  128:istore          8
					l = j1 & 7;
	//   68  130:iload           8
	//   69  132:bipush          7
	//   70  134:iand            
	//   71  135:istore          6
					switch(j1 >>> 3)
	//*  72  137:iload           8
	//*  73  139:iconst_3        
	//*  74  140:iushr           
					{
					default:
						break;

	//*  75  141:tableswitch     2 3: default 164
	//	               2 194
	//	               3 167
	//*  76  164:goto            217
					case 3: // '\003'
						if(l == 2)
	//*  77  167:iload           6
	//*  78  169:iconst_2        
	//*  79  170:icmpne          217
						{
							i = zzeh.zze(abyte0, i, zzei1);
	//   80  173:aload_2         
	//   81  174:iload_3         
	//   82  175:aload           5
	//   83  177:invokestatic    #244 <Method int zzeh.zze(byte[], int, zzei)>
	//   84  180:istore_3        
							zzeo1 = (zzeo)zzei1.zzrq;
	//   85  181:aload           5
	//   86  183:getfield        #248 <Field Object zzei.zzrq>
	//   87  186:checkcast       #250 <Class zzeo>
	//   88  189:astore          9
							continue;
	//   89  191:goto            106
						}
						break;

					case 2: // '\002'
						if(l != 0)
							break;
	//   90  194:iload           6
	//   91  196:ifne            217
						i = zzeh.zza(abyte0, i, zzei1);
	//   92  199:aload_2         
	//   93  200:iload_3         
	//   94  201:aload           5
	//   95  203:invokestatic    #230 <Method int zzeh.zza(byte[], int, zzei)>
	//   96  206:istore_3        
						i1 = zzei1.zzro;
	//   97  207:aload           5
	//   98  209:getfield        #236 <Field int zzei.zzro>
	//   99  212:istore          7
						continue;
	//  100  214:goto            106
					}
					l = i;
	//  101  217:iload_3         
	//  102  218:istore          6
					if(j1 == 12)
						break;
	//  103  220:iload           8
	//  104  222:bipush          12
	//  105  224:icmpeq          242
					i = zzeh.zza(j1, abyte0, i, j, zzei1);
	//  106  227:iload           8
	//  107  229:aload_2         
	//  108  230:iload_3         
	//  109  231:iload           4
	//  110  233:aload           5
	//  111  235:invokestatic    #242 <Method int zzeh.zza(int, byte[], int, int, zzei)>
	//  112  238:istore_3        
				} while(true);
	//  113  239:goto            106
				if(zzeo1 != null)
	//* 114  242:aload           9
	//* 115  244:ifnull          259
					((zzip) (obj)).zzb(i1 << 3 | 2, ((Object) (zzeo1)));
	//  116  247:aload_1         
	//  117  248:iload           7
	//  118  250:iconst_3        
	//  119  251:ishl            
	//  120  252:iconst_2        
	//  121  253:ior             
	//  122  254:aload           9
	//  123  256:invokevirtual   #253 <Method void zzip.zzb(int, Object)>
				i = l;
	//  124  259:iload           6
	//  125  261:istore_3        
			}
		}
	//* 126  262:goto            32
		if(i == j)
	//* 127  265:iload_3         
	//* 128  266:iload           4
	//* 129  268:icmpne          272
			return;
	//  130  271:return          
		else
			throw zzgf.zzfo();
	//  131  272:invokestatic    #256 <Method zzgf zzgf.zzfo()>
	//  132  275:athrow          
	}

	public final void zzc(Object obj, Object obj1)
	{
		zzhy.zza(zzzr, obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzio zzzr>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #262 <Method void zzhy.zza(zzio, Object, Object)>
		if(zzzi)
	//*   5    9:aload_0         
	//*   6   10:getfield        #32  <Field boolean zzzi>
	//*   7   13:ifeq            25
			zzhy.zza(zzzs, obj, obj1);
	//    8   16:aload_0         
	//    9   17:getfield        #34  <Field zzfl zzzs>
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokestatic    #265 <Method void zzhy.zza(zzfl, Object, Object)>
	//   13   25:return          
	}

	public final void zze(Object obj)
	{
		zzzr.zze(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzio zzzr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #269 <Method void zzio.zze(Object)>
		zzzs.zze(obj);
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field zzfl zzzs>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #270 <Method void zzfl.zze(Object)>
	//    8   16:return          
	}

	public final int zzp(Object obj)
	{
		zzio zzio1 = zzzr;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzio zzzr>
	//    2    4:astore          4
		int j = zzio1.zzv(zzio1.zzt(obj)) + 0;
	//    3    6:aload           4
	//    4    8:aload           4
	//    5   10:aload_1         
	//    6   11:invokevirtual   #52  <Method Object zzio.zzt(Object)>
	//    7   14:invokevirtual   #275 <Method int zzio.zzv(Object)>
	//    8   17:iconst_0        
	//    9   18:iadd            
	//   10   19:istore_3        
		int i = j;
	//   11   20:iload_3         
	//   12   21:istore_2        
		if(zzzi)
	//*  13   22:aload_0         
	//*  14   23:getfield        #32  <Field boolean zzzi>
	//*  15   26:ifeq            43
			i = j + zzzs.zzc(obj).zzer();
	//   16   29:iload_3         
	//   17   30:aload_0         
	//   18   31:getfield        #34  <Field zzfl zzzs>
	//   19   34:aload_1         
	//   20   35:invokevirtual   #59  <Method zzfp zzfl.zzc(Object)>
	//   21   38:invokevirtual   #278 <Method int zzfp.zzer()>
	//   22   41:iadd            
	//   23   42:istore_2        
		return i;
	//   24   43:iload_2         
	//   25   44:ireturn         
	}

	public final boolean zzr(Object obj)
	{
		return zzzs.zzc(obj).isInitialized();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field zzfl zzzs>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #59  <Method zzfp zzfl.zzc(Object)>
	//    4    8:invokevirtual   #281 <Method boolean zzfp.isInitialized()>
	//    5   11:ireturn         
	}

	private final zzhf zzzh;
	private final boolean zzzi;
	private final zzio zzzr;
	private final zzfl zzzs;
}
