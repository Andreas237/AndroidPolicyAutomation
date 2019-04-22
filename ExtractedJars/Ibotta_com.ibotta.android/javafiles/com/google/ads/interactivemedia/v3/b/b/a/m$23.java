// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.d.*;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$23 extends w
{

	public Boolean a(a a1)
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
		}
		if(a1.f() == b.f)
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #22  <Method b a.f()>
	//*  10   20:getstatic       #33  <Field b b.f>
	//*  11   23:if_acmpne       37
			return Boolean.valueOf(Boolean.parseBoolean(a1.h()));
	//   12   26:aload_1         
	//   13   27:invokevirtual   #37  <Method String a.h()>
	//   14   30:invokestatic    #43  <Method boolean Boolean.parseBoolean(String)>
	//   15   33:invokestatic    #47  <Method Boolean Boolean.valueOf(boolean)>
	//   16   36:areturn         
		else
			return Boolean.valueOf(a1.i());
	//   17   37:aload_1         
	//   18   38:invokevirtual   #50  <Method boolean a.i()>
	//   19   41:invokestatic    #47  <Method Boolean Boolean.valueOf(boolean)>
	//   20   44:areturn         
	}

	public void a(c c1, Boolean boolean1)
		throws IOException
	{
		if(boolean1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			c1.f();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #57  <Method c c.f()>
	//    4    8:pop             
			return;
	//    5    9:return          
		} else
		{
			c1.a(boolean1.booleanValue());
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #60  <Method boolean Boolean.booleanValue()>
	//    9   15:invokevirtual   #63  <Method c c.a(boolean)>
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
	//    2    2:invokevirtual   #67  <Method Boolean a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (Boolean)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #39  <Class Boolean>
	//    4    6:invokevirtual   #71  <Method void a(c, Boolean)>
	//    5    9:return          
	}

	m$23()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void w()>
	//    2    4:return          
	}
}
