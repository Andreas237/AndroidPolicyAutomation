// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			ByteString

static final class ByteString$SystemByteArrayCopier
	implements ByteString.ByteArrayCopier
{

	public byte[] copyFrom(byte abyte0[], int i, int j)
	{
		byte abyte1[] = new byte[j];
	//    0    0:iload_3         
	//    1    1:newarray        byte[]
	//    2    3:astore          4
		System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte1)), 0, j);
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:aload           4
	//    6    9:iconst_0        
	//    7   10:iload_3         
	//    8   11:invokestatic    #24  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte1;
	//    9   14:aload           4
	//   10   16:areturn         
	}

	private ByteString$SystemByteArrayCopier()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	ByteString$SystemByteArrayCopier(ByteString._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void ByteString$SystemByteArrayCopier()>
	//    2    4:return          
	}
}
