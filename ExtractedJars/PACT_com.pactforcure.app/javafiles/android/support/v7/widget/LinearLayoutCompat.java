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
	//*  10   17:icmpge          110
		{
			View view = getVirtualChildAt(i);
	//   11   20:aload_0         
	//   12   21:iload_2         
	//   13   22:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   14   25:astore          6
			if(view != null && view.getVisibility() != 8 && hasDividerBeforeChildAt(i))
	//*  15   27:aload           6
	//*  16   29:ifnull          83
	//*  17   32:aload           6
	//*  18   34:invokevirtual   #174 <Method int View.getVisibility()>
	//*  19   37:bipush          8
	//*  20   39:icmpeq          83
	//*  21   42:aload_0         
	//*  22   43:iload_2         
	//*  23   44:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//*  24   47:ifeq            83
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   25   50:aload           6
	//   26   52:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   27   55:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   28   58:astore          7
				int k;
				if(flag)
	//*  29   60:iload           5
	//*  30   62:ifeq            90
					k = view.getRight() + layoutparams.rightMargin;
	//   31   65:aload           6
	//   32   67:invokevirtual   #219 <Method int View.getRight()>
	//   33   70:aload           7
	//   34   72:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//   35   75:iadd            
	//   36   76:istore_3        
				else
	//*  37   77:aload_0         
	//*  38   78:aload_1         
	//*  39   79:iload_3         
	//*  40   80:invokevirtual   #226 <Method void drawVerticalDivider(Canvas, int)>
	//*  41   83:iload_2         
	//*  42   84:iconst_1        
	//*  43   85:iadd            
	//*  44   86:istore_2        
	//*  45   87:goto            14
					k = view.getLeft() - layoutparams.leftMargin - mDividerWidth;
	//   46   90:aload           6
	//   47   92:invokevirtual   #229 <Method int View.getLeft()>
	//   48   95:aload           7
	//   49   97:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//   50  100:isub            
	//   51  101:aload_0         
	//   52  102:getfield        #234 <Field int mDividerWidth>
	//   53  105:isub            
	//   54  106:istore_3        
				drawVerticalDivider(canvas, k);
			}
			i++;
		}
	//*  55  107:goto            77
		if(hasDividerBeforeChildAt(l))
	//*  56  110:aload_0         
	//*  57  111:iload           4
	//*  58  113:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//*  59  116:ifeq            150
		{
			View view1 = getVirtualChildAt(l - 1);
	//   60  119:aload_0         
	//   61  120:iload           4
	//   62  122:iconst_1        
	//   63  123:isub            
	//   64  124:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   65  127:astore          6
			int j;
			if(view1 == null)
	//*  66  129:aload           6
	//*  67  131:ifnonnull       169
			{
				if(flag)
	//*  68  134:iload           5
	//*  69  136:ifeq            151
					j = getPaddingLeft();
	//   70  139:aload_0         
	//   71  140:invokevirtual   #237 <Method int getPaddingLeft()>
	//   72  143:istore_2        
				else
	//*  73  144:aload_0         
	//*  74  145:aload_1         
	//*  75  146:iload_2         
	//*  76  147:invokevirtual   #226 <Method void drawVerticalDivider(Canvas, int)>
	//*  77  150:return          
					j = getWidth() - getPaddingRight() - mDividerWidth;
	//   78  151:aload_0         
	//   79  152:invokevirtual   #240 <Method int getWidth()>
	//   80  155:aload_0         
	//   81  156:invokevirtual   #243 <Method int getPaddingRight()>
	//   82  159:isub            
	//   83  160:aload_0         
	//   84  161:getfield        #234 <Field int mDividerWidth>
	//   85  164:isub            
	//   86  165:istore_2        
			} else
	//*  87  166:goto            144
			{
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//   88  169:aload           6
	//   89  171:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   90  174:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   91  177:astore          7
				if(flag)
	//*  92  179:iload           5
	//*  93  181:ifeq            204
					j = view1.getLeft() - layoutparams1.leftMargin - mDividerWidth;
	//   94  184:aload           6
	//   95  186:invokevirtual   #229 <Method int View.getLeft()>
	//   96  189:aload           7
	//   97  191:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//   98  194:isub            
	//   99  195:aload_0         
	//  100  196:getfield        #234 <Field int mDividerWidth>
	//  101  199:isub            
	//  102  200:istore_2        
				else
	//* 103  201:goto            144
					j = view1.getRight() + layoutparams1.rightMargin;
	//  104  204:aload           6
	//  105  206:invokevirtual   #219 <Method int View.getRight()>
	//  106  209:aload           7
	//  107  211:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  108  214:iadd            
	//  109  215:istore_2        
			}
			drawVerticalDivider(canvas, j);
		}
	//* 110  216:goto            144
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
				j = view1.getBottom() + layoutparams1.bottomMargin;
	//   72  134:aload           4
	//   73  136:invokevirtual   #264 <Method int View.getBottom()>
	//   74  139:aload           5
	//   75  141:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//   76  144:iadd            
	//   77  145:istore_2        
			}
			drawHorizontalDivider(canvas, j);
		}
	//*  78  146:goto            117
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
		int k;
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
	//   24   46:astore          5
		k = view.getBaseline();
	//   25   48:aload           5
	//   26   50:invokevirtual   #322 <Method int View.getBaseline()>
	//   27   53:istore_3        
		if(k != -1)
			break; /* Loop/switch isn't completed */
	//   28   54:iload_3         
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
		int j;
		j = mBaselineChildTop;
	//   39   77:aload_0         
	//   40   78:getfield        #65  <Field int mBaselineChildTop>
	//   41   81:istore_2        
		i = j;
	//   42   82:iload_2         
	//   43   83:istore_1        
		if(mOrientation != 1) goto _L6; else goto _L5
	//   44   84:aload_0         
	//   45   85:getfield        #284 <Field int mOrientation>
	//   46   88:iconst_1        
	//   47   89:icmpne          142
_L5:
		int l;
		l = mGravity & 0x70;
	//   48   92:aload_0         
	//   49   93:getfield        #68  <Field int mGravity>
	//   50   96:bipush          112
	//   51   98:iand            
	//   52   99:istore          4
		i = j;
	//   53  101:iload_2         
	//   54  102:istore_1        
		if(l == 48) goto _L6; else goto _L7
	//   55  103:iload           4
	//   56  105:bipush          48
	//   57  107:icmpeq          142
_L7:
		l;
	//   58  110:iload           4
		JVM INSTR lookupswitch 2: default 140
	//	               16: 181
	//	               80: 158;
	//   59  112:lookupswitch    2: default 140
	//	               16: 181
	//	               80: 158
		   goto _L8 _L9 _L10
_L8:
		i = j;
	//   60  140:iload_2         
	//   61  141:istore_1        
_L6:
		return ((LayoutParams)view.getLayoutParams()).topMargin + i + k;
	//   62  142:aload           5
	//   63  144:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   64  147:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   65  150:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//   66  153:iload_1         
	//   67  154:iadd            
	//   68  155:iload_3         
	//   69  156:iadd            
	//   70  157:ireturn         
_L10:
		i = getBottom() - getTop() - getPaddingBottom() - mTotalLength;
	//   71  158:aload_0         
	//   72  159:invokevirtual   #325 <Method int getBottom()>
	//   73  162:aload_0         
	//   74  163:invokevirtual   #326 <Method int getTop()>
	//   75  166:isub            
	//   76  167:aload_0         
	//   77  168:invokevirtual   #261 <Method int getPaddingBottom()>
	//   78  171:isub            
	//   79  172:aload_0         
	//   80  173:getfield        #328 <Field int mTotalLength>
	//   81  176:isub            
	//   82  177:istore_1        
		continue; /* Loop/switch isn't completed */
	//   83  178:goto            142
_L9:
		i = j + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - mTotalLength) / 2;
	//   84  181:iload_2         
	//   85  182:aload_0         
	//   86  183:invokevirtual   #325 <Method int getBottom()>
	//   87  186:aload_0         
	//   88  187:invokevirtual   #326 <Method int getTop()>
	//   89  190:isub            
	//   90  191:aload_0         
	//   91  192:invokevirtual   #280 <Method int getPaddingTop()>
	//   92  195:isub            
	//   93  196:aload_0         
	//   94  197:invokevirtual   #261 <Method int getPaddingBottom()>
	//   95  200:isub            
	//   96  201:aload_0         
	//   97  202:getfield        #328 <Field int mTotalLength>
	//   98  205:isub            
	//   99  206:iconst_2        
	//  100  207:idiv            
	//  101  208:iadd            
	//  102  209:istore_1        
		if(true) goto _L6; else goto _L11
	//  103  210:goto            142
_L11:
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
		if((mShowDividers & 2) != 0)
	//*  22   36:aload_0         
	//*  23   37:getfield        #141 <Field int mShowDividers>
	//*  24   40:iconst_2        
	//*  25   41:iand            
	//*  26   42:ifeq            81
		{
			boolean flag1 = false;
	//   27   45:iconst_0        
	//   28   46:istore_3        
			i--;
	//   29   47:iload_1         
	//   30   48:iconst_1        
	//   31   49:isub            
	//   32   50:istore_1        
			do
			{
label0:
				{
					boolean flag = flag1;
	//   33   51:iload_3         
	//   34   52:istore_2        
					if(i >= 0)
	//*  35   53:iload_1         
	//*  36   54:iflt            72
					{
						if(getChildAt(i).getVisibility() == 8)
							break label0;
	//   37   57:aload_0         
	//   38   58:iload_1         
	//   39   59:invokevirtual   #321 <Method View getChildAt(int)>
	//   40   62:invokevirtual   #174 <Method int View.getVisibility()>
	//   41   65:bipush          8
	//   42   67:icmpeq          74
						flag = true;
	//   43   70:iconst_1        
	//   44   71:istore_2        
					}
					return flag;
	//   45   72:iload_2         
	//   46   73:ireturn         
				}
				i--;
	//   47   74:iload_1         
	//   48   75:iconst_1        
	//   49   76:isub            
	//   50   77:istore_1        
			} while(true);
	//   51   78:goto            51
		} else
		{
			return false;
	//   52   81:iconst_0        
	//   53   82:ireturn         
		}
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
		int k2;
		int l2;
		int i3;
		int j3;
		int k3;
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
		k2 = l - j;
	//    6   12:iload           4
	//    7   14:iload_2         
	//    8   15:isub            
	//    9   16:istore          9
		l2 = getPaddingBottom();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #261 <Method int getPaddingBottom()>
	//   12   22:istore          10
		i3 = getPaddingBottom();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #261 <Method int getPaddingBottom()>
	//   15   28:istore          11
		j3 = getVirtualChildCount();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #206 <Method int getVirtualChildCount()>
	//   18   34:istore          12
		j = mGravity;
	//   19   36:aload_0         
	//   20   37:getfield        #68  <Field int mGravity>
	//   21   40:istore_2        
		k3 = mGravity;
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
	//	               1: 200
	//	               5: 183;
	//   40   77:lookupswitch    2: default 104
	//	               1: 200
	//	               5: 183
		   goto _L1 _L2 _L3
_L1:
		i = getPaddingLeft();
	//   41  104:aload_0         
	//   42  105:invokevirtual   #237 <Method int getPaddingLeft()>
	//   43  108:istore_1        
_L17:
		int i1;
		i1 = 0;
	//   44  109:iconst_0        
	//   45  110:istore          5
		l = 1;
	//   46  112:iconst_1        
	//   47  113:istore          4
		if(flag)
	//*  48  115:iload           17
	//*  49  117:ifeq            129
		{
			i1 = j3 - 1;
	//   50  120:iload           12
	//   51  122:iconst_1        
	//   52  123:isub            
	//   53  124:istore          5
			l = -1;
	//   54  126:iconst_m1       
	//   55  127:istore          4
		}
		j = 0;
	//   56  129:iconst_0        
	//   57  130:istore_2        
		k = i;
	//   58  131:iload_1         
	//   59  132:istore_3        
_L8:
		if(j >= j3) goto _L5; else goto _L4
	//   60  133:iload_2         
	//   61  134:iload           12
	//   62  136:icmpge          544
_L4:
		int l3;
		View view;
		l3 = i1 + l * j;
	//   63  139:iload           5
	//   64  141:iload           4
	//   65  143:iload_2         
	//   66  144:imul            
	//   67  145:iadd            
	//   68  146:istore          14
		view = getVirtualChildAt(l3);
	//   69  148:aload_0         
	//   70  149:iload           14
	//   71  151:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   72  154:astore          21
		if(view != null) goto _L7; else goto _L6
	//   73  156:aload           21
	//   74  158:ifnonnull       219
_L6:
		int j1;
		i = k + measureNullChild(l3);
	//   75  161:iload_3         
	//   76  162:aload_0         
	//   77  163:iload           14
	//   78  165:invokevirtual   #371 <Method int measureNullChild(int)>
	//   79  168:iadd            
	//   80  169:istore_1        
		j1 = j;
	//   81  170:iload_2         
	//   82  171:istore          6
_L10:
		j = j1 + 1;
	//   83  173:iload           6
	//   84  175:iconst_1        
	//   85  176:iadd            
	//   86  177:istore_2        
		k = i;
	//   87  178:iload_1         
	//   88  179:istore_3        
		  goto _L8
	//*  89  180:goto            133
_L3:
		i = (getPaddingLeft() + k) - i - mTotalLength;
	//   90  183:aload_0         
	//   91  184:invokevirtual   #237 <Method int getPaddingLeft()>
	//   92  187:iload_3         
	//   93  188:iadd            
	//   94  189:iload_1         
	//   95  190:isub            
	//   96  191:aload_0         
	//   97  192:getfield        #328 <Field int mTotalLength>
	//   98  195:isub            
	//   99  196:istore_1        
		continue; /* Loop/switch isn't completed */
	//  100  197:goto            109
_L2:
		i = getPaddingLeft() + (k - i - mTotalLength) / 2;
	//  101  200:aload_0         
	//  102  201:invokevirtual   #237 <Method int getPaddingLeft()>
	//  103  204:iload_3         
	//  104  205:iload_1         
	//  105  206:isub            
	//  106  207:aload_0         
	//  107  208:getfield        #328 <Field int mTotalLength>
	//  108  211:isub            
	//  109  212:iconst_2        
	//  110  213:idiv            
	//  111  214:iadd            
	//  112  215:istore_1        
		continue; /* Loop/switch isn't completed */
	//  113  216:goto            109
_L7:
		i = k;
	//  114  219:iload_3         
	//  115  220:istore_1        
		j1 = j;
	//  116  221:iload_2         
	//  117  222:istore          6
		if(view.getVisibility() == 8) goto _L10; else goto _L9
	//  118  224:aload           21
	//  119  226:invokevirtual   #174 <Method int View.getVisibility()>
	//  120  229:bipush          8
	//  121  231:icmpeq          173
