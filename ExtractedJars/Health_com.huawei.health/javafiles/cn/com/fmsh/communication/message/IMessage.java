// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message;

import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;

// Referenced classes of package cn.com.fmsh.communication.message:
//			ITag

public interface IMessage
{

	public abstract int addTag(ITag itag)
		throws FMCommunicationMessageException;

	public abstract int getCode();

	public abstract byte[] getRetCode();

	public abstract ITag getTag4Id(int i)
		throws FMCommunicationMessageException;

	public abstract ITag getTag4Id(int i, int j)
		throws FMCommunicationMessageException;

	public abstract ITag getTag4Index(int i)
		throws FMCommunicationMessageException;

	public abstract int getTagCount();

	public abstract int getTagCount4Id(int i);

	public abstract boolean isValid();

	public abstract void setRetCode(byte abyte0[]);

	public abstract int setVal(ITag itag, int i)
		throws FMCommunicationMessageException;

	public abstract byte[] toBytes()
		throws FMCommunicationMessageException;

	public static final int codeSize = 2;
	public static final int retCodeSize = 2;
}
