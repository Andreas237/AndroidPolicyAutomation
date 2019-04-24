// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import cn.com.fmsh.communication.message.ITag;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;

// Referenced classes of package cn.com.fmsh.tsm.business.bean:
//			BusinessOrder

public class ElectronicTakeUp
{

	public ElectronicTakeUp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:return          
	}

	public static ElectronicTakeUp fromTag(ITag itag)
		throws FMCommunicationMessageException
	{
		Object obj = ((Object) (LogFactory.getInstance().getLog()));
	//    0    0:invokestatic    #44  <Method LogFactory LogFactory.getInstance()>
	//    1    3:invokevirtual   #48  <Method FMLog LogFactory.getLog()>
	//    2    6:astore_3        
		if(itag == null)
	//*   3    7:aload_0         
	//*   4    8:ifnonnull       30
		{
			if(obj != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          28
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), "\u8F6C\u6362Tag\u5BF9\u8C61\u5230\u7535\u5B50\u5377\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A");
	//    7   15:aload_3         
	//    8   16:ldc1            #50  <Class BusinessOrder>
	//    9   18:invokevirtual   #56  <Method String Class.getName()>
	//   10   21:ldc1            #58  <String "\u8F6C\u6362Tag\u5BF9\u8C61\u5230\u7535\u5B50\u5377\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A">
	//   11   23:invokeinterface #64  <Method void FMLog.warn(String, String)>
			return null;
	//   12   28:aconst_null     
	//   13   29:areturn         
		}
		itag = ((ITag) (itag.getItemTags()));
	//   14   30:aload_0         
	//   15   31:invokeinterface #70  <Method ITag[] ITag.getItemTags()>
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
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), " \u8F6C\u6362Tag\u5BF9\u8C61\u5230\u53CD\u9988\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A");
	//   25   51:aload_3         
	//   26   52:ldc1            #50  <Class BusinessOrder>
	//   27   54:invokevirtual   #56  <Method String Class.getName()>
	//   28   57:ldc1            #72  <String " \u8F6C\u6362Tag\u5BF9\u8C61\u5230\u53CD\u9988\u4FE1\u606F\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A">
	//   29   59:invokeinterface #64  <Method void FMLog.warn(String, String)>
			return null;
	//   30   64:aconst_null     
	//   31   65:areturn         
		}
		obj = ((Object) (new ElectronicTakeUp()));
	//   32   66:new             #2   <Class ElectronicTakeUp>
	//   33   69:dup             
	//   34   70:invokespecial   #73  <Method void ElectronicTakeUp()>
	//   35   73:astore_3        
		int j = itag.length;
	//   36   74:aload_0         
	//   37   75:arraylength     
	//   38   76:istore_2        
		for(int i = 0; i < j; i++)
	//*  39   77:iconst_0        
	//*  40   78:istore_1        
	//*  41   79:goto            593
		{
			ITag itag1 = ((ITag) (itag[i]));
	//   42   82:aload_0         
	//   43   83:iload_1         
	//   44   84:aaload          
	//   45   85:astore          4
			switch(itag1.getId())
	//*  46   87:aload           4
	//*  47   89:invokeinterface #77  <Method byte ITag.getId()>
			{
	//*  48   94:lookupswitch    22: default 280
	//	               17: 564
	//	               18: 578
	//	               21: 549
	//	               109: 507
	//	               110: 521
	//	               111: 535
	//	               112: 283
	//	               113: 297
	//	               114: 311
	//	               115: 325
	//	               116: 339
	//	               117: 353
	//	               118: 367
	//	               119: 381
	//	               120: 395
	//	               121: 409
	//	               122: 423
	//	               123: 437
	//	               124: 451
	//	               125: 465
	//	               126: 479
	//	               127: 493
	//*  49  280:goto            589
			case 112: // 'p'
				((ElectronicTakeUp) (obj)).setId(itag1.getBytesVal());
	//   50  283:aload_3         
	//   51  284:aload           4
	//   52  286:invokeinterface #81  <Method byte[] ITag.getBytesVal()>
	//   53  291:invokevirtual   #85  <Method void setId(byte[])>
				break;

	//*  54  294:goto            589
			case 113: // 'q'
				((ElectronicTakeUp) (obj)).setTypeId(itag1.getBytesVal());
	//   55  297:aload_3         
	//   56  298:aload           4
	//   57  300:invokeinterface #81  <Method byte[] ITag.getBytesVal()>
	//   58  305:invokevirtual   #88  <Method void setTypeId(byte[])>
				break;

	//*  59  308:goto            589
			case 114: // 'r'
				((ElectronicTakeUp) (obj)).setNumber(itag1.getStringVal());
	//   60  311:aload_3         
	//   61  312:aload           4
	//   62  314:invokeinterface #91  <Method String ITag.getStringVal()>
	//   63  319:invokevirtual   #95  <Method void setNumber(String)>
				break;

	//*  64  322:goto            589
			case 115: // 's'
				((ElectronicTakeUp) (obj)).setType(itag1.getIntVal());
	//   65  325:aload_3         
	//   66  326:aload           4
	//   67  328:invokeinterface #99  <Method int ITag.getIntVal()>
	//   68  333:invokevirtual   #103 <Method void setType(int)>
				break;

	//*  69  336:goto            589
			case 116: // 't'
				((ElectronicTakeUp) (obj)).setUseType(itag1.getIntVal());
	//   70  339:aload_3         
	//   71  340:aload           4
	//   72  342:invokeinterface #99  <Method int ITag.getIntVal()>
	//   73  347:invokevirtual   #106 <Method void setUseType(int)>
				break;

	//*  74  350:goto            589
			case 117: // 'u'
				((ElectronicTakeUp) (obj)).setTransferFlag(itag1.getIntVal());
	//   75  353:aload_3         
	//   76  354:aload           4
	//   77  356:invokeinterface #99  <Method int ITag.getIntVal()>
	//   78  361:invokevirtual   #109 <Method void setTransferFlag(int)>
				break;

	//*  79  364:goto            589
			case 118: // 'v'
				((ElectronicTakeUp) (obj)).setFrozenFlag(itag1.getIntVal());
	//   80  367:aload_3         
	//   81  368:aload           4
	//   82  370:invokeinterface #99  <Method int ITag.getIntVal()>
	//   83  375:invokevirtual   #112 <Method void setFrozenFlag(int)>
				break;

	//*  84  378:goto            589
			case 119: // 'w'
				((ElectronicTakeUp) (obj)).setUseCount(itag1.getIntVal());
	//   85  381:aload_3         
	//   86  382:aload           4
	//   87  384:invokeinterface #99  <Method int ITag.getIntVal()>
	//   88  389:invokevirtual   #115 <Method void setUseCount(int)>
				break;

	//*  89  392:goto            589
			case 120: // 'x'
				((ElectronicTakeUp) (obj)).setAppType(itag1.getIntVal());
	//   90  395:aload_3         
	//   91  396:aload           4
	//   92  398:invokeinterface #99  <Method int ITag.getIntVal()>
	//   93  403:invokevirtual   #118 <Method void setAppType(int)>
				break;

	//*  94  406:goto            589
			case 121: // 'y'
				((ElectronicTakeUp) (obj)).setState(itag1.getIntVal());
	//   95  409:aload_3         
	//   96  410:aload           4
	//   97  412:invokeinterface #99  <Method int ITag.getIntVal()>
	//   98  417:invokevirtual   #121 <Method void setState(int)>
				break;

	//*  99  420:goto            589
			case 122: // 'z'
				((ElectronicTakeUp) (obj)).setOutState(itag1.getIntVal());
	//  100  423:aload_3         
	//  101  424:aload           4
	//  102  426:invokeinterface #99  <Method int ITag.getIntVal()>
	//  103  431:invokevirtual   #124 <Method void setOutState(int)>
				break;

	//* 104  434:goto            589
			case 123: // '{'
				((ElectronicTakeUp) (obj)).setUseTime(itag1.getStringVal());
	//  105  437:aload_3         
	//  106  438:aload           4
	//  107  440:invokeinterface #91  <Method String ITag.getStringVal()>
	//  108  445:invokevirtual   #127 <Method void setUseTime(String)>
				break;

	//* 109  448:goto            589
			case 124: // '|'
				((ElectronicTakeUp) (obj)).setPrice(itag1.getIntVal());
	//  110  451:aload_3         
	//  111  452:aload           4
	//  112  454:invokeinterface #99  <Method int ITag.getIntVal()>
	//  113  459:invokevirtual   #130 <Method void setPrice(int)>
				break;

	//* 114  462:goto            589
			case 125: // '}'
				((ElectronicTakeUp) (obj)).setPrice4favourable(itag1.getIntVal());
	//  115  465:aload_3         
	//  116  466:aload           4
	//  117  468:invokeinterface #99  <Method int ITag.getIntVal()>
	//  118  473:invokevirtual   #133 <Method void setPrice4favourable(int)>
				break;

	//* 119  476:goto            589
			case 126: // '~'
				((ElectronicTakeUp) (obj)).setOutSerial(itag1.getBytesVal());
	//  120  479:aload_3         
	//  121  480:aload           4
	//  122  482:invokeinterface #81  <Method byte[] ITag.getBytesVal()>
	//  123  487:invokevirtual   #136 <Method void setOutSerial(byte[])>
				break;

	//* 124  490:goto            589
			case 127: // '\177'
				((ElectronicTakeUp) (obj)).setPublishStartTime(itag1.getStringVal());
	//  125  493:aload_3         
	//  126  494:aload           4
	//  127  496:invokeinterface #91  <Method String ITag.getStringVal()>
	//  128  501:invokevirtual   #139 <Method void setPublishStartTime(String)>
				break;

	//* 129  504:goto            589
			case 109: // 'm'
				((ElectronicTakeUp) (obj)).setPublishEndTime(itag1.getStringVal());
	//  130  507:aload_3         
	//  131  508:aload           4
	//  132  510:invokeinterface #91  <Method String ITag.getStringVal()>
	//  133  515:invokevirtual   #142 <Method void setPublishEndTime(String)>
				break;

	//* 134  518:goto            589
			case 110: // 'n'
				((ElectronicTakeUp) (obj)).setStartTime(itag1.getStringVal());
	//  135  521:aload_3         
	//  136  522:aload           4
	//  137  524:invokeinterface #91  <Method String ITag.getStringVal()>
	//  138  529:invokevirtual   #145 <Method void setStartTime(String)>
				break;

	//* 139  532:goto            589
			case 111: // 'o'
				((ElectronicTakeUp) (obj)).setEndTime(itag1.getStringVal());
	//  140  535:aload_3         
	//  141  536:aload           4
	//  142  538:invokeinterface #91  <Method String ITag.getStringVal()>
	//  143  543:invokevirtual   #148 <Method void setEndTime(String)>
				break;

	//* 144  546:goto            589
			case 21: // '\025'
				((ElectronicTakeUp) (obj)).setTradeState(((int) ((byte)itag1.getIntVal())));
	//  145  549:aload_3         
	//  146  550:aload           4
	//  147  552:invokeinterface #99  <Method int ITag.getIntVal()>
	//  148  557:int2byte        
	//  149  558:invokevirtual   #151 <Method void setTradeState(int)>
				break;

	//* 150  561:goto            589
			case 17: // '\021'
				((ElectronicTakeUp) (obj)).setOrder(itag1.getBytesVal());
	//  151  564:aload_3         
	//  152  565:aload           4
	//  153  567:invokeinterface #81  <Method byte[] ITag.getBytesVal()>
	//  154  572:invokevirtual   #154 <Method void setOrder(byte[])>
				break;

	//* 155  575:goto            589
			case 18: // '\022'
				((ElectronicTakeUp) (obj)).setOrderElseThing(itag1.getStringVal());
	//  156  578:aload_3         
	//  157  579:aload           4
	//  158  581:invokeinterface #91  <Method String ITag.getStringVal()>
	//  159  586:invokevirtual   #157 <Method void setOrderElseThing(String)>
				break;
			}
		}

	//  160  589:iload_1         
	//  161  590:iconst_1        
	//  162  591:iadd            
	//  163  592:istore_1        
	//  164  593:iload_1         
	//  165  594:iload_2         
	//  166  595:icmplt          82
		return ((ElectronicTakeUp) (obj));
	//  167  598:aload_3         
	//  168  599:areturn         
	}

	public int getAppType()
	{
		return appType;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field int appType>
	//    2    4:ireturn         
	}

	public String getEndTime()
	{
		return endTime;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field String endTime>
	//    2    4:areturn         
	}

	public int getFrozenFlag()
	{
		return frozenFlag;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field int frozenFlag>
	//    2    4:ireturn         
	}

	public byte[] getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field byte[] id>
	//    2    4:areturn         
	}

	public String getNumber()
	{
		return number;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field String number>
	//    2    4:areturn         
	}

	public byte[] getOrder()
	{
		return order;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field byte[] order>
	//    2    4:areturn         
	}

	public String getOrderElseThing()
	{
		return orderElseThing;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field String orderElseThing>
	//    2    4:areturn         
	}

	public byte[] getOutSerial()
	{
		return outSerial;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field byte[] outSerial>
	//    2    4:areturn         
	}

	public int getOutState()
	{
		return outState;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field int outState>
	//    2    4:ireturn         
	}

	public int getPrice()
	{
		return price;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field int price>
	//    2    4:ireturn         
	}

	public int getPrice4favourable()
	{
		return price4favourable;
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field int price4favourable>
	//    2    4:ireturn         
	}

	public String getPublishEndTime()
	{
		return publishEndTime;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field String publishEndTime>
	//    2    4:areturn         
	}

	public String getPublishStartTime()
	{
		return publishStartTime;
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field String publishStartTime>
	//    2    4:areturn         
	}

	public String getStartTime()
	{
		return startTime;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field String startTime>
	//    2    4:areturn         
	}

	public int getState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field int state>
	//    2    4:ireturn         
	}

	public int getTradeState()
	{
		return tradeState;
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field int tradeState>
	//    2    4:ireturn         
	}

	public int getTransferFlag()
	{
		return transferFlag;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field int transferFlag>
	//    2    4:ireturn         
	}

	public int getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field int type>
	//    2    4:ireturn         
	}

	public byte[] getTypeId()
	{
		return typeId;
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field byte[] typeId>
	//    2    4:areturn         
	}

	public int getUseCount()
	{
		return useCount;
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field int useCount>
	//    2    4:ireturn         
	}

	public String getUseTime()
	{
		return useTime;
	//    0    0:aload_0         
	//    1    1:getfield        #220 <Field String useTime>
	//    2    4:areturn         
	}

	public int getUseType()
	{
		return useType;
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field int useType>
	//    2    4:ireturn         
	}

	public void setAppType(int i)
	{
		appType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #161 <Field int appType>
	//    3    5:return          
	}

	public void setEndTime(String s)
	{
		endTime = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #164 <Field String endTime>
	//    3    5:return          
	}

	public void setFrozenFlag(int i)
	{
		frozenFlag = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #167 <Field int frozenFlag>
	//    3    5:return          
	}

	public void setId(byte abyte0[])
	{
		id = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #169 <Field byte[] id>
	//    3    5:return          
	}

	public void setNumber(String s)
	{
		number = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #172 <Field String number>
	//    3    5:return          
	}

	public void setOrder(byte abyte0[])
	{
		order = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #175 <Field byte[] order>
	//    3    5:return          
	}

	public void setOrderElseThing(String s)
	{
		orderElseThing = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #178 <Field String orderElseThing>
	//    3    5:return          
	}

	public void setOutSerial(byte abyte0[])
	{
		outSerial = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #181 <Field byte[] outSerial>
	//    3    5:return          
	}

	public void setOutState(int i)
	{
		outState = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #184 <Field int outState>
	//    3    5:return          
	}

	public void setPrice(int i)
	{
		price = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #187 <Field int price>
	//    3    5:return          
	}

	public void setPrice4favourable(int i)
	{
		price4favourable = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #190 <Field int price4favourable>
	//    3    5:return          
	}

	public void setPublishEndTime(String s)
	{
		publishEndTime = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #193 <Field String publishEndTime>
	//    3    5:return          
	}

	public void setPublishStartTime(String s)
	{
		publishStartTime = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #196 <Field String publishStartTime>
	//    3    5:return          
	}

	public void setStartTime(String s)
	{
		startTime = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #199 <Field String startTime>
	//    3    5:return          
	}

	public void setState(int i)
	{
		state = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #202 <Field int state>
	//    3    5:return          
	}

	public void setTradeState(int i)
	{
		tradeState = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #205 <Field int tradeState>
	//    3    5:return          
	}

	public void setTransferFlag(int i)
	{
		transferFlag = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #208 <Field int transferFlag>
	//    3    5:return          
	}

	public void setType(int i)
	{
		type = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #211 <Field int type>
	//    3    5:return          
	}

	public void setTypeId(byte abyte0[])
	{
		typeId = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #214 <Field byte[] typeId>
	//    3    5:return          
	}

	public void setUseCount(int i)
	{
		useCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #217 <Field int useCount>
	//    3    5:return          
	}

	public void setUseTime(String s)
	{
		useTime = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #220 <Field String useTime>
	//    3    5:return          
	}

	public void setUseType(int i)
	{
		useType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #223 <Field int useType>
	//    3    5:return          
	}

	private int appType;
	private String endTime;
	private int frozenFlag;
	private byte id[];
	private String number;
	private byte order[];
	private String orderElseThing;
	private byte outSerial[];
	private int outState;
	private int price;
	private int price4favourable;
	private String publishEndTime;
	private String publishStartTime;
	private String startTime;
	private int state;
	private int tradeState;
	private int transferFlag;
	private int type;
	private byte typeId[];
	private int useCount;
	private String useTime;
	private int useType;
}