_L9:
		int i4;
		int j4;
		LayoutParams layoutparams;
		i4 = view.getMeasuredWidth();
	//  122  234:aload           21
	//  123  236:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  124  239:istore          15
		j4 = view.getMeasuredHeight();
	//  125  241:aload           21
	//  126  243:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  127  246:istore          16
		i = -1;
	//  128  248:iconst_m1       
	//  129  249:istore_1        
		layoutparams = (LayoutParams)view.getLayoutParams();
	//  130  250:aload           21
	//  131  252:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  132  255:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  133  258:astore          22
		j1 = i;
	//  134  260:iload_1         
	//  135  261:istore          6
		if(flag1)
	//* 136  263:iload           18
	//* 137  265:ifeq            287
		{
			j1 = i;
	//  138  268:iload_1         
	//  139  269:istore          6
			if(layoutparams.height != -1)
	//* 140  271:aload           22
	//* 141  273:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 142  276:iconst_m1       
	//* 143  277:icmpeq          287
				j1 = view.getBaseline();
	//  144  280:aload           21
	//  145  282:invokevirtual   #322 <Method int View.getBaseline()>
	//  146  285:istore          6
		}
		int l1 = layoutparams.gravity;
	//  147  287:aload           22
	//  148  289:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//  149  292:istore          8
		i = l1;
	//  150  294:iload           8
	//  151  296:istore_1        
		if(l1 < 0)
	//* 152  297:iload           8
	//* 153  299:ifge            308
			i = k3 & 0x70;
	//  154  302:iload           13
	//  155  304:bipush          112
	//  156  306:iand            
	//  157  307:istore_1        
		i & 0x70;
	//  158  308:iload_1         
	//  159  309:bipush          112
	//  160  311:iand            
		JVM INSTR lookupswitch 3: default 348
	//	               16: 465
	//	               48: 432
	//	               80: 497;
	//  161  312:lookupswitch    3: default 348
	//	               16: 465
	//	               48: 432
	//	               80: 497
		   goto _L11 _L12 _L13 _L14
_L14:
		break MISSING_BLOCK_LABEL_497;
_L11:
		i = k1;
	//  162  348:iload           7
	//  163  350:istore_1        
_L15:
		j1 = k;
	//  164  351:iload_3         
	//  165  352:istore          6
		if(hasDividerBeforeChildAt(l3))
	//* 166  354:aload_0         
	//* 167  355:iload           14
	//* 168  357:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 169  360:ifeq            371
			j1 = k + mDividerWidth;
	//  170  363:iload_3         
	//  171  364:aload_0         
	//  172  365:getfield        #234 <Field int mDividerWidth>
	//  173  368:iadd            
	//  174  369:istore          6
		k = j1 + layoutparams.leftMargin;
	//  175  371:iload           6
	//  176  373:aload           22
	//  177  375:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  178  378:iadd            
	//  179  379:istore_3        
		setChildFrame(view, k + getLocationOffset(view), i, i4, j4);
	//  180  380:aload_0         
	//  181  381:aload           21
	//  182  383:iload_3         
	//  183  384:aload_0         
	//  184  385:aload           21
	//  185  387:invokevirtual   #376 <Method int getLocationOffset(View)>
	//  186  390:iadd            
	//  187  391:iload_1         
	//  188  392:iload           15
	//  189  394:iload           16
	//  190  396:invokespecial   #378 <Method void setChildFrame(View, int, int, int, int)>
		i = k + (layoutparams.rightMargin + i4 + getNextLocationOffset(view));
	//  191  399:iload_3         
	//  192  400:aload           22
	//  193  402:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  194  405:iload           15
	//  195  407:iadd            
	//  196  408:aload_0         
	//  197  409:aload           21
	//  198  411:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  199  414:iadd            
	//  200  415:iadd            
	//  201  416:istore_1        
		j1 = j + getChildrenSkipCount(view, l3);
	//  202  417:iload_2         
	//  203  418:aload_0         
	//  204  419:aload           21
	//  205  421:iload           14
	//  206  423:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//  207  426:iadd            
	//  208  427:istore          6
		  goto _L10
	//* 209  429:goto            173
_L13:
		int i2 = k1 + layoutparams.topMargin;
	//  210  432:iload           7
	//  211  434:aload           22
	//  212  436:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  213  439:iadd            
	//  214  440:istore          8
		i = i2;
	//  215  442:iload           8
	//  216  444:istore_1        
		if(j1 != -1)
	//* 217  445:iload           6
	//* 218  447:iconst_m1       
	//* 219  448:icmpeq          351
			i = i2 + (ai[1] - j1);
	//  220  451:iload           8
	//  221  453:aload           19
	//  222  455:iconst_1        
	//  223  456:iaload          
	//  224  457:iload           6
	//  225  459:isub            
	//  226  460:iadd            
	//  227  461:istore_1        
		  goto _L15
	//* 228  462:goto            351
_L12:
		i = ((k2 - k1 - i3 - j4) / 2 + k1 + layoutparams.topMargin) - layoutparams.bottomMargin;
	//  229  465:iload           9
	//  230  467:iload           7
	//  231  469:isub            
	//  232  470:iload           11
	//  233  472:isub            
	//  234  473:iload           16
	//  235  475:isub            
	//  236  476:iconst_2        
	//  237  477:idiv            
	//  238  478:iload           7
	//  239  480:iadd            
	//  240  481:aload           22
	//  241  483:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  242  486:iadd            
	//  243  487:aload           22
	//  244  489:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  245  492:isub            
	//  246  493:istore_1        
		  goto _L15
	//* 247  494:goto            351
		int j2 = k2 - l2 - j4 - layoutparams.bottomMargin;
	//  248  497:iload           9
	//  249  499:iload           10
	//  250  501:isub            
	//  251  502:iload           16
	//  252  504:isub            
	//  253  505:aload           22
	//  254  507:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  255  510:isub            
	//  256  511:istore          8
		i = j2;
	//  257  513:iload           8
	//  258  515:istore_1        
		if(j1 != -1)
	//* 259  516:iload           6
	//* 260  518:iconst_m1       
	//* 261  519:icmpeq          351
		{
			i = view.getMeasuredHeight();
	//  262  522:aload           21
	//  263  524:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  264  527:istore_1        
			i = j2 - (ai1[2] - (i - j1));
	//  265  528:iload           8
	//  266  530:aload           20
	//  267  532:iconst_2        
	//  268  533:iaload          
	//  269  534:iload_1         
	//  270  535:iload           6
	//  271  537:isub            
	//  272  538:isub            
	//  273  539:isub            
	//  274  540:istore_1        
		}
		  goto _L15
	//* 275  541:goto            351
_L5:
		return;
	//  276  544:return          
		if(true) goto _L17; else goto _L16
_L16:
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
	//	               16: 136
	//	               80: 118;
	//   25   44:lookupswitch    2: default 72
	//	               16: 136
	//	               80: 118
		   goto _L1 _L2 _L3
_L1:
		i = getPaddingTop();
	//   26   72:aload_0         
	//   27   73:invokevirtual   #280 <Method int getPaddingTop()>
	//   28   76:istore_1        
_L16:
		j = 0;
	//   29   77:iconst_0        
	//   30   78:istore_2        
_L8:
		if(j >= i2) goto _L5; else goto _L4
	//   31   79:iload_2         
	//   32   80:iload           9
	//   33   82:icmpge          394
_L4:
		View view = getVirtualChildAt(j);
	//   34   85:aload_0         
	//   35   86:iload_2         
	//   36   87:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   37   90:astore          13
		if(view != null) goto _L7; else goto _L6
	//   38   92:aload           13
	//   39   94:ifnonnull       156
_L6:
		k = i + measureNullChild(j);
	//   40   97:iload_1         
	//   41   98:aload_0         
	//   42   99:iload_2         
	//   43  100:invokevirtual   #371 <Method int measureNullChild(int)>
	//   44  103:iadd            
	//   45  104:istore_3        
		l = j;
	//   46  105:iload_2         
	//   47  106:istore          4
_L10:
		j = l + 1;
	//   48  108:iload           4
	//   49  110:iconst_1        
	//   50  111:iadd            
	//   51  112:istore_2        
		i = k;
	//   52  113:iload_3         
	//   53  114:istore_1        
		  goto _L8
	//*  54  115:goto            79
_L3:
		i = (getPaddingTop() + l) - j - mTotalLength;
	//   55  118:aload_0         
	//   56  119:invokevirtual   #280 <Method int getPaddingTop()>
	//   57  122:iload           4
	//   58  124:iadd            
	//   59  125:iload_2         
	//   60  126:isub            
	//   61  127:aload_0         
	//   62  128:getfield        #328 <Field int mTotalLength>
	//   63  131:isub            
	//   64  132:istore_1        
		continue; /* Loop/switch isn't completed */
	//   65  133:goto            77
_L2:
		i = getPaddingTop() + (l - j - mTotalLength) / 2;
	//   66  136:aload_0         
	//   67  137:invokevirtual   #280 <Method int getPaddingTop()>
	//   68  140:iload           4
	//   69  142:iload_2         
	//   70  143:isub            
	//   71  144:aload_0         
	//   72  145:getfield        #328 <Field int mTotalLength>
	//   73  148:isub            
	//   74  149:iconst_2        
	//   75  150:idiv            
	//   76  151:iadd            
	//   77  152:istore_1        
		continue; /* Loop/switch isn't completed */
	//   78  153:goto            77
_L7:
		k = i;
	//   79  156:iload_1         
	//   80  157:istore_3        
		l = j;
	//   81  158:iload_2         
	//   82  159:istore          4
		if(view.getVisibility() == 8) goto _L10; else goto _L9
	//   83  161:aload           13
	//   84  163:invokevirtual   #174 <Method int View.getVisibility()>
	//   85  166:bipush          8
	//   86  168:icmpeq          108
_L9:
		int k2;
		int l2;
		LayoutParams layoutparams;
		k2 = view.getMeasuredWidth();
	//   87  171:aload           13
	//   88  173:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//   89  176:istore          11
		l2 = view.getMeasuredHeight();
	//   90  178:aload           13
	//   91  180:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//   92  183:istore          12
		layoutparams = (LayoutParams)view.getLayoutParams();
	//   93  185:aload           13
	//   94  187:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   95  190:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   96  193:astore          14
		l = layoutparams.gravity;
	//   97  195:aload           14
	//   98  197:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//   99  200:istore          4
		k = l;
	//  100  202:iload           4
	//  101  204:istore_3        
		if(l < 0)
	//* 102  205:iload           4
	//* 103  207:ifge            217
			k = j2 & 0x800007;
	//  104  210:iload           10
	//  105  212:ldc2            #357 <Int 0x800007>
	//  106  215:iand            
	//  107  216:istore_3        
		GravityCompat.getAbsoluteGravity(k, ViewCompat.getLayoutDirection(((View) (this)))) & 7;
	//  108  217:iload_3         
	//  109  218:aload_0         
	//  110  219:invokestatic    #362 <Method int ViewCompat.getLayoutDirection(View)>
	//  111  222:invokestatic    #367 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//  112  225:bipush          7
	//  113  227:iand            
		JVM INSTR lookupswitch 2: default 256
	//	               1: 344
	//	               5: 376;
	//  114  228:lookupswitch    2: default 256
	//	               1: 344
	//	               5: 376
		   goto _L11 _L12 _L13
_L13:
		break MISSING_BLOCK_LABEL_376;
_L11:
		k = i1 + layoutparams.leftMargin;
	//  115  256:iload           5
	//  116  258:aload           14
	//  117  260:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  118  263:iadd            
	//  119  264:istore_3        
_L14:
		l = i;
	//  120  265:iload_1         
	//  121  266:istore          4
		if(hasDividerBeforeChildAt(j))
	//* 122  268:aload_0         
	//* 123  269:iload_2         
	//* 124  270:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 125  273:ifeq            284
			l = i + mDividerHeight;
	//  126  276:iload_1         
	//  127  277:aload_0         
	//  128  278:getfield        #252 <Field int mDividerHeight>
	//  129  281:iadd            
	//  130  282:istore          4
		i = l + layoutparams.topMargin;
	//  131  284:iload           4
	//  132  286:aload           14
	//  133  288:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  134  291:iadd            
	//  135  292:istore_1        
		setChildFrame(view, k, i + getLocationOffset(view), k2, l2);
	//  136  293:aload_0         
	//  137  294:aload           13
	//  138  296:iload_3         
	//  139  297:iload_1         
	//  140  298:aload_0         
	//  141  299:aload           13
	//  142  301:invokevirtual   #376 <Method int getLocationOffset(View)>
	//  143  304:iadd            
	//  144  305:iload           11
	//  145  307:iload           12
	//  146  309:invokespecial   #378 <Method void setChildFrame(View, int, int, int, int)>
		k = i + (layoutparams.bottomMargin + l2 + getNextLocationOffset(view));
	//  147  312:iload_1         
	//  148  313:aload           14
	//  149  315:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  150  318:iload           12
	//  151  320:iadd            
	//  152  321:aload_0         
	//  153  322:aload           13
	//  154  324:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  155  327:iadd            
	//  156  328:iadd            
	//  157  329:istore_3        
		l = j + getChildrenSkipCount(view, j);
	//  158  330:iload_2         
	//  159  331:aload_0         
	//  160  332:aload           13
	//  161  334:iload_2         
	//  162  335:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//  163  338:iadd            
	//  164  339:istore          4
		  goto _L10
	//* 165  341:goto            108
_L12:
		k = ((j1 - i1 - l1 - k2) / 2 + i1 + layoutparams.leftMargin) - layoutparams.rightMargin;
	//  166  344:iload           6
	//  167  346:iload           5
	//  168  348:isub            
	//  169  349:iload           8
	//  170  351:isub            
	//  171  352:iload           11
	//  172  354:isub            
	//  173  355:iconst_2        
	//  174  356:idiv            
	//  175  357:iload           5
	//  176  359:iadd            
	//  177  360:aload           14
	//  178  362:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  179  365:iadd            
	//  180  366:aload           14
	//  181  368:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  182  371:isub            
	//  183  372:istore_3        
		  goto _L14
	//* 184  373:goto            265
		k = j1 - k1 - k2 - layoutparams.rightMargin;
	//  185  376:iload           6
	//  186  378:iload           7
	//  187  380:isub            
	//  188  381:iload           11
	//  189  383:isub            
	//  190  384:aload           14
	//  191  386:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  192  389:isub            
	//  193  390:istore_3        
		  goto _L14
	//* 194  391:goto            265
_L5:
		return;
	//  195  394:return          
		if(true) goto _L16; else goto _L15
_L15:
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
		float f;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		int l2;
		boolean flag;
		boolean flag1;
		int l6;
		int i7;
		int j7;
		int k7;
		boolean flag2;
		boolean flag3;
		int ai[];
		int ai1[];
