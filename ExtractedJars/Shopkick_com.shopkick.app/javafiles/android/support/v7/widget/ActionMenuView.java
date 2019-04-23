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
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//    3    7:astore          10
		int j1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(k) - l, android.view.View.MeasureSpec.getMode(k));
	//    4    9:iload_3         
	//    5   10:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    6   13:iload           4
	//    7   15:isub            
	//    8   16:iload_3         
	//    9   17:invokestatic    #107 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   10   20:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   11   23:istore          6
		ActionMenuItemView actionmenuitemview;
		if(view instanceof ActionMenuItemView)
	//*  12   25:aload_0         
	//*  13   26:instanceof      #113 <Class ActionMenuItemView>
	//*  14   29:ifeq            41
			actionmenuitemview = (ActionMenuItemView)view;
	//   15   32:aload_0         
	//   16   33:checkcast       #113 <Class ActionMenuItemView>
	//   17   36:astore          9
		else
	//*  18   38:goto            44
			actionmenuitemview = null;
	//   19   41:aconst_null     
	//   20   42:astore          9
		boolean flag = true;
	//   21   44:iconst_1        
	//   22   45:istore          8
		if(actionmenuitemview != null && actionmenuitemview.hasText())
	//*  23   47:aload           9
	//*  24   49:ifnull          65
	//*  25   52:aload           9
	//*  26   54:invokevirtual   #117 <Method boolean ActionMenuItemView.hasText()>
	//*  27   57:ifeq            65
			k = 1;
	//   28   60:iconst_1        
	//   29   61:istore_3        
		else
	//*  30   62:goto            67
			k = 0;
	//   31   65:iconst_0        
	//   32   66:istore_3        
		l = 2;
	//   33   67:iconst_2        
	//   34   68:istore          4
		if(j > 0 && (k == 0 || j >= 2))
	//*  35   70:iload_2         
	//*  36   71:ifle            142
	//*  37   74:iload_3         
	//*  38   75:ifeq            83
	//*  39   78:iload_2         
	//*  40   79:iconst_2        
	//*  41   80:icmplt          142
		{
			view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j * i, 0x80000000), j1);
	//   42   83:aload_0         
	//   43   84:iload_2         
	//   44   85:iload_1         
	//   45   86:imul            
	//   46   87:ldc1            #118 <Int 0x80000000>
	//   47   89:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   48   92:iload           6
	//   49   94:invokevirtual   #122 <Method void View.measure(int, int)>
			int k1 = view.getMeasuredWidth();
	//   50   97:aload_0         
	//   51   98:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//   52  101:istore          7
			int i1 = k1 / i;
	//   53  103:iload           7
	//   54  105:iload_1         
	//   55  106:idiv            
	//   56  107:istore          5
			j = i1;
	//   57  109:iload           5
	//   58  111:istore_2        
			if(k1 % i != 0)
	//*  59  112:iload           7
	//*  60  114:iload_1         
	//*  61  115:irem            
	//*  62  116:ifeq            124
				j = i1 + 1;
	//   63  119:iload           5
	//   64  121:iconst_1        
	//   65  122:iadd            
	//   66  123:istore_2        
			if(k != 0 && j < 2)
	//*  67  124:iload_3         
	//*  68  125:ifeq            139
	//*  69  128:iload_2         
	//*  70  129:iconst_2        
	//*  71  130:icmpge          139
				j = l;
	//   72  133:iload           4
	//   73  135:istore_2        
		} else
	//*  74  136:goto            144
	//*  75  139:goto            144
		{
			j = 0;
	//   76  142:iconst_0        
	//   77  143:istore_2        
		}
		if(layoutparams.isOverflowButton || k == 0)
	//*  78  144:aload           10
	//*  79  146:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//*  80  149:ifne            159
	//*  81  152:iload_3         
	//*  82  153:ifeq            159
	//*  83  156:goto            162
			flag = false;
	//   84  159:iconst_0        
	//   85  160:istore          8
		layoutparams.expandable = flag;
	//   86  162:aload           10
	//   87  164:iload           8
	//   88  166:putfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
		layoutparams.cellsUsed = j;
	//   89  169:aload           10
	//   90  171:iload_2         
	//   91  172:putfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i * j, 0x40000000), j1);
	//   92  175:aload_0         
	//   93  176:iload_1         
	//   94  177:iload_2         
	//   95  178:imul            
	//   96  179:ldc1            #136 <Int 0x40000000>
	//   97  181:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   98  184:iload           6
	//   99  186:invokevirtual   #122 <Method void View.measure(int, int)>
		return j;
	//  100  189:iload_2         
	//  101  190:ireturn         
	}

	private void onMeasureExactFormat(int i, int j)
	{
		int l2 = android.view.View.MeasureSpec.getMode(j);
	//    0    0:iload_2         
	//    1    1:invokestatic    #107 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          12
		i = android.view.View.MeasureSpec.getSize(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore_1        
		int i3 = android.view.View.MeasureSpec.getSize(j);
	//    6   11:iload_2         
	//    7   12:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   15:istore          13
		int k = getPaddingLeft();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #140 <Method int getPaddingLeft()>
	//   11   21:istore          5
		int l = getPaddingRight();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #143 <Method int getPaddingRight()>
	//   14   27:istore          6
		int j3 = getPaddingTop() + getPaddingBottom();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #146 <Method int getPaddingTop()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #149 <Method int getPaddingBottom()>
	//   19   37:iadd            
	//   20   38:istore          14
		int i5 = getChildMeasureSpec(j, j3, -2);
	//   21   40:iload_2         
	//   22   41:iload           14
	//   23   43:bipush          -2
	//   24   45:invokestatic    #153 <Method int getChildMeasureSpec(int, int, int)>
	//   25   48:istore          19
		int k3 = i - (k + l);
	//   26   50:iload_1         
	//   27   51:iload           5
	//   28   53:iload           6
	//   29   55:iadd            
	//   30   56:isub            
	//   31   57:istore          15
		i = mMinCellSize;
	//   32   59:aload_0         
	//   33   60:getfield        #83  <Field int mMinCellSize>
	//   34   63:istore_1        
		int k1 = k3 / i;
	//   35   64:iload           15
	//   36   66:iload_1         
	//   37   67:idiv            
	//   38   68:istore          8
		if(k1 == 0)
	//*  39   70:iload           8
	//*  40   72:ifne            83
		{
			setMeasuredDimension(k3, 0);
	//   41   75:aload_0         
	//   42   76:iload           15
	//   43   78:iconst_0        
	//   44   79:invokevirtual   #156 <Method void setMeasuredDimension(int, int)>
			return;
	//   45   82:return          
		}
		int j5 = i + (k3 % i) / k1;
	//   46   83:iload_1         
	//   47   84:iload           15
	//   48   86:iload_1         
	//   49   87:irem            
	//   50   88:iload           8
	//   51   90:idiv            
	//   52   91:iadd            
	//   53   92:istore          20
		int k5 = getChildCount();
	//   54   94:aload_0         
	//   55   95:invokevirtual   #159 <Method int getChildCount()>
	//   56   98:istore          21
		int i2 = 0;
	//   57  100:iconst_0        
	//   58  101:istore          9
		j = i2;
	//   59  103:iload           9
	//   60  105:istore_2        
		l = j;
	//   61  106:iload_2         
	//   62  107:istore          6
		k = l;
	//   63  109:iload           6
	//   64  111:istore          5
		i = k;
	//   65  113:iload           5
	//   66  115:istore_1        
		int i1 = i;
	//   67  116:iload_1         
	//   68  117:istore          7
		long l5 = 0L;
	//   69  119:lconst_0        
	//   70  120:lstore          22
		int j2 = i;
	//   71  122:iload_1         
	//   72  123:istore          10
		i = k1;
	//   73  125:iload           8
	//   74  127:istore_1        
		int k2 = k;
	//   75  128:iload           5
	//   76  130:istore          11
		k = i3;
	//   77  132:iload           13
	//   78  134:istore          5
		for(; i2 < k5; i2++)
	//*  79  136:iload           9
	//*  80  138:iload           21
	//*  81  140:icmpge          397
		{
			View view = getChildAt(i2);
	//   82  143:aload_0         
	//   83  144:iload           9
	//   84  146:invokevirtual   #163 <Method View getChildAt(int)>
	//   85  149:astore          31
			if(view.getVisibility() == 8)
	//*  86  151:aload           31
	//*  87  153:invokevirtual   #166 <Method int View.getVisibility()>
	//*  88  156:bipush          8
	//*  89  158:icmpne          164
				continue;
	//   90  161:goto            388
			boolean flag1 = view instanceof ActionMenuItemView;
	//   91  164:aload           31
	//   92  166:instanceof      #113 <Class ActionMenuItemView>
	//   93  169:istore          30
			k2++;
	//   94  171:iload           11
	//   95  173:iconst_1        
	//   96  174:iadd            
	//   97  175:istore          11
			if(flag1)
	//*  98  177:iload           30
	//*  99  179:ifeq            202
			{
				k1 = mGeneratedItemPadding;
	//  100  182:aload_0         
	//  101  183:getfield        #86  <Field int mGeneratedItemPadding>
	//  102  186:istore          8
				view.setPadding(k1, 0, k1, 0);
	//  103  188:aload           31
	//  104  190:iload           8
	//  105  192:iconst_0        
	//  106  193:iload           8
	//  107  195:iconst_0        
	//  108  196:invokevirtual   #170 <Method void View.setPadding(int, int, int, int)>
			}
	//* 109  199:goto            202
			LayoutParams layoutparams1 = (LayoutParams)view.getLayoutParams();
	//  110  202:aload           31
	//  111  204:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  112  207:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  113  210:astore          32
			layoutparams1.expanded = false;
	//  114  212:aload           32
	//  115  214:iconst_0        
	//  116  215:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
			layoutparams1.extraPixels = 0;
	//  117  218:aload           32
	//  118  220:iconst_0        
	//  119  221:putfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
			layoutparams1.cellsUsed = 0;
	//  120  224:aload           32
	//  121  226:iconst_0        
	//  122  227:putfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
			layoutparams1.expandable = false;
	//  123  230:aload           32
	//  124  232:iconst_0        
	//  125  233:putfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
			layoutparams1.leftMargin = 0;
	//  126  236:aload           32
	//  127  238:iconst_0        
	//  128  239:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
			layoutparams1.rightMargin = 0;
	//  129  242:aload           32
	//  130  244:iconst_0        
	//  131  245:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
			if(flag1 && ((ActionMenuItemView)view).hasText())
	//* 132  248:iload           30
	//* 133  250:ifeq            270
	//* 134  253:aload           31
	//* 135  255:checkcast       #113 <Class ActionMenuItemView>
	//* 136  258:invokevirtual   #117 <Method boolean ActionMenuItemView.hasText()>
	//* 137  261:ifeq            270
				flag1 = true;
	//  138  264:iconst_1        
	//  139  265:istore          30
			else
	//* 140  267:goto            273
				flag1 = false;
	//  141  270:iconst_0        
	//  142  271:istore          30
			layoutparams1.preventEdgeOffset = flag1;
	//  143  273:aload           32
	//  144  275:iload           30
	//  145  277:putfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
			if(layoutparams1.isOverflowButton)
	//* 146  280:aload           32
	//* 147  282:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 148  285:ifeq            294
				k1 = 1;
	//  149  288:iconst_1        
	//  150  289:istore          8
			else
	//* 151  291:goto            297
				k1 = i;
	//  152  294:iload_1         
	//  153  295:istore          8
			i3 = measureChildForCells(view, j5, k1, i5, j3);
	//  154  297:aload           31
	//  155  299:iload           20
	//  156  301:iload           8
	//  157  303:iload           19
	//  158  305:iload           14
	//  159  307:invokestatic    #187 <Method int measureChildForCells(View, int, int, int, int)>
	//  160  310:istore          13
			j2 = Math.max(j2, i3);
	//  161  312:iload           10
	//  162  314:iload           13
	//  163  316:invokestatic    #192 <Method int Math.max(int, int)>
	//  164  319:istore          10
			k1 = i1;
	//  165  321:iload           7
	//  166  323:istore          8
			if(layoutparams1.expandable)
	//* 167  325:aload           32
	//* 168  327:getfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
	//* 169  330:ifeq            339
				k1 = i1 + 1;
	//  170  333:iload           7
	//  171  335:iconst_1        
	//  172  336:iadd            
	//  173  337:istore          8
			if(layoutparams1.isOverflowButton)
	//* 174  339:aload           32
	//* 175  341:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 176  344:ifeq            350
				l = 1;
	//  177  347:iconst_1        
	//  178  348:istore          6
			i -= i3;
	//  179  350:iload_1         
	//  180  351:iload           13
	//  181  353:isub            
	//  182  354:istore_1        
			j = Math.max(j, view.getMeasuredHeight());
	//  183  355:iload_2         
	//  184  356:aload           31
	//  185  358:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//  186  361:invokestatic    #192 <Method int Math.max(int, int)>
	//  187  364:istore_2        
			if(i3 == 1)
	//* 188  365:iload           13
	//* 189  367:iconst_1        
	//* 190  368:icmpne          384
				l5 |= 1 << i2;
	//  191  371:lload           22
	//  192  373:iconst_1        
	//  193  374:iload           9
	//  194  376:ishl            
	//  195  377:i2l             
	//  196  378:lor             
	//  197  379:lstore          22
	//* 198  381:goto            384
			i1 = k1;
	//  199  384:iload           8
	//  200  386:istore          7
		}

	//  201  388:iload           9
	//  202  390:iconst_1        
	//  203  391:iadd            
	//  204  392:istore          9
	//* 205  394:goto            136
		if(l != 0 && k2 == 2)
	//* 206  397:iload           6
	//* 207  399:ifeq            414
	//* 208  402:iload           11
	//* 209  404:iconst_2        
	//* 210  405:icmpne          414
			i3 = 1;
	//  211  408:iconst_1        
	//  212  409:istore          13
		else
	//* 213  411:goto            417
			i3 = 0;
	//  214  414:iconst_0        
	//  215  415:istore          13
		k1 = 0;
	//  216  417:iconst_0        
	//  217  418:istore          8
		j3 = i;
	//  218  420:iload_1         
	//  219  421:istore          14
		i = k1;
	//  220  423:iload           8
	//  221  425:istore_1        
		k1 = k3;
	//  222  426:iload           15
	//  223  428:istore          8
		do
		{
			if(i1 <= 0 || j3 <= 0)
				break;
	//  224  430:iload           7
	//  225  432:ifle            762
	//  226  435:iload           14
	//  227  437:ifle            762
			int l3 = 0x7fffffff;
	//  228  440:ldc1            #196 <Int 0x7fffffff>
	//  229  442:istore          15
			int j4 = 0;
	//  230  444:iconst_0        
	//  231  445:istore          16
			int k4 = 0;
	//  232  447:iconst_0        
	//  233  448:istore          17
			long l6;
			long l8;
			for(l8 = 0L; j4 < k5; l8 = l6)
	//* 234  450:lconst_0        
	//* 235  451:lstore          26
	//* 236  453:iload           16
	//* 237  455:iload           21
	//* 238  457:icmpge          588
			{
				LayoutParams layoutparams = (LayoutParams)getChildAt(j4).getLayoutParams();
	//  239  460:aload_0         
	//  240  461:iload           16
	//  241  463:invokevirtual   #163 <Method View getChildAt(int)>
	//  242  466:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  243  469:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  244  472:astore          31
				int l4;
				if(!layoutparams.expandable)
	//* 245  474:aload           31
	//* 246  476:getfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
	//* 247  479:ifne            497
				{
					l4 = l3;
	//  248  482:iload           15
	//  249  484:istore          18
					i2 = k4;
	//  250  486:iload           17
	//  251  488:istore          9
					l6 = l8;
	//  252  490:lload           26
	//  253  492:lstore          24
				} else
	//* 254  494:goto            567
				if(layoutparams.cellsUsed < l3)
	//* 255  497:aload           31
	//* 256  499:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 257  502:iload           15
	//* 258  504:icmpge          526
				{
					l4 = layoutparams.cellsUsed;
	//  259  507:aload           31
	//  260  509:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//  261  512:istore          18
					l6 = 1L << j4;
	//  262  514:lconst_1        
	//  263  515:iload           16
	//  264  517:lshl            
	//  265  518:lstore          24
					i2 = 1;
	//  266  520:iconst_1        
	//  267  521:istore          9
				} else
	//* 268  523:goto            567
				{
					l4 = l3;
	//  269  526:iload           15
	//  270  528:istore          18
					i2 = k4;
	//  271  530:iload           17
	//  272  532:istore          9
					l6 = l8;
	//  273  534:lload           26
	//  274  536:lstore          24
					if(layoutparams.cellsUsed == l3)
	//* 275  538:aload           31
	//* 276  540:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 277  543:iload           15
	//* 278  545:icmpne          567
					{
						l6 = l8 | 1L << j4;
	//  279  548:lload           26
	//  280  550:lconst_1        
	//  281  551:iload           16
	//  282  553:lshl            
	//  283  554:lor             
	//  284  555:lstore          24
						i2 = k4 + 1;
	//  285  557:iload           17
	//  286  559:iconst_1        
	//  287  560:iadd            
	//  288  561:istore          9
						l4 = l3;
	//  289  563:iload           15
	//  290  565:istore          18
					}
				}
				j4++;
	//  291  567:iload           16
	//  292  569:iconst_1        
	//  293  570:iadd            
	//  294  571:istore          16
				l3 = l4;
	//  295  573:iload           18
	//  296  575:istore          15
				k4 = i2;
	//  297  577:iload           9
	//  298  579:istore          17
			}

	//  299  581:lload           24
	//  300  583:lstore          26
	//* 301  585:goto            453
			l5 |= l8;
	//  302  588:lload           22
	//  303  590:lload           26
	//  304  592:lor             
	//  305  593:lstore          22
			if(k4 > j3)
	//* 306  595:iload           17
	//* 307  597:iload           14
	//* 308  599:icmple          605
				break;
	//  309  602:goto            762
			i = l3 + 1;
	//  310  605:iload           15
	//  311  607:iconst_1        
	//  312  608:iadd            
	//  313  609:istore_1        
			for(i2 = 0; i2 < k5; i2++)
	//* 314  610:iconst_0        
	//* 315  611:istore          9
	//* 316  613:iload           9
	//* 317  615:iload           21
	//* 318  617:icmpge          757
			{
				View view1 = getChildAt(i2);
	//  319  620:aload_0         
	//  320  621:iload           9
	//  321  623:invokevirtual   #163 <Method View getChildAt(int)>
	//  322  626:astore          31
				LayoutParams layoutparams2 = (LayoutParams)view1.getLayoutParams();
	//  323  628:aload           31
	//  324  630:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  325  633:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  326  636:astore          32
				long l9 = 1 << i2;
	//  327  638:iconst_1        
	//  328  639:iload           9
	//  329  641:ishl            
	//  330  642:i2l             
	//  331  643:lstore          28
				if((l8 & l9) == 0L)
	//* 332  645:lload           26
	//* 333  647:lload           28
	//* 334  649:land            
	//* 335  650:lconst_0        
	//* 336  651:lcmp            
	//* 337  652:ifne            682
				{
					long l7 = l5;
	//  338  655:lload           22
	//  339  657:lstore          24
					if(layoutparams2.cellsUsed == i)
	//* 340  659:aload           32
	//* 341  661:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 342  664:iload_1         
	//* 343  665:icmpne          675
						l7 = l5 | l9;
	//  344  668:lload           22
	//  345  670:lload           28
	//  346  672:lor             
	//  347  673:lstore          24
					l5 = l7;
	//  348  675:lload           24
	//  349  677:lstore          22
					continue;
	//  350  679:goto            748
				}
				if(i3 && layoutparams2.preventEdgeOffset && j3 == 1)
	//* 351  682:iload           13
	//* 352  684:ifeq            724
	//* 353  687:aload           32
	//* 354  689:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 355  692:ifeq            724
	//* 356  695:iload           14
	//* 357  697:iconst_1        
	//* 358  698:icmpne          724
				{
					int i4 = mGeneratedItemPadding;
	//  359  701:aload_0         
	//  360  702:getfield        #86  <Field int mGeneratedItemPadding>
	//  361  705:istore          15
					view1.setPadding(i4 + j5, 0, i4, 0);
	//  362  707:aload           31
	//  363  709:iload           15
	//  364  711:iload           20
	//  365  713:iadd            
	//  366  714:iconst_0        
	//  367  715:iload           15
	//  368  717:iconst_0        
	//  369  718:invokevirtual   #170 <Method void View.setPadding(int, int, int, int)>
				}
	//* 370  721:goto            724
				layoutparams2.cellsUsed = layoutparams2.cellsUsed + 1;
	//  371  724:aload           32
	//  372  726:aload           32
	//  373  728:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//  374  731:iconst_1        
	//  375  732:iadd            
	//  376  733:putfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
				layoutparams2.expanded = true;
	//  377  736:aload           32
	//  378  738:iconst_1        
	//  379  739:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
				j3--;
	//  380  742:iload           14
	//  381  744:iconst_1        
	//  382  745:isub            
	//  383  746:istore          14
			}

	//  384  748:iload           9
	//  385  750:iconst_1        
	//  386  751:iadd            
	//  387  752:istore          9
	//* 388  754:goto            613
			i = 1;
	//  389  757:iconst_1        
	//  390  758:istore_1        
		} while(true);
	//  391  759:goto            430
		i2 = k1;
	//  392  762:iload           8
	//  393  764:istore          9
		boolean flag;
		if(l == 0 && k2 == 1)
	//* 394  766:iload           6
	//* 395  768:ifne            783
	//* 396  771:iload           11
	//* 397  773:iconst_1        
	//* 398  774:icmpne          783
			flag = true;
	//  399  777:iconst_1        
	//  400  778:istore          6
		else
	//* 401  780:goto            786
			flag = false;
	//  402  783:iconst_0        
	//  403  784:istore          6
		if(j3 > 0 && l5 != 0L && (j3 < k2 - 1 || flag || j2 > 1))
	//* 404  786:iload           14
	//* 405  788:ifle            1139
	//* 406  791:lload           22
	//* 407  793:lconst_0        
	//* 408  794:lcmp            
	//* 409  795:ifeq            1139
	//* 410  798:iload           14
	//* 411  800:iload           11
	//* 412  802:iconst_1        
	//* 413  803:isub            
	//* 414  804:icmplt          818
	//* 415  807:iload           6
	//* 416  809:ifne            818
	//* 417  812:iload           10
	//* 418  814:iconst_1        
	//* 419  815:icmple          1139
		{
			float f1 = Long.bitCount(l5);
	//  420  818:lload           22
	//  421  820:invokestatic    #202 <Method int Long.bitCount(long)>
	//  422  823:i2f             
	//  423  824:fstore          4
			if(!flag)
	//* 424  826:iload           6
	//* 425  828:ifne            924
			{
				float f;
				if((l5 & 1L) != 0L)
	//* 426  831:lload           22
	//* 427  833:lconst_1        
	//* 428  834:land            
	//* 429  835:lconst_0        
	//* 430  836:lcmp            
	//* 431  837:ifeq            869
				{
					f = f1;
	//  432  840:fload           4
	//  433  842:fstore_3        
					if(!((LayoutParams)getChildAt(0).getLayoutParams()).preventEdgeOffset)
	//* 434  843:aload_0         
	//* 435  844:iconst_0        
	//* 436  845:invokevirtual   #163 <Method View getChildAt(int)>
	//* 437  848:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 438  851:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 439  854:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 440  857:ifne            872
						f = f1 - 0.5F;
	//  441  860:fload           4
	//  442  862:ldc1            #203 <Float 0.5F>
	//  443  864:fsub            
	//  444  865:fstore_3        
				} else
	//* 445  866:goto            872
				{
					f = f1;
	//  446  869:fload           4
	//  447  871:fstore_3        
				}
				flag = ((boolean) (k5 - 1));
	//  448  872:iload           21
	//  449  874:iconst_1        
	//  450  875:isub            
	//  451  876:istore          6
				f1 = f;
	//  452  878:fload_3         
	//  453  879:fstore          4
				if((l5 & (long)(1 << flag)) != 0L)
	//* 454  881:lload           22
	//* 455  883:iconst_1        
	//* 456  884:iload           6
	//* 457  886:ishl            
	//* 458  887:i2l             
	//* 459  888:land            
	//* 460  889:lconst_0        
	//* 461  890:lcmp            
	//* 462  891:ifeq            924
				{
					f1 = f;
	//  463  894:fload_3         
	//  464  895:fstore          4
					if(!((LayoutParams)getChildAt(((int) (flag))).getLayoutParams()).preventEdgeOffset)
	//* 465  897:aload_0         
	//* 466  898:iload           6
	//* 467  900:invokevirtual   #163 <Method View getChildAt(int)>
	//* 468  903:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 469  906:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 470  909:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 471  912:ifne            924
						f1 = f - 0.5F;
	//  472  915:fload_3         
	//  473  916:ldc1            #203 <Float 0.5F>
	//  474  918:fsub            
	//  475  919:fstore          4
				}
			}
	//* 476  921:goto            924
			int j1;
			if(f1 > 0.0F)
	//* 477  924:fload           4
	//* 478  926:fconst_0        
	//* 479  927:fcmpl           
	//* 480  928:ifle            946
				j1 = (int)((float)(j3 * j5) / f1);
	//  481  931:iload           14
	//  482  933:iload           20
	//  483  935:imul            
	//  484  936:i2f             
	//  485  937:fload           4
	//  486  939:fdiv            
	//  487  940:f2i             
	//  488  941:istore          7
			else
	//* 489  943:goto            949
				j1 = 0;
	//  490  946:iconst_0        
	//  491  947:istore          7
			int l1 = 0;
	//  492  949:iconst_0        
	//  493  950:istore          8
			do
			{
				flag = ((boolean) (i));
	//  494  952:iload_1         
	//  495  953:istore          6
				if(l1 >= k5)
					break;
	//  496  955:iload           8
	//  497  957:iload           21
	//  498  959:icmpge          1142
				if((l5 & (long)(1 << l1)) == 0L)
	//* 499  962:lload           22
	//* 500  964:iconst_1        
	//* 501  965:iload           8
	//* 502  967:ishl            
	//* 503  968:i2l             
	//* 504  969:land            
	//* 505  970:lconst_0        
	//* 506  971:lcmp            
	//* 507  972:ifne            981
				{
					flag = ((boolean) (i));
	//  508  975:iload_1         
	//  509  976:istore          6
				} else
	//* 510  978:goto            1127
				{
					View view2 = getChildAt(l1);
	//  511  981:aload_0         
	//  512  982:iload           8
	//  513  984:invokevirtual   #163 <Method View getChildAt(int)>
	//  514  987:astore          31
					LayoutParams layoutparams3 = (LayoutParams)view2.getLayoutParams();
	//  515  989:aload           31
	//  516  991:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  517  994:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  518  997:astore          32
					if(view2 instanceof ActionMenuItemView)
	//* 519  999:aload           31
	//* 520 1001:instanceof      #113 <Class ActionMenuItemView>
	//* 521 1004:ifeq            1052
					{
						layoutparams3.extraPixels = j1;
	//  522 1007:aload           32
	//  523 1009:iload           7
	//  524 1011:putfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
						layoutparams3.expanded = true;
	//  525 1014:aload           32
	//  526 1016:iconst_1        
	//  527 1017:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
						if(l1 == 0 && !layoutparams3.preventEdgeOffset)
	//* 528 1020:iload           8
	//* 529 1022:ifne            1046
	//* 530 1025:aload           32
	//* 531 1027:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 532 1030:ifne            1046
							layoutparams3.leftMargin = -j1 / 2;
	//  533 1033:aload           32
	//  534 1035:iload           7
	//  535 1037:ineg            
	//  536 1038:iconst_2        
	//  537 1039:idiv            
	//  538 1040:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//* 539 1043:goto            1046
						flag = true;
	//  540 1046:iconst_1        
	//  541 1047:istore          6
					} else
	//* 542 1049:goto            1127
					if(layoutparams3.isOverflowButton)
	//* 543 1052:aload           32
	//* 544 1054:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 545 1057:ifeq            1089
					{
						layoutparams3.extraPixels = j1;
	//  546 1060:aload           32
	//  547 1062:iload           7
	//  548 1064:putfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
						layoutparams3.expanded = true;
	//  549 1067:aload           32
	//  550 1069:iconst_1        
	//  551 1070:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
						layoutparams3.rightMargin = -j1 / 2;
	//  552 1073:aload           32
	//  553 1075:iload           7
	//  554 1077:ineg            
	//  555 1078:iconst_2        
	//  556 1079:idiv            
	//  557 1080:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
						flag = true;
	//  558 1083:iconst_1        
	//  559 1084:istore          6
					} else
	//* 560 1086:goto            1127
					{
						if(l1 != 0)
	//* 561 1089:iload           8
	//* 562 1091:ifeq            1103
							layoutparams3.leftMargin = j1 / 2;
	//  563 1094:aload           32
	//  564 1096:iload           7
	//  565 1098:iconst_2        
	//  566 1099:idiv            
	//  567 1100:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
						flag = ((boolean) (i));
	//  568 1103:iload_1         
	//  569 1104:istore          6
						if(l1 != k5 - 1)
	//* 570 1106:iload           8
	//* 571 1108:iload           21
	//* 572 1110:iconst_1        
	//* 573 1111:isub            
	//* 574 1112:icmpeq          1127
						{
							layoutparams3.rightMargin = j1 / 2;
	//  575 1115:aload           32
	//  576 1117:iload           7
	//  577 1119:iconst_2        
	//  578 1120:idiv            
	//  579 1121:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
							flag = ((boolean) (i));
	//  580 1124:iload_1         
	//  581 1125:istore          6
						}
					}
				}
				l1++;
	//  582 1127:iload           8
	//  583 1129:iconst_1        
	//  584 1130:iadd            
	//  585 1131:istore          8
				i = ((int) (flag));
	//  586 1133:iload           6
	//  587 1135:istore_1        
			} while(true);
	//  588 1136:goto            952
		} else
		{
			flag = ((boolean) (i));
	//  589 1139:iload_1         
	//  590 1140:istore          6
		}
		i = 0;
	//  591 1142:iconst_0        
	//  592 1143:istore_1        
		if(flag != 0)
	//* 593 1144:iload           6
	//* 594 1146:ifeq            1216
			for(; i < k5; i++)
	//* 595 1149:iload_1         
	//* 596 1150:iload           21
	//* 597 1152:icmpge          1216
			{
				View view3 = getChildAt(i);
	//  598 1155:aload_0         
	//  599 1156:iload_1         
	//  600 1157:invokevirtual   #163 <Method View getChildAt(int)>
	//  601 1160:astore          31
				LayoutParams layoutparams4 = (LayoutParams)view3.getLayoutParams();
	//  602 1162:aload           31
	//  603 1164:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  604 1167:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  605 1170:astore          32
				if(layoutparams4.expanded)
	//* 606 1172:aload           32
	//* 607 1174:getfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
	//* 608 1177:ifne            1183
	//* 609 1180:goto            1209
					view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams4.cellsUsed * j5 + layoutparams4.extraPixels, 0x40000000), i5);
	//  610 1183:aload           31
	//  611 1185:aload           32
	//  612 1187:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//  613 1190:iload           20
	//  614 1192:imul            
	//  615 1193:aload           32
	//  616 1195:getfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
	//  617 1198:iadd            
	//  618 1199:ldc1            #136 <Int 0x40000000>
	//  619 1201:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  620 1204:iload           19
	//  621 1206:invokevirtual   #122 <Method void View.measure(int, int)>
			}

	//  622 1209:iload_1         
	//  623 1210:iconst_1        
	//  624 1211:iadd            
	//  625 1212:istore_1        
	//* 626 1213:goto            1149
		if(l2 == 0x40000000)
	//* 627 1216:iload           12
	//* 628 1218:ldc1            #136 <Int 0x40000000>
	//* 629 1220:icmpeq          1226
	//* 630 1223:goto            1229
			j = k;
	//  631 1226:iload           5
	//  632 1228:istore_2        
		setMeasuredDimension(i2, j);
	//  633 1229:aload_0         
	//  634 1230:iload           9
	//  635 1232:iload_2         
	//  636 1233:invokevirtual   #156 <Method void setMeasuredDimension(int, int)>
	//  637 1236:return          
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
		ActionMenuPresenter actionmenupresenter = mPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    2    4:astore_1        
		if(actionmenupresenter != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			actionmenupresenter.dismissPopupMenus();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #213 <Method boolean ActionMenuPresenter.dismissPopupMenus()>
	//    7   13:pop             
	//    8   14:return          
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
	//*   4    8:ifeq            26
				layoutparams = ((android.view.ViewGroup.LayoutParams) (new LayoutParams((LayoutParams)layoutparams)));
	//    5   11:new             #16  <Class ActionMenuView$LayoutParams>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//    9   19:invokespecial   #236 <Method void ActionMenuView$LayoutParams(ActionMenuView$LayoutParams)>
	//   10   22:astore_1        
			else
	//*  11   23:goto            35
				layoutparams = ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//   12   26:new             #16  <Class ActionMenuView$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:invokespecial   #239 <Method void ActionMenuView$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   16   34:astore_1        
			if(((LayoutParams) (layoutparams)).gravity <= 0)
	//*  17   35:aload_1         
	//*  18   36:getfield        #222 <Field int ActionMenuView$LayoutParams.gravity>
	//*  19   39:ifgt            48
				layoutparams.gravity = 16;
	//   20   42:aload_1         
	//   21   43:bipush          16
	//   22   45:putfield        #222 <Field int ActionMenuView$LayoutParams.gravity>
			return ((LayoutParams) (layoutparams));
	//   23   48:aload_1         
	//   24   49:areturn         
		} else
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
	//*   2    4:ifnonnull       112
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
			obj = ((Object) (mActionMenuPresenterCallback));
	//   32   64:aload_0         
	//   33   65:getfield        #274 <Field android.support.v7.view.menu.MenuPresenter$Callback mActionMenuPresenterCallback>
	//   34   68:astore_1        
			if(obj == null)
	//*  35   69:aload_1         
	//*  36   70:ifnull          76
	//*  37   73:goto            84
				obj = ((Object) (new ActionMenuPresenterCallback()));
	//   38   76:new             #13  <Class ActionMenuView$ActionMenuPresenterCallback>
	//   39   79:dup             
	//   40   80:invokespecial   #276 <Method void ActionMenuView$ActionMenuPresenterCallback()>
	//   41   83:astore_1        
			actionmenupresenter.setCallback(((android.support.v7.view.menu.MenuPresenter.Callback) (obj)));
	//   42   84:aload_2         
	//   43   85:aload_1         
	//   44   86:invokevirtual   #279 <Method void ActionMenuPresenter.setCallback(android.support.v7.view.menu.MenuPresenter$Callback)>
			mMenu.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (mPresenter)), mPopupContext);
	//   45   89:aload_0         
	//   46   90:getfield        #257 <Field MenuBuilder mMenu>
	//   47   93:aload_0         
	//   48   94:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//   49   97:aload_0         
	//   50   98:getfield        #88  <Field Context mPopupContext>
	//   51  101:invokevirtual   #283 <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter, Context)>
			mPresenter.setMenuView(this);
	//   52  104:aload_0         
	//   53  105:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//   54  108:aload_0         
	//   55  109:invokevirtual   #286 <Method void ActionMenuPresenter.setMenuView(ActionMenuView)>
		}
		return ((Menu) (mMenu));
	//   56  112:aload_0         
	//   57  113:getfield        #257 <Field MenuBuilder mMenu>
	//   58  116:areturn         
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
		flag1 = flag;
	//   33   57:iload_2         
	//   34   58:istore_3        
		if(i > 0)
	//*  35   59:iload_1         
	//*  36   60:ifle            86
		{
			flag1 = flag;
	//   37   63:iload_2         
	//   38   64:istore_3        
			if(view1 instanceof ActionMenuChildView)
	//*  39   65:aload           5
	//*  40   67:instanceof      #10  <Class ActionMenuView$ActionMenuChildView>
	//*  41   70:ifeq            86
				flag1 = flag | ((ActionMenuChildView)view1).needsDividerBefore();
	//   42   73:iload_2         
	//   43   74:aload           5
	//   44   76:checkcast       #10  <Class ActionMenuView$ActionMenuChildView>
	//   45   79:invokeinterface #303 <Method boolean ActionMenuView$ActionMenuChildView.needsDividerBefore()>
	//   46   84:ior             
	//   47   85:istore_3        
		}
		return flag1;
	//   48   86:iload_3         
	//   49   87:ireturn         
	}

	public boolean hideOverflowMenu()
	{
		ActionMenuPresenter actionmenupresenter = mPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    2    4:astore_1        
		return actionmenupresenter != null && actionmenupresenter.hideOverflowMenu();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #306 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
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
		ActionMenuPresenter actionmenupresenter = mPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    2    4:astore_1        
		return actionmenupresenter != null && actionmenupresenter.isOverflowMenuShowPending();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #317 <Method boolean ActionMenuPresenter.isOverflowMenuShowPending()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean isOverflowMenuShowing()
	{
		ActionMenuPresenter actionmenupresenter = mPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    2    4:astore_1        
		return actionmenupresenter != null && actionmenupresenter.isOverflowMenuShowing();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #320 <Method boolean ActionMenuPresenter.isOverflowMenuShowing()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
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
		configuration = ((Configuration) (mPresenter));
	//    3    5:aload_0         
	//    4    6:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    5    9:astore_1        
		if(configuration != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          45
		{
			((ActionMenuPresenter) (configuration)).updateMenuView(false);
	//    8   14:aload_1         
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #330 <Method void ActionMenuPresenter.updateMenuView(boolean)>
			if(mPresenter.isOverflowMenuShowing())
	//*  11   19:aload_0         
	//*  12   20:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//*  13   23:invokevirtual   #320 <Method boolean ActionMenuPresenter.isOverflowMenuShowing()>
	//*  14   26:ifeq            45
			{
				mPresenter.hideOverflowMenu();
	//   15   29:aload_0         
	//   16   30:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//   17   33:invokevirtual   #306 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
	//   18   36:pop             
				mPresenter.showOverflowMenu();
	//   19   37:aload_0         
	//   20   38:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//   21   41:invokevirtual   #333 <Method boolean ActionMenuPresenter.showOverflowMenu()>
	//   22   44:pop             
			}
		}
	//   23   45:return          
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
		if(!mFormatItems)
	//*   0    0:aload_0         
	//*   1    1:getfield        #342 <Field boolean mFormatItems>
	//*   2    4:ifne            19
		{
			super.onLayout(flag, i, j, k, l);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:iload           5
	//    9   15:invokespecial   #344 <Method void LinearLayoutCompat.onLayout(boolean, int, int, int, int)>
			return;
	//   10   18:return          
		}
		int k2 = getChildCount();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #159 <Method int getChildCount()>
	//   13   23:istore          9
		int j2 = (l - j) / 2;
	//   14   25:iload           5
	//   15   27:iload_3         
	//   16   28:isub            
	//   17   29:iconst_2        
	//   18   30:idiv            
	//   19   31:istore          8
		int l2 = getDividerWidth();
	//   20   33:aload_0         
	//   21   34:invokevirtual   #347 <Method int getDividerWidth()>
	//   22   37:istore          10
		int i3 = k - i;
	//   23   39:iload           4
	//   24   41:iload_2         
	//   25   42:isub            
	//   26   43:istore          11
		i = getPaddingRight();
	//   27   45:aload_0         
	//   28   46:invokevirtual   #143 <Method int getPaddingRight()>
	//   29   49:istore_2        
		j = getPaddingLeft();
	//   30   50:aload_0         
	//   31   51:invokevirtual   #140 <Method int getPaddingLeft()>
	//   32   54:istore_3        
		flag = ViewUtils.isLayoutRtl(((View) (this)));
	//   33   55:aload_0         
	//   34   56:invokestatic    #353 <Method boolean ViewUtils.isLayoutRtl(View)>
	//   35   59:istore_1        
		i = i3 - i - j;
	//   36   60:iload           11
	//   37   62:iload_2         
	//   38   63:isub            
	//   39   64:iload_3         
	//   40   65:isub            
	//   41   66:istore_2        
		j = 0;
	//   42   67:iconst_0        
	//   43   68:istore_3        
		l = 0;
	//   44   69:iconst_0        
	//   45   70:istore          5
		k = 0;
	//   46   72:iconst_0        
	//   47   73:istore          4
		for(; j < k2; j++)
	//*  48   75:iload_3         
	//*  49   76:iload           9
	//*  50   78:icmpge          277
		{
			View view = getChildAt(j);
	//   51   81:aload_0         
	//   52   82:iload_3         
	//   53   83:invokevirtual   #163 <Method View getChildAt(int)>
	//   54   86:astore          14
			if(view.getVisibility() == 8)
	//*  55   88:aload           14
	//*  56   90:invokevirtual   #166 <Method int View.getVisibility()>
	//*  57   93:bipush          8
	//*  58   95:icmpne          101
				continue;
	//   59   98:goto            270
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   60  101:aload           14
	//   61  103:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   62  106:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//   63  109:astore          15
			if(layoutparams.isOverflowButton)
	//*  64  111:aload           15
	//*  65  113:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//*  66  116:ifeq            238
			{
				int i1 = view.getMeasuredWidth();
	//   67  119:aload           14
	//   68  121:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//   69  124:istore          6
				l = i1;
	//   70  126:iload           6
	//   71  128:istore          5
				if(hasSupportDividerBeforeChildAt(j))
	//*  72  130:aload_0         
	//*  73  131:iload_3         
	//*  74  132:invokevirtual   #355 <Method boolean hasSupportDividerBeforeChildAt(int)>
	//*  75  135:ifeq            145
					l = i1 + l2;
	//   76  138:iload           6
	//   77  140:iload           10
	//   78  142:iadd            
	//   79  143:istore          5
				int j3 = view.getMeasuredHeight();
	//   80  145:aload           14
	//   81  147:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//   82  150:istore          12
				int k1;
				if(flag)
	//*  83  152:iload_1         
	//*  84  153:ifeq            178
				{
					k1 = getPaddingLeft() + layoutparams.leftMargin;
	//   85  156:aload_0         
	//   86  157:invokevirtual   #140 <Method int getPaddingLeft()>
	//   87  160:aload           15
	//   88  162:getfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//   89  165:iadd            
	//   90  166:istore          7
					i1 = k1 + l;
	//   91  168:iload           7
	//   92  170:iload           5
	//   93  172:iadd            
	//   94  173:istore          6
				} else
	//*  95  175:goto            202
				{
					i1 = getWidth() - getPaddingRight() - layoutparams.rightMargin;
	//   96  178:aload_0         
	//   97  179:invokevirtual   #358 <Method int getWidth()>
	//   98  182:aload_0         
	//   99  183:invokevirtual   #143 <Method int getPaddingRight()>
	//  100  186:isub            
	//  101  187:aload           15
	//  102  189:getfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  103  192:isub            
	//  104  193:istore          6
					k1 = i1 - l;
	//  105  195:iload           6
	//  106  197:iload           5
	//  107  199:isub            
	//  108  200:istore          7
				}
				int k3 = j2 - j3 / 2;
	//  109  202:iload           8
	//  110  204:iload           12
	//  111  206:iconst_2        
	//  112  207:idiv            
	//  113  208:isub            
	//  114  209:istore          13
				view.layout(k1, k3, i1, j3 + k3);
	//  115  211:aload           14
	//  116  213:iload           7
	//  117  215:iload           13
	//  118  217:iload           6
	//  119  219:iload           12
	//  120  221:iload           13
	//  121  223:iadd            
	//  122  224:invokevirtual   #361 <Method void View.layout(int, int, int, int)>
				i -= l;
	//  123  227:iload_2         
	//  124  228:iload           5
	//  125  230:isub            
	//  126  231:istore_2        
				l = 1;
	//  127  232:iconst_1        
	//  128  233:istore          5
			} else
	//* 129  235:goto            270
			{
				i -= view.getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin;
	//  130  238:iload_2         
	//  131  239:aload           14
	//  132  241:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//  133  244:aload           15
	//  134  246:getfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  135  249:iadd            
	//  136  250:aload           15
	//  137  252:getfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  138  255:iadd            
	//  139  256:isub            
	//  140  257:istore_2        
				hasSupportDividerBeforeChildAt(j);
	//  141  258:aload_0         
	//  142  259:iload_3         
	//  143  260:invokevirtual   #355 <Method boolean hasSupportDividerBeforeChildAt(int)>
	//  144  263:pop             
				k++;
	//  145  264:iload           4
	//  146  266:iconst_1        
	//  147  267:iadd            
	//  148  268:istore          4
			}
		}

	//  149  270:iload_3         
	//  150  271:iconst_1        
	//  151  272:iadd            
	//  152  273:istore_3        
	//* 153  274:goto            75
		if(k2 == 1 && l == 0)
	//* 154  277:iload           9
	//* 155  279:iconst_1        
	//* 156  280:icmpne          343
	//* 157  283:iload           5
	//* 158  285:ifne            343
		{
			View view1 = getChildAt(0);
	//  159  288:aload_0         
	//  160  289:iconst_0        
	//  161  290:invokevirtual   #163 <Method View getChildAt(int)>
	//  162  293:astore          14
			i = view1.getMeasuredWidth();
	//  163  295:aload           14
	//  164  297:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//  165  300:istore_2        
			j = view1.getMeasuredHeight();
	//  166  301:aload           14
	//  167  303:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//  168  306:istore_3        
			k = i3 / 2 - i / 2;
	//  169  307:iload           11
	//  170  309:iconst_2        
	//  171  310:idiv            
	//  172  311:iload_2         
	//  173  312:iconst_2        
	//  174  313:idiv            
	//  175  314:isub            
	//  176  315:istore          4
			l = j2 - j / 2;
	//  177  317:iload           8
	//  178  319:iload_3         
	//  179  320:iconst_2        
	//  180  321:idiv            
	//  181  322:isub            
	//  182  323:istore          5
			view1.layout(k, l, i + k, j + l);
	//  183  325:aload           14
	//  184  327:iload           4
	//  185  329:iload           5
	//  186  331:iload_2         
	//  187  332:iload           4
	//  188  334:iadd            
	//  189  335:iload_3         
	//  190  336:iload           5
	//  191  338:iadd            
	//  192  339:invokevirtual   #361 <Method void View.layout(int, int, int, int)>
			return;
	//  193  342:return          
		}
		j = k - (l ^ 1);
	//  194  343:iload           4
	//  195  345:iload           5
	//  196  347:iconst_1        
	//  197  348:ixor            
	//  198  349:isub            
	//  199  350:istore_3        
		if(j > 0)
	//* 200  351:iload_3         
	//* 201  352:ifle            362
			i /= j;
	//  202  355:iload_2         
	//  203  356:iload_3         
	//  204  357:idiv            
	//  205  358:istore_2        
		else
	//* 206  359:goto            364
			i = 0;
	//  207  362:iconst_0        
	//  208  363:istore_2        
		l = 0;
	//  209  364:iconst_0        
	//  210  365:istore          5
		k = 0;
	//  211  367:iconst_0        
	//  212  368:istore          4
		int j1 = Math.max(0, i);
	//  213  370:iconst_0        
	//  214  371:iload_2         
	//  215  372:invokestatic    #192 <Method int Math.max(int, int)>
	//  216  375:istore          6
		if(flag)
	//* 217  377:iload_1         
	//* 218  378:ifeq            517
		{
			j = getWidth() - getPaddingRight();
	//  219  381:aload_0         
	//  220  382:invokevirtual   #358 <Method int getWidth()>
	//  221  385:aload_0         
	//  222  386:invokevirtual   #143 <Method int getPaddingRight()>
	//  223  389:isub            
	//  224  390:istore_3        
			for(i = k; i < k2;)
	//* 225  391:iload           4
	//* 226  393:istore_2        
	//* 227  394:iload_2         
	//* 228  395:iload           9
	//* 229  397:icmpge          648
			{
				View view2 = getChildAt(i);
	//  230  400:aload_0         
	//  231  401:iload_2         
	//  232  402:invokevirtual   #163 <Method View getChildAt(int)>
	//  233  405:astore          14
				LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
	//  234  407:aload           14
	//  235  409:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  236  412:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  237  415:astore          15
				k = j;
	//  238  417:iload_3         
	//  239  418:istore          4
				if(view2.getVisibility() != 8)
	//* 240  420:aload           14
	//* 241  422:invokevirtual   #166 <Method int View.getVisibility()>
	//* 242  425:bipush          8
	//* 243  427:icmpeq          507
					if(layoutparams1.isOverflowButton)
	//* 244  430:aload           15
	//* 245  432:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 246  435:ifeq            444
					{
						k = j;
	//  247  438:iload_3         
	//  248  439:istore          4
					} else
	//* 249  441:goto            507
					{
						j -= layoutparams1.rightMargin;
	//  250  444:iload_3         
	//  251  445:aload           15
	//  252  447:getfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  253  450:isub            
	//  254  451:istore_3        
						k = view2.getMeasuredWidth();
	//  255  452:aload           14
	//  256  454:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//  257  457:istore          4
						l = view2.getMeasuredHeight();
	//  258  459:aload           14
	//  259  461:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//  260  464:istore          5
						int l1 = j2 - l / 2;
	//  261  466:iload           8
	//  262  468:iload           5
	//  263  470:iconst_2        
	//  264  471:idiv            
	//  265  472:isub            
	//  266  473:istore          7
						view2.layout(j - k, l1, j, l + l1);
	//  267  475:aload           14
	//  268  477:iload_3         
	//  269  478:iload           4
	//  270  480:isub            
	//  271  481:iload           7
	//  272  483:iload_3         
	//  273  484:iload           5
	//  274  486:iload           7
	//  275  488:iadd            
	//  276  489:invokevirtual   #361 <Method void View.layout(int, int, int, int)>
						k = j - (k + layoutparams1.leftMargin + j1);
	//  277  492:iload_3         
	//  278  493:iload           4
	//  279  495:aload           15
	//  280  497:getfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  281  500:iadd            
	//  282  501:iload           6
	//  283  503:iadd            
	//  284  504:isub            
	//  285  505:istore          4
					}
				i++;
	//  286  507:iload_2         
	//  287  508:iconst_1        
	//  288  509:iadd            
	//  289  510:istore_2        
				j = k;
	//  290  511:iload           4
	//  291  513:istore_3        
			}

		} else
	//* 292  514:goto            394
		{
			j = getPaddingLeft();
	//  293  517:aload_0         
	//  294  518:invokevirtual   #140 <Method int getPaddingLeft()>
	//  295  521:istore_3        
			for(i = l; i < k2;)
	//* 296  522:iload           5
	//* 297  524:istore_2        
	//* 298  525:iload_2         
	//* 299  526:iload           9
	//* 300  528:icmpge          648
			{
				View view3 = getChildAt(i);
	//  301  531:aload_0         
	//  302  532:iload_2         
	//  303  533:invokevirtual   #163 <Method View getChildAt(int)>
	//  304  536:astore          14
				LayoutParams layoutparams2 = (LayoutParams)view3.getLayoutParams();
	//  305  538:aload           14
	//  306  540:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  307  543:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  308  546:astore          15
				k = j;
	//  309  548:iload_3         
	//  310  549:istore          4
				if(view3.getVisibility() != 8)
	//* 311  551:aload           14
	//* 312  553:invokevirtual   #166 <Method int View.getVisibility()>
	//* 313  556:bipush          8
	//* 314  558:icmpeq          638
					if(layoutparams2.isOverflowButton)
	//* 315  561:aload           15
	//* 316  563:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 317  566:ifeq            575
					{
						k = j;
	//  318  569:iload_3         
	//  319  570:istore          4
					} else
	//* 320  572:goto            638
					{
						j += layoutparams2.leftMargin;
	//  321  575:iload_3         
	//  322  576:aload           15
	//  323  578:getfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  324  581:iadd            
	//  325  582:istore_3        
						k = view3.getMeasuredWidth();
	//  326  583:aload           14
	//  327  585:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//  328  588:istore          4
						l = view3.getMeasuredHeight();
	//  329  590:aload           14
	//  330  592:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//  331  595:istore          5
						int i2 = j2 - l / 2;
	//  332  597:iload           8
	//  333  599:iload           5
	//  334  601:iconst_2        
	//  335  602:idiv            
	//  336  603:isub            
	//  337  604:istore          7
						view3.layout(j, i2, j + k, l + i2);
	//  338  606:aload           14
	//  339  608:iload_3         
	//  340  609:iload           7
	//  341  611:iload_3         
	//  342  612:iload           4
	//  343  614:iadd            
	//  344  615:iload           5
	//  345  617:iload           7
	//  346  619:iadd            
	//  347  620:invokevirtual   #361 <Method void View.layout(int, int, int, int)>
						k = j + (k + layoutparams2.rightMargin + j1);
	//  348  623:iload_3         
	//  349  624:iload           4
	//  350  626:aload           15
	//  351  628:getfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  352  631:iadd            
	//  353  632:iload           6
	//  354  634:iadd            
	//  355  635:iadd            
	//  356  636:istore          4
					}
				i++;
	//  357  638:iload_2         
	//  358  639:iconst_1        
	//  359  640:iadd            
	//  360  641:istore_2        
				j = k;
	//  361  642:iload           4
	//  362  644:istore_3        
			}

		}
	//* 363  645:goto            525
	//  364  648:return          
	}

	protected void onMeasure(int i, int j)
	{
		boolean flag1 = mFormatItems;
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field boolean mFormatItems>
	//    2    4:istore          6
		boolean flag;
		if(android.view.View.MeasureSpec.getMode(i) == 0x40000000)
	//*   3    6:iload_1         
	//*   4    7:invokestatic    #107 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   5   10:ldc1            #136 <Int 0x40000000>
	//*   6   12:icmpne          21
			flag = true;
	//    7   15:iconst_1        
	//    8   16:istore          5
		else
	//*   9   18:goto            24
			flag = false;
	//   10   21:iconst_0        
	//   11   22:istore          5
		mFormatItems = flag;
	//   12   24:aload_0         
	//   13   25:iload           5
	//   14   27:putfield        #342 <Field boolean mFormatItems>
		if(flag1 != mFormatItems)
	//*  15   30:iload           6
	//*  16   32:aload_0         
	//*  17   33:getfield        #342 <Field boolean mFormatItems>
	//*  18   36:icmpeq          44
			mFormatItemsWidth = 0;
	//   19   39:aload_0         
	//   20   40:iconst_0        
	//   21   41:putfield        #364 <Field int mFormatItemsWidth>
		int k = android.view.View.MeasureSpec.getSize(i);
	//   22   44:iload_1         
	//   23   45:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   24   48:istore_3        
		if(mFormatItems)
	//*  25   49:aload_0         
	//*  26   50:getfield        #342 <Field boolean mFormatItems>
	//*  27   53:ifeq            86
		{
			MenuBuilder menubuilder = mMenu;
	//   28   56:aload_0         
	//   29   57:getfield        #257 <Field MenuBuilder mMenu>
	//   30   60:astore          7
			if(menubuilder != null && k != mFormatItemsWidth)
	//*  31   62:aload           7
	//*  32   64:ifnull          86
	//*  33   67:iload_3         
	//*  34   68:aload_0         
	//*  35   69:getfield        #364 <Field int mFormatItemsWidth>
	//*  36   72:icmpeq          86
			{
				mFormatItemsWidth = k;
	//   37   75:aload_0         
	//   38   76:iload_3         
	//   39   77:putfield        #364 <Field int mFormatItemsWidth>
				menubuilder.onItemsChanged(true);
	//   40   80:aload           7
	//   41   82:iconst_1        
	//   42   83:invokevirtual   #367 <Method void MenuBuilder.onItemsChanged(boolean)>
			}
		}
		int i1 = getChildCount();
	//   43   86:aload_0         
	//   44   87:invokevirtual   #159 <Method int getChildCount()>
	//   45   90:istore          4
		if(mFormatItems && i1 > 0)
	//*  46   92:aload_0         
	//*  47   93:getfield        #342 <Field boolean mFormatItems>
	//*  48   96:ifeq            111
	//*  49   99:iload           4
	//*  50  101:ifle            111
		{
			onMeasureExactFormat(i, j);
	//   51  104:aload_0         
	//   52  105:iload_1         
	//   53  106:iload_2         
	//   54  107:invokespecial   #369 <Method void onMeasureExactFormat(int, int)>
			return;
	//   55  110:return          
		}
		for(int l = 0; l < i1; l++)
	//*  56  111:iconst_0        
	//*  57  112:istore_3        
	//*  58  113:iload_3         
	//*  59  114:iload           4
	//*  60  116:icmpge          151
		{
			LayoutParams layoutparams = (LayoutParams)getChildAt(l).getLayoutParams();
	//   61  119:aload_0         
	//   62  120:iload_3         
	//   63  121:invokevirtual   #163 <Method View getChildAt(int)>
	//   64  124:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   65  127:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//   66  130:astore          7
			layoutparams.rightMargin = 0;
	//   67  132:aload           7
	//   68  134:iconst_0        
	//   69  135:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
			layoutparams.leftMargin = 0;
	//   70  138:aload           7
	//   71  140:iconst_0        
	//   72  141:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
		}

	//   73  144:iload_3         
	//   74  145:iconst_1        
	//   75  146:iadd            
	//   76  147:istore_3        
	//*  77  148:goto            113
		super.onMeasure(i, j);
	//   78  151:aload_0         
	//   79  152:iload_1         
	//   80  153:iload_2         
	//   81  154:invokespecial   #371 <Method void LinearLayoutCompat.onMeasure(int, int)>
	//   82  157:return          
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
		if(mPopupTheme != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field int mPopupTheme>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          42
		{
			mPopupTheme = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #90  <Field int mPopupTheme>
			if(i == 0)
	//*   7   13:iload_1         
	//*   8   14:ifne            26
			{
				mPopupContext = getContext();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #231 <Method Context getContext()>
	//   12   22:putfield        #88  <Field Context mPopupContext>
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
		}
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
	//    6   10:invokevirtual   #286 <Method void ActionMenuPresenter.setMenuView(ActionMenuView)>
	//    7   13:return          
	}

	public boolean showOverflowMenu()
	{
		ActionMenuPresenter actionmenupresenter = mPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    2    4:astore_1        
		return actionmenupresenter != null && actionmenupresenter.showOverflowMenu();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #333 <Method boolean ActionMenuPresenter.showOverflowMenu()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
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
