// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.net.Uri;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			SegmentDownloadAction, DownloadAction

protected static abstract class SegmentDownloadAction$SegmentDownloadActionDeserializer extends DownloadAction.Deserializer
{

	protected abstract DownloadAction createDownloadAction(Uri uri, boolean flag, byte abyte0[], List list);

	public final DownloadAction readFromStream(int i, DataInputStream datainputstream)
		throws IOException
	{
		Uri uri = Uri.parse(datainputstream.readUTF());
	//    0    0:aload_2         
	//    1    1:invokevirtual   #25  <Method String DataInputStream.readUTF()>
	//    2    4:invokestatic    #31  <Method Uri Uri.parse(String)>
	//    3    7:astore          5
		boolean flag = datainputstream.readBoolean();
	//    4    9:aload_2         
	//    5   10:invokevirtual   #35  <Method boolean DataInputStream.readBoolean()>
	//    6   13:istore          4
		byte abyte0[] = new byte[datainputstream.readInt()];
	//    7   15:aload_2         
	//    8   16:invokevirtual   #39  <Method int DataInputStream.readInt()>
	//    9   19:newarray        byte[]
	//   10   21:astore          6
		datainputstream.readFully(abyte0);
	//   11   23:aload_2         
	//   12   24:aload           6
	//   13   26:invokevirtual   #43  <Method void DataInputStream.readFully(byte[])>
		int j = datainputstream.readInt();
	//   14   29:aload_2         
	//   15   30:invokevirtual   #39  <Method int DataInputStream.readInt()>
	//   16   33:istore_3        
		ArrayList arraylist = new ArrayList();
	//   17   34:new             #45  <Class ArrayList>
	//   18   37:dup             
	//   19   38:invokespecial   #48  <Method void ArrayList()>
	//   20   41:astore          7
		for(i = 0; i < j; i++)
	//*  21   43:iconst_0        
	//*  22   44:istore_1        
	//*  23   45:iload_1         
	//*  24   46:iload_3         
	//*  25   47:icmpge          70
			((List) (arraylist)).add(readKey(datainputstream));
	//   26   50:aload           7
	//   27   52:aload_0         
	//   28   53:aload_2         
	//   29   54:invokevirtual   #52  <Method Object readKey(DataInputStream)>
	//   30   57:invokeinterface #58  <Method boolean List.add(Object)>
	//   31   62:pop             

	//   32   63:iload_1         
	//   33   64:iconst_1        
	//   34   65:iadd            
	//   35   66:istore_1        
	//*  36   67:goto            45
		return createDownloadAction(uri, flag, abyte0, ((List) (arraylist)));
	//   37   70:aload_0         
	//   38   71:aload           5
	//   39   73:iload           4
	//   40   75:aload           6
	//   41   77:aload           7
	//   42   79:invokevirtual   #60  <Method DownloadAction createDownloadAction(Uri, boolean, byte[], List)>
	//   43   82:areturn         
	}

	protected abstract Object readKey(DataInputStream datainputstream)
		throws IOException;

	public SegmentDownloadAction$SegmentDownloadActionDeserializer(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #12  <Method void DownloadAction$Deserializer(String, int)>
	//    4    6:return          
	}
}
