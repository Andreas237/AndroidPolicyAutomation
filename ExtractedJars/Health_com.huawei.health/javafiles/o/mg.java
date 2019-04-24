// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.DashPathEffect;
import java.util.List;

// Referenced classes of package o:
//			lw, mw, oc

public abstract class mg extends lw
	implements mw
{

	public mg(List list, String s)
	{
		super(list, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void lw(List, String)>
		t = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #20  <Field boolean t>
		u = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #22  <Field boolean u>
		x = 0.5F;
	//   10   16:aload_0         
	//   11   17:ldc1            #23  <Float 0.5F>
	//   12   19:putfield        #25  <Field float x>
		v = null;
	//   13   22:aload_0         
	//   14   23:aconst_null     
	//   15   24:putfield        #27  <Field DashPathEffect v>
		x = oc.b(0.5F);
	//   16   27:aload_0         
	//   17   28:ldc1            #23  <Float 0.5F>
	//   18   30:invokestatic    #33  <Method float oc.b(float)>
	//   19   33:putfield        #25  <Field float x>
	//   20   36:return          
	}

	public boolean T()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field boolean t>
	//    2    4:ireturn         
	}

	public boolean U()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean u>
	//    2    4:ireturn         
	}

	public float W()
	{
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float x>
	//    2    4:freturn         
	}

	public DashPathEffect Z()
	{
		return v;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field DashPathEffect v>
	//    2    4:areturn         
	}

	protected boolean t;
	protected boolean u;
	protected DashPathEffect v;
	protected float x;
}
