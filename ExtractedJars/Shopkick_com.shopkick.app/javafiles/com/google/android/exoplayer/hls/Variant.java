// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.chunk.FormatWrapper;

public final class Variant
	implements FormatWrapper
{

	public Variant(String s, Format format1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		url = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String url>
		format = format1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Format format>
	//    8   14:return          
	}

	public Format getFormat()
	{
		return format;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Format format>
	//    2    4:areturn         
	}

	public final Format format;
	public final String url;
}
