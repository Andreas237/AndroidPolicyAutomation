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
		boolean flag;
label0:
		{
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//    3    7:astore          9
			int j1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(k) - l, android.view.View.MeasureSpec.getMode(k));
	//    4    9:iload_3         
	//    5   10:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    6   13:iload           4
	//    7   15:isub            
	//    8   16:iload_3         
	//    9   17:invokestatic    #107 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   10   20:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   11   23:istore          6
			int i1;
			ActionMenuItemView actionmenuitemview;
			if(view instanceof ActionMenuItemView)
	//*  12   25:aload_0         
	//*  13   26:instanceof      #113 <Class ActionMenuItemView>
	//*  14   29:ifeq            176
				actionmenuitemview = (ActionMenuItemView)view;
	//   15   32:aload_0         
	//   16   33:checkcast       #113 <Class ActionMenuItemView>
	//   17   36:astore          8
			else
	//*  18   38:aload           8
	//*  19   40:ifnull          182
	//*  20   43:aload           8
	//*  21   45:invokevirtual   #117 <Method boolean ActionMenuItemView.hasText()>
	//*  22   48:ifeq            182
	//*  23   51:iconst_1        
	//*  24   52:istore          4
	//*  25   54:iconst_0        
	//*  26   55:istore          5
	//*  27   57:iload           5
	//*  28   59:istore_3        
	//*  29   60:iload_2         
	//*  30   61:ifle            131
	//*  31   64:iload           4
	//*  32   66:ifeq            77
	//*  33   69:iload           5
	//*  34   71:istore_3        
	//*  35   72:iload_2         
	//*  36   73:iconst_2        
	//*  37   74:icmplt          131
	//*  38   77:aload_0         
	//*  39   78:iload_1         
	//*  40   79:iload_2         
	//*  41   80:imul            
	//*  42   81:ldc1            #118 <Int 0x80000000>
	//*  43   83:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  44   86:iload           6
	//*  45   88:invokevirtual   #122 <Method void View.measure(int, int)>
	//*  46   91:aload_0         
	//*  47   92:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//*  48   95:istore          5
	//*  49   97:iload           5
	//*  50   99:iload_1         
	//*  51  100:idiv            
	//*  52  101:istore_3        
	//*  53  102:iload_3         
	//*  54  103:istore_2        
	//*  55  104:iload           5
	//*  56  106:iload_1         
	//*  57  107:irem            
	//*  58  108:ifeq            115
	//*  59  111:iload_3         
	//*  60  112:iconst_1        
	//*  61  113:iadd            
	//*  62  114:istore_2        
	//*  63  115:iload_2         
	//*  64  116:istore_3        
	//*  65  117:iload           4
	//*  66  119:ifeq            131
	//*  67  122:iload_2         
	//*  68  123:istore_3        
	//*  69  124:iload_2         
	//*  70  125:iconst_2        
	//*  71  126:icmpge          131
	//*  72  129:iconst_2        
	//*  73  130:istore_3        
	//*  74  131:aload           9
	//*  75  133:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//*  76  136:ifne            188
	//*  77  139:iload           4
	//*  78  141:ifeq            188
	//*  79  144:iconst_1        
	//*  80  145:istore          7
	//*  81  147:aload           9
	//*  82  149:iload           7
	//*  83  151:putfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
	//*  84  154:aload           9
	//*  85  156:iload_3         
	//*  86  157:putfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//*  87  160:aload_0         
	//*  88  161:iload_3         
	//*  89  162:iload_1         
	//*  90  163:imul            
	//*  91  164:ldc1            #136 <Int 0x40000000>
	//*  92  166:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  93  169:iload           6
	//*  94  171:invokevirtual   #122 <Method void View.measure(int, int)>
	//*  95  174:iload_3         
	//*  96  175:ireturn         
				actionmenuitemview = null;
	//   97  176:aconst_null     
	//   98  177:astore          8
			if(actionmenuitemview != null && actionmenuitemview.hasText())
				l = 1;
			else
	//*  99  179:goto            38
				l = 0;
	//  100  182:iconst_0        
	//  101  183:istore          4
			i1 = 0;
			k = i1;
			if(j <= 0)
				break label0;
			if(l != 0)
			{
				k = i1;
				if(j < 2)
					break label0;
			}
			view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i * j, 0x80000000), j1);
			i1 = view.getMeasuredWidth();
			k = i1 / i;
			j = k;
			if(i1 % i != 0)
				j = k + 1;
			k = j;
			if(l != 0)
			{
				k = j;
				if(j < 2)
					k = 2;
			}
		}
		if(!layoutparams.isOverflowButton && l != 0)
			flag = true;
		else
	//* 102  185:goto            54
			flag = false;
	//  103  188:iconst_0        
	//  104  189:istore          7
		layoutparams.expandable = flag;
		layoutparams.cellsUsed = k;
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k * i, 0x40000000), j1);
		return k;
	//* 105  191:goto            147
	}

	private void onMeasureExactFormat(int i, int j)
	{
		int l4 = android.view.View.MeasureSpec.getMode(j);
	//    0    0:iload_2         
	//    1    1:invokestatic    #107 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          18
		i = android.view.View.MeasureSpec.getSize(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore_1        
		int k4 = android.view.View.MeasureSpec.getSize(j);
	//    6   11:iload_2         
	//    7   12:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   15:istore          17
		int k = getPaddingLeft();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #140 <Method int getPaddingLeft()>
	//   11   21:istore          6
		int l = getPaddingRight();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #143 <Method int getPaddingRight()>
	//   14   27:istore          7
		int i6 = getPaddingTop() + getPaddingBottom();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #146 <Method int getPaddingTop()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #149 <Method int getPaddingBottom()>
	//   19   37:iadd            
	//   20   38:istore          23
		int i5 = getChildMeasureSpec(j, i6, -2);
	//   21   40:iload_2         
	//   22   41:iload           23
	//   23   43:bipush          -2
	//   24   45:invokestatic    #153 <Method int getChildMeasureSpec(int, int, int)>
	//   25   48:istore          19
		int j5 = i - (k + l);
	//   26   50:iload_1         
	//   27   51:iload           6
	//   28   53:iload           7
	//   29   55:iadd            
	//   30   56:isub            
	//   31   57:istore          20
		i = j5 / mMinCellSize;
	//   32   59:iload           20
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
			setMeasuredDimension(j5, 0);
	//   42   76:aload_0         
	//   43   77:iload           20
	//   44   79:iconst_0        
	//   45   80:invokevirtual   #156 <Method void setMeasuredDimension(int, int)>
			return;
	//   46   83:return          
		}
		int k5 = mMinCellSize + (j5 % j) / i;
	//   47   84:aload_0         
	//   48   85:getfield        #83  <Field int mMinCellSize>
	//   49   88:iload           20
	//   50   90:iload_2         
	//   51   91:irem            
	//   52   92:iload_1         
	//   53   93:idiv            
	//   54   94:iadd            
	//   55   95:istore          21
		k = 0;
	//   56   97:iconst_0        
	//   57   98:istore          6
		int k1 = 0;
	//   58  100:iconst_0        
	//   59  101:istore          9
		int j1 = 0;
	//   60  103:iconst_0        
	//   61  104:istore          8
		int l1 = 0;
	//   62  106:iconst_0        
	//   63  107:istore          10
		boolean flag = false;
	//   64  109:iconst_0        
	//   65  110:istore          7
		long l6 = 0L;
	//   66  112:lconst_0        
	//   67  113:lstore          25
		int l5 = getChildCount();
	//   68  115:aload_0         
	//   69  116:invokevirtual   #159 <Method int getChildCount()>
	//   70  119:istore          22
		int i2 = 0;
	//   71  121:iconst_0        
	//   72  122:istore          11
		while(i2 < l5) 
	//*  73  124:iload           11
	//*  74  126:iload           22
	//*  75  128:icmpge          435
		{
			View view = getChildAt(i2);
	//   76  131:aload_0         
	//   77  132:iload           11
	//   78  134:invokevirtual   #163 <Method View getChildAt(int)>
	//   79  137:astore          32
			boolean flag1;
			long l7;
			if(view.getVisibility() == 8)
	//*  80  139:aload           32
	//*  81  141:invokevirtual   #166 <Method int View.getVisibility()>
	//*  82  144:bipush          8
	//*  83  146:icmpne          174
			{
				l7 = l6;
	//   84  149:lload           25
	//   85  151:lstore          27
				flag1 = flag;
	//   86  153:iload           7
	//   87  155:istore          12
			} else
	//*  88  157:iload           11
	//*  89  159:iconst_1        
	//*  90  160:iadd            
	//*  91  161:istore          11
	//*  92  163:iload           12
	//*  93  165:istore          7
	//*  94  167:lload           27
	//*  95  169:lstore          25
	//*  96  171:goto            124
			{
				boolean flag2 = view instanceof ActionMenuItemView;
	//   97  174:aload           32
	//   98  176:instanceof      #113 <Class ActionMenuItemView>
	//   99  179:istore          31
				int k2 = l1 + 1;
	//  100  181:iload           10
	//  101  183:iconst_1        
	//  102  184:iadd            
	//  103  185:istore          13
				if(flag2)
	//* 104  187:iload           31
	//* 105  189:ifeq            207
					view.setPadding(mGeneratedItemPadding, 0, mGeneratedItemPadding, 0);
	//  106  192:aload           32
	//  107  194:aload_0         
	//  108  195:getfield        #86  <Field int mGeneratedItemPadding>
	//  109  198:iconst_0        
	//  110  199:aload_0         
	//  111  200:getfield        #86  <Field int mGeneratedItemPadding>
	//  112  203:iconst_0        
	//  113  204:invokevirtual   #170 <Method void View.setPadding(int, int, int, int)>
				LayoutParams layoutparams1 = (LayoutParams)view.getLayoutParams();
	//  114  207:aload           32
	//  115  209:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  116  212:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  117  215:astore          33
				layoutparams1.expanded = false;
	//  118  217:aload           33
	//  119  219:iconst_0        
	//  120  220:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
				layoutparams1.extraPixels = 0;
	//  121  223:aload           33
	//  122  225:iconst_0        
	//  123  226:putfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
				layoutparams1.cellsUsed = 0;
	//  124  229:aload           33
	//  125  231:iconst_0        
	//  126  232:putfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
				layoutparams1.expandable = false;
	//  127  235:aload           33
	//  128  237:iconst_0        
	//  129  238:putfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
				layoutparams1.leftMargin = 0;
	//  130  241:aload           33
	//  131  243:iconst_0        
	//  132  244:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
				layoutparams1.rightMargin = 0;
	//  133  247:aload           33
	//  134  249:iconst_0        
	//  135  250:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
				int i3;
				int k3;
				int i4;
				int j6;
				if(flag2 && ((ActionMenuItemView)view).hasText())
	//* 136  253:iload           31
	//* 137  255:ifeq            424
	//* 138  258:aload           32
	//* 139  260:checkcast       #113 <Class ActionMenuItemView>
	//* 140  263:invokevirtual   #117 <Method boolean ActionMenuItemView.hasText()>
	//* 141  266:ifeq            424
					flag2 = true;
	//  142  269:iconst_1        
	//  143  270:istore          31
				else
	//* 144  272:aload           33
	//* 145  274:iload           31
	//* 146  276:putfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 147  279:aload           33
	//* 148  281:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 149  284:ifeq            430
	//* 150  287:iconst_1        
	//* 151  288:istore_2        
	//* 152  289:aload           32
	//* 153  291:iload           21
	//* 154  293:iload_2         
	//* 155  294:iload           19
	//* 156  296:iload           23
	//* 157  298:invokestatic    #187 <Method int measureChildForCells(View, int, int, int, int)>
	//* 158  301:istore          24
	//* 159  303:iload           9
	//* 160  305:iload           24
	//* 161  307:invokestatic    #192 <Method int Math.max(int, int)>
	//* 162  310:istore          14
	//* 163  312:iload           8
	//* 164  314:istore_2        
	//* 165  315:aload           33
	//* 166  317:getfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
	//* 167  320:ifeq            328
	//* 168  323:iload           8
	//* 169  325:iconst_1        
	//* 170  326:iadd            
	//* 171  327:istore_2        
	//* 172  328:aload           33
	//* 173  330:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 174  333:ifeq            339
	//* 175  336:iconst_1        
	//* 176  337:istore          7
	//* 177  339:iload_1         
	//* 178  340:iload           24
	//* 179  342:isub            
	//* 180  343:istore          15
	//* 181  345:iload           6
	//* 182  347:aload           32
	//* 183  349:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//* 184  352:invokestatic    #192 <Method int Math.max(int, int)>
	//* 185  355:istore          16
	//* 186  357:iload           15
	//* 187  359:istore_1        
	//* 188  360:iload_2         
	//* 189  361:istore          8
	//* 190  363:iload           7
	//* 191  365:istore          12
	//* 192  367:iload           14
	//* 193  369:istore          9
	//* 194  371:iload           16
	//* 195  373:istore          6
	//* 196  375:lload           25
	//* 197  377:lstore          27
	//* 198  379:iload           13
	//* 199  381:istore          10
	//* 200  383:iload           24
	//* 201  385:iconst_1        
	//* 202  386:icmpne          157
	//* 203  389:lload           25
	//* 204  391:iconst_1        
	//* 205  392:iload           11
	//* 206  394:ishl            
	//* 207  395:i2l             
	//* 208  396:lor             
	//* 209  397:lstore          27
	//* 210  399:iload           15
	//* 211  401:istore_1        
	//* 212  402:iload_2         
	//* 213  403:istore          8
	//* 214  405:iload           7
	//* 215  407:istore          12
	//* 216  409:iload           14
	//* 217  411:istore          9
	//* 218  413:iload           16
	//* 219  415:istore          6
	//* 220  417:iload           13
	//* 221  419:istore          10
	//* 222  421:goto            157
					flag2 = false;
	//  223  424:iconst_0        
	//  224  425:istore          31
				layoutparams1.preventEdgeOffset = flag2;
				if(layoutparams1.isOverflowButton)
					j = 1;
				else
	//* 225  427:goto            272
					j = i;
	//  226  430:iload_1         
	//  227  431:istore_2        
				j6 = measureChildForCells(view, k5, j, i5, i6);
				i3 = Math.max(k1, j6);
				j = j1;
				if(layoutparams1.expandable)
					j = j1 + 1;
				if(layoutparams1.isOverflowButton)
					flag = true;
				k3 = i - j6;
				i4 = Math.max(k, view.getMeasuredHeight());
				i = k3;
				j1 = j;
				flag1 = flag;
				k1 = i3;
				k = i4;
				l7 = l6;
				l1 = k2;
				if(j6 == 1)
				{
					l7 = l6 | (long)(1 << i2);
					i = k3;
					j1 = j;
					flag1 = flag;
					k1 = i3;
					k = i4;
					l1 = k2;
				}
			}
			i2++;
			flag = flag1;
			l6 = l7;
		}
	//* 228  432:goto            289
		int j2;
		if(flag && l1 == 2)
	//* 229  435:iload           7
	//* 230  437:ifeq            545
	//* 231  440:iload           10
	//* 232  442:iconst_2        
	//* 233  443:icmpne          545
			i2 = 1;
	//  234  446:iconst_1        
	//  235  447:istore          11
		else
	//* 236  449:iconst_0        
	//* 237  450:istore_2        
	//* 238  451:iload_1         
	//* 239  452:istore          12
	//* 240  454:lload           25
	//* 241  456:lstore          27
	//* 242  458:iload           8
	//* 243  460:ifle            641
	//* 244  463:lload           25
	//* 245  465:lstore          27
	//* 246  467:iload           12
	//* 247  469:ifle            641
	//* 248  472:ldc1            #196 <Int 0x7fffffff>
	//* 249  474:istore          13
	//* 250  476:lconst_0        
	//* 251  477:lstore          29
	//* 252  479:iconst_0        
	//* 253  480:istore          16
	//* 254  482:iconst_0        
	//* 255  483:istore          14
	//* 256  485:iload           14
	//* 257  487:iload           22
	//* 258  489:icmpge          623
	//* 259  492:aload_0         
	//* 260  493:iload           14
	//* 261  495:invokevirtual   #163 <Method View getChildAt(int)>
	//* 262  498:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 263  501:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 264  504:astore          32
	//* 265  506:aload           32
	//* 266  508:getfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
	//* 267  511:ifne            551
	//* 268  514:lload           29
	//* 269  516:lstore          27
	//* 270  518:iload           16
	//* 271  520:istore_1        
	//* 272  521:iload           13
	//* 273  523:istore          15
	//* 274  525:iload           14
	//* 275  527:iconst_1        
	//* 276  528:iadd            
	//* 277  529:istore          14
	//* 278  531:iload           15
	//* 279  533:istore          13
	//* 280  535:iload_1         
	//* 281  536:istore          16
	//* 282  538:lload           27
	//* 283  540:lstore          29
	//* 284  542:goto            485
			i2 = 0;
	//  285  545:iconst_0        
	//  286  546:istore          11
		j = 0;
		j2 = i;
		do
		{
			int i1;
label0:
			{
label1:
				{
label2:
					{
						long l8 = l6;
						int l2;
						long l9;
						if(j1 > 0)
						{
							l8 = l6;
							if(j2 > 0)
							{
								l2 = 0x7fffffff;
								l9 = 0L;
								int j4 = 0;
								int j3 = 0;
								while(j3 < l5) 
								{
									LayoutParams layoutparams = (LayoutParams)getChildAt(j3).getLayoutParams();
									int l3;
									if(!layoutparams.expandable)
									{
										l8 = l9;
										i = j4;
										l3 = l2;
									} else
	//* 287  548:goto            449
									if(layoutparams.cellsUsed < l2)
	//* 288  551:aload           32
	//* 289  553:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 290  556:iload           13
	//* 291  558:icmpge          580
									{
										l3 = layoutparams.cellsUsed;
	//  292  561:aload           32
	//  293  563:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//  294  566:istore          15
										l8 = 1 << j3;
	//  295  568:iconst_1        
	//  296  569:iload           14
	//  297  571:ishl            
	//  298  572:i2l             
	//  299  573:lstore          27
										i = 1;
	//  300  575:iconst_1        
	//  301  576:istore_1        
									} else
	//* 302  577:goto            525
									{
										l3 = l2;
	//  303  580:iload           13
	//  304  582:istore          15
										i = j4;
	//  305  584:iload           16
	//  306  586:istore_1        
										l8 = l9;
	//  307  587:lload           29
	//  308  589:lstore          27
										if(layoutparams.cellsUsed == l2)
	//* 309  591:aload           32
	//* 310  593:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 311  596:iload           13
	//* 312  598:icmpne          525
										{
											l8 = l9 | (long)(1 << j3);
	//  313  601:lload           29
	//  314  603:iconst_1        
	//  315  604:iload           14
	//  316  606:ishl            
	//  317  607:i2l             
	//  318  608:lor             
	//  319  609:lstore          27
											i = j4 + 1;
	//  320  611:iload           16
	//  321  613:iconst_1        
	//  322  614:iadd            
	//  323  615:istore_1        
											l3 = l2;
	//  324  616:iload           13
	//  325  618:istore          15
										}
									}
									j3++;
									l2 = l3;
									j4 = i;
									l9 = l8;
								}
	//* 326  620:goto            525
								l6 |= l9;
	//  327  623:lload           25
	//  328  625:lload           29
	//  329  627:lor             
	//  330  628:lstore          25
								if(j4 <= j2)
									break label2;
	//  331  630:iload           16
	//  332  632:iload           12
	//  333  634:icmple          850
								l8 = l6;
	//  334  637:lload           25
	//  335  639:lstore          27
							}
						}
						float f1;
						float f2;
						if(!flag && l1 == 1)
	//* 336  641:iload           7
	//* 337  643:ifne            1004
	//* 338  646:iload           10
	//* 339  648:iconst_1        
	//* 340  649:icmpne          1004
							i = 1;
	//  341  652:iconst_1        
	//  342  653:istore_1        
						else
	//* 343  654:iload_2         
	//* 344  655:istore          7
	//* 345  657:iload           12
	//* 346  659:ifle            1160
	//* 347  662:iload_2         
	//* 348  663:istore          7
	//* 349  665:lload           27
	//* 350  667:lconst_0        
	//* 351  668:lcmp            
	//* 352  669:ifeq            1160
	//* 353  672:iload           12
	//* 354  674:iload           10
	//* 355  676:iconst_1        
	//* 356  677:isub            
	//* 357  678:icmplt          694
	//* 358  681:iload_1         
	//* 359  682:ifne            694
	//* 360  685:iload_2         
	//* 361  686:istore          7
	//* 362  688:iload           9
	//* 363  690:iconst_1        
	//* 364  691:icmple          1160
	//* 365  694:lload           27
	//* 366  696:invokestatic    #202 <Method int Long.bitCount(long)>
	//* 367  699:i2f             
	//* 368  700:fstore          5
	//* 369  702:fload           5
	//* 370  704:fstore          4
	//* 371  706:iload_1         
	//* 372  707:ifne            795
	//* 373  710:fload           5
	//* 374  712:fstore_3        
	//* 375  713:lconst_1        
	//* 376  714:lload           27
	//* 377  716:land            
	//* 378  717:lconst_0        
	//* 379  718:lcmp            
	//* 380  719:ifeq            748
	//* 381  722:fload           5
	//* 382  724:fstore_3        
	//* 383  725:aload_0         
	//* 384  726:iconst_0        
	//* 385  727:invokevirtual   #163 <Method View getChildAt(int)>
	//* 386  730:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 387  733:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 388  736:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 389  739:ifne            748
	//* 390  742:fload           5
	//* 391  744:ldc1            #203 <Float 0.5F>
	//* 392  746:fsub            
	//* 393  747:fstore_3        
	//* 394  748:fload_3         
	//* 395  749:fstore          4
	//* 396  751:iconst_1        
	//* 397  752:iload           22
	//* 398  754:iconst_1        
	//* 399  755:isub            
	//* 400  756:ishl            
	//* 401  757:i2l             
	//* 402  758:lload           27
	//* 403  760:land            
	//* 404  761:lconst_0        
	//* 405  762:lcmp            
	//* 406  763:ifeq            795
	//* 407  766:fload_3         
	//* 408  767:fstore          4
	//* 409  769:aload_0         
	//* 410  770:iload           22
	//* 411  772:iconst_1        
	//* 412  773:isub            
	//* 413  774:invokevirtual   #163 <Method View getChildAt(int)>
	//* 414  777:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 415  780:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 416  783:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 417  786:ifne            795
	//* 418  789:fload_3         
	//* 419  790:ldc1            #203 <Float 0.5F>
	//* 420  792:fsub            
	//* 421  793:fstore          4
	//* 422  795:fload           4
	//* 423  797:fconst_0        
	//* 424  798:fcmpl           
	//* 425  799:ifle            1009
	//* 426  802:iload           12
	//* 427  804:iload           21
	//* 428  806:imul            
	//* 429  807:i2f             
	//* 430  808:fload           4
	//* 431  810:fdiv            
	//* 432  811:f2i             
	//* 433  812:istore          7
	//* 434  814:iconst_0        
	//* 435  815:istore          8
	//* 436  817:iload           8
	//* 437  819:iload           22
	//* 438  821:icmpge          1157
	//* 439  824:iconst_1        
	//* 440  825:iload           8
	//* 441  827:ishl            
	//* 442  828:i2l             
	//* 443  829:lload           27
	//* 444  831:land            
	//* 445  832:lconst_0        
	//* 446  833:lcmp            
	//* 447  834:ifne            1015
	//* 448  837:iload_2         
	//* 449  838:istore_1        
	//* 450  839:iload           8
	//* 451  841:iconst_1        
	//* 452  842:iadd            
	//* 453  843:istore          8
	//* 454  845:iload_1         
	//* 455  846:istore_2        
	//* 456  847:goto            817
	//* 457  850:iconst_0        
	//* 458  851:istore_1        
	//* 459  852:iload_1         
	//* 460  853:iload           22
	//* 461  855:icmpge          999
	//* 462  858:aload_0         
	//* 463  859:iload_1         
	//* 464  860:invokevirtual   #163 <Method View getChildAt(int)>
	//* 465  863:astore          32
	//* 466  865:aload           32
	//* 467  867:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 468  870:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 469  873:astore          33
	//* 470  875:iconst_1        
	//* 471  876:iload_1         
	//* 472  877:ishl            
	//* 473  878:i2l             
	//* 474  879:lload           29
	//* 475  881:land            
	//* 476  882:lconst_0        
	//* 477  883:lcmp            
	//* 478  884:ifne            932
	//* 479  887:iload           12
	//* 480  889:istore_2        
	//* 481  890:lload           25
	//* 482  892:lstore          27
	//* 483  894:aload           33
	//* 484  896:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 485  899:iload           13
	//* 486  901:iconst_1        
	//* 487  902:iadd            
	//* 488  903:icmpne          918
	//* 489  906:lload           25
	//* 490  908:iconst_1        
	//* 491  909:iload_1         
	//* 492  910:ishl            
	//* 493  911:i2l             
	//* 494  912:lor             
	//* 495  913:lstore          27
	//* 496  915:iload           12
	//* 497  917:istore_2        
	//* 498  918:iload_1         
	//* 499  919:iconst_1        
	//* 500  920:iadd            
	//* 501  921:istore_1        
	//* 502  922:iload_2         
	//* 503  923:istore          12
	//* 504  925:lload           27
	//* 505  927:lstore          25
	//* 506  929:goto            852
	//* 507  932:iload           11
	//* 508  934:ifeq            969
	//* 509  937:aload           33
	//* 510  939:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 511  942:ifeq            969
	//* 512  945:iload           12
	//* 513  947:iconst_1        
	//* 514  948:icmpne          969
	//* 515  951:aload           32
	//* 516  953:aload_0         
	//* 517  954:getfield        #86  <Field int mGeneratedItemPadding>
	//* 518  957:iload           21
	//* 519  959:iadd            
	//* 520  960:iconst_0        
	//* 521  961:aload_0         
	//* 522  962:getfield        #86  <Field int mGeneratedItemPadding>
	//* 523  965:iconst_0        
	//* 524  966:invokevirtual   #170 <Method void View.setPadding(int, int, int, int)>
	//* 525  969:aload           33
	//* 526  971:aload           33
	//* 527  973:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 528  976:iconst_1        
	//* 529  977:iadd            
	//* 530  978:putfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 531  981:aload           33
	//* 532  983:iconst_1        
	//* 533  984:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
	//* 534  987:iload           12
	//* 535  989:iconst_1        
	//* 536  990:isub            
	//* 537  991:istore_2        
	//* 538  992:lload           25
	//* 539  994:lstore          27
	//* 540  996:goto            918
	//* 541  999:iconst_1        
	//* 542 1000:istore_2        
	//* 543 1001:goto            454
							i = 0;
	//  544 1004:iconst_0        
	//  545 1005:istore_1        
						i1 = j;
						if(j2 <= 0)
							break label0;
						i1 = j;
						if(l8 == 0L)
							break label0;
						if(j2 >= l1 - 1 && i == 0)
						{
							i1 = j;
							if(k1 <= 1)
								break label0;
						}
						f2 = Long.bitCount(l8);
						f1 = f2;
						if(i == 0)
						{
							float f = f2;
							if((1L & l8) != 0L)
							{
								f = f2;
								if(!((LayoutParams)getChildAt(0).getLayoutParams()).preventEdgeOffset)
									f = f2 - 0.5F;
							}
							f1 = f;
							if(((long)(1 << l5 - 1) & l8) != 0L)
							{
								f1 = f;
								if(!((LayoutParams)getChildAt(l5 - 1).getLayoutParams()).preventEdgeOffset)
									f1 = f - 0.5F;
							}
						}
						if(f1 > 0.0F)
							i1 = (int)((float)(j2 * k5) / f1);
						else
	//* 546 1006:goto            654
							i1 = 0;
	//  547 1009:iconst_0        
	//  548 1010:istore          7
						j1 = 0;
						while(j1 < l5) 
						{
							View view1;
							LayoutParams layoutparams2;
							if(((long)(1 << j1) & l8) == 0L)
							{
								i = j;
							} else
	//* 549 1012:goto            814
							{
								View view2 = getChildAt(j1);
	//  550 1015:aload_0         
	//  551 1016:iload           8
	//  552 1018:invokevirtual   #163 <Method View getChildAt(int)>
	//  553 1021:astore          32
								LayoutParams layoutparams3 = (LayoutParams)view2.getLayoutParams();
	//  554 1023:aload           32
	//  555 1025:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  556 1028:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  557 1031:astore          33
								if(view2 instanceof ActionMenuItemView)
	//* 558 1033:aload           32
	//* 559 1035:instanceof      #113 <Class ActionMenuItemView>
	//* 560 1038:ifeq            1082
								{
									layoutparams3.extraPixels = i1;
	//  561 1041:aload           33
	//  562 1043:iload           7
	//  563 1045:putfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
									layoutparams3.expanded = true;
	//  564 1048:aload           33
	//  565 1050:iconst_1        
	//  566 1051:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
									if(j1 == 0 && !layoutparams3.preventEdgeOffset)
	//* 567 1054:iload           8
	//* 568 1056:ifne            1077
	//* 569 1059:aload           33
	//* 570 1061:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 571 1064:ifne            1077
										layoutparams3.leftMargin = -i1 / 2;
	//  572 1067:aload           33
	//  573 1069:iload           7
	//  574 1071:ineg            
	//  575 1072:iconst_2        
	//  576 1073:idiv            
	//  577 1074:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
									i = 1;
	//  578 1077:iconst_1        
	//  579 1078:istore_1        
								} else
	//* 580 1079:goto            839
								if(layoutparams3.isOverflowButton)
	//* 581 1082:aload           33
	//* 582 1084:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 583 1087:ifeq            1118
								{
									layoutparams3.extraPixels = i1;
	//  584 1090:aload           33
	//  585 1092:iload           7
	//  586 1094:putfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
									layoutparams3.expanded = true;
	//  587 1097:aload           33
	//  588 1099:iconst_1        
	//  589 1100:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
									layoutparams3.rightMargin = -i1 / 2;
	//  590 1103:aload           33
	//  591 1105:iload           7
	//  592 1107:ineg            
	//  593 1108:iconst_2        
	//  594 1109:idiv            
	//  595 1110:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
									i = 1;
	//  596 1113:iconst_1        
	//  597 1114:istore_1        
								} else
	//* 598 1115:goto            839
								{
									if(j1 != 0)
	//* 599 1118:iload           8
	//* 600 1120:ifeq            1132
										layoutparams3.leftMargin = i1 / 2;
	//  601 1123:aload           33
	//  602 1125:iload           7
	//  603 1127:iconst_2        
	//  604 1128:idiv            
	//  605 1129:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
									i = j;
	//  606 1132:iload_2         
	//  607 1133:istore_1        
									if(j1 != l5 - 1)
	//* 608 1134:iload           8
	//* 609 1136:iload           22
	//* 610 1138:iconst_1        
	//* 611 1139:isub            
	//* 612 1140:icmpeq          839
									{
										layoutparams3.rightMargin = i1 / 2;
	//  613 1143:aload           33
	//  614 1145:iload           7
	//  615 1147:iconst_2        
	//  616 1148:idiv            
	//  617 1149:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
										i = j;
	//  618 1152:iload_2         
	//  619 1153:istore_1        
									}
								}
							}
							j1++;
							j = i;
						}
						break label1;
	//  620 1154:goto            839
					}
					i = 0;
					while(i < l5) 
					{
						view1 = getChildAt(i);
						layoutparams2 = (LayoutParams)view1.getLayoutParams();
						if(((long)(1 << i) & l9) == 0L)
						{
							j = j2;
							l8 = l6;
							if(layoutparams2.cellsUsed == l2 + 1)
							{
								l8 = l6 | (long)(1 << i);
								j = j2;
							}
						} else
						{
							if(i2 && layoutparams2.preventEdgeOffset && j2 == 1)
								view1.setPadding(mGeneratedItemPadding + k5, 0, mGeneratedItemPadding, 0);
							layoutparams2.cellsUsed = layoutparams2.cellsUsed + 1;
							layoutparams2.expanded = true;
							j = j2 - 1;
							l8 = l6;
						}
						i++;
						j2 = j;
						l6 = l8;
					}
					j = 1;
					continue;
				}
				i1 = j;
	//  621 1157:iload_2         
	//  622 1158:istore          7
			}
			if(i1 != 0)
	//* 623 1160:iload           7
	//* 624 1162:ifeq            1234
			{
				i = 0;
	//  625 1165:iconst_0        
	//  626 1166:istore_1        
				while(i < l5) 
	//* 627 1167:iload_1         
	//* 628 1168:iload           22
	//* 629 1170:icmpge          1234
				{
					View view3 = getChildAt(i);
	//  630 1173:aload_0         
	//  631 1174:iload_1         
	//  632 1175:invokevirtual   #163 <Method View getChildAt(int)>
	//  633 1178:astore          32
					LayoutParams layoutparams4 = (LayoutParams)view3.getLayoutParams();
	//  634 1180:aload           32
	//  635 1182:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  636 1185:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  637 1188:astore          33
					if(layoutparams4.expanded)
	//* 638 1190:aload           33
	//* 639 1192:getfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
	//* 640 1195:ifne            1205
	//* 641 1198:iload_1         
	//* 642 1199:iconst_1        
	//* 643 1200:iadd            
	//* 644 1201:istore_1        
	//* 645 1202:goto            1167
						view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams4.cellsUsed * k5 + layoutparams4.extraPixels, 0x40000000), i5);
	//  646 1205:aload           32
	//  647 1207:aload           33
	//  648 1209:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//  649 1212:iload           21
	//  650 1214:imul            
	//  651 1215:aload           33
	//  652 1217:getfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
	//  653 1220:iadd            
	//  654 1221:ldc1            #136 <Int 0x40000000>
	//  655 1223:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  656 1226:iload           19
	//  657 1228:invokevirtual   #122 <Method void View.measure(int, int)>
					i++;
				}
			}
	//* 658 1231:goto            1198
			i = k4;
	//  659 1234:iload           17
	//  660 1236:istore_1        
			if(l4 != 0x40000000)
	//* 661 1237:iload           18
	//* 662 1239:ldc1            #136 <Int 0x40000000>
	//* 663 1241:icmpeq          1247
				i = k;
	//  664 1244:iload           6
	//  665 1246:istore_1        
			setMeasuredDimension(j5, i);
	//  666 1247:aload_0         
	//  667 1248:iload           20
	//  668 1250:iload_1         
	//  669 1251:invokevirtual   #156 <Method void setMeasuredDimension(int, int)>
			return;
	//  670 1254:return          
		} while(true);
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
		boolean flag1;
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            8
		{
			flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore_3        
		} else
	//*   4    6:iload_3         
	//*   5    7:ireturn         
		{
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
			flag1 = false;
	//   16   24:iconst_0        
	//   17   25:istore_3        
			boolean flag = flag1;
	//   18   26:iload_3         
	//   19   27:istore_2        
			if(i < getChildCount())
	//*  20   28:iload_1         
	//*  21   29:aload_0         
	//*  22   30:invokevirtual   #159 <Method int getChildCount()>
	//*  23   33:icmpge          59
			{
				flag = flag1;
	//   24   36:iload_3         
	//   25   37:istore_2        
				if(view instanceof ActionMenuChildView)
	//*  26   38:aload           4
	//*  27   40:instanceof      #10  <Class ActionMenuView$ActionMenuChildView>
	//*  28   43:ifeq            59
					flag = false | ((ActionMenuChildView)view).needsDividerAfter();
	//   29   46:iconst_0        
	//   30   47:aload           4
	//   31   49:checkcast       #10  <Class ActionMenuView$ActionMenuChildView>
	//   32   52:invokeinterface #300 <Method boolean ActionMenuView$ActionMenuChildView.needsDividerAfter()>
	//   33   57:ior             
	//   34   58:istore_2        
			}
			flag1 = flag;
	//   35   59:iload_2         
	//   36   60:istore_3        
			if(i > 0)
	//*  37   61:iload_1         
	//*  38   62:ifle            6
			{
				flag1 = flag;
	//   39   65:iload_2         
	//   40   66:istore_3        
				if(view1 instanceof ActionMenuChildView)
	//*  41   67:aload           5
	//*  42   69:instanceof      #10  <Class ActionMenuView$ActionMenuChildView>
	//*  43   72:ifeq            6
					return flag | ((ActionMenuChildView)view1).needsDividerBefore();
	//   44   75:iload_2         
	//   45   76:aload           5
	//   46   78:checkcast       #10  <Class ActionMenuView$ActionMenuChildView>
	//   47   81:invokeinterface #303 <Method boolean ActionMenuView$ActionMenuChildView.needsDividerBefore()>
	//   48   86:ior             
	//   49   87:ireturn         
			}
		}
		return flag1;
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
		int k3;
		int l3;
		l3 = getChildCount();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #159 <Method int getChildCount()>
	//   13   23:istore          12
		k3 = (l - j) / 2;
	//   14   25:iload           5
	//   15   27:iload_3         
	//   16   28:isub            
	//   17   29:iconst_2        
	//   18   30:idiv            
	//   19   31:istore          11
		int i4 = getDividerWidth();
	//   20   33:aload_0         
	//   21   34:invokevirtual   #347 <Method int getDividerWidth()>
	//   22   37:istore          13
		int l1 = 0;
	//   23   39:iconst_0        
	//   24   40:istore          7
		l = 0;
	//   25   42:iconst_0        
	//   26   43:istore          5
		j = k - i - getPaddingRight() - getPaddingLeft();
	//   27   45:iload           4
	//   28   47:iload_2         
	//   29   48:isub            
	//   30   49:aload_0         
	//   31   50:invokevirtual   #143 <Method int getPaddingRight()>
	//   32   53:isub            
	//   33   54:aload_0         
	//   34   55:invokevirtual   #140 <Method int getPaddingLeft()>
	//   35   58:isub            
	//   36   59:istore_3        
		int k2 = 0;
	//   37   60:iconst_0        
	//   38   61:istore          8
		flag = ViewUtils.isLayoutRtl(((View) (this)));
	//   39   63:aload_0         
	//   40   64:invokestatic    #353 <Method boolean ViewUtils.isLayoutRtl(View)>
	//   41   67:istore_1        
		int i1 = 0;
	//   42   68:iconst_0        
	//   43   69:istore          6
		while(i1 < l3) 
	//*  44   71:iload           6
	//*  45   73:iload           12
	//*  46   75:icmpge          308
		{
			View view = getChildAt(i1);
	//   47   78:aload_0         
	//   48   79:iload           6
	//   49   81:invokevirtual   #163 <Method View getChildAt(int)>
	//   50   84:astore          16
			if(view.getVisibility() != 8)
	//*  51   86:aload           16
	//*  52   88:invokevirtual   #166 <Method int View.getVisibility()>
	//*  53   91:bipush          8
	//*  54   93:icmpne          105
	//*  55   96:iload           6
	//*  56   98:iconst_1        
	//*  57   99:iadd            
	//*  58  100:istore          6
	//*  59  102:goto            71
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   60  105:aload           16
	//   61  107:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   62  110:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//   63  113:astore          17
				if(layoutparams.isOverflowButton)
	//*  64  115:aload           17
	//*  65  117:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//*  66  120:ifeq            243
				{
					int l2 = view.getMeasuredWidth();
	//   67  123:aload           16
	//   68  125:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//   69  128:istore          9
					k2 = l2;
	//   70  130:iload           9
	//   71  132:istore          8
					if(hasSupportDividerBeforeChildAt(i1))
	//*  72  134:aload_0         
	//*  73  135:iload           6
	//*  74  137:invokevirtual   #355 <Method boolean hasSupportDividerBeforeChildAt(int)>
	//*  75  140:ifeq            150
						k2 = l2 + i4;
	//   76  143:iload           9
	//   77  145:iload           13
	//   78  147:iadd            
	//   79  148:istore          8
					int j4 = view.getMeasuredHeight();
	//   80  150:aload           16
	//   81  152:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//   82  155:istore          14
					int j3;
					int k4;
					if(flag)
	//*  83  157:iload_1         
	//*  84  158:ifeq            216
					{
						l2 = getPaddingLeft() + layoutparams.leftMargin;
	//   85  161:aload_0         
	//   86  162:invokevirtual   #140 <Method int getPaddingLeft()>
	//   87  165:aload           17
	//   88  167:getfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//   89  170:iadd            
	//   90  171:istore          9
						j3 = l2 + k2;
	//   91  173:iload           9
	//   92  175:iload           8
	//   93  177:iadd            
	//   94  178:istore          10
					} else
	//*  95  180:iload           11
	//*  96  182:iload           14
	//*  97  184:iconst_2        
	//*  98  185:idiv            
	//*  99  186:isub            
	//* 100  187:istore          15
	//* 101  189:aload           16
	//* 102  191:iload           9
	//* 103  193:iload           15
	//* 104  195:iload           10
	//* 105  197:iload           15
	//* 106  199:iload           14
	//* 107  201:iadd            
	//* 108  202:invokevirtual   #358 <Method void View.layout(int, int, int, int)>
	//* 109  205:iload_3         
	//* 110  206:iload           8
	//* 111  208:isub            
	//* 112  209:istore_3        
	//* 113  210:iconst_1        
	//* 114  211:istore          8
	//* 115  213:goto            96
					{
						j3 = getWidth() - getPaddingRight() - layoutparams.rightMargin;
	//  116  216:aload_0         
	//  117  217:invokevirtual   #361 <Method int getWidth()>
	//  118  220:aload_0         
	//  119  221:invokevirtual   #143 <Method int getPaddingRight()>
	//  120  224:isub            
	//  121  225:aload           17
	//  122  227:getfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  123  230:isub            
	//  124  231:istore          10
						l2 = j3 - k2;
	//  125  233:iload           10
	//  126  235:iload           8
	//  127  237:isub            
	//  128  238:istore          9
					}
					k4 = k3 - j4 / 2;
					view.layout(l2, k4, j3, k4 + j4);
					j -= k2;
					k2 = 1;
				} else
	//* 129  240:goto            180
				{
					int i3 = view.getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin;
	//  130  243:aload           16
	//  131  245:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//  132  248:aload           17
	//  133  250:getfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  134  253:iadd            
	//  135  254:aload           17
	//  136  256:getfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  137  259:iadd            
	//  138  260:istore          9
					l1 += i3;
	//  139  262:iload           7
	//  140  264:iload           9
	//  141  266:iadd            
	//  142  267:istore          7
					i3 = j - i3;
	//  143  269:iload_3         
	//  144  270:iload           9
	//  145  272:isub            
	//  146  273:istore          9
					j = l1;
	//  147  275:iload           7
	//  148  277:istore_3        
					if(hasSupportDividerBeforeChildAt(i1))
	//* 149  278:aload_0         
	//* 150  279:iload           6
	//* 151  281:invokevirtual   #355 <Method boolean hasSupportDividerBeforeChildAt(int)>
	//* 152  284:ifeq            293
						j = l1 + i4;
	//  153  287:iload           7
	//  154  289:iload           13
	//  155  291:iadd            
	//  156  292:istore_3        
					l++;
	//  157  293:iload           5
	//  158  295:iconst_1        
	//  159  296:iadd            
	//  160  297:istore          5
					l1 = j;
	//  161  299:iload_3         
	//  162  300:istore          7
					j = i3;
	//  163  302:iload           9
	//  164  304:istore_3        
				}
			}
			i1++;
		}
	//* 165  305:goto            96
		if(l3 == 1 && k2 == 0)
	//* 166  308:iload           12
	//* 167  310:iconst_1        
	//* 168  311:icmpne          376
	//* 169  314:iload           8
	//* 170  316:ifne            376
		{
			View view1 = getChildAt(0);
	//  171  319:aload_0         
	//  172  320:iconst_0        
	//  173  321:invokevirtual   #163 <Method View getChildAt(int)>
	//  174  324:astore          16
			j = view1.getMeasuredWidth();
	//  175  326:aload           16
	//  176  328:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//  177  331:istore_3        
			l = view1.getMeasuredHeight();
	//  178  332:aload           16
	//  179  334:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//  180  337:istore          5
			i = (k - i) / 2 - j / 2;
	//  181  339:iload           4
	//  182  341:iload_2         
	//  183  342:isub            
	//  184  343:iconst_2        
	//  185  344:idiv            
	//  186  345:iload_3         
	//  187  346:iconst_2        
	//  188  347:idiv            
	//  189  348:isub            
	//  190  349:istore_2        
			k = k3 - l / 2;
	//  191  350:iload           11
	//  192  352:iload           5
	//  193  354:iconst_2        
	//  194  355:idiv            
	//  195  356:isub            
	//  196  357:istore          4
			view1.layout(i, k, i + j, k + l);
	//  197  359:aload           16
	//  198  361:iload_2         
	//  199  362:iload           4
	//  200  364:iload_2         
	//  201  365:iload_3         
	//  202  366:iadd            
	//  203  367:iload           4
	//  204  369:iload           5
	//  205  371:iadd            
	//  206  372:invokevirtual   #358 <Method void View.layout(int, int, int, int)>
			return;
	//  207  375:return          
		}
		if(k2 != 0)
	//* 208  376:iload           8
	//* 209  378:ifeq            476
			i = 0;
	//  210  381:iconst_0        
	//  211  382:istore_2        
		else
	//* 212  383:iload           5
	//* 213  385:iload_2         
	//* 214  386:isub            
	//* 215  387:istore_2        
	//* 216  388:iload_2         
	//* 217  389:ifle            481
	//* 218  392:iload_3         
	//* 219  393:iload_2         
	//* 220  394:idiv            
	//* 221  395:istore_2        
	//* 222  396:iconst_0        
	//* 223  397:iload_2         
	//* 224  398:invokestatic    #192 <Method int Math.max(int, int)>
	//* 225  401:istore          5
	//* 226  403:iload_1         
	//* 227  404:ifeq            552
	//* 228  407:aload_0         
	//* 229  408:invokevirtual   #361 <Method int getWidth()>
	//* 230  411:aload_0         
	//* 231  412:invokevirtual   #143 <Method int getPaddingRight()>
	//* 232  415:isub            
	//* 233  416:istore_3        
	//* 234  417:iconst_0        
	//* 235  418:istore_2        
	//* 236  419:iload_2         
	//* 237  420:iload           12
	//* 238  422:icmpge          18
	//* 239  425:aload_0         
	//* 240  426:iload_2         
	//* 241  427:invokevirtual   #163 <Method View getChildAt(int)>
	//* 242  430:astore          16
	//* 243  432:aload           16
	//* 244  434:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 245  437:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 246  440:astore          17
	//* 247  442:iload_3         
	//* 248  443:istore          4
	//* 249  445:aload           16
	//* 250  447:invokevirtual   #166 <Method int View.getVisibility()>
	//* 251  450:bipush          8
	//* 252  452:icmpeq          466
	//* 253  455:aload           17
	//* 254  457:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 255  460:ifeq            486
	//* 256  463:iload_3         
	//* 257  464:istore          4
	//* 258  466:iload_2         
	//* 259  467:iconst_1        
	//* 260  468:iadd            
	//* 261  469:istore_2        
	//* 262  470:iload           4
	//* 263  472:istore_3        
	//* 264  473:goto            419
			i = 1;
	//  265  476:iconst_1        
	//  266  477:istore_2        
		i = l - i;
		if(i > 0)
			i = j / i;
		else
	//* 267  478:goto            383
			i = 0;
	//  268  481:iconst_0        
	//  269  482:istore_2        
		l = Math.max(0, i);
		if(!flag)
			break; /* Loop/switch isn't completed */
		j = getWidth() - getPaddingRight();
		i = 0;
		while(i < l3) 
		{
			View view2 = getChildAt(i);
			LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
			k = j;
			if(view2.getVisibility() != 8)
				if(layoutparams1.isOverflowButton)
				{
					k = j;
				} else
	//* 270  483:goto            396
				{
					j -= layoutparams1.rightMargin;
	//  271  486:iload_3         
	//  272  487:aload           17
	//  273  489:getfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  274  492:isub            
	//  275  493:istore_3        
					k = view2.getMeasuredWidth();
	//  276  494:aload           16
	//  277  496:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//  278  499:istore          4
					int j1 = view2.getMeasuredHeight();
	//  279  501:aload           16
	//  280  503:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//  281  506:istore          6
					int i2 = k3 - j1 / 2;
	//  282  508:iload           11
	//  283  510:iload           6
	//  284  512:iconst_2        
	//  285  513:idiv            
	//  286  514:isub            
	//  287  515:istore          7
					view2.layout(j - k, i2, j, i2 + j1);
	//  288  517:aload           16
	//  289  519:iload_3         
	//  290  520:iload           4
	//  291  522:isub            
	//  292  523:iload           7
	//  293  525:iload_3         
	//  294  526:iload           7
	//  295  528:iload           6
	//  296  530:iadd            
	//  297  531:invokevirtual   #358 <Method void View.layout(int, int, int, int)>
					k = j - (layoutparams1.leftMargin + k + l);
	//  298  534:iload_3         
	//  299  535:aload           17
	//  300  537:getfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  301  540:iload           4
	//  302  542:iadd            
	//  303  543:iload           5
	//  304  545:iadd            
	//  305  546:isub            
	//  306  547:istore          4
				}
			i++;
			j = k;
		}
		if(true) goto _L4; else goto _L3
	//  307  549:goto            466
