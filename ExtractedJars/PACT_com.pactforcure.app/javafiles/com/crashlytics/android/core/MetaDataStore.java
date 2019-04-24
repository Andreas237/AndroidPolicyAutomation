// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.*;
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
	//    1    1:invokespecial   #46  <Method void Object()>
		filesDir = file;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #48  <Field File filesDir>
	//    5    9:return          
	}

	private File getKeysFileForSession(String s)
	{
		return new File(filesDir, (new StringBuilder()).append(s).append("keys").append(".meta").toString());
	//    0    0:new             #52  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field File filesDir>
	//    4    8:new             #54  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #55  <Method void StringBuilder()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:ldc1            #10  <String "keys">
	//   10   21:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:ldc1            #22  <String ".meta">
	//   12   26:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   14   32:invokespecial   #66  <Method void File(File, String)>
	//   15   35:areturn         
	}

	private File getUserDataFileForSession(String s)
	{
		return new File(filesDir, (new StringBuilder()).append(s).append("user").append(".meta").toString());
	//    0    0:new             #52  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field File filesDir>
	//    4    8:new             #54  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #55  <Method void StringBuilder()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:ldc1            #25  <String "user">
	//   10   21:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:ldc1            #22  <String ".meta">
	//   12   26:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   14   32:invokespecial   #66  <Method void File(File, String)>
	//   15   35:areturn         
	}

	private static Map jsonToKeysData(String s)
		throws JSONException
	{
		s = ((String) (new JSONObject(s)));
	//    0    0:new             #73  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #76  <Method void JSONObject(String)>
	//    4    8:astore_0        
		HashMap hashmap = new HashMap();
	//    5    9:new             #78  <Class HashMap>
	//    6   12:dup             
	//    7   13:invokespecial   #79  <Method void HashMap()>
	//    8   16:astore_1        
		String s1;
		for(Iterator iterator = ((JSONObject) (s)).keys(); iterator.hasNext(); ((Map) (hashmap)).put(((Object) (s1)), ((Object) (valueOrNull(((JSONObject) (s)), s1)))))
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #82  <Method Iterator JSONObject.keys()>
	//*  11   21:astore_2        
	//*  12   22:aload_2         
	//*  13   23:invokeinterface #88  <Method boolean Iterator.hasNext()>
	//*  14   28:ifeq            57
			s1 = (String)iterator.next();
	//   15   31:aload_2         
	//   16   32:invokeinterface #92  <Method Object Iterator.next()>
	//   17   37:checkcast       #94  <Class String>
	//   18   40:astore_3        

	//   19   41:aload_1         
	//   20   42:aload_3         
	//   21   43:aload_0         
	//   22   44:aload_3         
	//   23   45:invokestatic    #98  <Method String valueOrNull(JSONObject, String)>
	//   24   48:invokeinterface #104 <Method Object Map.put(Object, Object)>
	//   25   53:pop             
	//*  26   54:goto            22
		return ((Map) (hashmap));
	//   27   57:aload_1         
	//   28   58:areturn         
	}

	private static UserMetaData jsonToUserData(String s)
		throws JSONException
	{
		s = ((String) (new JSONObject(s)));
	//    0    0:new             #73  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #76  <Method void JSONObject(String)>
	//    4    8:astore_0        
		return new UserMetaData(valueOrNull(((JSONObject) (s)), "userId"), valueOrNull(((JSONObject) (s)), "userName"), valueOrNull(((JSONObject) (s)), "userEmail"));
	//    5    9:new             #111 <Class UserMetaData>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:ldc1            #16  <String "userId">
	//    9   16:invokestatic    #98  <Method String valueOrNull(JSONObject, String)>
	//   10   19:aload_0         
	//   11   20:ldc1            #19  <String "userName">
	//   12   22:invokestatic    #98  <Method String valueOrNull(JSONObject, String)>
	//   13   25:aload_0         
	//   14   26:ldc1            #13  <String "userEmail">
	//   15   28:invokestatic    #98  <Method String valueOrNull(JSONObject, String)>
	//   16   31:invokespecial   #114 <Method void UserMetaData(String, String, String)>
	//   17   34:areturn         
	}

	private static String keysDataToJson(Map map)
		throws JSONException
	{
		return (new JSONObject(map)).toString();
	//    0    0:new             #73  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #119 <Method void JSONObject(Map)>
	//    4    8:invokevirtual   #120 <Method String JSONObject.toString()>
	//    5   11:areturn         
	}

	private static String userDataToJson(UserMetaData usermetadata)
		throws JSONException
	{
		return ((_cls1) (new JSONObject(usermetadata) {

			final UserMetaData val$userData;

			
				throws JSONException
			{
				userData = usermetadata;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field UserMetaData val$userData>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void JSONObject()>
				put("userId", ((Object) (userData.id)));
			//    5    9:aload_0         
			//    6   10:ldc1            #22  <String "userId">
			//    7   12:aload_0         
			//    8   13:getfield        #17  <Field UserMetaData val$userData>
			//    9   16:getfield        #28  <Field String UserMetaData.id>
			//   10   19:invokevirtual   #32  <Method JSONObject put(String, Object)>
			//   11   22:pop             
				put("userName", ((Object) (userData.name)));
			//   12   23:aload_0         
			//   13   24:ldc1            #34  <String "userName">
			//   14   26:aload_0         
			//   15   27:getfield        #17  <Field UserMetaData val$userData>
			//   16   30:getfield        #37  <Field String UserMetaData.name>
			//   17   33:invokevirtual   #32  <Method JSONObject put(String, Object)>
			//   18   36:pop             
				put("userEmail", ((Object) (userData.email)));
			//   19   37:aload_0         
			//   20   38:ldc1            #39  <String "userEmail">
			//   21   40:aload_0         
			//   22   41:getfield        #17  <Field UserMetaData val$userData>
			//   23   44:getfield        #42  <Field String UserMetaData.email>
			//   24   47:invokevirtual   #32  <Method JSONObject put(String, Object)>
			//   25   50:pop             
			//   26   51:return          
			}
		}
)).toString();
	//    0    0:new             #6   <Class MetaDataStore$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #126 <Method void MetaDataStore$1(UserMetaData)>
	//    4    8:invokevirtual   #127 <Method String MetaDataStore$1.toString()>
	//    5   11:areturn         
	}

	private static String valueOrNull(JSONObject jsonobject, String s)
	{
		String s1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(!jsonobject.isNull(s))
	//*   2    2:aload_0         
	//*   3    3:aload_1         
	//*   4    4:invokevirtual   #131 <Method boolean JSONObject.isNull(String)>
	//*   5    7:ifne            17
			s1 = jsonobject.optString(s, ((String) (null)));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aconst_null     
	//    9   13:invokevirtual   #135 <Method String JSONObject.optString(String, String)>
	//   10   16:astore_2        
		return s1;
	//   11   17:aload_2         
	//   12   18:areturn         
	}

	public Map readKeyData(String s)
	{
		Object obj;
		Object obj1;
		obj = ((Object) (getKeysFileForSession(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #140 <Method File getKeysFileForSession(String)>
	//    3    5:astore_2        
		if(!((File) (obj)).exists())
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #143 <Method boolean File.exists()>
	//*   6   10:ifne            17
			return Collections.emptyMap();
	//    7   13:invokestatic    #149 <Method Map Collections.emptyMap()>
	//    8   16:areturn         
		s = null;
	//    9   17:aconst_null     
	//   10   18:astore_1        
		obj1 = null;
	//   11   19:aconst_null     
	//   12   20:astore_3        
		obj = ((Object) (new FileInputStream(((File) (obj)))));
	//   13   21:new             #151 <Class FileInputStream>
	//   14   24:dup             
	//   15   25:aload_2         
	//   16   26:invokespecial   #153 <Method void FileInputStream(File)>
	//   17   29:astore_2        
		s = ((String) (jsonToKeysData(CommonUtils.streamToString(((java.io.InputStream) (obj))))));
	//   18   30:aload_2         
	//   19   31:invokestatic    #159 <Method String CommonUtils.streamToString(java.io.InputStream)>
	//   20   34:invokestatic    #161 <Method Map jsonToKeysData(String)>
	//   21   37:astore_1        
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close user metadata file.");
	//   22   38:aload_2         
	//   23   39:ldc1            #163 <String "Failed to close user metadata file.">
	//   24   41:invokestatic    #167 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return ((Map) (s));
	//   25   44:aload_1         
	//   26   45:areturn         
		s;
	//   27   46:astore_1        
		obj = obj1;
	//   28   47:aload_3         
	//   29   48:astore_2        
		obj1 = ((Object) (s));
	//   30   49:aload_1         
	//   31   50:astore_3        
_L4:
		s = ((String) (obj));
	//   32   51:aload_2         
	//   33   52:astore_1        
		Fabric.getLogger().e("CrashlyticsCore", "Error deserializing user metadata.", ((Throwable) (obj1)));
	//   34   53:invokestatic    #173 <Method Logger Fabric.getLogger()>
	//   35   56:ldc1            #175 <String "CrashlyticsCore">
	//   36   58:ldc1            #177 <String "Error deserializing user metadata.">
	//   37   60:aload_3         
	//   38   61:invokeinterface #183 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close user metadata file.");
	//   39   66:aload_2         
	//   40   67:ldc1            #163 <String "Failed to close user metadata file.">
	//   41   69:invokestatic    #167 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return Collections.emptyMap();
	//   42   72:invokestatic    #149 <Method Map Collections.emptyMap()>
	//   43   75:areturn         
		obj;
	//   44   76:astore_2        
_L2:
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), "Failed to close user metadata file.");
	//   45   77:aload_1         
	//   46   78:ldc1            #163 <String "Failed to close user metadata file.">
	//   47   80:invokestatic    #167 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw obj;
	//   48   83:aload_2         
	//   49   84:athrow          
		obj1;
	//   50   85:astore_3        
		s = ((String) (obj));
	//   51   86:aload_2         
	//   52   87:astore_1        
		obj = obj1;
	//   53   88:aload_3         
	//   54   89:astore_2        
		if(true) goto _L2; else goto _L1
	//   55   90:goto            77
_L1:
		obj1;
	//   56   93:astore_3        
		if(true) goto _L4; else goto _L3
_L3:
	//*  57   94:goto            51
	}

	public UserMetaData readUserData(String s)
	{
		Object obj;
		Object obj1;
		obj = ((Object) (getUserDataFileForSession(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #186 <Method File getUserDataFileForSession(String)>
	//    3    5:astore_2        
		if(!((File) (obj)).exists())
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #143 <Method boolean File.exists()>
	//*   6   10:ifne            17
			return UserMetaData.EMPTY;
	//    7   13:getstatic       #190 <Field UserMetaData UserMetaData.EMPTY>
	//    8   16:areturn         
		s = null;
	//    9   17:aconst_null     
	//   10   18:astore_1        
		obj1 = null;
	//   11   19:aconst_null     
	//   12   20:astore_3        
		obj = ((Object) (new FileInputStream(((File) (obj)))));
	//   13   21:new             #151 <Class FileInputStream>
	//   14   24:dup             
	//   15   25:aload_2         
	//   16   26:invokespecial   #153 <Method void FileInputStream(File)>
	//   17   29:astore_2        
		s = ((String) (jsonToUserData(CommonUtils.streamToString(((java.io.InputStream) (obj))))));
	//   18   30:aload_2         
	//   19   31:invokestatic    #159 <Method String CommonUtils.streamToString(java.io.InputStream)>
	//   20   34:invokestatic    #192 <Method UserMetaData jsonToUserData(String)>
	//   21   37:astore_1        
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close user metadata file.");
	//   22   38:aload_2         
	//   23   39:ldc1            #163 <String "Failed to close user metadata file.">
	//   24   41:invokestatic    #167 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return ((UserMetaData) (s));
	//   25   44:aload_1         
	//   26   45:areturn         
		s;
	//   27   46:astore_1        
		obj = obj1;
	//   28   47:aload_3         
	//   29   48:astore_2        
		obj1 = ((Object) (s));
	//   30   49:aload_1         
	//   31   50:astore_3        
_L4:
		s = ((String) (obj));
	//   32   51:aload_2         
	//   33   52:astore_1        
		Fabric.getLogger().e("CrashlyticsCore", "Error deserializing user metadata.", ((Throwable) (obj1)));
	//   34   53:invokestatic    #173 <Method Logger Fabric.getLogger()>
	//   35   56:ldc1            #175 <String "CrashlyticsCore">
	//   36   58:ldc1            #177 <String "Error deserializing user metadata.">
	//   37   60:aload_3         
	//   38   61:invokeinterface #183 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close user metadata file.");
	//   39   66:aload_2         
	//   40   67:ldc1            #163 <String "Failed to close user metadata file.">
	//   41   69:invokestatic    #167 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return UserMetaData.EMPTY;
	//   42   72:getstatic       #190 <Field UserMetaData UserMetaData.EMPTY>
	//   43   75:areturn         
		obj;
	//   44   76:astore_2        
_L2:
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), "Failed to close user metadata file.");
	//   45   77:aload_1         
	//   46   78:ldc1            #163 <String "Failed to close user metadata file.">
	//   47   80:invokestatic    #167 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw obj;
	//   48   83:aload_2         
	//   49   84:athrow          
		obj1;
	//   50   85:astore_3        
		s = ((String) (obj));
	//   51   86:aload_2         
	//   52   87:astore_1        
		obj = obj1;
	//   53   88:aload_3         
	//   54   89:astore_2        
		if(true) goto _L2; else goto _L1
	//   55   90:goto            77
_L1:
		obj1;
	//   56   93:astore_3        
		if(true) goto _L4; else goto _L3
_L3:
	//*  57   94:goto            51
	}

	public void writeKeyData(String s, Map map)
	{
		Object obj;
		Object obj1;
		File file;
		file = getKeysFileForSession(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #140 <Method File getKeysFileForSession(String)>
	//    3    5:astore          5
		obj1 = null;
	//    4    7:aconst_null     
	//    5    8:astore          4
		obj = null;
	//    6   10:aconst_null     
	//    7   11:astore_3        
		s = ((String) (obj1));
	//    8   12:aload           4
	//    9   14:astore_1        
		String s1 = keysDataToJson(map);
	//   10   15:aload_2         
	//   11   16:invokestatic    #196 <Method String keysDataToJson(Map)>
	//   12   19:astore          6
		s = ((String) (obj1));
	//   13   21:aload           4
	//   14   23:astore_1        
		map = ((Map) (new BufferedWriter(((Writer) (new OutputStreamWriter(((java.io.OutputStream) (new FileOutputStream(file))), UTF_8))))));
	//   15   24:new             #198 <Class BufferedWriter>
	//   16   27:dup             
	//   17   28:new             #200 <Class OutputStreamWriter>
	//   18   31:dup             
	//   19   32:new             #202 <Class FileOutputStream>
	//   20   35:dup             
	//   21   36:aload           5
	//   22   38:invokespecial   #203 <Method void FileOutputStream(File)>
	//   23   41:getstatic       #41  <Field Charset UTF_8>
	//   24   44:invokespecial   #206 <Method void OutputStreamWriter(java.io.OutputStream, Charset)>
	//   25   47:invokespecial   #209 <Method void BufferedWriter(Writer)>
	//   26   50:astore_2        
		((Writer) (map)).write(s1);
	//   27   51:aload_2         
	//   28   52:aload           6
	//   29   54:invokevirtual   #214 <Method void Writer.write(String)>
		((Writer) (map)).flush();
	//   30   57:aload_2         
	//   31   58:invokevirtual   #217 <Method void Writer.flush()>
		CommonUtils.closeOrLog(((java.io.Closeable) (map)), "Failed to close key/value metadata file.");
	//   32   61:aload_2         
	//   33   62:ldc1            #219 <String "Failed to close key/value metadata file.">
	//   34   64:invokestatic    #167 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   35   67:return          
		s;
	//   36   68:astore_1        
		map = ((Map) (obj));
	//   37   69:aload_3         
	//   38   70:astore_2        
		obj = ((Object) (s));
	//   39   71:aload_1         
	//   40   72:astore_3        
_L4:
		s = ((String) (map));
	//   41   73:aload_2         
	//   42   74:astore_1        
		Fabric.getLogger().e("CrashlyticsCore", "Error serializing key/value metadata.", ((Throwable) (obj)));
	//   43   75:invokestatic    #173 <Method Logger Fabric.getLogger()>
	//   44   78:ldc1            #175 <String "CrashlyticsCore">
	//   45   80:ldc1            #221 <String "Error serializing key/value metadata.">
	//   46   82:aload_3         
	//   47   83:invokeinterface #183 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.closeOrLog(((java.io.Closeable) (map)), "Failed to close key/value metadata file.");
	//   48   88:aload_2         
	//   49   89:ldc1            #219 <String "Failed to close key/value metadata file.">
	//   50   91:invokestatic    #167 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   51   94:return          
		map;
	//   52   95:astore_2        
_L2:
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), "Failed to close key/value metadata file.");
	//   53   96:aload_1         
	//   54   97:ldc1            #219 <String "Failed to close key/value metadata file.">
	//   55   99:invokestatic    #167 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw map;
	//   56  102:aload_2         
	//   57  103:athrow          
		obj;
	//   58  104:astore_3        
		s = ((String) (map));
	//   59  105:aload_2         
	//   60  106:astore_1        
		map = ((Map) (obj));
	//   61  107:aload_3         
	//   62  108:astore_2        
		if(true) goto _L2; else goto _L1
	//   63  109:goto            96
_L1:
		obj;
	//   64  112:astore_3        
		if(true) goto _L4; else goto _L3
_L3:
	//*  65  113:goto            73
	}

	public void writeUserData(String s, UserMetaData usermetadata)
	{
		Object obj;
		Object obj1;
		File file;
		file = getUserDataFileForSession(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #186 <Method File getUserDataFileForSession(String)>
	//    3    5:astore          5
		obj1 = null;
	//    4    7:aconst_null     
	//    5    8:astore          4
		obj = null;
	//    6   10:aconst_null     
	//    7   11:astore_3        
		s = ((String) (obj1));
	//    8   12:aload           4
	//    9   14:astore_1        
		String s1 = userDataToJson(usermetadata);
	//   10   15:aload_2         
	//   11   16:invokestatic    #226 <Method String userDataToJson(UserMetaData)>
	//   12   19:astore          6
		s = ((String) (obj1));
	//   13   21:aload           4
	//   14   23:astore_1        
		usermetadata = ((UserMetaData) (new BufferedWriter(((Writer) (new OutputStreamWriter(((java.io.OutputStream) (new FileOutputStream(file))), UTF_8))))));
	//   15   24:new             #198 <Class BufferedWriter>
	//   16   27:dup             
	//   17   28:new             #200 <Class OutputStreamWriter>
	//   18   31:dup             
	//   19   32:new             #202 <Class FileOutputStream>
	//   20   35:dup             
	//   21   36:aload           5
	//   22   38:invokespecial   #203 <Method void FileOutputStream(File)>
	//   23   41:getstatic       #41  <Field Charset UTF_8>
	//   24   44:invokespecial   #206 <Method void OutputStreamWriter(java.io.OutputStream, Charset)>
	//   25   47:invokespecial   #209 <Method void BufferedWriter(Writer)>
	//   26   50:astore_2        
		((Writer) (usermetadata)).write(s1);
	//   27   51:aload_2         
	//   28   52:aload           6
	//   29   54:invokevirtual   #214 <Method void Writer.write(String)>
		((Writer) (usermetadata)).flush();
	//   30   57:aload_2         
	//   31   58:invokevirtual   #217 <Method void Writer.flush()>
		CommonUtils.closeOrLog(((java.io.Closeable) (usermetadata)), "Failed to close user metadata file.");
	//   32   61:aload_2         
	//   33   62:ldc1            #163 <String "Failed to close user metadata file.">
	//   34   64:invokestatic    #167 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   35   67:return          
		s;
	//   36   68:astore_1        
		usermetadata = ((UserMetaData) (obj));
	//   37   69:aload_3         
	//   38   70:astore_2        
		obj = ((Object) (s));
	//   39   71:aload_1         
	//   40   72:astore_3        
_L4:
		s = ((String) (usermetadata));
	//   41   73:aload_2         
	//   42   74:astore_1        
		Fabric.getLogger().e("CrashlyticsCore", "Error serializing user metadata.", ((Throwable) (obj)));
	//   43   75:invokestatic    #173 <Method Logger Fabric.getLogger()>
	//   44   78:ldc1            #175 <String "CrashlyticsCore">
	//   45   80:ldc1            #228 <String "Error serializing user metadata.">
	//   46   82:aload_3         
	//   47   83:invokeinterface #183 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.closeOrLog(((java.io.Closeable) (usermetadata)), "Failed to close user metadata file.");
	//   48   88:aload_2         
	//   49   89:ldc1            #163 <String "Failed to close user metadata file.">
	//   50   91:invokestatic    #167 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   51   94:return          
		usermetadata;
	//   52   95:astore_2        
_L2:
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), "Failed to close user metadata file.");
	//   53   96:aload_1         
	//   54   97:ldc1            #163 <String "Failed to close user metadata file.">
	//   55   99:invokestatic    #167 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw usermetadata;
	//   56  102:aload_2         
	//   57  103:athrow          
		obj;
	//   58  104:astore_3        
		s = ((String) (usermetadata));
	//   59  105:aload_2         
	//   60  106:astore_1        
		usermetadata = ((UserMetaData) (obj));
	//   61  107:aload_3         
	//   62  108:astore_2        
		if(true) goto _L2; else goto _L1
	//   63  109:goto            96
_L1:
		obj;
	//   64  112:astore_3        
		if(true) goto _L4; else goto _L3
_L3:
	//*  65  113:goto            73
	}

	private static final String KEYDATA_SUFFIX = "keys";
	private static final String KEY_USER_EMAIL = "userEmail";
	private static final String KEY_USER_ID = "userId";
	private static final String KEY_USER_NAME = "userName";
	private static final String METADATA_EXT = ".meta";
	private static final String USERDATA_SUFFIX = "user";
	private static final Charset UTF_8 = Charset.forName("UTF-8");
	private final File filesDir;

	static 
	{
	//    0    0:ldc1            #33  <String "UTF-8">
	//    1    2:invokestatic    #39  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #41  <Field Charset UTF_8>
	//*   3    8:return          
	}
}
