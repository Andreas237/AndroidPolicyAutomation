// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.d.*;
import com.google.ads.interactivemedia.v3.b.t;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$31 extends w
{

	public Number a(a a1)
		throws IOException
	{
		if(a1.f() == b.i)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #24  <Method b a.f()>
	//*   2    4:getstatic       #30  <Field b b.i>
	//*   3    7:if_acmpne       16
		{
			a1.j();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #33  <Method void a.j()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		long l;
		try
		{
			l = a1.l();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #37  <Method long a.l()>
	//   10   20:lstore_2        
		}
	//*  11   21:lload_2         
	//*  12   22:invokestatic    #43  <Method Long Long.valueOf(long)>
	//*  13   25:areturn         
		// Misplaced declaration of an exception variable
		catch(a a1)
	//*  14   26:astore_1        
		{
			throw new t(((Throwable) (a1)));
	//   15   27:new             #45  <Class t>
	//   16   30:dup             
	//   17   31:aload_1         
	//   18   32:invokespecial   #48  <Method void t(Throwable)>
	//   19   35:athrow          
		}
		return ((Number) (Long.valueOf(l)));
	}

	public void a(c c1, Number number)
		throws IOException
	{
		c1.a(number);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #55  <Method c c.a(Number)>
	//    3    5:pop             
	//    4    6:return          
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #59  <Method Number a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (Number)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #63  <Class Number>
	//    4    6:invokevirtual   #65  <Method void a(c, Number)>
	//    5    9:return          
	}

	m$31()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void w()>
	//    2    4:return          
	}
}
