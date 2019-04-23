// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
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
	//*   2    4:invokestatic    #142 <Method boolean Utility.isFileUri(Uri)>
	//*   3    7:ifeq            51
			{
				ParcelFileDescriptor parcelfiledescriptor = ParcelFileDescriptor.open(new File(videoUri.getPath()), 0x10000000);
	//    4   10:new             #144 <Class File>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #63  <Field Uri videoUri>
	//    8   18:invokevirtual   #149 <Method String Uri.getPath()>
	//    9   21:invokespecial   #152 <Method void File(String)>
	//   10   24:ldc1            #153 <Int 0x10000000>
	//   11   26:invokestatic    #159 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//   12   29:astore_1        
				videoSize = parcelfiledescriptor.getStatSize();
	//   13   30:aload_0         
	//   14   31:aload_1         
	//   15   32:invokevirtual   #163 <Method long ParcelFileDescriptor.getStatSize()>
	//   16   35:putfield        #165 <Field long videoSize>
				videoStream = ((InputStream) (new android.os.seInputStream(parcelfiledescriptor)));
	//   17   38:aload_0         
	//   18   39:new             #167 <Class android.os.ParcelFileDescriptor$AutoCloseInputStream>
	//   19   42:dup             
	//   20   43:aload_1         
	//   21   44:invokespecial   #170 <Method void android.os.ParcelFileDescriptor$AutoCloseInputStream(ParcelFileDescriptor)>
	//   22   47:putfield        #172 <Field InputStream videoStream>
				return;
	//   23   50:return          
			}
		}
	//*  24   51:aload_0         
	//*  25   52:getfield        #63  <Field Uri videoUri>
	//*  26   55:invokestatic    #175 <Method boolean Utility.isContentUri(Uri)>
	//*  27   58:ifeq            90
	//*  28   61:aload_0         
	//*  29   62:aload_0         
	//*  30   63:getfield        #63  <Field Uri videoUri>
	//*  31   66:invokestatic    #179 <Method long Utility.getContentSize(Uri)>
	//*  32   69:putfield        #165 <Field long videoSize>
	//*  33   72:aload_0         
	//*  34   73:invokestatic    #185 <Method Context FacebookSdk.getApplicationContext()>
	//*  35   76:invokevirtual   #191 <Method ContentResolver Context.getContentResolver()>
	//*  36   79:aload_0         
	//*  37   80:getfield        #63  <Field Uri videoUri>
	//*  38   83:invokevirtual   #197 <Method InputStream ContentResolver.openInputStream(Uri)>
	//*  39   86:putfield        #172 <Field InputStream videoStream>
	//*  40   89:return          
	//*  41   90:new             #199 <Class FacebookException>
	//*  42   93:dup             
	//*  43   94:ldc1            #201 <String "Uri must be a content:// or file:// uri">
	//*  44   96:invokespecial   #202 <Method void FacebookException(String)>
	//*  45   99:athrow          
		catch(FileNotFoundException filenotfoundexception)
	//*  46  100:astore_1        
		{
			Utility.closeQuietly(((java.io.Closeable) (videoStream)));
	//   47  101:aload_0         
	//   48  102:getfield        #172 <Field InputStream videoStream>
	//   49  105:invokestatic    #206 <Method void Utility.closeQuietly(java.io.Closeable)>
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
	//    1    1:invokespecial   #137 <Method void initialize()>
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
		if(!Utility.isNullOrEmpty(((java.util.Collection) (sharevideocontent.getPeopleIds()))))
	//*  36   73:aload_1         
	//*  37   74:invokevirtual   #93  <Method java.util.List ShareVideoContent.getPeopleIds()>
	//*  38   77:invokestatic    #99  <Method boolean Utility.isNullOrEmpty(java.util.Collection)>
	//*  39   80:ifne            101
			params.putString("tags", TextUtils.join(", ", ((Iterable) (sharevideocontent.getPeopleIds()))));
	//   40   83:aload_0         
	//   41   84:getfield        #89  <Field Bundle params>
	//   42   87:ldc1            #101 <String "tags">
	//   43   89:ldc1            #103 <String ", ">
	//   44   91:aload_1         
	//   45   92:invokevirtual   #93  <Method java.util.List ShareVideoContent.getPeopleIds()>
	//   46   95:invokestatic    #109 <Method String TextUtils.join(CharSequence, Iterable)>
	//   47   98:invokevirtual   #115 <Method void Bundle.putString(String, String)>
		if(!Utility.isNullOrEmpty(sharevideocontent.getPlaceId()))
	//*  48  101:aload_1         
	//*  49  102:invokevirtual   #118 <Method String ShareVideoContent.getPlaceId()>
	//*  50  105:invokestatic    #121 <Method boolean Utility.isNullOrEmpty(String)>
	//*  51  108:ifne            124
			params.putString("place", sharevideocontent.getPlaceId());
	//   52  111:aload_0         
	//   53  112:getfield        #89  <Field Bundle params>
	//   54  115:ldc1            #123 <String "place">
	//   55  117:aload_1         
	//   56  118:invokevirtual   #118 <Method String ShareVideoContent.getPlaceId()>
	//   57  121:invokevirtual   #115 <Method void Bundle.putString(String, String)>
		if(!Utility.isNullOrEmpty(sharevideocontent.getRef()))
	//*  58  124:aload_1         
	//*  59  125:invokevirtual   #77  <Method String ShareVideoContent.getRef()>
	//*  60  128:invokestatic    #121 <Method boolean Utility.isNullOrEmpty(String)>
	//*  61  131:ifne            147
			params.putString("ref", sharevideocontent.getRef());
	//   62  134:aload_0         
	//   63  135:getfield        #89  <Field Bundle params>
	//   64  138:ldc1            #124 <String "ref">
	//   65  140:aload_1         
	//   66  141:invokevirtual   #77  <Method String ShareVideoContent.getRef()>
	//   67  144:invokevirtual   #115 <Method void Bundle.putString(String, String)>
	//   68  147:return          
	}

	VideoUploader$UploadContext(ShareVideoContent sharevideocontent, String s, FacebookCallback facebookcallback, VideoUploader._cls1 _pcls1)
	{
		this(sharevideocontent, s, facebookcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #130 <Method void VideoUploader$UploadContext(ShareVideoContent, String, FacebookCallback)>
	//    5    7:return          
	}
}
