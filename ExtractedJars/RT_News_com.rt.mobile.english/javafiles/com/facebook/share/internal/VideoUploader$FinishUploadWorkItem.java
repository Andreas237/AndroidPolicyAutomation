// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			VideoUploader

private static class VideoUploader$FinishUploadWorkItem extends VideoUploader.UploadWorkItemBase
{

	protected void enqueueRetry(int i)
	{
		VideoUploader.access$700(uploadContext, i);
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
		VideoUploader.access$400(((Exception) (facebookexception)), "Video '%s' failed to finish uploading", new Object[] {
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

	public VideoUploader$FinishUploadWorkItem(VideoUploader.UploadContext uploadcontext, int i)
	{
		super(uploadcontext, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #23  <Method void VideoUploader$UploadWorkItemBase(VideoUploader$UploadContext, int)>
	//    4    6:return          
	}
}
