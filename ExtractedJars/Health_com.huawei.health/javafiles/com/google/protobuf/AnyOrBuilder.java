// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			MessageOrBuilder, ByteString

public interface AnyOrBuilder
	extends MessageOrBuilder
{

	public abstract String getTypeUrl();

	public abstract ByteString getTypeUrlBytes();

	public abstract ByteString getValue();
}
