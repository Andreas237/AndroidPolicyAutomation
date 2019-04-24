// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.libs;

import cn.com.fmsh.script.ApduHandler;
import cn.com.fmsh.tsm.business.bean.*;
import cn.com.fmsh.tsm.business.enums.*;
import cn.com.fmsh.tsm.business.exception.BusinessException;
import cn.com.fmsh.util.log.FMLog;
import java.util.List;

public interface NfcosClientManager
{

	public abstract int appletDownload(EnumCardAppType enumcardapptype, byte abyte0[], String s)
		throws BusinessException;

	public abstract MainOrder apply4Pay(EnumCardAppType enumcardapptype, int i, int j, byte abyte0[])
		throws BusinessException;

	public abstract MainOrder apply4PayEx(EnumCardAppType enumcardapptype, int i, int j, byte abyte0[], byte abyte1[])
		throws BusinessException;

	public abstract MainOrder applyIssue(EnumCardAppType enumcardapptype, int i, int j, byte abyte0[], String s, byte abyte1[])
		throws BusinessException;

	public abstract MainOrder applyIssueByProduct(EnumCardAppType enumcardapptype, String s, int i, byte abyte0[], String s1, byte abyte1[])
		throws BusinessException;

	public abstract MainOrder applyPromotion(byte abyte0[])
		throws BusinessException;

	public abstract int cancelIssue(int i)
		throws BusinessException;

	public abstract int closeApp(byte abyte0[], EnumCardAppType enumcardapptype, byte abyte1[], String s)
		throws BusinessException;

	public abstract CardAppInfo deleteApp(byte abyte0[], EnumCardAppType enumcardapptype, byte abyte1[], String s)
		throws BusinessException;

	public abstract int doIssue(byte abyte0[], int i, byte abyte1[], byte abyte2[])
		throws BusinessException;

	public abstract int doRefund(byte abyte0[])
		throws BusinessException;

	public abstract int doUnsolvedOrder(byte abyte0[], byte abyte1[])
		throws BusinessException;

	public abstract EnumCardAppStatus getAppStatus4Platform(EnumCardAppType enumcardapptype, byte abyte0[], String s)
		throws BusinessException;

	public abstract CardAppInfo getCardAppInfo(int i, EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract EnumCardAppStatus getCardAppStatus(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract String getInvoiceToken(byte abyte0[])
		throws BusinessException;

	public abstract List getInvoiceTokens()
		throws BusinessException;

	public abstract LoginInfo login(String s, String s1)
		throws BusinessException;

	public abstract LoginInfo login4third(String s, String s1, EnumUserPlatformType enumuserplatformtype, String s2)
		throws BusinessException;

	public abstract int logout()
		throws BusinessException;

	public abstract int modifyPassword(String s, String s1)
		throws BusinessException;

	public abstract byte[] moveApp(byte abyte0[], EnumCardAppType enumcardapptype, byte abyte1[], String s)
		throws BusinessException;

	public abstract int openApp(byte abyte0[], EnumCardAppType enumcardapptype, byte abyte1[], String s)
		throws BusinessException;

	public abstract int orderExec(byte abyte0[], byte abyte1[])
		throws BusinessException;

	public abstract List queryActivities(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract List queryActivities(EnumCardAppType enumcardapptype, String s)
		throws BusinessException;

	public abstract List queryBlance4PreDeposit(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract BusinessOrder queryBusinessOrder(byte abyte0[])
		throws BusinessException;

	public abstract List queryBusinessOrders(int i, int j, EnumCardAppType enumcardapptype, EnumBusinessOrderType enumbusinessordertype, List list, byte abyte0[])
		throws BusinessException;

	public abstract MainOrder queryMainOrder(byte abyte0[])
		throws BusinessException;

	public abstract List queryMainOrders(int i, int j, EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract PayOrder queryPayOrder(byte abyte0[])
		throws BusinessException;

	public abstract List queryProducts(String s, EnumCardAppType enumcardapptype, String s1, String s2)
		throws BusinessException;

	public abstract List queryPromotionMessage()
		throws BusinessException;

	public abstract int recharge(byte abyte0[], byte abyte1[])
		throws BusinessException;

	public abstract int register(String s, String s1)
		throws BusinessException;

	public abstract void registerApduHandler(ApduHandler apduhandler);

	public abstract void registerLogHandle(FMLog fmlog);

	public abstract byte[] rentBusinessHandle(int i, byte abyte0[])
		throws BusinessException;

	public abstract int terminalFeedback(TerminalBackInfo terminalbackinfo)
		throws BusinessException;
}
