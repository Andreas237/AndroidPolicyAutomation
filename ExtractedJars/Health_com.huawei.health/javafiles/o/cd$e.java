// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.util.Log;

// Referenced classes of package o:
//			cd

static final class cd$e
{

	static void b(cd$e cd$e1, String s)
	{
		Log.println(cd$e1.b, cd$e1.e, s);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int b>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field String e>
	//    4    8:aload_1         
	//    5    9:invokestatic    #21  <Method int Log.println(int, String, String)>
	//    6   12:pop             
	//    7   13:return          
	}

	static boolean c(cd$e cd$e1)
	{
		return Log.isLoggable(cd$e1.e, cd$e1.b);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String e>
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field int b>
	//    4    8:invokestatic    #28  <Method boolean Log.isLoggable(String, int)>
	//    5   11:ireturn         
	}

	private final int b;
	private final String e;
}
