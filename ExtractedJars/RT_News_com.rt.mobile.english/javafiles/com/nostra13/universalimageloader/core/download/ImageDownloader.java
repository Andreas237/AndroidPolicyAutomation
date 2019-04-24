// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.nostra13.universalimageloader.core.download;

import java.io.IOException;
import java.io.InputStream;

public interface ImageDownloader
{

	public abstract InputStream getStream(String s, Object obj)
		throws IOException;

	// Unreferenced inner class com/nostra13/universalimageloader/core/download/ImageDownloader$Scheme
	/* block-local class not found */
	class Scheme {}

}
