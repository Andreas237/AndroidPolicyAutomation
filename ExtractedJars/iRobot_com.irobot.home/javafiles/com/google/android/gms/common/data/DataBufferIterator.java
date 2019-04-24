// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//			DataBuffer

public class DataBufferIterator
	implements Iterator
{

	public DataBufferIterator(DataBuffer databuffer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zalj = (DataBuffer)Preconditions.checkNotNull(((Object) (databuffer)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #24  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #26  <Class DataBuffer>
	//    6   12:putfield        #28  <Field DataBuffer zalj>
		zalk = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #30  <Field int zalk>
	//   10   20:return          
	}

	public boolean hasNext()
	{
		return zalk < zalj.getCount() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int zalk>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field DataBuffer zalj>
	//    4    8:invokeinterface #39  <Method int DataBuffer.getCount()>
	//    5   13:iconst_1        
	//    6   14:isub            
	//    7   15:icmpge          20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public Object next()
	{
		if(!hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #43  <Method boolean hasNext()>
	//*   2    4:ifne            47
		{
			int i = zalk;
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field int zalk>
	//    5   11:istore_1        
			StringBuilder stringbuilder = new StringBuilder(46);
	//    6   12:new             #45  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:bipush          46
	//    9   18:invokespecial   #48  <Method void StringBuilder(int)>
	//   10   21:astore_2        
			stringbuilder.append("Cannot advance the iterator beyond ");
	//   11   22:aload_2         
	//   12   23:ldc1            #50  <String "Cannot advance the iterator beyond ">
	//   13   25:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
			stringbuilder.append(i);
	//   15   29:aload_2         
	//   16   30:iload_1         
	//   17   31:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   18   34:pop             
			throw new NoSuchElementException(stringbuilder.toString());
	//   19   35:new             #59  <Class NoSuchElementException>
	//   20   38:dup             
	//   21   39:aload_2         
	//   22   40:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #66  <Method void NoSuchElementException(String)>
	//   24   46:athrow          
		} else
		{
			DataBuffer databuffer = zalj;
	//   25   47:aload_0         
	//   26   48:getfield        #28  <Field DataBuffer zalj>
	//   27   51:astore_2        
			int j = zalk + 1;
	//   28   52:aload_0         
	//   29   53:getfield        #30  <Field int zalk>
	//   30   56:iconst_1        
	//   31   57:iadd            
	//   32   58:istore_1        
			zalk = j;
	//   33   59:aload_0         
	//   34   60:iload_1         
	//   35   61:putfield        #30  <Field int zalk>
			return databuffer.get(j);
	//   36   64:aload_2         
	//   37   65:iload_1         
	//   38   66:invokeinterface #70  <Method Object DataBuffer.get(int)>
	//   39   71:areturn         
		}
	}

	public void remove()
	{
		throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
	//    0    0:new             #74  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #76  <String "Cannot remove elements from a DataBufferIterator">
	//    3    6:invokespecial   #77  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	protected final DataBuffer zalj;
	protected int zalk;
}
