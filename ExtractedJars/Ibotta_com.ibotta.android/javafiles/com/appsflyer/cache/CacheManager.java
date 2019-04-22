// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer.cache;

import android.content.Context;
import android.util.Log;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.appsflyer.cache:
//			RequestCacheData

public class CacheManager
{

	private CacheManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static CacheManager getInstance()
	{
		return _fld02CA;
	//    0    0:getstatic       #13  <Field CacheManager _fld02CA>
	//    1    3:areturn         
	}

	private static RequestCacheData _mth02CF(File file)
	{
		FileReader filereader;
		char ac[];
		RequestCacheData requestcachedata;
		try
		{
			filereader = new FileReader(file);
	//    0    0:new             #25  <Class FileReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #28  <Method void FileReader(File)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #34  <Method long File.length()>
	//*   7   13:l2i             
	//*   8   14:newarray        char[]
	//*   9   16:astore_2        
	//*  10   17:aload_1         
	//*  11   18:aload_2         
	//*  12   19:invokevirtual   #40  <Method int Reader.read(char[])>
	//*  13   22:pop             
	//*  14   23:new             #42  <Class RequestCacheData>
	//*  15   26:dup             
	//*  16   27:aload_2         
	//*  17   28:invokespecial   #45  <Method void RequestCacheData(char[])>
	//*  18   31:astore_2        
	//*  19   32:aload_2         
	//*  20   33:aload_0         
	//*  21   34:invokevirtual   #49  <Method String File.getName()>
	//*  22   37:invokevirtual   #53  <Method void RequestCacheData.setCacheKey(String)>
	//*  23   40:aload_1         
	//*  24   41:invokevirtual   #56  <Method void Reader.close()>
	//*  25   44:aload_2         
	//*  26   45:areturn         
	//*  27   46:astore_0        
	//*  28   47:goto            53
	//*  29   50:astore_0        
	//*  30   51:aconst_null     
	//*  31   52:astore_1        
	//*  32   53:aload_1         
	//*  33   54:ifnull          61
	//*  34   57:aload_1         
	//*  35   58:invokevirtual   #56  <Method void Reader.close()>
	//*  36   61:aload_0         
	//*  37   62:athrow          
	//*  38   63:aconst_null     
	//*  39   64:astore_1        
	//*  40   65:aload_1         
	//*  41   66:ifnull          73
	//*  42   69:aload_1         
	//*  43   70:invokevirtual   #56  <Method void Reader.close()>
	//*  44   73:aconst_null     
	//*  45   74:areturn         
		// Misplaced declaration of an exception variable
		catch(File file)
	//*  46   75:astore_0        
		{
			break MISSING_BLOCK_LABEL_63;
	//   47   76:goto            63
		}
		ac = new char[(int)file.length()];
		((Reader) (filereader)).read(ac);
		requestcachedata = new RequestCacheData(ac);
		requestcachedata.setCacheKey(file.getName());
		try
		{
			((Reader) (filereader)).close();
		}
	//*  48   79:astore_0        
	//*  49   80:goto            65
		// Misplaced declaration of an exception variable
		catch(File file)
	//*  50   83:astore_0        
		{
			return requestcachedata;
	//   51   84:aload_2         
	//   52   85:areturn         
		}
		return requestcachedata;
		file;
		break MISSING_BLOCK_LABEL_53;
		file;
		filereader = null;
		if(filereader != null)
			try
			{
				((Reader) (filereader)).close();
			}
			catch(IOException ioexception) { }
	//   53   86:astore_1        
		throw file;
		filereader = null;
_L1:
		if(filereader != null)
			try
			{
				((Reader) (filereader)).close();
			}
	//*  54   87:goto            61
			// Misplaced declaration of an exception variable
			catch(File file)
	//*  55   90:astore_0        
			{
				return null;
	//   56   91:aconst_null     
	//   57   92:areturn         
			}
		return null;
		file;
		  goto _L1
	}

	public void cacheRequest(RequestCacheData requestcachedata, Context context)
	{
		Object obj;
		Object obj1;
		Object obj2;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		obj2 = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		obj = ((Object) (obj2));
	//    4    6:aload           5
	//    5    8:astore_3        
		File file = new File(context.getFilesDir(), "AFRequestCache");
	//    6    9:new             #30  <Class File>
	//    7   12:dup             
	//    8   13:aload_2         
	//    9   14:invokevirtual   #64  <Method File Context.getFilesDir()>
	//   10   17:ldc1            #66  <String "AFRequestCache">
	//   11   19:invokespecial   #69  <Method void File(File, String)>
	//   12   22:astore          6
		obj = ((Object) (obj2));
	//   13   24:aload           5
	//   14   26:astore_3        
		if(file.exists()) goto _L2; else goto _L1
	//   15   27:aload           6
	//   16   29:invokevirtual   #73  <Method boolean File.exists()>
	//   17   32:ifne            45
_L1:
		obj = ((Object) (obj2));
	//   18   35:aload           5
	//   19   37:astore_3        
		File afile[];
		try
		{
			file.mkdir();
	//   20   38:aload           6
	//   21   40:invokevirtual   #76  <Method boolean File.mkdir()>
	//   22   43:pop             
			return;
	//   23   44:return          
		}
	//*  24   45:aload           5
	//*  25   47:astore_3        
	//*  26   48:aload           6
	//*  27   50:invokevirtual   #80  <Method File[] File.listFiles()>
	//*  28   53:astore          6
	//*  29   55:aload           6
	//*  30   57:ifnull          83
	//*  31   60:aload           5
	//*  32   62:astore_3        
	//*  33   63:aload           6
	//*  34   65:arraylength     
	//*  35   66:bipush          40
	//*  36   68:icmple          83
	//*  37   71:aload           5
	//*  38   73:astore_3        
	//*  39   74:ldc1            #82  <String "AppsFlyer_4.8.9">
	//*  40   76:ldc1            #84  <String "reached cache limit, not caching request">
	//*  41   78:invokestatic    #90  <Method int Log.i(String, String)>
	//*  42   81:pop             
	//*  43   82:return          
	//*  44   83:aload           5
	//*  45   85:astore_3        
	//*  46   86:ldc1            #82  <String "AppsFlyer_4.8.9">
	//*  47   88:ldc1            #92  <String "caching request...">
	//*  48   90:invokestatic    #90  <Method int Log.i(String, String)>
	//*  49   93:pop             
	//*  50   94:aload           5
	//*  51   96:astore_3        
	//*  52   97:new             #30  <Class File>
	//*  53  100:dup             
	//*  54  101:new             #30  <Class File>
	//*  55  104:dup             
	//*  56  105:aload_2         
	//*  57  106:invokevirtual   #64  <Method File Context.getFilesDir()>
	//*  58  109:ldc1            #66  <String "AFRequestCache">
	//*  59  111:invokespecial   #69  <Method void File(File, String)>
	//*  60  114:invokestatic    #97  <Method long System.currentTimeMillis()>
	//*  61  117:invokestatic    #103 <Method String Long.toString(long)>
	//*  62  120:invokespecial   #69  <Method void File(File, String)>
	//*  63  123:astore_2        
	//*  64  124:aload           5
	//*  65  126:astore_3        
	//*  66  127:aload_2         
	//*  67  128:invokevirtual   #106 <Method boolean File.createNewFile()>
	//*  68  131:pop             
	//*  69  132:aload           5
	//*  70  134:astore_3        
	//*  71  135:new             #108 <Class OutputStreamWriter>
	//*  72  138:dup             
	//*  73  139:new             #110 <Class FileOutputStream>
	//*  74  142:dup             
	//*  75  143:aload_2         
	//*  76  144:invokevirtual   #113 <Method String File.getPath()>
	//*  77  147:iconst_1        
	//*  78  148:invokespecial   #116 <Method void FileOutputStream(String, boolean)>
	//*  79  151:invokespecial   #119 <Method void OutputStreamWriter(java.io.OutputStream)>
	//*  80  154:astore_2        
	//*  81  155:aload_2         
	//*  82  156:ldc1            #121 <String "version=">
	//*  83  158:invokevirtual   #126 <Method void Writer.write(String)>
	//*  84  161:aload_2         
	//*  85  162:aload_1         
	//*  86  163:invokevirtual   #129 <Method String RequestCacheData.getVersion()>
	//*  87  166:invokevirtual   #126 <Method void Writer.write(String)>
	//*  88  169:aload_2         
	//*  89  170:bipush          10
	//*  90  172:invokevirtual   #132 <Method void Writer.write(int)>
	//*  91  175:aload_2         
	//*  92  176:ldc1            #134 <String "url=">
	//*  93  178:invokevirtual   #126 <Method void Writer.write(String)>
	//*  94  181:aload_2         
	//*  95  182:aload_1         
	//*  96  183:invokevirtual   #137 <Method String RequestCacheData.getRequestURL()>
	//*  97  186:invokevirtual   #126 <Method void Writer.write(String)>
	//*  98  189:aload_2         
	//*  99  190:bipush          10
	//* 100  192:invokevirtual   #132 <Method void Writer.write(int)>
	//* 101  195:aload_2         
	//* 102  196:ldc1            #139 <String "data=">
	//* 103  198:invokevirtual   #126 <Method void Writer.write(String)>
	//* 104  201:aload_2         
	//* 105  202:aload_1         
	//* 106  203:invokevirtual   #142 <Method String RequestCacheData.getPostData()>
	//* 107  206:invokevirtual   #126 <Method void Writer.write(String)>
	//* 108  209:aload_2         
	//* 109  210:bipush          10
	//* 110  212:invokevirtual   #132 <Method void Writer.write(int)>
	//* 111  215:aload_2         
	//* 112  216:invokevirtual   #145 <Method void Writer.flush()>
	//* 113  219:aload_2         
	//* 114  220:invokevirtual   #146 <Method void Writer.close()>
	//* 115  223:return          
	//* 116  224:astore_1        
	//* 117  225:aload_2         
	//* 118  226:astore_3        
	//* 119  227:goto            259
	//* 120  230:aload_2         
	//* 121  231:astore_1        
	//* 122  232:goto            239
	//* 123  235:astore_1        
	//* 124  236:goto            259
	//* 125  239:aload_1         
	//* 126  240:astore_3        
	//* 127  241:ldc1            #82  <String "AppsFlyer_4.8.9">
	//* 128  243:ldc1            #148 <String "Could not cache request">
	//* 129  245:invokestatic    #90  <Method int Log.i(String, String)>
	//* 130  248:pop             
	//* 131  249:aload_1         
	//* 132  250:ifnull          258
	//* 133  253:aload_1         
	//* 134  254:invokevirtual   #146 <Method void Writer.close()>
	//* 135  257:return          
	//* 136  258:return          
	//* 137  259:aload_3         
	//* 138  260:ifnull          267
	//* 139  263:aload_3         
	//* 140  264:invokevirtual   #146 <Method void Writer.close()>
	//* 141  267:aload_1         
	//* 142  268:athrow          
		// Misplaced declaration of an exception variable
		catch(RequestCacheData requestcachedata)
	//* 143  269:astore_1        
		{
			requestcachedata = ((RequestCacheData) (obj1));
	//  144  270:aload           4
	//  145  272:astore_1        
		}
		  goto _L3
_L2:
		obj = ((Object) (obj2));
		afile = file.listFiles();
		if(afile == null)
			break MISSING_BLOCK_LABEL_83;
		obj = ((Object) (obj2));
		if(afile.length <= 40)
			break MISSING_BLOCK_LABEL_83;
		obj = ((Object) (obj2));
		Log.i("AppsFlyer_4.8.9", "reached cache limit, not caching request");
		return;
		obj = ((Object) (obj2));
		Log.i("AppsFlyer_4.8.9", "caching request...");
		obj = ((Object) (obj2));
		context = ((Context) (new File(new File(context.getFilesDir(), "AFRequestCache"), Long.toString(System.currentTimeMillis()))));
		obj = ((Object) (obj2));
		((File) (context)).createNewFile();
		obj = ((Object) (obj2));
		context = ((Context) (new OutputStreamWriter(((java.io.OutputStream) (new FileOutputStream(((File) (context)).getPath(), true))))));
		((Writer) (context)).write("version=");
		((Writer) (context)).write(requestcachedata.getVersion());
		((Writer) (context)).write(10);
		((Writer) (context)).write("url=");
		((Writer) (context)).write(requestcachedata.getRequestURL());
		((Writer) (context)).write(10);
		((Writer) (context)).write("data=");
		((Writer) (context)).write(requestcachedata.getPostData());
		((Writer) (context)).write(10);
		((Writer) (context)).flush();
		try
		{
			((Writer) (context)).close();
			return;
		}
	//* 146  273:goto            239
	//* 147  276:astore_1        
	//* 148  277:goto            230
		// Misplaced declaration of an exception variable
		catch(RequestCacheData requestcachedata)
	//* 149  280:astore_1        
		{
			return;
	//  150  281:return          
		}
		requestcachedata;
		obj = ((Object) (context));
		  goto _L4
_L6:
		requestcachedata = ((RequestCacheData) (context));
		  goto _L3
		requestcachedata;
		  goto _L4
_L3:
		obj = ((Object) (requestcachedata));
		Log.i("AppsFlyer_4.8.9", "Could not cache request");
		if(requestcachedata != null)
			try
			{
				((Writer) (requestcachedata)).close();
				return;
			}
			// Misplaced declaration of an exception variable
			catch(RequestCacheData requestcachedata)
	//* 151  282:astore_1        
			{
				return;
	//  152  283:return          
			}
		else
			return;
_L4:
		if(obj != null)
			try
			{
				((Writer) (obj)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Context context) { }
	//  153  284:astore_2        
		throw requestcachedata;
		requestcachedata;
		if(true) goto _L6; else goto _L5
_L5:
	//* 154  285:goto            267
	}

	public void deleteRequest(String s, Context context)
	{
		context = ((Context) (new File(new File(context.getFilesDir(), "AFRequestCache"), s)));
	//    0    0:new             #30  <Class File>
	//    1    3:dup             
	//    2    4:new             #30  <Class File>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:invokevirtual   #64  <Method File Context.getFilesDir()>
	//    6   12:ldc1            #66  <String "AFRequestCache">
	//    7   14:invokespecial   #69  <Method void File(File, String)>
	//    8   17:aload_1         
	//    9   18:invokespecial   #69  <Method void File(File, String)>
	//   10   21:astore_2        
		StringBuilder stringbuilder = new StringBuilder("Deleting ");
	//   11   22:new             #152 <Class StringBuilder>
	//   12   25:dup             
	//   13   26:ldc1            #154 <String "Deleting ">
	//   14   28:invokespecial   #156 <Method void StringBuilder(String)>
	//   15   31:astore_3        
		stringbuilder.append(s);
	//   16   32:aload_3         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		stringbuilder.append(" from cache");
	//   20   38:aload_3         
	//   21   39:ldc1            #162 <String " from cache">
	//   22   41:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
		Log.i("AppsFlyer_4.8.9", ((Object) (stringbuilder)).toString());
	//   24   45:ldc1            #82  <String "AppsFlyer_4.8.9">
	//   25   47:aload_3         
	//   26   48:invokevirtual   #164 <Method String Object.toString()>
	//   27   51:invokestatic    #90  <Method int Log.i(String, String)>
	//   28   54:pop             
		if(((File) (context)).exists())
	//*  29   55:aload_2         
	//*  30   56:invokevirtual   #73  <Method boolean File.exists()>
	//*  31   59:ifeq            103
		{
			StringBuilder stringbuilder1;
			try
			{
				((File) (context)).delete();
	//   32   62:aload_2         
	//   33   63:invokevirtual   #167 <Method boolean File.delete()>
	//   34   66:pop             
				return;
	//   35   67:return          
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  36   68:astore_2        
			{
				stringbuilder1 = new StringBuilder("Could not delete ");
	//   37   69:new             #152 <Class StringBuilder>
	//   38   72:dup             
	//   39   73:ldc1            #169 <String "Could not delete ">
	//   40   75:invokespecial   #156 <Method void StringBuilder(String)>
	//   41   78:astore_3        
			}
			stringbuilder1.append(s);
	//   42   79:aload_3         
	//   43   80:aload_1         
	//   44   81:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   45   84:pop             
			stringbuilder1.append(" from cache");
	//   46   85:aload_3         
	//   47   86:ldc1            #162 <String " from cache">
	//   48   88:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   49   91:pop             
			Log.i("AppsFlyer_4.8.9", ((Object) (stringbuilder1)).toString(), ((Throwable) (context)));
	//   50   92:ldc1            #82  <String "AppsFlyer_4.8.9">
	//   51   94:aload_3         
	//   52   95:invokevirtual   #164 <Method String Object.toString()>
	//   53   98:aload_2         
	//   54   99:invokestatic    #172 <Method int Log.i(String, String, Throwable)>
	//   55  102:pop             
		}
	//   56  103:return          
	}

	public List getCachedRequests(Context context)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #176 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #177 <Method void ArrayList()>
	//    3    7:astore          4
		context = ((Context) (new File(context.getFilesDir(), "AFRequestCache")));
	//    4    9:new             #30  <Class File>
	//    5   12:dup             
	//    6   13:aload_1         
	//    7   14:invokevirtual   #64  <Method File Context.getFilesDir()>
	//    8   17:ldc1            #66  <String "AFRequestCache">
	//    9   19:invokespecial   #69  <Method void File(File, String)>
	//   10   22:astore_1        
		if(((File) (context)).exists())
			break MISSING_BLOCK_LABEL_38;
	//   11   23:aload_1         
	//   12   24:invokevirtual   #73  <Method boolean File.exists()>
	//   13   27:ifne            38
		((File) (context)).mkdir();
	//   14   30:aload_1         
	//   15   31:invokevirtual   #76  <Method boolean File.mkdir()>
	//   16   34:pop             
		return ((List) (arraylist));
	//   17   35:aload           4
	//   18   37:areturn         
		int j;
		context = ((Context) (((File) (context)).listFiles()));
	//   19   38:aload_1         
	//   20   39:invokevirtual   #80  <Method File[] File.listFiles()>
	//   21   42:astore_1        
		j = context.length;
	//   22   43:aload_1         
	//   23   44:arraylength     
	//   24   45:istore_3        
		int i = 0;
	//   25   46:iconst_0        
	//   26   47:istore_2        
_L2:
		File file;
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   27   48:iload_2         
	//   28   49:iload_3         
	//   29   50:icmpge          119
		file = ((File) (context[i]));
	//   30   53:aload_1         
	//   31   54:iload_2         
	//   32   55:aaload          
	//   33   56:astore          5
		StringBuilder stringbuilder = new StringBuilder("Found cached request");
	//   34   58:new             #152 <Class StringBuilder>
	//   35   61:dup             
	//   36   62:ldc1            #179 <String "Found cached request">
	//   37   64:invokespecial   #156 <Method void StringBuilder(String)>
	//   38   67:astore          6
		stringbuilder.append(file.getName());
	//   39   69:aload           6
	//   40   71:aload           5
	//   41   73:invokevirtual   #49  <Method String File.getName()>
	//   42   76:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   43   79:pop             
		Log.i("AppsFlyer_4.8.9", ((Object) (stringbuilder)).toString());
	//   44   80:ldc1            #82  <String "AppsFlyer_4.8.9">
	//   45   82:aload           6
	//   46   84:invokevirtual   #164 <Method String Object.toString()>
	//   47   87:invokestatic    #90  <Method int Log.i(String, String)>
	//   48   90:pop             
		((List) (arraylist)).add(((Object) (_mth02CF(file))));
	//   49   91:aload           4
	//   50   93:aload           5
	//   51   95:invokestatic    #181 <Method RequestCacheData _mth02CF(File)>
	//   52   98:invokeinterface #187 <Method boolean List.add(Object)>
	//   53  103:pop             
		i++;
	//   54  104:iload_2         
	//   55  105:iconst_1        
	//   56  106:iadd            
	//   57  107:istore_2        
		if(true) goto _L2; else goto _L1
	//   58  108:goto            48
_L4:
		Log.i("AppsFlyer_4.8.9", "Could not cache request");
	//   59  111:ldc1            #82  <String "AppsFlyer_4.8.9">
	//   60  113:ldc1            #148 <String "Could not cache request">
	//   61  115:invokestatic    #90  <Method int Log.i(String, String)>
	//   62  118:pop             
_L1:
		return ((List) (arraylist));
	//   63  119:aload           4
	//   64  121:areturn         
		context;
	//   65  122:astore_1        
		if(true) goto _L4; else goto _L3
_L3:
	//*  66  123:goto            111
	}

	public void init(Context context)
	{
		try
		{
			if(!(new File(context.getFilesDir(), "AFRequestCache")).exists())
	//*   0    0:new             #30  <Class File>
	//*   1    3:dup             
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #64  <Method File Context.getFilesDir()>
	//*   4    8:ldc1            #66  <String "AFRequestCache">
	//*   5   10:invokespecial   #69  <Method void File(File, String)>
	//*   6   13:invokevirtual   #73  <Method boolean File.exists()>
	//*   7   16:ifne            36
				(new File(context.getFilesDir(), "AFRequestCache")).mkdir();
	//    8   19:new             #30  <Class File>
	//    9   22:dup             
	//   10   23:aload_1         
	//   11   24:invokevirtual   #64  <Method File Context.getFilesDir()>
	//   12   27:ldc1            #66  <String "AFRequestCache">
	//   13   29:invokespecial   #69  <Method void File(File, String)>
	//   14   32:invokevirtual   #76  <Method boolean File.mkdir()>
	//   15   35:pop             
			return;
	//   16   36:return          
		}
	//*  17   37:ldc1            #82  <String "AppsFlyer_4.8.9">
	//*  18   39:ldc1            #193 <String "Could not create cache directory">
	//*  19   41:invokestatic    #90  <Method int Log.i(String, String)>
	//*  20   44:pop             
	//*  21   45:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			Log.i("AppsFlyer_4.8.9", "Could not create cache directory");
		}
	//*  22   46:astore_1        
	//*  23   47:goto            37
	}

	private static CacheManager _fld02CA = new CacheManager();

	static 
	{
	//    0    0:new             #2   <Class CacheManager>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void CacheManager()>
	//    3    7:putstatic       #13  <Field CacheManager _fld02CA>
	//*   4   10:return          
	}
}
