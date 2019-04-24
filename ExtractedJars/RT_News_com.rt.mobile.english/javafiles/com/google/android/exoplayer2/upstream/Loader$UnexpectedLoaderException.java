// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			Loader

public static final class Loader$UnexpectedLoaderException extends IOException
{

	public Loader$UnexpectedLoaderException(Throwable throwable)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #11  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Unexpected ");
	//    4    8:aload_2         
	//    5    9:ldc1            #16  <String "Unexpected ">
	//    6   11:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (throwable)).getClass().getSimpleName());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #26  <Method Class Object.getClass()>
	//   11   20:invokevirtual   #32  <Method String Class.getSimpleName()>
	//   12   23:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(": ");
	//   14   27:aload_2         
	//   15   28:ldc1            #34  <String ": ">
	//   16   30:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(throwable.getMessage());
	//   18   34:aload_2         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #39  <Method String Throwable.getMessage()>
	//   21   39:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		super(stringbuilder.toString(), throwable);
	//   23   43:aload_0         
	//   24   44:aload_2         
	//   25   45:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   26   48:aload_1         
	//   27   49:invokespecial   #45  <Method void IOException(String, Throwable)>
	//   28   52:return          
	}
}