_L3:
		j = getPaddingLeft();
	//  308  552:aload_0         
	//  309  553:invokevirtual   #140 <Method int getPaddingLeft()>
	//  310  556:istore_3        
		i = 0;
	//  311  557:iconst_0        
	//  312  558:istore_2        
		while(i < l3) 
	//* 313  559:iload_2         
	//* 314  560:iload           12
	//* 315  562:icmpge          18
		{
			View view3 = getChildAt(i);
	//  316  565:aload_0         
	//  317  566:iload_2         
	//  318  567:invokevirtual   #163 <Method View getChildAt(int)>
	//  319  570:astore          16
			LayoutParams layoutparams2 = (LayoutParams)view3.getLayoutParams();
	//  320  572:aload           16
	//  321  574:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  322  577:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  323  580:astore          17
			k = j;
	//  324  582:iload_3         
	//  325  583:istore          4
			if(view3.getVisibility() != 8)
	//* 326  585:aload           16
	//* 327  587:invokevirtual   #166 <Method int View.getVisibility()>
	//* 328  590:bipush          8
	//* 329  592:icmpeq          606
				if(layoutparams2.isOverflowButton)
	//* 330  595:aload           17
	//* 331  597:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 332  600:ifeq            616
				{
					k = j;
	//  333  603:iload_3         
	//  334  604:istore          4
				} else
	//* 335  606:iload_2         
	//* 336  607:iconst_1        
	//* 337  608:iadd            
	//* 338  609:istore_2        
	//* 339  610:iload           4
	//* 340  612:istore_3        
	//* 341  613:goto            559
				{
					j += layoutparams2.leftMargin;
	//  342  616:iload_3         
	//  343  617:aload           17
	//  344  619:getfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  345  622:iadd            
	//  346  623:istore_3        
					k = view3.getMeasuredWidth();
	//  347  624:aload           16
	//  348  626:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//  349  629:istore          4
					int k1 = view3.getMeasuredHeight();
	//  350  631:aload           16
	//  351  633:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//  352  636:istore          6
					int j2 = k3 - k1 / 2;
	//  353  638:iload           11
	//  354  640:iload           6
	//  355  642:iconst_2        
	//  356  643:idiv            
	//  357  644:isub            
	//  358  645:istore          7
					view3.layout(j, j2, j + k, j2 + k1);
	//  359  647:aload           16
	//  360  649:iload_3         
	//  361  650:iload           7
	//  362  652:iload_3         
	//  363  653:iload           4
	//  364  655:iadd            
	//  365  656:iload           7
	//  366  658:iload           6
	//  367  660:iadd            
	//  368  661:invokevirtual   #358 <Method void View.layout(int, int, int, int)>
					k = j + (layoutparams2.rightMargin + k + l);
	//  369  664:iload_3         
	//  370  665:aload           17
	//  371  667:getfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  372  670:iload           4
	//  373  672:iadd            
	//  374  673:iload           5
	//  375  675:iadd            
	//  376  676:iadd            
	//  377  677:istore          4
				}
			i++;
			j = k;
		}
		if(true) goto _L4; else goto _L5
	//  378  679:goto            606
_L5:
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
