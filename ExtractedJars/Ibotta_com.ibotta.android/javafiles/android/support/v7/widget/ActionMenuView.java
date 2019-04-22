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

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #26  <Method void LinearLayoutCompat$LayoutParams(Context, AttributeSet)>
		//    4    6:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.view.ViewGroup.LayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #30  <Method void LinearLayoutCompat$LayoutParams(android.view.ViewGroup$LayoutParams)>
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
		//    2    2:invokespecial   #30  <Method void LinearLayoutCompat$LayoutParams(android.view.ViewGroup$LayoutParams)>
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
	//    3    3:invokespecial   #48  <Method void ActionMenuView(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActionMenuView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #50  <Method void LinearLayoutCompat(Context, AttributeSet)>
		setBaselineAligned(false);
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #54  <Method void setBaselineAligned(boolean)>
		float f = context.getResources().getDisplayMetrics().density;
	//    7   11:aload_1         
	//    8   12:invokevirtual   #60  <Method Resources Context.getResources()>
	//    9   15:invokevirtual   #66  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   10   18:getfield        #72  <Field float DisplayMetrics.density>
	//   11   21:fstore_3        
		mMinCellSize = (int)(56F * f);
	//   12   22:aload_0         
	//   13   23:ldc1            #73  <Float 56F>
	//   14   25:fload_3         
	//   15   26:fmul            
	//   16   27:f2i             
	//   17   28:putfield        #75  <Field int mMinCellSize>
		mGeneratedItemPadding = (int)(f * 4F);
	//   18   31:aload_0         
	//   19   32:fload_3         
	//   20   33:ldc1            #76  <Float 4F>
	//   21   35:fmul            
	//   22   36:f2i             
	//   23   37:putfield        #78  <Field int mGeneratedItemPadding>
		mPopupContext = context;
	//   24   40:aload_0         
	//   25   41:aload_1         
	//   26   42:putfield        #80  <Field Context mPopupContext>
		mPopupTheme = 0;
	//   27   45:aload_0         
	//   28   46:iconst_0        
	//   29   47:putfield        #82  <Field int mPopupTheme>
	//   30   50:return          
	}

	static int measureChildForCells(View view, int i, int j, int k, int l)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//    3    7:astore          10
		int j1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(k) - l, android.view.View.MeasureSpec.getMode(k));
	//    4    9:iload_3         
	//    5   10:invokestatic    #96  <Method int android.view.View$MeasureSpec.getSize(int)>
	//    6   13:iload           4
	//    7   15:isub            
	//    8   16:iload_3         
	//    9   17:invokestatic    #99  <Method int android.view.View$MeasureSpec.getMode(int)>
	//   10   20:invokestatic    #103 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   11   23:istore          6
		ActionMenuItemView actionmenuitemview;
		if(view instanceof ActionMenuItemView)
	//*  12   25:aload_0         
	//*  13   26:instanceof      #105 <Class ActionMenuItemView>
	//*  14   29:ifeq            41
			actionmenuitemview = (ActionMenuItemView)view;
	//   15   32:aload_0         
	//   16   33:checkcast       #105 <Class ActionMenuItemView>
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
	//*  26   54:invokevirtual   #109 <Method boolean ActionMenuItemView.hasText()>
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
	//   46   87:ldc1            #110 <Int 0x80000000>
	//   47   89:invokestatic    #103 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   48   92:iload           6
	//   49   94:invokevirtual   #114 <Method void View.measure(int, int)>
			int k1 = view.getMeasuredWidth();
	//   50   97:aload_0         
	//   51   98:invokevirtual   #118 <Method int View.getMeasuredWidth()>
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
	//*  79  146:getfield        #121 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
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
	//   88  166:putfield        #124 <Field boolean ActionMenuView$LayoutParams.expandable>
		layoutparams.cellsUsed = j;
	//   89  169:aload           10
	//   90  171:iload_2         
	//   91  172:putfield        #127 <Field int ActionMenuView$LayoutParams.cellsUsed>
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i * j, 0x40000000), j1);
	//   92  175:aload_0         
	//   93  176:iload_1         
	//   94  177:iload_2         
	//   95  178:imul            
	//   96  179:ldc1            #128 <Int 0x40000000>
	//   97  181:invokestatic    #103 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   98  184:iload           6
	//   99  186:invokevirtual   #114 <Method void View.measure(int, int)>
		return j;
	//  100  189:iload_2         
	//  101  190:ireturn         
	}

	private void onMeasureExactFormat(int i, int j)
	{
		int j3 = android.view.View.MeasureSpec.getMode(j);
	//    0    0:iload_2         
	//    1    1:invokestatic    #99  <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          12
		i = android.view.View.MeasureSpec.getSize(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #96  <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore_1        
		int k = android.view.View.MeasureSpec.getSize(j);
	//    6   11:iload_2         
	//    7   12:invokestatic    #96  <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   15:istore          5
		int l = getPaddingLeft();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #132 <Method int getPaddingLeft()>
	//   11   21:istore          6
		int i1 = getPaddingRight();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #135 <Method int getPaddingRight()>
	//   14   27:istore          7
		int k3 = getPaddingTop() + getPaddingBottom();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #138 <Method int getPaddingTop()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #141 <Method int getPaddingBottom()>
	//   19   37:iadd            
	//   20   38:istore          13
		int l5 = getChildMeasureSpec(j, k3, -2);
	//   21   40:iload_2         
	//   22   41:iload           13
	//   23   43:bipush          -2
	//   24   45:invokestatic    #145 <Method int getChildMeasureSpec(int, int, int)>
	//   25   48:istore          19
		int j4 = i - (l + i1);
	//   26   50:iload_1         
	//   27   51:iload           6
	//   28   53:iload           7
	//   29   55:iadd            
	//   30   56:isub            
	//   31   57:istore          15
		j = mMinCellSize;
	//   32   59:aload_0         
	//   33   60:getfield        #75  <Field int mMinCellSize>
	//   34   63:istore_2        
		i = j4 / j;
	//   35   64:iload           15
	//   36   66:iload_2         
	//   37   67:idiv            
	//   38   68:istore_1        
		if(i == 0)
	//*  39   69:iload_1         
	//*  40   70:ifne            81
		{
			setMeasuredDimension(j4, 0);
	//   41   73:aload_0         
	//   42   74:iload           15
	//   43   76:iconst_0        
	//   44   77:invokevirtual   #148 <Method void setMeasuredDimension(int, int)>
			return;
	//   45   80:return          
		}
		int i6 = j + (j4 % j) / i;
	//   46   81:iload_2         
	//   47   82:iload           15
	//   48   84:iload_2         
	//   49   85:irem            
	//   50   86:iload_1         
	//   51   87:idiv            
	//   52   88:iadd            
	//   53   89:istore          20
		int j6 = getChildCount();
	//   54   91:aload_0         
	//   55   92:invokevirtual   #151 <Method int getChildCount()>
	//   56   95:istore          21
		int k2 = 0;
	//   57   97:iconst_0        
	//   58   98:istore          9
		j = 0;
	//   59  100:iconst_0        
	//   60  101:istore_2        
		boolean flag = false;
	//   61  102:iconst_0        
	//   62  103:istore          6
		int i3 = 0;
	//   63  105:iconst_0        
	//   64  106:istore          11
		int l2 = 0;
	//   65  108:iconst_0        
	//   66  109:istore          10
		i1 = 0;
	//   67  111:iconst_0        
	//   68  112:istore          7
		long l6 = 0L;
	//   69  114:lconst_0        
	//   70  115:lstore          22
		for(; k2 < j6; k2++)
	//*  71  117:iload           9
	//*  72  119:iload           21
	//*  73  121:icmpge          378
		{
			View view = getChildAt(k2);
	//   74  124:aload_0         
	//   75  125:iload           9
	//   76  127:invokevirtual   #155 <Method View getChildAt(int)>
	//   77  130:astore          31
			if(view.getVisibility() == 8)
	//*  78  132:aload           31
	//*  79  134:invokevirtual   #158 <Method int View.getVisibility()>
	//*  80  137:bipush          8
	//*  81  139:icmpne          145
				continue;
	//   82  142:goto            369
			boolean flag1 = view instanceof ActionMenuItemView;
	//   83  145:aload           31
	//   84  147:instanceof      #105 <Class ActionMenuItemView>
	//   85  150:istore          30
			i3++;
	//   86  152:iload           11
	//   87  154:iconst_1        
	//   88  155:iadd            
	//   89  156:istore          11
			if(flag1)
	//*  90  158:iload           30
	//*  91  160:ifeq            183
			{
				int k1 = mGeneratedItemPadding;
	//   92  163:aload_0         
	//   93  164:getfield        #78  <Field int mGeneratedItemPadding>
	//   94  167:istore          8
				view.setPadding(k1, 0, k1, 0);
	//   95  169:aload           31
	//   96  171:iload           8
	//   97  173:iconst_0        
	//   98  174:iload           8
	//   99  176:iconst_0        
	//  100  177:invokevirtual   #162 <Method void View.setPadding(int, int, int, int)>
			}
	//* 101  180:goto            183
			LayoutParams layoutparams1 = (LayoutParams)view.getLayoutParams();
	//  102  183:aload           31
	//  103  185:invokevirtual   #90  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  104  188:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  105  191:astore          32
			layoutparams1.expanded = false;
	//  106  193:aload           32
	//  107  195:iconst_0        
	//  108  196:putfield        #165 <Field boolean ActionMenuView$LayoutParams.expanded>
			layoutparams1.extraPixels = 0;
	//  109  199:aload           32
	//  110  201:iconst_0        
	//  111  202:putfield        #168 <Field int ActionMenuView$LayoutParams.extraPixels>
			layoutparams1.cellsUsed = 0;
	//  112  205:aload           32
	//  113  207:iconst_0        
	//  114  208:putfield        #127 <Field int ActionMenuView$LayoutParams.cellsUsed>
			layoutparams1.expandable = false;
	//  115  211:aload           32
	//  116  213:iconst_0        
	//  117  214:putfield        #124 <Field boolean ActionMenuView$LayoutParams.expandable>
			layoutparams1.leftMargin = 0;
	//  118  217:aload           32
	//  119  219:iconst_0        
	//  120  220:putfield        #171 <Field int ActionMenuView$LayoutParams.leftMargin>
			layoutparams1.rightMargin = 0;
	//  121  223:aload           32
	//  122  225:iconst_0        
	//  123  226:putfield        #174 <Field int ActionMenuView$LayoutParams.rightMargin>
			if(flag1 && ((ActionMenuItemView)view).hasText())
	//* 124  229:iload           30
	//* 125  231:ifeq            251
	//* 126  234:aload           31
	//* 127  236:checkcast       #105 <Class ActionMenuItemView>
	//* 128  239:invokevirtual   #109 <Method boolean ActionMenuItemView.hasText()>
	//* 129  242:ifeq            251
				flag1 = true;
	//  130  245:iconst_1        
	//  131  246:istore          30
			else
	//* 132  248:goto            254
				flag1 = false;
	//  133  251:iconst_0        
	//  134  252:istore          30
			layoutparams1.preventEdgeOffset = flag1;
	//  135  254:aload           32
	//  136  256:iload           30
	//  137  258:putfield        #177 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
			int l1;
			if(layoutparams1.isOverflowButton)
	//* 138  261:aload           32
	//* 139  263:getfield        #121 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 140  266:ifeq            275
				l1 = 1;
	//  141  269:iconst_1        
	//  142  270:istore          8
			else
	//* 143  272:goto            278
				l1 = i;
	//  144  275:iload_1         
	//  145  276:istore          8
			int l3 = measureChildForCells(view, i6, l1, l5, k3);
	//  146  278:aload           31
	//  147  280:iload           20
	//  148  282:iload           8
	//  149  284:iload           19
	//  150  286:iload           13
	//  151  288:invokestatic    #179 <Method int measureChildForCells(View, int, int, int, int)>
	//  152  291:istore          14
			l2 = Math.max(l2, l3);
	//  153  293:iload           10
	//  154  295:iload           14
	//  155  297:invokestatic    #184 <Method int Math.max(int, int)>
	//  156  300:istore          10
			l1 = i1;
	//  157  302:iload           7
	//  158  304:istore          8
			if(layoutparams1.expandable)
	//* 159  306:aload           32
	//* 160  308:getfield        #124 <Field boolean ActionMenuView$LayoutParams.expandable>
	//* 161  311:ifeq            320
				l1 = i1 + 1;
	//  162  314:iload           7
	//  163  316:iconst_1        
	//  164  317:iadd            
	//  165  318:istore          8
			if(layoutparams1.isOverflowButton)
	//* 166  320:aload           32
	//* 167  322:getfield        #121 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 168  325:ifeq            331
				flag = true;
	//  169  328:iconst_1        
	//  170  329:istore          6
			i -= l3;
	//  171  331:iload_1         
	//  172  332:iload           14
	//  173  334:isub            
	//  174  335:istore_1        
			j = Math.max(j, view.getMeasuredHeight());
	//  175  336:iload_2         
	//  176  337:aload           31
	//  177  339:invokevirtual   #187 <Method int View.getMeasuredHeight()>
	//  178  342:invokestatic    #184 <Method int Math.max(int, int)>
	//  179  345:istore_2        
			if(l3 == 1)
	//* 180  346:iload           14
	//* 181  348:iconst_1        
	//* 182  349:icmpne          365
				l6 |= 1 << k2;
	//  183  352:lload           22
	//  184  354:iconst_1        
	//  185  355:iload           9
	//  186  357:ishl            
	//  187  358:i2l             
	//  188  359:lor             
	//  189  360:lstore          22
	//* 190  362:goto            365
			i1 = l1;
	//  191  365:iload           8
	//  192  367:istore          7
		}

	//  193  369:iload           9
	//  194  371:iconst_1        
	//  195  372:iadd            
	//  196  373:istore          9
	//* 197  375:goto            117
		if(flag && i3 == 2)
	//* 198  378:iload           6
	//* 199  380:ifeq            395
	//* 200  383:iload           11
	//* 201  385:iconst_2        
	//* 202  386:icmpne          395
			k3 = 1;
	//  203  389:iconst_1        
	//  204  390:istore          13
		else
	//* 205  392:goto            398
			k3 = 0;
	//  206  395:iconst_0        
	//  207  396:istore          13
		int i2 = 0;
	//  208  398:iconst_0        
	//  209  399:istore          8
		int i4 = i;
	//  210  401:iload_1         
	//  211  402:istore          14
		i = i2;
	//  212  404:iload           8
	//  213  406:istore_1        
		i2 = j4;
	//  214  407:iload           15
	//  215  409:istore          8
		do
		{
			if(i1 <= 0 || i4 <= 0)
				break;
	//  216  411:iload           7
	//  217  413:ifle            743
	//  218  416:iload           14
	//  219  418:ifle            743
			int k4 = 0x7fffffff;
	//  220  421:ldc1            #188 <Int 0x7fffffff>
	//  221  423:istore          15
			int i5 = 0;
	//  222  425:iconst_0        
	//  223  426:istore          16
			int j5 = 0;
	//  224  428:iconst_0        
	//  225  429:istore          17
			long l7;
			long l9;
			for(l9 = 0L; i5 < j6; l9 = l7)
	//* 226  431:lconst_0        
	//* 227  432:lstore          26
	//* 228  434:iload           16
	//* 229  436:iload           21
	//* 230  438:icmpge          569
			{
				LayoutParams layoutparams = (LayoutParams)getChildAt(i5).getLayoutParams();
	//  231  441:aload_0         
	//  232  442:iload           16
	//  233  444:invokevirtual   #155 <Method View getChildAt(int)>
	//  234  447:invokevirtual   #90  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  235  450:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  236  453:astore          31
				int k5;
				if(!layoutparams.expandable)
	//* 237  455:aload           31
	//* 238  457:getfield        #124 <Field boolean ActionMenuView$LayoutParams.expandable>
	//* 239  460:ifne            478
				{
					k5 = k4;
	//  240  463:iload           15
	//  241  465:istore          18
					k2 = j5;
	//  242  467:iload           17
	//  243  469:istore          9
					l7 = l9;
	//  244  471:lload           26
	//  245  473:lstore          24
				} else
	//* 246  475:goto            548
				if(layoutparams.cellsUsed < k4)
	//* 247  478:aload           31
	//* 248  480:getfield        #127 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 249  483:iload           15
	//* 250  485:icmpge          507
				{
					k5 = layoutparams.cellsUsed;
	//  251  488:aload           31
	//  252  490:getfield        #127 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//  253  493:istore          18
					l7 = 1L << i5;
	//  254  495:lconst_1        
	//  255  496:iload           16
	//  256  498:lshl            
	//  257  499:lstore          24
					k2 = 1;
	//  258  501:iconst_1        
	//  259  502:istore          9
				} else
	//* 260  504:goto            548
				{
					k5 = k4;
	//  261  507:iload           15
	//  262  509:istore          18
					k2 = j5;
	//  263  511:iload           17
	//  264  513:istore          9
					l7 = l9;
	//  265  515:lload           26
	//  266  517:lstore          24
					if(layoutparams.cellsUsed == k4)
	//* 267  519:aload           31
	//* 268  521:getfield        #127 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 269  524:iload           15
	//* 270  526:icmpne          548
					{
						l7 = l9 | 1L << i5;
	//  271  529:lload           26
	//  272  531:lconst_1        
	//  273  532:iload           16
	//  274  534:lshl            
	//  275  535:lor             
	//  276  536:lstore          24
						k2 = j5 + 1;
	//  277  538:iload           17
	//  278  540:iconst_1        
	//  279  541:iadd            
	//  280  542:istore          9
						k5 = k4;
	//  281  544:iload           15
	//  282  546:istore          18
					}
				}
				i5++;
	//  283  548:iload           16
	//  284  550:iconst_1        
	//  285  551:iadd            
	//  286  552:istore          16
				k4 = k5;
	//  287  554:iload           18
	//  288  556:istore          15
				j5 = k2;
	//  289  558:iload           9
	//  290  560:istore          17
			}

	//  291  562:lload           24
	//  292  564:lstore          26
	//* 293  566:goto            434
			l6 |= l9;
	//  294  569:lload           22
	//  295  571:lload           26
	//  296  573:lor             
	//  297  574:lstore          22
			if(j5 > i4)
	//* 298  576:iload           17
	//* 299  578:iload           14
	//* 300  580:icmple          586
				break;
	//  301  583:goto            743
			i = k4 + 1;
	//  302  586:iload           15
	//  303  588:iconst_1        
	//  304  589:iadd            
	//  305  590:istore_1        
			for(k2 = 0; k2 < j6; k2++)
	//* 306  591:iconst_0        
	//* 307  592:istore          9
	//* 308  594:iload           9
	//* 309  596:iload           21
	//* 310  598:icmpge          738
			{
				View view1 = getChildAt(k2);
	//  311  601:aload_0         
	//  312  602:iload           9
	//  313  604:invokevirtual   #155 <Method View getChildAt(int)>
	//  314  607:astore          31
				LayoutParams layoutparams2 = (LayoutParams)view1.getLayoutParams();
	//  315  609:aload           31
	//  316  611:invokevirtual   #90  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  317  614:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  318  617:astore          32
				long l10 = 1 << k2;
	//  319  619:iconst_1        
	//  320  620:iload           9
	//  321  622:ishl            
	//  322  623:i2l             
	//  323  624:lstore          28
				if((l9 & l10) == 0L)
	//* 324  626:lload           26
	//* 325  628:lload           28
	//* 326  630:land            
	//* 327  631:lconst_0        
	//* 328  632:lcmp            
	//* 329  633:ifne            663
				{
					long l8 = l6;
	//  330  636:lload           22
	//  331  638:lstore          24
					if(layoutparams2.cellsUsed == i)
	//* 332  640:aload           32
	//* 333  642:getfield        #127 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 334  645:iload_1         
	//* 335  646:icmpne          656
						l8 = l6 | l10;
	//  336  649:lload           22
	//  337  651:lload           28
	//  338  653:lor             
	//  339  654:lstore          24
					l6 = l8;
	//  340  656:lload           24
	//  341  658:lstore          22
					continue;
	//  342  660:goto            729
				}
				if(k3 && layoutparams2.preventEdgeOffset && i4 == 1)
	//* 343  663:iload           13
	//* 344  665:ifeq            705
	//* 345  668:aload           32
	//* 346  670:getfield        #177 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 347  673:ifeq            705
	//* 348  676:iload           14
	//* 349  678:iconst_1        
	//* 350  679:icmpne          705
				{
					int l4 = mGeneratedItemPadding;
	//  351  682:aload_0         
	//  352  683:getfield        #78  <Field int mGeneratedItemPadding>
	//  353  686:istore          15
					view1.setPadding(l4 + i6, 0, l4, 0);
	//  354  688:aload           31
	//  355  690:iload           15
	//  356  692:iload           20
	//  357  694:iadd            
	//  358  695:iconst_0        
	//  359  696:iload           15
	//  360  698:iconst_0        
	//  361  699:invokevirtual   #162 <Method void View.setPadding(int, int, int, int)>
				}
	//* 362  702:goto            705
				layoutparams2.cellsUsed = layoutparams2.cellsUsed + 1;
	//  363  705:aload           32
	//  364  707:aload           32
	//  365  709:getfield        #127 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//  366  712:iconst_1        
	//  367  713:iadd            
	//  368  714:putfield        #127 <Field int ActionMenuView$LayoutParams.cellsUsed>
				layoutparams2.expanded = true;
	//  369  717:aload           32
	//  370  719:iconst_1        
	//  371  720:putfield        #165 <Field boolean ActionMenuView$LayoutParams.expanded>
				i4--;
	//  372  723:iload           14
	//  373  725:iconst_1        
	//  374  726:isub            
	//  375  727:istore          14
			}

	//  376  729:iload           9
	//  377  731:iconst_1        
	//  378  732:iadd            
	//  379  733:istore          9
	//* 380  735:goto            594
			i = 1;
	//  381  738:iconst_1        
	//  382  739:istore_1        
		} while(true);
	//  383  740:goto            411
		k2 = i2;
	//  384  743:iload           8
	//  385  745:istore          9
		if(!flag && i3 == 1)
	//* 386  747:iload           6
	//* 387  749:ifne            764
	//* 388  752:iload           11
	//* 389  754:iconst_1        
	//* 390  755:icmpne          764
			flag = true;
	//  391  758:iconst_1        
	//  392  759:istore          6
		else
	//* 393  761:goto            767
			flag = false;
	//  394  764:iconst_0        
	//  395  765:istore          6
		if(i4 > 0 && l6 != 0L && (i4 < i3 - 1 || flag || l2 > 1))
	//* 396  767:iload           14
	//* 397  769:ifle            1120
	//* 398  772:lload           22
	//* 399  774:lconst_0        
	//* 400  775:lcmp            
	//* 401  776:ifeq            1120
	//* 402  779:iload           14
	//* 403  781:iload           11
	//* 404  783:iconst_1        
	//* 405  784:isub            
	//* 406  785:icmplt          799
	//* 407  788:iload           6
	//* 408  790:ifne            799
	//* 409  793:iload           10
	//* 410  795:iconst_1        
	//* 411  796:icmple          1120
		{
			float f1 = Long.bitCount(l6);
	//  412  799:lload           22
	//  413  801:invokestatic    #194 <Method int Long.bitCount(long)>
	//  414  804:i2f             
	//  415  805:fstore          4
			if(!flag)
	//* 416  807:iload           6
	//* 417  809:ifne            905
			{
				float f;
				if((l6 & 1L) != 0L)
	//* 418  812:lload           22
	//* 419  814:lconst_1        
	//* 420  815:land            
	//* 421  816:lconst_0        
	//* 422  817:lcmp            
	//* 423  818:ifeq            850
				{
					f = f1;
	//  424  821:fload           4
	//  425  823:fstore_3        
					if(!((LayoutParams)getChildAt(0).getLayoutParams()).preventEdgeOffset)
	//* 426  824:aload_0         
	//* 427  825:iconst_0        
	//* 428  826:invokevirtual   #155 <Method View getChildAt(int)>
	//* 429  829:invokevirtual   #90  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 430  832:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 431  835:getfield        #177 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 432  838:ifne            853
						f = f1 - 0.5F;
	//  433  841:fload           4
	//  434  843:ldc1            #195 <Float 0.5F>
	//  435  845:fsub            
	//  436  846:fstore_3        
				} else
	//* 437  847:goto            853
				{
					f = f1;
	//  438  850:fload           4
	//  439  852:fstore_3        
				}
				flag = ((boolean) (j6 - 1));
	//  440  853:iload           21
	//  441  855:iconst_1        
	//  442  856:isub            
	//  443  857:istore          6
				f1 = f;
	//  444  859:fload_3         
	//  445  860:fstore          4
				if((l6 & (long)(1 << flag)) != 0L)
	//* 446  862:lload           22
	//* 447  864:iconst_1        
	//* 448  865:iload           6
	//* 449  867:ishl            
	//* 450  868:i2l             
	//* 451  869:land            
	//* 452  870:lconst_0        
	//* 453  871:lcmp            
	//* 454  872:ifeq            905
				{
					f1 = f;
	//  455  875:fload_3         
	//  456  876:fstore          4
					if(!((LayoutParams)getChildAt(((int) (flag))).getLayoutParams()).preventEdgeOffset)
	//* 457  878:aload_0         
	//* 458  879:iload           6
	//* 459  881:invokevirtual   #155 <Method View getChildAt(int)>
	//* 460  884:invokevirtual   #90  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 461  887:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 462  890:getfield        #177 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 463  893:ifne            905
						f1 = f - 0.5F;
	//  464  896:fload_3         
	//  465  897:ldc1            #195 <Float 0.5F>
	//  466  899:fsub            
	//  467  900:fstore          4
				}
			}
	//* 468  902:goto            905
			int j1;
			if(f1 > 0.0F)
	//* 469  905:fload           4
	//* 470  907:fconst_0        
	//* 471  908:fcmpl           
	//* 472  909:ifle            927
				j1 = (int)((float)(i4 * i6) / f1);
	//  473  912:iload           14
	//  474  914:iload           20
	//  475  916:imul            
	//  476  917:i2f             
	//  477  918:fload           4
	//  478  920:fdiv            
	//  479  921:f2i             
	//  480  922:istore          7
			else
	//* 481  924:goto            930
				j1 = 0;
	//  482  927:iconst_0        
	//  483  928:istore          7
			int j2 = 0;
	//  484  930:iconst_0        
	//  485  931:istore          8
			do
			{
				flag = ((boolean) (i));
	//  486  933:iload_1         
	//  487  934:istore          6
				if(j2 >= j6)
					break;
	//  488  936:iload           8
	//  489  938:iload           21
	//  490  940:icmpge          1123
				if((l6 & (long)(1 << j2)) == 0L)
	//* 491  943:lload           22
	//* 492  945:iconst_1        
	//* 493  946:iload           8
	//* 494  948:ishl            
	//* 495  949:i2l             
	//* 496  950:land            
	//* 497  951:lconst_0        
	//* 498  952:lcmp            
	//* 499  953:ifne            962
				{
					flag = ((boolean) (i));
	//  500  956:iload_1         
	//  501  957:istore          6
				} else
	//* 502  959:goto            1108
				{
					View view2 = getChildAt(j2);
	//  503  962:aload_0         
	//  504  963:iload           8
	//  505  965:invokevirtual   #155 <Method View getChildAt(int)>
	//  506  968:astore          31
					LayoutParams layoutparams3 = (LayoutParams)view2.getLayoutParams();
	//  507  970:aload           31
	//  508  972:invokevirtual   #90  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  509  975:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  510  978:astore          32
					if(view2 instanceof ActionMenuItemView)
	//* 511  980:aload           31
	//* 512  982:instanceof      #105 <Class ActionMenuItemView>
	//* 513  985:ifeq            1033
					{
						layoutparams3.extraPixels = j1;
	//  514  988:aload           32
	//  515  990:iload           7
	//  516  992:putfield        #168 <Field int ActionMenuView$LayoutParams.extraPixels>
						layoutparams3.expanded = true;
	//  517  995:aload           32
	//  518  997:iconst_1        
	//  519  998:putfield        #165 <Field boolean ActionMenuView$LayoutParams.expanded>
						if(j2 == 0 && !layoutparams3.preventEdgeOffset)
	//* 520 1001:iload           8
	//* 521 1003:ifne            1027
	//* 522 1006:aload           32
	//* 523 1008:getfield        #177 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 524 1011:ifne            1027
							layoutparams3.leftMargin = -j1 / 2;
	//  525 1014:aload           32
	//  526 1016:iload           7
	//  527 1018:ineg            
	//  528 1019:iconst_2        
	//  529 1020:idiv            
	//  530 1021:putfield        #171 <Field int ActionMenuView$LayoutParams.leftMargin>
	//* 531 1024:goto            1027
						flag = true;
	//  532 1027:iconst_1        
	//  533 1028:istore          6
					} else
	//* 534 1030:goto            1108
					if(layoutparams3.isOverflowButton)
	//* 535 1033:aload           32
	//* 536 1035:getfield        #121 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 537 1038:ifeq            1070
					{
						layoutparams3.extraPixels = j1;
	//  538 1041:aload           32
	//  539 1043:iload           7
	//  540 1045:putfield        #168 <Field int ActionMenuView$LayoutParams.extraPixels>
						layoutparams3.expanded = true;
	//  541 1048:aload           32
	//  542 1050:iconst_1        
	//  543 1051:putfield        #165 <Field boolean ActionMenuView$LayoutParams.expanded>
						layoutparams3.rightMargin = -j1 / 2;
	//  544 1054:aload           32
	//  545 1056:iload           7
	//  546 1058:ineg            
	//  547 1059:iconst_2        
	//  548 1060:idiv            
	//  549 1061:putfield        #174 <Field int ActionMenuView$LayoutParams.rightMargin>
						flag = true;
	//  550 1064:iconst_1        
	//  551 1065:istore          6
					} else
	//* 552 1067:goto            1108
					{
						if(j2 != 0)
	//* 553 1070:iload           8
	//* 554 1072:ifeq            1084
							layoutparams3.leftMargin = j1 / 2;
	//  555 1075:aload           32
	//  556 1077:iload           7
	//  557 1079:iconst_2        
	//  558 1080:idiv            
	//  559 1081:putfield        #171 <Field int ActionMenuView$LayoutParams.leftMargin>
						flag = ((boolean) (i));
	//  560 1084:iload_1         
	//  561 1085:istore          6
						if(j2 != j6 - 1)
	//* 562 1087:iload           8
	//* 563 1089:iload           21
	//* 564 1091:iconst_1        
	//* 565 1092:isub            
	//* 566 1093:icmpeq          1108
						{
							layoutparams3.rightMargin = j1 / 2;
	//  567 1096:aload           32
	//  568 1098:iload           7
	//  569 1100:iconst_2        
	//  570 1101:idiv            
	//  571 1102:putfield        #174 <Field int ActionMenuView$LayoutParams.rightMargin>
							flag = ((boolean) (i));
	//  572 1105:iload_1         
	//  573 1106:istore          6
						}
					}
				}
				j2++;
	//  574 1108:iload           8
	//  575 1110:iconst_1        
	//  576 1111:iadd            
	//  577 1112:istore          8
				i = ((int) (flag));
	//  578 1114:iload           6
	//  579 1116:istore_1        
			} while(true);
	//  580 1117:goto            933
		} else
		{
			flag = ((boolean) (i));
	//  581 1120:iload_1         
	//  582 1121:istore          6
		}
		i = 0;
	//  583 1123:iconst_0        
	//  584 1124:istore_1        
		if(flag != 0)
	//* 585 1125:iload           6
	//* 586 1127:ifeq            1197
			for(; i < j6; i++)
	//* 587 1130:iload_1         
	//* 588 1131:iload           21
	//* 589 1133:icmpge          1197
			{
				View view3 = getChildAt(i);
	//  590 1136:aload_0         
	//  591 1137:iload_1         
	//  592 1138:invokevirtual   #155 <Method View getChildAt(int)>
	//  593 1141:astore          31
				LayoutParams layoutparams4 = (LayoutParams)view3.getLayoutParams();
	//  594 1143:aload           31
	//  595 1145:invokevirtual   #90  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  596 1148:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  597 1151:astore          32
				if(layoutparams4.expanded)
	//* 598 1153:aload           32
	//* 599 1155:getfield        #165 <Field boolean ActionMenuView$LayoutParams.expanded>
	//* 600 1158:ifne            1164
	//* 601 1161:goto            1190
					view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams4.cellsUsed * i6 + layoutparams4.extraPixels, 0x40000000), l5);
	//  602 1164:aload           31
	//  603 1166:aload           32
	//  604 1168:getfield        #127 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//  605 1171:iload           20
	//  606 1173:imul            
	//  607 1174:aload           32
	//  608 1176:getfield        #168 <Field int ActionMenuView$LayoutParams.extraPixels>
	//  609 1179:iadd            
	//  610 1180:ldc1            #128 <Int 0x40000000>
	//  611 1182:invokestatic    #103 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  612 1185:iload           19
	//  613 1187:invokevirtual   #114 <Method void View.measure(int, int)>
			}

	//  614 1190:iload_1         
	//  615 1191:iconst_1        
	//  616 1192:iadd            
	//  617 1193:istore_1        
	//* 618 1194:goto            1130
		if(j3 == 0x40000000)
	//* 619 1197:iload           12
	//* 620 1199:ldc1            #128 <Int 0x40000000>
	//* 621 1201:icmpeq          1207
	//* 622 1204:goto            1210
			j = k;
	//  623 1207:iload           5
	//  624 1209:istore_2        
		setMeasuredDimension(k2, j);
	//  625 1210:aload_0         
	//  626 1211:iload           9
	//  627 1213:iload_2         
	//  628 1214:invokevirtual   #148 <Method void setMeasuredDimension(int, int)>
	//  629 1217:return          
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
	//    1    1:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//    2    4:astore_1        
		if(actionmenupresenter != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			actionmenupresenter.dismissPopupMenus();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #205 <Method boolean ActionMenuPresenter.dismissPopupMenus()>
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
	//    4    8:invokespecial   #211 <Method void ActionMenuView$LayoutParams(int, int)>
	//    5   11:astore_1        
		layoutparams.gravity = 16;
	//    6   12:aload_1         
	//    7   13:bipush          16
	//    8   15:putfield        #214 <Field int ActionMenuView$LayoutParams.gravity>
		return layoutparams;
	//    9   18:aload_1         
	//   10   19:areturn         
	}

	protected volatile LinearLayoutCompat.LayoutParams generateDefaultLayoutParams()
	{
		return ((LinearLayoutCompat.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method ActionMenuView$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method ActionMenuView$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #16  <Class ActionMenuView$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #223 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #224 <Method void ActionMenuView$LayoutParams(Context, AttributeSet)>
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
	//    9   19:invokespecial   #228 <Method void ActionMenuView$LayoutParams(ActionMenuView$LayoutParams)>
	//   10   22:astore_1        
			else
	//*  11   23:goto            35
				layoutparams = ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//   12   26:new             #16  <Class ActionMenuView$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:invokespecial   #231 <Method void ActionMenuView$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   16   34:astore_1        
			if(((LayoutParams) (layoutparams)).gravity <= 0)
	//*  17   35:aload_1         
	//*  18   36:getfield        #214 <Field int ActionMenuView$LayoutParams.gravity>
	//*  19   39:ifgt            48
				layoutparams.gravity = 16;
	//   20   42:aload_1         
	//   21   43:bipush          16
	//   22   45:putfield        #214 <Field int ActionMenuView$LayoutParams.gravity>
			return ((LayoutParams) (layoutparams));
	//   23   48:aload_1         
	//   24   49:areturn         
		} else
		{
			return generateDefaultLayoutParams();
	//   25   50:aload_0         
	//   26   51:invokevirtual   #217 <Method ActionMenuView$LayoutParams generateDefaultLayoutParams()>
	//   27   54:areturn         
		}
	}

	public volatile LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((LinearLayoutCompat.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #234 <Method ActionMenuView$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile LinearLayoutCompat.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((LinearLayoutCompat.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #237 <Method ActionMenuView$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #234 <Method ActionMenuView$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #237 <Method ActionMenuView$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public LayoutParams generateOverflowButtonLayoutParams()
	{
		LayoutParams layoutparams = generateDefaultLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method ActionMenuView$LayoutParams generateDefaultLayoutParams()>
	//    2    4:astore_1        
		layoutparams.isOverflowButton = true;
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:putfield        #121 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
		return layoutparams;
	//    6   10:aload_1         
	//    7   11:areturn         
	}

	public Menu getMenu()
	{
		if(mMenu == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #249 <Field MenuBuilder mMenu>
	//*   2    4:ifnonnull       112
		{
			Object obj = ((Object) (getContext()));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #223 <Method Context getContext()>
	//    5   11:astore_1        
			mMenu = new MenuBuilder(((Context) (obj)));
	//    6   12:aload_0         
	//    7   13:new             #251 <Class MenuBuilder>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #253 <Method void MenuBuilder(Context)>
	//   11   21:putfield        #249 <Field MenuBuilder mMenu>
			mMenu.setCallback(((android.support.v7.view.menu.MenuBuilder.Callback) (new MenuBuilderCallback())));
	//   12   24:aload_0         
	//   13   25:getfield        #249 <Field MenuBuilder mMenu>
	//   14   28:new             #19  <Class ActionMenuView$MenuBuilderCallback>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #256 <Method void ActionMenuView$MenuBuilderCallback(ActionMenuView)>
	//   18   36:invokevirtual   #260 <Method void MenuBuilder.setCallback(android.support.v7.view.menu.MenuBuilder$Callback)>
			mPresenter = new ActionMenuPresenter(((Context) (obj)));
	//   19   39:aload_0         
	//   20   40:new             #203 <Class ActionMenuPresenter>
	//   21   43:dup             
	//   22   44:aload_1         
	//   23   45:invokespecial   #261 <Method void ActionMenuPresenter(Context)>
	//   24   48:putfield        #201 <Field ActionMenuPresenter mPresenter>
			mPresenter.setReserveOverflow(true);
	//   25   51:aload_0         
	//   26   52:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//   27   55:iconst_1        
	//   28   56:invokevirtual   #264 <Method void ActionMenuPresenter.setReserveOverflow(boolean)>
			ActionMenuPresenter actionmenupresenter = mPresenter;
	//   29   59:aload_0         
	//   30   60:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//   31   63:astore_2        
			obj = ((Object) (mActionMenuPresenterCallback));
	//   32   64:aload_0         
	//   33   65:getfield        #266 <Field android.support.v7.view.menu.MenuPresenter$Callback mActionMenuPresenterCallback>
	//   34   68:astore_1        
			if(obj == null)
	//*  35   69:aload_1         
	//*  36   70:ifnull          76
	//*  37   73:goto            84
				obj = ((Object) (new ActionMenuPresenterCallback()));
	//   38   76:new             #13  <Class ActionMenuView$ActionMenuPresenterCallback>
	//   39   79:dup             
	//   40   80:invokespecial   #268 <Method void ActionMenuView$ActionMenuPresenterCallback()>
	//   41   83:astore_1        
			actionmenupresenter.setCallback(((android.support.v7.view.menu.MenuPresenter.Callback) (obj)));
	//   42   84:aload_2         
	//   43   85:aload_1         
	//   44   86:invokevirtual   #271 <Method void ActionMenuPresenter.setCallback(android.support.v7.view.menu.MenuPresenter$Callback)>
			mMenu.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (mPresenter)), mPopupContext);
	//   45   89:aload_0         
	//   46   90:getfield        #249 <Field MenuBuilder mMenu>
	//   47   93:aload_0         
	//   48   94:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//   49   97:aload_0         
	//   50   98:getfield        #80  <Field Context mPopupContext>
	//   51  101:invokevirtual   #275 <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter, Context)>
			mPresenter.setMenuView(this);
	//   52  104:aload_0         
	//   53  105:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//   54  108:aload_0         
	//   55  109:invokevirtual   #278 <Method void ActionMenuPresenter.setMenuView(ActionMenuView)>
		}
		return ((Menu) (mMenu));
	//   56  112:aload_0         
	//   57  113:getfield        #249 <Field MenuBuilder mMenu>
	//   58  116:areturn         
	}

	public Drawable getOverflowIcon()
	{
		getMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #283 <Method Menu getMenu()>
	//    2    4:pop             
		return mPresenter.getOverflowIcon();
	//    3    5:aload_0         
	//    4    6:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//    5    9:invokevirtual   #285 <Method Drawable ActionMenuPresenter.getOverflowIcon()>
	//    6   12:areturn         
	}

	public int getPopupTheme()
	{
		return mPopupTheme;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int mPopupTheme>
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
	//   10   12:invokevirtual   #155 <Method View getChildAt(int)>
	//   11   15:astore          4
		View view1 = getChildAt(i);
	//   12   17:aload_0         
	//   13   18:iload_1         
	//   14   19:invokevirtual   #155 <Method View getChildAt(int)>
	//   15   22:astore          5
		boolean flag = flag1;
	//   16   24:iload_3         
	//   17   25:istore_2        
		if(i < getChildCount())
	//*  18   26:iload_1         
	//*  19   27:aload_0         
	//*  20   28:invokevirtual   #151 <Method int getChildCount()>
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
	//   30   50:invokeinterface #292 <Method boolean ActionMenuView$ActionMenuChildView.needsDividerAfter()>
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
	//   45   79:invokeinterface #295 <Method boolean ActionMenuView$ActionMenuChildView.needsDividerBefore()>
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
	//    1    1:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//    2    4:astore_1        
		return actionmenupresenter != null && actionmenupresenter.hideOverflowMenu();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #298 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
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
	//    2    2:putfield        #249 <Field MenuBuilder mMenu>
	//    3    5:return          
	}

	public boolean invokeItem(MenuItemImpl menuitemimpl)
	{
		return mMenu.performItemAction(((MenuItem) (menuitemimpl)), 0);
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field MenuBuilder mMenu>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #306 <Method boolean MenuBuilder.performItemAction(MenuItem, int)>
	//    5    9:ireturn         
	}

	public boolean isOverflowMenuShowPending()
	{
		ActionMenuPresenter actionmenupresenter = mPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//    2    4:astore_1        
		return actionmenupresenter != null && actionmenupresenter.isOverflowMenuShowPending();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #309 <Method boolean ActionMenuPresenter.isOverflowMenuShowPending()>
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
	//    1    1:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//    2    4:astore_1        
		return actionmenupresenter != null && actionmenupresenter.isOverflowMenuShowing();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #312 <Method boolean ActionMenuPresenter.isOverflowMenuShowing()>
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
	//    1    1:getfield        #315 <Field boolean mReserveOverflow>
	//    2    4:ireturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #319 <Method void LinearLayoutCompat.onConfigurationChanged(Configuration)>
		configuration = ((Configuration) (mPresenter));
	//    3    5:aload_0         
	//    4    6:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//    5    9:astore_1        
		if(configuration != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          45
		{
			((ActionMenuPresenter) (configuration)).updateMenuView(false);
	//    8   14:aload_1         
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #322 <Method void ActionMenuPresenter.updateMenuView(boolean)>
			if(mPresenter.isOverflowMenuShowing())
	//*  11   19:aload_0         
	//*  12   20:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//*  13   23:invokevirtual   #312 <Method boolean ActionMenuPresenter.isOverflowMenuShowing()>
	//*  14   26:ifeq            45
			{
				mPresenter.hideOverflowMenu();
	//   15   29:aload_0         
	//   16   30:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//   17   33:invokevirtual   #298 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
	//   18   36:pop             
				mPresenter.showOverflowMenu();
	//   19   37:aload_0         
	//   20   38:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//   21   41:invokevirtual   #325 <Method boolean ActionMenuPresenter.showOverflowMenu()>
	//   22   44:pop             
			}
		}
	//   23   45:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #328 <Method void LinearLayoutCompat.onDetachedFromWindow()>
		dismissPopupMenus();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #330 <Method void dismissPopupMenus()>
	//    4    8:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		if(!mFormatItems)
	//*   0    0:aload_0         
	//*   1    1:getfield        #334 <Field boolean mFormatItems>
	//*   2    4:ifne            19
		{
			super.onLayout(flag, i, j, k, l);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:iload           5
	//    9   15:invokespecial   #336 <Method void LinearLayoutCompat.onLayout(boolean, int, int, int, int)>
			return;
	//   10   18:return          
		}
		int k2 = getChildCount();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #151 <Method int getChildCount()>
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
	//   21   34:invokevirtual   #339 <Method int getDividerWidth()>
	//   22   37:istore          10
		int i3 = k - i;
	//   23   39:iload           4
	//   24   41:iload_2         
	//   25   42:isub            
	//   26   43:istore          11
		i = getPaddingRight();
	//   27   45:aload_0         
	//   28   46:invokevirtual   #135 <Method int getPaddingRight()>
	//   29   49:istore_2        
		j = getPaddingLeft();
	//   30   50:aload_0         
	//   31   51:invokevirtual   #132 <Method int getPaddingLeft()>
	//   32   54:istore_3        
		flag = ViewUtils.isLayoutRtl(((View) (this)));
	//   33   55:aload_0         
	//   34   56:invokestatic    #345 <Method boolean ViewUtils.isLayoutRtl(View)>
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
	//   53   83:invokevirtual   #155 <Method View getChildAt(int)>
	//   54   86:astore          14
			if(view.getVisibility() == 8)
	//*  55   88:aload           14
	//*  56   90:invokevirtual   #158 <Method int View.getVisibility()>
	//*  57   93:bipush          8
	//*  58   95:icmpne          101
				continue;
	//   59   98:goto            270
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   60  101:aload           14
	//   61  103:invokevirtual   #90  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   62  106:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//   63  109:astore          15
			if(layoutparams.isOverflowButton)
	//*  64  111:aload           15
	//*  65  113:getfield        #121 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//*  66  116:ifeq            238
			{
				int i1 = view.getMeasuredWidth();
	//   67  119:aload           14
	//   68  121:invokevirtual   #118 <Method int View.getMeasuredWidth()>
	//   69  124:istore          6
				l = i1;
	//   70  126:iload           6
	//   71  128:istore          5
				if(hasSupportDividerBeforeChildAt(j))
	//*  72  130:aload_0         
	//*  73  131:iload_3         
	//*  74  132:invokevirtual   #347 <Method boolean hasSupportDividerBeforeChildAt(int)>
	//*  75  135:ifeq            145
					l = i1 + l2;
	//   76  138:iload           6
	//   77  140:iload           10
	//   78  142:iadd            
	//   79  143:istore          5
				int j3 = view.getMeasuredHeight();
	//   80  145:aload           14
	//   81  147:invokevirtual   #187 <Method int View.getMeasuredHeight()>
	//   82  150:istore          12
				int k1;
				if(flag)
	//*  83  152:iload_1         
	//*  84  153:ifeq            178
				{
					k1 = getPaddingLeft() + layoutparams.leftMargin;
	//   85  156:aload_0         
	//   86  157:invokevirtual   #132 <Method int getPaddingLeft()>
	//   87  160:aload           15
	//   88  162:getfield        #171 <Field int ActionMenuView$LayoutParams.leftMargin>
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
	//   97  179:invokevirtual   #350 <Method int getWidth()>
	//   98  182:aload_0         
	//   99  183:invokevirtual   #135 <Method int getPaddingRight()>
	//  100  186:isub            
	//  101  187:aload           15
	//  102  189:getfield        #174 <Field int ActionMenuView$LayoutParams.rightMargin>
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
	//  122  224:invokevirtual   #353 <Method void View.layout(int, int, int, int)>
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
	//  132  241:invokevirtual   #118 <Method int View.getMeasuredWidth()>
	//  133  244:aload           15
	//  134  246:getfield        #171 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  135  249:iadd            
	//  136  250:aload           15
	//  137  252:getfield        #174 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  138  255:iadd            
	//  139  256:isub            
	//  140  257:istore_2        
				hasSupportDividerBeforeChildAt(j);
	//  141  258:aload_0         
	//  142  259:iload_3         
	//  143  260:invokevirtual   #347 <Method boolean hasSupportDividerBeforeChildAt(int)>
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
	//  161  290:invokevirtual   #155 <Method View getChildAt(int)>
	//  162  293:astore          14
			i = view1.getMeasuredWidth();
	//  163  295:aload           14
	//  164  297:invokevirtual   #118 <Method int View.getMeasuredWidth()>
	//  165  300:istore_2        
			j = view1.getMeasuredHeight();
	//  166  301:aload           14
	//  167  303:invokevirtual   #187 <Method int View.getMeasuredHeight()>
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
	//  192  339:invokevirtual   #353 <Method void View.layout(int, int, int, int)>
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
	//  215  372:invokestatic    #184 <Method int Math.max(int, int)>
	//  216  375:istore          6
		if(flag)
	//* 217  377:iload_1         
	//* 218  378:ifeq            517
		{
			j = getWidth() - getPaddingRight();
	//  219  381:aload_0         
	//  220  382:invokevirtual   #350 <Method int getWidth()>
	//  221  385:aload_0         
	//  222  386:invokevirtual   #135 <Method int getPaddingRight()>
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
	//  232  402:invokevirtual   #155 <Method View getChildAt(int)>
	//  233  405:astore          14
				LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
	//  234  407:aload           14
	//  235  409:invokevirtual   #90  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  236  412:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  237  415:astore          15
				k = j;
	//  238  417:iload_3         
	//  239  418:istore          4
				if(view2.getVisibility() != 8)
	//* 240  420:aload           14
	//* 241  422:invokevirtual   #158 <Method int View.getVisibility()>
	//* 242  425:bipush          8
	//* 243  427:icmpeq          507
					if(layoutparams1.isOverflowButton)
	//* 244  430:aload           15
	//* 245  432:getfield        #121 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
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
	//  252  447:getfield        #174 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  253  450:isub            
	//  254  451:istore_3        
						k = view2.getMeasuredWidth();
	//  255  452:aload           14
	//  256  454:invokevirtual   #118 <Method int View.getMeasuredWidth()>
	//  257  457:istore          4
						l = view2.getMeasuredHeight();
	//  258  459:aload           14
	//  259  461:invokevirtual   #187 <Method int View.getMeasuredHeight()>
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
	//  276  489:invokevirtual   #353 <Method void View.layout(int, int, int, int)>
						k = j - (k + layoutparams1.leftMargin + j1);
	//  277  492:iload_3         
	//  278  493:iload           4
	//  279  495:aload           15
	//  280  497:getfield        #171 <Field int ActionMenuView$LayoutParams.leftMargin>
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
	//  294  518:invokevirtual   #132 <Method int getPaddingLeft()>
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
	//  303  533:invokevirtual   #155 <Method View getChildAt(int)>
	//  304  536:astore          14
				LayoutParams layoutparams2 = (LayoutParams)view3.getLayoutParams();
	//  305  538:aload           14
	//  306  540:invokevirtual   #90  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  307  543:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  308  546:astore          15
				k = j;
	//  309  548:iload_3         
	//  310  549:istore          4
				if(view3.getVisibility() != 8)
	//* 311  551:aload           14
	//* 312  553:invokevirtual   #158 <Method int View.getVisibility()>
	//* 313  556:bipush          8
	//* 314  558:icmpeq          638
					if(layoutparams2.isOverflowButton)
	//* 315  561:aload           15
	//* 316  563:getfield        #121 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
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
	//  323  578:getfield        #171 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  324  581:iadd            
	//  325  582:istore_3        
						k = view3.getMeasuredWidth();
	//  326  583:aload           14
	//  327  585:invokevirtual   #118 <Method int View.getMeasuredWidth()>
	//  328  588:istore          4
						l = view3.getMeasuredHeight();
	//  329  590:aload           14
	//  330  592:invokevirtual   #187 <Method int View.getMeasuredHeight()>
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
	//  347  620:invokevirtual   #353 <Method void View.layout(int, int, int, int)>
						k = j + (k + layoutparams2.rightMargin + j1);
	//  348  623:iload_3         
	//  349  624:iload           4
	//  350  626:aload           15
	//  351  628:getfield        #174 <Field int ActionMenuView$LayoutParams.rightMargin>
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
	//    1    1:getfield        #334 <Field boolean mFormatItems>
	//    2    4:istore          6
		boolean flag;
		if(android.view.View.MeasureSpec.getMode(i) == 0x40000000)
	//*   3    6:iload_1         
	//*   4    7:invokestatic    #99  <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   5   10:ldc1            #128 <Int 0x40000000>
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
	//   14   27:putfield        #334 <Field boolean mFormatItems>
		if(flag1 != mFormatItems)
	//*  15   30:iload           6
	//*  16   32:aload_0         
	//*  17   33:getfield        #334 <Field boolean mFormatItems>
	//*  18   36:icmpeq          44
			mFormatItemsWidth = 0;
	//   19   39:aload_0         
	//   20   40:iconst_0        
	//   21   41:putfield        #356 <Field int mFormatItemsWidth>
		int k = android.view.View.MeasureSpec.getSize(i);
	//   22   44:iload_1         
	//   23   45:invokestatic    #96  <Method int android.view.View$MeasureSpec.getSize(int)>
	//   24   48:istore_3        
		if(mFormatItems)
	//*  25   49:aload_0         
	//*  26   50:getfield        #334 <Field boolean mFormatItems>
	//*  27   53:ifeq            86
		{
			MenuBuilder menubuilder = mMenu;
	//   28   56:aload_0         
	//   29   57:getfield        #249 <Field MenuBuilder mMenu>
	//   30   60:astore          7
			if(menubuilder != null && k != mFormatItemsWidth)
	//*  31   62:aload           7
	//*  32   64:ifnull          86
	//*  33   67:iload_3         
	//*  34   68:aload_0         
	//*  35   69:getfield        #356 <Field int mFormatItemsWidth>
	//*  36   72:icmpeq          86
			{
				mFormatItemsWidth = k;
	//   37   75:aload_0         
	//   38   76:iload_3         
	//   39   77:putfield        #356 <Field int mFormatItemsWidth>
				menubuilder.onItemsChanged(true);
	//   40   80:aload           7
	//   41   82:iconst_1        
	//   42   83:invokevirtual   #359 <Method void MenuBuilder.onItemsChanged(boolean)>
			}
		}
		int i1 = getChildCount();
	//   43   86:aload_0         
	//   44   87:invokevirtual   #151 <Method int getChildCount()>
	//   45   90:istore          4
		if(mFormatItems && i1 > 0)
	//*  46   92:aload_0         
	//*  47   93:getfield        #334 <Field boolean mFormatItems>
	//*  48   96:ifeq            111
	//*  49   99:iload           4
	//*  50  101:ifle            111
		{
			onMeasureExactFormat(i, j);
	//   51  104:aload_0         
	//   52  105:iload_1         
	//   53  106:iload_2         
	//   54  107:invokespecial   #361 <Method void onMeasureExactFormat(int, int)>
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
	//   63  121:invokevirtual   #155 <Method View getChildAt(int)>
	//   64  124:invokevirtual   #90  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   65  127:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//   66  130:astore          7
			layoutparams.rightMargin = 0;
	//   67  132:aload           7
	//   68  134:iconst_0        
	//   69  135:putfield        #174 <Field int ActionMenuView$LayoutParams.rightMargin>
			layoutparams.leftMargin = 0;
	//   70  138:aload           7
	//   71  140:iconst_0        
	//   72  141:putfield        #171 <Field int ActionMenuView$LayoutParams.leftMargin>
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
	//   81  154:invokespecial   #363 <Method void LinearLayoutCompat.onMeasure(int, int)>
	//   82  157:return          
	}

	public MenuBuilder peekMenu()
	{
		return mMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

	public void setExpandedActionViewsExclusive(boolean flag)
	{
		mPresenter.setExpandedActionViewsExclusive(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #368 <Method void ActionMenuPresenter.setExpandedActionViewsExclusive(boolean)>
	//    4    8:return          
	}

	public void setMenuCallbacks(android.support.v7.view.menu.MenuPresenter.Callback callback, android.support.v7.view.menu.MenuBuilder.Callback callback1)
	{
		mActionMenuPresenterCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #266 <Field android.support.v7.view.menu.MenuPresenter$Callback mActionMenuPresenterCallback>
		mMenuBuilderCallback = callback1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #372 <Field android.support.v7.view.menu.MenuBuilder$Callback mMenuBuilderCallback>
	//    6   10:return          
	}

	public void setOnMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener)
	{
		mOnMenuItemClickListener = onmenuitemclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #376 <Field ActionMenuView$OnMenuItemClickListener mOnMenuItemClickListener>
	//    3    5:return          
	}

	public void setOverflowIcon(Drawable drawable)
	{
		getMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #283 <Method Menu getMenu()>
	//    2    4:pop             
		mPresenter.setOverflowIcon(drawable);
	//    3    5:aload_0         
	//    4    6:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #380 <Method void ActionMenuPresenter.setOverflowIcon(Drawable)>
	//    7   13:return          
	}

	public void setOverflowReserved(boolean flag)
	{
		mReserveOverflow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #315 <Field boolean mReserveOverflow>
	//    3    5:return          
	}

	public void setPopupTheme(int i)
	{
		if(mPopupTheme != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field int mPopupTheme>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          42
		{
			mPopupTheme = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #82  <Field int mPopupTheme>
			if(i == 0)
	//*   7   13:iload_1         
	//*   8   14:ifne            26
			{
				mPopupContext = getContext();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #223 <Method Context getContext()>
	//   12   22:putfield        #80  <Field Context mPopupContext>
				return;
	//   13   25:return          
			}
			mPopupContext = ((Context) (new ContextThemeWrapper(getContext(), i)));
	//   14   26:aload_0         
	//   15   27:new             #387 <Class ContextThemeWrapper>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:invokevirtual   #223 <Method Context getContext()>
	//   19   35:iload_1         
	//   20   36:invokespecial   #390 <Method void ContextThemeWrapper(Context, int)>
	//   21   39:putfield        #80  <Field Context mPopupContext>
		}
	//   22   42:return          
	}

	public void setPresenter(ActionMenuPresenter actionmenupresenter)
	{
		mPresenter = actionmenupresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #201 <Field ActionMenuPresenter mPresenter>
		mPresenter.setMenuView(this);
	//    3    5:aload_0         
	//    4    6:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #278 <Method void ActionMenuPresenter.setMenuView(ActionMenuView)>
	//    7   13:return          
	}

	public boolean showOverflowMenu()
	{
		ActionMenuPresenter actionmenupresenter = mPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #201 <Field ActionMenuPresenter mPresenter>
	//    2    4:astore_1        
		return actionmenupresenter != null && actionmenupresenter.showOverflowMenu();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #325 <Method boolean ActionMenuPresenter.showOverflowMenu()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

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
