// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.d.*;
import com.google.ads.interactivemedia.v3.b.m;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$11 extends w
{

	public URI a(a a1)
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
		a1 = ((a) (a1.h()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #37  <Method String a.h()>
	//   10   20:astore_1        
		if("null".equals(((Object) (a1))))
	//*  11   21:ldc1            #39  <String "null">
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*  14   27:ifeq            32
			return null;
	//   15   30:aconst_null     
	//   16   31:areturn         
		try
		{
			a1 = ((a) (new URI(((String) (a1)))));
	//   17   32:new             #47  <Class URI>
	//   18   35:dup             
	//   19   36:aload_1         
	//   20   37:invokespecial   #50  <Method void URI(String)>
	//   21   40:astore_1        
		}
	//*  22   41:aload_1         
	//*  23   42:areturn         
		// Misplaced declaration of an exception variable
		catch(a a1)
	//*  24   43:astore_1        
		{
			throw new m(((Throwable) (a1)));
	//   25   44:new             #52  <Class m>
	//   26   47:dup             
	//   27   48:aload_1         
	//   28   49:invokespecial   #55  <Method void m(Throwable)>
	//   29   52:athrow          
		}
		return ((URI) (a1));
	}

	public void a(c c1, URI uri)
		throws IOException
	{
		if(uri == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			uri = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            14
			uri = ((URI) (uri.toASCIIString()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #60  <Method String URI.toASCIIString()>
	//    7   13:astore_2        
		c1.b(((String) (uri)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #66  <Method c c.b(String)>
	//   11   19:pop             
	//   12   20:return          
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #70  <Method URI a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (URI)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #47  <Class URI>
	//    4    6:invokevirtual   #74  <Method void a(c, URI)>
	//    5    9:return          
	}

	m$11()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void w()>
	//    2    4:return          
	}
}
