// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.support.v4.c.a;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.*;
import android.widget.OverScroller;

// Referenced classes of package android.support.design.widget:
//			ViewOffsetBehavior, CoordinatorLayout

abstract class HeaderBehavior extends ViewOffsetBehavior
{
	private class a
		implements Runnable
	{

		public void run()
		{
			if(c != null && a.a != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field View c>
		//*   2    4:ifnull          80
		//*   3    7:aload_0         
		//*   4    8:getfield        #19  <Field HeaderBehavior a>
		//*   5   11:getfield        #33  <Field OverScroller android.support.design.widget.HeaderBehavior.a>
		//*   6   14:ifnull          80
			{
				if(a.a.computeScrollOffset())
		//*   7   17:aload_0         
		//*   8   18:getfield        #19  <Field HeaderBehavior a>
		//*   9   21:getfield        #33  <Field OverScroller android.support.design.widget.HeaderBehavior.a>
		//*  10   24:invokevirtual   #39  <Method boolean OverScroller.computeScrollOffset()>
		//*  11   27:ifeq            65
				{
					a.a_(b, c, a.a.getCurrY());
		//   12   30:aload_0         
		//   13   31:getfield        #19  <Field HeaderBehavior a>
		//   14   34:aload_0         
		//   15   35:getfield        #24  <Field CoordinatorLayout b>
		//   16   38:aload_0         
		//   17   39:getfield        #26  <Field View c>
		//   18   42:aload_0         
		//   19   43:getfield        #19  <Field HeaderBehavior a>
		//   20   46:getfield        #33  <Field OverScroller android.support.design.widget.HeaderBehavior.a>
		//   21   49:invokevirtual   #43  <Method int OverScroller.getCurrY()>
		//   22   52:invokevirtual   #47  <Method int HeaderBehavior.a_(CoordinatorLayout, View, int)>
		//   23   55:pop             
					s.a(c, ((Runnable) (this)));
		//   24   56:aload_0         
		//   25   57:getfield        #26  <Field View c>
		//   26   60:aload_0         
		//   27   61:invokestatic    #52  <Method void s.a(View, Runnable)>
					return;
		//   28   64:return          
				}
				a.a(b, c);
		//   29   65:aload_0         
		//   30   66:getfield        #19  <Field HeaderBehavior a>
		//   31   69:aload_0         
		//   32   70:getfield        #24  <Field CoordinatorLayout b>
		//   33   73:aload_0         
		//   34   74:getfield        #26  <Field View c>
		//   35   77:invokevirtual   #55  <Method void android.support.design.widget.HeaderBehavior.a(CoordinatorLayout, View)>
			}
		//   36   80:return          
		}

		final HeaderBehavior a;
		private final CoordinatorLayout b;
		private final View c;

		a(CoordinatorLayout coordinatorlayout, View view)
		{
			a = HeaderBehavior.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field HeaderBehavior a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			b = coordinatorlayout;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field CoordinatorLayout b>
			c = view;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field View c>
		//   11   19:return          
		}
	}


	public HeaderBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void ViewOffsetBehavior()>
		d = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #25  <Field int d>
		f = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #27  <Field int f>
	//    8   14:return          
	}

