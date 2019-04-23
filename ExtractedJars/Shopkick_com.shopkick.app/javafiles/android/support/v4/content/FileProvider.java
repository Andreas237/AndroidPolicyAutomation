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
			if(!TextUtils.isEmpty(((CharSequence) (s))))
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #37  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   2    4:ifne            58
			{
				File file1;
				try
				{
					file1 = file.getCanonicalFile();
		//    3    7:aload_2         
		//    4    8:invokevirtual   #43  <Method File File.getCanonicalFile()>
		//    5   11:astore_3        
				}
		//*   6   12:aload_0         
		//*   7   13:getfield        #24  <Field HashMap mRoots>
		//*   8   16:aload_1         
		//*   9   17:aload_3         
		//*  10   18:invokevirtual   #47  <Method Object HashMap.put(Object, Object)>
		//*  11   21:pop             
		//*  12   22:return          
				// Misplaced declaration of an exception variable
				catch(String s)
		//*  13   23:astore_1        
				{
					StringBuilder stringbuilder = new StringBuilder();
		//   14   24:new             #49  <Class StringBuilder>
		//   15   27:dup             
		//   16   28:invokespecial   #50  <Method void StringBuilder()>
		//   17   31:astore_3        
					stringbuilder.append("Failed to resolve canonical path for ");
		//   18   32:aload_3         
		//   19   33:ldc1            #52  <String "Failed to resolve canonical path for ">
		//   20   35:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   21   38:pop             
					stringbuilder.append(((Object) (file)));
		//   22   39:aload_3         
		//   23   40:aload_2         
		//   24   41:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
		//   25   44:pop             
					throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (s)));
		//   26   45:new             #61  <Class IllegalArgumentException>
		//   27   48:dup             
		//   28   49:aload_3         
		//   29   50:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   30   53:aload_1         
		//   31   54:invokespecial   #68  <Method void IllegalArgumentException(String, Throwable)>
		//   32   57:athrow          
				}
				mRoots.put(((Object) (s)), ((Object) (file1)));
				return;
			} else
			{
				throw new IllegalArgumentException("Name must not be empty");
		//   33   58:new             #61  <Class IllegalArgumentException>
		//   34   61:dup             
		//   35   62:ldc1            #70  <String "Name must not be empty">
		//   36   64:invokespecial   #72  <Method void IllegalArgumentException(String)>
		//   37   67:athrow          
			}
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
		//   25   47:checkcast       #39  <Class File>
		//   26   50:astore_3        
			if(obj != null)
		//*  27   51:aload_3         
		//*  28   52:ifnull          133
			{
				uri = ((Uri) (new File(((File) (obj)), ((String) (obj1)))));
		//   29   55:new             #39  <Class File>
		//   30   58:dup             
		//   31   59:aload_3         
		//   32   60:aload           4
		//   33   62:invokespecial   #103 <Method void File(File, String)>
		//   34   65:astore_1        
				try
				{
					obj1 = ((Object) (((File) (uri)).getCanonicalFile()));
		//   35   66:aload_1         
		//   36   67:invokevirtual   #43  <Method File File.getCanonicalFile()>
		//   37   70:astore          4
				}
		//*  38   72:aload           4
		//*  39   74:invokevirtual   #106 <Method String File.getPath()>
		//*  40   77:aload_3         
		//*  41   78:invokevirtual   #106 <Method String File.getPath()>
		//*  42   81:invokevirtual   #110 <Method boolean String.startsWith(String)>
		//*  43   84:ifeq            90
		//*  44   87:aload           4
		//*  45   89:areturn         
		//*  46   90:new             #112 <Class SecurityException>
		//*  47   93:dup             
		//*  48   94:ldc1            #114 <String "Resolved path jumped beyond configured root">
		//*  49   96:invokespecial   #115 <Method void SecurityException(String)>
		//*  50   99:athrow          
		//*  51  100:new             #49  <Class StringBuilder>
		//*  52  103:dup             
		//*  53  104:invokespecial   #50  <Method void StringBuilder()>
		//*  54  107:astore_3        
		//*  55  108:aload_3         
		//*  56  109:ldc1            #52  <String "Failed to resolve canonical path for ">
		//*  57  111:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//*  58  114:pop             
		//*  59  115:aload_3         
		//*  60  116:aload_1         
		//*  61  117:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
		//*  62  120:pop             
		//*  63  121:new             #61  <Class IllegalArgumentException>
		//*  64  124:dup             
		//*  65  125:aload_3         
		//*  66  126:invokevirtual   #65  <Method String StringBuilder.toString()>
		//*  67  129:invokespecial   #72  <Method void IllegalArgumentException(String)>
		//*  68  132:athrow          
		//*  69  133:new             #49  <Class StringBuilder>
		//*  70  136:dup             
		//*  71  137:invokespecial   #50  <Method void StringBuilder()>
		//*  72  140:astore_3        
		//*  73  141:aload_3         
		//*  74  142:ldc1            #117 <String "Unable to find configured root for ">
		//*  75  144:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//*  76  147:pop             
		//*  77  148:aload_3         
		//*  78  149:aload_1         
		//*  79  150:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
		//*  80  153:pop             
		//*  81  154:new             #61  <Class IllegalArgumentException>
		//*  82  157:dup             
		//*  83  158:aload_3         
		//*  84  159:invokevirtual   #65  <Method String StringBuilder.toString()>
		//*  85  162:invokespecial   #72  <Method void IllegalArgumentException(String)>
		//*  86  165:athrow          
				// Misplaced declaration of an exception variable
				catch(IOException ioexception)
				{
					obj = ((Object) (new StringBuilder()));
					((StringBuilder) (obj)).append("Failed to resolve canonical path for ");
					((StringBuilder) (obj)).append(((Object) (uri)));
					throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
				}
				if(((File) (obj1)).getPath().startsWith(((File) (obj)).getPath()))
					return ((File) (obj1));
				else
					throw new SecurityException("Resolved path jumped beyond configured root");
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
				stringbuilder.append("Unable to find configured root for ");
				stringbuilder.append(((Object) (uri)));
				throw new IllegalArgumentException(stringbuilder.toString());
			}
		//*  87  166:astore_3        
		//*  88  167:goto            100
		}

		public Uri getUriForFile(File file)
		{
			IOException ioexception;
			StringBuilder stringbuilder;
			Object obj;
			Iterator iterator;
			try
			{
				obj = ((Object) (file.getCanonicalPath()));
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
		//*  19   48:checkcast       #39  <Class File>
		//*  20   51:invokevirtual   #106 <Method String File.getPath()>
		//*  21   54:astore          5
		//*  22   56:aload_3         
		//*  23   57:aload           5
		//*  24   59:invokevirtual   #110 <Method boolean String.startsWith(String)>
		//*  25   62:ifeq            21
		//*  26   65:aload_1         
		//*  27   66:ifnull          92
		//*  28   69:aload           5
		//*  29   71:invokevirtual   #151 <Method int String.length()>
		//*  30   74:aload_1         
		//*  31   75:invokeinterface #147 <Method Object java.util.Map$Entry.getValue()>
		//*  32   80:checkcast       #39  <Class File>
		//*  33   83:invokevirtual   #106 <Method String File.getPath()>
		//*  34   86:invokevirtual   #151 <Method int String.length()>
		//*  35   89:icmple          21
		//*  36   92:aload_2         
		//*  37   93:astore_1        
		//*  38   94:goto            21
		//*  39   97:aload_1         
		//*  40   98:ifnull          221
		//*  41  101:aload_1         
		//*  42  102:invokeinterface #147 <Method Object java.util.Map$Entry.getValue()>
		//*  43  107:checkcast       #39  <Class File>
		//*  44  110:invokevirtual   #106 <Method String File.getPath()>
		//*  45  113:astore_2        
		//*  46  114:aload_2         
		//*  47  115:ldc1            #153 <String "/">
		//*  48  117:invokevirtual   #156 <Method boolean String.endsWith(String)>
		//*  49  120:ifeq            135
		//*  50  123:aload_3         
		//*  51  124:aload_2         
		//*  52  125:invokevirtual   #151 <Method int String.length()>
		//*  53  128:invokevirtual   #96  <Method String String.substring(int)>
		//*  54  131:astore_2        
		//*  55  132:goto            146
		//*  56  135:aload_3         
		//*  57  136:aload_2         
		//*  58  137:invokevirtual   #151 <Method int String.length()>
		//*  59  140:iconst_1        
		//*  60  141:iadd            
		//*  61  142:invokevirtual   #96  <Method String String.substring(int)>
		//*  62  145:astore_2        
		//*  63  146:new             #49  <Class StringBuilder>
		//*  64  149:dup             
		//*  65  150:invokespecial   #50  <Method void StringBuilder()>
		//*  66  153:astore_3        
		//*  67  154:aload_3         
		//*  68  155:aload_1         
		//*  69  156:invokeinterface #159 <Method Object java.util.Map$Entry.getKey()>
		//*  70  161:checkcast       #81  <Class String>
		//*  71  164:invokestatic    #162 <Method String Uri.encode(String)>
		//*  72  167:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//*  73  170:pop             
		//*  74  171:aload_3         
		//*  75  172:bipush          47
		//*  76  174:invokevirtual   #165 <Method StringBuilder StringBuilder.append(char)>
		//*  77  177:pop             
		//*  78  178:aload_3         
		//*  79  179:aload_2         
		//*  80  180:ldc1            #153 <String "/">
		//*  81  182:invokestatic    #168 <Method String Uri.encode(String, String)>
		//*  82  185:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//*  83  188:pop             
		//*  84  189:aload_3         
		//*  85  190:invokevirtual   #65  <Method String StringBuilder.toString()>
		//*  86  193:astore_1        
		//*  87  194:new             #170 <Class android.net.Uri$Builder>
		//*  88  197:dup             
		//*  89  198:invokespecial   #171 <Method void android.net.Uri$Builder()>
		//*  90  201:ldc1            #173 <String "content">
		//*  91  203:invokevirtual   #177 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
		//*  92  206:aload_0         
		//*  93  207:getfield        #26  <Field String mAuthority>
		//*  94  210:invokevirtual   #180 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
		//*  95  213:aload_1         
		//*  96  214:invokevirtual   #183 <Method android.net.Uri$Builder android.net.Uri$Builder.encodedPath(String)>
		//*  97  217:invokevirtual   #187 <Method Uri android.net.Uri$Builder.build()>
		//*  98  220:areturn         
		//*  99  221:new             #49  <Class StringBuilder>
		//* 100  224:dup             
		//* 101  225:invokespecial   #50  <Method void StringBuilder()>
		//* 102  228:astore_1        
		//* 103  229:aload_1         
		//* 104  230:ldc1            #189 <String "Failed to find configured root that contains ">
		//* 105  232:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//* 106  235:pop             
		//* 107  236:aload_1         
		//* 108  237:aload_3         
		//* 109  238:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//* 110  241:pop             
		//* 111  242:new             #61  <Class IllegalArgumentException>
		//* 112  245:dup             
		//* 113  246:aload_1         
		//* 114  247:invokevirtual   #65  <Method String StringBuilder.toString()>
		//* 115  250:invokespecial   #72  <Method void IllegalArgumentException(String)>
		//* 116  253:athrow          
		//* 117  254:new             #49  <Class StringBuilder>
		//* 118  257:dup             
		//* 119  258:invokespecial   #50  <Method void StringBuilder()>
		//* 120  261:astore_2        
		//* 121  262:aload_2         
		//* 122  263:ldc1            #52  <String "Failed to resolve canonical path for ">
		//* 123  265:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//* 124  268:pop             
		//* 125  269:aload_2         
		//* 126  270:aload_1         
		//* 127  271:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
		//* 128  274:pop             
		//* 129  275:new             #61  <Class IllegalArgumentException>
		//* 130  278:dup             
		//* 131  279:aload_2         
		//* 132  280:invokevirtual   #65  <Method String StringBuilder.toString()>
		//* 133  283:invokespecial   #72  <Method void IllegalArgumentException(String)>
		//* 134  286:athrow          
			// Misplaced declaration of an exception variable
			catch(IOException ioexception)
			{
				stringbuilder = new StringBuilder();
				stringbuilder.append("Failed to resolve canonical path for ");
				stringbuilder.append(((Object) (file)));
				throw new IllegalArgumentException(stringbuilder.toString());
			}
			file = null;
			iterator = mRoots.entrySet().iterator();
			do
			{
				if(!iterator.hasNext())
					break;
				java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
				String s1 = ((File)entry.getValue()).getPath();
				if(((String) (obj)).startsWith(s1) && (file == null || s1.length() > ((File)((java.util.Map.Entry) (file)).getValue()).getPath().length()))
					file = ((File) (entry));
			} while(true);
			if(file != null)
			{
				String s = ((File)((java.util.Map.Entry) (file)).getValue()).getPath();
				if(s.endsWith("/"))
					s = ((String) (obj)).substring(s.length());
				else
					s = ((String) (obj)).substring(s.length() + 1);
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append(Uri.encode((String)((java.util.Map.Entry) (file)).getKey()));
				((StringBuilder) (obj)).append('/');
				((StringBuilder) (obj)).append(Uri.encode(s, "/"));
				file = ((File) (((StringBuilder) (obj)).toString()));
				return (new android.net.Uri.Builder()).scheme("content").authority(mAuthority).encodedPath(((String) (file))).build();
			} else
			{
				file = ((File) (new StringBuilder()));
				((StringBuilder) (file)).append("Failed to find configured root that contains ");
				((StringBuilder) (file)).append(((String) (obj)));
				throw new IllegalArgumentException(((StringBuilder) (file)).toString());
			}
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
		if(xmlresourceparser != null)
	//*  15   32:aload           5
	//*  16   34:ifnull          296
		{
			do
			{
				int i = xmlresourceparser.next();
	//   17   37:aload           5
	//   18   39:invokeinterface #191 <Method int XmlResourceParser.next()>
	//   19   44:istore_2        
				if(i == 1)
					break;
	//   20   45:iload_2         
	//   21   46:iconst_1        
	//   22   47:icmpeq          293
				if(i == 2)
	//*  23   50:iload_2         
	//*  24   51:iconst_2        
	//*  25   52:icmpne          37
				{
					Object obj1 = ((Object) (xmlresourceparser.getName()));
	//   26   55:aload           5
	//   27   57:invokeinterface #194 <Method String XmlResourceParser.getName()>
	//   28   62:astore          8
					Object obj = null;
	//   29   64:aconst_null     
	//   30   65:astore_3        
					String s1 = xmlresourceparser.getAttributeValue(((String) (null)), "name");
	//   31   66:aload           5
	//   32   68:aconst_null     
	//   33   69:ldc1            #14  <String "name">
	//   34   71:invokeinterface #198 <Method String XmlResourceParser.getAttributeValue(String, String)>
	//   35   76:astore          6
					String s2 = xmlresourceparser.getAttributeValue(((String) (null)), "path");
	//   36   78:aload           5
	//   37   80:aconst_null     
	//   38   81:ldc1            #17  <String "path">
	//   39   83:invokeinterface #198 <Method String XmlResourceParser.getAttributeValue(String, String)>
	//   40   88:astore          7
					if("root-path".equals(obj1))
	//*  41   90:ldc1            #45  <String "root-path">
	//*  42   92:aload           8
	//*  43   94:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  44   97:ifeq            107
						s = ((String) (DEVICE_ROOT));
	//   45  100:getstatic       #72  <Field File DEVICE_ROOT>
	//   46  103:astore_1        
					else
	//*  47  104:goto            266
					if("files-path".equals(obj1))
	//*  48  107:ldc1            #42  <String "files-path">
	//*  49  109:aload           8
	//*  50  111:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  51  114:ifeq            125
						s = ((String) (context.getFilesDir()));
	//   52  117:aload_0         
	//   53  118:invokevirtual   #202 <Method File Context.getFilesDir()>
	//   54  121:astore_1        
					else
	//*  55  122:goto            266
					if("cache-path".equals(obj1))
	//*  56  125:ldc1            #27  <String "cache-path">
	//*  57  127:aload           8
	//*  58  129:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  59  132:ifeq            143
						s = ((String) (context.getCacheDir()));
	//   60  135:aload_0         
	//   61  136:invokevirtual   #205 <Method File Context.getCacheDir()>
	//   62  139:astore_1        
					else
	//*  63  140:goto            266
					if("external-path".equals(obj1))
	//*  64  143:ldc1            #30  <String "external-path">
	//*  65  145:aload           8
	//*  66  147:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  67  150:ifeq            160
						s = ((String) (Environment.getExternalStorageDirectory()));
	//   68  153:invokestatic    #210 <Method File Environment.getExternalStorageDirectory()>
	//   69  156:astore_1        
					else
	//*  70  157:goto            266
					if("external-files-path".equals(obj1))
	//*  71  160:ldc1            #36  <String "external-files-path">
	//*  72  162:aload           8
	//*  73  164:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  74  167:ifeq            193
					{
						obj1 = ((Object) (ContextCompat.getExternalFilesDirs(context, ((String) (null)))));
	//   75  170:aload_0         
	//   76  171:aconst_null     
	//   77  172:invokestatic    #216 <Method File[] ContextCompat.getExternalFilesDirs(Context, String)>
	//   78  175:astore          8
						s = ((String) (obj));
	//   79  177:aload_3         
	//   80  178:astore_1        
						if(obj1.length > 0)
	//*  81  179:aload           8
	//*  82  181:arraylength     
	//*  83  182:ifle            266
							s = ((String) (obj1[0]));
	//   84  185:aload           8
	//   85  187:iconst_0        
	//   86  188:aaload          
	//   87  189:astore_1        
					} else
	//*  88  190:goto            266
					if("external-cache-path".equals(obj1))
	//*  89  193:ldc1            #33  <String "external-cache-path">
	//*  90  195:aload           8
	//*  91  197:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  92  200:ifeq            225
					{
						obj1 = ((Object) (ContextCompat.getExternalCacheDirs(context)));
	//   93  203:aload_0         
	//   94  204:invokestatic    #220 <Method File[] ContextCompat.getExternalCacheDirs(Context)>
	//   95  207:astore          8
						s = ((String) (obj));
	//   96  209:aload_3         
	//   97  210:astore_1        
						if(obj1.length > 0)
	//*  98  211:aload           8
	//*  99  213:arraylength     
	//* 100  214:ifle            266
							s = ((String) (obj1[0]));
	//  101  217:aload           8
	//  102  219:iconst_0        
	//  103  220:aaload          
	//  104  221:astore_1        
					} else
	//* 105  222:goto            266
					{
						s = ((String) (obj));
	//  106  225:aload_3         
	//  107  226:astore_1        
						if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 108  227:getstatic       #226 <Field int android.os.Build$VERSION.SDK_INT>
	//* 109  230:bipush          21
	//* 110  232:icmplt          266
						{
							s = ((String) (obj));
	//  111  235:aload_3         
	//  112  236:astore_1        
							if("external-media-path".equals(obj1))
	//* 113  237:ldc1            #39  <String "external-media-path">
	//* 114  239:aload           8
	//* 115  241:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 116  244:ifeq            266
							{
								File afile[] = context.getExternalMediaDirs();
	//  117  247:aload_0         
	//  118  248:invokevirtual   #230 <Method File[] Context.getExternalMediaDirs()>
	//  119  251:astore          8
								s = ((String) (obj));
	//  120  253:aload_3         
	//  121  254:astore_1        
								if(afile.length > 0)
	//* 122  255:aload           8
	//* 123  257:arraylength     
	//* 124  258:ifle            266
									s = ((String) (afile[0]));
	//  125  261:aload           8
	//  126  263:iconst_0        
	//  127  264:aaload          
	//  128  265:astore_1        
							}
						}
					}
					if(s != null)
	//* 129  266:aload_1         
	//* 130  267:ifnull          37
						simplepathstrategy.addRoot(s1, buildPath(((File) (s)), new String[] {
							s2
						}));
	//  131  270:aload           4
	//  132  272:aload           6
	//  133  274:aload_1         
	//  134  275:iconst_1        
	//  135  276:anewarray       String[]
	//  136  279:dup             
	//  137  280:iconst_0        
	//  138  281:aload           7
	//  139  283:aastore         
	//  140  284:invokestatic    #232 <Method File buildPath(File, String[])>
	//  141  287:invokevirtual   #236 <Method void FileProvider$SimplePathStrategy.addRoot(String, File)>
				}
			} while(true);
	//  142  290:goto            37
			return ((PathStrategy) (simplepathstrategy));
	//  143  293:aload           4
	//  144  295:areturn         
		} else
		{
			throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
	//  145  296:new             #115 <Class IllegalArgumentException>
	//  146  299:dup             
	//  147  300:ldc1            #238 <String "Missing android.support.FILE_PROVIDER_PATHS meta-data">
	//  148  302:invokespecial   #165 <Method void IllegalArgumentException(String)>
	//  149  305:athrow          
		}
	}

	public void attachInfo(Context context, ProviderInfo providerinfo)
	{
		super.attachInfo(context, providerinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #243 <Method void ContentProvider.attachInfo(Context, ProviderInfo)>
		if(!providerinfo.exported)
	//*   4    6:aload_2         
	//*   5    7:getfield        #247 <Field boolean ProviderInfo.exported>
	//*   6   10:ifne            44
		{
			if(providerinfo.grantUriPermissions)
	//*   7   13:aload_2         
	//*   8   14:getfield        #250 <Field boolean ProviderInfo.grantUriPermissions>
	//*   9   17:ifeq            33
			{
				mStrategy = getPathStrategy(context, providerinfo.authority);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:getfield        #253 <Field String ProviderInfo.authority>
	//   14   26:invokestatic    #125 <Method FileProvider$PathStrategy getPathStrategy(Context, String)>
	//   15   29:putfield        #255 <Field FileProvider$PathStrategy mStrategy>
				return;
	//   16   32:return          
			} else
			{
				throw new SecurityException("Provider must grant uri permissions");
	//   17   33:new             #257 <Class SecurityException>
	//   18   36:dup             
	//   19   37:ldc2            #259 <String "Provider must grant uri permissions">
	//   20   40:invokespecial   #260 <Method void SecurityException(String)>
	//   21   43:athrow          
			}
		} else
		{
			throw new SecurityException("Provider must not be exported");
	//   22   44:new             #257 <Class SecurityException>
	//   23   47:dup             
	//   24   48:ldc2            #262 <String "Provider must not be exported">
	//   25   51:invokespecial   #260 <Method void SecurityException(String)>
	//   26   54:athrow          
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
	//    1    1:getfield        #255 <Field FileProvider$PathStrategy mStrategy>
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
	//    1    1:getfield        #255 <Field FileProvider$PathStrategy mStrategy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #278 <Method File FileProvider$PathStrategy.getFileForUri(Uri)>
	//    4   10:aload_2         
	//    5   11:invokestatic    #314 <Method int modeToMode(String)>
	//    6   14:invokestatic    #320 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//    7   17:areturn         
	}

	public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		s = ((String) (mStrategy.getFileForUri(uri)));
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field FileProvider$PathStrategy mStrategy>
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
		int l = uri.length;
	//   19   34:aload_1         
	//   20   35:arraylength     
	//   21   36:istore          9
		int j = 0;
	//   22   38:iconst_0        
	//   23   39:istore          7
		int i;
		int k;
		for(k = 0; j < l; k = i)
	//*  24   41:iconst_0        
	//*  25   42:istore          8
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
	//*  33   57:ldc1            #58  <String "_display_name">
	//*  34   59:aload           5
	//*  35   61:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  36   64:ifeq            91
			{
				as1[k] = "_display_name";
	//   37   67:aload           4
	//   38   69:iload           8
	//   39   71:ldc1            #58  <String "_display_name">
	//   40   73:aastore         
				as[k] = ((File) (s)).getName();
	//   41   74:aload_2         
	//   42   75:iload           8
	//   43   77:aload_3         
	//   44   78:invokevirtual   #279 <Method String File.getName()>
	//   45   81:aastore         
				i = k + 1;
	//   46   82:iload           8
	//   47   84:iconst_1        
	//   48   85:iadd            
	//   49   86:istore          6
			} else
	//*  50   88:goto            129
			{
				i = k;
	//   51   91:iload           8
	//   52   93:istore          6
				if("_size".equals(((Object) (s1))))
	//*  53   95:ldc1            #60  <String "_size">
	//*  54   97:aload           5
	//*  55   99:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  56  102:ifeq            129
				{
					as1[k] = "_size";
	//   57  105:aload           4
	//   58  107:iload           8
	//   59  109:ldc1            #60  <String "_size">
	//   60  111:aastore         
					as[k] = ((String) (Long.valueOf(((File) (s)).length())));
	//   61  112:aload_2         
	//   62  113:iload           8
	//   63  115:aload_3         
	//   64  116:invokevirtual   #326 <Method long File.length()>
	//   65  119:invokestatic    #332 <Method Long Long.valueOf(long)>
	//   66  122:aastore         
					i = k + 1;
	//   67  123:iload           8
	//   68  125:iconst_1        
	//   69  126:iadd            
	//   70  127:istore          6
				}
			}
			j++;
	//   71  129:iload           7
	//   72  131:iconst_1        
	//   73  132:iadd            
	//   74  133:istore          7
		}

	//   75  135:iload           6
	//   76  137:istore          8
	//*  77  139:goto            44
		uri = ((Uri) (copyOf(as1, k)));
	//   78  142:aload           4
	//   79  144:iload           8
	//   80  146:invokestatic    #334 <Method String[] copyOf(String[], int)>
	//   81  149:astore_1        
		as = ((String []) (copyOf(((Object []) (as)), k)));
	//   82  150:aload_2         
	//   83  151:iload           8
	//   84  153:invokestatic    #336 <Method Object[] copyOf(Object[], int)>
	//   85  156:astore_2        
		uri = ((Uri) (new MatrixCursor(((String []) (uri)), 1)));
	//   86  157:new             #338 <Class MatrixCursor>
	//   87  160:dup             
	//   88  161:aload_1         
	//   89  162:iconst_1        
	//   90  163:invokespecial   #341 <Method void MatrixCursor(String[], int)>
	//   91  166:astore_1        
		((MatrixCursor) (uri)).addRow(((Object []) (as)));
	//   92  167:aload_1         
	//   93  168:aload_2         
	//   94  169:invokevirtual   #345 <Method void MatrixCursor.addRow(Object[])>
		return ((Cursor) (uri));
	//   95  172:aload_1         
	//   96  173:areturn         
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
