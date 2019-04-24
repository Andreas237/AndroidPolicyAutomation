// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf:
//			CodedInputStream

class CodedInputStream$StreamDecoder$SkippedDataSink
	implements CodedInputStream.StreamDecoder.RefillCallback
{

	ByteBuffer getSkippedData()
	{
		if(byteArrayStream == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field ByteArrayOutputStream byteArrayStream>
	//*   2    4:ifnonnull       34
		{
			return ByteBuffer.wrap(CodedInputStream.StreamDecoder.access$600(CodedInputStream.StreamDecoder.this), lastPos, CodedInputStream.StreamDecoder.access$500(CodedInputStream.StreamDecoder.this) - lastPos);
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field CodedInputStream$StreamDecoder this$0>
	//    5   11:invokestatic    #40  <Method byte[] CodedInputStream$StreamDecoder.access$600(CodedInputStream$StreamDecoder)>
	//    6   14:aload_0         
	//    7   15:getfield        #31  <Field int lastPos>
	//    8   18:aload_0         
	//    9   19:getfield        #22  <Field CodedInputStream$StreamDecoder this$0>
	//   10   22:invokestatic    #29  <Method int CodedInputStream$StreamDecoder.access$500(CodedInputStream$StreamDecoder)>
	//   11   25:aload_0         
	//   12   26:getfield        #31  <Field int lastPos>
	//   13   29:isub            
	//   14   30:invokestatic    #46  <Method ByteBuffer ByteBuffer.wrap(byte[], int, int)>
	//   15   33:areturn         
		} else
		{
			byteArrayStream.write(CodedInputStream.StreamDecoder.access$600(CodedInputStream.StreamDecoder.this), lastPos, CodedInputStream.StreamDecoder.access$500(CodedInputStream.StreamDecoder.this));
	//   16   34:aload_0         
	//   17   35:getfield        #36  <Field ByteArrayOutputStream byteArrayStream>
	//   18   38:aload_0         
	//   19   39:getfield        #22  <Field CodedInputStream$StreamDecoder this$0>
	//   20   42:invokestatic    #40  <Method byte[] CodedInputStream$StreamDecoder.access$600(CodedInputStream$StreamDecoder)>
	//   21   45:aload_0         
	//   22   46:getfield        #31  <Field int lastPos>
	//   23   49:aload_0         
	//   24   50:getfield        #22  <Field CodedInputStream$StreamDecoder this$0>
	//   25   53:invokestatic    #29  <Method int CodedInputStream$StreamDecoder.access$500(CodedInputStream$StreamDecoder)>
	//   26   56:invokevirtual   #52  <Method void ByteArrayOutputStream.write(byte[], int, int)>
			return ByteBuffer.wrap(byteArrayStream.toByteArray());
	//   27   59:aload_0         
	//   28   60:getfield        #36  <Field ByteArrayOutputStream byteArrayStream>
	//   29   63:invokevirtual   #56  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   30   66:invokestatic    #59  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   31   69:areturn         
		}
	}

	public void onRefill()
	{
		if(byteArrayStream == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field ByteArrayOutputStream byteArrayStream>
	//*   2    4:ifnonnull       18
			byteArrayStream = new ByteArrayOutputStream();
	//    3    7:aload_0         
	//    4    8:new             #48  <Class ByteArrayOutputStream>
	//    5   11:dup             
	//    6   12:invokespecial   #61  <Method void ByteArrayOutputStream()>
	//    7   15:putfield        #36  <Field ByteArrayOutputStream byteArrayStream>
		byteArrayStream.write(CodedInputStream.StreamDecoder.access$600(CodedInputStream.StreamDecoder.this), lastPos, CodedInputStream.StreamDecoder.access$500(CodedInputStream.StreamDecoder.this) - lastPos);
	//    8   18:aload_0         
	//    9   19:getfield        #36  <Field ByteArrayOutputStream byteArrayStream>
	//   10   22:aload_0         
	//   11   23:getfield        #22  <Field CodedInputStream$StreamDecoder this$0>
	//   12   26:invokestatic    #40  <Method byte[] CodedInputStream$StreamDecoder.access$600(CodedInputStream$StreamDecoder)>
	//   13   29:aload_0         
	//   14   30:getfield        #31  <Field int lastPos>
	//   15   33:aload_0         
	//   16   34:getfield        #22  <Field CodedInputStream$StreamDecoder this$0>
	//   17   37:invokestatic    #29  <Method int CodedInputStream$StreamDecoder.access$500(CodedInputStream$StreamDecoder)>
	//   18   40:aload_0         
	//   19   41:getfield        #31  <Field int lastPos>
	//   20   44:isub            
	//   21   45:invokevirtual   #52  <Method void ByteArrayOutputStream.write(byte[], int, int)>
		lastPos = 0;
	//   22   48:aload_0         
	//   23   49:iconst_0        
	//   24   50:putfield        #31  <Field int lastPos>
	//   25   53:return          
	}

	private ByteArrayOutputStream byteArrayStream;
	private int lastPos;
	final CodedInputStream.StreamDecoder this$0;

	private CodedInputStream$StreamDecoder$SkippedDataSink()
	{
		this$0 = CodedInputStream.StreamDecoder.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field CodedInputStream$StreamDecoder this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void Object()>
		lastPos = CodedInputStream.StreamDecoder.access$500(CodedInputStream.StreamDecoder.this);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #22  <Field CodedInputStream$StreamDecoder this$0>
	//    8   14:invokestatic    #29  <Method int CodedInputStream$StreamDecoder.access$500(CodedInputStream$StreamDecoder)>
	//    9   17:putfield        #31  <Field int lastPos>
	//   10   20:return          
	}
}
