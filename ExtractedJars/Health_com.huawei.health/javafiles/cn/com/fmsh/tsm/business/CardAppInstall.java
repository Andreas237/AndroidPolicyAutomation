// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business;

import cn.com.fmsh.tsm.business.bean.CardAppInfo;
import cn.com.fmsh.tsm.business.bean.IssuerPrepareResult;
import cn.com.fmsh.tsm.business.enums.EnumAppManageOperateType;
import cn.com.fmsh.tsm.business.enums.EnumCardAppStatus;
import cn.com.fmsh.tsm.business.enums.EnumCardAppType;
import cn.com.fmsh.tsm.business.enums.EnumCardBusinessOpType;
import cn.com.fmsh.tsm.business.exception.BusinessException;

// Referenced classes of package cn.com.fmsh.tsm.business:
//			IssuerProcessHandler

public interface CardAppInstall
{

	public abstract boolean appletDownload(EnumCardAppType enumcardapptype, byte abyte0[], String s)
		throws BusinessException;

	public abstract boolean applyBusiness(String s, byte abyte0[], String s1, byte abyte1[])
		throws BusinessException;

	public abstract void cancel();

	public abstract CardAppInfo deleteApp(byte abyte0[], EnumCardAppType enumcardapptype, byte abyte1[], String s)
		throws BusinessException;

	public abstract byte[] deleteAppVer1(byte abyte0[], EnumCardAppType enumcardapptype, byte abyte1[], String s)
		throws BusinessException;

	public abstract EnumCardAppStatus getAppIssuerStatus(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract EnumCardAppStatus getAppIssuerStatus4Platform(EnumCardAppType enumcardapptype, String s, byte abyte0[])
		throws BusinessException;

	public abstract boolean issuePrepare(byte abyte0[], String s, byte abyte1[], byte abyte2[], String s1, String s2, byte abyte3[], 
			IssuerPrepareResult issuerprepareresult)
		throws BusinessException;

	public abstract boolean issuePrepareResultSearch(byte abyte0[], IssuerPrepareResult issuerprepareresult)
		throws BusinessException;

	public abstract boolean issuer(byte abyte0[], int i, byte abyte1[], byte abyte2[])
		throws BusinessException;

	public abstract boolean issuerVer2(byte abyte0[], int i, byte abyte1[], byte abyte2[])
		throws BusinessException;

	public abstract byte[] moveApp(byte abyte0[], EnumCardAppType enumcardapptype, byte abyte1[], String s)
		throws BusinessException;

	public abstract int orderExce(byte abyte0[], byte abyte1[])
		throws BusinessException;

	public abstract boolean personlization(String s)
		throws BusinessException;

	public abstract void registerIssuerProcessHandler(IssuerProcessHandler issuerprocesshandler);

	public abstract boolean setApp(byte abyte0[], EnumCardAppType enumcardapptype, byte abyte1[], String s, EnumAppManageOperateType enumappmanageoperatetype)
		throws BusinessException;

	public abstract boolean setAppVer2(byte abyte0[], EnumCardAppType enumcardapptype, byte abyte1[], String s, EnumAppManageOperateType enumappmanageoperatetype)
		throws BusinessException;

	public abstract int setCardBusinessStatus(EnumCardBusinessOpType enumcardbusinessoptype, String s, String s1, int i, byte abyte0[], byte abyte1[], String s2)
		throws BusinessException;

	public abstract int setCardBusinessStatusVer2(EnumCardBusinessOpType enumcardbusinessoptype, String s, String s1, int i, byte abyte0[], byte abyte1[], String s2, 
			byte abyte2[])
		throws BusinessException;

	public abstract boolean writeTicket(String s, byte abyte0[])
		throws BusinessException;
}
