// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.d.*;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$5 extends w
{

	public String a(a a1)
		throws IOException
	{
		b b1 = a1.f();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method b a.f()>
	//    2    4:astore_2        
		if(b1 == b.i)
	//*   3    5:aload_2         
	//*   4    6:getstatic       #28  <Field b b.i>
	//*   5    9:if_acmpne       18
		{
			a1.j();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #31  <Method void a.j()>
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		}
		if(b1 == b.h)
	//*  10   18:aload_2         
	//*  11   19:getstatic       #34  <Field b b.h>
	//*  12   22:if_acmpne       33
			return Boolean.toString(a1.i());
	//   13   25:aload_1         
	//   14   26:invokevirtual   #37  <Method boolean a.i()>
	//   15   29:invokestatic    #43  <Method String Boolean.toString(boolean)>
	//   16   32:areturn         
		else
			return a1.h();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #46  <Method String a.h()>
	//   19   37:areturn         
	}

	public void a(c c1, String s)
		throws IOException
	{
		c1.b(s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #54  <Method c c.b(String)>
	//    3    5:pop             
	//    4    6:return          
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #58  <Method String a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #62  <Class String>
	//    4    6:invokevirtual   #64  <Method void a(c, String)>
	//    5    9:return          
	}

	m$5()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void w()>
	//    2    4:return          
	}
}
