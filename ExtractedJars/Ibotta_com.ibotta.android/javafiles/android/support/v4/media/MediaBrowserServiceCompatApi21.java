// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;

class MediaBrowserServiceCompatApi21
{
	static class BrowserRoot
	{
	}

	static class ResultWrapper
	{
	}

	public static interface ServiceCompatProxy
	{

		public abstract BrowserRoot onGetRoot(String s, int i, Bundle bundle);

		public abstract void onLoadChildren(String s, ResultWrapper resultwrapper);
	}

}
