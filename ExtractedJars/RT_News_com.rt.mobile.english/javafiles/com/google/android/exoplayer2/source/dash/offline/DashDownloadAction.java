// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.*;
import com.google.android.exoplayer2.source.dash.manifest.RepresentationKey;
import java.io.*;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.dash.offline:
//			DashDownloader

public final class DashDownloadAction extends SegmentDownloadAction
{

	public DashDownloadAction(Uri uri, boolean flag, byte abyte0[], List list)
	{
		super("dash", 0, uri, flag, abyte0, list);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "dash">
	//    2    3:iconst_0        
	//    3    4:aload_1         
	//    4    5:iload_2         
	//    5    6:aload_3         
	//    6    7:aload           4
	//    7    9:invokespecial   #30  <Method void SegmentDownloadAction(String, int, Uri, boolean, byte[], List)>
	//    8   12:return          
	}

	protected volatile Downloader createDownloader(DownloaderConstructorHelper downloaderconstructorhelper)
	{
		return ((Downloader) (createDownloader(downloaderconstructorhelper)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #38  <Method DashDownloader createDownloader(DownloaderConstructorHelper)>
	//    3    5:areturn         
	}

	protected DashDownloader createDownloader(DownloaderConstructorHelper downloaderconstructorhelper)
	{
		return new DashDownloader(uri, keys, downloaderconstructorhelper);
	//    0    0:new             #40  <Class DashDownloader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field Uri uri>
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field List keys>
	//    6   12:aload_1         
	//    7   13:invokespecial   #51  <Method void DashDownloader(Uri, List, DownloaderConstructorHelper)>
	//    8   16:areturn         
	}

	protected void writeKey(DataOutputStream dataoutputstream, RepresentationKey representationkey)
		throws IOException
	{
		dataoutputstream.writeInt(representationkey.periodIndex);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:getfield        #60  <Field int RepresentationKey.periodIndex>
	//    3    5:invokevirtual   #66  <Method void DataOutputStream.writeInt(int)>
		dataoutputstream.writeInt(representationkey.adaptationSetIndex);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:getfield        #69  <Field int RepresentationKey.adaptationSetIndex>
	//    7   13:invokevirtual   #66  <Method void DataOutputStream.writeInt(int)>
		dataoutputstream.writeInt(representationkey.representationIndex);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:getfield        #72  <Field int RepresentationKey.representationIndex>
	//   11   21:invokevirtual   #66  <Method void DataOutputStream.writeInt(int)>
	//   12   24:return          
	}

	protected volatile void writeKey(DataOutputStream dataoutputstream, Comparable comparable)
		throws IOException
	{
		writeKey(dataoutputstream, (RepresentationKey)comparable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #57  <Class RepresentationKey>
	//    4    6:invokevirtual   #76  <Method void writeKey(DataOutputStream, RepresentationKey)>
	//    5    9:return          
	}

	public static final com.google.android.exoplayer2.offline.DownloadAction.Deserializer DESERIALIZER = new com.google.android.exoplayer2.offline.SegmentDownloadAction.SegmentDownloadActionDeserializer("dash", 0) {

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

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:invokespecial   #11  <Method void com.google.android.exoplayer2.offline.SegmentDownloadAction$SegmentDownloadActionDeserializer(String, int)>
			//    4    6:return          
			}
	}
;
	private static final String TYPE = "dash";
	private static final int VERSION = 0;

	static 
	{
	//    0    0:new             #7   <Class DashDownloadAction$1>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "dash">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void DashDownloadAction$1(String, int)>
	//    5   10:putstatic       #24  <Field com.google.android.exoplayer2.offline.DownloadAction$Deserializer DESERIALIZER>
	//*   6   13:return          
	}
}
