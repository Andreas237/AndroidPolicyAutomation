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

class CascadingMenuPopup$3$1
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
	//    4    8:getfield        #23  <Field CascadingMenuPopup$3 this$1>
	//    5   11:getfield        #38  <Field CascadingMenuPopup CascadingMenuPopup$3.this$0>
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
	//   14   30:getfield        #23  <Field CascadingMenuPopup$3 this$1>
	//   15   33:getfield        #38  <Field CascadingMenuPopup CascadingMenuPopup$3.this$0>
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

	final CascadingMenuPopup._cls3 this$1;
	final MenuItem val$item;
	final MenuBuilder val$menu;
	final adingMenuInfo val$nextInfo;

	CascadingMenuPopup$3$1()
	{
		this$1 = final__pcls3;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field CascadingMenuPopup$3 this$1>
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

	// Unreferenced inner class android/support/v7/view/menu/CascadingMenuPopup$3

/* anonymous class */
	class CascadingMenuPopup._cls3
		implements MenuItemHoverListener
	{

		public void onItemHoverEnter(MenuBuilder menubuilder, final MenuItem item)
		{
			int i;
			final CascadingMenuPopup.CascadingMenuInfo nextInfo;
label0:
			{
				Handler handler = mSubMenuHoverHandler;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field CascadingMenuPopup this$0>
		//    2    4:getfield        #27  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
		//    3    7:astore          8
				nextInfo = null;
		//    4    9:aconst_null     
		//    5   10:astore          7
				handler.removeCallbacksAndMessages(((Object) (null)));
		//    6   12:aload           8
		//    7   14:aconst_null     
		//    8   15:invokevirtual   #33  <Method void Handler.removeCallbacksAndMessages(Object)>
				int j = mShowingMenus.size();
		//    9   18:aload_0         
		//   10   19:getfield        #16  <Field CascadingMenuPopup this$0>
		//   11   22:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//   12   25:invokeinterface #43  <Method int List.size()>
		//   13   30:istore          4
				for(i = 0; i < j; i++)
		//*  14   32:iconst_0        
		//*  15   33:istore_3        
		//*  16   34:iload_3         
		//*  17   35:iload           4
		//*  18   37:icmpge          73
					if(menubuilder == ((CascadingMenuPopup.CascadingMenuInfo)mShowingMenus.get(i)).menu)
		//*  19   40:aload_1         
		//*  20   41:aload_0         
		//*  21   42:getfield        #16  <Field CascadingMenuPopup this$0>
		//*  22   45:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//*  23   48:iload_3         
		//*  24   49:invokeinterface #47  <Method Object List.get(int)>
		//*  25   54:checkcast       #49  <Class CascadingMenuPopup$CascadingMenuInfo>
		//*  26   57:getfield        #53  <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
		//*  27   60:if_acmpne       66
						break label0;
		//   28   63:goto            75

		//   29   66:iload_3         
		//   30   67:iconst_1        
		//   31   68:iadd            
		//   32   69:istore_3        
		//*  33   70:goto            34
				i = -1;
		//   34   73:iconst_m1       
		//   35   74:istore_3        
			}
			if(i == -1)
		//*  36   75:iload_3         
		//*  37   76:iconst_m1       
		//*  38   77:icmpne          81
				return;
		//   39   80:return          
			i++;
		//   40   81:iload_3         
		//   41   82:iconst_1        
		//   42   83:iadd            
		//   43   84:istore_3        
			if(i < mShowingMenus.size())
		//*  44   85:iload_3         
		//*  45   86:aload_0         
		//*  46   87:getfield        #16  <Field CascadingMenuPopup this$0>
		//*  47   90:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//*  48   93:invokeinterface #43  <Method int List.size()>
		//*  49   98:icmpge          119
				nextInfo = (CascadingMenuPopup.CascadingMenuInfo)mShowingMenus.get(i);
		//   50  101:aload_0         
		//   51  102:getfield        #16  <Field CascadingMenuPopup this$0>
		//   52  105:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//   53  108:iload_3         
		//   54  109:invokeinterface #47  <Method Object List.get(int)>
		//   55  114:checkcast       #49  <Class CascadingMenuPopup$CascadingMenuInfo>
		//   56  117:astore          7
			item = ((MenuItem) (((CascadingMenuPopup._cls3._cls1) (menubuilder)). new CascadingMenuPopup._cls3._cls1()));
		//   57  119:new             #10  <Class CascadingMenuPopup$3$1>
		//   58  122:dup             
		//   59  123:aload_0         
		//   60  124:aload           7
		//   61  126:aload_2         
		//   62  127:aload_1         
		//   63  128:invokespecial   #56  <Method void CascadingMenuPopup$3$1(CascadingMenuPopup$3, CascadingMenuPopup$CascadingMenuInfo, MenuItem, MenuBuilder)>
		//   64  131:astore_2        
			long l = SystemClock.uptimeMillis();
		//   65  132:invokestatic    #62  <Method long SystemClock.uptimeMillis()>
		//   66  135:lstore          5
			mSubMenuHoverHandler.postAtTime(((Runnable) (item)), ((Object) (menubuilder)), l + 200L);
		//   67  137:aload_0         
		//   68  138:getfield        #16  <Field CascadingMenuPopup this$0>
		//   69  141:getfield        #27  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
		//   70  144:aload_2         
		//   71  145:aload_1         
		//   72  146:lload           5
		//   73  148:ldc2w           #63  <Long 200L>
		//   74  151:ladd            
		//   75  152:invokevirtual   #68  <Method boolean Handler.postAtTime(Runnable, Object, long)>
		//   76  155:pop             
		//   77  156:return          
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
