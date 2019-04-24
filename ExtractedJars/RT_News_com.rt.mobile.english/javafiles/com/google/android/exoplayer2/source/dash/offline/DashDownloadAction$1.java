// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.source.dash.manifest.RepresentationKey;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.dash.offline:
//			DashDownloadAction

static final class DashDownloadAction$1 extends com.google.android.exoplayer2.offline..SegmentDownloadActionDeserializer
{

	protected DownloadAction createDownloadAction(Uri uri, boolean flag, byte abyte0[], List list)
	{
		return ((DownloadAction) (new DashDownloadAction(uri, flag, abyte0, list)));
	//    0    0:new             #7   <Class DashDownloadAction>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #17  <Method void DashDownloadAction(Uri, boolean, byte[], List)>
	//    7   12:areturn         
	}

	protected RepresentationKey readKey(DataInputStream datainputstream)
		throws IOException
	{
		return new RepresentationKey(datainputstream.readInt(), datainputstream.readInt(), datainputstream.readInt());
	//    0    0:new             #25  <Class RepresentationKey>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method int DataInputStream.readInt()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #31  <Method int DataInputStream.readInt()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #31  <Method int DataInputStream.readInt()>
	//    8   16:invokespecial   #34  <Method void RepresentationKey(int, int, int)>
	//    9   19:areturn         
	}

	protected volatile Object readKey(DataInputStream datainputstream)
		throws IOException
	{
		return ((Object) (readKey(datainputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #38  <Method RepresentationKey readKey(DataInputStream)>
	//    3    5:areturn         
	}

	DashDownloadAction$1(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #11  <Method void com.google.android.exoplayer2.offline.SegmentDownloadAction$SegmentDownloadActionDeserializer(String, int)>
	//    4    6:return          
	}
}
