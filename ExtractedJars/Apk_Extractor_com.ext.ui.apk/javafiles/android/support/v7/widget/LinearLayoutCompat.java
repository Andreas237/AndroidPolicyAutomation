// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v7.widget:
//			TintTypedArray, ViewUtils

public class LinearLayoutCompat extends ViewGroup
{
	public static interface DividerMode
		extends Annotation
	{
	}

	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		public int gravity;
		public float weight;

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #15  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			gravity = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #17  <Field int gravity>
			weight = 0.0F;
		//    7   11:aload_0         
		//    8   12:fconst_0        
		//    9   13:putfield        #19  <Field float weight>
		//   10   16:return          
		}

		public LayoutParams(int i, int j, float f)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #15  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			gravity = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #17  <Field int gravity>
			weight = f;
		//    7   11:aload_0         
		//    8   12:fload_3         
		//    9   13:putfield        #19  <Field float weight>
		//   10   16:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #24  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			gravity = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #17  <Field int gravity>
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.LinearLayoutCompat_Layout)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #30  <Field int[] android.support.v7.appcompat.R$styleable.LinearLayoutCompat_Layout>
		//   10   16:invokevirtual   #36  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_1        
			weight = ((TypedArray) (context)).getFloat(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:getstatic       #39  <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_Layout_android_layout_weight>
		//   15   25:fconst_0        
		//   16   26:invokevirtual   #45  <Method float TypedArray.getFloat(int, float)>
		//   17   29:putfield        #19  <Field float weight>
			gravity = ((TypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
		//   18   32:aload_0         
		//   19   33:aload_1         
		//   20   34:getstatic       #48  <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_Layout_android_layout_gravity>
		//   21   37:iconst_m1       
		//   22   38:invokevirtual   #52  <Method int TypedArray.getInt(int, int)>
		//   23   41:putfield        #17  <Field int gravity>
			((TypedArray) (context)).recycle();
		//   24   44:aload_1         
		//   25   45:invokevirtual   #56  <Method void TypedArray.recycle()>
		//   26   48:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.view.ViewGroup.MarginLayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #60  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			gravity = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #17  <Field int gravity>
			weight = layoutparams.weight;
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:getfield        #19  <Field float weight>
		//    9   15:putfield        #19  <Field float weight>
			gravity = layoutparams.gravity;
		//   10   18:aload_0         
		//   11   19:aload_1         
		//   12   20:getfield        #17  <Field int gravity>
		//   13   23:putfield        #17  <Field int gravity>
		//   14   26:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #63  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
			gravity = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #17  <Field int gravity>
		//    6   10:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #60  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			gravity = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #17  <Field int gravity>
		//    6   10:return          
		}
	}

	public static interface OrientationMode
		extends Annotation
	{
	}


	public LinearLayoutCompat(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #54  <Method void LinearLayoutCompat(Context, AttributeSet)>
	//    4    6:return          
	}

	public LinearLayoutCompat(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #58  <Method void LinearLayoutCompat(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public LinearLayoutCompat(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #59  <Method void ViewGroup(Context, AttributeSet, int)>
		mBaselineAligned = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #61  <Field boolean mBaselineAligned>
		mBaselineAlignedChildIndex = -1;
	//    8   12:aload_0         
	//    9   13:iconst_m1       
	//   10   14:putfield        #63  <Field int mBaselineAlignedChildIndex>
		mBaselineChildTop = 0;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #65  <Field int mBaselineChildTop>
		mGravity = 0x800033;
	//   14   22:aload_0         
	//   15   23:ldc1            #66  <Int 0x800033>
	//   16   25:putfield        #68  <Field int mGravity>
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.LinearLayoutCompat, i, 0)));
	//   17   28:aload_1         
	//   18   29:aload_2         
	//   19   30:getstatic       #73  <Field int[] android.support.v7.appcompat.R$styleable.LinearLayoutCompat>
	//   20   33:iload_3         
	//   21   34:iconst_0        
	//   22   35:invokestatic    #79  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   23   38:astore_1        
		i = ((TintTypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_android_orientation, -1);
	//   24   39:aload_1         
	//   25   40:getstatic       #82  <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_android_orientation>
	//   26   43:iconst_m1       
	//   27   44:invokevirtual   #86  <Method int TintTypedArray.getInt(int, int)>
	//   28   47:istore_3        
		if(i >= 0)
	//*  29   48:iload_3         
	//*  30   49:iflt            57
			setOrientation(i);
	//   31   52:aload_0         
	//   32   53:iload_3         
	//   33   54:invokevirtual   #90  <Method void setOrientation(int)>
		i = ((TintTypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_android_gravity, -1);
	//   34   57:aload_1         
	//   35   58:getstatic       #93  <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_android_gravity>
	//   36   61:iconst_m1       
	//   37   62:invokevirtual   #86  <Method int TintTypedArray.getInt(int, int)>
	//   38   65:istore_3        
		if(i >= 0)
	//*  39   66:iload_3         
	//*  40   67:iflt            75
			setGravity(i);
	//   41   70:aload_0         
	//   42   71:iload_3         
	//   43   72:invokevirtual   #96  <Method void setGravity(int)>
		boolean flag = ((TintTypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_android_baselineAligned, true);
	//   44   75:aload_1         
	//   45   76:getstatic       #99  <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_android_baselineAligned>
	//   46   79:iconst_1        
	//   47   80:invokevirtual   #103 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   48   83:istore          4
		if(!flag)
	//*  49   85:iload           4
	//*  50   87:ifne            96
			setBaselineAligned(flag);
	//   51   90:aload_0         
	//   52   91:iload           4
	//   53   93:invokevirtual   #107 <Method void setBaselineAligned(boolean)>
		mWeightSum = ((TintTypedArray) (context)).getFloat(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_android_weightSum, -1F);
	//   54   96:aload_0         
	//   55   97:aload_1         
	//   56   98:getstatic       #110 <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_android_weightSum>
	//   57  101:ldc1            #111 <Float -1F>
	//   58  103:invokevirtual   #115 <Method float TintTypedArray.getFloat(int, float)>
	//   59  106:putfield        #117 <Field float mWeightSum>
		mBaselineAlignedChildIndex = ((TintTypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
	//   60  109:aload_0         
	//   61  110:aload_1         
	//   62  111:getstatic       #120 <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_android_baselineAlignedChildIndex>
	//   63  114:iconst_m1       
	//   64  115:invokevirtual   #86  <Method int TintTypedArray.getInt(int, int)>
	//   65  118:putfield        #63  <Field int mBaselineAlignedChildIndex>
		mUseLargestChild = ((TintTypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
	//   66  121:aload_0         
	//   67  122:aload_1         
	//   68  123:getstatic       #123 <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_measureWithLargestChild>
	//   69  126:iconst_0        
	//   70  127:invokevirtual   #103 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   71  130:putfield        #125 <Field boolean mUseLargestChild>
		setDividerDrawable(((TintTypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_divider));
	//   72  133:aload_0         
	//   73  134:aload_1         
	//   74  135:getstatic       #128 <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_divider>
	//   75  138:invokevirtual   #132 <Method Drawable TintTypedArray.getDrawable(int)>
	//   76  141:invokevirtual   #136 <Method void setDividerDrawable(Drawable)>
		mShowDividers = ((TintTypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_showDividers, 0);
	//   77  144:aload_0         
	//   78  145:aload_1         
	//   79  146:getstatic       #139 <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_showDividers>
	//   80  149:iconst_0        
	//   81  150:invokevirtual   #86  <Method int TintTypedArray.getInt(int, int)>
	//   82  153:putfield        #141 <Field int mShowDividers>
		mDividerPadding = ((TintTypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_dividerPadding, 0);
	//   83  156:aload_0         
	//   84  157:aload_1         
	//   85  158:getstatic       #144 <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_dividerPadding>
	//   86  161:iconst_0        
	//   87  162:invokevirtual   #147 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//   88  165:putfield        #149 <Field int mDividerPadding>
		((TintTypedArray) (context)).recycle();
	//   89  168:aload_1         
	//   90  169:invokevirtual   #153 <Method void TintTypedArray.recycle()>
	//   91  172:return          
	}

	private void forceUniformHeight(int i, int j)
	{
		int l = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method int getMeasuredHeight()>
	//    2    4:ldc1            #160 <Int 0x40000000>
	//    3    6:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    4    9:istore          4
		for(int k = 0; k < i; k++)
	//*   5   11:iconst_0        
	//*   6   12:istore_3        
	//*   7   13:iload_3         
	//*   8   14:iload_1         
	//*   9   15:icmpge          96
		{
			View view = getVirtualChildAt(k);
	//   10   18:aload_0         
	//   11   19:iload_3         
	//   12   20:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   13   23:astore          6
			if(view.getVisibility() == 8)
				continue;
	//   14   25:aload           6
	//   15   27:invokevirtual   #174 <Method int View.getVisibility()>
	//   16   30:bipush          8
	//   17   32:icmpeq          89
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   18   35:aload           6
	//   19   37:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   40:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   21   43:astore          7
			if(layoutparams.height == -1)
	//*  22   45:aload           7
	//*  23   47:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//*  24   50:iconst_m1       
	//*  25   51:icmpne          89
			{
				int i1 = layoutparams.width;
	//   26   54:aload           7
	//   27   56:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//   28   59:istore          5
				layoutparams.width = view.getMeasuredWidth();
	//   29   61:aload           7
	//   30   63:aload           6
	//   31   65:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//   32   68:putfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
				measureChildWithMargins(view, j, 0, l, 0);
	//   33   71:aload_0         
	//   34   72:aload           6
	//   35   74:iload_2         
	//   36   75:iconst_0        
	//   37   76:iload           4
	//   38   78:iconst_0        
	//   39   79:invokevirtual   #191 <Method void measureChildWithMargins(View, int, int, int, int)>
				layoutparams.width = i1;
	//   40   82:aload           7
	//   41   84:iload           5
	//   42   86:putfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
			}
		}

	//   43   89:iload_3         
	//   44   90:iconst_1        
	//   45   91:iadd            
	//   46   92:istore_3        
	//*  47   93:goto            13
	//   48   96:return          
	}

	private void forceUniformWidth(int i, int j)
	{
		int l = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #193 <Method int getMeasuredWidth()>
	//    2    4:ldc1            #160 <Int 0x40000000>
	//    3    6:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    4    9:istore          4
		for(int k = 0; k < i; k++)
	//*   5   11:iconst_0        
	//*   6   12:istore_3        
	//*   7   13:iload_3         
	//*   8   14:iload_1         
	//*   9   15:icmpge          96
		{
			View view = getVirtualChildAt(k);
	//   10   18:aload_0         
	//   11   19:iload_3         
	//   12   20:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   13   23:astore          6
			if(view.getVisibility() == 8)
				continue;
	//   14   25:aload           6
	//   15   27:invokevirtual   #174 <Method int View.getVisibility()>
	//   16   30:bipush          8
	//   17   32:icmpeq          89
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   18   35:aload           6
	//   19   37:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   40:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   21   43:astore          7
			if(layoutparams.width == -1)
	//*  22   45:aload           7
	//*  23   47:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//*  24   50:iconst_m1       
	//*  25   51:icmpne          89
			{
				int i1 = layoutparams.height;
	//   26   54:aload           7
	//   27   56:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//   28   59:istore          5
				layoutparams.height = view.getMeasuredHeight();
	//   29   61:aload           7
	//   30   63:aload           6
	//   31   65:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//   32   68:putfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
				measureChildWithMargins(view, l, 0, j, 0);
	//   33   71:aload_0         
	//   34   72:aload           6
	//   35   74:iload           4
	//   36   76:iconst_0        
	//   37   77:iload_2         
	//   38   78:iconst_0        
	//   39   79:invokevirtual   #191 <Method void measureChildWithMargins(View, int, int, int, int)>
				layoutparams.height = i1;
	//   40   82:aload           7
	//   41   84:iload           5
	//   42   86:putfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
			}
		}

	//   43   89:iload_3         
	//   44   90:iconst_1        
	//   45   91:iadd            
	//   46   92:istore_3        
	//*  47   93:goto            13
	//   48   96:return          
	}

	private void setChildFrame(View view, int i, int j, int k, int l)
	{
		view.layout(i, j, i + k, j + l);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload_2         
	//    4    4:iload           4
	//    5    6:iadd            
	//    6    7:iload_3         
	//    7    8:iload           5
	//    8   10:iadd            
	//    9   11:invokevirtual   #199 <Method void View.layout(int, int, int, int)>
	//   10   14:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return layoutparams instanceof LayoutParams;
	//    0    0:aload_1         
	//    1    1:instanceof      #9   <Class LinearLayoutCompat$LayoutParams>
	//    2    4:ireturn         
	}

	void drawDividersHorizontal(Canvas canvas)
	{
		int l = getVirtualChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #206 <Method int getVirtualChildCount()>
	//    2    4:istore          4
		boolean flag = ViewUtils.isLayoutRtl(((View) (this)));
	//    3    6:aload_0         
	//    4    7:invokestatic    #212 <Method boolean ViewUtils.isLayoutRtl(View)>
	//    5   10:istore          5
		int i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		while(i < l) 
	//*   8   14:iload_2         
	//*   9   15:iload           4
	//*  10   17:icmpge          112
		{
			View view = getVirtualChildAt(i);
	//   11   20:aload_0         
	//   12   21:iload_2         
	//   13   22:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   14   25:astore          6
			if(view != null && view.getVisibility() != 8 && hasDividerBeforeChildAt(i))
	//*  15   27:aload           6
	//*  16   29:ifnull          85
	//*  17   32:aload           6
	//*  18   34:invokevirtual   #174 <Method int View.getVisibility()>
	//*  19   37:bipush          8
	//*  20   39:icmpeq          85
	//*  21   42:aload_0         
	//*  22   43:iload_2         
	//*  23   44:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//*  24   47:ifeq            85
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   25   50:aload           6
	//   26   52:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   27   55:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   28   58:astore          7
				int k;
				if(flag)
	//*  29   60:iload           5
	//*  30   62:ifeq            92
				{
					k = view.getRight();
	//   31   65:aload           6
	//   32   67:invokevirtual   #219 <Method int View.getRight()>
	//   33   70:istore_3        
					k = layoutparams.rightMargin + k;
	//   34   71:aload           7
	//   35   73:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//   36   76:iload_3         
	//   37   77:iadd            
	//   38   78:istore_3        
				} else
	//*  39   79:aload_0         
	//*  40   80:aload_1         
	//*  41   81:iload_3         
	//*  42   82:invokevirtual   #226 <Method void drawVerticalDivider(Canvas, int)>
	//*  43   85:iload_2         
	//*  44   86:iconst_1        
	//*  45   87:iadd            
	//*  46   88:istore_2        
	//*  47   89:goto            14
				{
					k = view.getLeft() - layoutparams.leftMargin - mDividerWidth;
	//   48   92:aload           6
	//   49   94:invokevirtual   #229 <Method int View.getLeft()>
	//   50   97:aload           7
	//   51   99:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//   52  102:isub            
	//   53  103:aload_0         
	//   54  104:getfield        #234 <Field int mDividerWidth>
	//   55  107:isub            
	//   56  108:istore_3        
				}
				drawVerticalDivider(canvas, k);
			}
			i++;
		}
	//*  57  109:goto            79
		if(hasDividerBeforeChildAt(l))
	//*  58  112:aload_0         
	//*  59  113:iload           4
	//*  60  115:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//*  61  118:ifeq            152
		{
			View view1 = getVirtualChildAt(l - 1);
	//   62  121:aload_0         
	//   63  122:iload           4
	//   64  124:iconst_1        
	//   65  125:isub            
	//   66  126:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   67  129:astore          6
			int j;
			if(view1 == null)
	//*  68  131:aload           6
	//*  69  133:ifnonnull       171
			{
				if(flag)
	//*  70  136:iload           5
	//*  71  138:ifeq            153
					j = getPaddingLeft();
	//   72  141:aload_0         
	//   73  142:invokevirtual   #237 <Method int getPaddingLeft()>
	//   74  145:istore_2        
				else
	//*  75  146:aload_0         
	//*  76  147:aload_1         
	//*  77  148:iload_2         
	//*  78  149:invokevirtual   #226 <Method void drawVerticalDivider(Canvas, int)>
	//*  79  152:return          
					j = getWidth() - getPaddingRight() - mDividerWidth;
	//   80  153:aload_0         
	//   81  154:invokevirtual   #240 <Method int getWidth()>
	//   82  157:aload_0         
	//   83  158:invokevirtual   #243 <Method int getPaddingRight()>
	//   84  161:isub            
	//   85  162:aload_0         
	//   86  163:getfield        #234 <Field int mDividerWidth>
	//   87  166:isub            
	//   88  167:istore_2        
			} else
	//*  89  168:goto            146
			{
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//   90  171:aload           6
	//   91  173:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   92  176:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   93  179:astore          7
				if(flag)
	//*  94  181:iload           5
	//*  95  183:ifeq            206
				{
					j = view1.getLeft() - layoutparams1.leftMargin - mDividerWidth;
	//   96  186:aload           6
	//   97  188:invokevirtual   #229 <Method int View.getLeft()>
	//   98  191:aload           7
	//   99  193:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  100  196:isub            
	//  101  197:aload_0         
	//  102  198:getfield        #234 <Field int mDividerWidth>
	//  103  201:isub            
	//  104  202:istore_2        
				} else
	//* 105  203:goto            146
				{
					j = view1.getRight();
	//  106  206:aload           6
	//  107  208:invokevirtual   #219 <Method int View.getRight()>
	//  108  211:istore_2        
					j = layoutparams1.rightMargin + j;
	//  109  212:aload           7
	//  110  214:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  111  217:iload_2         
	//  112  218:iadd            
	//  113  219:istore_2        
				}
			}
			drawVerticalDivider(canvas, j);
		}
	//* 114  220:goto            146
	}

	void drawDividersVertical(Canvas canvas)
	{
		int k = getVirtualChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #206 <Method int getVirtualChildCount()>
	//    2    4:istore_3        
		for(int i = 0; i < k; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          80
		{
			View view = getVirtualChildAt(i);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   11   17:astore          4
			if(view != null && view.getVisibility() != 8 && hasDividerBeforeChildAt(i))
	//*  12   19:aload           4
	//*  13   21:ifnull          73
	//*  14   24:aload           4
	//*  15   26:invokevirtual   #174 <Method int View.getVisibility()>
	//*  16   29:bipush          8
	//*  17   31:icmpeq          73
	//*  18   34:aload_0         
	//*  19   35:iload_2         
	//*  20   36:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//*  21   39:ifeq            73
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   22   42:aload           4
	//   23   44:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   24   47:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   25   50:astore          5
				drawHorizontalDivider(canvas, view.getTop() - layoutparams.topMargin - mDividerHeight);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:aload           4
	//   29   56:invokevirtual   #247 <Method int View.getTop()>
	//   30   59:aload           5
	//   31   61:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//   32   64:isub            
	//   33   65:aload_0         
	//   34   66:getfield        #252 <Field int mDividerHeight>
	//   35   69:isub            
	//   36   70:invokevirtual   #255 <Method void drawHorizontalDivider(Canvas, int)>
			}
		}

	//   37   73:iload_2         
	//   38   74:iconst_1        
	//   39   75:iadd            
	//   40   76:istore_2        
	//*  41   77:goto            7
		if(hasDividerBeforeChildAt(k))
	//*  42   80:aload_0         
	//*  43   81:iload_3         
	//*  44   82:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//*  45   85:ifeq            123
		{
			View view1 = getVirtualChildAt(k - 1);
	//   46   88:aload_0         
	//   47   89:iload_3         
	//   48   90:iconst_1        
	//   49   91:isub            
	//   50   92:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   51   95:astore          4
			int j;
			if(view1 == null)
	//*  52   97:aload           4
	//*  53   99:ifnonnull       124
			{
				j = getHeight() - getPaddingBottom() - mDividerHeight;
	//   54  102:aload_0         
	//   55  103:invokevirtual   #258 <Method int getHeight()>
	//   56  106:aload_0         
	//   57  107:invokevirtual   #261 <Method int getPaddingBottom()>
	//   58  110:isub            
	//   59  111:aload_0         
	//   60  112:getfield        #252 <Field int mDividerHeight>
	//   61  115:isub            
	//   62  116:istore_2        
			} else
	//*  63  117:aload_0         
	//*  64  118:aload_1         
	//*  65  119:iload_2         
	//*  66  120:invokevirtual   #255 <Method void drawHorizontalDivider(Canvas, int)>
	//*  67  123:return          
			{
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//   68  124:aload           4
	//   69  126:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   70  129:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   71  132:astore          5
				j = view1.getBottom();
	//   72  134:aload           4
	//   73  136:invokevirtual   #264 <Method int View.getBottom()>
	//   74  139:istore_2        
				j = layoutparams1.bottomMargin + j;
	//   75  140:aload           5
	//   76  142:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//   77  145:iload_2         
	//   78  146:iadd            
	//   79  147:istore_2        
			}
			drawHorizontalDivider(canvas, j);
		}
	//*  80  148:goto            117
	}

	void drawHorizontalDivider(Canvas canvas, int i)
	{
		mDivider.setBounds(getPaddingLeft() + mDividerPadding, i, getWidth() - getPaddingRight() - mDividerPadding, mDividerHeight + i);
	//    0    0:aload_0         
	//    1    1:getfield        #269 <Field Drawable mDivider>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #237 <Method int getPaddingLeft()>
	//    4    8:aload_0         
	//    5    9:getfield        #149 <Field int mDividerPadding>
	//    6   12:iadd            
	//    7   13:iload_2         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #240 <Method int getWidth()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #243 <Method int getPaddingRight()>
	//   12   22:isub            
	//   13   23:aload_0         
	//   14   24:getfield        #149 <Field int mDividerPadding>
	//   15   27:isub            
	//   16   28:aload_0         
	//   17   29:getfield        #252 <Field int mDividerHeight>
	//   18   32:iload_2         
	//   19   33:iadd            
	//   20   34:invokevirtual   #274 <Method void Drawable.setBounds(int, int, int, int)>
		mDivider.draw(canvas);
	//   21   37:aload_0         
	//   22   38:getfield        #269 <Field Drawable mDivider>
	//   23   41:aload_1         
	//   24   42:invokevirtual   #277 <Method void Drawable.draw(Canvas)>
	//   25   45:return          
	}

	void drawVerticalDivider(Canvas canvas, int i)
	{
		mDivider.setBounds(i, getPaddingTop() + mDividerPadding, mDividerWidth + i, getHeight() - getPaddingBottom() - mDividerPadding);
	//    0    0:aload_0         
	//    1    1:getfield        #269 <Field Drawable mDivider>
	//    2    4:iload_2         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #280 <Method int getPaddingTop()>
	//    5    9:aload_0         
	//    6   10:getfield        #149 <Field int mDividerPadding>
	//    7   13:iadd            
	//    8   14:aload_0         
	//    9   15:getfield        #234 <Field int mDividerWidth>
	//   10   18:iload_2         
	//   11   19:iadd            
	//   12   20:aload_0         
	//   13   21:invokevirtual   #258 <Method int getHeight()>
	//   14   24:aload_0         
	//   15   25:invokevirtual   #261 <Method int getPaddingBottom()>
	//   16   28:isub            
	//   17   29:aload_0         
	//   18   30:getfield        #149 <Field int mDividerPadding>
	//   19   33:isub            
	//   20   34:invokevirtual   #274 <Method void Drawable.setBounds(int, int, int, int)>
		mDivider.draw(canvas);
	//   21   37:aload_0         
	//   22   38:getfield        #269 <Field Drawable mDivider>
	//   23   41:aload_1         
	//   24   42:invokevirtual   #277 <Method void Drawable.draw(Canvas)>
	//   25   45:return          
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		if(mOrientation == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #284 <Field int mOrientation>
	//*   2    4:ifne            19
			return new LayoutParams(-2, -2);
	//    3    7:new             #9   <Class LinearLayoutCompat$LayoutParams>
	//    4   10:dup             
	//    5   11:bipush          -2
	//    6   13:bipush          -2
	//    7   15:invokespecial   #286 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//    8   18:areturn         
		if(mOrientation == 1)
	//*   9   19:aload_0         
	//*  10   20:getfield        #284 <Field int mOrientation>
	//*  11   23:iconst_1        
	//*  12   24:icmpne          38
			return new LayoutParams(-1, -2);
	//   13   27:new             #9   <Class LinearLayoutCompat$LayoutParams>
	//   14   30:dup             
	//   15   31:iconst_m1       
	//   16   32:bipush          -2
	//   17   34:invokespecial   #286 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//   18   37:areturn         
		else
			return null;
	//   19   38:aconst_null     
	//   20   39:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #288 <Method LinearLayoutCompat$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #9   <Class LinearLayoutCompat$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #294 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #295 <Method void LinearLayoutCompat$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return new LayoutParams(layoutparams);
	//    0    0:new             #9   <Class LinearLayoutCompat$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #299 <Method void LinearLayoutCompat$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    4    8:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #302 <Method LinearLayoutCompat$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #305 <Method LinearLayoutCompat$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public int getBaseline()
	{
		int i = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_1        
		if(mBaselineAlignedChildIndex >= 0) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #63  <Field int mBaselineAlignedChildIndex>
	//    4    6:ifge            16
_L1:
		i = super.getBaseline();
	//    5    9:aload_0         
	//    6   10:invokespecial   #308 <Method int ViewGroup.getBaseline()>
	//    7   13:istore_1        
_L4:
		return i;
	//    8   14:iload_1         
	//    9   15:ireturn         
_L2:
		int j;
		View view;
		if(getChildCount() <= mBaselineAlignedChildIndex)
	//*  10   16:aload_0         
	//*  11   17:invokevirtual   #311 <Method int getChildCount()>
	//*  12   20:aload_0         
	//*  13   21:getfield        #63  <Field int mBaselineAlignedChildIndex>
	//*  14   24:icmpgt          38
			throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
	//   15   27:new             #313 <Class RuntimeException>
	//   16   30:dup             
	//   17   31:ldc2            #315 <String "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.">
	//   18   34:invokespecial   #318 <Method void RuntimeException(String)>
	//   19   37:athrow          
		view = getChildAt(mBaselineAlignedChildIndex);
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #63  <Field int mBaselineAlignedChildIndex>
	//   23   43:invokevirtual   #321 <Method View getChildAt(int)>
	//   24   46:astore          4
		j = view.getBaseline();
	//   25   48:aload           4
	//   26   50:invokevirtual   #322 <Method int View.getBaseline()>
	//   27   53:istore_2        
		if(j != -1)
			break; /* Loop/switch isn't completed */
	//   28   54:iload_2         
	//   29   55:iconst_m1       
	//   30   56:icmpne          77
		if(mBaselineAlignedChildIndex != 0)
	//*  31   59:aload_0         
	//*  32   60:getfield        #63  <Field int mBaselineAlignedChildIndex>
	//*  33   63:ifeq            14
			throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
	//   34   66:new             #313 <Class RuntimeException>
	//   35   69:dup             
	//   36   70:ldc2            #324 <String "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.">
	//   37   73:invokespecial   #318 <Method void RuntimeException(String)>
	//   38   76:athrow          
		if(true) goto _L4; else goto _L3
_L3:
		i = mBaselineChildTop;
	//   39   77:aload_0         
	//   40   78:getfield        #65  <Field int mBaselineChildTop>
	//   41   81:istore_1        
		if(mOrientation != 1) goto _L6; else goto _L5
	//   42   82:aload_0         
	//   43   83:getfield        #284 <Field int mOrientation>
	//   44   86:iconst_1        
	//   45   87:icmpne          132
_L5:
		int k = mGravity & 0x70;
	//   46   90:aload_0         
	//   47   91:getfield        #68  <Field int mGravity>
	//   48   94:bipush          112
	//   49   96:iand            
	//   50   97:istore_3        
		if(k == 48) goto _L6; else goto _L7
	//   51   98:iload_3         
	//   52   99:bipush          48
	//   53  101:icmpeq          132
_L7:
		k;
	//   54  104:iload_3         
		JVM INSTR lookupswitch 2: default 132
	//	               16: 171
	//	               80: 148;
	//   55  105:lookupswitch    2: default 132
	//	               16: 171
	//	               80: 148
		   goto _L6 _L8 _L9
_L6:
		return ((LayoutParams)view.getLayoutParams()).topMargin + i + j;
	//   56  132:aload           4
	//   57  134:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   58  137:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   59  140:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//   60  143:iload_1         
	//   61  144:iadd            
	//   62  145:iload_2         
	//   63  146:iadd            
	//   64  147:ireturn         
_L9:
		i = getBottom() - getTop() - getPaddingBottom() - mTotalLength;
	//   65  148:aload_0         
	//   66  149:invokevirtual   #325 <Method int getBottom()>
	//   67  152:aload_0         
	//   68  153:invokevirtual   #326 <Method int getTop()>
	//   69  156:isub            
	//   70  157:aload_0         
	//   71  158:invokevirtual   #261 <Method int getPaddingBottom()>
	//   72  161:isub            
	//   73  162:aload_0         
	//   74  163:getfield        #328 <Field int mTotalLength>
	//   75  166:isub            
	//   76  167:istore_1        
		continue; /* Loop/switch isn't completed */
	//   77  168:goto            132
_L8:
		i += (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - mTotalLength) / 2;
	//   78  171:iload_1         
	//   79  172:aload_0         
	//   80  173:invokevirtual   #325 <Method int getBottom()>
	//   81  176:aload_0         
	//   82  177:invokevirtual   #326 <Method int getTop()>
	//   83  180:isub            
	//   84  181:aload_0         
	//   85  182:invokevirtual   #280 <Method int getPaddingTop()>
	//   86  185:isub            
	//   87  186:aload_0         
	//   88  187:invokevirtual   #261 <Method int getPaddingBottom()>
	//   89  190:isub            
	//   90  191:aload_0         
	//   91  192:getfield        #328 <Field int mTotalLength>
	//   92  195:isub            
	//   93  196:iconst_2        
	//   94  197:idiv            
	//   95  198:iadd            
	//   96  199:istore_1        
		if(true) goto _L6; else goto _L10
	//   97  200:goto            132
_L10:
	}

	public int getBaselineAlignedChildIndex()
	{
		return mBaselineAlignedChildIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int mBaselineAlignedChildIndex>
	//    2    4:ireturn         
	}

	int getChildrenSkipCount(View view, int i)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Drawable getDividerDrawable()
	{
		return mDivider;
	//    0    0:aload_0         
	//    1    1:getfield        #269 <Field Drawable mDivider>
	//    2    4:areturn         
	}

	public int getDividerPadding()
	{
		return mDividerPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field int mDividerPadding>
	//    2    4:ireturn         
	}

	public int getDividerWidth()
	{
		return mDividerWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field int mDividerWidth>
	//    2    4:ireturn         
	}

	public int getGravity()
	{
		return mGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int mGravity>
	//    2    4:ireturn         
	}

	int getLocationOffset(View view)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	int getNextLocationOffset(View view)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getOrientation()
	{
		return mOrientation;
	//    0    0:aload_0         
	//    1    1:getfield        #284 <Field int mOrientation>
	//    2    4:ireturn         
	}

	public int getShowDividers()
	{
		return mShowDividers;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int mShowDividers>
	//    2    4:ireturn         
	}

	View getVirtualChildAt(int i)
	{
		return getChildAt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #321 <Method View getChildAt(int)>
	//    3    5:areturn         
	}

	int getVirtualChildCount()
	{
		return getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #311 <Method int getChildCount()>
	//    2    4:ireturn         
	}

	public float getWeightSum()
	{
		return mWeightSum;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field float mWeightSum>
	//    2    4:freturn         
	}

	protected boolean hasDividerBeforeChildAt(int i)
	{
		if(i != 0) goto _L2; else goto _L1
	//    0    0:iload_1         
	//    1    1:ifne            17
_L1:
		if((mShowDividers & 1) == 0) goto _L4; else goto _L3
	//    2    4:aload_0         
	//    3    5:getfield        #141 <Field int mShowDividers>
	//    4    8:iconst_1        
	//    5    9:iand            
	//    6   10:ifeq            15
_L3:
		return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
_L4:
		return false;
	//    9   15:iconst_0        
	//   10   16:ireturn         
_L2:
		if(i != getChildCount())
			break; /* Loop/switch isn't completed */
	//   11   17:iload_1         
	//   12   18:aload_0         
	//   13   19:invokevirtual   #311 <Method int getChildCount()>
	//   14   22:icmpne          36
		if((mShowDividers & 4) == 0)
	//*  15   25:aload_0         
	//*  16   26:getfield        #141 <Field int mShowDividers>
	//*  17   29:iconst_4        
	//*  18   30:iand            
	//*  19   31:ifne            13
			return false;
	//   20   34:iconst_0        
	//   21   35:ireturn         
		if(true) goto _L3; else goto _L5
_L5:
		if((mShowDividers & 2) == 0)
			break; /* Loop/switch isn't completed */
	//   22   36:aload_0         
	//   23   37:getfield        #141 <Field int mShowDividers>
	//   24   40:iconst_2        
	//   25   41:iand            
	//   26   42:ifeq            73
		i--;
	//   27   45:iload_1         
	//   28   46:iconst_1        
	//   29   47:isub            
	//   30   48:istore_1        
		do
		{
			if(i < 0)
				break MISSING_BLOCK_LABEL_75;
	//   31   49:iload_1         
	//   32   50:iflt            75
			if(getChildAt(i).getVisibility() != 8)
				break;
	//   33   53:aload_0         
	//   34   54:iload_1         
	//   35   55:invokevirtual   #321 <Method View getChildAt(int)>
	//   36   58:invokevirtual   #174 <Method int View.getVisibility()>
	//   37   61:bipush          8
	//   38   63:icmpne          13
			i--;
	//   39   66:iload_1         
	//   40   67:iconst_1        
	//   41   68:isub            
	//   42   69:istore_1        
		} while(true);
	//   43   70:goto            49
		if(true) goto _L3; else goto _L6
_L6:
		return false;
	//   44   73:iconst_0        
	//   45   74:ireturn         
		return false;
	//   46   75:iconst_0        
	//   47   76:ireturn         
	}

	public boolean isBaselineAligned()
	{
		return mBaselineAligned;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean mBaselineAligned>
	//    2    4:ireturn         
	}

	public boolean isMeasureWithLargestChildEnabled()
	{
		return mUseLargestChild;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field boolean mUseLargestChild>
	//    2    4:ireturn         
	}

	void layoutHorizontal(int i, int j, int k, int l)
	{
		int k1;
		int i2;
		int j2;
		int k2;
		int l2;
		int i3;
		boolean flag;
		boolean flag1;
		int ai[];
		int ai1[];
		flag = ViewUtils.isLayoutRtl(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #212 <Method boolean ViewUtils.isLayoutRtl(View)>
	//    2    4:istore          17
		k1 = getPaddingTop();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #280 <Method int getPaddingTop()>
	//    5   10:istore          7
		i2 = l - j;
	//    6   12:iload           4
	//    7   14:iload_2         
	//    8   15:isub            
	//    9   16:istore          9
		j2 = getPaddingBottom();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #261 <Method int getPaddingBottom()>
	//   12   22:istore          10
		k2 = getPaddingBottom();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #261 <Method int getPaddingBottom()>
	//   15   28:istore          11
		l2 = getVirtualChildCount();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #206 <Method int getVirtualChildCount()>
	//   18   34:istore          12
		j = mGravity;
	//   19   36:aload_0         
	//   20   37:getfield        #68  <Field int mGravity>
	//   21   40:istore_2        
		i3 = mGravity;
	//   22   41:aload_0         
	//   23   42:getfield        #68  <Field int mGravity>
	//   24   45:istore          13
		flag1 = mBaselineAligned;
	//   25   47:aload_0         
	//   26   48:getfield        #61  <Field boolean mBaselineAligned>
	//   27   51:istore          18
		ai = mMaxAscent;
	//   28   53:aload_0         
	//   29   54:getfield        #354 <Field int[] mMaxAscent>
	//   30   57:astore          19
		ai1 = mMaxDescent;
	//   31   59:aload_0         
	//   32   60:getfield        #356 <Field int[] mMaxDescent>
	//   33   63:astore          20
		GravityCompat.getAbsoluteGravity(j & 0x800007, ViewCompat.getLayoutDirection(((View) (this))));
	//   34   65:iload_2         
	//   35   66:ldc2            #357 <Int 0x800007>
	//   36   69:iand            
	//   37   70:aload_0         
	//   38   71:invokestatic    #362 <Method int ViewCompat.getLayoutDirection(View)>
	//   39   74:invokestatic    #367 <Method int GravityCompat.getAbsoluteGravity(int, int)>
		JVM INSTR lookupswitch 2: default 104
	//	               1: 190
	//	               5: 173;
	//   40   77:lookupswitch    2: default 104
	//	               1: 190
	//	               5: 173
		   goto _L1 _L2 _L3
_L1:
		i = getPaddingLeft();
	//   41  104:aload_0         
	//   42  105:invokevirtual   #237 <Method int getPaddingLeft()>
	//   43  108:istore_1        
_L9:
		int i1;
		int j1;
		int l1;
		int j3;
		int k3;
		int l3;
		View view;
		LayoutParams layoutparams;
		if(flag)
	//*  44  109:iload           17
	//*  45  111:ifeq            529
		{
			l = -1;
	//   46  114:iconst_m1       
	//   47  115:istore          4
			i1 = l2 - 1;
	//   48  117:iload           12
	//   49  119:iconst_1        
	//   50  120:isub            
	//   51  121:istore          5
		} else
	//*  52  123:iconst_0        
	//*  53  124:istore_2        
	//*  54  125:iload_1         
	//*  55  126:istore_3        
	//*  56  127:iload_2         
	//*  57  128:iload           12
	//*  58  130:icmpge          514
	//*  59  133:iload           5
	//*  60  135:iload           4
	//*  61  137:iload_2         
	//*  62  138:imul            
	//*  63  139:iadd            
	//*  64  140:istore          14
	//*  65  142:aload_0         
	//*  66  143:iload           14
	//*  67  145:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//*  68  148:astore          21
	//*  69  150:aload           21
	//*  70  152:ifnonnull       209
	//*  71  155:iload_3         
	//*  72  156:aload_0         
	//*  73  157:iload           14
	//*  74  159:invokevirtual   #371 <Method int measureNullChild(int)>
	//*  75  162:iadd            
	//*  76  163:istore_3        
	//*  77  164:iload_2         
	//*  78  165:istore_1        
	//*  79  166:iload_1         
	//*  80  167:iconst_1        
	//*  81  168:iadd            
	//*  82  169:istore_2        
	//*  83  170:goto            127
	//*  84  173:aload_0         
	//*  85  174:invokevirtual   #237 <Method int getPaddingLeft()>
	//*  86  177:iload_3         
	//*  87  178:iadd            
	//*  88  179:iload_1         
	//*  89  180:isub            
	//*  90  181:aload_0         
	//*  91  182:getfield        #328 <Field int mTotalLength>
	//*  92  185:isub            
	//*  93  186:istore_1        
	//*  94  187:goto            109
	//*  95  190:aload_0         
	//*  96  191:invokevirtual   #237 <Method int getPaddingLeft()>
	//*  97  194:iload_3         
	//*  98  195:iload_1         
	//*  99  196:isub            
	//* 100  197:aload_0         
	//* 101  198:getfield        #328 <Field int mTotalLength>
	//* 102  201:isub            
	//* 103  202:iconst_2        
	//* 104  203:idiv            
	//* 105  204:iadd            
	//* 106  205:istore_1        
	//* 107  206:goto            109
	//* 108  209:aload           21
	//* 109  211:invokevirtual   #174 <Method int View.getVisibility()>
	//* 110  214:bipush          8
	//* 111  216:icmpeq          524
	//* 112  219:aload           21
	//* 113  221:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//* 114  224:istore          15
	//* 115  226:aload           21
	//* 116  228:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//* 117  231:istore          16
	//* 118  233:aload           21
	//* 119  235:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 120  238:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//* 121  241:astore          22
	//* 122  243:iload           18
	//* 123  245:ifeq            518
	//* 124  248:aload           22
	//* 125  250:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 126  253:iconst_m1       
	//* 127  254:icmpeq          518
	//* 128  257:aload           21
	//* 129  259:invokevirtual   #322 <Method int View.getBaseline()>
	//* 130  262:istore          6
	//* 131  264:aload           22
	//* 132  266:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//* 133  269:istore          8
	//* 134  271:iload           8
	//* 135  273:istore_1        
	//* 136  274:iload           8
	//* 137  276:ifge            285
	//* 138  279:iload           13
	//* 139  281:bipush          112
	//* 140  283:iand            
	//* 141  284:istore_1        
	//* 142  285:iload_1         
	//* 143  286:bipush          112
	//* 144  288:iand            
	//* 145  289:lookupswitch    3: default 324
	//	               16: 435
	//	               48: 402
	//	               80: 467
	//* 146  324:iload           7
	//* 147  326:istore_1        
	//* 148  327:aload_0         
	//* 149  328:iload           14
	//* 150  330:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 151  333:ifeq            515
	//* 152  336:aload_0         
	//* 153  337:getfield        #234 <Field int mDividerWidth>
	//* 154  340:iload_3         
	//* 155  341:iadd            
	//* 156  342:istore_3        
	//* 157  343:iload_3         
	//* 158  344:aload           22
	//* 159  346:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//* 160  349:iadd            
	//* 161  350:istore_3        
	//* 162  351:aload_0         
	//* 163  352:aload           21
	//* 164  354:iload_3         
	//* 165  355:aload_0         
	//* 166  356:aload           21
	//* 167  358:invokevirtual   #376 <Method int getLocationOffset(View)>
	//* 168  361:iadd            
	//* 169  362:iload_1         
	//* 170  363:iload           15
	//* 171  365:iload           16
	//* 172  367:invokespecial   #378 <Method void setChildFrame(View, int, int, int, int)>
	//* 173  370:iload_3         
	//* 174  371:aload           22
	//* 175  373:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//* 176  376:iload           15
	//* 177  378:iadd            
	//* 178  379:aload_0         
	//* 179  380:aload           21
	//* 180  382:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//* 181  385:iadd            
	//* 182  386:iadd            
	//* 183  387:istore_3        
	//* 184  388:aload_0         
	//* 185  389:aload           21
	//* 186  391:iload           14
	//* 187  393:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//* 188  396:iload_2         
	//* 189  397:iadd            
	//* 190  398:istore_1        
	//* 191  399:goto            166
	//* 192  402:iload           7
	//* 193  404:aload           22
	//* 194  406:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//* 195  409:iadd            
	//* 196  410:istore          8
	//* 197  412:iload           8
	//* 198  414:istore_1        
	//* 199  415:iload           6
	//* 200  417:iconst_m1       
	//* 201  418:icmpeq          327
	//* 202  421:iload           8
	//* 203  423:aload           19
	//* 204  425:iconst_1        
	//* 205  426:iaload          
	//* 206  427:iload           6
	//* 207  429:isub            
	//* 208  430:iadd            
	//* 209  431:istore_1        
	//* 210  432:goto            327
	//* 211  435:iload           9
	//* 212  437:iload           7
	//* 213  439:isub            
	//* 214  440:iload           11
	//* 215  442:isub            
	//* 216  443:iload           16
	//* 217  445:isub            
	//* 218  446:iconst_2        
	//* 219  447:idiv            
	//* 220  448:iload           7
	//* 221  450:iadd            
	//* 222  451:aload           22
	//* 223  453:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//* 224  456:iadd            
	//* 225  457:aload           22
	//* 226  459:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//* 227  462:isub            
	//* 228  463:istore_1        
	//* 229  464:goto            327
	//* 230  467:iload           9
	//* 231  469:iload           10
	//* 232  471:isub            
	//* 233  472:iload           16
	//* 234  474:isub            
	//* 235  475:aload           22
	//* 236  477:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//* 237  480:isub            
	//* 238  481:istore          8
	//* 239  483:iload           8
	//* 240  485:istore_1        
	//* 241  486:iload           6
	//* 242  488:iconst_m1       
	//* 243  489:icmpeq          327
	//* 244  492:aload           21
	//* 245  494:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//* 246  497:istore_1        
	//* 247  498:iload           8
	//* 248  500:aload           20
	//* 249  502:iconst_2        
	//* 250  503:iaload          
	//* 251  504:iload_1         
	//* 252  505:iload           6
	//* 253  507:isub            
	//* 254  508:isub            
	//* 255  509:isub            
	//* 256  510:istore_1        
	//* 257  511:goto            327
	//* 258  514:return          
	//* 259  515:goto            343
	//* 260  518:iconst_m1       
	//* 261  519:istore          6
	//* 262  521:goto            264
	//* 263  524:iload_2         
	//* 264  525:istore_1        
	//* 265  526:goto            166
		{
			l = 1;
	//  266  529:iconst_1        
	//  267  530:istore          4
			i1 = 0;
	//  268  532:iconst_0        
	//  269  533:istore          5
		}
		j = 0;
		k = i;
_L8:
		if(j >= l2) goto _L5; else goto _L4
_L4:
		j3 = i1 + l * j;
		view = getVirtualChildAt(j3);
		if(view != null) goto _L7; else goto _L6
_L6:
		k += measureNullChild(j3);
		i = j;
_L14:
		j = i + 1;
		  goto _L8
_L3:
		i = (getPaddingLeft() + k) - i - mTotalLength;
		  goto _L9
_L2:
		i = getPaddingLeft() + (k - i - mTotalLength) / 2;
		  goto _L9
_L7:
		if(view.getVisibility() == 8)
			break MISSING_BLOCK_LABEL_524;
		k3 = view.getMeasuredWidth();
		l3 = view.getMeasuredHeight();
		layoutparams = (LayoutParams)view.getLayoutParams();
		if(flag1 && layoutparams.height != -1)
			j1 = view.getBaseline();
		else
			j1 = -1;
		l1 = layoutparams.gravity;
		i = l1;
		if(l1 < 0)
			i = i3 & 0x70;
		i & 0x70;
		JVM INSTR lookupswitch 3: default 324
	//	               16: 435
	//	               48: 402
	//	               80: 467;
		   goto _L10 _L11 _L12 _L13
_L13:
		break MISSING_BLOCK_LABEL_467;
_L10:
		i = k1;
_L15:
		if(hasDividerBeforeChildAt(j3))
			k = mDividerWidth + k;
		k += layoutparams.leftMargin;
		setChildFrame(view, k + getLocationOffset(view), i, k3, l3);
		k += layoutparams.rightMargin + k3 + getNextLocationOffset(view);
		i = getChildrenSkipCount(view, j3) + j;
		  goto _L14
_L12:
		l1 = k1 + layoutparams.topMargin;
		i = l1;
		if(j1 != -1)
			i = l1 + (ai[1] - j1);
		  goto _L15
_L11:
		i = ((i2 - k1 - k2 - l3) / 2 + k1 + layoutparams.topMargin) - layoutparams.bottomMargin;
		  goto _L15
		l1 = i2 - j2 - l3 - layoutparams.bottomMargin;
		i = l1;
		if(j1 != -1)
		{
			i = view.getMeasuredHeight();
			i = l1 - (ai1[2] - (i - j1));
		}
		  goto _L15
_L5:
		return;
		i = j;
		  goto _L14
	//* 270  535:goto            123
	}

	void layoutVertical(int i, int j, int k, int l)
	{
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		int j2;
		i1 = getPaddingLeft();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #237 <Method int getPaddingLeft()>
	//    2    4:istore          5
		j1 = k - i;
	//    3    6:iload_3         
	//    4    7:iload_1         
	//    5    8:isub            
	//    6    9:istore          6
		k1 = getPaddingRight();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #243 <Method int getPaddingRight()>
	//    9   15:istore          7
		l1 = getPaddingRight();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #243 <Method int getPaddingRight()>
	//   12   21:istore          8
		i2 = getVirtualChildCount();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #206 <Method int getVirtualChildCount()>
	//   15   27:istore          9
		i = mGravity;
	//   16   29:aload_0         
	//   17   30:getfield        #68  <Field int mGravity>
	//   18   33:istore_1        
		j2 = mGravity;
	//   19   34:aload_0         
	//   20   35:getfield        #68  <Field int mGravity>
	//   21   38:istore          10
		i & 0x70;
	//   22   40:iload_1         
	//   23   41:bipush          112
	//   24   43:iand            
		JVM INSTR lookupswitch 2: default 72
	//	               16: 134
	//	               80: 116;
	//   25   44:lookupswitch    2: default 72
	//	               16: 134
	//	               80: 116
		   goto _L1 _L2 _L3
_L1:
		i = getPaddingTop();
	//   26   72:aload_0         
	//   27   73:invokevirtual   #280 <Method int getPaddingTop()>
	//   28   76:istore_1        
_L15:
		k = 0;
	//   29   77:iconst_0        
	//   30   78:istore_3        
		j = i;
	//   31   79:iload_1         
	//   32   80:istore_2        
		i = k;
	//   33   81:iload_3         
	//   34   82:istore_1        
_L7:
		View view;
		if(i >= i2)
			break; /* Loop/switch isn't completed */
	//   35   83:iload_1         
	//   36   84:iload           9
	//   37   86:icmpge          380
		view = getVirtualChildAt(i);
	//   38   89:aload_0         
	//   39   90:iload_1         
	//   40   91:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   41   94:astore          13
		if(view != null) goto _L5; else goto _L4
	//   42   96:aload           13
	//   43   98:ifnonnull       154
_L4:
		j += measureNullChild(i);
	//   44  101:iload_2         
	//   45  102:aload_0         
	//   46  103:iload_1         
	//   47  104:invokevirtual   #371 <Method int measureNullChild(int)>
	//   48  107:iadd            
	//   49  108:istore_2        
_L9:
		i++;
	//   50  109:iload_1         
	//   51  110:iconst_1        
	//   52  111:iadd            
	//   53  112:istore_1        
		if(true) goto _L7; else goto _L6
	//   54  113:goto            83
_L3:
		i = (getPaddingTop() + l) - j - mTotalLength;
	//   55  116:aload_0         
	//   56  117:invokevirtual   #280 <Method int getPaddingTop()>
	//   57  120:iload           4
	//   58  122:iadd            
	//   59  123:iload_2         
	//   60  124:isub            
	//   61  125:aload_0         
	//   62  126:getfield        #328 <Field int mTotalLength>
	//   63  129:isub            
	//   64  130:istore_1        
		continue; /* Loop/switch isn't completed */
	//   65  131:goto            77
_L2:
		i = getPaddingTop() + (l - j - mTotalLength) / 2;
	//   66  134:aload_0         
	//   67  135:invokevirtual   #280 <Method int getPaddingTop()>
	//   68  138:iload           4
	//   69  140:iload_2         
	//   70  141:isub            
	//   71  142:aload_0         
	//   72  143:getfield        #328 <Field int mTotalLength>
	//   73  146:isub            
	//   74  147:iconst_2        
	//   75  148:idiv            
	//   76  149:iadd            
	//   77  150:istore_1        
		continue; /* Loop/switch isn't completed */
	//   78  151:goto            77
_L5:
		if(view.getVisibility() == 8) goto _L9; else goto _L8
	//   79  154:aload           13
	//   80  156:invokevirtual   #174 <Method int View.getVisibility()>
	//   81  159:bipush          8
	//   82  161:icmpeq          384
_L8:
		int k2;
		int l2;
		LayoutParams layoutparams;
		k2 = view.getMeasuredWidth();
	//   83  164:aload           13
	//   84  166:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//   85  169:istore          11
		l2 = view.getMeasuredHeight();
	//   86  171:aload           13
	//   87  173:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//   88  176:istore          12
		layoutparams = (LayoutParams)view.getLayoutParams();
	//   89  178:aload           13
	//   90  180:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   91  183:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   92  186:astore          14
		l = layoutparams.gravity;
	//   93  188:aload           14
	//   94  190:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//   95  193:istore          4
		k = l;
	//   96  195:iload           4
	//   97  197:istore_3        
		if(l < 0)
	//*  98  198:iload           4
	//*  99  200:ifge            210
			k = j2 & 0x800007;
	//  100  203:iload           10
	//  101  205:ldc2            #357 <Int 0x800007>
	//  102  208:iand            
	//  103  209:istore_3        
		GravityCompat.getAbsoluteGravity(k, ViewCompat.getLayoutDirection(((View) (this)))) & 7;
	//  104  210:iload_3         
	//  105  211:aload_0         
	//  106  212:invokestatic    #362 <Method int ViewCompat.getLayoutDirection(View)>
	//  107  215:invokestatic    #367 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//  108  218:bipush          7
	//  109  220:iand            
		JVM INSTR lookupswitch 2: default 248
	//	               1: 330
	//	               5: 362;
	//  110  221:lookupswitch    2: default 248
	//	               1: 330
	//	               5: 362
		   goto _L10 _L11 _L12
_L12:
		break MISSING_BLOCK_LABEL_362;
_L10:
		k = i1 + layoutparams.leftMargin;
	//  111  248:iload           5
	//  112  250:aload           14
	//  113  252:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  114  255:iadd            
	//  115  256:istore_3        
_L13:
		if(hasDividerBeforeChildAt(i))
	//* 116  257:aload_0         
	//* 117  258:iload_1         
	//* 118  259:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 119  262:ifeq            381
			j = mDividerHeight + j;
	//  120  265:aload_0         
	//  121  266:getfield        #252 <Field int mDividerHeight>
	//  122  269:iload_2         
	//  123  270:iadd            
	//  124  271:istore_2        
		j += layoutparams.topMargin;
	//  125  272:iload_2         
	//  126  273:aload           14
	//  127  275:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  128  278:iadd            
	//  129  279:istore_2        
		setChildFrame(view, k, j + getLocationOffset(view), k2, l2);
	//  130  280:aload_0         
	//  131  281:aload           13
	//  132  283:iload_3         
	//  133  284:iload_2         
	//  134  285:aload_0         
	//  135  286:aload           13
	//  136  288:invokevirtual   #376 <Method int getLocationOffset(View)>
	//  137  291:iadd            
	//  138  292:iload           11
	//  139  294:iload           12
	//  140  296:invokespecial   #378 <Method void setChildFrame(View, int, int, int, int)>
		j += layoutparams.bottomMargin + l2 + getNextLocationOffset(view);
	//  141  299:iload_2         
	//  142  300:aload           14
	//  143  302:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  144  305:iload           12
	//  145  307:iadd            
	//  146  308:aload_0         
	//  147  309:aload           13
	//  148  311:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  149  314:iadd            
	//  150  315:iadd            
	//  151  316:istore_2        
		i = getChildrenSkipCount(view, i) + i;
	//  152  317:aload_0         
	//  153  318:aload           13
	//  154  320:iload_1         
	//  155  321:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//  156  324:iload_1         
	//  157  325:iadd            
	//  158  326:istore_1        
		  goto _L9
	//* 159  327:goto            109
_L11:
		k = ((j1 - i1 - l1 - k2) / 2 + i1 + layoutparams.leftMargin) - layoutparams.rightMargin;
	//  160  330:iload           6
	//  161  332:iload           5
	//  162  334:isub            
	//  163  335:iload           8
	//  164  337:isub            
	//  165  338:iload           11
	//  166  340:isub            
	//  167  341:iconst_2        
	//  168  342:idiv            
	//  169  343:iload           5
	//  170  345:iadd            
	//  171  346:aload           14
	//  172  348:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  173  351:iadd            
	//  174  352:aload           14
	//  175  354:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  176  357:isub            
	//  177  358:istore_3        
		  goto _L13
	//* 178  359:goto            257
		k = j1 - k1 - k2 - layoutparams.rightMargin;
	//  179  362:iload           6
	//  180  364:iload           7
	//  181  366:isub            
	//  182  367:iload           11
	//  183  369:isub            
	//  184  370:aload           14
	//  185  372:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  186  375:isub            
	//  187  376:istore_3        
		  goto _L13
	//* 188  377:goto            257
_L6:
		return;
	//  189  380:return          
		if(true) goto _L15; else goto _L14
_L14:
	//* 190  381:goto            272
	//* 191  384:goto            109
	}

	void measureChildBeforeLayout(View view, int i, int j, int k, int l, int i1)
	{
		measureChildWithMargins(view, j, k, l, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:iload           6
	//    6    9:invokevirtual   #191 <Method void measureChildWithMargins(View, int, int, int, int)>
	//    7   12:return          
	}

	void measureHorizontal(int i, int j)
	{
		mTotalLength = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #328 <Field int mTotalLength>
		int i1 = 0;
	//    3    5:iconst_0        
	//    4    6:istore          7
		int l = 0;
	//    5    8:iconst_0        
	//    6    9:istore          6
		int l1 = 0;
	//    7   11:iconst_0        
	//    8   12:istore          10
		int j2 = 0;
	//    9   14:iconst_0        
	//   10   15:istore          12
		int k = 1;
	//   11   17:iconst_1        
	//   12   18:istore          5
		float f = 0.0F;
	//   13   20:fconst_0        
	//   14   21:fstore_3        
		int l5 = getVirtualChildCount();
	//   15   22:aload_0         
	//   16   23:invokevirtual   #206 <Method int getVirtualChildCount()>
	//   17   26:istore          20
		int j6 = android.view.View.MeasureSpec.getMode(i);
	//   18   28:iload_1         
	//   19   29:invokestatic    #389 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   20   32:istore          22
		int i6 = android.view.View.MeasureSpec.getMode(j);
	//   21   34:iload_2         
	//   22   35:invokestatic    #389 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   23   38:istore          21
		int i2 = 0;
	//   24   40:iconst_0        
	//   25   41:istore          11
		int k1 = 0;
	//   26   43:iconst_0        
	//   27   44:istore          9
		if(mMaxAscent == null || mMaxDescent == null)
	//*  28   46:aload_0         
	//*  29   47:getfield        #354 <Field int[] mMaxAscent>
	//*  30   50:ifnull          60
	//*  31   53:aload_0         
	//*  32   54:getfield        #356 <Field int[] mMaxDescent>
	//*  33   57:ifnonnull       74
		{
			mMaxAscent = new int[4];
	//   34   60:aload_0         
	//   35   61:iconst_4        
	//   36   62:newarray        int[]
	//   37   64:putfield        #354 <Field int[] mMaxAscent>
			mMaxDescent = new int[4];
	//   38   67:aload_0         
	//   39   68:iconst_4        
	//   40   69:newarray        int[]
	//   41   71:putfield        #356 <Field int[] mMaxDescent>
		}
		int ai[] = mMaxAscent;
	//   42   74:aload_0         
	//   43   75:getfield        #354 <Field int[] mMaxAscent>
	//   44   78:astore          25
		int ai1[] = mMaxDescent;
	//   45   80:aload_0         
	//   46   81:getfield        #356 <Field int[] mMaxDescent>
	//   47   84:astore          26
		ai[3] = -1;
	//   48   86:aload           25
	//   49   88:iconst_3        
	//   50   89:iconst_m1       
	//   51   90:iastore         
		ai[2] = -1;
	//   52   91:aload           25
	//   53   93:iconst_2        
	//   54   94:iconst_m1       
	//   55   95:iastore         
		ai[1] = -1;
	//   56   96:aload           25
	//   57   98:iconst_1        
	//   58   99:iconst_m1       
	//   59  100:iastore         
		ai[0] = -1;
	//   60  101:aload           25
	//   61  103:iconst_0        
	//   62  104:iconst_m1       
	//   63  105:iastore         
		ai1[3] = -1;
	//   64  106:aload           26
	//   65  108:iconst_3        
	//   66  109:iconst_m1       
	//   67  110:iastore         
		ai1[2] = -1;
	//   68  111:aload           26
	//   69  113:iconst_2        
	//   70  114:iconst_m1       
	//   71  115:iastore         
		ai1[1] = -1;
	//   72  116:aload           26
	//   73  118:iconst_1        
	//   74  119:iconst_m1       
	//   75  120:iastore         
		ai1[0] = -1;
	//   76  121:aload           26
	//   77  123:iconst_0        
	//   78  124:iconst_m1       
	//   79  125:iastore         
		boolean flag1 = mBaselineAligned;
	//   80  126:aload_0         
	//   81  127:getfield        #61  <Field boolean mBaselineAligned>
	//   82  130:istore          23
		boolean flag2 = mUseLargestChild;
	//   83  132:aload_0         
	//   84  133:getfield        #125 <Field boolean mUseLargestChild>
	//   85  136:istore          24
		int j1;
		int k2;
		boolean flag;
		if(j6 == 0x40000000)
	//*  86  138:iload           22
	//*  87  140:ldc1            #160 <Int 0x40000000>
	//*  88  142:icmpne          256
			flag = true;
	//   89  145:iconst_1        
	//   90  146:istore          16
		else
	//*  91  148:ldc2            #390 <Int 0x80000000>
	//*  92  151:istore          8
	//*  93  153:iconst_0        
	//*  94  154:istore          13
	//*  95  156:iload           13
	//*  96  158:iload           20
	//*  97  160:icmpge          989
	//*  98  163:aload_0         
	//*  99  164:iload           13
	//* 100  166:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//* 101  169:astore          27
	//* 102  171:aload           27
	//* 103  173:ifnonnull       262
	//* 104  176:aload_0         
	//* 105  177:aload_0         
	//* 106  178:getfield        #328 <Field int mTotalLength>
	//* 107  181:aload_0         
	//* 108  182:iload           13
	//* 109  184:invokevirtual   #371 <Method int measureNullChild(int)>
	//* 110  187:iadd            
	//* 111  188:putfield        #328 <Field int mTotalLength>
	//* 112  191:iload           8
	//* 113  193:istore          14
	//* 114  195:iload           9
	//* 115  197:istore          15
	//* 116  199:iload           7
	//* 117  201:istore          9
	//* 118  203:iload           6
	//* 119  205:istore          8
	//* 120  207:iload           5
	//* 121  209:istore          7
	//* 122  211:iload           15
	//* 123  213:istore          6
	//* 124  215:iload           14
	//* 125  217:istore          5
	//* 126  219:iload           13
	//* 127  221:iconst_1        
	//* 128  222:iadd            
	//* 129  223:istore          13
	//* 130  225:iload           8
	//* 131  227:istore          14
	//* 132  229:iload           9
	//* 133  231:istore          15
	//* 134  233:iload           5
	//* 135  235:istore          8
	//* 136  237:iload           6
	//* 137  239:istore          9
	//* 138  241:iload           7
	//* 139  243:istore          5
	//* 140  245:iload           14
	//* 141  247:istore          6
	//* 142  249:iload           15
	//* 143  251:istore          7
	//* 144  253:goto            156
			flag = false;
	//  145  256:iconst_0        
	//  146  257:istore          16
		j1 = 0x80000000;
		k2 = 0;
		while(k2 < l5) 
		{
			View view1 = getVirtualChildAt(k2);
			int i3;
			int i4;
			if(view1 == null)
			{
				mTotalLength = mTotalLength + measureNullChild(k2);
				int l2 = j1;
				int l3 = k1;
				k1 = i1;
				j1 = l;
				i1 = k;
				l = l3;
				k = l2;
			} else
	//* 147  259:goto            148
			if(view1.getVisibility() == 8)
	//* 148  262:aload           27
	//* 149  264:invokevirtual   #174 <Method int View.getVisibility()>
	//* 150  267:bipush          8
	//* 151  269:icmpne          332
			{
				int l4 = k2 + getChildrenSkipCount(view1, k2);
	//  152  272:iload           13
	//  153  274:aload_0         
	//  154  275:aload           27
	//  155  277:iload           13
	//  156  279:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//  157  282:iadd            
	//  158  283:istore          17
				k2 = j1;
	//  159  285:iload           8
	//  160  287:istore          13
				int j4 = k1;
	//  161  289:iload           9
	//  162  291:istore          15
				j1 = k;
	//  163  293:iload           5
	//  164  295:istore          8
				k1 = l;
	//  165  297:iload           6
	//  166  299:istore          9
				int j3 = i1;
	//  167  301:iload           7
	//  168  303:istore          14
				k = k2;
	//  169  305:iload           13
	//  170  307:istore          5
				l = j4;
	//  171  309:iload           15
	//  172  311:istore          6
				k2 = l4;
	//  173  313:iload           17
	//  174  315:istore          13
				i1 = j1;
	//  175  317:iload           8
	//  176  319:istore          7
				j1 = k1;
	//  177  321:iload           9
	//  178  323:istore          8
				k1 = j3;
	//  179  325:iload           14
	//  180  327:istore          9
			} else
	//* 181  329:goto            219
			{
				if(hasDividerBeforeChildAt(k2))
	//* 182  332:aload_0         
	//* 183  333:iload           13
	//* 184  335:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 185  338:ifeq            354
					mTotalLength = mTotalLength + mDividerWidth;
	//  186  341:aload_0         
	//  187  342:aload_0         
	//  188  343:getfield        #328 <Field int mTotalLength>
	//  189  346:aload_0         
	//  190  347:getfield        #234 <Field int mDividerWidth>
	//  191  350:iadd            
	//  192  351:putfield        #328 <Field int mTotalLength>
				LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
	//  193  354:aload           27
	//  194  356:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  195  359:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  196  362:astore          28
				f += layoutparams.weight;
	//  197  364:fload_3         
	//  198  365:aload           28
	//  199  367:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  200  370:fadd            
	//  201  371:fstore_3        
				int k3;
				int k4;
				int i5;
				if(j6 == 0x40000000 && layoutparams.width == 0 && layoutparams.weight > 0.0F)
	//* 202  372:iload           22
	//* 203  374:ldc1            #160 <Int 0x40000000>
	//* 204  376:icmpne          738
	//* 205  379:aload           28
	//* 206  381:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 207  384:ifne            738
	//* 208  387:aload           28
	//* 209  389:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 210  392:fconst_0        
	//* 211  393:fcmpl           
	//* 212  394:ifle            738
				{
					int j5;
					int k5;
					if(flag)
	//* 213  397:iload           16
	//* 214  399:ifeq            696
					{
						mTotalLength = mTotalLength + (layoutparams.leftMargin + layoutparams.rightMargin);
	//  215  402:aload_0         
	//  216  403:aload_0         
	//  217  404:getfield        #328 <Field int mTotalLength>
	//  218  407:aload           28
	//  219  409:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  220  412:aload           28
	//  221  414:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  222  417:iadd            
	//  223  418:iadd            
	//  224  419:putfield        #328 <Field int mTotalLength>
					} else
	//* 225  422:iload           23
	//* 226  424:ifeq            728
	//* 227  427:iconst_0        
	//* 228  428:iconst_0        
	//* 229  429:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 230  432:istore          14
	//* 231  434:aload           27
	//* 232  436:iload           14
	//* 233  438:iload           14
	//* 234  440:invokevirtual   #396 <Method void View.measure(int, int)>
	//* 235  443:iload           9
	//* 236  445:istore          15
	//* 237  447:iload           8
	//* 238  449:istore          14
	//* 239  451:iconst_0        
	//* 240  452:istore          9
	//* 241  454:iload           21
	//* 242  456:ldc1            #160 <Int 0x40000000>
	//* 243  458:icmpeq          2370
	//* 244  461:aload           28
	//* 245  463:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 246  466:iconst_m1       
	//* 247  467:icmpne          2370
	//* 248  470:iconst_1        
	//* 249  471:istore          8
	//* 250  473:iconst_1        
	//* 251  474:istore          9
	//* 252  476:aload           28
	//* 253  478:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//* 254  481:istore          11
	//* 255  483:aload           28
	//* 256  485:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//* 257  488:iload           11
	//* 258  490:iadd            
	//* 259  491:istore          11
	//* 260  493:aload           27
	//* 261  495:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//* 262  498:iload           11
	//* 263  500:iadd            
	//* 264  501:istore          17
	//* 265  503:iload           6
	//* 266  505:aload           27
	//* 267  507:invokevirtual   #399 <Method int View.getMeasuredState()>
	//* 268  510:invokestatic    #402 <Method int View.combineMeasuredStates(int, int)>
	//* 269  513:istore          18
	//* 270  515:iload           23
	//* 271  517:ifeq            594
	//* 272  520:aload           27
	//* 273  522:invokevirtual   #322 <Method int View.getBaseline()>
	//* 274  525:istore          19
	//* 275  527:iload           19
	//* 276  529:iconst_m1       
	//* 277  530:icmpeq          594
	//* 278  533:aload           28
	//* 279  535:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//* 280  538:ifge            938
	//* 281  541:aload_0         
	//* 282  542:getfield        #68  <Field int mGravity>
	//* 283  545:istore          6
	//* 284  547:iload           6
	//* 285  549:bipush          112
	//* 286  551:iand            
	//* 287  552:iconst_4        
	//* 288  553:ishr            
	//* 289  554:bipush          -2
	//* 290  556:iand            
	//* 291  557:iconst_1        
	//* 292  558:ishr            
	//* 293  559:istore          6
	//* 294  561:aload           25
	//* 295  563:iload           6
	//* 296  565:aload           25
	//* 297  567:iload           6
	//* 298  569:iaload          
	//* 299  570:iload           19
	//* 300  572:invokestatic    #407 <Method int Math.max(int, int)>
	//* 301  575:iastore         
	//* 302  576:aload           26
	//* 303  578:iload           6
	//* 304  580:aload           26
	//* 305  582:iload           6
	//* 306  584:iaload          
	//* 307  585:iload           17
	//* 308  587:iload           19
	//* 309  589:isub            
	//* 310  590:invokestatic    #407 <Method int Math.max(int, int)>
	//* 311  593:iastore         
	//* 312  594:iload           7
	//* 313  596:iload           17
	//* 314  598:invokestatic    #407 <Method int Math.max(int, int)>
	//* 315  601:istore          19
	//* 316  603:iload           5
	//* 317  605:ifeq            948
	//* 318  608:aload           28
	//* 319  610:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 320  613:iconst_m1       
	//* 321  614:icmpne          948
	//* 322  617:iconst_1        
	//* 323  618:istore          7
	//* 324  620:aload           28
	//* 325  622:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 326  625:fconst_0        
	//* 327  626:fcmpl           
	//* 328  627:ifle            961
	//* 329  630:iload           9
	//* 330  632:ifeq            954
	//* 331  635:iload           12
	//* 332  637:iload           11
	//* 333  639:invokestatic    #407 <Method int Math.max(int, int)>
	//* 334  642:istore          6
	//* 335  644:iload           10
	//* 336  646:istore          5
	//* 337  648:iload           13
	//* 338  650:aload_0         
	//* 339  651:aload           27
	//* 340  653:iload           13
	//* 341  655:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//* 342  658:iadd            
	//* 343  659:istore          13
	//* 344  661:iload           6
	//* 345  663:istore          12
	//* 346  665:iload           5
	//* 347  667:istore          10
	//* 348  669:iload           19
	//* 349  671:istore          9
	//* 350  673:iload           14
	//* 351  675:istore          5
	//* 352  677:iload           18
	//* 353  679:istore          14
	//* 354  681:iload           8
	//* 355  683:istore          11
	//* 356  685:iload           15
	//* 357  687:istore          6
	//* 358  689:iload           14
	//* 359  691:istore          8
	//* 360  693:goto            219
					{
						k3 = mTotalLength;
	//  361  696:aload_0         
	//  362  697:getfield        #328 <Field int mTotalLength>
	//  363  700:istore          14
						mTotalLength = Math.max(k3, layoutparams.leftMargin + k3 + layoutparams.rightMargin);
	//  364  702:aload_0         
	//  365  703:iload           14
	//  366  705:aload           28
	//  367  707:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  368  710:iload           14
	//  369  712:iadd            
	//  370  713:aload           28
	//  371  715:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  372  718:iadd            
	//  373  719:invokestatic    #407 <Method int Math.max(int, int)>
	//  374  722:putfield        #328 <Field int mTotalLength>
					}
					if(flag1)
					{
						k3 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
						view1.measure(k3, k3);
						k4 = k1;
						k3 = j1;
					} else
	//* 375  725:goto            422
					{
						k4 = 1;
	//  376  728:iconst_1        
	//  377  729:istore          15
						k3 = j1;
	//  378  731:iload           8
	//  379  733:istore          14
					}
				} else
	//* 380  735:goto            451
				{
					k4 = 0x80000000;
	//  381  738:ldc2            #390 <Int 0x80000000>
	//  382  741:istore          15
					k3 = k4;
	//  383  743:iload           15
	//  384  745:istore          14
					if(layoutparams.width == 0)
	//* 385  747:aload           28
	//* 386  749:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 387  752:ifne            779
					{
						k3 = k4;
	//  388  755:iload           15
	//  389  757:istore          14
						if(layoutparams.weight > 0.0F)
	//* 390  759:aload           28
	//* 391  761:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 392  764:fconst_0        
	//* 393  765:fcmpl           
	//* 394  766:ifle            779
						{
							k3 = 0;
	//  395  769:iconst_0        
	//  396  770:istore          14
							layoutparams.width = -2;
	//  397  772:aload           28
	//  398  774:bipush          -2
	//  399  776:putfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
						}
					}
					if(f == 0.0F)
	//* 400  779:fload_3         
	//* 401  780:fconst_0        
	//* 402  781:fcmpl           
	//* 403  782:ifne            890
						k4 = mTotalLength;
	//  404  785:aload_0         
	//  405  786:getfield        #328 <Field int mTotalLength>
	//  406  789:istore          15
					else
	//* 407  791:aload_0         
	//* 408  792:aload           27
	//* 409  794:iload           13
	//* 410  796:iload_1         
	//* 411  797:iload           15
	//* 412  799:iload_2         
	//* 413  800:iconst_0        
	//* 414  801:invokevirtual   #409 <Method void measureChildBeforeLayout(View, int, int, int, int, int)>
	//* 415  804:iload           14
	//* 416  806:ldc2            #390 <Int 0x80000000>
	//* 417  809:icmpeq          819
	//* 418  812:aload           28
	//* 419  814:iload           14
	//* 420  816:putfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 421  819:aload           27
	//* 422  821:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//* 423  824:istore          17
	//* 424  826:iload           16
	//* 425  828:ifeq            896
	//* 426  831:aload_0         
	//* 427  832:aload_0         
	//* 428  833:getfield        #328 <Field int mTotalLength>
	//* 429  836:aload           28
	//* 430  838:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//* 431  841:iload           17
	//* 432  843:iadd            
	//* 433  844:aload           28
	//* 434  846:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//* 435  849:iadd            
	//* 436  850:aload_0         
	//* 437  851:aload           27
	//* 438  853:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//* 439  856:iadd            
	//* 440  857:iadd            
	//* 441  858:putfield        #328 <Field int mTotalLength>
	//* 442  861:iload           8
	//* 443  863:istore          14
	//* 444  865:iload           9
	//* 445  867:istore          15
	//* 446  869:iload           24
	//* 447  871:ifeq            451
	//* 448  874:iload           17
	//* 449  876:iload           8
	//* 450  878:invokestatic    #407 <Method int Math.max(int, int)>
	//* 451  881:istore          14
	//* 452  883:iload           9
	//* 453  885:istore          15
	//* 454  887:goto            451
						k4 = 0;
	//  455  890:iconst_0        
	//  456  891:istore          15
					measureChildBeforeLayout(view1, k2, i, k4, j, 0);
					if(k3 != 0x80000000)
						layoutparams.width = k3;
					i5 = view1.getMeasuredWidth();
					if(flag)
					{
						mTotalLength = mTotalLength + (layoutparams.leftMargin + i5 + layoutparams.rightMargin + getNextLocationOffset(view1));
					} else
	//* 457  893:goto            791
					{
						k3 = mTotalLength;
	//  458  896:aload_0         
	//  459  897:getfield        #328 <Field int mTotalLength>
	//  460  900:istore          14
						mTotalLength = Math.max(k3, k3 + i5 + layoutparams.leftMargin + layoutparams.rightMargin + getNextLocationOffset(view1));
	//  461  902:aload_0         
	//  462  903:iload           14
	//  463  905:iload           14
	//  464  907:iload           17
	//  465  909:iadd            
	//  466  910:aload           28
	//  467  912:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  468  915:iadd            
	//  469  916:aload           28
	//  470  918:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  471  921:iadd            
	//  472  922:aload_0         
	//  473  923:aload           27
	//  474  925:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  475  928:iadd            
	//  476  929:invokestatic    #407 <Method int Math.max(int, int)>
	//  477  932:putfield        #328 <Field int mTotalLength>
					}
					k3 = j1;
					k4 = k1;
					if(flag2)
					{
						k3 = Math.max(i5, j1);
						k4 = k1;
					}
				}
				k1 = 0;
				float f1;
				View view;
				if(i6 != 0x40000000 && layoutparams.height == -1)
				{
					j1 = 1;
					k1 = 1;
				} else
	//* 478  935:goto            861
	//* 479  938:aload           28
	//* 480  940:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//* 481  943:istore          6
	//* 482  945:goto            547
	//* 483  948:iconst_0        
	//* 484  949:istore          7
	//* 485  951:goto            620
	//* 486  954:iload           17
	//* 487  956:istore          11
	//* 488  958:goto            635
	//* 489  961:iload           9
	//* 490  963:ifeq            982
	//* 491  966:iload           10
	//* 492  968:iload           11
	//* 493  970:invokestatic    #407 <Method int Math.max(int, int)>
	//* 494  973:istore          5
	//* 495  975:iload           12
	//* 496  977:istore          6
	//* 497  979:goto            648
	//* 498  982:iload           17
	//* 499  984:istore          11
	//* 500  986:goto            966
	//* 501  989:aload_0         
	//* 502  990:getfield        #328 <Field int mTotalLength>
	//* 503  993:ifle            1018
	//* 504  996:aload_0         
	//* 505  997:iload           20
	//* 506  999:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 507 1002:ifeq            1018
	//* 508 1005:aload_0         
	//* 509 1006:aload_0         
	//* 510 1007:getfield        #328 <Field int mTotalLength>
	//* 511 1010:aload_0         
	//* 512 1011:getfield        #234 <Field int mDividerWidth>
	//* 513 1014:iadd            
	//* 514 1015:putfield        #328 <Field int mTotalLength>
	//* 515 1018:aload           25
	//* 516 1020:iconst_1        
	//* 517 1021:iaload          
	//* 518 1022:iconst_m1       
	//* 519 1023:icmpne          1050
	//* 520 1026:aload           25
	//* 521 1028:iconst_0        
	//* 522 1029:iaload          
	//* 523 1030:iconst_m1       
	//* 524 1031:icmpne          1050
	//* 525 1034:aload           25
	//* 526 1036:iconst_2        
	//* 527 1037:iaload          
	//* 528 1038:iconst_m1       
	//* 529 1039:icmpne          1050
	//* 530 1042:aload           25
	//* 531 1044:iconst_3        
	//* 532 1045:iaload          
	//* 533 1046:iconst_m1       
	//* 534 1047:icmpeq          2363
	//* 535 1050:iload           7
	//* 536 1052:aload           25
	//* 537 1054:iconst_3        
	//* 538 1055:iaload          
	//* 539 1056:aload           25
	//* 540 1058:iconst_0        
	//* 541 1059:iaload          
	//* 542 1060:aload           25
	//* 543 1062:iconst_1        
	//* 544 1063:iaload          
	//* 545 1064:aload           25
	//* 546 1066:iconst_2        
	//* 547 1067:iaload          
	//* 548 1068:invokestatic    #407 <Method int Math.max(int, int)>
	//* 549 1071:invokestatic    #407 <Method int Math.max(int, int)>
	//* 550 1074:invokestatic    #407 <Method int Math.max(int, int)>
	//* 551 1077:aload           26
	//* 552 1079:iconst_3        
	//* 553 1080:iaload          
	//* 554 1081:aload           26
	//* 555 1083:iconst_0        
	//* 556 1084:iaload          
	//* 557 1085:aload           26
	//* 558 1087:iconst_1        
	//* 559 1088:iaload          
	//* 560 1089:aload           26
	//* 561 1091:iconst_2        
	//* 562 1092:iaload          
	//* 563 1093:invokestatic    #407 <Method int Math.max(int, int)>
	//* 564 1096:invokestatic    #407 <Method int Math.max(int, int)>
	//* 565 1099:invokestatic    #407 <Method int Math.max(int, int)>
	//* 566 1102:iadd            
	//* 567 1103:invokestatic    #407 <Method int Math.max(int, int)>
	//* 568 1106:istore          13
	//* 569 1108:iload           24
	//* 570 1110:ifeq            1306
	//* 571 1113:iload           22
	//* 572 1115:ldc2            #390 <Int 0x80000000>
	//* 573 1118:icmpeq          1126
	//* 574 1121:iload           22
	//* 575 1123:ifne            1306
	//* 576 1126:aload_0         
	//* 577 1127:iconst_0        
	//* 578 1128:putfield        #328 <Field int mTotalLength>
	//* 579 1131:iconst_0        
	//* 580 1132:istore          7
	//* 581 1134:iload           7
	//* 582 1136:iload           20
	//* 583 1138:icmpge          1306
	//* 584 1141:aload_0         
	//* 585 1142:iload           7
	//* 586 1144:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//* 587 1147:astore          27
	//* 588 1149:aload           27
	//* 589 1151:ifnonnull       1178
	//* 590 1154:aload_0         
	//* 591 1155:aload_0         
	//* 592 1156:getfield        #328 <Field int mTotalLength>
	//* 593 1159:aload_0         
	//* 594 1160:iload           7
	//* 595 1162:invokevirtual   #371 <Method int measureNullChild(int)>
	//* 596 1165:iadd            
	//* 597 1166:putfield        #328 <Field int mTotalLength>
	//* 598 1169:iload           7
	//* 599 1171:iconst_1        
	//* 600 1172:iadd            
	//* 601 1173:istore          7
	//* 602 1175:goto            1134
	//* 603 1178:aload           27
	//* 604 1180:invokevirtual   #174 <Method int View.getVisibility()>
	//* 605 1183:bipush          8
	//* 606 1185:icmpne          1204
	//* 607 1188:aload_0         
	//* 608 1189:aload           27
	//* 609 1191:iload           7
	//* 610 1193:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//* 611 1196:iload           7
	//* 612 1198:iadd            
	//* 613 1199:istore          7
	//* 614 1201:goto            1169
	//* 615 1204:aload           27
	//* 616 1206:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 617 1209:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//* 618 1212:astore          28
	//* 619 1214:iload           16
	//* 620 1216:ifeq            1260
	//* 621 1219:aload_0         
	//* 622 1220:getfield        #328 <Field int mTotalLength>
	//* 623 1223:istore          14
	//* 624 1225:aload           28
	//* 625 1227:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//* 626 1230:istore          15
	//* 627 1232:aload_0         
	//* 628 1233:aload           28
	//* 629 1235:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//* 630 1238:iload           15
	//* 631 1240:iload           8
	//* 632 1242:iadd            
	//* 633 1243:iadd            
	//* 634 1244:aload_0         
	//* 635 1245:aload           27
	//* 636 1247:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//* 637 1250:iadd            
	//* 638 1251:iload           14
	//* 639 1253:iadd            
	//* 640 1254:putfield        #328 <Field int mTotalLength>
	//* 641 1257:goto            1169
	//* 642 1260:aload_0         
	//* 643 1261:getfield        #328 <Field int mTotalLength>
	//* 644 1264:istore          14
	//* 645 1266:aload           28
	//* 646 1268:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//* 647 1271:istore          15
	//* 648 1273:aload_0         
	//* 649 1274:iload           14
	//* 650 1276:aload           28
	//* 651 1278:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//* 652 1281:iload           14
	//* 653 1283:iload           8
	//* 654 1285:iadd            
	//* 655 1286:iload           15
	//* 656 1288:iadd            
	//* 657 1289:iadd            
	//* 658 1290:aload_0         
	//* 659 1291:aload           27
	//* 660 1293:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//* 661 1296:iadd            
	//* 662 1297:invokestatic    #407 <Method int Math.max(int, int)>
	//* 663 1300:putfield        #328 <Field int mTotalLength>
	//* 664 1303:goto            1169
	//* 665 1306:aload_0         
	//* 666 1307:aload_0         
	//* 667 1308:getfield        #328 <Field int mTotalLength>
	//* 668 1311:aload_0         
	//* 669 1312:invokevirtual   #237 <Method int getPaddingLeft()>
	//* 670 1315:aload_0         
	//* 671 1316:invokevirtual   #243 <Method int getPaddingRight()>
	//* 672 1319:iadd            
	//* 673 1320:iadd            
	//* 674 1321:putfield        #328 <Field int mTotalLength>
	//* 675 1324:aload_0         
	//* 676 1325:getfield        #328 <Field int mTotalLength>
	//* 677 1328:aload_0         
	//* 678 1329:invokevirtual   #412 <Method int getSuggestedMinimumWidth()>
	//* 679 1332:invokestatic    #407 <Method int Math.max(int, int)>
	//* 680 1335:iload_1         
	//* 681 1336:iconst_0        
	//* 682 1337:invokestatic    #416 <Method int View.resolveSizeAndState(int, int, int)>
	//* 683 1340:istore          17
	//* 684 1342:ldc2            #417 <Int 0xffffff>
	//* 685 1345:iload           17
	//* 686 1347:iand            
	//* 687 1348:aload_0         
	//* 688 1349:getfield        #328 <Field int mTotalLength>
	//* 689 1352:isub            
	//* 690 1353:istore          7
	//* 691 1355:iload           9
	//* 692 1357:ifne            1371
	//* 693 1360:iload           7
	//* 694 1362:ifeq            2207
	//* 695 1365:fload_3         
	//* 696 1366:fconst_0        
	//* 697 1367:fcmpl           
	//* 698 1368:ifle            2207
	//* 699 1371:aload_0         
	//* 700 1372:getfield        #117 <Field float mWeightSum>
	//* 701 1375:fconst_0        
	//* 702 1376:fcmpl           
	//* 703 1377:ifle            1385
	//* 704 1380:aload_0         
	//* 705 1381:getfield        #117 <Field float mWeightSum>
	//* 706 1384:fstore_3        
	//* 707 1385:aload           25
	//* 708 1387:iconst_3        
	//* 709 1388:iconst_m1       
	//* 710 1389:iastore         
	//* 711 1390:aload           25
	//* 712 1392:iconst_2        
	//* 713 1393:iconst_m1       
	//* 714 1394:iastore         
	//* 715 1395:aload           25
	//* 716 1397:iconst_1        
	//* 717 1398:iconst_m1       
	//* 718 1399:iastore         
	//* 719 1400:aload           25
	//* 720 1402:iconst_0        
	//* 721 1403:iconst_m1       
	//* 722 1404:iastore         
	//* 723 1405:aload           26
	//* 724 1407:iconst_3        
	//* 725 1408:iconst_m1       
	//* 726 1409:iastore         
	//* 727 1410:aload           26
	//* 728 1412:iconst_2        
	//* 729 1413:iconst_m1       
	//* 730 1414:iastore         
	//* 731 1415:aload           26
	//* 732 1417:iconst_1        
	//* 733 1418:iconst_m1       
	//* 734 1419:iastore         
	//* 735 1420:aload           26
	//* 736 1422:iconst_0        
	//* 737 1423:iconst_m1       
	//* 738 1424:iastore         
	//* 739 1425:aload_0         
	//* 740 1426:iconst_0        
	//* 741 1427:putfield        #328 <Field int mTotalLength>
	//* 742 1430:iconst_0        
	//* 743 1431:istore          13
	//* 744 1433:iload           10
	//* 745 1435:istore          12
	//* 746 1437:iload           6
	//* 747 1439:istore          9
	//* 748 1441:iload           7
	//* 749 1443:istore          8
	//* 750 1445:iconst_m1       
	//* 751 1446:istore          7
	//* 752 1448:iload           13
	//* 753 1450:istore          10
	//* 754 1452:iload           12
	//* 755 1454:istore          6
	//* 756 1456:iload           10
	//* 757 1458:iload           20
	//* 758 1460:icmpge          2013
	//* 759 1463:aload_0         
	//* 760 1464:iload           10
	//* 761 1466:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//* 762 1469:astore          27
	//* 763 1471:aload           27
	//* 764 1473:ifnull          2340
	//* 765 1476:aload           27
	//* 766 1478:invokevirtual   #174 <Method int View.getVisibility()>
	//* 767 1481:bipush          8
	//* 768 1483:icmpne          1539
	//* 769 1486:iload           8
	//* 770 1488:istore          12
	//* 771 1490:iload           7
	//* 772 1492:istore          8
	//* 773 1494:iload           6
	//* 774 1496:istore          7
	//* 775 1498:iload           5
	//* 776 1500:istore          6
	//* 777 1502:iload           12
	//* 778 1504:istore          5
	//* 779 1506:iload           10
	//* 780 1508:iconst_1        
	//* 781 1509:iadd            
	//* 782 1510:istore          12
	//* 783 1512:iload           8
	//* 784 1514:istore          10
	//* 785 1516:iload           5
	//* 786 1518:istore          8
	//* 787 1520:iload           6
	//* 788 1522:istore          5
	//* 789 1524:iload           7
	//* 790 1526:istore          6
	//* 791 1528:iload           10
	//* 792 1530:istore          7
	//* 793 1532:iload           12
	//* 794 1534:istore          10
	//* 795 1536:goto            1456
	//* 796 1539:aload           27
	//* 797 1541:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 798 1544:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//* 799 1547:astore          28
	//* 800 1549:aload           28
	//* 801 1551:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 802 1554:fstore          4
	//* 803 1556:fload           4
	//* 804 1558:fconst_0        
	//* 805 1559:fcmpl           
	//* 806 1560:ifle            2337
	//* 807 1563:iload           8
	//* 808 1565:i2f             
	//* 809 1566:fload           4
	//* 810 1568:fmul            
	//* 811 1569:fload_3         
	//* 812 1570:fdiv            
	//* 813 1571:f2i             
	//* 814 1572:istore          13
	//* 815 1574:iload           8
	//* 816 1576:iload           13
	//* 817 1578:isub            
	//* 818 1579:istore          12
	//* 819 1581:iload_2         
	//* 820 1582:aload_0         
	//* 821 1583:invokevirtual   #280 <Method int getPaddingTop()>
	//* 822 1586:aload_0         
	//* 823 1587:invokevirtual   #261 <Method int getPaddingBottom()>
	//* 824 1590:iadd            
	//* 825 1591:aload           28
	//* 826 1593:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//* 827 1596:iadd            
	//* 828 1597:aload           28
	//* 829 1599:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//* 830 1602:iadd            
	//* 831 1603:aload           28
	//* 832 1605:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 833 1608:invokestatic    #420 <Method int getChildMeasureSpec(int, int, int)>
	//* 834 1611:istore          14
	//* 835 1613:aload           28
	//* 836 1615:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 837 1618:ifne            1628
	//* 838 1621:iload           22
	//* 839 1623:ldc1            #160 <Int 0x40000000>
	//* 840 1625:icmpeq          1907
	//* 841 1628:iload           13
	//* 842 1630:aload           27
	//* 843 1632:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//* 844 1635:iadd            
	//* 845 1636:istore          13
	//* 846 1638:iload           13
	//* 847 1640:istore          8
	//* 848 1642:iload           13
	//* 849 1644:ifge            1650
	//* 850 1647:iconst_0        
	//* 851 1648:istore          8
	//* 852 1650:aload           27
	//* 853 1652:iload           8
	//* 854 1654:ldc1            #160 <Int 0x40000000>
	//* 855 1656:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 856 1659:iload           14
	//* 857 1661:invokevirtual   #396 <Method void View.measure(int, int)>
	//* 858 1664:iload           9
	//* 859 1666:aload           27
	//* 860 1668:invokevirtual   #399 <Method int View.getMeasuredState()>
	//* 861 1671:ldc2            #421 <Int 0xff000000>
	//* 862 1674:iand            
	//* 863 1675:invokestatic    #402 <Method int View.combineMeasuredStates(int, int)>
	//* 864 1678:istore          9
	//* 865 1680:fload_3         
	//* 866 1681:fload           4
	//* 867 1683:fsub            
	//* 868 1684:fstore_3        
	//* 869 1685:iload           12
	//* 870 1687:istore          8
	//* 871 1689:iload           16
	//* 872 1691:ifeq            1939
	//* 873 1694:aload_0         
	//* 874 1695:aload_0         
	//* 875 1696:getfield        #328 <Field int mTotalLength>
	//* 876 1699:aload           27
	//* 877 1701:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//* 878 1704:aload           28
	//* 879 1706:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//* 880 1709:iadd            
	//* 881 1710:aload           28
	//* 882 1712:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//* 883 1715:iadd            
	//* 884 1716:aload_0         
	//* 885 1717:aload           27
	//* 886 1719:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//* 887 1722:iadd            
	//* 888 1723:iadd            
	//* 889 1724:putfield        #328 <Field int mTotalLength>
	//* 890 1727:iload           21
	//* 891 1729:ldc1            #160 <Int 0x40000000>
	//* 892 1731:icmpeq          1984
	//* 893 1734:aload           28
	//* 894 1736:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 895 1739:iconst_m1       
	//* 896 1740:icmpne          1984
	//* 897 1743:iconst_1        
	//* 898 1744:istore          12
	//* 899 1746:aload           28
	//* 900 1748:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//* 901 1751:aload           28
	//* 902 1753:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//* 903 1756:iadd            
	//* 904 1757:istore          15
	//* 905 1759:aload           27
	//* 906 1761:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//* 907 1764:iload           15
	//* 908 1766:iadd            
	//* 909 1767:istore          14
	//* 910 1769:iload           7
	//* 911 1771:iload           14
	//* 912 1773:invokestatic    #407 <Method int Math.max(int, int)>
	//* 913 1776:istore          13
	//* 914 1778:iload           12
	//* 915 1780:ifeq            1990
	//* 916 1783:iload           15
	//* 917 1785:istore          7
	//* 918 1787:iload           6
	//* 919 1789:iload           7
	//* 920 1791:invokestatic    #407 <Method int Math.max(int, int)>
	//* 921 1794:istore          7
	//* 922 1796:iload           5
	//* 923 1798:ifeq            1997
	//* 924 1801:aload           28
	//* 925 1803:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 926 1806:iconst_m1       
	//* 927 1807:icmpne          1997
	//* 928 1810:iconst_1        
	//* 929 1811:istore          5
	//* 930 1813:iload           23
	//* 931 1815:ifeq            1892
	//* 932 1818:aload           27
	//* 933 1820:invokevirtual   #322 <Method int View.getBaseline()>
	//* 934 1823:istore          12
	//* 935 1825:iload           12
	//* 936 1827:iconst_m1       
	//* 937 1828:icmpeq          1892
	//* 938 1831:aload           28
	//* 939 1833:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//* 940 1836:ifge            2003
	//* 941 1839:aload_0         
	//* 942 1840:getfield        #68  <Field int mGravity>
	//* 943 1843:istore          6
	//* 944 1845:iload           6
	//* 945 1847:bipush          112
	//* 946 1849:iand            
	//* 947 1850:iconst_4        
	//* 948 1851:ishr            
	//* 949 1852:bipush          -2
	//* 950 1854:iand            
	//* 951 1855:iconst_1        
	//* 952 1856:ishr            
	//* 953 1857:istore          6
	//* 954 1859:aload           25
	//* 955 1861:iload           6
	//* 956 1863:aload           25
	//* 957 1865:iload           6
	//* 958 1867:iaload          
	//* 959 1868:iload           12
	//* 960 1870:invokestatic    #407 <Method int Math.max(int, int)>
	//* 961 1873:iastore         
	//* 962 1874:aload           26
	//* 963 1876:iload           6
	//* 964 1878:aload           26
	//* 965 1880:iload           6
	//* 966 1882:iaload          
	//* 967 1883:iload           14
	//* 968 1885:iload           12
	//* 969 1887:isub            
	//* 970 1888:invokestatic    #407 <Method int Math.max(int, int)>
	//* 971 1891:iastore         
	//* 972 1892:iload           5
	//* 973 1894:istore          6
	//* 974 1896:iload           8
	//* 975 1898:istore          5
	//* 976 1900:iload           13
	//* 977 1902:istore          8
	//* 978 1904:goto            1506
	//* 979 1907:iload           13
	//* 980 1909:ifle            1933
	//* 981 1912:iload           13
	//* 982 1914:istore          8
	//* 983 1916:aload           27
	//* 984 1918:iload           8
	//* 985 1920:ldc1            #160 <Int 0x40000000>
	//* 986 1922:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 987 1925:iload           14
	//* 988 1927:invokevirtual   #396 <Method void View.measure(int, int)>
	//* 989 1930:goto            1664
	//* 990 1933:iconst_0        
	//* 991 1934:istore          8
	//* 992 1936:goto            1916
	//* 993 1939:aload_0         
	//* 994 1940:getfield        #328 <Field int mTotalLength>
	//* 995 1943:istore          12
	//* 996 1945:aload_0         
	//* 997 1946:iload           12
	//* 998 1948:aload           27
	//* 999 1950:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//*1000 1953:iload           12
	//*1001 1955:iadd            
	//*1002 1956:aload           28
	//*1003 1958:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//*1004 1961:iadd            
	//*1005 1962:aload           28
	//*1006 1964:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//*1007 1967:iadd            
	//*1008 1968:aload_0         
	//*1009 1969:aload           27
	//*1010 1971:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//*1011 1974:iadd            
	//*1012 1975:invokestatic    #407 <Method int Math.max(int, int)>
	//*1013 1978:putfield        #328 <Field int mTotalLength>
	//*1014 1981:goto            1727
	//*1015 1984:iconst_0        
	//*1016 1985:istore          12
	//*1017 1987:goto            1746
	//*1018 1990:iload           14
	//*1019 1992:istore          7
	//*1020 1994:goto            1787
	//*1021 1997:iconst_0        
	//*1022 1998:istore          5
	//*1023 2000:goto            1813
	//*1024 2003:aload           28
	//*1025 2005:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//*1026 2008:istore          6
	//*1027 2010:goto            1845
	//*1028 2013:aload_0         
	//*1029 2014:aload_0         
	//*1030 2015:getfield        #328 <Field int mTotalLength>
	//*1031 2018:aload_0         
	//*1032 2019:invokevirtual   #237 <Method int getPaddingLeft()>
	//*1033 2022:aload_0         
	//*1034 2023:invokevirtual   #243 <Method int getPaddingRight()>
	//*1035 2026:iadd            
	//*1036 2027:iadd            
	//*1037 2028:putfield        #328 <Field int mTotalLength>
	//*1038 2031:aload           25
	//*1039 2033:iconst_1        
	//*1040 2034:iaload          
	//*1041 2035:iconst_m1       
	//*1042 2036:icmpne          2067
	//*1043 2039:aload           25
	//*1044 2041:iconst_0        
	//*1045 2042:iaload          
	//*1046 2043:iconst_m1       
	//*1047 2044:icmpne          2067
	//*1048 2047:aload           25
	//*1049 2049:iconst_2        
	//*1050 2050:iaload          
	//*1051 2051:iconst_m1       
	//*1052 2052:icmpne          2067
	//*1053 2055:iload           7
	//*1054 2057:istore          8
	//*1055 2059:aload           25
	//*1056 2061:iconst_3        
	//*1057 2062:iaload          
	//*1058 2063:iconst_m1       
	//*1059 2064:icmpeq          2125
	//*1060 2067:iload           7
	//*1061 2069:aload           25
	//*1062 2071:iconst_3        
	//*1063 2072:iaload          
	//*1064 2073:aload           25
	//*1065 2075:iconst_0        
	//*1066 2076:iaload          
	//*1067 2077:aload           25
	//*1068 2079:iconst_1        
	//*1069 2080:iaload          
	//*1070 2081:aload           25
	//*1071 2083:iconst_2        
	//*1072 2084:iaload          
	//*1073 2085:invokestatic    #407 <Method int Math.max(int, int)>
	//*1074 2088:invokestatic    #407 <Method int Math.max(int, int)>
	//*1075 2091:invokestatic    #407 <Method int Math.max(int, int)>
	//*1076 2094:aload           26
	//*1077 2096:iconst_3        
	//*1078 2097:iaload          
	//*1079 2098:aload           26
	//*1080 2100:iconst_0        
	//*1081 2101:iaload          
	//*1082 2102:aload           26
	//*1083 2104:iconst_1        
	//*1084 2105:iaload          
	//*1085 2106:aload           26
	//*1086 2108:iconst_2        
	//*1087 2109:iaload          
	//*1088 2110:invokestatic    #407 <Method int Math.max(int, int)>
	//*1089 2113:invokestatic    #407 <Method int Math.max(int, int)>
	//*1090 2116:invokestatic    #407 <Method int Math.max(int, int)>
	//*1091 2119:iadd            
	//*1092 2120:invokestatic    #407 <Method int Math.max(int, int)>
	//*1093 2123:istore          8
	//*1094 2125:iload           5
	//*1095 2127:istore          7
	//*1096 2129:iload           9
	//*1097 2131:istore          5
	//*1098 2133:iload           7
	//*1099 2135:istore          9
	//*1100 2137:iload           6
	//*1101 2139:istore          7
	//*1102 2141:iload           9
	//*1103 2143:ifne            2311
	//*1104 2146:iload           21
	//*1105 2148:ldc1            #160 <Int 0x40000000>
	//*1106 2150:icmpeq          2311
	//*1107 2153:aload_0         
	//*1108 2154:ldc2            #421 <Int 0xff000000>
	//*1109 2157:iload           5
	//*1110 2159:iand            
	//*1111 2160:iload           17
	//*1112 2162:ior             
	//*1113 2163:iload           7
	//*1114 2165:aload_0         
	//*1115 2166:invokevirtual   #280 <Method int getPaddingTop()>
	//*1116 2169:aload_0         
	//*1117 2170:invokevirtual   #261 <Method int getPaddingBottom()>
	//*1118 2173:iadd            
	//*1119 2174:iadd            
	//*1120 2175:aload_0         
	//*1121 2176:invokevirtual   #424 <Method int getSuggestedMinimumHeight()>
	//*1122 2179:invokestatic    #407 <Method int Math.max(int, int)>
	//*1123 2182:iload_2         
	//*1124 2183:iload           5
	//*1125 2185:bipush          16
	//*1126 2187:ishl            
	//*1127 2188:invokestatic    #416 <Method int View.resolveSizeAndState(int, int, int)>
	//*1128 2191:invokevirtual   #427 <Method void setMeasuredDimension(int, int)>
	//*1129 2194:iload           11
	//*1130 2196:ifeq            2206
	//*1131 2199:aload_0         
	//*1132 2200:iload           20
	//*1133 2202:iload_1         
	//*1134 2203:invokespecial   #429 <Method void forceUniformHeight(int, int)>
	//*1135 2206:return          
	//*1136 2207:iload           10
	//*1137 2209:iload           12
	//*1138 2211:invokestatic    #407 <Method int Math.max(int, int)>
	//*1139 2214:istore          9
	//*1140 2216:iload           24
	//*1141 2218:ifeq            2318
	//*1142 2221:iload           22
	//*1143 2223:ldc1            #160 <Int 0x40000000>
	//*1144 2225:icmpeq          2318
	//*1145 2228:iconst_0        
	//*1146 2229:istore          7
	//*1147 2231:iload           7
	//*1148 2233:iload           20
	//*1149 2235:icmpge          2318
	//*1150 2238:aload_0         
	//*1151 2239:iload           7
	//*1152 2241:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//*1153 2244:astore          25
	//*1154 2246:aload           25
	//*1155 2248:ifnull          2261
	//*1156 2251:aload           25
	//*1157 2253:invokevirtual   #174 <Method int View.getVisibility()>
	//*1158 2256:bipush          8
	//*1159 2258:icmpne          2270
	//*1160 2261:iload           7
	//*1161 2263:iconst_1        
	//*1162 2264:iadd            
	//*1163 2265:istore          7
	//*1164 2267:goto            2231
	//*1165 2270:aload           25
	//*1166 2272:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*1167 2275:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//*1168 2278:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//*1169 2281:fconst_0        
	//*1170 2282:fcmpl           
	//*1171 2283:ifle            2261
	//*1172 2286:aload           25
	//*1173 2288:iload           8
	//*1174 2290:ldc1            #160 <Int 0x40000000>
	//*1175 2292:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*1176 2295:aload           25
	//*1177 2297:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//*1178 2300:ldc1            #160 <Int 0x40000000>
	//*1179 2302:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*1180 2305:invokevirtual   #396 <Method void View.measure(int, int)>
	//*1181 2308:goto            2261
	//*1182 2311:iload           8
	//*1183 2313:istore          7
	//*1184 2315:goto            2153
	//*1185 2318:iload           9
	//*1186 2320:istore          7
	//*1187 2322:iload           13
	//*1188 2324:istore          8
	//*1189 2326:iload           5
	//*1190 2328:istore          9
	//*1191 2330:iload           6
	//*1192 2332:istore          5
	//*1193 2334:goto            2141
	//*1194 2337:goto            1689
	//*1195 2340:iload           8
	//*1196 2342:istore          12
	//*1197 2344:iload           7
	//*1198 2346:istore          8
	//*1199 2348:iload           6
	//*1200 2350:istore          7
	//*1201 2352:iload           5
	//*1202 2354:istore          6
	//*1203 2356:iload           12
	//*1204 2358:istore          5
	//*1205 2360:goto            1506
	//*1206 2363:iload           7
	//*1207 2365:istore          13
	//*1208 2367:goto            1108
				{
					j1 = i2;
	// 1209 2370:iload           11
	// 1210 2372:istore          8
				}
				i2 = layoutparams.topMargin;
				i2 = layoutparams.bottomMargin + i2;
				i5 = view1.getMeasuredHeight() + i2;
				j5 = View.combineMeasuredStates(l, view1.getMeasuredState());
				if(flag1)
				{
					k5 = view1.getBaseline();
					if(k5 != -1)
					{
						if(layoutparams.gravity < 0)
							l = mGravity;
						else
							l = layoutparams.gravity;
						l = ((l & 0x70) >> 4 & -2) >> 1;
						ai[l] = Math.max(ai[l], k5);
						ai1[l] = Math.max(ai1[l], i5 - k5);
					}
				}
				k5 = Math.max(i1, i5);
				if(k != 0 && layoutparams.height == -1)
					i1 = 1;
				else
					i1 = 0;
				if(layoutparams.weight > 0.0F)
				{
					if(k1 == 0)
						i2 = i5;
					l = Math.max(j2, i2);
					k = l1;
				} else
				{
					if(k1 == 0)
						i2 = i5;
					k = Math.max(l1, i2);
					l = j2;
				}
				k2 += getChildrenSkipCount(view1, k2);
				j2 = l;
				l1 = k;
				k1 = k5;
				k = k3;
				k3 = j5;
				i2 = j1;
				l = k4;
				j1 = k3;
			}
			k2++;
			i3 = j1;
			i4 = k1;
			j1 = k;
			k1 = l;
			k = i1;
			l = i3;
			i1 = i4;
		}
		if(mTotalLength > 0 && hasDividerBeforeChildAt(l5))
			mTotalLength = mTotalLength + mDividerWidth;
		if(ai[1] != -1 || ai[0] != -1 || ai[2] != -1 || ai[3] != -1)
			k2 = Math.max(i1, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
		else
			k2 = i1;
		if(flag2 && (j6 == 0x80000000 || j6 == 0))
		{
			mTotalLength = 0;
			i1 = 0;
			while(i1 < l5) 
			{
				view1 = getVirtualChildAt(i1);
				if(view1 == null)
					mTotalLength = mTotalLength + measureNullChild(i1);
				else
				if(view1.getVisibility() == 8)
				{
					i1 = getChildrenSkipCount(view1, i1) + i1;
				} else
				{
					layoutparams = (LayoutParams)view1.getLayoutParams();
					if(flag)
					{
						k3 = mTotalLength;
						k4 = layoutparams.leftMargin;
						mTotalLength = layoutparams.rightMargin + (k4 + j1) + getNextLocationOffset(view1) + k3;
					} else
					{
						k3 = mTotalLength;
						k4 = layoutparams.leftMargin;
						mTotalLength = Math.max(k3, layoutparams.rightMargin + (k3 + j1 + k4) + getNextLocationOffset(view1));
					}
				}
				i1++;
			}
		}
		mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
		i5 = View.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumWidth()), i, 0);
		i1 = (0xffffff & i5) - mTotalLength;
		if(k1 == 0 && (i1 == 0 || f <= 0.0F)) goto _L2; else goto _L1
_L1:
label0:
		{
			if(mWeightSum > 0.0F)
				f = mWeightSum;
			ai[3] = -1;
			ai[2] = -1;
			ai[1] = -1;
			ai[0] = -1;
			ai1[3] = -1;
			ai1[2] = -1;
			ai1[1] = -1;
			ai1[0] = -1;
			mTotalLength = 0;
			k2 = 0;
			j2 = l1;
			k1 = l;
			j1 = i1;
			i1 = -1;
			l1 = k2;
			l = j2;
			while(l1 < l5) 
			{
				view1 = getVirtualChildAt(l1);
				if(view1 != null)
				{
					if(view1.getVisibility() == 8)
					{
						j2 = j1;
						j1 = i1;
						i1 = l;
						l = k;
						k = j2;
					} else
					{
						layoutparams = (LayoutParams)view1.getLayoutParams();
						f1 = layoutparams.weight;
						if(f1 > 0.0F)
						{
							k2 = (int)(((float)j1 * f1) / f);
							j2 = j1 - k2;
							k3 = getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom() + layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height);
							if(layoutparams.width != 0 || j6 != 0x40000000)
							{
								k2 += view1.getMeasuredWidth();
								j1 = k2;
								if(k2 < 0)
									j1 = 0;
								view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000), k3);
							} else
							{
								if(k2 > 0)
									j1 = k2;
								else
									j1 = 0;
								view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000), k3);
							}
							k1 = View.combineMeasuredStates(k1, view1.getMeasuredState() & 0xff000000);
							f -= f1;
							j1 = j2;
						}
						if(flag)
						{
							mTotalLength = mTotalLength + (view1.getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin + getNextLocationOffset(view1));
						} else
						{
							j2 = mTotalLength;
							mTotalLength = Math.max(j2, view1.getMeasuredWidth() + j2 + layoutparams.leftMargin + layoutparams.rightMargin + getNextLocationOffset(view1));
						}
						if(i6 != 0x40000000 && layoutparams.height == -1)
							j2 = 1;
						else
							j2 = 0;
						k4 = layoutparams.topMargin + layoutparams.bottomMargin;
						k3 = view1.getMeasuredHeight() + k4;
						k2 = Math.max(i1, k3);
						if(j2 != 0)
							i1 = k4;
						else
							i1 = k3;
						i1 = Math.max(l, i1);
						if(k != 0 && layoutparams.height == -1)
							k = 1;
						else
							k = 0;
						if(flag1)
						{
							j2 = view1.getBaseline();
							if(j2 != -1)
							{
								if(layoutparams.gravity < 0)
									l = mGravity;
								else
									l = layoutparams.gravity;
								l = ((l & 0x70) >> 4 & -2) >> 1;
								ai[l] = Math.max(ai[l], j2);
								ai1[l] = Math.max(ai1[l], k3 - j2);
							}
						}
						l = k;
						k = j1;
						j1 = k2;
					}
				} else
				{
					j2 = j1;
					j1 = i1;
					i1 = l;
					l = k;
					k = j2;
				}
				j2 = l1 + 1;
				l1 = j1;
				j1 = k;
				k = l;
				l = i1;
				i1 = l1;
				l1 = j2;
			}
			mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
			if(ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
			{
				j1 = i1;
				if(ai[3] == -1)
					break label0;
			}
			j1 = Math.max(i1, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
		}
		i1 = k;
		k = k1;
		k1 = i1;
		i1 = l;
_L4:
		if(k1 != 0 || i6 == 0x40000000)
			i1 = j1;
		setMeasuredDimension(0xff000000 & k | i5, View.resolveSizeAndState(Math.max(i1 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), j, k << 16));
		if(i2 != 0)
			forceUniformHeight(l5, i);
		return;
_L2:
		k1 = Math.max(l1, j2);
		if(flag2 && j6 != 0x40000000)
		{
			i1 = 0;
			do
			{
				if(i1 >= l5)
					break;
				view = getVirtualChildAt(i1);
				if(view != null && view.getVisibility() != 8 && ((LayoutParams)view.getLayoutParams()).weight > 0.0F)
					view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000));
				i1++;
			} while(true);
		}
		i1 = k1;
		j1 = k2;
		k1 = k;
		k = l;
		if(true) goto _L4; else goto _L3
_L3:
	//*1211 2374:goto            476
	}

	int measureNullChild(int i)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	void measureVertical(int i, int j)
	{
		float f;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		int j2;
		int k2;
		int l5;
		int i6;
		int j6;
		int k6;
		boolean flag;
		mTotalLength = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #328 <Field int mTotalLength>
		l = 0;
	//    3    5:iconst_0        
	//    4    6:istore          6
		k = 0;
	//    5    8:iconst_0        
	//    6    9:istore          5
		l1 = 0;
	//    7   11:iconst_0        
	//    8   12:istore          10
		k2 = 0;
	//    9   14:iconst_0        
	//   10   15:istore          13
		i1 = 1;
	//   11   17:iconst_1        
	//   12   18:istore          7
		f = 0.0F;
	//   13   20:fconst_0        
	//   14   21:fstore_3        
		l5 = getVirtualChildCount();
	//   15   22:aload_0         
	//   16   23:invokevirtual   #206 <Method int getVirtualChildCount()>
	//   17   26:istore          19
		i6 = android.view.View.MeasureSpec.getMode(i);
	//   18   28:iload_1         
	//   19   29:invokestatic    #389 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   20   32:istore          20
		j6 = android.view.View.MeasureSpec.getMode(j);
	//   21   34:iload_2         
	//   22   35:invokestatic    #389 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   23   38:istore          21
		j2 = 0;
	//   24   40:iconst_0        
	//   25   41:istore          12
		k1 = 0;
	//   26   43:iconst_0        
	//   27   44:istore          9
		k6 = mBaselineAlignedChildIndex;
	//   28   46:aload_0         
	//   29   47:getfield        #63  <Field int mBaselineAlignedChildIndex>
	//   30   50:istore          22
		flag = mUseLargestChild;
	//   31   52:aload_0         
	//   32   53:getfield        #125 <Field boolean mUseLargestChild>
	//   33   56:istore          23
		j1 = 0x80000000;
	//   34   58:ldc2            #390 <Int 0x80000000>
	//   35   61:istore          8
		i2 = 0;
	//   36   63:iconst_0        
	//   37   64:istore          11
_L2:
		View view;
		if(i2 >= l5)
			break MISSING_BLOCK_LABEL_732;
	//   38   66:iload           11
	//   39   68:iload           19
	//   40   70:icmpge          732
		view = getVirtualChildAt(i2);
	//   41   73:aload_0         
	//   42   74:iload           11
	//   43   76:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   44   79:astore          24
		if(view != null)
			break; /* Loop/switch isn't completed */
	//   45   81:aload           24
	//   46   83:ifnonnull       158
		mTotalLength = mTotalLength + measureNullChild(i2);
	//   47   86:aload_0         
	//   48   87:aload_0         
	//   49   88:getfield        #328 <Field int mTotalLength>
	//   50   91:aload_0         
	//   51   92:iload           11
	//   52   94:invokevirtual   #371 <Method int measureNullChild(int)>
	//   53   97:iadd            
	//   54   98:putfield        #328 <Field int mTotalLength>
		int l2 = j1;
	//   55  101:iload           8
	//   56  103:istore          14
		int l3 = k1;
	//   57  105:iload           9
	//   58  107:istore          15
		k1 = l;
	//   59  109:iload           6
	//   60  111:istore          9
		j1 = k;
	//   61  113:iload           5
	//   62  115:istore          8
		l = l3;
	//   63  117:iload           15
	//   64  119:istore          6
		k = l2;
	//   65  121:iload           14
	//   66  123:istore          5
_L3:
		i2++;
	//   67  125:iload           11
	//   68  127:iconst_1        
	//   69  128:iadd            
	//   70  129:istore          11
		int i3 = j1;
	//   71  131:iload           8
	//   72  133:istore          14
		int i4 = k1;
	//   73  135:iload           9
	//   74  137:istore          15
		j1 = k;
	//   75  139:iload           5
	//   76  141:istore          8
		k1 = l;
	//   77  143:iload           6
	//   78  145:istore          9
		k = i3;
	//   79  147:iload           14
	//   80  149:istore          5
		l = i4;
	//   81  151:iload           15
	//   82  153:istore          6
		if(true) goto _L2; else goto _L1
	//   83  155:goto            66
_L1:
label0:
		{
			if(view.getVisibility() != 8)
				break label0;
	//   84  158:aload           24
	//   85  160:invokevirtual   #174 <Method int View.getVisibility()>
	//   86  163:bipush          8
	//   87  165:icmpne          212
			int j4 = i2 + getChildrenSkipCount(view, i2);
	//   88  168:iload           11
	//   89  170:aload_0         
	//   90  171:aload           24
	//   91  173:iload           11
	//   92  175:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//   93  178:iadd            
	//   94  179:istore          15
			i2 = j1;
	//   95  181:iload           8
	//   96  183:istore          11
			int j3 = k1;
	//   97  185:iload           9
	//   98  187:istore          14
			j1 = k;
	//   99  189:iload           5
	//  100  191:istore          8
			k1 = l;
	//  101  193:iload           6
	//  102  195:istore          9
			k = i2;
	//  103  197:iload           11
	//  104  199:istore          5
			l = j3;
	//  105  201:iload           14
	//  106  203:istore          6
			i2 = j4;
	//  107  205:iload           15
	//  108  207:istore          11
		}
		  goto _L3
	//* 109  209:goto            125
		LayoutParams layoutparams;
		if(hasDividerBeforeChildAt(i2))
	//* 110  212:aload_0         
	//* 111  213:iload           11
	//* 112  215:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 113  218:ifeq            234
			mTotalLength = mTotalLength + mDividerHeight;
	//  114  221:aload_0         
	//  115  222:aload_0         
	//  116  223:getfield        #328 <Field int mTotalLength>
	//  117  226:aload_0         
	//  118  227:getfield        #252 <Field int mDividerHeight>
	//  119  230:iadd            
	//  120  231:putfield        #328 <Field int mTotalLength>
		layoutparams = (LayoutParams)view.getLayoutParams();
	//  121  234:aload           24
	//  122  236:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  123  239:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  124  242:astore          25
		f += layoutparams.weight;
	//  125  244:fload_3         
	//  126  245:aload           25
	//  127  247:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  128  250:fadd            
	//  129  251:fstore_3        
		if(j6 != 0x40000000 || layoutparams.height != 0 || layoutparams.weight <= 0.0F) goto _L5; else goto _L4
	//  130  252:iload           21
	//  131  254:ldc1            #160 <Int 0x40000000>
	//  132  256:icmpne          363
	//  133  259:aload           25
	//  134  261:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//  135  264:ifne            363
	//  136  267:aload           25
	//  137  269:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  138  272:fconst_0        
	//  139  273:fcmpl           
	//  140  274:ifle            363
_L4:
		int k3;
		int k4;
		k1 = mTotalLength;
	//  141  277:aload_0         
	//  142  278:getfield        #328 <Field int mTotalLength>
	//  143  281:istore          9
		mTotalLength = Math.max(k1, layoutparams.topMargin + k1 + layoutparams.bottomMargin);
	//  144  283:aload_0         
	//  145  284:iload           9
	//  146  286:aload           25
	//  147  288:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  148  291:iload           9
	//  149  293:iadd            
	//  150  294:aload           25
	//  151  296:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  152  299:iadd            
	//  153  300:invokestatic    #407 <Method int Math.max(int, int)>
	//  154  303:putfield        #328 <Field int mTotalLength>
		k4 = 1;
	//  155  306:iconst_1        
	//  156  307:istore          15
		k3 = j1;
	//  157  309:iload           8
	//  158  311:istore          14
_L7:
		if(k6 >= 0 && k6 == i2 + 1)
	//* 159  313:iload           22
	//* 160  315:iflt            335
	//* 161  318:iload           22
	//* 162  320:iload           11
	//* 163  322:iconst_1        
	//* 164  323:iadd            
	//* 165  324:icmpne          335
			mBaselineChildTop = mTotalLength;
	//  166  327:aload_0         
	//  167  328:aload_0         
	//  168  329:getfield        #328 <Field int mTotalLength>
	//  169  332:putfield        #65  <Field int mBaselineChildTop>
		if(i2 < k6 && layoutparams.weight > 0.0F)
	//* 170  335:iload           11
	//* 171  337:iload           22
	//* 172  339:icmpge          525
	//* 173  342:aload           25
	//* 174  344:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 175  347:fconst_0        
	//* 176  348:fcmpl           
	//* 177  349:ifle            525
			throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
	//  178  352:new             #313 <Class RuntimeException>
	//  179  355:dup             
	//  180  356:ldc2            #432 <String "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.">
	//  181  359:invokespecial   #318 <Method void RuntimeException(String)>
	//  182  362:athrow          
		break; /* Loop/switch isn't completed */
_L5:
		k4 = 0x80000000;
	//  183  363:ldc2            #390 <Int 0x80000000>
	//  184  366:istore          15
		k3 = k4;
	//  185  368:iload           15
	//  186  370:istore          14
		if(layoutparams.height == 0)
	//* 187  372:aload           25
	//* 188  374:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 189  377:ifne            404
		{
			k3 = k4;
	//  190  380:iload           15
	//  191  382:istore          14
			if(layoutparams.weight > 0.0F)
	//* 192  384:aload           25
	//* 193  386:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 194  389:fconst_0        
	//* 195  390:fcmpl           
	//* 196  391:ifle            404
			{
				k3 = 0;
	//  197  394:iconst_0        
	//  198  395:istore          14
				layoutparams.height = -2;
	//  199  397:aload           25
	//  200  399:bipush          -2
	//  201  401:putfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
			}
		}
		int l4;
		if(f == 0.0F)
	//* 202  404:fload_3         
	//* 203  405:fconst_0        
	//* 204  406:fcmpl           
	//* 205  407:ifne            519
			k4 = mTotalLength;
	//  206  410:aload_0         
	//  207  411:getfield        #328 <Field int mTotalLength>
	//  208  414:istore          15
		else
	//* 209  416:aload_0         
	//* 210  417:aload           24
	//* 211  419:iload           11
	//* 212  421:iload_1         
	//* 213  422:iconst_0        
	//* 214  423:iload_2         
	//* 215  424:iload           15
	//* 216  426:invokevirtual   #409 <Method void measureChildBeforeLayout(View, int, int, int, int, int)>
	//* 217  429:iload           14
	//* 218  431:ldc2            #390 <Int 0x80000000>
	//* 219  434:icmpeq          444
	//* 220  437:aload           25
	//* 221  439:iload           14
	//* 222  441:putfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 223  444:aload           24
	//* 224  446:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//* 225  449:istore          16
	//* 226  451:aload_0         
	//* 227  452:getfield        #328 <Field int mTotalLength>
	//* 228  455:istore          14
	//* 229  457:aload_0         
	//* 230  458:iload           14
	//* 231  460:iload           14
	//* 232  462:iload           16
	//* 233  464:iadd            
	//* 234  465:aload           25
	//* 235  467:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//* 236  470:iadd            
	//* 237  471:aload           25
	//* 238  473:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//* 239  476:iadd            
	//* 240  477:aload_0         
	//* 241  478:aload           24
	//* 242  480:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//* 243  483:iadd            
	//* 244  484:invokestatic    #407 <Method int Math.max(int, int)>
	//* 245  487:putfield        #328 <Field int mTotalLength>
	//* 246  490:iload           8
	//* 247  492:istore          14
	//* 248  494:iload           9
	//* 249  496:istore          15
	//* 250  498:iload           23
	//* 251  500:ifeq            313
	//* 252  503:iload           16
	//* 253  505:iload           8
	//* 254  507:invokestatic    #407 <Method int Math.max(int, int)>
	//* 255  510:istore          14
	//* 256  512:iload           9
	//* 257  514:istore          15
	//* 258  516:goto            313
			k4 = 0;
	//  259  519:iconst_0        
	//  260  520:istore          15
		measureChildBeforeLayout(view, i2, i, 0, j, k4);
		if(k3 != 0x80000000)
			layoutparams.height = k3;
		l4 = view.getMeasuredHeight();
		k3 = mTotalLength;
		mTotalLength = Math.max(k3, k3 + l4 + layoutparams.topMargin + layoutparams.bottomMargin + getNextLocationOffset(view));
		k3 = j1;
		k4 = k1;
		if(flag)
		{
			k3 = Math.max(l4, j1);
			k4 = k1;
		}
		if(true) goto _L7; else goto _L6
	//* 261  522:goto            416
_L6:
		k1 = 0;
	//  262  525:iconst_0        
	//  263  526:istore          9
		float f1;
		int i5;
		int j5;
		int k5;
		if(i6 != 0x40000000 && layoutparams.width == -1)
	//* 264  528:iload           20
	//* 265  530:ldc1            #160 <Int 0x40000000>
	//* 266  532:icmpeq          1677
	//* 267  535:aload           25
	//* 268  537:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 269  540:iconst_m1       
	//* 270  541:icmpne          1677
		{
			j1 = 1;
	//  271  544:iconst_1        
	//  272  545:istore          8
			k1 = 1;
	//  273  547:iconst_1        
	//  274  548:istore          9
		} else
	//* 275  550:aload           25
	//* 276  552:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//* 277  555:istore          12
	//* 278  557:aload           25
	//* 279  559:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//* 280  562:iload           12
	//* 281  564:iadd            
	//* 282  565:istore          12
	//* 283  567:aload           24
	//* 284  569:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//* 285  572:iload           12
	//* 286  574:iadd            
	//* 287  575:istore          16
	//* 288  577:iload           6
	//* 289  579:iload           16
	//* 290  581:invokestatic    #407 <Method int Math.max(int, int)>
	//* 291  584:istore          18
	//* 292  586:iload           5
	//* 293  588:aload           24
	//* 294  590:invokevirtual   #399 <Method int View.getMeasuredState()>
	//* 295  593:invokestatic    #402 <Method int View.combineMeasuredStates(int, int)>
	//* 296  596:istore          17
	//* 297  598:iload           7
	//* 298  600:ifeq            691
	//* 299  603:aload           25
	//* 300  605:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 301  608:iconst_m1       
	//* 302  609:icmpne          691
	//* 303  612:iconst_1        
	//* 304  613:istore          7
	//* 305  615:aload           25
	//* 306  617:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 307  620:fconst_0        
	//* 308  621:fcmpl           
	//* 309  622:ifle            704
	//* 310  625:iload           9
	//* 311  627:ifeq            697
	//* 312  630:iload           13
	//* 313  632:iload           12
	//* 314  634:invokestatic    #407 <Method int Math.max(int, int)>
	//* 315  637:istore          6
	//* 316  639:iload           10
	//* 317  641:istore          5
	//* 318  643:iload           11
	//* 319  645:aload_0         
	//* 320  646:aload           24
	//* 321  648:iload           11
	//* 322  650:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//* 323  653:iadd            
	//* 324  654:istore          11
	//* 325  656:iload           6
	//* 326  658:istore          13
	//* 327  660:iload           5
	//* 328  662:istore          10
	//* 329  664:iload           18
	//* 330  666:istore          9
	//* 331  668:iload           14
	//* 332  670:istore          5
	//* 333  672:iload           17
	//* 334  674:istore          14
	//* 335  676:iload           8
	//* 336  678:istore          12
	//* 337  680:iload           15
	//* 338  682:istore          6
	//* 339  684:iload           14
	//* 340  686:istore          8
	//* 341  688:goto            125
	//* 342  691:iconst_0        
	//* 343  692:istore          7
	//* 344  694:goto            615
	//* 345  697:iload           16
	//* 346  699:istore          12
	//* 347  701:goto            630
	//* 348  704:iload           9
	//* 349  706:ifeq            725
	//* 350  709:iload           10
	//* 351  711:iload           12
	//* 352  713:invokestatic    #407 <Method int Math.max(int, int)>
	//* 353  716:istore          5
	//* 354  718:iload           13
	//* 355  720:istore          6
	//* 356  722:goto            643
	//* 357  725:iload           16
	//* 358  727:istore          12
	//* 359  729:goto            709
	//* 360  732:aload_0         
	//* 361  733:getfield        #328 <Field int mTotalLength>
	//* 362  736:ifle            761
	//* 363  739:aload_0         
	//* 364  740:iload           19
	//* 365  742:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 366  745:ifeq            761
	//* 367  748:aload_0         
	//* 368  749:aload_0         
	//* 369  750:getfield        #328 <Field int mTotalLength>
	//* 370  753:aload_0         
	//* 371  754:getfield        #252 <Field int mDividerHeight>
	//* 372  757:iadd            
	//* 373  758:putfield        #328 <Field int mTotalLength>
	//* 374  761:iload           23
	//* 375  763:ifeq            913
	//* 376  766:iload           21
	//* 377  768:ldc2            #390 <Int 0x80000000>
	//* 378  771:icmpeq          779
	//* 379  774:iload           21
	//* 380  776:ifne            913
	//* 381  779:aload_0         
	//* 382  780:iconst_0        
	//* 383  781:putfield        #328 <Field int mTotalLength>
	//* 384  784:iconst_0        
	//* 385  785:istore          11
	//* 386  787:iload           11
	//* 387  789:iload           19
	//* 388  791:icmpge          913
	//* 389  794:aload_0         
	//* 390  795:iload           11
	//* 391  797:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//* 392  800:astore          24
	//* 393  802:aload           24
	//* 394  804:ifnonnull       831
	//* 395  807:aload_0         
	//* 396  808:aload_0         
	//* 397  809:getfield        #328 <Field int mTotalLength>
	//* 398  812:aload_0         
	//* 399  813:iload           11
	//* 400  815:invokevirtual   #371 <Method int measureNullChild(int)>
	//* 401  818:iadd            
	//* 402  819:putfield        #328 <Field int mTotalLength>
	//* 403  822:iload           11
	//* 404  824:iconst_1        
	//* 405  825:iadd            
	//* 406  826:istore          11
	//* 407  828:goto            787
	//* 408  831:aload           24
	//* 409  833:invokevirtual   #174 <Method int View.getVisibility()>
	//* 410  836:bipush          8
	//* 411  838:icmpne          857
	//* 412  841:aload_0         
	//* 413  842:aload           24
	//* 414  844:iload           11
	//* 415  846:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//* 416  849:iload           11
	//* 417  851:iadd            
	//* 418  852:istore          11
	//* 419  854:goto            822
	//* 420  857:aload           24
	//* 421  859:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 422  862:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//* 423  865:astore          25
	//* 424  867:aload_0         
	//* 425  868:getfield        #328 <Field int mTotalLength>
	//* 426  871:istore          14
	//* 427  873:aload           25
	//* 428  875:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//* 429  878:istore          15
	//* 430  880:aload_0         
	//* 431  881:iload           14
	//* 432  883:aload           25
	//* 433  885:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//* 434  888:iload           14
	//* 435  890:iload           8
	//* 436  892:iadd            
	//* 437  893:iload           15
	//* 438  895:iadd            
	//* 439  896:iadd            
	//* 440  897:aload_0         
	//* 441  898:aload           24
	//* 442  900:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//* 443  903:iadd            
	//* 444  904:invokestatic    #407 <Method int Math.max(int, int)>
	//* 445  907:putfield        #328 <Field int mTotalLength>
	//* 446  910:goto            822
	//* 447  913:aload_0         
	//* 448  914:aload_0         
	//* 449  915:getfield        #328 <Field int mTotalLength>
	//* 450  918:aload_0         
	//* 451  919:invokevirtual   #280 <Method int getPaddingTop()>
	//* 452  922:aload_0         
	//* 453  923:invokevirtual   #261 <Method int getPaddingBottom()>
	//* 454  926:iadd            
	//* 455  927:iadd            
	//* 456  928:putfield        #328 <Field int mTotalLength>
	//* 457  931:aload_0         
	//* 458  932:getfield        #328 <Field int mTotalLength>
	//* 459  935:aload_0         
	//* 460  936:invokevirtual   #424 <Method int getSuggestedMinimumHeight()>
	//* 461  939:invokestatic    #407 <Method int Math.max(int, int)>
	//* 462  942:iload_2         
	//* 463  943:iconst_0        
	//* 464  944:invokestatic    #416 <Method int View.resolveSizeAndState(int, int, int)>
	//* 465  947:istore          15
	//* 466  949:ldc2            #417 <Int 0xffffff>
	//* 467  952:iload           15
	//* 468  954:iand            
	//* 469  955:aload_0         
	//* 470  956:getfield        #328 <Field int mTotalLength>
	//* 471  959:isub            
	//* 472  960:istore          11
	//* 473  962:iload           9
	//* 474  964:ifne            978
	//* 475  967:iload           11
	//* 476  969:ifeq            1532
	//* 477  972:fload_3         
	//* 478  973:fconst_0        
	//* 479  974:fcmpl           
	//* 480  975:ifle            1532
	//* 481  978:aload_0         
	//* 482  979:getfield        #117 <Field float mWeightSum>
	//* 483  982:fconst_0        
	//* 484  983:fcmpl           
	//* 485  984:ifle            992
	//* 486  987:aload_0         
	//* 487  988:getfield        #117 <Field float mWeightSum>
	//* 488  991:fstore_3        
	//* 489  992:aload_0         
	//* 490  993:iconst_0        
	//* 491  994:putfield        #328 <Field int mTotalLength>
	//* 492  997:iconst_0        
	//* 493  998:istore          8
	//* 494 1000:iload           7
	//* 495 1002:istore          9
	//* 496 1004:iload           10
	//* 497 1006:istore          7
	//* 498 1008:iload           11
	//* 499 1010:istore          10
	//* 500 1012:iload           8
	//* 501 1014:istore          11
	//* 502 1016:iload           6
	//* 503 1018:istore          8
	//* 504 1020:iload           9
	//* 505 1022:istore          6
	//* 506 1024:iload           10
	//* 507 1026:istore          9
	//* 508 1028:iload           11
	//* 509 1030:iload           19
	//* 510 1032:icmpge          1446
	//* 511 1035:aload_0         
	//* 512 1036:iload           11
	//* 513 1038:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//* 514 1041:astore          24
	//* 515 1043:aload           24
	//* 516 1045:invokevirtual   #174 <Method int View.getVisibility()>
	//* 517 1048:bipush          8
	//* 518 1050:icmpne          1086
	//* 519 1053:iload           7
	//* 520 1055:istore          10
	//* 521 1057:iload           8
	//* 522 1059:istore          7
	//* 523 1061:iload           10
	//* 524 1063:istore          8
	//* 525 1065:iload           11
	//* 526 1067:iconst_1        
	//* 527 1068:iadd            
	//* 528 1069:istore          11
	//* 529 1071:iload           7
	//* 530 1073:istore          10
	//* 531 1075:iload           8
	//* 532 1077:istore          7
	//* 533 1079:iload           10
	//* 534 1081:istore          8
	//* 535 1083:goto            1028
	//* 536 1086:aload           24
	//* 537 1088:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 538 1091:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//* 539 1094:astore          25
	//* 540 1096:aload           25
	//* 541 1098:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 542 1101:fstore          4
	//* 543 1103:fload           4
	//* 544 1105:fconst_0        
	//* 545 1106:fcmpl           
	//* 546 1107:ifle            1662
	//* 547 1110:iload           9
	//* 548 1112:i2f             
	//* 549 1113:fload           4
	//* 550 1115:fmul            
	//* 551 1116:fload_3         
	//* 552 1117:fdiv            
	//* 553 1118:f2i             
	//* 554 1119:istore          13
	//* 555 1121:iload_1         
	//* 556 1122:aload_0         
	//* 557 1123:invokevirtual   #237 <Method int getPaddingLeft()>
	//* 558 1126:aload_0         
	//* 559 1127:invokevirtual   #243 <Method int getPaddingRight()>
	//* 560 1130:iadd            
	//* 561 1131:aload           25
	//* 562 1133:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//* 563 1136:iadd            
	//* 564 1137:aload           25
	//* 565 1139:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//* 566 1142:iadd            
	//* 567 1143:aload           25
	//* 568 1145:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 569 1148:invokestatic    #420 <Method int getChildMeasureSpec(int, int, int)>
	//* 570 1151:istore          16
	//* 571 1153:aload           25
	//* 572 1155:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 573 1158:ifne            1168
	//* 574 1161:iload           21
	//* 575 1163:ldc1            #160 <Int 0x40000000>
	//* 576 1165:icmpeq          1395
	//* 577 1168:iload           13
	//* 578 1170:aload           24
	//* 579 1172:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//* 580 1175:iadd            
	//* 581 1176:istore          14
	//* 582 1178:iload           14
	//* 583 1180:istore          10
	//* 584 1182:iload           14
	//* 585 1184:ifge            1190
	//* 586 1187:iconst_0        
	//* 587 1188:istore          10
	//* 588 1190:aload           24
	//* 589 1192:iload           16
	//* 590 1194:iload           10
	//* 591 1196:ldc1            #160 <Int 0x40000000>
	//* 592 1198:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 593 1201:invokevirtual   #396 <Method void View.measure(int, int)>
	//* 594 1204:iload           5
	//* 595 1206:aload           24
	//* 596 1208:invokevirtual   #399 <Method int View.getMeasuredState()>
	//* 597 1211:sipush          -256
	//* 598 1214:iand            
	//* 599 1215:invokestatic    #402 <Method int View.combineMeasuredStates(int, int)>
	//* 600 1218:istore          5
	//* 601 1220:iload           9
	//* 602 1222:iload           13
	//* 603 1224:isub            
	//* 604 1225:istore          10
	//* 605 1227:iload           5
	//* 606 1229:istore          9
	//* 607 1231:fload_3         
	//* 608 1232:fload           4
	//* 609 1234:fsub            
	//* 610 1235:fstore_3        
	//* 611 1236:iload           10
	//* 612 1238:istore          5
	//* 613 1240:aload           25
	//* 614 1242:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//* 615 1245:aload           25
	//* 616 1247:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//* 617 1250:iadd            
	//* 618 1251:istore          13
	//* 619 1253:aload           24
	//* 620 1255:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//* 621 1258:iload           13
	//* 622 1260:iadd            
	//* 623 1261:istore          14
	//* 624 1263:iload           8
	//* 625 1265:iload           14
	//* 626 1267:invokestatic    #407 <Method int Math.max(int, int)>
	//* 627 1270:istore          10
	//* 628 1272:iload           20
	//* 629 1274:ldc1            #160 <Int 0x40000000>
	//* 630 1276:icmpeq          1427
	//* 631 1279:aload           25
	//* 632 1281:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 633 1284:iconst_m1       
	//* 634 1285:icmpne          1427
	//* 635 1288:iconst_1        
	//* 636 1289:istore          8
	//* 637 1291:iload           8
	//* 638 1293:ifeq            1433
	//* 639 1296:iload           13
	//* 640 1298:istore          8
	//* 641 1300:iload           7
	//* 642 1302:iload           8
	//* 643 1304:invokestatic    #407 <Method int Math.max(int, int)>
	//* 644 1307:istore          8
	//* 645 1309:iload           6
	//* 646 1311:ifeq            1440
	//* 647 1314:aload           25
	//* 648 1316:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 649 1319:iconst_m1       
	//* 650 1320:icmpne          1440
	//* 651 1323:iconst_1        
	//* 652 1324:istore          6
	//* 653 1326:aload_0         
	//* 654 1327:getfield        #328 <Field int mTotalLength>
	//* 655 1330:istore          7
	//* 656 1332:aload           24
	//* 657 1334:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//* 658 1337:istore          13
	//* 659 1339:aload           25
	//* 660 1341:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//* 661 1344:istore          14
	//* 662 1346:aload_0         
	//* 663 1347:iload           7
	//* 664 1349:aload           25
	//* 665 1351:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//* 666 1354:iload           13
	//* 667 1356:iload           7
	//* 668 1358:iadd            
	//* 669 1359:iload           14
	//* 670 1361:iadd            
	//* 671 1362:iadd            
	//* 672 1363:aload_0         
	//* 673 1364:aload           24
	//* 674 1366:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//* 675 1369:iadd            
	//* 676 1370:invokestatic    #407 <Method int Math.max(int, int)>
	//* 677 1373:putfield        #328 <Field int mTotalLength>
	//* 678 1376:iload           10
	//* 679 1378:istore          7
	//* 680 1380:iload           5
	//* 681 1382:istore          10
	//* 682 1384:iload           9
	//* 683 1386:istore          5
	//* 684 1388:iload           10
	//* 685 1390:istore          9
	//* 686 1392:goto            1065
	//* 687 1395:iload           13
	//* 688 1397:ifle            1421
	//* 689 1400:iload           13
	//* 690 1402:istore          10
	//* 691 1404:aload           24
	//* 692 1406:iload           16
	//* 693 1408:iload           10
	//* 694 1410:ldc1            #160 <Int 0x40000000>
	//* 695 1412:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 696 1415:invokevirtual   #396 <Method void View.measure(int, int)>
	//* 697 1418:goto            1204
	//* 698 1421:iconst_0        
	//* 699 1422:istore          10
	//* 700 1424:goto            1404
	//* 701 1427:iconst_0        
	//* 702 1428:istore          8
	//* 703 1430:goto            1291
	//* 704 1433:iload           14
	//* 705 1435:istore          8
	//* 706 1437:goto            1300
	//* 707 1440:iconst_0        
	//* 708 1441:istore          6
	//* 709 1443:goto            1326
	//* 710 1446:aload_0         
	//* 711 1447:aload_0         
	//* 712 1448:getfield        #328 <Field int mTotalLength>
	//* 713 1451:aload_0         
	//* 714 1452:invokevirtual   #280 <Method int getPaddingTop()>
	//* 715 1455:aload_0         
	//* 716 1456:invokevirtual   #261 <Method int getPaddingBottom()>
	//* 717 1459:iadd            
	//* 718 1460:iadd            
	//* 719 1461:putfield        #328 <Field int mTotalLength>
	//* 720 1464:iload           6
	//* 721 1466:istore          9
	//* 722 1468:iload           7
	//* 723 1470:istore          6
	//* 724 1472:iload           9
	//* 725 1474:istore          7
	//* 726 1476:iload           7
	//* 727 1478:ifne            1636
	//* 728 1481:iload           20
	//* 729 1483:ldc1            #160 <Int 0x40000000>
	//* 730 1485:icmpeq          1636
	//* 731 1488:aload_0         
	//* 732 1489:iload           6
	//* 733 1491:aload_0         
	//* 734 1492:invokevirtual   #237 <Method int getPaddingLeft()>
	//* 735 1495:aload_0         
	//* 736 1496:invokevirtual   #243 <Method int getPaddingRight()>
	//* 737 1499:iadd            
	//* 738 1500:iadd            
	//* 739 1501:aload_0         
	//* 740 1502:invokevirtual   #412 <Method int getSuggestedMinimumWidth()>
	//* 741 1505:invokestatic    #407 <Method int Math.max(int, int)>
	//* 742 1508:iload_1         
	//* 743 1509:iload           5
	//* 744 1511:invokestatic    #416 <Method int View.resolveSizeAndState(int, int, int)>
	//* 745 1514:iload           15
	//* 746 1516:invokevirtual   #427 <Method void setMeasuredDimension(int, int)>
	//* 747 1519:iload           12
	//* 748 1521:ifeq            1531
	//* 749 1524:aload_0         
	//* 750 1525:iload           19
	//* 751 1527:iload_2         
	//* 752 1528:invokespecial   #434 <Method void forceUniformWidth(int, int)>
	//* 753 1531:return          
	//* 754 1532:iload           10
	//* 755 1534:iload           13
	//* 756 1536:invokestatic    #407 <Method int Math.max(int, int)>
	//* 757 1539:istore          10
	//* 758 1541:iload           23
	//* 759 1543:ifeq            1643
	//* 760 1546:iload           21
	//* 761 1548:ldc1            #160 <Int 0x40000000>
	//* 762 1550:icmpeq          1643
	//* 763 1553:iconst_0        
	//* 764 1554:istore          9
	//* 765 1556:iload           9
	//* 766 1558:iload           19
	//* 767 1560:icmpge          1643
	//* 768 1563:aload_0         
	//* 769 1564:iload           9
	//* 770 1566:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//* 771 1569:astore          24
	//* 772 1571:aload           24
	//* 773 1573:ifnull          1586
	//* 774 1576:aload           24
	//* 775 1578:invokevirtual   #174 <Method int View.getVisibility()>
	//* 776 1581:bipush          8
	//* 777 1583:icmpne          1595
	//* 778 1586:iload           9
	//* 779 1588:iconst_1        
	//* 780 1589:iadd            
	//* 781 1590:istore          9
	//* 782 1592:goto            1556
	//* 783 1595:aload           24
	//* 784 1597:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 785 1600:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//* 786 1603:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 787 1606:fconst_0        
	//* 788 1607:fcmpl           
	//* 789 1608:ifle            1586
	//* 790 1611:aload           24
	//* 791 1613:aload           24
	//* 792 1615:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//* 793 1618:ldc1            #160 <Int 0x40000000>
	//* 794 1620:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 795 1623:iload           8
	//* 796 1625:ldc1            #160 <Int 0x40000000>
	//* 797 1627:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 798 1630:invokevirtual   #396 <Method void View.measure(int, int)>
	//* 799 1633:goto            1586
	//* 800 1636:iload           8
	//* 801 1638:istore          6
	//* 802 1640:goto            1488
	//* 803 1643:iload           10
	//* 804 1645:istore          8
	//* 805 1647:iload           6
	//* 806 1649:istore          9
	//* 807 1651:iload           8
	//* 808 1653:istore          6
	//* 809 1655:iload           9
	//* 810 1657:istore          8
	//* 811 1659:goto            1476
	//* 812 1662:iload           5
	//* 813 1664:istore          10
	//* 814 1666:iload           9
	//* 815 1668:istore          5
	//* 816 1670:iload           10
	//* 817 1672:istore          9
	//* 818 1674:goto            1240
		{
			j1 = j2;
	//  819 1677:iload           12
	//  820 1679:istore          8
		}
		j2 = layoutparams.leftMargin;
		j2 = layoutparams.rightMargin + j2;
		i5 = view.getMeasuredWidth() + j2;
		k5 = Math.max(l, i5);
		j5 = View.combineMeasuredStates(k, view.getMeasuredState());
		if(i1 != 0 && layoutparams.width == -1)
			i1 = 1;
		else
			i1 = 0;
		if(layoutparams.weight > 0.0F)
		{
			if(k1 == 0)
				j2 = i5;
			l = Math.max(k2, j2);
			k = l1;
		} else
		{
			if(k1 == 0)
				j2 = i5;
			k = Math.max(l1, j2);
			l = k2;
		}
		i2 += getChildrenSkipCount(view, i2);
		k2 = l;
		l1 = k;
		k1 = k5;
		k = k3;
		k3 = j5;
		j2 = j1;
		l = k4;
		j1 = k3;
		  goto _L3
label1:
		{
			{
				if(mTotalLength > 0 && hasDividerBeforeChildAt(l5))
					mTotalLength = mTotalLength + mDividerHeight;
				if(flag && (j6 == 0x80000000 || j6 == 0))
				{
					mTotalLength = 0;
					i2 = 0;
					while(i2 < l5) 
					{
						view = getVirtualChildAt(i2);
						if(view == null)
							mTotalLength = mTotalLength + measureNullChild(i2);
						else
						if(view.getVisibility() == 8)
						{
							i2 = getChildrenSkipCount(view, i2) + i2;
						} else
						{
							layoutparams = (LayoutParams)view.getLayoutParams();
							k3 = mTotalLength;
							k4 = layoutparams.topMargin;
							mTotalLength = Math.max(k3, layoutparams.bottomMargin + (k3 + j1 + k4) + getNextLocationOffset(view));
						}
						i2++;
					}
				}
				mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
				k4 = View.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumHeight()), j, 0);
				i2 = (0xffffff & k4) - mTotalLength;
				if(k1 == 0 && (i2 == 0 || f <= 0.0F))
					break label1;
				if(mWeightSum > 0.0F)
					f = mWeightSum;
				mTotalLength = 0;
				j1 = 0;
				k1 = i1;
				i1 = l1;
				l1 = i2;
				i2 = j1;
				j1 = l;
				l = k1;
				k1 = l1;
				while(i2 < l5) 
				{
					view = getVirtualChildAt(i2);
					if(view.getVisibility() == 8)
					{
						l1 = i1;
						i1 = j1;
						j1 = l1;
					} else
					{
						layoutparams = (LayoutParams)view.getLayoutParams();
						f1 = layoutparams.weight;
						if(f1 > 0.0F)
						{
							k2 = (int)(((float)k1 * f1) / f);
							i5 = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width);
							if(layoutparams.height != 0 || j6 != 0x40000000)
							{
								k3 = k2 + view.getMeasuredHeight();
								l1 = k3;
								if(k3 < 0)
									l1 = 0;
								view.measure(i5, android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
							} else
							{
								if(k2 > 0)
									l1 = k2;
								else
									l1 = 0;
								view.measure(i5, android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
							}
							k = View.combineMeasuredStates(k, view.getMeasuredState() & 0xffffff00);
							l1 = k1 - k2;
							k1 = k;
							f -= f1;
							k = l1;
						} else
						{
							l1 = k;
							k = k1;
							k1 = l1;
						}
						k2 = layoutparams.leftMargin + layoutparams.rightMargin;
						k3 = view.getMeasuredWidth() + k2;
						l1 = Math.max(j1, k3);
						if(i6 != 0x40000000 && layoutparams.width == -1)
							j1 = 1;
						else
							j1 = 0;
						if(j1 != 0)
							j1 = k2;
						else
							j1 = k3;
						j1 = Math.max(i1, j1);
						if(l != 0 && layoutparams.width == -1)
							l = 1;
						else
							l = 0;
						i1 = mTotalLength;
						k2 = view.getMeasuredHeight();
						k3 = layoutparams.topMargin;
						mTotalLength = Math.max(i1, layoutparams.bottomMargin + (k2 + i1 + k3) + getNextLocationOffset(view));
						i1 = l1;
						l1 = k;
						k = k1;
						k1 = l1;
					}
					i2++;
					l1 = i1;
					i1 = j1;
					j1 = l1;
				}
				mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
				k1 = l;
				l = i1;
				i1 = k1;
			}
			if(i1 != 0 || i6 == 0x40000000)
				l = j1;
			setMeasuredDimension(View.resolveSizeAndState(Math.max(l + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, k), k4);
			if(j2 != 0)
				forceUniformWidth(l5, j);
			return;
		}
		l1 = Math.max(l1, k2);
		if(flag && j6 != 0x40000000)
		{
			k1 = 0;
			do
			{
				if(k1 >= l5)
					break;
				view = getVirtualChildAt(k1);
				if(view != null && view.getVisibility() != 8 && ((LayoutParams)view.getLayoutParams()).weight > 0.0F)
					view.measure(android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
				k1++;
			} while(true);
		}
		j1 = l1;
		k1 = l;
		l = j1;
		j1 = k1;
		if(false)
			;
		else
			break MISSING_BLOCK_LABEL_1476;
	//* 821 1681:goto            550
	}

	protected void onDraw(Canvas canvas)
	{
		if(mDivider == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #269 <Field Drawable mDivider>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(mOrientation == 1)
	//*   4    8:aload_0         
	//*   5    9:getfield        #284 <Field int mOrientation>
	//*   6   12:iconst_1        
	//*   7   13:icmpne          22
		{
			drawDividersVertical(canvas);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #437 <Method void drawDividersVertical(Canvas)>
			return;
	//   11   21:return          
		} else
		{
			drawDividersHorizontal(canvas);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #439 <Method void drawDividersHorizontal(Canvas)>
			return;
	//   15   27:return          
		}
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #446 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          22
		{
			super.onInitializeAccessibilityEvent(accessibilityevent);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #448 <Method void ViewGroup.onInitializeAccessibilityEvent(AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/widget/LinearLayoutCompat)).getName())));
	//    6   13:aload_1         
	//    7   14:ldc1            #2   <Class LinearLayoutCompat>
	//    8   16:invokevirtual   #454 <Method String Class.getName()>
	//    9   19:invokevirtual   #460 <Method void AccessibilityEvent.setClassName(CharSequence)>
		}
	//   10   22:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #446 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          22
		{
			super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #464 <Method void ViewGroup.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
			accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/widget/LinearLayoutCompat)).getName())));
	//    6   13:aload_1         
	//    7   14:ldc1            #2   <Class LinearLayoutCompat>
	//    8   16:invokevirtual   #454 <Method String Class.getName()>
	//    9   19:invokevirtual   #467 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
		}
	//   10   22:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		if(mOrientation == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #284 <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          19
		{
			layoutVertical(i, j, k, l);
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:iload           5
	//    9   15:invokevirtual   #471 <Method void layoutVertical(int, int, int, int)>
			return;
	//   10   18:return          
		} else
		{
			layoutHorizontal(i, j, k, l);
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:iload_3         
	//   14   22:iload           4
	//   15   24:iload           5
	//   16   26:invokevirtual   #473 <Method void layoutHorizontal(int, int, int, int)>
			return;
	//   17   29:return          
		}
	}

	protected void onMeasure(int i, int j)
	{
		if(mOrientation == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #284 <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          15
		{
			measureVertical(i, j);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iload_2         
	//    7   11:invokevirtual   #476 <Method void measureVertical(int, int)>
			return;
	//    8   14:return          
		} else
		{
			measureHorizontal(i, j);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #478 <Method void measureHorizontal(int, int)>
			return;
	//   13   21:return          
		}
	}

	public void setBaselineAligned(boolean flag)
	{
		mBaselineAligned = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field boolean mBaselineAligned>
	//    3    5:return          
	}

	public void setBaselineAlignedChildIndex(int i)
	{
		if(i < 0 || i >= getChildCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            12
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #311 <Method int getChildCount()>
	//*   5    9:icmplt          49
		{
			throw new IllegalArgumentException((new StringBuilder()).append("base aligned child index out of range (0, ").append(getChildCount()).append(")").toString());
	//    6   12:new             #481 <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:new             #483 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #485 <Method void StringBuilder()>
	//   11   23:ldc2            #487 <String "base aligned child index out of range (0, ">
	//   12   26:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:aload_0         
	//   14   30:invokevirtual   #311 <Method int getChildCount()>
	//   15   33:invokevirtual   #494 <Method StringBuilder StringBuilder.append(int)>
	//   16   36:ldc2            #496 <String ")">
	//   17   39:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   18   42:invokevirtual   #499 <Method String StringBuilder.toString()>
	//   19   45:invokespecial   #500 <Method void IllegalArgumentException(String)>
	//   20   48:athrow          
		} else
		{
			mBaselineAlignedChildIndex = i;
	//   21   49:aload_0         
	//   22   50:iload_1         
	//   23   51:putfield        #63  <Field int mBaselineAlignedChildIndex>
			return;
	//   24   54:return          
		}
	}

	public void setDividerDrawable(Drawable drawable)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(drawable == mDivider)
	//*   2    2:aload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #269 <Field Drawable mDivider>
	//*   5    7:if_acmpne       11
			return;
	//    6   10:return          
		mDivider = drawable;
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:putfield        #269 <Field Drawable mDivider>
		if(drawable != null)
	//*  10   16:aload_1         
	//*  11   17:ifnull          52
		{
			mDividerWidth = drawable.getIntrinsicWidth();
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #503 <Method int Drawable.getIntrinsicWidth()>
	//   15   25:putfield        #234 <Field int mDividerWidth>
			mDividerHeight = drawable.getIntrinsicHeight();
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #506 <Method int Drawable.getIntrinsicHeight()>
	//   19   33:putfield        #252 <Field int mDividerHeight>
		} else
	//*  20   36:aload_1         
	//*  21   37:ifnonnull       42
	//*  22   40:iconst_1        
	//*  23   41:istore_2        
	//*  24   42:aload_0         
	//*  25   43:iload_2         
	//*  26   44:invokevirtual   #509 <Method void setWillNotDraw(boolean)>
	//*  27   47:aload_0         
	//*  28   48:invokevirtual   #512 <Method void requestLayout()>
	//*  29   51:return          
		{
			mDividerWidth = 0;
	//   30   52:aload_0         
	//   31   53:iconst_0        
	//   32   54:putfield        #234 <Field int mDividerWidth>
			mDividerHeight = 0;
	//   33   57:aload_0         
	//   34   58:iconst_0        
	//   35   59:putfield        #252 <Field int mDividerHeight>
		}
		if(drawable == null)
			flag = true;
		setWillNotDraw(flag);
		requestLayout();
	//*  36   62:goto            36
	}

	public void setDividerPadding(int i)
	{
		mDividerPadding = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #149 <Field int mDividerPadding>
	//    3    5:return          
	}

	public void setGravity(int i)
	{
		if(mGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field int mGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          45
		{
			if((0x800007 & i) == 0)
	//*   4    8:ldc2            #357 <Int 0x800007>
	//*   5   11:iload_1         
	//*   6   12:iand            
	//*   7   13:ifne            46
				i = 0x800003 | i;
	//    8   16:ldc2            #514 <Int 0x800003>
	//    9   19:iload_1         
	//   10   20:ior             
	//   11   21:istore_1        
			int j = i;
	//   12   22:iload_1         
	//   13   23:istore_2        
			if((i & 0x70) == 0)
	//*  14   24:iload_1         
	//*  15   25:bipush          112
	//*  16   27:iand            
	//*  17   28:ifne            36
				j = i | 0x30;
	//   18   31:iload_1         
	//   19   32:bipush          48
	//   20   34:ior             
	//   21   35:istore_2        
			mGravity = j;
	//   22   36:aload_0         
	//   23   37:iload_2         
	//   24   38:putfield        #68  <Field int mGravity>
			requestLayout();
	//   25   41:aload_0         
	//   26   42:invokevirtual   #512 <Method void requestLayout()>
		}
	//   27   45:return          
	//*  28   46:goto            22
	}

	public void setHorizontalGravity(int i)
	{
		i &= 0x800007;
	//    0    0:iload_1         
	//    1    1:ldc2            #357 <Int 0x800007>
	//    2    4:iand            
	//    3    5:istore_1        
		if((mGravity & 0x800007) != i)
	//*   4    6:aload_0         
	//*   5    7:getfield        #68  <Field int mGravity>
	//*   6   10:ldc2            #357 <Int 0x800007>
	//*   7   13:iand            
	//*   8   14:iload_1         
	//*   9   15:icmpeq          36
		{
			mGravity = i | mGravity & 0xff7ffff8;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #68  <Field int mGravity>
	//   14   24:ldc2            #516 <Int 0xff7ffff8>
	//   15   27:iand            
	//   16   28:ior             
	//   17   29:putfield        #68  <Field int mGravity>
			requestLayout();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #512 <Method void requestLayout()>
		}
	//   20   36:return          
	}

	public void setMeasureWithLargestChildEnabled(boolean flag)
	{
		mUseLargestChild = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #125 <Field boolean mUseLargestChild>
	//    3    5:return          
	}

	public void setOrientation(int i)
	{
		if(mOrientation != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #284 <Field int mOrientation>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mOrientation = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #284 <Field int mOrientation>
			requestLayout();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #512 <Method void requestLayout()>
		}
	//    9   17:return          
	}

	public void setShowDividers(int i)
	{
		if(i != mShowDividers)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #141 <Field int mShowDividers>
	//*   3    5:icmpeq          12
			requestLayout();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #512 <Method void requestLayout()>
		mShowDividers = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #141 <Field int mShowDividers>
	//    9   17:return          
	}

	public void setVerticalGravity(int i)
	{
		i &= 0x70;
	//    0    0:iload_1         
	//    1    1:bipush          112
	//    2    3:iand            
	//    3    4:istore_1        
		if((mGravity & 0x70) != i)
	//*   4    5:aload_0         
	//*   5    6:getfield        #68  <Field int mGravity>
	//*   6    9:bipush          112
	//*   7   11:iand            
	//*   8   12:iload_1         
	//*   9   13:icmpeq          33
		{
			mGravity = i | mGravity & 0xffffff8f;
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:aload_0         
	//   13   19:getfield        #68  <Field int mGravity>
	//   14   22:bipush          -113
	//   15   24:iand            
	//   16   25:ior             
	//   17   26:putfield        #68  <Field int mGravity>
			requestLayout();
	//   18   29:aload_0         
	//   19   30:invokevirtual   #512 <Method void requestLayout()>
		}
	//   20   33:return          
	}

	public void setWeightSum(float f)
	{
		mWeightSum = Math.max(0.0F, f);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:invokestatic    #524 <Method float Math.max(float, float)>
	//    4    6:putfield        #117 <Field float mWeightSum>
	//    5    9:return          
	}

	public boolean shouldDelayChildPressedState()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public static final int HORIZONTAL = 0;
	private static final int INDEX_BOTTOM = 2;
	private static final int INDEX_CENTER_VERTICAL = 0;
	private static final int INDEX_FILL = 3;
	private static final int INDEX_TOP = 1;
	public static final int SHOW_DIVIDER_BEGINNING = 1;
	public static final int SHOW_DIVIDER_END = 4;
	public static final int SHOW_DIVIDER_MIDDLE = 2;
	public static final int SHOW_DIVIDER_NONE = 0;
	public static final int VERTICAL = 1;
	private static final int VERTICAL_GRAVITY_COUNT = 4;
	private boolean mBaselineAligned;
	private int mBaselineAlignedChildIndex;
	private int mBaselineChildTop;
	private Drawable mDivider;
	private int mDividerHeight;
	private int mDividerPadding;
	private int mDividerWidth;
	private int mGravity;
	private int mMaxAscent[];
	private int mMaxDescent[];
	private int mOrientation;
	private int mShowDividers;
	private int mTotalLength;
	private boolean mUseLargestChild;
	private float mWeightSum;
}
