// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.gifdecoder;

import java.lang.annotation.Annotation;

class GifFrame
{
	static interface GifDisposalMethod
		extends Annotation
	{
	}


	GifFrame()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:return          
	}

	public static final int DISPOSAL_BACKGROUND = 2;
	public static final int DISPOSAL_NONE = 1;
	public static final int DISPOSAL_PREVIOUS = 3;
	public static final int DISPOSAL_UNSPECIFIED = 0;
	int bufferFrameStart;
	int delay;
	int dispose;
	int ih;
	boolean interlace;
	int iw;
	int ix;
	int iy;
	int lct[];
	int transIndex;
	boolean transparency;
}
