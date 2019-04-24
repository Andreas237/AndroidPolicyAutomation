// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;
import o.af;

public final class MultiDex
{
	static final class c
	{

		private static void a(ClassLoader classloader, List list, File file)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
		{
			classloader = ((ClassLoader) (MultiDex.findField(((Object) (classloader)), "pathList").get(((Object) (classloader)))));
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "pathList">
		//    2    3:invokestatic    #25  <Method Field MultiDex.access$300(Object, String)>
		//    3    6:aload_0         
		//    4    7:invokevirtual   #31  <Method Object Field.get(Object)>
		//    5   10:astore_0        
			MultiDex.expandFieldArray(((Object) (classloader)), "dexElements", a(((Object) (classloader)), new ArrayList(((java.util.Collection) (list))), file));
		//    6   11:aload_0         
		//    7   12:ldc1            #33  <String "dexElements">
		//    8   14:aload_0         
		//    9   15:new             #35  <Class ArrayList>
		//   10   18:dup             
		//   11   19:aload_1         
		//   12   20:invokespecial   #39  <Method void ArrayList(java.util.Collection)>
		//   13   23:aload_2         
		//   14   24:invokestatic    #42  <Method Object[] a(Object, ArrayList, File)>
		//   15   27:invokestatic    #46  <Method void MultiDex.access$400(Object, String, Object[])>
		//   16   30:return          
		}

		private static Object[] a(Object obj, ArrayList arraylist, File file)
			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
		{
			return (Object[])(Object[])MultiDex.findMethod(obj, "makeDexElements", new Class[] {
				java/util/ArrayList, java/io/File
			}).invoke(obj, new Object[] {
				arraylist, file
			});
		//    0    0:aload_0         
		//    1    1:ldc1            #52  <String "makeDexElements">
		//    2    3:iconst_2        
		//    3    4:anewarray       Class[]
		//    4    7:dup             
		//    5    8:iconst_0        
		//    6    9:ldc1            #35  <Class ArrayList>
		//    7   11:aastore         
		//    8   12:dup             
		//    9   13:iconst_1        
		//   10   14:ldc1            #56  <Class File>
		//   11   16:aastore         
		//   12   17:invokestatic    #60  <Method Method MultiDex.access$500(Object, String, Class[])>
		//   13   20:aload_0         
		//   14   21:iconst_2        
		//   15   22:anewarray       Object[]
		//   16   25:dup             
		//   17   26:iconst_0        
		//   18   27:aload_1         
		//   19   28:aastore         
		//   20   29:dup             
		//   21   30:iconst_1        
		//   22   31:aload_2         
		//   23   32:aastore         
		//   24   33:invokevirtual   #66  <Method Object Method.invoke(Object, Object[])>
		//   25   36:checkcast       #68  <Class Object[]>
		//   26   39:checkcast       #68  <Class Object[]>
		//   27   42:areturn         
		}

		static void d(ClassLoader classloader, List list, File file)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
		{
			a(classloader, list, file);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokestatic    #72  <Method void a(ClassLoader, List, File)>
		//    4    6:return          
		}
	}

	static final class d
	{

		private static void a(ClassLoader classloader, List list, File file)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
		{
			Object obj = MultiDex.findField(((Object) (classloader)), "pathList").get(((Object) (classloader)));
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "pathList">
		//    2    3:invokestatic    #25  <Method Field MultiDex.access$300(Object, String)>
		//    3    6:aload_0         
		//    4    7:invokevirtual   #31  <Method Object Field.get(Object)>
		//    5   10:astore          4
			ArrayList arraylist = new ArrayList();
		//    6   12:new             #33  <Class ArrayList>
		//    7   15:dup             
		//    8   16:invokespecial   #37  <Method void ArrayList()>
		//    9   19:astore_3        
			MultiDex.expandFieldArray(obj, "dexElements", b(obj, new ArrayList(((java.util.Collection) (list))), file, arraylist));
		//   10   20:aload           4
		//   11   22:ldc1            #39  <String "dexElements">
		//   12   24:aload           4
		//   13   26:new             #33  <Class ArrayList>
		//   14   29:dup             
		//   15   30:aload_1         
		//   16   31:invokespecial   #42  <Method void ArrayList(java.util.Collection)>
		//   17   34:aload_2         
		//   18   35:aload_3         
		//   19   36:invokestatic    #46  <Method Object[] b(Object, ArrayList, File, ArrayList)>
		//   20   39:invokestatic    #50  <Method void MultiDex.access$400(Object, String, Object[])>
			if(arraylist.size() > 0)
		//*  21   42:aload_3         
		//*  22   43:invokevirtual   #54  <Method int ArrayList.size()>
		//*  23   46:ifle            164
			{
				for(list = ((List) (arraylist.iterator())); ((Iterator) (list)).hasNext(); Log.w("MultiDex", "Exception in makeDexElement", ((Throwable) ((IOException)((Iterator) (list)).next()))));
		//   24   49:aload_3         
		//   25   50:invokevirtual   #58  <Method Iterator ArrayList.iterator()>
		//   26   53:astore_1        
		//   27   54:aload_1         
		//   28   55:invokeinterface #64  <Method boolean Iterator.hasNext()>
		//   29   60:ifeq            83
		//   30   63:ldc1            #66  <String "MultiDex">
		//   31   65:ldc1            #68  <String "Exception in makeDexElement">
		//   32   67:aload_1         
		//   33   68:invokeinterface #72  <Method Object Iterator.next()>
		//   34   73:checkcast       #74  <Class IOException>
		//   35   76:invokestatic    #80  <Method int Log.w(String, String, Throwable)>
		//   36   79:pop             
		//*  37   80:goto            54
				file = ((File) (MultiDex.findField(((Object) (classloader)), "dexElementsSuppressedExceptions")));
		//   38   83:aload_0         
		//   39   84:ldc1            #82  <String "dexElementsSuppressedExceptions">
		//   40   86:invokestatic    #25  <Method Field MultiDex.access$300(Object, String)>
		//   41   89:astore_2        
				IOException aioexception[] = (IOException[])(IOException[])((Field) (file)).get(((Object) (classloader)));
		//   42   90:aload_2         
		//   43   91:aload_0         
		//   44   92:invokevirtual   #31  <Method Object Field.get(Object)>
		//   45   95:checkcast       #84  <Class IOException[]>
		//   46   98:checkcast       #84  <Class IOException[]>
		//   47  101:astore          4
				if(aioexception == null)
		//*  48  103:aload           4
		//*  49  105:ifnonnull       126
				{
					list = ((List) ((IOException[])arraylist.toArray(((Object []) (new IOException[arraylist.size()])))));
		//   50  108:aload_3         
		//   51  109:aload_3         
		//   52  110:invokevirtual   #54  <Method int ArrayList.size()>
		//   53  113:anewarray       IOException[]
		//   54  116:invokevirtual   #88  <Method Object[] ArrayList.toArray(Object[])>
		//   55  119:checkcast       #84  <Class IOException[]>
		//   56  122:astore_1        
				} else
		//*  57  123:goto            158
				{
					list = ((List) (new IOException[arraylist.size() + aioexception.length]));
		//   58  126:aload_3         
		//   59  127:invokevirtual   #54  <Method int ArrayList.size()>
		//   60  130:aload           4
		//   61  132:arraylength     
		//   62  133:iadd            
		//   63  134:anewarray       IOException[]
		//   64  137:astore_1        
					arraylist.toArray(((Object []) (list)));
		//   65  138:aload_3         
		//   66  139:aload_1         
		//   67  140:invokevirtual   #88  <Method Object[] ArrayList.toArray(Object[])>
		//   68  143:pop             
					System.arraycopy(((Object) (aioexception)), 0, ((Object) (list)), arraylist.size(), aioexception.length);
		//   69  144:aload           4
		//   70  146:iconst_0        
		//   71  147:aload_1         
		//   72  148:aload_3         
		//   73  149:invokevirtual   #54  <Method int ArrayList.size()>
		//   74  152:aload           4
		//   75  154:arraylength     
		//   76  155:invokestatic    #94  <Method void System.arraycopy(Object, int, Object, int, int)>
				}
				((Field) (file)).set(((Object) (classloader)), ((Object) (list)));
		//   77  158:aload_2         
		//   78  159:aload_0         
		//   79  160:aload_1         
		//   80  161:invokevirtual   #98  <Method void Field.set(Object, Object)>
			}
		//   81  164:return          
		}

