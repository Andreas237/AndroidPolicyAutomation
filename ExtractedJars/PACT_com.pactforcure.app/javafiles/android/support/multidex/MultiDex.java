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

// Referenced classes of package android.support.multidex:
//			MultiDexExtractor

public final class MultiDex
{
	private static final class V14
	{

		private static void install(ClassLoader classloader, List list, File file)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
		{
			classloader = ((ClassLoader) (MultiDex.findField(((Object) (classloader)), "pathList").get(((Object) (classloader)))));
		//    0    0:aload_0         
		//    1    1:ldc1            #30  <String "pathList">
		//    2    3:invokestatic    #34  <Method Field MultiDex.access$300(Object, String)>
		//    3    6:aload_0         
		//    4    7:invokevirtual   #40  <Method Object Field.get(Object)>
		//    5   10:astore_0        
			MultiDex.expandFieldArray(((Object) (classloader)), "dexElements", makeDexElements(((Object) (classloader)), new ArrayList(((java.util.Collection) (list))), file));
		//    6   11:aload_0         
		//    7   12:ldc1            #42  <String "dexElements">
		//    8   14:aload_0         
		//    9   15:new             #44  <Class ArrayList>
		//   10   18:dup             
		//   11   19:aload_1         
		//   12   20:invokespecial   #47  <Method void ArrayList(java.util.Collection)>
		//   13   23:aload_2         
		//   14   24:invokestatic    #51  <Method Object[] makeDexElements(Object, ArrayList, File)>
		//   15   27:invokestatic    #55  <Method void MultiDex.access$400(Object, String, Object[])>
		//   16   30:return          
		}

		private static Object[] makeDexElements(Object obj, ArrayList arraylist, File file)
			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
		{
			return (Object[])(Object[])MultiDex.findMethod(obj, "makeDexElements", new Class[] {
				java/util/ArrayList, java/io/File
			}).invoke(obj, new Object[] {
				arraylist, file
			});
		//    0    0:aload_0         
		//    1    1:ldc1            #58  <String "makeDexElements">
		//    2    3:iconst_2        
		//    3    4:anewarray       Class[]
		//    4    7:dup             
		//    5    8:iconst_0        
		//    6    9:ldc1            #44  <Class ArrayList>
		//    7   11:aastore         
		//    8   12:dup             
		//    9   13:iconst_1        
		//   10   14:ldc1            #62  <Class File>
		//   11   16:aastore         
		//   12   17:invokestatic    #66  <Method Method MultiDex.access$500(Object, String, Class[])>
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
		//   24   33:invokevirtual   #72  <Method Object Method.invoke(Object, Object[])>
		//   25   36:checkcast       #74  <Class Object[]>
		//   26   39:checkcast       #74  <Class Object[]>
		//   27   42:areturn         
		}


/*
		static void access$100(ClassLoader classloader, List list, File file)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
		{
			install(classloader, list, file);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokestatic    #27  <Method void install(ClassLoader, List, File)>
			return;
		//    4    6:return          
		}

*/

