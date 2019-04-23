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

class SwipeDismissBehavior$1 extends android.support.v4.widget.
{

	private boolean shouldDismiss(View view, float f)
	{
		boolean flag4;
label0:
		{
label1:
			{
				boolean flag1;
label2:
				{
					int j = f != 0.0F;
	//    0    0:fload_2         
	//    1    1:fconst_0        
	//    2    2:fcmpl           
	//    3    3:istore          4
					boolean flag3 = false;
	//    4    5:iconst_0        
	//    5    6:istore          7
					flag4 = false;
	//    6    8:iconst_0        
	//    7    9:istore          8
					flag1 = false;
	//    8   11:iconst_0        
	//    9   12:istore          6
					if(j == 0)
						break label0;
	//   10   14:iload           4
	//   11   16:ifeq            126
					boolean flag;
					if(ViewCompat.getLayoutDirection(view) == 1)
	//*  12   19:aload_1         
	//*  13   20:invokestatic    #31  <Method int ViewCompat.getLayoutDirection(View)>
	//*  14   23:iconst_1        
	//*  15   24:icmpne          32
						flag = true;
	//   16   27:iconst_1        
	//   17   28:istore_3        
					else
	//*  18   29:goto            34
						flag = false;
	//   19   32:iconst_0        
	//   20   33:istore_3        
					if(swipeDirection == 2)
	//*  21   34:aload_0         
	//*  22   35:getfield        #17  <Field SwipeDismissBehavior this$0>
	//*  23   38:getfield        #34  <Field int SwipeDismissBehavior.swipeDirection>
	//*  24   41:iconst_2        
	//*  25   42:icmpne          47
						return true;
	//   26   45:iconst_1        
	//   27   46:ireturn         
					if(swipeDirection == 0)
	//*  28   47:aload_0         
	//*  29   48:getfield        #17  <Field SwipeDismissBehavior this$0>
	//*  30   51:getfield        #34  <Field int SwipeDismissBehavior.swipeDirection>
	//*  31   54:ifne            81
					{
						if(flag ? f < 0.0F : j > 0)
	//*  32   57:iload_3         
	//*  33   58:ifeq            70
	//*  34   61:fload_2         
	//*  35   62:fconst_0        
	//*  36   63:fcmpg           
	//*  37   64:ifge            78
	//*  38   67:goto            75
	//*  39   70:iload           4
	//*  40   72:ifle            78
							flag1 = true;
	//   41   75:iconst_1        
	//   42   76:istore          6
						return flag1;
	//   43   78:iload           6
	//   44   80:ireturn         
					}
					if(swipeDirection != 1)
						break label1;
	//   45   81:aload_0         
	//   46   82:getfield        #17  <Field SwipeDismissBehavior this$0>
	//   47   85:getfield        #34  <Field int SwipeDismissBehavior.swipeDirection>
	//   48   88:iconst_1        
	//   49   89:icmpne          124
					if(flag)
	//*  50   92:iload_3         
	//*  51   93:ifeq            108
					{
						flag1 = flag3;
	//   52   96:iload           7
	//   53   98:istore          6
						if(j <= 0)
	//*  54  100:iload           4
	//*  55  102:ifle            121
							break label2;
	//   56  105:goto            118
					} else
					{
						flag1 = flag3;
	//   57  108:iload           7
	//   58  110:istore          6
						if(f >= 0.0F)
							break label2;
	//   59  112:fload_2         
	//   60  113:fconst_0        
	//   61  114:fcmpg           
	//   62  115:ifge            121
					}
					flag1 = true;
	//   63  118:iconst_1        
	//   64  119:istore          6
				}
				return flag1;
	//   65  121:iload           6
	//   66  123:ireturn         
			}
			return false;
	//   67  124:iconst_0        
	//   68  125:ireturn         
		}
		int i = view.getLeft();
	//   69  126:aload_1         
	//   70  127:invokevirtual   #40  <Method int View.getLeft()>
	//   71  130:istore_3        
		int k = originalCapturedViewLeft;
	//   72  131:aload_0         
	//   73  132:getfield        #42  <Field int originalCapturedViewLeft>
	//   74  135:istore          4
		int l = Math.round((float)view.getWidth() * dragDismissThreshold);
	//   75  137:aload_1         
	//   76  138:invokevirtual   #45  <Method int View.getWidth()>
	//   77  141:i2f             
	//   78  142:aload_0         
	//   79  143:getfield        #17  <Field SwipeDismissBehavior this$0>
	//   80  146:getfield        #49  <Field float SwipeDismissBehavior.dragDismissThreshold>
	//   81  149:fmul            
	//   82  150:invokestatic    #55  <Method int Math.round(float)>
	//   83  153:istore          5
		boolean flag2 = flag4;
	//   84  155:iload           8
	//   85  157:istore          6
		if(Math.abs(i - k) >= l)
	//*  86  159:iload_3         
	//*  87  160:iload           4
	//*  88  162:isub            
	//*  89  163:invokestatic    #59  <Method int Math.abs(int)>
	//*  90  166:iload           5
	//*  91  168:icmplt          174
			flag2 = true;
	//   92  171:iconst_1        
	//   93  172:istore          6
		return flag2;
	//   94  174:iload           6
	//   95  176:ireturn         
	}

