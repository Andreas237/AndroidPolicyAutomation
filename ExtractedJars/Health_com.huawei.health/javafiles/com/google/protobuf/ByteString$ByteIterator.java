// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.Iterator;

// Referenced classes of package com.google.protobuf:
//			ByteString

public static interface ByteString$ByteIterator
	extends Iterator
{

	public abstract byte nextByte();
}
