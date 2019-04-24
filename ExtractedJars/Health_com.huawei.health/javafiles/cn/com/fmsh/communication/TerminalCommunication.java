// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication;

import cn.com.fmsh.communication.core.CloseSessionRequest;
import cn.com.fmsh.communication.core.LinkInfo;
import cn.com.fmsh.communication.core.TerminalInfo;
import cn.com.fmsh.communication.exception.CommunicationException;
import cn.com.fmsh.communication.exception.SocketException;
import cn.com.fmsh.communication.exception.session.CloseSessionException;
import cn.com.fmsh.communication.exception.session.OpenSessionException;
import cn.com.fmsh.exception.InvalidParameterException;
import java.util.Date;

// Referenced classes of package cn.com.fmsh.communication:
//			CommunicationNotify

public interface TerminalCommunication
{

	public abstract void cancel();

	public abstract boolean closeSession(CloseSessionRequest closesessionrequest)
		throws InvalidParameterException, SocketException, CommunicationException, CloseSessionException;

	public abstract boolean connect(LinkInfo linkinfo)
		throws InvalidParameterException, SocketException;

	public abstract boolean disconnect()
		throws SocketException;

	public abstract Date getLastHeartBeat();

	public abstract byte[] getSessionNumber();

	public abstract long getSessionSerialNumber();

	public abstract boolean isConnect();

	public abstract boolean isOpenSession();

	public abstract boolean lastRequestDataIsNull();

	public abstract boolean openSession(TerminalInfo terminalinfo, boolean flag)
		throws InvalidParameterException, SocketException, CommunicationException, OpenSessionException;

	public abstract void registerCommunicationNotify(CommunicationNotify communicationnotify);

	public abstract byte[] repeat()
		throws SocketException, CommunicationException;

	public abstract int repeatAsynchronous()
		throws InvalidParameterException;

	public abstract byte[] sendMessage(byte abyte0[])
		throws InvalidParameterException, SocketException, CommunicationException;

	public abstract int sendMessageAsynchronous(byte abyte0[])
		throws InvalidParameterException;

	public abstract void setExceptionTryCount(int i);

	public abstract void setInterval4Heartbeat(int i);

	public static final int SERVER_SESSION_TIMEOUT = 0x83d60;
}
