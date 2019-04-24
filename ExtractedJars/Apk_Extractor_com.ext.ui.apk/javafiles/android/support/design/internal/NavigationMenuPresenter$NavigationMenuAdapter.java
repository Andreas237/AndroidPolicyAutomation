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

private class NavigationMenuPresenter$NavigationMenuAdapter extends android.support.v7.widget.RecyclerView.Adapter
{

	private void appendTransparentIconIfMissing(int i, int j)
	{
		for(; i < j; i++)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpge          27
			(()mItems.get(i)).needsEmptyIcon = true;
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field ArrayList mItems>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//    7   13:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//    8   16:iconst_1        
	//    9   17:putfield        #60  <Field boolean NavigationMenuPresenter$NavigationMenuTextItem.needsEmptyIcon>

	//   10   20:iload_1         
	//   11   21:iconst_1        
	//   12   22:iadd            
	//   13   23:istore_1        
	//*  14   24:goto            0
	//   15   27:return          
	}

	private void prepareMenuItems()
	{
		if(mUpdateSuspended)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field boolean mUpdateSuspended>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mUpdateSuspended = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #62  <Field boolean mUpdateSuspended>
		mItems.clear();
	//    7   13:aload_0         
	//    8   14:getfield        #45  <Field ArrayList mItems>
	//    9   17:invokevirtual   #65  <Method void ArrayList.clear()>
		mItems.add(((Object) (new em())));
	//   10   20:aload_0         
	//   11   21:getfield        #45  <Field ArrayList mItems>
	//   12   24:new             #67  <Class NavigationMenuPresenter$NavigationMenuHeaderItem>
	//   13   27:dup             
	//   14   28:invokespecial   #68  <Method void NavigationMenuPresenter$NavigationMenuHeaderItem()>
	//   15   31:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
	//   16   34:pop             
		int j = -1;
	//   17   35:iconst_m1       
	//   18   36:istore_2        
		int i = 0;
	//   19   37:iconst_0        
	//   20   38:istore_1        
		boolean flag2 = false;
	//   21   39:iconst_0        
	//   22   40:istore          10
		int k1 = mMenu.getVisibleItems().size();
	//   23   42:aload_0         
	//   24   43:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   25   46:getfield        #76  <Field MenuBuilder NavigationMenuPresenter.mMenu>
	//   26   49:invokevirtual   #82  <Method ArrayList MenuBuilder.getVisibleItems()>
	//   27   52:invokevirtual   #86  <Method int ArrayList.size()>
	//   28   55:istore          7
		int i1 = 0;
	//   29   57:iconst_0        
	//   30   58:istore          5
		while(i1 < k1) 
	//*  31   60:iload           5
	//*  32   62:iload           7
	//*  33   64:icmpge          506
		{
			Object obj = ((Object) ((MenuItemImpl)mMenu.getVisibleItems().get(i1)));
	//   34   67:aload_0         
	//   35   68:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   36   71:getfield        #76  <Field MenuBuilder NavigationMenuPresenter.mMenu>
	//   37   74:invokevirtual   #82  <Method ArrayList MenuBuilder.getVisibleItems()>
	//   38   77:iload           5
	//   39   79:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//   40   82:checkcast       #88  <Class MenuItemImpl>
	//   41   85:astore          12
			if(((MenuItemImpl) (obj)).isChecked())
	//*  42   87:aload           12
	//*  43   89:invokevirtual   #92  <Method boolean MenuItemImpl.isChecked()>
	//*  44   92:ifeq            101
				setCheckedItem(((MenuItemImpl) (obj)));
	//   45   95:aload_0         
	//   46   96:aload           12
	//   47   98:invokevirtual   #96  <Method void setCheckedItem(MenuItemImpl)>
			if(((MenuItemImpl) (obj)).isCheckable())
	//*  48  101:aload           12
	//*  49  103:invokevirtual   #99  <Method boolean MenuItemImpl.isCheckable()>
	//*  50  106:ifeq            115
				((MenuItemImpl) (obj)).setExclusiveCheckable(false);
	//   51  109:aload           12
	//   52  111:iconst_0        
	//   53  112:invokevirtual   #103 <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
			int k;
			if(((MenuItemImpl) (obj)).hasSubMenu())
	//*  54  115:aload           12
	//*  55  117:invokevirtual   #106 <Method boolean MenuItemImpl.hasSubMenu()>
	//*  56  120:ifeq            356
			{
				SubMenu submenu = ((MenuItemImpl) (obj)).getSubMenu();
	//   57  123:aload           12
	//   58  125:invokevirtual   #110 <Method SubMenu MenuItemImpl.getSubMenu()>
	//   59  128:astore          13
				if(submenu.hasVisibleItems())
	//*  60  130:aload           13
	//*  61  132:invokeinterface #115 <Method boolean SubMenu.hasVisibleItems()>
	//*  62  137:ifeq            335
				{
					if(i1 != 0)
	//*  63  140:iload           5
	//*  64  142:ifeq            168
						mItems.add(((Object) (new rItem(mPaddingSeparator, 0))));
	//   65  145:aload_0         
	//   66  146:getfield        #45  <Field ArrayList mItems>
	//   67  149:new             #117 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
	//   68  152:dup             
	//   69  153:aload_0         
	//   70  154:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   71  157:getfield        #120 <Field int NavigationMenuPresenter.mPaddingSeparator>
	//   72  160:iconst_0        
	//   73  161:invokespecial   #122 <Method void NavigationMenuPresenter$NavigationMenuSeparatorItem(int, int)>
	//   74  164:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
	//   75  167:pop             
					mItems.add(((Object) (new (((MenuItemImpl) (obj))))));
	//   76  168:aload_0         
	//   77  169:getfield        #45  <Field ArrayList mItems>
	//   78  172:new             #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//   79  175:dup             
	//   80  176:aload           12
	//   81  178:invokespecial   #124 <Method void NavigationMenuPresenter$NavigationMenuTextItem(MenuItemImpl)>
	//   82  181:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
	//   83  184:pop             
					boolean flag = false;
	//   84  185:iconst_0        
	//   85  186:istore_3        
					int l1 = mItems.size();
	//   86  187:aload_0         
	//   87  188:getfield        #45  <Field ArrayList mItems>
	//   88  191:invokevirtual   #86  <Method int ArrayList.size()>
	//   89  194:istore          8
					int i2 = submenu.size();
	//   90  196:aload           13
	//   91  198:invokeinterface #125 <Method int SubMenu.size()>
	//   92  203:istore          9
					for(int j1 = 0; j1 < i2;)
	//*  93  205:iconst_0        
	//*  94  206:istore          6
	//*  95  208:iload           6
	//*  96  210:iload           9
	//*  97  212:icmpge          318
					{
						MenuItemImpl menuitemimpl = (MenuItemImpl)submenu.getItem(j1);
	//   98  215:aload           13
	//   99  217:iload           6
	//  100  219:invokeinterface #129 <Method android.view.MenuItem SubMenu.getItem(int)>
	//  101  224:checkcast       #88  <Class MenuItemImpl>
	//  102  227:astore          14
						boolean flag1 = flag;
	//  103  229:iload_3         
	//  104  230:istore          4
						if(menuitemimpl.isVisible())
	//* 105  232:aload           14
	//* 106  234:invokevirtual   #132 <Method boolean MenuItemImpl.isVisible()>
	//* 107  237:ifeq            306
						{
							flag1 = flag;
	//  108  240:iload_3         
	//  109  241:istore          4
							if(!flag)
	//* 110  243:iload_3         
	//* 111  244:ifne            261
							{
								flag1 = flag;
	//  112  247:iload_3         
	//  113  248:istore          4
								if(menuitemimpl.getIcon() != null)
	//* 114  250:aload           14
	//* 115  252:invokevirtual   #136 <Method Drawable MenuItemImpl.getIcon()>
	//* 116  255:ifnull          261
									flag1 = true;
	//  117  258:iconst_1        
	//  118  259:istore          4
							}
							if(menuitemimpl.isCheckable())
	//* 119  261:aload           14
	//* 120  263:invokevirtual   #99  <Method boolean MenuItemImpl.isCheckable()>
	//* 121  266:ifeq            275
								menuitemimpl.setExclusiveCheckable(false);
	//  122  269:aload           14
	//  123  271:iconst_0        
	//  124  272:invokevirtual   #103 <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
							if(((MenuItemImpl) (obj)).isChecked())
	//* 125  275:aload           12
	//* 126  277:invokevirtual   #92  <Method boolean MenuItemImpl.isChecked()>
	//* 127  280:ifeq            289
								setCheckedItem(((MenuItemImpl) (obj)));
	//  128  283:aload_0         
	//  129  284:aload           12
	//  130  286:invokevirtual   #96  <Method void setCheckedItem(MenuItemImpl)>
							mItems.add(((Object) (new (menuitemimpl))));
	//  131  289:aload_0         
	//  132  290:getfield        #45  <Field ArrayList mItems>
	//  133  293:new             #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//  134  296:dup             
	//  135  297:aload           14
	//  136  299:invokespecial   #124 <Method void NavigationMenuPresenter$NavigationMenuTextItem(MenuItemImpl)>
	//  137  302:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
	//  138  305:pop             
						}
						j1++;
	//  139  306:iload           6
	//  140  308:iconst_1        
	//  141  309:iadd            
	//  142  310:istore          6
						flag = flag1;
	//  143  312:iload           4
	//  144  314:istore_3        
					}

	//* 145  315:goto            208
					if(flag)
	//* 146  318:iload_3         
	//* 147  319:ifeq            335
						appendTransparentIconIfMissing(l1, mItems.size());
	//  148  322:aload_0         
	//  149  323:iload           8
	//  150  325:aload_0         
	//  151  326:getfield        #45  <Field ArrayList mItems>
	//  152  329:invokevirtual   #86  <Method int ArrayList.size()>
	//  153  332:invokespecial   #138 <Method void appendTransparentIconIfMissing(int, int)>
				}
				byte byte0 = ((byte) (j));
	//  154  335:iload_2         
	//  155  336:istore_3        
				j = i;
	//  156  337:iload_1         
	//  157  338:istore_2        
				i = ((int) (byte0));
	//  158  339:iload_3         
	//  159  340:istore_1        
			} else
	//* 160  341:iload           5
	//* 161  343:iconst_1        
	//* 162  344:iadd            
	//* 163  345:istore          5
	//* 164  347:iload_1         
	//* 165  348:istore_3        
	//* 166  349:iload_2         
	//* 167  350:istore_1        
	//* 168  351:iload_3         
	//* 169  352:istore_2        
	//* 170  353:goto            60
			{
				int l = ((MenuItemImpl) (obj)).getGroupId();
	//  171  356:aload           12
	//  172  358:invokevirtual   #141 <Method int MenuItemImpl.getGroupId()>
	//  173  361:istore_3        
				if(l != j)
	//* 174  362:iload_3         
	//* 175  363:iload_2         
	//* 176  364:icmpeq          475
				{
					j = mItems.size();
	//  177  367:aload_0         
	//  178  368:getfield        #45  <Field ArrayList mItems>
	//  179  371:invokevirtual   #86  <Method int ArrayList.size()>
	//  180  374:istore_2        
					boolean flag3;
					if(((MenuItemImpl) (obj)).getIcon() != null)
	//* 181  375:aload           12
	//* 182  377:invokevirtual   #136 <Method Drawable MenuItemImpl.getIcon()>
	//* 183  380:ifnull          469
						flag3 = true;
	//  184  383:iconst_1        
	//  185  384:istore          11
					else
	//* 186  386:iload           11
	//* 187  388:istore          10
	//* 188  390:iload_2         
	//* 189  391:istore_1        
	//* 190  392:iload           5
	//* 191  394:ifeq            434
	//* 192  397:iload_2         
	//* 193  398:iconst_1        
	//* 194  399:iadd            
	//* 195  400:istore_1        
	//* 196  401:aload_0         
	//* 197  402:getfield        #45  <Field ArrayList mItems>
	//* 198  405:new             #117 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
	//* 199  408:dup             
	//* 200  409:aload_0         
	//* 201  410:getfield        #37  <Field NavigationMenuPresenter this$0>
	//* 202  413:getfield        #120 <Field int NavigationMenuPresenter.mPaddingSeparator>
	//* 203  416:aload_0         
	//* 204  417:getfield        #37  <Field NavigationMenuPresenter this$0>
	//* 205  420:getfield        #120 <Field int NavigationMenuPresenter.mPaddingSeparator>
	//* 206  423:invokespecial   #122 <Method void NavigationMenuPresenter$NavigationMenuSeparatorItem(int, int)>
	//* 207  426:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
	//* 208  429:pop             
	//* 209  430:iload           11
	//* 210  432:istore          10
	//* 211  434:new             #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//* 212  437:dup             
	//* 213  438:aload           12
	//* 214  440:invokespecial   #124 <Method void NavigationMenuPresenter$NavigationMenuTextItem(MenuItemImpl)>
	//* 215  443:astore          12
	//* 216  445:aload           12
	//* 217  447:iload           10
	//* 218  449:putfield        #60  <Field boolean NavigationMenuPresenter$NavigationMenuTextItem.needsEmptyIcon>
	//* 219  452:aload_0         
	//* 220  453:getfield        #45  <Field ArrayList mItems>
	//* 221  456:aload           12
	//* 222  458:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
	//* 223  461:pop             
	//* 224  462:iload_1         
	//* 225  463:istore_2        
	//* 226  464:iload_3         
	//* 227  465:istore_1        
	//* 228  466:goto            341
						flag3 = false;
	//  229  469:iconst_0        
	//  230  470:istore          11
					flag2 = flag3;
					i = j;
					if(i1 != 0)
					{
						i = j + 1;
						mItems.add(((Object) (new rItem(mPaddingSeparator, mPaddingSeparator))));
						flag2 = flag3;
					}
				} else
	//* 231  472:goto            386
				if(!flag2 && ((MenuItemImpl) (obj)).getIcon() != null)
	//* 232  475:iload           10
	//* 233  477:ifne            512
	//* 234  480:aload           12
	//* 235  482:invokevirtual   #136 <Method Drawable MenuItemImpl.getIcon()>
	//* 236  485:ifnull          512
				{
					flag2 = true;
	//  237  488:iconst_1        
	//  238  489:istore          10
					appendTransparentIconIfMissing(i, mItems.size());
	//  239  491:aload_0         
	//  240  492:iload_1         
	//  241  493:aload_0         
	//  242  494:getfield        #45  <Field ArrayList mItems>
	//  243  497:invokevirtual   #86  <Method int ArrayList.size()>
	//  244  500:invokespecial   #138 <Method void appendTransparentIconIfMissing(int, int)>
				}
				obj = ((Object) (new (((MenuItemImpl) (obj)))));
				obj.needsEmptyIcon = flag2;
				mItems.add(obj);
				j = i;
				i = l;
			}
			i1++;
			k = i;
			i = j;
			j = k;
		}
	//* 245  503:goto            434
		mUpdateSuspended = false;
	//  246  506:aload_0         
	//  247  507:iconst_0        
	//  248  508:putfield        #62  <Field boolean mUpdateSuspended>
	//  249  511:return          
	//* 250  512:goto            434
	}

