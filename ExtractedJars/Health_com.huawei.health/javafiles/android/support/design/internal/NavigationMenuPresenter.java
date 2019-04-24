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
	static class a
		implements b
	{

		public int c()
		{
			return e;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field int e>
		//    2    4:ireturn         
		}

		public int d()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field int d>
		//    2    4:ireturn         
		}

		private final int d;
		private final int e;

		public a(int j, int l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			d = j;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #19  <Field int d>
			e = l;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field int e>
		//    8   14:return          
		}
	}

	static interface b
	{
	}

	static class c extends i
	{

		public c(View view)
		{
			super(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void NavigationMenuPresenter$i(View)>
		//    3    5:return          
		}
	}

	class d extends android.support.v7.widget.RecyclerView.Adapter
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
			e.add(((Object) (new e())));
		//   10   20:aload_0         
		//   11   21:getfield        #28  <Field ArrayList e>
		//   12   24:new             #38  <Class NavigationMenuPresenter$e>
		//   13   27:dup             
		//   14   28:invokespecial   #39  <Method void NavigationMenuPresenter$e()>
		//   15   31:invokevirtual   #43  <Method boolean ArrayList.add(Object)>
		//   16   34:pop             
			int k1 = -1;
		//   17   35:iconst_m1       
		//   18   36:istore          5
			int l = 0;
		//   19   38:iconst_0        
		//   20   39:istore_2        
			boolean flag3 = false;
		//   21   40:iconst_0        
		//   22   41:istore          11
			int j1 = 0;
		//   23   43:iconst_0        
		//   24   44:istore          4
			for(int i2 = a.mMenu.getVisibleItems().size(); j1 < i2;)
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
				Object obj = ((Object) ((MenuItemImpl)a.mMenu.getVisibleItems().get(j1)));
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
				int j;
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
						if(j1 != 0)
		//*  63  141:iload           4
		//*  64  143:ifeq            169
							e.add(((Object) (new a(a.mPaddingSeparator, 0))));
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
						e.add(((Object) (new k(((MenuItemImpl) (obj))))));
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
						int j2 = e.size();
		//   86  188:aload_0         
		//   87  189:getfield        #28  <Field ArrayList e>
		//   88  192:invokevirtual   #57  <Method int ArrayList.size()>
		//   89  195:istore          8
						int l1 = 0;
		//   90  197:iconst_0        
		//   91  198:istore          6
						for(int k2 = submenu.size(); l1 < k2;)
		//*  92  200:aload           13
		//*  93  202:invokeinterface #103 <Method int SubMenu.size()>
		//*  94  207:istore          9
		//*  95  209:iload           6
		//*  96  211:iload           9
		//*  97  213:icmpge          314
						{
							MenuItemImpl menuitemimpl = (MenuItemImpl)submenu.getItem(l1);
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
								e.add(((Object) (new k(menuitemimpl))));
		//  131  286:aload_0         
		//  132  287:getfield        #28  <Field ArrayList e>
		//  133  290:new             #100 <Class NavigationMenuPresenter$k>
		//  134  293:dup             
		//  135  294:aload           14
		//  136  296:invokespecial   #102 <Method void NavigationMenuPresenter$k(MenuItemImpl)>
		//  137  299:invokevirtual   #43  <Method boolean ArrayList.add(Object)>
		//  138  302:pop             
							}
							l1++;
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
							c(j2, e.size());
		//  148  318:aload_0         
		//  149  319:iload           8
		//  150  321:aload_0         
		//  151  322:getfield        #28  <Field ArrayList e>
		//  152  325:invokevirtual   #57  <Method int ArrayList.size()>
		//  153  328:invokespecial   #116 <Method void c(int, int)>
					}
					j = l;
		//  154  331:iload_2         
		//  155  332:istore_1        
					flag2 = flag3;
		//  156  333:iload           11
		//  157  335:istore          10
				} else
		//* 158  337:goto            501
				{
					int i1 = ((MenuItemImpl) (obj)).getGroupId();
		//  159  340:aload           12
		//  160  342:invokevirtual   #119 <Method int MenuItemImpl.getGroupId()>
		//  161  345:istore_3        
					if(i1 != k1)
		//* 162  346:iload_3         
		//* 163  347:iload           5
		//* 164  349:icmpeq          428
					{
						l = e.size();
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
						j = l;
		//  177  377:iload_2         
		//  178  378:istore_1        
						flag2 = flag3;
		//  179  379:iload           11
		//  180  381:istore          10
						if(j1 != 0)
		//* 181  383:iload           4
		//* 182  385:ifeq            470
						{
							j = l + 1;
		//  183  388:iload_2         
		//  184  389:iconst_1        
		//  185  390:iadd            
		//  186  391:istore_1        
							e.add(((Object) (new a(a.mPaddingSeparator, a.mPaddingSeparator))));
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
						j = l;
		//  203  428:iload_2         
		//  204  429:istore_1        
						flag2 = flag3;
		//  205  430:iload           11
		//  206  432:istore          10
						if(!flag3)
		//* 207  434:iload           11
		//* 208  436:ifne            470
						{
							j = l;
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
								c(l, e.size());
		//  218  456:aload_0         
		//  219  457:iload_2         
		//  220  458:aload_0         
		//  221  459:getfield        #28  <Field ArrayList e>
		//  222  462:invokevirtual   #57  <Method int ArrayList.size()>
		//  223  465:invokespecial   #116 <Method void c(int, int)>
								j = l;
		//  224  468:iload_2         
		//  225  469:istore_1        
							}
						}
					}
					obj = ((Object) (new k(((MenuItemImpl) (obj)))));
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
					k1 = i1;
		//  239  498:iload_3         
		//  240  499:istore          5
				}
				j1++;
		//  241  501:iload           4
		//  242  503:iconst_1        
		//  243  504:iadd            
		//  244  505:istore          4
				l = j;
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

		private void c(int j, int l)
		{
			for(; j < l; j++)
		//*   0    0:iload_1         
		//*   1    1:iload_2         
		//*   2    2:icmpge          27
				((k)e.get(j)).d = true;
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
			int j = 0;
		//   17   39:iconst_0        
		//   18   40:istore_1        
			for(int l = e.size(); j < l; j++)
		//*  19   41:aload_0         
		//*  20   42:getfield        #28  <Field ArrayList e>
		//*  21   45:invokevirtual   #57  <Method int ArrayList.size()>
		//*  22   48:istore_2        
		//*  23   49:iload_1         
		//*  24   50:iload_2         
		//*  25   51:icmpge          136
			{
				Object obj = ((Object) ((b)e.get(j)));
		//   26   54:aload_0         
		//   27   55:getfield        #28  <Field ArrayList e>
		//   28   58:iload_1         
		//   29   59:invokevirtual   #61  <Method Object ArrayList.get(int)>
		//   30   62:checkcast       #141 <Class NavigationMenuPresenter$b>
		//   31   65:astore_3        
				if(!(obj instanceof k))
					continue;
		//   32   66:aload_3         
		//   33   67:instanceof      #100 <Class NavigationMenuPresenter$k>
		//   34   70:ifeq            129
				MenuItemImpl menuitemimpl = ((k)obj).c();
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

		public void a(i j, int l)
		{
			switch(getItemViewType(l))
		//*   0    0:aload_0         
		//*   1    1:iload_2         
		//*   2    2:invokevirtual   #172 <Method int getItemViewType(int)>
			{
		//*   3    5:tableswitch     0 3: default 36
		//		               0 37
		//		               1 162
		//		               2 190
		//		               3 219
			default:
				return;
		//    4   36:return          

			case 0: // '\0'
				NavigationMenuItemView navigationmenuitemview = (NavigationMenuItemView)j.itemView;
		//    5   37:aload_1         
		//    6   38:getfield        #178 <Field View NavigationMenuPresenter$i.itemView>
		//    7   41:checkcast       #180 <Class NavigationMenuItemView>
		//    8   44:astore_3        
				navigationmenuitemview.setIconTintList(a.mIconTintList);
		//    9   45:aload_3         
		//   10   46:aload_0         
		//   11   47:getfield        #20  <Field NavigationMenuPresenter a>
		//   12   50:getfield        #184 <Field ColorStateList NavigationMenuPresenter.mIconTintList>
		//   13   53:invokevirtual   #188 <Method void NavigationMenuItemView.setIconTintList(ColorStateList)>
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
		//*  25   81:getfield        #201 <Field ColorStateList NavigationMenuPresenter.mTextColor>
		//*  26   84:ifnull          98
					navigationmenuitemview.setTextColor(a.mTextColor);
		//   27   87:aload_3         
		//   28   88:aload_0         
		//   29   89:getfield        #20  <Field NavigationMenuPresenter a>
		//   30   92:getfield        #201 <Field ColorStateList NavigationMenuPresenter.mTextColor>
		//   31   95:invokevirtual   #204 <Method void NavigationMenuItemView.setTextColor(ColorStateList)>
				if(a.mItemBackground != null)
		//*  32   98:aload_0         
		//*  33   99:getfield        #20  <Field NavigationMenuPresenter a>
		//*  34  102:getfield        #208 <Field Drawable NavigationMenuPresenter.mItemBackground>
		//*  35  105:ifnull          125
					j = ((i) (a.mItemBackground.getConstantState().newDrawable()));
		//   36  108:aload_0         
		//   37  109:getfield        #20  <Field NavigationMenuPresenter a>
		//   38  112:getfield        #208 <Field Drawable NavigationMenuPresenter.mItemBackground>
		//   39  115:invokevirtual   #214 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
		//   40  118:invokevirtual   #219 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
		//   41  121:astore_1        
				else
		//*  42  122:goto            127
					j = null;
		//   43  125:aconst_null     
		//   44  126:astore_1        
				ViewCompat.setBackground(((View) (navigationmenuitemview)), ((Drawable) (j)));
		//   45  127:aload_3         
		//   46  128:aload_1         
		//   47  129:invokestatic    #225 <Method void ViewCompat.setBackground(View, Drawable)>
				j = ((i) ((k)e.get(l)));
		//   48  132:aload_0         
		//   49  133:getfield        #28  <Field ArrayList e>
		//   50  136:iload_2         
		//   51  137:invokevirtual   #61  <Method Object ArrayList.get(int)>
		//   52  140:checkcast       #100 <Class NavigationMenuPresenter$k>
		//   53  143:astore_1        
				navigationmenuitemview.setNeedsEmptyIcon(((k) (j)).d);
		//   54  144:aload_3         
		//   55  145:aload_1         
		//   56  146:getfield        #121 <Field boolean NavigationMenuPresenter$k.d>
		//   57  149:invokevirtual   #228 <Method void NavigationMenuItemView.setNeedsEmptyIcon(boolean)>
				navigationmenuitemview.initialize(((k) (j)).c(), 0);
		//   58  152:aload_3         
		//   59  153:aload_1         
		//   60  154:invokevirtual   #144 <Method MenuItemImpl NavigationMenuPresenter$k.c()>
		//   61  157:iconst_0        
		//   62  158:invokevirtual   #232 <Method void NavigationMenuItemView.initialize(MenuItemImpl, int)>
				return;
		//   63  161:return          

			case 1: // '\001'
				((TextView)j.itemView).setText(((k)e.get(l)).c().getTitle());
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
				a a1 = (a)e.get(l);
		//   76  190:aload_0         
		//   77  191:getfield        #28  <Field ArrayList e>
		//   78  194:iload_2         
		//   79  195:invokevirtual   #61  <Method Object ArrayList.get(int)>
		//   80  198:checkcast       #91  <Class NavigationMenuPresenter$a>
		//   81  201:astore_3        
				j.itemView.setPadding(0, a1.d(), 0, a1.c());
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

		public void c(i j)
		{
			if(j instanceof f)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #257 <Class NavigationMenuPresenter$f>
		//*   2    4:ifeq            17
				((NavigationMenuItemView)j.itemView).recycle();
		//    3    7:aload_1         
		//    4    8:getfield        #178 <Field View NavigationMenuPresenter$i.itemView>
		//    5   11:checkcast       #180 <Class NavigationMenuItemView>
		//    6   14:invokevirtual   #260 <Method void NavigationMenuItemView.recycle()>
		//    7   17:return          
		}

		public i d(ViewGroup viewgroup, int j)
		{
			switch(j)
		//*   0    0:iload_2         
			{
		//*   1    1:tableswitch     0 3: default 32
		//		               0 35
		//		               1 58
		//		               2 74
		//		               3 90
		//*   2   32:goto            105
			case 0: // '\0'
				return ((i) (new f(a.mLayoutInflater, viewgroup, a.mOnClickListener)));
		//    3   35:new             #257 <Class NavigationMenuPresenter$f>
		//    4   38:dup             
		//    5   39:aload_0         
		//    6   40:getfield        #20  <Field NavigationMenuPresenter a>
		//    7   43:getfield        #265 <Field LayoutInflater NavigationMenuPresenter.mLayoutInflater>
		//    8   46:aload_1         
		//    9   47:aload_0         
		//   10   48:getfield        #20  <Field NavigationMenuPresenter a>
		//   11   51:getfield        #269 <Field android.view.View$OnClickListener NavigationMenuPresenter.mOnClickListener>
		//   12   54:invokespecial   #272 <Method void NavigationMenuPresenter$f(LayoutInflater, ViewGroup, android.view.View$OnClickListener)>
		//   13   57:areturn         

			case 1: // '\001'
				return ((i) (new g(a.mLayoutInflater, viewgroup)));
		//   14   58:new             #274 <Class NavigationMenuPresenter$g>
		//   15   61:dup             
		//   16   62:aload_0         
		//   17   63:getfield        #20  <Field NavigationMenuPresenter a>
		//   18   66:getfield        #265 <Field LayoutInflater NavigationMenuPresenter.mLayoutInflater>
		//   19   69:aload_1         
		//   20   70:invokespecial   #277 <Method void NavigationMenuPresenter$g(LayoutInflater, ViewGroup)>
		//   21   73:areturn         

			case 2: // '\002'
				return ((i) (new h(a.mLayoutInflater, viewgroup)));
		//   22   74:new             #279 <Class NavigationMenuPresenter$h>
		//   23   77:dup             
		//   24   78:aload_0         
		//   25   79:getfield        #20  <Field NavigationMenuPresenter a>
		//   26   82:getfield        #265 <Field LayoutInflater NavigationMenuPresenter.mLayoutInflater>
		//   27   85:aload_1         
		//   28   86:invokespecial   #280 <Method void NavigationMenuPresenter$h(LayoutInflater, ViewGroup)>
		//   29   89:areturn         

			case 3: // '\003'
				return ((i) (new c(((View) (a.mHeaderLayout)))));
		//   30   90:new             #282 <Class NavigationMenuPresenter$c>
		//   31   93:dup             
		//   32   94:aload_0         
		//   33   95:getfield        #20  <Field NavigationMenuPresenter a>
		//   34   98:getfield        #286 <Field LinearLayout NavigationMenuPresenter.mHeaderLayout>
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
			int i1 = bundle.getInt("android:menu:checked", 0);
		//    0    0:aload_1         
		//    1    1:ldc1            #129 <String "android:menu:checked">
		//    2    3:iconst_0        
		//    3    4:invokevirtual   #298 <Method int Bundle.getInt(String, int)>
		//    4    7:istore_3        
			if(i1 != 0)
		//*   5    8:iload_3         
		//*   6    9:ifeq            104
			{
				c = true;
		//    7   12:aload_0         
		//    8   13:iconst_1        
		//    9   14:putfield        #33  <Field boolean c>
				int j = 0;
		//   10   17:iconst_0        
		//   11   18:istore_2        
				for(int k1 = e.size(); j < k1; j++)
		//*  12   19:aload_0         
		//*  13   20:getfield        #28  <Field ArrayList e>
		//*  14   23:invokevirtual   #57  <Method int ArrayList.size()>
		//*  15   26:istore          4
		//*  16   28:iload_2         
		//*  17   29:iload           4
		//*  18   31:icmpge          95
				{
					Object obj = ((Object) ((b)e.get(j)));
		//   19   34:aload_0         
		//   20   35:getfield        #28  <Field ArrayList e>
		//   21   38:iload_2         
		//   22   39:invokevirtual   #61  <Method Object ArrayList.get(int)>
		//   23   42:checkcast       #141 <Class NavigationMenuPresenter$b>
		//   24   45:astore          5
					if(!(obj instanceof k))
						continue;
		//   25   47:aload           5
		//   26   49:instanceof      #100 <Class NavigationMenuPresenter$k>
		//   27   52:ifeq            88
					obj = ((Object) (((k)obj).c()));
		//   28   55:aload           5
		//   29   57:checkcast       #100 <Class NavigationMenuPresenter$k>
		//   30   60:invokevirtual   #144 <Method MenuItemImpl NavigationMenuPresenter$k.c()>
		//   31   63:astore          5
					if(obj == null || ((MenuItemImpl) (obj)).getItemId() != i1)
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
				int l = 0;
		//   58  115:iconst_0        
		//   59  116:istore_2        
				for(int j1 = e.size(); l < j1; l++)
		//*  60  117:aload_0         
		//*  61  118:getfield        #28  <Field ArrayList e>
		//*  62  121:invokevirtual   #57  <Method int ArrayList.size()>
		//*  63  124:istore_3        
		//*  64  125:iload_2         
		//*  65  126:iload_3         
		//*  66  127:icmpge          223
				{
					Object obj1 = ((Object) ((b)e.get(l)));
		//   67  130:aload_0         
		//   68  131:getfield        #28  <Field ArrayList e>
		//   69  134:iload_2         
		//   70  135:invokevirtual   #61  <Method Object ArrayList.get(int)>
		//   71  138:checkcast       #141 <Class NavigationMenuPresenter$b>
		//   72  141:astore          5
					if(!(obj1 instanceof k))
		//*  73  143:aload           5
		//*  74  145:instanceof      #100 <Class NavigationMenuPresenter$k>
		//*  75  148:ifne            154
						continue;
		//   76  151:goto            216
					Object obj2 = ((Object) (((k)obj1).c()));
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

		public long getItemId(int j)
		{
			return (long)j;
		//    0    0:iload_1         
		//    1    1:i2l             
		//    2    2:lreturn         
		}

		public int getItemViewType(int j)
		{
			b b1 = (b)e.get(j);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field ArrayList e>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #61  <Method Object ArrayList.get(int)>
		//    4    8:checkcast       #141 <Class NavigationMenuPresenter$b>
		//    5   11:astore_2        
			if(b1 instanceof a)
		//*   6   12:aload_2         
		//*   7   13:instanceof      #91  <Class NavigationMenuPresenter$a>
		//*   8   16:ifeq            21
				return 2;
		//    9   19:iconst_2        
		//   10   20:ireturn         
			if(b1 instanceof e)
		//*  11   21:aload_2         
		//*  12   22:instanceof      #38  <Class NavigationMenuPresenter$e>
		//*  13   25:ifeq            30
				return 3;
		//   14   28:iconst_3        
		//   15   29:ireturn         
			if(b1 instanceof k)
		//*  16   30:aload_2         
		//*  17   31:instanceof      #100 <Class NavigationMenuPresenter$k>
		//*  18   34:ifeq            54
				return !((k)b1).c().hasSubMenu() ? 0 : 1;
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

		public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int j)
		{
			a((i)viewholder, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #174 <Class NavigationMenuPresenter$i>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #319 <Method void a(NavigationMenuPresenter$i, int)>
		//    5    9:return          
		}

		public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int j)
		{
			return ((android.support.v7.widget.RecyclerView.ViewHolder) (d(viewgroup, j)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokevirtual   #323 <Method NavigationMenuPresenter$i d(ViewGroup, int)>
		//    4    6:areturn         
		}

		public void onViewRecycled(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			c((i)viewholder);
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

		d()
		{
			a = NavigationMenuPresenter.this;
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

	static class e
		implements b
	{

		e()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class f extends i
	{

		public f(LayoutInflater layoutinflater, ViewGroup viewgroup, android.view.View.OnClickListener onclicklistener)
		{
			super(layoutinflater.inflate(android.support.design.R.layout.design_navigation_item, viewgroup, false));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getstatic       #15  <Field int android.support.design.R$layout.design_navigation_item>
		//    3    5:aload_2         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #21  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//    6   10:invokespecial   #24  <Method void NavigationMenuPresenter$i(View)>
			itemView.setOnClickListener(onclicklistener);
		//    7   13:aload_0         
		//    8   14:getfield        #28  <Field View itemView>
		//    9   17:aload_3         
		//   10   18:invokevirtual   #34  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		//   11   21:return          
		}
	}

	static class g extends i
	{

		public g(LayoutInflater layoutinflater, ViewGroup viewgroup)
		{
			super(layoutinflater.inflate(android.support.design.R.layout.design_navigation_item_subheader, viewgroup, false));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getstatic       #15  <Field int android.support.design.R$layout.design_navigation_item_subheader>
		//    3    5:aload_2         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #21  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//    6   10:invokespecial   #24  <Method void NavigationMenuPresenter$i(View)>
		//    7   13:return          
		}
	}

	static class h extends i
	{

		public h(LayoutInflater layoutinflater, ViewGroup viewgroup)
		{
			super(layoutinflater.inflate(android.support.design.R.layout.design_navigation_item_separator, viewgroup, false));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getstatic       #15  <Field int android.support.design.R$layout.design_navigation_item_separator>
		//    3    5:aload_2         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #21  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//    6   10:invokespecial   #24  <Method void NavigationMenuPresenter$i(View)>
		//    7   13:return          
		}
	}

	static abstract class i extends android.support.v7.widget.RecyclerView.ViewHolder
	{

		public i(View view)
		{
			super(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
		//    3    5:return          
		}
	}

	static class k
		implements b
	{

		public MenuItemImpl c()
		{
			return e;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field MenuItemImpl e>
		//    2    4:areturn         
		}

		boolean d;
		private final MenuItemImpl e;

		k(MenuItemImpl menuitemimpl)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			e = menuitemimpl;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field MenuItemImpl e>
		//    5    9:return          
		}
	}


	public NavigationMenuPresenter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #8   <Class NavigationMenuPresenter$3>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #85  <Method void NavigationMenuPresenter$3(NavigationMenuPresenter)>
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
		int j = windowinsetscompat.getSystemWindowInsetTop();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #120 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//    2    4:istore_2        
		if(mPaddingTopDefault != j)
	//*   3    5:aload_0         
	//*   4    6:getfield        #122 <Field int mPaddingTopDefault>
	//*   5    9:iload_2         
	//*   6   10:icmpeq          48
		{
			mPaddingTopDefault = j;
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

	public View getHeaderView(int j)
	{
		return mHeaderLayout.getChildAt(j);
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
	//*  13   27:getfield        #172 <Field NavigationMenuPresenter$d mAdapter>
	//*  14   30:ifnonnull       45
				mAdapter = new d();
	//   15   33:aload_0         
	//   16   34:new             #19  <Class NavigationMenuPresenter$d>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #173 <Method void NavigationMenuPresenter$d(NavigationMenuPresenter)>
	//   20   42:putfield        #172 <Field NavigationMenuPresenter$d mAdapter>
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
	//   34   72:getfield        #172 <Field NavigationMenuPresenter$d mAdapter>
	//   35   75:invokevirtual   #180 <Method void NavigationMenuView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
		}
		return ((MenuView) (mMenuView));
	//   36   78:aload_0         
	//   37   79:getfield        #100 <Field NavigationMenuView mMenuView>
	//   38   82:areturn         
	}

	public View inflateHeaderView(int j)
	{
		View view = mLayoutInflater.inflate(j, ((ViewGroup) (mHeaderLayout)), false);
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
				mAdapter.e(((Bundle) (obj)));
	//   22   42:aload_0         
	//   23   43:getfield        #172 <Field NavigationMenuPresenter$d mAdapter>
	//   24   46:aload_2         
	//   25   47:invokevirtual   #238 <Method void NavigationMenuPresenter$d.e(Bundle)>
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
	//   35   66:invokevirtual   #239 <Method void LinearLayout.restoreHierarchyState(SparseArray)>
		}
	//   36   69:return          
	}

	public Parcelable onSaveInstanceState()
	{
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #246 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          98
		{
			Bundle bundle = new Bundle();
	//    3    8:new             #223 <Class Bundle>
	//    4   11:dup             
	//    5   12:invokespecial   #247 <Method void Bundle()>
	//    6   15:astore_1        
			if(mMenuView != null)
	//*   7   16:aload_0         
	//*   8   17:getfield        #100 <Field NavigationMenuView mMenuView>
	//*   9   20:ifnull          46
			{
				SparseArray sparsearray = new SparseArray();
	//   10   23:new             #249 <Class SparseArray>
	//   11   26:dup             
	//   12   27:invokespecial   #250 <Method void SparseArray()>
	//   13   30:astore_2        
				mMenuView.saveHierarchyState(sparsearray);
	//   14   31:aload_0         
	//   15   32:getfield        #100 <Field NavigationMenuView mMenuView>
	//   16   35:aload_2         
	//   17   36:invokevirtual   #253 <Method void NavigationMenuView.saveHierarchyState(SparseArray)>
				bundle.putSparseParcelableArray("android:menu:list", sparsearray);
	//   18   39:aload_1         
	//   19   40:ldc1            #52  <String "android:menu:list">
	//   20   42:aload_2         
	//   21   43:invokevirtual   #257 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
			}
			if(mAdapter != null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #172 <Field NavigationMenuPresenter$d mAdapter>
	//*  24   50:ifnull          66
				bundle.putBundle("android:menu:adapter", mAdapter.a());
	//   25   53:aload_1         
	//   26   54:ldc1            #46  <String "android:menu:adapter">
	//   27   56:aload_0         
	//   28   57:getfield        #172 <Field NavigationMenuPresenter$d mAdapter>
	//   29   60:invokevirtual   #260 <Method Bundle NavigationMenuPresenter$d.a()>
	//   30   63:invokevirtual   #264 <Method void Bundle.putBundle(String, Bundle)>
			if(mHeaderLayout != null)
	//*  31   66:aload_0         
	//*  32   67:getfield        #93  <Field LinearLayout mHeaderLayout>
	//*  33   70:ifnull          96
			{
				SparseArray sparsearray1 = new SparseArray();
	//   34   73:new             #249 <Class SparseArray>
	//   35   76:dup             
	//   36   77:invokespecial   #250 <Method void SparseArray()>
	//   37   80:astore_2        
				mHeaderLayout.saveHierarchyState(sparsearray1);
	//   38   81:aload_0         
	//   39   82:getfield        #93  <Field LinearLayout mHeaderLayout>
	//   40   85:aload_2         
	//   41   86:invokevirtual   #265 <Method void LinearLayout.saveHierarchyState(SparseArray)>
				bundle.putSparseParcelableArray("android:menu:header", sparsearray1);
	//   42   89:aload_1         
	//   43   90:ldc1            #49  <String "android:menu:header">
	//   44   92:aload_2         
	//   45   93:invokevirtual   #257 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
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
	//    3    5:invokevirtual   #271 <Method void LinearLayout.removeView(View)>
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
		mAdapter.d(menuitemimpl);
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field NavigationMenuPresenter$d mAdapter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #277 <Method void NavigationMenuPresenter$d.d(MenuItemImpl)>
	//    4    8:return          
	}

	public void setId(int j)
	{
		mId = j;
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
	//    5    7:invokevirtual   #285 <Method void updateMenuView(boolean)>
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
	//    5    7:invokevirtual   #285 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setItemTextAppearance(int j)
	{
		mTextAppearance = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #291 <Field int mTextAppearance>
		mTextAppearanceSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #293 <Field boolean mTextAppearanceSet>
		updateMenuView(false);
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #285 <Method void updateMenuView(boolean)>
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
	//    5    7:invokevirtual   #285 <Method void updateMenuView(boolean)>
	//    6   10:return          
	}

	public void setUpdateSuspended(boolean flag)
	{
		if(mAdapter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field NavigationMenuPresenter$d mAdapter>
	//*   2    4:ifnull          15
			mAdapter.d(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #172 <Field NavigationMenuPresenter$d mAdapter>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #297 <Method void NavigationMenuPresenter$d.d(boolean)>
	//    7   15:return          
	}

	public void updateMenuView(boolean flag)
	{
		if(mAdapter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field NavigationMenuPresenter$d mAdapter>
	//*   2    4:ifnull          14
			mAdapter.b();
	//    3    7:aload_0         
	//    4    8:getfield        #172 <Field NavigationMenuPresenter$d mAdapter>
	//    5   11:invokevirtual   #299 <Method void NavigationMenuPresenter$d.b()>
	//    6   14:return          
	}

	private static final String STATE_ADAPTER = "android:menu:adapter";
	private static final String STATE_HEADER = "android:menu:header";
	private static final String STATE_HIERARCHY = "android:menu:list";
	d mAdapter;
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
			a.setUpdateSuspended(true);
		//    3    5:aload_0         
		//    4    6:getfield        #14  <Field NavigationMenuPresenter a>
		//    5    9:iconst_1        
		//    6   10:invokevirtual   #26  <Method void NavigationMenuPresenter.setUpdateSuspended(boolean)>
			view = ((View) (((NavigationMenuItemView) (view)).getItemData()));
		//    7   13:aload_1         
		//    8   14:invokevirtual   #30  <Method MenuItemImpl NavigationMenuItemView.getItemData()>
		//    9   17:astore_1        
			boolean flag = a.mMenu.performItemAction(((android.view.MenuItem) (view)), ((MenuPresenter) (a)), 0);
		//   10   18:aload_0         
		//   11   19:getfield        #14  <Field NavigationMenuPresenter a>
		//   12   22:getfield        #34  <Field MenuBuilder NavigationMenuPresenter.mMenu>
		//   13   25:aload_1         
		//   14   26:aload_0         
		//   15   27:getfield        #14  <Field NavigationMenuPresenter a>
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
				a.mAdapter.d(((MenuItemImpl) (view)));
		//   26   50:aload_0         
		//   27   51:getfield        #14  <Field NavigationMenuPresenter a>
		//   28   54:getfield        #50  <Field NavigationMenuPresenter$d NavigationMenuPresenter.mAdapter>
		//   29   57:aload_1         
		//   30   58:invokevirtual   #56  <Method void NavigationMenuPresenter$d.d(MenuItemImpl)>
			a.setUpdateSuspended(false);
		//   31   61:aload_0         
		//   32   62:getfield        #14  <Field NavigationMenuPresenter a>
		//   33   65:iconst_0        
		//   34   66:invokevirtual   #26  <Method void NavigationMenuPresenter.setUpdateSuspended(boolean)>
			a.updateMenuView(false);
		//   35   69:aload_0         
		//   36   70:getfield        #14  <Field NavigationMenuPresenter a>
		//   37   73:iconst_0        
		//   38   74:invokevirtual   #59  <Method void NavigationMenuPresenter.updateMenuView(boolean)>
		//   39   77:return          
		}

		final NavigationMenuPresenter a;

			
			{
				a = NavigationMenuPresenter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field NavigationMenuPresenter a>
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
