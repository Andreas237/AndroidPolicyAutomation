// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;


// Referenced classes of package com.facebook.stetho.dumpapp:
//			DumpappFramingException

class UnexpectedFrameException extends DumpappFramingException
{

	public UnexpectedFrameException(byte byte0, byte byte1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #8   <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Expected '");
	//    4    8:aload_3         
	//    5    9:ldc1            #13  <String "Expected '">
	//    6   11:invokevirtual   #17  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((int) (byte0)));
	//    8   15:aload_3         
	//    9   16:iload_1         
	//   10   17:invokevirtual   #20  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		stringbuilder.append("', got: '");
	//   12   21:aload_3         
	//   13   22:ldc1            #22  <String "', got: '">
	//   14   24:invokevirtual   #17  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		stringbuilder.append(((int) (byte1)));
	//   16   28:aload_3         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #20  <Method StringBuilder StringBuilder.append(int)>
	//   19   33:pop             
		stringbuilder.append("'");
	//   20   34:aload_3         
	//   21   35:ldc1            #24  <String "'">
	//   22   37:invokevirtual   #17  <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
		super(stringbuilder.toString());
	//   24   41:aload_0         
	//   25   42:aload_3         
	//   26   43:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   27   46:invokespecial   #31  <Method void DumpappFramingException(String)>
	//   28   49:return          
	}
}
