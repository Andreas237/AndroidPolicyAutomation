// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.websocket;

import java.io.*;

// Referenced classes of package com.facebook.stetho.websocket:
//			Frame, WriteCallback

class WriteHandler
{

	public WriteHandler(OutputStream outputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		mBufferedOutput = new BufferedOutputStream(outputstream, 1024);
	//    2    4:aload_0         
	//    3    5:new             #14  <Class BufferedOutputStream>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:sipush          1024
	//    7   13:invokespecial   #17  <Method void BufferedOutputStream(OutputStream, int)>
	//    8   16:putfield        #19  <Field BufferedOutputStream mBufferedOutput>
	//    9   19:return          
	}

	public void write(Frame frame, WriteCallback writecallback)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		try
		{
			frame.writeTo(mBufferedOutput);
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #19  <Field BufferedOutputStream mBufferedOutput>
	//    5    7:invokevirtual   #30  <Method void Frame.writeTo(BufferedOutputStream)>
			mBufferedOutput.flush();
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field BufferedOutputStream mBufferedOutput>
	//    8   14:invokevirtual   #33  <Method void BufferedOutputStream.flush()>
			writecallback.onSuccess();
	//    9   17:aload_2         
	//   10   18:invokeinterface #38  <Method void WriteCallback.onSuccess()>
			break MISSING_BLOCK_LABEL_38;
	//   11   23:goto            38
		}
	//*  12   26:astore_1        
	//*  13   27:goto            41
		// Misplaced declaration of an exception variable
		catch(Frame frame) { }
	//   14   30:astore_1        
		break MISSING_BLOCK_LABEL_31;
		frame;
		break MISSING_BLOCK_LABEL_42;
		writecallback.onFailure(((IOException) (frame)));
	//   15   31:aload_2         
	//   16   32:aload_1         
	//   17   33:invokeinterface #42  <Method void WriteCallback.onFailure(IOException)>
		this;
	//   18   38:aload_0         
		JVM INSTR monitorexit ;
	//   19   39:monitorexit     
		return;
	//   20   40:return          
	//*  21   41:aload_0         
		throw frame;
	//   22   42:monitorexit     
	//   23   43:aload_1         
	//   24   44:athrow          
	}

	private final BufferedOutputStream mBufferedOutput;
}
