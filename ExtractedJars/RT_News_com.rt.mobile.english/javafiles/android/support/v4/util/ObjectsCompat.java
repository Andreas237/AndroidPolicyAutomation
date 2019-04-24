// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.util.Arrays;
import java.util.Objects;

public class ObjectsCompat
{

	private ObjectsCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean equals(Object obj, Object obj1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          14
			return Objects.equals(obj, obj1);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokestatic    #22  <Method boolean Objects.equals(Object, Object)>
	//    6   13:ireturn         
		return obj == obj1 || obj != null && obj.equals(obj1);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:if_acmpeq       36
	//   10   19:aload_0         
	//   11   20:ifnull          34
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #25  <Method boolean Object.equals(Object)>
	//   15   28:ifeq            34
	//   16   31:goto            36
	//   17   34:iconst_0        
	//   18   35:ireturn         
	//   19   36:iconst_1        
	//   20   37:ireturn         
	}

	public static transient int hash(Object aobj[])
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return Objects.hash(aobj);
	//    3    8:aload_0         
	//    4    9:invokestatic    #30  <Method int Objects.hash(Object[])>
	//    5   12:ireturn         
		else
			return Arrays.hashCode(aobj);
	//    6   13:aload_0         
	//    7   14:invokestatic    #35  <Method int Arrays.hashCode(Object[])>
	//    8   17:ireturn         
	}

	public static int hashCode(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
			return obj.hashCode();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #39  <Method int Object.hashCode()>
	//    4    8:ireturn         
		else
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}
}
