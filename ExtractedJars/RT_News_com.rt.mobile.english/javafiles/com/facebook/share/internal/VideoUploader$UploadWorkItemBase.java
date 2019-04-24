// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import android.os.Handler;
import com.facebook.*;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			VideoUploader

private static abstract class VideoUploader$UploadWorkItemBase
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
			VideoUploader.access$800().postDelayed(new Runnable() {

				public void run()
				{
					enqueueRetry(completedRetries + 1);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field VideoUploader$UploadWorkItemBase this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field VideoUploader$UploadWorkItemBase this$0>
				//    4    8:getfield        #29  <Field int VideoUploader$UploadWorkItemBase.completedRetries>
				//    5   11:iconst_1        
				//    6   12:iadd            
				//    7   13:invokevirtual   #33  <Method void VideoUploader$UploadWorkItemBase.enqueueRetry(int)>
				//    8   16:return          
				}

				final VideoUploader.UploadWorkItemBase this$0;

			
			{
				this$0 = VideoUploader.UploadWorkItemBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field VideoUploader$UploadWorkItemBase this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
			}
, 5000 * i);
	//   17   37:invokestatic    #57  <Method Handler VideoUploader.access$800()>
	//   18   40:new             #11  <Class VideoUploader$UploadWorkItemBase$1>
	//   19   43:dup             
	//   20   44:aload_0         
	//   21   45:invokespecial   #60  <Method void VideoUploader$UploadWorkItemBase$1(VideoUploader$UploadWorkItemBase)>
	//   22   48:sipush          5000
	//   23   51:iload_1         
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
	//    4    8:getfield        #86  <Field com.facebook.AccessToken VideoUploader$UploadContext.accessToken>
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
	//   19   38:invokespecial   #113 <Method void GraphRequest(com.facebook.AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
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

	protected void issueResponseOnMainThread(final FacebookException error, final String videoId)
	{
		VideoUploader.access$800().post(new Runnable() {

			public void run()
			{
				VideoUploader.access$900(uploadContext, error, videoId);
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

			final VideoUploader.UploadWorkItemBase this$0;
			final FacebookException val$error;
			final String val$videoId;

			
			{
				this$0 = VideoUploader.UploadWorkItemBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field VideoUploader$UploadWorkItemBase this$0>
				error = facebookexception;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field FacebookException val$error>
				videoId = s;
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
	protected VideoUploader.UploadContext uploadContext;

	protected VideoUploader$UploadWorkItemBase(VideoUploader.UploadContext uploadcontext, int i)
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
