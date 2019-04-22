// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.ndk;

import android.content.Context;
import com.crashlytics.android.core.internal.models.SessionEventData;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import java.io.*;

// Referenced classes of package com.crashlytics.android.ndk:
//			NdkKitController, JniNativeApi, TimeBasedCrashFileManager, JsonCrashDataParser, 
//			CrashFileManager, NativeApi, CrashlyticsNdk

class NdkKitControllerImpl
	implements NdkKitController
{

	NdkKitControllerImpl(NativeApi nativeapi, CrashFileManager crashfilemanager, JsonCrashDataParser jsoncrashdataparser)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		nativeApi = nativeapi;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field NativeApi nativeApi>
		crashFileManager = crashfilemanager;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field CrashFileManager crashFileManager>
		crashDataParser = jsoncrashdataparser;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field JsonCrashDataParser crashDataParser>
	//   11   19:return          
	}

	public static NdkKitController create(CrashlyticsNdk crashlyticsndk)
	{
		return ((NdkKitController) (new NdkKitControllerImpl(((NativeApi) (new JniNativeApi())), ((CrashFileManager) (new TimeBasedCrashFileManager(((io.fabric.sdk.android.services.persistence.FileStore) (new FileStoreImpl(((io.fabric.sdk.android.Kit) (crashlyticsndk)))))))), new JsonCrashDataParser())));
	//    0    0:new             #2   <Class NdkKitControllerImpl>
	//    1    3:dup             
	//    2    4:new             #30  <Class JniNativeApi>
	//    3    7:dup             
	//    4    8:invokespecial   #31  <Method void JniNativeApi()>
	//    5   11:new             #33  <Class TimeBasedCrashFileManager>
	//    6   14:dup             
	//    7   15:new             #35  <Class FileStoreImpl>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #38  <Method void FileStoreImpl(io.fabric.sdk.android.Kit)>
	//   11   23:invokespecial   #41  <Method void TimeBasedCrashFileManager(io.fabric.sdk.android.services.persistence.FileStore)>
	//   12   26:new             #43  <Class JsonCrashDataParser>
	//   13   29:dup             
	//   14   30:invokespecial   #44  <Method void JsonCrashDataParser()>
	//   15   33:invokespecial   #46  <Method void NdkKitControllerImpl(NativeApi, CrashFileManager, JsonCrashDataParser)>
	//   16   36:areturn         
	}

	private String readJsonCrashFile(File file)
	{
		Object obj1;
		Fabric.getLogger().d("CrashlyticsNdk", "Reading NDK crash data...");
	//    0    0:invokestatic    #56  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #58  <String "CrashlyticsNdk">
	//    2    5:ldc1            #60  <String "Reading NDK crash data...">
	//    3    7:invokeinterface #66  <Method void Logger.d(String, String)>
		obj1 = null;
	//    4   12:aconst_null     
	//    5   13:astore          4
		file = ((File) (new FileInputStream(file)));
	//    6   15:new             #68  <Class FileInputStream>
	//    7   18:dup             
	//    8   19:aload_1         
	//    9   20:invokespecial   #71  <Method void FileInputStream(File)>
	//   10   23:astore_1        
		Object obj = ((Object) (file));
	//   11   24:aload_1         
	//   12   25:astore_2        
		String s = CommonUtils.streamToString(((java.io.InputStream) (file)));
	//   13   26:aload_1         
	//   14   27:invokestatic    #77  <Method String CommonUtils.streamToString(java.io.InputStream)>
	//   15   30:astore_3        
		obj = ((Object) (s));
	//   16   31:aload_3         
	//   17   32:astore_2        
_L2:
		CommonUtils.closeOrLog(((java.io.Closeable) (file)), "Error closing crash data file.");
	//   18   33:aload_1         
	//   19   34:ldc1            #79  <String "Error closing crash data file.">
	//   20   36:invokestatic    #83  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return ((String) (obj));
	//   21   39:aload_2         
	//   22   40:areturn         
		Exception exception;
		exception;
	//   23   41:astore_3        
		break MISSING_BLOCK_LABEL_54;
	//   24   42:goto            54
		file;
	//   25   45:astore_1        
		obj = null;
	//   26   46:aconst_null     
	//   27   47:astore_2        
		break; /* Loop/switch isn't completed */
	//   28   48:goto            76
		exception;
	//   29   51:astore_3        
		file = null;
	//   30   52:aconst_null     
	//   31   53:astore_1        
		obj = ((Object) (file));
	//   32   54:aload_1         
	//   33   55:astore_2        
		Fabric.getLogger().e("CrashlyticsNdk", "Failed to read NDK crash data.", ((Throwable) (exception)));
	//   34   56:invokestatic    #56  <Method Logger Fabric.getLogger()>
	//   35   59:ldc1            #58  <String "CrashlyticsNdk">
	//   36   61:ldc1            #85  <String "Failed to read NDK crash data.">
	//   37   63:aload_3         
	//   38   64:invokeinterface #89  <Method void Logger.e(String, String, Throwable)>
		obj = ((Object) (obj1));
	//   39   69:aload           4
	//   40   71:astore_2        
		if(true) goto _L2; else goto _L1
	//   41   72:goto            33
		file;
	//   42   75:astore_1        
_L1:
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Error closing crash data file.");
	//   43   76:aload_2         
	//   44   77:ldc1            #79  <String "Error closing crash data file.">
	//   45   79:invokestatic    #83  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw file;
	//   46   82:aload_1         
	//   47   83:athrow          
	}

	public void clearCachedData()
	{
		crashFileManager.clearCrashFiles();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CrashFileManager crashFileManager>
	//    2    4:invokeinterface #95  <Method void CrashFileManager.clearCrashFiles()>
	//    3    9:return          
	}

	public SessionEventData getPreviousCrashData()
	{
		return lastCrashEventData;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field SessionEventData lastCrashEventData>
	//    2    4:areturn         
	}

	public boolean initialize(Context context)
	{
		boolean flag;
		try
		{
			String s = crashFileManager.getNewCrashFile().getCanonicalPath();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CrashFileManager crashFileManager>
	//    2    4:invokeinterface #107 <Method File CrashFileManager.getNewCrashFile()>
	//    3    9:invokevirtual   #113 <Method String File.getCanonicalPath()>
	//    4   12:astore_3        
			flag = nativeApi.initialize(s, context.getAssets());
	//    5   13:aload_0         
	//    6   14:getfield        #21  <Field NativeApi nativeApi>
	//    7   17:aload_3         
	//    8   18:aload_1         
	//    9   19:invokevirtual   #119 <Method android.content.res.AssetManager Context.getAssets()>
	//   10   22:invokeinterface #124 <Method boolean NativeApi.initialize(String, android.content.res.AssetManager)>
	//   11   27:istore_2        
		}
	//*  12   28:iload_2         
	//*  13   29:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  14   30:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsNdk", "Error initializing CrashlyticsNdk", ((Throwable) (context)));
	//   15   31:invokestatic    #56  <Method Logger Fabric.getLogger()>
	//   16   34:ldc1            #58  <String "CrashlyticsNdk">
	//   17   36:ldc1            #126 <String "Error initializing CrashlyticsNdk">
	//   18   38:aload_1         
	//   19   39:invokeinterface #89  <Method void Logger.e(String, String, Throwable)>
			return false;
	//   20   44:iconst_0        
	//   21   45:ireturn         
		}
		return flag;
	}

	public void loadPreviousCrashData()
	{
		Exception exception;
		Object obj = ((Object) (crashFileManager.getLastWrittenCrashFile()));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CrashFileManager crashFileManager>
	//    2    4:invokeinterface #130 <Method File CrashFileManager.getLastWrittenCrashFile()>
	//    3    9:astore_1        
		if(obj != null)
	//*   4   10:aload_1         
	//*   5   11:ifnull          71
		{
			if(!((File) (obj)).isFile())
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #134 <Method boolean File.isFile()>
	//*   8   18:ifne            22
				return;
	//    9   21:return          
			Fabric.getLogger().d("CrashlyticsNdk", "Found NDK crash file...");
	//   10   22:invokestatic    #56  <Method Logger Fabric.getLogger()>
	//   11   25:ldc1            #58  <String "CrashlyticsNdk">
	//   12   27:ldc1            #136 <String "Found NDK crash file...">
	//   13   29:invokeinterface #66  <Method void Logger.d(String, String)>
			obj = ((Object) (readJsonCrashFile(((File) (obj)))));
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:invokespecial   #138 <Method String readJsonCrashFile(File)>
	//   17   39:astore_1        
			if(obj == null)
	//*  18   40:aload_1         
	//*  19   41:ifnonnull       45
				return;
	//   20   44:return          
			try
			{
				lastCrashEventData = crashDataParser.parseCrashEventData(((String) (obj)));
	//   21   45:aload_0         
	//   22   46:aload_0         
	//   23   47:getfield        #25  <Field JsonCrashDataParser crashDataParser>
	//   24   50:aload_1         
	//   25   51:invokevirtual   #142 <Method SessionEventData JsonCrashDataParser.parseCrashEventData(String)>
	//   26   54:putfield        #99  <Field SessionEventData lastCrashEventData>
				return;
	//   27   57:return          
			}
	//*  28   58:invokestatic    #56  <Method Logger Fabric.getLogger()>
	//*  29   61:ldc1            #58  <String "CrashlyticsNdk">
	//*  30   63:ldc1            #144 <String "Crashlytics failed to parse prior crash data.">
	//*  31   65:invokeinterface #146 <Method void Logger.e(String, String)>
	//*  32   70:return          
	//*  33   71:return          
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				Fabric.getLogger().e("CrashlyticsNdk", "Crashlytics failed to parse prior crash data.");
			}
			return;
		} else
		{
			return;
		}
	//*  34   72:astore_1        
	//*  35   73:goto            58
	}

	private final JsonCrashDataParser crashDataParser;
	private final CrashFileManager crashFileManager;
	private SessionEventData lastCrashEventData;
	private final NativeApi nativeApi;
}
