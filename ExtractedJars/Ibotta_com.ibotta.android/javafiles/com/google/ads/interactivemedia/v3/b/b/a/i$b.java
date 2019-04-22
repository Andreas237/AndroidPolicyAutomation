// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.d.a;
import com.google.ads.interactivemedia.v3.b.d.c;
import java.io.IOException;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			i

static abstract class i$b
{

	abstract void a(a a1, Object obj)
		throws IOException, IllegalAccessException;

	abstract void a(c c, Object obj)
		throws IOException, IllegalAccessException;

	abstract boolean a(Object obj)
		throws IOException, IllegalAccessException;

	final String g;
	final boolean h;
	final boolean i;

	protected i$b(String s, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		g = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String g>
		h = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field boolean h>
		i = flag1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field boolean i>
	//   11   19:return          
	}
}
