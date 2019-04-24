// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.spi;


// Referenced classes of package ch.qos.logback.core.joran.spi:
//			NoAutoStart

public class NoAutoStartUtil
{

	public NoAutoStartUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean notMarkedWithNoAutoStart(Object obj)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(obj == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		if((NoAutoStart)obj.getClass().getAnnotation(ch/qos/logback/core/joran/spi/NoAutoStart) == null)
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #15  <Method Class Object.getClass()>
	//*   8   12:ldc1            #17  <Class NoAutoStart>
	//*   9   14:invokevirtual   #23  <Method java.lang.annotation.Annotation Class.getAnnotation(Class)>
	//*  10   17:checkcast       #17  <Class NoAutoStart>
	//*  11   20:ifnonnull       25
			flag = true;
	//   12   23:iconst_1        
	//   13   24:istore_1        
		return flag;
	//   14   25:iload_1         
	//   15   26:ireturn         
	}
}
