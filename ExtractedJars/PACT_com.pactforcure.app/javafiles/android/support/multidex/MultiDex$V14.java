// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.multidex;

import java.io.File;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.multidex:
//			MultiDex

private static final class MultiDex$V14
{

	private static void install(ClassLoader classloader, List list, File file)
		throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
	{
		classloader = ((ClassLoader) (MultiDex.access$300(((Object) (classloader)), "pathList").get(((Object) (classloader)))));
	//    0    0:aload_0         
	//    1    1:ldc1            #30  <String "pathList">
	//    2    3:invokestatic    #34  <Method Field MultiDex.access$300(Object, String)>
	//    3    6:aload_0         
	//    4    7:invokevirtual   #40  <Method Object Field.get(Object)>
	//    5   10:astore_0        
		MultiDex.access$400(((Object) (classloader)), "dexElements", makeDexElements(((Object) (classloader)), new ArrayList(((java.util.Collection) (list))), file));
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
		return (Object[])(Object[])MultiDex.access$500(obj, "makeDexElements", new Class[] {
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

	private MultiDex$V14()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
