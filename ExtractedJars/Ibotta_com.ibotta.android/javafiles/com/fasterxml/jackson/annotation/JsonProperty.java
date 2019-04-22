// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.lang.annotation.Annotation;

public interface JsonProperty
	extends Annotation
{
	public static final class Access extends Enum
	{

		public static Access valueOf(String s)
		{
			return (Access)Enum.valueOf(com/fasterxml/jackson/annotation/JsonProperty$Access, s);
		//    0    0:ldc1            #2   <Class JsonProperty$Access>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonProperty$Access>
		//    4    9:areturn         
		}

		public static Access[] values()
		{
			return (Access[])((Access []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field JsonProperty$Access[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonProperty$Access_3B_.clone()>
		//    2    6:checkcast       #46  <Class JsonProperty$Access[]>
		//    3    9:areturn         
		}

		private static final Access $VALUES[];
		public static final Access AUTO;
		public static final Access READ_ONLY;
		public static final Access READ_WRITE;
		public static final Access WRITE_ONLY;

		static 
		{
			AUTO = new Access("AUTO", 0);
		//    0    0:new             #2   <Class JsonProperty$Access>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "AUTO">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void JsonProperty$Access(String, int)>
		//    5   10:putstatic       #24  <Field JsonProperty$Access AUTO>
			READ_ONLY = new Access("READ_ONLY", 1);
		//    6   13:new             #2   <Class JsonProperty$Access>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "READ_ONLY">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void JsonProperty$Access(String, int)>
		//   11   23:putstatic       #27  <Field JsonProperty$Access READ_ONLY>
			WRITE_ONLY = new Access("WRITE_ONLY", 2);
		//   12   26:new             #2   <Class JsonProperty$Access>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "WRITE_ONLY">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void JsonProperty$Access(String, int)>
		//   17   36:putstatic       #30  <Field JsonProperty$Access WRITE_ONLY>
			READ_WRITE = new Access("READ_WRITE", 3);
		//   18   39:new             #2   <Class JsonProperty$Access>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "READ_WRITE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void JsonProperty$Access(String, int)>
		//   23   49:putstatic       #33  <Field JsonProperty$Access READ_WRITE>
			$VALUES = (new Access[] {
				AUTO, READ_ONLY, WRITE_ONLY, READ_WRITE
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       Access[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field JsonProperty$Access AUTO>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field JsonProperty$Access READ_ONLY>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field JsonProperty$Access WRITE_ONLY>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field JsonProperty$Access READ_WRITE>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field JsonProperty$Access[] $VALUES>
		//*  43   83:return          
		}

		private Access(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public abstract Access access();

	public abstract String defaultValue();

	public abstract int index();

	public abstract boolean required();

	public abstract String value();
}
