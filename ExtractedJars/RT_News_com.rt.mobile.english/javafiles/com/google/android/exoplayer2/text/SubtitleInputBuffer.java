// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

public class SubtitleInputBuffer extends DecoderInputBuffer
{

	public SubtitleInputBuffer()
	{
		super(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #11  <Method void DecoderInputBuffer(int)>
	//    3    5:return          
	}

	public long subsampleOffsetUs;
}