		private static Object[] b(Object obj, ArrayList arraylist, File file, ArrayList arraylist1)
			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
		{
			return (Object[])(Object[])MultiDex.findMethod(obj, "makeDexElements", new Class[] {
				java/util/ArrayList, java/io/File, java/util/ArrayList
			}).invoke(obj, new Object[] {
				arraylist, file, arraylist1
			});
		//    0    0:aload_0         
		//    1    1:ldc1            #104 <String "makeDexElements">
		//    2    3:iconst_3        
		//    3    4:anewarray       Class[]
		//    4    7:dup             
		//    5    8:iconst_0        
		//    6    9:ldc1            #33  <Class ArrayList>
		//    7   11:aastore         
		//    8   12:dup             
		//    9   13:iconst_1        
		//   10   14:ldc1            #108 <Class File>
		//   11   16:aastore         
		//   12   17:dup             
		//   13   18:iconst_2        
		//   14   19:ldc1            #33  <Class ArrayList>
		//   15   21:aastore         
		//   16   22:invokestatic    #112 <Method Method MultiDex.access$500(Object, String, Class[])>
		//   17   25:aload_0         
		//   18   26:iconst_3        
		//   19   27:anewarray       Object[]
		//   20   30:dup             
		//   21   31:iconst_0        
		//   22   32:aload_1         
		//   23   33:aastore         
		//   24   34:dup             
		//   25   35:iconst_1        
		//   26   36:aload_2         
		//   27   37:aastore         
		//   28   38:dup             
		//   29   39:iconst_2        
		//   30   40:aload_3         
		//   31   41:aastore         
		//   32   42:invokevirtual   #118 <Method Object Method.invoke(Object, Object[])>
		//   33   45:checkcast       #120 <Class Object[]>
		//   34   48:checkcast       #120 <Class Object[]>
		//   35   51:areturn         
		}

		static void d(ClassLoader classloader, List list, File file)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
		{
			a(classloader, list, file);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokestatic    #123 <Method void a(ClassLoader, List, File)>
		//    4    6:return          
		}
	}

	static final class e
	{

