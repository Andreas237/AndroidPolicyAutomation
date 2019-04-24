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

		void addRoot(String s, File file)
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
				StringBuilder stringbuilder = new StringBuilder();
		//   19   34:new             #55  <Class StringBuilder>
		//   20   37:dup             
		//   21   38:invokespecial   #56  <Method void StringBuilder()>
		//   22   41:astore_3        
				stringbuilder.append("Failed to resolve canonical path for ");
		//   23   42:aload_3         
		//   24   43:ldc1            #58  <String "Failed to resolve canonical path for ">
		//   25   45:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   26   48:pop             
				stringbuilder.append(((Object) (file)));
		//   27   49:aload_3         
		//   28   50:aload_2         
		//   29   51:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   30   54:pop             
				throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (s)));
		//   31   55:new             #39  <Class IllegalArgumentException>
		//   32   58:dup             
		//   33   59:aload_3         
		//   34   60:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   35   63:aload_1         
		//   36   64:invokespecial   #72  <Method void IllegalArgumentException(String, Throwable)>
		//   37   67:athrow          
			}
			mRoots.put(((Object) (s)), ((Object) (file1)));
		}

		public File getFileForUri(Uri uri)
		{
			IOException ioexception;
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
		//*  28   52:ifnonnull       88
			{
				obj = ((Object) (new StringBuilder()));
		//   29   55:new             #55  <Class StringBuilder>
		//   30   58:dup             
		//   31   59:invokespecial   #56  <Method void StringBuilder()>
		//   32   62:astore_3        
				((StringBuilder) (obj)).append("Unable to find configured root for ");
		//   33   63:aload_3         
		//   34   64:ldc1            #102 <String "Unable to find configured root for ">
		//   35   66:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   36   69:pop             
				((StringBuilder) (obj)).append(((Object) (uri)));
		//   37   70:aload_3         
		//   38   71:aload_1         
		//   39   72:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   40   75:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
		//   41   76:new             #39  <Class IllegalArgumentException>
		//   42   79:dup             
		//   43   80:aload_3         
		//   44   81:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   45   84:invokespecial   #43  <Method void IllegalArgumentException(String)>
		//   46   87:athrow          
			}
			uri = ((Uri) (new File(((File) (obj)), ((String) (obj1)))));
		//   47   88:new             #45  <Class File>
		//   48   91:dup             
		//   49   92:aload_3         
		//   50   93:aload           4
		//   51   95:invokespecial   #105 <Method void File(File, String)>
		//   52   98:astore_1        
			try
			{
				obj1 = ((Object) (((File) (uri)).getCanonicalFile()));
		//   53   99:aload_1         
		//   54  100:invokevirtual   #49  <Method File File.getCanonicalFile()>
		//   55  103:astore          4
			}
		//*  56  105:aload           4
		//*  57  107:invokevirtual   #108 <Method String File.getPath()>
		//*  58  110:aload_3         
		//*  59  111:invokevirtual   #108 <Method String File.getPath()>
		//*  60  114:invokevirtual   #112 <Method boolean String.startsWith(String)>
		//*  61  117:ifne            130
		//*  62  120:new             #114 <Class SecurityException>
		//*  63  123:dup             
		//*  64  124:ldc1            #116 <String "Resolved path jumped beyond configured root">
		//*  65  126:invokespecial   #117 <Method void SecurityException(String)>
		//*  66  129:athrow          
		//*  67  130:aload           4
		//*  68  132:areturn         
		//*  69  133:new             #55  <Class StringBuilder>
		//*  70  136:dup             
		//*  71  137:invokespecial   #56  <Method void StringBuilder()>
		//*  72  140:astore_3        
		//*  73  141:aload_3         
		//*  74  142:ldc1            #58  <String "Failed to resolve canonical path for ">
		//*  75  144:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//*  76  147:pop             
		//*  77  148:aload_3         
		//*  78  149:aload_1         
		//*  79  150:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//*  80  153:pop             
		//*  81  154:new             #39  <Class IllegalArgumentException>
		//*  82  157:dup             
		//*  83  158:aload_3         
		//*  84  159:invokevirtual   #69  <Method String StringBuilder.toString()>
		//*  85  162:invokespecial   #43  <Method void IllegalArgumentException(String)>
		//*  86  165:athrow          
			// Misplaced declaration of an exception variable
			catch(IOException ioexception)
			{
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append("Failed to resolve canonical path for ");
				((StringBuilder) (obj)).append(((Object) (uri)));
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
			}
			if(!((File) (obj1)).getPath().startsWith(((File) (obj)).getPath()))
				throw new SecurityException("Resolved path jumped beyond configured root");
			else
				return ((File) (obj1));
		//*  87  166:astore_3        
		//*  88  167:goto            133
		}

		public Uri getUriForFile(File file)
		{
			IOException ioexception;
			Object obj;
			Object obj1;
			Iterator iterator;
			try
			{
				obj1 = ((Object) (file.getCanonicalPath()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #122 <Method String File.getCanonicalPath()>
		//    2    4:astore_3        
			}
		//*   3    5:aconst_null     
		//*   4    6:astore_1        
		//*   5    7:aload_0         
		//*   6    8:getfield        #24  <Field HashMap mRoots>
		//*   7   11:invokevirtual   #126 <Method Set HashMap.entrySet()>
		//*   8   14:invokeinterface #132 <Method Iterator Set.iterator()>
		//*   9   19:astore          4
		//*  10   21:aload           4
		//*  11   23:invokeinterface #138 <Method boolean Iterator.hasNext()>
		//*  12   28:ifeq            97
		//*  13   31:aload           4
		//*  14   33:invokeinterface #142 <Method Object Iterator.next()>
		//*  15   38:checkcast       #144 <Class java.util.Map$Entry>
		//*  16   41:astore_2        
		//*  17   42:aload_2         
		//*  18   43:invokeinterface #147 <Method Object java.util.Map$Entry.getValue()>
		//*  19   48:checkcast       #45  <Class File>
		//*  20   51:invokevirtual   #108 <Method String File.getPath()>
		//*  21   54:astore          5
		//*  22   56:aload_3         
		//*  23   57:aload           5
		//*  24   59:invokevirtual   #112 <Method boolean String.startsWith(String)>
		//*  25   62:ifeq            21
		//*  26   65:aload_1         
		//*  27   66:ifnull          92
		//*  28   69:aload           5
		//*  29   71:invokevirtual   #151 <Method int String.length()>
		//*  30   74:aload_1         
		//*  31   75:invokeinterface #147 <Method Object java.util.Map$Entry.getValue()>
		//*  32   80:checkcast       #45  <Class File>
		//*  33   83:invokevirtual   #108 <Method String File.getPath()>
		//*  34   86:invokevirtual   #151 <Method int String.length()>
		//*  35   89:icmple          21
		//*  36   92:aload_2         
		//*  37   93:astore_1        
		//*  38   94:goto            21
		//*  39   97:aload_1         
		//*  40   98:ifnonnull       134
		//*  41  101:new             #55  <Class StringBuilder>
		//*  42  104:dup             
		//*  43  105:invokespecial   #56  <Method void StringBuilder()>
		//*  44  108:astore_1        
		//*  45  109:aload_1         
		//*  46  110:ldc1            #153 <String "Failed to find configured root that contains ">
		//*  47  112:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//*  48  115:pop             
		//*  49  116:aload_1         
		//*  50  117:aload_3         
		//*  51  118:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//*  52  121:pop             
		//*  53  122:new             #39  <Class IllegalArgumentException>
		//*  54  125:dup             
		//*  55  126:aload_1         
		//*  56  127:invokevirtual   #69  <Method String StringBuilder.toString()>
		//*  57  130:invokespecial   #43  <Method void IllegalArgumentException(String)>
		//*  58  133:athrow          
		//*  59  134:aload_1         
		//*  60  135:invokeinterface #147 <Method Object java.util.Map$Entry.getValue()>
		//*  61  140:checkcast       #45  <Class File>
		//*  62  143:invokevirtual   #108 <Method String File.getPath()>
		//*  63  146:astore_2        
		//*  64  147:aload_2         
		//*  65  148:ldc1            #155 <String "/">
		//*  66  150:invokevirtual   #158 <Method boolean String.endsWith(String)>
		//*  67  153:ifeq            168
		//*  68  156:aload_3         
		//*  69  157:aload_2         
		//*  70  158:invokevirtual   #151 <Method int String.length()>
		//*  71  161:invokevirtual   #96  <Method String String.substring(int)>
		//*  72  164:astore_2        
		//*  73  165:goto            179
		//*  74  168:aload_3         
		//*  75  169:aload_2         
		//*  76  170:invokevirtual   #151 <Method int String.length()>
		//*  77  173:iconst_1        
		//*  78  174:iadd            
		//*  79  175:invokevirtual   #96  <Method String String.substring(int)>
		//*  80  178:astore_2        
		//*  81  179:new             #55  <Class StringBuilder>
		//*  82  182:dup             
		//*  83  183:invokespecial   #56  <Method void StringBuilder()>
		//*  84  186:astore_3        
		//*  85  187:aload_3         
		//*  86  188:aload_1         
		//*  87  189:invokeinterface #161 <Method Object java.util.Map$Entry.getKey()>
		//*  88  194:checkcast       #81  <Class String>
		//*  89  197:invokestatic    #164 <Method String Uri.encode(String)>
		//*  90  200:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//*  91  203:pop             
		//*  92  204:aload_3         
		//*  93  205:bipush          47
		//*  94  207:invokevirtual   #167 <Method StringBuilder StringBuilder.append(char)>
		//*  95  210:pop             
		//*  96  211:aload_3         
		//*  97  212:aload_2         
		//*  98  213:ldc1            #155 <String "/">
		//*  99  215:invokestatic    #170 <Method String Uri.encode(String, String)>
		//* 100  218:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//* 101  221:pop             
		//* 102  222:aload_3         
		//* 103  223:invokevirtual   #69  <Method String StringBuilder.toString()>
		//* 104  226:astore_1        
		//* 105  227:new             #172 <Class android.net.Uri$Builder>
		//* 106  230:dup             
		//* 107  231:invokespecial   #173 <Method void android.net.Uri$Builder()>
		//* 108  234:ldc1            #175 <String "content">
		//* 109  236:invokevirtual   #179 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
		//* 110  239:aload_0         
		//* 111  240:getfield        #26  <Field String mAuthority>
		//* 112  243:invokevirtual   #182 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
		//* 113  246:aload_1         
		//* 114  247:invokevirtual   #185 <Method android.net.Uri$Builder android.net.Uri$Builder.encodedPath(String)>
		//* 115  250:invokevirtual   #189 <Method Uri android.net.Uri$Builder.build()>
		//* 116  253:areturn         
		//* 117  254:new             #55  <Class StringBuilder>
		//* 118  257:dup             
		//* 119  258:invokespecial   #56  <Method void StringBuilder()>
		//* 120  261:astore_2        
		//* 121  262:aload_2         
		//* 122  263:ldc1            #58  <String "Failed to resolve canonical path for ">
		//* 123  265:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//* 124  268:pop             
		//* 125  269:aload_2         
		//* 126  270:aload_1         
		//* 127  271:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//* 128  274:pop             
		//* 129  275:new             #39  <Class IllegalArgumentException>
		//* 130  278:dup             
		//* 131  279:aload_2         
		//* 132  280:invokevirtual   #69  <Method String StringBuilder.toString()>
		//* 133  283:invokespecial   #43  <Method void IllegalArgumentException(String)>
		//* 134  286:athrow          
			// Misplaced declaration of an exception variable
			catch(IOException ioexception)
			{
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append("Failed to resolve canonical path for ");
				((StringBuilder) (obj)).append(((Object) (file)));
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
			}
			file = null;
			iterator = mRoots.entrySet().iterator();
			do
			{
				if(!iterator.hasNext())
					break;
				java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
				String s = ((File)entry.getValue()).getPath();
				if(((String) (obj1)).startsWith(s) && (file == null || s.length() > ((File)((java.util.Map.Entry) (file)).getValue()).getPath().length()))
					file = ((File) (entry));
			} while(true);
			if(file == null)
			{
				file = ((File) (new StringBuilder()));
				((StringBuilder) (file)).append("Failed to find configured root that contains ");
				((StringBuilder) (file)).append(((String) (obj1)));
				throw new IllegalArgumentException(((StringBuilder) (file)).toString());
			}
			obj = ((Object) (((File)((java.util.Map.Entry) (file)).getValue()).getPath()));
			if(((String) (obj)).endsWith("/"))
				obj = ((Object) (((String) (obj1)).substring(((String) (obj)).length())));
			else
				obj = ((Object) (((String) (obj1)).substring(((String) (obj)).length() + 1)));
			obj1 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj1)).append(Uri.encode((String)((java.util.Map.Entry) (file)).getKey()));
			((StringBuilder) (obj1)).append('/');
			((StringBuilder) (obj1)).append(Uri.encode(((String) (obj)), "/"));
			file = ((File) (((StringBuilder) (obj1)).toString()));
			return (new android.net.Uri.Builder()).scheme("content").authority(mAuthority).encodedPath(((String) (file))).build();
		//* 135  287:astore_2        
		//* 136  288:goto            254
		}

		private final String mAuthority;
		private final HashMap mRoots = new HashMap();

		SimplePathStrategy(String s)
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
	//    1    1:invokespecial   #80  <Method void ContentProvider()>
	//    2    4:return          
	}

	private static transient File buildPath(File file, String as[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = as.length; i < j;)
	//*   2    2:aload_1         
	//*   3    3:arraylength     
	//*   4    4:istore_3        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          45
		{
			String s = as[i];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          5
			File file1 = file;
	//   12   15:aload_0         
	//   13   16:astore          4
			if(s != null)
	//*  14   18:aload           5
	//*  15   20:ifnull          35
				file1 = new File(file, s);
	//   16   23:new             #64  <Class File>
	//   17   26:dup             
	//   18   27:aload_0         
	//   19   28:aload           5
	//   20   30:invokespecial   #85  <Method void File(File, String)>
	//   21   33:astore          4
			i++;
	//   22   35:iload_2         
	//   23   36:iconst_1        
	//   24   37:iadd            
	//   25   38:istore_2        
			file = file1;
	//   26   39:aload           4
	//   27   41:astore_0        
		}

	//*  28   42:goto            5
		return file;
	//   29   45:aload_0         
	//   30   46:areturn         
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
	//    8   10:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//    8   10:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
		return as1;
	//    9   13:aload_2         
	//   10   14:areturn         
	}

	private static PathStrategy getPathStrategy(Context context, String s)
	{
		HashMap hashmap = sCache;
	//    0    0:getstatic       #78  <Field HashMap sCache>
	//    1    3:astore          4
		hashmap;
	//    2    5:aload           4
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		PathStrategy pathstrategy1 = (PathStrategy)sCache.get(((Object) (s)));
	//    4    8:getstatic       #78  <Field HashMap sCache>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #106 <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #6   <Class FileProvider$PathStrategy>
	//    8   18:astore_3        
		PathStrategy pathstrategy;
		pathstrategy = pathstrategy1;
	//    9   19:aload_3         
	//   10   20:astore_2        
		if(pathstrategy1 != null)
			break MISSING_BLOCK_LABEL_67;
	//   11   21:aload_3         
	//   12   22:ifnonnull       67
		pathstrategy = parsePathStrategy(context, s);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokestatic    #109 <Method FileProvider$PathStrategy parsePathStrategy(Context, String)>
	//   16   30:astore_2        
		sCache.put(((Object) (s)), ((Object) (pathstrategy)));
	//   17   31:getstatic       #78  <Field HashMap sCache>
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokevirtual   #113 <Method Object HashMap.put(Object, Object)>
	//   21   39:pop             
		break MISSING_BLOCK_LABEL_67;
	//   22   40:goto            67
		context;
	//   23   43:astore_0        
		throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", ((Throwable) (context)));
	//   24   44:new             #115 <Class IllegalArgumentException>
	//   25   47:dup             
	//   26   48:ldc1            #117 <String "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data">
	//   27   50:aload_0         
	//   28   51:invokespecial   #120 <Method void IllegalArgumentException(String, Throwable)>
	//   29   54:athrow          
		context;
	//   30   55:astore_0        
		throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", ((Throwable) (context)));
	//   31   56:new             #115 <Class IllegalArgumentException>
	//   32   59:dup             
	//   33   60:ldc1            #117 <String "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data">
	//   34   62:aload_0         
	//   35   63:invokespecial   #120 <Method void IllegalArgumentException(String, Throwable)>
	//   36   66:athrow          
		hashmap;
	//   37   67:aload           4
		JVM INSTR monitorexit ;
	//   38   69:monitorexit     
		return pathstrategy;
	//   39   70:aload_2         
	//   40   71:areturn         
		context;
	//   41   72:astore_0        
		hashmap;
	//   42   73:aload           4
		JVM INSTR monitorexit ;
	//   43   75:monitorexit     
		throw context;
	//   44   76:aload_0         
	//   45   77:athrow          
	}

	public static Uri getUriForFile(Context context, String s, File file)
	{
		return getPathStrategy(context, s).getUriForFile(file);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #125 <Method FileProvider$PathStrategy getPathStrategy(Context, String)>
	//    3    5:aload_2         
	//    4    6:invokeinterface #128 <Method Uri FileProvider$PathStrategy.getUriForFile(File)>
	//    5   11:areturn         
	}

	private static int modeToMode(String s)
	{
		if("r".equals(((Object) (s))))
	//*   0    0:ldc1            #133 <String "r">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            12
			return 0x10000000;
	//    4    9:ldc1            #138 <Int 0x10000000>
	//    5   11:ireturn         
		if(!"w".equals(((Object) (s))) && !"wt".equals(((Object) (s))))
	//*   6   12:ldc1            #140 <String "w">
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*   9   18:ifne            102
	//*  10   21:ldc1            #142 <String "wt">
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  13   27:ifeq            33
	//*  14   30:goto            102
		{
			if("wa".equals(((Object) (s))))
	//*  15   33:ldc1            #144 <String "wa">
	//*  16   35:aload_0         
	//*  17   36:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  18   39:ifeq            45
				return 0x2a000000;
	//   19   42:ldc1            #145 <Int 0x2a000000>
	//   20   44:ireturn         
			if("rw".equals(((Object) (s))))
	//*  21   45:ldc1            #147 <String "rw">
	//*  22   47:aload_0         
	//*  23   48:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  24   51:ifeq            57
				return 0x38000000;
	//   25   54:ldc1            #148 <Int 0x38000000>
	//   26   56:ireturn         
			if("rwt".equals(((Object) (s))))
	//*  27   57:ldc1            #150 <String "rwt">
	//*  28   59:aload_0         
	//*  29   60:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  30   63:ifeq            69
			{
				return 0x3c000000;
	//   31   66:ldc1            #151 <Int 0x3c000000>
	//   32   68:ireturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   33   69:new             #153 <Class StringBuilder>
	//   34   72:dup             
	//   35   73:invokespecial   #154 <Method void StringBuilder()>
	//   36   76:astore_1        
				stringbuilder.append("Invalid mode: ");
	//   37   77:aload_1         
	//   38   78:ldc1            #156 <String "Invalid mode: ">
	//   39   80:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   40   83:pop             
				stringbuilder.append(s);
	//   41   84:aload_1         
	//   42   85:aload_0         
	//   43   86:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   44   89:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   45   90:new             #115 <Class IllegalArgumentException>
	//   46   93:dup             
	//   47   94:aload_1         
	//   48   95:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   49   98:invokespecial   #165 <Method void IllegalArgumentException(String)>
	//   50  101:athrow          
			}
		} else
		{
			return 0x2c000000;
	//   51  102:ldc1            #166 <Int 0x2c000000>
	//   52  104:ireturn         
		}
	}

	private static PathStrategy parsePathStrategy(Context context, String s)
		throws IOException, XmlPullParserException
	{
		SimplePathStrategy simplepathstrategy = new SimplePathStrategy(s);
	//    0    0:new             #9   <Class FileProvider$SimplePathStrategy>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #167 <Method void FileProvider$SimplePathStrategy(String)>
	//    4    8:astore          4
		XmlResourceParser xmlresourceparser = context.getPackageManager().resolveContentProvider(s, 128).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
	//    5   10:aload_0         
	//    6   11:invokevirtual   #173 <Method PackageManager Context.getPackageManager()>
	//    7   14:aload_1         
	//    8   15:sipush          128
	//    9   18:invokevirtual   #179 <Method ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #173 <Method PackageManager Context.getPackageManager()>
	//   12   25:ldc1            #24  <String "android.support.FILE_PROVIDER_PATHS">
	//   13   27:invokevirtual   #185 <Method XmlResourceParser ProviderInfo.loadXmlMetaData(PackageManager, String)>
	//   14   30:astore          5
		if(xmlresourceparser == null)
	//*  15   32:aload           5
	//*  16   34:ifnonnull       47
			throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
	//   17   37:new             #115 <Class IllegalArgumentException>
	//   18   40:dup             
	//   19   41:ldc1            #187 <String "Missing android.support.FILE_PROVIDER_PATHS meta-data">
	//   20   43:invokespecial   #165 <Method void IllegalArgumentException(String)>
	//   21   46:athrow          
		do
		{
			int i = xmlresourceparser.next();
	//   22   47:aload           5
	//   23   49:invokeinterface #193 <Method int XmlResourceParser.next()>
	//   24   54:istore_2        
			if(i == 1)
				break;
	//   25   55:iload_2         
	//   26   56:iconst_1        
	//   27   57:icmpeq          303
			if(i == 2)
	//*  28   60:iload_2         
	//*  29   61:iconst_2        
	//*  30   62:icmpne          47
			{
				Object obj1 = ((Object) (xmlresourceparser.getName()));
	//   31   65:aload           5
	//   32   67:invokeinterface #196 <Method String XmlResourceParser.getName()>
	//   33   72:astore          8
				Object obj = null;
	//   34   74:aconst_null     
	//   35   75:astore_3        
				String s1 = xmlresourceparser.getAttributeValue(((String) (null)), "name");
	//   36   76:aload           5
	//   37   78:aconst_null     
	//   38   79:ldc1            #14  <String "name">
	//   39   81:invokeinterface #200 <Method String XmlResourceParser.getAttributeValue(String, String)>
	//   40   86:astore          6
				String s2 = xmlresourceparser.getAttributeValue(((String) (null)), "path");
	//   41   88:aload           5
	//   42   90:aconst_null     
	//   43   91:ldc1            #17  <String "path">
	//   44   93:invokeinterface #200 <Method String XmlResourceParser.getAttributeValue(String, String)>
	//   45   98:astore          7
				if("root-path".equals(obj1))
	//*  46  100:ldc1            #45  <String "root-path">
	//*  47  102:aload           8
	//*  48  104:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  49  107:ifeq            117
					s = ((String) (DEVICE_ROOT));
	//   50  110:getstatic       #72  <Field File DEVICE_ROOT>
	//   51  113:astore_1        
				else
	//*  52  114:goto            276
				if("files-path".equals(obj1))
	//*  53  117:ldc1            #42  <String "files-path">
	//*  54  119:aload           8
	//*  55  121:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  56  124:ifeq            135
					s = ((String) (context.getFilesDir()));
	//   57  127:aload_0         
	//   58  128:invokevirtual   #204 <Method File Context.getFilesDir()>
	//   59  131:astore_1        
				else
	//*  60  132:goto            276
				if("cache-path".equals(obj1))
	//*  61  135:ldc1            #27  <String "cache-path">
	//*  62  137:aload           8
	//*  63  139:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  64  142:ifeq            153
					s = ((String) (context.getCacheDir()));
	//   65  145:aload_0         
	//   66  146:invokevirtual   #207 <Method File Context.getCacheDir()>
	//   67  149:astore_1        
				else
	//*  68  150:goto            276
				if("external-path".equals(obj1))
	//*  69  153:ldc1            #30  <String "external-path">
	//*  70  155:aload           8
	//*  71  157:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  72  160:ifeq            170
					s = ((String) (Environment.getExternalStorageDirectory()));
	//   73  163:invokestatic    #212 <Method File Environment.getExternalStorageDirectory()>
	//   74  166:astore_1        
				else
	//*  75  167:goto            276
				if("external-files-path".equals(obj1))
	//*  76  170:ldc1            #36  <String "external-files-path">
	//*  77  172:aload           8
	//*  78  174:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  79  177:ifeq            203
				{
					obj1 = ((Object) (ContextCompat.getExternalFilesDirs(context, ((String) (null)))));
	//   80  180:aload_0         
	//   81  181:aconst_null     
	//   82  182:invokestatic    #218 <Method File[] ContextCompat.getExternalFilesDirs(Context, String)>
	//   83  185:astore          8
					s = ((String) (obj));
	//   84  187:aload_3         
	//   85  188:astore_1        
					if(obj1.length > 0)
	//*  86  189:aload           8
	//*  87  191:arraylength     
	//*  88  192:ifle            276
						s = ((String) (obj1[0]));
	//   89  195:aload           8
	//   90  197:iconst_0        
	//   91  198:aaload          
	//   92  199:astore_1        
				} else
	//*  93  200:goto            276
				if("external-cache-path".equals(obj1))
	//*  94  203:ldc1            #33  <String "external-cache-path">
	//*  95  205:aload           8
	//*  96  207:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  97  210:ifeq            235
				{
					obj1 = ((Object) (ContextCompat.getExternalCacheDirs(context)));
	//   98  213:aload_0         
	//   99  214:invokestatic    #222 <Method File[] ContextCompat.getExternalCacheDirs(Context)>
	//  100  217:astore          8
					s = ((String) (obj));
	//  101  219:aload_3         
	//  102  220:astore_1        
					if(obj1.length > 0)
	//* 103  221:aload           8
	//* 104  223:arraylength     
	//* 105  224:ifle            276
						s = ((String) (obj1[0]));
	//  106  227:aload           8
	//  107  229:iconst_0        
	//  108  230:aaload          
	//  109  231:astore_1        
				} else
	//* 110  232:goto            276
				{
					s = ((String) (obj));
	//  111  235:aload_3         
	//  112  236:astore_1        
					if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 113  237:getstatic       #228 <Field int android.os.Build$VERSION.SDK_INT>
	//* 114  240:bipush          21
	//* 115  242:icmplt          276
					{
						s = ((String) (obj));
	//  116  245:aload_3         
	//  117  246:astore_1        
						if("external-media-path".equals(obj1))
	//* 118  247:ldc1            #39  <String "external-media-path">
	//* 119  249:aload           8
	//* 120  251:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 121  254:ifeq            276
						{
							File afile[] = context.getExternalMediaDirs();
	//  122  257:aload_0         
	//  123  258:invokevirtual   #232 <Method File[] Context.getExternalMediaDirs()>
	//  124  261:astore          8
							s = ((String) (obj));
	//  125  263:aload_3         
	//  126  264:astore_1        
							if(afile.length > 0)
	//* 127  265:aload           8
	//* 128  267:arraylength     
	//* 129  268:ifle            276
								s = ((String) (afile[0]));
	//  130  271:aload           8
	//  131  273:iconst_0        
	//  132  274:aaload          
	//  133  275:astore_1        
						}
					}
				}
				if(s != null)
	//* 134  276:aload_1         
	//* 135  277:ifnull          47
					simplepathstrategy.addRoot(s1, buildPath(((File) (s)), new String[] {
						s2
					}));
	//  136  280:aload           4
	//  137  282:aload           6
	//  138  284:aload_1         
	//  139  285:iconst_1        
	//  140  286:anewarray       String[]
	//  141  289:dup             
	//  142  290:iconst_0        
	//  143  291:aload           7
	//  144  293:aastore         
	//  145  294:invokestatic    #234 <Method File buildPath(File, String[])>
	//  146  297:invokevirtual   #238 <Method void FileProvider$SimplePathStrategy.addRoot(String, File)>
			}
		} while(true);
	//  147  300:goto            47
		return ((PathStrategy) (simplepathstrategy));
	//  148  303:aload           4
	//  149  305:areturn         
	}

	public void attachInfo(Context context, ProviderInfo providerinfo)
	{
		super.attachInfo(context, providerinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #243 <Method void ContentProvider.attachInfo(Context, ProviderInfo)>
		if(providerinfo.exported)
	//*   4    6:aload_2         
	//*   5    7:getfield        #247 <Field boolean ProviderInfo.exported>
	//*   6   10:ifeq            23
			throw new SecurityException("Provider must not be exported");
	//    7   13:new             #249 <Class SecurityException>
	//    8   16:dup             
	//    9   17:ldc1            #251 <String "Provider must not be exported">
	//   10   19:invokespecial   #252 <Method void SecurityException(String)>
	//   11   22:athrow          
		if(!providerinfo.grantUriPermissions)
	//*  12   23:aload_2         
	//*  13   24:getfield        #255 <Field boolean ProviderInfo.grantUriPermissions>
	//*  14   27:ifne            41
		{
			throw new SecurityException("Provider must grant uri permissions");
	//   15   30:new             #249 <Class SecurityException>
	//   16   33:dup             
	//   17   34:ldc2            #257 <String "Provider must grant uri permissions">
	//   18   37:invokespecial   #252 <Method void SecurityException(String)>
	//   19   40:athrow          
		} else
		{
			mStrategy = getPathStrategy(context, providerinfo.authority);
	//   20   41:aload_0         
	//   21   42:aload_1         
	//   22   43:aload_2         
	//   23   44:getfield        #260 <Field String ProviderInfo.authority>
	//   24   47:invokestatic    #125 <Method FileProvider$PathStrategy getPathStrategy(Context, String)>
	//   25   50:putfield        #262 <Field FileProvider$PathStrategy mStrategy>
			return;
	//   26   53:return          
		}
	}

	public int delete(Uri uri, String s, String as[])
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #267 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #269 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #272 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public String getType(Uri uri)
	{
		uri = ((Uri) (mStrategy.getFileForUri(uri)));
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field FileProvider$PathStrategy mStrategy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #278 <Method File FileProvider$PathStrategy.getFileForUri(Uri)>
	//    4   10:astore_1        
		int i = ((File) (uri)).getName().lastIndexOf('.');
	//    5   11:aload_1         
	//    6   12:invokevirtual   #279 <Method String File.getName()>
	//    7   15:bipush          46
	//    8   17:invokevirtual   #283 <Method int String.lastIndexOf(int)>
	//    9   20:istore_2        
		if(i >= 0)
	//*  10   21:iload_2         
	//*  11   22:iflt            50
		{
			uri = ((Uri) (((File) (uri)).getName().substring(i + 1)));
	//   12   25:aload_1         
	//   13   26:invokevirtual   #279 <Method String File.getName()>
	//   14   29:iload_2         
	//   15   30:iconst_1        
	//   16   31:iadd            
	//   17   32:invokevirtual   #287 <Method String String.substring(int)>
	//   18   35:astore_1        
			uri = ((Uri) (MimeTypeMap.getSingleton().getMimeTypeFromExtension(((String) (uri)))));
	//   19   36:invokestatic    #293 <Method MimeTypeMap MimeTypeMap.getSingleton()>
	//   20   39:aload_1         
	//   21   40:invokevirtual   #297 <Method String MimeTypeMap.getMimeTypeFromExtension(String)>
	//   22   43:astore_1        
			if(uri != null)
	//*  23   44:aload_1         
	//*  24   45:ifnull          50
				return ((String) (uri));
	//   25   48:aload_1         
	//   26   49:areturn         
		}
		return "application/octet-stream";
	//   27   50:ldc2            #299 <String "application/octet-stream">
	//   28   53:areturn         
	}

	public Uri insert(Uri uri, ContentValues contentvalues)
	{
		throw new UnsupportedOperationException("No external inserts");
	//    0    0:new             #303 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #305 <String "No external inserts">
	//    3    7:invokespecial   #306 <Method void UnsupportedOperationException(String)>
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
	//    1    1:getfield        #262 <Field FileProvider$PathStrategy mStrategy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #278 <Method File FileProvider$PathStrategy.getFileForUri(Uri)>
	//    4   10:aload_2         
	//    5   11:invokestatic    #314 <Method int modeToMode(String)>
	//    6   14:invokestatic    #320 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//    7   17:areturn         
	}

	public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		int i;
		int j;
		int i1;
		s = ((String) (mStrategy.getFileForUri(uri)));
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field FileProvider$PathStrategy mStrategy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #278 <Method File FileProvider$PathStrategy.getFileForUri(Uri)>
	//    4   10:astore_3        
		uri = ((Uri) (as));
	//    5   11:aload_2         
	//    6   12:astore_1        
		if(as == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       21
			uri = ((Uri) (COLUMNS));
	//    9   17:getstatic       #62  <Field String[] COLUMNS>
	//   10   20:astore_1        
		j = 0;
	//   11   21:iconst_0        
	//   12   22:istore          7
		as1 = new String[uri.length];
	//   13   24:aload_1         
	//   14   25:arraylength     
	//   15   26:anewarray       String[]
	//   16   29:astore          4
		as = ((String []) (new Object[uri.length]));
	//   17   31:aload_1         
	//   18   32:arraylength     
	//   19   33:anewarray       Object[]
	//   20   36:astore_2        
		i1 = uri.length;
	//   21   37:aload_1         
	//   22   38:arraylength     
	//   23   39:istore          9
		i = 0;
	//   24   41:iconst_0        
	//   25   42:istore          6
_L7:
		if(j >= i1) goto _L2; else goto _L1
	//   26   44:iload           7
	//   27   46:iload           9
	//   28   48:icmpge          157
_L1:
		s1 = ((String) (uri[j]));
	//   29   51:aload_1         
	//   30   52:iload           7
	//   31   54:aaload          
	//   32   55:astore          5
		if(!"_display_name".equals(((Object) (s1)))) goto _L4; else goto _L3
	//   33   57:ldc1            #58  <String "_display_name">
	//   34   59:aload           5
	//   35   61:invokevirtual   #137 <Method boolean String.equals(Object)>
	//   36   64:ifeq            99
_L3:
		as1[i] = "_display_name";
	//   37   67:aload           4
	//   38   69:iload           6
	//   39   71:ldc1            #58  <String "_display_name">
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
	//   48   84:invokevirtual   #279 <Method String File.getName()>
	//   49   87:aastore         
		i = k;
	//   50   88:iload           8
	//   51   90:istore          6
_L6:
		int l;
		l = i;
	//   52   92:iload           6
	//   53   94:istore          8
		break; /* Loop/switch isn't completed */
	//   54   96:goto            144
_L4:
		l = i;
	//   55   99:iload           6
	//   56  101:istore          8
		if(!"_size".equals(((Object) (s1))))
			break; /* Loop/switch isn't completed */
	//   57  103:ldc1            #60  <String "_size">
	//   58  105:aload           5
	//   59  107:invokevirtual   #137 <Method boolean String.equals(Object)>
	//   60  110:ifeq            144
		as1[i] = "_size";
	//   61  113:aload           4
	//   62  115:iload           6
	//   63  117:ldc1            #60  <String "_size">
	//   64  119:aastore         
		l = i + 1;
	//   65  120:iload           6
	//   66  122:iconst_1        
	//   67  123:iadd            
	//   68  124:istore          8
		as[i] = ((String) (Long.valueOf(((File) (s)).length())));
	//   69  126:aload_2         
	//   70  127:iload           6
	//   71  129:aload_3         
	//   72  130:invokevirtual   #326 <Method long File.length()>
	//   73  133:invokestatic    #332 <Method Long Long.valueOf(long)>
	//   74  136:aastore         
		i = l;
	//   75  137:iload           8
	//   76  139:istore          6
		if(true) goto _L6; else goto _L5
	//   77  141:goto            92
_L5:
		j++;
	//   78  144:iload           7
	//   79  146:iconst_1        
	//   80  147:iadd            
	//   81  148:istore          7
		i = l;
	//   82  150:iload           8
	//   83  152:istore          6
		  goto _L7
	//*  84  154:goto            44
_L2:
		uri = ((Uri) (copyOf(as1, i)));
	//   85  157:aload           4
	//   86  159:iload           6
	//   87  161:invokestatic    #334 <Method String[] copyOf(String[], int)>
	//   88  164:astore_1        
		as = ((String []) (copyOf(((Object []) (as)), i)));
	//   89  165:aload_2         
	//   90  166:iload           6
	//   91  168:invokestatic    #336 <Method Object[] copyOf(Object[], int)>
	//   92  171:astore_2        
		uri = ((Uri) (new MatrixCursor(((String []) (uri)), 1)));
	//   93  172:new             #338 <Class MatrixCursor>
	//   94  175:dup             
	//   95  176:aload_1         
	//   96  177:iconst_1        
	//   97  178:invokespecial   #341 <Method void MatrixCursor(String[], int)>
	//   98  181:astore_1        
		((MatrixCursor) (uri)).addRow(((Object []) (as)));
	//   99  182:aload_1         
	//  100  183:aload_2         
	//  101  184:invokevirtual   #345 <Method void MatrixCursor.addRow(Object[])>
		return ((Cursor) (uri));
	//  102  187:aload_1         
	//  103  188:areturn         
	}

	public int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		throw new UnsupportedOperationException("No external updates");
	//    0    0:new             #303 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #349 <String "No external updates">
	//    3    7:invokespecial   #306 <Method void UnsupportedOperationException(String)>
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
	private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
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
	//    4    6:ldc1            #58  <String "_display_name">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #60  <String "_size">
	//    9   13:aastore         
	//   10   14:putstatic       #62  <Field String[] COLUMNS>
	//   11   17:new             #64  <Class File>
	//   12   20:dup             
	//   13   21:ldc1            #66  <String "/">
	//   14   23:invokespecial   #70  <Method void File(String)>
	//   15   26:putstatic       #72  <Field File DEVICE_ROOT>
	//   16   29:new             #74  <Class HashMap>
	//   17   32:dup             
	//   18   33:invokespecial   #76  <Method void HashMap()>
	//   19   36:putstatic       #78  <Field HashMap sCache>
	//*  20   39:return          
	}
}
