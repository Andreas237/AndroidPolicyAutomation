// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbah

final class zzbai
	implements Iterator
{

	zzbai(zzbah zzbah1)
	{
		zzdps = zzbah1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzbah zzdps>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
		position = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #20  <Field int position>
		limit = zzdps.size();
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #15  <Field zzbah zzdps>
	//   11   19:invokevirtual   #26  <Method int zzbah.size()>
	//   12   22:putfield        #28  <Field int limit>
	//   13   25:return          
	}

	private final byte nextByte()
	{
		byte byte0;
		try
		{
			zzbah zzbah1 = zzdps;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzbah zzdps>
	//    2    4:astore_3        
			int i = position;
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field int position>
	//    5    9:istore_2        
			position = i + 1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #20  <Field int position>
			byte0 = zzbah1.zzbn(i);
	//   11   17:aload_3         
	//   12   18:iload_2         
	//   13   19:invokevirtual   #37  <Method byte zzbah.zzbn(int)>
	//   14   22:istore_1        
		}
	//*  15   23:iload_1         
	//*  16   24:ireturn         
		catch(IndexOutOfBoundsException indexoutofboundsexception)
	//*  17   25:astore_3        
		{
			throw new NoSuchElementException(indexoutofboundsexception.getMessage());
	//   18   26:new             #39  <Class NoSuchElementException>
	//   19   29:dup             
	//   20   30:aload_3         
	//   21   31:invokevirtual   #43  <Method String IndexOutOfBoundsException.getMessage()>
	//   22   34:invokespecial   #46  <Method void NoSuchElementException(String)>
	//   23   37:athrow          
		}
		return byte0;
	}

	public final boolean hasNext()
	{
		return position < limit;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int position>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field int limit>
	//    4    8:icmpge          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public final Object next()
	{
		return ((Object) (Byte.valueOf(nextByte())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method byte nextByte()>
	//    2    4:invokestatic    #58  <Method Byte Byte.valueOf(byte)>
	//    3    7:areturn         
	}

	public final void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #61  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private final int limit;
	private int position;
	private final zzbah zzdps;
}
