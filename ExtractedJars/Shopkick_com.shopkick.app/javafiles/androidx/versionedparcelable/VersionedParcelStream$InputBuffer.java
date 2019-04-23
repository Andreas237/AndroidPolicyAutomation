// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.versionedparcelable;

import java.io.*;

// Referenced classes of package androidx.versionedparcelable:
//			VersionedParcelStream

private static class VersionedParcelStream$InputBuffer
{

	final int mFieldId;
	final DataInputStream mInputStream;
	private final int mSize;

	VersionedParcelStream$InputBuffer(int i, int j, DataInputStream datainputstream)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mSize = j;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #21  <Field int mSize>
		mFieldId = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #23  <Field int mFieldId>
		byte abyte0[] = new byte[mSize];
	//    8   14:aload_0         
	//    9   15:getfield        #21  <Field int mSize>
	//   10   18:newarray        byte[]
	//   11   20:astore          4
		datainputstream.readFully(abyte0);
	//   12   22:aload_3         
	//   13   23:aload           4
	//   14   25:invokevirtual   #29  <Method void DataInputStream.readFully(byte[])>
		mInputStream = new DataInputStream(((java.io.InputStream) (new ByteArrayInputStream(abyte0))));
	//   15   28:aload_0         
	//   16   29:new             #25  <Class DataInputStream>
	//   17   32:dup             
	//   18   33:new             #31  <Class ByteArrayInputStream>
	//   19   36:dup             
	//   20   37:aload           4
	//   21   39:invokespecial   #33  <Method void ByteArrayInputStream(byte[])>
	//   22   42:invokespecial   #36  <Method void DataInputStream(java.io.InputStream)>
	//   23   45:putfield        #38  <Field DataInputStream mInputStream>
	//   24   48:return          
	}
}
