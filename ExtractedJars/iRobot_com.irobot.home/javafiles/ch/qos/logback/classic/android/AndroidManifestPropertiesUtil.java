// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.android;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.android.CommonPathUtil;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.WarnStatus;
import ch.qos.logback.core.util.Loader;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

// Referenced classes of package ch.qos.logback.classic.android:
//			ASaxEventRecorder

public class AndroidManifestPropertiesUtil
{

	public AndroidManifestPropertiesUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void setAndroidProperties(Context context)
	{
		Object obj;
		StatusManager statusmanager;
		Object obj1;
		obj = ((Object) (new ASaxEventRecorder()));
	//    0    0:new             #15  <Class ASaxEventRecorder>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void ASaxEventRecorder()>
	//    3    7:astore_1        
		((ASaxEventRecorder) (obj)).setFilter(new String[] {
			"-"
		});
	//    4    8:aload_1         
	//    5    9:iconst_1        
	//    6   10:anewarray       String[]
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:ldc1            #20  <String "-">
	//   10   17:aastore         
	//   11   18:invokevirtual   #24  <Method void ASaxEventRecorder.setFilter(String[])>
		((ASaxEventRecorder) (obj)).setAttributeWatch("manifest");
	//   12   21:aload_1         
	//   13   22:ldc1            #26  <String "manifest">
	//   14   24:invokevirtual   #30  <Method void ASaxEventRecorder.setAttributeWatch(String)>
		statusmanager = context.getStatusManager();
	//   15   27:aload_0         
	//   16   28:invokeinterface #36  <Method StatusManager Context.getStatusManager()>
	//   17   33:astore_2        
		obj1 = ((Object) (Loader.getClassLoaderOfObject(((Object) (context))).getResourceAsStream("AndroidManifest.xml")));
	//   18   34:aload_0         
	//   19   35:invokestatic    #42  <Method ClassLoader Loader.getClassLoaderOfObject(Object)>
	//   20   38:ldc1            #44  <String "AndroidManifest.xml">
	//   21   40:invokevirtual   #50  <Method InputStream ClassLoader.getResourceAsStream(String)>
	//   22   43:astore_3        
		if(obj1 == null)
	//*  23   44:aload_3         
	//*  24   45:ifnonnull       65
		{
			statusmanager.add(((ch.qos.logback.core.status.Status) (new WarnStatus("Could not find AndroidManifest.xml", ((Object) (context))))));
	//   25   48:aload_2         
	//   26   49:new             #52  <Class WarnStatus>
	//   27   52:dup             
	//   28   53:ldc1            #54  <String "Could not find AndroidManifest.xml">
	//   29   55:aload_0         
	//   30   56:invokespecial   #57  <Method void WarnStatus(String, Object)>
	//   31   59:invokeinterface #63  <Method void StatusManager.add(ch.qos.logback.core.status.Status)>
			return;
	//   32   64:return          
		}
		((ASaxEventRecorder) (obj)).recordEvents(((InputStream) (obj1)));
	//   33   65:aload_1         
	//   34   66:aload_3         
	//   35   67:invokevirtual   #67  <Method void ASaxEventRecorder.recordEvents(InputStream)>
		Iterator iterator;
		String s;
		try
		{
			((InputStream) (obj1)).close();
	//   36   70:aload_3         
	//   37   71:invokevirtual   #72  <Method void InputStream.close()>
		}
	//*  38   74:aload_0         
	//*  39   75:ldc1            #74  <String "EXT_DIR">
	//*  40   77:invokestatic    #80  <Method String CommonPathUtil.getMountedExternalStorageDirectoryPath()>
	//*  41   80:invokeinterface #84  <Method void Context.putProperty(String, String)>
	//*  42   85:aload_1         
	//*  43   86:invokevirtual   #88  <Method Map ASaxEventRecorder.getAttributeWatchValues()>
	//*  44   89:astore_3        
	//*  45   90:aload_3         
	//*  46   91:invokeinterface #94  <Method Set Map.keySet()>
	//*  47   96:invokeinterface #100 <Method Iterator Set.iterator()>
	//*  48  101:astore          4
	//*  49  103:aload           4
	//*  50  105:invokeinterface #106 <Method boolean Iterator.hasNext()>
	//*  51  110:ifeq            191
	//*  52  113:aload           4
	//*  53  115:invokeinterface #110 <Method Object Iterator.next()>
	//*  54  120:checkcast       #18  <Class String>
	//*  55  123:astore          5
	//*  56  125:aload           5
	//*  57  127:ldc1            #112 <String "android:versionName">
	//*  58  129:invokevirtual   #116 <Method boolean String.equals(Object)>
	//*  59  132:ifeq            159
	//*  60  135:ldc1            #118 <String "VERSION_NAME">
	//*  61  137:astore_1        
	//*  62  138:aload_0         
	//*  63  139:aload_1         
	//*  64  140:aload_3         
	//*  65  141:aload           5
	//*  66  143:invokeinterface #122 <Method Object Map.get(Object)>
	//*  67  148:checkcast       #18  <Class String>
	//*  68  151:invokeinterface #84  <Method void Context.putProperty(String, String)>
	//*  69  156:goto            103
	//*  70  159:aload           5
	//*  71  161:ldc1            #124 <String "android:versionCode">
	//*  72  163:invokevirtual   #116 <Method boolean String.equals(Object)>
	//*  73  166:ifeq            175
	//*  74  169:ldc1            #126 <String "VERSION_CODE">
	//*  75  171:astore_1        
	//*  76  172:goto            138
	//*  77  175:aload           5
	//*  78  177:ldc1            #128 <String "package">
	//*  79  179:invokevirtual   #116 <Method boolean String.equals(Object)>
	//*  80  182:ifeq            103
	//*  81  185:ldc1            #130 <String "PACKAGE_NAME">
	//*  82  187:astore_1        
	//*  83  188:goto            138
	//*  84  191:aload_3         
	//*  85  192:ldc1            #128 <String "package">
	//*  86  194:invokeinterface #122 <Method Object Map.get(Object)>
	//*  87  199:checkcast       #18  <Class String>
	//*  88  202:astore_1        
	//*  89  203:aload_1         
	//*  90  204:ifnull          227
	//*  91  207:aload_1         
	//*  92  208:invokevirtual   #134 <Method int String.length()>
	//*  93  211:ifle            227
	//*  94  214:aload_0         
	//*  95  215:ldc1            #136 <String "DATA_DIR">
	//*  96  217:aload_1         
	//*  97  218:invokestatic    #140 <Method String CommonPathUtil.getFilesDirectoryPath(String)>
	//*  98  221:invokeinterface #84  <Method void Context.putProperty(String, String)>
	//*  99  226:return          
	//* 100  227:aload_2         
	//* 101  228:new             #52  <Class WarnStatus>
	//* 102  231:dup             
	//* 103  232:ldc1            #142 <String "Package name not found. Some properties cannot be set.">
	//* 104  234:aload_0         
	//* 105  235:invokespecial   #57  <Method void WarnStatus(String, Object)>
	//* 106  238:invokeinterface #63  <Method void StatusManager.add(ch.qos.logback.core.status.Status)>
	//* 107  243:return          
	//* 108  244:astore_0        
	//* 109  245:aload_3         
	//* 110  246:invokevirtual   #72  <Method void InputStream.close()>
	//* 111  249:aload_0         
	//* 112  250:athrow          
		catch(IOException ioexception1) { }
	//  113  251:astore_3        
		context.putProperty("EXT_DIR", CommonPathUtil.getMountedExternalStorageDirectoryPath());
		obj1 = ((Object) (((ASaxEventRecorder) (obj)).getAttributeWatchValues()));
		iterator = ((Map) (obj1)).keySet().iterator();
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_191;
		s = (String)iterator.next();
		if(s.equals("android:versionName"))
		{
			obj = "VERSION_NAME";
		} else
		{
			if(!s.equals("android:versionCode"))
				continue; /* Loop/switch isn't completed */
			obj = "VERSION_CODE";
		}
_L4:
		context.putProperty(((String) (obj)), (String)((Map) (obj1)).get(((Object) (s))));
		break MISSING_BLOCK_LABEL_103;
		if(!s.equals("package")) goto _L2; else goto _L1
_L1:
		break MISSING_BLOCK_LABEL_185;
_L2:
		break MISSING_BLOCK_LABEL_103;
		obj = "PACKAGE_NAME";
		if(true) goto _L4; else goto _L3
_L3:
		obj = ((Object) ((String)((Map) (obj1)).get("package")));
		if(obj != null && ((String) (obj)).length() > 0)
		{
			context.putProperty("DATA_DIR", CommonPathUtil.getFilesDirectoryPath(((String) (obj))));
			return;
		} else
		{
			statusmanager.add(((ch.qos.logback.core.status.Status) (new WarnStatus("Package name not found. Some properties cannot be set.", ((Object) (context))))));
			return;
		}
		context;
		try
		{
			((InputStream) (obj1)).close();
		}
	//* 114  252:goto            74
		catch(IOException ioexception) { }
	//  115  255:astore_1        
		throw context;
	//* 116  256:goto            249
	}
}
