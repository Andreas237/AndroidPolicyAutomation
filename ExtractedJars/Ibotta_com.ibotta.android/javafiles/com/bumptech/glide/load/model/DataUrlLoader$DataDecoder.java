// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.model:
//			DataUrlLoader

public static interface DataUrlLoader$DataDecoder
{

	public abstract void close(Object obj)
		throws IOException;

	public abstract Object decode(String s)
		throws IllegalArgumentException;

	public abstract Class getDataClass();
}
