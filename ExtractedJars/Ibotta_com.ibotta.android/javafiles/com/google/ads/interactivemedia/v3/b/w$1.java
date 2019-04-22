// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b;

import com.google.ads.interactivemedia.v3.b.d.a;
import com.google.ads.interactivemedia.v3.b.d.b;
import com.google.ads.interactivemedia.v3.b.d.c;
import java.io.IOException;

// Referenced classes of package com.google.ads.interactivemedia.v3.b:
//			w

class w$1 extends w
{

	public Object read(a a1)
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
			return ((Object) (null));
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return a.read(a1);
	//    8   16:aload_0         
	//    9   17:getfield        #14  <Field w a>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #39  <Method Object w.read(a)>
	//   12   24:areturn         
		}
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			c1.f();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #49  <Method c c.f()>
	//    4    8:pop             
			return;
	//    5    9:return          
		} else
		{
			a.write(c1, obj);
	//    6   10:aload_0         
	//    7   11:getfield        #14  <Field w a>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #51  <Method void w.write(c, Object)>
			return;
	//   11   19:return          
		}
	}

	final w a;

	w$1(w w1)
	{
		a = w1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field w a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void w()>
	//    5    9:return          
	}
}
