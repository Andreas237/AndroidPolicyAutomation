// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message;

import cn.com.fmsh.communication.message.core.Tag;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import java.io.InputStream;

// Referenced classes of package cn.com.fmsh.communication.message:
//			IMessage, ITag

public interface IMessageHandler
{

	public abstract IMessage createMessage(int i);

	public abstract IMessage createMessage(int i, byte abyte0[])
		throws FMCommunicationMessageException;

	public abstract IMessage createMessage(byte abyte0[])
		throws FMCommunicationMessageException;

	public abstract IMessage createMessageAndRetCode(int i, byte abyte0[])
		throws FMCommunicationMessageException;

	public abstract IMessage createMessageAndRetCode(byte abyte0[])
		throws FMCommunicationMessageException;

	public abstract ITag createTag(byte byte0);

	public abstract ITag createTag(byte byte0, byte abyte0[])
		throws FMCommunicationMessageException;

	public abstract Tag createTag(byte abyte0[])
		throws FMCommunicationMessageException;

	public abstract boolean isLoad();

	public abstract int loadDefine(InputStream inputstream)
		throws FMCommunicationMessageException;
}
