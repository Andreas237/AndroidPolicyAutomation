// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.app.ProgressDialog;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import com.facebook.*;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//			WebDialog, Utility, ServerProtocol

private class WebDialog$UploadStagingResourcesTask extends AsyncTask
{

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #38  <Class Void[]>
	//    3    5:invokevirtual   #41  <Method String[] doInBackground(Void[])>
	//    4    8:areturn         
	}

	protected transient String[] doInBackground(Void avoid[])
	{
		final int writeIndex;
		Object obj;
		final String results[];
		final CountDownLatch latch;
		AccessToken accesstoken;
		obj = ((Object) (parameters.getStringArray("media")));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Bundle parameters>
	//    2    4:ldc1            #45  <String "media">
	//    3    6:invokevirtual   #51  <Method String[] Bundle.getStringArray(String)>
	//    4    9:astore_3        
		results = new String[obj.length];
	//    5   10:aload_3         
	//    6   11:arraylength     
	//    7   12:anewarray       String[]
	//    8   15:astore          4
		exceptions = new Exception[obj.length];
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:arraylength     
	//   12   20:anewarray       Exception[]
	//   13   23:putfield        #34  <Field Exception[] exceptions>
		latch = new CountDownLatch(obj.length);
	//   14   26:new             #55  <Class CountDownLatch>
	//   15   29:dup             
	//   16   30:aload_3         
	//   17   31:arraylength     
	//   18   32:invokespecial   #58  <Method void CountDownLatch(int)>
	//   19   35:astore          5
		avoid = ((Void []) (new ConcurrentLinkedQueue()));
	//   20   37:new             #60  <Class ConcurrentLinkedQueue>
	//   21   40:dup             
	//   22   41:invokespecial   #61  <Method void ConcurrentLinkedQueue()>
	//   23   44:astore_1        
		accesstoken = AccessToken.getCurrentAccessToken();
	//   24   45:invokestatic    #67  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   25   48:astore          6
		writeIndex = 0;
	//   26   50:iconst_0        
	//   27   51:istore_2        
_L2:
		if(writeIndex >= obj.length)
			break MISSING_BLOCK_LABEL_160;
	//   28   52:iload_2         
	//   29   53:aload_3         
	//   30   54:arraylength     
	//   31   55:icmpge          160
		if(isCancelled())
	//*  32   58:aload_0         
	//*  33   59:invokevirtual   #71  <Method boolean isCancelled()>
	//*  34   62:ifeq            96
		{
			for(obj = ((Object) (((ConcurrentLinkedQueue) (avoid)).iterator())); ((Iterator) (obj)).hasNext(); ((AsyncTask)((Iterator) (obj)).next()).cancel(true));
	//   35   65:aload_1         
	//   36   66:invokevirtual   #75  <Method Iterator ConcurrentLinkedQueue.iterator()>
	//   37   69:astore_3        
	//   38   70:aload_3         
	//   39   71:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//   40   76:ifeq            205
	//   41   79:aload_3         
	//   42   80:invokeinterface #84  <Method Object Iterator.next()>
	//   43   85:checkcast       #5   <Class AsyncTask>
	//   44   88:iconst_1        
	//   45   89:invokevirtual   #88  <Method boolean AsyncTask.cancel(boolean)>
	//   46   92:pop             
			break MISSING_BLOCK_LABEL_205;
	//   47   93:goto            70
		}
		Uri uri = Uri.parse(((String) (obj[writeIndex])));
	//   48   96:aload_3         
	//   49   97:iload_2         
	//   50   98:aaload          
	//   51   99:invokestatic    #94  <Method Uri Uri.parse(String)>
	//   52  102:astore          7
		if(Utility.isWebUri(uri))
	//*  53  104:aload           7
	//*  54  106:invokestatic    #100 <Method boolean Utility.isWebUri(Uri)>
	//*  55  109:ifeq            129
		{
			results[writeIndex] = uri.toString();
	//   56  112:aload           4
	//   57  114:iload_2         
	//   58  115:aload           7
	//   59  117:invokevirtual   #104 <Method String Uri.toString()>
	//   60  120:aastore         
			latch.countDown();
	//   61  121:aload           5
	//   62  123:invokevirtual   #107 <Method void CountDownLatch.countDown()>
			break MISSING_BLOCK_LABEL_207;
	//   63  126:goto            207
		}
		try
		{
			((ConcurrentLinkedQueue) (avoid)).add(((Object) (ShareInternalUtility.newUploadStagingResourceWithImageRequest(accesstoken, uri, new com.facebook.GraphRequest.Callback() {

				public void onCompleted(GraphResponse graphresponse)
				{
					Object obj1 = ((Object) (graphresponse.getError()));
				//    0    0:aload_1         
				//    1    1:invokevirtual   #46  <Method FacebookRequestError GraphResponse.getError()>
				//    2    4:astore_2        
					if(obj1 == null)
						break MISSING_BLOCK_LABEL_33;
				//    3    5:aload_2         
				//    4    6:ifnull          33
					String s = ((FacebookRequestError) (obj1)).getErrorMessage();
				//    5    9:aload_2         
				//    6   10:invokevirtual   #52  <Method String FacebookRequestError.getErrorMessage()>
				//    7   13:astore_3        
					obj1 = ((Object) (s));
				//    8   14:aload_3         
				//    9   15:astore_2        
					if(s == null)
				//*  10   16:aload_3         
				//*  11   17:ifnonnull       23
						obj1 = "Error staging photo.";
				//   12   20:ldc1            #54  <String "Error staging photo.">
				//   13   22:astore_2        
					throw new FacebookGraphResponseException(graphresponse, ((String) (obj1)));
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
							results[writeIndex] = ((String) (graphresponse));
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
							exceptions[writeIndex] = ((Exception) (graphresponse));
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
					latch.countDown();
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

			
			{
				this$1 = WebDialog.UploadStagingResourcesTask.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field WebDialog$UploadStagingResourcesTask this$1>
				results = as;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field String[] val$results>
				writeIndex = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #30  <Field int val$writeIndex>
				latch = countdownlatch;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field CountDownLatch val$latch>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
			}
).executeAsync())));
	//   64  129:aload_1         
	//   65  130:aload           6
	//   66  132:aload           7
	//   67  134:new             #10  <Class WebDialog$UploadStagingResourcesTask$1>
	//   68  137:dup             
	//   69  138:aload_0         
	//   70  139:aload           4
	//   71  141:iload_2         
	//   72  142:aload           5
	//   73  144:invokespecial   #110 <Method void WebDialog$UploadStagingResourcesTask$1(WebDialog$UploadStagingResourcesTask, String[], int, CountDownLatch)>
	//   74  147:invokestatic    #116 <Method GraphRequest ShareInternalUtility.newUploadStagingResourceWithImageRequest(AccessToken, Uri, com.facebook.GraphRequest$Callback)>
	//   75  150:invokevirtual   #122 <Method com.facebook.GraphRequestAsyncTask GraphRequest.executeAsync()>
	//   76  153:invokevirtual   #126 <Method boolean ConcurrentLinkedQueue.add(Object)>
	//   77  156:pop             
		}
	//*  78  157:goto            207
	//*  79  160:aload           5
	//*  80  162:invokevirtual   #129 <Method void CountDownLatch.await()>
	//*  81  165:aload           4
	//*  82  167:areturn         
	//*  83  168:aload_1         
	//*  84  169:invokevirtual   #75  <Method Iterator ConcurrentLinkedQueue.iterator()>
	//*  85  172:astore_1        
	//*  86  173:aload_1         
	//*  87  174:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//*  88  179:ifeq            199
	//*  89  182:aload_1         
	//*  90  183:invokeinterface #84  <Method Object Iterator.next()>
	//*  91  188:checkcast       #5   <Class AsyncTask>
	//*  92  191:iconst_1        
	//*  93  192:invokevirtual   #88  <Method boolean AsyncTask.cancel(boolean)>
	//*  94  195:pop             
	//*  95  196:goto            173
	//*  96  199:aconst_null     
	//*  97  200:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			for(avoid = ((Void []) (((ConcurrentLinkedQueue) (avoid)).iterator())); ((Iterator) (avoid)).hasNext(); ((AsyncTask)((Iterator) (avoid)).next()).cancel(true));
			return null;
		}
		break MISSING_BLOCK_LABEL_207;
		latch.await();
		Exception exception;
		return results;
	//*  98  201:astore_3        
	//*  99  202:goto            168
		return null;
	//  100  205:aconst_null     
	//  101  206:areturn         
		writeIndex++;
	//  102  207:iload_2         
	//  103  208:iconst_1        
	//  104  209:iadd            
	//  105  210:istore_2        
		if(true) goto _L2; else goto _L1
	//  106  211:goto            52
_L1:
	}

	protected volatile void onPostExecute(Object obj)
	{
		onPostExecute((String[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #133 <Class String[]>
	//    3    5:invokevirtual   #136 <Method void onPostExecute(String[])>
	//    4    8:return          
	}

	protected void onPostExecute(String as[])
	{
		WebDialog.access$300(WebDialog.this).dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field WebDialog this$0>
	//    2    4:invokestatic    #140 <Method ProgressDialog WebDialog.access$300(WebDialog)>
	//    3    7:invokevirtual   #145 <Method void ProgressDialog.dismiss()>
		Exception aexception[] = exceptions;
	//    4   10:aload_0         
	//    5   11:getfield        #34  <Field Exception[] exceptions>
	//    6   14:astore          4
		int k = aexception.length;
	//    7   16:aload           4
	//    8   18:arraylength     
	//    9   19:istore_3        
		for(int i = 0; i < k; i++)
	//*  10   20:iconst_0        
	//*  11   21:istore_2        
	//*  12   22:iload_2         
	//*  13   23:iload_3         
	//*  14   24:icmpge          55
		{
			Exception exception = aexception[i];
	//   15   27:aload           4
	//   16   29:iload_2         
	//   17   30:aaload          
	//   18   31:astore          5
			if(exception != null)
	//*  19   33:aload           5
	//*  20   35:ifnull          48
			{
				sendErrorToListener(((Throwable) (exception)));
	//   21   38:aload_0         
	//   22   39:getfield        #22  <Field WebDialog this$0>
	//   23   42:aload           5
	//   24   44:invokevirtual   #149 <Method void WebDialog.sendErrorToListener(Throwable)>
				return;
	//   25   47:return          
			}
		}

	//   26   48:iload_2         
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:istore_2        
	//*  30   52:goto            22
		if(as == null)
	//*  31   55:aload_1         
	//*  32   56:ifnonnull       76
		{
			sendErrorToListener(((Throwable) (new FacebookException("Failed to stage photos for web dialog"))));
	//   33   59:aload_0         
	//   34   60:getfield        #22  <Field WebDialog this$0>
	//   35   63:new             #151 <Class FacebookException>
	//   36   66:dup             
	//   37   67:ldc1            #153 <String "Failed to stage photos for web dialog">
	//   38   69:invokespecial   #156 <Method void FacebookException(String)>
	//   39   72:invokevirtual   #149 <Method void WebDialog.sendErrorToListener(Throwable)>
			return;
	//   40   75:return          
		}
		as = ((String []) (Arrays.asList(((Object []) (as)))));
	//   41   76:aload_1         
	//   42   77:invokestatic    #162 <Method List Arrays.asList(Object[])>
	//   43   80:astore_1        
		if(((List) (as)).contains(((Object) (null))))
	//*  44   81:aload_1         
	//*  45   82:aconst_null     
	//*  46   83:invokeinterface #167 <Method boolean List.contains(Object)>
	//*  47   88:ifeq            108
		{
			sendErrorToListener(((Throwable) (new FacebookException("Failed to stage photos for web dialog"))));
	//   48   91:aload_0         
	//   49   92:getfield        #22  <Field WebDialog this$0>
	//   50   95:new             #151 <Class FacebookException>
	//   51   98:dup             
	//   52   99:ldc1            #153 <String "Failed to stage photos for web dialog">
	//   53  101:invokespecial   #156 <Method void FacebookException(String)>
	//   54  104:invokevirtual   #149 <Method void WebDialog.sendErrorToListener(Throwable)>
			return;
	//   55  107:return          
		} else
		{
			Utility.putJSONValueInBundle(parameters, "media", ((Object) (new JSONArray(((java.util.Collection) (as))))));
	//   56  108:aload_0         
	//   57  109:getfield        #29  <Field Bundle parameters>
	//   58  112:ldc1            #45  <String "media">
	//   59  114:new             #169 <Class JSONArray>
	//   60  117:dup             
	//   61  118:aload_1         
	//   62  119:invokespecial   #172 <Method void JSONArray(java.util.Collection)>
	//   63  122:invokestatic    #176 <Method boolean Utility.putJSONValueInBundle(Bundle, String, Object)>
	//   64  125:pop             
			as = ((String []) (ServerProtocol.getDialogAuthority()));
	//   65  126:invokestatic    #181 <Method String ServerProtocol.getDialogAuthority()>
	//   66  129:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   67  130:new             #183 <Class StringBuilder>
	//   68  133:dup             
	//   69  134:invokespecial   #184 <Method void StringBuilder()>
	//   70  137:astore          4
			stringbuilder.append(FacebookSdk.getGraphApiVersion());
	//   71  139:aload           4
	//   72  141:invokestatic    #189 <Method String FacebookSdk.getGraphApiVersion()>
	//   73  144:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   74  147:pop             
			stringbuilder.append("/");
	//   75  148:aload           4
	//   76  150:ldc1            #195 <String "/">
	//   77  152:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   78  155:pop             
			stringbuilder.append("dialog/");
	//   79  156:aload           4
	//   80  158:ldc1            #197 <String "dialog/">
	//   81  160:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   82  163:pop             
			stringbuilder.append(action);
	//   83  164:aload           4
	//   84  166:aload_0         
	//   85  167:getfield        #27  <Field String action>
	//   86  170:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   87  173:pop             
			as = ((String []) (Utility.buildUri(((String) (as)), stringbuilder.toString(), parameters)));
	//   88  174:aload_1         
	//   89  175:aload           4
	//   90  177:invokevirtual   #198 <Method String StringBuilder.toString()>
	//   91  180:aload_0         
	//   92  181:getfield        #29  <Field Bundle parameters>
	//   93  184:invokestatic    #202 <Method Uri Utility.buildUri(String, String, Bundle)>
	//   94  187:astore_1        
			WebDialog.access$902(WebDialog.this, ((Uri) (as)).toString());
	//   95  188:aload_0         
	//   96  189:getfield        #22  <Field WebDialog this$0>
	//   97  192:aload_1         
	//   98  193:invokevirtual   #104 <Method String Uri.toString()>
	//   99  196:invokestatic    #206 <Method String WebDialog.access$902(WebDialog, String)>
	//  100  199:pop             
			int j = WebDialog.access$600(WebDialog.this).getDrawable().getIntrinsicWidth();
	//  101  200:aload_0         
	//  102  201:getfield        #22  <Field WebDialog this$0>
	//  103  204:invokestatic    #210 <Method ImageView WebDialog.access$600(WebDialog)>
	//  104  207:invokevirtual   #216 <Method Drawable ImageView.getDrawable()>
	//  105  210:invokevirtual   #222 <Method int Drawable.getIntrinsicWidth()>
	//  106  213:istore_2        
			WebDialog.access$1000(WebDialog.this, j / 2 + 1);
	//  107  214:aload_0         
	//  108  215:getfield        #22  <Field WebDialog this$0>
	//  109  218:iload_2         
	//  110  219:iconst_2        
	//  111  220:idiv            
	//  112  221:iconst_1        
	//  113  222:iadd            
	//  114  223:invokestatic    #226 <Method void WebDialog.access$1000(WebDialog, int)>
			return;
	//  115  226:return          
		}
	}

	private String action;
	private Exception exceptions[];
	private Bundle parameters;
	final WebDialog this$0;


/*
	static Exception[] access$800(WebDialog$UploadStagingResourcesTask webdialog$uploadstagingresourcestask)
	{
		return webdialog$uploadstagingresourcestask.exceptions;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Exception[] exceptions>
	//    2    4:areturn         
	}

*/

	WebDialog$UploadStagingResourcesTask(String s, Bundle bundle)
	{
		this$0 = WebDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field WebDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void AsyncTask()>
		action = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String action>
		parameters = bundle;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field Bundle parameters>
	//   11   19:return          
	}
}
