// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.android.gms.common.internal:
//			GmsLogger, Preconditions

public class LibraryVersion
{

	protected LibraryVersion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		zzen = new ConcurrentHashMap();
	//    2    4:aload_0         
	//    3    5:new             #35  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #38  <Field ConcurrentHashMap zzen>
	//    7   15:return          
	}

	public static LibraryVersion getInstance()
	{
		return zzem;
	//    0    0:getstatic       #30  <Field LibraryVersion zzem>
	//    1    3:areturn         
	}

	public String getVersion(String s)
	{
		Object obj;
		Object obj1;
		StringBuilder stringbuilder;
		Preconditions.checkNotEmpty(s, "Please provide a valid libraryName");
	//    0    0:aload_1         
	//    1    1:ldc1            #47  <String "Please provide a valid libraryName">
	//    2    3:invokestatic    #53  <Method String Preconditions.checkNotEmpty(String, Object)>
	//    3    6:pop             
		if(zzen.containsKey(((Object) (s))))
	//*   4    7:aload_0         
	//*   5    8:getfield        #38  <Field ConcurrentHashMap zzen>
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #57  <Method boolean ConcurrentHashMap.containsKey(Object)>
	//*   8   15:ifeq            30
			return (String)zzen.get(((Object) (s)));
	//    9   18:aload_0         
	//   10   19:getfield        #38  <Field ConcurrentHashMap zzen>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #61  <Method Object ConcurrentHashMap.get(Object)>
	//   13   26:checkcast       #63  <Class String>
	//   14   29:areturn         
		obj = ((Object) (new Properties()));
	//   15   30:new             #65  <Class Properties>
	//   16   33:dup             
	//   17   34:invokespecial   #66  <Method void Properties()>
	//   18   37:astore_2        
		stringbuilder = null;
	//   19   38:aconst_null     
	//   20   39:astore          4
		obj1 = null;
	//   21   41:aconst_null     
	//   22   42:astore_3        
		Object obj3 = ((Object) (((Class) (com/google/android/gms/common/internal/LibraryVersion)).getResourceAsStream(String.format("/%s.properties", new Object[] {
			s
		}))));
	//   23   43:ldc1            #2   <Class LibraryVersion>
	//   24   45:ldc1            #68  <String "/%s.properties">
	//   25   47:iconst_1        
	//   26   48:anewarray       Object[]
	//   27   51:dup             
	//   28   52:iconst_0        
	//   29   53:aload_1         
	//   30   54:aastore         
	//   31   55:invokestatic    #72  <Method String String.format(String, Object[])>
	//   32   58:invokevirtual   #78  <Method java.io.InputStream Class.getResourceAsStream(String)>
	//   33   61:astore          5
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_153;
	//   34   63:aload           5
	//   35   65:ifnull          153
		((Properties) (obj)).load(((java.io.InputStream) (obj3)));
	//   36   68:aload_2         
	//   37   69:aload           5
	//   38   71:invokevirtual   #82  <Method void Properties.load(java.io.InputStream)>
		obj = ((Object) (((Properties) (obj)).getProperty("version", ((String) (null)))));
	//   39   74:aload_2         
	//   40   75:ldc1            #84  <String "version">
	//   41   77:aconst_null     
	//   42   78:invokevirtual   #88  <Method String Properties.getProperty(String, String)>
	//   43   81:astore_2        
		try
		{
			obj1 = ((Object) (zzel));
	//   44   82:getstatic       #26  <Field GmsLogger zzel>
	//   45   85:astore_3        
			stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 12 + String.valueOf(obj).length());
	//   46   86:new             #90  <Class StringBuilder>
	//   47   89:dup             
	//   48   90:aload_1         
	//   49   91:invokestatic    #94  <Method String String.valueOf(Object)>
	//   50   94:invokevirtual   #98  <Method int String.length()>
	//   51   97:bipush          12
	//   52   99:iadd            
	//   53  100:aload_2         
	//   54  101:invokestatic    #94  <Method String String.valueOf(Object)>
	//   55  104:invokevirtual   #98  <Method int String.length()>
	//   56  107:iadd            
	//   57  108:invokespecial   #101 <Method void StringBuilder(int)>
	//   58  111:astore          4
			stringbuilder.append(s);
	//   59  113:aload           4
	//   60  115:aload_1         
	//   61  116:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   62  119:pop             
			stringbuilder.append(" version is ");
	//   63  120:aload           4
	//   64  122:ldc1            #107 <String " version is ">
	//   65  124:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   66  127:pop             
			stringbuilder.append(((String) (obj)));
	//   67  128:aload           4
	//   68  130:aload_2         
	//   69  131:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   70  134:pop             
			((GmsLogger) (obj1)).v("LibraryVersion", stringbuilder.toString());
	//   71  135:aload_3         
	//   72  136:ldc1            #18  <String "LibraryVersion">
	//   73  138:aload           4
	//   74  140:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   75  143:invokevirtual   #114 <Method void GmsLogger.v(String, String)>
			break MISSING_BLOCK_LABEL_263;
	//   76  146:goto            263
		}
		// Misplaced declaration of an exception variable
		catch(Object obj1) { }
	//   77  149:astore_3        
		break MISSING_BLOCK_LABEL_211;
	//   78  150:goto            211
		obj3 = ((Object) (zzel));
	//   79  153:getstatic       #26  <Field GmsLogger zzel>
	//   80  156:astore          5
		obj = ((Object) (String.valueOf(((Object) (s)))));
	//   81  158:aload_1         
	//   82  159:invokestatic    #94  <Method String String.valueOf(Object)>
	//   83  162:astore_2        
		if(((String) (obj)).length() != 0)
	//*  84  163:aload_2         
	//*  85  164:invokevirtual   #98  <Method int String.length()>
	//*  86  167:ifeq            180
		{
			obj = ((Object) ("Failed to get app version for libraryName: ".concat(((String) (obj)))));
	//   87  170:ldc1            #116 <String "Failed to get app version for libraryName: ">
	//   88  172:aload_2         
	//   89  173:invokevirtual   #119 <Method String String.concat(String)>
	//   90  176:astore_2        
			break MISSING_BLOCK_LABEL_190;
	//   91  177:goto            190
		}
		obj = ((Object) (new String("Failed to get app version for libraryName: ")));
	//   92  180:new             #63  <Class String>
	//   93  183:dup             
	//   94  184:ldc1            #116 <String "Failed to get app version for libraryName: ">
	//   95  186:invokespecial   #122 <Method void String(String)>
	//   96  189:astore_2        
		((GmsLogger) (obj3)).e("LibraryVersion", ((String) (obj)));
	//   97  190:aload           5
	//   98  192:ldc1            #18  <String "LibraryVersion">
	//   99  194:aload_2         
	//  100  195:invokevirtual   #125 <Method void GmsLogger.e(String, String)>
		obj = ((Object) (stringbuilder));
	//  101  198:aload           4
	//  102  200:astore_2        
		break MISSING_BLOCK_LABEL_263;
	//  103  201:goto            263
		IOException ioexception;
		ioexception;
	//  104  204:astore          4
		obj = obj1;
	//  105  206:aload_3         
	//  106  207:astore_2        
		obj1 = ((Object) (ioexception));
	//  107  208:aload           4
	//  108  210:astore_3        
		GmsLogger gmslogger = zzel;
	//  109  211:getstatic       #26  <Field GmsLogger zzel>
	//  110  214:astore          5
		String s1 = String.valueOf(((Object) (s)));
	//  111  216:aload_1         
	//  112  217:invokestatic    #94  <Method String String.valueOf(Object)>
	//  113  220:astore          4
		if(s1.length() != 0)
	//* 114  222:aload           4
	//* 115  224:invokevirtual   #98  <Method int String.length()>
	//* 116  227:ifeq            242
			s1 = "Failed to get app version for libraryName: ".concat(s1);
	//  117  230:ldc1            #116 <String "Failed to get app version for libraryName: ">
	//  118  232:aload           4
	//  119  234:invokevirtual   #119 <Method String String.concat(String)>
	//  120  237:astore          4
		else
	//* 121  239:goto            253
			s1 = new String("Failed to get app version for libraryName: ");
	//  122  242:new             #63  <Class String>
	//  123  245:dup             
	//  124  246:ldc1            #116 <String "Failed to get app version for libraryName: ">
	//  125  248:invokespecial   #122 <Method void String(String)>
	//  126  251:astore          4
		gmslogger.e("LibraryVersion", s1, ((Throwable) (obj1)));
	//  127  253:aload           5
	//  128  255:ldc1            #18  <String "LibraryVersion">
	//  129  257:aload           4
	//  130  259:aload_3         
	//  131  260:invokevirtual   #128 <Method void GmsLogger.e(String, String, Throwable)>
		Object obj2 = obj;
	//  132  263:aload_2         
	//  133  264:astore_3        
		if(obj == null)
	//* 134  265:aload_2         
	//* 135  266:ifnonnull       282
		{
			obj2 = "UNKNOWN";
	//  136  269:ldc1            #130 <String "UNKNOWN">
	//  137  271:astore_3        
			zzel.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
	//  138  272:getstatic       #26  <Field GmsLogger zzel>
	//  139  275:ldc1            #18  <String "LibraryVersion">
	//  140  277:ldc1            #132 <String ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used">
	//  141  279:invokevirtual   #135 <Method void GmsLogger.d(String, String)>
		}
		zzen.put(((Object) (s)), obj2);
	//  142  282:aload_0         
	//  143  283:getfield        #38  <Field ConcurrentHashMap zzen>
	//  144  286:aload_1         
	//  145  287:aload_3         
	//  146  288:invokevirtual   #139 <Method Object ConcurrentHashMap.put(Object, Object)>
	//  147  291:pop             
		return ((String) (obj2));
	//  148  292:aload_3         
	//  149  293:areturn         
	}

	private static final GmsLogger zzel = new GmsLogger("LibraryVersion", "");
	private static LibraryVersion zzem = new LibraryVersion();
	private ConcurrentHashMap zzen;

	static 
	{
	//    0    0:new             #16  <Class GmsLogger>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "LibraryVersion">
	//    3    6:ldc1            #20  <String "">
	//    4    8:invokespecial   #24  <Method void GmsLogger(String, String)>
	//    5   11:putstatic       #26  <Field GmsLogger zzel>
	//    6   14:new             #2   <Class LibraryVersion>
	//    7   17:dup             
	//    8   18:invokespecial   #28  <Method void LibraryVersion()>
	//    9   21:putstatic       #30  <Field LibraryVersion zzem>
	//*  10   24:return          
	}
}
