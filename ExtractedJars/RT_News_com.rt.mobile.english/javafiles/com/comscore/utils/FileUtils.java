// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;

import android.content.Context;
import com.comscore.analytics.Core;
import java.io.*;
import java.util.*;

// Referenced classes of package com.comscore.utils:
//			CSLog, Storage, b, Utils

public class FileUtils
{

	public FileUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean deleteFile(Core core, String s)
	{
		Context context = core.getAppContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method Context Core.getAppContext()>
	//    2    4:astore_3        
		core = ((Core) (core.getStorage()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #21  <Method Storage Core.getStorage()>
	//    5    9:astore_0        
		boolean flag = context.deleteFile(s);
	//    6   10:aload_3         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #26  <Method boolean Context.deleteFile(String)>
	//    9   15:istore_2        
		if(flag)
	//*  10   16:iload_2         
	//*  11   17:ifeq            62
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   20:new             #28  <Class StringBuilder>
	//   13   23:dup             
	//   14   24:invokespecial   #29  <Method void StringBuilder()>
	//   15   27:astore_3        
			stringbuilder.append("File");
	//   16   28:aload_3         
	//   17   29:ldc1            #31  <String "File">
	//   18   31:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
			stringbuilder.append(s);
	//   20   35:aload_3         
	//   21   36:aload_1         
	//   22   37:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
			stringbuilder.append(" was removed");
	//   24   41:aload_3         
	//   25   42:ldc1            #37  <String " was removed">
	//   26   44:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   27   47:pop             
			CSLog.d(com/comscore/utils/FileUtils, stringbuilder.toString());
	//   28   48:ldc1            #2   <Class FileUtils>
	//   29   50:aload_3         
	//   30   51:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   31   54:invokestatic    #47  <Method void CSLog.d(Class, String)>
			((Storage) (core)).remove(s);
	//   32   57:aload_0         
	//   33   58:aload_1         
	//   34   59:invokevirtual   #53  <Method void Storage.remove(String)>
		}
		return flag;
	//   35   62:iload_2         
	//   36   63:ireturn         
	}

	public static ArrayList getFileList(Context context)
	{
		context = ((Context) (context.getFilesDir()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method File Context.getFilesDir()>
	//    2    4:astore_0        
		if(context != null && ((File) (context)).isDirectory())
	//*   3    5:aload_0         
	//*   4    6:ifnull          47
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #65  <Method boolean File.isDirectory()>
	//*   7   13:ifeq            47
		{
			context = ((Context) (((File) (context)).list(((java.io.FilenameFilter) (new b())))));
	//    8   16:aload_0         
	//    9   17:new             #67  <Class b>
	//   10   20:dup             
	//   11   21:invokespecial   #68  <Method void b()>
	//   12   24:invokevirtual   #72  <Method String[] File.list(java.io.FilenameFilter)>
	//   13   27:astore_0        
			if(context != null)
	//*  14   28:aload_0         
	//*  15   29:ifnull          39
				Arrays.sort(((Object []) (context)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #78  <Method void Arrays.sort(Object[])>
			else
	//*  18   36:goto            49
				context = ((Context) (new String[0]));
	//   19   39:iconst_0        
	//   20   40:anewarray       String[]
	//   21   43:astore_0        
		} else
	//*  22   44:goto            49
		{
			context = null;
	//   23   47:aconst_null     
	//   24   48:astore_0        
		}
		return new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (context))))));
	//   25   49:new             #82  <Class ArrayList>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:invokestatic    #86  <Method java.util.List Arrays.asList(Object[])>
	//   29   57:invokespecial   #89  <Method void ArrayList(java.util.Collection)>
	//   30   60:areturn         
	}