label0:
		{
			mTotalLength = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #328 <Field int mTotalLength>
			int j2 = 0;
	//    3    5:iconst_0        
	//    4    6:istore          13
			i1 = 0;
	//    5    8:iconst_0        
	//    6    9:istore          8
			k = 0;
	//    7   11:iconst_0        
	//    8   12:istore          6
			k1 = 0;
	//    9   14:iconst_0        
	//   10   15:istore          10
			l = 1;
	//   11   17:iconst_1        
	//   12   18:istore          7
			f = 0.0F;
	//   13   20:fconst_0        
	//   14   21:fstore_3        
			l6 = getVirtualChildCount();
	//   15   22:aload_0         
	//   16   23:invokevirtual   #206 <Method int getVirtualChildCount()>
	//   17   26:istore          21
			j7 = android.view.View.MeasureSpec.getMode(i);
	//   18   28:iload_1         
	//   19   29:invokestatic    #389 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   20   32:istore          23
			i7 = android.view.View.MeasureSpec.getMode(j);
	//   21   34:iload_2         
	//   22   35:invokestatic    #389 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   23   38:istore          22
			j1 = 0;
	//   24   40:iconst_0        
	//   25   41:istore          9
			flag = false;
	//   26   43:iconst_0        
	//   27   44:istore          14
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
			ai = mMaxAscent;
	//   42   74:aload_0         
	//   43   75:getfield        #354 <Field int[] mMaxAscent>
	//   44   78:astore          28
			ai1 = mMaxDescent;
	//   45   80:aload_0         
	//   46   81:getfield        #356 <Field int[] mMaxDescent>
	//   47   84:astore          29
			ai[3] = -1;
	//   48   86:aload           28
	//   49   88:iconst_3        
	//   50   89:iconst_m1       
	//   51   90:iastore         
			ai[2] = -1;
	//   52   91:aload           28
	//   53   93:iconst_2        
	//   54   94:iconst_m1       
	//   55   95:iastore         
			ai[1] = -1;
	//   56   96:aload           28
	//   57   98:iconst_1        
	//   58   99:iconst_m1       
	//   59  100:iastore         
			ai[0] = -1;
	//   60  101:aload           28
	//   61  103:iconst_0        
	//   62  104:iconst_m1       
	//   63  105:iastore         
			ai1[3] = -1;
	//   64  106:aload           29
	//   65  108:iconst_3        
	//   66  109:iconst_m1       
	//   67  110:iastore         
			ai1[2] = -1;
	//   68  111:aload           29
	//   69  113:iconst_2        
	//   70  114:iconst_m1       
	//   71  115:iastore         
			ai1[1] = -1;
	//   72  116:aload           29
	//   73  118:iconst_1        
	//   74  119:iconst_m1       
	//   75  120:iastore         
			ai1[0] = -1;
	//   76  121:aload           29
	//   77  123:iconst_0        
	//   78  124:iconst_m1       
	//   79  125:iastore         
			flag2 = mBaselineAligned;
	//   80  126:aload_0         
	//   81  127:getfield        #61  <Field boolean mBaselineAligned>
	//   82  130:istore          26
			flag3 = mUseLargestChild;
	//   83  132:aload_0         
	//   84  133:getfield        #125 <Field boolean mUseLargestChild>
	//   85  136:istore          27
			if(j7 == 0x40000000)
	//*  86  138:iload           23
	//*  87  140:ldc1            #160 <Int 0x40000000>
	//*  88  142:icmpne          208
				flag1 = true;
	//   89  145:iconst_1        
	//   90  146:istore          17
			else
	//*  91  148:ldc2            #390 <Int 0x80000000>
	//*  92  151:istore          12
	//*  93  153:iconst_0        
	//*  94  154:istore          11
	//*  95  156:iload           11
	//*  96  158:iload           21
	//*  97  160:icmpge          885
	//*  98  163:aload_0         
	//*  99  164:iload           11
	//* 100  166:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//* 101  169:astore          30
	//* 102  171:aload           30
	//* 103  173:ifnonnull       214
	//* 104  176:aload_0         
	//* 105  177:aload_0         
	//* 106  178:getfield        #328 <Field int mTotalLength>
	//* 107  181:aload_0         
	//* 108  182:iload           11
	//* 109  184:invokevirtual   #371 <Method int measureNullChild(int)>
	//* 110  187:iadd            
	//* 111  188:putfield        #328 <Field int mTotalLength>
	//* 112  191:iload           12
	//* 113  193:istore          16
	//* 114  195:iload           11
	//* 115  197:iconst_1        
	//* 116  198:iadd            
	//* 117  199:istore          11
	//* 118  201:iload           16
	//* 119  203:istore          12
	//* 120  205:goto            156
				flag1 = false;
	//  121  208:iconst_0        
	//  122  209:istore          17
			i2 = 0x80000000;
			l1 = 0;
			while(l1 < l6) 
			{
				View view1 = getVirtualChildAt(l1);
				int k4;
				if(view1 == null)
				{
					mTotalLength = mTotalLength + measureNullChild(l1);
					k4 = i2;
				} else
	//* 123  211:goto            148
				if(view1.getVisibility() == 8)
	//* 124  214:aload           30
	//* 125  216:invokevirtual   #174 <Method int View.getVisibility()>
	//* 126  219:bipush          8
	//* 127  221:icmpne          244
				{
					l1 += getChildrenSkipCount(view1, l1);
	//  128  224:iload           11
	//  129  226:aload_0         
	//  130  227:aload           30
	//  131  229:iload           11
	//  132  231:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//  133  234:iadd            
	//  134  235:istore          11
					k4 = i2;
	//  135  237:iload           12
	//  136  239:istore          16
				} else
	//* 137  241:goto            195
				{
					if(hasDividerBeforeChildAt(l1))
	//* 138  244:aload_0         
	//* 139  245:iload           11
	//* 140  247:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 141  250:ifeq            266
						mTotalLength = mTotalLength + mDividerWidth;
	//  142  253:aload_0         
	//  143  254:aload_0         
	//  144  255:getfield        #328 <Field int mTotalLength>
	//  145  258:aload_0         
	//  146  259:getfield        #234 <Field int mDividerWidth>
	//  147  262:iadd            
	//  148  263:putfield        #328 <Field int mTotalLength>
					LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
	//  149  266:aload           30
	//  150  268:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  151  271:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  152  274:astore          31
					f += layoutparams.weight;
	//  153  276:fload_3         
	//  154  277:aload           31
	//  155  279:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  156  282:fadd            
	//  157  283:fstore_3        
					int j3;
					int j5;
					if(j7 == 0x40000000 && layoutparams.width == 0 && layoutparams.weight > 0.0F)
	//* 158  284:iload           23
	//* 159  286:ldc1            #160 <Int 0x40000000>
	//* 160  288:icmpne          638
	//* 161  291:aload           31
	//* 162  293:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 163  296:ifne            638
	//* 164  299:aload           31
	//* 165  301:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 166  304:fconst_0        
	//* 167  305:fcmpl           
	//* 168  306:ifle            638
					{
						int l5;
						int j6;
						if(flag1)
	//* 169  309:iload           17
	//* 170  311:ifeq            596
						{
							mTotalLength = mTotalLength + (layoutparams.leftMargin + layoutparams.rightMargin);
	//  171  314:aload_0         
	//  172  315:aload_0         
	//  173  316:getfield        #328 <Field int mTotalLength>
	//  174  319:aload           31
	//  175  321:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  176  324:aload           31
	//  177  326:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  178  329:iadd            
	//  179  330:iadd            
	//  180  331:putfield        #328 <Field int mTotalLength>
						} else
	//* 181  334:iload           26
	//* 182  336:ifeq            628
	//* 183  339:iconst_0        
	//* 184  340:iconst_0        
	//* 185  341:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 186  344:istore          15
	//* 187  346:aload           30
	//* 188  348:iload           15
	//* 189  350:iload           15
	//* 190  352:invokevirtual   #396 <Method void View.measure(int, int)>
	//* 191  355:iload           14
	//* 192  357:istore          15
	//* 193  359:iload           12
	//* 194  361:istore          16
	//* 195  363:iconst_0        
	//* 196  364:istore          18
	//* 197  366:iload           9
	//* 198  368:istore          12
	//* 199  370:iload           18
	//* 200  372:istore          14
	//* 201  374:iload           22
	//* 202  376:ldc1            #160 <Int 0x40000000>
	//* 203  378:icmpeq          404
	//* 204  381:iload           9
	//* 205  383:istore          12
	//* 206  385:iload           18
	//* 207  387:istore          14
	//* 208  389:aload           31
	//* 209  391:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 210  394:iconst_m1       
	//* 211  395:icmpne          404
	//* 212  398:iconst_1        
	//* 213  399:istore          12
	//* 214  401:iconst_1        
	//* 215  402:istore          14
	//* 216  404:aload           31
	//* 217  406:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//* 218  409:aload           31
	//* 219  411:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//* 220  414:iadd            
	//* 221  415:istore          9
	//* 222  417:aload           30
	//* 223  419:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//* 224  422:iload           9
	//* 225  424:iadd            
	//* 226  425:istore          18
	//* 227  427:iload           8
	//* 228  429:aload           30
	//* 229  431:invokevirtual   #399 <Method int View.getMeasuredState()>
	//* 230  434:invokestatic    #402 <Method int View.combineMeasuredStates(int, int)>
	//* 231  437:istore          19
	//* 232  439:iload           26
	//* 233  441:ifeq            518
	//* 234  444:aload           30
	//* 235  446:invokevirtual   #322 <Method int View.getBaseline()>
	//* 236  449:istore          20
	//* 237  451:iload           20
	//* 238  453:iconst_m1       
	//* 239  454:icmpeq          518
	//* 240  457:aload           31
	//* 241  459:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//* 242  462:ifge            838
	//* 243  465:aload_0         
	//* 244  466:getfield        #68  <Field int mGravity>
	//* 245  469:istore          8
	//* 246  471:iload           8
	//* 247  473:bipush          112
	//* 248  475:iand            
	//* 249  476:iconst_4        
	//* 250  477:ishr            
	//* 251  478:bipush          -2
	//* 252  480:iand            
	//* 253  481:iconst_1        
	//* 254  482:ishr            
	//* 255  483:istore          8
	//* 256  485:aload           28
	//* 257  487:iload           8
	//* 258  489:aload           28
	//* 259  491:iload           8
	//* 260  493:iaload          
	//* 261  494:iload           20
	//* 262  496:invokestatic    #407 <Method int Math.max(int, int)>
	//* 263  499:iastore         
	//* 264  500:aload           29
	//* 265  502:iload           8
	//* 266  504:aload           29
	//* 267  506:iload           8
	//* 268  508:iaload          
	//* 269  509:iload           18
	//* 270  511:iload           20
	//* 271  513:isub            
	//* 272  514:invokestatic    #407 <Method int Math.max(int, int)>
	//* 273  517:iastore         
	//* 274  518:iload           13
	//* 275  520:iload           18
	//* 276  522:invokestatic    #407 <Method int Math.max(int, int)>
	//* 277  525:istore          13
	//* 278  527:iload           7
	//* 279  529:ifeq            848
	//* 280  532:aload           31
	//* 281  534:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 282  537:iconst_m1       
	//* 283  538:icmpne          848
	//* 284  541:iconst_1        
	//* 285  542:istore          7
	//* 286  544:aload           31
	//* 287  546:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 288  549:fconst_0        
	//* 289  550:fcmpl           
	//* 290  551:ifle            861
	//* 291  554:iload           14
	//* 292  556:ifeq            854
	//* 293  559:iload           10
	//* 294  561:iload           9
	//* 295  563:invokestatic    #407 <Method int Math.max(int, int)>
	//* 296  566:istore          10
	//* 297  568:iload           11
	//* 298  570:aload_0         
	//* 299  571:aload           30
	//* 300  573:iload           11
	//* 301  575:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//* 302  578:iadd            
	//* 303  579:istore          11
	//* 304  581:iload           19
	//* 305  583:istore          8
	//* 306  585:iload           12
	//* 307  587:istore          9
	//* 308  589:iload           15
	//* 309  591:istore          14
	//* 310  593:goto            195
						{
							j3 = mTotalLength;
	//  311  596:aload_0         
	//  312  597:getfield        #328 <Field int mTotalLength>
	//  313  600:istore          15
							mTotalLength = Math.max(j3, layoutparams.leftMargin + j3 + layoutparams.rightMargin);
	//  314  602:aload_0         
	//  315  603:iload           15
	//  316  605:aload           31
	//  317  607:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  318  610:iload           15
	//  319  612:iadd            
	//  320  613:aload           31
	//  321  615:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  322  618:iadd            
	//  323  619:invokestatic    #407 <Method int Math.max(int, int)>
	//  324  622:putfield        #328 <Field int mTotalLength>
						}
						if(flag2)
						{
							j3 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
							view1.measure(j3, j3);
							j3 = ((int) (flag));
							k4 = i2;
						} else
	//* 325  625:goto            334
						{
							j3 = 1;
	//  326  628:iconst_1        
	//  327  629:istore          15
							k4 = i2;
	//  328  631:iload           12
	//  329  633:istore          16
						}
					} else
	//* 330  635:goto            363
					{
						k4 = 0x80000000;
	//  331  638:ldc2            #390 <Int 0x80000000>
	//  332  641:istore          16
						j3 = k4;
	//  333  643:iload           16
	//  334  645:istore          15
						if(layoutparams.width == 0)
	//* 335  647:aload           31
	//* 336  649:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 337  652:ifne            679
						{
							j3 = k4;
	//  338  655:iload           16
	//  339  657:istore          15
							if(layoutparams.weight > 0.0F)
	//* 340  659:aload           31
	//* 341  661:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 342  664:fconst_0        
	//* 343  665:fcmpl           
	//* 344  666:ifle            679
							{
								j3 = 0;
	//  345  669:iconst_0        
	//  346  670:istore          15
								layoutparams.width = -2;
	//  347  672:aload           31
	//  348  674:bipush          -2
	//  349  676:putfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
							}
						}
						if(f == 0.0F)
	//* 350  679:fload_3         
	//* 351  680:fconst_0        
	//* 352  681:fcmpl           
	//* 353  682:ifne            790
							k4 = mTotalLength;
	//  354  685:aload_0         
	//  355  686:getfield        #328 <Field int mTotalLength>
	//  356  689:istore          16
						else
	//* 357  691:aload_0         
	//* 358  692:aload           30
	//* 359  694:iload           11
	//* 360  696:iload_1         
	//* 361  697:iload           16
	//* 362  699:iload_2         
	//* 363  700:iconst_0        
	//* 364  701:invokevirtual   #409 <Method void measureChildBeforeLayout(View, int, int, int, int, int)>
	//* 365  704:iload           15
	//* 366  706:ldc2            #390 <Int 0x80000000>
	//* 367  709:icmpeq          719
	//* 368  712:aload           31
	//* 369  714:iload           15
	//* 370  716:putfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 371  719:aload           30
	//* 372  721:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//* 373  724:istore          18
	//* 374  726:iload           17
	//* 375  728:ifeq            796
	//* 376  731:aload_0         
	//* 377  732:aload_0         
	//* 378  733:getfield        #328 <Field int mTotalLength>
	//* 379  736:aload           31
	//* 380  738:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//* 381  741:iload           18
	//* 382  743:iadd            
	//* 383  744:aload           31
	//* 384  746:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//* 385  749:iadd            
	//* 386  750:aload_0         
	//* 387  751:aload           30
	//* 388  753:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//* 389  756:iadd            
	//* 390  757:iadd            
	//* 391  758:putfield        #328 <Field int mTotalLength>
	//* 392  761:iload           12
	//* 393  763:istore          16
	//* 394  765:iload           14
	//* 395  767:istore          15
	//* 396  769:iload           27
	//* 397  771:ifeq            363
	//* 398  774:iload           18
	//* 399  776:iload           12
	//* 400  778:invokestatic    #407 <Method int Math.max(int, int)>
	//* 401  781:istore          16
	//* 402  783:iload           14
	//* 403  785:istore          15
	//* 404  787:goto            363
							k4 = 0;
	//  405  790:iconst_0        
	//  406  791:istore          16
						measureChildBeforeLayout(view1, l1, i, k4, j, 0);
						if(j3 != 0x80000000)
							layoutparams.width = j3;
						j5 = view1.getMeasuredWidth();
						if(flag1)
						{
							mTotalLength = mTotalLength + (layoutparams.leftMargin + j5 + layoutparams.rightMargin + getNextLocationOffset(view1));
						} else
	//* 407  793:goto            691
						{
							int k3 = mTotalLength;
	//  408  796:aload_0         
	//  409  797:getfield        #328 <Field int mTotalLength>
	//  410  800:istore          15
							mTotalLength = Math.max(k3, k3 + j5 + layoutparams.leftMargin + layoutparams.rightMargin + getNextLocationOffset(view1));
	//  411  802:aload_0         
	//  412  803:iload           15
	//  413  805:iload           15
	//  414  807:iload           18
	//  415  809:iadd            
	//  416  810:aload           31
	//  417  812:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  418  815:iadd            
	//  419  816:aload           31
	//  420  818:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  421  821:iadd            
	//  422  822:aload_0         
	//  423  823:aload           30
	//  424  825:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  425  828:iadd            
	//  426  829:invokestatic    #407 <Method int Math.max(int, int)>
	//  427  832:putfield        #328 <Field int mTotalLength>
						}
						k4 = i2;
						j3 = ((int) (flag));
						if(flag3)
						{
							k4 = Math.max(j5, i2);
							j3 = ((int) (flag));
						}
					}
					j5 = 0;
					i2 = j1;
					flag = ((boolean) (j5));
					if(i7 != 0x40000000)
					{
						i2 = j1;
						flag = ((boolean) (j5));
						if(layoutparams.height == -1)
						{
							i2 = 1;
							flag = true;
						}
					}
					j1 = layoutparams.topMargin + layoutparams.bottomMargin;
					j5 = view1.getMeasuredHeight() + j1;
					l5 = View.combineMeasuredStates(i1, view1.getMeasuredState());
					if(flag2)
					{
						j6 = view1.getBaseline();
						if(j6 != -1)
						{
							if(layoutparams.gravity < 0)
								i1 = mGravity;
							else
	//* 428  835:goto            761
								i1 = layoutparams.gravity;
	//  429  838:aload           31
	//  430  840:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//  431  843:istore          8
							i1 = ((i1 & 0x70) >> 4 & -2) >> 1;
							ai[i1] = Math.max(ai[i1], j6);
							ai1[i1] = Math.max(ai1[i1], j5 - j6);
						}
					}
					j2 = Math.max(j2, j5);
					if(l != 0 && layoutparams.height == -1)
						l = 1;
					else
	//* 432  845:goto            471
						l = 0;
	//  433  848:iconst_0        
	//  434  849:istore          7
					if(layoutparams.weight > 0.0F)
					{
						if(!flag)
	//* 435  851:goto            544
							j1 = j5;
	//  436  854:iload           18
	//  437  856:istore          9
						k1 = Math.max(k1, j1);
					} else
	//* 438  858:goto            559
					{
						if(!flag)
	//* 439  861:iload           14
	//* 440  863:ifeq            878
	//* 441  866:iload           6
	//* 442  868:iload           9
	//* 443  870:invokestatic    #407 <Method int Math.max(int, int)>
	//* 444  873:istore          6
	//* 445  875:goto            568
							j1 = j5;
	//  446  878:iload           18
	//  447  880:istore          9
						k = Math.max(k, j1);
					}
					l1 += getChildrenSkipCount(view1, l1);
					i1 = l5;
					j1 = i2;
					flag = ((boolean) (j3));
				}
				l1++;
				i2 = k4;
			}
	//* 448  882:goto            866
			if(mTotalLength > 0 && hasDividerBeforeChildAt(l6))
	//* 449  885:aload_0         
	//* 450  886:getfield        #328 <Field int mTotalLength>
	//* 451  889:ifle            914
	//* 452  892:aload_0         
	//* 453  893:iload           21
	//* 454  895:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 455  898:ifeq            914
				mTotalLength = mTotalLength + mDividerWidth;
	//  456  901:aload_0         
	//  457  902:aload_0         
	//  458  903:getfield        #328 <Field int mTotalLength>
	//  459  906:aload_0         
	//  460  907:getfield        #234 <Field int mDividerWidth>
	//  461  910:iadd            
	//  462  911:putfield        #328 <Field int mTotalLength>
			if(ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
	//* 463  914:aload           28
	//* 464  916:iconst_1        
	//* 465  917:iaload          
	//* 466  918:iconst_m1       
	//* 467  919:icmpne          950
	//* 468  922:aload           28
	//* 469  924:iconst_0        
	//* 470  925:iaload          
	//* 471  926:iconst_m1       
	//* 472  927:icmpne          950
	//* 473  930:aload           28
	//* 474  932:iconst_2        
	//* 475  933:iaload          
	//* 476  934:iconst_m1       
	//* 477  935:icmpne          950
			{
				l1 = j2;
	//  478  938:iload           13
	//  479  940:istore          11
				if(ai[3] == -1)
					break label0;
	//  480  942:aload           28
	//  481  944:iconst_3        
	//  482  945:iaload          
	//  483  946:iconst_m1       
	//  484  947:icmpeq          1008
			}
			l1 = Math.max(j2, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
	//  485  950:iload           13
	//  486  952:aload           28
	//  487  954:iconst_3        
	//  488  955:iaload          
	//  489  956:aload           28
	//  490  958:iconst_0        
	//  491  959:iaload          
	//  492  960:aload           28
	//  493  962:iconst_1        
	//  494  963:iaload          
	//  495  964:aload           28
	//  496  966:iconst_2        
	//  497  967:iaload          
	//  498  968:invokestatic    #407 <Method int Math.max(int, int)>
	//  499  971:invokestatic    #407 <Method int Math.max(int, int)>
	//  500  974:invokestatic    #407 <Method int Math.max(int, int)>
	//  501  977:aload           29
	//  502  979:iconst_3        
	//  503  980:iaload          
	//  504  981:aload           29
	//  505  983:iconst_0        
	//  506  984:iaload          
	//  507  985:aload           29
	//  508  987:iconst_1        
	//  509  988:iaload          
	//  510  989:aload           29
	//  511  991:iconst_2        
	//  512  992:iaload          
	//  513  993:invokestatic    #407 <Method int Math.max(int, int)>
	//  514  996:invokestatic    #407 <Method int Math.max(int, int)>
	//  515  999:invokestatic    #407 <Method int Math.max(int, int)>
	//  516 1002:iadd            
	//  517 1003:invokestatic    #407 <Method int Math.max(int, int)>
	//  518 1006:istore          11
		}
		if(flag3 && (j7 == 0x80000000 || j7 == 0))
	//* 519 1008:iload           27
	//* 520 1010:ifeq            1194
	//* 521 1013:iload           23
	//* 522 1015:ldc2            #390 <Int 0x80000000>
	//* 523 1018:icmpeq          1026
	//* 524 1021:iload           23
	//* 525 1023:ifne            1194
		{
			mTotalLength = 0;
	//  526 1026:aload_0         
	//  527 1027:iconst_0        
	//  528 1028:putfield        #328 <Field int mTotalLength>
			int k2 = 0;
	//  529 1031:iconst_0        
	//  530 1032:istore          13
			while(k2 < l6) 
	//* 531 1034:iload           13
	//* 532 1036:iload           21
	//* 533 1038:icmpge          1194
			{
				View view2 = getVirtualChildAt(k2);
	//  534 1041:aload_0         
	//  535 1042:iload           13
	//  536 1044:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  537 1047:astore          30
				if(view2 == null)
	//* 538 1049:aload           30
	//* 539 1051:ifnonnull       1078
					mTotalLength = mTotalLength + measureNullChild(k2);
	//  540 1054:aload_0         
	//  541 1055:aload_0         
	//  542 1056:getfield        #328 <Field int mTotalLength>
	//  543 1059:aload_0         
	//  544 1060:iload           13
	//  545 1062:invokevirtual   #371 <Method int measureNullChild(int)>
	//  546 1065:iadd            
	//  547 1066:putfield        #328 <Field int mTotalLength>
				else
	//* 548 1069:iload           13
	//* 549 1071:iconst_1        
	//* 550 1072:iadd            
	//* 551 1073:istore          13
	//* 552 1075:goto            1034
				if(view2.getVisibility() == 8)
	//* 553 1078:aload           30
	//* 554 1080:invokevirtual   #174 <Method int View.getVisibility()>
	//* 555 1083:bipush          8
	//* 556 1085:icmpne          1104
				{
					k2 += getChildrenSkipCount(view2, k2);
	//  557 1088:iload           13
	//  558 1090:aload_0         
	//  559 1091:aload           30
	//  560 1093:iload           13
	//  561 1095:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//  562 1098:iadd            
	//  563 1099:istore          13
				} else
	//* 564 1101:goto            1069
				{
					LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
	//  565 1104:aload           30
	//  566 1106:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  567 1109:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  568 1112:astore          31
					if(flag1)
	//* 569 1114:iload           17
	//* 570 1116:ifeq            1152
					{
						mTotalLength = mTotalLength + (layoutparams1.leftMargin + i2 + layoutparams1.rightMargin + getNextLocationOffset(view2));
	//  571 1119:aload_0         
	//  572 1120:aload_0         
	//  573 1121:getfield        #328 <Field int mTotalLength>
	//  574 1124:aload           31
	//  575 1126:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  576 1129:iload           12
	//  577 1131:iadd            
	//  578 1132:aload           31
	//  579 1134:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  580 1137:iadd            
	//  581 1138:aload_0         
	//  582 1139:aload           30
	//  583 1141:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  584 1144:iadd            
	//  585 1145:iadd            
	//  586 1146:putfield        #328 <Field int mTotalLength>
					} else
	//* 587 1149:goto            1069
					{
						int l3 = mTotalLength;
	//  588 1152:aload_0         
	//  589 1153:getfield        #328 <Field int mTotalLength>
	//  590 1156:istore          15
						mTotalLength = Math.max(l3, l3 + i2 + layoutparams1.leftMargin + layoutparams1.rightMargin + getNextLocationOffset(view2));
	//  591 1158:aload_0         
	//  592 1159:iload           15
	//  593 1161:iload           15
	//  594 1163:iload           12
	//  595 1165:iadd            
	//  596 1166:aload           31
	//  597 1168:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  598 1171:iadd            
	//  599 1172:aload           31
	//  600 1174:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  601 1177:iadd            
	//  602 1178:aload_0         
	//  603 1179:aload           30
	//  604 1181:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  605 1184:iadd            
	//  606 1185:invokestatic    #407 <Method int Math.max(int, int)>
	//  607 1188:putfield        #328 <Field int mTotalLength>
					}
				}
				k2++;
			}
		}
	//* 608 1191:goto            1069
		mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
	//  609 1194:aload_0         
	//  610 1195:aload_0         
	//  611 1196:getfield        #328 <Field int mTotalLength>
	//  612 1199:aload_0         
	//  613 1200:invokevirtual   #237 <Method int getPaddingLeft()>
	//  614 1203:aload_0         
	//  615 1204:invokevirtual   #243 <Method int getPaddingRight()>
	//  616 1207:iadd            
	//  617 1208:iadd            
	//  618 1209:putfield        #328 <Field int mTotalLength>
		k7 = View.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumWidth()), i, 0);
	//  619 1212:aload_0         
	//  620 1213:getfield        #328 <Field int mTotalLength>
	//  621 1216:aload_0         
	//  622 1217:invokevirtual   #412 <Method int getSuggestedMinimumWidth()>
	//  623 1220:invokestatic    #407 <Method int Math.max(int, int)>
	//  624 1223:iload_1         
	//  625 1224:iconst_0        
	//  626 1225:invokestatic    #416 <Method int View.resolveSizeAndState(int, int, int)>
	//  627 1228:istore          24
		l2 = (k7 & 0xffffff) - mTotalLength;
	//  628 1230:iload           24
	//  629 1232:ldc2            #417 <Int 0xffffff>
	//  630 1235:iand            
	//  631 1236:aload_0         
	//  632 1237:getfield        #328 <Field int mTotalLength>
	//  633 1240:isub            
	//  634 1241:istore          13
		if(!flag && (l2 == 0 || f <= 0.0F)) goto _L2; else goto _L1
	//  635 1243:iload           14
	//  636 1245:ifne            1259
	//  637 1248:iload           13
	//  638 1250:ifeq            2199
	//  639 1253:fload_3         
	//  640 1254:fconst_0        
	//  641 1255:fcmpl           
	//  642 1256:ifle            2199
