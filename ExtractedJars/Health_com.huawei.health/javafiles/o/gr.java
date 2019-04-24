// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Callable;

// Referenced classes of package o:
//			gp

final class gr
	implements Callable
{

	gr(gp gp1, Context context, HashMap hashmap)
	{
		c = gp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field gp c>
		b = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Context b>
		e = hashmap;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #21  <Field HashMap e>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #24  <Method void Object()>
	//   11   19:return          
	}

	public final Object call()
		throws Exception
	{
		return ((Object) (gp.d(b, e)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field HashMap e>
	//    4    8:invokestatic    #35  <Method String gp.d(Context, HashMap)>
	//    5   11:areturn         
	}

	final Context b;
	final gp c;
	final HashMap e;
}
