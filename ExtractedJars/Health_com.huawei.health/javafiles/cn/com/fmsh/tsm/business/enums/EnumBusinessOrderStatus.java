// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.enums;


public final class EnumBusinessOrderStatus extends Enum
{

	private EnumBusinessOrderStatus(String s, int i, int j, String s1)
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

	public static EnumBusinessOrderStatus getBusinessOrderStatus4ID(int i)
	{
		EnumBusinessOrderStatus aenumbusinessorderstatus[] = values();
	//    0    0:invokestatic    #76  <Method EnumBusinessOrderStatus[] values()>
	//    1    3:astore_3        
		int k = aenumbusinessorderstatus.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			EnumBusinessOrderStatus enumbusinessorderstatus = aenumbusinessorderstatus[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(enumbusinessorderstatus.getId() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #80  <Method int getId()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return enumbusinessorderstatus;
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

	public static EnumBusinessOrderStatus valueOf(String s)
	{
		return (EnumBusinessOrderStatus)Enum.valueOf(cn/com/fmsh/tsm/business/enums/EnumBusinessOrderStatus, s);
	//    0    0:ldc1            #2   <Class EnumBusinessOrderStatus>
	//    1    2:aload_0         
	//    2    3:invokestatic    #85  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EnumBusinessOrderStatus>
	//    4    9:areturn         
	}

	public static EnumBusinessOrderStatus[] values()
	{
		EnumBusinessOrderStatus aenumbusinessorderstatus[] = ENUM$VALUES;
	//    0    0:getstatic       #62  <Field EnumBusinessOrderStatus[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aenumbusinessorderstatus.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		EnumBusinessOrderStatus aenumbusinessorderstatus1[] = new EnumBusinessOrderStatus[i];
	//    5    7:iload_0         
	//    6    8:anewarray       EnumBusinessOrderStatus[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aenumbusinessorderstatus)), 0, ((Object) (aenumbusinessorderstatus1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aenumbusinessorderstatus1;
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

	private static final EnumBusinessOrderStatus ENUM$VALUES[];
	public static final EnumBusinessOrderStatus noOrder;
	public static final EnumBusinessOrderStatus orderFail;
	public static final EnumBusinessOrderStatus orderIng;
	public static final EnumBusinessOrderStatus orderSucess;
	public static final EnumBusinessOrderStatus unsubscribeFail;
	public static final EnumBusinessOrderStatus unsubscribeSucess;
	public static final EnumBusinessOrderStatus unsubscribeing;
	private String desc;
	private int id;

	static 
	{
		noOrder = new EnumBusinessOrderStatus("noOrder", 0, 0, "\u672A\u8BA2\u8D2D");
	//    0    0:new             #2   <Class EnumBusinessOrderStatus>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "noOrder">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:ldc1            #24  <String "\u672A\u8BA2\u8D2D">
	//    6   10:invokespecial   #28  <Method void EnumBusinessOrderStatus(String, int, int, String)>
	//    7   13:putstatic       #30  <Field EnumBusinessOrderStatus noOrder>
		orderIng = new EnumBusinessOrderStatus("orderIng", 1, 1, "\u8BA2\u8D2D\u4E2D,\u672A\u77E5\u8BA2\u8D2D\u7ED3\u679C");
	//    8   16:new             #2   <Class EnumBusinessOrderStatus>
	//    9   19:dup             
	//   10   20:ldc1            #31  <String "orderIng">
	//   11   22:iconst_1        
	//   12   23:iconst_1        
	//   13   24:ldc1            #33  <String "\u8BA2\u8D2D\u4E2D,\u672A\u77E5\u8BA2\u8D2D\u7ED3\u679C">
	//   14   26:invokespecial   #28  <Method void EnumBusinessOrderStatus(String, int, int, String)>
	//   15   29:putstatic       #35  <Field EnumBusinessOrderStatus orderIng>
		orderSucess = new EnumBusinessOrderStatus("orderSucess", 2, 2, "\u8BA2\u8D2D\u6210\u529F");
	//   16   32:new             #2   <Class EnumBusinessOrderStatus>
	//   17   35:dup             
	//   18   36:ldc1            #36  <String "orderSucess">
	//   19   38:iconst_2        
	//   20   39:iconst_2        
	//   21   40:ldc1            #38  <String "\u8BA2\u8D2D\u6210\u529F">
	//   22   42:invokespecial   #28  <Method void EnumBusinessOrderStatus(String, int, int, String)>
	//   23   45:putstatic       #40  <Field EnumBusinessOrderStatus orderSucess>
		orderFail = new EnumBusinessOrderStatus("orderFail", 3, 3, "\u8BA2\u8D2D\u5931\u8D25");
	//   24   48:new             #2   <Class EnumBusinessOrderStatus>
	//   25   51:dup             
	//   26   52:ldc1            #41  <String "orderFail">
	//   27   54:iconst_3        
	//   28   55:iconst_3        
	//   29   56:ldc1            #43  <String "\u8BA2\u8D2D\u5931\u8D25">
	//   30   58:invokespecial   #28  <Method void EnumBusinessOrderStatus(String, int, int, String)>
	//   31   61:putstatic       #45  <Field EnumBusinessOrderStatus orderFail>
		unsubscribeing = new EnumBusinessOrderStatus("unsubscribeing", 4, 4, "\u9000\u8BA2\u4E2D");
	//   32   64:new             #2   <Class EnumBusinessOrderStatus>
	//   33   67:dup             
	//   34   68:ldc1            #46  <String "unsubscribeing">
	//   35   70:iconst_4        
	//   36   71:iconst_4        
	//   37   72:ldc1            #48  <String "\u9000\u8BA2\u4E2D">
	//   38   74:invokespecial   #28  <Method void EnumBusinessOrderStatus(String, int, int, String)>
	//   39   77:putstatic       #50  <Field EnumBusinessOrderStatus unsubscribeing>
		unsubscribeSucess = new EnumBusinessOrderStatus("unsubscribeSucess", 5, 5, "\u9000\u8BA2\u6210\u529F");
	//   40   80:new             #2   <Class EnumBusinessOrderStatus>
	//   41   83:dup             
	//   42   84:ldc1            #51  <String "unsubscribeSucess">
	//   43   86:iconst_5        
	//   44   87:iconst_5        
	//   45   88:ldc1            #53  <String "\u9000\u8BA2\u6210\u529F">
	//   46   90:invokespecial   #28  <Method void EnumBusinessOrderStatus(String, int, int, String)>
	//   47   93:putstatic       #55  <Field EnumBusinessOrderStatus unsubscribeSucess>
		unsubscribeFail = new EnumBusinessOrderStatus("unsubscribeFail", 6, 6, "\u9000\u8BA2\u5931\u8D25");
	//   48   96:new             #2   <Class EnumBusinessOrderStatus>
	//   49   99:dup             
	//   50  100:ldc1            #56  <String "unsubscribeFail">
	//   51  102:bipush          6
	//   52  104:bipush          6
	//   53  106:ldc1            #58  <String "\u9000\u8BA2\u5931\u8D25">
	//   54  108:invokespecial   #28  <Method void EnumBusinessOrderStatus(String, int, int, String)>
	//   55  111:putstatic       #60  <Field EnumBusinessOrderStatus unsubscribeFail>
		ENUM$VALUES = (new EnumBusinessOrderStatus[] {
			noOrder, orderIng, orderSucess, orderFail, unsubscribeing, unsubscribeSucess, unsubscribeFail
		});
	//   56  114:bipush          7
	//   57  116:anewarray       EnumBusinessOrderStatus[]
	//   58  119:dup             
	//   59  120:iconst_0        
	//   60  121:getstatic       #30  <Field EnumBusinessOrderStatus noOrder>
	//   61  124:aastore         
	//   62  125:dup             
	//   63  126:iconst_1        
	//   64  127:getstatic       #35  <Field EnumBusinessOrderStatus orderIng>
	//   65  130:aastore         
	//   66  131:dup             
	//   67  132:iconst_2        
	//   68  133:getstatic       #40  <Field EnumBusinessOrderStatus orderSucess>
	//   69  136:aastore         
	//   70  137:dup             
	//   71  138:iconst_3        
	//   72  139:getstatic       #45  <Field EnumBusinessOrderStatus orderFail>
	//   73  142:aastore         
	//   74  143:dup             
	//   75  144:iconst_4        
	//   76  145:getstatic       #50  <Field EnumBusinessOrderStatus unsubscribeing>
	//   77  148:aastore         
	//   78  149:dup             
	//   79  150:iconst_5        
	//   80  151:getstatic       #55  <Field EnumBusinessOrderStatus unsubscribeSucess>
	//   81  154:aastore         
	//   82  155:dup             
	//   83  156:bipush          6
	//   84  158:getstatic       #60  <Field EnumBusinessOrderStatus unsubscribeFail>
	//   85  161:aastore         
	//   86  162:putstatic       #62  <Field EnumBusinessOrderStatus[] ENUM$VALUES>
	//*  87  165:return          
	}
}
