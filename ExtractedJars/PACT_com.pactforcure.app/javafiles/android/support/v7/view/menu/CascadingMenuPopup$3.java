// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.MenuItemHoverListener;
import android.view.MenuItem;
import java.util.List;

// Referenced classes of package android.support.v7.view.menu:
//			CascadingMenuPopup, MenuBuilder

class CascadingMenuPopup$3
	implements MenuItemHoverListener
{

	public void onItemHoverEnter(final MenuBuilder menu, final MenuItem item)
	{
		mSubMenuHoverHandler.removeCallbacksAndMessages(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CascadingMenuPopup this$0>
	//    2    4:getfield        #27  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #33  <Method void Handler.removeCallbacksAndMessages(Object)>
		byte byte0 = -1;
	//    5   11:iconst_m1       
	//    6   12:istore          5
		int i = 0;
	//    7   14:iconst_0        
	//    8   15:istore_3        
		int k = mShowingMenus.size();
	//    9   16:aload_0         
	//   10   17:getfield        #16  <Field CascadingMenuPopup this$0>
	//   11   20:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
	//   12   23:invokeinterface #43  <Method int List.size()>
	//   13   28:istore          6
		int j;
label0:
		do
		{
label1:
			{
				j = ((int) (byte0));
	//   14   30:iload           5
	//   15   32:istore          4
				if(i < k)
	//*  16   34:iload_3         
	//*  17   35:iload           6
	//*  18   37:icmpge          66
				{
					if(menu != ((scadingMenuInfo)mShowingMenus.get(i)).menu)
						break label1;
	//   19   40:aload_1         
	//   20   41:aload_0         
	//   21   42:getfield        #16  <Field CascadingMenuPopup this$0>
	//   22   45:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
	//   23   48:iload_3         
	//   24   49:invokeinterface #47  <Method Object List.get(int)>
	//   25   54:checkcast       #49  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   26   57:getfield        #53  <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//   27   60:if_acmpne       73
					j = i;
	//   28   63:iload_3         
	//   29   64:istore          4
				}
				if(j == -1)
	//*  30   66:iload           4
	//*  31   68:iconst_m1       
	//*  32   69:icmpne          80
					return;
	//   33   72:return          
				break label0;
			}
			i++;
	//   34   73:iload_3         
	//   35   74:iconst_1        
	//   36   75:iadd            
	//   37   76:istore_3        
		} while(true);
	//   38   77:goto            30
		i = j + 1;
	//   39   80:iload           4
	//   40   82:iconst_1        
	//   41   83:iadd            
	//   42   84:istore_3        
		long l;
		final scadingMenuInfo nextInfo;
		if(i < mShowingMenus.size())
	//*  43   85:iload_3         
	//*  44   86:aload_0         
	//*  45   87:getfield        #16  <Field CascadingMenuPopup this$0>
	//*  46   90:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
	//*  47   93:invokeinterface #43  <Method int List.size()>
	//*  48   98:icmpge          157
			nextInfo = (scadingMenuInfo)mShowingMenus.get(i);
	//   49  101:aload_0         
	//   50  102:getfield        #16  <Field CascadingMenuPopup this$0>
	//   51  105:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
	//   52  108:iload_3         
	//   53  109:invokeinterface #47  <Method Object List.get(int)>
	//   54  114:checkcast       #49  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   55  117:astore          9
		else
	//*  56  119:new             #10  <Class CascadingMenuPopup$3$1>
	//*  57  122:dup             
	//*  58  123:aload_0         
	//*  59  124:aload           9
	//*  60  126:aload_2         
	//*  61  127:aload_1         
	//*  62  128:invokespecial   #56  <Method void CascadingMenuPopup$3$1(CascadingMenuPopup$3, CascadingMenuPopup$CascadingMenuInfo, MenuItem, MenuBuilder)>
	//*  63  131:astore_2        
	//*  64  132:invokestatic    #62  <Method long SystemClock.uptimeMillis()>
	//*  65  135:lstore          7
	//*  66  137:aload_0         
	//*  67  138:getfield        #16  <Field CascadingMenuPopup this$0>
	//*  68  141:getfield        #27  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
	//*  69  144:aload_2         
	//*  70  145:aload_1         
	//*  71  146:lload           7
	//*  72  148:ldc2w           #63  <Long 200L>
	//*  73  151:ladd            
	//*  74  152:invokevirtual   #68  <Method boolean Handler.postAtTime(Runnable, Object, long)>
	//*  75  155:pop             
	//*  76  156:return          
			nextInfo = null;
	//   77  157:aconst_null     
	//   78  158:astore          9
		item = ((MenuItem) (new Runnable() {

			public void run()
			{
				if(nextInfo != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #25  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
			//*   2    4:ifnull          40
				{
					mShouldCloseImmediately = true;
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field CascadingMenuPopup$3 this$1>
			//    5   11:getfield        #38  <Field CascadingMenuPopup CascadingMenuPopup$3.this$0>
			//    6   14:iconst_1        
			//    7   15:putfield        #44  <Field boolean CascadingMenuPopup.mShouldCloseImmediately>
					nextInfo.menu.close(false);
			//    8   18:aload_0         
			//    9   19:getfield        #25  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
			//   10   22:getfield        #49  <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
			//   11   25:iconst_0        
			//   12   26:invokevirtual   #55  <Method void MenuBuilder.close(boolean)>
					mShouldCloseImmediately = false;
			//   13   29:aload_0         
			//   14   30:getfield        #23  <Field CascadingMenuPopup$3 this$1>
			//   15   33:getfield        #38  <Field CascadingMenuPopup CascadingMenuPopup$3.this$0>
			//   16   36:iconst_0        
			//   17   37:putfield        #44  <Field boolean CascadingMenuPopup.mShouldCloseImmediately>
				}
				if(item.isEnabled() && item.hasSubMenu())
			//*  18   40:aload_0         
			//*  19   41:getfield        #27  <Field MenuItem val$item>
			//*  20   44:invokeinterface #61  <Method boolean MenuItem.isEnabled()>
			//*  21   49:ifeq            77
			//*  22   52:aload_0         
			//*  23   53:getfield        #27  <Field MenuItem val$item>
			//*  24   56:invokeinterface #64  <Method boolean MenuItem.hasSubMenu()>
			//*  25   61:ifeq            77
					menu.performItemAction(item, 4);
			//   26   64:aload_0         
			//   27   65:getfield        #29  <Field MenuBuilder val$menu>
			//   28   68:aload_0         
			//   29   69:getfield        #27  <Field MenuItem val$item>
			//   30   72:iconst_4        
			//   31   73:invokevirtual   #68  <Method boolean MenuBuilder.performItemAction(MenuItem, int)>
			//   32   76:pop             
			//   33   77:return          
			}

			final CascadingMenuPopup._cls3 this$1;
			final MenuItem val$item;
			final MenuBuilder val$menu;
			final CascadingMenuPopup.CascadingMenuInfo val$nextInfo;

			
			{
				this$1 = CascadingMenuPopup._cls3.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CascadingMenuPopup$3 this$1>
				nextInfo = cascadingmenuinfo;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
				item = menuitem;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field MenuItem val$item>
				menu = menubuilder;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field MenuBuilder val$menu>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
));
		l = SystemClock.uptimeMillis();
		mSubMenuHoverHandler.postAtTime(((Runnable) (item)), ((Object) (menu)), l + 200L);
	//*  79  160:goto            119
	}

	public void onItemHoverExit(MenuBuilder menubuilder, MenuItem menuitem)
	{
		mSubMenuHoverHandler.removeCallbacksAndMessages(((Object) (menubuilder)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CascadingMenuPopup this$0>
	//    2    4:getfield        #27  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #33  <Method void Handler.removeCallbacksAndMessages(Object)>
	//    5   11:return          
	}

	final CascadingMenuPopup this$0;

	CascadingMenuPopup$3()
	{
		this$0 = CascadingMenuPopup.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field CascadingMenuPopup this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
