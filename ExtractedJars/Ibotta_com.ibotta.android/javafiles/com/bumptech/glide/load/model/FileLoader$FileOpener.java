// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import java.io.*;

// Referenced classes of package com.bumptech.glide.load.model:
//			FileLoader

public static interface FileLoader$FileOpener
{

	public abstract void close(Object obj)
		throws IOException;

	public abstract Class getDataClass();

	public abstract Object open(File file)
		throws FileNotFoundException;
}
