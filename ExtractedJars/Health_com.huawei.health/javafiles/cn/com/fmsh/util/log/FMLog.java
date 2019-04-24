// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util.log;


// Referenced classes of package cn.com.fmsh.util.log:
//			Level

public interface FMLog
{

	public abstract void debug(String s, String s1);

	public abstract void error(String s, String s1);

	public abstract boolean getShowLogFlag();

	public abstract Level getShowLogLevel();

	public abstract void info(String s, String s1);

	public abstract void setShowLogFlag(boolean flag);

	public abstract void setShowLogLevel(Level level);

	public abstract void warn(String s, String s1);
}
