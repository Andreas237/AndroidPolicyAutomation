// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;


// Referenced classes of package android.support.constraint.solver.widgets:
//			ResolutionNode

public class ResolutionDimension extends ResolutionNode
{

	public ResolutionDimension()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void ResolutionNode()>
		value = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #12  <Field float value>
	//    5    9:return          
	}

	public void remove()
	{
		state = 2;
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:putfield        #18  <Field int state>
	//    3    5:return          
	}

	public void reset()
	{
		super.reset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void ResolutionNode.reset()>
		value = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #12  <Field float value>
	//    5    9:return          
	}

	public void resolve(int i)
	{
		if(state == 0 || value != (float)i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field int state>
	//*   2    4:ifeq            17
	//*   3    7:aload_0         
	//*   4    8:getfield        #12  <Field float value>
	//*   5   11:iload_1         
	//*   6   12:i2f             
	//*   7   13:fcmpl           
	//*   8   14:ifeq            39
		{
			value = i;
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:i2f             
	//   12   20:putfield        #12  <Field float value>
			if(state == 1)
	//*  13   23:aload_0         
	//*  14   24:getfield        #18  <Field int state>
	//*  15   27:iconst_1        
	//*  16   28:icmpne          35
				invalidate();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #26  <Method void invalidate()>
			didResolve();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #29  <Method void didResolve()>
		}
	//   21   39:return          
	}

	float value;
}
