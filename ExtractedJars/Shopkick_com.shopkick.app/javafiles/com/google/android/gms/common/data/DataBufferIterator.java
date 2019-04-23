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
		if(hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #43  <Method boolean hasNext()>
	//*   2    4:ifeq            32
		{
			DataBuffer databuffer = zalj;
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field DataBuffer zalj>
	//    5   11:astore_2        
			int i = zalk + 1;
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field int zalk>
	//    8   16:iconst_1        
	//    9   17:iadd            
	//   10   18:istore_1        
			zalk = i;
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:putfield        #30  <Field int zalk>
			return databuffer.get(i);
	//   14   24:aload_2         
	//   15   25:iload_1         
	//   16   26:invokeinterface #47  <Method Object DataBuffer.get(int)>
	//   17   31:areturn         
		} else
		{
			int j = zalk;
	//   18   32:aload_0         
	//   19   33:getfield        #30  <Field int zalk>
	//   20   36:istore_1        
			StringBuilder stringbuilder = new StringBuilder(46);
	//   21   37:new             #49  <Class StringBuilder>
	//   22   40:dup             
	//   23   41:bipush          46
	//   24   43:invokespecial   #52  <Method void StringBuilder(int)>
	//   25   46:astore_2        
			stringbuilder.append("Cannot advance the iterator beyond ");
	//   26   47:aload_2         
	//   27   48:ldc1            #54  <String "Cannot advance the iterator beyond ">
	//   28   50:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
			stringbuilder.append(j);
	//   30   54:aload_2         
	//   31   55:iload_1         
	//   32   56:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   33   59:pop             
			throw new NoSuchElementException(stringbuilder.toString());
	//   34   60:new             #63  <Class NoSuchElementException>
	//   35   63:dup             
	//   36   64:aload_2         
	//   37   65:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   38   68:invokespecial   #70  <Method void NoSuchElementException(String)>
	//   39   71:athrow          
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
