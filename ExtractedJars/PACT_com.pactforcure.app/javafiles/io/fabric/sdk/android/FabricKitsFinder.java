// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android;

import android.os.SystemClock;
import android.text.TextUtils;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

// Referenced classes of package io.fabric.sdk.android:
//			Fabric, Logger, KitInfo

class FabricKitsFinder
	implements Callable
{

	FabricKitsFinder(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		apkFileName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field String apkFileName>
	//    5    9:return          
	}

	private KitInfo loadKitInfo(ZipEntry zipentry, ZipFile zipfile)
	{
		ZipFile zipfile1;
		ZipFile zipfile2;
		zipfile2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		zipfile1 = null;
	//    2    3:aconst_null     
	//    3    4:astore_3        
		zipfile = ((ZipFile) (zipfile.getInputStream(zipentry)));
	//    4    5:aload_2         
	//    5    6:aload_1         
	//    6    7:invokevirtual   #39  <Method java.io.InputStream ZipFile.getInputStream(ZipEntry)>
	//    7   10:astore_2        
		zipfile1 = zipfile;
	//    8   11:aload_2         
	//    9   12:astore_3        
		zipfile2 = zipfile;
	//   10   13:aload_2         
	//   11   14:astore          4
		Object obj1 = ((Object) (new Properties()));
	//   12   16:new             #41  <Class Properties>
	//   13   19:dup             
	//   14   20:invokespecial   #42  <Method void Properties()>
	//   15   23:astore          7
		zipfile1 = zipfile;
	//   16   25:aload_2         
	//   17   26:astore_3        
		zipfile2 = zipfile;
	//   18   27:aload_2         
	//   19   28:astore          4
		((Properties) (obj1)).load(((java.io.InputStream) (zipfile)));
	//   20   30:aload           7
	//   21   32:aload_2         
	//   22   33:invokevirtual   #46  <Method void Properties.load(java.io.InputStream)>
		zipfile1 = zipfile;
	//   23   36:aload_2         
	//   24   37:astore_3        
		zipfile2 = zipfile;
	//   25   38:aload_2         
	//   26   39:astore          4
		Object obj = ((Object) (((Properties) (obj1)).getProperty("fabric-identifier")));
	//   27   41:aload           7
	//   28   43:ldc1            #17  <String "fabric-identifier">
	//   29   45:invokevirtual   #50  <Method String Properties.getProperty(String)>
	//   30   48:astore          5
		zipfile1 = zipfile;
	//   31   50:aload_2         
	//   32   51:astore_3        
		zipfile2 = zipfile;
	//   33   52:aload_2         
	//   34   53:astore          4
		String s = ((Properties) (obj1)).getProperty("fabric-version");
	//   35   55:aload           7
	//   36   57:ldc1            #20  <String "fabric-version">
	//   37   59:invokevirtual   #50  <Method String Properties.getProperty(String)>
	//   38   62:astore          6
		zipfile1 = zipfile;
	//   39   64:aload_2         
	//   40   65:astore_3        
		zipfile2 = zipfile;
	//   41   66:aload_2         
	//   42   67:astore          4
		obj1 = ((Object) (((Properties) (obj1)).getProperty("fabric-build-type")));
	//   43   69:aload           7
	//   44   71:ldc1            #11  <String "fabric-build-type">
	//   45   73:invokevirtual   #50  <Method String Properties.getProperty(String)>
	//   46   76:astore          7
		zipfile1 = zipfile;
	//   47   78:aload_2         
	//   48   79:astore_3        
		zipfile2 = zipfile;
	//   49   80:aload_2         
	//   50   81:astore          4
		if(TextUtils.isEmpty(((CharSequence) (obj))))
			break MISSING_BLOCK_LABEL_104;
	//   51   83:aload           5
	//   52   85:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   53   88:ifne            104
		zipfile1 = zipfile;
	//   54   91:aload_2         
	//   55   92:astore_3        
		zipfile2 = zipfile;
	//   56   93:aload_2         
	//   57   94:astore          4
		if(!TextUtils.isEmpty(((CharSequence) (s))))
			break MISSING_BLOCK_LABEL_182;
	//   58   96:aload           6
	//   59   98:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   60  101:ifeq            182
		zipfile1 = zipfile;
	//   61  104:aload_2         
	//   62  105:astore_3        
		zipfile2 = zipfile;
	//   63  106:aload_2         
	//   64  107:astore          4
		try
		{
			throw new IllegalStateException((new StringBuilder()).append("Invalid format of fabric file,").append(zipentry.getName()).toString());
	//   65  109:new             #58  <Class IllegalStateException>
	//   66  112:dup             
	//   67  113:new             #60  <Class StringBuilder>
	//   68  116:dup             
	//   69  117:invokespecial   #61  <Method void StringBuilder()>
	//   70  120:ldc1            #63  <String "Invalid format of fabric file,">
	//   71  122:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   72  125:aload_1         
	//   73  126:invokevirtual   #73  <Method String ZipEntry.getName()>
	//   74  129:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   75  132:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   76  135:invokespecial   #78  <Method void IllegalStateException(String)>
	//   77  138:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(ZipFile zipfile)
	//*  78  139:astore_2        
		{
			zipfile2 = zipfile1;
	//   79  140:aload_3         
	//   80  141:astore          4
		}
		Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Error when parsing fabric properties ").append(zipentry.getName()).toString(), ((Throwable) (zipfile)));
	//   81  143:invokestatic    #84  <Method Logger Fabric.getLogger()>
	//   82  146:ldc1            #86  <String "Fabric">
	//   83  148:new             #60  <Class StringBuilder>
	//   84  151:dup             
	//   85  152:invokespecial   #61  <Method void StringBuilder()>
	//   86  155:ldc1            #88  <String "Error when parsing fabric properties ">
	//   87  157:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   88  160:aload_1         
	//   89  161:invokevirtual   #73  <Method String ZipEntry.getName()>
	//   90  164:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   91  167:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   92  170:aload_2         
	//   93  171:invokeinterface #94  <Method void Logger.e(String, String, Throwable)>
		CommonUtils.closeQuietly(((java.io.Closeable) (zipfile1)));
	//   94  176:aload_3         
	//   95  177:invokestatic    #100 <Method void CommonUtils.closeQuietly(java.io.Closeable)>
		return null;
	//   96  180:aconst_null     
	//   97  181:areturn         
		zipfile1 = zipfile;
	//   98  182:aload_2         
	//   99  183:astore_3        
		zipfile2 = zipfile;
	//  100  184:aload_2         
	//  101  185:astore          4
		obj = ((Object) (new KitInfo(((String) (obj)), s, ((String) (obj1)))));
	//  102  187:new             #102 <Class KitInfo>
	//  103  190:dup             
	//  104  191:aload           5
	//  105  193:aload           6
	//  106  195:aload           7
	//  107  197:invokespecial   #105 <Method void KitInfo(String, String, String)>
	//  108  200:astore          5
		CommonUtils.closeQuietly(((java.io.Closeable) (zipfile)));
	//  109  202:aload_2         
	//  110  203:invokestatic    #100 <Method void CommonUtils.closeQuietly(java.io.Closeable)>
		return ((KitInfo) (obj));
	//  111  206:aload           5
	//  112  208:areturn         
		zipentry;
	//  113  209:astore_1        
		CommonUtils.closeQuietly(((java.io.Closeable) (zipfile2)));
	//  114  210:aload           4
	//  115  212:invokestatic    #100 <Method void CommonUtils.closeQuietly(java.io.Closeable)>
		throw zipentry;
	//  116  215:aload_1         
	//  117  216:athrow          
	}

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method Map call()>
	//    2    4:areturn         
	}

	public Map call()
		throws Exception
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #115 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #116 <Method void HashMap()>
	//    3    7:astore          5
		long l = SystemClock.elapsedRealtime();
	//    4    9:invokestatic    #122 <Method long SystemClock.elapsedRealtime()>
	//    5   12:lstore_3        
		int i = 0;
	//    6   13:iconst_0        
	//    7   14:istore_1        
		ZipFile zipfile = loadApkFile();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #126 <Method ZipFile loadApkFile()>
	//   10   19:astore          6
		Enumeration enumeration = zipfile.entries();
	//   11   21:aload           6
	//   12   23:invokevirtual   #130 <Method Enumeration ZipFile.entries()>
	//   13   26:astore          7
		do
		{
			if(!enumeration.hasMoreElements())
				break;
	//   14   28:aload           7
	//   15   30:invokeinterface #136 <Method boolean Enumeration.hasMoreElements()>
	//   16   35:ifeq            159
			int j = i + 1;
	//   17   38:iload_1         
	//   18   39:iconst_1        
	//   19   40:iadd            
	//   20   41:istore_2        
			Object obj = ((Object) ((ZipEntry)enumeration.nextElement()));
	//   21   42:aload           7
	//   22   44:invokeinterface #139 <Method Object Enumeration.nextElement()>
	//   23   49:checkcast       #69  <Class ZipEntry>
	//   24   52:astore          8
			i = j;
	//   25   54:iload_2         
	//   26   55:istore_1        
			if(((ZipEntry) (obj)).getName().startsWith("fabric/"))
	//*  27   56:aload           8
	//*  28   58:invokevirtual   #73  <Method String ZipEntry.getName()>
	//*  29   61:ldc1            #14  <String "fabric/">
	//*  30   63:invokevirtual   #145 <Method boolean String.startsWith(String)>
	//*  31   66:ifeq            28
			{
				i = j;
	//   32   69:iload_2         
	//   33   70:istore_1        
				if(((ZipEntry) (obj)).getName().length() > "fabric/".length())
	//*  34   71:aload           8
	//*  35   73:invokevirtual   #73  <Method String ZipEntry.getName()>
	//*  36   76:invokevirtual   #149 <Method int String.length()>
	//*  37   79:ldc1            #14  <String "fabric/">
	//*  38   81:invokevirtual   #149 <Method int String.length()>
	//*  39   84:icmple          28
				{
					obj = ((Object) (loadKitInfo(((ZipEntry) (obj)), zipfile)));
	//   40   87:aload_0         
	//   41   88:aload           8
	//   42   90:aload           6
	//   43   92:invokespecial   #151 <Method KitInfo loadKitInfo(ZipEntry, ZipFile)>
	//   44   95:astore          8
					i = j;
	//   45   97:iload_2         
	//   46   98:istore_1        
					if(obj != null)
	//*  47   99:aload           8
	//*  48  101:ifnull          28
					{
						((Map) (hashmap)).put(((Object) (((KitInfo) (obj)).getIdentifier())), obj);
	//   49  104:aload           5
	//   50  106:aload           8
	//   51  108:invokevirtual   #154 <Method String KitInfo.getIdentifier()>
	//   52  111:aload           8
	//   53  113:invokeinterface #160 <Method Object Map.put(Object, Object)>
	//   54  118:pop             
						Fabric.getLogger().v("Fabric", String.format("Found kit:[%s] version:[%s]", new Object[] {
							((KitInfo) (obj)).getIdentifier(), ((KitInfo) (obj)).getVersion()
						}));
	//   55  119:invokestatic    #84  <Method Logger Fabric.getLogger()>
	//   56  122:ldc1            #86  <String "Fabric">
	//   57  124:ldc1            #162 <String "Found kit:[%s] version:[%s]">
	//   58  126:iconst_2        
	//   59  127:anewarray       Object[]
	//   60  130:dup             
	//   61  131:iconst_0        
	//   62  132:aload           8
	//   63  134:invokevirtual   #154 <Method String KitInfo.getIdentifier()>
	//   64  137:aastore         
	//   65  138:dup             
	//   66  139:iconst_1        
	//   67  140:aload           8
	//   68  142:invokevirtual   #165 <Method String KitInfo.getVersion()>
	//   69  145:aastore         
	//   70  146:invokestatic    #169 <Method String String.format(String, Object[])>
	//   71  149:invokeinterface #173 <Method void Logger.v(String, String)>
						i = j;
	//   72  154:iload_2         
	//   73  155:istore_1        
					}
				}
			}
		} while(true);
	//   74  156:goto            28
		if(zipfile != null)
	//*  75  159:aload           6
	//*  76  161:ifnull          169
			try
			{
				zipfile.close();
	//   77  164:aload           6
	//   78  166:invokevirtual   #176 <Method void ZipFile.close()>
			}
	//*  79  169:invokestatic    #84  <Method Logger Fabric.getLogger()>
	//*  80  172:ldc1            #86  <String "Fabric">
	//*  81  174:new             #60  <Class StringBuilder>
	//*  82  177:dup             
	//*  83  178:invokespecial   #61  <Method void StringBuilder()>
	//*  84  181:ldc1            #178 <String "finish scanning in ">
	//*  85  183:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//*  86  186:invokestatic    #122 <Method long SystemClock.elapsedRealtime()>
	//*  87  189:lload_3         
	//*  88  190:lsub            
	//*  89  191:invokevirtual   #181 <Method StringBuilder StringBuilder.append(long)>
	//*  90  194:ldc1            #183 <String " reading:">
	//*  91  196:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//*  92  199:iload_1         
	//*  93  200:invokevirtual   #186 <Method StringBuilder StringBuilder.append(int)>
	//*  94  203:invokevirtual   #76  <Method String StringBuilder.toString()>
	//*  95  206:invokeinterface #173 <Method void Logger.v(String, String)>
	//*  96  211:aload           5
	//*  97  213:areturn         
			catch(IOException ioexception) { }
	//   98  214:astore          6
		Fabric.getLogger().v("Fabric", (new StringBuilder()).append("finish scanning in ").append(SystemClock.elapsedRealtime() - l).append(" reading:").append(i).toString());
		return ((Map) (hashmap));
	//*  99  216:goto            169
	}

	protected ZipFile loadApkFile()
		throws IOException
	{
		return new ZipFile(apkFileName);
	//    0    0:new             #35  <Class ZipFile>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field String apkFileName>
	//    4    8:invokespecial   #189 <Method void ZipFile(String)>
	//    5   11:areturn         
	}

	private static final String FABRIC_BUILD_TYPE_KEY = "fabric-build-type";
	static final String FABRIC_DIR = "fabric/";
	private static final String FABRIC_IDENTIFIER_KEY = "fabric-identifier";
	private static final String FABRIC_VERSION_KEY = "fabric-version";
	final String apkFileName;
}
