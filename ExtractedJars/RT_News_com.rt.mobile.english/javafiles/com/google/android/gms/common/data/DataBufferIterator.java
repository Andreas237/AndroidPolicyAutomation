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
	//    1    1:invokespecial   #17  <Method void Object()>
		mDataBuffer = (DataBuffer)Preconditions.checkNotNull(((Object) (databuffer)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #23  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #25  <Class DataBuffer>
	//    6   12:putfield        #27  <Field DataBuffer mDataBuffer>
		mPosition = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #29  <Field int mPosition>
	//   10   20:return          
	}

	public boolean hasNext()
	{
		return mPosition < mDataBuffer.getCount() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int mPosition>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field DataBuffer mDataBuffer>
	//    4    8:invokeinterface #38  <Method int DataBuffer.getCount()>
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
	//*   1    1:invokevirtual   #42  <Method boolean hasNext()>
	//*   2    4:ifne            47
		{
			int i = mPosition;
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field int mPosition>
	//    5   11:istore_1        
			StringBuilder stringbuilder = new StringBuilder(46);
	//    6   12:new             #44  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:bipush          46
	//    9   18:invokespecial   #47  <Method void StringBuilder(int)>
	//   10   21:astore_2        
			stringbuilder.append("Cannot advance the iterator beyond ");
	//   11   22:aload_2         
	//   12   23:ldc1            #49  <String "Cannot advance the iterator beyond ">
	//   13   25:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
			stringbuilder.append(i);
	//   15   29:aload_2         
	//   16   30:iload_1         
	//   17   31:invokevirtual   #56  <Method StringBuilder StringBuilder.append(int)>
	//   18   34:pop             
			throw new NoSuchElementException(stringbuilder.toString());
	//   19   35:new             #58  <Class NoSuchElementException>
	//   20   38:dup             
	//   21   39:aload_2         
	//   22   40:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #65  <Method void NoSuchElementException(String)>
	//   24   46:athrow          
		} else
		{
			DataBuffer databuffer = mDataBuffer;
	//   25   47:aload_0         
	//   26   48:getfield        #27  <Field DataBuffer mDataBuffer>
	//   27   51:astore_2        
			int j = mPosition + 1;
	//   28   52:aload_0         
	//   29   53:getfield        #29  <Field int mPosition>
	//   30   56:iconst_1        
	//   31   57:iadd            
	//   32   58:istore_1        
			mPosition = j;
	//   33   59:aload_0         
	//   34   60:iload_1         
	//   35   61:putfield        #29  <Field int mPosition>
			return databuffer.get(j);
	//   36   64:aload_2         
	//   37   65:iload_1         
	//   38   66:invokeinterface #69  <Method Object DataBuffer.get(int)>
	//   39   71:areturn         
		}
	}

	public void remove()
	{
		throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
	//    0    0:new             #73  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #75  <String "Cannot remove elements from a DataBufferIterator">
	//    3    6:invokespecial   #76  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	protected final DataBuffer mDataBuffer;
	protected int mPosition;
}
