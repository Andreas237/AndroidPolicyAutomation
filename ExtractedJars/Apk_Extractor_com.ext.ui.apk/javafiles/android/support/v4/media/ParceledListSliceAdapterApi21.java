// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

class ParceledListSliceAdapterApi21
{

	ParceledListSliceAdapterApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:return          
	}

	static Object newInstance(List list)
	{
		list = ((List) (sConstructor.newInstance(new Object[] {
			list
		})));
	//    0    0:getstatic       #31  <Field Constructor sConstructor>
	//    1    3:iconst_1        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:aastore         
	//    7   11:invokevirtual   #53  <Method Object Constructor.newInstance(Object[])>
	//    8   14:astore_0        
		return ((Object) (list));
	//    9   15:aload_0         
	//   10   16:areturn         
		list;
	//   11   17:astore_0        
_L2:
		((ReflectiveOperationException) (list)).printStackTrace();
	//   12   18:aload_0         
	//   13   19:invokevirtual   #36  <Method void ReflectiveOperationException.printStackTrace()>
		return ((Object) (null));
	//   14   22:aconst_null     
	//   15   23:areturn         
		list;
	//   16   24:astore_0        
		continue; /* Loop/switch isn't completed */
	//   17   25:goto            18
		list;
	//   18   28:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  19   29:goto            18
	}

	private static Constructor sConstructor;

	static 
	{
		sConstructor = Class.forName("android.content.pm.ParceledListSlice").getConstructor(new Class[] {
			java/util/List
		});
	//    0    0:ldc1            #17  <String "android.content.pm.ParceledListSlice">
	//    1    2:invokestatic    #23  <Method Class Class.forName(String)>
	//    2    5:iconst_1        
	//    3    6:anewarray       Class[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:ldc1            #25  <Class List>
	//    7   13:aastore         
	//    8   14:invokevirtual   #29  <Method Constructor Class.getConstructor(Class[])>
	//    9   17:putstatic       #31  <Field Constructor sConstructor>
		return;
	//   10   20:return          
		Object obj;
		obj;
	//   11   21:astore_0        
_L2:
		((ReflectiveOperationException) (obj)).printStackTrace();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #36  <Method void ReflectiveOperationException.printStackTrace()>
		return;
	//   14   26:return          
		obj;
	//   15   27:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  16   28:goto            22
	}
}
