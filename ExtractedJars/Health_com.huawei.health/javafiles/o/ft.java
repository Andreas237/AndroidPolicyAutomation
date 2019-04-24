// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.text.TextUtils;

// Referenced classes of package o:
//			fw, fu

public final class ft
{

	public ft()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static void b(String s, String s1, String s2)
	{
		if(e == null)
	//*   0    0:getstatic       #15  <Field fw e>
	//*   1    3:ifnonnull       7
		{
			return;
	//    2    6:return          
		} else
		{
			e.a(s, s1, s2);
	//    3    7:getstatic       #15  <Field fw e>
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #20  <Method void fw.a(String, String, String)>
			return;
	//    8   16:return          
		}
	}

	public static void c(String s, Throwable throwable)
	{
		if(e == null)
	//*   0    0:getstatic       #15  <Field fw e>
	//*   1    3:ifnonnull       7
			return;
	//    2    6:return          
		if(((Object) (throwable)).getClass() == null)
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #26  <Method Class Object.getClass()>
	//*   5   11:ifnonnull       15
		{
			return;
	//    6   14:return          
		} else
		{
			e.d(s, ((Object) (throwable)).getClass().getSimpleName(), throwable);
	//    7   15:getstatic       #15  <Field fw e>
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #26  <Method Class Object.getClass()>
	//   11   23:invokevirtual   #32  <Method String Class.getSimpleName()>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #36  <Method void fw.d(String, String, Throwable)>
			return;
	//   14   30:return          
		}
	}

