// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming.plugin;

import com.comscore.streaming.StreamSenseEventType;
import com.comscore.streaming.StreamSenseState;
import java.util.HashMap;

public interface StreamSensePluginListener
{

	public abstract void onGetLabels(StreamSenseEventType streamsenseeventtype, HashMap hashmap);

	public abstract void onPostStateChange(StreamSenseState streamsensestate);

	public abstract boolean onPreStateChange(StreamSenseState streamsensestate, StreamSenseEventType streamsenseeventtype, boolean flag);
}
