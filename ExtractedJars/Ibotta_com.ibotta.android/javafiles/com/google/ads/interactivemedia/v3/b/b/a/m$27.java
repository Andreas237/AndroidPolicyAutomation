// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.d.*;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$27 extends w
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
		} else
		{
			return Boolean.valueOf(a1.h());
	//    8   16:aload_1         
	//    9   17:invokevirtual   #35  <Method String a.h()>
	//   10   20:invokestatic    #41  <Method Boolean Boolean.valueOf(String)>
	//   11   23:areturn         
		}
	}

	public void a(c c1, Boolean boolean1)
		throws IOException
	{
		if(boolean1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
			boolean1 = "null";
	//    2    4:ldc1            #45  <String "null">
	//    3    6:astore_2        
		else
	//*   4    7:goto            15
			boolean1 = ((Boolean) (boolean1.toString()));
	//    5   10:aload_2         
	//    6   11:invokevirtual   #48  <Method String Boolean.toString()>
	//    7   14:astore_2        
		c1.b(((String) (boolean1)));
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #54  <Method c c.b(String)>
	//   11   20:pop             
	//   12   21:return          
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #58  <Method Boolean a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (Boolean)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #37  <Class Boolean>
	//    4    6:invokevirtual   #62  <Method void a(c, Boolean)>
	//    5    9:return          
	}

	m$27()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void w()>
	//    2    4:return          
	}
}
