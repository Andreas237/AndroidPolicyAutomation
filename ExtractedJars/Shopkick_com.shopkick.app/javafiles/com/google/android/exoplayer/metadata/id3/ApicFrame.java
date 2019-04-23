// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.metadata.id3;


// Referenced classes of package com.google.android.exoplayer.metadata.id3:
//			Id3Frame

public final class ApicFrame extends Id3Frame
{

	public ApicFrame(String s, String s1, int i, byte abyte0[])
	{
		super("APIC");
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "APIC">
	//    2    3:invokespecial   #19  <Method void Id3Frame(String)>
		mimeType = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #21  <Field String mimeType>
		description = s1;
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:putfield        #23  <Field String description>
		pictureType = i;
	//    9   16:aload_0         
	//   10   17:iload_3         
	//   11   18:putfield        #25  <Field int pictureType>
		pictureData = abyte0;
	//   12   21:aload_0         
	//   13   22:aload           4
	//   14   24:putfield        #27  <Field byte[] pictureData>
	//   15   27:return          
	}

	public static final String ID = "APIC";
	public final String description;
	public final String mimeType;
	public final byte pictureData[];
	public final int pictureType;
}
