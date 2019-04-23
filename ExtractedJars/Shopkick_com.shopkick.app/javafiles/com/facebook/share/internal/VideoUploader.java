// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.*;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.*;
import com.facebook.internal.*;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.io.*;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			ShareInternalUtility

public class VideoUploader
{
	private static class FinishUploadWorkItem extends UploadWorkItemBase
	{

		protected void enqueueRetry(int i)
		{
			VideoUploader.enqueueUploadFinish(uploadContext, i);
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field VideoUploader$UploadContext uploadContext>
		//    2    4:iload_1         
		//    3    5:invokestatic    #32  <Method void VideoUploader.access$700(VideoUploader$UploadContext, int)>
		//    4    8:return          
		}

		public Bundle getParameters()
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #36  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #37  <Method void Bundle()>
		//    3    7:astore_1        
			if(uploadContext.params != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #29  <Field VideoUploader$UploadContext uploadContext>
		//*   6   12:getfield        #43  <Field Bundle VideoUploader$UploadContext.params>
		//*   7   15:ifnull          29
				bundle.putAll(uploadContext.params);
		//    8   18:aload_1         
		//    9   19:aload_0         
		//   10   20:getfield        #29  <Field VideoUploader$UploadContext uploadContext>
		//   11   23:getfield        #43  <Field Bundle VideoUploader$UploadContext.params>
		//   12   26:invokevirtual   #47  <Method void Bundle.putAll(Bundle)>
			bundle.putString("upload_phase", "finish");
		//   13   29:aload_1         
		//   14   30:ldc1            #49  <String "upload_phase">
		//   15   32:ldc1            #51  <String "finish">
		//   16   34:invokevirtual   #55  <Method void Bundle.putString(String, String)>
			bundle.putString("upload_session_id", uploadContext.sessionId);
		//   17   37:aload_1         
		//   18   38:ldc1            #57  <String "upload_session_id">
		//   19   40:aload_0         
		//   20   41:getfield        #29  <Field VideoUploader$UploadContext uploadContext>
		//   21   44:getfield        #61  <Field String VideoUploader$UploadContext.sessionId>
		//   22   47:invokevirtual   #55  <Method void Bundle.putString(String, String)>
			Utility.putNonEmptyString(bundle, "title", uploadContext.title);
		//   23   50:aload_1         
		//   24   51:ldc1            #63  <String "title">
		//   25   53:aload_0         
		//   26   54:getfield        #29  <Field VideoUploader$UploadContext uploadContext>
		//   27   57:getfield        #65  <Field String VideoUploader$UploadContext.title>
		//   28   60:invokestatic    #71  <Method void Utility.putNonEmptyString(Bundle, String, String)>
			Utility.putNonEmptyString(bundle, "description", uploadContext.description);
		//   29   63:aload_1         
		//   30   64:ldc1            #73  <String "description">
		//   31   66:aload_0         
		//   32   67:getfield        #29  <Field VideoUploader$UploadContext uploadContext>
		//   33   70:getfield        #75  <Field String VideoUploader$UploadContext.description>
		//   34   73:invokestatic    #71  <Method void Utility.putNonEmptyString(Bundle, String, String)>
			Utility.putNonEmptyString(bundle, "ref", uploadContext.ref);
		//   35   76:aload_1         
		//   36   77:ldc1            #77  <String "ref">
		//   37   79:aload_0         
		//   38   80:getfield        #29  <Field VideoUploader$UploadContext uploadContext>
		//   39   83:getfield        #79  <Field String VideoUploader$UploadContext.ref>
		//   40   86:invokestatic    #71  <Method void Utility.putNonEmptyString(Bundle, String, String)>
			return bundle;
		//   41   89:aload_1         
		//   42   90:areturn         
		}

		protected Set getTransientErrorCodes()
		{
			return transientErrorCodes;
		//    0    0:getstatic       #19  <Field Set transientErrorCodes>
		//    1    3:areturn         
		}

		protected void handleError(FacebookException facebookexception)
		{
			VideoUploader.logError(((Exception) (facebookexception)), "Video '%s' failed to finish uploading", new Object[] {
				uploadContext.videoId
			});
		//    0    0:aload_1         
		//    1    1:ldc1            #87  <String "Video '%s' failed to finish uploading">
		//    2    3:iconst_1        
		//    3    4:anewarray       Object[]
		//    4    7:dup             
		//    5    8:iconst_0        
		//    6    9:aload_0         
		//    7   10:getfield        #29  <Field VideoUploader$UploadContext uploadContext>
		//    8   13:getfield        #92  <Field String VideoUploader$UploadContext.videoId>
		//    9   16:aastore         
		//   10   17:invokestatic    #96  <Method void VideoUploader.access$400(Exception, String, Object[])>
			endUploadWithFailure(facebookexception);
		//   11   20:aload_0         
		//   12   21:aload_1         
		//   13   22:invokevirtual   #99  <Method void endUploadWithFailure(FacebookException)>
		//   14   25:return          
		}

		protected void handleSuccess(JSONObject jsonobject)
			throws JSONException
		{
			if(jsonobject.getBoolean("success"))
		//*   0    0:aload_1         
		//*   1    1:ldc1            #105 <String "success">
		//*   2    3:invokevirtual   #111 <Method boolean JSONObject.getBoolean(String)>
		//*   3    6:ifeq            22
			{
				issueResponseOnMainThread(((FacebookException) (null)), uploadContext.videoId);
		//    4    9:aload_0         
		//    5   10:aconst_null     
		//    6   11:aload_0         
		//    7   12:getfield        #29  <Field VideoUploader$UploadContext uploadContext>
		//    8   15:getfield        #92  <Field String VideoUploader$UploadContext.videoId>
		//    9   18:invokevirtual   #115 <Method void issueResponseOnMainThread(FacebookException, String)>
				return;
		//   10   21:return          
			} else
			{
				handleError(new FacebookException("Unexpected error in server response"));
		//   11   22:aload_0         
		//   12   23:new             #117 <Class FacebookException>
		//   13   26:dup             
		//   14   27:ldc1            #119 <String "Unexpected error in server response">
		//   15   29:invokespecial   #122 <Method void FacebookException(String)>
		//   16   32:invokevirtual   #124 <Method void handleError(FacebookException)>
				return;
		//   17   35:return          
			}
		}

		static final Set transientErrorCodes = new HashSet() {

			
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #14  <Method void HashSet()>
				add(((Object) (Integer.valueOf(0x14cc43))));
			//    2    4:aload_0         
			//    3    5:ldc1            #15  <Int 0x14cc43>
			//    4    7:invokestatic    #21  <Method Integer Integer.valueOf(int)>
			//    5   10:invokevirtual   #25  <Method boolean add(Object)>
			//    6   13:pop             
			//    7   14:return          
			}
		}
;

		static 
		{
		//    0    0:new             #9   <Class VideoUploader$FinishUploadWorkItem$1>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void VideoUploader$FinishUploadWorkItem$1()>
		//    3    7:putstatic       #19  <Field Set transientErrorCodes>
		//*   4   10:return          
		}

		public FinishUploadWorkItem(UploadContext uploadcontext, int i)
		{
			super(uploadcontext, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #23  <Method void VideoUploader$UploadWorkItemBase(VideoUploader$UploadContext, int)>
		//    4    6:return          
		}
	}

	private static class StartUploadWorkItem extends UploadWorkItemBase
	{

