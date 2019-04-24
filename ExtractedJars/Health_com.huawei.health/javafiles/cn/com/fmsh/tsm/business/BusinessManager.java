// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business;

import cn.com.fmsh.communication.CommunicationNotify;
import cn.com.fmsh.communication.core.LinkInfo;
import cn.com.fmsh.script.ApduHandler;
import cn.com.fmsh.tsm.business.core.ErrorCodeHandler;

// Referenced classes of package cn.com.fmsh.tsm.business:
//			BusinessExtend, CardAppInstall, CardAppTrade, LocalDataHandler, 
//			SocketExceptionHandler

public interface BusinessManager
{

	public abstract BusinessExtend getBusinessExtend();

	public abstract CardAppInstall getCardAppInstall();

	public abstract CardAppTrade getCardAppTrade();

	public abstract ErrorCodeHandler getErrorCodeHandler();

	public abstract void registerCommunicationNotify(CommunicationNotify communicationnotify);

	public abstract void registerLocalDataHandler(LocalDataHandler localdatahandler);

	public abstract void setApduHandler(ApduHandler apduhandler);

	public abstract void setLinkInfo(LinkInfo linkinfo);

	public abstract void setMobileInfo(byte abyte0[]);

	public abstract boolean setSecurityCode(byte abyte0[]);

	public abstract void setSocketExceptionHandle(SocketExceptionHandler socketexceptionhandler);

	public abstract boolean setTerminalNumber(byte abyte0[]);
}
