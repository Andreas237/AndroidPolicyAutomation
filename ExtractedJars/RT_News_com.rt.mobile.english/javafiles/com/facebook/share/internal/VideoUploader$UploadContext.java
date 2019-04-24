// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.facebook.*;
import com.facebook.internal.Utility;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.io.*;

// Referenced classes of package com.facebook.share.internal:
//			VideoUploader

private static class VideoUploader$UploadContext
{

	private void initialize()
		throws FileNotFoundException
	{
		try
		{
			if(Utility.isFileUri(videoUri))
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field Uri videoUri>
	//*   2    4:invokestatic    #109 <Method boolean Utility.isFileUri(Uri)>
	//*   3    7:ifeq            51
			{
				ParcelFileDescriptor parcelfiledescriptor = ParcelFileDescriptor.open(new File(videoUri.getPath()), 0x10000000);
	//    4   10:new             #111 <Class File>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #63  <Field Uri videoUri>
	//    8   18:invokevirtual   #116 <Method String Uri.getPath()>
	//    9   21:invokespecial   #119 <Method void File(String)>
	//   10   24:ldc1            #120 <Int 0x10000000>
	//   11   26:invokestatic    #126 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//   12   29:astore_1        
				videoSize = parcelfiledescriptor.getStatSize();
	//   13   30:aload_0         
	//   14   31:aload_1         
	//   15   32:invokevirtual   #130 <Method long ParcelFileDescriptor.getStatSize()>
	//   16   35:putfield        #132 <Field long videoSize>
				videoStream = ((InputStream) (new android.os.seInputStream(parcelfiledescriptor)));
	//   17   38:aload_0         
	//   18   39:new             #134 <Class android.os.ParcelFileDescriptor$AutoCloseInputStream>
	//   19   42:dup             
	//   20   43:aload_1         
	//   21   44:invokespecial   #137 <Method void android.os.ParcelFileDescriptor$AutoCloseInputStream(ParcelFileDescriptor)>
	//   22   47:putfield        #139 <Field InputStream videoStream>
				return;
	//   23   50:return          
			}
		}
	//*  24   51:aload_0         
	//*  25   52:getfield        #63  <Field Uri videoUri>
	//*  26   55:invokestatic    #142 <Method boolean Utility.isContentUri(Uri)>
	//*  27   58:ifeq            90
	//*  28   61:aload_0         
	//*  29   62:aload_0         
	//*  30   63:getfield        #63  <Field Uri videoUri>
	//*  31   66:invokestatic    #146 <Method long Utility.getContentSize(Uri)>
	//*  32   69:putfield        #132 <Field long videoSize>
	//*  33   72:aload_0         
	//*  34   73:invokestatic    #152 <Method Context FacebookSdk.getApplicationContext()>
	//*  35   76:invokevirtual   #158 <Method ContentResolver Context.getContentResolver()>
	//*  36   79:aload_0         
	//*  37   80:getfield        #63  <Field Uri videoUri>
	//*  38   83:invokevirtual   #164 <Method InputStream ContentResolver.openInputStream(Uri)>
	//*  39   86:putfield        #139 <Field InputStream videoStream>
	//*  40   89:return          
	//*  41   90:new             #166 <Class FacebookException>
	//*  42   93:dup             
	//*  43   94:ldc1            #168 <String "Uri must be a content:// or file:// uri">
	//*  44   96:invokespecial   #169 <Method void FacebookException(String)>
	//*  45   99:athrow          
		catch(FileNotFoundException filenotfoundexception)
	//*  46  100:astore_1        
		{
			Utility.closeQuietly(((java.io.Closeable) (videoStream)));
	//   47  101:aload_0         
	//   48  102:getfield        #139 <Field InputStream videoStream>
	//   49  105:invokestatic    #173 <Method void Utility.closeQuietly(java.io.Closeable)>
			throw filenotfoundexception;
	//   50  108:aload_1         
	//   51  109:athrow          
		}
		if(Utility.isContentUri(videoUri))
		{
			videoSize = Utility.getContentSize(videoUri);
			videoStream = FacebookSdk.getApplicationContext().getContentResolver().openInputStream(videoUri);
			return;
		}
		throw new FacebookException("Uri must be a content:// or file:// uri");
	}

	public final AccessToken accessToken;
	public final FacebookCallback callback;
	public String chunkStart;
	public final String description;
	public final String graphNode;
	public boolean isCanceled;
	public Bundle params;
	public final String ref;
	public String sessionId;
	public final String title;
	public String videoId;
	public long videoSize;
	public InputStream videoStream;
	public final Uri videoUri;
	public com.facebook.internal.WorkQueue.WorkItem workItem;


/*
	static void access$100(VideoUploader$UploadContext videouploader$uploadcontext)
		throws FileNotFoundException
	{
		videouploader$uploadcontext.initialize();
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void initialize()>
		return;
	//    2    4:return          
	}

*/

	private VideoUploader$UploadContext(ShareVideoContent sharevideocontent, String s, FacebookCallback facebookcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		chunkStart = "0";
	//    2    4:aload_0         
	//    3    5:ldc1            #39  <String "0">
	//    4    7:putfield        #41  <Field String chunkStart>
		accessToken = AccessToken.getCurrentAccessToken();
	//    5   10:aload_0         
	//    6   11:invokestatic    #47  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    7   14:putfield        #49  <Field AccessToken accessToken>
		videoUri = sharevideocontent.getVideo().getLocalUrl();
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokevirtual   #55  <Method ShareVideo ShareVideoContent.getVideo()>
	//   11   22:invokevirtual   #61  <Method Uri ShareVideo.getLocalUrl()>
	//   12   25:putfield        #63  <Field Uri videoUri>
		title = sharevideocontent.getContentTitle();
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #67  <Method String ShareVideoContent.getContentTitle()>
	//   16   33:putfield        #69  <Field String title>
		description = sharevideocontent.getContentDescription();
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:invokevirtual   #72  <Method String ShareVideoContent.getContentDescription()>
	//   20   41:putfield        #74  <Field String description>
		ref = sharevideocontent.getRef();
	//   21   44:aload_0         
	//   22   45:aload_1         
	//   23   46:invokevirtual   #77  <Method String ShareVideoContent.getRef()>
	//   24   49:putfield        #79  <Field String ref>
		graphNode = s;
	//   25   52:aload_0         
	//   26   53:aload_2         
	//   27   54:putfield        #81  <Field String graphNode>
		callback = facebookcallback;
	//   28   57:aload_0         
	//   29   58:aload_3         
	//   30   59:putfield        #83  <Field FacebookCallback callback>
		params = sharevideocontent.getVideo().getParameters();
	//   31   62:aload_0         
	//   32   63:aload_1         
	//   33   64:invokevirtual   #55  <Method ShareVideo ShareVideoContent.getVideo()>
	//   34   67:invokevirtual   #87  <Method Bundle ShareVideo.getParameters()>
	//   35   70:putfield        #89  <Field Bundle params>
	//   36   73:return          
	}

	VideoUploader$UploadContext(ShareVideoContent sharevideocontent, String s, FacebookCallback facebookcallback, VideoUploader._cls1 _pcls1)
	{
		this(sharevideocontent, s, facebookcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #95  <Method void VideoUploader$UploadContext(ShareVideoContent, String, FacebookCallback)>
	//    5    7:return          
	}
}
