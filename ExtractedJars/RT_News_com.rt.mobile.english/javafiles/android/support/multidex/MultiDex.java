// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
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

		static void install(ClassLoader classloader, List list)
			throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException
		{
			classloader = ((ClassLoader) (MultiDex.findField(((Object) (classloader)), "pathList").get(((Object) (classloader)))));
		//    0    0:aload_0         
		//    1    1:ldc1            #77  <String "pathList">
		//    2    3:invokestatic    #81  <Method Field MultiDex.access$000(Object, String)>
		//    3    6:aload_0         
		//    4    7:invokevirtual   #87  <Method Object Field.get(Object)>
		//    5   10:astore_0        
			list = ((List) ((new V14()).makeDexElements(list)));
		//    6   11:new             #2   <Class MultiDex$V14>
		//    7   14:dup             
		//    8   15:invokespecial   #88  <Method void MultiDex$V14()>
		//    9   18:aload_1         
		//   10   19:invokespecial   #92  <Method Object[] makeDexElements(List)>
		//   11   22:astore_1        
			try
			{
				MultiDex.expandFieldArray(((Object) (classloader)), "dexElements", ((Object []) (list)));
		//   12   23:aload_0         
		//   13   24:ldc1            #94  <String "dexElements">
		//   14   26:aload_1         
		//   15   27:invokestatic    #98  <Method void MultiDex.access$100(Object, String, Object[])>
				return;
		//   16   30:return          
			}
			catch(NoSuchFieldException nosuchfieldexception)
		//*  17   31:astore_2        
			{
				Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", ((Throwable) (nosuchfieldexception)));
		//   18   32:ldc1            #100 <String "MultiDex">
		//   19   34:ldc1            #102 <String "Failed find field 'dexElements' attempting 'pathElements'">
		//   20   36:aload_2         
		//   21   37:invokestatic    #108 <Method int Log.w(String, String, Throwable)>
		//   22   40:pop             
			}
			MultiDex.expandFieldArray(((Object) (classloader)), "pathElements", ((Object []) (list)));
		//   23   41:aload_0         
		//   24   42:ldc1            #110 <String "pathElements">
		//   25   44:aload_1         
		//   26   45:invokestatic    #98  <Method void MultiDex.access$100(Object, String, Object[])>
		//   27   48:return          
		}

		private Object[] makeDexElements(List list)
			throws IOException, SecurityException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException
		{
			Object aobj[] = new Object[list.size()];
		//    0    0:aload_1         
		//    1    1:invokeinterface #117 <Method int List.size()>
		//    2    6:anewarray       Object[]
		//    3    9:astore_3        
			for(int i = 0; i < aobj.length; i++)
		//*   4   10:iconst_0        
		//*   5   11:istore_2        
		//*   6   12:iload_2         
		//*   7   13:aload_3         
		//*   8   14:arraylength     
		//*   9   15:icmpge          65
			{
				File file = (File)list.get(i);
		//   10   18:aload_1         
		//   11   19:iload_2         
		//   12   20:invokeinterface #120 <Method Object List.get(int)>
		//   13   25:checkcast       #122 <Class File>
		//   14   28:astore          4
				aobj[i] = elementConstructor.newInstance(file, DexFile.loadDex(file.getPath(), optimizedPathFor(file), 0));
		//   15   30:aload_3         
		//   16   31:iload_2         
		//   17   32:aload_0         
		//   18   33:getfield        #60  <Field MultiDex$V14$ElementConstructor elementConstructor>
		//   19   36:aload           4
		//   20   38:aload           4
		//   21   40:invokevirtual   #126 <Method String File.getPath()>
		//   22   43:aload           4
		//   23   45:invokestatic    #130 <Method String optimizedPathFor(File)>
		//   24   48:iconst_0        
		//   25   49:invokestatic    #136 <Method DexFile DexFile.loadDex(String, String, int)>
		//   26   52:invokeinterface #140 <Method Object MultiDex$V14$ElementConstructor.newInstance(File, DexFile)>
		//   27   57:aastore         
			}

		//   28   58:iload_2         
		//   29   59:iconst_1        
		//   30   60:iadd            
		//   31   61:istore_2        
		//*  32   62:goto            12
			return aobj;
		//   33   65:aload_3         
		//   34   66:areturn         
		}

		private static String optimizedPathFor(File file)
		{
			File file1 = file.getParentFile();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #145 <Method File File.getParentFile()>
		//    2    4:astore_1        
			file = ((File) (file.getName()));
		//    3    5:aload_0         
		//    4    6:invokevirtual   #148 <Method String File.getName()>
		//    5    9:astore_0        
			StringBuilder stringbuilder = new StringBuilder();
		//    6   10:new             #150 <Class StringBuilder>
		//    7   13:dup             
		//    8   14:invokespecial   #151 <Method void StringBuilder()>
		//    9   17:astore_2        
			stringbuilder.append(((String) (file)).substring(0, ((String) (file)).length() - EXTRACTED_SUFFIX_LENGTH));
		//   10   18:aload_2         
		//   11   19:aload_0         
		//   12   20:iconst_0        
		//   13   21:aload_0         
		//   14   22:invokevirtual   #33  <Method int String.length()>
		//   15   25:getstatic       #35  <Field int EXTRACTED_SUFFIX_LENGTH>
		//   16   28:isub            
		//   17   29:invokevirtual   #155 <Method String String.substring(int, int)>
		//   18   32:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
		//   19   35:pop             
			stringbuilder.append(".dex");
		//   20   36:aload_2         
		//   21   37:ldc1            #161 <String ".dex">
		//   22   39:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
		//   23   42:pop             
			return (new File(file1, stringbuilder.toString())).getPath();
		//   24   43:new             #122 <Class File>
		//   25   46:dup             
		//   26   47:aload_1         
		//   27   48:aload_2         
		//   28   49:invokevirtual   #164 <Method String StringBuilder.toString()>
		//   29   52:invokespecial   #167 <Method void File(File, String)>
		//   30   55:invokevirtual   #126 <Method String File.getPath()>
		//   31   58:areturn         
		}

		private static final int EXTRACTED_SUFFIX_LENGTH = ".zip".length();
		private final ElementConstructor elementConstructor;

		static 
		{
		//    0    0:ldc1            #27  <String ".zip">
		//    1    2:invokevirtual   #33  <Method int String.length()>
		//    2    5:putstatic       #35  <Field int EXTRACTED_SUFFIX_LENGTH>
		//*   3    8:return          
		}

		private V14()
			throws ClassNotFoundException, SecurityException, NoSuchMethodException
		{
			NoSuchMethodException nosuchmethodexception;
		//    0    0:aload_0         
		//    1    1:invokespecial   #45  <Method void Object()>
			Class class1 = Class.forName("dalvik.system.DexPathList$Element");
		//    2    4:ldc1            #47  <String "dalvik.system.DexPathList$Element">
		//    3    6:invokestatic    #53  <Method Class Class.forName(String)>
		//    4    9:astore_2        
			Object obj;
			try
			{
				obj = ((Object) (new ICSElementConstructor(class1)));
		//    5   10:new             #12  <Class MultiDex$V14$ICSElementConstructor>
		//    6   13:dup             
		//    7   14:aload_2         
		//    8   15:invokespecial   #56  <Method void MultiDex$V14$ICSElementConstructor(Class)>
		//    9   18:astore_1        
			}
		//*  10   19:goto            43
		//*  11   22:new             #15  <Class MultiDex$V14$JBMR11ElementConstructor>
		//*  12   25:dup             
		//*  13   26:aload_2         
		//*  14   27:invokespecial   #57  <Method void MultiDex$V14$JBMR11ElementConstructor(Class)>
		//*  15   30:astore_1        
		//*  16   31:goto            43
		//*  17   34:new             #18  <Class MultiDex$V14$JBMR2ElementConstructor>
		//*  18   37:dup             
		//*  19   38:aload_2         
		//*  20   39:invokespecial   #58  <Method void MultiDex$V14$JBMR2ElementConstructor(Class)>
		//*  21   42:astore_1        
		//*  22   43:aload_0         
		//*  23   44:aload_1         
		//*  24   45:putfield        #60  <Field MultiDex$V14$ElementConstructor elementConstructor>
		//*  25   48:return          
			// Misplaced declaration of an exception variable
			catch(NoSuchMethodException nosuchmethodexception)
			{
				try
				{
					obj = ((Object) (new JBMR11ElementConstructor(class1)));
				}
		//*  26   49:astore_1        
		//*  27   50:goto            22
				// Misplaced declaration of an exception variable
				catch(NoSuchMethodException nosuchmethodexception)
				{
					obj = ((Object) (new JBMR2ElementConstructor(class1)));
				}
			}
			elementConstructor = ((ElementConstructor) (obj));
		//*  28   53:astore_1        
		//*  29   54:goto            34
		}
	}

	private static interface V14.ElementConstructor
	{

		public abstract Object newInstance(File file, DexFile dexfile)
			throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
	}

	private static class V14.ICSElementConstructor
		implements V14.ElementConstructor
	{

		public Object newInstance(File file, DexFile dexfile)
			throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException
		{
			return elementConstructor.newInstance(new Object[] {
				file, new ZipFile(file), dexfile
			});
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field Constructor elementConstructor>
		//    2    4:iconst_3        
		//    3    5:anewarray       Object[]
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:aload_1         
		//    7   11:aastore         
		//    8   12:dup             
		//    9   13:iconst_1        
		//   10   14:new             #30  <Class ZipFile>
		//   11   17:dup             
		//   12   18:aload_1         
		//   13   19:invokespecial   #63  <Method void ZipFile(File)>
		//   14   22:aastore         
		//   15   23:dup             
		//   16   24:iconst_2        
		//   17   25:aload_2         
		//   18   26:aastore         
		//   19   27:invokevirtual   #66  <Method Object Constructor.newInstance(Object[])>
		//   20   30:areturn         
		}

		private final Constructor elementConstructor;

		V14.ICSElementConstructor(Class class1)
			throws SecurityException, NoSuchMethodException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			elementConstructor = class1.getConstructor(new Class[] {
				java/io/File, java/util/zip/ZipFile, dalvik/system/DexFile
			});
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:iconst_3        
		//    5    7:anewarray       Class[]
		//    6   10:dup             
		//    7   11:iconst_0        
		//    8   12:ldc1            #28  <Class File>
		//    9   14:aastore         
		//   10   15:dup             
		//   11   16:iconst_1        
		//   12   17:ldc1            #30  <Class ZipFile>
		//   13   19:aastore         
		//   14   20:dup             
		//   15   21:iconst_2        
		//   16   22:ldc1            #32  <Class DexFile>
		//   17   24:aastore         
		//   18   25:invokevirtual   #36  <Method Constructor Class.getConstructor(Class[])>
		//   19   28:putfield        #38  <Field Constructor elementConstructor>
			elementConstructor.setAccessible(true);
		//   20   31:aload_0         
		//   21   32:getfield        #38  <Field Constructor elementConstructor>
		//   22   35:iconst_1        
		//   23   36:invokevirtual   #44  <Method void Constructor.setAccessible(boolean)>
		//   24   39:return          
		}
	}

	private static class V14.JBMR11ElementConstructor
		implements V14.ElementConstructor
	{

		public Object newInstance(File file, DexFile dexfile)
			throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException
		{
			return elementConstructor.newInstance(new Object[] {
				file, file, dexfile
			});
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field Constructor elementConstructor>
		//    2    4:iconst_3        
		//    3    5:anewarray       Object[]
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:aload_1         
		//    7   11:aastore         
		//    8   12:dup             
		//    9   13:iconst_1        
		//   10   14:aload_1         
		//   11   15:aastore         
		//   12   16:dup             
		//   13   17:iconst_2        
		//   14   18:aload_2         
		//   15   19:aastore         
		//   16   20:invokevirtual   #59  <Method Object Constructor.newInstance(Object[])>
		//   17   23:areturn         
		}

		private final Constructor elementConstructor;

		V14.JBMR11ElementConstructor(Class class1)
			throws SecurityException, NoSuchMethodException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			elementConstructor = class1.getConstructor(new Class[] {
				java/io/File, java/io/File, dalvik/system/DexFile
			});
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:iconst_3        
		//    5    7:anewarray       Class[]
		//    6   10:dup             
		//    7   11:iconst_0        
		//    8   12:ldc1            #28  <Class File>
		//    9   14:aastore         
		//   10   15:dup             
		//   11   16:iconst_1        
		//   12   17:ldc1            #28  <Class File>
		//   13   19:aastore         
		//   14   20:dup             
		//   15   21:iconst_2        
		//   16   22:ldc1            #30  <Class DexFile>
		//   17   24:aastore         
		//   18   25:invokevirtual   #34  <Method Constructor Class.getConstructor(Class[])>
		//   19   28:putfield        #36  <Field Constructor elementConstructor>
			elementConstructor.setAccessible(true);
		//   20   31:aload_0         
		//   21   32:getfield        #36  <Field Constructor elementConstructor>
		//   22   35:iconst_1        
		//   23   36:invokevirtual   #42  <Method void Constructor.setAccessible(boolean)>
		//   24   39:return          
		}
	}

	private static class V14.JBMR2ElementConstructor
		implements V14.ElementConstructor
	{

		public Object newInstance(File file, DexFile dexfile)
			throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException
		{
			return elementConstructor.newInstance(new Object[] {
				file, Boolean.FALSE, file, dexfile
			});
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field Constructor elementConstructor>
		//    2    4:iconst_4        
		//    3    5:anewarray       Object[]
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:aload_1         
		//    7   11:aastore         
		//    8   12:dup             
		//    9   13:iconst_1        
		//   10   14:getstatic       #66  <Field Boolean Boolean.FALSE>
		//   11   17:aastore         
		//   12   18:dup             
		//   13   19:iconst_2        
		//   14   20:aload_1         
		//   15   21:aastore         
		//   16   22:dup             
		//   17   23:iconst_3        
		//   18   24:aload_2         
		//   19   25:aastore         
		//   20   26:invokevirtual   #69  <Method Object Constructor.newInstance(Object[])>
		//   21   29:areturn         
		}

		private final Constructor elementConstructor;

		V14.JBMR2ElementConstructor(Class class1)
			throws SecurityException, NoSuchMethodException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			elementConstructor = class1.getConstructor(new Class[] {
				java/io/File, Boolean.TYPE, java/io/File, dalvik/system/DexFile
			});
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:iconst_4        
		//    5    7:anewarray       Class[]
		//    6   10:dup             
		//    7   11:iconst_0        
		//    8   12:ldc1            #28  <Class File>
		//    9   14:aastore         
		//   10   15:dup             
		//   11   16:iconst_1        
		//   12   17:getstatic       #34  <Field Class Boolean.TYPE>
		//   13   20:aastore         
		//   14   21:dup             
		//   15   22:iconst_2        
		//   16   23:ldc1            #28  <Class File>
		//   17   25:aastore         
		//   18   26:dup             
		//   19   27:iconst_3        
		//   20   28:ldc1            #36  <Class DexFile>
		//   21   30:aastore         
		//   22   31:invokevirtual   #40  <Method Constructor Class.getConstructor(Class[])>
		//   23   34:putfield        #42  <Field Constructor elementConstructor>
			elementConstructor.setAccessible(true);
		//   24   37:aload_0         
		//   25   38:getfield        #42  <Field Constructor elementConstructor>
		//   26   41:iconst_1        
		//   27   42:invokevirtual   #48  <Method void Constructor.setAccessible(boolean)>
		//   28   45:return          
		}
	}

	private static final class V19
	{

		static void install(ClassLoader classloader, List list, File file)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException
		{
			Object obj = MultiDex.findField(((Object) (classloader)), "pathList").get(((Object) (classloader)));
		//    0    0:aload_0         
		//    1    1:ldc1            #28  <String "pathList">
		//    2    3:invokestatic    #32  <Method Field MultiDex.access$000(Object, String)>
		//    3    6:aload_0         
		//    4    7:invokevirtual   #38  <Method Object Field.get(Object)>
		//    5   10:astore          4
			ArrayList arraylist = new ArrayList();
		//    6   12:new             #40  <Class ArrayList>
		//    7   15:dup             
		//    8   16:invokespecial   #41  <Method void ArrayList()>
		//    9   19:astore_3        
			MultiDex.expandFieldArray(obj, "dexElements", makeDexElements(obj, new ArrayList(((java.util.Collection) (list))), file, arraylist));
		//   10   20:aload           4
		//   11   22:ldc1            #43  <String "dexElements">
		//   12   24:aload           4
		//   13   26:new             #40  <Class ArrayList>
		//   14   29:dup             
		//   15   30:aload_1         
		//   16   31:invokespecial   #46  <Method void ArrayList(java.util.Collection)>
		//   17   34:aload_2         
		//   18   35:aload_3         
		//   19   36:invokestatic    #50  <Method Object[] makeDexElements(Object, ArrayList, File, ArrayList)>
		//   20   39:invokestatic    #54  <Method void MultiDex.access$100(Object, String, Object[])>
			if(arraylist.size() > 0)
		//*  21   42:aload_3         
		//*  22   43:invokevirtual   #58  <Method int ArrayList.size()>
		//*  23   46:ifle            184
			{
				for(classloader = ((ClassLoader) (arraylist.iterator())); ((Iterator) (classloader)).hasNext(); Log.w("MultiDex", "Exception in makeDexElement", ((Throwable) ((IOException)((Iterator) (classloader)).next()))));
		//   24   49:aload_3         
		//   25   50:invokevirtual   #62  <Method Iterator ArrayList.iterator()>
		//   26   53:astore_0        
		//   27   54:aload_0         
		//   28   55:invokeinterface #68  <Method boolean Iterator.hasNext()>
		//   29   60:ifeq            83
		//   30   63:ldc1            #70  <String "MultiDex">
		//   31   65:ldc1            #72  <String "Exception in makeDexElement">
		//   32   67:aload_0         
		//   33   68:invokeinterface #76  <Method Object Iterator.next()>
		//   34   73:checkcast       #26  <Class IOException>
		//   35   76:invokestatic    #82  <Method int Log.w(String, String, Throwable)>
		//   36   79:pop             
		//*  37   80:goto            54
				list = ((List) (MultiDex.findField(obj, "dexElementsSuppressedExceptions")));
		//   38   83:aload           4
		//   39   85:ldc1            #84  <String "dexElementsSuppressedExceptions">
		//   40   87:invokestatic    #32  <Method Field MultiDex.access$000(Object, String)>
		//   41   90:astore_1        
				file = ((File) ((IOException[])((Field) (list)).get(obj)));
		//   42   91:aload_1         
		//   43   92:aload           4
		//   44   94:invokevirtual   #38  <Method Object Field.get(Object)>
		//   45   97:checkcast       #86  <Class IOException[]>
		//   46  100:astore_2        
				if(file == null)
		//*  47  101:aload_2         
		//*  48  102:ifnonnull       123
				{
					classloader = ((ClassLoader) ((IOException[])arraylist.toArray(((Object []) (new IOException[arraylist.size()])))));
		//   49  105:aload_3         
		//   50  106:aload_3         
		//   51  107:invokevirtual   #58  <Method int ArrayList.size()>
		//   52  110:anewarray       IOException[]
		//   53  113:invokevirtual   #90  <Method Object[] ArrayList.toArray(Object[])>
		//   54  116:checkcast       #86  <Class IOException[]>
		//   55  119:astore_0        
				} else
		//*  56  120:goto            152
				{
					classloader = ((ClassLoader) (new IOException[arraylist.size() + file.length]));
		//   57  123:aload_3         
		//   58  124:invokevirtual   #58  <Method int ArrayList.size()>
		//   59  127:aload_2         
		//   60  128:arraylength     
		//   61  129:iadd            
		//   62  130:anewarray       IOException[]
		//   63  133:astore_0        
					arraylist.toArray(((Object []) (classloader)));
		//   64  134:aload_3         
		//   65  135:aload_0         
		//   66  136:invokevirtual   #90  <Method Object[] ArrayList.toArray(Object[])>
		//   67  139:pop             
					System.arraycopy(((Object) (file)), 0, ((Object) (classloader)), arraylist.size(), file.length);
		//   68  140:aload_2         
		//   69  141:iconst_0        
		//   70  142:aload_0         
		//   71  143:aload_3         
		//   72  144:invokevirtual   #58  <Method int ArrayList.size()>
		//   73  147:aload_2         
		//   74  148:arraylength     
		//   75  149:invokestatic    #96  <Method void System.arraycopy(Object, int, Object, int, int)>
				}
				((Field) (list)).set(obj, ((Object) (classloader)));
		//   76  152:aload_1         
		//   77  153:aload           4
		//   78  155:aload_0         
		//   79  156:invokevirtual   #100 <Method void Field.set(Object, Object)>
				classloader = ((ClassLoader) (new IOException("I/O exception during makeDexElement")));
		//   80  159:new             #26  <Class IOException>
		//   81  162:dup             
		//   82  163:ldc1            #102 <String "I/O exception during makeDexElement">
		//   83  165:invokespecial   #105 <Method void IOException(String)>
		//   84  168:astore_0        
				((IOException) (classloader)).initCause((Throwable)arraylist.get(0));
		//   85  169:aload_0         
		//   86  170:aload_3         
		//   87  171:iconst_0        
		//   88  172:invokevirtual   #108 <Method Object ArrayList.get(int)>
		//   89  175:checkcast       #110 <Class Throwable>
		//   90  178:invokevirtual   #114 <Method Throwable IOException.initCause(Throwable)>
		//   91  181:pop             
				throw classloader;
		//   92  182:aload_0         
		//   93  183:athrow          
			} else
			{
				return;
		//   94  184:return          
			}
		}

		private static Object[] makeDexElements(Object obj, ArrayList arraylist, File file, ArrayList arraylist1)
			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
		{
			return (Object[])MultiDex.findMethod(obj, "makeDexElements", new Class[] {
				java/util/ArrayList, java/io/File, java/util/ArrayList
			}).invoke(obj, new Object[] {
				arraylist, file, arraylist1
			});
		//    0    0:aload_0         
		//    1    1:ldc1            #118 <String "makeDexElements">
		//    2    3:iconst_3        
		//    3    4:anewarray       Class[]
		//    4    7:dup             
		//    5    8:iconst_0        
		//    6    9:ldc1            #40  <Class ArrayList>
		//    7   11:aastore         
		//    8   12:dup             
		//    9   13:iconst_1        
		//   10   14:ldc1            #122 <Class File>
		//   11   16:aastore         
		//   12   17:dup             
		//   13   18:iconst_2        
		//   14   19:ldc1            #40  <Class ArrayList>
		//   15   21:aastore         
		//   16   22:invokestatic    #126 <Method Method MultiDex.access$200(Object, String, Class[])>
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
		//   32   42:invokevirtual   #132 <Method Object Method.invoke(Object, Object[])>
		//   33   45:checkcast       #134 <Class Object[]>
		//   34   48:areturn         
		}

		private V19()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	private static final class V4
	{

		static void install(ClassLoader classloader, List list)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException
		{
			int i = list.size();
		//    0    0:aload_1         
		//    1    1:invokeinterface #28  <Method int List.size()>
		//    2    6:istore_2        
			Field field = MultiDex.findField(((Object) (classloader)), "path");
		//    3    7:aload_0         
		//    4    8:ldc1            #30  <String "path">
		//    5   10:invokestatic    #34  <Method Field MultiDex.access$000(Object, String)>
		//    6   13:astore_3        
			StringBuilder stringbuilder = new StringBuilder((String)field.get(((Object) (classloader))));
		//    7   14:new             #36  <Class StringBuilder>
		//    8   17:dup             
		//    9   18:aload_3         
		//   10   19:aload_0         
		//   11   20:invokevirtual   #42  <Method Object Field.get(Object)>
		//   12   23:checkcast       #44  <Class String>
		//   13   26:invokespecial   #47  <Method void StringBuilder(String)>
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
		//*  28   56:invokeinterface #57  <Method ListIterator List.listIterator()>
		//*  29   61:astore_1        
		//*  30   62:aload_1         
		//*  31   63:invokeinterface #63  <Method boolean ListIterator.hasNext()>
		//*  32   68:ifeq            180
			{
				Object obj = ((Object) ((File)((ListIterator) (list)).next()));
		//   33   71:aload_1         
		//   34   72:invokeinterface #67  <Method Object ListIterator.next()>
		//   35   77:checkcast       #49  <Class File>
		//   36   80:astore          10
				String s = ((File) (obj)).getAbsolutePath();
		//   37   82:aload           10
		//   38   84:invokevirtual   #71  <Method String File.getAbsolutePath()>
		//   39   87:astore          9
				stringbuilder.append(':');
		//   40   89:aload           4
		//   41   91:bipush          58
		//   42   93:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
		//   43   96:pop             
				stringbuilder.append(s);
		//   44   97:aload           4
		//   45   99:aload           9
		//   46  101:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
		//   47  104:pop             
				int j = ((ListIterator) (list)).previousIndex();
		//   48  105:aload_1         
		//   49  106:invokeinterface #81  <Method int ListIterator.previousIndex()>
		//   50  111:istore_2        
				as[j] = s;
		//   51  112:aload           5
		//   52  114:iload_2         
		//   53  115:aload           9
		//   54  117:aastore         
				afile[j] = ((File) (obj));
		//   55  118:aload           6
		//   56  120:iload_2         
		//   57  121:aload           10
		//   58  123:aastore         
				azipfile[j] = new ZipFile(((File) (obj)));
		//   59  124:aload           7
		//   60  126:iload_2         
		//   61  127:new             #51  <Class ZipFile>
		//   62  130:dup             
		//   63  131:aload           10
		//   64  133:invokespecial   #84  <Method void ZipFile(File)>
		//   65  136:aastore         
				obj = ((Object) (new StringBuilder()));
		//   66  137:new             #36  <Class StringBuilder>
		//   67  140:dup             
		//   68  141:invokespecial   #85  <Method void StringBuilder()>
		//   69  144:astore          10
				((StringBuilder) (obj)).append(s);
		//   70  146:aload           10
		//   71  148:aload           9
		//   72  150:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
		//   73  153:pop             
				((StringBuilder) (obj)).append(".dex");
		//   74  154:aload           10
		//   75  156:ldc1            #87  <String ".dex">
		//   76  158:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
		//   77  161:pop             
				adexfile[j] = DexFile.loadDex(s, ((StringBuilder) (obj)).toString(), 0);
		//   78  162:aload           8
		//   79  164:iload_2         
		//   80  165:aload           9
		//   81  167:aload           10
		//   82  169:invokevirtual   #90  <Method String StringBuilder.toString()>
		//   83  172:iconst_0        
		//   84  173:invokestatic    #94  <Method DexFile DexFile.loadDex(String, String, int)>
		//   85  176:aastore         
			}

		//*  86  177:goto            62
			field.set(((Object) (classloader)), ((Object) (stringbuilder.toString())));
		//   87  180:aload_3         
		//   88  181:aload_0         
		//   89  182:aload           4
		//   90  184:invokevirtual   #90  <Method String StringBuilder.toString()>
		//   91  187:invokevirtual   #98  <Method void Field.set(Object, Object)>
			MultiDex.expandFieldArray(((Object) (classloader)), "mPaths", ((Object []) (as)));
		//   92  190:aload_0         
		//   93  191:ldc1            #100 <String "mPaths">
		//   94  193:aload           5
		//   95  195:invokestatic    #104 <Method void MultiDex.access$100(Object, String, Object[])>
			MultiDex.expandFieldArray(((Object) (classloader)), "mFiles", ((Object []) (afile)));
		//   96  198:aload_0         
		//   97  199:ldc1            #106 <String "mFiles">
		//   98  201:aload           6
		//   99  203:invokestatic    #104 <Method void MultiDex.access$100(Object, String, Object[])>
			MultiDex.expandFieldArray(((Object) (classloader)), "mZips", ((Object []) (azipfile)));
		//  100  206:aload_0         
		//  101  207:ldc1            #108 <String "mZips">
		//  102  209:aload           7
		//  103  211:invokestatic    #104 <Method void MultiDex.access$100(Object, String, Object[])>
			MultiDex.expandFieldArray(((Object) (classloader)), "mDexs", ((Object []) (adexfile)));
		//  104  214:aload_0         
		//  105  215:ldc1            #110 <String "mDexs">
		//  106  217:aload           8
		//  107  219:invokestatic    #104 <Method void MultiDex.access$100(Object, String, Object[])>
		//  108  222:return          
		}

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
	//    1    1:invokespecial   #78  <Method void Object()>
	//    2    4:return          
	}

	private static void clearOldDexDir(Context context)
		throws Exception
	{
		context = ((Context) (new File(context.getFilesDir(), "secondary-dexes")));
	//    0    0:new             #108 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #114 <Method File Context.getFilesDir()>
	//    4    8:ldc1            #32  <String "secondary-dexes">
	//    5   10:invokespecial   #117 <Method void File(File, String)>
	//    6   13:astore_0        
		if(((File) (context)).isDirectory())
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #121 <Method boolean File.isDirectory()>
	//*   9   18:ifeq            358
		{
			Object obj = ((Object) (new StringBuilder()));
	//   10   21:new             #123 <Class StringBuilder>
	//   11   24:dup             
	//   12   25:invokespecial   #124 <Method void StringBuilder()>
	//   13   28:astore_3        
			((StringBuilder) (obj)).append("Clearing old secondary dex dir (");
	//   14   29:aload_3         
	//   15   30:ldc1            #126 <String "Clearing old secondary dex dir (">
	//   16   32:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			((StringBuilder) (obj)).append(((File) (context)).getPath());
	//   18   36:aload_3         
	//   19   37:aload_0         
	//   20   38:invokevirtual   #134 <Method String File.getPath()>
	//   21   41:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
			((StringBuilder) (obj)).append(").");
	//   23   45:aload_3         
	//   24   46:ldc1            #136 <String ").">
	//   25   48:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
			Log.i("MultiDex", ((StringBuilder) (obj)).toString());
	//   27   52:ldc1            #46  <String "MultiDex">
	//   28   54:aload_3         
	//   29   55:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   30   58:invokestatic    #145 <Method int Log.i(String, String)>
	//   31   61:pop             
			obj = ((Object) (((File) (context)).listFiles()));
	//   32   62:aload_0         
	//   33   63:invokevirtual   #149 <Method File[] File.listFiles()>
	//   34   66:astore_3        
			if(obj == null)
	//*  35   67:aload_3         
	//*  36   68:ifnonnull       113
			{
				obj = ((Object) (new StringBuilder()));
	//   37   71:new             #123 <Class StringBuilder>
	//   38   74:dup             
	//   39   75:invokespecial   #124 <Method void StringBuilder()>
	//   40   78:astore_3        
				((StringBuilder) (obj)).append("Failed to list secondary dex dir content (");
	//   41   79:aload_3         
	//   42   80:ldc1            #151 <String "Failed to list secondary dex dir content (">
	//   43   82:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   44   85:pop             
				((StringBuilder) (obj)).append(((File) (context)).getPath());
	//   45   86:aload_3         
	//   46   87:aload_0         
	//   47   88:invokevirtual   #134 <Method String File.getPath()>
	//   48   91:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   49   94:pop             
				((StringBuilder) (obj)).append(").");
	//   50   95:aload_3         
	//   51   96:ldc1            #136 <String ").">
	//   52   98:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   53  101:pop             
				Log.w("MultiDex", ((StringBuilder) (obj)).toString());
	//   54  102:ldc1            #46  <String "MultiDex">
	//   55  104:aload_3         
	//   56  105:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   57  108:invokestatic    #154 <Method int Log.w(String, String)>
	//   58  111:pop             
				return;
	//   59  112:return          
			}
			int j = obj.length;
	//   60  113:aload_3         
	//   61  114:arraylength     
	//   62  115:istore_2        
			for(int i = 0; i < j; i++)
	//*  63  116:iconst_0        
	//*  64  117:istore_1        
	//*  65  118:iload_1         
	//*  66  119:iload_2         
	//*  67  120:icmpge          282
			{
				File file = ((File) (obj[i]));
	//   68  123:aload_3         
	//   69  124:iload_1         
	//   70  125:aaload          
	//   71  126:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   72  128:new             #123 <Class StringBuilder>
	//   73  131:dup             
	//   74  132:invokespecial   #124 <Method void StringBuilder()>
	//   75  135:astore          5
				stringbuilder.append("Trying to delete old file ");
	//   76  137:aload           5
	//   77  139:ldc1            #156 <String "Trying to delete old file ">
	//   78  141:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   79  144:pop             
				stringbuilder.append(file.getPath());
	//   80  145:aload           5
	//   81  147:aload           4
	//   82  149:invokevirtual   #134 <Method String File.getPath()>
	//   83  152:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   84  155:pop             
				stringbuilder.append(" of size ");
	//   85  156:aload           5
	//   86  158:ldc1            #158 <String " of size ">
	//   87  160:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   88  163:pop             
				stringbuilder.append(file.length());
	//   89  164:aload           5
	//   90  166:aload           4
	//   91  168:invokevirtual   #162 <Method long File.length()>
	//   92  171:invokevirtual   #165 <Method StringBuilder StringBuilder.append(long)>
	//   93  174:pop             
				Log.i("MultiDex", stringbuilder.toString());
	//   94  175:ldc1            #46  <String "MultiDex">
	//   95  177:aload           5
	//   96  179:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   97  182:invokestatic    #145 <Method int Log.i(String, String)>
	//   98  185:pop             
				if(!file.delete())
	//*  99  186:aload           4
	//* 100  188:invokevirtual   #168 <Method boolean File.delete()>
	//* 101  191:ifne            236
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//  102  194:new             #123 <Class StringBuilder>
	//  103  197:dup             
	//  104  198:invokespecial   #124 <Method void StringBuilder()>
	//  105  201:astore          5
					stringbuilder1.append("Failed to delete old file ");
	//  106  203:aload           5
	//  107  205:ldc1            #170 <String "Failed to delete old file ">
	//  108  207:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  109  210:pop             
					stringbuilder1.append(file.getPath());
	//  110  211:aload           5
	//  111  213:aload           4
	//  112  215:invokevirtual   #134 <Method String File.getPath()>
	//  113  218:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  114  221:pop             
					Log.w("MultiDex", stringbuilder1.toString());
	//  115  222:ldc1            #46  <String "MultiDex">
	//  116  224:aload           5
	//  117  226:invokevirtual   #139 <Method String StringBuilder.toString()>
	//  118  229:invokestatic    #154 <Method int Log.w(String, String)>
	//  119  232:pop             
				} else
	//* 120  233:goto            275
				{
					StringBuilder stringbuilder2 = new StringBuilder();
	//  121  236:new             #123 <Class StringBuilder>
	//  122  239:dup             
	//  123  240:invokespecial   #124 <Method void StringBuilder()>
	//  124  243:astore          5
					stringbuilder2.append("Deleted old file ");
	//  125  245:aload           5
	//  126  247:ldc1            #172 <String "Deleted old file ">
	//  127  249:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  128  252:pop             
					stringbuilder2.append(file.getPath());
	//  129  253:aload           5
	//  130  255:aload           4
	//  131  257:invokevirtual   #134 <Method String File.getPath()>
	//  132  260:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  133  263:pop             
					Log.i("MultiDex", stringbuilder2.toString());
	//  134  264:ldc1            #46  <String "MultiDex">
	//  135  266:aload           5
	//  136  268:invokevirtual   #139 <Method String StringBuilder.toString()>
	//  137  271:invokestatic    #145 <Method int Log.i(String, String)>
	//  138  274:pop             
				}
			}

	//  139  275:iload_1         
	//  140  276:iconst_1        
	//  141  277:iadd            
	//  142  278:istore_1        
	//* 143  279:goto            118
			if(!((File) (context)).delete())
	//* 144  282:aload_0         
	//* 145  283:invokevirtual   #168 <Method boolean File.delete()>
	//* 146  286:ifne            324
			{
				obj = ((Object) (new StringBuilder()));
	//  147  289:new             #123 <Class StringBuilder>
	//  148  292:dup             
	//  149  293:invokespecial   #124 <Method void StringBuilder()>
	//  150  296:astore_3        
				((StringBuilder) (obj)).append("Failed to delete secondary dex dir ");
	//  151  297:aload_3         
	//  152  298:ldc1            #174 <String "Failed to delete secondary dex dir ">
	//  153  300:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  154  303:pop             
				((StringBuilder) (obj)).append(((File) (context)).getPath());
	//  155  304:aload_3         
	//  156  305:aload_0         
	//  157  306:invokevirtual   #134 <Method String File.getPath()>
	//  158  309:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  159  312:pop             
				Log.w("MultiDex", ((StringBuilder) (obj)).toString());
	//  160  313:ldc1            #46  <String "MultiDex">
	//  161  315:aload_3         
	//  162  316:invokevirtual   #139 <Method String StringBuilder.toString()>
	//  163  319:invokestatic    #154 <Method int Log.w(String, String)>
	//  164  322:pop             
				return;
	//  165  323:return          
			}
			obj = ((Object) (new StringBuilder()));
	//  166  324:new             #123 <Class StringBuilder>
	//  167  327:dup             
	//  168  328:invokespecial   #124 <Method void StringBuilder()>
	//  169  331:astore_3        
			((StringBuilder) (obj)).append("Deleted old secondary dex dir ");
	//  170  332:aload_3         
	//  171  333:ldc1            #176 <String "Deleted old secondary dex dir ">
	//  172  335:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  173  338:pop             
			((StringBuilder) (obj)).append(((File) (context)).getPath());
	//  174  339:aload_3         
	//  175  340:aload_0         
	//  176  341:invokevirtual   #134 <Method String File.getPath()>
	//  177  344:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  178  347:pop             
			Log.i("MultiDex", ((StringBuilder) (obj)).toString());
	//  179  348:ldc1            #46  <String "MultiDex">
	//  180  350:aload_3         
	//  181  351:invokevirtual   #139 <Method String StringBuilder.toString()>
	//  182  354:invokestatic    #145 <Method int Log.i(String, String)>
	//  183  357:pop             
		}
	//  184  358:return          
	}

	private static void doInstallation(Context context, File file, File file1, String s, String s1, boolean flag)
		throws IOException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException
	{
label0:
		{
			synchronized(installedApk)
	//*   0    0:getstatic       #62  <Field Set installedApk>
	//*   1    3:astore          6
	//*   2    5:aload           6
	//*   3    7:monitorenter    
			{
				if(!installedApk.contains(((Object) (file))))
					break label0;
	//    4    8:getstatic       #62  <Field Set installedApk>
	//    5   11:aload_1         
	//    6   12:invokeinterface #198 <Method boolean Set.contains(Object)>
	//    7   17:ifeq            24
			}
	//    8   20:aload           6
	//    9   22:monitorexit     
			return;
	//   10   23:return          
		}
		installedApk.add(((Object) (file)));
	//   11   24:getstatic       #62  <Field Set installedApk>
	//   12   27:aload_1         
	//   13   28:invokeinterface #201 <Method boolean Set.add(Object)>
	//   14   33:pop             
		if(android.os.Build.VERSION.SDK_INT > 20)
	//*  15   34:getstatic       #206 <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   37:bipush          20
	//*  17   39:icmple          138
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   42:new             #123 <Class StringBuilder>
	//   19   45:dup             
	//   20   46:invokespecial   #124 <Method void StringBuilder()>
	//   21   49:astore          7
			stringbuilder.append("MultiDex is not guaranteed to work in SDK version ");
	//   22   51:aload           7
	//   23   53:ldc1            #208 <String "MultiDex is not guaranteed to work in SDK version ">
	//   24   55:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   25   58:pop             
			stringbuilder.append(android.os.Build.VERSION.SDK_INT);
	//   26   59:aload           7
	//   27   61:getstatic       #206 <Field int android.os.Build$VERSION.SDK_INT>
	//   28   64:invokevirtual   #211 <Method StringBuilder StringBuilder.append(int)>
	//   29   67:pop             
			stringbuilder.append(": SDK version higher than ");
	//   30   68:aload           7
	//   31   70:ldc1            #213 <String ": SDK version higher than ">
	//   32   72:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   33   75:pop             
			stringbuilder.append(20);
	//   34   76:aload           7
	//   35   78:bipush          20
	//   36   80:invokevirtual   #211 <Method StringBuilder StringBuilder.append(int)>
	//   37   83:pop             
			stringbuilder.append(" should be backed by ");
	//   38   84:aload           7
	//   39   86:ldc1            #215 <String " should be backed by ">
	//   40   88:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   41   91:pop             
			stringbuilder.append("runtime with built-in multidex capabilty but it's not the ");
	//   42   92:aload           7
	//   43   94:ldc1            #217 <String "runtime with built-in multidex capabilty but it's not the ">
	//   44   96:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   45   99:pop             
			stringbuilder.append("case here: java.vm.version=\"");
	//   46  100:aload           7
	//   47  102:ldc1            #219 <String "case here: java.vm.version=\"">
	//   48  104:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   49  107:pop             
			stringbuilder.append(System.getProperty("java.vm.version"));
	//   50  108:aload           7
	//   51  110:ldc1            #64  <String "java.vm.version">
	//   52  112:invokestatic    #70  <Method String System.getProperty(String)>
	//   53  115:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   54  118:pop             
			stringbuilder.append("\"");
	//   55  119:aload           7
	//   56  121:ldc1            #221 <String "\"">
	//   57  123:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   58  126:pop             
			Log.w("MultiDex", stringbuilder.toString());
	//   59  127:ldc1            #46  <String "MultiDex">
	//   60  129:aload           7
	//   61  131:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   62  134:invokestatic    #154 <Method int Log.w(String, String)>
	//   63  137:pop             
		}
		ClassLoader classloader = context.getClassLoader();
	//   64  138:aload_0         
	//   65  139:invokevirtual   #225 <Method ClassLoader Context.getClassLoader()>
	//   66  142:astore          7
		if(classloader != null)
			break MISSING_BLOCK_LABEL_161;
	//   67  144:aload           7
	//   68  146:ifnonnull       161
		Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
	//   69  149:ldc1            #46  <String "MultiDex">
	//   70  151:ldc1            #227 <String "Context class loader is null. Must be running in test mode. Skip patching.">
	//   71  153:invokestatic    #230 <Method int Log.e(String, String)>
	//   72  156:pop             
		set;
	//   73  157:aload           6
		JVM INSTR monitorexit ;
	//   74  159:monitorexit     
		return;
	//   75  160:return          
		clearOldDexDir(context);
	//   76  161:aload_0         
	//   77  162:invokestatic    #232 <Method void clearOldDexDir(Context)>
		break MISSING_BLOCK_LABEL_180;
	//   78  165:goto            180
		Object obj;
		obj;
	//   79  168:astore          8
		Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", ((Throwable) (obj)));
	//   80  170:ldc1            #46  <String "MultiDex">
	//   81  172:ldc1            #234 <String "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.">
	//   82  174:aload           8
	//   83  176:invokestatic    #237 <Method int Log.w(String, String, Throwable)>
	//   84  179:pop             
		file1 = getDexDir(context, file1, s);
	//   85  180:aload_0         
	//   86  181:aload_2         
	//   87  182:aload_3         
	//   88  183:invokestatic    #241 <Method File getDexDir(Context, File, String)>
	//   89  186:astore_2        
		s = ((String) (new MultiDexExtractor(file, file1)));
	//   90  187:new             #243 <Class MultiDexExtractor>
	//   91  190:dup             
	//   92  191:aload_1         
	//   93  192:aload_2         
	//   94  193:invokespecial   #246 <Method void MultiDexExtractor(File, File)>
	//   95  196:astore_3        
		file = null;
	//   96  197:aconst_null     
	//   97  198:astore_1        
		List list = ((MultiDexExtractor) (s)).load(context, s1, false);
	//   98  199:aload_3         
	//   99  200:aload_0         
	//  100  201:aload           4
	//  101  203:iconst_0        
	//  102  204:invokevirtual   #250 <Method List MultiDexExtractor.load(Context, String, boolean)>
	//  103  207:astore          8
		installSecondaryDexes(classloader, file1, list);
	//  104  209:aload           7
	//  105  211:aload_2         
	//  106  212:aload           8
	//  107  214:invokestatic    #254 <Method void installSecondaryDexes(ClassLoader, File, List)>
		break MISSING_BLOCK_LABEL_255;
	//  108  217:goto            255
		list;
	//  109  220:astore          8
		if(flag)
			break MISSING_BLOCK_LABEL_230;
	//  110  222:iload           5
	//  111  224:ifne            230
		throw list;
	//  112  227:aload           8
	//  113  229:athrow          
		Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", ((Throwable) (list)));
	//  114  230:ldc1            #46  <String "MultiDex">
	//  115  232:ldc2            #256 <String "Failed to install extracted secondary dex files, retrying with forced extraction">
	//  116  235:aload           8
	//  117  237:invokestatic    #237 <Method int Log.w(String, String, Throwable)>
	//  118  240:pop             
		installSecondaryDexes(classloader, file1, ((MultiDexExtractor) (s)).load(context, s1, true));
	//  119  241:aload           7
	//  120  243:aload_2         
	//  121  244:aload_3         
	//  122  245:aload_0         
	//  123  246:aload           4
	//  124  248:iconst_1        
	//  125  249:invokevirtual   #250 <Method List MultiDexExtractor.load(Context, String, boolean)>
	//  126  252:invokestatic    #254 <Method void installSecondaryDexes(ClassLoader, File, List)>
		((MultiDexExtractor) (s)).close();
	//  127  255:aload_3         
	//  128  256:invokevirtual   #259 <Method void MultiDexExtractor.close()>
		context = ((Context) (file));
	//  129  259:aload_1         
	//  130  260:astore_0        
		break MISSING_BLOCK_LABEL_265;
	//  131  261:goto            265
		context;
	//  132  264:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_273;
	//  133  265:aload_0         
	//  134  266:ifnull          271
		throw context;
	//  135  269:aload_0         
	//  136  270:athrow          
	//* 137  271:aload           6
		return;
	//  138  273:monitorexit     
	//  139  274:return          
		context;
	//  140  275:astore_0        
		try
		{
			((MultiDexExtractor) (s)).close();
	//  141  276:aload_3         
	//  142  277:invokevirtual   #259 <Method void MultiDexExtractor.close()>
		}
	//* 143  280:aload_0         
	//* 144  281:athrow          
	//* 145  282:astore_0        
	//* 146  283:ldc1            #46  <String "MultiDex">
	//* 147  285:ldc2            #261 <String "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.">
	//* 148  288:aload_0         
	//* 149  289:invokestatic    #237 <Method int Log.w(String, String, Throwable)>
	//* 150  292:pop             
	//* 151  293:aload           6
	//* 152  295:monitorexit     
	//* 153  296:return          
	//* 154  297:astore_0        
	//* 155  298:aload           6
	//* 156  300:monitorexit     
	//* 157  301:aload_0         
	//* 158  302:athrow          
		// Misplaced declaration of an exception variable
		catch(File file) { }
	//  159  303:astore_1        
		throw context;
		context;
		Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", ((Throwable) (context)));
		set;
		JVM INSTR monitorexit ;
		return;
		context;
		set;
		JVM INSTR monitorexit ;
		throw context;
	//* 160  304:goto            280
	}

	private static void expandFieldArray(Object obj, String s, Object aobj[])
		throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
	{
		s = ((String) (findField(obj, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #85  <Method Field findField(Object, String)>
	//    3    5:astore_1        
		Object aobj1[] = (Object[])((Field) (s)).get(obj);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #267 <Method Object Field.get(Object)>
	//    7   11:checkcast       #269 <Class Object[]>
	//    8   14:astore_3        
		Object aobj2[] = (Object[])Array.newInstance(((Object) (aobj1)).getClass().getComponentType(), aobj1.length + aobj.length);
	//    9   15:aload_3         
	//   10   16:invokevirtual   #273 <Method Class Object.getClass()>
	//   11   19:invokevirtual   #278 <Method Class Class.getComponentType()>
	//   12   22:aload_3         
	//   13   23:arraylength     
	//   14   24:aload_2         
	//   15   25:arraylength     
	//   16   26:iadd            
	//   17   27:invokestatic    #284 <Method Object Array.newInstance(Class, int)>
	//   18   30:checkcast       #269 <Class Object[]>
	//   19   33:astore          4
		System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj2)), 0, aobj1.length);
	//   20   35:aload_3         
	//   21   36:iconst_0        
	//   22   37:aload           4
	//   23   39:iconst_0        
	//   24   40:aload_3         
	//   25   41:arraylength     
	//   26   42:invokestatic    #288 <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj2)), aobj1.length, aobj.length);
	//   27   45:aload_2         
	//   28   46:iconst_0        
	//   29   47:aload           4
	//   30   49:aload_3         
	//   31   50:arraylength     
	//   32   51:aload_2         
	//   33   52:arraylength     
	//   34   53:invokestatic    #288 <Method void System.arraycopy(Object, int, Object, int, int)>
		((Field) (s)).set(obj, ((Object) (aobj2)));
	//   35   56:aload_1         
	//   36   57:aload_0         
	//   37   58:aload           4
	//   38   60:invokevirtual   #292 <Method void Field.set(Object, Object)>
	//   39   63:return          
	}

	private static Field findField(Object obj, String s)
		throws NoSuchFieldException
	{
		Class class1 = obj.getClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #273 <Method Class Object.getClass()>
	//    2    4:astore_2        
_L2:
		if(class1 == null)
			break; /* Loop/switch isn't completed */
	//    3    5:aload_2         
	//    4    6:ifnull          37
		Field field;
		field = class1.getDeclaredField(s);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #296 <Method Field Class.getDeclaredField(String)>
	//    8   14:astore_3        
		if(!field.isAccessible())
	//*   9   15:aload_3         
	//*  10   16:invokevirtual   #299 <Method boolean Field.isAccessible()>
	//*  11   19:ifne            27
			field.setAccessible(true);
	//   12   22:aload_3         
	//   13   23:iconst_1        
	//   14   24:invokevirtual   #303 <Method void Field.setAccessible(boolean)>
		return field;
	//   15   27:aload_3         
	//   16   28:areturn         
_L3:
		class1 = class1.getSuperclass();
	//   17   29:aload_2         
	//   18   30:invokevirtual   #306 <Method Class Class.getSuperclass()>
	//   19   33:astore_2        
		if(true) goto _L2; else goto _L1
	//   20   34:goto            5
_L1:
		StringBuilder stringbuilder = new StringBuilder();
	//   21   37:new             #123 <Class StringBuilder>
	//   22   40:dup             
	//   23   41:invokespecial   #124 <Method void StringBuilder()>
	//   24   44:astore_2        
		stringbuilder.append("Field ");
	//   25   45:aload_2         
	//   26   46:ldc2            #308 <String "Field ">
	//   27   49:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
		stringbuilder.append(s);
	//   29   53:aload_2         
	//   30   54:aload_1         
	//   31   55:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   32   58:pop             
		stringbuilder.append(" not found in ");
	//   33   59:aload_2         
	//   34   60:ldc2            #310 <String " not found in ">
	//   35   63:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   36   66:pop             
		stringbuilder.append(((Object) (obj.getClass())));
	//   37   67:aload_2         
	//   38   68:aload_0         
	//   39   69:invokevirtual   #273 <Method Class Object.getClass()>
	//   40   72:invokevirtual   #313 <Method StringBuilder StringBuilder.append(Object)>
	//   41   75:pop             
		throw new NoSuchFieldException(stringbuilder.toString());
	//   42   76:new             #82  <Class NoSuchFieldException>
	//   43   79:dup             
	//   44   80:aload_2         
	//   45   81:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   46   84:invokespecial   #316 <Method void NoSuchFieldException(String)>
	//   47   87:athrow          
		NoSuchFieldException nosuchfieldexception;
		nosuchfieldexception;
	//   48   88:astore_3        
		  goto _L3
	//*  49   89:goto            29
	}

	private static transient Method findMethod(Object obj, String s, Class aclass[])
		throws NoSuchMethodException
	{
		Class class1 = obj.getClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #273 <Method Class Object.getClass()>
	//    2    4:astore_3        
_L2:
		if(class1 == null)
			break; /* Loop/switch isn't completed */
	//    3    5:aload_3         
	//    4    6:ifnull          42
		Method method;
		method = class1.getDeclaredMethod(s, aclass);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #320 <Method Method Class.getDeclaredMethod(String, Class[])>
	//    9   15:astore          4
		if(!method.isAccessible())
	//*  10   17:aload           4
	//*  11   19:invokevirtual   #323 <Method boolean Method.isAccessible()>
	//*  12   22:ifne            31
			method.setAccessible(true);
	//   13   25:aload           4
	//   14   27:iconst_1        
	//   15   28:invokevirtual   #324 <Method void Method.setAccessible(boolean)>
		return method;
	//   16   31:aload           4
	//   17   33:areturn         
_L3:
		class1 = class1.getSuperclass();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #306 <Method Class Class.getSuperclass()>
	//   20   38:astore_3        
		if(true) goto _L2; else goto _L1
	//   21   39:goto            5
_L1:
		StringBuilder stringbuilder = new StringBuilder();
	//   22   42:new             #123 <Class StringBuilder>
	//   23   45:dup             
	//   24   46:invokespecial   #124 <Method void StringBuilder()>
	//   25   49:astore_3        
		stringbuilder.append("Method ");
	//   26   50:aload_3         
	//   27   51:ldc2            #326 <String "Method ">
	//   28   54:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
		stringbuilder.append(s);
	//   30   58:aload_3         
	//   31   59:aload_1         
	//   32   60:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
		stringbuilder.append(" with parameters ");
	//   34   64:aload_3         
	//   35   65:ldc2            #328 <String " with parameters ">
	//   36   68:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
		stringbuilder.append(((Object) (Arrays.asList(((Object []) (aclass))))));
	//   38   72:aload_3         
	//   39   73:aload_2         
	//   40   74:invokestatic    #334 <Method List Arrays.asList(Object[])>
	//   41   77:invokevirtual   #313 <Method StringBuilder StringBuilder.append(Object)>
	//   42   80:pop             
		stringbuilder.append(" not found in ");
	//   43   81:aload_3         
	//   44   82:ldc2            #310 <String " not found in ">
	//   45   85:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   46   88:pop             
		stringbuilder.append(((Object) (obj.getClass())));
	//   47   89:aload_3         
	//   48   90:aload_0         
	//   49   91:invokevirtual   #273 <Method Class Object.getClass()>
	//   50   94:invokevirtual   #313 <Method StringBuilder StringBuilder.append(Object)>
	//   51   97:pop             
		throw new NoSuchMethodException(stringbuilder.toString());
	//   52   98:new             #99  <Class NoSuchMethodException>
	//   53  101:dup             
	//   54  102:aload_3         
	//   55  103:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   56  106:invokespecial   #335 <Method void NoSuchMethodException(String)>
	//   57  109:athrow          
		NoSuchMethodException nosuchmethodexception;
		nosuchmethodexception;
	//   58  110:astore          4
		  goto _L3
	//*  59  112:goto            34
	}

	private static ApplicationInfo getApplicationInfo(Context context)
	{
		try
		{
			context = ((Context) (context.getApplicationInfo()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #342 <Method ApplicationInfo Context.getApplicationInfo()>
	//    2    4:astore_0        
		}
	//*   3    5:aload_0         
	//*   4    6:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   5    7:astore_0        
		{
			Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", ((Throwable) (context)));
	//    6    8:ldc1            #46  <String "MultiDex">
	//    7   10:ldc2            #344 <String "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.">
	//    8   13:aload_0         
	//    9   14:invokestatic    #237 <Method int Log.w(String, String, Throwable)>
	//   10   17:pop             
			return null;
	//   11   18:aconst_null     
	//   12   19:areturn         
		}
		return ((ApplicationInfo) (context));
	}

	private static File getDexDir(Context context, File file, String s)
		throws IOException
	{
		file = new File(file, "code_cache");
	//    0    0:new             #108 <Class File>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #29  <String "code_cache">
	//    4    7:invokespecial   #117 <Method void File(File, String)>
	//    5   10:astore_1        
		mkdirChecked(file);
	//    6   11:aload_1         
	//    7   12:invokestatic    #348 <Method void mkdirChecked(File)>
		context = ((Context) (file));
	//    8   15:aload_1         
	//    9   16:astore_0        
		  goto _L1
	//*  10   17:goto            38
_L3:
		context = ((Context) (new File(context.getFilesDir(), "code_cache")));
	//   11   20:new             #108 <Class File>
	//   12   23:dup             
	//   13   24:aload_0         
	//   14   25:invokevirtual   #114 <Method File Context.getFilesDir()>
	//   15   28:ldc1            #29  <String "code_cache">
	//   16   30:invokespecial   #117 <Method void File(File, String)>
	//   17   33:astore_0        
		mkdirChecked(((File) (context)));
	//   18   34:aload_0         
	//   19   35:invokestatic    #348 <Method void mkdirChecked(File)>
_L1:
		context = ((Context) (new File(((File) (context)), s)));
	//   20   38:new             #108 <Class File>
	//   21   41:dup             
	//   22   42:aload_0         
	//   23   43:aload_2         
	//   24   44:invokespecial   #117 <Method void File(File, String)>
	//   25   47:astore_0        
		mkdirChecked(((File) (context)));
	//   26   48:aload_0         
	//   27   49:invokestatic    #348 <Method void mkdirChecked(File)>
		return ((File) (context));
	//   28   52:aload_0         
	//   29   53:areturn         
		file;
	//   30   54:astore_1        
		if(true) goto _L3; else goto _L2
_L2:
	//*  31   55:goto            20
	}

	public static void install(Context context)
	{
		Log.i("MultiDex", "Installing application");
	//    0    0:ldc1            #46  <String "MultiDex">
	//    1    2:ldc2            #351 <String "Installing application">
	//    2    5:invokestatic    #145 <Method int Log.i(String, String)>
	//    3    8:pop             
		if(IS_VM_MULTIDEX_CAPABLE)
	//*   4    9:getstatic       #76  <Field boolean IS_VM_MULTIDEX_CAPABLE>
	//*   5   12:ifeq            25
		{
			Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
	//    6   15:ldc1            #46  <String "MultiDex">
	//    7   17:ldc2            #353 <String "VM has multidex support, MultiDex support library is disabled.">
	//    8   20:invokestatic    #145 <Method int Log.i(String, String)>
	//    9   23:pop             
			return;
	//   10   24:return          
		}
		if(android.os.Build.VERSION.SDK_INT < 4)
	//*  11   25:getstatic       #206 <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   28:iconst_4        
	//*  13   29:icmpge          90
		{
			context = ((Context) (new StringBuilder()));
	//   14   32:new             #123 <Class StringBuilder>
	//   15   35:dup             
	//   16   36:invokespecial   #124 <Method void StringBuilder()>
	//   17   39:astore_0        
			((StringBuilder) (context)).append("MultiDex installation failed. SDK ");
	//   18   40:aload_0         
	//   19   41:ldc2            #355 <String "MultiDex installation failed. SDK ">
	//   20   44:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   21   47:pop             
			((StringBuilder) (context)).append(android.os.Build.VERSION.SDK_INT);
	//   22   48:aload_0         
	//   23   49:getstatic       #206 <Field int android.os.Build$VERSION.SDK_INT>
	//   24   52:invokevirtual   #211 <Method StringBuilder StringBuilder.append(int)>
	//   25   55:pop             
			((StringBuilder) (context)).append(" is unsupported. Min SDK version is ");
	//   26   56:aload_0         
	//   27   57:ldc2            #357 <String " is unsupported. Min SDK version is ">
	//   28   60:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:pop             
			((StringBuilder) (context)).append(4);
	//   30   64:aload_0         
	//   31   65:iconst_4        
	//   32   66:invokevirtual   #211 <Method StringBuilder StringBuilder.append(int)>
	//   33   69:pop             
			((StringBuilder) (context)).append(".");
	//   34   70:aload_0         
	//   35   71:ldc2            #359 <String ".">
	//   36   74:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   37   77:pop             
			throw new RuntimeException(((StringBuilder) (context)).toString());
	//   38   78:new             #190 <Class RuntimeException>
	//   39   81:dup             
	//   40   82:aload_0         
	//   41   83:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   42   86:invokespecial   #360 <Method void RuntimeException(String)>
	//   43   89:athrow          
		}
		ApplicationInfo applicationinfo = getApplicationInfo(context);
	//   44   90:aload_0         
	//   45   91:invokestatic    #362 <Method ApplicationInfo getApplicationInfo(Context)>
	//   46   94:astore_1        
		if(applicationinfo == null)
	//*  47   95:aload_1         
	//*  48   96:ifnonnull       109
		{
			try
			{
				Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
	//   49   99:ldc1            #46  <String "MultiDex">
	//   50  101:ldc2            #364 <String "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.">
	//   51  104:invokestatic    #145 <Method int Log.i(String, String)>
	//   52  107:pop             
				return;
	//   53  108:return          
			}
	//*  54  109:aload_0         
	//*  55  110:new             #108 <Class File>
	//*  56  113:dup             
	//*  57  114:aload_1         
	//*  58  115:getfield        #369 <Field String ApplicationInfo.sourceDir>
	//*  59  118:invokespecial   #370 <Method void File(String)>
	//*  60  121:new             #108 <Class File>
	//*  61  124:dup             
	//*  62  125:aload_1         
	//*  63  126:getfield        #373 <Field String ApplicationInfo.dataDir>
	//*  64  129:invokespecial   #370 <Method void File(String)>
	//*  65  132:ldc1            #32  <String "secondary-dexes">
	//*  66  134:ldc1            #42  <String "">
	//*  67  136:iconst_1        
	//*  68  137:invokestatic    #375 <Method void doInstallation(Context, File, File, String, String, boolean)>
	//*  69  140:ldc1            #46  <String "MultiDex">
	//*  70  142:ldc2            #377 <String "install done">
	//*  71  145:invokestatic    #145 <Method int Log.i(String, String)>
	//*  72  148:pop             
	//*  73  149:return          
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  74  150:astore_0        
			{
				Log.e("MultiDex", "MultiDex installation failure", ((Throwable) (context)));
	//   75  151:ldc1            #46  <String "MultiDex">
	//   76  153:ldc2            #379 <String "MultiDex installation failure">
	//   77  156:aload_0         
	//   78  157:invokestatic    #381 <Method int Log.e(String, String, Throwable)>
	//   79  160:pop             
			}
			break MISSING_BLOCK_LABEL_161;
		}
		doInstallation(context, new File(applicationinfo.sourceDir), new File(applicationinfo.dataDir), "secondary-dexes", "", true);
		Log.i("MultiDex", "install done");
		return;
		StringBuilder stringbuilder = new StringBuilder();
	//   80  161:new             #123 <Class StringBuilder>
	//   81  164:dup             
	//   82  165:invokespecial   #124 <Method void StringBuilder()>
	//   83  168:astore_1        
		stringbuilder.append("MultiDex installation failed (");
	//   84  169:aload_1         
	//   85  170:ldc2            #383 <String "MultiDex installation failed (">
	//   86  173:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   87  176:pop             
		stringbuilder.append(((Exception) (context)).getMessage());
	//   88  177:aload_1         
	//   89  178:aload_0         
	//   90  179:invokevirtual   #386 <Method String Exception.getMessage()>
	//   91  182:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   92  185:pop             
		stringbuilder.append(").");
	//   93  186:aload_1         
	//   94  187:ldc1            #136 <String ").">
	//   95  189:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   96  192:pop             
		throw new RuntimeException(stringbuilder.toString());
	//   97  193:new             #190 <Class RuntimeException>
	//   98  196:dup             
	//   99  197:aload_1         
	//  100  198:invokevirtual   #139 <Method String StringBuilder.toString()>
	//  101  201:invokespecial   #360 <Method void RuntimeException(String)>
	//  102  204:athrow          
	}

	public static void installInstrumentation(Context context, Context context1)
	{
		Log.i("MultiDex", "Installing instrumentation");
	//    0    0:ldc1            #46  <String "MultiDex">
	//    1    2:ldc2            #390 <String "Installing instrumentation">
	//    2    5:invokestatic    #145 <Method int Log.i(String, String)>
	//    3    8:pop             
		if(IS_VM_MULTIDEX_CAPABLE)
	//*   4    9:getstatic       #76  <Field boolean IS_VM_MULTIDEX_CAPABLE>
	//*   5   12:ifeq            25
		{
			Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
	//    6   15:ldc1            #46  <String "MultiDex">
	//    7   17:ldc2            #353 <String "VM has multidex support, MultiDex support library is disabled.">
	//    8   20:invokestatic    #145 <Method int Log.i(String, String)>
	//    9   23:pop             
			return;
	//   10   24:return          
		}
		if(android.os.Build.VERSION.SDK_INT < 4)
	//*  11   25:getstatic       #206 <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   28:iconst_4        
	//*  13   29:icmpge          90
		{
			context = ((Context) (new StringBuilder()));
	//   14   32:new             #123 <Class StringBuilder>
	//   15   35:dup             
	//   16   36:invokespecial   #124 <Method void StringBuilder()>
	//   17   39:astore_0        
			((StringBuilder) (context)).append("MultiDex installation failed. SDK ");
	//   18   40:aload_0         
	//   19   41:ldc2            #355 <String "MultiDex installation failed. SDK ">
	//   20   44:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   21   47:pop             
			((StringBuilder) (context)).append(android.os.Build.VERSION.SDK_INT);
	//   22   48:aload_0         
	//   23   49:getstatic       #206 <Field int android.os.Build$VERSION.SDK_INT>
	//   24   52:invokevirtual   #211 <Method StringBuilder StringBuilder.append(int)>
	//   25   55:pop             
			((StringBuilder) (context)).append(" is unsupported. Min SDK version is ");
	//   26   56:aload_0         
	//   27   57:ldc2            #357 <String " is unsupported. Min SDK version is ">
	//   28   60:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:pop             
			((StringBuilder) (context)).append(4);
	//   30   64:aload_0         
	//   31   65:iconst_4        
	//   32   66:invokevirtual   #211 <Method StringBuilder StringBuilder.append(int)>
	//   33   69:pop             
			((StringBuilder) (context)).append(".");
	//   34   70:aload_0         
	//   35   71:ldc2            #359 <String ".">
	//   36   74:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   37   77:pop             
			throw new RuntimeException(((StringBuilder) (context)).toString());
	//   38   78:new             #190 <Class RuntimeException>
	//   39   81:dup             
	//   40   82:aload_0         
	//   41   83:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   42   86:invokespecial   #360 <Method void RuntimeException(String)>
	//   43   89:athrow          
		}
		Object obj = ((Object) (getApplicationInfo(context)));
	//   44   90:aload_0         
	//   45   91:invokestatic    #362 <Method ApplicationInfo getApplicationInfo(Context)>
	//   46   94:astore_3        
		if(obj == null)
	//*  47   95:aload_3         
	//*  48   96:ifnonnull       109
		{
			ApplicationInfo applicationinfo;
			Object obj1;
			StringBuilder stringbuilder;
			try
			{
				Log.i("MultiDex", "No ApplicationInfo available for instrumentation, i.e. running on a test Context: MultiDex support library is disabled.");
	//   49   99:ldc1            #46  <String "MultiDex">
	//   50  101:ldc2            #392 <String "No ApplicationInfo available for instrumentation, i.e. running on a test Context: MultiDex support library is disabled.">
	//   51  104:invokestatic    #145 <Method int Log.i(String, String)>
	//   52  107:pop             
				return;
	//   53  108:return          
			}
	//*  54  109:aload_1         
	//*  55  110:invokestatic    #362 <Method ApplicationInfo getApplicationInfo(Context)>
	//*  56  113:astore_2        
	//*  57  114:aload_2         
	//*  58  115:ifnonnull       128
	//*  59  118:ldc1            #46  <String "MultiDex">
	//*  60  120:ldc2            #364 <String "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.">
	//*  61  123:invokestatic    #145 <Method int Log.i(String, String)>
	//*  62  126:pop             
	//*  63  127:return          
	//*  64  128:new             #123 <Class StringBuilder>
	//*  65  131:dup             
	//*  66  132:invokespecial   #124 <Method void StringBuilder()>
	//*  67  135:astore          4
	//*  68  137:aload           4
	//*  69  139:aload_0         
	//*  70  140:invokevirtual   #395 <Method String Context.getPackageName()>
	//*  71  143:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//*  72  146:pop             
	//*  73  147:aload           4
	//*  74  149:ldc2            #359 <String ".">
	//*  75  152:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//*  76  155:pop             
	//*  77  156:aload           4
	//*  78  158:invokevirtual   #139 <Method String StringBuilder.toString()>
	//*  79  161:astore_0        
	//*  80  162:new             #108 <Class File>
	//*  81  165:dup             
	//*  82  166:aload_2         
	//*  83  167:getfield        #373 <Field String ApplicationInfo.dataDir>
	//*  84  170:invokespecial   #370 <Method void File(String)>
	//*  85  173:astore          4
	//*  86  175:new             #108 <Class File>
	//*  87  178:dup             
	//*  88  179:aload_3         
	//*  89  180:getfield        #369 <Field String ApplicationInfo.sourceDir>
	//*  90  183:invokespecial   #370 <Method void File(String)>
	//*  91  186:astore_3        
	//*  92  187:new             #123 <Class StringBuilder>
	//*  93  190:dup             
	//*  94  191:invokespecial   #124 <Method void StringBuilder()>
	//*  95  194:astore          5
	//*  96  196:aload           5
	//*  97  198:aload_0         
	//*  98  199:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//*  99  202:pop             
	//* 100  203:aload           5
	//* 101  205:ldc1            #32  <String "secondary-dexes">
	//* 102  207:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//* 103  210:pop             
	//* 104  211:aload_1         
	//* 105  212:aload_3         
	//* 106  213:aload           4
	//* 107  215:aload           5
	//* 108  217:invokevirtual   #139 <Method String StringBuilder.toString()>
	//* 109  220:aload_0         
	//* 110  221:iconst_0        
	//* 111  222:invokestatic    #375 <Method void doInstallation(Context, File, File, String, String, boolean)>
	//* 112  225:aload_1         
	//* 113  226:new             #108 <Class File>
	//* 114  229:dup             
	//* 115  230:aload_2         
	//* 116  231:getfield        #369 <Field String ApplicationInfo.sourceDir>
	//* 117  234:invokespecial   #370 <Method void File(String)>
	//* 118  237:aload           4
	//* 119  239:ldc1            #32  <String "secondary-dexes">
	//* 120  241:ldc1            #42  <String "">
	//* 121  243:iconst_0        
	//* 122  244:invokestatic    #375 <Method void doInstallation(Context, File, File, String, String, boolean)>
	//* 123  247:ldc1            #46  <String "MultiDex">
	//* 124  249:ldc2            #397 <String "Installation done">
	//* 125  252:invokestatic    #145 <Method int Log.i(String, String)>
	//* 126  255:pop             
	//* 127  256:return          
			// Misplaced declaration of an exception variable
			catch(Context context)
	//* 128  257:astore_0        
			{
				Log.e("MultiDex", "MultiDex installation failure", ((Throwable) (context)));
	//  129  258:ldc1            #46  <String "MultiDex">
	//  130  260:ldc2            #379 <String "MultiDex installation failure">
	//  131  263:aload_0         
	//  132  264:invokestatic    #381 <Method int Log.e(String, String, Throwable)>
	//  133  267:pop             
			}
			break MISSING_BLOCK_LABEL_268;
		}
		applicationinfo = getApplicationInfo(context1);
		if(applicationinfo != null)
			break MISSING_BLOCK_LABEL_128;
		Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
		return;
		obj1 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj1)).append(context.getPackageName());
		((StringBuilder) (obj1)).append(".");
		context = ((Context) (((StringBuilder) (obj1)).toString()));
		obj1 = ((Object) (new File(applicationinfo.dataDir)));
		obj = ((Object) (new File(((ApplicationInfo) (obj)).sourceDir)));
		stringbuilder = new StringBuilder();
		stringbuilder.append(((String) (context)));
		stringbuilder.append("secondary-dexes");
		doInstallation(context1, ((File) (obj)), ((File) (obj1)), stringbuilder.toString(), ((String) (context)), false);
		doInstallation(context1, new File(applicationinfo.sourceDir), ((File) (obj1)), "secondary-dexes", "", false);
		Log.i("MultiDex", "Installation done");
		return;
		context1 = ((Context) (new StringBuilder()));
	//  134  268:new             #123 <Class StringBuilder>
	//  135  271:dup             
	//  136  272:invokespecial   #124 <Method void StringBuilder()>
	//  137  275:astore_1        
		((StringBuilder) (context1)).append("MultiDex installation failed (");
	//  138  276:aload_1         
	//  139  277:ldc2            #383 <String "MultiDex installation failed (">
	//  140  280:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  141  283:pop             
		((StringBuilder) (context1)).append(((Exception) (context)).getMessage());
	//  142  284:aload_1         
	//  143  285:aload_0         
	//  144  286:invokevirtual   #386 <Method String Exception.getMessage()>
	//  145  289:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  146  292:pop             
		((StringBuilder) (context1)).append(").");
	//  147  293:aload_1         
	//  148  294:ldc1            #136 <String ").">
	//  149  296:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  150  299:pop             
		throw new RuntimeException(((StringBuilder) (context1)).toString());
	//  151  300:new             #190 <Class RuntimeException>
	//  152  303:dup             
	//  153  304:aload_1         
	//  154  305:invokevirtual   #139 <Method String StringBuilder.toString()>
	//  155  308:invokespecial   #360 <Method void RuntimeException(String)>
	//  156  311:athrow          
	}

	private static void installSecondaryDexes(ClassLoader classloader, File file, List list)
		throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException
	{
		if(!list.isEmpty())
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #402 <Method boolean List.isEmpty()>
	//*   2    6:ifne            43
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   3    9:getstatic       #206 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   12:bipush          19
	//*   5   14:icmplt          24
			{
				V19.install(classloader, list, file);
	//    6   17:aload_0         
	//    7   18:aload_2         
	//    8   19:aload_1         
	//    9   20:invokestatic    #405 <Method void MultiDex$V19.install(ClassLoader, List, File)>
				return;
	//   10   23:return          
			}
			if(android.os.Build.VERSION.SDK_INT >= 14)
	//*  11   24:getstatic       #206 <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   27:bipush          14
	//*  13   29:icmplt          38
			{
				V14.install(classloader, list);
	//   14   32:aload_0         
	//   15   33:aload_2         
	//   16   34:invokestatic    #408 <Method void MultiDex$V14.install(ClassLoader, List)>
				return;
	//   17   37:return          
			}
			V4.install(classloader, list);
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:invokestatic    #409 <Method void MultiDex$V4.install(ClassLoader, List)>
		}
	//   21   43:return          
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
			break MISSING_BLOCK_LABEL_76;
	//    4    6:aload_0         
	//    5    7:ifnull          76
		matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(((CharSequence) (s)));
	//    6   10:ldc2            #414 <String "(\\d+)\\.(\\d+)(\\.\\d+)?">
	//    7   13:invokestatic    #420 <Method Pattern Pattern.compile(String)>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #424 <Method Matcher Pattern.matcher(CharSequence)>
	//   10   20:astore          5
		flag = flag1;
	//   11   22:iload           4
	//   12   24:istore_3        
		if(!matcher.matches())
			break MISSING_BLOCK_LABEL_76;
	//   13   25:aload           5
	//   14   27:invokevirtual   #429 <Method boolean Matcher.matches()>
	//   15   30:ifeq            76
		int i;
		int j;
		i = Integer.parseInt(matcher.group(1));
	//   16   33:aload           5
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #433 <Method String Matcher.group(int)>
	//   19   39:invokestatic    #439 <Method int Integer.parseInt(String)>
	//   20   42:istore_1        
		j = Integer.parseInt(matcher.group(2));
	//   21   43:aload           5
	//   22   45:iconst_2        
	//   23   46:invokevirtual   #433 <Method String Matcher.group(int)>
	//   24   49:invokestatic    #439 <Method int Integer.parseInt(String)>
	//   25   52:istore_2        
		if(i <= 2)
	//*  26   53:iload_1         
	//*  27   54:iconst_2        
	//*  28   55:icmpgt          74
		{
			flag = flag1;
	//   29   58:iload           4
	//   30   60:istore_3        
			if(i != 2)
				break MISSING_BLOCK_LABEL_76;
	//   31   61:iload_1         
	//   32   62:iconst_2        
	//   33   63:icmpne          76
			flag = flag1;
	//   34   66:iload           4
	//   35   68:istore_3        
			if(j < 1)
				break MISSING_BLOCK_LABEL_76;
	//   36   69:iload_2         
	//   37   70:iconst_1        
	//   38   71:icmplt          76
		}
		flag = true;
	//   39   74:iconst_1        
	//   40   75:istore_3        
