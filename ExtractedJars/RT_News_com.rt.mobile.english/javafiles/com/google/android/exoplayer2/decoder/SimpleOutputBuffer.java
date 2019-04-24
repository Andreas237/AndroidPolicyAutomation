// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.decoder;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.google.android.exoplayer2.decoder:
//			OutputBuffer, SimpleDecoder

public class SimpleOutputBuffer extends OutputBuffer
{

	public SimpleOutputBuffer(SimpleDecoder simpledecoder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void OutputBuffer()>
		owner = simpledecoder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field SimpleDecoder owner>
	//    5    9:return          
	}

	public void clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void OutputBuffer.clear()>
		if(data != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #24  <Field ByteBuffer data>
	//*   4    8:ifnull          19
			data.clear();
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field ByteBuffer data>
	//    7   15:invokevirtual   #29  <Method java.nio.Buffer ByteBuffer.clear()>
	//    8   18:pop             
	//    9   19:return          
	}

	public ByteBuffer init(long l, int i)
	{
		timeUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #35  <Field long timeUs>
		if(data == null || data.capacity() < i)
	//*   3    5:aload_0         
	//*   4    6:getfield        #24  <Field ByteBuffer data>
	//*   5    9:ifnull          23
	//*   6   12:aload_0         
	//*   7   13:getfield        #24  <Field ByteBuffer data>
	//*   8   16:invokevirtual   #39  <Method int ByteBuffer.capacity()>
	//*   9   19:iload_3         
	//*  10   20:icmpge          37
			data = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
	//   11   23:aload_0         
	//   12   24:iload_3         
	//   13   25:invokestatic    #43  <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//   14   28:invokestatic    #49  <Method ByteOrder ByteOrder.nativeOrder()>
	//   15   31:invokevirtual   #53  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   16   34:putfield        #24  <Field ByteBuffer data>
		data.position(0);
	//   17   37:aload_0         
	//   18   38:getfield        #24  <Field ByteBuffer data>
	//   19   41:iconst_0        
	//   20   42:invokevirtual   #57  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   21   45:pop             
		data.limit(i);
	//   22   46:aload_0         
	//   23   47:getfield        #24  <Field ByteBuffer data>
	//   24   50:iload_3         
	//   25   51:invokevirtual   #60  <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   26   54:pop             
		return data;
	//   27   55:aload_0         
	//   28   56:getfield        #24  <Field ByteBuffer data>
	//   29   59:areturn         
	}

	public void release()
	{
		owner.releaseOutputBuffer(((OutputBuffer) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SimpleDecoder owner>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #67  <Method void SimpleDecoder.releaseOutputBuffer(OutputBuffer)>
	//    4    8:return          
	}

	public ByteBuffer data;
	private final SimpleDecoder owner;
}
