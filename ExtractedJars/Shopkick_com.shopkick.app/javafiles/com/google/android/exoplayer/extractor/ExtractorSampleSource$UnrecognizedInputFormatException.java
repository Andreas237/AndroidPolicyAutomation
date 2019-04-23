// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer.extractor:
//			ExtractorSampleSource, Extractor

public static final class ExtractorSampleSource$UnrecognizedInputFormatException extends ParserException
{

	public ExtractorSampleSource$UnrecognizedInputFormatException(Extractor aextractor[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #11  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("None of the available extractors (");
	//    4    8:aload_2         
	//    5    9:ldc1            #16  <String "None of the available extractors (">
	//    6   11:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Util.getCommaDelimitedSimpleClassNames(((Object []) (aextractor))));
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokestatic    #26  <Method String Util.getCommaDelimitedSimpleClassNames(Object[])>
	//   11   20:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(") could read the stream.");
	//   13   24:aload_2         
	//   14   25:ldc1            #28  <String ") could read the stream.">
	//   15   27:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		super(stringbuilder.toString());
	//   17   31:aload_0         
	//   18   32:aload_2         
	//   19   33:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   20   36:invokespecial   #35  <Method void ParserException(String)>
	//   21   39:return          
	}
}
