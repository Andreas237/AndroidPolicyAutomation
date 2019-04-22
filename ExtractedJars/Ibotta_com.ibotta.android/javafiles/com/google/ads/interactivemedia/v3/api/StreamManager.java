// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;

import java.util.List;

// Referenced classes of package com.google.ads.interactivemedia.v3.api:
//			BaseManager, AdProgressInfo, CuePoint

public interface StreamManager
	extends BaseManager
{

	public abstract AdProgressInfo getAdProgressInfo();

	public abstract double getContentTimeForStreamTime(double d);

	public abstract List getCuePoints();

	public abstract CuePoint getPreviousCuePointForStreamTime(double d);

	public abstract String getStreamId();

	public abstract double getStreamTimeForContentTime(double d);
}
