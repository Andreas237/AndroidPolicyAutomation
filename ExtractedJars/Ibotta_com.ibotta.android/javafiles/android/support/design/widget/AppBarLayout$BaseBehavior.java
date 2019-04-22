// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.animation.AnimationUtils;
import android.support.v4.math.MathUtils;
import android.support.v4.view.*;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			HeaderBehavior, AppBarLayout, CoordinatorLayout

protected static class AppBarLayout$BaseBehavior extends HeaderBehavior
{
	public static abstract class BaseDragCallback
	{

		public abstract boolean canDrag(AppBarLayout appbarlayout);
	}

	protected static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #59  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(firstVisibleChildIndex);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #40  <Field int firstVisibleChildIndex>
		//    7   11:invokevirtual   #63  <Method void Parcel.writeInt(int)>
			parcel.writeFloat(firstVisibleChildPercentageShown);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #46  <Field float firstVisibleChildPercentageShown>
		//   11   19:invokevirtual   #67  <Method void Parcel.writeFloat(float)>
			parcel.writeByte((byte)firstVisibleChildAtMinimumHeight);
		//   12   22:aload_1         
		//   13   23:aload_0         
		//   14   24:getfield        #52  <Field boolean firstVisibleChildAtMinimumHeight>
		//   15   27:int2byte        
		//   16   28:invokevirtual   #71  <Method void Parcel.writeByte(byte)>
		//   17   31:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class AppBarLayout$BaseBehavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #25  <Method void AppBarLayout$BaseBehavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class AppBarLayout$BaseBehavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #25  <Method void AppBarLayout$BaseBehavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #29  <Method AppBarLayout$BaseBehavior$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #32  <Method AppBarLayout$BaseBehavior$SavedState createFromParcel(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public SavedState[] newArray(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #37  <Method AppBarLayout$BaseBehavior$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		boolean firstVisibleChildAtMinimumHeight;
		int firstVisibleChildIndex;
		float firstVisibleChildPercentageShown;

