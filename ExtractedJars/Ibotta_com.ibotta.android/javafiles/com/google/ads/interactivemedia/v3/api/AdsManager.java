// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;

import java.util.List;

// Referenced classes of package com.google.ads.interactivemedia.v3.api:
//			BaseManager

public interface AdsManager
	extends BaseManager
{

	public abstract void discardAdBreak();

	public abstract List getAdCuePoints();

	public abstract void pause();

	public abstract void requestNextAdBreak();

	public abstract void resume();

	public abstract void skip();

	public abstract void start();
}
