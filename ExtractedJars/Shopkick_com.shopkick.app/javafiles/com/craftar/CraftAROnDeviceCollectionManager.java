// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.zip.*;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.craftar:
//			Build, MySSLSocketFactory, CraftARGenericSDK, CLog, 
//			CraftARError, ResourceDownloader, FileUtil, CraftAROnDeviceCollection

public class CraftAROnDeviceCollectionManager
{
	public static interface AddCollectionListener
	{

		public abstract void addCollectionFailed(CraftARError craftarerror);

		public abstract void addCollectionProgress(float f);

		public abstract void collectionAdded(CraftAROnDeviceCollection craftarondevicecollection);
	}

	public static interface DeleteCollectionListener
	{

		public abstract void collectionDeleted();

		public abstract void deleteCollectionFailed(CraftARError craftarerror);
	}

	class ManagerHandlerThread extends HandlerThread
	{

		public void start()
		{
			super.start();
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void HandlerThread.start()>
			mHandler = new Handler(getLooper());
		//    2    4:aload_0         
		//    3    5:getfield        #13  <Field CraftAROnDeviceCollectionManager this$0>
		//    4    8:new             #23  <Class Handler>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:invokevirtual   #27  <Method android.os.Looper getLooper()>
		//    8   16:invokespecial   #30  <Method void Handler(android.os.Looper)>
		//    9   19:invokestatic    #34  <Method Handler CraftAROnDeviceCollectionManager.access$602(CraftAROnDeviceCollectionManager, Handler)>
		//   10   22:pop             
		//   11   23:return          
		}

		final CraftAROnDeviceCollectionManager this$0;

		public ManagerHandlerThread(String s)
		{
			this$0 = CraftAROnDeviceCollectionManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field CraftAROnDeviceCollectionManager this$0>
			super(s);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void HandlerThread(String)>
		//    6   10:return          
		}
	}

	private class SYNC_ERROR_CODES
	{

		static final String APP_ID_MISSING = "APP_ID_MISSING";
		static final String SDK_VERSION_APP_ID_NOT_FOUND = "SDK_VERSION_APP_ID_NOT_FOUND";
		static final String SDK_VERSION_MISSING = "SDK_VERSION_MISSING";
		static final String TOKEN_INVALID = "TOKEN_INVALID";
		static final String TOKEN_MISSING = "TOKEN_MISSING";
		final CraftAROnDeviceCollectionManager this$0;

		private SYNC_ERROR_CODES()
		{
			this$0 = CraftAROnDeviceCollectionManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field CraftAROnDeviceCollectionManager this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #27  <Method void Object()>
		//    5    9:return          
		}
	}

	public static interface SyncCollectionListener
	{

		public abstract void syncFailed(CraftAROnDeviceCollection craftarondevicecollection, CraftARError craftarerror);

		public abstract void syncFinishedWithErrors(CraftAROnDeviceCollection craftarondevicecollection, int i, int j);

		public abstract void syncProgress(CraftAROnDeviceCollection craftarondevicecollection, float f);

		public abstract void syncSuccessful(CraftAROnDeviceCollection craftarondevicecollection);
	}


