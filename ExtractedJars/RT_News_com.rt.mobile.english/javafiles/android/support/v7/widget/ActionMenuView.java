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
		mGeneratedItemPadding = (int)(4F * f);
	//   18   31:aload_0         
	//   19   32:ldc1            #84  <Float 4F>
	//   20   34:fload_3         
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
	//    3    7:astore          11
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
	//   17   36:astore          10
		else
	//*  18   38:goto            44
			actionmenuitemview = null;
	//   19   41:aconst_null     
	//   20   42:astore          10
		boolean flag1 = false;
	//   21   44:iconst_0        
	//   22   45:istore          9
		if(actionmenuitemview != null && actionmenuitemview.hasText())
	//*  23   47:aload           10
	//*  24   49:ifnull          65
	//*  25   52:aload           10
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
		boolean flag = flag1;
	//   78  144:iload           9
	//   79  146:istore          8
		if(!layoutparams.isOverflowButton)
	//*  80  148:aload           11
	//*  81  150:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//*  82  153:ifne            167
		{
			flag = flag1;
	//   83  156:iload           9
	//   84  158:istore          8
			if(k != 0)
	//*  85  160:iload_3         
	//*  86  161:ifeq            167
				flag = true;
	//   87  164:iconst_1        
	//   88  165:istore          8
		}
		layoutparams.expandable = flag;
	//   89  167:aload           11
	//   90  169:iload           8
	//   91  171:putfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
		layoutparams.cellsUsed = j;
	//   92  174:aload           11
	//   93  176:iload_2         
	//   94  177:putfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i * j, 0x40000000), j1);
	//   95  180:aload_0         
	//   96  181:iload_1         
	//   97  182:iload_2         
	//   98  183:imul            
	//   99  184:ldc1            #136 <Int 0x40000000>
	//  100  186:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  101  189:iload           6
	//  102  191:invokevirtual   #122 <Method void View.measure(int, int)>
		return j;
	//  103  194:iload_2         
	//  104  195:ireturn         
	}

	private void onMeasureExactFormat(int i, int j)
	{
		int i6 = android.view.View.MeasureSpec.getMode(j);
	//    0    0:iload_2         
	//    1    1:invokestatic    #107 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          20
		i = android.view.View.MeasureSpec.getSize(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore_1        
		int l1 = android.view.View.MeasureSpec.getSize(j);
	//    6   11:iload_2         
	//    7   12:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   15:istore          9
		int k = getPaddingLeft();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #140 <Method int getPaddingLeft()>
	//   11   21:istore          5
		int l = getPaddingRight();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #143 <Method int getPaddingRight()>
	//   14   27:istore          6
		int j4 = getPaddingTop() + getPaddingBottom();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #146 <Method int getPaddingTop()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #149 <Method int getPaddingBottom()>
	//   19   37:iadd            
	//   20   38:istore          15
		int k4 = getChildMeasureSpec(j, j4, -2);
	//   21   40:iload_2         
	//   22   41:iload           15
	//   23   43:bipush          -2
	//   24   45:invokestatic    #153 <Method int getChildMeasureSpec(int, int, int)>
	//   25   48:istore          16
		int i3 = i - (k + l);
	//   26   50:iload_1         
	//   27   51:iload           5
	//   28   53:iload           6
	//   29   55:iadd            
	//   30   56:isub            
	//   31   57:istore          11
		int k1 = i3 / mMinCellSize;
	//   32   59:iload           11
	//   33   61:aload_0         
	//   34   62:getfield        #83  <Field int mMinCellSize>
	//   35   65:idiv            
	//   36   66:istore          8
		i = mMinCellSize;
	//   37   68:aload_0         
	//   38   69:getfield        #83  <Field int mMinCellSize>
	//   39   72:istore_1        
		if(k1 == 0)
	//*  40   73:iload           8
	//*  41   75:ifne            86
		{
			setMeasuredDimension(i3, 0);
	//   42   78:aload_0         
	//   43   79:iload           11
	//   44   81:iconst_0        
	//   45   82:invokevirtual   #156 <Method void setMeasuredDimension(int, int)>
			return;
	//   46   85:return          
		}
		int j6 = mMinCellSize + (i3 % i) / k1;
	//   47   86:aload_0         
	//   48   87:getfield        #83  <Field int mMinCellSize>
	//   49   90:iload           11
	//   50   92:iload_1         
	//   51   93:irem            
	//   52   94:iload           8
	//   53   96:idiv            
	//   54   97:iadd            
	//   55   98:istore          21
		int i5 = getChildCount();
	//   56  100:aload_0         
	//   57  101:invokevirtual   #159 <Method int getChildCount()>
	//   58  104:istore          17
		int i4 = 0;
	//   59  106:iconst_0        
	//   60  107:istore          14
		int j1 = i4;
	//   61  109:iload           14
	//   62  111:istore          7
		k = j1;
	//   63  113:iload           7
	//   64  115:istore          5
		j = k;
	//   65  117:iload           5
	//   66  119:istore_2        
		i = j;
	//   67  120:iload_2         
	//   68  121:istore_1        
		l = i;
	//   69  122:iload_1         
	//   70  123:istore          6
		long l6 = 0L;
	//   71  125:lconst_0        
	//   72  126:lstore          22
		int j3 = i;
	//   73  128:iload_1         
	//   74  129:istore          12
		i = k1;
	//   75  131:iload           8
	//   76  133:istore_1        
		int l3 = j;
	//   77  134:iload_2         
	//   78  135:istore          13
		j = l1;
	//   79  137:iload           9
	//   80  139:istore_2        
		while(i4 < i5) 
	//*  81  140:iload           14
	//*  82  142:iload           17
	//*  83  144:icmpge          425
		{
			View view = getChildAt(i4);
	//   84  147:aload_0         
	//   85  148:iload           14
	//   86  150:invokevirtual   #163 <Method View getChildAt(int)>
	//   87  153:astore          31
			int i2;
			if(view.getVisibility() == 8)
	//*  88  155:aload           31
	//*  89  157:invokevirtual   #166 <Method int View.getVisibility()>
	//*  90  160:bipush          8
	//*  91  162:icmpne          176
			{
				l1 = l3;
	//   92  165:iload           13
	//   93  167:istore          9
				i2 = j3;
	//   94  169:iload           12
	//   95  171:istore          10
			} else
	//*  96  173:goto            408
			{
				boolean flag2 = view instanceof ActionMenuItemView;
	//   97  176:aload           31
	//   98  178:instanceof      #113 <Class ActionMenuItemView>
	//   99  181:istore          30
				l1 = l3 + 1;
	//  100  183:iload           13
	//  101  185:iconst_1        
	//  102  186:iadd            
	//  103  187:istore          9
				if(flag2)
	//* 104  189:iload           30
	//* 105  191:ifeq            212
					view.setPadding(mGeneratedItemPadding, 0, mGeneratedItemPadding, 0);
	//  106  194:aload           31
	//  107  196:aload_0         
	//  108  197:getfield        #86  <Field int mGeneratedItemPadding>
	//  109  200:iconst_0        
	//  110  201:aload_0         
	//  111  202:getfield        #86  <Field int mGeneratedItemPadding>
	//  112  205:iconst_0        
	//  113  206:invokevirtual   #170 <Method void View.setPadding(int, int, int, int)>
	//* 114  209:goto            212
				LayoutParams layoutparams1 = (LayoutParams)view.getLayoutParams();
	//  115  212:aload           31
	//  116  214:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  117  217:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  118  220:astore          32
				layoutparams1.expanded = false;
	//  119  222:aload           32
	//  120  224:iconst_0        
	//  121  225:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
				layoutparams1.extraPixels = 0;
	//  122  228:aload           32
	//  123  230:iconst_0        
	//  124  231:putfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
				layoutparams1.cellsUsed = 0;
	//  125  234:aload           32
	//  126  236:iconst_0        
	//  127  237:putfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
				layoutparams1.expandable = false;
	//  128  240:aload           32
	//  129  242:iconst_0        
	//  130  243:putfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
				layoutparams1.leftMargin = 0;
	//  131  246:aload           32
	//  132  248:iconst_0        
	//  133  249:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
				layoutparams1.rightMargin = 0;
	//  134  252:aload           32
	//  135  254:iconst_0        
	//  136  255:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
				if(flag2 && ((ActionMenuItemView)view).hasText())
	//* 137  258:iload           30
	//* 138  260:ifeq            280
	//* 139  263:aload           31
	//* 140  265:checkcast       #113 <Class ActionMenuItemView>
	//* 141  268:invokevirtual   #117 <Method boolean ActionMenuItemView.hasText()>
	//* 142  271:ifeq            280
					flag2 = true;
	//  143  274:iconst_1        
	//  144  275:istore          30
				else
	//* 145  277:goto            283
					flag2 = false;
	//  146  280:iconst_0        
	//  147  281:istore          30
				layoutparams1.preventEdgeOffset = flag2;
	//  148  283:aload           32
	//  149  285:iload           30
	//  150  287:putfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
				if(layoutparams1.isOverflowButton)
	//* 151  290:aload           32
	//* 152  292:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 153  295:ifeq            304
					k1 = 1;
	//  154  298:iconst_1        
	//  155  299:istore          8
				else
	//* 156  301:goto            307
					k1 = i;
	//  157  304:iload_1         
	//  158  305:istore          8
				l3 = measureChildForCells(view, j6, k1, k4, j4);
	//  159  307:aload           31
	//  160  309:iload           21
	//  161  311:iload           8
	//  162  313:iload           16
	//  163  315:iload           15
	//  164  317:invokestatic    #187 <Method int measureChildForCells(View, int, int, int, int)>
	//  165  320:istore          13
				i2 = Math.max(j3, l3);
	//  166  322:iload           12
	//  167  324:iload           13
	//  168  326:invokestatic    #192 <Method int Math.max(int, int)>
	//  169  329:istore          10
				k1 = l;
	//  170  331:iload           6
	//  171  333:istore          8
				if(layoutparams1.expandable)
	//* 172  335:aload           32
	//* 173  337:getfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
	//* 174  340:ifeq            349
					k1 = l + 1;
	//  175  343:iload           6
	//  176  345:iconst_1        
	//  177  346:iadd            
	//  178  347:istore          8
				if(layoutparams1.isOverflowButton)
	//* 179  349:aload           32
	//* 180  351:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 181  354:ifeq            360
					k = 1;
	//  182  357:iconst_1        
	//  183  358:istore          5
				i -= l3;
	//  184  360:iload_1         
	//  185  361:iload           13
	//  186  363:isub            
	//  187  364:istore_1        
				j1 = Math.max(j1, view.getMeasuredHeight());
	//  188  365:iload           7
	//  189  367:aload           31
	//  190  369:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//  191  372:invokestatic    #192 <Method int Math.max(int, int)>
	//  192  375:istore          7
				if(l3 == 1)
	//* 193  377:iload           13
	//* 194  379:iconst_1        
	//* 195  380:icmpne          404
				{
					long l7 = 1 << i4;
	//  196  383:iconst_1        
	//  197  384:iload           14
	//  198  386:ishl            
	//  199  387:i2l             
	//  200  388:lstore          24
					l6 |= l7;
	//  201  390:lload           22
	//  202  392:lload           24
	//  203  394:lor             
	//  204  395:lstore          22
					l = k1;
	//  205  397:iload           8
	//  206  399:istore          6
				} else
	//* 207  401:goto            408
				{
					l = k1;
	//  208  404:iload           8
	//  209  406:istore          6
				}
			}
			i4++;
	//  210  408:iload           14
	//  211  410:iconst_1        
	//  212  411:iadd            
	//  213  412:istore          14
			l3 = l1;
	//  214  414:iload           9
	//  215  416:istore          13
			j3 = i2;
	//  216  418:iload           10
	//  217  420:istore          12
		}
	//* 218  422:goto            140
		if(k != 0 && l3 == 2)
	//* 219  425:iload           5
	//* 220  427:ifeq            442
	//* 221  430:iload           13
	//* 222  432:iconst_2        
	//* 223  433:icmpne          442
			i4 = 1;
	//  224  436:iconst_1        
	//  225  437:istore          14
		else
	//* 226  439:goto            445
			i4 = 0;
	//  227  442:iconst_0        
	//  228  443:istore          14
		boolean flag1 = false;
	//  229  445:iconst_0        
	//  230  446:istore          10
		j4 = i;
	//  231  448:iload_1         
	//  232  449:istore          15
		l1 = i5;
	//  233  451:iload           17
	//  234  453:istore          9
		k1 = k4;
	//  235  455:iload           16
	//  236  457:istore          8
		i = ((int) (flag1));
	//  237  459:iload           10
	//  238  461:istore_1        
		do
		{
			if(l <= 0 || j4 <= 0)
				break;
	//  239  462:iload           6
	//  240  464:ifle            800
	//  241  467:iload           15
	//  242  469:ifle            800
			int l4 = 0x7fffffff;
	//  243  472:ldc1            #196 <Int 0x7fffffff>
	//  244  474:istore          16
			int j5 = 0;
	//  245  476:iconst_0        
	//  246  477:istore          17
			int k5 = 0;
	//  247  479:iconst_0        
	//  248  480:istore          18
			long l8;
			long l10;
			for(l10 = 0L; j5 < l1; l10 = l8)
	//* 249  482:lconst_0        
	//* 250  483:lstore          26
	//* 251  485:iload           17
	//* 252  487:iload           9
	//* 253  489:icmpge          620
			{
				LayoutParams layoutparams = (LayoutParams)getChildAt(j5).getLayoutParams();
	//  254  492:aload_0         
	//  255  493:iload           17
	//  256  495:invokevirtual   #163 <Method View getChildAt(int)>
	//  257  498:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  258  501:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  259  504:astore          31
				int j2;
				int l5;
				if(!layoutparams.expandable)
	//* 260  506:aload           31
	//* 261  508:getfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
	//* 262  511:ifne            529
				{
					j2 = k5;
	//  263  514:iload           18
	//  264  516:istore          10
					l5 = l4;
	//  265  518:iload           16
	//  266  520:istore          19
					l8 = l10;
	//  267  522:lload           26
	//  268  524:lstore          24
				} else
	//* 269  526:goto            599
				if(layoutparams.cellsUsed < l4)
	//* 270  529:aload           31
	//* 271  531:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 272  534:iload           16
	//* 273  536:icmpge          558
				{
					l5 = layoutparams.cellsUsed;
	//  274  539:aload           31
	//  275  541:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//  276  544:istore          19
					l8 = 1L << j5;
	//  277  546:lconst_1        
	//  278  547:iload           17
	//  279  549:lshl            
	//  280  550:lstore          24
					j2 = 1;
	//  281  552:iconst_1        
	//  282  553:istore          10
				} else
	//* 283  555:goto            599
				{
					j2 = k5;
	//  284  558:iload           18
	//  285  560:istore          10
					l5 = l4;
	//  286  562:iload           16
	//  287  564:istore          19
					l8 = l10;
	//  288  566:lload           26
	//  289  568:lstore          24
					if(layoutparams.cellsUsed == l4)
	//* 290  570:aload           31
	//* 291  572:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 292  575:iload           16
	//* 293  577:icmpne          599
					{
						j2 = k5 + 1;
	//  294  580:iload           18
	//  295  582:iconst_1        
	//  296  583:iadd            
	//  297  584:istore          10
						l8 = l10 | 1L << j5;
	//  298  586:lload           26
	//  299  588:lconst_1        
	//  300  589:iload           17
	//  301  591:lshl            
	//  302  592:lor             
	//  303  593:lstore          24
						l5 = l4;
	//  304  595:iload           16
	//  305  597:istore          19
					}
				}
				j5++;
	//  306  599:iload           17
	//  307  601:iconst_1        
	//  308  602:iadd            
	//  309  603:istore          17
				k5 = j2;
	//  310  605:iload           10
	//  311  607:istore          18
				l4 = l5;
	//  312  609:iload           19
	//  313  611:istore          16
			}

	//  314  613:lload           24
	//  315  615:lstore          26
	//* 316  617:goto            485
			l6 |= l10;
	//  317  620:lload           22
	//  318  622:lload           26
	//  319  624:lor             
	//  320  625:lstore          22
			if(k5 > j4)
	//* 321  627:iload           18
	//* 322  629:iload           15
	//* 323  631:icmple          637
				break;
	//  324  634:goto            800
			for(i = 0; i < l1;)
	//* 325  637:iconst_0        
	//* 326  638:istore_1        
	//* 327  639:iload_1         
	//* 328  640:iload           9
	//* 329  642:icmpge          795
			{
				View view1 = getChildAt(i);
	//  330  645:aload_0         
	//  331  646:iload_1         
	//  332  647:invokevirtual   #163 <Method View getChildAt(int)>
	//  333  650:astore          31
				LayoutParams layoutparams2 = (LayoutParams)view1.getLayoutParams();
	//  334  652:aload           31
	//  335  654:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  336  657:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  337  660:astore          32
				long l11 = 1 << i;
	//  338  662:iconst_1        
	//  339  663:iload_1         
	//  340  664:ishl            
	//  341  665:i2l             
	//  342  666:lstore          28
				int k2;
				long l9;
				if((l10 & l11) == 0L)
	//* 343  668:lload           26
	//* 344  670:lload           28
	//* 345  672:land            
	//* 346  673:lconst_0        
	//* 347  674:lcmp            
	//* 348  675:ifne            712
				{
					k2 = j4;
	//  349  678:iload           15
	//  350  680:istore          10
					l9 = l6;
	//  351  682:lload           22
	//  352  684:lstore          24
					if(layoutparams2.cellsUsed == l4 + 1)
	//* 353  686:aload           32
	//* 354  688:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 355  691:iload           16
	//* 356  693:iconst_1        
	//* 357  694:iadd            
	//* 358  695:icmpne          780
					{
						l9 = l6 | l11;
	//  359  698:lload           22
	//  360  700:lload           28
	//  361  702:lor             
	//  362  703:lstore          24
						k2 = j4;
	//  363  705:iload           15
	//  364  707:istore          10
					}
				} else
	//* 365  709:goto            780
				{
					if(i4 && layoutparams2.preventEdgeOffset && j4 == 1)
	//* 366  712:iload           14
	//* 367  714:ifeq            752
	//* 368  717:aload           32
	//* 369  719:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 370  722:ifeq            752
	//* 371  725:iload           15
	//* 372  727:iconst_1        
	//* 373  728:icmpne          752
						view1.setPadding(mGeneratedItemPadding + j6, 0, mGeneratedItemPadding, 0);
	//  374  731:aload           31
	//  375  733:aload_0         
	//  376  734:getfield        #86  <Field int mGeneratedItemPadding>
	//  377  737:iload           21
	//  378  739:iadd            
	//  379  740:iconst_0        
	//  380  741:aload_0         
	//  381  742:getfield        #86  <Field int mGeneratedItemPadding>
	//  382  745:iconst_0        
	//  383  746:invokevirtual   #170 <Method void View.setPadding(int, int, int, int)>
	//* 384  749:goto            752
					layoutparams2.cellsUsed = layoutparams2.cellsUsed + 1;
	//  385  752:aload           32
	//  386  754:aload           32
	//  387  756:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//  388  759:iconst_1        
	//  389  760:iadd            
	//  390  761:putfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
					layoutparams2.expanded = true;
	//  391  764:aload           32
	//  392  766:iconst_1        
	//  393  767:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
					k2 = j4 - 1;
	//  394  770:iload           15
	//  395  772:iconst_1        
	//  396  773:isub            
	//  397  774:istore          10
					l9 = l6;
	//  398  776:lload           22
	//  399  778:lstore          24
				}
				i++;
	//  400  780:iload_1         
	//  401  781:iconst_1        
	//  402  782:iadd            
	//  403  783:istore_1        
				j4 = k2;
	//  404  784:iload           10
	//  405  786:istore          15
				l6 = l9;
	//  406  788:lload           24
	//  407  790:lstore          22
			}

	//* 408  792:goto            639
			i = 1;
	//  409  795:iconst_1        
	//  410  796:istore_1        
		} while(true);
	//  411  797:goto            462
		boolean flag;
		if(k == 0 && l3 == 1)
	//* 412  800:iload           5
	//* 413  802:ifne            817
	//* 414  805:iload           13
	//* 415  807:iconst_1        
	//* 416  808:icmpne          817
			flag = true;
	//  417  811:iconst_1        
	//  418  812:istore          5
		else
	//* 419  814:goto            820
			flag = false;
	//  420  817:iconst_0        
	//  421  818:istore          5
		if(j4 > 0 && l6 != 0L && (j4 < l3 - 1 || flag || j3 > 1))
	//* 422  820:iload           15
	//* 423  822:ifle            1177
	//* 424  825:lload           22
	//* 425  827:lconst_0        
	//* 426  828:lcmp            
	//* 427  829:ifeq            1177
	//* 428  832:iload           15
	//* 429  834:iload           13
	//* 430  836:iconst_1        
	//* 431  837:isub            
	//* 432  838:icmplt          852
	//* 433  841:iload           5
	//* 434  843:ifne            852
	//* 435  846:iload           12
	//* 436  848:iconst_1        
	//* 437  849:icmple          1177
		{
			float f1 = Long.bitCount(l6);
	//  438  852:lload           22
	//  439  854:invokestatic    #202 <Method int Long.bitCount(long)>
	//  440  857:i2f             
	//  441  858:fstore          4
			if(!flag)
	//* 442  860:iload           5
	//* 443  862:ifne            958
			{
				float f;
				if((l6 & 1L) != 0L)
	//* 444  865:lload           22
	//* 445  867:lconst_1        
	//* 446  868:land            
	//* 447  869:lconst_0        
	//* 448  870:lcmp            
	//* 449  871:ifeq            903
				{
					f = f1;
	//  450  874:fload           4
	//  451  876:fstore_3        
					if(!((LayoutParams)getChildAt(0).getLayoutParams()).preventEdgeOffset)
	//* 452  877:aload_0         
	//* 453  878:iconst_0        
	//* 454  879:invokevirtual   #163 <Method View getChildAt(int)>
	//* 455  882:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 456  885:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 457  888:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 458  891:ifne            906
						f = f1 - 0.5F;
	//  459  894:fload           4
	//  460  896:ldc1            #203 <Float 0.5F>
	//  461  898:fsub            
	//  462  899:fstore_3        
				} else
	//* 463  900:goto            906
				{
					f = f1;
	//  464  903:fload           4
	//  465  905:fstore_3        
				}
				flag = ((boolean) (l1 - 1));
	//  466  906:iload           9
	//  467  908:iconst_1        
	//  468  909:isub            
	//  469  910:istore          5
				f1 = f;
	//  470  912:fload_3         
	//  471  913:fstore          4
				if((l6 & (long)(1 << flag)) != 0L)
	//* 472  915:lload           22
	//* 473  917:iconst_1        
	//* 474  918:iload           5
	//* 475  920:ishl            
	//* 476  921:i2l             
	//* 477  922:land            
	//* 478  923:lconst_0        
	//* 479  924:lcmp            
	//* 480  925:ifeq            958
				{
					f1 = f;
	//  481  928:fload_3         
	//  482  929:fstore          4
					if(!((LayoutParams)getChildAt(((int) (flag))).getLayoutParams()).preventEdgeOffset)
	//* 483  931:aload_0         
	//* 484  932:iload           5
	//* 485  934:invokevirtual   #163 <Method View getChildAt(int)>
	//* 486  937:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 487  940:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 488  943:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 489  946:ifne            958
						f1 = f - 0.5F;
	//  490  949:fload_3         
	//  491  950:ldc1            #203 <Float 0.5F>
	//  492  952:fsub            
	//  493  953:fstore          4
				}
			}
	//* 494  955:goto            958
			int i1;
			if(f1 > 0.0F)
	//* 495  958:fload           4
	//* 496  960:fconst_0        
	//* 497  961:fcmpl           
	//* 498  962:ifle            980
				i1 = (int)((float)(j4 * j6) / f1);
	//  499  965:iload           15
	//  500  967:iload           21
	//  501  969:imul            
	//  502  970:i2f             
	//  503  971:fload           4
	//  504  973:fdiv            
	//  505  974:f2i             
	//  506  975:istore          6
			else
	//* 507  977:goto            983
				i1 = 0;
	//  508  980:iconst_0        
	//  509  981:istore          6
			int l2 = 0;
	//  510  983:iconst_0        
	//  511  984:istore          10
			int k3 = l1;
	//  512  986:iload           9
	//  513  988:istore          12
			do
			{
				flag = ((boolean) (i));
	//  514  990:iload_1         
	//  515  991:istore          5
				if(l2 >= k3)
					break;
	//  516  993:iload           10
	//  517  995:iload           12
	//  518  997:icmpge          1180
				if((l6 & (long)(1 << l2)) == 0L)
	//* 519 1000:lload           22
	//* 520 1002:iconst_1        
	//* 521 1003:iload           10
	//* 522 1005:ishl            
	//* 523 1006:i2l             
	//* 524 1007:land            
	//* 525 1008:lconst_0        
	//* 526 1009:lcmp            
	//* 527 1010:ifne            1019
				{
					flag = ((boolean) (i));
	//  528 1013:iload_1         
	//  529 1014:istore          5
				} else
	//* 530 1016:goto            1165
				{
					View view2 = getChildAt(l2);
	//  531 1019:aload_0         
	//  532 1020:iload           10
	//  533 1022:invokevirtual   #163 <Method View getChildAt(int)>
	//  534 1025:astore          31
					LayoutParams layoutparams3 = (LayoutParams)view2.getLayoutParams();
	//  535 1027:aload           31
	//  536 1029:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  537 1032:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  538 1035:astore          32
					if(view2 instanceof ActionMenuItemView)
	//* 539 1037:aload           31
	//* 540 1039:instanceof      #113 <Class ActionMenuItemView>
	//* 541 1042:ifeq            1090
					{
						layoutparams3.extraPixels = i1;
	//  542 1045:aload           32
	//  543 1047:iload           6
	//  544 1049:putfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
						layoutparams3.expanded = true;
	//  545 1052:aload           32
	//  546 1054:iconst_1        
	//  547 1055:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
						if(l2 == 0 && !layoutparams3.preventEdgeOffset)
	//* 548 1058:iload           10
	//* 549 1060:ifne            1084
	//* 550 1063:aload           32
	//* 551 1065:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 552 1068:ifne            1084
							layoutparams3.leftMargin = -i1 / 2;
	//  553 1071:aload           32
	//  554 1073:iload           6
	//  555 1075:ineg            
	//  556 1076:iconst_2        
	//  557 1077:idiv            
	//  558 1078:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//* 559 1081:goto            1084
						flag = true;
	//  560 1084:iconst_1        
	//  561 1085:istore          5
					} else
	//* 562 1087:goto            1165
					if(layoutparams3.isOverflowButton)
	//* 563 1090:aload           32
	//* 564 1092:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 565 1095:ifeq            1127
					{
						layoutparams3.extraPixels = i1;
	//  566 1098:aload           32
	//  567 1100:iload           6
	//  568 1102:putfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
						layoutparams3.expanded = true;
	//  569 1105:aload           32
	//  570 1107:iconst_1        
	//  571 1108:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
						layoutparams3.rightMargin = -i1 / 2;
	//  572 1111:aload           32
	//  573 1113:iload           6
	//  574 1115:ineg            
	//  575 1116:iconst_2        
	//  576 1117:idiv            
	//  577 1118:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
						flag = true;
	//  578 1121:iconst_1        
	//  579 1122:istore          5
					} else
	//* 580 1124:goto            1165
					{
						if(l2 != 0)
	//* 581 1127:iload           10
	//* 582 1129:ifeq            1141
							layoutparams3.leftMargin = i1 / 2;
	//  583 1132:aload           32
	//  584 1134:iload           6
	//  585 1136:iconst_2        
	//  586 1137:idiv            
	//  587 1138:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
						flag = ((boolean) (i));
	//  588 1141:iload_1         
	//  589 1142:istore          5
						if(l2 != k3 - 1)
	//* 590 1144:iload           10
	//* 591 1146:iload           12
	//* 592 1148:iconst_1        
	//* 593 1149:isub            
	//* 594 1150:icmpeq          1165
						{
							layoutparams3.rightMargin = i1 / 2;
	//  595 1153:aload           32
	//  596 1155:iload           6
	//  597 1157:iconst_2        
	//  598 1158:idiv            
	//  599 1159:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
							flag = ((boolean) (i));
	//  600 1162:iload_1         
	//  601 1163:istore          5
						}
					}
				}
				l2++;
	//  602 1165:iload           10
	//  603 1167:iconst_1        
	//  604 1168:iadd            
	//  605 1169:istore          10
				i = ((int) (flag));
	//  606 1171:iload           5
	//  607 1173:istore_1        
			} while(true);
	//  608 1174:goto            990
		} else
		{
			flag = ((boolean) (i));
	//  609 1177:iload_1         
	//  610 1178:istore          5
		}
		i = 0;
	//  611 1180:iconst_0        
	//  612 1181:istore_1        
		if(flag != 0)
	//* 613 1182:iload           5
	//* 614 1184:ifeq            1254
			for(; i < l1; i++)
	//* 615 1187:iload_1         
	//* 616 1188:iload           9
	//* 617 1190:icmpge          1254
			{
				View view3 = getChildAt(i);
	//  618 1193:aload_0         
	//  619 1194:iload_1         
	//  620 1195:invokevirtual   #163 <Method View getChildAt(int)>
	//  621 1198:astore          31
				LayoutParams layoutparams4 = (LayoutParams)view3.getLayoutParams();
	//  622 1200:aload           31
	//  623 1202:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  624 1205:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  625 1208:astore          32
				if(layoutparams4.expanded)
	//* 626 1210:aload           32
	//* 627 1212:getfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
	//* 628 1215:ifne            1221
	//* 629 1218:goto            1247
					view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams4.cellsUsed * j6 + layoutparams4.extraPixels, 0x40000000), k1);
	//  630 1221:aload           31
	//  631 1223:aload           32
	//  632 1225:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//  633 1228:iload           21
	//  634 1230:imul            
	//  635 1231:aload           32
	//  636 1233:getfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
	//  637 1236:iadd            
	//  638 1237:ldc1            #136 <Int 0x40000000>
	//  639 1239:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  640 1242:iload           8
	//  641 1244:invokevirtual   #122 <Method void View.measure(int, int)>
			}

	//  642 1247:iload_1         
	//  643 1248:iconst_1        
	//  644 1249:iadd            
	//  645 1250:istore_1        
	//* 646 1251:goto            1187
		if(i6 != 0x40000000)
	//* 647 1254:iload           20
	//* 648 1256:ldc1            #136 <Int 0x40000000>
	//* 649 1258:icmpeq          1267
			j = j1;
	//  650 1261:iload           7
	//  651 1263:istore_2        
	//* 652 1264:goto            1267
		setMeasuredDimension(i3, j);
	//  653 1267:aload_0         
	//  654 1268:iload           11
	//  655 1270:iload_2         
	//  656 1271:invokevirtual   #156 <Method void setMeasuredDimension(int, int)>
	//  657 1274:return          
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
	//*   2    4:ifnonnull       115
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
	//*  34   68:ifnull          79
				obj = ((Object) (mActionMenuPresenterCallback));
	//   35   71:aload_0         
	//   36   72:getfield        #274 <Field android.support.v7.view.menu.MenuPresenter$Callback mActionMenuPresenterCallback>
	//   37   75:astore_1        
			else
	//*  38   76:goto            87
				obj = ((Object) (new ActionMenuPresenterCallback()));
	//   39   79:new             #13  <Class ActionMenuView$ActionMenuPresenterCallback>
	//   40   82:dup             
	//   41   83:invokespecial   #276 <Method void ActionMenuView$ActionMenuPresenterCallback()>
	//   42   86:astore_1        
			actionmenupresenter.setCallback(((android.support.v7.view.menu.MenuPresenter.Callback) (obj)));
	//   43   87:aload_2         
	//   44   88:aload_1         
	//   45   89:invokevirtual   #279 <Method void ActionMenuPresenter.setCallback(android.support.v7.view.menu.MenuPresenter$Callback)>
			mMenu.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (mPresenter)), mPopupContext);
	//   46   92:aload_0         
	//   47   93:getfield        #257 <Field MenuBuilder mMenu>
	//   48   96:aload_0         
	//   49   97:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//   50  100:aload_0         
	//   51  101:getfield        #88  <Field Context mPopupContext>
	//   52  104:invokevirtual   #283 <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter, Context)>
			mPresenter.setMenuView(this);
	//   53  107:aload_0         
	//   54  108:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//   55  111:aload_0         
	//   56  112:invokevirtual   #286 <Method void ActionMenuPresenter.setMenuView(ActionMenuView)>
		}
		return ((Menu) (mMenu));
	//   57  115:aload_0         
	//   58  116:getfield        #257 <Field MenuBuilder mMenu>
	//   59  119:areturn         
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
		if(mFormatItems && mMenu != null && k != mFormatItemsWidth)
	//*  25   49:aload_0         
	//*  26   50:getfield        #342 <Field boolean mFormatItems>
	//*  27   53:ifeq            84
	//*  28   56:aload_0         
	//*  29   57:getfield        #257 <Field MenuBuilder mMenu>
	//*  30   60:ifnull          84
	//*  31   63:iload_3         
	//*  32   64:aload_0         
	//*  33   65:getfield        #364 <Field int mFormatItemsWidth>
	//*  34   68:icmpeq          84
		{
			mFormatItemsWidth = k;
	//   35   71:aload_0         
	//   36   72:iload_3         
	//   37   73:putfield        #364 <Field int mFormatItemsWidth>
			mMenu.onItemsChanged(true);
	//   38   76:aload_0         
	//   39   77:getfield        #257 <Field MenuBuilder mMenu>
	//   40   80:iconst_1        
	//   41   81:invokevirtual   #367 <Method void MenuBuilder.onItemsChanged(boolean)>
		}
		int i1 = getChildCount();
	//   42   84:aload_0         
	//   43   85:invokevirtual   #159 <Method int getChildCount()>
	//   44   88:istore          4
		if(mFormatItems && i1 > 0)
	//*  45   90:aload_0         
	//*  46   91:getfield        #342 <Field boolean mFormatItems>
	//*  47   94:ifeq            109
	//*  48   97:iload           4
	//*  49   99:ifle            109
		{
			onMeasureExactFormat(i, j);
	//   50  102:aload_0         
	//   51  103:iload_1         
	//   52  104:iload_2         
	//   53  105:invokespecial   #369 <Method void onMeasureExactFormat(int, int)>
			return;
	//   54  108:return          
		}
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
