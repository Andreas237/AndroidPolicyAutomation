// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.d.*;
import com.google.ads.interactivemedia.v3.b.t;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;
import java.math.BigInteger;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$7 extends w
{

	public BigInteger a(a a1)
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
		try
		{
			a1 = ((a) (new BigInteger(a1.h())));
	//    8   16:new             #35  <Class BigInteger>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokevirtual   #39  <Method String a.h()>
	//   12   24:invokespecial   #42  <Method void BigInteger(String)>
	//   13   27:astore_1        
		}
	//*  14   28:aload_1         
	//*  15   29:areturn         
		// Misplaced declaration of an exception variable
		catch(a a1)
	//*  16   30:astore_1        
		{
			throw new t(((Throwable) (a1)));
	//   17   31:new             #44  <Class t>
	//   18   34:dup             
	//   19   35:aload_1         
	//   20   36:invokespecial   #47  <Method void t(Throwable)>
	//   21   39:athrow          
		}
		return ((BigInteger) (a1));
	}

	public void a(c c1, BigInteger biginteger)
		throws IOException
	{
		c1.a(((Number) (biginteger)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #54  <Method c c.a(Number)>
	//    3    5:pop             
	//    4    6:return          
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #58  <Method BigInteger a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (BigInteger)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #35  <Class BigInteger>
	//    4    6:invokevirtual   #62  <Method void a(c, BigInteger)>
	//    5    9:return          
	}

	m$7()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void w()>
	//    2    4:return          
	}
}
