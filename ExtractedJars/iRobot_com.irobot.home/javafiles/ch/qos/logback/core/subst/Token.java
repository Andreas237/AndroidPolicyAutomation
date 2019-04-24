// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.subst;


public class Token
{
	public static final class Type extends Enum
	{

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(ch/qos/logback/core/subst/Token$Type, s);
		//    0    0:ldc1            #2   <Class Token$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Token$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field Token$Type[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lch.qos.logback.core.subst.Token$Type_3B_.clone()>
		//    2    6:checkcast       #50  <Class Token$Type[]>
		//    3    9:areturn         
		}

		private static final Type $VALUES[];
		public static final Type CURLY_LEFT;
		public static final Type CURLY_RIGHT;
		public static final Type DEFAULT;
		public static final Type LITERAL;
		public static final Type START;

		static 
		{
			LITERAL = new Type("LITERAL", 0);
		//    0    0:new             #2   <Class Token$Type>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "LITERAL">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void Token$Type(String, int)>
		//    5   10:putstatic       #25  <Field Token$Type LITERAL>
			START = new Type("START", 1);
		//    6   13:new             #2   <Class Token$Type>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "START">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void Token$Type(String, int)>
		//   11   23:putstatic       #28  <Field Token$Type START>
			CURLY_LEFT = new Type("CURLY_LEFT", 2);
		//   12   26:new             #2   <Class Token$Type>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "CURLY_LEFT">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void Token$Type(String, int)>
		//   17   36:putstatic       #31  <Field Token$Type CURLY_LEFT>
			CURLY_RIGHT = new Type("CURLY_RIGHT", 3);
		//   18   39:new             #2   <Class Token$Type>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "CURLY_RIGHT">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void Token$Type(String, int)>
		//   23   49:putstatic       #34  <Field Token$Type CURLY_RIGHT>
			DEFAULT = new Type("DEFAULT", 4);
		//   24   52:new             #2   <Class Token$Type>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "DEFAULT">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void Token$Type(String, int)>
		//   29   62:putstatic       #37  <Field Token$Type DEFAULT>
			$VALUES = (new Type[] {
				LITERAL, START, CURLY_LEFT, CURLY_RIGHT, DEFAULT
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       Type[]
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

		private Type(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public Token(Type type1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		type = type1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #47  <Field Token$Type type>
		payload = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #49  <Field String payload>
	//    8   14:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          76
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #55  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #55  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((Token)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class Token>
	//   16   28:astore_1        
			if(type != ((Token) (obj)).type)
	//*  17   29:aload_0         
	//*  18   30:getfield        #47  <Field Token$Type type>
	//*  19   33:aload_1         
	//*  20   34:getfield        #47  <Field Token$Type type>
	//*  21   37:if_acmpeq       42
				return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
			if(payload != null)
	//*  24   42:aload_0         
	//*  25   43:getfield        #49  <Field String payload>
	//*  26   46:ifnull          65
			{
				if(!payload.equals(((Object) (((Token) (obj)).payload))))
	//*  27   49:aload_0         
	//*  28   50:getfield        #49  <Field String payload>
	//*  29   53:aload_1         
	//*  30   54:getfield        #49  <Field String payload>
	//*  31   57:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  32   60:ifne            74
					return false;
	//   33   63:iconst_0        
	//   34   64:ireturn         
			} else
			if(((Token) (obj)).payload != null)
	//*  35   65:aload_1         
	//*  36   66:getfield        #49  <Field String payload>
	//*  37   69:ifnull          74
				return false;
	//   38   72:iconst_0        
	//   39   73:ireturn         
			return true;
	//   40   74:iconst_1        
	//   41   75:ireturn         
		} else
		{
			return false;
	//   42   76:iconst_0        
	//   43   77:ireturn         
		}
	}

	public int hashCode()
	{
		Type type1 = type;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Token$Type type>
	//    2    4:astore_3        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		int i;
		if(type1 != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          22
			i = type.hashCode();
	//    7   11:aload_0         
	//    8   12:getfield        #47  <Field Token$Type type>
	//    9   15:invokevirtual   #63  <Method int Token$Type.hashCode()>
	//   10   18:istore_1        
		else
	//*  11   19:goto            24
			i = 0;
	//   12   22:iconst_0        
	//   13   23:istore_1        
		if(payload != null)
	//*  14   24:aload_0         
	//*  15   25:getfield        #49  <Field String payload>
	//*  16   28:ifnull          39
			j = payload.hashCode();
	//   17   31:aload_0         
	//   18   32:getfield        #49  <Field String payload>
	//   19   35:invokevirtual   #64  <Method int String.hashCode()>
	//   20   38:istore_2        
		return i * 31 + j;
	//   21   39:iload_1         
	//   22   40:bipush          31
	//   23   42:imul            
	//   24   43:iload_2         
	//   25   44:iadd            
	//   26   45:ireturn         
	}

	public String toString()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #68  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append("Token{type=");
	//    4    8:aload_1         
	//    5    9:ldc1            #71  <String "Token{type=">
	//    6   11:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(((Object) (type)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #47  <Field Token$Type type>
	//   11   20:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		Object obj1 = ((Object) (((StringBuilder) (obj)).toString()));
	//   13   24:aload_1         
	//   14   25:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   15   28:astore_2        
		obj = obj1;
	//   16   29:aload_2         
	//   17   30:astore_1        
		if(payload != null)
	//*  18   31:aload_0         
	//*  19   32:getfield        #49  <Field String payload>
	//*  20   35:ifnull          80
		{
			obj = ((Object) (new StringBuilder()));
	//   21   38:new             #68  <Class StringBuilder>
	//   22   41:dup             
	//   23   42:invokespecial   #69  <Method void StringBuilder()>
	//   24   45:astore_1        
			((StringBuilder) (obj)).append(((String) (obj1)));
	//   25   46:aload_1         
	//   26   47:aload_2         
	//   27   48:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   28   51:pop             
			((StringBuilder) (obj)).append(", payload='");
	//   29   52:aload_1         
	//   30   53:ldc1            #82  <String ", payload='">
	//   31   55:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   32   58:pop             
			((StringBuilder) (obj)).append(payload);
	//   33   59:aload_1         
	//   34   60:aload_0         
	//   35   61:getfield        #49  <Field String payload>
	//   36   64:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   37   67:pop             
			((StringBuilder) (obj)).append('\'');
	//   38   68:aload_1         
	//   39   69:bipush          39
	//   40   71:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//   41   74:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   42   75:aload_1         
	//   43   76:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   44   79:astore_1        
		}
		obj1 = ((Object) (new StringBuilder()));
	//   45   80:new             #68  <Class StringBuilder>
	//   46   83:dup             
	//   47   84:invokespecial   #69  <Method void StringBuilder()>
	//   48   87:astore_2        
		((StringBuilder) (obj1)).append(((String) (obj)));
	//   49   88:aload_2         
	//   50   89:aload_1         
	//   51   90:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   52   93:pop             
		((StringBuilder) (obj1)).append('}');
	//   53   94:aload_2         
	//   54   95:bipush          125
	//   55   97:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//   56  100:pop             
		return ((StringBuilder) (obj1)).toString();
	//   57  101:aload_2         
	//   58  102:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   59  105:areturn         
	}

	public static final Token CURLY_LEFT_TOKEN;
	public static final Token CURLY_RIGHT_TOKEN;
	public static final Token DEFAULT_SEP_TOKEN;
	public static final Token START_TOKEN;
	String payload;
	Type type;

	static 
	{
		START_TOKEN = new Token(Type.START, ((String) (null)));
	//    0    0:new             #2   <Class Token>
	//    1    3:dup             
	//    2    4:getstatic       #21  <Field Token$Type Token$Type.START>
	//    3    7:aconst_null     
	//    4    8:invokespecial   #25  <Method void Token(Token$Type, String)>
	//    5   11:putstatic       #27  <Field Token START_TOKEN>
		CURLY_LEFT_TOKEN = new Token(Type.CURLY_LEFT, ((String) (null)));
	//    6   14:new             #2   <Class Token>
	//    7   17:dup             
	//    8   18:getstatic       #30  <Field Token$Type Token$Type.CURLY_LEFT>
	//    9   21:aconst_null     
	//   10   22:invokespecial   #25  <Method void Token(Token$Type, String)>
	//   11   25:putstatic       #32  <Field Token CURLY_LEFT_TOKEN>
		CURLY_RIGHT_TOKEN = new Token(Type.CURLY_RIGHT, ((String) (null)));
	//   12   28:new             #2   <Class Token>
	//   13   31:dup             
	//   14   32:getstatic       #35  <Field Token$Type Token$Type.CURLY_RIGHT>
	//   15   35:aconst_null     
	//   16   36:invokespecial   #25  <Method void Token(Token$Type, String)>
	//   17   39:putstatic       #37  <Field Token CURLY_RIGHT_TOKEN>
		DEFAULT_SEP_TOKEN = new Token(Type.DEFAULT, ((String) (null)));
	//   18   42:new             #2   <Class Token>
	//   19   45:dup             
	//   20   46:getstatic       #40  <Field Token$Type Token$Type.DEFAULT>
	//   21   49:aconst_null     
	//   22   50:invokespecial   #25  <Method void Token(Token$Type, String)>
	//   23   53:putstatic       #42  <Field Token DEFAULT_SEP_TOKEN>
	//*  24   56:return          
	}
}
