// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.annotation;

import java.lang.annotation.Annotation;

public interface JsonSerialize
	extends Annotation
{
	public static final class Inclusion extends Enum
	{

		public static Inclusion valueOf(String s)
		{
			return (Inclusion)Enum.valueOf(com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion, s);
		//    0    0:ldc1            #2   <Class JsonSerialize$Inclusion>
		//    1    2:aload_0         
		//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonSerialize$Inclusion>
		//    4    9:areturn         
		}

		public static Inclusion[] values()
		{
			return (Inclusion[])((Inclusion []) ($VALUES)).clone();
		//    0    0:getstatic       #40  <Field JsonSerialize$Inclusion[] $VALUES>
		//    1    3:invokevirtual   #55  <Method Object _5B_Lcom.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion_3B_.clone()>
		//    2    6:checkcast       #51  <Class JsonSerialize$Inclusion[]>
		//    3    9:areturn         
		}

		private static final Inclusion $VALUES[];
		public static final Inclusion ALWAYS;
		public static final Inclusion DEFAULT_INCLUSION;
		public static final Inclusion NON_DEFAULT;
		public static final Inclusion NON_EMPTY;
		public static final Inclusion NON_NULL;

		static 
		{
			ALWAYS = new Inclusion("ALWAYS", 0);
		//    0    0:new             #2   <Class JsonSerialize$Inclusion>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "ALWAYS">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void JsonSerialize$Inclusion(String, int)>
		//    5   10:putstatic       #26  <Field JsonSerialize$Inclusion ALWAYS>
			NON_NULL = new Inclusion("NON_NULL", 1);
		//    6   13:new             #2   <Class JsonSerialize$Inclusion>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "NON_NULL">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void JsonSerialize$Inclusion(String, int)>
		//   11   23:putstatic       #29  <Field JsonSerialize$Inclusion NON_NULL>
			NON_DEFAULT = new Inclusion("NON_DEFAULT", 2);
		//   12   26:new             #2   <Class JsonSerialize$Inclusion>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "NON_DEFAULT">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void JsonSerialize$Inclusion(String, int)>
		//   17   36:putstatic       #32  <Field JsonSerialize$Inclusion NON_DEFAULT>
			NON_EMPTY = new Inclusion("NON_EMPTY", 3);
		//   18   39:new             #2   <Class JsonSerialize$Inclusion>
		//   19   42:dup             
		//   20   43:ldc1            #33  <String "NON_EMPTY">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #24  <Method void JsonSerialize$Inclusion(String, int)>
		//   23   49:putstatic       #35  <Field JsonSerialize$Inclusion NON_EMPTY>
			DEFAULT_INCLUSION = new Inclusion("DEFAULT_INCLUSION", 4);
		//   24   52:new             #2   <Class JsonSerialize$Inclusion>
		//   25   55:dup             
		//   26   56:ldc1            #36  <String "DEFAULT_INCLUSION">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #24  <Method void JsonSerialize$Inclusion(String, int)>
		//   29   62:putstatic       #38  <Field JsonSerialize$Inclusion DEFAULT_INCLUSION>
			$VALUES = (new Inclusion[] {
				ALWAYS, NON_NULL, NON_DEFAULT, NON_EMPTY, DEFAULT_INCLUSION
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       Inclusion[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #26  <Field JsonSerialize$Inclusion ALWAYS>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #29  <Field JsonSerialize$Inclusion NON_NULL>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #32  <Field JsonSerialize$Inclusion NON_DEFAULT>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #35  <Field JsonSerialize$Inclusion NON_EMPTY>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #38  <Field JsonSerialize$Inclusion DEFAULT_INCLUSION>
		//   51   98:aastore         
		//   52   99:putstatic       #40  <Field JsonSerialize$Inclusion[] $VALUES>
		//*  53  102:return          
		}

		private Inclusion(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #42  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class Typing extends Enum
	{

		public static Typing valueOf(String s)
		{
			return (Typing)Enum.valueOf(com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing, s);
		//    0    0:ldc1            #2   <Class JsonSerialize$Typing>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonSerialize$Typing>
		//    4    9:areturn         
		}

		public static Typing[] values()
		{
			return (Typing[])((Typing []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field JsonSerialize$Typing[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.fasterxml.jackson.databind.annotation.JsonSerialize$Typing_3B_.clone()>
		//    2    6:checkcast       #42  <Class JsonSerialize$Typing[]>
		//    3    9:areturn         
		}

		private static final Typing $VALUES[];
		public static final Typing DEFAULT_TYPING;
		public static final Typing DYNAMIC;
		public static final Typing STATIC;

		static 
		{
			DYNAMIC = new Typing("DYNAMIC", 0);
		//    0    0:new             #2   <Class JsonSerialize$Typing>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "DYNAMIC">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void JsonSerialize$Typing(String, int)>
		//    5   10:putstatic       #23  <Field JsonSerialize$Typing DYNAMIC>
			STATIC = new Typing("STATIC", 1);
		//    6   13:new             #2   <Class JsonSerialize$Typing>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "STATIC">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void JsonSerialize$Typing(String, int)>
		//   11   23:putstatic       #26  <Field JsonSerialize$Typing STATIC>
			DEFAULT_TYPING = new Typing("DEFAULT_TYPING", 2);
		//   12   26:new             #2   <Class JsonSerialize$Typing>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "DEFAULT_TYPING">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void JsonSerialize$Typing(String, int)>
		//   17   36:putstatic       #29  <Field JsonSerialize$Typing DEFAULT_TYPING>
			$VALUES = (new Typing[] {
				DYNAMIC, STATIC, DEFAULT_TYPING
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       Typing[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field JsonSerialize$Typing DYNAMIC>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field JsonSerialize$Typing STATIC>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field JsonSerialize$Typing DEFAULT_TYPING>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field JsonSerialize$Typing[] $VALUES>
		//*  33   64:return          
		}

		private Typing(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public abstract Class as();

	public abstract Class contentAs();

	public abstract Class contentConverter();

	public abstract Class contentUsing();

	public abstract Class converter();

	public abstract Inclusion include();

	public abstract Class keyAs();

	public abstract Class keyUsing();

	public abstract Class nullsUsing();

	public abstract Typing typing();

	public abstract Class using();
}
