// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzwo, zztv, zzxs, zzvv, 
//			zzuq, zzuy, zzug, zzur, 
//			zzte, zzuh, zzxx, zzwb, 
//			zzvw, zzvb

final class zzuf
{

	private zzuf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzbvi = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #26  <Field boolean zzbvi>
		zzbvh = zzwo.zzbw(16);
	//    5    9:aload_0         
	//    6   10:bipush          16
	//    7   12:invokestatic    #32  <Method zzwo zzwo.zzbw(int)>
	//    8   15:putfield        #34  <Field zzwo zzbvh>
	//    9   18:return          
	}

	private zzuf(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzbvi = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #26  <Field boolean zzbvi>
		zzbvh = zzwo.zzbw(0);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #32  <Method zzwo zzwo.zzbw(int)>
	//    8   14:putfield        #34  <Field zzwo zzbvh>
		zzsw();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #37  <Method void zzsw()>
	//   11   21:return          
	}

	static int zza(zzxs zzxs1, int i, Object obj)
	{
		int j = zztv.zzbd(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #45  <Method int zztv.zzbd(int)>
	//    2    4:istore_3        
		i = j;
	//    3    5:iload_3         
	//    4    6:istore_1        
		if(zzxs1 == zzxs.zzcdq)
	//*   5    7:aload_0         
	//*   6    8:getstatic       #51  <Field zzxs zzxs.zzcdq>
	//*   7   11:if_acmpne       26
		{
			zzuq.zzf((zzvv)obj);
	//    8   14:aload_2         
	//    9   15:checkcast       #53  <Class zzvv>
	//   10   18:invokestatic    #59  <Method boolean zzuq.zzf(zzvv)>
	//   11   21:pop             
			i = j << 1;
	//   12   22:iload_3         
	//   13   23:iconst_1        
	//   14   24:ishl            
	//   15   25:istore_1        
		}
		return i + zzb(zzxs1, obj);
	//   16   26:iload_1         
	//   17   27:aload_0         
	//   18   28:aload_2         
	//   19   29:invokestatic    #63  <Method int zzb(zzxs, Object)>
	//   20   32:iadd            
	//   21   33:ireturn         
	}

	private final Object zza(zzuh zzuh1)
	{
		zzuh1 = ((zzuh) (zzbvh.get(((Object) (zzuh1)))));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field zzwo zzbvh>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #68  <Method Object zzwo.get(Object)>
	//    4    8:astore_1        
		if(zzuh1 instanceof zzuy)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #70  <Class zzuy>
	//*   7   13:ifeq            20
			return ((Object) (zzuy.zzwz()));
	//    8   16:invokestatic    #74  <Method zzvv zzuy.zzwz()>
	//    9   19:areturn         
		else
			return ((Object) (zzuh1));
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	static void zza(zztv zztv1, zzxs zzxs1, int i, Object obj)
		throws IOException
	{
		if(zzxs1 == zzxs.zzcdq)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #51  <Field zzxs zzxs.zzcdq>
	//*   2    4:if_acmpne       37
		{
			zzxs1 = ((zzxs) ((zzvv)obj));
	//    3    7:aload_3         
	//    4    8:checkcast       #53  <Class zzvv>
	//    5   11:astore_1        
			zzuq.zzf(((zzvv) (zzxs1)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #59  <Method boolean zzuq.zzf(zzvv)>
	//    8   16:pop             
			zztv1.zzc(i, 3);
	//    9   17:aload_0         
	//   10   18:iload_2         
	//   11   19:iconst_3        
	//   12   20:invokevirtual   #83  <Method void zztv.zzc(int, int)>
			((zzvv) (zzxs1)).zzb(zztv1);
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:invokeinterface #86  <Method void zzvv.zzb(zztv)>
			zztv1.zzc(i, 4);
	//   16   30:aload_0         
	//   17   31:iload_2         
	//   18   32:iconst_4        
	//   19   33:invokevirtual   #83  <Method void zztv.zzc(int, int)>
			return;
	//   20   36:return          
		}
		zztv1.zzc(i, zzxs1.zzyw());
	//   21   37:aload_0         
	//   22   38:iload_2         
	//   23   39:aload_1         
	//   24   40:invokevirtual   #90  <Method int zzxs.zzyw()>
	//   25   43:invokevirtual   #83  <Method void zztv.zzc(int, int)>
		switch(zzug.zzbul[zzxs1.ordinal()])
	//*  26   46:getstatic       #96  <Field int[] zzug.zzbul>
	//*  27   49:aload_1         
	//*  28   50:invokevirtual   #99  <Method int zzxs.ordinal()>
	//*  29   53:iaload          
		{
	//*  30   54:tableswitch     1 18: default 140
	//	               1 393
	//	               2 381
	//	               3 369
	//	               4 357
	//	               5 345
	//	               6 333
	//	               7 321
	//	               8 309
	//	               9 298
	//	               10 289
	//	               11 264
	//	               12 234
	//	               13 222
	//	               14 210
	//	               15 198
	//	               16 186
	//	               17 174
	//	               18 141
		default:
			return;
	//   31  140:return          

		case 18: // '\022'
			if(obj instanceof zzur)
	//*  32  141:aload_3         
	//*  33  142:instanceof      #101 <Class zzur>
	//*  34  145:ifeq            162
			{
				zztv1.zzaz(((zzur)obj).zzc());
	//   35  148:aload_0         
	//   36  149:aload_3         
	//   37  150:checkcast       #101 <Class zzur>
	//   38  153:invokeinterface #103 <Method int zzur.zzc()>
	//   39  158:invokevirtual   #107 <Method void zztv.zzaz(int)>
				return;
	//   40  161:return          
			} else
			{
				zztv1.zzaz(((Integer)obj).intValue());
	//   41  162:aload_0         
	//   42  163:aload_3         
	//   43  164:checkcast       #109 <Class Integer>
	//   44  167:invokevirtual   #112 <Method int Integer.intValue()>
	//   45  170:invokevirtual   #107 <Method void zztv.zzaz(int)>
				return;
	//   46  173:return          
			}

		case 17: // '\021'
			zztv1.zzau(((Long)obj).longValue());
	//   47  174:aload_0         
	//   48  175:aload_3         
	//   49  176:checkcast       #114 <Class Long>
	//   50  179:invokevirtual   #118 <Method long Long.longValue()>
	//   51  182:invokevirtual   #122 <Method void zztv.zzau(long)>
			return;
	//   52  185:return          

		case 16: // '\020'
			zztv1.zzbb(((Integer)obj).intValue());
	//   53  186:aload_0         
	//   54  187:aload_3         
	//   55  188:checkcast       #109 <Class Integer>
	//   56  191:invokevirtual   #112 <Method int Integer.intValue()>
	//   57  194:invokevirtual   #125 <Method void zztv.zzbb(int)>
			return;
	//   58  197:return          

		case 15: // '\017'
			zztv1.zzav(((Long)obj).longValue());
	//   59  198:aload_0         
	//   60  199:aload_3         
	//   61  200:checkcast       #114 <Class Long>
	//   62  203:invokevirtual   #118 <Method long Long.longValue()>
	//   63  206:invokevirtual   #128 <Method void zztv.zzav(long)>
			return;
	//   64  209:return          

		case 14: // '\016'
			zztv1.zzbc(((Integer)obj).intValue());
	//   65  210:aload_0         
	//   66  211:aload_3         
	//   67  212:checkcast       #109 <Class Integer>
	//   68  215:invokevirtual   #112 <Method int Integer.intValue()>
	//   69  218:invokevirtual   #131 <Method void zztv.zzbc(int)>
			return;
	//   70  221:return          

		case 13: // '\r'
			zztv1.zzba(((Integer)obj).intValue());
	//   71  222:aload_0         
	//   72  223:aload_3         
	//   73  224:checkcast       #109 <Class Integer>
	//   74  227:invokevirtual   #112 <Method int Integer.intValue()>
	//   75  230:invokevirtual   #134 <Method void zztv.zzba(int)>
			return;
	//   76  233:return          

		case 12: // '\f'
			if(obj instanceof zzte)
	//*  77  234:aload_3         
	//*  78  235:instanceof      #136 <Class zzte>
	//*  79  238:ifeq            250
			{
				zztv1.zza((zzte)obj);
	//   80  241:aload_0         
	//   81  242:aload_3         
	//   82  243:checkcast       #136 <Class zzte>
	//   83  246:invokevirtual   #139 <Method void zztv.zza(zzte)>
				return;
	//   84  249:return          
			} else
			{
				zzxs1 = ((zzxs) ((byte[])obj));
	//   85  250:aload_3         
	//   86  251:checkcast       #141 <Class byte[]>
	//   87  254:astore_1        
				zztv1.zze(((byte []) (zzxs1)), 0, zzxs1.length);
	//   88  255:aload_0         
	//   89  256:aload_1         
	//   90  257:iconst_0        
	//   91  258:aload_1         
	//   92  259:arraylength     
	//   93  260:invokevirtual   #145 <Method void zztv.zze(byte[], int, int)>
				return;
	//   94  263:return          
			}

		case 11: // '\013'
			if(obj instanceof zzte)
	//*  95  264:aload_3         
	//*  96  265:instanceof      #136 <Class zzte>
	//*  97  268:ifeq            280
			{
				zztv1.zza((zzte)obj);
	//   98  271:aload_0         
	//   99  272:aload_3         
	//  100  273:checkcast       #136 <Class zzte>
	//  101  276:invokevirtual   #139 <Method void zztv.zza(zzte)>
				return;
	//  102  279:return          
			} else
			{
				zztv1.zzgb((String)obj);
	//  103  280:aload_0         
	//  104  281:aload_3         
	//  105  282:checkcast       #147 <Class String>
	//  106  285:invokevirtual   #151 <Method void zztv.zzgb(String)>
				return;
	//  107  288:return          
			}

		case 10: // '\n'
			zztv1.zzb((zzvv)obj);
	//  108  289:aload_0         
	//  109  290:aload_3         
	//  110  291:checkcast       #53  <Class zzvv>
	//  111  294:invokevirtual   #154 <Method void zztv.zzb(zzvv)>
			return;
	//  112  297:return          

		case 9: // '\t'
			((zzvv)obj).zzb(zztv1);
	//  113  298:aload_3         
	//  114  299:checkcast       #53  <Class zzvv>
	//  115  302:aload_0         
	//  116  303:invokeinterface #86  <Method void zzvv.zzb(zztv)>
			return;
	//  117  308:return          

		case 8: // '\b'
			zztv1.zzs(((Boolean)obj).booleanValue());
	//  118  309:aload_0         
	//  119  310:aload_3         
	//  120  311:checkcast       #156 <Class Boolean>
	//  121  314:invokevirtual   #160 <Method boolean Boolean.booleanValue()>
	//  122  317:invokevirtual   #163 <Method void zztv.zzs(boolean)>
			return;
	//  123  320:return          

		case 7: // '\007'
			zztv1.zzbc(((Integer)obj).intValue());
	//  124  321:aload_0         
	//  125  322:aload_3         
	//  126  323:checkcast       #109 <Class Integer>
	//  127  326:invokevirtual   #112 <Method int Integer.intValue()>
	//  128  329:invokevirtual   #131 <Method void zztv.zzbc(int)>
			return;
	//  129  332:return          

		case 6: // '\006'
			zztv1.zzav(((Long)obj).longValue());
	//  130  333:aload_0         
	//  131  334:aload_3         
	//  132  335:checkcast       #114 <Class Long>
	//  133  338:invokevirtual   #118 <Method long Long.longValue()>
	//  134  341:invokevirtual   #128 <Method void zztv.zzav(long)>
			return;
	//  135  344:return          

		case 5: // '\005'
			zztv1.zzaz(((Integer)obj).intValue());
	//  136  345:aload_0         
	//  137  346:aload_3         
	//  138  347:checkcast       #109 <Class Integer>
	//  139  350:invokevirtual   #112 <Method int Integer.intValue()>
	//  140  353:invokevirtual   #107 <Method void zztv.zzaz(int)>
			return;
	//  141  356:return          

		case 4: // '\004'
			zztv1.zzat(((Long)obj).longValue());
	//  142  357:aload_0         
	//  143  358:aload_3         
	//  144  359:checkcast       #114 <Class Long>
	//  145  362:invokevirtual   #118 <Method long Long.longValue()>
	//  146  365:invokevirtual   #166 <Method void zztv.zzat(long)>
			return;
	//  147  368:return          

		case 3: // '\003'
			zztv1.zzat(((Long)obj).longValue());
	//  148  369:aload_0         
	//  149  370:aload_3         
	//  150  371:checkcast       #114 <Class Long>
	//  151  374:invokevirtual   #118 <Method long Long.longValue()>
	//  152  377:invokevirtual   #166 <Method void zztv.zzat(long)>
			return;
	//  153  380:return          

		case 2: // '\002'
			zztv1.zza(((Float)obj).floatValue());
	//  154  381:aload_0         
	//  155  382:aload_3         
	//  156  383:checkcast       #168 <Class Float>
	//  157  386:invokevirtual   #172 <Method float Float.floatValue()>
	//  158  389:invokevirtual   #175 <Method void zztv.zza(float)>
			return;
	//  159  392:return          

		case 1: // '\001'
			zztv1.zzb(((Double)obj).doubleValue());
	//  160  393:aload_0         
	//  161  394:aload_3         
	//  162  395:checkcast       #177 <Class Double>
	//  163  398:invokevirtual   #181 <Method double Double.doubleValue()>
	//  164  401:invokevirtual   #184 <Method void zztv.zzb(double)>
			return;
	//  165  404:return          
		}
	}

	private final void zza(zzuh zzuh1, Object obj)
	{
		if(zzuh1.zzwb())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #191 <Method boolean zzuh.zzwb()>
	//*   2    6:ifeq            98
		{
			if(obj instanceof List)
	//*   3    9:aload_2         
	//*   4   10:instanceof      #193 <Class List>
	//*   5   13:ifeq            88
			{
				ArrayList arraylist = new ArrayList();
	//    6   16:new             #195 <Class ArrayList>
	//    7   19:dup             
	//    8   20:invokespecial   #196 <Method void ArrayList()>
	//    9   23:astore          5
				((List) (arraylist)).addAll(((java.util.Collection) ((List)obj)));
	//   10   25:aload           5
	//   11   27:aload_2         
	//   12   28:checkcast       #193 <Class List>
	//   13   31:invokeinterface #200 <Method boolean List.addAll(java.util.Collection)>
	//   14   36:pop             
				obj = ((Object) ((ArrayList)arraylist));
	//   15   37:aload           5
	//   16   39:checkcast       #195 <Class ArrayList>
	//   17   42:astore_2        
				int j = ((ArrayList) (obj)).size();
	//   18   43:aload_2         
	//   19   44:invokevirtual   #203 <Method int ArrayList.size()>
	//   20   47:istore          4
				for(int i = 0; i < j;)
	//*  21   49:iconst_0        
	//*  22   50:istore_3        
	//*  23   51:iload_3         
	//*  24   52:iload           4
	//*  25   54:icmpge          82
				{
					Object obj1 = ((ArrayList) (obj)).get(i);
	//   26   57:aload_2         
	//   27   58:iload_3         
	//   28   59:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   29   62:astore          6
					i++;
	//   30   64:iload_3         
	//   31   65:iconst_1        
	//   32   66:iadd            
	//   33   67:istore_3        
					zza(zzuh1.zzvz(), obj1);
	//   34   68:aload_1         
	//   35   69:invokeinterface #210 <Method zzxs zzuh.zzvz()>
	//   36   74:aload           6
	//   37   76:invokestatic    #213 <Method void zza(zzxs, Object)>
				}

	//*  38   79:goto            51
				obj = ((Object) (arraylist));
	//   39   82:aload           5
	//   40   84:astore_2        
			} else
	//*  41   85:goto            108
			{
				throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
	//   42   88:new             #215 <Class IllegalArgumentException>
	//   43   91:dup             
	//   44   92:ldc1            #217 <String "Wrong object type used with protocol message reflection.">
	//   45   94:invokespecial   #219 <Method void IllegalArgumentException(String)>
	//   46   97:athrow          
			}
		} else
		{
			zza(zzuh1.zzvz(), obj);
	//   47   98:aload_1         
	//   48   99:invokeinterface #210 <Method zzxs zzuh.zzvz()>
	//   49  104:aload_2         
	//   50  105:invokestatic    #213 <Method void zza(zzxs, Object)>
		}
		if(obj instanceof zzuy)
	//*  51  108:aload_2         
	//*  52  109:instanceof      #70  <Class zzuy>
	//*  53  112:ifeq            120
			zzbvi = true;
	//   54  115:aload_0         
	//   55  116:iconst_1        
	//   56  117:putfield        #26  <Field boolean zzbvi>
		zzbvh.zza(((Comparable) (zzuh1)), obj);
	//   57  120:aload_0         
	//   58  121:getfield        #34  <Field zzwo zzbvh>
	//   59  124:aload_1         
	//   60  125:aload_2         
	//   61  126:invokevirtual   #222 <Method Object zzwo.zza(Comparable, Object)>
	//   62  129:pop             
	//   63  130:return          
	}

	private static void zza(zzxs zzxs1, Object obj)
	{
		zzuq.checkNotNull(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #226 <Method Object zzuq.checkNotNull(Object)>
	//    2    4:pop             
		int i = zzug.zzbvk[zzxs1.zzyv().ordinal()];
	//    3    5:getstatic       #229 <Field int[] zzug.zzbvk>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #233 <Method zzxx zzxs.zzyv()>
	//    6   12:invokevirtual   #236 <Method int zzxx.ordinal()>
	//    7   15:iaload          
	//    8   16:istore_2        
		boolean flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_3        
		switch(i)
	//*  11   19:iload_2         
		{
	//*  12   20:tableswitch     1 9: default 72
	//	               1 172
	//	               2 164
	//	               3 156
	//	               4 148
	//	               5 140
	//	               6 132
	//	               7 113
	//	               8 94
	//	               9 75
	//*  13   72:goto            177
		case 9: // '\t'
			if((obj instanceof zzvv) || (obj instanceof zzuy))
	//*  14   75:aload_1         
	//*  15   76:instanceof      #53  <Class zzvv>
	//*  16   79:ifne            89
	//*  17   82:aload_1         
	//*  18   83:instanceof      #70  <Class zzuy>
	//*  19   86:ifeq            177
				flag = true;
	//   20   89:iconst_1        
	//   21   90:istore_3        
			break;

	//*  22   91:goto            177
		case 8: // '\b'
			if((obj instanceof Integer) || (obj instanceof zzur))
	//*  23   94:aload_1         
	//*  24   95:instanceof      #109 <Class Integer>
	//*  25   98:ifne            108
	//*  26  101:aload_1         
	//*  27  102:instanceof      #101 <Class zzur>
	//*  28  105:ifeq            177
				flag = true;
	//   29  108:iconst_1        
	//   30  109:istore_3        
			break;

	//*  31  110:goto            177
		case 7: // '\007'
			if((obj instanceof zzte) || (obj instanceof byte[]))
	//*  32  113:aload_1         
	//*  33  114:instanceof      #136 <Class zzte>
	//*  34  117:ifne            127
	//*  35  120:aload_1         
	//*  36  121:instanceof      #141 <Class byte[]>
	//*  37  124:ifeq            177
				flag = true;
	//   38  127:iconst_1        
	//   39  128:istore_3        
			break;

	//*  40  129:goto            177
		case 6: // '\006'
			flag = obj instanceof String;
	//   41  132:aload_1         
	//   42  133:instanceof      #147 <Class String>
	//   43  136:istore_3        
			break;

	//*  44  137:goto            177
		case 5: // '\005'
			flag = obj instanceof Boolean;
	//   45  140:aload_1         
	//   46  141:instanceof      #156 <Class Boolean>
	//   47  144:istore_3        
			break;

	//*  48  145:goto            177
		case 4: // '\004'
			flag = obj instanceof Double;
	//   49  148:aload_1         
	//   50  149:instanceof      #177 <Class Double>
	//   51  152:istore_3        
			break;

	//*  52  153:goto            177
		case 3: // '\003'
			flag = obj instanceof Float;
	//   53  156:aload_1         
	//   54  157:instanceof      #168 <Class Float>
	//   55  160:istore_3        
			break;

	//*  56  161:goto            177
		case 2: // '\002'
			flag = obj instanceof Long;
	//   57  164:aload_1         
	//   58  165:instanceof      #114 <Class Long>
	//   59  168:istore_3        
			break;

	//*  60  169:goto            177
		case 1: // '\001'
			flag = obj instanceof Integer;
	//   61  172:aload_1         
	//   62  173:instanceof      #109 <Class Integer>
	//   63  176:istore_3        
			break;
		}
		if(flag)
	//*  64  177:iload_3         
	//*  65  178:ifeq            182
			return;
	//   66  181:return          
		else
			throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
	//   67  182:new             #215 <Class IllegalArgumentException>
	//   68  185:dup             
	//   69  186:ldc1            #217 <String "Wrong object type used with protocol message reflection.">
	//   70  188:invokespecial   #219 <Method void IllegalArgumentException(String)>
	//   71  191:athrow          
	}

	private static int zzb(zzuh zzuh1, Object obj)
	{
		zzxs zzxs1 = zzuh1.zzvz();
	//    0    0:aload_0         
	//    1    1:invokeinterface #210 <Method zzxs zzuh.zzvz()>
	//    2    6:astore          6
		int j = zzuh1.zzc();
	//    3    8:aload_0         
	//    4    9:invokeinterface #238 <Method int zzuh.zzc()>
	//    5   14:istore          4
		if(zzuh1.zzwb())
	//*   6   16:aload_0         
	//*   7   17:invokeinterface #191 <Method boolean zzuh.zzwb()>
	//*   8   22:ifeq            133
		{
			boolean flag1 = zzuh1.zzwc();
	//    9   25:aload_0         
	//   10   26:invokeinterface #241 <Method boolean zzuh.zzwc()>
	//   11   31:istore          5
			boolean flag = false;
	//   12   33:iconst_0        
	//   13   34:istore_3        
			int i = 0;
	//   14   35:iconst_0        
	//   15   36:istore_2        
			if(flag1)
	//*  16   37:iload           5
	//*  17   39:ifeq            91
			{
				for(zzuh1 = ((zzuh) (((List)obj).iterator())); ((Iterator) (zzuh1)).hasNext();)
	//*  18   42:aload_1         
	//*  19   43:checkcast       #193 <Class List>
	//*  20   46:invokeinterface #245 <Method Iterator List.iterator()>
	//*  21   51:astore_0        
	//*  22   52:aload_0         
	//*  23   53:invokeinterface #250 <Method boolean Iterator.hasNext()>
	//*  24   58:ifeq            78
					i += zzb(zzxs1, ((Iterator) (zzuh1)).next());
	//   25   61:iload_2         
	//   26   62:aload           6
	//   27   64:aload_0         
	//   28   65:invokeinterface #254 <Method Object Iterator.next()>
	//   29   70:invokestatic    #63  <Method int zzb(zzxs, Object)>
	//   30   73:iadd            
	//   31   74:istore_2        

	//*  32   75:goto            52
				return zztv.zzbd(j) + i + zztv.zzbl(i);
	//   33   78:iload           4
	//   34   80:invokestatic    #45  <Method int zztv.zzbd(int)>
	//   35   83:iload_2         
	//   36   84:iadd            
	//   37   85:iload_2         
	//   38   86:invokestatic    #257 <Method int zztv.zzbl(int)>
	//   39   89:iadd            
	//   40   90:ireturn         
			}
			zzuh1 = ((zzuh) (((List)obj).iterator()));
	//   41   91:aload_1         
	//   42   92:checkcast       #193 <Class List>
	//   43   95:invokeinterface #245 <Method Iterator List.iterator()>
	//   44  100:astore_0        
			for(i = ((int) (flag)); ((Iterator) (zzuh1)).hasNext(); i += zza(zzxs1, j, ((Iterator) (zzuh1)).next()));
	//   45  101:iload_3         
	//   46  102:istore_2        
	//   47  103:aload_0         
	//   48  104:invokeinterface #250 <Method boolean Iterator.hasNext()>
	//   49  109:ifeq            131
	//   50  112:iload_2         
	//   51  113:aload           6
	//   52  115:iload           4
	//   53  117:aload_0         
	//   54  118:invokeinterface #254 <Method Object Iterator.next()>
	//   55  123:invokestatic    #259 <Method int zza(zzxs, int, Object)>
	//   56  126:iadd            
	//   57  127:istore_2        
	//*  58  128:goto            103
			return i;
	//   59  131:iload_2         
	//   60  132:ireturn         
		} else
		{
			return zza(zzxs1, j, obj);
	//   61  133:aload           6
	//   62  135:iload           4
	//   63  137:aload_1         
	//   64  138:invokestatic    #259 <Method int zza(zzxs, int, Object)>
	//   65  141:ireturn         
		}
	}

	private static int zzb(zzxs zzxs1, Object obj)
	{
		switch(zzug.zzbul[zzxs1.ordinal()])
	//*   0    0:getstatic       #96  <Field int[] zzug.zzbul>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #99  <Method int zzxs.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 18: default 96
	//	               1 347
	//	               2 336
	//	               3 325
	//	               4 314
	//	               5 303
	//	               6 292
	//	               7 281
	//	               8 270
	//	               9 262
	//	               10 239
	//	               11 216
	//	               12 193
	//	               13 182
	//	               14 171
	//	               15 160
	//	               16 149
	//	               17 138
	//	               18 107
		default:
			throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
	//    5   96:new             #262 <Class RuntimeException>
	//    6   99:dup             
	//    7  100:ldc2            #264 <String "There is no way to get here, but the compiler thinks otherwise.">
	//    8  103:invokespecial   #265 <Method void RuntimeException(String)>
	//    9  106:athrow          

		case 18: // '\022'
			if(obj instanceof zzur)
	//*  10  107:aload_1         
	//*  11  108:instanceof      #101 <Class zzur>
	//*  12  111:ifeq            127
				return zztv.zzbj(((zzur)obj).zzc());
	//   13  114:aload_1         
	//   14  115:checkcast       #101 <Class zzur>
	//   15  118:invokeinterface #103 <Method int zzur.zzc()>
	//   16  123:invokestatic    #268 <Method int zztv.zzbj(int)>
	//   17  126:ireturn         
			else
				return zztv.zzbj(((Integer)obj).intValue());
	//   18  127:aload_1         
	//   19  128:checkcast       #109 <Class Integer>
	//   20  131:invokevirtual   #112 <Method int Integer.intValue()>
	//   21  134:invokestatic    #268 <Method int zztv.zzbj(int)>
	//   22  137:ireturn         

		case 17: // '\021'
			return zztv.zzay(((Long)obj).longValue());
	//   23  138:aload_1         
	//   24  139:checkcast       #114 <Class Long>
	//   25  142:invokevirtual   #118 <Method long Long.longValue()>
	//   26  145:invokestatic    #272 <Method int zztv.zzay(long)>
	//   27  148:ireturn         

		case 16: // '\020'
			return zztv.zzbg(((Integer)obj).intValue());
	//   28  149:aload_1         
	//   29  150:checkcast       #109 <Class Integer>
	//   30  153:invokevirtual   #112 <Method int Integer.intValue()>
	//   31  156:invokestatic    #275 <Method int zztv.zzbg(int)>
	//   32  159:ireturn         

		case 15: // '\017'
			return zztv.zzba(((Long)obj).longValue());
	//   33  160:aload_1         
	//   34  161:checkcast       #114 <Class Long>
	//   35  164:invokevirtual   #118 <Method long Long.longValue()>
	//   36  167:invokestatic    #277 <Method int zztv.zzba(long)>
	//   37  170:ireturn         

		case 14: // '\016'
			return zztv.zzbi(((Integer)obj).intValue());
	//   38  171:aload_1         
	//   39  172:checkcast       #109 <Class Integer>
	//   40  175:invokevirtual   #112 <Method int Integer.intValue()>
	//   41  178:invokestatic    #280 <Method int zztv.zzbi(int)>
	//   42  181:ireturn         

		case 13: // '\r'
			return zztv.zzbf(((Integer)obj).intValue());
	//   43  182:aload_1         
	//   44  183:checkcast       #109 <Class Integer>
	//   45  186:invokevirtual   #112 <Method int Integer.intValue()>
	//   46  189:invokestatic    #283 <Method int zztv.zzbf(int)>
	//   47  192:ireturn         

		case 12: // '\f'
			if(obj instanceof zzte)
	//*  48  193:aload_1         
	//*  49  194:instanceof      #136 <Class zzte>
	//*  50  197:ifeq            208
				return zztv.zzb((zzte)obj);
	//   51  200:aload_1         
	//   52  201:checkcast       #136 <Class zzte>
	//   53  204:invokestatic    #286 <Method int zztv.zzb(zzte)>
	//   54  207:ireturn         
			else
				return zztv.zzk((byte[])obj);
	//   55  208:aload_1         
	//   56  209:checkcast       #141 <Class byte[]>
	//   57  212:invokestatic    #290 <Method int zztv.zzk(byte[])>
	//   58  215:ireturn         

		case 11: // '\013'
			if(obj instanceof zzte)
	//*  59  216:aload_1         
	//*  60  217:instanceof      #136 <Class zzte>
	//*  61  220:ifeq            231
				return zztv.zzb((zzte)obj);
	//   62  223:aload_1         
	//   63  224:checkcast       #136 <Class zzte>
	//   64  227:invokestatic    #286 <Method int zztv.zzb(zzte)>
	//   65  230:ireturn         
			else
				return zztv.zzgc((String)obj);
	//   66  231:aload_1         
	//   67  232:checkcast       #147 <Class String>
	//   68  235:invokestatic    #294 <Method int zztv.zzgc(String)>
	//   69  238:ireturn         

		case 10: // '\n'
			if(obj instanceof zzuy)
	//*  70  239:aload_1         
	//*  71  240:instanceof      #70  <Class zzuy>
	//*  72  243:ifeq            254
				return zztv.zza(((zzvc) ((zzuy)obj)));
	//   73  246:aload_1         
	//   74  247:checkcast       #70  <Class zzuy>
	//   75  250:invokestatic    #297 <Method int zztv.zza(zzvc)>
	//   76  253:ireturn         
			else
				return zztv.zzc((zzvv)obj);
	//   77  254:aload_1         
	//   78  255:checkcast       #53  <Class zzvv>
	//   79  258:invokestatic    #300 <Method int zztv.zzc(zzvv)>
	//   80  261:ireturn         

		case 9: // '\t'
			return zztv.zzd((zzvv)obj);
	//   81  262:aload_1         
	//   82  263:checkcast       #53  <Class zzvv>
	//   83  266:invokestatic    #303 <Method int zztv.zzd(zzvv)>
	//   84  269:ireturn         

		case 8: // '\b'
			return zztv.zzt(((Boolean)obj).booleanValue());
	//   85  270:aload_1         
	//   86  271:checkcast       #156 <Class Boolean>
	//   87  274:invokevirtual   #160 <Method boolean Boolean.booleanValue()>
	//   88  277:invokestatic    #307 <Method int zztv.zzt(boolean)>
	//   89  280:ireturn         

		case 7: // '\007'
			return zztv.zzbh(((Integer)obj).intValue());
	//   90  281:aload_1         
	//   91  282:checkcast       #109 <Class Integer>
	//   92  285:invokevirtual   #112 <Method int Integer.intValue()>
	//   93  288:invokestatic    #310 <Method int zztv.zzbh(int)>
	//   94  291:ireturn         

		case 6: // '\006'
			return zztv.zzaz(((Long)obj).longValue());
	//   95  292:aload_1         
	//   96  293:checkcast       #114 <Class Long>
	//   97  296:invokevirtual   #118 <Method long Long.longValue()>
	//   98  299:invokestatic    #312 <Method int zztv.zzaz(long)>
	//   99  302:ireturn         

		case 5: // '\005'
			return zztv.zzbe(((Integer)obj).intValue());
	//  100  303:aload_1         
	//  101  304:checkcast       #109 <Class Integer>
	//  102  307:invokevirtual   #112 <Method int Integer.intValue()>
	//  103  310:invokestatic    #315 <Method int zztv.zzbe(int)>
	//  104  313:ireturn         

		case 4: // '\004'
			return zztv.zzax(((Long)obj).longValue());
	//  105  314:aload_1         
	//  106  315:checkcast       #114 <Class Long>
	//  107  318:invokevirtual   #118 <Method long Long.longValue()>
	//  108  321:invokestatic    #318 <Method int zztv.zzax(long)>
	//  109  324:ireturn         

		case 3: // '\003'
			return zztv.zzaw(((Long)obj).longValue());
	//  110  325:aload_1         
	//  111  326:checkcast       #114 <Class Long>
	//  112  329:invokevirtual   #118 <Method long Long.longValue()>
	//  113  332:invokestatic    #321 <Method int zztv.zzaw(long)>
	//  114  335:ireturn         

		case 2: // '\002'
			return zztv.zzb(((Float)obj).floatValue());
	//  115  336:aload_1         
	//  116  337:checkcast       #168 <Class Float>
	//  117  340:invokevirtual   #172 <Method float Float.floatValue()>
	//  118  343:invokestatic    #324 <Method int zztv.zzb(float)>
	//  119  346:ireturn         

		case 1: // '\001'
			return zztv.zzc(((Double)obj).doubleValue());
	//  120  347:aload_1         
	//  121  348:checkcast       #177 <Class Double>
	//  122  351:invokevirtual   #181 <Method double Double.doubleValue()>
	//  123  354:invokestatic    #327 <Method int zztv.zzc(double)>
	//  124  357:ireturn         
		}
	}

	private static boolean zzc(java.util.Map.Entry entry)
	{
label0:
		{
			zzuh zzuh1 = (zzuh)entry.getKey();
	//    0    0:aload_0         
	//    1    1:invokeinterface #333 <Method Object java.util.Map$Entry.getKey()>
	//    2    6:checkcast       #188 <Class zzuh>
	//    3    9:astore_1        
			if(zzuh1.zzwa() != zzxx.zzcek)
				break label0;
	//    4   10:aload_1         
	//    5   11:invokeinterface #336 <Method zzxx zzuh.zzwa()>
	//    6   16:getstatic       #340 <Field zzxx zzxx.zzcek>
	//    7   19:if_acmpne       121
			if(zzuh1.zzwb())
	//*   8   22:aload_1         
	//*   9   23:invokeinterface #191 <Method boolean zzuh.zzwb()>
	//*  10   28:ifeq            74
			{
				entry = ((java.util.Map.Entry) (((List)entry.getValue()).iterator()));
	//   11   31:aload_0         
	//   12   32:invokeinterface #343 <Method Object java.util.Map$Entry.getValue()>
	//   13   37:checkcast       #193 <Class List>
	//   14   40:invokeinterface #245 <Method Iterator List.iterator()>
	//   15   45:astore_0        
				do
					if(!((Iterator) (entry)).hasNext())
						break label0;
	//   16   46:aload_0         
	//   17   47:invokeinterface #250 <Method boolean Iterator.hasNext()>
	//   18   52:ifeq            121
				while(((zzvv)((Iterator) (entry)).next()).isInitialized());
	//   19   55:aload_0         
	//   20   56:invokeinterface #254 <Method Object Iterator.next()>
	//   21   61:checkcast       #53  <Class zzvv>
	//   22   64:invokeinterface #346 <Method boolean zzvv.isInitialized()>
	//   23   69:ifne            46
				return false;
	//   24   72:iconst_0        
	//   25   73:ireturn         
			}
			entry = ((java.util.Map.Entry) (entry.getValue()));
	//   26   74:aload_0         
	//   27   75:invokeinterface #343 <Method Object java.util.Map$Entry.getValue()>
	//   28   80:astore_0        
			if(entry instanceof zzvv)
	//*  29   81:aload_0         
	//*  30   82:instanceof      #53  <Class zzvv>
	//*  31   85:ifeq            102
			{
				if(!((zzvv)entry).isInitialized())
	//*  32   88:aload_0         
	//*  33   89:checkcast       #53  <Class zzvv>
	//*  34   92:invokeinterface #346 <Method boolean zzvv.isInitialized()>
	//*  35   97:ifne            121
					return false;
	//   36  100:iconst_0        
	//   37  101:ireturn         
			} else
			if(entry instanceof zzuy)
	//*  38  102:aload_0         
	//*  39  103:instanceof      #70  <Class zzuy>
	//*  40  106:ifeq            111
				return true;
	//   41  109:iconst_1        
	//   42  110:ireturn         
			else
				throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
	//   43  111:new             #215 <Class IllegalArgumentException>
	//   44  114:dup             
	//   45  115:ldc1            #217 <String "Wrong object type used with protocol message reflection.">
	//   46  117:invokespecial   #219 <Method void IllegalArgumentException(String)>
	//   47  120:athrow          
		}
		return true;
	//   48  121:iconst_1        
	//   49  122:ireturn         
	}

	private final void zzd(java.util.Map.Entry entry)
	{
		zzuh zzuh1 = (zzuh)entry.getKey();
	//    0    0:aload_1         
	//    1    1:invokeinterface #333 <Method Object java.util.Map$Entry.getKey()>
	//    2    6:checkcast       #188 <Class zzuh>
	//    3    9:astore          4
		Object obj = entry.getValue();
	//    4   11:aload_1         
	//    5   12:invokeinterface #343 <Method Object java.util.Map$Entry.getValue()>
	//    6   17:astore_2        
		entry = ((java.util.Map.Entry) (obj));
	//    7   18:aload_2         
	//    8   19:astore_1        
		if(obj instanceof zzuy)
	//*   9   20:aload_2         
	//*  10   21:instanceof      #70  <Class zzuy>
	//*  11   24:ifeq            31
			entry = ((java.util.Map.Entry) (zzuy.zzwz()));
	//   12   27:invokestatic    #74  <Method zzvv zzuy.zzwz()>
	//   13   30:astore_1        
		if(zzuh1.zzwb())
	//*  14   31:aload           4
	//*  15   33:invokeinterface #191 <Method boolean zzuh.zzwb()>
	//*  16   38:ifeq            117
		{
			Object obj3 = zza(zzuh1);
	//   17   41:aload_0         
	//   18   42:aload           4
	//   19   44:invokespecial   #350 <Method Object zza(zzuh)>
	//   20   47:astore_3        
			Object obj1 = obj3;
	//   21   48:aload_3         
	//   22   49:astore_2        
			if(obj3 == null)
	//*  23   50:aload_3         
	//*  24   51:ifnonnull       62
				obj1 = ((Object) (new ArrayList()));
	//   25   54:new             #195 <Class ArrayList>
	//   26   57:dup             
	//   27   58:invokespecial   #196 <Method void ArrayList()>
	//   28   61:astore_2        
			Object obj4;
			for(entry = ((java.util.Map.Entry) (((List)entry).iterator())); ((Iterator) (entry)).hasNext(); ((List)obj1).add(zzz(obj4)))
	//*  29   62:aload_1         
	//*  30   63:checkcast       #193 <Class List>
	//*  31   66:invokeinterface #245 <Method Iterator List.iterator()>
	//*  32   71:astore_1        
	//*  33   72:aload_1         
	//*  34   73:invokeinterface #250 <Method boolean Iterator.hasNext()>
	//*  35   78:ifeq            105
				obj4 = ((Iterator) (entry)).next();
	//   36   81:aload_1         
	//   37   82:invokeinterface #254 <Method Object Iterator.next()>
	//   38   87:astore_3        

	//   39   88:aload_2         
	//   40   89:checkcast       #193 <Class List>
	//   41   92:aload_3         
	//   42   93:invokestatic    #353 <Method Object zzz(Object)>
	//   43   96:invokeinterface #357 <Method boolean List.add(Object)>
	//   44  101:pop             
	//*  45  102:goto            72
			zzbvh.zza(((Comparable) (zzuh1)), obj1);
	//   46  105:aload_0         
	//   47  106:getfield        #34  <Field zzwo zzbvh>
	//   48  109:aload           4
	//   49  111:aload_2         
	//   50  112:invokevirtual   #222 <Method Object zzwo.zza(Comparable, Object)>
	//   51  115:pop             
			return;
	//   52  116:return          
		}
		if(zzuh1.zzwa() == zzxx.zzcek)
	//*  53  117:aload           4
	//*  54  119:invokeinterface #336 <Method zzxx zzuh.zzwa()>
	//*  55  124:getstatic       #340 <Field zzxx zzxx.zzcek>
	//*  56  127:if_acmpne       220
		{
			Object obj2 = zza(zzuh1);
	//   57  130:aload_0         
	//   58  131:aload           4
	//   59  133:invokespecial   #350 <Method Object zza(zzuh)>
	//   60  136:astore_2        
			if(obj2 == null)
	//*  61  137:aload_2         
	//*  62  138:ifnonnull       156
			{
				zzbvh.zza(((Comparable) (zzuh1)), zzz(((Object) (entry))));
	//   63  141:aload_0         
	//   64  142:getfield        #34  <Field zzwo zzbvh>
	//   65  145:aload           4
	//   66  147:aload_1         
	//   67  148:invokestatic    #353 <Method Object zzz(Object)>
	//   68  151:invokevirtual   #222 <Method Object zzwo.zza(Comparable, Object)>
	//   69  154:pop             
				return;
	//   70  155:return          
			}
			if(obj2 instanceof zzwb)
	//*  71  156:aload_2         
	//*  72  157:instanceof      #359 <Class zzwb>
	//*  73  160:ifeq            182
				entry = ((java.util.Map.Entry) (zzuh1.zza((zzwb)obj2, (zzwb)entry)));
	//   74  163:aload           4
	//   75  165:aload_2         
	//   76  166:checkcast       #359 <Class zzwb>
	//   77  169:aload_1         
	//   78  170:checkcast       #359 <Class zzwb>
	//   79  173:invokeinterface #362 <Method zzwb zzuh.zza(zzwb, zzwb)>
	//   80  178:astore_1        
			else
	//*  81  179:goto            208
				entry = ((java.util.Map.Entry) (zzuh1.zza(((zzvv)obj2).zzwh(), (zzvv)entry).zzwo()));
	//   82  182:aload           4
	//   83  184:aload_2         
	//   84  185:checkcast       #53  <Class zzvv>
	//   85  188:invokeinterface #366 <Method zzvw zzvv.zzwh()>
	//   86  193:aload_1         
	//   87  194:checkcast       #53  <Class zzvv>
	//   88  197:invokeinterface #369 <Method zzvw zzuh.zza(zzvw, zzvv)>
	//   89  202:invokeinterface #374 <Method zzvv zzvw.zzwo()>
	//   90  207:astore_1        
			zzbvh.zza(((Comparable) (zzuh1)), ((Object) (entry)));
	//   91  208:aload_0         
	//   92  209:getfield        #34  <Field zzwo zzbvh>
	//   93  212:aload           4
	//   94  214:aload_1         
	//   95  215:invokevirtual   #222 <Method Object zzwo.zza(Comparable, Object)>
	//   96  218:pop             
			return;
	//   97  219:return          
		} else
		{
			zzbvh.zza(((Comparable) (zzuh1)), zzz(((Object) (entry))));
	//   98  220:aload_0         
	//   99  221:getfield        #34  <Field zzwo zzbvh>
	//  100  224:aload           4
	//  101  226:aload_1         
	//  102  227:invokestatic    #353 <Method Object zzz(Object)>
	//  103  230:invokevirtual   #222 <Method Object zzwo.zza(Comparable, Object)>
	//  104  233:pop             
			return;
	//  105  234:return          
		}
	}

	private static int zze(java.util.Map.Entry entry)
	{
		zzuh zzuh1 = (zzuh)entry.getKey();
	//    0    0:aload_0         
	//    1    1:invokeinterface #333 <Method Object java.util.Map$Entry.getKey()>
	//    2    6:checkcast       #188 <Class zzuh>
	//    3    9:astore_1        
		Object obj = entry.getValue();
	//    4   10:aload_0         
	//    5   11:invokeinterface #343 <Method Object java.util.Map$Entry.getValue()>
	//    6   16:astore_2        
		if(zzuh1.zzwa() == zzxx.zzcek && !zzuh1.zzwb() && !zzuh1.zzwc())
	//*   7   17:aload_1         
	//*   8   18:invokeinterface #336 <Method zzxx zzuh.zzwa()>
	//*   9   23:getstatic       #340 <Field zzxx zzxx.zzcek>
	//*  10   26:if_acmpne       98
	//*  11   29:aload_1         
	//*  12   30:invokeinterface #191 <Method boolean zzuh.zzwb()>
	//*  13   35:ifne            98
	//*  14   38:aload_1         
	//*  15   39:invokeinterface #241 <Method boolean zzuh.zzwc()>
	//*  16   44:ifne            98
		{
			if(obj instanceof zzuy)
	//*  17   47:aload_2         
	//*  18   48:instanceof      #70  <Class zzuy>
	//*  19   51:ifeq            76
				return zztv.zzb(((zzuh)entry.getKey()).zzc(), ((zzvc) ((zzuy)obj)));
	//   20   54:aload_0         
	//   21   55:invokeinterface #333 <Method Object java.util.Map$Entry.getKey()>
	//   22   60:checkcast       #188 <Class zzuh>
	//   23   63:invokeinterface #238 <Method int zzuh.zzc()>
	//   24   68:aload_2         
	//   25   69:checkcast       #70  <Class zzuy>
	//   26   72:invokestatic    #379 <Method int zztv.zzb(int, zzvc)>
	//   27   75:ireturn         
			else
				return zztv.zzd(((zzuh)entry.getKey()).zzc(), (zzvv)obj);
	//   28   76:aload_0         
	//   29   77:invokeinterface #333 <Method Object java.util.Map$Entry.getKey()>
	//   30   82:checkcast       #188 <Class zzuh>
	//   31   85:invokeinterface #238 <Method int zzuh.zzc()>
	//   32   90:aload_2         
	//   33   91:checkcast       #53  <Class zzvv>
	//   34   94:invokestatic    #382 <Method int zztv.zzd(int, zzvv)>
	//   35   97:ireturn         
		} else
		{
			return zzb(zzuh1, obj);
	//   36   98:aload_1         
	//   37   99:aload_2         
	//   38  100:invokestatic    #384 <Method int zzb(zzuh, Object)>
	//   39  103:ireturn         
		}
	}

	public static zzuf zzvw()
	{
		return zzbvj;
	//    0    0:getstatic       #21  <Field zzuf zzbvj>
	//    1    3:areturn         
	}

	private static Object zzz(Object obj)
	{
		if(obj instanceof zzwb)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #359 <Class zzwb>
	//*   2    4:ifeq            17
			return ((Object) (((zzwb)obj).zzxp()));
	//    3    7:aload_0         
	//    4    8:checkcast       #359 <Class zzwb>
	//    5   11:invokeinterface #392 <Method zzwb zzwb.zzxp()>
	//    6   16:areturn         
		if(obj instanceof byte[])
	//*   7   17:aload_0         
	//*   8   18:instanceof      #141 <Class byte[]>
	//*   9   21:ifeq            45
		{
			obj = ((Object) ((byte[])obj));
	//   10   24:aload_0         
	//   11   25:checkcast       #141 <Class byte[]>
	//   12   28:astore_0        
			byte abyte0[] = new byte[obj.length];
	//   13   29:aload_0         
	//   14   30:arraylength     
	//   15   31:newarray        byte[]
	//   16   33:astore_1        
			System.arraycopy(obj, 0, ((Object) (abyte0)), 0, obj.length);
	//   17   34:aload_0         
	//   18   35:iconst_0        
	//   19   36:aload_1         
	//   20   37:iconst_0        
	//   21   38:aload_0         
	//   22   39:arraylength     
	//   23   40:invokestatic    #398 <Method void System.arraycopy(Object, int, Object, int, int)>
			return ((Object) (abyte0));
	//   24   43:aload_1         
	//   25   44:areturn         
		} else
		{
			return obj;
	//   26   45:aload_0         
	//   27   46:areturn         
		}
	}

	public final Object clone()
		throws CloneNotSupportedException
	{
		zzuf zzuf1 = new zzuf();
	//    0    0:new             #2   <Class zzuf>
	//    1    3:dup             
	//    2    4:invokespecial   #402 <Method void zzuf()>
	//    3    7:astore_2        
		for(int i = 0; i < zzbvh.zzyc(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #34  <Field zzwo zzbvh>
	//*   9   15:invokevirtual   #405 <Method int zzwo.zzyc()>
	//*  10   18:icmpge          56
		{
			java.util.Map.Entry entry = zzbvh.zzbx(i);
	//   11   21:aload_0         
	//   12   22:getfield        #34  <Field zzwo zzbvh>
	//   13   25:iload_1         
	//   14   26:invokevirtual   #409 <Method java.util.Map$Entry zzwo.zzbx(int)>
	//   15   29:astore_3        
			zzuf1.zza((zzuh)entry.getKey(), entry.getValue());
	//   16   30:aload_2         
	//   17   31:aload_3         
	//   18   32:invokeinterface #333 <Method Object java.util.Map$Entry.getKey()>
	//   19   37:checkcast       #188 <Class zzuh>
	//   20   40:aload_3         
	//   21   41:invokeinterface #343 <Method Object java.util.Map$Entry.getValue()>
	//   22   46:invokespecial   #411 <Method void zza(zzuh, Object)>
		}

	//   23   49:iload_1         
	//   24   50:iconst_1        
	//   25   51:iadd            
	//   26   52:istore_1        
	//*  27   53:goto            10
		java.util.Map.Entry entry1;
		for(Iterator iterator1 = zzbvh.zzyd().iterator(); iterator1.hasNext(); zzuf1.zza((zzuh)entry1.getKey(), entry1.getValue()))
	//*  28   56:aload_0         
	//*  29   57:getfield        #34  <Field zzwo zzbvh>
	//*  30   60:invokevirtual   #415 <Method Iterable zzwo.zzyd()>
	//*  31   63:invokeinterface #418 <Method Iterator Iterable.iterator()>
	//*  32   68:astore_3        
	//*  33   69:aload_3         
	//*  34   70:invokeinterface #250 <Method boolean Iterator.hasNext()>
	//*  35   75:ifeq            113
			entry1 = (java.util.Map.Entry)iterator1.next();
	//   36   78:aload_3         
	//   37   79:invokeinterface #254 <Method Object Iterator.next()>
	//   38   84:checkcast       #330 <Class java.util.Map$Entry>
	//   39   87:astore          4

	//   40   89:aload_2         
	//   41   90:aload           4
	//   42   92:invokeinterface #333 <Method Object java.util.Map$Entry.getKey()>
	//   43   97:checkcast       #188 <Class zzuh>
	//   44  100:aload           4
	//   45  102:invokeinterface #343 <Method Object java.util.Map$Entry.getValue()>
	//   46  107:invokespecial   #411 <Method void zza(zzuh, Object)>
	//*  47  110:goto            69
		zzuf1.zzbvi = zzbvi;
	//   48  113:aload_2         
	//   49  114:aload_0         
	//   50  115:getfield        #26  <Field boolean zzbvi>
	//   51  118:putfield        #26  <Field boolean zzbvi>
		return ((Object) (zzuf1));
	//   52  121:aload_2         
	//   53  122:areturn         
	}

	final Iterator descendingIterator()
	{
		if(zzbvi)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean zzbvi>
	//*   2    4:ifeq            27
			return ((Iterator) (new zzvb(zzbvh.zzye().iterator())));
	//    3    7:new             #421 <Class zzvb>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #34  <Field zzwo zzbvh>
	//    7   15:invokevirtual   #425 <Method Set zzwo.zzye()>
	//    8   18:invokeinterface #428 <Method Iterator Set.iterator()>
	//    9   23:invokespecial   #431 <Method void zzvb(Iterator)>
	//   10   26:areturn         
		else
			return zzbvh.zzye().iterator();
	//   11   27:aload_0         
	//   12   28:getfield        #34  <Field zzwo zzbvh>
	//   13   31:invokevirtual   #425 <Method Set zzwo.zzye()>
	//   14   34:invokeinterface #428 <Method Iterator Set.iterator()>
	//   15   39:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzuf))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzuf>
	//*   7   11:ifne            16
		{
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		} else
		{
			obj = ((Object) ((zzuf)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzuf>
	//   12   20:astore_1        
			return zzbvh.equals(((Object) (((zzuf) (obj)).zzbvh)));
	//   13   21:aload_0         
	//   14   22:getfield        #34  <Field zzwo zzbvh>
	//   15   25:aload_1         
	//   16   26:getfield        #34  <Field zzwo zzbvh>
	//   17   29:invokevirtual   #435 <Method boolean zzwo.equals(Object)>
	//   18   32:ireturn         
		}
	}

	public final int hashCode()
	{
		return zzbvh.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field zzwo zzbvh>
	//    2    4:invokevirtual   #438 <Method int zzwo.hashCode()>
	//    3    7:ireturn         
	}

	final boolean isEmpty()
	{
		return zzbvh.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field zzwo zzbvh>
	//    2    4:invokevirtual   #441 <Method boolean zzwo.isEmpty()>
	//    3    7:ireturn         
	}

	public final boolean isImmutable()
	{
		return zzbpy;
	//    0    0:aload_0         
	//    1    1:getfield        #444 <Field boolean zzbpy>
	//    2    4:ireturn         
	}

	public final boolean isInitialized()
	{
		for(int i = 0; i < zzbvh.zzyc(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #34  <Field zzwo zzbvh>
	//*   5    7:invokevirtual   #405 <Method int zzwo.zzyc()>
	//*   6   10:icmpge          36
			if(!zzc(zzbvh.zzbx(i)))
	//*   7   13:aload_0         
	//*   8   14:getfield        #34  <Field zzwo zzbvh>
	//*   9   17:iload_1         
	//*  10   18:invokevirtual   #409 <Method java.util.Map$Entry zzwo.zzbx(int)>
	//*  11   21:invokestatic    #446 <Method boolean zzc(java.util.Map$Entry)>
	//*  12   24:ifne            29
				return false;
	//   13   27:iconst_0        
	//   14   28:ireturn         

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            2
		for(Iterator iterator1 = zzbvh.zzyd().iterator(); iterator1.hasNext();)
	//*  20   36:aload_0         
	//*  21   37:getfield        #34  <Field zzwo zzbvh>
	//*  22   40:invokevirtual   #415 <Method Iterable zzwo.zzyd()>
	//*  23   43:invokeinterface #418 <Method Iterator Iterable.iterator()>
	//*  24   48:astore_2        
	//*  25   49:aload_2         
	//*  26   50:invokeinterface #250 <Method boolean Iterator.hasNext()>
	//*  27   55:ifeq            75
			if(!zzc((java.util.Map.Entry)iterator1.next()))
	//*  28   58:aload_2         
	//*  29   59:invokeinterface #254 <Method Object Iterator.next()>
	//*  30   64:checkcast       #330 <Class java.util.Map$Entry>
	//*  31   67:invokestatic    #446 <Method boolean zzc(java.util.Map$Entry)>
	//*  32   70:ifne            49
				return false;
	//   33   73:iconst_0        
	//   34   74:ireturn         

		return true;
	//   35   75:iconst_1        
	//   36   76:ireturn         
	}

	public final Iterator iterator()
	{
		if(zzbvi)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean zzbvi>
	//*   2    4:ifeq            27
			return ((Iterator) (new zzvb(zzbvh.entrySet().iterator())));
	//    3    7:new             #421 <Class zzvb>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #34  <Field zzwo zzbvh>
	//    7   15:invokevirtual   #449 <Method Set zzwo.entrySet()>
	//    8   18:invokeinterface #428 <Method Iterator Set.iterator()>
	//    9   23:invokespecial   #431 <Method void zzvb(Iterator)>
	//   10   26:areturn         
		else
			return zzbvh.entrySet().iterator();
	//   11   27:aload_0         
	//   12   28:getfield        #34  <Field zzwo zzbvh>
	//   13   31:invokevirtual   #449 <Method Set zzwo.entrySet()>
	//   14   34:invokeinterface #428 <Method Iterator Set.iterator()>
	//   15   39:areturn         
	}

	public final void zza(zzuf zzuf1)
	{
		for(int i = 0; i < zzuf1.zzbvh.zzyc(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:getfield        #34  <Field zzwo zzbvh>
	//*   5    7:invokevirtual   #405 <Method int zzwo.zzyc()>
	//*   6   10:icmpge          32
			zzd(zzuf1.zzbvh.zzbx(i));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #34  <Field zzwo zzbvh>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #409 <Method java.util.Map$Entry zzwo.zzbx(int)>
	//   12   22:invokespecial   #452 <Method void zzd(java.util.Map$Entry)>

	//   13   25:iload_2         
	//   14   26:iconst_1        
	//   15   27:iadd            
	//   16   28:istore_2        
	//*  17   29:goto            2
		for(zzuf1 = ((zzuf) (zzuf1.zzbvh.zzyd().iterator())); ((Iterator) (zzuf1)).hasNext(); zzd((java.util.Map.Entry)((Iterator) (zzuf1)).next()));
	//   18   32:aload_1         
	//   19   33:getfield        #34  <Field zzwo zzbvh>
	//   20   36:invokevirtual   #415 <Method Iterable zzwo.zzyd()>
	//   21   39:invokeinterface #418 <Method Iterator Iterable.iterator()>
	//   22   44:astore_1        
	//   23   45:aload_1         
	//   24   46:invokeinterface #250 <Method boolean Iterator.hasNext()>
	//   25   51:ifeq            70
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:invokeinterface #254 <Method Object Iterator.next()>
	//   29   61:checkcast       #330 <Class java.util.Map$Entry>
	//   30   64:invokespecial   #452 <Method void zzd(java.util.Map$Entry)>
	//*  31   67:goto            45
	//   32   70:return          
	}

	public final void zzsw()
	{
		if(zzbpy)
	//*   0    0:aload_0         
	//*   1    1:getfield        #444 <Field boolean zzbpy>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			zzbvh.zzsw();
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field zzwo zzbvh>
	//    6   12:invokevirtual   #454 <Method void zzwo.zzsw()>
			zzbpy = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #444 <Field boolean zzbpy>
			return;
	//   10   20:return          
		}
	}

	public final int zzvx()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		for(; j < zzbvh.zzyc(); j++)
	//*   4    4:iload_2         
	//*   5    5:aload_0         
	//*   6    6:getfield        #34  <Field zzwo zzbvh>
	//*   7    9:invokevirtual   #405 <Method int zzwo.zzyc()>
	//*   8   12:icmpge          52
		{
			java.util.Map.Entry entry = zzbvh.zzbx(j);
	//    9   15:aload_0         
	//   10   16:getfield        #34  <Field zzwo zzbvh>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #409 <Method java.util.Map$Entry zzwo.zzbx(int)>
	//   13   23:astore_3        
			i += zzb((zzuh)entry.getKey(), entry.getValue());
	//   14   24:iload_1         
	//   15   25:aload_3         
	//   16   26:invokeinterface #333 <Method Object java.util.Map$Entry.getKey()>
	//   17   31:checkcast       #188 <Class zzuh>
	//   18   34:aload_3         
	//   19   35:invokeinterface #343 <Method Object java.util.Map$Entry.getValue()>
	//   20   40:invokestatic    #384 <Method int zzb(zzuh, Object)>
	//   21   43:iadd            
	//   22   44:istore_1        
		}

	//   23   45:iload_2         
	//   24   46:iconst_1        
	//   25   47:iadd            
	//   26   48:istore_2        
	//*  27   49:goto            4
		for(Iterator iterator1 = zzbvh.zzyd().iterator(); iterator1.hasNext();)
	//*  28   52:aload_0         
	//*  29   53:getfield        #34  <Field zzwo zzbvh>
	//*  30   56:invokevirtual   #415 <Method Iterable zzwo.zzyd()>
	//*  31   59:invokeinterface #418 <Method Iterator Iterable.iterator()>
	//*  32   64:astore_3        
	//*  33   65:aload_3         
	//*  34   66:invokeinterface #250 <Method boolean Iterator.hasNext()>
	//*  35   71:ifeq            111
		{
			java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator1.next();
	//   36   74:aload_3         
	//   37   75:invokeinterface #254 <Method Object Iterator.next()>
	//   38   80:checkcast       #330 <Class java.util.Map$Entry>
	//   39   83:astore          4
			i += zzb((zzuh)entry1.getKey(), entry1.getValue());
	//   40   85:iload_1         
	//   41   86:aload           4
	//   42   88:invokeinterface #333 <Method Object java.util.Map$Entry.getKey()>
	//   43   93:checkcast       #188 <Class zzuh>
	//   44   96:aload           4
	//   45   98:invokeinterface #343 <Method Object java.util.Map$Entry.getValue()>
	//   46  103:invokestatic    #384 <Method int zzb(zzuh, Object)>
	//   47  106:iadd            
	//   48  107:istore_1        
		}

	//*  49  108:goto            65
		return i;
	//   50  111:iload_1         
	//   51  112:ireturn         
	}

	public final int zzvy()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		for(; j < zzbvh.zzyc(); j++)
	//*   4    4:iload_2         
	//*   5    5:aload_0         
	//*   6    6:getfield        #34  <Field zzwo zzbvh>
	//*   7    9:invokevirtual   #405 <Method int zzwo.zzyc()>
	//*   8   12:icmpge          36
			i += zze(zzbvh.zzbx(j));
	//    9   15:iload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field zzwo zzbvh>
	//   12   20:iload_2         
	//   13   21:invokevirtual   #409 <Method java.util.Map$Entry zzwo.zzbx(int)>
	//   14   24:invokestatic    #458 <Method int zze(java.util.Map$Entry)>
	//   15   27:iadd            
	//   16   28:istore_1        

	//   17   29:iload_2         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_2        
	//*  21   33:goto            4
		for(Iterator iterator1 = zzbvh.zzyd().iterator(); iterator1.hasNext();)
	//*  22   36:aload_0         
	//*  23   37:getfield        #34  <Field zzwo zzbvh>
	//*  24   40:invokevirtual   #415 <Method Iterable zzwo.zzyd()>
	//*  25   43:invokeinterface #418 <Method Iterator Iterable.iterator()>
	//*  26   48:astore_3        
	//*  27   49:aload_3         
	//*  28   50:invokeinterface #250 <Method boolean Iterator.hasNext()>
	//*  29   55:ifeq            76
			i += zze((java.util.Map.Entry)iterator1.next());
	//   30   58:iload_1         
	//   31   59:aload_3         
	//   32   60:invokeinterface #254 <Method Object Iterator.next()>
	//   33   65:checkcast       #330 <Class java.util.Map$Entry>
	//   34   68:invokestatic    #458 <Method int zze(java.util.Map$Entry)>
	//   35   71:iadd            
	//   36   72:istore_1        

	//*  37   73:goto            49
		return i;
	//   38   76:iload_1         
	//   39   77:ireturn         
	}

	private static final zzuf zzbvj = new zzuf(true);
	private boolean zzbpy;
	private final zzwo zzbvh;
	private boolean zzbvi;

	static 
	{
	//    0    0:new             #2   <Class zzuf>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #19  <Method void zzuf(boolean)>
	//    4    8:putstatic       #21  <Field zzuf zzbvj>
	//*   5   11:return          
	}
}
