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
				if(!b.mMenu.performItemAction(((MenuItem) (view)), ((android.support.v7.view.menu.MenuPresenter) (b.mPresenter)), 0))
			//*   4    8:aload_0         
			//*   5    9:getfield        #16  <Field BottomNavigationMenuView b>
			//*   6   12:invokestatic    #32  <Method MenuBuilder BottomNavigationMenuView.access$100(BottomNavigationMenuView)>
			//*   7   15:aload_1         
			//*   8   16:aload_0         
			//*   9   17:getfield        #16  <Field BottomNavigationMenuView b>
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

			final BottomNavigationMenuView b;

			
			{
				b = BottomNavigationMenuView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BottomNavigationMenuView b>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   71  143:aload_0         
	//   72  144:new             #8   <Class BottomNavigationMenuView$2>
	//   73  147:dup             
	//   74  148:aload_0         
	//   75  149:invokespecial   #130 <Method void BottomNavigationMenuView$2(BottomNavigationMenuView)>
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
		k -= i;
	//    3    6:iload           4
	//    4    8:iload_2         
	//    5    9:isub            
	//    6   10:istore          4
		l -= j;
	//    7   12:iload           5
	//    8   14:iload_3         
	//    9   15:isub            
	//   10   16:istore          5
		j = 0;
	//   11   18:iconst_0        
	//   12   19:istore_3        
		for(i = 0; i < i1; i++)
	//*  13   20:iconst_0        
	//*  14   21:istore_2        
	//*  15   22:iload_2         
	//*  16   23:iload           6
	//*  17   25:icmpge          112
		{
			View view = getChildAt(i);
	//   18   28:aload_0         
	//   19   29:iload_2         
	//   20   30:invokevirtual   #255 <Method View getChildAt(int)>
	//   21   33:astore          7
			if(view.getVisibility() == 8)
	//*  22   35:aload           7
	//*  23   37:invokevirtual   #260 <Method int View.getVisibility()>
	//*  24   40:bipush          8
	//*  25   42:icmpne          48
				continue;
	//   26   45:goto            105
			if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
	//*  27   48:aload_0         
	//*  28   49:invokestatic    #266 <Method int ViewCompat.getLayoutDirection(View)>
	//*  29   52:iconst_1        
	//*  30   53:icmpne          81
				view.layout(k - j - view.getMeasuredWidth(), 0, k - j, l);
	//   31   56:aload           7
	//   32   58:iload           4
	//   33   60:iload_3         
	//   34   61:isub            
	//   35   62:aload           7
	//   36   64:invokevirtual   #269 <Method int View.getMeasuredWidth()>
	//   37   67:isub            
	//   38   68:iconst_0        
	//   39   69:iload           4
	//   40   71:iload_3         
	//   41   72:isub            
	//   42   73:iload           5
	//   43   75:invokevirtual   #273 <Method void View.layout(int, int, int, int)>
			else
	//*  44   78:goto            97
				view.layout(j, 0, view.getMeasuredWidth() + j, l);
	//   45   81:aload           7
	//   46   83:iload_3         
	//   47   84:iconst_0        
	//   48   85:aload           7
	//   49   87:invokevirtual   #269 <Method int View.getMeasuredWidth()>
	//   50   90:iload_3         
	//   51   91:iadd            
	//   52   92:iload           5
	//   53   94:invokevirtual   #273 <Method void View.layout(int, int, int, int)>
			j += view.getMeasuredWidth();
	//   54   97:iload_3         
	//   55   98:aload           7
	//   56  100:invokevirtual   #269 <Method int View.getMeasuredWidth()>
	//   57  103:iadd            
	//   58  104:istore_3        
		}

	//   59  105:iload_2         
	//   60  106:iconst_1        
	//   61  107:iadd            
	//   62  108:istore_2        
	//*  63  109:goto            22
	//   64  112:return          
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
	//*  13   27:ifeq            151
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
			int l1 = Math.min((j - j1) / i, mInactiveItemMaxWidth);
	//   28   52:iload_2         
	//   29   53:iload           5
	//   30   55:isub            
	//   31   56:iload_1         
	//   32   57:idiv            
	//   33   58:aload_0         
	//   34   59:getfield        #81  <Field int mInactiveItemMaxWidth>
	//   35   62:invokestatic    #234 <Method int Math.min(int, int)>
	//   36   65:istore          6
			j = j - j1 - l1 * i;
	//   37   67:iload_2         
	//   38   68:iload           5
	//   39   70:isub            
	//   40   71:iload           6
	//   41   73:iload_1         
	//   42   74:imul            
	//   43   75:isub            
	//   44   76:istore_2        
			for(i = 0; i < i1;)
	//*  45   77:iconst_0        
	//*  46   78:istore_1        
	//*  47   79:iload_1         
	//*  48   80:iload           4
	//*  49   82:icmpge          148
			{
				int ai[] = mTempChildWidths;
	//   50   85:aload_0         
	//   51   86:getfield        #134 <Field int[] mTempChildWidths>
	//   52   89:astore          8
				int k;
				if(i == mSelectedItemPosition)
	//*  53   91:iload_1         
	//*  54   92:aload_0         
	//*  55   93:getfield        #64  <Field int mSelectedItemPosition>
	//*  56   96:icmpne          105
					k = j1;
	//   57   99:iload           5
	//   58  101:istore_3        
				else
	//*  59  102:goto            108
					k = l1;
	//   60  105:iload           6
	//   61  107:istore_3        
				ai[i] = k;
	//   62  108:aload           8
	//   63  110:iload_1         
	//   64  111:iload_3         
	//   65  112:iastore         
				k = j;
	//   66  113:iload_2         
	//   67  114:istore_3        
				if(j > 0)
	//*  68  115:iload_2         
	//*  69  116:ifle            139
				{
					int ai1[] = mTempChildWidths;
	//   70  119:aload_0         
	//   71  120:getfield        #134 <Field int[] mTempChildWidths>
	//   72  123:astore          8
					ai1[i] = ai1[i] + 1;
	//   73  125:aload           8
	//   74  127:iload_1         
	//   75  128:aload           8
	//   76  130:iload_1         
	//   77  131:iaload          
	//   78  132:iconst_1        
	//   79  133:iadd            
	//   80  134:iastore         
					k = j - 1;
	//   81  135:iload_2         
	//   82  136:iconst_1        
	//   83  137:isub            
	//   84  138:istore_3        
				}
				i++;
	//   85  139:iload_1         
	//   86  140:iconst_1        
	//   87  141:iadd            
	//   88  142:istore_1        
				j = k;
	//   89  143:iload_3         
	//   90  144:istore_2        
			}

		} else
	//*  91  145:goto            79
	//*  92  148:goto            235
		{
			if(i1 == 0)
	//*  93  151:iload           4
	//*  94  153:ifne            161
				i = 1;
	//   95  156:iconst_1        
	//   96  157:istore_1        
			else
	//*  97  158:goto            164
				i = i1;
	//   98  161:iload           4
	//   99  163:istore_1        
			int k1 = Math.min(j / i, mActiveItemMaxWidth);
	//  100  164:iload_2         
	//  101  165:iload_1         
	//  102  166:idiv            
	//  103  167:aload_0         
	//  104  168:getfield        #91  <Field int mActiveItemMaxWidth>
	//  105  171:invokestatic    #234 <Method int Math.min(int, int)>
	//  106  174:istore          5
			j -= k1 * i1;
	//  107  176:iload_2         
	//  108  177:iload           5
	//  109  179:iload           4
	//  110  181:imul            
	//  111  182:isub            
	//  112  183:istore_2        
			for(i = 0; i < i1;)
	//* 113  184:iconst_0        
	//* 114  185:istore_1        
	//* 115  186:iload_1         
	//* 116  187:iload           4
	//* 117  189:icmpge          235
			{
				mTempChildWidths[i] = k1;
	//  118  192:aload_0         
	//  119  193:getfield        #134 <Field int[] mTempChildWidths>
	//  120  196:iload_1         
	//  121  197:iload           5
	//  122  199:iastore         
				int l = j;
	//  123  200:iload_2         
	//  124  201:istore_3        
				if(j > 0)
	//* 125  202:iload_2         
	//* 126  203:ifle            226
				{
					int ai2[] = mTempChildWidths;
	//  127  206:aload_0         
	//  128  207:getfield        #134 <Field int[] mTempChildWidths>
	//  129  210:astore          8
					ai2[i] = ai2[i] + 1;
	//  130  212:aload           8
	//  131  214:iload_1         
	//  132  215:aload           8
	//  133  217:iload_1         
	//  134  218:iaload          
	//  135  219:iconst_1        
	//  136  220:iadd            
	//  137  221:iastore         
					l = j - 1;
	//  138  222:iload_2         
	//  139  223:iconst_1        
	//  140  224:isub            
	//  141  225:istore_3        
				}
				i++;
	//  142  226:iload_1         
	//  143  227:iconst_1        
	//  144  228:iadd            
	//  145  229:istore_1        
				j = l;
	//  146  230:iload_3         
	//  147  231:istore_2        
			}

		}
	//* 148  232:goto            186
		j = 0;
	//  149  235:iconst_0        
	//  150  236:istore_2        
		for(i = 0; i < i1; i++)
	//* 151  237:iconst_0        
	//* 152  238:istore_1        
	//* 153  239:iload_1         
	//* 154  240:iload           4
	//* 155  242:icmpge          312
		{
			View view = getChildAt(i);
	//  156  245:aload_0         
	//  157  246:iload_1         
	//  158  247:invokevirtual   #255 <Method View getChildAt(int)>
	//  159  250:astore          8
			if(view.getVisibility() != 8)
	//* 160  252:aload           8
	//* 161  254:invokevirtual   #260 <Method int View.getVisibility()>
	//* 162  257:bipush          8
	//* 163  259:icmpne          265
	//* 164  262:goto            305
			{
				view.measure(android.view.View.MeasureSpec.makeMeasureSpec(mTempChildWidths[i], 0x40000000), i2);
	//  165  265:aload           8
	//  166  267:aload_0         
	//  167  268:getfield        #134 <Field int[] mTempChildWidths>
	//  168  271:iload_1         
	//  169  272:iaload          
	//  170  273:ldc2            #281 <Int 0x40000000>
	//  171  276:invokestatic    #284 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  172  279:iload           7
	//  173  281:invokevirtual   #287 <Method void View.measure(int, int)>
				view.getLayoutParams().width = view.getMeasuredWidth();
	//  174  284:aload           8
	//  175  286:invokevirtual   #291 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  176  289:aload           8
	//  177  291:invokevirtual   #269 <Method int View.getMeasuredWidth()>
	//  178  294:putfield        #296 <Field int android.view.ViewGroup$LayoutParams.width>
				j += view.getMeasuredWidth();
	//  179  297:iload_2         
	//  180  298:aload           8
	//  181  300:invokevirtual   #269 <Method int View.getMeasuredWidth()>
	//  182  303:iadd            
	//  183  304:istore_2        
			}
		}

	//  184  305:iload_1         
	//  185  306:iconst_1        
	//  186  307:iadd            
	//  187  308:istore_1        
	//* 188  309:goto            239
		setMeasuredDimension(View.resolveSizeAndState(j, android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000), 0), View.resolveSizeAndState(mItemHeight, i2, 0));
	//  189  312:aload_0         
	//  190  313:iload_2         
	//  191  314:iload_2         
	//  192  315:ldc2            #281 <Int 0x40000000>
	//  193  318:invokestatic    #284 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  194  321:iconst_0        
	//  195  322:invokestatic    #300 <Method int View.resolveSizeAndState(int, int, int)>
	//  196  325:aload_0         
	//  197  326:getfield        #96  <Field int mItemHeight>
	//  198  329:iload           7
	//  199  331:iconst_0        
	//  200  332:invokestatic    #300 <Method int View.resolveSizeAndState(int, int, int)>
	//  201  335:invokevirtual   #303 <Method void setMeasuredDimension(int, int)>
	//  202  338:return          
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
		int j = mMenu.size();
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field MenuBuilder mMenu>
	//    2    4:invokevirtual   #174 <Method int MenuBuilder.size()>
	//    3    7:istore_2        
		if(j != mButtons.length)
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
		int k = mSelectedItemId;
	//   12   22:aload_0         
	//   13   23:getfield        #62  <Field int mSelectedItemId>
	//   14   26:istore_3        
		for(int i = 0; i < j; i++)
	//*  15   27:iconst_0        
	//*  16   28:istore_1        
	//*  17   29:iload_1         
	//*  18   30:iload_2         
	//*  19   31:icmpge          108
		{
			mPresenter.setUpdateSuspended(true);
	//   20   34:aload_0         
	//   21   35:getfield        #138 <Field BottomNavigationPresenter mPresenter>
	//   22   38:iconst_1        
	//   23   39:invokevirtual   #180 <Method void BottomNavigationPresenter.setUpdateSuspended(boolean)>
			MenuItem menuitem = mMenu.getItem(i);
	//   24   42:aload_0         
	//   25   43:getfield        #142 <Field MenuBuilder mMenu>
	//   26   46:iload_1         
	//   27   47:invokevirtual   #184 <Method MenuItem MenuBuilder.getItem(int)>
	//   28   50:astore          4
			if(menuitem.isChecked())
	//*  29   52:aload           4
	//*  30   54:invokeinterface #318 <Method boolean MenuItem.isChecked()>
	//*  31   59:ifeq            78
			{
				mSelectedItemId = menuitem.getItemId();
	//   32   62:aload_0         
	//   33   63:aload           4
	//   34   65:invokeinterface #311 <Method int MenuItem.getItemId()>
	//   35   70:putfield        #62  <Field int mSelectedItemId>
				mSelectedItemPosition = i;
	//   36   73:aload_0         
	//   37   74:iload_1         
	//   38   75:putfield        #64  <Field int mSelectedItemPosition>
			}
			mButtons[i].initialize((MenuItemImpl)menuitem, 0);
	//   39   78:aload_0         
	//   40   79:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//   41   82:iload_1         
	//   42   83:aaload          
	//   43   84:aload           4
	//   44   86:checkcast       #213 <Class MenuItemImpl>
	//   45   89:iconst_0        
	//   46   90:invokevirtual   #217 <Method void BottomNavigationItemView.initialize(MenuItemImpl, int)>
			mPresenter.setUpdateSuspended(false);
	//   47   93:aload_0         
	//   48   94:getfield        #138 <Field BottomNavigationPresenter mPresenter>
	//   49   97:iconst_0        
	//   50   98:invokevirtual   #180 <Method void BottomNavigationPresenter.setUpdateSuspended(boolean)>
		}

	//   51  101:iload_1         
	//   52  102:iconst_1        
	//   53  103:iadd            
	//   54  104:istore_1        
	//*  55  105:goto            29
		if(k != mSelectedItemId)
	//*  56  108:iload_3         
	//*  57  109:aload_0         
	//*  58  110:getfield        #62  <Field int mSelectedItemId>
	//*  59  113:icmpeq          120
			TransitionManager.beginDelayedTransition(((ViewGroup) (this)));
	//   60  116:aload_0         
	//   61  117:invokestatic    #324 <Method void TransitionManager.beginDelayedTransition(ViewGroup)>
	//   62  120:return          
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
