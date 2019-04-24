// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.Color;
import java.util.List;

// Referenced classes of package o:
//			mb, mv

public abstract class lw extends mb
	implements mv
{

	public lw(List list, String s)
	{
		super(list, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void mb(List, String)>
		e = Color.rgb(255, 187, 115);
	//    4    6:aload_0         
	//    5    7:sipush          255
	//    6   10:sipush          187
	//    7   13:bipush          115
	//    8   15:invokestatic    #19  <Method int Color.rgb(int, int, int)>
	//    9   18:putfield        #21  <Field int e>
	//   10   21:return          
	}

	public void d(int i)
	{
		e = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field int e>
	//    3    5:return          
	}

	public int f()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int e>
	//    2    4:ireturn         
	}

	protected int e;
}
