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
		view.layout(i, j, k + i, l + j);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload_2         
	//    5    6:iadd            
	//    6    7:iload           5
	//    7    9:iload_3         
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
		for(int i = 0; i < l; i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:iload           4
	//*  10   17:icmpge          110
		{
			View view = getVirtualChildAt(i);
	//   11   20:aload_0         
	//   12   21:iload_2         
	//   13   22:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   14   25:astore          6
			if(view == null || view.getVisibility() == 8 || !hasDividerBeforeChildAt(i))
				continue;
	//   15   27:aload           6
	//   16   29:ifnull          103
	//   17   32:aload           6
	//   18   34:invokevirtual   #174 <Method int View.getVisibility()>
	//   19   37:bipush          8
	//   20   39:icmpeq          103
	//   21   42:aload_0         
	//   22   43:iload_2         
	//   23   44:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//   24   47:ifeq            103
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   25   50:aload           6
	//   26   52:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   27   55:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   28   58:astore          7
			int k;
			if(flag)
	//*  29   60:iload           5
	//*  30   62:ifeq            80
				k = view.getRight() + layoutparams.rightMargin;
	//   31   65:aload           6
	//   32   67:invokevirtual   #219 <Method int View.getRight()>
	//   33   70:aload           7
	//   34   72:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//   35   75:iadd            
	//   36   76:istore_3        
			else
	//*  37   77:goto            97
				k = view.getLeft() - layoutparams.leftMargin - mDividerWidth;
	//   38   80:aload           6
	//   39   82:invokevirtual   #225 <Method int View.getLeft()>
	//   40   85:aload           7
	//   41   87:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//   42   90:isub            
	//   43   91:aload_0         
	//   44   92:getfield        #230 <Field int mDividerWidth>
	//   45   95:isub            
	//   46   96:istore_3        
			drawVerticalDivider(canvas, k);
	//   47   97:aload_0         
	//   48   98:aload_1         
	//   49   99:iload_3         
	//   50  100:invokevirtual   #234 <Method void drawVerticalDivider(Canvas, int)>
		}

	//   51  103:iload_2         
	//   52  104:iconst_1        
	//   53  105:iadd            
	//   54  106:istore_2        
	//*  55  107:goto            14
		if(hasDividerBeforeChildAt(l))
	//*  56  110:aload_0         
	//*  57  111:iload           4
	//*  58  113:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//*  59  116:ifeq            218
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
	//*  67  131:ifnonnull       165
			{
				if(flag)
	//*  68  134:iload           5
	//*  69  136:ifeq            147
					j = getPaddingLeft();
	//   70  139:aload_0         
	//   71  140:invokevirtual   #237 <Method int getPaddingLeft()>
	//   72  143:istore_2        
				else
	//*  73  144:goto            212
					j = getWidth() - getPaddingRight() - mDividerWidth;
	//   74  147:aload_0         
	//   75  148:invokevirtual   #240 <Method int getWidth()>
	//   76  151:aload_0         
	//   77  152:invokevirtual   #243 <Method int getPaddingRight()>
	//   78  155:isub            
	//   79  156:aload_0         
	//   80  157:getfield        #230 <Field int mDividerWidth>
	//   81  160:isub            
	//   82  161:istore_2        
			} else
	//*  83  162:goto            212
			{
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//   84  165:aload           6
	//   85  167:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   86  170:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   87  173:astore          7
				if(flag)
	//*  88  175:iload           5
	//*  89  177:ifeq            200
					j = view1.getLeft() - layoutparams1.leftMargin - mDividerWidth;
	//   90  180:aload           6
	//   91  182:invokevirtual   #225 <Method int View.getLeft()>
	//   92  185:aload           7
	//   93  187:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//   94  190:isub            
	//   95  191:aload_0         
	//   96  192:getfield        #230 <Field int mDividerWidth>
	//   97  195:isub            
	//   98  196:istore_2        
				else
	//*  99  197:goto            212
					j = view1.getRight() + layoutparams1.rightMargin;
	//  100  200:aload           6
	//  101  202:invokevirtual   #219 <Method int View.getRight()>
	//  102  205:aload           7
	//  103  207:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  104  210:iadd            
	//  105  211:istore_2        
			}
			drawVerticalDivider(canvas, j);
	//  106  212:aload_0         
	//  107  213:aload_1         
	//  108  214:iload_2         
	//  109  215:invokevirtual   #234 <Method void drawVerticalDivider(Canvas, int)>
		}
	//  110  218:return          
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
	//*  45   85:ifeq            148
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
	//*  53   99:ifnonnull       120
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
	//*  63  117:goto            142
			{
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//   64  120:aload           4
	//   65  122:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   66  125:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   67  128:astore          5
				j = view1.getBottom() + layoutparams1.bottomMargin;
	//   68  130:aload           4
	//   69  132:invokevirtual   #264 <Method int View.getBottom()>
	//   70  135:aload           5
	//   71  137:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//   72  140:iadd            
	//   73  141:istore_2        
			}
			drawHorizontalDivider(canvas, j);
	//   74  142:aload_0         
	//   75  143:aload_1         
	//   76  144:iload_2         
	//   77  145:invokevirtual   #255 <Method void drawHorizontalDivider(Canvas, int)>
		}
	//   78  148:return          
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
	//    9   15:getfield        #230 <Field int mDividerWidth>
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
		if(mBaselineAlignedChildIndex < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field int mBaselineAlignedChildIndex>
	//*   2    4:ifge            12
			return super.getBaseline();
	//    3    7:aload_0         
	//    4    8:invokespecial   #308 <Method int ViewGroup.getBaseline()>
	//    5   11:ireturn         
		if(getChildCount() <= mBaselineAlignedChildIndex)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #311 <Method int getChildCount()>
	//*   8   16:aload_0         
	//*   9   17:getfield        #63  <Field int mBaselineAlignedChildIndex>
	//*  10   20:icmpgt          34
			throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
	//   11   23:new             #313 <Class RuntimeException>
	//   12   26:dup             
	//   13   27:ldc2            #315 <String "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.">
	//   14   30:invokespecial   #318 <Method void RuntimeException(String)>
	//   15   33:athrow          
		View view = getChildAt(mBaselineAlignedChildIndex);
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #63  <Field int mBaselineAlignedChildIndex>
	//   19   39:invokevirtual   #321 <Method View getChildAt(int)>
	//   20   42:astore          5
		int k = view.getBaseline();
	//   21   44:aload           5
	//   22   46:invokevirtual   #322 <Method int View.getBaseline()>
	//   23   49:istore_3        
		if(k == -1)
	//*  24   50:iload_3         
	//*  25   51:iconst_m1       
	//*  26   52:icmpne          75
			if(mBaselineAlignedChildIndex == 0)
	//*  27   55:aload_0         
	//*  28   56:getfield        #63  <Field int mBaselineAlignedChildIndex>
	//*  29   59:ifne            64
				return -1;
	//   30   62:iconst_m1       
	//   31   63:ireturn         
			else
				throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
	//   32   64:new             #313 <Class RuntimeException>
	//   33   67:dup             
	//   34   68:ldc2            #324 <String "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.">
	//   35   71:invokespecial   #318 <Method void RuntimeException(String)>
	//   36   74:athrow          
		int j = mBaselineChildTop;
	//   37   75:aload_0         
	//   38   76:getfield        #65  <Field int mBaselineChildTop>
	//   39   79:istore_2        
		int i = j;
	//   40   80:iload_2         
	//   41   81:istore_1        
		if(mOrientation == 1)
	//*  42   82:aload_0         
	//*  43   83:getfield        #284 <Field int mOrientation>
	//*  44   86:iconst_1        
	//*  45   87:icmpne          179
		{
			int l = mGravity & 0x70;
	//   46   90:aload_0         
	//   47   91:getfield        #68  <Field int mGravity>
	//   48   94:bipush          112
	//   49   96:iand            
	//   50   97:istore          4
			i = j;
	//   51   99:iload_2         
	//   52  100:istore_1        
			if(l != 48)
	//*  53  101:iload           4
	//*  54  103:bipush          48
	//*  55  105:icmpeq          179
				if(l != 16)
	//*  56  108:iload           4
	//*  57  110:bipush          16
	//*  58  112:icmpeq          150
				{
					if(l != 80)
	//*  59  115:iload           4
	//*  60  117:bipush          80
	//*  61  119:icmpeq          127
						i = j;
	//   62  122:iload_2         
	//   63  123:istore_1        
					else
	//*  64  124:goto            179
						i = getBottom() - getTop() - getPaddingBottom() - mTotalLength;
	//   65  127:aload_0         
	//   66  128:invokevirtual   #325 <Method int getBottom()>
	//   67  131:aload_0         
	//   68  132:invokevirtual   #326 <Method int getTop()>
	//   69  135:isub            
	//   70  136:aload_0         
	//   71  137:invokevirtual   #261 <Method int getPaddingBottom()>
	//   72  140:isub            
	//   73  141:aload_0         
	//   74  142:getfield        #328 <Field int mTotalLength>
	//   75  145:isub            
	//   76  146:istore_1        
				} else
	//*  77  147:goto            179
				{
					i = j + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - mTotalLength) / 2;
	//   78  150:iload_2         
	//   79  151:aload_0         
	//   80  152:invokevirtual   #325 <Method int getBottom()>
	//   81  155:aload_0         
	//   82  156:invokevirtual   #326 <Method int getTop()>
	//   83  159:isub            
	//   84  160:aload_0         
	//   85  161:invokevirtual   #280 <Method int getPaddingTop()>
	//   86  164:isub            
	//   87  165:aload_0         
	//   88  166:invokevirtual   #261 <Method int getPaddingBottom()>
	//   89  169:isub            
	//   90  170:aload_0         
	//   91  171:getfield        #328 <Field int mTotalLength>
	//   92  174:isub            
	//   93  175:iconst_2        
	//   94  176:idiv            
	//   95  177:iadd            
	//   96  178:istore_1        
				}
		}
		return i + ((LayoutParams)view.getLayoutParams()).topMargin + k;
	//   97  179:iload_1         
	//   98  180:aload           5
	//   99  182:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  100  185:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  101  188:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  102  191:iadd            
	//  103  192:iload_3         
	//  104  193:iadd            
	//  105  194:ireturn         
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
	//    1    1:getfield        #230 <Field int mDividerWidth>
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
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(i == 0)
	//*   4    4:iload_1         
	//*   5    5:ifne            21
		{
			if((mShowDividers & 1) != 0)
	//*   6    8:aload_0         
	//*   7    9:getfield        #141 <Field int mShowDividers>
	//*   8   12:iconst_1        
	//*   9   13:iand            
	//*  10   14:ifeq            19
				flag = true;
	//   11   17:iconst_1        
	//   12   18:istore_2        
			return flag;
	//   13   19:iload_2         
	//   14   20:ireturn         
		}
		if(i == getChildCount())
	//*  15   21:iload_1         
	//*  16   22:aload_0         
	//*  17   23:invokevirtual   #311 <Method int getChildCount()>
	//*  18   26:icmpne          44
		{
			boolean flag1 = flag2;
	//   19   29:iload_3         
	//   20   30:istore_2        
			if((mShowDividers & 4) != 0)
	//*  21   31:aload_0         
	//*  22   32:getfield        #141 <Field int mShowDividers>
	//*  23   35:iconst_4        
	//*  24   36:iand            
	//*  25   37:ifeq            42
				flag1 = true;
	//   26   40:iconst_1        
	//   27   41:istore_2        
			return flag1;
	//   28   42:iload_2         
	//   29   43:ireturn         
		}
		if((mShowDividers & 2) != 0)
	//*  30   44:aload_0         
	//*  31   45:getfield        #141 <Field int mShowDividers>
	//*  32   48:iconst_2        
	//*  33   49:iand            
	//*  34   50:ifeq            85
		{
			for(i--; i >= 0; i--)
	//*  35   53:iload_1         
	//*  36   54:iconst_1        
	//*  37   55:isub            
	//*  38   56:istore_1        
	//*  39   57:iload_1         
	//*  40   58:iflt            83
				if(getChildAt(i).getVisibility() != 8)
	//*  41   61:aload_0         
	//*  42   62:iload_1         
	//*  43   63:invokevirtual   #321 <Method View getChildAt(int)>
	//*  44   66:invokevirtual   #174 <Method int View.getVisibility()>
	//*  45   69:bipush          8
	//*  46   71:icmpeq          76
					return true;
	//   47   74:iconst_1        
	//   48   75:ireturn         

	//   49   76:iload_1         
	//   50   77:iconst_1        
	//   51   78:isub            
	//   52   79:istore_1        
	//*  53   80:goto            57
			return false;
	//   54   83:iconst_0        
	//   55   84:ireturn         
		} else
		{
			return false;
	//   56   85:iconst_0        
	//   57   86:ireturn         
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
		boolean flag4 = ViewUtils.isLayoutRtl(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #212 <Method boolean ViewUtils.isLayoutRtl(View)>
	//    2    4:istore          20
		int i2 = getPaddingTop();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #280 <Method int getPaddingTop()>
	//    5   10:istore          10
		int l2 = l - j;
	//    6   12:iload           4
	//    7   14:iload_2         
	//    8   15:isub            
	//    9   16:istore          12
		int i3 = getPaddingBottom();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #261 <Method int getPaddingBottom()>
	//   12   22:istore          13
		int j3 = getPaddingBottom();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #261 <Method int getPaddingBottom()>
	//   15   28:istore          14
		int k1 = getVirtualChildCount();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #206 <Method int getVirtualChildCount()>
	//   18   34:istore          8
		l = mGravity;
	//   19   36:aload_0         
	//   20   37:getfield        #68  <Field int mGravity>
	//   21   40:istore          4
		j = mGravity & 0x70;
	//   22   42:aload_0         
	//   23   43:getfield        #68  <Field int mGravity>
	//   24   46:bipush          112
	//   25   48:iand            
	//   26   49:istore_2        
		boolean flag3 = mBaselineAligned;
	//   27   50:aload_0         
	//   28   51:getfield        #61  <Field boolean mBaselineAligned>
	//   29   54:istore          19
		int ai[] = mMaxAscent;
	//   30   56:aload_0         
	//   31   57:getfield        #355 <Field int[] mMaxAscent>
	//   32   60:astore          21
		int ai1[] = mMaxDescent;
	//   33   62:aload_0         
	//   34   63:getfield        #357 <Field int[] mMaxDescent>
	//   35   66:astore          22
		l = GravityCompat.getAbsoluteGravity(l & 0x800007, ViewCompat.getLayoutDirection(((View) (this))));
	//   36   68:iload           4
	//   37   70:ldc2            #358 <Int 0x800007>
	//   38   73:iand            
	//   39   74:aload_0         
	//   40   75:invokestatic    #363 <Method int ViewCompat.getLayoutDirection(View)>
	//   41   78:invokestatic    #368 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   42   81:istore          4
		boolean flag = true;
	//   43   83:iconst_1        
	//   44   84:istore          18
		if(l != 1)
	//*  45   86:iload           4
	//*  46   88:iconst_1        
	//*  47   89:icmpeq          123
		{
			if(l != 5)
	//*  48   92:iload           4
	//*  49   94:iconst_5        
	//*  50   95:icmpeq          106
				i = getPaddingLeft();
	//   51   98:aload_0         
	//   52   99:invokevirtual   #237 <Method int getPaddingLeft()>
	//   53  102:istore_1        
			else
	//*  54  103:goto            143
				i = (getPaddingLeft() + k) - i - mTotalLength;
	//   55  106:aload_0         
	//   56  107:invokevirtual   #237 <Method int getPaddingLeft()>
	//   57  110:iload_3         
	//   58  111:iadd            
	//   59  112:iload_1         
	//   60  113:isub            
	//   61  114:aload_0         
	//   62  115:getfield        #328 <Field int mTotalLength>
	//   63  118:isub            
	//   64  119:istore_1        
		} else
	//*  65  120:goto            143
		{
			l = getPaddingLeft();
	//   66  123:aload_0         
	//   67  124:invokevirtual   #237 <Method int getPaddingLeft()>
	//   68  127:istore          4
			i = (k - i - mTotalLength) / 2 + l;
	//   69  129:iload_3         
	//   70  130:iload_1         
	//   71  131:isub            
	//   72  132:aload_0         
	//   73  133:getfield        #328 <Field int mTotalLength>
	//   74  136:isub            
	//   75  137:iconst_2        
	//   76  138:idiv            
	//   77  139:iload           4
	//   78  141:iadd            
	//   79  142:istore_1        
		}
		int j1;
		byte byte0;
		if(flag4)
	//*  80  143:iload           20
	//*  81  145:ifeq            160
		{
			j1 = k1 - 1;
	//   82  148:iload           8
	//   83  150:iconst_1        
	//   84  151:isub            
	//   85  152:istore          6
			byte0 = -1;
	//   86  154:iconst_m1       
	//   87  155:istore          7
		} else
	//*  88  157:goto            166
		{
			j1 = 0;
	//   89  160:iconst_0        
	//   90  161:istore          6
			byte0 = 1;
	//   91  163:iconst_1        
	//   92  164:istore          7
		}
		l = 0;
	//   93  166:iconst_0        
	//   94  167:istore          4
		k = i2;
	//   95  169:iload           10
	//   96  171:istore_3        
		for(; l < k1; l++)
	//*  97  172:iload           4
	//*  98  174:iload           8
	//*  99  176:icmpge          550
		{
			int l3 = j1 + byte0 * l;
	//  100  179:iload           6
	//  101  181:iload           7
	//  102  183:iload           4
	//  103  185:imul            
	//  104  186:iadd            
	//  105  187:istore          16
			View view = getVirtualChildAt(l3);
	//  106  189:aload_0         
	//  107  190:iload           16
	//  108  192:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  109  195:astore          23
			if(view == null)
	//* 110  197:aload           23
	//* 111  199:ifnonnull       214
			{
				i += measureNullChild(l3);
	//  112  202:iload_1         
	//  113  203:aload_0         
	//  114  204:iload           16
	//  115  206:invokevirtual   #372 <Method int measureNullChild(int)>
	//  116  209:iadd            
	//  117  210:istore_1        
				continue;
	//  118  211:goto            541
			}
			boolean flag2;
			if(view.getVisibility() != 8)
	//* 119  214:aload           23
	//* 120  216:invokevirtual   #174 <Method int View.getVisibility()>
	//* 121  219:bipush          8
	//* 122  221:icmpeq          535
			{
				int k3 = view.getMeasuredWidth();
	//  123  224:aload           23
	//  124  226:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  125  229:istore          15
				int i4 = view.getMeasuredHeight();
	//  126  231:aload           23
	//  127  233:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  128  236:istore          17
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//  129  238:aload           23
	//  130  240:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  131  243:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  132  246:astore          24
				int l1;
				if(flag3 && layoutparams.height != -1)
	//* 133  248:iload           19
	//* 134  250:ifeq            272
	//* 135  253:aload           24
	//* 136  255:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 137  258:iconst_m1       
	//* 138  259:icmpeq          272
					l1 = view.getBaseline();
	//  139  262:aload           23
	//  140  264:invokevirtual   #322 <Method int View.getBaseline()>
	//  141  267:istore          9
				else
	//* 142  269:goto            275
					l1 = -1;
	//  143  272:iconst_m1       
	//  144  273:istore          9
				int j2 = layoutparams.gravity;
	//  145  275:aload           24
	//  146  277:getfield        #375 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//  147  280:istore          11
				int i1 = j2;
	//  148  282:iload           11
	//  149  284:istore          5
				if(j2 < 0)
	//* 150  286:iload           11
	//* 151  288:ifge            294
					i1 = j;
	//  152  291:iload_2         
	//  153  292:istore          5
				i1 &= 0x70;
	//  154  294:iload           5
	//  155  296:bipush          112
	//  156  298:iand            
	//  157  299:istore          5
				if(i1 != 16)
	//* 158  301:iload           5
	//* 159  303:bipush          16
	//* 160  305:icmpeq          412
				{
					if(i1 != 48)
	//* 161  308:iload           5
	//* 162  310:bipush          48
	//* 163  312:icmpeq          379
					{
						if(i1 != 80)
	//* 164  315:iload           5
	//* 165  317:bipush          80
	//* 166  319:icmpeq          328
						{
							i1 = k;
	//  167  322:iload_3         
	//  168  323:istore          5
						} else
	//* 169  325:goto            441
						{
							int k2 = l2 - i3 - i4 - layoutparams.bottomMargin;
	//  170  328:iload           12
	//  171  330:iload           13
	//  172  332:isub            
	//  173  333:iload           17
	//  174  335:isub            
	//  175  336:aload           24
	//  176  338:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  177  341:isub            
	//  178  342:istore          11
							i1 = k2;
	//  179  344:iload           11
	//  180  346:istore          5
							if(l1 != -1)
	//* 181  348:iload           9
	//* 182  350:iconst_m1       
	//* 183  351:icmpeq          376
							{
								i1 = view.getMeasuredHeight();
	//  184  354:aload           23
	//  185  356:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  186  359:istore          5
								i1 = k2 - (ai1[2] - (i1 - l1));
	//  187  361:iload           11
	//  188  363:aload           22
	//  189  365:iconst_2        
	//  190  366:iaload          
	//  191  367:iload           5
	//  192  369:iload           9
	//  193  371:isub            
	//  194  372:isub            
	//  195  373:isub            
	//  196  374:istore          5
							}
						}
					} else
	//* 197  376:goto            325
					{
						i1 = layoutparams.topMargin + k;
	//  198  379:aload           24
	//  199  381:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  200  384:iload_3         
	//  201  385:iadd            
	//  202  386:istore          5
						if(l1 != -1)
	//* 203  388:iload           9
	//* 204  390:iconst_m1       
	//* 205  391:icmpeq          409
							i1 += ai[1] - l1;
	//  206  394:iload           5
	//  207  396:aload           21
	//  208  398:iconst_1        
	//  209  399:iaload          
	//  210  400:iload           9
	//  211  402:isub            
	//  212  403:iadd            
	//  213  404:istore          5
					}
				} else
	//* 214  406:goto            409
	//* 215  409:goto            441
				{
					i1 = ((l2 - i2 - j3 - i4) / 2 + k + layoutparams.topMargin) - layoutparams.bottomMargin;
	//  216  412:iload           12
	//  217  414:iload           10
	//  218  416:isub            
	//  219  417:iload           14
	//  220  419:isub            
	//  221  420:iload           17
	//  222  422:isub            
	//  223  423:iconst_2        
	//  224  424:idiv            
	//  225  425:iload_3         
	//  226  426:iadd            
	//  227  427:aload           24
	//  228  429:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  229  432:iadd            
	//  230  433:aload           24
	//  231  435:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  232  438:isub            
	//  233  439:istore          5
				}
				boolean flag1 = true;
	//  234  441:iconst_1        
	//  235  442:istore          18
				l1 = i;
	//  236  444:iload_1         
	//  237  445:istore          9
				if(hasDividerBeforeChildAt(l3))
	//* 238  447:aload_0         
	//* 239  448:iload           16
	//* 240  450:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 241  453:ifeq            464
					l1 = i + mDividerWidth;
	//  242  456:iload_1         
	//  243  457:aload_0         
	//  244  458:getfield        #230 <Field int mDividerWidth>
	//  245  461:iadd            
	//  246  462:istore          9
				i = layoutparams.leftMargin + l1;
	//  247  464:aload           24
	//  248  466:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  249  469:iload           9
	//  250  471:iadd            
	//  251  472:istore_1        
				setChildFrame(view, i + getLocationOffset(view), i1, k3, i4);
	//  252  473:aload_0         
	//  253  474:aload           23
	//  254  476:iload_1         
	//  255  477:aload_0         
	//  256  478:aload           23
	//  257  480:invokevirtual   #377 <Method int getLocationOffset(View)>
	//  258  483:iadd            
	//  259  484:iload           5
	//  260  486:iload           15
	//  261  488:iload           17
	//  262  490:invokespecial   #379 <Method void setChildFrame(View, int, int, int, int)>
				i1 = layoutparams.rightMargin;
	//  263  493:aload           24
	//  264  495:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  265  498:istore          5
				l1 = getNextLocationOffset(view);
	//  266  500:aload_0         
	//  267  501:aload           23
	//  268  503:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  269  506:istore          9
				l += getChildrenSkipCount(view, l3);
	//  270  508:iload           4
	//  271  510:aload_0         
	//  272  511:aload           23
	//  273  513:iload           16
	//  274  515:invokevirtual   #383 <Method int getChildrenSkipCount(View, int)>
	//  275  518:iadd            
	//  276  519:istore          4
				i += k3 + i1 + l1;
	//  277  521:iload_1         
	//  278  522:iload           15
	//  279  524:iload           5
	//  280  526:iadd            
	//  281  527:iload           9
	//  282  529:iadd            
	//  283  530:iadd            
	//  284  531:istore_1        
			} else
	//* 285  532:goto            541
			{
				flag2 = true;
	//  286  535:iconst_1        
	//  287  536:istore          18
			}
		}

	//  288  538:goto            211
	//  289  541:iload           4
	//  290  543:iconst_1        
	//  291  544:iadd            
	//  292  545:istore          4
	//* 293  547:goto            172
	//  294  550:return          
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
		i = mGravity & 0x70;
	//   16   29:aload_0         
	//   17   30:getfield        #68  <Field int mGravity>
	//   18   33:bipush          112
	//   19   35:iand            
	//   20   36:istore_1        
		j2 = mGravity;
	//   21   37:aload_0         
	//   22   38:getfield        #68  <Field int mGravity>
	//   23   41:istore          10
		if(i != 16)
	//*  24   43:iload_1         
	//*  25   44:bipush          16
	//*  26   46:icmpeq          81
		{
			if(i != 80)
	//*  27   49:iload_1         
	//*  28   50:bipush          80
	//*  29   52:icmpeq          63
				i = getPaddingTop();
	//   30   55:aload_0         
	//   31   56:invokevirtual   #280 <Method int getPaddingTop()>
	//   32   59:istore_1        
			else
	//*  33   60:goto            100
				i = (getPaddingTop() + l) - j - mTotalLength;
	//   34   63:aload_0         
	//   35   64:invokevirtual   #280 <Method int getPaddingTop()>
	//   36   67:iload           4
	//   37   69:iadd            
	//   38   70:iload_2         
	//   39   71:isub            
	//   40   72:aload_0         
	//   41   73:getfield        #328 <Field int mTotalLength>
	//   42   76:isub            
	//   43   77:istore_1        
		} else
	//*  44   78:goto            100
		{
			i = getPaddingTop();
	//   45   81:aload_0         
	//   46   82:invokevirtual   #280 <Method int getPaddingTop()>
	//   47   85:istore_1        
			i = (l - j - mTotalLength) / 2 + i;
	//   48   86:iload           4
	//   49   88:iload_2         
	//   50   89:isub            
	//   51   90:aload_0         
	//   52   91:getfield        #328 <Field int mTotalLength>
	//   53   94:isub            
	//   54   95:iconst_2        
	//   55   96:idiv            
	//   56   97:iload_1         
	//   57   98:iadd            
	//   58   99:istore_1        
		}
		j = 0;
	//   59  100:iconst_0        
	//   60  101:istore_2        
_L7:
		if(j >= i2) goto _L2; else goto _L1
	//   61  102:iload_2         
	//   62  103:iload           9
	//   63  105:icmpge          363
_L1:
		View view = getVirtualChildAt(j);
	//   64  108:aload_0         
	//   65  109:iload_2         
	//   66  110:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   67  113:astore          13
		if(view != null) goto _L4; else goto _L3
	//   68  115:aload           13
	//   69  117:ifnonnull       133
_L3:
		k = i + measureNullChild(j);
	//   70  120:iload_1         
	//   71  121:aload_0         
	//   72  122:iload_2         
	//   73  123:invokevirtual   #372 <Method int measureNullChild(int)>
	//   74  126:iadd            
	//   75  127:istore_3        
_L6:
		i = k;
	//   76  128:iload_3         
	//   77  129:istore_1        
		continue; /* Loop/switch isn't completed */
	//   78  130:goto            356
_L4:
		k = i;
	//   79  133:iload_1         
	//   80  134:istore_3        
		if(view.getVisibility() == 8) goto _L6; else goto _L5
	//   81  135:aload           13
	//   82  137:invokevirtual   #174 <Method int View.getVisibility()>
	//   83  140:bipush          8
	//   84  142:icmpeq          128
_L5:
		int l2 = view.getMeasuredWidth();
	//   85  145:aload           13
	//   86  147:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//   87  150:istore          12
		int k2 = view.getMeasuredHeight();
	//   88  152:aload           13
	//   89  154:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//   90  157:istore          11
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   91  159:aload           13
	//   92  161:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   93  164:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   94  167:astore          14
		l = layoutparams.gravity;
	//   95  169:aload           14
	//   96  171:getfield        #375 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//   97  174:istore          4
		k = l;
	//   98  176:iload           4
	//   99  178:istore_3        
		if(l < 0)
	//* 100  179:iload           4
	//* 101  181:ifge            191
			k = j2 & 0x800007;
	//  102  184:iload           10
	//  103  186:ldc2            #358 <Int 0x800007>
	//  104  189:iand            
	//  105  190:istore_3        
		k = GravityCompat.getAbsoluteGravity(k, ViewCompat.getLayoutDirection(((View) (this)))) & 7;
	//  106  191:iload_3         
	//  107  192:aload_0         
	//  108  193:invokestatic    #363 <Method int ViewCompat.getLayoutDirection(View)>
	//  109  196:invokestatic    #368 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//  110  199:bipush          7
	//  111  201:iand            
	//  112  202:istore_3        
		if(k != 1)
	//* 113  203:iload_3         
	//* 114  204:iconst_1        
	//* 115  205:icmpeq          243
		{
			if(k != 5)
	//* 116  208:iload_3         
	//* 117  209:iconst_5        
	//* 118  210:icmpeq          225
				k = layoutparams.leftMargin + i1;
	//  119  213:aload           14
	//  120  215:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  121  218:iload           5
	//  122  220:iadd            
	//  123  221:istore_3        
			else
	//* 124  222:goto            275
				k = j1 - k1 - l2 - layoutparams.rightMargin;
	//  125  225:iload           6
	//  126  227:iload           7
	//  127  229:isub            
	//  128  230:iload           12
	//  129  232:isub            
	//  130  233:aload           14
	//  131  235:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  132  238:isub            
	//  133  239:istore_3        
		} else
	//* 134  240:goto            222
		{
			k = ((j1 - i1 - l1 - l2) / 2 + i1 + layoutparams.leftMargin) - layoutparams.rightMargin;
	//  135  243:iload           6
	//  136  245:iload           5
	//  137  247:isub            
	//  138  248:iload           8
	//  139  250:isub            
	//  140  251:iload           12
	//  141  253:isub            
	//  142  254:iconst_2        
	//  143  255:idiv            
	//  144  256:iload           5
	//  145  258:iadd            
	//  146  259:aload           14
	//  147  261:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  148  264:iadd            
	//  149  265:aload           14
	//  150  267:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  151  270:isub            
	//  152  271:istore_3        
		}
	//* 153  272:goto            222
		l = i;
	//  154  275:iload_1         
	//  155  276:istore          4
		if(hasDividerBeforeChildAt(j))
	//* 156  278:aload_0         
	//* 157  279:iload_2         
	//* 158  280:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 159  283:ifeq            294
			l = i + mDividerHeight;
	//  160  286:iload_1         
	//  161  287:aload_0         
	//  162  288:getfield        #252 <Field int mDividerHeight>
	//  163  291:iadd            
	//  164  292:istore          4
		i = l + layoutparams.topMargin;
	//  165  294:iload           4
	//  166  296:aload           14
	//  167  298:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  168  301:iadd            
	//  169  302:istore_1        
		setChildFrame(view, k, i + getLocationOffset(view), l2, k2);
	//  170  303:aload_0         
	//  171  304:aload           13
	//  172  306:iload_3         
	//  173  307:iload_1         
	//  174  308:aload_0         
	//  175  309:aload           13
	//  176  311:invokevirtual   #377 <Method int getLocationOffset(View)>
	//  177  314:iadd            
	//  178  315:iload           12
	//  179  317:iload           11
	//  180  319:invokespecial   #379 <Method void setChildFrame(View, int, int, int, int)>
		k = layoutparams.bottomMargin;
	//  181  322:aload           14
	//  182  324:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  183  327:istore_3        
		l = getNextLocationOffset(view);
	//  184  328:aload_0         
	//  185  329:aload           13
	//  186  331:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  187  334:istore          4
		j += getChildrenSkipCount(view, j);
	//  188  336:iload_2         
	//  189  337:aload_0         
	//  190  338:aload           13
	//  191  340:iload_2         
	//  192  341:invokevirtual   #383 <Method int getChildrenSkipCount(View, int)>
	//  193  344:iadd            
	//  194  345:istore_2        
		i += k2 + k + l;
	//  195  346:iload_1         
	//  196  347:iload           11
	//  197  349:iload_3         
	//  198  350:iadd            
	//  199  351:iload           4
	//  200  353:iadd            
	//  201  354:iadd            
	//  202  355:istore_1        
		j++;
	//  203  356:iload_2         
	//  204  357:iconst_1        
	//  205  358:iadd            
	//  206  359:istore_2        
		  goto _L7
	//* 207  360:goto            102
_L2:
	//  208  363:return          
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
		int k2;
		int l2;
		int i3;
		int j3;
		int k3;
		int j4;
		boolean flag1;
		int i8;
		int j8;
		int k8;
		boolean flag2;
		boolean flag3;
		Object obj;
		int ai[];
		mTotalLength = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #328 <Field int mTotalLength>
		i8 = getVirtualChildCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #206 <Method int getVirtualChildCount()>
	//    5    9:istore          20
		k8 = android.view.View.MeasureSpec.getMode(i);
	//    6   11:iload_1         
	//    7   12:invokestatic    #390 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   15:istore          22
		j8 = android.view.View.MeasureSpec.getMode(j);
	//    9   17:iload_2         
	//   10   18:invokestatic    #390 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   11   21:istore          21
		if(mMaxAscent == null || mMaxDescent == null)
	//*  12   23:aload_0         
	//*  13   24:getfield        #355 <Field int[] mMaxAscent>
	//*  14   27:ifnull          37
	//*  15   30:aload_0         
	//*  16   31:getfield        #357 <Field int[] mMaxDescent>
	//*  17   34:ifnonnull       51
		{
			mMaxAscent = new int[4];
	//   18   37:aload_0         
	//   19   38:iconst_4        
	//   20   39:newarray        int[]
	//   21   41:putfield        #355 <Field int[] mMaxAscent>
			mMaxDescent = new int[4];
	//   22   44:aload_0         
	//   23   45:iconst_4        
	//   24   46:newarray        int[]
	//   25   48:putfield        #357 <Field int[] mMaxDescent>
		}
		ai = mMaxAscent;
	//   26   51:aload_0         
	//   27   52:getfield        #355 <Field int[] mMaxAscent>
	//   28   55:astore          29
		obj = ((Object) (mMaxDescent));
	//   29   57:aload_0         
	//   30   58:getfield        #357 <Field int[] mMaxDescent>
	//   31   61:astore          26
		ai[3] = -1;
	//   32   63:aload           29
	//   33   65:iconst_3        
	//   34   66:iconst_m1       
	//   35   67:iastore         
		ai[2] = -1;
	//   36   68:aload           29
	//   37   70:iconst_2        
	//   38   71:iconst_m1       
	//   39   72:iastore         
		ai[1] = -1;
	//   40   73:aload           29
	//   41   75:iconst_1        
	//   42   76:iconst_m1       
	//   43   77:iastore         
		ai[0] = -1;
	//   44   78:aload           29
	//   45   80:iconst_0        
	//   46   81:iconst_m1       
	//   47   82:iastore         
		obj[3] = -1;
	//   48   83:aload           26
	//   49   85:iconst_3        
	//   50   86:iconst_m1       
	//   51   87:iastore         
		obj[2] = -1;
	//   52   88:aload           26
	//   53   90:iconst_2        
	//   54   91:iconst_m1       
	//   55   92:iastore         
		obj[1] = -1;
	//   56   93:aload           26
	//   57   95:iconst_1        
	//   58   96:iconst_m1       
	//   59   97:iastore         
		obj[0] = -1;
	//   60   98:aload           26
	//   61  100:iconst_0        
	//   62  101:iconst_m1       
	//   63  102:iastore         
		flag2 = mBaselineAligned;
	//   64  103:aload_0         
	//   65  104:getfield        #61  <Field boolean mBaselineAligned>
	//   66  107:istore          24
		flag3 = mUseLargestChild;
	//   67  109:aload_0         
	//   68  110:getfield        #125 <Field boolean mUseLargestChild>
	//   69  113:istore          25
		j4 = 0x40000000;
	//   70  115:ldc1            #160 <Int 0x40000000>
	//   71  117:istore          14
		if(k8 == 0x40000000)
	//*  72  119:iload           22
	//*  73  121:ldc1            #160 <Int 0x40000000>
	//*  74  123:icmpne          132
			flag1 = true;
	//   75  126:iconst_1        
	//   76  127:istore          15
		else
	//*  77  129:goto            135
			flag1 = false;
	//   78  132:iconst_0        
	//   79  133:istore          15
		j1 = 0;
	//   80  135:iconst_0        
	//   81  136:istore          8
		i1 = j1;
	//   82  138:iload           8
	//   83  140:istore          7
		i3 = i1;
	//   84  142:iload           7
	//   85  144:istore          11
		k3 = i3;
	//   86  146:iload           11
	//   87  148:istore          13
		l = k3;
	//   88  150:iload           13
	//   89  152:istore          6
		l2 = l;
	//   90  154:iload           6
	//   91  156:istore          10
		j3 = l2;
	//   92  158:iload           10
	//   93  160:istore          12
		k2 = j3;
	//   94  162:iload           12
	//   95  164:istore          9
		k = 1;
	//   96  166:iconst_1        
	//   97  167:istore          5
		f = 0.0F;
	//   98  169:fconst_0        
	//   99  170:fstore_3        
_L7:
		if(j1 >= i8) goto _L2; else goto _L1
	//  100  171:iload           8
	//  101  173:iload           20
	//  102  175:icmpge          892
_L1:
		View view = getVirtualChildAt(j1);
	//  103  178:aload_0         
	//  104  179:iload           8
	//  105  181:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  106  184:astore          27
		if(view != null) goto _L4; else goto _L3
	//  107  186:aload           27
	//  108  188:ifnonnull       221
_L3:
		mTotalLength = mTotalLength + measureNullChild(j1);
	//  109  191:aload_0         
	//  110  192:aload_0         
	//  111  193:getfield        #328 <Field int mTotalLength>
	//  112  196:aload_0         
	//  113  197:iload           8
	//  114  199:invokevirtual   #372 <Method int measureNullChild(int)>
	//  115  202:iadd            
	//  116  203:putfield        #328 <Field int mTotalLength>
_L6:
		int k5 = j4;
	//  117  206:iload           14
	//  118  208:istore          16
		j4 = j1;
	//  119  210:iload           8
	//  120  212:istore          14
		j1 = k5;
	//  121  214:iload           16
	//  122  216:istore          8
		break MISSING_BLOCK_LABEL_875;
	//  123  218:goto            875
_L4:
		if(view.getVisibility() != 8)
			break; /* Loop/switch isn't completed */
	//  124  221:aload           27
	//  125  223:invokevirtual   #174 <Method int View.getVisibility()>
	//  126  226:bipush          8
	//  127  228:icmpne          247
		j1 += getChildrenSkipCount(view, j1);
	//  128  231:iload           8
	//  129  233:aload_0         
	//  130  234:aload           27
	//  131  236:iload           8
	//  132  238:invokevirtual   #383 <Method int getChildrenSkipCount(View, int)>
	//  133  241:iadd            
	//  134  242:istore          8
		if(true) goto _L6; else goto _L5
	//  135  244:goto            206
_L5:
		LayoutParams layoutparams2;
label0:
		{
			if(hasDividerBeforeChildAt(j1))
	//* 136  247:aload_0         
	//* 137  248:iload           8
	//* 138  250:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 139  253:ifeq            269
				mTotalLength = mTotalLength + mDividerWidth;
	//  140  256:aload_0         
	//  141  257:aload_0         
	//  142  258:getfield        #328 <Field int mTotalLength>
	//  143  261:aload_0         
	//  144  262:getfield        #230 <Field int mDividerWidth>
	//  145  265:iadd            
	//  146  266:putfield        #328 <Field int mTotalLength>
			layoutparams2 = (LayoutParams)view.getLayoutParams();
	//  147  269:aload           27
	//  148  271:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  149  274:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  150  277:astore          30
			f += layoutparams2.weight;
	//  151  279:fload_3         
	//  152  280:aload           30
	//  153  282:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  154  285:fadd            
	//  155  286:fstore_3        
			if(k8 == j4 && layoutparams2.width == 0 && layoutparams2.weight > 0.0F)
	//* 156  287:iload           22
	//* 157  289:iload           14
	//* 158  291:icmpne          403
	//* 159  294:aload           30
	//* 160  296:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 161  299:ifne            403
	//* 162  302:aload           30
	//* 163  304:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 164  307:fconst_0        
	//* 165  308:fcmpl           
	//* 166  309:ifle            403
			{
				if(flag1)
	//* 167  312:iload           15
	//* 168  314:ifeq            340
				{
					mTotalLength = mTotalLength + (layoutparams2.leftMargin + layoutparams2.rightMargin);
	//  169  317:aload_0         
	//  170  318:aload_0         
	//  171  319:getfield        #328 <Field int mTotalLength>
	//  172  322:aload           30
	//  173  324:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  174  327:aload           30
	//  175  329:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  176  332:iadd            
	//  177  333:iadd            
	//  178  334:putfield        #328 <Field int mTotalLength>
				} else
	//* 179  337:goto            369
				{
					j4 = mTotalLength;
	//  180  340:aload_0         
	//  181  341:getfield        #328 <Field int mTotalLength>
	//  182  344:istore          14
					mTotalLength = Math.max(j4, layoutparams2.leftMargin + j4 + layoutparams2.rightMargin);
	//  183  346:aload_0         
	//  184  347:iload           14
	//  185  349:aload           30
	//  186  351:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  187  354:iload           14
	//  188  356:iadd            
	//  189  357:aload           30
	//  190  359:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  191  362:iadd            
	//  192  363:invokestatic    #398 <Method int Math.max(int, int)>
	//  193  366:putfield        #328 <Field int mTotalLength>
				}
				if(flag2)
	//* 194  369:iload           24
	//* 195  371:ifeq            397
				{
					j4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//  196  374:iconst_0        
	//  197  375:iconst_0        
	//  198  376:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  199  379:istore          14
					view.measure(j4, j4);
	//  200  381:aload           27
	//  201  383:iload           14
	//  202  385:iload           14
	//  203  387:invokevirtual   #401 <Method void View.measure(int, int)>
					j4 = i1;
	//  204  390:iload           7
	//  205  392:istore          14
				} else
	//* 206  394:goto            591
				{
					k3 = 1;
	//  207  397:iconst_1        
	//  208  398:istore          13
					break label0;
	//  209  400:goto            595
				}
			} else
			{
				if(layoutparams2.width == 0 && layoutparams2.weight > 0.0F)
	//* 210  403:aload           30
	//* 211  405:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 212  408:ifne            434
	//* 213  411:aload           30
	//* 214  413:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 215  416:fconst_0        
	//* 216  417:fcmpl           
	//* 217  418:ifle            434
				{
					layoutparams2.width = -2;
	//  218  421:aload           30
	//  219  423:bipush          -2
	//  220  425:putfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
					j4 = 0;
	//  221  428:iconst_0        
	//  222  429:istore          14
				} else
	//* 223  431:goto            439
				{
					j4 = 0x80000000;
	//  224  434:ldc2            #402 <Int 0x80000000>
	//  225  437:istore          14
				}
				int l5;
				if(f == 0.0F)
	//* 226  439:fload_3         
	//* 227  440:fconst_0        
	//* 228  441:fcmpl           
	//* 229  442:ifne            454
					l5 = mTotalLength;
	//  230  445:aload_0         
	//  231  446:getfield        #328 <Field int mTotalLength>
	//  232  449:istore          16
				else
	//* 233  451:goto            457
					l5 = 0;
	//  234  454:iconst_0        
	//  235  455:istore          16
				View view3 = view;
	//  236  457:aload           27
	//  237  459:astore          28
				measureChildBeforeLayout(view, j1, i, l5, j, 0);
	//  238  461:aload_0         
	//  239  462:aload           27
	//  240  464:iload           8
	//  241  466:iload_1         
	//  242  467:iload           16
	//  243  469:iload_2         
	//  244  470:iconst_0        
	//  245  471:invokevirtual   #404 <Method void measureChildBeforeLayout(View, int, int, int, int, int)>
				if(j4 != 0x80000000)
	//* 246  474:iload           14
	//* 247  476:ldc2            #402 <Int 0x80000000>
	//* 248  479:icmpeq          489
					layoutparams2.width = j4;
	//  249  482:aload           30
	//  250  484:iload           14
	//  251  486:putfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
				l5 = view3.getMeasuredWidth();
	//  252  489:aload           28
	//  253  491:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  254  494:istore          16
				if(flag1)
	//* 255  496:iload           15
	//* 256  498:ifeq            534
				{
					mTotalLength = mTotalLength + (layoutparams2.leftMargin + l5 + layoutparams2.rightMargin + getNextLocationOffset(view3));
	//  257  501:aload_0         
	//  258  502:aload_0         
	//  259  503:getfield        #328 <Field int mTotalLength>
	//  260  506:aload           30
	//  261  508:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  262  511:iload           16
	//  263  513:iadd            
	//  264  514:aload           30
	//  265  516:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  266  519:iadd            
	//  267  520:aload_0         
	//  268  521:aload           28
	//  269  523:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  270  526:iadd            
	//  271  527:iadd            
	//  272  528:putfield        #328 <Field int mTotalLength>
				} else
	//* 273  531:goto            573
				{
					j4 = mTotalLength;
	//  274  534:aload_0         
	//  275  535:getfield        #328 <Field int mTotalLength>
	//  276  538:istore          14
					mTotalLength = Math.max(j4, j4 + l5 + layoutparams2.leftMargin + layoutparams2.rightMargin + getNextLocationOffset(view3));
	//  277  540:aload_0         
	//  278  541:iload           14
	//  279  543:iload           14
	//  280  545:iload           16
	//  281  547:iadd            
	//  282  548:aload           30
	//  283  550:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  284  553:iadd            
	//  285  554:aload           30
	//  286  556:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  287  559:iadd            
	//  288  560:aload_0         
	//  289  561:aload           28
	//  290  563:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  291  566:iadd            
	//  292  567:invokestatic    #398 <Method int Math.max(int, int)>
	//  293  570:putfield        #328 <Field int mTotalLength>
				}
				j4 = i1;
	//  294  573:iload           7
	//  295  575:istore          14
				if(flag3)
	//* 296  577:iload           25
	//* 297  579:ifeq            591
					j4 = Math.max(l5, i1);
	//  298  582:iload           16
	//  299  584:iload           7
	//  300  586:invokestatic    #398 <Method int Math.max(int, int)>
	//  301  589:istore          14
			}
			i1 = j4;
	//  302  591:iload           14
	//  303  593:istore          7
		}
		int k7 = j1;
	//  304  595:iload           8
	//  305  597:istore          18
		int i7 = 0x40000000;
	//  306  599:ldc1            #160 <Int 0x40000000>
	//  307  601:istore          17
		if(j8 != 0x40000000 && layoutparams2.height == -1)
	//* 308  603:iload           21
	//* 309  605:ldc1            #160 <Int 0x40000000>
	//* 310  607:icmpeq          629
	//* 311  610:aload           30
	//* 312  612:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 313  615:iconst_m1       
	//* 314  616:icmpne          629
		{
			j1 = 1;
	//  315  619:iconst_1        
	//  316  620:istore          8
			k2 = j1;
	//  317  622:iload           8
	//  318  624:istore          9
		} else
	//* 319  626:goto            632
		{
			j1 = 0;
	//  320  629:iconst_0        
	//  321  630:istore          8
		}
		j4 = layoutparams2.topMargin + layoutparams2.bottomMargin;
	//  322  632:aload           30
	//  323  634:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  324  637:aload           30
	//  325  639:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  326  642:iadd            
	//  327  643:istore          14
		int i6 = view.getMeasuredHeight() + j4;
	//  328  645:aload           27
	//  329  647:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  330  650:iload           14
	//  331  652:iadd            
	//  332  653:istore          16
		int l7 = View.combineMeasuredStates(j3, view.getMeasuredState());
	//  333  655:iload           12
	//  334  657:aload           27
	//  335  659:invokevirtual   #407 <Method int View.getMeasuredState()>
	//  336  662:invokestatic    #410 <Method int View.combineMeasuredStates(int, int)>
	//  337  665:istore          19
		if(flag2)
	//* 338  667:iload           24
	//* 339  669:ifeq            756
		{
			int l8 = view.getBaseline();
	//  340  672:aload           27
	//  341  674:invokevirtual   #322 <Method int View.getBaseline()>
	//  342  677:istore          23
			if(l8 != -1)
	//* 343  679:iload           23
	//* 344  681:iconst_m1       
	//* 345  682:icmpeq          756
			{
				if(layoutparams2.gravity < 0)
	//* 346  685:aload           30
	//* 347  687:getfield        #375 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//* 348  690:ifge            702
					j3 = mGravity;
	//  349  693:aload_0         
	//  350  694:getfield        #68  <Field int mGravity>
	//  351  697:istore          12
				else
	//* 352  699:goto            709
					j3 = layoutparams2.gravity;
	//  353  702:aload           30
	//  354  704:getfield        #375 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//  355  707:istore          12
				j3 = ((j3 & 0x70) >> 4 & -2) >> 1;
	//  356  709:iload           12
	//  357  711:bipush          112
	//  358  713:iand            
	//  359  714:iconst_4        
	//  360  715:ishr            
	//  361  716:bipush          -2
	//  362  718:iand            
	//  363  719:iconst_1        
	//  364  720:ishr            
	//  365  721:istore          12
				ai[j3] = Math.max(ai[j3], l8);
	//  366  723:aload           29
	//  367  725:iload           12
	//  368  727:aload           29
	//  369  729:iload           12
	//  370  731:iaload          
	//  371  732:iload           23
	//  372  734:invokestatic    #398 <Method int Math.max(int, int)>
	//  373  737:iastore         
				obj[j3] = Math.max(obj[j3], i6 - l8);
	//  374  738:aload           26
	//  375  740:iload           12
	//  376  742:aload           26
	//  377  744:iload           12
	//  378  746:iaload          
	//  379  747:iload           16
	//  380  749:iload           23
	//  381  751:isub            
	//  382  752:invokestatic    #398 <Method int Math.max(int, int)>
	//  383  755:iastore         
			}
		}
		i3 = Math.max(i3, i6);
	//  384  756:iload           11
	//  385  758:iload           16
	//  386  760:invokestatic    #398 <Method int Math.max(int, int)>
	//  387  763:istore          11
		if(k && layoutparams2.height == -1)
	//* 388  765:iload           5
	//* 389  767:ifeq            785
	//* 390  770:aload           30
	//* 391  772:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 392  775:iconst_m1       
	//* 393  776:icmpne          785
			k = 1;
	//  394  779:iconst_1        
	//  395  780:istore          5
		else
	//* 396  782:goto            788
			k = 0;
	//  397  785:iconst_0        
	//  398  786:istore          5
		if(layoutparams2.weight > 0.0F)
	//* 399  788:aload           30
	//* 400  790:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 401  793:fconst_0        
	//* 402  794:fcmpl           
	//* 403  795:ifle            825
		{
			if(j1 == 0)
	//* 404  798:iload           8
	//* 405  800:ifeq            806
	//* 406  803:goto            813
				j4 = i6;
	//  407  806:iload           16
	//  408  808:istore          14
	//* 409  810:goto            803
			j1 = Math.max(l2, j4);
	//  410  813:iload           10
	//  411  815:iload           14
	//  412  817:invokestatic    #398 <Method int Math.max(int, int)>
	//  413  820:istore          8
		} else
	//* 414  822:goto            850
		{
			if(j1 != 0)
	//* 415  825:iload           8
	//* 416  827:ifeq            834
				i6 = j4;
	//  417  830:iload           14
	//  418  832:istore          16
			l = Math.max(l, i6);
	//  419  834:iload           6
	//  420  836:iload           16
	//  421  838:invokestatic    #398 <Method int Math.max(int, int)>
	//  422  841:istore          6
			j1 = l2;
	//  423  843:iload           10
	//  424  845:istore          8
		}
	//* 425  847:goto            822
		j4 = getChildrenSkipCount(view, k7) + k7;
	//  426  850:aload_0         
	//  427  851:aload           27
	//  428  853:iload           18
	//  429  855:invokevirtual   #383 <Method int getChildrenSkipCount(View, int)>
	//  430  858:iload           18
	//  431  860:iadd            
	//  432  861:istore          14
		j3 = l7;
	//  433  863:iload           19
	//  434  865:istore          12
		l2 = j1;
	//  435  867:iload           8
	//  436  869:istore          10
		j1 = i7;
	//  437  871:iload           17
	//  438  873:istore          8
		int j6 = j1;
	//  439  875:iload           8
	//  440  877:istore          16
		j1 = j4 + 1;
	//  441  879:iload           14
	//  442  881:iconst_1        
	//  443  882:iadd            
	//  444  883:istore          8
		j4 = j6;
	//  445  885:iload           16
	//  446  887:istore          14
		  goto _L7
	//* 447  889:goto            171
_L2:
label1:
		{
			int k1 = i3;
	//  448  892:iload           11
	//  449  894:istore          8
			if(mTotalLength > 0 && hasDividerBeforeChildAt(i8))
	//* 450  896:aload_0         
	//* 451  897:getfield        #328 <Field int mTotalLength>
	//* 452  900:ifle            925
	//* 453  903:aload_0         
	//* 454  904:iload           20
	//* 455  906:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 456  909:ifeq            925
				mTotalLength = mTotalLength + mDividerWidth;
	//  457  912:aload_0         
	//  458  913:aload_0         
	//  459  914:getfield        #328 <Field int mTotalLength>
	//  460  917:aload_0         
	//  461  918:getfield        #230 <Field int mDividerWidth>
	//  462  921:iadd            
	//  463  922:putfield        #328 <Field int mTotalLength>
			if(ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
	//* 464  925:aload           29
	//* 465  927:iconst_1        
	//* 466  928:iaload          
	//* 467  929:iconst_m1       
	//* 468  930:icmpne          961
	//* 469  933:aload           29
	//* 470  935:iconst_0        
	//* 471  936:iaload          
	//* 472  937:iconst_m1       
	//* 473  938:icmpne          961
	//* 474  941:aload           29
	//* 475  943:iconst_2        
	//* 476  944:iaload          
	//* 477  945:iconst_m1       
	//* 478  946:icmpne          961
			{
				i3 = k1;
	//  479  949:iload           8
	//  480  951:istore          11
				if(ai[3] == -1)
					break label1;
	//  481  953:aload           29
	//  482  955:iconst_3        
	//  483  956:iaload          
	//  484  957:iconst_m1       
	//  485  958:icmpeq          1019
			}
			i3 = Math.max(k1, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(obj[3], Math.max(obj[0], Math.max(obj[1], obj[2]))));
	//  486  961:iload           8
	//  487  963:aload           29
	//  488  965:iconst_3        
	//  489  966:iaload          
	//  490  967:aload           29
	//  491  969:iconst_0        
	//  492  970:iaload          
	//  493  971:aload           29
	//  494  973:iconst_1        
	//  495  974:iaload          
	//  496  975:aload           29
	//  497  977:iconst_2        
	//  498  978:iaload          
	//  499  979:invokestatic    #398 <Method int Math.max(int, int)>
	//  500  982:invokestatic    #398 <Method int Math.max(int, int)>
	//  501  985:invokestatic    #398 <Method int Math.max(int, int)>
	//  502  988:aload           26
	//  503  990:iconst_3        
	//  504  991:iaload          
	//  505  992:aload           26
	//  506  994:iconst_0        
	//  507  995:iaload          
	//  508  996:aload           26
	//  509  998:iconst_1        
	//  510  999:iaload          
	//  511 1000:aload           26
	//  512 1002:iconst_2        
	//  513 1003:iaload          
	//  514 1004:invokestatic    #398 <Method int Math.max(int, int)>
	//  515 1007:invokestatic    #398 <Method int Math.max(int, int)>
	//  516 1010:invokestatic    #398 <Method int Math.max(int, int)>
	//  517 1013:iadd            
	//  518 1014:invokestatic    #398 <Method int Math.max(int, int)>
	//  519 1017:istore          11
		}
		boolean flag;
		int j7;
label2:
		{
			int j2;
label3:
			{
				if(flag3 && (k8 == 0x80000000 || k8 == 0))
	//* 520 1019:iload           25
	//* 521 1021:ifeq            1205
	//* 522 1024:iload           22
	//* 523 1026:ldc2            #402 <Int 0x80000000>
	//* 524 1029:icmpeq          1037
	//* 525 1032:iload           22
	//* 526 1034:ifne            1205
				{
					mTotalLength = 0;
	//  527 1037:aload_0         
	//  528 1038:iconst_0        
	//  529 1039:putfield        #328 <Field int mTotalLength>
					for(int l1 = 0; l1 < i8; l1++)
	//* 530 1042:iconst_0        
	//* 531 1043:istore          8
	//* 532 1045:iload           8
	//* 533 1047:iload           20
	//* 534 1049:icmpge          1205
					{
						View view1 = getVirtualChildAt(l1);
	//  535 1052:aload_0         
	//  536 1053:iload           8
	//  537 1055:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  538 1058:astore          27
						if(view1 == null)
	//* 539 1060:aload           27
	//* 540 1062:ifnonnull       1083
						{
							mTotalLength = mTotalLength + measureNullChild(l1);
	//  541 1065:aload_0         
	//  542 1066:aload_0         
	//  543 1067:getfield        #328 <Field int mTotalLength>
	//  544 1070:aload_0         
	//  545 1071:iload           8
	//  546 1073:invokevirtual   #372 <Method int measureNullChild(int)>
	//  547 1076:iadd            
	//  548 1077:putfield        #328 <Field int mTotalLength>
							continue;
	//  549 1080:goto            1106
						}
						if(view1.getVisibility() == 8)
	//* 550 1083:aload           27
	//* 551 1085:invokevirtual   #174 <Method int View.getVisibility()>
	//* 552 1088:bipush          8
	//* 553 1090:icmpne          1109
						{
							l1 += getChildrenSkipCount(view1, l1);
	//  554 1093:iload           8
	//  555 1095:aload_0         
	//  556 1096:aload           27
	//  557 1098:iload           8
	//  558 1100:invokevirtual   #383 <Method int getChildrenSkipCount(View, int)>
	//  559 1103:iadd            
	//  560 1104:istore          8
							continue;
	//  561 1106:goto            1196
						}
						LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
	//  562 1109:aload           27
	//  563 1111:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  564 1114:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  565 1117:astore          28
						if(flag1)
	//* 566 1119:iload           15
	//* 567 1121:ifeq            1157
						{
							mTotalLength = mTotalLength + (layoutparams.leftMargin + i1 + layoutparams.rightMargin + getNextLocationOffset(view1));
	//  568 1124:aload_0         
	//  569 1125:aload_0         
	//  570 1126:getfield        #328 <Field int mTotalLength>
	//  571 1129:aload           28
	//  572 1131:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  573 1134:iload           7
	//  574 1136:iadd            
	//  575 1137:aload           28
	//  576 1139:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  577 1142:iadd            
	//  578 1143:aload_0         
	//  579 1144:aload           27
	//  580 1146:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  581 1149:iadd            
	//  582 1150:iadd            
	//  583 1151:putfield        #328 <Field int mTotalLength>
						} else
	//* 584 1154:goto            1106
						{
							int k4 = mTotalLength;
	//  585 1157:aload_0         
	//  586 1158:getfield        #328 <Field int mTotalLength>
	//  587 1161:istore          14
							mTotalLength = Math.max(k4, k4 + i1 + layoutparams.leftMargin + layoutparams.rightMargin + getNextLocationOffset(view1));
	//  588 1163:aload_0         
	//  589 1164:iload           14
	//  590 1166:iload           14
	//  591 1168:iload           7
	//  592 1170:iadd            
	//  593 1171:aload           28
	//  594 1173:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  595 1176:iadd            
	//  596 1177:aload           28
	//  597 1179:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  598 1182:iadd            
	//  599 1183:aload_0         
	//  600 1184:aload           27
	//  601 1186:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  602 1189:iadd            
	//  603 1190:invokestatic    #398 <Method int Math.max(int, int)>
	//  604 1193:putfield        #328 <Field int mTotalLength>
						}
					}

	//  605 1196:iload           8
	//  606 1198:iconst_1        
	//  607 1199:iadd            
	//  608 1200:istore          8
				}
	//* 609 1202:goto            1045
				mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
	//  610 1205:aload_0         
	//  611 1206:aload_0         
	//  612 1207:getfield        #328 <Field int mTotalLength>
	//  613 1210:aload_0         
	//  614 1211:invokevirtual   #237 <Method int getPaddingLeft()>
	//  615 1214:aload_0         
	//  616 1215:invokevirtual   #243 <Method int getPaddingRight()>
	//  617 1218:iadd            
	//  618 1219:iadd            
	//  619 1220:putfield        #328 <Field int mTotalLength>
				j7 = View.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumWidth()), i, 0);
	//  620 1223:aload_0         
	//  621 1224:getfield        #328 <Field int mTotalLength>
	//  622 1227:aload_0         
	//  623 1228:invokevirtual   #413 <Method int getSuggestedMinimumWidth()>
	//  624 1231:invokestatic    #398 <Method int Math.max(int, int)>
	//  625 1234:iload_1         
	//  626 1235:iconst_0        
	//  627 1236:invokestatic    #417 <Method int View.resolveSizeAndState(int, int, int)>
	//  628 1239:istore          17
				int l4 = (0xffffff & j7) - mTotalLength;
	//  629 1241:ldc2            #418 <Int 0xffffff>
	//  630 1244:iload           17
	//  631 1246:iand            
	//  632 1247:aload_0         
	//  633 1248:getfield        #328 <Field int mTotalLength>
	//  634 1251:isub            
	//  635 1252:istore          14
				if(k3 == 0 && (l4 == 0 || f <= 0.0F))
	//* 636 1254:iload           13
	//* 637 1256:ifne            1388
	//* 638 1259:iload           14
	//* 639 1261:ifeq            1273
	//* 640 1264:fload_3         
	//* 641 1265:fconst_0        
	//* 642 1266:fcmpl           
	//* 643 1267:ifle            1273
	//* 644 1270:goto            1388
				{
					int i2 = Math.max(l, l2);
	//  645 1273:iload           6
	//  646 1275:iload           10
	//  647 1277:invokestatic    #398 <Method int Math.max(int, int)>
	//  648 1280:istore          8
					if(flag3 && k8 != 0x40000000)
	//* 649 1282:iload           25
	//* 650 1284:ifeq            1377
	//* 651 1287:iload           22
	//* 652 1289:ldc1            #160 <Int 0x40000000>
	//* 653 1291:icmpeq          1377
						for(l = 0; l < i8; l++)
	//* 654 1294:iconst_0        
	//* 655 1295:istore          6
	//* 656 1297:iload           6
	//* 657 1299:iload           20
	//* 658 1301:icmpge          1377
						{
							obj = ((Object) (getVirtualChildAt(l)));
	//  659 1304:aload_0         
	//  660 1305:iload           6
	//  661 1307:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  662 1310:astore          26
							if(obj != null && ((View) (obj)).getVisibility() != 8 && ((LayoutParams)((View) (obj)).getLayoutParams()).weight > 0.0F)
	//* 663 1312:aload           26
	//* 664 1314:ifnull          1368
	//* 665 1317:aload           26
	//* 666 1319:invokevirtual   #174 <Method int View.getVisibility()>
	//* 667 1322:bipush          8
	//* 668 1324:icmpne          1330
	//* 669 1327:goto            1368
	//* 670 1330:aload           26
	//* 671 1332:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 672 1335:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//* 673 1338:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 674 1341:fconst_0        
	//* 675 1342:fcmpl           
	//* 676 1343:ifle            1368
								((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(((View) (obj)).getMeasuredHeight(), 0x40000000));
	//  677 1346:aload           26
	//  678 1348:iload           7
	//  679 1350:ldc1            #160 <Int 0x40000000>
	//  680 1352:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  681 1355:aload           26
	//  682 1357:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  683 1360:ldc1            #160 <Int 0x40000000>
	//  684 1362:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  685 1365:invokevirtual   #401 <Method void View.measure(int, int)>
						}

	//  686 1368:iload           6
	//  687 1370:iconst_1        
	//  688 1371:iadd            
	//  689 1372:istore          6
	//* 690 1374:goto            1297
					l = i2;
	//  691 1377:iload           8
	//  692 1379:istore          6
					flag = ((boolean) (k));
	//  693 1381:iload           5
	//  694 1383:istore          7
					break label2;
	//  695 1385:goto            2117
				}
				if(mWeightSum > 0.0F)
	//* 696 1388:aload_0         
	//* 697 1389:getfield        #117 <Field float mWeightSum>
	//* 698 1392:fconst_0        
	//* 699 1393:fcmpl           
	//* 700 1394:ifle            1402
					f = mWeightSum;
	//  701 1397:aload_0         
	//  702 1398:getfield        #117 <Field float mWeightSum>
	//  703 1401:fstore_3        
				ai[3] = -1;
	//  704 1402:aload           29
	//  705 1404:iconst_3        
	//  706 1405:iconst_m1       
	//  707 1406:iastore         
				ai[2] = -1;
	//  708 1407:aload           29
	//  709 1409:iconst_2        
	//  710 1410:iconst_m1       
	//  711 1411:iastore         
				ai[1] = -1;
	//  712 1412:aload           29
	//  713 1414:iconst_1        
	//  714 1415:iconst_m1       
	//  715 1416:iastore         
				ai[0] = -1;
	//  716 1417:aload           29
	//  717 1419:iconst_0        
	//  718 1420:iconst_m1       
	//  719 1421:iastore         
				obj[3] = -1;
	//  720 1422:aload           26
	//  721 1424:iconst_3        
	//  722 1425:iconst_m1       
	//  723 1426:iastore         
				obj[2] = -1;
	//  724 1427:aload           26
	//  725 1429:iconst_2        
	//  726 1430:iconst_m1       
	//  727 1431:iastore         
				obj[1] = -1;
	//  728 1432:aload           26
	//  729 1434:iconst_1        
	//  730 1435:iconst_m1       
	//  731 1436:iastore         
				obj[0] = -1;
	//  732 1437:aload           26
	//  733 1439:iconst_0        
	//  734 1440:iconst_m1       
	//  735 1441:iastore         
				mTotalLength = 0;
	//  736 1442:aload_0         
	//  737 1443:iconst_0        
	//  738 1444:putfield        #328 <Field int mTotalLength>
				l2 = -1;
	//  739 1447:iconst_m1       
	//  740 1448:istore          10
				i3 = 0;
	//  741 1450:iconst_0        
	//  742 1451:istore          11
				flag = ((boolean) (k));
	//  743 1453:iload           5
	//  744 1455:istore          7
				j2 = l;
	//  745 1457:iload           6
	//  746 1459:istore          8
				k = j3;
	//  747 1461:iload           12
	//  748 1463:istore          5
				l = l4;
	//  749 1465:iload           14
	//  750 1467:istore          6
				for(j3 = i3; j3 < i8; j3++)
	//* 751 1469:iload           11
	//* 752 1471:istore          12
	//* 753 1473:iload           12
	//* 754 1475:iload           20
	//* 755 1477:icmpge          1993
				{
					View view2 = getVirtualChildAt(j3);
	//  756 1480:aload_0         
	//  757 1481:iload           12
	//  758 1483:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  759 1486:astore          27
					if(view2 == null || view2.getVisibility() == 8)
	//* 760 1488:aload           27
	//* 761 1490:ifnull          1984
	//* 762 1493:aload           27
	//* 763 1495:invokevirtual   #174 <Method int View.getVisibility()>
	//* 764 1498:bipush          8
	//* 765 1500:icmpne          1506
						continue;
	//  766 1503:goto            1984
					LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
	//  767 1506:aload           27
	//  768 1508:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  769 1511:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  770 1514:astore          28
					float f1 = layoutparams1.weight;
	//  771 1516:aload           28
	//  772 1518:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  773 1521:fstore          4
					if(f1 > 0.0F)
	//* 774 1523:fload           4
	//* 775 1525:fconst_0        
	//* 776 1526:fcmpl           
	//* 777 1527:ifle            1690
					{
						int l3 = (int)(((float)l * f1) / f);
	//  778 1530:iload           6
	//  779 1532:i2f             
	//  780 1533:fload           4
	//  781 1535:fmul            
	//  782 1536:fload_3         
	//  783 1537:fdiv            
	//  784 1538:f2i             
	//  785 1539:istore          13
						int k6 = getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom() + layoutparams1.topMargin + layoutparams1.bottomMargin, layoutparams1.height);
	//  786 1541:iload_2         
	//  787 1542:aload_0         
	//  788 1543:invokevirtual   #280 <Method int getPaddingTop()>
	//  789 1546:aload_0         
	//  790 1547:invokevirtual   #261 <Method int getPaddingBottom()>
	//  791 1550:iadd            
	//  792 1551:aload           28
	//  793 1553:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  794 1556:iadd            
	//  795 1557:aload           28
	//  796 1559:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  797 1562:iadd            
	//  798 1563:aload           28
	//  799 1565:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//  800 1568:invokestatic    #421 <Method int getChildMeasureSpec(int, int, int)>
	//  801 1571:istore          16
						if(layoutparams1.width == 0 && k8 == 0x40000000)
	//* 802 1573:aload           28
	//* 803 1575:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 804 1578:ifne            1623
	//* 805 1581:iload           22
	//* 806 1583:ldc1            #160 <Int 0x40000000>
	//* 807 1585:icmpeq          1591
	//* 808 1588:goto            1623
						{
							if(l3 > 0)
	//* 809 1591:iload           13
	//* 810 1593:ifle            1603
								i3 = l3;
	//  811 1596:iload           13
	//  812 1598:istore          11
							else
	//* 813 1600:goto            1606
								i3 = 0;
	//  814 1603:iconst_0        
	//  815 1604:istore          11
							view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(i3, 0x40000000), k6);
	//  816 1606:aload           27
	//  817 1608:iload           11
	//  818 1610:ldc1            #160 <Int 0x40000000>
	//  819 1612:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  820 1615:iload           16
	//  821 1617:invokevirtual   #401 <Method void View.measure(int, int)>
						} else
	//* 822 1620:goto            1659
						{
							int i5 = view2.getMeasuredWidth() + l3;
	//  823 1623:aload           27
	//  824 1625:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  825 1628:iload           13
	//  826 1630:iadd            
	//  827 1631:istore          14
							i3 = i5;
	//  828 1633:iload           14
	//  829 1635:istore          11
							if(i5 < 0)
	//* 830 1637:iload           14
	//* 831 1639:ifge            1645
								i3 = 0;
	//  832 1642:iconst_0        
	//  833 1643:istore          11
							view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(i3, 0x40000000), k6);
	//  834 1645:aload           27
	//  835 1647:iload           11
	//  836 1649:ldc1            #160 <Int 0x40000000>
	//  837 1651:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  838 1654:iload           16
	//  839 1656:invokevirtual   #401 <Method void View.measure(int, int)>
						}
						k = View.combineMeasuredStates(k, view2.getMeasuredState() & 0xff000000);
	//  840 1659:iload           5
	//  841 1661:aload           27
	//  842 1663:invokevirtual   #407 <Method int View.getMeasuredState()>
	//  843 1666:ldc2            #422 <Int 0xff000000>
	//  844 1669:iand            
	//  845 1670:invokestatic    #410 <Method int View.combineMeasuredStates(int, int)>
	//  846 1673:istore          5
						f -= f1;
	//  847 1675:fload_3         
	//  848 1676:fload           4
	//  849 1678:fsub            
	//  850 1679:fstore_3        
						l -= l3;
	//  851 1680:iload           6
	//  852 1682:iload           13
	//  853 1684:isub            
	//  854 1685:istore          6
					}
	//* 855 1687:goto            1690
					if(flag1)
	//* 856 1690:iload           15
	//* 857 1692:ifeq            1731
					{
						mTotalLength = mTotalLength + (view2.getMeasuredWidth() + layoutparams1.leftMargin + layoutparams1.rightMargin + getNextLocationOffset(view2));
	//  858 1695:aload_0         
	//  859 1696:aload_0         
	//  860 1697:getfield        #328 <Field int mTotalLength>
	//  861 1700:aload           27
	//  862 1702:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  863 1705:aload           28
	//  864 1707:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  865 1710:iadd            
	//  866 1711:aload           28
	//  867 1713:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  868 1716:iadd            
	//  869 1717:aload_0         
	//  870 1718:aload           27
	//  871 1720:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  872 1723:iadd            
	//  873 1724:iadd            
	//  874 1725:putfield        #328 <Field int mTotalLength>
					} else
	//* 875 1728:goto            1776
					{
						i3 = mTotalLength;
	//  876 1731:aload_0         
	//  877 1732:getfield        #328 <Field int mTotalLength>
	//  878 1735:istore          11
						mTotalLength = Math.max(i3, view2.getMeasuredWidth() + i3 + layoutparams1.leftMargin + layoutparams1.rightMargin + getNextLocationOffset(view2));
	//  879 1737:aload_0         
	//  880 1738:iload           11
	//  881 1740:aload           27
	//  882 1742:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  883 1745:iload           11
	//  884 1747:iadd            
	//  885 1748:aload           28
	//  886 1750:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  887 1753:iadd            
	//  888 1754:aload           28
	//  889 1756:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  890 1759:iadd            
	//  891 1760:aload_0         
	//  892 1761:aload           27
	//  893 1763:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  894 1766:iadd            
	//  895 1767:invokestatic    #398 <Method int Math.max(int, int)>
	//  896 1770:putfield        #328 <Field int mTotalLength>
					}
	//* 897 1773:goto            1728
					if(j8 != 0x40000000 && layoutparams1.height == -1)
	//* 898 1776:iload           21
	//* 899 1778:ldc1            #160 <Int 0x40000000>
	//* 900 1780:icmpeq          1798
	//* 901 1783:aload           28
	//* 902 1785:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 903 1788:iconst_m1       
	//* 904 1789:icmpne          1798
						i3 = 1;
	//  905 1792:iconst_1        
	//  906 1793:istore          11
					else
	//* 907 1795:goto            1801
						i3 = 0;
	//  908 1798:iconst_0        
	//  909 1799:istore          11
					int l6 = layoutparams1.topMargin + layoutparams1.bottomMargin;
	//  910 1801:aload           28
	//  911 1803:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  912 1806:aload           28
	//  913 1808:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  914 1811:iadd            
	//  915 1812:istore          16
					int j5 = view2.getMeasuredHeight() + l6;
	//  916 1814:aload           27
	//  917 1816:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  918 1819:iload           16
	//  919 1821:iadd            
	//  920 1822:istore          14
					int i4 = Math.max(l2, j5);
	//  921 1824:iload           10
	//  922 1826:iload           14
	//  923 1828:invokestatic    #398 <Method int Math.max(int, int)>
	//  924 1831:istore          13
					if(i3 != 0)
	//* 925 1833:iload           11
	//* 926 1835:ifeq            1845
						l2 = l6;
	//  927 1838:iload           16
	//  928 1840:istore          10
					else
	//* 929 1842:goto            1849
						l2 = j5;
	//  930 1845:iload           14
	//  931 1847:istore          10
					l2 = Math.max(j2, l2);
	//  932 1849:iload           8
	//  933 1851:iload           10
	//  934 1853:invokestatic    #398 <Method int Math.max(int, int)>
	//  935 1856:istore          10
					if(flag && layoutparams1.height == -1)
	//* 936 1858:iload           7
	//* 937 1860:ifeq            1878
	//* 938 1863:aload           28
	//* 939 1865:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 940 1868:iconst_m1       
	//* 941 1869:icmpne          1878
						flag = true;
	//  942 1872:iconst_1        
	//  943 1873:istore          7
					else
	//* 944 1875:goto            1881
						flag = false;
	//  945 1878:iconst_0        
	//  946 1879:istore          7
					if(flag2)
	//* 947 1881:iload           24
	//* 948 1883:ifeq            1973
					{
						i3 = view2.getBaseline();
	//  949 1886:aload           27
	//  950 1888:invokevirtual   #322 <Method int View.getBaseline()>
	//  951 1891:istore          11
						if(i3 != -1)
	//* 952 1893:iload           11
	//* 953 1895:iconst_m1       
	//* 954 1896:icmpeq          1973
						{
							if(layoutparams1.gravity < 0)
	//* 955 1899:aload           28
	//* 956 1901:getfield        #375 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//* 957 1904:ifge            1916
								j2 = mGravity;
	//  958 1907:aload_0         
	//  959 1908:getfield        #68  <Field int mGravity>
	//  960 1911:istore          8
							else
	//* 961 1913:goto            1923
								j2 = layoutparams1.gravity;
	//  962 1916:aload           28
	//  963 1918:getfield        #375 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//  964 1921:istore          8
							j2 = ((j2 & 0x70) >> 4 & -2) >> 1;
	//  965 1923:iload           8
	//  966 1925:bipush          112
	//  967 1927:iand            
	//  968 1928:iconst_4        
	//  969 1929:ishr            
	//  970 1930:bipush          -2
	//  971 1932:iand            
	//  972 1933:iconst_1        
	//  973 1934:ishr            
	//  974 1935:istore          8
							ai[j2] = Math.max(ai[j2], i3);
	//  975 1937:aload           29
	//  976 1939:iload           8
	//  977 1941:aload           29
	//  978 1943:iload           8
	//  979 1945:iaload          
	//  980 1946:iload           11
	//  981 1948:invokestatic    #398 <Method int Math.max(int, int)>
	//  982 1951:iastore         
							obj[j2] = Math.max(obj[j2], j5 - i3);
	//  983 1952:aload           26
	//  984 1954:iload           8
	//  985 1956:aload           26
	//  986 1958:iload           8
	//  987 1960:iaload          
	//  988 1961:iload           14
	//  989 1963:iload           11
	//  990 1965:isub            
	//  991 1966:invokestatic    #398 <Method int Math.max(int, int)>
	//  992 1969:iastore         
						}
					}
	//* 993 1970:goto            1973
					j2 = l2;
	//  994 1973:iload           10
	//  995 1975:istore          8
					l2 = i4;
	//  996 1977:iload           13
	//  997 1979:istore          10
				}

	//  998 1981:goto            1984
	//  999 1984:iload           12
	// 1000 1986:iconst_1        
	// 1001 1987:iadd            
	// 1002 1988:istore          12
	//*1003 1990:goto            1473
				mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
	// 1004 1993:aload_0         
	// 1005 1994:aload_0         
	// 1006 1995:getfield        #328 <Field int mTotalLength>
	// 1007 1998:aload_0         
	// 1008 1999:invokevirtual   #237 <Method int getPaddingLeft()>
	// 1009 2002:aload_0         
	// 1010 2003:invokevirtual   #243 <Method int getPaddingRight()>
	// 1011 2006:iadd            
	// 1012 2007:iadd            
	// 1013 2008:putfield        #328 <Field int mTotalLength>
				if(ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
	//*1014 2011:aload           29
	//*1015 2013:iconst_1        
	//*1016 2014:iaload          
	//*1017 2015:iconst_m1       
	//*1018 2016:icmpne          2047
	//*1019 2019:aload           29
	//*1020 2021:iconst_0        
	//*1021 2022:iaload          
	//*1022 2023:iconst_m1       
	//*1023 2024:icmpne          2047
	//*1024 2027:aload           29
	//*1025 2029:iconst_2        
	//*1026 2030:iaload          
	//*1027 2031:iconst_m1       
	//*1028 2032:icmpne          2047
				{
					l = l2;
	// 1029 2035:iload           10
	// 1030 2037:istore          6
					if(ai[3] == -1)
						break label3;
	// 1031 2039:aload           29
	// 1032 2041:iconst_3        
	// 1033 2042:iaload          
	// 1034 2043:iconst_m1       
	// 1035 2044:icmpeq          2105
				}
				l = Math.max(l2, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(obj[3], Math.max(obj[0], Math.max(obj[1], obj[2]))));
	// 1036 2047:iload           10
	// 1037 2049:aload           29
	// 1038 2051:iconst_3        
	// 1039 2052:iaload          
	// 1040 2053:aload           29
	// 1041 2055:iconst_0        
	// 1042 2056:iaload          
	// 1043 2057:aload           29
	// 1044 2059:iconst_1        
	// 1045 2060:iaload          
	// 1046 2061:aload           29
	// 1047 2063:iconst_2        
	// 1048 2064:iaload          
	// 1049 2065:invokestatic    #398 <Method int Math.max(int, int)>
	// 1050 2068:invokestatic    #398 <Method int Math.max(int, int)>
	// 1051 2071:invokestatic    #398 <Method int Math.max(int, int)>
	// 1052 2074:aload           26
	// 1053 2076:iconst_3        
	// 1054 2077:iaload          
	// 1055 2078:aload           26
	// 1056 2080:iconst_0        
	// 1057 2081:iaload          
	// 1058 2082:aload           26
	// 1059 2084:iconst_1        
	// 1060 2085:iaload          
	// 1061 2086:aload           26
	// 1062 2088:iconst_2        
	// 1063 2089:iaload          
	// 1064 2090:invokestatic    #398 <Method int Math.max(int, int)>
	// 1065 2093:invokestatic    #398 <Method int Math.max(int, int)>
	// 1066 2096:invokestatic    #398 <Method int Math.max(int, int)>
	// 1067 2099:iadd            
	// 1068 2100:invokestatic    #398 <Method int Math.max(int, int)>
	// 1069 2103:istore          6
			}
			j3 = k;
	// 1070 2105:iload           5
	// 1071 2107:istore          12
			i3 = l;
	// 1072 2109:iload           6
	// 1073 2111:istore          11
			l = j2;
	// 1074 2113:iload           8
	// 1075 2115:istore          6
		}
		if(flag || j8 == 0x40000000)
	//*1076 2117:iload           7
	//*1077 2119:ifne            2132
	//*1078 2122:iload           21
	//*1079 2124:ldc1            #160 <Int 0x40000000>
	//*1080 2126:icmpeq          2132
	//*1081 2129:goto            2136
			l = i3;
	// 1082 2132:iload           11
	// 1083 2134:istore          6
		setMeasuredDimension(j7 | 0xff000000 & j3, View.resolveSizeAndState(Math.max(l + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), j, j3 << 16));
	// 1084 2136:aload_0         
	// 1085 2137:iload           17
	// 1086 2139:ldc2            #422 <Int 0xff000000>
	// 1087 2142:iload           12
	// 1088 2144:iand            
	// 1089 2145:ior             
	// 1090 2146:iload           6
	// 1091 2148:aload_0         
	// 1092 2149:invokevirtual   #280 <Method int getPaddingTop()>
	// 1093 2152:aload_0         
	// 1094 2153:invokevirtual   #261 <Method int getPaddingBottom()>
	// 1095 2156:iadd            
	// 1096 2157:iadd            
	// 1097 2158:aload_0         
	// 1098 2159:invokevirtual   #425 <Method int getSuggestedMinimumHeight()>
	// 1099 2162:invokestatic    #398 <Method int Math.max(int, int)>
	// 1100 2165:iload_2         
	// 1101 2166:iload           12
	// 1102 2168:bipush          16
	// 1103 2170:ishl            
	// 1104 2171:invokestatic    #417 <Method int View.resolveSizeAndState(int, int, int)>
	// 1105 2174:invokevirtual   #428 <Method void setMeasuredDimension(int, int)>
		if(k2 != 0)
	//*1106 2177:iload           9
	//*1107 2179:ifeq            2189
			forceUniformHeight(i8, i);
	// 1108 2182:aload_0         
	// 1109 2183:iload           20
	// 1110 2185:iload_1         
	// 1111 2186:invokespecial   #430 <Method void forceUniformHeight(int, int)>
		return;
	// 1112 2189:return          
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
		int i2;
		int k2;
		int k3;
		int l4;
		int k5;
		int j6;
		int j8;
		boolean flag1;
		mTotalLength = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #328 <Field int mTotalLength>
		int l3 = getVirtualChildCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #206 <Method int getVirtualChildCount()>
	//    5    9:istore          13
		j8 = android.view.View.MeasureSpec.getMode(i);
	//    6   11:iload_1         
	//    7   12:invokestatic    #390 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   15:istore          20
		l = android.view.View.MeasureSpec.getMode(j);
	//    9   17:iload_2         
	//   10   18:invokestatic    #390 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   11   21:istore          6
		int k8 = mBaselineAlignedChildIndex;
	//   12   23:aload_0         
	//   13   24:getfield        #63  <Field int mBaselineAlignedChildIndex>
	//   14   27:istore          21
		flag1 = mUseLargestChild;
	//   15   29:aload_0         
	//   16   30:getfield        #125 <Field boolean mUseLargestChild>
	//   17   33:istore          22
		i2 = 0;
	//   18   35:iconst_0        
	//   19   36:istore          10
		k5 = i2;
	//   20   38:iload           10
	//   21   40:istore          15
		k1 = k5;
	//   22   42:iload           15
	//   23   44:istore          9
		k = k1;
	//   24   46:iload           9
	//   25   48:istore          5
		j1 = k;
	//   26   50:iload           5
	//   27   52:istore          8
		k2 = j1;
	//   28   54:iload           8
	//   29   56:istore          11
		l4 = k2;
	//   30   58:iload           11
	//   31   60:istore          14
		k3 = l4;
	//   32   62:iload           14
	//   33   64:istore          12
		f = 0.0F;
	//   34   66:fconst_0        
	//   35   67:fstore_3        
		i1 = 1;
	//   36   68:iconst_1        
	//   37   69:istore          7
		for(; k2 < l3; k2++)
	//*  38   71:iload           11
	//*  39   73:iload           13
	//*  40   75:icmpge          651
		{
			View view = getVirtualChildAt(k2);
	//   41   78:aload_0         
	//   42   79:iload           11
	//   43   81:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   44   84:astore          23
			if(view == null)
	//*  45   86:aload           23
	//*  46   88:ifnonnull       109
			{
				mTotalLength = mTotalLength + measureNullChild(k2);
	//   47   91:aload_0         
	//   48   92:aload_0         
	//   49   93:getfield        #328 <Field int mTotalLength>
	//   50   96:aload_0         
	//   51   97:iload           11
	//   52   99:invokevirtual   #372 <Method int measureNullChild(int)>
	//   53  102:iadd            
	//   54  103:putfield        #328 <Field int mTotalLength>
				continue;
	//   55  106:goto            642
			}
			if(view.getVisibility() == 8)
	//*  56  109:aload           23
	//*  57  111:invokevirtual   #174 <Method int View.getVisibility()>
	//*  58  114:bipush          8
	//*  59  116:icmpne          135
			{
				k2 += getChildrenSkipCount(view, k2);
	//   60  119:iload           11
	//   61  121:aload_0         
	//   62  122:aload           23
	//   63  124:iload           11
	//   64  126:invokevirtual   #383 <Method int getChildrenSkipCount(View, int)>
	//   65  129:iadd            
	//   66  130:istore          11
				continue;
	//   67  132:goto            642
			}
			if(hasDividerBeforeChildAt(k2))
	//*  68  135:aload_0         
	//*  69  136:iload           11
	//*  70  138:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//*  71  141:ifeq            157
				mTotalLength = mTotalLength + mDividerHeight;
	//   72  144:aload_0         
	//   73  145:aload_0         
	//   74  146:getfield        #328 <Field int mTotalLength>
	//   75  149:aload_0         
	//   76  150:getfield        #252 <Field int mDividerHeight>
	//   77  153:iadd            
	//   78  154:putfield        #328 <Field int mTotalLength>
			LayoutParams layoutparams2 = (LayoutParams)view.getLayoutParams();
	//   79  157:aload           23
	//   80  159:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   81  162:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   82  165:astore          25
			f += layoutparams2.weight;
	//   83  167:fload_3         
	//   84  168:aload           25
	//   85  170:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//   86  173:fadd            
	//   87  174:fstore_3        
			if(l == 0x40000000 && layoutparams2.height == 0 && layoutparams2.weight > 0.0F)
	//*  88  175:iload           6
	//*  89  177:ldc1            #160 <Int 0x40000000>
	//*  90  179:icmpne          235
	//*  91  182:aload           25
	//*  92  184:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//*  93  187:ifne            235
	//*  94  190:aload           25
	//*  95  192:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//*  96  195:fconst_0        
	//*  97  196:fcmpl           
	//*  98  197:ifle            235
			{
				l4 = mTotalLength;
	//   99  200:aload_0         
	//  100  201:getfield        #328 <Field int mTotalLength>
	//  101  204:istore          14
				mTotalLength = Math.max(l4, layoutparams2.topMargin + l4 + layoutparams2.bottomMargin);
	//  102  206:aload_0         
	//  103  207:iload           14
	//  104  209:aload           25
	//  105  211:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  106  214:iload           14
	//  107  216:iadd            
	//  108  217:aload           25
	//  109  219:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  110  222:iadd            
	//  111  223:invokestatic    #398 <Method int Math.max(int, int)>
	//  112  226:putfield        #328 <Field int mTotalLength>
				l4 = 1;
	//  113  229:iconst_1        
	//  114  230:istore          14
			} else
	//* 115  232:goto            384
			{
				int l5;
				if(layoutparams2.height == 0 && layoutparams2.weight > 0.0F)
	//* 116  235:aload           25
	//* 117  237:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 118  240:ifne            266
	//* 119  243:aload           25
	//* 120  245:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 121  248:fconst_0        
	//* 122  249:fcmpl           
	//* 123  250:ifle            266
				{
					layoutparams2.height = -2;
	//  124  253:aload           25
	//  125  255:bipush          -2
	//  126  257:putfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
					l5 = 0;
	//  127  260:iconst_0        
	//  128  261:istore          16
				} else
	//* 129  263:goto            271
				{
					l5 = 0x80000000;
	//  130  266:ldc2            #402 <Int 0x80000000>
	//  131  269:istore          16
				}
				int k6;
				if(f == 0.0F)
	//* 132  271:fload_3         
	//* 133  272:fconst_0        
	//* 134  273:fcmpl           
	//* 135  274:ifne            286
					k6 = mTotalLength;
	//  136  277:aload_0         
	//  137  278:getfield        #328 <Field int mTotalLength>
	//  138  281:istore          17
				else
	//* 139  283:goto            289
					k6 = 0;
	//  140  286:iconst_0        
	//  141  287:istore          17
				View view4 = view;
	//  142  289:aload           23
	//  143  291:astore          24
				measureChildBeforeLayout(view, k2, i, 0, j, k6);
	//  144  293:aload_0         
	//  145  294:aload           23
	//  146  296:iload           11
	//  147  298:iload_1         
	//  148  299:iconst_0        
	//  149  300:iload_2         
	//  150  301:iload           17
	//  151  303:invokevirtual   #404 <Method void measureChildBeforeLayout(View, int, int, int, int, int)>
				if(l5 != 0x80000000)
	//* 152  306:iload           16
	//* 153  308:ldc2            #402 <Int 0x80000000>
	//* 154  311:icmpeq          321
					layoutparams2.height = l5;
	//  155  314:aload           25
	//  156  316:iload           16
	//  157  318:putfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
				l5 = view4.getMeasuredHeight();
	//  158  321:aload           24
	//  159  323:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  160  326:istore          16
				k6 = mTotalLength;
	//  161  328:aload_0         
	//  162  329:getfield        #328 <Field int mTotalLength>
	//  163  332:istore          17
				mTotalLength = Math.max(k6, k6 + l5 + layoutparams2.topMargin + layoutparams2.bottomMargin + getNextLocationOffset(view4));
	//  164  334:aload_0         
	//  165  335:iload           17
	//  166  337:iload           17
	//  167  339:iload           16
	//  168  341:iadd            
	//  169  342:aload           25
	//  170  344:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  171  347:iadd            
	//  172  348:aload           25
	//  173  350:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  174  353:iadd            
	//  175  354:aload_0         
	//  176  355:aload           24
	//  177  357:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  178  360:iadd            
	//  179  361:invokestatic    #398 <Method int Math.max(int, int)>
	//  180  364:putfield        #328 <Field int mTotalLength>
				if(flag1)
	//* 181  367:iload           22
	//* 182  369:ifeq            384
					k1 = Math.max(l5, k1);
	//  183  372:iload           16
	//  184  374:iload           9
	//  185  376:invokestatic    #398 <Method int Math.max(int, int)>
	//  186  379:istore          9
			}
	//* 187  381:goto            384
			int i6 = k;
	//  188  384:iload           5
	//  189  386:istore          16
			int l7 = k2;
	//  190  388:iload           11
	//  191  390:istore          19
			if(k8 >= 0 && k8 == l7 + 1)
	//* 192  392:iload           21
	//* 193  394:iflt            414
	//* 194  397:iload           21
	//* 195  399:iload           19
	//* 196  401:iconst_1        
	//* 197  402:iadd            
	//* 198  403:icmpne          414
				mBaselineChildTop = mTotalLength;
	//  199  406:aload_0         
	//  200  407:aload_0         
	//  201  408:getfield        #328 <Field int mTotalLength>
	//  202  411:putfield        #65  <Field int mBaselineChildTop>
			if(l7 < k8 && layoutparams2.weight > 0.0F)
	//* 203  414:iload           19
	//* 204  416:iload           21
	//* 205  418:icmpge          442
	//* 206  421:aload           25
	//* 207  423:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 208  426:fconst_0        
	//* 209  427:fcmpl           
	//* 210  428:ifle            442
				throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
	//  211  431:new             #313 <Class RuntimeException>
	//  212  434:dup             
	//  213  435:ldc2            #433 <String "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.">
	//  214  438:invokespecial   #318 <Method void RuntimeException(String)>
	//  215  441:athrow          
			if(j8 != 0x40000000 && layoutparams2.width == -1)
	//* 216  442:iload           20
	//* 217  444:ldc1            #160 <Int 0x40000000>
	//* 218  446:icmpeq          468
	//* 219  449:aload           25
	//* 220  451:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 221  454:iconst_m1       
	//* 222  455:icmpne          468
			{
				k2 = 1;
	//  223  458:iconst_1        
	//  224  459:istore          11
				k3 = k2;
	//  225  461:iload           11
	//  226  463:istore          12
			} else
	//* 227  465:goto            471
			{
				k2 = 0;
	//  228  468:iconst_0        
	//  229  469:istore          11
			}
			int l6 = layoutparams2.leftMargin + layoutparams2.rightMargin;
	//  230  471:aload           25
	//  231  473:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  232  476:aload           25
	//  233  478:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  234  481:iadd            
	//  235  482:istore          17
			int j7 = view.getMeasuredWidth() + l6;
	//  236  484:aload           23
	//  237  486:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  238  489:iload           17
	//  239  491:iadd            
	//  240  492:istore          18
			k5 = Math.max(k5, j7);
	//  241  494:iload           15
	//  242  496:iload           18
	//  243  498:invokestatic    #398 <Method int Math.max(int, int)>
	//  244  501:istore          15
			i2 = View.combineMeasuredStates(i2, view.getMeasuredState());
	//  245  503:iload           10
	//  246  505:aload           23
	//  247  507:invokevirtual   #407 <Method int View.getMeasuredState()>
	//  248  510:invokestatic    #410 <Method int View.combineMeasuredStates(int, int)>
	//  249  513:istore          10
			if(i1 != 0 && layoutparams2.width == -1)
	//* 250  515:iload           7
	//* 251  517:ifeq            535
	//* 252  520:aload           25
	//* 253  522:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 254  525:iconst_m1       
	//* 255  526:icmpne          535
				k = 1;
	//  256  529:iconst_1        
	//  257  530:istore          5
			else
	//* 258  532:goto            538
				k = 0;
	//  259  535:iconst_0        
	//  260  536:istore          5
			if(layoutparams2.weight > 0.0F)
	//* 261  538:aload           25
	//* 262  540:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 263  543:fconst_0        
	//* 264  544:fcmpl           
	//* 265  545:ifle            583
			{
				if(k2 == 0)
	//* 266  548:iload           11
	//* 267  550:ifeq            556
	//* 268  553:goto            563
					l6 = j7;
	//  269  556:iload           18
	//  270  558:istore          17
	//* 271  560:goto            553
				k2 = Math.max(i6, l6);
	//  272  563:iload           16
	//  273  565:iload           17
	//  274  567:invokestatic    #398 <Method int Math.max(int, int)>
	//  275  570:istore          11
				i1 = j1;
	//  276  572:iload           8
	//  277  574:istore          7
				j1 = k2;
	//  278  576:iload           11
	//  279  578:istore          8
			} else
	//* 280  580:goto            605
			{
				if(k2 != 0)
	//* 281  583:iload           11
	//* 282  585:ifeq            592
					j7 = l6;
	//  283  588:iload           17
	//  284  590:istore          18
				i1 = Math.max(j1, j7);
	//  285  592:iload           8
	//  286  594:iload           18
	//  287  596:invokestatic    #398 <Method int Math.max(int, int)>
	//  288  599:istore          7
				j1 = i6;
	//  289  601:iload           16
	//  290  603:istore          8
			}
			i6 = getChildrenSkipCount(view, l7);
	//  291  605:aload_0         
	//  292  606:aload           23
	//  293  608:iload           19
	//  294  610:invokevirtual   #383 <Method int getChildrenSkipCount(View, int)>
	//  295  613:istore          16
			k2 = k;
	//  296  615:iload           5
	//  297  617:istore          11
			k = j1;
	//  298  619:iload           8
	//  299  621:istore          5
			i6 += l7;
	//  300  623:iload           16
	//  301  625:iload           19
	//  302  627:iadd            
	//  303  628:istore          16
			j1 = i1;
	//  304  630:iload           7
	//  305  632:istore          8
			i1 = k2;
	//  306  634:iload           11
	//  307  636:istore          7
			k2 = i6;
	//  308  638:iload           16
	//  309  640:istore          11
		}

	//  310  642:iload           11
	//  311  644:iconst_1        
	//  312  645:iadd            
	//  313  646:istore          11
	//* 314  648:goto            71
		j6 = i2;
	//  315  651:iload           10
	//  316  653:istore          16
		i2 = k5;
	//  317  655:iload           15
	//  318  657:istore          10
		if(mTotalLength > 0 && hasDividerBeforeChildAt(l3))
	//* 319  659:aload_0         
	//* 320  660:getfield        #328 <Field int mTotalLength>
	//* 321  663:ifle            691
	//* 322  666:aload_0         
	//* 323  667:iload           13
	//* 324  669:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 325  672:ifeq            691
			mTotalLength = mTotalLength + mDividerHeight;
	//  326  675:aload_0         
	//  327  676:aload_0         
	//  328  677:getfield        #328 <Field int mTotalLength>
	//  329  680:aload_0         
	//  330  681:getfield        #252 <Field int mDividerHeight>
	//  331  684:iadd            
	//  332  685:putfield        #328 <Field int mTotalLength>
	//* 333  688:goto            691
		k5 = l3;
	//  334  691:iload           13
	//  335  693:istore          15
		if(!flag1)
			break MISSING_BLOCK_LABEL_865;
	//  336  695:iload           22
	//  337  697:ifeq            865
		k2 = l;
	//  338  700:iload           6
	//  339  702:istore          11
		if(k2 == 0x80000000) goto _L2; else goto _L1
	//  340  704:iload           11
	//  341  706:ldc2            #402 <Int 0x80000000>
	//  342  709:icmpeq          731
