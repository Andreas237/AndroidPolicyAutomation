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
	//*  45   87:icmpne          193
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
	//*  55  105:icmpeq          193
				switch(l)
	//*  56  108:iload           4
				{
	//*  57  110:lookupswitch    2: default 136
	//	               16: 164
	//	               80: 141
				default:
					i = j;
	//   58  136:iload_2         
	//   59  137:istore_1        
					break;

	//*  60  138:goto            193
				case 80: // 'P'
					i = getBottom() - getTop() - getPaddingBottom() - mTotalLength;
	//   61  141:aload_0         
	//   62  142:invokevirtual   #325 <Method int getBottom()>
	//   63  145:aload_0         
	//   64  146:invokevirtual   #326 <Method int getTop()>
	//   65  149:isub            
	//   66  150:aload_0         
	//   67  151:invokevirtual   #261 <Method int getPaddingBottom()>
	//   68  154:isub            
	//   69  155:aload_0         
	//   70  156:getfield        #328 <Field int mTotalLength>
	//   71  159:isub            
	//   72  160:istore_1        
					break;

	//*  73  161:goto            193
				case 16: // '\020'
					i = j + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - mTotalLength) / 2;
	//   74  164:iload_2         
	//   75  165:aload_0         
	//   76  166:invokevirtual   #325 <Method int getBottom()>
	//   77  169:aload_0         
	//   78  170:invokevirtual   #326 <Method int getTop()>
	//   79  173:isub            
	//   80  174:aload_0         
	//   81  175:invokevirtual   #280 <Method int getPaddingTop()>
	//   82  178:isub            
	//   83  179:aload_0         
	//   84  180:invokevirtual   #261 <Method int getPaddingBottom()>
	//   85  183:isub            
	//   86  184:aload_0         
	//   87  185:getfield        #328 <Field int mTotalLength>
	//   88  188:isub            
	//   89  189:iconst_2        
	//   90  190:idiv            
	//   91  191:iadd            
	//   92  192:istore_1        
					break;
				}
		}
		return ((LayoutParams)view.getLayoutParams()).topMargin + i + k;
	//   93  193:aload           5
	//   94  195:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   95  198:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   96  201:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//   97  204:iload_1         
	//   98  205:iadd            
	//   99  206:iload_3         
	//  100  207:iadd            
	//  101  208:ireturn         
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
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            17
			return (mShowDividers & 1) != 0;
	//    2    4:aload_0         
	//    3    5:getfield        #141 <Field int mShowDividers>
	//    4    8:iconst_1        
	//    5    9:iand            
	//    6   10:ifeq            15
	//    7   13:iconst_1        
	//    8   14:ireturn         
	//    9   15:iconst_0        
	//   10   16:ireturn         
		if(i == getChildCount())
	//*  11   17:iload_1         
	//*  12   18:aload_0         
	//*  13   19:invokevirtual   #311 <Method int getChildCount()>
	//*  14   22:icmpne          38
			return (mShowDividers & 4) != 0;
	//   15   25:aload_0         
	//   16   26:getfield        #141 <Field int mShowDividers>
	//   17   29:iconst_4        
	//   18   30:iand            
	//   19   31:ifeq            36
	//   20   34:iconst_1        
	//   21   35:ireturn         
	//   22   36:iconst_0        
	//   23   37:ireturn         
		if((mShowDividers & 2) != 0)
	//*  24   38:aload_0         
	//*  25   39:getfield        #141 <Field int mShowDividers>
	//*  26   42:iconst_2        
	//*  27   43:iand            
	//*  28   44:ifeq            79
		{
			for(i--; i >= 0; i--)
	//*  29   47:iload_1         
	//*  30   48:iconst_1        
	//*  31   49:isub            
	//*  32   50:istore_1        
	//*  33   51:iload_1         
	//*  34   52:iflt            77
				if(getChildAt(i).getVisibility() != 8)
	//*  35   55:aload_0         
	//*  36   56:iload_1         
	//*  37   57:invokevirtual   #321 <Method View getChildAt(int)>
	//*  38   60:invokevirtual   #174 <Method int View.getVisibility()>
	//*  39   63:bipush          8
	//*  40   65:icmpeq          70
					return true;
	//   41   68:iconst_1        
	//   42   69:ireturn         

	//   43   70:iload_1         
	//   44   71:iconst_1        
	//   45   72:isub            
	//   46   73:istore_1        
	//*  47   74:goto            51
			return false;
	//   48   77:iconst_0        
	//   49   78:ireturn         
		} else
		{
			return false;
	//   50   79:iconst_0        
	//   51   80:ireturn         
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
		boolean flag = ViewUtils.isLayoutRtl(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #212 <Method boolean ViewUtils.isLayoutRtl(View)>
	//    2    4:istore          17
		int j1 = getPaddingTop();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #280 <Method int getPaddingTop()>
	//    5   10:istore          7
		int j2 = l - j;
	//    6   12:iload           4
	//    7   14:iload_2         
	//    8   15:isub            
	//    9   16:istore          9
		int k2 = getPaddingBottom();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #261 <Method int getPaddingBottom()>
	//   12   22:istore          10
		int l2 = getPaddingBottom();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #261 <Method int getPaddingBottom()>
	//   15   28:istore          11
		int i3 = getVirtualChildCount();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #206 <Method int getVirtualChildCount()>
	//   18   34:istore          12
		j = mGravity;
	//   19   36:aload_0         
	//   20   37:getfield        #68  <Field int mGravity>
	//   21   40:istore_2        
		int j3 = mGravity;
	//   22   41:aload_0         
	//   23   42:getfield        #68  <Field int mGravity>
	//   24   45:istore          13
		boolean flag1 = mBaselineAligned;
	//   25   47:aload_0         
	//   26   48:getfield        #61  <Field boolean mBaselineAligned>
	//   27   51:istore          18
		int ai[] = mMaxAscent;
	//   28   53:aload_0         
	//   29   54:getfield        #354 <Field int[] mMaxAscent>
	//   30   57:astore          19
		int ai1[] = mMaxDescent;
	//   31   59:aload_0         
	//   32   60:getfield        #356 <Field int[] mMaxDescent>
	//   33   63:astore          20
		switch(GravityCompat.getAbsoluteGravity(j & 0x800007, ViewCompat.getLayoutDirection(((View) (this)))))
	//*  34   65:iload_2         
	//*  35   66:ldc2            #357 <Int 0x800007>
	//*  36   69:iand            
	//*  37   70:aload_0         
	//*  38   71:invokestatic    #362 <Method int ViewCompat.getLayoutDirection(View)>
	//*  39   74:invokestatic    #367 <Method int GravityCompat.getAbsoluteGravity(int, int)>
		{
	//*  40   77:tableswitch     1 5: default 112
	//	               1 132
	//	               2 151
	//	               3 151
	//	               4 151
	//	               5 115
	//*  41  112:goto            151
		case 5: // '\005'
			i = (getPaddingLeft() + k) - i - mTotalLength;
	//   42  115:aload_0         
	//   43  116:invokevirtual   #237 <Method int getPaddingLeft()>
	//   44  119:iload_3         
	//   45  120:iadd            
	//   46  121:iload_1         
	//   47  122:isub            
	//   48  123:aload_0         
	//   49  124:getfield        #328 <Field int mTotalLength>
	//   50  127:isub            
	//   51  128:istore_1        
			break;

	//*  52  129:goto            156
		case 1: // '\001'
			i = getPaddingLeft() + (k - i - mTotalLength) / 2;
	//   53  132:aload_0         
	//   54  133:invokevirtual   #237 <Method int getPaddingLeft()>
	//   55  136:iload_3         
	//   56  137:iload_1         
	//   57  138:isub            
	//   58  139:aload_0         
	//   59  140:getfield        #328 <Field int mTotalLength>
	//   60  143:isub            
	//   61  144:iconst_2        
	//   62  145:idiv            
	//   63  146:iadd            
	//   64  147:istore_1        
			break;

	//*  65  148:goto            156
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		default:
			i = getPaddingLeft();
	//   66  151:aload_0         
	//   67  152:invokevirtual   #237 <Method int getPaddingLeft()>
	//   68  155:istore_1        
			break;
		}
		l = 0;
	//   69  156:iconst_0        
	//   70  157:istore          4
		byte byte0 = 1;
	//   71  159:iconst_1        
	//   72  160:istore          5
		if(flag)
	//*  73  162:iload           17
	//*  74  164:ifeq            176
		{
			l = i3 - 1;
	//   75  167:iload           12
	//   76  169:iconst_1        
	//   77  170:isub            
	//   78  171:istore          4
			byte0 = -1;
	//   79  173:iconst_m1       
	//   80  174:istore          5
		}
		j = 0;
	//   81  176:iconst_0        
	//   82  177:istore_2        
		for(k = i; j < i3; k = i)
	//*  83  178:iload_1         
	//*  84  179:istore_3        
	//*  85  180:iload_2         
	//*  86  181:iload           12
	//*  87  183:icmpge          558
		{
			int k3 = l + byte0 * j;
	//   88  186:iload           4
	//   89  188:iload           5
	//   90  190:iload_2         
	//   91  191:imul            
	//   92  192:iadd            
	//   93  193:istore          14
			View view = getVirtualChildAt(k3);
	//   94  195:aload_0         
	//   95  196:iload           14
	//   96  198:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   97  201:astore          21
			int i1;
			if(view == null)
	//*  98  203:aload           21
	//*  99  205:ifnonnull       223
			{
				i = k + measureNullChild(k3);
	//  100  208:iload_3         
	//  101  209:aload_0         
	//  102  210:iload           14
	//  103  212:invokevirtual   #371 <Method int measureNullChild(int)>
	//  104  215:iadd            
	//  105  216:istore_1        
				i1 = j;
	//  106  217:iload_2         
	//  107  218:istore          6
			} else
	//* 108  220:goto            548
			{
				i = k;
	//  109  223:iload_3         
	//  110  224:istore_1        
				i1 = j;
	//  111  225:iload_2         
	//  112  226:istore          6
				if(view.getVisibility() != 8)
	//* 113  228:aload           21
	//* 114  230:invokevirtual   #174 <Method int View.getVisibility()>
	//* 115  233:bipush          8
	//* 116  235:icmpeq          548
				{
					int l3 = view.getMeasuredWidth();
	//  117  238:aload           21
	//  118  240:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  119  243:istore          15
					int i4 = view.getMeasuredHeight();
	//  120  245:aload           21
	//  121  247:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  122  250:istore          16
					i = -1;
	//  123  252:iconst_m1       
	//  124  253:istore_1        
					LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//  125  254:aload           21
	//  126  256:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  127  259:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  128  262:astore          22
					i1 = i;
	//  129  264:iload_1         
	//  130  265:istore          6
					if(flag1)
	//* 131  267:iload           18
	//* 132  269:ifeq            291
					{
						i1 = i;
	//  133  272:iload_1         
	//  134  273:istore          6
						if(layoutparams.height != -1)
	//* 135  275:aload           22
	//* 136  277:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 137  280:iconst_m1       
	//* 138  281:icmpeq          291
							i1 = view.getBaseline();
	//  139  284:aload           21
	//  140  286:invokevirtual   #322 <Method int View.getBaseline()>
	//  141  289:istore          6
					}
					int k1 = layoutparams.gravity;
	//  142  291:aload           22
	//  143  293:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//  144  296:istore          8
					i = k1;
	//  145  298:iload           8
	//  146  300:istore_1        
					if(k1 < 0)
	//* 147  301:iload           8
	//* 148  303:ifge            312
						i = j3 & 0x70;
	//  149  306:iload           13
	//  150  308:bipush          112
	//  151  310:iand            
	//  152  311:istore_1        
					switch(i & 0x70)
	//* 153  312:iload_1         
	//* 154  313:bipush          112
	//* 155  315:iand            
					{
	//* 156  316:lookupswitch    3: default 352
	//	               16: 388
	//	               48: 355
	//	               80: 420
	//* 157  352:goto            467
					case 48: // '0'
						int l1 = j1 + layoutparams.topMargin;
	//  158  355:iload           7
	//  159  357:aload           22
	//  160  359:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  161  362:iadd            
	//  162  363:istore          8
						i = l1;
	//  163  365:iload           8
	//  164  367:istore_1        
						if(i1 != -1)
	//* 165  368:iload           6
	//* 166  370:iconst_m1       
	//* 167  371:icmpeq          470
							i = l1 + (ai[1] - i1);
	//  168  374:iload           8
	//  169  376:aload           19
	//  170  378:iconst_1        
	//  171  379:iaload          
	//  172  380:iload           6
	//  173  382:isub            
	//  174  383:iadd            
	//  175  384:istore_1        
						break;
	//  176  385:goto            470

					case 16: // '\020'
						i = ((j2 - j1 - l2 - i4) / 2 + j1 + layoutparams.topMargin) - layoutparams.bottomMargin;
	//  177  388:iload           9
	//  178  390:iload           7
	//  179  392:isub            
	//  180  393:iload           11
	//  181  395:isub            
	//  182  396:iload           16
	//  183  398:isub            
	//  184  399:iconst_2        
	//  185  400:idiv            
	//  186  401:iload           7
	//  187  403:iadd            
	//  188  404:aload           22
	//  189  406:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  190  409:iadd            
	//  191  410:aload           22
	//  192  412:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  193  415:isub            
	//  194  416:istore_1        
						break;
	//  195  417:goto            470

					case 80: // 'P'
						int i2 = j2 - k2 - i4 - layoutparams.bottomMargin;
	//  196  420:iload           9
	//  197  422:iload           10
	//  198  424:isub            
	//  199  425:iload           16
	//  200  427:isub            
	//  201  428:aload           22
	//  202  430:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  203  433:isub            
	//  204  434:istore          8
						i = i2;
	//  205  436:iload           8
	//  206  438:istore_1        
						if(i1 != -1)
	//* 207  439:iload           6
	//* 208  441:iconst_m1       
	//* 209  442:icmpeq          470
						{
							i = view.getMeasuredHeight();
	//  210  445:aload           21
	//  211  447:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  212  450:istore_1        
							i = i2 - (ai1[2] - (i - i1));
	//  213  451:iload           8
	//  214  453:aload           20
	//  215  455:iconst_2        
	//  216  456:iaload          
	//  217  457:iload_1         
	//  218  458:iload           6
	//  219  460:isub            
	//  220  461:isub            
	//  221  462:isub            
	//  222  463:istore_1        
						}
						break;

	//* 223  464:goto            470
					default:
						i = j1;
	//  224  467:iload           7
	//  225  469:istore_1        
						break;
					}
					i1 = k;
	//  226  470:iload_3         
	//  227  471:istore          6
					if(hasDividerBeforeChildAt(k3))
	//* 228  473:aload_0         
	//* 229  474:iload           14
	//* 230  476:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 231  479:ifeq            490
						i1 = k + mDividerWidth;
	//  232  482:iload_3         
	//  233  483:aload_0         
	//  234  484:getfield        #230 <Field int mDividerWidth>
	//  235  487:iadd            
	//  236  488:istore          6
					k = i1 + layoutparams.leftMargin;
	//  237  490:iload           6
	//  238  492:aload           22
	//  239  494:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  240  497:iadd            
	//  241  498:istore_3        
					setChildFrame(view, getLocationOffset(view) + k, i, l3, i4);
	//  242  499:aload_0         
	//  243  500:aload           21
	//  244  502:aload_0         
	//  245  503:aload           21
	//  246  505:invokevirtual   #376 <Method int getLocationOffset(View)>
	//  247  508:iload_3         
	//  248  509:iadd            
	//  249  510:iload_1         
	//  250  511:iload           15
	//  251  513:iload           16
	//  252  515:invokespecial   #378 <Method void setChildFrame(View, int, int, int, int)>
					i = k + (layoutparams.rightMargin + l3 + getNextLocationOffset(view));
	//  253  518:iload_3         
	//  254  519:aload           22
	//  255  521:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  256  524:iload           15
	//  257  526:iadd            
	//  258  527:aload_0         
	//  259  528:aload           21
	//  260  530:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  261  533:iadd            
	//  262  534:iadd            
	//  263  535:istore_1        
					i1 = j + getChildrenSkipCount(view, k3);
	//  264  536:iload_2         
	//  265  537:aload_0         
	//  266  538:aload           21
	//  267  540:iload           14
	//  268  542:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//  269  545:iadd            
	//  270  546:istore          6
				}
			}
			j = i1 + 1;
	//  271  548:iload           6
	//  272  550:iconst_1        
	//  273  551:iadd            
	//  274  552:istore_2        
		}

	//  275  553:iload_1         
	//  276  554:istore_3        
	//* 277  555:goto            180
	//  278  558:return          
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
		i = mGravity;
	//   16   29:aload_0         
	//   17   30:getfield        #68  <Field int mGravity>
	//   18   33:istore_1        
		int j2 = mGravity;
	//   19   34:aload_0         
	//   20   35:getfield        #68  <Field int mGravity>
	//   21   38:istore          10
		switch(i & 0x70)
	//*  22   40:iload_1         
	//*  23   41:bipush          112
	//*  24   43:iand            
		{
	//*  25   44:lookupswitch    3: default 80
	//	               16: 101
	//	               48: 121
	//	               80: 83
	//*  26   80:goto            121
		case 80: // 'P'
			i = (getPaddingTop() + l) - j - mTotalLength;
	//   27   83:aload_0         
	//   28   84:invokevirtual   #280 <Method int getPaddingTop()>
	//   29   87:iload           4
	//   30   89:iadd            
	//   31   90:iload_2         
	//   32   91:isub            
	//   33   92:aload_0         
	//   34   93:getfield        #328 <Field int mTotalLength>
	//   35   96:isub            
	//   36   97:istore_1        
			break;

	//*  37   98:goto            126
		case 16: // '\020'
			i = getPaddingTop() + (l - j - mTotalLength) / 2;
	//   38  101:aload_0         
	//   39  102:invokevirtual   #280 <Method int getPaddingTop()>
	//   40  105:iload           4
	//   41  107:iload_2         
	//   42  108:isub            
	//   43  109:aload_0         
	//   44  110:getfield        #328 <Field int mTotalLength>
	//   45  113:isub            
	//   46  114:iconst_2        
	//   47  115:idiv            
	//   48  116:iadd            
	//   49  117:istore_1        
			break;

	//*  50  118:goto            126
		case 48: // '0'
		default:
			i = getPaddingTop();
	//   51  121:aload_0         
	//   52  122:invokevirtual   #280 <Method int getPaddingTop()>
	//   53  125:istore_1        
			break;
		}
		for(j = 0; j < i2;)
	//*  54  126:iconst_0        
	//*  55  127:istore_2        
	//*  56  128:iload_2         
	//*  57  129:iload           9
	//*  58  131:icmpge          416
		{
			View view = getVirtualChildAt(j);
	//   59  134:aload_0         
	//   60  135:iload_2         
	//   61  136:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   62  139:astore          13
			if(view == null)
	//*  63  141:aload           13
	//*  64  143:ifnonnull       160
			{
				k = i + measureNullChild(j);
	//   65  146:iload_1         
	//   66  147:aload_0         
	//   67  148:iload_2         
	//   68  149:invokevirtual   #371 <Method int measureNullChild(int)>
	//   69  152:iadd            
	//   70  153:istore_3        
				l = j;
	//   71  154:iload_2         
	//   72  155:istore          4
			} else
	//*  73  157:goto            406
			{
				k = i;
	//   74  160:iload_1         
	//   75  161:istore_3        
				l = j;
	//   76  162:iload_2         
	//   77  163:istore          4
				if(view.getVisibility() != 8)
	//*  78  165:aload           13
	//*  79  167:invokevirtual   #174 <Method int View.getVisibility()>
	//*  80  170:bipush          8
	//*  81  172:icmpeq          406
				{
					int k2 = view.getMeasuredWidth();
	//   82  175:aload           13
	//   83  177:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//   84  180:istore          11
					int l2 = view.getMeasuredHeight();
	//   85  182:aload           13
	//   86  184:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//   87  187:istore          12
					LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   88  189:aload           13
	//   89  191:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   90  194:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   91  197:astore          14
					l = layoutparams.gravity;
	//   92  199:aload           14
	//   93  201:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//   94  204:istore          4
					k = l;
	//   95  206:iload           4
	//   96  208:istore_3        
					if(l < 0)
	//*  97  209:iload           4
	//*  98  211:ifge            221
						k = j2 & 0x800007;
	//   99  214:iload           10
	//  100  216:ldc2            #357 <Int 0x800007>
	//  101  219:iand            
	//  102  220:istore_3        
					switch(GravityCompat.getAbsoluteGravity(k, ViewCompat.getLayoutDirection(((View) (this)))) & 7)
	//* 103  221:iload_3         
	//* 104  222:aload_0         
	//* 105  223:invokestatic    #362 <Method int ViewCompat.getLayoutDirection(View)>
	//* 106  226:invokestatic    #367 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//* 107  229:bipush          7
	//* 108  231:iand            
					{
	//* 109  232:tableswitch     1 5: default 268
	//	               1 271
	//	               2 321
	//	               3 321
	//	               4 321
	//	               5 303
	//* 110  268:goto            321
					case 1: // '\001'
						k = ((j1 - i1 - l1 - k2) / 2 + i1 + layoutparams.leftMargin) - layoutparams.rightMargin;
	//  111  271:iload           6
	//  112  273:iload           5
	//  113  275:isub            
	//  114  276:iload           8
	//  115  278:isub            
	//  116  279:iload           11
	//  117  281:isub            
	//  118  282:iconst_2        
	//  119  283:idiv            
	//  120  284:iload           5
	//  121  286:iadd            
	//  122  287:aload           14
	//  123  289:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  124  292:iadd            
	//  125  293:aload           14
	//  126  295:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  127  298:isub            
	//  128  299:istore_3        
						break;

	//* 129  300:goto            330
					case 5: // '\005'
						k = j1 - k1 - k2 - layoutparams.rightMargin;
	//  130  303:iload           6
	//  131  305:iload           7
	//  132  307:isub            
	//  133  308:iload           11
	//  134  310:isub            
	//  135  311:aload           14
	//  136  313:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  137  316:isub            
	//  138  317:istore_3        
						break;

	//* 139  318:goto            330
					case 2: // '\002'
					case 3: // '\003'
					case 4: // '\004'
					default:
						k = i1 + layoutparams.leftMargin;
	//  140  321:iload           5
	//  141  323:aload           14
	//  142  325:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  143  328:iadd            
	//  144  329:istore_3        
						break;
					}
					l = i;
	//  145  330:iload_1         
	//  146  331:istore          4
					if(hasDividerBeforeChildAt(j))
	//* 147  333:aload_0         
	//* 148  334:iload_2         
	//* 149  335:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 150  338:ifeq            349
						l = i + mDividerHeight;
	//  151  341:iload_1         
	//  152  342:aload_0         
	//  153  343:getfield        #252 <Field int mDividerHeight>
	//  154  346:iadd            
	//  155  347:istore          4
					i = l + layoutparams.topMargin;
	//  156  349:iload           4
	//  157  351:aload           14
	//  158  353:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  159  356:iadd            
	//  160  357:istore_1        
					setChildFrame(view, k, getLocationOffset(view) + i, k2, l2);
	//  161  358:aload_0         
	//  162  359:aload           13
	//  163  361:iload_3         
	//  164  362:aload_0         
	//  165  363:aload           13
	//  166  365:invokevirtual   #376 <Method int getLocationOffset(View)>
	//  167  368:iload_1         
	//  168  369:iadd            
	//  169  370:iload           11
	//  170  372:iload           12
	//  171  374:invokespecial   #378 <Method void setChildFrame(View, int, int, int, int)>
					k = i + (layoutparams.bottomMargin + l2 + getNextLocationOffset(view));
	//  172  377:iload_1         
	//  173  378:aload           14
	//  174  380:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  175  383:iload           12
	//  176  385:iadd            
	//  177  386:aload_0         
	//  178  387:aload           13
	//  179  389:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  180  392:iadd            
	//  181  393:iadd            
	//  182  394:istore_3        
					l = j + getChildrenSkipCount(view, j);
	//  183  395:iload_2         
	//  184  396:aload_0         
	//  185  397:aload           13
	//  186  399:iload_2         
	//  187  400:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//  188  403:iadd            
	//  189  404:istore          4
				}
			}
			j = l + 1;
	//  190  406:iload           4
	//  191  408:iconst_1        
	//  192  409:iadd            
	//  193  410:istore_2        
			i = k;
	//  194  411:iload_3         
	//  195  412:istore_1        
		}

	//* 196  413:goto            128
	//  197  416:return          
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
		int i2;
		int j2;
		int k2;
		boolean flag;
		int l7;
		int i8;
		int j8;
		boolean flag1;
		boolean flag2;
		int ai[];
		int ai1[];
label0:
		{
			mTotalLength = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #328 <Field int mTotalLength>
			int l2 = 0;
	//    3    5:iconst_0        
	//    4    6:istore          14
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
			l7 = getVirtualChildCount();
	//   15   22:aload_0         
	//   16   23:invokevirtual   #206 <Method int getVirtualChildCount()>
	//   17   26:istore          21
			j8 = android.view.View.MeasureSpec.getMode(i);
	//   18   28:iload_1         
	//   19   29:invokestatic    #389 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   20   32:istore          23
			i8 = android.view.View.MeasureSpec.getMode(j);
	//   21   34:iload_2         
	//   22   35:invokestatic    #389 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   23   38:istore          22
			j1 = 0;
	//   24   40:iconst_0        
	//   25   41:istore          9
			k2 = 0;
	//   26   43:iconst_0        
	//   27   44:istore          13
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
			flag1 = mBaselineAligned;
	//   80  126:aload_0         
	//   81  127:getfield        #61  <Field boolean mBaselineAligned>
	//   82  130:istore          26
			flag2 = mUseLargestChild;
	//   83  132:aload_0         
	//   84  133:getfield        #125 <Field boolean mUseLargestChild>
	//   85  136:istore          27
			if(j8 == 0x40000000)
	//*  86  138:iload           23
	//*  87  140:ldc1            #160 <Int 0x40000000>
	//*  88  142:icmpne          151
				flag = true;
	//   89  145:iconst_1        
	//   90  146:istore          17
			else
	//*  91  148:goto            154
				flag = false;
	//   92  151:iconst_0        
	//   93  152:istore          17
			j2 = 0x80000000;
	//   94  154:ldc2            #390 <Int 0x80000000>
	//   95  157:istore          12
			for(int l1 = 0; l1 < l7;)
	//*  96  159:iconst_0        
	//*  97  160:istore          11
	//*  98  162:iload           11
	//*  99  164:iload           21
	//* 100  166:icmpge          885
			{
				View view1 = getVirtualChildAt(l1);
	//  101  169:aload_0         
	//  102  170:iload           11
	//  103  172:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  104  175:astore          30
				int j5;
				if(view1 == null)
	//* 105  177:aload           30
	//* 106  179:ifnonnull       204
				{
					mTotalLength = mTotalLength + measureNullChild(l1);
	//  107  182:aload_0         
	//  108  183:aload_0         
	//  109  184:getfield        #328 <Field int mTotalLength>
	//  110  187:aload_0         
	//  111  188:iload           11
	//  112  190:invokevirtual   #371 <Method int measureNullChild(int)>
	//  113  193:iadd            
	//  114  194:putfield        #328 <Field int mTotalLength>
					j5 = j2;
	//  115  197:iload           12
	//  116  199:istore          16
				} else
	//* 117  201:goto            872
				if(view1.getVisibility() == 8)
	//* 118  204:aload           30
	//* 119  206:invokevirtual   #174 <Method int View.getVisibility()>
	//* 120  209:bipush          8
	//* 121  211:icmpne          234
				{
					l1 += getChildrenSkipCount(view1, l1);
	//  122  214:iload           11
	//  123  216:aload_0         
	//  124  217:aload           30
	//  125  219:iload           11
	//  126  221:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//  127  224:iadd            
	//  128  225:istore          11
					j5 = j2;
	//  129  227:iload           12
	//  130  229:istore          16
				} else
	//* 131  231:goto            872
				{
					if(hasDividerBeforeChildAt(l1))
	//* 132  234:aload_0         
	//* 133  235:iload           11
	//* 134  237:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//* 135  240:ifeq            256
						mTotalLength = mTotalLength + mDividerWidth;
	//  136  243:aload_0         
	//  137  244:aload_0         
	//  138  245:getfield        #328 <Field int mTotalLength>
	//  139  248:aload_0         
	//  140  249:getfield        #230 <Field int mDividerWidth>
	//  141  252:iadd            
	//  142  253:putfield        #328 <Field int mTotalLength>
					LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
	//  143  256:aload           30
	//  144  258:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  145  261:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  146  264:astore          31
					f += layoutparams.weight;
	//  147  266:fload_3         
	//  148  267:aload           31
	//  149  269:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  150  272:fadd            
	//  151  273:fstore_3        
					int i4;
					if(j8 == 0x40000000 && layoutparams.width == 0 && layoutparams.weight > 0.0F)
	//* 152  274:iload           23
	//* 153  276:ldc1            #160 <Int 0x40000000>
	//* 154  278:icmpne          398
	//* 155  281:aload           31
	//* 156  283:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 157  286:ifne            398
	//* 158  289:aload           31
	//* 159  291:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 160  294:fconst_0        
	//* 161  295:fcmpl           
	//* 162  296:ifle            398
					{
						if(flag)
	//* 163  299:iload           17
	//* 164  301:ifeq            327
						{
							mTotalLength = mTotalLength + (layoutparams.leftMargin + layoutparams.rightMargin);
	//  165  304:aload_0         
	//  166  305:aload_0         
	//  167  306:getfield        #328 <Field int mTotalLength>
	//  168  309:aload           31
	//  169  311:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  170  314:aload           31
	//  171  316:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  172  319:iadd            
	//  173  320:iadd            
	//  174  321:putfield        #328 <Field int mTotalLength>
						} else
	//* 175  324:goto            356
						{
							int l3 = mTotalLength;
	//  176  327:aload_0         
	//  177  328:getfield        #328 <Field int mTotalLength>
	//  178  331:istore          15
							mTotalLength = Math.max(l3, layoutparams.leftMargin + l3 + layoutparams.rightMargin);
	//  179  333:aload_0         
	//  180  334:iload           15
	//  181  336:aload           31
	//  182  338:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  183  341:iload           15
	//  184  343:iadd            
	//  185  344:aload           31
	//  186  346:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  187  349:iadd            
	//  188  350:invokestatic    #398 <Method int Math.max(int, int)>
	//  189  353:putfield        #328 <Field int mTotalLength>
						}
						if(flag1)
	//* 190  356:iload           26
	//* 191  358:ifeq            388
						{
							i4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//  192  361:iconst_0        
	//  193  362:iconst_0        
	//  194  363:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  195  366:istore          15
							view1.measure(i4, i4);
	//  196  368:aload           30
	//  197  370:iload           15
	//  198  372:iload           15
	//  199  374:invokevirtual   #401 <Method void View.measure(int, int)>
							i4 = k2;
	//  200  377:iload           13
	//  201  379:istore          15
							j5 = j2;
	//  202  381:iload           12
	//  203  383:istore          16
						} else
	//* 204  385:goto            595
						{
							i4 = 1;
	//  205  388:iconst_1        
	//  206  389:istore          15
							j5 = j2;
	//  207  391:iload           12
	//  208  393:istore          16
						}
					} else
	//* 209  395:goto            595
					{
						j5 = 0x80000000;
	//  210  398:ldc2            #390 <Int 0x80000000>
	//  211  401:istore          16
						i4 = j5;
	//  212  403:iload           16
	//  213  405:istore          15
						if(layoutparams.width == 0)
	//* 214  407:aload           31
	//* 215  409:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 216  412:ifne            439
						{
							i4 = j5;
	//  217  415:iload           16
	//  218  417:istore          15
							if(layoutparams.weight > 0.0F)
	//* 219  419:aload           31
	//* 220  421:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 221  424:fconst_0        
	//* 222  425:fcmpl           
	//* 223  426:ifle            439
							{
								i4 = 0;
	//  224  429:iconst_0        
	//  225  430:istore          15
								layoutparams.width = -2;
	//  226  432:aload           31
	//  227  434:bipush          -2
	//  228  436:putfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
							}
						}
						if(f == 0.0F)
	//* 229  439:fload_3         
	//* 230  440:fconst_0        
	//* 231  441:fcmpl           
	//* 232  442:ifne            454
							j5 = mTotalLength;
	//  233  445:aload_0         
	//  234  446:getfield        #328 <Field int mTotalLength>
	//  235  449:istore          16
						else
	//* 236  451:goto            457
							j5 = 0;
	//  237  454:iconst_0        
	//  238  455:istore          16
						measureChildBeforeLayout(view1, l1, i, j5, j, 0);
	//  239  457:aload_0         
	//  240  458:aload           30
	//  241  460:iload           11
	//  242  462:iload_1         
	//  243  463:iload           16
	//  244  465:iload_2         
	//  245  466:iconst_0        
	//  246  467:invokevirtual   #403 <Method void measureChildBeforeLayout(View, int, int, int, int, int)>
						if(i4 != 0x80000000)
	//* 247  470:iload           15
	//* 248  472:ldc2            #390 <Int 0x80000000>
	//* 249  475:icmpeq          485
							layoutparams.width = i4;
	//  250  478:aload           31
	//  251  480:iload           15
	//  252  482:putfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
						int i6 = view1.getMeasuredWidth();
	//  253  485:aload           30
	//  254  487:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  255  490:istore          18
						if(flag)
	//* 256  492:iload           17
	//* 257  494:ifeq            530
						{
							mTotalLength = mTotalLength + (layoutparams.leftMargin + i6 + layoutparams.rightMargin + getNextLocationOffset(view1));
	//  258  497:aload_0         
	//  259  498:aload_0         
	//  260  499:getfield        #328 <Field int mTotalLength>
	//  261  502:aload           31
	//  262  504:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  263  507:iload           18
	//  264  509:iadd            
	//  265  510:aload           31
	//  266  512:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  267  515:iadd            
	//  268  516:aload_0         
	//  269  517:aload           30
	//  270  519:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  271  522:iadd            
	//  272  523:iadd            
	//  273  524:putfield        #328 <Field int mTotalLength>
						} else
	//* 274  527:goto            569
						{
							i4 = mTotalLength;
	//  275  530:aload_0         
	//  276  531:getfield        #328 <Field int mTotalLength>
	//  277  534:istore          15
							mTotalLength = Math.max(i4, i4 + i6 + layoutparams.leftMargin + layoutparams.rightMargin + getNextLocationOffset(view1));
	//  278  536:aload_0         
	//  279  537:iload           15
	//  280  539:iload           15
	//  281  541:iload           18
	//  282  543:iadd            
	//  283  544:aload           31
	//  284  546:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  285  549:iadd            
	//  286  550:aload           31
	//  287  552:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  288  555:iadd            
	//  289  556:aload_0         
	//  290  557:aload           30
	//  291  559:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  292  562:iadd            
	//  293  563:invokestatic    #398 <Method int Math.max(int, int)>
	//  294  566:putfield        #328 <Field int mTotalLength>
						}
						i4 = k2;
	//  295  569:iload           13
	//  296  571:istore          15
						j5 = j2;
	//  297  573:iload           12
	//  298  575:istore          16
						if(flag2)
	//* 299  577:iload           27
	//* 300  579:ifeq            595
						{
							j5 = Math.max(i6, j2);
	//  301  582:iload           18
	//  302  584:iload           12
	//  303  586:invokestatic    #398 <Method int Math.max(int, int)>
	//  304  589:istore          16
							i4 = k2;
	//  305  591:iload           13
	//  306  593:istore          15
						}
					}
					int j6 = 0;
	//  307  595:iconst_0        
	//  308  596:istore          18
					j2 = j1;
	//  309  598:iload           9
	//  310  600:istore          12
					k2 = j6;
	//  311  602:iload           18
	//  312  604:istore          13
					if(i8 != 0x40000000)
	//* 313  606:iload           22
	//* 314  608:ldc1            #160 <Int 0x40000000>
	//* 315  610:icmpeq          636
					{
						j2 = j1;
	//  316  613:iload           9
	//  317  615:istore          12
						k2 = j6;
	//  318  617:iload           18
	//  319  619:istore          13
						if(layoutparams.height == -1)
	//* 320  621:aload           31
	//* 321  623:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 322  626:iconst_m1       
	//* 323  627:icmpne          636
						{
							j2 = 1;
	//  324  630:iconst_1        
	//  325  631:istore          12
							k2 = 1;
	//  326  633:iconst_1        
	//  327  634:istore          13
						}
					}
					j1 = layoutparams.topMargin + layoutparams.bottomMargin;
	//  328  636:aload           31
	//  329  638:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  330  641:aload           31
	//  331  643:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  332  646:iadd            
	//  333  647:istore          9
					j6 = view1.getMeasuredHeight() + j1;
	//  334  649:aload           30
	//  335  651:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  336  654:iload           9
	//  337  656:iadd            
	//  338  657:istore          18
					int l6 = ViewUtils.combineMeasuredStates(i1, view1.getMeasuredState());
	//  339  659:iload           8
	//  340  661:aload           30
	//  341  663:invokevirtual   #406 <Method int View.getMeasuredState()>
	//  342  666:invokestatic    #409 <Method int ViewUtils.combineMeasuredStates(int, int)>
	//  343  669:istore          19
					if(flag1)
	//* 344  671:iload           26
	//* 345  673:ifeq            760
					{
						int j7 = view1.getBaseline();
	//  346  676:aload           30
	//  347  678:invokevirtual   #322 <Method int View.getBaseline()>
	//  348  681:istore          20
						if(j7 != -1)
	//* 349  683:iload           20
	//* 350  685:iconst_m1       
	//* 351  686:icmpeq          760
						{
							if(layoutparams.gravity < 0)
	//* 352  689:aload           31
	//* 353  691:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//* 354  694:ifge            706
								i1 = mGravity;
	//  355  697:aload_0         
	//  356  698:getfield        #68  <Field int mGravity>
	//  357  701:istore          8
							else
	//* 358  703:goto            713
								i1 = layoutparams.gravity;
	//  359  706:aload           31
	//  360  708:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//  361  711:istore          8
							i1 = ((i1 & 0x70) >> 4 & -2) >> 1;
	//  362  713:iload           8
	//  363  715:bipush          112
	//  364  717:iand            
	//  365  718:iconst_4        
	//  366  719:ishr            
	//  367  720:bipush          -2
	//  368  722:iand            
	//  369  723:iconst_1        
	//  370  724:ishr            
	//  371  725:istore          8
							ai[i1] = Math.max(ai[i1], j7);
	//  372  727:aload           28
	//  373  729:iload           8
	//  374  731:aload           28
	//  375  733:iload           8
	//  376  735:iaload          
	//  377  736:iload           20
	//  378  738:invokestatic    #398 <Method int Math.max(int, int)>
	//  379  741:iastore         
							ai1[i1] = Math.max(ai1[i1], j6 - j7);
	//  380  742:aload           29
	//  381  744:iload           8
	//  382  746:aload           29
	//  383  748:iload           8
	//  384  750:iaload          
	//  385  751:iload           18
	//  386  753:iload           20
	//  387  755:isub            
	//  388  756:invokestatic    #398 <Method int Math.max(int, int)>
	//  389  759:iastore         
						}
					}
					l2 = Math.max(l2, j6);
	//  390  760:iload           14
	//  391  762:iload           18
	//  392  764:invokestatic    #398 <Method int Math.max(int, int)>
	//  393  767:istore          14
					if(l != 0 && layoutparams.height == -1)
	//* 394  769:iload           7
	//* 395  771:ifeq            789
	//* 396  774:aload           31
	//* 397  776:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 398  779:iconst_m1       
	//* 399  780:icmpne          789
						l = 1;
	//  400  783:iconst_1        
	//  401  784:istore          7
					else
	//* 402  786:goto            792
						l = 0;
	//  403  789:iconst_0        
	//  404  790:istore          7
					if(layoutparams.weight > 0.0F)
	//* 405  792:aload           31
	//* 406  794:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 407  797:fconst_0        
	//* 408  798:fcmpl           
	//* 409  799:ifle            826
					{
						if(k2 == 0)
	//* 410  802:iload           13
	//* 411  804:ifeq            810
	//* 412  807:goto            814
							j1 = j6;
	//  413  810:iload           18
	//  414  812:istore          9
						k1 = Math.max(k1, j1);
	//  415  814:iload           10
	//  416  816:iload           9
	//  417  818:invokestatic    #398 <Method int Math.max(int, int)>
	//  418  821:istore          10
					} else
	//* 419  823:goto            847
					{
						if(k2 == 0)
	//* 420  826:iload           13
	//* 421  828:ifeq            834
	//* 422  831:goto            838
							j1 = j6;
	//  423  834:iload           18
	//  424  836:istore          9
						k = Math.max(k, j1);
	//  425  838:iload           6
	//  426  840:iload           9
	//  427  842:invokestatic    #398 <Method int Math.max(int, int)>
	//  428  845:istore          6
					}
					l1 += getChildrenSkipCount(view1, l1);
	//  429  847:iload           11
	//  430  849:aload_0         
	//  431  850:aload           30
	//  432  852:iload           11
	//  433  854:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//  434  857:iadd            
	//  435  858:istore          11
					k2 = i4;
	//  436  860:iload           15
	//  437  862:istore          13
					j1 = j2;
	//  438  864:iload           12
	//  439  866:istore          9
					i1 = l6;
	//  440  868:iload           19
	//  441  870:istore          8
				}
				l1++;
	//  442  872:iload           11
	//  443  874:iconst_1        
	//  444  875:iadd            
	//  445  876:istore          11
				j2 = j5;
	//  446  878:iload           16
	//  447  880:istore          12
			}

	//* 448  882:goto            162
			if(mTotalLength > 0 && hasDividerBeforeChildAt(l7))
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
	//  460  907:getfield        #230 <Field int mDividerWidth>
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
				i2 = l2;
	//  478  938:iload           14
	//  479  940:istore          11
				if(ai[3] == -1)
					break label0;
	//  480  942:aload           28
	//  481  944:iconst_3        
	//  482  945:iaload          
	//  483  946:iconst_m1       
	//  484  947:icmpeq          1008
			}
			i2 = Math.max(l2, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
	//  485  950:iload           14
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
	//  498  968:invokestatic    #398 <Method int Math.max(int, int)>
	//  499  971:invokestatic    #398 <Method int Math.max(int, int)>
	//  500  974:invokestatic    #398 <Method int Math.max(int, int)>
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
	//  513  993:invokestatic    #398 <Method int Math.max(int, int)>
	//  514  996:invokestatic    #398 <Method int Math.max(int, int)>
	//  515  999:invokestatic    #398 <Method int Math.max(int, int)>
	//  516 1002:iadd            
	//  517 1003:invokestatic    #398 <Method int Math.max(int, int)>
	//  518 1006:istore          11
		}
		int k3;
		int k8;
label1:
		{
label2:
			{
label3:
				{
					if(flag2 && (j8 == 0x80000000 || j8 == 0))
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
						for(int i3 = 0; i3 < l7; i3++)
	//* 529 1031:iconst_0        
	//* 530 1032:istore          14
	//* 531 1034:iload           14
	//* 532 1036:iload           21
	//* 533 1038:icmpge          1194
						{
							View view2 = getVirtualChildAt(i3);
	//  534 1041:aload_0         
	//  535 1042:iload           14
	//  536 1044:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  537 1047:astore          30
							if(view2 == null)
	//* 538 1049:aload           30
	//* 539 1051:ifnonnull       1072
							{
								mTotalLength = mTotalLength + measureNullChild(i3);
	//  540 1054:aload_0         
	//  541 1055:aload_0         
	//  542 1056:getfield        #328 <Field int mTotalLength>
	//  543 1059:aload_0         
	//  544 1060:iload           14
	//  545 1062:invokevirtual   #371 <Method int measureNullChild(int)>
	//  546 1065:iadd            
	//  547 1066:putfield        #328 <Field int mTotalLength>
								continue;
	//  548 1069:goto            1185
							}
							if(view2.getVisibility() == 8)
	//* 549 1072:aload           30
	//* 550 1074:invokevirtual   #174 <Method int View.getVisibility()>
	//* 551 1077:bipush          8
	//* 552 1079:icmpne          1098
							{
								i3 += getChildrenSkipCount(view2, i3);
	//  553 1082:iload           14
	//  554 1084:aload_0         
	//  555 1085:aload           30
	//  556 1087:iload           14
	//  557 1089:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//  558 1092:iadd            
	//  559 1093:istore          14
								continue;
	//  560 1095:goto            1185
							}
							LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
	//  561 1098:aload           30
	//  562 1100:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  563 1103:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  564 1106:astore          31
							if(flag)
	//* 565 1108:iload           17
	//* 566 1110:ifeq            1146
							{
								mTotalLength = mTotalLength + (layoutparams1.leftMargin + j2 + layoutparams1.rightMargin + getNextLocationOffset(view2));
	//  567 1113:aload_0         
	//  568 1114:aload_0         
	//  569 1115:getfield        #328 <Field int mTotalLength>
	//  570 1118:aload           31
	//  571 1120:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  572 1123:iload           12
	//  573 1125:iadd            
	//  574 1126:aload           31
	//  575 1128:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  576 1131:iadd            
	//  577 1132:aload_0         
	//  578 1133:aload           30
	//  579 1135:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  580 1138:iadd            
	//  581 1139:iadd            
	//  582 1140:putfield        #328 <Field int mTotalLength>
							} else
	//* 583 1143:goto            1185
							{
								int j4 = mTotalLength;
	//  584 1146:aload_0         
	//  585 1147:getfield        #328 <Field int mTotalLength>
	//  586 1150:istore          15
								mTotalLength = Math.max(j4, j4 + j2 + layoutparams1.leftMargin + layoutparams1.rightMargin + getNextLocationOffset(view2));
	//  587 1152:aload_0         
	//  588 1153:iload           15
	//  589 1155:iload           15
	//  590 1157:iload           12
	//  591 1159:iadd            
	//  592 1160:aload           31
	//  593 1162:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  594 1165:iadd            
	//  595 1166:aload           31
	//  596 1168:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  597 1171:iadd            
	//  598 1172:aload_0         
	//  599 1173:aload           30
	//  600 1175:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  601 1178:iadd            
	//  602 1179:invokestatic    #398 <Method int Math.max(int, int)>
	//  603 1182:putfield        #328 <Field int mTotalLength>
							}
						}

	//  604 1185:iload           14
	//  605 1187:iconst_1        
	//  606 1188:iadd            
	//  607 1189:istore          14
					}
	//* 608 1191:goto            1034
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
					k8 = View.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumWidth()), i, 0);
	//  619 1212:aload_0         
	//  620 1213:getfield        #328 <Field int mTotalLength>
	//  621 1216:aload_0         
	//  622 1217:invokevirtual   #412 <Method int getSuggestedMinimumWidth()>
	//  623 1220:invokestatic    #398 <Method int Math.max(int, int)>
	//  624 1223:iload_1         
	//  625 1224:iconst_0        
	//  626 1225:invokestatic    #416 <Method int View.resolveSizeAndState(int, int, int)>
	//  627 1228:istore          24
					int k4 = (k8 & 0xffffff) - mTotalLength;
	//  628 1230:iload           24
	//  629 1232:ldc2            #417 <Int 0xffffff>
	//  630 1235:iand            
	//  631 1236:aload_0         
	//  632 1237:getfield        #328 <Field int mTotalLength>
	//  633 1240:isub            
	//  634 1241:istore          15
					if(k2 == 0 && (k4 == 0 || f <= 0.0F))
						break label2;
	//  635 1243:iload           13
	//  636 1245:ifne            1259
	//  637 1248:iload           15
	//  638 1250:ifeq            2108
	//  639 1253:fload_3         
	//  640 1254:fconst_0        
	//  641 1255:fcmpl           
	//  642 1256:ifle            2108
					if(mWeightSum > 0.0F)
	//* 643 1259:aload_0         
	//* 644 1260:getfield        #117 <Field float mWeightSum>
	//* 645 1263:fconst_0        
	//* 646 1264:fcmpl           
	//* 647 1265:ifle            1276
						f = mWeightSum;
	//  648 1268:aload_0         
	//  649 1269:getfield        #117 <Field float mWeightSum>
	//  650 1272:fstore_3        
	//* 651 1273:goto            1276
					ai[3] = -1;
	//  652 1276:aload           28
	//  653 1278:iconst_3        
	//  654 1279:iconst_m1       
	//  655 1280:iastore         
					ai[2] = -1;
	//  656 1281:aload           28
	//  657 1283:iconst_2        
	//  658 1284:iconst_m1       
	//  659 1285:iastore         
					ai[1] = -1;
	//  660 1286:aload           28
	//  661 1288:iconst_1        
	//  662 1289:iconst_m1       
	//  663 1290:iastore         
					ai[0] = -1;
	//  664 1291:aload           28
	//  665 1293:iconst_0        
	//  666 1294:iconst_m1       
	//  667 1295:iastore         
					ai1[3] = -1;
	//  668 1296:aload           29
	//  669 1298:iconst_3        
	//  670 1299:iconst_m1       
	//  671 1300:iastore         
					ai1[2] = -1;
	//  672 1301:aload           29
	//  673 1303:iconst_2        
	//  674 1304:iconst_m1       
	//  675 1305:iastore         
					ai1[1] = -1;
	//  676 1306:aload           29
	//  677 1308:iconst_1        
	//  678 1309:iconst_m1       
	//  679 1310:iastore         
					ai1[0] = -1;
	//  680 1311:aload           29
	//  681 1313:iconst_0        
	//  682 1314:iconst_m1       
	//  683 1315:iastore         
					j2 = -1;
	//  684 1316:iconst_m1       
	//  685 1317:istore          12
					mTotalLength = 0;
	//  686 1319:aload_0         
	//  687 1320:iconst_0        
	//  688 1321:putfield        #328 <Field int mTotalLength>
					int j3 = 0;
	//  689 1324:iconst_0        
	//  690 1325:istore          14
					k2 = k4;
	//  691 1327:iload           15
	//  692 1329:istore          13
					while(j3 < l7) 
	//* 693 1331:iload           14
	//* 694 1333:iload           21
	//* 695 1335:icmpge          1985
					{
						View view3 = getVirtualChildAt(j3);
	//  696 1338:aload_0         
	//  697 1339:iload           14
	//  698 1341:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  699 1344:astore          30
						int l4 = j2;
	//  700 1346:iload           12
	//  701 1348:istore          15
						int k5 = i1;
	//  702 1350:iload           8
	//  703 1352:istore          16
						int k6 = k;
	//  704 1354:iload           6
	//  705 1356:istore          18
						int i7 = l;
	//  706 1358:iload           7
	//  707 1360:istore          19
						int k7 = k2;
	//  708 1362:iload           13
	//  709 1364:istore          20
						float f2 = f;
	//  710 1366:fload_3         
	//  711 1367:fstore          5
						if(view3 != null)
	//* 712 1369:aload           30
	//* 713 1371:ifnull          1953
							if(view3.getVisibility() == 8)
	//* 714 1374:aload           30
	//* 715 1376:invokevirtual   #174 <Method int View.getVisibility()>
	//* 716 1379:bipush          8
	//* 717 1381:icmpne          1410
							{
								l4 = j2;
	//  718 1384:iload           12
	//  719 1386:istore          15
								k5 = i1;
	//  720 1388:iload           8
	//  721 1390:istore          16
								k6 = k;
	//  722 1392:iload           6
	//  723 1394:istore          18
								i7 = l;
	//  724 1396:iload           7
	//  725 1398:istore          19
								k7 = k2;
	//  726 1400:iload           13
	//  727 1402:istore          20
								f2 = f;
	//  728 1404:fload_3         
	//  729 1405:fstore          5
							} else
	//* 730 1407:goto            1953
							{
								LayoutParams layoutparams2 = (LayoutParams)view3.getLayoutParams();
	//  731 1410:aload           30
	//  732 1412:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  733 1415:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  734 1418:astore          31
								f2 = layoutparams2.weight;
	//  735 1420:aload           31
	//  736 1422:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  737 1425:fstore          5
								i2 = i1;
	//  738 1427:iload           8
	//  739 1429:istore          11
								k1 = k2;
	//  740 1431:iload           13
	//  741 1433:istore          10
								float f1 = f;
	//  742 1435:fload_3         
	//  743 1436:fstore          4
								if(f2 > 0.0F)
	//* 744 1438:fload           5
	//* 745 1440:fconst_0        
	//* 746 1441:fcmpl           
	//* 747 1442:ifle            1604
								{
									k1 = (int)(((float)k2 * f2) / f);
	//  748 1445:iload           13
	//  749 1447:i2f             
	//  750 1448:fload           5
	//  751 1450:fmul            
	//  752 1451:fload_3         
	//  753 1452:fdiv            
	//  754 1453:f2i             
	//  755 1454:istore          10
									f1 = f - f2;
	//  756 1456:fload_3         
	//  757 1457:fload           5
	//  758 1459:fsub            
	//  759 1460:fstore          4
									i2 = k2 - k1;
	//  760 1462:iload           13
	//  761 1464:iload           10
	//  762 1466:isub            
	//  763 1467:istore          11
									l4 = getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom() + layoutparams2.topMargin + layoutparams2.bottomMargin, layoutparams2.height);
	//  764 1469:iload_2         
	//  765 1470:aload_0         
	//  766 1471:invokevirtual   #280 <Method int getPaddingTop()>
	//  767 1474:aload_0         
	//  768 1475:invokevirtual   #261 <Method int getPaddingBottom()>
	//  769 1478:iadd            
	//  770 1479:aload           31
	//  771 1481:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  772 1484:iadd            
	//  773 1485:aload           31
	//  774 1487:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  775 1490:iadd            
	//  776 1491:aload           31
	//  777 1493:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//  778 1496:invokestatic    #420 <Method int getChildMeasureSpec(int, int, int)>
	//  779 1499:istore          15
									if(layoutparams2.width != 0 || j8 != 0x40000000)
	//* 780 1501:aload           31
	//* 781 1503:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 782 1506:ifne            1516
	//* 783 1509:iload           23
	//* 784 1511:ldc1            #160 <Int 0x40000000>
	//* 785 1513:icmpeq          1555
									{
										k2 = view3.getMeasuredWidth() + k1;
	//  786 1516:aload           30
	//  787 1518:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  788 1521:iload           10
	//  789 1523:iadd            
	//  790 1524:istore          13
										k1 = k2;
	//  791 1526:iload           13
	//  792 1528:istore          10
										if(k2 < 0)
	//* 793 1530:iload           13
	//* 794 1532:ifge            1538
											k1 = 0;
	//  795 1535:iconst_0        
	//  796 1536:istore          10
										view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000), l4);
	//  797 1538:aload           30
	//  798 1540:iload           10
	//  799 1542:ldc1            #160 <Int 0x40000000>
	//  800 1544:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  801 1547:iload           15
	//  802 1549:invokevirtual   #401 <Method void View.measure(int, int)>
									} else
	//* 803 1552:goto            1580
									{
										if(k1 <= 0)
	//* 804 1555:iload           10
	//* 805 1557:ifle            1563
	//* 806 1560:goto            1566
											k1 = 0;
	//  807 1563:iconst_0        
	//  808 1564:istore          10
										view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000), l4);
	//  809 1566:aload           30
	//  810 1568:iload           10
	//  811 1570:ldc1            #160 <Int 0x40000000>
	//  812 1572:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  813 1575:iload           15
	//  814 1577:invokevirtual   #401 <Method void View.measure(int, int)>
									}
									i1 = View.combineMeasuredStates(i1, view3.getMeasuredState() & 0xff000000);
	//  815 1580:iload           8
	//  816 1582:aload           30
	//  817 1584:invokevirtual   #406 <Method int View.getMeasuredState()>
	//  818 1587:ldc2            #421 <Int 0xff000000>
	//  819 1590:iand            
	//  820 1591:invokestatic    #422 <Method int View.combineMeasuredStates(int, int)>
	//  821 1594:istore          8
									k1 = i2;
	//  822 1596:iload           11
	//  823 1598:istore          10
									i2 = i1;
	//  824 1600:iload           8
	//  825 1602:istore          11
								}
								if(flag)
	//* 826 1604:iload           17
	//* 827 1606:ifeq            1645
								{
									mTotalLength = mTotalLength + (view3.getMeasuredWidth() + layoutparams2.leftMargin + layoutparams2.rightMargin + getNextLocationOffset(view3));
	//  828 1609:aload_0         
	//  829 1610:aload_0         
	//  830 1611:getfield        #328 <Field int mTotalLength>
	//  831 1614:aload           30
	//  832 1616:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  833 1619:aload           31
	//  834 1621:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  835 1624:iadd            
	//  836 1625:aload           31
	//  837 1627:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  838 1630:iadd            
	//  839 1631:aload_0         
	//  840 1632:aload           30
	//  841 1634:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  842 1637:iadd            
	//  843 1638:iadd            
	//  844 1639:putfield        #328 <Field int mTotalLength>
								} else
	//* 845 1642:goto            1687
								{
									i1 = mTotalLength;
	//  846 1645:aload_0         
	//  847 1646:getfield        #328 <Field int mTotalLength>
	//  848 1649:istore          8
									mTotalLength = Math.max(i1, view3.getMeasuredWidth() + i1 + layoutparams2.leftMargin + layoutparams2.rightMargin + getNextLocationOffset(view3));
	//  849 1651:aload_0         
	//  850 1652:iload           8
	//  851 1654:aload           30
	//  852 1656:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  853 1659:iload           8
	//  854 1661:iadd            
	//  855 1662:aload           31
	//  856 1664:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  857 1667:iadd            
	//  858 1668:aload           31
	//  859 1670:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  860 1673:iadd            
	//  861 1674:aload_0         
	//  862 1675:aload           30
	//  863 1677:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  864 1680:iadd            
	//  865 1681:invokestatic    #398 <Method int Math.max(int, int)>
	//  866 1684:putfield        #328 <Field int mTotalLength>
								}
								if(i8 != 0x40000000 && layoutparams2.height == -1)
	//* 867 1687:iload           22
	//* 868 1689:ldc1            #160 <Int 0x40000000>
	//* 869 1691:icmpeq          1709
	//* 870 1694:aload           31
	//* 871 1696:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 872 1699:iconst_m1       
	//* 873 1700:icmpne          1709
									i1 = 1;
	//  874 1703:iconst_1        
	//  875 1704:istore          8
								else
	//* 876 1706:goto            1712
									i1 = 0;
	//  877 1709:iconst_0        
	//  878 1710:istore          8
								l4 = layoutparams2.topMargin + layoutparams2.bottomMargin;
	//  879 1712:aload           31
	//  880 1714:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  881 1717:aload           31
	//  882 1719:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  883 1722:iadd            
	//  884 1723:istore          15
								k2 = view3.getMeasuredHeight() + l4;
	//  885 1725:aload           30
	//  886 1727:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  887 1730:iload           15
	//  888 1732:iadd            
	//  889 1733:istore          13
								j2 = Math.max(j2, k2);
	//  890 1735:iload           12
	//  891 1737:iload           13
	//  892 1739:invokestatic    #398 <Method int Math.max(int, int)>
	//  893 1742:istore          12
								if(i1 != 0)
	//* 894 1744:iload           8
	//* 895 1746:ifeq            1756
									i1 = l4;
	//  896 1749:iload           15
	//  897 1751:istore          8
								else
	//* 898 1753:goto            1760
									i1 = k2;
	//  899 1756:iload           13
	//  900 1758:istore          8
								i1 = Math.max(k, i1);
	//  901 1760:iload           6
	//  902 1762:iload           8
	//  903 1764:invokestatic    #398 <Method int Math.max(int, int)>
	//  904 1767:istore          8
								if(l != 0 && layoutparams2.height == -1)
	//* 905 1769:iload           7
	//* 906 1771:ifeq            1789
	//* 907 1774:aload           31
	//* 908 1776:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 909 1779:iconst_m1       
	//* 910 1780:icmpne          1789
									k = 1;
	//  911 1783:iconst_1        
	//  912 1784:istore          6
								else
	//* 913 1786:goto            1792
									k = 0;
	//  914 1789:iconst_0        
	//  915 1790:istore          6
								l4 = j2;
	//  916 1792:iload           12
	//  917 1794:istore          15
								k5 = i2;
	//  918 1796:iload           11
	//  919 1798:istore          16
								k6 = i1;
	//  920 1800:iload           8
	//  921 1802:istore          18
								i7 = k;
	//  922 1804:iload           6
	//  923 1806:istore          19
								k7 = k1;
	//  924 1808:iload           10
	//  925 1810:istore          20
								f2 = f1;
	//  926 1812:fload           4
	//  927 1814:fstore          5
								if(flag1)
	//* 928 1816:iload           26
	//* 929 1818:ifeq            1953
								{
									int l8 = view3.getBaseline();
	//  930 1821:aload           30
	//  931 1823:invokevirtual   #322 <Method int View.getBaseline()>
	//  932 1826:istore          25
									l4 = j2;
	//  933 1828:iload           12
	//  934 1830:istore          15
									k5 = i2;
	//  935 1832:iload           11
	//  936 1834:istore          16
									k6 = i1;
	//  937 1836:iload           8
	//  938 1838:istore          18
									i7 = k;
	//  939 1840:iload           6
	//  940 1842:istore          19
									k7 = k1;
	//  941 1844:iload           10
	//  942 1846:istore          20
									f2 = f1;
	//  943 1848:fload           4
	//  944 1850:fstore          5
									if(l8 != -1)
	//* 945 1852:iload           25
	//* 946 1854:iconst_m1       
	//* 947 1855:icmpeq          1953
									{
										if(layoutparams2.gravity < 0)
	//* 948 1858:aload           31
	//* 949 1860:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//* 950 1863:ifge            1875
											l = mGravity;
	//  951 1866:aload_0         
	//  952 1867:getfield        #68  <Field int mGravity>
	//  953 1870:istore          7
										else
	//* 954 1872:goto            1882
											l = layoutparams2.gravity;
	//  955 1875:aload           31
	//  956 1877:getfield        #374 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//  957 1880:istore          7
										l = ((l & 0x70) >> 4 & -2) >> 1;
	//  958 1882:iload           7
	//  959 1884:bipush          112
	//  960 1886:iand            
	//  961 1887:iconst_4        
	//  962 1888:ishr            
	//  963 1889:bipush          -2
	//  964 1891:iand            
	//  965 1892:iconst_1        
	//  966 1893:ishr            
	//  967 1894:istore          7
										ai[l] = Math.max(ai[l], l8);
	//  968 1896:aload           28
	//  969 1898:iload           7
	//  970 1900:aload           28
	//  971 1902:iload           7
	//  972 1904:iaload          
	//  973 1905:iload           25
	//  974 1907:invokestatic    #398 <Method int Math.max(int, int)>
	//  975 1910:iastore         
										ai1[l] = Math.max(ai1[l], k2 - l8);
	//  976 1911:aload           29
	//  977 1913:iload           7
	//  978 1915:aload           29
	//  979 1917:iload           7
	//  980 1919:iaload          
	//  981 1920:iload           13
	//  982 1922:iload           25
	//  983 1924:isub            
	//  984 1925:invokestatic    #398 <Method int Math.max(int, int)>
	//  985 1928:iastore         
										f2 = f1;
	//  986 1929:fload           4
	//  987 1931:fstore          5
										k7 = k1;
	//  988 1933:iload           10
	//  989 1935:istore          20
										i7 = k;
	//  990 1937:iload           6
	//  991 1939:istore          19
										k6 = i1;
	//  992 1941:iload           8
	//  993 1943:istore          18
										k5 = i2;
	//  994 1945:iload           11
	//  995 1947:istore          16
										l4 = j2;
	//  996 1949:iload           12
	//  997 1951:istore          15
									}
								}
							}
						j3++;
	//  998 1953:iload           14
	//  999 1955:iconst_1        
	// 1000 1956:iadd            
	// 1001 1957:istore          14
						j2 = l4;
	// 1002 1959:iload           15
	// 1003 1961:istore          12
						i1 = k5;
	// 1004 1963:iload           16
	// 1005 1965:istore          8
						k = k6;
	// 1006 1967:iload           18
	// 1007 1969:istore          6
						l = i7;
	// 1008 1971:iload           19
	// 1009 1973:istore          7
						k2 = k7;
	// 1010 1975:iload           20
	// 1011 1977:istore          13
						f = f2;
	// 1012 1979:fload           5
	// 1013 1981:fstore_3        
					}
	//*1014 1982:goto            1331
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
	//*1029 2008:icmpne          2039
	//*1030 2011:aload           28
	//*1031 2013:iconst_0        
	//*1032 2014:iaload          
	//*1033 2015:iconst_m1       
	//*1034 2016:icmpne          2039
	//*1035 2019:aload           28
	//*1036 2021:iconst_2        
	//*1037 2022:iaload          
	//*1038 2023:iconst_m1       
	//*1039 2024:icmpne          2039
					{
						k1 = j2;
	// 1040 2027:iload           12
	// 1041 2029:istore          10
						if(ai[3] == -1)
							break label3;
	// 1042 2031:aload           28
	// 1043 2033:iconst_3        
	// 1044 2034:iaload          
	// 1045 2035:iconst_m1       
	// 1046 2036:icmpeq          2097
					}
					k1 = Math.max(j2, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
	// 1047 2039:iload           12
	// 1048 2041:aload           28
	// 1049 2043:iconst_3        
	// 1050 2044:iaload          
	// 1051 2045:aload           28
	// 1052 2047:iconst_0        
	// 1053 2048:iaload          
	// 1054 2049:aload           28
	// 1055 2051:iconst_1        
	// 1056 2052:iaload          
	// 1057 2053:aload           28
	// 1058 2055:iconst_2        
	// 1059 2056:iaload          
	// 1060 2057:invokestatic    #398 <Method int Math.max(int, int)>
	// 1061 2060:invokestatic    #398 <Method int Math.max(int, int)>
	// 1062 2063:invokestatic    #398 <Method int Math.max(int, int)>
	// 1063 2066:aload           29
	// 1064 2068:iconst_3        
	// 1065 2069:iaload          
	// 1066 2070:aload           29
	// 1067 2072:iconst_0        
	// 1068 2073:iaload          
	// 1069 2074:aload           29
	// 1070 2076:iconst_1        
	// 1071 2077:iaload          
	// 1072 2078:aload           29
	// 1073 2080:iconst_2        
	// 1074 2081:iaload          
	// 1075 2082:invokestatic    #398 <Method int Math.max(int, int)>
	// 1076 2085:invokestatic    #398 <Method int Math.max(int, int)>
	// 1077 2088:invokestatic    #398 <Method int Math.max(int, int)>
	// 1078 2091:iadd            
	// 1079 2092:invokestatic    #398 <Method int Math.max(int, int)>
	// 1080 2095:istore          10
				}
				k2 = i1;
	// 1081 2097:iload           8
	// 1082 2099:istore          13
				k3 = l;
	// 1083 2101:iload           7
	// 1084 2103:istore          14
				break label1;
	// 1085 2105:goto            2260
			}
			int l5 = Math.max(k, k1);
	// 1086 2108:iload           6
	// 1087 2110:iload           10
	// 1088 2112:invokestatic    #398 <Method int Math.max(int, int)>
	// 1089 2115:istore          16
			k1 = i2;
	// 1090 2117:iload           11
	// 1091 2119:istore          10
			k2 = i1;
	// 1092 2121:iload           8
	// 1093 2123:istore          13
			k = l5;
	// 1094 2125:iload           16
	// 1095 2127:istore          6
			k3 = l;
	// 1096 2129:iload           7
	// 1097 2131:istore          14
			if(flag2)
	//*1098 2133:iload           27
	//*1099 2135:ifeq            2260
			{
				k1 = i2;
	// 1100 2138:iload           11
	// 1101 2140:istore          10
				k2 = i1;
	// 1102 2142:iload           8
	// 1103 2144:istore          13
				k = l5;
	// 1104 2146:iload           16
	// 1105 2148:istore          6
				k3 = l;
	// 1106 2150:iload           7
	// 1107 2152:istore          14
				if(j8 != 0x40000000)
	//*1108 2154:iload           23
	//*1109 2156:ldc1            #160 <Int 0x40000000>
	//*1110 2158:icmpeq          2260
				{
					int i5 = 0;
	// 1111 2161:iconst_0        
	// 1112 2162:istore          15
					do
					{
						k1 = i2;
	// 1113 2164:iload           11
	// 1114 2166:istore          10
						k2 = i1;
	// 1115 2168:iload           8
	// 1116 2170:istore          13
						k = l5;
	// 1117 2172:iload           16
	// 1118 2174:istore          6
						k3 = l;
	// 1119 2176:iload           7
	// 1120 2178:istore          14
						if(i5 >= l7)
							break;
	// 1121 2180:iload           15
	// 1122 2182:iload           21
	// 1123 2184:icmpge          2260
						View view = getVirtualChildAt(i5);
	// 1124 2187:aload_0         
	// 1125 2188:iload           15
	// 1126 2190:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	// 1127 2193:astore          28
						if(view != null && view.getVisibility() != 8 && ((LayoutParams)view.getLayoutParams()).weight > 0.0F)
	//*1128 2195:aload           28
	//*1129 2197:ifnull          2251
	//*1130 2200:aload           28
	//*1131 2202:invokevirtual   #174 <Method int View.getVisibility()>
	//*1132 2205:bipush          8
	//*1133 2207:icmpne          2213
	//*1134 2210:goto            2251
	//*1135 2213:aload           28
	//*1136 2215:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*1137 2218:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//*1138 2221:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//*1139 2224:fconst_0        
	//*1140 2225:fcmpl           
	//*1141 2226:ifle            2251
							view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000));
	// 1142 2229:aload           28
	// 1143 2231:iload           12
	// 1144 2233:ldc1            #160 <Int 0x40000000>
	// 1145 2235:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	// 1146 2238:aload           28
	// 1147 2240:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	// 1148 2243:ldc1            #160 <Int 0x40000000>
	// 1149 2245:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	// 1150 2248:invokevirtual   #401 <Method void View.measure(int, int)>
						i5++;
	// 1151 2251:iload           15
	// 1152 2253:iconst_1        
	// 1153 2254:iadd            
	// 1154 2255:istore          15
					} while(true);
	// 1155 2257:goto            2164
				}
			}
		}
		l = k1;
	// 1156 2260:iload           10
	// 1157 2262:istore          7
		if(k3 == 0)
	//*1158 2264:iload           14
	//*1159 2266:ifne            2284
		{
			l = k1;
	// 1160 2269:iload           10
	// 1161 2271:istore          7
			if(i8 != 0x40000000)
	//*1162 2273:iload           22
	//*1163 2275:ldc1            #160 <Int 0x40000000>
	//*1164 2277:icmpeq          2284
				l = k;
	// 1165 2280:iload           6
	// 1166 2282:istore          7
		}
		setMeasuredDimension(0xff000000 & k2 | k8, View.resolveSizeAndState(Math.max(l + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), j, k2 << 16));
	// 1167 2284:aload_0         
	// 1168 2285:ldc2            #421 <Int 0xff000000>
	// 1169 2288:iload           13
	// 1170 2290:iand            
	// 1171 2291:iload           24
	// 1172 2293:ior             
	// 1173 2294:iload           7
	// 1174 2296:aload_0         
	// 1175 2297:invokevirtual   #280 <Method int getPaddingTop()>
	// 1176 2300:aload_0         
	// 1177 2301:invokevirtual   #261 <Method int getPaddingBottom()>
	// 1178 2304:iadd            
	// 1179 2305:iadd            
	// 1180 2306:aload_0         
	// 1181 2307:invokevirtual   #425 <Method int getSuggestedMinimumHeight()>
	// 1182 2310:invokestatic    #398 <Method int Math.max(int, int)>
	// 1183 2313:iload_2         
	// 1184 2314:iload           13
	// 1185 2316:bipush          16
	// 1186 2318:ishl            
	// 1187 2319:invokestatic    #416 <Method int View.resolveSizeAndState(int, int, int)>
	// 1188 2322:invokevirtual   #428 <Method void setMeasuredDimension(int, int)>
		if(j1 != 0)
	//*1189 2325:iload           9
	//*1190 2327:ifeq            2337
			forceUniformHeight(l7, i);
	// 1191 2330:aload_0         
	// 1192 2331:iload           21
	// 1193 2333:iload_1         
	// 1194 2334:invokespecial   #430 <Method void forceUniformHeight(int, int)>
	// 1195 2337:return          
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
	//    2    2:putfield        #328 <Field int mTotalLength>
		int j1 = 0;
	//    3    5:iconst_0        
	//    4    6:istore          9
		int i1 = 0;
	//    5    8:iconst_0        
	//    6    9:istore          8
		int k = 0;
	//    7   11:iconst_0        
	//    8   12:istore          6
		int l1 = 0;
	//    9   14:iconst_0        
	//   10   15:istore          11
		int l = 1;
	//   11   17:iconst_1        
	//   12   18:istore          7
		float f = 0.0F;
	//   13   20:fconst_0        
	//   14   21:fstore_3        
		int l5 = getVirtualChildCount();
	//   15   22:aload_0         
	//   16   23:invokevirtual   #206 <Method int getVirtualChildCount()>
	//   17   26:istore          18
		int i6 = android.view.View.MeasureSpec.getMode(i);
	//   18   28:iload_1         
	//   19   29:invokestatic    #389 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   20   32:istore          19
		int j6 = android.view.View.MeasureSpec.getMode(j);
	//   21   34:iload_2         
	//   22   35:invokestatic    #389 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   23   38:istore          20
		int k1 = 0;
	//   24   40:iconst_0        
	//   25   41:istore          10
		int i3 = 0;
	//   26   43:iconst_0        
	//   27   44:istore          14
		int k6 = mBaselineAlignedChildIndex;
	//   28   46:aload_0         
	//   29   47:getfield        #63  <Field int mBaselineAlignedChildIndex>
	//   30   50:istore          21
		boolean flag = mUseLargestChild;
	//   31   52:aload_0         
	//   32   53:getfield        #125 <Field boolean mUseLargestChild>
	//   33   56:istore          22
		int l2 = 0x80000000;
	//   34   58:ldc2            #390 <Int 0x80000000>
	//   35   61:istore          13
		for(int i2 = 0; i2 < l5;)
	//*  36   63:iconst_0        
	//*  37   64:istore          12
	//*  38   66:iload           12
	//*  39   68:iload           18
	//*  40   70:icmpge          648
		{
			View view = getVirtualChildAt(i2);
	//   41   73:aload_0         
	//   42   74:iload           12
	//   43   76:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//   44   79:astore          23
			int k4;
			if(view == null)
	//*  45   81:aload           23
	//*  46   83:ifnonnull       108
			{
				mTotalLength = mTotalLength + measureNullChild(i2);
	//   47   86:aload_0         
	//   48   87:aload_0         
	//   49   88:getfield        #328 <Field int mTotalLength>
	//   50   91:aload_0         
	//   51   92:iload           12
	//   52   94:invokevirtual   #371 <Method int measureNullChild(int)>
	//   53   97:iadd            
	//   54   98:putfield        #328 <Field int mTotalLength>
				k4 = l2;
	//   55  101:iload           13
	//   56  103:istore          16
			} else
	//*  57  105:goto            635
			if(view.getVisibility() == 8)
	//*  58  108:aload           23
	//*  59  110:invokevirtual   #174 <Method int View.getVisibility()>
	//*  60  113:bipush          8
	//*  61  115:icmpne          138
			{
				i2 += getChildrenSkipCount(view, i2);
	//   62  118:iload           12
	//   63  120:aload_0         
	//   64  121:aload           23
	//   65  123:iload           12
	//   66  125:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//   67  128:iadd            
	//   68  129:istore          12
				k4 = l2;
	//   69  131:iload           13
	//   70  133:istore          16
			} else
	//*  71  135:goto            635
			{
				if(hasDividerBeforeChildAt(i2))
	//*  72  138:aload_0         
	//*  73  139:iload           12
	//*  74  141:invokevirtual   #216 <Method boolean hasDividerBeforeChildAt(int)>
	//*  75  144:ifeq            160
					mTotalLength = mTotalLength + mDividerHeight;
	//   76  147:aload_0         
	//   77  148:aload_0         
	//   78  149:getfield        #328 <Field int mTotalLength>
	//   79  152:aload_0         
	//   80  153:getfield        #252 <Field int mDividerHeight>
	//   81  156:iadd            
	//   82  157:putfield        #328 <Field int mTotalLength>
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   83  160:aload           23
	//   84  162:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   85  165:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   86  168:astore          24
				f += layoutparams.weight;
	//   87  170:fload_3         
	//   88  171:aload           24
	//   89  173:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//   90  176:fadd            
	//   91  177:fstore_3        
				int j3;
				if(j6 == 0x40000000 && layoutparams.height == 0 && layoutparams.weight > 0.0F)
	//*  92  178:iload           20
	//*  93  180:ldc1            #160 <Int 0x40000000>
	//*  94  182:icmpne          242
	//*  95  185:aload           24
	//*  96  187:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//*  97  190:ifne            242
	//*  98  193:aload           24
	//*  99  195:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 100  198:fconst_0        
	//* 101  199:fcmpl           
	//* 102  200:ifle            242
				{
					i3 = mTotalLength;
	//  103  203:aload_0         
	//  104  204:getfield        #328 <Field int mTotalLength>
	//  105  207:istore          14
					mTotalLength = Math.max(i3, layoutparams.topMargin + i3 + layoutparams.bottomMargin);
	//  106  209:aload_0         
	//  107  210:iload           14
	//  108  212:aload           24
	//  109  214:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  110  217:iload           14
	//  111  219:iadd            
	//  112  220:aload           24
	//  113  222:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  114  225:iadd            
	//  115  226:invokestatic    #398 <Method int Math.max(int, int)>
	//  116  229:putfield        #328 <Field int mTotalLength>
					j3 = 1;
	//  117  232:iconst_1        
	//  118  233:istore          15
					k4 = l2;
	//  119  235:iload           13
	//  120  237:istore          16
				} else
	//* 121  239:goto            401
				{
					k4 = 0x80000000;
	//  122  242:ldc2            #390 <Int 0x80000000>
	//  123  245:istore          16
					j3 = k4;
	//  124  247:iload           16
	//  125  249:istore          15
					if(layoutparams.height == 0)
	//* 126  251:aload           24
	//* 127  253:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 128  256:ifne            283
					{
						j3 = k4;
	//  129  259:iload           16
	//  130  261:istore          15
						if(layoutparams.weight > 0.0F)
	//* 131  263:aload           24
	//* 132  265:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 133  268:fconst_0        
	//* 134  269:fcmpl           
	//* 135  270:ifle            283
						{
							j3 = 0;
	//  136  273:iconst_0        
	//  137  274:istore          15
							layoutparams.height = -2;
	//  138  276:aload           24
	//  139  278:bipush          -2
	//  140  280:putfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
						}
					}
					if(f == 0.0F)
	//* 141  283:fload_3         
	//* 142  284:fconst_0        
	//* 143  285:fcmpl           
	//* 144  286:ifne            298
						k4 = mTotalLength;
	//  145  289:aload_0         
	//  146  290:getfield        #328 <Field int mTotalLength>
	//  147  293:istore          16
					else
	//* 148  295:goto            301
						k4 = 0;
	//  149  298:iconst_0        
	//  150  299:istore          16
					measureChildBeforeLayout(view, i2, i, 0, j, k4);
	//  151  301:aload_0         
	//  152  302:aload           23
	//  153  304:iload           12
	//  154  306:iload_1         
	//  155  307:iconst_0        
	//  156  308:iload_2         
	//  157  309:iload           16
	//  158  311:invokevirtual   #403 <Method void measureChildBeforeLayout(View, int, int, int, int, int)>
					if(j3 != 0x80000000)
	//* 159  314:iload           15
	//* 160  316:ldc2            #390 <Int 0x80000000>
	//* 161  319:icmpeq          329
						layoutparams.height = j3;
	//  162  322:aload           24
	//  163  324:iload           15
	//  164  326:putfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
					int i5 = view.getMeasuredHeight();
	//  165  329:aload           23
	//  166  331:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  167  334:istore          17
					j3 = mTotalLength;
	//  168  336:aload_0         
	//  169  337:getfield        #328 <Field int mTotalLength>
	//  170  340:istore          15
					mTotalLength = Math.max(j3, j3 + i5 + layoutparams.topMargin + layoutparams.bottomMargin + getNextLocationOffset(view));
	//  171  342:aload_0         
	//  172  343:iload           15
	//  173  345:iload           15
	//  174  347:iload           17
	//  175  349:iadd            
	//  176  350:aload           24
	//  177  352:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  178  355:iadd            
	//  179  356:aload           24
	//  180  358:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  181  361:iadd            
	//  182  362:aload_0         
	//  183  363:aload           23
	//  184  365:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  185  368:iadd            
	//  186  369:invokestatic    #398 <Method int Math.max(int, int)>
	//  187  372:putfield        #328 <Field int mTotalLength>
					j3 = i3;
	//  188  375:iload           14
	//  189  377:istore          15
					k4 = l2;
	//  190  379:iload           13
	//  191  381:istore          16
					if(flag)
	//* 192  383:iload           22
	//* 193  385:ifeq            401
					{
						k4 = Math.max(i5, l2);
	//  194  388:iload           17
	//  195  390:iload           13
	//  196  392:invokestatic    #398 <Method int Math.max(int, int)>
	//  197  395:istore          16
						j3 = i3;
	//  198  397:iload           14
	//  199  399:istore          15
					}
				}
				if(k6 >= 0 && k6 == i2 + 1)
	//* 200  401:iload           21
	//* 201  403:iflt            423
	//* 202  406:iload           21
	//* 203  408:iload           12
	//* 204  410:iconst_1        
	//* 205  411:iadd            
	//* 206  412:icmpne          423
					mBaselineChildTop = mTotalLength;
	//  207  415:aload_0         
	//  208  416:aload_0         
	//  209  417:getfield        #328 <Field int mTotalLength>
	//  210  420:putfield        #65  <Field int mBaselineChildTop>
				if(i2 < k6 && layoutparams.weight > 0.0F)
	//* 211  423:iload           12
	//* 212  425:iload           21
	//* 213  427:icmpge          451
	//* 214  430:aload           24
	//* 215  432:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 216  435:fconst_0        
	//* 217  436:fcmpl           
	//* 218  437:ifle            451
					throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
	//  219  440:new             #313 <Class RuntimeException>
	//  220  443:dup             
	//  221  444:ldc2            #433 <String "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.">
	//  222  447:invokespecial   #318 <Method void RuntimeException(String)>
	//  223  450:athrow          
				int j5 = 0;
	//  224  451:iconst_0        
	//  225  452:istore          17
				l2 = k1;
	//  226  454:iload           10
	//  227  456:istore          13
				i3 = j5;
	//  228  458:iload           17
	//  229  460:istore          14
				if(i6 != 0x40000000)
	//* 230  462:iload           19
	//* 231  464:ldc1            #160 <Int 0x40000000>
	//* 232  466:icmpeq          492
				{
					l2 = k1;
	//  233  469:iload           10
	//  234  471:istore          13
					i3 = j5;
	//  235  473:iload           17
	//  236  475:istore          14
					if(layoutparams.width == -1)
	//* 237  477:aload           24
	//* 238  479:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 239  482:iconst_m1       
	//* 240  483:icmpne          492
					{
						l2 = 1;
	//  241  486:iconst_1        
	//  242  487:istore          13
						i3 = 1;
	//  243  489:iconst_1        
	//  244  490:istore          14
					}
				}
				k1 = layoutparams.leftMargin + layoutparams.rightMargin;
	//  245  492:aload           24
	//  246  494:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  247  497:aload           24
	//  248  499:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  249  502:iadd            
	//  250  503:istore          10
				j5 = view.getMeasuredWidth() + k1;
	//  251  505:aload           23
	//  252  507:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  253  510:iload           10
	//  254  512:iadd            
	//  255  513:istore          17
				j1 = Math.max(j1, j5);
	//  256  515:iload           9
	//  257  517:iload           17
	//  258  519:invokestatic    #398 <Method int Math.max(int, int)>
	//  259  522:istore          9
				i1 = View.combineMeasuredStates(i1, view.getMeasuredState());
	//  260  524:iload           8
	//  261  526:aload           23
	//  262  528:invokevirtual   #406 <Method int View.getMeasuredState()>
	//  263  531:invokestatic    #422 <Method int View.combineMeasuredStates(int, int)>
	//  264  534:istore          8
				if(l != 0 && layoutparams.width == -1)
	//* 265  536:iload           7
	//* 266  538:ifeq            556
	//* 267  541:aload           24
	//* 268  543:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 269  546:iconst_m1       
	//* 270  547:icmpne          556
					l = 1;
	//  271  550:iconst_1        
	//  272  551:istore          7
				else
	//* 273  553:goto            559
					l = 0;
	//  274  556:iconst_0        
	//  275  557:istore          7
				if(layoutparams.weight > 0.0F)
	//* 276  559:aload           24
	//* 277  561:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 278  564:fconst_0        
	//* 279  565:fcmpl           
	//* 280  566:ifle            593
				{
					if(i3 == 0)
	//* 281  569:iload           14
	//* 282  571:ifeq            577
	//* 283  574:goto            581
						k1 = j5;
	//  284  577:iload           17
	//  285  579:istore          10
					l1 = Math.max(l1, k1);
	//  286  581:iload           11
	//  287  583:iload           10
	//  288  585:invokestatic    #398 <Method int Math.max(int, int)>
	//  289  588:istore          11
				} else
	//* 290  590:goto            614
				{
					if(i3 == 0)
	//* 291  593:iload           14
	//* 292  595:ifeq            601
	//* 293  598:goto            605
						k1 = j5;
	//  294  601:iload           17
	//  295  603:istore          10
					k = Math.max(k, k1);
	//  296  605:iload           6
	//  297  607:iload           10
	//  298  609:invokestatic    #398 <Method int Math.max(int, int)>
	//  299  612:istore          6
				}
				i2 += getChildrenSkipCount(view, i2);
	//  300  614:iload           12
	//  301  616:aload_0         
	//  302  617:aload           23
	//  303  619:iload           12
	//  304  621:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//  305  624:iadd            
	//  306  625:istore          12
				i3 = j3;
	//  307  627:iload           15
	//  308  629:istore          14
				k1 = l2;
	//  309  631:iload           13
	//  310  633:istore          10
			}
			i2++;
	//  311  635:iload           12
	//  312  637:iconst_1        
	//  313  638:iadd            
	//  314  639:istore          12
			l2 = k4;
	//  315  641:iload           16
	//  316  643:istore          13
		}

	//* 317  645:goto            66
		if(mTotalLength > 0 && hasDividerBeforeChildAt(l5))
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
		if(flag && (j6 == 0x80000000 || j6 == 0))
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
			for(int j2 = 0; j2 < l5; j2++)
	//* 342  700:iconst_0        
	//* 343  701:istore          12
	//* 344  703:iload           12
	//* 345  705:iload           18
	//* 346  707:icmpge          825
			{
				View view1 = getVirtualChildAt(j2);
	//  347  710:aload_0         
	//  348  711:iload           12
	//  349  713:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  350  716:astore          23
				if(view1 == null)
	//* 351  718:aload           23
	//* 352  720:ifnonnull       741
				{
					mTotalLength = mTotalLength + measureNullChild(j2);
	//  353  723:aload_0         
	//  354  724:aload_0         
	//  355  725:getfield        #328 <Field int mTotalLength>
	//  356  728:aload_0         
	//  357  729:iload           12
	//  358  731:invokevirtual   #371 <Method int measureNullChild(int)>
	//  359  734:iadd            
	//  360  735:putfield        #328 <Field int mTotalLength>
					continue;
	//  361  738:goto            816
				}
				if(view1.getVisibility() == 8)
	//* 362  741:aload           23
	//* 363  743:invokevirtual   #174 <Method int View.getVisibility()>
	//* 364  746:bipush          8
	//* 365  748:icmpne          767
				{
					j2 += getChildrenSkipCount(view1, j2);
	//  366  751:iload           12
	//  367  753:aload_0         
	//  368  754:aload           23
	//  369  756:iload           12
	//  370  758:invokevirtual   #382 <Method int getChildrenSkipCount(View, int)>
	//  371  761:iadd            
	//  372  762:istore          12
				} else
	//* 373  764:goto            816
				{
					LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  374  767:aload           23
	//  375  769:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  376  772:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  377  775:astore          24
					int k3 = mTotalLength;
	//  378  777:aload_0         
	//  379  778:getfield        #328 <Field int mTotalLength>
	//  380  781:istore          15
					mTotalLength = Math.max(k3, k3 + l2 + layoutparams1.topMargin + layoutparams1.bottomMargin + getNextLocationOffset(view1));
	//  381  783:aload_0         
	//  382  784:iload           15
	//  383  786:iload           15
	//  384  788:iload           13
	//  385  790:iadd            
	//  386  791:aload           24
	//  387  793:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  388  796:iadd            
	//  389  797:aload           24
	//  390  799:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  391  802:iadd            
	//  392  803:aload_0         
	//  393  804:aload           23
	//  394  806:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  395  809:iadd            
	//  396  810:invokestatic    #398 <Method int Math.max(int, int)>
	//  397  813:putfield        #328 <Field int mTotalLength>
				}
			}

	//  398  816:iload           12
	//  399  818:iconst_1        
	//  400  819:iadd            
	//  401  820:istore          12
		}
	//* 402  822:goto            703
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
		int k5 = View.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumHeight()), j, 0);
	//  413  843:aload_0         
	//  414  844:getfield        #328 <Field int mTotalLength>
	//  415  847:aload_0         
	//  416  848:invokevirtual   #425 <Method int getSuggestedMinimumHeight()>
	//  417  851:invokestatic    #398 <Method int Math.max(int, int)>
	//  418  854:iload_2         
	//  419  855:iconst_0        
	//  420  856:invokestatic    #416 <Method int View.resolveSizeAndState(int, int, int)>
	//  421  859:istore          17
		int k2 = (k5 & 0xffffff) - mTotalLength;
	//  422  861:iload           17
	//  423  863:ldc2            #417 <Int 0xffffff>
	//  424  866:iand            
	//  425  867:aload_0         
	//  426  868:getfield        #328 <Field int mTotalLength>
	//  427  871:isub            
	//  428  872:istore          12
		if(i3 != 0 || k2 != 0 && f > 0.0F)
	//* 429  874:iload           14
	//* 430  876:ifne            890
	//* 431  879:iload           12
	//* 432  881:ifeq            1345
	//* 433  884:fload_3         
	//* 434  885:fconst_0        
	//* 435  886:fcmpl           
	//* 436  887:ifle            1345
		{
			if(mWeightSum > 0.0F)
	//* 437  890:aload_0         
	//* 438  891:getfield        #117 <Field float mWeightSum>
	//* 439  894:fconst_0        
	//* 440  895:fcmpl           
	//* 441  896:ifle            907
				f = mWeightSum;
	//  442  899:aload_0         
	//  443  900:getfield        #117 <Field float mWeightSum>
	//  444  903:fstore_3        
	//* 445  904:goto            907
			mTotalLength = 0;
	//  446  907:aload_0         
	//  447  908:iconst_0        
	//  448  909:putfield        #328 <Field int mTotalLength>
			i3 = 0;
	//  449  912:iconst_0        
	//  450  913:istore          14
			for(l2 = k2; i3 < l5; l2 = k2)
	//* 451  915:iload           12
	//* 452  917:istore          13
	//* 453  919:iload           14
	//* 454  921:iload           18
	//* 455  923:icmpge          1312
			{
				View view2 = getVirtualChildAt(i3);
	//  456  926:aload_0         
	//  457  927:iload           14
	//  458  929:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  459  932:astore          23
				if(view2.getVisibility() == 8)
	//* 460  934:aload           23
	//* 461  936:invokevirtual   #174 <Method int View.getVisibility()>
	//* 462  939:bipush          8
	//* 463  941:icmpne          951
				{
					k2 = l2;
	//  464  944:iload           13
	//  465  946:istore          12
				} else
	//* 466  948:goto            1299
				{
					LayoutParams layoutparams2 = (LayoutParams)view2.getLayoutParams();
	//  467  951:aload           23
	//  468  953:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  469  956:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  470  959:astore          24
					float f2 = layoutparams2.weight;
	//  471  961:aload           24
	//  472  963:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  473  966:fstore          5
					l1 = i1;
	//  474  968:iload           8
	//  475  970:istore          11
					k2 = l2;
	//  476  972:iload           13
	//  477  974:istore          12
					float f1 = f;
	//  478  976:fload_3         
	//  479  977:fstore          4
					if(f2 > 0.0F)
	//* 480  979:fload           5
	//* 481  981:fconst_0        
	//* 482  982:fcmpl           
	//* 483  983:ifle            1137
					{
						l1 = (int)(((float)l2 * f2) / f);
	//  484  986:iload           13
	//  485  988:i2f             
	//  486  989:fload           5
	//  487  991:fmul            
	//  488  992:fload_3         
	//  489  993:fdiv            
	//  490  994:f2i             
	//  491  995:istore          11
						f1 = f - f2;
	//  492  997:fload_3         
	//  493  998:fload           5
	//  494 1000:fsub            
	//  495 1001:fstore          4
						k2 = l2 - l1;
	//  496 1003:iload           13
	//  497 1005:iload           11
	//  498 1007:isub            
	//  499 1008:istore          12
						int l3 = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutparams2.leftMargin + layoutparams2.rightMargin, layoutparams2.width);
	//  500 1010:iload_1         
	//  501 1011:aload_0         
	//  502 1012:invokevirtual   #237 <Method int getPaddingLeft()>
	//  503 1015:aload_0         
	//  504 1016:invokevirtual   #243 <Method int getPaddingRight()>
	//  505 1019:iadd            
	//  506 1020:aload           24
	//  507 1022:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  508 1025:iadd            
	//  509 1026:aload           24
	//  510 1028:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  511 1031:iadd            
	//  512 1032:aload           24
	//  513 1034:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//  514 1037:invokestatic    #420 <Method int getChildMeasureSpec(int, int, int)>
	//  515 1040:istore          15
						if(layoutparams2.height != 0 || j6 != 0x40000000)
	//* 516 1042:aload           24
	//* 517 1044:getfield        #181 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 518 1047:ifne            1057
	//* 519 1050:iload           20
	//* 520 1052:ldc1            #160 <Int 0x40000000>
	//* 521 1054:icmpeq          1096
						{
							l2 = view2.getMeasuredHeight() + l1;
	//  522 1057:aload           23
	//  523 1059:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  524 1062:iload           11
	//  525 1064:iadd            
	//  526 1065:istore          13
							l1 = l2;
	//  527 1067:iload           13
	//  528 1069:istore          11
							if(l2 < 0)
	//* 529 1071:iload           13
	//* 530 1073:ifge            1079
								l1 = 0;
	//  531 1076:iconst_0        
	//  532 1077:istore          11
							view2.measure(l3, android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
	//  533 1079:aload           23
	//  534 1081:iload           15
	//  535 1083:iload           11
	//  536 1085:ldc1            #160 <Int 0x40000000>
	//  537 1087:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  538 1090:invokevirtual   #401 <Method void View.measure(int, int)>
						} else
	//* 539 1093:goto            1121
						{
							if(l1 <= 0)
	//* 540 1096:iload           11
	//* 541 1098:ifle            1104
	//* 542 1101:goto            1107
								l1 = 0;
	//  543 1104:iconst_0        
	//  544 1105:istore          11
							view2.measure(l3, android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
	//  545 1107:aload           23
	//  546 1109:iload           15
	//  547 1111:iload           11
	//  548 1113:ldc1            #160 <Int 0x40000000>
	//  549 1115:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  550 1118:invokevirtual   #401 <Method void View.measure(int, int)>
						}
						l1 = View.combineMeasuredStates(i1, view2.getMeasuredState() & 0xffffff00);
	//  551 1121:iload           8
	//  552 1123:aload           23
	//  553 1125:invokevirtual   #406 <Method int View.getMeasuredState()>
	//  554 1128:sipush          -256
	//  555 1131:iand            
	//  556 1132:invokestatic    #422 <Method int View.combineMeasuredStates(int, int)>
	//  557 1135:istore          11
					}
					l2 = layoutparams2.leftMargin + layoutparams2.rightMargin;
	//  558 1137:aload           24
	//  559 1139:getfield        #228 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  560 1142:aload           24
	//  561 1144:getfield        #222 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  562 1147:iadd            
	//  563 1148:istore          13
					int i4 = view2.getMeasuredWidth() + l2;
	//  564 1150:aload           23
	//  565 1152:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  566 1155:iload           13
	//  567 1157:iadd            
	//  568 1158:istore          15
					j1 = Math.max(j1, i4);
	//  569 1160:iload           9
	//  570 1162:iload           15
	//  571 1164:invokestatic    #398 <Method int Math.max(int, int)>
	//  572 1167:istore          9
					if(i6 != 0x40000000 && layoutparams2.width == -1)
	//* 573 1169:iload           19
	//* 574 1171:ldc1            #160 <Int 0x40000000>
	//* 575 1173:icmpeq          1191
	//* 576 1176:aload           24
	//* 577 1178:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 578 1181:iconst_m1       
	//* 579 1182:icmpne          1191
						i1 = 1;
	//  580 1185:iconst_1        
	//  581 1186:istore          8
					else
	//* 582 1188:goto            1194
						i1 = 0;
	//  583 1191:iconst_0        
	//  584 1192:istore          8
					if(i1 != 0)
	//* 585 1194:iload           8
	//* 586 1196:ifeq            1206
						i1 = l2;
	//  587 1199:iload           13
	//  588 1201:istore          8
					else
	//* 589 1203:goto            1210
						i1 = i4;
	//  590 1206:iload           15
	//  591 1208:istore          8
					i1 = Math.max(k, i1);
	//  592 1210:iload           6
	//  593 1212:iload           8
	//  594 1214:invokestatic    #398 <Method int Math.max(int, int)>
	//  595 1217:istore          8
					if(l != 0 && layoutparams2.width == -1)
	//* 596 1219:iload           7
	//* 597 1221:ifeq            1239
	//* 598 1224:aload           24
	//* 599 1226:getfield        #184 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 600 1229:iconst_m1       
	//* 601 1230:icmpne          1239
						k = 1;
	//  602 1233:iconst_1        
	//  603 1234:istore          6
					else
	//* 604 1236:goto            1242
						k = 0;
	//  605 1239:iconst_0        
	//  606 1240:istore          6
					l = mTotalLength;
	//  607 1242:aload_0         
	//  608 1243:getfield        #328 <Field int mTotalLength>
	//  609 1246:istore          7
					mTotalLength = Math.max(l, view2.getMeasuredHeight() + l + layoutparams2.topMargin + layoutparams2.bottomMargin + getNextLocationOffset(view2));
	//  610 1248:aload_0         
	//  611 1249:iload           7
	//  612 1251:aload           23
	//  613 1253:invokevirtual   #194 <Method int View.getMeasuredHeight()>
	//  614 1256:iload           7
	//  615 1258:iadd            
	//  616 1259:aload           24
	//  617 1261:getfield        #250 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  618 1264:iadd            
	//  619 1265:aload           24
	//  620 1267:getfield        #267 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  621 1270:iadd            
	//  622 1271:aload_0         
	//  623 1272:aload           23
	//  624 1274:invokevirtual   #380 <Method int getNextLocationOffset(View)>
	//  625 1277:iadd            
	//  626 1278:invokestatic    #398 <Method int Math.max(int, int)>
	//  627 1281:putfield        #328 <Field int mTotalLength>
					f = f1;
	//  628 1284:fload           4
	//  629 1286:fstore_3        
					l = k;
	//  630 1287:iload           6
	//  631 1289:istore          7
					k = i1;
	//  632 1291:iload           8
	//  633 1293:istore          6
					i1 = l1;
	//  634 1295:iload           11
	//  635 1297:istore          8
				}
				i3++;
	//  636 1299:iload           14
	//  637 1301:iconst_1        
	//  638 1302:iadd            
	//  639 1303:istore          14
			}

	//  640 1305:iload           12
	//  641 1307:istore          13
	//* 642 1309:goto            919
			mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
	//  643 1312:aload_0         
	//  644 1313:aload_0         
	//  645 1314:getfield        #328 <Field int mTotalLength>
	//  646 1317:aload_0         
	//  647 1318:invokevirtual   #280 <Method int getPaddingTop()>
	//  648 1321:aload_0         
	//  649 1322:invokevirtual   #261 <Method int getPaddingBottom()>
	//  650 1325:iadd            
	//  651 1326:iadd            
	//  652 1327:putfield        #328 <Field int mTotalLength>
			l1 = j1;
	//  653 1330:iload           9
	//  654 1332:istore          11
			k2 = i1;
	//  655 1334:iload           8
	//  656 1336:istore          12
			i3 = l;
	//  657 1338:iload           7
	//  658 1340:istore          14
		} else
	//* 659 1342:goto            1497
		{
			int l4 = Math.max(k, l1);
	//  660 1345:iload           6
	//  661 1347:iload           11
	//  662 1349:invokestatic    #398 <Method int Math.max(int, int)>
	//  663 1352:istore          16
			l1 = j1;
	//  664 1354:iload           9
	//  665 1356:istore          11
			k2 = i1;
	//  666 1358:iload           8
	//  667 1360:istore          12
			k = l4;
	//  668 1362:iload           16
	//  669 1364:istore          6
			i3 = l;
	//  670 1366:iload           7
	//  671 1368:istore          14
			if(flag)
	//* 672 1370:iload           22
	//* 673 1372:ifeq            1497
			{
				l1 = j1;
	//  674 1375:iload           9
	//  675 1377:istore          11
				k2 = i1;
	//  676 1379:iload           8
	//  677 1381:istore          12
				k = l4;
	//  678 1383:iload           16
	//  679 1385:istore          6
				i3 = l;
	//  680 1387:iload           7
	//  681 1389:istore          14
				if(j6 != 0x40000000)
	//* 682 1391:iload           20
	//* 683 1393:ldc1            #160 <Int 0x40000000>
	//* 684 1395:icmpeq          1497
				{
					int j4 = 0;
	//  685 1398:iconst_0        
	//  686 1399:istore          15
					do
					{
						l1 = j1;
	//  687 1401:iload           9
	//  688 1403:istore          11
						k2 = i1;
	//  689 1405:iload           8
	//  690 1407:istore          12
						k = l4;
	//  691 1409:iload           16
	//  692 1411:istore          6
						i3 = l;
	//  693 1413:iload           7
	//  694 1415:istore          14
						if(j4 >= l5)
							break;
	//  695 1417:iload           15
	//  696 1419:iload           18
	//  697 1421:icmpge          1497
						View view3 = getVirtualChildAt(j4);
	//  698 1424:aload_0         
	//  699 1425:iload           15
	//  700 1427:invokevirtual   #169 <Method View getVirtualChildAt(int)>
	//  701 1430:astore          23
						if(view3 != null && view3.getVisibility() != 8 && ((LayoutParams)view3.getLayoutParams()).weight > 0.0F)
	//* 702 1432:aload           23
	//* 703 1434:ifnull          1488
	//* 704 1437:aload           23
	//* 705 1439:invokevirtual   #174 <Method int View.getVisibility()>
	//* 706 1442:bipush          8
	//* 707 1444:icmpne          1450
	//* 708 1447:goto            1488
	//* 709 1450:aload           23
	//* 710 1452:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 711 1455:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//* 712 1458:getfield        #393 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 713 1461:fconst_0        
	//* 714 1462:fcmpl           
	//* 715 1463:ifle            1488
							view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(view3.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l2, 0x40000000));
	//  716 1466:aload           23
	//  717 1468:aload           23
	//  718 1470:invokevirtual   #187 <Method int View.getMeasuredWidth()>
	//  719 1473:ldc1            #160 <Int 0x40000000>
	//  720 1475:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  721 1478:iload           13
	//  722 1480:ldc1            #160 <Int 0x40000000>
	//  723 1482:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  724 1485:invokevirtual   #401 <Method void View.measure(int, int)>
						j4++;
	//  725 1488:iload           15
	//  726 1490:iconst_1        
	//  727 1491:iadd            
	//  728 1492:istore          15
					} while(true);
	//  729 1494:goto            1401
				}
			}
		}
		l = l1;
	//  730 1497:iload           11
	//  731 1499:istore          7
		if(i3 == 0)
	//* 732 1501:iload           14
	//* 733 1503:ifne            1521
		{
			l = l1;
	//  734 1506:iload           11
	//  735 1508:istore          7
			if(i6 != 0x40000000)
	//* 736 1510:iload           19
	//* 737 1512:ldc1            #160 <Int 0x40000000>
	//* 738 1514:icmpeq          1521
				l = k;
	//  739 1517:iload           6
	//  740 1519:istore          7
		}
		setMeasuredDimension(View.resolveSizeAndState(Math.max(l + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, k2), k5);
	//  741 1521:aload_0         
	//  742 1522:iload           7
	//  743 1524:aload_0         
	//  744 1525:invokevirtual   #237 <Method int getPaddingLeft()>
	//  745 1528:aload_0         
	//  746 1529:invokevirtual   #243 <Method int getPaddingRight()>
	//  747 1532:iadd            
	//  748 1533:iadd            
	//  749 1534:aload_0         
	//  750 1535:invokevirtual   #412 <Method int getSuggestedMinimumWidth()>
	//  751 1538:invokestatic    #398 <Method int Math.max(int, int)>
	//  752 1541:iload_1         
	//  753 1542:iload           12
	//  754 1544:invokestatic    #416 <Method int View.resolveSizeAndState(int, int, int)>
	//  755 1547:iload           17
	//  756 1549:invokevirtual   #428 <Method void setMeasuredDimension(int, int)>
		if(k1 != 0)
	//* 757 1552:iload           10
	//* 758 1554:ifeq            1564
			forceUniformWidth(l5, j);
	//  759 1557:aload_0         
	//  760 1558:iload           18
	//  761 1560:iload_2         
	//  762 1561:invokespecial   #435 <Method void forceUniformWidth(int, int)>
	//  763 1564:return          
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
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #447 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          22
		{
			super.onInitializeAccessibilityEvent(accessibilityevent);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #449 <Method void ViewGroup.onInitializeAccessibilityEvent(AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/widget/LinearLayoutCompat)).getName())));
	//    6   13:aload_1         
	//    7   14:ldc1            #2   <Class LinearLayoutCompat>
	//    8   16:invokevirtual   #455 <Method String Class.getName()>
	//    9   19:invokevirtual   #461 <Method void AccessibilityEvent.setClassName(CharSequence)>
		}
	//   10   22:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #447 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          22
		{
			super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #465 <Method void ViewGroup.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
			accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/widget/LinearLayoutCompat)).getName())));
	//    6   13:aload_1         
	//    7   14:ldc1            #2   <Class LinearLayoutCompat>
	//    8   16:invokevirtual   #455 <Method String Class.getName()>
	//    9   19:invokevirtual   #468 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
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
	//    9   15:invokevirtual   #472 <Method void layoutVertical(int, int, int, int)>
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
	//   16   26:invokevirtual   #474 <Method void layoutHorizontal(int, int, int, int)>
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
	//    7   11:invokevirtual   #477 <Method void measureVertical(int, int)>
			return;
	//    8   14:return          
		} else
		{
			measureHorizontal(i, j);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #479 <Method void measureHorizontal(int, int)>
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
	//    6   12:new             #482 <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:new             #484 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #486 <Method void StringBuilder()>
	//   11   23:ldc2            #488 <String "base aligned child index out of range (0, ">
	//   12   26:invokevirtual   #492 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:aload_0         
	//   14   30:invokevirtual   #311 <Method int getChildCount()>
	//   15   33:invokevirtual   #495 <Method StringBuilder StringBuilder.append(int)>
	//   16   36:ldc2            #497 <String ")">
	//   17   39:invokevirtual   #492 <Method StringBuilder StringBuilder.append(String)>
	//   18   42:invokevirtual   #500 <Method String StringBuilder.toString()>
	//   19   45:invokespecial   #501 <Method void IllegalArgumentException(String)>
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
		if(drawable != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          37
		{
			mDividerWidth = drawable.getIntrinsicWidth();
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #504 <Method int Drawable.getIntrinsicWidth()>
	//   13   23:putfield        #230 <Field int mDividerWidth>
			mDividerHeight = drawable.getIntrinsicHeight();
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #507 <Method int Drawable.getIntrinsicHeight()>
	//   17   31:putfield        #252 <Field int mDividerHeight>
		} else
	//*  18   34:goto            47
		{
			mDividerWidth = 0;
	//   19   37:aload_0         
	//   20   38:iconst_0        
	//   21   39:putfield        #230 <Field int mDividerWidth>
			mDividerHeight = 0;
	//   22   42:aload_0         
	//   23   43:iconst_0        
	//   24   44:putfield        #252 <Field int mDividerHeight>
		}
		boolean flag;
		if(drawable == null)
	//*  25   47:aload_1         
	//*  26   48:ifnonnull       56
			flag = true;
	//   27   51:iconst_1        
	//   28   52:istore_2        
		else
	//*  29   53:goto            58
			flag = false;
	//   30   56:iconst_0        
	//   31   57:istore_2        
		setWillNotDraw(flag);
	//   32   58:aload_0         
	//   33   59:iload_2         
	//   34   60:invokevirtual   #510 <Method void setWillNotDraw(boolean)>
		requestLayout();
	//   35   63:aload_0         
	//   36   64:invokevirtual   #513 <Method void requestLayout()>
	//   37   67:return          
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
	//   11   19:ldc2            #515 <Int 0x800003>
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
	//   28   44:invokevirtual   #513 <Method void requestLayout()>
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
	//   13   23:ldc2            #517 <Int 0xff7ffff8>
	//   14   26:iand            
	//   15   27:iload_1         
	//   16   28:ior             
	//   17   29:putfield        #68  <Field int mGravity>
			requestLayout();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #513 <Method void requestLayout()>
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
	//    8   14:invokevirtual   #513 <Method void requestLayout()>
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
	//    5    9:invokevirtual   #513 <Method void requestLayout()>
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
	//   19   30:invokevirtual   #513 <Method void requestLayout()>
		}
	//   20   33:return          
	}

	public void setWeightSum(float f)
	{
		mWeightSum = Math.max(0.0F, f);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:invokestatic    #525 <Method float Math.max(float, float)>
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
