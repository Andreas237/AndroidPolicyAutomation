// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzwl, zzuc, zzxd, zzuf, 
//			zzvv, zzvw, zzwk, zzuv, 
//			zzuh, zzxx, zzva, zzvc, 
//			zzxy, zzwn, zzub

final class zzwa
	implements zzwl
{

	private zzwa(zzxd zzxd1, zzuc zzuc1, zzvv zzvv1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzcbe = zzxd1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field zzxd zzcbe>
		zzcav = zzuc1.zze(zzvv1);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #30  <Method boolean zzuc.zze(zzvv)>
	//    9   15:putfield        #32  <Field boolean zzcav>
		zzcbf = zzuc1;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #34  <Field zzuc zzcbf>
		zzcau = zzvv1;
	//   13   23:aload_0         
	//   14   24:aload_3         
	//   15   25:putfield        #36  <Field zzvv zzcau>
	//   16   28:return          
	}

	static zzwa zza(zzxd zzxd1, zzuc zzuc1, zzvv zzvv1)
	{
		return new zzwa(zzxd1, zzuc1, zzvv1);
	//    0    0:new             #2   <Class zzwa>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #43  <Method void zzwa(zzxd, zzuc, zzvv)>
	//    6   10:areturn         
	}

	public final boolean equals(Object obj, Object obj1)
	{
		if(!zzcbe.zzal(obj).equals(zzcbe.zzal(obj1)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field zzxd zzcbe>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #52  <Method Object zzxd.zzal(Object)>
	//*   4    8:aload_0         
	//*   5    9:getfield        #24  <Field zzxd zzcbe>
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #52  <Method Object zzxd.zzal(Object)>
	//*   8   16:invokevirtual   #55  <Method boolean Object.equals(Object)>
	//*   9   19:ifne            24
			return false;
	//   10   22:iconst_0        
	//   11   23:ireturn         
		if(zzcav)
	//*  12   24:aload_0         
	//*  13   25:getfield        #32  <Field boolean zzcav>
	//*  14   28:ifeq            51
			return zzcbf.zzw(obj).equals(((Object) (zzcbf.zzw(obj1))));
	//   15   31:aload_0         
	//   16   32:getfield        #34  <Field zzuc zzcbf>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #59  <Method zzuf zzuc.zzw(Object)>
	//   19   39:aload_0         
	//   20   40:getfield        #34  <Field zzuc zzcbf>
	//   21   43:aload_2         
	//   22   44:invokevirtual   #59  <Method zzuf zzuc.zzw(Object)>
	//   23   47:invokevirtual   #62  <Method boolean zzuf.equals(Object)>
	//   24   50:ireturn         
		else
			return true;
	//   25   51:iconst_1        
	//   26   52:ireturn         
	}

	public final int hashCode(Object obj)
	{
		int j = zzcbe.zzal(obj).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzxd zzcbe>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method Object zzxd.zzal(Object)>
	//    4    8:invokevirtual   #68  <Method int Object.hashCode()>
	//    5   11:istore_3        
		int i = j;
	//    6   12:iload_3         
	//    7   13:istore_2        
		if(zzcav)
	//*   8   14:aload_0         
	//*   9   15:getfield        #32  <Field boolean zzcav>
	//*  10   18:ifeq            38
			i = j * 53 + zzcbf.zzw(obj).hashCode();
	//   11   21:iload_3         
	//   12   22:bipush          53
	//   13   24:imul            
	//   14   25:aload_0         
	//   15   26:getfield        #34  <Field zzuc zzcbf>
	//   16   29:aload_1         
	//   17   30:invokevirtual   #59  <Method zzuf zzuc.zzw(Object)>
	//   18   33:invokevirtual   #69  <Method int zzuf.hashCode()>
	//   19   36:iadd            
	//   20   37:istore_2        
		return i;
	//   21   38:iload_2         
	//   22   39:ireturn         
	}

	public final Object newInstance()
	{
		return ((Object) (zzcau.zzwi().zzwn()));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field zzvv zzcau>
	//    2    4:invokeinterface #78  <Method zzvw zzvv.zzwi()>
	//    3    9:invokeinterface #84  <Method zzvv zzvw.zzwn()>
	//    4   14:areturn         
	}

	public final void zza(Object obj, zzwk zzwk1, zzub zzub)
		throws IOException
	{
		zzxd zzxd1;
		Object obj2;
		zzuc zzuc1;
		zzuf zzuf1;
		zzxd1 = zzcbe;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzxd zzcbe>
	//    2    4:astore          9
		zzuc1 = zzcbf;
	//    3    6:aload_0         
	//    4    7:getfield        #34  <Field zzuc zzcbf>
	//    5   10:astore          11
		obj2 = zzxd1.zzam(obj);
	//    6   12:aload           9
	//    7   14:aload_1         
	//    8   15:invokevirtual   #91  <Method Object zzxd.zzam(Object)>
	//    9   18:astore          10
		zzuf1 = zzuc1.zzx(obj);
	//   10   20:aload           11
	//   11   22:aload_1         
	//   12   23:invokevirtual   #94  <Method zzuf zzuc.zzx(Object)>
	//   13   26:astore          12
_L17:
		int i = zzwk1.zzvh();
	//   14   28:aload_2         
	//   15   29:invokeinterface #99  <Method int zzwk.zzvh()>
	//   16   34:istore          4
		if(i == 0x7fffffff)
	//*  17   36:iload           4
	//*  18   38:ldc1            #100 <Int 0x7fffffff>
	//*  19   40:icmpne          52
		{
			zzxd1.zzg(obj, obj2);
	//   20   43:aload           9
	//   21   45:aload_1         
	//   22   46:aload           10
	//   23   48:invokevirtual   #104 <Method void zzxd.zzg(Object, Object)>
			return;
	//   24   51:return          
		}
		i = zzwk1.getTag();
	//   25   52:aload_2         
	//   26   53:invokeinterface #107 <Method int zzwk.getTag()>
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
		Object obj1 = zzuc1.zza(zzub, zzcau, i >>> 3);
	//   36   76:aload           11
	//   37   78:aload_3         
	//   38   79:aload_0         
	//   39   80:getfield        #36  <Field zzvv zzcau>
	//   40   83:iload           4
	//   41   85:iconst_3        
	//   42   86:iushr           
	//   43   87:invokevirtual   #110 <Method Object zzuc.zza(zzub, zzvv, int)>
	//   44   90:astore          7
		if(obj1 == null) goto _L4; else goto _L3
	//   45   92:aload           7
	//   46   94:ifnull          111
_L3:
		zzuc1.zza(zzwk1, obj1, zzub, zzuf1);
	//   47   97:aload           11
	//   48   99:aload_2         
	//   49  100:aload           7
	//   50  102:aload_3         
	//   51  103:aload           12
	//   52  105:invokevirtual   #113 <Method void zzuc.zza(zzwk, Object, zzub, zzuf)>
		  goto _L5
	//*  53  108:goto            279
_L4:
		boolean flag;
		flag = zzxd1.zza(obj2, zzwk1);
	//   54  111:aload           9
	//   55  113:aload           10
	//   56  115:aload_2         
	//   57  116:invokevirtual   #116 <Method boolean zzxd.zza(Object, zzwk)>
	//   58  119:istore          6
		continue; /* Loop/switch isn't completed */
	//   59  121:goto            282
_L2:
		flag = zzwk1.zzvi();
	//   60  124:aload_2         
	//   61  125:invokeinterface #120 <Method boolean zzwk.zzvi()>
	//   62  130:istore          6
		continue; /* Loop/switch isn't completed */
	//   63  132:goto            282
_L8:
		if(zzwk1.zzvh() == 0x7fffffff) goto _L7; else goto _L6
	//   64  135:aload_2         
	//   65  136:invokeinterface #99  <Method int zzwk.zzvh()>
	//   66  141:ldc1            #100 <Int 0x7fffffff>
	//   67  143:icmpeq          232
_L6:
		int j = zzwk1.getTag();
	//   68  146:aload_2         
	//   69  147:invokeinterface #107 <Method int zzwk.getTag()>
	//   70  152:istore          5
		if(j != 16)
			break MISSING_BLOCK_LABEL_186;
	//   71  154:iload           5
	//   72  156:bipush          16
	//   73  158:icmpne          186
		i = zzwk1.zzus();
	//   74  161:aload_2         
	//   75  162:invokeinterface #123 <Method int zzwk.zzus()>
	//   76  167:istore          4
		obj1 = zzuc1.zza(zzub, zzcau, i);
	//   77  169:aload           11
	//   78  171:aload_3         
	//   79  172:aload_0         
	//   80  173:getfield        #36  <Field zzvv zzcau>
	//   81  176:iload           4
	//   82  178:invokevirtual   #110 <Method Object zzuc.zza(zzub, zzvv, int)>
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
		zzuc1.zza(zzwk1, obj1, zzub, zzuf1);
	//   90  198:aload           11
	//   91  200:aload_2         
	//   92  201:aload           7
	//   93  203:aload_3         
	//   94  204:aload           12
	//   95  206:invokevirtual   #113 <Method void zzuc.zza(zzwk, Object, zzub, zzuf)>
		  goto _L8
	//*  96  209:goto            135
		zzte zzte = zzwk1.zzur();
	//   97  212:aload_2         
	//   98  213:invokeinterface #127 <Method zzte zzwk.zzur()>
	//   99  218:astore          8
		  goto _L8
	//* 100  220:goto            135
_L10:
		if(zzwk1.zzvi()) goto _L8; else goto _L7
	//  101  223:aload_2         
	//  102  224:invokeinterface #120 <Method boolean zzwk.zzvi()>
	//  103  229:ifne            135
_L7:
		if(zzwk1.getTag() != 12) goto _L12; else goto _L11
	//  104  232:aload_2         
	//  105  233:invokeinterface #107 <Method int zzwk.getTag()>
	//  106  238:bipush          12
	//  107  240:icmpne          296
_L11:
		if(zzte == null) goto _L5; else goto _L13
	//  108  243:aload           8
	//  109  245:ifnull          279
_L13:
		if(obj1 == null) goto _L15; else goto _L14
	//  110  248:aload           7
	//  111  250:ifnull          268
_L14:
		zzuc1.zza(zzte, obj1, zzub, zzuf1);
	//  112  253:aload           11
	//  113  255:aload           8
	//  114  257:aload           7
	//  115  259:aload_3         
	//  116  260:aload           12
	//  117  262:invokevirtual   #130 <Method void zzuc.zza(zzte, Object, zzub, zzuf)>
		  goto _L5
	//* 118  265:goto            279
_L15:
		zzxd1.zza(obj2, i, zzte);
	//  119  268:aload           9
	//  120  270:aload           10
	//  121  272:iload           4
	//  122  274:aload           8
	//  123  276:invokevirtual   #133 <Method void zzxd.zza(Object, int, zzte)>
_L5:
		flag = true;
	//  124  279:iconst_1        
	//  125  280:istore          6
		if(flag) goto _L17; else goto _L16
	//  126  282:iload           6
	//  127  284:ifne            28
_L16:
		zzxd1.zzg(obj, obj2);
	//  128  287:aload           9
	//  129  289:aload_1         
	//  130  290:aload           10
	//  131  292:invokevirtual   #104 <Method void zzxd.zzg(Object, Object)>
		return;
	//  132  295:return          
_L12:
		throw zzuv.zzwt();
	//  133  296:invokestatic    #139 <Method zzuv zzuv.zzwt()>
	//  134  299:athrow          
		zzwk1;
	//  135  300:astore_2        
		zzxd1.zzg(obj, obj2);
	//  136  301:aload           9
	//  137  303:aload_1         
	//  138  304:aload           10
	//  139  306:invokevirtual   #104 <Method void zzxd.zzg(Object, Object)>
		throw zzwk1;
	//  140  309:aload_2         
	//  141  310:athrow          
		i = 0;
	//  142  311:iconst_0        
	//  143  312:istore          4
		obj1 = null;
	//  144  314:aconst_null     
	//  145  315:astore          7
		zzte = null;
	//  146  317:aconst_null     
	//  147  318:astore          8
		  goto _L8
	//* 148  320:goto            135
	}

	public final void zza(Object obj, zzxy zzxy1)
		throws IOException
	{
		for(Iterator iterator = zzcbf.zzw(obj).iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field zzuc zzcbf>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #59  <Method zzuf zzuc.zzw(Object)>
	//*   4    8:invokevirtual   #146 <Method Iterator zzuf.iterator()>
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
			zzuh zzuh1 = (zzuh)entry.getKey();
	//   13   32:aload           4
	//   14   34:invokeinterface #159 <Method Object java.util.Map$Entry.getKey()>
	//   15   39:checkcast       #161 <Class zzuh>
	//   16   42:astore          5
			if(zzuh1.zzwa() == zzxx.zzcek && !zzuh1.zzwb() && !zzuh1.zzwc())
	//*  17   44:aload           5
	//*  18   46:invokeinterface #165 <Method zzxx zzuh.zzwa()>
	//*  19   51:getstatic       #171 <Field zzxx zzxx.zzcek>
	//*  20   54:if_acmpne       135
	//*  21   57:aload           5
	//*  22   59:invokeinterface #174 <Method boolean zzuh.zzwb()>
	//*  23   64:ifne            135
	//*  24   67:aload           5
	//*  25   69:invokeinterface #177 <Method boolean zzuh.zzwc()>
	//*  26   74:ifne            135
			{
				if(entry instanceof zzva)
	//*  27   77:aload           4
	//*  28   79:instanceof      #179 <Class zzva>
	//*  29   82:ifeq            112
					zzxy1.zza(zzuh1.zzc(), ((Object) (((zzvc) (((zzva)entry).zzxa())).zztw())));
	//   30   85:aload_2         
	//   31   86:aload           5
	//   32   88:invokeinterface #182 <Method int zzuh.zzc()>
	//   33   93:aload           4
	//   34   95:checkcast       #179 <Class zzva>
	//   35   98:invokevirtual   #186 <Method zzuy zzva.zzxa()>
	//   36  101:invokevirtual   #191 <Method zzte zzvc.zztw()>
	//   37  104:invokeinterface #196 <Method void zzxy.zza(int, Object)>
				else
	//*  38  109:goto            12
					zzxy1.zza(zzuh1.zzc(), entry.getValue());
	//   39  112:aload_2         
	//   40  113:aload           5
	//   41  115:invokeinterface #182 <Method int zzuh.zzc()>
	//   42  120:aload           4
	//   43  122:invokeinterface #199 <Method Object java.util.Map$Entry.getValue()>
	//   44  127:invokeinterface #196 <Method void zzxy.zza(int, Object)>
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

		zzxd zzxd1 = zzcbe;
	//   51  145:aload_0         
	//   52  146:getfield        #24  <Field zzxd zzcbe>
	//   53  149:astore_3        
		zzxd1.zzc(zzxd1.zzal(obj), zzxy1);
	//   54  150:aload_3         
	//   55  151:aload_3         
	//   56  152:aload_1         
	//   57  153:invokevirtual   #52  <Method Object zzxd.zzal(Object)>
	//   58  156:aload_2         
	//   59  157:invokevirtual   #208 <Method void zzxd.zzc(Object, zzxy)>
	//   60  160:return          
	}

	public final int zzai(Object obj)
	{
		zzxd zzxd1 = zzcbe;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzxd zzcbe>
	//    2    4:astore          4
		int j = zzxd1.zzan(zzxd1.zzal(obj)) + 0;
	//    3    6:aload           4
	//    4    8:aload           4
	//    5   10:aload_1         
	//    6   11:invokevirtual   #52  <Method Object zzxd.zzal(Object)>
	//    7   14:invokevirtual   #213 <Method int zzxd.zzan(Object)>
	//    8   17:iconst_0        
	//    9   18:iadd            
	//   10   19:istore_3        
		int i = j;
	//   11   20:iload_3         
	//   12   21:istore_2        
		if(zzcav)
	//*  13   22:aload_0         
	//*  14   23:getfield        #32  <Field boolean zzcav>
	//*  15   26:ifeq            43
			i = j + zzcbf.zzw(obj).zzvy();
	//   16   29:iload_3         
	//   17   30:aload_0         
	//   18   31:getfield        #34  <Field zzuc zzcbf>
	//   19   34:aload_1         
	//   20   35:invokevirtual   #59  <Method zzuf zzuc.zzw(Object)>
	//   21   38:invokevirtual   #216 <Method int zzuf.zzvy()>
	//   22   41:iadd            
	//   23   42:istore_2        
		return i;
	//   24   43:iload_2         
	//   25   44:ireturn         
	}

	public final boolean zzaj(Object obj)
	{
		return zzcbf.zzw(obj).isInitialized();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field zzuc zzcbf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #59  <Method zzuf zzuc.zzw(Object)>
	//    4    8:invokevirtual   #220 <Method boolean zzuf.isInitialized()>
	//    5   11:ireturn         
	}

	public final void zzd(Object obj, Object obj1)
	{
		zzwn.zza(zzcbe, obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzxd zzcbe>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #227 <Method void zzwn.zza(zzxd, Object, Object)>
		if(zzcav)
	//*   5    9:aload_0         
	//*   6   10:getfield        #32  <Field boolean zzcav>
	//*   7   13:ifeq            25
			zzwn.zza(zzcbf, obj, obj1);
	//    8   16:aload_0         
	//    9   17:getfield        #34  <Field zzuc zzcbf>
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokestatic    #230 <Method void zzwn.zza(zzuc, Object, Object)>
	//   13   25:return          
	}

	public final void zzy(Object obj)
	{
		zzcbe.zzy(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzxd zzcbe>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #235 <Method void zzxd.zzy(Object)>
		zzcbf.zzy(obj);
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field zzuc zzcbf>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #236 <Method void zzuc.zzy(Object)>
	//    8   16:return          
	}

	private final zzvv zzcau;
	private final boolean zzcav;
	private final zzxd zzcbe;
	private final zzuc zzcbf;
}
