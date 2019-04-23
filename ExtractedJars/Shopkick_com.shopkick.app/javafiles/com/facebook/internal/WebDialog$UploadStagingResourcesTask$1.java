// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import com.facebook.*;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//			WebDialog

class WebDialog$UploadStagingResourcesTask$1
	implements com.facebook.GraphRequest.Callback
{

	public void onCompleted(GraphResponse graphresponse)
	{
		Object obj = ((Object) (graphresponse.getError()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #46  <Method FacebookRequestError GraphResponse.getError()>
	//    2    4:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_33;
	//    3    5:aload_2         
	//    4    6:ifnull          33
		String s = ((FacebookRequestError) (obj)).getErrorMessage();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #52  <Method String FacebookRequestError.getErrorMessage()>
	//    7   13:astore_3        
		obj = ((Object) (s));
	//    8   14:aload_3         
	//    9   15:astore_2        
		if(s == null)
	//*  10   16:aload_3         
	//*  11   17:ifnonnull       23
			obj = "Error staging photo.";
	//   12   20:ldc1            #54  <String "Error staging photo.">
	//   13   22:astore_2        
		throw new FacebookGraphResponseException(graphresponse, ((String) (obj)));
	//   14   23:new             #56  <Class FacebookGraphResponseException>
	//   15   26:dup             
	//   16   27:aload_1         
	//   17   28:aload_2         
	//   18   29:invokespecial   #59  <Method void FacebookGraphResponseException(GraphResponse, String)>
	//   19   32:athrow          
		graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
	//   20   33:aload_1         
	//   21   34:invokevirtual   #63  <Method JSONObject GraphResponse.getJSONObject()>
	//   22   37:astore_1        
		if(graphresponse == null)
			break MISSING_BLOCK_LABEL_76;
	//   23   38:aload_1         
	//   24   39:ifnull          76
		graphresponse = ((GraphResponse) (((JSONObject) (graphresponse)).optString("uri")));
	//   25   42:aload_1         
	//   26   43:ldc1            #65  <String "uri">
	//   27   45:invokevirtual   #71  <Method String JSONObject.optString(String)>
	//   28   48:astore_1        
		if(graphresponse != null)
	//*  29   49:aload_1         
	//*  30   50:ifnull          66
		{
			try
			{
				val$results[val$writeIndex] = ((String) (graphresponse));
	//   31   53:aload_0         
	//   32   54:getfield        #28  <Field String[] val$results>
	//   33   57:aload_0         
	//   34   58:getfield        #30  <Field int val$writeIndex>
	//   35   61:aload_1         
	//   36   62:aastore         
			}
	//*  37   63:goto            100
	//*  38   66:new             #73  <Class FacebookException>
	//*  39   69:dup             
	//*  40   70:ldc1            #54  <String "Error staging photo.">
	//*  41   72:invokespecial   #76  <Method void FacebookException(String)>
	//*  42   75:athrow          
	//*  43   76:new             #73  <Class FacebookException>
	//*  44   79:dup             
	//*  45   80:ldc1            #54  <String "Error staging photo.">
	//*  46   82:invokespecial   #76  <Method void FacebookException(String)>
	//*  47   85:athrow          
			// Misplaced declaration of an exception variable
			catch(GraphResponse graphresponse)
	//*  48   86:astore_1        
			{
				WebDialog.UploadStagingResourcesTask.access$800(WebDialog.UploadStagingResourcesTask.this)[val$writeIndex] = ((Exception) (graphresponse));
	//   49   87:aload_0         
	//   50   88:getfield        #26  <Field WebDialog$UploadStagingResourcesTask this$1>
	//   51   91:invokestatic    #80  <Method Exception[] WebDialog$UploadStagingResourcesTask.access$800(WebDialog$UploadStagingResourcesTask)>
	//   52   94:aload_0         
	//   53   95:getfield        #30  <Field int val$writeIndex>
	//   54   98:aload_1         
	//   55   99:aastore         
			}
			break MISSING_BLOCK_LABEL_100;
		}
		throw new FacebookException("Error staging photo.");
		throw new FacebookException("Error staging photo.");
		val$latch.countDown();
	//   56  100:aload_0         
	//   57  101:getfield        #32  <Field CountDownLatch val$latch>
	//   58  104:invokevirtual   #85  <Method void CountDownLatch.countDown()>
		return;
	//   59  107:return          
	}

	final WebDialog.UploadStagingResourcesTask this$1;
	final CountDownLatch val$latch;
	final String val$results[];
	final int val$writeIndex;

	WebDialog$UploadStagingResourcesTask$1()
	{
		this$1 = final_uploadstagingresourcestask;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field WebDialog$UploadStagingResourcesTask this$1>
		val$results = as;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field String[] val$results>
		val$writeIndex = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #30  <Field int val$writeIndex>
		val$latch = CountDownLatch.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field CountDownLatch val$latch>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #35  <Method void Object()>
	//   14   25:return          
	}
}
