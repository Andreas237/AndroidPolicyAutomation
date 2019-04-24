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

class CascadingMenuPopup$2$1
	implements Runnable
{

	public void run()
	{
		if(val$nextInfo != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
	//*   2    4:ifnull          40
		{
			mShouldCloseImmediately = true;
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field CascadingMenuPopup$2 this$1>
	//    5   11:getfield        #38  <Field CascadingMenuPopup CascadingMenuPopup$2.this$0>
	//    6   14:iconst_1        
	//    7   15:putfield        #44  <Field boolean CascadingMenuPopup.mShouldCloseImmediately>
			val$nextInfo.menu.close(false);
	//    8   18:aload_0         
	//    9   19:getfield        #25  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
	//   10   22:getfield        #49  <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//   11   25:iconst_0        
	//   12   26:invokevirtual   #55  <Method void MenuBuilder.close(boolean)>
			mShouldCloseImmediately = false;
	//   13   29:aload_0         
	//   14   30:getfield        #23  <Field CascadingMenuPopup$2 this$1>
	//   15   33:getfield        #38  <Field CascadingMenuPopup CascadingMenuPopup$2.this$0>
	//   16   36:iconst_0        
	//   17   37:putfield        #44  <Field boolean CascadingMenuPopup.mShouldCloseImmediately>
		}
		if(val$item.isEnabled() && val$item.hasSubMenu())
	//*  18   40:aload_0         
	//*  19   41:getfield        #27  <Field MenuItem val$item>
	//*  20   44:invokeinterface #61  <Method boolean MenuItem.isEnabled()>
	//*  21   49:ifeq            77
	//*  22   52:aload_0         
	//*  23   53:getfield        #27  <Field MenuItem val$item>
	//*  24   56:invokeinterface #64  <Method boolean MenuItem.hasSubMenu()>
	//*  25   61:ifeq            77
			val$menu.performItemAction(val$item, 4);
	//   26   64:aload_0         
	//   27   65:getfield        #29  <Field MenuBuilder val$menu>
	//   28   68:aload_0         
	//   29   69:getfield        #27  <Field MenuItem val$item>
	//   30   72:iconst_4        
	//   31   73:invokevirtual   #68  <Method boolean MenuBuilder.performItemAction(MenuItem, int)>
	//   32   76:pop             
	//   33   77:return          
	}

	final CascadingMenuPopup._cls2 this$1;
	final MenuItem val$item;
	final MenuBuilder val$menu;
	final adingMenuInfo val$nextInfo;

	CascadingMenuPopup$2$1()
	{
		this$1 = final__pcls2;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field CascadingMenuPopup$2 this$1>
		val$nextInfo = adingmenuinfo;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
		val$item = menuitem;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field MenuItem val$item>
		val$menu = MenuBuilder.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field MenuBuilder val$menu>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}

	// Unreferenced inner class android/support/v7/view/menu/CascadingMenuPopup$2

/* anonymous class */
	class CascadingMenuPopup._cls2
		implements MenuItemHoverListener
	{

		public void onItemHoverEnter(MenuBuilder menubuilder, final MenuItem item)
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
			do
			{
				j = ((int) (byte0));
		//   14   30:iload           5
		//   15   32:istore          4
				if(i >= k)
					break;
		//   16   34:iload_3         
		//   17   35:iload           6
		//   18   37:icmpge          76
				if(menubuilder == ((CascadingMenuPopup.CascadingMenuInfo)mShowingMenus.get(i)).menu)
		//*  19   40:aload_1         
		//*  20   41:aload_0         
		//*  21   42:getfield        #16  <Field CascadingMenuPopup this$0>
		//*  22   45:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//*  23   48:iload_3         
		//*  24   49:invokeinterface #47  <Method Object List.get(int)>
		//*  25   54:checkcast       #49  <Class CascadingMenuPopup$CascadingMenuInfo>
		//*  26   57:getfield        #53  <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
		//*  27   60:if_acmpne       69
				{
					j = i;
		//   28   63:iload_3         
		//   29   64:istore          4
					break;
		//   30   66:goto            76
				}
				i++;
		//   31   69:iload_3         
		//   32   70:iconst_1        
		//   33   71:iadd            
		//   34   72:istore_3        
			} while(true);
		//   35   73:goto            30
			if(j == -1)
		//*  36   76:iload           4
		//*  37   78:iconst_m1       
		//*  38   79:icmpne          83
				return;
		//   39   82:return          
			i = j + 1;
		//   40   83:iload           4
		//   41   85:iconst_1        
		//   42   86:iadd            
		//   43   87:istore_3        
			final CascadingMenuPopup.CascadingMenuInfo nextInfo;
			if(i < mShowingMenus.size())
		//*  44   88:iload_3         
		//*  45   89:aload_0         
		//*  46   90:getfield        #16  <Field CascadingMenuPopup this$0>
		//*  47   93:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//*  48   96:invokeinterface #43  <Method int List.size()>
		//*  49  101:icmpge          125
				nextInfo = (CascadingMenuPopup.CascadingMenuInfo)mShowingMenus.get(i);
		//   50  104:aload_0         
		//   51  105:getfield        #16  <Field CascadingMenuPopup this$0>
		//   52  108:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//   53  111:iload_3         
		//   54  112:invokeinterface #47  <Method Object List.get(int)>
		//   55  117:checkcast       #49  <Class CascadingMenuPopup$CascadingMenuInfo>
		//   56  120:astore          9
			else
		//*  57  122:goto            128
				nextInfo = null;
		//   58  125:aconst_null     
		//   59  126:astore          9
			item = ((MenuItem) (((CascadingMenuPopup._cls2._cls1) (menubuilder)). new CascadingMenuPopup._cls2._cls1()));
		//   60  128:new             #10  <Class CascadingMenuPopup$2$1>
		//   61  131:dup             
		//   62  132:aload_0         
		//   63  133:aload           9
		//   64  135:aload_2         
		//   65  136:aload_1         
		//   66  137:invokespecial   #56  <Method void CascadingMenuPopup$2$1(CascadingMenuPopup$2, CascadingMenuPopup$CascadingMenuInfo, MenuItem, MenuBuilder)>
		//   67  140:astore_2        
			long l = SystemClock.uptimeMillis();
		//   68  141:invokestatic    #62  <Method long SystemClock.uptimeMillis()>
		//   69  144:lstore          7
			mSubMenuHoverHandler.postAtTime(((Runnable) (item)), ((Object) (menubuilder)), l + 200L);
		//   70  146:aload_0         
		//   71  147:getfield        #16  <Field CascadingMenuPopup this$0>
		//   72  150:getfield        #27  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
		//   73  153:aload_2         
		//   74  154:aload_1         
		//   75  155:lload           7
		//   76  157:ldc2w           #63  <Long 200L>
		//   77  160:ladd            
		//   78  161:invokevirtual   #68  <Method boolean Handler.postAtTime(Runnable, Object, long)>
		//   79  164:pop             
		//   80  165:return          
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

}
