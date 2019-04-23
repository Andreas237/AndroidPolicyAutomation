// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bfm, bnw, bno, bfo, 
//			bfw, bdj, bfv, bfp, 
//			zzfs, bft

public final class bhl
	implements bfm
{

	public bhl(zzfs zzfs)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		b = zzfs;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field zzfs b>
	//    5    9:aload_0         
	//    6   10:new             #40  <Class bno>
	//    7   13:dup             
	//    8   14:bipush          9
	//    9   16:invokespecial   #43  <Method void bno(int)>
	//   10   19:putfield        #45  <Field bno c>
		e = 0;
	//   11   22:aload_0         
	//   12   23:iconst_0        
	//   13   24:putfield        #47  <Field int e>
	//   14   27:return          
	}

	public final int a(bfo bfo1, bft bft)
	{
_L16:
		int j;
		int l;
		int i1;
		i1 = e;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int e>
	//    2    4:istore          5
		j = 1;
	//    3    6:iconst_1        
	//    4    7:istore_3        
		l = 0;
	//    5    8:iconst_0        
	//    6    9:istore          4
		i1;
	//    7   11:iload           5
		JVM INSTR tableswitch 0 2: default 40
	//	               0 324
	//	               1 147
	//	               2 48;
	//    8   13:tableswitch     0 2: default 40
	//	               0 324
	//	               1 147
	//	               2 48
		   goto _L1 _L2 _L3 _L4
_L1:
		throw new IllegalStateException();
	//    9   40:new             #50  <Class IllegalStateException>
	//   10   43:dup             
	//   11   44:invokespecial   #51  <Method void IllegalStateException()>
	//   12   47:athrow          
_L4:
		for(; h > 0; h = h - 1)
	//*  13   48:aload_0         
	//*  14   49:getfield        #53  <Field int h>
	//*  15   52:ifle            114
		{
			c.a();
	//   16   55:aload_0         
	//   17   56:getfield        #45  <Field bno c>
	//   18   59:invokevirtual   #55  <Method void bno.a()>
			bfo1.b(c.a, 0, 3);
	//   19   62:aload_1         
	//   20   63:aload_0         
	//   21   64:getfield        #45  <Field bno c>
	//   22   67:getfield        #58  <Field byte[] bno.a>
	//   23   70:iconst_0        
	//   24   71:iconst_3        
	//   25   72:invokeinterface #63  <Method void bfo.b(byte[], int, int)>
			d.a(c, 3);
	//   26   77:aload_0         
	//   27   78:getfield        #65  <Field bfw d>
	//   28   81:aload_0         
	//   29   82:getfield        #45  <Field bno c>
	//   30   85:iconst_3        
	//   31   86:invokeinterface #70  <Method void bfw.a(bno, int)>
			i = i + 3;
	//   32   91:aload_0         
	//   33   92:aload_0         
	//   34   93:getfield        #72  <Field int i>
	//   35   96:iconst_3        
	//   36   97:iadd            
	//   37   98:putfield        #72  <Field int i>
		}

	//   38  101:aload_0         
	//   39  102:aload_0         
	//   40  103:getfield        #53  <Field int h>
	//   41  106:iconst_1        
	//   42  107:isub            
	//   43  108:putfield        #53  <Field int h>
	//*  44  111:goto            48
		j = i;
	//   45  114:aload_0         
	//   46  115:getfield        #72  <Field int i>
	//   47  118:istore_3        
		if(j > 0)
	//*  48  119:iload_3         
	//*  49  120:ifle            140
			d.a(g, 1, j, 0, ((bfx) (null)));
	//   50  123:aload_0         
	//   51  124:getfield        #65  <Field bfw d>
	//   52  127:aload_0         
	//   53  128:getfield        #74  <Field long g>
	//   54  131:iconst_1        
	//   55  132:iload_3         
	//   56  133:iconst_0        
	//   57  134:aconst_null     
	//   58  135:invokeinterface #77  <Method void bfw.a(long, int, int, int, bfx)>
		e = 1;
	//   59  140:aload_0         
	//   60  141:iconst_1        
	//   61  142:putfield        #47  <Field int e>
		return 0;
	//   62  145:iconst_0        
	//   63  146:ireturn         
_L3:
		c.a();
	//   64  147:aload_0         
	//   65  148:getfield        #45  <Field bno c>
	//   66  151:invokevirtual   #55  <Method void bno.a()>
		l = f;
	//   67  154:aload_0         
	//   68  155:getfield        #79  <Field int f>
	//   69  158:istore          4
		if(l != 0) goto _L6; else goto _L5
	//   70  160:iload           4
	//   71  162:ifne            211
_L5:
		if(bfo1.a(c.a, 0, 5, true)) goto _L8; else goto _L7
	//   72  165:aload_1         
	//   73  166:aload_0         
	//   74  167:getfield        #45  <Field bno c>
	//   75  170:getfield        #58  <Field byte[] bno.a>
	//   76  173:iconst_0        
	//   77  174:iconst_5        
	//   78  175:iconst_1        
	//   79  176:invokeinterface #82  <Method boolean bfo.a(byte[], int, int, boolean)>
	//   80  181:ifne            189
_L7:
		j = 0;
	//   81  184:iconst_0        
	//   82  185:istore_3        
		  goto _L9
	//*  83  186:goto            269
_L8:
		g = (c.j() * 1000L) / 45L;
	//   84  189:aload_0         
	//   85  190:aload_0         
	//   86  191:getfield        #45  <Field bno c>
	//   87  194:invokevirtual   #86  <Method long bno.j()>
	//   88  197:ldc2w           #87  <Long 1000L>
	//   89  200:lmul            
	//   90  201:ldc2w           #89  <Long 45L>
	//   91  204:ldiv            
	//   92  205:putfield        #74  <Field long g>
		  goto _L10
	//*  93  208:goto            253
_L6:
		if(l != 1) goto _L12; else goto _L11
	//   94  211:iload           4
	//   95  213:iconst_1        
	//   96  214:icmpne          288
_L11:
		if(bfo1.a(c.a, 0, 9, true)) goto _L14; else goto _L13
	//   97  217:aload_1         
	//   98  218:aload_0         
	//   99  219:getfield        #45  <Field bno c>
	//  100  222:getfield        #58  <Field byte[] bno.a>
	//  101  225:iconst_0        
	//  102  226:bipush          9
	//  103  228:iconst_1        
	//  104  229:invokeinterface #82  <Method boolean bfo.a(byte[], int, int, boolean)>
	//  105  234:ifne            242
_L13:
		j = 0;
	//  106  237:iconst_0        
	//  107  238:istore_3        
		  goto _L9
	//* 108  239:goto            269
_L14:
		g = c.m();
	//  109  242:aload_0         
	//  110  243:aload_0         
	//  111  244:getfield        #45  <Field bno c>
	//  112  247:invokevirtual   #93  <Method long bno.m()>
	//  113  250:putfield        #74  <Field long g>
_L10:
		h = c.f();
	//  114  253:aload_0         
	//  115  254:aload_0         
	//  116  255:getfield        #45  <Field bno c>
	//  117  258:invokevirtual   #96  <Method int bno.f()>
	//  118  261:putfield        #53  <Field int h>
		i = 0;
	//  119  264:aload_0         
	//  120  265:iconst_0        
	//  121  266:putfield        #72  <Field int i>
_L9:
		if(j != 0)
	//* 122  269:iload_3         
	//* 123  270:ifeq            281
		{
			e = 2;
	//  124  273:aload_0         
	//  125  274:iconst_2        
	//  126  275:putfield        #47  <Field int e>
		} else
	//* 127  278:goto            0
		{
			e = 0;
	//  128  281:aload_0         
	//  129  282:iconst_0        
	//  130  283:putfield        #47  <Field int e>
			return -1;
	//  131  286:iconst_m1       
	//  132  287:ireturn         
		}
		continue; /* Loop/switch isn't completed */
_L12:
		bfo1 = ((bfo) (new StringBuilder(39)));
	//  133  288:new             #98  <Class StringBuilder>
	//  134  291:dup             
	//  135  292:bipush          39
	//  136  294:invokespecial   #99  <Method void StringBuilder(int)>
	//  137  297:astore_1        
		((StringBuilder) (bfo1)).append("Unsupported version number: ");
	//  138  298:aload_1         
	//  139  299:ldc1            #101 <String "Unsupported version number: ">
	//  140  301:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  141  304:pop             
		((StringBuilder) (bfo1)).append(l);
	//  142  305:aload_1         
	//  143  306:iload           4
	//  144  308:invokevirtual   #108 <Method StringBuilder StringBuilder.append(int)>
	//  145  311:pop             
		throw new bdj(((StringBuilder) (bfo1)).toString());
	//  146  312:new             #110 <Class bdj>
	//  147  315:dup             
	//  148  316:aload_1         
	//  149  317:invokevirtual   #114 <Method String StringBuilder.toString()>
	//  150  320:invokespecial   #117 <Method void bdj(String)>
	//  151  323:athrow          
_L2:
		c.a();
	//  152  324:aload_0         
	//  153  325:getfield        #45  <Field bno c>
	//  154  328:invokevirtual   #55  <Method void bno.a()>
		int k = l;
	//  155  331:iload           4
	//  156  333:istore_3        
		if(bfo1.a(c.a, 0, 8, true))
	//* 157  334:aload_1         
	//* 158  335:aload_0         
	//* 159  336:getfield        #45  <Field bno c>
	//* 160  339:getfield        #58  <Field byte[] bno.a>
	//* 161  342:iconst_0        
	//* 162  343:bipush          8
	//* 163  345:iconst_1        
	//* 164  346:invokeinterface #82  <Method boolean bfo.a(byte[], int, int, boolean)>
	//* 165  351:ifeq            393
			if(c.l() == a)
	//* 166  354:aload_0         
	//* 167  355:getfield        #45  <Field bno c>
	//* 168  358:invokevirtual   #120 <Method int bno.l()>
	//* 169  361:getstatic       #31  <Field int a>
	//* 170  364:icmpne          383
			{
				f = c.f();
	//  171  367:aload_0         
	//  172  368:aload_0         
	//  173  369:getfield        #45  <Field bno c>
	//  174  372:invokevirtual   #96  <Method int bno.f()>
	//  175  375:putfield        #79  <Field int f>
				k = 1;
	//  176  378:iconst_1        
	//  177  379:istore_3        
			} else
	//* 178  380:goto            393
			{
				throw new IOException("Input not RawCC");
	//  179  383:new             #122 <Class IOException>
	//  180  386:dup             
	//  181  387:ldc1            #124 <String "Input not RawCC">
	//  182  389:invokespecial   #125 <Method void IOException(String)>
	//  183  392:athrow          
			}
		if(k != 0)
	//* 184  393:iload_3         
	//* 185  394:ifeq            405
			e = 1;
	//  186  397:aload_0         
	//  187  398:iconst_1        
	//  188  399:putfield        #47  <Field int e>
		else
	//* 189  402:goto            0
			return -1;
	//  190  405:iconst_m1       
	//  191  406:ireturn         
		if(true) goto _L16; else goto _L15
_L15:
	}

	public final void a(long l, long l1)
	{
		e = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #47  <Field int e>
	//    3    5:return          
	}

	public final void a(bfp bfp1)
	{
		bfp1.a(((bfu) (new bfv(0x1L))));
	//    0    0:aload_1         
	//    1    1:new             #129 <Class bfv>
	//    2    4:dup             
	//    3    5:ldc2w           #130 <Long 0x1L>
	//    4    8:invokespecial   #134 <Method void bfv(long)>
	//    5   11:invokeinterface #139 <Method void bfp.a(bfu)>
		d = bfp1.a(0, 3);
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:iconst_0        
	//    9   19:iconst_3        
	//   10   20:invokeinterface #142 <Method bfw bfp.a(int, int)>
	//   11   25:putfield        #65  <Field bfw d>
		bfp1.a();
	//   12   28:aload_1         
	//   13   29:invokeinterface #143 <Method void bfp.a()>
		d.a(b);
	//   14   34:aload_0         
	//   15   35:getfield        #65  <Field bfw d>
	//   16   38:aload_0         
	//   17   39:getfield        #38  <Field zzfs b>
	//   18   42:invokeinterface #145 <Method void bfw.a(zzfs)>
	//   19   47:return          
	}

	public final boolean a(bfo bfo1)
	{
		c.a();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field bno c>
	//    2    4:invokevirtual   #55  <Method void bno.a()>
		bfo1.c(c.a, 0, 8);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #45  <Field bno c>
	//    6   12:getfield        #58  <Field byte[] bno.a>
	//    7   15:iconst_0        
	//    8   16:bipush          8
	//    9   18:invokeinterface #148 <Method void bfo.c(byte[], int, int)>
		return c.l() == a;
	//   10   23:aload_0         
	//   11   24:getfield        #45  <Field bno c>
	//   12   27:invokevirtual   #120 <Method int bno.l()>
	//   13   30:getstatic       #31  <Field int a>
	//   14   33:icmpne          38
	//   15   36:iconst_1        
	//   16   37:ireturn         
	//   17   38:iconst_0        
	//   18   39:ireturn         
	}

	public final void c()
	{
	//    0    0:return          
	}

	private static final int a = bnw.f("RCC\001");
	private final zzfs b;
	private final bno c = new bno(9);
	private bfw d;
	private int e;
	private int f;
	private long g;
	private int h;
	private int i;

	static 
	{
	//    0    0:ldc1            #24  <String "RCC\001">
	//    1    2:invokestatic    #29  <Method int bnw.f(String)>
	//    2    5:putstatic       #31  <Field int a>
	//*   3    8:return          
	}
}
