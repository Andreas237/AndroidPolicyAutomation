// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.design.widget:
//			SwipeDismissBehavior

class SwipeDismissBehavior$3 extends android.support.v4.widget.
{

	private boolean a(View view, float f)
	{
		if(f != 0.0F)
	//*   0    0:fload_2         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifeq            106
		{
			boolean flag;
			if(ViewCompat.getLayoutDirection(view) == 1)
	//*   4    6:aload_1         
	//*   5    7:invokestatic    #28  <Method int ViewCompat.getLayoutDirection(View)>
	//*   6   10:iconst_1        
	//*   7   11:icmpne          19
				flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_3        
			else
	//*  10   16:goto            21
				flag = false;
	//   11   19:iconst_0        
	//   12   20:istore_3        
			if(d.mSwipeDirection == 2)
	//*  13   21:aload_0         
	//*  14   22:getfield        #15  <Field SwipeDismissBehavior d>
	//*  15   25:getfield        #31  <Field int SwipeDismissBehavior.mSwipeDirection>
	//*  16   28:iconst_2        
	//*  17   29:icmpne          34
				return true;
	//   18   32:iconst_1        
	//   19   33:ireturn         
			if(d.mSwipeDirection == 0)
	//*  20   34:aload_0         
	//*  21   35:getfield        #15  <Field SwipeDismissBehavior d>
	//*  22   38:getfield        #31  <Field int SwipeDismissBehavior.mSwipeDirection>
	//*  23   41:ifne            68
			{
				if(flag)
	//*  24   44:iload_3         
	//*  25   45:ifeq            58
					return f < 0.0F;
	//   26   48:fload_2         
	//   27   49:fconst_0        
	//   28   50:fcmpg           
	//   29   51:ifge            56
	//   30   54:iconst_1        
	//   31   55:ireturn         
	//   32   56:iconst_0        
	//   33   57:ireturn         
				return f > 0.0F;
	//   34   58:fload_2         
	//   35   59:fconst_0        
	//   36   60:fcmpl           
	//   37   61:ifle            66
	//   38   64:iconst_1        
	//   39   65:ireturn         
	//   40   66:iconst_0        
	//   41   67:ireturn         
			}
			int i;
			int j;
			int k;
			if(d.mSwipeDirection == 1)
	//*  42   68:aload_0         
	//*  43   69:getfield        #15  <Field SwipeDismissBehavior d>
	//*  44   72:getfield        #31  <Field int SwipeDismissBehavior.mSwipeDirection>
	//*  45   75:iconst_1        
	//*  46   76:icmpne          103
			{
				if(flag)
	//*  47   79:iload_3         
	//*  48   80:ifeq            93
					return f > 0.0F;
	//   49   83:fload_2         
	//   50   84:fconst_0        
	//   51   85:fcmpl           
	//   52   86:ifle            91
	//   53   89:iconst_1        
	//   54   90:ireturn         
	//   55   91:iconst_0        
	//   56   92:ireturn         
				return f < 0.0F;
	//   57   93:fload_2         
	//   58   94:fconst_0        
	//   59   95:fcmpg           
	//   60   96:ifge            101
	//   61   99:iconst_1        
	//   62  100:ireturn         
	//   63  101:iconst_0        
	//   64  102:ireturn         
			} else
	//*  65  103:goto            151
	//*  66  106:aload_1         
	//*  67  107:invokevirtual   #37  <Method int View.getLeft()>
	//*  68  110:istore_3        
	//*  69  111:aload_0         
	//*  70  112:getfield        #39  <Field int a>
	//*  71  115:istore          4
	//*  72  117:aload_1         
	//*  73  118:invokevirtual   #42  <Method int View.getWidth()>
	//*  74  121:i2f             
	//*  75  122:aload_0         
	//*  76  123:getfield        #15  <Field SwipeDismissBehavior d>
	//*  77  126:getfield        #46  <Field float SwipeDismissBehavior.mDragDismissThreshold>
	//*  78  129:fmul            
	//*  79  130:invokestatic    #52  <Method int Math.round(float)>
	//*  80  133:istore          5
	//*  81  135:iload_3         
	//*  82  136:iload           4
	//*  83  138:isub            
	//*  84  139:invokestatic    #56  <Method int Math.abs(int)>
	//*  85  142:iload           5
	//*  86  144:icmplt          149
	//*  87  147:iconst_1        
	//*  88  148:ireturn         
	//*  89  149:iconst_0        
	//*  90  150:ireturn         
			{
				return false;
	//   91  151:iconst_0        
	//   92  152:ireturn         
			}
		}
		i = view.getLeft();
		j = a;
		k = Math.round((float)view.getWidth() * d.mDragDismissThreshold);
		return Math.abs(i - j) >= k;
	}