	public int clampViewPositionHorizontal(View view, int i, int j)
	{
		if(ViewCompat.getLayoutDirection(view) == 1)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #31  <Method int ViewCompat.getLayoutDirection(View)>
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
		if(swipeDirection == 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #17  <Field SwipeDismissBehavior this$0>
	//*  11   19:getfield        #34  <Field int SwipeDismissBehavior.swipeDirection>
	//*  12   22:ifne            65
		{
			if(j != 0)
	//*  13   25:iload_3         
	//*  14   26:ifeq            48
			{
				k = originalCapturedViewLeft - view.getWidth();
	//   15   29:aload_0         
	//   16   30:getfield        #42  <Field int originalCapturedViewLeft>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #45  <Method int View.getWidth()>
	//   19   37:isub            
	//   20   38:istore          4
				j = originalCapturedViewLeft;
	//   21   40:aload_0         
	//   22   41:getfield        #42  <Field int originalCapturedViewLeft>
	//   23   44:istore_3        
			} else
	//*  24   45:goto            139
			{
				k = originalCapturedViewLeft;
	//   25   48:aload_0         
	//   26   49:getfield        #42  <Field int originalCapturedViewLeft>
	//   27   52:istore          4
				j = view.getWidth() + k;
	//   28   54:aload_1         
	//   29   55:invokevirtual   #45  <Method int View.getWidth()>
	//   30   58:iload           4
	//   31   60:iadd            
	//   32   61:istore_3        
			}
		} else
	//*  33   62:goto            139
		if(swipeDirection == 1)
	//*  34   65:aload_0         
	//*  35   66:getfield        #17  <Field SwipeDismissBehavior this$0>
	//*  36   69:getfield        #34  <Field int SwipeDismissBehavior.swipeDirection>
	//*  37   72:iconst_1        
	//*  38   73:icmpne          116
		{
			if(j != 0)
	//*  39   76:iload_3         
	//*  40   77:ifeq            97
			{
				k = originalCapturedViewLeft;
	//   41   80:aload_0         
	//   42   81:getfield        #42  <Field int originalCapturedViewLeft>
	//   43   84:istore          4
				j = view.getWidth() + k;
	//   44   86:aload_1         
	//   45   87:invokevirtual   #45  <Method int View.getWidth()>
	//   46   90:iload           4
	//   47   92:iadd            
	//   48   93:istore_3        
			} else
	//*  49   94:goto            139
			{
				k = originalCapturedViewLeft - view.getWidth();
	//   50   97:aload_0         
	//   51   98:getfield        #42  <Field int originalCapturedViewLeft>
	//   52  101:aload_1         
	//   53  102:invokevirtual   #45  <Method int View.getWidth()>
	//   54  105:isub            
	//   55  106:istore          4
				j = originalCapturedViewLeft;
	//   56  108:aload_0         
	//   57  109:getfield        #42  <Field int originalCapturedViewLeft>
	//   58  112:istore_3        
			}
		} else
	//*  59  113:goto            139
		{
			k = originalCapturedViewLeft - view.getWidth();
	//   60  116:aload_0         
	//   61  117:getfield        #42  <Field int originalCapturedViewLeft>
	//   62  120:aload_1         
	//   63  121:invokevirtual   #45  <Method int View.getWidth()>
	//   64  124:isub            
	//   65  125:istore          4
			j = originalCapturedViewLeft;
	//   66  127:aload_0         
	//   67  128:getfield        #42  <Field int originalCapturedViewLeft>
	//   68  131:istore_3        
			j = view.getWidth() + j;
	//   69  132:aload_1         
	//   70  133:invokevirtual   #45  <Method int View.getWidth()>
	//   71  136:iload_3         
	//   72  137:iadd            
	//   73  138:istore_3        
		}
		return SwipeDismissBehavior.clamp(k, i, j);
	//   74  139:iload           4
	//   75  141:iload_2         
	//   76  142:iload_3         
	//   77  143:invokestatic    #65  <Method int SwipeDismissBehavior.clamp(int, int, int)>
	//   78  146:ireturn         
	}

	public int clampViewPositionVertical(View view, int i, int j)
	{
		return view.getTop();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #69  <Method int View.getTop()>
	//    2    4:ireturn         
	}

	public int getViewHorizontalDragRange(View view)
	{
		return view.getWidth();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #45  <Method int View.getWidth()>
	//    2    4:ireturn         
	}

	public void onViewCaptured(View view, int i)
	{
		activePointerId = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #22  <Field int activePointerId>
		originalCapturedViewLeft = view.getLeft();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #40  <Method int View.getLeft()>
	//    6   10:putfield        #42  <Field int originalCapturedViewLeft>
		view = ((View) (view.getParent()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #76  <Method ViewParent View.getParent()>
	//    9   17:astore_1        
		if(view != null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          29
			((ViewParent) (view)).requestDisallowInterceptTouchEvent(true);
	//   12   22:aload_1         
	//   13   23:iconst_1        
	//   14   24:invokeinterface #82  <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//   15   29:return          
	}

	public void onViewDragStateChanged(int i)
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field SwipeDismissBehavior this$0>
	//*   2    4:getfield        #88  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.listener>
	//*   3    7:ifnull          23
			listener.onDragStateChanged(i);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field SwipeDismissBehavior this$0>
	//    6   14:getfield        #88  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.listener>
	//    7   17:iload_1         
	//    8   18:invokeinterface #93  <Method void SwipeDismissBehavior$OnDismissListener.onDragStateChanged(int)>
	//    9   23:return          
	}

	public void onViewPositionChanged(View view, int i, int j, int k, int l)
	{
		float f = (float)originalCapturedViewLeft + (float)view.getWidth() * alphaStartSwipeDistance;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int originalCapturedViewLeft>
	//    2    4:i2f             
	//    3    5:aload_1         
	//    4    6:invokevirtual   #45  <Method int View.getWidth()>
	//    5    9:i2f             
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field SwipeDismissBehavior this$0>
	//    8   14:getfield        #98  <Field float SwipeDismissBehavior.alphaStartSwipeDistance>
	//    9   17:fmul            
	//   10   18:fadd            
	//   11   19:fstore          6
		float f1 = (float)originalCapturedViewLeft + (float)view.getWidth() * alphaEndSwipeDistance;
	//   12   21:aload_0         
	//   13   22:getfield        #42  <Field int originalCapturedViewLeft>
	//   14   25:i2f             
	//   15   26:aload_1         
	//   16   27:invokevirtual   #45  <Method int View.getWidth()>
	//   17   30:i2f             
	//   18   31:aload_0         
	//   19   32:getfield        #17  <Field SwipeDismissBehavior this$0>
	//   20   35:getfield        #101 <Field float SwipeDismissBehavior.alphaEndSwipeDistance>
	//   21   38:fmul            
	//   22   39:fadd            
	//   23   40:fstore          7
		float f2 = i;
	//   24   42:iload_2         
	//   25   43:i2f             
	//   26   44:fstore          8
		if(f2 <= f)
	//*  27   46:fload           8
	//*  28   48:fload           6
	//*  29   50:fcmpg           
	//*  30   51:ifgt            60
		{
			view.setAlpha(1.0F);
	//   31   54:aload_1         
	//   32   55:fconst_1        
	//   33   56:invokevirtual   #105 <Method void View.setAlpha(float)>
			return;
	//   34   59:return          
		}
		if(f2 >= f1)
	//*  35   60:fload           8
	//*  36   62:fload           7
	//*  37   64:fcmpl           
	//*  38   65:iflt            74
		{
			view.setAlpha(0.0F);
	//   39   68:aload_1         
	//   40   69:fconst_0        
	//   41   70:invokevirtual   #105 <Method void View.setAlpha(float)>
			return;
	//   42   73:return          
		} else
		{
			view.setAlpha(SwipeDismissBehavior.clamp(0.0F, 1.0F - SwipeDismissBehavior.fraction(f, f1, f2), 1.0F));
	//   43   74:aload_1         
	//   44   75:fconst_0        
	//   45   76:fconst_1        
	//   46   77:fload           6
	//   47   79:fload           7
	//   48   81:fload           8
	//   49   83:invokestatic    #109 <Method float SwipeDismissBehavior.fraction(float, float, float)>
	//   50   86:fsub            
	//   51   87:fconst_1        
	//   52   88:invokestatic    #111 <Method float SwipeDismissBehavior.clamp(float, float, float)>
	//   53   91:invokevirtual   #105 <Method void View.setAlpha(float)>
			return;
	//   54   94:return          
		}
	}

	public void onViewReleased(View view, float f, float f1)
	{
		activePointerId = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #22  <Field int activePointerId>
		int i = view.getWidth();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #45  <Method int View.getWidth()>
	//    5    9:istore          4
		boolean flag;
		if(shouldDismiss(view, f))
	//*   6   11:aload_0         
	//*   7   12:aload_1         
	//*   8   13:fload_2         
	//*   9   14:invokespecial   #115 <Method boolean shouldDismiss(View, float)>
	//*  10   17:ifeq            62
		{
			int j = view.getLeft();
	//   11   20:aload_1         
	//   12   21:invokevirtual   #40  <Method int View.getLeft()>
	//   13   24:istore          5
			int k = originalCapturedViewLeft;
	//   14   26:aload_0         
	//   15   27:getfield        #42  <Field int originalCapturedViewLeft>
	//   16   30:istore          6
			if(j < k)
	//*  17   32:iload           5
	//*  18   34:iload           6
	//*  19   36:icmpge          49
				i = k - i;
	//   20   39:iload           6
	//   21   41:iload           4
	//   22   43:isub            
	//   23   44:istore          4
			else
	//*  24   46:goto            56
				i = k + i;
	//   25   49:iload           6
	//   26   51:iload           4
	//   27   53:iadd            
	//   28   54:istore          4
			flag = true;
	//   29   56:iconst_1        
	//   30   57:istore          7
		} else
	//*  31   59:goto            71
		{
			i = originalCapturedViewLeft;
	//   32   62:aload_0         
	//   33   63:getfield        #42  <Field int originalCapturedViewLeft>
	//   34   66:istore          4
			flag = false;
	//   35   68:iconst_0        
	//   36   69:istore          7
		}
		if(viewDragHelper.settleCapturedViewAt(i, view.getTop()))
	//*  37   71:aload_0         
	//*  38   72:getfield        #17  <Field SwipeDismissBehavior this$0>
	//*  39   75:getfield        #119 <Field ViewDragHelper SwipeDismissBehavior.viewDragHelper>
	//*  40   78:iload           4
	//*  41   80:aload_1         
	//*  42   81:invokevirtual   #69  <Method int View.getTop()>
	//*  43   84:invokevirtual   #125 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
	//*  44   87:ifeq            109
		{
			ViewCompat.postOnAnimation(view, ((Runnable) (new ttleRunnable(SwipeDismissBehavior.this, view, flag))));
	//   45   90:aload_1         
	//   46   91:new             #127 <Class SwipeDismissBehavior$SettleRunnable>
	//   47   94:dup             
	//   48   95:aload_0         
	//   49   96:getfield        #17  <Field SwipeDismissBehavior this$0>
	//   50   99:aload_1         
	//   51  100:iload           7
	//   52  102:invokespecial   #130 <Method void SwipeDismissBehavior$SettleRunnable(SwipeDismissBehavior, View, boolean)>
	//   53  105:invokestatic    #134 <Method void ViewCompat.postOnAnimation(View, Runnable)>
			return;
	//   54  108:return          
		}
		if(flag && listener != null)
	//*  55  109:iload           7
	//*  56  111:ifeq            137
	//*  57  114:aload_0         
	//*  58  115:getfield        #17  <Field SwipeDismissBehavior this$0>
	//*  59  118:getfield        #88  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.listener>
	//*  60  121:ifnull          137
			listener.onDismiss(view);
	//   61  124:aload_0         
	//   62  125:getfield        #17  <Field SwipeDismissBehavior this$0>
	//   63  128:getfield        #88  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.listener>
	//   64  131:aload_1         
	//   65  132:invokeinterface #138 <Method void SwipeDismissBehavior$OnDismissListener.onDismiss(View)>
	//   66  137:return          
	}

	public boolean tryCaptureView(View view, int i)
	{
		return activePointerId == -1 && canSwipeDismissView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int activePointerId>
	//    2    4:iconst_m1       
	//    3    5:icmpne          21
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field SwipeDismissBehavior this$0>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #144 <Method boolean SwipeDismissBehavior.canSwipeDismissView(View)>
	//    8   16:ifeq            21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	private static final int INVALID_POINTER_ID = -1;
	private int activePointerId;
	private int originalCapturedViewLeft;
	final SwipeDismissBehavior this$0;

	SwipeDismissBehavior$1()
	{
		this$0 = SwipeDismissBehavior.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field SwipeDismissBehavior this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void android.support.v4.widget.ViewDragHelper$Callback()>
		activePointerId = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #22  <Field int activePointerId>
	//    8   14:return          
	}
}
