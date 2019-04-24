// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import java.io.IOException;

public final class SampleQueueMappingException extends IOException
{

	public SampleQueueMappingException(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #9   <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #12  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Unable to bind a sample queue to TrackGroup with mime type ");
	//    4    8:aload_2         
	//    5    9:ldc1            #14  <String "Unable to bind a sample queue to TrackGroup with mime type ">
	//    6   11:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(".");
	//   12   21:aload_2         
	//   13   22:ldc1            #20  <String ".">
	//   14   24:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		super(stringbuilder.toString());
	//   16   28:aload_0         
	//   17   29:aload_2         
	//   18   30:invokevirtual   #24  <Method String StringBuilder.toString()>
	//   19   33:invokespecial   #26  <Method void IOException(String)>
	//   20   36:return          
	}
}
