// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.enums;

import java.io.Serializable;

public final class EnumCardAppType extends Enum
	implements Serializable
{

	private EnumCardAppType(String s, int i, int j, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #50  <Method void Enum(String, int)>
		id = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #52  <Field int id>
		desc = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #54  <Field String desc>
	//   10   17:return          
	}

	public static EnumCardAppType instance(int i)
	{
		EnumCardAppType aenumcardapptype[] = values();
	//    0    0:invokestatic    #60  <Method EnumCardAppType[] values()>
	//    1    3:astore_3        
		int k = aenumcardapptype.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			EnumCardAppType enumcardapptype = aenumcardapptype[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(enumcardapptype.getId() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #64  <Method int getId()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return enumcardapptype;
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

	public static EnumCardAppType valueOf(String s)
	{
		return (EnumCardAppType)Enum.valueOf(cn/com/fmsh/tsm/business/enums/EnumCardAppType, s);
	//    0    0:ldc1            #2   <Class EnumCardAppType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #69  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EnumCardAppType>
	//    4    9:areturn         
	}

	public static EnumCardAppType[] values()
	{
		EnumCardAppType aenumcardapptype[] = ENUM$VALUES;
	//    0    0:getstatic       #46  <Field EnumCardAppType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aenumcardapptype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		EnumCardAppType aenumcardapptype1[] = new EnumCardAppType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       EnumCardAppType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aenumcardapptype)), 0, ((Object) (aenumcardapptype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #75  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aenumcardapptype1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDesc()
	{
		return desc;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String desc>
	//    2    4:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int id>
	//    2    4:ireturn         
	}

	public static final EnumCardAppType CARD_APP_TYPE_LNT;
	public static final EnumCardAppType CARD_APP_TYPE_SH;
	public static final EnumCardAppType CARD_APP_TYPE_SH_RENT;
	public static final EnumCardAppType CARD_APP_TYPE_SH_TOUR;
	private static final EnumCardAppType ENUM$VALUES[];
	private String desc;
	private int id;

	static 
	{
		CARD_APP_TYPE_SH = new EnumCardAppType("CARD_APP_TYPE_SH", 0, 1, "\u4E0A\u6D77\u4EA4\u901A\u5361");
	//    0    0:new             #2   <Class EnumCardAppType>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "CARD_APP_TYPE_SH">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:ldc1            #23  <String "\u4E0A\u6D77\u4EA4\u901A\u5361">
	//    6   10:invokespecial   #27  <Method void EnumCardAppType(String, int, int, String)>
	//    7   13:putstatic       #29  <Field EnumCardAppType CARD_APP_TYPE_SH>
		CARD_APP_TYPE_LNT = new EnumCardAppType("CARD_APP_TYPE_LNT", 1, 2, "\u5CAD\u5357\u901A");
	//    8   16:new             #2   <Class EnumCardAppType>
	//    9   19:dup             
	//   10   20:ldc1            #30  <String "CARD_APP_TYPE_LNT">
	//   11   22:iconst_1        
	//   12   23:iconst_2        
	//   13   24:ldc1            #32  <String "\u5CAD\u5357\u901A">
	//   14   26:invokespecial   #27  <Method void EnumCardAppType(String, int, int, String)>
	//   15   29:putstatic       #34  <Field EnumCardAppType CARD_APP_TYPE_LNT>
		CARD_APP_TYPE_SH_TOUR = new EnumCardAppType("CARD_APP_TYPE_SH_TOUR", 2, 3, "\u4E0A\u6D77\u65C5\u6E38\u5361");
	//   16   32:new             #2   <Class EnumCardAppType>
	//   17   35:dup             
	//   18   36:ldc1            #35  <String "CARD_APP_TYPE_SH_TOUR">
	//   19   38:iconst_2        
	//   20   39:iconst_3        
	//   21   40:ldc1            #37  <String "\u4E0A\u6D77\u65C5\u6E38\u5361">
	//   22   42:invokespecial   #27  <Method void EnumCardAppType(String, int, int, String)>
	//   23   45:putstatic       #39  <Field EnumCardAppType CARD_APP_TYPE_SH_TOUR>
		CARD_APP_TYPE_SH_RENT = new EnumCardAppType("CARD_APP_TYPE_SH_RENT", 3, 4, "\u4E0A\u6D77\u77ED\u79DF\u5361");
	//   24   48:new             #2   <Class EnumCardAppType>
	//   25   51:dup             
	//   26   52:ldc1            #40  <String "CARD_APP_TYPE_SH_RENT">
	//   27   54:iconst_3        
	//   28   55:iconst_4        
	//   29   56:ldc1            #42  <String "\u4E0A\u6D77\u77ED\u79DF\u5361">
	//   30   58:invokespecial   #27  <Method void EnumCardAppType(String, int, int, String)>
	//   31   61:putstatic       #44  <Field EnumCardAppType CARD_APP_TYPE_SH_RENT>
		ENUM$VALUES = (new EnumCardAppType[] {
			CARD_APP_TYPE_SH, CARD_APP_TYPE_LNT, CARD_APP_TYPE_SH_TOUR, CARD_APP_TYPE_SH_RENT
		});
	//   32   64:iconst_4        
	//   33   65:anewarray       EnumCardAppType[]
	//   34   68:dup             
	//   35   69:iconst_0        
	//   36   70:getstatic       #29  <Field EnumCardAppType CARD_APP_TYPE_SH>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_1        
	//   40   76:getstatic       #34  <Field EnumCardAppType CARD_APP_TYPE_LNT>
	//   41   79:aastore         
	//   42   80:dup             
	//   43   81:iconst_2        
	//   44   82:getstatic       #39  <Field EnumCardAppType CARD_APP_TYPE_SH_TOUR>
	//   45   85:aastore         
	//   46   86:dup             
	//   47   87:iconst_3        
	//   48   88:getstatic       #44  <Field EnumCardAppType CARD_APP_TYPE_SH_RENT>
	//   49   91:aastore         
	//   50   92:putstatic       #46  <Field EnumCardAppType[] ENUM$VALUES>
	//*  51   95:return          
	}
}