		private static void a(ClassLoader classloader, List list)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException
		{
			int i = list.size();
		//    0    0:aload_1         
		//    1    1:invokeinterface #23  <Method int List.size()>
		//    2    6:istore_2        
			Field field = MultiDex.findField(((Object) (classloader)), "path");
		//    3    7:aload_0         
		//    4    8:ldc1            #25  <String "path">
		//    5   10:invokestatic    #29  <Method Field MultiDex.access$300(Object, String)>
		//    6   13:astore_3        
			StringBuilder stringbuilder = new StringBuilder((String)field.get(((Object) (classloader))));
		//    7   14:new             #31  <Class StringBuilder>
		//    8   17:dup             
		//    9   18:aload_3         
		//   10   19:aload_0         
		//   11   20:invokevirtual   #37  <Method Object Field.get(Object)>
		//   12   23:checkcast       #39  <Class String>
		//   13   26:invokespecial   #43  <Method void StringBuilder(String)>
		//   14   29:astore          4
			String as[] = new String[i];
		//   15   31:iload_2         
		//   16   32:anewarray       String[]
		//   17   35:astore          5
			File afile[] = new File[i];
		//   18   37:iload_2         
		//   19   38:anewarray       File[]
		//   20   41:astore          6
			ZipFile azipfile[] = new ZipFile[i];
		//   21   43:iload_2         
		//   22   44:anewarray       ZipFile[]
		//   23   47:astore          7
			DexFile adexfile[] = new DexFile[i];
		//   24   49:iload_2         
		//   25   50:anewarray       DexFile[]
		//   26   53:astore          8
			for(list = ((List) (list.listIterator())); ((ListIterator) (list)).hasNext();)
		//*  27   55:aload_1         
		//*  28   56:invokeinterface #53  <Method ListIterator List.listIterator()>
		//*  29   61:astore_1        
		//*  30   62:aload_1         
		//*  31   63:invokeinterface #59  <Method boolean ListIterator.hasNext()>
		//*  32   68:ifeq            167
			{
				File file = (File)((ListIterator) (list)).next();
		//   33   71:aload_1         
		//   34   72:invokeinterface #63  <Method Object ListIterator.next()>
		//   35   77:checkcast       #45  <Class File>
		//   36   80:astore          9
				String s = file.getAbsolutePath();
		//   37   82:aload           9
		//   38   84:invokevirtual   #67  <Method String File.getAbsolutePath()>
		//   39   87:astore          10
				stringbuilder.append(':').append(s);
		//   40   89:aload           4
		//   41   91:bipush          58
		//   42   93:invokevirtual   #71  <Method StringBuilder StringBuilder.append(char)>
		//   43   96:aload           10
		//   44   98:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   45  101:pop             
				int j = ((ListIterator) (list)).previousIndex();
		//   46  102:aload_1         
		//   47  103:invokeinterface #77  <Method int ListIterator.previousIndex()>
		//   48  108:istore_2        
				as[j] = s;
		//   49  109:aload           5
		//   50  111:iload_2         
		//   51  112:aload           10
		//   52  114:aastore         
				afile[j] = file;
		//   53  115:aload           6
		//   54  117:iload_2         
		//   55  118:aload           9
		//   56  120:aastore         
				azipfile[j] = new ZipFile(file);
		//   57  121:aload           7
		//   58  123:iload_2         
		//   59  124:new             #47  <Class ZipFile>
		//   60  127:dup             
		//   61  128:aload           9
		//   62  130:invokespecial   #80  <Method void ZipFile(File)>
		//   63  133:aastore         
				adexfile[j] = DexFile.loadDex(s, (new StringBuilder()).append(s).append(".dex").toString(), 0);
		//   64  134:aload           8
		//   65  136:iload_2         
		//   66  137:aload           10
		//   67  139:new             #31  <Class StringBuilder>
		//   68  142:dup             
		//   69  143:invokespecial   #83  <Method void StringBuilder()>
		//   70  146:aload           10
		//   71  148:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   72  151:ldc1            #85  <String ".dex">
		//   73  153:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   74  156:invokevirtual   #88  <Method String StringBuilder.toString()>
		//   75  159:iconst_0        
		//   76  160:invokestatic    #92  <Method DexFile DexFile.loadDex(String, String, int)>
		//   77  163:aastore         
			}

		//*  78  164:goto            62
			field.set(((Object) (classloader)), ((Object) (stringbuilder.toString())));
		//   79  167:aload_3         
		//   80  168:aload_0         
		//   81  169:aload           4
		//   82  171:invokevirtual   #88  <Method String StringBuilder.toString()>
		//   83  174:invokevirtual   #96  <Method void Field.set(Object, Object)>
			MultiDex.expandFieldArray(((Object) (classloader)), "mPaths", ((Object []) (as)));
		//   84  177:aload_0         
		//   85  178:ldc1            #98  <String "mPaths">
		//   86  180:aload           5
		//   87  182:invokestatic    #102 <Method void MultiDex.access$400(Object, String, Object[])>
			MultiDex.expandFieldArray(((Object) (classloader)), "mFiles", ((Object []) (afile)));
		//   88  185:aload_0         
		//   89  186:ldc1            #104 <String "mFiles">
		//   90  188:aload           6
		//   91  190:invokestatic    #102 <Method void MultiDex.access$400(Object, String, Object[])>
			MultiDex.expandFieldArray(((Object) (classloader)), "mZips", ((Object []) (azipfile)));
		//   92  193:aload_0         
		//   93  194:ldc1            #106 <String "mZips">
		//   94  196:aload           7
		//   95  198:invokestatic    #102 <Method void MultiDex.access$400(Object, String, Object[])>
			MultiDex.expandFieldArray(((Object) (classloader)), "mDexs", ((Object []) (adexfile)));
		//   96  201:aload_0         
		//   97  202:ldc1            #108 <String "mDexs">
		//   98  204:aload           8
		//   99  206:invokestatic    #102 <Method void MultiDex.access$400(Object, String, Object[])>
		//  100  209:return          
		}

		static void b(ClassLoader classloader, List list)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException
		{
			a(classloader, list);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #115 <Method void a(ClassLoader, List)>
		//    3    5:return          
		}
	}


