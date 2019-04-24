// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.server;

import java.io.Closeable;

// Referenced classes of package ch.qos.logback.core.net.server:
//			Client

public interface ServerListener
	extends Closeable
{

	public abstract Client acceptClient();

	public abstract void close();
}
