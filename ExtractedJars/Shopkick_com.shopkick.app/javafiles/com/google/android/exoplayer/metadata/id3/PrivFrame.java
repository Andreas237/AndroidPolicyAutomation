// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.metadata.id3;


// Referenced classes of package com.google.android.exoplayer.metadata.id3:
//			Id3Frame

public final class PrivFrame extends Id3Frame
{

	public PrivFrame(String s, byte abyte0[])
	{
		super("PRIV");
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "PRIV">
	//    2    3:invokespecial   #16  <Method void Id3Frame(String)>
		owner = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #18  <Field String owner>
		privateData = abyte0;
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:putfield        #20  <Field byte[] privateData>
	//    9   16:return          
	}

	public static final String ID = "PRIV";
	public final String owner;
	public final byte privateData[];
}