	private CraftAROnDeviceCollectionManager(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method void Object()>
		SYNC_URL = "https://search.craftar.net/v2/sync";
	//    2    4:aload_0         
	//    3    5:ldc1            #97  <String "https://search.craftar.net/v2/sync">
	//    4    7:putfield        #99  <Field String SYNC_URL>
		mResponseHandlerThread = null;
	//    5   10:aload_0         
	//    6   11:aconst_null     
	//    7   12:putfield        #101 <Field Handler mResponseHandlerThread>
		mContext = context;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:putfield        #103 <Field Context mContext>
		Build.setup();
	//   11   20:invokestatic    #108 <Method void Build.setup()>
		collectionsRoot = getCollectionsRoot(context);
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokespecial   #112 <Method String getCollectionsRoot(Context)>
	//   16   29:putfield        #114 <Field String collectionsRoot>
		collectionBundlesRoot = getCollectionsBundlesRoot(collectionsRoot);
	//   17   32:aload_0         
	//   18   33:aload_0         
	//   19   34:aload_0         
	//   20   35:getfield        #114 <Field String collectionsRoot>
	//   21   38:invokespecial   #118 <Method String getCollectionsBundlesRoot(String)>
	//   22   41:putfield        #120 <Field String collectionBundlesRoot>
		mediaRoot = getMediaPath(collectionsRoot);
	//   23   44:aload_0         
	//   24   45:aload_0         
	//   25   46:aload_0         
	//   26   47:getfield        #114 <Field String collectionsRoot>
	//   27   50:invokespecial   #123 <Method String getMediaPath(String)>
	//   28   53:putfield        #125 <Field String mediaRoot>
		context = ((Context) (new File(collectionsRoot)));
	//   29   56:new             #127 <Class File>
	//   30   59:dup             
	//   31   60:aload_0         
	//   32   61:getfield        #114 <Field String collectionsRoot>
	//   33   64:invokespecial   #130 <Method void File(String)>
	//   34   67:astore_1        
		if(!((File) (context)).exists())
	//*  35   68:aload_1         
	//*  36   69:invokevirtual   #134 <Method boolean File.exists()>
	//*  37   72:ifne            80
			((File) (context)).mkdirs();
	//   38   75:aload_1         
	//   39   76:invokevirtual   #137 <Method boolean File.mkdirs()>
	//   40   79:pop             
		context = ((Context) (new File(collectionBundlesRoot)));
	//   41   80:new             #127 <Class File>
	//   42   83:dup             
	//   43   84:aload_0         
	//   44   85:getfield        #120 <Field String collectionBundlesRoot>
	//   45   88:invokespecial   #130 <Method void File(String)>
	//   46   91:astore_1        
		if(!((File) (context)).exists())
	//*  47   92:aload_1         
	//*  48   93:invokevirtual   #134 <Method boolean File.exists()>
	//*  49   96:ifne            104
			((File) (context)).mkdirs();
	//   50   99:aload_1         
	//   51  100:invokevirtual   #137 <Method boolean File.mkdirs()>
	//   52  103:pop             
		managerHandlerThread = new ManagerHandlerThread("CraftARCollectionManagerThread");
	//   53  104:aload_0         
	//   54  105:new             #50  <Class CraftAROnDeviceCollectionManager$ManagerHandlerThread>
	//   55  108:dup             
	//   56  109:aload_0         
	//   57  110:ldc1            #139 <String "CraftARCollectionManagerThread">
	//   58  112:invokespecial   #142 <Method void CraftAROnDeviceCollectionManager$ManagerHandlerThread(CraftAROnDeviceCollectionManager, String)>
	//   59  115:putfield        #144 <Field CraftAROnDeviceCollectionManager$ManagerHandlerThread managerHandlerThread>
		managerHandlerThread.start();
	//   60  118:aload_0         
	//   61  119:getfield        #144 <Field CraftAROnDeviceCollectionManager$ManagerHandlerThread managerHandlerThread>
	//   62  122:invokevirtual   #147 <Method void CraftAROnDeviceCollectionManager$ManagerHandlerThread.start()>
		mResponseHandlerThread = new Handler(mContext.getMainLooper());
	//   63  125:aload_0         
	//   64  126:new             #149 <Class Handler>
	//   65  129:dup             
	//   66  130:aload_0         
	//   67  131:getfield        #103 <Field Context mContext>
	//   68  134:invokevirtual   #155 <Method android.os.Looper Context.getMainLooper()>
	//   69  137:invokespecial   #158 <Method void Handler(android.os.Looper)>
	//   70  140:putfield        #101 <Field Handler mResponseHandlerThread>
		HttpsURLConnection.setDefaultSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (new MySSLSocketFactory())));
	//   71  143:new             #160 <Class MySSLSocketFactory>
	//   72  146:dup             
	//   73  147:invokespecial   #161 <Method void MySSLSocketFactory()>
	//   74  150:invokestatic    #167 <Method void HttpsURLConnection.setDefaultSSLSocketFactory(javax.net.ssl.SSLSocketFactory)>
	//   75  153:return          
	}

	public static CraftAROnDeviceCollectionManager Instance()
	{
		if(self == null && CraftARGenericSDK.context != null)
	//*   0    0:getstatic       #172 <Field CraftAROnDeviceCollectionManager self>
	//*   1    3:ifnonnull       31
	//*   2    6:getstatic       #177 <Field Context CraftARGenericSDK.context>
	//*   3    9:ifnull          31
		{
			self = new CraftAROnDeviceCollectionManager(CraftARGenericSDK.context);
	//    4   12:new             #2   <Class CraftAROnDeviceCollectionManager>
	//    5   15:dup             
	//    6   16:getstatic       #177 <Field Context CraftARGenericSDK.context>
	//    7   19:invokespecial   #179 <Method void CraftAROnDeviceCollectionManager(Context)>
	//    8   22:putstatic       #172 <Field CraftAROnDeviceCollectionManager self>
			self.reloadCollectionsDict();
	//    9   25:getstatic       #172 <Field CraftAROnDeviceCollectionManager self>
	//   10   28:invokespecial   #182 <Method void reloadCollectionsDict()>
		}
		return self;
	//   11   31:getstatic       #172 <Field CraftAROnDeviceCollectionManager self>
	//   12   34:areturn         
	}

	private void addCollectionWithTokenInternal(final String bundleURL, final String bundleOutputPath, final AddCollectionListener listener)
	{
		Object obj;
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #227 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #228 <Method void StringBuilder()>
	//    3    7:astore          4
		((StringBuilder) (obj)).append("connectSync with token ");
	//    4    9:aload           4
	//    5   11:ldc1            #230 <String "connectSync with token ">
	//    6   13:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		((StringBuilder) (obj)).append(bundleURL);
	//    8   17:aload           4
	//    9   19:aload_1         
	//   10   20:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		CLog.d(((StringBuilder) (obj)).toString());
	//   12   24:aload           4
	//   13   26:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   14   29:invokestatic    #243 <Method void CLog.d(String)>
		if(bundleURL == null)
	//*  15   32:aload_1         
	//*  16   33:ifnonnull       75
		{
			CLog.e("Error: null token passed");
	//   17   36:ldc1            #245 <String "Error: null token passed">
	//   18   38:invokestatic    #248 <Method void CLog.e(String)>
			bundleURL = ((String) (new CraftARError(CraftARError.ERROR_CODES.TOKEN_INVALID, "The token passed is null.")));
	//   19   41:new             #250 <Class CraftARError>
	//   20   44:dup             
	//   21   45:getstatic       #256 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.TOKEN_INVALID>
	//   22   48:ldc2            #258 <String "The token passed is null.">
	//   23   51:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   24   54:astore_1        
			if(listener != null)
	//*  25   55:aload_3         
	//*  26   56:ifnull          67
			{
				listener.addCollectionFailed(((CraftARError) (bundleURL)));
	//   27   59:aload_3         
	//   28   60:aload_1         
	//   29   61:invokeinterface #265 <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
				return;
	//   30   66:return          
			} else
			{
				CLog.e(((CraftARError) (bundleURL)).getErrorMessage());
	//   31   67:aload_1         
	//   32   68:invokevirtual   #268 <Method String CraftARError.getErrorMessage()>
	//   33   71:invokestatic    #248 <Method void CLog.e(String)>
				return;
	//   34   74:return          
			}
		}
		HttpURLConnection httpurlconnection;
		HttpUtils.URLParameterBuilder urlparameterbuilder;
		try
		{
			httpurlconnection = (HttpURLConnection)(new URL(SYNC_URL)).openConnection();
	//   35   75:new             #270 <Class URL>
	//   36   78:dup             
	//   37   79:aload_0         
	//   38   80:getfield        #99  <Field String SYNC_URL>
	//   39   83:invokespecial   #271 <Method void URL(String)>
	//   40   86:invokevirtual   #275 <Method java.net.URLConnection URL.openConnection()>
	//   41   89:checkcast       #277 <Class HttpURLConnection>
	//   42   92:astore          5
			httpurlconnection.setRequestMethod("POST");
	//   43   94:aload           5
	//   44   96:ldc2            #279 <String "POST">
	//   45   99:invokevirtual   #282 <Method void HttpURLConnection.setRequestMethod(String)>
			httpurlconnection.setDoInput(true);
	//   46  102:aload           5
	//   47  104:iconst_1        
	//   48  105:invokevirtual   #286 <Method void HttpURLConnection.setDoInput(boolean)>
			httpurlconnection.setDoOutput(true);
	//   49  108:aload           5
	//   50  110:iconst_1        
	//   51  111:invokevirtual   #289 <Method void HttpURLConnection.setDoOutput(boolean)>
			urlparameterbuilder = new HttpUtils.URLParameterBuilder();
	//   52  114:new             #291 <Class HttpUtils$URLParameterBuilder>
	//   53  117:dup             
	//   54  118:invokespecial   #292 <Method void HttpUtils$URLParameterBuilder()>
	//   55  121:astore          6
		}
	//*  56  123:aload_2         
	//*  57  124:ifnull          836
	//*  58  127:aload_2         
	//*  59  128:astore          4
	//*  60  130:aload_2         
	//*  61  131:ldc2            #294 <String "">
	//*  62  134:invokevirtual   #300 <Method boolean String.equals(Object)>
	//*  63  137:ifeq            143
	//*  64  140:goto            836
	//*  65  143:aload           6
	//*  66  145:ldc1            #67  <String "version">
	//*  67  147:getstatic       #303 <Field String Build.SDK_VERSION>
	//*  68  150:invokevirtual   #307 <Method void HttpUtils$URLParameterBuilder.addParameter(String, String)>
	//*  69  153:aload           6
	//*  70  155:ldc1            #61  <String "app_id">
	//*  71  157:aload_0         
	//*  72  158:getfield        #103 <Field Context mContext>
	//*  73  161:invokevirtual   #310 <Method String Context.getPackageName()>
	//*  74  164:invokevirtual   #307 <Method void HttpUtils$URLParameterBuilder.addParameter(String, String)>
	//*  75  167:aload           6
	//*  76  169:ldc1            #73  <String "token">
	//*  77  171:aload_1         
	//*  78  172:invokevirtual   #307 <Method void HttpUtils$URLParameterBuilder.addParameter(String, String)>
	//*  79  175:aload           6
	//*  80  177:ldc1            #64  <String "bundled">
	//*  81  179:ldc2            #312 <String "true">
	//*  82  182:invokevirtual   #307 <Method void HttpUtils$URLParameterBuilder.addParameter(String, String)>
	//*  83  185:aload           6
	//*  84  187:ldc1            #70  <String "tag">
	//*  85  189:aload           4
	//*  86  191:invokevirtual   #307 <Method void HttpUtils$URLParameterBuilder.addParameter(String, String)>
	//*  87  194:new             #227 <Class StringBuilder>
	//*  88  197:dup             
	//*  89  198:invokespecial   #228 <Method void StringBuilder()>
	//*  90  201:astore_2        
	//*  91  202:aload_2         
	//*  92  203:ldc2            #314 <String "Sync request params :\n\t app-id: '">
	//*  93  206:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  94  209:pop             
	//*  95  210:aload_2         
	//*  96  211:aload_0         
	//*  97  212:getfield        #103 <Field Context mContext>
	//*  98  215:invokevirtual   #310 <Method String Context.getPackageName()>
	//*  99  218:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 100  221:pop             
	//* 101  222:aload_2         
	//* 102  223:ldc2            #316 <String "'\n\t version: '">
	//* 103  226:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 104  229:pop             
	//* 105  230:aload_2         
	//* 106  231:getstatic       #303 <Field String Build.SDK_VERSION>
	//* 107  234:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 108  237:pop             
	//* 109  238:aload_2         
	//* 110  239:ldc2            #318 <String "'\n\t token: '">
	//* 111  242:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 112  245:pop             
	//* 113  246:aload_2         
	//* 114  247:aload_1         
	//* 115  248:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 116  251:pop             
	//* 117  252:aload_2         
	//* 118  253:ldc2            #320 <String "'\n\t tag: '">
	//* 119  256:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 120  259:pop             
	//* 121  260:aload_2         
	//* 122  261:aload           4
	//* 123  263:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 124  266:pop             
	//* 125  267:aload_2         
	//* 126  268:ldc2            #322 <String "'\n">
	//* 127  271:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 128  274:pop             
	//* 129  275:aload_2         
	//* 130  276:invokevirtual   #238 <Method String StringBuilder.toString()>
	//* 131  279:invokestatic    #243 <Method void CLog.d(String)>
	//* 132  282:aload           5
	//* 133  284:invokevirtual   #326 <Method OutputStream HttpURLConnection.getOutputStream()>
	//* 134  287:astore_1        
	//* 135  288:aload_1         
	//* 136  289:aload           6
	//* 137  291:invokevirtual   #329 <Method String HttpUtils$URLParameterBuilder.getURLParameters()>
	//* 138  294:invokevirtual   #333 <Method byte[] String.getBytes()>
	//* 139  297:invokevirtual   #339 <Method void OutputStream.write(byte[])>
	//* 140  300:aload_1         
	//* 141  301:invokevirtual   #342 <Method void OutputStream.close()>
	//* 142  304:aload           5
	//* 143  306:invokevirtual   #345 <Method void HttpURLConnection.connect()>
	//* 144  309:new             #347 <Class StringBuffer>
	//* 145  312:dup             
	//* 146  313:ldc2            #294 <String "">
	//* 147  316:invokespecial   #348 <Method void StringBuffer(String)>
	//* 148  319:astore_2        
	//* 149  320:aload           5
	//* 150  322:invokevirtual   #352 <Method InputStream HttpURLConnection.getInputStream()>
	//* 151  325:astore_1        
	//* 152  326:goto            335
	//* 153  329:aload           5
	//* 154  331:invokevirtual   #355 <Method InputStream HttpURLConnection.getErrorStream()>
	//* 155  334:astore_1        
	//* 156  335:new             #357 <Class BufferedReader>
	//* 157  338:dup             
	//* 158  339:new             #359 <Class InputStreamReader>
	//* 159  342:dup             
	//* 160  343:aload_1         
	//* 161  344:invokespecial   #362 <Method void InputStreamReader(InputStream)>
	//* 162  347:invokespecial   #365 <Method void BufferedReader(java.io.Reader)>
	//* 163  350:astore_1        
	//* 164  351:aload_1         
	//* 165  352:invokevirtual   #368 <Method String BufferedReader.readLine()>
	//* 166  355:astore          4
	//* 167  357:aload           4
	//* 168  359:ifnull          372
	//* 169  362:aload_2         
	//* 170  363:aload           4
	//* 171  365:invokevirtual   #371 <Method StringBuffer StringBuffer.append(String)>
	//* 172  368:pop             
	//* 173  369:goto            351
	//* 174  372:aload_1         
	//* 175  373:invokevirtual   #372 <Method void BufferedReader.close()>
	//* 176  376:aload_2         
	//* 177  377:invokevirtual   #373 <Method String StringBuffer.toString()>
	//* 178  380:astore_1        
	//* 179  381:aload_1         
	//* 180  382:ifnull          723
	//* 181  385:new             #227 <Class StringBuilder>
	//* 182  388:dup             
	//* 183  389:invokespecial   #228 <Method void StringBuilder()>
	//* 184  392:astore_2        
	//* 185  393:aload_2         
	//* 186  394:ldc2            #375 <String "Received response: '">
	//* 187  397:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 188  400:pop             
	//* 189  401:aload_2         
	//* 190  402:aload_1         
	//* 191  403:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 192  406:pop             
	//* 193  407:aload_2         
	//* 194  408:ldc2            #377 <String "'">
	//* 195  411:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 196  414:pop             
	//* 197  415:aload_2         
	//* 198  416:invokevirtual   #238 <Method String StringBuilder.toString()>
	//* 199  419:invokestatic    #380 <Method void CLog.i(String)>
	//* 200  422:new             #382 <Class JSONObject>
	//* 201  425:dup             
	//* 202  426:aload_1         
	//* 203  427:invokespecial   #383 <Method void JSONObject(String)>
	//* 204  430:astore_2        
	//* 205  431:aload_0         
	//* 206  432:aload_2         
	//* 207  433:invokespecial   #387 <Method CraftARError validateSyncResponse(JSONObject)>
	//* 208  436:astore_1        
	//* 209  437:aload_1         
	//* 210  438:ifnull          461
	//* 211  441:aload_3         
	//* 212  442:ifnull          453
	//* 213  445:aload_3         
	//* 214  446:aload_1         
	//* 215  447:invokeinterface #265 <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
	//* 216  452:return          
	//* 217  453:aload_1         
	//* 218  454:invokevirtual   #268 <Method String CraftARError.getErrorMessage()>
	//* 219  457:invokestatic    #248 <Method void CLog.e(String)>
	//* 220  460:return          
	//* 221  461:aload_2         
	//* 222  462:ldc2            #389 <String "created">
	//* 223  465:invokevirtual   #392 <Method String JSONObject.getString(String)>
	//* 224  468:pop             
	//* 225  469:ldc2            #394 <String "Downloading new bundle....">
	//* 226  472:invokestatic    #243 <Method void CLog.d(String)>
	//* 227  475:aload_2         
	//* 228  476:ldc2            #396 <String "url">
	//* 229  479:invokevirtual   #392 <Method String JSONObject.getString(String)>
	//* 230  482:astore_1        
	//* 231  483:aload_2         
	//* 232  484:ldc2            #398 <String "collection_uuid">
	//* 233  487:invokevirtual   #392 <Method String JSONObject.getString(String)>
	//* 234  490:astore_2        
	//* 235  491:new             #227 <Class StringBuilder>
	//* 236  494:dup             
	//* 237  495:invokespecial   #228 <Method void StringBuilder()>
	//* 238  498:astore          4
	//* 239  500:aload           4
	//* 240  502:aload_0         
	//* 241  503:getfield        #120 <Field String collectionBundlesRoot>
	//* 242  506:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 243  509:pop             
	//* 244  510:aload           4
	//* 245  512:ldc2            #400 <String "/">
	//* 246  515:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 247  518:pop             
	//* 248  519:aload           4
	//* 249  521:aload_2         
	//* 250  522:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 251  525:pop             
	//* 252  526:aload           4
	//* 253  528:ldc2            #402 <String ".zip">
	//* 254  531:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 255  534:pop             
	//* 256  535:aload           4
	//* 257  537:invokevirtual   #238 <Method String StringBuilder.toString()>
	//* 258  540:astore_2        
	//* 259  541:new             #404 <Class ResourceDownloader>
	//* 260  544:dup             
	//* 261  545:iconst_0        
	//* 262  546:iconst_0        
	//* 263  547:new             #270 <Class URL>
	//* 264  550:dup             
	//* 265  551:aload_1         
	//* 266  552:invokespecial   #271 <Method void URL(String)>
	//* 267  555:aload_2         
	//* 268  556:new             #24  <Class CraftAROnDeviceCollectionManager$2>
	//* 269  559:dup             
	//* 270  560:aload_0         
	//* 271  561:aload_1         
	//* 272  562:aload_3         
	//* 273  563:aload_2         
	//* 274  564:invokespecial   #407 <Method void CraftAROnDeviceCollectionManager$2(CraftAROnDeviceCollectionManager, String, CraftAROnDeviceCollectionManager$AddCollectionListener, String)>
	//* 275  567:invokespecial   #410 <Method void ResourceDownloader(int, int, URL, String, ResourceDownloader$DownloadProgressHandler)>
	//* 276  570:astore_1        
	//* 277  571:aload_1         
	//* 278  572:iconst_0        
	//* 279  573:invokevirtual   #413 <Method void ResourceDownloader.setStoreUncompressed(boolean)>
	//* 280  576:aload_1         
	//* 281  577:invokevirtual   #414 <Method void ResourceDownloader.start()>
	//* 282  580:aload_1         
	//* 283  581:invokevirtual   #417 <Method void ResourceDownloader.computeSize()>
	//* 284  584:aload_1         
	//* 285  585:invokevirtual   #420 <Method void ResourceDownloader.startDownloading()>
	//* 286  588:return          
	//* 287  589:astore_1        
	//* 288  590:aload_1         
	//* 289  591:invokevirtual   #423 <Method void IOException.printStackTrace()>
	//* 290  594:getstatic       #426 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_NETWORK>
	//* 291  597:astore_2        
	//* 292  598:new             #227 <Class StringBuilder>
	//* 293  601:dup             
	//* 294  602:invokespecial   #228 <Method void StringBuilder()>
	//* 295  605:astore          4
	//* 296  607:aload           4
	//* 297  609:ldc2            #428 <String "Error downloading the bundle: ">
	//* 298  612:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 299  615:pop             
	//* 300  616:aload           4
	//* 301  618:aload_1         
	//* 302  619:invokevirtual   #431 <Method String IOException.getLocalizedMessage()>
	//* 303  622:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 304  625:pop             
	//* 305  626:new             #250 <Class CraftARError>
	//* 306  629:dup             
	//* 307  630:aload_2         
	//* 308  631:aload           4
	//* 309  633:invokevirtual   #238 <Method String StringBuilder.toString()>
	//* 310  636:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//* 311  639:astore_1        
	//* 312  640:aload_3         
	//* 313  641:ifnull          652
	//* 314  644:aload_3         
	//* 315  645:aload_1         
	//* 316  646:invokeinterface #265 <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
	//* 317  651:return          
	//* 318  652:aload_1         
	//* 319  653:invokevirtual   #268 <Method String CraftARError.getErrorMessage()>
	//* 320  656:invokestatic    #248 <Method void CLog.e(String)>
	//* 321  659:return          
	//* 322  660:astore_1        
	//* 323  661:aload_1         
	//* 324  662:invokevirtual   #432 <Method void Exception.printStackTrace()>
	//* 325  665:getstatic       #426 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_NETWORK>
	//* 326  668:astore_2        
	//* 327  669:new             #227 <Class StringBuilder>
	//* 328  672:dup             
	//* 329  673:invokespecial   #228 <Method void StringBuilder()>
	//* 330  676:astore          4
	//* 331  678:aload           4
	//* 332  680:ldc2            #434 <String "Could not sync: ">
	//* 333  683:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 334  686:pop             
	//* 335  687:aload           4
	//* 336  689:aload_1         
	//* 337  690:invokevirtual   #435 <Method String Exception.getLocalizedMessage()>
	//* 338  693:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 339  696:pop             
	//* 340  697:new             #250 <Class CraftARError>
	//* 341  700:dup             
	//* 342  701:aload_2         
	//* 343  702:aload           4
	//* 344  704:invokevirtual   #238 <Method String StringBuilder.toString()>
	//* 345  707:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//* 346  710:astore_1        
	//* 347  711:aload_3         
	//* 348  712:ifnull          722
	//* 349  715:aload_3         
	//* 350  716:aload_1         
	//* 351  717:invokeinterface #265 <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
	//* 352  722:return          
	//* 353  723:aload_3         
	//* 354  724:ifnull          760
	//* 355  727:new             #250 <Class CraftARError>
	//* 356  730:dup             
	//* 357  731:getstatic       #426 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_NETWORK>
	//* 358  734:ldc2            #437 <String "Could not sync, received empty response">
	//* 359  737:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//* 360  740:astore_1        
	//* 361  741:aload_3         
	//* 362  742:ifnull          753
	//* 363  745:aload_3         
	//* 364  746:aload_1         
	//* 365  747:invokeinterface #265 <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
	//* 366  752:return          
	//* 367  753:aload_1         
	//* 368  754:invokevirtual   #268 <Method String CraftARError.getErrorMessage()>
	//* 369  757:invokestatic    #248 <Method void CLog.e(String)>
	//* 370  760:return          
		// Misplaced declaration of an exception variable
		catch(final String bundleURL)
	//* 371  761:astore_1        
		{
			((IOException) (bundleURL)).printStackTrace();
	//  372  762:aload_1         
	//  373  763:invokevirtual   #423 <Method void IOException.printStackTrace()>
			bundleOutputPath = ((String) (CraftARError.ERROR_CODES.ERROR_NETWORK));
	//  374  766:getstatic       #426 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_NETWORK>
	//  375  769:astore_2        
			obj = ((Object) (new StringBuilder()));
	//  376  770:new             #227 <Class StringBuilder>
	//  377  773:dup             
	//  378  774:invokespecial   #228 <Method void StringBuilder()>
	//  379  777:astore          4
			((StringBuilder) (obj)).append("Error downloading the bundle: ");
	//  380  779:aload           4
	//  381  781:ldc2            #428 <String "Error downloading the bundle: ">
	//  382  784:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  383  787:pop             
			((StringBuilder) (obj)).append(((IOException) (bundleURL)).getLocalizedMessage());
	//  384  788:aload           4
	//  385  790:aload_1         
	//  386  791:invokevirtual   #431 <Method String IOException.getLocalizedMessage()>
	//  387  794:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  388  797:pop             
			bundleURL = ((String) (new CraftARError(((CraftARError.ERROR_CODES) (bundleOutputPath)), ((StringBuilder) (obj)).toString())));
	//  389  798:new             #250 <Class CraftARError>
	//  390  801:dup             
	//  391  802:aload_2         
	//  392  803:aload           4
	//  393  805:invokevirtual   #238 <Method String StringBuilder.toString()>
	//  394  808:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//  395  811:astore_1        
			if(listener != null)
	//* 396  812:aload_3         
	//* 397  813:ifnull          824
			{
				listener.addCollectionFailed(((CraftARError) (bundleURL)));
	//  398  816:aload_3         
	//  399  817:aload_1         
	//  400  818:invokeinterface #265 <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
				return;
	//  401  823:return          
			} else
			{
				CLog.e(((CraftARError) (bundleURL)).getErrorMessage());
	//  402  824:aload_1         
	//  403  825:invokevirtual   #268 <Method String CraftARError.getErrorMessage()>
	//  404  828:invokestatic    #248 <Method void CLog.e(String)>
				return;
	//  405  831:return          
			}
		}
		if(bundleOutputPath == null) goto _L2; else goto _L1
_L1:
		obj = ((Object) (bundleOutputPath));
		if(!bundleOutputPath.equals("")) goto _L3; else goto _L2
_L3:
		urlparameterbuilder.addParameter("version", Build.SDK_VERSION);
		urlparameterbuilder.addParameter("app_id", mContext.getPackageName());
		urlparameterbuilder.addParameter("token", bundleURL);
		urlparameterbuilder.addParameter("bundled", "true");
		urlparameterbuilder.addParameter("tag", ((String) (obj)));
		bundleOutputPath = ((String) (new StringBuilder()));
		((StringBuilder) (bundleOutputPath)).append("Sync request params :\n\t app-id: '");
		((StringBuilder) (bundleOutputPath)).append(mContext.getPackageName());
		((StringBuilder) (bundleOutputPath)).append("'\n\t version: '");
		((StringBuilder) (bundleOutputPath)).append(Build.SDK_VERSION);
		((StringBuilder) (bundleOutputPath)).append("'\n\t token: '");
		((StringBuilder) (bundleOutputPath)).append(bundleURL);
		((StringBuilder) (bundleOutputPath)).append("'\n\t tag: '");
		((StringBuilder) (bundleOutputPath)).append(((String) (obj)));
		((StringBuilder) (bundleOutputPath)).append("'\n");
		CLog.d(((StringBuilder) (bundleOutputPath)).toString());
		bundleURL = ((String) (httpurlconnection.getOutputStream()));
		((OutputStream) (bundleURL)).write(urlparameterbuilder.getURLParameters().getBytes());
		((OutputStream) (bundleURL)).close();
		httpurlconnection.connect();
		bundleOutputPath = ((String) (new StringBuffer("")));
		bundleURL = ((String) (httpurlconnection.getInputStream()));
		  goto _L4
_L6:
		bundleURL = ((String) (httpurlconnection.getErrorStream()));
_L4:
		bundleURL = ((String) (new BufferedReader(((java.io.Reader) (new InputStreamReader(((InputStream) (bundleURL))))))));
_L5:
		obj = ((Object) (((BufferedReader) (bundleURL)).readLine()));
		if(obj == null)
			break MISSING_BLOCK_LABEL_372;
		((StringBuffer) (bundleOutputPath)).append(((String) (obj)));
		  goto _L5
		((BufferedReader) (bundleURL)).close();
		bundleURL = ((StringBuffer) (bundleOutputPath)).toString();
		if(bundleURL == null)
			break MISSING_BLOCK_LABEL_723;
		bundleOutputPath = ((String) (new StringBuilder()));
		((StringBuilder) (bundleOutputPath)).append("Received response: '");
		((StringBuilder) (bundleOutputPath)).append(bundleURL);
		((StringBuilder) (bundleOutputPath)).append("'");
		CLog.i(((StringBuilder) (bundleOutputPath)).toString());
		bundleOutputPath = ((String) (new JSONObject(bundleURL)));
		bundleURL = ((String) (validateSyncResponse(((JSONObject) (bundleOutputPath)))));
		if(bundleURL == null)
			break MISSING_BLOCK_LABEL_461;
		if(listener != null)
		{
			try
			{
				listener.addCollectionFailed(((CraftARError) (bundleURL)));
				return;
			}
			// Misplaced declaration of an exception variable
			catch(final String bundleURL)
			{
				((Exception) (bundleURL)).printStackTrace();
			}
			break MISSING_BLOCK_LABEL_665;
		}
		CLog.e(((CraftARError) (bundleURL)).getErrorMessage());
		return;
		((JSONObject) (bundleOutputPath)).getString("created");
		CLog.d("Downloading new bundle....");
		bundleURL = ((JSONObject) (bundleOutputPath)).getString("url");
		bundleOutputPath = ((JSONObject) (bundleOutputPath)).getString("collection_uuid");
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append(collectionBundlesRoot);
		((StringBuilder) (obj)).append("/");
		((StringBuilder) (obj)).append(bundleOutputPath);
		((StringBuilder) (obj)).append(".zip");
		bundleOutputPath = ((StringBuilder) (obj)).toString();
		bundleURL = ((String) (new ResourceDownloader(0, 0, new URL(bundleURL), bundleOutputPath, new ResourceDownloader.DownloadProgressHandler() {

			public void onDownloadFinished(int i, int j, URL url, boolean flag)
			{
				StringBuilder stringbuilder = new StringBuilder();
			//    0    0:new             #47  <Class StringBuilder>
			//    1    3:dup             
			//    2    4:invokespecial   #48  <Method void StringBuilder()>
			//    3    7:astore          5
				stringbuilder.append("Download finished for bundle ");
			//    4    9:aload           5
			//    5   11:ldc1            #50  <String "Download finished for bundle ">
			//    6   13:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
			//    7   16:pop             
				stringbuilder.append(bundleURL);
			//    8   17:aload           5
			//    9   19:aload_0         
			//   10   20:getfield        #29  <Field String val$bundleURL>
			//   11   23:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
			//   12   26:pop             
				stringbuilder.append("Sucesss:");
			//   13   27:aload           5
			//   14   29:ldc1            #56  <String "Sucesss:">
			//   15   31:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
			//   16   34:pop             
				stringbuilder.append(flag);
			//   17   35:aload           5
			//   18   37:iload           4
			//   19   39:invokevirtual   #59  <Method StringBuilder StringBuilder.append(boolean)>
			//   20   42:pop             
				CLog.d(stringbuilder.toString());
			//   21   43:aload           5
			//   22   45:invokevirtual   #63  <Method String StringBuilder.toString()>
			//   23   48:invokestatic    #69  <Method void CLog.d(String)>
				if(listener != null)
			//*  24   51:aload_0         
			//*  25   52:getfield        #31  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$listener>
			//*  26   55:ifnull          170
				{
					if(flag)
			//*  27   58:iload           4
			//*  28   60:ifeq            96
					{
						url = ((URL) (new File(bundleOutputPath)));
			//   29   63:new             #71  <Class File>
			//   30   66:dup             
			//   31   67:aload_0         
			//   32   68:getfield        #33  <Field String val$bundleOutputPath>
			//   33   71:invokespecial   #73  <Method void File(String)>
			//   34   74:astore_3        
						AddCollectionListener addcollectionlistener = new AddCollectionListener() {

							public void addCollectionFailed(CraftARError craftarerror)
							{
								if(listener != null)
							//*   0    0:aload_0         
							//*   1    1:getfield        #17  <Field CraftAROnDeviceCollectionManager$2 this$1>
							//*   2    4:getfield        #27  <Field CraftAROnDeviceCollectionManager$AddCollectionListener CraftAROnDeviceCollectionManager$2.val$listener>
							//*   3    7:ifnull          23
									listener.addCollectionFailed(craftarerror);
							//    4   10:aload_0         
							//    5   11:getfield        #17  <Field CraftAROnDeviceCollectionManager$2 this$1>
							//    6   14:getfield        #27  <Field CraftAROnDeviceCollectionManager$AddCollectionListener CraftAROnDeviceCollectionManager$2.val$listener>
							//    7   17:aload_1         
							//    8   18:invokeinterface #29  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
							//    9   23:return          
							}

							public void addCollectionProgress(float f)
							{
								StringBuilder stringbuilder = new StringBuilder();
							//    0    0:new             #33  <Class StringBuilder>
							//    1    3:dup             
							//    2    4:invokespecial   #34  <Method void StringBuilder()>
							//    3    7:astore_3        
								stringbuilder.append("AddCollectionProgress in sync: ");
							//    4    8:aload_3         
							//    5    9:ldc1            #36  <String "AddCollectionProgress in sync: ">
							//    6   11:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
							//    7   14:pop             
								stringbuilder.append(f);
							//    8   15:aload_3         
							//    9   16:fload_1         
							//   10   17:invokevirtual   #43  <Method StringBuilder StringBuilder.append(float)>
							//   11   20:pop             
								CLog.d(stringbuilder.toString());
							//   12   21:aload_3         
							//   13   22:invokevirtual   #47  <Method String StringBuilder.toString()>
							//   14   25:invokestatic    #53  <Method void CLog.d(String)>
								if(listener != null)
							//*  15   28:aload_0         
							//*  16   29:getfield        #17  <Field CraftAROnDeviceCollectionManager$2 this$1>
							//*  17   32:getfield        #27  <Field CraftAROnDeviceCollectionManager$AddCollectionListener CraftAROnDeviceCollectionManager$2.val$listener>
							//*  18   35:ifnull          68
								{
									float f1 = f / 2.0F + 0.5F;
							//   19   38:fload_1         
							//   20   39:fconst_2        
							//   21   40:fdiv            
							//   22   41:ldc1            #54  <Float 0.5F>
							//   23   43:fadd            
							//   24   44:fstore_2        
									f = f1;
							//   25   45:fload_2         
							//   26   46:fstore_1        
									if(f1 > 1.0F)
							//*  27   47:fload_2         
							//*  28   48:fconst_1        
							//*  29   49:fcmpl           
							//*  30   50:ifle            55
										f = 1.0F;
							//   31   53:fconst_1        
							//   32   54:fstore_1        
									listener.addCollectionProgress(f);
							//   33   55:aload_0         
							//   34   56:getfield        #17  <Field CraftAROnDeviceCollectionManager$2 this$1>
							//   35   59:getfield        #27  <Field CraftAROnDeviceCollectionManager$AddCollectionListener CraftAROnDeviceCollectionManager$2.val$listener>
							//   36   62:fload_1         
							//   37   63:invokeinterface #56  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionProgress(float)>
								}
							//   38   68:return          
							}

							public void collectionAdded(CraftAROnDeviceCollection craftarondevicecollection)
							{
								if(listener != null)
							//*   0    0:aload_0         
							//*   1    1:getfield        #17  <Field CraftAROnDeviceCollectionManager$2 this$1>
							//*   2    4:getfield        #27  <Field CraftAROnDeviceCollectionManager$AddCollectionListener CraftAROnDeviceCollectionManager$2.val$listener>
							//*   3    7:ifnull          23
									listener.collectionAdded(craftarondevicecollection);
							//    4   10:aload_0         
							//    5   11:getfield        #17  <Field CraftAROnDeviceCollectionManager$2 this$1>
							//    6   14:getfield        #27  <Field CraftAROnDeviceCollectionManager$AddCollectionListener CraftAROnDeviceCollectionManager$2.val$listener>
							//    7   17:aload_1         
							//    8   18:invokeinterface #60  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.collectionAdded(CraftAROnDeviceCollection)>
							//    9   23:return          
							}

							final _cls2 this$1;

			
			{
				this$1 = _cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CraftAROnDeviceCollectionManager$2 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
						}
;
			//   35   75:new             #13  <Class CraftAROnDeviceCollectionManager$2$1>
			//   36   78:dup             
			//   37   79:aload_0         
			//   38   80:invokespecial   #76  <Method void CraftAROnDeviceCollectionManager$2$1(CraftAROnDeviceCollectionManager$2)>
			//   39   83:astore          5
						addCollection(((File) (url)), addcollectionlistener);
			//   40   85:aload_0         
			//   41   86:getfield        #27  <Field CraftAROnDeviceCollectionManager this$0>
			//   42   89:aload_3         
			//   43   90:aload           5
			//   44   92:invokevirtual   #80  <Method void CraftAROnDeviceCollectionManager.addCollection(File, CraftAROnDeviceCollectionManager$AddCollectionListener)>
						return;
			//   45   95:return          
					}
					Object obj1 = ((Object) (CraftARError.ERROR_CODES.ERROR_NETWORK));
			//   46   96:getstatic       #86  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_NETWORK>
			//   47   99:astore          5
					StringBuilder stringbuilder1 = new StringBuilder();
			//   48  101:new             #47  <Class StringBuilder>
			//   49  104:dup             
			//   50  105:invokespecial   #48  <Method void StringBuilder()>
			//   51  108:astore          6
					stringbuilder1.append("Error downloading the bundle from ");
			//   52  110:aload           6
			//   53  112:ldc1            #88  <String "Error downloading the bundle from ">
			//   54  114:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
			//   55  117:pop             
					stringbuilder1.append(url.toString());
			//   56  118:aload           6
			//   57  120:aload_3         
			//   58  121:invokevirtual   #91  <Method String URL.toString()>
			//   59  124:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
			//   60  127:pop             
					url = ((URL) (new CraftARError(((CraftARError.ERROR_CODES) (obj1)), stringbuilder1.toString())));
			//   61  128:new             #93  <Class CraftARError>
			//   62  131:dup             
			//   63  132:aload           5
			//   64  134:aload           6
			//   65  136:invokevirtual   #63  <Method String StringBuilder.toString()>
			//   66  139:invokespecial   #96  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
			//   67  142:astore_3        
					obj1 = ((Object) (listener));
			//   68  143:aload_0         
			//   69  144:getfield        #31  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$listener>
			//   70  147:astore          5
					if(obj1 != null)
			//*  71  149:aload           5
			//*  72  151:ifnull          163
					{
						((AddCollectionListener) (obj1)).addCollectionFailed(((CraftARError) (url)));
			//   73  154:aload           5
			//   74  156:aload_3         
			//   75  157:invokeinterface #102 <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
						return;
			//   76  162:return          
					}
					CLog.e(((CraftARError) (url)).getErrorMessage());
			//   77  163:aload_3         
			//   78  164:invokevirtual   #105 <Method String CraftARError.getErrorMessage()>
			//   79  167:invokestatic    #108 <Method void CLog.e(String)>
				}
			//   80  170:return          
			}

			public void onDownloadProgress(int i, int j)
			{
				mDownloadedBytes = mDownloadedBytes + (long)j;
			//    0    0:aload_0         
			//    1    1:aload_0         
			//    2    2:getfield        #38  <Field long mDownloadedBytes>
			//    3    5:iload_2         
			//    4    6:i2l             
			//    5    7:ladd            
			//    6    8:putfield        #38  <Field long mDownloadedBytes>
				float f = (float)mDownloadedBytes / (float)mTotalBytes;
			//    7   11:aload_0         
			//    8   12:getfield        #38  <Field long mDownloadedBytes>
			//    9   15:l2f             
			//   10   16:aload_0         
			//   11   17:getfield        #42  <Field long mTotalBytes>
			//   12   20:l2f             
			//   13   21:fdiv            
			//   14   22:fstore_3        
				Object obj1 = ((Object) (new StringBuilder()));
			//   15   23:new             #47  <Class StringBuilder>
			//   16   26:dup             
			//   17   27:invokespecial   #48  <Method void StringBuilder()>
			//   18   30:astore          4
				((StringBuilder) (obj1)).append("Download progress for bundle ");
			//   19   32:aload           4
			//   20   34:ldc1            #112 <String "Download progress for bundle ">
			//   21   36:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
			//   22   39:pop             
				((StringBuilder) (obj1)).append(bundleURL);
			//   23   40:aload           4
			//   24   42:aload_0         
			//   25   43:getfield        #29  <Field String val$bundleURL>
			//   26   46:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
			//   27   49:pop             
				((StringBuilder) (obj1)).append(" downloaded ");
			//   28   50:aload           4
			//   29   52:ldc1            #114 <String " downloaded ">
			//   30   54:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
			//   31   57:pop             
				((StringBuilder) (obj1)).append(f);
			//   32   58:aload           4
			//   33   60:fload_3         
			//   34   61:invokevirtual   #117 <Method StringBuilder StringBuilder.append(float)>
			//   35   64:pop             
				CLog.d(((StringBuilder) (obj1)).toString());
			//   36   65:aload           4
			//   37   67:invokevirtual   #63  <Method String StringBuilder.toString()>
			//   38   70:invokestatic    #69  <Method void CLog.d(String)>
				obj1 = ((Object) (listener));
			//   39   73:aload_0         
			//   40   74:getfield        #31  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$listener>
			//   41   77:astore          4
				if(obj1 != null)
			//*  42   79:aload           4
			//*  43   81:ifnull          94
					((AddCollectionListener) (obj1)).addCollectionProgress(f / 2.0F);
			//   44   84:aload           4
			//   45   86:fload_3         
			//   46   87:fconst_2        
			//   47   88:fdiv            
			//   48   89:invokeinterface #121 <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionProgress(float)>
			//   49   94:return          
			}

			public void onFileSizeDetermined(int i, long l)
			{
				StringBuilder stringbuilder = new StringBuilder();
			//    0    0:new             #47  <Class StringBuilder>
			//    1    3:dup             
			//    2    4:invokespecial   #48  <Method void StringBuilder()>
			//    3    7:astore          4
				stringbuilder.append("File size determined for bundle ");
			//    4    9:aload           4
			//    5   11:ldc1            #125 <String "File size determined for bundle ">
			//    6   13:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
			//    7   16:pop             
				stringbuilder.append(bundleURL);
			//    8   17:aload           4
			//    9   19:aload_0         
			//   10   20:getfield        #29  <Field String val$bundleURL>
			//   11   23:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
			//   12   26:pop             
				stringbuilder.append(":");
			//   13   27:aload           4
			//   14   29:ldc1            #127 <String ":">
			//   15   31:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
			//   16   34:pop             
				stringbuilder.append(l);
			//   17   35:aload           4
			//   18   37:lload_2         
			//   19   38:invokevirtual   #130 <Method StringBuilder StringBuilder.append(long)>
			//   20   41:pop             
				CLog.d(stringbuilder.toString());
			//   21   42:aload           4
			//   22   44:invokevirtual   #63  <Method String StringBuilder.toString()>
			//   23   47:invokestatic    #69  <Method void CLog.d(String)>
				mTotalBytes = l;
			//   24   50:aload_0         
			//   25   51:lload_2         
			//   26   52:putfield        #42  <Field long mTotalBytes>
			//   27   55:return          
			}

			long mDownloadedBytes;
			long mTotalBytes;
			final CraftAROnDeviceCollectionManager this$0;
			final String val$bundleOutputPath;
			final String val$bundleURL;
			final AddCollectionListener val$listener;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field CraftAROnDeviceCollectionManager this$0>
				bundleURL = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #29  <Field String val$bundleURL>
				listener = addcollectionlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #31  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$listener>
				bundleOutputPath = s1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #33  <Field String val$bundleOutputPath>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #36  <Method void Object()>
				mDownloadedBytes = 0L;
			//   14   25:aload_0         
			//   15   26:lconst_0        
			//   16   27:putfield        #38  <Field long mDownloadedBytes>
				mTotalBytes = -1L;
			//   17   30:aload_0         
			//   18   31:ldc2w           #39  <Long -1L>
			//   19   34:putfield        #42  <Field long mTotalBytes>
			//   20   37:return          
			}
		}
)));
		((ResourceDownloader) (bundleURL)).setStoreUncompressed(false);
		((ResourceDownloader) (bundleURL)).start();
		try
		{
			((ResourceDownloader) (bundleURL)).computeSize();
			((ResourceDownloader) (bundleURL)).startDownloading();
			return;
		}
		// Misplaced declaration of an exception variable
		catch(final String bundleURL) { }
		((IOException) (bundleURL)).printStackTrace();
		bundleOutputPath = ((String) (CraftARError.ERROR_CODES.ERROR_NETWORK));
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Error downloading the bundle: ");
		((StringBuilder) (obj)).append(((IOException) (bundleURL)).getLocalizedMessage());
		bundleURL = ((String) (new CraftARError(((CraftARError.ERROR_CODES) (bundleOutputPath)), ((StringBuilder) (obj)).toString())));
		if(listener == null)
			break MISSING_BLOCK_LABEL_652;
		listener.addCollectionFailed(((CraftARError) (bundleURL)));
		return;
		CLog.e(((CraftARError) (bundleURL)).getErrorMessage());
		return;
		bundleOutputPath = ((String) (CraftARError.ERROR_CODES.ERROR_NETWORK));
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Could not sync: ");
		((StringBuilder) (obj)).append(((Exception) (bundleURL)).getLocalizedMessage());
		bundleURL = ((String) (new CraftARError(((CraftARError.ERROR_CODES) (bundleOutputPath)), ((StringBuilder) (obj)).toString())));
		if(listener != null)
			listener.addCollectionFailed(((CraftARError) (bundleURL)));
		return;
		if(listener != null)
		{
			bundleURL = ((String) (new CraftARError(CraftARError.ERROR_CODES.ERROR_NETWORK, "Could not sync, received empty response")));
			if(listener != null)
			{
				listener.addCollectionFailed(((CraftARError) (bundleURL)));
				return;
			}
			CLog.e(((CraftARError) (bundleURL)).getErrorMessage());
		}
		return;
		bundleURL;
	//  406  832:astore_1        
		if(true) goto _L6; else goto _L2
	//  407  833:goto            329
_L2:
		obj = "default";
	//  408  836:ldc2            #439 <String "default">
	//  409  839:astore          4
		if(true) goto _L3; else goto _L7
	//  410  841:goto            143
_L7:
	}

	private CraftAROnDeviceCollection addInternal(File file, final AddCollectionListener addCollectionListener)
	{
		int k;
		Object obj;
		File file1;
		Enumeration enumeration;
		byte abyte0[];
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #227 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #228 <Method void StringBuilder()>
	//    3    7:astore          8
		((StringBuilder) (obj)).append(collectionsRoot);
	//    4    9:aload           8
	//    5   11:aload_0         
	//    6   12:getfield        #114 <Field String collectionsRoot>
	//    7   15:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		((StringBuilder) (obj)).append("/.unziptmpdirectory/");
	//    9   19:aload           8
	//   10   21:ldc2            #441 <String "/.unziptmpdirectory/">
	//   11   24:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   13   28:aload           8
	//   14   30:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   15   33:astore          8
		file1 = new File(((String) (obj)));
	//   16   35:new             #127 <Class File>
	//   17   38:dup             
	//   18   39:aload           8
	//   19   41:invokespecial   #130 <Method void File(String)>
	//   20   44:astore          9
		file1.mkdirs();
	//   21   46:aload           9
	//   22   48:invokevirtual   #137 <Method boolean File.mkdirs()>
	//   23   51:pop             
		file = ((File) (new ZipFile(file)));
	//   24   52:new             #443 <Class ZipFile>
	//   25   55:dup             
	//   26   56:aload_1         
	//   27   57:invokespecial   #446 <Method void ZipFile(File)>
	//   28   60:astore_1        
		k = ((ZipFile) (file)).size();
	//   29   61:aload_1         
	//   30   62:invokevirtual   #450 <Method int ZipFile.size()>
	//   31   65:istore          7
		enumeration = ((ZipFile) (file)).entries();
	//   32   67:aload_1         
	//   33   68:invokevirtual   #454 <Method Enumeration ZipFile.entries()>
	//   34   71:astore          10
		abyte0 = new byte[1024];
	//   35   73:sipush          1024
	//   36   76:newarray        byte[]
	//   37   78:astore          11
		float f;
		int i;
		f = 0.0F;
	//   38   80:fconst_0        
	//   39   81:fstore_3        
		i = 0;
	//   40   82:iconst_0        
	//   41   83:istore          5
_L3:
		if(!enumeration.hasMoreElements())
			break; /* Loop/switch isn't completed */
	//   42   85:aload           10
	//   43   87:invokeinterface #459 <Method boolean Enumeration.hasMoreElements()>
	//   44   92:ifeq            516
		int j = i + 1;
	//   45   95:iload           5
	//   46   97:iconst_1        
	//   47   98:iadd            
	//   48   99:istore          6
		Object obj1;
		obj1 = ((Object) ((ZipEntry)enumeration.nextElement()));
	//   49  101:aload           10
	//   50  103:invokeinterface #463 <Method Object Enumeration.nextElement()>
	//   51  108:checkcast       #465 <Class ZipEntry>
	//   52  111:astore          12
		StringBuilder stringbuilder = new StringBuilder();
	//   53  113:new             #227 <Class StringBuilder>
	//   54  116:dup             
	//   55  117:invokespecial   #228 <Method void StringBuilder()>
	//   56  120:astore          13
		stringbuilder.append("Unzipping ");
	//   57  122:aload           13
	//   58  124:ldc2            #467 <String "Unzipping ">
	//   59  127:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   60  130:pop             
		stringbuilder.append(((ZipEntry) (obj1)).getName());
	//   61  131:aload           13
	//   62  133:aload           12
	//   63  135:invokevirtual   #470 <Method String ZipEntry.getName()>
	//   64  138:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   65  141:pop             
		CLog.v(stringbuilder.toString());
	//   66  142:aload           13
	//   67  144:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   68  147:invokestatic    #473 <Method void CLog.v(String)>
		if(((ZipEntry) (obj1)).isDirectory())
	//*  69  150:aload           12
	//*  70  152:invokevirtual   #476 <Method boolean ZipEntry.isDirectory()>
	//*  71  155:ifeq            217
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   72  158:new             #227 <Class StringBuilder>
	//   73  161:dup             
	//   74  162:invokespecial   #228 <Method void StringBuilder()>
	//   75  165:astore          13
			stringbuilder1.append(((String) (obj)));
	//   76  167:aload           13
	//   77  169:aload           8
	//   78  171:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   79  174:pop             
			stringbuilder1.append(((ZipEntry) (obj1)).getName());
	//   80  175:aload           13
	//   81  177:aload           12
	//   82  179:invokevirtual   #470 <Method String ZipEntry.getName()>
	//   83  182:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   84  185:pop             
			obj1 = ((Object) (new File(stringbuilder1.toString())));
	//   85  186:new             #127 <Class File>
	//   86  189:dup             
	//   87  190:aload           13
	//   88  192:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   89  195:invokespecial   #130 <Method void File(String)>
	//   90  198:astore          12
			if(!((File) (obj1)).isDirectory())
	//*  91  200:aload           12
	//*  92  202:invokevirtual   #477 <Method boolean File.isDirectory()>
	//*  93  205:ifne            448
				((File) (obj1)).mkdirs();
	//   94  208:aload           12
	//   95  210:invokevirtual   #137 <Method boolean File.mkdirs()>
	//   96  213:pop             
			break MISSING_BLOCK_LABEL_448;
	//   97  214:goto            448
		}
		i = ((ZipEntry) (obj1)).getName().lastIndexOf("/");
	//   98  217:aload           12
	//   99  219:invokevirtual   #470 <Method String ZipEntry.getName()>
	//  100  222:ldc2            #400 <String "/">
	//  101  225:invokevirtual   #481 <Method int String.lastIndexOf(String)>
	//  102  228:istore          5
		if(i <= -1)
			break MISSING_BLOCK_LABEL_345;
	//  103  230:iload           5
	//  104  232:iconst_m1       
	//  105  233:icmple          345
		Object obj2 = ((Object) (((ZipEntry) (obj1)).getName().substring(0, i)));
	//  106  236:aload           12
	//  107  238:invokevirtual   #470 <Method String ZipEntry.getName()>
	//  108  241:iconst_0        
	//  109  242:iload           5
	//  110  244:invokevirtual   #485 <Method String String.substring(int, int)>
	//  111  247:astore          13
		StringBuilder stringbuilder2 = new StringBuilder();
	//  112  249:new             #227 <Class StringBuilder>
	//  113  252:dup             
	//  114  253:invokespecial   #228 <Method void StringBuilder()>
	//  115  256:astore          14
		stringbuilder2.append(((String) (obj)));
	//  116  258:aload           14
	//  117  260:aload           8
	//  118  262:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  119  265:pop             
		stringbuilder2.append("/");
	//  120  266:aload           14
	//  121  268:ldc2            #400 <String "/">
	//  122  271:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  123  274:pop             
		stringbuilder2.append(((String) (obj2)));
	//  124  275:aload           14
	//  125  277:aload           13
	//  126  279:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  127  282:pop             
		obj2 = ((Object) (new File(stringbuilder2.toString())));
	//  128  283:new             #127 <Class File>
	//  129  286:dup             
	//  130  287:aload           14
	//  131  289:invokevirtual   #238 <Method String StringBuilder.toString()>
	//  132  292:invokespecial   #130 <Method void File(String)>
	//  133  295:astore          13
		if(!((File) (obj2)).exists())
	//* 134  297:aload           13
	//* 135  299:invokevirtual   #134 <Method boolean File.exists()>
	//* 136  302:ifne            345
		{
			StringBuilder stringbuilder3 = new StringBuilder();
	//  137  305:new             #227 <Class StringBuilder>
	//  138  308:dup             
	//  139  309:invokespecial   #228 <Method void StringBuilder()>
	//  140  312:astore          14
			stringbuilder3.append("Creating index parent directories: ");
	//  141  314:aload           14
	//  142  316:ldc2            #487 <String "Creating index parent directories: ">
	//  143  319:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  144  322:pop             
			stringbuilder3.append(obj2);
	//  145  323:aload           14
	//  146  325:aload           13
	//  147  327:invokevirtual   #490 <Method StringBuilder StringBuilder.append(Object)>
	//  148  330:pop             
			CLog.v(stringbuilder3.toString());
	//  149  331:aload           14
	//  150  333:invokevirtual   #238 <Method String StringBuilder.toString()>
	//  151  336:invokestatic    #473 <Method void CLog.v(String)>
			((File) (obj2)).mkdirs();
	//  152  339:aload           13
	//  153  341:invokevirtual   #137 <Method boolean File.mkdirs()>
	//  154  344:pop             
		}
		InputStream inputstream;
		Object obj3;
		inputstream = ((ZipFile) (file)).getInputStream(((ZipEntry) (obj1)));
	//  155  345:aload_1         
	//  156  346:aload           12
	//  157  348:invokevirtual   #493 <Method InputStream ZipFile.getInputStream(ZipEntry)>
	//  158  351:astore          13
		obj3 = ((Object) (new StringBuilder()));
	//  159  353:new             #227 <Class StringBuilder>
	//  160  356:dup             
	//  161  357:invokespecial   #228 <Method void StringBuilder()>
	//  162  360:astore          14
		((StringBuilder) (obj3)).append(((String) (obj)));
	//  163  362:aload           14
	//  164  364:aload           8
	//  165  366:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  166  369:pop             
		((StringBuilder) (obj3)).append(((ZipEntry) (obj1)).getName());
	//  167  370:aload           14
	//  168  372:aload           12
	//  169  374:invokevirtual   #470 <Method String ZipEntry.getName()>
	//  170  377:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  171  380:pop             
		obj1 = ((Object) (new FileOutputStream(((StringBuilder) (obj3)).toString())));
	//  172  381:new             #495 <Class FileOutputStream>
	//  173  384:dup             
	//  174  385:aload           14
	//  175  387:invokevirtual   #238 <Method String StringBuilder.toString()>
	//  176  390:invokespecial   #496 <Method void FileOutputStream(String)>
	//  177  393:astore          12
		obj3 = ((Object) (new BufferedOutputStream(((OutputStream) (obj1)))));
	//  178  395:new             #498 <Class BufferedOutputStream>
	//  179  398:dup             
	//  180  399:aload           12
	//  181  401:invokespecial   #501 <Method void BufferedOutputStream(OutputStream)>
	//  182  404:astore          14