_L1:
		int i3;
		int j4;
label1:
		{
			if(mWeightSum > 0.0F)
	//* 643 1259:aload_0         
	//* 644 1260:getfield        #117 <Field float mWeightSum>
	//* 645 1263:fconst_0        
	//* 646 1264:fcmpl           
	//* 647 1265:ifle            1436
				f = mWeightSum;
	//  648 1268:aload_0         
	//  649 1269:getfield        #117 <Field float mWeightSum>
	//  650 1272:fstore_3        
			ai[3] = -1;
	//  651 1273:aload           28
	//  652 1275:iconst_3        
	//  653 1276:iconst_m1       
	//  654 1277:iastore         
			ai[2] = -1;
	//  655 1278:aload           28
	//  656 1280:iconst_2        
	//  657 1281:iconst_m1       
	//  658 1282:iastore         
			ai[1] = -1;
	//  659 1283:aload           28
	//  660 1285:iconst_1        
	//  661 1286:iconst_m1       
	//  662 1287:iastore         
			ai[0] = -1;
	//  663 1288:aload           28
	//  664 1290:iconst_0        
	//  665 1291:iconst_m1       
	//  666 1292:iastore         
			ai1[3] = -1;
	//  667 1293:aload           29
	//  668 1295:iconst_3        
	//  669 1296:iconst_m1       
	//  670 1297:iastore         
			ai1[2] = -1;
	//  671 1298:aload           29
	//  672 1300:iconst_2        
	//  673 1301:iconst_m1       
	//  674 1302:iastore         
			ai1[1] = -1;
	//  675 1303:aload           29
	//  676 1305:iconst_1        
	//  677 1306:iconst_m1       
	//  678 1307:iastore         
			ai1[0] = -1;
	//  679 1308:aload           29
	//  680 1310:iconst_0        
	//  681 1311:iconst_m1       
	//  682 1312:iastore         
			l1 = -1;
	//  683 1313:iconst_m1       
	//  684 1314:istore          11
			mTotalLength = 0;
	//  685 1316:aload_0         
	//  686 1317:iconst_0        
	//  687 1318:putfield        #328 <Field int mTotalLength>
			i3 = 0;
	//  688 1321:iconst_0        
	//  689 1322:istore          14
			k1 = k;
	//  690 1324:iload           6
	//  691 1326:istore          10
			while(i3 < l6) 
	//* 692 1328:iload           14
	//* 693 1330:iload           21
	//* 694 1332:icmpge          1985
			{
				View view3 = getVirtualChildAt(i3);
	//  695 1335:aload_0         
	//  696 1336:iload           14
	//  697 1338:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  698 1341:astore          30
				int i4 = l;
	//  699 1343:iload           7
	//  700 1345:istore          15
				int l4 = k1;
	//  701 1347:iload           10
	//  702 1349:istore          16
				int k5 = i1;
	//  703 1351:iload           8
	//  704 1353:istore          18
				int i6 = l2;
	//  705 1355:iload           13
	//  706 1357:istore          19
				int k6 = l1;
	//  707 1359:iload           11
	//  708 1361:istore          20
				float f2 = f;
	//  709 1363:fload_3         
	//  710 1364:fstore          5
				if(view3 != null)
	//* 711 1366:aload           30
	//* 712 1368:ifnull          1404
					if(view3.getVisibility() == 8)
	//* 713 1371:aload           30
	//* 714 1373:invokevirtual   #174 <Method int View.getVisibility()>
	//* 715 1376:bipush          8
	//* 716 1378:icmpne          1439
					{
						f2 = f;
	//  717 1381:fload_3         
	//  718 1382:fstore          5
						k6 = l1;
	//  719 1384:iload           11
	//  720 1386:istore          20
						i6 = l2;
	//  721 1388:iload           13
	//  722 1390:istore          19
						k5 = i1;
	//  723 1392:iload           8
	//  724 1394:istore          18
						l4 = k1;
	//  725 1396:iload           10
	//  726 1398:istore          16
						i4 = l;
	//  727 1400:iload           7
	//  728 1402:istore          15
					} else
	//* 729 1404:iload           14
	//* 730 1406:iconst_1        
	//* 731 1407:iadd            
	//* 732 1408:istore          14
	//* 733 1410:iload           15
	//* 734 1412:istore          7
	//* 735 1414:iload           16
	//* 736 1416:istore          10
	//* 737 1418:iload           18
	//* 738 1420:istore          8
	//* 739 1422:iload           19
	//* 740 1424:istore          13
	//* 741 1426:iload           20
	//* 742 1428:istore          11
	//* 743 1430:fload           5
	//* 744 1432:fstore_3        
	//* 745 1433:goto            1328
	//* 746 1436:goto            1273
					{
						LayoutParams layoutparams2 = (LayoutParams)view3.getLayoutParams();
	//  747 1439:aload           30
	//  748 1441:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  749 1444:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  750 1447:astore          31
						f2 = layoutparams2.weight;
	//  751 1449:aload           31
	//  752 1451:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  753 1454:fstore          5
						i2 = i1;
	//  754 1456:iload           8
	//  755 1458:istore          12
						k = l2;
	//  756 1460:iload           13
	//  757 1462:istore          6
						float f1 = f;
	//  758 1464:fload_3         
	//  759 1465:fstore          4
						if(f2 > 0.0F)
	//* 760 1467:fload           5
	//* 761 1469:fconst_0        
	//* 762 1470:fcmpl           
	//* 763 1471:ifle            1605
						{
							k = (int)(((float)l2 * f2) / f);
	//  764 1474:iload           13
	//  765 1476:i2f             
	//  766 1477:fload           5
	//  767 1479:fmul            
	//  768 1480:fload_3         
	//  769 1481:fdiv            
	//  770 1482:f2i             
	//  771 1483:istore          6
							f1 = f - f2;
	//  772 1485:fload_3         
	//  773 1486:fload           5
	//  774 1488:fsub            
	//  775 1489:fstore          4
							i2 = l2 - k;
	//  776 1491:iload           13
	//  777 1493:iload           6
	//  778 1495:isub            
	//  779 1496:istore          12
							i4 = getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom() + layoutparams2.topMargin + layoutparams2.bottomMargin, layoutparams2.height);
	//  780 1498:iload_2         
	//  781 1499:aload_0         
	//  782 1500:invokevirtual   #280 <Method int getPaddingTop()>
	//  783 1503:aload_0         
	//  784 1504:invokevirtual   #261 <Method int getPaddingBottom()>
	//  785 1507:iadd            
	//  786 1508:aload           31
	//  787 1510:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  788 1513:iadd            
	//  789 1514:aload           31
	//  790 1516:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  791 1519:iadd            
	//  792 1520:aload           31
	//  793 1522:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//  794 1525:invokestatic    #420 <Method int getChildMeasureSpec(int, int, int)>
	//  795 1528:istore          15
							int l7;
							if(layoutparams2.width != 0 || j7 != 0x40000000)
	//* 796 1530:aload           31
	//* 797 1532:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 798 1535:ifne            1545
	//* 799 1538:iload           23
	//* 800 1540:ldc1            #160 <Int 0x40000000>
	//* 801 1542:icmpeq          1883
							{
								l2 = view3.getMeasuredWidth() + k;
	//  802 1545:aload           30
	//  803 1547:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  804 1550:iload           6
	//  805 1552:iadd            
	//  806 1553:istore          13
								k = l2;
	//  807 1555:iload           13
	//  808 1557:istore          6
								if(l2 < 0)
	//* 809 1559:iload           13
	//* 810 1561:ifge            1567
									k = 0;
	//  811 1564:iconst_0        
	//  812 1565:istore          6
								view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000), i4);
	//  813 1567:aload           30
	//  814 1569:iload           6
	//  815 1571:ldc1            #160 <Int 0x40000000>
	//  816 1573:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  817 1576:iload           15
	//  818 1578:invokevirtual   #396 <Method void View.measure(int, int)>
							} else
	//* 819 1581:iload           8
	//* 820 1583:aload           30
	//* 821 1585:invokevirtual   #399 <Method int View.getMeasuredState()>
	//* 822 1588:ldc2            #421 <Int 0xff000000>
	//* 823 1591:iand            
	//* 824 1592:invokestatic    #402 <Method int View.combineMeasuredStates(int, int)>
	//* 825 1595:istore          8
	//* 826 1597:iload           12
	//* 827 1599:istore          6
	//* 828 1601:iload           8
	//* 829 1603:istore          12
	//* 830 1605:iload           17
	//* 831 1607:ifeq            1911
	//* 832 1610:aload_0         
	//* 833 1611:aload_0         
	//* 834 1612:getfield        #328 <Field int mTotalLength>
	//* 835 1615:aload           30
	//* 836 1617:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//* 837 1620:aload           31
	//* 838 1622:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//* 839 1625:iadd            
	//* 840 1626:aload           31
	//* 841 1628:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//* 842 1631:iadd            
	//* 843 1632:aload_0         
	//* 844 1633:aload           30
	//* 845 1635:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//* 846 1638:iadd            
	//* 847 1639:iadd            
	//* 848 1640:putfield        #328 <Field int mTotalLength>
	//* 849 1643:iload           22
	//* 850 1645:ldc1            #160 <Int 0x40000000>
	//* 851 1647:icmpeq          1956
	//* 852 1650:aload           31
	//* 853 1652:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 854 1655:iconst_m1       
	//* 855 1656:icmpne          1956
	//* 856 1659:iconst_1        
	//* 857 1660:istore          8
	//* 858 1662:aload           31
	//* 859 1664:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//* 860 1667:aload           31
	//* 861 1669:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//* 862 1672:iadd            
	//* 863 1673:istore          15
	//* 864 1675:aload           30
	//* 865 1677:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//* 866 1680:iload           15
	//* 867 1682:iadd            
	//* 868 1683:istore          13
	//* 869 1685:iload           11
	//* 870 1687:iload           13
	//* 871 1689:invokestatic    #407 <Method int Math.max(int, int)>
	//* 872 1692:istore          11
	//* 873 1694:iload           8
	//* 874 1696:ifeq            1962
	//* 875 1699:iload           15
	//* 876 1701:istore          8
	//* 877 1703:iload           10
	//* 878 1705:iload           8
	//* 879 1707:invokestatic    #407 <Method int Math.max(int, int)>
	//* 880 1710:istore          10
	//* 881 1712:iload           7
	//* 882 1714:ifeq            1969
	//* 883 1717:aload           31
	//* 884 1719:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 885 1722:iconst_m1       
	//* 886 1723:icmpne          1969
	//* 887 1726:iconst_1        
	//* 888 1727:istore          7
	//* 889 1729:iload           7
	//* 890 1731:istore          15
	//* 891 1733:iload           10
	//* 892 1735:istore          16
	//* 893 1737:iload           12
	//* 894 1739:istore          18
	//* 895 1741:iload           6
	//* 896 1743:istore          19
	//* 897 1745:iload           11
	//* 898 1747:istore          20
	//* 899 1749:fload           4
	//* 900 1751:fstore          5
	//* 901 1753:iload           26
	//* 902 1755:ifeq            1404
	//* 903 1758:aload           30
	//* 904 1760:invokevirtual   #322 <Method int View.getBaseline()>
	//* 905 1763:istore          25
	//* 906 1765:iload           7
	//* 907 1767:istore          15
	//* 908 1769:iload           10
	//* 909 1771:istore          16
	//* 910 1773:iload           12
	//* 911 1775:istore          18
	//* 912 1777:iload           6
	//* 913 1779:istore          19
	//* 914 1781:iload           11
	//* 915 1783:istore          20
	//* 916 1785:fload           4
	//* 917 1787:fstore          5
	//* 918 1789:iload           25
	//* 919 1791:iconst_m1       
	//* 920 1792:icmpeq          1404
	//* 921 1795:aload           31
	//* 922 1797:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//* 923 1800:ifge            1975
	//* 924 1803:aload_0         
	//* 925 1804:getfield        #68  <Field int mGravity>
	//* 926 1807:istore          8
	//* 927 1809:iload           8
	//* 928 1811:bipush          112
	//* 929 1813:iand            
	//* 930 1814:iconst_4        
	//* 931 1815:ishr            
	//* 932 1816:bipush          -2
	//* 933 1818:iand            
	//* 934 1819:iconst_1        
	//* 935 1820:ishr            
	//* 936 1821:istore          8
	//* 937 1823:aload           28
	//* 938 1825:iload           8
	//* 939 1827:aload           28
	//* 940 1829:iload           8
	//* 941 1831:iaload          
	//* 942 1832:iload           25
	//* 943 1834:invokestatic    #407 <Method int Math.max(int, int)>
	//* 944 1837:iastore         
	//* 945 1838:aload           29
	//* 946 1840:iload           8
	//* 947 1842:aload           29
	//* 948 1844:iload           8
	//* 949 1846:iaload          
	//* 950 1847:iload           13
	//* 951 1849:iload           25
	//* 952 1851:isub            
	//* 953 1852:invokestatic    #407 <Method int Math.max(int, int)>
	//* 954 1855:iastore         
	//* 955 1856:iload           7
	//* 956 1858:istore          15
	//* 957 1860:iload           10
	//* 958 1862:istore          16
	//* 959 1864:iload           12
	//* 960 1866:istore          18
	//* 961 1868:iload           6
	//* 962 1870:istore          19
	//* 963 1872:iload           11
	//* 964 1874:istore          20
	//* 965 1876:fload           4
	//* 966 1878:fstore          5
	//* 967 1880:goto            1404
							{
								if(k <= 0)
	//* 968 1883:iload           6
	//* 969 1885:ifle            1905
	//* 970 1888:aload           30
	//* 971 1890:iload           6
	//* 972 1892:ldc1            #160 <Int 0x40000000>
	//* 973 1894:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 974 1897:iload           15
	//* 975 1899:invokevirtual   #396 <Method void View.measure(int, int)>
	//* 976 1902:goto            1581
									k = 0;
	//  977 1905:iconst_0        
	//  978 1906:istore          6
								view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000), i4);
							}
							i1 = View.combineMeasuredStates(i1, view3.getMeasuredState() & 0xff000000);
							k = i2;
							i2 = i1;
						}
						if(flag1)
						{
							mTotalLength = mTotalLength + (view3.getMeasuredWidth() + layoutparams2.leftMargin + layoutparams2.rightMargin + getNextLocationOffset(view3));
						} else
	//* 979 1908:goto            1888
						{
							i1 = mTotalLength;
	//  980 1911:aload_0         
	//  981 1912:getfield        #328 <Field int mTotalLength>
	//  982 1915:istore          8
							mTotalLength = Math.max(i1, view3.getMeasuredWidth() + i1 + layoutparams2.leftMargin + layoutparams2.rightMargin + getNextLocationOffset(view3));
	//  983 1917:aload_0         
	//  984 1918:iload           8
	//  985 1920:aload           30
	//  986 1922:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  987 1925:iload           8
	//  988 1927:iadd            
	//  989 1928:aload           31
	//  990 1930:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  991 1933:iadd            
	//  992 1934:aload           31
	//  993 1936:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  994 1939:iadd            
	//  995 1940:aload_0         
	//  996 1941:aload           30
	//  997 1943:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  998 1946:iadd            
	//  999 1947:invokestatic    #407 <Method int Math.max(int, int)>
	// 1000 1950:putfield        #328 <Field int mTotalLength>
						}
						if(i7 != 0x40000000 && layoutparams2.height == -1)
							i1 = 1;
						else
	//*1001 1953:goto            1643
							i1 = 0;
	// 1002 1956:iconst_0        
	// 1003 1957:istore          8
						i4 = layoutparams2.topMargin + layoutparams2.bottomMargin;
						l2 = view3.getMeasuredHeight() + i4;
						l1 = Math.max(l1, l2);
						if(i1 != 0)
							i1 = i4;
						else
	//*1004 1959:goto            1662
							i1 = l2;
	// 1005 1962:iload           13
	// 1006 1964:istore          8
						k1 = Math.max(k1, i1);
						if(l != 0 && layoutparams2.height == -1)
							l = 1;
						else
	//*1007 1966:goto            1703
							l = 0;
	// 1008 1969:iconst_0        
	// 1009 1970:istore          7
						i4 = l;
						l4 = k1;
						k5 = i2;
						i6 = k;
						k6 = l1;
						f2 = f1;
						if(flag2)
						{
							l7 = view3.getBaseline();
							i4 = l;
							l4 = k1;
							k5 = i2;
							i6 = k;
							k6 = l1;
							f2 = f1;
							if(l7 != -1)
							{
								if(layoutparams2.gravity < 0)
									i1 = mGravity;
								else
	//*1010 1972:goto            1729
									i1 = layoutparams2.gravity;
	// 1011 1975:aload           31
	// 1012 1977:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	// 1013 1980:istore          8
								i1 = ((i1 & 0x70) >> 4 & -2) >> 1;
								ai[i1] = Math.max(ai[i1], l7);
								ai1[i1] = Math.max(ai1[i1], l2 - l7);
								i4 = l;
								l4 = k1;
								k5 = i2;
								i6 = k;
								k6 = l1;
								f2 = f1;
							}
						}
					}
				i3++;
				l = i4;
				k1 = l4;
				i1 = k5;
				l2 = i6;
				l1 = k6;
				f = f2;
			}
	//*1014 1982:goto            1809
			mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
	// 1015 1985:aload_0         
	// 1016 1986:aload_0         
	// 1017 1987:getfield        #328 <Field int mTotalLength>
	// 1018 1990:aload_0         
	// 1019 1991:invokevirtual   #237 <Method int getPaddingLeft()>
	// 1020 1994:aload_0         
	// 1021 1995:invokevirtual   #243 <Method int getPaddingRight()>
	// 1022 1998:iadd            
	// 1023 1999:iadd            
	// 1024 2000:putfield        #328 <Field int mTotalLength>
			if(ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
	//*1025 2003:aload           28
	//*1026 2005:iconst_1        
	//*1027 2006:iaload          
	//*1028 2007:iconst_m1       
	//*1029 2008:icmpne          2051
	//*1030 2011:aload           28
	//*1031 2013:iconst_0        
	//*1032 2014:iaload          
	//*1033 2015:iconst_m1       
	//*1034 2016:icmpne          2051
	//*1035 2019:aload           28
	//*1036 2021:iconst_2        
	//*1037 2022:iaload          
	//*1038 2023:iconst_m1       
	//*1039 2024:icmpne          2051
			{
				j4 = l;
	// 1040 2027:iload           7
	// 1041 2029:istore          15
				l2 = k1;
	// 1042 2031:iload           10
	// 1043 2033:istore          13
				i3 = i1;
	// 1044 2035:iload           8
	// 1045 2037:istore          14
				k = l1;
	// 1046 2039:iload           11
	// 1047 2041:istore          6
				if(ai[3] == -1)
					break label1;
	// 1048 2043:aload           28
	// 1049 2045:iconst_3        
	// 1050 2046:iaload          
	// 1051 2047:iconst_m1       
	// 1052 2048:icmpeq          2121
			}
			k = Math.max(l1, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
	// 1053 2051:iload           11
	// 1054 2053:aload           28
	// 1055 2055:iconst_3        
	// 1056 2056:iaload          
	// 1057 2057:aload           28
	// 1058 2059:iconst_0        
	// 1059 2060:iaload          
	// 1060 2061:aload           28
	// 1061 2063:iconst_1        
	// 1062 2064:iaload          
	// 1063 2065:aload           28
	// 1064 2067:iconst_2        
	// 1065 2068:iaload          
	// 1066 2069:invokestatic    #407 <Method int Math.max(int, int)>
	// 1067 2072:invokestatic    #407 <Method int Math.max(int, int)>
	// 1068 2075:invokestatic    #407 <Method int Math.max(int, int)>
	// 1069 2078:aload           29
	// 1070 2080:iconst_3        
	// 1071 2081:iaload          
	// 1072 2082:aload           29
	// 1073 2084:iconst_0        
	// 1074 2085:iaload          
	// 1075 2086:aload           29
	// 1076 2088:iconst_1        
	// 1077 2089:iaload          
	// 1078 2090:aload           29
	// 1079 2092:iconst_2        
	// 1080 2093:iaload          
	// 1081 2094:invokestatic    #407 <Method int Math.max(int, int)>
	// 1082 2097:invokestatic    #407 <Method int Math.max(int, int)>
	// 1083 2100:invokestatic    #407 <Method int Math.max(int, int)>
	// 1084 2103:iadd            
	// 1085 2104:invokestatic    #407 <Method int Math.max(int, int)>
	// 1086 2107:istore          6
			i3 = i1;
	// 1087 2109:iload           8
	// 1088 2111:istore          14
			l2 = k1;
	// 1089 2113:iload           10
	// 1090 2115:istore          13
			j4 = l;
	// 1091 2117:iload           7
	// 1092 2119:istore          15
		}
_L4:
		l = k;
	// 1093 2121:iload           6
	// 1094 2123:istore          7
		if(j4 == 0)
	//*1095 2125:iload           15
	//*1096 2127:ifne            2145
		{
			l = k;
	// 1097 2130:iload           6
	// 1098 2132:istore          7
			if(i7 != 0x40000000)
	//*1099 2134:iload           22
	//*1100 2136:ldc1            #160 <Int 0x40000000>
	//*1101 2138:icmpeq          2145
				l = l2;
	// 1102 2141:iload           13
	// 1103 2143:istore          7
		}
		setMeasuredDimension(0xff000000 & i3 | k7, View.resolveSizeAndState(Math.max(l + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), j, i3 << 16));
	// 1104 2145:aload_0         
	// 1105 2146:ldc2            #421 <Int 0xff000000>
	// 1106 2149:iload           14
	// 1107 2151:iand            
	// 1108 2152:iload           24
	// 1109 2154:ior             
	// 1110 2155:iload           7
	// 1111 2157:aload_0         
	// 1112 2158:invokevirtual   #280 <Method int getPaddingTop()>
	// 1113 2161:aload_0         
	// 1114 2162:invokevirtual   #261 <Method int getPaddingBottom()>
	// 1115 2165:iadd            
	// 1116 2166:iadd            
	// 1117 2167:aload_0         
	// 1118 2168:invokevirtual   #424 <Method int getSuggestedMinimumHeight()>
	// 1119 2171:invokestatic    #407 <Method int Math.max(int, int)>
	// 1120 2174:iload_2         
	// 1121 2175:iload           14
	// 1122 2177:bipush          16
	// 1123 2179:ishl            
	// 1124 2180:invokestatic    #416 <Method int View.resolveSizeAndState(int, int, int)>
	// 1125 2183:invokevirtual   #427 <Method void setMeasuredDimension(int, int)>
		if(j1 != 0)
	//*1126 2186:iload           9
	//*1127 2188:ifeq            2198
			forceUniformHeight(l6, i);
	// 1128 2191:aload_0         
	// 1129 2192:iload           21
	// 1130 2194:iload_1         
	// 1131 2195:invokespecial   #429 <Method void forceUniformHeight(int, int)>
		return;
	// 1132 2198:return          
_L2:
		int i5;
		i5 = Math.max(k, k1);
	// 1133 2199:iload           6
	// 1134 2201:iload           10
	// 1135 2203:invokestatic    #407 <Method int Math.max(int, int)>
	// 1136 2206:istore          16
		j4 = l;
	// 1137 2208:iload           7
	// 1138 2210:istore          15
		l2 = i5;
	// 1139 2212:iload           16
	// 1140 2214:istore          13
		i3 = i1;
	// 1141 2216:iload           8
	// 1142 2218:istore          14
		k = l1;
	// 1143 2220:iload           11
	// 1144 2222:istore          6
		if(!flag3) goto _L4; else goto _L3
	// 1145 2224:iload           27
	// 1146 2226:ifeq            2121
_L3:
		j4 = l;
	// 1147 2229:iload           7
	// 1148 2231:istore          15
		l2 = i5;
	// 1149 2233:iload           16
	// 1150 2235:istore          13
		i3 = i1;
	// 1151 2237:iload           8
	// 1152 2239:istore          14
		k = l1;
	// 1153 2241:iload           11
	// 1154 2243:istore          6
		if(j7 == 0x40000000) goto _L4; else goto _L5
	// 1155 2245:iload           23
	// 1156 2247:ldc1            #160 <Int 0x40000000>
	// 1157 2249:icmpeq          2121
_L5:
		k1 = 0;
	// 1158 2252:iconst_0        
	// 1159 2253:istore          10
_L7:
		j4 = l;
	// 1160 2255:iload           7
	// 1161 2257:istore          15
		l2 = i5;
	// 1162 2259:iload           16
	// 1163 2261:istore          13
		i3 = i1;
	// 1164 2263:iload           8
	// 1165 2265:istore          14
		k = l1;
	// 1166 2267:iload           11
	// 1167 2269:istore          6
		if(k1 >= l6) goto _L4; else goto _L6
	// 1168 2271:iload           10
	// 1169 2273:iload           21
	// 1170 2275:icmpge          2121
_L6:
		View view = getVirtualChildAt(k1);
	// 1171 2278:aload_0         
	// 1172 2279:iload           10
	// 1173 2281:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	// 1174 2284:astore          28
		if(view != null && view.getVisibility() != 8 && ((LayoutParams)view.getLayoutParams()).weight > 0.0F)
	//*1175 2286:aload           28
	//*1176 2288:ifnull          2301
	//*1177 2291:aload           28
	//*1178 2293:invokevirtual   #174 <Method int View.getVisibility()>
	//*1179 2296:bipush          8
	//*1180 2298:icmpne          2310
	//*1181 2301:iload           10
	//*1182 2303:iconst_1        
	//*1183 2304:iadd            
	//*1184 2305:istore          10
	//*1185 2307:goto            2255
	//*1186 2310:aload           28
	//*1187 2312:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*1188 2315:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//*1189 2318:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//*1190 2321:fconst_0        
	//*1191 2322:fcmpl           
	//*1192 2323:ifle            2301
			view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000));
	// 1193 2326:aload           28
	// 1194 2328:iload           12
	// 1195 2330:ldc1            #160 <Int 0x40000000>
	// 1196 2332:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	// 1197 2335:aload           28
	// 1198 2337:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	// 1199 2340:ldc1            #160 <Int 0x40000000>
	// 1200 2342:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	// 1201 2345:invokevirtual   #396 <Method void View.measure(int, int)>
		k1++;
		  goto _L7
	//*1202 2348:goto            2301
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
		int i4;
		int j4;
		int k4;
		int l4;
		boolean flag;
		mTotalLength = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #328 <Field int mTotalLength>
		j1 = 0;
	//    3    5:iconst_0        
	//    4    6:istore          9
		i1 = 0;
	//    5    8:iconst_0        
	//    6    9:istore          8
		k = 0;
	//    7   11:iconst_0        
	//    8   12:istore          6
		l1 = 0;
	//    9   14:iconst_0        
	//   10   15:istore          11
		l = 1;
	//   11   17:iconst_1        
	//   12   18:istore          7
		f = 0.0F;
	//   13   20:fconst_0        
	//   14   21:fstore_3        
		i4 = getVirtualChildCount();
	//   15   22:aload_0         
	//   16   23:invokevirtual   #206 <Method int getVirtualChildCount()>
	//   17   26:istore          18
		j4 = android.view.View.MeasureSpec.getMode(i);
	//   18   28:iload_1         
	//   19   29:invokestatic    #389 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   20   32:istore          19
		k4 = android.view.View.MeasureSpec.getMode(j);
	//   21   34:iload_2         
	//   22   35:invokestatic    #389 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   23   38:istore          20
		k1 = 0;
	//   24   40:iconst_0        
	//   25   41:istore          10
		k2 = 0;
	//   26   43:iconst_0        
	//   27   44:istore          14
		l4 = mBaselineAlignedChildIndex;
	//   28   46:aload_0         
	//   29   47:getfield        #63  <Field int mBaselineAlignedChildIndex>
	//   30   50:istore          21
		flag = mUseLargestChild;
	//   31   52:aload_0         
	//   32   53:getfield        #125 <Field boolean mUseLargestChild>
	//   33   56:istore          22
		j2 = 0x80000000;
	//   34   58:ldc2            #390 <Int 0x80000000>
	//   35   61:istore          13
		i2 = 0;
	//   36   63:iconst_0        
	//   37   64:istore          12
