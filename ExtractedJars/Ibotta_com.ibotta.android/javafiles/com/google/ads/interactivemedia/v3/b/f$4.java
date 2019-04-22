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

class f$4 extends w
{

	public Float a(a a1)
		throws IOException
	{
		if(a1.f() == b.i)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #29  <Method b a.f()>
	//*   2    4:getstatic       #35  <Field b b.i>
	//*   3    7:if_acmpne       16
		{
			a1.j();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #38  <Method void a.j()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return Float.valueOf((float)a1.k());
	//    8   16:aload_1         
	//    9   17:invokevirtual   #42  <Method double a.k()>
	//   10   20:d2f             
	//   11   21:invokestatic    #48  <Method Float Float.valueOf(float)>
	//   12   24:areturn         
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
	//    3    5:invokevirtual   #55  <Method c c.f()>
	//    4    8:pop             
			return;
	//    5    9:return          
		} else
		{
			float f1 = number.floatValue();
	//    6   10:aload_2         
	//    7   11:invokevirtual   #61  <Method float Number.floatValue()>
	//    8   14:fstore_3        
			com.google.ads.interactivemedia.v3.b.f.a(a, f1);
	//    9   15:aload_0         
	//   10   16:getfield        #16  <Field f a>
	//   11   19:fload_3         
	//   12   20:f2d             
	//   13   21:invokestatic    #64  <Method void com.google.ads.interactivemedia.v3.b.f.a(f, double)>
			c1.a(number);
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokevirtual   #67  <Method c c.a(Number)>
	//   17   29:pop             
			return;
	//   18   30:return          
		}
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #71  <Method Float a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (Number)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #57  <Class Number>
	//    4    6:invokevirtual   #75  <Method void a(c, Number)>
	//    5    9:return          
	}

	final f a;

	f$4(f f1)
	{
		a = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field f a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void w()>
	//    5    9:return          
	}
}