	public static String[] readCachedEvents(Context context, String s)
	{
		Context context1;
		Object obj;
		LinkedList linkedlist;
		linkedlist = new LinkedList();
	//    0    0:new             #99  <Class LinkedList>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void LinkedList()>
	//    3    7:astore          4
		obj = null;
	//    4    9:aconst_null     
	//    5   10:astore_3        
		context1 = null;
	//    6   11:aconst_null     
	//    7   12:astore_2        
		context = ((Context) (new BufferedReader(((java.io.Reader) (new InputStreamReader(((java.io.InputStream) (context.openFileInput(s)))))))));
	//    8   13:new             #102 <Class BufferedReader>
	//    9   16:dup             
	//   10   17:new             #104 <Class InputStreamReader>
	//   11   20:dup             
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:invokevirtual   #108 <Method java.io.FileInputStream Context.openFileInput(String)>
	//   15   26:invokespecial   #111 <Method void InputStreamReader(java.io.InputStream)>
	//   16   29:invokespecial   #114 <Method void BufferedReader(java.io.Reader)>
	//   17   32:astore_0        
_L2:
		try
		{
			s = ((BufferedReader) (context)).readLine();
	//   18   33:aload_0         
	//   19   34:invokevirtual   #117 <Method String BufferedReader.readLine()>
	//   20   37:astore_1        
		}
	//*  21   38:aload_1         
	//*  22   39:ifnull          52
	//*  23   42:aload           4
	//*  24   44:aload_1         
	//*  25   45:invokevirtual   #121 <Method boolean LinkedList.add(Object)>
	//*  26   48:pop             
	//*  27   49:goto            33
	//*  28   52:aload_0         
	//*  29   53:ifnull          104
	//*  30   56:aload_0         
	//*  31   57:invokevirtual   #124 <Method void BufferedReader.close()>
	//*  32   60:goto            104
	//*  33   63:astore_1        
	//*  34   64:aload_0         
	//*  35   65:astore_2        
	//*  36   66:aload_1         
	//*  37   67:astore_0        
	//*  38   68:goto            122
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  39   71:astore_1        
		{
			break MISSING_BLOCK_LABEL_82;
	//   40   72:goto            82
		}
		if(s == null)
			break; /* Loop/switch isn't completed */
		linkedlist.add(((Object) (s)));
		if(true) goto _L2; else goto _L1
_L1:
		if(context != null)
			try
			{
				((BufferedReader) (context)).close();
			}
	//*  41   75:astore_0        
	//*  42   76:goto            122
	//*  43   79:astore_1        
	//*  44   80:aload_3         
	//*  45   81:astore_0        
	//*  46   82:aload_0         
	//*  47   83:astore_2        
	//*  48   84:aload_1         
	//*  49   85:invokestatic    #128 <Method void CSLog.printStackTrace(Exception)>
	//*  50   88:aload_0         
	//*  51   89:ifnull          104
	//*  52   92:aload_0         
	//*  53   93:invokevirtual   #124 <Method void BufferedReader.close()>
	//*  54   96:goto            104
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  55   99:astore_0        
			{
				CSLog.printStackTrace(((Exception) (context)));
	//   56  100:aload_0         
	//   57  101:invokestatic    #128 <Method void CSLog.printStackTrace(Exception)>
			}
		break MISSING_BLOCK_LABEL_104;
		s;
		context1 = context;
		context = ((Context) (s));
		break MISSING_BLOCK_LABEL_122;
		context;
		break MISSING_BLOCK_LABEL_122;
		s;
		context = ((Context) (obj));
		context1 = context;
		CSLog.printStackTrace(((Exception) (s)));
		if(context == null)
			break MISSING_BLOCK_LABEL_104;
		((BufferedReader) (context)).close();
		context = ((Context) (new String[linkedlist.size()]));
	//   58  104:aload           4
	//   59  106:invokevirtual   #132 <Method int LinkedList.size()>
	//   60  109:anewarray       String[]
	//   61  112:astore_0        
		linkedlist.toArray(((Object []) (context)));
	//   62  113:aload           4
	//   63  115:aload_0         
	//   64  116:invokevirtual   #136 <Method Object[] LinkedList.toArray(Object[])>
	//   65  119:pop             
		return ((String []) (context));
	//   66  120:aload_0         
	//   67  121:areturn         
		if(context1 != null)
	//*  68  122:aload_2         
	//*  69  123:ifnull          138
			try
			{
				((BufferedReader) (context1)).close();
	//   70  126:aload_2         
	//   71  127:invokevirtual   #124 <Method void BufferedReader.close()>
			}
	//*  72  130:goto            138
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  73  133:astore_1        
			{
				CSLog.printStackTrace(((Exception) (s)));
	//   74  134:aload_1         
	//   75  135:invokestatic    #128 <Method void CSLog.printStackTrace(Exception)>
			}
		throw context;
	//   76  138:aload_0         
	//   77  139:athrow          
	}

