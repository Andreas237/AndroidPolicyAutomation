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

class f$5 extends w
{

	public Number a(a a1)
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
			return ((Number) (Long.valueOf(a1.l())));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #41  <Method long a.l()>
	//   10   20:invokestatic    #47  <Method Long Long.valueOf(long)>
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
			c1.b(((Object) (number)).toString());
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #60  <Method String Object.toString()>
	//    9   15:invokevirtual   #64  <Method c c.b(String)>
	//   10   18:pop             
			return;
	//   11   19:return          
		}
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #68  <Method Number a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (Number)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #72  <Class Number>
	//    4    6:invokevirtual   #74  <Method void a(c, Number)>
	//    5    9:return          
	}

	final f a;

	f$5(f f1)
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