_L2:
		int i3;
		View view;
		if(i2 >= i4)
			break MISSING_BLOCK_LABEL_648;
	//   38   66:iload           12
	//   39   68:iload           18
	//   40   70:icmpge          648
		view = getVirtualChildAt(i2);
	//   41   73:aload_0         
	//   42   74:iload           12
	//   43   76:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   44   79:astore          23
		if(view != null)
			break; /* Loop/switch isn't completed */
	//   45   81:aload           23
	//   46   83:ifnonnull       118
		mTotalLength = mTotalLength + measureNullChild(i2);
	//   47   86:aload_0         
	//   48   87:aload_0         
	//   49   88:getfield        #328 <Field int mTotalLength>
	//   50   91:aload_0         
	//   51   92:iload           12
	//   52   94:invokevirtual   #371 <Method int measureNullChild(int)>
	//   53   97:iadd            
	//   54   98:putfield        #328 <Field int mTotalLength>
		i3 = j2;
	//   55  101:iload           13
	//   56  103:istore          16
_L3:
		i2++;
	//   57  105:iload           12
	//   58  107:iconst_1        
	//   59  108:iadd            
	//   60  109:istore          12
		j2 = i3;
	//   61  111:iload           16
	//   62  113:istore          13
		if(true) goto _L2; else goto _L1
	//   63  115:goto            66