	private MultiDex()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void Object()>
	//    2    4:return          
	}

	private static boolean checkValidZipFiles(List list)
	{
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #112 <Method Iterator List.iterator()>
	//*   2    6:astore_0        
	//*   3    7:aload_0         
	//*   4    8:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            36
			if(!af.a((File)((Iterator) (list)).next()))
	//*   6   16:aload_0         
	//*   7   17:invokeinterface #122 <Method Object Iterator.next()>
	//*   8   22:checkcast       #50  <Class File>
	//*   9   25:invokestatic    #128 <Method boolean af.a(File)>
	//*  10   28:ifne            33
				return false;
	//   11   31:iconst_0        
	//   12   32:ireturn         

	//*  13   33:goto            7
		return true;
	//   14   36:iconst_1        
	//   15   37:ireturn         
	}

	private static void clearOldDexDir(Context context)
		throws Exception
	{
		context = ((Context) (new File(context.getFilesDir(), "secondary-dexes")));
	//    0    0:new             #50  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #140 <Method File Context.getFilesDir()>
	//    4    8:ldc1            #24  <String "secondary-dexes">
	//    5   10:invokespecial   #143 <Method void File(File, String)>
	//    6   13:astore_0        
		if(((File) (context)).isDirectory())
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #146 <Method boolean File.isDirectory()>
	//*   9   18:ifeq            294
		{
			Log.i("MultiDex", (new StringBuilder()).append("Clearing old secondary dex dir (").append(((File) (context)).getPath()).append(").").toString());
	//   10   21:ldc1            #28  <String "MultiDex">
	//   11   23:new             #39  <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #42  <Method void StringBuilder()>
	//   14   30:ldc1            #148 <String "Clearing old secondary dex dir (">
	//   15   32:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:aload_0         
	//   17   36:invokevirtual   #151 <Method String File.getPath()>
	//   18   39:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   19   42:ldc1            #153 <String ").">
	//   20   44:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   21   47:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   22   50:invokestatic    #159 <Method int Log.i(String, String)>
	//   23   53:pop             
			File afile[] = ((File) (context)).listFiles();
	//   24   54:aload_0         
	//   25   55:invokevirtual   #163 <Method File[] File.listFiles()>
	//   26   58:astore_3        
			if(afile == null)
	//*  27   59:aload_3         
	//*  28   60:ifnonnull       97
			{
				Log.w("MultiDex", (new StringBuilder()).append("Failed to list secondary dex dir content (").append(((File) (context)).getPath()).append(").").toString());
	//   29   63:ldc1            #28  <String "MultiDex">
	//   30   65:new             #39  <Class StringBuilder>
	//   31   68:dup             
	//   32   69:invokespecial   #42  <Method void StringBuilder()>
	//   33   72:ldc1            #165 <String "Failed to list secondary dex dir content (">
	//   34   74:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   35   77:aload_0         
	//   36   78:invokevirtual   #151 <Method String File.getPath()>
	//   37   81:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   38   84:ldc1            #153 <String ").">
	//   39   86:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   40   89:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   41   92:invokestatic    #168 <Method int Log.w(String, String)>
	//   42   95:pop             
				return;
	//   43   96:return          
			}
			int j = afile.length;
	//   44   97:aload_3         
	//   45   98:arraylength     
	//   46   99:istore_2        
			for(int i = 0; i < j; i++)
	//*  47  100:iconst_0        
	//*  48  101:istore_1        
	//*  49  102:iload_1         
	//*  50  103:iload_2         
	//*  51  104:icmpge          230
			{
				File file = afile[i];
	//   52  107:aload_3         
	//   53  108:iload_1         
	//   54  109:aaload          
	//   55  110:astore          4
				Log.i("MultiDex", (new StringBuilder()).append("Trying to delete old file ").append(file.getPath()).append(" of size ").append(file.length()).toString());
	//   56  112:ldc1            #28  <String "MultiDex">
	//   57  114:new             #39  <Class StringBuilder>
	//   58  117:dup             
	//   59  118:invokespecial   #42  <Method void StringBuilder()>
	//   60  121:ldc1            #170 <String "Trying to delete old file ">
	//   61  123:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   62  126:aload           4
	//   63  128:invokevirtual   #151 <Method String File.getPath()>
	//   64  131:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   65  134:ldc1            #172 <String " of size ">
	//   66  136:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   67  139:aload           4
	//   68  141:invokevirtual   #176 <Method long File.length()>
	//   69  144:invokevirtual   #179 <Method StringBuilder StringBuilder.append(long)>
	//   70  147:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   71  150:invokestatic    #159 <Method int Log.i(String, String)>
	//   72  153:pop             
				if(!file.delete())
	//*  73  154:aload           4
	//*  74  156:invokevirtual   #182 <Method boolean File.delete()>
	//*  75  159:ifne            194
					Log.w("MultiDex", (new StringBuilder()).append("Failed to delete old file ").append(file.getPath()).toString());
	//   76  162:ldc1            #28  <String "MultiDex">
	//   77  164:new             #39  <Class StringBuilder>
	//   78  167:dup             
	//   79  168:invokespecial   #42  <Method void StringBuilder()>
	//   80  171:ldc1            #184 <String "Failed to delete old file ">
	//   81  173:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   82  176:aload           4
	//   83  178:invokevirtual   #151 <Method String File.getPath()>
	//   84  181:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   85  184:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   86  187:invokestatic    #168 <Method int Log.w(String, String)>
	//   87  190:pop             
				else
	//*  88  191:goto            223
					Log.i("MultiDex", (new StringBuilder()).append("Deleted old file ").append(file.getPath()).toString());
	//   89  194:ldc1            #28  <String "MultiDex">
	//   90  196:new             #39  <Class StringBuilder>
	//   91  199:dup             
	//   92  200:invokespecial   #42  <Method void StringBuilder()>
	//   93  203:ldc1            #186 <String "Deleted old file ">
	//   94  205:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   95  208:aload           4
	//   96  210:invokevirtual   #151 <Method String File.getPath()>
	//   97  213:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   98  216:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   99  219:invokestatic    #159 <Method int Log.i(String, String)>
	//  100  222:pop             
			}

	//  101  223:iload_1         
	//  102  224:iconst_1        
	//  103  225:iadd            
	//  104  226:istore_1        
	//* 105  227:goto            102
			if(!((File) (context)).delete())
	//* 106  230:aload_0         
	//* 107  231:invokevirtual   #182 <Method boolean File.delete()>
	//* 108  234:ifne            266
			{
				Log.w("MultiDex", (new StringBuilder()).append("Failed to delete secondary dex dir ").append(((File) (context)).getPath()).toString());
	//  109  237:ldc1            #28  <String "MultiDex">
	//  110  239:new             #39  <Class StringBuilder>
	//  111  242:dup             
	//  112  243:invokespecial   #42  <Method void StringBuilder()>
	//  113  246:ldc1            #188 <String "Failed to delete secondary dex dir ">
	//  114  248:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//  115  251:aload_0         
	//  116  252:invokevirtual   #151 <Method String File.getPath()>
	//  117  255:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//  118  258:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  119  261:invokestatic    #168 <Method int Log.w(String, String)>
	//  120  264:pop             
				return;
	//  121  265:return          
			}
			Log.i("MultiDex", (new StringBuilder()).append("Deleted old secondary dex dir ").append(((File) (context)).getPath()).toString());
	//  122  266:ldc1            #28  <String "MultiDex">
	//  123  268:new             #39  <Class StringBuilder>
	//  124  271:dup             
	//  125  272:invokespecial   #42  <Method void StringBuilder()>
	//  126  275:ldc1            #190 <String "Deleted old secondary dex dir ">
	//  127  277:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//  128  280:aload_0         
	//  129  281:invokevirtual   #151 <Method String File.getPath()>
	//  130  284:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//  131  287:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  132  290:invokestatic    #159 <Method int Log.i(String, String)>
	//  133  293:pop             
		}
	//  134  294:return          
	}

	private static void expandFieldArray(Object obj, String s, Object aobj[])
		throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
	{
		s = ((String) (findField(obj, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #87  <Method Field findField(Object, String)>
	//    3    5:astore_1        
		Object aobj1[] = (Object[])(Object[])((Field) (s)).get(obj);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #196 <Method Object Field.get(Object)>
	//    7   11:checkcast       #198 <Class Object[]>
	//    8   14:checkcast       #198 <Class Object[]>
	//    9   17:astore_3        
		Object aobj2[] = (Object[])(Object[])Array.newInstance(((Object) (aobj1)).getClass().getComponentType(), aobj1.length + aobj.length);
	//   10   18:aload_3         
	//   11   19:invokevirtual   #202 <Method Class Object.getClass()>
	//   12   22:invokevirtual   #207 <Method Class Class.getComponentType()>
	//   13   25:aload_3         
	//   14   26:arraylength     
	//   15   27:aload_2         
	//   16   28:arraylength     
	//   17   29:iadd            
	//   18   30:invokestatic    #213 <Method Object Array.newInstance(Class, int)>
	//   19   33:checkcast       #198 <Class Object[]>
	//   20   36:checkcast       #198 <Class Object[]>
	//   21   39:astore          4
		System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj2)), 0, aobj1.length);
	//   22   41:aload_3         
	//   23   42:iconst_0        
	//   24   43:aload           4
	//   25   45:iconst_0        
	//   26   46:aload_3         
	//   27   47:arraylength     
	//   28   48:invokestatic    #217 <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj2)), aobj1.length, aobj.length);
	//   29   51:aload_2         
	//   30   52:iconst_0        
	//   31   53:aload           4
	//   32   55:aload_3         
	//   33   56:arraylength     
	//   34   57:aload_2         
	//   35   58:arraylength     
	//   36   59:invokestatic    #217 <Method void System.arraycopy(Object, int, Object, int, int)>
		((Field) (s)).set(obj, ((Object) (aobj2)));
	//   37   62:aload_1         
	//   38   63:aload_0         
	//   39   64:aload           4
	//   40   66:invokevirtual   #221 <Method void Field.set(Object, Object)>
	//   41   69:return          
	}

	private static Field findField(Object obj, String s)
		throws NoSuchFieldException
	{
		Class class1 = obj.getClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #202 <Method Class Object.getClass()>
	//    2    4:astore_2        
_L2:
		if(class1 == null)
			break; /* Loop/switch isn't completed */
	//    3    5:aload_2         
	//    4    6:ifnull          38
		Field field;
		field = class1.getDeclaredField(s);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #225 <Method Field Class.getDeclaredField(String)>
	//    8   14:astore_3        
		if(!field.isAccessible())
	//*   9   15:aload_3         
	//*  10   16:invokevirtual   #228 <Method boolean Field.isAccessible()>
	//*  11   19:ifne            27
			field.setAccessible(true);
	//   12   22:aload_3         
	//   13   23:iconst_1        
	//   14   24:invokevirtual   #232 <Method void Field.setAccessible(boolean)>
		return field;
	//   15   27:aload_3         
	//   16   28:areturn         
		NoSuchFieldException nosuchfieldexception;
		nosuchfieldexception;
	//   17   29:astore_3        
		class1 = class1.getSuperclass();
	//   18   30:aload_2         
	//   19   31:invokevirtual   #235 <Method Class Class.getSuperclass()>
	//   20   34:astore_2        
		if(true) goto _L2; else goto _L1
	//   21   35:goto            5
_L1:
		throw new NoSuchFieldException((new StringBuilder()).append("Field ").append(s).append(" not found in ").append(((Object) (obj.getClass()))).toString());
	//   22   38:new             #84  <Class NoSuchFieldException>
	//   23   41:dup             
	//   24   42:new             #39  <Class StringBuilder>
	//   25   45:dup             
	//   26   46:invokespecial   #42  <Method void StringBuilder()>
	//   27   49:ldc1            #237 <String "Field ">
	//   28   51:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   29   54:aload_1         
	//   30   55:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   31   58:ldc1            #239 <String " not found in ">
	//   32   60:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   33   63:aload_0         
	//   34   64:invokevirtual   #202 <Method Class Object.getClass()>
	//   35   67:invokevirtual   #242 <Method StringBuilder StringBuilder.append(Object)>
	//   36   70:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   37   73:invokespecial   #245 <Method void NoSuchFieldException(String)>
	//   38   76:athrow          
	}

	private static transient Method findMethod(Object obj, String s, Class aclass[])
		throws NoSuchMethodException
	{
		Class class1 = obj.getClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #202 <Method Class Object.getClass()>
	//    2    4:astore_3        
_L2:
		if(class1 == null)
			break; /* Loop/switch isn't completed */
	//    3    5:aload_3         
	//    4    6:ifnull          44
		Method method;
		method = class1.getDeclaredMethod(s, aclass);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #249 <Method Method Class.getDeclaredMethod(String, Class[])>
	//    9   15:astore          4
		if(!method.isAccessible())
	//*  10   17:aload           4
	//*  11   19:invokevirtual   #252 <Method boolean Method.isAccessible()>
	//*  12   22:ifne            31
			method.setAccessible(true);
	//   13   25:aload           4
	//   14   27:iconst_1        
	//   15   28:invokevirtual   #253 <Method void Method.setAccessible(boolean)>
		return method;
	//   16   31:aload           4
	//   17   33:areturn         
		NoSuchMethodException nosuchmethodexception;
		nosuchmethodexception;
	//   18   34:astore          4
		class1 = class1.getSuperclass();
	//   19   36:aload_3         
	//   20   37:invokevirtual   #235 <Method Class Class.getSuperclass()>
	//   21   40:astore_3        
		if(true) goto _L2; else goto _L1
	//   22   41:goto            5
_L1:
		throw new NoSuchMethodException((new StringBuilder()).append("Method ").append(s).append(" with parameters ").append(((Object) (Arrays.asList(((Object []) (aclass)))))).append(" not found in ").append(((Object) (obj.getClass()))).toString());
	//   23   44:new             #101 <Class NoSuchMethodException>
	//   24   47:dup             
	//   25   48:new             #39  <Class StringBuilder>
	//   26   51:dup             
	//   27   52:invokespecial   #42  <Method void StringBuilder()>
	//   28   55:ldc1            #255 <String "Method ">
	//   29   57:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   30   60:aload_1         
	//   31   61:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   32   64:ldc2            #257 <String " with parameters ">
	//   33   67:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   34   70:aload_2         
	//   35   71:invokestatic    #263 <Method List Arrays.asList(Object[])>
	//   36   74:invokevirtual   #242 <Method StringBuilder StringBuilder.append(Object)>
	//   37   77:ldc1            #239 <String " not found in ">
	//   38   79:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   39   82:aload_0         
	//   40   83:invokevirtual   #202 <Method Class Object.getClass()>
	//   41   86:invokevirtual   #242 <Method StringBuilder StringBuilder.append(Object)>
	//   42   89:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   43   92:invokespecial   #264 <Method void NoSuchMethodException(String)>
	//   44   95:athrow          
	}

	private static ApplicationInfo getApplicationInfo(Context context)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		PackageManager packagemanager;
		try
		{
			packagemanager = context.getPackageManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #275 <Method PackageManager Context.getPackageManager()>
	//    2    4:astore_1        
			context = ((Context) (context.getPackageName()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #278 <Method String Context.getPackageName()>
	//    5    9:astore_0        
		}
	//*   6   10:goto            26
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   7   13:astore_0        
		{
			Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", ((Throwable) (context)));
	//    8   14:ldc1            #28  <String "MultiDex">
	//    9   16:ldc2            #280 <String "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.">
	//   10   19:aload_0         
	//   11   20:invokestatic    #283 <Method int Log.w(String, String, Throwable)>
	//   12   23:pop             
			return null;
	//   13   24:aconst_null     
	//   14   25:areturn         
		}
		if(packagemanager == null || context == null)
	//*  15   26:aload_1         
	//*  16   27:ifnull          34
	//*  17   30:aload_0         
	//*  18   31:ifnonnull       36
			return null;
	//   19   34:aconst_null     
	//   20   35:areturn         
		else
			return packagemanager.getApplicationInfo(((String) (context)), 128);
	//   21   36:aload_1         
	//   22   37:aload_0         
	//   23   38:sipush          128
	//   24   41:invokevirtual   #288 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   25   44:areturn         
	}

	public static void install(Context context)
	{
		Log.i("MultiDex", "install");
	//    0    0:ldc1            #28  <String "MultiDex">
	//    1    2:ldc2            #292 <String "install">
	//    2    5:invokestatic    #159 <Method int Log.i(String, String)>
	//    3    8:pop             
		if(IS_VM_MULTIDEX_CAPABLE)
	//*   4    9:getstatic       #78  <Field boolean IS_VM_MULTIDEX_CAPABLE>
	//*   5   12:ifeq            25
		{
			Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
	//    6   15:ldc1            #28  <String "MultiDex">
	//    7   17:ldc2            #294 <String "VM has multidex support, MultiDex support library is disabled.">
	//    8   20:invokestatic    #159 <Method int Log.i(String, String)>
	//    9   23:pop             
			return;
	//   10   24:return          
		}
		if(android.os.Build.VERSION.SDK_INT < 4)
	//*  11   25:getstatic       #299 <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   28:iconst_4        
	//*  13   29:icmpge          78
			throw new RuntimeException((new StringBuilder()).append("Multi dex installation failed. SDK ").append(android.os.Build.VERSION.SDK_INT).append(" is unsupported. Min SDK version is ").append(4).append(".").toString());
	//   14   32:new             #271 <Class RuntimeException>
	//   15   35:dup             
	//   16   36:new             #39  <Class StringBuilder>
	//   17   39:dup             
	//   18   40:invokespecial   #42  <Method void StringBuilder()>
	//   19   43:ldc2            #301 <String "Multi dex installation failed. SDK ">
	//   20   46:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   21   49:getstatic       #299 <Field int android.os.Build$VERSION.SDK_INT>
	//   22   52:invokevirtual   #304 <Method StringBuilder StringBuilder.append(int)>
	//   23   55:ldc2            #306 <String " is unsupported. Min SDK version is ">
	//   24   58:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   25   61:iconst_4        
	//   26   62:invokevirtual   #304 <Method StringBuilder StringBuilder.append(int)>
	//   27   65:ldc2            #308 <String ".">
	//   28   68:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   29   71:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   30   74:invokespecial   #309 <Method void RuntimeException(String)>
	//   31   77:athrow          
		ApplicationInfo applicationinfo = getApplicationInfo(context);
	//   32   78:aload_0         
	//   33   79:invokestatic    #311 <Method ApplicationInfo getApplicationInfo(Context)>
	//   34   82:astore_3        
		if(applicationinfo == null)
	//*  35   83:aload_3         
	//*  36   84:ifnonnull       88
			return;
	//   37   87:return          
		Set set = installedApk;
	//   38   88:getstatic       #64  <Field Set installedApk>
	//   39   91:astore_2        
		set;
	//   40   92:aload_2         
		JVM INSTR monitorenter ;
	//   41   93:monitorenter    
		boolean flag;
		Object obj;
		obj = ((Object) (applicationinfo.sourceDir));
	//   42   94:aload_3         
	//   43   95:getfield        #316 <Field String ApplicationInfo.sourceDir>
	//   44   98:astore          4
		flag = installedApk.contains(obj);
	//   45  100:getstatic       #64  <Field Set installedApk>
	//   46  103:aload           4
	//   47  105:invokeinterface #322 <Method boolean Set.contains(Object)>
	//   48  110:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_118;
	//   49  111:iload_1         
	//   50  112:ifeq            118
		set;
	//   51  115:aload_2         
		JVM INSTR monitorexit ;
	//   52  116:monitorexit     
		return;
	//   53  117:return          
		installedApk.add(obj);
	//   54  118:getstatic       #64  <Field Set installedApk>
	//   55  121:aload           4
	//   56  123:invokeinterface #325 <Method boolean Set.add(Object)>
	//   57  128:pop             
		if(android.os.Build.VERSION.SDK_INT > 20)
	//*  58  129:getstatic       #299 <Field int android.os.Build$VERSION.SDK_INT>
	//*  59  132:bipush          20
	//*  60  134:icmple          208
			Log.w("MultiDex", (new StringBuilder()).append("MultiDex is not guaranteed to work in SDK version ").append(android.os.Build.VERSION.SDK_INT).append(": SDK version higher than ").append(20).append(" should be backed by ").append("runtime with built-in multidex capabilty but it's not the ").append("case here: java.vm.version=\"").append(System.getProperty("java.vm.version")).append("\"").toString());
	//   61  137:ldc1            #28  <String "MultiDex">
	//   62  139:new             #39  <Class StringBuilder>
	//   63  142:dup             
	//   64  143:invokespecial   #42  <Method void StringBuilder()>
	//   65  146:ldc2            #327 <String "MultiDex is not guaranteed to work in SDK version ">
	//   66  149:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   67  152:getstatic       #299 <Field int android.os.Build$VERSION.SDK_INT>
	//   68  155:invokevirtual   #304 <Method StringBuilder StringBuilder.append(int)>
	//   69  158:ldc2            #329 <String ": SDK version higher than ">
	//   70  161:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   71  164:bipush          20
	//   72  166:invokevirtual   #304 <Method StringBuilder StringBuilder.append(int)>
	//   73  169:ldc2            #331 <String " should be backed by ">
	//   74  172:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   75  175:ldc2            #333 <String "runtime with built-in multidex capabilty but it's not the ">
	//   76  178:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   77  181:ldc2            #335 <String "case here: java.vm.version=\"">
	//   78  184:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   79  187:ldc1            #66  <String "java.vm.version">
	//   80  189:invokestatic    #72  <Method String System.getProperty(String)>
	//   81  192:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   82  195:ldc2            #337 <String "\"">
	//   83  198:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   84  201:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   85  204:invokestatic    #168 <Method int Log.w(String, String)>
	//   86  207:pop             
		try
		{
			obj = ((Object) (context.getClassLoader()));
	//   87  208:aload_0         
	//   88  209:invokevirtual   #341 <Method ClassLoader Context.getClassLoader()>
	//   89  212:astore          4
			break MISSING_BLOCK_LABEL_231;
	//   90  214:goto            231
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   91  217:astore_0        
		Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", ((Throwable) (context)));
	//   92  218:ldc1            #28  <String "MultiDex">
	//   93  220:ldc2            #343 <String "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.">
	//   94  223:aload_0         
	//   95  224:invokestatic    #283 <Method int Log.w(String, String, Throwable)>
	//   96  227:pop             
		set;
	//   97  228:aload_2         
		JVM INSTR monitorexit ;
	//   98  229:monitorexit     
		return;
	//   99  230:return          
		if(obj != null)
			break MISSING_BLOCK_LABEL_248;
	//  100  231:aload           4
	//  101  233:ifnonnull       248
		Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
	//  102  236:ldc1            #28  <String "MultiDex">
	//  103  238:ldc2            #345 <String "Context class loader is null. Must be running in test mode. Skip patching.">
	//  104  241:invokestatic    #347 <Method int Log.e(String, String)>
	//  105  244:pop             
		set;
	//  106  245:aload_2         
		JVM INSTR monitorexit ;
	//  107  246:monitorexit     
		return;
	//  108  247:return          
		clearOldDexDir(context);
	//  109  248:aload_0         
	//  110  249:invokestatic    #349 <Method void clearOldDexDir(Context)>
		break MISSING_BLOCK_LABEL_268;
	//  111  252:goto            268
		Throwable throwable;
		throwable;
	//  112  255:astore          5
		Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", throwable);
	//  113  257:ldc1            #28  <String "MultiDex">
	//  114  259:ldc2            #351 <String "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.">
	//  115  262:aload           5
	//  116  264:invokestatic    #283 <Method int Log.w(String, String, Throwable)>
	//  117  267:pop             
		File file;
		file = new File(applicationinfo.dataDir, SECONDARY_FOLDER_NAME);
	//  118  268:new             #50  <Class File>
	//  119  271:dup             
	//  120  272:aload_3         
	//  121  273:getfield        #354 <Field String ApplicationInfo.dataDir>
	//  122  276:getstatic       #59  <Field String SECONDARY_FOLDER_NAME>
	//  123  279:invokespecial   #357 <Method void File(String, String)>
	//  124  282:astore          5
		List list = af.b(context, applicationinfo, file, false);
	//  125  284:aload_0         
	//  126  285:aload_3         
	//  127  286:aload           5
	//  128  288:iconst_0        
	//  129  289:invokestatic    #361 <Method List af.b(Context, ApplicationInfo, File, boolean)>
	//  130  292:astore          6
		if(checkValidZipFiles(list))
	//* 131  294:aload           6
	//* 132  296:invokestatic    #363 <Method boolean checkValidZipFiles(List)>
	//* 133  299:ifeq            314
		{
			installSecondaryDexes(((ClassLoader) (obj)), file, list);
	//  134  302:aload           4
	//  135  304:aload           5
	//  136  306:aload           6
	//  137  308:invokestatic    #367 <Method void installSecondaryDexes(ClassLoader, File, List)>
			break MISSING_BLOCK_LABEL_361;
	//  138  311:goto            361
		}
		Log.w("MultiDex", "Files were not valid zip files.  Forcing a reload.");
	//  139  314:ldc1            #28  <String "MultiDex">
	//  140  316:ldc2            #369 <String "Files were not valid zip files.  Forcing a reload.">
	//  141  319:invokestatic    #168 <Method int Log.w(String, String)>
	//  142  322:pop             
		context = ((Context) (af.b(context, applicationinfo, file, true)));
	//  143  323:aload_0         
	//  144  324:aload_3         
	//  145  325:aload           5
	//  146  327:iconst_1        
	//  147  328:invokestatic    #361 <Method List af.b(Context, ApplicationInfo, File, boolean)>
	//  148  331:astore_0        
		if(checkValidZipFiles(((List) (context))))
	//* 149  332:aload_0         
	//* 150  333:invokestatic    #363 <Method boolean checkValidZipFiles(List)>
	//* 151  336:ifeq            350
		{
			installSecondaryDexes(((ClassLoader) (obj)), file, ((List) (context)));
	//  152  339:aload           4
	//  153  341:aload           5
	//  154  343:aload_0         
	//  155  344:invokestatic    #367 <Method void installSecondaryDexes(ClassLoader, File, List)>
			break MISSING_BLOCK_LABEL_361;
	//  156  347:goto            361
		}
		throw new RuntimeException("Zip files were not valid.");
	//  157  350:new             #271 <Class RuntimeException>
	//  158  353:dup             
	//  159  354:ldc2            #371 <String "Zip files were not valid.">
	//  160  357:invokespecial   #309 <Method void RuntimeException(String)>
	//  161  360:athrow          
		set;
	//  162  361:aload_2         
		JVM INSTR monitorexit ;
	//  163  362:monitorexit     
		  goto _L1
	//* 164  363:goto            371
		context;
	//  165  366:astore_0        
	//* 166  367:aload_2         
	//* 167  368:monitorexit     
		try
		{
			throw context;
	//  168  369:aload_0         
	//  169  370:athrow          
		}
	//* 170  371:goto            421
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 171  374:astore_0        
		{
			Log.e("MultiDex", "Multidex installation failure", ((Throwable) (context)));
	//  172  375:ldc1            #28  <String "MultiDex">
	//  173  377:ldc2            #373 <String "Multidex installation failure">
	//  174  380:aload_0         
	//  175  381:invokestatic    #375 <Method int Log.e(String, String, Throwable)>
	//  176  384:pop             
		}
		throw new RuntimeException((new StringBuilder()).append("Multi dex installation failed (").append(((Exception) (context)).getMessage()).append(").").toString());
	//  177  385:new             #271 <Class RuntimeException>
	//  178  388:dup             
	//  179  389:new             #39  <Class StringBuilder>
	//  180  392:dup             
	//  181  393:invokespecial   #42  <Method void StringBuilder()>
	//  182  396:ldc2            #377 <String "Multi dex installation failed (">
	//  183  399:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//  184  402:aload_0         
	//  185  403:invokevirtual   #380 <Method String Exception.getMessage()>
	//  186  406:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//  187  409:ldc1            #153 <String ").">
	//  188  411:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//  189  414:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  190  417:invokespecial   #309 <Method void RuntimeException(String)>
	//  191  420:athrow          
_L1:
		Log.i("MultiDex", "install done");
	//  192  421:ldc1            #28  <String "MultiDex">
	//  193  423:ldc2            #382 <String "install done">
	//  194  426:invokestatic    #159 <Method int Log.i(String, String)>
	//  195  429:pop             
		return;
	//  196  430:return          
	}

	private static void installSecondaryDexes(ClassLoader classloader, File file, List list)
		throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException
	{
		if(!list.isEmpty())
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #389 <Method boolean List.isEmpty()>
	//*   2    6:ifne            44
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   3    9:getstatic       #299 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   12:bipush          19
	//*   5   14:icmplt          24
			{
				d.d(classloader, list, file);
	//    6   17:aload_0         
	//    7   18:aload_2         
	//    8   19:aload_1         
	//    9   20:invokestatic    #392 <Method void MultiDex$d.d(ClassLoader, List, File)>
				return;
	//   10   23:return          
			}
			if(android.os.Build.VERSION.SDK_INT >= 14)
	//*  11   24:getstatic       #299 <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   27:bipush          14
	//*  13   29:icmplt          39
			{
				c.d(classloader, list, file);
	//   14   32:aload_0         
	//   15   33:aload_2         
	//   16   34:aload_1         
	//   17   35:invokestatic    #393 <Method void MultiDex$c.d(ClassLoader, List, File)>
				return;
	//   18   38:return          
			}
			e.b(classloader, list);
	//   19   39:aload_0         
	//   20   40:aload_2         
	//   21   41:invokestatic    #396 <Method void MultiDex$e.b(ClassLoader, List)>
		}
	//   22   44:return          
	}

	static boolean isVMMultidexCapable(String s)
	{
		boolean flag;
		boolean flag1;
		Matcher matcher;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		flag = flag1;
	//    2    3:iload           4
	//    3    5:istore_3        
		if(s == null)
			break MISSING_BLOCK_LABEL_83;
	//    4    6:aload_0         
	//    5    7:ifnull          83
		matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(((CharSequence) (s)));
	//    6   10:ldc2            #401 <String "(\\d+)\\.(\\d+)(\\.\\d+)?">
	//    7   13:invokestatic    #407 <Method Pattern Pattern.compile(String)>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #411 <Method Matcher Pattern.matcher(CharSequence)>
	//   10   20:astore          5
		flag = flag1;
	//   11   22:iload           4
	//   12   24:istore_3        
		if(!matcher.matches())
			break MISSING_BLOCK_LABEL_83;
	//   13   25:aload           5
	//   14   27:invokevirtual   #416 <Method boolean Matcher.matches()>
	//   15   30:ifeq            83
		int i;
		int j;
		i = Integer.parseInt(matcher.group(1));
	//   16   33:aload           5
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #420 <Method String Matcher.group(int)>
	//   19   39:invokestatic    #426 <Method int Integer.parseInt(String)>
	//   20   42:istore_1        
		j = Integer.parseInt(matcher.group(2));
	//   21   43:aload           5
	//   22   45:iconst_2        
	//   23   46:invokevirtual   #420 <Method String Matcher.group(int)>
	//   24   49:invokestatic    #426 <Method int Integer.parseInt(String)>
	//   25   52:istore_2        
		if(i > 2 || i == 2 && j >= 1)
	//*  26   53:iload_1         
	//*  27   54:iconst_2        
	//*  28   55:icmpgt          68
	//*  29   58:iload_1         
	//*  30   59:iconst_2        
	//*  31   60:icmpne          73
	//*  32   63:iload_2         
	//*  33   64:iconst_1        
	//*  34   65:icmplt          73
			flag = true;
	//   35   68:iconst_1        
	//   36   69:istore_3        
		else
	//*  37   70:goto            75
			flag = false;
	//   38   73:iconst_0        
	//   39   74:istore_3        
		break MISSING_BLOCK_LABEL_83;
	//   40   75:goto            83
		NumberFormatException numberformatexception;
		numberformatexception;
	//   41   78:astore          5
		flag = flag1;
	//   42   80:iload           4
	//   43   82:istore_3        
		StringBuilder stringbuilder = (new StringBuilder()).append("VM with version ").append(s);
	//   44   83:new             #39  <Class StringBuilder>
	//   45   86:dup             
	//   46   87:invokespecial   #42  <Method void StringBuilder()>
	//   47   90:ldc2            #428 <String "VM with version ">
	//   48   93:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   49   96:aload_0         
	//   50   97:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   51  100:astore          5
		if(flag)
	//*  52  102:iload_3         
	//*  53  103:ifeq            113
			s = " has multidex support";
	//   54  106:ldc2            #430 <String " has multidex support">
	//   55  109:astore_0        
		else
	//*  56  110:goto            117
			s = " does not have multidex support";
	//   57  113:ldc2            #432 <String " does not have multidex support">
	//   58  116:astore_0        
		Log.i("MultiDex", stringbuilder.append(s).toString());
	//   59  117:ldc1            #28  <String "MultiDex">
	//   60  119:aload           5
	//   61  121:aload_0         
	//   62  122:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   63  125:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   64  128:invokestatic    #159 <Method int Log.i(String, String)>
	//   65  131:pop             
		return flag;
	//   66  132:iload_3         
	//   67  133:ireturn         
	}

	private static final boolean IS_VM_MULTIDEX_CAPABLE = isVMMultidexCapable(System.getProperty("java.vm.version"));
	private static final int MAX_SUPPORTED_SDK_VERSION = 20;
	private static final int MIN_SDK_VERSION = 4;
	private static final String OLD_SECONDARY_FOLDER_NAME = "secondary-dexes";
	private static final String SECONDARY_FOLDER_NAME;
	static final String TAG = "MultiDex";
	private static final int VM_WITH_MULTIDEX_VERSION_MAJOR = 2;
	private static final int VM_WITH_MULTIDEX_VERSION_MINOR = 1;
	private static final Set installedApk = new HashSet();

	static 
	{
		SECONDARY_FOLDER_NAME = (new StringBuilder()).append("code_cache").append(File.separator).append("secondary-dexes").toString();
	//    0    0:new             #39  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void StringBuilder()>
	//    3    7:ldc1            #44  <String "code_cache">
	//    4    9:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:getstatic       #53  <Field String File.separator>
	//    6   15:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//    7   18:ldc1            #24  <String "secondary-dexes">
	//    8   20:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//    9   23:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   10   26:putstatic       #59  <Field String SECONDARY_FOLDER_NAME>
	//   11   29:new             #61  <Class HashSet>
	//   12   32:dup             
	//   13   33:invokespecial   #62  <Method void HashSet()>
	//   14   36:putstatic       #64  <Field Set installedApk>
	//   15   39:ldc1            #66  <String "java.vm.version">
	//   16   41:invokestatic    #72  <Method String System.getProperty(String)>
	//   17   44:invokestatic    #76  <Method boolean isVMMultidexCapable(String)>
	//   18   47:putstatic       #78  <Field boolean IS_VM_MULTIDEX_CAPABLE>
	//*  19   50:return          
	}


/*
	static Field access$300(Object obj, String s)
		throws NoSuchFieldException
	{
		return findField(obj, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #87  <Method Field findField(Object, String)>
	//    3    5:areturn         
	}

*/


/*
	static void access$400(Object obj, String s, Object aobj[])
		throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
	{
		expandFieldArray(obj, s, aobj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #97  <Method void expandFieldArray(Object, String, Object[])>
		return;
	//    4    6:return          
	}

*/


/*
	static Method access$500(Object obj, String s, Class aclass[])
		throws NoSuchMethodException
	{
		return findMethod(obj, s, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #104 <Method Method findMethod(Object, String, Class[])>
	//    4    6:areturn         
	}

*/
}
