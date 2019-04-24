// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.enums;


public final class EnumBackInfoType extends Enum
{

	private EnumBackInfoType(String s, int i, int j, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #58  <Method void Enum(String, int)>
		id = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #60  <Field int id>
		desc = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #62  <Field String desc>
	//   10   17:return          
	}

	public static EnumBackInfoType instance(int i)
	{
		EnumBackInfoType aenumbackinfotype[] = values();
	//    0    0:invokestatic    #68  <Method EnumBackInfoType[] values()>
	//    1    3:astore_3        
		int k = aenumbackinfotype.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			EnumBackInfoType enumbackinfotype = aenumbackinfotype[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(enumbackinfotype.getId() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #72  <Method int getId()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return enumbackinfotype;
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

	public static EnumBackInfoType valueOf(String s)
	{
		return (EnumBackInfoType)Enum.valueOf(cn/com/fmsh/tsm/business/enums/EnumBackInfoType, s);
	//    0    0:ldc1            #2   <Class EnumBackInfoType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #77  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EnumBackInfoType>
	//    4    9:areturn         
	}

	public static EnumBackInfoType[] values()
	{
		EnumBackInfoType aenumbackinfotype[] = ENUM$VALUES;
	//    0    0:getstatic       #54  <Field EnumBackInfoType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aenumbackinfotype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		EnumBackInfoType aenumbackinfotype1[] = new EnumBackInfoType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       EnumBackInfoType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aenumbackinfotype)), 0, ((Object) (aenumbackinfotype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #83  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aenumbackinfotype1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDesc()
	{
		return desc;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String desc>
	//    2    4:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int id>
	//    2    4:ireturn         
	}

	public static final EnumBackInfoType CHANGE_MOVE;
	private static final EnumBackInfoType ENUM$VALUES[];
	public static final EnumBackInfoType IMPROVE_ADVICE;
	public static final EnumBackInfoType OTHER;
	public static final EnumBackInfoType RECHARGE_REFUND;
	public static final EnumBackInfoType SUBWAY_PAY;
	public static final EnumBackInfoType TRAFFIC_CARD;
	private String desc;
	private int id;

	static 
	{
		TRAFFIC_CARD = new EnumBackInfoType("TRAFFIC_CARD", 0, 0, "\u4EA4\u901A\u5361\u5E94\u7528");
	//    0    0:new             #2   <Class EnumBackInfoType>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "TRAFFIC_CARD">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:ldc1            #23  <String "\u4EA4\u901A\u5361\u5E94\u7528">
	//    6   10:invokespecial   #27  <Method void EnumBackInfoType(String, int, int, String)>
	//    7   13:putstatic       #29  <Field EnumBackInfoType TRAFFIC_CARD>
		RECHARGE_REFUND = new EnumBackInfoType("RECHARGE_REFUND", 1, 1, "\u5145\u503C\u53CA\u9000\u6B3E");
	//    8   16:new             #2   <Class EnumBackInfoType>
	//    9   19:dup             
	//   10   20:ldc1            #30  <String "RECHARGE_REFUND">
	//   11   22:iconst_1        
	//   12   23:iconst_1        
	//   13   24:ldc1            #32  <String "\u5145\u503C\u53CA\u9000\u6B3E">
	//   14   26:invokespecial   #27  <Method void EnumBackInfoType(String, int, int, String)>
	//   15   29:putstatic       #34  <Field EnumBackInfoType RECHARGE_REFUND>
		CHANGE_MOVE = new EnumBackInfoType("CHANGE_MOVE", 2, 2, "\u6362\u5361\u53CA\u79FB\u8D44");
	//   16   32:new             #2   <Class EnumBackInfoType>
	//   17   35:dup             
	//   18   36:ldc1            #35  <String "CHANGE_MOVE">
	//   19   38:iconst_2        
	//   20   39:iconst_2        
	//   21   40:ldc1            #37  <String "\u6362\u5361\u53CA\u79FB\u8D44">
	//   22   42:invokespecial   #27  <Method void EnumBackInfoType(String, int, int, String)>
	//   23   45:putstatic       #39  <Field EnumBackInfoType CHANGE_MOVE>
		SUBWAY_PAY = new EnumBackInfoType("SUBWAY_PAY", 3, 3, "\u5730\u94C1\u516C\u4EA4\u5237\u5361");
	//   24   48:new             #2   <Class EnumBackInfoType>
	//   25   51:dup             
	//   26   52:ldc1            #40  <String "SUBWAY_PAY">
	//   27   54:iconst_3        
	//   28   55:iconst_3        
	//   29   56:ldc1            #42  <String "\u5730\u94C1\u516C\u4EA4\u5237\u5361">
	//   30   58:invokespecial   #27  <Method void EnumBackInfoType(String, int, int, String)>
	//   31   61:putstatic       #44  <Field EnumBackInfoType SUBWAY_PAY>
		IMPROVE_ADVICE = new EnumBackInfoType("IMPROVE_ADVICE", 4, 4, "\u529F\u80FD\u6539\u5584\u5EFA\u8BAE");
	//   32   64:new             #2   <Class EnumBackInfoType>
	//   33   67:dup             
	//   34   68:ldc1            #45  <String "IMPROVE_ADVICE">
	//   35   70:iconst_4        
	//   36   71:iconst_4        
	//   37   72:ldc1            #47  <String "\u529F\u80FD\u6539\u5584\u5EFA\u8BAE">
	//   38   74:invokespecial   #27  <Method void EnumBackInfoType(String, int, int, String)>
	//   39   77:putstatic       #49  <Field EnumBackInfoType IMPROVE_ADVICE>
		OTHER = new EnumBackInfoType("OTHER", 5, 5, "\u4EA4\u901A\u5361\u5E94\u7528");
	//   40   80:new             #2   <Class EnumBackInfoType>
	//   41   83:dup             
	//   42   84:ldc1            #50  <String "OTHER">
	//   43   86:iconst_5        
	//   44   87:iconst_5        
	//   45   88:ldc1            #23  <String "\u4EA4\u901A\u5361\u5E94\u7528">
	//   46   90:invokespecial   #27  <Method void EnumBackInfoType(String, int, int, String)>
	//   47   93:putstatic       #52  <Field EnumBackInfoType OTHER>
		ENUM$VALUES = (new EnumBackInfoType[] {
			TRAFFIC_CARD, RECHARGE_REFUND, CHANGE_MOVE, SUBWAY_PAY, IMPROVE_ADVICE, OTHER
		});
	//   48   96:bipush          6
	//   49   98:anewarray       EnumBackInfoType[]
	//   50  101:dup             
	//   51  102:iconst_0        
	//   52  103:getstatic       #29  <Field EnumBackInfoType TRAFFIC_CARD>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_1        
	//   56  109:getstatic       #34  <Field EnumBackInfoType RECHARGE_REFUND>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_2        
	//   60  115:getstatic       #39  <Field EnumBackInfoType CHANGE_MOVE>
	//   61  118:aastore         
	//   62  119:dup             
	//   63  120:iconst_3        
	//   64  121:getstatic       #44  <Field EnumBackInfoType SUBWAY_PAY>
	//   65  124:aastore         
	//   66  125:dup             
	//   67  126:iconst_4        
	//   68  127:getstatic       #49  <Field EnumBackInfoType IMPROVE_ADVICE>
	//   69  130:aastore         
	//   70  131:dup             
	//   71  132:iconst_5        
	//   72  133:getstatic       #52  <Field EnumBackInfoType OTHER>
	//   73  136:aastore         
	//   74  137:putstatic       #54  <Field EnumBackInfoType[] ENUM$VALUES>
	//*  75  140:return          
	}
}
