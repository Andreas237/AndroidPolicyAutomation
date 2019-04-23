// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.metadata.id3;


// Referenced classes of package com.google.android.exoplayer.metadata.id3:
//			Id3Frame

public final class BinaryFrame extends Id3Frame
{

	public BinaryFrame(String s, byte abyte0[])
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void Id3Frame(String)>
		data = abyte0;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #13  <Field byte[] data>
	//    6   10:return          
	}

	public final byte data[];
}