	public static void d(Context context, String s)
	{
		o/ft;
	//    0    0:ldc1            #2   <Class ft>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(e != null)
			break MISSING_BLOCK_LABEL_13;
	//    2    3:getstatic       #15  <Field fw e>
	//    3    6:ifnonnull       13
		o/ft;
	//    4    9:ldc1            #2   <Class ft>
		JVM INSTR monitorexit ;
	//    5   11:monitorexit     
		return;
	//    6   12:return          
		fw fw1 = e;
	//    7   13:getstatic       #15  <Field fw e>
	//    8   16:astore          8
		if(!TextUtils.isEmpty(((CharSequence) (fw1.g)))) goto _L2; else goto _L1
	//    9   18:aload           8
	//   10   20:getfield        #41  <Field String fw.g>
	//   11   23:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   12   26:ifeq            35
_L1:
		s = "";
	//   13   29:ldc1            #49  <String "">
	//   14   31:astore_1        
		  goto _L3
	//*  15   32:goto            361
_L2:
		String s1;
		String s2;
		String s3;
		String as[];
		s2 = null;
	//   16   35:aconst_null     
	//   17   36:astore          5
		s1 = null;
	//   18   38:aconst_null     
	//   19   39:astore          4
		s3 = null;
	//   20   41:aconst_null     
	//   21   42:astore          6
		as = null;
	//   22   44:aconst_null     
	//   23   45:astore          7
		String as1[] = s.split("&");
	//   24   47:aload_1         
	//   25   48:ldc1            #51  <String "&">
	//   26   50:invokevirtual   #57  <Method String[] String.split(String)>
	//   27   53:astore          9
		if(as1 == null) goto _L5; else goto _L4
	//   28   55:aload           9
	//   29   57:ifnull          222
_L4:
		int j = as1.length;
	//   30   60:aload           9
	//   31   62:arraylength     
	//   32   63:istore_3        
		int i;
		i = 0;
	//   33   64:iconst_0        
	//   34   65:istore_2        
		s = ((String) (as));
	//   35   66:aload           7
	//   36   68:astore_1        
_L16:
		s2 = s1;
	//   37   69:aload           4
	//   38   71:astore          5
		s3 = s;
	//   39   73:aload_1         
	//   40   74:astore          6
		if(i >= j) goto _L5; else goto _L6
	//   41   76:iload_2         
	//   42   77:iload_3         
	//   43   78:icmpge          222
_L6:
		as = as1[i].split("=");
	//   44   81:aload           9
	//   45   83:iload_2         
	//   46   84:aaload          
	//   47   85:ldc1            #59  <String "=">
	//   48   87:invokevirtual   #57  <Method String[] String.split(String)>
	//   49   90:astore          7
		s2 = s1;
	//   50   92:aload           4
	//   51   94:astore          5
		s3 = s;
	//   52   96:aload_1         
	//   53   97:astore          6
		if(as == null) goto _L8; else goto _L7
	//   54   99:aload           7
	//   55  101:ifnull          394
_L7:
		s2 = s1;
	//   56  104:aload           4
	//   57  106:astore          5
		s3 = s;
	//   58  108:aload_1         
	//   59  109:astore          6
		if(as.length != 2) goto _L8; else goto _L9
	//   60  111:aload           7
	//   61  113:arraylength     
	//   62  114:iconst_2        
	//   63  115:icmpne          394
_L9:
		if(!as[0].equalsIgnoreCase("partner")) goto _L11; else goto _L10
	//   64  118:aload           7
	//   65  120:iconst_0        
	//   66  121:aaload          
	//   67  122:ldc1            #61  <String "partner">
	//   68  124:invokevirtual   #65  <Method boolean String.equalsIgnoreCase(String)>
	//   69  127:ifeq            152
_L10:
		as[1].replace("\"", "");
	//   70  130:aload           7
	//   71  132:iconst_1        
	//   72  133:aaload          
	//   73  134:ldc1            #67  <String "\"">
	//   74  136:ldc1            #49  <String "">
	//   75  138:invokevirtual   #71  <Method String String.replace(CharSequence, CharSequence)>
	//   76  141:pop             
		s2 = s1;
	//   77  142:aload           4
	//   78  144:astore          5
		s3 = s;
	//   79  146:aload_1         
	//   80  147:astore          6
		  goto _L8
	//*  81  149:goto            394
_L11:
		if(!as[0].equalsIgnoreCase("out_trade_no")) goto _L13; else goto _L12
	//   82  152:aload           7
	//   83  154:iconst_0        
	//   84  155:aaload          
	//   85  156:ldc1            #73  <String "out_trade_no">
	//   86  158:invokevirtual   #65  <Method boolean String.equalsIgnoreCase(String)>
	//   87  161:ifeq            183
_L12:
		s2 = as[1].replace("\"", "");
	//   88  164:aload           7
	//   89  166:iconst_1        
	//   90  167:aaload          
	//   91  168:ldc1            #67  <String "\"">
	//   92  170:ldc1            #49  <String "">
	//   93  172:invokevirtual   #71  <Method String String.replace(CharSequence, CharSequence)>
	//   94  175:astore          5
		s3 = s;
	//   95  177:aload_1         
	//   96  178:astore          6
		  goto _L8
	//*  97  180:goto            394
_L13:
		s2 = s1;
	//   98  183:aload           4
	//   99  185:astore          5
		s3 = s;
	//  100  187:aload_1         
	//  101  188:astore          6
		if(!as[0].equalsIgnoreCase("trade_no")) goto _L8; else goto _L14
	//  102  190:aload           7
	//  103  192:iconst_0        
	//  104  193:aaload          
	//  105  194:ldc1            #75  <String "trade_no">
	//  106  196:invokevirtual   #65  <Method boolean String.equalsIgnoreCase(String)>
	//  107  199:ifeq            394
_L14:
		s3 = as[1].replace("\"", "");
	//  108  202:aload           7
	//  109  204:iconst_1        
	//  110  205:aaload          
	//  111  206:ldc1            #67  <String "\"">
	//  112  208:ldc1            #49  <String "">
	//  113  210:invokevirtual   #71  <Method String String.replace(CharSequence, CharSequence)>
	//  114  213:astore          6
		s2 = s1;
	//  115  215:aload           4
	//  116  217:astore          5
		  goto _L8
	//* 117  219:goto            394
_L5:
		s = fw.d(s3);
	//  118  222:aload           6
	//  119  224:invokestatic    #78  <Method String fw.d(String)>
	//  120  227:astore_1        
		s1 = fw.d(s2);
	//  121  228:aload           5
	//  122  230:invokestatic    #78  <Method String fw.d(String)>
	//  123  233:astore          4
		fw1.c = String.format("%s,%s,-,%s,-,-,-", new Object[] {
			s, s1, fw.d(s1)
		});
	//  124  235:aload           8
	//  125  237:ldc1            #80  <String "%s,%s,-,%s,-,-,-">
	//  126  239:iconst_3        
	//  127  240:anewarray       Object[]
	//  128  243:dup             
	//  129  244:iconst_0        
	//  130  245:aload_1         
	//  131  246:aastore         
	//  132  247:dup             
	//  133  248:iconst_1        
	//  134  249:aload           4
	//  135  251:aastore         
	//  136  252:dup             
	//  137  253:iconst_2        
	//  138  254:aload           4
	//  139  256:invokestatic    #78  <Method String fw.d(String)>
	//  140  259:aastore         
	//  141  260:invokestatic    #84  <Method String String.format(String, Object[])>
	//  142  263:putfield        #86  <Field String fw.c>
		s = String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", new Object[] {
			fw1.b, fw1.c, fw1.e, fw1.d, fw1.a, fw1.f, fw1.h, fw1.k, fw1.g, fw1.i
		});
	//  143  266:ldc1            #88  <String "[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]">
	//  144  268:bipush          10
	//  145  270:anewarray       Object[]
	//  146  273:dup             
	//  147  274:iconst_0        
	//  148  275:aload           8
	//  149  277:getfield        #90  <Field String fw.b>
	//  150  280:aastore         
	//  151  281:dup             
	//  152  282:iconst_1        
	//  153  283:aload           8
	//  154  285:getfield        #86  <Field String fw.c>
	//  155  288:aastore         
	//  156  289:dup             
	//  157  290:iconst_2        
	//  158  291:aload           8
	//  159  293:getfield        #92  <Field String fw.e>
	//  160  296:aastore         
	//  161  297:dup             
	//  162  298:iconst_3        
	//  163  299:aload           8
	//  164  301:getfield        #94  <Field String fw.d>
	//  165  304:aastore         
	//  166  305:dup             
	//  167  306:iconst_4        
	//  168  307:aload           8
	//  169  309:getfield        #96  <Field String fw.a>
	//  170  312:aastore         
	//  171  313:dup             
	//  172  314:iconst_5        
	//  173  315:aload           8
	//  174  317:getfield        #99  <Field String fw.f>
	//  175  320:aastore         
	//  176  321:dup             
	//  177  322:bipush          6
	//  178  324:aload           8
	//  179  326:getfield        #102 <Field String fw.h>
	//  180  329:aastore         
	//  181  330:dup             
	//  182  331:bipush          7
	//  183  333:aload           8
	//  184  335:getfield        #105 <Field String fw.k>
	//  185  338:aastore         
	//  186  339:dup             
	//  187  340:bipush          8
	//  188  342:aload           8
	//  189  344:getfield        #41  <Field String fw.g>
	//  190  347:aastore         
	//  191  348:dup             
	//  192  349:bipush          9
	//  193  351:aload           8
	//  194  353:getfield        #108 <Field String fw.i>
	//  195  356:aastore         
	//  196  357:invokestatic    #84  <Method String String.format(String, Object[])>
	//  197  360:astore_1        
