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
			if(firstVisibleChildAtMinimumHeight)
		//*  12   22:aload_0         
		//*  13   23:getfield        #52  <Field boolean firstVisibleChildAtMinimumHeight>
		//*  14   26:ifeq            38
				i = 1;
		//   15   29:iconst_1        
		//   16   30:istore_2        
			else
		//*  17   31:aload_1         
		//*  18   32:iload_2         
		//*  19   33:int2byte        
		//*  20   34:invokevirtual   #71  <Method void Parcel.writeByte(byte)>
		//*  21   37:return          
				i = 0;
		//   22   38:iconst_0        
		//   23   39:istore_2        
			parcel.writeByte((byte)i);
		//*  24   40:goto            31
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
		//*  14   26:ifeq            37
				flag = true;
		//   15   29:iconst_1        
		//   16   30:istore_3        
			else
		//*  17   31:aload_0         
		//*  18   32:iload_3         
		//*  19   33:putfield        #52  <Field boolean firstVisibleChildAtMinimumHeight>
		//*  20   36:return          
				flag = false;
		//   21   37:iconst_0        
		//   22   38:istore_3        
			firstVisibleChildAtMinimumHeight = flag;
		//*  23   39:goto            31
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
	//*  12   22:ifle            51
			j = Math.round(((float)j / f) * 1000F) * 3;
	//   13   25:iload           5
	//   14   27:i2f             
	//   15   28:fload           4
	//   16   30:fdiv            
	//   17   31:ldc1            #66  <Float 1000F>
	//   18   33:fmul            
	//   19   34:invokestatic    #70  <Method int Math.round(float)>
	//   20   37:iconst_3        
	//   21   38:imul            
	//   22   39:istore          5
		else
	//*  23   41:aload_0         
	//*  24   42:aload_1         
	//*  25   43:aload_2         
	//*  26   44:iload_3         
	//*  27   45:iload           5
	//*  28   47:invokespecial   #74  <Method void animateOffsetWithDuration(CoordinatorLayout, AppBarLayout, int, int)>
	//*  29   50:return          
			j = (int)(((float)j / (float)appbarlayout.getHeight() + 1.0F) * 150F);
	//   30   51:iload           5
	//   31   53:i2f             
	//   32   54:aload_2         
	//   33   55:invokevirtual   #77  <Method int AppBarLayout.getHeight()>
	//   34   58:i2f             
	//   35   59:fdiv            
	//   36   60:fconst_1        
	//   37   61:fadd            
	//   38   62:ldc1            #78  <Float 150F>
	//   39   64:fmul            
	//   40   65:f2i             
	//   41   66:istore          5
		animateOffsetWithDuration(coordinatorlayout, appbarlayout, i, j);
	//*  42   68:goto            41
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
	//*  19   41:ifnonnull       126
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
	//*  38   82:aload_0         
	//*  39   83:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//*  40   86:iload           4
	//*  41   88:sipush          600
	//*  42   91:invokestatic    #111 <Method int Math.min(int, int)>
	//*  43   94:i2l             
	//*  44   95:invokevirtual   #115 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//*  45   98:pop             
	//*  46   99:aload_0         
	//*  47  100:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//*  48  103:iconst_2        
	//*  49  104:newarray        int[]
	//*  50  106:dup             
	//*  51  107:iconst_0        
	//*  52  108:iload           5
	//*  53  110:iastore         
	//*  54  111:dup             
	//*  55  112:iconst_1        
	//*  56  113:iload_3         
	//*  57  114:iastore         
	//*  58  115:invokevirtual   #119 <Method void ValueAnimator.setIntValues(int[])>
	//*  59  118:aload_0         
	//*  60  119:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//*  61  122:invokevirtual   #122 <Method void ValueAnimator.start()>
	//*  62  125:return          
		{
			mOffsetAnimator.cancel();
	//   63  126:aload_0         
	//   64  127:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//   65  130:invokevirtual   #89  <Method void ValueAnimator.cancel()>
		}
		mOffsetAnimator.setDuration(Math.min(j, 600));
		mOffsetAnimator.setIntValues(new int[] {
			k, i
		});
		mOffsetAnimator.start();
	//*  66  133:goto            82
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
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		for(int k = appbarlayout.getChildCount(); j < k; j++)
	//*   2    2:aload_1         
	//*   3    3:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
	//*   4    6:istore          4
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          50
		{
			View view = appbarlayout.getChildAt(j);
	//    8   14:aload_1         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
	//   11   19:astore          5
			if(view.getTop() <= -i && view.getBottom() >= -i)
	//*  12   21:aload           5
	//*  13   23:invokevirtual   #138 <Method int View.getTop()>
	//*  14   26:iload_2         
	//*  15   27:ineg            
	//*  16   28:icmpgt          43
	//*  17   31:aload           5
	//*  18   33:invokevirtual   #141 <Method int View.getBottom()>
	//*  19   36:iload_2         
	//*  20   37:ineg            
	//*  21   38:icmplt          43
				return j;
	//   22   41:iload_3         
	//   23   42:ireturn         
		}

	//   24   43:iload_3         
	//   25   44:iconst_1        
	//   26   45:iadd            
	//   27   46:istore_3        
	//*  28   47:goto            8
		return -1;
	//   29   50:iconst_m1       
	//   30   51:ireturn         
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
		do
		{
label0:
			{
				int j = i;
	//    8   15:iload_2         
	//    9   16:istore          4
				if(k < i1)
	//*  10   18:iload           5
	//*  11   20:iload           7
	//*  12   22:icmpge          221
				{
					View view = appbarlayout.getChildAt(k);
	//   13   25:aload_1         
	//   14   26:iload           5
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
					if(l < view.getTop() || l > view.getBottom())
						break label0;
	//   24   50:iload           6
	//   25   52:aload           8
	//   26   54:invokevirtual   #138 <Method int View.getTop()>
	//   27   57:icmplt          224
	//   28   60:iload           6
	//   29   62:aload           8
	//   30   64:invokevirtual   #141 <Method int View.getBottom()>
	//   31   67:icmpgt          224
					j = i;
	//   32   70:iload_2         
	//   33   71:istore          4
					if(interpolator != null)
	//*  34   73:aload           10
	//*  35   75:ifnull          221
					{
						int j1 = ams.getScrollFlags();
	//   36   78:aload           9
	//   37   80:invokevirtual   #157 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
	//   38   83:istore          7
						if((j1 & 1) != 0)
	//*  39   85:iload           7
	//*  40   87:iconst_1        
	//*  41   88:iand            
	//*  42   89:ifeq            233
						{
							j = view.getHeight();
	//   43   92:aload           8
	//   44   94:invokevirtual   #158 <Method int View.getHeight()>
	//   45   97:istore          4
							k = ams.topMargin;
	//   46   99:aload           9
	//   47  101:getfield        #161 <Field int AppBarLayout$LayoutParams.topMargin>
	//   48  104:istore          5
							k = ams.bottomMargin + (j + k) + 0;
	//   49  106:aload           9
	//   50  108:getfield        #164 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   51  111:iload           4
	//   52  113:iload           5
	//   53  115:iadd            
	//   54  116:iadd            
	//   55  117:iconst_0        
	//   56  118:iadd            
	//   57  119:istore          5
							j = k;
	//   58  121:iload           5
	//   59  123:istore          4
							if((j1 & 2) != 0)
	//*  60  125:iload           7
	//*  61  127:iconst_2        
	//*  62  128:iand            
	//*  63  129:ifeq            142
								j = k - ViewCompat.getMinimumHeight(view);
	//   64  132:iload           5
	//   65  134:aload           8
	//   66  136:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
	//   67  139:isub            
	//   68  140:istore          4
						} else
	//*  69  142:iload           4
	//*  70  144:istore          5
	//*  71  146:aload           8
	//*  72  148:invokestatic    #174 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  73  151:ifeq            163
	//*  74  154:iload           4
	//*  75  156:aload_1         
	//*  76  157:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
	//*  77  160:isub            
	//*  78  161:istore          5
	//*  79  163:iload_2         
	//*  80  164:istore          4
	//*  81  166:iload           5
	//*  82  168:ifle            221
	//*  83  171:aload           8
	//*  84  173:invokevirtual   #138 <Method int View.getTop()>
	//*  85  176:istore          4
	//*  86  178:iload           5
	//*  87  180:i2f             
	//*  88  181:fstore_3        
	//*  89  182:aload           10
	//*  90  184:iload           6
	//*  91  186:iload           4
	//*  92  188:isub            
	//*  93  189:i2f             
	//*  94  190:iload           5
	//*  95  192:i2f             
	//*  96  193:fdiv            
	//*  97  194:invokeinterface #182 <Method float Interpolator.getInterpolation(float)>
	//*  98  199:fload_3         
	//*  99  200:fmul            
	//* 100  201:invokestatic    #70  <Method int Math.round(float)>
	//* 101  204:istore          4
	//* 102  206:iload_2         
	//* 103  207:invokestatic    #187 <Method int Integer.signum(int)>
	//* 104  210:iload           4
	//* 105  212:aload           8
	//* 106  214:invokevirtual   #138 <Method int View.getTop()>
	//* 107  217:iadd            
	//* 108  218:imul            
	//* 109  219:istore          4
	//* 110  221:iload           4
	//* 111  223:ireturn         
	//* 112  224:iload           5
	//* 113  226:iconst_1        
	//* 114  227:iadd            
	//* 115  228:istore          5
	//* 116  230:goto            15
						{
							j = 0;
	//  117  233:iconst_0        
	//  118  234:istore          4
						}
						k = j;
						if(ViewCompat.getFitsSystemWindows(view))
							k = j - appbarlayout.getTopInset();
						j = i;
						if(k > 0)
						{
							j = view.getTop();
							float f = k;
							j = Math.round(interpolator.getInterpolation((float)(l - j) / (float)k) * f);
							j = Integer.signum(i) * (j + view.getTop());
						}
					}
				}
				return j;
			}
			k++;
		} while(true);
	//* 119  236:goto            142
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
		for(int i = 0; i < j; i++)
	//*   7   14:iconst_0        
	//*   8   15:istore_3        
	//*   9   16:iload_3         
	//*  10   17:iload           4
	//*  11   19:icmpge          70
		{
			appbarlayout = ((AppBarLayout) (((utParams)((View)((List) (coordinatorlayout)).get(i)).getLayoutParams()).getBehavior()));
	//   12   22:aload_1         
	//   13   23:iload_3         
	//   14   24:invokeinterface #204 <Method Object List.get(int)>
	//   15   29:checkcast       #135 <Class View>
	//   16   32:invokevirtual   #148 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   17   35:checkcast       #206 <Class CoordinatorLayout$LayoutParams>
	//   18   38:invokevirtual   #210 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   19   41:astore_2        
			if(appbarlayout instanceof ViewBehavior)
	//*  20   42:aload_2         
	//*  21   43:instanceof      #212 <Class AppBarLayout$ScrollingViewBehavior>
	//*  22   46:ifeq            63
				return ((ViewBehavior)appbarlayout).getOverlayTop() != 0;
	//   23   49:aload_2         
	//   24   50:checkcast       #212 <Class AppBarLayout$ScrollingViewBehavior>
	//   25   53:invokevirtual   #215 <Method int AppBarLayout$ScrollingViewBehavior.getOverlayTop()>
	//   26   56:ifeq            61
	//   27   59:iconst_1        
	//   28   60:ireturn         
	//   29   61:iconst_0        
	//   30   62:ireturn         
		}

	//   31   63:iload_3         
	//   32   64:iconst_1        
	//   33   65:iadd            
	//   34   66:istore_3        
	//*  35   67:goto            16
		return false;
	//   36   70:iconst_0        
	//   37   71:ireturn         
	}

	private void snapToChildIfNeeded(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
	{
		int j1;
		int k1;
		j1 = getTopBottomOffsetForScrollingSibling();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method int getTopBottomOffsetForScrollingSibling()>
	//    2    4:istore          7
		k1 = getChildIndexOnOffset(appbarlayout, j1);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:iload           7
	//    6   10:invokespecial   #219 <Method int getChildIndexOnOffset(AppBarLayout, int)>
	//    7   13:istore          8
		if(k1 < 0) goto _L2; else goto _L1
	//    8   15:iload           8
	//    9   17:iflt            139
_L1:
		int i1;
		View view;
		view = appbarlayout.getChildAt(k1);
	//   10   20:aload_2         
	//   11   21:iload           8
	//   12   23:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
	//   13   26:astore          9
		i1 = ((ams)view.getLayoutParams()).getScrollFlags();
	//   14   28:aload           9
	//   15   30:invokevirtual   #148 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   33:checkcast       #150 <Class AppBarLayout$LayoutParams>
	//   17   36:invokevirtual   #157 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
	//   18   39:istore          6
		if((i1 & 0x11) != 17) goto _L2; else goto _L3
	//   19   41:iload           6
	//   20   43:bipush          17
	//   21   45:iand            
	//   22   46:bipush          17
	//   23   48:icmpne          139
_L3:
		int k;
		int l;
		l = -view.getTop();
	//   24   51:aload           9
	//   25   53:invokevirtual   #138 <Method int View.getTop()>
	//   26   56:ineg            
	//   27   57:istore          5
		int i = -view.getBottom();
	//   28   59:aload           9
	//   29   61:invokevirtual   #141 <Method int View.getBottom()>
	//   30   64:ineg            
	//   31   65:istore_3        
		k = i;
	//   32   66:iload_3         
	//   33   67:istore          4
		if(k1 == appbarlayout.getChildCount() - 1)
	//*  34   69:iload           8
	//*  35   71:aload_2         
	//*  36   72:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
	//*  37   75:iconst_1        
	//*  38   76:isub            
	//*  39   77:icmpne          88
			k = i + appbarlayout.getTopInset();
	//   40   80:iload_3         
	//   41   81:aload_2         
	//   42   82:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
	//   43   85:iadd            
	//   44   86:istore          4
		if(!checkFlag(i1, 2)) goto _L5; else goto _L4
	//   45   88:iload           6
	//   46   90:iconst_2        
	//   47   91:invokestatic    #221 <Method boolean checkFlag(int, int)>
	//   48   94:ifeq            140
_L4:
		int j;
		k += ViewCompat.getMinimumHeight(view);
	//   49   97:iload           4
	//   50   99:aload           9
	//   51  101:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
	//   52  104:iadd            
	//   53  105:istore          4
		j = l;
	//   54  107:iload           5
	//   55  109:istore_3        
_L7:
		if(j1 >= (k + j) / 2)
	//*  56  110:iload           7
	//*  57  112:iload           4
	//*  58  114:iload_3         
	//*  59  115:iadd            
	//*  60  116:iconst_2        
	//*  61  117:idiv            
	//*  62  118:icmpge          179
	//*  63  121:aload_0         
	//*  64  122:aload_1         
	//*  65  123:aload_2         
	//*  66  124:iload           4
	//*  67  126:aload_2         
	//*  68  127:invokevirtual   #224 <Method int AppBarLayout.getTotalScrollRange()>
	//*  69  130:ineg            
	//*  70  131:iconst_0        
	//*  71  132:invokestatic    #230 <Method int MathUtils.clamp(int, int, int)>
	//*  72  135:fconst_0        
	//*  73  136:invokespecial   #232 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
	//*  74  139:return          
	//*  75  140:iload           6
	//*  76  142:iconst_5        
	//*  77  143:invokestatic    #221 <Method boolean checkFlag(int, int)>
	//*  78  146:ifeq            185
	//*  79  149:aload           9
	//*  80  151:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
	//*  81  154:iload           4
	//*  82  156:iadd            
	//*  83  157:istore          6
	//*  84  159:iload           6
	//*  85  161:istore_3        
	//*  86  162:iload           7
	//*  87  164:iload           6
	//*  88  166:icmplt          110
	//*  89  169:iload           6
	//*  90  171:istore          4
	//*  91  173:iload           5
	//*  92  175:istore_3        
	//*  93  176:goto            110
			k = j;
	//   94  179:iload_3         
	//   95  180:istore          4
		animateOffsetTo(coordinatorlayout, appbarlayout, MathUtils.clamp(k, -appbarlayout.getTotalScrollRange(), 0), 0.0F);
_L2:
		return;
_L5:
		if(checkFlag(i1, 5))
		{
			i1 = ViewCompat.getMinimumHeight(view) + k;
			j = i1;
			if(j1 >= i1)
			{
				k = i1;
				j = l;
			}
		} else
	//*  96  182:goto            121
		{
			j = l;
	//   97  185:iload           5
	//   98  187:istore_3        
		}
		if(true) goto _L7; else goto _L6
	//   99  188:goto            110
_L6:
	}

	private void updateAppBarLayoutDrawableState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, boolean flag)
	{
		boolean flag2;
		boolean flag3;
		View view;
		flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          9
		flag3 = false;
	//    2    3:iconst_0        
	//    3    4:istore          10
		view = getAppBarChildOnOffset(appbarlayout, i);
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokestatic    #236 <Method View getAppBarChildOnOffset(AppBarLayout, int)>
	//    7   11:astore          11
		if(view == null) goto _L2; else goto _L1
	//    8   13:aload           11
	//    9   15:ifnull          122
_L1:
		int k;
		boolean flag1;
		k = ((ams)view.getLayoutParams()).getScrollFlags();
	//   10   18:aload           11
	//   11   20:invokevirtual   #148 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   23:checkcast       #150 <Class AppBarLayout$LayoutParams>
	//   13   26:invokevirtual   #157 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
	//   14   29:istore          6
		flag1 = flag3;
	//   15   31:iload           10
	//   16   33:istore          8
		if((k & 1) == 0) goto _L4; else goto _L3
	//   17   35:iload           6
	//   18   37:iconst_1        
	//   19   38:iand            
	//   20   39:ifeq            83
_L3:
		int l = ViewCompat.getMinimumHeight(view);
	//   21   42:aload           11
	//   22   44:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
	//   23   47:istore          7
		if(j <= 0 || (k & 0xc) == 0) goto _L6; else goto _L5
	//   24   49:iload           4
	//   25   51:ifle            129
	//   26   54:iload           6
	//   27   56:bipush          12
	//   28   58:iand            
	//   29   59:ifeq            129
_L5:
		if(-i >= view.getBottom() - l - appbarlayout.getTopInset())
	//*  30   62:iload_3         
	//*  31   63:ineg            
	//*  32   64:aload           11
	//*  33   66:invokevirtual   #141 <Method int View.getBottom()>
	//*  34   69:iload           7
	//*  35   71:isub            
	//*  36   72:aload_2         
	//*  37   73:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
	//*  38   76:isub            
	//*  39   77:icmplt          123
			flag1 = true;
	//   40   80:iconst_1        
	//   41   81:istore          8
		else
	//*  42   83:aload_2         
	//*  43   84:iload           8
	//*  44   86:invokevirtual   #240 <Method boolean AppBarLayout.setCollapsedState(boolean)>
	//*  45   89:istore          8
	//*  46   91:getstatic       #245 <Field int android.os.Build$VERSION.SDK_INT>
	//*  47   94:bipush          11
	//*  48   96:icmplt          122
	//*  49   99:iload           5
	//*  50  101:ifne            118
	//*  51  104:iload           8
	//*  52  106:ifeq            122
	//*  53  109:aload_0         
	//*  54  110:aload_1         
	//*  55  111:aload_2         
	//*  56  112:invokespecial   #247 <Method boolean shouldJumpElevationState(CoordinatorLayout, AppBarLayout)>
	//*  57  115:ifeq            122
	//*  58  118:aload_2         
	//*  59  119:invokevirtual   #250 <Method void AppBarLayout.jumpDrawablesToCurrentState()>
	//*  60  122:return          
			flag1 = false;
	//   61  123:iconst_0        
	//   62  124:istore          8
_L4:
		flag1 = appbarlayout.setCollapsedState(flag1);
		if(android.os.Build.VERSION.SDK_INT >= 11 && (flag || flag1 && shouldJumpElevationState(coordinatorlayout, appbarlayout)))
			appbarlayout.jumpDrawablesToCurrentState();
_L2:
		return;
	//*  63  126:goto            83
_L6:
		flag1 = flag3;
	//   64  129:iload           10
	//   65  131:istore          8
		if((k & 2) != 0)
	//*  66  133:iload           6
	//*  67  135:iconst_2        
	//*  68  136:iand            
	//*  69  137:ifeq            83
			if(-i >= view.getBottom() - l - appbarlayout.getTopInset())
	//*  70  140:iload_3         
	//*  71  141:ineg            
	//*  72  142:aload           11
	//*  73  144:invokevirtual   #141 <Method int View.getBottom()>
	//*  74  147:iload           7
	//*  75  149:isub            
	//*  76  150:aload_2         
	//*  77  151:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
	//*  78  154:isub            
	//*  79  155:icmplt          165
				flag1 = flag2;
	//   80  158:iload           9
	//   81  160:istore          8
			else
	//*  82  162:goto            83
				flag1 = false;
	//   83  165:iconst_0        
	//   84  166:istore          8
		if(true) goto _L4; else goto _L7
	//   85  168:goto            162
_L7:
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
		int j;
		boolean flag;
		flag = super.onLayoutChild(coordinatorlayout, ((View) (appbarlayout)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #304 <Method boolean HeaderBehavior.onLayoutChild(CoordinatorLayout, View, int)>
	//    5    7:istore          5
		j = appbarlayout.getPendingAction();
	//    6    9:aload_2         
	//    7   10:invokevirtual   #307 <Method int AppBarLayout.getPendingAction()>
	//    8   13:istore          4
		if(mOffsetToChildIndexOnLayout < 0 || (j & 8) != 0) goto _L2; else goto _L1
	//    9   15:aload_0         
	//   10   16:getfield        #42  <Field int mOffsetToChildIndexOnLayout>
	//   11   19:iflt            145
	//   12   22:iload           4
	//   13   24:bipush          8
	//   14   26:iand            
	//   15   27:ifne            145
_L1:
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
	//*  27   51:ifeq            125
			i = ViewCompat.getMinimumHeight(view) + appbarlayout.getTopInset() + i;
	//   28   54:aload           6
	//   29   56:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
	//   30   59:aload_2         
	//   31   60:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
	//   32   63:iadd            
	//   33   64:iload_3         
	//   34   65:iadd            
	//   35   66:istore_3        
		else
	//*  36   67:aload_0         
	//*  37   68:aload_1         
	//*  38   69:aload_2         
	//*  39   70:iload_3         
	//*  40   71:invokevirtual   #313 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
	//*  41   74:pop             
	//*  42   75:aload_2         
	//*  43   76:invokevirtual   #316 <Method void AppBarLayout.resetPendingAction()>
	//*  44   79:aload_0         
	//*  45   80:iconst_m1       
	//*  46   81:putfield        #42  <Field int mOffsetToChildIndexOnLayout>
	//*  47   84:aload_0         
	//*  48   85:aload_0         
	//*  49   86:invokevirtual   #290 <Method int getTopAndBottomOffset()>
	//*  50   89:aload_2         
	//*  51   90:invokevirtual   #224 <Method int AppBarLayout.getTotalScrollRange()>
	//*  52   93:ineg            
	//*  53   94:iconst_0        
	//*  54   95:invokestatic    #230 <Method int MathUtils.clamp(int, int, int)>
	//*  55   98:invokevirtual   #319 <Method boolean setTopAndBottomOffset(int)>
	//*  56  101:pop             
	//*  57  102:aload_0         
	//*  58  103:aload_1         
	//*  59  104:aload_2         
	//*  60  105:aload_0         
	//*  61  106:invokevirtual   #290 <Method int getTopAndBottomOffset()>
	//*  62  109:iconst_0        
	//*  63  110:iconst_1        
	//*  64  111:invokespecial   #321 <Method void updateAppBarLayoutDrawableState(CoordinatorLayout, AppBarLayout, int, int, boolean)>
	//*  65  114:aload_2         
	//*  66  115:aload_0         
	//*  67  116:invokevirtual   #290 <Method int getTopAndBottomOffset()>
	//*  68  119:invokevirtual   #325 <Method void AppBarLayout.dispatchOffsetUpdates(int)>
	//*  69  122:iload           5
	//*  70  124:ireturn         
			i = Math.round((float)view.getHeight() * mOffsetToChildIndexOnLayoutPerc) + i;
	//   71  125:aload           6
	//   72  127:invokevirtual   #158 <Method int View.getHeight()>
	//   73  130:i2f             
	//   74  131:aload_0         
	//   75  132:getfield        #327 <Field float mOffsetToChildIndexOnLayoutPerc>
	//   76  135:fmul            
	//   77  136:invokestatic    #70  <Method int Math.round(float)>
	//   78  139:iload_3         
	//   79  140:iadd            
	//   80  141:istore_3        
		setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), i);
_L4:
		appbarlayout.resetPendingAction();
		mOffsetToChildIndexOnLayout = -1;
		setTopAndBottomOffset(MathUtils.clamp(getTopAndBottomOffset(), -appbarlayout.getTotalScrollRange(), 0));
		updateAppBarLayoutDrawableState(coordinatorlayout, appbarlayout, getTopAndBottomOffset(), 0, true);
		appbarlayout.dispatchOffsetUpdates(getTopAndBottomOffset());
		return flag;
	//*  81  142:goto            67
_L2:
		if(j != 0)
	//*  82  145:iload           4
	//*  83  147:ifeq            75
		{
			if((j & 4) != 0)
	//*  84  150:iload           4
	//*  85  152:iconst_4        
	//*  86  153:iand            
	//*  87  154:ifeq            189
				i = 1;
	//   88  157:iconst_1        
	//   89  158:istore_3        
			else
	//*  90  159:iload           4
	//*  91  161:iconst_2        
	//*  92  162:iand            
	//*  93  163:ifeq            206
	//*  94  166:aload_2         
	//*  95  167:invokevirtual   #330 <Method int AppBarLayout.getUpNestedPreScrollRange()>
	//*  96  170:ineg            
	//*  97  171:istore          4
	//*  98  173:iload_3         
	//*  99  174:ifeq            194
	//* 100  177:aload_0         
	//* 101  178:aload_1         
	//* 102  179:aload_2         
	//* 103  180:iload           4
	//* 104  182:fconst_0        
	//* 105  183:invokespecial   #232 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
	//* 106  186:goto            75
				i = 0;
	//  107  189:iconst_0        
	//  108  190:istore_3        
			if((j & 2) != 0)
			{
				j = -appbarlayout.getUpNestedPreScrollRange();
				if(i != 0)
					animateOffsetTo(coordinatorlayout, appbarlayout, j, 0.0F);
				else
	//* 109  191:goto            159
					setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), j);
	//  110  194:aload_0         
	//  111  195:aload_1         
	//  112  196:aload_2         
	//  113  197:iload           4
	//  114  199:invokevirtual   #313 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
	//  115  202:pop             
			} else
	//* 116  203:goto            75
			if((j & 1) != 0)
	//* 117  206:iload           4
	//* 118  208:iconst_1        
	//* 119  209:iand            
	//* 120  210:ifeq            75
				if(i != 0)
	//* 121  213:iload_3         
	//* 122  214:ifeq            228
					animateOffsetTo(coordinatorlayout, appbarlayout, 0, 0.0F);
	//  123  217:aload_0         
	//  124  218:aload_1         
	//  125  219:aload_2         
	//  126  220:iconst_0        
	//  127  221:fconst_0        
	//  128  222:invokespecial   #232 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
				else
	//* 129  225:goto            75
					setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), 0);
	//  130  228:aload_0         
	//  131  229:aload_1         
	//  132  230:aload_2         
	//  133  231:iconst_0        
	//  134  232:invokevirtual   #313 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
	//  135  235:pop             
		}
		if(true) goto _L4; else goto _L3
	//  136  236:goto            75
