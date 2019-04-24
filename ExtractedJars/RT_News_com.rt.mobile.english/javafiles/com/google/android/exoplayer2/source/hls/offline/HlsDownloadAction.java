// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.*;
import com.google.android.exoplayer2.source.hls.playlist.RenditionKey;
import java.io.*;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.hls.offline:
//			HlsDownloader

public final class HlsDownloadAction extends SegmentDownloadAction
{

	public HlsDownloadAction(Uri uri, boolean flag, byte abyte0[], List list)
	{
		super("hls", 0, uri, flag, abyte0, list);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "hls">
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
	//    2    2:invokevirtual   #38  <Method HlsDownloader createDownloader(DownloaderConstructorHelper)>
	//    3    5:areturn         
	}

	protected HlsDownloader createDownloader(DownloaderConstructorHelper downloaderconstructorhelper)
	{
		return new HlsDownloader(uri, keys, downloaderconstructorhelper);
	//    0    0:new             #40  <Class HlsDownloader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field Uri uri>
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field List keys>
	//    6   12:aload_1         
	//    7   13:invokespecial   #51  <Method void HlsDownloader(Uri, List, DownloaderConstructorHelper)>
	//    8   16:areturn         
	}

	protected void writeKey(DataOutputStream dataoutputstream, RenditionKey renditionkey)
		throws IOException
	{
		dataoutputstream.writeInt(renditionkey.type);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:getfield        #60  <Field int RenditionKey.type>
	//    3    5:invokevirtual   #66  <Method void DataOutputStream.writeInt(int)>
		dataoutputstream.writeInt(renditionkey.trackIndex);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:getfield        #69  <Field int RenditionKey.trackIndex>
	//    7   13:invokevirtual   #66  <Method void DataOutputStream.writeInt(int)>
	//    8   16:return          
	}

	protected volatile void writeKey(DataOutputStream dataoutputstream, Comparable comparable)
		throws IOException
	{
		writeKey(dataoutputstream, (RenditionKey)comparable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #57  <Class RenditionKey>
	//    4    6:invokevirtual   #73  <Method void writeKey(DataOutputStream, RenditionKey)>
	//    5    9:return          
	}

	public static final com.google.android.exoplayer2.offline.DownloadAction.Deserializer DESERIALIZER = new com.google.android.exoplayer2.offline.SegmentDownloadAction.SegmentDownloadActionDeserializer("hls", 0) {

		protected DownloadAction createDownloadAction(Uri uri, boolean flag, byte abyte0[], List list)
		{
			return ((DownloadAction) (new HlsDownloadAction(uri, flag, abyte0, list)));
		//    0    0:new             #7   <Class HlsDownloadAction>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:aload_3         
		//    5    7:aload           4
		//    6    9:invokespecial   #17  <Method void HlsDownloadAction(Uri, boolean, byte[], List)>
		//    7   12:areturn         
		}

		protected RenditionKey readKey(DataInputStream datainputstream)
			throws IOException
		{
			return new RenditionKey(datainputstream.readInt(), datainputstream.readInt());
		//    0    0:new             #25  <Class RenditionKey>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokevirtual   #31  <Method int DataInputStream.readInt()>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #31  <Method int DataInputStream.readInt()>
		//    6   12:invokespecial   #34  <Method void RenditionKey(int, int)>
		//    7   15:areturn         
		}

		protected volatile Object readKey(DataInputStream datainputstream)
			throws IOException
		{
			return ((Object) (readKey(datainputstream)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #38  <Method RenditionKey readKey(DataInputStream)>
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
	private static final String TYPE = "hls";
	private static final int VERSION = 0;

	static 
	{
	//    0    0:new             #7   <Class HlsDownloadAction$1>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "hls">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void HlsDownloadAction$1(String, int)>
	//    5   10:putstatic       #24  <Field com.google.android.exoplayer2.offline.DownloadAction$Deserializer DESERIALIZER>
	//*   6   13:return          
	}
}
