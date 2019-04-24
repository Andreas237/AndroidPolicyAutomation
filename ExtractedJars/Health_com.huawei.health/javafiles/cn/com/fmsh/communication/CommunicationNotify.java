// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication;

import cn.com.fmsh.FM_Exception;

public interface CommunicationNotify
{

	public abstract void exceptionNotify(FM_Exception fm_exception, Class class1);

	public abstract void heartbeatNoReponseNotify();

	public abstract void newsNotify();

	public abstract void reponseMessageNotify(byte abyte0[]);
}
