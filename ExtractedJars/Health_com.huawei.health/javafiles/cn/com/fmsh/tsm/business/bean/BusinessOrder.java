// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import cn.com.fmsh.communication.message.ITag;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import cn.com.fmsh.tsm.business.enums.*;
import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.Serializable;

public class BusinessOrder
	implements Serializable
{

	public BusinessOrder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
	//    2    4:return          
	}

	public static BusinessOrder fromTag(ITag itag)
		throws FMCommunicationMessageException
	{
		Object obj = ((Object) (LogFactory.getInstance().getLog()));
	//    0    0:invokestatic    #52  <Method LogFactory LogFactory.getInstance()>
	//    1    3:invokevirtual   #56  <Method FMLog LogFactory.getLog()>
	//    2    6:astore_3        
		if(itag == null)
	//*   3    7:aload_0         
	//*   4    8:ifnonnull       30
		{
			if(obj != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          28
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), "Tag\u751F\u6210\u4E1A\u52A1\u8BA2\u5355\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A");
	//    7   15:aload_3         
	//    8   16:ldc1            #2   <Class BusinessOrder>
	//    9   18:invokevirtual   #62  <Method String Class.getName()>
	//   10   21:ldc1            #64  <String "Tag\u751F\u6210\u4E1A\u52A1\u8BA2\u5355\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A">
	//   11   23:invokeinterface #70  <Method void FMLog.warn(String, String)>
			return null;
	//   12   28:aconst_null     
	//   13   29:areturn         
		}
		itag = ((ITag) (itag.getItemTags()));
	//   14   30:aload_0         
	//   15   31:invokeinterface #76  <Method ITag[] ITag.getItemTags()>
	//   16   36:astore_0        
		if(itag == null || itag.length < 1)
	//*  17   37:aload_0         
	//*  18   38:ifnull          47
	//*  19   41:aload_0         
	//*  20   42:arraylength     
	//*  21   43:iconst_1        
	//*  22   44:icmpge          66
		{
			if(obj != null)
	//*  23   47:aload_3         
	//*  24   48:ifnull          64
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), "Tag\u751F\u6210\u4E1A\u52A1\u8BA2\u5355\u65F6\uFF0CTag\u5B50\u9879\u4E3A\u7A7A");
	//   25   51:aload_3         
	//   26   52:ldc1            #2   <Class BusinessOrder>
	//   27   54:invokevirtual   #62  <Method String Class.getName()>
	//   28   57:ldc1            #78  <String "Tag\u751F\u6210\u4E1A\u52A1\u8BA2\u5355\u65F6\uFF0CTag\u5B50\u9879\u4E3A\u7A7A">
	//   29   59:invokeinterface #70  <Method void FMLog.warn(String, String)>
			return null;
	//   30   64:aconst_null     
	//   31   65:areturn         
		}
		obj = ((Object) (new BusinessOrder()));
	//   32   66:new             #2   <Class BusinessOrder>
	//   33   69:dup             
	//   34   70:invokespecial   #79  <Method void BusinessOrder()>
	//   35   73:astore_3        
		int j = itag.length;
	//   36   74:aload_0         
	//   37   75:arraylength     
	//   38   76:istore_2        
		for(int i = 0; i < j; i++)
	//*  39   77:iconst_0        
	//*  40   78:istore_1        
	//*  41   79:goto            531
		{
			ITag itag1 = ((ITag) (itag[i]));
	//   42   82:aload_0         
	//   43   83:iload_1         
	//   44   84:aaload          
	//   45   85:astore          4
			switch(itag1.getId())
	//*  46   87:aload           4
	//*  47   89:invokeinterface #83  <Method byte ITag.getId()>
			{
	//*  48   94:lookupswitch    18: default 248
	//	               -79: 471
	//	               -55: 513
	//	               13: 392
	//	               14: 440
	//	               15: 344
	//	               16: 293
	//	               17: 279
	//	               19: 251
	//	               20: 265
	//	               21: 310
	//	               22: 327
	//	               23: 361
	//	               24: 378
	//	               47: 406
	//	               72: 423
	//	               103: 457
	//	               104: 485
	//	               105: 499
	//*  49  248:goto            527
			case 19: // '\023'
				((BusinessOrder) (obj)).setTradeDate(itag1.getStringVal());
	//   50  251:aload_3         
	//   51  252:aload           4
	//   52  254:invokeinterface #86  <Method String ITag.getStringVal()>
	//   53  259:invokevirtual   #90  <Method void setTradeDate(String)>
				break;

	//*  54  262:goto            527
			case 20: // '\024'
				((BusinessOrder) (obj)).setTradeTime(itag1.getStringVal());
	//   55  265:aload_3         
	//   56  266:aload           4
	//   57  268:invokeinterface #86  <Method String ITag.getStringVal()>
	//   58  273:invokevirtual   #93  <Method void setTradeTime(String)>
				break;

	//*  59  276:goto            527
			case 17: // '\021'
				((BusinessOrder) (obj)).setOrder(itag1.getBytesVal());
	//   60  279:aload_3         
	//   61  280:aload           4
	//   62  282:invokeinterface #97  <Method byte[] ITag.getBytesVal()>
	//   63  287:invokevirtual   #101 <Method void setOrder(byte[])>
				break;

	//*  64  290:goto            527
			case 16: // '\020'
				((BusinessOrder) (obj)).setAmount(FM_Bytes.bytesToInt(itag1.getBytesVal()));
	//   65  293:aload_3         
	//   66  294:aload           4
	//   67  296:invokeinterface #97  <Method byte[] ITag.getBytesVal()>
	//   68  301:invokestatic    #107 <Method int FM_Bytes.bytesToInt(byte[])>
	//   69  304:invokevirtual   #111 <Method void setAmount(int)>
				break;

	//*  70  307:goto            527
			case 21: // '\025'
				((BusinessOrder) (obj)).setTradeState(EnumOrderStatus.getOrderStatus4ID(itag1.getIntVal()));
	//   71  310:aload_3         
	//   72  311:aload           4
	//   73  313:invokeinterface #115 <Method int ITag.getIntVal()>
	//   74  318:invokestatic    #121 <Method EnumOrderStatus EnumOrderStatus.getOrderStatus4ID(int)>
	//   75  321:invokevirtual   #125 <Method void setTradeState(EnumOrderStatus)>
				break;

	//*  76  324:goto            527
			case 22: // '\026'
				((BusinessOrder) (obj)).setSerialNo(FM_Bytes.bytesToInt(itag1.getBytesVal()));
	//   77  327:aload_3         
	//   78  328:aload           4
	//   79  330:invokeinterface #97  <Method byte[] ITag.getBytesVal()>
	//   80  335:invokestatic    #107 <Method int FM_Bytes.bytesToInt(byte[])>
	//   81  338:invokevirtual   #128 <Method void setSerialNo(int)>
				break;

	//*  82  341:goto            527
			case 15: // '\017'
				((BusinessOrder) (obj)).setCardNo(FM_Bytes.hexStringToBytes(itag1.getStringVal()));
	//   83  344:aload_3         
	//   84  345:aload           4
	//   85  347:invokeinterface #86  <Method String ITag.getStringVal()>
	//   86  352:invokestatic    #132 <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//   87  355:invokevirtual   #135 <Method void setCardNo(byte[])>
				break;

	//*  88  358:goto            527
			case 23: // '\027'
				((BusinessOrder) (obj)).setTerminalNo(FM_Bytes.hexStringToBytes(itag1.getStringVal()));
	//   89  361:aload_3         
	//   90  362:aload           4
	//   91  364:invokeinterface #86  <Method String ITag.getStringVal()>
	//   92  369:invokestatic    #132 <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//   93  372:invokevirtual   #138 <Method void setTerminalNo(byte[])>
				break;

	//*  94  375:goto            527
			case 24: // '\030'
				((BusinessOrder) (obj)).setInvoiceStatus(itag1.getIntVal());
	//   95  378:aload_3         
	//   96  379:aload           4
	//   97  381:invokeinterface #115 <Method int ITag.getIntVal()>
	//   98  386:invokevirtual   #141 <Method void setInvoiceStatus(int)>
				break;

	//*  99  389:goto            527
			case 13: // '\r'
				((BusinessOrder) (obj)).setPayChannel(itag1.getIntVal());
	//  100  392:aload_3         
	//  101  393:aload           4
	//  102  395:invokeinterface #115 <Method int ITag.getIntVal()>
	//  103  400:invokevirtual   #144 <Method void setPayChannel(int)>
				break;

	//* 104  403:goto            527
			case 47: // '/'
				((BusinessOrder) (obj)).setCardIoType(EnumCardIoType.getCardIoType(itag1.getIntVal()));
	//  105  406:aload_3         
	//  106  407:aload           4
	//  107  409:invokeinterface #115 <Method int ITag.getIntVal()>
	//  108  414:invokestatic    #150 <Method EnumCardIoType EnumCardIoType.getCardIoType(int)>
	//  109  417:invokevirtual   #154 <Method void setCardIoType(EnumCardIoType)>
				break;

	//* 110  420:goto            527
			case 72: // 'H'
				((BusinessOrder) (obj)).setBusinessOrderType(EnumBusinessOrderType.instance(itag1.getIntVal()));
	//  111  423:aload_3         
	//  112  424:aload           4
	//  113  426:invokeinterface #115 <Method int ITag.getIntVal()>
	//  114  431:invokestatic    #160 <Method EnumBusinessOrderType EnumBusinessOrderType.instance(int)>
	//  115  434:invokevirtual   #164 <Method void setBusinessOrderType(EnumBusinessOrderType)>
				break;

	//* 116  437:goto            527
			case 14: // '\016'
				((BusinessOrder) (obj)).setCardAppType(EnumCardAppType.instance(itag1.getIntVal()));
	//  117  440:aload_3         
	//  118  441:aload           4
	//  119  443:invokeinterface #115 <Method int ITag.getIntVal()>
	//  120  448:invokestatic    #169 <Method EnumCardAppType EnumCardAppType.instance(int)>
	//  121  451:invokevirtual   #173 <Method void setCardAppType(EnumCardAppType)>
				break;

	//* 122  454:goto            527
			case 103: // 'g'
				((BusinessOrder) (obj)).setProduct(itag1.getStringVal());
	//  123  457:aload_3         
	//  124  458:aload           4
	//  125  460:invokeinterface #86  <Method String ITag.getStringVal()>
	//  126  465:invokevirtual   #176 <Method void setProduct(String)>
				break;

	//* 127  468:goto            527
			case -79: 
				((BusinessOrder) (obj)).setSeid(itag1.getBytesVal());
	//  128  471:aload_3         
	//  129  472:aload           4
	//  130  474:invokeinterface #97  <Method byte[] ITag.getBytesVal()>
	//  131  479:invokevirtual   #179 <Method void setSeid(byte[])>
				break;

	//* 132  482:goto            527
			case 104: // 'h'
				((BusinessOrder) (obj)).setDeviceModel(itag1.getStringVal());
	//  133  485:aload_3         
	//  134  486:aload           4
	//  135  488:invokeinterface #86  <Method String ITag.getStringVal()>
	//  136  493:invokevirtual   #182 <Method void setDeviceModel(String)>
				break;

	//* 137  496:goto            527
			case 105: // 'i'
				((BusinessOrder) (obj)).setMainOrder(itag1.getBytesVal());
	//  138  499:aload_3         
	//  139  500:aload           4
	//  140  502:invokeinterface #97  <Method byte[] ITag.getBytesVal()>
	//  141  507:invokevirtual   #185 <Method void setMainOrder(byte[])>
				break;

	//* 142  510:goto            527
			case -55: 
				((BusinessOrder) (obj)).setBusinessOrderLoadType(EnumBusinessOrderLoadType.getBusinessOrderLoadType4ID(itag1.getIntVal()));
	//  143  513:aload_3         
	//  144  514:aload           4
	//  145  516:invokeinterface #115 <Method int ITag.getIntVal()>
	//  146  521:invokestatic    #191 <Method EnumBusinessOrderLoadType EnumBusinessOrderLoadType.getBusinessOrderLoadType4ID(int)>
	//  147  524:invokevirtual   #195 <Method void setBusinessOrderLoadType(EnumBusinessOrderLoadType)>
				break;
			}
		}

	//  148  527:iload_1         
	//  149  528:iconst_1        
	//  150  529:iadd            
	//  151  530:istore_1        
	//  152  531:iload_1         
	//  153  532:iload_2         
	//  154  533:icmplt          82
		return ((BusinessOrder) (obj));
	//  155  536:aload_3         
	//  156  537:areturn         
	}

	public int getAmount()
	{
		return amount;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field int amount>
	//    2    4:ireturn         
	}

	public EnumBusinessOrderLoadType getBusinessOrderLoadType()
	{
		return businessOrderLoadType;
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field EnumBusinessOrderLoadType businessOrderLoadType>
	//    2    4:areturn         
	}

	public EnumBusinessOrderType getBusinessOrderType()
	{
		return businessOrderType;
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field EnumBusinessOrderType businessOrderType>
	//    2    4:areturn         
	}

	public EnumCardAppType getCardAppType()
	{
		return cardAppType;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field EnumCardAppType cardAppType>
	//    2    4:areturn         
	}

	public EnumCardIoType getCardIoType()
	{
		return cardIoType;
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field EnumCardIoType cardIoType>
	//    2    4:areturn         
	}

	public byte[] getCardNo()
	{
		return cardNo;
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field byte[] cardNo>
	//    2    4:areturn         
	}

	public String getDeviceModel()
	{
		return deviceModel;
	//    0    0:aload_0         
	//    1    1:getfield        #220 <Field String deviceModel>
	//    2    4:areturn         
	}

	public int getInvoiceStatus()
	{
		return invoiceStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field int invoiceStatus>
	//    2    4:ireturn         
	}

	public byte[] getMainOrder()
	{
		return mainOrder;
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field byte[] mainOrder>
	//    2    4:areturn         
	}

	public byte[] getOrder()
	{
		return order;
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field byte[] order>
	//    2    4:areturn         
	}

	public int getPayChannel()
	{
		return payChannel;
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field int payChannel>
	//    2    4:ireturn         
	}

	public String getProduct()
	{
		return product;
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field String product>
	//    2    4:areturn         
	}

	public byte[] getSeid()
	{
		return seid;
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field byte[] seid>
	//    2    4:areturn         
	}

	public int getSerialNo()
	{
		return serialNo;
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field int serialNo>
	//    2    4:ireturn         
	}

	public String getTac()
	{
		return tac;
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field String tac>
	//    2    4:areturn         
	}

	public byte[] getTerminalNo()
	{
		return terminalNo;
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field byte[] terminalNo>
	//    2    4:areturn         
	}

	public String getTradeDate()
	{
		return tradeDate;
	//    0    0:aload_0         
	//    1    1:getfield        #250 <Field String tradeDate>
	//    2    4:areturn         
	}

	public EnumOrderStatus getTradeState()
	{
		return tradeState;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field EnumOrderStatus tradeState>
	//    2    4:areturn         
	}

	public String getTradeTime()
	{
		return tradeTime;
	//    0    0:aload_0         
	//    1    1:getfield        #257 <Field String tradeTime>
	//    2    4:areturn         
	}

	public void setAmount(int i)
	{
		amount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #199 <Field int amount>
	//    3    5:return          
	}

	public void setBusinessOrderLoadType(EnumBusinessOrderLoadType enumbusinessorderloadtype)
	{
		businessOrderLoadType = enumbusinessorderloadtype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #203 <Field EnumBusinessOrderLoadType businessOrderLoadType>
	//    3    5:return          
	}

	public void setBusinessOrderType(EnumBusinessOrderType enumbusinessordertype)
	{
		businessOrderType = enumbusinessordertype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #207 <Field EnumBusinessOrderType businessOrderType>
	//    3    5:return          
	}

	public void setCardAppType(EnumCardAppType enumcardapptype)
	{
		cardAppType = enumcardapptype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #211 <Field EnumCardAppType cardAppType>
	//    3    5:return          
	}

	public void setCardIoType(EnumCardIoType enumcardiotype)
	{
		cardIoType = enumcardiotype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #214 <Field EnumCardIoType cardIoType>
	//    3    5:return          
	}

	public void setCardNo(byte abyte0[])
	{
		cardNo = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #217 <Field byte[] cardNo>
	//    3    5:return          
	}

	public void setDeviceModel(String s)
	{
		deviceModel = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #220 <Field String deviceModel>
	//    3    5:return          
	}

	public void setInvoiceStatus(int i)
	{
		invoiceStatus = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #223 <Field int invoiceStatus>
	//    3    5:return          
	}

	public void setMainOrder(byte abyte0[])
	{
		mainOrder = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #226 <Field byte[] mainOrder>
	//    3    5:return          
	}

	public void setOrder(byte abyte0[])
	{
		order = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #229 <Field byte[] order>
	//    3    5:return          
	}

	public void setPayChannel(int i)
	{
		payChannel = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #232 <Field int payChannel>
	//    3    5:return          
	}

	public void setProduct(String s)
	{
		product = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #235 <Field String product>
	//    3    5:return          
	}

	public void setSeid(byte abyte0[])
	{
		seid = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #238 <Field byte[] seid>
	//    3    5:return          
	}

	public void setSerialNo(int i)
	{
		serialNo = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #241 <Field int serialNo>
	//    3    5:return          
	}

	public void setTac(String s)
	{
		tac = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #244 <Field String tac>
	//    3    5:return          
	}

	public void setTerminalNo(byte abyte0[])
	{
		terminalNo = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #247 <Field byte[] terminalNo>
	//    3    5:return          
	}

	public void setTradeDate(String s)
	{
		tradeDate = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #250 <Field String tradeDate>
	//    3    5:return          
	}

	public void setTradeState(EnumOrderStatus enumorderstatus)
	{
		tradeState = enumorderstatus;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #254 <Field EnumOrderStatus tradeState>
	//    3    5:return          
	}

	public void setTradeTime(String s)
	{
		tradeTime = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #257 <Field String tradeTime>
	//    3    5:return          
	}

	private static final long serialVersionUID = 1L;
	private int amount;
	private EnumBusinessOrderLoadType businessOrderLoadType;
	private EnumBusinessOrderType businessOrderType;
	private EnumCardAppType cardAppType;
	private EnumCardIoType cardIoType;
	private byte cardNo[];
	private String deviceModel;
	private int invoiceStatus;
	private byte mainOrder[];
	private byte order[];
	private int payChannel;
	private String product;
	private byte seid[];
	private int serialNo;
	private String tac;
	private byte terminalNo[];
	private String tradeDate;
	private EnumOrderStatus tradeState;
	private String tradeTime;
}