_L3:
		(new Thread(((Runnable) (new fu(context, s))))).start();
	//  198  361:new             #110 <Class Thread>
	//  199  364:dup             
	//  200  365:new             #112 <Class fu>
	//  201  368:dup             
	//  202  369:aload_0         
	//  203  370:aload_1         
	//  204  371:invokespecial   #114 <Method void fu(Context, String)>
	//  205  374:invokespecial   #117 <Method void Thread(Runnable)>
	//  206  377:invokevirtual   #120 <Method void Thread.start()>
		e = null;
	//  207  380:aconst_null     
	//  208  381:putstatic       #15  <Field fw e>
		o/ft;
	//  209  384:ldc1            #2   <Class ft>
		JVM INSTR monitorexit ;
	//  210  386:monitorexit     
		return;
	//  211  387:return          
		context;
	//  212  388:astore_0        
	//* 213  389:ldc1            #2   <Class ft>
		throw context;
	//  214  391:monitorexit     
	//  215  392:aload_0         
	//  216  393:athrow          
_L8:
		i++;
	//  217  394:iload_2         
	//  218  395:iconst_1        
	//  219  396:iadd            
	//  220  397:istore_2        
		s1 = s2;
	//  221  398:aload           5
	//  222  400:astore          4
		s = s3;
	//  223  402:aload           6
	//  224  404:astore_1        
		if(true) goto _L16; else goto _L15
	//  225  405:goto            69
_L15:
	}

	public static void e(Context context)
	{
		if(e != null)
	//*   0    0:getstatic       #15  <Field fw e>
	//*   1    3:ifnull          7
		{
			return;
	//    2    6:return          
		} else
		{
			e = new fw(context);
	//    3    7:new             #17  <Class fw>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #123 <Method void fw(Context)>
	//    7   15:putstatic       #15  <Field fw e>
			return;
	//    8   18:return          
		}
	}

	public static void e(String s, String s1, Throwable throwable)
	{
		if(e == null)
	//*   0    0:getstatic       #15  <Field fw e>
	//*   1    3:ifnonnull       7
		{
			return;
	//    2    6:return          
		} else
		{
			e.d(s, s1, throwable);
	//    3    7:getstatic       #15  <Field fw e>
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #36  <Method void fw.d(String, String, Throwable)>
			return;
	//    8   16:return          
		}
	}

	private static fw e;
}