	public Bundle createInstanceState()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #145 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void Bundle()>
	//    3    7:astore          4
		if(mCheckedItem != null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #148 <Field MenuItemImpl mCheckedItem>
	//*   6   13:ifnull          30
			bundle.putInt("android:menu:checked", mCheckedItem.getItemId());
	//    7   16:aload           4
	//    8   18:ldc1            #15  <String "android:menu:checked">
	//    9   20:aload_0         
	//   10   21:getfield        #148 <Field MenuItemImpl mCheckedItem>
	//   11   24:invokevirtual   #151 <Method int MenuItemImpl.getItemId()>
	//   12   27:invokevirtual   #155 <Method void Bundle.putInt(String, int)>
		SparseArray sparsearray = new SparseArray();
	//   13   30:new             #157 <Class SparseArray>
	//   14   33:dup             
	//   15   34:invokespecial   #158 <Method void SparseArray()>
	//   16   37:astore          5
		int j = mItems.size();
	//   17   39:aload_0         
	//   18   40:getfield        #45  <Field ArrayList mItems>
	//   19   43:invokevirtual   #86  <Method int ArrayList.size()>
	//   20   46:istore_2        
		int i = 0;
	//   21   47:iconst_0        
	//   22   48:istore_1        
		while(i < j) 
	//*  23   49:iload_1         
	//*  24   50:iload_2         
	//*  25   51:icmpge          136
		{
			Object obj = ((Object) ((NavigationMenuPresenter.NavigationMenuItem)mItems.get(i)));
	//   26   54:aload_0         
	//   27   55:getfield        #45  <Field ArrayList mItems>
	//   28   58:iload_1         
	//   29   59:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//   30   62:checkcast       #160 <Class NavigationMenuPresenter$NavigationMenuItem>
	//   31   65:astore_3        
			if(!(obj instanceof ))
				continue;
	//   32   66:aload_3         
	//   33   67:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//   34   70:ifeq            124
			MenuItemImpl menuitemimpl = (()obj).getMenuItem();
	//   35   73:aload_3         
	//   36   74:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//   37   77:invokevirtual   #164 <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
	//   38   80:astore          6
			if(menuitemimpl != null)
	//*  39   82:aload           6
	//*  40   84:ifnull          131
				obj = ((Object) (menuitemimpl.getActionView()));
	//   41   87:aload           6
	//   42   89:invokevirtual   #168 <Method View MenuItemImpl.getActionView()>
	//   43   92:astore_3        
			else
	//*  44   93:aload_3         
	//*  45   94:ifnull          124
	//*  46   97:new             #170 <Class ParcelableSparseArray>
	//*  47  100:dup             
	//*  48  101:invokespecial   #171 <Method void ParcelableSparseArray()>
	//*  49  104:astore          7
	//*  50  106:aload_3         
	//*  51  107:aload           7
	//*  52  109:invokevirtual   #177 <Method void View.saveHierarchyState(SparseArray)>
	//*  53  112:aload           5
	//*  54  114:aload           6
	//*  55  116:invokevirtual   #151 <Method int MenuItemImpl.getItemId()>
	//*  56  119:aload           7
	//*  57  121:invokevirtual   #181 <Method void SparseArray.put(int, Object)>
	//*  58  124:iload_1         
	//*  59  125:iconst_1        
	//*  60  126:iadd            
	//*  61  127:istore_1        
	//*  62  128:goto            49
				obj = null;
	//   63  131:aconst_null     
	//   64  132:astore_3        
			if(obj != null)
			{
				ParcelableSparseArray parcelablesparsearray = new ParcelableSparseArray();
				((View) (obj)).saveHierarchyState(((SparseArray) (parcelablesparsearray)));
				sparsearray.put(menuitemimpl.getItemId(), ((Object) (parcelablesparsearray)));
			}
			i++;
		}
	//*  65  133:goto            93
		bundle.putSparseParcelableArray("android:menu:action_views", sparsearray);
	//   66  136:aload           4
	//   67  138:ldc1            #12  <String "android:menu:action_views">
	//   68  140:aload           5
	//   69  142:invokevirtual   #185 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
		return bundle;
	//   70  145:aload           4
	//   71  147:areturn         
	}