_L1:
		int i4 = i2;
	//  343  712:iload           10
	//  344  714:istore          13
		if(k2 != 0) goto _L3; else goto _L2
	//  345  716:iload           11
	//  346  718:ifne            724
	//* 347  721:goto            731
_L3:
		i2 = i4;
	//  348  724:iload           13
	//  349  726:istore          10
		break MISSING_BLOCK_LABEL_865;
	//  350  728:goto            865
_L2:
		mTotalLength = 0;
	//  351  731:aload_0         
	//  352  732:iconst_0        
	//  353  733:putfield        #328 <Field int mTotalLength>
		int l2 = 0;
	//  354  736:iconst_0        
	//  355  737:istore          11
		do
		{
			i4 = i2;
	//  356  739:iload           10
	//  357  741:istore          13
			if(l2 >= k5)
				break;
	//  358  743:iload           11
	//  359  745:iload           15
	//  360  747:icmpge          724
			View view1 = getVirtualChildAt(l2);
	//  361  750:aload_0         
	//  362  751:iload           11
	//  363  753:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  364  756:astore          23
			if(view1 == null)
	//* 365  758:aload           23
	//* 366  760:ifnonnull       781
				mTotalLength = mTotalLength + measureNullChild(l2);
	//  367  763:aload_0         
	//  368  764:aload_0         
	//  369  765:getfield        #328 <Field int mTotalLength>
	//  370  768:aload_0         
	//  371  769:iload           11
	//  372  771:invokevirtual   #372 <Method int measureNullChild(int)>
	//  373  774:iadd            
	//  374  775:putfield        #328 <Field int mTotalLength>
			else
	//* 375  778:goto            804
			if(view1.getVisibility() == 8)
	//* 376  781:aload           23
	//* 377  783:invokevirtual   #174 <Method int View.getVisibility()>
	//* 378  786:bipush          8
	//* 379  788:icmpne          807
			{
				l2 += getChildrenSkipCount(view1, l2);
	//  380  791:iload           11
	//  381  793:aload_0         
	//  382  794:aload           23
	//  383  796:iload           11
	//  384  798:invokevirtual   #383 <Method int getChildrenSkipCount(View, int)>
	//  385  801:iadd            
	//  386  802:istore          11
			} else
	//* 387  804:goto            856
			{
				LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
	//  388  807:aload           23
	//  389  809:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  390  812:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  391  815:astore          24
				int j4 = mTotalLength;
	//  392  817:aload_0         
	//  393  818:getfield        #328 <Field int mTotalLength>
	//  394  821:istore          13
				mTotalLength = Math.max(j4, j4 + k1 + layoutparams.topMargin + layoutparams.bottomMargin + getNextLocationOffset(view1));
	//  395  823:aload_0         
	//  396  824:iload           13
	//  397  826:iload           13
	//  398  828:iload           9
	//  399  830:iadd            
	//  400  831:aload           24
	//  401  833:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  402  836:iadd            
	//  403  837:aload           24
	//  404  839:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  405  842:iadd            
	//  406  843:aload_0         
	//  407  844:aload           23
	//  408  846:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  409  849:iadd            
	//  410  850:invokestatic    #398 <Method int Math.max(int, int)>
	//  411  853:putfield        #328 <Field int mTotalLength>
			}
			l2++;
	//  412  856:iload           11
	//  413  858:iconst_1        
	//  414  859:iadd            
	//  415  860:istore          11
		} while(true);
	//  416  862:goto            739
		if(true) goto _L3; else goto _L4
