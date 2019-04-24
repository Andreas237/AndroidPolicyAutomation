// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.math.MathUtils;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			HeaderBehavior, AppBarLayout, AnimationUtils, CoordinatorLayout

public static class AppBarLayout$Behavior extends HeaderBehavior
{
	public static abstract class DragCallback
	{

		public abstract boolean canDrag(AppBarLayout appbarlayout);

		public DragCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
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
			//    0    0:new             #9   <Class AppBarLayout$Behavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #25  <Method void AppBarLayout$Behavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class AppBarLayout$Behavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #25  <Method void AppBarLayout$Behavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #29  <Method AppBarLayout$Behavior$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #32  <Method AppBarLayout$Behavior$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #37  <Method AppBarLayout$Behavior$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		boolean firstVisibleChildAtMinimumHeight;
		int firstVisibleChildIndex;
		float firstVisibleChildPercentageShown;

		static 
		{
		//    0    0:new             #12  <Class AppBarLayout$Behavior$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #26  <Method void AppBarLayout$Behavior$SavedState$1()>
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
	//    1    1:invokevirtual   #56  <Method int getTopBottomOffsetForScrollingSibling()>
	//    2    4:iload_3         
	//    3    5:isub            
	//    4    6:invokestatic    #62  <Method int Math.abs(int)>
	//    5    9:istore          5
		f = Math.abs(f);
	//    6   11:fload           4
	//    7   13:invokestatic    #65  <Method float Math.abs(float)>
	//    8   16:fstore          4
		if(f > 0.0F)
	//*   9   18:fload           4
	//*  10   20:fconst_0        
	//*  11   21:fcmpl           
	//*  12   22:ifle            44
			j = 3 * Math.round(1000F * ((float)j / f));
	//   13   25:iconst_3        
	//   14   26:ldc1            #66  <Float 1000F>
	//   15   28:iload           5
	//   16   30:i2f             
	//   17   31:fload           4
	//   18   33:fdiv            
	//   19   34:fmul            
	//   20   35:invokestatic    #70  <Method int Math.round(float)>
	//   21   38:imul            
	//   22   39:istore          5
		else
	//*  23   41:goto            61
			j = (int)(((float)j / (float)appbarlayout.getHeight() + 1.0F) * 150F);
	//   24   44:iload           5
	//   25   46:i2f             
	//   26   47:aload_2         
	//   27   48:invokevirtual   #73  <Method int AppBarLayout.getHeight()>
	//   28   51:i2f             
	//   29   52:fdiv            
	//   30   53:fconst_1        
	//   31   54:fadd            
	//   32   55:ldc1            #74  <Float 150F>
	//   33   57:fmul            
	//   34   58:f2i             
	//   35   59:istore          5
		animateOffsetWithDuration(coordinatorlayout, appbarlayout, i, j);
	//   36   61:aload_0         
	//   37   62:aload_1         
	//   38   63:aload_2         
	//   39   64:iload_3         
	//   40   65:iload           5
	//   41   67:invokespecial   #78  <Method void animateOffsetWithDuration(CoordinatorLayout, AppBarLayout, int, int)>
	//   42   70:return          
	}

