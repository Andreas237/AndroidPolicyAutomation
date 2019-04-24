// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			ByteString, CodedOutputStream

static final class ByteString$CodedBuilder
{

	public ByteString build()
	{
		output.checkNoSpaceLeft();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field CodedOutputStream output>
	//    2    4:invokevirtual   #35  <Method void CodedOutputStream.checkNoSpaceLeft()>
		return ((ByteString) (new ring(buffer)));
	//    3    7:new             #37  <Class ByteString$LiteralByteString>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field byte[] buffer>
	//    7   15:invokespecial   #40  <Method void ByteString$LiteralByteString(byte[])>
	//    8   18:areturn         
	}

	public CodedOutputStream getCodedOutput()
	{
		return output;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field CodedOutputStream output>
	//    2    4:areturn         
	}

	private final byte buffer[];
	private final CodedOutputStream output;

	private ByteString$CodedBuilder(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		buffer = new byte[i];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:newarray        byte[]
	//    5    8:putfield        #18  <Field byte[] buffer>
		output = CodedOutputStream.newInstance(buffer);
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #18  <Field byte[] buffer>
	//    9   16:invokestatic    #24  <Method CodedOutputStream CodedOutputStream.newInstance(byte[])>
	//   10   19:putfield        #26  <Field CodedOutputStream output>
	//   11   22:return          
	}

	ByteString$CodedBuilder(int i, ByteString._cls1 _pcls1)
	{
		this(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #30  <Method void ByteString$CodedBuilder(int)>
	//    3    5:return          
	}
}