	public HeaderBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void ViewOffsetBehavior(Context, AttributeSet)>
		d = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #25  <Field int d>
		f = -1;
	//    7   11:aload_0         
	//    8   12:iconst_m1       
	//    9   13:putfield        #27  <Field int f>
	//   10   16:return          
	}

	private void d()
	{
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field VelocityTracker g>
	//*   2    4:ifnonnull       14
			g = VelocityTracker.obtain();
	//    3    7:aload_0         
	//    4    8:invokestatic    #39  <Method VelocityTracker VelocityTracker.obtain()>
	//    5   11:putfield        #33  <Field VelocityTracker g>
	//    6   14:return          
	}

	int a()
	{
		return b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method int b()>
	//    2    4:ireturn         
	}

	int a(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k)
	{
		int l = b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method int b()>
	//    2    4:istore          6
		if(j != 0 && l >= j && l <= k)
	//*   3    6:iload           4
	//*   4    8:ifeq            51
	//*   5   11:iload           6
	//*   6   13:iload           4
	//*   7   15:icmplt          51
	//*   8   18:iload           6
	//*   9   20:iload           5
	//*  10   22:icmpgt          51
		{
			i = android.support.v4.c.a.a(i, j, k);
	//   11   25:iload_3         
	//   12   26:iload           4
	//   13   28:iload           5
	//   14   30:invokestatic    #48  <Method int a.a(int, int, int)>
	//   15   33:istore_3        
			if(l != i)
	//*  16   34:iload           6
	//*  17   36:iload_3         
	//*  18   37:icmpeq          51
			{
				a(i);
	//   19   40:aload_0         
	//   20   41:iload_3         
	//   21   42:invokevirtual   #51  <Method boolean a(int)>
	//   22   45:pop             
				return l - i;
	//   23   46:iload           6
	//   24   48:iload_3         
	//   25   49:isub            
	//   26   50:ireturn         
			}
		}
		return 0;
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	int a(View view)
	{
		return view.getHeight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #59  <Method int View.getHeight()>
	//    2    4:ireturn         
	}

	void a(CoordinatorLayout coordinatorlayout, View view)
	{
	//    0    0:return          
	}

	final boolean a(CoordinatorLayout coordinatorlayout, View view, int i, int j, float f1)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field Runnable b>
	//*   2    4:ifnull          21
		{
			view.removeCallbacks(b);
	//    3    7:aload_2         
	//    4    8:aload_0         
	//    5    9:getfield        #65  <Field Runnable b>
	//    6   12:invokevirtual   #69  <Method boolean View.removeCallbacks(Runnable)>
	//    7   15:pop             
			b = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #65  <Field Runnable b>
		}
		if(a == null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #71  <Field OverScroller a>
	//*  13   25:ifnonnull       43
			a = new OverScroller(view.getContext());
	//   14   28:aload_0         
	//   15   29:new             #73  <Class OverScroller>
	//   16   32:dup             
	//   17   33:aload_2         
	//   18   34:invokevirtual   #77  <Method Context View.getContext()>
	//   19   37:invokespecial   #80  <Method void OverScroller(Context)>
	//   20   40:putfield        #71  <Field OverScroller a>
		a.fling(0, b(), 0, Math.round(f1), 0, 0, i, j);
	//   21   43:aload_0         
	//   22   44:getfield        #71  <Field OverScroller a>
	//   23   47:iconst_0        
	//   24   48:aload_0         
	//   25   49:invokevirtual   #42  <Method int b()>
	//   26   52:iconst_0        
	//   27   53:fload           5
	//   28   55:invokestatic    #86  <Method int Math.round(float)>
	//   29   58:iconst_0        
	//   30   59:iconst_0        
	//   31   60:iload_3         
	//   32   61:iload           4
	//   33   63:invokevirtual   #90  <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
		if(a.computeScrollOffset())
	//*  34   66:aload_0         
	//*  35   67:getfield        #71  <Field OverScroller a>
	//*  36   70:invokevirtual   #94  <Method boolean OverScroller.computeScrollOffset()>
	//*  37   73:ifeq            100
		{
			b = ((Runnable) (new a(coordinatorlayout, view)));
	//   38   76:aload_0         
	//   39   77:new             #7   <Class HeaderBehavior$a>
	//   40   80:dup             
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:aload_2         
	//   44   84:invokespecial   #97  <Method void HeaderBehavior$a(HeaderBehavior, CoordinatorLayout, View)>
	//   45   87:putfield        #65  <Field Runnable b>
			s.a(view, b);
	//   46   90:aload_2         
	//   47   91:aload_0         
	//   48   92:getfield        #65  <Field Runnable b>
	//   49   95:invokestatic    #102 <Method void s.a(View, Runnable)>
			return true;
	//   50   98:iconst_1        
	//   51   99:ireturn         
		} else
		{
			a(coordinatorlayout, view);
	//   52  100:aload_0         
	//   53  101:aload_1         
	//   54  102:aload_2         
	//   55  103:invokevirtual   #104 <Method void a(CoordinatorLayout, View)>
			return false;
	//   56  106:iconst_0        
	//   57  107:ireturn         
		}
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		if(f < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field int f>
	//*   2    4:ifge            21
			f = ViewConfiguration.get(coordinatorlayout.getContext()).getScaledTouchSlop();
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #109 <Method Context CoordinatorLayout.getContext()>
	//    6   12:invokestatic    #115 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//    7   15:invokevirtual   #118 <Method int ViewConfiguration.getScaledTouchSlop()>
	//    8   18:putfield        #27  <Field int f>
		if(motionevent.getAction() == 2 && c)
	//*   9   21:aload_3         
	//*  10   22:invokevirtual   #123 <Method int MotionEvent.getAction()>
	//*  11   25:iconst_2        
	//*  12   26:icmpne          38
	//*  13   29:aload_0         
	//*  14   30:getfield        #125 <Field boolean c>
	//*  15   33:ifeq            38
			return true;
	//   16   36:iconst_1        
	//   17   37:ireturn         
		switch(motionevent.getActionMasked())
	//*  18   38:aload_3         
	//*  19   39:invokevirtual   #128 <Method int MotionEvent.getActionMasked()>
		{
	//*  20   42:tableswitch     0 3: default 72
	//	               0 179
	//	               1 147
	//	               2 75
	//	               3 147
	//*  21   72:goto            237
		case 2: // '\002'
			int i = d;
	//   22   75:aload_0         
	//   23   76:getfield        #25  <Field int d>
	//   24   79:istore          4
			if(i != -1)
	//*  25   81:iload           4
	//*  26   83:iconst_m1       
	//*  27   84:icmpne          90
	//*  28   87:goto            237
			{
				i = motionevent.findPointerIndex(i);
	//   29   90:aload_3         
	//   30   91:iload           4
	//   31   93:invokevirtual   #132 <Method int MotionEvent.findPointerIndex(int)>
	//   32   96:istore          4
				if(i != -1)
	//*  33   98:iload           4
	//*  34  100:iconst_m1       
	//*  35  101:icmpne          107
	//*  36  104:goto            237
				{
					i = (int)motionevent.getY(i);
	//   37  107:aload_3         
	//   38  108:iload           4
	//   39  110:invokevirtual   #136 <Method float MotionEvent.getY(int)>
	//   40  113:f2i             
	//   41  114:istore          4
					if(Math.abs(i - e) > f)
	//*  42  116:iload           4
	//*  43  118:aload_0         
	//*  44  119:getfield        #138 <Field int e>
	//*  45  122:isub            
	//*  46  123:invokestatic    #141 <Method int Math.abs(int)>
	//*  47  126:aload_0         
	//*  48  127:getfield        #27  <Field int f>
	//*  49  130:icmple          237
					{
						c = true;
	//   50  133:aload_0         
	//   51  134:iconst_1        
	//   52  135:putfield        #125 <Field boolean c>
						e = i;
	//   53  138:aload_0         
	//   54  139:iload           4
	//   55  141:putfield        #138 <Field int e>
					}
				}
			}
			break;

	//*  56  144:goto            237
		case 1: // '\001'
		case 3: // '\003'
			c = false;
	//   57  147:aload_0         
	//   58  148:iconst_0        
	//   59  149:putfield        #125 <Field boolean c>
			d = -1;
	//   60  152:aload_0         
	//   61  153:iconst_m1       
	//   62  154:putfield        #25  <Field int d>
			if(g != null)
	//*  63  157:aload_0         
	//*  64  158:getfield        #33  <Field VelocityTracker g>
	//*  65  161:ifnull          237
			{
				g.recycle();
	//   66  164:aload_0         
	//   67  165:getfield        #33  <Field VelocityTracker g>
	//   68  168:invokevirtual   #144 <Method void VelocityTracker.recycle()>
				g = null;
	//   69  171:aload_0         
	//   70  172:aconst_null     
	//   71  173:putfield        #33  <Field VelocityTracker g>
			}
			break;

	//*  72  176:goto            237
		case 0: // '\0'
			c = false;
	//   73  179:aload_0         
	//   74  180:iconst_0        
	//   75  181:putfield        #125 <Field boolean c>
			int j = (int)motionevent.getX();
	//   76  184:aload_3         
	//   77  185:invokevirtual   #148 <Method float MotionEvent.getX()>
	//   78  188:f2i             
	//   79  189:istore          4
			int k = (int)motionevent.getY();
	//   80  191:aload_3         
	//   81  192:invokevirtual   #150 <Method float MotionEvent.getY()>
	//   82  195:f2i             
	//   83  196:istore          5
			if(c(view) && coordinatorlayout.a(view, j, k))
	//*  84  198:aload_0         
	//*  85  199:aload_2         
	//*  86  200:invokevirtual   #153 <Method boolean c(View)>
	//*  87  203:ifeq            237
	//*  88  206:aload_1         
	//*  89  207:aload_2         
	//*  90  208:iload           4
	//*  91  210:iload           5
	//*  92  212:invokevirtual   #156 <Method boolean android.support.design.widget.CoordinatorLayout.a(View, int, int)>
	//*  93  215:ifeq            237
			{
				e = k;
	//   94  218:aload_0         
	//   95  219:iload           5
	//   96  221:putfield        #138 <Field int e>
				d = motionevent.getPointerId(0);
	//   97  224:aload_0         
	//   98  225:aload_3         
	//   99  226:iconst_0        
	//  100  227:invokevirtual   #159 <Method int MotionEvent.getPointerId(int)>
	//  101  230:putfield        #25  <Field int d>
				d();
	//  102  233:aload_0         
	//  103  234:invokespecial   #161 <Method void d()>
			}
			break;
		}
		if(g != null)
	//* 104  237:aload_0         
	//* 105  238:getfield        #33  <Field VelocityTracker g>
	//* 106  241:ifnull          252
			g.addMovement(motionevent);
	//  107  244:aload_0         
	//  108  245:getfield        #33  <Field VelocityTracker g>
	//  109  248:aload_3         
	//  110  249:invokevirtual   #165 <Method void VelocityTracker.addMovement(MotionEvent)>
		return c;
	//  111  252:aload_0         
	//  112  253:getfield        #125 <Field boolean c>
	//  113  256:ireturn         
	}

	int a_(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		return a(coordinatorlayout, view, i, 0x80000000, 0x7fffffff);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:ldc1            #169 <Int 0x80000000>
	//    5    6:ldc1            #170 <Int 0x7fffffff>
	//    6    8:invokevirtual   #172 <Method int a(CoordinatorLayout, View, int, int, int)>
	//    7   11:ireturn         
	}

	final int b(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k)
	{
		return a(coordinatorlayout, view, a() - i, j, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:invokevirtual   #175 <Method int a()>
	//    5    7:iload_3         
	//    6    8:isub            
	//    7    9:iload           4
	//    8   11:iload           5
	//    9   13:invokevirtual   #172 <Method int a(CoordinatorLayout, View, int, int, int)>
	//   10   16:ireturn         
	}

	int b(View view)
	{
		return -view.getHeight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #59  <Method int View.getHeight()>
	//    2    4:ineg            
	//    3    5:ireturn         
	}

	public boolean b(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		if(f < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field int f>
	//*   2    4:ifge            21
			f = ViewConfiguration.get(coordinatorlayout.getContext()).getScaledTouchSlop();
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #109 <Method Context CoordinatorLayout.getContext()>
	//    6   12:invokestatic    #115 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//    7   15:invokevirtual   #118 <Method int ViewConfiguration.getScaledTouchSlop()>
	//    8   18:putfield        #27  <Field int f>
		switch(motionevent.getActionMasked())
	//*   9   21:aload_3         
	//*  10   22:invokevirtual   #128 <Method int MotionEvent.getActionMasked()>
		{
	//*  11   25:tableswitch     0 3: default 56
	//	               0 270
	//	               1 184
	//	               2 59
	//	               3 238
	//*  12   56:goto            328
		case 2: // '\002'
			int i = motionevent.findPointerIndex(d);
	//   13   59:aload_3         
	//   14   60:aload_0         
	//   15   61:getfield        #25  <Field int d>
	//   16   64:invokevirtual   #132 <Method int MotionEvent.findPointerIndex(int)>
	//   17   67:istore          5
			if(i == -1)
	//*  18   69:iload           5
	//*  19   71:iconst_m1       
	//*  20   72:icmpne          77
				return false;
	//   21   75:iconst_0        
	//   22   76:ireturn         
			int i1 = (int)motionevent.getY(i);
	//   23   77:aload_3         
	//   24   78:iload           5
	//   25   80:invokevirtual   #136 <Method float MotionEvent.getY(int)>
	//   26   83:f2i             
	//   27   84:istore          7
			int k = e - i1;
	//   28   86:aload_0         
	//   29   87:getfield        #138 <Field int e>
	//   30   90:iload           7
	//   31   92:isub            
	//   32   93:istore          6
			i = k;
	//   33   95:iload           6
	//   34   97:istore          5
			if(!c)
	//*  35   99:aload_0         
	//*  36  100:getfield        #125 <Field boolean c>
	//*  37  103:ifne            153
			{
				i = k;
	//   38  106:iload           6
	//   39  108:istore          5
				if(Math.abs(k) > f)
	//*  40  110:iload           6
	//*  41  112:invokestatic    #141 <Method int Math.abs(int)>
	//*  42  115:aload_0         
	//*  43  116:getfield        #27  <Field int f>
	//*  44  119:icmple          153
				{
					c = true;
	//   45  122:aload_0         
	//   46  123:iconst_1        
	//   47  124:putfield        #125 <Field boolean c>
					if(k > 0)
	//*  48  127:iload           6
	//*  49  129:ifle            144
						i = k - f;
	//   50  132:iload           6
	//   51  134:aload_0         
	//   52  135:getfield        #27  <Field int f>
	//   53  138:isub            
	//   54  139:istore          5
					else
	//*  55  141:goto            153
						i = k + f;
	//   56  144:iload           6
	//   57  146:aload_0         
	//   58  147:getfield        #27  <Field int f>
	//   59  150:iadd            
	//   60  151:istore          5
				}
			}
			if(c)
	//*  61  153:aload_0         
	//*  62  154:getfield        #125 <Field boolean c>
	//*  63  157:ifeq            328
			{
				e = i1;
	//   64  160:aload_0         
	//   65  161:iload           7
	//   66  163:putfield        #138 <Field int e>
				b(coordinatorlayout, view, i, b(view), 0);
	//   67  166:aload_0         
	//   68  167:aload_1         
	//   69  168:aload_2         
	//   70  169:iload           5
	//   71  171:aload_0         
	//   72  172:aload_2         
	//   73  173:invokevirtual   #177 <Method int b(View)>
	//   74  176:iconst_0        
	//   75  177:invokevirtual   #179 <Method int b(CoordinatorLayout, View, int, int, int)>
	//   76  180:pop             
			}
			break;

	//*  77  181:goto            328
		case 1: // '\001'
			if(g != null)
	//*  78  184:aload_0         
	//*  79  185:getfield        #33  <Field VelocityTracker g>
	//*  80  188:ifnull          238
			{
				g.addMovement(motionevent);
	//   81  191:aload_0         
	//   82  192:getfield        #33  <Field VelocityTracker g>
	//   83  195:aload_3         
	//   84  196:invokevirtual   #165 <Method void VelocityTracker.addMovement(MotionEvent)>
				g.computeCurrentVelocity(1000);
	//   85  199:aload_0         
	//   86  200:getfield        #33  <Field VelocityTracker g>
	//   87  203:sipush          1000
	//   88  206:invokevirtual   #183 <Method void VelocityTracker.computeCurrentVelocity(int)>
				float f1 = g.getYVelocity(d);
	//   89  209:aload_0         
	//   90  210:getfield        #33  <Field VelocityTracker g>
	//   91  213:aload_0         
	//   92  214:getfield        #25  <Field int d>
	//   93  217:invokevirtual   #186 <Method float VelocityTracker.getYVelocity(int)>
	//   94  220:fstore          4
				a(coordinatorlayout, view, -a(view), 0, f1);
	//   95  222:aload_0         
	//   96  223:aload_1         
	//   97  224:aload_2         
	//   98  225:aload_0         
	//   99  226:aload_2         
	//  100  227:invokevirtual   #188 <Method int a(View)>
	//  101  230:ineg            
	//  102  231:iconst_0        
	//  103  232:fload           4
	//  104  234:invokevirtual   #190 <Method boolean a(CoordinatorLayout, View, int, int, float)>
	//  105  237:pop             
			}
			// fall through

		case 3: // '\003'
			c = false;
	//  106  238:aload_0         
	//  107  239:iconst_0        
	//  108  240:putfield        #125 <Field boolean c>
			d = -1;
	//  109  243:aload_0         
	//  110  244:iconst_m1       
	//  111  245:putfield        #25  <Field int d>
			if(g != null)
	//* 112  248:aload_0         
	//* 113  249:getfield        #33  <Field VelocityTracker g>
	//* 114  252:ifnull          328
			{
				g.recycle();
	//  115  255:aload_0         
	//  116  256:getfield        #33  <Field VelocityTracker g>
	//  117  259:invokevirtual   #144 <Method void VelocityTracker.recycle()>
				g = null;
	//  118  262:aload_0         
	//  119  263:aconst_null     
	//  120  264:putfield        #33  <Field VelocityTracker g>
			}
			break;

	//* 121  267:goto            328
		case 0: // '\0'
			int j = (int)motionevent.getX();
	//  122  270:aload_3         
	//  123  271:invokevirtual   #148 <Method float MotionEvent.getX()>
	//  124  274:f2i             
	//  125  275:istore          5
			int l = (int)motionevent.getY();
	//  126  277:aload_3         
	//  127  278:invokevirtual   #150 <Method float MotionEvent.getY()>
	//  128  281:f2i             
	//  129  282:istore          6
			if(coordinatorlayout.a(view, j, l) && c(view))
	//* 130  284:aload_1         
	//* 131  285:aload_2         
	//* 132  286:iload           5
	//* 133  288:iload           6
	//* 134  290:invokevirtual   #156 <Method boolean android.support.design.widget.CoordinatorLayout.a(View, int, int)>
	//* 135  293:ifeq            326
	//* 136  296:aload_0         
	//* 137  297:aload_2         
	//* 138  298:invokevirtual   #153 <Method boolean c(View)>
	//* 139  301:ifeq            326
			{
				e = l;
	//  140  304:aload_0         
	//  141  305:iload           6
	//  142  307:putfield        #138 <Field int e>
				d = motionevent.getPointerId(0);
	//  143  310:aload_0         
	//  144  311:aload_3         
	//  145  312:iconst_0        
	//  146  313:invokevirtual   #159 <Method int MotionEvent.getPointerId(int)>
	//  147  316:putfield        #25  <Field int d>
				d();
	//  148  319:aload_0         
	//  149  320:invokespecial   #161 <Method void d()>
			} else
	//* 150  323:goto            328
			{
				return false;
	//  151  326:iconst_0        
	//  152  327:ireturn         
			}
			break;
		}
		if(g != null)
	//* 153  328:aload_0         
	//* 154  329:getfield        #33  <Field VelocityTracker g>
	//* 155  332:ifnull          343
			g.addMovement(motionevent);
	//  156  335:aload_0         
	//  157  336:getfield        #33  <Field VelocityTracker g>
	//  158  339:aload_3         
	//  159  340:invokevirtual   #165 <Method void VelocityTracker.addMovement(MotionEvent)>
		return true;
	//  160  343:iconst_1        
	//  161  344:ireturn         
	}

	boolean c(View view)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	OverScroller a;
	private Runnable b;
	private boolean c;
	private int d;
	private int e;
	private int f;
	private VelocityTracker g;
}
