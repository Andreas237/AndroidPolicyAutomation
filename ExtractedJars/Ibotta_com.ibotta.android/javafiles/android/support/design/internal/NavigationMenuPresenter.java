// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.*;
import android.util.SparseArray;
import android.view.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package android.support.design.internal:
//			NavigationMenuView, ParcelableSparseArray, NavigationMenuItemView

public class NavigationMenuPresenter
	implements MenuPresenter
{
	private static class HeaderViewHolder extends ViewHolder
	{

		public HeaderViewHolder(View view)
		{
			super(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void NavigationMenuPresenter$ViewHolder(View)>
		//    3    5:return          
		}
	}

	private class NavigationMenuAdapter extends android.support.v7.widget.RecyclerView.Adapter
	{

		private void appendTransparentIconIfMissing(int i, int j)
		{
			for(; i < j; i++)
		//*   0    0:iload_1         
		//*   1    1:iload_2         
		//*   2    2:icmpge          27
				((NavigationMenuTextItem)items.get(i)).needsEmptyIcon = true;
		//    3    5:aload_0         
		//    4    6:getfield        #29  <Field ArrayList items>
		//    5    9:iload_1         
		//    6   10:invokevirtual   #39  <Method Object ArrayList.get(int)>
		//    7   13:checkcast       #41  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//    8   16:iconst_1        
		//    9   17:putfield        #44  <Field boolean NavigationMenuPresenter$NavigationMenuTextItem.needsEmptyIcon>

		//   10   20:iload_1         
		//   11   21:iconst_1        
		//   12   22:iadd            
		//   13   23:istore_1        
		//*  14   24:goto            0
		//   15   27:return          
		}

		private void prepareMenuItems()
		{
			if(updateSuspended)
		//*   0    0:aload_0         
		//*   1    1:getfield        #46  <Field boolean updateSuspended>
		//*   2    4:ifeq            8
				return;
		//    3    7:return          
			updateSuspended = true;
		//    4    8:aload_0         
		//    5    9:iconst_1        
		//    6   10:putfield        #46  <Field boolean updateSuspended>
			items.clear();
		//    7   13:aload_0         
		//    8   14:getfield        #29  <Field ArrayList items>
		//    9   17:invokevirtual   #49  <Method void ArrayList.clear()>
			items.add(((Object) (new NavigationMenuHeaderItem())));
		//   10   20:aload_0         
		//   11   21:getfield        #29  <Field ArrayList items>
		//   12   24:new             #51  <Class NavigationMenuPresenter$NavigationMenuHeaderItem>
		//   13   27:dup             
		//   14   28:invokespecial   #52  <Method void NavigationMenuPresenter$NavigationMenuHeaderItem()>
		//   15   31:invokevirtual   #56  <Method boolean ArrayList.add(Object)>
		//   16   34:pop             
			int l1 = menu.getVisibleItems().size();
		//   17   35:aload_0         
		//   18   36:getfield        #21  <Field NavigationMenuPresenter this$0>
		//   19   39:getfield        #60  <Field MenuBuilder NavigationMenuPresenter.menu>
		//   20   42:invokevirtual   #66  <Method ArrayList MenuBuilder.getVisibleItems()>
		//   21   45:invokevirtual   #70  <Method int ArrayList.size()>
		//   22   48:istore          7
			int i1 = 0;
		//   23   50:iconst_0        
		//   24   51:istore          4
			int j1 = -1;
		//   25   53:iconst_m1       
		//   26   54:istore          5
			boolean flag1 = false;
		//   27   56:iconst_0        
		//   28   57:istore          11
			int l;
			for(int k = 0; i1 < l1; k = l)
		//*  29   59:iconst_0        
		//*  30   60:istore_2        
		//*  31   61:iload           4
		//*  32   63:iload           7
		//*  33   65:icmpge          538
			{
				Object obj = ((Object) ((MenuItemImpl)menu.getVisibleItems().get(i1)));
		//   34   68:aload_0         
		//   35   69:getfield        #21  <Field NavigationMenuPresenter this$0>
		//   36   72:getfield        #60  <Field MenuBuilder NavigationMenuPresenter.menu>
		//   37   75:invokevirtual   #66  <Method ArrayList MenuBuilder.getVisibleItems()>
		//   38   78:iload           4
		//   39   80:invokevirtual   #39  <Method Object ArrayList.get(int)>
		//   40   83:checkcast       #72  <Class MenuItemImpl>
		//   41   86:astore          12
				if(((MenuItemImpl) (obj)).isChecked())
		//*  42   88:aload           12
		//*  43   90:invokevirtual   #76  <Method boolean MenuItemImpl.isChecked()>
		//*  44   93:ifeq            102
					setCheckedItem(((MenuItemImpl) (obj)));
		//   45   96:aload_0         
		//   46   97:aload           12
		//   47   99:invokevirtual   #80  <Method void setCheckedItem(MenuItemImpl)>
				if(((MenuItemImpl) (obj)).isCheckable())
		//*  48  102:aload           12
		//*  49  104:invokevirtual   #83  <Method boolean MenuItemImpl.isCheckable()>
		//*  50  107:ifeq            116
					((MenuItemImpl) (obj)).setExclusiveCheckable(false);
		//   51  110:aload           12
		//   52  112:iconst_0        
		//   53  113:invokevirtual   #87  <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
				int k1;
				boolean flag;
				if(((MenuItemImpl) (obj)).hasSubMenu())
		//*  54  116:aload           12
		//*  55  118:invokevirtual   #90  <Method boolean MenuItemImpl.hasSubMenu()>
		//*  56  121:ifeq            364
				{
					SubMenu submenu = ((MenuItemImpl) (obj)).getSubMenu();
		//   57  124:aload           12
		//   58  126:invokevirtual   #94  <Method SubMenu MenuItemImpl.getSubMenu()>
		//   59  129:astore          13
					k1 = j1;
		//   60  131:iload           5
		//   61  133:istore          6
					flag = flag1;
		//   62  135:iload           11
		//   63  137:istore          10
					l = k;
		//   64  139:iload_2         
		//   65  140:istore_3        
					if(submenu.hasVisibleItems())
		//*  66  141:aload           13
		//*  67  143:invokeinterface #99  <Method boolean SubMenu.hasVisibleItems()>
		//*  68  148:ifeq            519
					{
						if(i1 != 0)
		//*  69  151:iload           4
		//*  70  153:ifeq            179
							items.add(((Object) (new NavigationMenuSeparatorItem(paddingSeparator, 0))));
		//   71  156:aload_0         
		//   72  157:getfield        #29  <Field ArrayList items>
		//   73  160:new             #101 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
		//   74  163:dup             
		//   75  164:aload_0         
		//   76  165:getfield        #21  <Field NavigationMenuPresenter this$0>
		//   77  168:getfield        #105 <Field int NavigationMenuPresenter.paddingSeparator>
		//   78  171:iconst_0        
		//   79  172:invokespecial   #107 <Method void NavigationMenuPresenter$NavigationMenuSeparatorItem(int, int)>
		//   80  175:invokevirtual   #56  <Method boolean ArrayList.add(Object)>
		//   81  178:pop             
						items.add(((Object) (new NavigationMenuTextItem(((MenuItemImpl) (obj))))));
		//   82  179:aload_0         
		//   83  180:getfield        #29  <Field ArrayList items>
		//   84  183:new             #41  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   85  186:dup             
		//   86  187:aload           12
		//   87  189:invokespecial   #109 <Method void NavigationMenuPresenter$NavigationMenuTextItem(MenuItemImpl)>
		//   88  192:invokevirtual   #56  <Method boolean ArrayList.add(Object)>
		//   89  195:pop             
						int i2 = items.size();
		//   90  196:aload_0         
		//   91  197:getfield        #29  <Field ArrayList items>
		//   92  200:invokevirtual   #70  <Method int ArrayList.size()>
		//   93  203:istore          8
						int j2 = submenu.size();
		//   94  205:aload           13
		//   95  207:invokeinterface #110 <Method int SubMenu.size()>
		//   96  212:istore          9
						k1 = 0;
		//   97  214:iconst_0        
		//   98  215:istore          6
						int i;
						for(i = 0; k1 < j2; i = l)
		//*  99  217:iconst_0        
		//* 100  218:istore_1        
		//* 101  219:iload           6
		//* 102  221:iload           9
		//* 103  223:icmpge          324
						{
							MenuItemImpl menuitemimpl = (MenuItemImpl)submenu.getItem(k1);
		//  104  226:aload           13
		//  105  228:iload           6
		//  106  230:invokeinterface #114 <Method android.view.MenuItem SubMenu.getItem(int)>
		//  107  235:checkcast       #72  <Class MenuItemImpl>
		//  108  238:astore          14
							l = i;
		//  109  240:iload_1         
		//  110  241:istore_3        
							if(menuitemimpl.isVisible())
		//* 111  242:aload           14
		//* 112  244:invokevirtual   #117 <Method boolean MenuItemImpl.isVisible()>
		//* 113  247:ifeq            313
							{
								l = i;
		//  114  250:iload_1         
		//  115  251:istore_3        
								if(i == 0)
		//* 116  252:iload_1         
		//* 117  253:ifne            268
								{
									l = i;
		//  118  256:iload_1         
		//  119  257:istore_3        
									if(menuitemimpl.getIcon() != null)
		//* 120  258:aload           14
		//* 121  260:invokevirtual   #121 <Method Drawable MenuItemImpl.getIcon()>
		//* 122  263:ifnull          268
										l = 1;
		//  123  266:iconst_1        
		//  124  267:istore_3        
								}
								if(menuitemimpl.isCheckable())
		//* 125  268:aload           14
		//* 126  270:invokevirtual   #83  <Method boolean MenuItemImpl.isCheckable()>
		//* 127  273:ifeq            282
									menuitemimpl.setExclusiveCheckable(false);
		//  128  276:aload           14
		//  129  278:iconst_0        
		//  130  279:invokevirtual   #87  <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
								if(((MenuItemImpl) (obj)).isChecked())
		//* 131  282:aload           12
		//* 132  284:invokevirtual   #76  <Method boolean MenuItemImpl.isChecked()>
		//* 133  287:ifeq            296
									setCheckedItem(((MenuItemImpl) (obj)));
		//  134  290:aload_0         
		//  135  291:aload           12
		//  136  293:invokevirtual   #80  <Method void setCheckedItem(MenuItemImpl)>
								items.add(((Object) (new NavigationMenuTextItem(menuitemimpl))));
		//  137  296:aload_0         
		//  138  297:getfield        #29  <Field ArrayList items>
		//  139  300:new             #41  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//  140  303:dup             
		//  141  304:aload           14
		//  142  306:invokespecial   #109 <Method void NavigationMenuPresenter$NavigationMenuTextItem(MenuItemImpl)>
		//  143  309:invokevirtual   #56  <Method boolean ArrayList.add(Object)>
		//  144  312:pop             
							}
							k1++;
		//  145  313:iload           6
		//  146  315:iconst_1        
		//  147  316:iadd            
		//  148  317:istore          6
						}

		//  149  319:iload_3         
		//  150  320:istore_1        
		//* 151  321:goto            219
						k1 = j1;
		//  152  324:iload           5
		//  153  326:istore          6
						flag = flag1;
		//  154  328:iload           11
		//  155  330:istore          10
						l = k;
		//  156  332:iload_2         
		//  157  333:istore_3        
						if(i != 0)
		//* 158  334:iload_1         
		//* 159  335:ifeq            519
						{
							appendTransparentIconIfMissing(i2, items.size());
		//  160  338:aload_0         
		//  161  339:iload           8
		//  162  341:aload_0         
		//  163  342:getfield        #29  <Field ArrayList items>
		//  164  345:invokevirtual   #70  <Method int ArrayList.size()>
		//  165  348:invokespecial   #123 <Method void appendTransparentIconIfMissing(int, int)>
							k1 = j1;
		//  166  351:iload           5
		//  167  353:istore          6
							flag = flag1;
		//  168  355:iload           11
		//  169  357:istore          10
							l = k;
		//  170  359:iload_2         
		//  171  360:istore_3        
						}
					}
				} else
		//* 172  361:goto            519
				{
					k1 = ((MenuItemImpl) (obj)).getGroupId();
		//  173  364:aload           12
		//  174  366:invokevirtual   #126 <Method int MenuItemImpl.getGroupId()>
		//  175  369:istore          6
					int j;
					if(k1 != j1)
		//* 176  371:iload           6
		//* 177  373:iload           5
		//* 178  375:icmpeq          447
					{
						j = items.size();
		//  179  378:aload_0         
		//  180  379:getfield        #29  <Field ArrayList items>
		//  181  382:invokevirtual   #70  <Method int ArrayList.size()>
		//  182  385:istore_1        
						if(((MenuItemImpl) (obj)).getIcon() != null)
		//* 183  386:aload           12
		//* 184  388:invokevirtual   #121 <Method Drawable MenuItemImpl.getIcon()>
		//* 185  391:ifnull          400
							flag = true;
		//  186  394:iconst_1        
		//  187  395:istore          10
						else
		//* 188  397:goto            403
							flag = false;
		//  189  400:iconst_0        
		//  190  401:istore          10
						if(i1 != 0)
		//* 191  403:iload           4
		//* 192  405:ifeq            444
						{
							j++;
		//  193  408:iload_1         
		//  194  409:iconst_1        
		//  195  410:iadd            
		//  196  411:istore_1        
							items.add(((Object) (new NavigationMenuSeparatorItem(paddingSeparator, paddingSeparator))));
		//  197  412:aload_0         
		//  198  413:getfield        #29  <Field ArrayList items>
		//  199  416:new             #101 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
		//  200  419:dup             
		//  201  420:aload_0         
		//  202  421:getfield        #21  <Field NavigationMenuPresenter this$0>
		//  203  424:getfield        #105 <Field int NavigationMenuPresenter.paddingSeparator>
		//  204  427:aload_0         
		//  205  428:getfield        #21  <Field NavigationMenuPresenter this$0>
		//  206  431:getfield        #105 <Field int NavigationMenuPresenter.paddingSeparator>
		//  207  434:invokespecial   #107 <Method void NavigationMenuPresenter$NavigationMenuSeparatorItem(int, int)>
		//  208  437:invokevirtual   #56  <Method boolean ArrayList.add(Object)>
		//  209  440:pop             
						}
					} else
		//* 210  441:goto            489
		//* 211  444:goto            489
					{
						flag = flag1;
		//  212  447:iload           11
		//  213  449:istore          10
						j = k;
		//  214  451:iload_2         
		//  215  452:istore_1        
						if(!flag1)
		//* 216  453:iload           11
		//* 217  455:ifne            489
						{
							flag = flag1;
		//  218  458:iload           11
		//  219  460:istore          10
							j = k;
		//  220  462:iload_2         
		//  221  463:istore_1        
							if(((MenuItemImpl) (obj)).getIcon() != null)
		//* 222  464:aload           12
		//* 223  466:invokevirtual   #121 <Method Drawable MenuItemImpl.getIcon()>
		//* 224  469:ifnull          489
							{
								appendTransparentIconIfMissing(k, items.size());
		//  225  472:aload_0         
		//  226  473:iload_2         
		//  227  474:aload_0         
		//  228  475:getfield        #29  <Field ArrayList items>
		//  229  478:invokevirtual   #70  <Method int ArrayList.size()>
		//  230  481:invokespecial   #123 <Method void appendTransparentIconIfMissing(int, int)>
								flag = true;
		//  231  484:iconst_1        
		//  232  485:istore          10
								j = k;
		//  233  487:iload_2         
		//  234  488:istore_1        
							}
						}
					}
					obj = ((Object) (new NavigationMenuTextItem(((MenuItemImpl) (obj)))));
		//  235  489:new             #41  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//  236  492:dup             
		//  237  493:aload           12
		//  238  495:invokespecial   #109 <Method void NavigationMenuPresenter$NavigationMenuTextItem(MenuItemImpl)>
		//  239  498:astore          12
					obj.needsEmptyIcon = flag;
		//  240  500:aload           12
		//  241  502:iload           10
		//  242  504:putfield        #44  <Field boolean NavigationMenuPresenter$NavigationMenuTextItem.needsEmptyIcon>
					items.add(obj);
		//  243  507:aload_0         
		//  244  508:getfield        #29  <Field ArrayList items>
		//  245  511:aload           12
		//  246  513:invokevirtual   #56  <Method boolean ArrayList.add(Object)>
		//  247  516:pop             
					l = j;
		//  248  517:iload_1         
		//  249  518:istore_3        
				}
				i1++;
		//  250  519:iload           4
		//  251  521:iconst_1        
		//  252  522:iadd            
		//  253  523:istore          4
				j1 = k1;
		//  254  525:iload           6
		//  255  527:istore          5
				flag1 = flag;
		//  256  529:iload           10
		//  257  531:istore          11
			}

		//  258  533:iload_3         
		//  259  534:istore_2        
		//* 260  535:goto            61
			updateSuspended = false;
		//  261  538:aload_0         
		//  262  539:iconst_0        
		//  263  540:putfield        #46  <Field boolean updateSuspended>
		//  264  543:return          
		}

		public Bundle createInstanceState()
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #130 <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #131 <Method void Bundle()>
		//    3    7:astore          4
			MenuItemImpl menuitemimpl = checkedItem;
		//    4    9:aload_0         
		//    5   10:getfield        #133 <Field MenuItemImpl checkedItem>
		//    6   13:astore_3        
			if(menuitemimpl != null)
		//*   7   14:aload_3         
		//*   8   15:ifnull          29
				bundle.putInt("android:menu:checked", menuitemimpl.getItemId());
		//    9   18:aload           4
		//   10   20:ldc1            #135 <String "android:menu:checked">
		//   11   22:aload_3         
		//   12   23:invokevirtual   #138 <Method int MenuItemImpl.getItemId()>
		//   13   26:invokevirtual   #142 <Method void Bundle.putInt(String, int)>
			SparseArray sparsearray = new SparseArray();
		//   14   29:new             #144 <Class SparseArray>
		//   15   32:dup             
		//   16   33:invokespecial   #145 <Method void SparseArray()>
		//   17   36:astore          5
			int i = 0;
		//   18   38:iconst_0        
		//   19   39:istore_1        
			for(int j = items.size(); i < j; i++)
		//*  20   40:aload_0         
		//*  21   41:getfield        #29  <Field ArrayList items>
		//*  22   44:invokevirtual   #70  <Method int ArrayList.size()>
		//*  23   47:istore_2        
		//*  24   48:iload_1         
		//*  25   49:iload_2         
		//*  26   50:icmpge          135
			{
				Object obj = ((Object) ((NavigationMenuItem)items.get(i)));
		//   27   53:aload_0         
		//   28   54:getfield        #29  <Field ArrayList items>
		//   29   57:iload_1         
		//   30   58:invokevirtual   #39  <Method Object ArrayList.get(int)>
		//   31   61:checkcast       #147 <Class NavigationMenuPresenter$NavigationMenuItem>
		//   32   64:astore_3        
				if(!(obj instanceof NavigationMenuTextItem))
					continue;
		//   33   65:aload_3         
		//   34   66:instanceof      #41  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   35   69:ifeq            128
				MenuItemImpl menuitemimpl1 = ((NavigationMenuTextItem)obj).getMenuItem();
		//   36   72:aload_3         
		//   37   73:checkcast       #41  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   38   76:invokevirtual   #151 <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
		//   39   79:astore          6
				if(menuitemimpl1 != null)
		//*  40   81:aload           6
		//*  41   83:ifnull          95
					obj = ((Object) (menuitemimpl1.getActionView()));
		//   42   86:aload           6
		//   43   88:invokevirtual   #155 <Method View MenuItemImpl.getActionView()>
		//   44   91:astore_3        
				else
		//*  45   92:goto            97
					obj = null;
		//   46   95:aconst_null     
		//   47   96:astore_3        
				if(obj != null)
		//*  48   97:aload_3         
		//*  49   98:ifnull          128
				{
					ParcelableSparseArray parcelablesparsearray = new ParcelableSparseArray();
		//   50  101:new             #157 <Class ParcelableSparseArray>
		//   51  104:dup             
		//   52  105:invokespecial   #158 <Method void ParcelableSparseArray()>
		//   53  108:astore          7
					((View) (obj)).saveHierarchyState(((SparseArray) (parcelablesparsearray)));
		//   54  110:aload_3         
		//   55  111:aload           7
		//   56  113:invokevirtual   #164 <Method void View.saveHierarchyState(SparseArray)>
					sparsearray.put(menuitemimpl1.getItemId(), ((Object) (parcelablesparsearray)));
		//   57  116:aload           5
		//   58  118:aload           6
		//   59  120:invokevirtual   #138 <Method int MenuItemImpl.getItemId()>
		//   60  123:aload           7
		//   61  125:invokevirtual   #168 <Method void SparseArray.put(int, Object)>
				}
			}

		//   62  128:iload_1         
		//   63  129:iconst_1        
		//   64  130:iadd            
		//   65  131:istore_1        
		//*  66  132:goto            48
			bundle.putSparseParcelableArray("android:menu:action_views", sparsearray);
		//   67  135:aload           4
		//   68  137:ldc1            #170 <String "android:menu:action_views">
		//   69  139:aload           5
		//   70  141:invokevirtual   #174 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
			return bundle;
		//   71  144:aload           4
		//   72  146:areturn         
		}

		public MenuItemImpl getCheckedItem()
		{
			return checkedItem;
		//    0    0:aload_0         
		//    1    1:getfield        #133 <Field MenuItemImpl checkedItem>
		//    2    4:areturn         
		}

		public int getItemCount()
		{
			return items.size();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field ArrayList items>
		//    2    4:invokevirtual   #70  <Method int ArrayList.size()>
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
			NavigationMenuItem navigationmenuitem = (NavigationMenuItem)items.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field ArrayList items>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #39  <Method Object ArrayList.get(int)>
		//    4    8:checkcast       #147 <Class NavigationMenuPresenter$NavigationMenuItem>
		//    5   11:astore_2        
			if(navigationmenuitem instanceof NavigationMenuSeparatorItem)
		//*   6   12:aload_2         
		//*   7   13:instanceof      #101 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
		//*   8   16:ifeq            21
				return 2;
		//    9   19:iconst_2        
		//   10   20:ireturn         
			if(navigationmenuitem instanceof NavigationMenuHeaderItem)
		//*  11   21:aload_2         
		//*  12   22:instanceof      #51  <Class NavigationMenuPresenter$NavigationMenuHeaderItem>
		//*  13   25:ifeq            30
				return 3;
		//   14   28:iconst_3        
		//   15   29:ireturn         
			if(navigationmenuitem instanceof NavigationMenuTextItem)
		//*  16   30:aload_2         
		//*  17   31:instanceof      #41  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//*  18   34:ifeq            54
				return !((NavigationMenuTextItem)navigationmenuitem).getMenuItem().hasSubMenu() ? 0 : 1;
		//   19   37:aload_2         
		//   20   38:checkcast       #41  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   21   41:invokevirtual   #151 <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
		//   22   44:invokevirtual   #90  <Method boolean MenuItemImpl.hasSubMenu()>
		//   23   47:ifeq            52
		//   24   50:iconst_1        
		//   25   51:ireturn         
		//   26   52:iconst_0        
		//   27   53:ireturn         
			else
				throw new RuntimeException("Unknown item type.");
		//   28   54:new             #181 <Class RuntimeException>
		//   29   57:dup             
		//   30   58:ldc1            #183 <String "Unknown item type.">
		//   31   60:invokespecial   #186 <Method void RuntimeException(String)>
		//   32   63:athrow          
		}

		public void onBindViewHolder(ViewHolder viewholder, int i)
		{
			NavigationMenuItemView navigationmenuitemview;
			switch(getItemViewType(i))
		//*   0    0:aload_0         
		//*   1    1:iload_2         
		//*   2    2:invokevirtual   #190 <Method int getItemViewType(int)>
			{
		//*   3    5:tableswitch     0 2: default 32
		//		               0 91
		//		               1 63
		//		               2 33
			default:
				return;
		//    4   32:return          

			case 2: // '\002'
				NavigationMenuSeparatorItem navigationmenuseparatoritem = (NavigationMenuSeparatorItem)items.get(i);
		//    5   33:aload_0         
		//    6   34:getfield        #29  <Field ArrayList items>
		//    7   37:iload_2         
		//    8   38:invokevirtual   #39  <Method Object ArrayList.get(int)>
		//    9   41:checkcast       #101 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
		//   10   44:astore_3        
				viewholder.itemView.setPadding(0, navigationmenuseparatoritem.getPaddingTop(), 0, navigationmenuseparatoritem.getPaddingBottom());
		//   11   45:aload_1         
		//   12   46:getfield        #196 <Field View NavigationMenuPresenter$ViewHolder.itemView>
		//   13   49:iconst_0        
		//   14   50:aload_3         
		//   15   51:invokevirtual   #199 <Method int NavigationMenuPresenter$NavigationMenuSeparatorItem.getPaddingTop()>
		//   16   54:iconst_0        
		//   17   55:aload_3         
		//   18   56:invokevirtual   #202 <Method int NavigationMenuPresenter$NavigationMenuSeparatorItem.getPaddingBottom()>
		//   19   59:invokevirtual   #206 <Method void View.setPadding(int, int, int, int)>
				return;
		//   20   62:return          

			case 1: // '\001'
				((TextView)viewholder.itemView).setText(((NavigationMenuTextItem)items.get(i)).getMenuItem().getTitle());
		//   21   63:aload_1         
		//   22   64:getfield        #196 <Field View NavigationMenuPresenter$ViewHolder.itemView>
		//   23   67:checkcast       #208 <Class TextView>
		//   24   70:aload_0         
		//   25   71:getfield        #29  <Field ArrayList items>
		//   26   74:iload_2         
		//   27   75:invokevirtual   #39  <Method Object ArrayList.get(int)>
		//   28   78:checkcast       #41  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   29   81:invokevirtual   #151 <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
		//   30   84:invokevirtual   #212 <Method CharSequence MenuItemImpl.getTitle()>
		//   31   87:invokevirtual   #216 <Method void TextView.setText(CharSequence)>
				return;
		//   32   90:return          

			case 0: // '\0'
				navigationmenuitemview = (NavigationMenuItemView)viewholder.itemView;
		//   33   91:aload_1         
		//   34   92:getfield        #196 <Field View NavigationMenuPresenter$ViewHolder.itemView>
		//   35   95:checkcast       #218 <Class NavigationMenuItemView>
		//   36   98:astore_3        
				navigationmenuitemview.setIconTintList(iconTintList);
		//   37   99:aload_3         
		//   38  100:aload_0         
		//   39  101:getfield        #21  <Field NavigationMenuPresenter this$0>
		//   40  104:getfield        #222 <Field ColorStateList NavigationMenuPresenter.iconTintList>
		//   41  107:invokevirtual   #226 <Method void NavigationMenuItemView.setIconTintList(ColorStateList)>
				break;
			}
			if(textAppearanceSet)
		//*  42  110:aload_0         
		//*  43  111:getfield        #21  <Field NavigationMenuPresenter this$0>
		//*  44  114:getfield        #229 <Field boolean NavigationMenuPresenter.textAppearanceSet>
		//*  45  117:ifeq            131
				navigationmenuitemview.setTextAppearance(textAppearance);
		//   46  120:aload_3         
		//   47  121:aload_0         
		//   48  122:getfield        #21  <Field NavigationMenuPresenter this$0>
		//   49  125:getfield        #232 <Field int NavigationMenuPresenter.textAppearance>
		//   50  128:invokevirtual   #236 <Method void NavigationMenuItemView.setTextAppearance(int)>
			if(textColor != null)
		//*  51  131:aload_0         
		//*  52  132:getfield        #21  <Field NavigationMenuPresenter this$0>
		//*  53  135:getfield        #239 <Field ColorStateList NavigationMenuPresenter.textColor>
		//*  54  138:ifnull          152
				navigationmenuitemview.setTextColor(textColor);
		//   55  141:aload_3         
		//   56  142:aload_0         
		//   57  143:getfield        #21  <Field NavigationMenuPresenter this$0>
		//   58  146:getfield        #239 <Field ColorStateList NavigationMenuPresenter.textColor>
		//   59  149:invokevirtual   #242 <Method void NavigationMenuItemView.setTextColor(ColorStateList)>
			if(itemBackground != null)
		//*  60  152:aload_0         
		//*  61  153:getfield        #21  <Field NavigationMenuPresenter this$0>
		//*  62  156:getfield        #246 <Field Drawable NavigationMenuPresenter.itemBackground>
		//*  63  159:ifnull          179
				viewholder = ((ViewHolder) (itemBackground.getConstantState().newDrawable()));
		//   64  162:aload_0         
		//   65  163:getfield        #21  <Field NavigationMenuPresenter this$0>
		//   66  166:getfield        #246 <Field Drawable NavigationMenuPresenter.itemBackground>
		//   67  169:invokevirtual   #252 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
		//   68  172:invokevirtual   #257 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
		//   69  175:astore_1        
			else
		//*  70  176:goto            181
				viewholder = null;
		//   71  179:aconst_null     
		//   72  180:astore_1        
			ViewCompat.setBackground(((View) (navigationmenuitemview)), ((Drawable) (viewholder)));
		//   73  181:aload_3         
		//   74  182:aload_1         
		//   75  183:invokestatic    #263 <Method void ViewCompat.setBackground(View, Drawable)>
			viewholder = ((ViewHolder) ((NavigationMenuTextItem)items.get(i)));
		//   76  186:aload_0         
		//   77  187:getfield        #29  <Field ArrayList items>
		//   78  190:iload_2         
		//   79  191:invokevirtual   #39  <Method Object ArrayList.get(int)>
		//   80  194:checkcast       #41  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   81  197:astore_1        
			navigationmenuitemview.setNeedsEmptyIcon(((NavigationMenuTextItem) (viewholder)).needsEmptyIcon);
		//   82  198:aload_3         
		//   83  199:aload_1         
		//   84  200:getfield        #44  <Field boolean NavigationMenuPresenter$NavigationMenuTextItem.needsEmptyIcon>
		//   85  203:invokevirtual   #266 <Method void NavigationMenuItemView.setNeedsEmptyIcon(boolean)>
			navigationmenuitemview.setHorizontalPadding(itemHorizontalPadding);
		//   86  206:aload_3         
		//   87  207:aload_0         
		//   88  208:getfield        #21  <Field NavigationMenuPresenter this$0>
		//   89  211:getfield        #269 <Field int NavigationMenuPresenter.itemHorizontalPadding>
		//   90  214:invokevirtual   #272 <Method void NavigationMenuItemView.setHorizontalPadding(int)>
			navigationmenuitemview.setIconPadding(itemIconPadding);
		//   91  217:aload_3         
		//   92  218:aload_0         
		//   93  219:getfield        #21  <Field NavigationMenuPresenter this$0>
		//   94  222:getfield        #275 <Field int NavigationMenuPresenter.itemIconPadding>
		//   95  225:invokevirtual   #278 <Method void NavigationMenuItemView.setIconPadding(int)>
			navigationmenuitemview.initialize(((NavigationMenuTextItem) (viewholder)).getMenuItem(), 0);
		//   96  228:aload_3         
		//   97  229:aload_1         
		//   98  230:invokevirtual   #151 <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
		//   99  233:iconst_0        
		//  100  234:invokevirtual   #282 <Method void NavigationMenuItemView.initialize(MenuItemImpl, int)>
		//  101  237:return          
		}

		public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
		{
			onBindViewHolder((ViewHolder)viewholder, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #192 <Class NavigationMenuPresenter$ViewHolder>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #285 <Method void onBindViewHolder(NavigationMenuPresenter$ViewHolder, int)>
		//    5    9:return          
		}

		public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
		{
			switch(i)
		//*   0    0:iload_2         
			{
		//*   1    1:tableswitch     0 3: default 32
		//		               0 81
		//		               1 65
		//		               2 49
		//		               3 34
			default:
				return null;
		//    2   32:aconst_null     
		//    3   33:areturn         

			case 3: // '\003'
				return ((ViewHolder) (new HeaderViewHolder(((View) (headerLayout)))));
		//    4   34:new             #289 <Class NavigationMenuPresenter$HeaderViewHolder>
		//    5   37:dup             
		//    6   38:aload_0         
		//    7   39:getfield        #21  <Field NavigationMenuPresenter this$0>
		//    8   42:getfield        #293 <Field LinearLayout NavigationMenuPresenter.headerLayout>
		//    9   45:invokespecial   #296 <Method void NavigationMenuPresenter$HeaderViewHolder(View)>
		//   10   48:areturn         

			case 2: // '\002'
				return ((ViewHolder) (new SeparatorViewHolder(layoutInflater, viewgroup)));
		//   11   49:new             #298 <Class NavigationMenuPresenter$SeparatorViewHolder>
		//   12   52:dup             
		//   13   53:aload_0         
		//   14   54:getfield        #21  <Field NavigationMenuPresenter this$0>
		//   15   57:getfield        #302 <Field LayoutInflater NavigationMenuPresenter.layoutInflater>
		//   16   60:aload_1         
		//   17   61:invokespecial   #305 <Method void NavigationMenuPresenter$SeparatorViewHolder(LayoutInflater, ViewGroup)>
		//   18   64:areturn         

			case 1: // '\001'
				return ((ViewHolder) (new SubheaderViewHolder(layoutInflater, viewgroup)));
		//   19   65:new             #307 <Class NavigationMenuPresenter$SubheaderViewHolder>
		//   20   68:dup             
		//   21   69:aload_0         
		//   22   70:getfield        #21  <Field NavigationMenuPresenter this$0>
		//   23   73:getfield        #302 <Field LayoutInflater NavigationMenuPresenter.layoutInflater>
		//   24   76:aload_1         
		//   25   77:invokespecial   #308 <Method void NavigationMenuPresenter$SubheaderViewHolder(LayoutInflater, ViewGroup)>
		//   26   80:areturn         

			case 0: // '\0'
				return ((ViewHolder) (new NormalViewHolder(layoutInflater, viewgroup, onClickListener)));
		//   27   81:new             #310 <Class NavigationMenuPresenter$NormalViewHolder>
		//   28   84:dup             
		//   29   85:aload_0         
		//   30   86:getfield        #21  <Field NavigationMenuPresenter this$0>
		//   31   89:getfield        #302 <Field LayoutInflater NavigationMenuPresenter.layoutInflater>
		//   32   92:aload_1         
		//   33   93:aload_0         
		//   34   94:getfield        #21  <Field NavigationMenuPresenter this$0>
		//   35   97:getfield        #314 <Field android.view.View$OnClickListener NavigationMenuPresenter.onClickListener>
		//   36  100:invokespecial   #317 <Method void NavigationMenuPresenter$NormalViewHolder(LayoutInflater, ViewGroup, android.view.View$OnClickListener)>
		//   37  103:areturn         
			}
		}

		public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
		{
			return ((android.support.v7.widget.RecyclerView.ViewHolder) (onCreateViewHolder(viewgroup, i)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokevirtual   #320 <Method NavigationMenuPresenter$ViewHolder onCreateViewHolder(ViewGroup, int)>
		//    4    6:areturn         
		}

		public void onViewRecycled(ViewHolder viewholder)
		{
			if(viewholder instanceof NormalViewHolder)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #310 <Class NavigationMenuPresenter$NormalViewHolder>
		//*   2    4:ifeq            17
				((NavigationMenuItemView)viewholder.itemView).recycle();
		//    3    7:aload_1         
		//    4    8:getfield        #196 <Field View NavigationMenuPresenter$ViewHolder.itemView>
		//    5   11:checkcast       #218 <Class NavigationMenuItemView>
		//    6   14:invokevirtual   #325 <Method void NavigationMenuItemView.recycle()>
		//    7   17:return          
		}

		public volatile void onViewRecycled(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			onViewRecycled((ViewHolder)viewholder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #192 <Class NavigationMenuPresenter$ViewHolder>
		//    3    5:invokevirtual   #328 <Method void onViewRecycled(NavigationMenuPresenter$ViewHolder)>
		//    4    8:return          
		}

		public void restoreInstanceState(Bundle bundle)
		{
			boolean flag = false;
		//    0    0:iconst_0        
		//    1    1:istore_3        
			int k = bundle.getInt("android:menu:checked", 0);
		//    2    2:aload_1         
		//    3    3:ldc1            #135 <String "android:menu:checked">
		//    4    5:iconst_0        
		//    5    6:invokevirtual   #334 <Method int Bundle.getInt(String, int)>
		//    6    9:istore          4
			if(k != 0)
		//*   7   11:iload           4
		//*   8   13:ifeq            109
			{
				updateSuspended = true;
		//    9   16:aload_0         
		//   10   17:iconst_1        
		//   11   18:putfield        #46  <Field boolean updateSuspended>
				int i1 = items.size();
		//   12   21:aload_0         
		//   13   22:getfield        #29  <Field ArrayList items>
		//   14   25:invokevirtual   #70  <Method int ArrayList.size()>
		//   15   28:istore          5
				for(int i = 0; i < i1; i++)
		//*  16   30:iconst_0        
		//*  17   31:istore_2        
		//*  18   32:iload_2         
		//*  19   33:iload           5
		//*  20   35:icmpge          100
				{
					Object obj = ((Object) ((NavigationMenuItem)items.get(i)));
		//   21   38:aload_0         
		//   22   39:getfield        #29  <Field ArrayList items>
		//   23   42:iload_2         
		//   24   43:invokevirtual   #39  <Method Object ArrayList.get(int)>
		//   25   46:checkcast       #147 <Class NavigationMenuPresenter$NavigationMenuItem>
		//   26   49:astore          6
					if(!(obj instanceof NavigationMenuTextItem))
						continue;
		//   27   51:aload           6
		//   28   53:instanceof      #41  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   29   56:ifeq            93
					obj = ((Object) (((NavigationMenuTextItem)obj).getMenuItem()));
		//   30   59:aload           6
		//   31   61:checkcast       #41  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   32   64:invokevirtual   #151 <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
		//   33   67:astore          6
					if(obj == null || ((MenuItemImpl) (obj)).getItemId() != k)
						continue;
		//   34   69:aload           6
		//   35   71:ifnull          93
		//   36   74:aload           6
		//   37   76:invokevirtual   #138 <Method int MenuItemImpl.getItemId()>
		//   38   79:iload           4
		//   39   81:icmpne          93
					setCheckedItem(((MenuItemImpl) (obj)));
		//   40   84:aload_0         
		//   41   85:aload           6
		//   42   87:invokevirtual   #80  <Method void setCheckedItem(MenuItemImpl)>
					break;
		//   43   90:goto            100
				}

		//   44   93:iload_2         
		//   45   94:iconst_1        
		//   46   95:iadd            
		//   47   96:istore_2        
		//*  48   97:goto            32
				updateSuspended = false;
		//   49  100:aload_0         
		//   50  101:iconst_0        
		//   51  102:putfield        #46  <Field boolean updateSuspended>
				prepareMenuItems();
		//   52  105:aload_0         
		//   53  106:invokespecial   #32  <Method void prepareMenuItems()>
			}
			bundle = ((Bundle) (bundle.getSparseParcelableArray("android:menu:action_views")));
		//   54  109:aload_1         
		//   55  110:ldc1            #170 <String "android:menu:action_views">
		//   56  112:invokevirtual   #338 <Method SparseArray Bundle.getSparseParcelableArray(String)>
		//   57  115:astore_1        
			if(bundle != null)
		//*  58  116:aload_1         
		//*  59  117:ifnull          230
			{
				int l = items.size();
		//   60  120:aload_0         
		//   61  121:getfield        #29  <Field ArrayList items>
		//   62  124:invokevirtual   #70  <Method int ArrayList.size()>
		//   63  127:istore          4
				for(int j = ((int) (flag)); j < l; j++)
		//*  64  129:iload_3         
		//*  65  130:istore_2        
		//*  66  131:iload_2         
		//*  67  132:iload           4
		//*  68  134:icmpge          230
				{
					Object obj1 = ((Object) ((NavigationMenuItem)items.get(j)));
		//   69  137:aload_0         
		//   70  138:getfield        #29  <Field ArrayList items>
		//   71  141:iload_2         
		//   72  142:invokevirtual   #39  <Method Object ArrayList.get(int)>
		//   73  145:checkcast       #147 <Class NavigationMenuPresenter$NavigationMenuItem>
		//   74  148:astore          6
					if(!(obj1 instanceof NavigationMenuTextItem))
		//*  75  150:aload           6
		//*  76  152:instanceof      #41  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//*  77  155:ifne            161
						continue;
		//   78  158:goto            223
					Object obj2 = ((Object) (((NavigationMenuTextItem)obj1).getMenuItem()));
		//   79  161:aload           6
		//   80  163:checkcast       #41  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   81  166:invokevirtual   #151 <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
		//   82  169:astore          7
					if(obj2 == null)
		//*  83  171:aload           7
		//*  84  173:ifnonnull       179
						continue;
		//   85  176:goto            223
					obj1 = ((Object) (((MenuItemImpl) (obj2)).getActionView()));
		//   86  179:aload           7
		//   87  181:invokevirtual   #155 <Method View MenuItemImpl.getActionView()>
		//   88  184:astore          6
					if(obj1 == null)
		//*  89  186:aload           6
		//*  90  188:ifnonnull       194
						continue;
		//   91  191:goto            223
					obj2 = ((Object) ((ParcelableSparseArray)((SparseArray) (bundle)).get(((MenuItemImpl) (obj2)).getItemId())));
		//   92  194:aload_1         
		//   93  195:aload           7
		//   94  197:invokevirtual   #138 <Method int MenuItemImpl.getItemId()>
		//   95  200:invokevirtual   #339 <Method Object SparseArray.get(int)>
		//   96  203:checkcast       #157 <Class ParcelableSparseArray>
		//   97  206:astore          7
					if(obj2 != null)
		//*  98  208:aload           7
		//*  99  210:ifnonnull       216
		//* 100  213:goto            223
						((View) (obj1)).restoreHierarchyState(((SparseArray) (obj2)));
		//  101  216:aload           6
		//  102  218:aload           7
		//  103  220:invokevirtual   #342 <Method void View.restoreHierarchyState(SparseArray)>
				}

		//  104  223:iload_2         
		//  105  224:iconst_1        
		//  106  225:iadd            
		//  107  226:istore_2        
			}
		//* 108  227:goto            131
		//  109  230:return          
		}

		public void setCheckedItem(MenuItemImpl menuitemimpl)
		{
			if(checkedItem != menuitemimpl)
		//*   0    0:aload_0         
		//*   1    1:getfield        #133 <Field MenuItemImpl checkedItem>
		//*   2    4:aload_1         
		//*   3    5:if_acmpeq       43
			{
				if(!menuitemimpl.isCheckable())
		//*   4    8:aload_1         
		//*   5    9:invokevirtual   #83  <Method boolean MenuItemImpl.isCheckable()>
		//*   6   12:ifne            16
					return;
		//    7   15:return          
				MenuItemImpl menuitemimpl1 = checkedItem;
		//    8   16:aload_0         
		//    9   17:getfield        #133 <Field MenuItemImpl checkedItem>
		//   10   20:astore_2        
				if(menuitemimpl1 != null)
		//*  11   21:aload_2         
		//*  12   22:ifnull          31
					menuitemimpl1.setChecked(false);
		//   13   25:aload_2         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #346 <Method android.view.MenuItem MenuItemImpl.setChecked(boolean)>
		//   16   30:pop             
				checkedItem = menuitemimpl;
		//   17   31:aload_0         
		//   18   32:aload_1         
		//   19   33:putfield        #133 <Field MenuItemImpl checkedItem>
				menuitemimpl.setChecked(true);
		//   20   36:aload_1         
		//   21   37:iconst_1        
		//   22   38:invokevirtual   #346 <Method android.view.MenuItem MenuItemImpl.setChecked(boolean)>
		//   23   41:pop             
				return;
		//   24   42:return          
			} else
			{
				return;
		//   25   43:return          
			}
		}

		public void update()
		{
			prepareMenuItems();
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void prepareMenuItems()>
			notifyDataSetChanged();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #350 <Method void notifyDataSetChanged()>
		//    4    8:return          
		}

		private MenuItemImpl checkedItem;
		private final ArrayList items = new ArrayList();
		final NavigationMenuPresenter this$0;
		private boolean updateSuspended;

		NavigationMenuAdapter()
		{
			this$0 = NavigationMenuPresenter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field NavigationMenuPresenter this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void android.support.v7.widget.RecyclerView$Adapter()>
		//    5    9:aload_0         
		//    6   10:new             #26  <Class ArrayList>
		//    7   13:dup             
		//    8   14:invokespecial   #27  <Method void ArrayList()>
		//    9   17:putfield        #29  <Field ArrayList items>
			prepareMenuItems();
		//   10   20:aload_0         
		//   11   21:invokespecial   #32  <Method void prepareMenuItems()>
		//   12   24:return          
		}
	}

	private static class NavigationMenuHeaderItem
		implements NavigationMenuItem
	{

		NavigationMenuHeaderItem()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	private static interface NavigationMenuItem
	{
	}

	private static class NavigationMenuSeparatorItem
		implements NavigationMenuItem
	{

		public int getPaddingBottom()
		{
			return paddingBottom;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field int paddingBottom>
		//    2    4:ireturn         
		}

		public int getPaddingTop()
		{
			return paddingTop;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field int paddingTop>
		//    2    4:ireturn         
		}

		private final int paddingBottom;
		private final int paddingTop;

		public NavigationMenuSeparatorItem(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			paddingTop = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #19  <Field int paddingTop>
			paddingBottom = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field int paddingBottom>
		//    8   14:return          
		}
	}

	private static class NavigationMenuTextItem
		implements NavigationMenuItem
	{

		public MenuItemImpl getMenuItem()
		{
			return menuItem;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field MenuItemImpl menuItem>
		//    2    4:areturn         
		}

		private final MenuItemImpl menuItem;
		boolean needsEmptyIcon;

		NavigationMenuTextItem(MenuItemImpl menuitemimpl)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			menuItem = menuitemimpl;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field MenuItemImpl menuItem>
		//    5    9:return          
		}
	}

	private static class NormalViewHolder extends ViewHolder
	{

		public NormalViewHolder(LayoutInflater layoutinflater, ViewGroup viewgroup, android.view.View.OnClickListener onclicklistener)
		{
			super(layoutinflater.inflate(android.support.design.R.layout.design_navigation_item, viewgroup, false));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getstatic       #15  <Field int android.support.design.R$layout.design_navigation_item>
		//    3    5:aload_2         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #21  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//    6   10:invokespecial   #24  <Method void NavigationMenuPresenter$ViewHolder(View)>
			itemView.setOnClickListener(onclicklistener);
		//    7   13:aload_0         
		//    8   14:getfield        #28  <Field View itemView>
		//    9   17:aload_3         
		//   10   18:invokevirtual   #34  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		//   11   21:return          
		}
	}

	private static class SeparatorViewHolder extends ViewHolder
	{

		public SeparatorViewHolder(LayoutInflater layoutinflater, ViewGroup viewgroup)
		{
			super(layoutinflater.inflate(android.support.design.R.layout.design_navigation_item_separator, viewgroup, false));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getstatic       #15  <Field int android.support.design.R$layout.design_navigation_item_separator>
		//    3    5:aload_2         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #21  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//    6   10:invokespecial   #24  <Method void NavigationMenuPresenter$ViewHolder(View)>
		//    7   13:return          
		}
	}

	private static class SubheaderViewHolder extends ViewHolder
	{

		public SubheaderViewHolder(LayoutInflater layoutinflater, ViewGroup viewgroup)
		{
			super(layoutinflater.inflate(android.support.design.R.layout.design_navigation_item_subheader, viewgroup, false));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getstatic       #15  <Field int android.support.design.R$layout.design_navigation_item_subheader>
		//    3    5:aload_2         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #21  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//    6   10:invokespecial   #24  <Method void NavigationMenuPresenter$ViewHolder(View)>
		//    7   13:return          
		}
	}

	private static abstract class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
	{

		public ViewHolder(View view)
		{
			super(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
		//    3    5:return          
		}
	}


	public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean flagActionItems()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public MenuItemImpl getCheckedItem()
	{
		return adapter.getCheckedItem();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
	//    2    4:invokevirtual   #80  <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuAdapter.getCheckedItem()>
	//    3    7:areturn         
	}

	public int getHeaderCount()
	{
		return headerLayout.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field LinearLayout headerLayout>
	//    2    4:invokevirtual   #90  <Method int LinearLayout.getChildCount()>
	//    3    7:ireturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field int id>
	//    2    4:ireturn         
	}

	public Drawable getItemBackground()
	{
		return itemBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Drawable itemBackground>
	//    2    4:areturn         
	}

	public int getItemHorizontalPadding()
	{
		return itemHorizontalPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field int itemHorizontalPadding>
	//    2    4:ireturn         
	}

	public int getItemIconPadding()
	{
		return itemIconPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int itemIconPadding>
	//    2    4:ireturn         
	}

	public ColorStateList getItemTextColor()
	{
		return textColor;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field ColorStateList textColor>
	//    2    4:areturn         
	}

	public ColorStateList getItemTintList()
	{
		return iconTintList;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field ColorStateList iconTintList>
	//    2    4:areturn         
	}

	public MenuView getMenuView(ViewGroup viewgroup)
	{
		if(menuView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field NavigationMenuView menuView>
	//*   2    4:ifnonnull       78
		{
			menuView = (NavigationMenuView)layoutInflater.inflate(android.support.design.R.layout.design_navigation_menu, viewgroup, false);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #116 <Field LayoutInflater layoutInflater>
	//    6   12:getstatic       #121 <Field int android.support.design.R$layout.design_navigation_menu>
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #127 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   10   20:checkcast       #129 <Class NavigationMenuView>
	//   11   23:putfield        #114 <Field NavigationMenuView menuView>
			if(adapter == null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #78  <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
	//*  14   30:ifnonnull       45
				adapter = new NavigationMenuAdapter();
	//   15   33:aload_0         
	//   16   34:new             #11  <Class NavigationMenuPresenter$NavigationMenuAdapter>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #133 <Method void NavigationMenuPresenter$NavigationMenuAdapter(NavigationMenuPresenter)>
	//   20   42:putfield        #78  <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
			headerLayout = (LinearLayout)layoutInflater.inflate(android.support.design.R.layout.design_navigation_item_header, ((ViewGroup) (menuView)), false);
	//   21   45:aload_0         
	//   22   46:aload_0         
	//   23   47:getfield        #116 <Field LayoutInflater layoutInflater>
	//   24   50:getstatic       #136 <Field int android.support.design.R$layout.design_navigation_item_header>
	//   25   53:aload_0         
	//   26   54:getfield        #114 <Field NavigationMenuView menuView>
	//   27   57:iconst_0        
	//   28   58:invokevirtual   #127 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   29   61:checkcast       #87  <Class LinearLayout>
	//   30   64:putfield        #85  <Field LinearLayout headerLayout>
			menuView.setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (adapter)));
	//   31   67:aload_0         
	//   32   68:getfield        #114 <Field NavigationMenuView menuView>
	//   33   71:aload_0         
	//   34   72:getfield        #78  <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
	//   35   75:invokevirtual   #140 <Method void NavigationMenuView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
		}
		return ((MenuView) (menuView));
	//   36   78:aload_0         
	//   37   79:getfield        #114 <Field NavigationMenuView menuView>
	//   38   82:areturn         
	}

	public void initForMenu(Context context, MenuBuilder menubuilder)
	{
		layoutInflater = LayoutInflater.from(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #146 <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    5:putfield        #116 <Field LayoutInflater layoutInflater>
		menu = menubuilder;
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:putfield        #148 <Field MenuBuilder menu>
		paddingSeparator = context.getResources().getDimensionPixelOffset(android.support.design.R.dimen.design_navigation_separator_vertical_padding);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #154 <Method Resources Context.getResources()>
	//   10   18:getstatic       #159 <Field int android.support.design.R$dimen.design_navigation_separator_vertical_padding>
	//   11   21:invokevirtual   #165 <Method int Resources.getDimensionPixelOffset(int)>
	//   12   24:putfield        #167 <Field int paddingSeparator>
	//   13   27:return          
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		android.support.v7.view.menu.MenuPresenter.Callback callback1 = callback;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field android.support.v7.view.menu.MenuPresenter$Callback callback>
	//    2    4:astore_3        
		if(callback1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
			callback1.onCloseMenu(menubuilder, flag);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokeinterface #175 <Method void android.support.v7.view.menu.MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
	//    9   17:return          
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		if(parcelable instanceof Bundle)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #179 <Class Bundle>
	//*   2    4:ifeq            69
		{
			parcelable = ((Parcelable) ((Bundle)parcelable));
	//    3    7:aload_1         
	//    4    8:checkcast       #179 <Class Bundle>
	//    5   11:astore_1        
			Object obj = ((Object) (((Bundle) (parcelable)).getSparseParcelableArray("android:menu:list")));
	//    6   12:aload_1         
	//    7   13:ldc1            #181 <String "android:menu:list">
	//    8   15:invokevirtual   #185 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//    9   18:astore_2        
			if(obj != null)
	//*  10   19:aload_2         
	//*  11   20:ifnull          31
				menuView.restoreHierarchyState(((SparseArray) (obj)));
	//   12   23:aload_0         
	//   13   24:getfield        #114 <Field NavigationMenuView menuView>
	//   14   27:aload_2         
	//   15   28:invokevirtual   #189 <Method void NavigationMenuView.restoreHierarchyState(SparseArray)>
			obj = ((Object) (((Bundle) (parcelable)).getBundle("android:menu:adapter")));
	//   16   31:aload_1         
	//   17   32:ldc1            #191 <String "android:menu:adapter">
	//   18   34:invokevirtual   #195 <Method Bundle Bundle.getBundle(String)>
	//   19   37:astore_2        
			if(obj != null)
	//*  20   38:aload_2         
	//*  21   39:ifnull          50
				adapter.restoreInstanceState(((Bundle) (obj)));
	//   22   42:aload_0         
	//   23   43:getfield        #78  <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
	//   24   46:aload_2         
	//   25   47:invokevirtual   #199 <Method void NavigationMenuPresenter$NavigationMenuAdapter.restoreInstanceState(Bundle)>
			parcelable = ((Parcelable) (((Bundle) (parcelable)).getSparseParcelableArray("android:menu:header")));
	//   26   50:aload_1         
	//   27   51:ldc1            #201 <String "android:menu:header">
	//   28   53:invokevirtual   #185 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//   29   56:astore_1        
			if(parcelable != null)
	//*  30   57:aload_1         
	//*  31   58:ifnull          69
				headerLayout.restoreHierarchyState(((SparseArray) (parcelable)));
	//   32   61:aload_0         
	//   33   62:getfield        #85  <Field LinearLayout headerLayout>
	//   34   65:aload_1         
	//   35   66:invokevirtual   #202 <Method void LinearLayout.restoreHierarchyState(SparseArray)>
		}
	//   36   69:return          
	}

	public Parcelable onSaveInstanceState()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #179 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #207 <Method void Bundle()>
	//    3    7:astore_1        
		if(menuView != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #114 <Field NavigationMenuView menuView>
	//*   6   12:ifnull          38
		{
			SparseArray sparsearray = new SparseArray();
	//    7   15:new             #209 <Class SparseArray>
	//    8   18:dup             
	//    9   19:invokespecial   #210 <Method void SparseArray()>
	//   10   22:astore_2        
			menuView.saveHierarchyState(sparsearray);
	//   11   23:aload_0         
	//   12   24:getfield        #114 <Field NavigationMenuView menuView>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #213 <Method void NavigationMenuView.saveHierarchyState(SparseArray)>
			bundle.putSparseParcelableArray("android:menu:list", sparsearray);
	//   15   31:aload_1         
	//   16   32:ldc1            #181 <String "android:menu:list">
	//   17   34:aload_2         
	//   18   35:invokevirtual   #217 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
		}
		NavigationMenuAdapter navigationmenuadapter = adapter;
	//   19   38:aload_0         
	//   20   39:getfield        #78  <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
	//   21   42:astore_2        
		if(navigationmenuadapter != null)
	//*  22   43:aload_2         
	//*  23   44:ifnull          57
			bundle.putBundle("android:menu:adapter", navigationmenuadapter.createInstanceState());
	//   24   47:aload_1         
	//   25   48:ldc1            #191 <String "android:menu:adapter">
	//   26   50:aload_2         
	//   27   51:invokevirtual   #221 <Method Bundle NavigationMenuPresenter$NavigationMenuAdapter.createInstanceState()>
	//   28   54:invokevirtual   #225 <Method void Bundle.putBundle(String, Bundle)>
		if(headerLayout != null)
	//*  29   57:aload_0         
	//*  30   58:getfield        #85  <Field LinearLayout headerLayout>
	//*  31   61:ifnull          87
		{
			SparseArray sparsearray1 = new SparseArray();
	//   32   64:new             #209 <Class SparseArray>
	//   33   67:dup             
	//   34   68:invokespecial   #210 <Method void SparseArray()>
	//   35   71:astore_2        
			headerLayout.saveHierarchyState(sparsearray1);
	//   36   72:aload_0         
	//   37   73:getfield        #85  <Field LinearLayout headerLayout>
	//   38   76:aload_2         
	//   39   77:invokevirtual   #226 <Method void LinearLayout.saveHierarchyState(SparseArray)>
			bundle.putSparseParcelableArray("android:menu:header", sparsearray1);
	//   40   80:aload_1         
	//   41   81:ldc1            #201 <String "android:menu:header">
	//   42   83:aload_2         
	//   43   84:invokevirtual   #217 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
		}
		return ((Parcelable) (bundle));
	//   44   87:aload_1         
	//   45   88:areturn         
	}

	public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setCallback(android.support.v7.view.menu.MenuPresenter.Callback callback1)
	{
		callback = callback1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #171 <Field android.support.v7.view.menu.MenuPresenter$Callback callback>
	//    3    5:return          
	}

	public void setCheckedItem(MenuItemImpl menuitemimpl)
	{
		adapter.setCheckedItem(menuitemimpl);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #235 <Method void NavigationMenuPresenter$NavigationMenuAdapter.setCheckedItem(MenuItemImpl)>
	//    4    8:return          
	}

	public void setItemBackground(Drawable drawable)
	{
		itemBackground = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field Drawable itemBackground>
		updateMenuView(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #242 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setItemHorizontalPadding(int i)
	{
		itemHorizontalPadding = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #100 <Field int itemHorizontalPadding>
		updateMenuView(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #242 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setItemIconPadding(int i)
	{
		itemIconPadding = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #103 <Field int itemIconPadding>
		updateMenuView(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #242 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setItemIconTintList(ColorStateList colorstatelist)
	{
		iconTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #110 <Field ColorStateList iconTintList>
		updateMenuView(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #242 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setItemTextAppearance(int i)
	{
		textAppearance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #251 <Field int textAppearance>
		textAppearanceSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #253 <Field boolean textAppearanceSet>
		updateMenuView(false);
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #242 <Method void updateMenuView(boolean)>
	//    9   15:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		textColor = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #107 <Field ColorStateList textColor>
		updateMenuView(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #242 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void updateMenuView(boolean flag)
	{
		NavigationMenuAdapter navigationmenuadapter = adapter;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field NavigationMenuPresenter$NavigationMenuAdapter adapter>
	//    2    4:astore_2        
		if(navigationmenuadapter != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          13
			navigationmenuadapter.update();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #257 <Method void NavigationMenuPresenter$NavigationMenuAdapter.update()>
	//    7   13:return          
	}

	NavigationMenuAdapter adapter;
	private android.support.v7.view.menu.MenuPresenter.Callback callback;
	LinearLayout headerLayout;
	ColorStateList iconTintList;
	private int id;
	Drawable itemBackground;
	int itemHorizontalPadding;
	int itemIconPadding;
	LayoutInflater layoutInflater;
	MenuBuilder menu;
	private NavigationMenuView menuView;
	final android.view.View.OnClickListener onClickListener;
	int paddingSeparator;
	int textAppearance;
	boolean textAppearanceSet;
	ColorStateList textColor;
}
