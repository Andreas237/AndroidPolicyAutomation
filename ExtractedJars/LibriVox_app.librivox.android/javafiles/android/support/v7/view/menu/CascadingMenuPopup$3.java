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
		int i;
		final scadingMenuInfo nextInfo;
label0:
		{
			Handler handler = mSubMenuHoverHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field CascadingMenuPopup this$0>
	//    2    4:getfield        #24  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
	//    3    7:astore          8
			nextInfo = null;
	//    4    9:aconst_null     
	//    5   10:astore          7
			handler.removeCallbacksAndMessages(((Object) (null)));
	//    6   12:aload           8
	//    7   14:aconst_null     
	//    8   15:invokevirtual   #30  <Method void Handler.removeCallbacksAndMessages(Object)>
			int j = mShowingMenus.size();
	//    9   18:aload_0         
	//   10   19:getfield        #12  <Field CascadingMenuPopup this$0>
	//   11   22:getfield        #34  <Field List CascadingMenuPopup.mShowingMenus>
	//   12   25:invokeinterface #40  <Method int List.size()>
	//   13   30:istore          4
			for(i = 0; i < j; i++)
	//*  14   32:iconst_0        
	//*  15   33:istore_3        
	//*  16   34:iload_3         
	//*  17   35:iload           4
	//*  18   37:icmpge          73
				if(menu == ((scadingMenuInfo)mShowingMenus.get(i)).menu)
	//*  19   40:aload_1         
	//*  20   41:aload_0         
	//*  21   42:getfield        #12  <Field CascadingMenuPopup this$0>
	//*  22   45:getfield        #34  <Field List CascadingMenuPopup.mShowingMenus>
	//*  23   48:iload_3         
	//*  24   49:invokeinterface #44  <Method Object List.get(int)>
	//*  25   54:checkcast       #46  <Class CascadingMenuPopup$CascadingMenuInfo>
	//*  26   57:getfield        #50  <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
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
	//*  46   87:getfield        #12  <Field CascadingMenuPopup this$0>
	//*  47   90:getfield        #34  <Field List CascadingMenuPopup.mShowingMenus>
	//*  48   93:invokeinterface #40  <Method int List.size()>
	//*  49   98:icmpge          119
			nextInfo = (scadingMenuInfo)mShowingMenus.get(i);
	//   50  101:aload_0         
	//   51  102:getfield        #12  <Field CascadingMenuPopup this$0>
	//   52  105:getfield        #34  <Field List CascadingMenuPopup.mShowingMenus>
	//   53  108:iload_3         
	//   54  109:invokeinterface #44  <Method Object List.get(int)>
	//   55  114:checkcast       #46  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   56  117:astore          7
		class _cls1
			implements Runnable
		{

			public void run()
			{
				if(nextInfo != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #20  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
			//*   2    4:ifnull          40
				{
					mShouldCloseImmediately = true;
			//    3    7:aload_0         
			//    4    8:getfield        #18  <Field CascadingMenuPopup$3 this$1>
			//    5   11:getfield        #35  <Field CascadingMenuPopup CascadingMenuPopup$3.this$0>
			//    6   14:iconst_1        
			//    7   15:putfield        #41  <Field boolean CascadingMenuPopup.mShouldCloseImmediately>
					nextInfo.menu.b(false);
			//    8   18:aload_0         
			//    9   19:getfield        #20  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
			//   10   22:getfield        #46  <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
			//   11   25:iconst_0        
			//   12   26:invokevirtual   #52  <Method void MenuBuilder.b(boolean)>
					mShouldCloseImmediately = false;
			//   13   29:aload_0         
			//   14   30:getfield        #18  <Field CascadingMenuPopup$3 this$1>
			//   15   33:getfield        #35  <Field CascadingMenuPopup CascadingMenuPopup$3.this$0>
			//   16   36:iconst_0        
			//   17   37:putfield        #41  <Field boolean CascadingMenuPopup.mShouldCloseImmediately>
				}
				if(item.isEnabled() && item.hasSubMenu())
			//*  18   40:aload_0         
			//*  19   41:getfield        #22  <Field MenuItem val$item>
			//*  20   44:invokeinterface #58  <Method boolean MenuItem.isEnabled()>
			//*  21   49:ifeq            77
			//*  22   52:aload_0         
			//*  23   53:getfield        #22  <Field MenuItem val$item>
			//*  24   56:invokeinterface #61  <Method boolean MenuItem.hasSubMenu()>
			//*  25   61:ifeq            77
					menu.a(item, 4);
			//   26   64:aload_0         
			//   27   65:getfield        #24  <Field MenuBuilder val$menu>
			//   28   68:aload_0         
			//   29   69:getfield        #22  <Field MenuItem val$item>
			//   30   72:iconst_4        
			//   31   73:invokevirtual   #65  <Method boolean MenuBuilder.a(MenuItem, int)>
			//   32   76:pop             
			//   33   77:return          
			}

			final CascadingMenuPopup._cls3 this$1;
			final MenuItem val$item;
			final MenuBuilder val$menu;
			final CascadingMenuPopup.CascadingMenuInfo val$nextInfo;

			_cls1()
			{
				this$1 = CascadingMenuPopup._cls3.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field CascadingMenuPopup$3 this$1>
				nextInfo = cascadingmenuinfo;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
				item = menuitem;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #22  <Field MenuItem val$item>
				menu = menubuilder;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #24  <Field MenuBuilder val$menu>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #27  <Method void Object()>
			//   14   25:return          
			}
		}

		item = ((MenuItem) (new _cls1()));
	//   57  119:new             #52  <Class CascadingMenuPopup$3$1>
	//   58  122:dup             
	//   59  123:aload_0         
	//   60  124:aload           7
	//   61  126:aload_2         
	//   62  127:aload_1         
	//   63  128:invokespecial   #55  <Method void CascadingMenuPopup$3$1(CascadingMenuPopup$3, CascadingMenuPopup$CascadingMenuInfo, MenuItem, MenuBuilder)>
	//   64  131:astore_2        
		long l = SystemClock.uptimeMillis();
	//   65  132:invokestatic    #61  <Method long SystemClock.uptimeMillis()>
	//   66  135:lstore          5
		mSubMenuHoverHandler.postAtTime(((Runnable) (item)), ((Object) (menu)), l + 200L);
	//   67  137:aload_0         
	//   68  138:getfield        #12  <Field CascadingMenuPopup this$0>
	//   69  141:getfield        #24  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
	//   70  144:aload_2         
	//   71  145:aload_1         
	//   72  146:lload           5
	//   73  148:ldc2w           #62  <Long 200L>
	//   74  151:ladd            
	//   75  152:invokevirtual   #67  <Method boolean Handler.postAtTime(Runnable, Object, long)>
	//   76  155:pop             
	//   77  156:return          
	}

	public void onItemHoverExit(MenuBuilder menubuilder, MenuItem menuitem)
	{
		mSubMenuHoverHandler.removeCallbacksAndMessages(((Object) (menubuilder)));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field CascadingMenuPopup this$0>
	//    2    4:getfield        #24  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #30  <Method void Handler.removeCallbacksAndMessages(Object)>
	//    5   11:return          
	}

	final CascadingMenuPopup this$0;

	CascadingMenuPopup$3()
	{
		this$0 = CascadingMenuPopup.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field CascadingMenuPopup this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
