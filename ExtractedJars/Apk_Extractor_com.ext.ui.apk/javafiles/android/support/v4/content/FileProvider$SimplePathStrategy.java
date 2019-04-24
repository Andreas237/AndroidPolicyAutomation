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

	public FileProvider$SimplePathStrategy(String s)
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
