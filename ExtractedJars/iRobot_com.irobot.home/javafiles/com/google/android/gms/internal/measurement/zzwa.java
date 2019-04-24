// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

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
		zzcbg = zzxd1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field zzxd zzcbg>
		zzcax = zzuc1.zze(zzvv1);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #30  <Method boolean zzuc.zze(zzvv)>
	//    9   15:putfield        #32  <Field boolean zzcax>
		zzcbh = zzuc1;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #34  <Field zzuc zzcbh>
		zzcaw = zzvv1;
	//   13   23:aload_0         
	//   14   24:aload_3         
	//   15   25:putfield        #36  <Field zzvv zzcaw>
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
		if(!zzcbg.zzal(obj).equals(zzcbg.zzal(obj1)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field zzxd zzcbg>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #52  <Method Object zzxd.zzal(Object)>
	//*   4    8:aload_0         
	//*   5    9:getfield        #24  <Field zzxd zzcbg>
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #52  <Method Object zzxd.zzal(Object)>
	//*   8   16:invokevirtual   #55  <Method boolean Object.equals(Object)>
	//*   9   19:ifne            24
			return false;
	//   10   22:iconst_0        
	//   11   23:ireturn         
		if(zzcax)
	//*  12   24:aload_0         
	//*  13   25:getfield        #32  <Field boolean zzcax>
	//*  14   28:ifeq            51
			return zzcbh.zzw(obj).equals(((Object) (zzcbh.zzw(obj1))));
	//   15   31:aload_0         
	//   16   32:getfield        #34  <Field zzuc zzcbh>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #59  <Method zzuf zzuc.zzw(Object)>
	//   19   39:aload_0         
	//   20   40:getfield        #34  <Field zzuc zzcbh>
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
		int j = zzcbg.zzal(obj).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzxd zzcbg>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method Object zzxd.zzal(Object)>
	//    4    8:invokevirtual   #68  <Method int Object.hashCode()>
	//    5   11:istore_3        
		int i = j;
	//    6   12:iload_3         
	//    7   13:istore_2        
		if(zzcax)
	//*   8   14:aload_0         
	//*   9   15:getfield        #32  <Field boolean zzcax>
	//*  10   18:ifeq            38
			i = j * 53 + zzcbh.zzw(obj).hashCode();
	//   11   21:iload_3         
	//   12   22:bipush          53
	//   13   24:imul            
	//   14   25:aload_0         
	//   15   26:getfield        #34  <Field zzuc zzcbh>
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
		return ((Object) (zzcaw.zzwi().zzwn()));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field zzvv zzcaw>
	//    2    4:invokeinterface #78  <Method zzvw zzvv.zzwi()>
	//    3    9:invokeinterface #84  <Method zzvv zzvw.zzwn()>
	//    4   14:areturn         
	}

	public final void zza(Object obj, zzwk zzwk1, zzub zzub)
	{
		zzxd zzxd1;
		Object obj3;
		zzuc zzuc1;
		zzuf zzuf1;
		zzxd1 = zzcbg;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzxd zzcbg>
	//    2    4:astore          9
		zzuc1 = zzcbh;
	//    3    6:aload_0         
	//    4    7:getfield        #34  <Field zzuc zzcbh>
	//    5   10:astore          11
		obj3 = zzxd1.zzam(obj);
	//    6   12:aload           9
	//    7   14:aload_1         
	//    8   15:invokevirtual   #89  <Method Object zzxd.zzam(Object)>
	//    9   18:astore          10
		zzuf1 = zzuc1.zzx(obj);
	//   10   20:aload           11
	//   11   22:aload_1         
	//   12   23:invokevirtual   #92  <Method zzuf zzuc.zzx(Object)>
	//   13   26:astore          12
_L15:
		int i = zzwk1.zzvh();
	//   14   28:aload_2         
	//   15   29:invokeinterface #97  <Method int zzwk.zzvh()>
	//   16   34:istore          4
		if(i == 0x7fffffff)
	//*  17   36:iload           4
	//*  18   38:ldc1            #98  <Int 0x7fffffff>
	//*  19   40:icmpne          52
		{
			zzxd1.zzg(obj, obj3);
	//   20   43:aload           9
	//   21   45:aload_1         
	//   22   46:aload           10
	//   23   48:invokevirtual   #102 <Method void zzxd.zzg(Object, Object)>
			return;
	//   24   51:return          
		}
		i = zzwk1.getTag();
	//   25   52:aload_2         
	//   26   53:invokeinterface #105 <Method int zzwk.getTag()>
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
		Object obj1 = zzuc1.zza(zzub, zzcaw, i >>> 3);
	//   36   76:aload           11
	//   37   78:aload_3         
	//   38   79:aload_0         
	//   39   80:getfield        #36  <Field zzvv zzcaw>
	//   40   83:iload           4
	//   41   85:iconst_3        
	//   42   86:iushr           
	//   43   87:invokevirtual   #108 <Method Object zzuc.zza(zzub, zzvv, int)>
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
	//   52  105:invokevirtual   #111 <Method void zzuc.zza(zzwk, Object, zzub, zzuf)>
		  goto _L5
	//*  53  108:goto            283
_L4:
		boolean flag;
		flag = zzxd1.zza(obj3, zzwk1);
	//   54  111:aload           9
	//   55  113:aload           10
	//   56  115:aload_2         
	//   57  116:invokevirtual   #114 <Method boolean zzxd.zza(Object, zzwk)>
	//   58  119:istore          6
		continue; /* Loop/switch isn't completed */
	//   59  121:goto            286
_L2:
		flag = zzwk1.zzvi();
	//   60  124:aload_2         
	//   61  125:invokeinterface #118 <Method boolean zzwk.zzvi()>
	//   62  130:istore          6
		continue; /* Loop/switch isn't completed */
	//   63  132:goto            286
_L8:
		if(zzwk1.zzvh() == 0x7fffffff) goto _L7; else goto _L6
	//   64  135:aload_2         
	//   65  136:invokeinterface #97  <Method int zzwk.zzvh()>
	//   66  141:ldc1            #98  <Int 0x7fffffff>
	//   67  143:icmpeq          232
_L6:
		int j = zzwk1.getTag();
	//   68  146:aload_2         
	//   69  147:invokeinterface #105 <Method int zzwk.getTag()>
	//   70  152:istore          5
		if(j != 16)
			break MISSING_BLOCK_LABEL_186;
	//   71  154:iload           5
	//   72  156:bipush          16
	//   73  158:icmpne          186
		Object obj2;
		i = zzwk1.zzus();
	//   74  161:aload_2         
	//   75  162:invokeinterface #121 <Method int zzwk.zzus()>
	//   76  167:istore          4
		obj2 = zzuc1.zza(zzub, zzcaw, i);
	//   77  169:aload           11
	//   78  171:aload_3         
	//   79  172:aload_0         
	//   80  173:getfield        #36  <Field zzvv zzcaw>
	//   81  176:iload           4
	//   82  178:invokevirtual   #108 <Method Object zzuc.zza(zzub, zzvv, int)>
	//   83  181:astore          8
		  goto _L8
	//*  84  183:goto            135
		if(j != 26) goto _L10; else goto _L9
	//   85  186:iload           5
	//   86  188:bipush          26
	//   87  190:icmpne          223
_L9:
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_212;
	//   88  193:aload           8
	//   89  195:ifnull          212
		zzuc1.zza(zzwk1, obj2, zzub, zzuf1);
	//   90  198:aload           11
	//   91  200:aload_2         
	//   92  201:aload           8
	//   93  203:aload_3         
	//   94  204:aload           12
	//   95  206:invokevirtual   #111 <Method void zzuc.zza(zzwk, Object, zzub, zzuf)>
		  goto _L8
	//*  96  209:goto            135
		obj1 = ((Object) (zzwk1.zzur()));
	//   97  212:aload_2         
	//   98  213:invokeinterface #125 <Method zzte zzwk.zzur()>
	//   99  218:astore          7
		  goto _L8
	//* 100  220:goto            135
_L10:
		if(zzwk1.zzvi()) goto _L8; else goto _L7
	//  101  223:aload_2         
	//  102  224:invokeinterface #118 <Method boolean zzwk.zzvi()>
	//  103  229:ifne            135
_L7:
		if(zzwk1.getTag() != 12)
	//* 104  232:aload_2         
	//* 105  233:invokeinterface #105 <Method int zzwk.getTag()>
	//* 106  238:bipush          12
	//* 107  240:icmpeq          247
			throw zzuv.zzwt();
	//  108  243:invokestatic    #131 <Method zzuv zzuv.zzwt()>
	//  109  246:athrow          
		if(obj1 == null) goto _L5; else goto _L11
	//  110  247:aload           7
	//  111  249:ifnull          283
_L11:
		if(obj2 == null) goto _L13; else goto _L12
	//  112  252:aload           8
	//  113  254:ifnull          272
_L12:
		zzuc1.zza(((zzte) (obj1)), obj2, zzub, zzuf1);
	//  114  257:aload           11
	//  115  259:aload           7
	//  116  261:aload           8
	//  117  263:aload_3         
	//  118  264:aload           12
	//  119  266:invokevirtual   #134 <Method void zzuc.zza(zzte, Object, zzub, zzuf)>
		  goto _L5
	//* 120  269:goto            283
_L13:
		zzxd1.zza(obj3, i, ((zzte) (obj1)));
	//  121  272:aload           9
	//  122  274:aload           10
	//  123  276:iload           4
	//  124  278:aload           7
	//  125  280:invokevirtual   #137 <Method void zzxd.zza(Object, int, zzte)>
_L5:
		flag = true;
	//  126  283:iconst_1        
	//  127  284:istore          6
		if(flag) goto _L15; else goto _L14
	//  128  286:iload           6
	//  129  288:ifne            28
_L14:
		zzxd1.zzg(obj, obj3);
	//  130  291:aload           9
	//  131  293:aload_1         
	//  132  294:aload           10
	//  133  296:invokevirtual   #102 <Method void zzxd.zzg(Object, Object)>
		return;
	//  134  299:return          
		zzwk1;
	//  135  300:astore_2        
		zzxd1.zzg(obj, obj3);
	//  136  301:aload           9
	//  137  303:aload_1         
	//  138  304:aload           10
	//  139  306:invokevirtual   #102 <Method void zzxd.zzg(Object, Object)>
		throw zzwk1;
	//  140  309:aload_2         
	//  141  310:athrow          
		obj2 = null;
	//  142  311:aconst_null     
	//  143  312:astore          8
		obj1 = null;
	//  144  314:aconst_null     
	//  145  315:astore          7
		i = 0;
	//  146  317:iconst_0        
	//  147  318:istore          4
		  goto _L8
	//* 148  320:goto            135
	}

	public final void zza(Object obj, zzxy zzxy1)
	{
		for(Iterator iterator = zzcbh.zzw(obj).iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field zzuc zzcbh>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #59  <Method zzuf zzuc.zzw(Object)>
	//*   4    8:invokevirtual   #143 <Method Iterator zzuf.iterator()>
	//*   5   11:astore          5
	//*   6   13:aload           5
	//*   7   15:invokeinterface #148 <Method boolean Iterator.hasNext()>
	//*   8   20:ifeq            154
		{
			Object obj1 = ((Object) ((java.util.Map.Entry)iterator.next()));
	//    9   23:aload           5
	//   10   25:invokeinterface #151 <Method Object Iterator.next()>
	//   11   30:checkcast       #153 <Class java.util.Map$Entry>
	//   12   33:astore          4
			zzuh zzuh1 = (zzuh)((java.util.Map.Entry) (obj1)).getKey();
	//   13   35:aload           4
	//   14   37:invokeinterface #156 <Method Object java.util.Map$Entry.getKey()>
	//   15   42:checkcast       #158 <Class zzuh>
	//   16   45:astore          6
			if(zzuh1.zzwa() == zzxx.zzcem && !zzuh1.zzwb() && !zzuh1.zzwc())
	//*  17   47:aload           6
	//*  18   49:invokeinterface #162 <Method zzxx zzuh.zzwa()>
	//*  19   54:getstatic       #168 <Field zzxx zzxx.zzcem>
	//*  20   57:if_acmpne       144
	//*  21   60:aload           6
	//*  22   62:invokeinterface #171 <Method boolean zzuh.zzwb()>
	//*  23   67:ifne            144
	//*  24   70:aload           6
	//*  25   72:invokeinterface #174 <Method boolean zzuh.zzwc()>
	//*  26   77:ifeq            83
	//*  27   80:goto            144
			{
				int i;
				if(obj1 instanceof zzva)
	//*  28   83:aload           4
	//*  29   85:instanceof      #176 <Class zzva>
	//*  30   88:ifeq            124
				{
					i = zzuh1.zzc();
	//   31   91:aload           6
	//   32   93:invokeinterface #179 <Method int zzuh.zzc()>
	//   33   98:istore_3        
					obj1 = ((Object) (((zzvc) (((zzva)obj1).zzxa())).zztw()));
	//   34   99:aload           4
	//   35  101:checkcast       #176 <Class zzva>
	//   36  104:invokevirtual   #183 <Method zzuy zzva.zzxa()>
	//   37  107:invokevirtual   #188 <Method zzte zzvc.zztw()>
	//   38  110:astore          4
				} else
	//*  39  112:aload_2         
	//*  40  113:iload_3         
	//*  41  114:aload           4
	//*  42  116:invokeinterface #193 <Method void zzxy.zza(int, Object)>
	//*  43  121:goto            13
				{
					i = zzuh1.zzc();
	//   44  124:aload           6
	//   45  126:invokeinterface #179 <Method int zzuh.zzc()>
	//   46  131:istore_3        
					obj1 = ((java.util.Map.Entry) (obj1)).getValue();
	//   47  132:aload           4
	//   48  134:invokeinterface #196 <Method Object java.util.Map$Entry.getValue()>
	//   49  139:astore          4
				}
				zzxy1.zza(i, obj1);
			} else
	//*  50  141:goto            112
			{
				throw new IllegalStateException("Found invalid MessageSet item.");
	//   51  144:new             #198 <Class IllegalStateException>
	//   52  147:dup             
	//   53  148:ldc1            #200 <String "Found invalid MessageSet item.">
	//   54  150:invokespecial   #203 <Method void IllegalStateException(String)>
	//   55  153:athrow          
			}
		}

		zzxd zzxd1 = zzcbg;
	//   56  154:aload_0         
	//   57  155:getfield        #24  <Field zzxd zzcbg>
	//   58  158:astore          4
		zzxd1.zzc(zzxd1.zzal(obj), zzxy1);
	//   59  160:aload           4
	//   60  162:aload           4
	//   61  164:aload_1         
	//   62  165:invokevirtual   #52  <Method Object zzxd.zzal(Object)>
	//   63  168:aload_2         
	//   64  169:invokevirtual   #205 <Method void zzxd.zzc(Object, zzxy)>
	//   65  172:return          
	}

	public final int zzai(Object obj)
	{
		zzxd zzxd1 = zzcbg;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzxd zzcbg>
	//    2    4:astore          4
		int j = zzxd1.zzan(zzxd1.zzal(obj)) + 0;
	//    3    6:aload           4
	//    4    8:aload           4
	//    5   10:aload_1         
	//    6   11:invokevirtual   #52  <Method Object zzxd.zzal(Object)>
	//    7   14:invokevirtual   #210 <Method int zzxd.zzan(Object)>
	//    8   17:iconst_0        
	//    9   18:iadd            
	//   10   19:istore_3        
		int i = j;
	//   11   20:iload_3         
	//   12   21:istore_2        
		if(zzcax)
	//*  13   22:aload_0         
	//*  14   23:getfield        #32  <Field boolean zzcax>
	//*  15   26:ifeq            43
			i = j + zzcbh.zzw(obj).zzvy();
	//   16   29:iload_3         
	//   17   30:aload_0         
	//   18   31:getfield        #34  <Field zzuc zzcbh>
	//   19   34:aload_1         
	//   20   35:invokevirtual   #59  <Method zzuf zzuc.zzw(Object)>
	//   21   38:invokevirtual   #213 <Method int zzuf.zzvy()>
	//   22   41:iadd            
	//   23   42:istore_2        
		return i;
	//   24   43:iload_2         
	//   25   44:ireturn         
	}

	public final boolean zzaj(Object obj)
	{
		return zzcbh.zzw(obj).isInitialized();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field zzuc zzcbh>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #59  <Method zzuf zzuc.zzw(Object)>
	//    4    8:invokevirtual   #217 <Method boolean zzuf.isInitialized()>
	//    5   11:ireturn         
	}

	public final void zzd(Object obj, Object obj1)
	{
		zzwn.zza(zzcbg, obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzxd zzcbg>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #224 <Method void zzwn.zza(zzxd, Object, Object)>
		if(zzcax)
	//*   5    9:aload_0         
	//*   6   10:getfield        #32  <Field boolean zzcax>
	//*   7   13:ifeq            25
			zzwn.zza(zzcbh, obj, obj1);
	//    8   16:aload_0         
	//    9   17:getfield        #34  <Field zzuc zzcbh>
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokestatic    #227 <Method void zzwn.zza(zzuc, Object, Object)>
	//   13   25:return          
	}

	public final void zzy(Object obj)
	{
		zzcbg.zzy(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzxd zzcbg>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #232 <Method void zzxd.zzy(Object)>
		zzcbh.zzy(obj);
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field zzuc zzcbh>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #233 <Method void zzuc.zzy(Object)>
	//    8   16:return          
	}

	private final zzvv zzcaw;
	private final boolean zzcax;
	private final zzxd zzcbg;
	private final zzuc zzcbh;
}
