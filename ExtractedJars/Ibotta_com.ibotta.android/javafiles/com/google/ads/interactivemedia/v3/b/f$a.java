// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b;

import com.google.ads.interactivemedia.v3.b.d.a;
import com.google.ads.interactivemedia.v3.b.d.c;
import java.io.IOException;

// Referenced classes of package com.google.ads.interactivemedia.v3.b:
//			w, f

static class f$a extends w
{

	public void a(w w1)
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field w a>
	//*   2    4:ifnonnull       13
		{
			a = w1;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #18  <Field w a>
			return;
	//    6   12:return          
		} else
		{
			throw new AssertionError();
	//    7   13:new             #20  <Class AssertionError>
	//    8   16:dup             
	//    9   17:invokespecial   #21  <Method void AssertionError()>
	//   10   20:athrow          
		}
	}

	public Object read(a a1)
		throws IOException
	{
		w w1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field w a>
	//    2    4:astore_2        
		if(w1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			return w1.read(a1);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #29  <Method Object w.read(a)>
	//    8   14:areturn         
		else
			throw new IllegalStateException();
	//    9   15:new             #31  <Class IllegalStateException>
	//   10   18:dup             
	//   11   19:invokespecial   #32  <Method void IllegalStateException()>
	//   12   22:athrow          
	}

	public void write(c c, Object obj)
		throws IOException
	{
		w w1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field w a>
	//    2    4:astore_3        
		if(w1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          16
		{
			w1.write(c, obj);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #38  <Method void w.write(c, Object)>
			return;
	//    9   15:return          
		} else
		{
			throw new IllegalStateException();
	//   10   16:new             #31  <Class IllegalStateException>
	//   11   19:dup             
	//   12   20:invokespecial   #32  <Method void IllegalStateException()>
	//   13   23:athrow          
		}
	}

	private w a;

	f$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void w()>
	//    2    4:return          
	}
}