	public static void writeEvent(Core core, String s, int i, String s1)
	{
		int j;
		Object obj;
		Object obj1;
		Storage storage;
		obj = ((Object) (core.getAppContext()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method Context Core.getAppContext()>
	//    2    4:astore          5
		storage = core.getStorage();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #21  <Method Storage Core.getStorage()>
	//    5   10:astore          7
		j = Utils.getInteger(storage.get(s), 0);
	//    6   12:aload           7
	//    7   14:aload_1         
	//    8   15:invokevirtual   #142 <Method String Storage.get(String)>
	//    9   18:iconst_0        
	//   10   19:invokestatic    #148 <Method int Utils.getInteger(String, int)>
	//   11   22:istore          4
		obj1 = null;
	//   12   24:aconst_null     
	//   13   25:astore          6
		core = null;
	//   14   27:aconst_null     
	//   15   28:astore_0        
		obj = ((Object) (((Context) (obj)).openFileOutput(s, i)));
	//   16   29:aload           5
	//   17   31:aload_1         
	//   18   32:iload_2         
	//   19   33:invokevirtual   #152 <Method FileOutputStream Context.openFileOutput(String, int)>
	//   20   36:astore          5
		try
		{
			((FileOutputStream) (obj)).write(s1.getBytes());
	//   21   38:aload           5
	//   22   40:aload_3         
	//   23   41:invokevirtual   #156 <Method byte[] String.getBytes()>
	//   24   44:invokevirtual   #162 <Method void FileOutputStream.write(byte[])>
			storage.set(s, String.valueOf(j + 1));
	//   25   47:aload           7
	//   26   49:aload_1         
	//   27   50:iload           4
	//   28   52:iconst_1        
	//   29   53:iadd            
	//   30   54:invokestatic    #166 <Method String String.valueOf(int)>
	//   31   57:invokevirtual   #170 <Method void Storage.set(String, String)>
		}
	//*  32   60:aload           5
	//*  33   62:ifnull          158
	//*  34   65:aload           5
	//*  35   67:invokevirtual   #171 <Method void FileOutputStream.close()>
	//*  36   70:return          
	//*  37   71:astore_0        
	//*  38   72:aload_0         
	//*  39   73:invokestatic    #128 <Method void CSLog.printStackTrace(Exception)>
	//*  40   76:return          
	//*  41   77:astore_1        
	//*  42   78:aload           5
	//*  43   80:astore_0        
	//*  44   81:goto            159
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*  45   84:astore_3        
		{
			s = ((String) (obj));
	//   46   85:aload           5
	//   47   87:astore_1        
			break MISSING_BLOCK_LABEL_99;
	//   48   88:goto            99
		}
		if(obj != null)
		{
			try
			{
				((FileOutputStream) (obj)).close();
				return;
			}
			// Misplaced declaration of an exception variable
			catch(Core core)
			{
				CSLog.printStackTrace(((Exception) (core)));
			}
			return;
		}
		break MISSING_BLOCK_LABEL_158;
		s;
		core = ((Core) (obj));
		break MISSING_BLOCK_LABEL_159;
		s;
	//   49   91:astore_1        
		break MISSING_BLOCK_LABEL_159;
	//   50   92:goto            159
		s1;
	//   51   95:astore_3        
		s = ((String) (obj1));
	//   52   96:aload           6
	//   53   98:astore_1        
		core = ((Core) (s));
	//   54   99:aload_1         
	//   55  100:astore_0        
		obj = ((Object) (new StringBuilder()));
	//   56  101:new             #28  <Class StringBuilder>
	//   57  104:dup             
	//   58  105:invokespecial   #29  <Method void StringBuilder()>
	//   59  108:astore          5
		core = ((Core) (s));
	//   60  110:aload_1         
	//   61  111:astore_0        
		((StringBuilder) (obj)).append("Exception in writeEvent:");
	//   62  112:aload           5
	//   63  114:ldc1            #173 <String "Exception in writeEvent:">
	//   64  116:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   65  119:pop             
		core = ((Core) (s));
	//   66  120:aload_1         
	//   67  121:astore_0        
		((StringBuilder) (obj)).append(((Exception) (s1)).getLocalizedMessage());
	//   68  122:aload           5
	//   69  124:aload_3         
	//   70  125:invokevirtual   #176 <Method String Exception.getLocalizedMessage()>
	//   71  128:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   72  131:pop             
		core = ((Core) (s));
	//   73  132:aload_1         
	//   74  133:astore_0        
		CSLog.e(com/comscore/utils/FileUtils, ((StringBuilder) (obj)).toString());
	//   75  134:ldc1            #2   <Class FileUtils>
	//   76  136:aload           5
	//   77  138:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   78  141:invokestatic    #179 <Method void CSLog.e(Class, String)>
		core = ((Core) (s));
	//   79  144:aload_1         
	//   80  145:astore_0        
		CSLog.printStackTrace(((Exception) (s1)));
	//   81  146:aload_3         
	//   82  147:invokestatic    #128 <Method void CSLog.printStackTrace(Exception)>
		if(s == null)
			break MISSING_BLOCK_LABEL_158;
	//   83  150:aload_1         
	//   84  151:ifnull          158
		((FileOutputStream) (s)).close();
	//   85  154:aload_1         
	//   86  155:invokevirtual   #171 <Method void FileOutputStream.close()>
		return;
	//   87  158:return          
		if(core != null)
	//*  88  159:aload_0         
	//*  89  160:ifnull          175
			try
			{
				((FileOutputStream) (core)).close();
	//   90  163:aload_0         
	//   91  164:invokevirtual   #171 <Method void FileOutputStream.close()>
			}
	//*  92  167:goto            175
			// Misplaced declaration of an exception variable
			catch(Core core)
	//*  93  170:astore_0        
			{
				CSLog.printStackTrace(((Exception) (core)));
	//   94  171:aload_0         
	//   95  172:invokestatic    #128 <Method void CSLog.printStackTrace(Exception)>
			}
		throw s;
	//   96  175:aload_1         
	//   97  176:athrow          
	}
}