		static 
		{
		//    0    0:new             #12  <Class AppBarLayout$BaseBehavior$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #26  <Method void AppBarLayout$BaseBehavior$SavedState$1()>
		//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #32  <Method void AbsSavedState(Parcel, ClassLoader)>
			firstVisibleChildIndex = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #38  <Method int Parcel.readInt()>
		//    7   11:putfield        #40  <Field int firstVisibleChildIndex>
			firstVisibleChildPercentageShown = parcel.readFloat();
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokevirtual   #44  <Method float Parcel.readFloat()>
		//   11   19:putfield        #46  <Field float firstVisibleChildPercentageShown>
			boolean flag;
			if(parcel.readByte() != 0)
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #50  <Method byte Parcel.readByte()>
		//*  14   26:ifeq            34
				flag = true;
		//   15   29:iconst_1        
		//   16   30:istore_3        
			else
		//*  17   31:goto            36
				flag = false;
		//   18   34:iconst_0        
		//   19   35:istore_3        
			firstVisibleChildAtMinimumHeight = flag;
		//   20   36:aload_0         
		//   21   37:iload_3         
		//   22   38:putfield        #52  <Field boolean firstVisibleChildAtMinimumHeight>
		//   23   41:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #55  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}


	private void animateOffsetTo(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, float f)
	{
		int j = Math.abs(getTopBottomOffsetForScrollingSibling() - i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method int getTopBottomOffsetForScrollingSibling()>
	//    2    4:iload_3         
	//    3    5:isub            
	//    4    6:invokestatic    #59  <Method int Math.abs(int)>
	//    5    9:istore          5
		f = Math.abs(f);
	//    6   11:fload           4
	//    7   13:invokestatic    #62  <Method float Math.abs(float)>
	//    8   16:fstore          4
		if(f > 0.0F)
	//*   9   18:fload           4
	//*  10   20:fconst_0        
	//*  11   21:fcmpl           
	//*  12   22:ifle            44
			j = Math.round(((float)j / f) * 1000F) * 3;
	//   13   25:iload           5
	//   14   27:i2f             
	//   15   28:fload           4
	//   16   30:fdiv            
	//   17   31:ldc1            #63  <Float 1000F>
	//   18   33:fmul            
	//   19   34:invokestatic    #67  <Method int Math.round(float)>
	//   20   37:iconst_3        
	//   21   38:imul            
	//   22   39:istore          5
		else
	//*  23   41:goto            61
			j = (int)(((float)j / (float)appbarlayout.getHeight() + 1.0F) * 150F);
	//   24   44:iload           5
	//   25   46:i2f             
	//   26   47:aload_2         
	//   27   48:invokevirtual   #70  <Method int AppBarLayout.getHeight()>
	//   28   51:i2f             
	//   29   52:fdiv            
	//   30   53:fconst_1        
	//   31   54:fadd            
	//   32   55:ldc1            #71  <Float 150F>
	//   33   57:fmul            
	//   34   58:f2i             
	//   35   59:istore          5
		animateOffsetWithDuration(coordinatorlayout, appbarlayout, i, j);
	//   36   61:aload_0         
	//   37   62:aload_1         
	//   38   63:aload_2         
	//   39   64:iload_3         
	//   40   65:iload           5
	//   41   67:invokespecial   #75  <Method void animateOffsetWithDuration(CoordinatorLayout, AppBarLayout, int, int)>
	//   42   70:return          
	}

	private void animateOffsetWithDuration(final CoordinatorLayout coordinatorLayout, final AppBarLayout child, int i, int j)
	{
		int k = getTopBottomOffsetForScrollingSibling();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method int getTopBottomOffsetForScrollingSibling()>
	//    2    4:istore          5
		if(k == i)
	//*   3    6:iload           5
	//*   4    8:iload_3         
	//*   5    9:icmpne          36
		{
			coordinatorLayout = ((CoordinatorLayout) (offsetAnimator));
	//    6   12:aload_0         
	//    7   13:getfield        #79  <Field ValueAnimator offsetAnimator>
	//    8   16:astore_1        
			if(coordinatorLayout != null && ((ValueAnimator) (coordinatorLayout)).isRunning())
	//*   9   17:aload_1         
	//*  10   18:ifnull          35
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #85  <Method boolean ValueAnimator.isRunning()>
	//*  13   25:ifeq            35
				offsetAnimator.cancel();
	//   14   28:aload_0         
	//   15   29:getfield        #79  <Field ValueAnimator offsetAnimator>
	//   16   32:invokevirtual   #88  <Method void ValueAnimator.cancel()>
			return;
	//   17   35:return          
		}
		ValueAnimator valueanimator = offsetAnimator;
	//   18   36:aload_0         
	//   19   37:getfield        #79  <Field ValueAnimator offsetAnimator>
	//   20   40:astore          6
		if(valueanimator == null)
	//*  21   42:aload           6
	//*  22   44:ifnonnull       88
		{
			offsetAnimator = new ValueAnimator();
	//   23   47:aload_0         
	//   24   48:new             #81  <Class ValueAnimator>
	//   25   51:dup             
	//   26   52:invokespecial   #89  <Method void ValueAnimator()>
	//   27   55:putfield        #79  <Field ValueAnimator offsetAnimator>
			offsetAnimator.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
	//   28   58:aload_0         
	//   29   59:getfield        #79  <Field ValueAnimator offsetAnimator>
	//   30   62:getstatic       #95  <Field android.animation.TimeInterpolator AnimationUtils.DECELERATE_INTERPOLATOR>
	//   31   65:invokevirtual   #99  <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			offsetAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator1)
				{
					setHeaderTopBottomOffset(coordinatorLayout, ((View) (child)), ((Integer)valueanimator1.getAnimatedValue()).intValue());
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field AppBarLayout$BaseBehavior this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #26  <Field CoordinatorLayout val$coordinatorLayout>
				//    4    8:aload_0         
				//    5    9:getfield        #28  <Field AppBarLayout val$child>
				//    6   12:aload_1         
				//    7   13:invokevirtual   #40  <Method Object ValueAnimator.getAnimatedValue()>
				//    8   16:checkcast       #42  <Class Integer>
				//    9   19:invokevirtual   #46  <Method int Integer.intValue()>
				//   10   22:invokevirtual   #50  <Method int AppBarLayout$BaseBehavior.setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
				//   11   25:pop             
				//   12   26:return          
				}

				final AppBarLayout.BaseBehavior this$0;
				final AppBarLayout val$child;
				final CoordinatorLayout val$coordinatorLayout;

			
			{
				this$0 = AppBarLayout.BaseBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field AppBarLayout$BaseBehavior this$0>
				coordinatorLayout = coordinatorlayout;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field CoordinatorLayout val$coordinatorLayout>
				child = appbarlayout;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field AppBarLayout val$child>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   32   68:aload_0         
	//   33   69:getfield        #79  <Field ValueAnimator offsetAnimator>
	//   34   72:new             #10  <Class AppBarLayout$BaseBehavior$1>
	//   35   75:dup             
	//   36   76:aload_0         
	//   37   77:aload_1         
	//   38   78:aload_2         
	//   39   79:invokespecial   #102 <Method void AppBarLayout$BaseBehavior$1(AppBarLayout$BaseBehavior, CoordinatorLayout, AppBarLayout)>
	//   40   82:invokevirtual   #106 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		} else
	//*  41   85:goto            93
		{
			valueanimator.cancel();
	//   42   88:aload           6
	//   43   90:invokevirtual   #88  <Method void ValueAnimator.cancel()>
		}
		offsetAnimator.setDuration(Math.min(j, 600));
	//   44   93:aload_0         
	//   45   94:getfield        #79  <Field ValueAnimator offsetAnimator>
	//   46   97:iload           4
	//   47   99:sipush          600
	//   48  102:invokestatic    #110 <Method int Math.min(int, int)>
	//   49  105:i2l             
	//   50  106:invokevirtual   #114 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   51  109:pop             
		offsetAnimator.setIntValues(new int[] {
			k, i
		});
	//   52  110:aload_0         
	//   53  111:getfield        #79  <Field ValueAnimator offsetAnimator>
	//   54  114:iconst_2        
	//   55  115:newarray        int[]
	//   56  117:dup             
	//   57  118:iconst_0        
	//   58  119:iload           5
	//   59  121:iastore         
	//   60  122:dup             
	//   61  123:iconst_1        
	//   62  124:iload_3         
	//   63  125:iastore         
	//   64  126:invokevirtual   #118 <Method void ValueAnimator.setIntValues(int[])>
		offsetAnimator.start();
	//   65  129:aload_0         
	//   66  130:getfield        #79  <Field ValueAnimator offsetAnimator>
	//   67  133:invokevirtual   #121 <Method void ValueAnimator.start()>
	//   68  136:return          
	}

	private boolean canScrollChildren(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view)
	{
		return appbarlayout.hasScrollableChildren() && coordinatorlayout.getHeight() - view.getHeight() <= appbarlayout.getHeight();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #127 <Method boolean AppBarLayout.hasScrollableChildren()>
	//    2    4:ifeq            25
	//    3    7:aload_1         
	//    4    8:invokevirtual   #130 <Method int CoordinatorLayout.getHeight()>
	//    5   11:aload_3         
	//    6   12:invokevirtual   #133 <Method int View.getHeight()>
	//    7   15:isub            
	//    8   16:aload_2         
	//    9   17:invokevirtual   #70  <Method int AppBarLayout.getHeight()>
	//   10   20:icmpgt          25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	private static boolean checkFlag(int i, int j)
	{
		return (i & j) == j;
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iand            
	//    3    3:iload_1         
	//    4    4:icmpne          9
	//    5    7:iconst_1        
	//    6    8:ireturn         
	//    7    9:iconst_0        
	//    8   10:ireturn         
	}

	private View findFirstScrollingChild(CoordinatorLayout coordinatorlayout)
	{
		int j = coordinatorlayout.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #142 <Method int CoordinatorLayout.getChildCount()>
	//    2    4:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          37
		{
			View view = coordinatorlayout.getChildAt(i);
	//    8   12:aload_1         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #146 <Method View CoordinatorLayout.getChildAt(int)>
	//   11   17:astore          4
			if(view instanceof NestedScrollingChild)
	//*  12   19:aload           4
	//*  13   21:instanceof      #148 <Class NestedScrollingChild>
	//*  14   24:ifeq            30
				return view;
	//   15   27:aload           4
	//   16   29:areturn         
		}

	//   17   30:iload_2         
	//   18   31:iconst_1        
	//   19   32:iadd            
	//   20   33:istore_2        
	//*  21   34:goto            7
		return null;
	//   22   37:aconst_null     
	//   23   38:areturn         
	}

	private static View getAppBarChildOnOffset(AppBarLayout appbarlayout, int i)
	{
		int j = Math.abs(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #59  <Method int Math.abs(int)>
	//    2    4:istore_2        
		int k = appbarlayout.getChildCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #152 <Method int AppBarLayout.getChildCount()>
	//    5    9:istore_3        
		for(i = 0; i < k; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:iload_3         
	//*  10   14:icmpge          52
		{
			View view = appbarlayout.getChildAt(i);
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:invokevirtual   #153 <Method View AppBarLayout.getChildAt(int)>
	//   14   22:astore          4
			if(j >= view.getTop() && j <= view.getBottom())
	//*  15   24:iload_2         
	//*  16   25:aload           4
	//*  17   27:invokevirtual   #156 <Method int View.getTop()>
	//*  18   30:icmplt          45
	//*  19   33:iload_2         
	//*  20   34:aload           4
	//*  21   36:invokevirtual   #159 <Method int View.getBottom()>
	//*  22   39:icmpgt          45
				return view;
	//   23   42:aload           4
	//   24   44:areturn         
		}

	//   25   45:iload_1         
	//   26   46:iconst_1        
	//   27   47:iadd            
	//   28   48:istore_1        
	//*  29   49:goto            12
		return null;
	//   30   52:aconst_null     
	//   31   53:areturn         
	}

	private int getChildIndexOnOffset(AppBarLayout appbarlayout, int i)
	{
		int k1 = appbarlayout.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #152 <Method int AppBarLayout.getChildCount()>
	//    2    4:istore          8
		for(int j = 0; j < k1; j++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           8
	//*   7   11:icmpge          113
		{
			Object obj = ((Object) (appbarlayout.getChildAt(j)));
	//    8   14:aload_1         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #153 <Method View AppBarLayout.getChildAt(int)>
	//   11   19:astore          9
			int j1 = ((View) (obj)).getTop();
	//   12   21:aload           9
	//   13   23:invokevirtual   #156 <Method int View.getTop()>
	//   14   26:istore          7
			int i1 = ((View) (obj)).getBottom();
	//   15   28:aload           9
	//   16   30:invokevirtual   #159 <Method int View.getBottom()>
	//   17   33:istore          6
			obj = ((Object) ((AppBarLayout$LayoutParams)((View) (obj)).getLayoutParams()));
	//   18   35:aload           9
	//   19   37:invokevirtual   #165 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   40:checkcast       #167 <Class AppBarLayout$LayoutParams>
	//   21   43:astore          9
			int l = j1;
	//   22   45:iload           7
	//   23   47:istore          5
			int k = i1;
	//   24   49:iload           6
	//   25   51:istore          4
			if(checkFlag(((AppBarLayout$LayoutParams) (obj)).getScrollFlags(), 32))
	//*  26   53:aload           9
	//*  27   55:invokevirtual   #170 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
	//*  28   58:bipush          32
	//*  29   60:invokestatic    #172 <Method boolean checkFlag(int, int)>
	//*  30   63:ifeq            86
			{
				l = j1 - ((AppBarLayout$LayoutParams) (obj)).topMargin;
	//   31   66:iload           7
	//   32   68:aload           9
	//   33   70:getfield        #175 <Field int AppBarLayout$LayoutParams.topMargin>
	//   34   73:isub            
	//   35   74:istore          5
				k = i1 + ((AppBarLayout$LayoutParams) (obj)).bottomMargin;
	//   36   76:iload           6
	//   37   78:aload           9
	//   38   80:getfield        #178 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   39   83:iadd            
	//   40   84:istore          4
			}
			i1 = -i;
	//   41   86:iload_2         
	//   42   87:ineg            
	//   43   88:istore          6
			if(l <= i1 && k >= i1)
	//*  44   90:iload           5
	//*  45   92:iload           6
	//*  46   94:icmpgt          106
	//*  47   97:iload           4
	//*  48   99:iload           6
	//*  49  101:icmplt          106
				return j;
	//   50  104:iload_3         
	//   51  105:ireturn         
		}

	//   52  106:iload_3         
	//   53  107:iconst_1        
	//   54  108:iadd            
	//   55  109:istore_3        
	//*  56  110:goto            8
		return -1;
	//   57  113:iconst_m1       
	//   58  114:ireturn         
	}

	private int interpolateOffset(AppBarLayout appbarlayout, int i)
	{
		int l = Math.abs(i);
	//    0    0:iload_2         
	//    1    1:invokestatic    #59  <Method int Math.abs(int)>
	//    2    4:istore          6
		int i1 = appbarlayout.getChildCount();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #152 <Method int AppBarLayout.getChildCount()>
	//    5   10:istore          7
		int k = 0;
	//    6   12:iconst_0        
	//    7   13:istore          5
		int j = 0;
	//    8   15:iconst_0        
	//    9   16:istore          4
		do
		{
			if(j >= i1)
				break;
	//   10   18:iload           4
	//   11   20:iload           7
	//   12   22:icmpge          217
			View view = appbarlayout.getChildAt(j);
	//   13   25:aload_1         
	//   14   26:iload           4
	//   15   28:invokevirtual   #153 <Method View AppBarLayout.getChildAt(int)>
	//   16   31:astore          8
			AppBarLayout$LayoutParams appbarlayout$layoutparams = (AppBarLayout$LayoutParams)view.getLayoutParams();
	//   17   33:aload           8
	//   18   35:invokevirtual   #165 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   38:checkcast       #167 <Class AppBarLayout$LayoutParams>
	//   20   41:astore          9
			Interpolator interpolator = appbarlayout$layoutparams.getScrollInterpolator();
	//   21   43:aload           9
	//   22   45:invokevirtual   #184 <Method Interpolator AppBarLayout$LayoutParams.getScrollInterpolator()>
	//   23   48:astore          10
			if(l >= view.getTop() && l <= view.getBottom())
	//*  24   50:iload           6
	//*  25   52:aload           8
	//*  26   54:invokevirtual   #156 <Method int View.getTop()>
	//*  27   57:icmplt          208
	//*  28   60:iload           6
	//*  29   62:aload           8
	//*  30   64:invokevirtual   #159 <Method int View.getBottom()>
	//*  31   67:icmpgt          208
			{
				if(interpolator != null)
	//*  32   70:aload           10
	//*  33   72:ifnull          217
				{
					int j1 = appbarlayout$layoutparams.getScrollFlags();
	//   34   75:aload           9
	//   35   77:invokevirtual   #170 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
	//   36   80:istore          7
					j = k;
	//   37   82:iload           5
	//   38   84:istore          4
					if((j1 & 1) != 0)
	//*  39   86:iload           7
	//*  40   88:iconst_1        
	//*  41   89:iand            
	//*  42   90:ifeq            135
					{
						k = 0 + (view.getHeight() + appbarlayout$layoutparams.topMargin + appbarlayout$layoutparams.bottomMargin);
	//   43   93:iconst_0        
	//   44   94:aload           8
	//   45   96:invokevirtual   #133 <Method int View.getHeight()>
	//   46   99:aload           9
	//   47  101:getfield        #175 <Field int AppBarLayout$LayoutParams.topMargin>
	//   48  104:iadd            
	//   49  105:aload           9
	//   50  107:getfield        #178 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   51  110:iadd            
	//   52  111:iadd            
	//   53  112:istore          5
						j = k;
	//   54  114:iload           5
	//   55  116:istore          4
						if((j1 & 2) != 0)
	//*  56  118:iload           7
	//*  57  120:iconst_2        
	//*  58  121:iand            
	//*  59  122:ifeq            135
							j = k - ViewCompat.getMinimumHeight(view);
	//   60  125:iload           5
	//   61  127:aload           8
	//   62  129:invokestatic    #190 <Method int ViewCompat.getMinimumHeight(View)>
	//   63  132:isub            
	//   64  133:istore          4
					}
					k = j;
	//   65  135:iload           4
	//   66  137:istore          5
					if(ViewCompat.getFitsSystemWindows(view))
	//*  67  139:aload           8
	//*  68  141:invokestatic    #194 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  69  144:ifeq            156
						k = j - appbarlayout.getTopInset();
	//   70  147:iload           4
	//   71  149:aload_1         
	//   72  150:invokevirtual   #197 <Method int AppBarLayout.getTopInset()>
	//   73  153:isub            
	//   74  154:istore          5
					if(k > 0)
	//*  75  156:iload           5
	//*  76  158:ifle            217
					{
						j = view.getTop();
	//   77  161:aload           8
	//   78  163:invokevirtual   #156 <Method int View.getTop()>
	//   79  166:istore          4
						float f = k;
	//   80  168:iload           5
	//   81  170:i2f             
	//   82  171:fstore_3        
						j = Math.round(f * interpolator.getInterpolation((float)(l - j) / f));
	//   83  172:fload_3         
	//   84  173:aload           10
	//   85  175:iload           6
	//   86  177:iload           4
	//   87  179:isub            
	//   88  180:i2f             
	//   89  181:fload_3         
	//   90  182:fdiv            
	//   91  183:invokeinterface #202 <Method float Interpolator.getInterpolation(float)>
	//   92  188:fmul            
	//   93  189:invokestatic    #67  <Method int Math.round(float)>
	//   94  192:istore          4
						return Integer.signum(i) * (view.getTop() + j);
	//   95  194:iload_2         
	//   96  195:invokestatic    #207 <Method int Integer.signum(int)>
	//   97  198:aload           8
	//   98  200:invokevirtual   #156 <Method int View.getTop()>
	//   99  203:iload           4
	//  100  205:iadd            
	//  101  206:imul            
	//  102  207:ireturn         
					}
				}
				break;
			}
			j++;
	//  103  208:iload           4
	//  104  210:iconst_1        
	//  105  211:iadd            
	//  106  212:istore          4
		} while(true);
	//  107  214:goto            18
		return i;
	//  108  217:iload_2         
	//  109  218:ireturn         
	}

	private boolean shouldJumpElevationState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
	{
		coordinatorlayout = ((CoordinatorLayout) (coordinatorlayout.getDependents(((View) (appbarlayout)))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #213 <Method List CoordinatorLayout.getDependents(View)>
	//    3    5:astore_1        
		int j = ((List) (coordinatorlayout)).size();
	//    4    6:aload_1         
	//    5    7:invokeinterface #218 <Method int List.size()>
	//    6   12:istore          4
		boolean flag = false;
	//    7   14:iconst_0        
	//    8   15:istore          5
		for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_3        
	//*  11   19:iload_3         
	//*  12   20:iload           4
	//*  13   22:icmpge          75
		{
			appbarlayout = ((AppBarLayout) (((rams)((View)((List) (coordinatorlayout)).get(i)).getLayoutParams()).getBehavior()));
	//   14   25:aload_1         
	//   15   26:iload_3         
	//   16   27:invokeinterface #222 <Method Object List.get(int)>
	//   17   32:checkcast       #132 <Class View>
	//   18   35:invokevirtual   #165 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   38:checkcast       #224 <Class CoordinatorLayout$LayoutParams>
	//   20   41:invokevirtual   #228 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   21   44:astore_2        
			if(appbarlayout instanceof Behavior)
	//*  22   45:aload_2         
	//*  23   46:instanceof      #230 <Class AppBarLayout$ScrollingViewBehavior>
	//*  24   49:ifeq            68
			{
				if(((Behavior)appbarlayout).getOverlayTop() != 0)
	//*  25   52:aload_2         
	//*  26   53:checkcast       #230 <Class AppBarLayout$ScrollingViewBehavior>
	//*  27   56:invokevirtual   #233 <Method int AppBarLayout$ScrollingViewBehavior.getOverlayTop()>
	//*  28   59:ifeq            65
					flag = true;
	//   29   62:iconst_1        
	//   30   63:istore          5
				return flag;
	//   31   65:iload           5
	//   32   67:ireturn         
			}
		}

	//   33   68:iload_3         
	//   34   69:iconst_1        
	//   35   70:iadd            
	//   36   71:istore_3        
	//*  37   72:goto            19
		return false;
	//   38   75:iconst_0        
	//   39   76:ireturn         
	}

	private void snapToChildIfNeeded(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
	{
		int i1 = getTopBottomOffsetForScrollingSibling();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method int getTopBottomOffsetForScrollingSibling()>
	//    2    4:istore          7
		int k = getChildIndexOnOffset(appbarlayout, i1);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:iload           7
	//    6   10:invokespecial   #238 <Method int getChildIndexOnOffset(AppBarLayout, int)>
	//    7   13:istore          5
		if(k >= 0)
	//*   8   15:iload           5
	//*   9   17:iflt            232
		{
			View view = appbarlayout.getChildAt(k);
	//   10   20:aload_2         
	//   11   21:iload           5
	//   12   23:invokevirtual   #153 <Method View AppBarLayout.getChildAt(int)>
	//   13   26:astore          9
			AppBarLayout$LayoutParams appbarlayout$layoutparams = (AppBarLayout$LayoutParams)view.getLayoutParams();
	//   14   28:aload           9
	//   15   30:invokevirtual   #165 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   33:checkcast       #167 <Class AppBarLayout$LayoutParams>
	//   17   36:astore          10
			int j1 = appbarlayout$layoutparams.getScrollFlags();
	//   18   38:aload           10
	//   19   40:invokevirtual   #170 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
	//   20   43:istore          8
			if((j1 & 0x11) == 17)
	//*  21   45:iload           8
	//*  22   47:bipush          17
	//*  23   49:iand            
	//*  24   50:bipush          17
	//*  25   52:icmpne          232
			{
				int l = -view.getTop();
	//   26   55:aload           9
	//   27   57:invokevirtual   #156 <Method int View.getTop()>
	//   28   60:ineg            
	//   29   61:istore          6
				int i = -view.getBottom();
	//   30   63:aload           9
	//   31   65:invokevirtual   #159 <Method int View.getBottom()>
	//   32   68:ineg            
	//   33   69:istore_3        
				int j = i;
	//   34   70:iload_3         
	//   35   71:istore          4
				if(k == appbarlayout.getChildCount() - 1)
	//*  36   73:iload           5
	//*  37   75:aload_2         
	//*  38   76:invokevirtual   #152 <Method int AppBarLayout.getChildCount()>
	//*  39   79:iconst_1        
	//*  40   80:isub            
	//*  41   81:icmpne          92
					j = i + appbarlayout.getTopInset();
	//   42   84:iload_3         
	//   43   85:aload_2         
	//   44   86:invokevirtual   #197 <Method int AppBarLayout.getTopInset()>
	//   45   89:iadd            
	//   46   90:istore          4
				if(checkFlag(j1, 2))
	//*  47   92:iload           8
	//*  48   94:iconst_2        
	//*  49   95:invokestatic    #172 <Method boolean checkFlag(int, int)>
	//*  50   98:ifeq            117
				{
					i = j + ViewCompat.getMinimumHeight(view);
	//   51  101:iload           4
	//   52  103:aload           9
	//   53  105:invokestatic    #190 <Method int ViewCompat.getMinimumHeight(View)>
	//   54  108:iadd            
	//   55  109:istore_3        
					k = l;
	//   56  110:iload           6
	//   57  112:istore          5
				} else
	//*  58  114:goto            161
				{
					k = l;
	//   59  117:iload           6
	//   60  119:istore          5
					i = j;
	//   61  121:iload           4
	//   62  123:istore_3        
					if(checkFlag(j1, 5))
	//*  63  124:iload           8
	//*  64  126:iconst_5        
	//*  65  127:invokestatic    #172 <Method boolean checkFlag(int, int)>
	//*  66  130:ifeq            161
					{
						i = ViewCompat.getMinimumHeight(view) + j;
	//   67  133:aload           9
	//   68  135:invokestatic    #190 <Method int ViewCompat.getMinimumHeight(View)>
	//   69  138:iload           4
	//   70  140:iadd            
	//   71  141:istore_3        
						if(i1 < i)
	//*  72  142:iload           7
	//*  73  144:iload_3         
	//*  74  145:icmpge          157
						{
							k = i;
	//   75  148:iload_3         
	//   76  149:istore          5
							i = j;
	//   77  151:iload           4
	//   78  153:istore_3        
						} else
	//*  79  154:goto            161
						{
							k = l;
	//   80  157:iload           6
	//   81  159:istore          5
						}
					}
				}
				l = k;
	//   82  161:iload           5
	//   83  163:istore          6
				j = i;
	//   84  165:iload_3         
	//   85  166:istore          4
				if(checkFlag(j1, 32))
	//*  86  168:iload           8
	//*  87  170:bipush          32
	//*  88  172:invokestatic    #172 <Method boolean checkFlag(int, int)>
	//*  89  175:ifeq            197
				{
					l = k + appbarlayout$layoutparams.topMargin;
	//   90  178:iload           5
	//   91  180:aload           10
	//   92  182:getfield        #175 <Field int AppBarLayout$LayoutParams.topMargin>
	//   93  185:iadd            
	//   94  186:istore          6
					j = i - appbarlayout$layoutparams.bottomMargin;
	//   95  188:iload_3         
	//   96  189:aload           10
	//   97  191:getfield        #178 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   98  194:isub            
	//   99  195:istore          4
				}
				i = l;
	//  100  197:iload           6
	//  101  199:istore_3        
				if(i1 < (j + l) / 2)
	//* 102  200:iload           7
	//* 103  202:iload           4
	//* 104  204:iload           6
	//* 105  206:iadd            
	//* 106  207:iconst_2        
	//* 107  208:idiv            
	//* 108  209:icmpge          215
					i = j;
	//  109  212:iload           4
	//  110  214:istore_3        
				animateOffsetTo(coordinatorlayout, appbarlayout, MathUtils.clamp(i, -appbarlayout.getTotalScrollRange(), 0), 0.0F);
	//  111  215:aload_0         
	//  112  216:aload_1         
	//  113  217:aload_2         
	//  114  218:iload_3         
	//  115  219:aload_2         
	//  116  220:invokevirtual   #241 <Method int AppBarLayout.getTotalScrollRange()>
	//  117  223:ineg            
	//  118  224:iconst_0        
	//  119  225:invokestatic    #247 <Method int MathUtils.clamp(int, int, int)>
	//  120  228:fconst_0        
	//  121  229:invokespecial   #249 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
			}
		}
	//  122  232:return          
	}

	private void stopNestedScrollIfNeeded(int i, AppBarLayout appbarlayout, View view, int j)
	{
		if(j == 1)
	//*   0    0:iload           4
	//*   1    2:iconst_1        
	//*   2    3:icmpne          40
		{
			j = getTopBottomOffsetForScrollingSibling();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #53  <Method int getTopBottomOffsetForScrollingSibling()>
	//    5   10:istore          4
			if(i < 0 && j == 0 || i > 0 && j == -appbarlayout.getDownNestedScrollRange())
	//*   6   12:iload_1         
	//*   7   13:ifge            21
	//*   8   16:iload           4
	//*   9   18:ifeq            35
	//*  10   21:iload_1         
	//*  11   22:ifle            40
	//*  12   25:iload           4
	//*  13   27:aload_2         
	//*  14   28:invokevirtual   #255 <Method int AppBarLayout.getDownNestedScrollRange()>
	//*  15   31:ineg            
	//*  16   32:icmpne          40
				ViewCompat.stopNestedScroll(view, 1);
	//   17   35:aload_3         
	//   18   36:iconst_1        
	//   19   37:invokestatic    #259 <Method void ViewCompat.stopNestedScroll(View, int)>
		}
	//   20   40:return          
	}

	private void updateAppBarLayoutDrawableState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, boolean flag)
	{
label0:
		{
			boolean flag1;
label1:
			{
				View view = getAppBarChildOnOffset(appbarlayout, i);
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokestatic    #264 <Method View getAppBarChildOnOffset(AppBarLayout, int)>
	//    3    5:astore          10
				if(view == null)
					break label0;
	//    4    7:aload           10
	//    5    9:ifnull          205
				int k = ((AppBarLayout$LayoutParams)view.getLayoutParams()).getScrollFlags();
	//    6   12:aload           10
	//    7   14:invokevirtual   #165 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    8   17:checkcast       #167 <Class AppBarLayout$LayoutParams>
	//    9   20:invokevirtual   #170 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
	//   10   23:istore          6
				if((k & 1) != 0)
	//*  11   25:iload           6
	//*  12   27:iconst_1        
	//*  13   28:iand            
	//*  14   29:ifeq            119
				{
					int l = ViewCompat.getMinimumHeight(view);
	//   15   32:aload           10
	//   16   34:invokestatic    #190 <Method int ViewCompat.getMinimumHeight(View)>
	//   17   37:istore          7
					if(j > 0 && (k & 0xc) != 0)
	//*  18   39:iload           4
	//*  19   41:ifle            82
	//*  20   44:iload           6
	//*  21   46:bipush          12
	//*  22   48:iand            
	//*  23   49:ifeq            82
					{
						if(-i >= view.getBottom() - l - appbarlayout.getTopInset())
	//*  24   52:iload_3         
	//*  25   53:ineg            
	//*  26   54:aload           10
	//*  27   56:invokevirtual   #159 <Method int View.getBottom()>
	//*  28   59:iload           7
	//*  29   61:isub            
	//*  30   62:aload_2         
	//*  31   63:invokevirtual   #197 <Method int AppBarLayout.getTopInset()>
	//*  32   66:isub            
	//*  33   67:icmplt          76
							flag1 = true;
	//   34   70:iconst_1        
	//   35   71:istore          8
						else
	//*  36   73:goto            122
							flag1 = false;
	//   37   76:iconst_0        
	//   38   77:istore          8
						break label1;
	//   39   79:goto            122
					}
					if((k & 2) != 0)
	//*  40   82:iload           6
	//*  41   84:iconst_2        
	//*  42   85:iand            
	//*  43   86:ifeq            119
					{
						if(-i >= view.getBottom() - l - appbarlayout.getTopInset())
	//*  44   89:iload_3         
	//*  45   90:ineg            
	//*  46   91:aload           10
	//*  47   93:invokevirtual   #159 <Method int View.getBottom()>
	//*  48   96:iload           7
	//*  49   98:isub            
	//*  50   99:aload_2         
	//*  51  100:invokevirtual   #197 <Method int AppBarLayout.getTopInset()>
	//*  52  103:isub            
	//*  53  104:icmplt          113
							flag1 = true;
	//   54  107:iconst_1        
	//   55  108:istore          8
						else
	//*  56  110:goto            122
							flag1 = false;
	//   57  113:iconst_0        
	//   58  114:istore          8
						break label1;
	//   59  116:goto            122
					}
				}
				flag1 = false;
	//   60  119:iconst_0        
	//   61  120:istore          8
			}
			boolean flag2 = flag1;
	//   62  122:iload           8
	//   63  124:istore          9
			if(appbarlayout.isLiftOnScroll())
	//*  64  126:aload_2         
	//*  65  127:invokevirtual   #267 <Method boolean AppBarLayout.isLiftOnScroll()>
	//*  66  130:ifeq            166
			{
				View view1 = findFirstScrollingChild(coordinatorlayout);
	//   67  133:aload_0         
	//   68  134:aload_1         
	//   69  135:invokespecial   #269 <Method View findFirstScrollingChild(CoordinatorLayout)>
	//   70  138:astore          10
				flag2 = flag1;
	//   71  140:iload           8
	//   72  142:istore          9
				if(view1 != null)
	//*  73  144:aload           10
	//*  74  146:ifnull          166
					if(view1.getScrollY() > 0)
	//*  75  149:aload           10
	//*  76  151:invokevirtual   #272 <Method int View.getScrollY()>
	//*  77  154:ifle            163
						flag2 = true;
	//   78  157:iconst_1        
	//   79  158:istore          9
					else
	//*  80  160:goto            166
						flag2 = false;
	//   81  163:iconst_0        
	//   82  164:istore          9
			}
			flag1 = appbarlayout.setLiftedState(flag2);
	//   83  166:aload_2         
	//   84  167:iload           9
	//   85  169:invokevirtual   #276 <Method boolean AppBarLayout.setLiftedState(boolean)>
	//   86  172:istore          8
			if(android.os.Build.VERSION.SDK_INT >= 11 && (flag || flag1 && shouldJumpElevationState(coordinatorlayout, appbarlayout)))
	//*  87  174:getstatic       #281 <Field int android.os.Build$VERSION.SDK_INT>
	//*  88  177:bipush          11
	//*  89  179:icmplt          205
	//*  90  182:iload           5
	//*  91  184:ifne            201
	//*  92  187:iload           8
	//*  93  189:ifeq            205
	//*  94  192:aload_0         
	//*  95  193:aload_1         
	//*  96  194:aload_2         
	//*  97  195:invokespecial   #283 <Method boolean shouldJumpElevationState(CoordinatorLayout, AppBarLayout)>
	//*  98  198:ifeq            205
				appbarlayout.jumpDrawablesToCurrentState();
	//   99  201:aload_2         
	//  100  202:invokevirtual   #286 <Method void AppBarLayout.jumpDrawablesToCurrentState()>
		}
	//  101  205:return          
	}

	boolean canDragView(AppBarLayout appbarlayout)
	{
		BaseDragCallback basedragcallback = onDragCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #291 <Field AppBarLayout$BaseBehavior$BaseDragCallback onDragCallback>
	//    2    4:astore_2        
		if(basedragcallback != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			return basedragcallback.canDrag(appbarlayout);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #294 <Method boolean AppBarLayout$BaseBehavior$BaseDragCallback.canDrag(AppBarLayout)>
	//    8   14:ireturn         
		appbarlayout = ((AppBarLayout) (lastNestedScrollingChildRef));
	//    9   15:aload_0         
	//   10   16:getfield        #296 <Field WeakReference lastNestedScrollingChildRef>
	//   11   19:astore_1        
		if(appbarlayout != null)
	//*  12   20:aload_1         
	//*  13   21:ifnull          55
		{
			appbarlayout = ((AppBarLayout) ((View)((WeakReference) (appbarlayout)).get()));
	//   14   24:aload_1         
	//   15   25:invokevirtual   #301 <Method Object WeakReference.get()>
	//   16   28:checkcast       #132 <Class View>
	//   17   31:astore_1        
			return appbarlayout != null && ((View) (appbarlayout)).isShown() && !((View) (appbarlayout)).canScrollVertically(-1);
	//   18   32:aload_1         
	//   19   33:ifnull          53
	//   20   36:aload_1         
	//   21   37:invokevirtual   #304 <Method boolean View.isShown()>
	//   22   40:ifeq            53
	//   23   43:aload_1         
	//   24   44:iconst_m1       
	//   25   45:invokevirtual   #308 <Method boolean View.canScrollVertically(int)>
	//   26   48:ifne            53
	//   27   51:iconst_1        
	//   28   52:ireturn         
	//   29   53:iconst_0        
	//   30   54:ireturn         
		} else
		{
			return true;
	//   31   55:iconst_1        
	//   32   56:ireturn         
		}
	}

	volatile boolean canDragView(View view)
	{
		return canDragView((AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class AppBarLayout>
	//    3    5:invokevirtual   #311 <Method boolean canDragView(AppBarLayout)>
	//    4    8:ireturn         
	}

	int getMaxDragOffset(AppBarLayout appbarlayout)
	{
		return -appbarlayout.getDownNestedScrollRange();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #255 <Method int AppBarLayout.getDownNestedScrollRange()>
	//    2    4:ineg            
	//    3    5:ireturn         
	}

	volatile int getMaxDragOffset(View view)
	{
		return getMaxDragOffset((AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class AppBarLayout>
	//    3    5:invokevirtual   #316 <Method int getMaxDragOffset(AppBarLayout)>
	//    4    8:ireturn         
	}

	int getScrollRangeForDragFling(AppBarLayout appbarlayout)
	{
		return appbarlayout.getTotalScrollRange();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #241 <Method int AppBarLayout.getTotalScrollRange()>
	//    2    4:ireturn         
	}

	volatile int getScrollRangeForDragFling(View view)
	{
		return getScrollRangeForDragFling((AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class AppBarLayout>
	//    3    5:invokevirtual   #319 <Method int getScrollRangeForDragFling(AppBarLayout)>
	//    4    8:ireturn         
	}

	int getTopBottomOffsetForScrollingSibling()
	{
		return getTopAndBottomOffset() + offsetDelta;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method int getTopAndBottomOffset()>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field int offsetDelta>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	void onFlingFinished(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
	{
		snapToChildIfNeeded(coordinatorlayout, appbarlayout);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #325 <Method void snapToChildIfNeeded(CoordinatorLayout, AppBarLayout)>
	//    4    6:return          
	}

	volatile void onFlingFinished(CoordinatorLayout coordinatorlayout, View view)
	{
		onFlingFinished(coordinatorlayout, (AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:invokevirtual   #328 <Method void onFlingFinished(CoordinatorLayout, AppBarLayout)>
	//    5    9:return          
	}

	public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i)
	{
		boolean flag = super.onLayoutChild(coordinatorlayout, ((View) (appbarlayout)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #333 <Method boolean HeaderBehavior.onLayoutChild(CoordinatorLayout, View, int)>
	//    5    7:istore          5
		int j = appbarlayout.getPendingAction();
	//    6    9:aload_2         
	//    7   10:invokevirtual   #336 <Method int AppBarLayout.getPendingAction()>
	//    8   13:istore          4
		i = offsetToChildIndexOnLayout;
	//    9   15:aload_0         
	//   10   16:getfield        #39  <Field int offsetToChildIndexOnLayout>
	//   11   19:istore_3        
		if(i >= 0 && (j & 8) == 0)
	//*  12   20:iload_3         
	//*  13   21:iflt            97
	//*  14   24:iload           4
	//*  15   26:bipush          8
	//*  16   28:iand            
	//*  17   29:ifne            97
		{
			View view = appbarlayout.getChildAt(i);
	//   18   32:aload_2         
	//   19   33:iload_3         
	//   20   34:invokevirtual   #153 <Method View AppBarLayout.getChildAt(int)>
	//   21   37:astore          6
			i = -view.getBottom();
	//   22   39:aload           6
	//   23   41:invokevirtual   #159 <Method int View.getBottom()>
	//   24   44:ineg            
	//   25   45:istore_3        
			if(offsetToChildIndexOnLayoutIsMinHeight)
	//*  26   46:aload_0         
	//*  27   47:getfield        #338 <Field boolean offsetToChildIndexOnLayoutIsMinHeight>
	//*  28   50:ifeq            69
				i += ViewCompat.getMinimumHeight(view) + appbarlayout.getTopInset();
	//   29   53:iload_3         
	//   30   54:aload           6
	//   31   56:invokestatic    #190 <Method int ViewCompat.getMinimumHeight(View)>
	//   32   59:aload_2         
	//   33   60:invokevirtual   #197 <Method int AppBarLayout.getTopInset()>
	//   34   63:iadd            
	//   35   64:iadd            
	//   36   65:istore_3        
			else
	//*  37   66:goto            86
				i += Math.round((float)view.getHeight() * offsetToChildIndexOnLayoutPerc);
	//   38   69:iload_3         
	//   39   70:aload           6
	//   40   72:invokevirtual   #133 <Method int View.getHeight()>
	//   41   75:i2f             
	//   42   76:aload_0         
	//   43   77:getfield        #340 <Field float offsetToChildIndexOnLayoutPerc>
	//   44   80:fmul            
	//   45   81:invokestatic    #67  <Method int Math.round(float)>
	//   46   84:iadd            
	//   47   85:istore_3        
			setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), i);
	//   48   86:aload_0         
	//   49   87:aload_1         
	//   50   88:aload_2         
	//   51   89:iload_3         
	//   52   90:invokevirtual   #344 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
	//   53   93:pop             
		} else
	//*  54   94:goto            188
		if(j != 0)
	//*  55   97:iload           4
	//*  56   99:ifeq            188
		{
			if((j & 4) != 0)
	//*  57  102:iload           4
	//*  58  104:iconst_4        
	//*  59  105:iand            
	//*  60  106:ifeq            114
				i = 1;
	//   61  109:iconst_1        
	//   62  110:istore_3        
			else
	//*  63  111:goto            116
				i = 0;
	//   64  114:iconst_0        
	//   65  115:istore_3        
			if((j & 2) != 0)
	//*  66  116:iload           4
	//*  67  118:iconst_2        
	//*  68  119:iand            
	//*  69  120:ifeq            158
			{
				j = -appbarlayout.getUpNestedPreScrollRange();
	//   70  123:aload_2         
	//   71  124:invokevirtual   #347 <Method int AppBarLayout.getUpNestedPreScrollRange()>
	//   72  127:ineg            
	//   73  128:istore          4
				if(i != 0)
	//*  74  130:iload_3         
	//*  75  131:ifeq            146
					animateOffsetTo(coordinatorlayout, appbarlayout, j, 0.0F);
	//   76  134:aload_0         
	//   77  135:aload_1         
	//   78  136:aload_2         
	//   79  137:iload           4
	//   80  139:fconst_0        
	//   81  140:invokespecial   #249 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
				else
	//*  82  143:goto            188
					setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), j);
	//   83  146:aload_0         
	//   84  147:aload_1         
	//   85  148:aload_2         
	//   86  149:iload           4
	//   87  151:invokevirtual   #344 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
	//   88  154:pop             
			} else
	//*  89  155:goto            188
			if((j & 1) != 0)
	//*  90  158:iload           4
	//*  91  160:iconst_1        
	//*  92  161:iand            
	//*  93  162:ifeq            188
				if(i != 0)
	//*  94  165:iload_3         
	//*  95  166:ifeq            180
					animateOffsetTo(coordinatorlayout, appbarlayout, 0, 0.0F);
	//   96  169:aload_0         
	//   97  170:aload_1         
	//   98  171:aload_2         
	//   99  172:iconst_0        
	//  100  173:fconst_0        
	//  101  174:invokespecial   #249 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
				else
	//* 102  177:goto            188
					setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), 0);
	//  103  180:aload_0         
	//  104  181:aload_1         
	//  105  182:aload_2         
	//  106  183:iconst_0        
	//  107  184:invokevirtual   #344 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
	//  108  187:pop             
		}
		appbarlayout.resetPendingAction();
	//  109  188:aload_2         
	//  110  189:invokevirtual   #350 <Method void AppBarLayout.resetPendingAction()>
		offsetToChildIndexOnLayout = -1;
	//  111  192:aload_0         
	//  112  193:iconst_m1       
	//  113  194:putfield        #39  <Field int offsetToChildIndexOnLayout>
		setTopAndBottomOffset(MathUtils.clamp(getTopAndBottomOffset(), -appbarlayout.getTotalScrollRange(), 0));
	//  114  197:aload_0         
	//  115  198:aload_0         
	//  116  199:invokevirtual   #322 <Method int getTopAndBottomOffset()>
	//  117  202:aload_2         
	//  118  203:invokevirtual   #241 <Method int AppBarLayout.getTotalScrollRange()>
	//  119  206:ineg            
	//  120  207:iconst_0        
	//  121  208:invokestatic    #247 <Method int MathUtils.clamp(int, int, int)>
	//  122  211:invokevirtual   #353 <Method boolean setTopAndBottomOffset(int)>
	//  123  214:pop             
		updateAppBarLayoutDrawableState(coordinatorlayout, appbarlayout, getTopAndBottomOffset(), 0, true);
	//  124  215:aload_0         
	//  125  216:aload_1         
	//  126  217:aload_2         
	//  127  218:aload_0         
	//  128  219:invokevirtual   #322 <Method int getTopAndBottomOffset()>
	//  129  222:iconst_0        
	//  130  223:iconst_1        
	//  131  224:invokespecial   #355 <Method void updateAppBarLayoutDrawableState(CoordinatorLayout, AppBarLayout, int, int, boolean)>
		appbarlayout.dispatchOffsetUpdates(getTopAndBottomOffset());
	//  132  227:aload_2         
	//  133  228:aload_0         
	//  134  229:invokevirtual   #322 <Method int getTopAndBottomOffset()>
	//  135  232:invokevirtual   #359 <Method void AppBarLayout.dispatchOffsetUpdates(int)>
		return flag;
	//  136  235:iload           5
	//  137  237:ireturn         
	}

	public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		return onLayoutChild(coordinatorlayout, (AppBarLayout)view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:iload_3         
	//    5    7:invokevirtual   #362 <Method boolean onLayoutChild(CoordinatorLayout, AppBarLayout, int)>
	//    6   10:ireturn         
	}

	public boolean onMeasureChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k, int l)
	{
		if(((rams)appbarlayout.getLayoutParams()).height == -2)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #365 <Method android.view.ViewGroup$LayoutParams AppBarLayout.getLayoutParams()>
	//*   2    4:checkcast       #224 <Class CoordinatorLayout$LayoutParams>
	//*   3    7:getfield        #368 <Field int CoordinatorLayout$LayoutParams.height>
	//*   4   10:bipush          -2
	//*   5   12:icmpne          32
		{
			coordinatorlayout.onMeasureChild(((View) (appbarlayout)), i, j, android.view.View.MeasureSpec.makeMeasureSpec(0, 0), l);
	//    6   15:aload_1         
	//    7   16:aload_2         
	//    8   17:iload_3         
	//    9   18:iload           4
	//   10   20:iconst_0        
	//   11   21:iconst_0        
	//   12   22:invokestatic    #373 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   13   25:iload           6
	//   14   27:invokevirtual   #376 <Method void CoordinatorLayout.onMeasureChild(View, int, int, int, int)>
			return true;
	//   15   30:iconst_1        
	//   16   31:ireturn         
		} else
		{
			return super.onMeasureChild(coordinatorlayout, ((View) (appbarlayout)), i, j, k, l);
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:aload_2         
	//   20   35:iload_3         
	//   21   36:iload           4
	//   22   38:iload           5
	//   23   40:iload           6
	//   24   42:invokespecial   #379 <Method boolean HeaderBehavior.onMeasureChild(CoordinatorLayout, View, int, int, int, int)>
	//   25   45:ireturn         
		}
	}

	public volatile boolean onMeasureChild(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
	{
		return onMeasureChild(coordinatorlayout, (AppBarLayout)view, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:iload           6
	//    8   13:invokevirtual   #382 <Method boolean onMeasureChild(CoordinatorLayout, AppBarLayout, int, int, int, int)>
	//    9   16:ireturn         
	}

	public void onNestedPreScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int ai[], int k)
	{
		if(j != 0)
	//*   0    0:iload           5
	//*   1    2:ifeq            80
		{
			int l;
			if(j < 0)
	//*   2    5:iload           5
	//*   3    7:ifge            37
			{
				l = -appbarlayout.getTotalScrollRange();
	//    4   10:aload_2         
	//    5   11:invokevirtual   #241 <Method int AppBarLayout.getTotalScrollRange()>
	//    6   14:ineg            
	//    7   15:istore          8
				int i1 = appbarlayout.getDownNestedPreScrollRange();
	//    8   17:aload_2         
	//    9   18:invokevirtual   #387 <Method int AppBarLayout.getDownNestedPreScrollRange()>
	//   10   21:istore          9
				i = l;
	//   11   23:iload           8
	//   12   25:istore          4
				l = i1 + l;
	//   13   27:iload           9
	//   14   29:iload           8
	//   15   31:iadd            
	//   16   32:istore          8
			} else
	//*  17   34:goto            47
			{
				i = -appbarlayout.getUpNestedPreScrollRange();
	//   18   37:aload_2         
	//   19   38:invokevirtual   #347 <Method int AppBarLayout.getUpNestedPreScrollRange()>
	//   20   41:ineg            
	//   21   42:istore          4
				l = 0;
	//   22   44:iconst_0        
	//   23   45:istore          8
			}
			if(i != l)
	//*  24   47:iload           4
	//*  25   49:iload           8
	//*  26   51:icmpeq          80
			{
				ai[1] = scroll(coordinatorlayout, ((View) (appbarlayout)), j, i, l);
	//   27   54:aload           6
	//   28   56:iconst_1        
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:aload_2         
	//   32   60:iload           5
	//   33   62:iload           4
	//   34   64:iload           8
	//   35   66:invokevirtual   #391 <Method int scroll(CoordinatorLayout, View, int, int, int)>
	//   36   69:iastore         
				stopNestedScrollIfNeeded(j, appbarlayout, view, k);
	//   37   70:aload_0         
	//   38   71:iload           5
	//   39   73:aload_2         
	//   40   74:aload_3         
	//   41   75:iload           7
	//   42   77:invokespecial   #393 <Method void stopNestedScrollIfNeeded(int, AppBarLayout, View, int)>
			}
		}
	//   43   80:return          
	}

	public volatile void onNestedPreScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[], int k)
	{
		onNestedPreScroll(coordinatorlayout, (AppBarLayout)view, view1, i, j, ai, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:aload           6
	//    8   13:iload           7
	//    9   15:invokevirtual   #397 <Method void onNestedPreScroll(CoordinatorLayout, AppBarLayout, View, int, int, int[], int)>
	//   10   18:return          
	}

	public void onNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int k, int l, 
			int i1)
	{
		if(l < 0)
	//*   0    0:iload           7
	//*   1    2:ifge            30
		{
			scroll(coordinatorlayout, ((View) (appbarlayout)), l, -appbarlayout.getDownNestedScrollRange(), 0);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:iload           7
	//    6   10:aload_2         
	//    7   11:invokevirtual   #255 <Method int AppBarLayout.getDownNestedScrollRange()>
	//    8   14:ineg            
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #391 <Method int scroll(CoordinatorLayout, View, int, int, int)>
	//   11   19:pop             
			stopNestedScrollIfNeeded(l, appbarlayout, view, i1);
	//   12   20:aload_0         
	//   13   21:iload           7
	//   14   23:aload_2         
	//   15   24:aload_3         
	//   16   25:iload           8
	//   17   27:invokespecial   #393 <Method void stopNestedScrollIfNeeded(int, AppBarLayout, View, int)>
		}
		if(appbarlayout.isLiftOnScroll())
	//*  18   30:aload_2         
	//*  19   31:invokevirtual   #267 <Method boolean AppBarLayout.isLiftOnScroll()>
	//*  20   34:ifeq            60
		{
			boolean flag;
			if(view.getScrollY() > 0)
	//*  21   37:aload_3         
	//*  22   38:invokevirtual   #272 <Method int View.getScrollY()>
	//*  23   41:ifle            50
				flag = true;
	//   24   44:iconst_1        
	//   25   45:istore          9
			else
	//*  26   47:goto            53
				flag = false;
	//   27   50:iconst_0        
	//   28   51:istore          9
			appbarlayout.setLiftedState(flag);
	//   29   53:aload_2         
	//   30   54:iload           9
	//   31   56:invokevirtual   #276 <Method boolean AppBarLayout.setLiftedState(boolean)>
	//   32   59:pop             
		}
	//   33   60:return          
	}

	public volatile void onNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int k, int l, 
			int i1)
	{
		onNestedScroll(coordinatorlayout, (AppBarLayout)view, view1, i, j, k, l, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:iload           6
	//    8   13:iload           7
	//    9   15:iload           8
	//   10   17:invokevirtual   #403 <Method void onNestedScroll(CoordinatorLayout, AppBarLayout, View, int, int, int, int, int)>
	//   11   20:return          
	}

	public void onRestoreInstanceState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, Parcelable parcelable)
	{
		if(parcelable instanceof SavedState)
	//*   0    0:aload_3         
	//*   1    1:instanceof      #15  <Class AppBarLayout$BaseBehavior$SavedState>
	//*   2    4:ifeq            47
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    3    7:aload_3         
	//    4    8:checkcast       #15  <Class AppBarLayout$BaseBehavior$SavedState>
	//    5   11:astore_3        
			super.onRestoreInstanceState(coordinatorlayout, ((View) (appbarlayout)), ((SavedState) (parcelable)).getSuperState());
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #409 <Method Parcelable AppBarLayout$BaseBehavior$SavedState.getSuperState()>
	//   11   19:invokespecial   #412 <Method void HeaderBehavior.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
			offsetToChildIndexOnLayout = ((SavedState) (parcelable)).firstVisibleChildIndex;
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:getfield        #415 <Field int AppBarLayout$BaseBehavior$SavedState.firstVisibleChildIndex>
	//   15   27:putfield        #39  <Field int offsetToChildIndexOnLayout>
			offsetToChildIndexOnLayoutPerc = ((SavedState) (parcelable)).firstVisibleChildPercentageShown;
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:getfield        #418 <Field float AppBarLayout$BaseBehavior$SavedState.firstVisibleChildPercentageShown>
	//   19   35:putfield        #340 <Field float offsetToChildIndexOnLayoutPerc>
			offsetToChildIndexOnLayoutIsMinHeight = ((SavedState) (parcelable)).firstVisibleChildAtMinimumHeight;
	//   20   38:aload_0         
	//   21   39:aload_3         
	//   22   40:getfield        #421 <Field boolean AppBarLayout$BaseBehavior$SavedState.firstVisibleChildAtMinimumHeight>
	//   23   43:putfield        #338 <Field boolean offsetToChildIndexOnLayoutIsMinHeight>
			return;
	//   24   46:return          
		} else
		{
			super.onRestoreInstanceState(coordinatorlayout, ((View) (appbarlayout)), parcelable);
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:aload_2         
	//   28   50:aload_3         
	//   29   51:invokespecial   #412 <Method void HeaderBehavior.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
			offsetToChildIndexOnLayout = -1;
	//   30   54:aload_0         
	//   31   55:iconst_m1       
	//   32   56:putfield        #39  <Field int offsetToChildIndexOnLayout>
			return;
	//   33   59:return          
		}
	}

	public volatile void onRestoreInstanceState(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
	{
		onRestoreInstanceState(coordinatorlayout, (AppBarLayout)view, parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #424 <Method void onRestoreInstanceState(CoordinatorLayout, AppBarLayout, Parcelable)>
	//    6   10:return          
	}

	public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
	{
		Object obj = ((Object) (super.onSaveInstanceState(coordinatorlayout, ((View) (appbarlayout)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #429 <Method Parcelable HeaderBehavior.onSaveInstanceState(CoordinatorLayout, View)>
	//    4    6:astore          8
		int j = getTopAndBottomOffset();
	//    5    8:aload_0         
	//    6    9:invokevirtual   #322 <Method int getTopAndBottomOffset()>
	//    7   12:istore          4
		int k = appbarlayout.getChildCount();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #152 <Method int AppBarLayout.getChildCount()>
	//   10   18:istore          5
		boolean flag = false;
	//   11   20:iconst_0        
	//   12   21:istore          7
		for(int i = 0; i < k; i++)
	//*  13   23:iconst_0        
	//*  14   24:istore_3        
	//*  15   25:iload_3         
	//*  16   26:iload           5
	//*  17   28:icmpge          126
		{
			coordinatorlayout = ((CoordinatorLayout) (appbarlayout.getChildAt(i)));
	//   18   31:aload_2         
	//   19   32:iload_3         
	//   20   33:invokevirtual   #153 <Method View AppBarLayout.getChildAt(int)>
	//   21   36:astore_1        
			int l = ((View) (coordinatorlayout)).getBottom() + j;
	//   22   37:aload_1         
	//   23   38:invokevirtual   #159 <Method int View.getBottom()>
	//   24   41:iload           4
	//   25   43:iadd            
	//   26   44:istore          6
			if(((View) (coordinatorlayout)).getTop() + j <= 0 && l >= 0)
	//*  27   46:aload_1         
	//*  28   47:invokevirtual   #156 <Method int View.getTop()>
	//*  29   50:iload           4
	//*  30   52:iadd            
	//*  31   53:ifgt            119
	//*  32   56:iload           6
	//*  33   58:iflt            119
			{
				obj = ((Object) (new SavedState(((Parcelable) (obj)))));
	//   34   61:new             #15  <Class AppBarLayout$BaseBehavior$SavedState>
	//   35   64:dup             
	//   36   65:aload           8
	//   37   67:invokespecial   #432 <Method void AppBarLayout$BaseBehavior$SavedState(Parcelable)>
	//   38   70:astore          8
				obj.firstVisibleChildIndex = i;
	//   39   72:aload           8
	//   40   74:iload_3         
	//   41   75:putfield        #415 <Field int AppBarLayout$BaseBehavior$SavedState.firstVisibleChildIndex>
				if(l == ViewCompat.getMinimumHeight(((View) (coordinatorlayout))) + appbarlayout.getTopInset())
	//*  42   78:iload           6
	//*  43   80:aload_1         
	//*  44   81:invokestatic    #190 <Method int ViewCompat.getMinimumHeight(View)>
	//*  45   84:aload_2         
	//*  46   85:invokevirtual   #197 <Method int AppBarLayout.getTopInset()>
	//*  47   88:iadd            
	//*  48   89:icmpne          95
					flag = true;
	//   49   92:iconst_1        
	//   50   93:istore          7
				obj.firstVisibleChildAtMinimumHeight = flag;
	//   51   95:aload           8
	//   52   97:iload           7
	//   53   99:putfield        #421 <Field boolean AppBarLayout$BaseBehavior$SavedState.firstVisibleChildAtMinimumHeight>
				obj.firstVisibleChildPercentageShown = (float)l / (float)((View) (coordinatorlayout)).getHeight();
	//   54  102:aload           8
	//   55  104:iload           6
	//   56  106:i2f             
	//   57  107:aload_1         
	//   58  108:invokevirtual   #133 <Method int View.getHeight()>
	//   59  111:i2f             
	//   60  112:fdiv            
	//   61  113:putfield        #418 <Field float AppBarLayout$BaseBehavior$SavedState.firstVisibleChildPercentageShown>
				return ((Parcelable) (obj));
	//   62  116:aload           8
	//   63  118:areturn         
			}
		}

	//   64  119:iload_3         
	//   65  120:iconst_1        
	//   66  121:iadd            
	//   67  122:istore_3        
	//*  68  123:goto            25
		return ((Parcelable) (obj));
	//   69  126:aload           8
	//   70  128:areturn         
	}

	public volatile Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, View view)
	{
		return onSaveInstanceState(coordinatorlayout, (AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:invokevirtual   #435 <Method Parcelable onSaveInstanceState(CoordinatorLayout, AppBarLayout)>
	//    5    9:areturn         
	}

	public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, View view1, int i, int j)
	{
		boolean flag;
		if((i & 2) != 0 && (appbarlayout.isLiftOnScroll() || canScrollChildren(coordinatorlayout, appbarlayout, view)))
	//*   0    0:iload           5
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            30
	//*   4    7:aload_2         
	//*   5    8:invokevirtual   #267 <Method boolean AppBarLayout.isLiftOnScroll()>
	//*   6   11:ifne            24
	//*   7   14:aload_0         
	//*   8   15:aload_1         
	//*   9   16:aload_2         
	//*  10   17:aload_3         
	//*  11   18:invokespecial   #439 <Method boolean canScrollChildren(CoordinatorLayout, AppBarLayout, View)>
	//*  12   21:ifeq            30
			flag = true;
	//   13   24:iconst_1        
	//   14   25:istore          7
		else
	//*  15   27:goto            33
			flag = false;
	//   16   30:iconst_0        
	//   17   31:istore          7
		if(flag)
	//*  18   33:iload           7
	//*  19   35:ifeq            51
		{
			coordinatorlayout = ((CoordinatorLayout) (offsetAnimator));
	//   20   38:aload_0         
	//   21   39:getfield        #79  <Field ValueAnimator offsetAnimator>
	//   22   42:astore_1        
			if(coordinatorlayout != null)
	//*  23   43:aload_1         
	//*  24   44:ifnull          51
				((ValueAnimator) (coordinatorlayout)).cancel();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #88  <Method void ValueAnimator.cancel()>
		}
		lastNestedScrollingChildRef = null;
	//   27   51:aload_0         
	//   28   52:aconst_null     
	//   29   53:putfield        #296 <Field WeakReference lastNestedScrollingChildRef>
		lastStartedType = j;
	//   30   56:aload_0         
	//   31   57:iload           6
	//   32   59:putfield        #441 <Field int lastStartedType>
		return flag;
	//   33   62:iload           7
	//   34   64:ireturn         
	}

	public volatile boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i, int j)
	{
		return onStartNestedScroll(coordinatorlayout, (AppBarLayout)view, view1, view2, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:iload           5
	//    7   11:iload           6
	//    8   13:invokevirtual   #445 <Method boolean onStartNestedScroll(CoordinatorLayout, AppBarLayout, View, View, int, int)>
	//    9   16:ireturn         
	}

	public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i)
	{
		if(lastStartedType == 0 || i == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #441 <Field int lastStartedType>
	//*   2    4:ifeq            13
	//*   3    7:iload           4
	//*   4    9:iconst_1        
	//*   5   10:icmpne          19
			snapToChildIfNeeded(coordinatorlayout, appbarlayout);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:invokespecial   #325 <Method void snapToChildIfNeeded(CoordinatorLayout, AppBarLayout)>
		lastNestedScrollingChildRef = new WeakReference(((Object) (view)));
	//   10   19:aload_0         
	//   11   20:new             #298 <Class WeakReference>
	//   12   23:dup             
	//   13   24:aload_3         
	//   14   25:invokespecial   #450 <Method void WeakReference(Object)>
	//   15   28:putfield        #296 <Field WeakReference lastNestedScrollingChildRef>
	//   16   31:return          
	}

	public volatile void onStopNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i)
	{
		onStopNestedScroll(coordinatorlayout, (AppBarLayout)view, view1, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #454 <Method void onStopNestedScroll(CoordinatorLayout, AppBarLayout, View, int)>
	//    7   12:return          
	}

	int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k)
	{
		int l = getTopBottomOffsetForScrollingSibling();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method int getTopBottomOffsetForScrollingSibling()>
	//    2    4:istore          6
		if(j != 0 && l >= j && l <= k)
	//*   3    6:iload           4
	//*   4    8:ifeq            133
	//*   5   11:iload           6
	//*   6   13:iload           4
	//*   7   15:icmplt          133
	//*   8   18:iload           6
	//*   9   20:iload           5
	//*  10   22:icmpgt          133
		{
			j = MathUtils.clamp(i, j, k);
	//   11   25:iload_3         
	//   12   26:iload           4
	//   13   28:iload           5
	//   14   30:invokestatic    #247 <Method int MathUtils.clamp(int, int, int)>
	//   15   33:istore          4
			if(l != j)
	//*  16   35:iload           6
	//*  17   37:iload           4
	//*  18   39:icmpeq          138
			{
				if(appbarlayout.hasChildWithInterpolator())
	//*  19   42:aload_2         
	//*  20   43:invokevirtual   #458 <Method boolean AppBarLayout.hasChildWithInterpolator()>
	//*  21   46:ifeq            60
					i = interpolateOffset(appbarlayout, j);
	//   22   49:aload_0         
	//   23   50:aload_2         
	//   24   51:iload           4
	//   25   53:invokespecial   #460 <Method int interpolateOffset(AppBarLayout, int)>
	//   26   56:istore_3        
				else
	//*  27   57:goto            63
					i = j;
	//   28   60:iload           4
	//   29   62:istore_3        
				boolean flag = setTopAndBottomOffset(i);
	//   30   63:aload_0         
	//   31   64:iload_3         
	//   32   65:invokevirtual   #353 <Method boolean setTopAndBottomOffset(int)>
	//   33   68:istore          7
				offsetDelta = j - i;
	//   34   70:aload_0         
	//   35   71:iload           4
	//   36   73:iload_3         
	//   37   74:isub            
	//   38   75:putfield        #47  <Field int offsetDelta>
				if(!flag && appbarlayout.hasChildWithInterpolator())
	//*  39   78:iload           7
	//*  40   80:ifne            95
	//*  41   83:aload_2         
	//*  42   84:invokevirtual   #458 <Method boolean AppBarLayout.hasChildWithInterpolator()>
	//*  43   87:ifeq            95
					coordinatorlayout.dispatchDependentViewsChanged(((View) (appbarlayout)));
	//   44   90:aload_1         
	//   45   91:aload_2         
	//   46   92:invokevirtual   #464 <Method void CoordinatorLayout.dispatchDependentViewsChanged(View)>
				appbarlayout.dispatchOffsetUpdates(getTopAndBottomOffset());
	//   47   95:aload_2         
	//   48   96:aload_0         
	//   49   97:invokevirtual   #322 <Method int getTopAndBottomOffset()>
	//   50  100:invokevirtual   #359 <Method void AppBarLayout.dispatchOffsetUpdates(int)>
				if(j < l)
	//*  51  103:iload           4
	//*  52  105:iload           6
	//*  53  107:icmpge          115
					i = -1;
	//   54  110:iconst_m1       
	//   55  111:istore_3        
				else
	//*  56  112:goto            117
					i = 1;
	//   57  115:iconst_1        
	//   58  116:istore_3        
				updateAppBarLayoutDrawableState(coordinatorlayout, appbarlayout, j, i, false);
	//   59  117:aload_0         
	//   60  118:aload_1         
	//   61  119:aload_2         
	//   62  120:iload           4
	//   63  122:iload_3         
	//   64  123:iconst_0        
	//   65  124:invokespecial   #355 <Method void updateAppBarLayoutDrawableState(CoordinatorLayout, AppBarLayout, int, int, boolean)>
				return l - j;
	//   66  127:iload           6
	//   67  129:iload           4
	//   68  131:isub            
	//   69  132:ireturn         
			}
		} else
		{
			offsetDelta = 0;
	//   70  133:aload_0         
	//   71  134:iconst_0        
	//   72  135:putfield        #47  <Field int offsetDelta>
		}
		return 0;
	//   73  138:iconst_0        
	//   74  139:ireturn         
	}

	volatile int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k)
	{
		return setHeaderTopBottomOffset(coordinatorlayout, (AppBarLayout)view, i, j, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:invokevirtual   #467 <Method int setHeaderTopBottomOffset(CoordinatorLayout, AppBarLayout, int, int, int)>
	//    8   14:ireturn         
	}

	private WeakReference lastNestedScrollingChildRef;
	private int lastStartedType;
	private ValueAnimator offsetAnimator;
	private int offsetDelta;
	private int offsetToChildIndexOnLayout;
	private boolean offsetToChildIndexOnLayoutIsMinHeight;
	private float offsetToChildIndexOnLayoutPerc;
	private BaseDragCallback onDragCallback;


/*
	static int access$000(AppBarLayout$BaseBehavior appbarlayout$basebehavior)
	{
		return appbarlayout$basebehavior.offsetDelta;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int offsetDelta>
	//    2    4:ireturn         
	}

*/

	public AppBarLayout$BaseBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void HeaderBehavior()>
		offsetToChildIndexOnLayout = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #39  <Field int offsetToChildIndexOnLayout>
	//    5    9:return          
	}

	public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #43  <Method void HeaderBehavior(Context, AttributeSet)>
		offsetToChildIndexOnLayout = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #39  <Field int offsetToChildIndexOnLayout>
	//    7   11:return          
	}
}