	public int clampViewPositionHorizontal(View view, int i, int j)
	{
		if(ViewCompat.getLayoutDirection(view) == 1)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #28  <Method int ViewCompat.getLayoutDirection(View)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			j = 1;
	//    4    8:iconst_1        
	//    5    9:istore_3        
		else
	//*   6   10:goto            15
			j = 0;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		int k;
		if(d.mSwipeDirection == 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #15  <Field SwipeDismissBehavior d>
	//*  11   19:getfield        #31  <Field int SwipeDismissBehavior.mSwipeDirection>
	//*  12   22:ifne            67
		{
			if(j != 0)
	//*  13   25:iload_3         
	//*  14   26:ifeq            48
			{
				j = a - view.getWidth();
	//   15   29:aload_0         
	//   16   30:getfield        #39  <Field int a>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #42  <Method int View.getWidth()>
	//   19   37:isub            
	//   20   38:istore_3        
				k = a;
	//   21   39:aload_0         
	//   22   40:getfield        #39  <Field int a>
	//   23   43:istore          4
			} else
	//*  24   45:goto            141
			{
				j = a;
	//   25   48:aload_0         
	//   26   49:getfield        #39  <Field int a>
	//   27   52:istore_3        
				k = a + view.getWidth();
	//   28   53:aload_0         
	//   29   54:getfield        #39  <Field int a>
	//   30   57:aload_1         
	//   31   58:invokevirtual   #42  <Method int View.getWidth()>
	//   32   61:iadd            
	//   33   62:istore          4
			}
		} else
	//*  34   64:goto            141
		if(d.mSwipeDirection == 1)
	//*  35   67:aload_0         
	//*  36   68:getfield        #15  <Field SwipeDismissBehavior d>
	//*  37   71:getfield        #31  <Field int SwipeDismissBehavior.mSwipeDirection>
	//*  38   74:iconst_1        
	//*  39   75:icmpne          120
		{
			if(j != 0)
	//*  40   78:iload_3         
	//*  41   79:ifeq            101
			{
				j = a;
	//   42   82:aload_0         
	//   43   83:getfield        #39  <Field int a>
	//   44   86:istore_3        
				k = a + view.getWidth();
	//   45   87:aload_0         
	//   46   88:getfield        #39  <Field int a>
	//   47   91:aload_1         
	//   48   92:invokevirtual   #42  <Method int View.getWidth()>
	//   49   95:iadd            
	//   50   96:istore          4
			} else
	//*  51   98:goto            141
			{
				j = a - view.getWidth();
	//   52  101:aload_0         
	//   53  102:getfield        #39  <Field int a>
	//   54  105:aload_1         
	//   55  106:invokevirtual   #42  <Method int View.getWidth()>
	//   56  109:isub            
	//   57  110:istore_3        
				k = a;
	//   58  111:aload_0         
	//   59  112:getfield        #39  <Field int a>
	//   60  115:istore          4
			}
		} else
	//*  61  117:goto            141
		{
			j = a - view.getWidth();
	//   62  120:aload_0         
	//   63  121:getfield        #39  <Field int a>
	//   64  124:aload_1         
	//   65  125:invokevirtual   #42  <Method int View.getWidth()>
	//   66  128:isub            
	//   67  129:istore_3        
			k = a + view.getWidth();
	//   68  130:aload_0         
	//   69  131:getfield        #39  <Field int a>
	//   70  134:aload_1         
	//   71  135:invokevirtual   #42  <Method int View.getWidth()>
	//   72  138:iadd            
	//   73  139:istore          4
		}
		return SwipeDismissBehavior.clamp(j, i, k);
	//   74  141:iload_3         
	//   75  142:iload_2         
	//   76  143:iload           4
	//   77  145:invokestatic    #62  <Method int SwipeDismissBehavior.clamp(int, int, int)>
	//   78  148:ireturn         
	}

	public int clampViewPositionVertical(View view, int i, int j)
	{
		return view.getTop();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #66  <Method int View.getTop()>
	//    2    4:ireturn         
	}

	public int getViewHorizontalDragRange(View view)
	{
		return view.getWidth();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #42  <Method int View.getWidth()>
	//    2    4:ireturn         
	}

	public void onViewCaptured(View view, int i)
	{
		e = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #20  <Field int e>
		a = view.getLeft();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #37  <Method int View.getLeft()>
	//    6   10:putfield        #39  <Field int a>
		view = ((View) (view.getParent()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #73  <Method ViewParent View.getParent()>
	//    9   17:astore_1        
		if(view != null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          29
			((ViewParent) (view)).requestDisallowInterceptTouchEvent(true);
	//   12   22:aload_1         
	//   13   23:iconst_1        
	//   14   24:invokeinterface #79  <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//   15   29:return          
	}

	public void onViewDragStateChanged(int i)
	{
		if(d.mListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field SwipeDismissBehavior d>
	//*   2    4:getfield        #85  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.mListener>
	//*   3    7:ifnull          23
			d.mListener.onDragStateChanged(i);
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field SwipeDismissBehavior d>
	//    6   14:getfield        #85  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.mListener>
	//    7   17:iload_1         
	//    8   18:invokeinterface #90  <Method void SwipeDismissBehavior$OnDismissListener.onDragStateChanged(int)>
	//    9   23:return          
	}

	public void onViewPositionChanged(View view, int i, int j, int k, int l)
	{
		float f = (float)a + (float)view.getWidth() * d.mAlphaStartSwipeDistance;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int a>
	//    2    4:i2f             
	//    3    5:aload_1         
	//    4    6:invokevirtual   #42  <Method int View.getWidth()>
	//    5    9:i2f             
	//    6   10:aload_0         
	//    7   11:getfield        #15  <Field SwipeDismissBehavior d>
	//    8   14:getfield        #95  <Field float SwipeDismissBehavior.mAlphaStartSwipeDistance>
	//    9   17:fmul            
	//   10   18:fadd            
	//   11   19:fstore          6
		float f1 = (float)a + (float)view.getWidth() * d.mAlphaEndSwipeDistance;
	//   12   21:aload_0         
	//   13   22:getfield        #39  <Field int a>
	//   14   25:i2f             
	//   15   26:aload_1         
	//   16   27:invokevirtual   #42  <Method int View.getWidth()>
	//   17   30:i2f             
	//   18   31:aload_0         
	//   19   32:getfield        #15  <Field SwipeDismissBehavior d>
	//   20   35:getfield        #98  <Field float SwipeDismissBehavior.mAlphaEndSwipeDistance>
	//   21   38:fmul            
	//   22   39:fadd            
	//   23   40:fstore          7
		if((float)i <= f)
	//*  24   42:iload_2         
	//*  25   43:i2f             
	//*  26   44:fload           6
	//*  27   46:fcmpg           
	//*  28   47:ifgt            56
		{
			view.setAlpha(1.0F);
	//   29   50:aload_1         
	//   30   51:fconst_1        
	//   31   52:invokevirtual   #102 <Method void View.setAlpha(float)>
			return;
	//   32   55:return          
		}
		if((float)i >= f1)
	//*  33   56:iload_2         
	//*  34   57:i2f             
	//*  35   58:fload           7
	//*  36   60:fcmpl           
	//*  37   61:iflt            70
		{
			view.setAlpha(0.0F);
	//   38   64:aload_1         
	//   39   65:fconst_0        
	//   40   66:invokevirtual   #102 <Method void View.setAlpha(float)>
			return;
	//   41   69:return          
		} else
		{
			view.setAlpha(SwipeDismissBehavior.clamp(0.0F, 1.0F - SwipeDismissBehavior.fraction(f, f1, i), 1.0F));
	//   42   70:aload_1         
	//   43   71:fconst_0        
	//   44   72:fconst_1        
	//   45   73:fload           6
	//   46   75:fload           7
	//   47   77:iload_2         
	//   48   78:i2f             
	//   49   79:invokestatic    #106 <Method float SwipeDismissBehavior.fraction(float, float, float)>
	//   50   82:fsub            
	//   51   83:fconst_1        
	//   52   84:invokestatic    #108 <Method float SwipeDismissBehavior.clamp(float, float, float)>
	//   53   87:invokevirtual   #102 <Method void View.setAlpha(float)>
			return;
	//   54   90:return          
		}
	}

	public void onViewReleased(View view, float f, float f1)
	{
		e = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #20  <Field int e>
		int i = view.getWidth();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #42  <Method int View.getWidth()>
	//    5    9:istore          4
		boolean flag = false;
	//    6   11:iconst_0        
	//    7   12:istore          5
		if(a(view, f))
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:fload_2         
	//*  11   17:invokespecial   #112 <Method boolean a(View, float)>
	//*  12   20:ifeq            61
		{
			if(view.getLeft() < a)
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #37  <Method int View.getLeft()>
	//*  15   27:aload_0         
	//*  16   28:getfield        #39  <Field int a>
	//*  17   31:icmpge          46
				i = a - i;
	//   18   34:aload_0         
	//   19   35:getfield        #39  <Field int a>
	//   20   38:iload           4
	//   21   40:isub            
	//   22   41:istore          4
			else
	//*  23   43:goto            55
				i = a + i;
	//   24   46:aload_0         
	//   25   47:getfield        #39  <Field int a>
	//   26   50:iload           4
	//   27   52:iadd            
	//   28   53:istore          4
			flag = true;
	//   29   55:iconst_1        
	//   30   56:istore          5
		} else
	//*  31   58:goto            67
		{
			i = a;
	//   32   61:aload_0         
	//   33   62:getfield        #39  <Field int a>
	//   34   65:istore          4
		}
		if(d.mViewDragHelper.settleCapturedViewAt(i, view.getTop()))
	//*  35   67:aload_0         
	//*  36   68:getfield        #15  <Field SwipeDismissBehavior d>
	//*  37   71:getfield        #116 <Field ViewDragHelper SwipeDismissBehavior.mViewDragHelper>
	//*  38   74:iload           4
	//*  39   76:aload_1         
	//*  40   77:invokevirtual   #66  <Method int View.getTop()>
	//*  41   80:invokevirtual   #122 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
	//*  42   83:ifeq            105
		{
			ViewCompat.postOnAnimation(view, ((Runnable) (new SwipeDismissBehavior$b(d, view, flag))));
	//   43   86:aload_1         
	//   44   87:new             #124 <Class SwipeDismissBehavior$b>
	//   45   90:dup             
	//   46   91:aload_0         
	//   47   92:getfield        #15  <Field SwipeDismissBehavior d>
	//   48   95:aload_1         
	//   49   96:iload           5
	//   50   98:invokespecial   #127 <Method void SwipeDismissBehavior$b(SwipeDismissBehavior, View, boolean)>
	//   51  101:invokestatic    #131 <Method void ViewCompat.postOnAnimation(View, Runnable)>
			return;
	//   52  104:return          
		}
		if(flag && d.mListener != null)
	//*  53  105:iload           5
	//*  54  107:ifeq            133
	//*  55  110:aload_0         
	//*  56  111:getfield        #15  <Field SwipeDismissBehavior d>
	//*  57  114:getfield        #85  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.mListener>
	//*  58  117:ifnull          133
			d.mListener.onDismiss(view);
	//   59  120:aload_0         
	//   60  121:getfield        #15  <Field SwipeDismissBehavior d>
	//   61  124:getfield        #85  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.mListener>
	//   62  127:aload_1         
	//   63  128:invokeinterface #135 <Method void SwipeDismissBehavior$OnDismissListener.onDismiss(View)>
	//   64  133:return          
	}

	public boolean tryCaptureView(View view, int i)
	{
		return e == -1 && d.canSwipeDismissView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int e>
	//    2    4:iconst_m1       
	//    3    5:icmpne          21
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field SwipeDismissBehavior d>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #141 <Method boolean SwipeDismissBehavior.canSwipeDismissView(View)>
	//    8   16:ifeq            21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	private int a;
	final SwipeDismissBehavior d;
	private int e;

	SwipeDismissBehavior$3(SwipeDismissBehavior swipedismissbehavior)
	{
		d = swipedismissbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field SwipeDismissBehavior d>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void android.support.v4.widget.ViewDragHelper$Callback()>
		e = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #20  <Field int e>
	//    8   14:return          
	}
}
