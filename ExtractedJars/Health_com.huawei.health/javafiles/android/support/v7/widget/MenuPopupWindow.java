// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.view.menu.*;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import android.widget.HeaderViewListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.widget:
//			ListPopupWindow, MenuItemHoverListener, DropDownListView

public class MenuPopupWindow extends ListPopupWindow
	implements MenuItemHoverListener
{
	public static class MenuDropDownListView extends DropDownListView
	{

		public void clearSelection()
		{
			setSelection(-1);
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:invokevirtual   #56  <Method void setSelection(int)>
		//    3    5:return          
		}

		public volatile boolean hasFocus()
		{
			return super.hasFocus();
		//    0    0:aload_0         
		//    1    1:invokespecial   #60  <Method boolean DropDownListView.hasFocus()>
		//    2    4:ireturn         
		}

		public volatile boolean hasWindowFocus()
		{
			return super.hasWindowFocus();
		//    0    0:aload_0         
		//    1    1:invokespecial   #63  <Method boolean DropDownListView.hasWindowFocus()>
		//    2    4:ireturn         
		}

		public volatile boolean isFocused()
		{
			return super.isFocused();
		//    0    0:aload_0         
		//    1    1:invokespecial   #66  <Method boolean DropDownListView.isFocused()>
		//    2    4:ireturn         
		}

		public volatile boolean isInTouchMode()
		{
			return super.isInTouchMode();
		//    0    0:aload_0         
		//    1    1:invokespecial   #69  <Method boolean DropDownListView.isInTouchMode()>
		//    2    4:ireturn         
		}

		public volatile boolean onForwardedEvent(MotionEvent motionevent, int i)
		{
			return super.onForwardedEvent(motionevent, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #73  <Method boolean DropDownListView.onForwardedEvent(MotionEvent, int)>
		//    4    6:ireturn         
		}

		public boolean onHoverEvent(MotionEvent motionevent)
		{
			if(mHoverListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #77  <Field MenuItemHoverListener mHoverListener>
		//*   2    4:ifnull          191
			{
				Object obj = ((Object) (getAdapter()));
		//    3    7:aload_0         
		//    4    8:invokevirtual   #81  <Method android.widget.ListAdapter getAdapter()>
		//    5   11:astore          4
				int i;
				if(obj instanceof HeaderViewListAdapter)
		//*   6   13:aload           4
		//*   7   15:instanceof      #83  <Class HeaderViewListAdapter>
		//*   8   18:ifeq            47
				{
					obj = ((Object) ((HeaderViewListAdapter)obj));
		//    9   21:aload           4
		//   10   23:checkcast       #83  <Class HeaderViewListAdapter>
		//   11   26:astore          4
					i = ((HeaderViewListAdapter) (obj)).getHeadersCount();
		//   12   28:aload           4
		//   13   30:invokevirtual   #86  <Method int HeaderViewListAdapter.getHeadersCount()>
		//   14   33:istore_2        
					obj = ((Object) ((MenuAdapter)((HeaderViewListAdapter) (obj)).getWrappedAdapter()));
		//   15   34:aload           4
		//   16   36:invokevirtual   #89  <Method android.widget.ListAdapter HeaderViewListAdapter.getWrappedAdapter()>
		//   17   39:checkcast       #91  <Class MenuAdapter>
		//   18   42:astore          4
				} else
		//*  19   44:goto            56
				{
					i = 0;
		//   20   47:iconst_0        
		//   21   48:istore_2        
					obj = ((Object) ((MenuAdapter)obj));
		//   22   49:aload           4
		//   23   51:checkcast       #91  <Class MenuAdapter>
		//   24   54:astore          4
				}
				MenuItem menuitem = null;
		//   25   56:aconst_null     
		//   26   57:astore          6
				MenuItemImpl menuitemimpl = ((MenuItemImpl) (menuitem));
		//   27   59:aload           6
		//   28   61:astore          5
				if(motionevent.getAction() != 10)
		//*  29   63:aload_1         
		//*  30   64:invokevirtual   #96  <Method int MotionEvent.getAction()>
		//*  31   67:bipush          10
		//*  32   69:icmpeq          129
				{
					int j = pointToPosition((int)motionevent.getX(), (int)motionevent.getY());
		//   33   72:aload_0         
		//   34   73:aload_1         
		//   35   74:invokevirtual   #100 <Method float MotionEvent.getX()>
		//   36   77:f2i             
		//   37   78:aload_1         
		//   38   79:invokevirtual   #103 <Method float MotionEvent.getY()>
		//   39   82:f2i             
		//   40   83:invokevirtual   #107 <Method int pointToPosition(int, int)>
		//   41   86:istore_3        
					menuitemimpl = ((MenuItemImpl) (menuitem));
		//   42   87:aload           6
		//   43   89:astore          5
					if(j != -1)
		//*  44   91:iload_3         
		//*  45   92:iconst_m1       
		//*  46   93:icmpeq          129
					{
						i = j - i;
		//   47   96:iload_3         
		//   48   97:iload_2         
		//   49   98:isub            
		//   50   99:istore_2        
						menuitemimpl = ((MenuItemImpl) (menuitem));
		//   51  100:aload           6
		//   52  102:astore          5
						if(i >= 0)
		//*  53  104:iload_2         
		//*  54  105:iflt            129
						{
							menuitemimpl = ((MenuItemImpl) (menuitem));
		//   55  108:aload           6
		//   56  110:astore          5
							if(i < ((MenuAdapter) (obj)).getCount())
		//*  57  112:iload_2         
		//*  58  113:aload           4
		//*  59  115:invokevirtual   #110 <Method int MenuAdapter.getCount()>
		//*  60  118:icmpge          129
								menuitemimpl = ((MenuAdapter) (obj)).getItem(i);
		//   61  121:aload           4
		//   62  123:iload_2         
		//   63  124:invokevirtual   #114 <Method MenuItemImpl MenuAdapter.getItem(int)>
		//   64  127:astore          5
						}
					}
				}
				menuitem = mHoveredMenuItem;
		//   65  129:aload_0         
		//   66  130:getfield        #116 <Field MenuItem mHoveredMenuItem>
		//   67  133:astore          6
				if(menuitem != menuitemimpl)
		//*  68  135:aload           6
		//*  69  137:aload           5
		//*  70  139:if_acmpeq       191
				{
					obj = ((Object) (((MenuAdapter) (obj)).getAdapterMenu()));
		//   71  142:aload           4
		//   72  144:invokevirtual   #120 <Method MenuBuilder MenuAdapter.getAdapterMenu()>
		//   73  147:astore          4
					if(menuitem != null)
		//*  74  149:aload           6
		//*  75  151:ifnull          167
						mHoverListener.onItemHoverExit(((MenuBuilder) (obj)), menuitem);
		//   76  154:aload_0         
		//   77  155:getfield        #77  <Field MenuItemHoverListener mHoverListener>
		//   78  158:aload           4
		//   79  160:aload           6
		//   80  162:invokeinterface #126 <Method void MenuItemHoverListener.onItemHoverExit(MenuBuilder, MenuItem)>
					mHoveredMenuItem = ((MenuItem) (menuitemimpl));
		//   81  167:aload_0         
		//   82  168:aload           5
		//   83  170:putfield        #116 <Field MenuItem mHoveredMenuItem>
					if(menuitemimpl != null)
		//*  84  173:aload           5
		//*  85  175:ifnull          191
						mHoverListener.onItemHoverEnter(((MenuBuilder) (obj)), ((MenuItem) (menuitemimpl)));
		//   86  178:aload_0         
		//   87  179:getfield        #77  <Field MenuItemHoverListener mHoverListener>
		//   88  182:aload           4
		//   89  184:aload           5
		//   90  186:invokeinterface #129 <Method void MenuItemHoverListener.onItemHoverEnter(MenuBuilder, MenuItem)>
				}
			}
			return super.onHoverEvent(motionevent);
		//   91  191:aload_0         
		//   92  192:aload_1         
		//   93  193:invokespecial   #131 <Method boolean DropDownListView.onHoverEvent(MotionEvent)>
		//   94  196:ireturn         
		}

		public boolean onKeyDown(int i, KeyEvent keyevent)
		{
			ListMenuItemView listmenuitemview = (ListMenuItemView)getSelectedView();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #137 <Method android.view.View getSelectedView()>
		//    2    4:checkcast       #139 <Class ListMenuItemView>
		//    3    7:astore_3        
			if(listmenuitemview != null && i == mAdvanceKey)
		//*   4    8:aload_3         
		//*   5    9:ifnull          53
		//*   6   12:iload_1         
		//*   7   13:aload_0         
		//*   8   14:getfield        #47  <Field int mAdvanceKey>
		//*   9   17:icmpne          53
			{
				if(listmenuitemview.isEnabled() && listmenuitemview.getItemData().hasSubMenu())
		//*  10   20:aload_3         
		//*  11   21:invokevirtual   #142 <Method boolean ListMenuItemView.isEnabled()>
		//*  12   24:ifeq            51
		//*  13   27:aload_3         
		//*  14   28:invokevirtual   #146 <Method MenuItemImpl ListMenuItemView.getItemData()>
		//*  15   31:invokevirtual   #151 <Method boolean MenuItemImpl.hasSubMenu()>
		//*  16   34:ifeq            51
					performItemClick(((android.view.View) (listmenuitemview)), getSelectedItemPosition(), getSelectedItemId());
		//   17   37:aload_0         
		//   18   38:aload_3         
		//   19   39:aload_0         
		//   20   40:invokevirtual   #154 <Method int getSelectedItemPosition()>
		//   21   43:aload_0         
		//   22   44:invokevirtual   #158 <Method long getSelectedItemId()>
		//   23   47:invokevirtual   #162 <Method boolean performItemClick(android.view.View, int, long)>
		//   24   50:pop             
				return true;
		//   25   51:iconst_1        
		//   26   52:ireturn         
			}
			if(listmenuitemview != null && i == mRetreatKey)
		//*  27   53:aload_3         
		//*  28   54:ifnull          86
		//*  29   57:iload_1         
		//*  30   58:aload_0         
		//*  31   59:getfield        #49  <Field int mRetreatKey>
		//*  32   62:icmpne          86
			{
				setSelection(-1);
		//   33   65:aload_0         
		//   34   66:iconst_m1       
		//   35   67:invokevirtual   #56  <Method void setSelection(int)>
				((MenuAdapter)getAdapter()).getAdapterMenu().close(false);
		//   36   70:aload_0         
		//   37   71:invokevirtual   #81  <Method android.widget.ListAdapter getAdapter()>
		//   38   74:checkcast       #91  <Class MenuAdapter>
		//   39   77:invokevirtual   #120 <Method MenuBuilder MenuAdapter.getAdapterMenu()>
		//   40   80:iconst_0        
		//   41   81:invokevirtual   #168 <Method void MenuBuilder.close(boolean)>
				return true;
		//   42   84:iconst_1        
		//   43   85:ireturn         
			} else
			{
				return super.onKeyDown(i, keyevent);
		//   44   86:aload_0         
		//   45   87:iload_1         
		//   46   88:aload_2         
		//   47   89:invokespecial   #170 <Method boolean DropDownListView.onKeyDown(int, KeyEvent)>
		//   48   92:ireturn         
			}
		}

		public void setHoverListener(MenuItemHoverListener menuitemhoverlistener)
		{
			mHoverListener = menuitemhoverlistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #77  <Field MenuItemHoverListener mHoverListener>
		//    3    5:return          
		}

		final int mAdvanceKey;
		private MenuItemHoverListener mHoverListener;
		private MenuItem mHoveredMenuItem;
		final int mRetreatKey;

		public MenuDropDownListView(Context context, boolean flag)
		{
			super(context, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #22  <Method void DropDownListView(Context, boolean)>
			context = ((Context) (context.getResources().getConfiguration()));
		//    4    6:aload_1         
		//    5    7:invokevirtual   #28  <Method Resources Context.getResources()>
		//    6   10:invokevirtual   #34  <Method Configuration Resources.getConfiguration()>
		//    7   13:astore_1        
			if(android.os.Build.VERSION.SDK_INT >= 17 && 1 == ((Configuration) (context)).getLayoutDirection())
		//*   8   14:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
		//*   9   17:bipush          17
		//*  10   19:icmplt          43
		//*  11   22:iconst_1        
		//*  12   23:aload_1         
		//*  13   24:invokevirtual   #45  <Method int Configuration.getLayoutDirection()>
		//*  14   27:icmpne          43
			{
				mAdvanceKey = 21;
		//   15   30:aload_0         
		//   16   31:bipush          21
		//   17   33:putfield        #47  <Field int mAdvanceKey>
				mRetreatKey = 22;
		//   18   36:aload_0         
		//   19   37:bipush          22
		//   20   39:putfield        #49  <Field int mRetreatKey>
				return;
		//   21   42:return          
			} else
			{
				mAdvanceKey = 22;
		//   22   43:aload_0         
		//   23   44:bipush          22
		//   24   46:putfield        #47  <Field int mAdvanceKey>
				mRetreatKey = 21;
		//   25   49:aload_0         
		//   26   50:bipush          21
		//   27   52:putfield        #49  <Field int mRetreatKey>
				return;
		//   28   55:return          
			}
		}
	}


	public MenuPopupWindow(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #56  <Method void ListPopupWindow(Context, AttributeSet, int, int)>
	//    6    9:return          
	}

	DropDownListView createDropDownListView(Context context, boolean flag)
	{
		context = ((Context) (new MenuDropDownListView(context, flag)));
	//    0    0:new             #8   <Class MenuPopupWindow$MenuDropDownListView>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #61  <Method void MenuPopupWindow$MenuDropDownListView(Context, boolean)>
	//    5    9:astore_1        
		((MenuDropDownListView) (context)).setHoverListener(((MenuItemHoverListener) (this)));
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #65  <Method void MenuPopupWindow$MenuDropDownListView.setHoverListener(MenuItemHoverListener)>
		return ((DropDownListView) (context));
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public void onItemHoverEnter(MenuBuilder menubuilder, MenuItem menuitem)
	{
		if(mHoverListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field MenuItemHoverListener mHoverListener>
	//*   2    4:ifnull          18
			mHoverListener.onItemHoverEnter(menubuilder, menuitem);
	//    3    7:aload_0         
	//    4    8:getfield        #70  <Field MenuItemHoverListener mHoverListener>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #72  <Method void MenuItemHoverListener.onItemHoverEnter(MenuBuilder, MenuItem)>
	//    8   18:return          
	}

	public void onItemHoverExit(MenuBuilder menubuilder, MenuItem menuitem)
	{
		if(mHoverListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field MenuItemHoverListener mHoverListener>
	//*   2    4:ifnull          18
			mHoverListener.onItemHoverExit(menubuilder, menuitem);
	//    3    7:aload_0         
	//    4    8:getfield        #70  <Field MenuItemHoverListener mHoverListener>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #76  <Method void MenuItemHoverListener.onItemHoverExit(MenuBuilder, MenuItem)>
	//    8   18:return          
	}

	public void setEnterTransition(Object obj)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #84  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          19
			mPopup.setEnterTransition((Transition)obj);
	//    3    8:aload_0         
	//    4    9:getfield        #88  <Field PopupWindow mPopup>
	//    5   12:aload_1         
	//    6   13:checkcast       #90  <Class Transition>
	//    7   16:invokevirtual   #93  <Method void PopupWindow.setEnterTransition(Transition)>
	//    8   19:return          
	}

	public void setExitTransition(Object obj)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #84  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          19
			mPopup.setExitTransition((Transition)obj);
	//    3    8:aload_0         
	//    4    9:getfield        #88  <Field PopupWindow mPopup>
	//    5   12:aload_1         
	//    6   13:checkcast       #90  <Class Transition>
	//    7   16:invokevirtual   #96  <Method void PopupWindow.setExitTransition(Transition)>
	//    8   19:return          
	}

	public void setHoverListener(MenuItemHoverListener menuitemhoverlistener)
	{
		mHoverListener = menuitemhoverlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field MenuItemHoverListener mHoverListener>
	//    3    5:return          
	}

	public void setTouchModal(boolean flag)
	{
		if(sSetTouchModalMethod != null)
	//*   0    0:getstatic       #43  <Field Method sSetTouchModalMethod>
	//*   1    3:ifnull          38
			try
			{
				sSetTouchModalMethod.invoke(((Object) (mPopup)), new Object[] {
					Boolean.valueOf(flag)
				});
	//    2    6:getstatic       #43  <Field Method sSetTouchModalMethod>
	//    3    9:aload_0         
	//    4   10:getfield        #88  <Field PopupWindow mPopup>
	//    5   13:iconst_1        
	//    6   14:anewarray       Object[]
	//    7   17:dup             
	//    8   18:iconst_0        
	//    9   19:iload_1         
	//   10   20:invokestatic    #105 <Method Boolean Boolean.valueOf(boolean)>
	//   11   23:aastore         
	//   12   24:invokevirtual   #111 <Method Object Method.invoke(Object, Object[])>
	//   13   27:pop             
				return;
	//   14   28:return          
			}
			catch(Exception exception)
	//*  15   29:astore_2        
			{
				Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
	//   16   30:ldc1            #17  <String "MenuPopupWindow">
	//   17   32:ldc1            #113 <String "Could not invoke setTouchModal() on PopupWindow. Oh well.">
	//   18   34:invokestatic    #51  <Method int Log.i(String, String)>
	//   19   37:pop             
			}
	//   20   38:return          
	}

	private static final String TAG = "MenuPopupWindow";
	private static Method sSetTouchModalMethod;
	private MenuItemHoverListener mHoverListener;

	static 
	{
		try
		{
			sSetTouchModalMethod = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("setTouchModal", new Class[] {
				Boolean.TYPE
			});
	//    0    0:ldc1            #27  <Class PopupWindow>
	//    1    2:ldc1            #29  <String "setTouchModal">
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #37  <Field Class Boolean.TYPE>
	//    7   13:aastore         
	//    8   14:invokevirtual   #41  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    9   17:putstatic       #43  <Field Method sSetTouchModalMethod>
	//   10   20:return          
		}
		catch(NoSuchMethodException nosuchmethodexception)
	//*  11   21:astore_0        
		{
			Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
	//   12   22:ldc1            #17  <String "MenuPopupWindow">
	//   13   24:ldc1            #45  <String "Could not find method setTouchModal() on PopupWindow. Oh well.">
	//   14   26:invokestatic    #51  <Method int Log.i(String, String)>
	//   15   29:pop             
		}
	//*  16   30:return          
	}
}
