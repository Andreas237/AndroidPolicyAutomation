// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.script;

import cn.com.fmsh.script.bean.ApduReponseList;
import cn.com.fmsh.script.bean.ApduRequestList;
import cn.com.fmsh.script.exception.FMScriptHandleException;

// Referenced classes of package cn.com.fmsh.script:
//			ApduFilterDataInit, ApduHandler

public interface ScriptHandler
{

	public abstract void cancel();

	public abstract ApduReponseList execute(ApduRequestList apdurequestlist)
		throws FMScriptHandleException;

	public abstract byte[] execute(byte abyte0[])
		throws FMScriptHandleException;

	public abstract void setApduFilterDataInit(ApduFilterDataInit apdufilterdatainit);

	public abstract void setApduHandler(ApduHandler apduhandler);
}
