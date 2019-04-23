// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.widget.al;
import android.support.v4.widget.ao;
import android.view.*;

// Referenced classes of package android.support.design.widget:
//			aj, bz, CoordinatorLayout, ca

public class SwipeDismissBehavior extends aj
{

	public SwipeDismissBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void aj()>
		h = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #26  <Field float h>
		c = 2;
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:putfield        #28  <Field int c>
		d = 0.5F;
	//    8   14:aload_0         
	//    9   15:ldc1            #29  <Float 0.5F>
	//   10   17:putfield        #31  <Field float d>
		e = 0.0F;
	//   11   20:aload_0         
	//   12   21:fconst_0        
	//   13   22:putfield        #33  <Field float e>
		f = 0.5F;
	//   14   25:aload_0         
	//   15   26:ldc1            #29  <Float 0.5F>
	//   16   28:putfield        #35  <Field float f>
	//   17   31:aload_0         
	//   18   32:new             #37  <Class bz>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:invokespecial   #40  <Method void bz(SwipeDismissBehavior)>
	//   22   40:putfield        #42  <Field ao j>
	//   23   43:return          
	}

	static float a(float f1, float f2, float f3)
	{
		return Math.min(Math.max(f1, f2), f3);
	//    0    0:fload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #50  <Method float Math.max(float, float)>
	//    3    5:fload_2         
	//    4    6:invokestatic    #53  <Method float Math.min(float, float)>
	//    5    9:freturn         
	}

	static int a(int k, int l, int i1)
	{
		return Math.min(Math.max(k, l), i1);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #57  <Method int Math.max(int, int)>
	//    3    5:iload_2         
	//    4    6:invokestatic    #59  <Method int Math.min(int, int)>
	//    5    9:ireturn         
	}

	private void a(ViewGroup viewgroup)
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field al a>
	//*   2    4:ifnonnull       44
		{
			if(i)
	//*   3    7:aload_0         
	//*   4    8:getfield        #64  <Field boolean i>
	//*   5   11:ifeq            30
				viewgroup = ((ViewGroup) (al.a(viewgroup, h, j)));
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:getfield        #26  <Field float h>
	//    9   19:aload_0         
	//   10   20:getfield        #42  <Field ao j>
	//   11   23:invokestatic    #69  <Method al al.a(ViewGroup, float, ao)>
	//   12   26:astore_1        
			else
	//*  13   27:goto            39
				viewgroup = ((ViewGroup) (al.a(viewgroup, j)));
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #42  <Field ao j>
	//   17   35:invokestatic    #72  <Method al al.a(ViewGroup, ao)>
	//   18   38:astore_1        
			a = ((al) (viewgroup));
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:putfield        #62  <Field al a>
		}
	//   22   44:return          
	}

	static float b(float f1, float f2, float f3)
	{
		return (f3 - f1) / (f2 - f1);
	//    0    0:fload_2         
	//    1    1:fload_0         
	//    2    2:fsub            
	//    3    3:fload_1         
	//    4    4:fload_0         
	//    5    5:fsub            
	//    6    6:fdiv            
	//    7    7:freturn         
	}

	public void a(float f1)
	{
		e = a(0.0F, f1, 1.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:fconst_1        
	//    4    4:invokestatic    #75  <Method float a(float, float, float)>
	//    5    7:putfield        #33  <Field float e>
	//    6   10:return          
	}

	public void a(int k)
	{
		c = k;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int c>
	//    3    5:return          
	}

	public void a(ca ca)
	{
		b = ca;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #79  <Field ca b>
	//    3    5:return          
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		coordinatorlayout = ((CoordinatorLayout) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field al a>
	//    2    4:astore_1        
		if(coordinatorlayout != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
		{
			((al) (coordinatorlayout)).b(motionevent);
	//    5    9:aload_1         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #83  <Method void al.b(MotionEvent)>
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		} else
		{
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		}
	}

	public boolean a(View view)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void b(float f1)
	{
		f = a(0.0F, f1, 1.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:fconst_1        
	//    4    4:invokestatic    #75  <Method float a(float, float, float)>
	//    5    7:putfield        #35  <Field float f>
	//    6   10:return          
	}

	public boolean b(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		int k;
		boolean flag;
		flag = g;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field boolean g>
	//    2    4:istore          5
		k = motionevent.getActionMasked();
	//    3    6:aload_3         
	//    4    7:invokevirtual   #92  <Method int MotionEvent.getActionMasked()>
	//    5   10:istore          4
		if(k == 3) goto _L2; else goto _L1
	//    6   12:iload           4
	//    7   14:iconst_3        
	//    8   15:icmpeq          75
_L1:
		k;
	//    9   18:iload           4
		JVM INSTR tableswitch 0 1: default 44
	//	               0 47
	//	               1 75;
	//   10   20:tableswitch     0 1: default 44
	//	               0 47
	//	               1 75
		   goto _L3 _L4 _L2
_L3:
		break; /* Loop/switch isn't completed */
	//   11   44:goto            80
_L4:
		g = coordinatorlayout.a(view, (int)motionevent.getX(), (int)motionevent.getY());
	//   12   47:aload_0         
	//   13   48:aload_1         
	//   14   49:aload_2         
	//   15   50:aload_3         
	//   16   51:invokevirtual   #96  <Method float MotionEvent.getX()>
	//   17   54:f2i             
	//   18   55:aload_3         
	//   19   56:invokevirtual   #99  <Method float MotionEvent.getY()>
	//   20   59:f2i             
	//   21   60:invokevirtual   #104 <Method boolean CoordinatorLayout.a(View, int, int)>
	//   22   63:putfield        #86  <Field boolean g>
		flag = g;
	//   23   66:aload_0         
	//   24   67:getfield        #86  <Field boolean g>
	//   25   70:istore          5
		break; /* Loop/switch isn't completed */
	//   26   72:goto            80
_L2:
		g = false;
	//   27   75:aload_0         
	//   28   76:iconst_0        
	//   29   77:putfield        #86  <Field boolean g>
		if(flag)
	//*  30   80:iload           5
	//*  31   82:ifeq            99
		{
			a(((ViewGroup) (coordinatorlayout)));
	//   32   85:aload_0         
	//   33   86:aload_1         
	//   34   87:invokespecial   #106 <Method void a(ViewGroup)>
			return a.a(motionevent);
	//   35   90:aload_0         
	//   36   91:getfield        #62  <Field al a>
	//   37   94:aload_3         
	//   38   95:invokevirtual   #109 <Method boolean al.a(MotionEvent)>
	//   39   98:ireturn         
		} else
		{
			return false;
	//   40   99:iconst_0        
	//   41  100:ireturn         
		}
	}

	al a;
	ca b;
	int c;
	float d;
	float e;
	float f;
	private boolean g;
	private float h;
	private boolean i;
	private final ao j = new bz(this);
}
