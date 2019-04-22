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

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #23  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			gravity = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #17  <Field int gravity>
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.LinearLayoutCompat_Layout)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #29  <Field int[] android.support.v7.appcompat.R$styleable.LinearLayoutCompat_Layout>
		//   10   16:invokevirtual   #35  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_1        
			weight = ((TypedArray) (context)).getFloat(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:getstatic       #38  <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_Layout_android_layout_weight>
		//   15   25:fconst_0        
		//   16   26:invokevirtual   #44  <Method float TypedArray.getFloat(int, float)>
		//   17   29:putfield        #19  <Field float weight>
			gravity = ((TypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
		//   18   32:aload_0         
		//   19   33:aload_1         
		//   20   34:getstatic       #47  <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_Layout_android_layout_gravity>
		//   21   37:iconst_m1       
		//   22   38:invokevirtual   #51  <Method int TypedArray.getInt(int, int)>
		//   23   41:putfield        #17  <Field int gravity>
			((TypedArray) (context)).recycle();
		//   24   44:aload_1         
		//   25   45:invokevirtual   #55  <Method void TypedArray.recycle()>
		//   26   48:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #58  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
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
	//    3    3:invokespecial   #38  <Method void LinearLayoutCompat(Context, AttributeSet)>
	//    4    6:return          
	}

	public LinearLayoutCompat(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #42  <Method void LinearLayoutCompat(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public LinearLayoutCompat(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #43  <Method void ViewGroup(Context, AttributeSet, int)>
		mBaselineAligned = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #45  <Field boolean mBaselineAligned>
		mBaselineAlignedChildIndex = -1;
	//    8   12:aload_0         
	//    9   13:iconst_m1       
	//   10   14:putfield        #47  <Field int mBaselineAlignedChildIndex>
		mBaselineChildTop = 0;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #49  <Field int mBaselineChildTop>
		mGravity = 0x800033;
	//   14   22:aload_0         
	//   15   23:ldc1            #50  <Int 0x800033>
	//   16   25:putfield        #52  <Field int mGravity>
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.LinearLayoutCompat, i, 0)));
	//   17   28:aload_1         
	//   18   29:aload_2         
	//   19   30:getstatic       #57  <Field int[] android.support.v7.appcompat.R$styleable.LinearLayoutCompat>
	//   20   33:iload_3         
	//   21   34:iconst_0        
	//   22   35:invokestatic    #63  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   23   38:astore_1        
		i = ((TintTypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_android_orientation, -1);
	//   24   39:aload_1         
	//   25   40:getstatic       #66  <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_android_orientation>
	//   26   43:iconst_m1       
	//   27   44:invokevirtual   #70  <Method int TintTypedArray.getInt(int, int)>
	//   28   47:istore_3        
		if(i >= 0)
	//*  29   48:iload_3         
	//*  30   49:iflt            57
			setOrientation(i);
	//   31   52:aload_0         
	//   32   53:iload_3         
	//   33   54:invokevirtual   #74  <Method void setOrientation(int)>
		i = ((TintTypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_android_gravity, -1);
	//   34   57:aload_1         
	//   35   58:getstatic       #77  <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_android_gravity>
	//   36   61:iconst_m1       
	//   37   62:invokevirtual   #70  <Method int TintTypedArray.getInt(int, int)>
	//   38   65:istore_3        
		if(i >= 0)
	//*  39   66:iload_3         
	//*  40   67:iflt            75
			setGravity(i);
	//   41   70:aload_0         
	//   42   71:iload_3         
	//   43   72:invokevirtual   #80  <Method void setGravity(int)>
		boolean flag = ((TintTypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_android_baselineAligned, true);
	//   44   75:aload_1         
	//   45   76:getstatic       #83  <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_android_baselineAligned>
	//   46   79:iconst_1        
	//   47   80:invokevirtual   #87  <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   48   83:istore          4
		if(!flag)
	//*  49   85:iload           4
	//*  50   87:ifne            96
			setBaselineAligned(flag);
	//   51   90:aload_0         
	//   52   91:iload           4
	//   53   93:invokevirtual   #91  <Method void setBaselineAligned(boolean)>
		mWeightSum = ((TintTypedArray) (context)).getFloat(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_android_weightSum, -1F);
	//   54   96:aload_0         
	//   55   97:aload_1         
	//   56   98:getstatic       #94  <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_android_weightSum>
	//   57  101:ldc1            #95  <Float -1F>
	//   58  103:invokevirtual   #99  <Method float TintTypedArray.getFloat(int, float)>
	//   59  106:putfield        #101 <Field float mWeightSum>
		mBaselineAlignedChildIndex = ((TintTypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
	//   60  109:aload_0         
	//   61  110:aload_1         
	//   62  111:getstatic       #104 <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_android_baselineAlignedChildIndex>
	//   63  114:iconst_m1       
	//   64  115:invokevirtual   #70  <Method int TintTypedArray.getInt(int, int)>
	//   65  118:putfield        #47  <Field int mBaselineAlignedChildIndex>
		mUseLargestChild = ((TintTypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
	//   66  121:aload_0         
	//   67  122:aload_1         
	//   68  123:getstatic       #107 <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_measureWithLargestChild>
	//   69  126:iconst_0        
	//   70  127:invokevirtual   #87  <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   71  130:putfield        #109 <Field boolean mUseLargestChild>
		setDividerDrawable(((TintTypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_divider));
	//   72  133:aload_0         
	//   73  134:aload_1         
	//   74  135:getstatic       #112 <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_divider>
	//   75  138:invokevirtual   #116 <Method Drawable TintTypedArray.getDrawable(int)>
	//   76  141:invokevirtual   #120 <Method void setDividerDrawable(Drawable)>
		mShowDividers = ((TintTypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_showDividers, 0);
	//   77  144:aload_0         
	//   78  145:aload_1         
	//   79  146:getstatic       #123 <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_showDividers>
	//   80  149:iconst_0        
	//   81  150:invokevirtual   #70  <Method int TintTypedArray.getInt(int, int)>
	//   82  153:putfield        #125 <Field int mShowDividers>
		mDividerPadding = ((TintTypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_dividerPadding, 0);
	//   83  156:aload_0         
	//   84  157:aload_1         
	//   85  158:getstatic       #128 <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_dividerPadding>
	//   86  161:iconst_0        
	//   87  162:invokevirtual   #131 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//   88  165:putfield        #133 <Field int mDividerPadding>
		((TintTypedArray) (context)).recycle();
	//   89  168:aload_1         
	//   90  169:invokevirtual   #137 <Method void TintTypedArray.recycle()>
	//   91  172:return          
	}

	private void forceUniformHeight(int i, int j)
	{
		int l = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #143 <Method int getMeasuredHeight()>
	//    2    4:ldc1            #144 <Int 0x40000000>
	//    3    6:invokestatic    #149 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
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
	//   12   20:invokevirtual   #153 <Method View getVirtualChildAt(int)>
	//   13   23:astore          6
			if(view.getVisibility() == 8)
				continue;
	//   14   25:aload           6
	//   15   27:invokevirtual   #158 <Method int View.getVisibility()>
	//   16   30:bipush          8
	//   17   32:icmpeq          89
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   18   35:aload           6
	//   19   37:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   40:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   21   43:astore          7
			if(layoutparams.height == -1)
	//*  22   45:aload           7
	//*  23   47:getfield        #165 <Field int LinearLayoutCompat$LayoutParams.height>
	//*  24   50:iconst_m1       
	//*  25   51:icmpne          89
			{
				int i1 = layoutparams.width;
	//   26   54:aload           7
	//   27   56:getfield        #168 <Field int LinearLayoutCompat$LayoutParams.width>
	//   28   59:istore          5
				layoutparams.width = view.getMeasuredWidth();
	//   29   61:aload           7
	//   30   63:aload           6
	//   31   65:invokevirtual   #171 <Method int View.getMeasuredWidth()>
	//   32   68:putfield        #168 <Field int LinearLayoutCompat$LayoutParams.width>
				measureChildWithMargins(view, j, 0, l, 0);
	//   33   71:aload_0         
	//   34   72:aload           6
	//   35   74:iload_2         
	//   36   75:iconst_0        
	//   37   76:iload           4
	//   38   78:iconst_0        
	//   39   79:invokevirtual   #175 <Method void measureChildWithMargins(View, int, int, int, int)>
				layoutparams.width = i1;
	//   40   82:aload           7
	//   41   84:iload           5
	//   42   86:putfield        #168 <Field int LinearLayoutCompat$LayoutParams.width>
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
	//    1    1:invokevirtual   #177 <Method int getMeasuredWidth()>
	//    2    4:ldc1            #144 <Int 0x40000000>
	//    3    6:invokestatic    #149 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
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
	//   12   20:invokevirtual   #153 <Method View getVirtualChildAt(int)>
	//   13   23:astore          6
			if(view.getVisibility() == 8)
				continue;
	//   14   25:aload           6
	//   15   27:invokevirtual   #158 <Method int View.getVisibility()>
	//   16   30:bipush          8
	//   17   32:icmpeq          89
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   18   35:aload           6
	//   19   37:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   40:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   21   43:astore          7
			if(layoutparams.width == -1)
	//*  22   45:aload           7
	//*  23   47:getfield        #168 <Field int LinearLayoutCompat$LayoutParams.width>
	//*  24   50:iconst_m1       
	//*  25   51:icmpne          89
			{
				int i1 = layoutparams.height;
	//   26   54:aload           7
	//   27   56:getfield        #165 <Field int LinearLayoutCompat$LayoutParams.height>
	//   28   59:istore          5
				layoutparams.height = view.getMeasuredHeight();
	//   29   61:aload           7
	//   30   63:aload           6
	//   31   65:invokevirtual   #178 <Method int View.getMeasuredHeight()>
	//   32   68:putfield        #165 <Field int LinearLayoutCompat$LayoutParams.height>
				measureChildWithMargins(view, l, 0, j, 0);
	//   33   71:aload_0         
	//   34   72:aload           6
	//   35   74:iload           4
	//   36   76:iconst_0        
	//   37   77:iload_2         
	//   38   78:iconst_0        
	//   39   79:invokevirtual   #175 <Method void measureChildWithMargins(View, int, int, int, int)>
				layoutparams.height = i1;
	//   40   82:aload           7
	//   41   84:iload           5
	//   42   86:putfield        #165 <Field int LinearLayoutCompat$LayoutParams.height>
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
	//    9   11:invokevirtual   #183 <Method void View.layout(int, int, int, int)>
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
	//    1    1:invokevirtual   #190 <Method int getVirtualChildCount()>
	//    2    4:istore          4
		boolean flag = ViewUtils.isLayoutRtl(((View) (this)));
	//    3    6:aload_0         
	//    4    7:invokestatic    #196 <Method boolean ViewUtils.isLayoutRtl(View)>
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
	//   13   22:invokevirtual   #153 <Method View getVirtualChildAt(int)>
	//   14   25:astore          6
			if(view == null || view.getVisibility() == 8 || !hasDividerBeforeChildAt(i))
				continue;
	//   15   27:aload           6
	//   16   29:ifnull          103
	//   17   32:aload           6
	//   18   34:invokevirtual   #158 <Method int View.getVisibility()>
	//   19   37:bipush          8
	//   20   39:icmpeq          103
	//   21   42:aload_0         
	//   22   43:iload_2         
	//   23   44:invokevirtual   #200 <Method boolean hasDividerBeforeChildAt(int)>
	//   24   47:ifeq            103
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   25   50:aload           6
	//   26   52:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   27   55:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   28   58:astore          7
			int k;
			if(flag)
	//*  29   60:iload           5
	//*  30   62:ifeq            80
				k = view.getRight() + layoutparams.rightMargin;
	//   31   65:aload           6
	//   32   67:invokevirtual   #203 <Method int View.getRight()>
	//   33   70:aload           7
	//   34   72:getfield        #206 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//   35   75:iadd            
	//   36   76:istore_3        
			else
	//*  37   77:goto            97
				k = view.getLeft() - layoutparams.leftMargin - mDividerWidth;
	//   38   80:aload           6
	//   39   82:invokevirtual   #209 <Method int View.getLeft()>
	//   40   85:aload           7
	//   41   87:getfield        #212 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//   42   90:isub            
	//   43   91:aload_0         
	//   44   92:getfield        #214 <Field int mDividerWidth>
	//   45   95:isub            
	//   46   96:istore_3        
			drawVerticalDivider(canvas, k);
	//   47   97:aload_0         
	//   48   98:aload_1         
	//   49   99:iload_3         
	//   50  100:invokevirtual   #218 <Method void drawVerticalDivider(Canvas, int)>
		}

	//   51  103:iload_2         
	//   52  104:iconst_1        
	//   53  105:iadd            
	//   54  106:istore_2        
	//*  55  107:goto            14
		if(hasDividerBeforeChildAt(l))
	//*  56  110:aload_0         
	//*  57  111:iload           4
	//*  58  113:invokevirtual   #200 <Method boolean hasDividerBeforeChildAt(int)>
	//*  59  116:ifeq            218
		{
			View view1 = getVirtualChildAt(l - 1);
	//   60  119:aload_0         
	//   61  120:iload           4
	//   62  122:iconst_1        
	//   63  123:isub            
	//   64  124:invokevirtual   #153 <Method View getVirtualChildAt(int)>
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
	//   71  140:invokevirtual   #221 <Method int getPaddingLeft()>
	//   72  143:istore_2        
				else
	//*  73  144:goto            212
					j = getWidth() - getPaddingRight() - mDividerWidth;
	//   74  147:aload_0         
	//   75  148:invokevirtual   #224 <Method int getWidth()>
	//   76  151:aload_0         
	//   77  152:invokevirtual   #227 <Method int getPaddingRight()>
	//   78  155:isub            
	//   79  156:aload_0         
	//   80  157:getfield        #214 <Field int mDividerWidth>
	//   81  160:isub            
	//   82  161:istore_2        
			} else
	//*  83  162:goto            212
			{
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//   84  165:aload           6
	//   85  167:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   86  170:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   87  173:astore          7
				if(flag)
	//*  88  175:iload           5
	//*  89  177:ifeq            200
					j = view1.getLeft() - layoutparams1.leftMargin - mDividerWidth;
	//   90  180:aload           6
	//   91  182:invokevirtual   #209 <Method int View.getLeft()>
	//   92  185:aload           7
	//   93  187:getfield        #212 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//   94  190:isub            
	//   95  191:aload_0         
	//   96  192:getfield        #214 <Field int mDividerWidth>
	//   97  195:isub            
	//   98  196:istore_2        
				else
	//*  99  197:goto            212
					j = view1.getRight() + layoutparams1.rightMargin;
	//  100  200:aload           6
	//  101  202:invokevirtual   #203 <Method int View.getRight()>
	//  102  205:aload           7
	//  103  207:getfield        #206 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  104  210:iadd            
	//  105  211:istore_2        
			}
			drawVerticalDivider(canvas, j);
	//  106  212:aload_0         
	//  107  213:aload_1         
	//  108  214:iload_2         
	//  109  215:invokevirtual   #218 <Method void drawVerticalDivider(Canvas, int)>
		}
	//  110  218:return          
	}

	void drawDividersVertical(Canvas canvas)
	{
		int k = getVirtualChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method int getVirtualChildCount()>
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
	//   10   14:invokevirtual   #153 <Method View getVirtualChildAt(int)>
	//   11   17:astore          4
			if(view != null && view.getVisibility() != 8 && hasDividerBeforeChildAt(i))
	//*  12   19:aload           4
	//*  13   21:ifnull          73
	//*  14   24:aload           4
	//*  15   26:invokevirtual   #158 <Method int View.getVisibility()>
	//*  16   29:bipush          8
	//*  17   31:icmpeq          73
	//*  18   34:aload_0         
	//*  19   35:iload_2         
	//*  20   36:invokevirtual   #200 <Method boolean hasDividerBeforeChildAt(int)>
	//*  21   39:ifeq            73
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   22   42:aload           4
	//   23   44:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   24   47:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   25   50:astore          5
				drawHorizontalDivider(canvas, view.getTop() - layoutparams.topMargin - mDividerHeight);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:aload           4
	//   29   56:invokevirtual   #231 <Method int View.getTop()>
	//   30   59:aload           5
	//   31   61:getfield        #234 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//   32   64:isub            
	//   33   65:aload_0         
	//   34   66:getfield        #236 <Field int mDividerHeight>
	//   35   69:isub            
	//   36   70:invokevirtual   #239 <Method void drawHorizontalDivider(Canvas, int)>
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
	//*  44   82:invokevirtual   #200 <Method boolean hasDividerBeforeChildAt(int)>
	//*  45   85:ifeq            148
		{
			View view1 = getVirtualChildAt(k - 1);
	//   46   88:aload_0         
	//   47   89:iload_3         
	//   48   90:iconst_1        
	//   49   91:isub            
	//   50   92:invokevirtual   #153 <Method View getVirtualChildAt(int)>
	//   51   95:astore          4
			int j;
			if(view1 == null)
	//*  52   97:aload           4
	//*  53   99:ifnonnull       120
			{
				j = getHeight() - getPaddingBottom() - mDividerHeight;
	//   54  102:aload_0         
	//   55  103:invokevirtual   #242 <Method int getHeight()>
	//   56  106:aload_0         
	//   57  107:invokevirtual   #245 <Method int getPaddingBottom()>
	//   58  110:isub            
	//   59  111:aload_0         
	//   60  112:getfield        #236 <Field int mDividerHeight>
	//   61  115:isub            
	//   62  116:istore_2        
			} else
	//*  63  117:goto            142
			{
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//   64  120:aload           4
	//   65  122:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   66  125:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   67  128:astore          5
				j = view1.getBottom() + layoutparams1.bottomMargin;
	//   68  130:aload           4
	//   69  132:invokevirtual   #248 <Method int View.getBottom()>
	//   70  135:aload           5
	//   71  137:getfield        #251 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//   72  140:iadd            
	//   73  141:istore_2        
			}
			drawHorizontalDivider(canvas, j);
	//   74  142:aload_0         
	//   75  143:aload_1         
	//   76  144:iload_2         
	//   77  145:invokevirtual   #239 <Method void drawHorizontalDivider(Canvas, int)>
		}
	//   78  148:return          
	}

	void drawHorizontalDivider(Canvas canvas, int i)
	{
		mDivider.setBounds(getPaddingLeft() + mDividerPadding, i, getWidth() - getPaddingRight() - mDividerPadding, mDividerHeight + i);
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field Drawable mDivider>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #221 <Method int getPaddingLeft()>
	//    4    8:aload_0         
	//    5    9:getfield        #133 <Field int mDividerPadding>
	//    6   12:iadd            
	//    7   13:iload_2         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #224 <Method int getWidth()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #227 <Method int getPaddingRight()>
	//   12   22:isub            
	//   13   23:aload_0         
	//   14   24:getfield        #133 <Field int mDividerPadding>
	//   15   27:isub            
	//   16   28:aload_0         
	//   17   29:getfield        #236 <Field int mDividerHeight>
	//   18   32:iload_2         
	//   19   33:iadd            
	//   20   34:invokevirtual   #258 <Method void Drawable.setBounds(int, int, int, int)>
		mDivider.draw(canvas);
	//   21   37:aload_0         
	//   22   38:getfield        #253 <Field Drawable mDivider>
	//   23   41:aload_1         
	//   24   42:invokevirtual   #261 <Method void Drawable.draw(Canvas)>
	//   25   45:return          
	}

	void drawVerticalDivider(Canvas canvas, int i)
	{
		mDivider.setBounds(i, getPaddingTop() + mDividerPadding, mDividerWidth + i, getHeight() - getPaddingBottom() - mDividerPadding);
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field Drawable mDivider>
	//    2    4:iload_2         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #264 <Method int getPaddingTop()>
	//    5    9:aload_0         
	//    6   10:getfield        #133 <Field int mDividerPadding>
	//    7   13:iadd            
	//    8   14:aload_0         
	//    9   15:getfield        #214 <Field int mDividerWidth>
	//   10   18:iload_2         
	//   11   19:iadd            
	//   12   20:aload_0         
	//   13   21:invokevirtual   #242 <Method int getHeight()>
	//   14   24:aload_0         
	//   15   25:invokevirtual   #245 <Method int getPaddingBottom()>
	//   16   28:isub            
	//   17   29:aload_0         
	//   18   30:getfield        #133 <Field int mDividerPadding>
	//   19   33:isub            
	//   20   34:invokevirtual   #258 <Method void Drawable.setBounds(int, int, int, int)>
		mDivider.draw(canvas);
	//   21   37:aload_0         
	//   22   38:getfield        #253 <Field Drawable mDivider>
	//   23   41:aload_1         
	//   24   42:invokevirtual   #261 <Method void Drawable.draw(Canvas)>
	//   25   45:return          
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		int i = mOrientation;
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field int mOrientation>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            21
			return new LayoutParams(-2, -2);
	//    5    9:new             #9   <Class LinearLayoutCompat$LayoutParams>
	//    6   12:dup             
	//    7   13:bipush          -2
	//    8   15:bipush          -2
	//    9   17:invokespecial   #270 <Method void LinearLayoutCompat$LayoutParams(int, int)>
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
	//   18   33:invokespecial   #270 <Method void LinearLayoutCompat$LayoutParams(int, int)>
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
	//    1    1:invokevirtual   #272 <Method LinearLayoutCompat$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #9   <Class LinearLayoutCompat$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #278 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #279 <Method void LinearLayoutCompat$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return new LayoutParams(layoutparams);
	//    0    0:new             #9   <Class LinearLayoutCompat$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #283 <Method void LinearLayoutCompat$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    4    8:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #286 <Method LinearLayoutCompat$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #289 <Method LinearLayoutCompat$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public int getBaseline()
	{
		if(mBaselineAlignedChildIndex < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int mBaselineAlignedChildIndex>
	//*   2    4:ifge            12
			return super.getBaseline();
	//    3    7:aload_0         
	//    4    8:invokespecial   #292 <Method int ViewGroup.getBaseline()>
	//    5   11:ireturn         
		int i = getChildCount();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #295 <Method int getChildCount()>
	//    8   16:istore_1        
		int k = mBaselineAlignedChildIndex;
	//    9   17:aload_0         
	//   10   18:getfield        #47  <Field int mBaselineAlignedChildIndex>
	//   11   21:istore_2        
		if(i > k)
	//*  12   22:iload_1         
	//*  13   23:iload_2         
	//*  14   24:icmple          185
		{
			View view = getChildAt(k);
	//   15   27:aload_0         
	//   16   28:iload_2         
	//   17   29:invokevirtual   #298 <Method View getChildAt(int)>
	//   18   32:astore          5
			int l = view.getBaseline();
	//   19   34:aload           5
	//   20   36:invokevirtual   #299 <Method int View.getBaseline()>
	//   21   39:istore_3        
			if(l == -1)
	//*  22   40:iload_3         
	//*  23   41:iconst_m1       
	//*  24   42:icmpne          65
				if(mBaselineAlignedChildIndex == 0)
	//*  25   45:aload_0         
	//*  26   46:getfield        #47  <Field int mBaselineAlignedChildIndex>
	//*  27   49:ifne            54
					return -1;
	//   28   52:iconst_m1       
	//   29   53:ireturn         
				else
					throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
	//   30   54:new             #301 <Class RuntimeException>
	//   31   57:dup             
	//   32   58:ldc2            #303 <String "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.">
	//   33   61:invokespecial   #306 <Method void RuntimeException(String)>
	//   34   64:athrow          
			k = mBaselineChildTop;
	//   35   65:aload_0         
	//   36   66:getfield        #49  <Field int mBaselineChildTop>
	//   37   69:istore_2        
			int j = k;
	//   38   70:iload_2         
	//   39   71:istore_1        
			if(mOrientation == 1)
	//*  40   72:aload_0         
	//*  41   73:getfield        #268 <Field int mOrientation>
	//*  42   76:iconst_1        
	//*  43   77:icmpne          169
			{
				int i1 = mGravity & 0x70;
	//   44   80:aload_0         
	//   45   81:getfield        #52  <Field int mGravity>
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
	//   64  118:invokevirtual   #307 <Method int getBottom()>
	//   65  121:aload_0         
	//   66  122:invokevirtual   #308 <Method int getTop()>
	//   67  125:isub            
	//   68  126:aload_0         
	//   69  127:invokevirtual   #245 <Method int getPaddingBottom()>
	//   70  130:isub            
	//   71  131:aload_0         
	//   72  132:getfield        #310 <Field int mTotalLength>
	//   73  135:isub            
	//   74  136:istore_1        
					} else
	//*  75  137:goto            169
					{
						j = k + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - mTotalLength) / 2;
	//   76  140:iload_2         
	//   77  141:aload_0         
	//   78  142:invokevirtual   #307 <Method int getBottom()>
	//   79  145:aload_0         
	//   80  146:invokevirtual   #308 <Method int getTop()>
	//   81  149:isub            
	//   82  150:aload_0         
	//   83  151:invokevirtual   #264 <Method int getPaddingTop()>
	//   84  154:isub            
	//   85  155:aload_0         
	//   86  156:invokevirtual   #245 <Method int getPaddingBottom()>
	//   87  159:isub            
	//   88  160:aload_0         
	//   89  161:getfield        #310 <Field int mTotalLength>
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
	//   97  172:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   98  175:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   99  178:getfield        #234 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  100  181:iadd            
	//  101  182:iload_3         
	//  102  183:iadd            
	//  103  184:ireturn         
		} else
		{
			throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
	//  104  185:new             #301 <Class RuntimeException>
	//  105  188:dup             
	//  106  189:ldc2            #312 <String "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.">
	//  107  192:invokespecial   #306 <Method void RuntimeException(String)>
	//  108  195:athrow          
		}
	}

	public int getBaselineAlignedChildIndex()
	{
		return mBaselineAlignedChildIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mBaselineAlignedChildIndex>
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
	//    1    1:getfield        #253 <Field Drawable mDivider>
	//    2    4:areturn         
	}

	public int getDividerPadding()
	{
		return mDividerPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field int mDividerPadding>
	//    2    4:ireturn         
	}

	public int getDividerWidth()
	{
		return mDividerWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field int mDividerWidth>
	//    2    4:ireturn         
	}

	public int getGravity()
	{
		return mGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int mGravity>
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
	//    1    1:getfield        #268 <Field int mOrientation>
	//    2    4:ireturn         
	}

	public int getShowDividers()
	{
		return mShowDividers;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field int mShowDividers>
	//    2    4:ireturn         
	}

	View getVirtualChildAt(int i)
	{
		return getChildAt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #298 <Method View getChildAt(int)>
	//    3    5:areturn         
	}

	int getVirtualChildCount()
	{
		return getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method int getChildCount()>
	//    2    4:ireturn         
	}

	public float getWeightSum()
	{
		return mWeightSum;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field float mWeightSum>
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
	//*   7    9:getfield        #125 <Field int mShowDividers>
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
	//*  17   23:invokevirtual   #295 <Method int getChildCount()>
	//*  18   26:icmpne          44
		{
			boolean flag1 = flag2;
	//   19   29:iload_3         
	//   20   30:istore_2        
			if((mShowDividers & 4) != 0)
	//*  21   31:aload_0         
	//*  22   32:getfield        #125 <Field int mShowDividers>
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
	//*  31   45:getfield        #125 <Field int mShowDividers>
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
	//*  43   63:invokevirtual   #298 <Method View getChildAt(int)>
	//*  44   66:invokevirtual   #158 <Method int View.getVisibility()>
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

	void layoutHorizontal(int i, int j, int k, int l)
	{
		boolean flag = ViewUtils.isLayoutRtl(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #196 <Method boolean ViewUtils.isLayoutRtl(View)>
	//    2    4:istore          18
		int i2 = getPaddingTop();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #264 <Method int getPaddingTop()>
	//    5   10:istore          10
		int l2 = l - j;
	//    6   12:iload           4
	//    7   14:iload_2         
	//    8   15:isub            
	//    9   16:istore          12
		int i3 = getPaddingBottom();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #245 <Method int getPaddingBottom()>
	//   12   22:istore          13
		int j3 = getPaddingBottom();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #245 <Method int getPaddingBottom()>
	//   15   28:istore          14
		int k1 = getVirtualChildCount();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #190 <Method int getVirtualChildCount()>
	//   18   34:istore          8
		l = mGravity;
	//   19   36:aload_0         
	//   20   37:getfield        #52  <Field int mGravity>
	//   21   40:istore          4
		j = l & 0x70;
	//   22   42:iload           4
	//   23   44:bipush          112
	//   24   46:iand            
	//   25   47:istore_2        
		boolean flag1 = mBaselineAligned;
	//   26   48:aload_0         
	//   27   49:getfield        #45  <Field boolean mBaselineAligned>
	//   28   52:istore          19
		int ai[] = mMaxAscent;
	//   29   54:aload_0         
	//   30   55:getfield        #336 <Field int[] mMaxAscent>
	//   31   58:astore          20
		int ai1[] = mMaxDescent;
	//   32   60:aload_0         
	//   33   61:getfield        #338 <Field int[] mMaxDescent>
	//   34   64:astore          21
		l = GravityCompat.getAbsoluteGravity(0x800007 & l, ViewCompat.getLayoutDirection(((View) (this))));
	//   35   66:ldc2            #339 <Int 0x800007>
	//   36   69:iload           4
	//   37   71:iand            
	//   38   72:aload_0         
	//   39   73:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//   40   76:invokestatic    #349 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   41   79:istore          4
		if(l != 1)
	//*  42   81:iload           4
	//*  43   83:iconst_1        
	//*  44   84:icmpeq          118
		{
			if(l != 5)
	//*  45   87:iload           4
	//*  46   89:iconst_5        
	//*  47   90:icmpeq          101
				i = getPaddingLeft();
	//   48   93:aload_0         
	//   49   94:invokevirtual   #221 <Method int getPaddingLeft()>
	//   50   97:istore_1        
			else
	//*  51   98:goto            134
				i = (getPaddingLeft() + k) - i - mTotalLength;
	//   52  101:aload_0         
	//   53  102:invokevirtual   #221 <Method int getPaddingLeft()>
	//   54  105:iload_3         
	//   55  106:iadd            
	//   56  107:iload_1         
	//   57  108:isub            
	//   58  109:aload_0         
	//   59  110:getfield        #310 <Field int mTotalLength>
	//   60  113:isub            
	//   61  114:istore_1        
		} else
	//*  62  115:goto            134
		{
			i = getPaddingLeft() + (k - i - mTotalLength) / 2;
	//   63  118:aload_0         
	//   64  119:invokevirtual   #221 <Method int getPaddingLeft()>
	//   65  122:iload_3         
	//   66  123:iload_1         
	//   67  124:isub            
	//   68  125:aload_0         
	//   69  126:getfield        #310 <Field int mTotalLength>
	//   70  129:isub            
	//   71  130:iconst_2        
	//   72  131:idiv            
	//   73  132:iadd            
	//   74  133:istore_1        
		}
		int j1;
		byte byte0;
		if(flag)
	//*  75  134:iload           18
	//*  76  136:ifeq            151
		{
			j1 = k1 - 1;
	//   77  139:iload           8
	//   78  141:iconst_1        
	//   79  142:isub            
	//   80  143:istore          6
			byte0 = -1;
	//   81  145:iconst_m1       
	//   82  146:istore          7
		} else
	//*  83  148:goto            157
		{
			j1 = 0;
	//   84  151:iconst_0        
	//   85  152:istore          6
			byte0 = 1;
	//   86  154:iconst_1        
	//   87  155:istore          7
		}
		l = 0;
	//   88  157:iconst_0        
	//   89  158:istore          4
		k = i2;
	//   90  160:iload           10
	//   91  162:istore_3        
		int i1 = i;
	//   92  163:iload_1         
	//   93  164:istore          5
		for(; l < k1; l++)
	//*  94  166:iload           4
	//*  95  168:iload           8
	//*  96  170:icmpge          535
		{
			int l3 = j1 + byte0 * l;
	//   97  173:iload           6
	//   98  175:iload           7
	//   99  177:iload           4
	//  100  179:imul            
	//  101  180:iadd            
	//  102  181:istore          16
			View view = getVirtualChildAt(l3);
	//  103  183:aload_0         
	//  104  184:iload           16
	//  105  186:invokevirtual   #153 <Method View getVirtualChildAt(int)>
	//  106  189:astore          22
			if(view == null)
	//* 107  191:aload           22
	//* 108  193:ifnonnull       210
			{
				i1 += measureNullChild(l3);
	//  109  196:iload           5
	//  110  198:aload_0         
	//  111  199:iload           16
	//  112  201:invokevirtual   #353 <Method int measureNullChild(int)>
	//  113  204:iadd            
	//  114  205:istore          5
				continue;
	//  115  207:goto            526
			}
			if(view.getVisibility() == 8)
				continue;
	//  116  210:aload           22
	//  117  212:invokevirtual   #158 <Method int View.getVisibility()>
	//  118  215:bipush          8
	//  119  217:icmpeq          526
			int k3 = view.getMeasuredWidth();
	//  120  220:aload           22
	//  121  222:invokevirtual   #171 <Method int View.getMeasuredWidth()>
	//  122  225:istore          15
			int i4 = view.getMeasuredHeight();
	//  123  227:aload           22
	//  124  229:invokevirtual   #178 <Method int View.getMeasuredHeight()>
	//  125  232:istore          17
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//  126  234:aload           22
	//  127  236:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  128  239:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  129  242:astore          23
			if(flag1 && layoutparams.height != -1)
	//* 130  244:iload           19
	//* 131  246:ifeq            267
	//* 132  249:aload           23
	//* 133  251:getfield        #165 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 134  254:iconst_m1       
	//* 135  255:icmpeq          267
				i = view.getBaseline();
	//  136  258:aload           22
	//  137  260:invokevirtual   #299 <Method int View.getBaseline()>
	//  138  263:istore_1        
			else
	//* 139  264:goto            269
				i = -1;
	//  140  267:iconst_m1       
	//  141  268:istore_1        
			int j2 = layoutparams.gravity;
	//  142  269:aload           23
	//  143  271:getfield        #356 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//  144  274:istore          11
			int l1 = j2;
	//  145  276:iload           11
	//  146  278:istore          9
			if(j2 < 0)
	//* 147  280:iload           11
	//* 148  282:ifge            288
				l1 = j;
	//  149  285:iload_2         
	//  150  286:istore          9
			l1 &= 0x70;
	//  151  288:iload           9
	//  152  290:bipush          112
	//  153  292:iand            
	//  154  293:istore          9
			if(l1 != 16)
	//* 155  295:iload           9
	//* 156  297:bipush          16
	//* 157  299:icmpeq          404
			{
				if(l1 != 48)
	//* 158  302:iload           9
	//* 159  304:bipush          48
	//* 160  306:icmpeq          371
				{
					if(l1 != 80)
	//* 161  309:iload           9
	//* 162  311:bipush          80
	//* 163  313:icmpeq          321
					{
						i = k;
	//  164  316:iload_3         
	//  165  317:istore_1        
					} else
	//* 166  318:goto            432
					{
						l1 = l2 - i3 - i4 - layoutparams.bottomMargin;
	//  167  321:iload           12
	//  168  323:iload           13
	//  169  325:isub            
	//  170  326:iload           17
	//  171  328:isub            
	//  172  329:aload           23
	//  173  331:getfield        #251 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  174  334:isub            
	//  175  335:istore          9
						if(i != -1)
	//* 176  337:iload_1         
	//* 177  338:iconst_m1       
	//* 178  339:icmpeq          365
						{
							int k2 = view.getMeasuredHeight();
	//  179  342:aload           22
	//  180  344:invokevirtual   #178 <Method int View.getMeasuredHeight()>
	//  181  347:istore          11
							i = l1 - (ai1[2] - (k2 - i));
	//  182  349:iload           9
	//  183  351:aload           21
	//  184  353:iconst_2        
	//  185  354:iaload          
	//  186  355:iload           11
	//  187  357:iload_1         
	//  188  358:isub            
	//  189  359:isub            
	//  190  360:isub            
	//  191  361:istore_1        
						} else
	//* 192  362:goto            432
						{
							i = l1;
	//  193  365:iload           9
	//  194  367:istore_1        
						}
					}
				} else
	//* 195  368:goto            432
				{
					l1 = layoutparams.topMargin + k;
	//  196  371:aload           23
	//  197  373:getfield        #234 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  198  376:iload_3         
	//  199  377:iadd            
	//  200  378:istore          9
					if(i != -1)
	//* 201  380:iload_1         
	//* 202  381:iconst_m1       
	//* 203  382:icmpeq          398
						i = l1 + (ai[1] - i);
	//  204  385:iload           9
	//  205  387:aload           20
	//  206  389:iconst_1        
	//  207  390:iaload          
	//  208  391:iload_1         
	//  209  392:isub            
	//  210  393:iadd            
	//  211  394:istore_1        
					else
	//* 212  395:goto            432
						i = l1;
	//  213  398:iload           9
	//  214  400:istore_1        
				}
			} else
	//* 215  401:goto            432
			{
				i = ((l2 - i2 - j3 - i4) / 2 + k + layoutparams.topMargin) - layoutparams.bottomMargin;
	//  216  404:iload           12
	//  217  406:iload           10
	//  218  408:isub            
	//  219  409:iload           14
	//  220  411:isub            
	//  221  412:iload           17
	//  222  414:isub            
	//  223  415:iconst_2        
	//  224  416:idiv            
	//  225  417:iload_3         
	//  226  418:iadd            
	//  227  419:aload           23
	//  228  421:getfield        #234 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  229  424:iadd            
	//  230  425:aload           23
	//  231  427:getfield        #251 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  232  430:isub            
	//  233  431:istore_1        
			}
			l1 = i1;
	//  234  432:iload           5
	//  235  434:istore          9
			if(hasDividerBeforeChildAt(l3))
	//* 236  436:aload_0         
	//* 237  437:iload           16
	//* 238  439:invokevirtual   #200 <Method boolean hasDividerBeforeChildAt(int)>
	//* 239  442:ifeq            454
				l1 = i1 + mDividerWidth;
	//  240  445:iload           5
	//  241  447:aload_0         
	//  242  448:getfield        #214 <Field int mDividerWidth>
	//  243  451:iadd            
	//  244  452:istore          9
			i1 = layoutparams.leftMargin + l1;
	//  245  454:aload           23
	//  246  456:getfield        #212 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  247  459:iload           9
	//  248  461:iadd            
	//  249  462:istore          5
			setChildFrame(view, i1 + getLocationOffset(view), i, k3, i4);
	//  250  464:aload_0         
	//  251  465:aload           22
	//  252  467:iload           5
	//  253  469:aload_0         
	//  254  470:aload           22
	//  255  472:invokevirtual   #358 <Method int getLocationOffset(View)>
	//  256  475:iadd            
	//  257  476:iload_1         
	//  258  477:iload           15
	//  259  479:iload           17
	//  260  481:invokespecial   #360 <Method void setChildFrame(View, int, int, int, int)>
			i = layoutparams.rightMargin;
	//  261  484:aload           23
	//  262  486:getfield        #206 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  263  489:istore_1        
			l1 = getNextLocationOffset(view);
	//  264  490:aload_0         
	//  265  491:aload           22
	//  266  493:invokevirtual   #362 <Method int getNextLocationOffset(View)>
	//  267  496:istore          9
			l += getChildrenSkipCount(view, l3);
	//  268  498:iload           4
	//  269  500:aload_0         
	//  270  501:aload           22
	//  271  503:iload           16
	//  272  505:invokevirtual   #364 <Method int getChildrenSkipCount(View, int)>
	//  273  508:iadd            
	//  274  509:istore          4
			i1 += k3 + i + l1;
	//  275  511:iload           5
	//  276  513:iload           15
	//  277  515:iload_1         
	//  278  516:iadd            
	//  279  517:iload           9
	//  280  519:iadd            
	//  281  520:iadd            
	//  282  521:istore          5
		}

	//  283  523:goto            526
	//  284  526:iload           4
	//  285  528:iconst_1        
	//  286  529:iadd            
	//  287  530:istore          4
	//* 288  532:goto            166
	//  289  535:return          
	}

	void layoutVertical(int i, int j, int k, int l)
	{
		int i1 = getPaddingLeft();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #221 <Method int getPaddingLeft()>
	//    2    4:istore          5
		int j1 = k - i;
	//    3    6:iload_3         
	//    4    7:iload_1         
	//    5    8:isub            
	//    6    9:istore          6
		int k1 = getPaddingRight();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #227 <Method int getPaddingRight()>
	//    9   15:istore          7
		int l1 = getPaddingRight();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #227 <Method int getPaddingRight()>
	//   12   21:istore          8
		int i2 = getVirtualChildCount();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #190 <Method int getVirtualChildCount()>
	//   15   27:istore          9
		int j2 = mGravity;
	//   16   29:aload_0         
	//   17   30:getfield        #52  <Field int mGravity>
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
	//   30   54:invokevirtual   #264 <Method int getPaddingTop()>
	//   31   57:istore_1        
			else
	//*  32   58:goto            96
				i = (getPaddingTop() + l) - j - mTotalLength;
	//   33   61:aload_0         
	//   34   62:invokevirtual   #264 <Method int getPaddingTop()>
	//   35   65:iload           4
	//   36   67:iadd            
	//   37   68:iload_2         
	//   38   69:isub            
	//   39   70:aload_0         
	//   40   71:getfield        #310 <Field int mTotalLength>
	//   41   74:isub            
	//   42   75:istore_1        
		} else
	//*  43   76:goto            96
		{
			i = getPaddingTop() + (l - j - mTotalLength) / 2;
	//   44   79:aload_0         
	//   45   80:invokevirtual   #264 <Method int getPaddingTop()>
	//   46   83:iload           4
	//   47   85:iload_2         
	//   48   86:isub            
	//   49   87:aload_0         
	//   50   88:getfield        #310 <Field int mTotalLength>
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
	//   63  106:invokevirtual   #153 <Method View getVirtualChildAt(int)>
	//   64  109:astore          13
			if(view == null)
	//*  65  111:aload           13
	//*  66  113:ifnonnull       127
			{
				i += measureNullChild(j);
	//   67  116:iload_1         
	//   68  117:aload_0         
	//   69  118:iload_2         
	//   70  119:invokevirtual   #353 <Method int measureNullChild(int)>
	//   71  122:iadd            
	//   72  123:istore_1        
				continue;
	//   73  124:goto            348
			}
			if(view.getVisibility() == 8)
				continue;
	//   74  127:aload           13
	//   75  129:invokevirtual   #158 <Method int View.getVisibility()>
	//   76  132:bipush          8
	//   77  134:icmpeq          348
			int l2 = view.getMeasuredWidth();
	//   78  137:aload           13
	//   79  139:invokevirtual   #171 <Method int View.getMeasuredWidth()>
	//   80  142:istore          12
			int k2 = view.getMeasuredHeight();
	//   81  144:aload           13
	//   82  146:invokevirtual   #178 <Method int View.getMeasuredHeight()>
	//   83  149:istore          11
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   84  151:aload           13
	//   85  153:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   86  156:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   87  159:astore          14
			l = layoutparams.gravity;
	//   88  161:aload           14
	//   89  163:getfield        #356 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//   90  166:istore          4
			k = l;
	//   91  168:iload           4
	//   92  170:istore_3        
			if(l < 0)
	//*  93  171:iload           4
	//*  94  173:ifge            183
				k = j2 & 0x800007;
	//   95  176:iload           10
	//   96  178:ldc2            #339 <Int 0x800007>
	//   97  181:iand            
	//   98  182:istore_3        
			k = GravityCompat.getAbsoluteGravity(k, ViewCompat.getLayoutDirection(((View) (this)))) & 7;
	//   99  183:iload_3         
	//  100  184:aload_0         
	//  101  185:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//  102  188:invokestatic    #349 <Method int GravityCompat.getAbsoluteGravity(int, int)>
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
	//  113  207:getfield        #212 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
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
	//  124  227:getfield        #206 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
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
	//  140  253:getfield        #212 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  141  256:iadd            
	//  142  257:aload           14
	//  143  259:getfield        #206 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  144  262:isub            
	//  145  263:istore_3        
			}
			l = i;
	//  146  264:iload_1         
	//  147  265:istore          4
			if(hasDividerBeforeChildAt(j))
	//* 148  267:aload_0         
	//* 149  268:iload_2         
	//* 150  269:invokevirtual   #200 <Method boolean hasDividerBeforeChildAt(int)>
	//* 151  272:ifeq            283
				l = i + mDividerHeight;
	//  152  275:iload_1         
	//  153  276:aload_0         
	//  154  277:getfield        #236 <Field int mDividerHeight>
	//  155  280:iadd            
	//  156  281:istore          4
			i = l + layoutparams.topMargin;
	//  157  283:iload           4
	//  158  285:aload           14
	//  159  287:getfield        #234 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  160  290:iadd            
	//  161  291:istore_1        
			setChildFrame(view, k, i + getLocationOffset(view), l2, k2);
	//  162  292:aload_0         
	//  163  293:aload           13
	//  164  295:iload_3         
	//  165  296:iload_1         
	//  166  297:aload_0         
	//  167  298:aload           13
	//  168  300:invokevirtual   #358 <Method int getLocationOffset(View)>
	//  169  303:iadd            
	//  170  304:iload           12
	//  171  306:iload           11
	//  172  308:invokespecial   #360 <Method void setChildFrame(View, int, int, int, int)>
			k = layoutparams.bottomMargin;
	//  173  311:aload           14
	//  174  313:getfield        #251 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  175  316:istore_3        
			l = getNextLocationOffset(view);
	//  176  317:aload_0         
	//  177  318:aload           13
	//  178  320:invokevirtual   #362 <Method int getNextLocationOffset(View)>
	//  179  323:istore          4
			j += getChildrenSkipCount(view, j);
	//  180  325:iload_2         
	//  181  326:aload_0         
	//  182  327:aload           13
	//  183  329:iload_2         
	//  184  330:invokevirtual   #364 <Method int getChildrenSkipCount(View, int)>
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
	//    6    9:invokevirtual   #175 <Method void measureChildWithMargins(View, int, int, int, int)>
	//    7   12:return          
	}

	void measureHorizontal(int i, int j)
	{
		mTotalLength = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #310 <Field int mTotalLength>
		int i3 = getVirtualChildCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #190 <Method int getVirtualChildCount()>
	//    5    9:istore          15
		int l7 = android.view.View.MeasureSpec.getMode(i);
	//    6   11:iload_1         
	//    7   12:invokestatic    #371 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   15:istore          21
		int k7 = android.view.View.MeasureSpec.getMode(j);
	//    9   17:iload_2         
	//   10   18:invokestatic    #371 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   11   21:istore          20
		if(mMaxAscent == null || mMaxDescent == null)
	//*  12   23:aload_0         
	//*  13   24:getfield        #336 <Field int[] mMaxAscent>
	//*  14   27:ifnull          37
	//*  15   30:aload_0         
	//*  16   31:getfield        #338 <Field int[] mMaxDescent>
	//*  17   34:ifnonnull       51
		{
			mMaxAscent = new int[4];
	//   18   37:aload_0         
	//   19   38:iconst_4        
	//   20   39:newarray        int[]
	//   21   41:putfield        #336 <Field int[] mMaxAscent>
			mMaxDescent = new int[4];
	//   22   44:aload_0         
	//   23   45:iconst_4        
	//   24   46:newarray        int[]
	//   25   48:putfield        #338 <Field int[] mMaxDescent>
		}
		int ai[] = mMaxAscent;
	//   26   51:aload_0         
	//   27   52:getfield        #336 <Field int[] mMaxAscent>
	//   28   55:astore          27
		Object obj = ((Object) (mMaxDescent));
	//   29   57:aload_0         
	//   30   58:getfield        #338 <Field int[] mMaxDescent>
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
		boolean flag4 = mBaselineAligned;
	//   64  103:aload_0         
	//   65  104:getfield        #45  <Field boolean mBaselineAligned>
	//   66  107:istore          23
		boolean flag5 = mUseLargestChild;
	//   67  109:aload_0         
	//   68  110:getfield        #109 <Field boolean mUseLargestChild>
	//   69  113:istore          24
		boolean flag2;
		if(l7 == 0x40000000)
	//*  70  115:iload           21
	//*  71  117:ldc1            #144 <Int 0x40000000>
	//*  72  119:icmpne          128
			flag2 = true;
	//   73  122:iconst_1        
	//   74  123:istore          14
		else
	//*  75  125:goto            131
			flag2 = false;
	//   76  128:iconst_0        
	//   77  129:istore          14
		float f = 0.0F;
	//   78  131:fconst_0        
	//   79  132:fstore_3        
		int i1 = 0;
	//   80  133:iconst_0        
	//   81  134:istore          7
		int k1 = 0;
	//   82  136:iconst_0        
	//   83  137:istore          10
		int k2 = 0;
	//   84  139:iconst_0        
	//   85  140:istore          13
		int l = 0;
	//   86  142:iconst_0        
	//   87  143:istore          6
		int j1 = 0;
	//   88  145:iconst_0        
	//   89  146:istore          9
		boolean flag1 = false;
	//   90  148:iconst_0        
	//   91  149:istore          11
		int j2 = 0;
	//   92  151:iconst_0        
	//   93  152:istore          12
		int k = 1;
	//   94  154:iconst_1        
	//   95  155:istore          5
		boolean flag = false;
	//   96  157:iconst_0        
	//   97  158:istore          8
		for(; i1 < i3; i1++)
	//*  98  160:iload           7
	//*  99  162:iload           15
	//* 100  164:icmpge          847
		{
			View view = getVirtualChildAt(i1);
	//  101  167:aload_0         
	//  102  168:iload           7
	//  103  170:invokevirtual   #153 <Method View getVirtualChildAt(int)>
	//  104  173:astore          26
			if(view == null)
	//* 105  175:aload           26
	//* 106  177:ifnonnull       198
			{
				mTotalLength = mTotalLength + measureNullChild(i1);
	//  107  180:aload_0         
	//  108  181:aload_0         
	//  109  182:getfield        #310 <Field int mTotalLength>
	//  110  185:aload_0         
	//  111  186:iload           7
	//  112  188:invokevirtual   #353 <Method int measureNullChild(int)>
	//  113  191:iadd            
	//  114  192:putfield        #310 <Field int mTotalLength>
				continue;
	//  115  195:goto            838
			}
			if(view.getVisibility() == 8)
	//* 116  198:aload           26
	//* 117  200:invokevirtual   #158 <Method int View.getVisibility()>
	//* 118  203:bipush          8
	//* 119  205:icmpne          224
			{
				i1 += getChildrenSkipCount(view, i1);
	//  120  208:iload           7
	//  121  210:aload_0         
	//  122  211:aload           26
	//  123  213:iload           7
	//  124  215:invokevirtual   #364 <Method int getChildrenSkipCount(View, int)>
	//  125  218:iadd            
	//  126  219:istore          7
				continue;
	//  127  221:goto            838
			}
			if(hasDividerBeforeChildAt(i1))
	//* 128  224:aload_0         
	//* 129  225:iload           7
	//* 130  227:invokevirtual   #200 <Method boolean hasDividerBeforeChildAt(int)>
	//* 131  230:ifeq            246
				mTotalLength = mTotalLength + mDividerWidth;
	//  132  233:aload_0         
	//  133  234:aload_0         
	//  134  235:getfield        #310 <Field int mTotalLength>
	//  135  238:aload_0         
	//  136  239:getfield        #214 <Field int mDividerWidth>
	//  137  242:iadd            
	//  138  243:putfield        #310 <Field int mTotalLength>
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//  139  246:aload           26
	//  140  248:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  141  251:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  142  254:astore          28
			f += layoutparams.weight;
	//  143  256:fload_3         
	//  144  257:aload           28
	//  145  259:getfield        #374 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  146  262:fadd            
	//  147  263:fstore_3        
			if(l7 == 0x40000000 && layoutparams.width == 0 && layoutparams.weight > 0.0F)
	//* 148  264:iload           21
	//* 149  266:ldc1            #144 <Int 0x40000000>
	//* 150  268:icmpne          376
	//* 151  271:aload           28
	//* 152  273:getfield        #168 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 153  276:ifne            376
	//* 154  279:aload           28
	//* 155  281:getfield        #374 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 156  284:fconst_0        
	//* 157  285:fcmpl           
	//* 158  286:ifle            376
			{
				if(flag2)
	//* 159  289:iload           14
	//* 160  291:ifeq            317
				{
					mTotalLength = mTotalLength + (layoutparams.leftMargin + layoutparams.rightMargin);
	//  161  294:aload_0         
	//  162  295:aload_0         
	//  163  296:getfield        #310 <Field int mTotalLength>
	//  164  299:aload           28
	//  165  301:getfield        #212 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  166  304:aload           28
	//  167  306:getfield        #206 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  168  309:iadd            
	//  169  310:iadd            
	//  170  311:putfield        #310 <Field int mTotalLength>
				} else
	//* 171  314:goto            346
				{
					int l3 = mTotalLength;
	//  172  317:aload_0         
	//  173  318:getfield        #310 <Field int mTotalLength>
	//  174  321:istore          16
					mTotalLength = Math.max(l3, layoutparams.leftMargin + l3 + layoutparams.rightMargin);
	//  175  323:aload_0         
	//  176  324:iload           16
	//  177  326:aload           28
	//  178  328:getfield        #212 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  179  331:iload           16
	//  180  333:iadd            
	//  181  334:aload           28
	//  182  336:getfield        #206 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  183  339:iadd            
	//  184  340:invokestatic    #379 <Method int Math.max(int, int)>
	//  185  343:putfield        #310 <Field int mTotalLength>
				}
				if(flag4)
	//* 186  346:iload           23
	//* 187  348:ifeq            370
				{
					int i4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//  188  351:iconst_0        
	//  189  352:iconst_0        
	//  190  353:invokestatic    #149 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  191  356:istore          16
					view.measure(i4, i4);
	//  192  358:aload           26
	//  193  360:iload           16
	//  194  362:iload           16
	//  195  364:invokevirtual   #382 <Method void View.measure(int, int)>
				} else
	//* 196  367:goto            559
				{
					flag1 = true;
	//  197  370:iconst_1        
	//  198  371:istore          11
				}
			} else
	//* 199  373:goto            559
			{
				int j4;
				if(layoutparams.width == 0 && layoutparams.weight > 0.0F)
	//* 200  376:aload           28
	//* 201  378:getfield        #168 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 202  381:ifne            407
	//* 203  384:aload           28
	//* 204  386:getfield        #374 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 205  389:fconst_0        
	//* 206  390:fcmpl           
	//* 207  391:ifle            407
				{
					layoutparams.width = -2;
	//  208  394:aload           28
	//  209  396:bipush          -2
	//  210  398:putfield        #168 <Field int LinearLayoutCompat$LayoutParams.width>
					j4 = 0;
	//  211  401:iconst_0        
	//  212  402:istore          16
				} else
	//* 213  404:goto            412
				{
					j4 = 0x80000000;
	//  214  407:ldc2            #383 <Int 0x80000000>
	//  215  410:istore          16
				}
				int k5;
				if(f == 0.0F)
	//* 216  412:fload_3         
	//* 217  413:fconst_0        
	//* 218  414:fcmpl           
	//* 219  415:ifne            427
					k5 = mTotalLength;
	//  220  418:aload_0         
	//  221  419:getfield        #310 <Field int mTotalLength>
	//  222  422:istore          17
				else
	//* 223  424:goto            430
					k5 = 0;
	//  224  427:iconst_0        
	//  225  428:istore          17
				measureChildBeforeLayout(view, i1, i, k5, j, 0);
	//  226  430:aload_0         
	//  227  431:aload           26
	//  228  433:iload           7
	//  229  435:iload_1         
	//  230  436:iload           17
	//  231  438:iload_2         
	//  232  439:iconst_0        
	//  233  440:invokevirtual   #385 <Method void measureChildBeforeLayout(View, int, int, int, int, int)>
				if(j4 != 0x80000000)
	//* 234  443:iload           16
	//* 235  445:ldc2            #383 <Int 0x80000000>
	//* 236  448:icmpeq          458
					layoutparams.width = j4;
	//  237  451:aload           28
	//  238  453:iload           16
	//  239  455:putfield        #168 <Field int LinearLayoutCompat$LayoutParams.width>
				j4 = view.getMeasuredWidth();
	//  240  458:aload           26
	//  241  460:invokevirtual   #171 <Method int View.getMeasuredWidth()>
	//  242  463:istore          16
				if(flag2)
	//* 243  465:iload           14
	//* 244  467:ifeq            503
				{
					mTotalLength = mTotalLength + (layoutparams.leftMargin + j4 + layoutparams.rightMargin + getNextLocationOffset(view));
	//  245  470:aload_0         
	//  246  471:aload_0         
	//  247  472:getfield        #310 <Field int mTotalLength>
	//  248  475:aload           28
	//  249  477:getfield        #212 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  250  480:iload           16
	//  251  482:iadd            
	//  252  483:aload           28
	//  253  485:getfield        #206 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  254  488:iadd            
	//  255  489:aload_0         
	//  256  490:aload           26
	//  257  492:invokevirtual   #362 <Method int getNextLocationOffset(View)>
	//  258  495:iadd            
	//  259  496:iadd            
	//  260  497:putfield        #310 <Field int mTotalLength>
				} else
	//* 261  500:goto            542
				{
					int l5 = mTotalLength;
	//  262  503:aload_0         
	//  263  504:getfield        #310 <Field int mTotalLength>
	//  264  507:istore          17
					mTotalLength = Math.max(l5, l5 + j4 + layoutparams.leftMargin + layoutparams.rightMargin + getNextLocationOffset(view));
	//  265  509:aload_0         
	//  266  510:iload           17
	//  267  512:iload           17
	//  268  514:iload           16
	//  269  516:iadd            
	//  270  517:aload           28
	//  271  519:getfield        #212 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  272  522:iadd            
	//  273  523:aload           28
	//  274  525:getfield        #206 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  275  528:iadd            
	//  276  529:aload_0         
	//  277  530:aload           26
	//  278  532:invokevirtual   #362 <Method int getNextLocationOffset(View)>
	//  279  535:iadd            
	//  280  536:invokestatic    #379 <Method int Math.max(int, int)>
	//  281  539:putfield        #310 <Field int mTotalLength>
				}
				if(flag5)
	//* 282  542:iload           24
	//* 283  544:ifeq            559
					k1 = Math.max(j4, k1);
	//  284  547:iload           16
	//  285  549:iload           10
	//  286  551:invokestatic    #379 <Method int Math.max(int, int)>
	//  287  554:istore          10
			}
	//* 288  556:goto            559
			int k4 = i1;
	//  289  559:iload           7
	//  290  561:istore          16
			if(k7 != 0x40000000 && layoutparams.height == -1)
	//* 291  563:iload           20
	//* 292  565:ldc1            #144 <Int 0x40000000>
	//* 293  567:icmpeq          588
	//* 294  570:aload           28
	//* 295  572:getfield        #165 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 296  575:iconst_m1       
	//* 297  576:icmpne          588
			{
				i1 = 1;
	//  298  579:iconst_1        
	//  299  580:istore          7
				flag = true;
	//  300  582:iconst_1        
	//  301  583:istore          8
			} else
	//* 302  585:goto            591
			{
				i1 = 0;
	//  303  588:iconst_0        
	//  304  589:istore          7
			}
			int i6 = layoutparams.topMargin + layoutparams.bottomMargin;
	//  305  591:aload           28
	//  306  593:getfield        #234 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  307  596:aload           28
	//  308  598:getfield        #251 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  309  601:iadd            
	//  310  602:istore          17
			int l6 = view.getMeasuredHeight() + i6;
	//  311  604:aload           26
	//  312  606:invokevirtual   #178 <Method int View.getMeasuredHeight()>
	//  313  609:iload           17
	//  314  611:iadd            
	//  315  612:istore          18
			int j7 = View.combineMeasuredStates(j2, view.getMeasuredState());
	//  316  614:iload           12
	//  317  616:aload           26
	//  318  618:invokevirtual   #388 <Method int View.getMeasuredState()>
	//  319  621:invokestatic    #391 <Method int View.combineMeasuredStates(int, int)>
	//  320  624:istore          19
			if(flag4)
	//* 321  626:iload           23
	//* 322  628:ifeq            721
			{
				int i8 = view.getBaseline();
	//  323  631:aload           26
	//  324  633:invokevirtual   #299 <Method int View.getBaseline()>
	//  325  636:istore          22
				if(i8 != -1)
	//* 326  638:iload           22
	//* 327  640:iconst_m1       
	//* 328  641:icmpeq          718
				{
					if(layoutparams.gravity < 0)
	//* 329  644:aload           28
	//* 330  646:getfield        #356 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//* 331  649:ifge            661
						j2 = mGravity;
	//  332  652:aload_0         
	//  333  653:getfield        #52  <Field int mGravity>
	//  334  656:istore          12
					else
	//* 335  658:goto            668
						j2 = layoutparams.gravity;
	//  336  661:aload           28
	//  337  663:getfield        #356 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//  338  666:istore          12
					j2 = ((j2 & 0x70) >> 4 & -2) >> 1;
	//  339  668:iload           12
	//  340  670:bipush          112
	//  341  672:iand            
	//  342  673:iconst_4        
	//  343  674:ishr            
	//  344  675:bipush          -2
	//  345  677:iand            
	//  346  678:iconst_1        
	//  347  679:ishr            
	//  348  680:istore          12
					ai[j2] = Math.max(ai[j2], i8);
	//  349  682:aload           27
	//  350  684:iload           12
	//  351  686:aload           27
	//  352  688:iload           12
	//  353  690:iaload          
	//  354  691:iload           22
	//  355  693:invokestatic    #379 <Method int Math.max(int, int)>
	//  356  696:iastore         
					obj[j2] = Math.max(obj[j2], l6 - i8);
	//  357  697:aload           25
	//  358  699:iload           12
	//  359  701:aload           25
	//  360  703:iload           12
	//  361  705:iaload          
	//  362  706:iload           18
	//  363  708:iload           22
	//  364  710:isub            
	//  365  711:invokestatic    #379 <Method int Math.max(int, int)>
	//  366  714:iastore         
				}
			}
	//* 367  715:goto            721
	//* 368  718:goto            721
			k2 = Math.max(k2, l6);
	//  369  721:iload           13
	//  370  723:iload           18
	//  371  725:invokestatic    #379 <Method int Math.max(int, int)>
	//  372  728:istore          13
			if(k && layoutparams.height == -1)
	//* 373  730:iload           5
	//* 374  732:ifeq            750
	//* 375  735:aload           28
	//* 376  737:getfield        #165 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 377  740:iconst_m1       
	//* 378  741:icmpne          750
				k = 1;
	//  379  744:iconst_1        
	//  380  745:istore          5
			else
	//* 381  747:goto            753
				k = 0;
	//  382  750:iconst_0        
	//  383  751:istore          5
			if(layoutparams.weight > 0.0F)
	//* 384  753:aload           28
	//* 385  755:getfield        #374 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 386  758:fconst_0        
	//* 387  759:fcmpl           
	//* 388  760:ifle            787
			{
				if(i1 == 0)
	//* 389  763:iload           7
	//* 390  765:ifeq            771
	//* 391  768:goto            775
					i6 = l6;
	//  392  771:iload           18
	//  393  773:istore          17
				i1 = Math.max(j1, i6);
	//  394  775:iload           9
	//  395  777:iload           17
	//  396  779:invokestatic    #379 <Method int Math.max(int, int)>
	//  397  782:istore          7
			} else
	//* 398  784:goto            809
			{
				if(i1 != 0)
	//* 399  787:iload           7
	//* 400  789:ifeq            796
					l6 = i6;
	//  401  792:iload           17
	//  402  794:istore          18
				l = Math.max(l, l6);
	//  403  796:iload           6
	//  404  798:iload           18
	//  405  800:invokestatic    #379 <Method int Math.max(int, int)>
	//  406  803:istore          6
				i1 = j1;
	//  407  805:iload           9
	//  408  807:istore          7
			}
			j1 = getChildrenSkipCount(view, k4);
	//  409  809:aload_0         
	//  410  810:aload           26
	//  411  812:iload           16
	//  412  814:invokevirtual   #364 <Method int getChildrenSkipCount(View, int)>
	//  413  817:istore          9
			j2 = j7;
	//  414  819:iload           19
	//  415  821:istore          12
			k4 = j1 + k4;
	//  416  823:iload           9
	//  417  825:iload           16
	//  418  827:iadd            
	//  419  828:istore          16
			j1 = i1;
	//  420  830:iload           7
	//  421  832:istore          9
			i1 = k4;
	//  422  834:iload           16
	//  423  836:istore          7
		}

	//  424  838:iload           7
	//  425  840:iconst_1        
	//  426  841:iadd            
	//  427  842:istore          7
	//* 428  844:goto            160
		i1 = k2;
	//  429  847:iload           13
	//  430  849:istore          7
		if(mTotalLength > 0 && hasDividerBeforeChildAt(i3))
	//* 431  851:aload_0         
	//* 432  852:getfield        #310 <Field int mTotalLength>
	//* 433  855:ifle            880
	//* 434  858:aload_0         
	//* 435  859:iload           15
	//* 436  861:invokevirtual   #200 <Method boolean hasDividerBeforeChildAt(int)>
	//* 437  864:ifeq            880
			mTotalLength = mTotalLength + mDividerWidth;
	//  438  867:aload_0         
	//  439  868:aload_0         
	//  440  869:getfield        #310 <Field int mTotalLength>
	//  441  872:aload_0         
	//  442  873:getfield        #214 <Field int mDividerWidth>
	//  443  876:iadd            
	//  444  877:putfield        #310 <Field int mTotalLength>
		if(ai[1] != -1 || ai[0] != -1 || ai[2] != -1 || ai[3] != -1)
	//* 445  880:aload           27
	//* 446  882:iconst_1        
	//* 447  883:iaload          
	//* 448  884:iconst_m1       
	//* 449  885:icmpne          918
	//* 450  888:aload           27
	//* 451  890:iconst_0        
	//* 452  891:iaload          
	//* 453  892:iconst_m1       
	//* 454  893:icmpne          918
	//* 455  896:aload           27
	//* 456  898:iconst_2        
	//* 457  899:iaload          
	//* 458  900:iconst_m1       
	//* 459  901:icmpne          918
	//* 460  904:aload           27
	//* 461  906:iconst_3        
	//* 462  907:iaload          
	//* 463  908:iconst_m1       
	//* 464  909:icmpeq          915
	//* 465  912:goto            918
	//* 466  915:goto            976
			i1 = Math.max(i1, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(obj[3], Math.max(obj[0], Math.max(obj[1], obj[2]))));
	//  467  918:iload           7
	//  468  920:aload           27
	//  469  922:iconst_3        
	//  470  923:iaload          
	//  471  924:aload           27
	//  472  926:iconst_0        
	//  473  927:iaload          
	//  474  928:aload           27
	//  475  930:iconst_1        
	//  476  931:iaload          
	//  477  932:aload           27
	//  478  934:iconst_2        
	//  479  935:iaload          
	//  480  936:invokestatic    #379 <Method int Math.max(int, int)>
	//  481  939:invokestatic    #379 <Method int Math.max(int, int)>
	//  482  942:invokestatic    #379 <Method int Math.max(int, int)>
	//  483  945:aload           25
	//  484  947:iconst_3        
	//  485  948:iaload          
	//  486  949:aload           25
	//  487  951:iconst_0        
	//  488  952:iaload          
	//  489  953:aload           25
	//  490  955:iconst_1        
	//  491  956:iaload          
	//  492  957:aload           25
	//  493  959:iconst_2        
	//  494  960:iaload          
	//  495  961:invokestatic    #379 <Method int Math.max(int, int)>
	//  496  964:invokestatic    #379 <Method int Math.max(int, int)>
	//  497  967:invokestatic    #379 <Method int Math.max(int, int)>
	//  498  970:iadd            
	//  499  971:invokestatic    #379 <Method int Math.max(int, int)>
	//  500  974:istore          7
		if(flag5 && (l7 == 0x80000000 || l7 == 0))
	//* 501  976:iload           24
	//* 502  978:ifeq            1165
	//* 503  981:iload           21
	//* 504  983:ldc2            #383 <Int 0x80000000>
	//* 505  986:icmpeq          994
	//* 506  989:iload           21
	//* 507  991:ifne            1165
		{
			mTotalLength = 0;
	//  508  994:aload_0         
	//  509  995:iconst_0        
	//  510  996:putfield        #310 <Field int mTotalLength>
			for(k2 = 0; k2 < i3; k2++)
	//* 511  999:iconst_0        
	//* 512 1000:istore          13
	//* 513 1002:iload           13
	//* 514 1004:iload           15
	//* 515 1006:icmpge          1162
			{
				View view1 = getVirtualChildAt(k2);
	//  516 1009:aload_0         
	//  517 1010:iload           13
	//  518 1012:invokevirtual   #153 <Method View getVirtualChildAt(int)>
	//  519 1015:astore          26
				if(view1 == null)
	//* 520 1017:aload           26
	//* 521 1019:ifnonnull       1040
				{
					mTotalLength = mTotalLength + measureNullChild(k2);
	//  522 1022:aload_0         
	//  523 1023:aload_0         
	//  524 1024:getfield        #310 <Field int mTotalLength>
	//  525 1027:aload_0         
	//  526 1028:iload           13
	//  527 1030:invokevirtual   #353 <Method int measureNullChild(int)>
	//  528 1033:iadd            
	//  529 1034:putfield        #310 <Field int mTotalLength>
					continue;
	//  530 1037:goto            1153
				}
				if(view1.getVisibility() == 8)
	//* 531 1040:aload           26
	//* 532 1042:invokevirtual   #158 <Method int View.getVisibility()>
	//* 533 1045:bipush          8
	//* 534 1047:icmpne          1066
				{
					k2 += getChildrenSkipCount(view1, k2);
	//  535 1050:iload           13
	//  536 1052:aload_0         
	//  537 1053:aload           26
	//  538 1055:iload           13
	//  539 1057:invokevirtual   #364 <Method int getChildrenSkipCount(View, int)>
	//  540 1060:iadd            
	//  541 1061:istore          13
					continue;
	//  542 1063:goto            1153
				}
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  543 1066:aload           26
	//  544 1068:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  545 1071:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  546 1074:astore          28
				if(flag2)
	//* 547 1076:iload           14
	//* 548 1078:ifeq            1114
				{
					mTotalLength = mTotalLength + (layoutparams1.leftMargin + k1 + layoutparams1.rightMargin + getNextLocationOffset(view1));
	//  549 1081:aload_0         
	//  550 1082:aload_0         
	//  551 1083:getfield        #310 <Field int mTotalLength>
	//  552 1086:aload           28
	//  553 1088:getfield        #212 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  554 1091:iload           10
	//  555 1093:iadd            
	//  556 1094:aload           28
	//  557 1096:getfield        #206 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  558 1099:iadd            
	//  559 1100:aload_0         
	//  560 1101:aload           26
	//  561 1103:invokevirtual   #362 <Method int getNextLocationOffset(View)>
	//  562 1106:iadd            
	//  563 1107:iadd            
	//  564 1108:putfield        #310 <Field int mTotalLength>
				} else
	//* 565 1111:goto            1153
				{
					int l4 = mTotalLength;
	//  566 1114:aload_0         
	//  567 1115:getfield        #310 <Field int mTotalLength>
	//  568 1118:istore          16
					mTotalLength = Math.max(l4, l4 + k1 + layoutparams1.leftMargin + layoutparams1.rightMargin + getNextLocationOffset(view1));
	//  569 1120:aload_0         
	//  570 1121:iload           16
	//  571 1123:iload           16
	//  572 1125:iload           10
	//  573 1127:iadd            
	//  574 1128:aload           28
	//  575 1130:getfield        #212 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  576 1133:iadd            
	//  577 1134:aload           28
	//  578 1136:getfield        #206 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  579 1139:iadd            
	//  580 1140:aload_0         
	//  581 1141:aload           26
	//  582 1143:invokevirtual   #362 <Method int getNextLocationOffset(View)>
	//  583 1146:iadd            
	//  584 1147:invokestatic    #379 <Method int Math.max(int, int)>
	//  585 1150:putfield        #310 <Field int mTotalLength>
				}
			}

	//  586 1153:iload           13
	//  587 1155:iconst_1        
	//  588 1156:iadd            
	//  589 1157:istore          13
		}
	//* 590 1159:goto            1002
	//* 591 1162:goto            1165
		mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
	//  592 1165:aload_0         
	//  593 1166:aload_0         
	//  594 1167:getfield        #310 <Field int mTotalLength>
	//  595 1170:aload_0         
	//  596 1171:invokevirtual   #221 <Method int getPaddingLeft()>
	//  597 1174:aload_0         
	//  598 1175:invokevirtual   #227 <Method int getPaddingRight()>
	//  599 1178:iadd            
	//  600 1179:iadd            
	//  601 1180:putfield        #310 <Field int mTotalLength>
		int i7 = View.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumWidth()), i, 0);
	//  602 1183:aload_0         
	//  603 1184:getfield        #310 <Field int mTotalLength>
	//  604 1187:aload_0         
	//  605 1188:invokevirtual   #394 <Method int getSuggestedMinimumWidth()>
	//  606 1191:invokestatic    #379 <Method int Math.max(int, int)>
	//  607 1194:iload_1         
	//  608 1195:iconst_0        
	//  609 1196:invokestatic    #398 <Method int View.resolveSizeAndState(int, int, int)>
	//  610 1199:istore          18
		k2 = (0xffffff & i7) - mTotalLength;
	//  611 1201:ldc2            #399 <Int 0xffffff>
	//  612 1204:iload           18
	//  613 1206:iand            
	//  614 1207:aload_0         
	//  615 1208:getfield        #310 <Field int mTotalLength>
	//  616 1211:isub            
	//  617 1212:istore          13
		if(!flag1 && (k2 == 0 || f <= 0.0F))
	//* 618 1214:iload           11
	//* 619 1216:ifne            1352
	//* 620 1219:iload           13
	//* 621 1221:ifeq            1233
	//* 622 1224:fload_3         
	//* 623 1225:fconst_0        
	//* 624 1226:fcmpl           
	//* 625 1227:ifle            1233
	//* 626 1230:goto            1352
		{
			int l1 = Math.max(l, j1);
	//  627 1233:iload           6
	//  628 1235:iload           9
	//  629 1237:invokestatic    #379 <Method int Math.max(int, int)>
	//  630 1240:istore          11
			if(flag5 && l7 != 0x40000000)
	//* 631 1242:iload           24
	//* 632 1244:ifeq            1337
	//* 633 1247:iload           21
	//* 634 1249:ldc1            #144 <Int 0x40000000>
	//* 635 1251:icmpeq          1337
				for(l = 0; l < i3; l++)
	//* 636 1254:iconst_0        
	//* 637 1255:istore          6
	//* 638 1257:iload           6
	//* 639 1259:iload           15
	//* 640 1261:icmpge          1337
				{
					obj = ((Object) (getVirtualChildAt(l)));
	//  641 1264:aload_0         
	//  642 1265:iload           6
	//  643 1267:invokevirtual   #153 <Method View getVirtualChildAt(int)>
	//  644 1270:astore          25
					if(obj != null && ((View) (obj)).getVisibility() != 8 && ((LayoutParams)((View) (obj)).getLayoutParams()).weight > 0.0F)
	//* 645 1272:aload           25
	//* 646 1274:ifnull          1328
	//* 647 1277:aload           25
	//* 648 1279:invokevirtual   #158 <Method int View.getVisibility()>
	//* 649 1282:bipush          8
	//* 650 1284:icmpne          1290
	//* 651 1287:goto            1328
	//* 652 1290:aload           25
	//* 653 1292:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 654 1295:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//* 655 1298:getfield        #374 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 656 1301:fconst_0        
	//* 657 1302:fcmpl           
	//* 658 1303:ifle            1328
						((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(((View) (obj)).getMeasuredHeight(), 0x40000000));
	//  659 1306:aload           25
	//  660 1308:iload           10
	//  661 1310:ldc1            #144 <Int 0x40000000>
	//  662 1312:invokestatic    #149 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  663 1315:aload           25
	//  664 1317:invokevirtual   #178 <Method int View.getMeasuredHeight()>
	//  665 1320:ldc1            #144 <Int 0x40000000>
	//  666 1322:invokestatic    #149 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  667 1325:invokevirtual   #382 <Method void View.measure(int, int)>
				}

	//  668 1328:iload           6
	//  669 1330:iconst_1        
	//  670 1331:iadd            
	//  671 1332:istore          6
	//* 672 1334:goto            1257
			j1 = i3;
	//  673 1337:iload           15
	//  674 1339:istore          9
			l = l1;
	//  675 1341:iload           11
	//  676 1343:istore          6
			k1 = k;
	//  677 1345:iload           5
	//  678 1347:istore          10
		} else
	//* 679 1349:goto            2101
		{
			float f1 = mWeightSum;
	//  680 1352:aload_0         
	//  681 1353:getfield        #101 <Field float mWeightSum>
	//  682 1356:fstore          4
			if(f1 > 0.0F)
	//* 683 1358:fload           4
	//* 684 1360:fconst_0        
	//* 685 1361:fcmpl           
	//* 686 1362:ifle            1368
				f = f1;
	//  687 1365:fload           4
	//  688 1367:fstore_3        
			ai[3] = -1;
	//  689 1368:aload           27
	//  690 1370:iconst_3        
	//  691 1371:iconst_m1       
	//  692 1372:iastore         
			ai[2] = -1;
	//  693 1373:aload           27
	//  694 1375:iconst_2        
	//  695 1376:iconst_m1       
	//  696 1377:iastore         
			ai[1] = -1;
	//  697 1378:aload           27
	//  698 1380:iconst_1        
	//  699 1381:iconst_m1       
	//  700 1382:iastore         
			ai[0] = -1;
	//  701 1383:aload           27
	//  702 1385:iconst_0        
	//  703 1386:iconst_m1       
	//  704 1387:iastore         
			obj[3] = -1;
	//  705 1388:aload           25
	//  706 1390:iconst_3        
	//  707 1391:iconst_m1       
	//  708 1392:iastore         
			obj[2] = -1;
	//  709 1393:aload           25
	//  710 1395:iconst_2        
	//  711 1396:iconst_m1       
	//  712 1397:iastore         
			obj[1] = -1;
	//  713 1398:aload           25
	//  714 1400:iconst_1        
	//  715 1401:iconst_m1       
	//  716 1402:iastore         
			obj[0] = -1;
	//  717 1403:aload           25
	//  718 1405:iconst_0        
	//  719 1406:iconst_m1       
	//  720 1407:iastore         
			mTotalLength = 0;
	//  721 1408:aload_0         
	//  722 1409:iconst_0        
	//  723 1410:putfield        #310 <Field int mTotalLength>
			int i2 = -1;
	//  724 1413:iconst_m1       
	//  725 1414:istore          11
			boolean flag3 = false;
	//  726 1416:iconst_0        
	//  727 1417:istore          16
			j1 = k;
	//  728 1419:iload           5
	//  729 1421:istore          9
			i1 = i3;
	//  730 1423:iload           15
	//  731 1425:istore          7
			k1 = l;
	//  732 1427:iload           6
	//  733 1429:istore          10
			l = j2;
	//  734 1431:iload           12
	//  735 1433:istore          6
			k = k2;
	//  736 1435:iload           13
	//  737 1437:istore          5
			for(int l2 = ((int) (flag3)); l2 < i1; l2++)
	//* 738 1439:iload           16
	//* 739 1441:istore          13
	//* 740 1443:iload           13
	//* 741 1445:iload           7
	//* 742 1447:icmpge          1963
			{
				View view2 = getVirtualChildAt(l2);
	//  743 1450:aload_0         
	//  744 1451:iload           13
	//  745 1453:invokevirtual   #153 <Method View getVirtualChildAt(int)>
	//  746 1456:astore          26
				if(view2 == null || view2.getVisibility() == 8)
	//* 747 1458:aload           26
	//* 748 1460:ifnull          1954
	//* 749 1463:aload           26
	//* 750 1465:invokevirtual   #158 <Method int View.getVisibility()>
	//* 751 1468:bipush          8
	//* 752 1470:icmpne          1476
					continue;
	//  753 1473:goto            1954
				LayoutParams layoutparams2 = (LayoutParams)view2.getLayoutParams();
	//  754 1476:aload           26
	//  755 1478:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  756 1481:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  757 1484:astore          28
				float f2 = layoutparams2.weight;
	//  758 1486:aload           28
	//  759 1488:getfield        #374 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  760 1491:fstore          4
				if(f2 > 0.0F)
	//* 761 1493:fload           4
	//* 762 1495:fconst_0        
	//* 763 1496:fcmpl           
	//* 764 1497:ifle            1660
				{
					int j3 = (int)(((float)k * f2) / f);
	//  765 1500:iload           5
	//  766 1502:i2f             
	//  767 1503:fload           4
	//  768 1505:fmul            
	//  769 1506:fload_3         
	//  770 1507:fdiv            
	//  771 1508:f2i             
	//  772 1509:istore          15
					int j6 = getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom() + layoutparams2.topMargin + layoutparams2.bottomMargin, layoutparams2.height);
	//  773 1511:iload_2         
	//  774 1512:aload_0         
	//  775 1513:invokevirtual   #264 <Method int getPaddingTop()>
	//  776 1516:aload_0         
	//  777 1517:invokevirtual   #245 <Method int getPaddingBottom()>
	//  778 1520:iadd            
	//  779 1521:aload           28
	//  780 1523:getfield        #234 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  781 1526:iadd            
	//  782 1527:aload           28
	//  783 1529:getfield        #251 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  784 1532:iadd            
	//  785 1533:aload           28
	//  786 1535:getfield        #165 <Field int LinearLayoutCompat$LayoutParams.height>
	//  787 1538:invokestatic    #402 <Method int getChildMeasureSpec(int, int, int)>
	//  788 1541:istore          17
					if(layoutparams2.width == 0 && l7 == 0x40000000)
	//* 789 1543:aload           28
	//* 790 1545:getfield        #168 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 791 1548:ifne            1593
	//* 792 1551:iload           21
	//* 793 1553:ldc1            #144 <Int 0x40000000>
	//* 794 1555:icmpeq          1561
	//* 795 1558:goto            1593
					{
						if(j3 > 0)
	//* 796 1561:iload           15
	//* 797 1563:ifle            1573
							j2 = j3;
	//  798 1566:iload           15
	//  799 1568:istore          12
						else
	//* 800 1570:goto            1576
							j2 = 0;
	//  801 1573:iconst_0        
	//  802 1574:istore          12
						view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000), j6);
	//  803 1576:aload           26
	//  804 1578:iload           12
	//  805 1580:ldc1            #144 <Int 0x40000000>
	//  806 1582:invokestatic    #149 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  807 1585:iload           17
	//  808 1587:invokevirtual   #382 <Method void View.measure(int, int)>
					} else
	//* 809 1590:goto            1629
					{
						int i5 = view2.getMeasuredWidth() + j3;
	//  810 1593:aload           26
	//  811 1595:invokevirtual   #171 <Method int View.getMeasuredWidth()>
	//  812 1598:iload           15
	//  813 1600:iadd            
	//  814 1601:istore          16
						j2 = i5;
	//  815 1603:iload           16
	//  816 1605:istore          12
						if(i5 < 0)
	//* 817 1607:iload           16
	//* 818 1609:ifge            1615
							j2 = 0;
	//  819 1612:iconst_0        
	//  820 1613:istore          12
						view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000), j6);
	//  821 1615:aload           26
	//  822 1617:iload           12
	//  823 1619:ldc1            #144 <Int 0x40000000>
	//  824 1621:invokestatic    #149 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  825 1624:iload           17
	//  826 1626:invokevirtual   #382 <Method void View.measure(int, int)>
					}
					l = View.combineMeasuredStates(l, view2.getMeasuredState() & 0xff000000);
	//  827 1629:iload           6
	//  828 1631:aload           26
	//  829 1633:invokevirtual   #388 <Method int View.getMeasuredState()>
	//  830 1636:ldc2            #403 <Int 0xff000000>
	//  831 1639:iand            
	//  832 1640:invokestatic    #391 <Method int View.combineMeasuredStates(int, int)>
	//  833 1643:istore          6
					f -= f2;
	//  834 1645:fload_3         
	//  835 1646:fload           4
	//  836 1648:fsub            
	//  837 1649:fstore_3        
					k -= j3;
	//  838 1650:iload           5
	//  839 1652:iload           15
	//  840 1654:isub            
	//  841 1655:istore          5
				}
	//* 842 1657:goto            1660
				if(flag2)
	//* 843 1660:iload           14
	//* 844 1662:ifeq            1701
				{
					mTotalLength = mTotalLength + (view2.getMeasuredWidth() + layoutparams2.leftMargin + layoutparams2.rightMargin + getNextLocationOffset(view2));
	//  845 1665:aload_0         
	//  846 1666:aload_0         
	//  847 1667:getfield        #310 <Field int mTotalLength>
	//  848 1670:aload           26
	//  849 1672:invokevirtual   #171 <Method int View.getMeasuredWidth()>
	//  850 1675:aload           28
	//  851 1677:getfield        #212 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  852 1680:iadd            
	//  853 1681:aload           28
	//  854 1683:getfield        #206 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  855 1686:iadd            
	//  856 1687:aload_0         
	//  857 1688:aload           26
	//  858 1690:invokevirtual   #362 <Method int getNextLocationOffset(View)>
	//  859 1693:iadd            
	//  860 1694:iadd            
	//  861 1695:putfield        #310 <Field int mTotalLength>
				} else
	//* 862 1698:goto            1743
				{
					j2 = mTotalLength;
	//  863 1701:aload_0         
	//  864 1702:getfield        #310 <Field int mTotalLength>
	//  865 1705:istore          12
					mTotalLength = Math.max(j2, view2.getMeasuredWidth() + j2 + layoutparams2.leftMargin + layoutparams2.rightMargin + getNextLocationOffset(view2));
	//  866 1707:aload_0         
	//  867 1708:iload           12
	//  868 1710:aload           26
	//  869 1712:invokevirtual   #171 <Method int View.getMeasuredWidth()>
	//  870 1715:iload           12
	//  871 1717:iadd            
	//  872 1718:aload           28
	//  873 1720:getfield        #212 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  874 1723:iadd            
	//  875 1724:aload           28
	//  876 1726:getfield        #206 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  877 1729:iadd            
	//  878 1730:aload_0         
	//  879 1731:aload           26
	//  880 1733:invokevirtual   #362 <Method int getNextLocationOffset(View)>
	//  881 1736:iadd            
	//  882 1737:invokestatic    #379 <Method int Math.max(int, int)>
	//  883 1740:putfield        #310 <Field int mTotalLength>
				}
				if(k7 != 0x40000000 && layoutparams2.height == -1)
	//* 884 1743:iload           20
	//* 885 1745:ldc1            #144 <Int 0x40000000>
	//* 886 1747:icmpeq          1765
	//* 887 1750:aload           28
	//* 888 1752:getfield        #165 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 889 1755:iconst_m1       
	//* 890 1756:icmpne          1765
					j2 = 1;
	//  891 1759:iconst_1        
	//  892 1760:istore          12
				else
	//* 893 1762:goto            1768
					j2 = 0;
	//  894 1765:iconst_0        
	//  895 1766:istore          12
				int k6 = layoutparams2.topMargin + layoutparams2.bottomMargin;
	//  896 1768:aload           28
	//  897 1770:getfield        #234 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  898 1773:aload           28
	//  899 1775:getfield        #251 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  900 1778:iadd            
	//  901 1779:istore          17
				int j5 = view2.getMeasuredHeight() + k6;
	//  902 1781:aload           26
	//  903 1783:invokevirtual   #178 <Method int View.getMeasuredHeight()>
	//  904 1786:iload           17
	//  905 1788:iadd            
	//  906 1789:istore          16
				int k3 = Math.max(i2, j5);
	//  907 1791:iload           11
	//  908 1793:iload           16
	//  909 1795:invokestatic    #379 <Method int Math.max(int, int)>
	//  910 1798:istore          15
				if(j2 != 0)
	//* 911 1800:iload           12
	//* 912 1802:ifeq            1812
					i2 = k6;
	//  913 1805:iload           17
	//  914 1807:istore          11
				else
	//* 915 1809:goto            1816
					i2 = j5;
	//  916 1812:iload           16
	//  917 1814:istore          11
				i2 = Math.max(k1, i2);
	//  918 1816:iload           10
	//  919 1818:iload           11
	//  920 1820:invokestatic    #379 <Method int Math.max(int, int)>
	//  921 1823:istore          11
				if(j1 != 0 && layoutparams2.height == -1)
	//* 922 1825:iload           9
	//* 923 1827:ifeq            1845
	//* 924 1830:aload           28
	//* 925 1832:getfield        #165 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 926 1835:iconst_m1       
	//* 927 1836:icmpne          1845
					j1 = 1;
	//  928 1839:iconst_1        
	//  929 1840:istore          9
				else
	//* 930 1842:goto            1848
					j1 = 0;
	//  931 1845:iconst_0        
	//  932 1846:istore          9
				if(flag4)
	//* 933 1848:iload           23
	//* 934 1850:ifeq            1943
				{
					j2 = view2.getBaseline();
	//  935 1853:aload           26
	//  936 1855:invokevirtual   #299 <Method int View.getBaseline()>
	//  937 1858:istore          12
					if(j2 != -1)
	//* 938 1860:iload           12
	//* 939 1862:iconst_m1       
	//* 940 1863:icmpeq          1940
					{
						if(layoutparams2.gravity < 0)
	//* 941 1866:aload           28
	//* 942 1868:getfield        #356 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//* 943 1871:ifge            1883
							k1 = mGravity;
	//  944 1874:aload_0         
	//  945 1875:getfield        #52  <Field int mGravity>
	//  946 1878:istore          10
						else
	//* 947 1880:goto            1890
							k1 = layoutparams2.gravity;
	//  948 1883:aload           28
	//  949 1885:getfield        #356 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//  950 1888:istore          10
						k1 = ((k1 & 0x70) >> 4 & -2) >> 1;
	//  951 1890:iload           10
	//  952 1892:bipush          112
	//  953 1894:iand            
	//  954 1895:iconst_4        
	//  955 1896:ishr            
	//  956 1897:bipush          -2
	//  957 1899:iand            
	//  958 1900:iconst_1        
	//  959 1901:ishr            
	//  960 1902:istore          10
						ai[k1] = Math.max(ai[k1], j2);
	//  961 1904:aload           27
	//  962 1906:iload           10
	//  963 1908:aload           27
	//  964 1910:iload           10
	//  965 1912:iaload          
	//  966 1913:iload           12
	//  967 1915:invokestatic    #379 <Method int Math.max(int, int)>
	//  968 1918:iastore         
						obj[k1] = Math.max(obj[k1], j5 - j2);
	//  969 1919:aload           25
	//  970 1921:iload           10
	//  971 1923:aload           25
	//  972 1925:iload           10
	//  973 1927:iaload          
	//  974 1928:iload           16
	//  975 1930:iload           12
	//  976 1932:isub            
	//  977 1933:invokestatic    #379 <Method int Math.max(int, int)>
	//  978 1936:iastore         
					}
				}
	//* 979 1937:goto            1943
	//* 980 1940:goto            1943
				k1 = i2;
	//  981 1943:iload           11
	//  982 1945:istore          10
				i2 = k3;
	//  983 1947:iload           15
	//  984 1949:istore          11
			}

	//  985 1951:goto            1954
	//  986 1954:iload           13
	//  987 1956:iconst_1        
	//  988 1957:iadd            
	//  989 1958:istore          13
	//* 990 1960:goto            1443
			mTotalLength = mTotalLength + (getPaddingLeft() + getPaddingRight());
	//  991 1963:aload_0         
	//  992 1964:aload_0         
	//  993 1965:getfield        #310 <Field int mTotalLength>
	//  994 1968:aload_0         
	//  995 1969:invokevirtual   #221 <Method int getPaddingLeft()>
	//  996 1972:aload_0         
	//  997 1973:invokevirtual   #227 <Method int getPaddingRight()>
	//  998 1976:iadd            
	//  999 1977:iadd            
	// 1000 1978:putfield        #310 <Field int mTotalLength>
			if(ai[1] == -1 && ai[0] == -1 && ai[2] == -1 && ai[3] == -1)
	//*1001 1981:aload           27
	//*1002 1983:iconst_1        
	//*1003 1984:iaload          
	//*1004 1985:iconst_m1       
	//*1005 1986:icmpne          2023
	//*1006 1989:aload           27
	//*1007 1991:iconst_0        
	//*1008 1992:iaload          
	//*1009 1993:iconst_m1       
	//*1010 1994:icmpne          2023
	//*1011 1997:aload           27
	//*1012 1999:iconst_2        
	//*1013 2000:iaload          
	//*1014 2001:iconst_m1       
	//*1015 2002:icmpne          2023
	//*1016 2005:aload           27
	//*1017 2007:iconst_3        
	//*1018 2008:iaload          
	//*1019 2009:iconst_m1       
	//*1020 2010:icmpeq          2016
	//*1021 2013:goto            2023
				k = i2;
	// 1022 2016:iload           11
	// 1023 2018:istore          5
			else
	//*1024 2020:goto            2081
				k = Math.max(i2, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(obj[3], Math.max(obj[0], Math.max(obj[1], obj[2]))));
	// 1025 2023:iload           11
	// 1026 2025:aload           27
	// 1027 2027:iconst_3        
	// 1028 2028:iaload          
	// 1029 2029:aload           27
	// 1030 2031:iconst_0        
	// 1031 2032:iaload          
	// 1032 2033:aload           27
	// 1033 2035:iconst_1        
	// 1034 2036:iaload          
	// 1035 2037:aload           27
	// 1036 2039:iconst_2        
	// 1037 2040:iaload          
	// 1038 2041:invokestatic    #379 <Method int Math.max(int, int)>
	// 1039 2044:invokestatic    #379 <Method int Math.max(int, int)>
	// 1040 2047:invokestatic    #379 <Method int Math.max(int, int)>
	// 1041 2050:aload           25
	// 1042 2052:iconst_3        
	// 1043 2053:iaload          
	// 1044 2054:aload           25
	// 1045 2056:iconst_0        
	// 1046 2057:iaload          
	// 1047 2058:aload           25
	// 1048 2060:iconst_1        
	// 1049 2061:iaload          
	// 1050 2062:aload           25
	// 1051 2064:iconst_2        
	// 1052 2065:iaload          
	// 1053 2066:invokestatic    #379 <Method int Math.max(int, int)>
	// 1054 2069:invokestatic    #379 <Method int Math.max(int, int)>
	// 1055 2072:invokestatic    #379 <Method int Math.max(int, int)>
	// 1056 2075:iadd            
	// 1057 2076:invokestatic    #379 <Method int Math.max(int, int)>
	// 1058 2079:istore          5
			j2 = l;
	// 1059 2081:iload           6
	// 1060 2083:istore          12
			l = k1;
	// 1061 2085:iload           10
	// 1062 2087:istore          6
			k1 = j1;
	// 1063 2089:iload           9
	// 1064 2091:istore          10
			j1 = i1;
	// 1065 2093:iload           7
	// 1066 2095:istore          9
			i1 = k;
	// 1067 2097:iload           5
	// 1068 2099:istore          7
		}
		if(k1 != 0 || k7 == 0x40000000)
	//*1069 2101:iload           10
	//*1070 2103:ifne            2116
	//*1071 2106:iload           20
	//*1072 2108:ldc1            #144 <Int 0x40000000>
	//*1073 2110:icmpeq          2116
	//*1074 2113:goto            2120
			l = i1;
	// 1075 2116:iload           7
	// 1076 2118:istore          6
		setMeasuredDimension(i7 | j2 & 0xff000000, View.resolveSizeAndState(Math.max(l + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), j, j2 << 16));
	// 1077 2120:aload_0         
	// 1078 2121:iload           18
	// 1079 2123:iload           12
	// 1080 2125:ldc2            #403 <Int 0xff000000>
	// 1081 2128:iand            
	// 1082 2129:ior             
	// 1083 2130:iload           6
	// 1084 2132:aload_0         
	// 1085 2133:invokevirtual   #264 <Method int getPaddingTop()>
	// 1086 2136:aload_0         
	// 1087 2137:invokevirtual   #245 <Method int getPaddingBottom()>
	// 1088 2140:iadd            
	// 1089 2141:iadd            
	// 1090 2142:aload_0         
	// 1091 2143:invokevirtual   #406 <Method int getSuggestedMinimumHeight()>
	// 1092 2146:invokestatic    #379 <Method int Math.max(int, int)>
	// 1093 2149:iload_2         
	// 1094 2150:iload           12
	// 1095 2152:bipush          16
	// 1096 2154:ishl            
	// 1097 2155:invokestatic    #398 <Method int View.resolveSizeAndState(int, int, int)>
	// 1098 2158:invokevirtual   #409 <Method void setMeasuredDimension(int, int)>
		if(flag)
	//*1099 2161:iload           8
	//*1100 2163:ifeq            2173
			forceUniformHeight(j1, i);
	// 1101 2166:aload_0         
	// 1102 2167:iload           9
	// 1103 2169:iload_1         
	// 1104 2170:invokespecial   #411 <Method void forceUniformHeight(int, int)>
	// 1105 2173:return          
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
	//    2    2:putfield        #310 <Field int mTotalLength>
		int k2 = getVirtualChildCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #190 <Method int getVirtualChildCount()>
	//    5    9:istore          13
		int l7 = android.view.View.MeasureSpec.getMode(i);
	//    6   11:iload_1         
	//    7   12:invokestatic    #371 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   15:istore          21
		int i1 = android.view.View.MeasureSpec.getMode(j);
	//    9   17:iload_2         
	//   10   18:invokestatic    #371 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   11   21:istore          7
		int i8 = mBaselineAlignedChildIndex;
	//   12   23:aload_0         
	//   13   24:getfield        #47  <Field int mBaselineAlignedChildIndex>
	//   14   27:istore          22
		boolean flag1 = mUseLargestChild;
	//   15   29:aload_0         
	//   16   30:getfield        #109 <Field boolean mUseLargestChild>
	//   17   33:istore          23
		float f = 0.0F;
	//   18   35:fconst_0        
	//   19   36:fstore_3        
		int k = 0;
	//   20   37:iconst_0        
	//   21   38:istore          5
		int k3 = 0;
	//   22   40:iconst_0        
	//   23   41:istore          15
		int l1 = 0;
	//   24   43:iconst_0        
	//   25   44:istore          10
		int l = 0;
	//   26   46:iconst_0        
	//   27   47:istore          6
		int k1 = 0;
	//   28   49:iconst_0        
	//   29   50:istore          9
		int j2 = 0;
	//   30   52:iconst_0        
	//   31   53:istore          11
		int l2 = 0;
	//   32   55:iconst_0        
	//   33   56:istore          14
		int j1 = 1;
	//   34   58:iconst_1        
	//   35   59:istore          8
		boolean flag = false;
	//   36   61:iconst_0        
	//   37   62:istore          12
		for(; j2 < k2; j2++)
	//*  38   64:iload           11
	//*  39   66:iload           13
	//*  40   68:icmpge          650
		{
			View view = getVirtualChildAt(j2);
	//   41   71:aload_0         
	//   42   72:iload           11
	//   43   74:invokevirtual   #153 <Method View getVirtualChildAt(int)>
	//   44   77:astore          24
			if(view == null)
	//*  45   79:aload           24
	//*  46   81:ifnonnull       102
			{
				mTotalLength = mTotalLength + measureNullChild(j2);
	//   47   84:aload_0         
	//   48   85:aload_0         
	//   49   86:getfield        #310 <Field int mTotalLength>
	//   50   89:aload_0         
	//   51   90:iload           11
	//   52   92:invokevirtual   #353 <Method int measureNullChild(int)>
	//   53   95:iadd            
	//   54   96:putfield        #310 <Field int mTotalLength>
				continue;
	//   55   99:goto            641
			}
			if(view.getVisibility() == 8)
	//*  56  102:aload           24
	//*  57  104:invokevirtual   #158 <Method int View.getVisibility()>
	//*  58  107:bipush          8
	//*  59  109:icmpne          128
			{
				j2 += getChildrenSkipCount(view, j2);
	//   60  112:iload           11
	//   61  114:aload_0         
	//   62  115:aload           24
	//   63  117:iload           11
	//   64  119:invokevirtual   #364 <Method int getChildrenSkipCount(View, int)>
	//   65  122:iadd            
	//   66  123:istore          11
				continue;
	//   67  125:goto            641
			}
			if(hasDividerBeforeChildAt(j2))
	//*  68  128:aload_0         
	//*  69  129:iload           11
	//*  70  131:invokevirtual   #200 <Method boolean hasDividerBeforeChildAt(int)>
	//*  71  134:ifeq            150
				mTotalLength = mTotalLength + mDividerHeight;
	//   72  137:aload_0         
	//   73  138:aload_0         
	//   74  139:getfield        #310 <Field int mTotalLength>
	//   75  142:aload_0         
	//   76  143:getfield        #236 <Field int mDividerHeight>
	//   77  146:iadd            
	//   78  147:putfield        #310 <Field int mTotalLength>
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   79  150:aload           24
	//   80  152:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   81  155:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//   82  158:astore          25
			f += layoutparams.weight;
	//   83  160:fload_3         
	//   84  161:aload           25
	//   85  163:getfield        #374 <Field float LinearLayoutCompat$LayoutParams.weight>
	//   86  166:fadd            
	//   87  167:fstore_3        
			if(i1 == 0x40000000 && layoutparams.height == 0 && layoutparams.weight > 0.0F)
	//*  88  168:iload           7
	//*  89  170:ldc1            #144 <Int 0x40000000>
	//*  90  172:icmpne          228
	//*  91  175:aload           25
	//*  92  177:getfield        #165 <Field int LinearLayoutCompat$LayoutParams.height>
	//*  93  180:ifne            228
	//*  94  183:aload           25
	//*  95  185:getfield        #374 <Field float LinearLayoutCompat$LayoutParams.weight>
	//*  96  188:fconst_0        
	//*  97  189:fcmpl           
	//*  98  190:ifle            228
			{
				l2 = mTotalLength;
	//   99  193:aload_0         
	//  100  194:getfield        #310 <Field int mTotalLength>
	//  101  197:istore          14
				mTotalLength = Math.max(l2, layoutparams.topMargin + l2 + layoutparams.bottomMargin);
	//  102  199:aload_0         
	//  103  200:iload           14
	//  104  202:aload           25
	//  105  204:getfield        #234 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  106  207:iload           14
	//  107  209:iadd            
	//  108  210:aload           25
	//  109  212:getfield        #251 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  110  215:iadd            
	//  111  216:invokestatic    #379 <Method int Math.max(int, int)>
	//  112  219:putfield        #310 <Field int mTotalLength>
				l2 = 1;
	//  113  222:iconst_1        
	//  114  223:istore          14
			} else
	//* 115  225:goto            373
			{
				int j4;
				if(layoutparams.height == 0 && layoutparams.weight > 0.0F)
	//* 116  228:aload           25
	//* 117  230:getfield        #165 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 118  233:ifne            259
	//* 119  236:aload           25
	//* 120  238:getfield        #374 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 121  241:fconst_0        
	//* 122  242:fcmpl           
	//* 123  243:ifle            259
				{
					layoutparams.height = -2;
	//  124  246:aload           25
	//  125  248:bipush          -2
	//  126  250:putfield        #165 <Field int LinearLayoutCompat$LayoutParams.height>
					j4 = 0;
	//  127  253:iconst_0        
	//  128  254:istore          16
				} else
	//* 129  256:goto            264
				{
					j4 = 0x80000000;
	//  130  259:ldc2            #383 <Int 0x80000000>
	//  131  262:istore          16
				}
				int k5;
				if(f == 0.0F)
	//* 132  264:fload_3         
	//* 133  265:fconst_0        
	//* 134  266:fcmpl           
	//* 135  267:ifne            279
					k5 = mTotalLength;
	//  136  270:aload_0         
	//  137  271:getfield        #310 <Field int mTotalLength>
	//  138  274:istore          17
				else
	//* 139  276:goto            282
					k5 = 0;
	//  140  279:iconst_0        
	//  141  280:istore          17
				measureChildBeforeLayout(view, j2, i, 0, j, k5);
	//  142  282:aload_0         
	//  143  283:aload           24
	//  144  285:iload           11
	//  145  287:iload_1         
	//  146  288:iconst_0        
	//  147  289:iload_2         
	//  148  290:iload           17
	//  149  292:invokevirtual   #385 <Method void measureChildBeforeLayout(View, int, int, int, int, int)>
				if(j4 != 0x80000000)
	//* 150  295:iload           16
	//* 151  297:ldc2            #383 <Int 0x80000000>
	//* 152  300:icmpeq          310
					layoutparams.height = j4;
	//  153  303:aload           25
	//  154  305:iload           16
	//  155  307:putfield        #165 <Field int LinearLayoutCompat$LayoutParams.height>
				j4 = view.getMeasuredHeight();
	//  156  310:aload           24
	//  157  312:invokevirtual   #178 <Method int View.getMeasuredHeight()>
	//  158  315:istore          16
				k5 = mTotalLength;
	//  159  317:aload_0         
	//  160  318:getfield        #310 <Field int mTotalLength>
	//  161  321:istore          17
				mTotalLength = Math.max(k5, k5 + j4 + layoutparams.topMargin + layoutparams.bottomMargin + getNextLocationOffset(view));
	//  162  323:aload_0         
	//  163  324:iload           17
	//  164  326:iload           17
	//  165  328:iload           16
	//  166  330:iadd            
	//  167  331:aload           25
	//  168  333:getfield        #234 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  169  336:iadd            
	//  170  337:aload           25
	//  171  339:getfield        #251 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  172  342:iadd            
	//  173  343:aload_0         
	//  174  344:aload           24
	//  175  346:invokevirtual   #362 <Method int getNextLocationOffset(View)>
	//  176  349:iadd            
	//  177  350:invokestatic    #379 <Method int Math.max(int, int)>
	//  178  353:putfield        #310 <Field int mTotalLength>
				if(flag1)
	//* 179  356:iload           23
	//* 180  358:ifeq            373
					l1 = Math.max(j4, l1);
	//  181  361:iload           16
	//  182  363:iload           10
	//  183  365:invokestatic    #379 <Method int Math.max(int, int)>
	//  184  368:istore          10
			}
	//* 185  370:goto            373
			int j6 = j2;
	//  186  373:iload           11
	//  187  375:istore          18
			if(i8 >= 0 && i8 == j6 + 1)
	//* 188  377:iload           22
	//* 189  379:iflt            399
	//* 190  382:iload           22
	//* 191  384:iload           18
	//* 192  386:iconst_1        
	//* 193  387:iadd            
	//* 194  388:icmpne          399
				mBaselineChildTop = mTotalLength;
	//  195  391:aload_0         
	//  196  392:aload_0         
	//  197  393:getfield        #310 <Field int mTotalLength>
	//  198  396:putfield        #49  <Field int mBaselineChildTop>
			if(j6 < i8 && layoutparams.weight > 0.0F)
	//* 199  399:iload           18
	//* 200  401:iload           22
	//* 201  403:icmpge          430
	//* 202  406:aload           25
	//* 203  408:getfield        #374 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 204  411:fconst_0        
	//* 205  412:fcmpl           
	//* 206  413:ifgt            419
	//* 207  416:goto            430
				throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
	//  208  419:new             #301 <Class RuntimeException>
	//  209  422:dup             
	//  210  423:ldc2            #414 <String "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.">
	//  211  426:invokespecial   #306 <Method void RuntimeException(String)>
	//  212  429:athrow          
			if(l7 != 0x40000000 && layoutparams.width == -1)
	//* 213  430:iload           21
	//* 214  432:ldc1            #144 <Int 0x40000000>
	//* 215  434:icmpeq          455
	//* 216  437:aload           25
	//* 217  439:getfield        #168 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 218  442:iconst_m1       
	//* 219  443:icmpne          455
			{
				j2 = 1;
	//  220  446:iconst_1        
	//  221  447:istore          11
				flag = true;
	//  222  449:iconst_1        
	//  223  450:istore          12
			} else
	//* 224  452:goto            458
			{
				j2 = 0;
	//  225  455:iconst_0        
	//  226  456:istore          11
			}
			int k4 = layoutparams.leftMargin + layoutparams.rightMargin;
	//  227  458:aload           25
	//  228  460:getfield        #212 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  229  463:aload           25
	//  230  465:getfield        #206 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  231  468:iadd            
	//  232  469:istore          16
			int l5 = view.getMeasuredWidth() + k4;
	//  233  471:aload           24
	//  234  473:invokevirtual   #171 <Method int View.getMeasuredWidth()>
	//  235  476:iload           16
	//  236  478:iadd            
	//  237  479:istore          17
			int l6 = Math.max(k3, l5);
	//  238  481:iload           15
	//  239  483:iload           17
	//  240  485:invokestatic    #379 <Method int Math.max(int, int)>
	//  241  488:istore          19
			int j7 = View.combineMeasuredStates(k, view.getMeasuredState());
	//  242  490:iload           5
	//  243  492:aload           24
	//  244  494:invokevirtual   #388 <Method int View.getMeasuredState()>
	//  245  497:invokestatic    #391 <Method int View.combineMeasuredStates(int, int)>
	//  246  500:istore          20
			if(j1 != 0 && layoutparams.width == -1)
	//* 247  502:iload           8
	//* 248  504:ifeq            522
	//* 249  507:aload           25
	//* 250  509:getfield        #168 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 251  512:iconst_m1       
	//* 252  513:icmpne          522
				k = 1;
	//  253  516:iconst_1        
	//  254  517:istore          5
			else
	//* 255  519:goto            525
				k = 0;
	//  256  522:iconst_0        
	//  257  523:istore          5
			if(layoutparams.weight > 0.0F)
	//* 258  525:aload           25
	//* 259  527:getfield        #374 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 260  530:fconst_0        
	//* 261  531:fcmpl           
	//* 262  532:ifle            563
			{
				if(j2 == 0)
	//* 263  535:iload           11
	//* 264  537:ifeq            543
	//* 265  540:goto            547
					k4 = l5;
	//  266  543:iload           17
	//  267  545:istore          16
				j1 = Math.max(l, k4);
	//  268  547:iload           6
	//  269  549:iload           16
	//  270  551:invokestatic    #379 <Method int Math.max(int, int)>
	//  271  554:istore          8
				l = k1;
	//  272  556:iload           9
	//  273  558:istore          6
			} else
	//* 274  560:goto            592
			{
				if(j2 == 0)
	//* 275  563:iload           11
	//* 276  565:ifeq            571
	//* 277  568:goto            575
					k4 = l5;
	//  278  571:iload           17
	//  279  573:istore          16
				k1 = Math.max(k1, k4);
	//  280  575:iload           9
	//  281  577:iload           16
	//  282  579:invokestatic    #379 <Method int Math.max(int, int)>
	//  283  582:istore          9
				j1 = l;
	//  284  584:iload           6
	//  285  586:istore          8
				l = k1;
	//  286  588:iload           9
	//  287  590:istore          6
			}
			j2 = getChildrenSkipCount(view, j6);
	//  288  592:aload_0         
	//  289  593:aload           24
	//  290  595:iload           18
	//  291  597:invokevirtual   #364 <Method int getChildrenSkipCount(View, int)>
	//  292  600:istore          11
			k1 = k;
	//  293  602:iload           5
	//  294  604:istore          9
			k3 = j1;
	//  295  606:iload           8
	//  296  608:istore          15
			k = j7;
	//  297  610:iload           20
	//  298  612:istore          5
			j2 += j6;
	//  299  614:iload           11
	//  300  616:iload           18
	//  301  618:iadd            
	//  302  619:istore          11
			k4 = l6;
	//  303  621:iload           19
	//  304  623:istore          16
			j1 = k1;
	//  305  625:iload           9
	//  306  627:istore          8
			k1 = l;
	//  307  629:iload           6
	//  308  631:istore          9
			l = k3;
	//  309  633:iload           15
	//  310  635:istore          6
			k3 = k4;
	//  311  637:iload           16
	//  312  639:istore          15
		}

	//  313  641:iload           11
	//  314  643:iconst_1        
	//  315  644:iadd            
	//  316  645:istore          11
	//* 317  647:goto            64
		if(mTotalLength > 0 && hasDividerBeforeChildAt(k2))
	//* 318  650:aload_0         
	//* 319  651:getfield        #310 <Field int mTotalLength>
	//* 320  654:ifle            682
	//* 321  657:aload_0         
	//* 322  658:iload           13
	//* 323  660:invokevirtual   #200 <Method boolean hasDividerBeforeChildAt(int)>
	//* 324  663:ifeq            682
			mTotalLength = mTotalLength + mDividerHeight;
	//  325  666:aload_0         
	//  326  667:aload_0         
	//  327  668:getfield        #310 <Field int mTotalLength>
	//  328  671:aload_0         
	//  329  672:getfield        #236 <Field int mDividerHeight>
	//  330  675:iadd            
	//  331  676:putfield        #310 <Field int mTotalLength>
	//* 332  679:goto            682
		if(flag1)
	//* 333  682:iload           23
	//* 334  684:ifeq            834
		{
			j2 = i1;
	//  335  687:iload           7
	//  336  689:istore          11
			if(j2 == 0x80000000 || j2 == 0)
	//* 337  691:iload           11
	//* 338  693:ldc2            #383 <Int 0x80000000>
	//* 339  696:icmpeq          704
	//* 340  699:iload           11
	//* 341  701:ifne            834
			{
				mTotalLength = 0;
	//  342  704:aload_0         
	//  343  705:iconst_0        
	//  344  706:putfield        #310 <Field int mTotalLength>
				for(j2 = 0; j2 < k2; j2++)
	//* 345  709:iconst_0        
	//* 346  710:istore          11
	//* 347  712:iload           11
	//* 348  714:iload           13
	//* 349  716:icmpge          834
				{
					View view1 = getVirtualChildAt(j2);
	//  350  719:aload_0         
	//  351  720:iload           11
	//  352  722:invokevirtual   #153 <Method View getVirtualChildAt(int)>
	//  353  725:astore          24
					if(view1 == null)
	//* 354  727:aload           24
	//* 355  729:ifnonnull       750
					{
						mTotalLength = mTotalLength + measureNullChild(j2);
	//  356  732:aload_0         
	//  357  733:aload_0         
	//  358  734:getfield        #310 <Field int mTotalLength>
	//  359  737:aload_0         
	//  360  738:iload           11
	//  361  740:invokevirtual   #353 <Method int measureNullChild(int)>
	//  362  743:iadd            
	//  363  744:putfield        #310 <Field int mTotalLength>
						continue;
	//  364  747:goto            825
					}
					if(view1.getVisibility() == 8)
	//* 365  750:aload           24
	//* 366  752:invokevirtual   #158 <Method int View.getVisibility()>
	//* 367  755:bipush          8
	//* 368  757:icmpne          776
					{
						j2 += getChildrenSkipCount(view1, j2);
	//  369  760:iload           11
	//  370  762:aload_0         
	//  371  763:aload           24
	//  372  765:iload           11
	//  373  767:invokevirtual   #364 <Method int getChildrenSkipCount(View, int)>
	//  374  770:iadd            
	//  375  771:istore          11
					} else
	//* 376  773:goto            825
					{
						LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  377  776:aload           24
	//  378  778:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  379  781:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  380  784:astore          25
						int l4 = mTotalLength;
	//  381  786:aload_0         
	//  382  787:getfield        #310 <Field int mTotalLength>
	//  383  790:istore          16
						mTotalLength = Math.max(l4, l4 + l1 + layoutparams1.topMargin + layoutparams1.bottomMargin + getNextLocationOffset(view1));
	//  384  792:aload_0         
	//  385  793:iload           16
	//  386  795:iload           16
	//  387  797:iload           10
	//  388  799:iadd            
	//  389  800:aload           25
	//  390  802:getfield        #234 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  391  805:iadd            
	//  392  806:aload           25
	//  393  808:getfield        #251 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  394  811:iadd            
	//  395  812:aload_0         
	//  396  813:aload           24
	//  397  815:invokevirtual   #362 <Method int getNextLocationOffset(View)>
	//  398  818:iadd            
	//  399  819:invokestatic    #379 <Method int Math.max(int, int)>
	//  400  822:putfield        #310 <Field int mTotalLength>
					}
				}

	//  401  825:iload           11
	//  402  827:iconst_1        
	//  403  828:iadd            
	//  404  829:istore          11
			}
		}
	//* 405  831:goto            712
		j2 = i1;
	//  406  834:iload           7
	//  407  836:istore          11
		mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
	//  408  838:aload_0         
	//  409  839:aload_0         
	//  410  840:getfield        #310 <Field int mTotalLength>
	//  411  843:aload_0         
	//  412  844:invokevirtual   #264 <Method int getPaddingTop()>
	//  413  847:aload_0         
	//  414  848:invokevirtual   #245 <Method int getPaddingBottom()>
	//  415  851:iadd            
	//  416  852:iadd            
	//  417  853:putfield        #310 <Field int mTotalLength>
		int i6 = View.resolveSizeAndState(Math.max(mTotalLength, getSuggestedMinimumHeight()), j, 0);
	//  418  856:aload_0         
	//  419  857:getfield        #310 <Field int mTotalLength>
	//  420  860:aload_0         
	//  421  861:invokevirtual   #406 <Method int getSuggestedMinimumHeight()>
	//  422  864:invokestatic    #379 <Method int Math.max(int, int)>
	//  423  867:iload_2         
	//  424  868:iconst_0        
	//  425  869:invokestatic    #398 <Method int View.resolveSizeAndState(int, int, int)>
	//  426  872:istore          17
		i1 = (0xffffff & i6) - mTotalLength;
	//  427  874:ldc2            #399 <Int 0xffffff>
	//  428  877:iload           17
	//  429  879:iand            
	//  430  880:aload_0         
	//  431  881:getfield        #310 <Field int mTotalLength>
	//  432  884:isub            
	//  433  885:istore          7
		if(l2 == 0 && (i1 == 0 || f <= 0.0F))
	//* 434  887:iload           14
	//* 435  889:ifne            1025
	//* 436  892:iload           7
	//* 437  894:ifeq            906
	//* 438  897:fload_3         
	//* 439  898:fconst_0        
	//* 440  899:fcmpl           
	//* 441  900:ifle            906
	//* 442  903:goto            1025
		{
			i1 = Math.max(k1, l);
	//  443  906:iload           9
	//  444  908:iload           6
	//  445  910:invokestatic    #379 <Method int Math.max(int, int)>
	//  446  913:istore          7
			if(flag1 && j2 != 0x40000000)
	//* 447  915:iload           23
	//* 448  917:ifeq            1010
	//* 449  920:iload           11
	//* 450  922:ldc1            #144 <Int 0x40000000>
	//* 451  924:icmpeq          1010
				for(l = 0; l < k2; l++)
	//* 452  927:iconst_0        
	//* 453  928:istore          6
	//* 454  930:iload           6
	//* 455  932:iload           13
	//* 456  934:icmpge          1010
				{
					View view2 = getVirtualChildAt(l);
	//  457  937:aload_0         
	//  458  938:iload           6
	//  459  940:invokevirtual   #153 <Method View getVirtualChildAt(int)>
	//  460  943:astore          24
					if(view2 != null && view2.getVisibility() != 8 && ((LayoutParams)view2.getLayoutParams()).weight > 0.0F)
	//* 461  945:aload           24
	//* 462  947:ifnull          1001
	//* 463  950:aload           24
	//* 464  952:invokevirtual   #158 <Method int View.getVisibility()>
	//* 465  955:bipush          8
	//* 466  957:icmpne          963
	//* 467  960:goto            1001
	//* 468  963:aload           24
	//* 469  965:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 470  968:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//* 471  971:getfield        #374 <Field float LinearLayoutCompat$LayoutParams.weight>
	//* 472  974:fconst_0        
	//* 473  975:fcmpl           
	//* 474  976:ifle            1001
						view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
	//  475  979:aload           24
	//  476  981:aload           24
	//  477  983:invokevirtual   #171 <Method int View.getMeasuredWidth()>
	//  478  986:ldc1            #144 <Int 0x40000000>
	//  479  988:invokestatic    #149 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  480  991:iload           10
	//  481  993:ldc1            #144 <Int 0x40000000>
	//  482  995:invokestatic    #149 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  483  998:invokevirtual   #382 <Method void View.measure(int, int)>
				}

	//  484 1001:iload           6
	//  485 1003:iconst_1        
	//  486 1004:iadd            
	//  487 1005:istore          6
	//* 488 1007:goto            930
			l = k;
	//  489 1010:iload           5
	//  490 1012:istore          6
			k = i1;
	//  491 1014:iload           7
	//  492 1016:istore          5
			i1 = k3;
	//  493 1018:iload           15
	//  494 1020:istore          7
		} else
	//* 495 1022:goto            1495
		{
			float f1 = mWeightSum;
	//  496 1025:aload_0         
	//  497 1026:getfield        #101 <Field float mWeightSum>
	//  498 1029:fstore          4
			if(f1 > 0.0F)
	//* 499 1031:fload           4
	//* 500 1033:fconst_0        
	//* 501 1034:fcmpl           
	//* 502 1035:ifle            1041
				f = f1;
	//  503 1038:fload           4
	//  504 1040:fstore_3        
			mTotalLength = 0;
	//  505 1041:aload_0         
	//  506 1042:iconst_0        
	//  507 1043:putfield        #310 <Field int mTotalLength>
			int i2 = 0;
	//  508 1046:iconst_0        
	//  509 1047:istore          10
			l = k1;
	//  510 1049:iload           9
	//  511 1051:istore          6
			k1 = i1;
	//  512 1053:iload           7
	//  513 1055:istore          9
			i1 = k3;
	//  514 1057:iload           15
	//  515 1059:istore          7
			for(; i2 < k2; i2++)
	//* 516 1061:iload           10
	//* 517 1063:iload           13
	//* 518 1065:icmpge          1465
			{
				View view3 = getVirtualChildAt(i2);
	//  519 1068:aload_0         
	//  520 1069:iload           10
	//  521 1071:invokevirtual   #153 <Method View getVirtualChildAt(int)>
	//  522 1074:astore          24
				if(view3.getVisibility() == 8)
	//* 523 1076:aload           24
	//* 524 1078:invokevirtual   #158 <Method int View.getVisibility()>
	//* 525 1081:bipush          8
	//* 526 1083:icmpne          1089
					continue;
	//  527 1086:goto            1456
				LayoutParams layoutparams2 = (LayoutParams)view3.getLayoutParams();
	//  528 1089:aload           24
	//  529 1091:invokevirtual   #162 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  530 1094:checkcast       #9   <Class LinearLayoutCompat$LayoutParams>
	//  531 1097:astore          25
				float f2 = layoutparams2.weight;
	//  532 1099:aload           25
	//  533 1101:getfield        #374 <Field float LinearLayoutCompat$LayoutParams.weight>
	//  534 1104:fstore          4
				if(f2 > 0.0F)
	//* 535 1106:fload           4
	//* 536 1108:fconst_0        
	//* 537 1109:fcmpl           
	//* 538 1110:ifle            1297
				{
					int l3 = (int)(((float)k1 * f2) / f);
	//  539 1113:iload           9
	//  540 1115:i2f             
	//  541 1116:fload           4
	//  542 1118:fmul            
	//  543 1119:fload_3         
	//  544 1120:fdiv            
	//  545 1121:f2i             
	//  546 1122:istore          15
					int i5 = getPaddingLeft();
	//  547 1124:aload_0         
	//  548 1125:invokevirtual   #221 <Method int getPaddingLeft()>
	//  549 1128:istore          16
					int k6 = getPaddingRight();
	//  550 1130:aload_0         
	//  551 1131:invokevirtual   #227 <Method int getPaddingRight()>
	//  552 1134:istore          18
					int i3 = k1 - l3;
	//  553 1136:iload           9
	//  554 1138:iload           15
	//  555 1140:isub            
	//  556 1141:istore          14
					k1 = layoutparams2.leftMargin;
	//  557 1143:aload           25
	//  558 1145:getfield        #212 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  559 1148:istore          9
					int i7 = layoutparams2.rightMargin;
	//  560 1150:aload           25
	//  561 1152:getfield        #206 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  562 1155:istore          19
					int k7 = layoutparams2.width;
	//  563 1157:aload           25
	//  564 1159:getfield        #168 <Field int LinearLayoutCompat$LayoutParams.width>
	//  565 1162:istore          20
					f -= f2;
	//  566 1164:fload_3         
	//  567 1165:fload           4
	//  568 1167:fsub            
	//  569 1168:fstore_3        
					i5 = getChildMeasureSpec(i, i5 + k6 + k1 + i7, k7);
	//  570 1169:iload_1         
	//  571 1170:iload           16
	//  572 1172:iload           18
	//  573 1174:iadd            
	//  574 1175:iload           9
	//  575 1177:iadd            
	//  576 1178:iload           19
	//  577 1180:iadd            
	//  578 1181:iload           20
	//  579 1183:invokestatic    #402 <Method int getChildMeasureSpec(int, int, int)>
	//  580 1186:istore          16
					if(layoutparams2.height == 0 && j2 == 0x40000000)
	//* 581 1188:aload           25
	//* 582 1190:getfield        #165 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 583 1193:ifne            1238
	//* 584 1196:iload           11
	//* 585 1198:ldc1            #144 <Int 0x40000000>
	//* 586 1200:icmpeq          1206
	//* 587 1203:goto            1238
					{
						if(l3 > 0)
	//* 588 1206:iload           15
	//* 589 1208:ifle            1218
							k1 = l3;
	//  590 1211:iload           15
	//  591 1213:istore          9
						else
	//* 592 1215:goto            1221
							k1 = 0;
	//  593 1218:iconst_0        
	//  594 1219:istore          9
						view3.measure(i5, android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000));
	//  595 1221:aload           24
	//  596 1223:iload           16
	//  597 1225:iload           9
	//  598 1227:ldc1            #144 <Int 0x40000000>
	//  599 1229:invokestatic    #149 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  600 1232:invokevirtual   #382 <Method void View.measure(int, int)>
					} else
	//* 601 1235:goto            1274
					{
						l3 = view3.getMeasuredHeight() + l3;
	//  602 1238:aload           24
	//  603 1240:invokevirtual   #178 <Method int View.getMeasuredHeight()>
	//  604 1243:iload           15
	//  605 1245:iadd            
	//  606 1246:istore          15
						k1 = l3;
	//  607 1248:iload           15
	//  608 1250:istore          9
						if(l3 < 0)
	//* 609 1252:iload           15
	//* 610 1254:ifge            1260
							k1 = 0;
	//  611 1257:iconst_0        
	//  612 1258:istore          9
						view3.measure(i5, android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000));
	//  613 1260:aload           24
	//  614 1262:iload           16
	//  615 1264:iload           9
	//  616 1266:ldc1            #144 <Int 0x40000000>
	//  617 1268:invokestatic    #149 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  618 1271:invokevirtual   #382 <Method void View.measure(int, int)>
					}
					k = View.combineMeasuredStates(k, view3.getMeasuredState() & 0xffffff00);
	//  619 1274:iload           5
	//  620 1276:aload           24
	//  621 1278:invokevirtual   #388 <Method int View.getMeasuredState()>
	//  622 1281:sipush          -256
	//  623 1284:iand            
	//  624 1285:invokestatic    #391 <Method int View.combineMeasuredStates(int, int)>
	//  625 1288:istore          5
					k1 = i3;
	//  626 1290:iload           14
	//  627 1292:istore          9
				}
	//* 628 1294:goto            1297
				int i4 = layoutparams2.leftMargin + layoutparams2.rightMargin;
	//  629 1297:aload           25
	//  630 1299:getfield        #212 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  631 1302:aload           25
	//  632 1304:getfield        #206 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  633 1307:iadd            
	//  634 1308:istore          15
				int j5 = view3.getMeasuredWidth() + i4;
	//  635 1310:aload           24
	//  636 1312:invokevirtual   #171 <Method int View.getMeasuredWidth()>
	//  637 1315:iload           15
	//  638 1317:iadd            
	//  639 1318:istore          16
				int j3 = Math.max(i1, j5);
	//  640 1320:iload           7
	//  641 1322:iload           16
	//  642 1324:invokestatic    #379 <Method int Math.max(int, int)>
	//  643 1327:istore          14
				if(l7 != 0x40000000 && layoutparams2.width == -1)
	//* 644 1329:iload           21
	//* 645 1331:ldc1            #144 <Int 0x40000000>
	//* 646 1333:icmpeq          1351
	//* 647 1336:aload           25
	//* 648 1338:getfield        #168 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 649 1341:iconst_m1       
	//* 650 1342:icmpne          1351
					i1 = 1;
	//  651 1345:iconst_1        
	//  652 1346:istore          7
				else
	//* 653 1348:goto            1354
					i1 = 0;
	//  654 1351:iconst_0        
	//  655 1352:istore          7
				if(i1 != 0)
	//* 656 1354:iload           7
	//* 657 1356:ifeq            1366
					i1 = i4;
	//  658 1359:iload           15
	//  659 1361:istore          7
				else
	//* 660 1363:goto            1370
					i1 = j5;
	//  661 1366:iload           16
	//  662 1368:istore          7
				i1 = Math.max(l, i1);
	//  663 1370:iload           6
	//  664 1372:iload           7
	//  665 1374:invokestatic    #379 <Method int Math.max(int, int)>
	//  666 1377:istore          7
				if(j1 != 0 && layoutparams2.width == -1)
	//* 667 1379:iload           8
	//* 668 1381:ifeq            1399
	//* 669 1384:aload           25
	//* 670 1386:getfield        #168 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 671 1389:iconst_m1       
	//* 672 1390:icmpne          1399
					l = 1;
	//  673 1393:iconst_1        
	//  674 1394:istore          6
				else
	//* 675 1396:goto            1402
					l = 0;
	//  676 1399:iconst_0        
	//  677 1400:istore          6
				j1 = mTotalLength;
	//  678 1402:aload_0         
	//  679 1403:getfield        #310 <Field int mTotalLength>
	//  680 1406:istore          8
				mTotalLength = Math.max(j1, view3.getMeasuredHeight() + j1 + layoutparams2.topMargin + layoutparams2.bottomMargin + getNextLocationOffset(view3));
	//  681 1408:aload_0         
	//  682 1409:iload           8
	//  683 1411:aload           24
	//  684 1413:invokevirtual   #178 <Method int View.getMeasuredHeight()>
	//  685 1416:iload           8
	//  686 1418:iadd            
	//  687 1419:aload           25
	//  688 1421:getfield        #234 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  689 1424:iadd            
	//  690 1425:aload           25
	//  691 1427:getfield        #251 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  692 1430:iadd            
	//  693 1431:aload_0         
	//  694 1432:aload           24
	//  695 1434:invokevirtual   #362 <Method int getNextLocationOffset(View)>
	//  696 1437:iadd            
	//  697 1438:invokestatic    #379 <Method int Math.max(int, int)>
	//  698 1441:putfield        #310 <Field int mTotalLength>
				j1 = l;
	//  699 1444:iload           6
	//  700 1446:istore          8
				l = i1;
	//  701 1448:iload           7
	//  702 1450:istore          6
				i1 = j3;
	//  703 1452:iload           14
	//  704 1454:istore          7
			}

	//  705 1456:iload           10
	//  706 1458:iconst_1        
	//  707 1459:iadd            
	//  708 1460:istore          10
	//* 709 1462:goto            1061
			mTotalLength = mTotalLength + (getPaddingTop() + getPaddingBottom());
	//  710 1465:aload_0         
	//  711 1466:aload_0         
	//  712 1467:getfield        #310 <Field int mTotalLength>
	//  713 1470:aload_0         
	//  714 1471:invokevirtual   #264 <Method int getPaddingTop()>
	//  715 1474:aload_0         
	//  716 1475:invokevirtual   #245 <Method int getPaddingBottom()>
	//  717 1478:iadd            
	//  718 1479:iadd            
	//  719 1480:putfield        #310 <Field int mTotalLength>
			k1 = l;
	//  720 1483:iload           6
	//  721 1485:istore          9
			l = k;
	//  722 1487:iload           5
	//  723 1489:istore          6
			k = k1;
	//  724 1491:iload           9
	//  725 1493:istore          5
		}
		if(j1 != 0 || l7 == 0x40000000)
	//* 726 1495:iload           8
	//* 727 1497:ifne            1510
	//* 728 1500:iload           21
	//* 729 1502:ldc1            #144 <Int 0x40000000>
	//* 730 1504:icmpeq          1510
	//* 731 1507:goto            1514
			k = i1;
	//  732 1510:iload           7
	//  733 1512:istore          5
		setMeasuredDimension(View.resolveSizeAndState(Math.max(k + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, l), i6);
	//  734 1514:aload_0         
	//  735 1515:iload           5
	//  736 1517:aload_0         
	//  737 1518:invokevirtual   #221 <Method int getPaddingLeft()>
	//  738 1521:aload_0         
	//  739 1522:invokevirtual   #227 <Method int getPaddingRight()>
	//  740 1525:iadd            
	//  741 1526:iadd            
	//  742 1527:aload_0         
	//  743 1528:invokevirtual   #394 <Method int getSuggestedMinimumWidth()>
	//  744 1531:invokestatic    #379 <Method int Math.max(int, int)>
	//  745 1534:iload_1         
	//  746 1535:iload           6
	//  747 1537:invokestatic    #398 <Method int View.resolveSizeAndState(int, int, int)>
	//  748 1540:iload           17
	//  749 1542:invokevirtual   #409 <Method void setMeasuredDimension(int, int)>
		if(flag)
	//* 750 1545:iload           12
	//* 751 1547:ifeq            1557
			forceUniformWidth(k2, j);
	//  752 1550:aload_0         
	//  753 1551:iload           13
	//  754 1553:iload_2         
	//  755 1554:invokespecial   #416 <Method void forceUniformWidth(int, int)>
	//  756 1557:return          
	}

	protected void onDraw(Canvas canvas)
	{
		if(mDivider == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #253 <Field Drawable mDivider>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(mOrientation == 1)
	//*   4    8:aload_0         
	//*   5    9:getfield        #268 <Field int mOrientation>
	//*   6   12:iconst_1        
	//*   7   13:icmpne          22
		{
			drawDividersVertical(canvas);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #419 <Method void drawDividersVertical(Canvas)>
			return;
	//   11   21:return          
		} else
		{
			drawDividersHorizontal(canvas);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #421 <Method void drawDividersHorizontal(Canvas)>
			return;
	//   15   27:return          
		}
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #425 <Method void ViewGroup.onInitializeAccessibilityEvent(AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/widget/LinearLayoutCompat)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc1            #2   <Class LinearLayoutCompat>
	//    5    8:invokevirtual   #431 <Method String Class.getName()>
	//    6   11:invokevirtual   #437 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    7   14:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #441 <Method void ViewGroup.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
		accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/widget/LinearLayoutCompat)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc1            #2   <Class LinearLayoutCompat>
	//    5    8:invokevirtual   #431 <Method String Class.getName()>
	//    6   11:invokevirtual   #444 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
	//    7   14:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		if(mOrientation == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #268 <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          19
		{
			layoutVertical(i, j, k, l);
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:iload           5
	//    9   15:invokevirtual   #448 <Method void layoutVertical(int, int, int, int)>
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
	//   16   26:invokevirtual   #450 <Method void layoutHorizontal(int, int, int, int)>
			return;
	//   17   29:return          
		}
	}

	protected void onMeasure(int i, int j)
	{
		if(mOrientation == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #268 <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          15
		{
			measureVertical(i, j);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iload_2         
	//    7   11:invokevirtual   #453 <Method void measureVertical(int, int)>
			return;
	//    8   14:return          
		} else
		{
			measureHorizontal(i, j);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #455 <Method void measureHorizontal(int, int)>
			return;
	//   13   21:return          
		}
	}

	public void setBaselineAligned(boolean flag)
	{
		mBaselineAligned = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field boolean mBaselineAligned>
	//    3    5:return          
	}

	public void setBaselineAlignedChildIndex(int i)
	{
		if(i >= 0 && i < getChildCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            18
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #295 <Method int getChildCount()>
	//*   5    9:icmpge          18
		{
			mBaselineAlignedChildIndex = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #47  <Field int mBaselineAlignedChildIndex>
			return;
	//    9   17:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   18:new             #458 <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #460 <Method void StringBuilder()>
	//   13   25:astore_2        
			stringbuilder.append("base aligned child index out of range (0, ");
	//   14   26:aload_2         
	//   15   27:ldc2            #462 <String "base aligned child index out of range (0, ">
	//   16   30:invokevirtual   #466 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
			stringbuilder.append(getChildCount());
	//   18   34:aload_2         
	//   19   35:aload_0         
	//   20   36:invokevirtual   #295 <Method int getChildCount()>
	//   21   39:invokevirtual   #469 <Method StringBuilder StringBuilder.append(int)>
	//   22   42:pop             
			stringbuilder.append(")");
	//   23   43:aload_2         
	//   24   44:ldc2            #471 <String ")">
	//   25   47:invokevirtual   #466 <Method StringBuilder StringBuilder.append(String)>
	//   26   50:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   27   51:new             #473 <Class IllegalArgumentException>
	//   28   54:dup             
	//   29   55:aload_2         
	//   30   56:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   31   59:invokespecial   #477 <Method void IllegalArgumentException(String)>
	//   32   62:athrow          
		}
	}

	public void setDividerDrawable(Drawable drawable)
	{
		if(drawable == mDivider)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #253 <Field Drawable mDivider>
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		mDivider = drawable;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #253 <Field Drawable mDivider>
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
	//   14   22:invokevirtual   #480 <Method int Drawable.getIntrinsicWidth()>
	//   15   25:putfield        #214 <Field int mDividerWidth>
			mDividerHeight = drawable.getIntrinsicHeight();
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #483 <Method int Drawable.getIntrinsicHeight()>
	//   19   33:putfield        #236 <Field int mDividerHeight>
		} else
	//*  20   36:goto            49
		{
			mDividerWidth = 0;
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:putfield        #214 <Field int mDividerWidth>
			mDividerHeight = 0;
	//   24   44:aload_0         
	//   25   45:iconst_0        
	//   26   46:putfield        #236 <Field int mDividerHeight>
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
	//   33   57:invokevirtual   #486 <Method void setWillNotDraw(boolean)>
		requestLayout();
	//   34   60:aload_0         
	//   35   61:invokevirtual   #489 <Method void requestLayout()>
	//   36   64:return          
	}

	public void setDividerPadding(int i)
	{
		mDividerPadding = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #133 <Field int mDividerPadding>
	//    3    5:return          
	}

	public void setGravity(int i)
	{
		if(mGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int mGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          47
		{
			int j = i;
	//    4    8:iload_1         
	//    5    9:istore_2        
			if((0x800007 & i) == 0)
	//*   6   10:ldc2            #339 <Int 0x800007>
	//*   7   13:iload_1         
	//*   8   14:iand            
	//*   9   15:ifne            24
				j = i | 0x800003;
	//   10   18:iload_1         
	//   11   19:ldc2            #491 <Int 0x800003>
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
	//   26   40:putfield        #52  <Field int mGravity>
			requestLayout();
	//   27   43:aload_0         
	//   28   44:invokevirtual   #489 <Method void requestLayout()>
		}
	//   29   47:return          
	}

	public void setHorizontalGravity(int i)
	{
		i &= 0x800007;
	//    0    0:iload_1         
	//    1    1:ldc2            #339 <Int 0x800007>
	//    2    4:iand            
	//    3    5:istore_1        
		int j = mGravity;
	//    4    6:aload_0         
	//    5    7:getfield        #52  <Field int mGravity>
	//    6   10:istore_2        
		if((0x800007 & j) != i)
	//*   7   11:ldc2            #339 <Int 0x800007>
	//*   8   14:iload_2         
	//*   9   15:iand            
	//*  10   16:iload_1         
	//*  11   17:icmpeq          35
		{
			mGravity = i | 0xff7ffff8 & j;
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:ldc2            #493 <Int 0xff7ffff8>
	//   15   25:iload_2         
	//   16   26:iand            
	//   17   27:ior             
	//   18   28:putfield        #52  <Field int mGravity>
			requestLayout();
	//   19   31:aload_0         
	//   20   32:invokevirtual   #489 <Method void requestLayout()>
		}
	//   21   35:return          
	}

	public void setMeasureWithLargestChildEnabled(boolean flag)
	{
		mUseLargestChild = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #109 <Field boolean mUseLargestChild>
	//    3    5:return          
	}

	public void setOrientation(int i)
	{
		if(mOrientation != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #268 <Field int mOrientation>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mOrientation = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #268 <Field int mOrientation>
			requestLayout();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #489 <Method void requestLayout()>
		}
	//    9   17:return          
	}

	public void setShowDividers(int i)
	{
		if(i != mShowDividers)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #125 <Field int mShowDividers>
	//*   3    5:icmpeq          12
			requestLayout();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #489 <Method void requestLayout()>
		mShowDividers = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #125 <Field int mShowDividers>
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
	//    5    6:getfield        #52  <Field int mGravity>
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
	//   18   25:putfield        #52  <Field int mGravity>
			requestLayout();
	//   19   28:aload_0         
	//   20   29:invokevirtual   #489 <Method void requestLayout()>
		}
	//   21   32:return          
	}

	public void setWeightSum(float f)
	{
		mWeightSum = Math.max(0.0F, f);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:invokestatic    #501 <Method float Math.max(float, float)>
	//    4    6:putfield        #101 <Field float mWeightSum>
	//    5    9:return          
	}

	public boolean shouldDelayChildPressedState()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

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
