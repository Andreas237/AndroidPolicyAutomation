// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//			SwipeRefreshLayout, b, c

class SwipeRefreshLayout$6 extends Animation
{

	public void applyTransformation(float f, Transformation transformation)
	{
		int i;
		if(!a.l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field SwipeRefreshLayout a>
	//*   2    4:getfield        #22  <Field boolean SwipeRefreshLayout.l>
	//*   3    7:ifne            32
			i = a.i - Math.abs(a.h);
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field SwipeRefreshLayout a>
	//    6   14:getfield        #26  <Field int SwipeRefreshLayout.i>
	//    7   17:aload_0         
	//    8   18:getfield        #12  <Field SwipeRefreshLayout a>
	//    9   21:getfield        #29  <Field int SwipeRefreshLayout.h>
	//   10   24:invokestatic    #35  <Method int Math.abs(int)>
	//   11   27:isub            
	//   12   28:istore_3        
		else
	//*  13   29:goto            40
			i = a.i;
	//   14   32:aload_0         
	//   15   33:getfield        #12  <Field SwipeRefreshLayout a>
	//   16   36:getfield        #26  <Field int SwipeRefreshLayout.i>
	//   17   39:istore_3        
		int j = a.f;
	//   18   40:aload_0         
	//   19   41:getfield        #12  <Field SwipeRefreshLayout a>
	//   20   44:getfield        #38  <Field int SwipeRefreshLayout.f>
	//   21   47:istore          4
		i = (int)((float)(i - a.f) * f);
	//   22   49:iload_3         
	//   23   50:aload_0         
	//   24   51:getfield        #12  <Field SwipeRefreshLayout a>
	//   25   54:getfield        #38  <Field int SwipeRefreshLayout.f>
	//   26   57:isub            
	//   27   58:i2f             
	//   28   59:fload_1         
	//   29   60:fmul            
	//   30   61:f2i             
	//   31   62:istore_3        
		int k = a.e.getTop();
	//   32   63:aload_0         
	//   33   64:getfield        #12  <Field SwipeRefreshLayout a>
	//   34   67:getfield        #42  <Field b SwipeRefreshLayout.e>
	//   35   70:invokevirtual   #48  <Method int b.getTop()>
	//   36   73:istore          5
		a.setTargetOffsetTopAndBottom((j + i) - k);
	//   37   75:aload_0         
	//   38   76:getfield        #12  <Field SwipeRefreshLayout a>
	//   39   79:iload           4
	//   40   81:iload_3         
	//   41   82:iadd            
	//   42   83:iload           5
	//   43   85:isub            
	//   44   86:invokevirtual   #52  <Method void SwipeRefreshLayout.setTargetOffsetTopAndBottom(int)>
		a.j.b(1.0F - f);
	//   45   89:aload_0         
	//   46   90:getfield        #12  <Field SwipeRefreshLayout a>
	//   47   93:getfield        #56  <Field c SwipeRefreshLayout.j>
	//   48   96:fconst_1        
	//   49   97:fload_1         
	//   50   98:fsub            
	//   51   99:invokevirtual   #62  <Method void c.b(float)>
	//   52  102:return          
	}

	final SwipeRefreshLayout a;

	SwipeRefreshLayout$6(SwipeRefreshLayout swiperefreshlayout)
	{
		a = swiperefreshlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field SwipeRefreshLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Animation()>
	//    5    9:return          
	}
}
