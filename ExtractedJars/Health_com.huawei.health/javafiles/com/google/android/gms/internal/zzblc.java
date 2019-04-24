// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzbld

public final class zzblc
{
	public static class zza
	{

		public final zzbld zzbVs;
		public final List zzbVt;

		public zza(zzbld zzbld1, List list)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzbVs = zzbld1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field zzbld zzbVs>
			zzbVt = list;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field List zzbVt>
		//    8   14:return          
		}
	}


	private static int zza(String s, zzbld.zza.zza azza[])
	{
		int i = 14;
	//    0    0:bipush          14
	//    1    2:istore_2        
		int l = azza.length;
	//    2    3:aload_1         
	//    3    4:arraylength     
	//    4    5:istore          5
		for(int j = 0; j < l;)
	//*   5    7:iconst_0        
	//*   6    8:istore_3        
	//*   7    9:iload_3         
	//*   8   10:iload           5
	//*   9   12:icmpge          213
		{
			zzbld.zza.zza zza1 = azza[j];
	//   10   15:aload_1         
	//   11   16:iload_3         
	//   12   17:aaload          
	//   13   18:astore          6
			int k;
			if(i == 14)
	//*  14   20:iload_2         
	//*  15   21:bipush          14
	//*  16   23:icmpne          130
			{
				if(zza1.type == 9 || zza1.type == 2 || zza1.type == 6)
	//*  17   26:aload           6
	//*  18   28:getfield        #14  <Field int zzbld$zza$zza.type>
	//*  19   31:bipush          9
	//*  20   33:icmpeq          55
	//*  21   36:aload           6
	//*  22   38:getfield        #14  <Field int zzbld$zza$zza.type>
	//*  23   41:iconst_2        
	//*  24   42:icmpeq          55
	//*  25   45:aload           6
	//*  26   47:getfield        #14  <Field int zzbld$zza$zza.type>
	//*  27   50:bipush          6
	//*  28   52:icmpne          65
				{
					k = zza1.type;
	//   29   55:aload           6
	//   30   57:getfield        #14  <Field int zzbld$zza$zza.type>
	//   31   60:istore          4
				} else
	//*  32   62:goto            203
				{
					k = i;
	//   33   65:iload_2         
	//   34   66:istore          4
					if(zza1.type != 14)
	//*  35   68:aload           6
	//*  36   70:getfield        #14  <Field int zzbld$zza$zza.type>
	//*  37   73:bipush          14
	//*  38   75:icmpeq          203
					{
						i = zza1.type;
	//   39   78:aload           6
	//   40   80:getfield        #14  <Field int zzbld$zza$zza.type>
	//   41   83:istore_2        
						throw new IllegalArgumentException((new StringBuilder(String.valueOf(((Object) (s))).length() + 48)).append("Unexpected TypedValue type: ").append(i).append(" for key ").append(s).toString());
	//   42   84:new             #16  <Class IllegalArgumentException>
	//   43   87:dup             
	//   44   88:new             #18  <Class StringBuilder>
	//   45   91:dup             
	//   46   92:aload_0         
	//   47   93:invokestatic    #24  <Method String String.valueOf(Object)>
	//   48   96:invokevirtual   #28  <Method int String.length()>
	//   49   99:bipush          48
	//   50  101:iadd            
	//   51  102:invokespecial   #32  <Method void StringBuilder(int)>
	//   52  105:ldc1            #34  <String "Unexpected TypedValue type: ">
	//   53  107:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   54  110:iload_2         
	//   55  111:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   56  114:ldc1            #43  <String " for key ">
	//   57  116:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   58  119:aload_0         
	//   59  120:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   60  123:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   61  126:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   62  129:athrow          
					}
				}
			} else
			{
				k = i;
	//   63  130:iload_2         
	//   64  131:istore          4
				if(zza1.type != i)
	//*  65  133:aload           6
	//*  66  135:getfield        #14  <Field int zzbld$zza$zza.type>
	//*  67  138:iload_2         
	//*  68  139:icmpeq          203
				{
					j = zza1.type;
	//   69  142:aload           6
	//   70  144:getfield        #14  <Field int zzbld$zza$zza.type>
	//   71  147:istore_3        
					throw new IllegalArgumentException((new StringBuilder(String.valueOf(((Object) (s))).length() + 126)).append("The ArrayList elements should all be the same type, but ArrayList with key ").append(s).append(" contains items of type ").append(i).append(" and ").append(j).toString());
	//   72  148:new             #16  <Class IllegalArgumentException>
	//   73  151:dup             
	//   74  152:new             #18  <Class StringBuilder>
	//   75  155:dup             
	//   76  156:aload_0         
	//   77  157:invokestatic    #24  <Method String String.valueOf(Object)>
	//   78  160:invokevirtual   #28  <Method int String.length()>
	//   79  163:bipush          126
	//   80  165:iadd            
	//   81  166:invokespecial   #32  <Method void StringBuilder(int)>
	//   82  169:ldc1            #52  <String "The ArrayList elements should all be the same type, but ArrayList with key ">
	//   83  171:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   84  174:aload_0         
	//   85  175:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   86  178:ldc1            #54  <String " contains items of type ">
	//   87  180:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   88  183:iload_2         
	//   89  184:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   90  187:ldc1            #56  <String " and ">
	//   91  189:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   92  192:iload_3         
	//   93  193:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   94  196:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   95  199:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   96  202:athrow          
				}
			}
			j++;
	//   97  203:iload_3         
	//   98  204:iconst_1        
	//   99  205:iadd            
	//  100  206:istore_3        
			i = k;
	//  101  207:iload           4
	//  102  209:istore_2        
		}

	//* 103  210:goto            9
		return i;
	//  104  213:iload_2         
	//  105  214:ireturn         
	}

	static int zza(List list, Asset asset)
	{
		list.add(((Object) (asset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #64  <Method boolean List.add(Object)>
	//    3    7:pop             
		return list.size() - 1;
	//    4    8:aload_0         
	//    5    9:invokeinterface #67  <Method int List.size()>
	//    6   14:iconst_1        
	//    7   15:isub            
	//    8   16:ireturn         
	}

	public static zza zza(DataMap datamap)
	{
		zzbld zzbld1 = new zzbld();
	//    0    0:new             #72  <Class zzbld>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void zzbld()>
	//    3    7:astore_1        
		ArrayList arraylist = new ArrayList();
	//    4    8:new             #77  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #78  <Method void ArrayList()>
	//    7   15:astore_2        
		zzbld1.zzbVu = zza(datamap, ((List) (arraylist)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:invokestatic    #81  <Method zzbld$zza[] zza(DataMap, List)>
	//   12   22:putfield        #85  <Field zzbld$zza[] zzbld.zzbVu>
		return new zza(zzbld1, ((List) (arraylist)));
	//   13   25:new             #6   <Class zzblc$zza>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:invokespecial   #88  <Method void zzblc$zza(zzbld, List)>
	//   18   34:areturn         
	}

	private static zzbld.zza.zza zza(List list, Object obj)
	{
		zzbld.zza.zza zza1 = new zzbld.zza.zza();
	//    0    0:new             #10  <Class zzbld$zza$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #90  <Method void zzbld$zza$zza()>
	//    3    7:astore          8
		if(obj == null)
	//*   4    9:aload_1         
	//*   5   10:ifnonnull       23
		{
			zza1.type = 14;
	//    6   13:aload           8
	//    7   15:bipush          14
	//    8   17:putfield        #14  <Field int zzbld$zza$zza.type>
			return zza1;
	//    9   20:aload           8
	//   10   22:areturn         
		}
		zza1.zzbVy = new zzbld.zza.zza.zza();
	//   11   23:aload           8
	//   12   25:new             #92  <Class zzbld$zza$zza$zza>
	//   13   28:dup             
	//   14   29:invokespecial   #93  <Method void zzbld$zza$zza$zza()>
	//   15   32:putfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
		if(obj instanceof String)
	//*  16   35:aload_1         
	//*  17   36:instanceof      #20  <Class String>
	//*  18   39:ifeq            63
		{
			zza1.type = 2;
	//   19   42:aload           8
	//   20   44:iconst_2        
	//   21   45:putfield        #14  <Field int zzbld$zza$zza.type>
			zza1.zzbVy.zzbVA = (String)obj;
	//   22   48:aload           8
	//   23   50:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//   24   53:aload_1         
	//   25   54:checkcast       #20  <Class String>
	//   26   57:putfield        #101 <Field String zzbld$zza$zza$zza.zzbVA>
			return zza1;
	//   27   60:aload           8
	//   28   62:areturn         
		}
		if(obj instanceof Integer)
	//*  29   63:aload_1         
	//*  30   64:instanceof      #103 <Class Integer>
	//*  31   67:ifeq            95
		{
			zza1.type = 6;
	//   32   70:aload           8
	//   33   72:bipush          6
	//   34   74:putfield        #14  <Field int zzbld$zza$zza.type>
			zza1.zzbVy.zzbVE = ((Integer)obj).intValue();
	//   35   77:aload           8
	//   36   79:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//   37   82:aload_1         
	//   38   83:checkcast       #103 <Class Integer>
	//   39   86:invokevirtual   #106 <Method int Integer.intValue()>
	//   40   89:putfield        #109 <Field int zzbld$zza$zza$zza.zzbVE>
			return zza1;
	//   41   92:aload           8
	//   42   94:areturn         
		}
		if(obj instanceof Long)
	//*  43   95:aload_1         
	//*  44   96:instanceof      #111 <Class Long>
	//*  45   99:ifeq            126
		{
			zza1.type = 5;
	//   46  102:aload           8
	//   47  104:iconst_5        
	//   48  105:putfield        #14  <Field int zzbld$zza$zza.type>
			zza1.zzbVy.zzbVD = ((Long)obj).longValue();
	//   49  108:aload           8
	//   50  110:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//   51  113:aload_1         
	//   52  114:checkcast       #111 <Class Long>
	//   53  117:invokevirtual   #115 <Method long Long.longValue()>
	//   54  120:putfield        #119 <Field long zzbld$zza$zza$zza.zzbVD>
			return zza1;
	//   55  123:aload           8
	//   56  125:areturn         
		}
		if(obj instanceof Double)
	//*  57  126:aload_1         
	//*  58  127:instanceof      #121 <Class Double>
	//*  59  130:ifeq            157
		{
			zza1.type = 3;
	//   60  133:aload           8
	//   61  135:iconst_3        
	//   62  136:putfield        #14  <Field int zzbld$zza$zza.type>
			zza1.zzbVy.zzbVB = ((Double)obj).doubleValue();
	//   63  139:aload           8
	//   64  141:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//   65  144:aload_1         
	//   66  145:checkcast       #121 <Class Double>
	//   67  148:invokevirtual   #125 <Method double Double.doubleValue()>
	//   68  151:putfield        #129 <Field double zzbld$zza$zza$zza.zzbVB>
			return zza1;
	//   69  154:aload           8
	//   70  156:areturn         
		}
		if(obj instanceof Float)
	//*  71  157:aload_1         
	//*  72  158:instanceof      #131 <Class Float>
	//*  73  161:ifeq            188
		{
			zza1.type = 4;
	//   74  164:aload           8
	//   75  166:iconst_4        
	//   76  167:putfield        #14  <Field int zzbld$zza$zza.type>
			zza1.zzbVy.zzbVC = ((Float)obj).floatValue();
	//   77  170:aload           8
	//   78  172:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//   79  175:aload_1         
	//   80  176:checkcast       #131 <Class Float>
	//   81  179:invokevirtual   #135 <Method float Float.floatValue()>
	//   82  182:putfield        #139 <Field float zzbld$zza$zza$zza.zzbVC>
			return zza1;
	//   83  185:aload           8
	//   84  187:areturn         
		}
		if(obj instanceof Boolean)
	//*  85  188:aload_1         
	//*  86  189:instanceof      #141 <Class Boolean>
	//*  87  192:ifeq            220
		{
			zza1.type = 8;
	//   88  195:aload           8
	//   89  197:bipush          8
	//   90  199:putfield        #14  <Field int zzbld$zza$zza.type>
			zza1.zzbVy.zzbVG = ((Boolean)obj).booleanValue();
	//   91  202:aload           8
	//   92  204:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//   93  207:aload_1         
	//   94  208:checkcast       #141 <Class Boolean>
	//   95  211:invokevirtual   #145 <Method boolean Boolean.booleanValue()>
	//   96  214:putfield        #149 <Field boolean zzbld$zza$zza$zza.zzbVG>
			return zza1;
	//   97  217:aload           8
	//   98  219:areturn         
		}
		if(obj instanceof Byte)
	//*  99  220:aload_1         
	//* 100  221:instanceof      #151 <Class Byte>
	//* 101  224:ifeq            252
		{
			zza1.type = 7;
	//  102  227:aload           8
	//  103  229:bipush          7
	//  104  231:putfield        #14  <Field int zzbld$zza$zza.type>
			zza1.zzbVy.zzbVF = ((int) (((Byte)obj).byteValue()));
	//  105  234:aload           8
	//  106  236:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//  107  239:aload_1         
	//  108  240:checkcast       #151 <Class Byte>
	//  109  243:invokevirtual   #155 <Method byte Byte.byteValue()>
	//  110  246:putfield        #158 <Field int zzbld$zza$zza$zza.zzbVF>
			return zza1;
	//  111  249:aload           8
	//  112  251:areturn         
		}
		if(obj instanceof byte[])
	//* 113  252:aload_1         
	//* 114  253:instanceof      #160 <Class byte[]>
	//* 115  256:ifeq            280
		{
			zza1.type = 1;
	//  116  259:aload           8
	//  117  261:iconst_1        
	//  118  262:putfield        #14  <Field int zzbld$zza$zza.type>
			zza1.zzbVy.zzbVz = (byte[])obj;
	//  119  265:aload           8
	//  120  267:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//  121  270:aload_1         
	//  122  271:checkcast       #160 <Class byte[]>
	//  123  274:putfield        #163 <Field byte[] zzbld$zza$zza$zza.zzbVz>
			return zza1;
	//  124  277:aload           8
	//  125  279:areturn         
		}
		if(obj instanceof String[])
	//* 126  280:aload_1         
	//* 127  281:instanceof      #165 <Class String[]>
	//* 128  284:ifeq            309
		{
			zza1.type = 11;
	//  129  287:aload           8
	//  130  289:bipush          11
	//  131  291:putfield        #14  <Field int zzbld$zza$zza.type>
			zza1.zzbVy.zzbVJ = (String[])obj;
	//  132  294:aload           8
	//  133  296:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//  134  299:aload_1         
	//  135  300:checkcast       #165 <Class String[]>
	//  136  303:putfield        #168 <Field String[] zzbld$zza$zza$zza.zzbVJ>
			return zza1;
	//  137  306:aload           8
	//  138  308:areturn         
		}
		if(obj instanceof long[])
	//* 139  309:aload_1         
	//* 140  310:instanceof      #170 <Class long[]>
	//* 141  313:ifeq            338
		{
			zza1.type = 12;
	//  142  316:aload           8
	//  143  318:bipush          12
	//  144  320:putfield        #14  <Field int zzbld$zza$zza.type>
			zza1.zzbVy.zzbVK = (long[])obj;
	//  145  323:aload           8
	//  146  325:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//  147  328:aload_1         
	//  148  329:checkcast       #170 <Class long[]>
	//  149  332:putfield        #173 <Field long[] zzbld$zza$zza$zza.zzbVK>
			return zza1;
	//  150  335:aload           8
	//  151  337:areturn         
		}
		if(obj instanceof float[])
	//* 152  338:aload_1         
	//* 153  339:instanceof      #175 <Class float[]>
	//* 154  342:ifeq            367
		{
			zza1.type = 15;
	//  155  345:aload           8
	//  156  347:bipush          15
	//  157  349:putfield        #14  <Field int zzbld$zza$zza.type>
			zza1.zzbVy.zzbVL = (float[])obj;
	//  158  352:aload           8
	//  159  354:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//  160  357:aload_1         
	//  161  358:checkcast       #175 <Class float[]>
	//  162  361:putfield        #178 <Field float[] zzbld$zza$zza$zza.zzbVL>
			return zza1;
	//  163  364:aload           8
	//  164  366:areturn         
		}
		if(obj instanceof Asset)
	//* 165  367:aload_1         
	//* 166  368:instanceof      #180 <Class Asset>
	//* 167  371:ifeq            401
		{
			zza1.type = 13;
	//  168  374:aload           8
	//  169  376:bipush          13
	//  170  378:putfield        #14  <Field int zzbld$zza$zza.type>
			zza1.zzbVy.zzbVM = zza(list, (Asset)obj);
	//  171  381:aload           8
	//  172  383:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//  173  386:aload_0         
	//  174  387:aload_1         
	//  175  388:checkcast       #180 <Class Asset>
	//  176  391:invokestatic    #182 <Method int zza(List, Asset)>
	//  177  394:i2l             
	//  178  395:putfield        #185 <Field long zzbld$zza$zza$zza.zzbVM>
			return zza1;
	//  179  398:aload           8
	//  180  400:areturn         
		}
		if(obj instanceof DataMap)
	//* 181  401:aload_1         
	//* 182  402:instanceof      #187 <Class DataMap>
	//* 183  405:ifeq            531
		{
			zza1.type = 9;
	//  184  408:aload           8
	//  185  410:bipush          9
	//  186  412:putfield        #14  <Field int zzbld$zza$zza.type>
			obj = ((Object) ((DataMap)obj));
	//  187  415:aload_1         
	//  188  416:checkcast       #187 <Class DataMap>
	//  189  419:astore_1        
			Object obj2 = ((Object) (new TreeSet(((java.util.Collection) (((DataMap) (obj)).keySet())))));
	//  190  420:new             #189 <Class TreeSet>
	//  191  423:dup             
	//  192  424:aload_1         
	//  193  425:invokevirtual   #193 <Method java.util.Set DataMap.keySet()>
	//  194  428:invokespecial   #196 <Method void TreeSet(java.util.Collection)>
	//  195  431:astore          7
			zzbld.zza azza[] = new zzbld.zza[((TreeSet) (obj2)).size()];
	//  196  433:aload           7
	//  197  435:invokevirtual   #197 <Method int TreeSet.size()>
	//  198  438:anewarray       zzbld.zza[]
	//  199  441:astore          6
			int i = 0;
	//  200  443:iconst_0        
	//  201  444:istore_2        
			for(obj2 = ((Object) (((TreeSet) (obj2)).iterator())); ((Iterator) (obj2)).hasNext();)
	//* 202  445:aload           7
	//* 203  447:invokevirtual   #203 <Method Iterator TreeSet.iterator()>
	//* 204  450:astore          7
	//* 205  452:aload           7
	//* 206  454:invokeinterface #208 <Method boolean Iterator.hasNext()>
	//* 207  459:ifeq            518
			{
				String s = (String)((Iterator) (obj2)).next();
	//  208  462:aload           7
	//  209  464:invokeinterface #212 <Method Object Iterator.next()>
	//  210  469:checkcast       #20  <Class String>
	//  211  472:astore          9
				azza[i] = new zzbld.zza();
	//  212  474:aload           6
	//  213  476:iload_2         
	//  214  477:new             #199 <Class zzbld$zza>
	//  215  480:dup             
	//  216  481:invokespecial   #213 <Method void zzbld$zza()>
	//  217  484:aastore         
				azza[i].name = s;
	//  218  485:aload           6
	//  219  487:iload_2         
	//  220  488:aaload          
	//  221  489:aload           9
	//  222  491:putfield        #216 <Field String zzbld$zza.name>
				azza[i].zzbVw = zza(list, ((DataMap) (obj)).get(s));
	//  223  494:aload           6
	//  224  496:iload_2         
	//  225  497:aaload          
	//  226  498:aload_0         
	//  227  499:aload_1         
	//  228  500:aload           9
	//  229  502:invokevirtual   #220 <Method Object DataMap.get(String)>
	//  230  505:invokestatic    #222 <Method zzbld$zza$zza zza(List, Object)>
	//  231  508:putfield        #226 <Field zzbld$zza$zza zzbld$zza.zzbVw>
				i++;
	//  232  511:iload_2         
	//  233  512:iconst_1        
	//  234  513:iadd            
	//  235  514:istore_2        
			}

	//* 236  515:goto            452
			zza1.zzbVy.zzbVH = azza;
	//  237  518:aload           8
	//  238  520:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//  239  523:aload           6
	//  240  525:putfield        #229 <Field zzbld$zza[] zzbld$zza$zza$zza.zzbVH>
			return zza1;
	//  241  528:aload           8
	//  242  530:areturn         
		}
		if(obj instanceof ArrayList)
	//* 243  531:aload_1         
	//* 244  532:instanceof      #77  <Class ArrayList>
	//* 245  535:ifeq            833
		{
			zza1.type = 10;
	//  246  538:aload           8
	//  247  540:bipush          10
	//  248  542:putfield        #14  <Field int zzbld$zza$zza.type>
			ArrayList arraylist = (ArrayList)obj;
	//  249  545:aload_1         
	//  250  546:checkcast       #77  <Class ArrayList>
	//  251  549:astore          9
			zzbld.zza.zza azza1[] = new zzbld.zza.zza[arraylist.size()];
	//  252  551:aload           9
	//  253  553:invokevirtual   #230 <Method int ArrayList.size()>
	//  254  556:anewarray       zzbld.zza.zza[]
	//  255  559:astore          10
			int k = 14;
	//  256  561:bipush          14
	//  257  563:istore_3        
			obj = null;
	//  258  564:aconst_null     
	//  259  565:astore_1        
			int j = 0;
	//  260  566:iconst_0        
	//  261  567:istore_2        
			for(int i1 = arraylist.size(); j < i1;)
	//* 262  568:aload           9
	//* 263  570:invokevirtual   #230 <Method int ArrayList.size()>
	//* 264  573:istore          5
	//* 265  575:iload_2         
	//* 266  576:iload           5
	//* 267  578:icmpge          820
			{
				Object obj3 = arraylist.get(j);
	//  268  581:aload           9
	//  269  583:iload_2         
	//  270  584:invokevirtual   #233 <Method Object ArrayList.get(int)>
	//  271  587:astore          7
				zzbld.zza.zza zza2 = zza(list, obj3);
	//  272  589:aload_0         
	//  273  590:aload           7
	//  274  592:invokestatic    #222 <Method zzbld$zza$zza zza(List, Object)>
	//  275  595:astore          11
				if(zza2.type != 14 && zza2.type != 2 && zza2.type != 6 && zza2.type != 9)
	//* 276  597:aload           11
	//* 277  599:getfield        #14  <Field int zzbld$zza$zza.type>
	//* 278  602:bipush          14
	//* 279  604:icmpeq          683
	//* 280  607:aload           11
	//* 281  609:getfield        #14  <Field int zzbld$zza$zza.type>
	//* 282  612:iconst_2        
	//* 283  613:icmpeq          683
	//* 284  616:aload           11
	//* 285  618:getfield        #14  <Field int zzbld$zza$zza.type>
	//* 286  621:bipush          6
	//* 287  623:icmpeq          683
	//* 288  626:aload           11
	//* 289  628:getfield        #14  <Field int zzbld$zza$zza.type>
	//* 290  631:bipush          9
	//* 291  633:icmpeq          683
				{
					list = ((List) (String.valueOf(((Object) (obj3.getClass())))));
	//  292  636:aload           7
	//  293  638:invokevirtual   #237 <Method Class Object.getClass()>
	//  294  641:invokestatic    #24  <Method String String.valueOf(Object)>
	//  295  644:astore_0        
					throw new IllegalArgumentException((new StringBuilder(String.valueOf(((Object) (list))).length() + 130)).append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ").append(((String) (list))).toString());
	//  296  645:new             #16  <Class IllegalArgumentException>
	//  297  648:dup             
	//  298  649:new             #18  <Class StringBuilder>
	//  299  652:dup             
	//  300  653:aload_0         
	//  301  654:invokestatic    #24  <Method String String.valueOf(Object)>
	//  302  657:invokevirtual   #28  <Method int String.length()>
	//  303  660:sipush          130
	//  304  663:iadd            
	//  305  664:invokespecial   #32  <Method void StringBuilder(int)>
	//  306  667:ldc1            #239 <String "The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ">
	//  307  669:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//  308  672:aload_0         
	//  309  673:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//  310  676:invokevirtual   #47  <Method String StringBuilder.toString()>
	//  311  679:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//  312  682:athrow          
				}
				int l;
				Object obj1;
				if(k == 14 && zza2.type != 14)
	//* 313  683:iload_3         
	//* 314  684:bipush          14
	//* 315  686:icmpne          713
	//* 316  689:aload           11
	//* 317  691:getfield        #14  <Field int zzbld$zza$zza.type>
	//* 318  694:bipush          14
	//* 319  696:icmpeq          713
				{
					l = zza2.type;
	//  320  699:aload           11
	//  321  701:getfield        #14  <Field int zzbld$zza$zza.type>
	//  322  704:istore          4
					obj1 = obj3;
	//  323  706:aload           7
	//  324  708:astore          6
				} else
	//* 325  710:goto            801
				{
					l = k;
	//  326  713:iload_3         
	//  327  714:istore          4
					obj1 = obj;
	//  328  716:aload_1         
	//  329  717:astore          6
					if(zza2.type != k)
	//* 330  719:aload           11
	//* 331  721:getfield        #14  <Field int zzbld$zza$zza.type>
	//* 332  724:iload_3         
	//* 333  725:icmpeq          801
					{
						list = ((List) (String.valueOf(((Object) (obj.getClass())))));
	//  334  728:aload_1         
	//  335  729:invokevirtual   #237 <Method Class Object.getClass()>
	//  336  732:invokestatic    #24  <Method String String.valueOf(Object)>
	//  337  735:astore_0        
						obj = ((Object) (String.valueOf(((Object) (obj3.getClass())))));
	//  338  736:aload           7
	//  339  738:invokevirtual   #237 <Method Class Object.getClass()>
	//  340  741:invokestatic    #24  <Method String String.valueOf(Object)>
	//  341  744:astore_1        
						j = String.valueOf(((Object) (list))).length();
	//  342  745:aload_0         
	//  343  746:invokestatic    #24  <Method String String.valueOf(Object)>
	//  344  749:invokevirtual   #28  <Method int String.length()>
	//  345  752:istore_2        
						throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + (j + 80))).append("ArrayList elements must all be of the sameclass, but this one contains a ").append(((String) (list))).append(" and a ").append(((String) (obj))).toString());
	//  346  753:new             #16  <Class IllegalArgumentException>
	//  347  756:dup             
	//  348  757:new             #18  <Class StringBuilder>
	//  349  760:dup             
	//  350  761:aload_1         
	//  351  762:invokestatic    #24  <Method String String.valueOf(Object)>
	//  352  765:invokevirtual   #28  <Method int String.length()>
	//  353  768:iload_2         
	//  354  769:bipush          80
	//  355  771:iadd            
	//  356  772:iadd            
	//  357  773:invokespecial   #32  <Method void StringBuilder(int)>
	//  358  776:ldc1            #241 <String "ArrayList elements must all be of the sameclass, but this one contains a ">
	//  359  778:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//  360  781:aload_0         
	//  361  782:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//  362  785:ldc1            #243 <String " and a ">
	//  363  787:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//  364  790:aload_1         
	//  365  791:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//  366  794:invokevirtual   #47  <Method String StringBuilder.toString()>
	//  367  797:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//  368  800:athrow          
					}
				}
				azza1[j] = zza2;
	//  369  801:aload           10
	//  370  803:iload_2         
	//  371  804:aload           11
	//  372  806:aastore         
				j++;
	//  373  807:iload_2         
	//  374  808:iconst_1        
	//  375  809:iadd            
	//  376  810:istore_2        
				k = l;
	//  377  811:iload           4
	//  378  813:istore_3        
				obj = obj1;
	//  379  814:aload           6
	//  380  816:astore_1        
			}

	//* 381  817:goto            575
			zza1.zzbVy.zzbVI = azza1;
	//  382  820:aload           8
	//  383  822:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//  384  825:aload           10
	//  385  827:putfield        #247 <Field zzbld$zza$zza[] zzbld$zza$zza$zza.zzbVI>
			return zza1;
	//  386  830:aload           8
	//  387  832:areturn         
		}
		list = ((List) (String.valueOf(((Object) (obj.getClass().getSimpleName())))));
	//  388  833:aload_1         
	//  389  834:invokevirtual   #237 <Method Class Object.getClass()>
	//  390  837:invokevirtual   #252 <Method String Class.getSimpleName()>
	//  391  840:invokestatic    #24  <Method String String.valueOf(Object)>
	//  392  843:astore_0        
		if(((String) (list)).length() != 0)
	//* 393  844:aload_0         
	//* 394  845:invokevirtual   #28  <Method int String.length()>
	//* 395  848:ifeq            861
			list = ((List) ("newFieldValueFromValue: unexpected value ".concat(((String) (list)))));
	//  396  851:ldc1            #254 <String "newFieldValueFromValue: unexpected value ">
	//  397  853:aload_0         
	//  398  854:invokevirtual   #258 <Method String String.concat(String)>
	//  399  857:astore_0        
		else
	//* 400  858:goto            871
			list = ((List) (new String("newFieldValueFromValue: unexpected value ")));
	//  401  861:new             #20  <Class String>
	//  402  864:dup             
	//  403  865:ldc1            #254 <String "newFieldValueFromValue: unexpected value ">
	//  404  867:invokespecial   #259 <Method void String(String)>
	//  405  870:astore_0        
		throw new RuntimeException(((String) (list)));
	//  406  871:new             #261 <Class RuntimeException>
	//  407  874:dup             
	//  408  875:aload_0         
	//  409  876:invokespecial   #262 <Method void RuntimeException(String)>
	//  410  879:athrow          
	}

	public static DataMap zza(zza zza1)
	{
		DataMap datamap = new DataMap();
	//    0    0:new             #187 <Class DataMap>
	//    1    3:dup             
	//    2    4:invokespecial   #265 <Method void DataMap()>
	//    3    7:astore_3        
		zzbld.zza azza[] = zza1.zzbVs.zzbVu;
	//    4    8:aload_0         
	//    5    9:getfield        #269 <Field zzbld zzblc$zza.zzbVs>
	//    6   12:getfield        #85  <Field zzbld$zza[] zzbld.zzbVu>
	//    7   15:astore          4
		int j = azza.length;
	//    8   17:aload           4
	//    9   19:arraylength     
	//   10   20:istore_2        
		for(int i = 0; i < j; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_1         
	//*  14   24:iload_2         
	//*  15   25:icmpge          59
		{
			zzbld.zza zza2 = azza[i];
	//   16   28:aload           4
	//   17   30:iload_1         
	//   18   31:aaload          
	//   19   32:astore          5
			zza(zza1.zzbVt, datamap, zza2.name, zza2.zzbVw);
	//   20   34:aload_0         
	//   21   35:getfield        #273 <Field List zzblc$zza.zzbVt>
	//   22   38:aload_3         
	//   23   39:aload           5
	//   24   41:getfield        #216 <Field String zzbld$zza.name>
	//   25   44:aload           5
	//   26   46:getfield        #226 <Field zzbld$zza$zza zzbld$zza.zzbVw>
	//   27   49:invokestatic    #276 <Method void zza(List, DataMap, String, zzbld$zza$zza)>
		}

	//   28   52:iload_1         
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_1        
	//*  32   56:goto            23
		return datamap;
	//   33   59:aload_3         
	//   34   60:areturn         
	}

	private static ArrayList zza(List list, zzbld.zza.zza.zza zza1, int i)
	{
		ArrayList arraylist = new ArrayList(zza1.zzbVI.length);
	//    0    0:new             #77  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #247 <Field zzbld$zza$zza[] zzbld$zza$zza$zza.zzbVI>
	//    4    8:arraylength     
	//    5    9:invokespecial   #278 <Method void ArrayList(int)>
	//    6   12:astore          7
		zza1 = ((zzbld.zza.zza.zza) (zza1.zzbVI));
	//    7   14:aload_1         
	//    8   15:getfield        #247 <Field zzbld$zza$zza[] zzbld$zza$zza$zza.zzbVI>
	//    9   18:astore_1        
		int l = zza1.length;
	//   10   19:aload_1         
	//   11   20:arraylength     
	//   12   21:istore          5
		for(int j = 0; j < l; j++)
	//*  13   23:iconst_0        
	//*  14   24:istore_3        
	//*  15   25:iload_3         
	//*  16   26:iload           5
	//*  17   28:icmpge          224
		{
			zzbld.zza azza[] = ((zzbld.zza []) (zza1[j]));
	//   18   31:aload_1         
	//   19   32:iload_3         
	//   20   33:aaload          
	//   21   34:astore          9
			if(((zzbld.zza.zza) (azza)).type == 14)
	//*  22   36:aload           9
	//*  23   38:getfield        #14  <Field int zzbld$zza$zza.type>
	//*  24   41:bipush          14
	//*  25   43:icmpne          56
			{
				arraylist.add(((Object) (null)));
	//   26   46:aload           7
	//   27   48:aconst_null     
	//   28   49:invokevirtual   #279 <Method boolean ArrayList.add(Object)>
	//   29   52:pop             
				continue;
	//   30   53:goto            217
			}
			if(i == 9)
	//*  31   56:iload_2         
	//*  32   57:bipush          9
	//*  33   59:icmpne          139
			{
				DataMap datamap = new DataMap();
	//   34   62:new             #187 <Class DataMap>
	//   35   65:dup             
	//   36   66:invokespecial   #265 <Method void DataMap()>
	//   37   69:astore          8
				azza = ((zzbld.zza.zza) (azza)).zzbVy.zzbVH;
	//   38   71:aload           9
	//   39   73:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//   40   76:getfield        #229 <Field zzbld$zza[] zzbld$zza$zza$zza.zzbVH>
	//   41   79:astore          9
				int i1 = azza.length;
	//   42   81:aload           9
	//   43   83:arraylength     
	//   44   84:istore          6
				for(int k = 0; k < i1; k++)
	//*  45   86:iconst_0        
	//*  46   87:istore          4
	//*  47   89:iload           4
	//*  48   91:iload           6
	//*  49   93:icmpge          128
				{
					zzbld.zza zza2 = azza[k];
	//   50   96:aload           9
	//   51   98:iload           4
	//   52  100:aaload          
	//   53  101:astore          10
					zza(list, datamap, zza2.name, zza2.zzbVw);
	//   54  103:aload_0         
	//   55  104:aload           8
	//   56  106:aload           10
	//   57  108:getfield        #216 <Field String zzbld$zza.name>
	//   58  111:aload           10
	//   59  113:getfield        #226 <Field zzbld$zza$zza zzbld$zza.zzbVw>
	//   60  116:invokestatic    #276 <Method void zza(List, DataMap, String, zzbld$zza$zza)>
				}

	//   61  119:iload           4
	//   62  121:iconst_1        
	//   63  122:iadd            
	//   64  123:istore          4
	//*  65  125:goto            89
				arraylist.add(((Object) (datamap)));
	//   66  128:aload           7
	//   67  130:aload           8
	//   68  132:invokevirtual   #279 <Method boolean ArrayList.add(Object)>
	//   69  135:pop             
				continue;
	//   70  136:goto            217
			}
			if(i == 2)
	//*  71  139:iload_2         
	//*  72  140:iconst_2        
	//*  73  141:icmpne          161
			{
				arraylist.add(((Object) (((zzbld.zza.zza) (azza)).zzbVy.zzbVA)));
	//   74  144:aload           7
	//   75  146:aload           9
	//   76  148:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//   77  151:getfield        #101 <Field String zzbld$zza$zza$zza.zzbVA>
	//   78  154:invokevirtual   #279 <Method boolean ArrayList.add(Object)>
	//   79  157:pop             
				continue;
	//   80  158:goto            217
			}
			if(i == 6)
	//*  81  161:iload_2         
	//*  82  162:bipush          6
	//*  83  164:icmpne          187
				arraylist.add(((Object) (Integer.valueOf(((zzbld.zza.zza) (azza)).zzbVy.zzbVE))));
	//   84  167:aload           7
	//   85  169:aload           9
	//   86  171:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//   87  174:getfield        #109 <Field int zzbld$zza$zza$zza.zzbVE>
	//   88  177:invokestatic    #282 <Method Integer Integer.valueOf(int)>
	//   89  180:invokevirtual   #279 <Method boolean ArrayList.add(Object)>
	//   90  183:pop             
			else
	//*  91  184:goto            217
				throw new IllegalArgumentException((new StringBuilder(39)).append("Unexpected typeOfArrayList: ").append(i).toString());
	//   92  187:new             #16  <Class IllegalArgumentException>
	//   93  190:dup             
	//   94  191:new             #18  <Class StringBuilder>
	//   95  194:dup             
	//   96  195:bipush          39
	//   97  197:invokespecial   #32  <Method void StringBuilder(int)>
	//   98  200:ldc2            #284 <String "Unexpected typeOfArrayList: ">
	//   99  203:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//  100  206:iload_2         
	//  101  207:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//  102  210:invokevirtual   #47  <Method String StringBuilder.toString()>
	//  103  213:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//  104  216:athrow          
		}

	//  105  217:iload_3         
	//  106  218:iconst_1        
	//  107  219:iadd            
	//  108  220:istore_3        
	//* 109  221:goto            25
		return arraylist;
	//  110  224:aload           7
	//  111  226:areturn         
	}

	private static void zza(List list, DataMap datamap, String s, zzbld.zza.zza zza1)
	{
		int i = zza1.type;
	//    0    0:aload_3         
	//    1    1:getfield        #14  <Field int zzbld$zza$zza.type>
	//    2    4:istore          4
		if(i == 14)
	//*   3    6:iload           4
	//*   4    8:bipush          14
	//*   5   10:icmpne          20
		{
			datamap.putString(s, ((String) (null)));
	//    6   13:aload_1         
	//    7   14:aload_2         
	//    8   15:aconst_null     
	//    9   16:invokevirtual   #289 <Method void DataMap.putString(String, String)>
			return;
	//   10   19:return          
		}
		Object obj = ((Object) (zza1.zzbVy));
	//   11   20:aload_3         
	//   12   21:getfield        #97  <Field zzbld$zza$zza$zza zzbld$zza$zza.zzbVy>
	//   13   24:astore          6
		if(i == 1)
	//*  14   26:iload           4
	//*  15   28:iconst_1        
	//*  16   29:icmpne          43
		{
			datamap.putByteArray(s, ((zzbld.zza.zza.zza) (obj)).zzbVz);
	//   17   32:aload_1         
	//   18   33:aload_2         
	//   19   34:aload           6
	//   20   36:getfield        #163 <Field byte[] zzbld$zza$zza$zza.zzbVz>
	//   21   39:invokevirtual   #293 <Method void DataMap.putByteArray(String, byte[])>
			return;
	//   22   42:return          
		}
		if(i == 11)
	//*  23   43:iload           4
	//*  24   45:bipush          11
	//*  25   47:icmpne          61
		{
			datamap.putStringArray(s, ((zzbld.zza.zza.zza) (obj)).zzbVJ);
	//   26   50:aload_1         
	//   27   51:aload_2         
	//   28   52:aload           6
	//   29   54:getfield        #168 <Field String[] zzbld$zza$zza$zza.zzbVJ>
	//   30   57:invokevirtual   #297 <Method void DataMap.putStringArray(String, String[])>
			return;
	//   31   60:return          
		}
		if(i == 12)
	//*  32   61:iload           4
	//*  33   63:bipush          12
	//*  34   65:icmpne          79
		{
			datamap.putLongArray(s, ((zzbld.zza.zza.zza) (obj)).zzbVK);
	//   35   68:aload_1         
	//   36   69:aload_2         
	//   37   70:aload           6
	//   38   72:getfield        #173 <Field long[] zzbld$zza$zza$zza.zzbVK>
	//   39   75:invokevirtual   #301 <Method void DataMap.putLongArray(String, long[])>
			return;
	//   40   78:return          
		}
		if(i == 15)
	//*  41   79:iload           4
	//*  42   81:bipush          15
	//*  43   83:icmpne          97
		{
			datamap.putFloatArray(s, ((zzbld.zza.zza.zza) (obj)).zzbVL);
	//   44   86:aload_1         
	//   45   87:aload_2         
	//   46   88:aload           6
	//   47   90:getfield        #178 <Field float[] zzbld$zza$zza$zza.zzbVL>
	//   48   93:invokevirtual   #305 <Method void DataMap.putFloatArray(String, float[])>
			return;
	//   49   96:return          
		}
		if(i == 2)
	//*  50   97:iload           4
	//*  51   99:iconst_2        
	//*  52  100:icmpne          114
		{
			datamap.putString(s, ((zzbld.zza.zza.zza) (obj)).zzbVA);
	//   53  103:aload_1         
	//   54  104:aload_2         
	//   55  105:aload           6
	//   56  107:getfield        #101 <Field String zzbld$zza$zza$zza.zzbVA>
	//   57  110:invokevirtual   #289 <Method void DataMap.putString(String, String)>
			return;
	//   58  113:return          
		}
		if(i == 3)
	//*  59  114:iload           4
	//*  60  116:iconst_3        
	//*  61  117:icmpne          131
		{
			datamap.putDouble(s, ((zzbld.zza.zza.zza) (obj)).zzbVB);
	//   62  120:aload_1         
	//   63  121:aload_2         
	//   64  122:aload           6
	//   65  124:getfield        #129 <Field double zzbld$zza$zza$zza.zzbVB>
	//   66  127:invokevirtual   #309 <Method void DataMap.putDouble(String, double)>
			return;
	//   67  130:return          
		}
		if(i == 4)
	//*  68  131:iload           4
	//*  69  133:iconst_4        
	//*  70  134:icmpne          148
		{
			datamap.putFloat(s, ((zzbld.zza.zza.zza) (obj)).zzbVC);
	//   71  137:aload_1         
	//   72  138:aload_2         
	//   73  139:aload           6
	//   74  141:getfield        #139 <Field float zzbld$zza$zza$zza.zzbVC>
	//   75  144:invokevirtual   #313 <Method void DataMap.putFloat(String, float)>
			return;
	//   76  147:return          
		}
		if(i == 5)
	//*  77  148:iload           4
	//*  78  150:iconst_5        
	//*  79  151:icmpne          165
		{
			datamap.putLong(s, ((zzbld.zza.zza.zza) (obj)).zzbVD);
	//   80  154:aload_1         
	//   81  155:aload_2         
	//   82  156:aload           6
	//   83  158:getfield        #119 <Field long zzbld$zza$zza$zza.zzbVD>
	//   84  161:invokevirtual   #317 <Method void DataMap.putLong(String, long)>
			return;
	//   85  164:return          
		}
		if(i == 6)
	//*  86  165:iload           4
	//*  87  167:bipush          6
	//*  88  169:icmpne          183
		{
			datamap.putInt(s, ((zzbld.zza.zza.zza) (obj)).zzbVE);
	//   89  172:aload_1         
	//   90  173:aload_2         
	//   91  174:aload           6
	//   92  176:getfield        #109 <Field int zzbld$zza$zza$zza.zzbVE>
	//   93  179:invokevirtual   #321 <Method void DataMap.putInt(String, int)>
			return;
	//   94  182:return          
		}
		if(i == 7)
	//*  95  183:iload           4
	//*  96  185:bipush          7
	//*  97  187:icmpne          202
		{
			datamap.putByte(s, (byte)((zzbld.zza.zza.zza) (obj)).zzbVF);
	//   98  190:aload_1         
	//   99  191:aload_2         
	//  100  192:aload           6
	//  101  194:getfield        #158 <Field int zzbld$zza$zza$zza.zzbVF>
	//  102  197:int2byte        
	//  103  198:invokevirtual   #325 <Method void DataMap.putByte(String, byte)>
			return;
	//  104  201:return          
		}
		if(i == 8)
	//* 105  202:iload           4
	//* 106  204:bipush          8
	//* 107  206:icmpne          220
		{
			datamap.putBoolean(s, ((zzbld.zza.zza.zza) (obj)).zzbVG);
	//  108  209:aload_1         
	//  109  210:aload_2         
	//  110  211:aload           6
	//  111  213:getfield        #149 <Field boolean zzbld$zza$zza$zza.zzbVG>
	//  112  216:invokevirtual   #329 <Method void DataMap.putBoolean(String, boolean)>
			return;
	//  113  219:return          
		}
		if(i == 13)
	//* 114  220:iload           4
	//* 115  222:bipush          13
	//* 116  224:icmpne          295
			if(list == null)
	//* 117  227:aload_0         
	//* 118  228:ifnonnull       274
			{
				list = ((List) (String.valueOf(((Object) (s)))));
	//  119  231:aload_2         
	//  120  232:invokestatic    #24  <Method String String.valueOf(Object)>
	//  121  235:astore_0        
				if(((String) (list)).length() != 0)
	//* 122  236:aload_0         
	//* 123  237:invokevirtual   #28  <Method int String.length()>
	//* 124  240:ifeq            254
					list = ((List) ("populateBundle: unexpected type for: ".concat(((String) (list)))));
	//  125  243:ldc2            #331 <String "populateBundle: unexpected type for: ">
	//  126  246:aload_0         
	//  127  247:invokevirtual   #258 <Method String String.concat(String)>
	//  128  250:astore_0        
				else
	//* 129  251:goto            265
					list = ((List) (new String("populateBundle: unexpected type for: ")));
	//  130  254:new             #20  <Class String>
	//  131  257:dup             
	//  132  258:ldc2            #331 <String "populateBundle: unexpected type for: ">
	//  133  261:invokespecial   #259 <Method void String(String)>
	//  134  264:astore_0        
				throw new RuntimeException(((String) (list)));
	//  135  265:new             #261 <Class RuntimeException>
	//  136  268:dup             
	//  137  269:aload_0         
	//  138  270:invokespecial   #262 <Method void RuntimeException(String)>
	//  139  273:athrow          
			} else
			{
				datamap.putAsset(s, (Asset)list.get((int)((zzbld.zza.zza.zza) (obj)).zzbVM));
	//  140  274:aload_1         
	//  141  275:aload_2         
	//  142  276:aload_0         
	//  143  277:aload           6
	//  144  279:getfield        #185 <Field long zzbld$zza$zza$zza.zzbVM>
	//  145  282:l2i             
	//  146  283:invokeinterface #332 <Method Object List.get(int)>
	//  147  288:checkcast       #180 <Class Asset>
	//  148  291:invokevirtual   #336 <Method void DataMap.putAsset(String, Asset)>
				return;
	//  149  294:return          
			}
		if(i == 9)
	//* 150  295:iload           4
	//* 151  297:bipush          9
	//* 152  299:icmpne          370
		{
			zza1 = ((zzbld.zza.zza) (new DataMap()));
	//  153  302:new             #187 <Class DataMap>
	//  154  305:dup             
	//  155  306:invokespecial   #265 <Method void DataMap()>
	//  156  309:astore_3        
			obj = ((Object) (((zzbld.zza.zza.zza) (obj)).zzbVH));
	//  157  310:aload           6
	//  158  312:getfield        #229 <Field zzbld$zza[] zzbld$zza$zza$zza.zzbVH>
	//  159  315:astore          6
			int j = obj.length;
	//  160  317:aload           6
	//  161  319:arraylength     
	//  162  320:istore          5
			for(i = 0; i < j; i++)
	//* 163  322:iconst_0        
	//* 164  323:istore          4
	//* 165  325:iload           4
	//* 166  327:iload           5
	//* 167  329:icmpge          363
			{
				Object obj1 = obj[i];
	//  168  332:aload           6
	//  169  334:iload           4
	//  170  336:aaload          
	//  171  337:astore          7
				zza(list, ((DataMap) (zza1)), ((zzbld.zza) (obj1)).name, ((zzbld.zza) (obj1)).zzbVw);
	//  172  339:aload_0         
	//  173  340:aload_3         
	//  174  341:aload           7
	//  175  343:getfield        #216 <Field String zzbld$zza.name>
	//  176  346:aload           7
	//  177  348:getfield        #226 <Field zzbld$zza$zza zzbld$zza.zzbVw>
	//  178  351:invokestatic    #276 <Method void zza(List, DataMap, String, zzbld$zza$zza)>
			}

	//  179  354:iload           4
	//  180  356:iconst_1        
	//  181  357:iadd            
	//  182  358:istore          4
	//* 183  360:goto            325
			datamap.putDataMap(s, ((DataMap) (zza1)));
	//  184  363:aload_1         
	//  185  364:aload_2         
	//  186  365:aload_3         
	//  187  366:invokevirtual   #340 <Method void DataMap.putDataMap(String, DataMap)>
			return;
	//  188  369:return          
		}
		if(i == 10)
	//* 189  370:iload           4
	//* 190  372:bipush          10
	//* 191  374:icmpne          492
		{
			i = zza(s, ((zzbld.zza.zza.zza) (obj)).zzbVI);
	//  192  377:aload_2         
	//  193  378:aload           6
	//  194  380:getfield        #247 <Field zzbld$zza$zza[] zzbld$zza$zza$zza.zzbVI>
	//  195  383:invokestatic    #342 <Method int zza(String, zzbld$zza$zza[])>
	//  196  386:istore          4
			list = ((List) (zza(list, ((zzbld.zza.zza.zza) (obj)), i)));
	//  197  388:aload_0         
	//  198  389:aload           6
	//  199  391:iload           4
	//  200  393:invokestatic    #344 <Method ArrayList zza(List, zzbld$zza$zza$zza, int)>
	//  201  396:astore_0        
			if(i == 14)
	//* 202  397:iload           4
	//* 203  399:bipush          14
	//* 204  401:icmpne          413
				datamap.putStringArrayList(s, ((ArrayList) (list)));
	//  205  404:aload_1         
	//  206  405:aload_2         
	//  207  406:aload_0         
	//  208  407:invokevirtual   #348 <Method void DataMap.putStringArrayList(String, ArrayList)>
			else
	//* 209  410:goto            491
			if(i == 9)
	//* 210  413:iload           4
	//* 211  415:bipush          9
	//* 212  417:icmpne          429
				datamap.putDataMapArrayList(s, ((ArrayList) (list)));
	//  213  420:aload_1         
	//  214  421:aload_2         
	//  215  422:aload_0         
	//  216  423:invokevirtual   #351 <Method void DataMap.putDataMapArrayList(String, ArrayList)>
			else
	//* 217  426:goto            491
			if(i == 2)
	//* 218  429:iload           4
	//* 219  431:iconst_2        
	//* 220  432:icmpne          444
				datamap.putStringArrayList(s, ((ArrayList) (list)));
	//  221  435:aload_1         
	//  222  436:aload_2         
	//  223  437:aload_0         
	//  224  438:invokevirtual   #348 <Method void DataMap.putStringArrayList(String, ArrayList)>
			else
	//* 225  441:goto            491
			if(i == 6)
	//* 226  444:iload           4
	//* 227  446:bipush          6
	//* 228  448:icmpne          460
				datamap.putIntegerArrayList(s, ((ArrayList) (list)));
	//  229  451:aload_1         
	//  230  452:aload_2         
	//  231  453:aload_0         
	//  232  454:invokevirtual   #354 <Method void DataMap.putIntegerArrayList(String, ArrayList)>
			else
	//* 233  457:goto            491
				throw new IllegalStateException((new StringBuilder(39)).append("Unexpected typeOfArrayList: ").append(i).toString());
	//  234  460:new             #356 <Class IllegalStateException>
	//  235  463:dup             
	//  236  464:new             #18  <Class StringBuilder>
	//  237  467:dup             
	//  238  468:bipush          39
	//  239  470:invokespecial   #32  <Method void StringBuilder(int)>
	//  240  473:ldc2            #284 <String "Unexpected typeOfArrayList: ">
	//  241  476:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//  242  479:iload           4
	//  243  481:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//  244  484:invokevirtual   #47  <Method String StringBuilder.toString()>
	//  245  487:invokespecial   #357 <Method void IllegalStateException(String)>
	//  246  490:athrow          
			return;
	//  247  491:return          
		} else
		{
			throw new RuntimeException((new StringBuilder(43)).append("populateBundle: unexpected type ").append(i).toString());
	//  248  492:new             #261 <Class RuntimeException>
	//  249  495:dup             
	//  250  496:new             #18  <Class StringBuilder>
	//  251  499:dup             
	//  252  500:bipush          43
	//  253  502:invokespecial   #32  <Method void StringBuilder(int)>
	//  254  505:ldc2            #359 <String "populateBundle: unexpected type ">
	//  255  508:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//  256  511:iload           4
	//  257  513:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//  258  516:invokevirtual   #47  <Method String StringBuilder.toString()>
	//  259  519:invokespecial   #262 <Method void RuntimeException(String)>
	//  260  522:athrow          
		}
	}

	private static zzbld.zza[] zza(DataMap datamap, List list)
	{
		Object obj = ((Object) (new TreeSet(((java.util.Collection) (datamap.keySet())))));
	//    0    0:new             #189 <Class TreeSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #193 <Method java.util.Set DataMap.keySet()>
	//    4    8:invokespecial   #196 <Method void TreeSet(java.util.Collection)>
	//    5   11:astore          4
		zzbld.zza azza[] = new zzbld.zza[((TreeSet) (obj)).size()];
	//    6   13:aload           4
	//    7   15:invokevirtual   #197 <Method int TreeSet.size()>
	//    8   18:anewarray       zzbld.zza[]
	//    9   21:astore_3        
		int i = 0;
	//   10   22:iconst_0        
	//   11   23:istore_2        
		for(obj = ((Object) (((TreeSet) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  12   24:aload           4
	//*  13   26:invokevirtual   #203 <Method Iterator TreeSet.iterator()>
	//*  14   29:astore          4
	//*  15   31:aload           4
	//*  16   33:invokeinterface #208 <Method boolean Iterator.hasNext()>
	//*  17   38:ifeq            98
		{
			String s = (String)((Iterator) (obj)).next();
	//   18   41:aload           4
	//   19   43:invokeinterface #212 <Method Object Iterator.next()>
	//   20   48:checkcast       #20  <Class String>
	//   21   51:astore          5
			Object obj1 = datamap.get(s);
	//   22   53:aload_0         
	//   23   54:aload           5
	//   24   56:invokevirtual   #220 <Method Object DataMap.get(String)>
	//   25   59:astore          6
			azza[i] = new zzbld.zza();
	//   26   61:aload_3         
	//   27   62:iload_2         
	//   28   63:new             #199 <Class zzbld$zza>
	//   29   66:dup             
	//   30   67:invokespecial   #213 <Method void zzbld$zza()>
	//   31   70:aastore         
			azza[i].name = s;
	//   32   71:aload_3         
	//   33   72:iload_2         
	//   34   73:aaload          
	//   35   74:aload           5
	//   36   76:putfield        #216 <Field String zzbld$zza.name>
			azza[i].zzbVw = zza(list, obj1);
	//   37   79:aload_3         
	//   38   80:iload_2         
	//   39   81:aaload          
	//   40   82:aload_1         
	//   41   83:aload           6
	//   42   85:invokestatic    #222 <Method zzbld$zza$zza zza(List, Object)>
	//   43   88:putfield        #226 <Field zzbld$zza$zza zzbld$zza.zzbVw>
			i++;
	//   44   91:iload_2         
	//   45   92:iconst_1        
	//   46   93:iadd            
	//   47   94:istore_2        
		}

	//*  48   95:goto            31
		return azza;
	//   49   98:aload_3         
	//   50   99:areturn         
	}
}
