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
		if(mHoverListener == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field MenuItemHoverListener mHoverListener>
	//    2    4:ifnull          160
_L1:
		MenuItemImpl menuitemimpl;
		Object obj = ((Object) (getAdapter()));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #81  <Method android.widget.ListAdapter getAdapter()>
	//    5   11:astore          4
		int i;
		int j;
		MenuItem menuitem;
		if(obj instanceof HeaderViewListAdapter)
	//*   6   13:aload           4
	//*   7   15:instanceof      #83  <Class HeaderViewListAdapter>
	//*   8   18:ifeq            166
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
	//*  19   44:aload_1         
	//*  20   45:invokevirtual   #96  <Method int MotionEvent.getAction()>
	//*  21   48:bipush          10
	//*  22   50:icmpeq          178
	//*  23   53:aload_0         
	//*  24   54:aload_1         
	//*  25   55:invokevirtual   #100 <Method float MotionEvent.getX()>
	//*  26   58:f2i             
	//*  27   59:aload_1         
	//*  28   60:invokevirtual   #103 <Method float MotionEvent.getY()>
	//*  29   63:f2i             
	//*  30   64:invokevirtual   #107 <Method int pointToPosition(int, int)>
	//*  31   67:istore_3        
	//*  32   68:iload_3         
	//*  33   69:iconst_m1       
	//*  34   70:icmpeq          178
	//*  35   73:iload_3         
	//*  36   74:iload_2         
	//*  37   75:isub            
	//*  38   76:istore_2        
	//*  39   77:iload_2         
	//*  40   78:iflt            178
	//*  41   81:iload_2         
	//*  42   82:aload           4
	//*  43   84:invokevirtual   #110 <Method int MenuAdapter.getCount()>
	//*  44   87:icmpge          178
	//*  45   90:aload           4
	//*  46   92:iload_2         
	//*  47   93:invokevirtual   #114 <Method MenuItemImpl MenuAdapter.getItem(int)>
	//*  48   96:astore          5
	//*  49   98:aload_0         
	//*  50   99:getfield        #116 <Field MenuItem mHoveredMenuItem>
	//*  51  102:astore          6
	//*  52  104:aload           6
	//*  53  106:aload           5
	//*  54  108:if_acmpeq       160
	//*  55  111:aload           4
	//*  56  113:invokevirtual   #120 <Method MenuBuilder MenuAdapter.getAdapterMenu()>
	//*  57  116:astore          4
	//*  58  118:aload           6
	//*  59  120:ifnull          136
	//*  60  123:aload_0         
	//*  61  124:getfield        #77  <Field MenuItemHoverListener mHoverListener>
	//*  62  127:aload           4
	//*  63  129:aload           6
	//*  64  131:invokeinterface #126 <Method void MenuItemHoverListener.onItemHoverExit(MenuBuilder, MenuItem)>
	//*  65  136:aload_0         
	//*  66  137:aload           5
	//*  67  139:putfield        #116 <Field MenuItem mHoveredMenuItem>
	//*  68  142:aload           5
	//*  69  144:ifnull          160
	//*  70  147:aload_0         
	//*  71  148:getfield        #77  <Field MenuItemHoverListener mHoverListener>
	//*  72  151:aload           4
	//*  73  153:aload           5
	//*  74  155:invokeinterface #129 <Method void MenuItemHoverListener.onItemHoverEnter(MenuBuilder, MenuItem)>
	//*  75  160:aload_0         
	//*  76  161:aload_1         
	//*  77  162:invokespecial   #131 <Method boolean DropDownListView.onHoverEvent(MotionEvent)>
	//*  78  165:ireturn         
		{
			i = 0;
	//   79  166:iconst_0        
	//   80  167:istore_2        
			obj = ((Object) ((MenuAdapter)obj));
	//   81  168:aload           4
	//   82  170:checkcast       #91  <Class MenuAdapter>
	//   83  173:astore          4
		}
		if(motionevent.getAction() == 10) goto _L4; else goto _L3
_L3:
		j = pointToPosition((int)motionevent.getX(), (int)motionevent.getY());
		if(j == -1) goto _L4; else goto _L5
_L5:
		i = j - i;
		if(i < 0 || i >= ((MenuAdapter) (obj)).getCount()) goto _L4; else goto _L6
_L6:
		menuitemimpl = ((MenuAdapter) (obj)).getItem(i);
_L8:
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
_L2:
		return super.onHoverEvent(motionevent);
	//*  84  175:goto            44
_L4:
		menuitemimpl = null;
	//   85  178:aconst_null     
	//   86  179:astore          5
		if(true) goto _L8; else goto _L7
	//   87  181:goto            98
_L7:
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
