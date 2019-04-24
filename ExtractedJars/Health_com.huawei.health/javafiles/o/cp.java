// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;

// Referenced classes of package o:
//			de, df, cm, cg

public final class cp extends de
{

	public cp(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void de()>
		d = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Context d>
	//    5    9:return          
	}

	static Context a(cp cp1)
	{
		return cp1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context d>
	//    2    4:areturn         
	}

	public final Object d(Class class1, cg cg)
	{
		return (new df(((ck) (new cm(this, cg))))).e(class1);
	//    0    0:new             #19  <Class df>
	//    1    3:dup             
	//    2    4:new             #21  <Class cm>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokespecial   #24  <Method void cm(cp, cg)>
	//    7   13:invokespecial   #27  <Method void df(ck)>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #31  <Method Object df.e(Class)>
	//   10   20:areturn         
	}

	private Context d;
}
