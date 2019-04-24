// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.enums;


public final class EnumBusinessOrderType extends Enum
{

	private EnumBusinessOrderType(String s, int i, int j, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #66  <Method void Enum(String, int)>
		id = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #68  <Field int id>
		desc = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #70  <Field String desc>
	//   10   17:return          
	}

	public static EnumBusinessOrderType instance(int i)
	{
		EnumBusinessOrderType aenumbusinessordertype[] = values();
	//    0    0:invokestatic    #76  <Method EnumBusinessOrderType[] values()>
	//    1    3:astore_3        
		int k = aenumbusinessordertype.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			EnumBusinessOrderType enumbusinessordertype = aenumbusinessordertype[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(enumbusinessordertype.getId() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #80  <Method int getId()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return enumbusinessordertype;
	//   16   26:aload           4
	//   17   28:areturn         
		}

	//   18   29:iload_1         
	//   19   30:iconst_1        
	//   20   31:iadd            
	//   21   32:istore_1        
	//   22   33:iload_1         
	//   23   34:iload_2         
	//   24   35:icmplt          12
		return null;
	//   25   38:aconst_null     
	//   26   39:areturn         
	}

	public static EnumBusinessOrderType valueOf(String s)
	{
		return (EnumBusinessOrderType)Enum.valueOf(cn/com/fmsh/tsm/business/enums/EnumBusinessOrderType, s);
	//    0    0:ldc1            #2   <Class EnumBusinessOrderType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #85  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EnumBusinessOrderType>
	//    4    9:areturn         
	}

	public static EnumBusinessOrderType[] values()
	{
		EnumBusinessOrderType aenumbusinessordertype[] = ENUM$VALUES;
	//    0    0:getstatic       #62  <Field EnumBusinessOrderType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aenumbusinessordertype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		EnumBusinessOrderType aenumbusinessordertype1[] = new EnumBusinessOrderType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       EnumBusinessOrderType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aenumbusinessordertype)), 0, ((Object) (aenumbusinessordertype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aenumbusinessordertype1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDesc()
	{
		return desc;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field String desc>
	//    2    4:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int id>
	//    2    4:ireturn         
	}

	private static final EnumBusinessOrderType ENUM$VALUES[];
	public static final EnumBusinessOrderType ORDER_TYPE_ADDED;
	public static final EnumBusinessOrderType ORDER_TYPE_ISSUE;
	public static final EnumBusinessOrderType ORDER_TYPE_PROMOTION;
	public static final EnumBusinessOrderType ORDER_TYPE_RECHARGE;
	public static final EnumBusinessOrderType ORDER_TYPE_WELFARE;
	public static final EnumBusinessOrderType TRANSFER;
	public static final EnumBusinessOrderType UNKNOW;
	private String desc;
	private int id;

	static 
	{
		ORDER_TYPE_RECHARGE = new EnumBusinessOrderType("ORDER_TYPE_RECHARGE", 0, 1, "\u5145\u503C\u8BA2\u5355");
	//    0    0:new             #2   <Class EnumBusinessOrderType>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "ORDER_TYPE_RECHARGE">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:ldc1            #24  <String "\u5145\u503C\u8BA2\u5355">
	//    6   10:invokespecial   #28  <Method void EnumBusinessOrderType(String, int, int, String)>
	//    7   13:putstatic       #30  <Field EnumBusinessOrderType ORDER_TYPE_RECHARGE>
		ORDER_TYPE_ISSUE = new EnumBusinessOrderType("ORDER_TYPE_ISSUE", 1, 2, "\u53D1\u5361\u8BA2\u5355");
	//    8   16:new             #2   <Class EnumBusinessOrderType>
	//    9   19:dup             
	//   10   20:ldc1            #31  <String "ORDER_TYPE_ISSUE">
	//   11   22:iconst_1        
	//   12   23:iconst_2        
	//   13   24:ldc1            #33  <String "\u53D1\u5361\u8BA2\u5355">
	//   14   26:invokespecial   #28  <Method void EnumBusinessOrderType(String, int, int, String)>
	//   15   29:putstatic       #35  <Field EnumBusinessOrderType ORDER_TYPE_ISSUE>
		ORDER_TYPE_PROMOTION = new EnumBusinessOrderType("ORDER_TYPE_PROMOTION", 2, 3, "\u4FC3\u9500\u8BA2\u5355");
	//   16   32:new             #2   <Class EnumBusinessOrderType>
	//   17   35:dup             
	//   18   36:ldc1            #36  <String "ORDER_TYPE_PROMOTION">
	//   19   38:iconst_2        
	//   20   39:iconst_3        
	//   21   40:ldc1            #38  <String "\u4FC3\u9500\u8BA2\u5355">
	//   22   42:invokespecial   #28  <Method void EnumBusinessOrderType(String, int, int, String)>
	//   23   45:putstatic       #40  <Field EnumBusinessOrderType ORDER_TYPE_PROMOTION>
		TRANSFER = new EnumBusinessOrderType("TRANSFER", 3, 4, "\u8F6C\u8D26\u8BA2\u5355");
	//   24   48:new             #2   <Class EnumBusinessOrderType>
	//   25   51:dup             
	//   26   52:ldc1            #41  <String "TRANSFER">
	//   27   54:iconst_3        
	//   28   55:iconst_4        
	//   29   56:ldc1            #43  <String "\u8F6C\u8D26\u8BA2\u5355">
	//   30   58:invokespecial   #28  <Method void EnumBusinessOrderType(String, int, int, String)>
	//   31   61:putstatic       #45  <Field EnumBusinessOrderType TRANSFER>
		ORDER_TYPE_ADDED = new EnumBusinessOrderType("ORDER_TYPE_ADDED", 4, 5, "\u8865\u5145\u503C\u8BA2\u5355");
	//   32   64:new             #2   <Class EnumBusinessOrderType>
	//   33   67:dup             
	//   34   68:ldc1            #46  <String "ORDER_TYPE_ADDED">
	//   35   70:iconst_4        
	//   36   71:iconst_5        
	//   37   72:ldc1            #48  <String "\u8865\u5145\u503C\u8BA2\u5355">
	//   38   74:invokespecial   #28  <Method void EnumBusinessOrderType(String, int, int, String)>
	//   39   77:putstatic       #50  <Field EnumBusinessOrderType ORDER_TYPE_ADDED>
		ORDER_TYPE_WELFARE = new EnumBusinessOrderType("ORDER_TYPE_WELFARE", 5, 6, "\u798F\u5229\u8BA2\u5355");
	//   40   80:new             #2   <Class EnumBusinessOrderType>
	//   41   83:dup             
	//   42   84:ldc1            #51  <String "ORDER_TYPE_WELFARE">
	//   43   86:iconst_5        
	//   44   87:bipush          6
	//   45   89:ldc1            #53  <String "\u798F\u5229\u8BA2\u5355">
	//   46   91:invokespecial   #28  <Method void EnumBusinessOrderType(String, int, int, String)>
	//   47   94:putstatic       #55  <Field EnumBusinessOrderType ORDER_TYPE_WELFARE>
		UNKNOW = new EnumBusinessOrderType("UNKNOW", 6, 0, "\u672A\u77E5");
	//   48   97:new             #2   <Class EnumBusinessOrderType>
	//   49  100:dup             
	//   50  101:ldc1            #56  <String "UNKNOW">
	//   51  103:bipush          6
	//   52  105:iconst_0        
	//   53  106:ldc1            #58  <String "\u672A\u77E5">
	//   54  108:invokespecial   #28  <Method void EnumBusinessOrderType(String, int, int, String)>
	//   55  111:putstatic       #60  <Field EnumBusinessOrderType UNKNOW>
		ENUM$VALUES = (new EnumBusinessOrderType[] {
			ORDER_TYPE_RECHARGE, ORDER_TYPE_ISSUE, ORDER_TYPE_PROMOTION, TRANSFER, ORDER_TYPE_ADDED, ORDER_TYPE_WELFARE, UNKNOW
		});
	//   56  114:bipush          7
	//   57  116:anewarray       EnumBusinessOrderType[]
	//   58  119:dup             
	//   59  120:iconst_0        
	//   60  121:getstatic       #30  <Field EnumBusinessOrderType ORDER_TYPE_RECHARGE>
	//   61  124:aastore         
	//   62  125:dup             
	//   63  126:iconst_1        
	//   64  127:getstatic       #35  <Field EnumBusinessOrderType ORDER_TYPE_ISSUE>
	//   65  130:aastore         
	//   66  131:dup             
	//   67  132:iconst_2        
	//   68  133:getstatic       #40  <Field EnumBusinessOrderType ORDER_TYPE_PROMOTION>
	//   69  136:aastore         
	//   70  137:dup             
	//   71  138:iconst_3        
	//   72  139:getstatic       #45  <Field EnumBusinessOrderType TRANSFER>
	//   73  142:aastore         
	//   74  143:dup             
	//   75  144:iconst_4        
	//   76  145:getstatic       #50  <Field EnumBusinessOrderType ORDER_TYPE_ADDED>
	//   77  148:aastore         
	//   78  149:dup             
	//   79  150:iconst_5        
	//   80  151:getstatic       #55  <Field EnumBusinessOrderType ORDER_TYPE_WELFARE>
	//   81  154:aastore         
	//   82  155:dup             
	//   83  156:bipush          6
	//   84  158:getstatic       #60  <Field EnumBusinessOrderType UNKNOW>
	//   85  161:aastore         
	//   86  162:putstatic       #62  <Field EnumBusinessOrderType[] ENUM$VALUES>
	//*  87  165:return          
	}
}
