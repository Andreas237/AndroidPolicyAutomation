// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.websocket;

import java.io.*;

// Referenced classes of package com.facebook.stetho.websocket:
//			Frame, ReadCallback, SimpleEndpoint

class ReadHandler
{

	public ReadHandler(InputStream inputstream, SimpleEndpoint simpleendpoint)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ByteArrayOutputStream>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ByteArrayOutputStream()>
	//    6   12:putfield        #20  <Field ByteArrayOutputStream mCurrentPayload>
		mBufferedInput = new BufferedInputStream(inputstream, 1024);
	//    7   15:aload_0         
	//    8   16:new             #22  <Class BufferedInputStream>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:sipush          1024
	//   12   24:invokespecial   #25  <Method void BufferedInputStream(InputStream, int)>
	//   13   27:putfield        #27  <Field BufferedInputStream mBufferedInput>
		mEndpoint = simpleendpoint;
	//   14   30:aload_0         
	//   15   31:aload_2         
	//   16   32:putfield        #29  <Field SimpleEndpoint mEndpoint>
	//   17   35:return          
	}

	public void readLoop(ReadCallback readcallback)
		throws IOException
	{
		Frame frame = new Frame();
	//    0    0:new             #36  <Class Frame>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void Frame()>
	//    3    7:astore_2        
		do
		{
			frame.readFrom(mBufferedInput);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field BufferedInputStream mBufferedInput>
	//    7   13:invokevirtual   #41  <Method void Frame.readFrom(BufferedInputStream)>
			mCurrentPayload.write(frame.payloadData, 0, (int)frame.payloadLen);
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field ByteArrayOutputStream mCurrentPayload>
	//   10   20:aload_2         
	//   11   21:getfield        #45  <Field byte[] Frame.payloadData>
	//   12   24:iconst_0        
	//   13   25:aload_2         
	//   14   26:getfield        #49  <Field long Frame.payloadLen>
	//   15   29:l2i             
	//   16   30:invokevirtual   #53  <Method void ByteArrayOutputStream.write(byte[], int, int)>
			if(frame.fin)
	//*  17   33:aload_2         
	//*  18   34:getfield        #57  <Field boolean Frame.fin>
	//*  19   37:ifeq            68
			{
				byte abyte0[] = mCurrentPayload.toByteArray();
	//   20   40:aload_0         
	//   21   41:getfield        #20  <Field ByteArrayOutputStream mCurrentPayload>
	//   22   44:invokevirtual   #61  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   23   47:astore_3        
				readcallback.onCompleteFrame(frame.opcode, abyte0, abyte0.length);
	//   24   48:aload_1         
	//   25   49:aload_2         
	//   26   50:getfield        #65  <Field byte Frame.opcode>
	//   27   53:aload_3         
	//   28   54:aload_3         
	//   29   55:arraylength     
	//   30   56:invokeinterface #71  <Method void ReadCallback.onCompleteFrame(byte, byte[], int)>
				mCurrentPayload.reset();
	//   31   61:aload_0         
	//   32   62:getfield        #20  <Field ByteArrayOutputStream mCurrentPayload>
	//   33   65:invokevirtual   #74  <Method void ByteArrayOutputStream.reset()>
			}
		} while(frame.opcode != 8);
	//   34   68:aload_2         
	//   35   69:getfield        #65  <Field byte Frame.opcode>
	//   36   72:bipush          8
	//   37   74:icmpne          8
	//   38   77:return          
	}

	private final BufferedInputStream mBufferedInput;
	private final ByteArrayOutputStream mCurrentPayload = new ByteArrayOutputStream();
	private final SimpleEndpoint mEndpoint;
}
