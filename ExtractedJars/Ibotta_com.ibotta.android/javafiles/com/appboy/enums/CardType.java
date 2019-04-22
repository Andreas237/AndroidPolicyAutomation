// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums;


public final class CardType extends Enum
{

	private CardType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static CardType fromValue(int i)
	{
		return values()[i];
	//    0    0:invokestatic    #49  <Method CardType[] values()>
	//    1    3:iload_0         
	//    2    4:aaload          
	//    3    5:areturn         
	}

	public static CardType valueOf(String s)
	{
		return (CardType)Enum.valueOf(com/appboy/enums/CardType, s);
	//    0    0:ldc1            #2   <Class CardType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #54  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CardType>
	//    4    9:areturn         
	}

	public static CardType[] values()
	{
		return (CardType[])((CardType []) (a)).clone();
	//    0    0:getstatic       #40  <Field CardType[] a>
	//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.appboy.enums.CardType_3B_.clone()>
	//    2    6:checkcast       #55  <Class CardType[]>
	//    3    9:areturn         
	}

	public int getValue()
	{
		return ordinal();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method int ordinal()>
	//    2    4:ireturn         
	}

	public static final CardType BANNER;
	public static final CardType CAPTIONED_IMAGE;
	public static final CardType CONTROL;
	public static final CardType DEFAULT;
	public static final CardType SHORT_NEWS;
	public static final CardType TEXT_ANNOUNCEMENT;
	private static final CardType a[];

	static 
	{
		BANNER = new CardType("BANNER", 0);
	//    0    0:new             #2   <Class CardType>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "BANNER">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void CardType(String, int)>
	//    5   10:putstatic       #23  <Field CardType BANNER>
		CAPTIONED_IMAGE = new CardType("CAPTIONED_IMAGE", 1);
	//    6   13:new             #2   <Class CardType>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "CAPTIONED_IMAGE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void CardType(String, int)>
	//   11   23:putstatic       #26  <Field CardType CAPTIONED_IMAGE>
		DEFAULT = new CardType("DEFAULT", 2);
	//   12   26:new             #2   <Class CardType>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "DEFAULT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void CardType(String, int)>
	//   17   36:putstatic       #29  <Field CardType DEFAULT>
		SHORT_NEWS = new CardType("SHORT_NEWS", 3);
	//   18   39:new             #2   <Class CardType>
	//   19   42:dup             
	//   20   43:ldc1            #30  <String "SHORT_NEWS">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #21  <Method void CardType(String, int)>
	//   23   49:putstatic       #32  <Field CardType SHORT_NEWS>
		TEXT_ANNOUNCEMENT = new CardType("TEXT_ANNOUNCEMENT", 4);
	//   24   52:new             #2   <Class CardType>
	//   25   55:dup             
	//   26   56:ldc1            #33  <String "TEXT_ANNOUNCEMENT">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #21  <Method void CardType(String, int)>
	//   29   62:putstatic       #35  <Field CardType TEXT_ANNOUNCEMENT>
		CONTROL = new CardType("CONTROL", 5);
	//   30   65:new             #2   <Class CardType>
	//   31   68:dup             
	//   32   69:ldc1            #36  <String "CONTROL">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #21  <Method void CardType(String, int)>
	//   35   75:putstatic       #38  <Field CardType CONTROL>
		a = (new CardType[] {
			BANNER, CAPTIONED_IMAGE, DEFAULT, SHORT_NEWS, TEXT_ANNOUNCEMENT, CONTROL
		});
	//   36   78:bipush          6
	//   37   80:anewarray       CardType[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #23  <Field CardType BANNER>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #26  <Field CardType CAPTIONED_IMAGE>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #29  <Field CardType DEFAULT>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #32  <Field CardType SHORT_NEWS>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #35  <Field CardType TEXT_ANNOUNCEMENT>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #38  <Field CardType CONTROL>
	//   61  118:aastore         
	//   62  119:putstatic       #40  <Field CardType[] a>
	//*  63  122:return          
	}
}
