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
import java.io.File;
import java.io.IOException;
import java.util.*;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v4.content:
//			a

public class FileProvider extends ContentProvider
{
	static interface a
	{

		public abstract Uri a(File file);

		public abstract File a(Uri uri);
	}

	static class b
		implements a
	{

		public Uri a(File file)
		{
			IOException ioexception;
			int i;
			Object obj;
			Object obj1;
			Iterator iterator;
			try
			{
				obj1 = ((Object) (file.getCanonicalPath()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #35  <Method String File.getCanonicalPath()>
		//    2    4:astore          4
			}
		//*   3    6:aconst_null     
		//*   4    7:astore_1        
		//*   5    8:aload_0         
		//*   6    9:getfield        #23  <Field HashMap b>
		//*   7   12:invokevirtual   #39  <Method Set HashMap.entrySet()>
		//*   8   15:invokeinterface #45  <Method Iterator Set.iterator()>
		//*   9   20:astore          5
		//*  10   22:aload           5
		//*  11   24:invokeinterface #51  <Method boolean Iterator.hasNext()>
		//*  12   29:ifeq            99
		//*  13   32:aload           5
		//*  14   34:invokeinterface #55  <Method Object Iterator.next()>
		//*  15   39:checkcast       #57  <Class java.util.Map$Entry>
		//*  16   42:astore_3        
		//*  17   43:aload_3         
		//*  18   44:invokeinterface #60  <Method Object java.util.Map$Entry.getValue()>
		//*  19   49:checkcast       #31  <Class File>
		//*  20   52:invokevirtual   #63  <Method String File.getPath()>
		//*  21   55:astore          6
		//*  22   57:aload           4
		//*  23   59:aload           6
		//*  24   61:invokevirtual   #69  <Method boolean String.startsWith(String)>
		//*  25   64:ifeq            22
		//*  26   67:aload_1         
		//*  27   68:ifnull          94
		//*  28   71:aload           6
		//*  29   73:invokevirtual   #73  <Method int String.length()>
		//*  30   76:aload_1         
		//*  31   77:invokeinterface #60  <Method Object java.util.Map$Entry.getValue()>
		//*  32   82:checkcast       #31  <Class File>
		//*  33   85:invokevirtual   #63  <Method String File.getPath()>
		//*  34   88:invokevirtual   #73  <Method int String.length()>
		//*  35   91:icmple          22
		//*  36   94:aload_3         
		//*  37   95:astore_1        
		//*  38   96:goto            22
		//*  39   99:aload_1         
		//*  40  100:ifnonnull       137
		//*  41  103:new             #75  <Class StringBuilder>
		//*  42  106:dup             
		//*  43  107:invokespecial   #76  <Method void StringBuilder()>
		//*  44  110:astore_1        
		//*  45  111:aload_1         
		//*  46  112:ldc1            #78  <String "Failed to find configured root that contains ">
		//*  47  114:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
		//*  48  117:pop             
		//*  49  118:aload_1         
		//*  50  119:aload           4
		//*  51  121:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
		//*  52  124:pop             
		//*  53  125:new             #84  <Class IllegalArgumentException>
		//*  54  128:dup             
		//*  55  129:aload_1         
		//*  56  130:invokevirtual   #87  <Method String StringBuilder.toString()>
		//*  57  133:invokespecial   #89  <Method void IllegalArgumentException(String)>
		//*  58  136:athrow          
		//*  59  137:aload_1         
		//*  60  138:invokeinterface #60  <Method Object java.util.Map$Entry.getValue()>
		//*  61  143:checkcast       #31  <Class File>
		//*  62  146:invokevirtual   #63  <Method String File.getPath()>
		//*  63  149:astore_3        
		//*  64  150:aload_3         
		//*  65  151:ldc1            #91  <String "/">
		//*  66  153:invokevirtual   #94  <Method boolean String.endsWith(String)>
		//*  67  156:ifeq            174
		//*  68  159:aload_3         
		//*  69  160:invokevirtual   #73  <Method int String.length()>
		//*  70  163:istore_2        
		//*  71  164:aload           4
		//*  72  166:iload_2         
		//*  73  167:invokevirtual   #98  <Method String String.substring(int)>
		//*  74  170:astore_3        
		//*  75  171:goto            184
		//*  76  174:aload_3         
		//*  77  175:invokevirtual   #73  <Method int String.length()>
		//*  78  178:iconst_1        
		//*  79  179:iadd            
		//*  80  180:istore_2        
		//*  81  181:goto            164
		//*  82  184:new             #75  <Class StringBuilder>
		//*  83  187:dup             
		//*  84  188:invokespecial   #76  <Method void StringBuilder()>
		//*  85  191:astore          4
		//*  86  193:aload           4
		//*  87  195:aload_1         
		//*  88  196:invokeinterface #101 <Method Object java.util.Map$Entry.getKey()>
		//*  89  201:checkcast       #65  <Class String>
		//*  90  204:invokestatic    #107 <Method String Uri.encode(String)>
		//*  91  207:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
		//*  92  210:pop             
		//*  93  211:aload           4
		//*  94  213:bipush          47
		//*  95  215:invokevirtual   #110 <Method StringBuilder StringBuilder.append(char)>
		//*  96  218:pop             
		//*  97  219:aload           4
		//*  98  221:aload_3         
		//*  99  222:ldc1            #91  <String "/">
		//* 100  224:invokestatic    #113 <Method String Uri.encode(String, String)>
		//* 101  227:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
		//* 102  230:pop             
		//* 103  231:aload           4
		//* 104  233:invokevirtual   #87  <Method String StringBuilder.toString()>
		//* 105  236:astore_1        
		//* 106  237:new             #115 <Class android.net.Uri$Builder>
		//* 107  240:dup             
		//* 108  241:invokespecial   #116 <Method void android.net.Uri$Builder()>
		//* 109  244:ldc1            #118 <String "content">
		//* 110  246:invokevirtual   #122 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
		//* 111  249:aload_0         
		//* 112  250:getfield        #25  <Field String a>
		//* 113  253:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
		//* 114  256:aload_1         
		//* 115  257:invokevirtual   #128 <Method android.net.Uri$Builder android.net.Uri$Builder.encodedPath(String)>
		//* 116  260:invokevirtual   #132 <Method Uri android.net.Uri$Builder.build()>
		//* 117  263:areturn         
		//* 118  264:new             #75  <Class StringBuilder>
		//* 119  267:dup             
		//* 120  268:invokespecial   #76  <Method void StringBuilder()>
		//* 121  271:astore_3        
		//* 122  272:aload_3         
		//* 123  273:ldc1            #134 <String "Failed to resolve canonical path for ">
		//* 124  275:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
		//* 125  278:pop             
		//* 126  279:aload_3         
		//* 127  280:aload_1         
		//* 128  281:invokevirtual   #137 <Method StringBuilder StringBuilder.append(Object)>
		//* 129  284:pop             
		//* 130  285:new             #84  <Class IllegalArgumentException>
		//* 131  288:dup             
		//* 132  289:aload_3         
		//* 133  290:invokevirtual   #87  <Method String StringBuilder.toString()>
		//* 134  293:invokespecial   #89  <Method void IllegalArgumentException(String)>
		//* 135  296:athrow          
			// Misplaced declaration of an exception variable
			catch(IOException ioexception)
			{
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append("Failed to resolve canonical path for ");
				((StringBuilder) (obj)).append(((Object) (file)));
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
			}
			file = null;
			iterator = b.entrySet().iterator();
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
				i = ((String) (obj)).length();
			else
				i = ((String) (obj)).length() + 1;
			obj = ((Object) (((String) (obj1)).substring(i)));
			obj1 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj1)).append(Uri.encode((String)((java.util.Map.Entry) (file)).getKey()));
			((StringBuilder) (obj1)).append('/');
			((StringBuilder) (obj1)).append(Uri.encode(((String) (obj)), "/"));
			file = ((File) (((StringBuilder) (obj1)).toString()));
			return (new android.net.Uri.Builder()).scheme("content").authority(a).encodedPath(((String) (file))).build();
		//* 136  297:astore_3        
		//* 137  298:goto            264
		}

		public File a(Uri uri)
		{
			IOException ioexception;
			Object obj1 = ((Object) (uri.getEncodedPath()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #141 <Method String Uri.getEncodedPath()>
		//    2    4:astore          4
			int i = ((String) (obj1)).indexOf('/', 1);
		//    3    6:aload           4
		//    4    8:bipush          47
		//    5   10:iconst_1        
		//    6   11:invokevirtual   #145 <Method int String.indexOf(int, int)>
		//    7   14:istore_2        
			Object obj = ((Object) (Uri.decode(((String) (obj1)).substring(1, i))));
		//    8   15:aload           4
		//    9   17:iconst_1        
		//   10   18:iload_2         
		//   11   19:invokevirtual   #148 <Method String String.substring(int, int)>
		//   12   22:invokestatic    #151 <Method String Uri.decode(String)>
		//   13   25:astore_3        
			obj1 = ((Object) (Uri.decode(((String) (obj1)).substring(i + 1))));
		//   14   26:aload           4
		//   15   28:iload_2         
		//   16   29:iconst_1        
		//   17   30:iadd            
		//   18   31:invokevirtual   #98  <Method String String.substring(int)>
		//   19   34:invokestatic    #151 <Method String Uri.decode(String)>
		//   20   37:astore          4
			obj = ((Object) ((File)b.get(obj)));
		//   21   39:aload_0         
		//   22   40:getfield        #23  <Field HashMap b>
		//   23   43:aload_3         
		//   24   44:invokevirtual   #155 <Method Object HashMap.get(Object)>
		//   25   47:checkcast       #31  <Class File>
		//   26   50:astore_3        
			if(obj == null)
		//*  27   51:aload_3         
		//*  28   52:ifnonnull       88
			{
				obj = ((Object) (new StringBuilder()));
		//   29   55:new             #75  <Class StringBuilder>
		//   30   58:dup             
		//   31   59:invokespecial   #76  <Method void StringBuilder()>
		//   32   62:astore_3        
				((StringBuilder) (obj)).append("Unable to find configured root for ");
		//   33   63:aload_3         
		//   34   64:ldc1            #157 <String "Unable to find configured root for ">
		//   35   66:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
		//   36   69:pop             
				((StringBuilder) (obj)).append(((Object) (uri)));
		//   37   70:aload_3         
		//   38   71:aload_1         
		//   39   72:invokevirtual   #137 <Method StringBuilder StringBuilder.append(Object)>
		//   40   75:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
		//   41   76:new             #84  <Class IllegalArgumentException>
		//   42   79:dup             
		//   43   80:aload_3         
		//   44   81:invokevirtual   #87  <Method String StringBuilder.toString()>
		//   45   84:invokespecial   #89  <Method void IllegalArgumentException(String)>
		//   46   87:athrow          
			}
			uri = ((Uri) (new File(((File) (obj)), ((String) (obj1)))));
		//   47   88:new             #31  <Class File>
		//   48   91:dup             
		//   49   92:aload_3         
		//   50   93:aload           4
		//   51   95:invokespecial   #160 <Method void File(File, String)>
		//   52   98:astore_1        
			try
			{
				obj1 = ((Object) (((File) (uri)).getCanonicalFile()));
		//   53   99:aload_1         
		//   54  100:invokevirtual   #164 <Method File File.getCanonicalFile()>
		//   55  103:astore          4
			}
		//*  56  105:aload           4
		//*  57  107:invokevirtual   #63  <Method String File.getPath()>
		//*  58  110:aload_3         
		//*  59  111:invokevirtual   #63  <Method String File.getPath()>
		//*  60  114:invokevirtual   #69  <Method boolean String.startsWith(String)>
		//*  61  117:ifne            130
		//*  62  120:new             #166 <Class SecurityException>
		//*  63  123:dup             
		//*  64  124:ldc1            #168 <String "Resolved path jumped beyond configured root">
		//*  65  126:invokespecial   #169 <Method void SecurityException(String)>
		//*  66  129:athrow          
		//*  67  130:aload           4
		//*  68  132:areturn         
		//*  69  133:new             #75  <Class StringBuilder>
		//*  70  136:dup             
		//*  71  137:invokespecial   #76  <Method void StringBuilder()>
		//*  72  140:astore_3        
		//*  73  141:aload_3         
		//*  74  142:ldc1            #134 <String "Failed to resolve canonical path for ">
		//*  75  144:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
		//*  76  147:pop             
		//*  77  148:aload_3         
		//*  78  149:aload_1         
		//*  79  150:invokevirtual   #137 <Method StringBuilder StringBuilder.append(Object)>
		//*  80  153:pop             
		//*  81  154:new             #84  <Class IllegalArgumentException>
		//*  82  157:dup             
		//*  83  158:aload_3         
		//*  84  159:invokevirtual   #87  <Method String StringBuilder.toString()>
		//*  85  162:invokespecial   #89  <Method void IllegalArgumentException(String)>
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

		public void a(String s, File file)
		{
			if(TextUtils.isEmpty(((CharSequence) (s))))
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #176 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   2    4:ifeq            17
				throw new IllegalArgumentException("Name must not be empty");
		//    3    7:new             #84  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #178 <String "Name must not be empty">
		//    6   13:invokespecial   #89  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			File file1;
			try
			{
				file1 = file.getCanonicalFile();
		//    8   17:aload_2         
		//    9   18:invokevirtual   #164 <Method File File.getCanonicalFile()>
		//   10   21:astore_3        
			}
		//*  11   22:aload_0         
		//*  12   23:getfield        #23  <Field HashMap b>
		//*  13   26:aload_1         
		//*  14   27:aload_3         
		//*  15   28:invokevirtual   #182 <Method Object HashMap.put(Object, Object)>
		//*  16   31:pop             
		//*  17   32:return          
			// Misplaced declaration of an exception variable
			catch(String s)
		//*  18   33:astore_1        
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   19   34:new             #75  <Class StringBuilder>
		//   20   37:dup             
		//   21   38:invokespecial   #76  <Method void StringBuilder()>
		//   22   41:astore_3        
				stringbuilder.append("Failed to resolve canonical path for ");
		//   23   42:aload_3         
		//   24   43:ldc1            #134 <String "Failed to resolve canonical path for ">
		//   25   45:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
		//   26   48:pop             
				stringbuilder.append(((Object) (file)));
		//   27   49:aload_3         
		//   28   50:aload_2         
		//   29   51:invokevirtual   #137 <Method StringBuilder StringBuilder.append(Object)>
		//   30   54:pop             
				throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (s)));
		//   31   55:new             #84  <Class IllegalArgumentException>
		//   32   58:dup             
		//   33   59:aload_3         
		//   34   60:invokevirtual   #87  <Method String StringBuilder.toString()>
		//   35   63:aload_1         
		//   36   64:invokespecial   #185 <Method void IllegalArgumentException(String, Throwable)>
		//   37   67:athrow          
			}
			b.put(((Object) (s)), ((Object) (file1)));
		}

		private final String a;
		private final HashMap b = new HashMap();

		public b(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #20  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #21  <Method void HashMap()>
		//    6   12:putfield        #23  <Field HashMap b>
			a = s;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #25  <Field String a>
		//   10   20:return          
		}
	}


