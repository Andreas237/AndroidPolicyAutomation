// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.b.d.*;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl.data:
//			m

final class m$1 extends w
{

	public m read(a a1)
		throws IOException
	{
		if(a1.f() == b.i)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #22  <Method b a.f()>
	//*   2    4:getstatic       #28  <Field b b.i>
	//*   3    7:if_acmpne       16
		{
			a1.j();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #31  <Method void a.j()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return new m(a1.h());
	//    8   16:new             #7   <Class m>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokevirtual   #35  <Method String a.h()>
	//   12   24:invokespecial   #38  <Method void m(String)>
	//   13   27:areturn         
		}
	}

	public volatile Object read(a a1)
		throws IOException
	{
		return ((Object) (read(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #42  <Method m read(a)>
	//    3    5:areturn         
	}

	public void write(c c1, m m1)
		throws IOException
	{
		if(m1 == null)
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
			c1.b(m1.getName());
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #52  <Method String m.getName()>
	//    9   15:invokevirtual   #56  <Method c c.b(String)>
	//   10   18:pop             
			return;
	//   11   19:return          
		}
	}

	public volatile void write(c c1, Object obj)
		throws IOException
	{
		write(c1, (m)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class m>
	//    4    6:invokevirtual   #59  <Method void write(c, m)>
	//    5    9:return          
	}

	m$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void w()>
	//    2    4:return          
	}
}