	public int getItemCount()
	{
		return mItems.size();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ArrayList mItems>
	//    2    4:invokevirtual   #86  <Method int ArrayList.size()>
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
		NavigationMenuPresenter.NavigationMenuItem navigationmenuitem = (NavigationMenuPresenter.NavigationMenuItem)mItems.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ArrayList mItems>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #160 <Class NavigationMenuPresenter$NavigationMenuItem>
	//    5   11:astore_2        
		if(navigationmenuitem instanceof rItem)
	//*   6   12:aload_2         
	//*   7   13:instanceof      #117 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
	//*   8   16:ifeq            21
			return 2;
	//    9   19:iconst_2        
	//   10   20:ireturn         
		if(navigationmenuitem instanceof em)
	//*  11   21:aload_2         
	//*  12   22:instanceof      #67  <Class NavigationMenuPresenter$NavigationMenuHeaderItem>
	//*  13   25:ifeq            30
			return 3;
	//   14   28:iconst_3        
	//   15   29:ireturn         
		if(navigationmenuitem instanceof )
	//*  16   30:aload_2         
	//*  17   31:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//*  18   34:ifeq            54
			return !(()navigationmenuitem).getMenuItem().hasSubMenu() ? 0 : 1;
	//   19   37:aload_2         
	//   20   38:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//   21   41:invokevirtual   #164 <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
	//   22   44:invokevirtual   #106 <Method boolean MenuItemImpl.hasSubMenu()>
	//   23   47:ifeq            52
	//   24   50:iconst_1        
	//   25   51:ireturn         
	//   26   52:iconst_0        
	//   27   53:ireturn         
		else
			throw new RuntimeException("Unknown item type.");
	//   28   54:new             #191 <Class RuntimeException>
	//   29   57:dup             
	//   30   58:ldc1            #193 <String "Unknown item type.">
	//   31   60:invokespecial   #196 <Method void RuntimeException(String)>
	//   32   63:athrow          
	}

