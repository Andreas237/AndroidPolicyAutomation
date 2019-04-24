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