	private void animateOffsetWithDuration(final CoordinatorLayout coordinatorLayout, final AppBarLayout child, int i, int j)
	{
		int k = getTopBottomOffsetForScrollingSibling();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method int getTopBottomOffsetForScrollingSibling()>
	//    2    4:istore          5
		if(k == i)
	//*   3    6:iload           5
	//*   4    8:iload_3         
	//*   5    9:icmpne          37
		{
			if(mOffsetAnimator != null && mOffsetAnimator.isRunning())
	//*   6   12:aload_0         
	//*   7   13:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//*   8   16:ifnull          36
	//*   9   19:aload_0         
	//*  10   20:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//*  11   23:invokevirtual   #86  <Method boolean ValueAnimator.isRunning()>
	//*  12   26:ifeq            36
				mOffsetAnimator.cancel();
	//   13   29:aload_0         
	//   14   30:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//   15   33:invokevirtual   #89  <Method void ValueAnimator.cancel()>
			return;
	//   16   36:return          
		}
		if(mOffsetAnimator == null)
	//*  17   37:aload_0         
	//*  18   38:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//*  19   41:ifnonnull       85
		{
			mOffsetAnimator = new ValueAnimator();
	//   20   44:aload_0         
	//   21   45:new             #82  <Class ValueAnimator>
	//   22   48:dup             
	//   23   49:invokespecial   #90  <Method void ValueAnimator()>
	//   24   52:putfield        #80  <Field ValueAnimator mOffsetAnimator>
			mOffsetAnimator.setInterpolator(((android.animation.TimeInterpolator) (AnimationUtils.DECELERATE_INTERPOLATOR)));
	//   25   55:aload_0         
	//   26   56:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//   27   59:getstatic       #96  <Field Interpolator AnimationUtils.DECELERATE_INTERPOLATOR>
	//   28   62:invokevirtual   #100 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			mOffsetAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					setHeaderTopBottomOffset(coordinatorLayout, ((View) (child)), ((Integer)valueanimator.getAnimatedValue()).intValue());
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field AppBarLayout$Behavior this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #26  <Field CoordinatorLayout val$coordinatorLayout>
				//    4    8:aload_0         
				//    5    9:getfield        #28  <Field AppBarLayout val$child>
				//    6   12:aload_1         
				//    7   13:invokevirtual   #40  <Method Object ValueAnimator.getAnimatedValue()>
				//    8   16:checkcast       #42  <Class Integer>
				//    9   19:invokevirtual   #46  <Method int Integer.intValue()>
				//   10   22:invokevirtual   #50  <Method int AppBarLayout$Behavior.setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
				//   11   25:pop             
				//   12   26:return          
				}

				final AppBarLayout.Behavior this$0;
				final AppBarLayout val$child;
				final CoordinatorLayout val$coordinatorLayout;

			
			{
				this$0 = AppBarLayout.Behavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field AppBarLayout$Behavior this$0>
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
	//   29   65:aload_0         
	//   30   66:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//   31   69:new             #10  <Class AppBarLayout$Behavior$1>
	//   32   72:dup             
	//   33   73:aload_0         
	//   34   74:aload_1         
	//   35   75:aload_2         
	//   36   76:invokespecial   #103 <Method void AppBarLayout$Behavior$1(AppBarLayout$Behavior, CoordinatorLayout, AppBarLayout)>
	//   37   79:invokevirtual   #107 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		} else
	//*  38   82:goto            92
		{
			mOffsetAnimator.cancel();
	//   39   85:aload_0         
	//   40   86:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//   41   89:invokevirtual   #89  <Method void ValueAnimator.cancel()>
		}
		mOffsetAnimator.setDuration(Math.min(j, 600));
	//   42   92:aload_0         
	//   43   93:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//   44   96:iload           4
	//   45   98:sipush          600
	//   46  101:invokestatic    #111 <Method int Math.min(int, int)>
	//   47  104:i2l             
	//   48  105:invokevirtual   #115 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   49  108:pop             
		mOffsetAnimator.setIntValues(new int[] {
			k, i
		});
	//   50  109:aload_0         
	//   51  110:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//   52  113:iconst_2        
	//   53  114:newarray        int[]
	//   54  116:dup             
	//   55  117:iconst_0        
	//   56  118:iload           5
	//   57  120:iastore         
	//   58  121:dup             
	//   59  122:iconst_1        
	//   60  123:iload_3         
	//   61  124:iastore         
	//   62  125:invokevirtual   #119 <Method void ValueAnimator.setIntValues(int[])>
		mOffsetAnimator.start();
	//   63  128:aload_0         
	//   64  129:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//   65  132:invokevirtual   #122 <Method void ValueAnimator.start()>
	//   66  135:return          
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

	private static View getAppBarChildOnOffset(AppBarLayout appbarlayout, int i)
	{
		int j = Math.abs(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #62  <Method int Math.abs(int)>
	//    2    4:istore_2        
		int k = appbarlayout.getChildCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
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
	//   13   19:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
	//   14   22:astore          4
			if(j >= view.getTop() && j <= view.getBottom())
	//*  15   24:iload_2         
	//*  16   25:aload           4
	//*  17   27:invokevirtual   #138 <Method int View.getTop()>
	//*  18   30:icmplt          45
	//*  19   33:iload_2         
	//*  20   34:aload           4
	//*  21   36:invokevirtual   #141 <Method int View.getBottom()>
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
		int k = appbarlayout.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
	//    2    4:istore          4
		for(int j = 0; j < k; j++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          58
		{
			View view = appbarlayout.getChildAt(j);
	//    8   14:aload_1         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
	//   11   19:astore          7
			int l = view.getTop();
	//   12   21:aload           7
	//   13   23:invokevirtual   #138 <Method int View.getTop()>
	//   14   26:istore          5
			int i1 = -i;
	//   15   28:iload_2         
	//   16   29:ineg            
	//   17   30:istore          6
			if(l <= i1 && view.getBottom() >= i1)
	//*  18   32:iload           5
	//*  19   34:iload           6
	//*  20   36:icmpgt          51
	//*  21   39:aload           7
	//*  22   41:invokevirtual   #141 <Method int View.getBottom()>
	//*  23   44:iload           6
	//*  24   46:icmplt          51
				return j;
	//   25   49:iload_3         
	//   26   50:ireturn         
		}

	//   27   51:iload_3         
	//   28   52:iconst_1        
	//   29   53:iadd            
	//   30   54:istore_3        
	//*  31   55:goto            8
		return -1;
	//   32   58:iconst_m1       
	//   33   59:ireturn         
	}

	private int interpolateOffset(AppBarLayout appbarlayout, int i)
	{
		int l = Math.abs(i);
	//    0    0:iload_2         
	//    1    1:invokestatic    #62  <Method int Math.abs(int)>
	//    2    4:istore          6
		int i1 = appbarlayout.getChildCount();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
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
	//   15   28:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
	//   16   31:astore          8
			ams ams = (ams)view.getLayoutParams();
	//   17   33:aload           8
	//   18   35:invokevirtual   #148 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   38:checkcast       #150 <Class AppBarLayout$LayoutParams>
	//   20   41:astore          9
			Interpolator interpolator = ams.getScrollInterpolator();
	//   21   43:aload           9
	//   22   45:invokevirtual   #154 <Method Interpolator AppBarLayout$LayoutParams.getScrollInterpolator()>
	//   23   48:astore          10
			if(l >= view.getTop() && l <= view.getBottom())
	//*  24   50:iload           6
	//*  25   52:aload           8
	//*  26   54:invokevirtual   #138 <Method int View.getTop()>
	//*  27   57:icmplt          208
	//*  28   60:iload           6
	//*  29   62:aload           8
	//*  30   64:invokevirtual   #141 <Method int View.getBottom()>
	//*  31   67:icmpgt          208
			{
				if(interpolator != null)
	//*  32   70:aload           10
	//*  33   72:ifnull          217
				{
					int j1 = ams.getScrollFlags();
	//   34   75:aload           9
	//   35   77:invokevirtual   #157 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
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
						k = 0 + (view.getHeight() + ams.topMargin + ams.bottomMargin);
	//   43   93:iconst_0        
	//   44   94:aload           8
	//   45   96:invokevirtual   #158 <Method int View.getHeight()>
	//   46   99:aload           9
	//   47  101:getfield        #161 <Field int AppBarLayout$LayoutParams.topMargin>
	//   48  104:iadd            
	//   49  105:aload           9
	//   50  107:getfield        #164 <Field int AppBarLayout$LayoutParams.bottomMargin>
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
	//   62  129:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
	//   63  132:isub            
	//   64  133:istore          4
					}
					k = j;
	//   65  135:iload           4
	//   66  137:istore          5
					if(ViewCompat.getFitsSystemWindows(view))
	//*  67  139:aload           8
	//*  68  141:invokestatic    #174 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  69  144:ifeq            156
						k = j - appbarlayout.getTopInset();
	//   70  147:iload           4
	//   71  149:aload_1         
	//   72  150:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
	//   73  153:isub            
	//   74  154:istore          5
					if(k > 0)
	//*  75  156:iload           5
	//*  76  158:ifle            217
					{
						j = view.getTop();
	//   77  161:aload           8
	//   78  163:invokevirtual   #138 <Method int View.getTop()>
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
	//   91  183:invokeinterface #182 <Method float Interpolator.getInterpolation(float)>
	//   92  188:fmul            
	//   93  189:invokestatic    #70  <Method int Math.round(float)>
	//   94  192:istore          4
						return Integer.signum(i) * (view.getTop() + j);
	//   95  194:iload_2         
	//   96  195:invokestatic    #187 <Method int Integer.signum(int)>
	//   97  198:aload           8
	//   98  200:invokevirtual   #138 <Method int View.getTop()>
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
	//    2    2:invokevirtual   #195 <Method List CoordinatorLayout.getDependents(View)>
	//    3    5:astore_1        
		int j = ((List) (coordinatorlayout)).size();
	//    4    6:aload_1         
	//    5    7:invokeinterface #200 <Method int List.size()>
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
			appbarlayout = ((AppBarLayout) (((utParams)((View)((List) (coordinatorlayout)).get(i)).getLayoutParams()).getBehavior()));
	//   14   25:aload_1         
	//   15   26:iload_3         
	//   16   27:invokeinterface #204 <Method Object List.get(int)>
	//   17   32:checkcast       #135 <Class View>
	//   18   35:invokevirtual   #148 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   38:checkcast       #206 <Class CoordinatorLayout$LayoutParams>
	//   20   41:invokevirtual   #210 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   21   44:astore_2        
			if(appbarlayout instanceof ViewBehavior)
	//*  22   45:aload_2         
	//*  23   46:instanceof      #212 <Class AppBarLayout$ScrollingViewBehavior>
	//*  24   49:ifeq            68
			{
				if(((ViewBehavior)appbarlayout).getOverlayTop() != 0)
	//*  25   52:aload_2         
	//*  26   53:checkcast       #212 <Class AppBarLayout$ScrollingViewBehavior>
	//*  27   56:invokevirtual   #215 <Method int AppBarLayout$ScrollingViewBehavior.getOverlayTop()>
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
	//    1    1:invokevirtual   #56  <Method int getTopBottomOffsetForScrollingSibling()>
	//    2    4:istore          7
		int k = getChildIndexOnOffset(appbarlayout, i1);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:iload           7
	//    6   10:invokespecial   #219 <Method int getChildIndexOnOffset(AppBarLayout, int)>
	//    7   13:istore          5
		if(k >= 0)
	//*   8   15:iload           5
	//*   9   17:iflt            193
		{
			View view = appbarlayout.getChildAt(k);
	//   10   20:aload_2         
	//   11   21:iload           5
	//   12   23:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
	//   13   26:astore          9
			int j1 = ((ams)view.getLayoutParams()).getScrollFlags();
	//   14   28:aload           9
	//   15   30:invokevirtual   #148 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   33:checkcast       #150 <Class AppBarLayout$LayoutParams>
	//   17   36:invokevirtual   #157 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
	//   18   39:istore          8
			if((j1 & 0x11) == 17)
	//*  19   41:iload           8
	//*  20   43:bipush          17
	//*  21   45:iand            
	//*  22   46:bipush          17
	//*  23   48:icmpne          193
			{
				int l = -view.getTop();
	//   24   51:aload           9
	//   25   53:invokevirtual   #138 <Method int View.getTop()>
	//   26   56:ineg            
	//   27   57:istore          6
				int i = -view.getBottom();
	//   28   59:aload           9
	//   29   61:invokevirtual   #141 <Method int View.getBottom()>
	//   30   64:ineg            
	//   31   65:istore_3        
				int j = i;
	//   32   66:iload_3         
	//   33   67:istore          4
				if(k == appbarlayout.getChildCount() - 1)
	//*  34   69:iload           5
	//*  35   71:aload_2         
	//*  36   72:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
	//*  37   75:iconst_1        
	//*  38   76:isub            
	//*  39   77:icmpne          88
					j = i + appbarlayout.getTopInset();
	//   40   80:iload_3         
	//   41   81:aload_2         
	//   42   82:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
	//   43   85:iadd            
	//   44   86:istore          4
				if(checkFlag(j1, 2))
	//*  45   88:iload           8
	//*  46   90:iconst_2        
	//*  47   91:invokestatic    #221 <Method boolean checkFlag(int, int)>
	//*  48   94:ifeq            113
				{
					i = j + ViewCompat.getMinimumHeight(view);
	//   49   97:iload           4
	//   50   99:aload           9
	//   51  101:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
	//   52  104:iadd            
	//   53  105:istore_3        
					k = l;
	//   54  106:iload           6
	//   55  108:istore          5
				} else
	//*  56  110:goto            157
				{
					k = l;
	//   57  113:iload           6
	//   58  115:istore          5
					i = j;
	//   59  117:iload           4
	//   60  119:istore_3        
					if(checkFlag(j1, 5))
	//*  61  120:iload           8
	//*  62  122:iconst_5        
	//*  63  123:invokestatic    #221 <Method boolean checkFlag(int, int)>
	//*  64  126:ifeq            157
					{
						i = ViewCompat.getMinimumHeight(view) + j;
	//   65  129:aload           9
	//   66  131:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
	//   67  134:iload           4
	//   68  136:iadd            
	//   69  137:istore_3        
						if(i1 < i)
	//*  70  138:iload           7
	//*  71  140:iload_3         
	//*  72  141:icmpge          153
						{
							k = i;
	//   73  144:iload_3         
	//   74  145:istore          5
							i = j;
	//   75  147:iload           4
	//   76  149:istore_3        
						} else
	//*  77  150:goto            157
						{
							k = l;
	//   78  153:iload           6
	//   79  155:istore          5
						}
					}
				}
				j = k;
	//   80  157:iload           5
	//   81  159:istore          4
				if(i1 < (i + k) / 2)
	//*  82  161:iload           7
	//*  83  163:iload_3         
	//*  84  164:iload           5
	//*  85  166:iadd            
	//*  86  167:iconst_2        
	//*  87  168:idiv            
	//*  88  169:icmpge          175
					j = i;
	//   89  172:iload_3         
	//   90  173:istore          4
				animateOffsetTo(coordinatorlayout, appbarlayout, MathUtils.clamp(j, -appbarlayout.getTotalScrollRange(), 0), 0.0F);
	//   91  175:aload_0         
	//   92  176:aload_1         
	//   93  177:aload_2         
	//   94  178:iload           4
	//   95  180:aload_2         
	//   96  181:invokevirtual   #224 <Method int AppBarLayout.getTotalScrollRange()>
	//   97  184:ineg            
	//   98  185:iconst_0        
	//   99  186:invokestatic    #230 <Method int MathUtils.clamp(int, int, int)>
	//  100  189:fconst_0        
	//  101  190:invokespecial   #232 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
			}
		}
	//  102  193:return          
	}

	private void updateAppBarLayoutDrawableState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, boolean flag)
	{
		int k;
		boolean flag1;
		boolean flag2;
		View view;
		view = getAppBarChildOnOffset(appbarlayout, i);
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokestatic    #236 <Method View getAppBarChildOnOffset(AppBarLayout, int)>
	//    3    5:astore          10
		if(view == null)
			break MISSING_BLOCK_LABEL_162;
	//    4    7:aload           10
	//    5    9:ifnull          162
		k = ((ams)view.getLayoutParams()).getScrollFlags();
	//    6   12:aload           10
	//    7   14:invokevirtual   #148 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    8   17:checkcast       #150 <Class AppBarLayout$LayoutParams>
	//    9   20:invokevirtual   #157 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
	//   10   23:istore          6
		flag2 = false;
	//   11   25:iconst_0        
	//   12   26:istore          9
		flag1 = flag2;
	//   13   28:iload           9
	//   14   30:istore          8
		if((k & 1) == 0) goto _L2; else goto _L1
	//   15   32:iload           6
	//   16   34:iconst_1        
	//   17   35:iand            
	//   18   36:ifeq            123
_L1:
		int l = ViewCompat.getMinimumHeight(view);
	//   19   39:aload           10
	//   20   41:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
	//   21   44:istore          7
		if(j <= 0 || (k & 0xc) == 0) goto _L4; else goto _L3
	//   22   46:iload           4
	//   23   48:ifle            87
	//   24   51:iload           6
	//   25   53:bipush          12
	//   26   55:iand            
	//   27   56:ifeq            87
_L3:
		flag1 = flag2;
	//   28   59:iload           9
	//   29   61:istore          8
		if(-i < view.getBottom() - l - appbarlayout.getTopInset()) goto _L2; else goto _L5
	//   30   63:iload_3         
	//   31   64:ineg            
	//   32   65:aload           10
	//   33   67:invokevirtual   #141 <Method int View.getBottom()>
	//   34   70:iload           7
	//   35   72:isub            
	//   36   73:aload_2         
	//   37   74:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
	//   38   77:isub            
	//   39   78:icmplt          123
_L5:
		flag1 = true;
	//   40   81:iconst_1        
	//   41   82:istore          8
		break; /* Loop/switch isn't completed */
	//   42   84:goto            123
_L4:
		flag1 = flag2;
	//   43   87:iload           9
	//   44   89:istore          8
		if((k & 2) == 0)
			break; /* Loop/switch isn't completed */
	//   45   91:iload           6
	//   46   93:iconst_2        
	//   47   94:iand            
	//   48   95:ifeq            123
		flag1 = flag2;
	//   49   98:iload           9
	//   50  100:istore          8
		if(-i < view.getBottom() - l - appbarlayout.getTopInset()) goto _L2; else goto _L5
	//   51  102:iload_3         
	//   52  103:ineg            
	//   53  104:aload           10
	//   54  106:invokevirtual   #141 <Method int View.getBottom()>
	//   55  109:iload           7
	//   56  111:isub            
	//   57  112:aload_2         
	//   58  113:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
	//   59  116:isub            
	//   60  117:icmplt          123
	//*  61  120:goto            81
_L2:
		flag1 = appbarlayout.setCollapsedState(flag1);
	//   62  123:aload_2         
	//   63  124:iload           8
	//   64  126:invokevirtual   #240 <Method boolean AppBarLayout.setCollapsedState(boolean)>
	//   65  129:istore          8
		if(android.os.Build.VERSION.SDK_INT >= 11 && (flag || flag1 && shouldJumpElevationState(coordinatorlayout, appbarlayout)))
	//*  66  131:getstatic       #245 <Field int android.os.Build$VERSION.SDK_INT>
	//*  67  134:bipush          11
	//*  68  136:icmplt          162
	//*  69  139:iload           5
	//*  70  141:ifne            158
	//*  71  144:iload           8
	//*  72  146:ifeq            162
	//*  73  149:aload_0         
	//*  74  150:aload_1         
	//*  75  151:aload_2         
	//*  76  152:invokespecial   #247 <Method boolean shouldJumpElevationState(CoordinatorLayout, AppBarLayout)>
	//*  77  155:ifeq            162
			appbarlayout.jumpDrawablesToCurrentState();
	//   78  158:aload_2         
	//   79  159:invokevirtual   #250 <Method void AppBarLayout.jumpDrawablesToCurrentState()>
	//   80  162:return          
	}

	boolean canDragView(AppBarLayout appbarlayout)
	{
		if(mOnDragCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #254 <Field AppBarLayout$Behavior$DragCallback mOnDragCallback>
	//*   2    4:ifnull          16
			return mOnDragCallback.canDrag(appbarlayout);
	//    3    7:aload_0         
	//    4    8:getfield        #254 <Field AppBarLayout$Behavior$DragCallback mOnDragCallback>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #257 <Method boolean AppBarLayout$Behavior$DragCallback.canDrag(AppBarLayout)>
	//    7   15:ireturn         
		if(mLastNestedScrollingChildRef != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #259 <Field WeakReference mLastNestedScrollingChildRef>
	//*  10   20:ifnull          57
		{
			appbarlayout = ((AppBarLayout) ((View)mLastNestedScrollingChildRef.get()));
	//   11   23:aload_0         
	//   12   24:getfield        #259 <Field WeakReference mLastNestedScrollingChildRef>
	//   13   27:invokevirtual   #264 <Method Object WeakReference.get()>
	//   14   30:checkcast       #135 <Class View>
	//   15   33:astore_1        
			return appbarlayout != null && ((View) (appbarlayout)).isShown() && !((View) (appbarlayout)).canScrollVertically(-1);
	//   16   34:aload_1         
	//   17   35:ifnull          55
	//   18   38:aload_1         
	//   19   39:invokevirtual   #267 <Method boolean View.isShown()>
	//   20   42:ifeq            55
	//   21   45:aload_1         
	//   22   46:iconst_m1       
	//   23   47:invokevirtual   #271 <Method boolean View.canScrollVertically(int)>
	//   24   50:ifne            55
	//   25   53:iconst_1        
	//   26   54:ireturn         
	//   27   55:iconst_0        
	//   28   56:ireturn         
		} else
		{
			return true;
	//   29   57:iconst_1        
	//   30   58:ireturn         
		}
	}

	volatile boolean canDragView(View view)
	{
		return canDragView((AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class AppBarLayout>
	//    3    5:invokevirtual   #273 <Method boolean canDragView(AppBarLayout)>
	//    4    8:ireturn         
	}

	public volatile int getLeftAndRightOffset()
	{
		return super.getLeftAndRightOffset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #276 <Method int HeaderBehavior.getLeftAndRightOffset()>
	//    2    4:ireturn         
	}

	int getMaxDragOffset(AppBarLayout appbarlayout)
	{
		return -appbarlayout.getDownNestedScrollRange();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #281 <Method int AppBarLayout.getDownNestedScrollRange()>
	//    2    4:ineg            
	//    3    5:ireturn         
	}

	volatile int getMaxDragOffset(View view)
	{
		return getMaxDragOffset((AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class AppBarLayout>
	//    3    5:invokevirtual   #283 <Method int getMaxDragOffset(AppBarLayout)>
	//    4    8:ireturn         
	}

	int getScrollRangeForDragFling(AppBarLayout appbarlayout)
	{
		return appbarlayout.getTotalScrollRange();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #224 <Method int AppBarLayout.getTotalScrollRange()>
	//    2    4:ireturn         
	}

	volatile int getScrollRangeForDragFling(View view)
	{
		return getScrollRangeForDragFling((AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class AppBarLayout>
	//    3    5:invokevirtual   #286 <Method int getScrollRangeForDragFling(AppBarLayout)>
	//    4    8:ireturn         
	}

	public volatile int getTopAndBottomOffset()
	{
		return super.getTopAndBottomOffset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #289 <Method int HeaderBehavior.getTopAndBottomOffset()>
	//    2    4:ireturn         
	}

	int getTopBottomOffsetForScrollingSibling()
	{
		return getTopAndBottomOffset() + mOffsetDelta;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #290 <Method int getTopAndBottomOffset()>
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field int mOffsetDelta>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	boolean isOffsetAnimatorRunning()
	{
		return mOffsetAnimator != null && mOffsetAnimator.isRunning();
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//    5   11:invokevirtual   #86  <Method boolean ValueAnimator.isRunning()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	void onFlingFinished(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
	{
		snapToChildIfNeeded(coordinatorlayout, appbarlayout);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #296 <Method void snapToChildIfNeeded(CoordinatorLayout, AppBarLayout)>
	//    4    6:return          
	}

	volatile void onFlingFinished(CoordinatorLayout coordinatorlayout, View view)
	{
		onFlingFinished(coordinatorlayout, (AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:invokevirtual   #299 <Method void onFlingFinished(CoordinatorLayout, AppBarLayout)>
	//    5    9:return          
	}

	public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i)
	{
		boolean flag = super.onLayoutChild(coordinatorlayout, ((View) (appbarlayout)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #304 <Method boolean HeaderBehavior.onLayoutChild(CoordinatorLayout, View, int)>
	//    5    7:istore          5
		int j = appbarlayout.getPendingAction();
	//    6    9:aload_2         
	//    7   10:invokevirtual   #307 <Method int AppBarLayout.getPendingAction()>
	//    8   13:istore          4
		if(mOffsetToChildIndexOnLayout >= 0 && (j & 8) == 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #42  <Field int mOffsetToChildIndexOnLayout>
	//*  11   19:iflt            98
	//*  12   22:iload           4
	//*  13   24:bipush          8
	//*  14   26:iand            
	//*  15   27:ifne            98
		{
			View view = appbarlayout.getChildAt(mOffsetToChildIndexOnLayout);
	//   16   30:aload_2         
	//   17   31:aload_0         
	//   18   32:getfield        #42  <Field int mOffsetToChildIndexOnLayout>
	//   19   35:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
	//   20   38:astore          6
			i = -view.getBottom();
	//   21   40:aload           6
	//   22   42:invokevirtual   #141 <Method int View.getBottom()>
	//   23   45:ineg            
	//   24   46:istore_3        
			if(mOffsetToChildIndexOnLayoutIsMinHeight)
	//*  25   47:aload_0         
	//*  26   48:getfield        #309 <Field boolean mOffsetToChildIndexOnLayoutIsMinHeight>
	//*  27   51:ifeq            70
				i += ViewCompat.getMinimumHeight(view) + appbarlayout.getTopInset();
	//   28   54:iload_3         
	//   29   55:aload           6
	//   30   57:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
	//   31   60:aload_2         
	//   32   61:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
	//   33   64:iadd            
	//   34   65:iadd            
	//   35   66:istore_3        
			else
	//*  36   67:goto            87
				i += Math.round((float)view.getHeight() * mOffsetToChildIndexOnLayoutPerc);
	//   37   70:iload_3         
	//   38   71:aload           6
	//   39   73:invokevirtual   #158 <Method int View.getHeight()>
	//   40   76:i2f             
	//   41   77:aload_0         
	//   42   78:getfield        #311 <Field float mOffsetToChildIndexOnLayoutPerc>
	//   43   81:fmul            
	//   44   82:invokestatic    #70  <Method int Math.round(float)>
	//   45   85:iadd            
	//   46   86:istore_3        
			setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), i);
	//   47   87:aload_0         
	//   48   88:aload_1         
	//   49   89:aload_2         
	//   50   90:iload_3         
	//   51   91:invokevirtual   #315 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
	//   52   94:pop             
		} else
	//*  53   95:goto            189
		if(j != 0)
	//*  54   98:iload           4
	//*  55  100:ifeq            189
		{
			if((j & 4) != 0)
	//*  56  103:iload           4
	//*  57  105:iconst_4        
	//*  58  106:iand            
	//*  59  107:ifeq            115
				i = 1;
	//   60  110:iconst_1        
	//   61  111:istore_3        
			else
	//*  62  112:goto            117
				i = 0;
	//   63  115:iconst_0        
	//   64  116:istore_3        
			if((j & 2) != 0)
	//*  65  117:iload           4
	//*  66  119:iconst_2        
	//*  67  120:iand            
	//*  68  121:ifeq            159
			{
				j = -appbarlayout.getUpNestedPreScrollRange();
	//   69  124:aload_2         
	//   70  125:invokevirtual   #318 <Method int AppBarLayout.getUpNestedPreScrollRange()>
	//   71  128:ineg            
	//   72  129:istore          4
				if(i != 0)
	//*  73  131:iload_3         
	//*  74  132:ifeq            147
					animateOffsetTo(coordinatorlayout, appbarlayout, j, 0.0F);
	//   75  135:aload_0         
	//   76  136:aload_1         
	//   77  137:aload_2         
	//   78  138:iload           4
	//   79  140:fconst_0        
	//   80  141:invokespecial   #232 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
				else
	//*  81  144:goto            189
					setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), j);
	//   82  147:aload_0         
	//   83  148:aload_1         
	//   84  149:aload_2         
	//   85  150:iload           4
	//   86  152:invokevirtual   #315 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
	//   87  155:pop             
			} else
	//*  88  156:goto            189
			if((j & 1) != 0)
	//*  89  159:iload           4
	//*  90  161:iconst_1        
	//*  91  162:iand            
	//*  92  163:ifeq            189
				if(i != 0)
	//*  93  166:iload_3         
	//*  94  167:ifeq            181
					animateOffsetTo(coordinatorlayout, appbarlayout, 0, 0.0F);
	//   95  170:aload_0         
	//   96  171:aload_1         
	//   97  172:aload_2         
	//   98  173:iconst_0        
	//   99  174:fconst_0        
	//  100  175:invokespecial   #232 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
				else
	//* 101  178:goto            189
					setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), 0);
	//  102  181:aload_0         
	//  103  182:aload_1         
	//  104  183:aload_2         
	//  105  184:iconst_0        
	//  106  185:invokevirtual   #315 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
	//  107  188:pop             
		}
		appbarlayout.resetPendingAction();
	//  108  189:aload_2         
	//  109  190:invokevirtual   #321 <Method void AppBarLayout.resetPendingAction()>
		mOffsetToChildIndexOnLayout = -1;
	//  110  193:aload_0         
	//  111  194:iconst_m1       
	//  112  195:putfield        #42  <Field int mOffsetToChildIndexOnLayout>
		setTopAndBottomOffset(MathUtils.clamp(getTopAndBottomOffset(), -appbarlayout.getTotalScrollRange(), 0));
	//  113  198:aload_0         
	//  114  199:aload_0         
	//  115  200:invokevirtual   #290 <Method int getTopAndBottomOffset()>
	//  116  203:aload_2         
	//  117  204:invokevirtual   #224 <Method int AppBarLayout.getTotalScrollRange()>
	//  118  207:ineg            
	//  119  208:iconst_0        
	//  120  209:invokestatic    #230 <Method int MathUtils.clamp(int, int, int)>
	//  121  212:invokevirtual   #324 <Method boolean setTopAndBottomOffset(int)>
	//  122  215:pop             
		updateAppBarLayoutDrawableState(coordinatorlayout, appbarlayout, getTopAndBottomOffset(), 0, true);
	//  123  216:aload_0         
	//  124  217:aload_1         
	//  125  218:aload_2         
	//  126  219:aload_0         
	//  127  220:invokevirtual   #290 <Method int getTopAndBottomOffset()>
	//  128  223:iconst_0        
	//  129  224:iconst_1        
	//  130  225:invokespecial   #326 <Method void updateAppBarLayoutDrawableState(CoordinatorLayout, AppBarLayout, int, int, boolean)>
		appbarlayout.dispatchOffsetUpdates(getTopAndBottomOffset());
	//  131  228:aload_2         
	//  132  229:aload_0         
	//  133  230:invokevirtual   #290 <Method int getTopAndBottomOffset()>
	//  134  233:invokevirtual   #330 <Method void AppBarLayout.dispatchOffsetUpdates(int)>
		return flag;
	//  135  236:iload           5
	//  136  238:ireturn         
	}

	public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		return onLayoutChild(coordinatorlayout, (AppBarLayout)view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:iload_3         
	//    5    7:invokevirtual   #332 <Method boolean onLayoutChild(CoordinatorLayout, AppBarLayout, int)>
	//    6   10:ireturn         
	}

	public boolean onMeasureChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k, int l)
	{
		if(((utParams)appbarlayout.getLayoutParams()).height == -2)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #335 <Method android.view.ViewGroup$LayoutParams AppBarLayout.getLayoutParams()>
	//*   2    4:checkcast       #206 <Class CoordinatorLayout$LayoutParams>
	//*   3    7:getfield        #338 <Field int CoordinatorLayout$LayoutParams.height>
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
	//   12   22:invokestatic    #343 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   13   25:iload           6
	//   14   27:invokevirtual   #346 <Method void CoordinatorLayout.onMeasureChild(View, int, int, int, int)>
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
	//   24   42:invokespecial   #349 <Method boolean HeaderBehavior.onMeasureChild(CoordinatorLayout, View, int, int, int, int)>
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
	//    8   13:invokevirtual   #351 <Method boolean onMeasureChild(CoordinatorLayout, AppBarLayout, int, int, int, int)>
	//    9   16:ireturn         
	}

	public void onNestedPreScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int ai[], int k)
	{
		if(j != 0)
	//*   0    0:iload           5
	//*   1    2:ifeq            65
		{
			if(j < 0)
	//*   2    5:iload           5
	//*   3    7:ifge            29
			{
				i = -appbarlayout.getTotalScrollRange();
	//    4   10:aload_2         
	//    5   11:invokevirtual   #224 <Method int AppBarLayout.getTotalScrollRange()>
	//    6   14:ineg            
	//    7   15:istore          4
				k = appbarlayout.getDownNestedPreScrollRange() + i;
	//    8   17:aload_2         
	//    9   18:invokevirtual   #356 <Method int AppBarLayout.getDownNestedPreScrollRange()>
	//   10   21:iload           4
	//   11   23:iadd            
	//   12   24:istore          7
			} else
	//*  13   26:goto            42
			{
				i = -appbarlayout.getUpNestedPreScrollRange();
	//   14   29:aload_2         
	//   15   30:invokevirtual   #318 <Method int AppBarLayout.getUpNestedPreScrollRange()>
	//   16   33:ineg            
	//   17   34:istore          4
				k = 0;
	//   18   36:iconst_0        
	//   19   37:istore          7
			}
	//*  20   39:goto            26
			if(i != k)
	//*  21   42:iload           4
	//*  22   44:iload           7
	//*  23   46:icmpeq          65
				ai[1] = scroll(coordinatorlayout, ((View) (appbarlayout)), j, i, k);
	//   24   49:aload           6
	//   25   51:iconst_1        
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:aload_2         
	//   29   55:iload           5
	//   30   57:iload           4
	//   31   59:iload           7
	//   32   61:invokevirtual   #360 <Method int scroll(CoordinatorLayout, View, int, int, int)>
	//   33   64:iastore         
		}
	//   34   65:return          
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
	//    9   15:invokevirtual   #363 <Method void onNestedPreScroll(CoordinatorLayout, AppBarLayout, View, int, int, int[], int)>
	//   10   18:return          
	}

	public void onNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int k, int l, 
			int i1)
	{
		if(l < 0)
	//*   0    0:iload           7
	//*   1    2:ifge            20
			scroll(coordinatorlayout, ((View) (appbarlayout)), l, -appbarlayout.getDownNestedScrollRange(), 0);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:iload           7
	//    6   10:aload_2         
	//    7   11:invokevirtual   #281 <Method int AppBarLayout.getDownNestedScrollRange()>
	//    8   14:ineg            
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #360 <Method int scroll(CoordinatorLayout, View, int, int, int)>
	//   11   19:pop             
	//   12   20:return          
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
	//   10   17:invokevirtual   #368 <Method void onNestedScroll(CoordinatorLayout, AppBarLayout, View, int, int, int, int, int)>
	//   11   20:return          
	}

	public void onRestoreInstanceState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, Parcelable parcelable)
	{
		if(parcelable instanceof SavedState)
	//*   0    0:aload_3         
	//*   1    1:instanceof      #15  <Class AppBarLayout$Behavior$SavedState>
	//*   2    4:ifeq            47
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    3    7:aload_3         
	//    4    8:checkcast       #15  <Class AppBarLayout$Behavior$SavedState>
	//    5   11:astore_3        
			super.onRestoreInstanceState(coordinatorlayout, ((View) (appbarlayout)), ((SavedState) (parcelable)).getSuperState());
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #374 <Method Parcelable AppBarLayout$Behavior$SavedState.getSuperState()>
	//   11   19:invokespecial   #377 <Method void HeaderBehavior.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
			mOffsetToChildIndexOnLayout = ((SavedState) (parcelable)).firstVisibleChildIndex;
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:getfield        #380 <Field int AppBarLayout$Behavior$SavedState.firstVisibleChildIndex>
	//   15   27:putfield        #42  <Field int mOffsetToChildIndexOnLayout>
			mOffsetToChildIndexOnLayoutPerc = ((SavedState) (parcelable)).firstVisibleChildPercentageShown;
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:getfield        #383 <Field float AppBarLayout$Behavior$SavedState.firstVisibleChildPercentageShown>
	//   19   35:putfield        #311 <Field float mOffsetToChildIndexOnLayoutPerc>
			mOffsetToChildIndexOnLayoutIsMinHeight = ((SavedState) (parcelable)).firstVisibleChildAtMinimumHeight;
	//   20   38:aload_0         
	//   21   39:aload_3         
	//   22   40:getfield        #386 <Field boolean AppBarLayout$Behavior$SavedState.firstVisibleChildAtMinimumHeight>
	//   23   43:putfield        #309 <Field boolean mOffsetToChildIndexOnLayoutIsMinHeight>
			return;
	//   24   46:return          
		} else
		{
			super.onRestoreInstanceState(coordinatorlayout, ((View) (appbarlayout)), parcelable);
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:aload_2         
	//   28   50:aload_3         
	//   29   51:invokespecial   #377 <Method void HeaderBehavior.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
			mOffsetToChildIndexOnLayout = -1;
	//   30   54:aload_0         
	//   31   55:iconst_m1       
	//   32   56:putfield        #42  <Field int mOffsetToChildIndexOnLayout>
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
	//    5    7:invokevirtual   #388 <Method void onRestoreInstanceState(CoordinatorLayout, AppBarLayout, Parcelable)>
	//    6   10:return          
	}

	public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
	{
		Object obj = ((Object) (super.onSaveInstanceState(coordinatorlayout, ((View) (appbarlayout)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #393 <Method Parcelable HeaderBehavior.onSaveInstanceState(CoordinatorLayout, View)>
	//    4    6:astore          8
		int j = getTopAndBottomOffset();
	//    5    8:aload_0         
	//    6    9:invokevirtual   #290 <Method int getTopAndBottomOffset()>
	//    7   12:istore          4
		int k = appbarlayout.getChildCount();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
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
	//   20   33:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
	//   21   36:astore_1        
			int l = ((View) (coordinatorlayout)).getBottom() + j;
	//   22   37:aload_1         
	//   23   38:invokevirtual   #141 <Method int View.getBottom()>
	//   24   41:iload           4
	//   25   43:iadd            
	//   26   44:istore          6
			if(((View) (coordinatorlayout)).getTop() + j <= 0 && l >= 0)
	//*  27   46:aload_1         
	//*  28   47:invokevirtual   #138 <Method int View.getTop()>
	//*  29   50:iload           4
	//*  30   52:iadd            
	//*  31   53:ifgt            119
	//*  32   56:iload           6
	//*  33   58:iflt            119
			{
				obj = ((Object) (new SavedState(((Parcelable) (obj)))));
	//   34   61:new             #15  <Class AppBarLayout$Behavior$SavedState>
	//   35   64:dup             
	//   36   65:aload           8
	//   37   67:invokespecial   #396 <Method void AppBarLayout$Behavior$SavedState(Parcelable)>
	//   38   70:astore          8
				obj.firstVisibleChildIndex = i;
	//   39   72:aload           8
	//   40   74:iload_3         
	//   41   75:putfield        #380 <Field int AppBarLayout$Behavior$SavedState.firstVisibleChildIndex>
				if(l == ViewCompat.getMinimumHeight(((View) (coordinatorlayout))) + appbarlayout.getTopInset())
	//*  42   78:iload           6
	//*  43   80:aload_1         
	//*  44   81:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
	//*  45   84:aload_2         
	//*  46   85:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
	//*  47   88:iadd            
	//*  48   89:icmpne          95
					flag = true;
	//   49   92:iconst_1        
	//   50   93:istore          7
				obj.firstVisibleChildAtMinimumHeight = flag;
	//   51   95:aload           8
	//   52   97:iload           7
	//   53   99:putfield        #386 <Field boolean AppBarLayout$Behavior$SavedState.firstVisibleChildAtMinimumHeight>
				obj.firstVisibleChildPercentageShown = (float)l / (float)((View) (coordinatorlayout)).getHeight();
	//   54  102:aload           8
	//   55  104:iload           6
	//   56  106:i2f             
	//   57  107:aload_1         
	//   58  108:invokevirtual   #158 <Method int View.getHeight()>
	//   59  111:i2f             
	//   60  112:fdiv            
	//   61  113:putfield        #383 <Field float AppBarLayout$Behavior$SavedState.firstVisibleChildPercentageShown>
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
	//    4    6:invokevirtual   #398 <Method Parcelable onSaveInstanceState(CoordinatorLayout, AppBarLayout)>
	//    5    9:areturn         
	}

	public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, View view1, int i, int j)
	{
		boolean flag;
		if((i & 2) != 0 && appbarlayout.hasScrollableChildren() && coordinatorlayout.getHeight() - view.getHeight() <= appbarlayout.getHeight())
	//*   0    0:iload           5
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            36
	//*   4    7:aload_2         
	//*   5    8:invokevirtual   #403 <Method boolean AppBarLayout.hasScrollableChildren()>
	//*   6   11:ifeq            36
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #404 <Method int CoordinatorLayout.getHeight()>
	//*   9   18:aload_3         
	//*  10   19:invokevirtual   #158 <Method int View.getHeight()>
	//*  11   22:isub            
	//*  12   23:aload_2         
	//*  13   24:invokevirtual   #73  <Method int AppBarLayout.getHeight()>
	//*  14   27:icmpgt          36
			flag = true;
	//   15   30:iconst_1        
	//   16   31:istore          7
		else
	//*  17   33:goto            39
			flag = false;
	//   18   36:iconst_0        
	//   19   37:istore          7
		if(flag && mOffsetAnimator != null)
	//*  20   39:iload           7
	//*  21   41:ifeq            58
	//*  22   44:aload_0         
	//*  23   45:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//*  24   48:ifnull          58
			mOffsetAnimator.cancel();
	//   25   51:aload_0         
	//   26   52:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//   27   55:invokevirtual   #89  <Method void ValueAnimator.cancel()>
		mLastNestedScrollingChildRef = null;
	//   28   58:aload_0         
	//   29   59:aconst_null     
	//   30   60:putfield        #259 <Field WeakReference mLastNestedScrollingChildRef>
		return flag;
	//   31   63:iload           7
	//   32   65:ireturn         
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
	//    8   13:invokevirtual   #407 <Method boolean onStartNestedScroll(CoordinatorLayout, AppBarLayout, View, View, int, int)>
	//    9   16:ireturn         
	}

	public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i)
	{
		if(i == 0)
	//*   0    0:iload           4
	//*   1    2:ifne            11
			snapToChildIfNeeded(coordinatorlayout, appbarlayout);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:invokespecial   #296 <Method void snapToChildIfNeeded(CoordinatorLayout, AppBarLayout)>
		mLastNestedScrollingChildRef = new WeakReference(((Object) (view)));
	//    6   11:aload_0         
	//    7   12:new             #261 <Class WeakReference>
	//    8   15:dup             
	//    9   16:aload_3         
	//   10   17:invokespecial   #412 <Method void WeakReference(Object)>
	//   11   20:putfield        #259 <Field WeakReference mLastNestedScrollingChildRef>
	//   12   23:return          
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
	//    6    9:invokevirtual   #415 <Method void onStopNestedScroll(CoordinatorLayout, AppBarLayout, View, int)>
	//    7   12:return          
	}

	public void setDragCallback(DragCallback dragcallback)
	{
		mOnDragCallback = dragcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #254 <Field AppBarLayout$Behavior$DragCallback mOnDragCallback>
	//    3    5:return          
	}

	int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k)
	{
		int l = getTopBottomOffsetForScrollingSibling();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method int getTopBottomOffsetForScrollingSibling()>
	//    2    4:istore          6
		if(j != 0 && l >= j && l <= k)
	//*   3    6:iload           4
	//*   4    8:ifeq            136
	//*   5   11:iload           6
	//*   6   13:iload           4
	//*   7   15:icmplt          136
	//*   8   18:iload           6
	//*   9   20:iload           5
	//*  10   22:icmpgt          136
		{
			j = MathUtils.clamp(i, j, k);
	//   11   25:iload_3         
	//   12   26:iload           4
	//   13   28:iload           5
	//   14   30:invokestatic    #230 <Method int MathUtils.clamp(int, int, int)>
	//   15   33:istore          4
			if(l != j)
	//*  16   35:iload           6
	//*  17   37:iload           4
	//*  18   39:icmpeq          141
			{
				if(appbarlayout.hasChildWithInterpolator())
	//*  19   42:aload_2         
	//*  20   43:invokevirtual   #423 <Method boolean AppBarLayout.hasChildWithInterpolator()>
	//*  21   46:ifeq            60
					i = interpolateOffset(appbarlayout, j);
	//   22   49:aload_0         
	//   23   50:aload_2         
	//   24   51:iload           4
	//   25   53:invokespecial   #425 <Method int interpolateOffset(AppBarLayout, int)>
	//   26   56:istore_3        
				else
	//*  27   57:goto            63
					i = j;
	//   28   60:iload           4
	//   29   62:istore_3        
				boolean flag = setTopAndBottomOffset(i);
	//   30   63:aload_0         
	//   31   64:iload_3         
	//   32   65:invokevirtual   #324 <Method boolean setTopAndBottomOffset(int)>
	//   33   68:istore          7
				mOffsetDelta = j - i;
	//   34   70:aload_0         
	//   35   71:iload           4
	//   36   73:iload_3         
	//   37   74:isub            
	//   38   75:putfield        #50  <Field int mOffsetDelta>
				if(!flag && appbarlayout.hasChildWithInterpolator())
	//*  39   78:iload           7
	//*  40   80:ifne            95
	//*  41   83:aload_2         
	//*  42   84:invokevirtual   #423 <Method boolean AppBarLayout.hasChildWithInterpolator()>
	//*  43   87:ifeq            95
					coordinatorlayout.dispatchDependentViewsChanged(((View) (appbarlayout)));
	//   44   90:aload_1         
	//   45   91:aload_2         
	//   46   92:invokevirtual   #429 <Method void CoordinatorLayout.dispatchDependentViewsChanged(View)>
				appbarlayout.dispatchOffsetUpdates(getTopAndBottomOffset());
	//   47   95:aload_2         
	//   48   96:aload_0         
	//   49   97:invokevirtual   #290 <Method int getTopAndBottomOffset()>
	//   50  100:invokevirtual   #330 <Method void AppBarLayout.dispatchOffsetUpdates(int)>
				if(j < l)
	//*  51  103:iload           4
	//*  52  105:iload           6
	//*  53  107:icmpge          115
					i = -1;
	//   54  110:iconst_m1       
	//   55  111:istore_3        
				else
	//*  56  112:goto            120
					i = 1;
	//   57  115:iconst_1        
	//   58  116:istore_3        
	//*  59  117:goto            112
				updateAppBarLayoutDrawableState(coordinatorlayout, appbarlayout, j, i, false);
	//   60  120:aload_0         
	//   61  121:aload_1         
	//   62  122:aload_2         
	//   63  123:iload           4
	//   64  125:iload_3         
	//   65  126:iconst_0        
	//   66  127:invokespecial   #326 <Method void updateAppBarLayoutDrawableState(CoordinatorLayout, AppBarLayout, int, int, boolean)>
				return l - j;
	//   67  130:iload           6
	//   68  132:iload           4
	//   69  134:isub            
	//   70  135:ireturn         
			}
		} else
		{
			mOffsetDelta = 0;
	//   71  136:aload_0         
	//   72  137:iconst_0        
	//   73  138:putfield        #50  <Field int mOffsetDelta>
		}
		return 0;
	//   74  141:iconst_0        
	//   75  142:ireturn         
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
	//    7   11:invokevirtual   #431 <Method int setHeaderTopBottomOffset(CoordinatorLayout, AppBarLayout, int, int, int)>
	//    8   14:ireturn         
	}

	public volatile boolean setLeftAndRightOffset(int i)
	{
		return super.setLeftAndRightOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #434 <Method boolean HeaderBehavior.setLeftAndRightOffset(int)>
	//    3    5:ireturn         
	}

	public volatile boolean setTopAndBottomOffset(int i)
	{
		return super.setTopAndBottomOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #435 <Method boolean HeaderBehavior.setTopAndBottomOffset(int)>
	//    3    5:ireturn         
	}

	private static final int INVALID_POSITION = -1;
	private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
	private WeakReference mLastNestedScrollingChildRef;
	private ValueAnimator mOffsetAnimator;
	private int mOffsetDelta;
	private int mOffsetToChildIndexOnLayout;
	private boolean mOffsetToChildIndexOnLayoutIsMinHeight;
	private float mOffsetToChildIndexOnLayoutPerc;
	private DragCallback mOnDragCallback;


/*
	static int access$000(AppBarLayout$Behavior appbarlayout$behavior)
	{
		return appbarlayout$behavior.mOffsetDelta;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int mOffsetDelta>
	//    2    4:ireturn         
	}

*/

	public AppBarLayout$Behavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void HeaderBehavior()>
		mOffsetToChildIndexOnLayout = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #42  <Field int mOffsetToChildIndexOnLayout>
	//    5    9:return          
	}

	public AppBarLayout$Behavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #46  <Method void HeaderBehavior(Context, AttributeSet)>
		mOffsetToChildIndexOnLayout = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #42  <Field int mOffsetToChildIndexOnLayout>
	//    7   11:return          
	}
}
