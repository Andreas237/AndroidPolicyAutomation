// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;

import java.io.File;

// Referenced classes of package com.bumptech.glide.load:
//			Options

public interface Encoder
{

	public abstract boolean encode(Object obj, File file, Options options);
}
