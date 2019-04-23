// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.api:
//			Response

public class DataBufferResponse extends Response
	implements DataBuffer
{

	public DataBufferResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Response()>
	//    2    4:return          
	}

	public DataBufferResponse(AbstractDataBuffer abstractdatabuffer)
	{
		super(((Result) (abstractdatabuffer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void Response(Result)>
	//    3    5:return          
	}

	public void close()
	{
		((AbstractDataBuffer)getResult()).close();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Result getResult()>
	//    2    4:checkcast       #29  <Class AbstractDataBuffer>
	//    3    7:invokevirtual   #31  <Method void AbstractDataBuffer.close()>
	//    4   10:return          
	}

	public Object get(int i)
	{
		return ((AbstractDataBuffer)getResult()).get(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Result getResult()>
	//    2    4:checkcast       #29  <Class AbstractDataBuffer>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #35  <Method Object AbstractDataBuffer.get(int)>
	//    5   11:areturn         
	}

	public int getCount()
	{
		return ((AbstractDataBuffer)getResult()).getCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Result getResult()>
	//    2    4:checkcast       #29  <Class AbstractDataBuffer>
	//    3    7:invokevirtual   #40  <Method int AbstractDataBuffer.getCount()>
	//    4   10:ireturn         
	}

	public Bundle getMetadata()
	{
		return ((AbstractDataBuffer)getResult()).getMetadata();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Result getResult()>
	//    2    4:checkcast       #29  <Class AbstractDataBuffer>
	//    3    7:invokevirtual   #44  <Method Bundle AbstractDataBuffer.getMetadata()>
	//    4   10:areturn         
	}

	public boolean isClosed()
	{
		return ((AbstractDataBuffer)getResult()).isClosed();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Result getResult()>
	//    2    4:checkcast       #29  <Class AbstractDataBuffer>
	//    3    7:invokevirtual   #48  <Method boolean AbstractDataBuffer.isClosed()>
	//    4   10:ireturn         
	}

	public Iterator iterator()
	{
		return ((AbstractDataBuffer)getResult()).iterator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Result getResult()>
	//    2    4:checkcast       #29  <Class AbstractDataBuffer>
	//    3    7:invokevirtual   #52  <Method Iterator AbstractDataBuffer.iterator()>
	//    4   10:areturn         
	}

	public void release()
	{
		((AbstractDataBuffer)getResult()).release();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Result getResult()>
	//    2    4:checkcast       #29  <Class AbstractDataBuffer>
	//    3    7:invokevirtual   #56  <Method void AbstractDataBuffer.release()>
	//    4   10:return          
	}

	public Iterator singleRefIterator()
	{
		return ((AbstractDataBuffer)getResult()).singleRefIterator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Result getResult()>
	//    2    4:checkcast       #29  <Class AbstractDataBuffer>
	//    3    7:invokevirtual   #59  <Method Iterator AbstractDataBuffer.singleRefIterator()>
	//    4   10:areturn         
	}
}
