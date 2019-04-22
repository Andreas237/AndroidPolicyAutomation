// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.async;

import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.fasterxml.jackson.core.async:
//			NonBlockingInputFeeder

public interface ByteBufferFeeder
	extends NonBlockingInputFeeder
{

	public abstract void feedInput(ByteBuffer bytebuffer)
		throws IOException;
}
