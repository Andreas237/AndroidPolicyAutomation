// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bdi, bmr, bme, bdl, 
//			bnw, bjo, bmj

public final class adw
	implements bdi
{

	adw()
	{
		this(15000, 30000, 2500L, 5000L);
	//    0    0:aload_0         
	//    1    1:sipush          15000
	//    2    4:sipush          30000
	//    3    7:ldc2w           #21  <Long 2500L>
	//    4   10:ldc2w           #23  <Long 5000L>
	//    5   13:invokespecial   #27  <Method void adw(int, int, long, long)>
	//    6   16:return          
	}

	private adw(int i, int j, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		a = new bmr(true, 0x10000);
	//    2    4:aload_0         
	//    3    5:new             #32  <Class bmr>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:ldc1            #33  <Int 0x10000>
	//    7   12:invokespecial   #36  <Method void bmr(boolean, int)>
	//    8   15:putfield        #38  <Field bmr a>
		b = 0xe4e1c0L;
	//    9   18:aload_0         
	//   10   19:ldc2w           #39  <Long 0xe4e1c0L>
	//   11   22:putfield        #42  <Field long b>
		c = 0x1c9c380L;
	//   12   25:aload_0         
	//   13   26:ldc2w           #43  <Long 0x1c9c380L>
	//   14   29:putfield        #46  <Field long c>
		d = 0x2625a0L;
	//   15   32:aload_0         
	//   16   33:ldc2w           #47  <Long 0x2625a0L>
	//   17   36:putfield        #50  <Field long d>
		e = 0x4c4b40L;
	//   18   39:aload_0         
	//   19   40:ldc2w           #51  <Long 0x4c4b40L>
	//   20   43:putfield        #54  <Field long e>
	//   21   46:return          
	}

	private final void a(boolean flag)
	{
		f = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #57  <Field int f>
		g = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #59  <Field boolean g>
		if(flag)
	//*   6   10:iload_1         
	//*   7   11:ifeq            21
			a.d();
	//    8   14:aload_0         
	//    9   15:getfield        #38  <Field bmr a>
	//   10   18:invokevirtual   #61  <Method void bmr.d()>
	//   11   21:return          
	}

	public final void a()
	{
		a(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #63  <Method void a(boolean)>
	//    3    5:return          
	}

	public final void a(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = i;
	//    2    2:iload_1         
	//    3    3:i2l             
	//    4    4:lstore_2        
		b = l * 1000L;
	//    5    5:aload_0         
	//    6    6:lload_2         
	//    7    7:ldc2w           #65  <Long 1000L>
	//    8   10:lmul            
	//    9   11:putfield        #42  <Field long b>
		this;
	//   10   14:aload_0         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		return;
	//   12   16:return          
		Exception exception;
		exception;
	//   13   17:astore          4
	//*  14   19:aload_0         
		throw exception;
	//   15   20:monitorexit     
	//   16   21:aload           4
	//   17   23:athrow          
	}

	public final void a(bdl abdl[], bjo bjo, bme bme1)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		f = 0;
	//    2    3:aload_0         
	//    3    4:iconst_0        
	//    4    5:putfield        #57  <Field int f>
		for(; i < abdl.length; i++)
	//*   5    8:iload           4
	//*   6   10:aload_1         
	//*   7   11:arraylength     
	//*   8   12:icmpge          54
			if(bme1.a(i) != null)
	//*   9   15:aload_3         
	//*  10   16:iload           4
	//*  11   18:invokevirtual   #72  <Method bmc bme.a(int)>
	//*  12   21:ifnull          45
				f = f + bnw.b(abdl[i].a());
	//   13   24:aload_0         
	//   14   25:aload_0         
	//   15   26:getfield        #57  <Field int f>
	//   16   29:aload_1         
	//   17   30:iload           4
	//   18   32:aaload          
	//   19   33:invokeinterface #77  <Method int bdl.a()>
	//   20   38:invokestatic    #82  <Method int bnw.b(int)>
	//   21   41:iadd            
	//   22   42:putfield        #57  <Field int f>

	//   23   45:iload           4
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:istore          4
	//*  27   51:goto            8
		a.a(f);
	//   28   54:aload_0         
	//   29   55:getfield        #38  <Field bmr a>
	//   30   58:aload_0         
	//   31   59:getfield        #57  <Field int f>
	//   32   62:invokevirtual   #84  <Method void bmr.a(int)>
	//   33   65:return          
	}

	public final boolean a(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l1 = c;
	//    2    2:aload_0         
	//    3    3:getfield        #46  <Field long c>
	//    4    6:lstore          5
		byte byte0;
		boolean flag2;
		flag2 = false;
	//    5    8:iconst_0        
	//    6    9:istore          8
		if(l > l1)
	//*   7   11:lload_1         
	//*   8   12:lload           5
	//*   9   14:lcmp            
	//*  10   15:ifle            23
		{
			byte0 = 0;
	//   11   18:iconst_0        
	//   12   19:istore_3        
			break MISSING_BLOCK_LABEL_37;
	//   13   20:goto            37
		}
		boolean flag;
		boolean flag1;
		Exception exception;
		if(l < b)
	//*  14   23:lload_1         
	//*  15   24:aload_0         
	//*  16   25:getfield        #42  <Field long b>
	//*  17   28:lcmp            
	//*  18   29:ifge            118
			byte0 = 2;
	//   19   32:iconst_2        
	//   20   33:istore_3        
		else
	//*  21   34:goto            37
	//*  22   37:aload_0         
	//*  23   38:getfield        #38  <Field bmr a>
	//*  24   41:invokevirtual   #87  <Method int bmr.e()>
	//*  25   44:aload_0         
	//*  26   45:getfield        #57  <Field int f>
	//*  27   48:icmplt          123
	//*  28   51:iconst_1        
	//*  29   52:istore          4
	//*  30   54:goto            57
	//*  31   57:iload_3         
	//*  32   58:iconst_2        
	//*  33   59:icmpeq          129
	//*  34   62:iload           8
	//*  35   64:istore          7
	//*  36   66:iload_3         
	//*  37   67:iconst_1        
	//*  38   68:icmpne          94
	//*  39   71:iload           8
	//*  40   73:istore          7
	//*  41   75:aload_0         
	//*  42   76:getfield        #59  <Field boolean g>
	//*  43   79:ifeq            94
	//*  44   82:iload           8
	//*  45   84:istore          7
	//*  46   86:iload           4
	//*  47   88:ifne            94
	//*  48   91:goto            129
	//*  49   94:aload_0         
	//*  50   95:iload           7
	//*  51   97:putfield        #59  <Field boolean g>
	//*  52  100:aload_0         
	//*  53  101:getfield        #59  <Field boolean g>
	//*  54  104:istore          7
	//*  55  106:aload_0         
	//*  56  107:monitorexit     
	//*  57  108:iload           7
	//*  58  110:ireturn         
	//*  59  111:astore          9
	//*  60  113:aload_0         
	//*  61  114:monitorexit     
	//*  62  115:aload           9
	//*  63  117:athrow          
			byte0 = 1;
	//   64  118:iconst_1        
	//   65  119:istore_3        
		if(a.e() >= f)
			flag = true;
		else
	//*  66  120:goto            37
			flag = false;
	//   67  123:iconst_0        
	//   68  124:istore          4
		if(byte0 == 2) goto _L2; else goto _L1
_L1:
		flag1 = flag2;
		if(byte0 != 1) goto _L4; else goto _L3
_L3:
		flag1 = flag2;
		if(!g) goto _L4; else goto _L5
_L5:
		flag1 = flag2;
		if(flag) goto _L4; else goto _L2
_L4:
		g = flag1;
		flag1 = g;
		this;
		JVM INSTR monitorexit ;
		return flag1;
		exception;
		throw exception;
	//*  69  126:goto            57
_L2:
		flag1 = true;
	//   70  129:iconst_1        
	//   71  130:istore          7
		if(true) goto _L4; else goto _L6
	//   72  132:goto            94
_L6:
	}

	public final boolean a(long l, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!flag)
			break MISSING_BLOCK_LABEL_15;
	//    2    2:iload_3         
	//    3    3:ifeq            15
		long l1;
		l1 = e;
	//    4    6:aload_0         
	//    5    7:getfield        #54  <Field long e>
	//    6   10:lstore          4
		break MISSING_BLOCK_LABEL_21;
	//    7   12:goto            21
		l1 = d;
	//    8   15:aload_0         
	//    9   16:getfield        #50  <Field long d>
	//   10   19:lstore          4
		if(l1 > 0L && l < l1)
	//*  11   21:lload           4
	//*  12   23:lconst_0        
	//*  13   24:lcmp            
	//*  14   25:ifle            44
	//*  15   28:lload_1         
	//*  16   29:lload           4
	//*  17   31:lcmp            
	//*  18   32:iflt            38
	//*  19   35:goto            44
			flag = false;
	//   20   38:iconst_0        
	//   21   39:istore_3        
		else
	//*  22   40:aload_0         
	//*  23   41:monitorexit     
	//*  24   42:iload_3         
	//*  25   43:ireturn         
			flag = true;
	//   26   44:iconst_1        
	//   27   45:istore_3        
		this;
		JVM INSTR monitorexit ;
		return flag;
	//*  28   46:goto            40
		Exception exception;
		exception;
	//   29   49:astore          6
	//*  30   51:aload_0         
		throw exception;
	//   31   52:monitorexit     
	//   32   53:aload           6
	//   33   55:athrow          
	}

	public final void b()
	{
		a(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #63  <Method void a(boolean)>
	//    3    5:return          
	}

	public final void b(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = i;
	//    2    2:iload_1         
	//    3    3:i2l             
	//    4    4:lstore_2        
		c = l * 1000L;
	//    5    5:aload_0         
	//    6    6:lload_2         
	//    7    7:ldc2w           #65  <Long 1000L>
	//    8   10:lmul            
	//    9   11:putfield        #46  <Field long c>
		this;
	//   10   14:aload_0         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		return;
	//   12   16:return          
		Exception exception;
		exception;
	//   13   17:astore          4
	//*  14   19:aload_0         
		throw exception;
	//   15   20:monitorexit     
	//   16   21:aload           4
	//   17   23:athrow          
	}

	public final void c()
	{
		a(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #63  <Method void a(boolean)>
	//    3    5:return          
	}

	public final void c(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = i;
	//    2    2:iload_1         
	//    3    3:i2l             
	//    4    4:lstore_2        
		d = l * 1000L;
	//    5    5:aload_0         
	//    6    6:lload_2         
	//    7    7:ldc2w           #65  <Long 1000L>
	//    8   10:lmul            
	//    9   11:putfield        #50  <Field long d>
		this;
	//   10   14:aload_0         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		return;
	//   12   16:return          
		Exception exception;
		exception;
	//   13   17:astore          4
	//*  14   19:aload_0         
		throw exception;
	//   15   20:monitorexit     
	//   16   21:aload           4
	//   17   23:athrow          
	}

	public final bmj d()
	{
		return ((bmj) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field bmr a>
	//    2    4:areturn         
	}

	public final void d(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = i;
	//    2    2:iload_1         
	//    3    3:i2l             
	//    4    4:lstore_2        
		e = l * 1000L;
	//    5    5:aload_0         
	//    6    6:lload_2         
	//    7    7:ldc2w           #65  <Long 1000L>
	//    8   10:lmul            
	//    9   11:putfield        #54  <Field long e>
		this;
	//   10   14:aload_0         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		return;
	//   12   16:return          
		Exception exception;
		exception;
	//   13   17:astore          4
	//*  14   19:aload_0         
		throw exception;
	//   15   20:monitorexit     
	//   16   21:aload           4
	//   17   23:athrow          
	}

	private final bmr a;
	private long b;
	private long c;
	private long d;
	private long e;
	private int f;
	private boolean g;
}
