// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.c.a;
import com.google.ads.interactivemedia.v3.b.d.c;
import com.google.ads.interactivemedia.v3.b.f;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;
import java.lang.reflect.Field;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			i, l

class i$1 extends i$b
{

	void a(com.google.ads.interactivemedia.v3.b.d.a a1, Object obj)
		throws IOException, IllegalAccessException
	{
		a1 = ((com.google.ads.interactivemedia.v3.b.d.a) (a.read(a1)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field w a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #53  <Method Object w.read(com.google.ads.interactivemedia.v3.b.d.a)>
	//    4    8:astore_1        
		if(a1 != null || !e)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       20
	//*   7   13:aload_0         
	//*   8   14:getfield        #33  <Field boolean e>
	//*   9   17:ifne            29
			c.set(obj, ((Object) (a1)));
	//   10   20:aload_0         
	//   11   21:getfield        #29  <Field Field c>
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #59  <Method void Field.set(Object, Object)>
	//   15   29:return          
	}

	void a(c c1, Object obj)
		throws IOException, IllegalAccessException
	{
		obj = c.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Field c>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #65  <Method Object Field.get(Object)>
	//    4    8:astore_2        
		((w) (new l(b, a, d.b()))).write(c1, obj);
	//    5    9:new             #67  <Class l>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field f b>
	//    9   17:aload_0         
	//   10   18:getfield        #41  <Field w a>
	//   11   21:aload_0         
	//   12   22:getfield        #31  <Field a d>
	//   13   25:invokevirtual   #72  <Method java.lang.reflect.Type a.b()>
	//   14   28:invokespecial   #75  <Method void l(f, w, java.lang.reflect.Type)>
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:invokevirtual   #78  <Method void w.write(c, Object)>
	//   18   36:return          
	}

	public boolean a(Object obj)
		throws IOException, IllegalAccessException
	{
		boolean flag1 = h;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field boolean h>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(!flag1)
	//*   5    7:iload_3         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(c.get(obj) != obj)
	//*   9   13:aload_0         
	//*  10   14:getfield        #29  <Field Field c>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #65  <Method Object Field.get(Object)>
	//*  13   21:aload_1         
	//*  14   22:if_acmpeq       27
			flag = true;
	//   15   25:iconst_1        
	//   16   26:istore_2        
		return flag;
	//   17   27:iload_2         
	//   18   28:ireturn         
	}

	final w a;
	final f b;
	final Field c;
	final a d;
	final boolean e;
	final i f;

	i$1(i j, String s, boolean flag, boolean flag1, f f1, Field field, a a1, 
			boolean flag2)
	{
		f = j;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field i f>
		b = f1;
	//    3    5:aload_0         
	//    4    6:aload           5
	//    5    8:putfield        #27  <Field f b>
		c = field;
	//    6   11:aload_0         
	//    7   12:aload           6
	//    8   14:putfield        #29  <Field Field c>
		d = a1;
	//    9   17:aload_0         
	//   10   18:aload           7
	//   11   20:putfield        #31  <Field a d>
		e = flag2;
	//   12   23:aload_0         
	//   13   24:iload           8
	//   14   26:putfield        #33  <Field boolean e>
		super(s, flag, flag1);
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:iload_3         
	//   18   32:iload           4
	//   19   34:invokespecial   #36  <Method void i$b(String, boolean, boolean)>
		a = com.google.ads.interactivemedia.v3.b.b.a.i.a(f, b, c, d);
	//   20   37:aload_0         
	//   21   38:aload_0         
	//   22   39:getfield        #25  <Field i f>
	//   23   42:aload_0         
	//   24   43:getfield        #27  <Field f b>
	//   25   46:aload_0         
	//   26   47:getfield        #29  <Field Field c>
	//   27   50:aload_0         
	//   28   51:getfield        #31  <Field a d>
	//   29   54:invokestatic    #39  <Method w com.google.ads.interactivemedia.v3.b.b.a.i.a(i, f, Field, a)>
	//   30   57:putfield        #41  <Field w a>
	//   31   60:return          
	}
}
