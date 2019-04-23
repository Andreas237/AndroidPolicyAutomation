// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.smoothstreaming;

import com.google.android.exoplayer.ParserException;

// Referenced classes of package com.google.android.exoplayer.smoothstreaming:
//			SmoothStreamingManifestParser

public static class SmoothStreamingManifestParser$MissingFieldException extends ParserException
{

	public SmoothStreamingManifestParser$MissingFieldException(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #11  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Missing required field: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #16  <String "Missing required field: ">
	//    6   11:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		super(stringbuilder.toString());
	//   12   21:aload_0         
	//   13   22:aload_2         
	//   14   23:invokevirtual   #24  <Method String StringBuilder.toString()>
	//   15   26:invokespecial   #26  <Method void ParserException(String)>
	//   16   29:return          
	}
}
