// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.net.Uri;
import java.io.DataInputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			ProgressiveDownloadAction, DownloadAction

static final class ProgressiveDownloadAction$1 extends DownloadAction$Deserializer
{

	public volatile DownloadAction readFromStream(int i, DataInputStream datainputstream)
		throws IOException
	{
		return ((DownloadAction) (readFromStream(i, datainputstream)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #18  <Method ProgressiveDownloadAction readFromStream(int, DataInputStream)>
	//    4    6:areturn         
	}

	public ProgressiveDownloadAction readFromStream(int i, DataInputStream datainputstream)
		throws IOException
	{
		Uri uri = Uri.parse(datainputstream.readUTF());
	//    0    0:aload_2         
	//    1    1:invokevirtual   #25  <Method String DataInputStream.readUTF()>
	//    2    4:invokestatic    #31  <Method Uri Uri.parse(String)>
	//    3    7:astore          4
		boolean flag = datainputstream.readBoolean();
	//    4    9:aload_2         
	//    5   10:invokevirtual   #35  <Method boolean DataInputStream.readBoolean()>
	//    6   13:istore_3        
		byte abyte0[] = new byte[datainputstream.readInt()];
	//    7   14:aload_2         
	//    8   15:invokevirtual   #39  <Method int DataInputStream.readInt()>
	//    9   18:newarray        byte[]
	//   10   20:astore          5
		datainputstream.readFully(abyte0);
	//   11   22:aload_2         
	//   12   23:aload           5
	//   13   25:invokevirtual   #43  <Method void DataInputStream.readFully(byte[])>
		if(datainputstream.readBoolean())
	//*  14   28:aload_2         
	//*  15   29:invokevirtual   #35  <Method boolean DataInputStream.readBoolean()>
	//*  16   32:ifeq            43
			datainputstream = ((DataInputStream) (datainputstream.readUTF()));
	//   17   35:aload_2         
	//   18   36:invokevirtual   #25  <Method String DataInputStream.readUTF()>
	//   19   39:astore_2        
		else
	//*  20   40:goto            45
			datainputstream = null;
	//   21   43:aconst_null     
	//   22   44:astore_2        
		return new ProgressiveDownloadAction(uri, flag, abyte0, ((String) (datainputstream)));
	//   23   45:new             #6   <Class ProgressiveDownloadAction>
	//   24   48:dup             
	//   25   49:aload           4
	//   26   51:iload_3         
	//   27   52:aload           5
	//   28   54:aload_2         
	//   29   55:invokespecial   #46  <Method void ProgressiveDownloadAction(Uri, boolean, byte[], String)>
	//   30   58:areturn         
	}

	ProgressiveDownloadAction$1(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #10  <Method void DownloadAction$Deserializer(String, int)>
	//    4    6:return          
	}
}
