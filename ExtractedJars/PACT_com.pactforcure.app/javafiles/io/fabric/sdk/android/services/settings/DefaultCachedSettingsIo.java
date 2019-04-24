// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import java.io.*;
import org.json.JSONObject;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//			CachedSettingsIo

class DefaultCachedSettingsIo
	implements CachedSettingsIo
{

	public DefaultCachedSettingsIo(Kit kit1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		kit = kit1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Kit kit>
	//    5    9:return          
	}

	public JSONObject readCachedSettings()
	{
		Object obj;
		Object obj1;
		Object obj2;
		Object obj3;
		Object obj4;
		Fabric.getLogger().d("Fabric", "Reading cached settings...");
	//    0    0:invokestatic    #26  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #28  <String "Fabric">
	//    2    5:ldc1            #30  <String "Reading cached settings...">
	//    3    7:invokeinterface #36  <Method void Logger.d(String, String)>
		obj2 = null;
	//    4   12:aconst_null     
	//    5   13:astore_3        
		obj4 = null;
	//    6   14:aconst_null     
	//    7   15:astore          5
		obj1 = null;
	//    8   17:aconst_null     
	//    9   18:astore_2        
		obj3 = null;
	//   10   19:aconst_null     
	//   11   20:astore          4
		obj = ((Object) (obj4));
	//   12   22:aload           5
	//   13   24:astore_1        
		File file = new File((new FileStoreImpl(kit)).getFilesDir(), "com.crashlytics.settings.json");
	//   14   25:new             #38  <Class File>
	//   15   28:dup             
	//   16   29:new             #40  <Class FileStoreImpl>
	//   17   32:dup             
	//   18   33:aload_0         
	//   19   34:getfield        #15  <Field Kit kit>
	//   20   37:invokespecial   #42  <Method void FileStoreImpl(Kit)>
	//   21   40:invokevirtual   #46  <Method File FileStoreImpl.getFilesDir()>
	//   22   43:ldc1            #48  <String "com.crashlytics.settings.json">
	//   23   45:invokespecial   #51  <Method void File(File, String)>
	//   24   48:astore          6
		obj = ((Object) (obj4));
	//   25   50:aload           5
	//   26   52:astore_1        
		if(!file.exists()) goto _L2; else goto _L1
	//   27   53:aload           6
	//   28   55:invokevirtual   #55  <Method boolean File.exists()>
	//   29   58:ifeq            94
_L1:
		obj = ((Object) (obj4));
	//   30   61:aload           5
	//   31   63:astore_1        
		obj1 = ((Object) (new FileInputStream(file)));
	//   32   64:new             #57  <Class FileInputStream>
	//   33   67:dup             
	//   34   68:aload           6
	//   35   70:invokespecial   #60  <Method void FileInputStream(File)>
	//   36   73:astore_2        
		obj = ((Object) (new JSONObject(CommonUtils.streamToString(((java.io.InputStream) (obj1))))));
	//   37   74:new             #62  <Class JSONObject>
	//   38   77:dup             
	//   39   78:aload_2         
	//   40   79:invokestatic    #68  <Method String CommonUtils.streamToString(java.io.InputStream)>
	//   41   82:invokespecial   #71  <Method void JSONObject(String)>
	//   42   85:astore_1        
_L4:
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Error while closing settings cache file.");
	//   43   86:aload_2         
	//   44   87:ldc1            #73  <String "Error while closing settings cache file.">
	//   45   89:invokestatic    #77  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return ((JSONObject) (obj));
	//   46   92:aload_1         
	//   47   93:areturn         
_L2:
		obj = ((Object) (obj4));
	//   48   94:aload           5
	//   49   96:astore_1        
		Fabric.getLogger().d("Fabric", "No cached settings found.");
	//   50   97:invokestatic    #26  <Method Logger Fabric.getLogger()>
	//   51  100:ldc1            #28  <String "Fabric">
	//   52  102:ldc1            #79  <String "No cached settings found.">
	//   53  104:invokeinterface #36  <Method void Logger.d(String, String)>
		obj = ((Object) (obj3));
	//   54  109:aload           4
	//   55  111:astore_1        
		if(true) goto _L4; else goto _L3
	//   56  112:goto            86
_L3:
		obj;
	//   57  115:astore_1        
		obj1 = obj2;
	//   58  116:aload_3         
	//   59  117:astore_2        
		obj2 = obj;
	//   60  118:aload_1         
	//   61  119:astore_3        
_L8:
		obj = obj1;
	//   62  120:aload_2         
	//   63  121:astore_1        
		Fabric.getLogger().e("Fabric", "Failed to fetch cached settings", ((Throwable) (obj2)));
	//   64  122:invokestatic    #26  <Method Logger Fabric.getLogger()>
	//   65  125:ldc1            #28  <String "Fabric">
	//   66  127:ldc1            #81  <String "Failed to fetch cached settings">
	//   67  129:aload_3         
	//   68  130:invokeinterface #85  <Method void Logger.e(String, String, Throwable)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Error while closing settings cache file.");
	//   69  135:aload_2         
	//   70  136:ldc1            #73  <String "Error while closing settings cache file.">
	//   71  138:invokestatic    #77  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return null;
	//   72  141:aconst_null     
	//   73  142:areturn         
		obj1;
	//   74  143:astore_2        
_L6:
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Error while closing settings cache file.");
	//   75  144:aload_1         
	//   76  145:ldc1            #73  <String "Error while closing settings cache file.">
	//   77  147:invokestatic    #77  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw obj1;
	//   78  150:aload_2         
	//   79  151:athrow          
		obj2;
	//   80  152:astore_3        
		obj = obj1;
	//   81  153:aload_2         
	//   82  154:astore_1        
		obj1 = obj2;
	//   83  155:aload_3         
	//   84  156:astore_2        
		if(true) goto _L6; else goto _L5
	//   85  157:goto            144
_L5:
		obj2;
	//   86  160:astore_3        
		if(true) goto _L8; else goto _L7
_L7:
	//*  87  161:goto            120
	}

	public void writeCachedSettings(long l, JSONObject jsonobject)
	{
		Object obj;
		Object obj1;
		Object obj2;
		Fabric.getLogger().d("Fabric", "Writing settings to cache file...");
	//    0    0:invokestatic    #26  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #28  <String "Fabric">
	//    2    5:ldc1            #89  <String "Writing settings to cache file...">
	//    3    7:invokeinterface #36  <Method void Logger.d(String, String)>
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_91;
	//    4   12:aload_3         
	//    5   13:ifnull          91
		obj1 = null;
	//    6   16:aconst_null     
	//    7   17:astore          5
		obj2 = null;
	//    8   19:aconst_null     
	//    9   20:astore          6
		obj = obj1;
	//   10   22:aload           5
	//   11   24:astore          4
		jsonobject.put("expires_at", l);
	//   12   26:aload_3         
	//   13   27:ldc1            #91  <String "expires_at">
	//   14   29:lload_1         
	//   15   30:invokevirtual   #95  <Method JSONObject JSONObject.put(String, long)>
	//   16   33:pop             
		obj = obj1;
	//   17   34:aload           5
	//   18   36:astore          4
		obj1 = ((Object) (new FileWriter(new File((new FileStoreImpl(kit)).getFilesDir(), "com.crashlytics.settings.json"))));
	//   19   38:new             #97  <Class FileWriter>
	//   20   41:dup             
	//   21   42:new             #38  <Class File>
	//   22   45:dup             
	//   23   46:new             #40  <Class FileStoreImpl>
	//   24   49:dup             
	//   25   50:aload_0         
	//   26   51:getfield        #15  <Field Kit kit>
	//   27   54:invokespecial   #42  <Method void FileStoreImpl(Kit)>
	//   28   57:invokevirtual   #46  <Method File FileStoreImpl.getFilesDir()>
	//   29   60:ldc1            #48  <String "com.crashlytics.settings.json">
	//   30   62:invokespecial   #51  <Method void File(File, String)>
	//   31   65:invokespecial   #98  <Method void FileWriter(File)>
	//   32   68:astore          5
		((FileWriter) (obj1)).write(jsonobject.toString());
	//   33   70:aload           5
	//   34   72:aload_3         
	//   35   73:invokevirtual   #102 <Method String JSONObject.toString()>
	//   36   76:invokevirtual   #105 <Method void FileWriter.write(String)>
		((FileWriter) (obj1)).flush();
	//   37   79:aload           5
	//   38   81:invokevirtual   #108 <Method void FileWriter.flush()>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close settings writer.");
	//   39   84:aload           5
	//   40   86:ldc1            #110 <String "Failed to close settings writer.">
	//   41   88:invokestatic    #77  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   42   91:return          
		obj1;
	//   43   92:astore          5
		jsonobject = ((JSONObject) (obj2));
	//   44   94:aload           6
	//   45   96:astore_3        
_L4:
		obj = ((Object) (jsonobject));
	//   46   97:aload_3         
	//   47   98:astore          4
		Fabric.getLogger().e("Fabric", "Failed to cache settings", ((Throwable) (obj1)));
	//   48  100:invokestatic    #26  <Method Logger Fabric.getLogger()>
	//   49  103:ldc1            #28  <String "Fabric">
	//   50  105:ldc1            #112 <String "Failed to cache settings">
	//   51  107:aload           5
	//   52  109:invokeinterface #85  <Method void Logger.e(String, String, Throwable)>
		CommonUtils.closeOrLog(((java.io.Closeable) (jsonobject)), "Failed to close settings writer.");
	//   53  114:aload_3         
	//   54  115:ldc1            #110 <String "Failed to close settings writer.">
	//   55  117:invokestatic    #77  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   56  120:return          
		jsonobject;
	//   57  121:astore_3        
_L2:
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close settings writer.");
	//   58  122:aload           4
	//   59  124:ldc1            #110 <String "Failed to close settings writer.">
	//   60  126:invokestatic    #77  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw jsonobject;
	//   61  129:aload_3         
	//   62  130:athrow          
		jsonobject;
	//   63  131:astore_3        
		obj = obj1;
	//   64  132:aload           5
	//   65  134:astore          4
		if(true) goto _L2; else goto _L1
	//   66  136:goto            122
_L1:
		Exception exception;
		exception;
	//   67  139:astore          4
		jsonobject = ((JSONObject) (obj1));
	//   68  141:aload           5
	//   69  143:astore_3        
		obj1 = ((Object) (exception));
	//   70  144:aload           4
	//   71  146:astore          5
		if(true) goto _L4; else goto _L3
	//   72  148:goto            97
_L3:
	}

	private final Kit kit;
}
