// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.core:
//			UserMetaData

class MetaDataStore
{

	public MetaDataStore(File file)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		filesDir = file;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field File filesDir>
	//    5    9:return          
	}

	private File getKeysFileForSession(String s)
	{
		File file = filesDir;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field File filesDir>
	//    2    4:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #32  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append(s);
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   10   18:pop             
		stringbuilder.append("keys");
	//   11   19:aload_3         
	//   12   20:ldc1            #39  <String "keys">
	//   13   22:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
		stringbuilder.append(".meta");
	//   15   26:aload_3         
	//   16   27:ldc1            #41  <String ".meta">
	//   17   29:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
		return new File(file, stringbuilder.toString());
	//   19   33:new             #43  <Class File>
	//   20   36:dup             
	//   21   37:aload_2         
	//   22   38:aload_3         
	//   23   39:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   24   42:invokespecial   #50  <Method void File(File, String)>
	//   25   45:areturn         
	}

	private File getUserDataFileForSession(String s)
	{
		File file = filesDir;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field File filesDir>
	//    2    4:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #32  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append(s);
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   10   18:pop             
		stringbuilder.append("user");
	//   11   19:aload_3         
	//   12   20:ldc1            #53  <String "user">
	//   13   22:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
		stringbuilder.append(".meta");
	//   15   26:aload_3         
	//   16   27:ldc1            #41  <String ".meta">
	//   17   29:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
		return new File(file, stringbuilder.toString());
	//   19   33:new             #43  <Class File>
	//   20   36:dup             
	//   21   37:aload_2         
	//   22   38:aload_3         
	//   23   39:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   24   42:invokespecial   #50  <Method void File(File, String)>
	//   25   45:areturn         
	}

	private static Map jsonToKeysData(String s)
		throws JSONException
	{
		s = ((String) (JSONObjectInstrumentation.init(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #63  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//    2    4:astore_0        
		HashMap hashmap = new HashMap();
	//    3    5:new             #65  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #66  <Method void HashMap()>
	//    6   12:astore_1        
		String s1;
		for(Iterator iterator = ((JSONObject) (s)).keys(); iterator.hasNext(); ((Map) (hashmap)).put(((Object) (s1)), ((Object) (valueOrNull(((JSONObject) (s)), s1)))))
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #71  <Method Iterator JSONObject.keys()>
	//*   9   17:astore_2        
	//*  10   18:aload_2         
	//*  11   19:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//*  12   24:ifeq            53
			s1 = (String)iterator.next();
	//   13   27:aload_2         
	//   14   28:invokeinterface #81  <Method Object Iterator.next()>
	//   15   33:checkcast       #83  <Class String>
	//   16   36:astore_3        

	//   17   37:aload_1         
	//   18   38:aload_3         
	//   19   39:aload_0         
	//   20   40:aload_3         
	//   21   41:invokestatic    #87  <Method String valueOrNull(JSONObject, String)>
	//   22   44:invokeinterface #93  <Method Object Map.put(Object, Object)>
	//   23   49:pop             
	//*  24   50:goto            18
		return ((Map) (hashmap));
	//   25   53:aload_1         
	//   26   54:areturn         
	}

	private static UserMetaData jsonToUserData(String s)
		throws JSONException
	{
		s = ((String) (JSONObjectInstrumentation.init(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #63  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//    2    4:astore_0        
		return new UserMetaData(valueOrNull(((JSONObject) (s)), "userId"), valueOrNull(((JSONObject) (s)), "userName"), valueOrNull(((JSONObject) (s)), "userEmail"));
	//    3    5:new             #100 <Class UserMetaData>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:ldc1            #102 <String "userId">
	//    7   12:invokestatic    #87  <Method String valueOrNull(JSONObject, String)>
	//    8   15:aload_0         
	//    9   16:ldc1            #104 <String "userName">
	//   10   18:invokestatic    #87  <Method String valueOrNull(JSONObject, String)>
	//   11   21:aload_0         
	//   12   22:ldc1            #106 <String "userEmail">
	//   13   24:invokestatic    #87  <Method String valueOrNull(JSONObject, String)>
	//   14   27:invokespecial   #109 <Method void UserMetaData(String, String, String)>
	//   15   30:areturn         
	}

	private static String valueOrNull(JSONObject jsonobject, String s)
	{
		boolean flag = jsonobject.isNull(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #113 <Method boolean JSONObject.isNull(String)>
	//    3    5:istore_2        
		String s1 = null;
	//    4    6:aconst_null     
	//    5    7:astore_3        
		if(!flag)
	//*   6    8:iload_2         
	//*   7    9:ifne            19
			s1 = jsonobject.optString(s, ((String) (null)));
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:aconst_null     
	//   11   15:invokevirtual   #117 <Method String JSONObject.optString(String, String)>
	//   12   18:astore_3        
		return s1;
	//   13   19:aload_3         
	//   14   20:areturn         
	}

	public Map readKeyData(String s)
	{
		Object obj;
		Object obj2;
		obj = ((Object) (getKeysFileForSession(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #122 <Method File getKeysFileForSession(String)>
	//    3    5:astore_2        
		if(!((File) (obj)).exists())
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #125 <Method boolean File.exists()>
	//*   6   10:ifne            17
			return Collections.emptyMap();
	//    7   13:invokestatic    #131 <Method Map Collections.emptyMap()>
	//    8   16:areturn         
		obj2 = null;
	//    9   17:aconst_null     
	//   10   18:astore          4
		s = null;
	//   11   20:aconst_null     
	//   12   21:astore_1        
		obj = ((Object) (new FileInputStream(((File) (obj)))));
	//   13   22:new             #133 <Class FileInputStream>
	//   14   25:dup             
	//   15   26:aload_2         
	//   16   27:invokespecial   #135 <Method void FileInputStream(File)>
	//   17   30:astore_2        
		s = ((String) (jsonToKeysData(CommonUtils.streamToString(((java.io.InputStream) (obj))))));
	//   18   31:aload_2         
	//   19   32:invokestatic    #141 <Method String CommonUtils.streamToString(java.io.InputStream)>
	//   20   35:invokestatic    #143 <Method Map jsonToKeysData(String)>
	//   21   38:astore_1        
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close user metadata file.");
	//   22   39:aload_2         
	//   23   40:ldc1            #145 <String "Failed to close user metadata file.">
	//   24   42:invokestatic    #149 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return ((Map) (s));
	//   25   45:aload_1         
	//   26   46:areturn         
		Object obj1;
		obj1;
	//   27   47:astore_3        
		s = ((String) (obj));
	//   28   48:aload_2         
	//   29   49:astore_1        
		obj = obj1;
	//   30   50:aload_3         
	//   31   51:astore_2        
		break MISSING_BLOCK_LABEL_92;
	//   32   52:goto            92
		obj1;
	//   33   55:astore_3        
		break MISSING_BLOCK_LABEL_67;
	//   34   56:goto            67
		obj;
	//   35   59:astore_2        
		break MISSING_BLOCK_LABEL_92;
	//   36   60:goto            92
		obj1;
	//   37   63:astore_3        
		obj = ((Object) (obj2));
	//   38   64:aload           4
	//   39   66:astore_2        
		s = ((String) (obj));
	//   40   67:aload_2         
	//   41   68:astore_1        
		Fabric.getLogger().e("CrashlyticsCore", "Error deserializing user metadata.", ((Throwable) (obj1)));
	//   42   69:invokestatic    #155 <Method Logger Fabric.getLogger()>
	//   43   72:ldc1            #157 <String "CrashlyticsCore">
	//   44   74:ldc1            #159 <String "Error deserializing user metadata.">
	//   45   76:aload_3         
	//   46   77:invokeinterface #165 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close user metadata file.");
	//   47   82:aload_2         
	//   48   83:ldc1            #145 <String "Failed to close user metadata file.">
	//   49   85:invokestatic    #149 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return Collections.emptyMap();
	//   50   88:invokestatic    #131 <Method Map Collections.emptyMap()>
	//   51   91:areturn         
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), "Failed to close user metadata file.");
	//   52   92:aload_1         
	//   53   93:ldc1            #145 <String "Failed to close user metadata file.">
	//   54   95:invokestatic    #149 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw obj;
	//   55   98:aload_2         
	//   56   99:athrow          
	}

	public UserMetaData readUserData(String s)
	{
		Object obj;
		Object obj2;
		obj = ((Object) (getUserDataFileForSession(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #168 <Method File getUserDataFileForSession(String)>
	//    3    5:astore_2        
		if(!((File) (obj)).exists())
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #125 <Method boolean File.exists()>
	//*   6   10:ifne            17
			return UserMetaData.EMPTY;
	//    7   13:getstatic       #172 <Field UserMetaData UserMetaData.EMPTY>
	//    8   16:areturn         
		obj2 = null;
	//    9   17:aconst_null     
	//   10   18:astore          4
		s = null;
	//   11   20:aconst_null     
	//   12   21:astore_1        
		obj = ((Object) (new FileInputStream(((File) (obj)))));
	//   13   22:new             #133 <Class FileInputStream>
	//   14   25:dup             
	//   15   26:aload_2         
	//   16   27:invokespecial   #135 <Method void FileInputStream(File)>
	//   17   30:astore_2        
		s = ((String) (jsonToUserData(CommonUtils.streamToString(((java.io.InputStream) (obj))))));
	//   18   31:aload_2         
	//   19   32:invokestatic    #141 <Method String CommonUtils.streamToString(java.io.InputStream)>
	//   20   35:invokestatic    #174 <Method UserMetaData jsonToUserData(String)>
	//   21   38:astore_1        
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close user metadata file.");
	//   22   39:aload_2         
	//   23   40:ldc1            #145 <String "Failed to close user metadata file.">
	//   24   42:invokestatic    #149 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return ((UserMetaData) (s));
	//   25   45:aload_1         
	//   26   46:areturn         
		Object obj1;
		obj1;
	//   27   47:astore_3        
		s = ((String) (obj));
	//   28   48:aload_2         
	//   29   49:astore_1        
		obj = obj1;
	//   30   50:aload_3         
	//   31   51:astore_2        
		break MISSING_BLOCK_LABEL_92;
	//   32   52:goto            92
		obj1;
	//   33   55:astore_3        
		break MISSING_BLOCK_LABEL_67;
	//   34   56:goto            67
		obj;
	//   35   59:astore_2        
		break MISSING_BLOCK_LABEL_92;
	//   36   60:goto            92
		obj1;
	//   37   63:astore_3        
		obj = ((Object) (obj2));
	//   38   64:aload           4
	//   39   66:astore_2        
		s = ((String) (obj));
	//   40   67:aload_2         
	//   41   68:astore_1        
		Fabric.getLogger().e("CrashlyticsCore", "Error deserializing user metadata.", ((Throwable) (obj1)));
	//   42   69:invokestatic    #155 <Method Logger Fabric.getLogger()>
	//   43   72:ldc1            #157 <String "CrashlyticsCore">
	//   44   74:ldc1            #159 <String "Error deserializing user metadata.">
	//   45   76:aload_3         
	//   46   77:invokeinterface #165 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close user metadata file.");
	//   47   82:aload_2         
	//   48   83:ldc1            #145 <String "Failed to close user metadata file.">
	//   49   85:invokestatic    #149 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return UserMetaData.EMPTY;
	//   50   88:getstatic       #172 <Field UserMetaData UserMetaData.EMPTY>
	//   51   91:areturn         
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), "Failed to close user metadata file.");
	//   52   92:aload_1         
	//   53   93:ldc1            #145 <String "Failed to close user metadata file.">
	//   54   95:invokestatic    #149 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw obj;
	//   55   98:aload_2         
	//   56   99:athrow          
	}

	private static final Charset UTF_8 = Charset.forName("UTF-8");
	private final File filesDir;

	static 
	{
	//    0    0:ldc1            #13  <String "UTF-8">
	//    1    2:invokestatic    #19  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #21  <Field Charset UTF_8>
	//*   3    8:return          
	}
}
