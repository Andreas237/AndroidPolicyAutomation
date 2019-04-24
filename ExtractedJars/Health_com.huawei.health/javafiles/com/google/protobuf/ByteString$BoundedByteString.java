// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.*;

// Referenced classes of package com.google.protobuf:
//			ByteString

static final class ByteString$BoundedByteString extends ByteString$LiteralByteString
{

	private void readObject(ObjectInputStream objectinputstream)
		throws IOException
	{
		throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
	//    0    0:new             #34  <Class InvalidObjectException>
	//    1    3:dup             
	//    2    4:ldc1            #36  <String "BoundedByteStream instances are not to be serialized directly">
	//    3    6:invokespecial   #39  <Method void InvalidObjectException(String)>
	//    4    9:athrow          
	}

	public byte byteAt(int i)
	{
		checkIndex(i, size());
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #46  <Method int size()>
	//    3    5:invokestatic    #50  <Method void checkIndex(int, int)>
		return bytes[bytesOffset + i];
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field byte[] bytes>
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field int bytesOffset>
	//    8   16:iload_1         
	//    9   17:iadd            
	//   10   18:baload          
	//   11   19:ireturn         
	}

	protected void copyToInternal(byte abyte0[], int i, int j, int k)
	{
		System.arraycopy(((Object) (bytes)), getOffsetIntoBytes() + i, ((Object) (abyte0)), j, k);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field byte[] bytes>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #59  <Method int getOffsetIntoBytes()>
	//    4    8:iload_2         
	//    5    9:iadd            
	//    6   10:aload_1         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:invokestatic    #65  <Method void System.arraycopy(Object, int, Object, int, int)>
	//   10   17:return          
	}

	protected int getOffsetIntoBytes()
	{
		return bytesOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int bytesOffset>
	//    2    4:ireturn         
	}

	public int size()
	{
		return bytesLength;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int bytesLength>
	//    2    4:ireturn         
	}

	Object writeReplace()
	{
		return ((Object) (ByteString.wrap(toByteArray())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method byte[] toByteArray()>
	//    2    4:invokestatic    #75  <Method ByteString ByteString.wrap(byte[])>
	//    3    7:areturn         
	}

	private static final long serialVersionUID = 1L;
	private final int bytesLength;
	private final int bytesOffset;

	ByteString$BoundedByteString(byte abyte0[], int i, int j)
	{
		super(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void ByteString$LiteralByteString(byte[])>
		checkRange(i, i + j, abyte0.length);
	//    3    5:iload_2         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iadd            
	//    7    9:aload_1         
	//    8   10:arraylength     
	//    9   11:invokestatic    #23  <Method int checkRange(int, int, int)>
	//   10   14:pop             
		bytesOffset = i;
	//   11   15:aload_0         
	//   12   16:iload_2         
	//   13   17:putfield        #25  <Field int bytesOffset>
		bytesLength = j;
	//   14   20:aload_0         
	//   15   21:iload_3         
	//   16   22:putfield        #27  <Field int bytesLength>
	//   17   25:return          
	}
}
