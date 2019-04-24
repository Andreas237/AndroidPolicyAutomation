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

static final class MultiDex$c
{

	private static void a(ClassLoader classloader, List list, File file)
		throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
	{
		classloader = ((ClassLoader) (MultiDex.access$300(((Object) (classloader)), "pathList").get(((Object) (classloader)))));
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <String "pathList">
	//    2    3:invokestatic    #25  <Method Field MultiDex.access$300(Object, String)>
	//    3    6:aload_0         
	//    4    7:invokevirtual   #31  <Method Object Field.get(Object)>
	//    5   10:astore_0        
		MultiDex.access$400(((Object) (classloader)), "dexElements", a(((Object) (classloader)), new ArrayList(((java.util.Collection) (list))), file));
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
		return (Object[])(Object[])MultiDex.access$500(obj, "makeDexElements", new Class[] {
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
