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