	public void onBindViewHolder(NavigationMenuPresenter.ViewHolder viewholder, int i)
	{
		switch(getItemViewType(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #200 <Method int getItemViewType(int)>
		{
	//*   3    5:tableswitch     0 2: default 32
	//	               0 33
	//	               1 158
	//	               2 186
		default:
			return;
	//    4   32:return          

		case 0: // '\0'
			NavigationMenuItemView navigationmenuitemview = (NavigationMenuItemView)viewholder.itemView;
	//    5   33:aload_1         
	//    6   34:getfield        #206 <Field View NavigationMenuPresenter$ViewHolder.itemView>
	//    7   37:checkcast       #208 <Class NavigationMenuItemView>
	//    8   40:astore_3        
			navigationmenuitemview.setIconTintList(mIconTintList);
	//    9   41:aload_3         
	//   10   42:aload_0         
	//   11   43:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   12   46:getfield        #212 <Field android.content.res.ColorStateList NavigationMenuPresenter.mIconTintList>
	//   13   49:invokevirtual   #216 <Method void NavigationMenuItemView.setIconTintList(android.content.res.ColorStateList)>
			if(mTextAppearanceSet)
	//*  14   52:aload_0         
	//*  15   53:getfield        #37  <Field NavigationMenuPresenter this$0>
	//*  16   56:getfield        #219 <Field boolean NavigationMenuPresenter.mTextAppearanceSet>
	//*  17   59:ifeq            73
				navigationmenuitemview.setTextAppearance(mTextAppearance);
	//   18   62:aload_3         
	//   19   63:aload_0         
	//   20   64:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   21   67:getfield        #222 <Field int NavigationMenuPresenter.mTextAppearance>
	//   22   70:invokevirtual   #226 <Method void NavigationMenuItemView.setTextAppearance(int)>
			if(mTextColor != null)
	//*  23   73:aload_0         
	//*  24   74:getfield        #37  <Field NavigationMenuPresenter this$0>
	//*  25   77:getfield        #229 <Field android.content.res.ColorStateList NavigationMenuPresenter.mTextColor>
	//*  26   80:ifnull          94
				navigationmenuitemview.setTextColor(mTextColor);
	//   27   83:aload_3         
	//   28   84:aload_0         
	//   29   85:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   30   88:getfield        #229 <Field android.content.res.ColorStateList NavigationMenuPresenter.mTextColor>
	//   31   91:invokevirtual   #232 <Method void NavigationMenuItemView.setTextColor(android.content.res.ColorStateList)>
			if(mItemBackground != null)
	//*  32   94:aload_0         
	//*  33   95:getfield        #37  <Field NavigationMenuPresenter this$0>
	//*  34   98:getfield        #236 <Field Drawable NavigationMenuPresenter.mItemBackground>
	//*  35  101:ifnull          153
				viewholder = ((NavigationMenuPresenter.ViewHolder) (mItemBackground.getConstantState().newDrawable()));
	//   36  104:aload_0         
	//   37  105:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   38  108:getfield        #236 <Field Drawable NavigationMenuPresenter.mItemBackground>
	//   39  111:invokevirtual   #242 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   40  114:invokevirtual   #247 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   41  117:astore_1        
			else
	//*  42  118:aload_3         
	//*  43  119:aload_1         
	//*  44  120:invokestatic    #253 <Method void ViewCompat.setBackground(View, Drawable)>
	//*  45  123:aload_0         
	//*  46  124:getfield        #45  <Field ArrayList mItems>
	//*  47  127:iload_2         
	//*  48  128:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//*  49  131:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//*  50  134:astore_1        
	//*  51  135:aload_3         
	//*  52  136:aload_1         
	//*  53  137:getfield        #60  <Field boolean NavigationMenuPresenter$NavigationMenuTextItem.needsEmptyIcon>
	//*  54  140:invokevirtual   #256 <Method void NavigationMenuItemView.setNeedsEmptyIcon(boolean)>
	//*  55  143:aload_3         
	//*  56  144:aload_1         
	//*  57  145:invokevirtual   #164 <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
	//*  58  148:iconst_0        
	//*  59  149:invokevirtual   #260 <Method void NavigationMenuItemView.initialize(MenuItemImpl, int)>
	//*  60  152:return          
				viewholder = null;
	//   61  153:aconst_null     
	//   62  154:astore_1        
			ViewCompat.setBackground(((View) (navigationmenuitemview)), ((Drawable) (viewholder)));
			viewholder = ((NavigationMenuPresenter.ViewHolder) (()mItems.get(i)));
			navigationmenuitemview.setNeedsEmptyIcon((() (viewholder)).needsEmptyIcon);
			navigationmenuitemview.initialize((() (viewholder)).getMenuItem(), 0);
			return;

	//*  63  155:goto            118
		case 1: // '\001'
			((TextView)viewholder.itemView).setText((()mItems.get(i)).getMenuItem().getTitle());
	//   64  158:aload_1         
	//   65  159:getfield        #206 <Field View NavigationMenuPresenter$ViewHolder.itemView>
	//   66  162:checkcast       #262 <Class TextView>
	//   67  165:aload_0         
	//   68  166:getfield        #45  <Field ArrayList mItems>
	//   69  169:iload_2         
	//   70  170:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//   71  173:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//   72  176:invokevirtual   #164 <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
	//   73  179:invokevirtual   #266 <Method CharSequence MenuItemImpl.getTitle()>
	//   74  182:invokevirtual   #270 <Method void TextView.setText(CharSequence)>
			return;
	//   75  185:return          

		case 2: // '\002'
			rItem ritem = (rItem)mItems.get(i);
	//   76  186:aload_0         
	//   77  187:getfield        #45  <Field ArrayList mItems>
	//   78  190:iload_2         
	//   79  191:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//   80  194:checkcast       #117 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
	//   81  197:astore_3        
			viewholder.itemView.setPadding(0, ritem.getPaddingTop(), 0, ritem.getPaddingBottom());
	//   82  198:aload_1         
	//   83  199:getfield        #206 <Field View NavigationMenuPresenter$ViewHolder.itemView>
	//   84  202:iconst_0        
	//   85  203:aload_3         
	//   86  204:invokevirtual   #273 <Method int NavigationMenuPresenter$NavigationMenuSeparatorItem.getPaddingTop()>
	//   87  207:iconst_0        
	//   88  208:aload_3         
	//   89  209:invokevirtual   #276 <Method int NavigationMenuPresenter$NavigationMenuSeparatorItem.getPaddingBottom()>
	//   90  212:invokevirtual   #280 <Method void View.setPadding(int, int, int, int)>
			return;
	//   91  215:return          
		}
	}

	public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		onBindViewHolder((NavigationMenuPresenter.ViewHolder)viewholder, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #202 <Class NavigationMenuPresenter$ViewHolder>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #283 <Method void onBindViewHolder(NavigationMenuPresenter$ViewHolder, int)>
	//    5    9:return          
	}

	public NavigationMenuPresenter.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		switch(i)
	//*   0    0:iload_2         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 34
	//	               1 57
	//	               2 73
	//	               3 89
		default:
			return null;
	//    2   32:aconst_null     
	//    3   33:areturn         

		case 0: // '\0'
			return ((NavigationMenuPresenter.ViewHolder) (new NavigationMenuPresenter.NormalViewHolder(mLayoutInflater, viewgroup, mOnClickListener)));
	//    4   34:new             #287 <Class NavigationMenuPresenter$NormalViewHolder>
	//    5   37:dup             
	//    6   38:aload_0         
	//    7   39:getfield        #37  <Field NavigationMenuPresenter this$0>
	//    8   42:getfield        #291 <Field android.view.LayoutInflater NavigationMenuPresenter.mLayoutInflater>
	//    9   45:aload_1         
	//   10   46:aload_0         
	//   11   47:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   12   50:getfield        #295 <Field android.view.View$OnClickListener NavigationMenuPresenter.mOnClickListener>
	//   13   53:invokespecial   #298 <Method void NavigationMenuPresenter$NormalViewHolder(android.view.LayoutInflater, ViewGroup, android.view.View$OnClickListener)>
	//   14   56:areturn         

		case 1: // '\001'
			return ((NavigationMenuPresenter.ViewHolder) (new NavigationMenuPresenter.SubheaderViewHolder(mLayoutInflater, viewgroup)));
	//   15   57:new             #300 <Class NavigationMenuPresenter$SubheaderViewHolder>
	//   16   60:dup             
	//   17   61:aload_0         
	//   18   62:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   19   65:getfield        #291 <Field android.view.LayoutInflater NavigationMenuPresenter.mLayoutInflater>
	//   20   68:aload_1         
	//   21   69:invokespecial   #303 <Method void NavigationMenuPresenter$SubheaderViewHolder(android.view.LayoutInflater, ViewGroup)>
	//   22   72:areturn         

		case 2: // '\002'
			return ((NavigationMenuPresenter.ViewHolder) (new NavigationMenuPresenter.SeparatorViewHolder(mLayoutInflater, viewgroup)));
	//   23   73:new             #305 <Class NavigationMenuPresenter$SeparatorViewHolder>
	//   24   76:dup             
	//   25   77:aload_0         
	//   26   78:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   27   81:getfield        #291 <Field android.view.LayoutInflater NavigationMenuPresenter.mLayoutInflater>
	//   28   84:aload_1         
	//   29   85:invokespecial   #306 <Method void NavigationMenuPresenter$SeparatorViewHolder(android.view.LayoutInflater, ViewGroup)>
	//   30   88:areturn         

		case 3: // '\003'
			return ((NavigationMenuPresenter.ViewHolder) (new NavigationMenuPresenter.HeaderViewHolder(((View) (mHeaderLayout)))));
	//   31   89:new             #308 <Class NavigationMenuPresenter$HeaderViewHolder>
	//   32   92:dup             
	//   33   93:aload_0         
	//   34   94:getfield        #37  <Field NavigationMenuPresenter this$0>
	//   35   97:getfield        #312 <Field android.widget.LinearLayout NavigationMenuPresenter.mHeaderLayout>
	//   36  100:invokespecial   #315 <Method void NavigationMenuPresenter$HeaderViewHolder(View)>
	//   37  103:areturn         
		}
	}

