// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;


// Referenced classes of package com.google.ads.interactivemedia.v3.api:
//			AdError

public interface AdErrorEvent
{
	public static interface AdErrorListener
	{

		public abstract void onAdError(AdErrorEvent aderrorevent);
	}


	public abstract AdError getError();

	public abstract Object getUserRequestContext();
}
