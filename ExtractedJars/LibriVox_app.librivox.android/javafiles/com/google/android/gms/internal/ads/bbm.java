// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, bch, bav, akh, 
//			awq, bbd, p, bwk, 
//			m, ahi

public final class bbm extends bcg
{

	public bbm(bav bav1, String s, String s1, akh akh1, int i, int j, Context context, 
			ahi ahi)
	{
		super(bav1, s, s1, akh1, i, 27);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:bipush          27
	//    7   10:invokespecial   #24  <Method void bcg(bav, String, String, akh, int, int)>
		f = null;
	//    8   13:aload_0         
	//    9   14:aconst_null     
	//   10   15:putfield        #26  <Field ahi f>
		e = context;
	//   11   18:aload_0         
	//   12   19:aload           7
	//   13   21:putfield        #28  <Field Context e>
		f = ahi;
	//   14   24:aload_0         
	//   15   25:aload           8
	//   16   27:putfield        #26  <Field ahi f>
	//   17   30:return          
	}

	private final String c()
	{
		Object obj;
		if(a.l() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field bav a>
	//*   2    4:invokevirtual   #44  <Method Future bav.l()>
	//*   3    7:ifnull          23
			a.l().get();
	//    4   10:aload_0         
	//    5   11:getfield        #38  <Field bav a>
	//    6   14:invokevirtual   #44  <Method Future bav.l()>
	//    7   17:invokeinterface #50  <Method Object Future.get()>
	//    8   22:pop             
		obj = ((Object) (a.k()));
	//    9   23:aload_0         
	//   10   24:getfield        #38  <Field bav a>
	//   11   27:invokevirtual   #54  <Method akh bav.k()>
	//   12   30:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_49;
	//   13   31:aload_1         
	//   14   32:ifnull          49
		if(((akh) (obj)).n == null)
			break MISSING_BLOCK_LABEL_49;
	//   15   35:aload_1         
	//   16   36:getfield        #60  <Field String akh.n>
	//   17   39:ifnull          49
		obj = ((Object) (((akh) (obj)).n));
	//   18   42:aload_1         
	//   19   43:getfield        #60  <Field String akh.n>
	//   20   46:astore_1        
		return ((String) (obj));
	//   21   47:aload_1         
	//   22   48:areturn         
_L2:
		return null;
	//   23   49:aconst_null     
	//   24   50:areturn         
		Object obj1;
		obj1;
	//   25   51:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  26   52:goto            49
	}

	protected final void a()
	{
		Object obj = ((Object) (d.a(e.getPackageName())));
	//    0    0:getstatic       #19  <Field bch d>
	//    1    3:aload_0         
	//    2    4:getfield        #28  <Field Context e>
	//    3    7:invokevirtual   #65  <Method String Context.getPackageName()>
	//    4   10:invokevirtual   #68  <Method AtomicReference bch.a(String)>
	//    5   13:astore_3        
		obj;
	//    6   14:aload_3         
		JVM INSTR monitorenter ;
	//    7   15:monitorenter    
		Object obj1 = ((Object) ((awq)((AtomicReference) (obj)).get()));
	//    8   16:aload_3         
	//    9   17:invokevirtual   #71  <Method Object AtomicReference.get()>
	//   10   20:checkcast       #73  <Class awq>
	//   11   23:astore          4
		boolean flag = false;
	//   12   25:iconst_0        
	//   13   26:istore_2        
		if(obj1 == null) goto _L2; else goto _L1
	//   14   27:aload           4
	//   15   29:ifnull          413
_L1:
		byte byte0;
		Exception exception;
		Object obj2;
		Context context;
		if(!bbd.b(((awq) (obj1)).a) && !((awq) (obj1)).a.equals("E") && !((awq) (obj1)).a.equals("0000000000000000000000000000000000000000000000000000000000000000"))
	//*  16   32:aload           4
	//*  17   34:getfield        #75  <Field String awq.a>
	//*  18   37:invokestatic    #81  <Method boolean bbd.b(String)>
	//*  19   40:ifne            413
	//*  20   43:aload           4
	//*  21   45:getfield        #75  <Field String awq.a>
	//*  22   48:ldc1            #83  <String "E">
	//*  23   50:invokevirtual   #89  <Method boolean String.equals(Object)>
	//*  24   53:ifne            413
	//*  25   56:aload           4
	//*  26   58:getfield        #75  <Field String awq.a>
	//*  27   61:ldc1            #91  <String "0000000000000000000000000000000000000000000000000000000000000000">
	//*  28   63:invokevirtual   #89  <Method boolean String.equals(Object)>
	//*  29   66:ifeq            408
	//*  30   69:goto            413
	//*  31   72:iload_1         
	//*  32   73:ifeq            305
	//*  33   76:aload_0         
	//*  34   77:getfield        #26  <Field ahi f>
	//*  35   80:astore          4
	//*  36   82:aconst_null     
	//*  37   83:invokestatic    #81  <Method boolean bbd.b(String)>
	//*  38   86:ifne            94
	//*  39   89:iconst_4        
	//*  40   90:istore_1        
	//*  41   91:goto            174
	//*  42   94:aload_0         
	//*  43   95:getfield        #26  <Field ahi f>
	//*  44   98:astore          4
	//*  45  100:aconst_null     
	//*  46  101:invokestatic    #81  <Method boolean bbd.b(String)>
	//*  47  104:pop             
	//*  48  105:iconst_0        
	//*  49  106:invokestatic    #97  <Method Boolean Boolean.valueOf(boolean)>
	//*  50  109:invokevirtual   #101 <Method boolean Boolean.booleanValue()>
	//*  51  112:ifeq            429
	//*  52  115:aload_0         
	//*  53  116:getfield        #38  <Field bav a>
	//*  54  119:invokevirtual   #104 <Method boolean bav.i()>
	//*  55  122:ifeq            418
	//*  56  125:getstatic       #110 <Field e p.bq>
	//*  57  128:astore          4
	//*  58  130:invokestatic    #115 <Method m bwk.e()>
	//*  59  133:aload           4
	//*  60  135:invokevirtual   #120 <Method Object m.a(e)>
	//*  61  138:checkcast       #93  <Class Boolean>
	//*  62  141:invokevirtual   #101 <Method boolean Boolean.booleanValue()>
	//*  63  144:ifeq            418
	//*  64  147:getstatic       #123 <Field e p.br>
	//*  65  150:astore          4
	//*  66  152:invokestatic    #115 <Method m bwk.e()>
	//*  67  155:aload           4
	//*  68  157:invokevirtual   #120 <Method Object m.a(e)>
	//*  69  160:checkcast       #93  <Class Boolean>
	//*  70  163:invokevirtual   #101 <Method boolean Boolean.booleanValue()>
	//*  71  166:ifeq            418
	//*  72  169:iconst_1        
	//*  73  170:istore_1        
	//*  74  171:goto            420
	//*  75  174:aload_0         
	//*  76  175:getfield        #126 <Field Method c>
	//*  77  178:astore          4
	//*  78  180:aload_0         
	//*  79  181:getfield        #28  <Field Context e>
	//*  80  184:astore          6
	//*  81  186:iload_1         
	//*  82  187:iconst_2        
	//*  83  188:icmpne          193
	//*  84  191:iconst_1        
	//*  85  192:istore_2        
	//*  86  193:getstatic       #129 <Field e p.bk>
	//*  87  196:astore          5
	//*  88  198:new             #73  <Class awq>
	//*  89  201:dup             
	//*  90  202:aload           4
	//*  91  204:aconst_null     
	//*  92  205:iconst_3        
	//*  93  206:anewarray       Object[]
	//*  94  209:dup             
	//*  95  210:iconst_0        
	//*  96  211:aload           6
	//*  97  213:aastore         
	//*  98  214:dup             
	//*  99  215:iconst_1        
	//* 100  216:iload_2         
	//* 101  217:invokestatic    #97  <Method Boolean Boolean.valueOf(boolean)>
	//* 102  220:aastore         
	//* 103  221:dup             
	//* 104  222:iconst_2        
	//* 105  223:invokestatic    #115 <Method m bwk.e()>
	//* 106  226:aload           5
	//* 107  228:invokevirtual   #120 <Method Object m.a(e)>
	//* 108  231:aastore         
	//* 109  232:invokevirtual   #137 <Method Object Method.invoke(Object, Object[])>
	//* 110  235:checkcast       #85  <Class String>
	//* 111  238:invokespecial   #140 <Method void awq(String)>
	//* 112  241:astore          5
	//* 113  243:aload           5
	//* 114  245:getfield        #75  <Field String awq.a>
	//* 115  248:invokestatic    #81  <Method boolean bbd.b(String)>
	//* 116  251:ifne            434
	//* 117  254:aload           5
	//* 118  256:getfield        #75  <Field String awq.a>
	//* 119  259:ldc1            #83  <String "E">
	//* 120  261:invokevirtual   #89  <Method boolean String.equals(Object)>
	//* 121  264:ifeq            299
	//* 122  267:goto            434
	//* 123  270:new             #142 <Class NullPointerException>
	//* 124  273:dup             
	//* 125  274:invokespecial   #143 <Method void NullPointerException()>
	//* 126  277:athrow          
	//* 127  278:aload_0         
	//* 128  279:invokespecial   #145 <Method String c()>
	//* 129  282:astore          4
	//* 130  284:aload           4
	//* 131  286:invokestatic    #81  <Method boolean bbd.b(String)>
	//* 132  289:ifne            299
	//* 133  292:aload           5
	//* 134  294:aload           4
	//* 135  296:putfield        #75  <Field String awq.a>
	//* 136  299:aload_3         
	//* 137  300:aload           5
	//* 138  302:invokevirtual   #149 <Method void AtomicReference.set(Object)>
	//* 139  305:aload_3         
	//* 140  306:invokevirtual   #71  <Method Object AtomicReference.get()>
	//* 141  309:checkcast       #73  <Class awq>
	//* 142  312:astore          4
	//* 143  314:aload_3         
	//* 144  315:monitorexit     
	//* 145  316:aload_0         
	//* 146  317:getfield        #152 <Field akh b>
	//* 147  320:astore_3        
	//* 148  321:aload_3         
	//* 149  322:monitorenter    
	//* 150  323:aload           4
	//* 151  325:ifnull          391
	//* 152  328:aload_0         
	//* 153  329:getfield        #152 <Field akh b>
	//* 154  332:aload           4
	//* 155  334:getfield        #75  <Field String awq.a>
	//* 156  337:putfield        #60  <Field String akh.n>
	//* 157  340:aload_0         
	//* 158  341:getfield        #152 <Field akh b>
	//* 159  344:aload           4
	//* 160  346:getfield        #155 <Field long awq.b>
	//* 161  349:invokestatic    #160 <Method Long Long.valueOf(long)>
	//* 162  352:putfield        #164 <Field Long akh.t>
	//* 163  355:aload_0         
	//* 164  356:getfield        #152 <Field akh b>
	//* 165  359:aload           4
	//* 166  361:getfield        #166 <Field String awq.c>
	//* 167  364:putfield        #169 <Field String akh.s>
	//* 168  367:aload_0         
	//* 169  368:getfield        #152 <Field akh b>
	//* 170  371:aload           4
	//* 171  373:getfield        #171 <Field String awq.d>
	//* 172  376:putfield        #174 <Field String akh.C>
	//* 173  379:aload_0         
	//* 174  380:getfield        #152 <Field akh b>
	//* 175  383:aload           4
	//* 176  385:getfield        #176 <Field String awq.e>
	//* 177  388:putfield        #179 <Field String akh.D>
	//* 178  391:aload_3         
	//* 179  392:monitorexit     
	//* 180  393:return          
	//* 181  394:astore          4
	//* 182  396:aload_3         
	//* 183  397:monitorexit     
	//* 184  398:aload           4
	//* 185  400:athrow          
	//* 186  401:astore          4
	//* 187  403:aload_3         
	//* 188  404:monitorexit     
	//* 189  405:aload           4
	//* 190  407:athrow          
		{
			byte0 = 0;
	//  191  408:iconst_0        
	//  192  409:istore_1        
			continue; /* Loop/switch isn't completed */
	//  193  410:goto            72
		}
		  goto _L2
_L23:
		if(byte0 == 0) goto _L4; else goto _L3
_L3:
		obj1 = ((Object) (f));
		if(bbd.b(((String) (null)))) goto _L6; else goto _L5
_L5:
		byte0 = 4;
		  goto _L7
_L6:
		obj1 = ((Object) (f));
		bbd.b(((String) (null)));
		if(!Boolean.valueOf(false).booleanValue()) goto _L9; else goto _L8
_L8:
		if(!a.i()) goto _L11; else goto _L10
_L10:
		obj1 = ((Object) (p.bq));
		if(!((Boolean)bwk.e().a(((e) (obj1)))).booleanValue()) goto _L11; else goto _L12
_L12:
		obj1 = ((Object) (p.br));
		if(!((Boolean)bwk.e().a(((e) (obj1)))).booleanValue()) goto _L11; else goto _L13
_L13:
		byte0 = 1;
		  goto _L14
_L7:
		obj1 = ((Object) (c));
		context = e;
		if(byte0 == 2)
			flag = true;
		obj2 = ((Object) (p.bk));
		obj2 = ((Object) (new awq((String)((Method) (obj1)).invoke(((Object) (null)), new Object[] {
			context, Boolean.valueOf(flag), bwk.e().a(((e) (obj2)))
		}))));
		if(!bbd.b(((awq) (obj2)).a) && !((awq) (obj2)).a.equals("E")) goto _L16; else goto _L15
_L21:
		throw new NullPointerException();
_L18:
		obj1 = ((Object) (c()));
		if(!bbd.b(((String) (obj1))))
			obj2.a = ((String) (obj1));
_L16:
		((AtomicReference) (obj)).set(obj2);
_L4:
		obj1 = ((Object) ((awq)((AtomicReference) (obj)).get()));
		obj;
		JVM INSTR monitorexit ;
		obj = ((Object) (b));
		obj;
		JVM INSTR monitorenter ;
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_391;
		b.n = ((awq) (obj1)).a;
		b.t = Long.valueOf(((awq) (obj1)).b);
		b.s = ((awq) (obj1)).c;
		b.C = ((awq) (obj1)).d;
		b.D = ((awq) (obj1)).e;
		obj;
		JVM INSTR monitorexit ;
		return;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
_L2:
		byte0 = 1;
	//  194  413:iconst_1        
	//  195  414:istore_1        
		continue; /* Loop/switch isn't completed */
	//  196  415:goto            72
_L11:
		byte0 = 0;
	//  197  418:iconst_0        
	//  198  419:istore_1        
_L14:
		if(byte0 == 0) goto _L9; else goto _L17
	//  199  420:iload_1         
	//  200  421:ifeq            429
_L17:
		byte0 = 3;
	//  201  424:iconst_3        
	//  202  425:istore_1        
		  goto _L7
	//* 203  426:goto            174
_L9:
		byte0 = 2;
	//  204  429:iconst_2        
	//  205  430:istore_1        
		  goto _L7
	//* 206  431:goto            174
_L15:
		byte0;
	//  207  434:iload_1         
		JVM INSTR tableswitch 3 4: default 456
	//	               3 278
	//	               4 270;
	//  208  435:tableswitch     3 4: default 456
	//	               3 278
	//	               4 270
		   goto _L16 _L18 _L19
_L19:
		if(true) goto _L21; else goto _L20
_L20:
		if(true) goto _L23; else goto _L22
_L22:
	//* 209  456:goto            299
	}

	private static final bch d = new bch();
	private final Context e;
	private ahi f;

	static 
	{
	//    0    0:new             #14  <Class bch>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void bch()>
	//    3    7:putstatic       #19  <Field bch d>
	//*   4   10:return          
	}
}
