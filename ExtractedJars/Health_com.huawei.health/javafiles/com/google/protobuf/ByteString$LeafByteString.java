// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.Iterator;

// Referenced classes of package com.google.protobuf:
//			ByteString

static abstract class ByteString$LeafByteString extends ByteString
{

	abstract boolean equalsRange(ByteString bytestring, int i, int j);

	protected final int getTreeDepth()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected final boolean isBalanced()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile Iterator iterator()
	{
		return ((Iterator) (super.iterator()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method ByteString$ByteIterator ByteString.iterator()>
	//    2    4:areturn         
	}

	ByteString$LeafByteString()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void ByteString()>
	//    2    4:return          
	}
}
