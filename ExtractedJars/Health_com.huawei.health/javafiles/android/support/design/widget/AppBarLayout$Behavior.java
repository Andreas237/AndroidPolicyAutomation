// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.List;
import o.*;

// Referenced classes of package android.support.design.widget:
//			AppBarLayout, CoordinatorLayout

public static class AppBarLayout$Behavior extends s
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
		//    3    3:invokespecial   #65  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(firstVisibleChildIndex);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #46  <Field int firstVisibleChildIndex>
		//    7   11:invokevirtual   #69  <Method void Parcel.writeInt(int)>
			parcel.writeFloat(firstVisibleChildPercentageShown);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #52  <Field float firstVisibleChildPercentageShown>
		//   11   19:invokevirtual   #73  <Method void Parcel.writeFloat(float)>
			if(firstVisibleChildAtMinimumHeight)
		//*  12   22:aload_0         
		//*  13   23:getfield        #58  <Field boolean firstVisibleChildAtMinimumHeight>
		//*  14   26:ifeq            34
				i = 1;
		//   15   29:iconst_1        
		//   16   30:istore_2        
			else
		//*  17   31:goto            36
				i = 0;
		//   18   34:iconst_0        
		//   19   35:istore_2        
			parcel.writeByte((byte)i);
		//   20   36:aload_1         
		//   21   37:iload_2         
		//   22   38:int2byte        
		//   23   39:invokevirtual   #77  <Method void Parcel.writeByte(byte)>
		//   24   42:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

			public SavedState b(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class AppBarLayout$Behavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #25  <Method void AppBarLayout$Behavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState[] c(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (b(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #31  <Method AppBarLayout$Behavior$SavedState b(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (c(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #35  <Method AppBarLayout$Behavior$SavedState[] c(int)>
			//    3    5:areturn         
			}

		}
);
		boolean firstVisibleChildAtMinimumHeight;
		int firstVisibleChildIndex;
		float firstVisibleChildPercentageShown;

		static 
		{
		//    0    0:new             #12  <Class AppBarLayout$Behavior$SavedState$4>
		//    1    3:dup             
		//    2    4:invokespecial   #26  <Method void AppBarLayout$Behavior$SavedState$4()>
		//    3    7:invokestatic    #32  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
		//    4   10:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
		//*   5   13:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #38  <Method void AbsSavedState(Parcel, ClassLoader)>
			firstVisibleChildIndex = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #44  <Method int Parcel.readInt()>
		//    7   11:putfield        #46  <Field int firstVisibleChildIndex>
			firstVisibleChildPercentageShown = parcel.readFloat();
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokevirtual   #50  <Method float Parcel.readFloat()>
		//   11   19:putfield        #52  <Field float firstVisibleChildPercentageShown>
			boolean flag;
			if(parcel.readByte() != 0)
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #56  <Method byte Parcel.readByte()>
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
		//   22   38:putfield        #58  <Field boolean firstVisibleChildAtMinimumHeight>
		//   23   41:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #61  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}


	private void animateOffsetTo(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, float f)
	{
		int j = Math.abs(getTopBottomOffsetForScrollingSibling() - i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method int getTopBottomOffsetForScrollingSibling()>
	//    2    4:iload_3         
	//    3    5:isub            
	//    4    6:invokestatic    #64  <Method int Math.abs(int)>
	//    5    9:istore          5
		f = Math.abs(f);
	//    6   11:fload           4
	//    7   13:invokestatic    #67  <Method float Math.abs(float)>
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
	//   17   31:ldc1            #68  <Float 1000F>
	//   18   33:fmul            
	//   19   34:invokestatic    #72  <Method int Math.round(float)>
	//   20   37:iconst_3        
	//   21   38:imul            
	//   22   39:istore          5
		else
	//*  23   41:goto            61
			j = (int)((1.0F + (float)j / (float)appbarlayout.getHeight()) * 150F);
	//   24   44:fconst_1        
	//   25   45:iload           5
	//   26   47:i2f             
	//   27   48:aload_2         
	//   28   49:invokevirtual   #75  <Method int AppBarLayout.getHeight()>
	//   29   52:i2f             
	//   30   53:fdiv            
	//   31   54:fadd            
	//   32   55:ldc1            #76  <Float 150F>
	//   33   57:fmul            
	//   34   58:f2i             
	//   35   59:istore          5
		animateOffsetWithDuration(coordinatorlayout, appbarlayout, i, j);
	//   36   61:aload_0         
	//   37   62:aload_1         
	//   38   63:aload_2         
	//   39   64:iload_3         
	//   40   65:iload           5
	//   41   67:invokespecial   #80  <Method void animateOffsetWithDuration(CoordinatorLayout, AppBarLayout, int, int)>
	//   42   70:return          
	}

	private void animateOffsetWithDuration(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j)
	{
		int k = getTopBottomOffsetForScrollingSibling();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method int getTopBottomOffsetForScrollingSibling()>
	//    2    4:istore          5
		if(k == i)
	//*   3    6:iload           5
	//*   4    8:iload_3         
	//*   5    9:icmpne          37
		{
			if(mOffsetAnimator != null && mOffsetAnimator.isRunning())
	//*   6   12:aload_0         
	//*   7   13:getfield        #82  <Field ValueAnimator mOffsetAnimator>
	//*   8   16:ifnull          36
	//*   9   19:aload_0         
	//*  10   20:getfield        #82  <Field ValueAnimator mOffsetAnimator>
	//*  11   23:invokevirtual   #88  <Method boolean ValueAnimator.isRunning()>
	//*  12   26:ifeq            36
				mOffsetAnimator.cancel();
	//   13   29:aload_0         
	//   14   30:getfield        #82  <Field ValueAnimator mOffsetAnimator>
	//   15   33:invokevirtual   #91  <Method void ValueAnimator.cancel()>
			return;
	//   16   36:return          
		}
		if(mOffsetAnimator == null)
	//*  17   37:aload_0         
	//*  18   38:getfield        #82  <Field ValueAnimator mOffsetAnimator>
	//*  19   41:ifnonnull       85
		{
			mOffsetAnimator = new ValueAnimator();
	//   20   44:aload_0         
	//   21   45:new             #84  <Class ValueAnimator>
	//   22   48:dup             
	//   23   49:invokespecial   #92  <Method void ValueAnimator()>
	//   24   52:putfield        #82  <Field ValueAnimator mOffsetAnimator>
			mOffsetAnimator.setInterpolator(((android.animation.TimeInterpolator) (p.d)));
	//   25   55:aload_0         
	//   26   56:getfield        #82  <Field ValueAnimator mOffsetAnimator>
	//   27   59:getstatic       #98  <Field Interpolator p.d>
	//   28   62:invokevirtual   #102 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			mOffsetAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(coordinatorlayout, appbarlayout) {

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					b.setHeaderTopBottomOffset(a, ((View) (d)), ((Integer)valueanimator.getAnimatedValue()).intValue());
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field AppBarLayout$Behavior b>
				//    2    4:aload_0         
				//    3    5:getfield        #26  <Field CoordinatorLayout a>
				//    4    8:aload_0         
				//    5    9:getfield        #28  <Field AppBarLayout d>
				//    6   12:aload_1         
				//    7   13:invokevirtual   #40  <Method Object ValueAnimator.getAnimatedValue()>
				//    8   16:checkcast       #42  <Class Integer>
				//    9   19:invokevirtual   #46  <Method int Integer.intValue()>
				//   10   22:invokevirtual   #50  <Method int AppBarLayout$Behavior.setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
				//   11   25:pop             
				//   12   26:return          
				}

				final CoordinatorLayout a;
				final AppBarLayout.Behavior b;
				final AppBarLayout d;

			
			{
				b = AppBarLayout.Behavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field AppBarLayout$Behavior b>
				a = coordinatorlayout;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field CoordinatorLayout a>
				d = appbarlayout;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field AppBarLayout d>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   29   65:aload_0         
	//   30   66:getfield        #82  <Field ValueAnimator mOffsetAnimator>
	//   31   69:new             #10  <Class AppBarLayout$Behavior$5>
	//   32   72:dup             
	//   33   73:aload_0         
	//   34   74:aload_1         
	//   35   75:aload_2         
	//   36   76:invokespecial   #105 <Method void AppBarLayout$Behavior$5(AppBarLayout$Behavior, CoordinatorLayout, AppBarLayout)>
	//   37   79:invokevirtual   #109 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		} else
	//*  38   82:goto            92
		{
			mOffsetAnimator.cancel();
	//   39   85:aload_0         
	//   40   86:getfield        #82  <Field ValueAnimator mOffsetAnimator>
	//   41   89:invokevirtual   #91  <Method void ValueAnimator.cancel()>
		}
		mOffsetAnimator.setDuration(Math.min(j, 600));
	//   42   92:aload_0         
	//   43   93:getfield        #82  <Field ValueAnimator mOffsetAnimator>
	//   44   96:iload           4
	//   45   98:sipush          600
	//   46  101:invokestatic    #113 <Method int Math.min(int, int)>
	//   47  104:i2l             
	//   48  105:invokevirtual   #117 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   49  108:pop             
		mOffsetAnimator.setIntValues(new int[] {
			k, i
		});
	//   50  109:aload_0         
	//   51  110:getfield        #82  <Field ValueAnimator mOffsetAnimator>
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
	//   62  125:invokevirtual   #121 <Method void ValueAnimator.setIntValues(int[])>
		mOffsetAnimator.start();
	//   63  128:aload_0         
	//   64  129:getfield        #82  <Field ValueAnimator mOffsetAnimator>
	//   65  132:invokevirtual   #124 <Method void ValueAnimator.start()>
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
	//    1    1:invokestatic    #64  <Method int Math.abs(int)>
	//    2    4:istore_2        
		i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		for(int k = appbarlayout.getChildCount(); i < k; i++)
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #131 <Method int AppBarLayout.getChildCount()>
	//*   7   11:istore_3        
	//*   8   12:iload_1         
	//*   9   13:iload_3         
	//*  10   14:icmpge          52
		{
			View view = appbarlayout.getChildAt(i);
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:invokevirtual   #135 <Method View AppBarLayout.getChildAt(int)>
	//   14   22:astore          4
			if(j >= view.getTop() && j <= view.getBottom())
	//*  15   24:iload_2         
	//*  16   25:aload           4
	//*  17   27:invokevirtual   #140 <Method int View.getTop()>
	//*  18   30:icmplt          45
	//*  19   33:iload_2         
	//*  20   34:aload           4
	//*  21   36:invokevirtual   #143 <Method int View.getBottom()>
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
	//*   3    3:invokevirtual   #131 <Method int AppBarLayout.getChildCount()>
	//*   4    6:istore          4
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          50
		{
			View view = appbarlayout.getChildAt(j);
	//    8   14:aload_1         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #135 <Method View AppBarLayout.getChildAt(int)>
	//   11   19:astore          5
			if(view.getTop() <= -i && view.getBottom() >= -i)
	//*  12   21:aload           5
	//*  13   23:invokevirtual   #140 <Method int View.getTop()>
	//*  14   26:iload_2         
	//*  15   27:ineg            
	//*  16   28:icmpgt          43
	//*  17   31:aload           5
	//*  18   33:invokevirtual   #143 <Method int View.getBottom()>
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
		int j1 = Math.abs(i);
	//    0    0:iload_2         
	//    1    1:invokestatic    #64  <Method int Math.abs(int)>
	//    2    4:istore          5
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int k = appbarlayout.getChildCount();
	//    5    8:aload_1         
	//    6    9:invokevirtual   #131 <Method int AppBarLayout.getChildCount()>
	//    7   12:istore          4
		do
		{
			if(j >= k)
				break;
	//    8   14:iload_3         
	//    9   15:iload           4
	//   10   17:icmpge          201
			View view = appbarlayout.getChildAt(j);
	//   11   20:aload_1         
	//   12   21:iload_3         
	//   13   22:invokevirtual   #135 <Method View AppBarLayout.getChildAt(int)>
	//   14   25:astore          7
			ams ams = (ams)view.getLayoutParams();
	//   15   27:aload           7
	//   16   29:invokevirtual   #150 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   17   32:checkcast       #152 <Class AppBarLayout$LayoutParams>
	//   18   35:astore          8
			Interpolator interpolator = ams.getScrollInterpolator();
	//   19   37:aload           8
	//   20   39:invokevirtual   #156 <Method Interpolator AppBarLayout$LayoutParams.getScrollInterpolator()>
	//   21   42:astore          9
			if(j1 >= view.getTop() && j1 <= view.getBottom())
	//*  22   44:iload           5
	//*  23   46:aload           7
	//*  24   48:invokevirtual   #140 <Method int View.getTop()>
	//*  25   51:icmplt          194
	//*  26   54:iload           5
	//*  27   56:aload           7
	//*  28   58:invokevirtual   #143 <Method int View.getBottom()>
	//*  29   61:icmpgt          194
			{
				if(interpolator != null)
	//*  30   64:aload           9
	//*  31   66:ifnull          201
				{
					j = 0;
	//   32   69:iconst_0        
	//   33   70:istore_3        
					int k1 = ams.getScrollFlags();
	//   34   71:aload           8
	//   35   73:invokevirtual   #159 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
	//   36   76:istore          6
					if((k1 & 1) != 0)
	//*  37   78:iload           6
	//*  38   80:iconst_1        
	//*  39   81:iand            
	//*  40   82:ifeq            125
					{
						int l = view.getHeight() + ams.topMargin + ams.bottomMargin + 0;
	//   41   85:aload           7
	//   42   87:invokevirtual   #160 <Method int View.getHeight()>
	//   43   90:aload           8
	//   44   92:getfield        #163 <Field int AppBarLayout$LayoutParams.topMargin>
	//   45   95:iadd            
	//   46   96:aload           8
	//   47   98:getfield        #166 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   48  101:iadd            
	//   49  102:iconst_0        
	//   50  103:iadd            
	//   51  104:istore          4
						j = l;
	//   52  106:iload           4
	//   53  108:istore_3        
						if((k1 & 2) != 0)
	//*  54  109:iload           6
	//*  55  111:iconst_2        
	//*  56  112:iand            
	//*  57  113:ifeq            125
							j = l - ViewCompat.getMinimumHeight(view);
	//   58  116:iload           4
	//   59  118:aload           7
	//   60  120:invokestatic    #172 <Method int ViewCompat.getMinimumHeight(View)>
	//   61  123:isub            
	//   62  124:istore_3        
					}
					int i1 = j;
	//   63  125:iload_3         
	//   64  126:istore          4
					if(ViewCompat.getFitsSystemWindows(view))
	//*  65  128:aload           7
	//*  66  130:invokestatic    #176 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  67  133:ifeq            144
						i1 = j - appbarlayout.getTopInset();
	//   68  136:iload_3         
	//   69  137:aload_1         
	//   70  138:invokevirtual   #179 <Method int AppBarLayout.getTopInset()>
	//   71  141:isub            
	//   72  142:istore          4
					if(i1 > 0)
	//*  73  144:iload           4
	//*  74  146:ifle            192
					{
						j = view.getTop();
	//   75  149:aload           7
	//   76  151:invokevirtual   #140 <Method int View.getTop()>
	//   77  154:istore_3        
						j = Math.round((float)i1 * interpolator.getInterpolation((float)(j1 - j) / (float)i1));
	//   78  155:iload           4
	//   79  157:i2f             
	//   80  158:aload           9
	//   81  160:iload           5
	//   82  162:iload_3         
	//   83  163:isub            
	//   84  164:i2f             
	//   85  165:iload           4
	//   86  167:i2f             
	//   87  168:fdiv            
	//   88  169:invokeinterface #184 <Method float Interpolator.getInterpolation(float)>
	//   89  174:fmul            
	//   90  175:invokestatic    #72  <Method int Math.round(float)>
	//   91  178:istore_3        
						return Integer.signum(i) * (view.getTop() + j);
	//   92  179:iload_2         
	//   93  180:invokestatic    #189 <Method int Integer.signum(int)>
	//   94  183:aload           7
	//   95  185:invokevirtual   #140 <Method int View.getTop()>
	//   96  188:iload_3         
	//   97  189:iadd            
	//   98  190:imul            
	//   99  191:ireturn         
					} else
					{
						return i;
	//  100  192:iload_2         
	//  101  193:ireturn         
					}
				}
				break;
			}
			j++;
	//  102  194:iload_3         
	//  103  195:iconst_1        
	//  104  196:iadd            
	//  105  197:istore_3        
		} while(true);
	//  106  198:goto            14
		return i;
	//  107  201:iload_2         
	//  108  202:ireturn         
	}

	private boolean shouldJumpElevationState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
	{
		coordinatorlayout = ((CoordinatorLayout) (coordinatorlayout.getDependents(((View) (appbarlayout)))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #197 <Method List CoordinatorLayout.getDependents(View)>
	//    3    5:astore_1        
		int i = 0;
	//    4    6:iconst_0        
	//    5    7:istore_3        
		for(int j = ((List) (coordinatorlayout)).size(); i < j; i++)
	//*   6    8:aload_1         
	//*   7    9:invokeinterface #202 <Method int List.size()>
	//*   8   14:istore          4
	//*   9   16:iload_3         
	//*  10   17:iload           4
	//*  11   19:icmpge          70
		{
			appbarlayout = ((AppBarLayout) (((utParams)((View)((List) (coordinatorlayout)).get(i)).getLayoutParams()).getBehavior()));
	//   12   22:aload_1         
	//   13   23:iload_3         
	//   14   24:invokeinterface #206 <Method Object List.get(int)>
	//   15   29:checkcast       #137 <Class View>
	//   16   32:invokevirtual   #150 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   17   35:checkcast       #208 <Class CoordinatorLayout$LayoutParams>
	//   18   38:invokevirtual   #212 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   19   41:astore_2        
			if(appbarlayout instanceof ViewBehavior)
	//*  20   42:aload_2         
	//*  21   43:instanceof      #214 <Class AppBarLayout$ScrollingViewBehavior>
	//*  22   46:ifeq            63
				return ((ViewBehavior)appbarlayout).getOverlayTop() != 0;
	//   23   49:aload_2         
	//   24   50:checkcast       #214 <Class AppBarLayout$ScrollingViewBehavior>
	//   25   53:invokevirtual   #217 <Method int AppBarLayout$ScrollingViewBehavior.getOverlayTop()>
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
		int i1 = getTopBottomOffsetForScrollingSibling();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method int getTopBottomOffsetForScrollingSibling()>
	//    2    4:istore          7
		int k = getChildIndexOnOffset(appbarlayout, i1);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:iload           7
	//    6   10:invokespecial   #221 <Method int getChildIndexOnOffset(AppBarLayout, int)>
	//    7   13:istore          5
		if(k >= 0)
	//*   8   15:iload           5
	//*   9   17:iflt            191
		{
			View view = appbarlayout.getChildAt(k);
	//   10   20:aload_2         
	//   11   21:iload           5
	//   12   23:invokevirtual   #135 <Method View AppBarLayout.getChildAt(int)>
	//   13   26:astore          9
			int j1 = ((ams)view.getLayoutParams()).getScrollFlags();
	//   14   28:aload           9
	//   15   30:invokevirtual   #150 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   33:checkcast       #152 <Class AppBarLayout$LayoutParams>
	//   17   36:invokevirtual   #159 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
	//   18   39:istore          8
			if((j1 & 0x11) == 17)
	//*  19   41:iload           8
	//*  20   43:bipush          17
	//*  21   45:iand            
	//*  22   46:bipush          17
	//*  23   48:icmpne          191
			{
				int l = -view.getTop();
	//   24   51:aload           9
	//   25   53:invokevirtual   #140 <Method int View.getTop()>
	//   26   56:ineg            
	//   27   57:istore          6
				int i = -view.getBottom();
	//   28   59:aload           9
	//   29   61:invokevirtual   #143 <Method int View.getBottom()>
	//   30   64:ineg            
	//   31   65:istore_3        
				int j = i;
	//   32   66:iload_3         
	//   33   67:istore          4
				if(k == appbarlayout.getChildCount() - 1)
	//*  34   69:iload           5
	//*  35   71:aload_2         
	//*  36   72:invokevirtual   #131 <Method int AppBarLayout.getChildCount()>
	//*  37   75:iconst_1        
	//*  38   76:isub            
	//*  39   77:icmpne          88
					j = i + appbarlayout.getTopInset();
	//   40   80:iload_3         
	//   41   81:aload_2         
	//   42   82:invokevirtual   #179 <Method int AppBarLayout.getTopInset()>
	//   43   85:iadd            
	//   44   86:istore          4
				if(checkFlag(j1, 2))
	//*  45   88:iload           8
	//*  46   90:iconst_2        
	//*  47   91:invokestatic    #223 <Method boolean checkFlag(int, int)>
	//*  48   94:ifeq            113
				{
					i = j + ViewCompat.getMinimumHeight(view);
	//   49   97:iload           4
	//   50   99:aload           9
	//   51  101:invokestatic    #172 <Method int ViewCompat.getMinimumHeight(View)>
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
	//*  63  123:invokestatic    #223 <Method boolean checkFlag(int, int)>
	//*  64  126:ifeq            157
					{
						i = j + ViewCompat.getMinimumHeight(view);
	//   65  129:iload           4
	//   66  131:aload           9
	//   67  133:invokestatic    #172 <Method int ViewCompat.getMinimumHeight(View)>
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
				if(i1 >= (i + k) / 2)
	//*  80  157:iload           7
	//*  81  159:iload_3         
	//*  82  160:iload           5
	//*  83  162:iadd            
	//*  84  163:iconst_2        
	//*  85  164:idiv            
	//*  86  165:icmpge          171
	//*  87  168:goto            174
					i = k;
	//   88  171:iload           5
	//   89  173:istore_3        
				animateOffsetTo(coordinatorlayout, appbarlayout, w.b(i, -appbarlayout.getTotalScrollRange(), 0), 0.0F);
	//   90  174:aload_0         
	//   91  175:aload_1         
	//   92  176:aload_2         
	//   93  177:iload_3         
	//   94  178:aload_2         
	//   95  179:invokevirtual   #226 <Method int AppBarLayout.getTotalScrollRange()>
	//   96  182:ineg            
	//   97  183:iconst_0        
	//   98  184:invokestatic    #232 <Method int w.b(int, int, int)>
	//   99  187:fconst_0        
	//  100  188:invokespecial   #234 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
			}
		}
	//  101  191:return          
	}

	private void updateAppBarLayoutDrawableState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, boolean flag)
	{
		View view = getAppBarChildOnOffset(appbarlayout, i);
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokestatic    #238 <Method View getAppBarChildOnOffset(AppBarLayout, int)>
	//    3    5:astore          10
		if(view != null)
	//*   4    7:aload           10
	//*   5    9:ifnull          166
		{
			int k = ((ams)view.getLayoutParams()).getScrollFlags();
	//    6   12:aload           10
	//    7   14:invokevirtual   #150 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    8   17:checkcast       #152 <Class AppBarLayout$LayoutParams>
	//    9   20:invokevirtual   #159 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
	//   10   23:istore          6
			boolean flag2 = false;
	//   11   25:iconst_0        
	//   12   26:istore          9
			boolean flag1 = flag2;
	//   13   28:iload           9
	//   14   30:istore          8
			if((k & 1) != 0)
	//*  15   32:iload           6
	//*  16   34:iconst_1        
	//*  17   35:iand            
	//*  18   36:ifeq            127
			{
				int l = ViewCompat.getMinimumHeight(view);
	//   19   39:aload           10
	//   20   41:invokestatic    #172 <Method int ViewCompat.getMinimumHeight(View)>
	//   21   44:istore          7
				if(j > 0 && (k & 0xc) != 0)
	//*  22   46:iload           4
	//*  23   48:ifle            89
	//*  24   51:iload           6
	//*  25   53:bipush          12
	//*  26   55:iand            
	//*  27   56:ifeq            89
				{
					if(-i >= view.getBottom() - l - appbarlayout.getTopInset())
	//*  28   59:iload_3         
	//*  29   60:ineg            
	//*  30   61:aload           10
	//*  31   63:invokevirtual   #143 <Method int View.getBottom()>
	//*  32   66:iload           7
	//*  33   68:isub            
	//*  34   69:aload_2         
	//*  35   70:invokevirtual   #179 <Method int AppBarLayout.getTopInset()>
	//*  36   73:isub            
	//*  37   74:icmplt          83
						flag1 = true;
	//   38   77:iconst_1        
	//   39   78:istore          8
					else
	//*  40   80:goto            86
						flag1 = false;
	//   41   83:iconst_0        
	//   42   84:istore          8
				} else
	//*  43   86:goto            127
				{
					flag1 = flag2;
	//   44   89:iload           9
	//   45   91:istore          8
					if((k & 2) != 0)
	//*  46   93:iload           6
	//*  47   95:iconst_2        
	//*  48   96:iand            
	//*  49   97:ifeq            127
						if(-i >= view.getBottom() - l - appbarlayout.getTopInset())
	//*  50  100:iload_3         
	//*  51  101:ineg            
	//*  52  102:aload           10
	//*  53  104:invokevirtual   #143 <Method int View.getBottom()>
	//*  54  107:iload           7
	//*  55  109:isub            
	//*  56  110:aload_2         
	//*  57  111:invokevirtual   #179 <Method int AppBarLayout.getTopInset()>
	//*  58  114:isub            
	//*  59  115:icmplt          124
							flag1 = true;
	//   60  118:iconst_1        
	//   61  119:istore          8
						else
	//*  62  121:goto            127
							flag1 = false;
	//   63  124:iconst_0        
	//   64  125:istore          8
				}
			}
			flag1 = appbarlayout.setCollapsedState(flag1);
	//   65  127:aload_2         
	//   66  128:iload           8
	//   67  130:invokevirtual   #242 <Method boolean AppBarLayout.setCollapsedState(boolean)>
	//   68  133:istore          8
			if(android.os.Build.VERSION.SDK_INT >= 11 && (flag || flag1 && shouldJumpElevationState(coordinatorlayout, appbarlayout)))
	//*  69  135:getstatic       #247 <Field int android.os.Build$VERSION.SDK_INT>
	//*  70  138:bipush          11
	//*  71  140:icmplt          166
	//*  72  143:iload           5
	//*  73  145:ifne            162
	//*  74  148:iload           8
	//*  75  150:ifeq            166
	//*  76  153:aload_0         
	//*  77  154:aload_1         
	//*  78  155:aload_2         
	//*  79  156:invokespecial   #249 <Method boolean shouldJumpElevationState(CoordinatorLayout, AppBarLayout)>
	//*  80  159:ifeq            166
				appbarlayout.jumpDrawablesToCurrentState();
	//   81  162:aload_2         
	//   82  163:invokevirtual   #252 <Method void AppBarLayout.jumpDrawablesToCurrentState()>
		}
	//   83  166:return          
	}

	boolean canDragView(AppBarLayout appbarlayout)
	{
		if(mOnDragCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field AppBarLayout$Behavior$DragCallback mOnDragCallback>
	//*   2    4:ifnull          16
			return mOnDragCallback.canDrag(appbarlayout);
	//    3    7:aload_0         
	//    4    8:getfield        #256 <Field AppBarLayout$Behavior$DragCallback mOnDragCallback>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #259 <Method boolean AppBarLayout$Behavior$DragCallback.canDrag(AppBarLayout)>
	//    7   15:ireturn         
		if(mLastNestedScrollingChildRef != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #261 <Field WeakReference mLastNestedScrollingChildRef>
	//*  10   20:ifnull          57
		{
			appbarlayout = ((AppBarLayout) ((View)mLastNestedScrollingChildRef.get()));
	//   11   23:aload_0         
	//   12   24:getfield        #261 <Field WeakReference mLastNestedScrollingChildRef>
	//   13   27:invokevirtual   #266 <Method Object WeakReference.get()>
	//   14   30:checkcast       #137 <Class View>
	//   15   33:astore_1        
			return appbarlayout != null && ((View) (appbarlayout)).isShown() && !ViewCompat.canScrollVertically(((View) (appbarlayout)), -1);
	//   16   34:aload_1         
	//   17   35:ifnull          55
	//   18   38:aload_1         
	//   19   39:invokevirtual   #269 <Method boolean View.isShown()>
	//   20   42:ifeq            55
	//   21   45:aload_1         
	//   22   46:iconst_m1       
	//   23   47:invokestatic    #273 <Method boolean ViewCompat.canScrollVertically(View, int)>
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

	public volatile boolean canDragView(View view)
	{
		return canDragView((AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class AppBarLayout>
	//    3    5:invokevirtual   #275 <Method boolean canDragView(AppBarLayout)>
	//    4    8:ireturn         
	}

	public volatile int getLeftAndRightOffset()
	{
		return super.getLeftAndRightOffset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #278 <Method int s.getLeftAndRightOffset()>
	//    2    4:ireturn         
	}

	int getMaxDragOffset(AppBarLayout appbarlayout)
	{
		return -appbarlayout.getDownNestedScrollRange();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #283 <Method int AppBarLayout.getDownNestedScrollRange()>
	//    2    4:ineg            
	//    3    5:ireturn         
	}

	public volatile int getMaxDragOffset(View view)
	{
		return getMaxDragOffset((AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class AppBarLayout>
	//    3    5:invokevirtual   #285 <Method int getMaxDragOffset(AppBarLayout)>
	//    4    8:ireturn         
	}

	int getScrollRangeForDragFling(AppBarLayout appbarlayout)
	{
		return appbarlayout.getTotalScrollRange();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #226 <Method int AppBarLayout.getTotalScrollRange()>
	//    2    4:ireturn         
	}

	public volatile int getScrollRangeForDragFling(View view)
	{
		return getScrollRangeForDragFling((AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class AppBarLayout>
	//    3    5:invokevirtual   #288 <Method int getScrollRangeForDragFling(AppBarLayout)>
	//    4    8:ireturn         
	}

	public volatile int getTopAndBottomOffset()
	{
		return super.getTopAndBottomOffset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #291 <Method int s.getTopAndBottomOffset()>
	//    2    4:ireturn         
	}

	public int getTopBottomOffsetForScrollingSibling()
	{
		return getTopAndBottomOffset() + mOffsetDelta;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #292 <Method int getTopAndBottomOffset()>
	//    2    4:aload_0         
	//    3    5:getfield        #52  <Field int mOffsetDelta>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	boolean isOffsetAnimatorRunning()
	{
		return mOffsetAnimator != null && mOffsetAnimator.isRunning();
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field ValueAnimator mOffsetAnimator>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field ValueAnimator mOffsetAnimator>
	//    5   11:invokevirtual   #88  <Method boolean ValueAnimator.isRunning()>
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
	//    3    3:invokespecial   #298 <Method void snapToChildIfNeeded(CoordinatorLayout, AppBarLayout)>
	//    4    6:return          
	}

	public volatile void onFlingFinished(CoordinatorLayout coordinatorlayout, View view)
	{
		onFlingFinished(coordinatorlayout, (AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:invokevirtual   #301 <Method void onFlingFinished(CoordinatorLayout, AppBarLayout)>
	//    5    9:return          
	}

	public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i)
	{
		boolean flag = super.onLayoutChild(coordinatorlayout, ((View) (appbarlayout)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #306 <Method boolean s.onLayoutChild(CoordinatorLayout, View, int)>
	//    5    7:istore          5
		int j = appbarlayout.getPendingAction();
	//    6    9:aload_2         
	//    7   10:invokevirtual   #309 <Method int AppBarLayout.getPendingAction()>
	//    8   13:istore          4
		if(mOffsetToChildIndexOnLayout >= 0 && (j & 8) == 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #44  <Field int mOffsetToChildIndexOnLayout>
	//*  11   19:iflt            98
	//*  12   22:iload           4
	//*  13   24:bipush          8
	//*  14   26:iand            
	//*  15   27:ifne            98
		{
			View view = appbarlayout.getChildAt(mOffsetToChildIndexOnLayout);
	//   16   30:aload_2         
	//   17   31:aload_0         
	//   18   32:getfield        #44  <Field int mOffsetToChildIndexOnLayout>
	//   19   35:invokevirtual   #135 <Method View AppBarLayout.getChildAt(int)>
	//   20   38:astore          6
			i = -view.getBottom();
	//   21   40:aload           6
	//   22   42:invokevirtual   #143 <Method int View.getBottom()>
	//   23   45:ineg            
	//   24   46:istore_3        
			if(mOffsetToChildIndexOnLayoutIsMinHeight)
	//*  25   47:aload_0         
	//*  26   48:getfield        #311 <Field boolean mOffsetToChildIndexOnLayoutIsMinHeight>
	//*  27   51:ifeq            70
				i += ViewCompat.getMinimumHeight(view) + appbarlayout.getTopInset();
	//   28   54:iload_3         
	//   29   55:aload           6
	//   30   57:invokestatic    #172 <Method int ViewCompat.getMinimumHeight(View)>
	//   31   60:aload_2         
	//   32   61:invokevirtual   #179 <Method int AppBarLayout.getTopInset()>
	//   33   64:iadd            
	//   34   65:iadd            
	//   35   66:istore_3        
			else
	//*  36   67:goto            87
				i += Math.round((float)view.getHeight() * mOffsetToChildIndexOnLayoutPerc);
	//   37   70:iload_3         
	//   38   71:aload           6
	//   39   73:invokevirtual   #160 <Method int View.getHeight()>
	//   40   76:i2f             
	//   41   77:aload_0         
	//   42   78:getfield        #313 <Field float mOffsetToChildIndexOnLayoutPerc>
	//   43   81:fmul            
	//   44   82:invokestatic    #72  <Method int Math.round(float)>
	//   45   85:iadd            
	//   46   86:istore_3        
			setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), i);
	//   47   87:aload_0         
	//   48   88:aload_1         
	//   49   89:aload_2         
	//   50   90:iload_3         
	//   51   91:invokevirtual   #317 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
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
	//   70  125:invokevirtual   #320 <Method int AppBarLayout.getUpNestedPreScrollRange()>
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
	//   80  141:invokespecial   #234 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
				else
	//*  81  144:goto            156
					setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), j);
	//   82  147:aload_0         
	//   83  148:aload_1         
	//   84  149:aload_2         
	//   85  150:iload           4
	//   86  152:invokevirtual   #317 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
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
	//  100  175:invokespecial   #234 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
				else
	//* 101  178:goto            189
					setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), 0);
	//  102  181:aload_0         
	//  103  182:aload_1         
	//  104  183:aload_2         
	//  105  184:iconst_0        
	//  106  185:invokevirtual   #317 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
	//  107  188:pop             
		}
		appbarlayout.resetPendingAction();
	//  108  189:aload_2         
	//  109  190:invokevirtual   #323 <Method void AppBarLayout.resetPendingAction()>
		mOffsetToChildIndexOnLayout = -1;
	//  110  193:aload_0         
	//  111  194:iconst_m1       
	//  112  195:putfield        #44  <Field int mOffsetToChildIndexOnLayout>
		setTopAndBottomOffset(w.b(getTopAndBottomOffset(), -appbarlayout.getTotalScrollRange(), 0));
	//  113  198:aload_0         
	//  114  199:aload_0         
	//  115  200:invokevirtual   #292 <Method int getTopAndBottomOffset()>
	//  116  203:aload_2         
	//  117  204:invokevirtual   #226 <Method int AppBarLayout.getTotalScrollRange()>
	//  118  207:ineg            
	//  119  208:iconst_0        
	//  120  209:invokestatic    #232 <Method int w.b(int, int, int)>
	//  121  212:invokevirtual   #327 <Method boolean setTopAndBottomOffset(int)>
	//  122  215:pop             
		updateAppBarLayoutDrawableState(coordinatorlayout, appbarlayout, getTopAndBottomOffset(), 0, true);
	//  123  216:aload_0         
	//  124  217:aload_1         
	//  125  218:aload_2         
	//  126  219:aload_0         
	//  127  220:invokevirtual   #292 <Method int getTopAndBottomOffset()>
	//  128  223:iconst_0        
	//  129  224:iconst_1        
	//  130  225:invokespecial   #329 <Method void updateAppBarLayoutDrawableState(CoordinatorLayout, AppBarLayout, int, int, boolean)>
		appbarlayout.dispatchOffsetUpdates(getTopAndBottomOffset());
	//  131  228:aload_2         
	//  132  229:aload_0         
	//  133  230:invokevirtual   #292 <Method int getTopAndBottomOffset()>
	//  134  233:invokevirtual   #333 <Method void AppBarLayout.dispatchOffsetUpdates(int)>
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
	//    5    7:invokevirtual   #335 <Method boolean onLayoutChild(CoordinatorLayout, AppBarLayout, int)>
	//    6   10:ireturn         
	}

	public boolean onMeasureChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k, int l)
	{
		if(((utParams)appbarlayout.getLayoutParams()).height == -2)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #338 <Method android.view.ViewGroup$LayoutParams AppBarLayout.getLayoutParams()>
	//*   2    4:checkcast       #208 <Class CoordinatorLayout$LayoutParams>
	//*   3    7:getfield        #341 <Field int CoordinatorLayout$LayoutParams.height>
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
	//   12   22:invokestatic    #346 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   13   25:iload           6
	//   14   27:invokevirtual   #349 <Method void CoordinatorLayout.onMeasureChild(View, int, int, int, int)>
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
	//   24   42:invokespecial   #352 <Method boolean s.onMeasureChild(CoordinatorLayout, View, int, int, int, int)>
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
	//    8   13:invokevirtual   #354 <Method boolean onMeasureChild(CoordinatorLayout, AppBarLayout, int, int, int, int)>
	//    9   16:ireturn         
	}

	public boolean onNestedFling(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, float f, float f1, boolean flag)
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          9
		boolean flag1 = false;
	//    2    3:iconst_0        
	//    3    4:istore          8
		if(!flag)
	//*   4    6:iload           6
	//*   5    8:ifne            31
			flag = fling(coordinatorlayout, ((View) (appbarlayout)), -appbarlayout.getTotalScrollRange(), 0, -f1);
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:aload_2         
	//    9   14:aload_2         
	//   10   15:invokevirtual   #226 <Method int AppBarLayout.getTotalScrollRange()>
	//   11   18:ineg            
	//   12   19:iconst_0        
	//   13   20:fload           5
	//   14   22:fneg            
	//   15   23:invokevirtual   #360 <Method boolean fling(CoordinatorLayout, View, int, int, float)>
	//   16   26:istore          6
		else
	//*  17   28:goto            112
		if(f1 < 0.0F)
	//*  18   31:fload           5
	//*  19   33:fconst_0        
	//*  20   34:fcmpg           
	//*  21   35:ifge            79
		{
			int i = -appbarlayout.getTotalScrollRange() + appbarlayout.getDownNestedPreScrollRange();
	//   22   38:aload_2         
	//   23   39:invokevirtual   #226 <Method int AppBarLayout.getTotalScrollRange()>
	//   24   42:ineg            
	//   25   43:aload_2         
	//   26   44:invokevirtual   #363 <Method int AppBarLayout.getDownNestedPreScrollRange()>
	//   27   47:iadd            
	//   28   48:istore          7
			flag = flag1;
	//   29   50:iload           8
	//   30   52:istore          6
			if(getTopBottomOffsetForScrollingSibling() < i)
	//*  31   54:aload_0         
	//*  32   55:invokevirtual   #58  <Method int getTopBottomOffsetForScrollingSibling()>
	//*  33   58:iload           7
	//*  34   60:icmpge          76
			{
				animateOffsetTo(coordinatorlayout, appbarlayout, i, f1);
	//   35   63:aload_0         
	//   36   64:aload_1         
	//   37   65:aload_2         
	//   38   66:iload           7
	//   39   68:fload           5
	//   40   70:invokespecial   #234 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
				flag = true;
	//   41   73:iconst_1        
	//   42   74:istore          6
			}
		} else
	//*  43   76:goto            112
		{
			int j = -appbarlayout.getUpNestedPreScrollRange();
	//   44   79:aload_2         
	//   45   80:invokevirtual   #320 <Method int AppBarLayout.getUpNestedPreScrollRange()>
	//   46   83:ineg            
	//   47   84:istore          7
			flag = flag2;
	//   48   86:iload           9
	//   49   88:istore          6
			if(getTopBottomOffsetForScrollingSibling() > j)
	//*  50   90:aload_0         
	//*  51   91:invokevirtual   #58  <Method int getTopBottomOffsetForScrollingSibling()>
	//*  52   94:iload           7
	//*  53   96:icmple          112
			{
				animateOffsetTo(coordinatorlayout, appbarlayout, j, f1);
	//   54   99:aload_0         
	//   55  100:aload_1         
	//   56  101:aload_2         
	//   57  102:iload           7
	//   58  104:fload           5
	//   59  106:invokespecial   #234 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
				flag = true;
	//   60  109:iconst_1        
	//   61  110:istore          6
			}
		}
		mWasNestedFlung = flag;
	//   62  112:aload_0         
	//   63  113:iload           6
	//   64  115:putfield        #365 <Field boolean mWasNestedFlung>
		return flag;
	//   65  118:iload           6
	//   66  120:ireturn         
	}

	public volatile boolean onNestedFling(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1, boolean flag)
	{
		return onNestedFling(coordinatorlayout, (AppBarLayout)view, view1, f, f1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:aload_3         
	//    5    7:fload           4
	//    6    9:fload           5
	//    7   11:iload           6
	//    8   13:invokevirtual   #368 <Method boolean onNestedFling(CoordinatorLayout, AppBarLayout, View, float, float, boolean)>
	//    9   16:ireturn         
	}

	public void onNestedPreScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int ai[])
	{
		if(j != 0 && !mSkipNestedPreScroll)
	//*   0    0:iload           5
	//*   1    2:ifeq            62
	//*   2    5:aload_0         
	//*   3    6:getfield        #372 <Field boolean mSkipNestedPreScroll>
	//*   4    9:ifne            62
		{
			int k;
			if(j < 0)
	//*   5   12:iload           5
	//*   6   14:ifge            36
			{
				i = -appbarlayout.getTotalScrollRange();
	//    7   17:aload_2         
	//    8   18:invokevirtual   #226 <Method int AppBarLayout.getTotalScrollRange()>
	//    9   21:ineg            
	//   10   22:istore          4
				k = i + appbarlayout.getDownNestedPreScrollRange();
	//   11   24:iload           4
	//   12   26:aload_2         
	//   13   27:invokevirtual   #363 <Method int AppBarLayout.getDownNestedPreScrollRange()>
	//   14   30:iadd            
	//   15   31:istore          7
			} else
	//*  16   33:goto            46
			{
				i = -appbarlayout.getUpNestedPreScrollRange();
	//   17   36:aload_2         
	//   18   37:invokevirtual   #320 <Method int AppBarLayout.getUpNestedPreScrollRange()>
	//   19   40:ineg            
	//   20   41:istore          4
				k = 0;
	//   21   43:iconst_0        
	//   22   44:istore          7
			}
			ai[1] = scroll(coordinatorlayout, ((View) (appbarlayout)), j, i, k);
	//   23   46:aload           6
	//   24   48:iconst_1        
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:aload_2         
	//   28   52:iload           5
	//   29   54:iload           4
	//   30   56:iload           7
	//   31   58:invokevirtual   #376 <Method int scroll(CoordinatorLayout, View, int, int, int)>
	//   32   61:iastore         
		}
	//   33   62:return          
	}

	public volatile void onNestedPreScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[])
	{
		onNestedPreScroll(coordinatorlayout, (AppBarLayout)view, view1, i, j, ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:aload           6
	//    8   13:invokevirtual   #379 <Method void onNestedPreScroll(CoordinatorLayout, AppBarLayout, View, int, int, int[])>
	//    9   16:return          
	}

	public void onNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int k, int l)
	{
		if(l < 0)
	//*   0    0:iload           7
	//*   1    2:ifge            26
		{
			scroll(coordinatorlayout, ((View) (appbarlayout)), l, -appbarlayout.getDownNestedScrollRange(), 0);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:iload           7
	//    6   10:aload_2         
	//    7   11:invokevirtual   #283 <Method int AppBarLayout.getDownNestedScrollRange()>
	//    8   14:ineg            
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #376 <Method int scroll(CoordinatorLayout, View, int, int, int)>
	//   11   19:pop             
			mSkipNestedPreScroll = true;
	//   12   20:aload_0         
	//   13   21:iconst_1        
	//   14   22:putfield        #372 <Field boolean mSkipNestedPreScroll>
			return;
	//   15   25:return          
		} else
		{
			mSkipNestedPreScroll = false;
	//   16   26:aload_0         
	//   17   27:iconst_0        
	//   18   28:putfield        #372 <Field boolean mSkipNestedPreScroll>
			return;
	//   19   31:return          
		}
	}

	public volatile void onNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int k, int l)
	{
		onNestedScroll(coordinatorlayout, (AppBarLayout)view, view1, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:iload           6
	//    8   13:iload           7
	//    9   15:invokevirtual   #384 <Method void onNestedScroll(CoordinatorLayout, AppBarLayout, View, int, int, int, int)>
	//   10   18:return          
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
	//   10   16:invokevirtual   #390 <Method Parcelable AppBarLayout$Behavior$SavedState.getSuperState()>
	//   11   19:invokespecial   #393 <Method void s.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
			mOffsetToChildIndexOnLayout = ((SavedState) (parcelable)).firstVisibleChildIndex;
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:getfield        #396 <Field int AppBarLayout$Behavior$SavedState.firstVisibleChildIndex>
	//   15   27:putfield        #44  <Field int mOffsetToChildIndexOnLayout>
			mOffsetToChildIndexOnLayoutPerc = ((SavedState) (parcelable)).firstVisibleChildPercentageShown;
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:getfield        #399 <Field float AppBarLayout$Behavior$SavedState.firstVisibleChildPercentageShown>
	//   19   35:putfield        #313 <Field float mOffsetToChildIndexOnLayoutPerc>
			mOffsetToChildIndexOnLayoutIsMinHeight = ((SavedState) (parcelable)).firstVisibleChildAtMinimumHeight;
	//   20   38:aload_0         
	//   21   39:aload_3         
	//   22   40:getfield        #402 <Field boolean AppBarLayout$Behavior$SavedState.firstVisibleChildAtMinimumHeight>
	//   23   43:putfield        #311 <Field boolean mOffsetToChildIndexOnLayoutIsMinHeight>
			return;
	//   24   46:return          
		} else
		{
			super.onRestoreInstanceState(coordinatorlayout, ((View) (appbarlayout)), parcelable);
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:aload_2         
	//   28   50:aload_3         
	//   29   51:invokespecial   #393 <Method void s.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
			mOffsetToChildIndexOnLayout = -1;
	//   30   54:aload_0         
	//   31   55:iconst_m1       
	//   32   56:putfield        #44  <Field int mOffsetToChildIndexOnLayout>
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
	//    5    7:invokevirtual   #404 <Method void onRestoreInstanceState(CoordinatorLayout, AppBarLayout, Parcelable)>
	//    6   10:return          
	}

	public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
	{
		Object obj = ((Object) (super.onSaveInstanceState(coordinatorlayout, ((View) (appbarlayout)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #409 <Method Parcelable s.onSaveInstanceState(CoordinatorLayout, View)>
	//    4    6:astore          8
		int j = getTopAndBottomOffset();
	//    5    8:aload_0         
	//    6    9:invokevirtual   #292 <Method int getTopAndBottomOffset()>
	//    7   12:istore          4
		int i = 0;
	//    8   14:iconst_0        
	//    9   15:istore_3        
		for(int k = appbarlayout.getChildCount(); i < k; i++)
	//*  10   16:aload_2         
	//*  11   17:invokevirtual   #131 <Method int AppBarLayout.getChildCount()>
	//*  12   20:istore          5
	//*  13   22:iload_3         
	//*  14   23:iload           5
	//*  15   25:icmpge          129
		{
			coordinatorlayout = ((CoordinatorLayout) (appbarlayout.getChildAt(i)));
	//   16   28:aload_2         
	//   17   29:iload_3         
	//   18   30:invokevirtual   #135 <Method View AppBarLayout.getChildAt(int)>
	//   19   33:astore_1        
			int l = ((View) (coordinatorlayout)).getBottom() + j;
	//   20   34:aload_1         
	//   21   35:invokevirtual   #143 <Method int View.getBottom()>
	//   22   38:iload           4
	//   23   40:iadd            
	//   24   41:istore          6
			if(((View) (coordinatorlayout)).getTop() + j <= 0 && l >= 0)
	//*  25   43:aload_1         
	//*  26   44:invokevirtual   #140 <Method int View.getTop()>
	//*  27   47:iload           4
	//*  28   49:iadd            
	//*  29   50:ifgt            122
	//*  30   53:iload           6
	//*  31   55:iflt            122
			{
				obj = ((Object) (new SavedState(((Parcelable) (obj)))));
	//   32   58:new             #15  <Class AppBarLayout$Behavior$SavedState>
	//   33   61:dup             
	//   34   62:aload           8
	//   35   64:invokespecial   #412 <Method void AppBarLayout$Behavior$SavedState(Parcelable)>
	//   36   67:astore          8
				obj.firstVisibleChildIndex = i;
	//   37   69:aload           8
	//   38   71:iload_3         
	//   39   72:putfield        #396 <Field int AppBarLayout$Behavior$SavedState.firstVisibleChildIndex>
				boolean flag;
				if(l == ViewCompat.getMinimumHeight(((View) (coordinatorlayout))) + appbarlayout.getTopInset())
	//*  40   75:iload           6
	//*  41   77:aload_1         
	//*  42   78:invokestatic    #172 <Method int ViewCompat.getMinimumHeight(View)>
	//*  43   81:aload_2         
	//*  44   82:invokevirtual   #179 <Method int AppBarLayout.getTopInset()>
	//*  45   85:iadd            
	//*  46   86:icmpne          95
					flag = true;
	//   47   89:iconst_1        
	//   48   90:istore          7
				else
	//*  49   92:goto            98
					flag = false;
	//   50   95:iconst_0        
	//   51   96:istore          7
				obj.firstVisibleChildAtMinimumHeight = flag;
	//   52   98:aload           8
	//   53  100:iload           7
	//   54  102:putfield        #402 <Field boolean AppBarLayout$Behavior$SavedState.firstVisibleChildAtMinimumHeight>
				obj.firstVisibleChildPercentageShown = (float)l / (float)((View) (coordinatorlayout)).getHeight();
	//   55  105:aload           8
	//   56  107:iload           6
	//   57  109:i2f             
	//   58  110:aload_1         
	//   59  111:invokevirtual   #160 <Method int View.getHeight()>
	//   60  114:i2f             
	//   61  115:fdiv            
	//   62  116:putfield        #399 <Field float AppBarLayout$Behavior$SavedState.firstVisibleChildPercentageShown>
				return ((Parcelable) (obj));
	//   63  119:aload           8
	//   64  121:areturn         
			}
		}

	//   65  122:iload_3         
	//   66  123:iconst_1        
	//   67  124:iadd            
	//   68  125:istore_3        
	//*  69  126:goto            22
		return ((Parcelable) (obj));
	//   70  129:aload           8
	//   71  131:areturn         
	}

	public volatile Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, View view)
	{
		return onSaveInstanceState(coordinatorlayout, (AppBarLayout)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:invokevirtual   #414 <Method Parcelable onSaveInstanceState(CoordinatorLayout, AppBarLayout)>
	//    5    9:areturn         
	}

	public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, View view1, int i)
	{
		boolean flag;
		if((i & 2) != 0 && appbarlayout.hasScrollableChildren() && coordinatorlayout.getHeight() - view.getHeight() <= appbarlayout.getHeight())
	//*   0    0:iload           5
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            36
	//*   4    7:aload_2         
	//*   5    8:invokevirtual   #419 <Method boolean AppBarLayout.hasScrollableChildren()>
	//*   6   11:ifeq            36
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #420 <Method int CoordinatorLayout.getHeight()>
	//*   9   18:aload_3         
	//*  10   19:invokevirtual   #160 <Method int View.getHeight()>
	//*  11   22:isub            
	//*  12   23:aload_2         
	//*  13   24:invokevirtual   #75  <Method int AppBarLayout.getHeight()>
	//*  14   27:icmpgt          36
			flag = true;
	//   15   30:iconst_1        
	//   16   31:istore          6
		else
	//*  17   33:goto            39
			flag = false;
	//   18   36:iconst_0        
	//   19   37:istore          6
		if(flag && mOffsetAnimator != null)
	//*  20   39:iload           6
	//*  21   41:ifeq            58
	//*  22   44:aload_0         
	//*  23   45:getfield        #82  <Field ValueAnimator mOffsetAnimator>
	//*  24   48:ifnull          58
			mOffsetAnimator.cancel();
	//   25   51:aload_0         
	//   26   52:getfield        #82  <Field ValueAnimator mOffsetAnimator>
	//   27   55:invokevirtual   #91  <Method void ValueAnimator.cancel()>
		mLastNestedScrollingChildRef = null;
	//   28   58:aload_0         
	//   29   59:aconst_null     
	//   30   60:putfield        #261 <Field WeakReference mLastNestedScrollingChildRef>
		return flag;
	//   31   63:iload           6
	//   32   65:ireturn         
	}

	public volatile boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
	{
		return onStartNestedScroll(coordinatorlayout, (AppBarLayout)view, view1, view2, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:iload           5
	//    7   11:invokevirtual   #423 <Method boolean onStartNestedScroll(CoordinatorLayout, AppBarLayout, View, View, int)>
	//    8   14:ireturn         
	}

	public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view)
	{
		if(!mWasNestedFlung)
	//*   0    0:aload_0         
	//*   1    1:getfield        #365 <Field boolean mWasNestedFlung>
	//*   2    4:ifne            13
			snapToChildIfNeeded(coordinatorlayout, appbarlayout);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #298 <Method void snapToChildIfNeeded(CoordinatorLayout, AppBarLayout)>
		mSkipNestedPreScroll = false;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #372 <Field boolean mSkipNestedPreScroll>
		mWasNestedFlung = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #365 <Field boolean mWasNestedFlung>
		mLastNestedScrollingChildRef = new WeakReference(((Object) (view)));
	//   13   23:aload_0         
	//   14   24:new             #263 <Class WeakReference>
	//   15   27:dup             
	//   16   28:aload_3         
	//   17   29:invokespecial   #428 <Method void WeakReference(Object)>
	//   18   32:putfield        #261 <Field WeakReference mLastNestedScrollingChildRef>
	//   19   35:return          
	}

	public volatile void onStopNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		onStopNestedScroll(coordinatorlayout, (AppBarLayout)view, view1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #431 <Method void onStopNestedScroll(CoordinatorLayout, AppBarLayout, View)>
	//    6   10:return          
	}

	public void setDragCallback(DragCallback dragcallback)
	{
		mOnDragCallback = dragcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #256 <Field AppBarLayout$Behavior$DragCallback mOnDragCallback>
	//    3    5:return          
	}

	int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k)
	{
		int l = getTopBottomOffsetForScrollingSibling();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method int getTopBottomOffsetForScrollingSibling()>
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
			j = w.b(i, j, k);
	//   11   25:iload_3         
	//   12   26:iload           4
	//   13   28:iload           5
	//   14   30:invokestatic    #232 <Method int w.b(int, int, int)>
	//   15   33:istore          4
			if(l != j)
	//*  16   35:iload           6
	//*  17   37:iload           4
	//*  18   39:icmpeq          138
			{
				if(appbarlayout.hasChildWithInterpolator())
	//*  19   42:aload_2         
	//*  20   43:invokevirtual   #439 <Method boolean AppBarLayout.hasChildWithInterpolator()>
	//*  21   46:ifeq            60
					i = interpolateOffset(appbarlayout, j);
	//   22   49:aload_0         
	//   23   50:aload_2         
	//   24   51:iload           4
	//   25   53:invokespecial   #441 <Method int interpolateOffset(AppBarLayout, int)>
	//   26   56:istore_3        
				else
	//*  27   57:goto            63
					i = j;
	//   28   60:iload           4
	//   29   62:istore_3        
				boolean flag = setTopAndBottomOffset(i);
	//   30   63:aload_0         
	//   31   64:iload_3         
	//   32   65:invokevirtual   #327 <Method boolean setTopAndBottomOffset(int)>
	//   33   68:istore          7
				mOffsetDelta = j - i;
	//   34   70:aload_0         
	//   35   71:iload           4
	//   36   73:iload_3         
	//   37   74:isub            
	//   38   75:putfield        #52  <Field int mOffsetDelta>
				if(!flag && appbarlayout.hasChildWithInterpolator())
	//*  39   78:iload           7
	//*  40   80:ifne            95
	//*  41   83:aload_2         
	//*  42   84:invokevirtual   #439 <Method boolean AppBarLayout.hasChildWithInterpolator()>
	//*  43   87:ifeq            95
					coordinatorlayout.dispatchDependentViewsChanged(((View) (appbarlayout)));
	//   44   90:aload_1         
	//   45   91:aload_2         
	//   46   92:invokevirtual   #445 <Method void CoordinatorLayout.dispatchDependentViewsChanged(View)>
				appbarlayout.dispatchOffsetUpdates(getTopAndBottomOffset());
	//   47   95:aload_2         
	//   48   96:aload_0         
	//   49   97:invokevirtual   #292 <Method int getTopAndBottomOffset()>
	//   50  100:invokevirtual   #333 <Method void AppBarLayout.dispatchOffsetUpdates(int)>
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
	//   65  124:invokespecial   #329 <Method void updateAppBarLayoutDrawableState(CoordinatorLayout, AppBarLayout, int, int, boolean)>
				return l - j;
	//   66  127:iload           6
	//   67  129:iload           4
	//   68  131:isub            
	//   69  132:ireturn         
			}
		} else
		{
			mOffsetDelta = 0;
	//   70  133:aload_0         
	//   71  134:iconst_0        
	//   72  135:putfield        #52  <Field int mOffsetDelta>
		}
		return 0;
	//   73  138:iconst_0        
	//   74  139:ireturn         
	}

	public volatile int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k)
	{
		return setHeaderTopBottomOffset(coordinatorlayout, (AppBarLayout)view, i, j, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class AppBarLayout>
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:invokevirtual   #447 <Method int setHeaderTopBottomOffset(CoordinatorLayout, AppBarLayout, int, int, int)>
	//    8   14:ireturn         
	}

	public volatile boolean setLeftAndRightOffset(int i)
	{
		return super.setLeftAndRightOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #450 <Method boolean s.setLeftAndRightOffset(int)>
	//    3    5:ireturn         
	}

	public volatile boolean setTopAndBottomOffset(int i)
	{
		return super.setTopAndBottomOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #451 <Method boolean s.setTopAndBottomOffset(int)>
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
	private boolean mSkipNestedPreScroll;
	private boolean mWasNestedFlung;


/*
	static int access$000(AppBarLayout$Behavior appbarlayout$behavior)
	{
		return appbarlayout$behavior.mOffsetDelta;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int mOffsetDelta>
	//    2    4:ireturn         
	}

*/

	public AppBarLayout$Behavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void s()>
		mOffsetToChildIndexOnLayout = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #44  <Field int mOffsetToChildIndexOnLayout>
	//    5    9:return          
	}

	public AppBarLayout$Behavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #48  <Method void s(Context, AttributeSet)>
		mOffsetToChildIndexOnLayout = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #44  <Field int mOffsetToChildIndexOnLayout>
	//    7   11:return          
	}
}