	public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		return ((android.support.v7.widget.RecyclerView.ViewHolder) (onCreateViewHolder(viewgroup, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #318 <Method NavigationMenuPresenter$ViewHolder onCreateViewHolder(ViewGroup, int)>
	//    4    6:areturn         
	}

	public void onViewRecycled(NavigationMenuPresenter.ViewHolder viewholder)
	{
		if(viewholder instanceof NavigationMenuPresenter.NormalViewHolder)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #287 <Class NavigationMenuPresenter$NormalViewHolder>
	//*   2    4:ifeq            17
			((NavigationMenuItemView)viewholder.itemView).recycle();
	//    3    7:aload_1         
	//    4    8:getfield        #206 <Field View NavigationMenuPresenter$ViewHolder.itemView>
	//    5   11:checkcast       #208 <Class NavigationMenuItemView>
	//    6   14:invokevirtual   #323 <Method void NavigationMenuItemView.recycle()>
	//    7   17:return          
	}

	public volatile void onViewRecycled(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		onViewRecycled((NavigationMenuPresenter.ViewHolder)viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #202 <Class NavigationMenuPresenter$ViewHolder>
	//    3    5:invokevirtual   #326 <Method void onViewRecycled(NavigationMenuPresenter$ViewHolder)>
	//    4    8:return          
	}

	public void restoreInstanceState(Bundle bundle)
	{
		boolean flag;
		int j;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		j = bundle.getInt("android:menu:checked", 0);
	//    2    2:aload_1         
	//    3    3:ldc1            #15  <String "android:menu:checked">
	//    4    5:iconst_0        
	//    5    6:invokevirtual   #332 <Method int Bundle.getInt(String, int)>
	//    6    9:istore          4
		if(j == 0) goto _L2; else goto _L1
	//    7   11:iload           4
	//    8   13:ifeq            99
_L1:
		int i;
		int l;
		mUpdateSuspended = true;
	//    9   16:aload_0         
	//   10   17:iconst_1        
	//   11   18:putfield        #62  <Field boolean mUpdateSuspended>
		l = mItems.size();
	//   12   21:aload_0         
	//   13   22:getfield        #45  <Field ArrayList mItems>
	//   14   25:invokevirtual   #86  <Method int ArrayList.size()>
	//   15   28:istore          5
		i = 0;
	//   16   30:iconst_0        
	//   17   31:istore_2        
_L9:
		if(i >= l) goto _L4; else goto _L3
	//   18   32:iload_2         
	//   19   33:iload           5
	//   20   35:icmpge          90
_L3:
		Object obj = ((Object) ((NavigationMenuPresenter.NavigationMenuItem)mItems.get(i)));
	//   21   38:aload_0         
	//   22   39:getfield        #45  <Field ArrayList mItems>
	//   23   42:iload_2         
	//   24   43:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//   25   46:checkcast       #160 <Class NavigationMenuPresenter$NavigationMenuItem>
	//   26   49:astore          6
		if(!(obj instanceof )) goto _L6; else goto _L5
	//   27   51:aload           6
	//   28   53:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//   29   56:ifeq            155
_L5:
		obj = ((Object) ((()obj).getMenuItem()));
	//   30   59:aload           6
	//   31   61:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//   32   64:invokevirtual   #164 <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
	//   33   67:astore          6
		if(obj == null || ((MenuItemImpl) (obj)).getItemId() != j) goto _L6; else goto _L7
	//   34   69:aload           6
	//   35   71:ifnull          155
	//   36   74:aload           6
	//   37   76:invokevirtual   #151 <Method int MenuItemImpl.getItemId()>
	//   38   79:iload           4
	//   39   81:icmpne          155
_L7:
		setCheckedItem(((MenuItemImpl) (obj)));
	//   40   84:aload_0         
	//   41   85:aload           6
	//   42   87:invokevirtual   #96  <Method void setCheckedItem(MenuItemImpl)>
_L4:
		mUpdateSuspended = false;
	//   43   90:aload_0         
	//   44   91:iconst_0        
	//   45   92:putfield        #62  <Field boolean mUpdateSuspended>
		prepareMenuItems();
	//   46   95:aload_0         
	//   47   96:invokespecial   #48  <Method void prepareMenuItems()>
		  goto _L2
	//*  48   99:aload_1         
	//*  49  100:ldc1            #12  <String "android:menu:action_views">
	//*  50  102:invokevirtual   #336 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//*  51  105:astore_1        
	//*  52  106:aload_1         
	//*  53  107:ifnull          218
	//*  54  110:aload_0         
	//*  55  111:getfield        #45  <Field ArrayList mItems>
	//*  56  114:invokevirtual   #86  <Method int ArrayList.size()>
	//*  57  117:istore          4
	//*  58  119:iload_3         
	//*  59  120:istore_2        
	//*  60  121:iload_2         
	//*  61  122:iload           4
	//*  62  124:icmpge          218
	//*  63  127:aload_0         
	//*  64  128:getfield        #45  <Field ArrayList mItems>
	//*  65  131:iload_2         
	//*  66  132:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//*  67  135:checkcast       #160 <Class NavigationMenuPresenter$NavigationMenuItem>
	//*  68  138:astore          6
	//*  69  140:aload           6
	//*  70  142:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//*  71  145:ifne            162
	//*  72  148:iload_2         
	//*  73  149:iconst_1        
	//*  74  150:iadd            
	//*  75  151:istore_2        
	//*  76  152:goto            121
_L6:
		i++;
	//   77  155:iload_2         
	//   78  156:iconst_1        
	//   79  157:iadd            
	//   80  158:istore_2        
		continue; /* Loop/switch isn't completed */
	//   81  159:goto            32
_L2:
		bundle = ((Bundle) (bundle.getSparseParcelableArray("android:menu:action_views")));
		if(bundle != null)
		{
			int k = mItems.size();
			i = ((int) (flag));
			while(i < k) 
			{
				NavigationMenuPresenter.NavigationMenuItem navigationmenuitem = (NavigationMenuPresenter.NavigationMenuItem)mItems.get(i);
				if(navigationmenuitem instanceof )
				{
					Object obj1 = ((Object) ((()navigationmenuitem).getMenuItem()));
	//   82  162:aload           6
	//   83  164:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
	//   84  167:invokevirtual   #164 <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
	//   85  170:astore          7
					if(obj1 != null)
	//*  86  172:aload           7
	//*  87  174:ifnull          148
					{
						View view = ((MenuItemImpl) (obj1)).getActionView();
	//   88  177:aload           7
	//   89  179:invokevirtual   #168 <Method View MenuItemImpl.getActionView()>
	//   90  182:astore          6
						if(view != null)
	//*  91  184:aload           6
	//*  92  186:ifnull          148
						{
							obj1 = ((Object) ((ParcelableSparseArray)((SparseArray) (bundle)).get(((MenuItemImpl) (obj1)).getItemId())));
	//   93  189:aload_1         
	//   94  190:aload           7
	//   95  192:invokevirtual   #151 <Method int MenuItemImpl.getItemId()>
	//   96  195:invokevirtual   #337 <Method Object SparseArray.get(int)>
	//   97  198:checkcast       #170 <Class ParcelableSparseArray>
	//   98  201:astore          7
							if(obj1 != null)
	//*  99  203:aload           7
	//* 100  205:ifnull          148
								view.restoreHierarchyState(((SparseArray) (obj1)));
	//  101  208:aload           6
	//  102  210:aload           7
	//  103  212:invokevirtual   #340 <Method void View.restoreHierarchyState(SparseArray)>
						}
					}
				}
				i++;
			}
		}
	//* 104  215:goto            148
		return;
	//  105  218:return          
		if(true) goto _L9; else goto _L8
_L8:
	}

	public void setCheckedItem(MenuItemImpl menuitemimpl)
	{
		if(mCheckedItem == menuitemimpl || !menuitemimpl.isCheckable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field MenuItemImpl mCheckedItem>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       15
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #99  <Method boolean MenuItemImpl.isCheckable()>
	//*   6   12:ifne            16
			return;
	//    7   15:return          
		if(mCheckedItem != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #148 <Field MenuItemImpl mCheckedItem>
	//*  10   20:ifnull          32
			mCheckedItem.setChecked(false);
	//   11   23:aload_0         
	//   12   24:getfield        #148 <Field MenuItemImpl mCheckedItem>
	//   13   27:iconst_0        
	//   14   28:invokevirtual   #344 <Method android.view.MenuItem MenuItemImpl.setChecked(boolean)>
	//   15   31:pop             
		mCheckedItem = menuitemimpl;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:putfield        #148 <Field MenuItemImpl mCheckedItem>
		menuitemimpl.setChecked(true);
	//   19   37:aload_1         
	//   20   38:iconst_1        
	//   21   39:invokevirtual   #344 <Method android.view.MenuItem MenuItemImpl.setChecked(boolean)>
	//   22   42:pop             
	//   23   43:return          
	}

	public void setUpdateSuspended(boolean flag)
	{
		mUpdateSuspended = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field boolean mUpdateSuspended>
	//    3    5:return          
	}

	public void update()
	{
		prepareMenuItems();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void prepareMenuItems()>
		notifyDataSetChanged();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #349 <Method void notifyDataSetChanged()>
	//    4    8:return          
	}

	private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
	private static final String STATE_CHECKED_ITEM = "android:menu:checked";
	private static final int VIEW_TYPE_HEADER = 3;
	private static final int VIEW_TYPE_NORMAL = 0;
	private static final int VIEW_TYPE_SEPARATOR = 2;
	private static final int VIEW_TYPE_SUBHEADER = 1;
	private MenuItemImpl mCheckedItem;
	private final ArrayList mItems = new ArrayList();
	private boolean mUpdateSuspended;
	final NavigationMenuPresenter this$0;

	NavigationMenuPresenter$NavigationMenuAdapter()
	{
		this$0 = NavigationMenuPresenter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field NavigationMenuPresenter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #40  <Method void android.support.v7.widget.RecyclerView$Adapter()>
	//    5    9:aload_0         
	//    6   10:new             #42  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #43  <Method void ArrayList()>
	//    9   17:putfield        #45  <Field ArrayList mItems>
		prepareMenuItems();
	//   10   20:aload_0         
	//   11   21:invokespecial   #48  <Method void prepareMenuItems()>
	//   12   24:return          
	}
}
