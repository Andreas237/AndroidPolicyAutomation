// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.encoder;

import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.OutputStream;

// Referenced classes of package ch.qos.logback.core.encoder:
//			Encoder

public abstract class EncoderBase extends ContextAwareBase
	implements Encoder
{

	public EncoderBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ContextAwareBase()>
	//    2    4:return          
	}

	public void init(OutputStream outputstream)
	{
		outputStream = outputstream;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field OutputStream outputStream>
	//    3    5:return          
	}

	public boolean isStarted()
	{
		return started;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean started>
	//    2    4:ireturn         
	}

	public void start()
	{
		started = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #24  <Field boolean started>
	//    3    5:return          
	}

	public void stop()
	{
		started = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #24  <Field boolean started>
	//    3    5:return          
	}

	protected OutputStream outputStream;
	protected boolean started;
}
