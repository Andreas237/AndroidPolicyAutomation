// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.type;

import com.fasterxml.jackson.core.JsonToken;

public class WritableTypeId
{
	public static final class Inclusion extends Enum
	{

		public static Inclusion valueOf(String s)
		{
			return (Inclusion)Enum.valueOf(com/fasterxml/jackson/core/type/WritableTypeId$Inclusion, s);
		//    0    0:ldc1            #2   <Class WritableTypeId$Inclusion>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class WritableTypeId$Inclusion>
		//    4    9:areturn         
		}

		public static Inclusion[] values()
		{
			return (Inclusion[])((Inclusion []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field WritableTypeId$Inclusion[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.fasterxml.jackson.core.type.WritableTypeId$Inclusion_3B_.clone()>
		//    2    6:checkcast       #50  <Class WritableTypeId$Inclusion[]>
		//    3    9:areturn         
		}

		public boolean requiresObjectContext()
		{
			return this == METADATA_PROPERTY || this == PAYLOAD_PROPERTY;
		//    0    0:aload_0         
		//    1    1:getstatic       #31  <Field WritableTypeId$Inclusion METADATA_PROPERTY>
		//    2    4:if_acmpeq       19
		//    3    7:aload_0         
		//    4    8:getstatic       #34  <Field WritableTypeId$Inclusion PAYLOAD_PROPERTY>
		//    5   11:if_acmpne       17
		//    6   14:goto            19
		//    7   17:iconst_0        
		//    8   18:ireturn         
		//    9   19:iconst_1        
		//   10   20:ireturn         
		}

		private static final Inclusion $VALUES[];
		public static final Inclusion METADATA_PROPERTY;
		public static final Inclusion PARENT_PROPERTY;
		public static final Inclusion PAYLOAD_PROPERTY;
		public static final Inclusion WRAPPER_ARRAY;
		public static final Inclusion WRAPPER_OBJECT;

		static 
		{
			WRAPPER_ARRAY = new Inclusion("WRAPPER_ARRAY", 0);
		//    0    0:new             #2   <Class WritableTypeId$Inclusion>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "WRAPPER_ARRAY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void WritableTypeId$Inclusion(String, int)>
		//    5   10:putstatic       #25  <Field WritableTypeId$Inclusion WRAPPER_ARRAY>
			WRAPPER_OBJECT = new Inclusion("WRAPPER_OBJECT", 1);
		//    6   13:new             #2   <Class WritableTypeId$Inclusion>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "WRAPPER_OBJECT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void WritableTypeId$Inclusion(String, int)>
		//   11   23:putstatic       #28  <Field WritableTypeId$Inclusion WRAPPER_OBJECT>
			METADATA_PROPERTY = new Inclusion("METADATA_PROPERTY", 2);
		//   12   26:new             #2   <Class WritableTypeId$Inclusion>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "METADATA_PROPERTY">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void WritableTypeId$Inclusion(String, int)>
		//   17   36:putstatic       #31  <Field WritableTypeId$Inclusion METADATA_PROPERTY>
			PAYLOAD_PROPERTY = new Inclusion("PAYLOAD_PROPERTY", 3);
		//   18   39:new             #2   <Class WritableTypeId$Inclusion>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "PAYLOAD_PROPERTY">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void WritableTypeId$Inclusion(String, int)>
		//   23   49:putstatic       #34  <Field WritableTypeId$Inclusion PAYLOAD_PROPERTY>
			PARENT_PROPERTY = new Inclusion("PARENT_PROPERTY", 4);
		//   24   52:new             #2   <Class WritableTypeId$Inclusion>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "PARENT_PROPERTY">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void WritableTypeId$Inclusion(String, int)>
		//   29   62:putstatic       #37  <Field WritableTypeId$Inclusion PARENT_PROPERTY>
			$VALUES = (new Inclusion[] {
				WRAPPER_ARRAY, WRAPPER_OBJECT, METADATA_PROPERTY, PAYLOAD_PROPERTY, PARENT_PROPERTY
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       Inclusion[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field WritableTypeId$Inclusion WRAPPER_ARRAY>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field WritableTypeId$Inclusion WRAPPER_OBJECT>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field WritableTypeId$Inclusion METADATA_PROPERTY>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field WritableTypeId$Inclusion PAYLOAD_PROPERTY>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field WritableTypeId$Inclusion PARENT_PROPERTY>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field WritableTypeId$Inclusion[] $VALUES>
		//*  53  102:return          
		}

		private Inclusion(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public WritableTypeId()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public WritableTypeId(Object obj, JsonToken jsontoken)
	{
		this(obj, jsontoken, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #30  <Method void WritableTypeId(Object, JsonToken, Object)>
	//    5    7:return          
	}

	public WritableTypeId(Object obj, JsonToken jsontoken, Object obj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		forValue = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field Object forValue>
		id = obj1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #34  <Field Object id>
		valueShape = jsontoken;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #36  <Field JsonToken valueShape>
	//   11   19:return          
	}

	public String asProperty;
	public Object forValue;
	public Class forValueType;
	public Object id;
	public Inclusion include;
	public JsonToken valueShape;
	public boolean wrapperWritten;
}
