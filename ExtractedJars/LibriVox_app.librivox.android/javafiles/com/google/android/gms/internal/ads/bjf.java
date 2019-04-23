// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bfw, bmj, bjd, bje, 
//			bno, bjg, bmi, bex, 
//			bfc, bey, bfx, bdg, 
//			bfo, zzfs, bjh

public final class bjf
	implements bfw
{

	public bjf(bmj bmj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		a = bmj1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field bmj a>
		b = bmj1.c();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #44  <Method int bmj.c()>
	//    8   16:putfield        #46  <Field int b>
	//    9   19:aload_0         
	//   10   20:new             #48  <Class bjd>
	//   11   23:dup             
	//   12   24:invokespecial   #49  <Method void bjd()>
	//   13   27:putfield        #51  <Field bjd c>
	//   14   30:aload_0         
	//   15   31:new             #53  <Class bje>
	//   16   34:dup             
	//   17   35:invokespecial   #54  <Method void bje()>
	//   18   38:putfield        #56  <Field bje d>
	//   19   41:aload_0         
	//   20   42:new             #58  <Class bno>
	//   21   45:dup             
	//   22   46:bipush          32
	//   23   48:invokespecial   #61  <Method void bno(int)>
	//   24   51:putfield        #63  <Field bno e>
	//   25   54:aload_0         
	//   26   55:new             #65  <Class AtomicInteger>
	//   27   58:dup             
	//   28   59:invokespecial   #66  <Method void AtomicInteger()>
	//   29   62:putfield        #68  <Field AtomicInteger f>
		int i1 = b;
	//   30   65:aload_0         
	//   31   66:getfield        #46  <Field int b>
	//   32   69:istore_2        
		n = i1;
	//   33   70:aload_0         
	//   34   71:iload_2         
	//   35   72:putfield        #70  <Field int n>
		g = new bjg(0L, i1);
	//   36   75:aload_0         
	//   37   76:new             #72  <Class bjg>
	//   38   79:dup             
	//   39   80:lconst_0        
	//   40   81:iload_2         
	//   41   82:invokespecial   #75  <Method void bjg(long, int)>
	//   42   85:putfield        #77  <Field bjg g>
		h = g;
	//   43   88:aload_0         
	//   44   89:aload_0         
	//   45   90:getfield        #77  <Field bjg g>
	//   46   93:putfield        #79  <Field bjg h>
	//   47   96:return          
	}

	private final void a(long l1, byte abyte0[], int i1)
	{
		b(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #84  <Method void b(long)>
		int j1 = 0;
	//    3    5:iconst_0        
	//    4    6:istore          5
		do
		{
			if(j1 >= i1)
				break;
	//    5    8:iload           5
	//    6   10:iload           4
	//    7   12:icmpge          139
			int k1 = (int)(l1 - g.a);
	//    8   15:lload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #77  <Field bjg g>
	//   11   20:getfield        #86  <Field long bjg.a>
	//   12   23:lsub            
	//   13   24:l2i             
	//   14   25:istore          6
			int i2 = Math.min(i1 - j1, b - k1);
	//   15   27:iload           4
	//   16   29:iload           5
	//   17   31:isub            
	//   18   32:aload_0         
	//   19   33:getfield        #46  <Field int b>
	//   20   36:iload           6
	//   21   38:isub            
	//   22   39:invokestatic    #92  <Method int Math.min(int, int)>
	//   23   42:istore          7
			bmi bmi1 = g.d;
	//   24   44:aload_0         
	//   25   45:getfield        #77  <Field bjg g>
	//   26   48:getfield        #95  <Field bmi bjg.d>
	//   27   51:astore          10
			System.arraycopy(((Object) (bmi1.a)), bmi1.a(k1), ((Object) (abyte0)), j1, i2);
	//   28   53:aload           10
	//   29   55:getfield        #100 <Field byte[] bmi.a>
	//   30   58:aload           10
	//   31   60:iload           6
	//   32   62:invokevirtual   #103 <Method int bmi.a(int)>
	//   33   65:aload_3         
	//   34   66:iload           5
	//   35   68:iload           7
	//   36   70:invokestatic    #109 <Method void System.arraycopy(Object, int, Object, int, int)>
			long l2 = l1 + (long)i2;
	//   37   73:lload_1         
	//   38   74:iload           7
	//   39   76:i2l             
	//   40   77:ladd            
	//   41   78:lstore          8
			k1 = j1 + i2;
	//   42   80:iload           5
	//   43   82:iload           7
	//   44   84:iadd            
	//   45   85:istore          6
			j1 = k1;
	//   46   87:iload           6
	//   47   89:istore          5
			l1 = l2;
	//   48   91:lload           8
	//   49   93:lstore_1        
			if(l2 == g.b)
	//*  50   94:lload           8
	//*  51   96:aload_0         
	//*  52   97:getfield        #77  <Field bjg g>
	//*  53  100:getfield        #111 <Field long bjg.b>
	//*  54  103:lcmp            
	//*  55  104:ifne            8
			{
				a.a(bmi1);
	//   56  107:aload_0         
	//   57  108:getfield        #39  <Field bmj a>
	//   58  111:aload           10
	//   59  113:invokeinterface #114 <Method void bmj.a(bmi)>
				g = g.a();
	//   60  118:aload_0         
	//   61  119:aload_0         
	//   62  120:getfield        #77  <Field bjg g>
	//   63  123:invokevirtual   #117 <Method bjg bjg.a()>
	//   64  126:putfield        #77  <Field bjg g>
				j1 = k1;
	//   65  129:iload           6
	//   66  131:istore          5
				l1 = l2;
	//   67  133:lload           8
	//   68  135:lstore_1        
			}
		} while(true);
	//   69  136:goto            8
	//   70  139:return          
	}

	private final void a(bjg bjg1)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #120 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #122 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #127 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	private final int b(int i1)
	{
		if(n == b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field int n>
	//*   2    4:aload_0         
	//*   3    5:getfield        #46  <Field int b>
	//*   4    8:icmpne          88
		{
			n = 0;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #70  <Field int n>
			if(h.c)
	//*   8   16:aload_0         
	//*   9   17:getfield        #79  <Field bjg h>
	//*  10   20:getfield        #129 <Field boolean bjg.c>
	//*  11   23:ifeq            37
				h = h.e;
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #79  <Field bjg h>
	//   15   31:getfield        #131 <Field bjg bjg.e>
	//   16   34:putfield        #79  <Field bjg h>
			bjg bjg1 = h;
	//   17   37:aload_0         
	//   18   38:getfield        #79  <Field bjg h>
	//   19   41:astore_2        
			bmi bmi1 = a.a();
	//   20   42:aload_0         
	//   21   43:getfield        #39  <Field bmj a>
	//   22   46:invokeinterface #134 <Method bmi bmj.a()>
	//   23   51:astore_3        
			bjg bjg2 = new bjg(h.b, b);
	//   24   52:new             #72  <Class bjg>
	//   25   55:dup             
	//   26   56:aload_0         
	//   27   57:getfield        #79  <Field bjg h>
	//   28   60:getfield        #111 <Field long bjg.b>
	//   29   63:aload_0         
	//   30   64:getfield        #46  <Field int b>
	//   31   67:invokespecial   #75  <Method void bjg(long, int)>
	//   32   70:astore          4
			bjg1.d = bmi1;
	//   33   72:aload_2         
	//   34   73:aload_3         
	//   35   74:putfield        #95  <Field bmi bjg.d>
			bjg1.e = bjg2;
	//   36   77:aload_2         
	//   37   78:aload           4
	//   38   80:putfield        #131 <Field bjg bjg.e>
			bjg1.c = true;
	//   39   83:aload_2         
	//   40   84:iconst_1        
	//   41   85:putfield        #129 <Field boolean bjg.c>
		}
		return Math.min(i1, b - n);
	//   42   88:iload_1         
	//   43   89:aload_0         
	//   44   90:getfield        #46  <Field int b>
	//   45   93:aload_0         
	//   46   94:getfield        #70  <Field int n>
	//   47   97:isub            
	//   48   98:invokestatic    #92  <Method int Math.min(int, int)>
	//   49  101:ireturn         
	}

	private final void b(long l1)
	{
		for(; l1 >= g.b; g = g.a())
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #77  <Field bjg g>
	//*   3    5:getfield        #111 <Field long bjg.b>
	//*   4    8:lcmp            
	//*   5    9:iflt            42
			a.a(g.d);
	//    6   12:aload_0         
	//    7   13:getfield        #39  <Field bmj a>
	//    8   16:aload_0         
	//    9   17:getfield        #77  <Field bjg g>
	//   10   20:getfield        #95  <Field bmi bjg.d>
	//   11   23:invokeinterface #114 <Method void bmj.a(bmi)>

	//   12   28:aload_0         
	//   13   29:aload_0         
	//   14   30:getfield        #77  <Field bjg g>
	//   15   33:invokevirtual   #117 <Method bjg bjg.a()>
	//   16   36:putfield        #77  <Field bjg g>
	//*  17   39:goto            0
	//   18   42:return          
	}

	private final boolean h()
	{
		return f.compareAndSet(0, 1);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field AtomicInteger f>
	//    2    4:iconst_0        
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #139 <Method boolean AtomicInteger.compareAndSet(int, int)>
	//    5    9:ireturn         
	}

	private final void i()
	{
		if(!f.compareAndSet(1, 0))
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field AtomicInteger f>
	//*   2    4:iconst_1        
	//*   3    5:iconst_0        
	//*   4    6:invokevirtual   #139 <Method boolean AtomicInteger.compareAndSet(int, int)>
	//*   5    9:ifne            16
			j();
	//    6   12:aload_0         
	//    7   13:invokespecial   #141 <Method void j()>
	//    8   16:return          
	}

	private final void j()
	{
		c.a();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field bjd c>
	//    2    4:invokevirtual   #143 <Method void bjd.a()>
		a(g);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #77  <Field bjg g>
	//    6   12:invokespecial   #145 <Method void a(bjg)>
		g = new bjg(0L, b);
	//    7   15:aload_0         
	//    8   16:new             #72  <Class bjg>
	//    9   19:dup             
	//   10   20:lconst_0        
	//   11   21:aload_0         
	//   12   22:getfield        #46  <Field int b>
	//   13   25:invokespecial   #75  <Method void bjg(long, int)>
	//   14   28:putfield        #77  <Field bjg g>
		h = g;
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #77  <Field bjg g>
	//   18   36:putfield        #79  <Field bjg h>
		m = 0L;
	//   19   39:aload_0         
	//   20   40:lconst_0        
	//   21   41:putfield        #147 <Field long m>
		n = b;
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:getfield        #46  <Field int b>
	//   25   49:putfield        #70  <Field int n>
		a.b();
	//   26   52:aload_0         
	//   27   53:getfield        #39  <Field bmj a>
	//   28   56:invokeinterface #149 <Method void bmj.b()>
	//   29   61:return          
	}

	public final int a()
	{
		return c.c();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field bjd c>
	//    2    4:invokevirtual   #150 <Method int bjd.c()>
	//    3    7:ireturn         
	}

	public final int a(bdg bdg1, bfc bfc1, boolean flag, boolean flag1, long l1)
	{
		switch(c.a(bdg1, bfc1, flag, flag1, i, d))
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field bjd c>
	//*   2    4:aload_1         
	//*   3    5:aload_2         
	//*   4    6:iload_3         
	//*   5    7:iload           4
	//*   6    9:aload_0         
	//*   7   10:getfield        #153 <Field zzfs i>
	//*   8   13:aload_0         
	//*   9   14:getfield        #56  <Field bje d>
	//*  10   17:invokevirtual   #156 <Method int bjd.a(bdg, bfc, boolean, boolean, zzfs, bje)>
		{
	//*  11   20:tableswitch     -5 -3: default 48
	//	               -5 704
	//	               -4 59
	//	               -3 56
		default:
			throw new IllegalStateException();
	//   12   48:new             #158 <Class IllegalStateException>
	//   13   51:dup             
	//   14   52:invokespecial   #159 <Method void IllegalStateException()>
	//   15   55:athrow          

		case -3: 
			return -3;
	//   16   56:bipush          -3
	//   17   58:ireturn         

		case -4: 
			if(!((bex) (bfc1)).c())
	//*  18   59:aload_2         
	//*  19   60:invokevirtual   #163 <Method boolean bex.c()>
	//*  20   63:ifne            701
			{
				if(bfc1.c < l1)
	//*  21   66:aload_2         
	//*  22   67:getfield        #167 <Field long bfc.c>
	//*  23   70:lload           5
	//*  24   72:lcmp            
	//*  25   73:ifge            82
					((bex) (bfc1)).b(0x80000000);
	//   26   76:aload_2         
	//   27   77:ldc1            #168 <Int 0x80000000>
	//   28   79:invokevirtual   #170 <Method void bex.b(int)>
				if(bfc1.e())
	//*  29   82:aload_2         
	//*  30   83:invokevirtual   #172 <Method boolean bfc.e()>
	//*  31   86:ifeq            525
				{
					bje bje1 = d;
	//   32   89:aload_0         
	//   33   90:getfield        #56  <Field bje d>
	//   34   93:astore          13
					l1 = bje1.b;
	//   35   95:aload           13
	//   36   97:getfield        #173 <Field long bje.b>
	//   37  100:lstore          5
					e.a(1);
	//   38  102:aload_0         
	//   39  103:getfield        #63  <Field bno e>
	//   40  106:iconst_1        
	//   41  107:invokevirtual   #175 <Method void bno.a(int)>
					a(l1, e.a, 1);
	//   42  110:aload_0         
	//   43  111:lload           5
	//   44  113:aload_0         
	//   45  114:getfield        #63  <Field bno e>
	//   46  117:getfield        #176 <Field byte[] bno.a>
	//   47  120:iconst_1        
	//   48  121:invokespecial   #178 <Method void a(long, byte[], int)>
					l1++;
	//   49  124:lload           5
	//   50  126:lconst_1        
	//   51  127:ladd            
	//   52  128:lstore          5
					bdg1 = ((bdg) (e.a));
	//   53  130:aload_0         
	//   54  131:getfield        #63  <Field bno e>
	//   55  134:getfield        #176 <Field byte[] bno.a>
	//   56  137:astore_1        
					boolean flag3 = false;
	//   57  138:iconst_0        
	//   58  139:istore          9
					int i2 = ((int) (bdg1[0]));
	//   59  141:aload_1         
	//   60  142:iconst_0        
	//   61  143:baload          
	//   62  144:istore          8
					boolean flag2;
					if((i2 & 0x80) != 0)
	//*  63  146:iload           8
	//*  64  148:sipush          128
	//*  65  151:iand            
	//*  66  152:ifeq            161
						flag2 = true;
	//   67  155:iconst_1        
	//   68  156:istore          7
					else
	//*  69  158:goto            164
						flag2 = false;
	//   70  161:iconst_0        
	//   71  162:istore          7
					i2 &= 0x7f;
	//   72  164:iload           8
	//   73  166:bipush          127
	//   74  168:iand            
	//   75  169:istore          8
					if(bfc1.a.a == null)
	//*  76  171:aload_2         
	//*  77  172:getfield        #181 <Field bey bfc.a>
	//*  78  175:getfield        #184 <Field byte[] bey.a>
	//*  79  178:ifnonnull       192
						bfc1.a.a = new byte[16];
	//   80  181:aload_2         
	//   81  182:getfield        #181 <Field bey bfc.a>
	//   82  185:bipush          16
	//   83  187:newarray        byte[]
	//   84  189:putfield        #184 <Field byte[] bey.a>
					a(l1, bfc1.a.a, i2);
	//   85  192:aload_0         
	//   86  193:lload           5
	//   87  195:aload_2         
	//   88  196:getfield        #181 <Field bey bfc.a>
	//   89  199:getfield        #184 <Field byte[] bey.a>
	//   90  202:iload           8
	//   91  204:invokespecial   #178 <Method void a(long, byte[], int)>
					l1 += i2;
	//   92  207:lload           5
	//   93  209:iload           8
	//   94  211:i2l             
	//   95  212:ladd            
	//   96  213:lstore          5
					if(flag2)
	//*  97  215:iload           7
	//*  98  217:ifeq            262
					{
						e.a(2);
	//   99  220:aload_0         
	//  100  221:getfield        #63  <Field bno e>
	//  101  224:iconst_2        
	//  102  225:invokevirtual   #175 <Method void bno.a(int)>
						a(l1, e.a, 2);
	//  103  228:aload_0         
	//  104  229:lload           5
	//  105  231:aload_0         
	//  106  232:getfield        #63  <Field bno e>
	//  107  235:getfield        #176 <Field byte[] bno.a>
	//  108  238:iconst_2        
	//  109  239:invokespecial   #178 <Method void a(long, byte[], int)>
						l1 += 2L;
	//  110  242:lload           5
	//  111  244:ldc2w           #185 <Long 2L>
	//  112  247:ladd            
	//  113  248:lstore          5
						i2 = e.g();
	//  114  250:aload_0         
	//  115  251:getfield        #63  <Field bno e>
	//  116  254:invokevirtual   #188 <Method int bno.g()>
	//  117  257:istore          8
					} else
	//* 118  259:goto            265
					{
						i2 = 1;
	//  119  262:iconst_1        
	//  120  263:istore          8
					}
					bdg1 = ((bdg) (bfc1.a.b));
	//  121  265:aload_2         
	//  122  266:getfield        #181 <Field bey bfc.a>
	//  123  269:getfield        #191 <Field int[] bey.b>
	//  124  272:astore_1        
					if(bdg1 == null || bdg1.length < i2)
	//* 125  273:aload_1         
	//* 126  274:ifnull          290
	//* 127  277:aload_1         
	//* 128  278:arraylength     
	//* 129  279:iload           8
	//* 130  281:icmpge          287
	//* 131  284:goto            290
	//* 132  287:goto            295
						bdg1 = ((bdg) (new int[i2]));
	//  133  290:iload           8
	//  134  292:newarray        int[]
	//  135  294:astore_1        
					int ai[] = bfc1.a.c;
	//  136  295:aload_2         
	//  137  296:getfield        #181 <Field bey bfc.a>
	//  138  299:getfield        #193 <Field int[] bey.c>
	//  139  302:astore          12
					if(ai == null || ai.length < i2)
	//* 140  304:aload           12
	//* 141  306:ifnull          323
	//* 142  309:aload           12
	//* 143  311:arraylength     
	//* 144  312:iload           8
	//* 145  314:icmpge          320
	//* 146  317:goto            323
	//* 147  320:goto            329
						ai = new int[i2];
	//  148  323:iload           8
	//  149  325:newarray        int[]
	//  150  327:astore          12
					if(flag2)
	//* 151  329:iload           7
	//* 152  331:ifeq            428
					{
						int i1 = i2 * 6;
	//  153  334:iload           8
	//  154  336:bipush          6
	//  155  338:imul            
	//  156  339:istore          7
						e.a(i1);
	//  157  341:aload_0         
	//  158  342:getfield        #63  <Field bno e>
	//  159  345:iload           7
	//  160  347:invokevirtual   #175 <Method void bno.a(int)>
						a(l1, e.a, i1);
	//  161  350:aload_0         
	//  162  351:lload           5
	//  163  353:aload_0         
	//  164  354:getfield        #63  <Field bno e>
	//  165  357:getfield        #176 <Field byte[] bno.a>
	//  166  360:iload           7
	//  167  362:invokespecial   #178 <Method void a(long, byte[], int)>
						long l2 = l1 + (long)i1;
	//  168  365:lload           5
	//  169  367:iload           7
	//  170  369:i2l             
	//  171  370:ladd            
	//  172  371:lstore          10
						e.c(0);
	//  173  373:aload_0         
	//  174  374:getfield        #63  <Field bno e>
	//  175  377:iconst_0        
	//  176  378:invokevirtual   #195 <Method void bno.c(int)>
						i1 = ((int) (flag3));
	//  177  381:iload           9
	//  178  383:istore          7
						do
						{
							l1 = l2;
	//  179  385:lload           10
	//  180  387:lstore          5
							if(i1 >= i2)
								break;
	//  181  389:iload           7
	//  182  391:iload           8
	//  183  393:icmpge          451
							bdg1[i1] = e.g();
	//  184  396:aload_1         
	//  185  397:iload           7
	//  186  399:aload_0         
	//  187  400:getfield        #63  <Field bno e>
	//  188  403:invokevirtual   #188 <Method int bno.g()>
	//  189  406:iastore         
							ai[i1] = e.o();
	//  190  407:aload           12
	//  191  409:iload           7
	//  192  411:aload_0         
	//  193  412:getfield        #63  <Field bno e>
	//  194  415:invokevirtual   #197 <Method int bno.o()>
	//  195  418:iastore         
							i1++;
	//  196  419:iload           7
	//  197  421:iconst_1        
	//  198  422:iadd            
	//  199  423:istore          7
						} while(true);
	//  200  425:goto            385
					} else
					{
						bdg1[0] = 0;
	//  201  428:aload_1         
	//  202  429:iconst_0        
	//  203  430:iconst_0        
	//  204  431:iastore         
						ai[0] = bje1.a - (int)(l1 - bje1.b);
	//  205  432:aload           12
	//  206  434:iconst_0        
	//  207  435:aload           13
	//  208  437:getfield        #199 <Field int bje.a>
	//  209  440:lload           5
	//  210  442:aload           13
	//  211  444:getfield        #173 <Field long bje.b>
	//  212  447:lsub            
	//  213  448:l2i             
	//  214  449:isub            
	//  215  450:iastore         
					}
					bfx bfx1 = bje1.d;
	//  216  451:aload           13
	//  217  453:getfield        #202 <Field bfx bje.d>
	//  218  456:astore          14
					bfc1.a.a(i2, ((int []) (bdg1)), ai, bfx1.b, bfc1.a.a, bfx1.a);
	//  219  458:aload_2         
	//  220  459:getfield        #181 <Field bey bfc.a>
	//  221  462:iload           8
	//  222  464:aload_1         
	//  223  465:aload           12
	//  224  467:aload           14
	//  225  469:getfield        #206 <Field byte[] bfx.b>
	//  226  472:aload_2         
	//  227  473:getfield        #181 <Field bey bfc.a>
	//  228  476:getfield        #184 <Field byte[] bey.a>
	//  229  479:aload           14
	//  230  481:getfield        #207 <Field int bfx.a>
	//  231  484:invokevirtual   #210 <Method void bey.a(int, int[], int[], byte[], byte[], int)>
					int j1 = (int)(l1 - bje1.b);
	//  232  487:lload           5
	//  233  489:aload           13
	//  234  491:getfield        #173 <Field long bje.b>
	//  235  494:lsub            
	//  236  495:l2i             
	//  237  496:istore          7
					bje1.b = bje1.b + (long)j1;
	//  238  498:aload           13
	//  239  500:aload           13
	//  240  502:getfield        #173 <Field long bje.b>
	//  241  505:iload           7
	//  242  507:i2l             
	//  243  508:ladd            
	//  244  509:putfield        #173 <Field long bje.b>
					bje1.a = bje1.a - j1;
	//  245  512:aload           13
	//  246  514:aload           13
	//  247  516:getfield        #199 <Field int bje.a>
	//  248  519:iload           7
	//  249  521:isub            
	//  250  522:putfield        #199 <Field int bje.a>
				}
				bfc1.d(d.a);
	//  251  525:aload_2         
	//  252  526:aload_0         
	//  253  527:getfield        #56  <Field bje d>
	//  254  530:getfield        #199 <Field int bje.a>
	//  255  533:invokevirtual   #212 <Method void bfc.d(int)>
				l1 = d.b;
	//  256  536:aload_0         
	//  257  537:getfield        #56  <Field bje d>
	//  258  540:getfield        #173 <Field long bje.b>
	//  259  543:lstore          5
				bdg1 = ((bdg) (bfc1.b));
	//  260  545:aload_2         
	//  261  546:getfield        #215 <Field ByteBuffer bfc.b>
	//  262  549:astore_1        
				int k1 = d.a;
	//  263  550:aload_0         
	//  264  551:getfield        #56  <Field bje d>
	//  265  554:getfield        #199 <Field int bje.a>
	//  266  557:istore          7
				b(l1);
	//  267  559:aload_0         
	//  268  560:lload           5
	//  269  562:invokespecial   #84  <Method void b(long)>
				do
				{
					if(k1 <= 0)
						break;
	//  270  565:iload           7
	//  271  567:ifle            690
					int j2 = (int)(l1 - g.a);
	//  272  570:lload           5
	//  273  572:aload_0         
	//  274  573:getfield        #77  <Field bjg g>
	//  275  576:getfield        #86  <Field long bjg.a>
	//  276  579:lsub            
	//  277  580:l2i             
	//  278  581:istore          8
					int k2 = Math.min(k1, b - j2);
	//  279  583:iload           7
	//  280  585:aload_0         
	//  281  586:getfield        #46  <Field int b>
	//  282  589:iload           8
	//  283  591:isub            
	//  284  592:invokestatic    #92  <Method int Math.min(int, int)>
	//  285  595:istore          9
					bfc1 = ((bfc) (g.d));
	//  286  597:aload_0         
	//  287  598:getfield        #77  <Field bjg g>
	//  288  601:getfield        #95  <Field bmi bjg.d>
	//  289  604:astore_2        
					((ByteBuffer) (bdg1)).put(((bmi) (bfc1)).a, ((bmi) (bfc1)).a(j2), k2);
	//  290  605:aload_1         
	//  291  606:aload_2         
	//  292  607:getfield        #100 <Field byte[] bmi.a>
	//  293  610:aload_2         
	//  294  611:iload           8
	//  295  613:invokevirtual   #103 <Method int bmi.a(int)>
	//  296  616:iload           9
	//  297  618:invokevirtual   #221 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//  298  621:pop             
					long l3 = l1 + (long)k2;
	//  299  622:lload           5
	//  300  624:iload           9
	//  301  626:i2l             
	//  302  627:ladd            
	//  303  628:lstore          10
					j2 = k1 - k2;
	//  304  630:iload           7
	//  305  632:iload           9
	//  306  634:isub            
	//  307  635:istore          8
					k1 = j2;
	//  308  637:iload           8
	//  309  639:istore          7
					l1 = l3;
	//  310  641:lload           10
	//  311  643:lstore          5
					if(l3 == g.b)
	//* 312  645:lload           10
	//* 313  647:aload_0         
	//* 314  648:getfield        #77  <Field bjg g>
	//* 315  651:getfield        #111 <Field long bjg.b>
	//* 316  654:lcmp            
	//* 317  655:ifne            565
					{
						a.a(((bmi) (bfc1)));
	//  318  658:aload_0         
	//  319  659:getfield        #39  <Field bmj a>
	//  320  662:aload_2         
	//  321  663:invokeinterface #114 <Method void bmj.a(bmi)>
						g = g.a();
	//  322  668:aload_0         
	//  323  669:aload_0         
	//  324  670:getfield        #77  <Field bjg g>
	//  325  673:invokevirtual   #117 <Method bjg bjg.a()>
	//  326  676:putfield        #77  <Field bjg g>
						k1 = j2;
	//  327  679:iload           8
	//  328  681:istore          7
						l1 = l3;
	//  329  683:lload           10
	//  330  685:lstore          5
					}
				} while(true);
	//  331  687:goto            565
				b(d.c);
	//  332  690:aload_0         
	//  333  691:aload_0         
	//  334  692:getfield        #56  <Field bje d>
	//  335  695:getfield        #222 <Field long bje.c>
	//  336  698:invokespecial   #84  <Method void b(long)>
			}
			return -4;
	//  337  701:bipush          -4
	//  338  703:ireturn         

		case -5: 
			i = bdg1.a;
	//  339  704:aload_0         
	//  340  705:aload_1         
	//  341  706:getfield        #226 <Field zzfs bdg.a>
	//  342  709:putfield        #153 <Field zzfs i>
			return -5;
	//  343  712:bipush          -5
	//  344  714:ireturn         
		}
	}

	public final int a(bfo bfo1, int i1, boolean flag)
	{
		if(!h())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #229 <Method boolean h()>
	//*   2    4:ifne            36
		{
			i1 = bfo1.a(i1);
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #232 <Method int bfo.a(int)>
	//    6   14:istore_2        
			if(i1 == -1)
	//*   7   15:iload_2         
	//*   8   16:iconst_m1       
	//*   9   17:icmpne          34
			{
				if(flag)
	//*  10   20:iload_3         
	//*  11   21:ifeq            26
					return -1;
	//   12   24:iconst_m1       
	//   13   25:ireturn         
				else
					throw new EOFException();
	//   14   26:new             #234 <Class EOFException>
	//   15   29:dup             
	//   16   30:invokespecial   #235 <Method void EOFException()>
	//   17   33:athrow          
			} else
			{
				return i1;
	//   18   34:iload_2         
	//   19   35:ireturn         
			}
		}
		i1 = b(i1);
	//   20   36:aload_0         
	//   21   37:iload_2         
	//   22   38:invokespecial   #237 <Method int b(int)>
	//   23   41:istore_2        
		bmi bmi1 = h.d;
	//   24   42:aload_0         
	//   25   43:getfield        #79  <Field bjg h>
	//   26   46:getfield        #95  <Field bmi bjg.d>
	//   27   49:astore          4
		i1 = bfo1.a(bmi1.a, bmi1.a(n), i1);
	//   28   51:aload_1         
	//   29   52:aload           4
	//   30   54:getfield        #100 <Field byte[] bmi.a>
	//   31   57:aload           4
	//   32   59:aload_0         
	//   33   60:getfield        #70  <Field int n>
	//   34   63:invokevirtual   #103 <Method int bmi.a(int)>
	//   35   66:iload_2         
	//   36   67:invokeinterface #240 <Method int bfo.a(byte[], int, int)>
	//   37   72:istore_2        
		if(i1 != -1)
			break MISSING_BLOCK_LABEL_96;
	//   38   73:iload_2         
	//   39   74:iconst_m1       
	//   40   75:icmpne          96
		if(flag)
	//*  41   78:iload_3         
	//*  42   79:ifeq            88
		{
			i();
	//   43   82:aload_0         
	//   44   83:invokespecial   #242 <Method void i()>
			return -1;
	//   45   86:iconst_m1       
	//   46   87:ireturn         
		}
		throw new EOFException();
	//   47   88:new             #234 <Class EOFException>
	//   48   91:dup             
	//   49   92:invokespecial   #235 <Method void EOFException()>
	//   50   95:athrow          
		n = n + i1;
	//   51   96:aload_0         
	//   52   97:aload_0         
	//   53   98:getfield        #70  <Field int n>
	//   54  101:iload_2         
	//   55  102:iadd            
	//   56  103:putfield        #70  <Field int n>
		m = m + (long)i1;
	//   57  106:aload_0         
	//   58  107:aload_0         
	//   59  108:getfield        #147 <Field long m>
	//   60  111:iload_2         
	//   61  112:i2l             
	//   62  113:ladd            
	//   63  114:putfield        #147 <Field long m>
		i();
	//   64  117:aload_0         
	//   65  118:invokespecial   #242 <Method void i()>
		return i1;
	//   66  121:iload_2         
	//   67  122:ireturn         
		bfo1;
	//   68  123:astore_1        
		i();
	//   69  124:aload_0         
	//   70  125:invokespecial   #242 <Method void i()>
		throw bfo1;
	//   71  128:aload_1         
	//   72  129:athrow          
	}

	public final void a(int i1)
	{
		m = c.a(i1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field bjd c>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #245 <Method long bjd.a(int)>
	//    5    9:putfield        #147 <Field long m>
		long l1 = m;
	//    6   12:aload_0         
	//    7   13:getfield        #147 <Field long m>
	//    8   16:lstore_2        
		if(l1 == g.a)
	//*   9   17:lload_2         
	//*  10   18:aload_0         
	//*  11   19:getfield        #77  <Field bjg g>
	//*  12   22:getfield        #86  <Field long bjg.a>
	//*  13   25:lcmp            
	//*  14   26:ifne            62
		{
			a(g);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #77  <Field bjg g>
	//   18   34:invokespecial   #145 <Method void a(bjg)>
			g = new bjg(l1, b);
	//   19   37:aload_0         
	//   20   38:new             #72  <Class bjg>
	//   21   41:dup             
	//   22   42:lload_2         
	//   23   43:aload_0         
	//   24   44:getfield        #46  <Field int b>
	//   25   47:invokespecial   #75  <Method void bjg(long, int)>
	//   26   50:putfield        #77  <Field bjg g>
			h = g;
	//   27   53:aload_0         
	//   28   54:aload_0         
	//   29   55:getfield        #77  <Field bjg g>
	//   30   58:putfield        #79  <Field bjg h>
			return;
	//   31   61:return          
		}
		bjg bjg2 = g;
	//   32   62:aload_0         
	//   33   63:getfield        #77  <Field bjg g>
	//   34   66:astore          5
		bjg bjg1;
		bjg bjg3;
		for(bjg1 = bjg2.e; l1 > bjg1.a; bjg1 = bjg3)
	//*  35   68:aload           5
	//*  36   70:getfield        #131 <Field bjg bjg.e>
	//*  37   73:astore          4
	//*  38   75:lload_2         
	//*  39   76:aload           4
	//*  40   78:getfield        #86  <Field long bjg.a>
	//*  41   81:lcmp            
	//*  42   82:ifle            103
		{
			bjg3 = bjg1.e;
	//   43   85:aload           4
	//   44   87:getfield        #131 <Field bjg bjg.e>
	//   45   90:astore          6
			bjg2 = bjg1;
	//   46   92:aload           4
	//   47   94:astore          5
		}

	//   48   96:aload           6
	//   49   98:astore          4
	//*  50  100:goto            75
		a(bjg1);
	//   51  103:aload_0         
	//   52  104:aload           4
	//   53  106:invokespecial   #145 <Method void a(bjg)>
		h = bjg2;
	//   54  109:aload_0         
	//   55  110:aload           5
	//   56  112:putfield        #79  <Field bjg h>
		bjg1 = h;
	//   57  115:aload_0         
	//   58  116:getfield        #79  <Field bjg h>
	//   59  119:astore          4
		bjg1.e = new bjg(bjg1.b, b);
	//   60  121:aload           4
	//   61  123:new             #72  <Class bjg>
	//   62  126:dup             
	//   63  127:aload           4
	//   64  129:getfield        #111 <Field long bjg.b>
	//   65  132:aload_0         
	//   66  133:getfield        #46  <Field int b>
	//   67  136:invokespecial   #75  <Method void bjg(long, int)>
	//   68  139:putfield        #131 <Field bjg bjg.e>
		n = (int)(l1 - h.a);
	//   69  142:aload_0         
	//   70  143:lload_2         
	//   71  144:aload_0         
	//   72  145:getfield        #79  <Field bjg h>
	//   73  148:getfield        #86  <Field long bjg.a>
	//   74  151:lsub            
	//   75  152:l2i             
	//   76  153:putfield        #70  <Field int n>
	//   77  156:return          
	}

	public final void a(long l1)
	{
		if(l != l1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field long l>
	//*   2    4:lload_1         
	//*   3    5:lcmp            
	//*   4    6:ifeq            19
		{
			l = l1;
	//    5    9:aload_0         
	//    6   10:lload_1         
	//    7   11:putfield        #247 <Field long l>
			j = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #249 <Field boolean j>
		}
	//   11   19:return          
	}

	public final void a(long l1, int i1, int j1, int k1, bfx bfx1)
	{
		if(j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #249 <Field boolean j>
	//*   2    4:ifeq            15
			a(k);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #252 <Field zzfs k>
	//    6   12:invokevirtual   #255 <Method void a(zzfs)>
		if(!h())
	//*   7   15:aload_0         
	//*   8   16:invokespecial   #229 <Method boolean h()>
	//*   9   19:ifne            31
		{
			c.a(l1);
	//   10   22:aload_0         
	//   11   23:getfield        #51  <Field bjd c>
	//   12   26:lload_1         
	//   13   27:invokevirtual   #257 <Method void bjd.a(long)>
			return;
	//   14   30:return          
		}
		long l2;
		long l3;
		l2 = l;
	//   15   31:aload_0         
	//   16   32:getfield        #247 <Field long l>
	//   17   35:lstore          7
		l3 = m;
	//   18   37:aload_0         
	//   19   38:getfield        #147 <Field long m>
	//   20   41:lstore          9
		long l4;
		long l5;
		l4 = j1;
	//   21   43:iload           4
	//   22   45:i2l             
	//   23   46:lstore          11
		l5 = k1;
	//   24   48:iload           5
	//   25   50:i2l             
	//   26   51:lstore          13
		c.a(l1 + l2, i1, l3 - l4 - l5, j1, bfx1);
	//   27   53:aload_0         
	//   28   54:getfield        #51  <Field bjd c>
	//   29   57:lload_1         
	//   30   58:lload           7
	//   31   60:ladd            
	//   32   61:iload_3         
	//   33   62:lload           9
	//   34   64:lload           11
	//   35   66:lsub            
	//   36   67:lload           13
	//   37   69:lsub            
	//   38   70:iload           4
	//   39   72:aload           6
	//   40   74:invokevirtual   #260 <Method void bjd.a(long, int, long, int, bfx)>
		i();
	//   41   77:aload_0         
	//   42   78:invokespecial   #242 <Method void i()>
		return;
	//   43   81:return          
		bfx1;
	//   44   82:astore          6
		i();
	//   45   84:aload_0         
	//   46   85:invokespecial   #242 <Method void i()>
		throw bfx1;
	//   47   88:aload           6
	//   48   90:athrow          
	}

	public final void a(bjh bjh1)
	{
		o = bjh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #263 <Field bjh o>
	//    3    5:return          
	}

	public final void a(bno bno1, int i1)
	{
		int j1 = i1;
	//    0    0:iload_2         
	//    1    1:istore_3        
		if(!h())
	//*   2    2:aload_0         
	//*   3    3:invokespecial   #229 <Method boolean h()>
	//*   4    6:ifne            15
		{
			bno1.d(i1);
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokevirtual   #265 <Method void bno.d(int)>
			return;
	//    8   14:return          
		}
		for(; j1 > 0; j1 -= i1)
	//*   9   15:iload_3         
	//*  10   16:ifle            81
		{
			i1 = b(j1);
	//   11   19:aload_0         
	//   12   20:iload_3         
	//   13   21:invokespecial   #237 <Method int b(int)>
	//   14   24:istore_2        
			bmi bmi1 = h.d;
	//   15   25:aload_0         
	//   16   26:getfield        #79  <Field bjg h>
	//   17   29:getfield        #95  <Field bmi bjg.d>
	//   18   32:astore          4
			bno1.a(bmi1.a, bmi1.a(n), i1);
	//   19   34:aload_1         
	//   20   35:aload           4
	//   21   37:getfield        #100 <Field byte[] bmi.a>
	//   22   40:aload           4
	//   23   42:aload_0         
	//   24   43:getfield        #70  <Field int n>
	//   25   46:invokevirtual   #103 <Method int bmi.a(int)>
	//   26   49:iload_2         
	//   27   50:invokevirtual   #268 <Method void bno.a(byte[], int, int)>
			n = n + i1;
	//   28   53:aload_0         
	//   29   54:aload_0         
	//   30   55:getfield        #70  <Field int n>
	//   31   58:iload_2         
	//   32   59:iadd            
	//   33   60:putfield        #70  <Field int n>
			m = m + (long)i1;
	//   34   63:aload_0         
	//   35   64:aload_0         
	//   36   65:getfield        #147 <Field long m>
	//   37   68:iload_2         
	//   38   69:i2l             
	//   39   70:ladd            
	//   40   71:putfield        #147 <Field long m>
		}

	//   41   74:iload_3         
	//   42   75:iload_2         
	//   43   76:isub            
	//   44   77:istore_3        
	//*  45   78:goto            15
		i();
	//   46   81:aload_0         
	//   47   82:invokespecial   #242 <Method void i()>
	//   48   85:return          
	}

	public final void a(zzfs zzfs1)
	{
		long l1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field long l>
	//    2    4:lstore_2        
		zzfs zzfs2;
		if(zzfs1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       15
			zzfs2 = null;
	//    5    9:aconst_null     
	//    6   10:astore          5
		else
	//*   7   12:goto            50
		if(l1 != 0L && zzfs1.q != 0xffffffffL)
	//*   8   15:lload_2         
	//*   9   16:lconst_0        
	//*  10   17:lcmp            
	//*  11   18:ifeq            47
	//*  12   21:aload_1         
	//*  13   22:getfield        #273 <Field long zzfs.q>
	//*  14   25:ldc2w           #274 <Long 0xffffffffL>
	//*  15   28:lcmp            
	//*  16   29:ifeq            47
			zzfs2 = zzfs1.a(zzfs1.q + l1);
	//   17   32:aload_1         
	//   18   33:aload_1         
	//   19   34:getfield        #273 <Field long zzfs.q>
	//   20   37:lload_2         
	//   21   38:ladd            
	//   22   39:invokevirtual   #278 <Method zzfs zzfs.a(long)>
	//   23   42:astore          5
		else
	//*  24   44:goto            50
			zzfs2 = zzfs1;
	//   25   47:aload_1         
	//   26   48:astore          5
		boolean flag = c.a(zzfs2);
	//   27   50:aload_0         
	//   28   51:getfield        #51  <Field bjd c>
	//   29   54:aload           5
	//   30   56:invokevirtual   #281 <Method boolean bjd.a(zzfs)>
	//   31   59:istore          4
		k = zzfs1;
	//   32   61:aload_0         
	//   33   62:aload_1         
	//   34   63:putfield        #252 <Field zzfs k>
		j = false;
	//   35   66:aload_0         
	//   36   67:iconst_0        
	//   37   68:putfield        #249 <Field boolean j>
		zzfs1 = ((zzfs) (o));
	//   38   71:aload_0         
	//   39   72:getfield        #263 <Field bjh o>
	//   40   75:astore_1        
		if(zzfs1 != null && flag)
	//*  41   76:aload_1         
	//*  42   77:ifnull          93
	//*  43   80:iload           4
	//*  44   82:ifeq            93
			((bjh) (zzfs1)).a(zzfs2);
	//   45   85:aload_1         
	//   46   86:aload           5
	//   47   88:invokeinterface #284 <Method void bjh.a(zzfs)>
	//   48   93:return          
	}

	public final void a(boolean flag)
	{
		AtomicInteger atomicinteger = f;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field AtomicInteger f>
	//    2    4:astore_3        
		int i1;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			i1 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			i1 = 2;
	//    8   14:iconst_2        
	//    9   15:istore_2        
		i1 = atomicinteger.getAndSet(i1);
	//   10   16:aload_3         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #288 <Method int AtomicInteger.getAndSet(int)>
	//   13   21:istore_2        
		j();
	//   14   22:aload_0         
	//   15   23:invokespecial   #141 <Method void j()>
		c.b();
	//   16   26:aload_0         
	//   17   27:getfield        #51  <Field bjd c>
	//   18   30:invokevirtual   #289 <Method void bjd.b()>
		if(i1 == 2)
	//*  19   33:iload_2         
	//*  20   34:iconst_2        
	//*  21   35:icmpne          43
			i = null;
	//   22   38:aload_0         
	//   23   39:aconst_null     
	//   24   40:putfield        #153 <Field zzfs i>
	//   25   43:return          
	}

	public final boolean a(long l1, boolean flag)
	{
		l1 = c.a(l1, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field bjd c>
	//    2    4:lload_1         
	//    3    5:iload_3         
	//    4    6:invokevirtual   #293 <Method long bjd.a(long, boolean)>
	//    5    9:lstore_1        
		if(l1 == -1L)
	//*   6   10:lload_1         
	//*   7   11:ldc2w           #294 <Long -1L>
	//*   8   14:lcmp            
	//*   9   15:ifne            20
		{
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		} else
		{
			b(l1);
	//   12   20:aload_0         
	//   13   21:lload_1         
	//   14   22:invokespecial   #84  <Method void b(long)>
			return true;
	//   15   25:iconst_1        
	//   16   26:ireturn         
		}
	}

	public final void b()
	{
		if(f.getAndSet(2) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field AtomicInteger f>
	//*   2    4:iconst_2        
	//*   3    5:invokevirtual   #288 <Method int AtomicInteger.getAndSet(int)>
	//*   4    8:ifne            15
			j();
	//    5   11:aload_0         
	//    6   12:invokespecial   #141 <Method void j()>
	//    7   15:return          
	}

	public final boolean c()
	{
		return c.e();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field bjd c>
	//    2    4:invokevirtual   #296 <Method boolean bjd.e()>
	//    3    7:ireturn         
	}

	public final int d()
	{
		return c.d();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field bjd c>
	//    2    4:invokevirtual   #298 <Method int bjd.d()>
	//    3    7:ireturn         
	}

	public final zzfs e()
	{
		return c.f();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field bjd c>
	//    2    4:invokevirtual   #301 <Method zzfs bjd.f()>
	//    3    7:areturn         
	}

	public final long f()
	{
		return c.g();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field bjd c>
	//    2    4:invokevirtual   #304 <Method long bjd.g()>
	//    3    7:lreturn         
	}

	public final void g()
	{
		long l1 = c.h();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field bjd c>
	//    2    4:invokevirtual   #306 <Method long bjd.h()>
	//    3    7:lstore_1        
		if(l1 != -1L)
	//*   4    8:lload_1         
	//*   5    9:ldc2w           #294 <Long -1L>
	//*   6   12:lcmp            
	//*   7   13:ifeq            21
			b(l1);
	//    8   16:aload_0         
	//    9   17:lload_1         
	//   10   18:invokespecial   #84  <Method void b(long)>
	//   11   21:return          
	}

	private final bmj a;
	private final int b;
	private final bjd c = new bjd();
	private final bje d = new bje();
	private final bno e = new bno(32);
	private final AtomicInteger f = new AtomicInteger();
	private bjg g;
	private bjg h;
	private zzfs i;
	private boolean j;
	private zzfs k;
	private long l;
	private long m;
	private int n;
	private bjh o;
}
