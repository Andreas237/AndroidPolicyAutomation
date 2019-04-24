// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbdp, zzbav, zzbes, zzbcu, 
//			zzbbq, zzbbx, zzbbh, zzbbr, 
//			zzbah, zzbbi, zzbex, zzbdb, 
//			zzbcv, zzbca

final class zzbbg
{

	private zzbbg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzdqz = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #26  <Field boolean zzdqz>
		zzdqx = zzbdp.zzcx(16);
	//    5    9:aload_0         
	//    6   10:bipush          16
	//    7   12:invokestatic    #32  <Method zzbdp zzbdp.zzcx(int)>
	//    8   15:putfield        #34  <Field zzbdp zzdqx>
	//    9   18:return          
	}

	private zzbbg(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzdqz = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #26  <Field boolean zzdqz>
		zzdqx = zzbdp.zzcx(0);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:invokestatic    #32  <Method zzbdp zzbdp.zzcx(int)>
	//    8   14:putfield        #34  <Field zzbdp zzdqx>
		zzaaz();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #37  <Method void zzaaz()>
	//   11   21:return          
	}

	static int zza(zzbes zzbes1, int i, Object obj)
	{
		int j = zzbav.zzcd(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #45  <Method int zzbav.zzcd(int)>
	//    2    4:istore_3        
		i = j;
	//    3    5:iload_3         
	//    4    6:istore_1        
		if(zzbes1 == zzbes.zzeaj)
	//*   5    7:aload_0         
	//*   6    8:getstatic       #51  <Field zzbes zzbes.zzeaj>
	//*   7   11:if_acmpne       26
		{
			zzbbq.zzi((zzbcu)obj);
	//    8   14:aload_2         
	//    9   15:checkcast       #53  <Class zzbcu>
	//   10   18:invokestatic    #59  <Method boolean zzbbq.zzi(zzbcu)>
	//   11   21:pop             
			i = j << 1;
	//   12   22:iload_3         
	//   13   23:iconst_1        
	//   14   24:ishl            
	//   15   25:istore_1        
		}
		return i + zzb(zzbes1, obj);
	//   16   26:iload_1         
	//   17   27:aload_0         
	//   18   28:aload_2         
	//   19   29:invokestatic    #63  <Method int zzb(zzbes, Object)>
	//   20   32:iadd            
	//   21   33:ireturn         
	}

	private final Object zza(zzbbi zzbbi1)
	{
		Object obj = zzdqx.get(((Object) (zzbbi1)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field zzbdp zzdqx>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #68  <Method Object zzbdp.get(Object)>
	//    4    8:astore_2        
		zzbbi1 = ((zzbbi) (obj));
	//    5    9:aload_2         
	//    6   10:astore_1        
		if(obj instanceof zzbbx)
	//*   7   11:aload_2         
	//*   8   12:instanceof      #70  <Class zzbbx>
	//*   9   15:ifeq            22
			zzbbi1 = ((zzbbi) (zzbbx.zzadu()));
	//   10   18:invokestatic    #74  <Method zzbcu zzbbx.zzadu()>
	//   11   21:astore_1        
		return ((Object) (zzbbi1));
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	static void zza(zzbav zzbav1, zzbes zzbes1, int i, Object obj)
		throws IOException
	{
		if(zzbes1 == zzbes.zzeaj)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #51  <Field zzbes zzbes.zzeaj>
	//*   2    4:if_acmpne       37
		{
			zzbes1 = ((zzbes) ((zzbcu)obj));
	//    3    7:aload_3         
	//    4    8:checkcast       #53  <Class zzbcu>
	//    5   11:astore_1        
			zzbbq.zzi(((zzbcu) (zzbes1)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #59  <Method boolean zzbbq.zzi(zzbcu)>
	//    8   16:pop             
			zzbav1.zzl(i, 3);
	//    9   17:aload_0         
	//   10   18:iload_2         
	//   11   19:iconst_3        
	//   12   20:invokevirtual   #83  <Method void zzbav.zzl(int, int)>
			((zzbcu) (zzbes1)).zzb(zzbav1);
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:invokeinterface #86  <Method void zzbcu.zzb(zzbav)>
			zzbav1.zzl(i, 4);
	//   16   30:aload_0         
	//   17   31:iload_2         
	//   18   32:iconst_4        
	//   19   33:invokevirtual   #83  <Method void zzbav.zzl(int, int)>
			return;
	//   20   36:return          
		}
		zzbav1.zzl(i, zzbes1.zzagm());
	//   21   37:aload_0         
	//   22   38:iload_2         
	//   23   39:aload_1         
	//   24   40:invokevirtual   #90  <Method int zzbes.zzagm()>
	//   25   43:invokevirtual   #83  <Method void zzbav.zzl(int, int)>
		switch(zzbbh.zzdql[zzbes1.ordinal()])
	//*  26   46:getstatic       #96  <Field int[] zzbbh.zzdql>
	//*  27   49:aload_1         
	//*  28   50:invokevirtual   #99  <Method int zzbes.ordinal()>
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
			if(obj instanceof zzbbr)
	//*  32  141:aload_3         
	//*  33  142:instanceof      #101 <Class zzbbr>
	//*  34  145:ifeq            162
			{
				zzbav1.zzbz(((zzbbr)obj).zzhq());
	//   35  148:aload_0         
	//   36  149:aload_3         
	//   37  150:checkcast       #101 <Class zzbbr>
	//   38  153:invokeinterface #104 <Method int zzbbr.zzhq()>
	//   39  158:invokevirtual   #108 <Method void zzbav.zzbz(int)>
				return;
	//   40  161:return          
			} else
			{
				zzbav1.zzbz(((Integer)obj).intValue());
	//   41  162:aload_0         
	//   42  163:aload_3         
	//   43  164:checkcast       #110 <Class Integer>
	//   44  167:invokevirtual   #113 <Method int Integer.intValue()>
	//   45  170:invokevirtual   #108 <Method void zzbav.zzbz(int)>
				return;
	//   46  173:return          
			}

		case 17: // '\021'
			zzbav1.zzn(((Long)obj).longValue());
	//   47  174:aload_0         
	//   48  175:aload_3         
	//   49  176:checkcast       #115 <Class Long>
	//   50  179:invokevirtual   #119 <Method long Long.longValue()>
	//   51  182:invokevirtual   #123 <Method void zzbav.zzn(long)>
			return;
	//   52  185:return          

		case 16: // '\020'
			zzbav1.zzcb(((Integer)obj).intValue());
	//   53  186:aload_0         
	//   54  187:aload_3         
	//   55  188:checkcast       #110 <Class Integer>
	//   56  191:invokevirtual   #113 <Method int Integer.intValue()>
	//   57  194:invokevirtual   #126 <Method void zzbav.zzcb(int)>
			return;
	//   58  197:return          

		case 15: // '\017'
			zzbav1.zzo(((Long)obj).longValue());
	//   59  198:aload_0         
	//   60  199:aload_3         
	//   61  200:checkcast       #115 <Class Long>
	//   62  203:invokevirtual   #119 <Method long Long.longValue()>
	//   63  206:invokevirtual   #129 <Method void zzbav.zzo(long)>
			return;
	//   64  209:return          

		case 14: // '\016'
			zzbav1.zzcc(((Integer)obj).intValue());
	//   65  210:aload_0         
	//   66  211:aload_3         
	//   67  212:checkcast       #110 <Class Integer>
	//   68  215:invokevirtual   #113 <Method int Integer.intValue()>
	//   69  218:invokevirtual   #132 <Method void zzbav.zzcc(int)>
			return;
	//   70  221:return          

		case 13: // '\r'
			zzbav1.zzca(((Integer)obj).intValue());
	//   71  222:aload_0         
	//   72  223:aload_3         
	//   73  224:checkcast       #110 <Class Integer>
	//   74  227:invokevirtual   #113 <Method int Integer.intValue()>
	//   75  230:invokevirtual   #135 <Method void zzbav.zzca(int)>
			return;
	//   76  233:return          

		case 12: // '\f'
			if(obj instanceof zzbah)
	//*  77  234:aload_3         
	//*  78  235:instanceof      #137 <Class zzbah>
	//*  79  238:ifeq            250
			{
				zzbav1.zzan((zzbah)obj);
	//   80  241:aload_0         
	//   81  242:aload_3         
	//   82  243:checkcast       #137 <Class zzbah>
	//   83  246:invokevirtual   #141 <Method void zzbav.zzan(zzbah)>
				return;
	//   84  249:return          
			} else
			{
				zzbes1 = ((zzbes) ((byte[])obj));
	//   85  250:aload_3         
	//   86  251:checkcast       #143 <Class byte[]>
	//   87  254:astore_1        
				zzbav1.zze(((byte []) (zzbes1)), 0, zzbes1.length);
	//   88  255:aload_0         
	//   89  256:aload_1         
	//   90  257:iconst_0        
	//   91  258:aload_1         
	//   92  259:arraylength     
	//   93  260:invokevirtual   #147 <Method void zzbav.zze(byte[], int, int)>
				return;
	//   94  263:return          
			}

		case 11: // '\013'
			if(obj instanceof zzbah)
	//*  95  264:aload_3         
	//*  96  265:instanceof      #137 <Class zzbah>
	//*  97  268:ifeq            280
			{
				zzbav1.zzan((zzbah)obj);
	//   98  271:aload_0         
	//   99  272:aload_3         
	//  100  273:checkcast       #137 <Class zzbah>
	//  101  276:invokevirtual   #141 <Method void zzbav.zzan(zzbah)>
				return;
	//  102  279:return          
			} else
			{
				zzbav1.zzen((String)obj);
	//  103  280:aload_0         
	//  104  281:aload_3         
	//  105  282:checkcast       #149 <Class String>
	//  106  285:invokevirtual   #153 <Method void zzbav.zzen(String)>
				return;
	//  107  288:return          
			}

		case 10: // '\n'
			zzbav1.zze((zzbcu)obj);
	//  108  289:aload_0         
	//  109  290:aload_3         
	//  110  291:checkcast       #53  <Class zzbcu>
	//  111  294:invokevirtual   #156 <Method void zzbav.zze(zzbcu)>
			return;
	//  112  297:return          

		case 9: // '\t'
			((zzbcu)obj).zzb(zzbav1);
	//  113  298:aload_3         
	//  114  299:checkcast       #53  <Class zzbcu>
	//  115  302:aload_0         
	//  116  303:invokeinterface #86  <Method void zzbcu.zzb(zzbav)>
			return;
	//  117  308:return          

		case 8: // '\b'
			zzbav1.zzap(((Boolean)obj).booleanValue());
	//  118  309:aload_0         
	//  119  310:aload_3         
	//  120  311:checkcast       #158 <Class Boolean>
	//  121  314:invokevirtual   #162 <Method boolean Boolean.booleanValue()>
	//  122  317:invokevirtual   #165 <Method void zzbav.zzap(boolean)>
			return;
	//  123  320:return          

		case 7: // '\007'
			zzbav1.zzcc(((Integer)obj).intValue());
	//  124  321:aload_0         
	//  125  322:aload_3         
	//  126  323:checkcast       #110 <Class Integer>
	//  127  326:invokevirtual   #113 <Method int Integer.intValue()>
	//  128  329:invokevirtual   #132 <Method void zzbav.zzcc(int)>
			return;
	//  129  332:return          

		case 6: // '\006'
			zzbav1.zzo(((Long)obj).longValue());
	//  130  333:aload_0         
	//  131  334:aload_3         
	//  132  335:checkcast       #115 <Class Long>
	//  133  338:invokevirtual   #119 <Method long Long.longValue()>
	//  134  341:invokevirtual   #129 <Method void zzbav.zzo(long)>
			return;
	//  135  344:return          

		case 5: // '\005'
			zzbav1.zzbz(((Integer)obj).intValue());
	//  136  345:aload_0         
	//  137  346:aload_3         
	//  138  347:checkcast       #110 <Class Integer>
	//  139  350:invokevirtual   #113 <Method int Integer.intValue()>
	//  140  353:invokevirtual   #108 <Method void zzbav.zzbz(int)>
			return;
	//  141  356:return          

		case 4: // '\004'
			zzbav1.zzm(((Long)obj).longValue());
	//  142  357:aload_0         
	//  143  358:aload_3         
	//  144  359:checkcast       #115 <Class Long>
	//  145  362:invokevirtual   #119 <Method long Long.longValue()>
	//  146  365:invokevirtual   #168 <Method void zzbav.zzm(long)>
			return;
	//  147  368:return          

		case 3: // '\003'
			zzbav1.zzm(((Long)obj).longValue());
	//  148  369:aload_0         
	//  149  370:aload_3         
	//  150  371:checkcast       #115 <Class Long>
	//  151  374:invokevirtual   #119 <Method long Long.longValue()>
	//  152  377:invokevirtual   #168 <Method void zzbav.zzm(long)>
			return;
	//  153  380:return          

		case 2: // '\002'
			zzbav1.zzb(((Float)obj).floatValue());
	//  154  381:aload_0         
	//  155  382:aload_3         
	//  156  383:checkcast       #170 <Class Float>
	//  157  386:invokevirtual   #174 <Method float Float.floatValue()>
	//  158  389:invokevirtual   #177 <Method void zzbav.zzb(float)>
			return;
	//  159  392:return          

		case 1: // '\001'
			zzbav1.zzb(((Double)obj).doubleValue());
	//  160  393:aload_0         
	//  161  394:aload_3         
	//  162  395:checkcast       #179 <Class Double>
	//  163  398:invokevirtual   #183 <Method double Double.doubleValue()>
	//  164  401:invokevirtual   #186 <Method void zzbav.zzb(double)>
			return;
	//  165  404:return          
		}
	}

	private final void zza(zzbbi zzbbi1, Object obj)
	{
		if(zzbbi1.zzada())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #193 <Method boolean zzbbi.zzada()>
	//*   2    6:ifeq            98
		{
			if(!(obj instanceof List))
	//*   3    9:aload_2         
	//*   4   10:instanceof      #195 <Class List>
	//*   5   13:ifne            26
				throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
	//    6   16:new             #197 <Class IllegalArgumentException>
	//    7   19:dup             
	//    8   20:ldc1            #199 <String "Wrong object type used with protocol message reflection.">
	//    9   22:invokespecial   #201 <Method void IllegalArgumentException(String)>
	//   10   25:athrow          
			ArrayList arraylist = new ArrayList();
	//   11   26:new             #203 <Class ArrayList>
	//   12   29:dup             
	//   13   30:invokespecial   #204 <Method void ArrayList()>
	//   14   33:astore          5
			((List) (arraylist)).addAll(((java.util.Collection) ((List)obj)));
	//   15   35:aload           5
	//   16   37:aload_2         
	//   17   38:checkcast       #195 <Class List>
	//   18   41:invokeinterface #208 <Method boolean List.addAll(java.util.Collection)>
	//   19   46:pop             
			obj = ((Object) ((ArrayList)arraylist));
	//   20   47:aload           5
	//   21   49:checkcast       #203 <Class ArrayList>
	//   22   52:astore_2        
			int j = ((ArrayList) (obj)).size();
	//   23   53:aload_2         
	//   24   54:invokevirtual   #211 <Method int ArrayList.size()>
	//   25   57:istore          4
			for(int i = 0; i < j;)
	//*  26   59:iconst_0        
	//*  27   60:istore_3        
	//*  28   61:iload_3         
	//*  29   62:iload           4
	//*  30   64:icmpge          92
			{
				Object obj1 = ((ArrayList) (obj)).get(i);
	//   31   67:aload_2         
	//   32   68:iload_3         
	//   33   69:invokevirtual   #214 <Method Object ArrayList.get(int)>
	//   34   72:astore          6
				i++;
	//   35   74:iload_3         
	//   36   75:iconst_1        
	//   37   76:iadd            
	//   38   77:istore_3        
				zza(zzbbi1.zzacy(), obj1);
	//   39   78:aload_1         
	//   40   79:invokeinterface #218 <Method zzbes zzbbi.zzacy()>
	//   41   84:aload           6
	//   42   86:invokestatic    #221 <Method void zza(zzbes, Object)>
			}

	//*  43   89:goto            61
			obj = ((Object) (arraylist));
	//   44   92:aload           5
	//   45   94:astore_2        
		} else
	//*  46   95:goto            108
		{
			zza(zzbbi1.zzacy(), obj);
	//   47   98:aload_1         
	//   48   99:invokeinterface #218 <Method zzbes zzbbi.zzacy()>
	//   49  104:aload_2         
	//   50  105:invokestatic    #221 <Method void zza(zzbes, Object)>
		}
		if(obj instanceof zzbbx)
	//*  51  108:aload_2         
	//*  52  109:instanceof      #70  <Class zzbbx>
	//*  53  112:ifeq            120
			zzdqz = true;
	//   54  115:aload_0         
	//   55  116:iconst_1        
	//   56  117:putfield        #26  <Field boolean zzdqz>
		zzdqx.zza(((Comparable) (zzbbi1)), obj);
	//   57  120:aload_0         
	//   58  121:getfield        #34  <Field zzbdp zzdqx>
	//   59  124:aload_1         
	//   60  125:aload_2         
	//   61  126:invokevirtual   #224 <Method Object zzbdp.zza(Comparable, Object)>
	//   62  129:pop             
	//   63  130:return          
	}

	private static void zza(zzbes zzbes1, Object obj)
	{
		zzbbq.checkNotNull(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #228 <Method Object zzbbq.checkNotNull(Object)>
	//    2    4:pop             
		int i = zzbbh.zzdrb[zzbes1.zzagl().ordinal()];
	//    3    5:getstatic       #231 <Field int[] zzbbh.zzdrb>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #235 <Method zzbex zzbes.zzagl()>
	//    6   12:invokevirtual   #238 <Method int zzbex.ordinal()>
	//    7   15:iaload          
	//    8   16:istore_2        
		boolean flag1 = true;
	//    9   17:iconst_1        
	//   10   18:istore          4
		boolean flag2 = false;
	//   11   20:iconst_0        
	//   12   21:istore          5
		boolean flag;
		switch(i)
	//*  13   23:iload_2         
		{
	//*  14   24:tableswitch     1 9: default 76
	//	               1 200
	//	               2 192
	//	               3 184
	//	               4 176
	//	               5 168
	//	               6 160
	//	               7 134
	//	               8 108
	//	               9 82
		default:
			flag = flag2;
	//   15   76:iload           5
	//   16   78:istore_3        
			break;

	//*  17   79:goto            208
		case 9: // '\t'
			flag = flag1;
	//   18   82:iload           4
	//   19   84:istore_3        
			if(!(obj instanceof zzbcu))
	//*  20   85:aload_1         
	//*  21   86:instanceof      #53  <Class zzbcu>
	//*  22   89:ifne            131
			{
				flag = flag2;
	//   23   92:iload           5
	//   24   94:istore_3        
				if(obj instanceof zzbbx)
	//*  25   95:aload_1         
	//*  26   96:instanceof      #70  <Class zzbbx>
	//*  27   99:ifeq            208
					flag = flag1;
	//   28  102:iload           4
	//   29  104:istore_3        
			}
			break;

	//*  30  105:goto            131
		case 8: // '\b'
			flag = flag1;
	//   31  108:iload           4
	//   32  110:istore_3        
			if(!(obj instanceof Integer))
	//*  33  111:aload_1         
	//*  34  112:instanceof      #110 <Class Integer>
	//*  35  115:ifne            131
			{
				flag = flag2;
	//   36  118:iload           5
	//   37  120:istore_3        
				if(obj instanceof zzbbr)
	//*  38  121:aload_1         
	//*  39  122:instanceof      #101 <Class zzbbr>
	//*  40  125:ifeq            208
					flag = flag1;
	//   41  128:iload           4
	//   42  130:istore_3        
			}
			break;

	//*  43  131:goto            208
		case 7: // '\007'
			flag = flag1;
	//   44  134:iload           4
	//   45  136:istore_3        
			if(!(obj instanceof zzbah))
	//*  46  137:aload_1         
	//*  47  138:instanceof      #137 <Class zzbah>
	//*  48  141:ifne            131
			{
				flag = flag2;
	//   49  144:iload           5
	//   50  146:istore_3        
				if(obj instanceof byte[])
	//*  51  147:aload_1         
	//*  52  148:instanceof      #143 <Class byte[]>
	//*  53  151:ifeq            208
					flag = flag1;
	//   54  154:iload           4
	//   55  156:istore_3        
			}
			break;

	//*  56  157:goto            131
		case 6: // '\006'
			flag = obj instanceof String;
	//   57  160:aload_1         
	//   58  161:instanceof      #149 <Class String>
	//   59  164:istore_3        
			break;

	//*  60  165:goto            131
		case 5: // '\005'
			flag = obj instanceof Boolean;
	//   61  168:aload_1         
	//   62  169:instanceof      #158 <Class Boolean>
	//   63  172:istore_3        
			break;

	//*  64  173:goto            131
		case 4: // '\004'
			flag = obj instanceof Double;
	//   65  176:aload_1         
	//   66  177:instanceof      #179 <Class Double>
	//   67  180:istore_3        
			break;

	//*  68  181:goto            131
		case 3: // '\003'
			flag = obj instanceof Float;
	//   69  184:aload_1         
	//   70  185:instanceof      #170 <Class Float>
	//   71  188:istore_3        
			break;

	//*  72  189:goto            131
		case 2: // '\002'
			flag = obj instanceof Long;
	//   73  192:aload_1         
	//   74  193:instanceof      #115 <Class Long>
	//   75  196:istore_3        
			break;

	//*  76  197:goto            131
		case 1: // '\001'
			flag = obj instanceof Integer;
	//   77  200:aload_1         
	//   78  201:instanceof      #110 <Class Integer>
	//   79  204:istore_3        
			break;
		}
	//*  80  205:goto            131
		if(!flag)
	//*  81  208:iload_3         
	//*  82  209:ifne            222
			throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
	//   83  212:new             #197 <Class IllegalArgumentException>
	//   84  215:dup             
	//   85  216:ldc1            #199 <String "Wrong object type used with protocol message reflection.">
	//   86  218:invokespecial   #201 <Method void IllegalArgumentException(String)>
	//   87  221:athrow          
		else
			return;
	//   88  222:return          
	}

	public static zzbbg zzacv()
	{
		return zzdra;
	//    0    0:getstatic       #21  <Field zzbbg zzdra>
	//    1    3:areturn         
	}

	private static int zzb(zzbbi zzbbi1, Object obj)
	{
		zzbes zzbes1 = zzbbi1.zzacy();
	//    0    0:aload_0         
	//    1    1:invokeinterface #218 <Method zzbes zzbbi.zzacy()>
	//    2    6:astore          6
		int j = zzbbi1.zzhq();
	//    3    8:aload_0         
	//    4    9:invokeinterface #243 <Method int zzbbi.zzhq()>
	//    5   14:istore          4
		if(zzbbi1.zzada())
	//*   6   16:aload_0         
	//*   7   17:invokeinterface #193 <Method boolean zzbbi.zzada()>
	//*   8   22:ifeq            133
		{
			boolean flag1 = zzbbi1.zzadb();
	//    9   25:aload_0         
	//   10   26:invokeinterface #246 <Method boolean zzbbi.zzadb()>
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
				for(zzbbi1 = ((zzbbi) (((List)obj).iterator())); ((Iterator) (zzbbi1)).hasNext();)
	//*  18   42:aload_1         
	//*  19   43:checkcast       #195 <Class List>
	//*  20   46:invokeinterface #250 <Method Iterator List.iterator()>
	//*  21   51:astore_0        
	//*  22   52:aload_0         
	//*  23   53:invokeinterface #255 <Method boolean Iterator.hasNext()>
	//*  24   58:ifeq            78
					i += zzb(zzbes1, ((Iterator) (zzbbi1)).next());
	//   25   61:iload_2         
	//   26   62:aload           6
	//   27   64:aload_0         
	//   28   65:invokeinterface #259 <Method Object Iterator.next()>
	//   29   70:invokestatic    #63  <Method int zzb(zzbes, Object)>
	//   30   73:iadd            
	//   31   74:istore_2        

	//*  32   75:goto            52
				return zzbav.zzcd(j) + i + zzbav.zzcl(i);
	//   33   78:iload           4
	//   34   80:invokestatic    #45  <Method int zzbav.zzcd(int)>
	//   35   83:iload_2         
	//   36   84:iadd            
	//   37   85:iload_2         
	//   38   86:invokestatic    #262 <Method int zzbav.zzcl(int)>
	//   39   89:iadd            
	//   40   90:ireturn         
			}
			zzbbi1 = ((zzbbi) (((List)obj).iterator()));
	//   41   91:aload_1         
	//   42   92:checkcast       #195 <Class List>
	//   43   95:invokeinterface #250 <Method Iterator List.iterator()>
	//   44  100:astore_0        
			for(i = ((int) (flag)); ((Iterator) (zzbbi1)).hasNext(); i += zza(zzbes1, j, ((Iterator) (zzbbi1)).next()));
	//   45  101:iload_3         
	//   46  102:istore_2        
	//   47  103:aload_0         
	//   48  104:invokeinterface #255 <Method boolean Iterator.hasNext()>
	//   49  109:ifeq            131
	//   50  112:iload_2         
	//   51  113:aload           6
	//   52  115:iload           4
	//   53  117:aload_0         
	//   54  118:invokeinterface #259 <Method Object Iterator.next()>
	//   55  123:invokestatic    #264 <Method int zza(zzbes, int, Object)>
	//   56  126:iadd            
	//   57  127:istore_2        
	//*  58  128:goto            103
			return i;
	//   59  131:iload_2         
	//   60  132:ireturn         
		} else
		{
			return zza(zzbes1, j, obj);
	//   61  133:aload           6
	//   62  135:iload           4
	//   63  137:aload_1         
	//   64  138:invokestatic    #264 <Method int zza(zzbes, int, Object)>
	//   65  141:ireturn         
		}
	}

	private static int zzb(zzbes zzbes1, Object obj)
	{
		switch(zzbbh.zzdql[zzbes1.ordinal()])
	//*   0    0:getstatic       #96  <Field int[] zzbbh.zzdql>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #99  <Method int zzbes.ordinal()>
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
	//    5   96:new             #267 <Class RuntimeException>
	//    6   99:dup             
	//    7  100:ldc2            #269 <String "There is no way to get here, but the compiler thinks otherwise.">
	//    8  103:invokespecial   #270 <Method void RuntimeException(String)>
	//    9  106:athrow          

		case 18: // '\022'
			if(obj instanceof zzbbr)
	//*  10  107:aload_1         
	//*  11  108:instanceof      #101 <Class zzbbr>
	//*  12  111:ifeq            127
				return zzbav.zzcj(((zzbbr)obj).zzhq());
	//   13  114:aload_1         
	//   14  115:checkcast       #101 <Class zzbbr>
	//   15  118:invokeinterface #104 <Method int zzbbr.zzhq()>
	//   16  123:invokestatic    #273 <Method int zzbav.zzcj(int)>
	//   17  126:ireturn         
			else
				return zzbav.zzcj(((Integer)obj).intValue());
	//   18  127:aload_1         
	//   19  128:checkcast       #110 <Class Integer>
	//   20  131:invokevirtual   #113 <Method int Integer.intValue()>
	//   21  134:invokestatic    #273 <Method int zzbav.zzcj(int)>
	//   22  137:ireturn         

		case 17: // '\021'
			return zzbav.zzr(((Long)obj).longValue());
	//   23  138:aload_1         
	//   24  139:checkcast       #115 <Class Long>
	//   25  142:invokevirtual   #119 <Method long Long.longValue()>
	//   26  145:invokestatic    #277 <Method int zzbav.zzr(long)>
	//   27  148:ireturn         

		case 16: // '\020'
			return zzbav.zzcg(((Integer)obj).intValue());
	//   28  149:aload_1         
	//   29  150:checkcast       #110 <Class Integer>
	//   30  153:invokevirtual   #113 <Method int Integer.intValue()>
	//   31  156:invokestatic    #280 <Method int zzbav.zzcg(int)>
	//   32  159:ireturn         

		case 15: // '\017'
			return zzbav.zzt(((Long)obj).longValue());
	//   33  160:aload_1         
	//   34  161:checkcast       #115 <Class Long>
	//   35  164:invokevirtual   #119 <Method long Long.longValue()>
	//   36  167:invokestatic    #283 <Method int zzbav.zzt(long)>
	//   37  170:ireturn         

		case 14: // '\016'
			return zzbav.zzci(((Integer)obj).intValue());
	//   38  171:aload_1         
	//   39  172:checkcast       #110 <Class Integer>
	//   40  175:invokevirtual   #113 <Method int Integer.intValue()>
	//   41  178:invokestatic    #286 <Method int zzbav.zzci(int)>
	//   42  181:ireturn         

		case 13: // '\r'
			return zzbav.zzcf(((Integer)obj).intValue());
	//   43  182:aload_1         
	//   44  183:checkcast       #110 <Class Integer>
	//   45  186:invokevirtual   #113 <Method int Integer.intValue()>
	//   46  189:invokestatic    #289 <Method int zzbav.zzcf(int)>
	//   47  192:ireturn         

		case 12: // '\f'
			if(obj instanceof zzbah)
	//*  48  193:aload_1         
	//*  49  194:instanceof      #137 <Class zzbah>
	//*  50  197:ifeq            208
				return zzbav.zzao((zzbah)obj);
	//   51  200:aload_1         
	//   52  201:checkcast       #137 <Class zzbah>
	//   53  204:invokestatic    #293 <Method int zzbav.zzao(zzbah)>
	//   54  207:ireturn         
			else
				return zzbav.zzr((byte[])obj);
	//   55  208:aload_1         
	//   56  209:checkcast       #143 <Class byte[]>
	//   57  212:invokestatic    #296 <Method int zzbav.zzr(byte[])>
	//   58  215:ireturn         

		case 11: // '\013'
			if(obj instanceof zzbah)
	//*  59  216:aload_1         
	//*  60  217:instanceof      #137 <Class zzbah>
	//*  61  220:ifeq            231
				return zzbav.zzao((zzbah)obj);
	//   62  223:aload_1         
	//   63  224:checkcast       #137 <Class zzbah>
	//   64  227:invokestatic    #293 <Method int zzbav.zzao(zzbah)>
	//   65  230:ireturn         
			else
				return zzbav.zzeo((String)obj);
	//   66  231:aload_1         
	//   67  232:checkcast       #149 <Class String>
	//   68  235:invokestatic    #300 <Method int zzbav.zzeo(String)>
	//   69  238:ireturn         

		case 10: // '\n'
			if(obj instanceof zzbbx)
	//*  70  239:aload_1         
	//*  71  240:instanceof      #70  <Class zzbbx>
	//*  72  243:ifeq            254
				return zzbav.zza(((zzbcb) ((zzbbx)obj)));
	//   73  246:aload_1         
	//   74  247:checkcast       #70  <Class zzbbx>
	//   75  250:invokestatic    #303 <Method int zzbav.zza(zzbcb)>
	//   76  253:ireturn         
			else
				return zzbav.zzf((zzbcu)obj);
	//   77  254:aload_1         
	//   78  255:checkcast       #53  <Class zzbcu>
	//   79  258:invokestatic    #307 <Method int zzbav.zzf(zzbcu)>
	//   80  261:ireturn         

		case 9: // '\t'
			return zzbav.zzg((zzbcu)obj);
	//   81  262:aload_1         
	//   82  263:checkcast       #53  <Class zzbcu>
	//   83  266:invokestatic    #310 <Method int zzbav.zzg(zzbcu)>
	//   84  269:ireturn         

		case 8: // '\b'
			return zzbav.zzaq(((Boolean)obj).booleanValue());
	//   85  270:aload_1         
	//   86  271:checkcast       #158 <Class Boolean>
	//   87  274:invokevirtual   #162 <Method boolean Boolean.booleanValue()>
	//   88  277:invokestatic    #314 <Method int zzbav.zzaq(boolean)>
	//   89  280:ireturn         

		case 7: // '\007'
			return zzbav.zzch(((Integer)obj).intValue());
	//   90  281:aload_1         
	//   91  282:checkcast       #110 <Class Integer>
	//   92  285:invokevirtual   #113 <Method int Integer.intValue()>
	//   93  288:invokestatic    #317 <Method int zzbav.zzch(int)>
	//   94  291:ireturn         

		case 6: // '\006'
			return zzbav.zzs(((Long)obj).longValue());
	//   95  292:aload_1         
	//   96  293:checkcast       #115 <Class Long>
	//   97  296:invokevirtual   #119 <Method long Long.longValue()>
	//   98  299:invokestatic    #320 <Method int zzbav.zzs(long)>
	//   99  302:ireturn         

		case 5: // '\005'
			return zzbav.zzce(((Integer)obj).intValue());
	//  100  303:aload_1         
	//  101  304:checkcast       #110 <Class Integer>
	//  102  307:invokevirtual   #113 <Method int Integer.intValue()>
	//  103  310:invokestatic    #323 <Method int zzbav.zzce(int)>
	//  104  313:ireturn         

		case 4: // '\004'
			return zzbav.zzq(((Long)obj).longValue());
	//  105  314:aload_1         
	//  106  315:checkcast       #115 <Class Long>
	//  107  318:invokevirtual   #119 <Method long Long.longValue()>
	//  108  321:invokestatic    #326 <Method int zzbav.zzq(long)>
	//  109  324:ireturn         

		case 3: // '\003'
			return zzbav.zzp(((Long)obj).longValue());
	//  110  325:aload_1         
	//  111  326:checkcast       #115 <Class Long>
	//  112  329:invokevirtual   #119 <Method long Long.longValue()>
	//  113  332:invokestatic    #329 <Method int zzbav.zzp(long)>
	//  114  335:ireturn         

		case 2: // '\002'
			return zzbav.zzc(((Float)obj).floatValue());
	//  115  336:aload_1         
	//  116  337:checkcast       #170 <Class Float>
	//  117  340:invokevirtual   #174 <Method float Float.floatValue()>
	//  118  343:invokestatic    #333 <Method int zzbav.zzc(float)>
	//  119  346:ireturn         

		case 1: // '\001'
			return zzbav.zzc(((Double)obj).doubleValue());
	//  120  347:aload_1         
	//  121  348:checkcast       #179 <Class Double>
	//  122  351:invokevirtual   #183 <Method double Double.doubleValue()>
	//  123  354:invokestatic    #336 <Method int zzbav.zzc(double)>
	//  124  357:ireturn         
		}
	}

	private static boolean zzb(java.util.Map.Entry entry)
	{
label0:
		{
			zzbbi zzbbi1 = (zzbbi)entry.getKey();
	//    0    0:aload_0         
	//    1    1:invokeinterface #342 <Method Object java.util.Map$Entry.getKey()>
	//    2    6:checkcast       #190 <Class zzbbi>
	//    3    9:astore_1        
			if(zzbbi1.zzacz() != zzbex.zzebd)
				break label0;
	//    4   10:aload_1         
	//    5   11:invokeinterface #345 <Method zzbex zzbbi.zzacz()>
	//    6   16:getstatic       #349 <Field zzbex zzbex.zzebd>
	//    7   19:if_acmpne       121
			if(zzbbi1.zzada())
	//*   8   22:aload_1         
	//*   9   23:invokeinterface #193 <Method boolean zzbbi.zzada()>
	//*  10   28:ifeq            74
			{
				entry = ((java.util.Map.Entry) (((List)entry.getValue()).iterator()));
	//   11   31:aload_0         
	//   12   32:invokeinterface #352 <Method Object java.util.Map$Entry.getValue()>
	//   13   37:checkcast       #195 <Class List>
	//   14   40:invokeinterface #250 <Method Iterator List.iterator()>
	//   15   45:astore_0        
				do
					if(!((Iterator) (entry)).hasNext())
						break label0;
	//   16   46:aload_0         
	//   17   47:invokeinterface #255 <Method boolean Iterator.hasNext()>
	//   18   52:ifeq            121
				while(((zzbcu)((Iterator) (entry)).next()).isInitialized());
	//   19   55:aload_0         
	//   20   56:invokeinterface #259 <Method Object Iterator.next()>
	//   21   61:checkcast       #53  <Class zzbcu>
	//   22   64:invokeinterface #355 <Method boolean zzbcu.isInitialized()>
	//   23   69:ifne            46
				return false;
	//   24   72:iconst_0        
	//   25   73:ireturn         
			}
			entry = ((java.util.Map.Entry) (entry.getValue()));
	//   26   74:aload_0         
	//   27   75:invokeinterface #352 <Method Object java.util.Map$Entry.getValue()>
	//   28   80:astore_0        
			if(entry instanceof zzbcu)
	//*  29   81:aload_0         
	//*  30   82:instanceof      #53  <Class zzbcu>
	//*  31   85:ifeq            102
			{
				if(!((zzbcu)entry).isInitialized())
	//*  32   88:aload_0         
	//*  33   89:checkcast       #53  <Class zzbcu>
	//*  34   92:invokeinterface #355 <Method boolean zzbcu.isInitialized()>
	//*  35   97:ifne            121
					return false;
	//   36  100:iconst_0        
	//   37  101:ireturn         
			} else
			if(entry instanceof zzbbx)
	//*  38  102:aload_0         
	//*  39  103:instanceof      #70  <Class zzbbx>
	//*  40  106:ifeq            111
				return true;
	//   41  109:iconst_1        
	//   42  110:ireturn         
			else
				throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
	//   43  111:new             #197 <Class IllegalArgumentException>
	//   44  114:dup             
	//   45  115:ldc1            #199 <String "Wrong object type used with protocol message reflection.">
	//   46  117:invokespecial   #201 <Method void IllegalArgumentException(String)>
	//   47  120:athrow          
		}
		return true;
	//   48  121:iconst_1        
	//   49  122:ireturn         
	}

	private final void zzc(java.util.Map.Entry entry)
	{
		zzbbi zzbbi1 = (zzbbi)entry.getKey();
	//    0    0:aload_1         
	//    1    1:invokeinterface #342 <Method Object java.util.Map$Entry.getKey()>
	//    2    6:checkcast       #190 <Class zzbbi>
	//    3    9:astore          4
		Object obj = entry.getValue();
	//    4   11:aload_1         
	//    5   12:invokeinterface #352 <Method Object java.util.Map$Entry.getValue()>
	//    6   17:astore_2        
		entry = ((java.util.Map.Entry) (obj));
	//    7   18:aload_2         
	//    8   19:astore_1        
		if(obj instanceof zzbbx)
	//*   9   20:aload_2         
	//*  10   21:instanceof      #70  <Class zzbbx>
	//*  11   24:ifeq            31
			entry = ((java.util.Map.Entry) (zzbbx.zzadu()));
	//   12   27:invokestatic    #74  <Method zzbcu zzbbx.zzadu()>
	//   13   30:astore_1        
		if(zzbbi1.zzada())
	//*  14   31:aload           4
	//*  15   33:invokeinterface #193 <Method boolean zzbbi.zzada()>
	//*  16   38:ifeq            117
		{
			Object obj3 = zza(zzbbi1);
	//   17   41:aload_0         
	//   18   42:aload           4
	//   19   44:invokespecial   #359 <Method Object zza(zzbbi)>
	//   20   47:astore_3        
			Object obj1 = obj3;
	//   21   48:aload_3         
	//   22   49:astore_2        
			if(obj3 == null)
	//*  23   50:aload_3         
	//*  24   51:ifnonnull       62
				obj1 = ((Object) (new ArrayList()));
	//   25   54:new             #203 <Class ArrayList>
	//   26   57:dup             
	//   27   58:invokespecial   #204 <Method void ArrayList()>
	//   28   61:astore_2        
			Object obj4;
			for(entry = ((java.util.Map.Entry) (((List)entry).iterator())); ((Iterator) (entry)).hasNext(); ((List)obj1).add(zzp(obj4)))
	//*  29   62:aload_1         
	//*  30   63:checkcast       #195 <Class List>
	//*  31   66:invokeinterface #250 <Method Iterator List.iterator()>
	//*  32   71:astore_1        
	//*  33   72:aload_1         
	//*  34   73:invokeinterface #255 <Method boolean Iterator.hasNext()>
	//*  35   78:ifeq            105
				obj4 = ((Iterator) (entry)).next();
	//   36   81:aload_1         
	//   37   82:invokeinterface #259 <Method Object Iterator.next()>
	//   38   87:astore_3        

	//   39   88:aload_2         
	//   40   89:checkcast       #195 <Class List>
	//   41   92:aload_3         
	//   42   93:invokestatic    #361 <Method Object zzp(Object)>
	//   43   96:invokeinterface #365 <Method boolean List.add(Object)>
	//   44  101:pop             
	//*  45  102:goto            72
			zzdqx.zza(((Comparable) (zzbbi1)), obj1);
	//   46  105:aload_0         
	//   47  106:getfield        #34  <Field zzbdp zzdqx>
	//   48  109:aload           4
	//   49  111:aload_2         
	//   50  112:invokevirtual   #224 <Method Object zzbdp.zza(Comparable, Object)>
	//   51  115:pop             
			return;
	//   52  116:return          
		}
		if(zzbbi1.zzacz() == zzbex.zzebd)
	//*  53  117:aload           4
	//*  54  119:invokeinterface #345 <Method zzbex zzbbi.zzacz()>
	//*  55  124:getstatic       #349 <Field zzbex zzbex.zzebd>
	//*  56  127:if_acmpne       220
		{
			Object obj2 = zza(zzbbi1);
	//   57  130:aload_0         
	//   58  131:aload           4
	//   59  133:invokespecial   #359 <Method Object zza(zzbbi)>
	//   60  136:astore_2        
			if(obj2 == null)
	//*  61  137:aload_2         
	//*  62  138:ifnonnull       156
			{
				zzdqx.zza(((Comparable) (zzbbi1)), zzp(((Object) (entry))));
	//   63  141:aload_0         
	//   64  142:getfield        #34  <Field zzbdp zzdqx>
	//   65  145:aload           4
	//   66  147:aload_1         
	//   67  148:invokestatic    #361 <Method Object zzp(Object)>
	//   68  151:invokevirtual   #224 <Method Object zzbdp.zza(Comparable, Object)>
	//   69  154:pop             
				return;
	//   70  155:return          
			}
			if(obj2 instanceof zzbdb)
	//*  71  156:aload_2         
	//*  72  157:instanceof      #367 <Class zzbdb>
	//*  73  160:ifeq            182
				entry = ((java.util.Map.Entry) (zzbbi1.zza((zzbdb)obj2, (zzbdb)entry)));
	//   74  163:aload           4
	//   75  165:aload_2         
	//   76  166:checkcast       #367 <Class zzbdb>
	//   77  169:aload_1         
	//   78  170:checkcast       #367 <Class zzbdb>
	//   79  173:invokeinterface #370 <Method zzbdb zzbbi.zza(zzbdb, zzbdb)>
	//   80  178:astore_1        
			else
	//*  81  179:goto            208
				entry = ((java.util.Map.Entry) (zzbbi1.zza(((zzbcu)obj2).zzade(), (zzbcu)entry).zzadk()));
	//   82  182:aload           4
	//   83  184:aload_2         
	//   84  185:checkcast       #53  <Class zzbcu>
	//   85  188:invokeinterface #374 <Method zzbcv zzbcu.zzade()>
	//   86  193:aload_1         
	//   87  194:checkcast       #53  <Class zzbcu>
	//   88  197:invokeinterface #377 <Method zzbcv zzbbi.zza(zzbcv, zzbcu)>
	//   89  202:invokeinterface #382 <Method zzbcu zzbcv.zzadk()>
	//   90  207:astore_1        
			zzdqx.zza(((Comparable) (zzbbi1)), ((Object) (entry)));
	//   91  208:aload_0         
	//   92  209:getfield        #34  <Field zzbdp zzdqx>
	//   93  212:aload           4
	//   94  214:aload_1         
	//   95  215:invokevirtual   #224 <Method Object zzbdp.zza(Comparable, Object)>
	//   96  218:pop             
			return;
	//   97  219:return          
		} else
		{
			zzdqx.zza(((Comparable) (zzbbi1)), zzp(((Object) (entry))));
	//   98  220:aload_0         
	//   99  221:getfield        #34  <Field zzbdp zzdqx>
	//  100  224:aload           4
	//  101  226:aload_1         
	//  102  227:invokestatic    #361 <Method Object zzp(Object)>
	//  103  230:invokevirtual   #224 <Method Object zzbdp.zza(Comparable, Object)>
	//  104  233:pop             
			return;
	//  105  234:return          
		}
	}

	private static int zzd(java.util.Map.Entry entry)
	{
		zzbbi zzbbi1 = (zzbbi)entry.getKey();
	//    0    0:aload_0         
	//    1    1:invokeinterface #342 <Method Object java.util.Map$Entry.getKey()>
	//    2    6:checkcast       #190 <Class zzbbi>
	//    3    9:astore_1        
		Object obj = entry.getValue();
	//    4   10:aload_0         
	//    5   11:invokeinterface #352 <Method Object java.util.Map$Entry.getValue()>
	//    6   16:astore_2        
		if(zzbbi1.zzacz() == zzbex.zzebd && !zzbbi1.zzada() && !zzbbi1.zzadb())
	//*   7   17:aload_1         
	//*   8   18:invokeinterface #345 <Method zzbex zzbbi.zzacz()>
	//*   9   23:getstatic       #349 <Field zzbex zzbex.zzebd>
	//*  10   26:if_acmpne       98
	//*  11   29:aload_1         
	//*  12   30:invokeinterface #193 <Method boolean zzbbi.zzada()>
	//*  13   35:ifne            98
	//*  14   38:aload_1         
	//*  15   39:invokeinterface #246 <Method boolean zzbbi.zzadb()>
	//*  16   44:ifne            98
		{
			if(obj instanceof zzbbx)
	//*  17   47:aload_2         
	//*  18   48:instanceof      #70  <Class zzbbx>
	//*  19   51:ifeq            76
				return zzbav.zzb(((zzbbi)entry.getKey()).zzhq(), ((zzbcb) ((zzbbx)obj)));
	//   20   54:aload_0         
	//   21   55:invokeinterface #342 <Method Object java.util.Map$Entry.getKey()>
	//   22   60:checkcast       #190 <Class zzbbi>
	//   23   63:invokeinterface #243 <Method int zzbbi.zzhq()>
	//   24   68:aload_2         
	//   25   69:checkcast       #70  <Class zzbbx>
	//   26   72:invokestatic    #388 <Method int zzbav.zzb(int, zzbcb)>
	//   27   75:ireturn         
			else
				return zzbav.zzb(((zzbbi)entry.getKey()).zzhq(), (zzbcu)obj);
	//   28   76:aload_0         
	//   29   77:invokeinterface #342 <Method Object java.util.Map$Entry.getKey()>
	//   30   82:checkcast       #190 <Class zzbbi>
	//   31   85:invokeinterface #243 <Method int zzbbi.zzhq()>
	//   32   90:aload_2         
	//   33   91:checkcast       #53  <Class zzbcu>
	//   34   94:invokestatic    #391 <Method int zzbav.zzb(int, zzbcu)>
	//   35   97:ireturn         
		} else
		{
			return zzb(zzbbi1, obj);
	//   36   98:aload_1         
	//   37   99:aload_2         
	//   38  100:invokestatic    #393 <Method int zzb(zzbbi, Object)>
	//   39  103:ireturn         
		}
	}

	private static Object zzp(Object obj)
	{
		if(obj instanceof zzbdb)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #367 <Class zzbdb>
	//*   2    4:ifeq            17
			return ((Object) (((zzbdb)obj).zzaek()));
	//    3    7:aload_0         
	//    4    8:checkcast       #367 <Class zzbdb>
	//    5   11:invokeinterface #398 <Method zzbdb zzbdb.zzaek()>
	//    6   16:areturn         
		if(obj instanceof byte[])
	//*   7   17:aload_0         
	//*   8   18:instanceof      #143 <Class byte[]>
	//*   9   21:ifeq            45
		{
			obj = ((Object) ((byte[])obj));
	//   10   24:aload_0         
	//   11   25:checkcast       #143 <Class byte[]>
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
	//   23   40:invokestatic    #404 <Method void System.arraycopy(Object, int, Object, int, int)>
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
		zzbbg zzbbg1 = new zzbbg();
	//    0    0:new             #2   <Class zzbbg>
	//    1    3:dup             
	//    2    4:invokespecial   #408 <Method void zzbbg()>
	//    3    7:astore_2        
		for(int i = 0; i < zzdqx.zzafs(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #34  <Field zzbdp zzdqx>
	//*   9   15:invokevirtual   #411 <Method int zzbdp.zzafs()>
	//*  10   18:icmpge          56
		{
			java.util.Map.Entry entry = zzdqx.zzcy(i);
	//   11   21:aload_0         
	//   12   22:getfield        #34  <Field zzbdp zzdqx>
	//   13   25:iload_1         
	//   14   26:invokevirtual   #415 <Method java.util.Map$Entry zzbdp.zzcy(int)>
	//   15   29:astore_3        
			zzbbg1.zza((zzbbi)entry.getKey(), entry.getValue());
	//   16   30:aload_2         
	//   17   31:aload_3         
	//   18   32:invokeinterface #342 <Method Object java.util.Map$Entry.getKey()>
	//   19   37:checkcast       #190 <Class zzbbi>
	//   20   40:aload_3         
	//   21   41:invokeinterface #352 <Method Object java.util.Map$Entry.getValue()>
	//   22   46:invokespecial   #417 <Method void zza(zzbbi, Object)>
		}

	//   23   49:iload_1         
	//   24   50:iconst_1        
	//   25   51:iadd            
	//   26   52:istore_1        
	//*  27   53:goto            10
		java.util.Map.Entry entry1;
		for(Iterator iterator1 = zzdqx.zzaft().iterator(); iterator1.hasNext(); zzbbg1.zza((zzbbi)entry1.getKey(), entry1.getValue()))
	//*  28   56:aload_0         
	//*  29   57:getfield        #34  <Field zzbdp zzdqx>
	//*  30   60:invokevirtual   #421 <Method Iterable zzbdp.zzaft()>
	//*  31   63:invokeinterface #424 <Method Iterator Iterable.iterator()>
	//*  32   68:astore_3        
	//*  33   69:aload_3         
	//*  34   70:invokeinterface #255 <Method boolean Iterator.hasNext()>
	//*  35   75:ifeq            113
			entry1 = (java.util.Map.Entry)iterator1.next();
	//   36   78:aload_3         
	//   37   79:invokeinterface #259 <Method Object Iterator.next()>
	//   38   84:checkcast       #339 <Class java.util.Map$Entry>
	//   39   87:astore          4

	//   40   89:aload_2         
	//   41   90:aload           4
	//   42   92:invokeinterface #342 <Method Object java.util.Map$Entry.getKey()>
	//   43   97:checkcast       #190 <Class zzbbi>
	//   44  100:aload           4
	//   45  102:invokeinterface #352 <Method Object java.util.Map$Entry.getValue()>
	//   46  107:invokespecial   #417 <Method void zza(zzbbi, Object)>
	//*  47  110:goto            69
		zzbbg1.zzdqz = zzdqz;
	//   48  113:aload_2         
	//   49  114:aload_0         
	//   50  115:getfield        #26  <Field boolean zzdqz>
	//   51  118:putfield        #26  <Field boolean zzdqz>
		return ((Object) (zzbbg1));
	//   52  121:aload_2         
	//   53  122:areturn         
	}

	final Iterator descendingIterator()
	{
		if(zzdqz)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean zzdqz>
	//*   2    4:ifeq            27
			return ((Iterator) (new zzbca(zzdqx.zzafu().iterator())));
	//    3    7:new             #427 <Class zzbca>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #34  <Field zzbdp zzdqx>
	//    7   15:invokevirtual   #431 <Method Set zzbdp.zzafu()>
	//    8   18:invokeinterface #434 <Method Iterator Set.iterator()>
	//    9   23:invokespecial   #437 <Method void zzbca(Iterator)>
	//   10   26:areturn         
		else
			return zzdqx.zzafu().iterator();
	//   11   27:aload_0         
	//   12   28:getfield        #34  <Field zzbdp zzdqx>
	//   13   31:invokevirtual   #431 <Method Set zzbdp.zzafu()>
	//   14   34:invokeinterface #434 <Method Iterator Set.iterator()>
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
		if(!(obj instanceof zzbbg))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzbbg>
	//*   7   11:ifne            16
		{
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		} else
		{
			obj = ((Object) ((zzbbg)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzbbg>
	//   12   20:astore_1        
			return zzdqx.equals(((Object) (((zzbbg) (obj)).zzdqx)));
	//   13   21:aload_0         
	//   14   22:getfield        #34  <Field zzbdp zzdqx>
	//   15   25:aload_1         
	//   16   26:getfield        #34  <Field zzbdp zzdqx>
	//   17   29:invokevirtual   #441 <Method boolean zzbdp.equals(Object)>
	//   18   32:ireturn         
		}
	}

	public final int hashCode()
	{
		return zzdqx.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field zzbdp zzdqx>
	//    2    4:invokevirtual   #444 <Method int zzbdp.hashCode()>
	//    3    7:ireturn         
	}

	final boolean isEmpty()
	{
		return zzdqx.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field zzbdp zzdqx>
	//    2    4:invokevirtual   #447 <Method boolean zzbdp.isEmpty()>
	//    3    7:ireturn         
	}

	public final boolean isImmutable()
	{
		return zzdqy;
	//    0    0:aload_0         
	//    1    1:getfield        #450 <Field boolean zzdqy>
	//    2    4:ireturn         
	}

	public final boolean isInitialized()
	{
		for(int i = 0; i < zzdqx.zzafs(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #34  <Field zzbdp zzdqx>
	//*   5    7:invokevirtual   #411 <Method int zzbdp.zzafs()>
	//*   6   10:icmpge          36
			if(!zzb(zzdqx.zzcy(i)))
	//*   7   13:aload_0         
	//*   8   14:getfield        #34  <Field zzbdp zzdqx>
	//*   9   17:iload_1         
	//*  10   18:invokevirtual   #415 <Method java.util.Map$Entry zzbdp.zzcy(int)>
	//*  11   21:invokestatic    #452 <Method boolean zzb(java.util.Map$Entry)>
	//*  12   24:ifne            29
				return false;
	//   13   27:iconst_0        
	//   14   28:ireturn         

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            2
		for(Iterator iterator1 = zzdqx.zzaft().iterator(); iterator1.hasNext();)
	//*  20   36:aload_0         
	//*  21   37:getfield        #34  <Field zzbdp zzdqx>
	//*  22   40:invokevirtual   #421 <Method Iterable zzbdp.zzaft()>
	//*  23   43:invokeinterface #424 <Method Iterator Iterable.iterator()>
	//*  24   48:astore_2        
	//*  25   49:aload_2         
	//*  26   50:invokeinterface #255 <Method boolean Iterator.hasNext()>
	//*  27   55:ifeq            75
			if(!zzb((java.util.Map.Entry)iterator1.next()))
	//*  28   58:aload_2         
	//*  29   59:invokeinterface #259 <Method Object Iterator.next()>
	//*  30   64:checkcast       #339 <Class java.util.Map$Entry>
	//*  31   67:invokestatic    #452 <Method boolean zzb(java.util.Map$Entry)>
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
		if(zzdqz)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean zzdqz>
	//*   2    4:ifeq            27
			return ((Iterator) (new zzbca(zzdqx.entrySet().iterator())));
	//    3    7:new             #427 <Class zzbca>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #34  <Field zzbdp zzdqx>
	//    7   15:invokevirtual   #455 <Method Set zzbdp.entrySet()>
	//    8   18:invokeinterface #434 <Method Iterator Set.iterator()>
	//    9   23:invokespecial   #437 <Method void zzbca(Iterator)>
	//   10   26:areturn         
		else
			return zzdqx.entrySet().iterator();
	//   11   27:aload_0         
	//   12   28:getfield        #34  <Field zzbdp zzdqx>
	//   13   31:invokevirtual   #455 <Method Set zzbdp.entrySet()>
	//   14   34:invokeinterface #434 <Method Iterator Set.iterator()>
	//   15   39:areturn         
	}

	public final void zza(zzbbg zzbbg1)
	{
		for(int i = 0; i < zzbbg1.zzdqx.zzafs(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:getfield        #34  <Field zzbdp zzdqx>
	//*   5    7:invokevirtual   #411 <Method int zzbdp.zzafs()>
	//*   6   10:icmpge          32
			zzc(zzbbg1.zzdqx.zzcy(i));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #34  <Field zzbdp zzdqx>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #415 <Method java.util.Map$Entry zzbdp.zzcy(int)>
	//   12   22:invokespecial   #458 <Method void zzc(java.util.Map$Entry)>

	//   13   25:iload_2         
	//   14   26:iconst_1        
	//   15   27:iadd            
	//   16   28:istore_2        
	//*  17   29:goto            2
		for(zzbbg1 = ((zzbbg) (zzbbg1.zzdqx.zzaft().iterator())); ((Iterator) (zzbbg1)).hasNext(); zzc((java.util.Map.Entry)((Iterator) (zzbbg1)).next()));
	//   18   32:aload_1         
	//   19   33:getfield        #34  <Field zzbdp zzdqx>
	//   20   36:invokevirtual   #421 <Method Iterable zzbdp.zzaft()>
	//   21   39:invokeinterface #424 <Method Iterator Iterable.iterator()>
	//   22   44:astore_1        
	//   23   45:aload_1         
	//   24   46:invokeinterface #255 <Method boolean Iterator.hasNext()>
	//   25   51:ifeq            70
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:invokeinterface #259 <Method Object Iterator.next()>
	//   29   61:checkcast       #339 <Class java.util.Map$Entry>
	//   30   64:invokespecial   #458 <Method void zzc(java.util.Map$Entry)>
	//*  31   67:goto            45
	//   32   70:return          
	}

	public final void zzaaz()
	{
		if(zzdqy)
	//*   0    0:aload_0         
	//*   1    1:getfield        #450 <Field boolean zzdqy>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			zzdqx.zzaaz();
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field zzbdp zzdqx>
	//    6   12:invokevirtual   #460 <Method void zzbdp.zzaaz()>
			zzdqy = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #450 <Field boolean zzdqy>
			return;
	//   10   20:return          
		}
	}

	public final int zzacw()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		for(; j < zzdqx.zzafs(); j++)
	//*   4    4:iload_2         
	//*   5    5:aload_0         
	//*   6    6:getfield        #34  <Field zzbdp zzdqx>
	//*   7    9:invokevirtual   #411 <Method int zzbdp.zzafs()>
	//*   8   12:icmpge          52
		{
			java.util.Map.Entry entry = zzdqx.zzcy(j);
	//    9   15:aload_0         
	//   10   16:getfield        #34  <Field zzbdp zzdqx>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #415 <Method java.util.Map$Entry zzbdp.zzcy(int)>
	//   13   23:astore_3        
			i += zzb((zzbbi)entry.getKey(), entry.getValue());
	//   14   24:iload_1         
	//   15   25:aload_3         
	//   16   26:invokeinterface #342 <Method Object java.util.Map$Entry.getKey()>
	//   17   31:checkcast       #190 <Class zzbbi>
	//   18   34:aload_3         
	//   19   35:invokeinterface #352 <Method Object java.util.Map$Entry.getValue()>
	//   20   40:invokestatic    #393 <Method int zzb(zzbbi, Object)>
	//   21   43:iadd            
	//   22   44:istore_1        
		}

	//   23   45:iload_2         
	//   24   46:iconst_1        
	//   25   47:iadd            
	//   26   48:istore_2        
	//*  27   49:goto            4
		for(Iterator iterator1 = zzdqx.zzaft().iterator(); iterator1.hasNext();)
	//*  28   52:aload_0         
	//*  29   53:getfield        #34  <Field zzbdp zzdqx>
	//*  30   56:invokevirtual   #421 <Method Iterable zzbdp.zzaft()>
	//*  31   59:invokeinterface #424 <Method Iterator Iterable.iterator()>
	//*  32   64:astore_3        
	//*  33   65:aload_3         
	//*  34   66:invokeinterface #255 <Method boolean Iterator.hasNext()>
	//*  35   71:ifeq            111
		{
			java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator1.next();
	//   36   74:aload_3         
	//   37   75:invokeinterface #259 <Method Object Iterator.next()>
	//   38   80:checkcast       #339 <Class java.util.Map$Entry>
	//   39   83:astore          4
			i += zzb((zzbbi)entry1.getKey(), entry1.getValue());
	//   40   85:iload_1         
	//   41   86:aload           4
	//   42   88:invokeinterface #342 <Method Object java.util.Map$Entry.getKey()>
	//   43   93:checkcast       #190 <Class zzbbi>
	//   44   96:aload           4
	//   45   98:invokeinterface #352 <Method Object java.util.Map$Entry.getValue()>
	//   46  103:invokestatic    #393 <Method int zzb(zzbbi, Object)>
	//   47  106:iadd            
	//   48  107:istore_1        
		}

	//*  49  108:goto            65
		return i;
	//   50  111:iload_1         
	//   51  112:ireturn         
	}

	public final int zzacx()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		for(; j < zzdqx.zzafs(); j++)
	//*   4    4:iload_2         
	//*   5    5:aload_0         
	//*   6    6:getfield        #34  <Field zzbdp zzdqx>
	//*   7    9:invokevirtual   #411 <Method int zzbdp.zzafs()>
	//*   8   12:icmpge          36
			i += zzd(zzdqx.zzcy(j));
	//    9   15:iload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field zzbdp zzdqx>
	//   12   20:iload_2         
	//   13   21:invokevirtual   #415 <Method java.util.Map$Entry zzbdp.zzcy(int)>
	//   14   24:invokestatic    #464 <Method int zzd(java.util.Map$Entry)>
	//   15   27:iadd            
	//   16   28:istore_1        

	//   17   29:iload_2         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_2        
	//*  21   33:goto            4
		for(Iterator iterator1 = zzdqx.zzaft().iterator(); iterator1.hasNext();)
	//*  22   36:aload_0         
	//*  23   37:getfield        #34  <Field zzbdp zzdqx>
	//*  24   40:invokevirtual   #421 <Method Iterable zzbdp.zzaft()>
	//*  25   43:invokeinterface #424 <Method Iterator Iterable.iterator()>
	//*  26   48:astore_3        
	//*  27   49:aload_3         
	//*  28   50:invokeinterface #255 <Method boolean Iterator.hasNext()>
	//*  29   55:ifeq            76
			i += zzd((java.util.Map.Entry)iterator1.next());
	//   30   58:iload_1         
	//   31   59:aload_3         
	//   32   60:invokeinterface #259 <Method Object Iterator.next()>
	//   33   65:checkcast       #339 <Class java.util.Map$Entry>
	//   34   68:invokestatic    #464 <Method int zzd(java.util.Map$Entry)>
	//   35   71:iadd            
	//   36   72:istore_1        

	//*  37   73:goto            49
		return i;
	//   38   76:iload_1         
	//   39   77:ireturn         
	}

	private static final zzbbg zzdra = new zzbbg(true);
	private final zzbdp zzdqx;
	private boolean zzdqy;
	private boolean zzdqz;

	static 
	{
	//    0    0:new             #2   <Class zzbbg>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #19  <Method void zzbbg(boolean)>
	//    4    8:putstatic       #21  <Field zzbbg zzdra>
	//*   5   11:return          
	}
}
