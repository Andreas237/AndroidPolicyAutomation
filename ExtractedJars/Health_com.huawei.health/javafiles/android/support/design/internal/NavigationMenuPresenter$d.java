// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.util.SparseArray;
import android.view.*;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package android.support.design.internal:
//			NavigationMenuPresenter, ParcelableSparseArray, NavigationMenuItemView

class NavigationMenuPresenter$d extends android.support.v7.widget.RecyclerView.Adapter
{

	private void c()
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field boolean c>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		c = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #33  <Field boolean c>
		e.clear();
	//    7   13:aload_0         
	//    8   14:getfield        #28  <Field ArrayList e>
	//    9   17:invokevirtual   #36  <Method void ArrayList.clear()>
		e.add(((Object) (new NavigationMenuPresenter$e())));
	//   10   20:aload_0         
	//   11   21:getfield        #28  <Field ArrayList e>
	//   12   24:new             #38  <Class NavigationMenuPresenter$e>
	//   13   27:dup             
	//   14   28:invokespecial   #39  <Method void NavigationMenuPresenter$e()>
	//   15   31:invokevirtual   #43  <Method boolean ArrayList.add(Object)>
	//   16   34:pop             
		int i1 = -1;
	//   17   35:iconst_m1       
	//   18   36:istore          5
		int j = 0;
	//   19   38:iconst_0        
	//   20   39:istore_2        
		boolean flag3 = false;
	//   21   40:iconst_0        
	//   22   41:istore          11
		int l = 0;
	//   23   43:iconst_0        
	//   24   44:istore          4
		for(int k1 = a.mMenu.getVisibleItems().size(); l < k1;)
	//*  25   46:aload_0         
	//*  26   47:getfield        #20  <Field NavigationMenuPresenter a>
	//*  27   50:getfield        #47  <Field MenuBuilder NavigationMenuPresenter.mMenu>
	//*  28   53:invokevirtual   #53  <Method ArrayList MenuBuilder.getVisibleItems()>
	//*  29   56:invokevirtual   #57  <Method int ArrayList.size()>
	//*  30   59:istore          7
	//*  31   61:iload           4
	//*  32   63:iload           7
	//*  33   65:icmpge          516
		{
			Object obj = ((Object) ((MenuItemImpl)a.mMenu.getVisibleItems().get(l)));
	//   34   68:aload_0         
	//   35   69:getfield        #20  <Field NavigationMenuPresenter a>
	//   36   72:getfield        #47  <Field MenuBuilder NavigationMenuPresenter.mMenu>
	//   37   75:invokevirtual   #53  <Method ArrayList MenuBuilder.getVisibleItems()>
	//   38   78:iload           4
	//   39   80:invokevirtual   #61  <Method Object ArrayList.get(int)>
	//   40   83:checkcast       #63  <Class MenuItemImpl>
	//   41   86:astore          12
			if(((MenuItemImpl) (obj)).isChecked())
	//*  42   88:aload           12
	//*  43   90:invokevirtual   #67  <Method boolean MenuItemImpl.isChecked()>
	//*  44   93:ifeq            102
				d(((MenuItemImpl) (obj)));
	//   45   96:aload_0         
	//   46   97:aload           12
	//   47   99:invokevirtual   #70  <Method void d(MenuItemImpl)>
			if(((MenuItemImpl) (obj)).isCheckable())
	//*  48  102:aload           12
	//*  49  104:invokevirtual   #73  <Method boolean MenuItemImpl.isCheckable()>
	//*  50  107:ifeq            116
				((MenuItemImpl) (obj)).setExclusiveCheckable(false);
	//   51  110:aload           12
	//   52  112:iconst_0        
	//   53  113:invokevirtual   #77  <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
			int i;
			boolean flag2;
			if(((MenuItemImpl) (obj)).hasSubMenu())
	//*  54  116:aload           12
	//*  55  118:invokevirtual   #80  <Method boolean MenuItemImpl.hasSubMenu()>
	//*  56  121:ifeq            340
			{
				SubMenu submenu = ((MenuItemImpl) (obj)).getSubMenu();
	//   57  124:aload           12
	//   58  126:invokevirtual   #84  <Method SubMenu MenuItemImpl.getSubMenu()>
	//   59  129:astore          13
				if(submenu.hasVisibleItems())
	//*  60  131:aload           13
	//*  61  133:invokeinterface #89  <Method boolean SubMenu.hasVisibleItems()>
	//*  62  138:ifeq            331
				{
					if(l != 0)
	//*  63  141:iload           4
	//*  64  143:ifeq            169
						e.add(((Object) (new NavigationMenuPresenter$a(a.mPaddingSeparator, 0))));
	//   65  146:aload_0         
	//   66  147:getfield        #28  <Field ArrayList e>
	//   67  150:new             #91  <Class NavigationMenuPresenter$a>
	//   68  153:dup             
	//   69  154:aload_0         
	//   70  155:getfield        #20  <Field NavigationMenuPresenter a>
	//   71  158:getfield        #95  <Field int NavigationMenuPresenter.mPaddingSeparator>
	//   72  161:iconst_0        
	//   73  162:invokespecial   #98  <Method void NavigationMenuPresenter$a(int, int)>
	//   74  165:invokevirtual   #43  <Method boolean ArrayList.add(Object)>
	//   75  168:pop             
					e.add(((Object) (new NavigationMenuPresenter$k(((MenuItemImpl) (obj))))));
	//   76  169:aload_0         
	//   77  170:getfield        #28  <Field ArrayList e>
	//   78  173:new             #100 <Class NavigationMenuPresenter$k>
	//   79  176:dup             
	//   80  177:aload           12
	//   81  179:invokespecial   #102 <Method void NavigationMenuPresenter$k(MenuItemImpl)>
	//   82  182:invokevirtual   #43  <Method boolean ArrayList.add(Object)>
	//   83  185:pop             
					boolean flag = false;
	//   84  186:iconst_0        
	//   85  187:istore_1        
					int l1 = e.size();
	//   86  188:aload_0         
	//   87  189:getfield        #28  <Field ArrayList e>
	//   88  192:invokevirtual   #57  <Method int ArrayList.size()>
	//   89  195:istore          8
					int j1 = 0;
	//   90  197:iconst_0        
	//   91  198:istore          6
					for(int i2 = submenu.size(); j1 < i2;)
	//*  92  200:aload           13
	//*  93  202:invokeinterface #103 <Method int SubMenu.size()>
	//*  94  207:istore          9
	//*  95  209:iload           6
	//*  96  211:iload           9
	//*  97  213:icmpge          314
					{
						MenuItemImpl menuitemimpl = (MenuItemImpl)submenu.getItem(j1);
	//   98  216:aload           13
	//   99  218:iload           6
	//  100  220:invokeinterface #107 <Method android.view.MenuItem SubMenu.getItem(int)>
	//  101  225:checkcast       #63  <Class MenuItemImpl>
	//  102  228:astore          14
						boolean flag1 = flag;
	//  103  230:iload_1         
	//  104  231:istore_3        
						if(menuitemimpl.isVisible())
	//* 105  232:aload           14
	//* 106  234:invokevirtual   #110 <Method boolean MenuItemImpl.isVisible()>
	//* 107  237:ifeq            303
						{
							flag1 = flag;
	//  108  240:iload_1         
	//  109  241:istore_3        
							if(!flag)
	//* 110  242:iload_1         
	//* 111  243:ifne            258
							{
								flag1 = flag;
	//  112  246:iload_1         
	//  113  247:istore_3        
								if(menuitemimpl.getIcon() != null)
	//* 114  248:aload           14
	//* 115  250:invokevirtual   #114 <Method Drawable MenuItemImpl.getIcon()>
	//* 116  253:ifnull          258
									flag1 = true;
	//  117  256:iconst_1        
	//  118  257:istore_3        
							}
							if(menuitemimpl.isCheckable())
	//* 119  258:aload           14
	//* 120  260:invokevirtual   #73  <Method boolean MenuItemImpl.isCheckable()>
	//* 121  263:ifeq            272
								menuitemimpl.setExclusiveCheckable(false);
	//  122  266:aload           14
	//  123  268:iconst_0        
	//  124  269:invokevirtual   #77  <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
							if(((MenuItemImpl) (obj)).isChecked())
	//* 125  272:aload           12
	//* 126  274:invokevirtual   #67  <Method boolean MenuItemImpl.isChecked()>
	//* 127  277:ifeq            286
								d(((MenuItemImpl) (obj)));
	//  128  280:aload_0         
	//  129  281:aload           12
	//  130  283:invokevirtual   #70  <Method void d(MenuItemImpl)>
							e.add(((Object) (new NavigationMenuPresenter$k(menuitemimpl))));
	//  131  286:aload_0         
	//  132  287:getfield        #28  <Field ArrayList e>
	//  133  290:new             #100 <Class NavigationMenuPresenter$k>
	//  134  293:dup             
	//  135  294:aload           14
	//  136  296:invokespecial   #102 <Method void NavigationMenuPresenter$k(MenuItemImpl)>
	//  137  299:invokevirtual   #43  <Method boolean ArrayList.add(Object)>
	//  138  302:pop             
						}
						j1++;
	//  139  303:iload           6
	//  140  305:iconst_1        
	//  141  306:iadd            
	//  142  307:istore          6
						flag = flag1;
	//  143  309:iload_3         
	//  144  310:istore_1        
					}

	//* 145  311:goto            209
					if(flag)
	//* 146  314:iload_1         
	//* 147  315:ifeq            331
						c(l1, e.size());
	//  148  318:aload_0         
	//  149  319:iload           8
	//  150  321:aload_0         
	//  151  322:getfield        #28  <Field ArrayList e>
	//  152  325:invokevirtual   #57  <Method int ArrayList.size()>
	//  153  328:invokespecial   #116 <Method void c(int, int)>
				}
				i = j;
	//  154  331:iload_2         
	//  155  332:istore_1        
				flag2 = flag3;
	//  156  333:iload           11
	//  157  335:istore          10
			} else
	//* 158  337:goto            501
			{
				int k = ((MenuItemImpl) (obj)).getGroupId();
	//  159  340:aload           12
	//  160  342:invokevirtual   #119 <Method int MenuItemImpl.getGroupId()>
	//  161  345:istore_3        
				if(k != i1)
	//* 162  346:iload_3         
	//* 163  347:iload           5
	//* 164  349:icmpeq          428
				{
					j = e.size();
	//  165  352:aload_0         
	//  166  353:getfield        #28  <Field ArrayList e>
	//  167  356:invokevirtual   #57  <Method int ArrayList.size()>
	//  168  359:istore_2        
					if(((MenuItemImpl) (obj)).getIcon() != null)
	//* 169  360:aload           12
	//* 170  362:invokevirtual   #114 <Method Drawable MenuItemImpl.getIcon()>
	//* 171  365:ifnull          374
						flag3 = true;
	//  172  368:iconst_1        
	//  173  369:istore          11
					else
	//* 174  371:goto            377
						flag3 = false;
	//  175  374:iconst_0        
	//  176  375:istore          11
					i = j;
	//  177  377:iload_2         
	//  178  378:istore_1        
					flag2 = flag3;
	//  179  379:iload           11
	//  180  381:istore          10
					if(l != 0)
	//* 181  383:iload           4
	//* 182  385:ifeq            470
					{
						i = j + 1;
	//  183  388:iload_2         
	//  184  389:iconst_1        
	//  185  390:iadd            
	//  186  391:istore_1        
						e.add(((Object) (new NavigationMenuPresenter$a(a.mPaddingSeparator, a.mPaddingSeparator))));
	//  187  392:aload_0         
	//  188  393:getfield        #28  <Field ArrayList e>
	//  189  396:new             #91  <Class NavigationMenuPresenter$a>
	//  190  399:dup             
	//  191  400:aload_0         
	//  192  401:getfield        #20  <Field NavigationMenuPresenter a>
	//  193  404:getfield        #95  <Field int NavigationMenuPresenter.mPaddingSeparator>
	//  194  407:aload_0         
	//  195  408:getfield        #20  <Field NavigationMenuPresenter a>
	//  196  411:getfield        #95  <Field int NavigationMenuPresenter.mPaddingSeparator>
	//  197  414:invokespecial   #98  <Method void NavigationMenuPresenter$a(int, int)>
	//  198  417:invokevirtual   #43  <Method boolean ArrayList.add(Object)>
	//  199  420:pop             
						flag2 = flag3;
	//  200  421:iload           11
	//  201  423:istore          10
					}
				} else
	//* 202  425:goto            470
				{
					i = j;
	//  203  428:iload_2         
	//  204  429:istore_1        
					flag2 = flag3;
	//  205  430:iload           11
	//  206  432:istore          10
					if(!flag3)
	//* 207  434:iload           11
	//* 208  436:ifne            470
					{
						i = j;
	//  209  439:iload_2         
	//  210  440:istore_1        
						flag2 = flag3;
	//  211  441:iload           11
	//  212  443:istore          10
						if(((MenuItemImpl) (obj)).getIcon() != null)
	//* 213  445:aload           12
	//* 214  447:invokevirtual   #114 <Method Drawable MenuItemImpl.getIcon()>
	//* 215  450:ifnull          470
						{
							flag2 = true;
	//  216  453:iconst_1        
	//  217  454:istore          10
							c(j, e.size());
	//  218  456:aload_0         
	//  219  457:iload_2         
	//  220  458:aload_0         
	//  221  459:getfield        #28  <Field ArrayList e>
	//  222  462:invokevirtual   #57  <Method int ArrayList.size()>
	//  223  465:invokespecial   #116 <Method void c(int, int)>
							i = j;
	//  224  468:iload_2         
	//  225  469:istore_1        
						}
					}
				}
				obj = ((Object) (new NavigationMenuPresenter$k(((MenuItemImpl) (obj)))));
	//  226  470:new             #100 <Class NavigationMenuPresenter$k>
	//  227  473:dup             
	//  228  474:aload           12
	//  229  476:invokespecial   #102 <Method void NavigationMenuPresenter$k(MenuItemImpl)>
	//  230  479:astore          12
				obj.d = flag2;
	//  231  481:aload           12
	//  232  483:iload           10
	//  233  485:putfield        #121 <Field boolean NavigationMenuPresenter$k.d>
				e.add(obj);
	//  234  488:aload_0         
	//  235  489:getfield        #28  <Field ArrayList e>
	//  236  492:aload           12
	//  237  494:invokevirtual   #43  <Method boolean ArrayList.add(Object)>
	//  238  497:pop             
				i1 = k;
	//  239  498:iload_3         
	//  240  499:istore          5
			}
			l++;
	//  241  501:iload           4
	//  242  503:iconst_1        
	//  243  504:iadd            
	//  244  505:istore          4
			j = i;
	//  245  507:iload_1         
	//  246  508:istore_2        
			flag3 = flag2;
	//  247  509:iload           10
	//  248  511:istore          11
		}

