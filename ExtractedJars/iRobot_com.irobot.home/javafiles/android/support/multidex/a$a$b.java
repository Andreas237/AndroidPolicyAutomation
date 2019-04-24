// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.multidex;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.zip.ZipFile;

// Referenced classes of package android.support.multidex:
//			a

private static class a$a$b
	implements a$a$a
{

	public Object a(File file, DexFile dexfile)
	{
		return a.newInstance(new Object[] {
			file, new ZipFile(file), dexfile
		});
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Constructor a>
	//    2    4:iconst_3        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:aastore         
	//    8   12:dup             
	//    9   13:iconst_1        
	//   10   14:new             #25  <Class ZipFile>
	//   11   17:dup             
	//   12   18:aload_1         
	//   13   19:invokespecial   #46  <Method void ZipFile(File)>
	//   14   22:aastore         
	//   15   23:dup             
	//   16   24:iconst_2        
	//   17   25:aload_2         
	//   18   26:aastore         
	//   19   27:invokevirtual   #50  <Method Object Constructor.newInstance(Object[])>
	//   20   30:areturn         
	}

	private final Constructor a;

	a$a$b(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		a = class1.getConstructor(new Class[] {
			java/io/File, java/util/zip/ZipFile, dalvik/system/DexFile
		});
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_3        
	//    5    7:anewarray       Class[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:ldc1            #23  <Class File>
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_1        
	//   12   17:ldc1            #25  <Class ZipFile>
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:ldc1            #27  <Class DexFile>
	//   17   24:aastore         
	//   18   25:invokevirtual   #31  <Method Constructor Class.getConstructor(Class[])>
	//   19   28:putfield        #33  <Field Constructor a>
		a.setAccessible(true);
	//   20   31:aload_0         
	//   21   32:getfield        #33  <Field Constructor a>
	//   22   35:iconst_1        
	//   23   36:invokevirtual   #39  <Method void Constructor.setAccessible(boolean)>
	//   24   39:return          
	}
}
