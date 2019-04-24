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

static class FileProvider$b
	implements FileProvider$a
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

	public FileProvider$b(String s)
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
