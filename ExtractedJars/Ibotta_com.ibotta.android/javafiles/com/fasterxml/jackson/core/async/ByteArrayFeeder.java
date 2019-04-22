// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.async;

import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.core.async:
//			NonBlockingInputFeeder

public interface ByteArrayFeeder
	extends NonBlockingInputFeeder
{

	public abstract void feedInput(byte abyte0[], int i, int j)
		throws IOException;
}
