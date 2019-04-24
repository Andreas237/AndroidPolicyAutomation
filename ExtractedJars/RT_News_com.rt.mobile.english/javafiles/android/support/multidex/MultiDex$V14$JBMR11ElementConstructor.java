// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.multidex;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package android.support.multidex:
//			MultiDex

private static class MultiDex$V14$JBMR11ElementConstructor
	implements MultiDex.V14.ElementConstructor
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

	MultiDex$V14$JBMR11ElementConstructor(Class class1)
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
