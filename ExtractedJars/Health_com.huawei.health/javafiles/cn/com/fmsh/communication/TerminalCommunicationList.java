// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication;

import cn.com.fmsh.communication.exception.SocketException;

// Referenced classes of package cn.com.fmsh.communication:
//			TerminalCommunication

public interface TerminalCommunicationList
{

	public abstract void disConnect()
		throws SocketException;

	public abstract String[] getNames();

	public abstract TerminalCommunication getTerminalCommunication(String s);

	public abstract void removeTerminalCommunication(String s);
}
