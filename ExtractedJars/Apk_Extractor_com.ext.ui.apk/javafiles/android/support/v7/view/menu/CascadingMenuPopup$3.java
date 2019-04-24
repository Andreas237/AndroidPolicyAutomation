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
		int j;
		mSubMenuHoverHandler.removeCallbacksAndMessages(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CascadingMenuPopup this$0>
	//    2    4:getfield        #27  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #33  <Method void Handler.removeCallbacksAndMessages(Object)>
		i = 0;
	//    5   11:iconst_0        
	//    6   12:istore_3        
		j = mShowingMenus.size();
	//    7   13:aload_0         
	//    8   14:getfield        #16  <Field CascadingMenuPopup this$0>
	//    9   17:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
	//   10   20:invokeinterface #43  <Method int List.size()>
	//   11   25:istore          4
_L4:
label0:
		{
			if(i >= j)
				break MISSING_BLOCK_LABEL_151;
	//   12   27:iload_3         
	//   13   28:iload           4
	//   14   30:icmpge          151
			if(menu == ((scadingMenuInfo)mShowingMenus.get(i)).menu)
			{
				break label0;
			} else
	//*  15   33:aload_1         
	//*  16   34:aload_0         
	//*  17   35:getfield        #16  <Field CascadingMenuPopup this$0>
	//*  18   38:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
	//*  19   41:iload_3         
	//*  20   42:invokeinterface #47  <Method Object List.get(int)>
	//*  21   47:checkcast       #49  <Class CascadingMenuPopup$CascadingMenuInfo>
	//*  22   50:getfield        #53  <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//*  23   53:if_acmpne       62
	//*  24   56:iload_3         
	//*  25   57:iconst_m1       
	//*  26   58:icmpne          69
	//*  27   61:return          
			{
				i++;
	//   28   62:iload_3         
	//   29   63:iconst_1        
	//   30   64:iadd            
	//   31   65:istore_3        
				continue; /* Loop/switch isn't completed */
	//   32   66:goto            27
			}
		}
_L2:
		if(i == -1)
			return;
		i++;
	//   33   69:iload_3         
	//   34   70:iconst_1        
	//   35   71:iadd            
	//   36   72:istore_3        
		long l;
		final scadingMenuInfo nextInfo;
		if(i < mShowingMenus.size())
	//*  37   73:iload_3         
	//*  38   74:aload_0         
	//*  39   75:getfield        #16  <Field CascadingMenuPopup this$0>
	//*  40   78:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
	//*  41   81:invokeinterface #43  <Method int List.size()>
	//*  42   86:icmpge          145
			nextInfo = (scadingMenuInfo)mShowingMenus.get(i);
	//   43   89:aload_0         
	//   44   90:getfield        #16  <Field CascadingMenuPopup this$0>
	//   45   93:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
	//   46   96:iload_3         
	//   47   97:invokeinterface #47  <Method Object List.get(int)>
	//   48  102:checkcast       #49  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   49  105:astore          7
		else
	//*  50  107:new             #10  <Class CascadingMenuPopup$3$1>
	//*  51  110:dup             
	//*  52  111:aload_0         
	//*  53  112:aload           7
	//*  54  114:aload_2         
	//*  55  115:aload_1         
	//*  56  116:invokespecial   #56  <Method void CascadingMenuPopup$3$1(CascadingMenuPopup$3, CascadingMenuPopup$CascadingMenuInfo, MenuItem, MenuBuilder)>
	//*  57  119:astore_2        
	//*  58  120:invokestatic    #62  <Method long SystemClock.uptimeMillis()>
	//*  59  123:lstore          5
	//*  60  125:aload_0         
	//*  61  126:getfield        #16  <Field CascadingMenuPopup this$0>
	//*  62  129:getfield        #27  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
	//*  63  132:aload_2         
	//*  64  133:aload_1         
	//*  65  134:lload           5
	//*  66  136:ldc2w           #63  <Long 200L>
	//*  67  139:ladd            
	//*  68  140:invokevirtual   #68  <Method boolean Handler.postAtTime(Runnable, Object, long)>
	//*  69  143:pop             
	//*  70  144:return          
			nextInfo = null;
	//   71  145:aconst_null     
	//   72  146:astore          7
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
		return;
	//*  73  148:goto            107
		i = -1;
	//   74  151:iconst_m1       
	//   75  152:istore_3        
		if(true) goto _L2; else goto _L1
	//   76  153:goto            56
_L1:
		if(true) goto _L4; else goto _L3
_L3:
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