		protected void enqueueRetry(int i)
		{
			VideoUploader.enqueueUploadStart(uploadContext, i);
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field VideoUploader$UploadContext uploadContext>
		//    2    4:iload_1         
		//    3    5:invokestatic    #32  <Method void VideoUploader.access$500(VideoUploader$UploadContext, int)>
		//    4    8:return          
		}

		public Bundle getParameters()
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #36  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #37  <Method void Bundle()>
		//    3    7:astore_1        
			bundle.putString("upload_phase", "start");
		//    4    8:aload_1         
		//    5    9:ldc1            #39  <String "upload_phase">
		//    6   11:ldc1            #41  <String "start">
		//    7   13:invokevirtual   #45  <Method void Bundle.putString(String, String)>
			bundle.putLong("file_size", uploadContext.videoSize);
		//    8   16:aload_1         
		//    9   17:ldc1            #47  <String "file_size">
		//   10   19:aload_0         
		//   11   20:getfield        #29  <Field VideoUploader$UploadContext uploadContext>
		//   12   23:getfield        #53  <Field long VideoUploader$UploadContext.videoSize>
		//   13   26:invokevirtual   #57  <Method void Bundle.putLong(String, long)>
			return bundle;
		//   14   29:aload_1         
		//   15   30:areturn         
		}

		protected Set getTransientErrorCodes()
		{
			return transientErrorCodes;
		//    0    0:getstatic       #19  <Field Set transientErrorCodes>
		//    1    3:areturn         
		}

		protected void handleError(FacebookException facebookexception)
		{
			VideoUploader.logError(((Exception) (facebookexception)), "Error starting video upload", new Object[0]);
		//    0    0:aload_1         
		//    1    1:ldc1            #65  <String "Error starting video upload">
		//    2    3:iconst_0        
		//    3    4:anewarray       Object[]
		//    4    7:invokestatic    #71  <Method void VideoUploader.access$400(Exception, String, Object[])>
			endUploadWithFailure(facebookexception);
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:invokevirtual   #74  <Method void endUploadWithFailure(FacebookException)>
		//    8   15:return          
		}

		protected void handleSuccess(JSONObject jsonobject)
			throws JSONException
		{
			uploadContext.sessionId = jsonobject.getString("upload_session_id");
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field VideoUploader$UploadContext uploadContext>
		//    2    4:aload_1         
		//    3    5:ldc1            #80  <String "upload_session_id">
		//    4    7:invokevirtual   #86  <Method String JSONObject.getString(String)>
		//    5   10:putfield        #90  <Field String VideoUploader$UploadContext.sessionId>
			uploadContext.videoId = jsonobject.getString("video_id");
		//    6   13:aload_0         
		//    7   14:getfield        #29  <Field VideoUploader$UploadContext uploadContext>
		//    8   17:aload_1         
		//    9   18:ldc1            #92  <String "video_id">
		//   10   20:invokevirtual   #86  <Method String JSONObject.getString(String)>
		//   11   23:putfield        #95  <Field String VideoUploader$UploadContext.videoId>
			String s = jsonobject.getString("start_offset");
		//   12   26:aload_1         
		//   13   27:ldc1            #97  <String "start_offset">
		//   14   29:invokevirtual   #86  <Method String JSONObject.getString(String)>
		//   15   32:astore_2        
			jsonobject = ((JSONObject) (jsonobject.getString("end_offset")));
		//   16   33:aload_1         
		//   17   34:ldc1            #99  <String "end_offset">
		//   18   36:invokevirtual   #86  <Method String JSONObject.getString(String)>
		//   19   39:astore_1        
			VideoUploader.enqueueUploadChunk(uploadContext, s, ((String) (jsonobject)), 0);
		//   20   40:aload_0         
		//   21   41:getfield        #29  <Field VideoUploader$UploadContext uploadContext>
		//   22   44:aload_2         
		//   23   45:aload_1         
		//   24   46:iconst_0        
		//   25   47:invokestatic    #103 <Method void VideoUploader.access$300(VideoUploader$UploadContext, String, String, int)>
		//   26   50:return          
		}

		static final Set transientErrorCodes = new HashSet() {

			
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #14  <Method void HashSet()>
				add(((Object) (Integer.valueOf(6000))));
			//    2    4:aload_0         
			//    3    5:sipush          6000
			//    4    8:invokestatic    #20  <Method Integer Integer.valueOf(int)>
			//    5   11:invokevirtual   #24  <Method boolean add(Object)>
			//    6   14:pop             
			//    7   15:return          
			}
		}
