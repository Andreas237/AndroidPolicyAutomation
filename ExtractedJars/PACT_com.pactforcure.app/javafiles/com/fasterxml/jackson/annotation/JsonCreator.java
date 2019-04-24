// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.lang.annotation.Annotation;

public interface JsonCreator
	extends Annotation
{
	public static final class Mode extends Enum
	{

		public static Mode valueOf(String s)
		{
			return (Mode)Enum.valueOf(com/fasterxml/jackson/annotation/JsonCreator$Mode, s);
		//    0    0:ldc1            #2   <Class JsonCreator$Mode>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonCreator$Mode>
		//    4    9:areturn         
		}

		public static Mode[] values()
		{
			return (Mode[])((Mode []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field JsonCreator$Mode[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonCreator$Mode_3B_.clone()>
		//    2    6:checkcast       #46  <Class JsonCreator$Mode[]>
		//    3    9:areturn         
		}

		private static final Mode $VALUES[];
		public static final Mode DEFAULT;
		public static final Mode DELEGATING;
		public static final Mode DISABLED;
		public static final Mode PROPERTIES;

		static 
		{
			DEFAULT = new Mode("DEFAULT", 0);
		//    0    0:new             #2   <Class JsonCreator$Mode>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "DEFAULT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void JsonCreator$Mode(String, int)>
		//    5   10:putstatic       #24  <Field JsonCreator$Mode DEFAULT>
			DELEGATING = new Mode("DELEGATING", 1);
		//    6   13:new             #2   <Class JsonCreator$Mode>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "DELEGATING">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void JsonCreator$Mode(String, int)>
		//   11   23:putstatic       #27  <Field JsonCreator$Mode DELEGATING>
			PROPERTIES = new Mode("PROPERTIES", 2);
		//   12   26:new             #2   <Class JsonCreator$Mode>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "PROPERTIES">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void JsonCreator$Mode(String, int)>
		//   17   36:putstatic       #30  <Field JsonCreator$Mode PROPERTIES>
			DISABLED = new Mode("DISABLED", 3);
		//   18   39:new             #2   <Class JsonCreator$Mode>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "DISABLED">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void JsonCreator$Mode(String, int)>
		//   23   49:putstatic       #33  <Field JsonCreator$Mode DISABLED>
			$VALUES = (new Mode[] {
				DEFAULT, DELEGATING, PROPERTIES, DISABLED
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       Mode[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field JsonCreator$Mode DEFAULT>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field JsonCreator$Mode DELEGATING>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field JsonCreator$Mode PROPERTIES>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field JsonCreator$Mode DISABLED>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field JsonCreator$Mode[] $VALUES>
		//*  43   83:return          
		}

		private Mode(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public abstract Mode mode();
}
