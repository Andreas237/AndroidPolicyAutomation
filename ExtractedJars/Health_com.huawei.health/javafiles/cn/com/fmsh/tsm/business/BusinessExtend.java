// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business;

import cn.com.fmsh.tsm.business.bean.ElectronicAndActivity;
import cn.com.fmsh.tsm.business.bean.ElectronicTakeUp;
import cn.com.fmsh.tsm.business.bean.IdentifyingCode;
import cn.com.fmsh.tsm.business.bean.MainOrder;
import cn.com.fmsh.tsm.business.enums.EnumCardIoType;
import cn.com.fmsh.tsm.business.exception.BusinessException;
import java.util.List;

public interface BusinessExtend
{

	public abstract int applyForElectronicTakeUp(byte abyte0[], byte abyte1[])
		throws BusinessException;

	public abstract MainOrder applyPromotion(byte abyte0[])
		throws BusinessException;

	public abstract IdentifyingCode obtainIdentifyingCode(int i, String s)
		throws BusinessException;

	public abstract ElectronicAndActivity queryActivity(int i, int j)
		throws BusinessException;

	public abstract ElectronicTakeUp queryElectronicTakeUp(byte abyte0[], byte abyte1[])
		throws BusinessException;

	public abstract List queryElectronicTakeUps(byte abyte0[], byte byte0, int i)
		throws BusinessException;

	public abstract List queryElectronicTakeUpsVer2(byte abyte0[], byte abyte1[], int i, int j)
		throws BusinessException;

	public abstract List queryPromotionMessage()
		throws BusinessException;

	public abstract MainOrder useElectronicTakeUp(byte abyte0[], byte abyte1[], byte abyte2[], EnumCardIoType enumcardiotype)
		throws BusinessException;
}
