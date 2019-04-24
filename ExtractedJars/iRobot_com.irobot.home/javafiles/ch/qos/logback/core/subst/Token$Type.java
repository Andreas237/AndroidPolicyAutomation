// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.subst;


// Referenced classes of package ch.qos.logback.core.subst:
//			Token

public static final class Token$Type extends Enum
{

	public static Token$Type valueOf(String s)
	{
		return (Token$Type)Enum.valueOf(ch/qos/logback/core/subst/Token$Type, s);
	//    0    0:ldc1            #2   <Class Token$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Token$Type>
	//    4    9:areturn         
	}

	public static Token$Type[] values()
	{
		return (Token$Type[])((Token$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field Token$Type[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lch.qos.logback.core.subst.Token$Type_3B_.clone()>
	//    2    6:checkcast       #50  <Class Token$Type[]>
	//    3    9:areturn         
	}

	private static final Token$Type $VALUES[];
	public static final Token$Type CURLY_LEFT;
	public static final Token$Type CURLY_RIGHT;
	public static final Token$Type DEFAULT;
	public static final Token$Type LITERAL;
	public static final Token$Type START;

	static 
	{
		LITERAL = new Token$Type("LITERAL", 0);
	//    0    0:new             #2   <Class Token$Type>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "LITERAL">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void Token$Type(String, int)>
	//    5   10:putstatic       #25  <Field Token$Type LITERAL>
		START = new Token$Type("START", 1);
	//    6   13:new             #2   <Class Token$Type>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "START">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void Token$Type(String, int)>
	//   11   23:putstatic       #28  <Field Token$Type START>
		CURLY_LEFT = new Token$Type("CURLY_LEFT", 2);
	//   12   26:new             #2   <Class Token$Type>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "CURLY_LEFT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void Token$Type(String, int)>
	//   17   36:putstatic       #31  <Field Token$Type CURLY_LEFT>
		CURLY_RIGHT = new Token$Type("CURLY_RIGHT", 3);
	//   18   39:new             #2   <Class Token$Type>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "CURLY_RIGHT">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void Token$Type(String, int)>
	//   23   49:putstatic       #34  <Field Token$Type CURLY_RIGHT>
		DEFAULT = new Token$Type("DEFAULT", 4);
	//   24   52:new             #2   <Class Token$Type>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "DEFAULT">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void Token$Type(String, int)>
	//   29   62:putstatic       #37  <Field Token$Type DEFAULT>
		$VALUES = (new Token$Type[] {
			LITERAL, START, CURLY_LEFT, CURLY_RIGHT, DEFAULT
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       Token$Type[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field Token$Type LITERAL>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field Token$Type START>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field Token$Type CURLY_LEFT>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field Token$Type CURLY_RIGHT>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field Token$Type DEFAULT>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field Token$Type[] $VALUES>
	//*  53  102:return          
	}

	private Token$Type(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
