// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.lang.annotation.Annotation;

public interface JsonTypeInfo
	extends Annotation
{
	public static final class As extends Enum
	{

		public static As valueOf(String s)
		{
			return (As)Enum.valueOf(com/fasterxml/jackson/annotation/JsonTypeInfo$As, s);
		//    0    0:ldc1            #2   <Class JsonTypeInfo$As>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonTypeInfo$As>
		//    4    9:areturn         
		}

		public static As[] values()
		{
			return (As[])((As []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field JsonTypeInfo$As[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonTypeInfo$As_3B_.clone()>
		//    2    6:checkcast       #50  <Class JsonTypeInfo$As[]>
		//    3    9:areturn         
		}

		private static final As $VALUES[];
		public static final As EXISTING_PROPERTY;
		public static final As EXTERNAL_PROPERTY;
		public static final As PROPERTY;
		public static final As WRAPPER_ARRAY;
		public static final As WRAPPER_OBJECT;

		static 
		{
			PROPERTY = new As("PROPERTY", 0);
		//    0    0:new             #2   <Class JsonTypeInfo$As>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "PROPERTY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void JsonTypeInfo$As(String, int)>
		//    5   10:putstatic       #25  <Field JsonTypeInfo$As PROPERTY>
			WRAPPER_OBJECT = new As("WRAPPER_OBJECT", 1);
		//    6   13:new             #2   <Class JsonTypeInfo$As>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "WRAPPER_OBJECT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void JsonTypeInfo$As(String, int)>
		//   11   23:putstatic       #28  <Field JsonTypeInfo$As WRAPPER_OBJECT>
			WRAPPER_ARRAY = new As("WRAPPER_ARRAY", 2);
		//   12   26:new             #2   <Class JsonTypeInfo$As>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "WRAPPER_ARRAY">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void JsonTypeInfo$As(String, int)>
		//   17   36:putstatic       #31  <Field JsonTypeInfo$As WRAPPER_ARRAY>
			EXTERNAL_PROPERTY = new As("EXTERNAL_PROPERTY", 3);
		//   18   39:new             #2   <Class JsonTypeInfo$As>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "EXTERNAL_PROPERTY">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void JsonTypeInfo$As(String, int)>
		//   23   49:putstatic       #34  <Field JsonTypeInfo$As EXTERNAL_PROPERTY>
			EXISTING_PROPERTY = new As("EXISTING_PROPERTY", 4);
		//   24   52:new             #2   <Class JsonTypeInfo$As>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "EXISTING_PROPERTY">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void JsonTypeInfo$As(String, int)>
		//   29   62:putstatic       #37  <Field JsonTypeInfo$As EXISTING_PROPERTY>
			$VALUES = (new As[] {
				PROPERTY, WRAPPER_OBJECT, WRAPPER_ARRAY, EXTERNAL_PROPERTY, EXISTING_PROPERTY
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       As[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field JsonTypeInfo$As PROPERTY>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field JsonTypeInfo$As WRAPPER_OBJECT>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field JsonTypeInfo$As WRAPPER_ARRAY>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field JsonTypeInfo$As EXTERNAL_PROPERTY>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field JsonTypeInfo$As EXISTING_PROPERTY>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field JsonTypeInfo$As[] $VALUES>
		//*  53  102:return          
		}

		private As(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class Id extends Enum
	{

		public static Id valueOf(String s)
		{
			return (Id)Enum.valueOf(com/fasterxml/jackson/annotation/JsonTypeInfo$Id, s);
		//    0    0:ldc1            #2   <Class JsonTypeInfo$Id>
		//    1    2:aload_0         
		//    2    3:invokestatic    #60  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonTypeInfo$Id>
		//    4    9:areturn         
		}

		public static Id[] values()
		{
			return (Id[])((Id []) ($VALUES)).clone();
		//    0    0:getstatic       #47  <Field JsonTypeInfo$Id[] $VALUES>
		//    1    3:invokevirtual   #67  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonTypeInfo$Id_3B_.clone()>
		//    2    6:checkcast       #63  <Class JsonTypeInfo$Id[]>
		//    3    9:areturn         
		}

		public String getDefaultPropertyName()
		{
			return _defaultPropertyName;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field String _defaultPropertyName>
		//    2    4:areturn         
		}

		private static final Id $VALUES[];
		public static final Id CLASS;
		public static final Id CUSTOM;
		public static final Id MINIMAL_CLASS;
		public static final Id NAME;
		public static final Id NONE;
		private final String _defaultPropertyName;

		static 
		{
			NONE = new Id("NONE", 0, ((String) (null)));
		//    0    0:new             #2   <Class JsonTypeInfo$Id>
		//    1    3:dup             
		//    2    4:ldc1            #21  <String "NONE">
		//    3    6:iconst_0        
		//    4    7:aconst_null     
		//    5    8:invokespecial   #25  <Method void JsonTypeInfo$Id(String, int, String)>
		//    6   11:putstatic       #27  <Field JsonTypeInfo$Id NONE>
			CLASS = new Id("CLASS", 1, "@class");
		//    7   14:new             #2   <Class JsonTypeInfo$Id>
		//    8   17:dup             
		//    9   18:ldc1            #28  <String "CLASS">
		//   10   20:iconst_1        
		//   11   21:ldc1            #30  <String "@class">
		//   12   23:invokespecial   #25  <Method void JsonTypeInfo$Id(String, int, String)>
		//   13   26:putstatic       #32  <Field JsonTypeInfo$Id CLASS>
			MINIMAL_CLASS = new Id("MINIMAL_CLASS", 2, "@c");
		//   14   29:new             #2   <Class JsonTypeInfo$Id>
		//   15   32:dup             
		//   16   33:ldc1            #33  <String "MINIMAL_CLASS">
		//   17   35:iconst_2        
		//   18   36:ldc1            #35  <String "@c">
		//   19   38:invokespecial   #25  <Method void JsonTypeInfo$Id(String, int, String)>
		//   20   41:putstatic       #37  <Field JsonTypeInfo$Id MINIMAL_CLASS>
			NAME = new Id("NAME", 3, "@type");
		//   21   44:new             #2   <Class JsonTypeInfo$Id>
		//   22   47:dup             
		//   23   48:ldc1            #38  <String "NAME">
		//   24   50:iconst_3        
		//   25   51:ldc1            #40  <String "@type">
		//   26   53:invokespecial   #25  <Method void JsonTypeInfo$Id(String, int, String)>
		//   27   56:putstatic       #42  <Field JsonTypeInfo$Id NAME>
			CUSTOM = new Id("CUSTOM", 4, ((String) (null)));
		//   28   59:new             #2   <Class JsonTypeInfo$Id>
		//   29   62:dup             
		//   30   63:ldc1            #43  <String "CUSTOM">
		//   31   65:iconst_4        
		//   32   66:aconst_null     
		//   33   67:invokespecial   #25  <Method void JsonTypeInfo$Id(String, int, String)>
		//   34   70:putstatic       #45  <Field JsonTypeInfo$Id CUSTOM>
			$VALUES = (new Id[] {
				NONE, CLASS, MINIMAL_CLASS, NAME, CUSTOM
			});
		//   35   73:iconst_5        
		//   36   74:anewarray       Id[]
		//   37   77:dup             
		//   38   78:iconst_0        
		//   39   79:getstatic       #27  <Field JsonTypeInfo$Id NONE>
		//   40   82:aastore         
		//   41   83:dup             
		//   42   84:iconst_1        
		//   43   85:getstatic       #32  <Field JsonTypeInfo$Id CLASS>
		//   44   88:aastore         
		//   45   89:dup             
		//   46   90:iconst_2        
		//   47   91:getstatic       #37  <Field JsonTypeInfo$Id MINIMAL_CLASS>
		//   48   94:aastore         
		//   49   95:dup             
		//   50   96:iconst_3        
		//   51   97:getstatic       #42  <Field JsonTypeInfo$Id NAME>
		//   52  100:aastore         
		//   53  101:dup             
		//   54  102:iconst_4        
		//   55  103:getstatic       #45  <Field JsonTypeInfo$Id CUSTOM>
		//   56  106:aastore         
		//   57  107:putstatic       #47  <Field JsonTypeInfo$Id[] $VALUES>
		//*  58  110:return          
		}

		private Id(String s, int i, String s1)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #51  <Method void Enum(String, int)>
			_defaultPropertyName = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #53  <Field String _defaultPropertyName>
		//    7   11:return          
		}
	}

	public static abstract class None
	{

		public None()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}
	}


	public abstract Class defaultImpl();

	public abstract As include();

	public abstract String property();

	public abstract Id use();

	public abstract boolean visible();
}
