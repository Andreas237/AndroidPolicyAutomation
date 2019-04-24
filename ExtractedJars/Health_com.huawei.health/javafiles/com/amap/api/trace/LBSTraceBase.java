// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.trace;

import java.util.List;

// Referenced classes of package com.amap.api.trace:
//			TraceListener, TraceStatusListener

public interface LBSTraceBase
{

	public abstract void destroy();

	public abstract void queryProcessedTrace(int i, List list, int j, TraceListener tracelistener);

	public abstract void setLocationInterval(long l);

	public abstract void setTraceStatusInterval(int i);

	public abstract void startTrace(TraceStatusListener tracestatuslistener);

	public abstract void stopTrace();
}