_L2:
		StringBuilder stringbuilder = new StringBuilder();
	//   41   76:new             #123 <Class StringBuilder>
	//   42   79:dup             
	//   43   80:invokespecial   #124 <Method void StringBuilder()>
	//   44   83:astore          5
		stringbuilder.append("VM with version ");
	//   45   85:aload           5
	//   46   87:ldc2            #441 <String "VM with version ">
	//   47   90:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   48   93:pop             
		stringbuilder.append(s);
	//   49   94:aload           5
	//   50   96:aload_0         
	//   51   97:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   52  100:pop             
		if(flag)
	//*  53  101:iload_3         
	//*  54  102:ifeq            112
			s = " has multidex support";
	//   55  105:ldc2            #443 <String " has multidex support">
	//   56  108:astore_0        
		else
	//*  57  109:goto            116
			s = " does not have multidex support";
	//   58  112:ldc2            #445 <String " does not have multidex support">
	//   59  115:astore_0        
		stringbuilder.append(s);
	//   60  116:aload           5
	//   61  118:aload_0         
	//   62  119:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   63  122:pop             
		Log.i("MultiDex", stringbuilder.toString());
	//   64  123:ldc1            #46  <String "MultiDex">
	//   65  125:aload           5
	//   66  127:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   67  130:invokestatic    #145 <Method int Log.i(String, String)>
	//   68  133:pop             
		return flag;
	//   69  134:iload_3         
	//   70  135:ireturn         
		NumberFormatException numberformatexception;
		numberformatexception;
	//   71  136:astore          5
		flag = flag1;
	//   72  138:iload           4
	//   73  140:istore_3        
		if(true) goto _L2; else goto _L1
	//   74  141:goto            76
