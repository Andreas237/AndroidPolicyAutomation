// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.amap.api.mapcore.util:
//			m

static class m$j
{

	private void c()
	{
		if(!b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean b>
	//*   2    4:ifne            32
		{
			c = 0x20000;
	//    3    7:aload_0         
	//    4    8:ldc1            #33  <Int 0x20000>
	//    5   10:putfield        #35  <Field int c>
			if(c >= 0x20000)
	//*   6   13:aload_0         
	//*   7   14:getfield        #35  <Field int c>
	//*   8   17:ldc1            #33  <Int 0x20000>
	//*   9   19:icmplt          27
				e = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #37  <Field boolean e>
			b = true;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #32  <Field boolean b>
		}
	//   16   32:return          
	}

	public void a(m$i m$i1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		m$i.a(m$i1, true);
	//    2    2:aload_1         
	//    3    3:iconst_1        
	//    4    4:invokestatic    #43  <Method boolean m$i.a(m$i, boolean)>
	//    5    7:pop             
		if(g == m$i1)
	//*   6    8:aload_0         
	//*   7    9:getfield        #45  <Field m$i g>
	//*   8   12:aload_1         
	//*   9   13:if_acmpne       21
			g = null;
	//   10   16:aload_0         
	//   11   17:aconst_null     
	//   12   18:putfield        #45  <Field m$i g>
		((Object)this).notifyAll();
	//   13   21:aload_0         
	//   14   22:invokevirtual   #48  <Method void Object.notifyAll()>
		this;
	//   15   25:aload_0         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		return;
	//   17   27:return          
		m$i1;
	//   18   28:astore_1        
	//*  19   29:aload_0         
		throw m$i1;
	//   20   30:monitorexit     
	//   21   31:aload_1         
	//   22   32:athrow          
	}

	public void a(GL10 gl10)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(d || gl10 == null)
			break MISSING_BLOCK_LABEL_81;
	//    2    2:aload_0         
	//    3    3:getfield        #51  <Field boolean d>
	//    4    6:ifne            81
	//    5    9:aload_1         
	//    6   10:ifnull          81
		c();
	//    7   13:aload_0         
	//    8   14:invokespecial   #53  <Method void c()>
		gl10 = ((GL10) (gl10.glGetString(7937)));
	//    9   17:aload_1         
	//   10   18:sipush          7937
	//   11   21:invokeinterface #59  <Method String GL10.glGetString(int)>
	//   12   26:astore_1        
		if(c >= 0x20000)
			break MISSING_BLOCK_LABEL_59;
	//   13   27:aload_0         
	//   14   28:getfield        #35  <Field int c>
	//   15   31:ldc1            #33  <Int 0x20000>
	//   16   33:icmpge          59
		boolean flag;
		if(!((String) (gl10)).startsWith("Q3Dimension MSM7500 "))
	//*  17   36:aload_1         
	//*  18   37:ldc1            #61  <String "Q3Dimension MSM7500 ">
	//*  19   39:invokevirtual   #67  <Method boolean String.startsWith(String)>
	//*  20   42:ifne            89
			flag = true;
	//   21   45:iconst_1        
	//   22   46:istore_2        
		else
	//*  23   47:goto            50
	//*  24   50:aload_0         
	//*  25   51:iload_2         
	//*  26   52:putfield        #37  <Field boolean e>
	//*  27   55:aload_0         
	//*  28   56:invokevirtual   #48  <Method void Object.notifyAll()>
	//*  29   59:aload_0         
	//*  30   60:getfield        #37  <Field boolean e>
	//*  31   63:ifne            94
	//*  32   66:iconst_1        
	//*  33   67:istore_2        
	//*  34   68:goto            71
	//*  35   71:aload_0         
	//*  36   72:iload_2         
	//*  37   73:putfield        #69  <Field boolean f>
	//*  38   76:aload_0         
	//*  39   77:iconst_1        
	//*  40   78:putfield        #51  <Field boolean d>
	//*  41   81:aload_0         
	//*  42   82:monitorexit     
	//*  43   83:return          
	//*  44   84:astore_1        
	//*  45   85:aload_0         
	//*  46   86:monitorexit     
	//*  47   87:aload_1         
	//*  48   88:athrow          
			flag = false;
	//   49   89:iconst_0        
	//   50   90:istore_2        
		e = flag;
		((Object)this).notifyAll();
		if(!e)
			flag = true;
		else
	//*  51   91:goto            50
			flag = false;
	//   52   94:iconst_0        
	//   53   95:istore_2        
		f = flag;
		d = true;
		this;
		JVM INSTR monitorexit ;
		return;
		gl10;
		throw gl10;
	//*  54   96:goto            71
	}

	public boolean a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = f;
	//    2    2:aload_0         
	//    3    3:getfield        #69  <Field boolean f>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public boolean b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		c();
	//    2    2:aload_0         
	//    3    3:invokespecial   #53  <Method void c()>
		flag = e;
	//    4    6:aload_0         
	//    5    7:getfield        #37  <Field boolean e>
	//    6   10:istore_1        
		if(!flag)
	//*   7   11:iload_1         
	//*   8   12:ifne            20
			flag = true;
	//    9   15:iconst_1        
	//   10   16:istore_1        
		else
	//*  11   17:goto            22
			flag = false;
	//   12   20:iconst_0        
	//   13   21:istore_1        
		this;
	//   14   22:aload_0         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		return flag;
	//   16   24:iload_1         
	//   17   25:ireturn         
		Exception exception;
		exception;
	//   18   26:astore_2        
	//*  19   27:aload_0         
		throw exception;
	//   20   28:monitorexit     
	//   21   29:aload_2         
	//   22   30:athrow          
	}

	public boolean b(m$i m$i1)
	{
		if(g == m$i1 || g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field m$i g>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       15
	//*   4    8:aload_0         
	//*   5    9:getfield        #45  <Field m$i g>
	//*   6   12:ifnonnull       26
		{
			g = m$i1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #45  <Field m$i g>
			((Object)this).notifyAll();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #48  <Method void Object.notifyAll()>
			return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		}
		c();
	//   14   26:aload_0         
	//   15   27:invokespecial   #53  <Method void c()>
		if(e)
	//*  16   30:aload_0         
	//*  17   31:getfield        #37  <Field boolean e>
	//*  18   34:ifeq            39
			return true;
	//   19   37:iconst_1        
	//   20   38:ireturn         
		if(g != null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #45  <Field m$i g>
	//*  23   43:ifnull          53
			g.i();
	//   24   46:aload_0         
	//   25   47:getfield        #45  <Field m$i g>
	//   26   50:invokevirtual   #74  <Method void m$i.i()>
		return false;
	//   27   53:iconst_0        
	//   28   54:ireturn         
	}

	public void c(m$i m$i1)
	{
		if(g == m$i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field m$i g>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       13
			g = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #45  <Field m$i g>
		((Object)this).notifyAll();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #48  <Method void Object.notifyAll()>
	//    9   17:return          
	}

	private static String a = "GLThreadManager";
	private boolean b;
	private int c;
	private boolean d;
	private boolean e;
	private boolean f;
	private m$i g;

	static 
	{
	//    0    0:ldc1            #22  <String "GLThreadManager">
	//    1    2:putstatic       #24  <Field String a>
	//*   2    5:return          
	}

	private m$j()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	m$j(m$1 m$1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void m$j()>
	//    2    4:return          
	}
}
