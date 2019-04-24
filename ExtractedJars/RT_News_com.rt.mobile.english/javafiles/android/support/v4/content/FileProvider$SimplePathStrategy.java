// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.*;

// Referenced classes of package android.support.v4.content:
//			FileProvider

static class FileProvider$SimplePathStrategy
	implements FileProvider.PathStrategy
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

	FileProvider$SimplePathStrategy(String s)
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
