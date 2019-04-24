// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.multidex;

import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.*;
import java.util.List;
import java.util.zip.ZipFile;

// Referenced classes of package android.support.multidex:
//			MultiDex

private static final class MultiDex$V14
{
	private static interface ElementConstructor
	{

		public abstract Object newInstance(File file, DexFile dexfile)
			throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
	}

	private static class ICSElementConstructor
		implements ElementConstructor
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

		ICSElementConstructor(Class class1)
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

	private static class JBMR11ElementConstructor
		implements ElementConstructor
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

		JBMR11ElementConstructor(Class class1)
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

	private static class JBMR2ElementConstructor
		implements ElementConstructor
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

		JBMR2ElementConstructor(Class class1)
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


	static void install(ClassLoader classloader, List list)
		throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException
	{
		classloader = ((ClassLoader) (MultiDex.access$000(((Object) (classloader)), "pathList").get(((Object) (classloader)))));
	//    0    0:aload_0         
	//    1    1:ldc1            #77  <String "pathList">
	//    2    3:invokestatic    #81  <Method Field MultiDex.access$000(Object, String)>
	//    3    6:aload_0         
	//    4    7:invokevirtual   #87  <Method Object Field.get(Object)>
	//    5   10:astore_0        
		list = ((List) ((new MultiDex$V14()).makeDexElements(list)));
	//    6   11:new             #2   <Class MultiDex$V14>
	//    7   14:dup             
	//    8   15:invokespecial   #88  <Method void MultiDex$V14()>
	//    9   18:aload_1         
	//   10   19:invokespecial   #92  <Method Object[] makeDexElements(List)>
	//   11   22:astore_1        
		try
		{
			MultiDex.access$100(((Object) (classloader)), "dexElements", ((Object []) (list)));
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
		MultiDex.access$100(((Object) (classloader)), "pathElements", ((Object []) (list)));
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

	private MultiDex$V14()
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
