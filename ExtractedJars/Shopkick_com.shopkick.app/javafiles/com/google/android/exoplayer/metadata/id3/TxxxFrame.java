// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.metadata.id3;


// Referenced classes of package com.google.android.exoplayer.metadata.id3:
//			Id3Frame

public final class TxxxFrame extends Id3Frame
{

	public TxxxFrame(String s, String s1)
	{
		super("TXXX");
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "TXXX">
	//    2    3:invokespecial   #15  <Method void Id3Frame(String)>
		description = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #17  <Field String description>
		value = s1;
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:putfield        #19  <Field String value>
	//    9   16:return          
	}

	public static final String ID = "TXXX";
	public final String description;
	public final String value;
}
