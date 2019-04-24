// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message;

import cn.com.fmsh.communication.message.core.Tag;
import cn.com.fmsh.communication.message.enumerate.ETagType;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;

public interface ITag
{

	public abstract int addValue(int i)
		throws FMCommunicationMessageException;

	public abstract int addValue(ITag itag)
		throws FMCommunicationMessageException;

	public abstract int addValue(String s)
		throws FMCommunicationMessageException;

	public abstract int addValue(byte abyte0[])
		throws FMCommunicationMessageException;

	public abstract byte[] getBytesVal()
		throws FMCommunicationMessageException;

	public abstract byte getId();

	public abstract int getIntVal()
		throws FMCommunicationMessageException;

	public abstract byte[] getItemBytesVal(int i)
		throws FMCommunicationMessageException;

	public abstract int getItemCount()
		throws FMCommunicationMessageException;

	public abstract int getItemIntVal(int i)
		throws FMCommunicationMessageException;

	public abstract String getItemStringVal(int i)
		throws FMCommunicationMessageException;

	public abstract int getItemTagID(int i)
		throws FMCommunicationMessageException;

	public abstract ITag getItemTagVal(int i)
		throws FMCommunicationMessageException;

	public abstract ITag[] getItemTags()
		throws FMCommunicationMessageException;

	public abstract ETagType getItemType(int i)
		throws FMCommunicationMessageException;

	public abstract String getStringVal()
		throws FMCommunicationMessageException;

	public abstract byte[] getTagValue();

	public abstract ETagType getType();

	public abstract boolean isValid();

	public abstract int setValue(Tag tag, int i)
		throws FMCommunicationMessageException;

	public abstract byte[] toBytes()
		throws FMCommunicationMessageException;

	public static final int idSize = 1;
}