	public FileProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void ContentProvider()>
	//    2    4:return          
	}

	private static int a(String s)
	{
		if("r".equals(((Object) (s))))
	//*   0    0:ldc1            #48  <String "r">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            12
			return 0x10000000;
	//    4    9:ldc1            #53  <Int 0x10000000>
	//    5   11:ireturn         
		if(!"w".equals(((Object) (s))) && !"wt".equals(((Object) (s))))
	//*   6   12:ldc1            #55  <String "w">
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*   9   18:ifne            102
	//*  10   21:ldc1            #57  <String "wt">
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  13   27:ifeq            33
	//*  14   30:goto            102
		{
			if("wa".equals(((Object) (s))))
	//*  15   33:ldc1            #59  <String "wa">
	//*  16   35:aload_0         
	//*  17   36:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  18   39:ifeq            45
				return 0x2a000000;
	//   19   42:ldc1            #60  <Int 0x2a000000>
	//   20   44:ireturn         
			if("rw".equals(((Object) (s))))
	//*  21   45:ldc1            #62  <String "rw">
	//*  22   47:aload_0         
	//*  23   48:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  24   51:ifeq            57
				return 0x38000000;
	//   25   54:ldc1            #63  <Int 0x38000000>
	//   26   56:ireturn         
			if("rwt".equals(((Object) (s))))
	//*  27   57:ldc1            #65  <String "rwt">
	//*  28   59:aload_0         
	//*  29   60:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  30   63:ifeq            69
			{
				return 0x3c000000;
	//   31   66:ldc1            #66  <Int 0x3c000000>
	//   32   68:ireturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   33   69:new             #68  <Class StringBuilder>
	//   34   72:dup             
	//   35   73:invokespecial   #69  <Method void StringBuilder()>
	//   36   76:astore_1        
				stringbuilder.append("Invalid mode: ");
	//   37   77:aload_1         
	//   38   78:ldc1            #71  <String "Invalid mode: ">
	//   39   80:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   40   83:pop             
				stringbuilder.append(s);
	//   41   84:aload_1         
	//   42   85:aload_0         
	//   43   86:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   44   89:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   45   90:new             #77  <Class IllegalArgumentException>
	//   46   93:dup             
	//   47   94:aload_1         
	//   48   95:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   49   98:invokespecial   #82  <Method void IllegalArgumentException(String)>
	//   50  101:athrow          
			}
		} else
		{
			return 0x2c000000;
	//   51  102:ldc1            #83  <Int 0x2c000000>
	//   52  104:ireturn         
		}
	}

	public static Uri a(Context context, String s, File file)
	{
		return a(context, s).a(file);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #87  <Method FileProvider$a a(Context, String)>
	//    3    5:aload_2         
	//    4    6:invokeinterface #90  <Method Uri FileProvider$a.a(File)>
	//    5   11:areturn         
	}

	private static a a(Context context, String s)
	{
		HashMap hashmap = c;
	//    0    0:getstatic       #43  <Field HashMap c>
	//    1    3:astore          4
		hashmap;
	//    2    5:aload           4
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		a a2 = (a)c.get(((Object) (s)));
	//    4    8:getstatic       #43  <Field HashMap c>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #98  <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #6   <Class FileProvider$a>
	//    8   18:astore_3        
		a a1;
		a1 = a2;
	//    9   19:aload_3         
	//   10   20:astore_2        
		if(a2 != null)
			break MISSING_BLOCK_LABEL_67;
	//   11   21:aload_3         
	//   12   22:ifnonnull       67
		a1 = b(context, s);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokestatic    #100 <Method FileProvider$a b(Context, String)>
	//   16   30:astore_2        
		c.put(((Object) (s)), ((Object) (a1)));
	//   17   31:getstatic       #43  <Field HashMap c>
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokevirtual   #104 <Method Object HashMap.put(Object, Object)>
	//   21   39:pop             
		break MISSING_BLOCK_LABEL_67;
	//   22   40:goto            67
		context;
	//   23   43:astore_0        
		throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", ((Throwable) (context)));
	//   24   44:new             #77  <Class IllegalArgumentException>
	//   25   47:dup             
	//   26   48:ldc1            #106 <String "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data">
	//   27   50:aload_0         
	//   28   51:invokespecial   #109 <Method void IllegalArgumentException(String, Throwable)>
	//   29   54:athrow          
		context;
	//   30   55:astore_0        
		throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", ((Throwable) (context)));
	//   31   56:new             #77  <Class IllegalArgumentException>
	//   32   59:dup             
	//   33   60:ldc1            #106 <String "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data">
	//   34   62:aload_0         
	//   35   63:invokespecial   #109 <Method void IllegalArgumentException(String, Throwable)>
	//   36   66:athrow          
		hashmap;
	//   37   67:aload           4
		JVM INSTR monitorexit ;
	//   38   69:monitorexit     
		return a1;
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

	private static transient File a(File file, String as[])
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
	//   16   23:new             #29  <Class File>
	//   17   26:dup             
	//   18   27:aload_0         
	//   19   28:aload           5
	//   20   30:invokespecial   #113 <Method void File(File, String)>
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

	private static Object[] a(Object aobj[], int i)
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
	//    8   10:invokestatic    #122 <Method void System.arraycopy(Object, int, Object, int, int)>
		return aobj1;
	//    9   13:aload_2         
	//   10   14:areturn         
	}

	private static String[] a(String as[], int i)
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
	//    8   10:invokestatic    #122 <Method void System.arraycopy(Object, int, Object, int, int)>
		return as1;
	//    9   13:aload_2         
	//   10   14:areturn         
	}

	private static a b(Context context, String s)
	{
		b b1 = new b(s);
	//    0    0:new             #9   <Class FileProvider$b>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #124 <Method void FileProvider$b(String)>
	//    4    8:astore          4
		XmlResourceParser xmlresourceparser = context.getPackageManager().resolveContentProvider(s, 128).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
	//    5   10:aload_0         
	//    6   11:invokevirtual   #130 <Method PackageManager Context.getPackageManager()>
	//    7   14:aload_1         
	//    8   15:sipush          128
	//    9   18:invokevirtual   #136 <Method ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #130 <Method PackageManager Context.getPackageManager()>
	//   12   25:ldc1            #138 <String "android.support.FILE_PROVIDER_PATHS">
	//   13   27:invokevirtual   #144 <Method XmlResourceParser ProviderInfo.loadXmlMetaData(PackageManager, String)>
	//   14   30:astore          5
		if(xmlresourceparser == null)
	//*  15   32:aload           5
	//*  16   34:ifnonnull       47
			throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
	//   17   37:new             #77  <Class IllegalArgumentException>
	//   18   40:dup             
	//   19   41:ldc1            #146 <String "Missing android.support.FILE_PROVIDER_PATHS meta-data">
	//   20   43:invokespecial   #82  <Method void IllegalArgumentException(String)>
	//   21   46:athrow          
		do
		{
			int i = xmlresourceparser.next();
	//   22   47:aload           5
	//   23   49:invokeinterface #152 <Method int XmlResourceParser.next()>
	//   24   54:istore_2        
			if(i == 1)
				break;
	//   25   55:iload_2         
	//   26   56:iconst_1        
	//   27   57:icmpeq          261
			if(i == 2)
	//*  28   60:iload_2         
	//*  29   61:iconst_2        
	//*  30   62:icmpne          47
			{
				Object obj1 = ((Object) (xmlresourceparser.getName()));
	//   31   65:aload           5
	//   32   67:invokeinterface #155 <Method String XmlResourceParser.getName()>
	//   33   72:astore          8
				Object obj = null;
	//   34   74:aconst_null     
	//   35   75:astore_3        
				String s1 = xmlresourceparser.getAttributeValue(((String) (null)), "name");
	//   36   76:aload           5
	//   37   78:aconst_null     
	//   38   79:ldc1            #157 <String "name">
	//   39   81:invokeinterface #161 <Method String XmlResourceParser.getAttributeValue(String, String)>
	//   40   86:astore          6
				String s2 = xmlresourceparser.getAttributeValue(((String) (null)), "path");
	//   41   88:aload           5
	//   42   90:aconst_null     
	//   43   91:ldc1            #163 <String "path">
	//   44   93:invokeinterface #161 <Method String XmlResourceParser.getAttributeValue(String, String)>
	//   45   98:astore          7
				if("root-path".equals(obj1))
	//*  46  100:ldc1            #165 <String "root-path">
	//*  47  102:aload           8
	//*  48  104:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  49  107:ifeq            117
					s = ((String) (b));
	//   50  110:getstatic       #37  <Field File b>
	//   51  113:astore_1        
				else
	//*  52  114:goto            234
				if("files-path".equals(obj1))
	//*  53  117:ldc1            #167 <String "files-path">
	//*  54  119:aload           8
	//*  55  121:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  56  124:ifeq            135
					s = ((String) (context.getFilesDir()));
	//   57  127:aload_0         
	//   58  128:invokevirtual   #171 <Method File Context.getFilesDir()>
	//   59  131:astore_1        
				else
	//*  60  132:goto            234
				if("cache-path".equals(obj1))
	//*  61  135:ldc1            #173 <String "cache-path">
	//*  62  137:aload           8
	//*  63  139:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  64  142:ifeq            153
					s = ((String) (context.getCacheDir()));
	//   65  145:aload_0         
	//   66  146:invokevirtual   #176 <Method File Context.getCacheDir()>
	//   67  149:astore_1        
				else
	//*  68  150:goto            234
				if("external-path".equals(obj1))
	//*  69  153:ldc1            #178 <String "external-path">
	//*  70  155:aload           8
	//*  71  157:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  72  160:ifeq            170
					s = ((String) (Environment.getExternalStorageDirectory()));
	//   73  163:invokestatic    #183 <Method File Environment.getExternalStorageDirectory()>
	//   74  166:astore_1        
				else
	//*  75  167:goto            234
				if("external-files-path".equals(obj1))
	//*  76  170:ldc1            #185 <String "external-files-path">
	//*  77  172:aload           8
	//*  78  174:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  79  177:ifeq            203
				{
					obj1 = ((Object) (android.support.v4.content.a.getExternalFilesDirs(context, ((String) (null)))));
	//   80  180:aload_0         
	//   81  181:aconst_null     
	//   82  182:invokestatic    #191 <Method File[] a.getExternalFilesDirs(Context, String)>
	//   83  185:astore          8
					s = ((String) (obj));
	//   84  187:aload_3         
	//   85  188:astore_1        
					if(obj1.length > 0)
	//*  86  189:aload           8
	//*  87  191:arraylength     
	//*  88  192:ifle            234
						s = ((String) (obj1[0]));
	//   89  195:aload           8
	//   90  197:iconst_0        
	//   91  198:aaload          
	//   92  199:astore_1        
				} else
	//*  93  200:goto            234
				{
					s = ((String) (obj));
	//   94  203:aload_3         
	//   95  204:astore_1        
					if("external-cache-path".equals(obj1))
	//*  96  205:ldc1            #193 <String "external-cache-path">
	//*  97  207:aload           8
	//*  98  209:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  99  212:ifeq            234
					{
						File afile[] = android.support.v4.content.a.getExternalCacheDirs(context);
	//  100  215:aload_0         
	//  101  216:invokestatic    #197 <Method File[] a.getExternalCacheDirs(Context)>
	//  102  219:astore          8
						s = ((String) (obj));
	//  103  221:aload_3         
	//  104  222:astore_1        
						if(afile.length > 0)
	//* 105  223:aload           8
	//* 106  225:arraylength     
	//* 107  226:ifle            234
							s = ((String) (afile[0]));
	//  108  229:aload           8
	//  109  231:iconst_0        
	//  110  232:aaload          
	//  111  233:astore_1        
					}
				}
				if(s != null)
	//* 112  234:aload_1         
	//* 113  235:ifnull          47
					b1.a(s1, a(((File) (s)), new String[] {
						s2
					}));
	//  114  238:aload           4
	//  115  240:aload           6
	//  116  242:aload_1         
	//  117  243:iconst_1        
	//  118  244:anewarray       String[]
	//  119  247:dup             
	//  120  248:iconst_0        
	//  121  249:aload           7
	//  122  251:aastore         
	//  123  252:invokestatic    #199 <Method File a(File, String[])>
	//  124  255:invokevirtual   #202 <Method void FileProvider$b.a(String, File)>
			}
		} while(true);
	//  125  258:goto            47
		return ((a) (b1));
	//  126  261:aload           4
	//  127  263:areturn         
	}

	public void attachInfo(Context context, ProviderInfo providerinfo)
	{
		super.attachInfo(context, providerinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #206 <Method void ContentProvider.attachInfo(Context, ProviderInfo)>
		if(providerinfo.exported)
	//*   4    6:aload_2         
	//*   5    7:getfield        #210 <Field boolean ProviderInfo.exported>
	//*   6   10:ifeq            23
			throw new SecurityException("Provider must not be exported");
	//    7   13:new             #212 <Class SecurityException>
	//    8   16:dup             
	//    9   17:ldc1            #214 <String "Provider must not be exported">
	//   10   19:invokespecial   #215 <Method void SecurityException(String)>
	//   11   22:athrow          
		if(!providerinfo.grantUriPermissions)
	//*  12   23:aload_2         
	//*  13   24:getfield        #218 <Field boolean ProviderInfo.grantUriPermissions>
	//*  14   27:ifne            40
		{
			throw new SecurityException("Provider must grant uri permissions");
	//   15   30:new             #212 <Class SecurityException>
	//   16   33:dup             
	//   17   34:ldc1            #220 <String "Provider must grant uri permissions">
	//   18   36:invokespecial   #215 <Method void SecurityException(String)>
	//   19   39:athrow          
		} else
		{
			d = a(context, providerinfo.authority);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:getfield        #224 <Field String ProviderInfo.authority>
	//   24   46:invokestatic    #87  <Method FileProvider$a a(Context, String)>
	//   25   49:putfield        #226 <Field FileProvider$a d>
			return;
	//   26   52:return          
		}
	}

	public int delete(Uri uri, String s, String as[])
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #230 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #232 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #235 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public String getType(Uri uri)
	{
		uri = ((Uri) (d.a(uri)));
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field FileProvider$a d>
	//    2    4:aload_1         
	//    3    5:invokeinterface #240 <Method File FileProvider$a.a(Uri)>
	//    4   10:astore_1        
		int i = ((File) (uri)).getName().lastIndexOf('.');
	//    5   11:aload_1         
	//    6   12:invokevirtual   #241 <Method String File.getName()>
	//    7   15:bipush          46
	//    8   17:invokevirtual   #245 <Method int String.lastIndexOf(int)>
	//    9   20:istore_2        
		if(i >= 0)
	//*  10   21:iload_2         
	//*  11   22:iflt            50
		{
			uri = ((Uri) (((File) (uri)).getName().substring(i + 1)));
	//   12   25:aload_1         
	//   13   26:invokevirtual   #241 <Method String File.getName()>
	//   14   29:iload_2         
	//   15   30:iconst_1        
	//   16   31:iadd            
	//   17   32:invokevirtual   #249 <Method String String.substring(int)>
	//   18   35:astore_1        
			uri = ((Uri) (MimeTypeMap.getSingleton().getMimeTypeFromExtension(((String) (uri)))));
	//   19   36:invokestatic    #255 <Method MimeTypeMap MimeTypeMap.getSingleton()>
	//   20   39:aload_1         
	//   21   40:invokevirtual   #259 <Method String MimeTypeMap.getMimeTypeFromExtension(String)>
	//   22   43:astore_1        
			if(uri != null)
	//*  23   44:aload_1         
	//*  24   45:ifnull          50
				return ((String) (uri));
	//   25   48:aload_1         
	//   26   49:areturn         
		}
		return "application/octet-stream";
	//   27   50:ldc2            #261 <String "application/octet-stream">
	//   28   53:areturn         
	}

	public Uri insert(Uri uri, ContentValues contentvalues)
	{
		throw new UnsupportedOperationException("No external inserts");
	//    0    0:new             #265 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #267 <String "No external inserts">
	//    3    7:invokespecial   #268 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public boolean onCreate()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public ParcelFileDescriptor openFile(Uri uri, String s)
	{
		return ParcelFileDescriptor.open(d.a(uri), a(s));
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field FileProvider$a d>
	//    2    4:aload_1         
	//    3    5:invokeinterface #240 <Method File FileProvider$a.a(Uri)>
	//    4   10:aload_2         
	//    5   11:invokestatic    #274 <Method int a(String)>
	//    6   14:invokestatic    #280 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//    7   17:areturn         
	}

	public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		int i;
		int j;
		int i1;
		s = ((String) (d.a(uri)));
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field FileProvider$a d>
	//    2    4:aload_1         
	//    3    5:invokeinterface #240 <Method File FileProvider$a.a(Uri)>
	//    4   10:astore_3        
		uri = ((Uri) (as));
	//    5   11:aload_2         
	//    6   12:astore_1        
		if(as == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       21
			uri = ((Uri) (a));
	//    9   17:getstatic       #27  <Field String[] a>
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
		i1 = uri.length;
	//   19   34:aload_1         
	//   20   35:arraylength     
	//   21   36:istore          9
		j = 0;
	//   22   38:iconst_0        
	//   23   39:istore          7
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
	//   33   57:ldc1            #23  <String "_display_name">
	//   34   59:aload           5
	//   35   61:invokevirtual   #52  <Method boolean String.equals(Object)>
	//   36   64:ifeq            99
_L3:
		as1[i] = "_display_name";
	//   37   67:aload           4
	//   38   69:iload           6
	//   39   71:ldc1            #23  <String "_display_name">
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
	//   48   84:invokevirtual   #241 <Method String File.getName()>
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
	//   57  103:ldc1            #25  <String "_size">
	//   58  105:aload           5
	//   59  107:invokevirtual   #52  <Method boolean String.equals(Object)>
	//   60  110:ifeq            144
		as1[i] = "_size";
	//   61  113:aload           4
	//   62  115:iload           6
	//   63  117:ldc1            #25  <String "_size">
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
	//   72  130:invokevirtual   #286 <Method long File.length()>
	//   73  133:invokestatic    #292 <Method Long Long.valueOf(long)>
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
		uri = ((Uri) (a(as1, i)));
	//   85  157:aload           4
	//   86  159:iload           6
	//   87  161:invokestatic    #294 <Method String[] a(String[], int)>
	//   88  164:astore_1        
		as = ((String []) (a(((Object []) (as)), i)));
	//   89  165:aload_2         
	//   90  166:iload           6
	//   91  168:invokestatic    #296 <Method Object[] a(Object[], int)>
	//   92  171:astore_2        
		uri = ((Uri) (new MatrixCursor(((String []) (uri)), 1)));
	//   93  172:new             #298 <Class MatrixCursor>
	//   94  175:dup             
	//   95  176:aload_1         
	//   96  177:iconst_1        
	//   97  178:invokespecial   #301 <Method void MatrixCursor(String[], int)>
	//   98  181:astore_1        
		((MatrixCursor) (uri)).addRow(((Object []) (as)));
	//   99  182:aload_1         
	//  100  183:aload_2         
	//  101  184:invokevirtual   #305 <Method void MatrixCursor.addRow(Object[])>
		return ((Cursor) (uri));
	//  102  187:aload_1         
	//  103  188:areturn         
	}

	public int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		throw new UnsupportedOperationException("No external updates");
	//    0    0:new             #265 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #309 <String "No external updates">
	//    3    7:invokespecial   #268 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	private static final String a[] = {
		"_display_name", "_size"
	};
	private static final File b = new File("/");
	private static HashMap c = new HashMap();
	private a d;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #23  <String "_display_name">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #25  <String "_size">
	//    9   13:aastore         
	//   10   14:putstatic       #27  <Field String[] a>
	//   11   17:new             #29  <Class File>
	//   12   20:dup             
	//   13   21:ldc1            #31  <String "/">
	//   14   23:invokespecial   #35  <Method void File(String)>
	//   15   26:putstatic       #37  <Field File b>
	//   16   29:new             #39  <Class HashMap>
	//   17   32:dup             
	//   18   33:invokespecial   #41  <Method void HashMap()>
	//   19   36:putstatic       #43  <Field HashMap c>
	//*  20   39:return          
	}
}
