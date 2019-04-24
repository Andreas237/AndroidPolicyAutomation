// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.card.base;

import cn.com.fmsh.script.ApduHandler;
import cn.com.fmsh.tsm.business.enums.EnumCardAppStatus;
import cn.com.fmsh.tsm.business.exception.BusinessException;
import java.util.List;

public interface CardManager
{

	public abstract byte[] getAid();

	public abstract byte[] getAppNo()
		throws BusinessException;

	public abstract String getFaceID()
		throws BusinessException;

	public abstract String getMOC()
		throws BusinessException;

	public abstract EnumCardAppStatus getStatus()
		throws BusinessException;

	public abstract String getTime4Validity()
		throws BusinessException;

	public abstract boolean isLock4Consume()
		throws BusinessException;

	public abstract boolean isLock4Load()
		throws BusinessException;

	public abstract int queryBalance()
		throws BusinessException;

	public abstract List readAppRecords()
		throws BusinessException;

	public abstract void setApduHandler(ApduHandler apduhandler);
}
