// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class ErrorReason extends Enum
{

	private ErrorReason(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #34  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ErrorReason valueOf(String s)
	{
		return (ErrorReason)Enum.valueOf(com/irobot/core/ErrorReason, s);
	//    0    0:ldc1            #2   <Class ErrorReason>
	//    1    2:aload_0         
	//    2    3:invokestatic    #40  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ErrorReason>
	//    4    9:areturn         
	}

	public static ErrorReason[] values()
	{
		return (ErrorReason[])((ErrorReason []) ($VALUES)).clone();
	//    0    0:getstatic       #32  <Field ErrorReason[] $VALUES>
	//    1    3:invokevirtual   #47  <Method Object _5B_Lcom.irobot.core.ErrorReason_3B_.clone()>
	//    2    6:checkcast       #43  <Class ErrorReason[]>
	//    3    9:areturn         
	}

	private static final ErrorReason $VALUES[];
	public static final ErrorReason ResourceNotFound;
	public static final ErrorReason Timeout;
	public static final ErrorReason Unknown;
	public static final ErrorReason UnsupportedVersion;

	static 
	{
		ResourceNotFound = new ErrorReason("ResourceNotFound", 0);
	//    0    0:new             #2   <Class ErrorReason>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "ResourceNotFound">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #19  <Method void ErrorReason(String, int)>
	//    5   10:putstatic       #21  <Field ErrorReason ResourceNotFound>
		Timeout = new ErrorReason("Timeout", 1);
	//    6   13:new             #2   <Class ErrorReason>
	//    7   16:dup             
	//    8   17:ldc1            #22  <String "Timeout">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #19  <Method void ErrorReason(String, int)>
	//   11   23:putstatic       #24  <Field ErrorReason Timeout>
		UnsupportedVersion = new ErrorReason("UnsupportedVersion", 2);
	//   12   26:new             #2   <Class ErrorReason>
	//   13   29:dup             
	//   14   30:ldc1            #25  <String "UnsupportedVersion">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #19  <Method void ErrorReason(String, int)>
	//   17   36:putstatic       #27  <Field ErrorReason UnsupportedVersion>
		Unknown = new ErrorReason("Unknown", 3);
	//   18   39:new             #2   <Class ErrorReason>
	//   19   42:dup             
	//   20   43:ldc1            #28  <String "Unknown">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #19  <Method void ErrorReason(String, int)>
	//   23   49:putstatic       #30  <Field ErrorReason Unknown>
		$VALUES = (new ErrorReason[] {
			ResourceNotFound, Timeout, UnsupportedVersion, Unknown
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       ErrorReason[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #21  <Field ErrorReason ResourceNotFound>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #24  <Field ErrorReason Timeout>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #27  <Field ErrorReason UnsupportedVersion>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #30  <Field ErrorReason Unknown>
	//   41   79:aastore         
	//   42   80:putstatic       #32  <Field ErrorReason[] $VALUES>
	//*  43   83:return          
	}
}
