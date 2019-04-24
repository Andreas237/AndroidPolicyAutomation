// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			Descriptors

public static final class Descriptors$FileDescriptor$Syntax extends Enum
{

	public static Descriptors$FileDescriptor$Syntax valueOf(String s)
	{
		return (Descriptors$FileDescriptor$Syntax)Enum.valueOf(com/google/protobuf/Descriptors$FileDescriptor$Syntax, s);
	//    0    0:ldc1            #2   <Class Descriptors$FileDescriptor$Syntax>
	//    1    2:aload_0         
	//    2    3:invokestatic    #57  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Descriptors$FileDescriptor$Syntax>
	//    4    9:areturn         
	}

	public static Descriptors$FileDescriptor$Syntax[] values()
	{
		return (Descriptors$FileDescriptor$Syntax[])((Descriptors$FileDescriptor$Syntax []) ($VALUES)).clone();
	//    0    0:getstatic       #42  <Field Descriptors$FileDescriptor$Syntax[] $VALUES>
	//    1    3:invokevirtual   #64  <Method Object _5B_Lcom.google.protobuf.Descriptors$FileDescriptor$Syntax_3B_.clone()>
	//    2    6:checkcast       #60  <Class Descriptors$FileDescriptor$Syntax[]>
	//    3    9:areturn         
	}

	private static final Descriptors$FileDescriptor$Syntax $VALUES[];
	public static final Descriptors$FileDescriptor$Syntax PROTO2;
	public static final Descriptors$FileDescriptor$Syntax PROTO3;
	public static final Descriptors$FileDescriptor$Syntax UNKNOWN;
	private final String name;

	static 
	{
		UNKNOWN = new Descriptors$FileDescriptor$Syntax("UNKNOWN", 0, "unknown");
	//    0    0:new             #2   <Class Descriptors$FileDescriptor$Syntax>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:ldc1            #24  <String "unknown">
	//    5    9:invokespecial   #28  <Method void Descriptors$FileDescriptor$Syntax(String, int, String)>
	//    6   12:putstatic       #30  <Field Descriptors$FileDescriptor$Syntax UNKNOWN>
		PROTO2 = new Descriptors$FileDescriptor$Syntax("PROTO2", 1, "proto2");
	//    7   15:new             #2   <Class Descriptors$FileDescriptor$Syntax>
	//    8   18:dup             
	//    9   19:ldc1            #31  <String "PROTO2">
	//   10   21:iconst_1        
	//   11   22:ldc1            #33  <String "proto2">
	//   12   24:invokespecial   #28  <Method void Descriptors$FileDescriptor$Syntax(String, int, String)>
	//   13   27:putstatic       #35  <Field Descriptors$FileDescriptor$Syntax PROTO2>
		PROTO3 = new Descriptors$FileDescriptor$Syntax("PROTO3", 2, "proto3");
	//   14   30:new             #2   <Class Descriptors$FileDescriptor$Syntax>
	//   15   33:dup             
	//   16   34:ldc1            #36  <String "PROTO3">
	//   17   36:iconst_2        
	//   18   37:ldc1            #38  <String "proto3">
	//   19   39:invokespecial   #28  <Method void Descriptors$FileDescriptor$Syntax(String, int, String)>
	//   20   42:putstatic       #40  <Field Descriptors$FileDescriptor$Syntax PROTO3>
		$VALUES = (new Descriptors$FileDescriptor$Syntax[] {
			UNKNOWN, PROTO2, PROTO3
		});
	//   21   45:iconst_3        
	//   22   46:anewarray       Descriptors$FileDescriptor$Syntax[]
	//   23   49:dup             
	//   24   50:iconst_0        
	//   25   51:getstatic       #30  <Field Descriptors$FileDescriptor$Syntax UNKNOWN>
	//   26   54:aastore         
	//   27   55:dup             
	//   28   56:iconst_1        
	//   29   57:getstatic       #35  <Field Descriptors$FileDescriptor$Syntax PROTO2>
	//   30   60:aastore         
	//   31   61:dup             
	//   32   62:iconst_2        
	//   33   63:getstatic       #40  <Field Descriptors$FileDescriptor$Syntax PROTO3>
	//   34   66:aastore         
	//   35   67:putstatic       #42  <Field Descriptors$FileDescriptor$Syntax[] $VALUES>
	//*  36   70:return          
	}


/*
	static String access$000(Descriptors$FileDescriptor$Syntax descriptors$filedescriptor$syntax)
	{
		return descriptors$filedescriptor$syntax.name;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String name>
	//    2    4:areturn         
	}

*/

	private Descriptors$FileDescriptor$Syntax(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void Enum(String, int)>
		name = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #48  <Field String name>
	//    7   11:return          
	}
}