_L1:
		i = inputstream.read(abyte0);
	//  183  406:aload           13
	//  184  408:aload           11
	//  185  410:invokevirtual   #507 <Method int InputStream.read(byte[])>
	//  186  413:istore          5
		if(i <= 0)
			break MISSING_BLOCK_LABEL_433;
	//  187  415:iload           5
	//  188  417:ifle            433
		((BufferedOutputStream) (obj3)).write(abyte0, 0, i);
	//  189  420:aload           14
	//  190  422:aload           11
	//  191  424:iconst_0        
	//  192  425:iload           5
	//  193  427:invokevirtual   #510 <Method void BufferedOutputStream.write(byte[], int, int)>
		  goto _L1
	//* 194  430:goto            406
		((BufferedOutputStream) (obj3)).close();
	//  195  433:aload           14
	//  196  435:invokevirtual   #511 <Method void BufferedOutputStream.close()>
		inputstream.close();
	//  197  438:aload           13
	//  198  440:invokevirtual   #512 <Method void InputStream.close()>
		((FileOutputStream) (obj1)).close();
	//  199  443:aload           12
	//  200  445:invokevirtual   #513 <Method void FileOutputStream.close()>
		i = j;
	//  201  448:iload           6
	//  202  450:istore          5
		if(addCollectionListener == null)
			continue; /* Loop/switch isn't completed */
	//  203  452:aload_2         
	//  204  453:ifnull          85
		final float progress = (float)j / (float)k;
	//  205  456:iload           6
	//  206  458:i2f             
	//  207  459:iload           7
	//  208  461:i2f             
	//  209  462:fdiv            
	//  210  463:fstore          4
		if(progress - f <= 0.01F)
	//* 211  465:fload           4
	//* 212  467:fload_3         
	//* 213  468:fsub            
	//* 214  469:ldc2            #514 <Float 0.01F>
	//* 215  472:fcmpl           
	//* 216  473:ifgt            487
		{
			i = j;
	//  217  476:iload           6
	//  218  478:istore          5
			if(j != k)
				continue; /* Loop/switch isn't completed */
	//  219  480:iload           6
	//  220  482:iload           7
	//  221  484:icmpne          85
		}
		mResponseHandlerThread.post(new Runnable() {

			public void run()
			{
				AddCollectionListener addcollectionlistener = addCollectionListener;
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
			//    2    4:astore_1        
				if(addcollectionlistener != null)
			//*   3    5:aload_1         
			//*   4    6:ifnull          19
					addcollectionlistener.addCollectionProgress(progress);
			//    5    9:aload_1         
			//    6   10:aload_0         
			//    7   11:getfield        #25  <Field float val$progress>
			//    8   14:invokeinterface #36  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionProgress(float)>
			//    9   19:return          
			}

			final CraftAROnDeviceCollectionManager this$0;
			final AddCollectionListener val$addCollectionListener;
			final float val$progress;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
				addCollectionListener = addcollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
				progress = f;
			//    6   10:aload_0         
			//    7   11:fload_3         
			//    8   12:putfield        #25  <Field float val$progress>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//  222  487:aload_0         
	//  223  488:getfield        #101 <Field Handler mResponseHandlerThread>
	//  224  491:new             #16  <Class CraftAROnDeviceCollectionManager$14>
	//  225  494:dup             
	//  226  495:aload_0         
	//  227  496:aload_2         
	//  228  497:fload           4
	//  229  499:invokespecial   #517 <Method void CraftAROnDeviceCollectionManager$14(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollectionManager$AddCollectionListener, float)>
	//  230  502:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//  231  505:pop             
		f = progress;
	//  232  506:fload           4
	//  233  508:fstore_3        
		i = j;
	//  234  509:iload           6
	//  235  511:istore          5
		if(true) goto _L3; else goto _L2
	//  236  513:goto            85
_L2:
		((ZipFile) (file)).close();
	//  237  516:aload_1         
	//  238  517:invokevirtual   #522 <Method void ZipFile.close()>
		file = ((File) (createNewCollectionFromTmpDirectory(file1, addCollectionListener)));
	//  239  520:aload_0         
	//  240  521:aload           9
	//  241  523:aload_2         
	//  242  524:invokespecial   #525 <Method CraftAROnDeviceCollection createNewCollectionFromTmpDirectory(File, CraftAROnDeviceCollectionManager$AddCollectionListener)>
	//  243  527:astore_1        
		addCollectionListener = ((AddCollectionListener) (file));
	//  244  528:aload_1         
	//  245  529:astore_2        
		if(file == null)
			break MISSING_BLOCK_LABEL_579;
	//  246  530:aload_1         
	//  247  531:ifnull          579
		try
		{
			updateCollectionsDict(((CraftAROnDeviceCollection) (file)));
	//  248  534:aload_0         
	//  249  535:aload_1         
	//  250  536:invokespecial   #529 <Method void updateCollectionsDict(CraftAROnDeviceCollection)>
		}
	//* 251  539:aload_1         
	//* 252  540:areturn         
	//* 253  541:astore_2        
	//* 254  542:goto            552
		// Misplaced declaration of an exception variable
		catch(final AddCollectionListener addCollectionListener)
	//* 255  545:astore_2        
		{
			break MISSING_BLOCK_LABEL_567;
	//  256  546:goto            567
		}
		// Misplaced declaration of an exception variable
		catch(final AddCollectionListener addCollectionListener)
		{
			break MISSING_BLOCK_LABEL_552;
		}
		return ((CraftAROnDeviceCollection) (file));
		addCollectionListener;
	//  257  549:astore_2        
		file = null;
	//  258  550:aconst_null     
	//  259  551:astore_1        
		CLog.e("Error updating the collections dictionary!");
	//  260  552:ldc2            #531 <String "Error updating the collections dictionary!">
	//  261  555:invokestatic    #248 <Method void CLog.e(String)>
		((IOException) (addCollectionListener)).printStackTrace();
	//  262  558:aload_2         
	//  263  559:invokevirtual   #423 <Method void IOException.printStackTrace()>
		return ((CraftAROnDeviceCollection) (file));
	//  264  562:aload_1         
	//  265  563:areturn         
		addCollectionListener;
	//  266  564:astore_2        
		file = null;
	//  267  565:aconst_null     
	//  268  566:astore_1        
		CLog.e("Error updating the collections dictionary!");
	//  269  567:ldc2            #531 <String "Error updating the collections dictionary!">
	//  270  570:invokestatic    #248 <Method void CLog.e(String)>
		((FileNotFoundException) (addCollectionListener)).printStackTrace();
	//  271  573:aload_2         
	//  272  574:invokevirtual   #532 <Method void FileNotFoundException.printStackTrace()>
		addCollectionListener = ((AddCollectionListener) (file));
	//  273  577:aload_1         
	//  274  578:astore_2        
		return ((CraftAROnDeviceCollection) (addCollectionListener));
	//  275  579:aload_2         
	//  276  580:areturn         
	}

	private CraftAROnDeviceCollection addInternal(String s, final AddCollectionListener addCollectionListener)
	{
		Object obj;
		File file;
		Object obj1;
		Object obj2;
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #227 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #228 <Method void StringBuilder()>
	//    3    7:astore          11
		((StringBuilder) (obj)).append(collectionsRoot);
	//    4    9:aload           11
	//    5   11:aload_0         
	//    6   12:getfield        #114 <Field String collectionsRoot>
	//    7   15:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		((StringBuilder) (obj)).append("/.unziptmpdirectory/");
	//    9   19:aload           11
	//   10   21:ldc2            #441 <String "/.unziptmpdirectory/">
	//   11   24:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   13   28:aload           11
	//   14   30:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   15   33:astore          11
		file = new File(((String) (obj)));
	//   16   35:new             #127 <Class File>
	//   17   38:dup             
	//   18   39:aload           11
	//   19   41:invokespecial   #130 <Method void File(String)>
	//   20   44:astore          12
		file.mkdirs();
	//   21   46:aload           12
	//   22   48:invokevirtual   #137 <Method boolean File.mkdirs()>
	//   23   51:pop             
		obj1 = ((Object) (mContext.getPackageManager()));
	//   24   52:aload_0         
	//   25   53:getfield        #103 <Field Context mContext>
	//   26   56:invokevirtual   #536 <Method PackageManager Context.getPackageManager()>
	//   27   59:astore          13
		obj2 = ((Object) (mContext.getPackageName()));
	//   28   61:aload_0         
	//   29   62:getfield        #103 <Field Context mContext>
	//   30   65:invokevirtual   #310 <Method String Context.getPackageName()>
	//   31   68:astore          14
		int i = 0;
	//   32   70:iconst_0        
	//   33   71:istore          6
		long l;
		byte abyte0[];
		obj1 = ((Object) (new ZipFile(((PackageManager) (obj1)).getApplicationInfo(((String) (obj2)), 0).sourceDir)));
	//   34   73:new             #443 <Class ZipFile>
	//   35   76:dup             
	//   36   77:aload           13
	//   37   79:aload           14
	//   38   81:iconst_0        
	//   39   82:invokevirtual   #542 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   40   85:getfield        #547 <Field String ApplicationInfo.sourceDir>
	//   41   88:invokespecial   #548 <Method void ZipFile(String)>
	//   42   91:astore          13
		obj2 = ((Object) (new StringBuilder()));
	//   43   93:new             #227 <Class StringBuilder>
	//   44   96:dup             
	//   45   97:invokespecial   #228 <Method void StringBuilder()>
	//   46  100:astore          14
		((StringBuilder) (obj2)).append("assets/");
	//   47  102:aload           14
	//   48  104:ldc2            #550 <String "assets/">
	//   49  107:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   50  110:pop             
		((StringBuilder) (obj2)).append(s);
	//   51  111:aload           14
	//   52  113:aload_1         
	//   53  114:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   54  117:pop             
		s = ((String) (((ZipFile) (obj1)).getEntry(((StringBuilder) (obj2)).toString())));
	//   55  118:aload           13
	//   56  120:aload           14
	//   57  122:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   58  125:invokevirtual   #554 <Method ZipEntry ZipFile.getEntry(String)>
	//   59  128:astore_1        
		l = ((ZipEntry) (s)).getSize();
	//   60  129:aload_1         
	//   61  130:invokevirtual   #558 <Method long ZipEntry.getSize()>
	//   62  133:lstore          9
		s = ((String) (new ZipInputStream(((ZipFile) (obj1)).getInputStream(((ZipEntry) (s))))));
	//   63  135:new             #560 <Class ZipInputStream>
	//   64  138:dup             
	//   65  139:aload           13
	//   66  141:aload_1         
	//   67  142:invokevirtual   #493 <Method InputStream ZipFile.getInputStream(ZipEntry)>
	//   68  145:invokespecial   #561 <Method void ZipInputStream(InputStream)>
	//   69  148:astore_1        
		abyte0 = new byte[1024];
	//   70  149:sipush          1024
	//   71  152:newarray        byte[]
	//   72  154:astore          14
		float f;
		int j;
		f = 0.0F;
	//   73  156:fconst_0        
	//   74  157:fstore_3        
		j = 0;
	//   75  158:iconst_0        
	//   76  159:istore          7
_L3:
		Object obj3 = ((Object) (((ZipInputStream) (s)).getNextEntry()));
	//   77  161:aload_1         
	//   78  162:invokevirtual   #565 <Method ZipEntry ZipInputStream.getNextEntry()>
	//   79  165:astore          15
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_566;
	//   80  167:aload           15
	//   81  169:ifnull          566
		j = (int)((long)j + ((ZipEntry) (obj3)).getCompressedSize());
	//   82  172:iload           7
	//   83  174:i2l             
	//   84  175:aload           15
	//   85  177:invokevirtual   #568 <Method long ZipEntry.getCompressedSize()>
	//   86  180:ladd            
	//   87  181:l2i             
	//   88  182:istore          7
		StringBuilder stringbuilder = new StringBuilder();
	//   89  184:new             #227 <Class StringBuilder>
	//   90  187:dup             
	//   91  188:invokespecial   #228 <Method void StringBuilder()>
	//   92  191:astore          16
		stringbuilder.append("Unzipping ");
	//   93  193:aload           16
	//   94  195:ldc2            #467 <String "Unzipping ">
	//   95  198:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   96  201:pop             
		stringbuilder.append(((ZipEntry) (obj3)).getName());
	//   97  202:aload           16
	//   98  204:aload           15
	//   99  206:invokevirtual   #470 <Method String ZipEntry.getName()>
	//  100  209:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  101  212:pop             
		CLog.v(stringbuilder.toString());
	//  102  213:aload           16
	//  103  215:invokevirtual   #238 <Method String StringBuilder.toString()>
	//  104  218:invokestatic    #473 <Method void CLog.v(String)>
		if(((ZipEntry) (obj3)).isDirectory())
	//* 105  221:aload           15
	//* 106  223:invokevirtual   #476 <Method boolean ZipEntry.isDirectory()>
	//* 107  226:ifeq            288
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  108  229:new             #227 <Class StringBuilder>
	//  109  232:dup             
	//  110  233:invokespecial   #228 <Method void StringBuilder()>
	//  111  236:astore          16
			stringbuilder1.append(((String) (obj)));
	//  112  238:aload           16
	//  113  240:aload           11
	//  114  242:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  115  245:pop             
			stringbuilder1.append(((ZipEntry) (obj3)).getName());
	//  116  246:aload           16
	//  117  248:aload           15
	//  118  250:invokevirtual   #470 <Method String ZipEntry.getName()>
	//  119  253:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  120  256:pop             
			obj3 = ((Object) (new File(stringbuilder1.toString())));
	//  121  257:new             #127 <Class File>
	//  122  260:dup             
	//  123  261:aload           16
	//  124  263:invokevirtual   #238 <Method String StringBuilder.toString()>
	//  125  266:invokespecial   #130 <Method void File(String)>
	//  126  269:astore          15
			if(!((File) (obj3)).isDirectory())
	//* 127  271:aload           15
	//* 128  273:invokevirtual   #477 <Method boolean File.isDirectory()>
	//* 129  276:ifne            634
				((File) (obj3)).mkdirs();
	//  130  279:aload           15
	//  131  281:invokevirtual   #137 <Method boolean File.mkdirs()>
	//  132  284:pop             
			break MISSING_BLOCK_LABEL_513;
	//  133  285:goto            634
		}
		int k = ((ZipEntry) (obj3)).getName().lastIndexOf("/");
	//  134  288:aload           15
	//  135  290:invokevirtual   #470 <Method String ZipEntry.getName()>
	//  136  293:ldc2            #400 <String "/">
	//  137  296:invokevirtual   #481 <Method int String.lastIndexOf(String)>
	//  138  299:istore          8
		if(k <= -1)
			break MISSING_BLOCK_LABEL_417;
	//  139  301:iload           8
	//  140  303:iconst_m1       
	//  141  304:icmple          417
		Object obj4 = ((Object) (((ZipEntry) (obj3)).getName().substring(i, k)));
	//  142  307:aload           15
	//  143  309:invokevirtual   #470 <Method String ZipEntry.getName()>
	//  144  312:iload           6
	//  145  314:iload           8
	//  146  316:invokevirtual   #485 <Method String String.substring(int, int)>
	//  147  319:astore          16
		StringBuilder stringbuilder2 = new StringBuilder();
	//  148  321:new             #227 <Class StringBuilder>
	//  149  324:dup             
	//  150  325:invokespecial   #228 <Method void StringBuilder()>
	//  151  328:astore          17
		stringbuilder2.append(((String) (obj)));
	//  152  330:aload           17
	//  153  332:aload           11
	//  154  334:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  155  337:pop             
		stringbuilder2.append("/");
	//  156  338:aload           17
	//  157  340:ldc2            #400 <String "/">
	//  158  343:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  159  346:pop             
		stringbuilder2.append(((String) (obj4)));
	//  160  347:aload           17
	//  161  349:aload           16
	//  162  351:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  163  354:pop             
		obj4 = ((Object) (new File(stringbuilder2.toString())));
	//  164  355:new             #127 <Class File>
	//  165  358:dup             
	//  166  359:aload           17
	//  167  361:invokevirtual   #238 <Method String StringBuilder.toString()>
	//  168  364:invokespecial   #130 <Method void File(String)>
	//  169  367:astore          16
		if(!((File) (obj4)).exists())
	//* 170  369:aload           16
	//* 171  371:invokevirtual   #134 <Method boolean File.exists()>
	//* 172  374:ifne            417
		{
			StringBuilder stringbuilder3 = new StringBuilder();
	//  173  377:new             #227 <Class StringBuilder>
	//  174  380:dup             
	//  175  381:invokespecial   #228 <Method void StringBuilder()>
	//  176  384:astore          17
			stringbuilder3.append("Creating index parent directories: ");
	//  177  386:aload           17
	//  178  388:ldc2            #487 <String "Creating index parent directories: ">
	//  179  391:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  180  394:pop             
			stringbuilder3.append(obj4);
	//  181  395:aload           17
	//  182  397:aload           16
	//  183  399:invokevirtual   #490 <Method StringBuilder StringBuilder.append(Object)>
	//  184  402:pop             
			CLog.v(stringbuilder3.toString());
	//  185  403:aload           17
	//  186  405:invokevirtual   #238 <Method String StringBuilder.toString()>
	//  187  408:invokestatic    #473 <Method void CLog.v(String)>
			((File) (obj4)).mkdirs();
	//  188  411:aload           16
	//  189  413:invokevirtual   #137 <Method boolean File.mkdirs()>
	//  190  416:pop             
		}
		Object obj5;
		obj5 = ((Object) (new StringBuilder()));
	//  191  417:new             #227 <Class StringBuilder>
	//  192  420:dup             
	//  193  421:invokespecial   #228 <Method void StringBuilder()>
	//  194  424:astore          16
		((StringBuilder) (obj5)).append(((String) (obj)));
	//  195  426:aload           16
	//  196  428:aload           11
	//  197  430:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  198  433:pop             
		((StringBuilder) (obj5)).append(((ZipEntry) (obj3)).getName());
	//  199  434:aload           16
	//  200  436:aload           15
	//  201  438:invokevirtual   #470 <Method String ZipEntry.getName()>
	//  202  441:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  203  444:pop             
		obj3 = ((Object) (new FileOutputStream(((StringBuilder) (obj5)).toString())));
	//  204  445:new             #495 <Class FileOutputStream>
	//  205  448:dup             
	//  206  449:aload           16
	//  207  451:invokevirtual   #238 <Method String StringBuilder.toString()>
	//  208  454:invokespecial   #496 <Method void FileOutputStream(String)>
	//  209  457:astore          15
		obj5 = ((Object) (new BufferedOutputStream(((OutputStream) (obj3)))));
	//  210  459:new             #498 <Class BufferedOutputStream>
	//  211  462:dup             
	//  212  463:aload           15
	//  213  465:invokespecial   #501 <Method void BufferedOutputStream(OutputStream)>
	//  214  468:astore          16
_L1:
		i = ((ZipInputStream) (s)).read(abyte0);
	//  215  470:aload_1         
	//  216  471:aload           14
	//  217  473:invokevirtual   #569 <Method int ZipInputStream.read(byte[])>
	//  218  476:istore          6
		if(i <= 0)
			break MISSING_BLOCK_LABEL_496;
	//  219  478:iload           6
	//  220  480:ifle            496
		((BufferedOutputStream) (obj5)).write(abyte0, 0, i);
	//  221  483:aload           16
	//  222  485:aload           14
	//  223  487:iconst_0        
	//  224  488:iload           6
	//  225  490:invokevirtual   #510 <Method void BufferedOutputStream.write(byte[], int, int)>
		  goto _L1
	//* 226  493:goto            470
		i = 0;
	//  227  496:iconst_0        
	//  228  497:istore          6
		((BufferedOutputStream) (obj5)).close();
	//  229  499:aload           16
	//  230  501:invokevirtual   #511 <Method void BufferedOutputStream.close()>
		((ZipInputStream) (s)).closeEntry();
	//  231  504:aload_1         
	//  232  505:invokevirtual   #572 <Method void ZipInputStream.closeEntry()>
		((FileOutputStream) (obj3)).close();
	//  233  508:aload           15
	//  234  510:invokevirtual   #513 <Method void FileOutputStream.close()>
		if(addCollectionListener == null)
			continue; /* Loop/switch isn't completed */
	//  235  513:aload_2         
	//  236  514:ifnull          643
		final float progress = (float)j / (float)l;
	//  237  517:iload           7
	//  238  519:i2f             
	//  239  520:lload           9
	//  240  522:l2f             
	//  241  523:fdiv            
	//  242  524:fstore          5
		float f1;
		f1 = f;
	//  243  526:fload_3         
	//  244  527:fstore          4
		if(progress - f <= 0.01F)
			break MISSING_BLOCK_LABEL_637;
	//  245  529:fload           5
	//  246  531:fload_3         
	//  247  532:fsub            
	//  248  533:ldc2            #514 <Float 0.01F>
	//  249  536:fcmpl           
	//  250  537:ifle            637
		mResponseHandlerThread.post(new Runnable() {

			public void run()
			{
				AddCollectionListener addcollectionlistener = addCollectionListener;
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
			//    2    4:astore_1        
				if(addcollectionlistener != null)
			//*   3    5:aload_1         
			//*   4    6:ifnull          19
					addcollectionlistener.addCollectionProgress(progress);
			//    5    9:aload_1         
			//    6   10:aload_0         
			//    7   11:getfield        #25  <Field float val$progress>
			//    8   14:invokeinterface #36  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionProgress(float)>
			//    9   19:return          
			}

			final CraftAROnDeviceCollectionManager this$0;
			final AddCollectionListener val$addCollectionListener;
			final float val$progress;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
				addCollectionListener = addcollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
				progress = f;
			//    6   10:aload_0         
			//    7   11:fload_3         
			//    8   12:putfield        #25  <Field float val$progress>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//  251  540:aload_0         
	//  252  541:getfield        #101 <Field Handler mResponseHandlerThread>
	//  253  544:new             #12  <Class CraftAROnDeviceCollectionManager$12>
	//  254  547:dup             
	//  255  548:aload_0         
	//  256  549:aload_2         
	//  257  550:fload           5
	//  258  552:invokespecial   #573 <Method void CraftAROnDeviceCollectionManager$12(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollectionManager$AddCollectionListener, float)>
	//  259  555:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//  260  558:pop             
		f1 = progress;
	//  261  559:fload           5
	//  262  561:fstore          4
		break MISSING_BLOCK_LABEL_637;
	//  263  563:goto            637
		((ZipInputStream) (s)).close();
	//  264  566:aload_1         
	//  265  567:invokevirtual   #574 <Method void ZipInputStream.close()>
		((ZipFile) (obj1)).close();
	//  266  570:aload           13
	//  267  572:invokevirtual   #522 <Method void ZipFile.close()>
		s = ((String) (createNewCollectionFromTmpDirectory(file, addCollectionListener)));
	//  268  575:aload_0         
	//  269  576:aload           12
	//  270  578:aload_2         
	//  271  579:invokespecial   #525 <Method CraftAROnDeviceCollection createNewCollectionFromTmpDirectory(File, CraftAROnDeviceCollectionManager$AddCollectionListener)>
	//  272  582:astore_1        
		obj = ((Object) (s));
	//  273  583:aload_1         
	//  274  584:astore          11
		if(s == null)
			break MISSING_BLOCK_LABEL_631;
	//  275  586:aload_1         
	//  276  587:ifnull          631
		try
		{
			updateCollectionsDict(((CraftAROnDeviceCollection) (s)));
	//  277  590:aload_0         
	//  278  591:aload_1         
	//  279  592:invokespecial   #529 <Method void updateCollectionsDict(CraftAROnDeviceCollection)>
		}
	//* 280  595:aload_1         
	//* 281  596:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 282  597:astore          11
		{
			break MISSING_BLOCK_LABEL_606;
	//  283  599:goto            606
		}
		return ((CraftAROnDeviceCollection) (s));
		obj;
	//  284  602:astore          11
		s = null;
	//  285  604:aconst_null     
	//  286  605:astore_1        
		((Exception) (obj)).printStackTrace();
	//  287  606:aload           11
	//  288  608:invokevirtual   #432 <Method void Exception.printStackTrace()>
		mResponseHandlerThread.post(new Runnable() {

			public void run()
			{
				CraftARError craftarerror = new CraftARError(CraftARError.ERROR_CODES.COLLECTION_MANAGER_EXTRACT_ERROR, "Error adding the bundle, check the logs for more details");
			//    0    0:new             #28  <Class CraftARError>
			//    1    3:dup             
			//    2    4:getstatic       #34  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_MANAGER_EXTRACT_ERROR>
			//    3    7:ldc1            #36  <String "Error adding the bundle, check the logs for more details">
			//    4    9:invokespecial   #39  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
			//    5   12:astore_1        
				AddCollectionListener addcollectionlistener = addCollectionListener;
			//    6   13:aload_0         
			//    7   14:getfield        #21  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
			//    8   17:astore_2        
				if(addcollectionlistener != null)
			//*   9   18:aload_2         
			//*  10   19:ifnull          30
				{
					addcollectionlistener.addCollectionFailed(craftarerror);
			//   11   22:aload_2         
			//   12   23:aload_1         
			//   13   24:invokeinterface #45  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
					return;
			//   14   29:return          
				} else
				{
					CLog.e(craftarerror.getErrorMessage());
			//   15   30:aload_1         
			//   16   31:invokevirtual   #49  <Method String CraftARError.getErrorMessage()>
			//   17   34:invokestatic    #55  <Method void CLog.e(String)>
					return;
			//   18   37:return          
				}
			}

			final CraftAROnDeviceCollectionManager this$0;
			final AddCollectionListener val$addCollectionListener;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CraftAROnDeviceCollectionManager this$0>
				addCollectionListener = addcollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//  289  611:aload_0         
	//  290  612:getfield        #101 <Field Handler mResponseHandlerThread>
	//  291  615:new             #14  <Class CraftAROnDeviceCollectionManager$13>
	//  292  618:dup             
	//  293  619:aload_0         
	//  294  620:aload_2         
	//  295  621:invokespecial   #577 <Method void CraftAROnDeviceCollectionManager$13(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollectionManager$AddCollectionListener)>
	//  296  624:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//  297  627:pop             
		obj = ((Object) (s));
	//  298  628:aload_1         
	//  299  629:astore          11
		return ((CraftAROnDeviceCollection) (obj));
	//  300  631:aload           11
	//  301  633:areturn         
	//* 302  634:goto            513
		f = f1;
	//  303  637:fload           4
	//  304  639:fstore_3        
		if(true) goto _L3; else goto _L2
	//  305  640:goto            161
_L2:
	//* 306  643:goto            161
	}

	private CraftARError checkAppID(String s)
	{
		String s1 = mContext.getApplicationContext().getPackageName();
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Context mContext>
	//    2    4:invokevirtual   #583 <Method Context Context.getApplicationContext()>
	//    3    7:invokevirtual   #310 <Method String Context.getPackageName()>
	//    4   10:astore          4
		boolean flag = Build.SDK_VERSION.contains("ARSDK");
	//    5   12:getstatic       #303 <Field String Build.SDK_VERSION>
	//    6   15:ldc2            #585 <String "ARSDK">
	//    7   18:invokevirtual   #589 <Method boolean String.contains(CharSequence)>
	//    8   21:istore_2        
		boolean flag1 = s.matches("com.catchoom.test");
	//    9   22:aload_1         
	//   10   23:ldc2            #591 <String "com.catchoom.test">
	//   11   26:invokevirtual   #595 <Method boolean String.matches(String)>
	//   12   29:istore_3        
		if(!s.matches(s1))
	//*  13   30:aload_1         
	//*  14   31:aload           4
	//*  15   33:invokevirtual   #595 <Method boolean String.matches(String)>
	//*  16   36:ifne            251
			if(flag)
	//*  17   39:iload_2         
	//*  18   40:ifeq            180
			{
				if(flag1)
	//*  19   43:iload_3         
	//*  20   44:ifeq            109
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   21   47:new             #227 <Class StringBuilder>
	//   22   50:dup             
	//   23   51:invokespecial   #228 <Method void StringBuilder()>
	//   24   54:astore          5
					stringbuilder.append("WARNING: Bundle App id (");
	//   25   56:aload           5
	//   26   58:ldc2            #597 <String "WARNING: Bundle App id (">
	//   27   61:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   28   64:pop             
					stringbuilder.append(s);
	//   29   65:aload           5
	//   30   67:aload_1         
	//   31   68:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   32   71:pop             
					stringbuilder.append(") does not match with App id(");
	//   33   72:aload           5
	//   34   74:ldc2            #599 <String ") does not match with App id(">
	//   35   77:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   36   80:pop             
					stringbuilder.append(s1);
	//   37   81:aload           5
	//   38   83:aload           4
	//   39   85:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   40   88:pop             
					stringbuilder.append("). Enabled developer mode, CraftAR watermark will be shown.");
	//   41   89:aload           5
	//   42   91:ldc2            #601 <String "). Enabled developer mode, CraftAR watermark will be shown.">
	//   43   94:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   44   97:pop             
					CLog.w(stringbuilder.toString());
	//   45   98:aload           5
	//   46  100:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   47  103:invokestatic    #604 <Method void CLog.w(String)>
				} else
	//*  48  106:goto            251
				{
					CraftARError.ERROR_CODES error_codes = CraftARError.ERROR_CODES.COLLECTION_INVALID;
	//   49  109:getstatic       #607 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_INVALID>
	//   50  112:astore          5
					StringBuilder stringbuilder1 = new StringBuilder();
	//   51  114:new             #227 <Class StringBuilder>
	//   52  117:dup             
	//   53  118:invokespecial   #228 <Method void StringBuilder()>
	//   54  121:astore          6
					stringbuilder1.append("Bundle App id (");
	//   55  123:aload           6
	//   56  125:ldc2            #609 <String "Bundle App id (">
	//   57  128:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   58  131:pop             
					stringbuilder1.append(s);
	//   59  132:aload           6
	//   60  134:aload_1         
	//   61  135:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   62  138:pop             
					stringbuilder1.append(") does not match with App id(");
	//   63  139:aload           6
	//   64  141:ldc2            #599 <String ") does not match with App id(">
	//   65  144:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   66  147:pop             
					stringbuilder1.append(s1);
	//   67  148:aload           6
	//   68  150:aload           4
	//   69  152:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   70  155:pop             
					stringbuilder1.append(")");
	//   71  156:aload           6
	//   72  158:ldc2            #611 <String ")">
	//   73  161:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   74  164:pop             
					return new CraftARError(error_codes, stringbuilder1.toString());
	//   75  165:new             #250 <Class CraftARError>
	//   76  168:dup             
	//   77  169:aload           5
	//   78  171:aload           6
	//   79  173:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   80  176:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   81  179:areturn         
				}
			} else
			{
				CraftARError.ERROR_CODES error_codes1 = CraftARError.ERROR_CODES.COLLECTION_INVALID;
	//   82  180:getstatic       #607 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_INVALID>
	//   83  183:astore          5
				StringBuilder stringbuilder2 = new StringBuilder();
	//   84  185:new             #227 <Class StringBuilder>
	//   85  188:dup             
	//   86  189:invokespecial   #228 <Method void StringBuilder()>
	//   87  192:astore          6
				stringbuilder2.append("Bundle App id (");
	//   88  194:aload           6
	//   89  196:ldc2            #609 <String "Bundle App id (">
	//   90  199:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   91  202:pop             
				stringbuilder2.append(s);
	//   92  203:aload           6
	//   93  205:aload_1         
	//   94  206:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   95  209:pop             
				stringbuilder2.append(") does not match with App id(");
	//   96  210:aload           6
	//   97  212:ldc2            #599 <String ") does not match with App id(">
	//   98  215:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   99  218:pop             
				stringbuilder2.append(s1);
	//  100  219:aload           6
	//  101  221:aload           4
	//  102  223:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  103  226:pop             
				stringbuilder2.append(")");
	//  104  227:aload           6
	//  105  229:ldc2            #611 <String ")">
	//  106  232:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  107  235:pop             
				return new CraftARError(error_codes1, stringbuilder2.toString());
	//  108  236:new             #250 <Class CraftARError>
	//  109  239:dup             
	//  110  240:aload           5
	//  111  242:aload           6
	//  112  244:invokevirtual   #238 <Method String StringBuilder.toString()>
	//  113  247:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//  114  250:areturn         
			}
		return null;
	//  115  251:aconst_null     
	//  116  252:areturn         
	}

	private CraftARError checkBundleVersion(String s)
	{
label0:
		{
			try
			{
				int i = Integer.parseInt(s.split("-")[1]);
	//    0    0:aload_1         
	//    1    1:ldc2            #614 <String "-">
	//    2    4:invokevirtual   #618 <Method String[] String.split(String)>
	//    3    7:iconst_1        
	//    4    8:aaload          
	//    5    9:invokestatic    #623 <Method int Integer.parseInt(String)>
	//    6   12:istore_2        
				if(i < Build.VERSION_MAJOR_CODE)
	//*   7   13:iload_2         
	//*   8   14:getstatic       #627 <Field int Build.VERSION_MAJOR_CODE>
	//*   9   17:icmpge          90
				{
					CraftARError.ERROR_CODES error_codes = CraftARError.ERROR_CODES.COLLECTION_BUNDLE_VERSION_IS_OLD;
	//   10   20:getstatic       #630 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_BUNDLE_VERSION_IS_OLD>
	//   11   23:astore_3        
					StringBuilder stringbuilder = new StringBuilder();
	//   12   24:new             #227 <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #228 <Method void StringBuilder()>
	//   15   31:astore          4
					stringbuilder.append("Collection bundle was generated for an older version of the SDK (");
	//   16   33:aload           4
	//   17   35:ldc2            #632 <String "Collection bundle was generated for an older version of the SDK (">
	//   18   38:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
					stringbuilder.append(s);
	//   20   42:aload           4
	//   21   44:aload_1         
	//   22   45:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
					stringbuilder.append("). Please, re-generate the collection bundle for your current SDK version (");
	//   24   49:aload           4
	//   25   51:ldc2            #634 <String "). Please, re-generate the collection bundle for your current SDK version (">
	//   26   54:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
					stringbuilder.append(Build.VERSION_MAJOR_CODE);
	//   28   58:aload           4
	//   29   60:getstatic       #627 <Field int Build.VERSION_MAJOR_CODE>
	//   30   63:invokevirtual   #637 <Method StringBuilder StringBuilder.append(int)>
	//   31   66:pop             
					stringbuilder.append(").");
	//   32   67:aload           4
	//   33   69:ldc2            #639 <String ").">
	//   34   72:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   35   75:pop             
					return new CraftARError(error_codes, stringbuilder.toString());
	//   36   76:new             #250 <Class CraftARError>
	//   37   79:dup             
	//   38   80:aload_3         
	//   39   81:aload           4
	//   40   83:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   41   86:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   42   89:areturn         
				}
				if(i <= Build.VERSION_MAJOR_CODE)
					break label0;
	//   43   90:iload_2         
	//   44   91:getstatic       #627 <Field int Build.VERSION_MAJOR_CODE>
	//   45   94:icmple          169
				CraftARError.ERROR_CODES error_codes1 = CraftARError.ERROR_CODES.COLLECTION_BUNDLE_SDK_VERSION_IS_OLD;
	//   46   97:getstatic       #642 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_BUNDLE_SDK_VERSION_IS_OLD>
	//   47  100:astore_3        
				StringBuilder stringbuilder1 = new StringBuilder();
	//   48  101:new             #227 <Class StringBuilder>
	//   49  104:dup             
	//   50  105:invokespecial   #228 <Method void StringBuilder()>
	//   51  108:astore          4
				stringbuilder1.append("Collection bundle was generated for the SDK ");
	//   52  110:aload           4
	//   53  112:ldc2            #644 <String "Collection bundle was generated for the SDK ">
	//   54  115:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   55  118:pop             
				stringbuilder1.append(s);
	//   56  119:aload           4
	//   57  121:aload_1         
	//   58  122:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   59  125:pop             
				stringbuilder1.append(", but your are running the SDK ");
	//   60  126:aload           4
	//   61  128:ldc2            #646 <String ", but your are running the SDK ">
	//   62  131:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   63  134:pop             
				stringbuilder1.append(Build.SDK_VERSION);
	//   64  135:aload           4
	//   65  137:getstatic       #303 <Field String Build.SDK_VERSION>
	//   66  140:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   67  143:pop             
				stringbuilder1.append(".");
	//   68  144:aload           4
	//   69  146:ldc2            #648 <String ".">
	//   70  149:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   71  152:pop             
				s = ((String) (new CraftARError(error_codes1, stringbuilder1.toString())));
	//   72  153:new             #250 <Class CraftARError>
	//   73  156:dup             
	//   74  157:aload_3         
	//   75  158:aload           4
	//   76  160:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   77  163:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   78  166:astore_1        
			}
	//*  79  167:aload_1         
	//*  80  168:areturn         
	//*  81  169:aconst_null     
	//*  82  170:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  83  171:astore_1        
			{
				((Exception) (s)).printStackTrace();
	//   84  172:aload_1         
	//   85  173:invokevirtual   #432 <Method void Exception.printStackTrace()>
				return new CraftARError(CraftARError.ERROR_CODES.COLLECTION_INVALID, "Error checking SDK version");
	//   86  176:new             #250 <Class CraftARError>
	//   87  179:dup             
	//   88  180:getstatic       #607 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_INVALID>
	//   89  183:ldc2            #650 <String "Error checking SDK version">
	//   90  186:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   91  189:areturn         
			}
			return ((CraftARError) (s));
		}
		return null;
	}

	private CraftARError checkSyncResponseForErrors(JSONObject jsonobject)
	{
		byte byte0;
		try
		{
			jsonobject = jsonobject.getJSONObject("error");
	//    0    0:aload_1         
	//    1    1:ldc2            #655 <String "error">
	//    2    4:invokevirtual   #659 <Method JSONObject JSONObject.getJSONObject(String)>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:ifnull          264
	//*   6   12:aload_1         
	//*   7   13:ldc2            #661 <String "message">
	//*   8   16:invokevirtual   #392 <Method String JSONObject.getString(String)>
	//*   9   19:astore_3        
	//*  10   20:aload_1         
	//*  11   21:ldc2            #663 <String "code">
	//*  12   24:invokevirtual   #392 <Method String JSONObject.getString(String)>
	//*  13   27:astore          4
	//*  14   29:iconst_m1       
	//*  15   30:istore_2        
	//*  16   31:aload           4
	//*  17   33:invokevirtual   #666 <Method int String.hashCode()>
	//*  18   36:lookupswitch    5: default 273
	//	               -1931694304: 152
	//	               664647516: 136
	//	               751126170: 120
	//	               1032817888: 104
	//	               1923153265: 88
	//*  19   88:aload           4
	//*  20   90:ldc2            #667 <String "TOKEN_INVALID">
	//*  21   93:invokevirtual   #300 <Method boolean String.equals(Object)>
	//*  22   96:ifeq            273
	//*  23   99:iconst_0        
	//*  24  100:istore_2        
	//*  25  101:goto            273
	//*  26  104:aload           4
	//*  27  106:ldc2            #669 <String "TOKEN_MISSING">
	//*  28  109:invokevirtual   #300 <Method boolean String.equals(Object)>
	//*  29  112:ifeq            273
	//*  30  115:iconst_3        
	//*  31  116:istore_2        
	//*  32  117:goto            273
	//*  33  120:aload           4
	//*  34  122:ldc2            #671 <String "SDK_VERSION_MISSING">
	//*  35  125:invokevirtual   #300 <Method boolean String.equals(Object)>
	//*  36  128:ifeq            273
	//*  37  131:iconst_2        
	//*  38  132:istore_2        
	//*  39  133:goto            273
	//*  40  136:aload           4
	//*  41  138:ldc2            #673 <String "SDK_VERSION_APP_ID_NOT_FOUND">
	//*  42  141:invokevirtual   #300 <Method boolean String.equals(Object)>
	//*  43  144:ifeq            273
	//*  44  147:iconst_1        
	//*  45  148:istore_2        
	//*  46  149:goto            273
	//*  47  152:aload           4
	//*  48  154:ldc2            #675 <String "APP_ID_MISSING">
	//*  49  157:invokevirtual   #300 <Method boolean String.equals(Object)>
	//*  50  160:ifeq            273
	//*  51  163:iconst_4        
	//*  52  164:istore_2        
	//*  53  165:goto            273
	//*  54  168:goto            207
	//*  55  171:new             #250 <Class CraftARError>
	//*  56  174:dup             
	//*  57  175:getstatic       #678 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_INTERNAL>
	//*  58  178:aload_3         
	//*  59  179:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//*  60  182:areturn         
	//*  61  183:new             #250 <Class CraftARError>
	//*  62  186:dup             
	//*  63  187:getstatic       #680 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.SDK_VERSION_APP_ID_NOT_FOUND>
	//*  64  190:aload_3         
	//*  65  191:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//*  66  194:areturn         
	//*  67  195:new             #250 <Class CraftARError>
	//*  68  198:dup             
	//*  69  199:getstatic       #256 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.TOKEN_INVALID>
	//*  70  202:aload_3         
	//*  71  203:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//*  72  206:areturn         
	//*  73  207:new             #653 <Class JSONException>
	//*  74  210:dup             
	//*  75  211:ldc2            #682 <String "Unknown error code">
	//*  76  214:invokespecial   #683 <Method void JSONException(String)>
	//*  77  217:athrow          
	//*  78  218:getstatic       #678 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_INTERNAL>
	//*  79  221:astore_3        
	//*  80  222:new             #227 <Class StringBuilder>
	//*  81  225:dup             
	//*  82  226:invokespecial   #228 <Method void StringBuilder()>
	//*  83  229:astore          4
	//*  84  231:aload           4
	//*  85  233:ldc2            #685 <String "Invalid error code : ">
	//*  86  236:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  87  239:pop             
	//*  88  240:aload           4
	//*  89  242:aload_1         
	//*  90  243:invokevirtual   #686 <Method String JSONObject.toString()>
	//*  91  246:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  92  249:pop             
	//*  93  250:new             #250 <Class CraftARError>
	//*  94  253:dup             
	//*  95  254:aload_3         
	//*  96  255:aload           4
	//*  97  257:invokevirtual   #238 <Method String StringBuilder.toString()>
	//*  98  260:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//*  99  263:areturn         
	//* 100  264:aconst_null     
	//* 101  265:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//* 102  266:astore_1        
		{
			return null;
	//  103  267:aconst_null     
	//  104  268:areturn         
		}
		if(jsonobject == null) goto _L2; else goto _L1
_L1:
		Object obj;
		Object obj1;
		try
		{
			obj = ((Object) (jsonobject.getString("message")));
			obj1 = ((Object) (jsonobject.getString("code")));
		}
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			obj = ((Object) (CraftARError.ERROR_CODES.ERROR_INTERNAL));
			obj1 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj1)).append("Invalid error code : ");
			((StringBuilder) (obj1)).append(jsonobject.toString());
			return new CraftARError(((CraftARError.ERROR_CODES) (obj)), ((StringBuilder) (obj1)).toString());
		}
		byte0 = -1;
		((String) (obj1)).hashCode();
		JVM INSTR lookupswitch 5: default 273
	//	               -1931694304: 152
	//	               664647516: 136
	//	               751126170: 120
	//	               1032817888: 104
	//	               1923153265: 88;
		   goto _L3 _L4 _L5 _L6 _L7 _L8
_L8:
		if(((String) (obj1)).equals("TOKEN_INVALID"))
			byte0 = 0;
		  goto _L3
_L7:
		if(((String) (obj1)).equals("TOKEN_MISSING"))
			byte0 = 3;
		  goto _L3
_L6:
		if(((String) (obj1)).equals("SDK_VERSION_MISSING"))
			byte0 = 2;
		  goto _L3
_L5:
		if(((String) (obj1)).equals("SDK_VERSION_APP_ID_NOT_FOUND"))
			byte0 = 1;
		  goto _L3
_L4:
		if(((String) (obj1)).equals("APP_ID_MISSING"))
			byte0 = 4;
		  goto _L3
_L14:
		return new CraftARError(CraftARError.ERROR_CODES.ERROR_INTERNAL, ((String) (obj)));
_L11:
		return new CraftARError(CraftARError.ERROR_CODES.SDK_VERSION_APP_ID_NOT_FOUND, ((String) (obj)));
_L10:
		return new CraftARError(CraftARError.ERROR_CODES.TOKEN_INVALID, ((String) (obj)));
_L9:
		throw new JSONException("Unknown error code");
_L2:
		JSONException jsonexception;
		return null;
	//* 105  269:astore_3        
	//* 106  270:goto            218
_L3:
		byte0;
	//  107  273:iload_2         
		JVM INSTR tableswitch 0 4: default 308
	//	               0 195
	//	               1 183
	//	               2 171
	//	               3 171
	//	               4 171;
	//  108  274:tableswitch     0 4: default 308
	//	               0 195
	//	               1 183
	//	               2 171
	//	               3 171
	//	               4 171
		   goto _L9 _L10 _L11 _L12 _L12 _L12
_L12:
		if(true) goto _L14; else goto _L13
_L13:
	//* 109  308:goto            168
	}

	private void clearOnDeviceBundlesDirectory()
	{
		File file = new File(collectionBundlesRoot);
	//    0    0:new             #127 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #120 <Field String collectionBundlesRoot>
	//    4    8:invokespecial   #130 <Method void File(String)>
	//    5   11:astore_2        
		if(file.isDirectory())
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #477 <Method boolean File.isDirectory()>
	//*   8   16:ifeq            65
		{
			File afile[] = file.listFiles();
	//    9   19:aload_2         
	//   10   20:invokevirtual   #691 <Method File[] File.listFiles()>
	//   11   23:astore_2        
			for(int i = 0; i < afile.length; i++)
	//*  12   24:iconst_0        
	//*  13   25:istore_1        
	//*  14   26:iload_1         
	//*  15   27:aload_2         
	//*  16   28:arraylength     
	//*  17   29:icmpge          65
				if(afile[i].isDirectory())
	//*  18   32:aload_2         
	//*  19   33:iload_1         
	//*  20   34:aaload          
	//*  21   35:invokevirtual   #477 <Method boolean File.isDirectory()>
	//*  22   38:ifeq            51
					deleteRecursive(afile[i]);
	//   23   41:aload_0         
	//   24   42:aload_2         
	//   25   43:iload_1         
	//   26   44:aaload          
	//   27   45:invokespecial   #694 <Method void deleteRecursive(File)>
				else
	//*  28   48:goto            58
					afile[i].delete();
	//   29   51:aload_2         
	//   30   52:iload_1         
	//   31   53:aaload          
	//   32   54:invokevirtual   #697 <Method boolean File.delete()>
	//   33   57:pop             

	//   34   58:iload_1         
	//   35   59:iconst_1        
	//   36   60:iadd            
	//   37   61:istore_1        
		}
	//*  38   62:goto            26
	//   39   65:return          
	}

	private CraftAROnDeviceCollection createNewCollectionFromTmpDirectory(File file, final AddCollectionListener addCollectionListener)
	{
		Object obj;
		String s;
		final CraftARError craftARError;
		Object obj1;
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #227 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #228 <Method void StringBuilder()>
	//    3    7:astore          4
		((StringBuilder) (obj)).append(collectionsRoot);
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:getfield        #114 <Field String collectionsRoot>
	//    7   15:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		((StringBuilder) (obj)).append("/.unziptmpdirectory/");
	//    9   19:aload           4
	//   10   21:ldc2            #441 <String "/.unziptmpdirectory/">
	//   11   24:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
		s = ((StringBuilder) (obj)).toString();
	//   13   28:aload           4
	//   14   30:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   15   33:astore          5
		obj = ((Object) (new StringBuilder()));
	//   16   35:new             #227 <Class StringBuilder>
	//   17   38:dup             
	//   18   39:invokespecial   #228 <Method void StringBuilder()>
	//   19   42:astore          4
		((StringBuilder) (obj)).append(s);
	//   20   44:aload           4
	//   21   46:aload           5
	//   22   48:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   23   51:pop             
		((StringBuilder) (obj)).append("/collection.json");
	//   24   52:aload           4
	//   25   54:ldc2            #699 <String "/collection.json">
	//   26   57:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   27   60:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   28   61:aload           4
	//   29   63:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   30   66:astore          4
		craftARError = ((CraftARError) (new StringBuilder()));
	//   31   68:new             #227 <Class StringBuilder>
	//   32   71:dup             
	//   33   72:invokespecial   #228 <Method void StringBuilder()>
	//   34   75:astore          6
		((StringBuilder) (craftARError)).append(s);
	//   35   77:aload           6
	//   36   79:aload           5
	//   37   81:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   38   84:pop             
		((StringBuilder) (craftARError)).append("/media");
	//   39   85:aload           6
	//   40   87:ldc2            #701 <String "/media">
	//   41   90:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   42   93:pop             
		craftARError = ((CraftARError) (((StringBuilder) (craftARError)).toString()));
	//   43   94:aload           6
	//   44   96:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   45   99:astore          6
		obj = ((Object) (FileUtil.getJSONfromFilePath(((String) (obj)))));
	//   46  101:aload           4
	//   47  103:invokestatic    #706 <Method JSONObject FileUtil.getJSONfromFilePath(String)>
	//   48  106:astore          4
		Object obj2 = ((Object) (((JSONObject) (obj)).getString("uuid")));
	//   49  108:aload           4
	//   50  110:ldc2            #708 <String "uuid">
	//   51  113:invokevirtual   #392 <Method String JSONObject.getString(String)>
	//   52  116:astore          9
		obj1 = ((Object) (new StringBuilder()));
	//   53  118:new             #227 <Class StringBuilder>
	//   54  121:dup             
	//   55  122:invokespecial   #228 <Method void StringBuilder()>
	//   56  125:astore          7
		((StringBuilder) (obj1)).append(collectionsRoot);
	//   57  127:aload           7
	//   58  129:aload_0         
	//   59  130:getfield        #114 <Field String collectionsRoot>
	//   60  133:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   61  136:pop             
		((StringBuilder) (obj1)).append("/");
	//   62  137:aload           7
	//   63  139:ldc2            #400 <String "/">
	//   64  142:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   65  145:pop             
		((StringBuilder) (obj1)).append(((String) (obj2)));
	//   66  146:aload           7
	//   67  148:aload           9
	//   68  150:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   69  153:pop             
		obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   70  154:aload           7
	//   71  156:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   72  159:astore          7
		File file1 = new File(((String) (obj1)));
	//   73  161:new             #127 <Class File>
	//   74  164:dup             
	//   75  165:aload           7
	//   76  167:invokespecial   #130 <Method void File(String)>
	//   77  170:astore          8
		if(file1.exists())
	//*  78  172:aload           8
	//*  79  174:invokevirtual   #134 <Method boolean File.exists()>
	//*  80  177:ifeq            186
			deleteCollectionInternal(((String) (obj2)));
	//   81  180:aload_0         
	//   82  181:aload           9
	//   83  183:invokespecial   #192 <Method void deleteCollectionInternal(String)>
		StringBuilder stringbuilder2 = new StringBuilder();
	//   84  186:new             #227 <Class StringBuilder>
	//   85  189:dup             
	//   86  190:invokespecial   #228 <Method void StringBuilder()>
	//   87  193:astore          10
		stringbuilder2.append(s);
	//   88  195:aload           10
	//   89  197:aload           5
	//   90  199:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   91  202:pop             
		stringbuilder2.append("/");
	//   92  203:aload           10
	//   93  205:ldc2            #400 <String "/">
	//   94  208:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   95  211:pop             
		stringbuilder2.append(((String) (obj2)));
	//   96  212:aload           10
	//   97  214:aload           9
	//   98  216:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   99  219:pop             
		obj2 = ((Object) (new File(stringbuilder2.toString())));
	//  100  220:new             #127 <Class File>
	//  101  223:dup             
	//  102  224:aload           10
	//  103  226:invokevirtual   #238 <Method String StringBuilder.toString()>
	//  104  229:invokespecial   #130 <Method void File(String)>
	//  105  232:astore          9
		stringbuilder2 = new StringBuilder();
	//  106  234:new             #227 <Class StringBuilder>
	//  107  237:dup             
	//  108  238:invokespecial   #228 <Method void StringBuilder()>
	//  109  241:astore          10
		stringbuilder2.append("Moving collection from ");
	//  110  243:aload           10
	//  111  245:ldc2            #710 <String "Moving collection from ">
	//  112  248:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  113  251:pop             
		stringbuilder2.append(((File) (obj2)).getAbsolutePath());
	//  114  252:aload           10
	//  115  254:aload           9
	//  116  256:invokevirtual   #713 <Method String File.getAbsolutePath()>
	//  117  259:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  118  262:pop             
		stringbuilder2.append("to ");
	//  119  263:aload           10
	//  120  265:ldc2            #715 <String "to ">
	//  121  268:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  122  271:pop             
		stringbuilder2.append(((String) (obj1)));
	//  123  272:aload           10
	//  124  274:aload           7
	//  125  276:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  126  279:pop             
		CLog.d(stringbuilder2.toString());
	//  127  280:aload           10
	//  128  282:invokevirtual   #238 <Method String StringBuilder.toString()>
	//  129  285:invokestatic    #243 <Method void CLog.d(String)>
		((File) (obj2)).renameTo(file1);
	//  130  288:aload           9
	//  131  290:aload           8
	//  132  292:invokevirtual   #719 <Method boolean File.renameTo(File)>
	//  133  295:pop             
		obj1 = ((Object) (new File(mediaRoot)));
	//  134  296:new             #127 <Class File>
	//  135  299:dup             
	//  136  300:aload_0         
	//  137  301:getfield        #125 <Field String mediaRoot>
	//  138  304:invokespecial   #130 <Method void File(String)>
	//  139  307:astore          7
		if(!((File) (obj1)).exists())
	//* 140  309:aload           7
	//* 141  311:invokevirtual   #134 <Method boolean File.exists()>
	//* 142  314:ifne            323
			((File) (obj1)).mkdir();
	//  143  317:aload           7
	//  144  319:invokevirtual   #722 <Method boolean File.mkdir()>
	//  145  322:pop             
		craftARError = ((CraftARError) (new File(((String) (craftARError)))));
	//  146  323:new             #127 <Class File>
	//  147  326:dup             
	//  148  327:aload           6
	//  149  329:invokespecial   #130 <Method void File(String)>
	//  150  332:astore          6
		if(!((File) (craftARError)).exists() || !((File) (craftARError)).isDirectory()) goto _L2; else goto _L1
	//  151  334:aload           6
	//  152  336:invokevirtual   #134 <Method boolean File.exists()>
	//  153  339:ifeq            440
	//  154  342:aload           6
	//  155  344:invokevirtual   #477 <Method boolean File.isDirectory()>
	//  156  347:ifeq            440
_L1:
		File afile[] = ((File) (craftARError)).listFiles();
	//  157  350:aload           6
	//  158  352:invokevirtual   #691 <Method File[] File.listFiles()>
	//  159  355:astore          6
		int i = 0;
	//  160  357:iconst_0        
	//  161  358:istore_3        
_L3:
		String s1;
		if(i >= afile.length)
			break; /* Loop/switch isn't completed */
	//  162  359:iload_3         
	//  163  360:aload           6
	//  164  362:arraylength     
	//  165  363:icmpge          440
		s1 = afile[i].getName();
	//  166  366:aload           6
	//  167  368:iload_3         
	//  168  369:aaload          
	//  169  370:invokevirtual   #723 <Method String File.getName()>
	//  170  373:astore          8
		File file2 = afile[i];
	//  171  375:aload           6
	//  172  377:iload_3         
	//  173  378:aaload          
	//  174  379:astore          9
		StringBuilder stringbuilder3 = new StringBuilder();
	//  175  381:new             #227 <Class StringBuilder>
	//  176  384:dup             
	//  177  385:invokespecial   #228 <Method void StringBuilder()>
	//  178  388:astore          10
		stringbuilder3.append(obj1);
	//  179  390:aload           10
	//  180  392:aload           7
	//  181  394:invokevirtual   #490 <Method StringBuilder StringBuilder.append(Object)>
	//  182  397:pop             
		stringbuilder3.append("/");
	//  183  398:aload           10
	//  184  400:ldc2            #400 <String "/">
	//  185  403:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  186  406:pop             
		stringbuilder3.append(s1);
	//  187  407:aload           10
	//  188  409:aload           8
	//  189  411:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  190  414:pop             
		file2.renameTo(new File(stringbuilder3.toString()));
	//  191  415:aload           9
	//  192  417:new             #127 <Class File>
	//  193  420:dup             
	//  194  421:aload           10
	//  195  423:invokevirtual   #238 <Method String StringBuilder.toString()>
	//  196  426:invokespecial   #130 <Method void File(String)>
	//  197  429:invokevirtual   #719 <Method boolean File.renameTo(File)>
	//  198  432:pop             
		i++;
	//  199  433:iload_3         
	//  200  434:iconst_1        
	//  201  435:iadd            
	//  202  436:istore_3        
		if(true) goto _L3; else goto _L2
	//  203  437:goto            359
_L2:
		obj = ((Object) (new CraftAROnDeviceCollection(((JSONObject) (obj)))));
	//  204  440:new             #725 <Class CraftAROnDeviceCollection>
	//  205  443:dup             
	//  206  444:aload           4
	//  207  446:invokespecial   #728 <Method void CraftAROnDeviceCollection(JSONObject)>
	//  208  449:astore          4
		afile = ((File []) (((CraftAROnDeviceCollection) (obj)).getBundleVersion()));
	//  209  451:aload           4
	//  210  453:invokevirtual   #731 <Method String CraftAROnDeviceCollection.getBundleVersion()>
	//  211  456:astore          6
		CLog.d("Checking bundle in addCollection");
	//  212  458:ldc2            #733 <String "Checking bundle in addCollection">
	//  213  461:invokestatic    #243 <Method void CLog.d(String)>
		afile = ((File []) (checkBundleVersion(((String) (afile)))));
	//  214  464:aload_0         
	//  215  465:aload           6
	//  216  467:invokespecial   #735 <Method CraftARError checkBundleVersion(String)>
	//  217  470:astore          6
		if(afile == null)
			break MISSING_BLOCK_LABEL_507;
	//  218  472:aload           6
	//  219  474:ifnull          507
		mResponseHandlerThread.post(new Runnable() {

			public void run()
			{
				AddCollectionListener addcollectionlistener = addCollectionListener;
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
			//    2    4:astore_1        
				if(addcollectionlistener != null)
			//*   3    5:aload_1         
			//*   4    6:ifnull          20
				{
					addcollectionlistener.addCollectionFailed(craftARError);
			//    5    9:aload_1         
			//    6   10:aload_0         
			//    7   11:getfield        #25  <Field CraftARError val$craftARError>
			//    8   14:invokeinterface #36  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
					return;
			//    9   19:return          
				} else
				{
					CLog.e(craftARError.getErrorMessage());
			//   10   20:aload_0         
			//   11   21:getfield        #25  <Field CraftARError val$craftARError>
			//   12   24:invokevirtual   #42  <Method String CraftARError.getErrorMessage()>
			//   13   27:invokestatic    #48  <Method void CLog.e(String)>
					return;
			//   14   30:return          
				}
			}

			final CraftAROnDeviceCollectionManager this$0;
			final AddCollectionListener val$addCollectionListener;
			final CraftARError val$craftARError;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
				addCollectionListener = addcollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
				craftARError = craftarerror;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field CraftARError val$craftARError>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//  220  477:aload_0         
	//  221  478:getfield        #101 <Field Handler mResponseHandlerThread>
	//  222  481:new             #18  <Class CraftAROnDeviceCollectionManager$15>
	//  223  484:dup             
	//  224  485:aload_0         
	//  225  486:aload_2         
	//  226  487:aload           6
	//  227  489:invokespecial   #738 <Method void CraftAROnDeviceCollectionManager$15(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollectionManager$AddCollectionListener, CraftARError)>
	//  228  492:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//  229  495:pop             
		deleteRecursive(file);
	//  230  496:aload_0         
	//  231  497:aload_1         
	//  232  498:invokespecial   #694 <Method void deleteRecursive(File)>
		clearOnDeviceBundlesDirectory();
	//  233  501:aload_0         
	//  234  502:invokespecial   #740 <Method void clearOnDeviceBundlesDirectory()>
		return null;
	//  235  505:aconst_null     
	//  236  506:areturn         
		final CraftARError checkAppIDError = checkAppID(((CraftAROnDeviceCollection) (obj)).getAppID());
	//  237  507:aload_0         
	//  238  508:aload           4
	//  239  510:invokevirtual   #743 <Method String CraftAROnDeviceCollection.getAppID()>
	//  240  513:invokespecial   #745 <Method CraftARError checkAppID(String)>
	//  241  516:astore          6
		if(checkAppIDError == null)
			break MISSING_BLOCK_LABEL_553;
	//  242  518:aload           6
	//  243  520:ifnull          553
		mResponseHandlerThread.post(new Runnable() {

			public void run()
			{
				AddCollectionListener addcollectionlistener = addCollectionListener;
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
			//    2    4:astore_1        
				if(addcollectionlistener != null)
			//*   3    5:aload_1         
			//*   4    6:ifnull          20
				{
					addcollectionlistener.addCollectionFailed(checkAppIDError);
			//    5    9:aload_1         
			//    6   10:aload_0         
			//    7   11:getfield        #25  <Field CraftARError val$checkAppIDError>
			//    8   14:invokeinterface #36  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
					return;
			//    9   19:return          
				} else
				{
					CLog.e(checkAppIDError.getErrorMessage());
			//   10   20:aload_0         
			//   11   21:getfield        #25  <Field CraftARError val$checkAppIDError>
			//   12   24:invokevirtual   #42  <Method String CraftARError.getErrorMessage()>
			//   13   27:invokestatic    #48  <Method void CLog.e(String)>
					return;
			//   14   30:return          
				}
			}

			final CraftAROnDeviceCollectionManager this$0;
			final AddCollectionListener val$addCollectionListener;
			final CraftARError val$checkAppIDError;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
				addCollectionListener = addcollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
				checkAppIDError = craftarerror;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field CraftARError val$checkAppIDError>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//  244  523:aload_0         
	//  245  524:getfield        #101 <Field Handler mResponseHandlerThread>
	//  246  527:new             #20  <Class CraftAROnDeviceCollectionManager$16>
	//  247  530:dup             
	//  248  531:aload_0         
	//  249  532:aload_2         
	//  250  533:aload           6
	//  251  535:invokespecial   #746 <Method void CraftAROnDeviceCollectionManager$16(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollectionManager$AddCollectionListener, CraftARError)>
	//  252  538:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//  253  541:pop             
		deleteRecursive(file);
	//  254  542:aload_0         
	//  255  543:aload_1         
	//  256  544:invokespecial   #694 <Method void deleteRecursive(File)>
		clearOnDeviceBundlesDirectory();
	//  257  547:aload_0         
	//  258  548:invokespecial   #740 <Method void clearOnDeviceBundlesDirectory()>
		return null;
	//  259  551:aconst_null     
	//  260  552:areturn         
		try
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  261  553:new             #227 <Class StringBuilder>
	//  262  556:dup             
	//  263  557:invokespecial   #228 <Method void StringBuilder()>
	//  264  560:astore          6
			stringbuilder.append("Moving collection.json to ");
	//  265  562:aload           6
	//  266  564:ldc2            #748 <String "Moving collection.json to ">
	//  267  567:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  268  570:pop             
			stringbuilder.append(((CraftAROnDeviceCollection) (obj)).getLocalPath());
	//  269  571:aload           6
	//  270  573:aload           4
	//  271  575:invokevirtual   #751 <Method String CraftAROnDeviceCollection.getLocalPath()>
	//  272  578:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  273  581:pop             
			CLog.d(stringbuilder.toString());
	//  274  582:aload           6
	//  275  584:invokevirtual   #238 <Method String StringBuilder.toString()>
	//  276  587:invokestatic    #243 <Method void CLog.d(String)>
			FileUtil.moveFile(s, "collection.json", ((CraftAROnDeviceCollection) (obj)).getLocalPath());
	//  277  590:aload           5
	//  278  592:ldc2            #753 <String "collection.json">
	//  279  595:aload           4
	//  280  597:invokevirtual   #751 <Method String CraftAROnDeviceCollection.getLocalPath()>
	//  281  600:invokestatic    #757 <Method void FileUtil.moveFile(String, String, String)>
			if(((CraftAROnDeviceCollection) (obj)).listItems().size() == 0)
	//* 282  603:aload           4
	//* 283  605:invokevirtual   #761 <Method ArrayList CraftAROnDeviceCollection.listItems()>
	//* 284  608:invokevirtual   #764 <Method int ArrayList.size()>
	//* 285  611:ifne            661
			{
				byte abyte0[] = "".getBytes();
	//  286  614:ldc2            #294 <String "">
	//  287  617:invokevirtual   #333 <Method byte[] String.getBytes()>
	//  288  620:astore          5
				StringBuilder stringbuilder1 = new StringBuilder();
	//  289  622:new             #227 <Class StringBuilder>
	//  290  625:dup             
	//  291  626:invokespecial   #228 <Method void StringBuilder()>
	//  292  629:astore          6
				stringbuilder1.append(((CraftAROnDeviceCollection) (obj)).getLocalPath());
	//  293  631:aload           6
	//  294  633:aload           4
	//  295  635:invokevirtual   #751 <Method String CraftAROnDeviceCollection.getLocalPath()>
	//  296  638:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  297  641:pop             
				stringbuilder1.append("/list.txt");
	//  298  642:aload           6
	//  299  644:ldc2            #766 <String "/list.txt">
	//  300  647:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  301  650:pop             
				FileUtil.writeToFile(abyte0, stringbuilder1.toString());
	//  302  651:aload           5
	//  303  653:aload           6
	//  304  655:invokevirtual   #238 <Method String StringBuilder.toString()>
	//  305  658:invokestatic    #770 <Method void FileUtil.writeToFile(byte[], String)>
			}
			deleteRecursive(file);
	//  306  661:aload_0         
	//  307  662:aload_1         
	//  308  663:invokespecial   #694 <Method void deleteRecursive(File)>
			clearOnDeviceBundlesDirectory();
	//  309  666:aload_0         
	//  310  667:invokespecial   #740 <Method void clearOnDeviceBundlesDirectory()>
			break MISSING_BLOCK_LABEL_700;
	//  311  670:goto            700
		}
	//* 312  673:astore_1        
	//* 313  674:goto            685
		// Misplaced declaration of an exception variable
		catch(File file)
	//* 314  677:astore_1        
		{
			break MISSING_BLOCK_LABEL_696;
	//  315  678:goto            696
		}
		// Misplaced declaration of an exception variable
		catch(File file) { }
		break MISSING_BLOCK_LABEL_685;
		file;
	//  316  681:astore_1        
		obj = null;
	//  317  682:aconst_null     
	//  318  683:astore          4
		((Exception) (file)).printStackTrace();
	//  319  685:aload_1         
	//  320  686:invokevirtual   #432 <Method void Exception.printStackTrace()>
		break MISSING_BLOCK_LABEL_700;
	//  321  689:goto            700
		file;
	//  322  692:astore_1        
		obj = null;
	//  323  693:aconst_null     
	//  324  694:astore          4
		((JSONException) (file)).printStackTrace();
	//  325  696:aload_1         
	//  326  697:invokevirtual   #771 <Method void JSONException.printStackTrace()>
		if(obj == null)
	//* 327  700:aload           4
	//* 328  702:ifnonnull       722
			mResponseHandlerThread.post(new Runnable() {

				public void run()
				{
					CraftARError craftarerror = new CraftARError(CraftARError.ERROR_CODES.COLLECTION_MANAGER_EXTRACT_ERROR, "Error adding the bundle, check the logs for more details");
				//    0    0:new             #28  <Class CraftARError>
				//    1    3:dup             
				//    2    4:getstatic       #34  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_MANAGER_EXTRACT_ERROR>
				//    3    7:ldc1            #36  <String "Error adding the bundle, check the logs for more details">
				//    4    9:invokespecial   #39  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
				//    5   12:astore_1        
					AddCollectionListener addcollectionlistener = addCollectionListener;
				//    6   13:aload_0         
				//    7   14:getfield        #21  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
				//    8   17:astore_2        
					if(addcollectionlistener != null)
				//*   9   18:aload_2         
				//*  10   19:ifnull          30
					{
						addcollectionlistener.addCollectionFailed(craftarerror);
				//   11   22:aload_2         
				//   12   23:aload_1         
				//   13   24:invokeinterface #45  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
						return;
				//   14   29:return          
					} else
					{
						CLog.e(craftarerror.getErrorMessage());
				//   15   30:aload_1         
				//   16   31:invokevirtual   #49  <Method String CraftARError.getErrorMessage()>
				//   17   34:invokestatic    #55  <Method void CLog.e(String)>
						return;
				//   18   37:return          
					}
				}

				final CraftAROnDeviceCollectionManager this$0;
				final AddCollectionListener val$addCollectionListener;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CraftAROnDeviceCollectionManager this$0>
				addCollectionListener = addcollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//  329  705:aload_0         
	//  330  706:getfield        #101 <Field Handler mResponseHandlerThread>
	//  331  709:new             #22  <Class CraftAROnDeviceCollectionManager$17>
	//  332  712:dup             
	//  333  713:aload_0         
	//  334  714:aload_2         
	//  335  715:invokespecial   #772 <Method void CraftAROnDeviceCollectionManager$17(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollectionManager$AddCollectionListener)>
	//  336  718:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//  337  721:pop             
		return ((CraftAROnDeviceCollection) (obj));
	//  338  722:aload           4
	//  339  724:areturn         
	}

	private void deleteCollectionInternal(String s)
	{
		removeTokensForCollection(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #775 <Method void removeTokensForCollection(String)>
		saveCollectionsDict();
	//    3    5:aload_0         
	//    4    6:invokespecial   #778 <Method void saveCollectionsDict()>
		deleteRecursive(new File(getCollectionPath(s)));
	//    5    9:aload_0         
	//    6   10:new             #127 <Class File>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #781 <Method String getCollectionPath(String)>
	//   11   19:invokespecial   #130 <Method void File(String)>
	//   12   22:invokespecial   #694 <Method void deleteRecursive(File)>
		CraftARInternalInterfaces.CollectionEventsHandler collectioneventshandler = mInternalCollectionEventsHandler;
	//   13   25:aload_0         
	//   14   26:getfield        #783 <Field CraftARInternalInterfaces$CollectionEventsHandler mInternalCollectionEventsHandler>
	//   15   29:astore_2        
		if(collectioneventshandler != null)
	//*  16   30:aload_2         
	//*  17   31:ifnull          41
			collectioneventshandler.onCollectionDeleted(s);
	//   18   34:aload_2         
	//   19   35:aload_1         
	//   20   36:invokeinterface #788 <Method void CraftARInternalInterfaces$CollectionEventsHandler.onCollectionDeleted(String)>
	//   21   41:return          
	}

	private void deleteRecursive(File file)
	{
		if(file.isDirectory())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #477 <Method boolean File.isDirectory()>
	//*   2    4:ifeq            39
		{
			File afile[] = file.listFiles();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #691 <Method File[] File.listFiles()>
	//    5   11:astore          4
			int j = afile.length;
	//    6   13:aload           4
	//    7   15:arraylength     
	//    8   16:istore_3        
			for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_2        
	//*  11   19:iload_2         
	//*  12   20:iload_3         
	//*  13   21:icmpge          39
				deleteRecursive(afile[i]);
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:iload_2         
	//   17   28:aaload          
	//   18   29:invokespecial   #694 <Method void deleteRecursive(File)>

	//   19   32:iload_2         
	//   20   33:iconst_1        
	//   21   34:iadd            
	//   22   35:istore_2        
		}
	//*  23   36:goto            19
		file.delete();
	//   24   39:aload_1         
	//   25   40:invokevirtual   #697 <Method boolean File.delete()>
	//   26   43:pop             
	//   27   44:return          
	}

	private String getCollectionJSONPath(String s)
	{
		return String.format("%s/%s/collection.json", new Object[] {
			getCollectionsRoot(mContext), s
		});
	//    0    0:ldc2            #791 <String "%s/%s/collection.json">
	//    1    3:iconst_2        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #103 <Field Context mContext>
	//    8   14:invokespecial   #112 <Method String getCollectionsRoot(Context)>
	//    9   17:aastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:aload_1         
	//   13   21:aastore         
	//   14   22:invokestatic    #795 <Method String String.format(String, Object[])>
	//   15   25:areturn         
	}

	private String getCollectionPath(String s)
	{
		return String.format("%s/%s", new Object[] {
			getCollectionsRoot(mContext), s
		});
	//    0    0:ldc2            #797 <String "%s/%s">
	//    1    3:iconst_2        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #103 <Field Context mContext>
	//    8   14:invokespecial   #112 <Method String getCollectionsRoot(Context)>
	//    9   17:aastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:aload_1         
	//   13   21:aastore         
	//   14   22:invokestatic    #795 <Method String String.format(String, Object[])>
	//   15   25:areturn         
	}

	private String getCollectionsBundlesRoot(String s)
	{
		return String.format("%s/onDeviceBundles", new Object[] {
			s
		});
	//    0    0:ldc2            #799 <String "%s/onDeviceBundles">
	//    1    3:iconst_1        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_1         
	//    6   10:aastore         
	//    7   11:invokestatic    #795 <Method String String.format(String, Object[])>
	//    8   14:areturn         
	}

	private String getCollectionsRoot(Context context)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #227 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #228 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(((Object) (context.getFilesDir())));
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #803 <Method File Context.getFilesDir()>
	//    7   13:invokevirtual   #490 <Method StringBuilder StringBuilder.append(Object)>
	//    8   16:pop             
		stringbuilder.append("/CraftARCollections");
	//    9   17:aload_2         
	//   10   18:ldc2            #805 <String "/CraftARCollections">
	//   11   21:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		return stringbuilder.toString();
	//   13   25:aload_2         
	//   14   26:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   15   29:areturn         
	}

	private String getMediaPath(String s)
	{
		return String.format("%s/media", new Object[] {
			s
		});
	//    0    0:ldc2            #807 <String "%s/media">
	//    1    3:iconst_1        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_1         
	//    6   10:aastore         
	//    7   11:invokestatic    #795 <Method String String.format(String, Object[])>
	//    8   14:areturn         
	}

	private CraftAROnDeviceCollection getWithUUID(String s)
	{
		if(s == null)
			break MISSING_BLOCK_LABEL_59;
	//    0    0:aload_1         
	//    1    1:ifnull          59
		s = ((String) (new CraftAROnDeviceCollection(FileUtil.getJSONfromFilePath(getCollectionJSONPath(s)))));
	//    2    4:new             #725 <Class CraftAROnDeviceCollection>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #811 <Method String getCollectionJSONPath(String)>
	//    7   13:invokestatic    #706 <Method JSONObject FileUtil.getJSONfromFilePath(String)>
	//    8   16:invokespecial   #728 <Method void CraftAROnDeviceCollection(JSONObject)>
	//    9   19:astore_1        
		return ((CraftAROnDeviceCollection) (s));
	//   10   20:aload_1         
	//   11   21:areturn         
		s;
	//   12   22:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   13   23:new             #227 <Class StringBuilder>
	//   14   26:dup             
	//   15   27:invokespecial   #228 <Method void StringBuilder()>
	//   16   30:astore_2        
		stringbuilder.append("Could not read collection: ");
	//   17   31:aload_2         
	//   18   32:ldc2            #813 <String "Could not read collection: ">
	//   19   35:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		stringbuilder.append(((Exception) (s)).getLocalizedMessage());
	//   21   39:aload_2         
	//   22   40:aload_1         
	//   23   41:invokevirtual   #435 <Method String Exception.getLocalizedMessage()>
	//   24   44:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
		CLog.e(stringbuilder.toString());
	//   26   48:aload_2         
	//   27   49:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   28   52:invokestatic    #248 <Method void CLog.e(String)>
		((Exception) (s)).printStackTrace();
	//   29   55:aload_1         
	//   30   56:invokevirtual   #432 <Method void Exception.printStackTrace()>
		return null;
	//   31   59:aconst_null     
	//   32   60:areturn         
	}

	private void notifyAddCollectionFinished(final CraftAROnDeviceCollection newCollection, final AddCollectionListener collectionEventsHandler)
	{
		CraftARInternalInterfaces.CollectionEventsHandler collectioneventshandler = mInternalCollectionEventsHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #783 <Field CraftARInternalInterfaces$CollectionEventsHandler mInternalCollectionEventsHandler>
	//    2    4:astore_3        
		if(collectioneventshandler != null && newCollection != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          20
	//*   5    9:aload_1         
	//*   6   10:ifnull          20
			collectioneventshandler.onCollectionAdded(newCollection);
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:invokeinterface #816 <Method void CraftARInternalInterfaces$CollectionEventsHandler.onCollectionAdded(CraftAROnDeviceCollection)>
		if(collectionEventsHandler != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          42
			mResponseHandlerThread.post(new Runnable() {

				public void run()
				{
					collectionEventsHandler.collectionAdded(newCollection);
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$collectionEventsHandler>
				//    2    4:aload_0         
				//    3    5:getfield        #25  <Field CraftAROnDeviceCollection val$newCollection>
				//    4    8:invokeinterface #36  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.collectionAdded(CraftAROnDeviceCollection)>
				//    5   13:return          
				}

				final CraftAROnDeviceCollectionManager this$0;
				final AddCollectionListener val$collectionEventsHandler;
				final CraftAROnDeviceCollection val$newCollection;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
				collectionEventsHandler = addcollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$collectionEventsHandler>
				newCollection = craftarondevicecollection;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field CraftAROnDeviceCollection val$newCollection>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   12   24:aload_0         
	//   13   25:getfield        #101 <Field Handler mResponseHandlerThread>
	//   14   28:new             #10  <Class CraftAROnDeviceCollectionManager$11>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:aload_1         
	//   19   35:invokespecial   #819 <Method void CraftAROnDeviceCollectionManager$11(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollectionManager$AddCollectionListener, CraftAROnDeviceCollection)>
	//   20   38:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//   21   41:pop             
	//   22   42:return          
	}

	private void notifyInvalidExtension(final AddCollectionListener collectionEventsHandler)
	{
		mResponseHandlerThread.post(new Runnable() {

			public void run()
			{
				CraftARError craftarerror = new CraftARError(CraftARError.ERROR_CODES.COLLECTION_MANAGER_EXTRACT_ERROR, "Collection could not be added, bundle is invalid. Only .zip extension is allowed at this moment");
			//    0    0:new             #28  <Class CraftARError>
			//    1    3:dup             
			//    2    4:getstatic       #34  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_MANAGER_EXTRACT_ERROR>
			//    3    7:ldc1            #36  <String "Collection could not be added, bundle is invalid. Only .zip extension is allowed at this moment">
			//    4    9:invokespecial   #39  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
			//    5   12:astore_1        
				collectionEventsHandler.addCollectionFailed(craftarerror);
			//    6   13:aload_0         
			//    7   14:getfield        #21  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$collectionEventsHandler>
			//    8   17:aload_1         
			//    9   18:invokeinterface #45  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
			//   10   23:return          
			}

			final CraftAROnDeviceCollectionManager this$0;
			final AddCollectionListener val$collectionEventsHandler;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CraftAROnDeviceCollectionManager this$0>
				collectionEventsHandler = addcollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$collectionEventsHandler>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Handler mResponseHandlerThread>
	//    2    4:new             #8   <Class CraftAROnDeviceCollectionManager$10>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #822 <Method void CraftAROnDeviceCollectionManager$10(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollectionManager$AddCollectionListener)>
	//    7   13:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	private void reloadCollectionsDict()
	{
		try
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #227 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #228 <Method void StringBuilder()>
	//    3    7:astore_1        
			stringbuilder.append(collectionsRoot);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #114 <Field String collectionsRoot>
	//    7   13:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
			stringbuilder.append("/collections_dict.json");
	//    9   17:aload_1         
	//   10   18:ldc2            #824 <String "/collections_dict.json">
	//   11   21:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
			mCollectionsDict = FileUtil.getJSONfromFilePath(stringbuilder.toString());
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   16   30:invokestatic    #706 <Method JSONObject FileUtil.getJSONfromFilePath(String)>
	//   17   33:putfield        #826 <Field JSONObject mCollectionsDict>
		}
	//*  18   36:goto            52
	//*  19   39:astore_1        
	//*  20   40:aload_1         
	//*  21   41:invokevirtual   #771 <Method void JSONException.printStackTrace()>
	//*  22   44:goto            52
	//*  23   47:astore_1        
	//*  24   48:aload_1         
	//*  25   49:invokevirtual   #423 <Method void IOException.printStackTrace()>
	//*  26   52:aload_0         
	//*  27   53:getfield        #826 <Field JSONObject mCollectionsDict>
	//*  28   56:ifnonnull       132
	//*  29   59:ldc2            #828 <String "Unable to read the collections json file! Creating empty dictionary">
	//*  30   62:invokestatic    #604 <Method void CLog.w(String)>
	//*  31   65:aload_0         
	//*  32   66:new             #382 <Class JSONObject>
	//*  33   69:dup             
	//*  34   70:invokespecial   #829 <Method void JSONObject()>
	//*  35   73:putfield        #826 <Field JSONObject mCollectionsDict>
	//*  36   76:aload_0         
	//*  37   77:getfield        #826 <Field JSONObject mCollectionsDict>
	//*  38   80:invokevirtual   #686 <Method String JSONObject.toString()>
	//*  39   83:invokevirtual   #333 <Method byte[] String.getBytes()>
	//*  40   86:astore_1        
	//*  41   87:new             #227 <Class StringBuilder>
	//*  42   90:dup             
	//*  43   91:invokespecial   #228 <Method void StringBuilder()>
	//*  44   94:astore_2        
	//*  45   95:aload_2         
	//*  46   96:aload_0         
	//*  47   97:getfield        #114 <Field String collectionsRoot>
	//*  48  100:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  49  103:pop             
	//*  50  104:aload_2         
	//*  51  105:ldc2            #824 <String "/collections_dict.json">
	//*  52  108:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  53  111:pop             
	//*  54  112:aload_1         
	//*  55  113:aload_2         
	//*  56  114:invokevirtual   #238 <Method String StringBuilder.toString()>
	//*  57  117:invokestatic    #770 <Method void FileUtil.writeToFile(byte[], String)>
	//*  58  120:return          
	//*  59  121:astore_1        
	//*  60  122:aload_1         
	//*  61  123:invokevirtual   #423 <Method void IOException.printStackTrace()>
	//*  62  126:return          
	//*  63  127:astore_1        
	//*  64  128:aload_1         
	//*  65  129:invokevirtual   #532 <Method void FileNotFoundException.printStackTrace()>
	//*  66  132:return          
		catch(FileNotFoundException filenotfoundexception1) { }
	//   67  133:astore_1        
		catch(IOException ioexception)
		{
			ioexception.printStackTrace();
		}
		catch(JSONException jsonexception)
		{
			jsonexception.printStackTrace();
		}
		if(mCollectionsDict == null)
		{
			CLog.w("Unable to read the collections json file! Creating empty dictionary");
			mCollectionsDict = new JSONObject();
			try
			{
				byte abyte0[] = mCollectionsDict.toString().getBytes();
				StringBuilder stringbuilder1 = new StringBuilder();
				stringbuilder1.append(collectionsRoot);
				stringbuilder1.append("/collections_dict.json");
				FileUtil.writeToFile(abyte0, stringbuilder1.toString());
				return;
			}
			catch(FileNotFoundException filenotfoundexception)
			{
				filenotfoundexception.printStackTrace();
			}
			catch(IOException ioexception1)
			{
				ioexception1.printStackTrace();
				return;
			}
		}
	//*  68  134:goto            52
	}

	private void removeTokensForCollection(String s)
	{
		Iterator iterator = mCollectionsDict.keys();
	//    0    0:aload_0         
	//    1    1:getfield        #826 <Field JSONObject mCollectionsDict>
	//    2    4:invokevirtual   #833 <Method Iterator JSONObject.keys()>
	//    3    7:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    8:aload_2         
	//    5    9:invokeinterface #838 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            93
			try
			{
				if(mCollectionsDict.getString((String)iterator.next()).equals(((Object) (s))))
	//*   7   17:aload_0         
	//*   8   18:getfield        #826 <Field JSONObject mCollectionsDict>
	//*   9   21:aload_2         
	//*  10   22:invokeinterface #841 <Method Object Iterator.next()>
	//*  11   27:checkcast       #296 <Class String>
	//*  12   30:invokevirtual   #392 <Method String JSONObject.getString(String)>
	//*  13   33:aload_1         
	//*  14   34:invokevirtual   #300 <Method boolean String.equals(Object)>
	//*  15   37:ifeq            8
					iterator.remove();
	//   16   40:aload_2         
	//   17   41:invokeinterface #844 <Method void Iterator.remove()>
			}
	//*  18   46:goto            8
			catch(JSONException jsonexception)
	//*  19   49:astore_3        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   20   50:new             #227 <Class StringBuilder>
	//   21   53:dup             
	//   22   54:invokespecial   #228 <Method void StringBuilder()>
	//   23   57:astore          4
				stringbuilder.append("Internal error: ");
	//   24   59:aload           4
	//   25   61:ldc2            #846 <String "Internal error: ">
	//   26   64:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   27   67:pop             
				stringbuilder.append(jsonexception.getLocalizedMessage());
	//   28   68:aload           4
	//   29   70:aload_3         
	//   30   71:invokevirtual   #847 <Method String JSONException.getLocalizedMessage()>
	//   31   74:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   32   77:pop             
				CLog.e(stringbuilder.toString());
	//   33   78:aload           4
	//   34   80:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   35   83:invokestatic    #248 <Method void CLog.e(String)>
				jsonexception.printStackTrace();
	//   36   86:aload_3         
	//   37   87:invokevirtual   #771 <Method void JSONException.printStackTrace()>
			}
		} while(true);
	//   38   90:goto            8
	//   39   93:return          
	}

	private void saveCollectionsDict()
	{
		if(mCollectionsDict == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #826 <Field JSONObject mCollectionsDict>
	//*   2    4:ifnonnull       24
		{
			CLog.w("Unable to read the collections json file! Creating empty dictionary");
	//    3    7:ldc2            #828 <String "Unable to read the collections json file! Creating empty dictionary">
	//    4   10:invokestatic    #604 <Method void CLog.w(String)>
			mCollectionsDict = new JSONObject();
	//    5   13:aload_0         
	//    6   14:new             #382 <Class JSONObject>
	//    7   17:dup             
	//    8   18:invokespecial   #829 <Method void JSONObject()>
	//    9   21:putfield        #826 <Field JSONObject mCollectionsDict>
		}
		byte abyte0[] = mCollectionsDict.toString(4).getBytes();
	//   10   24:aload_0         
	//   11   25:getfield        #826 <Field JSONObject mCollectionsDict>
	//   12   28:iconst_4        
	//   13   29:invokevirtual   #850 <Method String JSONObject.toString(int)>
	//   14   32:invokevirtual   #333 <Method byte[] String.getBytes()>
	//   15   35:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   16   36:new             #227 <Class StringBuilder>
	//   17   39:dup             
	//   18   40:invokespecial   #228 <Method void StringBuilder()>
	//   19   43:astore_2        
		stringbuilder.append(collectionsRoot);
	//   20   44:aload_2         
	//   21   45:aload_0         
	//   22   46:getfield        #114 <Field String collectionsRoot>
	//   23   49:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:pop             
		stringbuilder.append("/collections_dict.json");
	//   25   53:aload_2         
	//   26   54:ldc2            #824 <String "/collections_dict.json">
	//   27   57:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
		FileUtil.writeToFile(abyte0, stringbuilder.toString());
	//   29   61:aload_1         
	//   30   62:aload_2         
	//   31   63:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   32   66:invokestatic    #770 <Method void FileUtil.writeToFile(byte[], String)>
		return;
	//   33   69:return          
		Object obj;
		obj;
	//   34   70:astore_1        
		break MISSING_BLOCK_LABEL_84;
	//   35   71:goto            84
		obj;
	//   36   74:astore_1        
		break MISSING_BLOCK_LABEL_89;
	//   37   75:goto            89
		obj;
	//   38   78:astore_1        
		((JSONException) (obj)).printStackTrace();
	//   39   79:aload_1         
	//   40   80:invokevirtual   #771 <Method void JSONException.printStackTrace()>
		return;
	//   41   83:return          
		((IOException) (obj)).printStackTrace();
	//   42   84:aload_1         
	//   43   85:invokevirtual   #423 <Method void IOException.printStackTrace()>
		return;
	//   44   88:return          
		((FileNotFoundException) (obj)).printStackTrace();
	//   45   89:aload_1         
	//   46   90:invokevirtual   #532 <Method void FileNotFoundException.printStackTrace()>
		return;
	//   47   93:return          
	}

	private void syncCollectionInternal(CraftAROnDeviceCollection craftarondevicecollection, String s, SyncCollectionListener synccollectionlistener)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #852 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #854 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #857 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	private void updateCollectionsDict(CraftAROnDeviceCollection craftarondevicecollection)
	{
		String s = craftarondevicecollection.getUUID();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #860 <Method String CraftAROnDeviceCollection.getUUID()>
	//    2    4:astore_3        
		removeTokensForCollection(s);
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:invokespecial   #775 <Method void removeTokensForCollection(String)>
		String as[] = s.split("-", 2);
	//    6   10:aload_3         
	//    7   11:ldc2            #614 <String "-">
	//    8   14:iconst_2        
	//    9   15:invokevirtual   #863 <Method String[] String.split(String, int)>
	//   10   18:astore          4
		Object obj = "";
	//   11   20:ldc2            #294 <String "">
	//   12   23:astore_2        
		if(as.length == 2)
	//*  13   24:aload           4
	//*  14   26:arraylength     
	//*  15   27:iconst_2        
	//*  16   28:icmpne          61
		{
			obj = ((Object) (new StringBuilder()));
	//   17   31:new             #227 <Class StringBuilder>
	//   18   34:dup             
	//   19   35:invokespecial   #228 <Method void StringBuilder()>
	//   20   38:astore_2        
			((StringBuilder) (obj)).append("-");
	//   21   39:aload_2         
	//   22   40:ldc2            #614 <String "-">
	//   23   43:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
			((StringBuilder) (obj)).append(as[1]);
	//   25   47:aload_2         
	//   26   48:aload           4
	//   27   50:iconst_1        
	//   28   51:aaload          
	//   29   52:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   31   56:aload_2         
	//   32   57:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   33   60:astore_2        
		}
		for(craftarondevicecollection = ((CraftAROnDeviceCollection) (craftarondevicecollection.getTokens().iterator())); ((Iterator) (craftarondevicecollection)).hasNext();)
	//*  34   61:aload_1         
	//*  35   62:invokevirtual   #866 <Method ArrayList CraftAROnDeviceCollection.getTokens()>
	//*  36   65:invokevirtual   #869 <Method Iterator ArrayList.iterator()>
	//*  37   68:astore_1        
	//*  38   69:aload_1         
	//*  39   70:invokeinterface #838 <Method boolean Iterator.hasNext()>
	//*  40   75:ifeq            181
		{
			String s1 = (String)((Iterator) (craftarondevicecollection)).next();
	//   41   78:aload_1         
	//   42   79:invokeinterface #841 <Method Object Iterator.next()>
	//   43   84:checkcast       #296 <Class String>
	//   44   87:astore          4
			try
			{
				JSONObject jsonobject = mCollectionsDict;
	//   45   89:aload_0         
	//   46   90:getfield        #826 <Field JSONObject mCollectionsDict>
	//   47   93:astore          5
				StringBuilder stringbuilder1 = new StringBuilder();
	//   48   95:new             #227 <Class StringBuilder>
	//   49   98:dup             
	//   50   99:invokespecial   #228 <Method void StringBuilder()>
	//   51  102:astore          6
				stringbuilder1.append(s1);
	//   52  104:aload           6
	//   53  106:aload           4
	//   54  108:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   55  111:pop             
				stringbuilder1.append(((String) (obj)));
	//   56  112:aload           6
	//   57  114:aload_2         
	//   58  115:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   59  118:pop             
				jsonobject.put(stringbuilder1.toString(), ((Object) (s)));
	//   60  119:aload           5
	//   61  121:aload           6
	//   62  123:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   63  126:aload_3         
	//   64  127:invokevirtual   #873 <Method JSONObject JSONObject.put(String, Object)>
	//   65  130:pop             
			}
	//*  66  131:goto            69
			catch(JSONException jsonexception)
	//*  67  134:astore          4
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   68  136:new             #227 <Class StringBuilder>
	//   69  139:dup             
	//   70  140:invokespecial   #228 <Method void StringBuilder()>
	//   71  143:astore          5
				stringbuilder.append("Internal error in updateCollectionsDict: ");
	//   72  145:aload           5
	//   73  147:ldc2            #875 <String "Internal error in updateCollectionsDict: ">
	//   74  150:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   75  153:pop             
				stringbuilder.append(jsonexception.getLocalizedMessage());
	//   76  154:aload           5
	//   77  156:aload           4
	//   78  158:invokevirtual   #847 <Method String JSONException.getLocalizedMessage()>
	//   79  161:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   80  164:pop             
				CLog.e(stringbuilder.toString());
	//   81  165:aload           5
	//   82  167:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   83  170:invokestatic    #248 <Method void CLog.e(String)>
				jsonexception.printStackTrace();
	//   84  173:aload           4
	//   85  175:invokevirtual   #771 <Method void JSONException.printStackTrace()>
			}
		}

	//*  86  178:goto            69
		saveCollectionsDict();
	//   87  181:aload_0         
	//   88  182:invokespecial   #778 <Method void saveCollectionsDict()>
	//   89  185:return          
	}

	private CraftARError validateSyncResponse(JSONObject jsonobject)
	{
		Object obj = ((Object) (checkSyncResponseForErrors(jsonobject)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #877 <Method CraftARError checkSyncResponseForErrors(JSONObject)>
	//    3    5:astore_3        
		if(obj != null)
	//*   4    6:aload_3         
	//*   5    7:ifnull          12
			return ((CraftARError) (obj));
	//    6   10:aload_3         
	//    7   11:areturn         
		int i;
		Object obj1;
		try
		{
			jsonobject.getString("collection_uuid");
	//    8   12:aload_1         
	//    9   13:ldc2            #398 <String "collection_uuid">
	//   10   16:invokevirtual   #392 <Method String JSONObject.getString(String)>
	//   11   19:pop             
			jsonobject.getString("created");
	//   12   20:aload_1         
	//   13   21:ldc2            #389 <String "created">
	//   14   24:invokevirtual   #392 <Method String JSONObject.getString(String)>
	//   15   27:pop             
			obj1 = ((Object) (jsonobject.getString("url")));
	//   16   28:aload_1         
	//   17   29:ldc2            #396 <String "url">
	//   18   32:invokevirtual   #392 <Method String JSONObject.getString(String)>
	//   19   35:astore          4
			jsonobject.getString("checksum");
	//   20   37:aload_1         
	//   21   38:ldc2            #879 <String "checksum">
	//   22   41:invokevirtual   #392 <Method String JSONObject.getString(String)>
	//   23   44:pop             
			obj = ((Object) (jsonobject.getString("app_id")));
	//   24   45:aload_1         
	//   25   46:ldc1            #61  <String "app_id">
	//   26   48:invokevirtual   #392 <Method String JSONObject.getString(String)>
	//   27   51:astore_3        
			jsonobject = ((JSONObject) (jsonobject.getString("version")));
	//   28   52:aload_1         
	//   29   53:ldc1            #67  <String "version">
	//   30   55:invokevirtual   #392 <Method String JSONObject.getString(String)>
	//   31   58:astore_1        
		}
	//*  32   59:aload_1         
	//*  33   60:ifnonnull       77
	//*  34   63:new             #250 <Class CraftARError>
	//*  35   66:dup             
	//*  36   67:getstatic       #882 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_SYNC_INVALID_BUNDLE>
	//*  37   70:ldc2            #884 <String "SDK Version not received in sync call.">
	//*  38   73:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//*  39   76:areturn         
	//*  40   77:aload_1         
	//*  41   78:ldc2            #614 <String "-">
	//*  42   81:invokevirtual   #618 <Method String[] String.split(String)>
	//*  43   84:iconst_1        
	//*  44   85:aaload          
	//*  45   86:invokestatic    #623 <Method int Integer.parseInt(String)>
	//*  46   89:istore_2        
	//*  47   90:iload_2         
	//*  48   91:getstatic       #627 <Field int Build.VERSION_MAJOR_CODE>
	//*  49   94:icmpge          111
	//*  50   97:new             #250 <Class CraftARError>
	//*  51  100:dup             
	//*  52  101:getstatic       #630 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_BUNDLE_VERSION_IS_OLD>
	//*  53  104:ldc2            #886 <String "Remote bundle has been generated for an older version of the SDK. Please, update the remote bundle.">
	//*  54  107:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//*  55  110:areturn         
	//*  56  111:iload_2         
	//*  57  112:getstatic       #627 <Field int Build.VERSION_MAJOR_CODE>
	//*  58  115:icmple          188
	//*  59  118:getstatic       #642 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_BUNDLE_SDK_VERSION_IS_OLD>
	//*  60  121:astore_3        
	//*  61  122:new             #227 <Class StringBuilder>
	//*  62  125:dup             
	//*  63  126:invokespecial   #228 <Method void StringBuilder()>
	//*  64  129:astore          4
	//*  65  131:aload           4
	//*  66  133:ldc2            #888 <String "Remote bundle has been generated for a newer version of the SDK (">
	//*  67  136:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  68  139:pop             
	//*  69  140:aload           4
	//*  70  142:aload_1         
	//*  71  143:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  72  146:pop             
	//*  73  147:aload           4
	//*  74  149:ldc2            #890 <String "). Please, update the SDK or maintain a bundle for this SDK version (">
	//*  75  152:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  76  155:pop             
	//*  77  156:aload           4
	//*  78  158:getstatic       #303 <Field String Build.SDK_VERSION>
	//*  79  161:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  80  164:pop             
	//*  81  165:aload           4
	//*  82  167:ldc2            #892 <String "-)">
	//*  83  170:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  84  173:pop             
	//*  85  174:new             #250 <Class CraftARError>
	//*  86  177:dup             
	//*  87  178:aload_3         
	//*  88  179:aload           4
	//*  89  181:invokevirtual   #238 <Method String StringBuilder.toString()>
	//*  90  184:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//*  91  187:areturn         
	//*  92  188:aload_3         
	//*  93  189:aload_0         
	//*  94  190:getfield        #103 <Field Context mContext>
	//*  95  193:invokevirtual   #310 <Method String Context.getPackageName()>
	//*  96  196:invokevirtual   #595 <Method boolean String.matches(String)>
	//*  97  199:ifne            267
	//*  98  202:getstatic       #882 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_SYNC_INVALID_BUNDLE>
	//*  99  205:astore_1        
	//* 100  206:new             #227 <Class StringBuilder>
	//* 101  209:dup             
	//* 102  210:invokespecial   #228 <Method void StringBuilder()>
	//* 103  213:astore          4
	//* 104  215:aload           4
	//* 105  217:ldc2            #894 <String "App id mismatch. Bundle app id :">
	//* 106  220:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 107  223:pop             
	//* 108  224:aload           4
	//* 109  226:aload_3         
	//* 110  227:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 111  230:pop             
	//* 112  231:aload           4
	//* 113  233:ldc2            #896 <String ". App ID:">
	//* 114  236:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 115  239:pop             
	//* 116  240:aload           4
	//* 117  242:aload_0         
	//* 118  243:getfield        #103 <Field Context mContext>
	//* 119  246:invokevirtual   #310 <Method String Context.getPackageName()>
	//* 120  249:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 121  252:pop             
	//* 122  253:new             #250 <Class CraftARError>
	//* 123  256:dup             
	//* 124  257:aload_1         
	//* 125  258:aload           4
	//* 126  260:invokevirtual   #238 <Method String StringBuilder.toString()>
	//* 127  263:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//* 128  266:areturn         
	//* 129  267:aload           4
	//* 130  269:invokevirtual   #899 <Method int String.length()>
	//* 131  272:ifne            289
	//* 132  275:new             #250 <Class CraftARError>
	//* 133  278:dup             
	//* 134  279:getstatic       #882 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_SYNC_INVALID_BUNDLE>
	//* 135  282:ldc2            #901 <String "No url provided for the bundle">
	//* 136  285:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//* 137  288:areturn         
	//* 138  289:aconst_null     
	//* 139  290:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//* 140  291:astore_1        
		{
			CraftARError.ERROR_CODES error_codes = CraftARError.ERROR_CODES.ERROR_NETWORK;
	//  141  292:getstatic       #426 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_NETWORK>
	//  142  295:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//  143  296:new             #227 <Class StringBuilder>
	//  144  299:dup             
	//  145  300:invokespecial   #228 <Method void StringBuilder()>
	//  146  303:astore          4
			stringbuilder.append("JSON is incomplete:");
	//  147  305:aload           4
	//  148  307:ldc2            #903 <String "JSON is incomplete:">
	//  149  310:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  150  313:pop             
			stringbuilder.append(((JSONException) (jsonobject)).getMessage());
	//  151  314:aload           4
	//  152  316:aload_1         
	//  153  317:invokevirtual   #906 <Method String JSONException.getMessage()>
	//  154  320:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  155  323:pop             
			return new CraftARError(error_codes, stringbuilder.toString());
	//  156  324:new             #250 <Class CraftARError>
	//  157  327:dup             
	//  158  328:aload_3         
	//  159  329:aload           4
	//  160  331:invokevirtual   #238 <Method String StringBuilder.toString()>
	//  161  334:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//  162  337:areturn         
		}
		if(jsonobject == null)
			return new CraftARError(CraftARError.ERROR_CODES.COLLECTION_SYNC_INVALID_BUNDLE, "SDK Version not received in sync call.");
		i = Integer.parseInt(((String) (jsonobject)).split("-")[1]);
		if(i < Build.VERSION_MAJOR_CODE)
			return new CraftARError(CraftARError.ERROR_CODES.COLLECTION_BUNDLE_VERSION_IS_OLD, "Remote bundle has been generated for an older version of the SDK. Please, update the remote bundle.");
		if(i > Build.VERSION_MAJOR_CODE)
		{
			obj = ((Object) (CraftARError.ERROR_CODES.COLLECTION_BUNDLE_SDK_VERSION_IS_OLD));
			obj1 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj1)).append("Remote bundle has been generated for a newer version of the SDK (");
			((StringBuilder) (obj1)).append(((String) (jsonobject)));
			((StringBuilder) (obj1)).append("). Please, update the SDK or maintain a bundle for this SDK version (");
			((StringBuilder) (obj1)).append(Build.SDK_VERSION);
			((StringBuilder) (obj1)).append("-)");
			return new CraftARError(((CraftARError.ERROR_CODES) (obj)), ((StringBuilder) (obj1)).toString());
		}
		if(!((String) (obj)).matches(mContext.getPackageName()))
		{
			jsonobject = ((JSONObject) (CraftARError.ERROR_CODES.COLLECTION_SYNC_INVALID_BUNDLE));
			obj1 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj1)).append("App id mismatch. Bundle app id :");
			((StringBuilder) (obj1)).append(((String) (obj)));
			((StringBuilder) (obj1)).append(". App ID:");
			((StringBuilder) (obj1)).append(mContext.getPackageName());
			return new CraftARError(((CraftARError.ERROR_CODES) (jsonobject)), ((StringBuilder) (obj1)).toString());
		}
		if(((String) (obj1)).length() == 0)
			return new CraftARError(CraftARError.ERROR_CODES.COLLECTION_SYNC_INVALID_BUNDLE, "No url provided for the bundle");
		else
			return null;
	}

	public void addCollection(final File bundleFile, final AddCollectionListener addCollectionListener)
	{
		if(!bundleFile.exists())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #134 <Method boolean File.exists()>
	//*   2    4:ifne            30
		{
			CLog.e("Error unzipping bundle. File does not exist!");
	//    3    7:ldc2            #910 <String "Error unzipping bundle. File does not exist!">
	//    4   10:invokestatic    #248 <Method void CLog.e(String)>
			mResponseHandlerThread.post(new Runnable() {

				public void run()
				{
					CraftARError craftarerror = new CraftARError(CraftARError.ERROR_CODES.COLLECTION_MANAGER_EXTRACT_ERROR, "Collection bundle could not be found. Please, ensure that specified file exists");
				//    0    0:new             #28  <Class CraftARError>
				//    1    3:dup             
				//    2    4:getstatic       #34  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_MANAGER_EXTRACT_ERROR>
				//    3    7:ldc1            #36  <String "Collection bundle could not be found. Please, ensure that specified file exists">
				//    4    9:invokespecial   #39  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
				//    5   12:astore_1        
					AddCollectionListener addcollectionlistener = addCollectionListener;
				//    6   13:aload_0         
				//    7   14:getfield        #21  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
				//    8   17:astore_2        
					if(addcollectionlistener != null)
				//*   9   18:aload_2         
				//*  10   19:ifnull          30
					{
						addcollectionlistener.addCollectionFailed(craftarerror);
				//   11   22:aload_2         
				//   12   23:aload_1         
				//   13   24:invokeinterface #45  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
						return;
				//   14   29:return          
					} else
					{
						CLog.e(craftarerror.getErrorMessage());
				//   15   30:aload_1         
				//   16   31:invokevirtual   #49  <Method String CraftARError.getErrorMessage()>
				//   17   34:invokestatic    #55  <Method void CLog.e(String)>
						return;
				//   18   37:return          
					}
				}

				final CraftAROnDeviceCollectionManager this$0;
				final AddCollectionListener val$addCollectionListener;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CraftAROnDeviceCollectionManager this$0>
				addCollectionListener = addcollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    5   13:aload_0         
	//    6   14:getfield        #101 <Field Handler mResponseHandlerThread>
	//    7   17:new             #34  <Class CraftAROnDeviceCollectionManager$5>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:aload_2         
	//   11   23:invokespecial   #911 <Method void CraftAROnDeviceCollectionManager$5(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollectionManager$AddCollectionListener)>
	//   12   26:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//   13   29:pop             
		}
		if(!bundleFile.getAbsolutePath().endsWith(".zip"))
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #713 <Method String File.getAbsolutePath()>
	//*  16   34:ldc2            #402 <String ".zip">
	//*  17   37:invokevirtual   #914 <Method boolean String.endsWith(String)>
	//*  18   40:ifne            49
		{
			notifyInvalidExtension(addCollectionListener);
	//   19   43:aload_0         
	//   20   44:aload_2         
	//   21   45:invokespecial   #916 <Method void notifyInvalidExtension(CraftAROnDeviceCollectionManager$AddCollectionListener)>
			return;
	//   22   48:return          
		} else
		{
			mHandler.post(new Runnable() {

				public void run()
				{
					CraftAROnDeviceCollection craftarondevicecollection = addInternal(bundleFile, addCollectionListener);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field File val$bundleFile>
				//    4    8:aload_0         
				//    5    9:getfield        #25  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
				//    6   12:invokestatic    #34  <Method CraftAROnDeviceCollection CraftAROnDeviceCollectionManager.access$200(CraftAROnDeviceCollectionManager, File, CraftAROnDeviceCollectionManager$AddCollectionListener)>
				//    7   15:astore_1        
					if(craftarondevicecollection != null)
				//*   8   16:aload_1         
				//*   9   17:ifnull          32
						notifyAddCollectionFinished(craftarondevicecollection, addCollectionListener);
				//   10   20:aload_0         
				//   11   21:getfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
				//   12   24:aload_1         
				//   13   25:aload_0         
				//   14   26:getfield        #25  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
				//   15   29:invokestatic    #38  <Method void CraftAROnDeviceCollectionManager.access$300(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollection, CraftAROnDeviceCollectionManager$AddCollectionListener)>
				//   16   32:return          
				}

				final CraftAROnDeviceCollectionManager this$0;
				final AddCollectionListener val$addCollectionListener;
				final File val$bundleFile;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
				bundleFile = file;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field File val$bundleFile>
				addCollectionListener = addcollectionlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   23   49:aload_0         
	//   24   50:getfield        #219 <Field Handler mHandler>
	//   25   53:new             #36  <Class CraftAROnDeviceCollectionManager$6>
	//   26   56:dup             
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:aload_2         
	//   30   60:invokespecial   #919 <Method void CraftAROnDeviceCollectionManager$6(CraftAROnDeviceCollectionManager, File, CraftAROnDeviceCollectionManager$AddCollectionListener)>
	//   31   63:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//   32   66:pop             
			return;
	//   33   67:return          
		}
	}

	public void addCollection(final String bundleFileName, final AddCollectionListener addCollectionListener)
	{
		if(!bundleFileName.endsWith(".zip"))
	//*   0    0:aload_1         
	//*   1    1:ldc2            #402 <String ".zip">
	//*   2    4:invokevirtual   #914 <Method boolean String.endsWith(String)>
	//*   3    7:ifne            16
		{
			notifyInvalidExtension(addCollectionListener);
	//    4   10:aload_0         
	//    5   11:aload_2         
	//    6   12:invokespecial   #916 <Method void notifyInvalidExtension(CraftAROnDeviceCollectionManager$AddCollectionListener)>
			return;
	//    7   15:return          
		} else
		{
			mHandler.post(new Runnable() {

				public void run()
				{
					CraftAROnDeviceCollection craftarondevicecollection = addInternal(bundleFileName, addCollectionListener);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field String val$bundleFileName>
				//    4    8:aload_0         
				//    5    9:getfield        #25  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
				//    6   12:invokestatic    #34  <Method CraftAROnDeviceCollection CraftAROnDeviceCollectionManager.access$500(CraftAROnDeviceCollectionManager, String, CraftAROnDeviceCollectionManager$AddCollectionListener)>
				//    7   15:astore_1        
					if(craftarondevicecollection != null)
				//*   8   16:aload_1         
				//*   9   17:ifnull          32
						notifyAddCollectionFinished(craftarondevicecollection, addCollectionListener);
				//   10   20:aload_0         
				//   11   21:getfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
				//   12   24:aload_1         
				//   13   25:aload_0         
				//   14   26:getfield        #25  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
				//   15   29:invokestatic    #38  <Method void CraftAROnDeviceCollectionManager.access$300(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollection, CraftAROnDeviceCollectionManager$AddCollectionListener)>
				//   16   32:return          
				}

				final CraftAROnDeviceCollectionManager this$0;
				final AddCollectionListener val$addCollectionListener;
				final String val$bundleFileName;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
				bundleFileName = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String val$bundleFileName>
				addCollectionListener = addcollectionlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    8   16:aload_0         
	//    9   17:getfield        #219 <Field Handler mHandler>
	//   10   20:new             #42  <Class CraftAROnDeviceCollectionManager$9>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokespecial   #923 <Method void CraftAROnDeviceCollectionManager$9(CraftAROnDeviceCollectionManager, String, CraftAROnDeviceCollectionManager$AddCollectionListener)>
	//   16   30:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//   17   33:pop             
			return;
	//   18   34:return          
		}
	}

	public void addCollectionWithToken(final String token, final AddCollectionListener listener)
	{
		mHandler.post(new Runnable() {

			public void run()
			{
				addCollectionWithTokenInternal(token, ((String) (null)), listener);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field String val$token>
			//    4    8:aconst_null     
			//    5    9:aload_0         
			//    6   10:getfield        #25  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$listener>
			//    7   13:invokestatic    #34  <Method void CraftAROnDeviceCollectionManager.access$400(CraftAROnDeviceCollectionManager, String, String, CraftAROnDeviceCollectionManager$AddCollectionListener)>
			//    8   16:return          
			}

			final CraftAROnDeviceCollectionManager this$0;
			final AddCollectionListener val$listener;
			final String val$token;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
				token = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String val$token>
				listener = addcollectionlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$listener>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #219 <Field Handler mHandler>
	//    2    4:new             #38  <Class CraftAROnDeviceCollectionManager$7>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #925 <Method void CraftAROnDeviceCollectionManager$7(CraftAROnDeviceCollectionManager, String, CraftAROnDeviceCollectionManager$AddCollectionListener)>
	//    8   14:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//    9   17:pop             
	//   10   18:return          
	}

	public void addCollectionWithTokenAndTag(final String token, final String tag, final AddCollectionListener listener)
	{
		mHandler.post(new Runnable() {

			public void run()
			{
				addCollectionWithTokenInternal(token, tag, listener);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field CraftAROnDeviceCollectionManager this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #24  <Field String val$token>
			//    4    8:aload_0         
			//    5    9:getfield        #26  <Field String val$tag>
			//    6   12:aload_0         
			//    7   13:getfield        #28  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$listener>
			//    8   16:invokestatic    #36  <Method void CraftAROnDeviceCollectionManager.access$400(CraftAROnDeviceCollectionManager, String, String, CraftAROnDeviceCollectionManager$AddCollectionListener)>
			//    9   19:return          
			}

			final CraftAROnDeviceCollectionManager this$0;
			final AddCollectionListener val$listener;
			final String val$tag;
			final String val$token;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field CraftAROnDeviceCollectionManager this$0>
				token = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field String val$token>
				tag = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field String val$tag>
				listener = addcollectionlistener;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$listener>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #219 <Field Handler mHandler>
	//    2    4:new             #40  <Class CraftAROnDeviceCollectionManager$8>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #928 <Method void CraftAROnDeviceCollectionManager$8(CraftAROnDeviceCollectionManager, String, String, CraftAROnDeviceCollectionManager$AddCollectionListener)>
	//    9   15:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//   10   18:pop             
	//   11   19:return          
	}

	public boolean clearCraftARMediaDirectory()
	{
		if(!mCollectionsDict.keys().hasNext())
	//*   0    0:aload_0         
	//*   1    1:getfield        #826 <Field JSONObject mCollectionsDict>
	//*   2    4:invokevirtual   #833 <Method Iterator JSONObject.keys()>
	//*   3    7:invokeinterface #838 <Method boolean Iterator.hasNext()>
	//*   4   12:ifne            41
		{
			File file = new File(mediaRoot);
	//    5   15:new             #127 <Class File>
	//    6   18:dup             
	//    7   19:aload_0         
	//    8   20:getfield        #125 <Field String mediaRoot>
	//    9   23:invokespecial   #130 <Method void File(String)>
	//   10   26:astore_1        
			try
			{
				deleteRecursive(file);
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:invokespecial   #694 <Method void deleteRecursive(File)>
			}
	//*  14   32:iconst_1        
	//*  15   33:ireturn         
			catch(Exception exception)
	//*  16   34:astore_1        
			{
				exception.printStackTrace();
	//   17   35:aload_1         
	//   18   36:invokevirtual   #432 <Method void Exception.printStackTrace()>
				return false;
	//   19   39:iconst_0        
	//   20   40:ireturn         
			}
			return true;
		} else
		{
			return false;
	//   21   41:iconst_0        
	//   22   42:ireturn         
		}
	}

	public void deleteCollection(final CraftAROnDeviceCollection collection, final DeleteCollectionListener listener)
	{
		if(collection == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       39
		{
			CraftARError craftarerror = new CraftARError(CraftARError.ERROR_CODES.COLLECTION_MANAGER_DELETE_ERROR, "Passed null collection.");
	//    2    4:new             #250 <Class CraftARError>
	//    3    7:dup             
	//    4    8:getstatic       #934 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_MANAGER_DELETE_ERROR>
	//    5   11:ldc2            #936 <String "Passed null collection.">
	//    6   14:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//    7   17:astore_3        
			if(listener != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          32
				listener.deleteCollectionFailed(craftarerror);
	//   10   22:aload_2         
	//   11   23:aload_3         
	//   12   24:invokeinterface #939 <Method void CraftAROnDeviceCollectionManager$DeleteCollectionListener.deleteCollectionFailed(CraftARError)>
			else
	//*  13   29:goto            39
				CLog.e(craftarerror.getErrorMessage());
	//   14   32:aload_3         
	//   15   33:invokevirtual   #268 <Method String CraftARError.getErrorMessage()>
	//   16   36:invokestatic    #248 <Method void CLog.e(String)>
		}
		mHandler.post(new Runnable() {

			public void run()
			{
				deleteCollectionInternal(collection.getUUID());
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field CraftAROnDeviceCollectionManager this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #25  <Field CraftAROnDeviceCollection val$collection>
			//    4    8:invokevirtual   #38  <Method String CraftAROnDeviceCollection.getUUID()>
			//    5   11:invokestatic    #42  <Method void CraftAROnDeviceCollectionManager.access$100(CraftAROnDeviceCollectionManager, String)>
				if(listener != null)
			//*   6   14:aload_0         
			//*   7   15:getfield        #27  <Field CraftAROnDeviceCollectionManager$DeleteCollectionListener val$listener>
			//*   8   18:ifnull          40
					mResponseHandlerThread.post(new Runnable() {

						public void run()
						{
							listener.collectionDeleted();
						//    0    0:aload_0         
						//    1    1:getfield        #17  <Field CraftAROnDeviceCollectionManager$4 this$1>
						//    2    4:getfield        #24  <Field CraftAROnDeviceCollectionManager$DeleteCollectionListener CraftAROnDeviceCollectionManager$4.val$listener>
						//    3    7:invokeinterface #29  <Method void CraftAROnDeviceCollectionManager$DeleteCollectionListener.collectionDeleted()>
						//    4   12:return          
						}

						final _cls4 this$1;

			
			{
				this$1 = _cls4.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CraftAROnDeviceCollectionManager$4 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
					}
);
			//    9   21:aload_0         
			//   10   22:getfield        #23  <Field CraftAROnDeviceCollectionManager this$0>
			//   11   25:getfield        #46  <Field Handler CraftAROnDeviceCollectionManager.mResponseHandlerThread>
			//   12   28:new             #13  <Class CraftAROnDeviceCollectionManager$4$1>
			//   13   31:dup             
			//   14   32:aload_0         
			//   15   33:invokespecial   #49  <Method void CraftAROnDeviceCollectionManager$4$1(CraftAROnDeviceCollectionManager$4)>
			//   16   36:invokevirtual   #55  <Method boolean Handler.post(Runnable)>
			//   17   39:pop             
			//   18   40:return          
			}

			final CraftAROnDeviceCollectionManager this$0;
			final CraftAROnDeviceCollection val$collection;
			final DeleteCollectionListener val$listener;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CraftAROnDeviceCollectionManager this$0>
				collection = craftarondevicecollection;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field CraftAROnDeviceCollection val$collection>
				listener = deletecollectionlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field CraftAROnDeviceCollectionManager$DeleteCollectionListener val$listener>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   17   39:aload_0         
	//   18   40:getfield        #219 <Field Handler mHandler>
	//   19   43:new             #30  <Class CraftAROnDeviceCollectionManager$4>
	//   20   46:dup             
	//   21   47:aload_0         
	//   22   48:aload_1         
	//   23   49:aload_2         
	//   24   50:invokespecial   #942 <Method void CraftAROnDeviceCollectionManager$4(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollection, CraftAROnDeviceCollectionManager$DeleteCollectionListener)>
	//   25   53:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//   26   56:pop             
	//   27   57:return          
	}

	public void deleteCollection(String s, DeleteCollectionListener deletecollectionlistener)
	{
		deleteCollection(s, ((String) (null)), deletecollectionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokevirtual   #946 <Method void deleteCollection(String, String, CraftAROnDeviceCollectionManager$DeleteCollectionListener)>
	//    5    7:return          
	}

	public void deleteCollection(String s, String s1, final DeleteCollectionListener listener)
	{
		s = ((String) (get(s, s1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #950 <Method CraftAROnDeviceCollection get(String, String)>
	//    4    6:astore_1        
		if(s != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          18
		{
			deleteCollection(((CraftAROnDeviceCollection) (s)), listener);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_3         
	//   10   14:invokevirtual   #952 <Method void deleteCollection(CraftAROnDeviceCollection, CraftAROnDeviceCollectionManager$DeleteCollectionListener)>
			return;
	//   11   17:return          
		} else
		{
			mResponseHandlerThread.post(new Runnable() {

				public void run()
				{
					CraftARError craftarerror = new CraftARError(CraftARError.ERROR_CODES.COLLECTION_MANAGER_DELETE_ERROR, "Collection not found");
				//    0    0:new             #28  <Class CraftARError>
				//    1    3:dup             
				//    2    4:getstatic       #34  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_MANAGER_DELETE_ERROR>
				//    3    7:ldc1            #36  <String "Collection not found">
				//    4    9:invokespecial   #39  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
				//    5   12:astore_1        
					DeleteCollectionListener deletecollectionlistener = listener;
				//    6   13:aload_0         
				//    7   14:getfield        #21  <Field CraftAROnDeviceCollectionManager$DeleteCollectionListener val$listener>
				//    8   17:astore_2        
					if(deletecollectionlistener != null)
				//*   9   18:aload_2         
				//*  10   19:ifnull          30
					{
						deletecollectionlistener.deleteCollectionFailed(craftarerror);
				//   11   22:aload_2         
				//   12   23:aload_1         
				//   13   24:invokeinterface #45  <Method void CraftAROnDeviceCollectionManager$DeleteCollectionListener.deleteCollectionFailed(CraftARError)>
						return;
				//   14   29:return          
					} else
					{
						CLog.e(craftarerror.getErrorMessage());
				//   15   30:aload_1         
				//   16   31:invokevirtual   #49  <Method String CraftARError.getErrorMessage()>
				//   17   34:invokestatic    #55  <Method void CLog.e(String)>
						return;
				//   18   37:return          
					}
				}

				final CraftAROnDeviceCollectionManager this$0;
				final DeleteCollectionListener val$listener;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CraftAROnDeviceCollectionManager this$0>
				listener = deletecollectionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CraftAROnDeviceCollectionManager$DeleteCollectionListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   12   18:aload_0         
	//   13   19:getfield        #101 <Field Handler mResponseHandlerThread>
	//   14   22:new             #28  <Class CraftAROnDeviceCollectionManager$3>
	//   15   25:dup             
	//   16   26:aload_0         
	//   17   27:aload_3         
	//   18   28:invokespecial   #955 <Method void CraftAROnDeviceCollectionManager$3(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollectionManager$DeleteCollectionListener)>
	//   19   31:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//   20   34:pop             
			return;
	//   21   35:return          
		}
	}

	public CraftAROnDeviceCollection get(String s)
	{
		return get(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #950 <Method CraftAROnDeviceCollection get(String, String)>
	//    4    6:areturn         
	}

	public CraftAROnDeviceCollection get(String s, String s1)
	{
		Object obj;
		obj = ((Object) (s));
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(s1 != null)
	//*   2    2:aload_2         
	//*   3    3:ifnull          63
		{
			obj = ((Object) (s));
	//    4    6:aload_1         
	//    5    7:astore_3        
			if(!s1.equals(""))
	//*   6    8:aload_2         
	//*   7    9:ldc2            #294 <String "">
	//*   8   12:invokevirtual   #300 <Method boolean String.equals(Object)>
	//*   9   15:ifne            63
			{
				obj = ((Object) (s));
	//   10   18:aload_1         
	//   11   19:astore_3        
				if(!s1.equals("default"))
	//*  12   20:aload_2         
	//*  13   21:ldc2            #439 <String "default">
	//*  14   24:invokevirtual   #300 <Method boolean String.equals(Object)>
	//*  15   27:ifne            63
				{
					obj = ((Object) (new StringBuilder()));
	//   16   30:new             #227 <Class StringBuilder>
	//   17   33:dup             
	//   18   34:invokespecial   #228 <Method void StringBuilder()>
	//   19   37:astore_3        
					((StringBuilder) (obj)).append(s);
	//   20   38:aload_3         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
					((StringBuilder) (obj)).append("-");
	//   24   44:aload_3         
	//   25   45:ldc2            #614 <String "-">
	//   26   48:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
					((StringBuilder) (obj)).append(s1);
	//   28   52:aload_3         
	//   29   53:aload_2         
	//   30   54:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   31   57:pop             
					obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   32   58:aload_3         
	//   33   59:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   34   62:astore_3        
				}
			}
		}
		if(!mCollectionsDict.has(((String) (obj))))
			break MISSING_BLOCK_LABEL_126;
	//   35   63:aload_0         
	//   36   64:getfield        #826 <Field JSONObject mCollectionsDict>
	//   37   67:aload_3         
	//   38   68:invokevirtual   #958 <Method boolean JSONObject.has(String)>
	//   39   71:ifeq            126
		s = ((String) (getWithUUID(mCollectionsDict.getString(((String) (obj))))));
	//   40   74:aload_0         
	//   41   75:aload_0         
	//   42   76:getfield        #826 <Field JSONObject mCollectionsDict>
	//   43   79:aload_3         
	//   44   80:invokevirtual   #392 <Method String JSONObject.getString(String)>
	//   45   83:invokespecial   #960 <Method CraftAROnDeviceCollection getWithUUID(String)>
	//   46   86:astore_1        
		return ((CraftAROnDeviceCollection) (s));
	//   47   87:aload_1         
	//   48   88:areturn         
		s;
	//   49   89:astore_1        
		s1 = ((String) (new StringBuilder()));
	//   50   90:new             #227 <Class StringBuilder>
	//   51   93:dup             
	//   52   94:invokespecial   #228 <Method void StringBuilder()>
	//   53   97:astore_2        
		((StringBuilder) (s1)).append("Could not read collection: ");
	//   54   98:aload_2         
	//   55   99:ldc2            #813 <String "Could not read collection: ">
	//   56  102:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   57  105:pop             
		((StringBuilder) (s1)).append(((Exception) (s)).getLocalizedMessage());
	//   58  106:aload_2         
	//   59  107:aload_1         
	//   60  108:invokevirtual   #435 <Method String Exception.getLocalizedMessage()>
	//   61  111:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   62  114:pop             
		CLog.e(((StringBuilder) (s1)).toString());
	//   63  115:aload_2         
	//   64  116:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   65  119:invokestatic    #248 <Method void CLog.e(String)>
		((Exception) (s)).printStackTrace();
	//   66  122:aload_1         
	//   67  123:invokevirtual   #432 <Method void Exception.printStackTrace()>
		return null;
	//   68  126:aconst_null     
	//   69  127:areturn         
	}

	public Set listCollections()
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #964 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #965 <Method void HashSet()>
	//    3    7:astore_1        
		for(Iterator iterator = mCollectionsDict.keys(); iterator.hasNext();)
	//*   4    8:aload_0         
	//*   5    9:getfield        #826 <Field JSONObject mCollectionsDict>
	//*   6   12:invokevirtual   #833 <Method Iterator JSONObject.keys()>
	//*   7   15:astore_2        
	//*   8   16:aload_2         
	//*   9   17:invokeinterface #838 <Method boolean Iterator.hasNext()>
	//*  10   22:ifeq            57
			try
			{
				hashset.add(((Object) (mCollectionsDict.getString((String)iterator.next()))));
	//   11   25:aload_1         
	//   12   26:aload_0         
	//   13   27:getfield        #826 <Field JSONObject mCollectionsDict>
	//   14   30:aload_2         
	//   15   31:invokeinterface #841 <Method Object Iterator.next()>
	//   16   36:checkcast       #296 <Class String>
	//   17   39:invokevirtual   #392 <Method String JSONObject.getString(String)>
	//   18   42:invokevirtual   #968 <Method boolean HashSet.add(Object)>
	//   19   45:pop             
			}
	//*  20   46:goto            16
			catch(JSONException jsonexception)
	//*  21   49:astore_3        
			{
				jsonexception.printStackTrace();
	//   22   50:aload_3         
	//   23   51:invokevirtual   #771 <Method void JSONException.printStackTrace()>
			}

	//*  24   54:goto            16
		return ((Set) (hashset));
	//   25   57:aload_1         
	//   26   58:areturn         
	}

	void setInternalCollectionEventsHandler(CraftARInternalInterfaces.CollectionEventsHandler collectioneventshandler)
	{
		mInternalCollectionEventsHandler = collectioneventshandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #783 <Field CraftARInternalInterfaces$CollectionEventsHandler mInternalCollectionEventsHandler>
	//    3    5:return          
	}

	public void setSyncURL(String s)
	{
		SYNC_URL = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #99  <Field String SYNC_URL>
	//    3    5:return          
	}

	public void syncCollection(CraftAROnDeviceCollection craftarondevicecollection, SyncCollectionListener synccollectionlistener)
	{
		if(craftarondevicecollection == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       39
		{
			CraftARError craftarerror = new CraftARError(CraftARError.ERROR_CODES.COLLECTION_INVALID, "Received collection is null");
	//    2    4:new             #250 <Class CraftARError>
	//    3    7:dup             
	//    4    8:getstatic       #607 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_INVALID>
	//    5   11:ldc2            #977 <String "Received collection is null">
	//    6   14:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//    7   17:astore_3        
			if(synccollectionlistener != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          31
			{
				synccollectionlistener.syncFailed(craftarondevicecollection, craftarerror);
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:aload_3         
	//   13   25:invokeinterface #981 <Method void CraftAROnDeviceCollectionManager$SyncCollectionListener.syncFailed(CraftAROnDeviceCollection, CraftARError)>
				return;
	//   14   30:return          
			} else
			{
				CLog.e(craftarerror.getErrorMessage());
	//   15   31:aload_3         
	//   16   32:invokevirtual   #268 <Method String CraftARError.getErrorMessage()>
	//   17   35:invokestatic    #248 <Method void CLog.e(String)>
				return;
	//   18   38:return          
			}
		}
		if(craftarondevicecollection.getTokens() != null && craftarondevicecollection.getTokens().size() != 0)
	//*  19   39:aload_1         
	//*  20   40:invokevirtual   #866 <Method ArrayList CraftAROnDeviceCollection.getTokens()>
	//*  21   43:ifnull          77
	//*  22   46:aload_1         
	//*  23   47:invokevirtual   #866 <Method ArrayList CraftAROnDeviceCollection.getTokens()>
	//*  24   50:invokevirtual   #764 <Method int ArrayList.size()>
	//*  25   53:ifne            59
	//*  26   56:goto            77
		{
			syncCollection(craftarondevicecollection, (String)craftarondevicecollection.getTokens().get(0), synccollectionlistener);
	//   27   59:aload_0         
	//   28   60:aload_1         
	//   29   61:aload_1         
	//   30   62:invokevirtual   #866 <Method ArrayList CraftAROnDeviceCollection.getTokens()>
	//   31   65:iconst_0        
	//   32   66:invokevirtual   #984 <Method Object ArrayList.get(int)>
	//   33   69:checkcast       #296 <Class String>
	//   34   72:aload_2         
	//   35   73:invokevirtual   #986 <Method void syncCollection(CraftAROnDeviceCollection, String, CraftAROnDeviceCollectionManager$SyncCollectionListener)>
			return;
	//   36   76:return          
		}
		CraftARError craftarerror1 = new CraftARError(CraftARError.ERROR_CODES.COLLECTION_INVALID, "Collection has no tokens");
	//   37   77:new             #250 <Class CraftARError>
	//   38   80:dup             
	//   39   81:getstatic       #607 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_INVALID>
	//   40   84:ldc2            #988 <String "Collection has no tokens">
	//   41   87:invokespecial   #261 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   42   90:astore_3        
		if(synccollectionlistener != null)
	//*  43   91:aload_2         
	//*  44   92:ifnull          104
		{
			synccollectionlistener.syncFailed(craftarondevicecollection, craftarerror1);
	//   45   95:aload_2         
	//   46   96:aload_1         
	//   47   97:aload_3         
	//   48   98:invokeinterface #981 <Method void CraftAROnDeviceCollectionManager$SyncCollectionListener.syncFailed(CraftAROnDeviceCollection, CraftARError)>
			return;
	//   49  103:return          
		} else
		{
			CLog.e(craftarerror1.getErrorMessage());
	//   50  104:aload_3         
	//   51  105:invokevirtual   #268 <Method String CraftARError.getErrorMessage()>
	//   52  108:invokestatic    #248 <Method void CLog.e(String)>
			return;
	//   53  111:return          
		}
	}

	public void syncCollection(final CraftAROnDeviceCollection collection, final String token, final SyncCollectionListener listener)
	{
		mHandler.post(new Runnable() {

			public void run()
			{
				syncCollectionInternal(collection, token, listener);
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field CraftAROnDeviceCollectionManager this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #25  <Field CraftAROnDeviceCollection val$collection>
			//    4    8:aload_0         
			//    5    9:getfield        #27  <Field String val$token>
			//    6   12:aload_0         
			//    7   13:getfield        #29  <Field CraftAROnDeviceCollectionManager$SyncCollectionListener val$listener>
			//    8   16:invokestatic    #37  <Method void CraftAROnDeviceCollectionManager.access$000(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollection, String, CraftAROnDeviceCollectionManager$SyncCollectionListener)>
			//    9   19:return          
			}

			final CraftAROnDeviceCollectionManager this$0;
			final CraftAROnDeviceCollection val$collection;
			final SyncCollectionListener val$listener;
			final String val$token;

			
			{
				this$0 = CraftAROnDeviceCollectionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CraftAROnDeviceCollectionManager this$0>
				collection = craftarondevicecollection;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field CraftAROnDeviceCollection val$collection>
				token = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field String val$token>
				listener = synccollectionlistener;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field CraftAROnDeviceCollectionManager$SyncCollectionListener val$listener>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #219 <Field Handler mHandler>
	//    2    4:new             #6   <Class CraftAROnDeviceCollectionManager$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #990 <Method void CraftAROnDeviceCollectionManager$1(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollection, String, CraftAROnDeviceCollectionManager$SyncCollectionListener)>
	//    9   15:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//   10   18:pop             
	//   11   19:return          
	}

	static final String REQUEST_PARAM_APP_ID = "app_id";
	static final String REQUEST_PARAM_BUNDLED = "bundled";
	static final String REQUEST_PARAM_SDK_VERSION = "version";
	static final String REQUEST_PARAM_TAG = "tag";
	static final String REQUEST_PARAM_TOKEN = "token";
	private static CraftAROnDeviceCollectionManager self;
	String SYNC_URL;
	String collectionBundlesRoot;
	String collectionsRoot;
	JSONObject mCollectionsDict;
	private Context mContext;
	private Handler mHandler;
	private CraftARInternalInterfaces.CollectionEventsHandler mInternalCollectionEventsHandler;
	Handler mResponseHandlerThread;
	private ManagerHandlerThread managerHandlerThread;
	String mediaRoot;


/*
	static void access$000(CraftAROnDeviceCollectionManager craftarondevicecollectionmanager, CraftAROnDeviceCollection craftarondevicecollection, String s, SyncCollectionListener synccollectionlistener)
	{
		craftarondevicecollectionmanager.syncCollectionInternal(craftarondevicecollection, s, synccollectionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #188 <Method void syncCollectionInternal(CraftAROnDeviceCollection, String, CraftAROnDeviceCollectionManager$SyncCollectionListener)>
		return;
	//    5    7:return          
	}

*/


/*
	static void access$100(CraftAROnDeviceCollectionManager craftarondevicecollectionmanager, String s)
	{
		craftarondevicecollectionmanager.deleteCollectionInternal(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #192 <Method void deleteCollectionInternal(String)>
		return;
	//    3    5:return          
	}

*/


/*
	static CraftAROnDeviceCollection access$200(CraftAROnDeviceCollectionManager craftarondevicecollectionmanager, File file, AddCollectionListener addcollectionlistener)
	{
		return craftarondevicecollectionmanager.addInternal(file, addcollectionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #198 <Method CraftAROnDeviceCollection addInternal(File, CraftAROnDeviceCollectionManager$AddCollectionListener)>
	//    4    6:areturn         
	}

*/


/*
	static void access$300(CraftAROnDeviceCollectionManager craftarondevicecollectionmanager, CraftAROnDeviceCollection craftarondevicecollection, AddCollectionListener addcollectionlistener)
	{
		craftarondevicecollectionmanager.notifyAddCollectionFinished(craftarondevicecollection, addcollectionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #204 <Method void notifyAddCollectionFinished(CraftAROnDeviceCollection, CraftAROnDeviceCollectionManager$AddCollectionListener)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$400(CraftAROnDeviceCollectionManager craftarondevicecollectionmanager, String s, String s1, AddCollectionListener addcollectionlistener)
	{
		craftarondevicecollectionmanager.addCollectionWithTokenInternal(s, s1, addcollectionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #210 <Method void addCollectionWithTokenInternal(String, String, CraftAROnDeviceCollectionManager$AddCollectionListener)>
		return;
	//    5    7:return          
	}

*/


/*
	static CraftAROnDeviceCollection access$500(CraftAROnDeviceCollectionManager craftarondevicecollectionmanager, String s, AddCollectionListener addcollectionlistener)
	{
		return craftarondevicecollectionmanager.addInternal(s, addcollectionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #215 <Method CraftAROnDeviceCollection addInternal(String, CraftAROnDeviceCollectionManager$AddCollectionListener)>
	//    4    6:areturn         
	}

*/


/*
	static Handler access$602(CraftAROnDeviceCollectionManager craftarondevicecollectionmanager, Handler handler)
	{
		craftarondevicecollectionmanager.mHandler = handler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #219 <Field Handler mHandler>
		return handler;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
