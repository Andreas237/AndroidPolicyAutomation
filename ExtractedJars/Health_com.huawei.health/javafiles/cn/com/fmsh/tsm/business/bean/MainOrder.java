// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import cn.com.fmsh.communication.message.ITag;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import cn.com.fmsh.tsm.business.enums.EnumBusinessOrderLoadType;
import cn.com.fmsh.tsm.business.enums.EnumOrderStatus;
import cn.com.fmsh.util.FM_Bytes;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package cn.com.fmsh.tsm.business.bean:
//			BusinessOrder, PayOrder

public class MainOrder
{

	public MainOrder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		businessOrders = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #26  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void ArrayList()>
	//    6   12:putfield        #29  <Field List businessOrders>
		payOrders = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #26  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #27  <Method void ArrayList()>
	//   11   23:putfield        #31  <Field List payOrders>
	//   12   26:return          
	}

	public static MainOrder fromTag(ITag itag)
		throws FMCommunicationMessageException
	{
		if(itag == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		itag = ((ITag) (itag.getItemTags()));
	//    4    6:aload_0         
	//    5    7:invokeinterface #42  <Method ITag[] ITag.getItemTags()>
	//    6   12:astore_0        
		if(itag == null || itag.length < 1)
	//*   7   13:aload_0         
	//*   8   14:ifnull          23
	//*   9   17:aload_0         
	//*  10   18:arraylength     
	//*  11   19:iconst_1        
	//*  12   20:icmpge          25
			return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
		MainOrder mainorder = new MainOrder();
	//   15   25:new             #2   <Class MainOrder>
	//   16   28:dup             
	//   17   29:invokespecial   #43  <Method void MainOrder()>
	//   18   32:astore          5
		int l = itag.length;
	//   19   34:aload_0         
	//   20   35:arraylength     
	//   21   36:istore_3        
		for(int i = 0; i < l; i++)
	//*  22   37:iconst_0        
	//*  23   38:istore_1        
	//*  24   39:goto            359
		{
			ITag aitag[] = ((ITag []) (itag[i]));
	//   25   42:aload_0         
	//   26   43:iload_1         
	//   27   44:aaload          
	//   28   45:astore          6
			switch(((ITag) (aitag)).getId())
	//*  29   47:aload           6
	//*  30   49:invokeinterface #47  <Method byte ITag.getId()>
			{
			default:
				break;

	//*  31   54:lookupswitch    8: default 128
	//	               -55: 212
	//	               16: 176
	//	               19: 131
	//	               20: 146
	//	               21: 194
	//	               27: 230
	//	               100: 294
	//	               105: 161
	//*  32  128:goto            355
			case 19: // '\023'
				mainorder.setDate(((ITag) (aitag)).getStringVal());
	//   33  131:aload           5
	//   34  133:aload           6
	//   35  135:invokeinterface #51  <Method String ITag.getStringVal()>
	//   36  140:invokevirtual   #55  <Method void setDate(String)>
				break;
	//   37  143:goto            355

			case 20: // '\024'
				mainorder.setTime(((ITag) (aitag)).getStringVal());
	//   38  146:aload           5
	//   39  148:aload           6
	//   40  150:invokeinterface #51  <Method String ITag.getStringVal()>
	//   41  155:invokevirtual   #58  <Method void setTime(String)>
				break;
	//   42  158:goto            355

			case 105: // 'i'
				mainorder.setId(((ITag) (aitag)).getBytesVal());
	//   43  161:aload           5
	//   44  163:aload           6
	//   45  165:invokeinterface #62  <Method byte[] ITag.getBytesVal()>
	//   46  170:invokevirtual   #66  <Method void setId(byte[])>
				break;
	//   47  173:goto            355

			case 16: // '\020'
				mainorder.setAmount(FM_Bytes.bytesToInt(((ITag) (aitag)).getBytesVal()));
	//   48  176:aload           5
	//   49  178:aload           6
	//   50  180:invokeinterface #62  <Method byte[] ITag.getBytesVal()>
	//   51  185:invokestatic    #72  <Method int FM_Bytes.bytesToInt(byte[])>
	//   52  188:invokevirtual   #76  <Method void setAmount(int)>
				break;
	//   53  191:goto            355

			case 21: // '\025'
				mainorder.setState(EnumOrderStatus.getOrderStatus4ID(((ITag) (aitag)).getIntVal()));
	//   54  194:aload           5
	//   55  196:aload           6
	//   56  198:invokeinterface #80  <Method int ITag.getIntVal()>
	//   57  203:invokestatic    #86  <Method EnumOrderStatus EnumOrderStatus.getOrderStatus4ID(int)>
	//   58  206:invokevirtual   #90  <Method void setState(EnumOrderStatus)>
				break;
	//   59  209:goto            355

			case -55: 
				mainorder.setBusinessOrderLoadType(EnumBusinessOrderLoadType.getBusinessOrderLoadType4ID(((ITag) (aitag)).getIntVal()));
	//   60  212:aload           5
	//   61  214:aload           6
	//   62  216:invokeinterface #80  <Method int ITag.getIntVal()>
	//   63  221:invokestatic    #96  <Method EnumBusinessOrderLoadType EnumBusinessOrderLoadType.getBusinessOrderLoadType4ID(int)>
	//   64  224:invokevirtual   #100 <Method void setBusinessOrderLoadType(EnumBusinessOrderLoadType)>
				break;
	//   65  227:goto            355

			case 27: // '\033'
				aitag = ((ITag) (aitag)).getItemTags();
	//   66  230:aload           6
	//   67  232:invokeinterface #42  <Method ITag[] ITag.getItemTags()>
	//   68  237:astore          6
				if(aitag == null || aitag.length <= 0)
					break;
	//   69  239:aload           6
	//   70  241:ifnull          355
	//   71  244:aload           6
	//   72  246:arraylength     
	//   73  247:ifle            355
				int i1 = aitag.length;
	//   74  250:aload           6
	//   75  252:arraylength     
	//   76  253:istore          4
				for(int j = 0; j < i1; j++)
	//*  77  255:iconst_0        
	//*  78  256:istore_2        
	//*  79  257:goto            285
				{
					BusinessOrder businessorder = BusinessOrder.fromTag(aitag[j]);
	//   80  260:aload           6
	//   81  262:iload_2         
	//   82  263:aaload          
	//   83  264:invokestatic    #105 <Method BusinessOrder BusinessOrder.fromTag(ITag)>
	//   84  267:astore          7
					if(businessorder != null)
	//*  85  269:aload           7
	//*  86  271:ifnull          281
						mainorder.addBusinessOrders(businessorder);
	//   87  274:aload           5
	//   88  276:aload           7
	//   89  278:invokevirtual   #109 <Method void addBusinessOrders(BusinessOrder)>
				}

	//   90  281:iload_2         
	//   91  282:iconst_1        
	//   92  283:iadd            
	//   93  284:istore_2        
	//   94  285:iload_2         
	//   95  286:iload           4
	//   96  288:icmplt          260
				break;
	//   97  291:goto            355

			case 100: // 'd'
				aitag = ((ITag) (aitag)).getItemTags();
	//   98  294:aload           6
	//   99  296:invokeinterface #42  <Method ITag[] ITag.getItemTags()>
	//  100  301:astore          6
				if(aitag == null || aitag.length <= 0)
					break;
	//  101  303:aload           6
	//  102  305:ifnull          355
	//  103  308:aload           6
	//  104  310:arraylength     
	//  105  311:ifle            355
				int j1 = aitag.length;
	//  106  314:aload           6
	//  107  316:arraylength     
	//  108  317:istore          4
				for(int k = 0; k < j1; k++)
	//* 109  319:iconst_0        
	//* 110  320:istore_2        
	//* 111  321:goto            349
				{
					PayOrder payorder = PayOrder.fromTag(aitag[k]);
	//  112  324:aload           6
	//  113  326:iload_2         
	//  114  327:aaload          
	//  115  328:invokestatic    #114 <Method PayOrder PayOrder.fromTag(ITag)>
	//  116  331:astore          7
					if(payorder != null)
	//* 117  333:aload           7
	//* 118  335:ifnull          345
						mainorder.addPayOrders(payorder);
	//  119  338:aload           5
	//  120  340:aload           7
	//  121  342:invokevirtual   #118 <Method void addPayOrders(PayOrder)>
				}

	//  122  345:iload_2         
	//  123  346:iconst_1        
	//  124  347:iadd            
	//  125  348:istore_2        
	//  126  349:iload_2         
	//  127  350:iload           4
	//  128  352:icmplt          324
				break;
			}
		}

	//  129  355:iload_1         
	//  130  356:iconst_1        
	//  131  357:iadd            
	//  132  358:istore_1        
	//  133  359:iload_1         
	//  134  360:iload_3         
	//  135  361:icmplt          42
		return mainorder;
	//  136  364:aload           5
	//  137  366:areturn         
	}

	public void addBusinessOrders(BusinessOrder businessorder)
	{
		if(businessorder != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			businessOrders.add(((Object) (businessorder)));
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field List businessOrders>
	//    4    8:aload_1         
	//    5    9:invokeinterface #125 <Method boolean List.add(Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void addPayOrders(PayOrder payorder)
	{
		if(payorder != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			payOrders.add(((Object) (payorder)));
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field List payOrders>
	//    4    8:aload_1         
	//    5    9:invokeinterface #125 <Method boolean List.add(Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	public int getAmount()
	{
		return amount;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int amount>
	//    2    4:ireturn         
	}

	public EnumBusinessOrderLoadType getBusinessOrderLoadType()
	{
		return businessOrderLoadType;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field EnumBusinessOrderLoadType businessOrderLoadType>
	//    2    4:areturn         
	}

	public BusinessOrder[] getBusinessOrders()
	{
		return (BusinessOrder[])businessOrders.toArray(((Object []) (new BusinessOrder[0])));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field List businessOrders>
	//    2    4:iconst_0        
	//    3    5:anewarray       BusinessOrder[]
	//    4    8:invokeinterface #138 <Method Object[] List.toArray(Object[])>
	//    5   13:checkcast       #140 <Class BusinessOrder[]>
	//    6   16:areturn         
	}

	public String getDate()
	{
		return date;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field String date>
	//    2    4:areturn         
	}

	public byte[] getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field byte[] id>
	//    2    4:areturn         
	}

	public PayOrder[] getPayOrders()
	{
		return (PayOrder[])payOrders.toArray(((Object []) (new PayOrder[0])));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List payOrders>
	//    2    4:iconst_0        
	//    3    5:anewarray       PayOrder[]
	//    4    8:invokeinterface #138 <Method Object[] List.toArray(Object[])>
	//    5   13:checkcast       #149 <Class PayOrder[]>
	//    6   16:areturn         
	}

	public EnumOrderStatus getState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field EnumOrderStatus state>
	//    2    4:areturn         
	}

	public String getTime()
	{
		return time;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field String time>
	//    2    4:areturn         
	}

	public void setAmount(int i)
	{
		amount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #128 <Field int amount>
	//    3    5:return          
	}

	public void setBusinessOrderLoadType(EnumBusinessOrderLoadType enumbusinessorderloadtype)
	{
		businessOrderLoadType = enumbusinessorderloadtype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #132 <Field EnumBusinessOrderLoadType businessOrderLoadType>
	//    3    5:return          
	}

	public void setDate(String s)
	{
		date = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #143 <Field String date>
	//    3    5:return          
	}

	public void setId(byte abyte0[])
	{
		id = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #145 <Field byte[] id>
	//    3    5:return          
	}

	public void setState(EnumOrderStatus enumorderstatus)
	{
		state = enumorderstatus;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #153 <Field EnumOrderStatus state>
	//    3    5:return          
	}

	public void setTime(String s)
	{
		time = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #156 <Field String time>
	//    3    5:return          
	}

	private int amount;
	private EnumBusinessOrderLoadType businessOrderLoadType;
	private List businessOrders;
	private String date;
	private byte id[];
	private List payOrders;
	private EnumOrderStatus state;
	private String time;
}
