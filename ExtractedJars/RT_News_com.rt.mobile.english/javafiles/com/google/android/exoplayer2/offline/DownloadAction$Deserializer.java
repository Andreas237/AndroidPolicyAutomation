// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import java.io.DataInputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadAction

public static abstract class DownloadAction$Deserializer
{

	public abstract DownloadAction readFromStream(int i, DataInputStream datainputstream)
		throws IOException;

	public final String type;
	public final int version;

	public DownloadAction$Deserializer(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		type = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String type>
		version = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field int version>
	//    8   14:return          
	}
}
