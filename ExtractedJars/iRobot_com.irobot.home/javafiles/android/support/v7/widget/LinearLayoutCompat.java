// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.view.d;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v7.widget:
//			av, bd

public class LinearLayoutCompat extends ViewGroup
{
	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		public float g;
		public int h;

		public LayoutParams(int i1, int j1)
		{
			super(i1, j1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #15  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			h = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #17  <Field int h>
			g = 0.0F;
		//    7   11:aload_0         
		//    8   12:fconst_0        
		//    9   13:putfield        #19  <Field float g>
		//   10   16:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #23  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			h = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #17  <Field int h>
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.a.a.j.LinearLayoutCompat_Layout)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #29  <Field int[] android.support.v7.a.a$j.LinearLayoutCompat_Layout>
		//   10   16:invokevirtual   #35  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_1        
			g = ((TypedArray) (context)).getFloat(android.support.v7.a.a.j.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:getstatic       #38  <Field int android.support.v7.a.a$j.LinearLayoutCompat_Layout_android_layout_weight>
		//   15   25:fconst_0        
		//   16   26:invokevirtual   #44  <Method float TypedArray.getFloat(int, float)>
		//   17   29:putfield        #19  <Field float g>
			h = ((TypedArray) (context)).getInt(android.support.v7.a.a.j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
		//   18   32:aload_0         
		//   19   33:aload_1         
		//   20   34:getstatic       #47  <Field int android.support.v7.a.a$j.LinearLayoutCompat_Layout_android_layout_gravity>
		//   21   37:iconst_m1       
		//   22   38:invokevirtual   #51  <Method int TypedArray.getInt(int, int)>
		//   23   41:putfield        #17  <Field int h>
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
			h = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #17  <Field int h>
		//    6   10:return          
		}
	}


	public LinearLayoutCompat(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #32  <Method void LinearLayoutCompat(Context, AttributeSet)>
	//    4    6:return          
	}

	public LinearLayoutCompat(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #36  <Method void LinearLayoutCompat(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public LinearLayoutCompat(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #37  <Method void ViewGroup(Context, AttributeSet, int)>
		a = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #39  <Field boolean a>
		b = -1;
	//    8   12:aload_0         
	//    9   13:iconst_m1       
	//   10   14:putfield        #41  <Field int b>
		c = 0;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #43  <Field int c>
		e = 0x800033;
	//   14   22:aload_0         
	//   15   23:ldc1            #44  <Int 0x800033>
	//   16   25:putfield        #46  <Field int e>
		context = ((Context) (av.a(context, attributeset, android.support.v7.a.a.j.LinearLayoutCompat, i1, 0)));
	//   17   28:aload_1         
	//   18   29:aload_2         
	//   19   30:getstatic       #51  <Field int[] android.support.v7.a.a$j.LinearLayoutCompat>
	//   20   33:iload_3         
	//   21   34:iconst_0        
	//   22   35:invokestatic    #56  <Method av av.a(Context, AttributeSet, int[], int, int)>
	//   23   38:astore_1        
		i1 = ((av) (context)).a(android.support.v7.a.a.j.LinearLayoutCompat_android_orientation, -1);
	//   24   39:aload_1         
	//   25   40:getstatic       #59  <Field int android.support.v7.a.a$j.LinearLayoutCompat_android_orientation>
	//   26   43:iconst_m1       
	//   27   44:invokevirtual   #62  <Method int av.a(int, int)>
	//   28   47:istore_3        
		if(i1 >= 0)
	//*  29   48:iload_3         
	//*  30   49:iflt            57
			setOrientation(i1);
	//   31   52:aload_0         
	//   32   53:iload_3         
	//   33   54:invokevirtual   #66  <Method void setOrientation(int)>
		i1 = ((av) (context)).a(android.support.v7.a.a.j.LinearLayoutCompat_android_gravity, -1);
	//   34   57:aload_1         
	//   35   58:getstatic       #69  <Field int android.support.v7.a.a$j.LinearLayoutCompat_android_gravity>
	//   36   61:iconst_m1       
	//   37   62:invokevirtual   #62  <Method int av.a(int, int)>
	//   38   65:istore_3        
		if(i1 >= 0)
	//*  39   66:iload_3         
	//*  40   67:iflt            75
			setGravity(i1);
	//   41   70:aload_0         
	//   42   71:iload_3         
	//   43   72:invokevirtual   #72  <Method void setGravity(int)>
		boolean flag = ((av) (context)).a(android.support.v7.a.a.j.LinearLayoutCompat_android_baselineAligned, true);
	//   44   75:aload_1         
	//   45   76:getstatic       #75  <Field int android.support.v7.a.a$j.LinearLayoutCompat_android_baselineAligned>
	//   46   79:iconst_1        
	//   47   80:invokevirtual   #78  <Method boolean av.a(int, boolean)>
	//   48   83:istore          4
		if(!flag)
	//*  49   85:iload           4
	//*  50   87:ifne            96
			setBaselineAligned(flag);
	//   51   90:aload_0         
	//   52   91:iload           4
	//   53   93:invokevirtual   #82  <Method void setBaselineAligned(boolean)>
		g = ((av) (context)).a(android.support.v7.a.a.j.LinearLayoutCompat_android_weightSum, -1F);
	//   54   96:aload_0         
	//   55   97:aload_1         
	//   56   98:getstatic       #85  <Field int android.support.v7.a.a$j.LinearLayoutCompat_android_weightSum>
	//   57  101:ldc1            #86  <Float -1F>
	//   58  103:invokevirtual   #89  <Method float av.a(int, float)>
	//   59  106:putfield        #91  <Field float g>
		b = ((av) (context)).a(android.support.v7.a.a.j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
	//   60  109:aload_0         
	//   61  110:aload_1         
	//   62  111:getstatic       #94  <Field int android.support.v7.a.a$j.LinearLayoutCompat_android_baselineAlignedChildIndex>
	//   63  114:iconst_m1       
	//   64  115:invokevirtual   #62  <Method int av.a(int, int)>
	//   65  118:putfield        #41  <Field int b>
		h = ((av) (context)).a(android.support.v7.a.a.j.LinearLayoutCompat_measureWithLargestChild, false);
	//   66  121:aload_0         
	//   67  122:aload_1         
	//   68  123:getstatic       #97  <Field int android.support.v7.a.a$j.LinearLayoutCompat_measureWithLargestChild>
	//   69  126:iconst_0        
	//   70  127:invokevirtual   #78  <Method boolean av.a(int, boolean)>
	//   71  130:putfield        #99  <Field boolean h>
		setDividerDrawable(((av) (context)).a(android.support.v7.a.a.j.LinearLayoutCompat_divider));
	//   72  133:aload_0         
	//   73  134:aload_1         
	//   74  135:getstatic       #102 <Field int android.support.v7.a.a$j.LinearLayoutCompat_divider>
	//   75  138:invokevirtual   #105 <Method Drawable av.a(int)>
	//   76  141:invokevirtual   #109 <Method void setDividerDrawable(Drawable)>
		n = ((av) (context)).a(android.support.v7.a.a.j.LinearLayoutCompat_showDividers, 0);
	//   77  144:aload_0         
	//   78  145:aload_1         
	//   79  146:getstatic       #112 <Field int android.support.v7.a.a$j.LinearLayoutCompat_showDividers>
	//   80  149:iconst_0        
	//   81  150:invokevirtual   #62  <Method int av.a(int, int)>
	//   82  153:putfield        #114 <Field int n>
		o = ((av) (context)).e(android.support.v7.a.a.j.LinearLayoutCompat_dividerPadding, 0);
	//   83  156:aload_0         
	//   84  157:aload_1         
	//   85  158:getstatic       #117 <Field int android.support.v7.a.a$j.LinearLayoutCompat_dividerPadding>
	//   86  161:iconst_0        
	//   87  162:invokevirtual   #119 <Method int av.e(int, int)>
	//   88  165:putfield        #121 <Field int o>
		((av) (context)).a();
	//   89  168:aload_1         
	//   90  169:invokevirtual   #124 <Method void av.a()>
	//   91  172:return          
	}

	private void a(View view, int i1, int j1, int k1, int l1)
	{
		view.layout(i1, j1, k1 + i1, l1 + j1);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload_2         
	//    5    6:iadd            
	//    6    7:iload           5
	//    7    9:iload_3         
	//    8   10:iadd            
	//    9   11:invokevirtual   #131 <Method void View.layout(int, int, int, int)>
	//   10   14:return          
	}

	private void c(int i1, int j1)
	{
		int l1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #136 <Method int getMeasuredWidth()>
	//    2    4:ldc1            #137 <Int 0x40000000>
	//    3    6:invokestatic    #142 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    4    9:istore          4
		for(int k1 = 0; k1 < i1; k1++)
	//*   5   11:iconst_0        
	//*   6   12:istore_3        
	//*   7   13:iload_3         
	//*   8   14:iload_1         
	//*   9   15:icmpge          96
		{
			View view = b(k1);
	//   10   18:aload_0         
	//   11   19:iload_3         
	//   12   20:invokevirtual   #145 <Method View b(int)>
	//   13   23:astore          6
			if(view.getVisibility() == 8)
				continue;
	//   14   25:aload           6
	//   15   27:invokevirtual   #148 <Method int View.getVisibility()>
	//   16   30:bipush          8
	//   17   32:icmpeq          89
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   18   35:aload           6
	//   19   37:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   40:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//   21   43:astore          7
			if(layoutparams.width == -1)
	//*  22   45:aload           7
	//*  23   47:getfield        #155 <Field int LinearLayoutCompat$LayoutParams.width>
	//*  24   50:iconst_m1       
	//*  25   51:icmpne          89
			{
				int i2 = layoutparams.height;
	//   26   54:aload           7
	//   27   56:getfield        #158 <Field int LinearLayoutCompat$LayoutParams.height>
	//   28   59:istore          5
				layoutparams.height = view.getMeasuredHeight();
	//   29   61:aload           7
	//   30   63:aload           6
	//   31   65:invokevirtual   #161 <Method int View.getMeasuredHeight()>
	//   32   68:putfield        #158 <Field int LinearLayoutCompat$LayoutParams.height>
				measureChildWithMargins(view, l1, 0, j1, 0);
	//   33   71:aload_0         
	//   34   72:aload           6
	//   35   74:iload           4
	//   36   76:iconst_0        
	//   37   77:iload_2         
	//   38   78:iconst_0        
	//   39   79:invokevirtual   #164 <Method void measureChildWithMargins(View, int, int, int, int)>
				layoutparams.height = i2;
	//   40   82:aload           7
	//   41   84:iload           5
	//   42   86:putfield        #158 <Field int LinearLayoutCompat$LayoutParams.height>
			}
		}

	//   43   89:iload_3         
	//   44   90:iconst_1        
	//   45   91:iadd            
	//   46   92:istore_3        
	//*  47   93:goto            13
	//   48   96:return          
	}

	private void d(int i1, int j1)
	{
		int l1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method int getMeasuredHeight()>
	//    2    4:ldc1            #137 <Int 0x40000000>
	//    3    6:invokestatic    #142 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    4    9:istore          4
		for(int k1 = 0; k1 < i1; k1++)
	//*   5   11:iconst_0        
	//*   6   12:istore_3        
	//*   7   13:iload_3         
	//*   8   14:iload_1         
	//*   9   15:icmpge          96
		{
			View view = b(k1);
	//   10   18:aload_0         
	//   11   19:iload_3         
	//   12   20:invokevirtual   #145 <Method View b(int)>
	//   13   23:astore          6
			if(view.getVisibility() == 8)
				continue;
	//   14   25:aload           6
	//   15   27:invokevirtual   #148 <Method int View.getVisibility()>
	//   16   30:bipush          8
	//   17   32:icmpeq          89
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   18   35:aload           6
	//   19   37:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   40:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//   21   43:astore          7
			if(layoutparams.height == -1)
	//*  22   45:aload           7
	//*  23   47:getfield        #158 <Field int LinearLayoutCompat$LayoutParams.height>
	//*  24   50:iconst_m1       
	//*  25   51:icmpne          89
			{
				int i2 = layoutparams.width;
	//   26   54:aload           7
	//   27   56:getfield        #155 <Field int LinearLayoutCompat$LayoutParams.width>
	//   28   59:istore          5
				layoutparams.width = view.getMeasuredWidth();
	//   29   61:aload           7
	//   30   63:aload           6
	//   31   65:invokevirtual   #166 <Method int View.getMeasuredWidth()>
	//   32   68:putfield        #155 <Field int LinearLayoutCompat$LayoutParams.width>
				measureChildWithMargins(view, j1, 0, l1, 0);
	//   33   71:aload_0         
	//   34   72:aload           6
	//   35   74:iload_2         
	//   36   75:iconst_0        
	//   37   76:iload           4
	//   38   78:iconst_0        
	//   39   79:invokevirtual   #164 <Method void measureChildWithMargins(View, int, int, int, int)>
				layoutparams.width = i2;
	//   40   82:aload           7
	//   41   84:iload           5
	//   42   86:putfield        #155 <Field int LinearLayoutCompat$LayoutParams.width>
			}
		}

	//   43   89:iload_3         
	//   44   90:iconst_1        
	//   45   91:iadd            
	//   46   92:istore_3        
	//*  47   93:goto            13
	//   48   96:return          
	}

	int a(View view)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	int a(View view, int i1)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	void a(int i1, int j1)
	{
		float f1;
		int k1;
		int l1;
		int i2;
		int j2;
		int k2;
		int l2;
		int i3;
		boolean flag;
		int i4;
		int j4;
		int i5;
		int k8;
		int l8;
		boolean flag1;
		k2 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          9
		f = 0;
	//    2    3:aload_0         
	//    3    4:iconst_0        
	//    4    5:putfield        #170 <Field int f>
		i4 = getVirtualChildCount();
	//    5    8:aload_0         
	//    6    9:invokevirtual   #173 <Method int getVirtualChildCount()>
	//    7   12:istore          13
		k8 = android.view.View.MeasureSpec.getMode(i1);
	//    8   14:iload_1         
	//    9   15:invokestatic    #177 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   10   18:istore          21
		l1 = android.view.View.MeasureSpec.getMode(j1);
	//   11   20:iload_2         
	//   12   21:invokestatic    #177 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   13   24:istore          6
		l8 = b;
	//   14   26:aload_0         
	//   15   27:getfield        #41  <Field int b>
	//   16   30:istore          22
		flag1 = h;
	//   17   32:aload_0         
	//   18   33:getfield        #99  <Field boolean h>
	//   19   36:istore          23
		f1 = 0.0F;
	//   20   38:fconst_0        
	//   21   39:fstore_3        
		k1 = 0;
	//   22   40:iconst_0        
	//   23   41:istore          5
		j2 = 0x80000000;
	//   24   43:ldc1            #178 <Int 0x80000000>
	//   25   45:istore          8
		j4 = 0;
	//   26   47:iconst_0        
	//   27   48:istore          14
		i3 = 0;
	//   28   50:iconst_0        
	//   29   51:istore          11
		i5 = 0;
	//   30   53:iconst_0        
	//   31   54:istore          15
		i2 = 1;
	//   32   56:iconst_1        
	//   33   57:istore          7
		flag = false;
	//   34   59:iconst_0        
	//   35   60:istore          12
		l2 = 0;
	//   36   62:iconst_0        
	//   37   63:istore          10
_L7:
		if(i3 >= i4) goto _L2; else goto _L1
	//   38   65:iload           11
	//   39   67:iload           13
	//   40   69:icmpge          689
_L1:
		View view = b(i3);
	//   41   72:aload_0         
	//   42   73:iload           11
	//   43   75:invokevirtual   #145 <Method View b(int)>
	//   44   78:astore          24
		if(view != null) goto _L4; else goto _L3
	//   45   80:aload           24
	//   46   82:ifnonnull       123
_L3:
		f = f + d(i3);
	//   47   85:aload_0         
	//   48   86:aload_0         
	//   49   87:getfield        #170 <Field int f>
	//   50   90:aload_0         
	//   51   91:iload           11
	//   52   93:invokevirtual   #180 <Method int d(int)>
	//   53   96:iadd            
	//   54   97:putfield        #170 <Field int f>
_L6:
		int l5;
		int k6;
		l5 = k2;
	//   55  100:iload           9
	//   56  102:istore          16
		k2 = j2;
	//   57  104:iload           8
	//   58  106:istore          9
		j2 = l5;
	//   59  108:iload           16
	//   60  110:istore          8
		k6 = i3;
	//   61  112:iload           11
	//   62  114:istore          17
		l5 = i2;
	//   63  116:iload           7
	//   64  118:istore          16
		break MISSING_BLOCK_LABEL_664;
	//   65  120:goto            664
_L4:
		if(view.getVisibility() != 8)
			break; /* Loop/switch isn't completed */
	//   66  123:aload           24
	//   67  125:invokevirtual   #148 <Method int View.getVisibility()>
	//   68  128:bipush          8
	//   69  130:icmpne          149
		i3 += a(view, i3);
	//   70  133:iload           11
	//   71  135:aload_0         
	//   72  136:aload           24
	//   73  138:iload           11
	//   74  140:invokevirtual   #182 <Method int a(View, int)>
	//   75  143:iadd            
	//   76  144:istore          11
		if(true) goto _L6; else goto _L5
	//   77  146:goto            100
_L5:
		if(c(i3))
	//*  78  149:aload_0         
	//*  79  150:iload           11
	//*  80  152:invokevirtual   #185 <Method boolean c(int)>
	//*  81  155:ifeq            171
			f = f + m;
	//   82  158:aload_0         
	//   83  159:aload_0         
	//   84  160:getfield        #170 <Field int f>
	//   85  163:aload_0         
	//   86  164:getfield        #187 <Field int m>
	//   87  167:iadd            
	//   88  168:putfield        #170 <Field int f>
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   89  171:aload           24
	//   90  173:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   91  176:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//   92  179:astore          25
		f1 += layoutparams.g;
	//   93  181:fload_3         
	//   94  182:aload           25
	//   95  184:getfield        #188 <Field float LinearLayoutCompat$LayoutParams.g>
	//   96  187:fadd            
	//   97  188:fstore_3        
		if(l1 == 0x40000000 && layoutparams.height == 0 && layoutparams.g > 0.0F)
	//*  98  189:iload           6
	//*  99  191:ldc1            #137 <Int 0x40000000>
	//* 100  193:icmpne          253
	//* 101  196:aload           25
	//* 102  198:getfield        #158 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 103  201:ifne            253
	//* 104  204:aload           25
	//* 105  206:getfield        #188 <Field float LinearLayoutCompat$LayoutParams.g>
	//* 106  209:fconst_0        
	//* 107  210:fcmpl           
	//* 108  211:ifle            253
		{
			i5 = f;
	//  109  214:aload_0         
	//  110  215:getfield        #170 <Field int f>
	//  111  218:istore          15
			l5 = layoutparams.topMargin;
	//  112  220:aload           25
	//  113  222:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  114  225:istore          16
			f = Math.max(i5, l5 + i5 + layoutparams.bottomMargin);
	//  115  227:aload_0         
	//  116  228:iload           15
	//  117  230:iload           16
	//  118  232:iload           15
	//  119  234:iadd            
	//  120  235:aload           25
	//  121  237:getfield        #194 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  122  240:iadd            
	//  123  241:invokestatic    #199 <Method int Math.max(int, int)>
	//  124  244:putfield        #170 <Field int f>
			i5 = 1;
	//  125  247:iconst_1        
	//  126  248:istore          15
		} else
	//* 127  250:goto            404
		{
			if(layoutparams.height == 0 && layoutparams.g > 0.0F)
	//* 128  253:aload           25
	//* 129  255:getfield        #158 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 130  258:ifne            284
	//* 131  261:aload           25
	//* 132  263:getfield        #188 <Field float LinearLayoutCompat$LayoutParams.g>
	//* 133  266:fconst_0        
	//* 134  267:fcmpl           
	//* 135  268:ifle            284
			{
				layoutparams.height = -2;
	//  136  271:aload           25
	//  137  273:bipush          -2
	//  138  275:putfield        #158 <Field int LinearLayoutCompat$LayoutParams.height>
				l5 = 0;
	//  139  278:iconst_0        
	//  140  279:istore          16
			} else
	//* 141  281:goto            288
			{
				l5 = 0x80000000;
	//  142  284:ldc1            #178 <Int 0x80000000>
	//  143  286:istore          16
			}
			if(f1 == 0.0F)
	//* 144  288:fload_3         
	//* 145  289:fconst_0        
	//* 146  290:fcmpl           
	//* 147  291:ifne            303
				k6 = f;
	//  148  294:aload_0         
	//  149  295:getfield        #170 <Field int f>
	//  150  298:istore          17
			else
	//* 151  300:goto            306
				k6 = 0;
	//  152  303:iconst_0        
	//  153  304:istore          17
			View view4 = view;
	//  154  306:aload           24
	//  155  308:astore          26
			LayoutParams layoutparams3 = layoutparams;
	//  156  310:aload           25
	//  157  312:astore          27
			a(view, i3, i1, 0, j1, k6);
	//  158  314:aload_0         
	//  159  315:aload           24
	//  160  317:iload           11
	//  161  319:iload_1         
	//  162  320:iconst_0        
	//  163  321:iload_2         
	//  164  322:iload           17
	//  165  324:invokevirtual   #202 <Method void a(View, int, int, int, int, int)>
			if(l5 != 0x80000000)
	//* 166  327:iload           16
	//* 167  329:ldc1            #178 <Int 0x80000000>
	//* 168  331:icmpeq          341
				layoutparams3.height = l5;
	//  169  334:aload           27
	//  170  336:iload           16
	//  171  338:putfield        #158 <Field int LinearLayoutCompat$LayoutParams.height>
			l5 = view4.getMeasuredHeight();
	//  172  341:aload           26
	//  173  343:invokevirtual   #161 <Method int View.getMeasuredHeight()>
	//  174  346:istore          16
			k6 = f;
	//  175  348:aload_0         
	//  176  349:getfield        #170 <Field int f>
	//  177  352:istore          17
			f = Math.max(k6, k6 + l5 + layoutparams3.topMargin + layoutparams3.bottomMargin + b(view4));
	//  178  354:aload_0         
	//  179  355:iload           17
	//  180  357:iload           17
	//  181  359:iload           16
	//  182  361:iadd            
	//  183  362:aload           27
	//  184  364:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  185  367:iadd            
	//  186  368:aload           27
	//  187  370:getfield        #194 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  188  373:iadd            
	//  189  374:aload_0         
	//  190  375:aload           26
	//  191  377:invokevirtual   #204 <Method int b(View)>
	//  192  380:iadd            
	//  193  381:invokestatic    #199 <Method int Math.max(int, int)>
	//  194  384:putfield        #170 <Field int f>
			if(flag1)
	//* 195  387:iload           23
	//* 196  389:ifeq            404
				j2 = Math.max(l5, j2);
	//  197  392:iload           16
	//  198  394:iload           8
	//  199  396:invokestatic    #199 <Method int Math.max(int, int)>
	//  200  399:istore          8
		}
	//* 201  401:goto            404
		int i7 = i3;
	//  202  404:iload           11
	//  203  406:istore          18
		if(l8 >= 0 && l8 == i7 + 1)
	//* 204  408:iload           22
	//* 205  410:iflt            430
	//* 206  413:iload           22
	//* 207  415:iload           18
	//* 208  417:iconst_1        
	//* 209  418:iadd            
	//* 210  419:icmpne          430
			c = f;
	//  211  422:aload_0         
	//  212  423:aload_0         
	//  213  424:getfield        #170 <Field int f>
	//  214  427:putfield        #43  <Field int c>
		if(i7 < l8 && layoutparams.g > 0.0F)
	//* 215  430:iload           18
	//* 216  432:iload           22
	//* 217  434:icmpge          457
	//* 218  437:aload           25
	//* 219  439:getfield        #188 <Field float LinearLayoutCompat$LayoutParams.g>
	//* 220  442:fconst_0        
	//* 221  443:fcmpl           
	//* 222  444:ifle            457
			throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
	//  223  447:new             #206 <Class RuntimeException>
	//  224  450:dup             
	//  225  451:ldc1            #208 <String "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.">
	//  226  453:invokespecial   #211 <Method void RuntimeException(String)>
	//  227  456:athrow          
		if(k8 != 0x40000000 && layoutparams.width == -1)
	//* 228  457:iload           21
	//* 229  459:ldc1            #137 <Int 0x40000000>
	//* 230  461:icmpeq          482
	//* 231  464:aload           25
	//* 232  466:getfield        #155 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 233  469:iconst_m1       
	//* 234  470:icmpne          482
		{
			i3 = 1;
	//  235  473:iconst_1        
	//  236  474:istore          11
			flag = true;
	//  237  476:iconst_1        
	//  238  477:istore          12
		} else
	//* 239  479:goto            485
		{
			i3 = 0;
	//  240  482:iconst_0        
	//  241  483:istore          11
		}
		l5 = layoutparams.leftMargin + layoutparams.rightMargin;
	//  242  485:aload           25
	//  243  487:getfield        #214 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  244  490:aload           25
	//  245  492:getfield        #217 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  246  495:iadd            
	//  247  496:istore          16
		k6 = view.getMeasuredWidth() + l5;
	//  248  498:aload           24
	//  249  500:invokevirtual   #166 <Method int View.getMeasuredWidth()>
	//  250  503:iload           16
	//  251  505:iadd            
	//  252  506:istore          17
		int k7 = Math.max(k1, k6);
	//  253  508:iload           5
	//  254  510:iload           17
	//  255  512:invokestatic    #199 <Method int Math.max(int, int)>
	//  256  515:istore          19
		int i8 = View.combineMeasuredStates(k2, view.getMeasuredState());
	//  257  517:iload           9
	//  258  519:aload           24
	//  259  521:invokevirtual   #220 <Method int View.getMeasuredState()>
	//  260  524:invokestatic    #223 <Method int View.combineMeasuredStates(int, int)>
	//  261  527:istore          20
		if(i2 != 0 && layoutparams.width == -1)
	//* 262  529:iload           7
	//* 263  531:ifeq            549
	//* 264  534:aload           25
	//* 265  536:getfield        #155 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 266  539:iconst_m1       
	//* 267  540:icmpne          549
			k1 = 1;
	//  268  543:iconst_1        
	//  269  544:istore          5
		else
	//* 270  546:goto            552
			k1 = 0;
	//  271  549:iconst_0        
	//  272  550:istore          5
		if(layoutparams.g > 0.0F)
	//* 273  552:aload           25
	//* 274  554:getfield        #188 <Field float LinearLayoutCompat$LayoutParams.g>
	//* 275  557:fconst_0        
	//* 276  558:fcmpl           
	//* 277  559:ifle            593
		{
			if(i3 == 0)
	//* 278  562:iload           11
	//* 279  564:ifeq            570
	//* 280  567:goto            577
				l5 = k6;
	//  281  570:iload           17
	//  282  572:istore          16
	//* 283  574:goto            567
			i2 = Math.max(j4, l5);
	//  284  577:iload           14
	//  285  579:iload           16
	//  286  581:invokestatic    #199 <Method int Math.max(int, int)>
	//  287  584:istore          7
			k2 = l2;
	//  288  586:iload           10
	//  289  588:istore          9
		} else
	//* 290  590:goto            615
		{
			if(i3 != 0)
	//* 291  593:iload           11
	//* 292  595:ifeq            602
				k6 = l5;
	//  293  598:iload           16
	//  294  600:istore          17
			k2 = Math.max(l2, k6);
	//  295  602:iload           10
	//  296  604:iload           17
	//  297  606:invokestatic    #199 <Method int Math.max(int, int)>
	//  298  609:istore          9
			i2 = j4;
	//  299  611:iload           14
	//  300  613:istore          7
		}
		l2 = a(view, i7);
	//  301  615:aload_0         
	//  302  616:aload           24
	//  303  618:iload           18
	//  304  620:invokevirtual   #182 <Method int a(View, int)>
	//  305  623:istore          10
		l5 = k1;
	//  306  625:iload           5
	//  307  627:istore          16
		k1 = k7;
	//  308  629:iload           19
	//  309  631:istore          5
		j4 = i8;
	//  310  633:iload           20
	//  311  635:istore          14
		i3 = j2;
	//  312  637:iload           8
	//  313  639:istore          11
		k6 = l2 + i7;
	//  314  641:iload           10
	//  315  643:iload           18
	//  316  645:iadd            
	//  317  646:istore          17
		l2 = k2;
	//  318  648:iload           9
	//  319  650:istore          10
		j2 = j4;
	//  320  652:iload           14
	//  321  654:istore          8
		j4 = i2;
	//  322  656:iload           7
	//  323  658:istore          14
		k2 = i3;
	//  324  660:iload           11
	//  325  662:istore          9
		i3 = k6 + 1;
	//  326  664:iload           17
	//  327  666:iconst_1        
	//  328  667:iadd            
	//  329  668:istore          11
		i2 = j2;
	//  330  670:iload           8
	//  331  672:istore          7
		j2 = k2;
	//  332  674:iload           9
	//  333  676:istore          8
		k2 = i2;
	//  334  678:iload           7
	//  335  680:istore          9
		i2 = l5;
	//  336  682:iload           16
	//  337  684:istore          7
		  goto _L7
	//* 338  686:goto            65
_L2:
		int l6;
label0:
		{
			int j3 = l2;
	//  339  689:iload           10
	//  340  691:istore          11
			if(f > 0 && c(i4))
	//* 341  693:aload_0         
	//* 342  694:getfield        #170 <Field int f>
	//* 343  697:ifle            725
	//* 344  700:aload_0         
	//* 345  701:iload           13
	//* 346  703:invokevirtual   #185 <Method boolean c(int)>
	//* 347  706:ifeq            725
				f = f + m;
	//  348  709:aload_0         
	//  349  710:aload_0         
	//  350  711:getfield        #170 <Field int f>
	//  351  714:aload_0         
	//  352  715:getfield        #187 <Field int m>
	//  353  718:iadd            
	//  354  719:putfield        #170 <Field int f>
	//* 355  722:goto            725
			if(flag1)
	//* 356  725:iload           23
	//* 357  727:ifeq            876
			{
				l2 = l1;
	//  358  730:iload           6
	//  359  732:istore          10
				if(l2 == 0x80000000 || l2 == 0)
	//* 360  734:iload           10
	//* 361  736:ldc1            #178 <Int 0x80000000>
	//* 362  738:icmpeq          746
	//* 363  741:iload           10
	//* 364  743:ifne            876
				{
					f = 0;
	//  365  746:aload_0         
	//  366  747:iconst_0        
	//  367  748:putfield        #170 <Field int f>
					for(l2 = 0; l2 < i4; l2++)
	//* 368  751:iconst_0        
	//* 369  752:istore          10
	//* 370  754:iload           10
	//* 371  756:iload           13
	//* 372  758:icmpge          876
					{
						View view1 = b(l2);
	//  373  761:aload_0         
	//  374  762:iload           10
	//  375  764:invokevirtual   #145 <Method View b(int)>
	//  376  767:astore          24
						if(view1 == null)
	//* 377  769:aload           24
	//* 378  771:ifnonnull       792
						{
							f = f + d(l2);
	//  379  774:aload_0         
	//  380  775:aload_0         
	//  381  776:getfield        #170 <Field int f>
	//  382  779:aload_0         
	//  383  780:iload           10
	//  384  782:invokevirtual   #180 <Method int d(int)>
	//  385  785:iadd            
	//  386  786:putfield        #170 <Field int f>
							continue;
	//  387  789:goto            867
						}
						if(view1.getVisibility() == 8)
	//* 388  792:aload           24
	//* 389  794:invokevirtual   #148 <Method int View.getVisibility()>
	//* 390  797:bipush          8
	//* 391  799:icmpne          818
						{
							l2 += a(view1, l2);
	//  392  802:iload           10
	//  393  804:aload_0         
	//  394  805:aload           24
	//  395  807:iload           10
	//  396  809:invokevirtual   #182 <Method int a(View, int)>
	//  397  812:iadd            
	//  398  813:istore          10
						} else
	//* 399  815:goto            867
						{
							LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  400  818:aload           24
	//  401  820:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  402  823:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//  403  826:astore          25
							int i6 = f;
	//  404  828:aload_0         
	//  405  829:getfield        #170 <Field int f>
	//  406  832:istore          16
							f = Math.max(i6, i6 + j2 + layoutparams1.topMargin + layoutparams1.bottomMargin + b(view1));
	//  407  834:aload_0         
	//  408  835:iload           16
	//  409  837:iload           16
	//  410  839:iload           8
	//  411  841:iadd            
	//  412  842:aload           25
	//  413  844:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  414  847:iadd            
	//  415  848:aload           25
	//  416  850:getfield        #194 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  417  853:iadd            
	//  418  854:aload_0         
	//  419  855:aload           24
	//  420  857:invokevirtual   #204 <Method int b(View)>
	//  421  860:iadd            
	//  422  861:invokestatic    #199 <Method int Math.max(int, int)>
	//  423  864:putfield        #170 <Field int f>
						}
					}

	//  424  867:iload           10
	//  425  869:iconst_1        
	//  426  870:iadd            
	//  427  871:istore          10
				}
			}
	//* 428  873:goto            754
			int j6 = l1;
	//  429  876:iload           6
	//  430  878:istore          16
			f = f + (getPaddingTop() + getPaddingBottom());
	//  431  880:aload_0         
	//  432  881:aload_0         
	//  433  882:getfield        #170 <Field int f>
	//  434  885:aload_0         
	//  435  886:invokevirtual   #226 <Method int getPaddingTop()>
	//  436  889:aload_0         
	//  437  890:invokevirtual   #229 <Method int getPaddingBottom()>
	//  438  893:iadd            
	//  439  894:iadd            
	//  440  895:putfield        #170 <Field int f>
			l6 = View.resolveSizeAndState(Math.max(f, getSuggestedMinimumHeight()), j1, 0);
	//  441  898:aload_0         
	//  442  899:getfield        #170 <Field int f>
	//  443  902:aload_0         
	//  444  903:invokevirtual   #232 <Method int getSuggestedMinimumHeight()>
	//  445  906:invokestatic    #199 <Method int Math.max(int, int)>
	//  446  909:iload_2         
	//  447  910:iconst_0        
	//  448  911:invokestatic    #236 <Method int View.resolveSizeAndState(int, int, int)>
	//  449  914:istore          17
			l1 = (0xffffff & l6) - f;
	//  450  916:ldc1            #237 <Int 0xffffff>
	//  451  918:iload           17
	//  452  920:iand            
	//  453  921:aload_0         
	//  454  922:getfield        #170 <Field int f>
	//  455  925:isub            
	//  456  926:istore          6
			if(i5 == 0 && (l1 == 0 || f1 <= 0.0F))
	//* 457  928:iload           15
	//* 458  930:ifne            1058
	//* 459  933:iload           6
	//* 460  935:ifeq            947
	//* 461  938:fload_3         
	//* 462  939:fconst_0        
	//* 463  940:fcmpl           
	//* 464  941:ifle            947
	//* 465  944:goto            1058
			{
				l2 = Math.max(j3, j4);
	//  466  947:iload           11
	//  467  949:iload           14
	//  468  951:invokestatic    #199 <Method int Math.max(int, int)>
	//  469  954:istore          10
				if(flag1 && j6 != 0x40000000)
	//* 470  956:iload           23
	//* 471  958:ifeq            1051
	//* 472  961:iload           16
	//* 473  963:ldc1            #137 <Int 0x40000000>
	//* 474  965:icmpeq          1051
					for(l1 = 0; l1 < i4; l1++)
	//* 475  968:iconst_0        
	//* 476  969:istore          6
	//* 477  971:iload           6
	//* 478  973:iload           13
	//* 479  975:icmpge          1051
					{
						View view2 = b(l1);
	//  480  978:aload_0         
	//  481  979:iload           6
	//  482  981:invokevirtual   #145 <Method View b(int)>
	//  483  984:astore          24
						if(view2 != null && view2.getVisibility() != 8 && ((LayoutParams)view2.getLayoutParams()).g > 0.0F)
	//* 484  986:aload           24
	//* 485  988:ifnull          1042
	//* 486  991:aload           24
	//* 487  993:invokevirtual   #148 <Method int View.getVisibility()>
	//* 488  996:bipush          8
	//* 489  998:icmpne          1004
	//* 490 1001:goto            1042
	//* 491 1004:aload           24
	//* 492 1006:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 493 1009:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//* 494 1012:getfield        #188 <Field float LinearLayoutCompat$LayoutParams.g>
	//* 495 1015:fconst_0        
	//* 496 1016:fcmpl           
	//* 497 1017:ifle            1042
							view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000));
	//  498 1020:aload           24
	//  499 1022:aload           24
	//  500 1024:invokevirtual   #166 <Method int View.getMeasuredWidth()>
	//  501 1027:ldc1            #137 <Int 0x40000000>
	//  502 1029:invokestatic    #142 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  503 1032:iload           8
	//  504 1034:ldc1            #137 <Int 0x40000000>
	//  505 1036:invokestatic    #142 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  506 1039:invokevirtual   #240 <Method void View.measure(int, int)>
					}

	//  507 1042:iload           6
	//  508 1044:iconst_1        
	//  509 1045:iadd            
	//  510 1046:istore          6
	//* 511 1048:goto            971
				l1 = l2;
	//  512 1051:iload           10
	//  513 1053:istore          6
				break label0;
	//  514 1055:goto            1499
			}
			if(g > 0.0F)
	//* 515 1058:aload_0         
	//* 516 1059:getfield        #91  <Field float g>
	//* 517 1062:fconst_0        
	//* 518 1063:fcmpl           
	//* 519 1064:ifle            1072
				f1 = g;
	//  520 1067:aload_0         
	//  521 1068:getfield        #91  <Field float g>
	//  522 1071:fstore_3        
			f = 0;
	//  523 1072:aload_0         
	//  524 1073:iconst_0        
	//  525 1074:putfield        #170 <Field int f>
			l2 = 0;
	//  526 1077:iconst_0        
	//  527 1078:istore          10
			j2 = k1;
	//  528 1080:iload           5
	//  529 1082:istore          8
			k1 = k2;
	//  530 1084:iload           9
	//  531 1086:istore          5
			k2 = l1;
	//  532 1088:iload           6
	//  533 1090:istore          9
			l1 = j3;
	//  534 1092:iload           11
	//  535 1094:istore          6
			for(; l2 < i4; l2++)
	//* 536 1096:iload           10
	//* 537 1098:iload           13
	//* 538 1100:icmpge          1473
			{
				View view3;
				LayoutParams layoutparams2;
label1:
				{
					int k3;
					int j5;
label2:
					{
						view3 = b(l2);
	//  539 1103:aload_0         
	//  540 1104:iload           10
	//  541 1106:invokevirtual   #145 <Method View b(int)>
	//  542 1109:astore          24
						if(view3.getVisibility() == 8)
	//* 543 1111:aload           24
	//* 544 1113:invokevirtual   #148 <Method int View.getVisibility()>
	//* 545 1116:bipush          8
	//* 546 1118:icmpne          1124
							continue;
	//  547 1121:goto            1464
						layoutparams2 = (LayoutParams)view3.getLayoutParams();
	//  548 1124:aload           24
	//  549 1126:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  550 1129:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//  551 1132:astore          25
						float f2 = layoutparams2.g;
	//  552 1134:aload           25
	//  553 1136:getfield        #188 <Field float LinearLayoutCompat$LayoutParams.g>
	//  554 1139:fstore          4
						if(f2 <= 0.0F)
							break label1;
	//  555 1141:fload           4
	//  556 1143:fconst_0        
	//  557 1144:fcmpl           
	//  558 1145:ifle            1312
						int k4 = (int)(((float)k2 * f2) / f1);
	//  559 1148:iload           9
	//  560 1150:i2f             
	//  561 1151:fload           4
	//  562 1153:fmul            
	//  563 1154:fload_3         
	//  564 1155:fdiv            
	//  565 1156:f2i             
	//  566 1157:istore          14
						j5 = getPaddingLeft();
	//  567 1159:aload_0         
	//  568 1160:invokevirtual   #243 <Method int getPaddingLeft()>
	//  569 1163:istore          15
						int j7 = getPaddingRight();
	//  570 1165:aload_0         
	//  571 1166:invokevirtual   #246 <Method int getPaddingRight()>
	//  572 1169:istore          18
						k3 = k2 - k4;
	//  573 1171:iload           9
	//  574 1173:iload           14
	//  575 1175:isub            
	//  576 1176:istore          11
						k2 = layoutparams2.leftMargin;
	//  577 1178:aload           25
	//  578 1180:getfield        #214 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  579 1183:istore          9
						int l7 = layoutparams2.rightMargin;
	//  580 1185:aload           25
	//  581 1187:getfield        #217 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  582 1190:istore          19
						int j8 = layoutparams2.width;
	//  583 1192:aload           25
	//  584 1194:getfield        #155 <Field int LinearLayoutCompat$LayoutParams.width>
	//  585 1197:istore          20
						f1 -= f2;
	//  586 1199:fload_3         
	//  587 1200:fload           4
	//  588 1202:fsub            
	//  589 1203:fstore_3        
						j5 = getChildMeasureSpec(i1, j5 + j7 + k2 + l7, j8);
	//  590 1204:iload_1         
	//  591 1205:iload           15
	//  592 1207:iload           18
	//  593 1209:iadd            
	//  594 1210:iload           9
	//  595 1212:iadd            
	//  596 1213:iload           19
	//  597 1215:iadd            
	//  598 1216:iload           20
	//  599 1218:invokestatic    #249 <Method int getChildMeasureSpec(int, int, int)>
	//  600 1221:istore          15
						if(layoutparams2.height == 0 && j6 == 0x40000000)
	//* 601 1223:aload           25
	//* 602 1225:getfield        #158 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 603 1228:ifne            1253
	//* 604 1231:iload           16
	//* 605 1233:ldc1            #137 <Int 0x40000000>
	//* 606 1235:icmpeq          1241
	//* 607 1238:goto            1253
						{
							if(k4 > 0)
	//* 608 1241:iload           14
	//* 609 1243:ifle            1272
							{
								k2 = k4;
	//  610 1246:iload           14
	//  611 1248:istore          9
								break label2;
	//  612 1250:goto            1275
							}
						} else
						{
							k4 = view3.getMeasuredHeight() + k4;
	//  613 1253:aload           24
	//  614 1255:invokevirtual   #161 <Method int View.getMeasuredHeight()>
	//  615 1258:iload           14
	//  616 1260:iadd            
	//  617 1261:istore          14
							k2 = k4;
	//  618 1263:iload           14
	//  619 1265:istore          9
							if(k4 >= 0)
								break label2;
	//  620 1267:iload           14
	//  621 1269:ifge            1275
						}
						k2 = 0;
	//  622 1272:iconst_0        
	//  623 1273:istore          9
					}
					view3.measure(j5, android.view.View.MeasureSpec.makeMeasureSpec(k2, 0x40000000));
	//  624 1275:aload           24
	//  625 1277:iload           15
	//  626 1279:iload           9
	//  627 1281:ldc1            #137 <Int 0x40000000>
	//  628 1283:invokestatic    #142 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  629 1286:invokevirtual   #240 <Method void View.measure(int, int)>
					k1 = View.combineMeasuredStates(k1, view3.getMeasuredState() & 0xffffff00);
	//  630 1289:iload           5
	//  631 1291:aload           24
	//  632 1293:invokevirtual   #220 <Method int View.getMeasuredState()>
	//  633 1296:sipush          -256
	//  634 1299:iand            
	//  635 1300:invokestatic    #223 <Method int View.combineMeasuredStates(int, int)>
	//  636 1303:istore          5
					k2 = k3;
	//  637 1305:iload           11
	//  638 1307:istore          9
				}
	//* 639 1309:goto            1312
				int k5 = layoutparams2.leftMargin + layoutparams2.rightMargin;
	//  640 1312:aload           25
	//  641 1314:getfield        #214 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  642 1317:aload           25
	//  643 1319:getfield        #217 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  644 1322:iadd            
	//  645 1323:istore          15
				int l3 = view3.getMeasuredWidth() + k5;
	//  646 1325:aload           24
	//  647 1327:invokevirtual   #166 <Method int View.getMeasuredWidth()>
	//  648 1330:iload           15
	//  649 1332:iadd            
	//  650 1333:istore          11
				int l4 = Math.max(j2, l3);
	//  651 1335:iload           8
	//  652 1337:iload           11
	//  653 1339:invokestatic    #199 <Method int Math.max(int, int)>
	//  654 1342:istore          14
				if(k8 != 0x40000000 && layoutparams2.width == -1)
	//* 655 1344:iload           21
	//* 656 1346:ldc1            #137 <Int 0x40000000>
	//* 657 1348:icmpeq          1366
	//* 658 1351:aload           25
	//* 659 1353:getfield        #155 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 660 1356:iconst_m1       
	//* 661 1357:icmpne          1366
					j2 = 1;
	//  662 1360:iconst_1        
	//  663 1361:istore          8
				else
	//* 664 1363:goto            1369
					j2 = 0;
	//  665 1366:iconst_0        
	//  666 1367:istore          8
				if(j2 != 0)
	//* 667 1369:iload           8
	//* 668 1371:ifeq            1378
					l3 = k5;
	//  669 1374:iload           15
	//  670 1376:istore          11
				l3 = Math.max(l1, l3);
	//  671 1378:iload           6
	//  672 1380:iload           11
	//  673 1382:invokestatic    #199 <Method int Math.max(int, int)>
	//  674 1385:istore          11
				if(i2 != 0 && layoutparams2.width == -1)
	//* 675 1387:iload           7
	//* 676 1389:ifeq            1407
	//* 677 1392:aload           25
	//* 678 1394:getfield        #155 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 679 1397:iconst_m1       
	//* 680 1398:icmpne          1407
					l1 = 1;
	//  681 1401:iconst_1        
	//  682 1402:istore          6
				else
	//* 683 1404:goto            1410
					l1 = 0;
	//  684 1407:iconst_0        
	//  685 1408:istore          6
				i2 = f;
	//  686 1410:aload_0         
	//  687 1411:getfield        #170 <Field int f>
	//  688 1414:istore          7
				f = Math.max(i2, i2 + view3.getMeasuredHeight() + layoutparams2.topMargin + layoutparams2.bottomMargin + b(view3));
	//  689 1416:aload_0         
	//  690 1417:iload           7
	//  691 1419:iload           7
	//  692 1421:aload           24
	//  693 1423:invokevirtual   #161 <Method int View.getMeasuredHeight()>
	//  694 1426:iadd            
	//  695 1427:aload           25
	//  696 1429:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  697 1432:iadd            
	//  698 1433:aload           25
	//  699 1435:getfield        #194 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  700 1438:iadd            
	//  701 1439:aload_0         
	//  702 1440:aload           24
	//  703 1442:invokevirtual   #204 <Method int b(View)>
	//  704 1445:iadd            
	//  705 1446:invokestatic    #199 <Method int Math.max(int, int)>
	//  706 1449:putfield        #170 <Field int f>
				i2 = l1;
	//  707 1452:iload           6
	//  708 1454:istore          7
				j2 = l4;
	//  709 1456:iload           14
	//  710 1458:istore          8
				l1 = l3;
	//  711 1460:iload           11
	//  712 1462:istore          6
			}

	//  713 1464:iload           10
	//  714 1466:iconst_1        
	//  715 1467:iadd            
	//  716 1468:istore          10
	//* 717 1470:goto            1096
			f = f + (getPaddingTop() + getPaddingBottom());
	//  718 1473:aload_0         
	//  719 1474:aload_0         
	//  720 1475:getfield        #170 <Field int f>
	//  721 1478:aload_0         
	//  722 1479:invokevirtual   #226 <Method int getPaddingTop()>
	//  723 1482:aload_0         
	//  724 1483:invokevirtual   #229 <Method int getPaddingBottom()>
	//  725 1486:iadd            
	//  726 1487:iadd            
	//  727 1488:putfield        #170 <Field int f>
			k2 = k1;
	//  728 1491:iload           5
	//  729 1493:istore          9
			k1 = j2;
	//  730 1495:iload           8
	//  731 1497:istore          5
		}
		j2 = k1;
	//  732 1499:iload           5
	//  733 1501:istore          8
		if(i2 == 0)
	//* 734 1503:iload           7
	//* 735 1505:ifne            1523
		{
			j2 = k1;
	//  736 1508:iload           5
	//  737 1510:istore          8
			if(k8 != 0x40000000)
	//* 738 1512:iload           21
	//* 739 1514:ldc1            #137 <Int 0x40000000>
	//* 740 1516:icmpeq          1523
				j2 = l1;
	//  741 1519:iload           6
	//  742 1521:istore          8
		}
		setMeasuredDimension(View.resolveSizeAndState(Math.max(j2 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i1, k2), l6);
	//  743 1523:aload_0         
	//  744 1524:iload           8
	//  745 1526:aload_0         
	//  746 1527:invokevirtual   #243 <Method int getPaddingLeft()>
	//  747 1530:aload_0         
	//  748 1531:invokevirtual   #246 <Method int getPaddingRight()>
	//  749 1534:iadd            
	//  750 1535:iadd            
	//  751 1536:aload_0         
	//  752 1537:invokevirtual   #252 <Method int getSuggestedMinimumWidth()>
	//  753 1540:invokestatic    #199 <Method int Math.max(int, int)>
	//  754 1543:iload_1         
	//  755 1544:iload           9
	//  756 1546:invokestatic    #236 <Method int View.resolveSizeAndState(int, int, int)>
	//  757 1549:iload           17
	//  758 1551:invokevirtual   #255 <Method void setMeasuredDimension(int, int)>
		if(flag)
	//* 759 1554:iload           12
	//* 760 1556:ifeq            1566
			c(i4, j1);
	//  761 1559:aload_0         
	//  762 1560:iload           13
	//  763 1562:iload_2         
	//  764 1563:invokespecial   #257 <Method void c(int, int)>
		return;
	//  765 1566:return          
	}

	void a(int i1, int j1, int k1, int l1)
	{
		int i2 = getPaddingLeft();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #243 <Method int getPaddingLeft()>
	//    2    4:istore          5
		int j2 = k1 - i1;
	//    3    6:iload_3         
	//    4    7:iload_1         
	//    5    8:isub            
	//    6    9:istore          6
		int k2 = getPaddingRight();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #246 <Method int getPaddingRight()>
	//    9   15:istore          7
		int l2 = getPaddingRight();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #246 <Method int getPaddingRight()>
	//   12   21:istore          8
		int i3 = getVirtualChildCount();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #173 <Method int getVirtualChildCount()>
	//   15   27:istore          9
		i1 = e & 0x70;
	//   16   29:aload_0         
	//   17   30:getfield        #46  <Field int e>
	//   18   33:bipush          112
	//   19   35:iand            
	//   20   36:istore_1        
		int j3 = e;
	//   21   37:aload_0         
	//   22   38:getfield        #46  <Field int e>
	//   23   41:istore          10
		if(i1 != 16)
	//*  24   43:iload_1         
	//*  25   44:bipush          16
	//*  26   46:icmpeq          81
		{
			if(i1 != 80)
	//*  27   49:iload_1         
	//*  28   50:bipush          80
	//*  29   52:icmpeq          63
				i1 = getPaddingTop();
	//   30   55:aload_0         
	//   31   56:invokevirtual   #226 <Method int getPaddingTop()>
	//   32   59:istore_1        
			else
	//*  33   60:goto            100
				i1 = (getPaddingTop() + l1) - j1 - f;
	//   34   63:aload_0         
	//   35   64:invokevirtual   #226 <Method int getPaddingTop()>
	//   36   67:iload           4
	//   37   69:iadd            
	//   38   70:iload_2         
	//   39   71:isub            
	//   40   72:aload_0         
	//   41   73:getfield        #170 <Field int f>
	//   42   76:isub            
	//   43   77:istore_1        
		} else
	//*  44   78:goto            100
		{
			i1 = getPaddingTop();
	//   45   81:aload_0         
	//   46   82:invokevirtual   #226 <Method int getPaddingTop()>
	//   47   85:istore_1        
			i1 = (l1 - j1 - f) / 2 + i1;
	//   48   86:iload           4
	//   49   88:iload_2         
	//   50   89:isub            
	//   51   90:aload_0         
	//   52   91:getfield        #170 <Field int f>
	//   53   94:isub            
	//   54   95:iconst_2        
	//   55   96:idiv            
	//   56   97:iload_1         
	//   57   98:iadd            
	//   58   99:istore_1        
		}
		for(j1 = 0; j1 < i3;)
	//*  59  100:iconst_0        
	//*  60  101:istore_2        
	//*  61  102:iload_2         
	//*  62  103:iload           9
	//*  63  105:icmpge          370
		{
label0:
			{
				int k3;
				int l3;
				View view;
				LayoutParams layoutparams;
label1:
				{
					view = b(j1);
	//   64  108:aload_0         
	//   65  109:iload_2         
	//   66  110:invokevirtual   #145 <Method View b(int)>
	//   67  113:astore          13
					if(view == null)
	//*  68  115:aload           13
	//*  69  117:ifnonnull       134
					{
						k1 = i1 + d(j1);
	//   70  120:iload_1         
	//   71  121:aload_0         
	//   72  122:iload_2         
	//   73  123:invokevirtual   #180 <Method int d(int)>
	//   74  126:iadd            
	//   75  127:istore_3        
						l1 = j1;
	//   76  128:iload_2         
	//   77  129:istore          4
						break label0;
	//   78  131:goto            360
					}
					k1 = i1;
	//   79  134:iload_1         
	//   80  135:istore_3        
					l1 = j1;
	//   81  136:iload_2         
	//   82  137:istore          4
					if(view.getVisibility() == 8)
						break label0;
	//   83  139:aload           13
	//   84  141:invokevirtual   #148 <Method int View.getVisibility()>
	//   85  144:bipush          8
	//   86  146:icmpeq          131
					l3 = view.getMeasuredWidth();
	//   87  149:aload           13
	//   88  151:invokevirtual   #166 <Method int View.getMeasuredWidth()>
	//   89  154:istore          12
					k3 = view.getMeasuredHeight();
	//   90  156:aload           13
	//   91  158:invokevirtual   #161 <Method int View.getMeasuredHeight()>
	//   92  161:istore          11
					layoutparams = (LayoutParams)view.getLayoutParams();
	//   93  163:aload           13
	//   94  165:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   95  168:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//   96  171:astore          14
					l1 = layoutparams.h;
	//   97  173:aload           14
	//   98  175:getfield        #259 <Field int LinearLayoutCompat$LayoutParams.h>
	//   99  178:istore          4
					k1 = l1;
	//  100  180:iload           4
	//  101  182:istore_3        
					if(l1 < 0)
	//* 102  183:iload           4
	//* 103  185:ifge            195
						k1 = j3 & 0x800007;
	//  104  188:iload           10
	//  105  190:ldc2            #260 <Int 0x800007>
	//  106  193:iand            
	//  107  194:istore_3        
					k1 = android.support.v4.view.d.a(k1, s.e(((View) (this)))) & 7;
	//  108  195:iload_3         
	//  109  196:aload_0         
	//  110  197:invokestatic    #264 <Method int s.e(View)>
	//  111  200:invokestatic    #267 <Method int d.a(int, int)>
	//  112  203:bipush          7
	//  113  205:iand            
	//  114  206:istore_3        
					if(k1 != 1)
	//* 115  207:iload_3         
	//* 116  208:iconst_1        
	//* 117  209:icmpeq          241
					{
						if(k1 != 5)
	//* 118  212:iload_3         
	//* 119  213:iconst_5        
	//* 120  214:icmpeq          229
						{
							k1 = layoutparams.leftMargin + i2;
	//  121  217:aload           14
	//  122  219:getfield        #214 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  123  222:iload           5
	//  124  224:iadd            
	//  125  225:istore_3        
							break label1;
	//  126  226:goto            275
						}
						k1 = j2 - k2 - l3;
	//  127  229:iload           6
	//  128  231:iload           7
	//  129  233:isub            
	//  130  234:iload           12
	//  131  236:isub            
	//  132  237:istore_3        
					} else
	//* 133  238:goto            264
					{
						k1 = (j2 - i2 - l2 - l3) / 2 + i2 + layoutparams.leftMargin;
	//  134  241:iload           6
	//  135  243:iload           5
	//  136  245:isub            
	//  137  246:iload           8
	//  138  248:isub            
	//  139  249:iload           12
	//  140  251:isub            
	//  141  252:iconst_2        
	//  142  253:idiv            
	//  143  254:iload           5
	//  144  256:iadd            
	//  145  257:aload           14
	//  146  259:getfield        #214 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  147  262:iadd            
	//  148  263:istore_3        
					}
					k1 -= layoutparams.rightMargin;
	//  149  264:iload_3         
	//  150  265:aload           14
	//  151  267:getfield        #217 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  152  270:isub            
	//  153  271:istore_3        
				}
	//* 154  272:goto            226
				l1 = i1;
	//  155  275:iload_1         
	//  156  276:istore          4
				if(c(j1))
	//* 157  278:aload_0         
	//* 158  279:iload_2         
	//* 159  280:invokevirtual   #185 <Method boolean c(int)>
	//* 160  283:ifeq            294
					l1 = i1 + m;
	//  161  286:iload_1         
	//  162  287:aload_0         
	//  163  288:getfield        #187 <Field int m>
	//  164  291:iadd            
	//  165  292:istore          4
				i1 = l1 + layoutparams.topMargin;
	//  166  294:iload           4
	//  167  296:aload           14
	//  168  298:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  169  301:iadd            
	//  170  302:istore_1        
				a(view, k1, i1 + a(view), l3, k3);
	//  171  303:aload_0         
	//  172  304:aload           13
	//  173  306:iload_3         
	//  174  307:iload_1         
	//  175  308:aload_0         
	//  176  309:aload           13
	//  177  311:invokevirtual   #269 <Method int a(View)>
	//  178  314:iadd            
	//  179  315:iload           12
	//  180  317:iload           11
	//  181  319:invokespecial   #271 <Method void a(View, int, int, int, int)>
				k1 = layoutparams.bottomMargin;
	//  182  322:aload           14
	//  183  324:getfield        #194 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  184  327:istore_3        
				l3 = b(view);
	//  185  328:aload_0         
	//  186  329:aload           13
	//  187  331:invokevirtual   #204 <Method int b(View)>
	//  188  334:istore          12
				l1 = j1 + a(view, j1);
	//  189  336:iload_2         
	//  190  337:aload_0         
	//  191  338:aload           13
	//  192  340:iload_2         
	//  193  341:invokevirtual   #182 <Method int a(View, int)>
	//  194  344:iadd            
	//  195  345:istore          4
				k1 = i1 + (k3 + k1 + l3);
	//  196  347:iload_1         
	//  197  348:iload           11
	//  198  350:iload_3         
	//  199  351:iadd            
	//  200  352:iload           12
	//  201  354:iadd            
	//  202  355:iadd            
	//  203  356:istore_3        
			}
	//* 204  357:goto            131
			j1 = l1 + 1;
	//  205  360:iload           4
	//  206  362:iconst_1        
	//  207  363:iadd            
	//  208  364:istore_2        
			i1 = k1;
	//  209  365:iload_3         
	//  210  366:istore_1        
		}

	//* 211  367:goto            102
	//  212  370:return          
	}

	void a(Canvas canvas)
	{
		int k1 = getVirtualChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #173 <Method int getVirtualChildCount()>
	//    2    4:istore_3        
		for(int i1 = 0; i1 < k1; i1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          80
		{
			View view = b(i1);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #145 <Method View b(int)>
	//   11   17:astore          4
			if(view != null && view.getVisibility() != 8 && c(i1))
	//*  12   19:aload           4
	//*  13   21:ifnull          73
	//*  14   24:aload           4
	//*  15   26:invokevirtual   #148 <Method int View.getVisibility()>
	//*  16   29:bipush          8
	//*  17   31:icmpeq          73
	//*  18   34:aload_0         
	//*  19   35:iload_2         
	//*  20   36:invokevirtual   #185 <Method boolean c(int)>
	//*  21   39:ifeq            73
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   22   42:aload           4
	//   23   44:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   24   47:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//   25   50:astore          5
				a(canvas, view.getTop() - layoutparams.topMargin - m);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:aload           4
	//   29   56:invokevirtual   #275 <Method int View.getTop()>
	//   30   59:aload           5
	//   31   61:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//   32   64:isub            
	//   33   65:aload_0         
	//   34   66:getfield        #187 <Field int m>
	//   35   69:isub            
	//   36   70:invokevirtual   #278 <Method void a(Canvas, int)>
			}
		}

	//   37   73:iload_2         
	//   38   74:iconst_1        
	//   39   75:iadd            
	//   40   76:istore_2        
	//*  41   77:goto            7
		if(c(k1))
	//*  42   80:aload_0         
	//*  43   81:iload_3         
	//*  44   82:invokevirtual   #185 <Method boolean c(int)>
	//*  45   85:ifeq            148
		{
			View view1 = b(k1 - 1);
	//   46   88:aload_0         
	//   47   89:iload_3         
	//   48   90:iconst_1        
	//   49   91:isub            
	//   50   92:invokevirtual   #145 <Method View b(int)>
	//   51   95:astore          4
			int j1;
			if(view1 == null)
	//*  52   97:aload           4
	//*  53   99:ifnonnull       120
			{
				j1 = getHeight() - getPaddingBottom() - m;
	//   54  102:aload_0         
	//   55  103:invokevirtual   #281 <Method int getHeight()>
	//   56  106:aload_0         
	//   57  107:invokevirtual   #229 <Method int getPaddingBottom()>
	//   58  110:isub            
	//   59  111:aload_0         
	//   60  112:getfield        #187 <Field int m>
	//   61  115:isub            
	//   62  116:istore_2        
			} else
	//*  63  117:goto            142
			{
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//   64  120:aload           4
	//   65  122:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   66  125:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//   67  128:astore          5
				j1 = view1.getBottom() + layoutparams1.bottomMargin;
	//   68  130:aload           4
	//   69  132:invokevirtual   #284 <Method int View.getBottom()>
	//   70  135:aload           5
	//   71  137:getfield        #194 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//   72  140:iadd            
	//   73  141:istore_2        
			}
			a(canvas, j1);
	//   74  142:aload_0         
	//   75  143:aload_1         
	//   76  144:iload_2         
	//   77  145:invokevirtual   #278 <Method void a(Canvas, int)>
		}
	//   78  148:return          
	}

	void a(Canvas canvas, int i1)
	{
		k.setBounds(getPaddingLeft() + o, i1, getWidth() - getPaddingRight() - o, m + i1);
	//    0    0:aload_0         
	//    1    1:getfield        #286 <Field Drawable k>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #243 <Method int getPaddingLeft()>
	//    4    8:aload_0         
	//    5    9:getfield        #121 <Field int o>
	//    6   12:iadd            
	//    7   13:iload_2         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #289 <Method int getWidth()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #246 <Method int getPaddingRight()>
	//   12   22:isub            
	//   13   23:aload_0         
	//   14   24:getfield        #121 <Field int o>
	//   15   27:isub            
	//   16   28:aload_0         
	//   17   29:getfield        #187 <Field int m>
	//   18   32:iload_2         
	//   19   33:iadd            
	//   20   34:invokevirtual   #294 <Method void Drawable.setBounds(int, int, int, int)>
		k.draw(canvas);
	//   21   37:aload_0         
	//   22   38:getfield        #286 <Field Drawable k>
	//   23   41:aload_1         
	//   24   42:invokevirtual   #297 <Method void Drawable.draw(Canvas)>
	//   25   45:return          
	}

	void a(View view, int i1, int j1, int k1, int l1, int i2)
	{
		measureChildWithMargins(view, j1, k1, l1, i2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:iload           6
	//    6    9:invokevirtual   #164 <Method void measureChildWithMargins(View, int, int, int, int)>
	//    7   12:return          
	}

	int b(View view)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public LayoutParams b(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #6   <Class LinearLayoutCompat$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #302 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #303 <Method void LinearLayoutCompat$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected LayoutParams b(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return new LayoutParams(layoutparams);
	//    0    0:new             #6   <Class LinearLayoutCompat$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #307 <Method void LinearLayoutCompat$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    4    8:areturn         
	}

	View b(int i1)
	{
		return getChildAt(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #310 <Method View getChildAt(int)>
	//    3    5:areturn         
	}

	void b(int i1, int j1)
	{
		f = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #170 <Field int f>
		int k6 = getVirtualChildCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #173 <Method int getVirtualChildCount()>
	//    5    9:istore          17
		int l1 = android.view.View.MeasureSpec.getMode(i1);
	//    6   11:iload_1         
	//    7   12:invokestatic    #177 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   15:istore          6
		int j9 = android.view.View.MeasureSpec.getMode(j1);
	//    9   17:iload_2         
	//   10   18:invokestatic    #177 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   11   21:istore          21
		if(i == null || j == null)
	//*  12   23:aload_0         
	//*  13   24:getfield        #312 <Field int[] i>
	//*  14   27:ifnull          37
	//*  15   30:aload_0         
	//*  16   31:getfield        #314 <Field int[] j>
	//*  17   34:ifnonnull       51
		{
			i = new int[4];
	//   18   37:aload_0         
	//   19   38:iconst_4        
	//   20   39:newarray        int[]
	//   21   41:putfield        #312 <Field int[] i>
			j = new int[4];
	//   22   44:aload_0         
	//   23   45:iconst_4        
	//   24   46:newarray        int[]
	//   25   48:putfield        #314 <Field int[] j>
		}
		int ai[] = i;
	//   26   51:aload_0         
	//   27   52:getfield        #312 <Field int[] i>
	//   28   55:astore          30
		Object obj = ((Object) (j));
	//   29   57:aload_0         
	//   30   58:getfield        #314 <Field int[] j>
	//   31   61:astore          25
		ai[3] = -1;
	//   32   63:aload           30
	//   33   65:iconst_3        
	//   34   66:iconst_m1       
	//   35   67:iastore         
		ai[2] = -1;
	//   36   68:aload           30
	//   37   70:iconst_2        
	//   38   71:iconst_m1       
	//   39   72:iastore         
		ai[1] = -1;
	//   40   73:aload           30
	//   41   75:iconst_1        
	//   42   76:iconst_m1       
	//   43   77:iastore         
		ai[0] = -1;
	//   44   78:aload           30
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
		boolean flag4 = a;
	//   64  103:aload_0         
	//   65  104:getfield        #39  <Field boolean a>
	//   66  107:istore          23
		boolean flag5 = h;
	//   67  109:aload_0         
	//   68  110:getfield        #99  <Field boolean h>
	//   69  113:istore          24
		boolean flag3;
		if(l1 == 0x40000000)
	//*  70  115:iload           6
	//*  71  117:ldc1            #137 <Int 0x40000000>
	//*  72  119:icmpne          128
			flag3 = true;
	//   73  122:iconst_1        
	//   74  123:istore          16
		else
	//*  75  125:goto            131
			flag3 = false;
	//   76  128:iconst_0        
	//   77  129:istore          16
		int k2 = 0;
	//   78  131:iconst_0        
	//   79  132:istore          9
		int j2 = 0x80000000;
	//   80  134:ldc1            #178 <Int 0x80000000>
	//   81  136:istore          8
		float f1 = 0.0F;
	//   82  138:fconst_0        
	//   83  139:fstore_3        
		int j4 = 0;
	//   84  140:iconst_0        
	//   85  141:istore          13
		boolean flag1 = false;
	//   86  143:iconst_0        
	//   87  144:istore          12
		int i2 = 0;
	//   88  146:iconst_0        
	//   89  147:istore          7
		int l3 = 0;
	//   90  149:iconst_0        
	//   91  150:istore          11
		int j5 = 0;
	//   92  152:iconst_0        
	//   93  153:istore          14
		int k1 = 1;
	//   94  155:iconst_1        
	//   95  156:istore          5
		boolean flag = false;
	//   96  158:iconst_0        
	//   97  159:istore          10
		for(; k2 < k6; k2++)
	//*  98  161:iload           9
	//*  99  163:iload           17
	//* 100  165:icmpge          869
		{
			LayoutParams layoutparams;
			View view2;
label0:
			{
				view2 = b(k2);
	//  101  168:aload_0         
	//  102  169:iload           9
	//  103  171:invokevirtual   #145 <Method View b(int)>
	//  104  174:astore          27
				if(view2 == null)
	//* 105  176:aload           27
	//* 106  178:ifnonnull       199
				{
					f = f + d(k2);
	//  107  181:aload_0         
	//  108  182:aload_0         
	//  109  183:getfield        #170 <Field int f>
	//  110  186:aload_0         
	//  111  187:iload           9
	//  112  189:invokevirtual   #180 <Method int d(int)>
	//  113  192:iadd            
	//  114  193:putfield        #170 <Field int f>
					continue;
	//  115  196:goto            860
				}
				if(view2.getVisibility() == 8)
	//* 116  199:aload           27
	//* 117  201:invokevirtual   #148 <Method int View.getVisibility()>
	//* 118  204:bipush          8
	//* 119  206:icmpne          225
				{
					k2 += a(view2, k2);
	//  120  209:iload           9
	//  121  211:aload_0         
	//  122  212:aload           27
	//  123  214:iload           9
	//  124  216:invokevirtual   #182 <Method int a(View, int)>
	//  125  219:iadd            
	//  126  220:istore          9
					continue;
	//  127  222:goto            196
				}
				if(c(k2))
	//* 128  225:aload_0         
	//* 129  226:iload           9
	//* 130  228:invokevirtual   #185 <Method boolean c(int)>
	//* 131  231:ifeq            247
					f = f + l;
	//  132  234:aload_0         
	//  133  235:aload_0         
	//  134  236:getfield        #170 <Field int f>
	//  135  239:aload_0         
	//  136  240:getfield        #316 <Field int l>
	//  137  243:iadd            
	//  138  244:putfield        #170 <Field int f>
				layoutparams = (LayoutParams)view2.getLayoutParams();
	//  139  247:aload           27
	//  140  249:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  141  252:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//  142  255:astore          26
				f1 += layoutparams.g;
	//  143  257:fload_3         
	//  144  258:aload           26
	//  145  260:getfield        #188 <Field float LinearLayoutCompat$LayoutParams.g>
	//  146  263:fadd            
	//  147  264:fstore_3        
				int k5;
				if(l1 == 0x40000000 && layoutparams.width == 0 && layoutparams.g > 0.0F)
	//* 148  265:iload           6
	//* 149  267:ldc1            #137 <Int 0x40000000>
	//* 150  269:icmpne          386
	//* 151  272:aload           26
	//* 152  274:getfield        #155 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 153  277:ifne            386
	//* 154  280:aload           26
	//* 155  282:getfield        #188 <Field float LinearLayoutCompat$LayoutParams.g>
	//* 156  285:fconst_0        
	//* 157  286:fcmpl           
	//* 158  287:ifle            386
				{
					if(flag3)
	//* 159  290:iload           16
	//* 160  292:ifeq            322
					{
						k5 = f + (layoutparams.leftMargin + layoutparams.rightMargin);
	//  161  295:aload_0         
	//  162  296:getfield        #170 <Field int f>
	//  163  299:aload           26
	//  164  301:getfield        #214 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  165  304:aload           26
	//  166  306:getfield        #217 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  167  309:iadd            
	//  168  310:iadd            
	//  169  311:istore          15
					} else
	//* 170  313:aload_0         
	//* 171  314:iload           15
	//* 172  316:putfield        #170 <Field int f>
	//* 173  319:goto            352
					{
						k5 = f;
	//  174  322:aload_0         
	//  175  323:getfield        #170 <Field int f>
	//  176  326:istore          15
						k5 = Math.max(k5, layoutparams.leftMargin + k5 + layoutparams.rightMargin);
	//  177  328:iload           15
	//  178  330:aload           26
	//  179  332:getfield        #214 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  180  335:iload           15
	//  181  337:iadd            
	//  182  338:aload           26
	//  183  340:getfield        #217 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  184  343:iadd            
	//  185  344:invokestatic    #199 <Method int Math.max(int, int)>
	//  186  347:istore          15
					}
					f = k5;
	//* 187  349:goto            313
					if(flag4)
	//* 188  352:iload           23
	//* 189  354:ifeq            380
					{
						k5 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//  190  357:iconst_0        
	//  191  358:iconst_0        
	//  192  359:invokestatic    #142 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  193  362:istore          15
						view2.measure(k5, k5);
	//  194  364:aload           27
	//  195  366:iload           15
	//  196  368:iload           15
	//  197  370:invokevirtual   #240 <Method void View.measure(int, int)>
						k5 = j2;
	//  198  373:iload           8
	//  199  375:istore          15
					} else
	//* 200  377:goto            581
					{
						flag1 = true;
	//  201  380:iconst_1        
	//  202  381:istore          12
						break label0;
	//  203  383:goto            585
					}
				} else
				{
					if(layoutparams.width == 0 && layoutparams.g > 0.0F)
	//* 204  386:aload           26
	//* 205  388:getfield        #155 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 206  391:ifne            417
	//* 207  394:aload           26
	//* 208  396:getfield        #188 <Field float LinearLayoutCompat$LayoutParams.g>
	//* 209  399:fconst_0        
	//* 210  400:fcmpl           
	//* 211  401:ifle            417
					{
						layoutparams.width = -2;
	//  212  404:aload           26
	//  213  406:bipush          -2
	//  214  408:putfield        #155 <Field int LinearLayoutCompat$LayoutParams.width>
						k5 = 0;
	//  215  411:iconst_0        
	//  216  412:istore          15
					} else
	//* 217  414:goto            421
					{
						k5 = 0x80000000;
	//  218  417:ldc1            #178 <Int 0x80000000>
	//  219  419:istore          15
					}
					int j7;
					if(f1 == 0.0F)
	//* 220  421:fload_3         
	//* 221  422:fconst_0        
	//* 222  423:fcmpl           
	//* 223  424:ifne            436
						j7 = f;
	//  224  427:aload_0         
	//  225  428:getfield        #170 <Field int f>
	//  226  431:istore          18
					else
	//* 227  433:goto            439
						j7 = 0;
	//  228  436:iconst_0        
	//  229  437:istore          18
					LayoutParams layoutparams3 = layoutparams;
	//  230  439:aload           26
	//  231  441:astore          28
					View view3 = view2;
	//  232  443:aload           27
	//  233  445:astore          29
					a(view2, k2, i1, j7, j1, 0);
	//  234  447:aload_0         
	//  235  448:aload           27
	//  236  450:iload           9
	//  237  452:iload_1         
	//  238  453:iload           18
	//  239  455:iload_2         
	//  240  456:iconst_0        
	//  241  457:invokevirtual   #202 <Method void a(View, int, int, int, int, int)>
					if(k5 != 0x80000000)
	//* 242  460:iload           15
	//* 243  462:ldc1            #178 <Int 0x80000000>
	//* 244  464:icmpeq          474
						layoutparams3.width = k5;
	//  245  467:aload           28
	//  246  469:iload           15
	//  247  471:putfield        #155 <Field int LinearLayoutCompat$LayoutParams.width>
					j7 = view3.getMeasuredWidth();
	//  248  474:aload           29
	//  249  476:invokevirtual   #166 <Method int View.getMeasuredWidth()>
	//  250  479:istore          18
					if(flag3)
	//* 251  481:iload           16
	//* 252  483:ifeq            523
					{
						k5 = f + (layoutparams3.leftMargin + j7 + layoutparams3.rightMargin + b(view3));
	//  253  486:aload_0         
	//  254  487:getfield        #170 <Field int f>
	//  255  490:aload           28
	//  256  492:getfield        #214 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  257  495:iload           18
	//  258  497:iadd            
	//  259  498:aload           28
	//  260  500:getfield        #217 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  261  503:iadd            
	//  262  504:aload_0         
	//  263  505:aload           29
	//  264  507:invokevirtual   #204 <Method int b(View)>
	//  265  510:iadd            
	//  266  511:iadd            
	//  267  512:istore          15
					} else
	//* 268  514:aload_0         
	//* 269  515:iload           15
	//* 270  517:putfield        #170 <Field int f>
	//* 271  520:goto            563
					{
						k5 = f;
	//  272  523:aload_0         
	//  273  524:getfield        #170 <Field int f>
	//  274  527:istore          15
						k5 = Math.max(k5, k5 + j7 + layoutparams3.leftMargin + layoutparams3.rightMargin + b(view3));
	//  275  529:iload           15
	//  276  531:iload           15
	//  277  533:iload           18
	//  278  535:iadd            
	//  279  536:aload           28
	//  280  538:getfield        #214 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  281  541:iadd            
	//  282  542:aload           28
	//  283  544:getfield        #217 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  284  547:iadd            
	//  285  548:aload_0         
	//  286  549:aload           29
	//  287  551:invokevirtual   #204 <Method int b(View)>
	//  288  554:iadd            
	//  289  555:invokestatic    #199 <Method int Math.max(int, int)>
	//  290  558:istore          15
					}
					f = k5;
	//* 291  560:goto            514
					k5 = j2;
	//  292  563:iload           8
	//  293  565:istore          15
					if(flag5)
	//* 294  567:iload           24
	//* 295  569:ifeq            581
						k5 = Math.max(j7, j2);
	//  296  572:iload           18
	//  297  574:iload           8
	//  298  576:invokestatic    #199 <Method int Math.max(int, int)>
	//  299  579:istore          15
				}
				j2 = k5;
	//  300  581:iload           15
	//  301  583:istore          8
			}
			int k8 = k2;
	//  302  585:iload           9
	//  303  587:istore          19
			if(j9 != 0x40000000 && layoutparams.height == -1)
	//* 304  589:iload           21
	//* 305  591:ldc1            #137 <Int 0x40000000>
	//* 306  593:icmpeq          614
	//* 307  596:aload           26
	//* 308  598:getfield        #158 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 309  601:iconst_m1       
	//* 310  602:icmpne          614
			{
				k2 = 1;
	//  311  605:iconst_1        
	//  312  606:istore          9
				flag = true;
	//  313  608:iconst_1        
	//  314  609:istore          10
			} else
	//* 315  611:goto            617
			{
				k2 = 0;
	//  316  614:iconst_0        
	//  317  615:istore          9
			}
			int l5 = layoutparams.topMargin + layoutparams.bottomMargin;
	//  318  617:aload           26
	//  319  619:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  320  622:aload           26
	//  321  624:getfield        #194 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  322  627:iadd            
	//  323  628:istore          15
			int k7 = view2.getMeasuredHeight() + l5;
	//  324  630:aload           27
	//  325  632:invokevirtual   #161 <Method int View.getMeasuredHeight()>
	//  326  635:iload           15
	//  327  637:iadd            
	//  328  638:istore          18
			int i9 = View.combineMeasuredStates(j5, view2.getMeasuredState());
	//  329  640:iload           14
	//  330  642:aload           27
	//  331  644:invokevirtual   #220 <Method int View.getMeasuredState()>
	//  332  647:invokestatic    #223 <Method int View.combineMeasuredStates(int, int)>
	//  333  650:istore          20
			if(flag4)
	//* 334  652:iload           23
	//* 335  654:ifeq            741
			{
				int k9 = view2.getBaseline();
	//  336  657:aload           27
	//  337  659:invokevirtual   #319 <Method int View.getBaseline()>
	//  338  662:istore          22
				if(k9 != -1)
	//* 339  664:iload           22
	//* 340  666:iconst_m1       
	//* 341  667:icmpeq          741
				{
					if(layoutparams.h < 0)
	//* 342  670:aload           26
	//* 343  672:getfield        #259 <Field int LinearLayoutCompat$LayoutParams.h>
	//* 344  675:ifge            687
						j5 = e;
	//  345  678:aload_0         
	//  346  679:getfield        #46  <Field int e>
	//  347  682:istore          14
					else
	//* 348  684:goto            694
						j5 = layoutparams.h;
	//  349  687:aload           26
	//  350  689:getfield        #259 <Field int LinearLayoutCompat$LayoutParams.h>
	//  351  692:istore          14
					j5 = ((j5 & 0x70) >> 4 & -2) >> 1;
	//  352  694:iload           14
	//  353  696:bipush          112
	//  354  698:iand            
	//  355  699:iconst_4        
	//  356  700:ishr            
	//  357  701:bipush          -2
	//  358  703:iand            
	//  359  704:iconst_1        
	//  360  705:ishr            
	//  361  706:istore          14
					ai[j5] = Math.max(ai[j5], k9);
	//  362  708:aload           30
	//  363  710:iload           14
	//  364  712:aload           30
	//  365  714:iload           14
	//  366  716:iaload          
	//  367  717:iload           22
	//  368  719:invokestatic    #199 <Method int Math.max(int, int)>
	//  369  722:iastore         
					obj[j5] = Math.max(obj[j5], k7 - k9);
	//  370  723:aload           25
	//  371  725:iload           14
	//  372  727:aload           25
	//  373  729:iload           14
	//  374  731:iaload          
	//  375  732:iload           18
	//  376  734:iload           22
	//  377  736:isub            
	//  378  737:invokestatic    #199 <Method int Math.max(int, int)>
	//  379  740:iastore         
				}
			}
			j4 = Math.max(j4, k7);
	//  380  741:iload           13
	//  381  743:iload           18
	//  382  745:invokestatic    #199 <Method int Math.max(int, int)>
	//  383  748:istore          13
			if(k1 && layoutparams.height == -1)
	//* 384  750:iload           5
	//* 385  752:ifeq            770
	//* 386  755:aload           26
	//* 387  757:getfield        #158 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 388  760:iconst_m1       
	//* 389  761:icmpne          770
				k1 = 1;
	//  390  764:iconst_1        
	//  391  765:istore          5
			else
	//* 392  767:goto            773
				k1 = 0;
	//  393  770:iconst_0        
	//  394  771:istore          5
			if(layoutparams.g > 0.0F)
	//* 395  773:aload           26
	//* 396  775:getfield        #188 <Field float LinearLayoutCompat$LayoutParams.g>
	//* 397  778:fconst_0        
	//* 398  779:fcmpl           
	//* 399  780:ifle            810
			{
				if(k2 == 0)
	//* 400  783:iload           9
	//* 401  785:ifeq            791
	//* 402  788:goto            798
					l5 = k7;
	//  403  791:iload           18
	//  404  793:istore          15
	//* 405  795:goto            788
				k2 = Math.max(l3, l5);
	//  406  798:iload           11
	//  407  800:iload           15
	//  408  802:invokestatic    #199 <Method int Math.max(int, int)>
	//  409  805:istore          9
			} else
	//* 410  807:goto            835
			{
				if(k2 != 0)
	//* 411  810:iload           9
	//* 412  812:ifeq            819
					k7 = l5;
	//  413  815:iload           15
	//  414  817:istore          18
				i2 = Math.max(i2, k7);
	//  415  819:iload           7
	//  416  821:iload           18
	//  417  823:invokestatic    #199 <Method int Math.max(int, int)>
	//  418  826:istore          7
				k2 = l3;
	//  419  828:iload           11
	//  420  830:istore          9
			}
	//* 421  832:goto            807
			l5 = a(view2, k8) + k8;
	//  422  835:aload_0         
	//  423  836:aload           27
	//  424  838:iload           19
	//  425  840:invokevirtual   #182 <Method int a(View, int)>
	//  426  843:iload           19
	//  427  845:iadd            
	//  428  846:istore          15
			j5 = i9;
	//  429  848:iload           20
	//  430  850:istore          14
			l3 = k2;
	//  431  852:iload           9
	//  432  854:istore          11
			k2 = l5;
	//  433  856:iload           15
	//  434  858:istore          9
		}

	//  435  860:iload           9
	//  436  862:iconst_1        
	//  437  863:iadd            
	//  438  864:istore          9
	//* 439  866:goto            161
label1:
		{
			int l2 = j4;
	//  440  869:iload           13
	//  441  871:istore          9
			if(f > 0 && c(k6))
	//* 442  873:aload_0         
	//* 443  874:getfield        #170 <Field int f>
	//* 444  877:ifle            902
	//* 445  880:aload_0         
	//* 446  881:iload           17
	//* 447  883:invokevirtual   #185 <Method boolean c(int)>
	//* 448  886:ifeq            902
				f = f + l;
	//  449  889:aload_0         
	//  450  890:aload_0         
	//  451  891:getfield        #170 <Field int f>
	//  452  894:aload_0         
	//  453  895:getfield        #316 <Field int l>
	//  454  898:iadd            
	//  455  899:putfield        #170 <Field int f>
			if(ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
	//* 456  902:aload           30
	//* 457  904:iconst_1        
	//* 458  905:iaload          
	//* 459  906:iconst_m1       
	//* 460  907:icmpne          938
	//* 461  910:aload           30
	//* 462  912:iconst_0        
	//* 463  913:iaload          
	//* 464  914:iconst_m1       
	//* 465  915:icmpne          938
	//* 466  918:aload           30
	//* 467  920:iconst_2        
	//* 468  921:iaload          
	//* 469  922:iconst_m1       
	//* 470  923:icmpne          938
			{
				j4 = l2;
	//  471  926:iload           9
	//  472  928:istore          13
				if(ai[3] == -1)
					break label1;
	//  473  930:aload           30
	//  474  932:iconst_3        
	//  475  933:iaload          
	//  476  934:iconst_m1       
	//  477  935:icmpeq          996
			}
			j4 = Math.max(l2, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(obj[3], Math.max(obj[0], Math.max(obj[1], obj[2]))));
	//  478  938:iload           9
	//  479  940:aload           30
	//  480  942:iconst_3        
	//  481  943:iaload          
	//  482  944:aload           30
	//  483  946:iconst_0        
	//  484  947:iaload          
	//  485  948:aload           30
	//  486  950:iconst_1        
	//  487  951:iaload          
	//  488  952:aload           30
	//  489  954:iconst_2        
	//  490  955:iaload          
	//  491  956:invokestatic    #199 <Method int Math.max(int, int)>
	//  492  959:invokestatic    #199 <Method int Math.max(int, int)>
	//  493  962:invokestatic    #199 <Method int Math.max(int, int)>
	//  494  965:aload           25
	//  495  967:iconst_3        
	//  496  968:iaload          
	//  497  969:aload           25
	//  498  971:iconst_0        
	//  499  972:iaload          
	//  500  973:aload           25
	//  501  975:iconst_1        
	//  502  976:iaload          
	//  503  977:aload           25
	//  504  979:iconst_2        
	//  505  980:iaload          
	//  506  981:invokestatic    #199 <Method int Math.max(int, int)>
	//  507  984:invokestatic    #199 <Method int Math.max(int, int)>
	//  508  987:invokestatic    #199 <Method int Math.max(int, int)>
	//  509  990:iadd            
	//  510  991:invokestatic    #199 <Method int Math.max(int, int)>
	//  511  994:istore          13
		}
		int l8;
label2:
		{
			if(flag5)
	//* 512  996:iload           24
	//* 513  998:ifeq            1185
			{
				int i3 = l1;
	//  514 1001:iload           6
	//  515 1003:istore          9
				if(i3 == 0x80000000 || i3 == 0)
	//* 516 1005:iload           9
	//* 517 1007:ldc1            #178 <Int 0x80000000>
	//* 518 1009:icmpeq          1017
	//* 519 1012:iload           9
	//* 520 1014:ifne            1185
				{
					f = 0;
	//  521 1017:aload_0         
	//  522 1018:iconst_0        
	//  523 1019:putfield        #170 <Field int f>
					for(int j3 = 0; j3 < k6; j3++)
	//* 524 1022:iconst_0        
	//* 525 1023:istore          9
	//* 526 1025:iload           9
	//* 527 1027:iload           17
	//* 528 1029:icmpge          1185
					{
						View view = b(j3);
	//  529 1032:aload_0         
	//  530 1033:iload           9
	//  531 1035:invokevirtual   #145 <Method View b(int)>
	//  532 1038:astore          26
						if(view == null)
	//* 533 1040:aload           26
	//* 534 1042:ifnonnull       1063
						{
							f = f + d(j3);
	//  535 1045:aload_0         
	//  536 1046:aload_0         
	//  537 1047:getfield        #170 <Field int f>
	//  538 1050:aload_0         
	//  539 1051:iload           9
	//  540 1053:invokevirtual   #180 <Method int d(int)>
	//  541 1056:iadd            
	//  542 1057:putfield        #170 <Field int f>
							continue;
	//  543 1060:goto            1086
						}
						if(view.getVisibility() == 8)
	//* 544 1063:aload           26
	//* 545 1065:invokevirtual   #148 <Method int View.getVisibility()>
	//* 546 1068:bipush          8
	//* 547 1070:icmpne          1089
						{
							j3 += a(view, j3);
	//  548 1073:iload           9
	//  549 1075:aload_0         
	//  550 1076:aload           26
	//  551 1078:iload           9
	//  552 1080:invokevirtual   #182 <Method int a(View, int)>
	//  553 1083:iadd            
	//  554 1084:istore          9
							continue;
	//  555 1086:goto            1176
						}
						LayoutParams layoutparams1 = (LayoutParams)view.getLayoutParams();
	//  556 1089:aload           26
	//  557 1091:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  558 1094:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//  559 1097:astore          27
						if(flag3)
	//* 560 1099:iload           16
	//* 561 1101:ifeq            1137
						{
							f = f + (layoutparams1.leftMargin + j2 + layoutparams1.rightMargin + b(view));
	//  562 1104:aload_0         
	//  563 1105:aload_0         
	//  564 1106:getfield        #170 <Field int f>
	//  565 1109:aload           27
	//  566 1111:getfield        #214 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  567 1114:iload           8
	//  568 1116:iadd            
	//  569 1117:aload           27
	//  570 1119:getfield        #217 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  571 1122:iadd            
	//  572 1123:aload_0         
	//  573 1124:aload           26
	//  574 1126:invokevirtual   #204 <Method int b(View)>
	//  575 1129:iadd            
	//  576 1130:iadd            
	//  577 1131:putfield        #170 <Field int f>
						} else
	//* 578 1134:goto            1086
						{
							int i6 = f;
	//  579 1137:aload_0         
	//  580 1138:getfield        #170 <Field int f>
	//  581 1141:istore          15
							f = Math.max(i6, i6 + j2 + layoutparams1.leftMargin + layoutparams1.rightMargin + b(view));
	//  582 1143:aload_0         
	//  583 1144:iload           15
	//  584 1146:iload           15
	//  585 1148:iload           8
	//  586 1150:iadd            
	//  587 1151:aload           27
	//  588 1153:getfield        #214 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  589 1156:iadd            
	//  590 1157:aload           27
	//  591 1159:getfield        #217 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  592 1162:iadd            
	//  593 1163:aload_0         
	//  594 1164:aload           26
	//  595 1166:invokevirtual   #204 <Method int b(View)>
	//  596 1169:iadd            
	//  597 1170:invokestatic    #199 <Method int Math.max(int, int)>
	//  598 1173:putfield        #170 <Field int f>
						}
					}

	//  599 1176:iload           9
	//  600 1178:iconst_1        
	//  601 1179:iadd            
	//  602 1180:istore          9
				}
			}
	//* 603 1182:goto            1025
			int j6 = l1;
	//  604 1185:iload           6
	//  605 1187:istore          15
			f = f + (getPaddingLeft() + getPaddingRight());
	//  606 1189:aload_0         
	//  607 1190:aload_0         
	//  608 1191:getfield        #170 <Field int f>
	//  609 1194:aload_0         
	//  610 1195:invokevirtual   #243 <Method int getPaddingLeft()>
	//  611 1198:aload_0         
	//  612 1199:invokevirtual   #246 <Method int getPaddingRight()>
	//  613 1202:iadd            
	//  614 1203:iadd            
	//  615 1204:putfield        #170 <Field int f>
			l8 = View.resolveSizeAndState(Math.max(f, getSuggestedMinimumWidth()), i1, 0);
	//  616 1207:aload_0         
	//  617 1208:getfield        #170 <Field int f>
	//  618 1211:aload_0         
	//  619 1212:invokevirtual   #252 <Method int getSuggestedMinimumWidth()>
	//  620 1215:invokestatic    #199 <Method int Math.max(int, int)>
	//  621 1218:iload_1         
	//  622 1219:iconst_0        
	//  623 1220:invokestatic    #236 <Method int View.resolveSizeAndState(int, int, int)>
	//  624 1223:istore          19
			int l7 = (0xffffff & l8) - f;
	//  625 1225:ldc1            #237 <Int 0xffffff>
	//  626 1227:iload           19
	//  627 1229:iand            
	//  628 1230:aload_0         
	//  629 1231:getfield        #170 <Field int f>
	//  630 1234:isub            
	//  631 1235:istore          18
			if(!flag1 && (l7 == 0 || f1 <= 0.0F))
	//* 632 1237:iload           12
	//* 633 1239:ifne            1379
	//* 634 1242:iload           18
	//* 635 1244:ifeq            1256
	//* 636 1247:fload_3         
	//* 637 1248:fconst_0        
	//* 638 1249:fcmpl           
	//* 639 1250:ifle            1256
	//* 640 1253:goto            1379
			{
				i2 = Math.max(i2, l3);
	//  641 1256:iload           7
	//  642 1258:iload           11
	//  643 1260:invokestatic    #199 <Method int Math.max(int, int)>
	//  644 1263:istore          7
				if(flag5 && j6 != 0x40000000)
	//* 645 1265:iload           24
	//* 646 1267:ifeq            1360
	//* 647 1270:iload           15
	//* 648 1272:ldc1            #137 <Int 0x40000000>
	//* 649 1274:icmpeq          1360
					for(l1 = 0; l1 < k6; l1++)
	//* 650 1277:iconst_0        
	//* 651 1278:istore          6
	//* 652 1280:iload           6
	//* 653 1282:iload           17
	//* 654 1284:icmpge          1360
					{
						obj = ((Object) (b(l1)));
	//  655 1287:aload_0         
	//  656 1288:iload           6
	//  657 1290:invokevirtual   #145 <Method View b(int)>
	//  658 1293:astore          25
						if(obj != null && ((View) (obj)).getVisibility() != 8 && ((LayoutParams)((View) (obj)).getLayoutParams()).g > 0.0F)
	//* 659 1295:aload           25
	//* 660 1297:ifnull          1351
	//* 661 1300:aload           25
	//* 662 1302:invokevirtual   #148 <Method int View.getVisibility()>
	//* 663 1305:bipush          8
	//* 664 1307:icmpne          1313
	//* 665 1310:goto            1351
	//* 666 1313:aload           25
	//* 667 1315:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 668 1318:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//* 669 1321:getfield        #188 <Field float LinearLayoutCompat$LayoutParams.g>
	//* 670 1324:fconst_0        
	//* 671 1325:fcmpl           
	//* 672 1326:ifle            1351
							((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(((View) (obj)).getMeasuredHeight(), 0x40000000));
	//  673 1329:aload           25
	//  674 1331:iload           8
	//  675 1333:ldc1            #137 <Int 0x40000000>
	//  676 1335:invokestatic    #142 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  677 1338:aload           25
	//  678 1340:invokevirtual   #161 <Method int View.getMeasuredHeight()>
	//  679 1343:ldc1            #137 <Int 0x40000000>
	//  680 1345:invokestatic    #142 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  681 1348:invokevirtual   #240 <Method void View.measure(int, int)>
					}

	//  682 1351:iload           6
	//  683 1353:iconst_1        
	//  684 1354:iadd            
	//  685 1355:istore          6
	//* 686 1357:goto            1280
				j2 = i2;
	//  687 1360:iload           7
	//  688 1362:istore          8
				l3 = k6;
	//  689 1364:iload           17
	//  690 1366:istore          11
				l1 = j4;
	//  691 1368:iload           13
	//  692 1370:istore          6
				i2 = k1;
	//  693 1372:iload           5
	//  694 1374:istore          7
				break label2;
	//  695 1376:goto            2114
			}
			if(g > 0.0F)
	//* 696 1379:aload_0         
	//* 697 1380:getfield        #91  <Field float g>
	//* 698 1383:fconst_0        
	//* 699 1384:fcmpl           
	//* 700 1385:ifle            1396
				f1 = g;
	//  701 1388:aload_0         
	//  702 1389:getfield        #91  <Field float g>
	//  703 1392:fstore_3        
	//* 704 1393:goto            1399
	//* 705 1396:goto            1393
			ai[3] = -1;
	//  706 1399:aload           30
	//  707 1401:iconst_3        
	//  708 1402:iconst_m1       
	//  709 1403:iastore         
			ai[2] = -1;
	//  710 1404:aload           30
	//  711 1406:iconst_2        
	//  712 1407:iconst_m1       
	//  713 1408:iastore         
			ai[1] = -1;
	//  714 1409:aload           30
	//  715 1411:iconst_1        
	//  716 1412:iconst_m1       
	//  717 1413:iastore         
			ai[0] = -1;
	//  718 1414:aload           30
	//  719 1416:iconst_0        
	//  720 1417:iconst_m1       
	//  721 1418:iastore         
			obj[3] = -1;
	//  722 1419:aload           25
	//  723 1421:iconst_3        
	//  724 1422:iconst_m1       
	//  725 1423:iastore         
			obj[2] = -1;
	//  726 1424:aload           25
	//  727 1426:iconst_2        
	//  728 1427:iconst_m1       
	//  729 1428:iastore         
			obj[1] = -1;
	//  730 1429:aload           25
	//  731 1431:iconst_1        
	//  732 1432:iconst_m1       
	//  733 1433:iastore         
			obj[0] = -1;
	//  734 1434:aload           25
	//  735 1436:iconst_0        
	//  736 1437:iconst_m1       
	//  737 1438:iastore         
			f = 0;
	//  738 1439:aload_0         
	//  739 1440:iconst_0        
	//  740 1441:putfield        #170 <Field int f>
			j2 = i2;
	//  741 1444:iload           7
	//  742 1446:istore          8
			int i4 = 0;
	//  743 1448:iconst_0        
	//  744 1449:istore          12
			int k3 = -1;
	//  745 1451:iconst_m1       
	//  746 1452:istore          9
			i2 = k1;
	//  747 1454:iload           5
	//  748 1456:istore          7
			l1 = k6;
	//  749 1458:iload           17
	//  750 1460:istore          6
			k1 = j5;
	//  751 1462:iload           14
	//  752 1464:istore          5
			l3 = l7;
	//  753 1466:iload           18
	//  754 1468:istore          11
			for(; i4 < l1; i4++)
	//* 755 1470:iload           12
	//* 756 1472:iload           6
	//* 757 1474:icmpge          1984
			{
				View view1;
				LayoutParams layoutparams2;
label3:
				{
					int k4;
					int l6;
label4:
					{
						view1 = b(i4);
	//  758 1477:aload_0         
	//  759 1478:iload           12
	//  760 1480:invokevirtual   #145 <Method View b(int)>
	//  761 1483:astore          26
						if(view1 == null || view1.getVisibility() == 8)
	//* 762 1485:aload           26
	//* 763 1487:ifnull          1975
	//* 764 1490:aload           26
	//* 765 1492:invokevirtual   #148 <Method int View.getVisibility()>
	//* 766 1495:bipush          8
	//* 767 1497:icmpne          1503
							continue;
	//  768 1500:goto            1975
						layoutparams2 = (LayoutParams)view1.getLayoutParams();
	//  769 1503:aload           26
	//  770 1505:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  771 1508:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//  772 1511:astore          27
						float f2 = layoutparams2.g;
	//  773 1513:aload           27
	//  774 1515:getfield        #188 <Field float LinearLayoutCompat$LayoutParams.g>
	//  775 1518:fstore          4
						if(f2 <= 0.0F)
							break label3;
	//  776 1520:fload           4
	//  777 1522:fconst_0        
	//  778 1523:fcmpl           
	//  779 1524:ifle            1679
						j5 = (int)(((float)l3 * f2) / f1);
	//  780 1527:iload           11
	//  781 1529:i2f             
	//  782 1530:fload           4
	//  783 1532:fmul            
	//  784 1533:fload_3         
	//  785 1534:fdiv            
	//  786 1535:f2i             
	//  787 1536:istore          14
						f1 -= f2;
	//  788 1538:fload_3         
	//  789 1539:fload           4
	//  790 1541:fsub            
	//  791 1542:fstore_3        
						l6 = getPaddingTop();
	//  792 1543:aload_0         
	//  793 1544:invokevirtual   #226 <Method int getPaddingTop()>
	//  794 1547:istore          17
						int i8 = getPaddingBottom();
	//  795 1549:aload_0         
	//  796 1550:invokevirtual   #229 <Method int getPaddingBottom()>
	//  797 1553:istore          18
						k4 = l3 - j5;
	//  798 1555:iload           11
	//  799 1557:iload           14
	//  800 1559:isub            
	//  801 1560:istore          13
						l6 = getChildMeasureSpec(j1, l6 + i8 + layoutparams2.topMargin + layoutparams2.bottomMargin, layoutparams2.height);
	//  802 1562:iload_2         
	//  803 1563:iload           17
	//  804 1565:iload           18
	//  805 1567:iadd            
	//  806 1568:aload           27
	//  807 1570:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  808 1573:iadd            
	//  809 1574:aload           27
	//  810 1576:getfield        #194 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  811 1579:iadd            
	//  812 1580:aload           27
	//  813 1582:getfield        #158 <Field int LinearLayoutCompat$LayoutParams.height>
	//  814 1585:invokestatic    #249 <Method int getChildMeasureSpec(int, int, int)>
	//  815 1588:istore          17
						if(layoutparams2.width == 0 && j6 == 0x40000000)
	//* 816 1590:aload           27
	//* 817 1592:getfield        #155 <Field int LinearLayoutCompat$LayoutParams.width>
	//* 818 1595:ifne            1620
	//* 819 1598:iload           15
	//* 820 1600:ldc1            #137 <Int 0x40000000>
	//* 821 1602:icmpeq          1608
	//* 822 1605:goto            1620
						{
							if(j5 > 0)
	//* 823 1608:iload           14
	//* 824 1610:ifle            1639
							{
								l3 = j5;
	//  825 1613:iload           14
	//  826 1615:istore          11
								break label4;
	//  827 1617:goto            1642
							}
						} else
						{
							j5 = view1.getMeasuredWidth() + j5;
	//  828 1620:aload           26
	//  829 1622:invokevirtual   #166 <Method int View.getMeasuredWidth()>
	//  830 1625:iload           14
	//  831 1627:iadd            
	//  832 1628:istore          14
							l3 = j5;
	//  833 1630:iload           14
	//  834 1632:istore          11
							if(j5 >= 0)
								break label4;
	//  835 1634:iload           14
	//  836 1636:ifge            1642
						}
						l3 = 0;
	//  837 1639:iconst_0        
	//  838 1640:istore          11
					}
					view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(l3, 0x40000000), l6);
	//  839 1642:aload           26
	//  840 1644:iload           11
	//  841 1646:ldc1            #137 <Int 0x40000000>
	//  842 1648:invokestatic    #142 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  843 1651:iload           17
	//  844 1653:invokevirtual   #240 <Method void View.measure(int, int)>
					k1 = View.combineMeasuredStates(k1, view1.getMeasuredState() & 0xff000000);
	//  845 1656:iload           5
	//  846 1658:aload           26
	//  847 1660:invokevirtual   #220 <Method int View.getMeasuredState()>
	//  848 1663:ldc2            #320 <Int 0xff000000>
	//  849 1666:iand            
	//  850 1667:invokestatic    #223 <Method int View.combineMeasuredStates(int, int)>
	//  851 1670:istore          5
					l3 = k4;
	//  852 1672:iload           13
	//  853 1674:istore          11
				}
	//* 854 1676:goto            1679
				int l4;
				if(flag3)
	//* 855 1679:iload           16
	//* 856 1681:ifeq            1724
				{
					l4 = f + (view1.getMeasuredWidth() + layoutparams2.leftMargin + layoutparams2.rightMargin + b(view1));
	//  857 1684:aload_0         
	//  858 1685:getfield        #170 <Field int f>
	//  859 1688:aload           26
	//  860 1690:invokevirtual   #166 <Method int View.getMeasuredWidth()>
	//  861 1693:aload           27
	//  862 1695:getfield        #214 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  863 1698:iadd            
	//  864 1699:aload           27
	//  865 1701:getfield        #217 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  866 1704:iadd            
	//  867 1705:aload_0         
	//  868 1706:aload           26
	//  869 1708:invokevirtual   #204 <Method int b(View)>
	//  870 1711:iadd            
	//  871 1712:iadd            
	//  872 1713:istore          13
				} else
	//* 873 1715:aload_0         
	//* 874 1716:iload           13
	//* 875 1718:putfield        #170 <Field int f>
	//* 876 1721:goto            1767
				{
					l4 = f;
	//  877 1724:aload_0         
	//  878 1725:getfield        #170 <Field int f>
	//  879 1728:istore          13
					l4 = Math.max(l4, view1.getMeasuredWidth() + l4 + layoutparams2.leftMargin + layoutparams2.rightMargin + b(view1));
	//  880 1730:iload           13
	//  881 1732:aload           26
	//  882 1734:invokevirtual   #166 <Method int View.getMeasuredWidth()>
	//  883 1737:iload           13
	//  884 1739:iadd            
	//  885 1740:aload           27
	//  886 1742:getfield        #214 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  887 1745:iadd            
	//  888 1746:aload           27
	//  889 1748:getfield        #217 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  890 1751:iadd            
	//  891 1752:aload_0         
	//  892 1753:aload           26
	//  893 1755:invokevirtual   #204 <Method int b(View)>
	//  894 1758:iadd            
	//  895 1759:invokestatic    #199 <Method int Math.max(int, int)>
	//  896 1762:istore          13
				}
				f = l4;
	//* 897 1764:goto            1715
				boolean flag2;
				if(j9 != 0x40000000 && layoutparams2.height == -1)
	//* 898 1767:iload           21
	//* 899 1769:ldc1            #137 <Int 0x40000000>
	//* 900 1771:icmpeq          1789
	//* 901 1774:aload           27
	//* 902 1776:getfield        #158 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 903 1779:iconst_m1       
	//* 904 1780:icmpne          1789
					flag2 = true;
	//  905 1783:iconst_1        
	//  906 1784:istore          13
				else
	//* 907 1786:goto            1792
					flag2 = false;
	//  908 1789:iconst_0        
	//  909 1790:istore          13
				int j8 = layoutparams2.topMargin + layoutparams2.bottomMargin;
	//  910 1792:aload           27
	//  911 1794:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  912 1797:aload           27
	//  913 1799:getfield        #194 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  914 1802:iadd            
	//  915 1803:istore          18
				int i7 = view1.getMeasuredHeight() + j8;
	//  916 1805:aload           26
	//  917 1807:invokevirtual   #161 <Method int View.getMeasuredHeight()>
	//  918 1810:iload           18
	//  919 1812:iadd            
	//  920 1813:istore          17
				j5 = Math.max(k3, i7);
	//  921 1815:iload           9
	//  922 1817:iload           17
	//  923 1819:invokestatic    #199 <Method int Math.max(int, int)>
	//  924 1822:istore          14
				if(flag2)
	//* 925 1824:iload           13
	//* 926 1826:ifeq            1836
					k3 = j8;
	//  927 1829:iload           18
	//  928 1831:istore          9
				else
	//* 929 1833:goto            1840
					k3 = i7;
	//  930 1836:iload           17
	//  931 1838:istore          9
				k3 = Math.max(j2, k3);
	//  932 1840:iload           8
	//  933 1842:iload           9
	//  934 1844:invokestatic    #199 <Method int Math.max(int, int)>
	//  935 1847:istore          9
				if(i2 != 0 && layoutparams2.height == -1)
	//* 936 1849:iload           7
	//* 937 1851:ifeq            1869
	//* 938 1854:aload           27
	//* 939 1856:getfield        #158 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 940 1859:iconst_m1       
	//* 941 1860:icmpne          1869
					i2 = 1;
	//  942 1863:iconst_1        
	//  943 1864:istore          7
				else
	//* 944 1866:goto            1872
					i2 = 0;
	//  945 1869:iconst_0        
	//  946 1870:istore          7
				if(flag4)
	//* 947 1872:iload           23
	//* 948 1874:ifeq            1964
				{
					int i5 = view1.getBaseline();
	//  949 1877:aload           26
	//  950 1879:invokevirtual   #319 <Method int View.getBaseline()>
	//  951 1882:istore          13
					if(i5 != -1)
	//* 952 1884:iload           13
	//* 953 1886:iconst_m1       
	//* 954 1887:icmpeq          1964
					{
						if(layoutparams2.h < 0)
	//* 955 1890:aload           27
	//* 956 1892:getfield        #259 <Field int LinearLayoutCompat$LayoutParams.h>
	//* 957 1895:ifge            1907
							j2 = e;
	//  958 1898:aload_0         
	//  959 1899:getfield        #46  <Field int e>
	//  960 1902:istore          8
						else
	//* 961 1904:goto            1914
							j2 = layoutparams2.h;
	//  962 1907:aload           27
	//  963 1909:getfield        #259 <Field int LinearLayoutCompat$LayoutParams.h>
	//  964 1912:istore          8
						j2 = ((j2 & 0x70) >> 4 & -2) >> 1;
	//  965 1914:iload           8
	//  966 1916:bipush          112
	//  967 1918:iand            
	//  968 1919:iconst_4        
	//  969 1920:ishr            
	//  970 1921:bipush          -2
	//  971 1923:iand            
	//  972 1924:iconst_1        
	//  973 1925:ishr            
	//  974 1926:istore          8
						ai[j2] = Math.max(ai[j2], i5);
	//  975 1928:aload           30
	//  976 1930:iload           8
	//  977 1932:aload           30
	//  978 1934:iload           8
	//  979 1936:iaload          
	//  980 1937:iload           13
	//  981 1939:invokestatic    #199 <Method int Math.max(int, int)>
	//  982 1942:iastore         
						obj[j2] = Math.max(obj[j2], i7 - i5);
	//  983 1943:aload           25
	//  984 1945:iload           8
	//  985 1947:aload           25
	//  986 1949:iload           8
	//  987 1951:iaload          
	//  988 1952:iload           17
	//  989 1954:iload           13
	//  990 1956:isub            
	//  991 1957:invokestatic    #199 <Method int Math.max(int, int)>
	//  992 1960:iastore         
					}
				}
	//* 993 1961:goto            1964
				j2 = k3;
	//  994 1964:iload           9
	//  995 1966:istore          8
				k3 = j5;
	//  996 1968:iload           14
	//  997 1970:istore          9
			}

	//  998 1972:goto            1975
	//  999 1975:iload           12
	// 1000 1977:iconst_1        
	// 1001 1978:iadd            
	// 1002 1979:istore          12
	//*1003 1981:goto            1470
			l3 = l1;
	// 1004 1984:iload           6
	// 1005 1986:istore          11
			f = f + (getPaddingLeft() + getPaddingRight());
	// 1006 1988:aload_0         
	// 1007 1989:aload_0         
	// 1008 1990:getfield        #170 <Field int f>
	// 1009 1993:aload_0         
	// 1010 1994:invokevirtual   #243 <Method int getPaddingLeft()>
	// 1011 1997:aload_0         
	// 1012 1998:invokevirtual   #246 <Method int getPaddingRight()>
	// 1013 2001:iadd            
	// 1014 2002:iadd            
	// 1015 2003:putfield        #170 <Field int f>
			if(ai[1] == -1 && ai[0] == -1 && ai[2] == -1 && ai[3] == -1)
	//*1016 2006:aload           30
	//*1017 2008:iconst_1        
	//*1018 2009:iaload          
	//*1019 2010:iconst_m1       
	//*1020 2011:icmpne          2052
	//*1021 2014:aload           30
	//*1022 2016:iconst_0        
	//*1023 2017:iaload          
	//*1024 2018:iconst_m1       
	//*1025 2019:icmpne          2052
	//*1026 2022:aload           30
	//*1027 2024:iconst_2        
	//*1028 2025:iaload          
	//*1029 2026:iconst_m1       
	//*1030 2027:icmpne          2052
	//*1031 2030:aload           30
	//*1032 2032:iconst_3        
	//*1033 2033:iaload          
	//*1034 2034:iconst_m1       
	//*1035 2035:icmpeq          2041
	//*1036 2038:goto            2052
			{
				l1 = k3;
	// 1037 2041:iload           9
	// 1038 2043:istore          6
				j5 = k1;
	// 1039 2045:iload           5
	// 1040 2047:istore          14
			} else
	//*1041 2049:goto            2114
			{
				l1 = Math.max(k3, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(obj[3], Math.max(obj[0], Math.max(obj[1], obj[2]))));
	// 1042 2052:iload           9
	// 1043 2054:aload           30
	// 1044 2056:iconst_3        
	// 1045 2057:iaload          
	// 1046 2058:aload           30
	// 1047 2060:iconst_0        
	// 1048 2061:iaload          
	// 1049 2062:aload           30
	// 1050 2064:iconst_1        
	// 1051 2065:iaload          
	// 1052 2066:aload           30
	// 1053 2068:iconst_2        
	// 1054 2069:iaload          
	// 1055 2070:invokestatic    #199 <Method int Math.max(int, int)>
	// 1056 2073:invokestatic    #199 <Method int Math.max(int, int)>
	// 1057 2076:invokestatic    #199 <Method int Math.max(int, int)>
	// 1058 2079:aload           25
	// 1059 2081:iconst_3        
	// 1060 2082:iaload          
	// 1061 2083:aload           25
	// 1062 2085:iconst_0        
	// 1063 2086:iaload          
	// 1064 2087:aload           25
	// 1065 2089:iconst_1        
	// 1066 2090:iaload          
	// 1067 2091:aload           25
	// 1068 2093:iconst_2        
	// 1069 2094:iaload          
	// 1070 2095:invokestatic    #199 <Method int Math.max(int, int)>
	// 1071 2098:invokestatic    #199 <Method int Math.max(int, int)>
	// 1072 2101:invokestatic    #199 <Method int Math.max(int, int)>
	// 1073 2104:iadd            
	// 1074 2105:invokestatic    #199 <Method int Math.max(int, int)>
	// 1075 2108:istore          6
				j5 = k1;
	// 1076 2110:iload           5
	// 1077 2112:istore          14
			}
		}
		if(i2 == 0 && j9 != 0x40000000)
	//*1078 2114:iload           7
	//*1079 2116:ifne            2133
	//*1080 2119:iload           21
	//*1081 2121:ldc1            #137 <Int 0x40000000>
	//*1082 2123:icmpeq          2133
			l1 = j2;
	// 1083 2126:iload           8
	// 1084 2128:istore          6
	//*1085 2130:goto            2133
		setMeasuredDimension(l8 | 0xff000000 & j5, View.resolveSizeAndState(Math.max(l1 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), j1, j5 << 16));
	// 1086 2133:aload_0         
	// 1087 2134:iload           19
	// 1088 2136:ldc2            #320 <Int 0xff000000>
	// 1089 2139:iload           14
	// 1090 2141:iand            
	// 1091 2142:ior             
	// 1092 2143:iload           6
	// 1093 2145:aload_0         
	// 1094 2146:invokevirtual   #226 <Method int getPaddingTop()>
	// 1095 2149:aload_0         
	// 1096 2150:invokevirtual   #229 <Method int getPaddingBottom()>
	// 1097 2153:iadd            
	// 1098 2154:iadd            
	// 1099 2155:aload_0         
	// 1100 2156:invokevirtual   #232 <Method int getSuggestedMinimumHeight()>
	// 1101 2159:invokestatic    #199 <Method int Math.max(int, int)>
	// 1102 2162:iload_2         
	// 1103 2163:iload           14
	// 1104 2165:bipush          16
	// 1105 2167:ishl            
	// 1106 2168:invokestatic    #236 <Method int View.resolveSizeAndState(int, int, int)>
	// 1107 2171:invokevirtual   #255 <Method void setMeasuredDimension(int, int)>
		if(flag)
	//*1108 2174:iload           10
	//*1109 2176:ifeq            2186
			d(l3, i1);
	// 1110 2179:aload_0         
	// 1111 2180:iload           11
	// 1112 2182:iload_1         
	// 1113 2183:invokespecial   #322 <Method void d(int, int)>
	// 1114 2186:return          
	}

	void b(int i1, int j1, int k1, int l1)
	{
		boolean flag = bd.a(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #327 <Method boolean bd.a(View)>
	//    2    4:istore          18
		int i3 = getPaddingTop();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #226 <Method int getPaddingTop()>
	//    5   10:istore          10
		int l3 = l1 - j1;
	//    6   12:iload           4
	//    7   14:iload_2         
	//    8   15:isub            
	//    9   16:istore          12
		int i4 = getPaddingBottom();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #229 <Method int getPaddingBottom()>
	//   12   22:istore          13
		int j4 = getPaddingBottom();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #229 <Method int getPaddingBottom()>
	//   15   28:istore          14
		int k2 = getVirtualChildCount();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #173 <Method int getVirtualChildCount()>
	//   18   34:istore          8
		l1 = e;
	//   19   36:aload_0         
	//   20   37:getfield        #46  <Field int e>
	//   21   40:istore          4
		j1 = e & 0x70;
	//   22   42:aload_0         
	//   23   43:getfield        #46  <Field int e>
	//   24   46:bipush          112
	//   25   48:iand            
	//   26   49:istore_2        
		boolean flag1 = a;
	//   27   50:aload_0         
	//   28   51:getfield        #39  <Field boolean a>
	//   29   54:istore          19
		int ai[] = i;
	//   30   56:aload_0         
	//   31   57:getfield        #312 <Field int[] i>
	//   32   60:astore          20
		int ai1[] = j;
	//   33   62:aload_0         
	//   34   63:getfield        #314 <Field int[] j>
	//   35   66:astore          21
		l1 = android.support.v4.view.d.a(l1 & 0x800007, s.e(((View) (this))));
	//   36   68:iload           4
	//   37   70:ldc2            #260 <Int 0x800007>
	//   38   73:iand            
	//   39   74:aload_0         
	//   40   75:invokestatic    #264 <Method int s.e(View)>
	//   41   78:invokestatic    #267 <Method int d.a(int, int)>
	//   42   81:istore          4
		if(l1 != 1)
	//*  43   83:iload           4
	//*  44   85:iconst_1        
	//*  45   86:icmpeq          120
		{
			if(l1 != 5)
	//*  46   89:iload           4
	//*  47   91:iconst_5        
	//*  48   92:icmpeq          103
				i1 = getPaddingLeft();
	//   49   95:aload_0         
	//   50   96:invokevirtual   #243 <Method int getPaddingLeft()>
	//   51   99:istore_1        
			else
	//*  52  100:goto            140
				i1 = (getPaddingLeft() + k1) - i1 - f;
	//   53  103:aload_0         
	//   54  104:invokevirtual   #243 <Method int getPaddingLeft()>
	//   55  107:iload_3         
	//   56  108:iadd            
	//   57  109:iload_1         
	//   58  110:isub            
	//   59  111:aload_0         
	//   60  112:getfield        #170 <Field int f>
	//   61  115:isub            
	//   62  116:istore_1        
		} else
	//*  63  117:goto            140
		{
			l1 = getPaddingLeft();
	//   64  120:aload_0         
	//   65  121:invokevirtual   #243 <Method int getPaddingLeft()>
	//   66  124:istore          4
			i1 = (k1 - i1 - f) / 2 + l1;
	//   67  126:iload_3         
	//   68  127:iload_1         
	//   69  128:isub            
	//   70  129:aload_0         
	//   71  130:getfield        #170 <Field int f>
	//   72  133:isub            
	//   73  134:iconst_2        
	//   74  135:idiv            
	//   75  136:iload           4
	//   76  138:iadd            
	//   77  139:istore_1        
		}
		int j2;
		byte byte0;
		if(flag)
	//*  78  140:iload           18
	//*  79  142:ifeq            157
		{
			j2 = k2 - 1;
	//   80  145:iload           8
	//   81  147:iconst_1        
	//   82  148:isub            
	//   83  149:istore          6
			byte0 = -1;
	//   84  151:iconst_m1       
	//   85  152:istore          7
		} else
	//*  86  154:goto            163
		{
			j2 = 0;
	//   87  157:iconst_0        
	//   88  158:istore          6
			byte0 = 1;
	//   89  160:iconst_1        
	//   90  161:istore          7
		}
		l1 = 0;
	//   91  163:iconst_0        
	//   92  164:istore          4
		k1 = i3;
	//   93  166:iload           10
	//   94  168:istore_3        
		for(; l1 < k2; l1++)
	//*  95  169:iload           4
	//*  96  171:iload           8
	//*  97  173:icmpge          541
		{
			int l4 = j2 + byte0 * l1;
	//   98  176:iload           6
	//   99  178:iload           7
	//  100  180:iload           4
	//  101  182:imul            
	//  102  183:iadd            
	//  103  184:istore          16
			View view = b(l4);
	//  104  186:aload_0         
	//  105  187:iload           16
	//  106  189:invokevirtual   #145 <Method View b(int)>
	//  107  192:astore          22
			if(view == null)
	//* 108  194:aload           22
	//* 109  196:ifnonnull       211
			{
				i1 += d(l4);
	//  110  199:iload_1         
	//  111  200:aload_0         
	//  112  201:iload           16
	//  113  203:invokevirtual   #180 <Method int d(int)>
	//  114  206:iadd            
	//  115  207:istore_1        
				continue;
	//  116  208:goto            532
			}
			if(view.getVisibility() == 8)
				continue;
	//  117  211:aload           22
	//  118  213:invokevirtual   #148 <Method int View.getVisibility()>
	//  119  216:bipush          8
	//  120  218:icmpeq          529
			int k4 = view.getMeasuredWidth();
	//  121  221:aload           22
	//  122  223:invokevirtual   #166 <Method int View.getMeasuredWidth()>
	//  123  226:istore          15
			int i5 = view.getMeasuredHeight();
	//  124  228:aload           22
	//  125  230:invokevirtual   #161 <Method int View.getMeasuredHeight()>
	//  126  233:istore          17
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//  127  235:aload           22
	//  128  237:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  129  240:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//  130  243:astore          23
			int l2;
			if(flag1 && layoutparams.height != -1)
	//* 131  245:iload           19
	//* 132  247:ifeq            269
	//* 133  250:aload           23
	//* 134  252:getfield        #158 <Field int LinearLayoutCompat$LayoutParams.height>
	//* 135  255:iconst_m1       
	//* 136  256:icmpeq          269
				l2 = view.getBaseline();
	//  137  259:aload           22
	//  138  261:invokevirtual   #319 <Method int View.getBaseline()>
	//  139  264:istore          9
			else
	//* 140  266:goto            272
				l2 = -1;
	//  141  269:iconst_m1       
	//  142  270:istore          9
			int j3 = layoutparams.h;
	//  143  272:aload           23
	//  144  274:getfield        #259 <Field int LinearLayoutCompat$LayoutParams.h>
	//  145  277:istore          11
			int i2 = j3;
	//  146  279:iload           11
	//  147  281:istore          5
			if(j3 < 0)
	//* 148  283:iload           11
	//* 149  285:ifge            291
				i2 = j1;
	//  150  288:iload_2         
	//  151  289:istore          5
			i2 &= 0x70;
	//  152  291:iload           5
	//  153  293:bipush          112
	//  154  295:iand            
	//  155  296:istore          5
			if(i2 != 16)
	//* 156  298:iload           5
	//* 157  300:bipush          16
	//* 158  302:icmpeq          409
			{
				if(i2 != 48)
	//* 159  305:iload           5
	//* 160  307:bipush          48
	//* 161  309:icmpeq          376
				{
					if(i2 != 80)
	//* 162  312:iload           5
	//* 163  314:bipush          80
	//* 164  316:icmpeq          325
					{
						i2 = k1;
	//  165  319:iload_3         
	//  166  320:istore          5
					} else
	//* 167  322:goto            438
					{
						int k3 = l3 - i4 - i5 - layoutparams.bottomMargin;
	//  168  325:iload           12
	//  169  327:iload           13
	//  170  329:isub            
	//  171  330:iload           17
	//  172  332:isub            
	//  173  333:aload           23
	//  174  335:getfield        #194 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  175  338:isub            
	//  176  339:istore          11
						i2 = k3;
	//  177  341:iload           11
	//  178  343:istore          5
						if(l2 != -1)
	//* 179  345:iload           9
	//* 180  347:iconst_m1       
	//* 181  348:icmpeq          373
						{
							i2 = view.getMeasuredHeight();
	//  182  351:aload           22
	//  183  353:invokevirtual   #161 <Method int View.getMeasuredHeight()>
	//  184  356:istore          5
							i2 = k3 - (ai1[2] - (i2 - l2));
	//  185  358:iload           11
	//  186  360:aload           21
	//  187  362:iconst_2        
	//  188  363:iaload          
	//  189  364:iload           5
	//  190  366:iload           9
	//  191  368:isub            
	//  192  369:isub            
	//  193  370:isub            
	//  194  371:istore          5
						}
					}
				} else
	//* 195  373:goto            322
				{
					i2 = layoutparams.topMargin + k1;
	//  196  376:aload           23
	//  197  378:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  198  381:iload_3         
	//  199  382:iadd            
	//  200  383:istore          5
					if(l2 != -1)
	//* 201  385:iload           9
	//* 202  387:iconst_m1       
	//* 203  388:icmpeq          406
						i2 += ai[1] - l2;
	//  204  391:iload           5
	//  205  393:aload           20
	//  206  395:iconst_1        
	//  207  396:iaload          
	//  208  397:iload           9
	//  209  399:isub            
	//  210  400:iadd            
	//  211  401:istore          5
				}
			} else
	//* 212  403:goto            406
	//* 213  406:goto            438
			{
				i2 = ((l3 - i3 - j4 - i5) / 2 + k1 + layoutparams.topMargin) - layoutparams.bottomMargin;
	//  214  409:iload           12
	//  215  411:iload           10
	//  216  413:isub            
	//  217  414:iload           14
	//  218  416:isub            
	//  219  417:iload           17
	//  220  419:isub            
	//  221  420:iconst_2        
	//  222  421:idiv            
	//  223  422:iload_3         
	//  224  423:iadd            
	//  225  424:aload           23
	//  226  426:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  227  429:iadd            
	//  228  430:aload           23
	//  229  432:getfield        #194 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  230  435:isub            
	//  231  436:istore          5
			}
			l2 = i1;
	//  232  438:iload_1         
	//  233  439:istore          9
			if(c(l4))
	//* 234  441:aload_0         
	//* 235  442:iload           16
	//* 236  444:invokevirtual   #185 <Method boolean c(int)>
	//* 237  447:ifeq            458
				l2 = i1 + l;
	//  238  450:iload_1         
	//  239  451:aload_0         
	//  240  452:getfield        #316 <Field int l>
	//  241  455:iadd            
	//  242  456:istore          9
			i1 = layoutparams.leftMargin + l2;
	//  243  458:aload           23
	//  244  460:getfield        #214 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  245  463:iload           9
	//  246  465:iadd            
	//  247  466:istore_1        
			a(view, i1 + a(view), i2, k4, i5);
	//  248  467:aload_0         
	//  249  468:aload           22
	//  250  470:iload_1         
	//  251  471:aload_0         
	//  252  472:aload           22
	//  253  474:invokevirtual   #269 <Method int a(View)>
	//  254  477:iadd            
	//  255  478:iload           5
	//  256  480:iload           15
	//  257  482:iload           17
	//  258  484:invokespecial   #271 <Method void a(View, int, int, int, int)>
			i2 = layoutparams.rightMargin;
	//  259  487:aload           23
	//  260  489:getfield        #217 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  261  492:istore          5
			l2 = b(view);
	//  262  494:aload_0         
	//  263  495:aload           22
	//  264  497:invokevirtual   #204 <Method int b(View)>
	//  265  500:istore          9
			l1 += a(view, l4);
	//  266  502:iload           4
	//  267  504:aload_0         
	//  268  505:aload           22
	//  269  507:iload           16
	//  270  509:invokevirtual   #182 <Method int a(View, int)>
	//  271  512:iadd            
	//  272  513:istore          4
			i1 += k4 + i2 + l2;
	//  273  515:iload_1         
	//  274  516:iload           15
	//  275  518:iload           5
	//  276  520:iadd            
	//  277  521:iload           9
	//  278  523:iadd            
	//  279  524:iadd            
	//  280  525:istore_1        
		}

	//  281  526:goto            532
	//  282  529:goto            208
	//  283  532:iload           4
	//  284  534:iconst_1        
	//  285  535:iadd            
	//  286  536:istore          4
	//* 287  538:goto            169
	//  288  541:return          
	}

	void b(Canvas canvas)
	{
		boolean flag;
		View view1;
		int i2 = getVirtualChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #173 <Method int getVirtualChildCount()>
	//    2    4:istore          4
		flag = bd.a(((View) (this)));
	//    3    6:aload_0         
	//    4    7:invokestatic    #327 <Method boolean bd.a(View)>
	//    5   10:istore          5
		for(int i1 = 0; i1 < i2; i1++)
	//*   6   12:iconst_0        
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:iload           4
	//*  10   17:icmpge          110
		{
			View view = b(i1);
	//   11   20:aload_0         
	//   12   21:iload_2         
	//   13   22:invokevirtual   #145 <Method View b(int)>
	//   14   25:astore          6
			if(view == null || view.getVisibility() == 8 || !c(i1))
				continue;
	//   15   27:aload           6
	//   16   29:ifnull          103
	//   17   32:aload           6
	//   18   34:invokevirtual   #148 <Method int View.getVisibility()>
	//   19   37:bipush          8
	//   20   39:icmpeq          103
	//   21   42:aload_0         
	//   22   43:iload_2         
	//   23   44:invokevirtual   #185 <Method boolean c(int)>
	//   24   47:ifeq            103
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   25   50:aload           6
	//   26   52:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   27   55:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//   28   58:astore          7
			int k1;
			if(flag)
	//*  29   60:iload           5
	//*  30   62:ifeq            80
				k1 = view.getRight() + layoutparams.rightMargin;
	//   31   65:aload           6
	//   32   67:invokevirtual   #330 <Method int View.getRight()>
	//   33   70:aload           7
	//   34   72:getfield        #217 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//   35   75:iadd            
	//   36   76:istore_3        
			else
	//*  37   77:goto            97
				k1 = view.getLeft() - layoutparams.leftMargin - l;
	//   38   80:aload           6
	//   39   82:invokevirtual   #333 <Method int View.getLeft()>
	//   40   85:aload           7
	//   41   87:getfield        #214 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//   42   90:isub            
	//   43   91:aload_0         
	//   44   92:getfield        #316 <Field int l>
	//   45   95:isub            
	//   46   96:istore_3        
			b(canvas, k1);
	//   47   97:aload_0         
	//   48   98:aload_1         
	//   49   99:iload_3         
	//   50  100:invokevirtual   #335 <Method void b(Canvas, int)>
		}

	//   51  103:iload_2         
	//   52  104:iconst_1        
	//   53  105:iadd            
	//   54  106:istore_2        
	//*  55  107:goto            14
		if(!c(i2))
			break MISSING_BLOCK_LABEL_217;
	//   56  110:aload_0         
	//   57  111:iload           4
	//   58  113:invokevirtual   #185 <Method boolean c(int)>
	//   59  116:ifeq            217
		view1 = b(i2 - 1);
	//   60  119:aload_0         
	//   61  120:iload           4
	//   62  122:iconst_1        
	//   63  123:isub            
	//   64  124:invokevirtual   #145 <Method View b(int)>
	//   65  127:astore          6
		if(view1 != null) goto _L2; else goto _L1
	//   66  129:aload           6
	//   67  131:ifnonnull       169
_L1:
		int j1;
		int l1;
		if(flag)
	//*  68  134:iload           5
	//*  69  136:ifeq            147
		{
			j1 = getPaddingLeft();
	//   70  139:aload_0         
	//   71  140:invokevirtual   #243 <Method int getPaddingLeft()>
	//   72  143:istore_2        
			break MISSING_BLOCK_LABEL_211;
	//   73  144:goto            211
		}
		j1 = getWidth();
	//   74  147:aload_0         
	//   75  148:invokevirtual   #289 <Method int getWidth()>
	//   76  151:istore_2        
		l1 = getPaddingRight();
	//   77  152:aload_0         
	//   78  153:invokevirtual   #246 <Method int getPaddingRight()>
	//   79  156:istore_3        
_L4:
		j1 = j1 - l1 - l;
	//   80  157:iload_2         
	//   81  158:iload_3         
	//   82  159:isub            
	//   83  160:aload_0         
	//   84  161:getfield        #316 <Field int l>
	//   85  164:isub            
	//   86  165:istore_2        
		break MISSING_BLOCK_LABEL_211;
	//   87  166:goto            211
_L2:
		LayoutParams layoutparams1;
		layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//   88  169:aload           6
	//   89  171:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   90  174:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//   91  177:astore          7
		if(!flag)
			break; /* Loop/switch isn't completed */
	//   92  179:iload           5
	//   93  181:ifeq            199
		j1 = view1.getLeft();
	//   94  184:aload           6
	//   95  186:invokevirtual   #333 <Method int View.getLeft()>
	//   96  189:istore_2        
		l1 = layoutparams1.leftMargin;
	//   97  190:aload           7
	//   98  192:getfield        #214 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//   99  195:istore_3        
		if(true) goto _L4; else goto _L3
	//  100  196:goto            157
_L3:
		j1 = view1.getRight() + layoutparams1.rightMargin;
	//  101  199:aload           6
	//  102  201:invokevirtual   #330 <Method int View.getRight()>
	//  103  204:aload           7
	//  104  206:getfield        #217 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  105  209:iadd            
	//  106  210:istore_2        
		b(canvas, j1);
	//  107  211:aload_0         
	//  108  212:aload_1         
	//  109  213:iload_2         
	//  110  214:invokevirtual   #335 <Method void b(Canvas, int)>
	//  111  217:return          
	}

	void b(Canvas canvas, int i1)
	{
		k.setBounds(i1, getPaddingTop() + o, l + i1, getHeight() - getPaddingBottom() - o);
	//    0    0:aload_0         
	//    1    1:getfield        #286 <Field Drawable k>
	//    2    4:iload_2         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #226 <Method int getPaddingTop()>
	//    5    9:aload_0         
	//    6   10:getfield        #121 <Field int o>
	//    7   13:iadd            
	//    8   14:aload_0         
	//    9   15:getfield        #316 <Field int l>
	//   10   18:iload_2         
	//   11   19:iadd            
	//   12   20:aload_0         
	//   13   21:invokevirtual   #281 <Method int getHeight()>
	//   14   24:aload_0         
	//   15   25:invokevirtual   #229 <Method int getPaddingBottom()>
	//   16   28:isub            
	//   17   29:aload_0         
	//   18   30:getfield        #121 <Field int o>
	//   19   33:isub            
	//   20   34:invokevirtual   #294 <Method void Drawable.setBounds(int, int, int, int)>
		k.draw(canvas);
	//   21   37:aload_0         
	//   22   38:getfield        #286 <Field Drawable k>
	//   23   41:aload_1         
	//   24   42:invokevirtual   #297 <Method void Drawable.draw(Canvas)>
	//   25   45:return          
	}

	protected boolean c(int i1)
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(i1 == 0)
	//*   4    4:iload_1         
	//*   5    5:ifne            21
		{
			if((n & 1) != 0)
	//*   6    8:aload_0         
	//*   7    9:getfield        #114 <Field int n>
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
		if(i1 == getChildCount())
	//*  15   21:iload_1         
	//*  16   22:aload_0         
	//*  17   23:invokevirtual   #338 <Method int getChildCount()>
	//*  18   26:icmpne          44
		{
			boolean flag1 = flag2;
	//   19   29:iload_3         
	//   20   30:istore_2        
			if((n & 4) != 0)
	//*  21   31:aload_0         
	//*  22   32:getfield        #114 <Field int n>
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
		if((n & 2) != 0)
	//*  30   44:aload_0         
	//*  31   45:getfield        #114 <Field int n>
	//*  32   48:iconst_2        
	//*  33   49:iand            
	//*  34   50:ifeq            83
			for(i1--; i1 >= 0; i1--)
	//*  35   53:iload_1         
	//*  36   54:iconst_1        
	//*  37   55:isub            
	//*  38   56:istore_1        
	//*  39   57:iload_1         
	//*  40   58:iflt            83
				if(getChildAt(i1).getVisibility() != 8)
	//*  41   61:aload_0         
	//*  42   62:iload_1         
	//*  43   63:invokevirtual   #310 <Method View getChildAt(int)>
	//*  44   66:invokevirtual   #148 <Method int View.getVisibility()>
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
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return layoutparams instanceof LayoutParams;
	//    0    0:aload_1         
	//    1    1:instanceof      #6   <Class LinearLayoutCompat$LayoutParams>
	//    2    4:ireturn         
	}

	int d(int i1)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (j()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #344 <Method LinearLayoutCompat$LayoutParams j()>
	//    2    4:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (b(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #348 <Method LinearLayoutCompat$LayoutParams b(AttributeSet)>
	//    3    5:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (b(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #351 <Method LinearLayoutCompat$LayoutParams b(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public int getBaseline()
	{
		if(b < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field int b>
	//*   2    4:ifge            12
			return super.getBaseline();
	//    3    7:aload_0         
	//    4    8:invokespecial   #352 <Method int ViewGroup.getBaseline()>
	//    5   11:ireturn         
		if(getChildCount() <= b)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #338 <Method int getChildCount()>
	//*   8   16:aload_0         
	//*   9   17:getfield        #41  <Field int b>
	//*  10   20:icmpgt          34
			throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
	//   11   23:new             #206 <Class RuntimeException>
	//   12   26:dup             
	//   13   27:ldc2            #354 <String "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.">
	//   14   30:invokespecial   #211 <Method void RuntimeException(String)>
	//   15   33:athrow          
		View view = getChildAt(b);
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #41  <Field int b>
	//   19   39:invokevirtual   #310 <Method View getChildAt(int)>
	//   20   42:astore          5
		int k1 = view.getBaseline();
	//   21   44:aload           5
	//   22   46:invokevirtual   #319 <Method int View.getBaseline()>
	//   23   49:istore_3        
		if(k1 == -1)
	//*  24   50:iload_3         
	//*  25   51:iconst_m1       
	//*  26   52:icmpne          75
			if(b == 0)
	//*  27   55:aload_0         
	//*  28   56:getfield        #41  <Field int b>
	//*  29   59:ifne            64
				return -1;
	//   30   62:iconst_m1       
	//   31   63:ireturn         
			else
				throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
	//   32   64:new             #206 <Class RuntimeException>
	//   33   67:dup             
	//   34   68:ldc2            #356 <String "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.">
	//   35   71:invokespecial   #211 <Method void RuntimeException(String)>
	//   36   74:athrow          
		int j1 = c;
	//   37   75:aload_0         
	//   38   76:getfield        #43  <Field int c>
	//   39   79:istore_2        
		int i1 = j1;
	//   40   80:iload_2         
	//   41   81:istore_1        
		if(d == 1)
	//*  42   82:aload_0         
	//*  43   83:getfield        #358 <Field int d>
	//*  44   86:iconst_1        
	//*  45   87:icmpne          179
		{
			int l1 = e & 0x70;
	//   46   90:aload_0         
	//   47   91:getfield        #46  <Field int e>
	//   48   94:bipush          112
	//   49   96:iand            
	//   50   97:istore          4
			i1 = j1;
	//   51   99:iload_2         
	//   52  100:istore_1        
			if(l1 != 48)
	//*  53  101:iload           4
	//*  54  103:bipush          48
	//*  55  105:icmpeq          179
				if(l1 != 16)
	//*  56  108:iload           4
	//*  57  110:bipush          16
	//*  58  112:icmpeq          150
				{
					if(l1 != 80)
	//*  59  115:iload           4
	//*  60  117:bipush          80
	//*  61  119:icmpeq          127
						i1 = j1;
	//   62  122:iload_2         
	//   63  123:istore_1        
					else
	//*  64  124:goto            179
						i1 = getBottom() - getTop() - getPaddingBottom() - f;
	//   65  127:aload_0         
	//   66  128:invokevirtual   #359 <Method int getBottom()>
	//   67  131:aload_0         
	//   68  132:invokevirtual   #360 <Method int getTop()>
	//   69  135:isub            
	//   70  136:aload_0         
	//   71  137:invokevirtual   #229 <Method int getPaddingBottom()>
	//   72  140:isub            
	//   73  141:aload_0         
	//   74  142:getfield        #170 <Field int f>
	//   75  145:isub            
	//   76  146:istore_1        
				} else
	//*  77  147:goto            179
				{
					i1 = j1 + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - f) / 2;
	//   78  150:iload_2         
	//   79  151:aload_0         
	//   80  152:invokevirtual   #359 <Method int getBottom()>
	//   81  155:aload_0         
	//   82  156:invokevirtual   #360 <Method int getTop()>
	//   83  159:isub            
	//   84  160:aload_0         
	//   85  161:invokevirtual   #226 <Method int getPaddingTop()>
	//   86  164:isub            
	//   87  165:aload_0         
	//   88  166:invokevirtual   #229 <Method int getPaddingBottom()>
	//   89  169:isub            
	//   90  170:aload_0         
	//   91  171:getfield        #170 <Field int f>
	//   92  174:isub            
	//   93  175:iconst_2        
	//   94  176:idiv            
	//   95  177:iadd            
	//   96  178:istore_1        
				}
		}
		return i1 + ((LayoutParams)view.getLayoutParams()).topMargin + k1;
	//   97  179:iload_1         
	//   98  180:aload           5
	//   99  182:invokevirtual   #152 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  100  185:checkcast       #6   <Class LinearLayoutCompat$LayoutParams>
	//  101  188:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  102  191:iadd            
	//  103  192:iload_3         
	//  104  193:iadd            
	//  105  194:ireturn         
	}

	public int getBaselineAlignedChildIndex()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int b>
	//    2    4:ireturn         
	}

	public Drawable getDividerDrawable()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #286 <Field Drawable k>
	//    2    4:areturn         
	}

	public int getDividerPadding()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field int o>
	//    2    4:ireturn         
	}

	public int getDividerWidth()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #316 <Field int l>
	//    2    4:ireturn         
	}

	public int getGravity()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int e>
	//    2    4:ireturn         
	}

	public int getOrientation()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #358 <Field int d>
	//    2    4:ireturn         
	}

	public int getShowDividers()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field int n>
	//    2    4:ireturn         
	}

