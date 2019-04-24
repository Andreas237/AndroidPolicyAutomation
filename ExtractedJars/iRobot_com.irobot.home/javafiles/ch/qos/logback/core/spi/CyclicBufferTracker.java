// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.spi;

import ch.qos.logback.core.helpers.CyclicBuffer;
import java.util.*;

// Referenced classes of package ch.qos.logback.core.spi:
//			AbstractComponentTracker

public class CyclicBufferTracker extends AbstractComponentTracker
{

	public CyclicBufferTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void AbstractComponentTracker()>
		bufferSize = 256;
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:putfield        #17  <Field int bufferSize>
		setMaxComponents(64);
	//    5   11:aload_0         
	//    6   12:bipush          64
	//    7   14:invokevirtual   #21  <Method void setMaxComponents(int)>
	//    8   17:return          
	}

	protected CyclicBuffer buildComponent(String s)
	{
		return new CyclicBuffer(bufferSize);
	//    0    0:new             #26  <Class CyclicBuffer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field int bufferSize>
	//    4    8:invokespecial   #28  <Method void CyclicBuffer(int)>
	//    5   11:areturn         
	}

	protected volatile Object buildComponent(String s)
	{
		return ((Object) (buildComponent(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #33  <Method CyclicBuffer buildComponent(String)>
	//    3    5:areturn         
	}

	public int getBufferSize()
	{
		return bufferSize;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int bufferSize>
	//    2    4:ireturn         
	}

	protected boolean isComponentStale(CyclicBuffer cyclicbuffer)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected volatile boolean isComponentStale(Object obj)
	{
		return isComponentStale((CyclicBuffer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class CyclicBuffer>
	//    3    5:invokevirtual   #41  <Method boolean isComponentStale(CyclicBuffer)>
	//    4    8:ireturn         
	}

	List lingererKeysAsOrderedList()
	{
		return ((List) (new ArrayList(((java.util.Collection) (lingerersMap.keySet())))));
	//    0    0:new             #45  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field LinkedHashMap lingerersMap>
	//    4    8:invokevirtual   #55  <Method java.util.Set LinkedHashMap.keySet()>
	//    5   11:invokespecial   #58  <Method void ArrayList(java.util.Collection)>
	//    6   14:areturn         
	}

	List liveKeysAsOrderedList()
	{
		return ((List) (new ArrayList(((java.util.Collection) (liveMap.keySet())))));
	//    0    0:new             #45  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #63  <Field LinkedHashMap liveMap>
	//    4    8:invokevirtual   #55  <Method java.util.Set LinkedHashMap.keySet()>
	//    5   11:invokespecial   #58  <Method void ArrayList(java.util.Collection)>
	//    6   14:areturn         
	}

	protected void processPriorToRemoval(CyclicBuffer cyclicbuffer)
	{
		cyclicbuffer.clear();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #68  <Method void CyclicBuffer.clear()>
	//    2    4:return          
	}

	protected volatile void processPriorToRemoval(Object obj)
	{
		processPriorToRemoval((CyclicBuffer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class CyclicBuffer>
	//    3    5:invokevirtual   #72  <Method void processPriorToRemoval(CyclicBuffer)>
	//    4    8:return          
	}

	public void setBufferSize(int i)
	{
		bufferSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field int bufferSize>
	//    3    5:return          
	}

	static final int DEFAULT_BUFFER_SIZE = 256;
	static final int DEFAULT_NUMBER_OF_BUFFERS = 64;
	int bufferSize;
}
