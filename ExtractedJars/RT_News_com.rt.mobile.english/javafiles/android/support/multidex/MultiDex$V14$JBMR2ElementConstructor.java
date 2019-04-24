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

private static class MultiDex$V14$JBMR2ElementConstructor
	implements MultiDex.V14.ElementConstructor
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

	MultiDex$V14$JBMR2ElementConstructor(Class class1)
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
