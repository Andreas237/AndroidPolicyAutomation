// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.*;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutCompat, ActionMenuPresenter, ViewUtils

public class ActionMenuView extends LinearLayoutCompat
	implements android.support.v7.view.menu.MenuBuilder.ItemInvoker, MenuView
{
	public static interface ActionMenuChildView
	{

		public abstract boolean needsDividerAfter();

		public abstract boolean needsDividerBefore();
	}

	private static class ActionMenuPresenterCallback
		implements android.support.v7.view.menu.MenuPresenter.Callback
	{

		public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
		{
		//    0    0:return          
		}

		public boolean onOpenSubMenu(MenuBuilder menubuilder)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		ActionMenuPresenterCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class LayoutParams extends LinearLayoutCompat.LayoutParams
	{

		public int cellsUsed;
		public boolean expandable;
		boolean expanded;
		public int extraPixels;
		public boolean isOverflowButton;
		public boolean preventEdgeOffset;

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #20  <Method void LinearLayoutCompat$LayoutParams(int, int)>
			isOverflowButton = false;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #22  <Field boolean isOverflowButton>
		//    7   11:return          
		}

		LayoutParams(int i, int j, boolean flag)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #20  <Method void LinearLayoutCompat$LayoutParams(int, int)>
			isOverflowButton = flag;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #22  <Field boolean isOverflowButton>
		//    7   11:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #27  <Method void LinearLayoutCompat$LayoutParams(Context, AttributeSet)>
		//    4    6:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.view.ViewGroup.LayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #31  <Method void LinearLayoutCompat$LayoutParams(android.view.ViewGroup$LayoutParams)>
			isOverflowButton = layoutparams.isOverflowButton;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:getfield        #22  <Field boolean isOverflowButton>
		//    6   10:putfield        #22  <Field boolean isOverflowButton>
		//    7   13:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #31  <Method void LinearLayoutCompat$LayoutParams(android.view.ViewGroup$LayoutParams)>
		//    3    5:return          
		}
	}

	private class MenuBuilderCallback
		implements android.support.v7.view.menu.MenuBuilder.Callback
	{

		public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
		{
			return mOnMenuItemClickListener != null && mOnMenuItemClickListener.onMenuItemClick(menuitem);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field ActionMenuView this$0>
		//    2    4:getfield        #25  <Field ActionMenuView$OnMenuItemClickListener ActionMenuView.mOnMenuItemClickListener>
		//    3    7:ifnull          28
		//    4   10:aload_0         
		//    5   11:getfield        #15  <Field ActionMenuView this$0>
		//    6   14:getfield        #25  <Field ActionMenuView$OnMenuItemClickListener ActionMenuView.mOnMenuItemClickListener>
		//    7   17:aload_2         
		//    8   18:invokeinterface #31  <Method boolean ActionMenuView$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
		//    9   23:ifeq            28
		//   10   26:iconst_1        
		//   11   27:ireturn         
		//   12   28:iconst_0        
		//   13   29:ireturn         
		}

		public void onMenuModeChange(MenuBuilder menubuilder)
		{
			if(mMenuBuilderCallback != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field ActionMenuView this$0>
		//*   2    4:getfield        #37  <Field android.support.v7.view.menu.MenuBuilder$Callback ActionMenuView.mMenuBuilderCallback>
		//*   3    7:ifnull          23
				mMenuBuilderCallback.onMenuModeChange(menubuilder);
		//    4   10:aload_0         
		//    5   11:getfield        #15  <Field ActionMenuView this$0>
		//    6   14:getfield        #37  <Field android.support.v7.view.menu.MenuBuilder$Callback ActionMenuView.mMenuBuilderCallback>
		//    7   17:aload_1         
		//    8   18:invokeinterface #39  <Method void android.support.v7.view.menu.MenuBuilder$Callback.onMenuModeChange(MenuBuilder)>
		//    9   23:return          
		}

		final ActionMenuView this$0;

		MenuBuilderCallback()
		{
			this$0 = ActionMenuView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ActionMenuView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	public static interface OnMenuItemClickListener
	{

		public abstract boolean onMenuItemClick(MenuItem menuitem);
	}


	public ActionMenuView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #56  <Method void ActionMenuView(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActionMenuView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #58  <Method void LinearLayoutCompat(Context, AttributeSet)>
		setBaselineAligned(false);
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #62  <Method void setBaselineAligned(boolean)>
		float f = context.getResources().getDisplayMetrics().density;
	//    7   11:aload_1         
	//    8   12:invokevirtual   #68  <Method Resources Context.getResources()>
	//    9   15:invokevirtual   #74  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   10   18:getfield        #80  <Field float DisplayMetrics.density>
	//   11   21:fstore_3        
		mMinCellSize = (int)(56F * f);
	//   12   22:aload_0         
	//   13   23:ldc1            #81  <Float 56F>
	//   14   25:fload_3         
	//   15   26:fmul            
	//   16   27:f2i             
	//   17   28:putfield        #83  <Field int mMinCellSize>
		mGeneratedItemPadding = (int)(f * 4F);
	//   18   31:aload_0         
	//   19   32:fload_3         
	//   20   33:ldc1            #84  <Float 4F>
	//   21   35:fmul            
	//   22   36:f2i             
	//   23   37:putfield        #86  <Field int mGeneratedItemPadding>
		mPopupContext = context;
	//   24   40:aload_0         
	//   25   41:aload_1         
	//   26   42:putfield        #88  <Field Context mPopupContext>
		mPopupTheme = 0;
	//   27   45:aload_0         
	//   28   46:iconst_0        
	//   29   47:putfield        #90  <Field int mPopupTheme>
	//   30   50:return          
	}

	static int measureChildForCells(View view, int i, int j, int k, int l)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          8
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    4    7:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//    5   10:astore          10
		int i1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(k) - l, android.view.View.MeasureSpec.getMode(k));
	//    6   12:iload_3         
	//    7   13:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   16:iload           4
	//    9   18:isub            
	//   10   19:iload_3         
	//   11   20:invokestatic    #107 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   12   23:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   13   26:istore          5
		boolean flag;
		ActionMenuItemView actionmenuitemview;
		if(view instanceof ActionMenuItemView)
	//*  14   28:aload_0         
	//*  15   29:instanceof      #113 <Class ActionMenuItemView>
	//*  16   32:ifeq            178
			actionmenuitemview = (ActionMenuItemView)view;
	//   17   35:aload_0         
	//   18   36:checkcast       #113 <Class ActionMenuItemView>
	//   19   39:astore          9
		else
	//*  20   41:aload           9
	//*  21   43:ifnull          184
	//*  22   46:aload           9
	//*  23   48:invokevirtual   #117 <Method boolean ActionMenuItemView.hasText()>
	//*  24   51:ifeq            184
	//*  25   54:iconst_1        
	//*  26   55:istore          4
	//*  27   57:iload_2         
	//*  28   58:ifle            190
	//*  29   61:iload           4
	//*  30   63:ifeq            71
	//*  31   66:iload_2         
	//*  32   67:iconst_2        
	//*  33   68:icmplt          190
	//*  34   71:aload_0         
	//*  35   72:iload_1         
	//*  36   73:iload_2         
	//*  37   74:imul            
	//*  38   75:ldc1            #118 <Int 0x80000000>
	//*  39   77:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  40   80:iload           5
	//*  41   82:invokevirtual   #122 <Method void View.measure(int, int)>
	//*  42   85:aload_0         
	//*  43   86:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//*  44   89:istore          6
	//*  45   91:iload           6
	//*  46   93:iload_1         
	//*  47   94:idiv            
	//*  48   95:istore_3        
	//*  49   96:iload_3         
	//*  50   97:istore_2        
	//*  51   98:iload           6
	//*  52  100:iload_1         
	//*  53  101:irem            
	//*  54  102:ifeq            109
	//*  55  105:iload_3         
	//*  56  106:iconst_1        
	//*  57  107:iadd            
	//*  58  108:istore_2        
	//*  59  109:iload_2         
	//*  60  110:istore_3        
	//*  61  111:iload           4
	//*  62  113:ifeq            125
	//*  63  116:iload_2         
	//*  64  117:istore_3        
	//*  65  118:iload_2         
	//*  66  119:iconst_2        
	//*  67  120:icmpge          125
	//*  68  123:iconst_2        
	//*  69  124:istore_3        
	//*  70  125:iload           8
	//*  71  127:istore          7
	//*  72  129:aload           10
	//*  73  131:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//*  74  134:ifne            149
	//*  75  137:iload           8
	//*  76  139:istore          7
	//*  77  141:iload           4
	//*  78  143:ifeq            149
	//*  79  146:iconst_1        
	//*  80  147:istore          7
	//*  81  149:aload           10
	//*  82  151:iload           7
	//*  83  153:putfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
	//*  84  156:aload           10
	//*  85  158:iload_3         
	//*  86  159:putfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//*  87  162:aload_0         
	//*  88  163:iload_3         
	//*  89  164:iload_1         
	//*  90  165:imul            
	//*  91  166:ldc1            #136 <Int 0x40000000>
	//*  92  168:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  93  171:iload           5
	//*  94  173:invokevirtual   #122 <Method void View.measure(int, int)>
	//*  95  176:iload_3         
	//*  96  177:ireturn         
			actionmenuitemview = null;
	//   97  178:aconst_null     
	//   98  179:astore          9
		if(actionmenuitemview != null && actionmenuitemview.hasText())
			l = 1;
		else
	//*  99  181:goto            41
			l = 0;
	//  100  184:iconst_0        
	//  101  185:istore          4
		if(j > 0 && (l == 0 || j >= 2))
		{
			view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i * j, 0x80000000), i1);
			int j1 = view.getMeasuredWidth();
			k = j1 / i;
			j = k;
			if(j1 % i != 0)
				j = k + 1;
			k = j;
			if(l != 0)
			{
				k = j;
				if(j < 2)
					k = 2;
			}
		} else
	//* 102  187:goto            57
		{
			k = 0;
	//  103  190:iconst_0        
	//  104  191:istore_3        
		}
		flag = flag1;
		if(!layoutparams.isOverflowButton)
		{
			flag = flag1;
			if(l != 0)
				flag = true;
		}
		layoutparams.expandable = flag;
		layoutparams.cellsUsed = k;
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k * i, 0x40000000), i1);
		return k;
	//* 105  192:goto            125
	}

	private void onMeasureExactFormat(int i, int j)
	{
		int k3 = android.view.View.MeasureSpec.getMode(j);
	//    0    0:iload_2         
	//    1    1:invokestatic    #107 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          17
		i = android.view.View.MeasureSpec.getSize(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore_1        
		int j3 = android.view.View.MeasureSpec.getSize(j);
	//    6   11:iload_2         
	//    7   12:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   15:istore          16
		int k = getPaddingLeft();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #140 <Method int getPaddingLeft()>
	//   11   21:istore          6
		int l = getPaddingRight();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #143 <Method int getPaddingRight()>
	//   14   27:istore          7
		int l2 = getPaddingTop() + getPaddingBottom();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #146 <Method int getPaddingTop()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #149 <Method int getPaddingBottom()>
	//   19   37:iadd            
	//   20   38:istore          14
		int l3 = getChildMeasureSpec(j, l2, -2);
	//   21   40:iload_2         
	//   22   41:iload           14
	//   23   43:bipush          -2
	//   24   45:invokestatic    #153 <Method int getChildMeasureSpec(int, int, int)>
	//   25   48:istore          18
		int i4 = i - (k + l);
	//   26   50:iload_1         
	//   27   51:iload           6
	//   28   53:iload           7
	//   29   55:iadd            
	//   30   56:isub            
	//   31   57:istore          19
		i = i4 / mMinCellSize;
	//   32   59:iload           19
	//   33   61:aload_0         
	//   34   62:getfield        #83  <Field int mMinCellSize>
	//   35   65:idiv            
	//   36   66:istore_1        
		j = mMinCellSize;
	//   37   67:aload_0         
	//   38   68:getfield        #83  <Field int mMinCellSize>
	//   39   71:istore_2        
		if(i == 0)
	//*  40   72:iload_1         
	//*  41   73:ifne            84
		{
			setMeasuredDimension(i4, 0);
	//   42   76:aload_0         
	//   43   77:iload           19
	//   44   79:iconst_0        
	//   45   80:invokevirtual   #156 <Method void setMeasuredDimension(int, int)>
			return;
	//   46   83:return          
		}
		int j4 = mMinCellSize + (i4 % j) / i;
	//   47   84:aload_0         
	//   48   85:getfield        #83  <Field int mMinCellSize>
	//   49   88:iload           19
	//   50   90:iload_2         
	//   51   91:irem            
	//   52   92:iload_1         
	//   53   93:idiv            
	//   54   94:iadd            
	//   55   95:istore          20
		k = 0;
	//   56   97:iconst_0        
	//   57   98:istore          6
		int l1 = 0;
	//   58  100:iconst_0        
	//   59  101:istore          10
		int k1 = 0;
	//   60  103:iconst_0        
	//   61  104:istore          9
		int i2 = 0;
	//   62  106:iconst_0        
	//   63  107:istore          11
		int j1 = 0;
	//   64  109:iconst_0        
	//   65  110:istore          8
		long l4 = 0L;
	//   66  112:lconst_0        
	//   67  113:lstore          22
		int k4 = getChildCount();
	//   68  115:aload_0         
	//   69  116:invokevirtual   #159 <Method int getChildCount()>
	//   70  119:istore          21
		int j2 = 0;
	//   71  121:iconst_0        
	//   72  122:istore          12
		while(j2 < k4) 
	//*  73  124:iload           12
	//*  74  126:iload           21
	//*  75  128:icmpge          407
		{
			Object obj = ((Object) (getChildAt(j2)));
	//   76  131:aload_0         
	//   77  132:iload           12
	//   78  134:invokevirtual   #163 <Method View getChildAt(int)>
	//   79  137:astore          27
			int i1;
			if(((View) (obj)).getVisibility() == 8)
	//*  80  139:aload           27
	//*  81  141:invokevirtual   #166 <Method int View.getVisibility()>
	//*  82  144:bipush          8
	//*  83  146:icmpne          176
			{
				j = l1;
	//   84  149:iload           10
	//   85  151:istore_2        
				i1 = i;
	//   86  152:iload_1         
	//   87  153:istore          7
				i = i2;
	//   88  155:iload           11
	//   89  157:istore_1        
			} else
	//*  90  158:iload           12
	//*  91  160:iconst_1        
	//*  92  161:iadd            
	//*  93  162:istore          12
	//*  94  164:iload_1         
	//*  95  165:istore          11
	//*  96  167:iload           7
	//*  97  169:istore_1        
	//*  98  170:iload_2         
	//*  99  171:istore          10
	//* 100  173:goto            124
			{
				boolean flag = obj instanceof ActionMenuItemView;
	//  101  176:aload           27
	//  102  178:instanceof      #113 <Class ActionMenuItemView>
	//  103  181:istore          26
				i2++;
	//  104  183:iload           11
	//  105  185:iconst_1        
	//  106  186:iadd            
	//  107  187:istore          11
				if(flag)
	//* 108  189:iload           26
	//* 109  191:ifeq            209
					((View) (obj)).setPadding(mGeneratedItemPadding, 0, mGeneratedItemPadding, 0);
	//  110  194:aload           27
	//  111  196:aload_0         
	//  112  197:getfield        #86  <Field int mGeneratedItemPadding>
	//  113  200:iconst_0        
	//  114  201:aload_0         
	//  115  202:getfield        #86  <Field int mGeneratedItemPadding>
	//  116  205:iconst_0        
	//  117  206:invokevirtual   #170 <Method void View.setPadding(int, int, int, int)>
				LayoutParams layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
	//  118  209:aload           27
	//  119  211:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  120  214:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  121  217:astore          28
				layoutparams.expanded = false;
	//  122  219:aload           28
	//  123  221:iconst_0        
	//  124  222:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
				layoutparams.extraPixels = 0;
	//  125  225:aload           28
	//  126  227:iconst_0        
	//  127  228:putfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
				layoutparams.cellsUsed = 0;
	//  128  231:aload           28
	//  129  233:iconst_0        
	//  130  234:putfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
				layoutparams.expandable = false;
	//  131  237:aload           28
	//  132  239:iconst_0        
	//  133  240:putfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
				layoutparams.leftMargin = 0;
	//  134  243:aload           28
	//  135  245:iconst_0        
	//  136  246:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
				layoutparams.rightMargin = 0;
	//  137  249:aload           28
	//  138  251:iconst_0        
	//  139  252:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
				int k2;
				int i3;
				if(flag && ((ActionMenuItemView)obj).hasText())
	//* 140  255:iload           26
	//* 141  257:ifeq            396
	//* 142  260:aload           27
	//* 143  262:checkcast       #113 <Class ActionMenuItemView>
	//* 144  265:invokevirtual   #117 <Method boolean ActionMenuItemView.hasText()>
	//* 145  268:ifeq            396
					flag = true;
	//  146  271:iconst_1        
	//  147  272:istore          26
				else
	//* 148  274:aload           28
	//* 149  276:iload           26
	//* 150  278:putfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 151  281:aload           28
	//* 152  283:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 153  286:ifeq            402
	//* 154  289:iconst_1        
	//* 155  290:istore_2        
	//* 156  291:aload           27
	//* 157  293:iload           20
	//* 158  295:iload_2         
	//* 159  296:iload           18
	//* 160  298:iload           14
	//* 161  300:invokestatic    #187 <Method int measureChildForCells(View, int, int, int, int)>
	//* 162  303:istore          15
	//* 163  305:iload           10
	//* 164  307:iload           15
	//* 165  309:invokestatic    #192 <Method int Math.max(int, int)>
	//* 166  312:istore          10
	//* 167  314:aload           28
	//* 168  316:getfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
	//* 169  319:ifeq            1233
	//* 170  322:iload           9
	//* 171  324:iconst_1        
	//* 172  325:iadd            
	//* 173  326:istore_2        
	//* 174  327:aload           28
	//* 175  329:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 176  332:ifeq            1226
	//* 177  335:iconst_1        
	//* 178  336:istore          7
	//* 179  338:iload_1         
	//* 180  339:iload           15
	//* 181  341:isub            
	//* 182  342:istore          13
	//* 183  344:iload           6
	//* 184  346:aload           27
	//* 185  348:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//* 186  351:invokestatic    #192 <Method int Math.max(int, int)>
	//* 187  354:istore          6
	//* 188  356:iload           15
	//* 189  358:iconst_1        
	//* 190  359:icmpne          1198
	//* 191  362:iconst_1        
	//* 192  363:iload           12
	//* 193  365:ishl            
	//* 194  366:i2l             
	//* 195  367:lstore          24
	//* 196  369:iload_2         
	//* 197  370:istore          9
	//* 198  372:lload           24
	//* 199  374:lload           22
	//* 200  376:lor             
	//* 201  377:lstore          22
	//* 202  379:iload           10
	//* 203  381:istore_2        
	//* 204  382:iload           11
	//* 205  384:istore_1        
	//* 206  385:iload           7
	//* 207  387:istore          8
	//* 208  389:iload           13
	//* 209  391:istore          7
	//* 210  393:goto            158
					flag = false;
	//  211  396:iconst_0        
	//  212  397:istore          26
				layoutparams.preventEdgeOffset = flag;
				if(layoutparams.isOverflowButton)
					j = 1;
				else
	//* 213  399:goto            274
					j = i;
	//  214  402:iload_1         
	//  215  403:istore_2        
				i3 = measureChildForCells(((View) (obj)), j4, j, l3, l2);
				l1 = Math.max(l1, i3);
				float f;
				float f1;
				float f2;
				long l6;
				if(layoutparams.expandable)
					j = k1 + 1;
				else
	//* 216  404:goto            291
	//* 217  407:iload           8
	//* 218  409:ifeq            506
	//* 219  412:iload           11
	//* 220  414:iconst_2        
	//* 221  415:icmpne          506
	//* 222  418:iconst_1        
	//* 223  419:istore          13
	//* 224  421:iconst_0        
	//* 225  422:istore          7
	//* 226  424:iload_1         
	//* 227  425:istore          12
	//* 228  427:iload           9
	//* 229  429:ifle            1195
	//* 230  432:iload           12
	//* 231  434:ifle            1195
	//* 232  437:ldc1            #196 <Int 0x7fffffff>
	//* 233  439:istore_1        
	//* 234  440:lconst_0        
	//* 235  441:lstore          24
	//* 236  443:iconst_0        
	//* 237  444:istore_2        
	//* 238  445:iconst_0        
	//* 239  446:istore          14
	//* 240  448:iload           14
	//* 241  450:iload           21
	//* 242  452:icmpge          571
	//* 243  455:aload_0         
	//* 244  456:iload           14
	//* 245  458:invokevirtual   #163 <Method View getChildAt(int)>
	//* 246  461:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 247  464:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 248  467:astore          27
	//* 249  469:aload           27
	//* 250  471:getfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
	//* 251  474:ifne            512
	//* 252  477:iload_2         
	//* 253  478:istore          15
	//* 254  480:iload_1         
	//* 255  481:istore_2        
	//* 256  482:iload           15
	//* 257  484:istore_1        
	//* 258  485:iload           14
	//* 259  487:iconst_1        
	//* 260  488:iadd            
	//* 261  489:istore          15
	//* 262  491:iload_2         
	//* 263  492:istore          14
	//* 264  494:iload_1         
	//* 265  495:istore_2        
	//* 266  496:iload           14
	//* 267  498:istore_1        
	//* 268  499:iload           15
	//* 269  501:istore          14
	//* 270  503:goto            448
	//* 271  506:iconst_0        
	//* 272  507:istore          13
	//* 273  509:goto            421
	//* 274  512:aload           27
	//* 275  514:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 276  517:iload_1         
	//* 277  518:icmpge          539
	//* 278  521:aload           27
	//* 279  523:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 280  526:istore_2        
	//* 281  527:iconst_1        
	//* 282  528:iload           14
	//* 283  530:ishl            
	//* 284  531:i2l             
	//* 285  532:lstore          24
	//* 286  534:iconst_1        
	//* 287  535:istore_1        
	//* 288  536:goto            485
	//* 289  539:aload           27
	//* 290  541:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 291  544:iload_1         
	//* 292  545:icmpne          1184
	//* 293  548:lload           24
	//* 294  550:iconst_1        
	//* 295  551:iload           14
	//* 296  553:ishl            
	//* 297  554:i2l             
	//* 298  555:lor             
	//* 299  556:lstore          24
	//* 300  558:iload_2         
	//* 301  559:iconst_1        
	//* 302  560:iadd            
	//* 303  561:istore          15
	//* 304  563:iload_1         
	//* 305  564:istore_2        
	//* 306  565:iload           15
	//* 307  567:istore_1        
	//* 308  568:goto            485
	//* 309  571:lload           22
	//* 310  573:lload           24
	//* 311  575:lor             
	//* 312  576:lstore          22
	//* 313  578:iload_2         
	//* 314  579:iload           12
	//* 315  581:icmple          786
	//* 316  584:iload           8
	//* 317  586:ifne            930
	//* 318  589:iload           11
	//* 319  591:iconst_1        
	//* 320  592:icmpne          930
	//* 321  595:iconst_1        
	//* 322  596:istore_1        
	//* 323  597:iload           12
	//* 324  599:ifle            1072
	//* 325  602:lload           22
	//* 326  604:lconst_0        
	//* 327  605:lcmp            
	//* 328  606:ifeq            1072
	//* 329  609:iload           12
	//* 330  611:iload           11
	//* 331  613:iconst_1        
	//* 332  614:isub            
	//* 333  615:icmplt          628
	//* 334  618:iload_1         
	//* 335  619:ifne            628
	//* 336  622:iload           10
	//* 337  624:iconst_1        
	//* 338  625:icmple          1072
	//* 339  628:lload           22
	//* 340  630:invokestatic    #202 <Method int Long.bitCount(long)>
	//* 341  633:i2f             
	//* 342  634:fstore          5
	//* 343  636:fload           5
	//* 344  638:fstore          4
	//* 345  640:iload_1         
	//* 346  641:ifne            1175
	//* 347  644:fload           5
	//* 348  646:fstore_3        
	//* 349  647:lconst_1        
	//* 350  648:lload           22
	//* 351  650:land            
	//* 352  651:lconst_0        
	//* 353  652:lcmp            
	//* 354  653:ifeq            682
	//* 355  656:fload           5
	//* 356  658:fstore_3        
	//* 357  659:aload_0         
	//* 358  660:iconst_0        
	//* 359  661:invokevirtual   #163 <Method View getChildAt(int)>
	//* 360  664:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 361  667:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 362  670:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 363  673:ifne            682
	//* 364  676:fload           5
	//* 365  678:ldc1            #203 <Float 0.5F>
	//* 366  680:fsub            
	//* 367  681:fstore_3        
	//* 368  682:fload_3         
	//* 369  683:fstore          4
	//* 370  685:iconst_1        
	//* 371  686:iload           21
	//* 372  688:iconst_1        
	//* 373  689:isub            
	//* 374  690:ishl            
	//* 375  691:i2l             
	//* 376  692:lload           22
	//* 377  694:land            
	//* 378  695:lconst_0        
	//* 379  696:lcmp            
	//* 380  697:ifeq            1175
	//* 381  700:fload_3         
	//* 382  701:fstore          4
	//* 383  703:aload_0         
	//* 384  704:iload           21
	//* 385  706:iconst_1        
	//* 386  707:isub            
	//* 387  708:invokevirtual   #163 <Method View getChildAt(int)>
	//* 388  711:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 389  714:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 390  717:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 391  720:ifne            1175
	//* 392  723:fload_3         
	//* 393  724:ldc1            #203 <Float 0.5F>
	//* 394  726:fsub            
	//* 395  727:fstore_3        
	//* 396  728:fload_3         
	//* 397  729:fconst_0        
	//* 398  730:fcmpl           
	//* 399  731:ifle            935
	//* 400  734:iload           12
	//* 401  736:iload           20
	//* 402  738:imul            
	//* 403  739:i2f             
	//* 404  740:fload_3         
	//* 405  741:fdiv            
	//* 406  742:f2i             
	//* 407  743:istore_2        
	//* 408  744:iconst_0        
	//* 409  745:istore          8
	//* 410  747:iload           7
	//* 411  749:istore_1        
	//* 412  750:iload           8
	//* 413  752:istore          7
	//* 414  754:iload_1         
	//* 415  755:istore          8
	//* 416  757:iload           7
	//* 417  759:iload           21
	//* 418  761:icmpge          1076
	//* 419  764:iconst_1        
	//* 420  765:iload           7
	//* 421  767:ishl            
	//* 422  768:i2l             
	//* 423  769:lload           22
	//* 424  771:land            
	//* 425  772:lconst_0        
	//* 426  773:lcmp            
	//* 427  774:ifne            940
	//* 428  777:iload           7
	//* 429  779:iconst_1        
	//* 430  780:iadd            
	//* 431  781:istore          7
	//* 432  783:goto            754
	//* 433  786:iconst_0        
	//* 434  787:istore          7
	//* 435  789:iload           12
	//* 436  791:istore_2        
	//* 437  792:iload           7
	//* 438  794:iload           21
	//* 439  796:icmpge          921
	//* 440  799:aload_0         
	//* 441  800:iload           7
	//* 442  802:invokevirtual   #163 <Method View getChildAt(int)>
	//* 443  805:astore          27
	//* 444  807:aload           27
	//* 445  809:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 446  812:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 447  815:astore          28
	//* 448  817:iconst_1        
	//* 449  818:iload           7
	//* 450  820:ishl            
	//* 451  821:i2l             
	//* 452  822:lload           24
	//* 453  824:land            
	//* 454  825:lconst_0        
	//* 455  826:lcmp            
	//* 456  827:ifne            860
	//* 457  830:aload           28
	//* 458  832:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 459  835:iload_1         
	//* 460  836:iconst_1        
	//* 461  837:iadd            
	//* 462  838:icmpne          1181
	//* 463  841:lload           22
	//* 464  843:iconst_1        
	//* 465  844:iload           7
	//* 466  846:ishl            
	//* 467  847:i2l             
	//* 468  848:lor             
	//* 469  849:lstore          22
	//* 470  851:iload           7
	//* 471  853:iconst_1        
	//* 472  854:iadd            
	//* 473  855:istore          7
	//* 474  857:goto            792
	//* 475  860:iload           13
	//* 476  862:ifeq            896
	//* 477  865:aload           28
	//* 478  867:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 479  870:ifeq            896
	//* 480  873:iload_2         
	//* 481  874:iconst_1        
	//* 482  875:icmpne          896
	//* 483  878:aload           27
	//* 484  880:aload_0         
	//* 485  881:getfield        #86  <Field int mGeneratedItemPadding>
	//* 486  884:iload           20
	//* 487  886:iadd            
	//* 488  887:iconst_0        
	//* 489  888:aload_0         
	//* 490  889:getfield        #86  <Field int mGeneratedItemPadding>
	//* 491  892:iconst_0        
	//* 492  893:invokevirtual   #170 <Method void View.setPadding(int, int, int, int)>
	//* 493  896:aload           28
	//* 494  898:aload           28
	//* 495  900:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 496  903:iconst_1        
	//* 497  904:iadd            
	//* 498  905:putfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 499  908:aload           28
	//* 500  910:iconst_1        
	//* 501  911:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
	//* 502  914:iload_2         
	//* 503  915:iconst_1        
	//* 504  916:isub            
	//* 505  917:istore_2        
	//* 506  918:goto            851
	//* 507  921:iconst_1        
	//* 508  922:istore          7
	//* 509  924:iload_2         
	//* 510  925:istore          12
	//* 511  927:goto            427
	//* 512  930:iconst_0        
	//* 513  931:istore_1        
	//* 514  932:goto            597
	//* 515  935:iconst_0        
	//* 516  936:istore_2        
	//* 517  937:goto            744
	//* 518  940:aload_0         
	//* 519  941:iload           7
	//* 520  943:invokevirtual   #163 <Method View getChildAt(int)>
	//* 521  946:astore          27
	//* 522  948:aload           27
	//* 523  950:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 524  953:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 525  956:astore          28
	//* 526  958:aload           27
	//* 527  960:instanceof      #113 <Class ActionMenuItemView>
	//* 528  963:ifeq            1005
	//* 529  966:aload           28
	//* 530  968:iload_2         
	//* 531  969:putfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
	//* 532  972:aload           28
	//* 533  974:iconst_1        
	//* 534  975:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
	//* 535  978:iload           7
	//* 536  980:ifne            1000
	//* 537  983:aload           28
	//* 538  985:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 539  988:ifne            1000
	//* 540  991:aload           28
	//* 541  993:iload_2         
	//* 542  994:ineg            
	//* 543  995:iconst_2        
	//* 544  996:idiv            
	//* 545  997:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//* 546 1000:iconst_1        
	//* 547 1001:istore_1        
	//* 548 1002:goto            777
	//* 549 1005:aload           28
	//* 550 1007:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 551 1010:ifeq            1039
	//* 552 1013:aload           28
	//* 553 1015:iload_2         
	//* 554 1016:putfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
	//* 555 1019:aload           28
	//* 556 1021:iconst_1        
	//* 557 1022:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
	//* 558 1025:aload           28
	//* 559 1027:iload_2         
	//* 560 1028:ineg            
	//* 561 1029:iconst_2        
	//* 562 1030:idiv            
	//* 563 1031:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//* 564 1034:iconst_1        
	//* 565 1035:istore_1        
	//* 566 1036:goto            777
	//* 567 1039:iload           7
	//* 568 1041:ifeq            1052
	//* 569 1044:aload           28
	//* 570 1046:iload_2         
	//* 571 1047:iconst_2        
	//* 572 1048:idiv            
	//* 573 1049:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//* 574 1052:iload           7
	//* 575 1054:iload           21
	//* 576 1056:iconst_1        
	//* 577 1057:isub            
	//* 578 1058:icmpeq          1069
	//* 579 1061:aload           28
	//* 580 1063:iload_2         
	//* 581 1064:iconst_2        
	//* 582 1065:idiv            
	//* 583 1066:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//* 584 1069:goto            777
	//* 585 1072:iload           7
	//* 586 1074:istore          8
	//* 587 1076:iload           8
	//* 588 1078:ifeq            1152
	//* 589 1081:iconst_0        
	//* 590 1082:istore_1        
	//* 591 1083:iload_1         
	//* 592 1084:iload           21
	//* 593 1086:icmpge          1152
	//* 594 1089:aload_0         
	//* 595 1090:iload_1         
	//* 596 1091:invokevirtual   #163 <Method View getChildAt(int)>
	//* 597 1094:astore          27
	//* 598 1096:aload           27
	//* 599 1098:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 600 1101:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 601 1104:astore          28
	//* 602 1106:aload           28
	//* 603 1108:getfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
	//* 604 1111:ifne            1121
	//* 605 1114:iload_1         
	//* 606 1115:iconst_1        
	//* 607 1116:iadd            
	//* 608 1117:istore_1        
	//* 609 1118:goto            1083
	//* 610 1121:aload           28
	//* 611 1123:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 612 1126:istore_2        
	//* 613 1127:aload           27
	//* 614 1129:aload           28
	//* 615 1131:getfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
	//* 616 1134:iload_2         
	//* 617 1135:iload           20
	//* 618 1137:imul            
	//* 619 1138:iadd            
	//* 620 1139:ldc1            #136 <Int 0x40000000>
	//* 621 1141:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 622 1144:iload           18
	//* 623 1146:invokevirtual   #122 <Method void View.measure(int, int)>
	//* 624 1149:goto            1114
	//* 625 1152:iload           17
	//* 626 1154:ldc1            #136 <Int 0x40000000>
	//* 627 1156:icmpeq          1168
	//* 628 1159:aload_0         
	//* 629 1160:iload           19
	//* 630 1162:iload           6
	//* 631 1164:invokevirtual   #156 <Method void setMeasuredDimension(int, int)>
	//* 632 1167:return          
	//* 633 1168:iload           16
	//* 634 1170:istore          6
	//* 635 1172:goto            1159
	//* 636 1175:fload           4
	//* 637 1177:fstore_3        
	//* 638 1178:goto            728
	//* 639 1181:goto            851
	//* 640 1184:iload_1         
	//* 641 1185:istore          15
	//* 642 1187:iload_2         
	//* 643 1188:istore_1        
	//* 644 1189:iload           15
	//* 645 1191:istore_2        
	//* 646 1192:goto            485
	//* 647 1195:goto            584
	//* 648 1198:iload           11
	//* 649 1200:istore_1        
	//* 650 1201:iload           10
	//* 651 1203:istore          8
	//* 652 1205:iload           13
	//* 653 1207:istore          10
	//* 654 1209:iload_2         
	//* 655 1210:istore          9
	//* 656 1212:iload           8
	//* 657 1214:istore_2        
	//* 658 1215:iload           7
	//* 659 1217:istore          8
	//* 660 1219:iload           10
	//* 661 1221:istore          7
	//* 662 1223:goto            158
	//* 663 1226:iload           8
	//* 664 1228:istore          7
	//* 665 1230:goto            338
					j = k1;
	//  666 1233:iload           9
	//  667 1235:istore_2        
				if(layoutparams.isOverflowButton)
					i1 = 1;
				else
					i1 = j1;
				k2 = i - i3;
				k = Math.max(k, ((View) (obj)).getMeasuredHeight());
				if(i3 == 1)
				{
					long l5 = 1 << j2;
					k1 = j;
					l4 = l5 | l4;
					j = l1;
					i = i2;
					j1 = i1;
					i1 = k2;
				} else
				{
					i = i2;
					j1 = l1;
					l1 = k2;
					k1 = j;
					j = j1;
					j1 = i1;
					i1 = l1;
				}
			}
			j2++;
			i2 = i;
			i = i1;
			l1 = j;
		}
		if(j1 != 0 && i2 == 2)
			k2 = 1;
		else
			k2 = 0;
		i1 = 0;
		j2 = i;
		if(k1 <= 0 || j2 <= 0) goto _L2; else goto _L1
_L1:
		i = 0x7fffffff;
		l6 = 0L;
		j = 0;
		l2 = 0;
		while(l2 < k4) 
		{
			obj = ((Object) ((LayoutParams)getChildAt(l2).getLayoutParams()));
			if(!((LayoutParams) (obj)).expandable)
			{
				i3 = j;
				j = i;
				i = i3;
			} else
			if(((LayoutParams) (obj)).cellsUsed < i)
			{
				j = ((LayoutParams) (obj)).cellsUsed;
				l6 = 1 << l2;
				i = 1;
			} else
			if(((LayoutParams) (obj)).cellsUsed == i)
			{
				l6 |= 1 << l2;
				i3 = j + 1;
				j = i;
				i = i3;
			} else
			{
				i3 = i;
				i = j;
				j = i3;
			}
			i3 = l2 + 1;
			l2 = j;
			j = i;
			i = l2;
			l2 = i3;
		}
		l4 |= l6;
		if(j <= j2) goto _L3; else goto _L2
_L2:
		if(j1 == 0 && i2 == 1)
			i = 1;
		else
			i = 0;
		if(j2 <= 0 || l4 == 0L || j2 >= i2 - 1 && i == 0 && l1 <= 1) goto _L5; else goto _L4
_L4:
		f2 = Long.bitCount(l4);
		f1 = f2;
		if(i != 0)
			break MISSING_BLOCK_LABEL_1175;
		f = f2;
		if((1L & l4) != 0L)
		{
			f = f2;
			if(!((LayoutParams)getChildAt(0).getLayoutParams()).preventEdgeOffset)
				f = f2 - 0.5F;
		}
		f1 = f;
		if(((long)(1 << k4 - 1) & l4) == 0L)
			break MISSING_BLOCK_LABEL_1175;
		f1 = f;
		if(((LayoutParams)getChildAt(k4 - 1).getLayoutParams()).preventEdgeOffset)
			break MISSING_BLOCK_LABEL_1175;
		f -= 0.5F;
_L8:
		if(f > 0.0F)
			j = (int)((float)(j2 * j4) / f);
		else
			j = 0;
		j1 = 0;
		i = i1;
		i1 = j1;
		do
		{
			j1 = i;
			if(i1 >= k4)
				break;
			if(((long)(1 << i1) & l4) != 0L)
			{
				obj = ((Object) (getChildAt(i1)));
				layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
				if(obj instanceof ActionMenuItemView)
				{
					layoutparams.extraPixels = j;
					layoutparams.expanded = true;
					if(i1 == 0 && !layoutparams.preventEdgeOffset)
						layoutparams.leftMargin = -j / 2;
					i = 1;
				} else
				if(layoutparams.isOverflowButton)
				{
					layoutparams.extraPixels = j;
					layoutparams.expanded = true;
					layoutparams.rightMargin = -j / 2;
					i = 1;
				} else
				{
					if(i1 != 0)
						layoutparams.leftMargin = j / 2;
					if(i1 != k4 - 1)
						layoutparams.rightMargin = j / 2;
				}
			}
			i1++;
		} while(true);
		  goto _L6
_L3:
		i1 = 0;
		j = j2;
		while(i1 < k4) 
		{
			obj = ((Object) (getChildAt(i1)));
			layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
			if(((long)(1 << i1) & l6) == 0L)
			{
				if(layoutparams.cellsUsed == i + 1)
					l4 |= 1 << i1;
			} else
			{
				if(k2 != 0 && layoutparams.preventEdgeOffset && j == 1)
					((View) (obj)).setPadding(mGeneratedItemPadding + j4, 0, mGeneratedItemPadding, 0);
				layoutparams.cellsUsed = layoutparams.cellsUsed + 1;
				layoutparams.expanded = true;
				j--;
			}
			i1++;
		}
		i1 = 1;
		j2 = j;
		break MISSING_BLOCK_LABEL_427;
_L5:
		j1 = i1;
_L6:
		if(j1 != 0)
		{
			i = 0;
			while(i < k4) 
			{
				obj = ((Object) (getChildAt(i)));
				layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
				if(layoutparams.expanded)
				{
					j = layoutparams.cellsUsed;
					((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.extraPixels + j * j4, 0x40000000), l3);
				}
				i++;
			}
		}
		if(k3 == 0x40000000)
			k = j3;
		setMeasuredDimension(i4, k);
		return;
		f = f1;
		if(true) goto _L8; else goto _L7
_L7:
	//* 668 1236:goto            327
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return layoutparams != null && (layoutparams instanceof LayoutParams);
	//    0    0:aload_1         
	//    1    1:ifnull          13
	//    2    4:aload_1         
	//    3    5:instanceof      #16  <Class ActionMenuView$LayoutParams>
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public void dismissPopupMenus()
	{
		if(mPresenter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//*   2    4:ifnull          15
			mPresenter.dismissPopupMenus();
	//    3    7:aload_0         
	//    4    8:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    5   11:invokevirtual   #213 <Method boolean ActionMenuPresenter.dismissPopupMenus()>
	//    6   14:pop             
	//    7   15:return          
	}

	public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		LayoutParams layoutparams = new LayoutParams(-2, -2);
	//    0    0:new             #16  <Class ActionMenuView$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #219 <Method void ActionMenuView$LayoutParams(int, int)>
	//    5   11:astore_1        
		layoutparams.gravity = 16;
	//    6   12:aload_1         
	//    7   13:bipush          16
	//    8   15:putfield        #222 <Field int ActionMenuView$LayoutParams.gravity>
		return layoutparams;
	//    9   18:aload_1         
	//   10   19:areturn         
	}

	protected volatile LinearLayoutCompat.LayoutParams generateDefaultLayoutParams()
	{
		return ((LinearLayoutCompat.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method ActionMenuView$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method ActionMenuView$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #16  <Class ActionMenuView$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #231 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #232 <Method void ActionMenuView$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          50
		{
			if(layoutparams instanceof LayoutParams)
	//*   2    4:aload_1         
	//*   3    5:instanceof      #16  <Class ActionMenuView$LayoutParams>
	//*   4    8:ifeq            38
				layoutparams = ((android.view.ViewGroup.LayoutParams) (new LayoutParams((LayoutParams)layoutparams)));
	//    5   11:new             #16  <Class ActionMenuView$LayoutParams>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//    9   19:invokespecial   #236 <Method void ActionMenuView$LayoutParams(ActionMenuView$LayoutParams)>
	//   10   22:astore_1        
			else
	//*  11   23:aload_1         
	//*  12   24:getfield        #222 <Field int ActionMenuView$LayoutParams.gravity>
	//*  13   27:ifgt            36
	//*  14   30:aload_1         
	//*  15   31:bipush          16
	//*  16   33:putfield        #222 <Field int ActionMenuView$LayoutParams.gravity>
	//*  17   36:aload_1         
	//*  18   37:areturn         
				layoutparams = ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//   19   38:new             #16  <Class ActionMenuView$LayoutParams>
	//   20   41:dup             
	//   21   42:aload_1         
	//   22   43:invokespecial   #239 <Method void ActionMenuView$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   23   46:astore_1        
			if(((LayoutParams) (layoutparams)).gravity <= 0)
				layoutparams.gravity = 16;
			return ((LayoutParams) (layoutparams));
		} else
	//*  24   47:goto            23
		{
			return generateDefaultLayoutParams();
	//   25   50:aload_0         
	//   26   51:invokevirtual   #225 <Method ActionMenuView$LayoutParams generateDefaultLayoutParams()>
	//   27   54:areturn         
		}
	}

	public volatile LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((LinearLayoutCompat.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #242 <Method ActionMenuView$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile LinearLayoutCompat.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((LinearLayoutCompat.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #245 <Method ActionMenuView$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #242 <Method ActionMenuView$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #245 <Method ActionMenuView$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public LayoutParams generateOverflowButtonLayoutParams()
	{
		LayoutParams layoutparams = generateDefaultLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method ActionMenuView$LayoutParams generateDefaultLayoutParams()>
	//    2    4:astore_1        
		layoutparams.isOverflowButton = true;
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:putfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
		return layoutparams;
	//    6   10:aload_1         
	//    7   11:areturn         
	}

	public Menu getMenu()
	{
		if(mMenu == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #257 <Field MenuBuilder mMenu>
	//*   2    4:ifnonnull       104
		{
			Object obj = ((Object) (getContext()));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #231 <Method Context getContext()>
	//    5   11:astore_1        
			mMenu = new MenuBuilder(((Context) (obj)));
	//    6   12:aload_0         
	//    7   13:new             #259 <Class MenuBuilder>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #261 <Method void MenuBuilder(Context)>
	//   11   21:putfield        #257 <Field MenuBuilder mMenu>
			mMenu.setCallback(((android.support.v7.view.menu.MenuBuilder.Callback) (new MenuBuilderCallback())));
	//   12   24:aload_0         
	//   13   25:getfield        #257 <Field MenuBuilder mMenu>
	//   14   28:new             #19  <Class ActionMenuView$MenuBuilderCallback>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #264 <Method void ActionMenuView$MenuBuilderCallback(ActionMenuView)>
	//   18   36:invokevirtual   #268 <Method void MenuBuilder.setCallback(android.support.v7.view.menu.MenuBuilder$Callback)>
			mPresenter = new ActionMenuPresenter(((Context) (obj)));
	//   19   39:aload_0         
	//   20   40:new             #211 <Class ActionMenuPresenter>
	//   21   43:dup             
	//   22   44:aload_1         
	//   23   45:invokespecial   #269 <Method void ActionMenuPresenter(Context)>
	//   24   48:putfield        #209 <Field ActionMenuPresenter mPresenter>
			mPresenter.setReserveOverflow(true);
	//   25   51:aload_0         
	//   26   52:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//   27   55:iconst_1        
	//   28   56:invokevirtual   #272 <Method void ActionMenuPresenter.setReserveOverflow(boolean)>
			ActionMenuPresenter actionmenupresenter = mPresenter;
	//   29   59:aload_0         
	//   30   60:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//   31   63:astore_2        
			if(mActionMenuPresenterCallback != null)
	//*  32   64:aload_0         
	//*  33   65:getfield        #274 <Field android.support.v7.view.menu.MenuPresenter$Callback mActionMenuPresenterCallback>
	//*  34   68:ifnull          109
				obj = ((Object) (mActionMenuPresenterCallback));
	//   35   71:aload_0         
	//   36   72:getfield        #274 <Field android.support.v7.view.menu.MenuPresenter$Callback mActionMenuPresenterCallback>
	//   37   75:astore_1        
			else
	//*  38   76:aload_2         
	//*  39   77:aload_1         
	//*  40   78:invokevirtual   #277 <Method void ActionMenuPresenter.setCallback(android.support.v7.view.menu.MenuPresenter$Callback)>
	//*  41   81:aload_0         
	//*  42   82:getfield        #257 <Field MenuBuilder mMenu>
	//*  43   85:aload_0         
	//*  44   86:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//*  45   89:aload_0         
	//*  46   90:getfield        #88  <Field Context mPopupContext>
	//*  47   93:invokevirtual   #281 <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter, Context)>
	//*  48   96:aload_0         
	//*  49   97:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//*  50  100:aload_0         
	//*  51  101:invokevirtual   #284 <Method void ActionMenuPresenter.setMenuView(ActionMenuView)>
	//*  52  104:aload_0         
	//*  53  105:getfield        #257 <Field MenuBuilder mMenu>
	//*  54  108:areturn         
				obj = ((Object) (new ActionMenuPresenterCallback()));
	//   55  109:new             #13  <Class ActionMenuView$ActionMenuPresenterCallback>
	//   56  112:dup             
	//   57  113:invokespecial   #286 <Method void ActionMenuView$ActionMenuPresenterCallback()>
	//   58  116:astore_1        
			actionmenupresenter.setCallback(((android.support.v7.view.menu.MenuPresenter.Callback) (obj)));
			mMenu.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (mPresenter)), mPopupContext);
			mPresenter.setMenuView(this);
		}
		return ((Menu) (mMenu));
	//*  59  117:goto            76
	}

	public Drawable getOverflowIcon()
	{
		getMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #291 <Method Menu getMenu()>
	//    2    4:pop             
		return mPresenter.getOverflowIcon();
	//    3    5:aload_0         
	//    4    6:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    5    9:invokevirtual   #293 <Method Drawable ActionMenuPresenter.getOverflowIcon()>
	//    6   12:areturn         
	}

	public int getPopupTheme()
	{
		return mPopupTheme;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int mPopupTheme>
	//    2    4:ireturn         
	}

	public int getWindowAnimations()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected boolean hasSupportDividerBeforeChildAt(int i)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(i == 0)
	//*   2    2:iload_1         
	//*   3    3:ifne            8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		View view = getChildAt(i - 1);
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:iconst_1        
	//    9   11:isub            
	//   10   12:invokevirtual   #163 <Method View getChildAt(int)>
	//   11   15:astore          4
		View view1 = getChildAt(i);
	//   12   17:aload_0         
	//   13   18:iload_1         
	//   14   19:invokevirtual   #163 <Method View getChildAt(int)>
	//   15   22:astore          5
		boolean flag = flag1;
	//   16   24:iload_3         
	//   17   25:istore_2        
		if(i < getChildCount())
	//*  18   26:iload_1         
	//*  19   27:aload_0         
	//*  20   28:invokevirtual   #159 <Method int getChildCount()>
	//*  21   31:icmpge          57
		{
			flag = flag1;
	//   22   34:iload_3         
	//   23   35:istore_2        
			if(view instanceof ActionMenuChildView)
	//*  24   36:aload           4
	//*  25   38:instanceof      #10  <Class ActionMenuView$ActionMenuChildView>
	//*  26   41:ifeq            57
				flag = false | ((ActionMenuChildView)view).needsDividerAfter();
	//   27   44:iconst_0        
	//   28   45:aload           4
	//   29   47:checkcast       #10  <Class ActionMenuView$ActionMenuChildView>
	//   30   50:invokeinterface #300 <Method boolean ActionMenuView$ActionMenuChildView.needsDividerAfter()>
	//   31   55:ior             
	//   32   56:istore_2        
		}
		if(i > 0 && (view1 instanceof ActionMenuChildView))
	//*  33   57:iload_1         
	//*  34   58:ifle            82
	//*  35   61:aload           5
	//*  36   63:instanceof      #10  <Class ActionMenuView$ActionMenuChildView>
	//*  37   66:ifeq            82
			return ((ActionMenuChildView)view1).needsDividerBefore() | flag;
	//   38   69:aload           5
	//   39   71:checkcast       #10  <Class ActionMenuView$ActionMenuChildView>
	//   40   74:invokeinterface #303 <Method boolean ActionMenuView$ActionMenuChildView.needsDividerBefore()>
	//   41   79:iload_2         
	//   42   80:ior             
	//   43   81:ireturn         
		else
			return flag;
	//   44   82:iload_2         
	//   45   83:ireturn         
	}

	public boolean hideOverflowMenu()
	{
		return mPresenter != null && mPresenter.hideOverflowMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    5   11:invokevirtual   #306 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public void initialize(MenuBuilder menubuilder)
	{
		mMenu = menubuilder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #257 <Field MenuBuilder mMenu>
	//    3    5:return          
	}

	public boolean invokeItem(MenuItemImpl menuitemimpl)
	{
		return mMenu.performItemAction(((MenuItem) (menuitemimpl)), 0);
	//    0    0:aload_0         
	//    1    1:getfield        #257 <Field MenuBuilder mMenu>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #314 <Method boolean MenuBuilder.performItemAction(MenuItem, int)>
	//    5    9:ireturn         
	}

	public boolean isOverflowMenuShowPending()
	{
		return mPresenter != null && mPresenter.isOverflowMenuShowPending();
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    5   11:invokevirtual   #317 <Method boolean ActionMenuPresenter.isOverflowMenuShowPending()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean isOverflowMenuShowing()
	{
		return mPresenter != null && mPresenter.isOverflowMenuShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    5   11:invokevirtual   #320 <Method boolean ActionMenuPresenter.isOverflowMenuShowing()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean isOverflowReserved()
	{
		return mReserveOverflow;
	//    0    0:aload_0         
	//    1    1:getfield        #323 <Field boolean mReserveOverflow>
	//    2    4:ireturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #327 <Method void LinearLayoutCompat.onConfigurationChanged(Configuration)>
		if(mPresenter != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//*   5    9:ifnull          46
		{
			mPresenter.updateMenuView(false);
	//    6   12:aload_0         
	//    7   13:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #330 <Method void ActionMenuPresenter.updateMenuView(boolean)>
			if(mPresenter.isOverflowMenuShowing())
	//*  10   20:aload_0         
	//*  11   21:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//*  12   24:invokevirtual   #320 <Method boolean ActionMenuPresenter.isOverflowMenuShowing()>
	//*  13   27:ifeq            46
			{
				mPresenter.hideOverflowMenu();
	//   14   30:aload_0         
	//   15   31:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//   16   34:invokevirtual   #306 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
	//   17   37:pop             
				mPresenter.showOverflowMenu();
	//   18   38:aload_0         
	//   19   39:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//   20   42:invokevirtual   #333 <Method boolean ActionMenuPresenter.showOverflowMenu()>
	//   21   45:pop             
			}
		}
	//   22   46:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #336 <Method void LinearLayoutCompat.onDetachedFromWindow()>
		dismissPopupMenus();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #338 <Method void dismissPopupMenus()>
	//    4    8:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		if(mFormatItems) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field boolean mFormatItems>
	//    2    4:ifne            19
_L1:
		super.onLayout(flag, i, j, k, l);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:iload           5
	//    9   15:invokespecial   #344 <Method void LinearLayoutCompat.onLayout(boolean, int, int, int, int)>
_L4:
		return;
	//   10   18:return          
_L2:
		int l4;
		int i5;
		i5 = getChildCount();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #159 <Method int getChildCount()>
	//   13   23:istore          12
		l4 = (l - j) / 2;
	//   14   25:iload           5
	//   15   27:iload_3         
	//   16   28:isub            
	//   17   29:iconst_2        
	//   18   30:idiv            
	//   19   31:istore          11
		int j5 = getDividerWidth();
	//   20   33:aload_0         
	//   21   34:invokevirtual   #347 <Method int getDividerWidth()>
	//   22   37:istore          13
		l = 0;
	//   23   39:iconst_0        
	//   24   40:istore          5
		j = 0;
	//   25   42:iconst_0        
	//   26   43:istore_3        
		int l1 = k - i - getPaddingRight() - getPaddingLeft();
	//   27   44:iload           4
	//   28   46:iload_2         
	//   29   47:isub            
	//   30   48:aload_0         
	//   31   49:invokevirtual   #143 <Method int getPaddingRight()>
	//   32   52:isub            
	//   33   53:aload_0         
	//   34   54:invokevirtual   #140 <Method int getPaddingLeft()>
	//   35   57:isub            
	//   36   58:istore          7
		int i1 = 0;
	//   37   60:iconst_0        
	//   38   61:istore          6
		flag = ViewUtils.isLayoutRtl(((View) (this)));
	//   39   63:aload_0         
	//   40   64:invokestatic    #353 <Method boolean ViewUtils.isLayoutRtl(View)>
	//   41   67:istore_1        
		int k2 = 0;
	//   42   68:iconst_0        
	//   43   69:istore          8
		while(k2 < i5) 
	//*  44   71:iload           8
	//*  45   73:iload           12
	//*  46   75:icmpge          387
		{
			View view = getChildAt(k2);
	//   47   78:aload_0         
	//   48   79:iload           8
	//   49   81:invokevirtual   #163 <Method View getChildAt(int)>
	//   50   84:astore          16
			int i3;
			int i4;
			if(view.getVisibility() == 8)
	//*  51   86:aload           16
	//*  52   88:invokevirtual   #166 <Method int View.getVisibility()>
	//*  53   91:bipush          8
	//*  54   93:icmpne          153
			{
				int l2 = i1;
	//   55   96:iload           6
	//   56   98:istore          9
				int l3 = l1;
	//   57  100:iload           7
	//   58  102:istore          10
				l1 = l;
	//   59  104:iload           5
	//   60  106:istore          7
				i1 = j;
	//   61  108:iload_3         
	//   62  109:istore          6
				l = l3;
	//   63  111:iload           10
	//   64  113:istore          5
				j = l2;
	//   65  115:iload           9
	//   66  117:istore_3        
			} else
	//*  67  118:iload           8
	//*  68  120:iconst_1        
	//*  69  121:iadd            
	//*  70  122:istore          10
	//*  71  124:iload           7
	//*  72  126:istore          8
	//*  73  128:iload           6
	//*  74  130:istore          9
	//*  75  132:iload_3         
	//*  76  133:istore          6
	//*  77  135:iload           5
	//*  78  137:istore          7
	//*  79  139:iload           9
	//*  80  141:istore_3        
	//*  81  142:iload           8
	//*  82  144:istore          5
	//*  83  146:iload           10
	//*  84  148:istore          8
	//*  85  150:goto            71
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   86  153:aload           16
	//   87  155:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   88  158:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//   89  161:astore          17
				if(layoutparams.isOverflowButton)
	//*  90  163:aload           17
	//*  91  165:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//*  92  168:ifeq            311
				{
					int j3 = view.getMeasuredWidth();
	//   93  171:aload           16
	//   94  173:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//   95  176:istore          9
					i1 = j3;
	//   96  178:iload           9
	//   97  180:istore          6
					if(hasSupportDividerBeforeChildAt(k2))
	//*  98  182:aload_0         
	//*  99  183:iload           8
	//* 100  185:invokevirtual   #355 <Method boolean hasSupportDividerBeforeChildAt(int)>
	//* 101  188:ifeq            198
						i1 = j3 + j5;
	//  102  191:iload           9
	//  103  193:iload           13
	//  104  195:iadd            
	//  105  196:istore          6
					int k5 = view.getMeasuredHeight();
	//  106  198:aload           16
	//  107  200:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//  108  203:istore          14
					int j4;
					int l5;
					if(flag)
	//* 109  205:iload_1         
	//* 110  206:ifeq            284
					{
						j3 = getPaddingLeft();
	//  111  209:aload_0         
	//  112  210:invokevirtual   #140 <Method int getPaddingLeft()>
	//  113  213:istore          9
						j3 = layoutparams.leftMargin + j3;
	//  114  215:aload           17
	//  115  217:getfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  116  220:iload           9
	//  117  222:iadd            
	//  118  223:istore          9
						j4 = j3 + i1;
	//  119  225:iload           9
	//  120  227:iload           6
	//  121  229:iadd            
	//  122  230:istore          10
					} else
	//* 123  232:iload           11
	//* 124  234:iload           14
	//* 125  236:iconst_2        
	//* 126  237:idiv            
	//* 127  238:isub            
	//* 128  239:istore          15
	//* 129  241:aload           16
	//* 130  243:iload           9
	//* 131  245:iload           15
	//* 132  247:iload           10
	//* 133  249:iload           14
	//* 134  251:iload           15
	//* 135  253:iadd            
	//* 136  254:invokevirtual   #358 <Method void View.layout(int, int, int, int)>
	//* 137  257:iload           7
	//* 138  259:iload           6
	//* 139  261:isub            
	//* 140  262:istore          9
	//* 141  264:iconst_1        
	//* 142  265:istore          10
	//* 143  267:iload_3         
	//* 144  268:istore          6
	//* 145  270:iload           5
	//* 146  272:istore          7
	//* 147  274:iload           10
	//* 148  276:istore_3        
	//* 149  277:iload           9
	//* 150  279:istore          5
	//* 151  281:goto            118
					{
						j4 = getWidth() - getPaddingRight() - layoutparams.rightMargin;
	//  152  284:aload_0         
	//  153  285:invokevirtual   #361 <Method int getWidth()>
	//  154  288:aload_0         
	//  155  289:invokevirtual   #143 <Method int getPaddingRight()>
	//  156  292:isub            
	//  157  293:aload           17
	//  158  295:getfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  159  298:isub            
	//  160  299:istore          10
						j3 = j4 - i1;
	//  161  301:iload           10
	//  162  303:iload           6
	//  163  305:isub            
	//  164  306:istore          9
					}
					l5 = l4 - k5 / 2;
					view.layout(j3, l5, j4, k5 + l5);
					j3 = l1 - i1;
					j4 = 1;
					i1 = j;
					l1 = l;
					j = j4;
					l = j3;
				} else
	//* 165  308:goto            232
				{
					int k4 = view.getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin;
	//  166  311:aload           16
	//  167  313:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//  168  316:aload           17
	//  169  318:getfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  170  321:iadd            
	//  171  322:aload           17
	//  172  324:getfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  173  327:iadd            
	//  174  328:istore          10
					int k3 = l + k4;
	//  175  330:iload           5
	//  176  332:iload           10
	//  177  334:iadd            
	//  178  335:istore          9
					l = k3;
	//  179  337:iload           9
	//  180  339:istore          5
					if(hasSupportDividerBeforeChildAt(k2))
	//* 181  341:aload_0         
	//* 182  342:iload           8
	//* 183  344:invokevirtual   #355 <Method boolean hasSupportDividerBeforeChildAt(int)>
	//* 184  347:ifeq            357
						l = k3 + j5;
	//  185  350:iload           9
	//  186  352:iload           13
	//  187  354:iadd            
	//  188  355:istore          5
					k3 = l1 - k4;
	//  189  357:iload           7
	//  190  359:iload           10
	//  191  361:isub            
	//  192  362:istore          9
					k4 = j + 1;
	//  193  364:iload_3         
	//  194  365:iconst_1        
	//  195  366:iadd            
	//  196  367:istore          10
					l1 = l;
	//  197  369:iload           5
	//  198  371:istore          7
					j = i1;
	//  199  373:iload           6
	//  200  375:istore_3        
					l = k3;
	//  201  376:iload           9
	//  202  378:istore          5
					i1 = k4;
	//  203  380:iload           10
	//  204  382:istore          6
				}
			}
			i4 = k2 + 1;
			k2 = l1;
			i3 = i1;
			i1 = j;
			l1 = l;
			j = i3;
			l = k2;
			k2 = i4;
		}
	//* 205  384:goto            118
		if(i5 == 1 && i1 == 0)
	//* 206  387:iload           12
	//* 207  389:iconst_1        
	//* 208  390:icmpne          455
	//* 209  393:iload           6
	//* 210  395:ifne            455
		{
			View view1 = getChildAt(0);
	//  211  398:aload_0         
	//  212  399:iconst_0        
	//  213  400:invokevirtual   #163 <Method View getChildAt(int)>
	//  214  403:astore          16
			j = view1.getMeasuredWidth();
	//  215  405:aload           16
	//  216  407:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//  217  410:istore_3        
			l = view1.getMeasuredHeight();
	//  218  411:aload           16
	//  219  413:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//  220  416:istore          5
			i = (k - i) / 2 - j / 2;
	//  221  418:iload           4
	//  222  420:iload_2         
	//  223  421:isub            
	//  224  422:iconst_2        
	//  225  423:idiv            
	//  226  424:iload_3         
	//  227  425:iconst_2        
	//  228  426:idiv            
	//  229  427:isub            
	//  230  428:istore_2        
			k = l4 - l / 2;
	//  231  429:iload           11
	//  232  431:iload           5
	//  233  433:iconst_2        
	//  234  434:idiv            
	//  235  435:isub            
	//  236  436:istore          4
			view1.layout(i, k, j + i, l + k);
	//  237  438:aload           16
	//  238  440:iload_2         
	//  239  441:iload           4
	//  240  443:iload_3         
	//  241  444:iload_2         
	//  242  445:iadd            
	//  243  446:iload           5
	//  244  448:iload           4
	//  245  450:iadd            
	//  246  451:invokevirtual   #358 <Method void View.layout(int, int, int, int)>
			return;
	//  247  454:return          
		}
		if(i1 != 0)
	//* 248  455:iload           6
	//* 249  457:ifeq            546
			i = 0;
	//  250  460:iconst_0        
	//  251  461:istore_2        
		else
	//* 252  462:iload_3         
	//* 253  463:iload_2         
	//* 254  464:isub            
	//* 255  465:istore_2        
	//* 256  466:iload_2         
	//* 257  467:ifle            551
	//* 258  470:iload           7
	//* 259  472:iload_2         
	//* 260  473:idiv            
	//* 261  474:istore_2        
	//* 262  475:iconst_0        
	//* 263  476:iload_2         
	//* 264  477:invokestatic    #192 <Method int Math.max(int, int)>
	//* 265  480:istore          4
	//* 266  482:iload_1         
	//* 267  483:ifeq            621
	//* 268  486:aload_0         
	//* 269  487:invokevirtual   #361 <Method int getWidth()>
	//* 270  490:aload_0         
	//* 271  491:invokevirtual   #143 <Method int getPaddingRight()>
	//* 272  494:isub            
	//* 273  495:istore_2        
	//* 274  496:iconst_0        
	//* 275  497:istore_3        
	//* 276  498:iload_3         
	//* 277  499:iload           12
	//* 278  501:icmpge          18
	//* 279  504:aload_0         
	//* 280  505:iload_3         
	//* 281  506:invokevirtual   #163 <Method View getChildAt(int)>
	//* 282  509:astore          16
	//* 283  511:aload           16
	//* 284  513:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 285  516:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 286  519:astore          17
	//* 287  521:aload           16
	//* 288  523:invokevirtual   #166 <Method int View.getVisibility()>
	//* 289  526:bipush          8
	//* 290  528:icmpeq          744
	//* 291  531:aload           17
	//* 292  533:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 293  536:ifeq            556
	//* 294  539:iload_3         
	//* 295  540:iconst_1        
	//* 296  541:iadd            
	//* 297  542:istore_3        
	//* 298  543:goto            498
			i = 1;
	//  299  546:iconst_1        
	//  300  547:istore_2        
		i = j - i;
		if(i > 0)
			i = l1 / i;
		else
	//* 301  548:goto            462
			i = 0;
	//  302  551:iconst_0        
	//  303  552:istore_2        
		k = Math.max(0, i);
		if(!flag)
			break; /* Loop/switch isn't completed */
		i = getWidth() - getPaddingRight();
		j = 0;
		while(j < i5) 
		{
			View view2 = getChildAt(j);
			LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
			if(view2.getVisibility() != 8 && !layoutparams1.isOverflowButton)
	//* 304  553:goto            475
			{
				i -= layoutparams1.rightMargin;
	//  305  556:iload_2         
	//  306  557:aload           17
	//  307  559:getfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  308  562:isub            
	//  309  563:istore_2        
				l = view2.getMeasuredWidth();
	//  310  564:aload           16
	//  311  566:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//  312  569:istore          5
				int j1 = view2.getMeasuredHeight();
	//  313  571:aload           16
	//  314  573:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//  315  576:istore          6
				int i2 = l4 - j1 / 2;
	//  316  578:iload           11
	//  317  580:iload           6
	//  318  582:iconst_2        
	//  319  583:idiv            
	//  320  584:isub            
	//  321  585:istore          7
				view2.layout(i - l, i2, i, j1 + i2);
	//  322  587:aload           16
	//  323  589:iload_2         
	//  324  590:iload           5
	//  325  592:isub            
	//  326  593:iload           7
	//  327  595:iload_2         
	//  328  596:iload           6
	//  329  598:iload           7
	//  330  600:iadd            
	//  331  601:invokevirtual   #358 <Method void View.layout(int, int, int, int)>
				i -= layoutparams1.leftMargin + l + k;
	//  332  604:iload_2         
	//  333  605:aload           17
	//  334  607:getfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  335  610:iload           5
	//  336  612:iadd            
	//  337  613:iload           4
	//  338  615:iadd            
	//  339  616:isub            
	//  340  617:istore_2        
			}
			j++;
		}
		if(true) goto _L4; else goto _L3
	//  341  618:goto            539
_L3:
		i = getPaddingLeft();
	//  342  621:aload_0         
	//  343  622:invokevirtual   #140 <Method int getPaddingLeft()>
	//  344  625:istore_2        
		j = 0;
	//  345  626:iconst_0        
	//  346  627:istore_3        
		while(j < i5) 
	//* 347  628:iload_3         
	//* 348  629:iload           12
	//* 349  631:icmpge          18
		{
			View view3 = getChildAt(j);
	//  350  634:aload_0         
	//  351  635:iload_3         
	//  352  636:invokevirtual   #163 <Method View getChildAt(int)>
	//  353  639:astore          16
			LayoutParams layoutparams2 = (LayoutParams)view3.getLayoutParams();
	//  354  641:aload           16
	//  355  643:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  356  646:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  357  649:astore          17
			if(view3.getVisibility() != 8 && !layoutparams2.isOverflowButton)
	//* 358  651:aload           16
	//* 359  653:invokevirtual   #166 <Method int View.getVisibility()>
	//* 360  656:bipush          8
	//* 361  658:icmpeq          741
	//* 362  661:aload           17
	//* 363  663:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 364  666:ifeq            676
	//* 365  669:iload_3         
	//* 366  670:iconst_1        
	//* 367  671:iadd            
	//* 368  672:istore_3        
	//* 369  673:goto            628
			{
				i += layoutparams2.leftMargin;
	//  370  676:iload_2         
	//  371  677:aload           17
	//  372  679:getfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  373  682:iadd            
	//  374  683:istore_2        
				l = view3.getMeasuredWidth();
	//  375  684:aload           16
	//  376  686:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//  377  689:istore          5
				int k1 = view3.getMeasuredHeight();
	//  378  691:aload           16
	//  379  693:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//  380  696:istore          6
				int j2 = l4 - k1 / 2;
	//  381  698:iload           11
	//  382  700:iload           6
	//  383  702:iconst_2        
	//  384  703:idiv            
	//  385  704:isub            
	//  386  705:istore          7
				view3.layout(i, j2, i + l, k1 + j2);
	//  387  707:aload           16
	//  388  709:iload_2         
	//  389  710:iload           7
	//  390  712:iload_2         
	//  391  713:iload           5
	//  392  715:iadd            
	//  393  716:iload           6
	//  394  718:iload           7
	//  395  720:iadd            
	//  396  721:invokevirtual   #358 <Method void View.layout(int, int, int, int)>
				i = layoutparams2.rightMargin + l + k + i;
	//  397  724:aload           17
	//  398  726:getfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  399  729:iload           5
	//  400  731:iadd            
	//  401  732:iload           4
	//  402  734:iadd            
	//  403  735:iload_2         
	//  404  736:iadd            
	//  405  737:istore_2        
			}
			j++;
		}
		if(true) goto _L4; else goto _L5
	//  406  738:goto            669
_L5:
	//* 407  741:goto            669
	//* 408  744:goto            539
	}

	protected void onMeasure(int i, int j)
	{
		boolean flag1 = mFormatItems;
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field boolean mFormatItems>
	//    2    4:istore          6
		int k;
		int i1;
		boolean flag;
		if(android.view.View.MeasureSpec.getMode(i) == 0x40000000)
	//*   3    6:iload_1         
	//*   4    7:invokestatic    #107 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   5   10:ldc1            #136 <Int 0x40000000>
	//*   6   12:icmpne          103
			flag = true;
	//    7   15:iconst_1        
	//    8   16:istore          5
		else
	//*   9   18:aload_0         
	//*  10   19:iload           5
	//*  11   21:putfield        #342 <Field boolean mFormatItems>
	//*  12   24:iload           6
	//*  13   26:aload_0         
	//*  14   27:getfield        #342 <Field boolean mFormatItems>
	//*  15   30:icmpeq          38
	//*  16   33:aload_0         
	//*  17   34:iconst_0        
	//*  18   35:putfield        #364 <Field int mFormatItemsWidth>
	//*  19   38:iload_1         
	//*  20   39:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//*  21   42:istore_3        
	//*  22   43:aload_0         
	//*  23   44:getfield        #342 <Field boolean mFormatItems>
	//*  24   47:ifeq            78
	//*  25   50:aload_0         
	//*  26   51:getfield        #257 <Field MenuBuilder mMenu>
	//*  27   54:ifnull          78
	//*  28   57:iload_3         
	//*  29   58:aload_0         
	//*  30   59:getfield        #364 <Field int mFormatItemsWidth>
	//*  31   62:icmpeq          78
	//*  32   65:aload_0         
	//*  33   66:iload_3         
	//*  34   67:putfield        #364 <Field int mFormatItemsWidth>
	//*  35   70:aload_0         
	//*  36   71:getfield        #257 <Field MenuBuilder mMenu>
	//*  37   74:iconst_1        
	//*  38   75:invokevirtual   #367 <Method void MenuBuilder.onItemsChanged(boolean)>
	//*  39   78:aload_0         
	//*  40   79:invokevirtual   #159 <Method int getChildCount()>
	//*  41   82:istore          4
	//*  42   84:aload_0         
	//*  43   85:getfield        #342 <Field boolean mFormatItems>
	//*  44   88:ifeq            109
	//*  45   91:iload           4
	//*  46   93:ifle            109
	//*  47   96:aload_0         
	//*  48   97:iload_1         
	//*  49   98:iload_2         
	//*  50   99:invokespecial   #369 <Method void onMeasureExactFormat(int, int)>
	//*  51  102:return          
			flag = false;
	//   52  103:iconst_0        
	//   53  104:istore          5
		mFormatItems = flag;
		if(flag1 != mFormatItems)
			mFormatItemsWidth = 0;
		k = android.view.View.MeasureSpec.getSize(i);
		if(mFormatItems && mMenu != null && k != mFormatItemsWidth)
		{
			mFormatItemsWidth = k;
			mMenu.onItemsChanged(true);
		}
		i1 = getChildCount();
		if(mFormatItems && i1 > 0)
		{
			onMeasureExactFormat(i, j);
			return;
		}
	//*  54  106:goto            18
		for(int l = 0; l < i1; l++)
	//*  55  109:iconst_0        
	//*  56  110:istore_3        
	//*  57  111:iload_3         
	//*  58  112:iload           4
	//*  59  114:icmpge          149
		{
			LayoutParams layoutparams = (LayoutParams)getChildAt(l).getLayoutParams();
	//   60  117:aload_0         
	//   61  118:iload_3         
	//   62  119:invokevirtual   #163 <Method View getChildAt(int)>
	//   63  122:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   64  125:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//   65  128:astore          7
			layoutparams.rightMargin = 0;
	//   66  130:aload           7
	//   67  132:iconst_0        
	//   68  133:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
			layoutparams.leftMargin = 0;
	//   69  136:aload           7
	//   70  138:iconst_0        
	//   71  139:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
		}

	//   72  142:iload_3         
	//   73  143:iconst_1        
	//   74  144:iadd            
	//   75  145:istore_3        
	//*  76  146:goto            111
		super.onMeasure(i, j);
	//   77  149:aload_0         
	//   78  150:iload_1         
	//   79  151:iload_2         
	//   80  152:invokespecial   #371 <Method void LinearLayoutCompat.onMeasure(int, int)>
	//   81  155:return          
	}

	public MenuBuilder peekMenu()
	{
		return mMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #257 <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

	public void setExpandedActionViewsExclusive(boolean flag)
	{
		mPresenter.setExpandedActionViewsExclusive(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #376 <Method void ActionMenuPresenter.setExpandedActionViewsExclusive(boolean)>
	//    4    8:return          
	}

	public void setMenuCallbacks(android.support.v7.view.menu.MenuPresenter.Callback callback, android.support.v7.view.menu.MenuBuilder.Callback callback1)
	{
		mActionMenuPresenterCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #274 <Field android.support.v7.view.menu.MenuPresenter$Callback mActionMenuPresenterCallback>
		mMenuBuilderCallback = callback1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #380 <Field android.support.v7.view.menu.MenuBuilder$Callback mMenuBuilderCallback>
	//    6   10:return          
	}

	public void setOnMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener)
	{
		mOnMenuItemClickListener = onmenuitemclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #384 <Field ActionMenuView$OnMenuItemClickListener mOnMenuItemClickListener>
	//    3    5:return          
	}

	public void setOverflowIcon(Drawable drawable)
	{
		getMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #291 <Method Menu getMenu()>
	//    2    4:pop             
		mPresenter.setOverflowIcon(drawable);
	//    3    5:aload_0         
	//    4    6:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #388 <Method void ActionMenuPresenter.setOverflowIcon(Drawable)>
	//    7   13:return          
	}

	public void setOverflowReserved(boolean flag)
	{
		mReserveOverflow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #323 <Field boolean mReserveOverflow>
	//    3    5:return          
	}

	public void setPopupTheme(int i)
	{
label0:
		{
			if(mPopupTheme != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field int mPopupTheme>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          25
			{
				mPopupTheme = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #90  <Field int mPopupTheme>
				if(i != 0)
					break label0;
	//    7   13:iload_1         
	//    8   14:ifne            26
				mPopupContext = getContext();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #231 <Method Context getContext()>
	//   12   22:putfield        #88  <Field Context mPopupContext>
			}
			return;
	//   13   25:return          
		}
		mPopupContext = ((Context) (new ContextThemeWrapper(getContext(), i)));
	//   14   26:aload_0         
	//   15   27:new             #395 <Class ContextThemeWrapper>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:invokevirtual   #231 <Method Context getContext()>
	//   19   35:iload_1         
	//   20   36:invokespecial   #398 <Method void ContextThemeWrapper(Context, int)>
	//   21   39:putfield        #88  <Field Context mPopupContext>
	//   22   42:return          
	}

	public void setPresenter(ActionMenuPresenter actionmenupresenter)
	{
		mPresenter = actionmenupresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #209 <Field ActionMenuPresenter mPresenter>
		mPresenter.setMenuView(this);
	//    3    5:aload_0         
	//    4    6:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #284 <Method void ActionMenuPresenter.setMenuView(ActionMenuView)>
	//    7   13:return          
	}

	public boolean showOverflowMenu()
	{
		return mPresenter != null && mPresenter.showOverflowMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    5   11:invokevirtual   #333 <Method boolean ActionMenuPresenter.showOverflowMenu()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	static final int GENERATED_ITEM_PADDING = 4;
	static final int MIN_CELL_SIZE = 56;
	private static final String TAG = "ActionMenuView";
	private android.support.v7.view.menu.MenuPresenter.Callback mActionMenuPresenterCallback;
	private boolean mFormatItems;
	private int mFormatItemsWidth;
	private int mGeneratedItemPadding;
	private MenuBuilder mMenu;
	android.support.v7.view.menu.MenuBuilder.Callback mMenuBuilderCallback;
	private int mMinCellSize;
	OnMenuItemClickListener mOnMenuItemClickListener;
	private Context mPopupContext;
	private int mPopupTheme;
	private ActionMenuPresenter mPresenter;
	private boolean mReserveOverflow;
}
