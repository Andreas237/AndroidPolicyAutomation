// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;


public final class OptBoolean extends Enum
{

	private OptBoolean(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #30  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static OptBoolean fromBoolean(Boolean boolean1)
	{
		if(boolean1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return DEFAULT;
	//    2    4:getstatic       #26  <Field OptBoolean DEFAULT>
	//    3    7:areturn         
		if(boolean1.booleanValue())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #39  <Method boolean Boolean.booleanValue()>
	//*   6   12:ifeq            19
			return TRUE;
	//    7   15:getstatic       #20  <Field OptBoolean TRUE>
	//    8   18:areturn         
		else
			return FALSE;
	//    9   19:getstatic       #23  <Field OptBoolean FALSE>
	//   10   22:areturn         
	}

	public static OptBoolean valueOf(String s)
	{
		return (OptBoolean)Enum.valueOf(com/fasterxml/jackson/annotation/OptBoolean, s);
	//    0    0:ldc1            #2   <Class OptBoolean>
	//    1    2:aload_0         
	//    2    3:invokestatic    #44  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class OptBoolean>
	//    4    9:areturn         
	}

	public static OptBoolean[] values()
	{
		return (OptBoolean[])((OptBoolean []) ($VALUES)).clone();
	//    0    0:getstatic       #28  <Field OptBoolean[] $VALUES>
	//    1    3:invokevirtual   #51  <Method Object _5B_Lcom.fasterxml.jackson.annotation.OptBoolean_3B_.clone()>
	//    2    6:checkcast       #47  <Class OptBoolean[]>
	//    3    9:areturn         
	}

	public Boolean asBoolean()
	{
		if(this == DEFAULT)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #26  <Field OptBoolean DEFAULT>
	//*   2    4:if_acmpne       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(this == TRUE)
	//*   5    9:aload_0         
	//*   6   10:getstatic       #20  <Field OptBoolean TRUE>
	//*   7   13:if_acmpne       20
			return Boolean.TRUE;
	//    8   16:getstatic       #56  <Field Boolean Boolean.TRUE>
	//    9   19:areturn         
		else
			return Boolean.FALSE;
	//   10   20:getstatic       #58  <Field Boolean Boolean.FALSE>
	//   11   23:areturn         
	}

	public boolean asPrimitive()
	{
		return this == TRUE;
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field OptBoolean TRUE>
	//    2    4:if_acmpne       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private static final OptBoolean $VALUES[];
	public static final OptBoolean DEFAULT;
	public static final OptBoolean FALSE;
	public static final OptBoolean TRUE;

	static 
	{
		TRUE = new OptBoolean("TRUE", 0);
	//    0    0:new             #2   <Class OptBoolean>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "TRUE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #18  <Method void OptBoolean(String, int)>
	//    5   10:putstatic       #20  <Field OptBoolean TRUE>
		FALSE = new OptBoolean("FALSE", 1);
	//    6   13:new             #2   <Class OptBoolean>
	//    7   16:dup             
	//    8   17:ldc1            #21  <String "FALSE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #18  <Method void OptBoolean(String, int)>
	//   11   23:putstatic       #23  <Field OptBoolean FALSE>
		DEFAULT = new OptBoolean("DEFAULT", 2);
	//   12   26:new             #2   <Class OptBoolean>
	//   13   29:dup             
	//   14   30:ldc1            #24  <String "DEFAULT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #18  <Method void OptBoolean(String, int)>
	//   17   36:putstatic       #26  <Field OptBoolean DEFAULT>
		$VALUES = (new OptBoolean[] {
			TRUE, FALSE, DEFAULT
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       OptBoolean[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #20  <Field OptBoolean TRUE>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #23  <Field OptBoolean FALSE>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #26  <Field OptBoolean DEFAULT>
	//   31   60:aastore         
	//   32   61:putstatic       #28  <Field OptBoolean[] $VALUES>
	//*  33   64:return          
	}
}
