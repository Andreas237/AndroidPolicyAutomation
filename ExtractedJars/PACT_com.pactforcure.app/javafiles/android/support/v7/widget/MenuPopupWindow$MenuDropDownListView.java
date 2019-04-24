// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.view.menu.*;
import android.view.*;
import android.widget.HeaderViewListAdapter;

// Referenced classes of package android.support.v7.widget:
//			DropDownListView, MenuPopupWindow, MenuItemHoverListener

public static class MenuPopupWindow$MenuDropDownListView extends DropDownListView
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
	//*   2    4:ifnull          179
		{
			Object obj = ((Object) (getAdapter()));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #81  <Method android.widget.ListAdapter getAdapter()>
	//    5   11:astore          4
			int i;
			MenuItemImpl menuitemimpl;
			MenuItem menuitem;
			if(obj instanceof HeaderViewListAdapter)
	//*   6   13:aload           4
	//*   7   15:instanceof      #83  <Class HeaderViewListAdapter>
	//*   8   18:ifeq            185
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
	//*  19   44:aconst_null     
	//*  20   45:astore          6
	//*  21   47:aload           6
	//*  22   49:astore          5
	//*  23   51:aload_1         
	//*  24   52:invokevirtual   #96  <Method int MotionEvent.getAction()>
	//*  25   55:bipush          10
	//*  26   57:icmpeq          117
	//*  27   60:aload_0         
	//*  28   61:aload_1         
	//*  29   62:invokevirtual   #100 <Method float MotionEvent.getX()>
	//*  30   65:f2i             
	//*  31   66:aload_1         
	//*  32   67:invokevirtual   #103 <Method float MotionEvent.getY()>
	//*  33   70:f2i             
	//*  34   71:invokevirtual   #107 <Method int pointToPosition(int, int)>
	//*  35   74:istore_3        
	//*  36   75:aload           6
	//*  37   77:astore          5
	//*  38   79:iload_3         
	//*  39   80:iconst_m1       
	//*  40   81:icmpeq          117
	//*  41   84:iload_3         
	//*  42   85:iload_2         
	//*  43   86:isub            
	//*  44   87:istore_2        
	//*  45   88:aload           6
	//*  46   90:astore          5
	//*  47   92:iload_2         
	//*  48   93:iflt            117
	//*  49   96:aload           6
	//*  50   98:astore          5
	//*  51  100:iload_2         
	//*  52  101:aload           4
	//*  53  103:invokevirtual   #110 <Method int MenuAdapter.getCount()>
	//*  54  106:icmpge          117
	//*  55  109:aload           4
	//*  56  111:iload_2         
	//*  57  112:invokevirtual   #114 <Method MenuItemImpl MenuAdapter.getItem(int)>
	//*  58  115:astore          5
	//*  59  117:aload_0         
	//*  60  118:getfield        #116 <Field MenuItem mHoveredMenuItem>
	//*  61  121:astore          6
	//*  62  123:aload           6
	//*  63  125:aload           5
	//*  64  127:if_acmpeq       179
	//*  65  130:aload           4
	//*  66  132:invokevirtual   #120 <Method MenuBuilder MenuAdapter.getAdapterMenu()>
	//*  67  135:astore          4
	//*  68  137:aload           6
	//*  69  139:ifnull          155
	//*  70  142:aload_0         
	//*  71  143:getfield        #77  <Field MenuItemHoverListener mHoverListener>
	//*  72  146:aload           4
	//*  73  148:aload           6
	//*  74  150:invokeinterface #126 <Method void MenuItemHoverListener.onItemHoverExit(MenuBuilder, MenuItem)>
	//*  75  155:aload_0         
	//*  76  156:aload           5
	//*  77  158:putfield        #116 <Field MenuItem mHoveredMenuItem>
	//*  78  161:aload           5
	//*  79  163:ifnull          179
	//*  80  166:aload_0         
	//*  81  167:getfield        #77  <Field MenuItemHoverListener mHoverListener>
	//*  82  170:aload           4
	//*  83  172:aload           5
	//*  84  174:invokeinterface #129 <Method void MenuItemHoverListener.onItemHoverEnter(MenuBuilder, MenuItem)>
	//*  85  179:aload_0         
	//*  86  180:aload_1         
	//*  87  181:invokespecial   #131 <Method boolean DropDownListView.onHoverEvent(MotionEvent)>
	//*  88  184:ireturn         
			{
				i = 0;
	//   89  185:iconst_0        
	//   90  186:istore_2        
				obj = ((Object) ((MenuAdapter)obj));
	//   91  187:aload           4
	//   92  189:checkcast       #91  <Class MenuAdapter>
	//   93  192:astore          4
			}
			menuitem = null;
			menuitemimpl = ((MenuItemImpl) (menuitem));
			if(motionevent.getAction() != 10)
			{
				int j = pointToPosition((int)motionevent.getX(), (int)motionevent.getY());
				menuitemimpl = ((MenuItemImpl) (menuitem));
				if(j != -1)
				{
					i = j - i;
					menuitemimpl = ((MenuItemImpl) (menuitem));
					if(i >= 0)
					{
						menuitemimpl = ((MenuItemImpl) (menuitem));
						if(i < ((MenuAdapter) (obj)).getCount())
							menuitemimpl = ((MenuAdapter) (obj)).getItem(i);
					}
				}
			}
			menuitem = mHoveredMenuItem;
			if(menuitem != menuitemimpl)
			{
				obj = ((Object) (((MenuAdapter) (obj)).getAdapterMenu()));
				if(menuitem != null)
					mHoverListener.onItemHoverExit(((MenuBuilder) (obj)), menuitem);
				mHoveredMenuItem = ((MenuItem) (menuitemimpl));
				if(menuitemimpl != null)
					mHoverListener.onItemHoverEnter(((MenuBuilder) (obj)), ((MenuItem) (menuitemimpl)));
			}
		}
		return super.onHoverEvent(motionevent);
	//*  94  194:goto            44
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

	public MenuPopupWindow$MenuDropDownListView(Context context, boolean flag)
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
