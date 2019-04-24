// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.enums;


public final class EnumCardBusinessOpType extends Enum
{

	private EnumCardBusinessOpType(String s, int i, int j, String s1)
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

	public static EnumCardBusinessOpType getCardIoType(int i)
	{
		EnumCardBusinessOpType aenumcardbusinessoptype[] = values();
	//    0    0:invokestatic    #46  <Method EnumCardBusinessOpType[] values()>
	//    1    3:astore_3        
		int k = aenumcardbusinessoptype.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			EnumCardBusinessOpType enumcardbusinessoptype = aenumcardbusinessoptype[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(enumcardbusinessoptype.getId() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #50  <Method int getId()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return enumcardbusinessoptype;
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

	public static EnumCardBusinessOpType valueOf(String s)
	{
		return (EnumCardBusinessOpType)Enum.valueOf(cn/com/fmsh/tsm/business/enums/EnumCardBusinessOpType, s);
	//    0    0:ldc1            #2   <Class EnumCardBusinessOpType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EnumCardBusinessOpType>
	//    4    9:areturn         
	}

	public static EnumCardBusinessOpType[] values()
	{
		EnumCardBusinessOpType aenumcardbusinessoptype[] = ENUM$VALUES;
	//    0    0:getstatic       #32  <Field EnumCardBusinessOpType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aenumcardbusinessoptype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		EnumCardBusinessOpType aenumcardbusinessoptype1[] = new EnumCardBusinessOpType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       EnumCardBusinessOpType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aenumcardbusinessoptype)), 0, ((Object) (aenumcardbusinessoptype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aenumcardbusinessoptype1;
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

	private static final EnumCardBusinessOpType ENUM$VALUES[];
	public static final EnumCardBusinessOpType ORDER;
	public static final EnumCardBusinessOpType UNSUBSCRIBE;
	private String desc;
	private int id;

	static 
	{
		ORDER = new EnumCardBusinessOpType("ORDER", 0, 1, "\u8BA2\u8D2D\u6FC0\u6D3B");
	//    0    0:new             #2   <Class EnumCardBusinessOpType>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "ORDER">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:ldc1            #19  <String "\u8BA2\u8D2D\u6FC0\u6D3B">
	//    6   10:invokespecial   #23  <Method void EnumCardBusinessOpType(String, int, int, String)>
	//    7   13:putstatic       #25  <Field EnumCardBusinessOpType ORDER>
		UNSUBSCRIBE = new EnumCardBusinessOpType("UNSUBSCRIBE", 1, 2, "\u9000\u8BA2");
	//    8   16:new             #2   <Class EnumCardBusinessOpType>
	//    9   19:dup             
	//   10   20:ldc1            #26  <String "UNSUBSCRIBE">
	//   11   22:iconst_1        
	//   12   23:iconst_2        
	//   13   24:ldc1            #28  <String "\u9000\u8BA2">
	//   14   26:invokespecial   #23  <Method void EnumCardBusinessOpType(String, int, int, String)>
	//   15   29:putstatic       #30  <Field EnumCardBusinessOpType UNSUBSCRIBE>
		ENUM$VALUES = (new EnumCardBusinessOpType[] {
			ORDER, UNSUBSCRIBE
		});
	//   16   32:iconst_2        
	//   17   33:anewarray       EnumCardBusinessOpType[]
	//   18   36:dup             
	//   19   37:iconst_0        
	//   20   38:getstatic       #25  <Field EnumCardBusinessOpType ORDER>
	//   21   41:aastore         
	//   22   42:dup             
	//   23   43:iconst_1        
	//   24   44:getstatic       #30  <Field EnumCardBusinessOpType UNSUBSCRIBE>
	//   25   47:aastore         
	//   26   48:putstatic       #32  <Field EnumCardBusinessOpType[] ENUM$VALUES>
	//*  27   51:return          
	}
}
