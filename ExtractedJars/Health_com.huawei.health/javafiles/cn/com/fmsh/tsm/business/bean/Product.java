// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import cn.com.fmsh.communication.message.ITag;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;

public class Product
{

	public Product()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static Product fromTag(ITag itag)
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
	//    5    7:invokeinterface #26  <Method ITag[] ITag.getItemTags()>
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
		Product product = new Product();
	//   15   25:new             #2   <Class Product>
	//   16   28:dup             
	//   17   29:invokespecial   #27  <Method void Product()>
	//   18   32:astore_3        
		int j = itag.length;
	//   19   33:aload_0         
	//   20   34:arraylength     
	//   21   35:istore_2        
		for(int i = 0; i < j; i++)
	//*  22   36:iconst_0        
	//*  23   37:istore_1        
	//*  24   38:goto            178
		{
			ITag itag1 = ((ITag) (itag[i]));
	//   25   41:aload_0         
	//   26   42:iload_1         
	//   27   43:aaload          
	//   28   44:astore          4
			switch(itag1.getId())
	//*  29   46:aload           4
	//*  30   48:invokeinterface #31  <Method byte ITag.getId()>
			{
	//*  31   53:lookupswitch    5: default 104
	//	               -103: 135
	//	               -102: 149
	//	               -101: 163
	//	               103: 107
	//	               124: 121
	//*  32  104:goto            174
			case 103: // 'g'
				product.id = itag1.getStringVal();
	//   33  107:aload_3         
	//   34  108:aload           4
	//   35  110:invokeinterface #35  <Method String ITag.getStringVal()>
	//   36  115:putfield        #37  <Field String id>
				break;

	//*  37  118:goto            174
			case 124: // '|'
				product.price = itag1.getIntVal();
	//   38  121:aload_3         
	//   39  122:aload           4
	//   40  124:invokeinterface #41  <Method int ITag.getIntVal()>
	//   41  129:putfield        #43  <Field int price>
				break;

	//*  42  132:goto            174
			case -103: 
				product.code = itag1.getStringVal();
	//   43  135:aload_3         
	//   44  136:aload           4
	//   45  138:invokeinterface #35  <Method String ITag.getStringVal()>
	//   46  143:putfield        #45  <Field String code>
				break;

	//*  47  146:goto            174
			case -102: 
				product.name = itag1.getStringVal();
	//   48  149:aload_3         
	//   49  150:aload           4
	//   50  152:invokeinterface #35  <Method String ITag.getStringVal()>
	//   51  157:putfield        #47  <Field String name>
				break;

	//*  52  160:goto            174
			case -101: 
				product.city = itag1.getStringVal();
	//   53  163:aload_3         
	//   54  164:aload           4
	//   55  166:invokeinterface #35  <Method String ITag.getStringVal()>
	//   56  171:putfield        #49  <Field String city>
				break;
			}
		}

	//   57  174:iload_1         
	//   58  175:iconst_1        
	//   59  176:iadd            
	//   60  177:istore_1        
	//   61  178:iload_1         
	//   62  179:iload_2         
	//   63  180:icmplt          41
		return product;
	//   64  183:aload_3         
	//   65  184:areturn         
	}

	public String getCity()
	{
		return city;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String city>
	//    2    4:areturn         
	}

	public String getCode()
	{
		return code;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String code>
	//    2    4:areturn         
	}

	public String getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String id>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String name>
	//    2    4:areturn         
	}

	public int getPrice()
	{
		return price;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int price>
	//    2    4:ireturn         
	}

	public void setCity(String s)
	{
		city = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field String city>
	//    3    5:return          
	}

	public void setCode(String s)
	{
		code = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field String code>
	//    3    5:return          
	}

	public void setId(String s)
	{
		id = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String id>
	//    3    5:return          
	}

	public void setName(String s)
	{
		name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field String name>
	//    3    5:return          
	}

	public void setPrice(int i)
	{
		price = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field int price>
	//    3    5:return          
	}

	private String city;
	private String code;
	private String id;
	private String name;
	private int price;
}