	int getVirtualChildCount()
	{
		return getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #338 <Method int getChildCount()>
	//    2    4:ireturn         
	}

	public float getWeightSum()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field float g>
	//    2    4:freturn         
	}

	protected LayoutParams j()
	{
		if(d == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #358 <Field int d>
	//*   2    4:ifne            19
			return new LayoutParams(-2, -2);
	//    3    7:new             #6   <Class LinearLayoutCompat$LayoutParams>
	//    4   10:dup             
	//    5   11:bipush          -2
	//    6   13:bipush          -2
	//    7   15:invokespecial   #372 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//    8   18:areturn         
		if(d == 1)
	//*   9   19:aload_0         
	//*  10   20:getfield        #358 <Field int d>
	//*  11   23:iconst_1        
	//*  12   24:icmpne          38
			return new LayoutParams(-1, -2);
	//   13   27:new             #6   <Class LinearLayoutCompat$LayoutParams>
	//   14   30:dup             
	//   15   31:iconst_m1       
	//   16   32:bipush          -2
	//   17   34:invokespecial   #372 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//   18   37:areturn         
		else
			return null;
	//   19   38:aconst_null     
	//   20   39:areturn         
	}

	protected void onDraw(Canvas canvas)
	{
		if(k == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #286 <Field Drawable k>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(d == 1)
	//*   4    8:aload_0         
	//*   5    9:getfield        #358 <Field int d>
	//*   6   12:iconst_1        
	//*   7   13:icmpne          22
		{
			a(canvas);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #375 <Method void a(Canvas)>
			return;
	//   11   21:return          
		} else
		{
			b(canvas);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #377 <Method void b(Canvas)>
			return;
	//   15   27:return          
		}
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #384 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          22
		{
			super.onInitializeAccessibilityEvent(accessibilityevent);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #386 <Method void ViewGroup.onInitializeAccessibilityEvent(AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/widget/LinearLayoutCompat)).getName())));
	//    6   13:aload_1         
	//    7   14:ldc1            #2   <Class LinearLayoutCompat>
	//    8   16:invokevirtual   #392 <Method String Class.getName()>
	//    9   19:invokevirtual   #398 <Method void AccessibilityEvent.setClassName(CharSequence)>
		}
	//   10   22:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #384 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          22
		{
			super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #402 <Method void ViewGroup.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
			accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/widget/LinearLayoutCompat)).getName())));
	//    6   13:aload_1         
	//    7   14:ldc1            #2   <Class LinearLayoutCompat>
	//    8   16:invokevirtual   #392 <Method String Class.getName()>
	//    9   19:invokevirtual   #405 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
		}
	//   10   22:return          
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		if(d == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #358 <Field int d>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          19
		{
			a(i1, j1, k1, l1);
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:iload           5
	//    9   15:invokevirtual   #409 <Method void a(int, int, int, int)>
			return;
	//   10   18:return          
		} else
		{
			b(i1, j1, k1, l1);
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:iload_3         
	//   14   22:iload           4
	//   15   24:iload           5
	//   16   26:invokevirtual   #411 <Method void b(int, int, int, int)>
			return;
	//   17   29:return          
		}
	}

	protected void onMeasure(int i1, int j1)
	{
		if(d == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #358 <Field int d>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          15
		{
			a(i1, j1);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iload_2         
	//    7   11:invokevirtual   #414 <Method void a(int, int)>
			return;
	//    8   14:return          
		} else
		{
			b(i1, j1);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #416 <Method void b(int, int)>
			return;
	//   13   21:return          
		}
	}

	public void setBaselineAligned(boolean flag)
	{
		a = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field boolean a>
	//    3    5:return          
	}

	public void setBaselineAlignedChildIndex(int i1)
	{
		if(i1 >= 0 && i1 < getChildCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            21
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #338 <Method int getChildCount()>
	//*   5    9:icmplt          15
	//*   6   12:goto            21
		{
			b = i1;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #41  <Field int b>
			return;
	//   10   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #419 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #421 <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append("base aligned child index out of range (0, ");
	//   15   29:aload_2         
	//   16   30:ldc2            #423 <String "base aligned child index out of range (0, ">
	//   17   33:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			stringbuilder.append(getChildCount());
	//   19   37:aload_2         
	//   20   38:aload_0         
	//   21   39:invokevirtual   #338 <Method int getChildCount()>
	//   22   42:invokevirtual   #430 <Method StringBuilder StringBuilder.append(int)>
	//   23   45:pop             
			stringbuilder.append(")");
	//   24   46:aload_2         
	//   25   47:ldc2            #432 <String ")">
	//   26   50:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   28   54:new             #434 <Class IllegalArgumentException>
	//   29   57:dup             
	//   30   58:aload_2         
	//   31   59:invokevirtual   #437 <Method String StringBuilder.toString()>
	//   32   62:invokespecial   #438 <Method void IllegalArgumentException(String)>
	//   33   65:athrow          
		}
	}

	public void setDividerDrawable(Drawable drawable)
	{
		if(drawable == k)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #286 <Field Drawable k>
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		k = drawable;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #286 <Field Drawable k>
		boolean flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		if(drawable != null)
	//*  10   16:aload_1         
	//*  11   17:ifnull          39
		{
			l = drawable.getIntrinsicWidth();
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #441 <Method int Drawable.getIntrinsicWidth()>
	//   15   25:putfield        #316 <Field int l>
			m = drawable.getIntrinsicHeight();
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #444 <Method int Drawable.getIntrinsicHeight()>
	//   19   33:putfield        #187 <Field int m>
		} else
	//*  20   36:goto            49
		{
			l = 0;
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:putfield        #316 <Field int l>
			m = 0;
	//   24   44:aload_0         
	//   25   45:iconst_0        
	//   26   46:putfield        #187 <Field int m>
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
	//   33   57:invokevirtual   #447 <Method void setWillNotDraw(boolean)>
		requestLayout();
	//   34   60:aload_0         
	//   35   61:invokevirtual   #450 <Method void requestLayout()>
	//   36   64:return          
	}

	public void setDividerPadding(int i1)
	{
		o = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #121 <Field int o>
	//    3    5:return          
	}

	public void setGravity(int i1)
	{
		if(e != i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field int e>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          47
		{
			int j1 = i1;
	//    4    8:iload_1         
	//    5    9:istore_2        
			if((0x800007 & i1) == 0)
	//*   6   10:ldc2            #260 <Int 0x800007>
	//*   7   13:iload_1         
	//*   8   14:iand            
	//*   9   15:ifne            24
				j1 = i1 | 0x800003;
	//   10   18:iload_1         
	//   11   19:ldc2            #452 <Int 0x800003>
	//   12   22:ior             
	//   13   23:istore_2        
			i1 = j1;
	//   14   24:iload_2         
	//   15   25:istore_1        
			if((j1 & 0x70) == 0)
	//*  16   26:iload_2         
	//*  17   27:bipush          112
	//*  18   29:iand            
	//*  19   30:ifne            38
				i1 = j1 | 0x30;
	//   20   33:iload_2         
	//   21   34:bipush          48
	//   22   36:ior             
	//   23   37:istore_1        
			e = i1;
	//   24   38:aload_0         
	//   25   39:iload_1         
	//   26   40:putfield        #46  <Field int e>
			requestLayout();
	//   27   43:aload_0         
	//   28   44:invokevirtual   #450 <Method void requestLayout()>
		}
	//   29   47:return          
	}

	public void setHorizontalGravity(int i1)
	{
		i1 &= 0x800007;
	//    0    0:iload_1         
	//    1    1:ldc2            #260 <Int 0x800007>
	//    2    4:iand            
	//    3    5:istore_1        
		if((0x800007 & e) != i1)
	//*   4    6:ldc2            #260 <Int 0x800007>
	//*   5    9:aload_0         
	//*   6   10:getfield        #46  <Field int e>
	//*   7   13:iand            
	//*   8   14:iload_1         
	//*   9   15:icmpeq          36
		{
			e = i1 | e & 0xff7ffff8;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #46  <Field int e>
	//   14   24:ldc2            #454 <Int 0xff7ffff8>
	//   15   27:iand            
	//   16   28:ior             
	//   17   29:putfield        #46  <Field int e>
			requestLayout();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #450 <Method void requestLayout()>
		}
	//   20   36:return          
	}

	public void setMeasureWithLargestChildEnabled(boolean flag)
	{
		h = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #99  <Field boolean h>
	//    3    5:return          
	}

	public void setOrientation(int i1)
	{
		if(d != i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #358 <Field int d>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			d = i1;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #358 <Field int d>
			requestLayout();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #450 <Method void requestLayout()>
		}
	//    9   17:return          
	}

	public void setShowDividers(int i1)
	{
		if(i1 != n)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #114 <Field int n>
	//*   3    5:icmpeq          12
			requestLayout();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #450 <Method void requestLayout()>
		n = i1;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #114 <Field int n>
	//    9   17:return          
	}

	public void setVerticalGravity(int i1)
	{
		i1 &= 0x70;
	//    0    0:iload_1         
	//    1    1:bipush          112
	//    2    3:iand            
	//    3    4:istore_1        
		if((e & 0x70) != i1)
	//*   4    5:aload_0         
	//*   5    6:getfield        #46  <Field int e>
	//*   6    9:bipush          112
	//*   7   11:iand            
	//*   8   12:iload_1         
	//*   9   13:icmpeq          33
		{
			e = i1 | e & 0xffffff8f;
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:aload_0         
	//   13   19:getfield        #46  <Field int e>
	//   14   22:bipush          -113
	//   15   24:iand            
	//   16   25:ior             
	//   17   26:putfield        #46  <Field int e>
			requestLayout();
	//   18   29:aload_0         
	//   19   30:invokevirtual   #450 <Method void requestLayout()>
		}
	//   20   33:return          
	}

	public void setWeightSum(float f1)
	{
		g = Math.max(0.0F, f1);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:invokestatic    #462 <Method float Math.max(float, float)>
	//    4    6:putfield        #91  <Field float g>
	//    5    9:return          
	}

	public boolean shouldDelayChildPressedState()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private boolean a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	private float g;
	private boolean h;
	private int i[];
	private int j[];
	private Drawable k;
	private int l;
	private int m;
	private int n;
	private int o;
}
