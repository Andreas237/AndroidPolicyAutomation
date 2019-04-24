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

	class ActionMenuPresenterCallback
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

		final ActionMenuView this$0;

		ActionMenuPresenterCallback()
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

	class MenuBuilderCallback
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
		int j1;
		LayoutParams layoutparams;
label0:
		{
			layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//    3    7:astore          9
			j1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(k) - l, android.view.View.MeasureSpec.getMode(k));
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
	//   17   36:astore          8
			else
	//*  18   38:goto            44
				actionmenuitemview = null;
	//   19   41:aconst_null     
	//   20   42:astore          8
			if(actionmenuitemview != null && actionmenuitemview.hasText())
	//*  21   44:aload           8
	//*  22   46:ifnull          63
	//*  23   49:aload           8
	//*  24   51:invokevirtual   #117 <Method boolean ActionMenuItemView.hasText()>
	//*  25   54:ifeq            63
				l = 1;
	//   26   57:iconst_1        
	//   27   58:istore          4
			else
	//*  28   60:goto            66
				l = 0;
	//   29   63:iconst_0        
	//   30   64:istore          4
			int i1 = 0;
	//   31   66:iconst_0        
	//   32   67:istore          5
			k = i1;
	//   33   69:iload           5
	//   34   71:istore_3        
			if(j <= 0)
				break label0;
	//   35   72:iload_2         
	//   36   73:ifle            143
			if(l != 0)
	//*  37   76:iload           4
	//*  38   78:ifeq            89
			{
				k = i1;
	//   39   81:iload           5
	//   40   83:istore_3        
				if(j < 2)
					break label0;
	//   41   84:iload_2         
	//   42   85:iconst_2        
	//   43   86:icmplt          143
			}
			view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i * j, 0x80000000), j1);
	//   44   89:aload_0         
	//   45   90:iload_1         
	//   46   91:iload_2         
	//   47   92:imul            
	//   48   93:ldc1            #118 <Int 0x80000000>
	//   49   95:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   50   98:iload           6
	//   51  100:invokevirtual   #122 <Method void View.measure(int, int)>
			i1 = view.getMeasuredWidth();
	//   52  103:aload_0         
	//   53  104:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//   54  107:istore          5
			k = i1 / i;
	//   55  109:iload           5
	//   56  111:iload_1         
	//   57  112:idiv            
	//   58  113:istore_3        
			j = k;
	//   59  114:iload_3         
	//   60  115:istore_2        
			if(i1 % i != 0)
	//*  61  116:iload           5
	//*  62  118:iload_1         
	//*  63  119:irem            
	//*  64  120:ifeq            127
				j = k + 1;
	//   65  123:iload_3         
	//   66  124:iconst_1        
	//   67  125:iadd            
	//   68  126:istore_2        
			k = j;
	//   69  127:iload_2         
	//   70  128:istore_3        
			if(l != 0)
	//*  71  129:iload           4
	//*  72  131:ifeq            143
			{
				k = j;
	//   73  134:iload_2         
	//   74  135:istore_3        
				if(j < 2)
	//*  75  136:iload_2         
	//*  76  137:iconst_2        
	//*  77  138:icmpge          143
					k = 2;
	//   78  141:iconst_2        
	//   79  142:istore_3        
			}
		}
		boolean flag;
		if(!layoutparams.isOverflowButton && l != 0)
	//*  80  143:aload           9
	//*  81  145:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//*  82  148:ifne            162
	//*  83  151:iload           4
	//*  84  153:ifeq            162
			flag = true;
	//   85  156:iconst_1        
	//   86  157:istore          7
		else
	//*  87  159:goto            165
			flag = false;
	//   88  162:iconst_0        
	//   89  163:istore          7
		layoutparams.expandable = flag;
	//   90  165:aload           9
	//   91  167:iload           7
	//   92  169:putfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
		layoutparams.cellsUsed = k;
	//   93  172:aload           9
	//   94  174:iload_3         
	//   95  175:putfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k * i, 0x40000000), j1);
	//   96  178:aload_0         
	//   97  179:iload_3         
	//   98  180:iload_1         
	//   99  181:imul            
	//  100  182:ldc1            #136 <Int 0x40000000>
	//  101  184:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  102  187:iload           6
	//  103  189:invokevirtual   #122 <Method void View.measure(int, int)>
		return k;
	//  104  192:iload_3         
	//  105  193:ireturn         
	}

	private void onMeasureExactFormat(int i, int j)
	{
		int k;
		int l;
		int k4;
		int l4;
		int i5;
		int j5;
		int k5;
		int l5;
label0:
		{
			l4 = android.view.View.MeasureSpec.getMode(j);
	//    0    0:iload_2         
	//    1    1:invokestatic    #107 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          18
			i = android.view.View.MeasureSpec.getSize(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore_1        
			k4 = android.view.View.MeasureSpec.getSize(j);
	//    6   11:iload_2         
	//    7   12:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   15:istore          17
			k = getPaddingLeft();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #140 <Method int getPaddingLeft()>
	//   11   21:istore          6
			l = getPaddingRight();
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
			i5 = getChildMeasureSpec(j, i6, -2);
	//   21   40:iload_2         
	//   22   41:iload           23
	//   23   43:bipush          -2
	//   24   45:invokestatic    #153 <Method int getChildMeasureSpec(int, int, int)>
	//   25   48:istore          19
			j5 = i - (k + l);
	//   26   50:iload_1         
	//   27   51:iload           6
	//   28   53:iload           7
	//   29   55:iadd            
	//   30   56:isub            
	//   31   57:istore          20
			j = j5 / mMinCellSize;
	//   32   59:iload           20
	//   33   61:aload_0         
	//   34   62:getfield        #83  <Field int mMinCellSize>
	//   35   65:idiv            
	//   36   66:istore_2        
			i = mMinCellSize;
	//   37   67:aload_0         
	//   38   68:getfield        #83  <Field int mMinCellSize>
	//   39   71:istore_1        
			if(j == 0)
	//*  40   72:iload_2         
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
			k5 = mMinCellSize + (j5 % i) / j;
	//   47   84:aload_0         
	//   48   85:getfield        #83  <Field int mMinCellSize>
	//   49   88:iload           20
	//   50   90:iload_1         
	//   51   91:irem            
	//   52   92:iload_2         
	//   53   93:idiv            
	//   54   94:iadd            
	//   55   95:istore          21
			k = 0;
	//   56   97:iconst_0        
	//   57   98:istore          6
			int k1 = 0;
	//   58  100:iconst_0        
	//   59  101:istore          9
			int i1 = 0;
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
			l5 = getChildCount();
	//   68  115:aload_0         
	//   69  116:invokevirtual   #159 <Method int getChildCount()>
	//   70  119:istore          22
			for(int i2 = 0; i2 < l5;)
	//*  71  121:iconst_0        
	//*  72  122:istore          11
	//*  73  124:iload           11
	//*  74  126:iload           22
	//*  75  128:icmpge          435
			{
				View view = getChildAt(i2);
	//   76  131:aload_0         
	//   77  132:iload           11
	//   78  134:invokevirtual   #163 <Method View getChildAt(int)>
	//   79  137:astore          32
				boolean flag2;
				long l7;
				if(view.getVisibility() == 8)
	//*  80  139:aload           32
	//*  81  141:invokevirtual   #166 <Method int View.getVisibility()>
	//*  82  144:bipush          8
	//*  83  146:icmpne          160
				{
					flag2 = flag;
	//   84  149:iload           7
	//   85  151:istore          12
					l7 = l6;
	//   86  153:lload           25
	//   87  155:lstore          27
				} else
	//*  88  157:goto            418
				{
					boolean flag3 = view instanceof ActionMenuItemView;
	//   89  160:aload           32
	//   90  162:instanceof      #113 <Class ActionMenuItemView>
	//   91  165:istore          31
					int k2 = l1 + 1;
	//   92  167:iload           10
	//   93  169:iconst_1        
	//   94  170:iadd            
	//   95  171:istore          13
					if(flag3)
	//*  96  173:iload           31
	//*  97  175:ifeq            193
						view.setPadding(mGeneratedItemPadding, 0, mGeneratedItemPadding, 0);
	//   98  178:aload           32
	//   99  180:aload_0         
	//  100  181:getfield        #86  <Field int mGeneratedItemPadding>
	//  101  184:iconst_0        
	//  102  185:aload_0         
	//  103  186:getfield        #86  <Field int mGeneratedItemPadding>
	//  104  189:iconst_0        
	//  105  190:invokevirtual   #170 <Method void View.setPadding(int, int, int, int)>
					LayoutParams layoutparams1 = (LayoutParams)view.getLayoutParams();
	//  106  193:aload           32
	//  107  195:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  108  198:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  109  201:astore          33
					layoutparams1.expanded = false;
	//  110  203:aload           33
	//  111  205:iconst_0        
	//  112  206:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
					layoutparams1.extraPixels = 0;
	//  113  209:aload           33
	//  114  211:iconst_0        
	//  115  212:putfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
					layoutparams1.cellsUsed = 0;
	//  116  215:aload           33
	//  117  217:iconst_0        
	//  118  218:putfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
					layoutparams1.expandable = false;
	//  119  221:aload           33
	//  120  223:iconst_0        
	//  121  224:putfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
					layoutparams1.leftMargin = 0;
	//  122  227:aload           33
	//  123  229:iconst_0        
	//  124  230:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
					layoutparams1.rightMargin = 0;
	//  125  233:aload           33
	//  126  235:iconst_0        
	//  127  236:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
					if(flag3 && ((ActionMenuItemView)view).hasText())
	//* 128  239:iload           31
	//* 129  241:ifeq            261
	//* 130  244:aload           32
	//* 131  246:checkcast       #113 <Class ActionMenuItemView>
	//* 132  249:invokevirtual   #117 <Method boolean ActionMenuItemView.hasText()>
	//* 133  252:ifeq            261
						flag3 = true;
	//  134  255:iconst_1        
	//  135  256:istore          31
					else
	//* 136  258:goto            264
						flag3 = false;
	//  137  261:iconst_0        
	//  138  262:istore          31
					layoutparams1.preventEdgeOffset = flag3;
	//  139  264:aload           33
	//  140  266:iload           31
	//  141  268:putfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
					if(layoutparams1.isOverflowButton)
	//* 142  271:aload           33
	//* 143  273:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 144  276:ifeq            284
						i = 1;
	//  145  279:iconst_1        
	//  146  280:istore_1        
					else
	//* 147  281:goto            286
						i = j;
	//  148  284:iload_2         
	//  149  285:istore_1        
					int j6 = measureChildForCells(view, k5, i, i5, i6);
	//  150  286:aload           32
	//  151  288:iload           21
	//  152  290:iload_1         
	//  153  291:iload           19
	//  154  293:iload           23
	//  155  295:invokestatic    #187 <Method int measureChildForCells(View, int, int, int, int)>
	//  156  298:istore          24
					int i3 = Math.max(k1, j6);
	//  157  300:iload           9
	//  158  302:iload           24
	//  159  304:invokestatic    #192 <Method int Math.max(int, int)>
	//  160  307:istore          14
					i = i1;
	//  161  309:iload           8
	//  162  311:istore_1        
					if(layoutparams1.expandable)
	//* 163  312:aload           33
	//* 164  314:getfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
	//* 165  317:ifeq            325
						i = i1 + 1;
	//  166  320:iload           8
	//  167  322:iconst_1        
	//  168  323:iadd            
	//  169  324:istore_1        
					if(layoutparams1.isOverflowButton)
	//* 170  325:aload           33
	//* 171  327:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 172  330:ifeq            336
						flag = true;
	//  173  333:iconst_1        
	//  174  334:istore          7
					int k3 = j - j6;
	//  175  336:iload_2         
	//  176  337:iload           24
	//  177  339:isub            
	//  178  340:istore          15
					int i4 = Math.max(k, view.getMeasuredHeight());
	//  179  342:iload           6
	//  180  344:aload           32
	//  181  346:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//  182  349:invokestatic    #192 <Method int Math.max(int, int)>
	//  183  352:istore          16
					j = k3;
	//  184  354:iload           15
	//  185  356:istore_2        
					k = i4;
	//  186  357:iload           16
	//  187  359:istore          6
					k1 = i3;
	//  188  361:iload           14
	//  189  363:istore          9
					i1 = i;
	//  190  365:iload_1         
	//  191  366:istore          8
					l1 = k2;
	//  192  368:iload           13
	//  193  370:istore          10
					flag2 = flag;
	//  194  372:iload           7
	//  195  374:istore          12
					l7 = l6;
	//  196  376:lload           25
	//  197  378:lstore          27
					if(j6 == 1)
	//* 198  380:iload           24
	//* 199  382:iconst_1        
	//* 200  383:icmpne          418
					{
						l7 = l6 | (long)(1 << i2);
	//  201  386:lload           25
	//  202  388:iconst_1        
	//  203  389:iload           11
	//  204  391:ishl            
	//  205  392:i2l             
	//  206  393:lor             
	//  207  394:lstore          27
						flag2 = flag;
	//  208  396:iload           7
	//  209  398:istore          12
						l1 = k2;
	//  210  400:iload           13
	//  211  402:istore          10
						i1 = i;
	//  212  404:iload_1         
	//  213  405:istore          8
						k1 = i3;
	//  214  407:iload           14
	//  215  409:istore          9
						k = i4;
	//  216  411:iload           16
	//  217  413:istore          6
						j = k3;
	//  218  415:iload           15
	//  219  417:istore_2        
					}
				}
				i2++;
	//  220  418:iload           11
	//  221  420:iconst_1        
	//  222  421:iadd            
	//  223  422:istore          11
				flag = flag2;
	//  224  424:iload           12
	//  225  426:istore          7
				l6 = l7;
	//  226  428:lload           27
	//  227  430:lstore          25
			}

	//* 228  432:goto            124
			boolean flag1;
			if(flag && l1 == 2)
	//* 229  435:iload           7
	//* 230  437:ifeq            452
	//* 231  440:iload           10
	//* 232  442:iconst_2        
	//* 233  443:icmpne          452
				flag1 = true;
	//  234  446:iconst_1        
	//  235  447:istore          11
			else
	//* 236  449:goto            455
				flag1 = false;
	//  237  452:iconst_0        
	//  238  453:istore          11
			i = 0;
	//  239  455:iconst_0        
	//  240  456:istore_1        
			int j2 = j;
	//  241  457:iload_2         
	//  242  458:istore          12
			long l8;
			do
			{
				l8 = l6;
	//  243  460:lload           25
	//  244  462:lstore          27
				if(i1 <= 0)
					break;
	//  245  464:iload           8
	//  246  466:ifle            798
				l8 = l6;
	//  247  469:lload           25
	//  248  471:lstore          27
				if(j2 <= 0)
					break;
	//  249  473:iload           12
	//  250  475:ifle            798
				int l2 = 0x7fffffff;
	//  251  478:ldc1            #196 <Int 0x7fffffff>
	//  252  480:istore          13
				long l9 = 0L;
	//  253  482:lconst_0        
	//  254  483:lstore          29
				int l3 = 0;
	//  255  485:iconst_0        
	//  256  486:istore          15
				for(int j3 = 0; j3 < l5;)
	//* 257  488:iconst_0        
	//* 258  489:istore          14
	//* 259  491:iload           14
	//* 260  493:iload           22
	//* 261  495:icmpge          623
				{
					LayoutParams layoutparams = (LayoutParams)getChildAt(j3).getLayoutParams();
	//  262  498:aload_0         
	//  263  499:iload           14
	//  264  501:invokevirtual   #163 <Method View getChildAt(int)>
	//  265  504:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  266  507:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  267  510:astore          32
					int j4;
					if(!layoutparams.expandable)
	//* 268  512:aload           32
	//* 269  514:getfield        #132 <Field boolean ActionMenuView$LayoutParams.expandable>
	//* 270  517:ifne            534
					{
						j4 = l2;
	//  271  520:iload           13
	//  272  522:istore          16
						l8 = l9;
	//  273  524:lload           29
	//  274  526:lstore          27
						j = l3;
	//  275  528:iload           15
	//  276  530:istore_2        
					} else
	//* 277  531:goto            603
					if(layoutparams.cellsUsed < l2)
	//* 278  534:aload           32
	//* 279  536:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 280  539:iload           13
	//* 281  541:icmpge          563
					{
						j4 = layoutparams.cellsUsed;
	//  282  544:aload           32
	//  283  546:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//  284  549:istore          16
						l8 = 1 << j3;
	//  285  551:iconst_1        
	//  286  552:iload           14
	//  287  554:ishl            
	//  288  555:i2l             
	//  289  556:lstore          27
						j = 1;
	//  290  558:iconst_1        
	//  291  559:istore_2        
					} else
	//* 292  560:goto            603
					{
						j4 = l2;
	//  293  563:iload           13
	//  294  565:istore          16
						l8 = l9;
	//  295  567:lload           29
	//  296  569:lstore          27
						j = l3;
	//  297  571:iload           15
	//  298  573:istore_2        
						if(layoutparams.cellsUsed == l2)
	//* 299  574:aload           32
	//* 300  576:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 301  579:iload           13
	//* 302  581:icmpne          603
						{
							l8 = l9 | (long)(1 << j3);
	//  303  584:lload           29
	//  304  586:iconst_1        
	//  305  587:iload           14
	//  306  589:ishl            
	//  307  590:i2l             
	//  308  591:lor             
	//  309  592:lstore          27
							j = l3 + 1;
	//  310  594:iload           15
	//  311  596:iconst_1        
	//  312  597:iadd            
	//  313  598:istore_2        
							j4 = l2;
	//  314  599:iload           13
	//  315  601:istore          16
						}
					}
					j3++;
	//  316  603:iload           14
	//  317  605:iconst_1        
	//  318  606:iadd            
	//  319  607:istore          14
					l2 = j4;
	//  320  609:iload           16
	//  321  611:istore          13
					l9 = l8;
	//  322  613:lload           27
	//  323  615:lstore          29
					l3 = j;
	//  324  617:iload_2         
	//  325  618:istore          15
				}

	//* 326  620:goto            491
				l6 |= l9;
	//  327  623:lload           25
	//  328  625:lload           29
	//  329  627:lor             
	//  330  628:lstore          25
				if(l3 > j2)
	//* 331  630:iload           15
	//* 332  632:iload           12
	//* 333  634:icmple          644
				{
					l8 = l6;
	//  334  637:lload           25
	//  335  639:lstore          27
					break;
	//  336  641:goto            798
				}
				for(i = 0; i < l5;)
	//* 337  644:iconst_0        
	//* 338  645:istore_1        
	//* 339  646:iload_1         
	//* 340  647:iload           22
	//* 341  649:icmpge          793
				{
					View view1 = getChildAt(i);
	//  342  652:aload_0         
	//  343  653:iload_1         
	//  344  654:invokevirtual   #163 <Method View getChildAt(int)>
	//  345  657:astore          32
					LayoutParams layoutparams2 = (LayoutParams)view1.getLayoutParams();
	//  346  659:aload           32
	//  347  661:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  348  664:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  349  667:astore          33
					if(((long)(1 << i) & l9) == 0L)
	//* 350  669:iconst_1        
	//* 351  670:iload_1         
	//* 352  671:ishl            
	//* 353  672:i2l             
	//* 354  673:lload           29
	//* 355  675:land            
	//* 356  676:lconst_0        
	//* 357  677:lcmp            
	//* 358  678:ifne            715
					{
						j = j2;
	//  359  681:iload           12
	//  360  683:istore_2        
						l8 = l6;
	//  361  684:lload           25
	//  362  686:lstore          27
						if(layoutparams2.cellsUsed == l2 + 1)
	//* 363  688:aload           33
	//* 364  690:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//* 365  693:iload           13
	//* 366  695:iconst_1        
	//* 367  696:iadd            
	//* 368  697:icmpne          779
						{
							l8 = l6 | (long)(1 << i);
	//  369  700:lload           25
	//  370  702:iconst_1        
	//  371  703:iload_1         
	//  372  704:ishl            
	//  373  705:i2l             
	//  374  706:lor             
	//  375  707:lstore          27
							j = j2;
	//  376  709:iload           12
	//  377  711:istore_2        
						}
					} else
	//* 378  712:goto            779
					{
						if(flag1 && layoutparams2.preventEdgeOffset && j2 == 1)
	//* 379  715:iload           11
	//* 380  717:ifeq            752
	//* 381  720:aload           33
	//* 382  722:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 383  725:ifeq            752
	//* 384  728:iload           12
	//* 385  730:iconst_1        
	//* 386  731:icmpne          752
							view1.setPadding(mGeneratedItemPadding + k5, 0, mGeneratedItemPadding, 0);
	//  387  734:aload           32
	//  388  736:aload_0         
	//  389  737:getfield        #86  <Field int mGeneratedItemPadding>
	//  390  740:iload           21
	//  391  742:iadd            
	//  392  743:iconst_0        
	//  393  744:aload_0         
	//  394  745:getfield        #86  <Field int mGeneratedItemPadding>
	//  395  748:iconst_0        
	//  396  749:invokevirtual   #170 <Method void View.setPadding(int, int, int, int)>
						layoutparams2.cellsUsed = layoutparams2.cellsUsed + 1;
	//  397  752:aload           33
	//  398  754:aload           33
	//  399  756:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//  400  759:iconst_1        
	//  401  760:iadd            
	//  402  761:putfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
						layoutparams2.expanded = true;
	//  403  764:aload           33
	//  404  766:iconst_1        
	//  405  767:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
						j = j2 - 1;
	//  406  770:iload           12
	//  407  772:iconst_1        
	//  408  773:isub            
	//  409  774:istore_2        
						l8 = l6;
	//  410  775:lload           25
	//  411  777:lstore          27
					}
					i++;
	//  412  779:iload_1         
	//  413  780:iconst_1        
	//  414  781:iadd            
	//  415  782:istore_1        
					j2 = j;
	//  416  783:iload_2         
	//  417  784:istore          12
					l6 = l8;
	//  418  786:lload           27
	//  419  788:lstore          25
				}

	//* 420  790:goto            646
				i = 1;
	//  421  793:iconst_1        
	//  422  794:istore_1        
			} while(true);
	//  423  795:goto            460
			if(!flag && l1 == 1)
	//* 424  798:iload           7
	//* 425  800:ifne            814
	//* 426  803:iload           10
	//* 427  805:iconst_1        
	//* 428  806:icmpne          814
				j = 1;
	//  429  809:iconst_1        
	//  430  810:istore_2        
			else
	//* 431  811:goto            816
				j = 0;
	//  432  814:iconst_0        
	//  433  815:istore_2        
			flag = ((boolean) (i));
	//  434  816:iload_1         
	//  435  817:istore          7
			if(j2 <= 0)
				break label0;
	//  436  819:iload           12
	//  437  821:ifle            1163
			flag = ((boolean) (i));
	//  438  824:iload_1         
	//  439  825:istore          7
			if(l8 == 0L)
				break label0;
	//  440  827:lload           27
	//  441  829:lconst_0        
	//  442  830:lcmp            
	//  443  831:ifeq            1163
			if(j2 >= l1 - 1 && j == 0)
	//* 444  834:iload           12
	//* 445  836:iload           10
	//* 446  838:iconst_1        
	//* 447  839:isub            
	//* 448  840:icmplt          856
	//* 449  843:iload_2         
	//* 450  844:ifne            856
			{
				flag = ((boolean) (i));
	//  451  847:iload_1         
	//  452  848:istore          7
				if(k1 <= 1)
					break label0;
	//  453  850:iload           9
	//  454  852:iconst_1        
	//  455  853:icmple          1163
			}
			float f2 = Long.bitCount(l8);
	//  456  856:lload           27
	//  457  858:invokestatic    #202 <Method int Long.bitCount(long)>
	//  458  861:i2f             
	//  459  862:fstore          5
			float f1 = f2;
	//  460  864:fload           5
	//  461  866:fstore          4
			if(j == 0)
	//* 462  868:iload_2         
	//* 463  869:ifne            957
			{
				float f = f2;
	//  464  872:fload           5
	//  465  874:fstore_3        
				if((1L & l8) != 0L)
	//* 466  875:lconst_1        
	//* 467  876:lload           27
	//* 468  878:land            
	//* 469  879:lconst_0        
	//* 470  880:lcmp            
	//* 471  881:ifeq            910
				{
					f = f2;
	//  472  884:fload           5
	//  473  886:fstore_3        
					if(!((LayoutParams)getChildAt(0).getLayoutParams()).preventEdgeOffset)
	//* 474  887:aload_0         
	//* 475  888:iconst_0        
	//* 476  889:invokevirtual   #163 <Method View getChildAt(int)>
	//* 477  892:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 478  895:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 479  898:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 480  901:ifne            910
						f = f2 - 0.5F;
	//  481  904:fload           5
	//  482  906:ldc1            #203 <Float 0.5F>
	//  483  908:fsub            
	//  484  909:fstore_3        
				}
				f1 = f;
	//  485  910:fload_3         
	//  486  911:fstore          4
				if(((long)(1 << l5 - 1) & l8) != 0L)
	//* 487  913:iconst_1        
	//* 488  914:iload           22
	//* 489  916:iconst_1        
	//* 490  917:isub            
	//* 491  918:ishl            
	//* 492  919:i2l             
	//* 493  920:lload           27
	//* 494  922:land            
	//* 495  923:lconst_0        
	//* 496  924:lcmp            
	//* 497  925:ifeq            957
				{
					f1 = f;
	//  498  928:fload_3         
	//  499  929:fstore          4
					if(!((LayoutParams)getChildAt(l5 - 1).getLayoutParams()).preventEdgeOffset)
	//* 500  931:aload_0         
	//* 501  932:iload           22
	//* 502  934:iconst_1        
	//* 503  935:isub            
	//* 504  936:invokevirtual   #163 <Method View getChildAt(int)>
	//* 505  939:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 506  942:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//* 507  945:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 508  948:ifne            957
						f1 = f - 0.5F;
	//  509  951:fload_3         
	//  510  952:ldc1            #203 <Float 0.5F>
	//  511  954:fsub            
	//  512  955:fstore          4
				}
			}
			if(f1 > 0.0F)
	//* 513  957:fload           4
	//* 514  959:fconst_0        
	//* 515  960:fcmpl           
	//* 516  961:ifle            979
				flag = ((boolean) ((int)((float)(j2 * k5) / f1)));
	//  517  964:iload           12
	//  518  966:iload           21
	//  519  968:imul            
	//  520  969:i2f             
	//  521  970:fload           4
	//  522  972:fdiv            
	//  523  973:f2i             
	//  524  974:istore          7
			else
	//* 525  976:goto            982
				flag = false;
	//  526  979:iconst_0        
	//  527  980:istore          7
			for(int j1 = 0; j1 < l5;)
	//* 528  982:iconst_0        
	//* 529  983:istore          8
	//* 530  985:iload           8
	//* 531  987:iload           22
	//* 532  989:icmpge          1160
			{
				if(((long)(1 << j1) & l8) == 0L)
	//* 533  992:iconst_1        
	//* 534  993:iload           8
	//* 535  995:ishl            
	//* 536  996:i2l             
	//* 537  997:lload           27
	//* 538  999:land            
	//* 539 1000:lconst_0        
	//* 540 1001:lcmp            
	//* 541 1002:ifne            1010
				{
					j = i;
	//  542 1005:iload_1         
	//  543 1006:istore_2        
				} else
	//* 544 1007:goto            1149
				{
					View view2 = getChildAt(j1);
	//  545 1010:aload_0         
	//  546 1011:iload           8
	//  547 1013:invokevirtual   #163 <Method View getChildAt(int)>
	//  548 1016:astore          32
					LayoutParams layoutparams3 = (LayoutParams)view2.getLayoutParams();
	//  549 1018:aload           32
	//  550 1020:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  551 1023:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  552 1026:astore          33
					if(view2 instanceof ActionMenuItemView)
	//* 553 1028:aload           32
	//* 554 1030:instanceof      #113 <Class ActionMenuItemView>
	//* 555 1033:ifeq            1077
					{
						layoutparams3.extraPixels = ((int) (flag));
	//  556 1036:aload           33
	//  557 1038:iload           7
	//  558 1040:putfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
						layoutparams3.expanded = true;
	//  559 1043:aload           33
	//  560 1045:iconst_1        
	//  561 1046:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
						if(j1 == 0 && !layoutparams3.preventEdgeOffset)
	//* 562 1049:iload           8
	//* 563 1051:ifne            1072
	//* 564 1054:aload           33
	//* 565 1056:getfield        #185 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
	//* 566 1059:ifne            1072
							layoutparams3.leftMargin = -flag / 2;
	//  567 1062:aload           33
	//  568 1064:iload           7
	//  569 1066:ineg            
	//  570 1067:iconst_2        
	//  571 1068:idiv            
	//  572 1069:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
						j = 1;
	//  573 1072:iconst_1        
	//  574 1073:istore_2        
					} else
	//* 575 1074:goto            1149
					if(layoutparams3.isOverflowButton)
	//* 576 1077:aload           33
	//* 577 1079:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 578 1082:ifeq            1113
					{
						layoutparams3.extraPixels = ((int) (flag));
	//  579 1085:aload           33
	//  580 1087:iload           7
	//  581 1089:putfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
						layoutparams3.expanded = true;
	//  582 1092:aload           33
	//  583 1094:iconst_1        
	//  584 1095:putfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
						layoutparams3.rightMargin = -flag / 2;
	//  585 1098:aload           33
	//  586 1100:iload           7
	//  587 1102:ineg            
	//  588 1103:iconst_2        
	//  589 1104:idiv            
	//  590 1105:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
						j = 1;
	//  591 1108:iconst_1        
	//  592 1109:istore_2        
					} else
	//* 593 1110:goto            1149
					{
						if(j1 != 0)
	//* 594 1113:iload           8
	//* 595 1115:ifeq            1127
							layoutparams3.leftMargin = flag / 2;
	//  596 1118:aload           33
	//  597 1120:iload           7
	//  598 1122:iconst_2        
	//  599 1123:idiv            
	//  600 1124:putfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
						j = i;
	//  601 1127:iload_1         
	//  602 1128:istore_2        
						if(j1 != l5 - 1)
	//* 603 1129:iload           8
	//* 604 1131:iload           22
	//* 605 1133:iconst_1        
	//* 606 1134:isub            
	//* 607 1135:icmpeq          1149
						{
							layoutparams3.rightMargin = flag / 2;
	//  608 1138:aload           33
	//  609 1140:iload           7
	//  610 1142:iconst_2        
	//  611 1143:idiv            
	//  612 1144:putfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
							j = i;
	//  613 1147:iload_1         
	//  614 1148:istore_2        
						}
					}
				}
				j1++;
	//  615 1149:iload           8
	//  616 1151:iconst_1        
	//  617 1152:iadd            
	//  618 1153:istore          8
				i = j;
	//  619 1155:iload_2         
	//  620 1156:istore_1        
			}

	//* 621 1157:goto            985
			flag = ((boolean) (i));
	//  622 1160:iload_1         
	//  623 1161:istore          7
		}
		if(flag != 0)
	//* 624 1163:iload           7
	//* 625 1165:ifeq            1237
			for(i = 0; i < l5; i++)
	//* 626 1168:iconst_0        
	//* 627 1169:istore_1        
	//* 628 1170:iload_1         
	//* 629 1171:iload           22
	//* 630 1173:icmpge          1237
			{
				View view3 = getChildAt(i);
	//  631 1176:aload_0         
	//  632 1177:iload_1         
	//  633 1178:invokevirtual   #163 <Method View getChildAt(int)>
	//  634 1181:astore          32
				LayoutParams layoutparams4 = (LayoutParams)view3.getLayoutParams();
	//  635 1183:aload           32
	//  636 1185:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  637 1188:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  638 1191:astore          33
				if(layoutparams4.expanded)
	//* 639 1193:aload           33
	//* 640 1195:getfield        #173 <Field boolean ActionMenuView$LayoutParams.expanded>
	//* 641 1198:ifne            1204
	//* 642 1201:goto            1230
					view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams4.cellsUsed * k5 + layoutparams4.extraPixels, 0x40000000), i5);
	//  643 1204:aload           32
	//  644 1206:aload           33
	//  645 1208:getfield        #135 <Field int ActionMenuView$LayoutParams.cellsUsed>
	//  646 1211:iload           21
	//  647 1213:imul            
	//  648 1214:aload           33
	//  649 1216:getfield        #176 <Field int ActionMenuView$LayoutParams.extraPixels>
	//  650 1219:iadd            
	//  651 1220:ldc1            #136 <Int 0x40000000>
	//  652 1222:invokestatic    #111 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  653 1225:iload           19
	//  654 1227:invokevirtual   #122 <Method void View.measure(int, int)>
			}

	//  655 1230:iload_1         
	//  656 1231:iconst_1        
	//  657 1232:iadd            
	//  658 1233:istore_1        
	//* 659 1234:goto            1170
		i = k4;
	//  660 1237:iload           17
	//  661 1239:istore_1        
		if(l4 != 0x40000000)
	//* 662 1240:iload           18
	//* 663 1242:ldc1            #136 <Int 0x40000000>
	//* 664 1244:icmpeq          1250
			i = k;
	//  665 1247:iload           6
	//  666 1249:istore_1        
		setMeasuredDimension(j5, i);
	//  667 1250:aload_0         
	//  668 1251:iload           20
	//  669 1253:iload_1         
	//  670 1254:invokevirtual   #156 <Method void setMeasuredDimension(int, int)>
	//  671 1257:return          
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
	//*   2    4:ifnonnull       116
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
	//*  38   76:goto            88
				obj = ((Object) (new ActionMenuPresenterCallback()));
	//   39   79:new             #13  <Class ActionMenuView$ActionMenuPresenterCallback>
	//   40   82:dup             
	//   41   83:aload_0         
	//   42   84:invokespecial   #275 <Method void ActionMenuView$ActionMenuPresenterCallback(ActionMenuView)>
	//   43   87:astore_1        
			actionmenupresenter.setCallback(((android.support.v7.view.menu.MenuPresenter.Callback) (obj)));
	//   44   88:aload_2         
	//   45   89:aload_1         
	//   46   90:invokevirtual   #278 <Method void ActionMenuPresenter.setCallback(android.support.v7.view.menu.MenuPresenter$Callback)>
			mMenu.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (mPresenter)), mPopupContext);
	//   47   93:aload_0         
	//   48   94:getfield        #257 <Field MenuBuilder mMenu>
	//   49   97:aload_0         
	//   50   98:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//   51  101:aload_0         
	//   52  102:getfield        #88  <Field Context mPopupContext>
	//   53  105:invokevirtual   #282 <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter, Context)>
			mPresenter.setMenuView(this);
	//   54  108:aload_0         
	//   55  109:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//   56  112:aload_0         
	//   57  113:invokevirtual   #285 <Method void ActionMenuPresenter.setMenuView(ActionMenuView)>
		}
		return ((Menu) (mMenu));
	//   58  116:aload_0         
	//   59  117:getfield        #257 <Field MenuBuilder mMenu>
	//   60  120:areturn         
	}

	public Drawable getOverflowIcon()
	{
		getMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #290 <Method Menu getMenu()>
	//    2    4:pop             
		return mPresenter.getOverflowIcon();
	//    3    5:aload_0         
	//    4    6:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    5    9:invokevirtual   #292 <Method Drawable ActionMenuPresenter.getOverflowIcon()>
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
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		View view = getChildAt(i - 1);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:iconst_1        
	//    7    9:isub            
	//    8   10:invokevirtual   #163 <Method View getChildAt(int)>
	//    9   13:astore          4
		View view1 = getChildAt(i);
	//   10   15:aload_0         
	//   11   16:iload_1         
	//   12   17:invokevirtual   #163 <Method View getChildAt(int)>
	//   13   20:astore          5
		boolean flag1 = false;
	//   14   22:iconst_0        
	//   15   23:istore_3        
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
				flag = ((ActionMenuChildView)view).needsDividerAfter() | false;
	//   27   44:aload           4
	//   28   46:checkcast       #10  <Class ActionMenuView$ActionMenuChildView>
	//   29   49:invokeinterface #299 <Method boolean ActionMenuView$ActionMenuChildView.needsDividerAfter()>
	//   30   54:iconst_0        
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
	//   45   79:invokeinterface #302 <Method boolean ActionMenuView$ActionMenuChildView.needsDividerBefore()>
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
	//    5   11:invokevirtual   #305 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
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
	//    4    6:invokevirtual   #313 <Method boolean MenuBuilder.performItemAction(MenuItem, int)>
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
	//    5   11:invokevirtual   #316 <Method boolean ActionMenuPresenter.isOverflowMenuShowPending()>
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
	//    5   11:invokevirtual   #319 <Method boolean ActionMenuPresenter.isOverflowMenuShowing()>
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
	//    1    1:getfield        #322 <Field boolean mReserveOverflow>
	//    2    4:ireturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #326 <Method void LinearLayoutCompat.onConfigurationChanged(Configuration)>
		if(mPresenter != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//*   5    9:ifnull          46
		{
			mPresenter.updateMenuView(false);
	//    6   12:aload_0         
	//    7   13:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #329 <Method void ActionMenuPresenter.updateMenuView(boolean)>
			if(mPresenter.isOverflowMenuShowing())
	//*  10   20:aload_0         
	//*  11   21:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//*  12   24:invokevirtual   #319 <Method boolean ActionMenuPresenter.isOverflowMenuShowing()>
	//*  13   27:ifeq            46
			{
				mPresenter.hideOverflowMenu();
	//   14   30:aload_0         
	//   15   31:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//   16   34:invokevirtual   #305 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
	//   17   37:pop             
				mPresenter.showOverflowMenu();
	//   18   38:aload_0         
	//   19   39:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//   20   42:invokevirtual   #332 <Method boolean ActionMenuPresenter.showOverflowMenu()>
	//   21   45:pop             
			}
		}
	//   22   46:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #335 <Method void LinearLayoutCompat.onDetachedFromWindow()>
		dismissPopupMenus();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #337 <Method void dismissPopupMenus()>
	//    4    8:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		if(!mFormatItems)
	//*   0    0:aload_0         
	//*   1    1:getfield        #341 <Field boolean mFormatItems>
	//*   2    4:ifne            19
		{
			super.onLayout(flag, i, j, k, l);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:iload           5
	//    9   15:invokespecial   #343 <Method void LinearLayoutCompat.onLayout(boolean, int, int, int, int)>
			return;
	//   10   18:return          
		}
		int i4 = getChildCount();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #159 <Method int getChildCount()>
	//   13   23:istore          12
		int l3 = (l - j) / 2;
	//   14   25:iload           5
	//   15   27:iload_3         
	//   16   28:isub            
	//   17   29:iconst_2        
	//   18   30:idiv            
	//   19   31:istore          11
		int j4 = getDividerWidth();
	//   20   33:aload_0         
	//   21   34:invokevirtual   #346 <Method int getDividerWidth()>
	//   22   37:istore          13
		l = 0;
	//   23   39:iconst_0        
	//   24   40:istore          5
		int l1 = 0;
	//   25   42:iconst_0        
	//   26   43:istore          7
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
	//   40   64:invokestatic    #352 <Method boolean ViewUtils.isLayoutRtl(View)>
	//   41   67:istore_1        
		for(int i1 = 0; i1 < i4; i1++)
	//*  42   68:iconst_0        
	//*  43   69:istore          6
	//*  44   71:iload           6
	//*  45   73:iload           12
	//*  46   75:icmpge          303
		{
			View view = getChildAt(i1);
	//   47   78:aload_0         
	//   48   79:iload           6
	//   49   81:invokevirtual   #163 <Method View getChildAt(int)>
	//   50   84:astore          16
			if(view.getVisibility() == 8)
	//*  51   86:aload           16
	//*  52   88:invokevirtual   #166 <Method int View.getVisibility()>
	//*  53   91:bipush          8
	//*  54   93:icmpne          99
				continue;
	//   55   96:goto            294
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   56   99:aload           16
	//   57  101:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   58  104:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//   59  107:astore          17
			if(layoutparams.isOverflowButton)
	//*  60  109:aload           17
	//*  61  111:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//*  62  114:ifeq            237
			{
				int l2 = view.getMeasuredWidth();
	//   63  117:aload           16
	//   64  119:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//   65  122:istore          9
				k2 = l2;
	//   66  124:iload           9
	//   67  126:istore          8
				if(hasSupportDividerBeforeChildAt(i1))
	//*  68  128:aload_0         
	//*  69  129:iload           6
	//*  70  131:invokevirtual   #354 <Method boolean hasSupportDividerBeforeChildAt(int)>
	//*  71  134:ifeq            144
					k2 = l2 + j4;
	//   72  137:iload           9
	//   73  139:iload           13
	//   74  141:iadd            
	//   75  142:istore          8
				int k4 = view.getMeasuredHeight();
	//   76  144:aload           16
	//   77  146:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//   78  149:istore          14
				int j3;
				if(flag)
	//*  79  151:iload_1         
	//*  80  152:ifeq            177
				{
					j3 = getPaddingLeft() + layoutparams.leftMargin;
	//   81  155:aload_0         
	//   82  156:invokevirtual   #140 <Method int getPaddingLeft()>
	//   83  159:aload           17
	//   84  161:getfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//   85  164:iadd            
	//   86  165:istore          10
					l2 = j3 + k2;
	//   87  167:iload           10
	//   88  169:iload           8
	//   89  171:iadd            
	//   90  172:istore          9
				} else
	//*  91  174:goto            201
				{
					l2 = getWidth() - getPaddingRight() - layoutparams.rightMargin;
	//   92  177:aload_0         
	//   93  178:invokevirtual   #357 <Method int getWidth()>
	//   94  181:aload_0         
	//   95  182:invokevirtual   #143 <Method int getPaddingRight()>
	//   96  185:isub            
	//   97  186:aload           17
	//   98  188:getfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//   99  191:isub            
	//  100  192:istore          9
					j3 = l2 - k2;
	//  101  194:iload           9
	//  102  196:iload           8
	//  103  198:isub            
	//  104  199:istore          10
				}
				int l4 = l3 - k4 / 2;
	//  105  201:iload           11
	//  106  203:iload           14
	//  107  205:iconst_2        
	//  108  206:idiv            
	//  109  207:isub            
	//  110  208:istore          15
				view.layout(j3, l4, l2, l4 + k4);
	//  111  210:aload           16
	//  112  212:iload           10
	//  113  214:iload           15
	//  114  216:iload           9
	//  115  218:iload           15
	//  116  220:iload           14
	//  117  222:iadd            
	//  118  223:invokevirtual   #360 <Method void View.layout(int, int, int, int)>
				j -= k2;
	//  119  226:iload_3         
	//  120  227:iload           8
	//  121  229:isub            
	//  122  230:istore_3        
				k2 = 1;
	//  123  231:iconst_1        
	//  124  232:istore          8
				continue;
	//  125  234:goto            294
			}
			int k3 = view.getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin;
	//  126  237:aload           16
	//  127  239:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//  128  242:aload           17
	//  129  244:getfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  130  247:iadd            
	//  131  248:aload           17
	//  132  250:getfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  133  253:iadd            
	//  134  254:istore          10
			int i3 = l + k3;
	//  135  256:iload           5
	//  136  258:iload           10
	//  137  260:iadd            
	//  138  261:istore          9
			j -= k3;
	//  139  263:iload_3         
	//  140  264:iload           10
	//  141  266:isub            
	//  142  267:istore_3        
			l = i3;
	//  143  268:iload           9
	//  144  270:istore          5
			if(hasSupportDividerBeforeChildAt(i1))
	//* 145  272:aload_0         
	//* 146  273:iload           6
	//* 147  275:invokevirtual   #354 <Method boolean hasSupportDividerBeforeChildAt(int)>
	//* 148  278:ifeq            288
				l = i3 + j4;
	//  149  281:iload           9
	//  150  283:iload           13
	//  151  285:iadd            
	//  152  286:istore          5
			l1++;
	//  153  288:iload           7
	//  154  290:iconst_1        
	//  155  291:iadd            
	//  156  292:istore          7
		}

	//  157  294:iload           6
	//  158  296:iconst_1        
	//  159  297:iadd            
	//  160  298:istore          6
	//* 161  300:goto            71
		if(i4 == 1 && k2 == 0)
	//* 162  303:iload           12
	//* 163  305:iconst_1        
	//* 164  306:icmpne          371
	//* 165  309:iload           8
	//* 166  311:ifne            371
		{
			View view1 = getChildAt(0);
	//  167  314:aload_0         
	//  168  315:iconst_0        
	//  169  316:invokevirtual   #163 <Method View getChildAt(int)>
	//  170  319:astore          16
			j = view1.getMeasuredWidth();
	//  171  321:aload           16
	//  172  323:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//  173  326:istore_3        
			l = view1.getMeasuredHeight();
	//  174  327:aload           16
	//  175  329:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//  176  332:istore          5
			i = (k - i) / 2 - j / 2;
	//  177  334:iload           4
	//  178  336:iload_2         
	//  179  337:isub            
	//  180  338:iconst_2        
	//  181  339:idiv            
	//  182  340:iload_3         
	//  183  341:iconst_2        
	//  184  342:idiv            
	//  185  343:isub            
	//  186  344:istore_2        
			k = l3 - l / 2;
	//  187  345:iload           11
	//  188  347:iload           5
	//  189  349:iconst_2        
	//  190  350:idiv            
	//  191  351:isub            
	//  192  352:istore          4
			view1.layout(i, k, i + j, k + l);
	//  193  354:aload           16
	//  194  356:iload_2         
	//  195  357:iload           4
	//  196  359:iload_2         
	//  197  360:iload_3         
	//  198  361:iadd            
	//  199  362:iload           4
	//  200  364:iload           5
	//  201  366:iadd            
	//  202  367:invokevirtual   #360 <Method void View.layout(int, int, int, int)>
			return;
	//  203  370:return          
		}
		if(k2 != 0)
	//* 204  371:iload           8
	//* 205  373:ifeq            381
			i = 0;
	//  206  376:iconst_0        
	//  207  377:istore_2        
		else
	//* 208  378:goto            383
			i = 1;
	//  209  381:iconst_1        
	//  210  382:istore_2        
		i = l1 - i;
	//  211  383:iload           7
	//  212  385:iload_2         
	//  213  386:isub            
	//  214  387:istore_2        
		if(i > 0)
	//* 215  388:iload_2         
	//* 216  389:ifle            399
			i = j / i;
	//  217  392:iload_3         
	//  218  393:iload_2         
	//  219  394:idiv            
	//  220  395:istore_2        
		else
	//* 221  396:goto            401
			i = 0;
	//  222  399:iconst_0        
	//  223  400:istore_2        
		l = Math.max(0, i);
	//  224  401:iconst_0        
	//  225  402:iload_2         
	//  226  403:invokestatic    #192 <Method int Math.max(int, int)>
	//  227  406:istore          5
		if(flag)
	//* 228  408:iload_1         
	//* 229  409:ifeq            548
		{
			j = getWidth() - getPaddingRight();
	//  230  412:aload_0         
	//  231  413:invokevirtual   #357 <Method int getWidth()>
	//  232  416:aload_0         
	//  233  417:invokevirtual   #143 <Method int getPaddingRight()>
	//  234  420:isub            
	//  235  421:istore_3        
			for(i = 0; i < i4;)
	//* 236  422:iconst_0        
	//* 237  423:istore_2        
	//* 238  424:iload_2         
	//* 239  425:iload           12
	//* 240  427:icmpge          547
			{
				View view2 = getChildAt(i);
	//  241  430:aload_0         
	//  242  431:iload_2         
	//  243  432:invokevirtual   #163 <Method View getChildAt(int)>
	//  244  435:astore          16
				LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
	//  245  437:aload           16
	//  246  439:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  247  442:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  248  445:astore          17
				k = j;
	//  249  447:iload_3         
	//  250  448:istore          4
				if(view2.getVisibility() != 8)
	//* 251  450:aload           16
	//* 252  452:invokevirtual   #166 <Method int View.getVisibility()>
	//* 253  455:bipush          8
	//* 254  457:icmpeq          537
					if(layoutparams1.isOverflowButton)
	//* 255  460:aload           17
	//* 256  462:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 257  465:ifeq            474
					{
						k = j;
	//  258  468:iload_3         
	//  259  469:istore          4
					} else
	//* 260  471:goto            537
					{
						j -= layoutparams1.rightMargin;
	//  261  474:iload_3         
	//  262  475:aload           17
	//  263  477:getfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  264  480:isub            
	//  265  481:istore_3        
						k = view2.getMeasuredWidth();
	//  266  482:aload           16
	//  267  484:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//  268  487:istore          4
						int j1 = view2.getMeasuredHeight();
	//  269  489:aload           16
	//  270  491:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//  271  494:istore          6
						int i2 = l3 - j1 / 2;
	//  272  496:iload           11
	//  273  498:iload           6
	//  274  500:iconst_2        
	//  275  501:idiv            
	//  276  502:isub            
	//  277  503:istore          7
						view2.layout(j - k, i2, j, i2 + j1);
	//  278  505:aload           16
	//  279  507:iload_3         
	//  280  508:iload           4
	//  281  510:isub            
	//  282  511:iload           7
	//  283  513:iload_3         
	//  284  514:iload           7
	//  285  516:iload           6
	//  286  518:iadd            
	//  287  519:invokevirtual   #360 <Method void View.layout(int, int, int, int)>
						k = j - (layoutparams1.leftMargin + k + l);
	//  288  522:iload_3         
	//  289  523:aload           17
	//  290  525:getfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  291  528:iload           4
	//  292  530:iadd            
	//  293  531:iload           5
	//  294  533:iadd            
	//  295  534:isub            
	//  296  535:istore          4
					}
				i++;
	//  297  537:iload_2         
	//  298  538:iconst_1        
	//  299  539:iadd            
	//  300  540:istore_2        
				j = k;
	//  301  541:iload           4
	//  302  543:istore_3        
			}

	//* 303  544:goto            424
			return;
	//  304  547:return          
		}
		j = getPaddingLeft();
	//  305  548:aload_0         
	//  306  549:invokevirtual   #140 <Method int getPaddingLeft()>
	//  307  552:istore_3        
		for(i = 0; i < i4;)
	//* 308  553:iconst_0        
	//* 309  554:istore_2        
	//* 310  555:iload_2         
	//* 311  556:iload           12
	//* 312  558:icmpge          678
		{
			View view3 = getChildAt(i);
	//  313  561:aload_0         
	//  314  562:iload_2         
	//  315  563:invokevirtual   #163 <Method View getChildAt(int)>
	//  316  566:astore          16
			LayoutParams layoutparams2 = (LayoutParams)view3.getLayoutParams();
	//  317  568:aload           16
	//  318  570:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  319  573:checkcast       #16  <Class ActionMenuView$LayoutParams>
	//  320  576:astore          17
			k = j;
	//  321  578:iload_3         
	//  322  579:istore          4
			if(view3.getVisibility() != 8)
	//* 323  581:aload           16
	//* 324  583:invokevirtual   #166 <Method int View.getVisibility()>
	//* 325  586:bipush          8
	//* 326  588:icmpeq          668
				if(layoutparams2.isOverflowButton)
	//* 327  591:aload           17
	//* 328  593:getfield        #129 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
	//* 329  596:ifeq            605
				{
					k = j;
	//  330  599:iload_3         
	//  331  600:istore          4
				} else
	//* 332  602:goto            668
				{
					j += layoutparams2.leftMargin;
	//  333  605:iload_3         
	//  334  606:aload           17
	//  335  608:getfield        #179 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  336  611:iadd            
	//  337  612:istore_3        
					k = view3.getMeasuredWidth();
	//  338  613:aload           16
	//  339  615:invokevirtual   #126 <Method int View.getMeasuredWidth()>
	//  340  618:istore          4
					int k1 = view3.getMeasuredHeight();
	//  341  620:aload           16
	//  342  622:invokevirtual   #195 <Method int View.getMeasuredHeight()>
	//  343  625:istore          6
					int j2 = l3 - k1 / 2;
	//  344  627:iload           11
	//  345  629:iload           6
	//  346  631:iconst_2        
	//  347  632:idiv            
	//  348  633:isub            
	//  349  634:istore          7
					view3.layout(j, j2, j + k, j2 + k1);
	//  350  636:aload           16
	//  351  638:iload_3         
	//  352  639:iload           7
	//  353  641:iload_3         
	//  354  642:iload           4
	//  355  644:iadd            
	//  356  645:iload           7
	//  357  647:iload           6
	//  358  649:iadd            
	//  359  650:invokevirtual   #360 <Method void View.layout(int, int, int, int)>
					k = j + (layoutparams2.rightMargin + k + l);
	//  360  653:iload_3         
	//  361  654:aload           17
	//  362  656:getfield        #182 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  363  659:iload           4
	//  364  661:iadd            
	//  365  662:iload           5
	//  366  664:iadd            
	//  367  665:iadd            
	//  368  666:istore          4
				}
			i++;
	//  369  668:iload_2         
	//  370  669:iconst_1        
	//  371  670:iadd            
	//  372  671:istore_2        
			j = k;
	//  373  672:iload           4
	//  374  674:istore_3        
		}

	//* 375  675:goto            555
	//  376  678:return          
	}

	protected void onMeasure(int i, int j)
	{
		boolean flag1 = mFormatItems;
	//    0    0:aload_0         
	//    1    1:getfield        #341 <Field boolean mFormatItems>
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
	//   14   27:putfield        #341 <Field boolean mFormatItems>
		if(flag1 != mFormatItems)
	//*  15   30:iload           6
	//*  16   32:aload_0         
	//*  17   33:getfield        #341 <Field boolean mFormatItems>
	//*  18   36:icmpeq          44
			mFormatItemsWidth = 0;
	//   19   39:aload_0         
	//   20   40:iconst_0        
	//   21   41:putfield        #363 <Field int mFormatItemsWidth>
		int k = android.view.View.MeasureSpec.getSize(i);
	//   22   44:iload_1         
	//   23   45:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   24   48:istore_3        
		if(mFormatItems && mMenu != null && k != mFormatItemsWidth)
	//*  25   49:aload_0         
	//*  26   50:getfield        #341 <Field boolean mFormatItems>
	//*  27   53:ifeq            84
	//*  28   56:aload_0         
	//*  29   57:getfield        #257 <Field MenuBuilder mMenu>
	//*  30   60:ifnull          84
	//*  31   63:iload_3         
	//*  32   64:aload_0         
	//*  33   65:getfield        #363 <Field int mFormatItemsWidth>
	//*  34   68:icmpeq          84
		{
			mFormatItemsWidth = k;
	//   35   71:aload_0         
	//   36   72:iload_3         
	//   37   73:putfield        #363 <Field int mFormatItemsWidth>
			mMenu.onItemsChanged(true);
	//   38   76:aload_0         
	//   39   77:getfield        #257 <Field MenuBuilder mMenu>
	//   40   80:iconst_1        
	//   41   81:invokevirtual   #366 <Method void MenuBuilder.onItemsChanged(boolean)>
		}
		int i1 = getChildCount();
	//   42   84:aload_0         
	//   43   85:invokevirtual   #159 <Method int getChildCount()>
	//   44   88:istore          4
		if(mFormatItems && i1 > 0)
	//*  45   90:aload_0         
	//*  46   91:getfield        #341 <Field boolean mFormatItems>
	//*  47   94:ifeq            109
	//*  48   97:iload           4
	//*  49   99:ifle            109
		{
			onMeasureExactFormat(i, j);
	//   50  102:aload_0         
	//   51  103:iload_1         
	//   52  104:iload_2         
	//   53  105:invokespecial   #368 <Method void onMeasureExactFormat(int, int)>
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
	//   80  152:invokespecial   #370 <Method void LinearLayoutCompat.onMeasure(int, int)>
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
	//    3    5:invokevirtual   #375 <Method void ActionMenuPresenter.setExpandedActionViewsExclusive(boolean)>
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
	//    5    7:putfield        #379 <Field android.support.v7.view.menu.MenuBuilder$Callback mMenuBuilderCallback>
	//    6   10:return          
	}

	public void setOnMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener)
	{
		mOnMenuItemClickListener = onmenuitemclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #383 <Field ActionMenuView$OnMenuItemClickListener mOnMenuItemClickListener>
	//    3    5:return          
	}

	public void setOverflowIcon(Drawable drawable)
	{
		getMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #290 <Method Menu getMenu()>
	//    2    4:pop             
		mPresenter.setOverflowIcon(drawable);
	//    3    5:aload_0         
	//    4    6:getfield        #209 <Field ActionMenuPresenter mPresenter>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #387 <Method void ActionMenuPresenter.setOverflowIcon(Drawable)>
	//    7   13:return          
	}

	public void setOverflowReserved(boolean flag)
	{
		mReserveOverflow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #322 <Field boolean mReserveOverflow>
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
	//   15   27:new             #394 <Class ContextThemeWrapper>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:invokevirtual   #231 <Method Context getContext()>
	//   19   35:iload_1         
	//   20   36:invokespecial   #397 <Method void ContextThemeWrapper(Context, int)>
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
	//    6   10:invokevirtual   #285 <Method void ActionMenuPresenter.setMenuView(ActionMenuView)>
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
	//    5   11:invokevirtual   #332 <Method boolean ActionMenuPresenter.showOverflowMenu()>
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