_L3:
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
	//*   1    2:ifeq            49
		{
			if(j < 0)
	//*   2    5:iload           5
	//*   3    7:ifge            50
			{
				i = -appbarlayout.getTotalScrollRange();
	//    4   10:aload_2         
	//    5   11:invokevirtual   #224 <Method int AppBarLayout.getTotalScrollRange()>
	//    6   14:ineg            
	//    7   15:istore          4
				k = i + appbarlayout.getDownNestedPreScrollRange();
	//    8   17:iload           4
	//    9   19:aload_2         
	//   10   20:invokevirtual   #356 <Method int AppBarLayout.getDownNestedPreScrollRange()>
	//   11   23:iadd            
	//   12   24:istore          7
			} else
	//*  13   26:iload           4
	//*  14   28:iload           7
	//*  15   30:icmpeq          49
	//*  16   33:aload           6
	//*  17   35:iconst_1        
	//*  18   36:aload_0         
	//*  19   37:aload_1         
	//*  20   38:aload_2         
	//*  21   39:iload           5
	//*  22   41:iload           4
	//*  23   43:iload           7
	//*  24   45:invokevirtual   #360 <Method int scroll(CoordinatorLayout, View, int, int, int)>
	//*  25   48:iastore         
	//*  26   49:return          
			{
				i = -appbarlayout.getUpNestedPreScrollRange();
	//   27   50:aload_2         
	//   28   51:invokevirtual   #330 <Method int AppBarLayout.getUpNestedPreScrollRange()>
	//   29   54:ineg            
	//   30   55:istore          4
				k = 0;
	//   31   57:iconst_0        
	//   32   58:istore          7
			}
			if(i != k)
				ai[1] = scroll(coordinatorlayout, ((View) (appbarlayout)), j, i, k);
		}
	//*  33   60:goto            26
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
	//   19   35:putfield        #327 <Field float mOffsetToChildIndexOnLayoutPerc>
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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		Object obj = ((Object) (super.onSaveInstanceState(coordinatorlayout, ((View) (appbarlayout)))));
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:aload_2         
	//    5    6:invokespecial   #393 <Method Parcelable HeaderBehavior.onSaveInstanceState(CoordinatorLayout, View)>
	//    6    9:astore          8
		int j = getTopAndBottomOffset();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #290 <Method int getTopAndBottomOffset()>
	//    9   15:istore          4
		int k = appbarlayout.getChildCount();
	//   10   17:aload_2         
	//   11   18:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
	//   12   21:istore          5
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
	//*   3    4:ifeq            60
	//*   4    7:aload_2         
	//*   5    8:invokevirtual   #403 <Method boolean AppBarLayout.hasScrollableChildren()>
	//*   6   11:ifeq            60
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #404 <Method int CoordinatorLayout.getHeight()>
	//*   9   18:aload_3         
	//*  10   19:invokevirtual   #158 <Method int View.getHeight()>
	//*  11   22:isub            
	//*  12   23:aload_2         
	//*  13   24:invokevirtual   #77  <Method int AppBarLayout.getHeight()>
	//*  14   27:icmpgt          60
			flag = true;
	//   15   30:iconst_1        
	//   16   31:istore          7
		else
	//*  17   33:iload           7
	//*  18   35:ifeq            52
	//*  19   38:aload_0         
	//*  20   39:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//*  21   42:ifnull          52
	//*  22   45:aload_0         
	//*  23   46:getfield        #80  <Field ValueAnimator mOffsetAnimator>
	//*  24   49:invokevirtual   #89  <Method void ValueAnimator.cancel()>
	//*  25   52:aload_0         
	//*  26   53:aconst_null     
	//*  27   54:putfield        #259 <Field WeakReference mLastNestedScrollingChildRef>
	//*  28   57:iload           7
	//*  29   59:ireturn         
			flag = false;
	//   30   60:iconst_0        
	//   31   61:istore          7
		if(flag && mOffsetAnimator != null)
			mOffsetAnimator.cancel();
		mLastNestedScrollingChildRef = null;
		return flag;
	//*  32   63:goto            33
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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		int l = getTopBottomOffsetForScrollingSibling();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #56  <Method int getTopBottomOffsetForScrollingSibling()>
	//    4    7:istore          7
		if(j != 0 && l >= j && l <= k)
	//*   5    9:iload           4
	//*   6   11:ifeq            141
	//*   7   14:iload           7
	//*   8   16:iload           4
	//*   9   18:icmplt          141
	//*  10   21:iload           7
	//*  11   23:iload           5
	//*  12   25:icmpgt          141
		{
			j = MathUtils.clamp(i, j, k);
	//   13   28:iload_3         
	//   14   29:iload           4
	//   15   31:iload           5
	//   16   33:invokestatic    #230 <Method int MathUtils.clamp(int, int, int)>
	//   17   36:istore          4
			i = ((int) (flag));
	//   18   38:iload           6
	//   19   40:istore_3        
			if(l != j)
	//*  20   41:iload           7
	//*  21   43:iload           4
	//*  22   45:icmpeq          128
			{
				boolean flag1;
				if(appbarlayout.hasChildWithInterpolator())
	//*  23   48:aload_2         
	//*  24   49:invokevirtual   #423 <Method boolean AppBarLayout.hasChildWithInterpolator()>
	//*  25   52:ifeq            130
					i = interpolateOffset(appbarlayout, j);
	//   26   55:aload_0         
	//   27   56:aload_2         
	//   28   57:iload           4
	//   29   59:invokespecial   #425 <Method int interpolateOffset(AppBarLayout, int)>
	//   30   62:istore_3        
				else
	//*  31   63:aload_0         
	//*  32   64:iload_3         
	//*  33   65:invokevirtual   #319 <Method boolean setTopAndBottomOffset(int)>
	//*  34   68:istore          8
	//*  35   70:aload_0         
	//*  36   71:iload           4
	//*  37   73:iload_3         
	//*  38   74:isub            
	//*  39   75:putfield        #50  <Field int mOffsetDelta>
	//*  40   78:iload           8
	//*  41   80:ifne            95
	//*  42   83:aload_2         
	//*  43   84:invokevirtual   #423 <Method boolean AppBarLayout.hasChildWithInterpolator()>
	//*  44   87:ifeq            95
	//*  45   90:aload_1         
	//*  46   91:aload_2         
	//*  47   92:invokevirtual   #429 <Method void CoordinatorLayout.dispatchDependentViewsChanged(View)>
	//*  48   95:aload_2         
	//*  49   96:aload_0         
	//*  50   97:invokevirtual   #290 <Method int getTopAndBottomOffset()>
	//*  51  100:invokevirtual   #325 <Method void AppBarLayout.dispatchOffsetUpdates(int)>
	//*  52  103:iload           4
	//*  53  105:iload           7
	//*  54  107:icmpge          136
	//*  55  110:iconst_m1       
	//*  56  111:istore_3        
	//*  57  112:aload_0         
	//*  58  113:aload_1         
	//*  59  114:aload_2         
	//*  60  115:iload           4
	//*  61  117:iload_3         
	//*  62  118:iconst_0        
	//*  63  119:invokespecial   #321 <Method void updateAppBarLayoutDrawableState(CoordinatorLayout, AppBarLayout, int, int, boolean)>
	//*  64  122:iload           7
	//*  65  124:iload           4
	//*  66  126:isub            
	//*  67  127:istore_3        
	//*  68  128:iload_3         
	//*  69  129:ireturn         
					i = j;
	//   70  130:iload           4
	//   71  132:istore_3        
				flag1 = setTopAndBottomOffset(i);
				mOffsetDelta = j - i;
				if(!flag1 && appbarlayout.hasChildWithInterpolator())
					coordinatorlayout.dispatchDependentViewsChanged(((View) (appbarlayout)));
				appbarlayout.dispatchOffsetUpdates(getTopAndBottomOffset());
				if(j < l)
					i = -1;
				else
	//*  72  133:goto            63
					i = 1;
	//   73  136:iconst_1        
	//   74  137:istore_3        
				updateAppBarLayoutDrawableState(coordinatorlayout, appbarlayout, j, i, false);
				i = l - j;
			}
			return i;
		} else
	//*  75  138:goto            112
		{
			mOffsetDelta = 0;
	//   76  141:aload_0         
	//   77  142:iconst_0        
	//   78  143:putfield        #50  <Field int mOffsetDelta>
			return 0;
	//   79  146:iconst_0        
	//   80  147:ireturn         
		}
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