;

		static 
		{
		//    0    0:new             #9   <Class VideoUploader$StartUploadWorkItem$1>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void VideoUploader$StartUploadWorkItem$1()>
		//    3    7:putstatic       #19  <Field Set transientErrorCodes>
		//*   4   10:return          
		}

		public StartUploadWorkItem(UploadContext uploadcontext, int i)
		{
			super(uploadcontext, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #23  <Method void VideoUploader$UploadWorkItemBase(VideoUploader$UploadContext, int)>
		//    4    6:return          
		}
	}

	private static class TransferChunkWorkItem extends UploadWorkItemBase
	{

		protected void enqueueRetry(int i)
		{
			VideoUploader.enqueueUploadChunk(uploadContext, chunkStart, chunkEnd, i);
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field VideoUploader$UploadContext uploadContext>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field String chunkStart>
		//    4    8:aload_0         
		//    5    9:getfield        #31  <Field String chunkEnd>
		//    6   12:iload_1         
		//    7   13:invokestatic    #40  <Method void VideoUploader.access$300(VideoUploader$UploadContext, String, String, int)>
		//    8   16:return          
		}

		public Bundle getParameters()
			throws IOException
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #46  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #47  <Method void Bundle()>
		//    3    7:astore_1        
			bundle.putString("upload_phase", "transfer");
		//    4    8:aload_1         
		//    5    9:ldc1            #49  <String "upload_phase">
		//    6   11:ldc1            #51  <String "transfer">
		//    7   13:invokevirtual   #55  <Method void Bundle.putString(String, String)>
			bundle.putString("upload_session_id", uploadContext.sessionId);
		//    8   16:aload_1         
		//    9   17:ldc1            #57  <String "upload_session_id">
		//   10   19:aload_0         
		//   11   20:getfield        #37  <Field VideoUploader$UploadContext uploadContext>
		//   12   23:getfield        #62  <Field String VideoUploader$UploadContext.sessionId>
		//   13   26:invokevirtual   #55  <Method void Bundle.putString(String, String)>
			bundle.putString("start_offset", chunkStart);
		//   14   29:aload_1         
		//   15   30:ldc1            #64  <String "start_offset">
		//   16   32:aload_0         
		//   17   33:getfield        #29  <Field String chunkStart>
		//   18   36:invokevirtual   #55  <Method void Bundle.putString(String, String)>
			byte abyte0[] = VideoUploader.getChunk(uploadContext, chunkStart, chunkEnd);
		//   19   39:aload_0         
		//   20   40:getfield        #37  <Field VideoUploader$UploadContext uploadContext>
		//   21   43:aload_0         
		//   22   44:getfield        #29  <Field String chunkStart>
		//   23   47:aload_0         
		//   24   48:getfield        #31  <Field String chunkEnd>
		//   25   51:invokestatic    #68  <Method byte[] VideoUploader.access$600(VideoUploader$UploadContext, String, String)>
		//   26   54:astore_2        
			if(abyte0 != null)
		//*  27   55:aload_2         
		//*  28   56:ifnull          68
			{
				bundle.putByteArray("video_file_chunk", abyte0);
		//   29   59:aload_1         
		//   30   60:ldc1            #70  <String "video_file_chunk">
		//   31   62:aload_2         
		//   32   63:invokevirtual   #74  <Method void Bundle.putByteArray(String, byte[])>
				return bundle;
		//   33   66:aload_1         
		//   34   67:areturn         
			} else
			{
				throw new FacebookException("Error reading video");
		//   35   68:new             #76  <Class FacebookException>
		//   36   71:dup             
		//   37   72:ldc1            #78  <String "Error reading video">
		//   38   74:invokespecial   #81  <Method void FacebookException(String)>
		//   39   77:athrow          
			}
		}

		protected Set getTransientErrorCodes()
		{
			return transientErrorCodes;
		//    0    0:getstatic       #22  <Field Set transientErrorCodes>
		//    1    3:areturn         
		}

		protected void handleError(FacebookException facebookexception)
		{
			VideoUploader.logError(((Exception) (facebookexception)), "Error uploading video '%s'", new Object[] {
				uploadContext.videoId
			});
		//    0    0:aload_1         
		//    1    1:ldc1            #90  <String "Error uploading video '%s'">
		//    2    3:iconst_1        
		//    3    4:anewarray       Object[]
		//    4    7:dup             
		//    5    8:iconst_0        
		//    6    9:aload_0         
		//    7   10:getfield        #37  <Field VideoUploader$UploadContext uploadContext>
		//    8   13:getfield        #95  <Field String VideoUploader$UploadContext.videoId>
		//    9   16:aastore         
		//   10   17:invokestatic    #99  <Method void VideoUploader.access$400(Exception, String, Object[])>
			endUploadWithFailure(facebookexception);
		//   11   20:aload_0         
		//   12   21:aload_1         
		//   13   22:invokevirtual   #102 <Method void endUploadWithFailure(FacebookException)>
		//   14   25:return          
		}

		protected void handleSuccess(JSONObject jsonobject)
			throws JSONException
		{
			String s = jsonobject.getString("start_offset");
		//    0    0:aload_1         
		//    1    1:ldc1            #64  <String "start_offset">
		//    2    3:invokevirtual   #112 <Method String JSONObject.getString(String)>
		//    3    6:astore_2        
			jsonobject = ((JSONObject) (jsonobject.getString("end_offset")));
		//    4    7:aload_1         
		//    5    8:ldc1            #114 <String "end_offset">
		//    6   10:invokevirtual   #112 <Method String JSONObject.getString(String)>
		//    7   13:astore_1        
			if(Utility.areObjectsEqual(((Object) (s)), ((Object) (jsonobject))))
		//*   8   14:aload_2         
		//*   9   15:aload_1         
		//*  10   16:invokestatic    #120 <Method boolean Utility.areObjectsEqual(Object, Object)>
		//*  11   19:ifeq            31
			{
				VideoUploader.enqueueUploadFinish(uploadContext, 0);
		//   12   22:aload_0         
		//   13   23:getfield        #37  <Field VideoUploader$UploadContext uploadContext>
		//   14   26:iconst_0        
		//   15   27:invokestatic    #123 <Method void VideoUploader.access$700(VideoUploader$UploadContext, int)>
				return;
		//   16   30:return          
			} else
			{
				VideoUploader.enqueueUploadChunk(uploadContext, s, ((String) (jsonobject)), 0);
		//   17   31:aload_0         
		//   18   32:getfield        #37  <Field VideoUploader$UploadContext uploadContext>
		//   19   35:aload_2         
		//   20   36:aload_1         
		//   21   37:iconst_0        
		//   22   38:invokestatic    #40  <Method void VideoUploader.access$300(VideoUploader$UploadContext, String, String, int)>
				return;
		//   23   41:return          
			}
		}

		static final Set transientErrorCodes = new HashSet() {

			
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #14  <Method void HashSet()>
				add(((Object) (Integer.valueOf(0x14cc4b))));
			//    2    4:aload_0         
			//    3    5:ldc1            #15  <Int 0x14cc4b>
			//    4    7:invokestatic    #21  <Method Integer Integer.valueOf(int)>
			//    5   10:invokevirtual   #25  <Method boolean add(Object)>
			//    6   13:pop             
				add(((Object) (Integer.valueOf(0x14cc4d))));
			//    7   14:aload_0         
			//    8   15:ldc1            #26  <Int 0x14cc4d>
			//    9   17:invokestatic    #21  <Method Integer Integer.valueOf(int)>
			//   10   20:invokevirtual   #25  <Method boolean add(Object)>
			//   11   23:pop             
				add(((Object) (Integer.valueOf(0x14cc56))));
			//   12   24:aload_0         
			//   13   25:ldc1            #27  <Int 0x14cc56>
			//   14   27:invokestatic    #21  <Method Integer Integer.valueOf(int)>
			//   15   30:invokevirtual   #25  <Method boolean add(Object)>
			//   16   33:pop             
				add(((Object) (Integer.valueOf(0x14cc59))));
			//   17   34:aload_0         
			//   18   35:ldc1            #28  <Int 0x14cc59>
			//   19   37:invokestatic    #21  <Method Integer Integer.valueOf(int)>
			//   20   40:invokevirtual   #25  <Method boolean add(Object)>
			//   21   43:pop             
				add(((Object) (Integer.valueOf(0x14cc61))));
			//   22   44:aload_0         
			//   23   45:ldc1            #29  <Int 0x14cc61>
			//   24   47:invokestatic    #21  <Method Integer Integer.valueOf(int)>
			//   25   50:invokevirtual   #25  <Method boolean add(Object)>
			//   26   53:pop             
			//   27   54:return          
			}
		}
;
		private String chunkEnd;
		private String chunkStart;

		static 
		{
		//    0    0:new             #9   <Class VideoUploader$TransferChunkWorkItem$1>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void VideoUploader$TransferChunkWorkItem$1()>
		//    3    7:putstatic       #22  <Field Set transientErrorCodes>
		//*   4   10:return          
		}

		public TransferChunkWorkItem(UploadContext uploadcontext, String s, String s1, int i)
		{
			super(uploadcontext, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload           4
		//    3    4:invokespecial   #27  <Method void VideoUploader$UploadWorkItemBase(VideoUploader$UploadContext, int)>
			chunkStart = s;
		//    4    7:aload_0         
		//    5    8:aload_2         
		//    6    9:putfield        #29  <Field String chunkStart>
			chunkEnd = s1;
		//    7   12:aload_0         
		//    8   13:aload_3         
		//    9   14:putfield        #31  <Field String chunkEnd>
		//   10   17:return          
		}
	}

	private static class UploadContext
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
					videoStream = ((InputStream) (new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelfiledescriptor)));
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
		static void access$100(UploadContext uploadcontext)
			throws FileNotFoundException
		{
			uploadcontext.initialize();
		//    0    0:aload_0         
		//    1    1:invokespecial   #137 <Method void initialize()>
			return;
		//    2    4:return          
		}

