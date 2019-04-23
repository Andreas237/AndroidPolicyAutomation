// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.metadata.id3;


// Referenced classes of package com.google.android.exoplayer.metadata.id3:
//			Id3Frame

public final class GeobFrame extends Id3Frame
{

	public GeobFrame(String s, String s1, String s2, byte abyte0[])
	{
		super("GEOB");
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "GEOB">
	//    2    3:invokespecial   #18  <Method void Id3Frame(String)>
		mimeType = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #20  <Field String mimeType>
		filename = s1;
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:putfield        #22  <Field String filename>
		description = s2;
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:putfield        #24  <Field String description>
		data = abyte0;
	//   12   21:aload_0         
	//   13   22:aload           4
	//   14   24:putfield        #26  <Field byte[] data>
	//   15   27:return          
	}

	public static final String ID = "GEOB";
	public final byte data[];
	public final String description;
	public final String filename;
	public final String mimeType;
}
