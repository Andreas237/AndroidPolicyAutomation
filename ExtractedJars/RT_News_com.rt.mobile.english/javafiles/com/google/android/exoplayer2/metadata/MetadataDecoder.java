// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata;


// Referenced classes of package com.google.android.exoplayer2.metadata:
//			MetadataDecoderException, MetadataInputBuffer, Metadata

public interface MetadataDecoder
{

	public abstract Metadata decode(MetadataInputBuffer metadatainputbuffer)
		throws MetadataDecoderException;
}