_L1:
label0:
		{
			if(view.getVisibility() != 8)
				break label0;
	//   64  118:aload           23
	//   65  120:invokevirtual   #174 <Method int View.getVisibility()>
	//   66  123:bipush          8
	//   67  125:icmpne          148
			i2 += getChildrenSkipCount(view, i2);
	//   68  128:iload           12
	//   69  130:aload_0         
	//   70  131:aload           23
	//   71  133:iload           12
	//   72  135:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//   73  138:iadd            
	//   74  139:istore          12
			i3 = j2;
	//   75  141:iload           13
	//   76  143:istore          16
		}
		  goto _L3
	//*  77  145:goto            105
		LayoutParams layoutparams;
		if(hasDividerBeforeChildAt(i2))
	//*  78  148:aload_0         
	//*  79  149:iload           12
	//*  80  151:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//*  81  154:ifeq            170
			mTotalLength = mTotalLength + mDividerHeight;
	//   82  157:aload_0         
	//   83  158:aload_0         
	//   84  159:getfield        #328 <Field int mTotalLength>
	//   85  162:aload_0         
	//   86  163:getfield        #252 <Field int mDividerHeight>
	//   87  166:iadd            
	//   88  167:putfield        #328 <Field int mTotalLength>
		layoutparams = (LayoutParams)view.getLayoutParams();
	//   89  170:aload           23
	//   90  172:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   91  175:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   92  178:astore          24
		f += layoutparams.weight;
	//   93  180:fload_3         
	//   94  181:aload           24
	//   95  183:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//   96  186:fadd            
	//   97  187:fstore_3        
		if(k4 != 0x40000000 || layoutparams.height != 0 || layoutparams.weight <= 0.0F) goto _L5; else goto _L4
	//   98  188:iload           20
	//   99  190:ldc1            #160 <Int 0x40000000>
	//  100  192:icmpne          299
	//  101  195:aload           24
	//  102  197:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//  103  200:ifne            299
	//  104  203:aload           24
	//  105  205:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  106  208:fconst_0        
	//  107  209:fcmpl           
	//  108  210:ifle            299
_L4:
		int l2;
		k2 = mTotalLength;
	//  109  213:aload_0         
	//  110  214:getfield        #328 <Field int mTotalLength>
	//  111  217:istore          14
		mTotalLength = Math.max(k2, layoutparams.topMargin + k2 + layoutparams.bottomMargin);
	//  112  219:aload_0         
	//  113  220:iload           14
	//  114  222:aload           24
	//  115  224:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  116  227:iload           14
	//  117  229:iadd            
	//  118  230:aload           24
	//  119  232:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  120  235:iadd            
	//  121  236:invokestatic    #407 <Method int Math.max(int, int)>
	//  122  239:putfield        #328 <Field int mTotalLength>
		l2 = 1;
	//  123  242:iconst_1        
	//  124  243:istore          15
		i3 = j2;
	//  125  245:iload           13
	//  126  247:istore          16
_L7:
		if(l4 >= 0 && l4 == i2 + 1)
	//* 127  249:iload           21
	//* 128  251:iflt            271
	//* 129  254:iload           21
	//* 130  256:iload           12
	//* 131  258:iconst_1        
	//* 132  259:iadd            
	//* 133  260:icmpne          271
			mBaselineChildTop = mTotalLength;
	//  134  263:aload_0         
	//  135  264:aload_0         
	//  136  265:getfield        #328 <Field int mTotalLength>
	//  137  268:putfield        #65  <Field int mBaselineChildTop>
		if(i2 < l4 && layoutparams.weight > 0.0F)
	//* 138  271:iload           12
	//* 139  273:iload           21
	//* 140  275:icmpge          461
	//* 141  278:aload           24
	//* 142  280:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 143  283:fconst_0        
	//* 144  284:fcmpl           
	//* 145  285:ifle            461
			throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
	//  146  288:new             #313 <Class RuntimeException>
	//  147  291:dup             
	//  148  292:ldc2            #432 <String "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.">
	//  149  295:invokespecial   #318 <Method void RuntimeException(String)>
	//  150  298:athrow          
		break; /* Loop/switch isn't completed */
