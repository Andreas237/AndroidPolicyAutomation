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
		GmsLogger gmslogger;
		StringBuilder stringbuilder;
		Preconditions.checkNotEmpty(s, "Please provide a valid libraryName");
	//    0    0:aload_1         
	//    1    1:ldc1            #48  <String "Please provide a valid libraryName">
	//    2    3:invokestatic    #54  <Method String Preconditions.checkNotEmpty(String, Object)>
	//    3    6:pop             
		if(zzen.containsKey(((Object) (s))))
	//*   4    7:aload_0         
	//*   5    8:getfield        #38  <Field ConcurrentHashMap zzen>
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #58  <Method boolean ConcurrentHashMap.containsKey(Object)>
	//*   8   15:ifeq            30
			return (String)zzen.get(((Object) (s)));
	//    9   18:aload_0         
	//   10   19:getfield        #38  <Field ConcurrentHashMap zzen>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #62  <Method Object ConcurrentHashMap.get(Object)>
	//   13   26:checkcast       #64  <Class String>
	//   14   29:areturn         
		obj1 = ((Object) (new Properties()));
	//   15   30:new             #66  <Class Properties>
	//   16   33:dup             
	//   17   34:invokespecial   #67  <Method void Properties()>
	//   18   37:astore_3        
		stringbuilder = null;
	//   19   38:aconst_null     
	//   20   39:astore          5
		gmslogger = null;
	//   21   41:aconst_null     
	//   22   42:astore          4
		obj = ((Object) (gmslogger));
	//   23   44:aload           4
	//   24   46:astore_2        
		Object obj3 = ((Object) (((Class) (com/google/android/gms/common/internal/LibraryVersion)).getResourceAsStream(String.format("/%s.properties", new Object[] {
			s
		}))));
	//   25   47:ldc1            #2   <Class LibraryVersion>
	//   26   49:ldc1            #69  <String "/%s.properties">
	//   27   51:iconst_1        
	//   28   52:anewarray       Object[]
	//   29   55:dup             
	//   30   56:iconst_0        
	//   31   57:aload_1         
	//   32   58:aastore         
	//   33   59:invokestatic    #73  <Method String String.format(String, Object[])>
	//   34   62:invokevirtual   #79  <Method java.io.InputStream Class.getResourceAsStream(String)>
	//   35   65:astore          6
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_175;
	//   36   67:aload           6
	//   37   69:ifnull          175
		obj = ((Object) (gmslogger));
	//   38   72:aload           4
	//   39   74:astore_2        
		((Properties) (obj1)).load(((java.io.InputStream) (obj3)));
	//   40   75:aload_3         
	//   41   76:aload           6
	//   42   78:invokevirtual   #83  <Method void Properties.load(java.io.InputStream)>
		obj = ((Object) (gmslogger));
	//   43   81:aload           4
	//   44   83:astore_2        
		obj1 = ((Object) (((Properties) (obj1)).getProperty("version", ((String) (null)))));
	//   45   84:aload_3         
	//   46   85:ldc1            #85  <String "version">
	//   47   87:aconst_null     
	//   48   88:invokevirtual   #89  <Method String Properties.getProperty(String, String)>
	//   49   91:astore_3        
		obj = obj1;
	//   50   92:aload_3         
	//   51   93:astore_2        
		gmslogger = zzel;
	//   52   94:getstatic       #26  <Field GmsLogger zzel>
	//   53   97:astore          4
		obj = obj1;
	//   54   99:aload_3         
	//   55  100:astore_2        
		stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 12 + String.valueOf(obj1).length());
	//   56  101:new             #91  <Class StringBuilder>
	//   57  104:dup             
	//   58  105:aload_1         
	//   59  106:invokestatic    #95  <Method String String.valueOf(Object)>
	//   60  109:invokevirtual   #99  <Method int String.length()>
	//   61  112:bipush          12
	//   62  114:iadd            
	//   63  115:aload_3         
	//   64  116:invokestatic    #95  <Method String String.valueOf(Object)>
	//   65  119:invokevirtual   #99  <Method int String.length()>
	//   66  122:iadd            
	//   67  123:invokespecial   #102 <Method void StringBuilder(int)>
	//   68  126:astore          5
		obj = obj1;
	//   69  128:aload_3         
	//   70  129:astore_2        
		stringbuilder.append(s);
	//   71  130:aload           5
	//   72  132:aload_1         
	//   73  133:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   74  136:pop             
		obj = obj1;
	//   75  137:aload_3         
	//   76  138:astore_2        
		stringbuilder.append(" version is ");
	//   77  139:aload           5
	//   78  141:ldc1            #108 <String " version is ">
	//   79  143:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   80  146:pop             
		obj = obj1;
	//   81  147:aload_3         
	//   82  148:astore_2        
		stringbuilder.append(((String) (obj1)));
	//   83  149:aload           5
	//   84  151:aload_3         
	//   85  152:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   86  155:pop             
		obj = obj1;
	//   87  156:aload_3         
	//   88  157:astore_2        
		gmslogger.v("LibraryVersion", stringbuilder.toString());
	//   89  158:aload           4
	//   90  160:ldc1            #18  <String "LibraryVersion">
	//   91  162:aload           5
	//   92  164:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   93  167:invokevirtual   #115 <Method void GmsLogger.v(String, String)>
		obj = obj1;
	//   94  170:aload_3         
	//   95  171:astore_2        
		break MISSING_BLOCK_LABEL_293;
	//   96  172:goto            293
		obj = ((Object) (gmslogger));
	//   97  175:aload           4
	//   98  177:astore_2        
		obj3 = ((Object) (zzel));
	//   99  178:getstatic       #26  <Field GmsLogger zzel>
	//  100  181:astore          6
		obj = ((Object) (gmslogger));
	//  101  183:aload           4
	//  102  185:astore_2        
		obj1 = ((Object) (String.valueOf(((Object) (s)))));
	//  103  186:aload_1         
	//  104  187:invokestatic    #95  <Method String String.valueOf(Object)>
	//  105  190:astore_3        
		obj = ((Object) (gmslogger));
	//  106  191:aload           4
	//  107  193:astore_2        
		if(((String) (obj1)).length() != 0)
	//* 108  194:aload_3         
	//* 109  195:invokevirtual   #99  <Method int String.length()>
	//* 110  198:ifeq            214
		{
			obj = ((Object) (gmslogger));
	//  111  201:aload           4
	//  112  203:astore_2        
			try
			{
				obj1 = ((Object) ("Failed to get app version for libraryName: ".concat(((String) (obj1)))));
	//  113  204:ldc1            #117 <String "Failed to get app version for libraryName: ">
	//  114  206:aload_3         
	//  115  207:invokevirtual   #120 <Method String String.concat(String)>
	//  116  210:astore_3        
				break MISSING_BLOCK_LABEL_227;
	//  117  211:goto            227
			}
	//* 118  214:aload           4
	//* 119  216:astore_2        
	//* 120  217:new             #64  <Class String>
	//* 121  220:dup             
	//* 122  221:ldc1            #117 <String "Failed to get app version for libraryName: ">
	//* 123  223:invokespecial   #123 <Method void String(String)>
	//* 124  226:astore_3        
	//* 125  227:aload           4
	//* 126  229:astore_2        
	//* 127  230:aload           6
	//* 128  232:ldc1            #18  <String "LibraryVersion">
	//* 129  234:aload_3         
	//* 130  235:invokevirtual   #126 <Method void GmsLogger.e(String, String)>
	//* 131  238:aload           5
	//* 132  240:astore_2        
	//* 133  241:goto            293
			catch(IOException ioexception)
	//* 134  244:astore          4
			{
				GmsLogger gmslogger1 = zzel;
	//  135  246:getstatic       #26  <Field GmsLogger zzel>
	//  136  249:astore          5
				String s1 = String.valueOf(((Object) (s)));
	//  137  251:aload_1         
	//  138  252:invokestatic    #95  <Method String String.valueOf(Object)>
	//  139  255:astore_3        
				if(s1.length() != 0)
	//* 140  256:aload_3         
	//* 141  257:invokevirtual   #99  <Method int String.length()>
	//* 142  260:ifeq            273
					s1 = "Failed to get app version for libraryName: ".concat(s1);
	//  143  263:ldc1            #117 <String "Failed to get app version for libraryName: ">
	//  144  265:aload_3         
	//  145  266:invokevirtual   #120 <Method String String.concat(String)>
	//  146  269:astore_3        
				else
	//* 147  270:goto            283
					s1 = new String("Failed to get app version for libraryName: ");
	//  148  273:new             #64  <Class String>
	//  149  276:dup             
	//  150  277:ldc1            #117 <String "Failed to get app version for libraryName: ">
	//  151  279:invokespecial   #123 <Method void String(String)>
	//  152  282:astore_3        
				gmslogger1.e("LibraryVersion", s1, ((Throwable) (ioexception)));
	//  153  283:aload           5
	//  154  285:ldc1            #18  <String "LibraryVersion">
	//  155  287:aload_3         
	//  156  288:aload           4
	//  157  290:invokevirtual   #129 <Method void GmsLogger.e(String, String, Throwable)>
			}
			break MISSING_BLOCK_LABEL_293;
		}
		obj = ((Object) (gmslogger));
		obj1 = ((Object) (new String("Failed to get app version for libraryName: ")));
		obj = ((Object) (gmslogger));
		((GmsLogger) (obj3)).e("LibraryVersion", ((String) (obj1)));
		obj = ((Object) (stringbuilder));
		break MISSING_BLOCK_LABEL_293;
		Object obj2 = obj;
	//  158  293:aload_2         
	//  159  294:astore_3        
		if(obj == null)
	//* 160  295:aload_2         
	//* 161  296:ifnonnull       312
		{
			obj2 = "UNKNOWN";
	//  162  299:ldc1            #131 <String "UNKNOWN">
	//  163  301:astore_3        
			zzel.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
	//  164  302:getstatic       #26  <Field GmsLogger zzel>
	//  165  305:ldc1            #18  <String "LibraryVersion">
	//  166  307:ldc1            #133 <String ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used">
	//  167  309:invokevirtual   #136 <Method void GmsLogger.d(String, String)>
		}
		zzen.put(((Object) (s)), obj2);
	//  168  312:aload_0         
	//  169  313:getfield        #38  <Field ConcurrentHashMap zzen>
	//  170  316:aload_1         
	//  171  317:aload_3         
	//  172  318:invokevirtual   #140 <Method Object ConcurrentHashMap.put(Object, Object)>
	//  173  321:pop             
		return ((String) (obj2));
	//  174  322:aload_3         
	//  175  323:areturn         
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
