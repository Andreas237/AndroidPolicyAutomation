// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aqx, aqq

final class aqr
	implements aqx
{

	aqr(aqq aqq1)
	{
		c = aqq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field aqq c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
		a = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #20  <Field int a>
		b = c.a();
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #15  <Field aqq c>
	//   11   19:invokevirtual   #25  <Method int aqq.a()>
	//   12   22:putfield        #27  <Field int b>
	//   13   25:return          
	}

	public final byte a()
	{
		byte byte0;
		try
		{
			aqq aqq1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field aqq c>
	//    2    4:astore_3        
			int i = a;
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field int a>
	//    5    9:istore_2        
			a = i + 1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #20  <Field int a>
			byte0 = aqq1.a(i);
	//   11   17:aload_3         
	//   12   18:iload_2         
	//   13   19:invokevirtual   #34  <Method byte aqq.a(int)>
	//   14   22:istore_1        
		}
	//*  15   23:iload_1         
	//*  16   24:ireturn         
		catch(IndexOutOfBoundsException indexoutofboundsexception)
	//*  17   25:astore_3        
		{
			throw new NoSuchElementException(indexoutofboundsexception.getMessage());
	//   18   26:new             #36  <Class NoSuchElementException>
	//   19   29:dup             
	//   20   30:aload_3         
	//   21   31:invokevirtual   #40  <Method String IndexOutOfBoundsException.getMessage()>
	//   22   34:invokespecial   #43  <Method void NoSuchElementException(String)>
	//   23   37:athrow          
		}
		return byte0;
	}

	public final boolean hasNext()
	{
		return a < b;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int a>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field int b>
	//    4    8:icmpge          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public final Object next()
	{
		return ((Object) (Byte.valueOf(a())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method byte a()>
	//    2    4:invokestatic    #55  <Method Byte Byte.valueOf(byte)>
	//    3    7:areturn         
	}

	public final void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #58  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private int a;
	private final int b;
	private final aqq c;
}
