// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			QueueFile

public static interface QueueFile$ElementReader
{

	public abstract void read(InputStream inputstream, int i)
		throws IOException;
}
