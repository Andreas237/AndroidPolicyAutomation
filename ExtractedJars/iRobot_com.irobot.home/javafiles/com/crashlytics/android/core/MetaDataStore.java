// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import b.a.a.a.a.b.i;
import b.a.a.a.c;
import b.a.a.a.l;
import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
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

	private static Map jsonToKeysData(String s)
	{
		s = ((String) (new JSONObject(s)));
	//    0    0:new             #52  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #55  <Method void JSONObject(String)>
	//    4    8:astore_0        
		HashMap hashmap = new HashMap();
	//    5    9:new             #57  <Class HashMap>
	//    6   12:dup             
	//    7   13:invokespecial   #58  <Method void HashMap()>
	//    8   16:astore_1        
		String s1;
		for(Iterator iterator = ((JSONObject) (s)).keys(); iterator.hasNext(); ((Map) (hashmap)).put(((Object) (s1)), ((Object) (valueOrNull(((JSONObject) (s)), s1)))))
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #61  <Method Iterator JSONObject.keys()>
	//*  11   21:astore_2        
	//*  12   22:aload_2         
	//*  13   23:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*  14   28:ifeq            57
			s1 = (String)iterator.next();
	//   15   31:aload_2         
	//   16   32:invokeinterface #71  <Method Object Iterator.next()>
	//   17   37:checkcast       #73  <Class String>
	//   18   40:astore_3        

	//   19   41:aload_1         
	//   20   42:aload_3         
	//   21   43:aload_0         
	//   22   44:aload_3         
	//   23   45:invokestatic    #77  <Method String valueOrNull(JSONObject, String)>
	//   24   48:invokeinterface #83  <Method Object Map.put(Object, Object)>
	//   25   53:pop             
	//*  26   54:goto            22
		return ((Map) (hashmap));
	//   27   57:aload_1         
	//   28   58:areturn         
	}

	private static UserMetaData jsonToUserData(String s)
	{
		s = ((String) (new JSONObject(s)));
	//    0    0:new             #52  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #55  <Method void JSONObject(String)>
	//    4    8:astore_0        
		return new UserMetaData(valueOrNull(((JSONObject) (s)), "userId"), valueOrNull(((JSONObject) (s)), "userName"), valueOrNull(((JSONObject) (s)), "userEmail"));
	//    5    9:new             #89  <Class UserMetaData>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:ldc1            #16  <String "userId">
	//    9   16:invokestatic    #77  <Method String valueOrNull(JSONObject, String)>
	//   10   19:aload_0         
	//   11   20:ldc1            #19  <String "userName">
	//   12   22:invokestatic    #77  <Method String valueOrNull(JSONObject, String)>
	//   13   25:aload_0         
	//   14   26:ldc1            #13  <String "userEmail">
	//   15   28:invokestatic    #77  <Method String valueOrNull(JSONObject, String)>
	//   16   31:invokespecial   #92  <Method void UserMetaData(String, String, String)>
	//   17   34:areturn         
	}

	private static String keysDataToJson(Map map)
	{
		return (new JSONObject(map)).toString();
	//    0    0:new             #52  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #97  <Method void JSONObject(Map)>
	//    4    8:invokevirtual   #101 <Method String JSONObject.toString()>
	//    5   11:areturn         
	}

	private static String userDataToJson(UserMetaData usermetadata)
	{
		return ((_cls1) (new JSONObject(usermetadata) {

			final UserMetaData val$userData;

			
			{
				userData = usermetadata;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field UserMetaData val$userData>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void JSONObject()>
				put("userId", ((Object) (userData.id)));
			//    5    9:aload_0         
			//    6   10:ldc1            #20  <String "userId">
			//    7   12:aload_0         
			//    8   13:getfield        #15  <Field UserMetaData val$userData>
			//    9   16:getfield        #26  <Field String UserMetaData.id>
			//   10   19:invokevirtual   #30  <Method JSONObject put(String, Object)>
			//   11   22:pop             
				put("userName", ((Object) (userData.name)));
			//   12   23:aload_0         
			//   13   24:ldc1            #32  <String "userName">
			//   14   26:aload_0         
			//   15   27:getfield        #15  <Field UserMetaData val$userData>
			//   16   30:getfield        #35  <Field String UserMetaData.name>
			//   17   33:invokevirtual   #30  <Method JSONObject put(String, Object)>
			//   18   36:pop             
				put("userEmail", ((Object) (userData.email)));
			//   19   37:aload_0         
			//   20   38:ldc1            #37  <String "userEmail">
			//   21   40:aload_0         
			//   22   41:getfield        #15  <Field UserMetaData val$userData>
			//   23   44:getfield        #40  <Field String UserMetaData.email>
			//   24   47:invokevirtual   #30  <Method JSONObject put(String, Object)>
			//   25   50:pop             
			//   26   51:return          
			}
		}
)).toString();
	//    0    0:new             #6   <Class MetaDataStore$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #107 <Method void MetaDataStore$1(UserMetaData)>
	//    4    8:invokevirtual   #108 <Method String MetaDataStore$1.toString()>
	//    5   11:areturn         
	}

	private static String valueOrNull(JSONObject jsonobject, String s)
	{
		boolean flag = jsonobject.isNull(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #112 <Method boolean JSONObject.isNull(String)>
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
	//   11   15:invokevirtual   #116 <Method String JSONObject.optString(String, String)>
	//   12   18:astore_3        
		return s1;
	//   13   19:aload_3         
	//   14   20:areturn         
	}

	public File getKeysFileForSession(String s)
	{
		File file = filesDir;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field File filesDir>
	//    2    4:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #120 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #121 <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append(s);
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   10   18:pop             
		stringbuilder.append("keys");
	//   11   19:aload_3         
	//   12   20:ldc1            #10  <String "keys">
	//   13   22:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
		stringbuilder.append(".meta");
	//   15   26:aload_3         
	//   16   27:ldc1            #22  <String ".meta">
	//   17   29:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
		return new File(file, stringbuilder.toString());
	//   19   33:new             #127 <Class File>
	//   20   36:dup             
	//   21   37:aload_2         
	//   22   38:aload_3         
	//   23   39:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   24   42:invokespecial   #131 <Method void File(File, String)>
	//   25   45:areturn         
	}

	public File getUserDataFileForSession(String s)
	{
		File file = filesDir;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field File filesDir>
	//    2    4:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #120 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #121 <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append(s);
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   10   18:pop             
		stringbuilder.append("user");
	//   11   19:aload_3         
	//   12   20:ldc1            #25  <String "user">
	//   13   22:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
		stringbuilder.append(".meta");
	//   15   26:aload_3         
	//   16   27:ldc1            #22  <String ".meta">
	//   17   29:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
		return new File(file, stringbuilder.toString());
	//   19   33:new             #127 <Class File>
	//   20   36:dup             
	//   21   37:aload_2         
	//   22   38:aload_3         
	//   23   39:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   24   42:invokespecial   #131 <Method void File(File, String)>
	//   25   45:areturn         
	}

	public Map readKeyData(String s)
	{
		Object obj;
		Object obj2;
		obj = ((Object) (getKeysFileForSession(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #137 <Method File getKeysFileForSession(String)>
	//    3    5:astore_2        
		if(!((File) (obj)).exists())
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #140 <Method boolean File.exists()>
	//*   6   10:ifne            17
			return Collections.emptyMap();
	//    7   13:invokestatic    #146 <Method Map Collections.emptyMap()>
	//    8   16:areturn         
		obj2 = null;
	//    9   17:aconst_null     
	//   10   18:astore          4
		s = null;
	//   11   20:aconst_null     
	//   12   21:astore_1        
		obj = ((Object) (new FileInputStream(((File) (obj)))));
	//   13   22:new             #148 <Class FileInputStream>
	//   14   25:dup             
	//   15   26:aload_2         
	//   16   27:invokespecial   #150 <Method void FileInputStream(File)>
	//   17   30:astore_2        
		s = ((String) (jsonToKeysData(i.a(((java.io.InputStream) (obj))))));
	//   18   31:aload_2         
	//   19   32:invokestatic    #156 <Method String i.a(java.io.InputStream)>
	//   20   35:invokestatic    #158 <Method Map jsonToKeysData(String)>
	//   21   38:astore_1        
		i.a(((java.io.Closeable) (obj)), "Failed to close user metadata file.");
	//   22   39:aload_2         
	//   23   40:ldc1            #160 <String "Failed to close user metadata file.">
	//   24   42:invokestatic    #163 <Method void i.a(java.io.Closeable, String)>
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
		c.g().e("CrashlyticsCore", "Error deserializing user metadata.", ((Throwable) (obj1)));
	//   42   69:invokestatic    #169 <Method l c.g()>
	//   43   72:ldc1            #171 <String "CrashlyticsCore">
	//   44   74:ldc1            #173 <String "Error deserializing user metadata.">
	//   45   76:aload_3         
	//   46   77:invokeinterface #179 <Method void l.e(String, String, Throwable)>
		i.a(((java.io.Closeable) (obj)), "Failed to close user metadata file.");
	//   47   82:aload_2         
	//   48   83:ldc1            #160 <String "Failed to close user metadata file.">
	//   49   85:invokestatic    #163 <Method void i.a(java.io.Closeable, String)>
		return Collections.emptyMap();
	//   50   88:invokestatic    #146 <Method Map Collections.emptyMap()>
	//   51   91:areturn         
		i.a(((java.io.Closeable) (s)), "Failed to close user metadata file.");
	//   52   92:aload_1         
	//   53   93:ldc1            #160 <String "Failed to close user metadata file.">
	//   54   95:invokestatic    #163 <Method void i.a(java.io.Closeable, String)>
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
	//    2    2:invokevirtual   #182 <Method File getUserDataFileForSession(String)>
	//    3    5:astore_2        
		if(!((File) (obj)).exists())
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #140 <Method boolean File.exists()>
	//*   6   10:ifne            17
			return UserMetaData.EMPTY;
	//    7   13:getstatic       #186 <Field UserMetaData UserMetaData.EMPTY>
	//    8   16:areturn         
		obj2 = null;
	//    9   17:aconst_null     
	//   10   18:astore          4
		s = null;
	//   11   20:aconst_null     
	//   12   21:astore_1        
		obj = ((Object) (new FileInputStream(((File) (obj)))));
	//   13   22:new             #148 <Class FileInputStream>
	//   14   25:dup             
	//   15   26:aload_2         
	//   16   27:invokespecial   #150 <Method void FileInputStream(File)>
	//   17   30:astore_2        
		s = ((String) (jsonToUserData(i.a(((java.io.InputStream) (obj))))));
	//   18   31:aload_2         
	//   19   32:invokestatic    #156 <Method String i.a(java.io.InputStream)>
	//   20   35:invokestatic    #188 <Method UserMetaData jsonToUserData(String)>
	//   21   38:astore_1        
		i.a(((java.io.Closeable) (obj)), "Failed to close user metadata file.");
	//   22   39:aload_2         
	//   23   40:ldc1            #160 <String "Failed to close user metadata file.">
	//   24   42:invokestatic    #163 <Method void i.a(java.io.Closeable, String)>
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
		c.g().e("CrashlyticsCore", "Error deserializing user metadata.", ((Throwable) (obj1)));
	//   42   69:invokestatic    #169 <Method l c.g()>
	//   43   72:ldc1            #171 <String "CrashlyticsCore">
	//   44   74:ldc1            #173 <String "Error deserializing user metadata.">
	//   45   76:aload_3         
	//   46   77:invokeinterface #179 <Method void l.e(String, String, Throwable)>
		i.a(((java.io.Closeable) (obj)), "Failed to close user metadata file.");
	//   47   82:aload_2         
	//   48   83:ldc1            #160 <String "Failed to close user metadata file.">
	//   49   85:invokestatic    #163 <Method void i.a(java.io.Closeable, String)>
		return UserMetaData.EMPTY;
	//   50   88:getstatic       #186 <Field UserMetaData UserMetaData.EMPTY>
	//   51   91:areturn         
		i.a(((java.io.Closeable) (s)), "Failed to close user metadata file.");
	//   52   92:aload_1         
	//   53   93:ldc1            #160 <String "Failed to close user metadata file.">
	//   54   95:invokestatic    #163 <Method void i.a(java.io.Closeable, String)>
		throw obj;
	//   55   98:aload_2         
	//   56   99:athrow          
	}

	public void writeKeyData(String s, Map map)
	{
		Object obj;
		Object obj2;
		File file;
		file = getKeysFileForSession(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #137 <Method File getKeysFileForSession(String)>
	//    3    5:astore          5
		obj2 = null;
	//    4    7:aconst_null     
	//    5    8:astore          4
		obj = null;
	//    6   10:aconst_null     
	//    7   11:astore_3        
		s = ((String) (obj));
	//    8   12:aload_3         
	//    9   13:astore_1        
		String s1 = keysDataToJson(map);
	//   10   14:aload_2         
	//   11   15:invokestatic    #192 <Method String keysDataToJson(Map)>
	//   12   18:astore          6
		s = ((String) (obj));
	//   13   20:aload_3         
	//   14   21:astore_1        
		map = ((Map) (new BufferedWriter(((Writer) (new OutputStreamWriter(((java.io.OutputStream) (new FileOutputStream(file))), UTF_8))))));
	//   15   22:new             #194 <Class BufferedWriter>
	//   16   25:dup             
	//   17   26:new             #196 <Class OutputStreamWriter>
	//   18   29:dup             
	//   19   30:new             #198 <Class FileOutputStream>
	//   20   33:dup             
	//   21   34:aload           5
	//   22   36:invokespecial   #199 <Method void FileOutputStream(File)>
	//   23   39:getstatic       #41  <Field Charset UTF_8>
	//   24   42:invokespecial   #202 <Method void OutputStreamWriter(java.io.OutputStream, Charset)>
	//   25   45:invokespecial   #205 <Method void BufferedWriter(Writer)>
	//   26   48:astore_2        
		((Writer) (map)).write(s1);
	//   27   49:aload_2         
	//   28   50:aload           6
	//   29   52:invokevirtual   #210 <Method void Writer.write(String)>
		((Writer) (map)).flush();
	//   30   55:aload_2         
	//   31   56:invokevirtual   #213 <Method void Writer.flush()>
		i.a(((java.io.Closeable) (map)), "Failed to close key/value metadata file.");
	//   32   59:aload_2         
	//   33   60:ldc1            #215 <String "Failed to close key/value metadata file.">
	//   34   62:invokestatic    #163 <Method void i.a(java.io.Closeable, String)>
		return;
	//   35   65:return          
		Object obj1;
		obj1;
	//   36   66:astore_3        
		s = ((String) (map));
	//   37   67:aload_2         
	//   38   68:astore_1        
		map = ((Map) (obj1));
	//   39   69:aload_3         
	//   40   70:astore_2        
		break MISSING_BLOCK_LABEL_108;
	//   41   71:goto            108
		obj1;
	//   42   74:astore_3        
		break MISSING_BLOCK_LABEL_86;
	//   43   75:goto            86
		map;
	//   44   78:astore_2        
		break MISSING_BLOCK_LABEL_108;
	//   45   79:goto            108
		obj1;
	//   46   82:astore_3        
		map = ((Map) (obj2));
	//   47   83:aload           4
	//   48   85:astore_2        
		s = ((String) (map));
	//   49   86:aload_2         
	//   50   87:astore_1        
		c.g().e("CrashlyticsCore", "Error serializing key/value metadata.", ((Throwable) (obj1)));
	//   51   88:invokestatic    #169 <Method l c.g()>
	//   52   91:ldc1            #171 <String "CrashlyticsCore">
	//   53   93:ldc1            #217 <String "Error serializing key/value metadata.">
	//   54   95:aload_3         
	//   55   96:invokeinterface #179 <Method void l.e(String, String, Throwable)>
		i.a(((java.io.Closeable) (map)), "Failed to close key/value metadata file.");
	//   56  101:aload_2         
	//   57  102:ldc1            #215 <String "Failed to close key/value metadata file.">
	//   58  104:invokestatic    #163 <Method void i.a(java.io.Closeable, String)>
		return;
	//   59  107:return          
		i.a(((java.io.Closeable) (s)), "Failed to close key/value metadata file.");
	//   60  108:aload_1         
	//   61  109:ldc1            #215 <String "Failed to close key/value metadata file.">
	//   62  111:invokestatic    #163 <Method void i.a(java.io.Closeable, String)>
		throw map;
	//   63  114:aload_2         
	//   64  115:athrow          
	}

	public void writeUserData(String s, UserMetaData usermetadata)
	{
		Object obj;
		Object obj2;
		File file;
		file = getUserDataFileForSession(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #182 <Method File getUserDataFileForSession(String)>
	//    3    5:astore          5
		obj2 = null;
	//    4    7:aconst_null     
	//    5    8:astore          4
		obj = null;
	//    6   10:aconst_null     
	//    7   11:astore_3        
		s = ((String) (obj));
	//    8   12:aload_3         
	//    9   13:astore_1        
		String s1 = userDataToJson(usermetadata);
	//   10   14:aload_2         
	//   11   15:invokestatic    #222 <Method String userDataToJson(UserMetaData)>
	//   12   18:astore          6
		s = ((String) (obj));
	//   13   20:aload_3         
	//   14   21:astore_1        
		usermetadata = ((UserMetaData) (new BufferedWriter(((Writer) (new OutputStreamWriter(((java.io.OutputStream) (new FileOutputStream(file))), UTF_8))))));
	//   15   22:new             #194 <Class BufferedWriter>
	//   16   25:dup             
	//   17   26:new             #196 <Class OutputStreamWriter>
	//   18   29:dup             
	//   19   30:new             #198 <Class FileOutputStream>
	//   20   33:dup             
	//   21   34:aload           5
	//   22   36:invokespecial   #199 <Method void FileOutputStream(File)>
	//   23   39:getstatic       #41  <Field Charset UTF_8>
	//   24   42:invokespecial   #202 <Method void OutputStreamWriter(java.io.OutputStream, Charset)>
	//   25   45:invokespecial   #205 <Method void BufferedWriter(Writer)>
	//   26   48:astore_2        
		((Writer) (usermetadata)).write(s1);
	//   27   49:aload_2         
	//   28   50:aload           6
	//   29   52:invokevirtual   #210 <Method void Writer.write(String)>
		((Writer) (usermetadata)).flush();
	//   30   55:aload_2         
	//   31   56:invokevirtual   #213 <Method void Writer.flush()>
		i.a(((java.io.Closeable) (usermetadata)), "Failed to close user metadata file.");
	//   32   59:aload_2         
	//   33   60:ldc1            #160 <String "Failed to close user metadata file.">
	//   34   62:invokestatic    #163 <Method void i.a(java.io.Closeable, String)>
		return;
	//   35   65:return          
		Object obj1;
		obj1;
	//   36   66:astore_3        
		s = ((String) (usermetadata));
	//   37   67:aload_2         
	//   38   68:astore_1        
		usermetadata = ((UserMetaData) (obj1));
	//   39   69:aload_3         
	//   40   70:astore_2        
		break MISSING_BLOCK_LABEL_108;
	//   41   71:goto            108
		obj1;
	//   42   74:astore_3        
		break MISSING_BLOCK_LABEL_86;
	//   43   75:goto            86
		usermetadata;
	//   44   78:astore_2        
		break MISSING_BLOCK_LABEL_108;
	//   45   79:goto            108
		obj1;
	//   46   82:astore_3        
		usermetadata = ((UserMetaData) (obj2));
	//   47   83:aload           4
	//   48   85:astore_2        
		s = ((String) (usermetadata));
	//   49   86:aload_2         
	//   50   87:astore_1        
		c.g().e("CrashlyticsCore", "Error serializing user metadata.", ((Throwable) (obj1)));
	//   51   88:invokestatic    #169 <Method l c.g()>
	//   52   91:ldc1            #171 <String "CrashlyticsCore">
	//   53   93:ldc1            #224 <String "Error serializing user metadata.">
	//   54   95:aload_3         
	//   55   96:invokeinterface #179 <Method void l.e(String, String, Throwable)>
		i.a(((java.io.Closeable) (usermetadata)), "Failed to close user metadata file.");
	//   56  101:aload_2         
	//   57  102:ldc1            #160 <String "Failed to close user metadata file.">
	//   58  104:invokestatic    #163 <Method void i.a(java.io.Closeable, String)>
		return;
	//   59  107:return          
		i.a(((java.io.Closeable) (s)), "Failed to close user metadata file.");
	//   60  108:aload_1         
	//   61  109:ldc1            #160 <String "Failed to close user metadata file.">
	//   62  111:invokestatic    #163 <Method void i.a(java.io.Closeable, String)>
		throw usermetadata;
	//   63  114:aload_2         
	//   64  115:athrow          
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
