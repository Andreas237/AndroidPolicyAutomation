// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.transition.*;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.menu.*;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.*;
import java.util.ArrayList;

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
	//    3    3:invokespecial   #70  <Method void BottomNavigationMenuView(Context, AttributeSet)>
	//    4    6:return          
	}

	public BottomNavigationMenuView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #71  <Method void ViewGroup(Context, AttributeSet)>
		itemPool = ((android.support.v4.util.Pools.Pool) (new android.support.v4.util.Pools.SynchronizedPool(5)));
	//    4    6:aload_0         
	//    5    7:new             #73  <Class android.support.v4.util.Pools$SynchronizedPool>
	//    6   10:dup             
	//    7   11:iconst_5        
	//    8   12:invokespecial   #76  <Method void android.support.v4.util.Pools$SynchronizedPool(int)>
	//    9   15:putfield        #78  <Field android.support.v4.util.Pools$Pool itemPool>
		selectedItemId = 0;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #80  <Field int selectedItemId>
		selectedItemPosition = 0;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #82  <Field int selectedItemPosition>
		context = ((Context) (getResources()));
	//   16   28:aload_0         
	//   17   29:invokevirtual   #86  <Method Resources getResources()>
	//   18   32:astore_1        
		inactiveItemMaxWidth = ((Resources) (context)).getDimensionPixelSize(android.support.design.R.dimen.design_bottom_navigation_item_max_width);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:getstatic       #91  <Field int android.support.design.R$dimen.design_bottom_navigation_item_max_width>
	//   22   38:invokevirtual   #97  <Method int Resources.getDimensionPixelSize(int)>
	//   23   41:putfield        #99  <Field int inactiveItemMaxWidth>
		inactiveItemMinWidth = ((Resources) (context)).getDimensionPixelSize(android.support.design.R.dimen.design_bottom_navigation_item_min_width);
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:getstatic       #102 <Field int android.support.design.R$dimen.design_bottom_navigation_item_min_width>
	//   27   49:invokevirtual   #97  <Method int Resources.getDimensionPixelSize(int)>
	//   28   52:putfield        #104 <Field int inactiveItemMinWidth>
		activeItemMaxWidth = ((Resources) (context)).getDimensionPixelSize(android.support.design.R.dimen.design_bottom_navigation_active_item_max_width);
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:getstatic       #107 <Field int android.support.design.R$dimen.design_bottom_navigation_active_item_max_width>
	//   32   60:invokevirtual   #97  <Method int Resources.getDimensionPixelSize(int)>
	//   33   63:putfield        #109 <Field int activeItemMaxWidth>
		activeItemMinWidth = ((Resources) (context)).getDimensionPixelSize(android.support.design.R.dimen.design_bottom_navigation_active_item_min_width);
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:getstatic       #112 <Field int android.support.design.R$dimen.design_bottom_navigation_active_item_min_width>
	//   37   71:invokevirtual   #97  <Method int Resources.getDimensionPixelSize(int)>
	//   38   74:putfield        #114 <Field int activeItemMinWidth>
		itemHeight = ((Resources) (context)).getDimensionPixelSize(android.support.design.R.dimen.design_bottom_navigation_height);
	//   39   77:aload_0         
	//   40   78:aload_1         
	//   41   79:getstatic       #117 <Field int android.support.design.R$dimen.design_bottom_navigation_height>
	//   42   82:invokevirtual   #97  <Method int Resources.getDimensionPixelSize(int)>
	//   43   85:putfield        #119 <Field int itemHeight>
		itemTextColorDefault = createDefaultColorStateList(0x1010038);
	//   44   88:aload_0         
	//   45   89:aload_0         
	//   46   90:ldc1            #120 <Int 0x1010038>
	//   47   92:invokevirtual   #124 <Method ColorStateList createDefaultColorStateList(int)>
	//   48   95:putfield        #126 <Field ColorStateList itemTextColorDefault>
		set = ((TransitionSet) (new AutoTransition()));
	//   49   98:aload_0         
	//   50   99:new             #128 <Class AutoTransition>
	//   51  102:dup             
	//   52  103:invokespecial   #130 <Method void AutoTransition()>
	//   53  106:putfield        #132 <Field TransitionSet set>
		set.setOrdering(0);
	//   54  109:aload_0         
	//   55  110:getfield        #132 <Field TransitionSet set>
	//   56  113:iconst_0        
	//   57  114:invokevirtual   #138 <Method TransitionSet TransitionSet.setOrdering(int)>
	//   58  117:pop             
		set.setDuration(115L);
	//   59  118:aload_0         
	//   60  119:getfield        #132 <Field TransitionSet set>
	//   61  122:ldc2w           #15  <Long 115L>
	//   62  125:invokevirtual   #142 <Method TransitionSet TransitionSet.setDuration(long)>
	//   63  128:pop             
		set.setInterpolator(((android.animation.TimeInterpolator) (new FastOutSlowInInterpolator())));
	//   64  129:aload_0         
	//   65  130:getfield        #132 <Field TransitionSet set>
	//   66  133:new             #144 <Class FastOutSlowInInterpolator>
	//   67  136:dup             
	//   68  137:invokespecial   #145 <Method void FastOutSlowInInterpolator()>
	//   69  140:invokevirtual   #149 <Method TransitionSet TransitionSet.setInterpolator(android.animation.TimeInterpolator)>
	//   70  143:pop             
		set.addTransition(((android.support.transition.Transition) (new TextScale())));
	//   71  144:aload_0         
	//   72  145:getfield        #132 <Field TransitionSet set>
	//   73  148:new             #151 <Class TextScale>
	//   74  151:dup             
	//   75  152:invokespecial   #152 <Method void TextScale()>
	//   76  155:invokevirtual   #156 <Method TransitionSet TransitionSet.addTransition(android.support.transition.Transition)>
	//   77  158:pop             
		onClickListener = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				view = ((View) (((BottomNavigationItemView)view).getItemData()));
			//    0    0:aload_1         
			//    1    1:checkcast       #24  <Class BottomNavigationItemView>
			//    2    4:invokevirtual   #28  <Method MenuItemImpl BottomNavigationItemView.getItemData()>
			//    3    7:astore_1        
				if(!menu.performItemAction(((MenuItem) (view)), ((android.support.v7.view.menu.MenuPresenter) (presenter)), 0))
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
	//   78  159:aload_0         
	//   79  160:new             #8   <Class BottomNavigationMenuView$1>
	//   80  163:dup             
	//   81  164:aload_0         
	//   82  165:invokespecial   #159 <Method void BottomNavigationMenuView$1(BottomNavigationMenuView)>
	//   83  168:putfield        #161 <Field android.view.View$OnClickListener onClickListener>
		tempChildWidths = new int[5];
	//   84  171:aload_0         
	//   85  172:iconst_5        
	//   86  173:newarray        int[]
	//   87  175:putfield        #163 <Field int[] tempChildWidths>
	//   88  178:return          
	}

	private BottomNavigationItemView getNewItem()
	{
		BottomNavigationItemView bottomnavigationitemview1 = (BottomNavigationItemView)itemPool.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field android.support.v4.util.Pools$Pool itemPool>
	//    2    4:invokeinterface #179 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    3    9:checkcast       #181 <Class BottomNavigationItemView>
	//    4   12:astore_2        
		BottomNavigationItemView bottomnavigationitemview = bottomnavigationitemview1;
	//    5   13:aload_2         
	//    6   14:astore_1        
		if(bottomnavigationitemview1 == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       31
			bottomnavigationitemview = new BottomNavigationItemView(getContext());
	//    9   19:new             #181 <Class BottomNavigationItemView>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokevirtual   #185 <Method Context getContext()>
	//   13   27:invokespecial   #187 <Method void BottomNavigationItemView(Context)>
	//   14   30:astore_1        
		return bottomnavigationitemview;
	//   15   31:aload_1         
	//   16   32:areturn         
	}

	private boolean isShifting(int i, int j)
	{
		if(i == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          12
		{
			if(j > 3)
	//*   3    5:iload_2         
	//*   4    6:iconst_3        
	//*   5    7:icmple          18
				return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		} else
		if(i == 0)
	//*   8   12:iload_1         
	//*   9   13:ifne            18
			return true;
	//   10   16:iconst_1        
	//   11   17:ireturn         
		return false;
	//   12   18:iconst_0        
	//   13   19:ireturn         
	}

	public void buildMenuView()
	{
		removeAllViews();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #193 <Method void removeAllViews()>
		BottomNavigationItemView abottomnavigationitemview[] = buttons;
	//    2    4:aload_0         
	//    3    5:getfield        #195 <Field BottomNavigationItemView[] buttons>
	//    4    8:astore          4
		if(abottomnavigationitemview != null)
	//*   5   10:aload           4
	//*   6   12:ifnull          56
		{
			int k = abottomnavigationitemview.length;
	//    7   15:aload           4
	//    8   17:arraylength     
	//    9   18:istore_2        
			for(int i = 0; i < k; i++)
	//*  10   19:iconst_0        
	//*  11   20:istore_1        
	//*  12   21:iload_1         
	//*  13   22:iload_2         
	//*  14   23:icmpge          56
			{
				BottomNavigationItemView bottomnavigationitemview1 = abottomnavigationitemview[i];
	//   15   26:aload           4
	//   16   28:iload_1         
	//   17   29:aaload          
	//   18   30:astore          5
				if(bottomnavigationitemview1 != null)
	//*  19   32:aload           5
	//*  20   34:ifnull          49
					itemPool.release(((Object) (bottomnavigationitemview1)));
	//   21   37:aload_0         
	//   22   38:getfield        #78  <Field android.support.v4.util.Pools$Pool itemPool>
	//   23   41:aload           5
	//   24   43:invokeinterface #199 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   25   48:pop             
			}

	//   26   49:iload_1         
	//   27   50:iconst_1        
	//   28   51:iadd            
	//   29   52:istore_1        
		}
	//*  30   53:goto            21
		if(menu.size() == 0)
	//*  31   56:aload_0         
	//*  32   57:getfield        #171 <Field MenuBuilder menu>
	//*  33   60:invokevirtual   #205 <Method int MenuBuilder.size()>
	//*  34   63:ifne            82
		{
			selectedItemId = 0;
	//   35   66:aload_0         
	//   36   67:iconst_0        
	//   37   68:putfield        #80  <Field int selectedItemId>
			selectedItemPosition = 0;
	//   38   71:aload_0         
	//   39   72:iconst_0        
	//   40   73:putfield        #82  <Field int selectedItemPosition>
			buttons = null;
	//   41   76:aload_0         
	//   42   77:aconst_null     
	//   43   78:putfield        #195 <Field BottomNavigationItemView[] buttons>
			return;
	//   44   81:return          
		}
		buttons = new BottomNavigationItemView[menu.size()];
	//   45   82:aload_0         
	//   46   83:aload_0         
	//   47   84:getfield        #171 <Field MenuBuilder menu>
	//   48   87:invokevirtual   #205 <Method int MenuBuilder.size()>
	//   49   90:anewarray       BottomNavigationItemView[]
	//   50   93:putfield        #195 <Field BottomNavigationItemView[] buttons>
		boolean flag = isShifting(labelVisibilityMode, menu.getVisibleItems().size());
	//   51   96:aload_0         
	//   52   97:aload_0         
	//   53   98:getfield        #207 <Field int labelVisibilityMode>
	//   54  101:aload_0         
	//   55  102:getfield        #171 <Field MenuBuilder menu>
	//   56  105:invokevirtual   #211 <Method ArrayList MenuBuilder.getVisibleItems()>
	//   57  108:invokevirtual   #214 <Method int ArrayList.size()>
	//   58  111:invokespecial   #216 <Method boolean isShifting(int, int)>
	//   59  114:istore_3        
		for(int j = 0; j < menu.size(); j++)
	//*  60  115:iconst_0        
	//*  61  116:istore_1        
	//*  62  117:iload_1         
	//*  63  118:aload_0         
	//*  64  119:getfield        #171 <Field MenuBuilder menu>
	//*  65  122:invokevirtual   #205 <Method int MenuBuilder.size()>
	//*  66  125:icmpge          317
		{
			presenter.setUpdateSuspended(true);
	//   67  128:aload_0         
	//   68  129:getfield        #167 <Field BottomNavigationPresenter presenter>
	//   69  132:iconst_1        
	//   70  133:invokevirtual   #222 <Method void BottomNavigationPresenter.setUpdateSuspended(boolean)>
			menu.getItem(j).setCheckable(true);
	//   71  136:aload_0         
	//   72  137:getfield        #171 <Field MenuBuilder menu>
	//   73  140:iload_1         
	//   74  141:invokevirtual   #226 <Method MenuItem MenuBuilder.getItem(int)>
	//   75  144:iconst_1        
	//   76  145:invokeinterface #232 <Method MenuItem MenuItem.setCheckable(boolean)>
	//   77  150:pop             
			presenter.setUpdateSuspended(false);
	//   78  151:aload_0         
	//   79  152:getfield        #167 <Field BottomNavigationPresenter presenter>
	//   80  155:iconst_0        
	//   81  156:invokevirtual   #222 <Method void BottomNavigationPresenter.setUpdateSuspended(boolean)>
			BottomNavigationItemView bottomnavigationitemview = getNewItem();
	//   82  159:aload_0         
	//   83  160:invokespecial   #234 <Method BottomNavigationItemView getNewItem()>
	//   84  163:astore          4
			buttons[j] = bottomnavigationitemview;
	//   85  165:aload_0         
	//   86  166:getfield        #195 <Field BottomNavigationItemView[] buttons>
	//   87  169:iload_1         
	//   88  170:aload           4
	//   89  172:aastore         
			bottomnavigationitemview.setIconTintList(itemIconTint);
	//   90  173:aload           4
	//   91  175:aload_0         
	//   92  176:getfield        #236 <Field ColorStateList itemIconTint>
	//   93  179:invokevirtual   #240 <Method void BottomNavigationItemView.setIconTintList(ColorStateList)>
			bottomnavigationitemview.setIconSize(itemIconSize);
	//   94  182:aload           4
	//   95  184:aload_0         
	//   96  185:getfield        #242 <Field int itemIconSize>
	//   97  188:invokevirtual   #245 <Method void BottomNavigationItemView.setIconSize(int)>
			bottomnavigationitemview.setTextColor(itemTextColorDefault);
	//   98  191:aload           4
	//   99  193:aload_0         
	//  100  194:getfield        #126 <Field ColorStateList itemTextColorDefault>
	//  101  197:invokevirtual   #248 <Method void BottomNavigationItemView.setTextColor(ColorStateList)>
			bottomnavigationitemview.setTextAppearanceInactive(itemTextAppearanceInactive);
	//  102  200:aload           4
	//  103  202:aload_0         
	//  104  203:getfield        #250 <Field int itemTextAppearanceInactive>
	//  105  206:invokevirtual   #253 <Method void BottomNavigationItemView.setTextAppearanceInactive(int)>
			bottomnavigationitemview.setTextAppearanceActive(itemTextAppearanceActive);
	//  106  209:aload           4
	//  107  211:aload_0         
	//  108  212:getfield        #255 <Field int itemTextAppearanceActive>
	//  109  215:invokevirtual   #258 <Method void BottomNavigationItemView.setTextAppearanceActive(int)>
			bottomnavigationitemview.setTextColor(itemTextColorFromUser);
	//  110  218:aload           4
	//  111  220:aload_0         
	//  112  221:getfield        #260 <Field ColorStateList itemTextColorFromUser>
	//  113  224:invokevirtual   #248 <Method void BottomNavigationItemView.setTextColor(ColorStateList)>
			Drawable drawable = itemBackground;
	//  114  227:aload_0         
	//  115  228:getfield        #262 <Field Drawable itemBackground>
	//  116  231:astore          5
			if(drawable != null)
	//* 117  233:aload           5
	//* 118  235:ifnull          248
				bottomnavigationitemview.setItemBackground(drawable);
	//  119  238:aload           4
	//  120  240:aload           5
	//  121  242:invokevirtual   #266 <Method void BottomNavigationItemView.setItemBackground(Drawable)>
			else
	//* 122  245:goto            257
				bottomnavigationitemview.setItemBackground(itemBackgroundRes);
	//  123  248:aload           4
	//  124  250:aload_0         
	//  125  251:getfield        #268 <Field int itemBackgroundRes>
	//  126  254:invokevirtual   #270 <Method void BottomNavigationItemView.setItemBackground(int)>
			bottomnavigationitemview.setShifting(flag);
	//  127  257:aload           4
	//  128  259:iload_3         
	//  129  260:invokevirtual   #273 <Method void BottomNavigationItemView.setShifting(boolean)>
			bottomnavigationitemview.setLabelVisibilityMode(labelVisibilityMode);
	//  130  263:aload           4
	//  131  265:aload_0         
	//  132  266:getfield        #207 <Field int labelVisibilityMode>
	//  133  269:invokevirtual   #276 <Method void BottomNavigationItemView.setLabelVisibilityMode(int)>
			bottomnavigationitemview.initialize((MenuItemImpl)menu.getItem(j), 0);
	//  134  272:aload           4
	//  135  274:aload_0         
	//  136  275:getfield        #171 <Field MenuBuilder menu>
	//  137  278:iload_1         
	//  138  279:invokevirtual   #226 <Method MenuItem MenuBuilder.getItem(int)>
	//  139  282:checkcast       #278 <Class MenuItemImpl>
	//  140  285:iconst_0        
	//  141  286:invokevirtual   #282 <Method void BottomNavigationItemView.initialize(MenuItemImpl, int)>
			bottomnavigationitemview.setItemPosition(j);
	//  142  289:aload           4
	//  143  291:iload_1         
	//  144  292:invokevirtual   #285 <Method void BottomNavigationItemView.setItemPosition(int)>
			bottomnavigationitemview.setOnClickListener(onClickListener);
	//  145  295:aload           4
	//  146  297:aload_0         
	//  147  298:getfield        #161 <Field android.view.View$OnClickListener onClickListener>
	//  148  301:invokevirtual   #289 <Method void BottomNavigationItemView.setOnClickListener(android.view.View$OnClickListener)>
			addView(((View) (bottomnavigationitemview)));
	//  149  304:aload_0         
	//  150  305:aload           4
	//  151  307:invokevirtual   #293 <Method void addView(View)>
		}

	//  152  310:iload_1         
	//  153  311:iconst_1        
	//  154  312:iadd            
	//  155  313:istore_1        
	//* 156  314:goto            117
		selectedItemPosition = Math.min(menu.size() - 1, selectedItemPosition);
	//  157  317:aload_0         
	//  158  318:aload_0         
	//  159  319:getfield        #171 <Field MenuBuilder menu>
	//  160  322:invokevirtual   #205 <Method int MenuBuilder.size()>
	//  161  325:iconst_1        
	//  162  326:isub            
	//  163  327:aload_0         
	//  164  328:getfield        #82  <Field int selectedItemPosition>
	//  165  331:invokestatic    #299 <Method int Math.min(int, int)>
	//  166  334:putfield        #82  <Field int selectedItemPosition>
		menu.getItem(selectedItemPosition).setChecked(true);
	//  167  337:aload_0         
	//  168  338:getfield        #171 <Field MenuBuilder menu>
	//  169  341:aload_0         
	//  170  342:getfield        #82  <Field int selectedItemPosition>
	//  171  345:invokevirtual   #226 <Method MenuItem MenuBuilder.getItem(int)>
	//  172  348:iconst_1        
	//  173  349:invokeinterface #302 <Method MenuItem MenuItem.setChecked(boolean)>
	//  174  354:pop             
	//  175  355:return          
	}

	public ColorStateList createDefaultColorStateList(int i)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #304 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #305 <Method void TypedValue()>
	//    3    7:astore          5
		if(!getContext().getTheme().resolveAttribute(i, typedvalue, true))
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #185 <Method Context getContext()>
	//*   6   13:invokevirtual   #311 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*   7   16:iload_1         
	//*   8   17:aload           5
	//*   9   19:iconst_1        
	//*  10   20:invokevirtual   #317 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  11   23:ifne            28
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
		ColorStateList colorstatelist = AppCompatResources.getColorStateList(getContext(), typedvalue.resourceId);
	//   14   28:aload_0         
	//   15   29:invokevirtual   #185 <Method Context getContext()>
	//   16   32:aload           5
	//   17   34:getfield        #320 <Field int TypedValue.resourceId>
	//   18   37:invokestatic    #326 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   19   40:astore          4
		if(!getContext().getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.colorPrimary, typedvalue, true))
	//*  20   42:aload_0         
	//*  21   43:invokevirtual   #185 <Method Context getContext()>
	//*  22   46:invokevirtual   #311 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  23   49:getstatic       #331 <Field int android.support.v7.appcompat.R$attr.colorPrimary>
	//*  24   52:aload           5
	//*  25   54:iconst_1        
	//*  26   55:invokevirtual   #317 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  27   58:ifne            63
		{
			return null;
	//   28   61:aconst_null     
	//   29   62:areturn         
		} else
		{
			i = typedvalue.data;
	//   30   63:aload           5
	//   31   65:getfield        #334 <Field int TypedValue.data>
	//   32   68:istore_1        
			int j = colorstatelist.getDefaultColor();
	//   33   69:aload           4
	//   34   71:invokevirtual   #339 <Method int ColorStateList.getDefaultColor()>
	//   35   74:istore_2        
			int ai[] = DISABLED_STATE_SET;
	//   36   75:getstatic       #64  <Field int[] DISABLED_STATE_SET>
	//   37   78:astore          5
			int ai1[] = CHECKED_STATE_SET;
	//   38   80:getstatic       #61  <Field int[] CHECKED_STATE_SET>
	//   39   83:astore          6
			int ai2[] = EMPTY_STATE_SET;
	//   40   85:getstatic       #342 <Field int[] EMPTY_STATE_SET>
	//   41   88:astore          7
			int k = colorstatelist.getColorForState(DISABLED_STATE_SET, j);
	//   42   90:aload           4
	//   43   92:getstatic       #64  <Field int[] DISABLED_STATE_SET>
	//   44   95:iload_2         
	//   45   96:invokevirtual   #346 <Method int ColorStateList.getColorForState(int[], int)>
	//   46   99:istore_3        
			return new ColorStateList(new int[][] {
				ai, ai1, ai2
			}, new int[] {
				k, i, j
			});
	//   47  100:new             #336 <Class ColorStateList>
	//   48  103:dup             
	//   49  104:iconst_3        
	//   50  105:anewarray       int[][]
	//   51  108:dup             
	//   52  109:iconst_0        
	//   53  110:aload           5
	//   54  112:aastore         
	//   55  113:dup             
	//   56  114:iconst_1        
	//   57  115:aload           6
	//   58  117:aastore         
	//   59  118:dup             
	//   60  119:iconst_2        
	//   61  120:aload           7
	//   62  122:aastore         
	//   63  123:iconst_3        
	//   64  124:newarray        int[]
	//   65  126:dup             
	//   66  127:iconst_0        
	//   67  128:iload_3         
	//   68  129:iastore         
	//   69  130:dup             
	//   70  131:iconst_1        
	//   71  132:iload_1         
	//   72  133:iastore         
	//   73  134:dup             
	//   74  135:iconst_2        
	//   75  136:iload_2         
	//   76  137:iastore         
	//   77  138:invokespecial   #350 <Method void ColorStateList(int[][], int[])>
	//   78  141:areturn         
		}
	}

	public ColorStateList getIconTintList()
	{
		return itemIconTint;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field ColorStateList itemIconTint>
	//    2    4:areturn         
	}

	public Drawable getItemBackground()
	{
		BottomNavigationItemView abottomnavigationitemview[] = buttons;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field BottomNavigationItemView[] buttons>
	//    2    4:astore_1        
		if(abottomnavigationitemview != null && abottomnavigationitemview.length > 0)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:ifle            21
			return abottomnavigationitemview[0].getBackground();
	//    8   14:aload_1         
	//    9   15:iconst_0        
	//   10   16:aaload          
	//   11   17:invokevirtual   #359 <Method Drawable BottomNavigationItemView.getBackground()>
	//   12   20:areturn         
		else
			return itemBackground;
	//   13   21:aload_0         
	//   14   22:getfield        #262 <Field Drawable itemBackground>
	//   15   25:areturn         
	}

	public int getItemBackgroundRes()
	{
		return itemBackgroundRes;
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field int itemBackgroundRes>
	//    2    4:ireturn         
	}

	public int getItemIconSize()
	{
		return itemIconSize;
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field int itemIconSize>
	//    2    4:ireturn         
	}

	public int getItemTextAppearanceActive()
	{
		return itemTextAppearanceActive;
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field int itemTextAppearanceActive>
	//    2    4:ireturn         
	}

	public int getItemTextAppearanceInactive()
	{
		return itemTextAppearanceInactive;
	//    0    0:aload_0         
	//    1    1:getfield        #250 <Field int itemTextAppearanceInactive>
	//    2    4:ireturn         
	}

	public ColorStateList getItemTextColor()
	{
		return itemTextColorFromUser;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field ColorStateList itemTextColorFromUser>
	//    2    4:areturn         
	}

	public int getLabelVisibilityMode()
	{
		return labelVisibilityMode;
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field int labelVisibilityMode>
	//    2    4:ireturn         
	}

	public int getSelectedItemId()
	{
		return selectedItemId;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int selectedItemId>
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
		menu = menubuilder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #171 <Field MenuBuilder menu>
	//    3    5:return          
	}

	public boolean isItemHorizontalTranslationEnabled()
	{
		return itemHorizontalTranslationEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #374 <Field boolean itemHorizontalTranslationEnabled>
	//    2    4:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		int i1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #379 <Method int getChildCount()>
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
	//   16   25:invokevirtual   #383 <Method View getChildAt(int)>
	//   17   28:astore          9
			if(view.getVisibility() == 8)
	//*  18   30:aload           9
	//*  19   32:invokevirtual   #388 <Method int View.getVisibility()>
	//*  20   35:bipush          8
	//*  21   37:icmpne          43
				continue;
	//   22   40:goto            109
			if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
	//*  23   43:aload_0         
	//*  24   44:invokestatic    #394 <Method int ViewCompat.getLayoutDirection(View)>
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
	//   36   66:invokevirtual   #397 <Method int View.getMeasuredWidth()>
	//   37   69:isub            
	//   38   70:iconst_0        
	//   39   71:iload           8
	//   40   73:iload           7
	//   41   75:invokevirtual   #401 <Method void View.layout(int, int, int, int)>
			} else
	//*  42   78:goto            99
			{
				view.layout(l, 0, view.getMeasuredWidth() + l, j1);
	//   43   81:aload           9
	//   44   83:iload           5
	//   45   85:iconst_0        
	//   46   86:aload           9
	//   47   88:invokevirtual   #397 <Method int View.getMeasuredWidth()>
	//   48   91:iload           5
	//   49   93:iadd            
	//   50   94:iload           7
	//   51   96:invokevirtual   #401 <Method void View.layout(int, int, int, int)>
			}
			l += view.getMeasuredWidth();
	//   52   99:iload           5
	//   53  101:aload           9
	//   54  103:invokevirtual   #397 <Method int View.getMeasuredWidth()>
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
		int k1 = android.view.View.MeasureSpec.getSize(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #408 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore          5
		int k = menu.getVisibleItems().size();
	//    3    6:aload_0         
	//    4    7:getfield        #171 <Field MenuBuilder menu>
	//    5   10:invokevirtual   #211 <Method ArrayList MenuBuilder.getVisibleItems()>
	//    6   13:invokevirtual   #214 <Method int ArrayList.size()>
	//    7   16:istore_3        
		int l1 = getChildCount();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #379 <Method int getChildCount()>
	//   10   21:istore          6
		int i2 = android.view.View.MeasureSpec.makeMeasureSpec(itemHeight, 0x40000000);
	//   11   23:aload_0         
	//   12   24:getfield        #119 <Field int itemHeight>
	//   13   27:ldc2            #409 <Int 0x40000000>
	//   14   30:invokestatic    #412 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   15   33:istore          7
		if(isShifting(labelVisibilityMode, k) && itemHorizontalTranslationEnabled)
	//*  16   35:aload_0         
	//*  17   36:aload_0         
	//*  18   37:getfield        #207 <Field int labelVisibilityMode>
	//*  19   40:iload_3         
	//*  20   41:invokespecial   #216 <Method boolean isShifting(int, int)>
	//*  21   44:ifeq            283
	//*  22   47:aload_0         
	//*  23   48:getfield        #374 <Field boolean itemHorizontalTranslationEnabled>
	//*  24   51:ifeq            283
		{
			View view = getChildAt(selectedItemPosition);
	//   25   54:aload_0         
	//   26   55:aload_0         
	//   27   56:getfield        #82  <Field int selectedItemPosition>
	//   28   59:invokevirtual   #383 <Method View getChildAt(int)>
	//   29   62:astore          8
			j = activeItemMinWidth;
	//   30   64:aload_0         
	//   31   65:getfield        #114 <Field int activeItemMinWidth>
	//   32   68:istore_2        
			i = j;
	//   33   69:iload_2         
	//   34   70:istore_1        
			if(view.getVisibility() != 8)
	//*  35   71:aload           8
	//*  36   73:invokevirtual   #388 <Method int View.getVisibility()>
	//*  37   76:bipush          8
	//*  38   78:icmpeq          108
			{
				view.measure(android.view.View.MeasureSpec.makeMeasureSpec(activeItemMaxWidth, 0x80000000), i2);
	//   39   81:aload           8
	//   40   83:aload_0         
	//   41   84:getfield        #109 <Field int activeItemMaxWidth>
	//   42   87:ldc2            #413 <Int 0x80000000>
	//   43   90:invokestatic    #412 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   44   93:iload           7
	//   45   95:invokevirtual   #416 <Method void View.measure(int, int)>
				i = Math.max(j, view.getMeasuredWidth());
	//   46   98:iload_2         
	//   47   99:aload           8
	//   48  101:invokevirtual   #397 <Method int View.getMeasuredWidth()>
	//   49  104:invokestatic    #419 <Method int Math.max(int, int)>
	//   50  107:istore_1        
			}
			if(view.getVisibility() != 8)
	//*  51  108:aload           8
	//*  52  110:invokevirtual   #388 <Method int View.getVisibility()>
	//*  53  113:bipush          8
	//*  54  115:icmpeq          123
				j = 1;
	//   55  118:iconst_1        
	//   56  119:istore_2        
			else
	//*  57  120:goto            125
				j = 0;
	//   58  123:iconst_0        
	//   59  124:istore_2        
			j = k - j;
	//   60  125:iload_3         
	//   61  126:iload_2         
	//   62  127:isub            
	//   63  128:istore_2        
			int i1 = Math.min(k1 - inactiveItemMinWidth * j, Math.min(i, activeItemMaxWidth));
	//   64  129:iload           5
	//   65  131:aload_0         
	//   66  132:getfield        #104 <Field int inactiveItemMinWidth>
	//   67  135:iload_2         
	//   68  136:imul            
	//   69  137:isub            
	//   70  138:iload_1         
	//   71  139:aload_0         
	//   72  140:getfield        #109 <Field int activeItemMaxWidth>
	//   73  143:invokestatic    #299 <Method int Math.min(int, int)>
	//   74  146:invokestatic    #299 <Method int Math.min(int, int)>
	//   75  149:istore          4
			k = k1 - i1;
	//   76  151:iload           5
	//   77  153:iload           4
	//   78  155:isub            
	//   79  156:istore_3        
			if(j == 0)
	//*  80  157:iload_2         
	//*  81  158:ifne            166
				i = 1;
	//   82  161:iconst_1        
	//   83  162:istore_1        
			else
	//*  84  163:goto            168
				i = j;
	//   85  166:iload_2         
	//   86  167:istore_1        
			k1 = Math.min(k / i, inactiveItemMaxWidth);
	//   87  168:iload_3         
	//   88  169:iload_1         
	//   89  170:idiv            
	//   90  171:aload_0         
	//   91  172:getfield        #99  <Field int inactiveItemMaxWidth>
	//   92  175:invokestatic    #299 <Method int Math.min(int, int)>
	//   93  178:istore          5
			j = k - j * k1;
	//   94  180:iload_3         
	//   95  181:iload_2         
	//   96  182:iload           5
	//   97  184:imul            
	//   98  185:isub            
	//   99  186:istore_2        
			for(i = 0; i < l1;)
	//* 100  187:iconst_0        
	//* 101  188:istore_1        
	//* 102  189:iload_1         
	//* 103  190:iload           6
	//* 104  192:icmpge          389
			{
				if(getChildAt(i).getVisibility() != 8)
	//* 105  195:aload_0         
	//* 106  196:iload_1         
	//* 107  197:invokevirtual   #383 <Method View getChildAt(int)>
	//* 108  200:invokevirtual   #388 <Method int View.getVisibility()>
	//* 109  203:bipush          8
	//* 110  205:icmpeq          265
				{
					int ai[] = tempChildWidths;
	//  111  208:aload_0         
	//  112  209:getfield        #163 <Field int[] tempChildWidths>
	//  113  212:astore          8
					if(i == selectedItemPosition)
	//* 114  214:iload_1         
	//* 115  215:aload_0         
	//* 116  216:getfield        #82  <Field int selectedItemPosition>
	//* 117  219:icmpne          228
						k = i1;
	//  118  222:iload           4
	//  119  224:istore_3        
					else
	//* 120  225:goto            231
						k = k1;
	//  121  228:iload           5
	//  122  230:istore_3        
					ai[i] = k;
	//  123  231:aload           8
	//  124  233:iload_1         
	//  125  234:iload_3         
	//  126  235:iastore         
					k = j;
	//  127  236:iload_2         
	//  128  237:istore_3        
					if(j > 0)
	//* 129  238:iload_2         
	//* 130  239:ifle            274
					{
						int ai1[] = tempChildWidths;
	//  131  242:aload_0         
	//  132  243:getfield        #163 <Field int[] tempChildWidths>
	//  133  246:astore          8
						ai1[i] = ai1[i] + 1;
	//  134  248:aload           8
	//  135  250:iload_1         
	//  136  251:aload           8
	//  137  253:iload_1         
	//  138  254:iaload          
	//  139  255:iconst_1        
	//  140  256:iadd            
	//  141  257:iastore         
						k = j - 1;
	//  142  258:iload_2         
	//  143  259:iconst_1        
	//  144  260:isub            
	//  145  261:istore_3        
					}
				} else
	//* 146  262:goto            274
				{
					tempChildWidths[i] = 0;
	//  147  265:aload_0         
	//  148  266:getfield        #163 <Field int[] tempChildWidths>
	//  149  269:iload_1         
	//  150  270:iconst_0        
	//  151  271:iastore         
					k = j;
	//  152  272:iload_2         
	//  153  273:istore_3        
				}
				i++;
	//  154  274:iload_1         
	//  155  275:iconst_1        
	//  156  276:iadd            
	//  157  277:istore_1        
				j = k;
	//  158  278:iload_3         
	//  159  279:istore_2        
			}

		} else
	//* 160  280:goto            189
		{
			if(k == 0)
	//* 161  283:iload_3         
	//* 162  284:ifne            292
				i = 1;
	//  163  287:iconst_1        
	//  164  288:istore_1        
			else
	//* 165  289:goto            294
				i = k;
	//  166  292:iload_3         
	//  167  293:istore_1        
			int j1 = Math.min(k1 / i, activeItemMaxWidth);
	//  168  294:iload           5
	//  169  296:iload_1         
	//  170  297:idiv            
	//  171  298:aload_0         
	//  172  299:getfield        #109 <Field int activeItemMaxWidth>
	//  173  302:invokestatic    #299 <Method int Math.min(int, int)>
	//  174  305:istore          4
			j = k1 - k * j1;
	//  175  307:iload           5
	//  176  309:iload_3         
	//  177  310:iload           4
	//  178  312:imul            
	//  179  313:isub            
	//  180  314:istore_2        
			for(i = 0; i < l1;)
	//* 181  315:iconst_0        
	//* 182  316:istore_1        
	//* 183  317:iload_1         
	//* 184  318:iload           6
	//* 185  320:icmpge          389
			{
				int l;
				if(getChildAt(i).getVisibility() != 8)
	//* 186  323:aload_0         
	//* 187  324:iload_1         
	//* 188  325:invokevirtual   #383 <Method View getChildAt(int)>
	//* 189  328:invokevirtual   #388 <Method int View.getVisibility()>
	//* 190  331:bipush          8
	//* 191  333:icmpeq          371
				{
					int ai2[] = tempChildWidths;
	//  192  336:aload_0         
	//  193  337:getfield        #163 <Field int[] tempChildWidths>
	//  194  340:astore          8
					ai2[i] = j1;
	//  195  342:aload           8
	//  196  344:iload_1         
	//  197  345:iload           4
	//  198  347:iastore         
					l = j;
	//  199  348:iload_2         
	//  200  349:istore_3        
					if(j > 0)
	//* 201  350:iload_2         
	//* 202  351:ifle            380
					{
						ai2[i] = ai2[i] + 1;
	//  203  354:aload           8
	//  204  356:iload_1         
	//  205  357:aload           8
	//  206  359:iload_1         
	//  207  360:iaload          
	//  208  361:iconst_1        
	//  209  362:iadd            
	//  210  363:iastore         
						l = j - 1;
	//  211  364:iload_2         
	//  212  365:iconst_1        
	//  213  366:isub            
	//  214  367:istore_3        
					}
				} else
	//* 215  368:goto            380
				{
					tempChildWidths[i] = 0;
	//  216  371:aload_0         
	//  217  372:getfield        #163 <Field int[] tempChildWidths>
	//  218  375:iload_1         
	//  219  376:iconst_0        
	//  220  377:iastore         
					l = j;
	//  221  378:iload_2         
	//  222  379:istore_3        
				}
				i++;
	//  223  380:iload_1         
	//  224  381:iconst_1        
	//  225  382:iadd            
	//  226  383:istore_1        
				j = l;
	//  227  384:iload_3         
	//  228  385:istore_2        
			}

		}
	//* 229  386:goto            317
		i = 0;
	//  230  389:iconst_0        
	//  231  390:istore_1        
		j = i;
	//  232  391:iload_1         
	//  233  392:istore_2        
		for(; i < l1; i++)
	//* 234  393:iload_1         
	//* 235  394:iload           6
	//* 236  396:icmpge          466
		{
			View view1 = getChildAt(i);
	//  237  399:aload_0         
	//  238  400:iload_1         
	//  239  401:invokevirtual   #383 <Method View getChildAt(int)>
	//  240  404:astore          8
			if(view1.getVisibility() != 8)
	//* 241  406:aload           8
	//* 242  408:invokevirtual   #388 <Method int View.getVisibility()>
	//* 243  411:bipush          8
	//* 244  413:icmpne          419
	//* 245  416:goto            459
			{
				view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(tempChildWidths[i], 0x40000000), i2);
	//  246  419:aload           8
	//  247  421:aload_0         
	//  248  422:getfield        #163 <Field int[] tempChildWidths>
	//  249  425:iload_1         
	//  250  426:iaload          
	//  251  427:ldc2            #409 <Int 0x40000000>
	//  252  430:invokestatic    #412 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  253  433:iload           7
	//  254  435:invokevirtual   #416 <Method void View.measure(int, int)>
				view1.getLayoutParams().width = view1.getMeasuredWidth();
	//  255  438:aload           8
	//  256  440:invokevirtual   #423 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  257  443:aload           8
	//  258  445:invokevirtual   #397 <Method int View.getMeasuredWidth()>
	//  259  448:putfield        #428 <Field int android.view.ViewGroup$LayoutParams.width>
				j += view1.getMeasuredWidth();
	//  260  451:iload_2         
	//  261  452:aload           8
	//  262  454:invokevirtual   #397 <Method int View.getMeasuredWidth()>
	//  263  457:iadd            
	//  264  458:istore_2        
			}
		}

	//  265  459:iload_1         
	//  266  460:iconst_1        
	//  267  461:iadd            
	//  268  462:istore_1        
	//* 269  463:goto            393
		setMeasuredDimension(View.resolveSizeAndState(j, android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000), 0), View.resolveSizeAndState(itemHeight, i2, 0));
	//  270  466:aload_0         
	//  271  467:iload_2         
	//  272  468:iload_2         
	//  273  469:ldc2            #409 <Int 0x40000000>
	//  274  472:invokestatic    #412 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  275  475:iconst_0        
	//  276  476:invokestatic    #432 <Method int View.resolveSizeAndState(int, int, int)>
	//  277  479:aload_0         
	//  278  480:getfield        #119 <Field int itemHeight>
	//  279  483:iload           7
	//  280  485:iconst_0        
	//  281  486:invokestatic    #432 <Method int View.resolveSizeAndState(int, int, int)>
	//  282  489:invokevirtual   #435 <Method void setMeasuredDimension(int, int)>
	//  283  492:return          
	}

	public void setIconTintList(ColorStateList colorstatelist)
	{
		itemIconTint = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #236 <Field ColorStateList itemIconTint>
		BottomNavigationItemView abottomnavigationitemview[] = buttons;
	//    3    5:aload_0         
	//    4    6:getfield        #195 <Field BottomNavigationItemView[] buttons>
	//    5    9:astore          4
		if(abottomnavigationitemview != null)
	//*   6   11:aload           4
	//*   7   13:ifnull          42
		{
			int j = abottomnavigationitemview.length;
	//    8   16:aload           4
	//    9   18:arraylength     
	//   10   19:istore_3        
			for(int i = 0; i < j; i++)
	//*  11   20:iconst_0        
	//*  12   21:istore_2        
	//*  13   22:iload_2         
	//*  14   23:iload_3         
	//*  15   24:icmpge          42
				abottomnavigationitemview[i].setIconTintList(colorstatelist);
	//   16   27:aload           4
	//   17   29:iload_2         
	//   18   30:aaload          
	//   19   31:aload_1         
	//   20   32:invokevirtual   #240 <Method void BottomNavigationItemView.setIconTintList(ColorStateList)>

	//   21   35:iload_2         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_2        
		}
	//*  25   39:goto            22
	//   26   42:return          
	}

	public void setItemBackground(Drawable drawable)
	{
		itemBackground = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #262 <Field Drawable itemBackground>
		BottomNavigationItemView abottomnavigationitemview[] = buttons;
	//    3    5:aload_0         
	//    4    6:getfield        #195 <Field BottomNavigationItemView[] buttons>
	//    5    9:astore          4
		if(abottomnavigationitemview != null)
	//*   6   11:aload           4
	//*   7   13:ifnull          42
		{
			int j = abottomnavigationitemview.length;
	//    8   16:aload           4
	//    9   18:arraylength     
	//   10   19:istore_3        
			for(int i = 0; i < j; i++)
	//*  11   20:iconst_0        
	//*  12   21:istore_2        
	//*  13   22:iload_2         
	//*  14   23:iload_3         
	//*  15   24:icmpge          42
				abottomnavigationitemview[i].setItemBackground(drawable);
	//   16   27:aload           4
	//   17   29:iload_2         
	//   18   30:aaload          
	//   19   31:aload_1         
	//   20   32:invokevirtual   #266 <Method void BottomNavigationItemView.setItemBackground(Drawable)>

	//   21   35:iload_2         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_2        
		}
	//*  25   39:goto            22
	//   26   42:return          
	}

	public void setItemBackgroundRes(int i)
	{
		itemBackgroundRes = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #268 <Field int itemBackgroundRes>
		BottomNavigationItemView abottomnavigationitemview[] = buttons;
	//    3    5:aload_0         
	//    4    6:getfield        #195 <Field BottomNavigationItemView[] buttons>
	//    5    9:astore          4
		if(abottomnavigationitemview != null)
	//*   6   11:aload           4
	//*   7   13:ifnull          42
		{
			int k = abottomnavigationitemview.length;
	//    8   16:aload           4
	//    9   18:arraylength     
	//   10   19:istore_3        
			for(int j = 0; j < k; j++)
	//*  11   20:iconst_0        
	//*  12   21:istore_2        
	//*  13   22:iload_2         
	//*  14   23:iload_3         
	//*  15   24:icmpge          42
				abottomnavigationitemview[j].setItemBackground(i);
	//   16   27:aload           4
	//   17   29:iload_2         
	//   18   30:aaload          
	//   19   31:iload_1         
	//   20   32:invokevirtual   #270 <Method void BottomNavigationItemView.setItemBackground(int)>

	//   21   35:iload_2         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_2        
		}
	//*  25   39:goto            22
	//   26   42:return          
	}

	public void setItemHorizontalTranslationEnabled(boolean flag)
	{
		itemHorizontalTranslationEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #374 <Field boolean itemHorizontalTranslationEnabled>
	//    3    5:return          
	}

	public void setItemIconSize(int i)
	{
		itemIconSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #242 <Field int itemIconSize>
		BottomNavigationItemView abottomnavigationitemview[] = buttons;
	//    3    5:aload_0         
	//    4    6:getfield        #195 <Field BottomNavigationItemView[] buttons>
	//    5    9:astore          4
		if(abottomnavigationitemview != null)
	//*   6   11:aload           4
	//*   7   13:ifnull          42
		{
			int k = abottomnavigationitemview.length;
	//    8   16:aload           4
	//    9   18:arraylength     
	//   10   19:istore_3        
			for(int j = 0; j < k; j++)
	//*  11   20:iconst_0        
	//*  12   21:istore_2        
	//*  13   22:iload_2         
	//*  14   23:iload_3         
	//*  15   24:icmpge          42
				abottomnavigationitemview[j].setIconSize(i);
	//   16   27:aload           4
	//   17   29:iload_2         
	//   18   30:aaload          
	//   19   31:iload_1         
	//   20   32:invokevirtual   #245 <Method void BottomNavigationItemView.setIconSize(int)>

	//   21   35:iload_2         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_2        
		}
	//*  25   39:goto            22
	//   26   42:return          
	}

	public void setItemTextAppearanceActive(int i)
	{
		itemTextAppearanceActive = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #255 <Field int itemTextAppearanceActive>
		BottomNavigationItemView abottomnavigationitemview[] = buttons;
	//    3    5:aload_0         
	//    4    6:getfield        #195 <Field BottomNavigationItemView[] buttons>
	//    5    9:astore          4
		if(abottomnavigationitemview != null)
	//*   6   11:aload           4
	//*   7   13:ifnull          64
		{
			int k = abottomnavigationitemview.length;
	//    8   16:aload           4
	//    9   18:arraylength     
	//   10   19:istore_3        
			for(int j = 0; j < k; j++)
	//*  11   20:iconst_0        
	//*  12   21:istore_2        
	//*  13   22:iload_2         
	//*  14   23:iload_3         
	//*  15   24:icmpge          64
			{
				BottomNavigationItemView bottomnavigationitemview = abottomnavigationitemview[j];
	//   16   27:aload           4
	//   17   29:iload_2         
	//   18   30:aaload          
	//   19   31:astore          5
				bottomnavigationitemview.setTextAppearanceActive(i);
	//   20   33:aload           5
	//   21   35:iload_1         
	//   22   36:invokevirtual   #258 <Method void BottomNavigationItemView.setTextAppearanceActive(int)>
				ColorStateList colorstatelist = itemTextColorFromUser;
	//   23   39:aload_0         
	//   24   40:getfield        #260 <Field ColorStateList itemTextColorFromUser>
	//   25   43:astore          6
				if(colorstatelist != null)
	//*  26   45:aload           6
	//*  27   47:ifnull          57
					bottomnavigationitemview.setTextColor(colorstatelist);
	//   28   50:aload           5
	//   29   52:aload           6
	//   30   54:invokevirtual   #248 <Method void BottomNavigationItemView.setTextColor(ColorStateList)>
			}

	//   31   57:iload_2         
	//   32   58:iconst_1        
	//   33   59:iadd            
	//   34   60:istore_2        
		}
	//*  35   61:goto            22
	//   36   64:return          
	}

	public void setItemTextAppearanceInactive(int i)
	{
		itemTextAppearanceInactive = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #250 <Field int itemTextAppearanceInactive>
		BottomNavigationItemView abottomnavigationitemview[] = buttons;
	//    3    5:aload_0         
	//    4    6:getfield        #195 <Field BottomNavigationItemView[] buttons>
	//    5    9:astore          4
		if(abottomnavigationitemview != null)
	//*   6   11:aload           4
	//*   7   13:ifnull          64
		{
			int k = abottomnavigationitemview.length;
	//    8   16:aload           4
	//    9   18:arraylength     
	//   10   19:istore_3        
			for(int j = 0; j < k; j++)
	//*  11   20:iconst_0        
	//*  12   21:istore_2        
	//*  13   22:iload_2         
	//*  14   23:iload_3         
	//*  15   24:icmpge          64
			{
				BottomNavigationItemView bottomnavigationitemview = abottomnavigationitemview[j];
	//   16   27:aload           4
	//   17   29:iload_2         
	//   18   30:aaload          
	//   19   31:astore          5
				bottomnavigationitemview.setTextAppearanceInactive(i);
	//   20   33:aload           5
	//   21   35:iload_1         
	//   22   36:invokevirtual   #253 <Method void BottomNavigationItemView.setTextAppearanceInactive(int)>
				ColorStateList colorstatelist = itemTextColorFromUser;
	//   23   39:aload_0         
	//   24   40:getfield        #260 <Field ColorStateList itemTextColorFromUser>
	//   25   43:astore          6
				if(colorstatelist != null)
	//*  26   45:aload           6
	//*  27   47:ifnull          57
					bottomnavigationitemview.setTextColor(colorstatelist);
	//   28   50:aload           5
	//   29   52:aload           6
	//   30   54:invokevirtual   #248 <Method void BottomNavigationItemView.setTextColor(ColorStateList)>
			}

	//   31   57:iload_2         
	//   32   58:iconst_1        
	//   33   59:iadd            
	//   34   60:istore_2        
		}
	//*  35   61:goto            22
	//   36   64:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		itemTextColorFromUser = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #260 <Field ColorStateList itemTextColorFromUser>
		BottomNavigationItemView abottomnavigationitemview[] = buttons;
	//    3    5:aload_0         
	//    4    6:getfield        #195 <Field BottomNavigationItemView[] buttons>
	//    5    9:astore          4
		if(abottomnavigationitemview != null)
	//*   6   11:aload           4
	//*   7   13:ifnull          42
		{
			int j = abottomnavigationitemview.length;
	//    8   16:aload           4
	//    9   18:arraylength     
	//   10   19:istore_3        
			for(int i = 0; i < j; i++)
	//*  11   20:iconst_0        
	//*  12   21:istore_2        
	//*  13   22:iload_2         
	//*  14   23:iload_3         
	//*  15   24:icmpge          42
				abottomnavigationitemview[i].setTextColor(colorstatelist);
	//   16   27:aload           4
	//   17   29:iload_2         
	//   18   30:aaload          
	//   19   31:aload_1         
	//   20   32:invokevirtual   #248 <Method void BottomNavigationItemView.setTextColor(ColorStateList)>

	//   21   35:iload_2         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_2        
		}
	//*  25   39:goto            22
	//   26   42:return          
	}

	public void setLabelVisibilityMode(int i)
	{
		labelVisibilityMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #207 <Field int labelVisibilityMode>
	//    3    5:return          
	}

	public void setPresenter(BottomNavigationPresenter bottomnavigationpresenter)
	{
		presenter = bottomnavigationpresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #167 <Field BottomNavigationPresenter presenter>
	//    3    5:return          
	}

	void tryRestoreSelectedItemId(int i)
	{
		int k = menu.size();
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field MenuBuilder menu>
	//    2    4:invokevirtual   #205 <Method int MenuBuilder.size()>
	//    3    7:istore_3        
		for(int j = 0; j < k; j++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          63
		{
			MenuItem menuitem = menu.getItem(j);
	//    9   15:aload_0         
	//   10   16:getfield        #171 <Field MenuBuilder menu>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #226 <Method MenuItem MenuBuilder.getItem(int)>
	//   13   23:astore          4
			if(i == menuitem.getItemId())
	//*  14   25:iload_1         
	//*  15   26:aload           4
	//*  16   28:invokeinterface #448 <Method int MenuItem.getItemId()>
	//*  17   33:icmpne          56
			{
				selectedItemId = i;
	//   18   36:aload_0         
	//   19   37:iload_1         
	//   20   38:putfield        #80  <Field int selectedItemId>
				selectedItemPosition = j;
	//   21   41:aload_0         
	//   22   42:iload_2         
	//   23   43:putfield        #82  <Field int selectedItemPosition>
				menuitem.setChecked(true);
	//   24   46:aload           4
	//   25   48:iconst_1        
	//   26   49:invokeinterface #302 <Method MenuItem MenuItem.setChecked(boolean)>
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
		MenuBuilder menubuilder = menu;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field MenuBuilder menu>
	//    2    4:astore          5
		if(menubuilder != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          206
		{
			if(buttons == null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #195 <Field BottomNavigationItemView[] buttons>
	//*   7   15:ifnonnull       19
				return;
	//    8   18:return          
			int k = menubuilder.size();
	//    9   19:aload           5
	//   10   21:invokevirtual   #205 <Method int MenuBuilder.size()>
	//   11   24:istore_2        
			if(k != buttons.length)
	//*  12   25:iload_2         
	//*  13   26:aload_0         
	//*  14   27:getfield        #195 <Field BottomNavigationItemView[] buttons>
	//*  15   30:arraylength     
	//*  16   31:icmpeq          39
			{
				buildMenuView();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #451 <Method void buildMenuView()>
				return;
	//   19   38:return          
			}
			int l = selectedItemId;
	//   20   39:aload_0         
	//   21   40:getfield        #80  <Field int selectedItemId>
	//   22   43:istore_3        
			for(int i = 0; i < k; i++)
	//*  23   44:iconst_0        
	//*  24   45:istore_1        
	//*  25   46:iload_1         
	//*  26   47:iload_2         
	//*  27   48:icmpge          94
			{
				MenuItem menuitem = menu.getItem(i);
	//   28   51:aload_0         
	//   29   52:getfield        #171 <Field MenuBuilder menu>
	//   30   55:iload_1         
	//   31   56:invokevirtual   #226 <Method MenuItem MenuBuilder.getItem(int)>
	//   32   59:astore          5
				if(menuitem.isChecked())
	//*  33   61:aload           5
	//*  34   63:invokeinterface #454 <Method boolean MenuItem.isChecked()>
	//*  35   68:ifeq            87
				{
					selectedItemId = menuitem.getItemId();
	//   36   71:aload_0         
	//   37   72:aload           5
	//   38   74:invokeinterface #448 <Method int MenuItem.getItemId()>
	//   39   79:putfield        #80  <Field int selectedItemId>
					selectedItemPosition = i;
	//   40   82:aload_0         
	//   41   83:iload_1         
	//   42   84:putfield        #82  <Field int selectedItemPosition>
				}
			}

	//   43   87:iload_1         
	//   44   88:iconst_1        
	//   45   89:iadd            
	//   46   90:istore_1        
	//*  47   91:goto            46
			if(l != selectedItemId)
	//*  48   94:iload_3         
	//*  49   95:aload_0         
	//*  50   96:getfield        #80  <Field int selectedItemId>
	//*  51   99:icmpeq          110
				TransitionManager.beginDelayedTransition(((ViewGroup) (this)), ((android.support.transition.Transition) (set)));
	//   52  102:aload_0         
	//   53  103:aload_0         
	//   54  104:getfield        #132 <Field TransitionSet set>
	//   55  107:invokestatic    #460 <Method void TransitionManager.beginDelayedTransition(ViewGroup, android.support.transition.Transition)>
			boolean flag = isShifting(labelVisibilityMode, menu.getVisibleItems().size());
	//   56  110:aload_0         
	//   57  111:aload_0         
	//   58  112:getfield        #207 <Field int labelVisibilityMode>
	//   59  115:aload_0         
	//   60  116:getfield        #171 <Field MenuBuilder menu>
	//   61  119:invokevirtual   #211 <Method ArrayList MenuBuilder.getVisibleItems()>
	//   62  122:invokevirtual   #214 <Method int ArrayList.size()>
	//   63  125:invokespecial   #216 <Method boolean isShifting(int, int)>
	//   64  128:istore          4
			for(int j = 0; j < k; j++)
	//*  65  130:iconst_0        
	//*  66  131:istore_1        
	//*  67  132:iload_1         
	//*  68  133:iload_2         
	//*  69  134:icmpge          205
			{
				presenter.setUpdateSuspended(true);
	//   70  137:aload_0         
	//   71  138:getfield        #167 <Field BottomNavigationPresenter presenter>
	//   72  141:iconst_1        
	//   73  142:invokevirtual   #222 <Method void BottomNavigationPresenter.setUpdateSuspended(boolean)>
				buttons[j].setLabelVisibilityMode(labelVisibilityMode);
	//   74  145:aload_0         
	//   75  146:getfield        #195 <Field BottomNavigationItemView[] buttons>
	//   76  149:iload_1         
	//   77  150:aaload          
	//   78  151:aload_0         
	//   79  152:getfield        #207 <Field int labelVisibilityMode>
	//   80  155:invokevirtual   #276 <Method void BottomNavigationItemView.setLabelVisibilityMode(int)>
				buttons[j].setShifting(flag);
	//   81  158:aload_0         
	//   82  159:getfield        #195 <Field BottomNavigationItemView[] buttons>
	//   83  162:iload_1         
	//   84  163:aaload          
	//   85  164:iload           4
	//   86  166:invokevirtual   #273 <Method void BottomNavigationItemView.setShifting(boolean)>
				buttons[j].initialize((MenuItemImpl)menu.getItem(j), 0);
	//   87  169:aload_0         
	//   88  170:getfield        #195 <Field BottomNavigationItemView[] buttons>
	//   89  173:iload_1         
	//   90  174:aaload          
	//   91  175:aload_0         
	//   92  176:getfield        #171 <Field MenuBuilder menu>
	//   93  179:iload_1         
	//   94  180:invokevirtual   #226 <Method MenuItem MenuBuilder.getItem(int)>
	//   95  183:checkcast       #278 <Class MenuItemImpl>
	//   96  186:iconst_0        
	//   97  187:invokevirtual   #282 <Method void BottomNavigationItemView.initialize(MenuItemImpl, int)>
				presenter.setUpdateSuspended(false);
	//   98  190:aload_0         
	//   99  191:getfield        #167 <Field BottomNavigationPresenter presenter>
	//  100  194:iconst_0        
	//  101  195:invokevirtual   #222 <Method void BottomNavigationPresenter.setUpdateSuspended(boolean)>
			}

	//  102  198:iload_1         
	//  103  199:iconst_1        
	//  104  200:iadd            
	//  105  201:istore_1        
	//* 106  202:goto            132
			return;
	//  107  205:return          
		} else
		{
			return;
	//  108  206:return          
		}
	}

	private static final long ACTIVE_ANIMATION_DURATION_MS = 115L;
	private static final int CHECKED_STATE_SET[] = {
		0x10100a0
	};
	private static final int DISABLED_STATE_SET[] = {
		0xfefeff62
	};
	private final int activeItemMaxWidth;
	private final int activeItemMinWidth;
	private BottomNavigationItemView buttons[];
	private final int inactiveItemMaxWidth;
	private final int inactiveItemMinWidth;
	private Drawable itemBackground;
	private int itemBackgroundRes;
	private final int itemHeight;
	private boolean itemHorizontalTranslationEnabled;
	private int itemIconSize;
	private ColorStateList itemIconTint;
	private final android.support.v4.util.Pools.Pool itemPool;
	private int itemTextAppearanceActive;
	private int itemTextAppearanceInactive;
	private final ColorStateList itemTextColorDefault;
	private ColorStateList itemTextColorFromUser;
	private int labelVisibilityMode;
	private MenuBuilder menu;
	private final android.view.View.OnClickListener onClickListener;
	private BottomNavigationPresenter presenter;
	private int selectedItemId;
	private int selectedItemPosition;
	private final TransitionSet set;
	private int tempChildWidths[];

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #59  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #61  <Field int[] CHECKED_STATE_SET>
	//    7   11:iconst_1        
	//    8   12:newarray        int[]
	//    9   14:dup             
	//   10   15:iconst_0        
	//   11   16:ldc1            #62  <Int 0xfefeff62>
	//   12   18:iastore         
	//   13   19:putstatic       #64  <Field int[] DISABLED_STATE_SET>
	//*  14   22:return          
	}


/*
	static BottomNavigationPresenter access$000(BottomNavigationMenuView bottomnavigationmenuview)
	{
		return bottomnavigationmenuview.presenter;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field BottomNavigationPresenter presenter>
	//    2    4:areturn         
	}

*/


/*
	static MenuBuilder access$100(BottomNavigationMenuView bottomnavigationmenuview)
	{
		return bottomnavigationmenuview.menu;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field MenuBuilder menu>
	//    2    4:areturn         
	}

*/
}
