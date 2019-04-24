// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;

public class ee
{

	public ee()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static String c(Context context)
	{
		o/ee;
	//    0    0:ldc1            #2   <Class ee>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		context = ((Context) (c));
	//    2    3:getstatic       #14  <Field String c>
	//    3    6:astore_0        
		o/ee;
	//    4    7:ldc1            #2   <Class ee>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return ((String) (context));
	//    6   10:aload_0         
	//    7   11:areturn         
		context;
	//    8   12:astore_0        
	//*   9   13:ldc1            #2   <Class ee>
		throw context;
	//   10   15:monitorexit     
	//   11   16:aload_0         
	//   12   17:athrow          
	}

	public static String d(Context context, int i)
	{
		return "";
	//    0    0:ldc1            #12  <String "">
	//    1    2:areturn         
	}

	private static volatile boolean b = false;
	private static volatile String c = "";

	static 
	{
	//    0    0:ldc1            #12  <String "">
	//    1    2:putstatic       #14  <Field String c>
	//    2    5:iconst_0        
	//    3    6:putstatic       #16  <Field boolean b>
	//*   4    9:return          
	}
}
