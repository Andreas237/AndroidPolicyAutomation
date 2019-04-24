// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling;

import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.spi.LifeCycle;

public interface RollingPolicy
	extends LifeCycle
{

	public abstract String getActiveFileName();

	public abstract CompressionMode getCompressionMode();

	public abstract void rollover();

	public abstract void setParent(FileAppender fileappender);
}
