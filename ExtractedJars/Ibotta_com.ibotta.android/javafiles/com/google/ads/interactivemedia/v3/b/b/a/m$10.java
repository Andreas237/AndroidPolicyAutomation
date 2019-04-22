// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.d.*;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;
import java.net.URL;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$10 extends w
{

	public URL a(a a1)
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
		a1 = ((a) (a1.h()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #35  <Method String a.h()>
	//   10   20:astore_1        
		if("null".equals(((Object) (a1))))
	//*  11   21:ldc1            #37  <String "null">
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  14   27:ifeq            32
			return null;
	//   15   30:aconst_null     
	//   16   31:areturn         
		else
			return new URL(((String) (a1)));
	//   17   32:new             #45  <Class URL>
	//   18   35:dup             
	//   19   36:aload_1         
	//   20   37:invokespecial   #48  <Method void URL(String)>
	//   21   40:areturn         
	}

	public void a(c c1, URL url)
		throws IOException
	{
		if(url == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			url = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            14
			url = ((URL) (url.toExternalForm()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #53  <Method String URL.toExternalForm()>
	//    7   13:astore_2        
		c1.b(((String) (url)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #59  <Method c c.b(String)>
	//   11   19:pop             
	//   12   20:return          
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #63  <Method URL a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (URL)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #45  <Class URL>
	//    4    6:invokevirtual   #67  <Method void a(c, URL)>
	//    5    9:return          
	}

	m$10()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void w()>
	//    2    4:return          
	}
}
