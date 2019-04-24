// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.core;

import cn.com.fmsh.communication.CommunicationNotify;
import cn.com.fmsh.communication.core.LinkInfo;
import cn.com.fmsh.script.ApduHandler;
import cn.com.fmsh.tsm.business.*;

// Referenced classes of package cn.com.fmsh.tsm.business.core:
//			CardBusinessBasic, CardAppInstallImpl, CardAppTradeImpl, BusinessExtendImpl, 
//			ErrorCodeHandler

public class BusinessManagerImpl
	implements BusinessManager
{

	public BusinessManagerImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		cardBusinessBasic = new CardBusinessBasic();
	//    2    4:aload_0         
	//    3    5:new             #20  <Class CardBusinessBasic>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void CardBusinessBasic()>
	//    6   12:putfield        #23  <Field CardBusinessBasic cardBusinessBasic>
		cardAppDownload = new CardAppInstallImpl(cardBusinessBasic);
	//    7   15:aload_0         
	//    8   16:new             #25  <Class CardAppInstallImpl>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #23  <Field CardBusinessBasic cardBusinessBasic>
	//   12   24:invokespecial   #28  <Method void CardAppInstallImpl(CardBusinessBasic)>
	//   13   27:putfield        #30  <Field CardAppInstallImpl cardAppDownload>
		cardTrade = new CardAppTradeImpl(cardBusinessBasic);
	//   14   30:aload_0         
	//   15   31:new             #32  <Class CardAppTradeImpl>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:getfield        #23  <Field CardBusinessBasic cardBusinessBasic>
	//   19   39:invokespecial   #33  <Method void CardAppTradeImpl(CardBusinessBasic)>
	//   20   42:putfield        #35  <Field CardAppTradeImpl cardTrade>
		businessExtend = ((BusinessExtend) (new BusinessExtendImpl(cardBusinessBasic)));
	//   21   45:aload_0         
	//   22   46:new             #37  <Class BusinessExtendImpl>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:getfield        #23  <Field CardBusinessBasic cardBusinessBasic>
	//   26   54:invokespecial   #38  <Method void BusinessExtendImpl(CardBusinessBasic)>
	//   27   57:putfield        #40  <Field BusinessExtend businessExtend>
	//   28   60:return          
	}

	public BusinessExtend getBusinessExtend()
	{
		return businessExtend;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field BusinessExtend businessExtend>
	//    2    4:areturn         
	}

	public CardAppInstall getCardAppInstall()
	{
		return ((CardAppInstall) (cardAppDownload));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field CardAppInstallImpl cardAppDownload>
	//    2    4:areturn         
	}

	public CardAppTrade getCardAppTrade()
	{
		return ((CardAppTrade) (cardTrade));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field CardAppTradeImpl cardTrade>
	//    2    4:areturn         
	}

	public CardBusinessBasic getCardBusinessBasic()
	{
		return cardBusinessBasic;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CardBusinessBasic cardBusinessBasic>
	//    2    4:areturn         
	}

	public ErrorCodeHandler getErrorCodeHandler()
	{
		return cardBusinessBasic.getErrorCodeHandler();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CardBusinessBasic cardBusinessBasic>
	//    2    4:invokevirtual   #53  <Method ErrorCodeHandler CardBusinessBasic.getErrorCodeHandler()>
	//    3    7:areturn         
	}

	public void registerCommunicationNotify(CommunicationNotify communicationnotify)
	{
		cardBusinessBasic.registerCommunicationNotify(communicationnotify);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CardBusinessBasic cardBusinessBasic>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #57  <Method void CardBusinessBasic.registerCommunicationNotify(CommunicationNotify)>
	//    4    8:return          
	}

	public void registerLocalDataHandler(LocalDataHandler localdatahandler)
	{
		cardBusinessBasic.registerLocalDataHandler(localdatahandler);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CardBusinessBasic cardBusinessBasic>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #61  <Method void CardBusinessBasic.registerLocalDataHandler(LocalDataHandler)>
	//    4    8:return          
	}

	public void setApduHandler(ApduHandler apduhandler)
	{
		cardBusinessBasic.setApduHandler(apduhandler);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CardBusinessBasic cardBusinessBasic>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #65  <Method void CardBusinessBasic.setApduHandler(ApduHandler)>
	//    4    8:return          
	}

	public void setLinkInfo(LinkInfo linkinfo)
	{
		cardBusinessBasic.setLinkInfo(linkinfo);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CardBusinessBasic cardBusinessBasic>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #69  <Method void CardBusinessBasic.setLinkInfo(LinkInfo)>
	//    4    8:return          
	}

	public void setMobileInfo(byte abyte0[])
	{
		cardBusinessBasic.setMobileInfo(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CardBusinessBasic cardBusinessBasic>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #73  <Method void CardBusinessBasic.setMobileInfo(byte[])>
	//    4    8:return          
	}

	public boolean setSecurityCode(byte abyte0[])
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          12
			return false;
	//    6   10:iconst_0        
	//    7   11:ireturn         
		if(abyte0[0] != abyte0.length - 1)
	//*   8   12:aload_1         
	//*   9   13:iconst_0        
	//*  10   14:baload          
	//*  11   15:aload_1         
	//*  12   16:arraylength     
	//*  13   17:iconst_1        
	//*  14   18:isub            
	//*  15   19:icmpeq          24
		{
			return false;
	//   16   22:iconst_0        
	//   17   23:ireturn         
		} else
		{
			cardBusinessBasic.setSecurityCode(abyte0);
	//   18   24:aload_0         
	//   19   25:getfield        #23  <Field CardBusinessBasic cardBusinessBasic>
	//   20   28:aload_1         
	//   21   29:invokevirtual   #77  <Method void CardBusinessBasic.setSecurityCode(byte[])>
			return true;
	//   22   32:iconst_1        
	//   23   33:ireturn         
		}
	}

	public void setSocketExceptionHandle(SocketExceptionHandler socketexceptionhandler)
	{
		cardBusinessBasic.setSocketExceptionHandle(socketexceptionhandler);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CardBusinessBasic cardBusinessBasic>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #81  <Method void CardBusinessBasic.setSocketExceptionHandle(SocketExceptionHandler)>
	//    4    8:return          
	}

	public boolean setTerminalNumber(byte abyte0[])
	{
		if(abyte0 == null || abyte0.length != 32)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:bipush          32
	//*   5    8:icmpeq          13
		{
			return false;
	//    6   11:iconst_0        
	//    7   12:ireturn         
		} else
		{
			cardBusinessBasic.setTerminalNumber(abyte0);
	//    8   13:aload_0         
	//    9   14:getfield        #23  <Field CardBusinessBasic cardBusinessBasic>
	//   10   17:aload_1         
	//   11   18:invokevirtual   #84  <Method void CardBusinessBasic.setTerminalNumber(byte[])>
			return true;
	//   12   21:iconst_1        
	//   13   22:ireturn         
		}
	}

	private BusinessExtend businessExtend;
	private CardAppInstallImpl cardAppDownload;
	private CardBusinessBasic cardBusinessBasic;
	private CardAppTradeImpl cardTrade;
}
