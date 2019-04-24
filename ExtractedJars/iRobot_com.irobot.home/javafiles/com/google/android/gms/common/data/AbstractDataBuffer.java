// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//			DataBuffer, DataHolder, DataBufferIterator, SingleRefDataBufferIterator

public abstract class AbstractDataBuffer
	implements DataBuffer
{

	protected AbstractDataBuffer(DataHolder dataholder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mDataHolder = dataholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field DataHolder mDataHolder>
	//    5    9:return          
	}

	public final void close()
	{
		release();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method void release()>
	//    2    4:return          
	}

	public abstract Object get(int i);

	public int getCount()
	{
		if(mDataHolder == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field DataHolder mDataHolder>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mDataHolder.getCount();
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field DataHolder mDataHolder>
	//    7   13:invokevirtual   #33  <Method int DataHolder.getCount()>
	//    8   16:ireturn         
	}

	public Bundle getMetadata()
	{
		return mDataHolder.getMetadata();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DataHolder mDataHolder>
	//    2    4:invokevirtual   #37  <Method Bundle DataHolder.getMetadata()>
	//    3    7:areturn         
	}

	public boolean isClosed()
	{
		return mDataHolder == null || mDataHolder.isClosed();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DataHolder mDataHolder>
	//    2    4:ifnull          22
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field DataHolder mDataHolder>
	//    5   11:invokevirtual   #41  <Method boolean DataHolder.isClosed()>
	//    6   14:ifeq            20
	//    7   17:goto            22
	//    8   20:iconst_0        
	//    9   21:ireturn         
	//   10   22:iconst_1        
	//   11   23:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new DataBufferIterator(((DataBuffer) (this)))));
	//    0    0:new             #45  <Class DataBufferIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #48  <Method void DataBufferIterator(DataBuffer)>
	//    4    8:areturn         
	}

	public void release()
	{
		if(mDataHolder != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field DataHolder mDataHolder>
	//*   2    4:ifnull          14
			mDataHolder.close();
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field DataHolder mDataHolder>
	//    5   11:invokevirtual   #52  <Method void DataHolder.close()>
	//    6   14:return          
	}

	public Iterator singleRefIterator()
	{
		return ((Iterator) (new SingleRefDataBufferIterator(((DataBuffer) (this)))));
	//    0    0:new             #55  <Class SingleRefDataBufferIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #56  <Method void SingleRefDataBufferIterator(DataBuffer)>
	//    4    8:areturn         
	}

	protected final DataHolder mDataHolder;
}
