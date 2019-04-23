// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor:
//			ExtractorInput

public interface TrackOutput
{

	public abstract void format(MediaFormat mediaformat);

	public abstract int sampleData(ExtractorInput extractorinput, int i, boolean flag)
		throws IOException, InterruptedException;

	public abstract void sampleData(ParsableByteArray parsablebytearray, int i);

	public abstract void sampleMetadata(long l, int i, int j, int k, byte abyte0[]);
}
