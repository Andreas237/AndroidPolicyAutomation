// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.d.*;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$8 extends w
{

	public StringBuilder a(a a1)
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
			return new StringBuilder(a1.h());
	//    8   16:new             #33  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokevirtual   #37  <Method String a.h()>
	//   12   24:invokespecial   #40  <Method void StringBuilder(String)>
	//   13   27:areturn         
		}
	}

	public void a(c c1, StringBuilder stringbuilder)
		throws IOException
	{
		if(stringbuilder == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			stringbuilder = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            14
			stringbuilder = ((StringBuilder) (stringbuilder.toString()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #45  <Method String StringBuilder.toString()>
	//    7   13:astore_2        
		c1.b(((String) (stringbuilder)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #51  <Method c c.b(String)>
	//   11   19:pop             
	//   12   20:return          
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #55  <Method StringBuilder a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (StringBuilder)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #33  <Class StringBuilder>
	//    4    6:invokevirtual   #59  <Method void a(c, StringBuilder)>
	//    5    9:return          
	}

	m$8()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void w()>
	//    2    4:return          
	}
}
