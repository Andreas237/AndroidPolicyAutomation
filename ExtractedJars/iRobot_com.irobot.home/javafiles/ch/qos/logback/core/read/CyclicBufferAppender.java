// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.read;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.helpers.CyclicBuffer;

public class CyclicBufferAppender extends AppenderBase
{

	public CyclicBufferAppender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AppenderBase()>
		maxSize = 512;
	//    2    4:aload_0         
	//    3    5:sipush          512
	//    4    8:putfield        #16  <Field int maxSize>
	//    5   11:return          
	}

	protected void append(Object obj)
	{
		if(!isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #23  <Method boolean isStarted()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			cb.add(obj);
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field CyclicBuffer cb>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #30  <Method void CyclicBuffer.add(Object)>
			return;
	//    8   16:return          
		}
	}

	public Object get(int i)
	{
		if(isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #23  <Method boolean isStarted()>
	//*   2    4:ifeq            16
			return cb.get(i);
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field CyclicBuffer cb>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #36  <Method Object CyclicBuffer.get(int)>
	//    7   15:areturn         
		else
			return ((Object) (null));
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	public int getLength()
	{
		if(isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #23  <Method boolean isStarted()>
	//*   2    4:ifeq            15
			return cb.length();
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field CyclicBuffer cb>
	//    5   11:invokevirtual   #42  <Method int CyclicBuffer.length()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getMaxSize()
	{
		return maxSize;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int maxSize>
	//    2    4:ireturn         
	}

	public void reset()
	{
		cb.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field CyclicBuffer cb>
	//    2    4:invokevirtual   #47  <Method void CyclicBuffer.clear()>
	//    3    7:return          
	}

	public void setMaxSize(int i)
	{
		maxSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #16  <Field int maxSize>
	//    3    5:return          
	}

	public void start()
	{
		cb = new CyclicBuffer(maxSize);
	//    0    0:aload_0         
	//    1    1:new             #27  <Class CyclicBuffer>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field int maxSize>
	//    5    9:invokespecial   #52  <Method void CyclicBuffer(int)>
	//    6   12:putfield        #25  <Field CyclicBuffer cb>
		super.start();
	//    7   15:aload_0         
	//    8   16:invokespecial   #54  <Method void AppenderBase.start()>
	//    9   19:return          
	}

	public void stop()
	{
		cb = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #25  <Field CyclicBuffer cb>
		super.stop();
	//    3    5:aload_0         
	//    4    6:invokespecial   #57  <Method void AppenderBase.stop()>
	//    5    9:return          
	}

	CyclicBuffer cb;
	int maxSize;
}
