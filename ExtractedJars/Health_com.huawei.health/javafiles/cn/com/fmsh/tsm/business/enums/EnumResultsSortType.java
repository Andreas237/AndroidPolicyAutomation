// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.enums;


public final class EnumResultsSortType extends Enum
{

	private EnumResultsSortType(String s, int i, int j, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #36  <Method void Enum(String, int)>
		id = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #38  <Field int id>
		desc = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #40  <Field String desc>
	//   10   17:return          
	}

	public static EnumResultsSortType instance(int i)
	{
		EnumResultsSortType aenumresultssorttype[] = values();
	//    0    0:invokestatic    #46  <Method EnumResultsSortType[] values()>
	//    1    3:astore_3        
		int k = aenumresultssorttype.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			EnumResultsSortType enumresultssorttype = aenumresultssorttype[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(enumresultssorttype.getId() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #50  <Method int getId()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return enumresultssorttype;
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

	public static EnumResultsSortType valueOf(String s)
	{
		return (EnumResultsSortType)Enum.valueOf(cn/com/fmsh/tsm/business/enums/EnumResultsSortType, s);
	//    0    0:ldc1            #2   <Class EnumResultsSortType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EnumResultsSortType>
	//    4    9:areturn         
	}

	public static EnumResultsSortType[] values()
	{
		EnumResultsSortType aenumresultssorttype[] = ENUM$VALUES;
	//    0    0:getstatic       #32  <Field EnumResultsSortType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aenumresultssorttype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		EnumResultsSortType aenumresultssorttype1[] = new EnumResultsSortType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       EnumResultsSortType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aenumresultssorttype)), 0, ((Object) (aenumresultssorttype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aenumresultssorttype1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDesc()
	{
		return desc;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String desc>
	//    2    4:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int id>
	//    2    4:ireturn         
	}

	public static final EnumResultsSortType BACKWARD;
	private static final EnumResultsSortType ENUM$VALUES[];
	public static final EnumResultsSortType FORWARD;
	private String desc;
	private int id;

	static 
	{
		FORWARD = new EnumResultsSortType("FORWARD", 0, 1, "\u5411\u524D\u67E5\u8BE2\uFF08\u5373\u5C0F\u4E8E\u88AB\u67E5\u8BE2\u7684\u5B57\u6BB5\uFF09 ");
	//    0    0:new             #2   <Class EnumResultsSortType>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "FORWARD">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:ldc1            #19  <String "\u5411\u524D\u67E5\u8BE2\uFF08\u5373\u5C0F\u4E8E\u88AB\u67E5\u8BE2\u7684\u5B57\u6BB5\uFF09 ">
	//    6   10:invokespecial   #23  <Method void EnumResultsSortType(String, int, int, String)>
	//    7   13:putstatic       #25  <Field EnumResultsSortType FORWARD>
		BACKWARD = new EnumResultsSortType("BACKWARD", 1, 2, "\u5411\u540E\u67E5\u8BE2\uFF08\u5373\u5927\u4E8E\u88AB\u67E5\u8BE2\u7684\u5B57\u6BB5\uFF09");
	//    8   16:new             #2   <Class EnumResultsSortType>
	//    9   19:dup             
	//   10   20:ldc1            #26  <String "BACKWARD">
	//   11   22:iconst_1        
	//   12   23:iconst_2        
	//   13   24:ldc1            #28  <String "\u5411\u540E\u67E5\u8BE2\uFF08\u5373\u5927\u4E8E\u88AB\u67E5\u8BE2\u7684\u5B57\u6BB5\uFF09">
	//   14   26:invokespecial   #23  <Method void EnumResultsSortType(String, int, int, String)>
	//   15   29:putstatic       #30  <Field EnumResultsSortType BACKWARD>
		ENUM$VALUES = (new EnumResultsSortType[] {
			FORWARD, BACKWARD
		});
	//   16   32:iconst_2        
	//   17   33:anewarray       EnumResultsSortType[]
	//   18   36:dup             
	//   19   37:iconst_0        
	//   20   38:getstatic       #25  <Field EnumResultsSortType FORWARD>
	//   21   41:aastore         
	//   22   42:dup             
	//   23   43:iconst_1        
	//   24   44:getstatic       #30  <Field EnumResultsSortType BACKWARD>
	//   25   47:aastore         
	//   26   48:putstatic       #32  <Field EnumResultsSortType[] ENUM$VALUES>
	//*  27   51:return          
	}
}
