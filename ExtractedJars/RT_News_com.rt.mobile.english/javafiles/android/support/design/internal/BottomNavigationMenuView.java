// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.transition.*;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v7.view.menu.*;
import android.util.AttributeSet;
import android.view.*;

// Referenced classes of package android.support.design.internal:
//			TextScale, BottomNavigationItemView, BottomNavigationPresenter

public class BottomNavigationMenuView extends ViewGroup
	implements MenuView
{

	public BottomNavigationMenuView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #49  <Method void BottomNavigationMenuView(Context, AttributeSet)>
	//    4    6:return          
	}

	public BottomNavigationMenuView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #51  <Method void ViewGroup(Context, AttributeSet)>
		mItemPool = ((android.support.v4.util.Pools.Pool) (new android.support.v4.util.Pools.SynchronizedPool(5)));
	//    4    6:aload_0         
	//    5    7:new             #53  <Class android.support.v4.util.Pools$SynchronizedPool>
	//    6   10:dup             
	//    7   11:iconst_5        
	//    8   12:invokespecial   #56  <Method void android.support.v4.util.Pools$SynchronizedPool(int)>
	//    9   15:putfield        #58  <Field android.support.v4.util.Pools$Pool mItemPool>
		mShiftingMode = true;
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:putfield        #60  <Field boolean mShiftingMode>
		mSelectedItemId = 0;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #62  <Field int mSelectedItemId>
		mSelectedItemPosition = 0;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #64  <Field int mSelectedItemPosition>
		context = ((Context) (getResources()));
	//   19   33:aload_0         
	//   20   34:invokevirtual   #68  <Method Resources getResources()>
	//   21   37:astore_1        
		mInactiveItemMaxWidth = ((Resources) (context)).getDimensionPixelSize(android.support.design.R.dimen.design_bottom_navigation_item_max_width);
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:getstatic       #73  <Field int android.support.design.R$dimen.design_bottom_navigation_item_max_width>
	//   25   43:invokevirtual   #79  <Method int Resources.getDimensionPixelSize(int)>
	//   26   46:putfield        #81  <Field int mInactiveItemMaxWidth>
		mInactiveItemMinWidth = ((Resources) (context)).getDimensionPixelSize(android.support.design.R.dimen.design_bottom_navigation_item_min_width);
	//   27   49:aload_0         
	//   28   50:aload_1         
	//   29   51:getstatic       #84  <Field int android.support.design.R$dimen.design_bottom_navigation_item_min_width>
	//   30   54:invokevirtual   #79  <Method int Resources.getDimensionPixelSize(int)>
	//   31   57:putfield        #86  <Field int mInactiveItemMinWidth>
		mActiveItemMaxWidth = ((Resources) (context)).getDimensionPixelSize(android.support.design.R.dimen.design_bottom_navigation_active_item_max_width);
	//   32   60:aload_0         
	//   33   61:aload_1         
	//   34   62:getstatic       #89  <Field int android.support.design.R$dimen.design_bottom_navigation_active_item_max_width>
	//   35   65:invokevirtual   #79  <Method int Resources.getDimensionPixelSize(int)>
	//   36   68:putfield        #91  <Field int mActiveItemMaxWidth>
		mItemHeight = ((Resources) (context)).getDimensionPixelSize(android.support.design.R.dimen.design_bottom_navigation_height);
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:getstatic       #94  <Field int android.support.design.R$dimen.design_bottom_navigation_height>
	//   40   76:invokevirtual   #79  <Method int Resources.getDimensionPixelSize(int)>
	//   41   79:putfield        #96  <Field int mItemHeight>
		mSet = ((TransitionSet) (new AutoTransition()));
	//   42   82:aload_0         
	//   43   83:new             #98  <Class AutoTransition>
	//   44   86:dup             
	//   45   87:invokespecial   #101 <Method void AutoTransition()>
	//   46   90:putfield        #103 <Field TransitionSet mSet>
		mSet.setOrdering(0);
	//   47   93:aload_0         
	//   48   94:getfield        #103 <Field TransitionSet mSet>
	//   49   97:iconst_0        
	//   50   98:invokevirtual   #109 <Method TransitionSet TransitionSet.setOrdering(int)>
	//   51  101:pop             
		mSet.setDuration(115L);
	//   52  102:aload_0         
	//   53  103:getfield        #103 <Field TransitionSet mSet>
	//   54  106:ldc2w           #15  <Long 115L>
	//   55  109:invokevirtual   #113 <Method TransitionSet TransitionSet.setDuration(long)>
	//   56  112:pop             
		mSet.setInterpolator(((android.animation.TimeInterpolator) (new FastOutSlowInInterpolator())));
	//   57  113:aload_0         
	//   58  114:getfield        #103 <Field TransitionSet mSet>
	//   59  117:new             #115 <Class FastOutSlowInInterpolator>
	//   60  120:dup             
	//   61  121:invokespecial   #116 <Method void FastOutSlowInInterpolator()>
	//   62  124:invokevirtual   #120 <Method TransitionSet TransitionSet.setInterpolator(android.animation.TimeInterpolator)>
	//   63  127:pop             
		mSet.addTransition(((android.support.transition.Transition) (new TextScale())));
	//   64  128:aload_0         
	//   65  129:getfield        #103 <Field TransitionSet mSet>
	//   66  132:new             #122 <Class TextScale>
	//   67  135:dup             
	//   68  136:invokespecial   #123 <Method void TextScale()>
	//   69  139:invokevirtual   #127 <Method TransitionSet TransitionSet.addTransition(android.support.transition.Transition)>
	//   70  142:pop             
		mOnClickListener = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				view = ((View) (((BottomNavigationItemView)view).getItemData()));
			//    0    0:aload_1         
			//    1    1:checkcast       #24  <Class BottomNavigationItemView>
			//    2    4:invokevirtual   #28  <Method MenuItemImpl BottomNavigationItemView.getItemData()>
			//    3    7:astore_1        
				if(!mMenu.performItemAction(((MenuItem) (view)), ((android.support.v7.view.menu.MenuPresenter) (mPresenter)), 0))
			//*   4    8:aload_0         
			//*   5    9:getfield        #16  <Field BottomNavigationMenuView this$0>
			//*   6   12:invokestatic    #32  <Method MenuBuilder BottomNavigationMenuView.access$100(BottomNavigationMenuView)>
			//*   7   15:aload_1         
			//*   8   16:aload_0         
			//*   9   17:getfield        #16  <Field BottomNavigationMenuView this$0>
			//*  10   20:invokestatic    #36  <Method BottomNavigationPresenter BottomNavigationMenuView.access$000(BottomNavigationMenuView)>
			//*  11   23:iconst_0        
			//*  12   24:invokevirtual   #42  <Method boolean MenuBuilder.performItemAction(MenuItem, android.support.v7.view.menu.MenuPresenter, int)>
			//*  13   27:ifne            38
					((MenuItem) (view)).setChecked(true);
			//   14   30:aload_1         
			//   15   31:iconst_1        
			//   16   32:invokeinterface #48  <Method MenuItem MenuItem.setChecked(boolean)>
			//   17   37:pop             
			//   18   38:return          
			}

			final BottomNavigationMenuView this$0;

			
			{
				this$0 = BottomNavigationMenuView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BottomNavigationMenuView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   71  143:aload_0         
	//   72  144:new             #8   <Class BottomNavigationMenuView$1>
	//   73  147:dup             
	//   74  148:aload_0         
	//   75  149:invokespecial   #130 <Method void BottomNavigationMenuView$1(BottomNavigationMenuView)>
	//   76  152:putfield        #132 <Field android.view.View$OnClickListener mOnClickListener>
		mTempChildWidths = new int[5];
	//   77  155:aload_0         
	//   78  156:iconst_5        
	//   79  157:newarray        int[]
	//   80  159:putfield        #134 <Field int[] mTempChildWidths>
	//   81  162:return          
	}

	private BottomNavigationItemView getNewItem()
	{
		BottomNavigationItemView bottomnavigationitemview1 = (BottomNavigationItemView)mItemPool.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field android.support.v4.util.Pools$Pool mItemPool>
	//    2    4:invokeinterface #150 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    3    9:checkcast       #152 <Class BottomNavigationItemView>
	//    4   12:astore_2        
		BottomNavigationItemView bottomnavigationitemview = bottomnavigationitemview1;
	//    5   13:aload_2         
	//    6   14:astore_1        
		if(bottomnavigationitemview1 == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       31
			bottomnavigationitemview = new BottomNavigationItemView(getContext());
	//    9   19:new             #152 <Class BottomNavigationItemView>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokevirtual   #156 <Method Context getContext()>
	//   13   27:invokespecial   #158 <Method void BottomNavigationItemView(Context)>
	//   14   30:astore_1        
		return bottomnavigationitemview;
	//   15   31:aload_1         
	//   16   32:areturn         
	}

	public void buildMenuView()
	{
		removeAllViews();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method void removeAllViews()>
		if(mButtons != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//*   4    8:ifnull          53
		{
			BottomNavigationItemView abottomnavigationitemview[] = mButtons;
	//    5   11:aload_0         
	//    6   12:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//    7   15:astore          4
			int k = abottomnavigationitemview.length;
	//    8   17:aload           4
	//    9   19:arraylength     
	//   10   20:istore_2        
			for(int i = 0; i < k; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_1         
	//*  14   24:iload_2         
	//*  15   25:icmpge          53
			{
				BottomNavigationItemView bottomnavigationitemview1 = abottomnavigationitemview[i];
	//   16   28:aload           4
	//   17   30:iload_1         
	//   18   31:aaload          
	//   19   32:astore          5
				mItemPool.release(((Object) (bottomnavigationitemview1)));
	//   20   34:aload_0         
	//   21   35:getfield        #58  <Field android.support.v4.util.Pools$Pool mItemPool>
	//   22   38:aload           5
	//   23   40:invokeinterface #168 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   24   45:pop             
			}

	//   25   46:iload_1         
	//   26   47:iconst_1        
	//   27   48:iadd            
	//   28   49:istore_1        
		}
	//*  29   50:goto            23
		if(mMenu.size() == 0)
	//*  30   53:aload_0         
	//*  31   54:getfield        #142 <Field MenuBuilder mMenu>
	//*  32   57:invokevirtual   #174 <Method int MenuBuilder.size()>
	//*  33   60:ifne            79
		{
			mSelectedItemId = 0;
	//   34   63:aload_0         
	//   35   64:iconst_0        
	//   36   65:putfield        #62  <Field int mSelectedItemId>
			mSelectedItemPosition = 0;
	//   37   68:aload_0         
	//   38   69:iconst_0        
	//   39   70:putfield        #64  <Field int mSelectedItemPosition>
			mButtons = null;
	//   40   73:aload_0         
	//   41   74:aconst_null     
	//   42   75:putfield        #164 <Field BottomNavigationItemView[] mButtons>
			return;
	//   43   78:return          
		}
		mButtons = new BottomNavigationItemView[mMenu.size()];
	//   44   79:aload_0         
	//   45   80:aload_0         
	//   46   81:getfield        #142 <Field MenuBuilder mMenu>
	//   47   84:invokevirtual   #174 <Method int MenuBuilder.size()>
	//   48   87:anewarray       BottomNavigationItemView[]
	//   49   90:putfield        #164 <Field BottomNavigationItemView[] mButtons>
		boolean flag;
		if(mMenu.size() > 3)
	//*  50   93:aload_0         
	//*  51   94:getfield        #142 <Field MenuBuilder mMenu>
	//*  52   97:invokevirtual   #174 <Method int MenuBuilder.size()>
	//*  53  100:iconst_3        
	//*  54  101:icmple          109
			flag = true;
	//   55  104:iconst_1        
	//   56  105:istore_3        
		else
	//*  57  106:goto            111
			flag = false;
	//   58  109:iconst_0        
	//   59  110:istore_3        
		mShiftingMode = flag;
	//   60  111:aload_0         
	//   61  112:iload_3         
	//   62  113:putfield        #60  <Field boolean mShiftingMode>
		for(int j = 0; j < mMenu.size(); j++)
	//*  63  116:iconst_0        
	//*  64  117:istore_1        
	//*  65  118:iload_1         
	//*  66  119:aload_0         
	//*  67  120:getfield        #142 <Field MenuBuilder mMenu>
	//*  68  123:invokevirtual   #174 <Method int MenuBuilder.size()>
	//*  69  126:icmpge          255
		{
			mPresenter.setUpdateSuspended(true);
	//   70  129:aload_0         
	//   71  130:getfield        #138 <Field BottomNavigationPresenter mPresenter>
	//   72  133:iconst_1        
	//   73  134:invokevirtual   #180 <Method void BottomNavigationPresenter.setUpdateSuspended(boolean)>
			mMenu.getItem(j).setCheckable(true);
	//   74  137:aload_0         
	//   75  138:getfield        #142 <Field MenuBuilder mMenu>
	//   76  141:iload_1         
	//   77  142:invokevirtual   #184 <Method MenuItem MenuBuilder.getItem(int)>
	//   78  145:iconst_1        
	//   79  146:invokeinterface #190 <Method MenuItem MenuItem.setCheckable(boolean)>
	//   80  151:pop             
			mPresenter.setUpdateSuspended(false);
	//   81  152:aload_0         
	//   82  153:getfield        #138 <Field BottomNavigationPresenter mPresenter>
	//   83  156:iconst_0        
	//   84  157:invokevirtual   #180 <Method void BottomNavigationPresenter.setUpdateSuspended(boolean)>
			BottomNavigationItemView bottomnavigationitemview = getNewItem();
	//   85  160:aload_0         
	//   86  161:invokespecial   #192 <Method BottomNavigationItemView getNewItem()>
	//   87  164:astore          4
			mButtons[j] = bottomnavigationitemview;
	//   88  166:aload_0         
	//   89  167:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//   90  170:iload_1         
	//   91  171:aload           4
	//   92  173:aastore         
			bottomnavigationitemview.setIconTintList(mItemIconTint);
	//   93  174:aload           4
	//   94  176:aload_0         
	//   95  177:getfield        #194 <Field ColorStateList mItemIconTint>
	//   96  180:invokevirtual   #198 <Method void BottomNavigationItemView.setIconTintList(ColorStateList)>
			bottomnavigationitemview.setTextColor(mItemTextColor);
	//   97  183:aload           4
	//   98  185:aload_0         
	//   99  186:getfield        #200 <Field ColorStateList mItemTextColor>
	//  100  189:invokevirtual   #203 <Method void BottomNavigationItemView.setTextColor(ColorStateList)>
			bottomnavigationitemview.setItemBackground(mItemBackgroundRes);
	//  101  192:aload           4
	//  102  194:aload_0         
	//  103  195:getfield        #205 <Field int mItemBackgroundRes>
	//  104  198:invokevirtual   #208 <Method void BottomNavigationItemView.setItemBackground(int)>
			bottomnavigationitemview.setShiftingMode(mShiftingMode);
	//  105  201:aload           4
	//  106  203:aload_0         
	//  107  204:getfield        #60  <Field boolean mShiftingMode>
	//  108  207:invokevirtual   #211 <Method void BottomNavigationItemView.setShiftingMode(boolean)>
			bottomnavigationitemview.initialize((MenuItemImpl)mMenu.getItem(j), 0);
	//  109  210:aload           4
	//  110  212:aload_0         
	//  111  213:getfield        #142 <Field MenuBuilder mMenu>
	//  112  216:iload_1         
	//  113  217:invokevirtual   #184 <Method MenuItem MenuBuilder.getItem(int)>
	//  114  220:checkcast       #213 <Class MenuItemImpl>
	//  115  223:iconst_0        
	//  116  224:invokevirtual   #217 <Method void BottomNavigationItemView.initialize(MenuItemImpl, int)>
			bottomnavigationitemview.setItemPosition(j);
	//  117  227:aload           4
	//  118  229:iload_1         
	//  119  230:invokevirtual   #220 <Method void BottomNavigationItemView.setItemPosition(int)>
			bottomnavigationitemview.setOnClickListener(mOnClickListener);
	//  120  233:aload           4
	//  121  235:aload_0         
	//  122  236:getfield        #132 <Field android.view.View$OnClickListener mOnClickListener>
	//  123  239:invokevirtual   #224 <Method void BottomNavigationItemView.setOnClickListener(android.view.View$OnClickListener)>
			addView(((View) (bottomnavigationitemview)));
	//  124  242:aload_0         
	//  125  243:aload           4
	//  126  245:invokevirtual   #228 <Method void addView(View)>
		}

	//  127  248:iload_1         
	//  128  249:iconst_1        
	//  129  250:iadd            
	//  130  251:istore_1        
	//* 131  252:goto            118
		mSelectedItemPosition = Math.min(mMenu.size() - 1, mSelectedItemPosition);
	//  132  255:aload_0         
	//  133  256:aload_0         
	//  134  257:getfield        #142 <Field MenuBuilder mMenu>
	//  135  260:invokevirtual   #174 <Method int MenuBuilder.size()>
	//  136  263:iconst_1        
	//  137  264:isub            
	//  138  265:aload_0         
	//  139  266:getfield        #64  <Field int mSelectedItemPosition>
	//  140  269:invokestatic    #234 <Method int Math.min(int, int)>
	//  141  272:putfield        #64  <Field int mSelectedItemPosition>
		mMenu.getItem(mSelectedItemPosition).setChecked(true);
	//  142  275:aload_0         
	//  143  276:getfield        #142 <Field MenuBuilder mMenu>
	//  144  279:aload_0         
	//  145  280:getfield        #64  <Field int mSelectedItemPosition>
	//  146  283:invokevirtual   #184 <Method MenuItem MenuBuilder.getItem(int)>
	//  147  286:iconst_1        
	//  148  287:invokeinterface #237 <Method MenuItem MenuItem.setChecked(boolean)>
	//  149  292:pop             
	//  150  293:return          
	}

	public ColorStateList getIconTintList()
	{
		return mItemIconTint;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field ColorStateList mItemIconTint>
	//    2    4:areturn         
	}

	public int getItemBackgroundRes()
	{
		return mItemBackgroundRes;
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field int mItemBackgroundRes>
	//    2    4:ireturn         
	}

	public ColorStateList getItemTextColor()
	{
		return mItemTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field ColorStateList mItemTextColor>
	//    2    4:areturn         
	}

	public int getSelectedItemId()
	{
		return mSelectedItemId;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int mSelectedItemId>
	//    2    4:ireturn         
	}

	public int getWindowAnimations()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void initialize(MenuBuilder menubuilder)
	{
		mMenu = menubuilder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #142 <Field MenuBuilder mMenu>
	//    3    5:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		int i1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #251 <Method int getChildCount()>
	//    2    4:istore          6
		int j1 = l - j;
	//    3    6:iload           5
	//    4    8:iload_3         
	//    5    9:isub            
	//    6   10:istore          7
		j = 0;
	//    7   12:iconst_0        
	//    8   13:istore_3        
		l = j;
	//    9   14:iload_3         
	//   10   15:istore          5
		for(; j < i1; j++)
	//*  11   17:iload_3         
	//*  12   18:iload           6
	//*  13   20:icmpge          116
		{
			View view = getChildAt(j);
	//   14   23:aload_0         
	//   15   24:iload_3         
	//   16   25:invokevirtual   #255 <Method View getChildAt(int)>
	//   17   28:astore          9
			if(view.getVisibility() == 8)
	//*  18   30:aload           9
	//*  19   32:invokevirtual   #260 <Method int View.getVisibility()>
	//*  20   35:bipush          8
	//*  21   37:icmpne          43
				continue;
	//   22   40:goto            109
			if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
	//*  23   43:aload_0         
	//*  24   44:invokestatic    #266 <Method int ViewCompat.getLayoutDirection(View)>
	//*  25   47:iconst_1        
	//*  26   48:icmpne          81
			{
				int k1 = k - i - l;
	//   27   51:iload           4
	//   28   53:iload_2         
	//   29   54:isub            
	//   30   55:iload           5
	//   31   57:isub            
	//   32   58:istore          8
				view.layout(k1 - view.getMeasuredWidth(), 0, k1, j1);
	//   33   60:aload           9
	//   34   62:iload           8
	//   35   64:aload           9
	//   36   66:invokevirtual   #269 <Method int View.getMeasuredWidth()>
	//   37   69:isub            
	//   38   70:iconst_0        
	//   39   71:iload           8
	//   40   73:iload           7
	//   41   75:invokevirtual   #273 <Method void View.layout(int, int, int, int)>
			} else
	//*  42   78:goto            99
			{
				view.layout(l, 0, view.getMeasuredWidth() + l, j1);
	//   43   81:aload           9
	//   44   83:iload           5
	//   45   85:iconst_0        
	//   46   86:aload           9
	//   47   88:invokevirtual   #269 <Method int View.getMeasuredWidth()>
	//   48   91:iload           5
	//   49   93:iadd            
	//   50   94:iload           7
	//   51   96:invokevirtual   #273 <Method void View.layout(int, int, int, int)>
			}
			l += view.getMeasuredWidth();
	//   52   99:iload           5
	//   53  101:aload           9
	//   54  103:invokevirtual   #269 <Method int View.getMeasuredWidth()>
	//   55  106:iadd            
	//   56  107:istore          5
		}

	//   57  109:iload_3         
	//   58  110:iconst_1        
	//   59  111:iadd            
	//   60  112:istore_3        
	//*  61  113:goto            17
	//   62  116:return          
	}

	protected void onMeasure(int i, int j)
	{
		j = android.view.View.MeasureSpec.getSize(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #280 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore_2        
		int i1 = getChildCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #251 <Method int getChildCount()>
	//    5    9:istore          4
		int i2 = android.view.View.MeasureSpec.makeMeasureSpec(mItemHeight, 0x40000000);
	//    6   11:aload_0         
	//    7   12:getfield        #96  <Field int mItemHeight>
	//    8   15:ldc2            #281 <Int 0x40000000>
	//    9   18:invokestatic    #284 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   10   21:istore          7
		if(mShiftingMode)
	//*  11   23:aload_0         
	//*  12   24:getfield        #60  <Field boolean mShiftingMode>
	//*  13   27:ifeq            147
		{
			i = i1 - 1;
	//   14   30:iload           4
	//   15   32:iconst_1        
	//   16   33:isub            
	//   17   34:istore_1        
			int j1 = Math.min(j - mInactiveItemMinWidth * i, mActiveItemMaxWidth);
	//   18   35:iload_2         
	//   19   36:aload_0         
	//   20   37:getfield        #86  <Field int mInactiveItemMinWidth>
	//   21   40:iload_1         
	//   22   41:imul            
	//   23   42:isub            
	//   24   43:aload_0         
	//   25   44:getfield        #91  <Field int mActiveItemMaxWidth>
	//   26   47:invokestatic    #234 <Method int Math.min(int, int)>
	//   27   50:istore          5
			j -= j1;
	//   28   52:iload_2         
	//   29   53:iload           5
	//   30   55:isub            
	//   31   56:istore_2        
			int l1 = Math.min(j / i, mInactiveItemMaxWidth);
	//   32   57:iload_2         
	//   33   58:iload_1         
	//   34   59:idiv            
	//   35   60:aload_0         
	//   36   61:getfield        #81  <Field int mInactiveItemMaxWidth>
	//   37   64:invokestatic    #234 <Method int Math.min(int, int)>
	//   38   67:istore          6
			j -= i * l1;
	//   39   69:iload_2         
	//   40   70:iload_1         
	//   41   71:iload           6
	//   42   73:imul            
	//   43   74:isub            
	//   44   75:istore_2        
			for(i = 0; i < i1;)
	//*  45   76:iconst_0        
	//*  46   77:istore_1        
	//*  47   78:iload_1         
	//*  48   79:iload           4
	//*  49   81:icmpge          231
			{
				int ai[] = mTempChildWidths;
	//   50   84:aload_0         
	//   51   85:getfield        #134 <Field int[] mTempChildWidths>
	//   52   88:astore          8
				int k;
				if(i == mSelectedItemPosition)
	//*  53   90:iload_1         
	//*  54   91:aload_0         
	//*  55   92:getfield        #64  <Field int mSelectedItemPosition>
	//*  56   95:icmpne          104
					k = j1;
	//   57   98:iload           5
	//   58  100:istore_3        
				else
	//*  59  101:goto            107
					k = l1;
	//   60  104:iload           6
	//   61  106:istore_3        
				ai[i] = k;
	//   62  107:aload           8
	//   63  109:iload_1         
	//   64  110:iload_3         
	//   65  111:iastore         
				k = j;
	//   66  112:iload_2         
	//   67  113:istore_3        
				if(j > 0)
	//*  68  114:iload_2         
	//*  69  115:ifle            138
				{
					int ai1[] = mTempChildWidths;
	//   70  118:aload_0         
	//   71  119:getfield        #134 <Field int[] mTempChildWidths>
	//   72  122:astore          8
					ai1[i] = ai1[i] + 1;
	//   73  124:aload           8
	//   74  126:iload_1         
	//   75  127:aload           8
	//   76  129:iload_1         
	//   77  130:iaload          
	//   78  131:iconst_1        
	//   79  132:iadd            
	//   80  133:iastore         
					k = j - 1;
	//   81  134:iload_2         
	//   82  135:iconst_1        
	//   83  136:isub            
	//   84  137:istore_3        
				}
				i++;
	//   85  138:iload_1         
	//   86  139:iconst_1        
	//   87  140:iadd            
	//   88  141:istore_1        
				j = k;
	//   89  142:iload_3         
	//   90  143:istore_2        
			}

		} else
	//*  91  144:goto            78
		{
			if(i1 == 0)
	//*  92  147:iload           4
	//*  93  149:ifne            157
				i = 1;
	//   94  152:iconst_1        
	//   95  153:istore_1        
			else
	//*  96  154:goto            160
				i = i1;
	//   97  157:iload           4
	//   98  159:istore_1        
			int k1 = Math.min(j / i, mActiveItemMaxWidth);
	//   99  160:iload_2         
	//  100  161:iload_1         
	//  101  162:idiv            
	//  102  163:aload_0         
	//  103  164:getfield        #91  <Field int mActiveItemMaxWidth>
	//  104  167:invokestatic    #234 <Method int Math.min(int, int)>
	//  105  170:istore          5
			j -= k1 * i1;
	//  106  172:iload_2         
	//  107  173:iload           5
	//  108  175:iload           4
	//  109  177:imul            
	//  110  178:isub            
	//  111  179:istore_2        
			for(i = 0; i < i1;)
	//* 112  180:iconst_0        
	//* 113  181:istore_1        
	//* 114  182:iload_1         
	//* 115  183:iload           4
	//* 116  185:icmpge          231
			{
				mTempChildWidths[i] = k1;
	//  117  188:aload_0         
	//  118  189:getfield        #134 <Field int[] mTempChildWidths>
	//  119  192:iload_1         
	//  120  193:iload           5
	//  121  195:iastore         
				int l = j;
	//  122  196:iload_2         
	//  123  197:istore_3        
				if(j > 0)
	//* 124  198:iload_2         
	//* 125  199:ifle            222
				{
					int ai2[] = mTempChildWidths;
	//  126  202:aload_0         
	//  127  203:getfield        #134 <Field int[] mTempChildWidths>
	//  128  206:astore          8
					ai2[i] = ai2[i] + 1;
	//  129  208:aload           8
	//  130  210:iload_1         
	//  131  211:aload           8
	//  132  213:iload_1         
	//  133  214:iaload          
	//  134  215:iconst_1        
	//  135  216:iadd            
	//  136  217:iastore         
					l = j - 1;
	//  137  218:iload_2         
	//  138  219:iconst_1        
	//  139  220:isub            
	//  140  221:istore_3        
				}
				i++;
	//  141  222:iload_1         
	//  142  223:iconst_1        
	//  143  224:iadd            
	//  144  225:istore_1        
				j = l;
	//  145  226:iload_3         
	//  146  227:istore_2        
			}

		}
	//* 147  228:goto            182
		i = 0;
	//  148  231:iconst_0        
	//  149  232:istore_1        
		j = i;
	//  150  233:iload_1         
	//  151  234:istore_2        
		for(; i < i1; i++)
	//* 152  235:iload_1         
	//* 153  236:iload           4
	//* 154  238:icmpge          308
		{
			View view = getChildAt(i);
	//  155  241:aload_0         
	//  156  242:iload_1         
	//  157  243:invokevirtual   #255 <Method View getChildAt(int)>
	//  158  246:astore          8
			if(view.getVisibility() != 8)
	//* 159  248:aload           8
	//* 160  250:invokevirtual   #260 <Method int View.getVisibility()>
	//* 161  253:bipush          8
	//* 162  255:icmpne          261
	//* 163  258:goto            301
			{
				view.measure(android.view.View.MeasureSpec.makeMeasureSpec(mTempChildWidths[i], 0x40000000), i2);
	//  164  261:aload           8
	//  165  263:aload_0         
	//  166  264:getfield        #134 <Field int[] mTempChildWidths>
	//  167  267:iload_1         
	//  168  268:iaload          
	//  169  269:ldc2            #281 <Int 0x40000000>
	//  170  272:invokestatic    #284 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  171  275:iload           7
	//  172  277:invokevirtual   #287 <Method void View.measure(int, int)>
				view.getLayoutParams().width = view.getMeasuredWidth();
	//  173  280:aload           8
	//  174  282:invokevirtual   #291 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  175  285:aload           8
	//  176  287:invokevirtual   #269 <Method int View.getMeasuredWidth()>
	//  177  290:putfield        #296 <Field int android.view.ViewGroup$LayoutParams.width>
				j += view.getMeasuredWidth();
	//  178  293:iload_2         
	//  179  294:aload           8
	//  180  296:invokevirtual   #269 <Method int View.getMeasuredWidth()>
	//  181  299:iadd            
	//  182  300:istore_2        
			}
		}

	//  183  301:iload_1         
	//  184  302:iconst_1        
	//  185  303:iadd            
	//  186  304:istore_1        
	//* 187  305:goto            235
		setMeasuredDimension(View.resolveSizeAndState(j, android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000), 0), View.resolveSizeAndState(mItemHeight, i2, 0));
	//  188  308:aload_0         
	//  189  309:iload_2         
	//  190  310:iload_2         
	//  191  311:ldc2            #281 <Int 0x40000000>
	//  192  314:invokestatic    #284 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  193  317:iconst_0        
	//  194  318:invokestatic    #300 <Method int View.resolveSizeAndState(int, int, int)>
	//  195  321:aload_0         
	//  196  322:getfield        #96  <Field int mItemHeight>
	//  197  325:iload           7
	//  198  327:iconst_0        
	//  199  328:invokestatic    #300 <Method int View.resolveSizeAndState(int, int, int)>
	//  200  331:invokevirtual   #303 <Method void setMeasuredDimension(int, int)>
	//  201  334:return          
	}

	public void setIconTintList(ColorStateList colorstatelist)
	{
		mItemIconTint = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #194 <Field ColorStateList mItemIconTint>
		if(mButtons == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		BottomNavigationItemView abottomnavigationitemview[] = mButtons;
	//    7   13:aload_0         
	//    8   14:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//    9   17:astore          4
		int j = abottomnavigationitemview.length;
	//   10   19:aload           4
	//   11   21:arraylength     
	//   12   22:istore_3        
		for(int i = 0; i < j; i++)
	//*  13   23:iconst_0        
	//*  14   24:istore_2        
	//*  15   25:iload_2         
	//*  16   26:iload_3         
	//*  17   27:icmpge          45
			abottomnavigationitemview[i].setIconTintList(colorstatelist);
	//   18   30:aload           4
	//   19   32:iload_2         
	//   20   33:aaload          
	//   21   34:aload_1         
	//   22   35:invokevirtual   #198 <Method void BottomNavigationItemView.setIconTintList(ColorStateList)>

	//   23   38:iload_2         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_2        
	//*  27   42:goto            25
	//   28   45:return          
	}

	public void setItemBackgroundRes(int i)
	{
		mItemBackgroundRes = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #205 <Field int mItemBackgroundRes>
		if(mButtons == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		BottomNavigationItemView abottomnavigationitemview[] = mButtons;
	//    7   13:aload_0         
	//    8   14:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//    9   17:astore          4
		int k = abottomnavigationitemview.length;
	//   10   19:aload           4
	//   11   21:arraylength     
	//   12   22:istore_3        
		for(int j = 0; j < k; j++)
	//*  13   23:iconst_0        
	//*  14   24:istore_2        
	//*  15   25:iload_2         
	//*  16   26:iload_3         
	//*  17   27:icmpge          45
			abottomnavigationitemview[j].setItemBackground(i);
	//   18   30:aload           4
	//   19   32:iload_2         
	//   20   33:aaload          
	//   21   34:iload_1         
	//   22   35:invokevirtual   #208 <Method void BottomNavigationItemView.setItemBackground(int)>

	//   23   38:iload_2         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_2        
	//*  27   42:goto            25
	//   28   45:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		mItemTextColor = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #200 <Field ColorStateList mItemTextColor>
		if(mButtons == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		BottomNavigationItemView abottomnavigationitemview[] = mButtons;
	//    7   13:aload_0         
	//    8   14:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//    9   17:astore          4
		int j = abottomnavigationitemview.length;
	//   10   19:aload           4
	//   11   21:arraylength     
	//   12   22:istore_3        
		for(int i = 0; i < j; i++)
	//*  13   23:iconst_0        
	//*  14   24:istore_2        
	//*  15   25:iload_2         
	//*  16   26:iload_3         
	//*  17   27:icmpge          45
			abottomnavigationitemview[i].setTextColor(colorstatelist);
	//   18   30:aload           4
	//   19   32:iload_2         
	//   20   33:aaload          
	//   21   34:aload_1         
	//   22   35:invokevirtual   #203 <Method void BottomNavigationItemView.setTextColor(ColorStateList)>

	//   23   38:iload_2         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_2        
	//*  27   42:goto            25
	//   28   45:return          
	}

	public void setPresenter(BottomNavigationPresenter bottomnavigationpresenter)
	{
		mPresenter = bottomnavigationpresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #138 <Field BottomNavigationPresenter mPresenter>
	//    3    5:return          
	}

	void tryRestoreSelectedItemId(int i)
	{
		int k = mMenu.size();
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field MenuBuilder mMenu>
	//    2    4:invokevirtual   #174 <Method int MenuBuilder.size()>
	//    3    7:istore_3        
		for(int j = 0; j < k; j++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          63
		{
			MenuItem menuitem = mMenu.getItem(j);
	//    9   15:aload_0         
	//   10   16:getfield        #142 <Field MenuBuilder mMenu>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #184 <Method MenuItem MenuBuilder.getItem(int)>
	//   13   23:astore          4
			if(i == menuitem.getItemId())
	//*  14   25:iload_1         
	//*  15   26:aload           4
	//*  16   28:invokeinterface #311 <Method int MenuItem.getItemId()>
	//*  17   33:icmpne          56
			{
				mSelectedItemId = i;
	//   18   36:aload_0         
	//   19   37:iload_1         
	//   20   38:putfield        #62  <Field int mSelectedItemId>
				mSelectedItemPosition = j;
	//   21   41:aload_0         
	//   22   42:iload_2         
	//   23   43:putfield        #64  <Field int mSelectedItemPosition>
				menuitem.setChecked(true);
	//   24   46:aload           4
	//   25   48:iconst_1        
	//   26   49:invokeinterface #237 <Method MenuItem MenuItem.setChecked(boolean)>
	//   27   54:pop             
				return;
	//   28   55:return          
			}
		}

	//   29   56:iload_2         
	//   30   57:iconst_1        
	//   31   58:iadd            
	//   32   59:istore_2        
	//*  33   60:goto            10
	//   34   63:return          
	}

	public void updateMenuView()
	{
		int k = mMenu.size();
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field MenuBuilder mMenu>
	//    2    4:invokevirtual   #174 <Method int MenuBuilder.size()>
	//    3    7:istore_2        
		if(k != mButtons.length)
	//*   4    8:iload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//*   7   13:arraylength     
	//*   8   14:icmpeq          22
		{
			buildMenuView();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #314 <Method void buildMenuView()>
			return;
	//   11   21:return          
		}
		int l = mSelectedItemId;
	//   12   22:aload_0         
	//   13   23:getfield        #62  <Field int mSelectedItemId>
	//   14   26:istore_3        
		for(int i = 0; i < k; i++)
	//*  15   27:iconst_0        
	//*  16   28:istore_1        
	//*  17   29:iload_1         
	//*  18   30:iload_2         
	//*  19   31:icmpge          77
		{
			MenuItem menuitem = mMenu.getItem(i);
	//   20   34:aload_0         
	//   21   35:getfield        #142 <Field MenuBuilder mMenu>
	//   22   38:iload_1         
	//   23   39:invokevirtual   #184 <Method MenuItem MenuBuilder.getItem(int)>
	//   24   42:astore          4
			if(menuitem.isChecked())
	//*  25   44:aload           4
	//*  26   46:invokeinterface #318 <Method boolean MenuItem.isChecked()>
	//*  27   51:ifeq            70
			{
				mSelectedItemId = menuitem.getItemId();
	//   28   54:aload_0         
	//   29   55:aload           4
	//   30   57:invokeinterface #311 <Method int MenuItem.getItemId()>
	//   31   62:putfield        #62  <Field int mSelectedItemId>
				mSelectedItemPosition = i;
	//   32   65:aload_0         
	//   33   66:iload_1         
	//   34   67:putfield        #64  <Field int mSelectedItemPosition>
			}
		}

	//   35   70:iload_1         
	//   36   71:iconst_1        
	//   37   72:iadd            
	//   38   73:istore_1        
	//*  39   74:goto            29
		if(l != mSelectedItemId)
	//*  40   77:iload_3         
	//*  41   78:aload_0         
	//*  42   79:getfield        #62  <Field int mSelectedItemId>
	//*  43   82:icmpeq          93
			TransitionManager.beginDelayedTransition(((ViewGroup) (this)), ((android.support.transition.Transition) (mSet)));
	//   44   85:aload_0         
	//   45   86:aload_0         
	//   46   87:getfield        #103 <Field TransitionSet mSet>
	//   47   90:invokestatic    #324 <Method void TransitionManager.beginDelayedTransition(ViewGroup, android.support.transition.Transition)>
		for(int j = 0; j < k; j++)
	//*  48   93:iconst_0        
	//*  49   94:istore_1        
	//*  50   95:iload_1         
	//*  51   96:iload_2         
	//*  52   97:icmpge          144
		{
			mPresenter.setUpdateSuspended(true);
	//   53  100:aload_0         
	//   54  101:getfield        #138 <Field BottomNavigationPresenter mPresenter>
	//   55  104:iconst_1        
	//   56  105:invokevirtual   #180 <Method void BottomNavigationPresenter.setUpdateSuspended(boolean)>
			mButtons[j].initialize((MenuItemImpl)mMenu.getItem(j), 0);
	//   57  108:aload_0         
	//   58  109:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//   59  112:iload_1         
	//   60  113:aaload          
	//   61  114:aload_0         
	//   62  115:getfield        #142 <Field MenuBuilder mMenu>
	//   63  118:iload_1         
	//   64  119:invokevirtual   #184 <Method MenuItem MenuBuilder.getItem(int)>
	//   65  122:checkcast       #213 <Class MenuItemImpl>
	//   66  125:iconst_0        
	//   67  126:invokevirtual   #217 <Method void BottomNavigationItemView.initialize(MenuItemImpl, int)>
			mPresenter.setUpdateSuspended(false);
	//   68  129:aload_0         
	//   69  130:getfield        #138 <Field BottomNavigationPresenter mPresenter>
	//   70  133:iconst_0        
	//   71  134:invokevirtual   #180 <Method void BottomNavigationPresenter.setUpdateSuspended(boolean)>
		}

	//   72  137:iload_1         
	//   73  138:iconst_1        
	//   74  139:iadd            
	//   75  140:istore_1        
	//*  76  141:goto            95
	//   77  144:return          
	}

	private static final long ACTIVE_ANIMATION_DURATION_MS = 115L;
	private final int mActiveItemMaxWidth;
	private BottomNavigationItemView mButtons[];
	private final int mInactiveItemMaxWidth;
	private final int mInactiveItemMinWidth;
	private int mItemBackgroundRes;
	private final int mItemHeight;
	private ColorStateList mItemIconTint;
	private final android.support.v4.util.Pools.Pool mItemPool;
	private ColorStateList mItemTextColor;
	private MenuBuilder mMenu;
	private final android.view.View.OnClickListener mOnClickListener;
	private BottomNavigationPresenter mPresenter;
	private int mSelectedItemId;
	private int mSelectedItemPosition;
	private final TransitionSet mSet;
	private boolean mShiftingMode;
	private int mTempChildWidths[];


/*
	static BottomNavigationPresenter access$000(BottomNavigationMenuView bottomnavigationmenuview)
	{
		return bottomnavigationmenuview.mPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field BottomNavigationPresenter mPresenter>
	//    2    4:areturn         
	}

*/


/*
	static MenuBuilder access$100(BottomNavigationMenuView bottomnavigationmenuview)
	{
		return bottomnavigationmenuview.mMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

*/
}
