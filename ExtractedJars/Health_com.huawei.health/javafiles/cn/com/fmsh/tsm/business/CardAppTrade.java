// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business;

import cn.com.fmsh.tsm.business.bean.BusinessOrder;
import cn.com.fmsh.tsm.business.bean.CardAppInfo;
import cn.com.fmsh.tsm.business.bean.CardBusinessStatus;
import cn.com.fmsh.tsm.business.bean.LoginInfo;
import cn.com.fmsh.tsm.business.bean.MainOrder;
import cn.com.fmsh.tsm.business.bean.PasswordPrompt;
import cn.com.fmsh.tsm.business.bean.PayOrder;
import cn.com.fmsh.tsm.business.bean.PreDepositInfo;
import cn.com.fmsh.tsm.business.bean.Product;
import cn.com.fmsh.tsm.business.bean.TerminalBackInfo;
import cn.com.fmsh.tsm.business.bean.TicketOperateResult;
import cn.com.fmsh.tsm.business.bean.UserInfo;
import cn.com.fmsh.tsm.business.bean.VersionInfo;
import cn.com.fmsh.tsm.business.enums.EnumBusinessOrderType;
import cn.com.fmsh.tsm.business.enums.EnumCardAppType;
import cn.com.fmsh.tsm.business.enums.EnumOrderStatus;
import cn.com.fmsh.tsm.business.enums.EnumOrderType;
import cn.com.fmsh.tsm.business.enums.EnumResultsSortType;
import cn.com.fmsh.tsm.business.enums.EnumUserPlatformType;
import cn.com.fmsh.tsm.business.exception.BusinessException;
import java.util.List;

public interface CardAppTrade
{

	public abstract MainOrder apply4Pay(int i, int j, byte abyte0[], EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract MainOrder applyAct4Pay(byte abyte0[], EnumCardAppType enumcardapptype, byte abyte1[])
		throws BusinessException;

	public abstract TicketOperateResult buyTicket(String s, byte abyte0[])
		throws BusinessException;

	public abstract int deleteTerminalInfoBack(byte abyte0[])
		throws BusinessException;

	public abstract int doRefund(byte abyte0[])
		throws BusinessException;

	public abstract int doUnsolvedOrder(byte abyte0[], byte abyte1[])
		throws BusinessException;

	public abstract byte[] getAppNo(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract Integer getBalance(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract CardAppInfo getCardAppInfo(int i, EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract List getCardAppRecords(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract EnumCardAppType getCardAppType()
		throws BusinessException;

	public abstract List getCardAppTypes()
		throws BusinessException;

	public abstract String getFaceID(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract String getInvoiceToken(byte abyte0[])
		throws BusinessException;

	public abstract List getInvoiceTokenVer3()
		throws BusinessException;

	public abstract String getMOC(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract List getNotices(int i)
		throws BusinessException;

	public abstract String getTime4Validity(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract boolean isLock4Consume(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract boolean isLock4Load(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract boolean isRun4plateform()
		throws BusinessException;

	public abstract LoginInfo login(String s, String s1)
		throws BusinessException;

	public abstract LoginInfo loginVer2(String s, String s1)
		throws BusinessException;

	public abstract LoginInfo loginVer3(String s, String s1, EnumUserPlatformType enumuserplatformtype, String s2)
		throws BusinessException;

	public abstract int logout()
		throws BusinessException;

	public abstract int modifyPassword(String s, String s1)
		throws BusinessException;

	public abstract int modifyUserInfo(UserInfo userinfo)
		throws BusinessException;

	public abstract int modifyUserInfoVer2(UserInfo userinfo)
		throws BusinessException;

	public abstract List queryActivities(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract BusinessOrder queryBusinessOrder(byte abyte0[])
		throws BusinessException;

	public abstract List queryBusinessOrders(int i, int j, EnumCardAppType enumcardapptype, EnumBusinessOrderType enumbusinessordertype, EnumOrderStatus enumorderstatus)
		throws BusinessException;

	public abstract List queryBusinessOrdersVer3(int i, int j, EnumCardAppType enumcardapptype, EnumBusinessOrderType enumbusinessordertype, EnumOrderStatus enumorderstatus, byte abyte0[])
		throws BusinessException;

	public abstract List queryBusinessOrdersVer4(int i, int j, EnumCardAppType enumcardapptype, EnumBusinessOrderType enumbusinessordertype, List list, byte abyte0[])
		throws BusinessException;

	public abstract CardBusinessStatus queryCardBusinessStatus(String s)
		throws BusinessException;

	public abstract List queryConfirmDoubtOrder(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract TicketOperateResult queryLastOperate(String s, String s1, byte abyte0[])
		throws BusinessException;

	public abstract MainOrder queryMainOrder(byte abyte0[])
		throws BusinessException;

	public abstract List queryMainOrders(int i, int j, EnumOrderStatus enumorderstatus, EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract List queryMainOrdersVer4(int i, int j, List list, EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract PayOrder queryPayOrder(byte abyte0[])
		throws BusinessException;

	public abstract List queryPayOrders(int i, int j, EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract List queryPayOrdersVer4(int i, int j, EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract PreDepositInfo queryPreDeposit(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract List queryPreDepositVer2(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract Product queryProduct(String s)
		throws BusinessException;

	public abstract List queryProducts(String s, EnumCardAppType enumcardapptype, byte abyte0[])
		throws BusinessException;

	public abstract List queryTerminalInfoBack(byte abyte0[], byte abyte1[], int i, EnumResultsSortType enumresultssorttype)
		throws BusinessException;

	public abstract List queryUnsolvedOrder(EnumCardAppType enumcardapptype)
		throws BusinessException;

	public abstract UserInfo queryUserInfo(String s)
		throws BusinessException;

	public abstract UserInfo queryUserInfoVer2(String s)
		throws BusinessException;

	public abstract VersionInfo queryVersion()
		throws BusinessException;

	public abstract int register(UserInfo userinfo)
		throws BusinessException;

	public abstract int registerVer2(UserInfo userinfo)
		throws BusinessException;

	public abstract int registerVer3(UserInfo userinfo)
		throws BusinessException;

	public abstract boolean remoteRecharge(byte abyte0[], byte abyte1[])
		throws BusinessException;

	public abstract byte[] rentBusinessHandle(int i, byte abyte0[])
		throws BusinessException;

	public abstract PasswordPrompt retrievePassword(String s)
		throws BusinessException;

	public abstract PasswordPrompt retrievePasswordVer2(String s, byte abyte0[], String s1)
		throws BusinessException;

	public abstract boolean returnBusiness(String s, byte abyte0[])
		throws BusinessException;

	public abstract int setOrderStatus(byte abyte0[], EnumOrderType enumordertype, byte abyte1[], EnumOrderStatus enumorderstatus)
		throws BusinessException;

	public abstract int terminalInfoBack(TerminalBackInfo terminalbackinfo)
		throws BusinessException;

	public abstract byte[] terminalInfoReport(int i, byte abyte0[])
		throws BusinessException;

	public abstract int updateStationInfo()
		throws BusinessException;
}
