// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.math.MathUtils;
import android.support.v4.view.*;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			ViewOffsetBehavior, CoordinatorLayout

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior
{

	public HeaderScrollingViewBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ViewOffsetBehavior()>
		mTempRect1 = new Rect();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void Rect()>
	//    6   12:putfield        #20  <Field Rect mTempRect1>
		mTempRect2 = new Rect();
	//    7   15:aload_0         
	//    8   16:new             #17  <Class Rect>
	//    9   19:dup             
	//   10   20:invokespecial   #18  <Method void Rect()>
	//   11   23:putfield        #22  <Field Rect mTempRect2>
		mVerticalLayoutGap = 0;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #24  <Field int mVerticalLayoutGap>
	//   15   31:return          
	}

	public HeaderScrollingViewBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void ViewOffsetBehavior(Context, AttributeSet)>
		mTempRect1 = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #17  <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #18  <Method void Rect()>
	//    8   14:putfield        #20  <Field Rect mTempRect1>
		mTempRect2 = new Rect();
	//    9   17:aload_0         
	//   10   18:new             #17  <Class Rect>
	//   11   21:dup             
	//   12   22:invokespecial   #18  <Method void Rect()>
	//   13   25:putfield        #22  <Field Rect mTempRect2>
		mVerticalLayoutGap = 0;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #24  <Field int mVerticalLayoutGap>
	//   17   33:return          
	}

	private static int resolveGravity(int i)
	{
		int j = i;
	//    0    0:iload_0         
	//    1    1:istore_1        
		if(i == 0)
	//*   2    2:iload_0         
	//*   3    3:ifne            9
			j = 0x800033;
	//    4    6:ldc1            #31  <Int 0x800033>
	//    5    8:istore_1        
		return j;
	//    6    9:iload_1         
	//    7   10:ireturn         
	}

	abstract View findFirstDependency(List list);

	final int getOverlapPixelsForOffset(View view)
	{
		if(mOverlayTop == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field int mOverlayTop>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return MathUtils.clamp((int)(getOverlapRatioForOffset(view) * (float)mOverlayTop), 0, mOverlayTop);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #41  <Method float getOverlapRatioForOffset(View)>
	//    8   14:aload_0         
	//    9   15:getfield        #37  <Field int mOverlayTop>
	//   10   18:i2f             
	//   11   19:fmul            
	//   12   20:f2i             
	//   13   21:iconst_0        
	//   14   22:aload_0         
	//   15   23:getfield        #37  <Field int mOverlayTop>
	//   16   26:invokestatic    #47  <Method int MathUtils.clamp(int, int, int)>
	//   17   29:ireturn         
	}

	float getOverlapRatioForOffset(View view)
	{
		return 1.0F;
	//    0    0:fconst_1        
	//    1    1:freturn         
	}

	public final int getOverlayTop()
	{
		return mOverlayTop;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int mOverlayTop>
	//    2    4:ireturn         
	}

	int getScrollRange(View view)
	{
		return view.getMeasuredHeight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #55  <Method int View.getMeasuredHeight()>
	//    2    4:ireturn         
	}

	final int getVerticalLayoutGap()
	{
		return mVerticalLayoutGap;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int mVerticalLayoutGap>
	//    2    4:ireturn         
	}

	protected void layoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		View view1 = findFirstDependency(coordinatorlayout.getDependencies(view));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #64  <Method List CoordinatorLayout.getDependencies(View)>
	//    4    6:invokevirtual   #66  <Method View findFirstDependency(List)>
	//    5    9:astore          4
		if(view1 != null)
	//*   6   11:aload           4
	//*   7   13:ifnull          224
		{
			CoordinatorLayout.LayoutParams layoutparams = (CoordinatorLayout.LayoutParams)view.getLayoutParams();
	//    8   16:aload_2         
	//    9   17:invokevirtual   #70  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   10   20:checkcast       #72  <Class CoordinatorLayout$LayoutParams>
	//   11   23:astore          5
			Rect rect = mTempRect1;
	//   12   25:aload_0         
	//   13   26:getfield        #20  <Field Rect mTempRect1>
	//   14   29:astore          6
			rect.set(coordinatorlayout.getPaddingLeft() + layoutparams.leftMargin, view1.getBottom() + layoutparams.topMargin, coordinatorlayout.getWidth() - coordinatorlayout.getPaddingRight() - layoutparams.rightMargin, (coordinatorlayout.getHeight() + view1.getBottom()) - coordinatorlayout.getPaddingBottom() - layoutparams.bottomMargin);
	//   15   31:aload           6
	//   16   33:aload_1         
	//   17   34:invokevirtual   #75  <Method int CoordinatorLayout.getPaddingLeft()>
	//   18   37:aload           5
	//   19   39:getfield        #78  <Field int CoordinatorLayout$LayoutParams.leftMargin>
	//   20   42:iadd            
	//   21   43:aload           4
	//   22   45:invokevirtual   #81  <Method int View.getBottom()>
	//   23   48:aload           5
	//   24   50:getfield        #84  <Field int CoordinatorLayout$LayoutParams.topMargin>
	//   25   53:iadd            
	//   26   54:aload_1         
	//   27   55:invokevirtual   #87  <Method int CoordinatorLayout.getWidth()>
	//   28   58:aload_1         
	//   29   59:invokevirtual   #90  <Method int CoordinatorLayout.getPaddingRight()>
	//   30   62:isub            
	//   31   63:aload           5
	//   32   65:getfield        #93  <Field int CoordinatorLayout$LayoutParams.rightMargin>
	//   33   68:isub            
	//   34   69:aload_1         
	//   35   70:invokevirtual   #96  <Method int CoordinatorLayout.getHeight()>
	//   36   73:aload           4
	//   37   75:invokevirtual   #81  <Method int View.getBottom()>
	//   38   78:iadd            
	//   39   79:aload_1         
	//   40   80:invokevirtual   #99  <Method int CoordinatorLayout.getPaddingBottom()>
	//   41   83:isub            
	//   42   84:aload           5
	//   43   86:getfield        #102 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
	//   44   89:isub            
	//   45   90:invokevirtual   #106 <Method void Rect.set(int, int, int, int)>
			WindowInsetsCompat windowinsetscompat = coordinatorlayout.getLastWindowInsets();
	//   46   93:aload_1         
	//   47   94:invokevirtual   #110 <Method WindowInsetsCompat CoordinatorLayout.getLastWindowInsets()>
	//   48   97:astore          7
			if(windowinsetscompat != null && ViewCompat.getFitsSystemWindows(((View) (coordinatorlayout))) && !ViewCompat.getFitsSystemWindows(view))
	//*  49   99:aload           7
	//*  50  101:ifnull          150
	//*  51  104:aload_1         
	//*  52  105:invokestatic    #116 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  53  108:ifeq            150
	//*  54  111:aload_2         
	//*  55  112:invokestatic    #116 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  56  115:ifne            150
			{
				rect.left = rect.left + windowinsetscompat.getSystemWindowInsetLeft();
	//   57  118:aload           6
	//   58  120:aload           6
	//   59  122:getfield        #119 <Field int Rect.left>
	//   60  125:aload           7
	//   61  127:invokevirtual   #124 <Method int WindowInsetsCompat.getSystemWindowInsetLeft()>
	//   62  130:iadd            
	//   63  131:putfield        #119 <Field int Rect.left>
				rect.right = rect.right - windowinsetscompat.getSystemWindowInsetRight();
	//   64  134:aload           6
	//   65  136:aload           6
	//   66  138:getfield        #127 <Field int Rect.right>
	//   67  141:aload           7
	//   68  143:invokevirtual   #130 <Method int WindowInsetsCompat.getSystemWindowInsetRight()>
	//   69  146:isub            
	//   70  147:putfield        #127 <Field int Rect.right>
			}
			coordinatorlayout = ((CoordinatorLayout) (mTempRect2));
	//   71  150:aload_0         
	//   72  151:getfield        #22  <Field Rect mTempRect2>
	//   73  154:astore_1        
			GravityCompat.apply(resolveGravity(layoutparams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, ((Rect) (coordinatorlayout)), i);
	//   74  155:aload           5
	//   75  157:getfield        #133 <Field int CoordinatorLayout$LayoutParams.gravity>
	//   76  160:invokestatic    #135 <Method int resolveGravity(int)>
	//   77  163:aload_2         
	//   78  164:invokevirtual   #138 <Method int View.getMeasuredWidth()>
	//   79  167:aload_2         
	//   80  168:invokevirtual   #55  <Method int View.getMeasuredHeight()>
	//   81  171:aload           6
	//   82  173:aload_1         
	//   83  174:iload_3         
	//   84  175:invokestatic    #144 <Method void GravityCompat.apply(int, int, int, Rect, Rect, int)>
			i = getOverlapPixelsForOffset(view1);
	//   85  178:aload_0         
	//   86  179:aload           4
	//   87  181:invokevirtual   #146 <Method int getOverlapPixelsForOffset(View)>
	//   88  184:istore_3        
			view.layout(((Rect) (coordinatorlayout)).left, ((Rect) (coordinatorlayout)).top - i, ((Rect) (coordinatorlayout)).right, ((Rect) (coordinatorlayout)).bottom - i);
	//   89  185:aload_2         
	//   90  186:aload_1         
	//   91  187:getfield        #119 <Field int Rect.left>
	//   92  190:aload_1         
	//   93  191:getfield        #149 <Field int Rect.top>
	//   94  194:iload_3         
	//   95  195:isub            
	//   96  196:aload_1         
	//   97  197:getfield        #127 <Field int Rect.right>
	//   98  200:aload_1         
	//   99  201:getfield        #152 <Field int Rect.bottom>
	//  100  204:iload_3         
	//  101  205:isub            
	//  102  206:invokevirtual   #155 <Method void View.layout(int, int, int, int)>
			mVerticalLayoutGap = ((Rect) (coordinatorlayout)).top - view1.getBottom();
	//  103  209:aload_0         
	//  104  210:aload_1         
	//  105  211:getfield        #149 <Field int Rect.top>
	//  106  214:aload           4
	//  107  216:invokevirtual   #81  <Method int View.getBottom()>
	//  108  219:isub            
	//  109  220:putfield        #24  <Field int mVerticalLayoutGap>
			return;
	//  110  223:return          
		} else
		{
			super.layoutChild(coordinatorlayout, view, i);
	//  111  224:aload_0         
	//  112  225:aload_1         
	//  113  226:aload_2         
	//  114  227:iload_3         
	//  115  228:invokespecial   #157 <Method void ViewOffsetBehavior.layoutChild(CoordinatorLayout, View, int)>
			mVerticalLayoutGap = 0;
	//  116  231:aload_0         
	//  117  232:iconst_0        
	//  118  233:putfield        #24  <Field int mVerticalLayoutGap>
			return;
	//  119  236:return          
		}
	}

	public boolean onMeasureChild(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
	{
		int j1 = view.getLayoutParams().height;
	//    0    0:aload_2         
	//    1    1:invokevirtual   #70  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:getfield        #164 <Field int android.view.ViewGroup$LayoutParams.height>
	//    3    7:istore          8
		if(j1 == -1 || j1 == -2)
	//*   4    9:iload           8
	//*   5   11:iconst_m1       
	//*   6   12:icmpeq          22
	//*   7   15:iload           8
	//*   8   17:bipush          -2
	//*   9   19:icmpne          150
		{
			View view1 = findFirstDependency(coordinatorlayout.getDependencies(view));
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #64  <Method List CoordinatorLayout.getDependencies(View)>
	//   14   28:invokevirtual   #66  <Method View findFirstDependency(List)>
	//   15   31:astore          11
			if(view1 != null)
	//*  16   33:aload           11
	//*  17   35:ifnull          150
			{
				if(ViewCompat.getFitsSystemWindows(view1) && !ViewCompat.getFitsSystemWindows(view))
	//*  18   38:aload           11
	//*  19   40:invokestatic    #116 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  20   43:ifeq            71
	//*  21   46:aload_2         
	//*  22   47:invokestatic    #116 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  23   50:ifne            71
				{
					ViewCompat.setFitsSystemWindows(view, true);
	//   24   53:aload_2         
	//   25   54:iconst_1        
	//   26   55:invokestatic    #168 <Method void ViewCompat.setFitsSystemWindows(View, boolean)>
					if(ViewCompat.getFitsSystemWindows(view))
	//*  27   58:aload_2         
	//*  28   59:invokestatic    #116 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  29   62:ifeq            71
					{
						view.requestLayout();
	//   30   65:aload_2         
	//   31   66:invokevirtual   #171 <Method void View.requestLayout()>
						return true;
	//   32   69:iconst_1        
	//   33   70:ireturn         
					}
				}
				int i1 = android.view.View.MeasureSpec.getSize(k);
	//   34   71:iload           5
	//   35   73:invokestatic    #176 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   36   76:istore          7
				k = i1;
	//   37   78:iload           7
	//   38   80:istore          5
				if(i1 == 0)
	//*  39   82:iload           7
	//*  40   84:ifne            93
					k = coordinatorlayout.getHeight();
	//   41   87:aload_1         
	//   42   88:invokevirtual   #96  <Method int CoordinatorLayout.getHeight()>
	//   43   91:istore          5
				int k1 = view1.getMeasuredHeight();
	//   44   93:aload           11
	//   45   95:invokevirtual   #55  <Method int View.getMeasuredHeight()>
	//   46   98:istore          9
				int l1 = getScrollRange(view1);
	//   47  100:aload_0         
	//   48  101:aload           11
	//   49  103:invokevirtual   #178 <Method int getScrollRange(View)>
	//   50  106:istore          10
				if(j1 == -1)
	//*  51  108:iload           8
	//*  52  110:iconst_m1       
	//*  53  111:icmpne          143
					i1 = 0x40000000;
	//   54  114:ldc1            #179 <Int 0x40000000>
	//   55  116:istore          7
				else
	//*  56  118:aload_1         
	//*  57  119:aload_2         
	//*  58  120:iload_3         
	//*  59  121:iload           4
	//*  60  123:iload           5
	//*  61  125:iload           9
	//*  62  127:isub            
	//*  63  128:iload           10
	//*  64  130:iadd            
	//*  65  131:iload           7
	//*  66  133:invokestatic    #183 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  67  136:iload           6
	//*  68  138:invokevirtual   #186 <Method void CoordinatorLayout.onMeasureChild(View, int, int, int, int)>
	//*  69  141:iconst_1        
	//*  70  142:ireturn         
					i1 = 0x80000000;
	//   71  143:ldc1            #187 <Int 0x80000000>
	//   72  145:istore          7
				coordinatorlayout.onMeasureChild(view, i, j, android.view.View.MeasureSpec.makeMeasureSpec((k - k1) + l1, i1), l);
				return true;
			}
		}
	//*  73  147:goto            118
		return false;
	//   74  150:iconst_0        
	//   75  151:ireturn         
	}

	public final void setOverlayTop(int i)
	{
		mOverlayTop = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #37  <Field int mOverlayTop>
	//    3    5:return          
	}

	private int mOverlayTop;
	final Rect mTempRect1;
	final Rect mTempRect2;
	private int mVerticalLayoutGap;
}