_L5:
		i3 = 0x80000000;
	//  151  299:ldc2            #390 <Int 0x80000000>
	//  152  302:istore          16
		l2 = i3;
	//  153  304:iload           16
	//  154  306:istore          15
		if(layoutparams.height == 0)
	//* 155  308:aload           24
	//* 156  310:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 157  313:ifne            340
		{
			l2 = i3;
	//  158  316:iload           16
	//  159  318:istore          15
			if(layoutparams.weight > 0.0F)
	//* 160  320:aload           24
	//* 161  322:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 162  325:fconst_0        
	//* 163  326:fcmpl           
	//* 164  327:ifle            340
			{
				l2 = 0;
	//  165  330:iconst_0        
	//  166  331:istore          15
				layoutparams.height = -2;
	//  167  333:aload           24
	//  168  335:bipush          -2
	//  169  337:putfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
			}
		}
		int j3;
		if(f == 0.0F)
	//* 170  340:fload_3         
	//* 171  341:fconst_0        
	//* 172  342:fcmpl           
	//* 173  343:ifne            455
			i3 = mTotalLength;
	//  174  346:aload_0         
	//  175  347:getfield        #328 <Field int mTotalLength>
	//  176  350:istore          16
		else
	//* 177  352:aload_0         
	//* 178  353:aload           23
	//* 179  355:iload           12
	//* 180  357:iload_1         
	//* 181  358:iconst_0        
	//* 182  359:iload_2         
	//* 183  360:iload           16
	//* 184  362:invokevirtual   #409 <Method void measureChildBeforeLayout(View, int, int, int, int, int)>
	//* 185  365:iload           15
	//* 186  367:ldc2            #390 <Int 0x80000000>
	//* 187  370:icmpeq          380
	//* 188  373:aload           24
	//* 189  375:iload           15
	//* 190  377:putfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 191  380:aload           23
	//* 192  382:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//* 193  385:istore          17
	//* 194  387:aload_0         
	//* 195  388:getfield        #328 <Field int mTotalLength>
	//* 196  391:istore          15
	//* 197  393:aload_0         
	//* 198  394:iload           15
	//* 199  396:iload           15
	//* 200  398:iload           17
	//* 201  400:iadd            
	//* 202  401:aload           24
	//* 203  403:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//* 204  406:iadd            
	//* 205  407:aload           24
	//* 206  409:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//* 207  412:iadd            
	//* 208  413:aload_0         
	//* 209  414:aload           23
	//* 210  416:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//* 211  419:iadd            
	//* 212  420:invokestatic    #407 <Method int Math.max(int, int)>
	//* 213  423:putfield        #328 <Field int mTotalLength>
	//* 214  426:iload           13
	//* 215  428:istore          16
	//* 216  430:iload           14
	//* 217  432:istore          15
	//* 218  434:iload           22
	//* 219  436:ifeq            249
	//* 220  439:iload           17
	//* 221  441:iload           13
	//* 222  443:invokestatic    #407 <Method int Math.max(int, int)>
	//* 223  446:istore          16
	//* 224  448:iload           14
	//* 225  450:istore          15
	//* 226  452:goto            249
			i3 = 0;
	//  227  455:iconst_0        
	//  228  456:istore          16
		measureChildBeforeLayout(view, i2, i, 0, j, i3);
		if(l2 != 0x80000000)
			layoutparams.height = l2;
		j3 = view.getMeasuredHeight();
		l2 = mTotalLength;
		mTotalLength = Math.max(l2, l2 + j3 + layoutparams.topMargin + layoutparams.bottomMargin + getNextLocationOffset(view));
		i3 = j2;
		l2 = k2;
		if(flag)
		{
			i3 = Math.max(j3, j2);
			l2 = k2;
		}
		if(true) goto _L7; else goto _L6
	//* 229  458:goto            352
_L6:
		int k3 = 0;
	//  230  461:iconst_0        
	//  231  462:istore          17
		j2 = k1;
	//  232  464:iload           10
	//  233  466:istore          13
		k2 = k3;
	//  234  468:iload           17
	//  235  470:istore          14
		if(j4 != 0x40000000)
	//* 236  472:iload           19
	//* 237  474:ldc1            #160 <Int 0x40000000>
	//* 238  476:icmpeq          502
		{
			j2 = k1;
	//  239  479:iload           10
	//  240  481:istore          13
			k2 = k3;
	//  241  483:iload           17
	//  242  485:istore          14
			if(layoutparams.width == -1)
	//* 243  487:aload           24
	//* 244  489:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 245  492:iconst_m1       
	//* 246  493:icmpne          502
			{
				j2 = 1;
	//  247  496:iconst_1        
	//  248  497:istore          13
				k2 = 1;
	//  249  499:iconst_1        
	//  250  500:istore          14
			}
		}
		k1 = layoutparams.leftMargin + layoutparams.rightMargin;
	//  251  502:aload           24
	//  252  504:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  253  507:aload           24
	//  254  509:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  255  512:iadd            
	//  256  513:istore          10
		k3 = view.getMeasuredWidth() + k1;
	//  257  515:aload           23
	//  258  517:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  259  520:iload           10
	//  260  522:iadd            
	//  261  523:istore          17
		j1 = Math.max(j1, k3);
	//  262  525:iload           9
	//  263  527:iload           17
	//  264  529:invokestatic    #407 <Method int Math.max(int, int)>
	//  265  532:istore          9
		i1 = View.combineMeasuredStates(i1, view.getMeasuredState());
	//  266  534:iload           8
	//  267  536:aload           23
	//  268  538:invokevirtual   #399 <Method int View.getMeasuredState()>
	//  269  541:invokestatic    #402 <Method int View.combineMeasuredStates(int, int)>
	//  270  544:istore          8
		if(l != 0 && layoutparams.width == -1)
	//* 271  546:iload           7
	//* 272  548:ifeq            611
	//* 273  551:aload           24
	//* 274  553:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 275  556:iconst_m1       
	//* 276  557:icmpne          611
			l = 1;
	//  277  560:iconst_1        
	//  278  561:istore          7
		else
	//* 279  563:aload           24
	//* 280  565:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 281  568:fconst_0        
	//* 282  569:fcmpl           
	//* 283  570:ifle            624
	//* 284  573:iload           14
	//* 285  575:ifeq            617
	//* 286  578:iload           11
	//* 287  580:iload           10
	//* 288  582:invokestatic    #407 <Method int Math.max(int, int)>
	//* 289  585:istore          11
	//* 290  587:iload           12
	//* 291  589:aload_0         
	//* 292  590:aload           23
	//* 293  592:iload           12
	//* 294  594:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//* 295  597:iadd            
	//* 296  598:istore          12
	//* 297  600:iload           13
	//* 298  602:istore          10
	//* 299  604:iload           15
	//* 300  606:istore          14
	//* 301  608:goto            105
			l = 0;
	//  302  611:iconst_0        
	//  303  612:istore          7
		if(layoutparams.weight > 0.0F)
		{
			if(k2 == 0)
	//* 304  614:goto            563
				k1 = k3;
	//  305  617:iload           17
	//  306  619:istore          10
			l1 = Math.max(l1, k1);
		} else
	//* 307  621:goto            578
		{
			if(k2 == 0)
	//* 308  624:iload           14
	//* 309  626:ifeq            641
	//* 310  629:iload           6
	//* 311  631:iload           10
	//* 312  633:invokestatic    #407 <Method int Math.max(int, int)>
	//* 313  636:istore          6
	//* 314  638:goto            587
				k1 = k3;
	//  315  641:iload           17
	//  316  643:istore          10
			k = Math.max(k, k1);
		}
		i2 += getChildrenSkipCount(view, i2);
		k1 = j2;
		k2 = l2;
		  goto _L3
	//* 317  645:goto            629
		int l3;
		if(mTotalLength > 0 && hasDividerBeforeChildAt(i4))
	//* 318  648:aload_0         
	//* 319  649:getfield        #328 <Field int mTotalLength>
	//* 320  652:ifle            677
	//* 321  655:aload_0         
	//* 322  656:iload           18
	//* 323  658:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 324  661:ifeq            677
			mTotalLength = mTotalLength + mDividerHeight;
	//  325  664:aload_0         
	//  326  665:aload_0         
	//  327  666:getfield        #328 <Field int mTotalLength>
	//  328  669:aload_0         
	//  329  670:getfield        #252 <Field int mDividerHeight>
	//  330  673:iadd            
	//  331  674:putfield        #328 <Field int mTotalLength>
		if(flag && (k4 == 0x80000000 || k4 == 0))
	//* 332  677:iload           22
	//* 333  679:ifeq            825
	//* 334  682:iload           20
	//* 335  684:ldc2            #390 <Int 0x80000000>
	//* 336  687:icmpeq          695
	//* 337  690:iload           20
	//* 338  692:ifne            825
		{
			mTotalLength = 0;
	//  339  695:aload_0         
	//  340  696:iconst_0        
	//  341  697:putfield        #328 <Field int mTotalLength>
			i2 = 0;
	//  342  700:iconst_0        
	//  343  701:istore          12
			while(i2 < i4) 
	//* 344  703:iload           12
	//* 345  705:iload           18
	//* 346  707:icmpge          825
			{
				View view1 = getVirtualChildAt(i2);
	//  347  710:aload_0         
	//  348  711:iload           12
	//  349  713:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  350  716:astore          23
				if(view1 == null)
	//* 351  718:aload           23
	//* 352  720:ifnonnull       747
					mTotalLength = mTotalLength + measureNullChild(i2);
	//  353  723:aload_0         
	//  354  724:aload_0         
	//  355  725:getfield        #328 <Field int mTotalLength>
	//  356  728:aload_0         
	//  357  729:iload           12
	//  358  731:invokevirtual   #371 <Method int measureNullChild(int)>
	//  359  734:iadd            
	//  360  735:putfield        #328 <Field int mTotalLength>
				else
	//* 361  738:iload           12
	//* 362  740:iconst_1        
	//* 363  741:iadd            
	//* 364  742:istore          12
	//* 365  744:goto            703
				if(view1.getVisibility() == 8)
	//* 366  747:aload           23
	//* 367  749:invokevirtual   #174 <Method int View.getVisibility()>
	//* 368  752:bipush          8
	//* 369  754:icmpne          773
				{
					i2 += getChildrenSkipCount(view1, i2);
	//  370  757:iload           12
	//  371  759:aload_0         
	//  372  760:aload           23
	//  373  762:iload           12
	//  374  764:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//  375  767:iadd            
	//  376  768:istore          12
				} else
	//* 377  770:goto            738
				{
					LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  378  773:aload           23
	//  379  775:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  380  778:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  381  781:astore          24
					l2 = mTotalLength;
	//  382  783:aload_0         
	//  383  784:getfield        #328 <Field int mTotalLength>
	//  384  787:istore          15
					mTotalLength = Math.max(l2, l2 + j2 + layoutparams1.topMargin + layoutparams1.bottomMargin + getNextLocationOffset(view1));
	//  385  789:aload_0         
	//  386  790:iload           15
	//  387  792:iload           15
	//  388  794:iload           13
	//  389  796:iadd            
	//  390  797:aload           24
	//  391  799:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  392  802:iadd            
	//  393  803:aload           24
	//  394  805:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  395  808:iadd            
	//  396  809:aload_0         
	//  397  810:aload           23
	//  398  812:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  399  815:iadd            
	//  400  816:invokestatic    #407 <Method int Math.max(int, int)>
	//  401  819:putfield        #328 <Field int mTotalLength>
				}
				i2++;
			}
		}
	//* 402  822:goto            738
		mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
	//  403  825:aload_0         
	//  404  826:aload_0         
	//  405  827:getfield        #328 <Field int mTotalLength>
	//  406  830:aload_0         
	//  407  831:invokevirtual   #280 <Method int getPaddingTop()>
	//  408  834:aload_0         
	//  409  835:invokevirtual   #261 <Method int getPaddingBottom()>
	//  410  838:iadd            
	//  411  839:iadd            
	//  412  840:putfield        #328 <Field int mTotalLength>
		l3 = View.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumHeight()), j, 0);
	//  413  843:aload_0         
	//  414  844:getfield        #328 <Field int mTotalLength>
	//  415  847:aload_0         
	//  416  848:invokevirtual   #424 <Method int getSuggestedMinimumHeight()>
	//  417  851:invokestatic    #407 <Method int Math.max(int, int)>
	//  418  854:iload_2         
	//  419  855:iconst_0        
	//  420  856:invokestatic    #416 <Method int View.resolveSizeAndState(int, int, int)>
	//  421  859:istore          17
		i2 = (l3 & 0xffffff) - mTotalLength;
	//  422  861:iload           17
	//  423  863:ldc2            #417 <Int 0xffffff>
	//  424  866:iand            
	//  425  867:aload_0         
	//  426  868:getfield        #328 <Field int mTotalLength>
	//  427  871:isub            
	//  428  872:istore          12
		if(k2 == 0 && (i2 == 0 || f <= 0.0F)) goto _L9; else goto _L8
	//  429  874:iload           14
	//  430  876:ifne            890
	//  431  879:iload           12
	//  432  881:ifeq            1430
	//  433  884:fload_3         
	//  434  885:fconst_0        
	//  435  886:fcmpl           
	//  436  887:ifle            1430
