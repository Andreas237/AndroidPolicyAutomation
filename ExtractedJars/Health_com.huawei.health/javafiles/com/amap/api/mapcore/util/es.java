// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.nio.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			fk, fl

public class es extends fk
{
	static final class a extends fl
	{

		void a(int i)
		{
			int j = i;
		//    0    0:iload_1         
		//    1    1:istore_2        
			if(i < 32768)
		//*   2    2:iload_1         
		//*   3    3:ldc1            #24  <Int 32768>
		//*   4    5:icmpge          11
				j = 32768;
		//    5    8:ldc1            #24  <Int 32768>
		//    6   10:istore_2        
			a = ByteBuffer.allocateDirect(j).order(ByteOrder.nativeOrder());
		//    7   11:aload_0         
		//    8   12:iload_2         
		//    9   13:invokestatic    #30  <Method ByteBuffer ByteBuffer.allocateDirect(int)>
		//   10   16:invokestatic    #36  <Method ByteOrder ByteOrder.nativeOrder()>
		//   11   19:invokevirtual   #40  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//   12   22:putfield        #42  <Field ByteBuffer a>
			e = j;
		//   13   25:aload_0         
		//   14   26:iload_2         
		//   15   27:putfield        #44  <Field int e>
			b = null;
		//   16   30:aload_0         
		//   17   31:aconst_null     
		//   18   32:putfield        #46  <Field ShortBuffer b>
			d = null;
		//   19   35:aload_0         
		//   20   36:aconst_null     
		//   21   37:putfield        #48  <Field IntBuffer d>
			c = null;
		//   22   40:aload_0         
		//   23   41:aconst_null     
		//   24   42:putfield        #50  <Field FloatBuffer c>
		//   25   45:return          
		}

		ByteBuffer a;
		ShortBuffer b;
		FloatBuffer c;
		IntBuffer d;
		int e;

		a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void fl()>
		//    2    4:return          
		}
	}


	public es()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void fk()>
	//    2    4:return          
	}

	public a a(int i)
	{
		a a1 = (a)a;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field fl a>
	//    2    4:checkcast       #7   <Class es$a>
	//    3    7:astore_2        
		if(a1 == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       23
		{
			a1 = new a();
	//    6   12:new             #7   <Class es$a>
	//    7   15:dup             
	//    8   16:invokespecial   #20  <Method void es$a()>
	//    9   19:astore_2        
		} else
	//*  10   20:goto            36
		{
			a = a1.f;
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:getfield        #23  <Field fl es$a.f>
	//   14   28:putfield        #19  <Field fl a>
			a1.f = null;
	//   15   31:aload_2         
	//   16   32:aconst_null     
	//   17   33:putfield        #23  <Field fl es$a.f>
		}
		if(a1.e < i)
	//*  18   36:aload_2         
	//*  19   37:getfield        #27  <Field int es$a.e>
	//*  20   40:iload_1         
	//*  21   41:icmpge          49
			a1.a(i);
	//   22   44:aload_2         
	//   23   45:iload_1         
	//   24   46:invokevirtual   #30  <Method void es$a.a(int)>
		b = (a)fl.a(((fl) (b)), ((fl) (a1)));
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #32  <Field es$a b>
	//   28   54:aload_2         
	//   29   55:invokestatic    #37  <Method fl fl.a(fl, fl)>
	//   30   58:checkcast       #7   <Class es$a>
	//   31   61:putfield        #32  <Field es$a b>
		return a1;
	//   32   64:aload_2         
	//   33   65:areturn         
	}

	public void a()
	{
		b = (a)b(((fl) (b)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #32  <Field es$a b>
	//    4    6:invokevirtual   #40  <Method fl b(fl)>
	//    5    9:checkcast       #7   <Class es$a>
	//    6   12:putfield        #32  <Field es$a b>
	//    7   15:return          
	}

	public ShortBuffer b(int i)
	{
		a a1 = a(i * 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:imul            
	//    4    4:invokevirtual   #43  <Method es$a a(int)>
	//    5    7:astore_2        
		if(a1.b == null)
	//*   6    8:aload_2         
	//*   7    9:getfield        #46  <Field ShortBuffer es$a.b>
	//*   8   12:ifnonnull       37
		{
			a1.a.clear();
	//    9   15:aload_2         
	//   10   16:getfield        #49  <Field ByteBuffer es$a.a>
	//   11   19:invokevirtual   #55  <Method java.nio.Buffer ByteBuffer.clear()>
	//   12   22:pop             
			a1.b = a1.a.asShortBuffer();
	//   13   23:aload_2         
	//   14   24:aload_2         
	//   15   25:getfield        #49  <Field ByteBuffer es$a.a>
	//   16   28:invokevirtual   #59  <Method ShortBuffer ByteBuffer.asShortBuffer()>
	//   17   31:putfield        #46  <Field ShortBuffer es$a.b>
		} else
	//*  18   34:goto            45
		{
			a1.b.clear();
	//   19   37:aload_2         
	//   20   38:getfield        #46  <Field ShortBuffer es$a.b>
	//   21   41:invokevirtual   #62  <Method java.nio.Buffer ShortBuffer.clear()>
	//   22   44:pop             
		}
		return a1.b;
	//   23   45:aload_2         
	//   24   46:getfield        #46  <Field ShortBuffer es$a.b>
	//   25   49:areturn         
	}

	public FloatBuffer c(int i)
	{
		a a1 = a(i * 4);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_4        
	//    3    3:imul            
	//    4    4:invokevirtual   #43  <Method es$a a(int)>
	//    5    7:astore_2        
		if(a1.c == null)
	//*   6    8:aload_2         
	//*   7    9:getfield        #67  <Field FloatBuffer es$a.c>
	//*   8   12:ifnonnull       37
		{
			a1.a.clear();
	//    9   15:aload_2         
	//   10   16:getfield        #49  <Field ByteBuffer es$a.a>
	//   11   19:invokevirtual   #55  <Method java.nio.Buffer ByteBuffer.clear()>
	//   12   22:pop             
			a1.c = a1.a.asFloatBuffer();
	//   13   23:aload_2         
	//   14   24:aload_2         
	//   15   25:getfield        #49  <Field ByteBuffer es$a.a>
	//   16   28:invokevirtual   #71  <Method FloatBuffer ByteBuffer.asFloatBuffer()>
	//   17   31:putfield        #67  <Field FloatBuffer es$a.c>
		} else
	//*  18   34:goto            45
		{
			a1.c.clear();
	//   19   37:aload_2         
	//   20   38:getfield        #67  <Field FloatBuffer es$a.c>
	//   21   41:invokevirtual   #74  <Method java.nio.Buffer FloatBuffer.clear()>
	//   22   44:pop             
		}
		a1.c.clear();
	//   23   45:aload_2         
	//   24   46:getfield        #67  <Field FloatBuffer es$a.c>
	//   25   49:invokevirtual   #74  <Method java.nio.Buffer FloatBuffer.clear()>
	//   26   52:pop             
		return a1.c;
	//   27   53:aload_2         
	//   28   54:getfield        #67  <Field FloatBuffer es$a.c>
	//   29   57:areturn         
	}

	private a b;
}
