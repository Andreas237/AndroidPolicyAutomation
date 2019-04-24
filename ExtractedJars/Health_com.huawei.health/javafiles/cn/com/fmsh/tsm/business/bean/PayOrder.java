// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import cn.com.fmsh.communication.message.ITag;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import cn.com.fmsh.tsm.business.enums.EnumOrderStatus;
import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;

// Referenced classes of package cn.com.fmsh.tsm.business.bean:
//			BusinessOrder

public class PayOrder
{

	public PayOrder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static PayOrder fromTag(ITag itag)
		throws FMCommunicationMessageException
	{
		Object obj = ((Object) (LogFactory.getInstance().getLog()));
	//    0    0:invokestatic    #32  <Method LogFactory LogFactory.getInstance()>
	//    1    3:invokevirtual   #36  <Method FMLog LogFactory.getLog()>
	//    2    6:astore_3        
		if(itag == null)
	//*   3    7:aload_0         
	//*   4    8:ifnonnull       30
		{
			if(obj != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          28
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), "Tag\u751F\u6210\u652F\u4ED8\u8BA2\u5355\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A");
	//    7   15:aload_3         
	//    8   16:ldc1            #38  <Class BusinessOrder>
	//    9   18:invokevirtual   #44  <Method String Class.getName()>
	//   10   21:ldc1            #46  <String "Tag\u751F\u6210\u652F\u4ED8\u8BA2\u5355\u65F6\uFF0CTag\u5BF9\u8C61\u4E3A\u7A7A">
	//   11   23:invokeinterface #52  <Method void FMLog.warn(String, String)>
			return null;
	//   12   28:aconst_null     
	//   13   29:areturn         
		}
		itag = ((ITag) (itag.getItemTags()));
	//   14   30:aload_0         
	//   15   31:invokeinterface #58  <Method ITag[] ITag.getItemTags()>
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
				((FMLog) (obj)).warn(((Class) (cn/com/fmsh/tsm/business/bean/BusinessOrder)).getName(), "Tag\u751F\u6210\u652F\u4ED8\u8BA2\u5355\u65F6\uFF0CTag\u5B50\u9879\u4E3A\u7A7A");
	//   25   51:aload_3         
	//   26   52:ldc1            #38  <Class BusinessOrder>
	//   27   54:invokevirtual   #44  <Method String Class.getName()>
	//   28   57:ldc1            #60  <String "Tag\u751F\u6210\u652F\u4ED8\u8BA2\u5355\u65F6\uFF0CTag\u5B50\u9879\u4E3A\u7A7A">
	//   29   59:invokeinterface #52  <Method void FMLog.warn(String, String)>
			return null;
	//   30   64:aconst_null     
	//   31   65:areturn         
		}
		obj = ((Object) (new PayOrder()));
	//   32   66:new             #2   <Class PayOrder>
	//   33   69:dup             
	//   34   70:invokespecial   #61  <Method void PayOrder()>
	//   35   73:astore_3        
		int j = itag.length;
	//   36   74:aload_0         
	//   37   75:arraylength     
	//   38   76:istore_2        
		for(int i = 0; i < j; i++)
	//*  39   77:iconst_0        
	//*  40   78:istore_1        
	//*  41   79:goto            312
		{
			ITag itag1 = ((ITag) (itag[i]));
	//   42   82:aload_0         
	//   43   83:iload_1         
	//   44   84:aaload          
	//   45   85:astore          4
			switch(itag1.getId())
	//*  46   87:aload           4
	//*  47   89:invokeinterface #65  <Method byte ITag.getId()>
			{
	//*  48   94:lookupswitch    9: default 176
	//	               2: 269
	//	               13: 283
	//	               16: 221
	//	               18: 255
	//	               19: 179
	//	               20: 193
	//	               21: 238
	//	               105: 297
	//	               106: 207
	//*  49  176:goto            308
			case 19: // '\023'
				((PayOrder) (obj)).setDate(itag1.getStringVal());
	//   50  179:aload_3         
	//   51  180:aload           4
	//   52  182:invokeinterface #68  <Method String ITag.getStringVal()>
	//   53  187:invokevirtual   #72  <Method void setDate(String)>
				break;

	//*  54  190:goto            308
			case 20: // '\024'
				((PayOrder) (obj)).setTime(itag1.getStringVal());
	//   55  193:aload_3         
	//   56  194:aload           4
	//   57  196:invokeinterface #68  <Method String ITag.getStringVal()>
	//   58  201:invokevirtual   #75  <Method void setTime(String)>
				break;

	//*  59  204:goto            308
			case 106: // 'j'
				((PayOrder) (obj)).setId(itag1.getBytesVal());
	//   60  207:aload_3         
	//   61  208:aload           4
	//   62  210:invokeinterface #79  <Method byte[] ITag.getBytesVal()>
	//   63  215:invokevirtual   #83  <Method void setId(byte[])>
				break;

	//*  64  218:goto            308
			case 16: // '\020'
				((PayOrder) (obj)).setAmount(FM_Bytes.bytesToInt(itag1.getBytesVal()));
	//   65  221:aload_3         
	//   66  222:aload           4
	//   67  224:invokeinterface #79  <Method byte[] ITag.getBytesVal()>
	//   68  229:invokestatic    #89  <Method int FM_Bytes.bytesToInt(byte[])>
	//   69  232:invokevirtual   #93  <Method void setAmount(int)>
				break;

	//*  70  235:goto            308
			case 21: // '\025'
				((PayOrder) (obj)).setState(EnumOrderStatus.getOrderStatus4ID(itag1.getIntVal()));
	//   71  238:aload_3         
	//   72  239:aload           4
	//   73  241:invokeinterface #97  <Method int ITag.getIntVal()>
	//   74  246:invokestatic    #103 <Method EnumOrderStatus EnumOrderStatus.getOrderStatus4ID(int)>
	//   75  249:invokevirtual   #107 <Method void setState(EnumOrderStatus)>
				break;

	//*  76  252:goto            308
			case 18: // '\022'
				((PayOrder) (obj)).setThirdPayInfo(itag1.getStringVal());
	//   77  255:aload_3         
	//   78  256:aload           4
	//   79  258:invokeinterface #68  <Method String ITag.getStringVal()>
	//   80  263:invokevirtual   #110 <Method void setThirdPayInfo(String)>
				break;

	//*  81  266:goto            308
			case 2: // '\002'
				((PayOrder) (obj)).setPayUser(itag1.getStringVal());
	//   82  269:aload_3         
	//   83  270:aload           4
	//   84  272:invokeinterface #68  <Method String ITag.getStringVal()>
	//   85  277:invokevirtual   #113 <Method void setPayUser(String)>
				break;

	//*  86  280:goto            308
			case 13: // '\r'
				((PayOrder) (obj)).setChannel(itag1.getIntVal());
	//   87  283:aload_3         
	//   88  284:aload           4
	//   89  286:invokeinterface #97  <Method int ITag.getIntVal()>
	//   90  291:invokevirtual   #116 <Method void setChannel(int)>
				break;

	//*  91  294:goto            308
			case 105: // 'i'
				((PayOrder) (obj)).setMainOrder(itag1.getBytesVal());
	//   92  297:aload_3         
	//   93  298:aload           4
	//   94  300:invokeinterface #79  <Method byte[] ITag.getBytesVal()>
	//   95  305:invokevirtual   #119 <Method void setMainOrder(byte[])>
				break;
			}
		}

	//   96  308:iload_1         
	//   97  309:iconst_1        
	//   98  310:iadd            
	//   99  311:istore_1        
	//  100  312:iload_1         
	//  101  313:iload_2         
	//  102  314:icmplt          82
		return ((PayOrder) (obj));
	//  103  317:aload_3         
	//  104  318:areturn         
	}

	public int getAmount()
	{
		return amount;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field int amount>
	//    2    4:ireturn         
	}

	public int getChannel()
	{
		return channel;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field int channel>
	//    2    4:ireturn         
	}

	public String getDate()
	{
		return date;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field String date>
	//    2    4:areturn         
	}

	public byte[] getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field byte[] id>
	//    2    4:areturn         
	}

	public byte[] getMainOrder()
	{
		return mainOrder;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field byte[] mainOrder>
	//    2    4:areturn         
	}

	public String getPayUser()
	{
		return payUser;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field String payUser>
	//    2    4:areturn         
	}

	public EnumOrderStatus getState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field EnumOrderStatus state>
	//    2    4:areturn         
	}

	public String getThirdPayInfo()
	{
		return thirdPayInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field String thirdPayInfo>
	//    2    4:areturn         
	}

	public String getTime()
	{
		return time;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field String time>
	//    2    4:areturn         
	}

	public void setAmount(int i)
	{
		amount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #123 <Field int amount>
	//    3    5:return          
	}

	public void setChannel(int i)
	{
		channel = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #126 <Field int channel>
	//    3    5:return          
	}

	public void setDate(String s)
	{
		date = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #129 <Field String date>
	//    3    5:return          
	}

	public void setId(byte abyte0[])
	{
		id = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #131 <Field byte[] id>
	//    3    5:return          
	}

	public void setMainOrder(byte abyte0[])
	{
		mainOrder = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #134 <Field byte[] mainOrder>
	//    3    5:return          
	}

	public void setPayUser(String s)
	{
		payUser = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #137 <Field String payUser>
	//    3    5:return          
	}

	public void setState(EnumOrderStatus enumorderstatus)
	{
		state = enumorderstatus;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #141 <Field EnumOrderStatus state>
	//    3    5:return          
	}

	public void setThirdPayInfo(String s)
	{
		thirdPayInfo = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #144 <Field String thirdPayInfo>
	//    3    5:return          
	}

	public void setTime(String s)
	{
		time = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #147 <Field String time>
	//    3    5:return          
	}

	private int amount;
	private int channel;
	private String date;
	private byte id[];
	private byte mainOrder[];
	private String payUser;
	private EnumOrderStatus state;
	private String thirdPayInfo;
	private String time;
}
