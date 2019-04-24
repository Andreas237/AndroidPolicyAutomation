// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.cache.CacheUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.*;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadAction, ProgressiveDownloader, DownloaderConstructorHelper, Downloader

public final class ProgressiveDownloadAction extends DownloadAction
{

	public ProgressiveDownloadAction(Uri uri, boolean flag, byte abyte0[], String s)
	{
		super("progressive", 0, uri, flag, abyte0);
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <String "progressive">
	//    2    3:iconst_0        
	//    3    4:aload_1         
	//    4    5:iload_2         
	//    5    6:aload_3         
	//    6    7:invokespecial   #30  <Method void DownloadAction(String, int, Uri, boolean, byte[])>
		customCacheKey = s;
	//    7   10:aload_0         
	//    8   11:aload           4
	//    9   13:putfield        #32  <Field String customCacheKey>
	//   10   16:return          
	}

	private String getCacheKey()
	{
		if(customCacheKey != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field String customCacheKey>
	//*   2    4:ifnull          12
			return customCacheKey;
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field String customCacheKey>
	//    5   11:areturn         
		else
			return CacheUtil.generateKey(uri);
	//    6   12:aload_0         
	//    7   13:getfield        #39  <Field Uri uri>
	//    8   16:invokestatic    #45  <Method String CacheUtil.generateKey(Uri)>
	//    9   19:areturn         
	}

	protected volatile Downloader createDownloader(DownloaderConstructorHelper downloaderconstructorhelper)
	{
		return ((Downloader) (createDownloader(downloaderconstructorhelper)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #50  <Method ProgressiveDownloader createDownloader(DownloaderConstructorHelper)>
	//    3    5:areturn         
	}

	protected ProgressiveDownloader createDownloader(DownloaderConstructorHelper downloaderconstructorhelper)
	{
		return new ProgressiveDownloader(uri, customCacheKey, downloaderconstructorhelper);
	//    0    0:new             #52  <Class ProgressiveDownloader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field Uri uri>
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field String customCacheKey>
	//    6   12:aload_1         
	//    7   13:invokespecial   #55  <Method void ProgressiveDownloader(Uri, String, DownloaderConstructorHelper)>
	//    8   16:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!super.equals(obj))
	//*   5    7:aload_0         
	//*   6    8:aload_1         
	//*   7    9:invokespecial   #59  <Method boolean DownloadAction.equals(Object)>
	//*   8   12:ifne            17
		{
			return false;
	//    9   15:iconst_0        
	//   10   16:ireturn         
		} else
		{
			obj = ((Object) ((ProgressiveDownloadAction)obj));
	//   11   17:aload_1         
	//   12   18:checkcast       #2   <Class ProgressiveDownloadAction>
	//   13   21:astore_1        
			return Util.areEqual(((Object) (customCacheKey)), ((Object) (((ProgressiveDownloadAction) (obj)).customCacheKey)));
	//   14   22:aload_0         
	//   15   23:getfield        #32  <Field String customCacheKey>
	//   16   26:aload_1         
	//   17   27:getfield        #32  <Field String customCacheKey>
	//   18   30:invokestatic    #65  <Method boolean Util.areEqual(Object, Object)>
	//   19   33:ireturn         
		}
	}

	public int hashCode()
	{
		int j = super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method int DownloadAction.hashCode()>
	//    2    4:istore_2        
		int i;
		if(customCacheKey != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #32  <Field String customCacheKey>
	//*   5    9:ifnull          23
			i = customCacheKey.hashCode();
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field String customCacheKey>
	//    8   16:invokevirtual   #72  <Method int String.hashCode()>
	//    9   19:istore_1        
		else
	//*  10   20:goto            25
			i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		return 31 * j + i;
	//   13   25:bipush          31
	//   14   27:iload_2         
	//   15   28:imul            
	//   16   29:iload_1         
	//   17   30:iadd            
	//   18   31:ireturn         
	}

	public boolean isSameMedia(DownloadAction downloadaction)
	{
		return (downloadaction instanceof ProgressiveDownloadAction) && getCacheKey().equals(((Object) (((ProgressiveDownloadAction)downloadaction).getCacheKey())));
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class ProgressiveDownloadAction>
	//    2    4:ifeq            26
	//    3    7:aload_0         
	//    4    8:invokespecial   #76  <Method String getCacheKey()>
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class ProgressiveDownloadAction>
	//    7   15:invokespecial   #76  <Method String getCacheKey()>
	//    8   18:invokevirtual   #77  <Method boolean String.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	protected void writeToStream(DataOutputStream dataoutputstream)
		throws IOException
	{
		dataoutputstream.writeUTF(uri.toString());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field Uri uri>
	//    3    5:invokevirtual   #86  <Method String Uri.toString()>
	//    4    8:invokevirtual   #92  <Method void DataOutputStream.writeUTF(String)>
		dataoutputstream.writeBoolean(isRemoveAction);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #96  <Field boolean isRemoveAction>
	//    8   16:invokevirtual   #100 <Method void DataOutputStream.writeBoolean(boolean)>
		dataoutputstream.writeInt(data.length);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #104 <Field byte[] data>
	//   12   24:arraylength     
	//   13   25:invokevirtual   #108 <Method void DataOutputStream.writeInt(int)>
		dataoutputstream.write(data);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #104 <Field byte[] data>
	//   17   33:invokevirtual   #112 <Method void DataOutputStream.write(byte[])>
		boolean flag;
		if(customCacheKey != null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #32  <Field String customCacheKey>
	//*  20   40:ifnull          48
			flag = true;
	//   21   43:iconst_1        
	//   22   44:istore_2        
		else
	//*  23   45:goto            50
			flag = false;
	//   24   48:iconst_0        
	//   25   49:istore_2        
		dataoutputstream.writeBoolean(flag);
	//   26   50:aload_1         
	//   27   51:iload_2         
	//   28   52:invokevirtual   #100 <Method void DataOutputStream.writeBoolean(boolean)>
		if(flag)
	//*  29   55:iload_2         
	//*  30   56:ifeq            67
			dataoutputstream.writeUTF(customCacheKey);
	//   31   59:aload_1         
	//   32   60:aload_0         
	//   33   61:getfield        #32  <Field String customCacheKey>
	//   34   64:invokevirtual   #92  <Method void DataOutputStream.writeUTF(String)>
	//   35   67:return          
	}

	public static final DownloadAction.Deserializer DESERIALIZER = new DownloadAction.Deserializer("progressive", 0) {

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

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:invokespecial   #10  <Method void DownloadAction$Deserializer(String, int)>
			//    4    6:return          
			}
	}
;
	private static final String TYPE = "progressive";
	private static final int VERSION = 0;
	public final String customCacheKey;

	static 
	{
	//    0    0:new             #6   <Class ProgressiveDownloadAction$1>
	//    1    3:dup             
	//    2    4:ldc1            #12  <String "progressive">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void ProgressiveDownloadAction$1(String, int)>
	//    5   10:putstatic       #25  <Field DownloadAction$Deserializer DESERIALIZER>
	//*   6   13:return          
	}
}
