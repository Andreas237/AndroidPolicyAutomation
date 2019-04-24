// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import java.util.HashMap;

// Referenced classes of package com.comscore.streaming:
//			StreamSenseState

public interface StreamSenseListener
{

	public abstract void onStateChange(StreamSenseState streamsensestate, StreamSenseState streamsensestate1, HashMap hashmap, long l);
}
