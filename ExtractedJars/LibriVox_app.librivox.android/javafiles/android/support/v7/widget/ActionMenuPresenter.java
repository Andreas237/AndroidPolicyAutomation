// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.d;
import android.support.v4.view.e;
import android.support.v7.view.ActionBarPolicy;
import android.support.v7.view.menu.*;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.*;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuView

class ActionMenuPresenter extends BaseMenuPresenter
	implements e
{

	public ActionMenuPresenter(Context context)
	{
		super(context, android.support.v7.appcompat.R.layout.abc_action_menu_layout, android.support.v7.appcompat.R.layout.abc_action_menu_item_layout);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #49  <Field int android.support.v7.appcompat.R$layout.abc_action_menu_layout>
	//    3    5:getstatic       #52  <Field int android.support.v7.appcompat.R$layout.abc_action_menu_item_layout>
	//    4    8:invokespecial   #55  <Method void BaseMenuPresenter(Context, int, int)>
	//    5   11:aload_0         
	//    6   12:new             #57  <Class SparseBooleanArray>
	//    7   15:dup             
	//    8   16:invokespecial   #60  <Method void SparseBooleanArray()>
	//    9   19:putfield        #62  <Field SparseBooleanArray mActionButtonGroups>
	//   10   22:aload_0         
	//   11   23:new             #64  <Class ActionMenuPresenter$PopupPresenterCallback>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokespecial   #67  <Method void ActionMenuPresenter$PopupPresenterCallback(ActionMenuPresenter)>
	//   15   31:putfield        #69  <Field ActionMenuPresenter$PopupPresenterCallback mPopupPresenterCallback>
	//   16   34:return          
	}

	private View findViewForItem(MenuItem menuitem)
	{
		ViewGroup viewgroup = (ViewGroup)mMenuView;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field MenuView mMenuView>
	//    2    4:checkcast       #90  <Class ViewGroup>
	//    3    7:astore          4
		if(viewgroup == null)
	//*   4    9:aload           4
	//*   5   11:ifnonnull       16
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		int j = viewgroup.getChildCount();
	//    8   16:aload           4
	//    9   18:invokevirtual   #94  <Method int ViewGroup.getChildCount()>
	//   10   21:istore_3        
		for(int i = 0; i < j; i++)
	//*  11   22:iconst_0        
	//*  12   23:istore_2        
	//*  13   24:iload_2         
	//*  14   25:iload_3         
	//*  15   26:icmpge          69
		{
			View view = viewgroup.getChildAt(i);
	//   16   29:aload           4
	//   17   31:iload_2         
	//   18   32:invokevirtual   #98  <Method View ViewGroup.getChildAt(int)>
	//   19   35:astore          5
			if((view instanceof android.support.v7.view.menu.MenuView.ItemView) && ((android.support.v7.view.menu.MenuView.ItemView)view).getItemData() == menuitem)
	//*  20   37:aload           5
	//*  21   39:instanceof      #100 <Class android.support.v7.view.menu.MenuView$ItemView>
	//*  22   42:ifeq            62
	//*  23   45:aload           5
	//*  24   47:checkcast       #100 <Class android.support.v7.view.menu.MenuView$ItemView>
	//*  25   50:invokeinterface #104 <Method MenuItemImpl android.support.v7.view.menu.MenuView$ItemView.getItemData()>
	//*  26   55:aload_1         
	//*  27   56:if_acmpne       62
				return view;
	//   28   59:aload           5
	//   29   61:areturn         
		}

	//   30   62:iload_2         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:istore_2        
	//*  34   66:goto            24
		return null;
	//   35   69:aconst_null     
	//   36   70:areturn         
	}

	public void bindItemView(MenuItemImpl menuitemimpl, android.support.v7.view.menu.MenuView.ItemView itemview)
	{
		itemview.initialize(menuitemimpl, 0);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokeinterface #110 <Method void android.support.v7.view.menu.MenuView$ItemView.initialize(MenuItemImpl, int)>
		menuitemimpl = ((MenuItemImpl) ((ActionMenuView)mMenuView));
	//    4    8:aload_0         
	//    5    9:getfield        #83  <Field MenuView mMenuView>
	//    6   12:checkcast       #112 <Class ActionMenuView>
	//    7   15:astore_1        
		itemview = ((android.support.v7.view.menu.MenuView.ItemView) ((ActionMenuItemView)itemview));
	//    8   16:aload_2         
	//    9   17:checkcast       #114 <Class ActionMenuItemView>
	//   10   20:astore_2        
		((ActionMenuItemView) (itemview)).setItemInvoker(((android.support.v7.view.menu.MenuBuilder.ItemInvoker) (menuitemimpl)));
	//   11   21:aload_2         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #118 <Method void ActionMenuItemView.setItemInvoker(android.support.v7.view.menu.MenuBuilder$ItemInvoker)>
		if(mPopupCallback == null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #120 <Field ActionMenuPresenter$ActionMenuPopupCallback mPopupCallback>
	//*  16   30:ifnonnull       45
			mPopupCallback = new ActionMenuPopupCallback();
	//   17   33:aload_0         
	//   18   34:new             #122 <Class ActionMenuPresenter$ActionMenuPopupCallback>
	//   19   37:dup             
	//   20   38:aload_0         
	//   21   39:invokespecial   #123 <Method void ActionMenuPresenter$ActionMenuPopupCallback(ActionMenuPresenter)>
	//   22   42:putfield        #120 <Field ActionMenuPresenter$ActionMenuPopupCallback mPopupCallback>
		((ActionMenuItemView) (itemview)).setPopupCallback(((android.support.v7.view.menu.ActionMenuItemView.PopupCallback) (mPopupCallback)));
	//   23   45:aload_2         
	//   24   46:aload_0         
	//   25   47:getfield        #120 <Field ActionMenuPresenter$ActionMenuPopupCallback mPopupCallback>
	//   26   50:invokevirtual   #127 <Method void ActionMenuItemView.setPopupCallback(android.support.v7.view.menu.ActionMenuItemView$PopupCallback)>
	//   27   53:return          
	}

	public boolean dismissPopupMenus()
	{
		return hideOverflowMenu() | hideSubMenus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method boolean hideOverflowMenu()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #135 <Method boolean hideSubMenus()>
	//    4    8:ior             
	//    5    9:ireturn         
	}

	public boolean filterLeftoverView(ViewGroup viewgroup, int i)
	{
		if(viewgroup.getChildAt(i) == mOverflowButton)
	//*   0    0:aload_1         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #98  <Method View ViewGroup.getChildAt(int)>
	//*   3    5:aload_0         
	//*   4    6:getfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*   5    9:if_acmpne       14
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		else
			return super.filterLeftoverView(viewgroup, i);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokespecial   #141 <Method boolean BaseMenuPresenter.filterLeftoverView(ViewGroup, int)>
	//   12   20:ireturn         
	}

	public boolean flagActionItems()
	{
		int l;
		int k1;
		int l2;
		int l3;
		int l4;
		ArrayList arraylist;
		ActionMenuPresenter actionmenupresenter;
		ViewGroup viewgroup;
label0:
		{
			actionmenupresenter = this;
	//    0    0:aload_0         
	//    1    1:astore          15
			if(actionmenupresenter.mMenu != null)
	//*   2    3:aload           15
	//*   3    5:getfield        #76  <Field MenuBuilder mMenu>
	//*   4    8:ifnull          31
			{
				arraylist = actionmenupresenter.mMenu.j();
	//    5   11:aload           15
	//    6   13:getfield        #76  <Field MenuBuilder mMenu>
	//    7   16:invokevirtual   #148 <Method ArrayList MenuBuilder.j()>
	//    8   19:astore          14
				k1 = arraylist.size();
	//    9   21:aload           14
	//   10   23:invokevirtual   #153 <Method int ArrayList.size()>
	//   11   26:istore          4
			} else
	//*  12   28:goto            37
			{
				arraylist = null;
	//   13   31:aconst_null     
	//   14   32:astore          14
				k1 = 0;
	//   15   34:iconst_0        
	//   16   35:istore          4
			}
			int i = actionmenupresenter.mMaxItems;
	//   17   37:aload           15
	//   18   39:getfield        #155 <Field int mMaxItems>
	//   19   42:istore_1        
			l3 = actionmenupresenter.mActionItemWidthLimit;
	//   20   43:aload           15
	//   21   45:getfield        #157 <Field int mActionItemWidthLimit>
	//   22   48:istore          8
			l4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   23   50:iconst_0        
	//   24   51:iconst_0        
	//   25   52:invokestatic    #163 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   26   55:istore          10
			viewgroup = (ViewGroup)actionmenupresenter.mMenuView;
	//   27   57:aload           15
	//   28   59:getfield        #83  <Field MenuView mMenuView>
	//   29   62:checkcast       #90  <Class ViewGroup>
	//   30   65:astore          16
			l2 = 0;
	//   31   67:iconst_0        
	//   32   68:istore          5
			boolean flag = false;
	//   33   70:iconst_0        
	//   34   71:istore          6
			l = 0;
	//   35   73:iconst_0        
	//   36   74:istore_2        
			int i1 = 0;
	//   37   75:iconst_0        
	//   38   76:istore_3        
			while(l2 < k1) 
	//*  39   77:iload           5
	//*  40   79:iload           4
	//*  41   81:icmpge          166
			{
				MenuItemImpl menuitemimpl1 = (MenuItemImpl)arraylist.get(l2);
	//   42   84:aload           14
	//   43   86:iload           5
	//   44   88:invokevirtual   #167 <Method Object ArrayList.get(int)>
	//   45   91:checkcast       #169 <Class MenuItemImpl>
	//   46   94:astore          17
				if(menuitemimpl1.requiresActionButton())
	//*  47   96:aload           17
	//*  48   98:invokevirtual   #172 <Method boolean MenuItemImpl.requiresActionButton()>
	//*  49  101:ifeq            111
					l++;
	//   50  104:iload_2         
	//   51  105:iconst_1        
	//   52  106:iadd            
	//   53  107:istore_2        
				else
	//*  54  108:goto            129
				if(menuitemimpl1.requestsActionButton())
	//*  55  111:aload           17
	//*  56  113:invokevirtual   #175 <Method boolean MenuItemImpl.requestsActionButton()>
	//*  57  116:ifeq            126
					i1++;
	//   58  119:iload_3         
	//   59  120:iconst_1        
	//   60  121:iadd            
	//   61  122:istore_3        
				else
	//*  62  123:goto            129
					flag = true;
	//   63  126:iconst_1        
	//   64  127:istore          6
				int j3 = i;
	//   65  129:iload_1         
	//   66  130:istore          7
				if(actionmenupresenter.mExpandedActionViewsExclusive)
	//*  67  132:aload           15
	//*  68  134:getfield        #177 <Field boolean mExpandedActionViewsExclusive>
	//*  69  137:ifeq            154
				{
					j3 = i;
	//   70  140:iload_1         
	//   71  141:istore          7
					if(menuitemimpl1.isActionViewExpanded())
	//*  72  143:aload           17
	//*  73  145:invokevirtual   #180 <Method boolean MenuItemImpl.isActionViewExpanded()>
	//*  74  148:ifeq            154
						j3 = 0;
	//   75  151:iconst_0        
	//   76  152:istore          7
				}
				l2++;
	//   77  154:iload           5
	//   78  156:iconst_1        
	//   79  157:iadd            
	//   80  158:istore          5
				i = j3;
	//   81  160:iload           7
	//   82  162:istore_1        
			}
	//*  83  163:goto            77
			l2 = i;
	//   84  166:iload_1         
	//   85  167:istore          5
			if(!actionmenupresenter.mReserveOverflow)
				break label0;
	//   86  169:aload           15
	//   87  171:getfield        #182 <Field boolean mReserveOverflow>
	//   88  174:ifeq            197
			if(!flag)
	//*  89  177:iload           6
	//*  90  179:ifne            192
			{
				l2 = i;
	//   91  182:iload_1         
	//   92  183:istore          5
				if(i1 + l <= i)
					break label0;
	//   93  185:iload_3         
	//   94  186:iload_2         
	//   95  187:iadd            
	//   96  188:iload_1         
	//   97  189:icmple          197
			}
			l2 = i - 1;
	//   98  192:iload_1         
	//   99  193:iconst_1        
	//  100  194:isub            
	//  101  195:istore          5
		}
		int j1 = l2 - l;
	//  102  197:iload           5
	//  103  199:iload_2         
	//  104  200:isub            
	//  105  201:istore_3        
		SparseBooleanArray sparsebooleanarray = actionmenupresenter.mActionButtonGroups;
	//  106  202:aload           15
	//  107  204:getfield        #62  <Field SparseBooleanArray mActionButtonGroups>
	//  108  207:astore          17
		sparsebooleanarray.clear();
	//  109  209:aload           17
	//  110  211:invokevirtual   #185 <Method void SparseBooleanArray.clear()>
		int i3;
		if(actionmenupresenter.mStrictWidthLimit)
	//* 111  214:aload           15
	//* 112  216:getfield        #187 <Field boolean mStrictWidthLimit>
	//* 113  219:ifeq            246
		{
			int j = actionmenupresenter.mMinCellSize;
	//  114  222:aload           15
	//  115  224:getfield        #189 <Field int mMinCellSize>
	//  116  227:istore_1        
			l = l3 / j;
	//  117  228:iload           8
	//  118  230:iload_1         
	//  119  231:idiv            
	//  120  232:istore_2        
			i3 = j + (l3 % j) / l;
	//  121  233:iload_1         
	//  122  234:iload           8
	//  123  236:iload_1         
	//  124  237:irem            
	//  125  238:iload_2         
	//  126  239:idiv            
	//  127  240:iadd            
	//  128  241:istore          6
		} else
	//* 129  243:goto            251
		{
			i3 = 0;
	//  130  246:iconst_0        
	//  131  247:istore          6
			l = 0;
	//  132  249:iconst_0        
	//  133  250:istore_2        
		}
		l2 = l3;
	//  134  251:iload           8
	//  135  253:istore          5
		l3 = 0;
	//  136  255:iconst_0        
	//  137  256:istore          8
		int k = 0;
	//  138  258:iconst_0        
	//  139  259:istore_1        
		int k3 = k1;
	//  140  260:iload           4
	//  141  262:istore          7
		do
		{
			ActionMenuPresenter actionmenupresenter1 = this;
	//  142  264:aload_0         
	//  143  265:astore          15
			if(l3 < k3)
	//* 144  267:iload           8
	//* 145  269:iload           7
	//* 146  271:icmpge          797
			{
				MenuItemImpl menuitemimpl2 = (MenuItemImpl)arraylist.get(l3);
	//  147  274:aload           14
	//  148  276:iload           8
	//  149  278:invokevirtual   #167 <Method Object ArrayList.get(int)>
	//  150  281:checkcast       #169 <Class MenuItemImpl>
	//  151  284:astore          18
				if(menuitemimpl2.requiresActionButton())
	//* 152  286:aload           18
	//* 153  288:invokevirtual   #172 <Method boolean MenuItemImpl.requiresActionButton()>
	//* 154  291:ifeq            415
				{
					View view = actionmenupresenter1.getItemView(menuitemimpl2, actionmenupresenter1.mScrapActionButtonView, viewgroup);
	//  155  294:aload           15
	//  156  296:aload           18
	//  157  298:aload           15
	//  158  300:getfield        #191 <Field View mScrapActionButtonView>
	//  159  303:aload           16
	//  160  305:invokevirtual   #195 <Method View getItemView(MenuItemImpl, View, ViewGroup)>
	//  161  308:astore          19
					if(actionmenupresenter1.mScrapActionButtonView == null)
	//* 162  310:aload           15
	//* 163  312:getfield        #191 <Field View mScrapActionButtonView>
	//* 164  315:ifnonnull       325
						actionmenupresenter1.mScrapActionButtonView = view;
	//  165  318:aload           15
	//  166  320:aload           19
	//  167  322:putfield        #191 <Field View mScrapActionButtonView>
					if(actionmenupresenter1.mStrictWidthLimit)
	//* 168  325:aload           15
	//* 169  327:getfield        #187 <Field boolean mStrictWidthLimit>
	//* 170  330:ifeq            350
						l -= ActionMenuView.measureChildForCells(view, i3, l, l4, 0);
	//  171  333:iload_2         
	//  172  334:aload           19
	//  173  336:iload           6
	//  174  338:iload_2         
	//  175  339:iload           10
	//  176  341:iconst_0        
	//  177  342:invokestatic    #199 <Method int ActionMenuView.measureChildForCells(View, int, int, int, int)>
	//  178  345:isub            
	//  179  346:istore_2        
					else
	//* 180  347:goto            359
						view.measure(l4, l4);
	//  181  350:aload           19
	//  182  352:iload           10
	//  183  354:iload           10
	//  184  356:invokevirtual   #205 <Method void View.measure(int, int)>
					int l1 = view.getMeasuredWidth();
	//  185  359:aload           19
	//  186  361:invokevirtual   #208 <Method int View.getMeasuredWidth()>
	//  187  364:istore          4
					l2 -= l1;
	//  188  366:iload           5
	//  189  368:iload           4
	//  190  370:isub            
	//  191  371:istore          5
					if(k == 0)
	//* 192  373:iload_1         
	//* 193  374:ifne            383
						k = l1;
	//  194  377:iload           4
	//  195  379:istore_1        
	//* 196  380:goto            383
					l1 = menuitemimpl2.getGroupId();
	//  197  383:aload           18
	//  198  385:invokevirtual   #211 <Method int MenuItemImpl.getGroupId()>
	//  199  388:istore          4
					if(l1 != 0)
	//* 200  390:iload           4
	//* 201  392:ifeq            406
						sparsebooleanarray.put(l1, true);
	//  202  395:aload           17
	//  203  397:iload           4
	//  204  399:iconst_1        
	//  205  400:invokevirtual   #215 <Method void SparseBooleanArray.put(int, boolean)>
	//* 206  403:goto            406
					menuitemimpl2.setIsActionButton(true);
	//  207  406:aload           18
	//  208  408:iconst_1        
	//  209  409:invokevirtual   #219 <Method void MenuItemImpl.setIsActionButton(boolean)>
				} else
	//* 210  412:goto            788
				if(menuitemimpl2.requestsActionButton())
	//* 211  415:aload           18
	//* 212  417:invokevirtual   #175 <Method boolean MenuItemImpl.requestsActionButton()>
	//* 213  420:ifeq            782
				{
					int i5 = menuitemimpl2.getGroupId();
	//  214  423:aload           18
	//  215  425:invokevirtual   #211 <Method int MenuItemImpl.getGroupId()>
	//  216  428:istore          11
					boolean flag2 = sparsebooleanarray.get(i5);
	//  217  430:aload           17
	//  218  432:iload           11
	//  219  434:invokevirtual   #222 <Method boolean SparseBooleanArray.get(int)>
	//  220  437:istore          13
					boolean flag1;
					if((j1 > 0 || flag2) && l2 > 0 && (!actionmenupresenter1.mStrictWidthLimit || l > 0))
	//* 221  439:iload_3         
	//* 222  440:ifgt            448
	//* 223  443:iload           13
	//* 224  445:ifeq            471
	//* 225  448:iload           5
	//* 226  450:ifle            471
	//* 227  453:aload           15
	//* 228  455:getfield        #187 <Field boolean mStrictWidthLimit>
	//* 229  458:ifeq            465
	//* 230  461:iload_2         
	//* 231  462:ifle            471
						flag1 = true;
	//  232  465:iconst_1        
	//  233  466:istore          12
					else
	//* 234  468:goto            474
						flag1 = false;
	//  235  471:iconst_0        
	//  236  472:istore          12
					if(flag1)
	//* 237  474:iload           12
	//* 238  476:ifeq            647
					{
						View view1 = actionmenupresenter1.getItemView(menuitemimpl2, actionmenupresenter1.mScrapActionButtonView, viewgroup);
	//  239  479:aload           15
	//  240  481:aload           18
	//  241  483:aload           15
	//  242  485:getfield        #191 <Field View mScrapActionButtonView>
	//  243  488:aload           16
	//  244  490:invokevirtual   #195 <Method View getItemView(MenuItemImpl, View, ViewGroup)>
	//  245  493:astore          19
						if(actionmenupresenter1.mScrapActionButtonView == null)
	//* 246  495:aload           15
	//* 247  497:getfield        #191 <Field View mScrapActionButtonView>
	//* 248  500:ifnonnull       510
							actionmenupresenter1.mScrapActionButtonView = view1;
	//  249  503:aload           15
	//  250  505:aload           19
	//  251  507:putfield        #191 <Field View mScrapActionButtonView>
						if(actionmenupresenter1.mStrictWidthLimit)
	//* 252  510:aload           15
	//* 253  512:getfield        #187 <Field boolean mStrictWidthLimit>
	//* 254  515:ifeq            554
						{
							int i4 = ActionMenuView.measureChildForCells(view1, i3, l, l4, 0);
	//  255  518:aload           19
	//  256  520:iload           6
	//  257  522:iload_2         
	//  258  523:iload           10
	//  259  525:iconst_0        
	//  260  526:invokestatic    #199 <Method int ActionMenuView.measureChildForCells(View, int, int, int, int)>
	//  261  529:istore          9
							int i2 = l - i4;
	//  262  531:iload_2         
	//  263  532:iload           9
	//  264  534:isub            
	//  265  535:istore          4
							l = i2;
	//  266  537:iload           4
	//  267  539:istore_2        
							if(i4 == 0)
	//* 268  540:iload           9
	//* 269  542:ifne            563
							{
								flag1 = false;
	//  270  545:iconst_0        
	//  271  546:istore          12
								l = i2;
	//  272  548:iload           4
	//  273  550:istore_2        
							}
						} else
	//* 274  551:goto            563
						{
							view1.measure(l4, l4);
	//  275  554:aload           19
	//  276  556:iload           10
	//  277  558:iload           10
	//  278  560:invokevirtual   #205 <Method void View.measure(int, int)>
						}
						int j4 = view1.getMeasuredWidth();
	//  279  563:aload           19
	//  280  565:invokevirtual   #208 <Method int View.getMeasuredWidth()>
	//  281  568:istore          9
						l2 -= j4;
	//  282  570:iload           5
	//  283  572:iload           9
	//  284  574:isub            
	//  285  575:istore          5
						int j2 = k;
	//  286  577:iload_1         
	//  287  578:istore          4
						if(k == 0)
	//* 288  580:iload_1         
	//* 289  581:ifne            588
							j2 = j4;
	//  290  584:iload           9
	//  291  586:istore          4
						if(actionmenupresenter1.mStrictWidthLimit)
	//* 292  588:aload           15
	//* 293  590:getfield        #187 <Field boolean mStrictWidthLimit>
	//* 294  593:ifeq            620
						{
							if(l2 >= 0)
	//* 295  596:iload           5
	//* 296  598:iflt            606
								k = 1;
	//  297  601:iconst_1        
	//  298  602:istore_1        
							else
	//* 299  603:goto            608
								k = 0;
	//  300  606:iconst_0        
	//  301  607:istore_1        
							flag1 &= ((boolean) (k));
	//  302  608:iload           12
	//  303  610:iload_1         
	//  304  611:iand            
	//  305  612:istore          12
							k = j2;
	//  306  614:iload           4
	//  307  616:istore_1        
						} else
	//* 308  617:goto            647
						{
							if(l2 + j2 > 0)
	//* 309  620:iload           5
	//* 310  622:iload           4
	//* 311  624:iadd            
	//* 312  625:ifle            633
								k = 1;
	//  313  628:iconst_1        
	//  314  629:istore_1        
							else
	//* 315  630:goto            635
								k = 0;
	//  316  633:iconst_0        
	//  317  634:istore_1        
							flag1 &= ((boolean) (k));
	//  318  635:iload           12
	//  319  637:iload_1         
	//  320  638:iand            
	//  321  639:istore          12
							k = j2;
	//  322  641:iload           4
	//  323  643:istore_1        
						}
					}
	//* 324  644:goto            647
					int k2;
					if(flag1 && i5 != 0)
	//* 325  647:iload           12
	//* 326  649:ifeq            671
	//* 327  652:iload           11
	//* 328  654:ifeq            671
					{
						sparsebooleanarray.put(i5, true);
	//  329  657:aload           17
	//  330  659:iload           11
	//  331  661:iconst_1        
	//  332  662:invokevirtual   #215 <Method void SparseBooleanArray.put(int, boolean)>
						k2 = j1;
	//  333  665:iload_3         
	//  334  666:istore          4
					} else
	//* 335  668:goto            759
					{
						k2 = j1;
	//  336  671:iload_3         
	//  337  672:istore          4
						if(flag2)
	//* 338  674:iload           13
	//* 339  676:ifeq            759
						{
							sparsebooleanarray.put(i5, false);
	//  340  679:aload           17
	//  341  681:iload           11
	//  342  683:iconst_0        
	//  343  684:invokevirtual   #215 <Method void SparseBooleanArray.put(int, boolean)>
							int k4 = 0;
	//  344  687:iconst_0        
	//  345  688:istore          9
							do
							{
								k2 = j1;
	//  346  690:iload_3         
	//  347  691:istore          4
								if(k4 >= l3)
									break;
	//  348  693:iload           9
	//  349  695:iload           8
	//  350  697:icmpge          759
								MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(k4);
	//  351  700:aload           14
	//  352  702:iload           9
	//  353  704:invokevirtual   #167 <Method Object ArrayList.get(int)>
	//  354  707:checkcast       #169 <Class MenuItemImpl>
	//  355  710:astore          15
								k2 = j1;
	//  356  712:iload_3         
	//  357  713:istore          4
								if(menuitemimpl.getGroupId() == i5)
	//* 358  715:aload           15
	//* 359  717:invokevirtual   #211 <Method int MenuItemImpl.getGroupId()>
	//* 360  720:iload           11
	//* 361  722:icmpne          747
								{
									k2 = j1;
	//  362  725:iload_3         
	//  363  726:istore          4
									if(menuitemimpl.isActionButton())
	//* 364  728:aload           15
	//* 365  730:invokevirtual   #225 <Method boolean MenuItemImpl.isActionButton()>
	//* 366  733:ifeq            741
										k2 = j1 + 1;
	//  367  736:iload_3         
	//  368  737:iconst_1        
	//  369  738:iadd            
	//  370  739:istore          4
									menuitemimpl.setIsActionButton(false);
	//  371  741:aload           15
	//  372  743:iconst_0        
	//  373  744:invokevirtual   #219 <Method void MenuItemImpl.setIsActionButton(boolean)>
								}
								k4++;
	//  374  747:iload           9
	//  375  749:iconst_1        
	//  376  750:iadd            
	//  377  751:istore          9
								j1 = k2;
	//  378  753:iload           4
	//  379  755:istore_3        
							} while(true);
	//  380  756:goto            690
						}
					}
					j1 = k2;
	//  381  759:iload           4
	//  382  761:istore_3        
					if(flag1)
	//* 383  762:iload           12
	//* 384  764:ifeq            772
						j1 = k2 - 1;
	//  385  767:iload           4
	//  386  769:iconst_1        
	//  387  770:isub            
	//  388  771:istore_3        
					menuitemimpl2.setIsActionButton(flag1);
	//  389  772:aload           18
	//  390  774:iload           12
	//  391  776:invokevirtual   #219 <Method void MenuItemImpl.setIsActionButton(boolean)>
				} else
	//* 392  779:goto            788
				{
					menuitemimpl2.setIsActionButton(false);
	//  393  782:aload           18
	//  394  784:iconst_0        
	//  395  785:invokevirtual   #219 <Method void MenuItemImpl.setIsActionButton(boolean)>
				}
				l3++;
	//  396  788:iload           8
	//  397  790:iconst_1        
	//  398  791:iadd            
	//  399  792:istore          8
			} else
	//* 400  794:goto            264
			{
				return true;
	//  401  797:iconst_1        
	//  402  798:ireturn         
			}
		} while(true);
	}

	public View getItemView(MenuItemImpl menuitemimpl, View view, ViewGroup viewgroup)
	{
		View view1 = menuitemimpl.getActionView();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #229 <Method View MenuItemImpl.getActionView()>
	//    2    4:astore          5
		if(view1 == null || menuitemimpl.hasCollapsibleActionView())
	//*   3    6:aload           5
	//*   4    8:ifnull          18
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #232 <Method boolean MenuItemImpl.hasCollapsibleActionView()>
	//*   7   15:ifeq            27
			view1 = super.getItemView(menuitemimpl, view, viewgroup);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokespecial   #233 <Method View BaseMenuPresenter.getItemView(MenuItemImpl, View, ViewGroup)>
	//   13   25:astore          5
		byte byte0;
		if(menuitemimpl.isActionViewExpanded())
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #180 <Method boolean MenuItemImpl.isActionViewExpanded()>
	//*  16   31:ifeq            41
			byte0 = 8;
	//   17   34:bipush          8
	//   18   36:istore          4
		else
	//*  19   38:goto            44
			byte0 = 0;
	//   20   41:iconst_0        
	//   21   42:istore          4
		view1.setVisibility(((int) (byte0)));
	//   22   44:aload           5
	//   23   46:iload           4
	//   24   48:invokevirtual   #237 <Method void View.setVisibility(int)>
		menuitemimpl = ((MenuItemImpl) ((ActionMenuView)viewgroup));
	//   25   51:aload_3         
	//   26   52:checkcast       #112 <Class ActionMenuView>
	//   27   55:astore_1        
		view = ((View) (view1.getLayoutParams()));
	//   28   56:aload           5
	//   29   58:invokevirtual   #241 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   30   61:astore_2        
		if(!((ActionMenuView) (menuitemimpl)).checkLayoutParams(((android.view.ViewGroup.LayoutParams) (view))))
	//*  31   62:aload_1         
	//*  32   63:aload_2         
	//*  33   64:invokevirtual   #245 <Method boolean ActionMenuView.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  34   67:ifne            80
			view1.setLayoutParams(((android.view.ViewGroup.LayoutParams) (((ActionMenuView) (menuitemimpl)).generateLayoutParams(((android.view.ViewGroup.LayoutParams) (view))))));
	//   35   70:aload           5
	//   36   72:aload_1         
	//   37   73:aload_2         
	//   38   74:invokevirtual   #249 <Method ActionMenuView$LayoutParams ActionMenuView.generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   39   77:invokevirtual   #253 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		return view1;
	//   40   80:aload           5
	//   41   82:areturn         
	}

	public MenuView getMenuView(ViewGroup viewgroup)
	{
		MenuView menuview = mMenuView;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field MenuView mMenuView>
	//    2    4:astore_2        
		viewgroup = ((ViewGroup) (super.getMenuView(viewgroup)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #257 <Method MenuView BaseMenuPresenter.getMenuView(ViewGroup)>
	//    6   10:astore_1        
		if(menuview != viewgroup)
	//*   7   11:aload_2         
	//*   8   12:aload_1         
	//*   9   13:if_acmpeq       24
			((ActionMenuView)viewgroup).setPresenter(this);
	//   10   16:aload_1         
	//   11   17:checkcast       #112 <Class ActionMenuView>
	//   12   20:aload_0         
	//   13   21:invokevirtual   #260 <Method void ActionMenuView.setPresenter(ActionMenuPresenter)>
		return ((MenuView) (viewgroup));
	//   14   24:aload_1         
	//   15   25:areturn         
	}

	public Drawable getOverflowIcon()
	{
		OverflowMenuButton overflowmenubutton = mOverflowButton;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//    2    4:astore_1        
		if(overflowmenubutton != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return overflowmenubutton.getDrawable();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #267 <Method Drawable ActionMenuPresenter$OverflowMenuButton.getDrawable()>
	//    7   13:areturn         
		if(mPendingOverflowIconSet)
	//*   8   14:aload_0         
	//*   9   15:getfield        #269 <Field boolean mPendingOverflowIconSet>
	//*  10   18:ifeq            26
			return mPendingOverflowIcon;
	//   11   21:aload_0         
	//   12   22:getfield        #271 <Field Drawable mPendingOverflowIcon>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public boolean hideOverflowMenu()
	{
		if(mPostedOpenRunnable != null && mMenuView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #273 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
	//*   2    4:ifnull          36
	//*   3    7:aload_0         
	//*   4    8:getfield        #83  <Field MenuView mMenuView>
	//*   5   11:ifnull          36
		{
			((View)mMenuView).removeCallbacks(((Runnable) (mPostedOpenRunnable)));
	//    6   14:aload_0         
	//    7   15:getfield        #83  <Field MenuView mMenuView>
	//    8   18:checkcast       #201 <Class View>
	//    9   21:aload_0         
	//   10   22:getfield        #273 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
	//   11   25:invokevirtual   #277 <Method boolean View.removeCallbacks(Runnable)>
	//   12   28:pop             
			mPostedOpenRunnable = null;
	//   13   29:aload_0         
	//   14   30:aconst_null     
	//   15   31:putfield        #273 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
			return true;
	//   16   34:iconst_1        
	//   17   35:ireturn         
		}
		OverflowPopup overflowpopup = mOverflowPopup;
	//   18   36:aload_0         
	//   19   37:getfield        #279 <Field ActionMenuPresenter$OverflowPopup mOverflowPopup>
	//   20   40:astore_1        
		if(overflowpopup != null)
	//*  21   41:aload_1         
	//*  22   42:ifnull          51
		{
			((MenuPopupHelper) (overflowpopup)).dismiss();
	//   23   45:aload_1         
	//   24   46:invokevirtual   #284 <Method void MenuPopupHelper.dismiss()>
			return true;
	//   25   49:iconst_1        
	//   26   50:ireturn         
		} else
		{
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		}
	}

	public boolean hideSubMenus()
	{
		ActionButtonSubmenu actionbuttonsubmenu = mActionButtonPopup;
	//    0    0:aload_0         
	//    1    1:getfield        #286 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
	//    2    4:astore_1        
		if(actionbuttonsubmenu != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
		{
			actionbuttonsubmenu.dismiss();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #289 <Method void ActionMenuPresenter$ActionButtonSubmenu.dismiss()>
			return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
		} else
		{
			return false;
	//    9   15:iconst_0        
	//   10   16:ireturn         
		}
	}

	public void initForMenu(Context context, MenuBuilder menubuilder)
	{
		((BaseMenuPresenter)this).initForMenu(context, menubuilder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #293 <Method void BaseMenuPresenter.initForMenu(Context, MenuBuilder)>
		menubuilder = ((MenuBuilder) (context.getResources()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #299 <Method Resources Context.getResources()>
	//    6   10:astore_2        
		context = ((Context) (ActionBarPolicy.get(context)));
	//    7   11:aload_1         
	//    8   12:invokestatic    #304 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//    9   15:astore_1        
		if(!mReserveOverflowSet)
	//*  10   16:aload_0         
	//*  11   17:getfield        #306 <Field boolean mReserveOverflowSet>
	//*  12   20:ifne            31
			mReserveOverflow = ((ActionBarPolicy) (context)).showsOverflowMenuButton();
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #309 <Method boolean ActionBarPolicy.showsOverflowMenuButton()>
	//   16   28:putfield        #182 <Field boolean mReserveOverflow>
		if(!mWidthLimitSet)
	//*  17   31:aload_0         
	//*  18   32:getfield        #311 <Field boolean mWidthLimitSet>
	//*  19   35:ifne            46
			mWidthLimit = ((ActionBarPolicy) (context)).getEmbeddedMenuWidthLimit();
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #314 <Method int ActionBarPolicy.getEmbeddedMenuWidthLimit()>
	//   23   43:putfield        #316 <Field int mWidthLimit>
		if(!mMaxItemsSet)
	//*  24   46:aload_0         
	//*  25   47:getfield        #318 <Field boolean mMaxItemsSet>
	//*  26   50:ifne            61
			mMaxItems = ((ActionBarPolicy) (context)).getMaxActionButtons();
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #321 <Method int ActionBarPolicy.getMaxActionButtons()>
	//   30   58:putfield        #155 <Field int mMaxItems>
		int i = mWidthLimit;
	//   31   61:aload_0         
	//   32   62:getfield        #316 <Field int mWidthLimit>
	//   33   65:istore_3        
		if(mReserveOverflow)
	//*  34   66:aload_0         
	//*  35   67:getfield        #182 <Field boolean mReserveOverflow>
	//*  36   70:ifeq            155
		{
			if(mOverflowButton == null)
	//*  37   73:aload_0         
	//*  38   74:getfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*  39   77:ifnonnull       142
			{
				mOverflowButton = new ((OverflowMenuButton)this).OverflowMenuButton(mSystemContext);
	//   40   80:aload_0         
	//   41   81:new             #264 <Class ActionMenuPresenter$OverflowMenuButton>
	//   42   84:dup             
	//   43   85:aload_0         
	//   44   86:aload_0         
	//   45   87:getfield        #325 <Field Context mSystemContext>
	//   46   90:invokespecial   #328 <Method void ActionMenuPresenter$OverflowMenuButton(ActionMenuPresenter, Context)>
	//   47   93:putfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
				if(mPendingOverflowIconSet)
	//*  48   96:aload_0         
	//*  49   97:getfield        #269 <Field boolean mPendingOverflowIconSet>
	//*  50  100:ifeq            124
				{
					mOverflowButton.setImageDrawable(mPendingOverflowIcon);
	//   51  103:aload_0         
	//   52  104:getfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//   53  107:aload_0         
	//   54  108:getfield        #271 <Field Drawable mPendingOverflowIcon>
	//   55  111:invokevirtual   #332 <Method void ActionMenuPresenter$OverflowMenuButton.setImageDrawable(Drawable)>
					mPendingOverflowIcon = null;
	//   56  114:aload_0         
	//   57  115:aconst_null     
	//   58  116:putfield        #271 <Field Drawable mPendingOverflowIcon>
					mPendingOverflowIconSet = false;
	//   59  119:aload_0         
	//   60  120:iconst_0        
	//   61  121:putfield        #269 <Field boolean mPendingOverflowIconSet>
				}
				int j = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   62  124:iconst_0        
	//   63  125:iconst_0        
	//   64  126:invokestatic    #163 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   65  129:istore          4
				mOverflowButton.measure(j, j);
	//   66  131:aload_0         
	//   67  132:getfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//   68  135:iload           4
	//   69  137:iload           4
	//   70  139:invokevirtual   #333 <Method void ActionMenuPresenter$OverflowMenuButton.measure(int, int)>
			}
			i -= mOverflowButton.getMeasuredWidth();
	//   71  142:iload_3         
	//   72  143:aload_0         
	//   73  144:getfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//   74  147:invokevirtual   #334 <Method int ActionMenuPresenter$OverflowMenuButton.getMeasuredWidth()>
	//   75  150:isub            
	//   76  151:istore_3        
		} else
	//*  77  152:goto            160
		{
			mOverflowButton = null;
	//   78  155:aload_0         
	//   79  156:aconst_null     
	//   80  157:putfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
		}
		mActionItemWidthLimit = i;
	//   81  160:aload_0         
	//   82  161:iload_3         
	//   83  162:putfield        #157 <Field int mActionItemWidthLimit>
		mMinCellSize = (int)(((Resources) (menubuilder)).getDisplayMetrics().density * 56F);
	//   84  165:aload_0         
	//   85  166:aload_2         
	//   86  167:invokevirtual   #340 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   87  170:getfield        #346 <Field float DisplayMetrics.density>
	//   88  173:ldc2            #347 <Float 56F>
	//   89  176:fmul            
	//   90  177:f2i             
	//   91  178:putfield        #189 <Field int mMinCellSize>
		mScrapActionButtonView = null;
	//   92  181:aload_0         
	//   93  182:aconst_null     
	//   94  183:putfield        #191 <Field View mScrapActionButtonView>
	//   95  186:return          
	}

	public boolean isOverflowMenuShowPending()
	{
		return mPostedOpenRunnable != null || isOverflowMenuShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #273 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
	//    2    4:ifnonnull       19
	//    3    7:aload_0         
	//    4    8:invokevirtual   #351 <Method boolean isOverflowMenuShowing()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public boolean isOverflowMenuShowing()
	{
		OverflowPopup overflowpopup = mOverflowPopup;
	//    0    0:aload_0         
	//    1    1:getfield        #279 <Field ActionMenuPresenter$OverflowPopup mOverflowPopup>
	//    2    4:astore_1        
		return overflowpopup != null && overflowpopup.isShowing();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #356 <Method boolean ActionMenuPresenter$OverflowPopup.isShowing()>
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
	//    1    1:getfield        #182 <Field boolean mReserveOverflow>
	//    2    4:ireturn         
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		dismissPopupMenus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #361 <Method boolean dismissPopupMenus()>
	//    2    4:pop             
		((BaseMenuPresenter)this).onCloseMenu(menubuilder, flag);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #363 <Method void BaseMenuPresenter.onCloseMenu(MenuBuilder, boolean)>
	//    7   11:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		if(!mMaxItemsSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field boolean mMaxItemsSet>
	//*   2    4:ifne            21
			mMaxItems = ActionBarPolicy.get(mContext).getMaxActionButtons();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #368 <Field Context mContext>
	//    6   12:invokestatic    #304 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//    7   15:invokevirtual   #321 <Method int ActionBarPolicy.getMaxActionButtons()>
	//    8   18:putfield        #155 <Field int mMaxItems>
		if(mMenu != null)
	//*   9   21:aload_0         
	//*  10   22:getfield        #76  <Field MenuBuilder mMenu>
	//*  11   25:ifnull          36
			mMenu.a(true);
	//   12   28:aload_0         
	//   13   29:getfield        #76  <Field MenuBuilder mMenu>
	//   14   32:iconst_1        
	//   15   33:invokevirtual   #371 <Method void MenuBuilder.a(boolean)>
	//   16   36:return          
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #375 <Class ActionMenuPresenter$SavedState>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    4    8:aload_1         
	//    5    9:checkcast       #375 <Class ActionMenuPresenter$SavedState>
	//    6   12:astore_1        
		if(((SavedState) (parcelable)).openSubMenuId > 0)
	//*   7   13:aload_1         
	//*   8   14:getfield        #378 <Field int ActionMenuPresenter$SavedState.openSubMenuId>
	//*   9   17:ifle            50
		{
			parcelable = ((Parcelable) (mMenu.findItem(((SavedState) (parcelable)).openSubMenuId)));
	//   10   20:aload_0         
	//   11   21:getfield        #76  <Field MenuBuilder mMenu>
	//   12   24:aload_1         
	//   13   25:getfield        #378 <Field int ActionMenuPresenter$SavedState.openSubMenuId>
	//   14   28:invokevirtual   #382 <Method MenuItem MenuBuilder.findItem(int)>
	//   15   31:astore_1        
			if(parcelable != null)
	//*  16   32:aload_1         
	//*  17   33:ifnull          50
				onSubMenuSelected((a)((MenuItem) (parcelable)).getSubMenu());
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokeinterface #388 <Method android.view.SubMenu MenuItem.getSubMenu()>
	//   21   43:checkcast       #390 <Class a>
	//   22   46:invokevirtual   #394 <Method boolean onSubMenuSelected(a)>
	//   23   49:pop             
		}
	//   24   50:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState();
	//    0    0:new             #375 <Class ActionMenuPresenter$SavedState>
	//    1    3:dup             
	//    2    4:invokespecial   #397 <Method void ActionMenuPresenter$SavedState()>
	//    3    7:astore_1        
		savedstate.openSubMenuId = mOpenSubMenuId;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #399 <Field int mOpenSubMenuId>
	//    7   13:putfield        #378 <Field int ActionMenuPresenter$SavedState.openSubMenuId>
		return ((Parcelable) (savedstate));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public boolean onSubMenuSelected(a a1)
	{
		boolean flag = a1.hasVisibleItems();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #402 <Method boolean a.hasVisibleItems()>
	//    2    4:istore          4
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		if(!flag)
	//*   5    9:iload           4
	//*   6   11:ifne            16
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
		Object obj;
		for(obj = ((Object) (a1)); ((a) (obj)).t() != mMenu; obj = ((Object) ((a)((a) (obj)).t())));
	//    9   16:aload_1         
	//   10   17:astore          6
	//   11   19:aload           6
	//   12   21:invokevirtual   #406 <Method android.view.Menu a.t()>
	//   13   24:aload_0         
	//   14   25:getfield        #76  <Field MenuBuilder mMenu>
	//   15   28:if_acmpeq       44
	//   16   31:aload           6
	//   17   33:invokevirtual   #406 <Method android.view.Menu a.t()>
	//   18   36:checkcast       #390 <Class a>
	//   19   39:astore          6
	//*  20   41:goto            19
		obj = ((Object) (findViewForItem(((a) (obj)).getItem())));
	//   21   44:aload_0         
	//   22   45:aload           6
	//   23   47:invokevirtual   #410 <Method MenuItem a.getItem()>
	//   24   50:invokespecial   #412 <Method View findViewForItem(MenuItem)>
	//   25   53:astore          6
		if(obj == null)
	//*  26   55:aload           6
	//*  27   57:ifnonnull       62
			return false;
	//   28   60:iconst_0        
	//   29   61:ireturn         
		mOpenSubMenuId = a1.getItem().getItemId();
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:invokevirtual   #410 <Method MenuItem a.getItem()>
	//   33   67:invokeinterface #415 <Method int MenuItem.getItemId()>
	//   34   72:putfield        #399 <Field int mOpenSubMenuId>
		int j = a1.size();
	//   35   75:aload_1         
	//   36   76:invokevirtual   #416 <Method int a.size()>
	//   37   79:istore_3        
		int i = 0;
	//   38   80:iconst_0        
	//   39   81:istore_2        
		do
		{
			flag = flag1;
	//   40   82:iload           5
	//   41   84:istore          4
			if(i >= j)
				break;
	//   42   86:iload_2         
	//   43   87:iload_3         
	//   44   88:icmpge          131
			MenuItem menuitem = a1.getItem(i);
	//   45   91:aload_1         
	//   46   92:iload_2         
	//   47   93:invokevirtual   #418 <Method MenuItem a.getItem(int)>
	//   48   96:astore          7
			if(menuitem.isVisible() && menuitem.getIcon() != null)
	//*  49   98:aload           7
	//*  50  100:invokeinterface #421 <Method boolean MenuItem.isVisible()>
	//*  51  105:ifeq            124
	//*  52  108:aload           7
	//*  53  110:invokeinterface #424 <Method Drawable MenuItem.getIcon()>
	//*  54  115:ifnull          124
			{
				flag = true;
	//   55  118:iconst_1        
	//   56  119:istore          4
				break;
	//   57  121:goto            131
			}
			i++;
	//   58  124:iload_2         
	//   59  125:iconst_1        
	//   60  126:iadd            
	//   61  127:istore_2        
		} while(true);
	//   62  128:goto            82
		mActionButtonPopup = new ((ActionButtonSubmenu)this).ActionButtonSubmenu(mContext, a1, ((View) (obj)));
	//   63  131:aload_0         
	//   64  132:new             #288 <Class ActionMenuPresenter$ActionButtonSubmenu>
	//   65  135:dup             
	//   66  136:aload_0         
	//   67  137:aload_0         
	//   68  138:getfield        #368 <Field Context mContext>
	//   69  141:aload_1         
	//   70  142:aload           6
	//   71  144:invokespecial   #427 <Method void ActionMenuPresenter$ActionButtonSubmenu(ActionMenuPresenter, Context, a, View)>
	//   72  147:putfield        #286 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
		mActionButtonPopup.setForceShowIcon(flag);
	//   73  150:aload_0         
	//   74  151:getfield        #286 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
	//   75  154:iload           4
	//   76  156:invokevirtual   #430 <Method void ActionMenuPresenter$ActionButtonSubmenu.setForceShowIcon(boolean)>
		mActionButtonPopup.show();
	//   77  159:aload_0         
	//   78  160:getfield        #286 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
	//   79  163:invokevirtual   #433 <Method void ActionMenuPresenter$ActionButtonSubmenu.show()>
		((BaseMenuPresenter)this).onSubMenuSelected(a1);
	//   80  166:aload_0         
	//   81  167:aload_1         
	//   82  168:invokespecial   #434 <Method boolean BaseMenuPresenter.onSubMenuSelected(a)>
	//   83  171:pop             
		return true;
	//   84  172:iconst_1        
	//   85  173:ireturn         
	}

	public void onSubUiVisibilityChanged(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
		{
			((BaseMenuPresenter)this).onSubMenuSelected(((a) (null)));
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #434 <Method boolean BaseMenuPresenter.onSubMenuSelected(a)>
	//    5    9:pop             
			return;
	//    6   10:return          
		}
		if(mMenu != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #76  <Field MenuBuilder mMenu>
	//*   9   15:ifnull          26
			mMenu.b(false);
	//   10   18:aload_0         
	//   11   19:getfield        #76  <Field MenuBuilder mMenu>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #438 <Method void MenuBuilder.b(boolean)>
	//   14   26:return          
	}

	public void setExpandedActionViewsExclusive(boolean flag)
	{
		mExpandedActionViewsExclusive = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #177 <Field boolean mExpandedActionViewsExclusive>
	//    3    5:return          
	}

	public void setItemLimit(int i)
	{
		mMaxItems = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #155 <Field int mMaxItems>
		mMaxItemsSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #318 <Field boolean mMaxItemsSet>
	//    6   10:return          
	}

	public void setMenuView(ActionMenuView actionmenuview)
	{
		mMenuView = ((MenuView) (actionmenuview));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #83  <Field MenuView mMenuView>
		actionmenuview.initialize(mMenu);
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #76  <Field MenuBuilder mMenu>
	//    6   10:invokevirtual   #445 <Method void ActionMenuView.initialize(MenuBuilder)>
	//    7   13:return          
	}

	public void setOverflowIcon(Drawable drawable)
	{
		OverflowMenuButton overflowmenubutton = mOverflowButton;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//    2    4:astore_2        
		if(overflowmenubutton != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
		{
			overflowmenubutton.setImageDrawable(drawable);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #332 <Method void ActionMenuPresenter$OverflowMenuButton.setImageDrawable(Drawable)>
			return;
	//    8   14:return          
		} else
		{
			mPendingOverflowIconSet = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #269 <Field boolean mPendingOverflowIconSet>
			mPendingOverflowIcon = drawable;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #271 <Field Drawable mPendingOverflowIcon>
			return;
	//   15   25:return          
		}
	}

	public void setReserveOverflow(boolean flag)
	{
		mReserveOverflow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #182 <Field boolean mReserveOverflow>
		mReserveOverflowSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #306 <Field boolean mReserveOverflowSet>
	//    6   10:return          
	}

	public void setWidthLimit(int i, boolean flag)
	{
		mWidthLimit = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #316 <Field int mWidthLimit>
		mStrictWidthLimit = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #187 <Field boolean mStrictWidthLimit>
		mWidthLimitSet = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #311 <Field boolean mWidthLimitSet>
	//    9   15:return          
	}

	public boolean shouldIncludeItem(int i, MenuItemImpl menuitemimpl)
	{
		return menuitemimpl.isActionButton();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #225 <Method boolean MenuItemImpl.isActionButton()>
	//    2    4:ireturn         
	}

	public boolean showOverflowMenu()
	{
		if(mReserveOverflow && !isOverflowMenuShowing() && mMenu != null && mMenuView != null && mPostedOpenRunnable == null && !mMenu.m().isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field boolean mReserveOverflow>
	//*   2    4:ifeq            104
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #351 <Method boolean isOverflowMenuShowing()>
	//*   5   11:ifne            104
	//*   6   14:aload_0         
	//*   7   15:getfield        #76  <Field MenuBuilder mMenu>
	//*   8   18:ifnull          104
	//*   9   21:aload_0         
	//*  10   22:getfield        #83  <Field MenuView mMenuView>
	//*  11   25:ifnull          104
	//*  12   28:aload_0         
	//*  13   29:getfield        #273 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
	//*  14   32:ifnonnull       104
	//*  15   35:aload_0         
	//*  16   36:getfield        #76  <Field MenuBuilder mMenu>
	//*  17   39:invokevirtual   #454 <Method ArrayList MenuBuilder.m()>
	//*  18   42:invokevirtual   #457 <Method boolean ArrayList.isEmpty()>
	//*  19   45:ifne            104
		{
			mPostedOpenRunnable = new ((OpenOverflowRunnable)this).OpenOverflowRunnable(new ((OverflowPopup)this).OverflowPopup(mContext, mMenu, ((View) (mOverflowButton)), true));
	//   20   48:aload_0         
	//   21   49:new             #459 <Class ActionMenuPresenter$OpenOverflowRunnable>
	//   22   52:dup             
	//   23   53:aload_0         
	//   24   54:new             #353 <Class ActionMenuPresenter$OverflowPopup>
	//   25   57:dup             
	//   26   58:aload_0         
	//   27   59:aload_0         
	//   28   60:getfield        #368 <Field Context mContext>
	//   29   63:aload_0         
	//   30   64:getfield        #76  <Field MenuBuilder mMenu>
	//   31   67:aload_0         
	//   32   68:getfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//   33   71:iconst_1        
	//   34   72:invokespecial   #462 <Method void ActionMenuPresenter$OverflowPopup(ActionMenuPresenter, Context, MenuBuilder, View, boolean)>
	//   35   75:invokespecial   #465 <Method void ActionMenuPresenter$OpenOverflowRunnable(ActionMenuPresenter, ActionMenuPresenter$OverflowPopup)>
	//   36   78:putfield        #273 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
			((View)mMenuView).post(((Runnable) (mPostedOpenRunnable)));
	//   37   81:aload_0         
	//   38   82:getfield        #83  <Field MenuView mMenuView>
	//   39   85:checkcast       #201 <Class View>
	//   40   88:aload_0         
	//   41   89:getfield        #273 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
	//   42   92:invokevirtual   #468 <Method boolean View.post(Runnable)>
	//   43   95:pop             
			((BaseMenuPresenter)this).onSubMenuSelected(((a) (null)));
	//   44   96:aload_0         
	//   45   97:aconst_null     
	//   46   98:invokespecial   #434 <Method boolean BaseMenuPresenter.onSubMenuSelected(a)>
	//   47  101:pop             
			return true;
	//   48  102:iconst_1        
	//   49  103:ireturn         
		} else
		{
			return false;
	//   50  104:iconst_0        
	//   51  105:ireturn         
		}
	}

	public void updateMenuView(boolean flag)
	{
		((BaseMenuPresenter)this).updateMenuView(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #471 <Method void BaseMenuPresenter.updateMenuView(boolean)>
		((View)mMenuView).requestLayout();
	//    3    5:aload_0         
	//    4    6:getfield        #83  <Field MenuView mMenuView>
	//    5    9:checkcast       #201 <Class View>
	//    6   12:invokevirtual   #474 <Method void View.requestLayout()>
		Object obj = ((Object) (mMenu));
	//    7   15:aload_0         
	//    8   16:getfield        #76  <Field MenuBuilder mMenu>
	//    9   19:astore          5
		boolean flag2 = false;
	//   10   21:iconst_0        
	//   11   22:istore_3        
		if(obj != null)
	//*  12   23:aload           5
	//*  13   25:ifnull          84
		{
			obj = ((Object) (mMenu.l()));
	//   14   28:aload_0         
	//   15   29:getfield        #76  <Field MenuBuilder mMenu>
	//   16   32:invokevirtual   #477 <Method ArrayList MenuBuilder.l()>
	//   17   35:astore          5
			int j = ((ArrayList) (obj)).size();
	//   18   37:aload           5
	//   19   39:invokevirtual   #153 <Method int ArrayList.size()>
	//   20   42:istore          4
			for(int i = 0; i < j; i++)
	//*  21   44:iconst_0        
	//*  22   45:istore_2        
	//*  23   46:iload_2         
	//*  24   47:iload           4
	//*  25   49:icmpge          84
			{
				d d1 = ((MenuItemImpl)((ArrayList) (obj)).get(i)).getSupportActionProvider();
	//   26   52:aload           5
	//   27   54:iload_2         
	//   28   55:invokevirtual   #167 <Method Object ArrayList.get(int)>
	//   29   58:checkcast       #169 <Class MenuItemImpl>
	//   30   61:invokevirtual   #481 <Method d MenuItemImpl.getSupportActionProvider()>
	//   31   64:astore          6
				if(d1 != null)
	//*  32   66:aload           6
	//*  33   68:ifnull          77
					d1.setSubUiVisibilityListener(((e) (this)));
	//   34   71:aload           6
	//   35   73:aload_0         
	//   36   74:invokevirtual   #487 <Method void d.setSubUiVisibilityListener(e)>
			}

	//   37   77:iload_2         
	//   38   78:iconst_1        
	//   39   79:iadd            
	//   40   80:istore_2        
		}
	//*  41   81:goto            46
		if(mMenu != null)
	//*  42   84:aload_0         
	//*  43   85:getfield        #76  <Field MenuBuilder mMenu>
	//*  44   88:ifnull          103
			obj = ((Object) (mMenu.m()));
	//   45   91:aload_0         
	//   46   92:getfield        #76  <Field MenuBuilder mMenu>
	//   47   95:invokevirtual   #454 <Method ArrayList MenuBuilder.m()>
	//   48   98:astore          5
		else
	//*  49  100:goto            106
			obj = null;
	//   50  103:aconst_null     
	//   51  104:astore          5
		boolean flag1 = flag2;
	//   52  106:iload_3         
	//   53  107:istore_2        
		if(mReserveOverflow)
	//*  54  108:aload_0         
	//*  55  109:getfield        #182 <Field boolean mReserveOverflow>
	//*  56  112:ifeq            162
		{
			flag1 = flag2;
	//   57  115:iload_3         
	//   58  116:istore_2        
			if(obj != null)
	//*  59  117:aload           5
	//*  60  119:ifnull          162
			{
				int k = ((ArrayList) (obj)).size();
	//   61  122:aload           5
	//   62  124:invokevirtual   #153 <Method int ArrayList.size()>
	//   63  127:istore          4
				if(k == 1)
	//*  64  129:iload           4
	//*  65  131:iconst_1        
	//*  66  132:icmpne          153
				{
					flag1 = ((MenuItemImpl)((ArrayList) (obj)).get(0)).isActionViewExpanded() ^ true;
	//   67  135:aload           5
	//   68  137:iconst_0        
	//   69  138:invokevirtual   #167 <Method Object ArrayList.get(int)>
	//   70  141:checkcast       #169 <Class MenuItemImpl>
	//   71  144:invokevirtual   #180 <Method boolean MenuItemImpl.isActionViewExpanded()>
	//   72  147:iconst_1        
	//   73  148:ixor            
	//   74  149:istore_2        
				} else
	//*  75  150:goto            162
				{
					flag1 = flag2;
	//   76  153:iload_3         
	//   77  154:istore_2        
					if(k > 0)
	//*  78  155:iload           4
	//*  79  157:ifle            162
						flag1 = true;
	//   80  160:iconst_1        
	//   81  161:istore_2        
				}
			}
		}
		if(flag1)
	//*  82  162:iload_2         
	//*  83  163:ifeq            250
		{
			if(mOverflowButton == null)
	//*  84  166:aload_0         
	//*  85  167:getfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*  86  170:ifnonnull       189
				mOverflowButton = new ((OverflowMenuButton)this).OverflowMenuButton(mSystemContext);
	//   87  173:aload_0         
	//   88  174:new             #264 <Class ActionMenuPresenter$OverflowMenuButton>
	//   89  177:dup             
	//   90  178:aload_0         
	//   91  179:aload_0         
	//   92  180:getfield        #325 <Field Context mSystemContext>
	//   93  183:invokespecial   #328 <Method void ActionMenuPresenter$OverflowMenuButton(ActionMenuPresenter, Context)>
	//   94  186:putfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
			Object obj1 = ((Object) ((ViewGroup)mOverflowButton.getParent()));
	//   95  189:aload_0         
	//   96  190:getfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//   97  193:invokevirtual   #491 <Method android.view.ViewParent ActionMenuPresenter$OverflowMenuButton.getParent()>
	//   98  196:checkcast       #90  <Class ViewGroup>
	//   99  199:astore          5
			if(obj1 != mMenuView)
	//* 100  201:aload           5
	//* 101  203:aload_0         
	//* 102  204:getfield        #83  <Field MenuView mMenuView>
	//* 103  207:if_acmpeq       287
			{
				if(obj1 != null)
	//* 104  210:aload           5
	//* 105  212:ifnull          224
					((ViewGroup) (obj1)).removeView(((View) (mOverflowButton)));
	//  106  215:aload           5
	//  107  217:aload_0         
	//  108  218:getfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//  109  221:invokevirtual   #495 <Method void ViewGroup.removeView(View)>
				obj1 = ((Object) ((ActionMenuView)mMenuView));
	//  110  224:aload_0         
	//  111  225:getfield        #83  <Field MenuView mMenuView>
	//  112  228:checkcast       #112 <Class ActionMenuView>
	//  113  231:astore          5
				((ActionMenuView) (obj1)).addView(((View) (mOverflowButton)), ((android.view.ViewGroup.LayoutParams) (((ActionMenuView) (obj1)).generateOverflowButtonLayoutParams())));
	//  114  233:aload           5
	//  115  235:aload_0         
	//  116  236:getfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//  117  239:aload           5
	//  118  241:invokevirtual   #499 <Method ActionMenuView$LayoutParams ActionMenuView.generateOverflowButtonLayoutParams()>
	//  119  244:invokevirtual   #503 <Method void ActionMenuView.addView(View, android.view.ViewGroup$LayoutParams)>
			}
		} else
	//* 120  247:goto            287
		{
			OverflowMenuButton overflowmenubutton = mOverflowButton;
	//  121  250:aload_0         
	//  122  251:getfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//  123  254:astore          5
			if(overflowmenubutton != null && overflowmenubutton.getParent() == mMenuView)
	//* 124  256:aload           5
	//* 125  258:ifnull          287
	//* 126  261:aload           5
	//* 127  263:invokevirtual   #491 <Method android.view.ViewParent ActionMenuPresenter$OverflowMenuButton.getParent()>
	//* 128  266:aload_0         
	//* 129  267:getfield        #83  <Field MenuView mMenuView>
	//* 130  270:if_acmpne       287
				((ViewGroup)mMenuView).removeView(((View) (mOverflowButton)));
	//  131  273:aload_0         
	//  132  274:getfield        #83  <Field MenuView mMenuView>
	//  133  277:checkcast       #90  <Class ViewGroup>
	//  134  280:aload_0         
	//  135  281:getfield        #139 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//  136  284:invokevirtual   #495 <Method void ViewGroup.removeView(View)>
		}
		((ActionMenuView)mMenuView).setOverflowReserved(mReserveOverflow);
	//  137  287:aload_0         
	//  138  288:getfield        #83  <Field MenuView mMenuView>
	//  139  291:checkcast       #112 <Class ActionMenuView>
	//  140  294:aload_0         
	//  141  295:getfield        #182 <Field boolean mReserveOverflow>
	//  142  298:invokevirtual   #506 <Method void ActionMenuView.setOverflowReserved(boolean)>
	//  143  301:return          
	}

	private static final String TAG = "ActionMenuPresenter";
	private final SparseBooleanArray mActionButtonGroups = new SparseBooleanArray();
	ActionButtonSubmenu mActionButtonPopup;
	private int mActionItemWidthLimit;
	private boolean mExpandedActionViewsExclusive;
	private int mMaxItems;
	private boolean mMaxItemsSet;
	private int mMinCellSize;
	int mOpenSubMenuId;
	OverflowMenuButton mOverflowButton;
	OverflowPopup mOverflowPopup;
	private Drawable mPendingOverflowIcon;
	private boolean mPendingOverflowIconSet;
	private ActionMenuPopupCallback mPopupCallback;
	final PopupPresenterCallback mPopupPresenterCallback = new ((PopupPresenterCallback)this).PopupPresenterCallback();
	OpenOverflowRunnable mPostedOpenRunnable;
	private boolean mReserveOverflow;
	private boolean mReserveOverflowSet;
	private View mScrapActionButtonView;
	private boolean mStrictWidthLimit;
	private int mWidthLimit;
	private boolean mWidthLimitSet;


/*
	static MenuBuilder access$000(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.mMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

*/


/*
	static MenuBuilder access$100(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.mMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

*/


/*
	static MenuView access$200(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.mMenuView;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field MenuView mMenuView>
	//    2    4:areturn         
	}

*/


/*
	static MenuBuilder access$300(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.mMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

*/


/*
	static MenuBuilder access$400(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.mMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

*/


/*
	static MenuView access$500(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.mMenuView;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field MenuView mMenuView>
	//    2    4:areturn         
	}

*/

	private class PopupPresenterCallback
		implements android.support.v7.view.menu.MenuPresenter.Callback
	{

		public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
		{
			if(menubuilder instanceof a)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #20  <Class a>
		//*   2    4:ifeq            15
				menubuilder.q().b(false);
		//    3    7:aload_1         
		//    4    8:invokevirtual   #26  <Method MenuBuilder MenuBuilder.q()>
		//    5   11:iconst_0        
		//    6   12:invokevirtual   #30  <Method void MenuBuilder.b(boolean)>
			android.support.v7.view.menu.MenuPresenter.Callback callback = getCallback();
		//    7   15:aload_0         
		//    8   16:getfield        #12  <Field ActionMenuPresenter this$0>
		//    9   19:invokevirtual   #36  <Method android.support.v7.view.menu.MenuPresenter$Callback ActionMenuPresenter.getCallback()>
		//   10   22:astore_3        
			if(callback != null)
		//*  11   23:aload_3         
		//*  12   24:ifnull          35
				callback.onCloseMenu(menubuilder, flag);
		//   13   27:aload_3         
		//   14   28:aload_1         
		//   15   29:iload_2         
		//   16   30:invokeinterface #38  <Method void android.support.v7.view.menu.MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
		//   17   35:return          
		}

		public boolean onOpenSubMenu(MenuBuilder menubuilder)
		{
			boolean flag = false;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			if(menubuilder == null)
		//*   2    2:aload_1         
		//*   3    3:ifnonnull       8
				return false;
		//    4    6:iconst_0        
		//    5    7:ireturn         
			mOpenSubMenuId = ((a)menubuilder).getItem().getItemId();
		//    6    8:aload_0         
		//    7    9:getfield        #12  <Field ActionMenuPresenter this$0>
		//    8   12:aload_1         
		//    9   13:checkcast       #20  <Class a>
		//   10   16:invokevirtual   #44  <Method MenuItem a.getItem()>
		//   11   19:invokeinterface #50  <Method int MenuItem.getItemId()>
		//   12   24:putfield        #54  <Field int ActionMenuPresenter.mOpenSubMenuId>
			android.support.v7.view.menu.MenuPresenter.Callback callback = getCallback();
		//   13   27:aload_0         
		//   14   28:getfield        #12  <Field ActionMenuPresenter this$0>
		//   15   31:invokevirtual   #36  <Method android.support.v7.view.menu.MenuPresenter$Callback ActionMenuPresenter.getCallback()>
		//   16   34:astore_3        
			if(callback != null)
		//*  17   35:aload_3         
		//*  18   36:ifnull          47
				flag = callback.onOpenSubMenu(menubuilder);
		//   19   39:aload_3         
		//   20   40:aload_1         
		//   21   41:invokeinterface #56  <Method boolean android.support.v7.view.menu.MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
		//   22   46:istore_2        
			return flag;
		//   23   47:iload_2         
		//   24   48:ireturn         
		}

		final ActionMenuPresenter this$0;

		PopupPresenterCallback()
		{
			this$0 = ActionMenuPresenter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field ActionMenuPresenter this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class ActionMenuPopupCallback extends android.support.v7.view.menu.ActionMenuItemView.PopupCallback
	{

		public ShowableListMenu getPopup()
		{
			if(mActionButtonPopup != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #10  <Field ActionMenuPresenter this$0>
		//*   2    4:getfield        #22  <Field ActionMenuPresenter$ActionButtonSubmenu ActionMenuPresenter.mActionButtonPopup>
		//*   3    7:ifnull          21
				return ((ShowableListMenu) (mActionButtonPopup.getPopup()));
		//    4   10:aload_0         
		//    5   11:getfield        #10  <Field ActionMenuPresenter this$0>
		//    6   14:getfield        #22  <Field ActionMenuPresenter$ActionButtonSubmenu ActionMenuPresenter.mActionButtonPopup>
		//    7   17:invokevirtual   #27  <Method android.support.v7.view.menu.MenuPopup ActionMenuPresenter$ActionButtonSubmenu.getPopup()>
		//    8   20:areturn         
			else
				return null;
		//    9   21:aconst_null     
		//   10   22:areturn         
		}

		final ActionMenuPresenter this$0;

		ActionMenuPopupCallback()
		{
			this$0 = ActionMenuPresenter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field ActionMenuPresenter this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void android.support.v7.view.menu.ActionMenuItemView$PopupCallback()>
		//    5    9:return          
		}
	}


	private class OverflowMenuButton extends AppCompatImageView
		implements ActionMenuView.ActionMenuChildView
	{

		public boolean needsDividerAfter()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean needsDividerBefore()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean performClick()
		{
			if(((AppCompatImageView)this).performClick())
		//*   0    0:aload_0         
		//*   1    1:invokespecial   #65  <Method boolean AppCompatImageView.performClick()>
		//*   2    4:ifeq            9
			{
				return true;
		//    3    7:iconst_1        
		//    4    8:ireturn         
			} else
			{
				playSoundEffect(0);
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:invokevirtual   #68  <Method void playSoundEffect(int)>
				showOverflowMenu();
		//    8   14:aload_0         
		//    9   15:getfield        #14  <Field ActionMenuPresenter this$0>
		//   10   18:invokevirtual   #73  <Method boolean ActionMenuPresenter.showOverflowMenu()>
		//   11   21:pop             
				return true;
		//   12   22:iconst_1        
		//   13   23:ireturn         
			}
		}

		protected boolean setFrame(int i, int j, int k, int l)
		{
			boolean flag = ((AppCompatImageView)this).setFrame(i, j, k, l);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:iload           4
		//    5    6:invokespecial   #77  <Method boolean AppCompatImageView.setFrame(int, int, int, int)>
		//    6    9:istore          8
			Drawable drawable = getDrawable();
		//    7   11:aload_0         
		//    8   12:invokevirtual   #81  <Method Drawable getDrawable()>
		//    9   15:astore          9
			Drawable drawable1 = getBackground();
		//   10   17:aload_0         
		//   11   18:invokevirtual   #84  <Method Drawable getBackground()>
		//   12   21:astore          10
			if(drawable != null && drawable1 != null)
		//*  13   23:aload           9
		//*  14   25:ifnull          116
		//*  15   28:aload           10
		//*  16   30:ifnull          116
			{
				int i1 = getWidth();
		//   17   33:aload_0         
		//   18   34:invokevirtual   #88  <Method int getWidth()>
		//   19   37:istore          5
				j = getHeight();
		//   20   39:aload_0         
		//   21   40:invokevirtual   #91  <Method int getHeight()>
		//   22   43:istore_2        
				i = Math.max(i1, j) / 2;
		//   23   44:iload           5
		//   24   46:iload_2         
		//   25   47:invokestatic    #97  <Method int Math.max(int, int)>
		//   26   50:iconst_2        
		//   27   51:idiv            
		//   28   52:istore_1        
				int j1 = getPaddingLeft();
		//   29   53:aload_0         
		//   30   54:invokevirtual   #100 <Method int getPaddingLeft()>
		//   31   57:istore          6
				int k1 = getPaddingRight();
		//   32   59:aload_0         
		//   33   60:invokevirtual   #103 <Method int getPaddingRight()>
		//   34   63:istore          7
				k = getPaddingTop();
		//   35   65:aload_0         
		//   36   66:invokevirtual   #106 <Method int getPaddingTop()>
		//   37   69:istore_3        
				l = getPaddingBottom();
		//   38   70:aload_0         
		//   39   71:invokevirtual   #109 <Method int getPaddingBottom()>
		//   40   74:istore          4
				i1 = (i1 + (j1 - k1)) / 2;
		//   41   76:iload           5
		//   42   78:iload           6
		//   43   80:iload           7
		//   44   82:isub            
		//   45   83:iadd            
		//   46   84:iconst_2        
		//   47   85:idiv            
		//   48   86:istore          5
				j = (j + (k - l)) / 2;
		//   49   88:iload_2         
		//   50   89:iload_3         
		//   51   90:iload           4
		//   52   92:isub            
		//   53   93:iadd            
		//   54   94:iconst_2        
		//   55   95:idiv            
		//   56   96:istore_2        
				android.support.v4.graphics.drawable.a.a(drawable1, i1 - i, j - i, i1 + i, j + i);
		//   57   97:aload           10
		//   58   99:iload           5
		//   59  101:iload_1         
		//   60  102:isub            
		//   61  103:iload_2         
		//   62  104:iload_1         
		//   63  105:isub            
		//   64  106:iload           5
		//   65  108:iload_1         
		//   66  109:iadd            
		//   67  110:iload_2         
		//   68  111:iload_1         
		//   69  112:iadd            
		//   70  113:invokestatic    #115 <Method void android.support.v4.graphics.drawable.a.a(Drawable, int, int, int, int)>
			}
			return flag;
		//   71  116:iload           8
		//   72  118:ireturn         
		}

		private final float mTempPts[] = new float[2];
		final ActionMenuPresenter this$0;

		public OverflowMenuButton(Context context)
		{
			this$0 = ActionMenuPresenter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field ActionMenuPresenter this$0>
			super(context, ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionOverflowButtonStyle);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:aconst_null     
		//    6    8:getstatic       #20  <Field int android.support.v7.appcompat.R$attr.actionOverflowButtonStyle>
		//    7   11:invokespecial   #23  <Method void AppCompatImageView(Context, android.util.AttributeSet, int)>
		//    8   14:aload_0         
		//    9   15:iconst_2        
		//   10   16:newarray        float[]
		//   11   18:putfield        #25  <Field float[] mTempPts>
			setClickable(true);
		//   12   21:aload_0         
		//   13   22:iconst_1        
		//   14   23:invokevirtual   #29  <Method void setClickable(boolean)>
			setFocusable(true);
		//   15   26:aload_0         
		//   16   27:iconst_1        
		//   17   28:invokevirtual   #32  <Method void setFocusable(boolean)>
			setVisibility(0);
		//   18   31:aload_0         
		//   19   32:iconst_0        
		//   20   33:invokevirtual   #36  <Method void setVisibility(int)>
			setEnabled(true);
		//   21   36:aload_0         
		//   22   37:iconst_1        
		//   23   38:invokevirtual   #39  <Method void setEnabled(boolean)>
			TooltipCompat.setTooltipText(((View) (this)), getContentDescription());
		//   24   41:aload_0         
		//   25   42:aload_0         
		//   26   43:invokevirtual   #43  <Method CharSequence getContentDescription()>
		//   27   46:invokestatic    #49  <Method void TooltipCompat.setTooltipText(View, CharSequence)>
			class _cls1 extends ForwardingListener
			{

				public ShowableListMenu getPopup()
				{
					if(mOverflowPopup == null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #12  <Field ActionMenuPresenter$OverflowMenuButton this$1>
				//*   2    4:getfield        #25  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
				//*   3    7:getfield        #31  <Field ActionMenuPresenter$OverflowPopup ActionMenuPresenter.mOverflowPopup>
				//*   4   10:ifnonnull       15
						return null;
				//    5   13:aconst_null     
				//    6   14:areturn         
					else
						return ((ShowableListMenu) (mOverflowPopup.getPopup()));
				//    7   15:aload_0         
				//    8   16:getfield        #12  <Field ActionMenuPresenter$OverflowMenuButton this$1>
				//    9   19:getfield        #25  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
				//   10   22:getfield        #31  <Field ActionMenuPresenter$OverflowPopup ActionMenuPresenter.mOverflowPopup>
				//   11   25:invokevirtual   #36  <Method android.support.v7.view.menu.MenuPopup ActionMenuPresenter$OverflowPopup.getPopup()>
				//   12   28:areturn         
				}

				public boolean onForwardingStarted()
				{
					showOverflowMenu();
				//    0    0:aload_0         
				//    1    1:getfield        #12  <Field ActionMenuPresenter$OverflowMenuButton this$1>
				//    2    4:getfield        #25  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
				//    3    7:invokevirtual   #41  <Method boolean ActionMenuPresenter.showOverflowMenu()>
				//    4   10:pop             
					return true;
				//    5   11:iconst_1        
				//    6   12:ireturn         
				}

				public boolean onForwardingStopped()
				{
					if(mPostedOpenRunnable != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #12  <Field ActionMenuPresenter$OverflowMenuButton this$1>
				//*   2    4:getfield        #25  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
				//*   3    7:getfield        #46  <Field ActionMenuPresenter$OpenOverflowRunnable ActionMenuPresenter.mPostedOpenRunnable>
				//*   4   10:ifnull          15
					{
						return false;
				//    5   13:iconst_0        
				//    6   14:ireturn         
					} else
					{
						hideOverflowMenu();
				//    7   15:aload_0         
				//    8   16:getfield        #12  <Field ActionMenuPresenter$OverflowMenuButton this$1>
				//    9   19:getfield        #25  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
				//   10   22:invokevirtual   #49  <Method boolean ActionMenuPresenter.hideOverflowMenu()>
				//   11   25:pop             
						return true;
				//   12   26:iconst_1        
				//   13   27:ireturn         
					}
				}

				final OverflowMenuButton this$1;
				final ActionMenuPresenter val$this$0;

				_cls1(ActionMenuPresenter actionmenupresenter)
				{
					this$1 = OverflowMenuButton.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #12  <Field ActionMenuPresenter$OverflowMenuButton this$1>
					this$0 = actionmenupresenter;
				//    3    5:aload_0         
				//    4    6:aload_3         
				//    5    7:putfield        #14  <Field ActionMenuPresenter val$this$0>
					super(final_view);
				//    6   10:aload_0         
				//    7   11:aload_2         
				//    8   12:invokespecial   #17  <Method void ForwardingListener(View)>
				//    9   15:return          
				}

			}

			setOnTouchListener(((android.view.View.OnTouchListener) (new _cls1(ActionMenuPresenter.this))));
		//   28   49:aload_0         
		//   29   50:new             #51  <Class ActionMenuPresenter$OverflowMenuButton$1>
		//   30   53:dup             
		//   31   54:aload_0         
		//   32   55:aload_0         
		//   33   56:aload_1         
		//   34   57:invokespecial   #54  <Method void ActionMenuPresenter$OverflowMenuButton$1(ActionMenuPresenter$OverflowMenuButton, View, ActionMenuPresenter)>
		//   35   60:invokevirtual   #58  <Method void setOnTouchListener(android.view.View$OnTouchListener)>
		//   36   63:return          
		}
	}


	/* member class not found */
	class ActionButtonSubmenu {}


	private class SavedState
		implements Parcelable
	{

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			parcel.writeInt(openSubMenuId);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #30  <Field int openSubMenuId>
		//    3    5:invokevirtual   #37  <Method void Parcel.writeInt(int)>
		//    4    8:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new _cls1();
		public int openSubMenuId;

		static 
		{
			class _cls1
				implements android.os.Parcelable.Creator
			{

				public SavedState createFromParcel(Parcel parcel)
				{
					return new SavedState(parcel);
				//    0    0:new             #15  <Class ActionMenuPresenter$SavedState>
				//    1    3:dup             
				//    2    4:aload_1         
				//    3    5:invokespecial   #18  <Method void ActionMenuPresenter$SavedState(Parcel)>
				//    4    8:areturn         
				}

				public volatile Object createFromParcel(Parcel parcel)
				{
					return ((Object) (createFromParcel(parcel)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokevirtual   #21  <Method ActionMenuPresenter$SavedState createFromParcel(Parcel)>
				//    3    5:areturn         
				}

				public SavedState[] newArray(int i)
				{
					return new SavedState[i];
				//    0    0:iload_1         
				//    1    1:anewarray       SavedState[]
				//    2    4:areturn         
				}

				public volatile Object[] newArray(int i)
				{
					return ((Object []) (newArray(i)));
				//    0    0:aload_0         
				//    1    1:iload_1         
				//    2    2:invokevirtual   #26  <Method ActionMenuPresenter$SavedState[] newArray(int)>
				//    3    5:areturn         
				}

				_cls1()
				{
				//    0    0:aload_0         
				//    1    1:invokespecial   #10  <Method void Object()>
				//    2    4:return          
				}
			}

		//    0    0:new             #14  <Class ActionMenuPresenter$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void ActionMenuPresenter$SavedState$1()>
		//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}

		SavedState(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			openSubMenuId = parcel.readInt();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #28  <Method int Parcel.readInt()>
		//    5    9:putfield        #30  <Field int openSubMenuId>
		//    6   12:return          
		}
	}


}
