// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import java.util.List;

// Referenced classes of package o:
//			mg, my, oc

public abstract class lz extends mg
	implements my
{

	public lz(List list, String s)
	{
		super(list, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #20  <Method void mg(List, String)>
		z = Color.rgb(140, 234, 255);
	//    4    6:aload_0         
	//    5    7:sipush          140
	//    6   10:sipush          234
	//    7   13:sipush          255
	//    8   16:invokestatic    #26  <Method int Color.rgb(int, int, int)>
	//    9   19:putfield        #28  <Field int z>
		w = 85;
	//   10   22:aload_0         
	//   11   23:bipush          85
	//   12   25:putfield        #30  <Field int w>
		y = 2.5F;
	//   13   28:aload_0         
	//   14   29:ldc1            #31  <Float 2.5F>
	//   15   31:putfield        #33  <Field float y>
		B = false;
	//   16   34:aload_0         
	//   17   35:iconst_0        
	//   18   36:putfield        #35  <Field boolean B>
	//   19   39:return          
	}

	public int O()
	{
		return z;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int z>
	//    2    4:ireturn         
	}

	public Drawable Q()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable q>
	//    2    4:areturn         
	}

	public int S()
	{
		return w;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int w>
	//    2    4:ireturn         
	}

	public boolean V()
	{
		return B;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean B>
	//    2    4:ireturn         
	}

	public float X()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field float y>
	//    2    4:freturn         
	}

	public void c(float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f < 0.0F)
	//*   2    2:fload_1         
	//*   3    3:fconst_0        
	//*   4    4:fcmpg           
	//*   5    5:ifge            10
			f1 = 0.0F;
	//    6    8:fconst_0        
	//    7    9:fstore_2        
		f = f1;
	//    8   10:fload_2         
	//    9   11:fstore_1        
		if(f1 > 10F)
	//*  10   12:fload_2         
	//*  11   13:ldc1            #52  <Float 10F>
	//*  12   15:fcmpl           
	//*  13   16:ifle            22
			f = 10F;
	//   14   19:ldc1            #52  <Float 10F>
	//   15   21:fstore_1        
		y = oc.b(f);
	//   16   22:aload_0         
	//   17   23:fload_1         
	//   18   24:invokestatic    #58  <Method float oc.b(float)>
	//   19   27:putfield        #33  <Field float y>
	//   20   30:return          
	}

	public void d(Drawable drawable)
	{
		q = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field Drawable q>
	//    3    5:return          
	}

	public void d(boolean flag)
	{
		B = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field boolean B>
	//    3    5:return          
	}

	private boolean B;
	protected Drawable q;
	private int w;
	private float y;
	private int z;
}
