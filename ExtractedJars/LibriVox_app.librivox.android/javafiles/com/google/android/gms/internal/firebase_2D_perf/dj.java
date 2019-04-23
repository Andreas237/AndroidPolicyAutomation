// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			dl, di

final class dj extends dl
{

	dj(di di1)
	{
		c = di1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field di c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void dl()>
		a = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #18  <Field int a>
		b = c.a();
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #13  <Field di c>
	//   11   19:invokevirtual   #23  <Method int di.a()>
	//   12   22:putfield        #25  <Field int b>
	//   13   25:return          
	}

	public final byte a()
	{
		int i = a;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int a>
	//    2    4:istore_1        
		if(i < b)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #25  <Field int b>
	//*   6   10:icmpge          29
		{
			a = i + 1;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:putfield        #18  <Field int a>
			return c.b(i);
	//   12   20:aload_0         
	//   13   21:getfield        #13  <Field di c>
	//   14   24:iload_1         
	//   15   25:invokevirtual   #30  <Method byte di.b(int)>
	//   16   28:ireturn         
		} else
		{
			throw new NoSuchElementException();
	//   17   29:new             #32  <Class NoSuchElementException>
	//   18   32:dup             
	//   19   33:invokespecial   #33  <Method void NoSuchElementException()>
	//   20   36:athrow          
		}
	}

	public final boolean hasNext()
	{
		return a < b;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int a>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field int b>
	//    4    8:icmpge          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private int a;
	private final int b;
	private final di c;
}
