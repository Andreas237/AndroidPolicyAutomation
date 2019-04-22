// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b:
//			g

final class g$b extends AbstractSet
{

	public void clear()
	{
		a.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field g a>
	//    2    4:invokevirtual   #23  <Method void g.clear()>
	//    3    7:return          
	}

	public boolean contains(Object obj)
	{
		return a.containsKey(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field g a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method boolean g.containsKey(Object)>
	//    4    8:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new g.c() {

			public Object next()
			{
				return b().f;
			//    0    0:aload_0         
			//    1    1:invokevirtual   #31  <Method g$d b()>
			//    2    4:getfield        #37  <Field Object g$d.f>
			//    3    7:areturn         
			}

			final g.b a;

			
			{
				a = g.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field g$b a>
				super(g.b.this.a, ((g._cls1) (null)));
			//    3    5:aload_0         
			//    4    6:aload_1         
			//    5    7:getfield        #22  <Field g g$b.a>
			//    6   10:aconst_null     
			//    7   11:invokespecial   #25  <Method void g$c(g, g$1)>
			//    8   14:return          
			}
		}
));
	//    0    0:new             #10  <Class g$b$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void g$b$1(g$b)>
	//    4    8:areturn         
	}

	public boolean remove(Object obj)
	{
		return a.b(obj) != null;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field g a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method g$d g.b(Object)>
	//    4    8:ifnull          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public int size()
	{
		return a.c;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field g a>
	//    2    4:getfield        #45  <Field int g.c>
	//    3    7:ireturn         
	}

	final g a;

	g$b(g g1)
	{
		a = g1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field g a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void AbstractSet()>
	//    5    9:return          
	}
}
