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
import android.support.v4.view.WindowInsetsCompat;
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
				((NavigationMenuTextItem)mItems.get(i)).needsEmptyIcon = true;
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
			mItems.add(((Object) (new NavigationMenuHeaderItem())));
		//   10   20:aload_0         
		//   11   21:getfield        #45  <Field ArrayList mItems>
		//   12   24:new             #67  <Class NavigationMenuPresenter$NavigationMenuHeaderItem>
		//   13   27:dup             
		//   14   28:invokespecial   #68  <Method void NavigationMenuPresenter$NavigationMenuHeaderItem()>
		//   15   31:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
		//   16   34:pop             
			byte byte1 = -1;
		//   17   35:iconst_m1       
		//   18   36:istore          5
			int j = 0;
		//   19   38:iconst_0        
		//   20   39:istore_2        
			boolean flag1 = false;
		//   21   40:iconst_0        
		//   22   41:istore          11
			int l = 0;
		//   23   43:iconst_0        
		//   24   44:istore          4
			int j1 = mMenu.getVisibleItems().size();
		//   25   46:aload_0         
		//   26   47:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   27   50:getfield        #76  <Field MenuBuilder NavigationMenuPresenter.mMenu>
		//   28   53:invokevirtual   #82  <Method ArrayList MenuBuilder.getVisibleItems()>
		//   29   56:invokevirtual   #86  <Method int ArrayList.size()>
		//   30   59:istore          7
			while(l < j1) 
		//*  31   61:iload           4
		//*  32   63:iload           7
		//*  33   65:icmpge          544
			{
				Object obj = ((Object) ((MenuItemImpl)mMenu.getVisibleItems().get(l)));
		//   34   68:aload_0         
		//   35   69:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   36   72:getfield        #76  <Field MenuBuilder NavigationMenuPresenter.mMenu>
		//   37   75:invokevirtual   #82  <Method ArrayList MenuBuilder.getVisibleItems()>
		//   38   78:iload           4
		//   39   80:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//   40   83:checkcast       #88  <Class MenuItemImpl>
		//   41   86:astore          12
				if(((MenuItemImpl) (obj)).isChecked())
		//*  42   88:aload           12
		//*  43   90:invokevirtual   #92  <Method boolean MenuItemImpl.isChecked()>
		//*  44   93:ifeq            102
					setCheckedItem(((MenuItemImpl) (obj)));
		//   45   96:aload_0         
		//   46   97:aload           12
		//   47   99:invokevirtual   #96  <Method void setCheckedItem(MenuItemImpl)>
				if(((MenuItemImpl) (obj)).isCheckable())
		//*  48  102:aload           12
		//*  49  104:invokevirtual   #99  <Method boolean MenuItemImpl.isCheckable()>
		//*  50  107:ifeq            116
					((MenuItemImpl) (obj)).setExclusiveCheckable(false);
		//   51  110:aload           12
		//   52  112:iconst_0        
		//   53  113:invokevirtual   #103 <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
				int k;
				int i1;
				boolean flag;
				if(((MenuItemImpl) (obj)).hasSubMenu())
		//*  54  116:aload           12
		//*  55  118:invokevirtual   #106 <Method boolean MenuItemImpl.hasSubMenu()>
		//*  56  121:ifeq            380
				{
					SubMenu submenu = ((MenuItemImpl) (obj)).getSubMenu();
		//   57  124:aload           12
		//   58  126:invokevirtual   #110 <Method SubMenu MenuItemImpl.getSubMenu()>
		//   59  129:astore          13
					flag = flag1;
		//   60  131:iload           11
		//   61  133:istore          10
					k = ((int) (byte1));
		//   62  135:iload           5
		//   63  137:istore_3        
					i1 = j;
		//   64  138:iload_2         
		//   65  139:istore          6
					if(submenu.hasVisibleItems())
		//*  66  141:aload           13
		//*  67  143:invokeinterface #115 <Method boolean SubMenu.hasVisibleItems()>
		//*  68  148:ifeq            361
					{
						if(l != 0)
		//*  69  151:iload           4
		//*  70  153:ifeq            179
							mItems.add(((Object) (new NavigationMenuSeparatorItem(mPaddingSeparator, 0))));
		//   71  156:aload_0         
		//   72  157:getfield        #45  <Field ArrayList mItems>
		//   73  160:new             #117 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
		//   74  163:dup             
		//   75  164:aload_0         
		//   76  165:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   77  168:getfield        #120 <Field int NavigationMenuPresenter.mPaddingSeparator>
		//   78  171:iconst_0        
		//   79  172:invokespecial   #122 <Method void NavigationMenuPresenter$NavigationMenuSeparatorItem(int, int)>
		//   80  175:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
		//   81  178:pop             
						mItems.add(((Object) (new NavigationMenuTextItem(((MenuItemImpl) (obj))))));
		//   82  179:aload_0         
		//   83  180:getfield        #45  <Field ArrayList mItems>
		//   84  183:new             #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   85  186:dup             
		//   86  187:aload           12
		//   87  189:invokespecial   #124 <Method void NavigationMenuPresenter$NavigationMenuTextItem(MenuItemImpl)>
		//   88  192:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
		//   89  195:pop             
						byte byte0 = 0;
		//   90  196:iconst_0        
		//   91  197:istore_1        
						int k1 = mItems.size();
		//   92  198:aload_0         
		//   93  199:getfield        #45  <Field ArrayList mItems>
		//   94  202:invokevirtual   #86  <Method int ArrayList.size()>
		//   95  205:istore          8
						i1 = 0;
		//   96  207:iconst_0        
		//   97  208:istore          6
						for(int l1 = submenu.size(); i1 < l1;)
		//*  98  210:aload           13
		//*  99  212:invokeinterface #125 <Method int SubMenu.size()>
		//* 100  217:istore          9
		//* 101  219:iload           6
		//* 102  221:iload           9
		//* 103  223:icmpge          324
						{
							MenuItemImpl menuitemimpl = (MenuItemImpl)submenu.getItem(i1);
		//  104  226:aload           13
		//  105  228:iload           6
		//  106  230:invokeinterface #129 <Method android.view.MenuItem SubMenu.getItem(int)>
		//  107  235:checkcast       #88  <Class MenuItemImpl>
		//  108  238:astore          14
							k = ((int) (byte0));
		//  109  240:iload_1         
		//  110  241:istore_3        
							if(menuitemimpl.isVisible())
		//* 111  242:aload           14
		//* 112  244:invokevirtual   #132 <Method boolean MenuItemImpl.isVisible()>
		//* 113  247:ifeq            313
							{
								k = ((int) (byte0));
		//  114  250:iload_1         
		//  115  251:istore_3        
								if(byte0 == 0)
		//* 116  252:iload_1         
		//* 117  253:ifne            268
								{
									k = ((int) (byte0));
		//  118  256:iload_1         
		//  119  257:istore_3        
									if(menuitemimpl.getIcon() != null)
		//* 120  258:aload           14
		//* 121  260:invokevirtual   #136 <Method Drawable MenuItemImpl.getIcon()>
		//* 122  263:ifnull          268
										k = 1;
		//  123  266:iconst_1        
		//  124  267:istore_3        
								}
								if(menuitemimpl.isCheckable())
		//* 125  268:aload           14
		//* 126  270:invokevirtual   #99  <Method boolean MenuItemImpl.isCheckable()>
		//* 127  273:ifeq            282
									menuitemimpl.setExclusiveCheckable(false);
		//  128  276:aload           14
		//  129  278:iconst_0        
		//  130  279:invokevirtual   #103 <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
								if(((MenuItemImpl) (obj)).isChecked())
		//* 131  282:aload           12
		//* 132  284:invokevirtual   #92  <Method boolean MenuItemImpl.isChecked()>
		//* 133  287:ifeq            296
									setCheckedItem(((MenuItemImpl) (obj)));
		//  134  290:aload_0         
		//  135  291:aload           12
		//  136  293:invokevirtual   #96  <Method void setCheckedItem(MenuItemImpl)>
								mItems.add(((Object) (new NavigationMenuTextItem(menuitemimpl))));
		//  137  296:aload_0         
		//  138  297:getfield        #45  <Field ArrayList mItems>
		//  139  300:new             #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//  140  303:dup             
		//  141  304:aload           14
		//  142  306:invokespecial   #124 <Method void NavigationMenuPresenter$NavigationMenuTextItem(MenuItemImpl)>
		//  143  309:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
		//  144  312:pop             
							}
							i1++;
		//  145  313:iload           6
		//  146  315:iconst_1        
		//  147  316:iadd            
		//  148  317:istore          6
							byte0 = ((byte) (k));
		//  149  319:iload_3         
		//  150  320:istore_1        
						}

		//* 151  321:goto            219
						flag = flag1;
		//  152  324:iload           11
		//  153  326:istore          10
						k = ((int) (byte1));
		//  154  328:iload           5
		//  155  330:istore_3        
						i1 = j;
		//  156  331:iload_2         
		//  157  332:istore          6
						if(byte0 != 0)
		//* 158  334:iload_1         
		//* 159  335:ifeq            361
						{
							appendTransparentIconIfMissing(k1, mItems.size());
		//  160  338:aload_0         
		//  161  339:iload           8
		//  162  341:aload_0         
		//  163  342:getfield        #45  <Field ArrayList mItems>
		//  164  345:invokevirtual   #86  <Method int ArrayList.size()>
		//  165  348:invokespecial   #138 <Method void appendTransparentIconIfMissing(int, int)>
							i1 = j;
		//  166  351:iload_2         
		//  167  352:istore          6
							k = ((int) (byte1));
		//  168  354:iload           5
		//  169  356:istore_3        
							flag = flag1;
		//  170  357:iload           11
		//  171  359:istore          10
						}
					}
				} else
		//* 172  361:iload           4
		//* 173  363:iconst_1        
		//* 174  364:iadd            
		//* 175  365:istore          4
		//* 176  367:iload           10
		//* 177  369:istore          11
		//* 178  371:iload_3         
		//* 179  372:istore          5
		//* 180  374:iload           6
		//* 181  376:istore_2        
		//* 182  377:goto            61
				{
					k = ((MenuItemImpl) (obj)).getGroupId();
		//  183  380:aload           12
		//  184  382:invokevirtual   #141 <Method int MenuItemImpl.getGroupId()>
		//  185  385:istore_3        
					int i;
					if(k != byte1)
		//* 186  386:iload_3         
		//* 187  387:iload           5
		//* 188  389:icmpeq          499
					{
						j = mItems.size();
		//  189  392:aload_0         
		//  190  393:getfield        #45  <Field ArrayList mItems>
		//  191  396:invokevirtual   #86  <Method int ArrayList.size()>
		//  192  399:istore_2        
						if(((MenuItemImpl) (obj)).getIcon() != null)
		//* 193  400:aload           12
		//* 194  402:invokevirtual   #136 <Method Drawable MenuItemImpl.getIcon()>
		//* 195  405:ifnull          493
							flag1 = true;
		//  196  408:iconst_1        
		//  197  409:istore          11
						else
		//* 198  411:iload           11
		//* 199  413:istore          10
		//* 200  415:iload_2         
		//* 201  416:istore_1        
		//* 202  417:iload           4
		//* 203  419:ifeq            459
		//* 204  422:iload_2         
		//* 205  423:iconst_1        
		//* 206  424:iadd            
		//* 207  425:istore_1        
		//* 208  426:aload_0         
		//* 209  427:getfield        #45  <Field ArrayList mItems>
		//* 210  430:new             #117 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
		//* 211  433:dup             
		//* 212  434:aload_0         
		//* 213  435:getfield        #37  <Field NavigationMenuPresenter this$0>
		//* 214  438:getfield        #120 <Field int NavigationMenuPresenter.mPaddingSeparator>
		//* 215  441:aload_0         
		//* 216  442:getfield        #37  <Field NavigationMenuPresenter this$0>
		//* 217  445:getfield        #120 <Field int NavigationMenuPresenter.mPaddingSeparator>
		//* 218  448:invokespecial   #122 <Method void NavigationMenuPresenter$NavigationMenuSeparatorItem(int, int)>
		//* 219  451:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
		//* 220  454:pop             
		//* 221  455:iload           11
		//* 222  457:istore          10
		//* 223  459:new             #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//* 224  462:dup             
		//* 225  463:aload           12
		//* 226  465:invokespecial   #124 <Method void NavigationMenuPresenter$NavigationMenuTextItem(MenuItemImpl)>
		//* 227  468:astore          12
		//* 228  470:aload           12
		//* 229  472:iload           10
		//* 230  474:putfield        #60  <Field boolean NavigationMenuPresenter$NavigationMenuTextItem.needsEmptyIcon>
		//* 231  477:aload_0         
		//* 232  478:getfield        #45  <Field ArrayList mItems>
		//* 233  481:aload           12
		//* 234  483:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
		//* 235  486:pop             
		//* 236  487:iload_1         
		//* 237  488:istore          6
		//* 238  490:goto            361
							flag1 = false;
		//  239  493:iconst_0        
		//  240  494:istore          11
						flag = flag1;
						i = j;
						if(l != 0)
						{
							i = j + 1;
							mItems.add(((Object) (new NavigationMenuSeparatorItem(mPaddingSeparator, mPaddingSeparator))));
							flag = flag1;
						}
					} else
		//* 241  496:goto            411
					{
						flag = flag1;
		//  242  499:iload           11
		//  243  501:istore          10
						i = j;
		//  244  503:iload_2         
		//  245  504:istore_1        
						if(!flag1)
		//* 246  505:iload           11
		//* 247  507:ifne            459
						{
							flag = flag1;
		//  248  510:iload           11
		//  249  512:istore          10
							i = j;
		//  250  514:iload_2         
		//  251  515:istore_1        
							if(((MenuItemImpl) (obj)).getIcon() != null)
		//* 252  516:aload           12
		//* 253  518:invokevirtual   #136 <Method Drawable MenuItemImpl.getIcon()>
		//* 254  521:ifnull          459
							{
								flag = true;
		//  255  524:iconst_1        
		//  256  525:istore          10
								appendTransparentIconIfMissing(j, mItems.size());
		//  257  527:aload_0         
		//  258  528:iload_2         
		//  259  529:aload_0         
		//  260  530:getfield        #45  <Field ArrayList mItems>
		//  261  533:invokevirtual   #86  <Method int ArrayList.size()>
		//  262  536:invokespecial   #138 <Method void appendTransparentIconIfMissing(int, int)>
								i = j;
		//  263  539:iload_2         
		//  264  540:istore_1        
							}
						}
					}
					obj = ((Object) (new NavigationMenuTextItem(((MenuItemImpl) (obj)))));
					obj.needsEmptyIcon = flag;
					mItems.add(obj);
					i1 = i;
				}
				l++;
				flag1 = flag;
				byte1 = ((byte) (k));
				j = i1;
			}
		//* 265  541:goto            459
			mUpdateSuspended = false;
		//  266  544:aload_0         
		//  267  545:iconst_0        
		//  268  546:putfield        #62  <Field boolean mUpdateSuspended>
		//  269  549:return          
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
			int i = 0;
		//   17   39:iconst_0        
		//   18   40:istore_1        
			int j = mItems.size();
		//   19   41:aload_0         
		//   20   42:getfield        #45  <Field ArrayList mItems>
		//   21   45:invokevirtual   #86  <Method int ArrayList.size()>
		//   22   48:istore_2        
			while(i < j) 
		//*  23   49:iload_1         
		//*  24   50:iload_2         
		//*  25   51:icmpge          136
			{
				Object obj = ((Object) ((NavigationMenuItem)mItems.get(i)));
		//   26   54:aload_0         
		//   27   55:getfield        #45  <Field ArrayList mItems>
		//   28   58:iload_1         
		//   29   59:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//   30   62:checkcast       #160 <Class NavigationMenuPresenter$NavigationMenuItem>
		//   31   65:astore_3        
				if(!(obj instanceof NavigationMenuTextItem))
					continue;
		//   32   66:aload_3         
		//   33   67:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   34   70:ifeq            124
				MenuItemImpl menuitemimpl = ((NavigationMenuTextItem)obj).getMenuItem();
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
			NavigationMenuItem navigationmenuitem = (NavigationMenuItem)mItems.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field ArrayList mItems>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//    4    8:checkcast       #160 <Class NavigationMenuPresenter$NavigationMenuItem>
		//    5   11:astore_2        
			if(navigationmenuitem instanceof NavigationMenuSeparatorItem)
		//*   6   12:aload_2         
		//*   7   13:instanceof      #117 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
		//*   8   16:ifeq            21
				return 2;
		//    9   19:iconst_2        
		//   10   20:ireturn         
			if(navigationmenuitem instanceof NavigationMenuHeaderItem)
		//*  11   21:aload_2         
		//*  12   22:instanceof      #67  <Class NavigationMenuPresenter$NavigationMenuHeaderItem>
		//*  13   25:ifeq            30
				return 3;
		//   14   28:iconst_3        
		//   15   29:ireturn         
			if(navigationmenuitem instanceof NavigationMenuTextItem)
		//*  16   30:aload_2         
		//*  17   31:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//*  18   34:ifeq            54
				return !((NavigationMenuTextItem)navigationmenuitem).getMenuItem().hasSubMenu() ? 0 : 1;
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

		public void onBindViewHolder(ViewHolder viewholder, int i)
		{
			switch(getItemViewType(i))
		//*   0    0:aload_0         
		//*   1    1:iload_2         
		//*   2    2:invokevirtual   #200 <Method int getItemViewType(int)>
			{
		//*   3    5:tableswitch     0 2: default 32
		//		               0 33
		//		               1 158
		//		               2 186
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
		//   12   46:getfield        #212 <Field ColorStateList NavigationMenuPresenter.mIconTintList>
		//   13   49:invokevirtual   #216 <Method void NavigationMenuItemView.setIconTintList(ColorStateList)>
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
		//*  25   77:getfield        #229 <Field ColorStateList NavigationMenuPresenter.mTextColor>
		//*  26   80:ifnull          94
					navigationmenuitemview.setTextColor(mTextColor);
		//   27   83:aload_3         
		//   28   84:aload_0         
		//   29   85:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   30   88:getfield        #229 <Field ColorStateList NavigationMenuPresenter.mTextColor>
		//   31   91:invokevirtual   #232 <Method void NavigationMenuItemView.setTextColor(ColorStateList)>
				if(mItemBackground != null)
		//*  32   94:aload_0         
		//*  33   95:getfield        #37  <Field NavigationMenuPresenter this$0>
		//*  34   98:getfield        #236 <Field Drawable NavigationMenuPresenter.mItemBackground>
		//*  35  101:ifnull          153
					viewholder = ((ViewHolder) (mItemBackground.getConstantState().newDrawable()));
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
				viewholder = ((ViewHolder) ((NavigationMenuTextItem)mItems.get(i)));
				navigationmenuitemview.setNeedsEmptyIcon(((NavigationMenuTextItem) (viewholder)).needsEmptyIcon);
				navigationmenuitemview.initialize(((NavigationMenuTextItem) (viewholder)).getMenuItem(), 0);
				return;

		//*  63  155:goto            118
			case 1: // '\001'
				((TextView)viewholder.itemView).setText(((NavigationMenuTextItem)mItems.get(i)).getMenuItem().getTitle());
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
				NavigationMenuSeparatorItem navigationmenuseparatoritem = (NavigationMenuSeparatorItem)mItems.get(i);
		//   76  186:aload_0         
		//   77  187:getfield        #45  <Field ArrayList mItems>
		//   78  190:iload_2         
		//   79  191:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//   80  194:checkcast       #117 <Class NavigationMenuPresenter$NavigationMenuSeparatorItem>
		//   81  197:astore_3        
				viewholder.itemView.setPadding(0, navigationmenuseparatoritem.getPaddingTop(), 0, navigationmenuseparatoritem.getPaddingBottom());
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
			onBindViewHolder((ViewHolder)viewholder, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #202 <Class NavigationMenuPresenter$ViewHolder>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #283 <Method void onBindViewHolder(NavigationMenuPresenter$ViewHolder, int)>
		//    5    9:return          
		}

		public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
		{
			switch(i)
		//*   0    0:iload_2         
			{
		//*   1    1:tableswitch     0 3: default 32
		//		               0 34
		//		               1 57
		//		               2 73
		//		               3 89
			default:
				return null;
		//    2   32:aconst_null     
		//    3   33:areturn         

			case 0: // '\0'
				return ((ViewHolder) (new NormalViewHolder(mLayoutInflater, viewgroup, mOnClickListener)));
		//    4   34:new             #287 <Class NavigationMenuPresenter$NormalViewHolder>
		//    5   37:dup             
		//    6   38:aload_0         
		//    7   39:getfield        #37  <Field NavigationMenuPresenter this$0>
		//    8   42:getfield        #291 <Field LayoutInflater NavigationMenuPresenter.mLayoutInflater>
		//    9   45:aload_1         
		//   10   46:aload_0         
		//   11   47:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   12   50:getfield        #295 <Field android.view.View$OnClickListener NavigationMenuPresenter.mOnClickListener>
		//   13   53:invokespecial   #298 <Method void NavigationMenuPresenter$NormalViewHolder(LayoutInflater, ViewGroup, android.view.View$OnClickListener)>
		//   14   56:areturn         

			case 1: // '\001'
				return ((ViewHolder) (new SubheaderViewHolder(mLayoutInflater, viewgroup)));
		//   15   57:new             #300 <Class NavigationMenuPresenter$SubheaderViewHolder>
		//   16   60:dup             
		//   17   61:aload_0         
		//   18   62:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   19   65:getfield        #291 <Field LayoutInflater NavigationMenuPresenter.mLayoutInflater>
		//   20   68:aload_1         
		//   21   69:invokespecial   #303 <Method void NavigationMenuPresenter$SubheaderViewHolder(LayoutInflater, ViewGroup)>
		//   22   72:areturn         

			case 2: // '\002'
				return ((ViewHolder) (new SeparatorViewHolder(mLayoutInflater, viewgroup)));
		//   23   73:new             #305 <Class NavigationMenuPresenter$SeparatorViewHolder>
		//   24   76:dup             
		//   25   77:aload_0         
		//   26   78:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   27   81:getfield        #291 <Field LayoutInflater NavigationMenuPresenter.mLayoutInflater>
		//   28   84:aload_1         
		//   29   85:invokespecial   #306 <Method void NavigationMenuPresenter$SeparatorViewHolder(LayoutInflater, ViewGroup)>
		//   30   88:areturn         

			case 3: // '\003'
				return ((ViewHolder) (new HeaderViewHolder(((View) (mHeaderLayout)))));
		//   31   89:new             #308 <Class NavigationMenuPresenter$HeaderViewHolder>
		//   32   92:dup             
		//   33   93:aload_0         
		//   34   94:getfield        #37  <Field NavigationMenuPresenter this$0>
		//   35   97:getfield        #312 <Field LinearLayout NavigationMenuPresenter.mHeaderLayout>
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

		public void onViewRecycled(ViewHolder viewholder)
		{
			if(viewholder instanceof NormalViewHolder)
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
			onViewRecycled((ViewHolder)viewholder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #202 <Class NavigationMenuPresenter$ViewHolder>
		//    3    5:invokevirtual   #326 <Method void onViewRecycled(NavigationMenuPresenter$ViewHolder)>
		//    4    8:return          
		}

		public void restoreInstanceState(Bundle bundle)
		{
			int j = bundle.getInt("android:menu:checked", 0);
		//    0    0:aload_1         
		//    1    1:ldc1            #15  <String "android:menu:checked">
		//    2    3:iconst_0        
		//    3    4:invokevirtual   #332 <Method int Bundle.getInt(String, int)>
		//    4    7:istore_3        
			if(j == 0) goto _L2; else goto _L1
		//    5    8:iload_3         
		//    6    9:ifeq            94
_L1:
			int i;
			int l;
			mUpdateSuspended = true;
		//    7   12:aload_0         
		//    8   13:iconst_1        
		//    9   14:putfield        #62  <Field boolean mUpdateSuspended>
			i = 0;
		//   10   17:iconst_0        
		//   11   18:istore_2        
			l = mItems.size();
		//   12   19:aload_0         
		//   13   20:getfield        #45  <Field ArrayList mItems>
		//   14   23:invokevirtual   #86  <Method int ArrayList.size()>
		//   15   26:istore          4
_L9:
			if(i >= l) goto _L4; else goto _L3
		//   16   28:iload_2         
		//   17   29:iload           4
		//   18   31:icmpge          85
_L3:
			Object obj = ((Object) ((NavigationMenuItem)mItems.get(i)));
		//   19   34:aload_0         
		//   20   35:getfield        #45  <Field ArrayList mItems>
		//   21   38:iload_2         
		//   22   39:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//   23   42:checkcast       #160 <Class NavigationMenuPresenter$NavigationMenuItem>
		//   24   45:astore          5
			if(!(obj instanceof NavigationMenuTextItem)) goto _L6; else goto _L5
		//   25   47:aload           5
		//   26   49:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   27   52:ifeq            148
_L5:
			obj = ((Object) (((NavigationMenuTextItem)obj).getMenuItem()));
		//   28   55:aload           5
		//   29   57:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   30   60:invokevirtual   #164 <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
		//   31   63:astore          5
			if(obj == null || ((MenuItemImpl) (obj)).getItemId() != j) goto _L6; else goto _L7
		//   32   65:aload           5
		//   33   67:ifnull          148
		//   34   70:aload           5
		//   35   72:invokevirtual   #151 <Method int MenuItemImpl.getItemId()>
		//   36   75:iload_3         
		//   37   76:icmpne          148
_L7:
			setCheckedItem(((MenuItemImpl) (obj)));
		//   38   79:aload_0         
		//   39   80:aload           5
		//   40   82:invokevirtual   #96  <Method void setCheckedItem(MenuItemImpl)>
_L4:
			mUpdateSuspended = false;
		//   41   85:aload_0         
		//   42   86:iconst_0        
		//   43   87:putfield        #62  <Field boolean mUpdateSuspended>
			prepareMenuItems();
		//   44   90:aload_0         
		//   45   91:invokespecial   #48  <Method void prepareMenuItems()>
			  goto _L2
		//*  46   94:aload_1         
		//*  47   95:ldc1            #12  <String "android:menu:action_views">
		//*  48   97:invokevirtual   #336 <Method SparseArray Bundle.getSparseParcelableArray(String)>
		//*  49  100:astore_1        
		//*  50  101:aload_1         
		//*  51  102:ifnull          211
		//*  52  105:iconst_0        
		//*  53  106:istore_2        
		//*  54  107:aload_0         
		//*  55  108:getfield        #45  <Field ArrayList mItems>
		//*  56  111:invokevirtual   #86  <Method int ArrayList.size()>
		//*  57  114:istore_3        
		//*  58  115:iload_2         
		//*  59  116:iload_3         
		//*  60  117:icmpge          211
		//*  61  120:aload_0         
		//*  62  121:getfield        #45  <Field ArrayList mItems>
		//*  63  124:iload_2         
		//*  64  125:invokevirtual   #55  <Method Object ArrayList.get(int)>
		//*  65  128:checkcast       #160 <Class NavigationMenuPresenter$NavigationMenuItem>
		//*  66  131:astore          5
		//*  67  133:aload           5
		//*  68  135:instanceof      #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//*  69  138:ifne            155
		//*  70  141:iload_2         
		//*  71  142:iconst_1        
		//*  72  143:iadd            
		//*  73  144:istore_2        
		//*  74  145:goto            115
_L6:
			i++;
		//   75  148:iload_2         
		//   76  149:iconst_1        
		//   77  150:iadd            
		//   78  151:istore_2        
			continue; /* Loop/switch isn't completed */
		//   79  152:goto            28
_L2:
			bundle = ((Bundle) (bundle.getSparseParcelableArray("android:menu:action_views")));
			if(bundle != null)
			{
				i = 0;
				int k = mItems.size();
				while(i < k) 
				{
					NavigationMenuItem navigationmenuitem = (NavigationMenuItem)mItems.get(i);
					if(navigationmenuitem instanceof NavigationMenuTextItem)
					{
						Object obj1 = ((Object) (((NavigationMenuTextItem)navigationmenuitem).getMenuItem()));
		//   80  155:aload           5
		//   81  157:checkcast       #57  <Class NavigationMenuPresenter$NavigationMenuTextItem>
		//   82  160:invokevirtual   #164 <Method MenuItemImpl NavigationMenuPresenter$NavigationMenuTextItem.getMenuItem()>
		//   83  163:astore          6
						if(obj1 != null)
		//*  84  165:aload           6
		//*  85  167:ifnull          141
						{
							View view = ((MenuItemImpl) (obj1)).getActionView();
		//   86  170:aload           6
		//   87  172:invokevirtual   #168 <Method View MenuItemImpl.getActionView()>
		//   88  175:astore          5
							if(view != null)
		//*  89  177:aload           5
		//*  90  179:ifnull          141
							{
								obj1 = ((Object) ((ParcelableSparseArray)((SparseArray) (bundle)).get(((MenuItemImpl) (obj1)).getItemId())));
		//   91  182:aload_1         
		//   92  183:aload           6
		//   93  185:invokevirtual   #151 <Method int MenuItemImpl.getItemId()>
		//   94  188:invokevirtual   #337 <Method Object SparseArray.get(int)>
		//   95  191:checkcast       #170 <Class ParcelableSparseArray>
		//   96  194:astore          6
								if(obj1 != null)
		//*  97  196:aload           6
		//*  98  198:ifnull          141
									view.restoreHierarchyState(((SparseArray) (obj1)));
		//   99  201:aload           5
		//  100  203:aload           6
		//  101  205:invokevirtual   #340 <Method void View.restoreHierarchyState(SparseArray)>
							}
						}
					}
					i++;
				}
			}
		//* 102  208:goto            141
			return;
		//  103  211:return          
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

		NavigationMenuAdapter()
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
			return mPaddingBottom;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field int mPaddingBottom>
		//    2    4:ireturn         
		}

		public int getPaddingTop()
		{
			return mPaddingTop;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field int mPaddingTop>
		//    2    4:ireturn         
		}

		private final int mPaddingBottom;
		private final int mPaddingTop;

		public NavigationMenuSeparatorItem(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mPaddingTop = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #19  <Field int mPaddingTop>
			mPaddingBottom = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field int mPaddingBottom>
		//    8   14:return          
		}
	}

	private static class NavigationMenuTextItem
		implements NavigationMenuItem
	{

		public MenuItemImpl getMenuItem()
		{
			return mMenuItem;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field MenuItemImpl mMenuItem>
		//    2    4:areturn         
		}

		private final MenuItemImpl mMenuItem;
		boolean needsEmptyIcon;

		NavigationMenuTextItem(MenuItemImpl menuitemimpl)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			mMenuItem = menuitemimpl;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field MenuItemImpl mMenuItem>
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


	public NavigationMenuPresenter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #8   <Class NavigationMenuPresenter$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #85  <Method void NavigationMenuPresenter$1(NavigationMenuPresenter)>
	//    7   13:putfield        #87  <Field android.view.View$OnClickListener mOnClickListener>
	//    8   16:return          
	}

	public void addHeaderView(View view)
	{
		mHeaderLayout.addView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field LinearLayout mHeaderLayout>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #98  <Method void LinearLayout.addView(View)>
		mMenuView.setPadding(0, 0, 0, mMenuView.getPaddingBottom());
	//    4    8:aload_0         
	//    5    9:getfield        #100 <Field NavigationMenuView mMenuView>
	//    6   12:iconst_0        
	//    7   13:iconst_0        
	//    8   14:iconst_0        
	//    9   15:aload_0         
	//   10   16:getfield        #100 <Field NavigationMenuView mMenuView>
	//   11   19:invokevirtual   #106 <Method int NavigationMenuView.getPaddingBottom()>
	//   12   22:invokevirtual   #110 <Method void NavigationMenuView.setPadding(int, int, int, int)>
	//   13   25:return          
	}

	public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void dispatchApplyWindowInsets(WindowInsetsCompat windowinsetscompat)
	{
		int i = windowinsetscompat.getSystemWindowInsetTop();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #120 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//    2    4:istore_2        
		if(mPaddingTopDefault != i)
	//*   3    5:aload_0         
	//*   4    6:getfield        #122 <Field int mPaddingTopDefault>
	//*   5    9:iload_2         
	//*   6   10:icmpeq          48
		{
			mPaddingTopDefault = i;
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:putfield        #122 <Field int mPaddingTopDefault>
			if(mHeaderLayout.getChildCount() == 0)
	//*  10   18:aload_0         
	//*  11   19:getfield        #93  <Field LinearLayout mHeaderLayout>
	//*  12   22:invokevirtual   #125 <Method int LinearLayout.getChildCount()>
	//*  13   25:ifne            48
				mMenuView.setPadding(0, mPaddingTopDefault, 0, mMenuView.getPaddingBottom());
	//   14   28:aload_0         
	//   15   29:getfield        #100 <Field NavigationMenuView mMenuView>
	//   16   32:iconst_0        
	//   17   33:aload_0         
	//   18   34:getfield        #122 <Field int mPaddingTopDefault>
	//   19   37:iconst_0        
	//   20   38:aload_0         
	//   21   39:getfield        #100 <Field NavigationMenuView mMenuView>
	//   22   42:invokevirtual   #106 <Method int NavigationMenuView.getPaddingBottom()>
	//   23   45:invokevirtual   #110 <Method void NavigationMenuView.setPadding(int, int, int, int)>
		}
		ViewCompat.dispatchApplyWindowInsets(((View) (mHeaderLayout)), windowinsetscompat);
	//   24   48:aload_0         
	//   25   49:getfield        #93  <Field LinearLayout mHeaderLayout>
	//   26   52:aload_1         
	//   27   53:invokestatic    #130 <Method WindowInsetsCompat ViewCompat.dispatchApplyWindowInsets(View, WindowInsetsCompat)>
	//   28   56:pop             
	//   29   57:return          
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

	public int getHeaderCount()
	{
		return mHeaderLayout.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field LinearLayout mHeaderLayout>
	//    2    4:invokevirtual   #125 <Method int LinearLayout.getChildCount()>
	//    3    7:ireturn         
	}

	public View getHeaderView(int i)
	{
		return mHeaderLayout.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field LinearLayout mHeaderLayout>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #139 <Method View LinearLayout.getChildAt(int)>
	//    4    8:areturn         
	}

	public int getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field int mId>
	//    2    4:ireturn         
	}

	public Drawable getItemBackground()
	{
		return mItemBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field Drawable mItemBackground>
	//    2    4:areturn         
	}

	public ColorStateList getItemTextColor()
	{
		return mTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field ColorStateList mTextColor>
	//    2    4:areturn         
	}

	public ColorStateList getItemTintList()
	{
		return mIconTintList;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field ColorStateList mIconTintList>
	//    2    4:areturn         
	}

	public MenuView getMenuView(ViewGroup viewgroup)
	{
		if(mMenuView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field NavigationMenuView mMenuView>
	//*   2    4:ifnonnull       78
		{
			mMenuView = (NavigationMenuView)mLayoutInflater.inflate(android.support.design.R.layout.design_navigation_menu, viewgroup, false);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #159 <Field LayoutInflater mLayoutInflater>
	//    6   12:getstatic       #164 <Field int android.support.design.R$layout.design_navigation_menu>
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #170 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   10   20:checkcast       #102 <Class NavigationMenuView>
	//   11   23:putfield        #100 <Field NavigationMenuView mMenuView>
			if(mAdapter == null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//*  14   30:ifnonnull       45
				mAdapter = new NavigationMenuAdapter();
	//   15   33:aload_0         
	//   16   34:new             #13  <Class NavigationMenuPresenter$NavigationMenuAdapter>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #173 <Method void NavigationMenuPresenter$NavigationMenuAdapter(NavigationMenuPresenter)>
	//   20   42:putfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
			mHeaderLayout = (LinearLayout)mLayoutInflater.inflate(android.support.design.R.layout.design_navigation_item_header, ((ViewGroup) (mMenuView)), false);
	//   21   45:aload_0         
	//   22   46:aload_0         
	//   23   47:getfield        #159 <Field LayoutInflater mLayoutInflater>
	//   24   50:getstatic       #176 <Field int android.support.design.R$layout.design_navigation_item_header>
	//   25   53:aload_0         
	//   26   54:getfield        #100 <Field NavigationMenuView mMenuView>
	//   27   57:iconst_0        
	//   28   58:invokevirtual   #170 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   29   61:checkcast       #95  <Class LinearLayout>
	//   30   64:putfield        #93  <Field LinearLayout mHeaderLayout>
			mMenuView.setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (mAdapter)));
	//   31   67:aload_0         
	//   32   68:getfield        #100 <Field NavigationMenuView mMenuView>
	//   33   71:aload_0         
	//   34   72:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//   35   75:invokevirtual   #180 <Method void NavigationMenuView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
		}
		return ((MenuView) (mMenuView));
	//   36   78:aload_0         
	//   37   79:getfield        #100 <Field NavigationMenuView mMenuView>
	//   38   82:areturn         
	}

	public View inflateHeaderView(int i)
	{
		View view = mLayoutInflater.inflate(i, ((ViewGroup) (mHeaderLayout)), false);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field LayoutInflater mLayoutInflater>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #93  <Field LinearLayout mHeaderLayout>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #170 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    7   13:astore_2        
		addHeaderView(view);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #184 <Method void addHeaderView(View)>
		return view;
	//   11   19:aload_2         
	//   12   20:areturn         
	}

	public void initForMenu(Context context, MenuBuilder menubuilder)
	{
		mLayoutInflater = LayoutInflater.from(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #190 <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    5:putfield        #159 <Field LayoutInflater mLayoutInflater>
		mMenu = menubuilder;
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:putfield        #192 <Field MenuBuilder mMenu>
		mPaddingSeparator = context.getResources().getDimensionPixelOffset(android.support.design.R.dimen.design_navigation_separator_vertical_padding);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #198 <Method Resources Context.getResources()>
	//   10   18:getstatic       #203 <Field int android.support.design.R$dimen.design_navigation_separator_vertical_padding>
	//   11   21:invokevirtual   #209 <Method int Resources.getDimensionPixelOffset(int)>
	//   12   24:putfield        #211 <Field int mPaddingSeparator>
	//   13   27:return          
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		if(mCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #215 <Field android.support.v7.view.menu.MenuPresenter$Callback mCallback>
	//*   2    4:ifnull          18
			mCallback.onCloseMenu(menubuilder, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #215 <Field android.support.v7.view.menu.MenuPresenter$Callback mCallback>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #219 <Method void android.support.v7.view.menu.MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
	//    8   18:return          
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		if(parcelable instanceof Bundle)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #223 <Class Bundle>
	//*   2    4:ifeq            69
		{
			parcelable = ((Parcelable) ((Bundle)parcelable));
	//    3    7:aload_1         
	//    4    8:checkcast       #223 <Class Bundle>
	//    5   11:astore_1        
			Object obj = ((Object) (((Bundle) (parcelable)).getSparseParcelableArray("android:menu:list")));
	//    6   12:aload_1         
	//    7   13:ldc1            #52  <String "android:menu:list">
	//    8   15:invokevirtual   #227 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//    9   18:astore_2        
			if(obj != null)
	//*  10   19:aload_2         
	//*  11   20:ifnull          31
				mMenuView.restoreHierarchyState(((SparseArray) (obj)));
	//   12   23:aload_0         
	//   13   24:getfield        #100 <Field NavigationMenuView mMenuView>
	//   14   27:aload_2         
	//   15   28:invokevirtual   #231 <Method void NavigationMenuView.restoreHierarchyState(SparseArray)>
			obj = ((Object) (((Bundle) (parcelable)).getBundle("android:menu:adapter")));
	//   16   31:aload_1         
	//   17   32:ldc1            #46  <String "android:menu:adapter">
	//   18   34:invokevirtual   #235 <Method Bundle Bundle.getBundle(String)>
	//   19   37:astore_2        
			if(obj != null)
	//*  20   38:aload_2         
	//*  21   39:ifnull          50
				mAdapter.restoreInstanceState(((Bundle) (obj)));
	//   22   42:aload_0         
	//   23   43:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//   24   46:aload_2         
	//   25   47:invokevirtual   #239 <Method void NavigationMenuPresenter$NavigationMenuAdapter.restoreInstanceState(Bundle)>
			parcelable = ((Parcelable) (((Bundle) (parcelable)).getSparseParcelableArray("android:menu:header")));
	//   26   50:aload_1         
	//   27   51:ldc1            #49  <String "android:menu:header">
	//   28   53:invokevirtual   #227 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//   29   56:astore_1        
			if(parcelable != null)
	//*  30   57:aload_1         
	//*  31   58:ifnull          69
				mHeaderLayout.restoreHierarchyState(((SparseArray) (parcelable)));
	//   32   61:aload_0         
	//   33   62:getfield        #93  <Field LinearLayout mHeaderLayout>
	//   34   65:aload_1         
	//   35   66:invokevirtual   #240 <Method void LinearLayout.restoreHierarchyState(SparseArray)>
		}
	//   36   69:return          
	}

	public Parcelable onSaveInstanceState()
	{
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #247 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          98
		{
			Bundle bundle = new Bundle();
	//    3    8:new             #223 <Class Bundle>
	//    4   11:dup             
	//    5   12:invokespecial   #248 <Method void Bundle()>
	//    6   15:astore_1        
			if(mMenuView != null)
	//*   7   16:aload_0         
	//*   8   17:getfield        #100 <Field NavigationMenuView mMenuView>
	//*   9   20:ifnull          46
			{
				SparseArray sparsearray = new SparseArray();
	//   10   23:new             #250 <Class SparseArray>
	//   11   26:dup             
	//   12   27:invokespecial   #251 <Method void SparseArray()>
	//   13   30:astore_2        
				mMenuView.saveHierarchyState(sparsearray);
	//   14   31:aload_0         
	//   15   32:getfield        #100 <Field NavigationMenuView mMenuView>
	//   16   35:aload_2         
	//   17   36:invokevirtual   #254 <Method void NavigationMenuView.saveHierarchyState(SparseArray)>
				bundle.putSparseParcelableArray("android:menu:list", sparsearray);
	//   18   39:aload_1         
	//   19   40:ldc1            #52  <String "android:menu:list">
	//   20   42:aload_2         
	//   21   43:invokevirtual   #258 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
			}
			if(mAdapter != null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//*  24   50:ifnull          66
				bundle.putBundle("android:menu:adapter", mAdapter.createInstanceState());
	//   25   53:aload_1         
	//   26   54:ldc1            #46  <String "android:menu:adapter">
	//   27   56:aload_0         
	//   28   57:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//   29   60:invokevirtual   #262 <Method Bundle NavigationMenuPresenter$NavigationMenuAdapter.createInstanceState()>
	//   30   63:invokevirtual   #266 <Method void Bundle.putBundle(String, Bundle)>
			if(mHeaderLayout != null)
	//*  31   66:aload_0         
	//*  32   67:getfield        #93  <Field LinearLayout mHeaderLayout>
	//*  33   70:ifnull          96
			{
				SparseArray sparsearray1 = new SparseArray();
	//   34   73:new             #250 <Class SparseArray>
	//   35   76:dup             
	//   36   77:invokespecial   #251 <Method void SparseArray()>
	//   37   80:astore_2        
				mHeaderLayout.saveHierarchyState(sparsearray1);
	//   38   81:aload_0         
	//   39   82:getfield        #93  <Field LinearLayout mHeaderLayout>
	//   40   85:aload_2         
	//   41   86:invokevirtual   #267 <Method void LinearLayout.saveHierarchyState(SparseArray)>
				bundle.putSparseParcelableArray("android:menu:header", sparsearray1);
	//   42   89:aload_1         
	//   43   90:ldc1            #49  <String "android:menu:header">
	//   44   92:aload_2         
	//   45   93:invokevirtual   #258 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
			}
			return ((Parcelable) (bundle));
	//   46   96:aload_1         
	//   47   97:areturn         
		} else
		{
			return null;
	//   48   98:aconst_null     
	//   49   99:areturn         
		}
	}

	public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void removeHeaderView(View view)
	{
		mHeaderLayout.removeView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field LinearLayout mHeaderLayout>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #273 <Method void LinearLayout.removeView(View)>
		if(mHeaderLayout.getChildCount() == 0)
	//*   4    8:aload_0         
	//*   5    9:getfield        #93  <Field LinearLayout mHeaderLayout>
	//*   6   12:invokevirtual   #125 <Method int LinearLayout.getChildCount()>
	//*   7   15:ifne            38
			mMenuView.setPadding(0, mPaddingTopDefault, 0, mMenuView.getPaddingBottom());
	//    8   18:aload_0         
	//    9   19:getfield        #100 <Field NavigationMenuView mMenuView>
	//   10   22:iconst_0        
	//   11   23:aload_0         
	//   12   24:getfield        #122 <Field int mPaddingTopDefault>
	//   13   27:iconst_0        
	//   14   28:aload_0         
	//   15   29:getfield        #100 <Field NavigationMenuView mMenuView>
	//   16   32:invokevirtual   #106 <Method int NavigationMenuView.getPaddingBottom()>
	//   17   35:invokevirtual   #110 <Method void NavigationMenuView.setPadding(int, int, int, int)>
	//   18   38:return          
	}

	public void setCallback(android.support.v7.view.menu.MenuPresenter.Callback callback)
	{
		mCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #215 <Field android.support.v7.view.menu.MenuPresenter$Callback mCallback>
	//    3    5:return          
	}

	public void setCheckedItem(MenuItemImpl menuitemimpl)
	{
		mAdapter.setCheckedItem(menuitemimpl);
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #279 <Method void NavigationMenuPresenter$NavigationMenuAdapter.setCheckedItem(MenuItemImpl)>
	//    4    8:return          
	}

	public void setId(int i)
	{
		mId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #142 <Field int mId>
	//    3    5:return          
	}

	public void setItemBackground(Drawable drawable)
	{
		mItemBackground = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #147 <Field Drawable mItemBackground>
		updateMenuView(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #287 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setItemIconTintList(ColorStateList colorstatelist)
	{
		mIconTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #155 <Field ColorStateList mIconTintList>
		updateMenuView(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #287 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setItemTextAppearance(int i)
	{
		mTextAppearance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #293 <Field int mTextAppearance>
		mTextAppearanceSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #295 <Field boolean mTextAppearanceSet>
		updateMenuView(false);
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #287 <Method void updateMenuView(boolean)>
	//    9   15:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		mTextColor = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #152 <Field ColorStateList mTextColor>
		updateMenuView(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #287 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setUpdateSuspended(boolean flag)
	{
		if(mAdapter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//*   2    4:ifnull          15
			mAdapter.setUpdateSuspended(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #299 <Method void NavigationMenuPresenter$NavigationMenuAdapter.setUpdateSuspended(boolean)>
	//    7   15:return          
	}

	public void updateMenuView(boolean flag)
	{
		if(mAdapter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//*   2    4:ifnull          14
			mAdapter.update();
	//    3    7:aload_0         
	//    4    8:getfield        #172 <Field NavigationMenuPresenter$NavigationMenuAdapter mAdapter>
	//    5   11:invokevirtual   #302 <Method void NavigationMenuPresenter$NavigationMenuAdapter.update()>
	//    6   14:return          
	}

	private static final String STATE_ADAPTER = "android:menu:adapter";
	private static final String STATE_HEADER = "android:menu:header";
	private static final String STATE_HIERARCHY = "android:menu:list";
	NavigationMenuAdapter mAdapter;
	private android.support.v7.view.menu.MenuPresenter.Callback mCallback;
	LinearLayout mHeaderLayout;
	ColorStateList mIconTintList;
	private int mId;
	Drawable mItemBackground;
	LayoutInflater mLayoutInflater;
	MenuBuilder mMenu;
	private NavigationMenuView mMenuView;
	final android.view.View.OnClickListener mOnClickListener = new android.view.View.OnClickListener() {

		public void onClick(View view)
		{
			view = ((View) ((NavigationMenuItemView)view));
		//    0    0:aload_1         
		//    1    1:checkcast       #22  <Class NavigationMenuItemView>
		//    2    4:astore_1        
			setUpdateSuspended(true);
		//    3    5:aload_0         
		//    4    6:getfield        #14  <Field NavigationMenuPresenter this$0>
		//    5    9:iconst_1        
		//    6   10:invokevirtual   #26  <Method void NavigationMenuPresenter.setUpdateSuspended(boolean)>
			view = ((View) (((NavigationMenuItemView) (view)).getItemData()));
		//    7   13:aload_1         
		//    8   14:invokevirtual   #30  <Method MenuItemImpl NavigationMenuItemView.getItemData()>
		//    9   17:astore_1        
			boolean flag = mMenu.performItemAction(((android.view.MenuItem) (view)), ((MenuPresenter) (NavigationMenuPresenter.this)), 0);
		//   10   18:aload_0         
		//   11   19:getfield        #14  <Field NavigationMenuPresenter this$0>
		//   12   22:getfield        #34  <Field MenuBuilder NavigationMenuPresenter.mMenu>
		//   13   25:aload_1         
		//   14   26:aload_0         
		//   15   27:getfield        #14  <Field NavigationMenuPresenter this$0>
		//   16   30:iconst_0        
		//   17   31:invokevirtual   #40  <Method boolean MenuBuilder.performItemAction(android.view.MenuItem, MenuPresenter, int)>
		//   18   34:istore_2        
			if(view != null && ((MenuItemImpl) (view)).isCheckable() && flag)
		//*  19   35:aload_1         
		//*  20   36:ifnull          61
		//*  21   39:aload_1         
		//*  22   40:invokevirtual   #46  <Method boolean MenuItemImpl.isCheckable()>
		//*  23   43:ifeq            61
		//*  24   46:iload_2         
		//*  25   47:ifeq            61
				mAdapter.setCheckedItem(((MenuItemImpl) (view)));
		//   26   50:aload_0         
		//   27   51:getfield        #14  <Field NavigationMenuPresenter this$0>
		//   28   54:getfield        #50  <Field NavigationMenuPresenter$NavigationMenuAdapter NavigationMenuPresenter.mAdapter>
		//   29   57:aload_1         
		//   30   58:invokevirtual   #56  <Method void NavigationMenuPresenter$NavigationMenuAdapter.setCheckedItem(MenuItemImpl)>
			setUpdateSuspended(false);
		//   31   61:aload_0         
		//   32   62:getfield        #14  <Field NavigationMenuPresenter this$0>
		//   33   65:iconst_0        
		//   34   66:invokevirtual   #26  <Method void NavigationMenuPresenter.setUpdateSuspended(boolean)>
			updateMenuView(false);
		//   35   69:aload_0         
		//   36   70:getfield        #14  <Field NavigationMenuPresenter this$0>
		//   37   73:iconst_0        
		//   38   74:invokevirtual   #59  <Method void NavigationMenuPresenter.updateMenuView(boolean)>
		//   39   77:return          
		}

		final NavigationMenuPresenter this$0;

			
			{
				this$0 = NavigationMenuPresenter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field NavigationMenuPresenter this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	int mPaddingSeparator;
	private int mPaddingTopDefault;
	int mTextAppearance;
	boolean mTextAppearanceSet;
	ColorStateList mTextColor;
}