	//* 249  513:goto            61
		c = false;
	//  250  516:aload_0         
	//  251  517:iconst_0        
	//  252  518:putfield        #33  <Field boolean c>
	//  253  521:return          
	}

	private void c(int i, int j)
	{
		for(; i < j; i++)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpge          27
			((NavigationMenuPresenter$k)e.get(i)).d = true;
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field ArrayList e>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #61  <Method Object ArrayList.get(int)>
	//    7   13:checkcast       #100 <Class NavigationMenuPresenter$k>
	//    8   16:iconst_1        
	//    9   17:putfield        #121 <Field boolean NavigationMenuPresenter$k.d>

	//   10   20:iload_1         
	//   11   21:iconst_1        
	//   12   22:iadd            
	//   13   23:istore_1        
	//*  14   24:goto            0
	//   15   27:return          
	}

	public Bundle a()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #124 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #125 <Method void Bundle()>
	//    3    7:astore          4
		if(d != null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #127 <Field MenuItemImpl d>
	//*   6   13:ifnull          30
			bundle.putInt("android:menu:checked", d.getItemId());
	//    7   16:aload           4
	//    8   18:ldc1            #129 <String "android:menu:checked">
	//    9   20:aload_0         
	//   10   21:getfield        #127 <Field MenuItemImpl d>
	//   11   24:invokevirtual   #132 <Method int MenuItemImpl.getItemId()>
	//   12   27:invokevirtual   #136 <Method void Bundle.putInt(String, int)>
		SparseArray sparsearray = new SparseArray();
	//   13   30:new             #138 <Class SparseArray>
	//   14   33:dup             
	//   15   34:invokespecial   #139 <Method void SparseArray()>
	//   16   37:astore          5
		int i = 0;
	//   17   39:iconst_0        
	//   18   40:istore_1        
		for(int j = e.size(); i < j; i++)
	//*  19   41:aload_0         
	//*  20   42:getfield        #28  <Field ArrayList e>
	//*  21   45:invokevirtual   #57  <Method int ArrayList.size()>
	//*  22   48:istore_2        
	//*  23   49:iload_1         
	//*  24   50:iload_2         
	//*  25   51:icmpge          136
		{
			Object obj = ((Object) ((NavigationMenuPresenter$b)e.get(i)));
	//   26   54:aload_0         
	//   27   55:getfield        #28  <Field ArrayList e>
	//   28   58:iload_1         
	//   29   59:invokevirtual   #61  <Method Object ArrayList.get(int)>
	//   30   62:checkcast       #141 <Class NavigationMenuPresenter$b>
	//   31   65:astore_3        
			if(!(obj instanceof NavigationMenuPresenter$k))
				continue;
	//   32   66:aload_3         
	//   33   67:instanceof      #100 <Class NavigationMenuPresenter$k>
	//   34   70:ifeq            129
			MenuItemImpl menuitemimpl = ((NavigationMenuPresenter$k)obj).c();
	//   35   73:aload_3         
	//   36   74:checkcast       #100 <Class NavigationMenuPresenter$k>
	//   37   77:invokevirtual   #144 <Method MenuItemImpl NavigationMenuPresenter$k.c()>
	//   38   80:astore          6
			if(menuitemimpl != null)
	//*  39   82:aload           6
	//*  40   84:ifnull          96
				obj = ((Object) (menuitemimpl.getActionView()));
	//   41   87:aload           6
	//   42   89:invokevirtual   #148 <Method View MenuItemImpl.getActionView()>
	//   43   92:astore_3        
			else
	//*  44   93:goto            98
				obj = null;
	//   45   96:aconst_null     
	//   46   97:astore_3        
			if(obj != null)
	//*  47   98:aload_3         
	//*  48   99:ifnull          129
			{
				ParcelableSparseArray parcelablesparsearray = new ParcelableSparseArray();
	//   49  102:new             #150 <Class ParcelableSparseArray>
	//   50  105:dup             
	//   51  106:invokespecial   #151 <Method void ParcelableSparseArray()>
	//   52  109:astore          7
				((View) (obj)).saveHierarchyState(((SparseArray) (parcelablesparsearray)));
	//   53  111:aload_3         
	//   54  112:aload           7
	//   55  114:invokevirtual   #157 <Method void View.saveHierarchyState(SparseArray)>
				sparsearray.put(menuitemimpl.getItemId(), ((Object) (parcelablesparsearray)));
	//   56  117:aload           5
	//   57  119:aload           6
	//   58  121:invokevirtual   #132 <Method int MenuItemImpl.getItemId()>
	//   59  124:aload           7
	//   60  126:invokevirtual   #161 <Method void SparseArray.put(int, Object)>
			}
		}

	//   61  129:iload_1         
	//   62  130:iconst_1        
	//   63  131:iadd            
	//   64  132:istore_1        
	//*  65  133:goto            49
		bundle.putSparseParcelableArray("android:menu:action_views", sparsearray);
	//   66  136:aload           4
	//   67  138:ldc1            #163 <String "android:menu:action_views">
	//   68  140:aload           5
	//   69  142:invokevirtual   #167 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
		return bundle;
	//   70  145:aload           4
	//   71  147:areturn         
	}

	public void a(NavigationMenuPresenter$i navigationmenupresenter$i, int i)
	{
		switch(getItemViewType(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #172 <Method int getItemViewType(int)>
		{
	//*   3    5:tableswitch     0 3: default 36
	//	               0 37
	//	               1 162
	//	               2 190
	//	               3 219
		default:
			return;
	//    4   36:return          

		case 0: // '\0'
			NavigationMenuItemView navigationmenuitemview = (NavigationMenuItemView)navigationmenupresenter$i.itemView;
	//    5   37:aload_1         
	//    6   38:getfield        #178 <Field View NavigationMenuPresenter$i.itemView>
	//    7   41:checkcast       #180 <Class NavigationMenuItemView>
	//    8   44:astore_3        
			navigationmenuitemview.setIconTintList(a.mIconTintList);
	//    9   45:aload_3         
	//   10   46:aload_0         
	//   11   47:getfield        #20  <Field NavigationMenuPresenter a>
	//   12   50:getfield        #184 <Field android.content.res.ColorStateList NavigationMenuPresenter.mIconTintList>
	//   13   53:invokevirtual   #188 <Method void NavigationMenuItemView.setIconTintList(android.content.res.ColorStateList)>
			if(a.mTextAppearanceSet)
	//*  14   56:aload_0         
	//*  15   57:getfield        #20  <Field NavigationMenuPresenter a>
	//*  16   60:getfield        #191 <Field boolean NavigationMenuPresenter.mTextAppearanceSet>
	//*  17   63:ifeq            77
				navigationmenuitemview.setTextAppearance(a.mTextAppearance);
	//   18   66:aload_3         
	//   19   67:aload_0         
	//   20   68:getfield        #20  <Field NavigationMenuPresenter a>
	//   21   71:getfield        #194 <Field int NavigationMenuPresenter.mTextAppearance>
	//   22   74:invokevirtual   #198 <Method void NavigationMenuItemView.setTextAppearance(int)>
			if(a.mTextColor != null)
	//*  23   77:aload_0         
	//*  24   78:getfield        #20  <Field NavigationMenuPresenter a>
	//*  25   81:getfield        #201 <Field android.content.res.ColorStateList NavigationMenuPresenter.mTextColor>
	//*  26   84:ifnull          98
				navigationmenuitemview.setTextColor(a.mTextColor);
	//   27   87:aload_3         
	//   28   88:aload_0         
	//   29   89:getfield        #20  <Field NavigationMenuPresenter a>
	//   30   92:getfield        #201 <Field android.content.res.ColorStateList NavigationMenuPresenter.mTextColor>
	//   31   95:invokevirtual   #204 <Method void NavigationMenuItemView.setTextColor(android.content.res.ColorStateList)>
			if(a.mItemBackground != null)
	//*  32   98:aload_0         
	//*  33   99:getfield        #20  <Field NavigationMenuPresenter a>
	//*  34  102:getfield        #208 <Field Drawable NavigationMenuPresenter.mItemBackground>
	//*  35  105:ifnull          125
				navigationmenupresenter$i = ((NavigationMenuPresenter$i) (a.mItemBackground.getConstantState().newDrawable()));
	//   36  108:aload_0         
	//   37  109:getfield        #20  <Field NavigationMenuPresenter a>
	//   38  112:getfield        #208 <Field Drawable NavigationMenuPresenter.mItemBackground>
	//   39  115:invokevirtual   #214 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   40  118:invokevirtual   #219 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   41  121:astore_1        
			else
	//*  42  122:goto            127
				navigationmenupresenter$i = null;
	//   43  125:aconst_null     
	//   44  126:astore_1        
			ViewCompat.setBackground(((View) (navigationmenuitemview)), ((Drawable) (navigationmenupresenter$i)));
	//   45  127:aload_3         
	//   46  128:aload_1         
	//   47  129:invokestatic    #225 <Method void ViewCompat.setBackground(View, Drawable)>
			navigationmenupresenter$i = ((NavigationMenuPresenter$i) ((NavigationMenuPresenter$k)e.get(i)));
	//   48  132:aload_0         
	//   49  133:getfield        #28  <Field ArrayList e>
	//   50  136:iload_2         
	//   51  137:invokevirtual   #61  <Method Object ArrayList.get(int)>
	//   52  140:checkcast       #100 <Class NavigationMenuPresenter$k>
	//   53  143:astore_1        
			navigationmenuitemview.setNeedsEmptyIcon(((NavigationMenuPresenter$k) (navigationmenupresenter$i)).d);
	//   54  144:aload_3         
	//   55  145:aload_1         
	//   56  146:getfield        #121 <Field boolean NavigationMenuPresenter$k.d>
	//   57  149:invokevirtual   #228 <Method void NavigationMenuItemView.setNeedsEmptyIcon(boolean)>
			navigationmenuitemview.initialize(((NavigationMenuPresenter$k) (navigationmenupresenter$i)).c(), 0);
	//   58  152:aload_3         
	//   59  153:aload_1         
	//   60  154:invokevirtual   #144 <Method MenuItemImpl NavigationMenuPresenter$k.c()>
	//   61  157:iconst_0        
	//   62  158:invokevirtual   #232 <Method void NavigationMenuItemView.initialize(MenuItemImpl, int)>
			return;
	//   63  161:return          

		case 1: // '\001'
			((TextView)navigationmenupresenter$i.itemView).setText(((NavigationMenuPresenter$k)e.get(i)).c().getTitle());
	//   64  162:aload_1         
	//   65  163:getfield        #178 <Field View NavigationMenuPresenter$i.itemView>
	//   66  166:checkcast       #234 <Class TextView>
	//   67  169:aload_0         
	//   68  170:getfield        #28  <Field ArrayList e>
	//   69  173:iload_2         
	//   70  174:invokevirtual   #61  <Method Object ArrayList.get(int)>
	//   71  177:checkcast       #100 <Class NavigationMenuPresenter$k>
	//   72  180:invokevirtual   #144 <Method MenuItemImpl NavigationMenuPresenter$k.c()>
	//   73  183:invokevirtual   #238 <Method CharSequence MenuItemImpl.getTitle()>
	//   74  186:invokevirtual   #242 <Method void TextView.setText(CharSequence)>
			return;
	//   75  189:return          

		case 2: // '\002'
			NavigationMenuPresenter$a navigationmenupresenter$a = (NavigationMenuPresenter$a)e.get(i);
	//   76  190:aload_0         
	//   77  191:getfield        #28  <Field ArrayList e>
	//   78  194:iload_2         
	//   79  195:invokevirtual   #61  <Method Object ArrayList.get(int)>
	//   80  198:checkcast       #91  <Class NavigationMenuPresenter$a>
	//   81  201:astore_3        
			navigationmenupresenter$i.itemView.setPadding(0, navigationmenupresenter$a.d(), 0, navigationmenupresenter$a.c());
	//   82  202:aload_1         
	//   83  203:getfield        #178 <Field View NavigationMenuPresenter$i.itemView>
	//   84  206:iconst_0        
	//   85  207:aload_3         
	//   86  208:invokevirtual   #244 <Method int NavigationMenuPresenter$a.d()>
	//   87  211:iconst_0        
	//   88  212:aload_3         
	//   89  213:invokevirtual   #246 <Method int NavigationMenuPresenter$a.c()>
	//   90  216:invokevirtual   #250 <Method void View.setPadding(int, int, int, int)>
			// fall through

		case 3: // '\003'
			return;
	//   91  219:return          
		}
	}

	public void b()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void c()>
		notifyDataSetChanged();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #254 <Method void notifyDataSetChanged()>
	//    4    8:return          
	}

	public void c(NavigationMenuPresenter$i navigationmenupresenter$i)
	{
		if(navigationmenupresenter$i instanceof NavigationMenuPresenter$f)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #257 <Class NavigationMenuPresenter$f>
	//*   2    4:ifeq            17
			((NavigationMenuItemView)navigationmenupresenter$i.itemView).recycle();
	//    3    7:aload_1         
	//    4    8:getfield        #178 <Field View NavigationMenuPresenter$i.itemView>
	//    5   11:checkcast       #180 <Class NavigationMenuItemView>
	//    6   14:invokevirtual   #260 <Method void NavigationMenuItemView.recycle()>
	//    7   17:return          
	}

	public NavigationMenuPresenter$i d(ViewGroup viewgroup, int i)
	{
		switch(i)
	//*   0    0:iload_2         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 35
	//	               1 58
	//	               2 74
	//	               3 90
	//*   2   32:goto            105
		case 0: // '\0'
			return ((NavigationMenuPresenter$i) (new NavigationMenuPresenter$f(a.mLayoutInflater, viewgroup, a.mOnClickListener)));
	//    3   35:new             #257 <Class NavigationMenuPresenter$f>
	//    4   38:dup             
	//    5   39:aload_0         
	//    6   40:getfield        #20  <Field NavigationMenuPresenter a>
	//    7   43:getfield        #265 <Field android.view.LayoutInflater NavigationMenuPresenter.mLayoutInflater>
	//    8   46:aload_1         
	//    9   47:aload_0         
	//   10   48:getfield        #20  <Field NavigationMenuPresenter a>
	//   11   51:getfield        #269 <Field android.view.View$OnClickListener NavigationMenuPresenter.mOnClickListener>
	//   12   54:invokespecial   #272 <Method void NavigationMenuPresenter$f(android.view.LayoutInflater, ViewGroup, android.view.View$OnClickListener)>
	//   13   57:areturn         

		case 1: // '\001'
			return ((NavigationMenuPresenter$i) (new NavigationMenuPresenter$g(a.mLayoutInflater, viewgroup)));
	//   14   58:new             #274 <Class NavigationMenuPresenter$g>
	//   15   61:dup             
	//   16   62:aload_0         
	//   17   63:getfield        #20  <Field NavigationMenuPresenter a>
	//   18   66:getfield        #265 <Field android.view.LayoutInflater NavigationMenuPresenter.mLayoutInflater>
	//   19   69:aload_1         
	//   20   70:invokespecial   #277 <Method void NavigationMenuPresenter$g(android.view.LayoutInflater, ViewGroup)>
	//   21   73:areturn         

		case 2: // '\002'
			return ((NavigationMenuPresenter$i) (new NavigationMenuPresenter$h(a.mLayoutInflater, viewgroup)));
	//   22   74:new             #279 <Class NavigationMenuPresenter$h>
	//   23   77:dup             
	//   24   78:aload_0         
	//   25   79:getfield        #20  <Field NavigationMenuPresenter a>
	//   26   82:getfield        #265 <Field android.view.LayoutInflater NavigationMenuPresenter.mLayoutInflater>
	//   27   85:aload_1         
	//   28   86:invokespecial   #280 <Method void NavigationMenuPresenter$h(android.view.LayoutInflater, ViewGroup)>
	//   29   89:areturn         

		case 3: // '\003'
			return ((NavigationMenuPresenter$i) (new NavigationMenuPresenter$c(((View) (a.mHeaderLayout)))));
	//   30   90:new             #282 <Class NavigationMenuPresenter$c>
	//   31   93:dup             
	//   32   94:aload_0         
	//   33   95:getfield        #20  <Field NavigationMenuPresenter a>
	//   34   98:getfield        #286 <Field android.widget.LinearLayout NavigationMenuPresenter.mHeaderLayout>
	//   35  101:invokespecial   #289 <Method void NavigationMenuPresenter$c(View)>
	//   36  104:areturn         
		}
		return null;
	//   37  105:aconst_null     
	//   38  106:areturn         
	}

	public void d(MenuItemImpl menuitemimpl)
	{
		if(d == menuitemimpl || !menuitemimpl.isCheckable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field MenuItemImpl d>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       15
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #73  <Method boolean MenuItemImpl.isCheckable()>
	//*   6   12:ifne            16
			return;
	//    7   15:return          
		if(d != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #127 <Field MenuItemImpl d>
	//*  10   20:ifnull          32
			d.setChecked(false);
	//   11   23:aload_0         
	//   12   24:getfield        #127 <Field MenuItemImpl d>
	//   13   27:iconst_0        
	//   14   28:invokevirtual   #293 <Method android.view.MenuItem MenuItemImpl.setChecked(boolean)>
	//   15   31:pop             
		d = menuitemimpl;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:putfield        #127 <Field MenuItemImpl d>
		menuitemimpl.setChecked(true);
	//   19   37:aload_1         
	//   20   38:iconst_1        
	//   21   39:invokevirtual   #293 <Method android.view.MenuItem MenuItemImpl.setChecked(boolean)>
	//   22   42:pop             
	//   23   43:return          
	}

	public void d(boolean flag)
	{
		c = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field boolean c>
	//    3    5:return          
	}

	public void e(Bundle bundle)
	{
		int k = bundle.getInt("android:menu:checked", 0);
	//    0    0:aload_1         
	//    1    1:ldc1            #129 <String "android:menu:checked">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #298 <Method int Bundle.getInt(String, int)>
	//    4    7:istore_3        
		if(k != 0)
	//*   5    8:iload_3         
	//*   6    9:ifeq            104
		{
			c = true;
	//    7   12:aload_0         
	//    8   13:iconst_1        
	//    9   14:putfield        #33  <Field boolean c>
			int i = 0;
	//   10   17:iconst_0        
	//   11   18:istore_2        
			for(int i1 = e.size(); i < i1; i++)
	//*  12   19:aload_0         
	//*  13   20:getfield        #28  <Field ArrayList e>
	//*  14   23:invokevirtual   #57  <Method int ArrayList.size()>
	//*  15   26:istore          4
	//*  16   28:iload_2         
	//*  17   29:iload           4
	//*  18   31:icmpge          95
			{
				Object obj = ((Object) ((NavigationMenuPresenter$b)e.get(i)));
	//   19   34:aload_0         
	//   20   35:getfield        #28  <Field ArrayList e>
	//   21   38:iload_2         
	//   22   39:invokevirtual   #61  <Method Object ArrayList.get(int)>
	//   23   42:checkcast       #141 <Class NavigationMenuPresenter$b>
	//   24   45:astore          5
				if(!(obj instanceof NavigationMenuPresenter$k))
					continue;
	//   25   47:aload           5
	//   26   49:instanceof      #100 <Class NavigationMenuPresenter$k>
	//   27   52:ifeq            88
				obj = ((Object) (((NavigationMenuPresenter$k)obj).c()));
	//   28   55:aload           5
	//   29   57:checkcast       #100 <Class NavigationMenuPresenter$k>
	//   30   60:invokevirtual   #144 <Method MenuItemImpl NavigationMenuPresenter$k.c()>
	//   31   63:astore          5
				if(obj == null || ((MenuItemImpl) (obj)).getItemId() != k)
					continue;
	//   32   65:aload           5
	//   33   67:ifnull          88
	//   34   70:aload           5
	//   35   72:invokevirtual   #132 <Method int MenuItemImpl.getItemId()>
	//   36   75:iload_3         
	//   37   76:icmpne          88
				d(((MenuItemImpl) (obj)));
	//   38   79:aload_0         
	//   39   80:aload           5
	//   40   82:invokevirtual   #70  <Method void d(MenuItemImpl)>
				break;
	//   41   85:goto            95
			}

	//   42   88:iload_2         
	//   43   89:iconst_1        
	//   44   90:iadd            
	//   45   91:istore_2        
	//*  46   92:goto            28
			c = false;
	//   47   95:aload_0         
	//   48   96:iconst_0        
	//   49   97:putfield        #33  <Field boolean c>
			c();
	//   50  100:aload_0         
	//   51  101:invokespecial   #30  <Method void c()>
		}
		bundle = ((Bundle) (bundle.getSparseParcelableArray("android:menu:action_views")));
	//   52  104:aload_1         
	//   53  105:ldc1            #163 <String "android:menu:action_views">
	//   54  107:invokevirtual   #302 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//   55  110:astore_1        
		if(bundle != null)
	//*  56  111:aload_1         
	//*  57  112:ifnull          223
		{
			int j = 0;
	//   58  115:iconst_0        
	//   59  116:istore_2        
			for(int l = e.size(); j < l; j++)
	//*  60  117:aload_0         
	//*  61  118:getfield        #28  <Field ArrayList e>
	//*  62  121:invokevirtual   #57  <Method int ArrayList.size()>
	//*  63  124:istore_3        
	//*  64  125:iload_2         
	//*  65  126:iload_3         
	//*  66  127:icmpge          223
			{
				Object obj1 = ((Object) ((NavigationMenuPresenter$b)e.get(j)));
	//   67  130:aload_0         
	//   68  131:getfield        #28  <Field ArrayList e>
	//   69  134:iload_2         
	//   70  135:invokevirtual   #61  <Method Object ArrayList.get(int)>
	//   71  138:checkcast       #141 <Class NavigationMenuPresenter$b>
	//   72  141:astore          5
				if(!(obj1 instanceof NavigationMenuPresenter$k))
	//*  73  143:aload           5
	//*  74  145:instanceof      #100 <Class NavigationMenuPresenter$k>
	//*  75  148:ifne            154
					continue;
	//   76  151:goto            216
				Object obj2 = ((Object) (((NavigationMenuPresenter$k)obj1).c()));
	//   77  154:aload           5
	//   78  156:checkcast       #100 <Class NavigationMenuPresenter$k>
	//   79  159:invokevirtual   #144 <Method MenuItemImpl NavigationMenuPresenter$k.c()>
	//   80  162:astore          6
				if(obj2 == null)
	//*  81  164:aload           6
	//*  82  166:ifnonnull       172
					continue;
	//   83  169:goto            216
				obj1 = ((Object) (((MenuItemImpl) (obj2)).getActionView()));
	//   84  172:aload           6
	//   85  174:invokevirtual   #148 <Method View MenuItemImpl.getActionView()>
	//   86  177:astore          5
				if(obj1 == null)
	//*  87  179:aload           5
	//*  88  181:ifnonnull       187
					continue;
	//   89  184:goto            216
				obj2 = ((Object) ((ParcelableSparseArray)((SparseArray) (bundle)).get(((MenuItemImpl) (obj2)).getItemId())));
	//   90  187:aload_1         
	//   91  188:aload           6
	//   92  190:invokevirtual   #132 <Method int MenuItemImpl.getItemId()>
	//   93  193:invokevirtual   #303 <Method Object SparseArray.get(int)>
	//   94  196:checkcast       #150 <Class ParcelableSparseArray>
	//   95  199:astore          6
				if(obj2 != null)
	//*  96  201:aload           6
	//*  97  203:ifnonnull       209
	//*  98  206:goto            216
					((View) (obj1)).restoreHierarchyState(((SparseArray) (obj2)));
	//   99  209:aload           5
	//  100  211:aload           6
	//  101  213:invokevirtual   #306 <Method void View.restoreHierarchyState(SparseArray)>
			}

	//  102  216:iload_2         
	//  103  217:iconst_1        
	//  104  218:iadd            
	//  105  219:istore_2        
		}
	//* 106  220:goto            125
	//  107  223:return          
	}

	public int getItemCount()
	{
		return e.size();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ArrayList e>
	//    2    4:invokevirtual   #57  <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public long getItemId(int i)
	{
		return (long)i;
	//    0    0:iload_1         
	//    1    1:i2l             
	//    2    2:lreturn         
	}

	public int getItemViewType(int i)
	{
		NavigationMenuPresenter$b navigationmenupresenter$b = (NavigationMenuPresenter$b)e.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ArrayList e>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #61  <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #141 <Class NavigationMenuPresenter$b>
	//    5   11:astore_2        
		if(navigationmenupresenter$b instanceof NavigationMenuPresenter$a)
	//*   6   12:aload_2         
	//*   7   13:instanceof      #91  <Class NavigationMenuPresenter$a>
	//*   8   16:ifeq            21
			return 2;
	//    9   19:iconst_2        
	//   10   20:ireturn         
		if(navigationmenupresenter$b instanceof NavigationMenuPresenter$e)
	//*  11   21:aload_2         
	//*  12   22:instanceof      #38  <Class NavigationMenuPresenter$e>
	//*  13   25:ifeq            30
			return 3;
	//   14   28:iconst_3        
	//   15   29:ireturn         
		if(navigationmenupresenter$b instanceof NavigationMenuPresenter$k)
	//*  16   30:aload_2         
	//*  17   31:instanceof      #100 <Class NavigationMenuPresenter$k>
	//*  18   34:ifeq            54
			return !((NavigationMenuPresenter$k)navigationmenupresenter$b).c().hasSubMenu() ? 0 : 1;
	//   19   37:aload_2         
	//   20   38:checkcast       #100 <Class NavigationMenuPresenter$k>
	//   21   41:invokevirtual   #144 <Method MenuItemImpl NavigationMenuPresenter$k.c()>
	//   22   44:invokevirtual   #80  <Method boolean MenuItemImpl.hasSubMenu()>
	//   23   47:ifeq            52
	//   24   50:iconst_1        
	//   25   51:ireturn         
	//   26   52:iconst_0        
	//   27   53:ireturn         
		else
			throw new RuntimeException("Unknown item type.");
	//   28   54:new             #310 <Class RuntimeException>
	//   29   57:dup             
	//   30   58:ldc2            #312 <String "Unknown item type.">
	//   31   61:invokespecial   #315 <Method void RuntimeException(String)>
	//   32   64:athrow          
	}

	public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		a((NavigationMenuPresenter$i)viewholder, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #174 <Class NavigationMenuPresenter$i>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #319 <Method void a(NavigationMenuPresenter$i, int)>
	//    5    9:return          
	}

	public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		return ((android.support.v7.widget.RecyclerView.ViewHolder) (d(viewgroup, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #323 <Method NavigationMenuPresenter$i d(ViewGroup, int)>
	//    4    6:areturn         
	}

	public void onViewRecycled(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		c((NavigationMenuPresenter$i)viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #174 <Class NavigationMenuPresenter$i>
	//    3    5:invokevirtual   #327 <Method void c(NavigationMenuPresenter$i)>
	//    4    8:return          
	}

	final NavigationMenuPresenter a;
	private boolean c;
	private MenuItemImpl d;
	private final ArrayList e = new ArrayList();

	NavigationMenuPresenter$d(NavigationMenuPresenter navigationmenupresenter)
	{
		a = navigationmenupresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field NavigationMenuPresenter a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void android.support.v7.widget.RecyclerView$Adapter()>
	//    5    9:aload_0         
	//    6   10:new             #25  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #26  <Method void ArrayList()>
	//    9   17:putfield        #28  <Field ArrayList e>
		c();
	//   10   20:aload_0         
	//   11   21:invokespecial   #30  <Method void c()>
	//   12   24:return          
	}
}
