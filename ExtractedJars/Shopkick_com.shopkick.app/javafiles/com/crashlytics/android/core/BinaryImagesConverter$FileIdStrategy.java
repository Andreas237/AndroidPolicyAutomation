// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;
import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//			BinaryImagesConverter

static interface BinaryImagesConverter$FileIdStrategy
{

	public abstract String createId(File file)
		throws IOException;
}