_L4:
		int k4 = l;
	//  417  865:iload           6
	//  418  867:istore          13
		mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
	//  419  869:aload_0         
	//  420  870:aload_0         
	//  421  871:getfield        #328 <Field int mTotalLength>
	//  422  874:aload_0         
	//  423  875:invokevirtual   #280 <Method int getPaddingTop()>
	//  424  878:aload_0         
	//  425  879:invokevirtual   #261 <Method int getPaddingBottom()>
	//  426  882:iadd            
	//  427  883:iadd            
	//  428  884:putfield        #328 <Field int mTotalLength>
		int i7 = View.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumHeight()), j, 0);
	//  429  887:aload_0         
	//  430  888:getfield        #328 <Field int mTotalLength>
	//  431  891:aload_0         
	//  432  892:invokevirtual   #425 <Method int getSuggestedMinimumHeight()>
	//  433  895:invokestatic    #398 <Method int Math.max(int, int)>
	//  434  898:iload_2         
	//  435  899:iconst_0        
	//  436  900:invokestatic    #417 <Method int View.resolveSizeAndState(int, int, int)>
	//  437  903:istore          17
		l = (0xffffff & i7) - mTotalLength;
	//  438  905:ldc2            #418 <Int 0xffffff>
	//  439  908:iload           17
	//  440  910:iand            
	//  441  911:aload_0         
	//  442  912:getfield        #328 <Field int mTotalLength>
	//  443  915:isub            
	//  444  916:istore          6
		if(l4 == 0 && (l == 0 || f <= 0.0F))
	//* 445  918:iload           14
	//* 446  920:ifne            1052
	//* 447  923:iload           6
	//* 448  925:ifeq            937
	//* 449  928:fload_3         
	//* 450  929:fconst_0        
	//* 451  930:fcmpl           
	//* 452  931:ifle            937
	//* 453  934:goto            1052
		{
			l = Math.max(j1, k);
	//  454  937:iload           8
	//  455  939:iload           5
	//  456  941:invokestatic    #398 <Method int Math.max(int, int)>
	//  457  944:istore          6
			if(flag1 && k4 != 0x40000000)
	//* 458  946:iload           22
	//* 459  948:ifeq            1041
	//* 460  951:iload           13
	//* 461  953:ldc1            #160 <Int 0x40000000>
	//* 462  955:icmpeq          1041
				for(k = 0; k < k5; k++)
	//* 463  958:iconst_0        
	//* 464  959:istore          5
	//* 465  961:iload           5
	//* 466  963:iload           15
	//* 467  965:icmpge          1041
				{
					View view2 = getVirtualChildAt(k);
	//  468  968:aload_0         
	//  469  969:iload           5
	//  470  971:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  471  974:astore          23
					if(view2 != null && view2.getVisibility() != 8 && ((LayoutParams)view2.getLayoutParams()).weight > 0.0F)
	//* 472  976:aload           23
	//* 473  978:ifnull          1032
	//* 474  981:aload           23
	//* 475  983:invokevirtual   #174 <Method int View.getVisibility()>
	//* 476  986:bipush          8
	//* 477  988:icmpne          994
	//* 478  991:goto            1032
	//* 479  994:aload           23
	//* 480  996:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 481  999:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//* 482 1002:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 483 1005:fconst_0        
	//* 484 1006:fcmpl           
	//* 485 1007:ifle            1032
						view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000));
	//  486 1010:aload           23
	//  487 1012:aload           23
	//  488 1014:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  489 1017:ldc1            #160 <Int 0x40000000>
	//  490 1019:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  491 1022:iload           9
	//  492 1024:ldc1            #160 <Int 0x40000000>
	//  493 1026:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  494 1029:invokevirtual   #401 <Method void View.measure(int, int)>
				}

	//  495 1032:iload           5
	//  496 1034:iconst_1        
	//  497 1035:iadd            
	//  498 1036:istore          5
	//* 499 1038:goto            961
			j1 = i2;
	//  500 1041:iload           10
	//  501 1043:istore          8
			k = l;
	//  502 1045:iload           6
	//  503 1047:istore          5
		} else
	//* 504 1049:goto            1528
		{
			if(mWeightSum > 0.0F)
	//* 505 1052:aload_0         
	//* 506 1053:getfield        #117 <Field float mWeightSum>
	//* 507 1056:fconst_0        
	//* 508 1057:fcmpl           
	//* 509 1058:ifle            1066
				f = mWeightSum;
	//  510 1061:aload_0         
	//  511 1062:getfield        #117 <Field float mWeightSum>
	//  512 1065:fstore_3        
			mTotalLength = 0;
	//  513 1066:aload_0         
	//  514 1067:iconst_0        
	//  515 1068:putfield        #328 <Field int mTotalLength>
			boolean flag = false;
	//  516 1071:iconst_0        
	//  517 1072:istore          11
			int l1 = l;
	//  518 1074:iload           6
	//  519 1076:istore          9
			l = j1;
	//  520 1078:iload           8
	//  521 1080:istore          6
			j1 = i2;
	//  522 1082:iload           10
	//  523 1084:istore          8
			k = j6;
	//  524 1086:iload           16
	//  525 1088:istore          5
			for(int j2 = ((int) (flag)); j2 < k5; j2++)
	//* 526 1090:iload           11
	//* 527 1092:istore          10
	//* 528 1094:iload           10
	//* 529 1096:iload           15
	//* 530 1098:icmpge          1502
			{
				View view3 = getVirtualChildAt(j2);
	//  531 1101:aload_0         
	//  532 1102:iload           10
	//  533 1104:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  534 1107:astore          23
				if(view3.getVisibility() == 8)
	//* 535 1109:aload           23
	//* 536 1111:invokevirtual   #174 <Method int View.getVisibility()>
	//* 537 1114:bipush          8
	//* 538 1116:icmpne          1122
					continue;
	//  539 1119:goto            1493
				LayoutParams layoutparams1 = (LayoutParams)view3.getLayoutParams();
	//  540 1122:aload           23
	//  541 1124:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  542 1127:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  543 1130:astore          24
				float f1 = layoutparams1.weight;
	//  544 1132:aload           24
	//  545 1134:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  546 1137:fstore          4
				if(f1 > 0.0F)
	//* 547 1139:fload           4
	//* 548 1141:fconst_0        
	//* 549 1142:fcmpl           
	//* 550 1143:ifle            1330
				{
					int i5 = (int)(((float)l1 * f1) / f);
	//  551 1146:iload           9
	//  552 1148:i2f             
	//  553 1149:fload           4
	//  554 1151:fmul            
	//  555 1152:fload_3         
	//  556 1153:fdiv            
	//  557 1154:f2i             
	//  558 1155:istore          14
					j6 = getPaddingLeft();
	//  559 1157:aload_0         
	//  560 1158:invokevirtual   #237 <Method int getPaddingLeft()>
	//  561 1161:istore          16
					int k7 = getPaddingRight();
	//  562 1163:aload_0         
	//  563 1164:invokevirtual   #243 <Method int getPaddingRight()>
	//  564 1167:istore          18
					int i3 = l1 - i5;
	//  565 1169:iload           9
	//  566 1171:iload           14
	//  567 1173:isub            
	//  568 1174:istore          11
					l1 = layoutparams1.leftMargin;
	//  569 1176:aload           24
	//  570 1178:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  571 1181:istore          9
					int i8 = layoutparams1.rightMargin;
	//  572 1183:aload           24
	//  573 1185:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  574 1188:istore          19
					int l8 = layoutparams1.width;
	//  575 1190:aload           24
	//  576 1192:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//  577 1195:istore          21
					f -= f1;
	//  578 1197:fload_3         
	//  579 1198:fload           4
	//  580 1200:fsub            
	//  581 1201:fstore_3        
					j6 = getChildMeasureSpec(i, j6 + k7 + l1 + i8, l8);
	//  582 1202:iload_1         
	//  583 1203:iload           16
	//  584 1205:iload           18
	//  585 1207:iadd            
	//  586 1208:iload           9
	//  587 1210:iadd            
	//  588 1211:iload           19
	//  589 1213:iadd            
	//  590 1214:iload           21
	//  591 1216:invokestatic    #421 <Method int getChildMeasureSpec(int, int, int)>
	//  592 1219:istore          16
					if(layoutparams1.height == 0 && k4 == 0x40000000)
	//* 593 1221:aload           24
	//* 594 1223:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 595 1226:ifne            1271
	//* 596 1229:iload           13
	//* 597 1231:ldc1            #160 <Int 0x40000000>
	//* 598 1233:icmpeq          1239
	//* 599 1236:goto            1271
					{
						if(i5 > 0)
	//* 600 1239:iload           14
	//* 601 1241:ifle            1251
							l1 = i5;
	//  602 1244:iload           14
	//  603 1246:istore          9
						else
	//* 604 1248:goto            1254
							l1 = 0;
	//  605 1251:iconst_0        
	//  606 1252:istore          9
						view3.measure(j6, android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
	//  607 1254:aload           23
	//  608 1256:iload           16
	//  609 1258:iload           9
	//  610 1260:ldc1            #160 <Int 0x40000000>
	//  611 1262:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  612 1265:invokevirtual   #401 <Method void View.measure(int, int)>
					} else
	//* 613 1268:goto            1307
					{
						i5 = view3.getMeasuredHeight() + i5;
	//  614 1271:aload           23
	//  615 1273:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  616 1276:iload           14
	//  617 1278:iadd            
	//  618 1279:istore          14
						l1 = i5;
	//  619 1281:iload           14
	//  620 1283:istore          9
						if(i5 < 0)
	//* 621 1285:iload           14
	//* 622 1287:ifge            1293
							l1 = 0;
	//  623 1290:iconst_0        
	//  624 1291:istore          9
						view3.measure(j6, android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
	//  625 1293:aload           23
	//  626 1295:iload           16
	//  627 1297:iload           9
	//  628 1299:ldc1            #160 <Int 0x40000000>
	//  629 1301:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  630 1304:invokevirtual   #401 <Method void View.measure(int, int)>
					}
					k = View.combineMeasuredStates(k, view3.getMeasuredState() & 0xffffff00);
	//  631 1307:iload           5
	//  632 1309:aload           23
	//  633 1311:invokevirtual   #407 <Method int View.getMeasuredState()>
	//  634 1314:sipush          -256
	//  635 1317:iand            
	//  636 1318:invokestatic    #410 <Method int View.combineMeasuredStates(int, int)>
	//  637 1321:istore          5
					l1 = i3;
	//  638 1323:iload           11
	//  639 1325:istore          9
				}
	//* 640 1327:goto            1330
				int j5 = layoutparams1.leftMargin + layoutparams1.rightMargin;
	//  641 1330:aload           24
	//  642 1332:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  643 1335:aload           24
	//  644 1337:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  645 1340:iadd            
	//  646 1341:istore          14
				j6 = view3.getMeasuredWidth() + j5;
	//  647 1343:aload           23
	//  648 1345:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  649 1348:iload           14
	//  650 1350:iadd            
	//  651 1351:istore          16
				int j3 = Math.max(j1, j6);
	//  652 1353:iload           8
	//  653 1355:iload           16
	//  654 1357:invokestatic    #398 <Method int Math.max(int, int)>
	//  655 1360:istore          11
				if(j8 != 0x40000000 && layoutparams1.width == -1)
	//* 656 1362:iload           20
	//* 657 1364:ldc1            #160 <Int 0x40000000>
	//* 658 1366:icmpeq          1384
	//* 659 1369:aload           24
	//* 660 1371:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 661 1374:iconst_m1       
	//* 662 1375:icmpne          1384
					j1 = 1;
	//  663 1378:iconst_1        
	//  664 1379:istore          8
				else
	//* 665 1381:goto            1387
					j1 = 0;
	//  666 1384:iconst_0        
	//  667 1385:istore          8
				if(j1 != 0)
	//* 668 1387:iload           8
	//* 669 1389:ifeq            1399
					j1 = j5;
	//  670 1392:iload           14
	//  671 1394:istore          8
				else
	//* 672 1396:goto            1403
					j1 = j6;
	//  673 1399:iload           16
	//  674 1401:istore          8
				j5 = Math.max(l, j1);
	//  675 1403:iload           6
	//  676 1405:iload           8
	//  677 1407:invokestatic    #398 <Method int Math.max(int, int)>
	//  678 1410:istore          14
				if(i1 != 0 && layoutparams1.width == -1)
	//* 679 1412:iload           7
	//* 680 1414:ifeq            1432
	//* 681 1417:aload           24
	//* 682 1419:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 683 1422:iconst_m1       
	//* 684 1423:icmpne          1432
					l = 1;
	//  685 1426:iconst_1        
	//  686 1427:istore          6
				else
	//* 687 1429:goto            1435
					l = 0;
	//  688 1432:iconst_0        
	//  689 1433:istore          6
				i1 = mTotalLength;
	//  690 1435:aload_0         
	//  691 1436:getfield        #328 <Field int mTotalLength>
	//  692 1439:istore          7
				mTotalLength = Math.max(i1, view3.getMeasuredHeight() + i1 + layoutparams1.topMargin + layoutparams1.bottomMargin + getNextLocationOffset(view3));
	//  693 1441:aload_0         
	//  694 1442:iload           7
	//  695 1444:aload           23
	//  696 1446:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  697 1449:iload           7
	//  698 1451:iadd            
	//  699 1452:aload           24
	//  700 1454:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  701 1457:iadd            
	//  702 1458:aload           24
	//  703 1460:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  704 1463:iadd            
	//  705 1464:aload_0         
	//  706 1465:aload           23
	//  707 1467:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  708 1470:iadd            
	//  709 1471:invokestatic    #398 <Method int Math.max(int, int)>
	//  710 1474:putfield        #328 <Field int mTotalLength>
				j1 = j3;
	//  711 1477:iload           11
	//  712 1479:istore          8
				j3 = j5;
	//  713 1481:iload           14
	//  714 1483:istore          11
				i1 = l;
	//  715 1485:iload           6
	//  716 1487:istore          7
				l = j3;
	//  717 1489:iload           11
	//  718 1491:istore          6
			}

	//  719 1493:iload           10
	//  720 1495:iconst_1        
	//  721 1496:iadd            
	//  722 1497:istore          10
	//* 723 1499:goto            1094
			mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
	//  724 1502:aload_0         
	//  725 1503:aload_0         
	//  726 1504:getfield        #328 <Field int mTotalLength>
	//  727 1507:aload_0         
	//  728 1508:invokevirtual   #280 <Method int getPaddingTop()>
	//  729 1511:aload_0         
	//  730 1512:invokevirtual   #261 <Method int getPaddingBottom()>
	//  731 1515:iadd            
	//  732 1516:iadd            
	//  733 1517:putfield        #328 <Field int mTotalLength>
			j6 = k;
	//  734 1520:iload           5
	//  735 1522:istore          16
			k = l;
	//  736 1524:iload           6
	//  737 1526:istore          5
		}
		if(i1 != 0 || j8 == 0x40000000)
	//* 738 1528:iload           7
	//* 739 1530:ifne            1543
	//* 740 1533:iload           20
	//* 741 1535:ldc1            #160 <Int 0x40000000>
	//* 742 1537:icmpeq          1543
	//* 743 1540:goto            1547
			k = j1;
	//  744 1543:iload           8
	//  745 1545:istore          5
		setMeasuredDimension(View.resolveSizeAndState(Math.max(k + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, j6), i7);
	//  746 1547:aload_0         
	//  747 1548:iload           5
	//  748 1550:aload_0         
	//  749 1551:invokevirtual   #237 <Method int getPaddingLeft()>
	//  750 1554:aload_0         
	//  751 1555:invokevirtual   #243 <Method int getPaddingRight()>
	//  752 1558:iadd            
	//  753 1559:iadd            
	//  754 1560:aload_0         
	//  755 1561:invokevirtual   #413 <Method int getSuggestedMinimumWidth()>
	//  756 1564:invokestatic    #398 <Method int Math.max(int, int)>
	//  757 1567:iload_1         
	//  758 1568:iload           16
	//  759 1570:invokestatic    #417 <Method int View.resolveSizeAndState(int, int, int)>
	//  760 1573:iload           17
	//  761 1575:invokevirtual   #428 <Method void setMeasuredDimension(int, int)>
		if(k3 != 0)
	//* 762 1578:iload           12
	//* 763 1580:ifeq            1590
			forceUniformWidth(k5, j);
	//  764 1583:aload_0         
	//  765 1584:iload           15
	//  766 1586:iload_2         
	//  767 1587:invokespecial   #435 <Method void forceUniformWidth(int, int)>
		return;
	//  768 1590:return          
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
	//   10   18:invokevirtual   #438 <Method void drawDividersVertical(Canvas)>
			return;
	//   11   21:return          
		} else
		{
			drawDividersHorizontal(canvas);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #440 <Method void drawDividersHorizontal(Canvas)>
			return;
	//   15   27:return          
		}
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #444 <Method void ViewGroup.onInitializeAccessibilityEvent(AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/widget/LinearLayoutCompat)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc1            #2   <Class LinearLayoutCompat>
	//    5    8:invokevirtual   #450 <Method String Class.getName()>
	//    6   11:invokevirtual   #456 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    7   14:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #460 <Method void ViewGroup.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
		accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/widget/LinearLayoutCompat)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc1            #2   <Class LinearLayoutCompat>
	//    5    8:invokevirtual   #450 <Method String Class.getName()>
	//    6   11:invokevirtual   #463 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
	//    7   14:return          
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
	//    9   15:invokevirtual   #467 <Method void layoutVertical(int, int, int, int)>
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
	//   16   26:invokevirtual   #469 <Method void layoutHorizontal(int, int, int, int)>
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
	//    7   11:invokevirtual   #472 <Method void measureVertical(int, int)>
			return;
	//    8   14:return          
		} else
		{
			measureHorizontal(i, j);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #474 <Method void measureHorizontal(int, int)>
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
		if(i >= 0 && i < getChildCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            21
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #311 <Method int getChildCount()>
	//*   5    9:icmplt          15
	//*   6   12:goto            21
		{
			mBaselineAlignedChildIndex = i;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #63  <Field int mBaselineAlignedChildIndex>
			return;
	//   10   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #477 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #479 <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append("base aligned child index out of range (0, ");
	//   15   29:aload_2         
	//   16   30:ldc2            #481 <String "base aligned child index out of range (0, ">
	//   17   33:invokevirtual   #485 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			stringbuilder.append(getChildCount());
	//   19   37:aload_2         
	//   20   38:aload_0         
	//   21   39:invokevirtual   #311 <Method int getChildCount()>
	//   22   42:invokevirtual   #488 <Method StringBuilder StringBuilder.append(int)>
	//   23   45:pop             
			stringbuilder.append(")");
	//   24   46:aload_2         
	//   25   47:ldc2            #490 <String ")">
	//   26   50:invokevirtual   #485 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   28   54:new             #492 <Class IllegalArgumentException>
	//   29   57:dup             
	//   30   58:aload_2         
	//   31   59:invokevirtual   #495 <Method String StringBuilder.toString()>
	//   32   62:invokespecial   #496 <Method void IllegalArgumentException(String)>
	//   33   65:athrow          
		}
	}

	public void setDividerDrawable(Drawable drawable)
	{
		if(drawable == mDivider)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #269 <Field Drawable mDivider>
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		mDivider = drawable;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #269 <Field Drawable mDivider>
		boolean flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		if(drawable != null)
	//*  10   16:aload_1         
	//*  11   17:ifnull          39
		{
			mDividerWidth = drawable.getIntrinsicWidth();
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #499 <Method int Drawable.getIntrinsicWidth()>
	//   15   25:putfield        #230 <Field int mDividerWidth>
			mDividerHeight = drawable.getIntrinsicHeight();
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #502 <Method int Drawable.getIntrinsicHeight()>
	//   19   33:putfield        #252 <Field int mDividerHeight>
		} else
	//*  20   36:goto            49
		{
			mDividerWidth = 0;
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:putfield        #230 <Field int mDividerWidth>
			mDividerHeight = 0;
	//   24   44:aload_0         
	//   25   45:iconst_0        
	//   26   46:putfield        #252 <Field int mDividerHeight>
		}
		if(drawable == null)
	//*  27   49:aload_1         
	//*  28   50:ifnonnull       55
			flag = true;
	//   29   53:iconst_1        
	//   30   54:istore_2        
		setWillNotDraw(flag);
	//   31   55:aload_0         
	//   32   56:iload_2         
	//   33   57:invokevirtual   #505 <Method void setWillNotDraw(boolean)>
		requestLayout();
	//   34   60:aload_0         
	//   35   61:invokevirtual   #508 <Method void requestLayout()>
	//   36   64:return          
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
	//*   6   10:ldc2            #358 <Int 0x800007>
	//*   7   13:iload_1         
	//*   8   14:iand            
	//*   9   15:ifne            24
				j = i | 0x800003;
	//   10   18:iload_1         
	//   11   19:ldc2            #510 <Int 0x800003>
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
	//   28   44:invokevirtual   #508 <Method void requestLayout()>
		}
	//   29   47:return          
	}

	public void setHorizontalGravity(int i)
	{
		i &= 0x800007;
	//    0    0:iload_1         
	//    1    1:ldc2            #358 <Int 0x800007>
	//    2    4:iand            
	//    3    5:istore_1        
		if((0x800007 & mGravity) != i)
	//*   4    6:ldc2            #358 <Int 0x800007>
	//*   5    9:aload_0         
	//*   6   10:getfield        #68  <Field int mGravity>
	//*   7   13:iand            
	//*   8   14:iload_1         
	//*   9   15:icmpeq          36
		{
			mGravity = i | mGravity & 0xff7ffff8;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #68  <Field int mGravity>
	//   14   24:ldc2            #512 <Int 0xff7ffff8>
	//   15   27:iand            
	//   16   28:ior             
	//   17   29:putfield        #68  <Field int mGravity>
			requestLayout();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #508 <Method void requestLayout()>
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
	//    8   14:invokevirtual   #508 <Method void requestLayout()>
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
	//    5    9:invokevirtual   #508 <Method void requestLayout()>
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
	//   19   30:invokevirtual   #508 <Method void requestLayout()>
		}
	//   20   33:return          
	}

	public void setWeightSum(float f)
	{
		mWeightSum = Math.max(0.0F, f);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:invokestatic    #520 <Method float Math.max(float, float)>
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
