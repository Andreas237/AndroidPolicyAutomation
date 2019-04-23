// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bmj, bnf, bmi, bnw

public final class bmr
	implements bmj
{

	public bmr(boolean flag, int i)
	{
		this(true, 0x10000, 0);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:ldc1            #21  <Int 0x10000>
	//    3    4:iconst_0        
	//    4    5:invokespecial   #24  <Method void bmr(boolean, int, int)>
	//    5    8:return          
	}

	private bmr(boolean flag, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		bnf.a(true);
	//    2    4:iconst_1        
	//    3    5:invokestatic    #33  <Method void bnf.a(boolean)>
		bnf.a(true);
	//    4    8:iconst_1        
	//    5    9:invokestatic    #33  <Method void bnf.a(boolean)>
		a = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #35  <Field boolean a>
		b = 0x10000;
	//    9   17:aload_0         
	//   10   18:ldc1            #21  <Int 0x10000>
	//   11   20:putfield        #37  <Field int b>
		g = 0;
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:putfield        #39  <Field int g>
		h = new bmi[100];
	//   15   28:aload_0         
	//   16   29:bipush          100
	//   17   31:anewarray       bmi[]
	//   18   34:putfield        #43  <Field bmi[] h>
		c = null;
	//   19   37:aload_0         
	//   20   38:aconst_null     
	//   21   39:putfield        #45  <Field byte[] c>
		d = new bmi[1];
	//   22   42:aload_0         
	//   23   43:iconst_1        
	//   24   44:anewarray       bmi[]
	//   25   47:putfield        #47  <Field bmi[] d>
	//   26   50:return          
	}

	public final bmi a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		bmi abmi[];
		f = f + 1;
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #50  <Field int f>
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #50  <Field int f>
		if(g <= 0)
			break MISSING_BLOCK_LABEL_53;
	//    8   12:aload_0         
	//    9   13:getfield        #39  <Field int g>
	//   10   16:ifle            53
		abmi = h;
	//   11   19:aload_0         
	//   12   20:getfield        #43  <Field bmi[] h>
	//   13   23:astore_2        
		i = g - 1;
	//   14   24:aload_0         
	//   15   25:getfield        #39  <Field int g>
	//   16   28:iconst_1        
	//   17   29:isub            
	//   18   30:istore_1        
		g = i;
	//   19   31:aload_0         
	//   20   32:iload_1         
	//   21   33:putfield        #39  <Field int g>
		bmi bmi1 = abmi[i];
	//   22   36:aload_2         
	//   23   37:iload_1         
	//   24   38:aaload          
	//   25   39:astore_2        
		h[g] = null;
	//   26   40:aload_0         
	//   27   41:getfield        #43  <Field bmi[] h>
	//   28   44:aload_0         
	//   29   45:getfield        #39  <Field int g>
	//   30   48:aconst_null     
	//   31   49:aastore         
		break MISSING_BLOCK_LABEL_68;
	//   32   50:goto            68
		bmi1 = new bmi(new byte[b], 0);
	//   33   53:new             #41  <Class bmi>
	//   34   56:dup             
	//   35   57:aload_0         
	//   36   58:getfield        #37  <Field int b>
	//   37   61:newarray        byte[]
	//   38   63:iconst_0        
	//   39   64:invokespecial   #53  <Method void bmi(byte[], int)>
	//   40   67:astore_2        
		this;
	//   41   68:aload_0         
		JVM INSTR monitorexit ;
	//   42   69:monitorexit     
		return bmi1;
	//   43   70:aload_2         
	//   44   71:areturn         
		Exception exception;
		exception;
	//   45   72:astore_2        
	//*  46   73:aload_0         
		throw exception;
	//   47   74:monitorexit     
	//   48   75:aload_2         
	//   49   76:athrow          
	}

	public final void a(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		Exception exception;
		if(i < e)
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #56  <Field int e>
	//*   5    7:icmpge          36
			flag = true;
	//    6   10:iconst_1        
	//    7   11:istore_2        
		else
	//*   8   12:goto            15
	//*   9   15:aload_0         
	//*  10   16:iload_1         
	//*  11   17:putfield        #56  <Field int e>
	//*  12   20:iload_2         
	//*  13   21:ifeq            28
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #58  <Method void b()>
	//*  16   28:aload_0         
	//*  17   29:monitorexit     
	//*  18   30:return          
	//*  19   31:astore_3        
	//*  20   32:aload_0         
	//*  21   33:monitorexit     
	//*  22   34:aload_3         
	//*  23   35:athrow          
			flag = false;
	//   24   36:iconst_0        
	//   25   37:istore_2        
		e = i;
		if(!flag)
			break MISSING_BLOCK_LABEL_28;
		b();
		this;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
	//*  26   38:goto            15
	}

	public final void a(bmi bmi1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		d[0] = bmi1;
	//    2    2:aload_0         
	//    3    3:getfield        #47  <Field bmi[] d>
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:aastore         
		a(d);
	//    7    9:aload_0         
	//    8   10:aload_0         
	//    9   11:getfield        #47  <Field bmi[] d>
	//   10   14:invokevirtual   #62  <Method void a(bmi[])>
		this;
	//   11   17:aload_0         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		bmi1;
	//   14   20:astore_1        
	//*  15   21:aload_0         
		throw bmi1;
	//   16   22:monitorexit     
	//   17   23:aload_1         
	//   18   24:athrow          
	}

	public final void a(bmi abmi[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j;
		if(g + abmi.length >= h.length)
	//*   2    2:aload_0         
	//*   3    3:getfield        #39  <Field int g>
	//*   4    6:aload_1         
	//*   5    7:arraylength     
	//*   6    8:iadd            
	//*   7    9:aload_0         
	//*   8   10:getfield        #43  <Field bmi[] h>
	//*   9   13:arraylength     
	//*  10   14:icmplt          48
			h = (bmi[])Arrays.copyOf(((Object []) (h)), Math.max(h.length << 1, g + abmi.length));
	//   11   17:aload_0         
	//   12   18:aload_0         
	//   13   19:getfield        #43  <Field bmi[] h>
	//   14   22:aload_0         
	//   15   23:getfield        #43  <Field bmi[] h>
	//   16   26:arraylength     
	//   17   27:iconst_1        
	//   18   28:ishl            
	//   19   29:aload_0         
	//   20   30:getfield        #39  <Field int g>
	//   21   33:aload_1         
	//   22   34:arraylength     
	//   23   35:iadd            
	//   24   36:invokestatic    #68  <Method int Math.max(int, int)>
	//   25   39:invokestatic    #74  <Method Object[] Arrays.copyOf(Object[], int)>
	//   26   42:checkcast       #75  <Class bmi[]>
	//   27   45:putfield        #43  <Field bmi[] h>
		j = abmi.length;
	//   28   48:aload_1         
	//   29   49:arraylength     
	//   30   50:istore_3        
		int i = 0;
	//   31   51:iconst_0        
	//   32   52:istore_2        
_L2:
		bmi bmi1;
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   33   53:iload_2         
	//   34   54:iload_3         
	//   35   55:icmpge          126
		bmi1 = abmi[i];
	//   36   58:aload_1         
	//   37   59:iload_2         
	//   38   60:aaload          
	//   39   61:astore          6
		int k;
		boolean flag;
		bmi abmi1[];
		if(bmi1.a != null && bmi1.a.length != b)
	//*  40   63:aload           6
	//*  41   65:getfield        #77  <Field byte[] bmi.a>
	//*  42   68:ifnull          155
	//*  43   71:aload           6
	//*  44   73:getfield        #77  <Field byte[] bmi.a>
	//*  45   76:arraylength     
	//*  46   77:aload_0         
	//*  47   78:getfield        #37  <Field int b>
	//*  48   81:icmpne          149
	//*  49   84:goto            155
	//*  50   87:iload           5
	//*  51   89:invokestatic    #33  <Method void bnf.a(boolean)>
	//*  52   92:aload_0         
	//*  53   93:getfield        #43  <Field bmi[] h>
	//*  54   96:astore          7
	//*  55   98:aload_0         
	//*  56   99:getfield        #39  <Field int g>
	//*  57  102:istore          4
	//*  58  104:aload_0         
	//*  59  105:iload           4
	//*  60  107:iconst_1        
	//*  61  108:iadd            
	//*  62  109:putfield        #39  <Field int g>
	//*  63  112:aload           7
	//*  64  114:iload           4
	//*  65  116:aload           6
	//*  66  118:aastore         
	//*  67  119:iload_2         
	//*  68  120:iconst_1        
	//*  69  121:iadd            
	//*  70  122:istore_2        
	//*  71  123:goto            53
	//*  72  126:aload_0         
	//*  73  127:aload_0         
	//*  74  128:getfield        #50  <Field int f>
	//*  75  131:aload_1         
	//*  76  132:arraylength     
	//*  77  133:isub            
	//*  78  134:putfield        #50  <Field int f>
	//*  79  137:aload_0         
	//*  80  138:invokevirtual   #80  <Method void Object.notifyAll()>
	//*  81  141:aload_0         
	//*  82  142:monitorexit     
	//*  83  143:return          
	//*  84  144:astore_1        
	//*  85  145:aload_0         
	//*  86  146:monitorexit     
	//*  87  147:aload_1         
	//*  88  148:athrow          
			flag = false;
	//   89  149:iconst_0        
	//   90  150:istore          5
		else
	//*  91  152:goto            87
			flag = true;
	//   92  155:iconst_1        
	//   93  156:istore          5
		bnf.a(flag);
		abmi1 = h;
		k = g;
		g = k + 1;
		abmi1[k] = bmi1;
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		f = f - abmi.length;
		((Object)this).notifyAll();
		this;
		JVM INSTR monitorexit ;
		return;
		abmi;
		throw abmi;
	//*  94  158:goto            87
	}

	public final void b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		int j;
		i = Math.max(0, bnw.a(e, b) - f);
	//    2    2:iconst_0        
	//    3    3:aload_0         
	//    4    4:getfield        #56  <Field int e>
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field int b>
	//    7   11:invokestatic    #84  <Method int bnw.a(int, int)>
	//    8   14:aload_0         
	//    9   15:getfield        #50  <Field int f>
	//   10   18:isub            
	//   11   19:invokestatic    #68  <Method int Math.max(int, int)>
	//   12   22:istore_1        
		j = g;
	//   13   23:aload_0         
	//   14   24:getfield        #39  <Field int g>
	//   15   27:istore_2        
		if(i < j)
			break MISSING_BLOCK_LABEL_36;
	//   16   28:iload_1         
	//   17   29:iload_2         
	//   18   30:icmplt          36
		this;
	//   19   33:aload_0         
		JVM INSTR monitorexit ;
	//   20   34:monitorexit     
		return;
	//   21   35:return          
		Arrays.fill(((Object []) (h)), i, g, ((Object) (null)));
	//   22   36:aload_0         
	//   23   37:getfield        #43  <Field bmi[] h>
	//   24   40:iload_1         
	//   25   41:aload_0         
	//   26   42:getfield        #39  <Field int g>
	//   27   45:aconst_null     
	//   28   46:invokestatic    #88  <Method void Arrays.fill(Object[], int, int, Object)>
		g = i;
	//   29   49:aload_0         
	//   30   50:iload_1         
	//   31   51:putfield        #39  <Field int g>
		this;
	//   32   54:aload_0         
		JVM INSTR monitorexit ;
	//   33   55:monitorexit     
		return;
	//   34   56:return          
		Exception exception;
		exception;
	//   35   57:astore_3        
	//*  36   58:aload_0         
		throw exception;
	//   37   59:monitorexit     
	//   38   60:aload_3         
	//   39   61:athrow          
	}

	public final int c()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int b>
	//    2    4:ireturn         
	}

	public final void d()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(a)
	//*   2    2:aload_0         
	//*   3    3:getfield        #35  <Field boolean a>
	//*   4    6:ifeq            14
			a(0);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #91  <Method void a(int)>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		Exception exception;
		exception;
	//   11   17:astore_1        
	//*  12   18:aload_0         
		throw exception;
	//   13   19:monitorexit     
	//   14   20:aload_1         
	//   15   21:athrow          
	}

	public final int e()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		int j;
		i = f;
	//    2    2:aload_0         
	//    3    3:getfield        #50  <Field int f>
	//    4    6:istore_1        
		j = b;
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field int b>
	//    7   11:istore_2        
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return i * j;
	//   10   14:iload_1         
	//   11   15:iload_2         
	//   12   16:imul            
	//   13   17:ireturn         
		Exception exception;
		exception;
	//   14   18:astore_3        
	//*  15   19:aload_0         
		throw exception;
	//   16   20:monitorexit     
	//   17   21:aload_3         
	//   18   22:athrow          
	}

	private final boolean a;
	private final int b;
	private final byte c[];
	private final bmi d[];
	private int e;
	private int f;
	private int g;
	private bmi h[];
}