		private V14()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	private static final class V19
	{

		private static void install(ClassLoader classloader, List list, File file)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
		{
			Object obj = MultiDex.findField(((Object) (classloader)), "pathList").get(((Object) (classloader)));
		//    0    0:aload_0         
		//    1    1:ldc1            #30  <String "pathList">
		//    2    3:invokestatic    #34  <Method Field MultiDex.access$300(Object, String)>
		//    3    6:aload_0         
		//    4    7:invokevirtual   #40  <Method Object Field.get(Object)>
		//    5   10:astore          4
			ArrayList arraylist = new ArrayList();
		//    6   12:new             #42  <Class ArrayList>
		//    7   15:dup             
		//    8   16:invokespecial   #43  <Method void ArrayList()>
		//    9   19:astore_3        
			MultiDex.expandFieldArray(obj, "dexElements", makeDexElements(obj, new ArrayList(((java.util.Collection) (list))), file, arraylist));
		//   10   20:aload           4
		//   11   22:ldc1            #45  <String "dexElements">
		//   12   24:aload           4
		//   13   26:new             #42  <Class ArrayList>
		//   14   29:dup             
		//   15   30:aload_1         
		//   16   31:invokespecial   #48  <Method void ArrayList(java.util.Collection)>
		//   17   34:aload_2         
		//   18   35:aload_3         
		//   19   36:invokestatic    #52  <Method Object[] makeDexElements(Object, ArrayList, File, ArrayList)>
		//   20   39:invokestatic    #56  <Method void MultiDex.access$400(Object, String, Object[])>
			if(arraylist.size() > 0)
		//*  21   42:aload_3         
		//*  22   43:invokevirtual   #60  <Method int ArrayList.size()>
		//*  23   46:ifle            129
			{
				for(list = ((List) (arraylist.iterator())); ((Iterator) (list)).hasNext(); Log.w("MultiDex", "Exception in makeDexElement", ((Throwable) ((IOException)((Iterator) (list)).next()))));
		//   24   49:aload_3         
		//   25   50:invokevirtual   #64  <Method Iterator ArrayList.iterator()>
		//   26   53:astore_1        
		//   27   54:aload_1         
		//   28   55:invokeinterface #70  <Method boolean Iterator.hasNext()>
		//   29   60:ifeq            83
		//   30   63:ldc1            #72  <String "MultiDex">
		//   31   65:ldc1            #74  <String "Exception in makeDexElement">
		//   32   67:aload_1         
		//   33   68:invokeinterface #78  <Method Object Iterator.next()>
		//   34   73:checkcast       #80  <Class IOException>
		//   35   76:invokestatic    #86  <Method int Log.w(String, String, Throwable)>
		//   36   79:pop             
		//*  37   80:goto            54
				file = ((File) (MultiDex.findField(((Object) (classloader)), "dexElementsSuppressedExceptions")));
		//   38   83:aload_0         
		//   39   84:ldc1            #88  <String "dexElementsSuppressedExceptions">
		//   40   86:invokestatic    #34  <Method Field MultiDex.access$300(Object, String)>
		//   41   89:astore_2        
				IOException aioexception[] = (IOException[])(IOException[])((Field) (file)).get(((Object) (classloader)));
		//   42   90:aload_2         
		//   43   91:aload_0         
		//   44   92:invokevirtual   #40  <Method Object Field.get(Object)>
		//   45   95:checkcast       #90  <Class IOException[]>
		//   46   98:checkcast       #90  <Class IOException[]>
		//   47  101:astore          4
				if(aioexception == null)
		//*  48  103:aload           4
		//*  49  105:ifnonnull       130
				{
					list = ((List) ((IOException[])arraylist.toArray(((Object []) (new IOException[arraylist.size()])))));
		//   50  108:aload_3         
		//   51  109:aload_3         
		//   52  110:invokevirtual   #60  <Method int ArrayList.size()>
		//   53  113:anewarray       IOException[]
		//   54  116:invokevirtual   #94  <Method Object[] ArrayList.toArray(Object[])>
		//   55  119:checkcast       #90  <Class IOException[]>
		//   56  122:astore_1        
				} else
		//*  57  123:aload_2         
		//*  58  124:aload_0         
		//*  59  125:aload_1         
		//*  60  126:invokevirtual   #98  <Method void Field.set(Object, Object)>
		//*  61  129:return          
				{
					list = ((List) (new IOException[arraylist.size() + aioexception.length]));
		//   62  130:aload_3         
		//   63  131:invokevirtual   #60  <Method int ArrayList.size()>
		//   64  134:aload           4
		//   65  136:arraylength     
		//   66  137:iadd            
		//   67  138:anewarray       IOException[]
		//   68  141:astore_1        
					arraylist.toArray(((Object []) (list)));
		//   69  142:aload_3         
		//   70  143:aload_1         
		//   71  144:invokevirtual   #94  <Method Object[] ArrayList.toArray(Object[])>
		//   72  147:pop             
					System.arraycopy(((Object) (aioexception)), 0, ((Object) (list)), arraylist.size(), aioexception.length);
		//   73  148:aload           4
		//   74  150:iconst_0        
		//   75  151:aload_1         
		//   76  152:aload_3         
		//   77  153:invokevirtual   #60  <Method int ArrayList.size()>
		//   78  156:aload           4
		//   79  158:arraylength     
		//   80  159:invokestatic    #104 <Method void System.arraycopy(Object, int, Object, int, int)>
				}
				((Field) (file)).set(((Object) (classloader)), ((Object) (list)));
			}
		//*  81  162:goto            123
		}

		private static Object[] makeDexElements(Object obj, ArrayList arraylist, File file, ArrayList arraylist1)
			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
		{
			return (Object[])(Object[])MultiDex.findMethod(obj, "makeDexElements", new Class[] {
				java/util/ArrayList, java/io/File, java/util/ArrayList
			}).invoke(obj, new Object[] {
				arraylist, file, arraylist1
			});
		//    0    0:aload_0         
		//    1    1:ldc1            #107 <String "makeDexElements">
		//    2    3:iconst_3        
		//    3    4:anewarray       Class[]
		//    4    7:dup             
		//    5    8:iconst_0        
		//    6    9:ldc1            #42  <Class ArrayList>
		//    7   11:aastore         
		//    8   12:dup             
		//    9   13:iconst_1        
		//   10   14:ldc1            #111 <Class File>
		//   11   16:aastore         
		//   12   17:dup             
		//   13   18:iconst_2        
		//   14   19:ldc1            #42  <Class ArrayList>
		//   15   21:aastore         
		//   16   22:invokestatic    #115 <Method Method MultiDex.access$500(Object, String, Class[])>
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
		//   32   42:invokevirtual   #121 <Method Object Method.invoke(Object, Object[])>
		//   33   45:checkcast       #123 <Class Object[]>
		//   34   48:checkcast       #123 <Class Object[]>
		//   35   51:areturn         
		}


/*
		static void access$000(ClassLoader classloader, List list, File file)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
		{
			install(classloader, list, file);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokestatic    #27  <Method void install(ClassLoader, List, File)>
			return;
		//    4    6:return          
		}

*/

		private V19()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	private static final class V4
	{

		private static void install(ClassLoader classloader, List list)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException
		{
			int i = list.size();
		//    0    0:aload_1         
		//    1    1:invokeinterface #32  <Method int List.size()>
		//    2    6:istore_2        
			Field field = MultiDex.findField(((Object) (classloader)), "path");
		//    3    7:aload_0         
		//    4    8:ldc1            #34  <String "path">
		//    5   10:invokestatic    #38  <Method Field MultiDex.access$300(Object, String)>
		//    6   13:astore_3        
			StringBuilder stringbuilder = new StringBuilder((String)field.get(((Object) (classloader))));
		//    7   14:new             #40  <Class StringBuilder>
		//    8   17:dup             
		//    9   18:aload_3         
		//   10   19:aload_0         
		//   11   20:invokevirtual   #46  <Method Object Field.get(Object)>
		//   12   23:checkcast       #48  <Class String>
		//   13   26:invokespecial   #51  <Method void StringBuilder(String)>
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
		//*  28   56:invokeinterface #61  <Method ListIterator List.listIterator()>
		//*  29   61:astore_1        
		//*  30   62:aload_1         
		//*  31   63:invokeinterface #67  <Method boolean ListIterator.hasNext()>
		//*  32   68:ifeq            167
			{
				File file = (File)((ListIterator) (list)).next();
		//   33   71:aload_1         
		//   34   72:invokeinterface #71  <Method Object ListIterator.next()>
		//   35   77:checkcast       #53  <Class File>
		//   36   80:astore          9
				String s = file.getAbsolutePath();
		//   37   82:aload           9
		//   38   84:invokevirtual   #75  <Method String File.getAbsolutePath()>
		//   39   87:astore          10
				stringbuilder.append(':').append(s);
		//   40   89:aload           4
		//   41   91:bipush          58
		//   42   93:invokevirtual   #79  <Method StringBuilder StringBuilder.append(char)>
		//   43   96:aload           10
		//   44   98:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
		//   45  101:pop             
				int j = ((ListIterator) (list)).previousIndex();
		//   46  102:aload_1         
		//   47  103:invokeinterface #85  <Method int ListIterator.previousIndex()>
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
		//   59  124:new             #55  <Class ZipFile>
		//   60  127:dup             
		//   61  128:aload           9
		//   62  130:invokespecial   #88  <Method void ZipFile(File)>
		//   63  133:aastore         
				adexfile[j] = DexFile.loadDex(s, (new StringBuilder()).append(s).append(".dex").toString(), 0);
		//   64  134:aload           8
		//   65  136:iload_2         
		//   66  137:aload           10
		//   67  139:new             #40  <Class StringBuilder>
		//   68  142:dup             
		//   69  143:invokespecial   #89  <Method void StringBuilder()>
		//   70  146:aload           10
		//   71  148:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
		//   72  151:ldc1            #91  <String ".dex">
		//   73  153:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
		//   74  156:invokevirtual   #94  <Method String StringBuilder.toString()>
		//   75  159:iconst_0        
		//   76  160:invokestatic    #98  <Method DexFile DexFile.loadDex(String, String, int)>
		//   77  163:aastore         
			}

		//*  78  164:goto            62
			field.set(((Object) (classloader)), ((Object) (stringbuilder.toString())));
		//   79  167:aload_3         
		//   80  168:aload_0         
		//   81  169:aload           4
		//   82  171:invokevirtual   #94  <Method String StringBuilder.toString()>
		//   83  174:invokevirtual   #102 <Method void Field.set(Object, Object)>
			MultiDex.expandFieldArray(((Object) (classloader)), "mPaths", ((Object []) (as)));
		//   84  177:aload_0         
		//   85  178:ldc1            #104 <String "mPaths">
		//   86  180:aload           5
		//   87  182:invokestatic    #108 <Method void MultiDex.access$400(Object, String, Object[])>
			MultiDex.expandFieldArray(((Object) (classloader)), "mFiles", ((Object []) (afile)));
		//   88  185:aload_0         
		//   89  186:ldc1            #110 <String "mFiles">
		//   90  188:aload           6
		//   91  190:invokestatic    #108 <Method void MultiDex.access$400(Object, String, Object[])>
			MultiDex.expandFieldArray(((Object) (classloader)), "mZips", ((Object []) (azipfile)));
		//   92  193:aload_0         
		//   93  194:ldc1            #112 <String "mZips">
		//   94  196:aload           7
		//   95  198:invokestatic    #108 <Method void MultiDex.access$400(Object, String, Object[])>
			MultiDex.expandFieldArray(((Object) (classloader)), "mDexs", ((Object []) (adexfile)));
		//   96  201:aload_0         
		//   97  202:ldc1            #114 <String "mDexs">
		//   98  204:aload           8
		//   99  206:invokestatic    #108 <Method void MultiDex.access$400(Object, String, Object[])>
		//  100  209:return          
		}


/*
		static void access$200(ClassLoader classloader, List list)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException
		{
			install(classloader, list);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #25  <Method void install(ClassLoader, List)>
			return;
		//    3    5:return          
		}

*/

		private V4()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
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
	//*   5   13:ifeq            33
			if(!MultiDexExtractor.verifyZipFile((File)((Iterator) (list)).next()))
	//*   6   16:aload_0         
	//*   7   17:invokeinterface #122 <Method Object Iterator.next()>
	//*   8   22:checkcast       #50  <Class File>
	//*   9   25:invokestatic    #128 <Method boolean MultiDexExtractor.verifyZipFile(File)>
	//*  10   28:ifne            7
				return false;
	//   11   31:iconst_0        
	//   12   32:ireturn         

		return true;
	//   13   33:iconst_1        
	//   14   34:ireturn         
	}

	private static void clearOldDexDir(Context context)
		throws Exception
	{
		File afile[];
label0:
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
	//*   9   18:ifeq            96
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
				afile = ((File) (context)).listFiles();
	//   24   54:aload_0         
	//   25   55:invokevirtual   #163 <Method File[] File.listFiles()>
	//   26   58:astore_3        
				if(afile != null)
					break label0;
	//   27   59:aload_3         
	//   28   60:ifnonnull       97
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
			}
			return;
	//   43   96:return          
		}
		int j = afile.length;
	//   44   97:aload_3         
	//   45   98:arraylength     
	//   46   99:istore_2        
		int i = 0;
	//   47  100:iconst_0        
	//   48  101:istore_1        
		while(i < j) 
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
	//*  75  159:ifne            198
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
	//*  88  191:iload_1         
	//*  89  192:iconst_1        
	//*  90  193:iadd            
	//*  91  194:istore_1        
	//*  92  195:goto            102
				Log.i("MultiDex", (new StringBuilder()).append("Deleted old file ").append(file.getPath()).toString());
	//   93  198:ldc1            #28  <String "MultiDex">
	//   94  200:new             #39  <Class StringBuilder>
	//   95  203:dup             
	//   96  204:invokespecial   #42  <Method void StringBuilder()>
	//   97  207:ldc1            #186 <String "Deleted old file ">
	//   98  209:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   99  212:aload           4
	//  100  214:invokevirtual   #151 <Method String File.getPath()>
	//  101  217:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//  102  220:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  103  223:invokestatic    #159 <Method int Log.i(String, String)>
	//  104  226:pop             
			i++;
		}
	//* 105  227:goto            191
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
		} else
		{
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
			return;
	//  134  294:return          
		}
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
	//*   6   10:aload_1         
	//*   7   11:ifnull          18
	//*   8   14:aload_0         
	//*   9   15:ifnonnull       33
	//*  10   18:aconst_null     
	//*  11   19:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  12   20:astore_0        
		{
			Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", ((Throwable) (context)));
	//   13   21:ldc1            #28  <String "MultiDex">
	//   14   23:ldc2            #280 <String "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.">
	//   15   26:aload_0         
	//   16   27:invokestatic    #283 <Method int Log.w(String, String, Throwable)>
	//   17   30:pop             
			return null;
	//   18   31:aconst_null     
	//   19   32:areturn         
		}
		if(packagemanager == null || context == null)
			return null;
		else
			return packagemanager.getApplicationInfo(((String) (context)), 128);
	//   20   33:aload_1         
	//   21   34:aload_0         
	//   22   35:sipush          128
	//   23   38:invokevirtual   #288 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   24   41:areturn         
	}

	public static void install(Context context)
	{
		Log.i("MultiDex", "install");
	//    0    0:ldc1            #28  <String "MultiDex">
	//    1    2:ldc2            #292 <String "install">
	//    2    5:invokestatic    #159 <Method int Log.i(String, String)>
	//    3    8:pop             
		if(!IS_VM_MULTIDEX_CAPABLE) goto _L2; else goto _L1
	//    4    9:getstatic       #78  <Field boolean IS_VM_MULTIDEX_CAPABLE>
	//    5   12:ifeq            25
_L1:
		Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
	//    6   15:ldc1            #28  <String "MultiDex">
	//    7   17:ldc2            #294 <String "VM has multidex support, MultiDex support library is disabled.">
	//    8   20:invokestatic    #159 <Method int Log.i(String, String)>
	//    9   23:pop             
_L4:
		return;
	//   10   24:return          
_L2:
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
	//   34   82:astore_2        
		if(applicationinfo == null) goto _L4; else goto _L3
	//   35   83:aload_2         
	//   36   84:ifnull          24
_L3:
		Object obj;
		synchronized(installedApk)
	//*  37   87:getstatic       #64  <Field Set installedApk>
	//*  38   90:astore_1        
	//*  39   91:aload_1         
	//*  40   92:monitorenter    
		{
			obj = ((Object) (applicationinfo.sourceDir));
	//   41   93:aload_2         
	//   42   94:getfield        #316 <Field String ApplicationInfo.sourceDir>
	//   43   97:astore_3        
			if(!installedApk.contains(obj))
				break MISSING_BLOCK_LABEL_165;
	//   44   98:getstatic       #64  <Field Set installedApk>
	//   45  101:aload_3         
	//   46  102:invokeinterface #322 <Method boolean Set.contains(Object)>
	//   47  107:ifeq            165
		}
	//   48  110:aload_1         
	//   49  111:monitorexit     
		return;
	//   50  112:return          
		context;
	//   51  113:astore_0        
		set;
	//   52  114:aload_1         
		JVM INSTR monitorexit ;
	//   53  115:monitorexit     
		try
		{
			throw context;
	//   54  116:aload_0         
	//   55  117:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  56  118:astore_0        
		{
			Log.e("MultiDex", "Multidex installation failure", ((Throwable) (context)));
	//   57  119:ldc1            #28  <String "MultiDex">
	//   58  121:ldc2            #324 <String "Multidex installation failure">
	//   59  124:aload_0         
	//   60  125:invokestatic    #327 <Method int Log.e(String, String, Throwable)>
	//   61  128:pop             
		}
		throw new RuntimeException((new StringBuilder()).append("Multi dex installation failed (").append(((Exception) (context)).getMessage()).append(").").toString());
	//   62  129:new             #271 <Class RuntimeException>
	//   63  132:dup             
	//   64  133:new             #39  <Class StringBuilder>
	//   65  136:dup             
	//   66  137:invokespecial   #42  <Method void StringBuilder()>
	//   67  140:ldc2            #329 <String "Multi dex installation failed (">
	//   68  143:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   69  146:aload_0         
	//   70  147:invokevirtual   #332 <Method String Exception.getMessage()>
	//   71  150:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   72  153:ldc1            #153 <String ").">
	//   73  155:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   74  158:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   75  161:invokespecial   #309 <Method void RuntimeException(String)>
	//   76  164:athrow          
		installedApk.add(obj);
	//   77  165:getstatic       #64  <Field Set installedApk>
	//   78  168:aload_3         
	//   79  169:invokeinterface #335 <Method boolean Set.add(Object)>
	//   80  174:pop             
		if(android.os.Build.VERSION.SDK_INT > 20)
	//*  81  175:getstatic       #299 <Field int android.os.Build$VERSION.SDK_INT>
	//*  82  178:bipush          20
	//*  83  180:icmple          254
			Log.w("MultiDex", (new StringBuilder()).append("MultiDex is not guaranteed to work in SDK version ").append(android.os.Build.VERSION.SDK_INT).append(": SDK version higher than ").append(20).append(" should be backed by ").append("runtime with built-in multidex capabilty but it's not the ").append("case here: java.vm.version=\"").append(System.getProperty("java.vm.version")).append("\"").toString());
	//   84  183:ldc1            #28  <String "MultiDex">
	//   85  185:new             #39  <Class StringBuilder>
	//   86  188:dup             
	//   87  189:invokespecial   #42  <Method void StringBuilder()>
	//   88  192:ldc2            #337 <String "MultiDex is not guaranteed to work in SDK version ">
	//   89  195:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   90  198:getstatic       #299 <Field int android.os.Build$VERSION.SDK_INT>
	//   91  201:invokevirtual   #304 <Method StringBuilder StringBuilder.append(int)>
	//   92  204:ldc2            #339 <String ": SDK version higher than ">
	//   93  207:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   94  210:bipush          20
	//   95  212:invokevirtual   #304 <Method StringBuilder StringBuilder.append(int)>
	//   96  215:ldc2            #341 <String " should be backed by ">
	//   97  218:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   98  221:ldc2            #343 <String "runtime with built-in multidex capabilty but it's not the ">
	//   99  224:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//  100  227:ldc2            #345 <String "case here: java.vm.version=\"">
	//  101  230:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//  102  233:ldc1            #66  <String "java.vm.version">
	//  103  235:invokestatic    #72  <Method String System.getProperty(String)>
	//  104  238:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//  105  241:ldc2            #347 <String "\"">
	//  106  244:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//  107  247:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  108  250:invokestatic    #168 <Method int Log.w(String, String)>
	//  109  253:pop             
		obj = ((Object) (context.getClassLoader()));
	//  110  254:aload_0         
	//  111  255:invokevirtual   #351 <Method ClassLoader Context.getClassLoader()>
	//  112  258:astore_3        
		if(obj != null)
			break MISSING_BLOCK_LABEL_289;
	//  113  259:aload_3         
	//  114  260:ifnonnull       289
		Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
	//  115  263:ldc1            #28  <String "MultiDex">
	//  116  265:ldc2            #353 <String "Context class loader is null. Must be running in test mode. Skip patching.">
	//  117  268:invokestatic    #355 <Method int Log.e(String, String)>
	//  118  271:pop             
		set;
	//  119  272:aload_1         
		JVM INSTR monitorexit ;
	//  120  273:monitorexit     
		return;
	//  121  274:return          
		context;
	//  122  275:astore_0        
		Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", ((Throwable) (context)));
	//  123  276:ldc1            #28  <String "MultiDex">
	//  124  278:ldc2            #357 <String "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.">
	//  125  281:aload_0         
	//  126  282:invokestatic    #283 <Method int Log.w(String, String, Throwable)>
	//  127  285:pop             
		set;
	//  128  286:aload_1         
		JVM INSTR monitorexit ;
	//  129  287:monitorexit     
		return;
	//  130  288:return          
		clearOldDexDir(context);
	//  131  289:aload_0         
	//  132  290:invokestatic    #359 <Method void clearOldDexDir(Context)>
_L7:
		Object obj1;
		List list;
		obj1 = ((Object) (new File(applicationinfo.dataDir, SECONDARY_FOLDER_NAME)));
	//  133  293:new             #50  <Class File>
	//  134  296:dup             
	//  135  297:aload_2         
	//  136  298:getfield        #362 <Field String ApplicationInfo.dataDir>
	//  137  301:getstatic       #59  <Field String SECONDARY_FOLDER_NAME>
	//  138  304:invokespecial   #365 <Method void File(String, String)>
	//  139  307:astore          4
		list = MultiDexExtractor.load(context, applicationinfo, ((File) (obj1)), false);
	//  140  309:aload_0         
	//  141  310:aload_2         
	//  142  311:aload           4
	//  143  313:iconst_0        
	//  144  314:invokestatic    #369 <Method List MultiDexExtractor.load(Context, ApplicationInfo, File, boolean)>
	//  145  317:astore          5
		if(!checkValidZipFiles(list)) goto _L6; else goto _L5
	//  146  319:aload           5
	//  147  321:invokestatic    #371 <Method boolean checkValidZipFiles(List)>
	//  148  324:ifeq            363
_L5:
		installSecondaryDexes(((ClassLoader) (obj)), ((File) (obj1)), list);
	//  149  327:aload_3         
	//  150  328:aload           4
	//  151  330:aload           5
	//  152  332:invokestatic    #375 <Method void installSecondaryDexes(ClassLoader, File, List)>
_L8:
		set;
	//  153  335:aload_1         
		JVM INSTR monitorexit ;
	//  154  336:monitorexit     
		Log.i("MultiDex", "install done");
	//  155  337:ldc1            #28  <String "MultiDex">
	//  156  339:ldc2            #377 <String "install done">
	//  157  342:invokestatic    #159 <Method int Log.i(String, String)>
	//  158  345:pop             
		return;
	//  159  346:return          
		obj1;
	//  160  347:astore          4
		Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", ((Throwable) (obj1)));
	//  161  349:ldc1            #28  <String "MultiDex">
	//  162  351:ldc2            #379 <String "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.">
	//  163  354:aload           4
	//  164  356:invokestatic    #283 <Method int Log.w(String, String, Throwable)>
	//  165  359:pop             
		  goto _L7
	//* 166  360:goto            293
_L6:
label0:
		{
			Log.w("MultiDex", "Files were not valid zip files.  Forcing a reload.");
	//  167  363:ldc1            #28  <String "MultiDex">
	//  168  365:ldc2            #381 <String "Files were not valid zip files.  Forcing a reload.">
	//  169  368:invokestatic    #168 <Method int Log.w(String, String)>
	//  170  371:pop             
			context = ((Context) (MultiDexExtractor.load(context, applicationinfo, ((File) (obj1)), true)));
	//  171  372:aload_0         
	//  172  373:aload_2         
	//  173  374:aload           4
	//  174  376:iconst_1        
	//  175  377:invokestatic    #369 <Method List MultiDexExtractor.load(Context, ApplicationInfo, File, boolean)>
	//  176  380:astore_0        
			if(!checkValidZipFiles(((List) (context))))
				break label0;
	//  177  381:aload_0         
	//  178  382:invokestatic    #371 <Method boolean checkValidZipFiles(List)>
	//  179  385:ifeq            398
			installSecondaryDexes(((ClassLoader) (obj)), ((File) (obj1)), ((List) (context)));
	//  180  388:aload_3         
	//  181  389:aload           4
	//  182  391:aload_0         
	//  183  392:invokestatic    #375 <Method void installSecondaryDexes(ClassLoader, File, List)>
		}
		  goto _L8
	//* 184  395:goto            335
		throw new RuntimeException("Zip files were not valid.");
	//  185  398:new             #271 <Class RuntimeException>
	//  186  401:dup             
	//  187  402:ldc2            #383 <String "Zip files were not valid.">
	//  188  405:invokespecial   #309 <Method void RuntimeException(String)>
	//  189  408:athrow          
		  goto _L7
	}

	private static void installSecondaryDexes(ClassLoader classloader, File file, List list)
		throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException
	{
label0:
		{
			if(!list.isEmpty())
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #390 <Method boolean List.isEmpty()>
	//*   2    6:ifne            23
			{
				if(android.os.Build.VERSION.SDK_INT < 19)
					break label0;
	//    3    9:getstatic       #299 <Field int android.os.Build$VERSION.SDK_INT>
	//    4   12:bipush          19
	//    5   14:icmplt          24
				V19.install(classloader, list, file);
	//    6   17:aload_0         
	//    7   18:aload_2         
	//    8   19:aload_1         
	//    9   20:invokestatic    #394 <Method void MultiDex$V19.access$000(ClassLoader, List, File)>
			}
			return;
	//   10   23:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*  11   24:getstatic       #299 <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   27:bipush          14
	//*  13   29:icmplt          39
		{
			V14.install(classloader, list, file);
	//   14   32:aload_0         
	//   15   33:aload_2         
	//   16   34:aload_1         
	//   17   35:invokestatic    #397 <Method void MultiDex$V14.access$100(ClassLoader, List, File)>
			return;
	//   18   38:return          
		} else
		{
			V4.install(classloader, list);
	//   19   39:aload_0         
	//   20   40:aload_2         
	//   21   41:invokestatic    #401 <Method void MultiDex$V4.access$200(ClassLoader, List)>
			return;
	//   22   44:return          
		}
	}

	static boolean isVMMultidexCapable(String s)
	{
		boolean flag;
		boolean flag1;
		Object obj;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		flag = flag1;
	//    2    3:iload           4
	//    3    5:istore_3        
		if(s == null)
			break MISSING_BLOCK_LABEL_70;
	//    4    6:aload_0         
	//    5    7:ifnull          70
		obj = ((Object) (Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(((CharSequence) (s)))));
	//    6   10:ldc2            #406 <String "(\\d+)\\.(\\d+)(\\.\\d+)?">
	//    7   13:invokestatic    #412 <Method Pattern Pattern.compile(String)>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #416 <Method Matcher Pattern.matcher(CharSequence)>
	//   10   20:astore          5
		flag = flag1;
	//   11   22:iload           4
	//   12   24:istore_3        
		if(!((Matcher) (obj)).matches())
			break MISSING_BLOCK_LABEL_70;
	//   13   25:aload           5
	//   14   27:invokevirtual   #421 <Method boolean Matcher.matches()>
	//   15   30:ifeq            70
		int i;
		int j;
		i = Integer.parseInt(((Matcher) (obj)).group(1));
	//   16   33:aload           5
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #425 <Method String Matcher.group(int)>
	//   19   39:invokestatic    #431 <Method int Integer.parseInt(String)>
	//   20   42:istore_1        
		j = Integer.parseInt(((Matcher) (obj)).group(2));
	//   21   43:aload           5
	//   22   45:iconst_2        
	//   23   46:invokevirtual   #425 <Method String Matcher.group(int)>
	//   24   49:invokestatic    #431 <Method int Integer.parseInt(String)>
	//   25   52:istore_2        
		if(i > 2 || i == 2 && j >= 1)
	//*  26   53:iload_1         
	//*  27   54:iconst_2        
	//*  28   55:icmpgt          68
	//*  29   58:iload_1         
	//*  30   59:iconst_2        
	//*  31   60:icmpne          114
	//*  32   63:iload_2         
	//*  33   64:iconst_1        
	//*  34   65:icmplt          114
			flag = true;
	//   35   68:iconst_1        
	//   36   69:istore_3        
		else
	//*  37   70:new             #39  <Class StringBuilder>
	//*  38   73:dup             
	//*  39   74:invokespecial   #42  <Method void StringBuilder()>
	//*  40   77:ldc2            #433 <String "VM with version ">
	//*  41   80:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//*  42   83:aload_0         
	//*  43   84:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//*  44   87:astore          5
	//*  45   89:iload_3         
	//*  46   90:ifeq            119
	//*  47   93:ldc2            #435 <String " has multidex support">
	//*  48   96:astore_0        
	//*  49   97:ldc1            #28  <String "MultiDex">
	//*  50   99:aload           5
	//*  51  101:aload_0         
	//*  52  102:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//*  53  105:invokevirtual   #57  <Method String StringBuilder.toString()>
	//*  54  108:invokestatic    #159 <Method int Log.i(String, String)>
	//*  55  111:pop             
	//*  56  112:iload_3         
	//*  57  113:ireturn         
			flag = false;
	//   58  114:iconst_0        
	//   59  115:istore_3        
_L2:
		obj = ((Object) ((new StringBuilder()).append("VM with version ").append(s)));
		if(flag)
			s = " has multidex support";
		else
	//*  60  116:goto            70
			s = " does not have multidex support";
	//   61  119:ldc2            #437 <String " does not have multidex support">
	//   62  122:astore_0        
		Log.i("MultiDex", ((StringBuilder) (obj)).append(s).toString());
		return flag;
	//*  63  123:goto            97
		NumberFormatException numberformatexception;
		numberformatexception;
	//   64  126:astore          5
		flag = flag1;
	//   65  128:iload           4
	//   66  130:istore_3        
		if(true) goto _L2; else goto _L1
	//   67  131:goto            70
_L1:
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
