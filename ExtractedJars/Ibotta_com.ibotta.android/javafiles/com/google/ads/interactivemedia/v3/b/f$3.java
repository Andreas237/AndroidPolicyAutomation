// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b;

import com.google.ads.interactivemedia.v3.b.d.a;
import com.google.ads.interactivemedia.v3.b.d.b;
import com.google.ads.interactivemedia.v3.b.d.c;
import java.io.IOException;

// Referenced classes of package com.google.ads.interactivemedia.v3.b:
//			w, f

class f$3 extends w
{

	public Double a(a a1)
		throws IOException
	{
		if(a1.f() == b.i)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #28  <Method b a.f()>
	//*   2    4:getstatic       #34  <Field b b.i>
	//*   3    7:if_acmpne       16
		{
			a1.j();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #37  <Method void a.j()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return Double.valueOf(a1.k());
	//    8   16:aload_1         
	//    9   17:invokevirtual   #41  <Method double a.k()>
	//   10   20:invokestatic    #47  <Method Double Double.valueOf(double)>
	//   11   23:areturn         
		}
	}

	public void a(c c1, Number number)
		throws IOException
	{
		if(number == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			c1.f();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #54  <Method c c.f()>
	//    4    8:pop             
			return;
	//    5    9:return          
		} else
		{
			double d = number.doubleValue();
	//    6   10:aload_2         
	//    7   11:invokevirtual   #59  <Method double Number.doubleValue()>
	//    8   14:dstore_3        
			com.google.ads.interactivemedia.v3.b.f.a(a, d);
	//    9   15:aload_0         
	//   10   16:getfield        #15  <Field f a>
	//   11   19:dload_3         
	//   12   20:invokestatic    #62  <Method void com.google.ads.interactivemedia.v3.b.f.a(f, double)>
			c1.a(number);
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:invokevirtual   #65  <Method c c.a(Number)>
	//   16   28:pop             
			return;
	//   17   29:return          
		}
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #69  <Method Double a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (Number)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #56  <Class Number>
	//    4    6:invokevirtual   #73  <Method void a(c, Number)>
	//    5    9:return          
	}

	final f a;

	f$3(f f1)
	{
		a = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field f a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void w()>
	//    5    9:return          
	}
}
