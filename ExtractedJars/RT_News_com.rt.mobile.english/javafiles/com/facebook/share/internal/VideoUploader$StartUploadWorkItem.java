// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			VideoUploader

private static class VideoUploader$StartUploadWorkItem extends VideoUploader.UploadWorkItemBase
{

	protected void enqueueRetry(int i)
	{
		VideoUploader.access$500(uploadContext, i);
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
		VideoUploader.access$400(((Exception) (facebookexception)), "Error starting video upload", new Object[0]);
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
		VideoUploader.access$300(uploadContext, s, ((String) (jsonobject)), 0);
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

	public VideoUploader$StartUploadWorkItem(VideoUploader.UploadContext uploadcontext, int i)
	{
		super(uploadcontext, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #23  <Method void VideoUploader$UploadWorkItemBase(VideoUploader$UploadContext, int)>
	//    4    6:return          
	}
}
