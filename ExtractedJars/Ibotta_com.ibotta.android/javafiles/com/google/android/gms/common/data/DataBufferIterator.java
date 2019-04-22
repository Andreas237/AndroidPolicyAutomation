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
		if(hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #42  <Method boolean hasNext()>
	//*   2    4:ifeq            32
		{
			DataBuffer databuffer = mDataBuffer;
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field DataBuffer mDataBuffer>
	//    5   11:astore_2        
			int i = mPosition + 1;
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field int mPosition>
	//    8   16:iconst_1        
	//    9   17:iadd            
	//   10   18:istore_1        
			mPosition = i;
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:putfield        #29  <Field int mPosition>
			return databuffer.get(i);
	//   14   24:aload_2         
	//   15   25:iload_1         
	//   16   26:invokeinterface #46  <Method Object DataBuffer.get(int)>
	//   17   31:areturn         
		} else
		{
			int j = mPosition;
	//   18   32:aload_0         
	//   19   33:getfield        #29  <Field int mPosition>
	//   20   36:istore_1        
			StringBuilder stringbuilder = new StringBuilder(46);
	//   21   37:new             #48  <Class StringBuilder>
	//   22   40:dup             
	//   23   41:bipush          46
	//   24   43:invokespecial   #51  <Method void StringBuilder(int)>
	//   25   46:astore_2        
			stringbuilder.append("Cannot advance the iterator beyond ");
	//   26   47:aload_2         
	//   27   48:ldc1            #53  <String "Cannot advance the iterator beyond ">
	//   28   50:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
			stringbuilder.append(j);
	//   30   54:aload_2         
	//   31   55:iload_1         
	//   32   56:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
	//   33   59:pop             
			throw new NoSuchElementException(stringbuilder.toString());
	//   34   60:new             #62  <Class NoSuchElementException>
	//   35   63:dup             
	//   36   64:aload_2         
	//   37   65:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   38   68:invokespecial   #69  <Method void NoSuchElementException(String)>
	//   39   71:athrow          
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
