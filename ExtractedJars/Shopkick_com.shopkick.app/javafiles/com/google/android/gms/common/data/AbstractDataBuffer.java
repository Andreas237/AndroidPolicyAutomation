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
		DataHolder dataholder = mDataHolder;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DataHolder mDataHolder>
	//    2    4:astore_1        
		if(dataholder == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return dataholder.getCount();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #33  <Method int DataHolder.getCount()>
	//    9   15:ireturn         
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
		DataHolder dataholder = mDataHolder;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DataHolder mDataHolder>
	//    2    4:astore_1        
		return dataholder == null || dataholder.isClosed();
	//    3    5:aload_1         
	//    4    6:ifnull          21
	//    5    9:aload_1         
	//    6   10:invokevirtual   #41  <Method boolean DataHolder.isClosed()>
	//    7   13:ifeq            19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
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
		DataHolder dataholder = mDataHolder;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DataHolder mDataHolder>
	//    2    4:astore_1        
		if(dataholder != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			dataholder.close();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #52  <Method void DataHolder.close()>
	//    7   13:return          
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