*/

		private UploadContext(ShareVideoContent sharevideocontent, String s, FacebookCallback facebookcallback)
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

	}

	private static abstract class UploadWorkItemBase
		implements Runnable
	{

		private boolean attemptRetry(int i)
		{
			if(completedRetries < 2 && getTransientErrorCodes().contains(((Object) (Integer.valueOf(i)))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field int completedRetries>
		//*   2    4:iconst_2        
		//*   3    5:icmpge          60
		//*   4    8:aload_0         
		//*   5    9:invokevirtual   #33  <Method Set getTransientErrorCodes()>
		//*   6   12:iload_1         
		//*   7   13:invokestatic    #39  <Method Integer Integer.valueOf(int)>
		//*   8   16:invokeinterface #45  <Method boolean Set.contains(Object)>
		//*   9   21:ifeq            60
			{
				i = (int)Math.pow(3D, completedRetries);
		//   10   24:ldc2w           #46  <Double 3D>
		//   11   27:aload_0         
		//   12   28:getfield        #26  <Field int completedRetries>
		//   13   31:i2d             
		//   14   32:invokestatic    #53  <Method double Math.pow(double, double)>
		//   15   35:d2i             
		//   16   36:istore_1        
				VideoUploader.getHandler().postDelayed(new Runnable() {

					public void run()
					{
						UploadWorkItemBase uploadworkitembase = UploadWorkItemBase.this;
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field VideoUploader$UploadWorkItemBase this$0>
					//    2    4:astore_1        
						uploadworkitembase.enqueueRetry(uploadworkitembase.completedRetries + 1);
					//    3    5:aload_1         
					//    4    6:aload_1         
					//    5    7:getfield        #29  <Field int VideoUploader$UploadWorkItemBase.completedRetries>
					//    6   10:iconst_1        
					//    7   11:iadd            
					//    8   12:invokevirtual   #33  <Method void VideoUploader$UploadWorkItemBase.enqueueRetry(int)>
					//    9   15:return          
					}

					final UploadWorkItemBase this$0;

			
			{
				this$0 = UploadWorkItemBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field VideoUploader$UploadWorkItemBase this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
				}
, i * 5000);
		//   17   37:invokestatic    #57  <Method Handler VideoUploader.access$800()>
		//   18   40:new             #11  <Class VideoUploader$UploadWorkItemBase$1>
		//   19   43:dup             
		//   20   44:aload_0         
		//   21   45:invokespecial   #60  <Method void VideoUploader$UploadWorkItemBase$1(VideoUploader$UploadWorkItemBase)>
		//   22   48:iload_1         
		//   23   49:sipush          5000
		//   24   52:imul            
		//   25   53:i2l             
		//   26   54:invokevirtual   #66  <Method boolean Handler.postDelayed(Runnable, long)>
		//   27   57:pop             
				return true;
		//   28   58:iconst_1        
		//   29   59:ireturn         
			} else
			{
				return false;
		//   30   60:iconst_0        
		//   31   61:ireturn         
			}
		}

		protected void endUploadWithFailure(FacebookException facebookexception)
		{
			issueResponseOnMainThread(facebookexception, ((String) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokevirtual   #72  <Method void issueResponseOnMainThread(FacebookException, String)>
		//    4    6:return          
		}

		protected abstract void enqueueRetry(int i);

		protected void executeGraphRequestSynchronously(Bundle bundle)
		{
			bundle = ((Bundle) ((new GraphRequest(uploadContext.accessToken, String.format(Locale.ROOT, "%s/videos", new Object[] {
				uploadContext.graphNode
			}), bundle, HttpMethod.POST, ((com.facebook.GraphRequest.Callback) (null)))).executeAndWait()));
		//    0    0:new             #80  <Class GraphRequest>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field VideoUploader$UploadContext uploadContext>
		//    4    8:getfield        #86  <Field AccessToken VideoUploader$UploadContext.accessToken>
		//    5   11:getstatic       #92  <Field Locale Locale.ROOT>
		//    6   14:ldc1            #94  <String "%s/videos">
		//    7   16:iconst_1        
		//    8   17:anewarray       Object[]
		//    9   20:dup             
		//   10   21:iconst_0        
		//   11   22:aload_0         
		//   12   23:getfield        #24  <Field VideoUploader$UploadContext uploadContext>
		//   13   26:getfield        #98  <Field String VideoUploader$UploadContext.graphNode>
		//   14   29:aastore         
		//   15   30:invokestatic    #104 <Method String String.format(Locale, String, Object[])>
		//   16   33:aload_1         
		//   17   34:getstatic       #110 <Field HttpMethod HttpMethod.POST>
		//   18   37:aconst_null     
		//   19   38:invokespecial   #113 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
		//   20   41:invokevirtual   #117 <Method GraphResponse GraphRequest.executeAndWait()>
		//   21   44:astore_1        
			if(bundle != null)
		//*  22   45:aload_1         
		//*  23   46:ifnull          129
			{
				FacebookRequestError facebookrequesterror = ((GraphResponse) (bundle)).getError();
		//   24   49:aload_1         
		//   25   50:invokevirtual   #123 <Method FacebookRequestError GraphResponse.getError()>
		//   26   53:astore_2        
				JSONObject jsonobject = ((GraphResponse) (bundle)).getJSONObject();
		//   27   54:aload_1         
		//   28   55:invokevirtual   #127 <Method JSONObject GraphResponse.getJSONObject()>
		//   29   58:astore_3        
				if(facebookrequesterror != null)
		//*  30   59:aload_2         
		//*  31   60:ifnull          89
				{
					if(!attemptRetry(facebookrequesterror.getSubErrorCode()))
		//*  32   63:aload_0         
		//*  33   64:aload_2         
		//*  34   65:invokevirtual   #133 <Method int FacebookRequestError.getSubErrorCode()>
		//*  35   68:invokespecial   #135 <Method boolean attemptRetry(int)>
		//*  36   71:ifne            142
					{
						handleError(((FacebookException) (new FacebookGraphResponseException(((GraphResponse) (bundle)), "Video upload failed"))));
		//   37   74:aload_0         
		//   38   75:new             #137 <Class FacebookGraphResponseException>
		//   39   78:dup             
		//   40   79:aload_1         
		//   41   80:ldc1            #139 <String "Video upload failed">
		//   42   82:invokespecial   #142 <Method void FacebookGraphResponseException(GraphResponse, String)>
		//   43   85:invokevirtual   #145 <Method void handleError(FacebookException)>
						return;
		//   44   88:return          
					}
				} else
				if(jsonobject != null)
		//*  45   89:aload_3         
		//*  46   90:ifnull          115
				{
					try
					{
						handleSuccess(jsonobject);
		//   47   93:aload_0         
		//   48   94:aload_3         
		//   49   95:invokevirtual   #149 <Method void handleSuccess(JSONObject)>
						return;
		//   50   98:return          
					}
					// Misplaced declaration of an exception variable
					catch(Bundle bundle)
		//*  51   99:astore_1        
					{
						endUploadWithFailure(new FacebookException("Unexpected error in server response", ((Throwable) (bundle))));
		//   52  100:aload_0         
		//   53  101:new             #151 <Class FacebookException>
		//   54  104:dup             
		//   55  105:ldc1            #153 <String "Unexpected error in server response">
		//   56  107:aload_1         
		//   57  108:invokespecial   #156 <Method void FacebookException(String, Throwable)>
		//   58  111:invokevirtual   #158 <Method void endUploadWithFailure(FacebookException)>
					}
					return;
		//   59  114:return          
				} else
				{
					handleError(new FacebookException("Unexpected error in server response"));
		//   60  115:aload_0         
		//   61  116:new             #151 <Class FacebookException>
		//   62  119:dup             
		//   63  120:ldc1            #153 <String "Unexpected error in server response">
		//   64  122:invokespecial   #161 <Method void FacebookException(String)>
		//   65  125:invokevirtual   #145 <Method void handleError(FacebookException)>
					return;
		//   66  128:return          
				}
			} else
			{
				handleError(new FacebookException("Unexpected error in server response"));
		//   67  129:aload_0         
		//   68  130:new             #151 <Class FacebookException>
		//   69  133:dup             
		//   70  134:ldc1            #153 <String "Unexpected error in server response">
		//   71  136:invokespecial   #161 <Method void FacebookException(String)>
		//   72  139:invokevirtual   #145 <Method void handleError(FacebookException)>
			}
		//   73  142:return          
		}

		protected abstract Bundle getParameters()
			throws Exception;

		protected abstract Set getTransientErrorCodes();

		protected abstract void handleError(FacebookException facebookexception);

		protected abstract void handleSuccess(JSONObject jsonobject)
			throws JSONException;

		protected void issueResponseOnMainThread(final FacebookException error, String s)
		{
			VideoUploader.getHandler().post(((_cls2) (s)). new Runnable() {

				public void run()
				{
					VideoUploader.issueResponse(uploadContext, error, videoId);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field VideoUploader$UploadWorkItemBase this$0>
				//    2    4:getfield        #37  <Field VideoUploader$UploadContext VideoUploader$UploadWorkItemBase.uploadContext>
				//    3    7:aload_0         
				//    4    8:getfield        #26  <Field FacebookException val$error>
				//    5   11:aload_0         
				//    6   12:getfield        #28  <Field String val$videoId>
				//    7   15:invokestatic    #41  <Method void VideoUploader.access$900(VideoUploader$UploadContext, FacebookException, String)>
				//    8   18:return          
				}

				final UploadWorkItemBase this$0;
				final FacebookException val$error;
				final String val$videoId;

			
			{
				this$0 = final_uploadworkitembase;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field VideoUploader$UploadWorkItemBase this$0>
				error = facebookexception;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field FacebookException val$error>
				videoId = String.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field String val$videoId>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
			}
);
		//    0    0:invokestatic    #57  <Method Handler VideoUploader.access$800()>
		//    1    3:new             #13  <Class VideoUploader$UploadWorkItemBase$2>
		//    2    6:dup             
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokespecial   #168 <Method void VideoUploader$UploadWorkItemBase$2(VideoUploader$UploadWorkItemBase, FacebookException, String)>
		//    7   13:invokevirtual   #172 <Method boolean Handler.post(Runnable)>
		//    8   16:pop             
		//    9   17:return          
		}

		public void run()
		{
			if(!uploadContext.isCanceled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field VideoUploader$UploadContext uploadContext>
		//*   2    4:getfield        #177 <Field boolean VideoUploader$UploadContext.isCanceled>
		//*   3    7:ifne            42
			{
				try
				{
					executeGraphRequestSynchronously(getParameters());
		//    4   10:aload_0         
		//    5   11:aload_0         
		//    6   12:invokevirtual   #179 <Method Bundle getParameters()>
		//    7   15:invokevirtual   #181 <Method void executeGraphRequestSynchronously(Bundle)>
					return;
		//    8   18:return          
				}
		//*   9   19:astore_1        
		//*  10   20:aload_0         
		//*  11   21:new             #151 <Class FacebookException>
		//*  12   24:dup             
		//*  13   25:ldc1            #139 <String "Video upload failed">
		//*  14   27:aload_1         
		//*  15   28:invokespecial   #156 <Method void FacebookException(String, Throwable)>
		//*  16   31:invokevirtual   #158 <Method void endUploadWithFailure(FacebookException)>
		//*  17   34:return          
				catch(FacebookException facebookexception)
		//*  18   35:astore_1        
				{
					endUploadWithFailure(facebookexception);
		//   19   36:aload_0         
		//   20   37:aload_1         
		//   21   38:invokevirtual   #158 <Method void endUploadWithFailure(FacebookException)>
				}
				catch(Exception exception)
				{
					endUploadWithFailure(new FacebookException("Video upload failed", ((Throwable) (exception))));
					return;
				}
				return;
		//   22   41:return          
			} else
			{
				endUploadWithFailure(((FacebookException) (null)));
		//   23   42:aload_0         
		//   24   43:aconst_null     
		//   25   44:invokevirtual   #158 <Method void endUploadWithFailure(FacebookException)>
				return;
		//   26   47:return          
			}
		}

		protected int completedRetries;
		protected UploadContext uploadContext;

		protected UploadWorkItemBase(UploadContext uploadcontext, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			uploadContext = uploadcontext;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field VideoUploader$UploadContext uploadContext>
			completedRetries = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field int completedRetries>
		//    8   14:return          
		}
	}


	public VideoUploader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #118 <Method void Object()>
	//    2    4:return          
	}

	private static void cancelAllRequests()
	{
		com/facebook/share/internal/VideoUploader;
	//    0    0:ldc1            #2   <Class VideoUploader>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		for(Iterator iterator = pendingUploads.iterator(); iterator.hasNext();)
	//*   2    3:getstatic       #116 <Field Set pendingUploads>
	//*   3    6:invokeinterface #165 <Method Iterator Set.iterator()>
	//*   4   11:astore_0        
	//*   5   12:aload_0         
	//*   6   13:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//*   7   18:ifeq            37
			((UploadContext)iterator.next()).isCanceled = true;
	//    8   21:aload_0         
	//    9   22:invokeinterface #175 <Method Object Iterator.next()>
	//   10   27:checkcast       #23  <Class VideoUploader$UploadContext>
	//   11   30:iconst_1        
	//   12   31:putfield        #178 <Field boolean VideoUploader$UploadContext.isCanceled>

	//*  13   34:goto            12
		com/facebook/share/internal/VideoUploader;
	//   14   37:ldc1            #2   <Class VideoUploader>
		JVM INSTR monitorexit ;
	//   15   39:monitorexit     
		return;
	//   16   40:return          
		Exception exception;
		exception;
	//   17   41:astore_0        
	//*  18   42:ldc1            #2   <Class VideoUploader>
		throw exception;
	//   19   44:monitorexit     
	//   20   45:aload_0         
	//   21   46:athrow          
	}

	private static void enqueueRequest(UploadContext uploadcontext, Runnable runnable)
	{
		com/facebook/share/internal/VideoUploader;
	//    0    0:ldc1            #2   <Class VideoUploader>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		uploadcontext.workItem = uploadQueue.addActiveWorkItem(runnable);
	//    2    3:aload_0         
	//    3    4:getstatic       #110 <Field WorkQueue uploadQueue>
	//    4    7:aload_1         
	//    5    8:invokevirtual   #184 <Method com.facebook.internal.WorkQueue$WorkItem WorkQueue.addActiveWorkItem(Runnable)>
	//    6   11:putfield        #188 <Field com.facebook.internal.WorkQueue$WorkItem VideoUploader$UploadContext.workItem>
		com/facebook/share/internal/VideoUploader;
	//    7   14:ldc1            #2   <Class VideoUploader>
		JVM INSTR monitorexit ;
	//    8   16:monitorexit     
		return;
	//    9   17:return          
		uploadcontext;
	//   10   18:astore_0        
	//*  11   19:ldc1            #2   <Class VideoUploader>
		throw uploadcontext;
	//   12   21:monitorexit     
	//   13   22:aload_0         
	//   14   23:athrow          
	}

	private static void enqueueUploadChunk(UploadContext uploadcontext, String s, String s1, int i)
	{
		enqueueRequest(uploadcontext, ((Runnable) (new TransferChunkWorkItem(uploadcontext, s, s1, i))));
	//    0    0:aload_0         
	//    1    1:new             #18  <Class VideoUploader$TransferChunkWorkItem>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:invokespecial   #190 <Method void VideoUploader$TransferChunkWorkItem(VideoUploader$UploadContext, String, String, int)>
	//    8   12:invokestatic    #192 <Method void enqueueRequest(VideoUploader$UploadContext, Runnable)>
	//    9   15:return          
	}

	private static void enqueueUploadFinish(UploadContext uploadcontext, int i)
	{
		enqueueRequest(uploadcontext, ((Runnable) (new FinishUploadWorkItem(uploadcontext, i))));
	//    0    0:aload_0         
	//    1    1:new             #8   <Class VideoUploader$FinishUploadWorkItem>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #194 <Method void VideoUploader$FinishUploadWorkItem(VideoUploader$UploadContext, int)>
	//    6   10:invokestatic    #192 <Method void enqueueRequest(VideoUploader$UploadContext, Runnable)>
	//    7   13:return          
	}

	private static void enqueueUploadStart(UploadContext uploadcontext, int i)
	{
		enqueueRequest(uploadcontext, ((Runnable) (new StartUploadWorkItem(uploadcontext, i))));
	//    0    0:aload_0         
	//    1    1:new             #13  <Class VideoUploader$StartUploadWorkItem>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #195 <Method void VideoUploader$StartUploadWorkItem(VideoUploader$UploadContext, int)>
	//    6   10:invokestatic    #192 <Method void enqueueRequest(VideoUploader$UploadContext, Runnable)>
	//    7   13:return          
	}

	private static byte[] getChunk(UploadContext uploadcontext, String s, String s1)
		throws IOException
	{
		if(!Utility.areObjectsEqual(((Object) (s)), ((Object) (uploadcontext.chunkStart))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #198 <Field String VideoUploader$UploadContext.chunkStart>
	//*   3    5:invokestatic    #204 <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*   4    8:ifne            34
		{
			logError(((Exception) (null)), "Error reading video chunk. Expected chunk '%s'. Requested chunk '%s'.", new Object[] {
				uploadcontext.chunkStart, s
			});
	//    5   11:aconst_null     
	//    6   12:ldc1            #206 <String "Error reading video chunk. Expected chunk '%s'. Requested chunk '%s'.">
	//    7   14:iconst_2        
	//    8   15:anewarray       Object[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:aload_0         
	//   12   21:getfield        #198 <Field String VideoUploader$UploadContext.chunkStart>
	//   13   24:aastore         
	//   14   25:dup             
	//   15   26:iconst_1        
	//   16   27:aload_1         
	//   17   28:aastore         
	//   18   29:invokestatic    #132 <Method void logError(Exception, String, Object[])>
			return null;
	//   19   32:aconst_null     
	//   20   33:areturn         
		}
		long l = Long.parseLong(s);
	//   21   34:aload_1         
	//   22   35:invokestatic    #212 <Method long Long.parseLong(String)>
	//   23   38:lstore          6
		int i = (int)(Long.parseLong(s1) - l);
	//   24   40:aload_2         
	//   25   41:invokestatic    #212 <Method long Long.parseLong(String)>
	//   26   44:lload           6
	//   27   46:lsub            
	//   28   47:l2i             
	//   29   48:istore_3        
		s = ((String) (new ByteArrayOutputStream()));
	//   30   49:new             #214 <Class ByteArrayOutputStream>
	//   31   52:dup             
	//   32   53:invokespecial   #215 <Method void ByteArrayOutputStream()>
	//   33   56:astore_1        
		byte abyte0[] = new byte[Math.min(8192, i)];
	//   34   57:sipush          8192
	//   35   60:iload_3         
	//   36   61:invokestatic    #221 <Method int Math.min(int, int)>
	//   37   64:newarray        byte[]
	//   38   66:astore          8
		do
		{
			int k = uploadcontext.videoStream.read(abyte0);
	//   39   68:aload_0         
	//   40   69:getfield        #225 <Field InputStream VideoUploader$UploadContext.videoStream>
	//   41   72:aload           8
	//   42   74:invokevirtual   #231 <Method int InputStream.read(byte[])>
	//   43   77:istore          5
			if(k == -1)
				break;
	//   44   79:iload           5
	//   45   81:iconst_m1       
	//   46   82:icmpeq          147
			((ByteArrayOutputStream) (s)).write(abyte0, 0, k);
	//   47   85:aload_1         
	//   48   86:aload           8
	//   49   88:iconst_0        
	//   50   89:iload           5
	//   51   91:invokevirtual   #235 <Method void ByteArrayOutputStream.write(byte[], int, int)>
			int j = i - k;
	//   52   94:iload_3         
	//   53   95:iload           5
	//   54   97:isub            
	//   55   98:istore          4
			if(j == 0)
	//*  56  100:iload           4
	//*  57  102:ifne            108
				break;
	//   58  105:goto            147
			i = j;
	//   59  108:iload           4
	//   60  110:istore_3        
			if(j < 0)
	//*  61  111:iload           4
	//*  62  113:ifge            68
			{
				logError(((Exception) (null)), "Error reading video chunk. Expected buffer length - '%d'. Actual - '%d'.", new Object[] {
					Integer.valueOf(j + k), Integer.valueOf(k)
				});
	//   63  116:aconst_null     
	//   64  117:ldc1            #237 <String "Error reading video chunk. Expected buffer length - '%d'. Actual - '%d'.">
	//   65  119:iconst_2        
	//   66  120:anewarray       Object[]
	//   67  123:dup             
	//   68  124:iconst_0        
	//   69  125:iload           4
	//   70  127:iload           5
	//   71  129:iadd            
	//   72  130:invokestatic    #243 <Method Integer Integer.valueOf(int)>
	//   73  133:aastore         
	//   74  134:dup             
	//   75  135:iconst_1        
	//   76  136:iload           5
	//   77  138:invokestatic    #243 <Method Integer Integer.valueOf(int)>
	//   78  141:aastore         
	//   79  142:invokestatic    #132 <Method void logError(Exception, String, Object[])>
				return null;
	//   80  145:aconst_null     
	//   81  146:areturn         
			}
		} while(true);
		uploadcontext.chunkStart = s1;
	//   82  147:aload_0         
	//   83  148:aload_2         
	//   84  149:putfield        #198 <Field String VideoUploader$UploadContext.chunkStart>
		return ((ByteArrayOutputStream) (s)).toByteArray();
	//   85  152:aload_1         
	//   86  153:invokevirtual   #247 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   87  156:areturn         
	}

	private static Handler getHandler()
	{
		com/facebook/share/internal/VideoUploader;
	//    0    0:ldc1            #2   <Class VideoUploader>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Handler handler1;
		if(handler == null)
	//*   2    3:getstatic       #249 <Field Handler handler>
	//*   3    6:ifnonnull       22
			handler = new Handler(Looper.getMainLooper());
	//    4    9:new             #251 <Class Handler>
	//    5   12:dup             
	//    6   13:invokestatic    #257 <Method Looper Looper.getMainLooper()>
	//    7   16:invokespecial   #260 <Method void Handler(Looper)>
	//    8   19:putstatic       #249 <Field Handler handler>
		handler1 = handler;
	//    9   22:getstatic       #249 <Field Handler handler>
	//   10   25:astore_0        
		com/facebook/share/internal/VideoUploader;
	//   11   26:ldc1            #2   <Class VideoUploader>
		JVM INSTR monitorexit ;
	//   12   28:monitorexit     
		return handler1;
	//   13   29:aload_0         
	//   14   30:areturn         
		Exception exception;
		exception;
	//   15   31:astore_0        
	//*  16   32:ldc1            #2   <Class VideoUploader>
		throw exception;
	//   17   34:monitorexit     
	//   18   35:aload_0         
	//   19   36:athrow          
	}

	private static void issueResponse(UploadContext uploadcontext, FacebookException facebookexception, String s)
	{
		removePendingUpload(uploadcontext);
	//    0    0:aload_0         
	//    1    1:invokestatic    #264 <Method void removePendingUpload(VideoUploader$UploadContext)>
		Utility.closeQuietly(((java.io.Closeable) (uploadcontext.videoStream)));
	//    2    4:aload_0         
	//    3    5:getfield        #225 <Field InputStream VideoUploader$UploadContext.videoStream>
	//    4    8:invokestatic    #268 <Method void Utility.closeQuietly(java.io.Closeable)>
		if(uploadcontext.callback != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #272 <Field FacebookCallback VideoUploader$UploadContext.callback>
	//*   7   15:ifnull          54
		{
			if(facebookexception != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          31
			{
				ShareInternalUtility.invokeOnErrorCallback(uploadcontext.callback, facebookexception);
	//   10   22:aload_0         
	//   11   23:getfield        #272 <Field FacebookCallback VideoUploader$UploadContext.callback>
	//   12   26:aload_1         
	//   13   27:invokestatic    #278 <Method void ShareInternalUtility.invokeOnErrorCallback(FacebookCallback, FacebookException)>
				return;
	//   14   30:return          
			}
			if(uploadcontext.isCanceled)
	//*  15   31:aload_0         
	//*  16   32:getfield        #178 <Field boolean VideoUploader$UploadContext.isCanceled>
	//*  17   35:ifeq            46
			{
				ShareInternalUtility.invokeOnCancelCallback(uploadcontext.callback);
	//   18   38:aload_0         
	//   19   39:getfield        #272 <Field FacebookCallback VideoUploader$UploadContext.callback>
	//   20   42:invokestatic    #282 <Method void ShareInternalUtility.invokeOnCancelCallback(FacebookCallback)>
				return;
	//   21   45:return          
			}
			ShareInternalUtility.invokeOnSuccessCallback(uploadcontext.callback, s);
	//   22   46:aload_0         
	//   23   47:getfield        #272 <Field FacebookCallback VideoUploader$UploadContext.callback>
	//   24   50:aload_2         
	//   25   51:invokestatic    #286 <Method void ShareInternalUtility.invokeOnSuccessCallback(FacebookCallback, String)>
		}
	//   26   54:return          
	}

	private static transient void logError(Exception exception, String s, Object aobj[])
	{
		Log.e("VideoUploader", String.format(Locale.ROOT, s, aobj), ((Throwable) (exception)));
	//    0    0:ldc1            #87  <String "VideoUploader">
	//    1    2:getstatic       #292 <Field Locale Locale.ROOT>
	//    2    5:aload_1         
	//    3    6:aload_2         
	//    4    7:invokestatic    #298 <Method String String.format(Locale, String, Object[])>
	//    5   10:aload_0         
	//    6   11:invokestatic    #304 <Method int Log.e(String, String, Throwable)>
	//    7   14:pop             
	//    8   15:return          
	}

	private static void registerAccessTokenTracker()
	{
		accessTokenTracker = ((AccessTokenTracker) (new AccessTokenTracker() {

			protected void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1)
			{
				if(accesstoken == null)
			//*   0    0:aload_1         
			//*   1    1:ifnonnull       5
					return;
			//    2    4:return          
				if(accesstoken1 == null || !Utility.areObjectsEqual(((Object) (accesstoken1.getUserId())), ((Object) (accesstoken.getUserId()))))
			//*   3    5:aload_2         
			//*   4    6:ifnull          23
			//*   5    9:aload_2         
			//*   6   10:invokevirtual   #21  <Method String AccessToken.getUserId()>
			//*   7   13:aload_1         
			//*   8   14:invokevirtual   #21  <Method String AccessToken.getUserId()>
			//*   9   17:invokestatic    #27  <Method boolean Utility.areObjectsEqual(Object, Object)>
			//*  10   20:ifne            26
					VideoUploader.cancelAllRequests();
			//   11   23:invokestatic    #30  <Method void VideoUploader.access$200()>
			//   12   26:return          
			}

		}
));
	//    0    0:new             #6   <Class VideoUploader$1>
	//    1    3:dup             
	//    2    4:invokespecial   #306 <Method void VideoUploader$1()>
	//    3    7:putstatic       #308 <Field AccessTokenTracker accessTokenTracker>
	//    4   10:return          
	}

	private static void removePendingUpload(UploadContext uploadcontext)
	{
		com/facebook/share/internal/VideoUploader;
	//    0    0:ldc1            #2   <Class VideoUploader>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		pendingUploads.remove(((Object) (uploadcontext)));
	//    2    3:getstatic       #116 <Field Set pendingUploads>
	//    3    6:aload_0         
	//    4    7:invokeinterface #312 <Method boolean Set.remove(Object)>
	//    5   12:pop             
		com/facebook/share/internal/VideoUploader;
	//    6   13:ldc1            #2   <Class VideoUploader>
		JVM INSTR monitorexit ;
	//    7   15:monitorexit     
		return;
	//    8   16:return          
		uploadcontext;
	//    9   17:astore_0        
	//*  10   18:ldc1            #2   <Class VideoUploader>
		throw uploadcontext;
	//   11   20:monitorexit     
	//   12   21:aload_0         
	//   13   22:athrow          
	}

	public static void uploadAsync(ShareVideoContent sharevideocontent, FacebookCallback facebookcallback)
		throws FileNotFoundException
	{
		com/facebook/share/internal/VideoUploader;
	//    0    0:ldc1            #2   <Class VideoUploader>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		uploadAsync(sharevideocontent, "me", facebookcallback);
	//    2    3:aload_0         
	//    3    4:ldc2            #318 <String "me">
	//    4    7:aload_1         
	//    5    8:invokestatic    #321 <Method void uploadAsync(ShareVideoContent, String, FacebookCallback)>
		com/facebook/share/internal/VideoUploader;
	//    6   11:ldc1            #2   <Class VideoUploader>
		JVM INSTR monitorexit ;
	//    7   13:monitorexit     
		return;
	//    8   14:return          
		sharevideocontent;
	//    9   15:astore_0        
	//*  10   16:ldc1            #2   <Class VideoUploader>
		throw sharevideocontent;
	//   11   18:monitorexit     
	//   12   19:aload_0         
	//   13   20:athrow          
	}

	public static void uploadAsync(ShareVideoContent sharevideocontent, String s, FacebookCallback facebookcallback)
		throws FileNotFoundException
	{
		com/facebook/share/internal/VideoUploader;
	//    0    0:ldc1            #2   <Class VideoUploader>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(!initialized)
	//*   2    3:getstatic       #325 <Field boolean initialized>
	//*   3    6:ifne            16
		{
			registerAccessTokenTracker();
	//    4    9:invokestatic    #327 <Method void registerAccessTokenTracker()>
			initialized = true;
	//    5   12:iconst_1        
	//    6   13:putstatic       #325 <Field boolean initialized>
		}
		Validate.notNull(((Object) (sharevideocontent)), "videoContent");
	//    7   16:aload_0         
	//    8   17:ldc2            #329 <String "videoContent">
	//    9   20:invokestatic    #335 <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (s)), "graphNode");
	//   10   23:aload_1         
	//   11   24:ldc2            #337 <String "graphNode">
	//   12   27:invokestatic    #335 <Method void Validate.notNull(Object, String)>
		ShareVideo sharevideo = sharevideocontent.getVideo();
	//   13   30:aload_0         
	//   14   31:invokevirtual   #343 <Method ShareVideo ShareVideoContent.getVideo()>
	//   15   34:astore_3        
		Validate.notNull(((Object) (sharevideo)), "videoContent.video");
	//   16   35:aload_3         
	//   17   36:ldc2            #345 <String "videoContent.video">
	//   18   39:invokestatic    #335 <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (sharevideo.getLocalUrl())), "videoContent.video.localUrl");
	//   19   42:aload_3         
	//   20   43:invokevirtual   #351 <Method Uri ShareVideo.getLocalUrl()>
	//   21   46:ldc2            #353 <String "videoContent.video.localUrl">
	//   22   49:invokestatic    #335 <Method void Validate.notNull(Object, String)>
		sharevideocontent = ((ShareVideoContent) (new UploadContext(sharevideocontent, s, facebookcallback)));
	//   23   52:new             #23  <Class VideoUploader$UploadContext>
	//   24   55:dup             
	//   25   56:aload_0         
	//   26   57:aload_1         
	//   27   58:aload_2         
	//   28   59:aconst_null     
	//   29   60:invokespecial   #356 <Method void VideoUploader$UploadContext(ShareVideoContent, String, FacebookCallback, VideoUploader$1)>
	//   30   63:astore_0        
		((UploadContext) (sharevideocontent)).initialize();
	//   31   64:aload_0         
	//   32   65:invokestatic    #359 <Method void VideoUploader$UploadContext.access$100(VideoUploader$UploadContext)>
		pendingUploads.add(((Object) (sharevideocontent)));
	//   33   68:getstatic       #116 <Field Set pendingUploads>
	//   34   71:aload_0         
	//   35   72:invokeinterface #362 <Method boolean Set.add(Object)>
	//   36   77:pop             
		enqueueUploadStart(((UploadContext) (sharevideocontent)), 0);
	//   37   78:aload_0         
	//   38   79:iconst_0        
	//   39   80:invokestatic    #137 <Method void enqueueUploadStart(VideoUploader$UploadContext, int)>
		com/facebook/share/internal/VideoUploader;
	//   40   83:ldc1            #2   <Class VideoUploader>
		JVM INSTR monitorexit ;
	//   41   85:monitorexit     
		return;
	//   42   86:return          
		sharevideocontent;
	//   43   87:astore_0        
	//*  44   88:ldc1            #2   <Class VideoUploader>
		throw sharevideocontent;
	//   45   90:monitorexit     
	//   46   91:aload_0         
	//   47   92:athrow          
	}

	private static final String ERROR_BAD_SERVER_RESPONSE = "Unexpected error in server response";
	private static final String ERROR_UPLOAD = "Video upload failed";
	private static final int MAX_RETRIES_PER_PHASE = 2;
	private static final String PARAM_DESCRIPTION = "description";
	private static final String PARAM_END_OFFSET = "end_offset";
	private static final String PARAM_FILE_SIZE = "file_size";
	private static final String PARAM_REF = "ref";
	private static final String PARAM_SESSION_ID = "upload_session_id";
	private static final String PARAM_START_OFFSET = "start_offset";
	private static final String PARAM_TITLE = "title";
	private static final String PARAM_UPLOAD_PHASE = "upload_phase";
	private static final String PARAM_VALUE_UPLOAD_FINISH_PHASE = "finish";
	private static final String PARAM_VALUE_UPLOAD_START_PHASE = "start";
	private static final String PARAM_VALUE_UPLOAD_TRANSFER_PHASE = "transfer";
	private static final String PARAM_VIDEO_FILE_CHUNK = "video_file_chunk";
	private static final String PARAM_VIDEO_ID = "video_id";
	private static final int RETRY_DELAY_BACK_OFF_FACTOR = 3;
	private static final int RETRY_DELAY_UNIT_MS = 5000;
	private static final String TAG = "VideoUploader";
	private static final int UPLOAD_QUEUE_MAX_CONCURRENT = 8;
	private static AccessTokenTracker accessTokenTracker;
	private static Handler handler;
	private static boolean initialized;
	private static Set pendingUploads = new HashSet();
	private static WorkQueue uploadQueue = new WorkQueue(8);

	static 
	{
	//    0    0:new             #104 <Class WorkQueue>
	//    1    3:dup             
	//    2    4:bipush          8
	//    3    6:invokespecial   #108 <Method void WorkQueue(int)>
	//    4    9:putstatic       #110 <Field WorkQueue uploadQueue>
	//    5   12:new             #112 <Class HashSet>
	//    6   15:dup             
	//    7   16:invokespecial   #114 <Method void HashSet()>
	//    8   19:putstatic       #116 <Field Set pendingUploads>
	//*   9   22:return          
	}


/*
	static void access$200()
	{
		cancelAllRequests();
	//    0    0:invokestatic    #122 <Method void cancelAllRequests()>
		return;
	//    1    3:return          
	}

*/


/*
	static void access$300(UploadContext uploadcontext, String s, String s1, int i)
	{
		enqueueUploadChunk(uploadcontext, s, s1, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokestatic    #127 <Method void enqueueUploadChunk(VideoUploader$UploadContext, String, String, int)>
		return;
	//    5    7:return          
	}

*/


/*
	static void access$400(Exception exception, String s, Object aobj[])
	{
		logError(exception, s, aobj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #132 <Method void logError(Exception, String, Object[])>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$500(UploadContext uploadcontext, int i)
	{
		enqueueUploadStart(uploadcontext, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #137 <Method void enqueueUploadStart(VideoUploader$UploadContext, int)>
		return;
	//    3    5:return          
	}

*/


/*
	static byte[] access$600(UploadContext uploadcontext, String s, String s1)
		throws IOException
	{
		return getChunk(uploadcontext, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #144 <Method byte[] getChunk(VideoUploader$UploadContext, String, String)>
	//    4    6:areturn         
	}

*/


/*
	static void access$700(UploadContext uploadcontext, int i)
	{
		enqueueUploadFinish(uploadcontext, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #149 <Method void enqueueUploadFinish(VideoUploader$UploadContext, int)>
		return;
	//    3    5:return          
	}

*/


/*
	static Handler access$800()
	{
		return getHandler();
	//    0    0:invokestatic    #154 <Method Handler getHandler()>
	//    1    3:areturn         
	}

*/


/*
	static void access$900(UploadContext uploadcontext, FacebookException facebookexception, String s)
	{
		issueResponse(uploadcontext, facebookexception, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #159 <Method void issueResponse(VideoUploader$UploadContext, FacebookException, String)>
		return;
	//    4    6:return          
	}

*/
}
