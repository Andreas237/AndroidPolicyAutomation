// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;


// Referenced classes of package com.google.android.exoplayer2.source:
//			SequenceableLoader

public interface CompositeSequenceableLoaderFactory
{

	public transient abstract SequenceableLoader createCompositeSequenceableLoader(SequenceableLoader asequenceableloader[]);
}
