// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.status;


// Referenced classes of package ch.qos.logback.core.status:
//			StatusBase

public class InfoStatus extends StatusBase
{

	public InfoStatus(String s, Object obj)
	{
		super(0, s, obj);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #9   <Method void StatusBase(int, String, Object)>
	//    5    7:return          
	}

	public InfoStatus(String s, Object obj, Throwable throwable)
	{
		super(0, s, obj, throwable);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #14  <Method void StatusBase(int, String, Object, Throwable)>
	//    6    8:return          
	}
}
