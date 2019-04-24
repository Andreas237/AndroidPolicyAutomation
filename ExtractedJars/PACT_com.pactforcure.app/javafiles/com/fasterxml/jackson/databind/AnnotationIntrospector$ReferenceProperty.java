// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;


// Referenced classes of package com.fasterxml.jackson.databind:
//			AnnotationIntrospector

public static class AnnotationIntrospector$ReferenceProperty
{
	public static final class Type extends Enum
	{

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(com/fasterxml/jackson/databind/AnnotationIntrospector$ReferenceProperty$Type, s);
		//    0    0:ldc1            #2   <Class AnnotationIntrospector$ReferenceProperty$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #38  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AnnotationIntrospector$ReferenceProperty$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #30  <Field AnnotationIntrospector$ReferenceProperty$Type[] $VALUES>
		//    1    3:invokevirtual   #45  <Method Object _5B_Lcom.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty$Type_3B_.clone()>
		//    2    6:checkcast       #41  <Class AnnotationIntrospector$ReferenceProperty$Type[]>
		//    3    9:areturn         
		}

		private static final Type $VALUES[];
		public static final Type BACK_REFERENCE;
		public static final Type MANAGED_REFERENCE;

		static 
		{
			MANAGED_REFERENCE = new Type("MANAGED_REFERENCE", 0);
		//    0    0:new             #2   <Class AnnotationIntrospector$ReferenceProperty$Type>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "MANAGED_REFERENCE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void AnnotationIntrospector$ReferenceProperty$Type(String, int)>
		//    5   10:putstatic       #25  <Field AnnotationIntrospector$ReferenceProperty$Type MANAGED_REFERENCE>
			BACK_REFERENCE = new Type("BACK_REFERENCE", 1);
		//    6   13:new             #2   <Class AnnotationIntrospector$ReferenceProperty$Type>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "BACK_REFERENCE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void AnnotationIntrospector$ReferenceProperty$Type(String, int)>
		//   11   23:putstatic       #28  <Field AnnotationIntrospector$ReferenceProperty$Type BACK_REFERENCE>
			$VALUES = (new Type[] {
				MANAGED_REFERENCE, BACK_REFERENCE
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       Type[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #25  <Field AnnotationIntrospector$ReferenceProperty$Type MANAGED_REFERENCE>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #28  <Field AnnotationIntrospector$ReferenceProperty$Type BACK_REFERENCE>
		//   21   41:aastore         
		//   22   42:putstatic       #30  <Field AnnotationIntrospector$ReferenceProperty$Type[] $VALUES>
		//*  23   45:return          
		}

		private Type(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #32  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public static AnnotationIntrospector$ReferenceProperty back(String s)
	{
		return new AnnotationIntrospector$ReferenceProperty(Type.BACK_REFERENCE, s);
	//    0    0:new             #2   <Class AnnotationIntrospector$ReferenceProperty>
	//    1    3:dup             
	//    2    4:getstatic       #29  <Field AnnotationIntrospector$ReferenceProperty$Type AnnotationIntrospector$ReferenceProperty$Type.BACK_REFERENCE>
	//    3    7:aload_0         
	//    4    8:invokespecial   #31  <Method void AnnotationIntrospector$ReferenceProperty(AnnotationIntrospector$ReferenceProperty$Type, String)>
	//    5   11:areturn         
	}

	public static AnnotationIntrospector$ReferenceProperty managed(String s)
	{
		return new AnnotationIntrospector$ReferenceProperty(Type.MANAGED_REFERENCE, s);
	//    0    0:new             #2   <Class AnnotationIntrospector$ReferenceProperty>
	//    1    3:dup             
	//    2    4:getstatic       #35  <Field AnnotationIntrospector$ReferenceProperty$Type AnnotationIntrospector$ReferenceProperty$Type.MANAGED_REFERENCE>
	//    3    7:aload_0         
	//    4    8:invokespecial   #31  <Method void AnnotationIntrospector$ReferenceProperty(AnnotationIntrospector$ReferenceProperty$Type, String)>
	//    5   11:areturn         
	}

	public String getName()
	{
		return _name;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String _name>
	//    2    4:areturn         
	}

	public Type getType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnnotationIntrospector$ReferenceProperty$Type _type>
	//    2    4:areturn         
	}

	public boolean isBackReference()
	{
		return _type == Type.BACK_REFERENCE;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnnotationIntrospector$ReferenceProperty$Type _type>
	//    2    4:getstatic       #29  <Field AnnotationIntrospector$ReferenceProperty$Type AnnotationIntrospector$ReferenceProperty$Type.BACK_REFERENCE>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isManagedReference()
	{
		return _type == Type.MANAGED_REFERENCE;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnnotationIntrospector$ReferenceProperty$Type _type>
	//    2    4:getstatic       #35  <Field AnnotationIntrospector$ReferenceProperty$Type AnnotationIntrospector$ReferenceProperty$Type.MANAGED_REFERENCE>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	private final String _name;
	private final Type _type;

	public AnnotationIntrospector$ReferenceProperty(Type type, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		_type = type;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field AnnotationIntrospector$ReferenceProperty$Type _type>
		_name = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field String _name>
	//    8   14:return          
	}
}
