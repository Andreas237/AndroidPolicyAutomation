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
		String s1;
		Iterator iterator;
		try
		{
			s1 = file.getCanonicalPath();
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
	//*  12   28:ifeq            125
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
		catch(IOException ioexception)
	//*  39   97:astore_2        
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Failed to resolve canonical path for ").append(((Object) (file))).toString());
	//   40   98:new             #39  <Class IllegalArgumentException>
	//   41  101:dup             
	//   42  102:new             #55  <Class StringBuilder>
	//   43  105:dup             
	//   44  106:invokespecial   #56  <Method void StringBuilder()>
	//   45  109:ldc1            #58  <String "Failed to resolve canonical path for ">
	//   46  111:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   47  114:aload_1         
	//   48  115:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   49  118:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   50  121:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   51  124:athrow          
		}
		file = null;
		iterator = mRoots.entrySet().iterator();
		do
		{
			if(!iterator.hasNext())
				break;
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
			String s2 = ((File)entry.getValue()).getPath();
			if(s1.startsWith(s2) && (file == null || s2.length() > ((File)((java.util.Map.Entry) (file)).getValue()).getPath().length()))
				file = ((File) (entry));
		} while(true);
		if(file == null)
	//*  52  125:aload_1         
	//*  53  126:ifnonnull       156
			throw new IllegalArgumentException((new StringBuilder()).append("Failed to find configured root that contains ").append(s1).toString());
	//   54  129:new             #39  <Class IllegalArgumentException>
	//   55  132:dup             
	//   56  133:new             #55  <Class StringBuilder>
	//   57  136:dup             
	//   58  137:invokespecial   #56  <Method void StringBuilder()>
	//   59  140:ldc1            #153 <String "Failed to find configured root that contains ">
	//   60  142:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   61  145:aload_3         
	//   62  146:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   63  149:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   64  152:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   65  155:athrow          
		String s = ((File)((java.util.Map.Entry) (file)).getValue()).getPath();
	//   66  156:aload_1         
	//   67  157:invokeinterface #147 <Method Object java.util.Map$Entry.getValue()>
	//   68  162:checkcast       #45  <Class File>
	//   69  165:invokevirtual   #108 <Method String File.getPath()>
	//   70  168:astore_2        
		if(s.endsWith("/"))
	//*  71  169:aload_2         
	//*  72  170:ldc1            #155 <String "/">
	//*  73  172:invokevirtual   #158 <Method boolean String.endsWith(String)>
	//*  74  175:ifeq            254
			s = s1.substring(s.length());
	//   75  178:aload_3         
	//   76  179:aload_2         
	//   77  180:invokevirtual   #151 <Method int String.length()>
	//   78  183:invokevirtual   #96  <Method String String.substring(int)>
	//   79  186:astore_2        
		else
	//*  80  187:new             #55  <Class StringBuilder>
	//*  81  190:dup             
	//*  82  191:invokespecial   #56  <Method void StringBuilder()>
	//*  83  194:aload_1         
	//*  84  195:invokeinterface #161 <Method Object java.util.Map$Entry.getKey()>
	//*  85  200:checkcast       #81  <Class String>
	//*  86  203:invokestatic    #164 <Method String Uri.encode(String)>
	//*  87  206:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  88  209:bipush          47
	//*  89  211:invokevirtual   #167 <Method StringBuilder StringBuilder.append(char)>
	//*  90  214:aload_2         
	//*  91  215:ldc1            #155 <String "/">
	//*  92  217:invokestatic    #170 <Method String Uri.encode(String, String)>
	//*  93  220:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  94  223:invokevirtual   #69  <Method String StringBuilder.toString()>
	//*  95  226:astore_1        
	//*  96  227:new             #172 <Class android.net.Uri$Builder>
	//*  97  230:dup             
	//*  98  231:invokespecial   #173 <Method void android.net.Uri$Builder()>
	//*  99  234:ldc1            #175 <String "content">
	//* 100  236:invokevirtual   #179 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//* 101  239:aload_0         
	//* 102  240:getfield        #26  <Field String mAuthority>
	//* 103  243:invokevirtual   #182 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//* 104  246:aload_1         
	//* 105  247:invokevirtual   #185 <Method android.net.Uri$Builder android.net.Uri$Builder.encodedPath(String)>
	//* 106  250:invokevirtual   #189 <Method Uri android.net.Uri$Builder.build()>
	//* 107  253:areturn         
			s = s1.substring(s.length() + 1);
	//  108  254:aload_3         
	//  109  255:aload_2         
	//  110  256:invokevirtual   #151 <Method int String.length()>
	//  111  259:iconst_1        
	//  112  260:iadd            
	//  113  261:invokevirtual   #96  <Method String String.substring(int)>
	//  114  264:astore_2        
		file = ((File) ((new StringBuilder()).append(Uri.encode((String)((java.util.Map.Entry) (file)).getKey())).append('/').append(Uri.encode(s, "/")).toString()));
		return (new android.net.Uri.Builder()).scheme("content").authority(mAuthority).encodedPath(((String) (file))).build();
	//* 115  265:goto            187
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
