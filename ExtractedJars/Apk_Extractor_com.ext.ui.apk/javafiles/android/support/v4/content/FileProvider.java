// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.*;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.*;
import java.util.*;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v4.content:
//			ContextCompat

public class FileProvider extends ContentProvider
{
	static interface PathStrategy
	{

		public abstract File getFileForUri(Uri uri);

		public abstract Uri getUriForFile(File file);
	}

	static class SimplePathStrategy
		implements PathStrategy
	{

		public void addRoot(String s, File file)
		{
			if(TextUtils.isEmpty(((CharSequence) (s))))
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #37  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   2    4:ifeq            17
				throw new IllegalArgumentException("Name must not be empty");
		//    3    7:new             #39  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #41  <String "Name must not be empty">
		//    6   13:invokespecial   #43  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			File file1;
			try
			{
				file1 = file.getCanonicalFile();
		//    8   17:aload_2         
		//    9   18:invokevirtual   #49  <Method File File.getCanonicalFile()>
		//   10   21:astore_3        
			}
		//*  11   22:aload_0         
		//*  12   23:getfield        #24  <Field HashMap mRoots>
		//*  13   26:aload_1         
		//*  14   27:aload_3         
		//*  15   28:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
		//*  16   31:pop             
		//*  17   32:return          
			// Misplaced declaration of an exception variable
			catch(String s)
		//*  18   33:astore_1        
			{
				throw new IllegalArgumentException((new StringBuilder()).append("Failed to resolve canonical path for ").append(((Object) (file))).toString(), ((Throwable) (s)));
		//   19   34:new             #39  <Class IllegalArgumentException>
		//   20   37:dup             
		//   21   38:new             #55  <Class StringBuilder>
		//   22   41:dup             
		//   23   42:invokespecial   #56  <Method void StringBuilder()>
		//   24   45:ldc1            #58  <String "Failed to resolve canonical path for ">
		//   25   47:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   26   50:aload_2         
		//   27   51:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   28   54:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   29   57:aload_1         
		//   30   58:invokespecial   #72  <Method void IllegalArgumentException(String, Throwable)>
		//   31   61:athrow          
			}
			mRoots.put(((Object) (s)), ((Object) (file1)));
		}

		public File getFileForUri(Uri uri)
		{
			Object obj1 = ((Object) (uri.getEncodedPath()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #79  <Method String Uri.getEncodedPath()>
		//    2    4:astore          4
			int i = ((String) (obj1)).indexOf('/', 1);
		//    3    6:aload           4
		//    4    8:bipush          47
		//    5   10:iconst_1        
		//    6   11:invokevirtual   #85  <Method int String.indexOf(int, int)>
		//    7   14:istore_2        
			Object obj = ((Object) (Uri.decode(((String) (obj1)).substring(1, i))));
		//    8   15:aload           4
		//    9   17:iconst_1        
		//   10   18:iload_2         
		//   11   19:invokevirtual   #89  <Method String String.substring(int, int)>
		//   12   22:invokestatic    #93  <Method String Uri.decode(String)>
		//   13   25:astore_3        
			obj1 = ((Object) (Uri.decode(((String) (obj1)).substring(i + 1))));
		//   14   26:aload           4
		//   15   28:iload_2         
		//   16   29:iconst_1        
		//   17   30:iadd            
		//   18   31:invokevirtual   #96  <Method String String.substring(int)>
		//   19   34:invokestatic    #93  <Method String Uri.decode(String)>
		//   20   37:astore          4
			obj = ((Object) ((File)mRoots.get(obj)));
		//   21   39:aload_0         
		//   22   40:getfield        #24  <Field HashMap mRoots>
		//   23   43:aload_3         
		//   24   44:invokevirtual   #100 <Method Object HashMap.get(Object)>
		//   25   47:checkcast       #45  <Class File>
		//   26   50:astore_3        
			if(obj == null)
		//*  27   51:aload_3         
		//*  28   52:ifnonnull       82
				throw new IllegalArgumentException((new StringBuilder()).append("Unable to find configured root for ").append(((Object) (uri))).toString());
		//   29   55:new             #39  <Class IllegalArgumentException>
		//   30   58:dup             
		//   31   59:new             #55  <Class StringBuilder>
		//   32   62:dup             
		//   33   63:invokespecial   #56  <Method void StringBuilder()>
		//   34   66:ldc1            #102 <String "Unable to find configured root for ">
		//   35   68:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   36   71:aload_1         
		//   37   72:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   38   75:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   39   78:invokespecial   #43  <Method void IllegalArgumentException(String)>
		//   40   81:athrow          
			uri = ((Uri) (new File(((File) (obj)), ((String) (obj1)))));
		//   41   82:new             #45  <Class File>
		//   42   85:dup             
		//   43   86:aload_3         
		//   44   87:aload           4
		//   45   89:invokespecial   #105 <Method void File(File, String)>
		//   46   92:astore_1        
			try
			{
				obj1 = ((Object) (((File) (uri)).getCanonicalFile()));
		//   47   93:aload_1         
		//   48   94:invokevirtual   #49  <Method File File.getCanonicalFile()>
		//   49   97:astore          4
			}
		//*  50   99:aload           4
		//*  51  101:invokevirtual   #108 <Method String File.getPath()>
		//*  52  104:aload_3         
		//*  53  105:invokevirtual   #108 <Method String File.getPath()>
		//*  54  108:invokevirtual   #112 <Method boolean String.startsWith(String)>
		//*  55  111:ifne            152
		//*  56  114:new             #114 <Class SecurityException>
		//*  57  117:dup             
		//*  58  118:ldc1            #116 <String "Resolved path jumped beyond configured root">
		//*  59  120:invokespecial   #117 <Method void SecurityException(String)>
		//*  60  123:athrow          
			catch(IOException ioexception)
		//*  61  124:astore_3        
			{
				throw new IllegalArgumentException((new StringBuilder()).append("Failed to resolve canonical path for ").append(((Object) (uri))).toString());
		//   62  125:new             #39  <Class IllegalArgumentException>
		//   63  128:dup             
		//   64  129:new             #55  <Class StringBuilder>
		//   65  132:dup             
		//   66  133:invokespecial   #56  <Method void StringBuilder()>
		//   67  136:ldc1            #58  <String "Failed to resolve canonical path for ">
		//   68  138:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   69  141:aload_1         
		//   70  142:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   71  145:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   72  148:invokespecial   #43  <Method void IllegalArgumentException(String)>
		//   73  151:athrow          
			}
			if(!((File) (obj1)).getPath().startsWith(((File) (obj)).getPath()))
				throw new SecurityException("Resolved path jumped beyond configured root");
			else
				return ((File) (obj1));
		//   74  152:aload           4
		//   75  154:areturn         
		}

		public Uri getUriForFile(File file)
		{
			Object obj;
			String s;
			java.util.Map.Entry entry;
			Iterator iterator;
			String s1;
			try
			{
				s = file.getCanonicalPath();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #122 <Method String File.getCanonicalPath()>
		//    2    4:astore          4
			}
		//*   3    6:aconst_null     
		//*   4    7:astore_1        
		//*   5    8:aload_0         
		//*   6    9:getfield        #24  <Field HashMap mRoots>
		//*   7   12:invokevirtual   #126 <Method Set HashMap.entrySet()>
		//*   8   15:invokeinterface #132 <Method Iterator Set.iterator()>
		//*   9   20:astore          5
		//*  10   22:aload           5
		//*  11   24:invokeinterface #138 <Method boolean Iterator.hasNext()>
		//*  12   29:ifeq            131
		//*  13   32:aload           5
		//*  14   34:invokeinterface #142 <Method Object Iterator.next()>
		//*  15   39:checkcast       #144 <Class java.util.Map$Entry>
		//*  16   42:astore_3        
		//*  17   43:aload_3         
		//*  18   44:invokeinterface #147 <Method Object java.util.Map$Entry.getValue()>
		//*  19   49:checkcast       #45  <Class File>
		//*  20   52:invokevirtual   #108 <Method String File.getPath()>
		//*  21   55:astore          6
		//*  22   57:aload           4
		//*  23   59:aload           6
		//*  24   61:invokevirtual   #112 <Method boolean String.startsWith(String)>
		//*  25   64:ifeq            277
		//*  26   67:aload_3         
		//*  27   68:astore_2        
		//*  28   69:aload_1         
		//*  29   70:ifnull          98
		//*  30   73:aload           6
		//*  31   75:invokevirtual   #151 <Method int String.length()>
		//*  32   78:aload_1         
		//*  33   79:invokeinterface #147 <Method Object java.util.Map$Entry.getValue()>
		//*  34   84:checkcast       #45  <Class File>
		//*  35   87:invokevirtual   #108 <Method String File.getPath()>
		//*  36   90:invokevirtual   #151 <Method int String.length()>
		//*  37   93:icmple          277
		//*  38   96:aload_3         
		//*  39   97:astore_2        
		//*  40   98:aload_2         
		//*  41   99:astore_1        
		//*  42  100:goto            22
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//*  43  103:astore_2        
			{
				throw new IllegalArgumentException((new StringBuilder()).append("Failed to resolve canonical path for ").append(((Object) (file))).toString());
		//   44  104:new             #39  <Class IllegalArgumentException>
		//   45  107:dup             
		//   46  108:new             #55  <Class StringBuilder>
		//   47  111:dup             
		//   48  112:invokespecial   #56  <Method void StringBuilder()>
		//   49  115:ldc1            #58  <String "Failed to resolve canonical path for ">
		//   50  117:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   51  120:aload_1         
		//   52  121:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   53  124:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   54  127:invokespecial   #43  <Method void IllegalArgumentException(String)>
		//   55  130:athrow          
			}
			file = null;
			iterator = mRoots.entrySet().iterator();
			if(!iterator.hasNext())
				break; /* Loop/switch isn't completed */
			entry = (java.util.Map.Entry)iterator.next();
			s1 = ((File)entry.getValue()).getPath();
			if(!s.startsWith(s1))
				break MISSING_BLOCK_LABEL_277;
			obj = ((Object) (entry));
			if(file != null)
			{
				if(s1.length() <= ((File)((java.util.Map.Entry) (file)).getValue()).getPath().length())
					break MISSING_BLOCK_LABEL_277;
				obj = ((Object) (entry));
			}
_L4:
			file = ((File) (obj));
			if(true) goto _L2; else goto _L1
_L2:
			break MISSING_BLOCK_LABEL_22;
_L1:
			if(file == null)
		//*  56  131:aload_1         
		//*  57  132:ifnonnull       163
				throw new IllegalArgumentException((new StringBuilder()).append("Failed to find configured root that contains ").append(s).toString());
		//   58  135:new             #39  <Class IllegalArgumentException>
		//   59  138:dup             
		//   60  139:new             #55  <Class StringBuilder>
		//   61  142:dup             
		//   62  143:invokespecial   #56  <Method void StringBuilder()>
		//   63  146:ldc1            #153 <String "Failed to find configured root that contains ">
		//   64  148:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   65  151:aload           4
		//   66  153:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   67  156:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   68  159:invokespecial   #43  <Method void IllegalArgumentException(String)>
		//   69  162:athrow          
			obj = ((Object) (((File)((java.util.Map.Entry) (file)).getValue()).getPath()));
		//   70  163:aload_1         
		//   71  164:invokeinterface #147 <Method Object java.util.Map$Entry.getValue()>
		//   72  169:checkcast       #45  <Class File>
		//   73  172:invokevirtual   #108 <Method String File.getPath()>
		//   74  175:astore_2        
			if(((String) (obj)).endsWith("/"))
		//*  75  176:aload_2         
		//*  76  177:ldc1            #155 <String "/">
		//*  77  179:invokevirtual   #158 <Method boolean String.endsWith(String)>
		//*  78  182:ifeq            262
				obj = ((Object) (s.substring(((String) (obj)).length())));
		//   79  185:aload           4
		//   80  187:aload_2         
		//   81  188:invokevirtual   #151 <Method int String.length()>
		//   82  191:invokevirtual   #96  <Method String String.substring(int)>
		//   83  194:astore_2        
			else
		//*  84  195:new             #55  <Class StringBuilder>
		//*  85  198:dup             
		//*  86  199:invokespecial   #56  <Method void StringBuilder()>
		//*  87  202:aload_1         
		//*  88  203:invokeinterface #161 <Method Object java.util.Map$Entry.getKey()>
		//*  89  208:checkcast       #81  <Class String>
		//*  90  211:invokestatic    #164 <Method String Uri.encode(String)>
		//*  91  214:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//*  92  217:bipush          47
		//*  93  219:invokevirtual   #167 <Method StringBuilder StringBuilder.append(char)>
		//*  94  222:aload_2         
		//*  95  223:ldc1            #155 <String "/">
		//*  96  225:invokestatic    #170 <Method String Uri.encode(String, String)>
		//*  97  228:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//*  98  231:invokevirtual   #69  <Method String StringBuilder.toString()>
		//*  99  234:astore_1        
		//* 100  235:new             #172 <Class android.net.Uri$Builder>
		//* 101  238:dup             
		//* 102  239:invokespecial   #173 <Method void android.net.Uri$Builder()>
		//* 103  242:ldc1            #175 <String "content">
		//* 104  244:invokevirtual   #179 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
		//* 105  247:aload_0         
		//* 106  248:getfield        #26  <Field String mAuthority>
		//* 107  251:invokevirtual   #182 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
		//* 108  254:aload_1         
		//* 109  255:invokevirtual   #185 <Method android.net.Uri$Builder android.net.Uri$Builder.encodedPath(String)>
		//* 110  258:invokevirtual   #189 <Method Uri android.net.Uri$Builder.build()>
		//* 111  261:areturn         
				obj = ((Object) (s.substring(((String) (obj)).length() + 1)));
		//  112  262:aload           4
		//  113  264:aload_2         
		//  114  265:invokevirtual   #151 <Method int String.length()>
		//  115  268:iconst_1        
		//  116  269:iadd            
		//  117  270:invokevirtual   #96  <Method String String.substring(int)>
		//  118  273:astore_2        
			file = ((File) ((new StringBuilder()).append(Uri.encode((String)((java.util.Map.Entry) (file)).getKey())).append('/').append(Uri.encode(((String) (obj)), "/")).toString()));
			return (new android.net.Uri.Builder()).scheme("content").authority(mAuthority).encodedPath(((String) (file))).build();
		//* 119  274:goto            195
			obj = ((Object) (file));
		//  120  277:aload_1         
		//  121  278:astore_2        
			if(true) goto _L4; else goto _L3
		//  122  279:goto            98
_L3:
		}

		private final String mAuthority;
		private final HashMap mRoots = new HashMap();

		public SimplePathStrategy(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #21  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #22  <Method void HashMap()>
		//    6   12:putfield        #24  <Field HashMap mRoots>
			mAuthority = s;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #26  <Field String mAuthority>
		//   10   20:return          
		}
	}


	public FileProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void ContentProvider()>
	//    2    4:return          
	}

	private static transient File buildPath(File file, String as[])
	{
		int j = as.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          38
		{
			String s = as[i];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          4
			if(s != null)
	//*  12   15:aload           4
	//*  13   17:ifnull          40
				file = new File(file, s);
	//   14   20:new             #61  <Class File>
	//   15   23:dup             
	//   16   24:aload_0         
	//   17   25:aload           4
	//   18   27:invokespecial   #82  <Method void File(File, String)>
	//   19   30:astore_0        
		}

	//   20   31:iload_2         
	//   21   32:iconst_1        
	//   22   33:iadd            
	//   23   34:istore_2        
	//*  24   35:goto            5
		return file;
	//   25   38:aload_0         
	//   26   39:areturn         
	//*  27   40:goto            31
	}

	private static Object[] copyOf(Object aobj[], int i)
	{
		Object aobj1[] = new Object[i];
	//    0    0:iload_1         
	//    1    1:anewarray       Object[]
	//    2    4:astore_2        
		System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:aload_2         
	//    6    8:iconst_0        
	//    7    9:iload_1         
	//    8   10:invokestatic    #92  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aobj1;
	//    9   13:aload_2         
	//   10   14:areturn         
	}

	private static String[] copyOf(String as[], int i)
	{
		String as1[] = new String[i];
	//    0    0:iload_1         
	//    1    1:anewarray       String[]
	//    2    4:astore_2        
		System.arraycopy(((Object) (as)), 0, ((Object) (as1)), 0, i);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:aload_2         
	//    6    8:iconst_0        
	//    7    9:iload_1         
	//    8   10:invokestatic    #92  <Method void System.arraycopy(Object, int, Object, int, int)>
		return as1;
	//    9   13:aload_2         
	//   10   14:areturn         
	}

	private static PathStrategy getPathStrategy(Context context, String s)
	{
		HashMap hashmap = sCache;
	//    0    0:getstatic       #75  <Field HashMap sCache>
	//    1    3:astore          4
		hashmap;
	//    2    5:aload           4
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		PathStrategy pathstrategy1 = (PathStrategy)sCache.get(((Object) (s)));
	//    4    8:getstatic       #75  <Field HashMap sCache>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #103 <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #6   <Class FileProvider$PathStrategy>
	//    8   18:astore_3        
		PathStrategy pathstrategy;
		pathstrategy = pathstrategy1;
	//    9   19:aload_3         
	//   10   20:astore_2        
		if(pathstrategy1 != null)
			break MISSING_BLOCK_LABEL_40;
	//   11   21:aload_3         
	//   12   22:ifnonnull       40
		pathstrategy = parsePathStrategy(context, s);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokestatic    #106 <Method FileProvider$PathStrategy parsePathStrategy(Context, String)>
	//   16   30:astore_2        
		sCache.put(((Object) (s)), ((Object) (pathstrategy)));
	//   17   31:getstatic       #75  <Field HashMap sCache>
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokevirtual   #110 <Method Object HashMap.put(Object, Object)>
	//   21   39:pop             
		hashmap;
	//   22   40:aload           4
		JVM INSTR monitorexit ;
	//   23   42:monitorexit     
		return pathstrategy;
	//   24   43:aload_2         
	//   25   44:areturn         
		context;
	//   26   45:astore_0        
		throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", ((Throwable) (context)));
	//   27   46:new             #112 <Class IllegalArgumentException>
	//   28   49:dup             
	//   29   50:ldc1            #114 <String "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data">
	//   30   52:aload_0         
	//   31   53:invokespecial   #117 <Method void IllegalArgumentException(String, Throwable)>
	//   32   56:athrow          
		context;
	//   33   57:astore_0        
		hashmap;
	//   34   58:aload           4
		JVM INSTR monitorexit ;
	//   35   60:monitorexit     
		throw context;
	//   36   61:aload_0         
	//   37   62:athrow          
		context;
	//   38   63:astore_0        
		throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", ((Throwable) (context)));
	//   39   64:new             #112 <Class IllegalArgumentException>
	//   40   67:dup             
	//   41   68:ldc1            #114 <String "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data">
	//   42   70:aload_0         
	//   43   71:invokespecial   #117 <Method void IllegalArgumentException(String, Throwable)>
	//   44   74:athrow          
	}

	public static Uri getUriForFile(Context context, String s, File file)
	{
		return getPathStrategy(context, s).getUriForFile(file);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #121 <Method FileProvider$PathStrategy getPathStrategy(Context, String)>
	//    3    5:aload_2         
	//    4    6:invokeinterface #124 <Method Uri FileProvider$PathStrategy.getUriForFile(File)>
	//    5   11:areturn         
	}

	private static int modeToMode(String s)
	{
		if("r".equals(((Object) (s))))
	//*   0    0:ldc1            #128 <String "r">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            12
			return 0x10000000;
	//    4    9:ldc1            #133 <Int 0x10000000>
	//    5   11:ireturn         
		if("w".equals(((Object) (s))) || "wt".equals(((Object) (s))))
	//*   6   12:ldc1            #135 <String "w">
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*   9   18:ifne            30
	//*  10   21:ldc1            #137 <String "wt">
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  13   27:ifeq            33
			return 0x2c000000;
	//   14   30:ldc1            #138 <Int 0x2c000000>
	//   15   32:ireturn         
		if("wa".equals(((Object) (s))))
	//*  16   33:ldc1            #140 <String "wa">
	//*  17   35:aload_0         
	//*  18   36:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  19   39:ifeq            45
			return 0x2a000000;
	//   20   42:ldc1            #141 <Int 0x2a000000>
	//   21   44:ireturn         
		if("rw".equals(((Object) (s))))
	//*  22   45:ldc1            #143 <String "rw">
	//*  23   47:aload_0         
	//*  24   48:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  25   51:ifeq            57
			return 0x38000000;
	//   26   54:ldc1            #144 <Int 0x38000000>
	//   27   56:ireturn         
		if("rwt".equals(((Object) (s))))
	//*  28   57:ldc1            #146 <String "rwt">
	//*  29   59:aload_0         
	//*  30   60:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  31   63:ifeq            69
			return 0x3c000000;
	//   32   66:ldc1            #147 <Int 0x3c000000>
	//   33   68:ireturn         
		else
			throw new IllegalArgumentException((new StringBuilder()).append("Invalid mode: ").append(s).toString());
	//   34   69:new             #112 <Class IllegalArgumentException>
	//   35   72:dup             
	//   36   73:new             #149 <Class StringBuilder>
	//   37   76:dup             
	//   38   77:invokespecial   #150 <Method void StringBuilder()>
	//   39   80:ldc1            #152 <String "Invalid mode: ">
	//   40   82:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   41   85:aload_0         
	//   42   86:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   43   89:invokevirtual   #160 <Method String StringBuilder.toString()>
	//   44   92:invokespecial   #161 <Method void IllegalArgumentException(String)>
	//   45   95:athrow          
	}

	private static PathStrategy parsePathStrategy(Context context, String s)
		throws IOException, XmlPullParserException
	{
		SimplePathStrategy simplepathstrategy;
		XmlResourceParser xmlresourceparser;
		simplepathstrategy = new SimplePathStrategy(s);
	//    0    0:new             #9   <Class FileProvider$SimplePathStrategy>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #162 <Method void FileProvider$SimplePathStrategy(String)>
	//    4    8:astore_3        
		xmlresourceparser = context.getPackageManager().resolveContentProvider(s, 128).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
	//    5    9:aload_0         
	//    6   10:invokevirtual   #168 <Method PackageManager Context.getPackageManager()>
	//    7   13:aload_1         
	//    8   14:sipush          128
	//    9   17:invokevirtual   #174 <Method ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #168 <Method PackageManager Context.getPackageManager()>
	//   12   24:ldc1            #24  <String "android.support.FILE_PROVIDER_PATHS">
	//   13   26:invokevirtual   #180 <Method XmlResourceParser ProviderInfo.loadXmlMetaData(PackageManager, String)>
	//   14   29:astore          4
		if(xmlresourceparser == null)
	//*  15   31:aload           4
	//*  16   33:ifnonnull       46
			throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
	//   17   36:new             #112 <Class IllegalArgumentException>
	//   18   39:dup             
	//   19   40:ldc1            #182 <String "Missing android.support.FILE_PROVIDER_PATHS meta-data">
	//   20   42:invokespecial   #161 <Method void IllegalArgumentException(String)>
	//   21   45:athrow          
_L2:
		int i = xmlresourceparser.next();
	//   22   46:aload           4
	//   23   48:invokeinterface #188 <Method int XmlResourceParser.next()>
	//   24   53:istore_2        
		if(i == 1)
			break; /* Loop/switch isn't completed */
	//   25   54:iload_2         
	//   26   55:iconst_1        
	//   27   56:icmpeq          238
		if(i != 2)
			continue; /* Loop/switch isn't completed */
	//   28   59:iload_2         
	//   29   60:iconst_2        
	//   30   61:icmpne          46
		s = xmlresourceparser.getName();
	//   31   64:aload           4
	//   32   66:invokeinterface #191 <Method String XmlResourceParser.getName()>
	//   33   71:astore_1        
		String s1 = xmlresourceparser.getAttributeValue(((String) (null)), "name");
	//   34   72:aload           4
	//   35   74:aconst_null     
	//   36   75:ldc1            #14  <String "name">
	//   37   77:invokeinterface #195 <Method String XmlResourceParser.getAttributeValue(String, String)>
	//   38   82:astore          5
		String s2 = xmlresourceparser.getAttributeValue(((String) (null)), "path");
	//   39   84:aload           4
	//   40   86:aconst_null     
	//   41   87:ldc1            #17  <String "path">
	//   42   89:invokeinterface #195 <Method String XmlResourceParser.getAttributeValue(String, String)>
	//   43   94:astore          6
		if("root-path".equals(((Object) (s))))
	//*  44   96:ldc1            #42  <String "root-path">
	//*  45   98:aload_1         
	//*  46   99:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  47  102:ifeq            135
			s = ((String) (DEVICE_ROOT));
	//   48  105:getstatic       #69  <Field File DEVICE_ROOT>
	//   49  108:astore_1        
		else
	//*  50  109:aload_1         
	//*  51  110:ifnull          46
	//*  52  113:aload_3         
	//*  53  114:aload           5
	//*  54  116:aload_1         
	//*  55  117:iconst_1        
	//*  56  118:anewarray       String[]
	//*  57  121:dup             
	//*  58  122:iconst_0        
	//*  59  123:aload           6
	//*  60  125:aastore         
	//*  61  126:invokestatic    #197 <Method File buildPath(File, String[])>
	//*  62  129:invokevirtual   #201 <Method void FileProvider$SimplePathStrategy.addRoot(String, File)>
	//*  63  132:goto            46
		if("files-path".equals(((Object) (s))))
	//*  64  135:ldc1            #39  <String "files-path">
	//*  65  137:aload_1         
	//*  66  138:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  67  141:ifeq            152
			s = ((String) (context.getFilesDir()));
	//   68  144:aload_0         
	//   69  145:invokevirtual   #205 <Method File Context.getFilesDir()>
	//   70  148:astore_1        
		else
	//*  71  149:goto            109
		if("cache-path".equals(((Object) (s))))
	//*  72  152:ldc1            #27  <String "cache-path">
	//*  73  154:aload_1         
	//*  74  155:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  75  158:ifeq            169
			s = ((String) (context.getCacheDir()));
	//   76  161:aload_0         
	//   77  162:invokevirtual   #208 <Method File Context.getCacheDir()>
	//   78  165:astore_1        
		else
	//*  79  166:goto            109
		if("external-path".equals(((Object) (s))))
	//*  80  169:ldc1            #30  <String "external-path">
	//*  81  171:aload_1         
	//*  82  172:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  83  175:ifeq            185
			s = ((String) (Environment.getExternalStorageDirectory()));
	//   84  178:invokestatic    #213 <Method File Environment.getExternalStorageDirectory()>
	//   85  181:astore_1        
		else
	//*  86  182:goto            109
		if("external-files-path".equals(((Object) (s))))
	//*  87  185:ldc1            #36  <String "external-files-path">
	//*  88  187:aload_1         
	//*  89  188:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  90  191:ifeq            212
		{
			s = ((String) (ContextCompat.getExternalFilesDirs(context, ((String) (null)))));
	//   91  194:aload_0         
	//   92  195:aconst_null     
	//   93  196:invokestatic    #219 <Method File[] ContextCompat.getExternalFilesDirs(Context, String)>
	//   94  199:astore_1        
			if(s.length <= 0)
				break MISSING_BLOCK_LABEL_240;
	//   95  200:aload_1         
	//   96  201:arraylength     
	//   97  202:ifle            240
			s = ((String) (s[0]));
	//   98  205:aload_1         
	//   99  206:iconst_0        
	//  100  207:aaload          
	//  101  208:astore_1        
		} else
	//* 102  209:goto            109
		{
			if(!"external-cache-path".equals(((Object) (s))))
				break MISSING_BLOCK_LABEL_240;
	//  103  212:ldc1            #33  <String "external-cache-path">
	//  104  214:aload_1         
	//  105  215:invokevirtual   #132 <Method boolean String.equals(Object)>
	//  106  218:ifeq            240
			s = ((String) (ContextCompat.getExternalCacheDirs(context)));
	//  107  221:aload_0         
	//  108  222:invokestatic    #223 <Method File[] ContextCompat.getExternalCacheDirs(Context)>
	//  109  225:astore_1        
			if(s.length <= 0)
				break MISSING_BLOCK_LABEL_240;
	//  110  226:aload_1         
	//  111  227:arraylength     
	//  112  228:ifle            240
			s = ((String) (s[0]));
	//  113  231:aload_1         
	//  114  232:iconst_0        
	//  115  233:aaload          
	//  116  234:astore_1        
		}
_L3:
		if(s != null)
			simplepathstrategy.addRoot(s1, buildPath(((File) (s)), new String[] {
				s2
			}));
		if(true) goto _L2; else goto _L1
	//* 117  235:goto            109
_L1:
		return ((PathStrategy) (simplepathstrategy));
	//  118  238:aload_3         
	//  119  239:areturn         
		s = null;
	//  120  240:aconst_null     
	//  121  241:astore_1        
		  goto _L3
	//* 122  242:goto            109
	}

	public void attachInfo(Context context, ProviderInfo providerinfo)
	{
		super.attachInfo(context, providerinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #228 <Method void ContentProvider.attachInfo(Context, ProviderInfo)>
		if(providerinfo.exported)
	//*   4    6:aload_2         
	//*   5    7:getfield        #232 <Field boolean ProviderInfo.exported>
	//*   6   10:ifeq            23
			throw new SecurityException("Provider must not be exported");
	//    7   13:new             #234 <Class SecurityException>
	//    8   16:dup             
	//    9   17:ldc1            #236 <String "Provider must not be exported">
	//   10   19:invokespecial   #237 <Method void SecurityException(String)>
	//   11   22:athrow          
		if(!providerinfo.grantUriPermissions)
	//*  12   23:aload_2         
	//*  13   24:getfield        #240 <Field boolean ProviderInfo.grantUriPermissions>
	//*  14   27:ifne            40
		{
			throw new SecurityException("Provider must grant uri permissions");
	//   15   30:new             #234 <Class SecurityException>
	//   16   33:dup             
	//   17   34:ldc1            #242 <String "Provider must grant uri permissions">
	//   18   36:invokespecial   #237 <Method void SecurityException(String)>
	//   19   39:athrow          
		} else
		{
			mStrategy = getPathStrategy(context, providerinfo.authority);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:getfield        #245 <Field String ProviderInfo.authority>
	//   24   46:invokestatic    #121 <Method FileProvider$PathStrategy getPathStrategy(Context, String)>
	//   25   49:putfield        #247 <Field FileProvider$PathStrategy mStrategy>
			return;
	//   26   52:return          
		}
	}

	public int delete(Uri uri, String s, String as[])
	{
		return !mStrategy.getFileForUri(uri).delete() ? 0 : 1;
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field FileProvider$PathStrategy mStrategy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #253 <Method File FileProvider$PathStrategy.getFileForUri(Uri)>
	//    4   10:invokevirtual   #256 <Method boolean File.delete()>
	//    5   13:ifeq            18
	//    6   16:iconst_1        
	//    7   17:ireturn         
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	public String getType(Uri uri)
	{
		uri = ((Uri) (mStrategy.getFileForUri(uri)));
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field FileProvider$PathStrategy mStrategy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #253 <Method File FileProvider$PathStrategy.getFileForUri(Uri)>
	//    4   10:astore_1        
		int i = ((File) (uri)).getName().lastIndexOf('.');
	//    5   11:aload_1         
	//    6   12:invokevirtual   #259 <Method String File.getName()>
	//    7   15:bipush          46
	//    8   17:invokevirtual   #263 <Method int String.lastIndexOf(int)>
	//    9   20:istore_2        
		if(i >= 0)
	//*  10   21:iload_2         
	//*  11   22:iflt            50
		{
			uri = ((Uri) (((File) (uri)).getName().substring(i + 1)));
	//   12   25:aload_1         
	//   13   26:invokevirtual   #259 <Method String File.getName()>
	//   14   29:iload_2         
	//   15   30:iconst_1        
	//   16   31:iadd            
	//   17   32:invokevirtual   #267 <Method String String.substring(int)>
	//   18   35:astore_1        
			uri = ((Uri) (MimeTypeMap.getSingleton().getMimeTypeFromExtension(((String) (uri)))));
	//   19   36:invokestatic    #273 <Method MimeTypeMap MimeTypeMap.getSingleton()>
	//   20   39:aload_1         
	//   21   40:invokevirtual   #277 <Method String MimeTypeMap.getMimeTypeFromExtension(String)>
	//   22   43:astore_1        
			if(uri != null)
	//*  23   44:aload_1         
	//*  24   45:ifnull          50
				return ((String) (uri));
	//   25   48:aload_1         
	//   26   49:areturn         
		}
		return "application/octet-stream";
	//   27   50:ldc2            #279 <String "application/octet-stream">
	//   28   53:areturn         
	}

	public Uri insert(Uri uri, ContentValues contentvalues)
	{
		throw new UnsupportedOperationException("No external inserts");
	//    0    0:new             #283 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #285 <String "No external inserts">
	//    3    7:invokespecial   #286 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public boolean onCreate()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public ParcelFileDescriptor openFile(Uri uri, String s)
		throws FileNotFoundException
	{
		return ParcelFileDescriptor.open(mStrategy.getFileForUri(uri), modeToMode(s));
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field FileProvider$PathStrategy mStrategy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #253 <Method File FileProvider$PathStrategy.getFileForUri(Uri)>
	//    4   10:aload_2         
	//    5   11:invokestatic    #293 <Method int modeToMode(String)>
	//    6   14:invokestatic    #299 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//    7   17:areturn         
	}

	public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		s = ((String) (mStrategy.getFileForUri(uri)));
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field FileProvider$PathStrategy mStrategy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #253 <Method File FileProvider$PathStrategy.getFileForUri(Uri)>
	//    4   10:astore_3        
		uri = ((Uri) (as));
	//    5   11:aload_2         
	//    6   12:astore_1        
		if(as == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       21
			uri = ((Uri) (COLUMNS));
	//    9   17:getstatic       #59  <Field String[] COLUMNS>
	//   10   20:astore_1        
		as1 = new String[uri.length];
	//   11   21:aload_1         
	//   12   22:arraylength     
	//   13   23:anewarray       String[]
	//   14   26:astore          4
		as = ((String []) (new Object[uri.length]));
	//   15   28:aload_1         
	//   16   29:arraylength     
	//   17   30:anewarray       Object[]
	//   18   33:astore_2        
		int i1 = uri.length;
	//   19   34:aload_1         
	//   20   35:arraylength     
	//   21   36:istore          9
		int j = 0;
	//   22   38:iconst_0        
	//   23   39:istore          7
		int i = 0;
	//   24   41:iconst_0        
	//   25   42:istore          6
		while(j < i1) 
	//*  26   44:iload           7
	//*  27   46:iload           9
	//*  28   48:icmpge          142
		{
			s1 = ((String) (uri[j]));
	//   29   51:aload_1         
	//   30   52:iload           7
	//   31   54:aaload          
	//   32   55:astore          5
			if("_display_name".equals(((Object) (s1))))
	//*  33   57:ldc1            #55  <String "_display_name">
	//*  34   59:aload           5
	//*  35   61:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  36   64:ifeq            101
			{
				as1[i] = "_display_name";
	//   37   67:aload           4
	//   38   69:iload           6
	//   39   71:ldc1            #55  <String "_display_name">
	//   40   73:aastore         
				int k = i + 1;
	//   41   74:iload           6
	//   42   76:iconst_1        
	//   43   77:iadd            
	//   44   78:istore          8
				as[i] = ((File) (s)).getName();
	//   45   80:aload_2         
	//   46   81:iload           6
	//   47   83:aload_3         
	//   48   84:invokevirtual   #259 <Method String File.getName()>
	//   49   87:aastore         
				i = k;
	//   50   88:iload           8
	//   51   90:istore          6
			} else
	//*  52   92:iload           7
	//*  53   94:iconst_1        
	//*  54   95:iadd            
	//*  55   96:istore          7
	//*  56   98:goto            44
			if("_size".equals(((Object) (s1))))
	//*  57  101:ldc1            #57  <String "_size">
	//*  58  103:aload           5
	//*  59  105:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  60  108:ifeq            174
			{
				as1[i] = "_size";
	//   61  111:aload           4
	//   62  113:iload           6
	//   63  115:ldc1            #57  <String "_size">
	//   64  117:aastore         
				int l = i + 1;
	//   65  118:iload           6
	//   66  120:iconst_1        
	//   67  121:iadd            
	//   68  122:istore          8
				as[i] = ((String) (Long.valueOf(((File) (s)).length())));
	//   69  124:aload_2         
	//   70  125:iload           6
	//   71  127:aload_3         
	//   72  128:invokevirtual   #305 <Method long File.length()>
	//   73  131:invokestatic    #311 <Method Long Long.valueOf(long)>
	//   74  134:aastore         
				i = l;
	//   75  135:iload           8
	//   76  137:istore          6
			}
			j++;
		}
	//*  77  139:goto            92
		uri = ((Uri) (copyOf(as1, i)));
	//   78  142:aload           4
	//   79  144:iload           6
	//   80  146:invokestatic    #313 <Method String[] copyOf(String[], int)>
	//   81  149:astore_1        
		as = ((String []) (copyOf(((Object []) (as)), i)));
	//   82  150:aload_2         
	//   83  151:iload           6
	//   84  153:invokestatic    #315 <Method Object[] copyOf(Object[], int)>
	//   85  156:astore_2        
		uri = ((Uri) (new MatrixCursor(((String []) (uri)), 1)));
	//   86  157:new             #317 <Class MatrixCursor>
	//   87  160:dup             
	//   88  161:aload_1         
	//   89  162:iconst_1        
	//   90  163:invokespecial   #320 <Method void MatrixCursor(String[], int)>
	//   91  166:astore_1        
		((MatrixCursor) (uri)).addRow(((Object []) (as)));
	//   92  167:aload_1         
	//   93  168:aload_2         
	//   94  169:invokevirtual   #324 <Method void MatrixCursor.addRow(Object[])>
		return ((Cursor) (uri));
	//   95  172:aload_1         
	//   96  173:areturn         
	//*  97  174:goto            92
	}

	public int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		throw new UnsupportedOperationException("No external updates");
	//    0    0:new             #283 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #328 <String "No external updates">
	//    3    7:invokespecial   #286 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	private static final String ATTR_NAME = "name";
	private static final String ATTR_PATH = "path";
	private static final String COLUMNS[] = {
		"_display_name", "_size"
	};
	private static final File DEVICE_ROOT = new File("/");
	private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
	private static final String TAG_CACHE_PATH = "cache-path";
	private static final String TAG_EXTERNAL = "external-path";
	private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
	private static final String TAG_EXTERNAL_FILES = "external-files-path";
	private static final String TAG_FILES_PATH = "files-path";
	private static final String TAG_ROOT_PATH = "root-path";
	private static HashMap sCache = new HashMap();
	private PathStrategy mStrategy;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #55  <String "_display_name">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #57  <String "_size">
	//    9   13:aastore         
	//   10   14:putstatic       #59  <Field String[] COLUMNS>
	//   11   17:new             #61  <Class File>
	//   12   20:dup             
	//   13   21:ldc1            #63  <String "/">
	//   14   23:invokespecial   #67  <Method void File(String)>
	//   15   26:putstatic       #69  <Field File DEVICE_ROOT>
	//   16   29:new             #71  <Class HashMap>
	//   17   32:dup             
	//   18   33:invokespecial   #73  <Method void HashMap()>
	//   19   36:putstatic       #75  <Field HashMap sCache>
	//*  20   39:return          
	}
}
