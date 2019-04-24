// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.enums;

import java.io.Serializable;

public final class EnumBusinessOrderLoadType extends Enum
	implements Serializable
{

	private EnumBusinessOrderLoadType(String s, int i, int j, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #56  <Method void Enum(String, int)>
		id = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #58  <Field int id>
		desc = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #60  <Field String desc>
	//   10   17:return          
	}

	public static EnumBusinessOrderLoadType getBusinessOrderLoadType4ID(int i)
	{
		EnumBusinessOrderLoadType aenumbusinessorderloadtype[] = values();
	//    0    0:invokestatic    #66  <Method EnumBusinessOrderLoadType[] values()>
	//    1    3:astore_3        
		int k = aenumbusinessorderloadtype.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			EnumBusinessOrderLoadType enumbusinessorderloadtype = aenumbusinessorderloadtype[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(enumbusinessorderloadtype.getId() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #70  <Method int getId()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return enumbusinessorderloadtype;
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

	public static EnumBusinessOrderLoadType valueOf(String s)
	{
		return (EnumBusinessOrderLoadType)Enum.valueOf(cn/com/fmsh/tsm/business/enums/EnumBusinessOrderLoadType, s);
	//    0    0:ldc1            #2   <Class EnumBusinessOrderLoadType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #75  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EnumBusinessOrderLoadType>
	//    4    9:areturn         
	}

	public static EnumBusinessOrderLoadType[] values()
	{
		EnumBusinessOrderLoadType aenumbusinessorderloadtype[] = ENUM$VALUES;
	//    0    0:getstatic       #52  <Field EnumBusinessOrderLoadType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aenumbusinessorderloadtype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		EnumBusinessOrderLoadType aenumbusinessorderloadtype1[] = new EnumBusinessOrderLoadType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       EnumBusinessOrderLoadType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aenumbusinessorderloadtype)), 0, ((Object) (aenumbusinessorderloadtype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #81  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aenumbusinessorderloadtype1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDesc()
	{
		return desc;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String desc>
	//    2    4:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int id>
	//    2    4:ireturn         
	}

	private static final EnumBusinessOrderLoadType ENUM$VALUES[];
	public static final EnumBusinessOrderLoadType load;
	public static final EnumBusinessOrderLoadType promotionLoad;
	public static final EnumBusinessOrderLoadType supplementLoad;
	public static final EnumBusinessOrderLoadType unknown;
	public static final EnumBusinessOrderLoadType welfareLoad;
	private String desc;
	private int id;

	static 
	{
		unknown = new EnumBusinessOrderLoadType("unknown", 0, 0, "\u672A\u77E5");
	//    0    0:new             #2   <Class EnumBusinessOrderLoadType>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "unknown">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:ldc1            #24  <String "\u672A\u77E5">
	//    6   10:invokespecial   #28  <Method void EnumBusinessOrderLoadType(String, int, int, String)>
	//    7   13:putstatic       #30  <Field EnumBusinessOrderLoadType unknown>
		load = new EnumBusinessOrderLoadType("load", 1, 1, "\u666E\u901A\u5145\u503C");
	//    8   16:new             #2   <Class EnumBusinessOrderLoadType>
	//    9   19:dup             
	//   10   20:ldc1            #31  <String "load">
	//   11   22:iconst_1        
	//   12   23:iconst_1        
	//   13   24:ldc1            #33  <String "\u666E\u901A\u5145\u503C">
	//   14   26:invokespecial   #28  <Method void EnumBusinessOrderLoadType(String, int, int, String)>
	//   15   29:putstatic       #35  <Field EnumBusinessOrderLoadType load>
		supplementLoad = new EnumBusinessOrderLoadType("supplementLoad", 2, 2, "\u8865\u5145\u503C");
	//   16   32:new             #2   <Class EnumBusinessOrderLoadType>
	//   17   35:dup             
	//   18   36:ldc1            #36  <String "supplementLoad">
	//   19   38:iconst_2        
	//   20   39:iconst_2        
	//   21   40:ldc1            #38  <String "\u8865\u5145\u503C">
	//   22   42:invokespecial   #28  <Method void EnumBusinessOrderLoadType(String, int, int, String)>
	//   23   45:putstatic       #40  <Field EnumBusinessOrderLoadType supplementLoad>
		welfareLoad = new EnumBusinessOrderLoadType("welfareLoad", 3, 3, "\u798F\u5229\u5145\u503C");
	//   24   48:new             #2   <Class EnumBusinessOrderLoadType>
	//   25   51:dup             
	//   26   52:ldc1            #41  <String "welfareLoad">
	//   27   54:iconst_3        
	//   28   55:iconst_3        
	//   29   56:ldc1            #43  <String "\u798F\u5229\u5145\u503C">
	//   30   58:invokespecial   #28  <Method void EnumBusinessOrderLoadType(String, int, int, String)>
	//   31   61:putstatic       #45  <Field EnumBusinessOrderLoadType welfareLoad>
		promotionLoad = new EnumBusinessOrderLoadType("promotionLoad", 4, 4, "\u8425\u9500\u5145\u503C ");
	//   32   64:new             #2   <Class EnumBusinessOrderLoadType>
	//   33   67:dup             
	//   34   68:ldc1            #46  <String "promotionLoad">
	//   35   70:iconst_4        
	//   36   71:iconst_4        
	//   37   72:ldc1            #48  <String "\u8425\u9500\u5145\u503C ">
	//   38   74:invokespecial   #28  <Method void EnumBusinessOrderLoadType(String, int, int, String)>
	//   39   77:putstatic       #50  <Field EnumBusinessOrderLoadType promotionLoad>
		ENUM$VALUES = (new EnumBusinessOrderLoadType[] {
			unknown, load, supplementLoad, welfareLoad, promotionLoad
		});
	//   40   80:iconst_5        
	//   41   81:anewarray       EnumBusinessOrderLoadType[]
	//   42   84:dup             
	//   43   85:iconst_0        
	//   44   86:getstatic       #30  <Field EnumBusinessOrderLoadType unknown>
	//   45   89:aastore         
	//   46   90:dup             
	//   47   91:iconst_1        
	//   48   92:getstatic       #35  <Field EnumBusinessOrderLoadType load>
	//   49   95:aastore         
	//   50   96:dup             
	//   51   97:iconst_2        
	//   52   98:getstatic       #40  <Field EnumBusinessOrderLoadType supplementLoad>
	//   53  101:aastore         
	//   54  102:dup             
	//   55  103:iconst_3        
	//   56  104:getstatic       #45  <Field EnumBusinessOrderLoadType welfareLoad>
	//   57  107:aastore         
	//   58  108:dup             
	//   59  109:iconst_4        
	//   60  110:getstatic       #50  <Field EnumBusinessOrderLoadType promotionLoad>
	//   61  113:aastore         
	//   62  114:putstatic       #52  <Field EnumBusinessOrderLoadType[] ENUM$VALUES>
	//*  63  117:return          
	}
}