_L1:
	}

	private static void mkdirChecked(File file)
		throws IOException
	{
		file.mkdir();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #448 <Method boolean File.mkdir()>
	//    2    4:pop             
		if(!file.isDirectory())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #121 <Method boolean File.isDirectory()>
	//*   5    9:ifne            224
		{
			Object obj = ((Object) (file.getParentFile()));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #451 <Method File File.getParentFile()>
	//    8   16:astore_1        
			if(obj == null)
	//*   9   17:aload_1         
	//*  10   18:ifnonnull       67
			{
				obj = ((Object) (new StringBuilder()));
	//   11   21:new             #123 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #124 <Method void StringBuilder()>
	//   14   28:astore_1        
				((StringBuilder) (obj)).append("Failed to create dir ");
	//   15   29:aload_1         
	//   16   30:ldc2            #453 <String "Failed to create dir ">
	//   17   33:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
				((StringBuilder) (obj)).append(file.getPath());
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:invokevirtual   #134 <Method String File.getPath()>
	//   22   42:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
				((StringBuilder) (obj)).append(". Parent file is null.");
	//   24   46:aload_1         
	//   25   47:ldc2            #455 <String ". Parent file is null.">
	//   26   50:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
				Log.e("MultiDex", ((StringBuilder) (obj)).toString());
	//   28   54:ldc1            #46  <String "MultiDex">
	//   29   56:aload_1         
	//   30   57:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   31   60:invokestatic    #230 <Method int Log.e(String, String)>
	//   32   63:pop             
			} else
	//*  33   64:goto            187
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   34   67:new             #123 <Class StringBuilder>
	//   35   70:dup             
	//   36   71:invokespecial   #124 <Method void StringBuilder()>
	//   37   74:astore_2        
				stringbuilder.append("Failed to create dir ");
	//   38   75:aload_2         
	//   39   76:ldc2            #453 <String "Failed to create dir ">
	//   40   79:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   41   82:pop             
				stringbuilder.append(file.getPath());
	//   42   83:aload_2         
	//   43   84:aload_0         
	//   44   85:invokevirtual   #134 <Method String File.getPath()>
	//   45   88:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   46   91:pop             
				stringbuilder.append(". parent file is a dir ");
	//   47   92:aload_2         
	//   48   93:ldc2            #457 <String ". parent file is a dir ">
	//   49   96:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   50   99:pop             
				stringbuilder.append(((File) (obj)).isDirectory());
	//   51  100:aload_2         
	//   52  101:aload_1         
	//   53  102:invokevirtual   #121 <Method boolean File.isDirectory()>
	//   54  105:invokevirtual   #460 <Method StringBuilder StringBuilder.append(boolean)>
	//   55  108:pop             
				stringbuilder.append(", a file ");
	//   56  109:aload_2         
	//   57  110:ldc2            #462 <String ", a file ">
	//   58  113:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   59  116:pop             
				stringbuilder.append(((File) (obj)).isFile());
	//   60  117:aload_2         
	//   61  118:aload_1         
	//   62  119:invokevirtual   #465 <Method boolean File.isFile()>
	//   63  122:invokevirtual   #460 <Method StringBuilder StringBuilder.append(boolean)>
	//   64  125:pop             
				stringbuilder.append(", exists ");
	//   65  126:aload_2         
	//   66  127:ldc2            #467 <String ", exists ">
	//   67  130:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   68  133:pop             
				stringbuilder.append(((File) (obj)).exists());
	//   69  134:aload_2         
	//   70  135:aload_1         
	//   71  136:invokevirtual   #470 <Method boolean File.exists()>
	//   72  139:invokevirtual   #460 <Method StringBuilder StringBuilder.append(boolean)>
	//   73  142:pop             
				stringbuilder.append(", readable ");
	//   74  143:aload_2         
	//   75  144:ldc2            #472 <String ", readable ">
	//   76  147:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   77  150:pop             
				stringbuilder.append(((File) (obj)).canRead());
	//   78  151:aload_2         
	//   79  152:aload_1         
	//   80  153:invokevirtual   #475 <Method boolean File.canRead()>
	//   81  156:invokevirtual   #460 <Method StringBuilder StringBuilder.append(boolean)>
	//   82  159:pop             
				stringbuilder.append(", writable ");
	//   83  160:aload_2         
	//   84  161:ldc2            #477 <String ", writable ">
	//   85  164:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   86  167:pop             
				stringbuilder.append(((File) (obj)).canWrite());
	//   87  168:aload_2         
	//   88  169:aload_1         
	//   89  170:invokevirtual   #480 <Method boolean File.canWrite()>
	//   90  173:invokevirtual   #460 <Method StringBuilder StringBuilder.append(boolean)>
	//   91  176:pop             
				Log.e("MultiDex", stringbuilder.toString());
	//   92  177:ldc1            #46  <String "MultiDex">
	//   93  179:aload_2         
	//   94  180:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   95  183:invokestatic    #230 <Method int Log.e(String, String)>
	//   96  186:pop             
			}
			obj = ((Object) (new StringBuilder()));
	//   97  187:new             #123 <Class StringBuilder>
	//   98  190:dup             
	//   99  191:invokespecial   #124 <Method void StringBuilder()>
	//  100  194:astore_1        
			((StringBuilder) (obj)).append("Failed to create directory ");
	//  101  195:aload_1         
	//  102  196:ldc2            #482 <String "Failed to create directory ">
	//  103  199:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  104  202:pop             
			((StringBuilder) (obj)).append(file.getPath());
	//  105  203:aload_1         
	//  106  204:aload_0         
	//  107  205:invokevirtual   #134 <Method String File.getPath()>
	//  108  208:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  109  211:pop             
			throw new IOException(((StringBuilder) (obj)).toString());
	//  110  212:new             #180 <Class IOException>
	//  111  215:dup             
	//  112  216:aload_1         
	//  113  217:invokevirtual   #139 <Method String StringBuilder.toString()>
	//  114  220:invokespecial   #483 <Method void IOException(String)>
	//  115  223:athrow          
		} else
		{
			return;
	//  116  224:return          
		}
	}

	private static final String CODE_CACHE_NAME = "code_cache";
	private static final String CODE_CACHE_SECONDARY_FOLDER_NAME = "secondary-dexes";
	private static final boolean IS_VM_MULTIDEX_CAPABLE = isVMMultidexCapable(System.getProperty("java.vm.version"));
	private static final int MAX_SUPPORTED_SDK_VERSION = 20;
	private static final int MIN_SDK_VERSION = 4;
	private static final String NO_KEY_PREFIX = "";
	private static final String OLD_SECONDARY_FOLDER_NAME = "secondary-dexes";
	static final String TAG = "MultiDex";
	private static final int VM_WITH_MULTIDEX_VERSION_MAJOR = 2;
	private static final int VM_WITH_MULTIDEX_VERSION_MINOR = 1;
	private static final Set installedApk = new HashSet();

	static 
	{
	//    0    0:new             #57  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void HashSet()>
	//    3    7:putstatic       #62  <Field Set installedApk>
	//    4   10:ldc1            #64  <String "java.vm.version">
	//    5   12:invokestatic    #70  <Method String System.getProperty(String)>
	//    6   15:invokestatic    #74  <Method boolean isVMMultidexCapable(String)>
	//    7   18:putstatic       #76  <Field boolean IS_VM_MULTIDEX_CAPABLE>
	//*   8   21:return          
	}


/*
	static Field access$000(Object obj, String s)
		throws NoSuchFieldException
	{
		return findField(obj, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #85  <Method Field findField(Object, String)>
	//    3    5:areturn         
	}

*/


/*
	static void access$100(Object obj, String s, Object aobj[])
		throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
	{
		expandFieldArray(obj, s, aobj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #95  <Method void expandFieldArray(Object, String, Object[])>
		return;
	//    4    6:return          
	}

*/


/*
	static Method access$200(Object obj, String s, Class aclass[])
		throws NoSuchMethodException
	{
		return findMethod(obj, s, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #102 <Method Method findMethod(Object, String, Class[])>
	//    4    6:areturn         
	}

*/
}
