// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//			CodedOutputStream

public static class CodedOutputStream$OutOfSpaceException extends IOException
{

	private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
	private static final long serialVersionUID = 0x52ce6e25L;

	CodedOutputStream$OutOfSpaceException()
	{
		super("CodedOutputStream was writing to a flat byte array and ran out of space.");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "CodedOutputStream was writing to a flat byte array and ran out of space.">
	//    2    3:invokespecial   #20  <Method void IOException(String)>
	//    3    6:return          
	}

	CodedOutputStream$OutOfSpaceException(String s)
	{
		super((new StringBuilder()).append("CodedOutputStream was writing to a flat byte array and ran out of space.: ").append(s).toString());
	//    0    0:aload_0         
	//    1    1:new             #23  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #25  <Method void StringBuilder()>
	//    4    8:ldc1            #27  <String "CodedOutputStream was writing to a flat byte array and ran out of space.: ">
	//    5   10:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:invokevirtual   #35  <Method String StringBuilder.toString()>
	//    9   20:invokespecial   #20  <Method void IOException(String)>
	//   10   23:return          
	}

	CodedOutputStream$OutOfSpaceException(String s, Throwable throwable)
	{
		super((new StringBuilder()).append("CodedOutputStream was writing to a flat byte array and ran out of space.: ").append(s).toString(), throwable);
	//    0    0:aload_0         
	//    1    1:new             #23  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #25  <Method void StringBuilder()>
	//    4    8:ldc1            #27  <String "CodedOutputStream was writing to a flat byte array and ran out of space.: ">
	//    5   10:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:invokevirtual   #35  <Method String StringBuilder.toString()>
	//    9   20:aload_2         
	//   10   21:invokespecial   #38  <Method void IOException(String, Throwable)>
	//   11   24:return          
	}

	CodedOutputStream$OutOfSpaceException(Throwable throwable)
	{
		super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "CodedOutputStream was writing to a flat byte array and ran out of space.">
	//    2    3:aload_1         
	//    3    4:invokespecial   #38  <Method void IOException(String, Throwable)>
	//    4    7:return          
	}
}
