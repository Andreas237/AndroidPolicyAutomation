// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			TsPayloadReader

public static interface TsPayloadReader$Factory
{

	public abstract SparseArray createInitialPayloadReaders();

	public abstract TsPayloadReader createPayloadReader(int i, TsPayloadReader.EsInfo esinfo);
}
