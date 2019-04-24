// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.internal.Asserts;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//			DataBuffer, DataBufferIterator

public abstract class FilteredDataBuffer
	implements DataBuffer
{

	public FilteredDataBuffer(DataBuffer databuffer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		Asserts.checkNotNull(((Object) (databuffer)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #21  <Method void Asserts.checkNotNull(Object)>
		boolean flag;
		if(!(databuffer instanceof FilteredDataBuffer))
	//*   4    8:aload_1         
	//*   5    9:instanceof      #2   <Class FilteredDataBuffer>
	//*   6   12:ifne            20
			flag = true;
	//    7   15:iconst_1        
	//    8   16:istore_2        
		else
	//*   9   17:goto            22
			flag = false;
	//   10   20:iconst_0        
	//   11   21:istore_2        
		Asserts.checkState(flag, "Not possible to have nested FilteredDataBuffers.");
	//   12   22:iload_2         
	//   13   23:ldc1            #23  <String "Not possible to have nested FilteredDataBuffers.">
	//   14   25:invokestatic    #27  <Method void Asserts.checkState(boolean, Object)>
		mDataBuffer = databuffer;
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:putfield        #29  <Field DataBuffer mDataBuffer>
	//   18   33:return          
	}

	public void close()
	{
		release();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method void release()>
	//    2    4:return          
	}

	protected abstract int computeRealPosition(int i);

	public Object get(int i)
	{
		return mDataBuffer.get(computeRealPosition(i));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field DataBuffer mDataBuffer>
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #42  <Method int computeRealPosition(int)>
	//    5    9:invokeinterface #44  <Method Object DataBuffer.get(int)>
	//    6   14:areturn         
	}

	public Bundle getMetadata()
	{
		return mDataBuffer.getMetadata();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field DataBuffer mDataBuffer>
	//    2    4:invokeinterface #49  <Method Bundle DataBuffer.getMetadata()>
	//    3    9:areturn         
	}

	public boolean isClosed()
	{
		return mDataBuffer.isClosed();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field DataBuffer mDataBuffer>
	//    2    4:invokeinterface #54  <Method boolean DataBuffer.isClosed()>
	//    3    9:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new DataBufferIterator(((DataBuffer) (this)))));
	//    0    0:new             #59  <Class DataBufferIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #61  <Method void DataBufferIterator(DataBuffer)>
	//    4    8:areturn         
	}

	public void release()
	{
		mDataBuffer.release();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field DataBuffer mDataBuffer>
	//    2    4:invokeinterface #63  <Method void DataBuffer.release()>
	//    3    9:return          
	}

	public Iterator singleRefIterator()
	{
		return iterator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method Iterator iterator()>
	//    2    4:areturn         
	}

	protected final DataBuffer mDataBuffer;
}
