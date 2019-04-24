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
	//*  54  101:icmple          250
			flag = true;
	//   55  104:iconst_1        
	//   56  105:istore_3        
		else
	//*  57  106:aload_0         
	//*  58  107:iload_3         
	//*  59  108:putfield        #60  <Field boolean mShiftingMode>
	//*  60  111:iconst_0        
	//*  61  112:istore_1        
	//*  62  113:iload_1         
	//*  63  114:aload_0         
	//*  64  115:getfield        #142 <Field MenuBuilder mMenu>
	//*  65  118:invokevirtual   #174 <Method int MenuBuilder.size()>
	//*  66  121:icmpge          255
	//*  67  124:aload_0         
	//*  68  125:getfield        #138 <Field BottomNavigationPresenter mPresenter>
	//*  69  128:iconst_1        
	//*  70  129:invokevirtual   #180 <Method void BottomNavigationPresenter.setUpdateSuspended(boolean)>
	//*  71  132:aload_0         
	//*  72  133:getfield        #142 <Field MenuBuilder mMenu>
	//*  73  136:iload_1         
	//*  74  137:invokevirtual   #184 <Method MenuItem MenuBuilder.getItem(int)>
	//*  75  140:iconst_1        
	//*  76  141:invokeinterface #190 <Method MenuItem MenuItem.setCheckable(boolean)>
	//*  77  146:pop             
	//*  78  147:aload_0         
	//*  79  148:getfield        #138 <Field BottomNavigationPresenter mPresenter>
	//*  80  151:iconst_0        
	//*  81  152:invokevirtual   #180 <Method void BottomNavigationPresenter.setUpdateSuspended(boolean)>
	//*  82  155:aload_0         
	//*  83  156:invokespecial   #192 <Method BottomNavigationItemView getNewItem()>
	//*  84  159:astore          4
	//*  85  161:aload_0         
	//*  86  162:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//*  87  165:iload_1         
	//*  88  166:aload           4
	//*  89  168:aastore         
	//*  90  169:aload           4
	//*  91  171:aload_0         
	//*  92  172:getfield        #194 <Field ColorStateList mItemIconTint>
	//*  93  175:invokevirtual   #198 <Method void BottomNavigationItemView.setIconTintList(ColorStateList)>
	//*  94  178:aload           4
	//*  95  180:aload_0         
	//*  96  181:getfield        #200 <Field ColorStateList mItemTextColor>
	//*  97  184:invokevirtual   #203 <Method void BottomNavigationItemView.setTextColor(ColorStateList)>
	//*  98  187:aload           4
	//*  99  189:aload_0         
	//* 100  190:getfield        #205 <Field int mItemBackgroundRes>
	//* 101  193:invokevirtual   #208 <Method void BottomNavigationItemView.setItemBackground(int)>
	//* 102  196:aload           4
	//* 103  198:aload_0         
	//* 104  199:getfield        #60  <Field boolean mShiftingMode>
	//* 105  202:invokevirtual   #211 <Method void BottomNavigationItemView.setShiftingMode(boolean)>
	//* 106  205:aload           4
	//* 107  207:aload_0         
	//* 108  208:getfield        #142 <Field MenuBuilder mMenu>
	//* 109  211:iload_1         
	//* 110  212:invokevirtual   #184 <Method MenuItem MenuBuilder.getItem(int)>
	//* 111  215:checkcast       #213 <Class MenuItemImpl>
	//* 112  218:iconst_0        
	//* 113  219:invokevirtual   #217 <Method void BottomNavigationItemView.initialize(MenuItemImpl, int)>
	//* 114  222:aload           4
	//* 115  224:iload_1         
	//* 116  225:invokevirtual   #220 <Method void BottomNavigationItemView.setItemPosition(int)>
	//* 117  228:aload           4
	//* 118  230:aload_0         
	//* 119  231:getfield        #132 <Field android.view.View$OnClickListener mOnClickListener>
	//* 120  234:invokevirtual   #224 <Method void BottomNavigationItemView.setOnClickListener(android.view.View$OnClickListener)>
	//* 121  237:aload_0         
	//* 122  238:aload           4
	//* 123  240:invokevirtual   #228 <Method void addView(View)>
	//* 124  243:iload_1         
	//* 125  244:iconst_1        
	//* 126  245:iadd            
	//* 127  246:istore_1        
	//* 128  247:goto            113
			flag = false;
	//  129  250:iconst_0        
	//  130  251:istore_3        
		mShiftingMode = flag;
		for(int j = 0; j < mMenu.size(); j++)
		{
			mPresenter.setUpdateSuspended(true);
			mMenu.getItem(j).setCheckable(true);
			mPresenter.setUpdateSuspended(false);
			BottomNavigationItemView bottomnavigationitemview = getNewItem();
			mButtons[j] = bottomnavigationitemview;
			bottomnavigationitemview.setIconTintList(mItemIconTint);
			bottomnavigationitemview.setTextColor(mItemTextColor);
			bottomnavigationitemview.setItemBackground(mItemBackgroundRes);
			bottomnavigationitemview.setShiftingMode(mShiftingMode);
			bottomnavigationitemview.initialize((MenuItemImpl)mMenu.getItem(j), 0);
			bottomnavigationitemview.setItemPosition(j);
			bottomnavigationitemview.setOnClickListener(mOnClickListener);
			addView(((View) (bottomnavigationitemview)));
		}

	//* 131  252:goto            106
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
		i = 0;
	//   11   18:iconst_0        
	//   12   19:istore_2        
		j = 0;
	//   13   20:iconst_0        
	//   14   21:istore_3        
		while(i < i1) 
	//*  15   22:iload_2         
	//*  16   23:iload           6
	//*  17   25:icmpge          112
		{
			View view = getChildAt(i);
	//   18   28:aload_0         
	//   19   29:iload_2         
	//   20   30:invokevirtual   #255 <Method View getChildAt(int)>
	//   21   33:astore          7
			if(view.getVisibility() != 8)
	//*  22   35:aload           7
	//*  23   37:invokevirtual   #260 <Method int View.getVisibility()>
	//*  24   40:bipush          8
	//*  25   42:icmpne          52
	//*  26   45:iload_2         
	//*  27   46:iconst_1        
	//*  28   47:iadd            
	//*  29   48:istore_2        
	//*  30   49:goto            22
			{
				if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
	//*  31   52:aload_0         
	//*  32   53:invokestatic    #266 <Method int ViewCompat.getLayoutDirection(View)>
	//*  33   56:iconst_1        
	//*  34   57:icmpne          93
					view.layout(k - j - view.getMeasuredWidth(), 0, k - j, l);
	//   35   60:aload           7
	//   36   62:iload           4
	//   37   64:iload_3         
	//   38   65:isub            
	//   39   66:aload           7
	//   40   68:invokevirtual   #269 <Method int View.getMeasuredWidth()>
	//   41   71:isub            
	//   42   72:iconst_0        
	//   43   73:iload           4
	//   44   75:iload_3         
	//   45   76:isub            
	//   46   77:iload           5
	//   47   79:invokevirtual   #273 <Method void View.layout(int, int, int, int)>
				else
	//*  48   82:iload_3         
	//*  49   83:aload           7
	//*  50   85:invokevirtual   #269 <Method int View.getMeasuredWidth()>
	//*  51   88:iadd            
	//*  52   89:istore_3        
	//*  53   90:goto            45
					view.layout(j, 0, view.getMeasuredWidth() + j, l);
	//   54   93:aload           7
	//   55   95:iload_3         
	//   56   96:iconst_0        
	//   57   97:aload           7
	//   58   99:invokevirtual   #269 <Method int View.getMeasuredWidth()>
	//   59  102:iload_3         
	//   60  103:iadd            
	//   61  104:iload           5
	//   62  106:invokevirtual   #273 <Method void View.layout(int, int, int, int)>
				j += view.getMeasuredWidth();
			}
			i++;
		}
	//*  63  109:goto            82
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
	//*  13   27:ifeq            144
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
			i = j - j1 - i * l1;
	//   37   67:iload_2         
	//   38   68:iload           5
	//   39   70:isub            
	//   40   71:iload_1         
	//   41   72:iload           6
	//   42   74:imul            
	//   43   75:isub            
	//   44   76:istore_1        
			j = 0;
	//   45   77:iconst_0        
	//   46   78:istore_2        
			while(j < i1) 
	//*  47   79:iload_2         
	//*  48   80:iload           4
	//*  49   82:icmpge          228
			{
				int ai[] = mTempChildWidths;
	//   50   85:aload_0         
	//   51   86:getfield        #134 <Field int[] mTempChildWidths>
	//   52   89:astore          8
				int k;
				if(j == mSelectedItemPosition)
	//*  53   91:iload_2         
	//*  54   92:aload_0         
	//*  55   93:getfield        #64  <Field int mSelectedItemPosition>
	//*  56   96:icmpne          138
					k = j1;
	//   57   99:iload           5
	//   58  101:istore_3        
				else
	//*  59  102:aload           8
	//*  60  104:iload_2         
	//*  61  105:iload_3         
	//*  62  106:iastore         
	//*  63  107:iload_1         
	//*  64  108:ifle            332
	//*  65  111:aload_0         
	//*  66  112:getfield        #134 <Field int[] mTempChildWidths>
	//*  67  115:astore          8
	//*  68  117:aload           8
	//*  69  119:iload_2         
	//*  70  120:aload           8
	//*  71  122:iload_2         
	//*  72  123:iaload          
	//*  73  124:iconst_1        
	//*  74  125:iadd            
	//*  75  126:iastore         
	//*  76  127:iload_1         
	//*  77  128:iconst_1        
	//*  78  129:isub            
	//*  79  130:istore_1        
	//*  80  131:iload_2         
	//*  81  132:iconst_1        
	//*  82  133:iadd            
	//*  83  134:istore_2        
	//*  84  135:goto            79
					k = l1;
	//   85  138:iload           6
	//   86  140:istore_3        
				ai[j] = k;
				if(i > 0)
				{
					int ai1[] = mTempChildWidths;
					ai1[j] = ai1[j] + 1;
					i--;
				}
				j++;
			}
		} else
	//*  87  141:goto            102
		{
			int k1;
			if(i1 == 0)
	//*  88  144:iload           4
	//*  89  146:ifne            222
				i = 1;
	//   90  149:iconst_1        
	//   91  150:istore_1        
			else
	//*  92  151:iload_2         
	//*  93  152:iload_1         
	//*  94  153:idiv            
	//*  95  154:aload_0         
	//*  96  155:getfield        #91  <Field int mActiveItemMaxWidth>
	//*  97  158:invokestatic    #234 <Method int Math.min(int, int)>
	//*  98  161:istore          5
	//*  99  163:iload_2         
	//* 100  164:iload           5
	//* 101  166:iload           4
	//* 102  168:imul            
	//* 103  169:isub            
	//* 104  170:istore_2        
	//* 105  171:iconst_0        
	//* 106  172:istore_1        
	//* 107  173:iload_1         
	//* 108  174:iload           4
	//* 109  176:icmpge          228
	//* 110  179:aload_0         
	//* 111  180:getfield        #134 <Field int[] mTempChildWidths>
	//* 112  183:iload_1         
	//* 113  184:iload           5
	//* 114  186:iastore         
	//* 115  187:iload_2         
	//* 116  188:istore_3        
	//* 117  189:iload_2         
	//* 118  190:ifle            213
	//* 119  193:aload_0         
	//* 120  194:getfield        #134 <Field int[] mTempChildWidths>
	//* 121  197:astore          8
	//* 122  199:aload           8
	//* 123  201:iload_1         
	//* 124  202:aload           8
	//* 125  204:iload_1         
	//* 126  205:iaload          
	//* 127  206:iconst_1        
	//* 128  207:iadd            
	//* 129  208:iastore         
	//* 130  209:iload_2         
	//* 131  210:iconst_1        
	//* 132  211:isub            
	//* 133  212:istore_3        
	//* 134  213:iload_1         
	//* 135  214:iconst_1        
	//* 136  215:iadd            
	//* 137  216:istore_1        
	//* 138  217:iload_3         
	//* 139  218:istore_2        
	//* 140  219:goto            173
				i = i1;
	//  141  222:iload           4
	//  142  224:istore_1        
			k1 = Math.min(j / i, mActiveItemMaxWidth);
			j -= k1 * i1;
			for(i = 0; i < i1;)
			{
				mTempChildWidths[i] = k1;
				int l = j;
				if(j > 0)
				{
					int ai2[] = mTempChildWidths;
					ai2[i] = ai2[i] + 1;
					l = j - 1;
				}
				i++;
				j = l;
			}

		}
	//* 143  225:goto            151
		i = 0;
	//  144  228:iconst_0        
	//  145  229:istore_1        
		j = 0;
	//  146  230:iconst_0        
	//  147  231:istore_2        
		while(i < i1) 
	//* 148  232:iload_1         
	//* 149  233:iload           4
	//* 150  235:icmpge          305
		{
			View view = getChildAt(i);
	//  151  238:aload_0         
	//  152  239:iload_1         
	//  153  240:invokevirtual   #255 <Method View getChildAt(int)>
	//  154  243:astore          8
			if(view.getVisibility() != 8)
	//* 155  245:aload           8
	//* 156  247:invokevirtual   #260 <Method int View.getVisibility()>
	//* 157  250:bipush          8
	//* 158  252:icmpne          262
	//* 159  255:iload_1         
	//* 160  256:iconst_1        
	//* 161  257:iadd            
	//* 162  258:istore_1        
	//* 163  259:goto            232
			{
				view.measure(android.view.View.MeasureSpec.makeMeasureSpec(mTempChildWidths[i], 0x40000000), i2);
	//  164  262:aload           8
	//  165  264:aload_0         
	//  166  265:getfield        #134 <Field int[] mTempChildWidths>
	//  167  268:iload_1         
	//  168  269:iaload          
	//  169  270:ldc2            #281 <Int 0x40000000>
	//  170  273:invokestatic    #284 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  171  276:iload           7
	//  172  278:invokevirtual   #287 <Method void View.measure(int, int)>
				view.getLayoutParams().width = view.getMeasuredWidth();
	//  173  281:aload           8
	//  174  283:invokevirtual   #291 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  175  286:aload           8
	//  176  288:invokevirtual   #269 <Method int View.getMeasuredWidth()>
	//  177  291:putfield        #296 <Field int android.view.ViewGroup$LayoutParams.width>
				j += view.getMeasuredWidth();
	//  178  294:iload_2         
	//  179  295:aload           8
	//  180  297:invokevirtual   #269 <Method int View.getMeasuredWidth()>
	//  181  300:iadd            
	//  182  301:istore_2        
			}
			i++;
		}
	//* 183  302:goto            255
		setMeasuredDimension(View.resolveSizeAndState(j, android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000), 0), View.resolveSizeAndState(mItemHeight, i2, 0));
	//  184  305:aload_0         
	//  185  306:iload_2         
	//  186  307:iload_2         
	//  187  308:ldc2            #281 <Int 0x40000000>
	//  188  311:invokestatic    #284 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  189  314:iconst_0        
	//  190  315:invokestatic    #300 <Method int View.resolveSizeAndState(int, int, int)>
	//  191  318:aload_0         
	//  192  319:getfield        #96  <Field int mItemHeight>
	//  193  322:iload           7
	//  194  324:iconst_0        
	//  195  325:invokestatic    #300 <Method int View.resolveSizeAndState(int, int, int)>
	//  196  328:invokevirtual   #303 <Method void setMeasuredDimension(int, int)>
	//  197  331:return          
	//* 198  332:goto            131
	}

	public void setIconTintList(ColorStateList colorstatelist)
	{
		mItemIconTint = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #194 <Field ColorStateList mItemIconTint>
		if(mButtons != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//*   5    9:ifnonnull       13
	//*   6   12:return          
		{
			BottomNavigationItemView abottomnavigationitemview[] = mButtons;
	//    7   13:aload_0         
	//    8   14:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//    9   17:astore          4
			int j = abottomnavigationitemview.length;
	//   10   19:aload           4
	//   11   21:arraylength     
	//   12   22:istore_3        
			int i = 0;
	//   13   23:iconst_0        
	//   14   24:istore_2        
			while(i < j) 
	//*  15   25:iload_2         
	//*  16   26:iload_3         
	//*  17   27:icmpge          12
			{
				abottomnavigationitemview[i].setIconTintList(colorstatelist);
	//   18   30:aload           4
	//   19   32:iload_2         
	//   20   33:aaload          
	//   21   34:aload_1         
	//   22   35:invokevirtual   #198 <Method void BottomNavigationItemView.setIconTintList(ColorStateList)>
				i++;
	//   23   38:iload_2         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_2        
			}
		}
	//*  27   42:goto            25
	}

	public void setItemBackgroundRes(int i)
	{
		mItemBackgroundRes = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #205 <Field int mItemBackgroundRes>
		if(mButtons != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//*   5    9:ifnonnull       13
	//*   6   12:return          
		{
			BottomNavigationItemView abottomnavigationitemview[] = mButtons;
	//    7   13:aload_0         
	//    8   14:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//    9   17:astore          4
			int k = abottomnavigationitemview.length;
	//   10   19:aload           4
	//   11   21:arraylength     
	//   12   22:istore_3        
			int j = 0;
	//   13   23:iconst_0        
	//   14   24:istore_2        
			while(j < k) 
	//*  15   25:iload_2         
	//*  16   26:iload_3         
	//*  17   27:icmpge          12
			{
				abottomnavigationitemview[j].setItemBackground(i);
	//   18   30:aload           4
	//   19   32:iload_2         
	//   20   33:aaload          
	//   21   34:iload_1         
	//   22   35:invokevirtual   #208 <Method void BottomNavigationItemView.setItemBackground(int)>
				j++;
	//   23   38:iload_2         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_2        
			}
		}
	//*  27   42:goto            25
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		mItemTextColor = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #200 <Field ColorStateList mItemTextColor>
		if(mButtons != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//*   5    9:ifnonnull       13
	//*   6   12:return          
		{
			BottomNavigationItemView abottomnavigationitemview[] = mButtons;
	//    7   13:aload_0         
	//    8   14:getfield        #164 <Field BottomNavigationItemView[] mButtons>
	//    9   17:astore          4
			int j = abottomnavigationitemview.length;
	//   10   19:aload           4
	//   11   21:arraylength     
	//   12   22:istore_3        
			int i = 0;
	//   13   23:iconst_0        
	//   14   24:istore_2        
			while(i < j) 
	//*  15   25:iload_2         
	//*  16   26:iload_3         
	//*  17   27:icmpge          12
			{
				abottomnavigationitemview[i].setTextColor(colorstatelist);
	//   18   30:aload           4
	//   19   32:iload_2         
	//   20   33:aaload          
	//   21   34:aload_1         
	//   22   35:invokevirtual   #203 <Method void BottomNavigationItemView.setTextColor(ColorStateList)>
				i++;
	//   23   38:iload_2         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_2        
			}
		}
	//*  27   42:goto            25
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
		int j = 0;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		do
		{
label0:
			{
				if(j < k)
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          55
				{
					MenuItem menuitem = mMenu.getItem(j);
	//    9   15:aload_0         
	//   10   16:getfield        #142 <Field MenuBuilder mMenu>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #184 <Method MenuItem MenuBuilder.getItem(int)>
	//   13   23:astore          4
					if(i != menuitem.getItemId())
						break label0;
	//   14   25:iload_1         
	//   15   26:aload           4
	//   16   28:invokeinterface #311 <Method int MenuItem.getItemId()>
	//   17   33:icmpne          56
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
				}
				return;
	//   28   55:return          
			}
			j++;
	//   29   56:iload_2         
	//   30   57:iconst_1        
	//   31   58:iadd            
	//   32   59:istore_2        
		} while(true);
	//   33   60:goto            10
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
		} else
	//*  11   21:return          
		{
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
			int j = 0;
	//   48   93:iconst_0        
	//   49   94:istore_1        
			while(j < k) 
	//*  50   95:iload_1         
	//*  51   96:iload_2         
	//*  52   97:icmpge          21
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
				j++;
	//   72  137:iload_1         
	//   73  138:iconst_1        
	//   74  139:iadd            
	//   75  140:istore_1        
			}
		}
	//*  76  141:goto            95
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