_L8:
		if(mWeightSum > 0.0F)
	//* 437  890:aload_0         
	//* 438  891:getfield        #117 <Field float mWeightSum>
	//* 439  894:fconst_0        
	//* 440  895:fcmpl           
	//* 441  896:ifle            986
			f = mWeightSum;
	//  442  899:aload_0         
	//  443  900:getfield        #117 <Field float mWeightSum>
	//  444  903:fstore_3        
		mTotalLength = 0;
	//  445  904:aload_0         
	//  446  905:iconst_0        
	//  447  906:putfield        #328 <Field int mTotalLength>
		k2 = 0;
	//  448  909:iconst_0        
	//  449  910:istore          14
		l1 = j1;
	//  450  912:iload           9
	//  451  914:istore          11
		j2 = i2;
	//  452  916:iload           12
	//  453  918:istore          13
		while(k2 < i4) 
	//* 454  920:iload           14
	//* 455  922:iload           18
	//* 456  924:icmpge          1336
		{
			View view2 = getVirtualChildAt(k2);
	//  457  927:aload_0         
	//  458  928:iload           14
	//  459  930:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  460  933:astore          23
			if(view2.getVisibility() == 8)
	//* 461  935:aload           23
	//* 462  937:invokevirtual   #174 <Method int View.getVisibility()>
	//* 463  940:bipush          8
	//* 464  942:icmpne          989
			{
				j1 = j2;
	//  465  945:iload           13
	//  466  947:istore          9
				i2 = i1;
	//  467  949:iload           8
	//  468  951:istore          12
				i1 = k;
	//  469  953:iload           6
	//  470  955:istore          8
				k = l;
	//  471  957:iload           7
	//  472  959:istore          6
			} else
	//* 473  961:iload           14
	//* 474  963:iconst_1        
	//* 475  964:iadd            
	//* 476  965:istore          14
	//* 477  967:iload           6
	//* 478  969:istore          7
	//* 479  971:iload           8
	//* 480  973:istore          6
	//* 481  975:iload           12
	//* 482  977:istore          8
	//* 483  979:iload           9
	//* 484  981:istore          13
	//* 485  983:goto            920
	//* 486  986:goto            904
			{
				LayoutParams layoutparams2 = (LayoutParams)view2.getLayoutParams();
	//  487  989:aload           23
	//  488  991:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  489  994:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  490  997:astore          24
				float f2 = layoutparams2.weight;
	//  491  999:aload           24
	//  492 1001:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  493 1004:fstore          5
				i2 = i1;
	//  494 1006:iload           8
	//  495 1008:istore          12
				j1 = j2;
	//  496 1010:iload           13
	//  497 1012:istore          9
				float f1 = f;
	//  498 1014:fload_3         
	//  499 1015:fstore          4
				if(f2 > 0.0F)
	//* 500 1017:fload           5
	//* 501 1019:fconst_0        
	//* 502 1020:fcmpl           
	//* 503 1021:ifle            1155
				{
					j1 = (int)(((float)j2 * f2) / f);
	//  504 1024:iload           13
	//  505 1026:i2f             
	//  506 1027:fload           5
	//  507 1029:fmul            
	//  508 1030:fload_3         
	//  509 1031:fdiv            
	//  510 1032:f2i             
	//  511 1033:istore          9
					f1 = f - f2;
	//  512 1035:fload_3         
	//  513 1036:fload           5
	//  514 1038:fsub            
	//  515 1039:fstore          4
					i2 = j2 - j1;
	//  516 1041:iload           13
	//  517 1043:iload           9
	//  518 1045:isub            
	//  519 1046:istore          12
					l2 = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutparams2.leftMargin + layoutparams2.rightMargin, layoutparams2.width);
	//  520 1048:iload_1         
	//  521 1049:aload_0         
	//  522 1050:invokevirtual   #237 <Method int getPaddingLeft()>
	//  523 1053:aload_0         
	//  524 1054:invokevirtual   #243 <Method int getPaddingRight()>
	//  525 1057:iadd            
	//  526 1058:aload           24
	//  527 1060:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  528 1063:iadd            
	//  529 1064:aload           24
	//  530 1066:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  531 1069:iadd            
	//  532 1070:aload           24
	//  533 1072:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//  534 1075:invokestatic    #420 <Method int getChildMeasureSpec(int, int, int)>
	//  535 1078:istore          15
					if(layoutparams2.height != 0 || k4 != 0x40000000)
	//* 536 1080:aload           24
	//* 537 1082:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 538 1085:ifne            1095
	//* 539 1088:iload           20
	//* 540 1090:ldc1            #160 <Int 0x40000000>
	//* 541 1092:icmpeq          1289
					{
						j2 = view2.getMeasuredHeight() + j1;
	//  542 1095:aload           23
	//  543 1097:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  544 1100:iload           9
	//  545 1102:iadd            
	//  546 1103:istore          13
						j1 = j2;
	//  547 1105:iload           13
	//  548 1107:istore          9
						if(j2 < 0)
	//* 549 1109:iload           13
	//* 550 1111:ifge            1117
							j1 = 0;
	//  551 1114:iconst_0        
	//  552 1115:istore          9
						view2.measure(l2, android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
	//  553 1117:aload           23
	//  554 1119:iload           15
	//  555 1121:iload           9
	//  556 1123:ldc1            #160 <Int 0x40000000>
	//  557 1125:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  558 1128:invokevirtual   #396 <Method void View.measure(int, int)>
					} else
	//* 559 1131:iload           8
	//* 560 1133:aload           23
	//* 561 1135:invokevirtual   #399 <Method int View.getMeasuredState()>
	//* 562 1138:sipush          -256
	//* 563 1141:iand            
	//* 564 1142:invokestatic    #402 <Method int View.combineMeasuredStates(int, int)>
	//* 565 1145:istore          8
	//* 566 1147:iload           12
	//* 567 1149:istore          9
	//* 568 1151:iload           8
	//* 569 1153:istore          12
	//* 570 1155:aload           24
	//* 571 1157:getfield        #232 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//* 572 1160:aload           24
	//* 573 1162:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//* 574 1165:iadd            
	//* 575 1166:istore          13
	//* 576 1168:aload           23
	//* 577 1170:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//* 578 1173:iload           13
	//* 579 1175:iadd            
	//* 580 1176:istore          15
	//* 581 1178:iload           11
	//* 582 1180:iload           15
	//* 583 1182:invokestatic    #407 <Method int Math.max(int, int)>
	//* 584 1185:istore          11
	//* 585 1187:iload           19
	//* 586 1189:ldc1            #160 <Int 0x40000000>
	//* 587 1191:icmpeq          1317
	//* 588 1194:aload           24
	//* 589 1196:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 590 1199:iconst_m1       
	//* 591 1200:icmpne          1317
	//* 592 1203:iconst_1        
	//* 593 1204:istore          8
	//* 594 1206:iload           8
	//* 595 1208:ifeq            1323
	//* 596 1211:iload           13
	//* 597 1213:istore          8
	//* 598 1215:iload           6
	//* 599 1217:iload           8
	//* 600 1219:invokestatic    #407 <Method int Math.max(int, int)>
	//* 601 1222:istore          8
	//* 602 1224:iload           7
	//* 603 1226:ifeq            1330
	//* 604 1229:aload           24
	//* 605 1231:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 606 1234:iconst_m1       
	//* 607 1235:icmpne          1330
	//* 608 1238:iconst_1        
	//* 609 1239:istore          6
	//* 610 1241:aload_0         
	//* 611 1242:getfield        #328 <Field int mTotalLength>
	//* 612 1245:istore          7
	//* 613 1247:aload_0         
	//* 614 1248:iload           7
	//* 615 1250:aload           23
	//* 616 1252:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//* 617 1255:iload           7
	//* 618 1257:iadd            
	//* 619 1258:aload           24
	//* 620 1260:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//* 621 1263:iadd            
	//* 622 1264:aload           24
	//* 623 1266:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//* 624 1269:iadd            
	//* 625 1270:aload_0         
	//* 626 1271:aload           23
	//* 627 1273:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//* 628 1276:iadd            
	//* 629 1277:invokestatic    #407 <Method int Math.max(int, int)>
	//* 630 1280:putfield        #328 <Field int mTotalLength>
	//* 631 1283:fload           4
	//* 632 1285:fstore_3        
	//* 633 1286:goto            961
					{
						if(j1 <= 0)
	//* 634 1289:iload           9
	//* 635 1291:ifle            1311
	//* 636 1294:aload           23
	//* 637 1296:iload           15
	//* 638 1298:iload           9
	//* 639 1300:ldc1            #160 <Int 0x40000000>
	//* 640 1302:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 641 1305:invokevirtual   #396 <Method void View.measure(int, int)>
	//* 642 1308:goto            1131
							j1 = 0;
	//  643 1311:iconst_0        
	//  644 1312:istore          9
						view2.measure(l2, android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
					}
					i1 = View.combineMeasuredStates(i1, view2.getMeasuredState() & 0xffffff00);
					j1 = i2;
					i2 = i1;
				}
				j2 = layoutparams2.leftMargin + layoutparams2.rightMargin;
				l2 = view2.getMeasuredWidth() + j2;
				l1 = Math.max(l1, l2);
				if(j4 != 0x40000000 && layoutparams2.width == -1)
					i1 = 1;
				else
	//* 645 1314:goto            1294
					i1 = 0;
	//  646 1317:iconst_0        
	//  647 1318:istore          8
				if(i1 != 0)
					i1 = j2;
				else
	//* 648 1320:goto            1206
					i1 = l2;
	//  649 1323:iload           15
	//  650 1325:istore          8
				i1 = Math.max(k, i1);
				if(l != 0 && layoutparams2.width == -1)
					k = 1;
				else
	//* 651 1327:goto            1215
					k = 0;
	//  652 1330:iconst_0        
	//  653 1331:istore          6
				l = mTotalLength;
				mTotalLength = Math.max(l, view2.getMeasuredHeight() + l + layoutparams2.topMargin + layoutparams2.bottomMargin + getNextLocationOffset(view2));
				f = f1;
			}
			k2++;
			l = k;
			k = i1;
			i1 = i2;
			j2 = j1;
		}
	//* 654 1333:goto            1241
		mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
	//  655 1336:aload_0         
	//  656 1337:aload_0         
	//  657 1338:getfield        #328 <Field int mTotalLength>
	//  658 1341:aload_0         
	//  659 1342:invokevirtual   #280 <Method int getPaddingTop()>
	//  660 1345:aload_0         
	//  661 1346:invokevirtual   #261 <Method int getPaddingBottom()>
	//  662 1349:iadd            
	//  663 1350:iadd            
	//  664 1351:putfield        #328 <Field int mTotalLength>
		i2 = i1;
	//  665 1354:iload           8
	//  666 1356:istore          12
		k2 = l;
	//  667 1358:iload           7
	//  668 1360:istore          14
_L11:
		l = l1;
	//  669 1362:iload           11
	//  670 1364:istore          7
		if(k2 == 0)
	//* 671 1366:iload           14
	//* 672 1368:ifne            1386
		{
			l = l1;
	//  673 1371:iload           11
	//  674 1373:istore          7
			if(j4 != 0x40000000)
	//* 675 1375:iload           19
	//* 676 1377:ldc1            #160 <Int 0x40000000>
	//* 677 1379:icmpeq          1386
				l = k;
	//  678 1382:iload           6
	//  679 1384:istore          7
		}
		setMeasuredDimension(View.resolveSizeAndState(Math.max(l + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, i2), l3);
	//  680 1386:aload_0         
	//  681 1387:iload           7
	//  682 1389:aload_0         
	//  683 1390:invokevirtual   #237 <Method int getPaddingLeft()>
	//  684 1393:aload_0         
	//  685 1394:invokevirtual   #243 <Method int getPaddingRight()>
	//  686 1397:iadd            
	//  687 1398:iadd            
	//  688 1399:aload_0         
	//  689 1400:invokevirtual   #412 <Method int getSuggestedMinimumWidth()>
	//  690 1403:invokestatic    #407 <Method int Math.max(int, int)>
	//  691 1406:iload_1         
	//  692 1407:iload           12
	//  693 1409:invokestatic    #416 <Method int View.resolveSizeAndState(int, int, int)>
	//  694 1412:iload           17
	//  695 1414:invokevirtual   #427 <Method void setMeasuredDimension(int, int)>
		if(k1 != 0)
	//* 696 1417:iload           10
	//* 697 1419:ifeq            1429
			forceUniformWidth(i4, j);
	//  698 1422:aload_0         
	//  699 1423:iload           18
	//  700 1425:iload_2         
	//  701 1426:invokespecial   #434 <Method void forceUniformWidth(int, int)>
		return;
	//  702 1429:return          
_L9:
		i3 = Math.max(k, l1);
	//  703 1430:iload           6
	//  704 1432:iload           11
	//  705 1434:invokestatic    #407 <Method int Math.max(int, int)>
	//  706 1437:istore          16
		k2 = l;
	//  707 1439:iload           7
	//  708 1441:istore          14
		k = i3;
	//  709 1443:iload           16
	//  710 1445:istore          6
		i2 = i1;
	//  711 1447:iload           8
	//  712 1449:istore          12
		l1 = j1;
	//  713 1451:iload           9
	//  714 1453:istore          11
		if(!flag) goto _L11; else goto _L10
	//  715 1455:iload           22
	//  716 1457:ifeq            1362
_L10:
		k2 = l;
	//  717 1460:iload           7
	//  718 1462:istore          14
		k = i3;
	//  719 1464:iload           16
	//  720 1466:istore          6
		i2 = i1;
	//  721 1468:iload           8
	//  722 1470:istore          12
		l1 = j1;
	//  723 1472:iload           9
	//  724 1474:istore          11
		if(k4 == 0x40000000) goto _L11; else goto _L12
	//  725 1476:iload           20
	//  726 1478:ldc1            #160 <Int 0x40000000>
	//  727 1480:icmpeq          1362
_L12:
		l2 = 0;
	//  728 1483:iconst_0        
	//  729 1484:istore          15
_L14:
		k2 = l;
	//  730 1486:iload           7
	//  731 1488:istore          14
		k = i3;
	//  732 1490:iload           16
	//  733 1492:istore          6
		i2 = i1;
	//  734 1494:iload           8
	//  735 1496:istore          12
		l1 = j1;
	//  736 1498:iload           9
	//  737 1500:istore          11
		if(l2 >= i4) goto _L11; else goto _L13
	//  738 1502:iload           15
	//  739 1504:iload           18
	//  740 1506:icmpge          1362
_L13:
		View view3 = getVirtualChildAt(l2);
	//  741 1509:aload_0         
	//  742 1510:iload           15
	//  743 1512:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  744 1515:astore          23
		if(view3 != null && view3.getVisibility() != 8 && ((LayoutParams)view3.getLayoutParams()).weight > 0.0F)
	//* 745 1517:aload           23
	//* 746 1519:ifnull          1532
	//* 747 1522:aload           23
	//* 748 1524:invokevirtual   #174 <Method int View.getVisibility()>
	//* 749 1527:bipush          8
	//* 750 1529:icmpne          1541
	//* 751 1532:iload           15
	//* 752 1534:iconst_1        
	//* 753 1535:iadd            
	//* 754 1536:istore          15
	//* 755 1538:goto            1486
	//* 756 1541:aload           23
	//* 757 1543:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 758 1546:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//* 759 1549:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 760 1552:fconst_0        
	//* 761 1553:fcmpl           
	//* 762 1554:ifle            1532
			view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(view3.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000));
	//  763 1557:aload           23
	//  764 1559:aload           23
	//  765 1561:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  766 1564:ldc1            #160 <Int 0x40000000>
	//  767 1566:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  768 1569:iload           13
	//  769 1571:ldc1            #160 <Int 0x40000000>
	//  770 1573:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  771 1576:invokevirtual   #396 <Method void View.measure(int, int)>
		l2++;
		  goto _L14
	//* 772 1579:goto            1532
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
	//*   3    5:icmpeq          47
		{
			int j = i;
	//    4    8:iload_1         
	//    5    9:istore_2        
			if((0x800007 & i) == 0)
	//*   6   10:ldc2            #357 <Int 0x800007>
	//*   7   13:iload_1         
	//*   8   14:iand            
	//*   9   15:ifne            24
				j = i | 0x800003;
	//   10   18:iload_1         
	//   11   19:ldc2            #514 <Int 0x800003>
	//   12   22:ior             
	//   13   23:istore_2        
			i = j;
	//   14   24:iload_2         
	//   15   25:istore_1        
			if((j & 0x70) == 0)
	//*  16   26:iload_2         
	//*  17   27:bipush          112
	//*  18   29:iand            
	//*  19   30:ifne            38
				i = j | 0x30;
	//   20   33:iload_2         
	//   21   34:bipush          48
	//   22   36:ior             
	//   23   37:istore_1        
			mGravity = i;
	//   24   38:aload_0         
	//   25   39:iload_1         
	//   26   40:putfield        #68  <Field int mGravity>
			requestLayout();
	//   27   43:aload_0         
	//   28   44:invokevirtual   #512 <Method void requestLayout()>
		}
	//   29   47:return          
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
			mGravity = mGravity & 0xff7ffff8 | i;
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #68  <Field int mGravity>
	//   13   23:ldc2            #516 <Int 0xff7ffff8>
	//   14   26:iand            
	//   15   27:iload_1         
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
			mGravity = mGravity & 0xffffff8f | i;
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:getfield        #68  <Field int mGravity>
	//   13   21:bipush          -113
	//   14   23:iand            
	//   15   24:iload_1         
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
