// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			VideoUploader

private static class VideoUploader$TransferChunkWorkItem extends VideoUploader.UploadWorkItemBase
{

	protected void enqueueRetry(int i)
	{
		VideoUploader.access$300(uploadContext, chunkStart, chunkEnd, i);
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
		byte abyte0[] = VideoUploader.access$600(uploadContext, chunkStart, chunkEnd);
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
		VideoUploader.access$400(((Exception) (facebookexception)), "Error uploading video '%s'", new Object[] {
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
			VideoUploader.access$700(uploadContext, 0);
	//   12   22:aload_0         
	//   13   23:getfield        #37  <Field VideoUploader$UploadContext uploadContext>
	//   14   26:iconst_0        
	//   15   27:invokestatic    #123 <Method void VideoUploader.access$700(VideoUploader$UploadContext, int)>
			return;
	//   16   30:return          
		} else
		{
			VideoUploader.access$300(uploadContext, s, ((String) (jsonobject)), 0);
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

	public VideoUploader$TransferChunkWorkItem(VideoUploader.UploadContext uploadcontext, String s, String s1, int i)
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
