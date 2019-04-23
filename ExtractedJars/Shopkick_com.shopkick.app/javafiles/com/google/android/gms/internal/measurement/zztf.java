// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzth, zzte

final class zztf extends zzth
{

	zztf(zzte zzte1)
	{
		zzbtt = zzte1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzte zzbtt>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void zzth()>
		position = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #18  <Field int position>
		limit = zzbtt.size();
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #13  <Field zzte zzbtt>
	//   11   19:invokevirtual   #24  <Method int zzte.size()>
	//   12   22:putfield        #26  <Field int limit>
	//   13   25:return          
	}

	public final boolean hasNext()
	{
		return position < limit;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int position>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field int limit>
	//    4    8:icmpge          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public final byte nextByte()
	{
		int i = position;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int position>
	//    2    4:istore_1        
		if(i < limit)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #26  <Field int limit>
	//*   6   10:icmpge          29
		{
			position = i + 1;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:putfield        #18  <Field int position>
			return zzbtt.zzan(i);
	//   12   20:aload_0         
	//   13   21:getfield        #13  <Field zzte zzbtt>
	//   14   24:iload_1         
	//   15   25:invokevirtual   #35  <Method byte zzte.zzan(int)>
	//   16   28:ireturn         
		} else
		{
			throw new NoSuchElementException();
	//   17   29:new             #37  <Class NoSuchElementException>
	//   18   32:dup             
	//   19   33:invokespecial   #38  <Method void NoSuchElementException()>
	//   20   36:athrow          
		}
	}

	private final int limit;
	private int position;
	private final zzte zzbtt;
}
