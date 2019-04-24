// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.multidex;

import java.io.File;

// Referenced classes of package android.support.multidex:
//			MultiDexExtractor

private static class MultiDexExtractor$ExtractedDex extends File
{

	public long crc;

	public MultiDexExtractor$ExtractedDex(File file, String s)
	{
		super(file, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void File(File, String)>
		crc = -1L;
	//    4    6:aload_0         
	//    5    7:ldc2w           #14  <Long -1L>
	//    6   10:putfield        #17  <Field long crc>
	//    7   13:return          
	}
}
