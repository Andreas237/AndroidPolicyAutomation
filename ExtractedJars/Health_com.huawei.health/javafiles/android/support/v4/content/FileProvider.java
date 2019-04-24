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
		//*  11   22:goto            54
			// Misplaced declaration of an exception variable
			catch(String s)
		//*  12   25:astore_1        
			{
				throw new IllegalArgumentException((new StringBuilder()).append("Failed to resolve canonical path for ").append(((Object) (file))).toString(), ((Throwable) (s)));
		//   13   26:new             #39  <Class IllegalArgumentException>
		//   14   29:dup             
		//   15   30:new             #51  <Class StringBuilder>
		//   16   33:dup             
		//   17   34:invokespecial   #52  <Method void StringBuilder()>
		//   18   37:ldc1            #54  <String "Failed to resolve canonical path for ">
		//   19   39:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   20   42:aload_2         
		//   21   43:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
		//   22   46:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   23   49:aload_1         
		//   24   50:invokespecial   #68  <Method void IllegalArgumentException(String, Throwable)>
		//   25   53:athrow          
			}
			mRoots.put(((Object) (s)), ((Object) (file1)));
		//   26   54:aload_0         
		//   27   55:getfield        #24  <Field HashMap mRoots>
		//   28   58:aload_1         
		//   29   59:aload_3         
		//   30   60:invokevirtual   #72  <Method Object HashMap.put(Object, Object)>
		//   31   63:pop             
		//   32   64:return          
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
		//   31   59:new             #51  <Class StringBuilder>
		//   32   62:dup             
		//   33   63:invokespecial   #52  <Method void StringBuilder()>
		//   34   66:ldc1            #102 <String "Unable to find configured root for ">
		//   35   68:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   36   71:aload_1         
		//   37   72:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
		//   38   75:invokevirtual   #65  <Method String StringBuilder.toString()>
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
		//*  50   99:goto            130
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//*  51  102:astore_3        
			{
				throw new IllegalArgumentException((new StringBuilder()).append("Failed to resolve canonical path for ").append(((Object) (uri))).toString());
		//   52  103:new             #39  <Class IllegalArgumentException>
		//   53  106:dup             
		//   54  107:new             #51  <Class StringBuilder>
		//   55  110:dup             
		//   56  111:invokespecial   #52  <Method void StringBuilder()>
		//   57  114:ldc1            #54  <String "Failed to resolve canonical path for ">
		//   58  116:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   59  119:aload_1         
		//   60  120:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
		//   61  123:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   62  126:invokespecial   #43  <Method void IllegalArgumentException(String)>
		//   63  129:athrow          
			}
			if(!((File) (obj1)).getPath().startsWith(((File) (obj)).getPath()))
		//*  64  130:aload           4
		//*  65  132:invokevirtual   #108 <Method String File.getPath()>
		//*  66  135:aload_3         
		//*  67  136:invokevirtual   #108 <Method String File.getPath()>
		//*  68  139:invokevirtual   #112 <Method boolean String.startsWith(String)>
		//*  69  142:ifne            155
				throw new SecurityException("Resolved path jumped beyond configured root");
		//   70  145:new             #114 <Class SecurityException>
		//   71  148:dup             
		//   72  149:ldc1            #116 <String "Resolved path jumped beyond configured root">
		//   73  151:invokespecial   #117 <Method void SecurityException(String)>
		//   74  154:athrow          
			else
				return ((File) (obj1));
		//   75  155:aload           4
		//   76  157:areturn         
		}

		public Uri getUriForFile(File file)
		{
			String s1;
			try
			{
				s1 = file.getCanonicalPath();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #122 <Method String File.getCanonicalPath()>
		//    2    4:astore          4
			}
		//*   3    6:goto            37
			catch(IOException ioexception)
		//*   4    9:astore_2        
			{
				throw new IllegalArgumentException((new StringBuilder()).append("Failed to resolve canonical path for ").append(((Object) (file))).toString());
		//    5   10:new             #39  <Class IllegalArgumentException>
		//    6   13:dup             
		//    7   14:new             #51  <Class StringBuilder>
		//    8   17:dup             
		//    9   18:invokespecial   #52  <Method void StringBuilder()>
		//   10   21:ldc1            #54  <String "Failed to resolve canonical path for ">
		//   11   23:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   12   26:aload_1         
		//   13   27:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
		//   14   30:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   15   33:invokespecial   #43  <Method void IllegalArgumentException(String)>
		//   16   36:athrow          
			}
			file = null;
		//   17   37:aconst_null     
		//   18   38:astore_1        
			Object obj;
			for(Iterator iterator = mRoots.entrySet().iterator(); iterator.hasNext(); file = ((File) (obj)))
		//*  19   39:aload_0         
		//*  20   40:getfield        #24  <Field HashMap mRoots>
		//*  21   43:invokevirtual   #126 <Method Set HashMap.entrySet()>
		//*  22   46:invokeinterface #132 <Method Iterator Set.iterator()>
		//*  23   51:astore          5
		//*  24   53:aload           5
		//*  25   55:invokeinterface #138 <Method boolean Iterator.hasNext()>
		//*  26   60:ifeq            136
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
		//   27   63:aload           5
		//   28   65:invokeinterface #142 <Method Object Iterator.next()>
		//   29   70:checkcast       #144 <Class java.util.Map$Entry>
		//   30   73:astore_3        
				String s2 = ((File)entry.getValue()).getPath();
		//   31   74:aload_3         
		//   32   75:invokeinterface #147 <Method Object java.util.Map$Entry.getValue()>
		//   33   80:checkcast       #45  <Class File>
		//   34   83:invokevirtual   #108 <Method String File.getPath()>
		//   35   86:astore          6
				obj = ((Object) (file));
		//   36   88:aload_1         
		//   37   89:astore_2        
				if(!s1.startsWith(s2))
					continue;
		//   38   90:aload           4
		//   39   92:aload           6
		//   40   94:invokevirtual   #112 <Method boolean String.startsWith(String)>
		//   41   97:ifeq            131
				if(file != null)
		//*  42  100:aload_1         
		//*  43  101:ifnull          129
				{
					obj = ((Object) (file));
		//   44  104:aload_1         
		//   45  105:astore_2        
					if(s2.length() <= ((File)((java.util.Map.Entry) (file)).getValue()).getPath().length())
						continue;
		//   46  106:aload           6
		//   47  108:invokevirtual   #151 <Method int String.length()>
		//   48  111:aload_1         
		//   49  112:invokeinterface #147 <Method Object java.util.Map$Entry.getValue()>
		//   50  117:checkcast       #45  <Class File>
		//   51  120:invokevirtual   #108 <Method String File.getPath()>
		//   52  123:invokevirtual   #151 <Method int String.length()>
		//   53  126:icmple          131
				}
				obj = ((Object) (entry));
		//   54  129:aload_3         
		//   55  130:astore_2        
			}

		//   56  131:aload_2         
		//   57  132:astore_1        
		//*  58  133:goto            53
			if(file == null)
		//*  59  136:aload_1         
		//*  60  137:ifnonnull       168
				throw new IllegalArgumentException((new StringBuilder()).append("Failed to find configured root that contains ").append(s1).toString());
		//   61  140:new             #39  <Class IllegalArgumentException>
		//   62  143:dup             
		//   63  144:new             #51  <Class StringBuilder>
		//   64  147:dup             
		//   65  148:invokespecial   #52  <Method void StringBuilder()>
		//   66  151:ldc1            #153 <String "Failed to find configured root that contains ">
		//   67  153:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   68  156:aload           4
		//   69  158:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   70  161:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   71  164:invokespecial   #43  <Method void IllegalArgumentException(String)>
		//   72  167:athrow          
			String s = ((File)((java.util.Map.Entry) (file)).getValue()).getPath();
		//   73  168:aload_1         
		//   74  169:invokeinterface #147 <Method Object java.util.Map$Entry.getValue()>
		//   75  174:checkcast       #45  <Class File>
		//   76  177:invokevirtual   #108 <Method String File.getPath()>
		//   77  180:astore_2        
			if(s.endsWith("/"))
		//*  78  181:aload_2         
		//*  79  182:ldc1            #155 <String "/">
		//*  80  184:invokevirtual   #158 <Method boolean String.endsWith(String)>
		//*  81  187:ifeq            203
				s = s1.substring(s.length());
		//   82  190:aload           4
		//   83  192:aload_2         
		//   84  193:invokevirtual   #151 <Method int String.length()>
		//   85  196:invokevirtual   #96  <Method String String.substring(int)>
		//   86  199:astore_2        
			else
		//*  87  200:goto            215
				s = s1.substring(s.length() + 1);
		//   88  203:aload           4
		//   89  205:aload_2         
		//   90  206:invokevirtual   #151 <Method int String.length()>
		//   91  209:iconst_1        
		//   92  210:iadd            
		//   93  211:invokevirtual   #96  <Method String String.substring(int)>
		//   94  214:astore_2        
			file = ((File) ((new StringBuilder()).append(Uri.encode((String)((java.util.Map.Entry) (file)).getKey())).append('/').append(Uri.encode(s, "/")).toString()));
		//   95  215:new             #51  <Class StringBuilder>
		//   96  218:dup             
		//   97  219:invokespecial   #52  <Method void StringBuilder()>
		//   98  222:aload_1         
		//   99  223:invokeinterface #161 <Method Object java.util.Map$Entry.getKey()>
		//  100  228:checkcast       #81  <Class String>
		//  101  231:invokestatic    #164 <Method String Uri.encode(String)>
		//  102  234:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//  103  237:bipush          47
		//  104  239:invokevirtual   #167 <Method StringBuilder StringBuilder.append(char)>
		//  105  242:aload_2         
		//  106  243:ldc1            #155 <String "/">
		//  107  245:invokestatic    #170 <Method String Uri.encode(String, String)>
		//  108  248:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//  109  251:invokevirtual   #65  <Method String StringBuilder.toString()>
		//  110  254:astore_1        
			return (new android.net.Uri.Builder()).scheme("content").authority(mAuthority).encodedPath(((String) (file))).build();
		//  111  255:new             #172 <Class android.net.Uri$Builder>
		//  112  258:dup             
		//  113  259:invokespecial   #173 <Method void android.net.Uri$Builder()>
		//  114  262:ldc1            #175 <String "content">
		//  115  264:invokevirtual   #179 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
		//  116  267:aload_0         
		//  117  268:getfield        #26  <Field String mAuthority>
		//  118  271:invokevirtual   #182 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
		//  119  274:aload_1         
		//  120  275:invokevirtual   #185 <Method android.net.Uri$Builder android.net.Uri$Builder.encodedPath(String)>
		//  121  278:invokevirtual   #189 <Method Uri android.net.Uri$Builder.build()>
		//  122  281:areturn         
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
	//    1    1:invokespecial   #75  <Method void ContentProvider()>
	//    2    4:return          
	}

	private static transient File buildPath(File file, String as[])
	{
		int j = as.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j;)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
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
	//   16   23:new             #59  <Class File>
	//   17   26:dup             
	//   18   27:aload_0         
	//   19   28:aload           5
	//   20   30:invokespecial   #80  <Method void File(File, String)>
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
	//    8   10:invokestatic    #90  <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//    8   10:invokestatic    #90  <Method void System.arraycopy(Object, int, Object, int, int)>
		return as1;
	//    9   13:aload_2         
	//   10   14:areturn         
	}

	private static PathStrategy getPathStrategy(Context context, String s)
	{
		HashMap hashmap = sCache;
	//    0    0:getstatic       #73  <Field HashMap sCache>
	//    1    3:astore          4
		hashmap;
	//    2    5:aload           4
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		PathStrategy pathstrategy1 = (PathStrategy)sCache.get(((Object) (s)));
	//    4    8:getstatic       #73  <Field HashMap sCache>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #101 <Method Object HashMap.get(Object)>
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
	//   15   27:invokestatic    #104 <Method FileProvider$PathStrategy parsePathStrategy(Context, String)>
	//   16   30:astore_2        
		break MISSING_BLOCK_LABEL_58;
	//   17   31:goto            58
		context;
	//   18   34:astore_0        
		throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", ((Throwable) (context)));
	//   19   35:new             #106 <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:ldc1            #108 <String "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data">
	//   22   41:aload_0         
	//   23   42:invokespecial   #111 <Method void IllegalArgumentException(String, Throwable)>
	//   24   45:athrow          
		context;
	//   25   46:astore_0        
		throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", ((Throwable) (context)));
	//   26   47:new             #106 <Class IllegalArgumentException>
	//   27   50:dup             
	//   28   51:ldc1            #108 <String "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data">
	//   29   53:aload_0         
	//   30   54:invokespecial   #111 <Method void IllegalArgumentException(String, Throwable)>
	//   31   57:athrow          
		sCache.put(((Object) (s)), ((Object) (pathstrategy)));
	//   32   58:getstatic       #73  <Field HashMap sCache>
	//   33   61:aload_1         
	//   34   62:aload_2         
	//   35   63:invokevirtual   #115 <Method Object HashMap.put(Object, Object)>
	//   36   66:pop             
		hashmap;
	//   37   67:aload           4
		JVM INSTR monitorexit ;
	//   38   69:monitorexit     
		return pathstrategy;
	//   39   70:aload_2         
	//   40   71:areturn         
		context;
	//   41   72:astore_0        
	//*  42   73:aload           4
		throw context;
	//   43   75:monitorexit     
	//   44   76:aload_0         
	//   45   77:athrow          
	}

	public static Uri getUriForFile(Context context, String s, File file)
	{
		return getPathStrategy(context, s).getUriForFile(file);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #119 <Method FileProvider$PathStrategy getPathStrategy(Context, String)>
	//    3    5:aload_2         
	//    4    6:invokeinterface #122 <Method Uri FileProvider$PathStrategy.getUriForFile(File)>
	//    5   11:areturn         
	}

	private static int modeToMode(String s)
	{
		if("r".equals(((Object) (s))))
	//*   0    0:ldc1            #126 <String "r">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            12
			return 0x10000000;
	//    4    9:ldc1            #131 <Int 0x10000000>
	//    5   11:ireturn         
		if("w".equals(((Object) (s))) || "wt".equals(((Object) (s))))
	//*   6   12:ldc1            #133 <String "w">
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*   9   18:ifne            30
	//*  10   21:ldc1            #135 <String "wt">
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  13   27:ifeq            33
			return 0x2c000000;
	//   14   30:ldc1            #136 <Int 0x2c000000>
	//   15   32:ireturn         
		if("wa".equals(((Object) (s))))
	//*  16   33:ldc1            #138 <String "wa">
	//*  17   35:aload_0         
	//*  18   36:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  19   39:ifeq            45
			return 0x2a000000;
	//   20   42:ldc1            #139 <Int 0x2a000000>
	//   21   44:ireturn         
		if("rw".equals(((Object) (s))))
	//*  22   45:ldc1            #141 <String "rw">
	//*  23   47:aload_0         
	//*  24   48:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  25   51:ifeq            57
			return 0x38000000;
	//   26   54:ldc1            #142 <Int 0x38000000>
	//   27   56:ireturn         
		if("rwt".equals(((Object) (s))))
	//*  28   57:ldc1            #144 <String "rwt">
	//*  29   59:aload_0         
	//*  30   60:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  31   63:ifeq            69
			return 0x3c000000;
	//   32   66:ldc1            #145 <Int 0x3c000000>
	//   33   68:ireturn         
		else
			throw new IllegalArgumentException((new StringBuilder()).append("Invalid mode: ").append(s).toString());
	//   34   69:new             #106 <Class IllegalArgumentException>
	//   35   72:dup             
	//   36   73:new             #147 <Class StringBuilder>
	//   37   76:dup             
	//   38   77:invokespecial   #148 <Method void StringBuilder()>
	//   39   80:ldc1            #150 <String "Invalid mode: ">
	//   40   82:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   41   85:aload_0         
	//   42   86:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   43   89:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   44   92:invokespecial   #159 <Method void IllegalArgumentException(String)>
	//   45   95:athrow          
	}

	private static PathStrategy parsePathStrategy(Context context, String s)
		throws IOException, XmlPullParserException
	{
		SimplePathStrategy simplepathstrategy = new SimplePathStrategy(s);
	//    0    0:new             #9   <Class FileProvider$SimplePathStrategy>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #160 <Method void FileProvider$SimplePathStrategy(String)>
	//    4    8:astore          4
		XmlResourceParser xmlresourceparser = context.getPackageManager().resolveContentProvider(s, 128).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
	//    5   10:aload_0         
	//    6   11:invokevirtual   #166 <Method PackageManager Context.getPackageManager()>
	//    7   14:aload_1         
	//    8   15:sipush          128
	//    9   18:invokevirtual   #172 <Method ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #166 <Method PackageManager Context.getPackageManager()>
	//   12   25:ldc1            #24  <String "android.support.FILE_PROVIDER_PATHS">
	//   13   27:invokevirtual   #178 <Method XmlResourceParser ProviderInfo.loadXmlMetaData(PackageManager, String)>
	//   14   30:astore          5
		if(xmlresourceparser == null)
	//*  15   32:aload           5
	//*  16   34:ifnonnull       47
			throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
	//   17   37:new             #106 <Class IllegalArgumentException>
	//   18   40:dup             
	//   19   41:ldc1            #180 <String "Missing android.support.FILE_PROVIDER_PATHS meta-data">
	//   20   43:invokespecial   #159 <Method void IllegalArgumentException(String)>
	//   21   46:athrow          
		do
		{
			int i = xmlresourceparser.next();
	//   22   47:aload           5
	//   23   49:invokeinterface #186 <Method int XmlResourceParser.next()>
	//   24   54:istore_2        
			if(i == 1)
				break;
	//   25   55:iload_2         
	//   26   56:iconst_1        
	//   27   57:icmpeq          258
			if(i == 2)
	//*  28   60:iload_2         
	//*  29   61:iconst_2        
	//*  30   62:icmpne          47
			{
				String s3 = xmlresourceparser.getName();
	//   31   65:aload           5
	//   32   67:invokeinterface #189 <Method String XmlResourceParser.getName()>
	//   33   72:astore          8
				String s1 = xmlresourceparser.getAttributeValue(((String) (null)), "name");
	//   34   74:aload           5
	//   35   76:aconst_null     
	//   36   77:ldc1            #14  <String "name">
	//   37   79:invokeinterface #193 <Method String XmlResourceParser.getAttributeValue(String, String)>
	//   38   84:astore          6
				String s2 = xmlresourceparser.getAttributeValue(((String) (null)), "path");
	//   39   86:aload           5
	//   40   88:aconst_null     
	//   41   89:ldc1            #17  <String "path">
	//   42   91:invokeinterface #193 <Method String XmlResourceParser.getAttributeValue(String, String)>
	//   43   96:astore          7
				File afile[] = null;
	//   44   98:aconst_null     
	//   45   99:astore_3        
				s = null;
	//   46  100:aconst_null     
	//   47  101:astore_1        
				if("root-path".equals(((Object) (s3))))
	//*  48  102:ldc1            #42  <String "root-path">
	//*  49  104:aload           8
	//*  50  106:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  51  109:ifeq            119
					s = ((String) (DEVICE_ROOT));
	//   52  112:getstatic       #67  <Field File DEVICE_ROOT>
	//   53  115:astore_1        
				else
	//*  54  116:goto            231
				if("files-path".equals(((Object) (s3))))
	//*  55  119:ldc1            #39  <String "files-path">
	//*  56  121:aload           8
	//*  57  123:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  58  126:ifeq            137
					s = ((String) (context.getFilesDir()));
	//   59  129:aload_0         
	//   60  130:invokevirtual   #197 <Method File Context.getFilesDir()>
	//   61  133:astore_1        
				else
	//*  62  134:goto            231
				if("cache-path".equals(((Object) (s3))))
	//*  63  137:ldc1            #27  <String "cache-path">
	//*  64  139:aload           8
	//*  65  141:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  66  144:ifeq            155
					s = ((String) (context.getCacheDir()));
	//   67  147:aload_0         
	//   68  148:invokevirtual   #200 <Method File Context.getCacheDir()>
	//   69  151:astore_1        
				else
	//*  70  152:goto            231
				if("external-path".equals(((Object) (s3))))
	//*  71  155:ldc1            #30  <String "external-path">
	//*  72  157:aload           8
	//*  73  159:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  74  162:ifeq            172
					s = ((String) (Environment.getExternalStorageDirectory()));
	//   75  165:invokestatic    #205 <Method File Environment.getExternalStorageDirectory()>
	//   76  168:astore_1        
				else
	//*  77  169:goto            231
				if("external-files-path".equals(((Object) (s3))))
	//*  78  172:ldc1            #36  <String "external-files-path">
	//*  79  174:aload           8
	//*  80  176:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  81  179:ifeq            200
				{
					afile = ContextCompat.getExternalFilesDirs(context, ((String) (null)));
	//   82  182:aload_0         
	//   83  183:aconst_null     
	//   84  184:invokestatic    #211 <Method File[] ContextCompat.getExternalFilesDirs(Context, String)>
	//   85  187:astore_3        
					if(afile.length > 0)
	//*  86  188:aload_3         
	//*  87  189:arraylength     
	//*  88  190:ifle            197
						s = ((String) (afile[0]));
	//   89  193:aload_3         
	//   90  194:iconst_0        
	//   91  195:aaload          
	//   92  196:astore_1        
				} else
	//*  93  197:goto            231
				{
					s = ((String) (afile));
	//   94  200:aload_3         
	//   95  201:astore_1        
					if("external-cache-path".equals(((Object) (s3))))
	//*  96  202:ldc1            #33  <String "external-cache-path">
	//*  97  204:aload           8
	//*  98  206:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  99  209:ifeq            231
					{
						File afile1[] = ContextCompat.getExternalCacheDirs(context);
	//  100  212:aload_0         
	//  101  213:invokestatic    #215 <Method File[] ContextCompat.getExternalCacheDirs(Context)>
	//  102  216:astore          8
						s = ((String) (afile));
	//  103  218:aload_3         
	//  104  219:astore_1        
						if(afile1.length > 0)
	//* 105  220:aload           8
	//* 106  222:arraylength     
	//* 107  223:ifle            231
							s = ((String) (afile1[0]));
	//  108  226:aload           8
	//  109  228:iconst_0        
	//  110  229:aaload          
	//  111  230:astore_1        
					}
				}
				if(s != null)
	//* 112  231:aload_1         
	//* 113  232:ifnull          255
					simplepathstrategy.addRoot(s1, buildPath(((File) (s)), new String[] {
						s2
					}));
	//  114  235:aload           4
	//  115  237:aload           6
	//  116  239:aload_1         
	//  117  240:iconst_1        
	//  118  241:anewarray       String[]
	//  119  244:dup             
	//  120  245:iconst_0        
	//  121  246:aload           7
	//  122  248:aastore         
	//  123  249:invokestatic    #217 <Method File buildPath(File, String[])>
	//  124  252:invokevirtual   #221 <Method void FileProvider$SimplePathStrategy.addRoot(String, File)>
			}
		} while(true);
	//  125  255:goto            47
		return ((PathStrategy) (simplepathstrategy));
	//  126  258:aload           4
	//  127  260:areturn         
	}

	public void attachInfo(Context context, ProviderInfo providerinfo)
	{
		super.attachInfo(context, providerinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #226 <Method void ContentProvider.attachInfo(Context, ProviderInfo)>
		if(providerinfo.exported)
	//*   4    6:aload_2         
	//*   5    7:getfield        #230 <Field boolean ProviderInfo.exported>
	//*   6   10:ifeq            23
			throw new SecurityException("Provider must not be exported");
	//    7   13:new             #232 <Class SecurityException>
	//    8   16:dup             
	//    9   17:ldc1            #234 <String "Provider must not be exported">
	//   10   19:invokespecial   #235 <Method void SecurityException(String)>
	//   11   22:athrow          
		if(!providerinfo.grantUriPermissions)
	//*  12   23:aload_2         
	//*  13   24:getfield        #238 <Field boolean ProviderInfo.grantUriPermissions>
	//*  14   27:ifne            40
		{
			throw new SecurityException("Provider must grant uri permissions");
	//   15   30:new             #232 <Class SecurityException>
	//   16   33:dup             
	//   17   34:ldc1            #240 <String "Provider must grant uri permissions">
	//   18   36:invokespecial   #235 <Method void SecurityException(String)>
	//   19   39:athrow          
		} else
		{
			mStrategy = getPathStrategy(context, providerinfo.authority);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:getfield        #243 <Field String ProviderInfo.authority>
	//   24   46:invokestatic    #119 <Method FileProvider$PathStrategy getPathStrategy(Context, String)>
	//   25   49:putfield        #245 <Field FileProvider$PathStrategy mStrategy>
			return;
	//   26   52:return          
		}
	}

	public int delete(Uri uri, String s, String as[])
	{
		return !mStrategy.getFileForUri(uri).delete() ? 0 : 1;
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field FileProvider$PathStrategy mStrategy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #251 <Method File FileProvider$PathStrategy.getFileForUri(Uri)>
	//    4   10:invokevirtual   #254 <Method boolean File.delete()>
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
	//    1    1:getfield        #245 <Field FileProvider$PathStrategy mStrategy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #251 <Method File FileProvider$PathStrategy.getFileForUri(Uri)>
	//    4   10:astore_1        
		int i = ((File) (uri)).getName().lastIndexOf('.');
	//    5   11:aload_1         
	//    6   12:invokevirtual   #257 <Method String File.getName()>
	//    7   15:bipush          46
	//    8   17:invokevirtual   #261 <Method int String.lastIndexOf(int)>
	//    9   20:istore_2        
		if(i >= 0)
	//*  10   21:iload_2         
	//*  11   22:iflt            50
		{
			uri = ((Uri) (((File) (uri)).getName().substring(i + 1)));
	//   12   25:aload_1         
	//   13   26:invokevirtual   #257 <Method String File.getName()>
	//   14   29:iload_2         
	//   15   30:iconst_1        
	//   16   31:iadd            
	//   17   32:invokevirtual   #265 <Method String String.substring(int)>
	//   18   35:astore_1        
			uri = ((Uri) (MimeTypeMap.getSingleton().getMimeTypeFromExtension(((String) (uri)))));
	//   19   36:invokestatic    #271 <Method MimeTypeMap MimeTypeMap.getSingleton()>
	//   20   39:aload_1         
	//   21   40:invokevirtual   #275 <Method String MimeTypeMap.getMimeTypeFromExtension(String)>
	//   22   43:astore_1        
			if(uri != null)
	//*  23   44:aload_1         
	//*  24   45:ifnull          50
				return ((String) (uri));
	//   25   48:aload_1         
	//   26   49:areturn         
		}
		return "application/octet-stream";
	//   27   50:ldc2            #277 <String "application/octet-stream">
	//   28   53:areturn         
	}

	public Uri insert(Uri uri, ContentValues contentvalues)
	{
		throw new UnsupportedOperationException("No external inserts");
	//    0    0:new             #281 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #283 <String "No external inserts">
	//    3    7:invokespecial   #284 <Method void UnsupportedOperationException(String)>
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
	//    1    1:getfield        #245 <Field FileProvider$PathStrategy mStrategy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #251 <Method File FileProvider$PathStrategy.getFileForUri(Uri)>
	//    4   10:aload_2         
	//    5   11:invokestatic    #291 <Method int modeToMode(String)>
	//    6   14:invokestatic    #297 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//    7   17:areturn         
	}

	public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		s = ((String) (mStrategy.getFileForUri(uri)));
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field FileProvider$PathStrategy mStrategy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #251 <Method File FileProvider$PathStrategy.getFileForUri(Uri)>
	//    4   10:astore_3        
		uri = ((Uri) (as));
	//    5   11:aload_2         
	//    6   12:astore_1        
		if(as == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       21
			uri = ((Uri) (COLUMNS));
	//    9   17:getstatic       #57  <Field String[] COLUMNS>
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
		int j = 0;
	//   19   34:iconst_0        
	//   20   35:istore          7
		int l = uri.length;
	//   21   37:aload_1         
	//   22   38:arraylength     
	//   23   39:istore          9
		for(int k = 0; k < l;)
	//*  24   41:iconst_0        
	//*  25   42:istore          8
	//*  26   44:iload           8
	//*  27   46:iload           9
	//*  28   48:icmpge          142
		{
			s1 = ((String) (uri[k]));
	//   29   51:aload_1         
	//   30   52:iload           8
	//   31   54:aaload          
	//   32   55:astore          5
			int i;
			if("_display_name".equals(((Object) (s1))))
	//*  33   57:ldc1            #53  <String "_display_name">
	//*  34   59:aload           5
	//*  35   61:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  36   64:ifeq            91
			{
				as1[j] = "_display_name";
	//   37   67:aload           4
	//   38   69:iload           7
	//   39   71:ldc1            #53  <String "_display_name">
	//   40   73:aastore         
				i = j + 1;
	//   41   74:iload           7
	//   42   76:iconst_1        
	//   43   77:iadd            
	//   44   78:istore          6
				as[j] = ((File) (s)).getName();
	//   45   80:aload_2         
	//   46   81:iload           7
	//   47   83:aload_3         
	//   48   84:invokevirtual   #257 <Method String File.getName()>
	//   49   87:aastore         
			} else
	//*  50   88:goto            129
			{
				i = j;
	//   51   91:iload           7
	//   52   93:istore          6
				if("_size".equals(((Object) (s1))))
	//*  53   95:ldc1            #55  <String "_size">
	//*  54   97:aload           5
	//*  55   99:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  56  102:ifeq            129
				{
					as1[j] = "_size";
	//   57  105:aload           4
	//   58  107:iload           7
	//   59  109:ldc1            #55  <String "_size">
	//   60  111:aastore         
					i = j + 1;
	//   61  112:iload           7
	//   62  114:iconst_1        
	//   63  115:iadd            
	//   64  116:istore          6
					as[j] = ((String) (Long.valueOf(((File) (s)).length())));
	//   65  118:aload_2         
	//   66  119:iload           7
	//   67  121:aload_3         
	//   68  122:invokevirtual   #303 <Method long File.length()>
	//   69  125:invokestatic    #309 <Method Long Long.valueOf(long)>
	//   70  128:aastore         
				}
			}
			k++;
	//   71  129:iload           8
	//   72  131:iconst_1        
	//   73  132:iadd            
	//   74  133:istore          8
			j = i;
	//   75  135:iload           6
	//   76  137:istore          7
		}

	//*  77  139:goto            44
		uri = ((Uri) (copyOf(as1, j)));
	//   78  142:aload           4
	//   79  144:iload           7
	//   80  146:invokestatic    #311 <Method String[] copyOf(String[], int)>
	//   81  149:astore_1        
		as = ((String []) (copyOf(((Object []) (as)), j)));
	//   82  150:aload_2         
	//   83  151:iload           7
	//   84  153:invokestatic    #313 <Method Object[] copyOf(Object[], int)>
	//   85  156:astore_2        
		uri = ((Uri) (new MatrixCursor(((String []) (uri)), 1)));
	//   86  157:new             #315 <Class MatrixCursor>
	//   87  160:dup             
	//   88  161:aload_1         
	//   89  162:iconst_1        
	//   90  163:invokespecial   #318 <Method void MatrixCursor(String[], int)>
	//   91  166:astore_1        
		((MatrixCursor) (uri)).addRow(((Object []) (as)));
	//   92  167:aload_1         
	//   93  168:aload_2         
	//   94  169:invokevirtual   #322 <Method void MatrixCursor.addRow(Object[])>
		return ((Cursor) (uri));
	//   95  172:aload_1         
	//   96  173:areturn         
	}

	public int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		throw new UnsupportedOperationException("No external updates");
	//    0    0:new             #281 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #326 <String "No external updates">
	//    3    7:invokespecial   #284 <Method void UnsupportedOperationException(String)>
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
	//    4    6:ldc1            #53  <String "_display_name">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #55  <String "_size">
	//    9   13:aastore         
	//   10   14:putstatic       #57  <Field String[] COLUMNS>
	//   11   17:new             #59  <Class File>
	//   12   20:dup             
	//   13   21:ldc1            #61  <String "/">
	//   14   23:invokespecial   #65  <Method void File(String)>
	//   15   26:putstatic       #67  <Field File DEVICE_ROOT>
	//   16   29:new             #69  <Class HashMap>
	//   17   32:dup             
	//   18   33:invokespecial   #71  <Method void HashMap()>
	//   19   36:putstatic       #73  <Field HashMap sCache>
	//*  20   39:return          
	}
}
