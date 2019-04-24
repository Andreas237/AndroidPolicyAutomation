// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.Arrays;

// Referenced classes of package com.google.protobuf:
//			ByteString

static final class ByteString$ArraysByteArrayCopier
	implements ByteString.ByteArrayCopier
{

	public byte[] copyFrom(byte abyte0[], int i, int j)
	{
		return Arrays.copyOfRange(abyte0, i, i + j);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iadd            
	//    5    5:invokestatic    #23  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//    6    8:areturn         
	}

	private ByteString$ArraysByteArrayCopier()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	ByteString$ArraysByteArrayCopier(ByteString._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void ByteString$ArraysByteArrayCopier()>
	//    2    4:return          
	}
}
