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
		int i = mOrientation;
	//    0    0:aload_0         
	//    1    1:getfield        #284 <Field int mOrientation>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            21
			return new LayoutParams(-2, -2);
	//    5    9:new             #9   <Class LinearLayoutCompat$LayoutParams>
	//    6   12:dup             
	//    7   13:bipush          -2
	//    8   15:bipush          -2
	//    9   17:invokespecial   #286 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//   10   20:areturn         
		if(i == 1)
	//*  11   21:iload_1         
	//*  12   22:iconst_1        
	//*  13   23:icmpne          37
			return new LayoutParams(-1, -2);
	//   14   26:new             #9   <Class LinearLayoutCompat$LayoutParams>
	//   15   29:dup             
	//   16   30:iconst_m1       
	//   17   31:bipush          -2
	//   18   33:invokespecial   #286 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//   19   36:areturn         
		else
			return null;
	//   20   37:aconst_null     
	//   21   38:areturn         
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
		int i = getChildCount();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #311 <Method int getChildCount()>
	//    8   16:istore_1        
		int k = mBaselineAlignedChildIndex;
	//    9   17:aload_0         
	//   10   18:getfield        #63  <Field int mBaselineAlignedChildIndex>
	//   11   21:istore_2        
		if(i > k)
	//*  12   22:iload_1         
	//*  13   23:iload_2         
	//*  14   24:icmple          185
		{
			View view = getChildAt(k);
	//   15   27:aload_0         
	//   16   28:iload_2         
	//   17   29:invokevirtual   #314 <Method View getChildAt(int)>
	//   18   32:astore          5
			int l = view.getBaseline();
	//   19   34:aload           5
	//   20   36:invokevirtual   #315 <Method int View.getBaseline()>
	//   21   39:istore_3        
			if(l == -1)
	//*  22   40:iload_3         
	//*  23   41:iconst_m1       
	//*  24   42:icmpne          65
				if(mBaselineAlignedChildIndex == 0)
	//*  25   45:aload_0         
	//*  26   46:getfield        #63  <Field int mBaselineAlignedChildIndex>
	//*  27   49:ifne            54
					return -1;
	//   28   52:iconst_m1       
	//   29   53:ireturn         
				else
					throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
	//   30   54:new             #317 <Class RuntimeException>
	//   31   57:dup             
	//   32   58:ldc2            #319 <String "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.">
	//   33   61:invokespecial   #322 <Method void RuntimeException(String)>
	//   34   64:athrow          
			k = mBaselineChildTop;
	//   35   65:aload_0         
	//   36   66:getfield        #65  <Field int mBaselineChildTop>
	//   37   69:istore_2        
			int j = k;
	//   38   70:iload_2         
	//   39   71:istore_1        
			if(mOrientation == 1)
	//*  40   72:aload_0         
	//*  41   73:getfield        #284 <Field int mOrientation>
	//*  42   76:iconst_1        
	//*  43   77:icmpne          169
			{
				int i1 = mGravity & 0x70;
	//   44   80:aload_0         
	//   45   81:getfield        #68  <Field int mGravity>
	//   46   84:bipush          112
	//   47   86:iand            
	//   48   87:istore          4
				j = k;
	//   49   89:iload_2         
	//   50   90:istore_1        
				if(i1 != 48)
	//*  51   91:iload           4
	//*  52   93:bipush          48
	//*  53   95:icmpeq          169
					if(i1 != 16)
	//*  54   98:iload           4
	//*  55  100:bipush          16
	//*  56  102:icmpeq          140
					{
						if(i1 != 80)
	//*  57  105:iload           4
	//*  58  107:bipush          80
	//*  59  109:icmpeq          117
							j = k;
	//   60  112:iload_2         
	//   61  113:istore_1        
						else
	//*  62  114:goto            169
							j = getBottom() - getTop() - getPaddingBottom() - mTotalLength;
	//   63  117:aload_0         
	//   64  118:invokevirtual   #323 <Method int getBottom()>
	//   65  121:aload_0         
	//   66  122:invokevirtual   #324 <Method int getTop()>
	//   67  125:isub            
	//   68  126:aload_0         
	//   69  127:invokevirtual   #261 <Method int getPaddingBottom()>
	//   70  130:isub            
	//   71  131:aload_0         
	//   72  132:getfield        #326 <Field int mTotalLength>
	//   73  135:isub            
	//   74  136:istore_1        
					} else
	//*  75  137:goto            169
					{
						j = k + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - mTotalLength) / 2;
	//   76  140:iload_2         
	//   77  141:aload_0         
	//   78  142:invokevirtual   #323 <Method int getBottom()>
	//   79  145:aload_0         
	//   80  146:invokevirtual   #324 <Method int getTop()>
	//   81  149:isub            
	//   82  150:aload_0         
	//   83  151:invokevirtual   #280 <Method int getPaddingTop()>
	//   84  154:isub            
	//   85  155:aload_0         
	//   86  156:invokevirtual   #261 <Method int getPaddingBottom()>
	//   87  159:isub            
	//   88  160:aload_0         
	//   89  161:getfield        #326 <Field int mTotalLength>
	//   90  164:isub            
	//   91  165:iconst_2        
	//   92  166:idiv            
	//   93  167:iadd            
	//   94  168:istore_1        
					}
			}
			return j + ((LayoutParams)view.getLayoutParams()).topMargin + l;
	//   95  169:iload_1         
	//   96  170:aload           5
	//   97  172:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   98  175:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   99  178:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  100  181:iadd            
	//  101  182:iload_3         
	//  102  183:iadd            
	//  103  184:ireturn         
		} else
		{
			throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
	//  104  185:new             #317 <Class RuntimeException>
	//  105  188:dup             
	//  106  189:ldc2            #328 <String "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.">
	//  107  192:invokespecial   #322 <Method void RuntimeException(String)>
	//  108  195:athrow          
		}
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
	//    2    2:invokevirtual   #314 <Method View getChildAt(int)>
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
	//*  43   63:invokevirtual   #314 <Method View getChildAt(int)>
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
		j = l & 0x70;
	//   22   42:iload           4
	//   23   44:bipush          112
	//   24   46:iand            
	//   25   47:istore_2        
		boolean flag3 = mBaselineAligned;
	//   26   48:aload_0         
	//   27   49:getfield        #61  <Field boolean mBaselineAligned>
	//   28   52:istore          19
		int ai[] = mMaxAscent;
	//   29   54:aload_0         
	//   30   55:getfield        #355 <Field int[] mMaxAscent>
	//   31   58:astore          21
		int ai1[] = mMaxDescent;
	//   32   60:aload_0         
	//   33   61:getfield        #357 <Field int[] mMaxDescent>
	//   34   64:astore          22
		l = GravityCompat.getAbsoluteGravity(0x800007 & l, ViewCompat.getLayoutDirection(((View) (this))));
	//   35   66:ldc2            #358 <Int 0x800007>
	//   36   69:iload           4
	//   37   71:iand            
	//   38   72:aload_0         
	//   39   73:invokestatic    #363 <Method int ViewCompat.getLayoutDirection(View)>
	//   40   76:invokestatic    #368 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   41   79:istore          4
		boolean flag = true;
	//   42   81:iconst_1        
	//   43   82:istore          18
		if(l != 1)
	//*  44   84:iload           4
	//*  45   86:iconst_1        
	//*  46   87:icmpeq          121
		{
			if(l != 5)
	//*  47   90:iload           4
	//*  48   92:iconst_5        
	//*  49   93:icmpeq          104
				i = getPaddingLeft();
	//   50   96:aload_0         
	//   51   97:invokevirtual   #237 <Method int getPaddingLeft()>
	//   52  100:istore_1        
			else
	//*  53  101:goto            137
				i = (getPaddingLeft() + k) - i - mTotalLength;
	//   54  104:aload_0         
	//   55  105:invokevirtual   #237 <Method int getPaddingLeft()>
	//   56  108:iload_3         
	//   57  109:iadd            
	//   58  110:iload_1         
	//   59  111:isub            
	//   60  112:aload_0         
	//   61  113:getfield        #326 <Field int mTotalLength>
	//   62  116:isub            
	//   63  117:istore_1        
		} else
	//*  64  118:goto            137
		{
			i = getPaddingLeft() + (k - i - mTotalLength) / 2;
	//   65  121:aload_0         
	//   66  122:invokevirtual   #237 <Method int getPaddingLeft()>
	//   67  125:iload_3         
	//   68  126:iload_1         
	//   69  127:isub            
	//   70  128:aload_0         
	//   71  129:getfield        #326 <Field int mTotalLength>
	//   72  132:isub            
	//   73  133:iconst_2        
	//   74  134:idiv            
	//   75  135:iadd            
	//   76  136:istore_1        
		}
		int j1;
		byte byte0;
		if(flag4)
	//*  77  137:iload           20
	//*  78  139:ifeq            154
		{
			j1 = k1 - 1;
	//   79  142:iload           8
	//   80  144:iconst_1        
	//   81  145:isub            
	//   82  146:istore          6
			byte0 = -1;
	//   83  148:iconst_m1       
	//   84  149:istore          7
		} else
	//*  85  151:goto            160
		{
			j1 = 0;
	//   86  154:iconst_0        
	//   87  155:istore          6
			byte0 = 1;
	//   88  157:iconst_1        
	//   89  158:istore          7
		}
		l = 0;
	//   90  160:iconst_0        
	//   91  161:istore          4
		k = i2;
	//   92  163:iload           10
	//   93  165:istore_3        
		int i1 = i;
	//   94  166:iload_1         
	//   95  167:istore          5
		for(; l < k1; l++)
	//*  96  169:iload           4
	//*  97  171:iload           8
	//*  98  173:icmpge          544
		{
			int l3 = j1 + byte0 * l;
	//   99  176:iload           6
	//  100  178:iload           7
	//  101  180:iload           4
	//  102  182:imul            
	//  103  183:iadd            
	//  104  184:istore          16
			View view = getVirtualChildAt(l3);
	//  105  186:aload_0         
	//  106  187:iload           16
	//  107  189:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  108  192:astore          23
			if(view == null)
	//* 109  194:aload           23
	//* 110  196:ifnonnull       213
			{
				i1 += measureNullChild(l3);
	//  111  199:iload           5
	//  112  201:aload_0         
	//  113  202:iload           16
	//  114  204:invokevirtual   #372 <Method int measureNullChild(int)>
	//  115  207:iadd            
	//  116  208:istore          5
				continue;
	//  117  210:goto            535
			}
			boolean flag2;
			if(view.getVisibility() != 8)
	//* 118  213:aload           23
	//* 119  215:invokevirtual   #174 <Method int View.getVisibility()>
	//* 120  218:bipush          8
	//* 121  220:icmpeq          532
			{
				int k3 = view.getMeasuredWidth();
	//  122  223:aload           23
	//  123  225:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  124  228:istore          15
				int i4 = view.getMeasuredHeight();
	//  125  230:aload           23
	//  126  232:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  127  235:istore          17
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//  128  237:aload           23
	//  129  239:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  130  242:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  131  245:astore          24
				if(flag3 && layoutparams.height != -1)
	//* 132  247:iload           19
	//* 133  249:ifeq            270
	//* 134  252:aload           24
	//* 135  254:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 136  257:iconst_m1       
	//* 137  258:icmpeq          270
					i = view.getBaseline();
	//  138  261:aload           23
	//  139  263:invokevirtual   #315 <Method int View.getBaseline()>
	//  140  266:istore_1        
				else
	//* 141  267:goto            272
					i = -1;
	//  142  270:iconst_m1       
	//  143  271:istore_1        
				int j2 = layoutparams.gravity;
	//  144  272:aload           24
	//  145  274:getfield        #375 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//  146  277:istore          11
				int l1 = j2;
	//  147  279:iload           11
	//  148  281:istore          9
				if(j2 < 0)
	//* 149  283:iload           11
	//* 150  285:ifge            291
					l1 = j;
	//  151  288:iload_2         
	//  152  289:istore          9
				l1 &= 0x70;
	//  153  291:iload           9
	//  154  293:bipush          112
	//  155  295:iand            
	//  156  296:istore          9
				if(l1 != 16)
	//* 157  298:iload           9
	//* 158  300:bipush          16
	//* 159  302:icmpeq          407
				{
					if(l1 != 48)
	//* 160  305:iload           9
	//* 161  307:bipush          48
	//* 162  309:icmpeq          374
					{
						if(l1 != 80)
	//* 163  312:iload           9
	//* 164  314:bipush          80
	//* 165  316:icmpeq          324
						{
							i = k;
	//  166  319:iload_3         
	//  167  320:istore_1        
						} else
	//* 168  321:goto            435
						{
							l1 = l2 - i3 - i4 - layoutparams.bottomMargin;
	//  169  324:iload           12
	//  170  326:iload           13
	//  171  328:isub            
	//  172  329:iload           17
	//  173  331:isub            
	//  174  332:aload           24
	//  175  334:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  176  337:isub            
	//  177  338:istore          9
							if(i != -1)
	//* 178  340:iload_1         
	//* 179  341:iconst_m1       
	//* 180  342:icmpeq          368
							{
								int k2 = view.getMeasuredHeight();
	//  181  345:aload           23
	//  182  347:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  183  350:istore          11
								i = l1 - (ai1[2] - (k2 - i));
	//  184  352:iload           9
	//  185  354:aload           22
	//  186  356:iconst_2        
	//  187  357:iaload          
	//  188  358:iload           11
	//  189  360:iload_1         
	//  190  361:isub            
	//  191  362:isub            
	//  192  363:isub            
	//  193  364:istore_1        
							} else
	//* 194  365:goto            435
							{
								i = l1;
	//  195  368:iload           9
	//  196  370:istore_1        
							}
						}
					} else
	//* 197  371:goto            435
					{
						l1 = layoutparams.topMargin + k;
	//  198  374:aload           24
	//  199  376:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  200  379:iload_3         
	//  201  380:iadd            
	//  202  381:istore          9
						if(i != -1)
	//* 203  383:iload_1         
	//* 204  384:iconst_m1       
	//* 205  385:icmpeq          401
							i = l1 + (ai[1] - i);
	//  206  388:iload           9
	//  207  390:aload           21
	//  208  392:iconst_1        
	//  209  393:iaload          
	//  210  394:iload_1         
	//  211  395:isub            
	//  212  396:iadd            
	//  213  397:istore_1        
						else
	//* 214  398:goto            435
							i = l1;
	//  215  401:iload           9
	//  216  403:istore_1        
					}
				} else
	//* 217  404:goto            435
				{
					i = ((l2 - i2 - j3 - i4) / 2 + k + layoutparams.topMargin) - layoutparams.bottomMargin;
	//  218  407:iload           12
	//  219  409:iload           10
	//  220  411:isub            
	//  221  412:iload           14
	//  222  414:isub            
	//  223  415:iload           17
	//  224  417:isub            
	//  225  418:iconst_2        
	//  226  419:idiv            
	//  227  420:iload_3         
	//  228  421:iadd            
	//  229  422:aload           24
	//  230  424:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  231  427:iadd            
	//  232  428:aload           24
	//  233  430:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  234  433:isub            
	//  235  434:istore_1        
				}
				boolean flag1 = true;
	//  236  435:iconst_1        
	//  237  436:istore          18
				l1 = i1;
	//  238  438:iload           5
	//  239  440:istore          9
				if(hasDividerBeforeChildAt(l3))
	//* 240  442:aload_0         
	//* 241  443:iload           16
	//* 242  445:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 243  448:ifeq            460
					l1 = i1 + mDividerWidth;
	//  244  451:iload           5
	//  245  453:aload_0         
	//  246  454:getfield        #230 <Field int mDividerWidth>
	//  247  457:iadd            
	//  248  458:istore          9
				i1 = layoutparams.leftMargin + l1;
	//  249  460:aload           24
	//  250  462:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  251  465:iload           9
	//  252  467:iadd            
	//  253  468:istore          5
				setChildFrame(view, i1 + getLocationOffset(view), i, k3, i4);
	//  254  470:aload_0         
	//  255  471:aload           23
	//  256  473:iload           5
	//  257  475:aload_0         
	//  258  476:aload           23
	//  259  478:invokevirtual   #377 <Method int getLocationOffset(View)>
	//  260  481:iadd            
	//  261  482:iload_1         
	//  262  483:iload           15
	//  263  485:iload           17
	//  264  487:invokespecial   #379 <Method void setChildFrame(View, int, int, int, int)>
				i = layoutparams.rightMargin;
	//  265  490:aload           24
	//  266  492:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  267  495:istore_1        
				l1 = getNextLocationOffset(view);
	//  268  496:aload_0         
	//  269  497:aload           23
	//  270  499:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  271  502:istore          9
				l += getChildrenSkipCount(view, l3);
	//  272  504:iload           4
	//  273  506:aload_0         
	//  274  507:aload           23
	//  275  509:iload           16
	//  276  511:invokevirtual   #383 <Method int getChildrenSkipCount(View, int)>
	//  277  514:iadd            
	//  278  515:istore          4
				i1 += k3 + i + l1;
	//  279  517:iload           5
	//  280  519:iload           15
	//  281  521:iload_1         
	//  282  522:iadd            
	//  283  523:iload           9
	//  284  525:iadd            
	//  285  526:iadd            
	//  286  527:istore          5
			} else
	//* 287  529:goto            535
			{
				flag2 = true;
	//  288  532:iconst_1        
	//  289  533:istore          18
			}
		}

	//  290  535:iload           4
	//  291  537:iconst_1        
	//  292  538:iadd            
	//  293  539:istore          4
	//* 294  541:goto            169
	//  295  544:return          
	}

	void layoutVertical(int i, int j, int k, int l)
	{
		int i1 = getPaddingLeft();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #237 <Method int getPaddingLeft()>
	//    2    4:istore          5
		int j1 = k - i;
	//    3    6:iload_3         
	//    4    7:iload_1         
	//    5    8:isub            
	//    6    9:istore          6
		int k1 = getPaddingRight();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #243 <Method int getPaddingRight()>
	//    9   15:istore          7
		int l1 = getPaddingRight();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #243 <Method int getPaddingRight()>
	//   12   21:istore          8
		int i2 = getVirtualChildCount();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #206 <Method int getVirtualChildCount()>
	//   15   27:istore          9
		int j2 = mGravity;
	//   16   29:aload_0         
	//   17   30:getfield        #68  <Field int mGravity>
	//   18   33:istore          10
		i = j2 & 0x70;
	//   19   35:iload           10
	//   20   37:bipush          112
	//   21   39:iand            
	//   22   40:istore_1        
		if(i != 16)
	//*  23   41:iload_1         
	//*  24   42:bipush          16
	//*  25   44:icmpeq          79
		{
			if(i != 80)
	//*  26   47:iload_1         
	//*  27   48:bipush          80
	//*  28   50:icmpeq          61
				i = getPaddingTop();
	//   29   53:aload_0         
	//   30   54:invokevirtual   #280 <Method int getPaddingTop()>
	//   31   57:istore_1        
			else
	//*  32   58:goto            96
				i = (getPaddingTop() + l) - j - mTotalLength;
	//   33   61:aload_0         
	//   34   62:invokevirtual   #280 <Method int getPaddingTop()>
	//   35   65:iload           4
	//   36   67:iadd            
	//   37   68:iload_2         
	//   38   69:isub            
	//   39   70:aload_0         
	//   40   71:getfield        #326 <Field int mTotalLength>
	//   41   74:isub            
	//   42   75:istore_1        
		} else
	//*  43   76:goto            96
		{
			i = getPaddingTop() + (l - j - mTotalLength) / 2;
	//   44   79:aload_0         
	//   45   80:invokevirtual   #280 <Method int getPaddingTop()>
	//   46   83:iload           4
	//   47   85:iload_2         
	//   48   86:isub            
	//   49   87:aload_0         
	//   50   88:getfield        #326 <Field int mTotalLength>
	//   51   91:isub            
	//   52   92:iconst_2        
	//   53   93:idiv            
	//   54   94:iadd            
	//   55   95:istore_1        
		}
		for(j = 0; j < i2; j++)
	//*  56   96:iconst_0        
	//*  57   97:istore_2        
	//*  58   98:iload_2         
	//*  59   99:iload           9
	//*  60  101:icmpge          355
		{
			View view = getVirtualChildAt(j);
	//   61  104:aload_0         
	//   62  105:iload_2         
	//   63  106:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   64  109:astore          13
			if(view == null)
	//*  65  111:aload           13
	//*  66  113:ifnonnull       127
			{
				i += measureNullChild(j);
	//   67  116:iload_1         
	//   68  117:aload_0         
	//   69  118:iload_2         
	//   70  119:invokevirtual   #372 <Method int measureNullChild(int)>
	//   71  122:iadd            
	//   72  123:istore_1        
				continue;
	//   73  124:goto            348
			}
			if(view.getVisibility() == 8)
				continue;
	//   74  127:aload           13
	//   75  129:invokevirtual   #174 <Method int View.getVisibility()>
	//   76  132:bipush          8
	//   77  134:icmpeq          348
			int l2 = view.getMeasuredWidth();
	//   78  137:aload           13
	//   79  139:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//   80  142:istore          12
			int k2 = view.getMeasuredHeight();
	//   81  144:aload           13
	//   82  146:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//   83  149:istore          11
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   84  151:aload           13
	//   85  153:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   86  156:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   87  159:astore          14
			l = layoutparams.gravity;
	//   88  161:aload           14
	//   89  163:getfield        #375 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//   90  166:istore          4
			k = l;
	//   91  168:iload           4
	//   92  170:istore_3        
			if(l < 0)
	//*  93  171:iload           4
	//*  94  173:ifge            183
				k = j2 & 0x800007;
	//   95  176:iload           10
	//   96  178:ldc2            #358 <Int 0x800007>
	//   97  181:iand            
	//   98  182:istore_3        
			k = GravityCompat.getAbsoluteGravity(k, ViewCompat.getLayoutDirection(((View) (this)))) & 7;
	//   99  183:iload_3         
	//  100  184:aload_0         
	//  101  185:invokestatic    #363 <Method int ViewCompat.getLayoutDirection(View)>
	//  102  188:invokestatic    #368 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//  103  191:bipush          7
	//  104  193:iand            
	//  105  194:istore_3        
			if(k != 1)
	//* 106  195:iload_3         
	//* 107  196:iconst_1        
	//* 108  197:icmpeq          235
			{
				if(k != 5)
	//* 109  200:iload_3         
	//* 110  201:iconst_5        
	//* 111  202:icmpeq          217
					k = layoutparams.leftMargin + i1;
	//  112  205:aload           14
	//  113  207:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  114  210:iload           5
	//  115  212:iadd            
	//  116  213:istore_3        
				else
	//* 117  214:goto            264
					k = j1 - k1 - l2 - layoutparams.rightMargin;
	//  118  217:iload           6
	//  119  219:iload           7
	//  120  221:isub            
	//  121  222:iload           12
	//  122  224:isub            
	//  123  225:aload           14
	//  124  227:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  125  230:isub            
	//  126  231:istore_3        
			} else
	//* 127  232:goto            264
			{
				k = ((j1 - i1 - l1 - l2) / 2 + i1 + layoutparams.leftMargin) - layoutparams.rightMargin;
	//  128  235:iload           6
	//  129  237:iload           5
	//  130  239:isub            
	//  131  240:iload           8
	//  132  242:isub            
	//  133  243:iload           12
	//  134  245:isub            
	//  135  246:iconst_2        
	//  136  247:idiv            
	//  137  248:iload           5
	//  138  250:iadd            
	//  139  251:aload           14
	//  140  253:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  141  256:iadd            
	//  142  257:aload           14
	//  143  259:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  144  262:isub            
	//  145  263:istore_3        
			}
			l = i;
	//  146  264:iload_1         
	//  147  265:istore          4
			if(hasDividerBeforeChildAt(j))
	//* 148  267:aload_0         
	//* 149  268:iload_2         
	//* 150  269:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 151  272:ifeq            283
				l = i + mDividerHeight;
	//  152  275:iload_1         
	//  153  276:aload_0         
	//  154  277:getfield        #252 <Field int mDividerHeight>
	//  155  280:iadd            
	//  156  281:istore          4
			i = l + layoutparams.topMargin;
	//  157  283:iload           4
	//  158  285:aload           14
	//  159  287:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  160  290:iadd            
	//  161  291:istore_1        
			setChildFrame(view, k, i + getLocationOffset(view), l2, k2);
	//  162  292:aload_0         
	//  163  293:aload           13
	//  164  295:iload_3         
	//  165  296:iload_1         
	//  166  297:aload_0         
	//  167  298:aload           13
	//  168  300:invokevirtual   #377 <Method int getLocationOffset(View)>
	//  169  303:iadd            
	//  170  304:iload           12
	//  171  306:iload           11
	//  172  308:invokespecial   #379 <Method void setChildFrame(View, int, int, int, int)>
			k = layoutparams.bottomMargin;
	//  173  311:aload           14
	//  174  313:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  175  316:istore_3        
			l = getNextLocationOffset(view);
	//  176  317:aload_0         
	//  177  318:aload           13
	//  178  320:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  179  323:istore          4
			j += getChildrenSkipCount(view, j);
	//  180  325:iload_2         
	//  181  326:aload_0         
	//  182  327:aload           13
	//  183  329:iload_2         
	//  184  330:invokevirtual   #383 <Method int getChildrenSkipCount(View, int)>
	//  185  333:iadd            
	//  186  334:istore_2        
			i += k2 + k + l;
	//  187  335:iload_1         
	//  188  336:iload           11
	//  189  338:iload_3         
	//  190  339:iadd            
	//  191  340:iload           4
	//  192  342:iadd            
	//  193  343:iadd            
	//  194  344:istore_1        
		}

	//  195  345:goto            348
	//  196  348:iload_2         
	//  197  349:iconst_1        
	//  198  350:iadd            
	//  199  351:istore_2        
	//* 200  352:goto            98
	//  201  355:return          
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
	//    2    2:putfield        #326 <Field int mTotalLength>
		int k3 = getVirtualChildCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #206 <Method int getVirtualChildCount()>
	//    5    9:istore          15
		int j8 = android.view.View.MeasureSpec.getMode(i);
	//    6   11:iload_1         
	//    7   12:invokestatic    #390 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   15:istore          21
		int i8 = android.view.View.MeasureSpec.getMode(j);
	//    9   17:iload_2         
	//   10   18:invokestatic    #390 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   11   21:istore          20
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
		int ai[] = mMaxAscent;
	//   26   51:aload_0         
	//   27   52:getfield        #355 <Field int[] mMaxAscent>
	//   28   55:astore          27
		Object obj = ((Object) (mMaxDescent));
	//   29   57:aload_0         
	//   30   58:getfield        #357 <Field int[] mMaxDescent>
	//   31   61:astore          25
		ai[3] = -1;
	//   32   63:aload           27
	//   33   65:iconst_3        
	//   34   66:iconst_m1       
	//   35   67:iastore         
		ai[2] = -1;
	//   36   68:aload           27
	//   37   70:iconst_2        
	//   38   71:iconst_m1       
	//   39   72:iastore         
		ai[1] = -1;
	//   40   73:aload           27
	//   41   75:iconst_1        
	//   42   76:iconst_m1       
	//   43   77:iastore         
		ai[0] = -1;
	//   44   78:aload           27
	//   45   80:iconst_0        
	//   46   81:iconst_m1       
	//   47   82:iastore         
		obj[3] = -1;
	//   48   83:aload           25
	//   49   85:iconst_3        
	//   50   86:iconst_m1       
	//   51   87:iastore         
		obj[2] = -1;
	//   52   88:aload           25
	//   53   90:iconst_2        
	//   54   91:iconst_m1       
	//   55   92:iastore         
		obj[1] = -1;
	//   56   93:aload           25
	//   57   95:iconst_1        
	//   58   96:iconst_m1       
	//   59   97:iastore         
		obj[0] = -1;
	//   60   98:aload           25
	//   61  100:iconst_0        
	//   62  101:iconst_m1       
	//   63  102:iastore         
		boolean flag2 = mBaselineAligned;
	//   64  103:aload_0         
	//   65  104:getfield        #61  <Field boolean mBaselineAligned>
	//   66  107:istore          23
		boolean flag3 = mUseLargestChild;
	//   67  109:aload_0         
	//   68  110:getfield        #125 <Field boolean mUseLargestChild>
	//   69  113:istore          24
		boolean flag;
		if(j8 == 0x40000000)
	//*  70  115:iload           21
	//*  71  117:ldc1            #160 <Int 0x40000000>
	//*  72  119:icmpne          128
			flag = true;
	//   73  122:iconst_1        
	//   74  123:istore          14
		else
	//*  75  125:goto            131
			flag = false;
	//   76  128:iconst_0        
	//   77  129:istore          14
		int i1 = 0;
	//   78  131:iconst_0        
	//   79  132:istore          7
		int l1 = i1;
	//   80  134:iload           7
	//   81  136:istore          10
		int i3 = l1;
	//   82  138:iload           10
	//   83  140:istore          13
		int l = i3;
	//   84  142:iload           13
	//   85  144:istore          6
		int k1 = l;
	//   86  146:iload           6
	//   87  148:istore          9
		int i2 = k1;
	//   88  150:iload           9
	//   89  152:istore          11
		int l2 = i2;
	//   90  154:iload           11
	//   91  156:istore          12
		int j1 = l2;
	//   92  158:iload           12
	//   93  160:istore          8
		int k = 1;
	//   94  162:iconst_1        
	//   95  163:istore          5
		float f = 0.0F;
	//   96  165:fconst_0        
	//   97  166:fstore_3        
		for(; i1 < k3; i1++)
	//*  98  167:iload           7
	//*  99  169:iload           15
	//* 100  171:icmpge          855
		{
			View view = getVirtualChildAt(i1);
	//  101  174:aload_0         
	//  102  175:iload           7
	//  103  177:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  104  180:astore          26
			if(view == null)
	//* 105  182:aload           26
	//* 106  184:ifnonnull       205
			{
				mTotalLength = mTotalLength + measureNullChild(i1);
	//  107  187:aload_0         
	//  108  188:aload_0         
	//  109  189:getfield        #326 <Field int mTotalLength>
	//  110  192:aload_0         
	//  111  193:iload           7
	//  112  195:invokevirtual   #372 <Method int measureNullChild(int)>
	//  113  198:iadd            
	//  114  199:putfield        #326 <Field int mTotalLength>
				continue;
	//  115  202:goto            846
			}
			if(view.getVisibility() == 8)
	//* 116  205:aload           26
	//* 117  207:invokevirtual   #174 <Method int View.getVisibility()>
	//* 118  210:bipush          8
	//* 119  212:icmpne          231
			{
				i1 += getChildrenSkipCount(view, i1);
	//  120  215:iload           7
	//  121  217:aload_0         
	//  122  218:aload           26
	//  123  220:iload           7
	//  124  222:invokevirtual   #383 <Method int getChildrenSkipCount(View, int)>
	//  125  225:iadd            
	//  126  226:istore          7
				continue;
	//  127  228:goto            846
			}
			if(hasDividerBeforeChildAt(i1))
	//* 128  231:aload_0         
	//* 129  232:iload           7
	//* 130  234:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 131  237:ifeq            253
				mTotalLength = mTotalLength + mDividerWidth;
	//  132  240:aload_0         
	//  133  241:aload_0         
	//  134  242:getfield        #326 <Field int mTotalLength>
	//  135  245:aload_0         
	//  136  246:getfield        #230 <Field int mDividerWidth>
	//  137  249:iadd            
	//  138  250:putfield        #326 <Field int mTotalLength>
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//  139  253:aload           26
	//  140  255:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  141  258:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  142  261:astore          28
			f += layoutparams.weight;
	//  143  263:fload_3         
	//  144  264:aload           28
	//  145  266:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  146  269:fadd            
	//  147  270:fstore_3        
			if(j8 == 0x40000000 && layoutparams.width == 0 && layoutparams.weight > 0.0F)
	//* 148  271:iload           21
	//* 149  273:ldc1            #160 <Int 0x40000000>
	//* 150  275:icmpne          383
	//* 151  278:aload           28
	//* 152  280:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 153  283:ifne            383
	//* 154  286:aload           28
	//* 155  288:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 156  291:fconst_0        
	//* 157  292:fcmpl           
	//* 158  293:ifle            383
			{
				if(flag)
	//* 159  296:iload           14
	//* 160  298:ifeq            324
				{
					mTotalLength = mTotalLength + (layoutparams.leftMargin + layoutparams.rightMargin);
	//  161  301:aload_0         
	//  162  302:aload_0         
	//  163  303:getfield        #326 <Field int mTotalLength>
	//  164  306:aload           28
	//  165  308:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  166  311:aload           28
	//  167  313:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  168  316:iadd            
	//  169  317:iadd            
	//  170  318:putfield        #326 <Field int mTotalLength>
				} else
	//* 171  321:goto            353
				{
					int j4 = mTotalLength;
	//  172  324:aload_0         
	//  173  325:getfield        #326 <Field int mTotalLength>
	//  174  328:istore          16
					mTotalLength = Math.max(j4, layoutparams.leftMargin + j4 + layoutparams.rightMargin);
	//  175  330:aload_0         
	//  176  331:iload           16
	//  177  333:aload           28
	//  178  335:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  179  338:iload           16
	//  180  340:iadd            
	//  181  341:aload           28
	//  182  343:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  183  346:iadd            
	//  184  347:invokestatic    #398 <Method int Math.max(int, int)>
	//  185  350:putfield        #326 <Field int mTotalLength>
				}
				if(flag2)
	//* 186  353:iload           23
	//* 187  355:ifeq            377
				{
					int k4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//  188  358:iconst_0        
	//  189  359:iconst_0        
	//  190  360:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  191  363:istore          16
					view.measure(k4, k4);
	//  192  365:aload           26
	//  193  367:iload           16
	//  194  369:iload           16
	//  195  371:invokevirtual   #401 <Method void View.measure(int, int)>
				} else
	//* 196  374:goto            566
				{
					i2 = 1;
	//  197  377:iconst_1        
	//  198  378:istore          11
				}
			} else
	//* 199  380:goto            566
			{
				int l4;
				if(layoutparams.width == 0 && layoutparams.weight > 0.0F)
	//* 200  383:aload           28
	//* 201  385:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 202  388:ifne            414
	//* 203  391:aload           28
	//* 204  393:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 205  396:fconst_0        
	//* 206  397:fcmpl           
	//* 207  398:ifle            414
				{
					layoutparams.width = -2;
	//  208  401:aload           28
	//  209  403:bipush          -2
	//  210  405:putfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
					l4 = 0;
	//  211  408:iconst_0        
	//  212  409:istore          16
				} else
	//* 213  411:goto            419
				{
					l4 = 0x80000000;
	//  214  414:ldc2            #402 <Int 0x80000000>
	//  215  417:istore          16
				}
				int i6;
				if(f == 0.0F)
	//* 216  419:fload_3         
	//* 217  420:fconst_0        
	//* 218  421:fcmpl           
	//* 219  422:ifne            434
					i6 = mTotalLength;
	//  220  425:aload_0         
	//  221  426:getfield        #326 <Field int mTotalLength>
	//  222  429:istore          17
				else
	//* 223  431:goto            437
					i6 = 0;
	//  224  434:iconst_0        
	//  225  435:istore          17
				measureChildBeforeLayout(view, i1, i, i6, j, 0);
	//  226  437:aload_0         
	//  227  438:aload           26
	//  228  440:iload           7
	//  229  442:iload_1         
	//  230  443:iload           17
	//  231  445:iload_2         
	//  232  446:iconst_0        
	//  233  447:invokevirtual   #404 <Method void measureChildBeforeLayout(View, int, int, int, int, int)>
				if(l4 != 0x80000000)
	//* 234  450:iload           16
	//* 235  452:ldc2            #402 <Int 0x80000000>
	//* 236  455:icmpeq          465
					layoutparams.width = l4;
	//  237  458:aload           28
	//  238  460:iload           16
	//  239  462:putfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
				l4 = view.getMeasuredWidth();
	//  240  465:aload           26
	//  241  467:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  242  470:istore          16
				if(flag)
	//* 243  472:iload           14
	//* 244  474:ifeq            510
				{
					mTotalLength = mTotalLength + (layoutparams.leftMargin + l4 + layoutparams.rightMargin + getNextLocationOffset(view));
	//  245  477:aload_0         
	//  246  478:aload_0         
	//  247  479:getfield        #326 <Field int mTotalLength>
	//  248  482:aload           28
	//  249  484:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  250  487:iload           16
	//  251  489:iadd            
	//  252  490:aload           28
	//  253  492:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  254  495:iadd            
	//  255  496:aload_0         
	//  256  497:aload           26
	//  257  499:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  258  502:iadd            
	//  259  503:iadd            
	//  260  504:putfield        #326 <Field int mTotalLength>
				} else
	//* 261  507:goto            549
				{
					int j6 = mTotalLength;
	//  262  510:aload_0         
	//  263  511:getfield        #326 <Field int mTotalLength>
	//  264  514:istore          17
					mTotalLength = Math.max(j6, j6 + l4 + layoutparams.leftMargin + layoutparams.rightMargin + getNextLocationOffset(view));
	//  265  516:aload_0         
	//  266  517:iload           17
	//  267  519:iload           17
	//  268  521:iload           16
	//  269  523:iadd            
	//  270  524:aload           28
	//  271  526:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  272  529:iadd            
	//  273  530:aload           28
	//  274  532:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  275  535:iadd            
	//  276  536:aload_0         
	//  277  537:aload           26
	//  278  539:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  279  542:iadd            
	//  280  543:invokestatic    #398 <Method int Math.max(int, int)>
	//  281  546:putfield        #326 <Field int mTotalLength>
				}
				if(flag3)
	//* 282  549:iload           24
	//* 283  551:ifeq            566
					l1 = Math.max(l4, l1);
	//  284  554:iload           16
	//  285  556:iload           10
	//  286  558:invokestatic    #398 <Method int Math.max(int, int)>
	//  287  561:istore          10
			}
	//* 288  563:goto            566
			int i5 = i1;
	//  289  566:iload           7
	//  290  568:istore          16
			if(i8 != 0x40000000 && layoutparams.height == -1)
	//* 291  570:iload           20
	//* 292  572:ldc1            #160 <Int 0x40000000>
	//* 293  574:icmpeq          596
	//* 294  577:aload           28
	//* 295  579:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 296  582:iconst_m1       
	//* 297  583:icmpne          596
			{
				i1 = 1;
	//  298  586:iconst_1        
	//  299  587:istore          7
				j1 = i1;
	//  300  589:iload           7
	//  301  591:istore          8
			} else
	//* 302  593:goto            599
			{
				i1 = 0;
	//  303  596:iconst_0        
	//  304  597:istore          7
			}
			int k6 = layoutparams.topMargin + layoutparams.bottomMargin;
	//  305  599:aload           28
	//  306  601:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  307  604:aload           28
	//  308  606:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  309  609:iadd            
	//  310  610:istore          17
			int j7 = view.getMeasuredHeight() + k6;
	//  311  612:aload           26
	//  312  614:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  313  617:iload           17
	//  314  619:iadd            
	//  315  620:istore          18
			int l7 = View.combineMeasuredStates(l2, view.getMeasuredState());
	//  316  622:iload           12
	//  317  624:aload           26
	//  318  626:invokevirtual   #407 <Method int View.getMeasuredState()>
	//  319  629:invokestatic    #410 <Method int View.combineMeasuredStates(int, int)>
	//  320  632:istore          19
			if(flag2)
	//* 321  634:iload           23
	//* 322  636:ifeq            729
			{
				int k8 = view.getBaseline();
	//  323  639:aload           26
	//  324  641:invokevirtual   #315 <Method int View.getBaseline()>
	//  325  644:istore          22
				if(k8 != -1)
	//* 326  646:iload           22
	//* 327  648:iconst_m1       
	//* 328  649:icmpeq          726
				{
					if(layoutparams.gravity < 0)
	//* 329  652:aload           28
	//* 330  654:getfield        #375 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//* 331  657:ifge            669
						l2 = mGravity;
	//  332  660:aload_0         
	//  333  661:getfield        #68  <Field int mGravity>
	//  334  664:istore          12
					else
	//* 335  666:goto            676
						l2 = layoutparams.gravity;
	//  336  669:aload           28
	//  337  671:getfield        #375 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//  338  674:istore          12
					l2 = ((l2 & 0x70) >> 4 & -2) >> 1;
	//  339  676:iload           12
	//  340  678:bipush          112
	//  341  680:iand            
	//  342  681:iconst_4        
	//  343  682:ishr            
	//  344  683:bipush          -2
	//  345  685:iand            
	//  346  686:iconst_1        
	//  347  687:ishr            
	//  348  688:istore          12
					ai[l2] = Math.max(ai[l2], k8);
	//  349  690:aload           27
	//  350  692:iload           12
	//  351  694:aload           27
	//  352  696:iload           12
	//  353  698:iaload          
	//  354  699:iload           22
	//  355  701:invokestatic    #398 <Method int Math.max(int, int)>
	//  356  704:iastore         
					obj[l2] = Math.max(obj[l2], j7 - k8);
	//  357  705:aload           25
	//  358  707:iload           12
	//  359  709:aload           25
	//  360  711:iload           12
	//  361  713:iaload          
	//  362  714:iload           18
	//  363  716:iload           22
	//  364  718:isub            
	//  365  719:invokestatic    #398 <Method int Math.max(int, int)>
	//  366  722:iastore         
				}
			}
	//* 367  723:goto            729
	//* 368  726:goto            729
			i3 = Math.max(i3, j7);
	//  369  729:iload           13
	//  370  731:iload           18
	//  371  733:invokestatic    #398 <Method int Math.max(int, int)>
	//  372  736:istore          13
			if(k && layoutparams.height == -1)
	//* 373  738:iload           5
	//* 374  740:ifeq            758
	//* 375  743:aload           28
	//* 376  745:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 377  748:iconst_m1       
	//* 378  749:icmpne          758
				k = 1;
	//  379  752:iconst_1        
	//  380  753:istore          5
			else
	//* 381  755:goto            761
				k = 0;
	//  382  758:iconst_0        
	//  383  759:istore          5
			if(layoutparams.weight > 0.0F)
	//* 384  761:aload           28
	//* 385  763:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 386  766:fconst_0        
	//* 387  767:fcmpl           
	//* 388  768:ifle            795
			{
				if(i1 == 0)
	//* 389  771:iload           7
	//* 390  773:ifeq            779
	//* 391  776:goto            783
					k6 = j7;
	//  392  779:iload           18
	//  393  781:istore          17
				i1 = Math.max(k1, k6);
	//  394  783:iload           9
	//  395  785:iload           17
	//  396  787:invokestatic    #398 <Method int Math.max(int, int)>
	//  397  790:istore          7
			} else
	//* 398  792:goto            817
			{
				if(i1 != 0)
	//* 399  795:iload           7
	//* 400  797:ifeq            804
					j7 = k6;
	//  401  800:iload           17
	//  402  802:istore          18
				l = Math.max(l, j7);
	//  403  804:iload           6
	//  404  806:iload           18
	//  405  808:invokestatic    #398 <Method int Math.max(int, int)>
	//  406  811:istore          6
				i1 = k1;
	//  407  813:iload           9
	//  408  815:istore          7
			}
			k1 = getChildrenSkipCount(view, i5);
	//  409  817:aload_0         
	//  410  818:aload           26
	//  411  820:iload           16
	//  412  822:invokevirtual   #383 <Method int getChildrenSkipCount(View, int)>
	//  413  825:istore          9
			l2 = l7;
	//  414  827:iload           19
	//  415  829:istore          12
			i5 = k1 + i5;
	//  416  831:iload           9
	//  417  833:iload           16
	//  418  835:iadd            
	//  419  836:istore          16
			k1 = i1;
	//  420  838:iload           7
	//  421  840:istore          9
			i1 = i5;
	//  422  842:iload           16
	//  423  844:istore          7
		}

	//  424  846:iload           7
	//  425  848:iconst_1        
	//  426  849:iadd            
	//  427  850:istore          7
	//* 428  852:goto            167
		i1 = i3;
	//  429  855:iload           13
	//  430  857:istore          7
		if(mTotalLength > 0 && hasDividerBeforeChildAt(k3))
	//* 431  859:aload_0         
	//* 432  860:getfield        #326 <Field int mTotalLength>
	//* 433  863:ifle            888
	//* 434  866:aload_0         
	//* 435  867:iload           15
	//* 436  869:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 437  872:ifeq            888
			mTotalLength = mTotalLength + mDividerWidth;
	//  438  875:aload_0         
	//  439  876:aload_0         
	//  440  877:getfield        #326 <Field int mTotalLength>
	//  441  880:aload_0         
	//  442  881:getfield        #230 <Field int mDividerWidth>
	//  443  884:iadd            
	//  444  885:putfield        #326 <Field int mTotalLength>
		if(ai[1] != -1 || ai[0] != -1 || ai[2] != -1 || ai[3] != -1)
	//* 445  888:aload           27
	//* 446  890:iconst_1        
	//* 447  891:iaload          
	//* 448  892:iconst_m1       
	//* 449  893:icmpne          926
	//* 450  896:aload           27
	//* 451  898:iconst_0        
	//* 452  899:iaload          
	//* 453  900:iconst_m1       
	//* 454  901:icmpne          926
	//* 455  904:aload           27
	//* 456  906:iconst_2        
	//* 457  907:iaload          
	//* 458  908:iconst_m1       
	//* 459  909:icmpne          926
	//* 460  912:aload           27
	//* 461  914:iconst_3        
	//* 462  915:iaload          
	//* 463  916:iconst_m1       
	//* 464  917:icmpeq          923
	//* 465  920:goto            926
	//* 466  923:goto            984
			i1 = Math.max(i1, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(obj[3], Math.max(obj[0], Math.max(obj[1], obj[2]))));
	//  467  926:iload           7
	//  468  928:aload           27
	//  469  930:iconst_3        
	//  470  931:iaload          
	//  471  932:aload           27
	//  472  934:iconst_0        
	//  473  935:iaload          
	//  474  936:aload           27
	//  475  938:iconst_1        
	//  476  939:iaload          
	//  477  940:aload           27
	//  478  942:iconst_2        
	//  479  943:iaload          
	//  480  944:invokestatic    #398 <Method int Math.max(int, int)>
	//  481  947:invokestatic    #398 <Method int Math.max(int, int)>
	//  482  950:invokestatic    #398 <Method int Math.max(int, int)>
	//  483  953:aload           25
	//  484  955:iconst_3        
	//  485  956:iaload          
	//  486  957:aload           25
	//  487  959:iconst_0        
	//  488  960:iaload          
	//  489  961:aload           25
	//  490  963:iconst_1        
	//  491  964:iaload          
	//  492  965:aload           25
	//  493  967:iconst_2        
	//  494  968:iaload          
	//  495  969:invokestatic    #398 <Method int Math.max(int, int)>
	//  496  972:invokestatic    #398 <Method int Math.max(int, int)>
	//  497  975:invokestatic    #398 <Method int Math.max(int, int)>
	//  498  978:iadd            
	//  499  979:invokestatic    #398 <Method int Math.max(int, int)>
	//  500  982:istore          7
		if(flag3 && (j8 == 0x80000000 || j8 == 0))
	//* 501  984:iload           24
	//* 502  986:ifeq            1173
	//* 503  989:iload           21
	//* 504  991:ldc2            #402 <Int 0x80000000>
	//* 505  994:icmpeq          1002
	//* 506  997:iload           21
	//* 507  999:ifne            1173
		{
			mTotalLength = 0;
	//  508 1002:aload_0         
	//  509 1003:iconst_0        
	//  510 1004:putfield        #326 <Field int mTotalLength>
			for(i3 = 0; i3 < k3; i3++)
	//* 511 1007:iconst_0        
	//* 512 1008:istore          13
	//* 513 1010:iload           13
	//* 514 1012:iload           15
	//* 515 1014:icmpge          1170
			{
				View view1 = getVirtualChildAt(i3);
	//  516 1017:aload_0         
	//  517 1018:iload           13
	//  518 1020:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  519 1023:astore          26
				if(view1 == null)
	//* 520 1025:aload           26
	//* 521 1027:ifnonnull       1048
				{
					mTotalLength = mTotalLength + measureNullChild(i3);
	//  522 1030:aload_0         
	//  523 1031:aload_0         
	//  524 1032:getfield        #326 <Field int mTotalLength>
	//  525 1035:aload_0         
	//  526 1036:iload           13
	//  527 1038:invokevirtual   #372 <Method int measureNullChild(int)>
	//  528 1041:iadd            
	//  529 1042:putfield        #326 <Field int mTotalLength>
					continue;
	//  530 1045:goto            1161
				}
				if(view1.getVisibility() == 8)
	//* 531 1048:aload           26
	//* 532 1050:invokevirtual   #174 <Method int View.getVisibility()>
	//* 533 1053:bipush          8
	//* 534 1055:icmpne          1074
				{
					i3 += getChildrenSkipCount(view1, i3);
	//  535 1058:iload           13
	//  536 1060:aload_0         
	//  537 1061:aload           26
	//  538 1063:iload           13
	//  539 1065:invokevirtual   #383 <Method int getChildrenSkipCount(View, int)>
	//  540 1068:iadd            
	//  541 1069:istore          13
					continue;
	//  542 1071:goto            1161
				}
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  543 1074:aload           26
	//  544 1076:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  545 1079:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  546 1082:astore          28
				if(flag)
	//* 547 1084:iload           14
	//* 548 1086:ifeq            1122
				{
					mTotalLength = mTotalLength + (layoutparams1.leftMargin + l1 + layoutparams1.rightMargin + getNextLocationOffset(view1));
	//  549 1089:aload_0         
	//  550 1090:aload_0         
	//  551 1091:getfield        #326 <Field int mTotalLength>
	//  552 1094:aload           28
	//  553 1096:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  554 1099:iload           10
	//  555 1101:iadd            
	//  556 1102:aload           28
	//  557 1104:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  558 1107:iadd            
	//  559 1108:aload_0         
	//  560 1109:aload           26
	//  561 1111:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  562 1114:iadd            
	//  563 1115:iadd            
	//  564 1116:putfield        #326 <Field int mTotalLength>
				} else
	//* 565 1119:goto            1161
				{
					int j5 = mTotalLength;
	//  566 1122:aload_0         
	//  567 1123:getfield        #326 <Field int mTotalLength>
	//  568 1126:istore          16
					mTotalLength = Math.max(j5, j5 + l1 + layoutparams1.leftMargin + layoutparams1.rightMargin + getNextLocationOffset(view1));
	//  569 1128:aload_0         
	//  570 1129:iload           16
	//  571 1131:iload           16
	//  572 1133:iload           10
	//  573 1135:iadd            
	//  574 1136:aload           28
	//  575 1138:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  576 1141:iadd            
	//  577 1142:aload           28
	//  578 1144:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  579 1147:iadd            
	//  580 1148:aload_0         
	//  581 1149:aload           26
	//  582 1151:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  583 1154:iadd            
	//  584 1155:invokestatic    #398 <Method int Math.max(int, int)>
	//  585 1158:putfield        #326 <Field int mTotalLength>
				}
			}

	//  586 1161:iload           13
	//  587 1163:iconst_1        
	//  588 1164:iadd            
	//  589 1165:istore          13
		}
	//* 590 1167:goto            1010
	//* 591 1170:goto            1173
		mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
	//  592 1173:aload_0         
	//  593 1174:aload_0         
	//  594 1175:getfield        #326 <Field int mTotalLength>
	//  595 1178:aload_0         
	//  596 1179:invokevirtual   #237 <Method int getPaddingLeft()>
	//  597 1182:aload_0         
	//  598 1183:invokevirtual   #243 <Method int getPaddingRight()>
	//  599 1186:iadd            
	//  600 1187:iadd            
	//  601 1188:putfield        #326 <Field int mTotalLength>
		int k7 = View.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumWidth()), i, 0);
	//  602 1191:aload_0         
	//  603 1192:getfield        #326 <Field int mTotalLength>
	//  604 1195:aload_0         
	//  605 1196:invokevirtual   #413 <Method int getSuggestedMinimumWidth()>
	//  606 1199:invokestatic    #398 <Method int Math.max(int, int)>
	//  607 1202:iload_1         
	//  608 1203:iconst_0        
	//  609 1204:invokestatic    #417 <Method int View.resolveSizeAndState(int, int, int)>
	//  610 1207:istore          18
		i3 = (0xffffff & k7) - mTotalLength;
	//  611 1209:ldc2            #418 <Int 0xffffff>
	//  612 1212:iload           18
	//  613 1214:iand            
	//  614 1215:aload_0         
	//  615 1216:getfield        #326 <Field int mTotalLength>
	//  616 1219:isub            
	//  617 1220:istore          13
		if(i2 == 0 && (i3 == 0 || f <= 0.0F))
	//* 618 1222:iload           11
	//* 619 1224:ifne            1360
	//* 620 1227:iload           13
	//* 621 1229:ifeq            1241
	//* 622 1232:fload_3         
	//* 623 1233:fconst_0        
	//* 624 1234:fcmpl           
	//* 625 1235:ifle            1241
	//* 626 1238:goto            1360
		{
			int j2 = Math.max(l, k1);
	//  627 1241:iload           6
	//  628 1243:iload           9
	//  629 1245:invokestatic    #398 <Method int Math.max(int, int)>
	//  630 1248:istore          11
			if(flag3 && j8 != 0x40000000)
	//* 631 1250:iload           24
	//* 632 1252:ifeq            1345
	//* 633 1255:iload           21
	//* 634 1257:ldc1            #160 <Int 0x40000000>
	//* 635 1259:icmpeq          1345
				for(l = 0; l < k3; l++)
	//* 636 1262:iconst_0        
	//* 637 1263:istore          6
	//* 638 1265:iload           6
	//* 639 1267:iload           15
	//* 640 1269:icmpge          1345
				{
					obj = ((Object) (getVirtualChildAt(l)));
	//  641 1272:aload_0         
	//  642 1273:iload           6
	//  643 1275:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  644 1278:astore          25
					if(obj != null && ((View) (obj)).getVisibility() != 8 && ((LayoutParams)((View) (obj)).getLayoutParams()).weight > 0.0F)
	//* 645 1280:aload           25
	//* 646 1282:ifnull          1336
	//* 647 1285:aload           25
	//* 648 1287:invokevirtual   #174 <Method int View.getVisibility()>
	//* 649 1290:bipush          8
	//* 650 1292:icmpne          1298
	//* 651 1295:goto            1336
	//* 652 1298:aload           25
	//* 653 1300:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 654 1303:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//* 655 1306:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 656 1309:fconst_0        
	//* 657 1310:fcmpl           
	//* 658 1311:ifle            1336
						((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(((View) (obj)).getMeasuredHeight(), 0x40000000));
	//  659 1314:aload           25
	//  660 1316:iload           10
	//  661 1318:ldc1            #160 <Int 0x40000000>
	//  662 1320:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  663 1323:aload           25
	//  664 1325:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  665 1328:ldc1            #160 <Int 0x40000000>
	//  666 1330:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  667 1333:invokevirtual   #401 <Method void View.measure(int, int)>
				}

	//  668 1336:iload           6
	//  669 1338:iconst_1        
	//  670 1339:iadd            
	//  671 1340:istore          6
	//* 672 1342:goto            1265
			k1 = k3;
	//  673 1345:iload           15
	//  674 1347:istore          9
			l = j2;
	//  675 1349:iload           11
	//  676 1351:istore          6
			l1 = k;
	//  677 1353:iload           5
	//  678 1355:istore          10
		} else
	//* 679 1357:goto            2109
		{
			float f1 = mWeightSum;
	//  680 1360:aload_0         
	//  681 1361:getfield        #117 <Field float mWeightSum>
	//  682 1364:fstore          4
			if(f1 > 0.0F)
	//* 683 1366:fload           4
	//* 684 1368:fconst_0        
	//* 685 1369:fcmpl           
	//* 686 1370:ifle            1376
				f = f1;
	//  687 1373:fload           4
	//  688 1375:fstore_3        
			ai[3] = -1;
	//  689 1376:aload           27
	//  690 1378:iconst_3        
	//  691 1379:iconst_m1       
	//  692 1380:iastore         
			ai[2] = -1;
	//  693 1381:aload           27
	//  694 1383:iconst_2        
	//  695 1384:iconst_m1       
	//  696 1385:iastore         
			ai[1] = -1;
	//  697 1386:aload           27
	//  698 1388:iconst_1        
	//  699 1389:iconst_m1       
	//  700 1390:iastore         
			ai[0] = -1;
	//  701 1391:aload           27
	//  702 1393:iconst_0        
	//  703 1394:iconst_m1       
	//  704 1395:iastore         
			obj[3] = -1;
	//  705 1396:aload           25
	//  706 1398:iconst_3        
	//  707 1399:iconst_m1       
	//  708 1400:iastore         
			obj[2] = -1;
	//  709 1401:aload           25
	//  710 1403:iconst_2        
	//  711 1404:iconst_m1       
	//  712 1405:iastore         
			obj[1] = -1;
	//  713 1406:aload           25
	//  714 1408:iconst_1        
	//  715 1409:iconst_m1       
	//  716 1410:iastore         
			obj[0] = -1;
	//  717 1411:aload           25
	//  718 1413:iconst_0        
	//  719 1414:iconst_m1       
	//  720 1415:iastore         
			mTotalLength = 0;
	//  721 1416:aload_0         
	//  722 1417:iconst_0        
	//  723 1418:putfield        #326 <Field int mTotalLength>
			int k2 = -1;
	//  724 1421:iconst_m1       
	//  725 1422:istore          11
			boolean flag1 = false;
	//  726 1424:iconst_0        
	//  727 1425:istore          16
			k1 = k;
	//  728 1427:iload           5
	//  729 1429:istore          9
			i1 = k3;
	//  730 1431:iload           15
	//  731 1433:istore          7
			l1 = l;
	//  732 1435:iload           6
	//  733 1437:istore          10
			l = l2;
	//  734 1439:iload           12
	//  735 1441:istore          6
			k = i3;
	//  736 1443:iload           13
	//  737 1445:istore          5
			for(int j3 = ((int) (flag1)); j3 < i1; j3++)
	//* 738 1447:iload           16
	//* 739 1449:istore          13
	//* 740 1451:iload           13
	//* 741 1453:iload           7
	//* 742 1455:icmpge          1971
			{
				View view2 = getVirtualChildAt(j3);
	//  743 1458:aload_0         
	//  744 1459:iload           13
	//  745 1461:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  746 1464:astore          26
				if(view2 == null || view2.getVisibility() == 8)
	//* 747 1466:aload           26
	//* 748 1468:ifnull          1962
	//* 749 1471:aload           26
	//* 750 1473:invokevirtual   #174 <Method int View.getVisibility()>
	//* 751 1476:bipush          8
	//* 752 1478:icmpne          1484
					continue;
	//  753 1481:goto            1962
				LayoutParams layoutparams2 = (LayoutParams)view2.getLayoutParams();
	//  754 1484:aload           26
	//  755 1486:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  756 1489:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  757 1492:astore          28
				float f2 = layoutparams2.weight;
	//  758 1494:aload           28
	//  759 1496:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  760 1499:fstore          4
				if(f2 > 0.0F)
	//* 761 1501:fload           4
	//* 762 1503:fconst_0        
	//* 763 1504:fcmpl           
	//* 764 1505:ifle            1668
				{
					int l3 = (int)(((float)k * f2) / f);
	//  765 1508:iload           5
	//  766 1510:i2f             
	//  767 1511:fload           4
	//  768 1513:fmul            
	//  769 1514:fload_3         
	//  770 1515:fdiv            
	//  771 1516:f2i             
	//  772 1517:istore          15
					int l6 = getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom() + layoutparams2.topMargin + layoutparams2.bottomMargin, layoutparams2.height);
	//  773 1519:iload_2         
	//  774 1520:aload_0         
	//  775 1521:invokevirtual   #280 <Method int getPaddingTop()>
	//  776 1524:aload_0         
	//  777 1525:invokevirtual   #261 <Method int getPaddingBottom()>
	//  778 1528:iadd            
	//  779 1529:aload           28
	//  780 1531:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  781 1534:iadd            
	//  782 1535:aload           28
	//  783 1537:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  784 1540:iadd            
	//  785 1541:aload           28
	//  786 1543:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//  787 1546:invokestatic    #421 <Method int getChildMeasureSpec(int, int, int)>
	//  788 1549:istore          17
					if(layoutparams2.width == 0 && j8 == 0x40000000)
	//* 789 1551:aload           28
	//* 790 1553:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 791 1556:ifne            1601
	//* 792 1559:iload           21
	//* 793 1561:ldc1            #160 <Int 0x40000000>
	//* 794 1563:icmpeq          1569
	//* 795 1566:goto            1601
					{
						if(l3 > 0)
	//* 796 1569:iload           15
	//* 797 1571:ifle            1581
							l2 = l3;
	//  798 1574:iload           15
	//  799 1576:istore          12
						else
	//* 800 1578:goto            1584
							l2 = 0;
	//  801 1581:iconst_0        
	//  802 1582:istore          12
						view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(l2, 0x40000000), l6);
	//  803 1584:aload           26
	//  804 1586:iload           12
	//  805 1588:ldc1            #160 <Int 0x40000000>
	//  806 1590:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  807 1593:iload           17
	//  808 1595:invokevirtual   #401 <Method void View.measure(int, int)>
					} else
	//* 809 1598:goto            1637
					{
						int k5 = view2.getMeasuredWidth() + l3;
	//  810 1601:aload           26
	//  811 1603:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  812 1606:iload           15
	//  813 1608:iadd            
	//  814 1609:istore          16
						l2 = k5;
	//  815 1611:iload           16
	//  816 1613:istore          12
						if(k5 < 0)
	//* 817 1615:iload           16
	//* 818 1617:ifge            1623
							l2 = 0;
	//  819 1620:iconst_0        
	//  820 1621:istore          12
						view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(l2, 0x40000000), l6);
	//  821 1623:aload           26
	//  822 1625:iload           12
	//  823 1627:ldc1            #160 <Int 0x40000000>
	//  824 1629:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  825 1632:iload           17
	//  826 1634:invokevirtual   #401 <Method void View.measure(int, int)>
					}
					l = View.combineMeasuredStates(l, view2.getMeasuredState() & 0xff000000);
	//  827 1637:iload           6
	//  828 1639:aload           26
	//  829 1641:invokevirtual   #407 <Method int View.getMeasuredState()>
	//  830 1644:ldc2            #422 <Int 0xff000000>
	//  831 1647:iand            
	//  832 1648:invokestatic    #410 <Method int View.combineMeasuredStates(int, int)>
	//  833 1651:istore          6
					f -= f2;
	//  834 1653:fload_3         
	//  835 1654:fload           4
	//  836 1656:fsub            
	//  837 1657:fstore_3        
					k -= l3;
	//  838 1658:iload           5
	//  839 1660:iload           15
	//  840 1662:isub            
	//  841 1663:istore          5
				}
	//* 842 1665:goto            1668
				if(flag)
	//* 843 1668:iload           14
	//* 844 1670:ifeq            1709
				{
					mTotalLength = mTotalLength + (view2.getMeasuredWidth() + layoutparams2.leftMargin + layoutparams2.rightMargin + getNextLocationOffset(view2));
	//  845 1673:aload_0         
	//  846 1674:aload_0         
	//  847 1675:getfield        #326 <Field int mTotalLength>
	//  848 1678:aload           26
	//  849 1680:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  850 1683:aload           28
	//  851 1685:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  852 1688:iadd            
	//  853 1689:aload           28
	//  854 1691:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  855 1694:iadd            
	//  856 1695:aload_0         
	//  857 1696:aload           26
	//  858 1698:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  859 1701:iadd            
	//  860 1702:iadd            
	//  861 1703:putfield        #326 <Field int mTotalLength>
				} else
	//* 862 1706:goto            1751
				{
					l2 = mTotalLength;
	//  863 1709:aload_0         
	//  864 1710:getfield        #326 <Field int mTotalLength>
	//  865 1713:istore          12
					mTotalLength = Math.max(l2, view2.getMeasuredWidth() + l2 + layoutparams2.leftMargin + layoutparams2.rightMargin + getNextLocationOffset(view2));
	//  866 1715:aload_0         
	//  867 1716:iload           12
	//  868 1718:aload           26
	//  869 1720:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  870 1723:iload           12
	//  871 1725:iadd            
	//  872 1726:aload           28
	//  873 1728:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  874 1731:iadd            
	//  875 1732:aload           28
	//  876 1734:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  877 1737:iadd            
	//  878 1738:aload_0         
	//  879 1739:aload           26
	//  880 1741:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  881 1744:iadd            
	//  882 1745:invokestatic    #398 <Method int Math.max(int, int)>
	//  883 1748:putfield        #326 <Field int mTotalLength>
				}
				if(i8 != 0x40000000 && layoutparams2.height == -1)
	//* 884 1751:iload           20
	//* 885 1753:ldc1            #160 <Int 0x40000000>
	//* 886 1755:icmpeq          1773
	//* 887 1758:aload           28
	//* 888 1760:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 889 1763:iconst_m1       
	//* 890 1764:icmpne          1773
					l2 = 1;
	//  891 1767:iconst_1        
	//  892 1768:istore          12
				else
	//* 893 1770:goto            1776
					l2 = 0;
	//  894 1773:iconst_0        
	//  895 1774:istore          12
				int i7 = layoutparams2.topMargin + layoutparams2.bottomMargin;
	//  896 1776:aload           28
	//  897 1778:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  898 1781:aload           28
	//  899 1783:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  900 1786:iadd            
	//  901 1787:istore          17
				int l5 = view2.getMeasuredHeight() + i7;
	//  902 1789:aload           26
	//  903 1791:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  904 1794:iload           17
	//  905 1796:iadd            
	//  906 1797:istore          16
				int i4 = Math.max(k2, l5);
	//  907 1799:iload           11
	//  908 1801:iload           16
	//  909 1803:invokestatic    #398 <Method int Math.max(int, int)>
	//  910 1806:istore          15
				if(l2 != 0)
	//* 911 1808:iload           12
	//* 912 1810:ifeq            1820
					k2 = i7;
	//  913 1813:iload           17
	//  914 1815:istore          11
				else
	//* 915 1817:goto            1824
					k2 = l5;
	//  916 1820:iload           16
	//  917 1822:istore          11
				k2 = Math.max(l1, k2);
	//  918 1824:iload           10
	//  919 1826:iload           11
	//  920 1828:invokestatic    #398 <Method int Math.max(int, int)>
	//  921 1831:istore          11
				if(k1 != 0 && layoutparams2.height == -1)
	//* 922 1833:iload           9
	//* 923 1835:ifeq            1853
	//* 924 1838:aload           28
	//* 925 1840:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 926 1843:iconst_m1       
	//* 927 1844:icmpne          1853
					k1 = 1;
	//  928 1847:iconst_1        
	//  929 1848:istore          9
				else
	//* 930 1850:goto            1856
					k1 = 0;
	//  931 1853:iconst_0        
	//  932 1854:istore          9
				if(flag2)
	//* 933 1856:iload           23
	//* 934 1858:ifeq            1951
				{
					l2 = view2.getBaseline();
	//  935 1861:aload           26
	//  936 1863:invokevirtual   #315 <Method int View.getBaseline()>
	//  937 1866:istore          12
					if(l2 != -1)
	//* 938 1868:iload           12
	//* 939 1870:iconst_m1       
	//* 940 1871:icmpeq          1948
					{
						if(layoutparams2.gravity < 0)
	//* 941 1874:aload           28
	//* 942 1876:getfield        #375 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//* 943 1879:ifge            1891
							l1 = mGravity;
	//  944 1882:aload_0         
	//  945 1883:getfield        #68  <Field int mGravity>
	//  946 1886:istore          10
						else
	//* 947 1888:goto            1898
							l1 = layoutparams2.gravity;
	//  948 1891:aload           28
	//  949 1893:getfield        #375 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//  950 1896:istore          10
						l1 = ((l1 & 0x70) >> 4 & -2) >> 1;
	//  951 1898:iload           10
	//  952 1900:bipush          112
	//  953 1902:iand            
	//  954 1903:iconst_4        
	//  955 1904:ishr            
	//  956 1905:bipush          -2
	//  957 1907:iand            
	//  958 1908:iconst_1        
	//  959 1909:ishr            
	//  960 1910:istore          10
						ai[l1] = Math.max(ai[l1], l2);
	//  961 1912:aload           27
	//  962 1914:iload           10
	//  963 1916:aload           27
	//  964 1918:iload           10
	//  965 1920:iaload          
	//  966 1921:iload           12
	//  967 1923:invokestatic    #398 <Method int Math.max(int, int)>
	//  968 1926:iastore         
						obj[l1] = Math.max(obj[l1], l5 - l2);
	//  969 1927:aload           25
	//  970 1929:iload           10
	//  971 1931:aload           25
	//  972 1933:iload           10
	//  973 1935:iaload          
	//  974 1936:iload           16
	//  975 1938:iload           12
	//  976 1940:isub            
	//  977 1941:invokestatic    #398 <Method int Math.max(int, int)>
	//  978 1944:iastore         
					}
				}
	//* 979 1945:goto            1951
	//* 980 1948:goto            1951
				l1 = k2;
	//  981 1951:iload           11
	//  982 1953:istore          10
				k2 = i4;
	//  983 1955:iload           15
	//  984 1957:istore          11
			}

	//  985 1959:goto            1962
	//  986 1962:iload           13
	//  987 1964:iconst_1        
	//  988 1965:iadd            
	//  989 1966:istore          13
	//* 990 1968:goto            1451
			mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
	//  991 1971:aload_0         
	//  992 1972:aload_0         
	//  993 1973:getfield        #326 <Field int mTotalLength>
	//  994 1976:aload_0         
	//  995 1977:invokevirtual   #237 <Method int getPaddingLeft()>
	//  996 1980:aload_0         
	//  997 1981:invokevirtual   #243 <Method int getPaddingRight()>
	//  998 1984:iadd            
	//  999 1985:iadd            
	// 1000 1986:putfield        #326 <Field int mTotalLength>
			if(ai[1] == -1 && ai[0] == -1 && ai[2] == -1 && ai[3] == -1)
	//*1001 1989:aload           27
	//*1002 1991:iconst_1        
	//*1003 1992:iaload          
	//*1004 1993:iconst_m1       
	//*1005 1994:icmpne          2031
	//*1006 1997:aload           27
	//*1007 1999:iconst_0        
	//*1008 2000:iaload          
	//*1009 2001:iconst_m1       
	//*1010 2002:icmpne          2031
	//*1011 2005:aload           27
	//*1012 2007:iconst_2        
	//*1013 2008:iaload          
	//*1014 2009:iconst_m1       
	//*1015 2010:icmpne          2031
	//*1016 2013:aload           27
	//*1017 2015:iconst_3        
	//*1018 2016:iaload          
	//*1019 2017:iconst_m1       
	//*1020 2018:icmpeq          2024
	//*1021 2021:goto            2031
				k = k2;
	// 1022 2024:iload           11
	// 1023 2026:istore          5
			else
	//*1024 2028:goto            2089
				k = Math.max(k2, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(obj[3], Math.max(obj[0], Math.max(obj[1], obj[2]))));
	// 1025 2031:iload           11
	// 1026 2033:aload           27
	// 1027 2035:iconst_3        
	// 1028 2036:iaload          
	// 1029 2037:aload           27
	// 1030 2039:iconst_0        
	// 1031 2040:iaload          
	// 1032 2041:aload           27
	// 1033 2043:iconst_1        
	// 1034 2044:iaload          
	// 1035 2045:aload           27
	// 1036 2047:iconst_2        
	// 1037 2048:iaload          
	// 1038 2049:invokestatic    #398 <Method int Math.max(int, int)>
	// 1039 2052:invokestatic    #398 <Method int Math.max(int, int)>
	// 1040 2055:invokestatic    #398 <Method int Math.max(int, int)>
	// 1041 2058:aload           25
	// 1042 2060:iconst_3        
	// 1043 2061:iaload          
	// 1044 2062:aload           25
	// 1045 2064:iconst_0        
	// 1046 2065:iaload          
	// 1047 2066:aload           25
	// 1048 2068:iconst_1        
	// 1049 2069:iaload          
	// 1050 2070:aload           25
	// 1051 2072:iconst_2        
	// 1052 2073:iaload          
	// 1053 2074:invokestatic    #398 <Method int Math.max(int, int)>
	// 1054 2077:invokestatic    #398 <Method int Math.max(int, int)>
	// 1055 2080:invokestatic    #398 <Method int Math.max(int, int)>
	// 1056 2083:iadd            
	// 1057 2084:invokestatic    #398 <Method int Math.max(int, int)>
	// 1058 2087:istore          5
			l2 = l;
	// 1059 2089:iload           6
	// 1060 2091:istore          12
			l = l1;
	// 1061 2093:iload           10
	// 1062 2095:istore          6
			l1 = k1;
	// 1063 2097:iload           9
	// 1064 2099:istore          10
			k1 = i1;
	// 1065 2101:iload           7
	// 1066 2103:istore          9
			i1 = k;
	// 1067 2105:iload           5
	// 1068 2107:istore          7
		}
		if(l1 != 0 || i8 == 0x40000000)
	//*1069 2109:iload           10
	//*1070 2111:ifne            2124
	//*1071 2114:iload           20
	//*1072 2116:ldc1            #160 <Int 0x40000000>
	//*1073 2118:icmpeq          2124
	//*1074 2121:goto            2128
			l = i1;
	// 1075 2124:iload           7
	// 1076 2126:istore          6
		setMeasuredDimension(k7 | l2 & 0xff000000, View.resolveSizeAndState(Math.max(l + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), j, l2 << 16));
	// 1077 2128:aload_0         
	// 1078 2129:iload           18
	// 1079 2131:iload           12
	// 1080 2133:ldc2            #422 <Int 0xff000000>
	// 1081 2136:iand            
	// 1082 2137:ior             
	// 1083 2138:iload           6
	// 1084 2140:aload_0         
	// 1085 2141:invokevirtual   #280 <Method int getPaddingTop()>
	// 1086 2144:aload_0         
	// 1087 2145:invokevirtual   #261 <Method int getPaddingBottom()>
	// 1088 2148:iadd            
	// 1089 2149:iadd            
	// 1090 2150:aload_0         
	// 1091 2151:invokevirtual   #425 <Method int getSuggestedMinimumHeight()>
	// 1092 2154:invokestatic    #398 <Method int Math.max(int, int)>
	// 1093 2157:iload_2         
	// 1094 2158:iload           12
	// 1095 2160:bipush          16
	// 1096 2162:ishl            
	// 1097 2163:invokestatic    #417 <Method int View.resolveSizeAndState(int, int, int)>
	// 1098 2166:invokevirtual   #428 <Method void setMeasuredDimension(int, int)>
		if(j1 != 0)
	//*1099 2169:iload           8
	//*1100 2171:ifeq            2181
			forceUniformHeight(k1, i);
	// 1101 2174:aload_0         
	// 1102 2175:iload           9
	// 1103 2177:iload_1         
	// 1104 2178:invokespecial   #430 <Method void forceUniformHeight(int, int)>
	// 1105 2181:return          
	}

	int measureNullChild(int i)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	void measureVertical(int i, int j)
	{
		mTotalLength = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #326 <Field int mTotalLength>
		int l2 = getVirtualChildCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #206 <Method int getVirtualChildCount()>
	//    5    9:istore          13
		int i8 = android.view.View.MeasureSpec.getMode(i);
	//    6   11:iload_1         
	//    7   12:invokestatic    #390 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   15:istore          21
		int i1 = android.view.View.MeasureSpec.getMode(j);
	//    9   17:iload_2         
	//   10   18:invokestatic    #390 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   11   21:istore          7
		int j8 = mBaselineAlignedChildIndex;
	//   12   23:aload_0         
	//   13   24:getfield        #63  <Field int mBaselineAlignedChildIndex>
	//   14   27:istore          22
		boolean flag = mUseLargestChild;
	//   15   29:aload_0         
	//   16   30:getfield        #125 <Field boolean mUseLargestChild>
	//   17   33:istore          23
		int k = 0;
	//   18   35:iconst_0        
	//   19   36:istore          5
		int l3 = k;
	//   20   38:iload           5
	//   21   40:istore          15
		int l1 = l3;
	//   22   42:iload           15
	//   23   44:istore          10
		int l = l1;
	//   24   46:iload           10
	//   25   48:istore          6
		int k1 = l;
	//   26   50:iload           6
	//   27   52:istore          9
		int j2 = k1;
	//   28   54:iload           9
	//   29   56:istore          11
		int i3 = j2;
	//   30   58:iload           11
	//   31   60:istore          14
		int k2 = i3;
	//   32   62:iload           14
	//   33   64:istore          12
		float f = 0.0F;
	//   34   66:fconst_0        
	//   35   67:fstore_3        
		int j1 = 1;
	//   36   68:iconst_1        
	//   37   69:istore          8
		for(; j2 < l2; j2++)
	//*  38   71:iload           11
	//*  39   73:iload           13
	//*  40   75:icmpge          658
		{
			View view = getVirtualChildAt(j2);
	//   41   78:aload_0         
	//   42   79:iload           11
	//   43   81:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   44   84:astore          24
			if(view == null)
	//*  45   86:aload           24
	//*  46   88:ifnonnull       109
			{
				mTotalLength = mTotalLength + measureNullChild(j2);
	//   47   91:aload_0         
	//   48   92:aload_0         
	//   49   93:getfield        #326 <Field int mTotalLength>
	//   50   96:aload_0         
	//   51   97:iload           11
	//   52   99:invokevirtual   #372 <Method int measureNullChild(int)>
	//   53  102:iadd            
	//   54  103:putfield        #326 <Field int mTotalLength>
				continue;
	//   55  106:goto            649
			}
			if(view.getVisibility() == 8)
	//*  56  109:aload           24
	//*  57  111:invokevirtual   #174 <Method int View.getVisibility()>
	//*  58  114:bipush          8
	//*  59  116:icmpne          135
			{
				j2 += getChildrenSkipCount(view, j2);
	//   60  119:iload           11
	//   61  121:aload_0         
	//   62  122:aload           24
	//   63  124:iload           11
	//   64  126:invokevirtual   #383 <Method int getChildrenSkipCount(View, int)>
	//   65  129:iadd            
	//   66  130:istore          11
				continue;
	//   67  132:goto            649
			}
			if(hasDividerBeforeChildAt(j2))
	//*  68  135:aload_0         
	//*  69  136:iload           11
	//*  70  138:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//*  71  141:ifeq            157
				mTotalLength = mTotalLength + mDividerHeight;
	//   72  144:aload_0         
	//   73  145:aload_0         
	//   74  146:getfield        #326 <Field int mTotalLength>
	//   75  149:aload_0         
	//   76  150:getfield        #252 <Field int mDividerHeight>
	//   77  153:iadd            
	//   78  154:putfield        #326 <Field int mTotalLength>
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   79  157:aload           24
	//   80  159:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   81  162:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   82  165:astore          25
			f += layoutparams.weight;
	//   83  167:fload_3         
	//   84  168:aload           25
	//   85  170:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//   86  173:fadd            
	//   87  174:fstore_3        
			if(i1 == 0x40000000 && layoutparams.height == 0 && layoutparams.weight > 0.0F)
	//*  88  175:iload           7
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
				i3 = mTotalLength;
	//   99  200:aload_0         
	//  100  201:getfield        #326 <Field int mTotalLength>
	//  101  204:istore          14
				mTotalLength = Math.max(i3, layoutparams.topMargin + i3 + layoutparams.bottomMargin);
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
	//  112  226:putfield        #326 <Field int mTotalLength>
				i3 = 1;
	//  113  229:iconst_1        
	//  114  230:istore          14
			} else
	//* 115  232:goto            380
			{
				int k4;
				if(layoutparams.height == 0 && layoutparams.weight > 0.0F)
	//* 116  235:aload           25
	//* 117  237:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 118  240:ifne            266
	//* 119  243:aload           25
	//* 120  245:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 121  248:fconst_0        
	//* 122  249:fcmpl           
	//* 123  250:ifle            266
				{
					layoutparams.height = -2;
	//  124  253:aload           25
	//  125  255:bipush          -2
	//  126  257:putfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
					k4 = 0;
	//  127  260:iconst_0        
	//  128  261:istore          16
				} else
	//* 129  263:goto            271
				{
					k4 = 0x80000000;
	//  130  266:ldc2            #402 <Int 0x80000000>
	//  131  269:istore          16
				}
				int l5;
				if(f == 0.0F)
	//* 132  271:fload_3         
	//* 133  272:fconst_0        
	//* 134  273:fcmpl           
	//* 135  274:ifne            286
					l5 = mTotalLength;
	//  136  277:aload_0         
	//  137  278:getfield        #326 <Field int mTotalLength>
	//  138  281:istore          17
				else
	//* 139  283:goto            289
					l5 = 0;
	//  140  286:iconst_0        
	//  141  287:istore          17
				measureChildBeforeLayout(view, j2, i, 0, j, l5);
	//  142  289:aload_0         
	//  143  290:aload           24
	//  144  292:iload           11
	//  145  294:iload_1         
	//  146  295:iconst_0        
	//  147  296:iload_2         
	//  148  297:iload           17
	//  149  299:invokevirtual   #404 <Method void measureChildBeforeLayout(View, int, int, int, int, int)>
				if(k4 != 0x80000000)
	//* 150  302:iload           16
	//* 151  304:ldc2            #402 <Int 0x80000000>
	//* 152  307:icmpeq          317
					layoutparams.height = k4;
	//  153  310:aload           25
	//  154  312:iload           16
	//  155  314:putfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
				k4 = view.getMeasuredHeight();
	//  156  317:aload           24
	//  157  319:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  158  322:istore          16
				l5 = mTotalLength;
	//  159  324:aload_0         
	//  160  325:getfield        #326 <Field int mTotalLength>
	//  161  328:istore          17
				mTotalLength = Math.max(l5, l5 + k4 + layoutparams.topMargin + layoutparams.bottomMargin + getNextLocationOffset(view));
	//  162  330:aload_0         
	//  163  331:iload           17
	//  164  333:iload           17
	//  165  335:iload           16
	//  166  337:iadd            
	//  167  338:aload           25
	//  168  340:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  169  343:iadd            
	//  170  344:aload           25
	//  171  346:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  172  349:iadd            
	//  173  350:aload_0         
	//  174  351:aload           24
	//  175  353:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  176  356:iadd            
	//  177  357:invokestatic    #398 <Method int Math.max(int, int)>
	//  178  360:putfield        #326 <Field int mTotalLength>
				if(flag)
	//* 179  363:iload           23
	//* 180  365:ifeq            380
					l1 = Math.max(k4, l1);
	//  181  368:iload           16
	//  182  370:iload           10
	//  183  372:invokestatic    #398 <Method int Math.max(int, int)>
	//  184  375:istore          10
			}
	//* 185  377:goto            380
			int k6 = j2;
	//  186  380:iload           11
	//  187  382:istore          18
			if(j8 >= 0 && j8 == k6 + 1)
	//* 188  384:iload           22
	//* 189  386:iflt            406
	//* 190  389:iload           22
	//* 191  391:iload           18
	//* 192  393:iconst_1        
	//* 193  394:iadd            
	//* 194  395:icmpne          406
				mBaselineChildTop = mTotalLength;
	//  195  398:aload_0         
	//  196  399:aload_0         
	//  197  400:getfield        #326 <Field int mTotalLength>
	//  198  403:putfield        #65  <Field int mBaselineChildTop>
			if(k6 < j8 && layoutparams.weight > 0.0F)
	//* 199  406:iload           18
	//* 200  408:iload           22
	//* 201  410:icmpge          437
	//* 202  413:aload           25
	//* 203  415:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 204  418:fconst_0        
	//* 205  419:fcmpl           
	//* 206  420:ifgt            426
	//* 207  423:goto            437
				throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
	//  208  426:new             #317 <Class RuntimeException>
	//  209  429:dup             
	//  210  430:ldc2            #433 <String "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.">
	//  211  433:invokespecial   #322 <Method void RuntimeException(String)>
	//  212  436:athrow          
			if(i8 != 0x40000000 && layoutparams.width == -1)
	//* 213  437:iload           21
	//* 214  439:ldc1            #160 <Int 0x40000000>
	//* 215  441:icmpeq          463
	//* 216  444:aload           25
	//* 217  446:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 218  449:iconst_m1       
	//* 219  450:icmpne          463
			{
				j2 = 1;
	//  220  453:iconst_1        
	//  221  454:istore          11
				k2 = j2;
	//  222  456:iload           11
	//  223  458:istore          12
			} else
	//* 224  460:goto            466
			{
				j2 = 0;
	//  225  463:iconst_0        
	//  226  464:istore          11
			}
			int l4 = layoutparams.leftMargin + layoutparams.rightMargin;
	//  227  466:aload           25
	//  228  468:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  229  471:aload           25
	//  230  473:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  231  476:iadd            
	//  232  477:istore          16
			int i6 = view.getMeasuredWidth() + l4;
	//  233  479:aload           24
	//  234  481:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  235  484:iload           16
	//  236  486:iadd            
	//  237  487:istore          17
			int i7 = Math.max(l3, i6);
	//  238  489:iload           15
	//  239  491:iload           17
	//  240  493:invokestatic    #398 <Method int Math.max(int, int)>
	//  241  496:istore          19
			int k7 = View.combineMeasuredStates(k, view.getMeasuredState());
	//  242  498:iload           5
	//  243  500:aload           24
	//  244  502:invokevirtual   #407 <Method int View.getMeasuredState()>
	//  245  505:invokestatic    #410 <Method int View.combineMeasuredStates(int, int)>
	//  246  508:istore          20
			if(j1 != 0 && layoutparams.width == -1)
	//* 247  510:iload           8
	//* 248  512:ifeq            530
	//* 249  515:aload           25
	//* 250  517:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 251  520:iconst_m1       
	//* 252  521:icmpne          530
				k = 1;
	//  253  524:iconst_1        
	//  254  525:istore          5
			else
	//* 255  527:goto            533
				k = 0;
	//  256  530:iconst_0        
	//  257  531:istore          5
			if(layoutparams.weight > 0.0F)
	//* 258  533:aload           25
	//* 259  535:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 260  538:fconst_0        
	//* 261  539:fcmpl           
	//* 262  540:ifle            571
			{
				if(j2 == 0)
	//* 263  543:iload           11
	//* 264  545:ifeq            551
	//* 265  548:goto            555
					l4 = i6;
	//  266  551:iload           17
	//  267  553:istore          16
				j1 = Math.max(l, l4);
	//  268  555:iload           6
	//  269  557:iload           16
	//  270  559:invokestatic    #398 <Method int Math.max(int, int)>
	//  271  562:istore          8
				l = k1;
	//  272  564:iload           9
	//  273  566:istore          6
			} else
	//* 274  568:goto            600
			{
				if(j2 == 0)
	//* 275  571:iload           11
	//* 276  573:ifeq            579
	//* 277  576:goto            583
					l4 = i6;
	//  278  579:iload           17
	//  279  581:istore          16
				k1 = Math.max(k1, l4);
	//  280  583:iload           9
	//  281  585:iload           16
	//  282  587:invokestatic    #398 <Method int Math.max(int, int)>
	//  283  590:istore          9
				j1 = l;
	//  284  592:iload           6
	//  285  594:istore          8
				l = k1;
	//  286  596:iload           9
	//  287  598:istore          6
			}
			j2 = getChildrenSkipCount(view, k6);
	//  288  600:aload_0         
	//  289  601:aload           24
	//  290  603:iload           18
	//  291  605:invokevirtual   #383 <Method int getChildrenSkipCount(View, int)>
	//  292  608:istore          11
			k1 = k;
	//  293  610:iload           5
	//  294  612:istore          9
			l3 = j1;
	//  295  614:iload           8
	//  296  616:istore          15
			k = k7;
	//  297  618:iload           20
	//  298  620:istore          5
			j2 += k6;
	//  299  622:iload           11
	//  300  624:iload           18
	//  301  626:iadd            
	//  302  627:istore          11
			l4 = i7;
	//  303  629:iload           19
	//  304  631:istore          16
			j1 = k1;
	//  305  633:iload           9
	//  306  635:istore          8
			k1 = l;
	//  307  637:iload           6
	//  308  639:istore          9
			l = l3;
	//  309  641:iload           15
	//  310  643:istore          6
			l3 = l4;
	//  311  645:iload           16
	//  312  647:istore          15
		}

	//  313  649:iload           11
	//  314  651:iconst_1        
	//  315  652:iadd            
	//  316  653:istore          11
	//* 317  655:goto            71
		if(mTotalLength > 0 && hasDividerBeforeChildAt(l2))
	//* 318  658:aload_0         
	//* 319  659:getfield        #326 <Field int mTotalLength>
	//* 320  662:ifle            690
	//* 321  665:aload_0         
	//* 322  666:iload           13
	//* 323  668:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 324  671:ifeq            690
			mTotalLength = mTotalLength + mDividerHeight;
	//  325  674:aload_0         
	//  326  675:aload_0         
	//  327  676:getfield        #326 <Field int mTotalLength>
	//  328  679:aload_0         
	//  329  680:getfield        #252 <Field int mDividerHeight>
	//  330  683:iadd            
	//  331  684:putfield        #326 <Field int mTotalLength>
	//* 332  687:goto            690
		if(flag)
	//* 333  690:iload           23
	//* 334  692:ifeq            842
		{
			j2 = i1;
	//  335  695:iload           7
	//  336  697:istore          11
			if(j2 == 0x80000000 || j2 == 0)
	//* 337  699:iload           11
	//* 338  701:ldc2            #402 <Int 0x80000000>
	//* 339  704:icmpeq          712
	//* 340  707:iload           11
	//* 341  709:ifne            842
			{
				mTotalLength = 0;
	//  342  712:aload_0         
	//  343  713:iconst_0        
	//  344  714:putfield        #326 <Field int mTotalLength>
				for(j2 = 0; j2 < l2; j2++)
	//* 345  717:iconst_0        
	//* 346  718:istore          11
	//* 347  720:iload           11
	//* 348  722:iload           13
	//* 349  724:icmpge          842
				{
					View view1 = getVirtualChildAt(j2);
	//  350  727:aload_0         
	//  351  728:iload           11
	//  352  730:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  353  733:astore          24
					if(view1 == null)
	//* 354  735:aload           24
	//* 355  737:ifnonnull       758
					{
						mTotalLength = mTotalLength + measureNullChild(j2);
	//  356  740:aload_0         
	//  357  741:aload_0         
	//  358  742:getfield        #326 <Field int mTotalLength>
	//  359  745:aload_0         
	//  360  746:iload           11
	//  361  748:invokevirtual   #372 <Method int measureNullChild(int)>
	//  362  751:iadd            
	//  363  752:putfield        #326 <Field int mTotalLength>
						continue;
	//  364  755:goto            833
					}
					if(view1.getVisibility() == 8)
	//* 365  758:aload           24
	//* 366  760:invokevirtual   #174 <Method int View.getVisibility()>
	//* 367  763:bipush          8
	//* 368  765:icmpne          784
					{
						j2 += getChildrenSkipCount(view1, j2);
	//  369  768:iload           11
	//  370  770:aload_0         
	//  371  771:aload           24
	//  372  773:iload           11
	//  373  775:invokevirtual   #383 <Method int getChildrenSkipCount(View, int)>
	//  374  778:iadd            
	//  375  779:istore          11
					} else
	//* 376  781:goto            833
					{
						LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  377  784:aload           24
	//  378  786:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  379  789:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  380  792:astore          25
						int i5 = mTotalLength;
	//  381  794:aload_0         
	//  382  795:getfield        #326 <Field int mTotalLength>
	//  383  798:istore          16
						mTotalLength = Math.max(i5, i5 + l1 + layoutparams1.topMargin + layoutparams1.bottomMargin + getNextLocationOffset(view1));
	//  384  800:aload_0         
	//  385  801:iload           16
	//  386  803:iload           16
	//  387  805:iload           10
	//  388  807:iadd            
	//  389  808:aload           25
	//  390  810:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  391  813:iadd            
	//  392  814:aload           25
	//  393  816:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  394  819:iadd            
	//  395  820:aload_0         
	//  396  821:aload           24
	//  397  823:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  398  826:iadd            
	//  399  827:invokestatic    #398 <Method int Math.max(int, int)>
	//  400  830:putfield        #326 <Field int mTotalLength>
					}
				}

	//  401  833:iload           11
	//  402  835:iconst_1        
	//  403  836:iadd            
	//  404  837:istore          11
			}
		}
	//* 405  839:goto            720
		j2 = i1;
	//  406  842:iload           7
	//  407  844:istore          11
		mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
	//  408  846:aload_0         
	//  409  847:aload_0         
	//  410  848:getfield        #326 <Field int mTotalLength>
	//  411  851:aload_0         
	//  412  852:invokevirtual   #280 <Method int getPaddingTop()>
	//  413  855:aload_0         
	//  414  856:invokevirtual   #261 <Method int getPaddingBottom()>
	//  415  859:iadd            
	//  416  860:iadd            
	//  417  861:putfield        #326 <Field int mTotalLength>
		int j6 = View.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumHeight()), j, 0);
	//  418  864:aload_0         
	//  419  865:getfield        #326 <Field int mTotalLength>
	//  420  868:aload_0         
	//  421  869:invokevirtual   #425 <Method int getSuggestedMinimumHeight()>
	//  422  872:invokestatic    #398 <Method int Math.max(int, int)>
	//  423  875:iload_2         
	//  424  876:iconst_0        
	//  425  877:invokestatic    #417 <Method int View.resolveSizeAndState(int, int, int)>
	//  426  880:istore          17
		i1 = (0xffffff & j6) - mTotalLength;
	//  427  882:ldc2            #418 <Int 0xffffff>
	//  428  885:iload           17
	//  429  887:iand            
	//  430  888:aload_0         
	//  431  889:getfield        #326 <Field int mTotalLength>
	//  432  892:isub            
	//  433  893:istore          7
		if(i3 == 0 && (i1 == 0 || f <= 0.0F))
	//* 434  895:iload           14
	//* 435  897:ifne            1033
	//* 436  900:iload           7
	//* 437  902:ifeq            914
	//* 438  905:fload_3         
	//* 439  906:fconst_0        
	//* 440  907:fcmpl           
	//* 441  908:ifle            914
	//* 442  911:goto            1033
		{
			i1 = Math.max(k1, l);
	//  443  914:iload           9
	//  444  916:iload           6
	//  445  918:invokestatic    #398 <Method int Math.max(int, int)>
	//  446  921:istore          7
			if(flag && j2 != 0x40000000)
	//* 447  923:iload           23
	//* 448  925:ifeq            1018
	//* 449  928:iload           11
	//* 450  930:ldc1            #160 <Int 0x40000000>
	//* 451  932:icmpeq          1018
				for(l = 0; l < l2; l++)
	//* 452  935:iconst_0        
	//* 453  936:istore          6
	//* 454  938:iload           6
	//* 455  940:iload           13
	//* 456  942:icmpge          1018
				{
					View view2 = getVirtualChildAt(l);
	//  457  945:aload_0         
	//  458  946:iload           6
	//  459  948:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  460  951:astore          24
					if(view2 != null && view2.getVisibility() != 8 && ((LayoutParams)view2.getLayoutParams()).weight > 0.0F)
	//* 461  953:aload           24
	//* 462  955:ifnull          1009
	//* 463  958:aload           24
	//* 464  960:invokevirtual   #174 <Method int View.getVisibility()>
	//* 465  963:bipush          8
	//* 466  965:icmpne          971
	//* 467  968:goto            1009
	//* 468  971:aload           24
	//* 469  973:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 470  976:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//* 471  979:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 472  982:fconst_0        
	//* 473  983:fcmpl           
	//* 474  984:ifle            1009
						view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
	//  475  987:aload           24
	//  476  989:aload           24
	//  477  991:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  478  994:ldc1            #160 <Int 0x40000000>
	//  479  996:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  480  999:iload           10
	//  481 1001:ldc1            #160 <Int 0x40000000>
	//  482 1003:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  483 1006:invokevirtual   #401 <Method void View.measure(int, int)>
				}

	//  484 1009:iload           6
	//  485 1011:iconst_1        
	//  486 1012:iadd            
	//  487 1013:istore          6
	//* 488 1015:goto            938
			l = k;
	//  489 1018:iload           5
	//  490 1020:istore          6
			k = i1;
	//  491 1022:iload           7
	//  492 1024:istore          5
			i1 = l3;
	//  493 1026:iload           15
	//  494 1028:istore          7
		} else
	//* 495 1030:goto            1503
		{
			float f1 = mWeightSum;
	//  496 1033:aload_0         
	//  497 1034:getfield        #117 <Field float mWeightSum>
	//  498 1037:fstore          4
			if(f1 > 0.0F)
	//* 499 1039:fload           4
	//* 500 1041:fconst_0        
	//* 501 1042:fcmpl           
	//* 502 1043:ifle            1049
				f = f1;
	//  503 1046:fload           4
	//  504 1048:fstore_3        
			mTotalLength = 0;
	//  505 1049:aload_0         
	//  506 1050:iconst_0        
	//  507 1051:putfield        #326 <Field int mTotalLength>
			int i2 = 0;
	//  508 1054:iconst_0        
	//  509 1055:istore          10
			l = k1;
	//  510 1057:iload           9
	//  511 1059:istore          6
			k1 = i1;
	//  512 1061:iload           7
	//  513 1063:istore          9
			i1 = l3;
	//  514 1065:iload           15
	//  515 1067:istore          7
			for(; i2 < l2; i2++)
	//* 516 1069:iload           10
	//* 517 1071:iload           13
	//* 518 1073:icmpge          1473
			{
				View view3 = getVirtualChildAt(i2);
	//  519 1076:aload_0         
	//  520 1077:iload           10
	//  521 1079:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  522 1082:astore          24
				if(view3.getVisibility() == 8)
	//* 523 1084:aload           24
	//* 524 1086:invokevirtual   #174 <Method int View.getVisibility()>
	//* 525 1089:bipush          8
	//* 526 1091:icmpne          1097
					continue;
	//  527 1094:goto            1464
				LayoutParams layoutparams2 = (LayoutParams)view3.getLayoutParams();
	//  528 1097:aload           24
	//  529 1099:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  530 1102:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  531 1105:astore          25
				float f2 = layoutparams2.weight;
	//  532 1107:aload           25
	//  533 1109:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  534 1112:fstore          4
				if(f2 > 0.0F)
	//* 535 1114:fload           4
	//* 536 1116:fconst_0        
	//* 537 1117:fcmpl           
	//* 538 1118:ifle            1305
				{
					int i4 = (int)(((float)k1 * f2) / f);
	//  539 1121:iload           9
	//  540 1123:i2f             
	//  541 1124:fload           4
	//  542 1126:fmul            
	//  543 1127:fload_3         
	//  544 1128:fdiv            
	//  545 1129:f2i             
	//  546 1130:istore          15
					int j5 = getPaddingLeft();
	//  547 1132:aload_0         
	//  548 1133:invokevirtual   #237 <Method int getPaddingLeft()>
	//  549 1136:istore          16
					int l6 = getPaddingRight();
	//  550 1138:aload_0         
	//  551 1139:invokevirtual   #243 <Method int getPaddingRight()>
	//  552 1142:istore          18
					int j3 = k1 - i4;
	//  553 1144:iload           9
	//  554 1146:iload           15
	//  555 1148:isub            
	//  556 1149:istore          14
					k1 = layoutparams2.leftMargin;
	//  557 1151:aload           25
	//  558 1153:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  559 1156:istore          9
					int j7 = layoutparams2.rightMargin;
	//  560 1158:aload           25
	//  561 1160:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  562 1163:istore          19
					int l7 = layoutparams2.width;
	//  563 1165:aload           25
	//  564 1167:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//  565 1170:istore          20
					f -= f2;
	//  566 1172:fload_3         
	//  567 1173:fload           4
	//  568 1175:fsub            
	//  569 1176:fstore_3        
					j5 = getChildMeasureSpec(i, j5 + l6 + k1 + j7, l7);
	//  570 1177:iload_1         
	//  571 1178:iload           16
	//  572 1180:iload           18
	//  573 1182:iadd            
	//  574 1183:iload           9
	//  575 1185:iadd            
	//  576 1186:iload           19
	//  577 1188:iadd            
	//  578 1189:iload           20
	//  579 1191:invokestatic    #421 <Method int getChildMeasureSpec(int, int, int)>
	//  580 1194:istore          16
					if(layoutparams2.height == 0 && j2 == 0x40000000)
	//* 581 1196:aload           25
	//* 582 1198:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 583 1201:ifne            1246
	//* 584 1204:iload           11
	//* 585 1206:ldc1            #160 <Int 0x40000000>
	//* 586 1208:icmpeq          1214
	//* 587 1211:goto            1246
					{
						if(i4 > 0)
	//* 588 1214:iload           15
	//* 589 1216:ifle            1226
							k1 = i4;
	//  590 1219:iload           15
	//  591 1221:istore          9
						else
	//* 592 1223:goto            1229
							k1 = 0;
	//  593 1226:iconst_0        
	//  594 1227:istore          9
						view3.measure(j5, android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000));
	//  595 1229:aload           24
	//  596 1231:iload           16
	//  597 1233:iload           9
	//  598 1235:ldc1            #160 <Int 0x40000000>
	//  599 1237:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  600 1240:invokevirtual   #401 <Method void View.measure(int, int)>
					} else
	//* 601 1243:goto            1282
					{
						i4 = view3.getMeasuredHeight() + i4;
	//  602 1246:aload           24
	//  603 1248:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  604 1251:iload           15
	//  605 1253:iadd            
	//  606 1254:istore          15
						k1 = i4;
	//  607 1256:iload           15
	//  608 1258:istore          9
						if(i4 < 0)
	//* 609 1260:iload           15
	//* 610 1262:ifge            1268
							k1 = 0;
	//  611 1265:iconst_0        
	//  612 1266:istore          9
						view3.measure(j5, android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000));
	//  613 1268:aload           24
	//  614 1270:iload           16
	//  615 1272:iload           9
	//  616 1274:ldc1            #160 <Int 0x40000000>
	//  617 1276:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  618 1279:invokevirtual   #401 <Method void View.measure(int, int)>
					}
					k = View.combineMeasuredStates(k, view3.getMeasuredState() & 0xffffff00);
	//  619 1282:iload           5
	//  620 1284:aload           24
	//  621 1286:invokevirtual   #407 <Method int View.getMeasuredState()>
	//  622 1289:sipush          -256
	//  623 1292:iand            
	//  624 1293:invokestatic    #410 <Method int View.combineMeasuredStates(int, int)>
	//  625 1296:istore          5
					k1 = j3;
	//  626 1298:iload           14
	//  627 1300:istore          9
				}
	//* 628 1302:goto            1305
				int j4 = layoutparams2.leftMargin + layoutparams2.rightMargin;
	//  629 1305:aload           25
	//  630 1307:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  631 1310:aload           25
	//  632 1312:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  633 1315:iadd            
	//  634 1316:istore          15
				int k5 = view3.getMeasuredWidth() + j4;
	//  635 1318:aload           24
	//  636 1320:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  637 1323:iload           15
	//  638 1325:iadd            
	//  639 1326:istore          16
				int k3 = Math.max(i1, k5);
	//  640 1328:iload           7
	//  641 1330:iload           16
	//  642 1332:invokestatic    #398 <Method int Math.max(int, int)>
	//  643 1335:istore          14
				if(i8 != 0x40000000 && layoutparams2.width == -1)
	//* 644 1337:iload           21
	//* 645 1339:ldc1            #160 <Int 0x40000000>
	//* 646 1341:icmpeq          1359
	//* 647 1344:aload           25
	//* 648 1346:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 649 1349:iconst_m1       
	//* 650 1350:icmpne          1359
					i1 = 1;
	//  651 1353:iconst_1        
	//  652 1354:istore          7
				else
	//* 653 1356:goto            1362
					i1 = 0;
	//  654 1359:iconst_0        
	//  655 1360:istore          7
				if(i1 != 0)
	//* 656 1362:iload           7
	//* 657 1364:ifeq            1374
					i1 = j4;
	//  658 1367:iload           15
	//  659 1369:istore          7
				else
	//* 660 1371:goto            1378
					i1 = k5;
	//  661 1374:iload           16
	//  662 1376:istore          7
				i1 = Math.max(l, i1);
	//  663 1378:iload           6
	//  664 1380:iload           7
	//  665 1382:invokestatic    #398 <Method int Math.max(int, int)>
	//  666 1385:istore          7
				if(j1 != 0 && layoutparams2.width == -1)
	//* 667 1387:iload           8
	//* 668 1389:ifeq            1407
	//* 669 1392:aload           25
	//* 670 1394:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 671 1397:iconst_m1       
	//* 672 1398:icmpne          1407
					l = 1;
	//  673 1401:iconst_1        
	//  674 1402:istore          6
				else
	//* 675 1404:goto            1410
					l = 0;
	//  676 1407:iconst_0        
	//  677 1408:istore          6
				j1 = mTotalLength;
	//  678 1410:aload_0         
	//  679 1411:getfield        #326 <Field int mTotalLength>
	//  680 1414:istore          8
				mTotalLength = Math.max(j1, view3.getMeasuredHeight() + j1 + layoutparams2.topMargin + layoutparams2.bottomMargin + getNextLocationOffset(view3));
	//  681 1416:aload_0         
	//  682 1417:iload           8
	//  683 1419:aload           24
	//  684 1421:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  685 1424:iload           8
	//  686 1426:iadd            
	//  687 1427:aload           25
	//  688 1429:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  689 1432:iadd            
	//  690 1433:aload           25
	//  691 1435:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  692 1438:iadd            
	//  693 1439:aload_0         
	//  694 1440:aload           24
	//  695 1442:invokevirtual   #381 <Method int getNextLocationOffset(View)>
	//  696 1445:iadd            
	//  697 1446:invokestatic    #398 <Method int Math.max(int, int)>
	//  698 1449:putfield        #326 <Field int mTotalLength>
				j1 = l;
	//  699 1452:iload           6
	//  700 1454:istore          8
				l = i1;
	//  701 1456:iload           7
	//  702 1458:istore          6
				i1 = k3;
	//  703 1460:iload           14
	//  704 1462:istore          7
			}

	//  705 1464:iload           10
	//  706 1466:iconst_1        
	//  707 1467:iadd            
	//  708 1468:istore          10
	//* 709 1470:goto            1069
			mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
	//  710 1473:aload_0         
	//  711 1474:aload_0         
	//  712 1475:getfield        #326 <Field int mTotalLength>
	//  713 1478:aload_0         
	//  714 1479:invokevirtual   #280 <Method int getPaddingTop()>
	//  715 1482:aload_0         
	//  716 1483:invokevirtual   #261 <Method int getPaddingBottom()>
	//  717 1486:iadd            
	//  718 1487:iadd            
	//  719 1488:putfield        #326 <Field int mTotalLength>
			k1 = l;
	//  720 1491:iload           6
	//  721 1493:istore          9
			l = k;
	//  722 1495:iload           5
	//  723 1497:istore          6
			k = k1;
	//  724 1499:iload           9
	//  725 1501:istore          5
		}
		if(j1 != 0 || i8 == 0x40000000)
	//* 726 1503:iload           8
	//* 727 1505:ifne            1518
	//* 728 1508:iload           21
	//* 729 1510:ldc1            #160 <Int 0x40000000>
	//* 730 1512:icmpeq          1518
	//* 731 1515:goto            1522
			k = i1;
	//  732 1518:iload           7
	//  733 1520:istore          5
		setMeasuredDimension(View.resolveSizeAndState(Math.max(k + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, l), j6);
	//  734 1522:aload_0         
	//  735 1523:iload           5
	//  736 1525:aload_0         
	//  737 1526:invokevirtual   #237 <Method int getPaddingLeft()>
	//  738 1529:aload_0         
	//  739 1530:invokevirtual   #243 <Method int getPaddingRight()>
	//  740 1533:iadd            
	//  741 1534:iadd            
	//  742 1535:aload_0         
	//  743 1536:invokevirtual   #413 <Method int getSuggestedMinimumWidth()>
	//  744 1539:invokestatic    #398 <Method int Math.max(int, int)>
	//  745 1542:iload_1         
	//  746 1543:iload           6
	//  747 1545:invokestatic    #417 <Method int View.resolveSizeAndState(int, int, int)>
	//  748 1548:iload           17
	//  749 1550:invokevirtual   #428 <Method void setMeasuredDimension(int, int)>
		if(k2 != 0)
	//* 750 1553:iload           12
	//* 751 1555:ifeq            1565
			forceUniformWidth(l2, j);
	//  752 1558:aload_0         
	//  753 1559:iload           13
	//  754 1561:iload_2         
	//  755 1562:invokespecial   #435 <Method void forceUniformWidth(int, int)>
	//  756 1565:return          
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
	//*   1    1:iflt            18
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #311 <Method int getChildCount()>
	//*   5    9:icmpge          18
		{
			mBaselineAlignedChildIndex = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #63  <Field int mBaselineAlignedChildIndex>
			return;
	//    9   17:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   18:new             #477 <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #479 <Method void StringBuilder()>
	//   13   25:astore_2        
			stringbuilder.append("base aligned child index out of range (0, ");
	//   14   26:aload_2         
	//   15   27:ldc2            #481 <String "base aligned child index out of range (0, ">
	//   16   30:invokevirtual   #485 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
			stringbuilder.append(getChildCount());
	//   18   34:aload_2         
	//   19   35:aload_0         
	//   20   36:invokevirtual   #311 <Method int getChildCount()>
	//   21   39:invokevirtual   #488 <Method StringBuilder StringBuilder.append(int)>
	//   22   42:pop             
			stringbuilder.append(")");
	//   23   43:aload_2         
	//   24   44:ldc2            #490 <String ")">
	//   25   47:invokevirtual   #485 <Method StringBuilder StringBuilder.append(String)>
	//   26   50:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   27   51:new             #492 <Class IllegalArgumentException>
	//   28   54:dup             
	//   29   55:aload_2         
	//   30   56:invokevirtual   #495 <Method String StringBuilder.toString()>
	//   31   59:invokespecial   #496 <Method void IllegalArgumentException(String)>
	//   32   62:athrow          
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
		int j = mGravity;
	//    4    6:aload_0         
	//    5    7:getfield        #68  <Field int mGravity>
	//    6   10:istore_2        
		if((0x800007 & j) != i)
	//*   7   11:ldc2            #358 <Int 0x800007>
	//*   8   14:iload_2         
	//*   9   15:iand            
	//*  10   16:iload_1         
	//*  11   17:icmpeq          35
		{
			mGravity = i | 0xff7ffff8 & j;
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:ldc2            #512 <Int 0xff7ffff8>
	//   15   25:iload_2         
	//   16   26:iand            
	//   17   27:ior             
	//   18   28:putfield        #68  <Field int mGravity>
			requestLayout();
	//   19   31:aload_0         
	//   20   32:invokevirtual   #508 <Method void requestLayout()>
		}
	//   21   35:return          
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
		int j = mGravity;
	//    4    5:aload_0         
	//    5    6:getfield        #68  <Field int mGravity>
	//    6    9:istore_2        
		if((j & 0x70) != i)
	//*   7   10:iload_2         
	//*   8   11:bipush          112
	//*   9   13:iand            
	//*  10   14:iload_1         
	//*  11   15:icmpeq          32
		{
			mGravity = i | j & 0xffffff8f;
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:iload_2         
	//   15   21:bipush          -113
	//   16   23:iand            
	//   17   24:ior             
	//   18   25:putfield        #68  <Field int mGravity>
			requestLayout();
	//   19   28:aload_0         
	//   20   29:invokevirtual   #508 <Method void requestLayout()>
		}
	//   21   32:return          
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
