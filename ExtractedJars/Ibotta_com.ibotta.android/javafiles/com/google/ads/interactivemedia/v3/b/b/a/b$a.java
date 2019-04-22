// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.b.h;
import com.google.ads.interactivemedia.v3.b.d.*;
import com.google.ads.interactivemedia.v3.b.f;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			b, l

private static final class b$a extends w
{

	public Collection a(a a1)
		throws IOException
	{
		if(a1.f() == b.i)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #39  <Method b a.f()>
	//*   2    4:getstatic       #45  <Field b b.i>
	//*   3    7:if_acmpne       16
		{
			a1.j();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #48  <Method void a.j()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		Collection collection = (Collection)b.a();
	//    8   16:aload_0         
	//    9   17:getfield        #27  <Field h b>
	//   10   20:invokeinterface #53  <Method Object h.a()>
	//   11   25:checkcast       #55  <Class Collection>
	//   12   28:astore_2        
		a1.a();
	//   13   29:aload_1         
	//   14   30:invokevirtual   #57  <Method void a.a()>
		for(; a1.e(); collection.add(a.read(a1)));
	//   15   33:aload_1         
	//   16   34:invokevirtual   #61  <Method boolean a.e()>
	//   17   37:ifeq            58
	//   18   40:aload_2         
	//   19   41:aload_0         
	//   20   42:getfield        #25  <Field w a>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #65  <Method Object w.read(a)>
	//   23   49:invokeinterface #69  <Method boolean Collection.add(Object)>
	//   24   54:pop             
	//*  25   55:goto            33
		a1.b();
	//   26   58:aload_1         
	//   27   59:invokevirtual   #71  <Method void a.b()>
		return collection;
	//   28   62:aload_2         
	//   29   63:areturn         
	}

	public void a(c c1, Collection collection)
		throws IOException
	{
		if(collection == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			c1.f();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #79  <Method c c.f()>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		c1.b();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #81  <Method c c.b()>
	//    8   14:pop             
		Object obj;
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); a.write(c1, obj))
	//*   9   15:aload_2         
	//*  10   16:invokeinterface #85  <Method Iterator Collection.iterator()>
	//*  11   21:astore_2        
	//*  12   22:aload_2         
	//*  13   23:invokeinterface #90  <Method boolean Iterator.hasNext()>
	//*  14   28:ifeq            50
			obj = ((Iterator) (collection)).next();
	//   15   31:aload_2         
	//   16   32:invokeinterface #93  <Method Object Iterator.next()>
	//   17   37:astore_3        

	//   18   38:aload_0         
	//   19   39:getfield        #25  <Field w a>
	//   20   42:aload_1         
	//   21   43:aload_3         
	//   22   44:invokevirtual   #97  <Method void w.write(c, Object)>
	//*  23   47:goto            22
		c1.c();
	//   24   50:aload_1         
	//   25   51:invokevirtual   #100 <Method c c.c()>
	//   26   54:pop             
	//   27   55:return          
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #103 <Method Collection a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (Collection)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #55  <Class Collection>
	//    4    6:invokevirtual   #105 <Method void a(c, Collection)>
	//    5    9:return          
	}

	private final w a;
	private final h b;

	public b$a(f f, Type type, w w1, h h1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void w()>
		a = ((w) (new l(f, w1, type)));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class l>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokespecial   #23  <Method void l(f, w, Type)>
	//    9   15:putfield        #25  <Field w a>
		b = h1;
	//   10   18:aload_0         
	//   11   19:aload           4
	//   12   21:putfield        #27  <Field h b>
	//   13   24:return          
	}
}
