// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable:
//			Channel

public static interface Channel$GetInputStreamResult
	extends Releasable, Result
{

	public abstract InputStream getInputStream();
}
