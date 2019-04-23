// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
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

	public volatile int lookForSelectablePosition(int i, boolean flag)
	{
		return super.lookForSelectablePosition(i, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #73  <Method int DropDownListView.lookForSelectablePosition(int, boolean)>
	//    4    6:ireturn         
	}

	public volatile int measureHeightOfChildrenCompat(int i, int j, int k, int l, int i1)
	{
		return super.measureHeightOfChildrenCompat(i, j, k, l, i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #77  <Method int DropDownListView.measureHeightOfChildrenCompat(int, int, int, int, int)>
	//    7   11:ireturn         
	}

	public volatile boolean onForwardedEvent(MotionEvent motionevent, int i)
	{
		return super.onForwardedEvent(motionevent, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #81  <Method boolean DropDownListView.onForwardedEvent(MotionEvent, int)>
	//    4    6:ireturn         
	}

	public boolean onHoverEvent(MotionEvent motionevent)
	{
		if(mHoverListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field MenuItemHoverListener mHoverListener>
	//*   2    4:ifnull          191
		{
			Object obj = ((Object) (getAdapter()));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #89  <Method android.widget.ListAdapter getAdapter()>
	//    5   11:astore          4
			int i;
			if(obj instanceof HeaderViewListAdapter)
	//*   6   13:aload           4
	//*   7   15:instanceof      #91  <Class HeaderViewListAdapter>
	//*   8   18:ifeq            47
			{
				obj = ((Object) ((HeaderViewListAdapter)obj));
	//    9   21:aload           4
	//   10   23:checkcast       #91  <Class HeaderViewListAdapter>
	//   11   26:astore          4
				i = ((HeaderViewListAdapter) (obj)).getHeadersCount();
	//   12   28:aload           4
	//   13   30:invokevirtual   #94  <Method int HeaderViewListAdapter.getHeadersCount()>
	//   14   33:istore_2        
				obj = ((Object) ((MenuAdapter)((HeaderViewListAdapter) (obj)).getWrappedAdapter()));
	//   15   34:aload           4
	//   16   36:invokevirtual   #97  <Method android.widget.ListAdapter HeaderViewListAdapter.getWrappedAdapter()>
	//   17   39:checkcast       #99  <Class MenuAdapter>
	//   18   42:astore          4
			} else
	//*  19   44:goto            56
			{
				i = 0;
	//   20   47:iconst_0        
	//   21   48:istore_2        
				obj = ((Object) ((MenuAdapter)obj));
	//   22   49:aload           4
	//   23   51:checkcast       #99  <Class MenuAdapter>
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
	//*  30   64:invokevirtual   #104 <Method int MotionEvent.getAction()>
	//*  31   67:bipush          10
	//*  32   69:icmpeq          129
			{
				int j = pointToPosition((int)motionevent.getX(), (int)motionevent.getY());
	//   33   72:aload_0         
	//   34   73:aload_1         
	//   35   74:invokevirtual   #108 <Method float MotionEvent.getX()>
	//   36   77:f2i             
	//   37   78:aload_1         
	//   38   79:invokevirtual   #111 <Method float MotionEvent.getY()>
	//   39   82:f2i             
	//   40   83:invokevirtual   #115 <Method int pointToPosition(int, int)>
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
	//*  59  115:invokevirtual   #118 <Method int MenuAdapter.getCount()>
	//*  60  118:icmpge          129
							menuitemimpl = ((MenuAdapter) (obj)).getItem(i);
	//   61  121:aload           4
	//   62  123:iload_2         
	//   63  124:invokevirtual   #122 <Method MenuItemImpl MenuAdapter.getItem(int)>
	//   64  127:astore          5
					}
				}
			}
			menuitem = mHoveredMenuItem;
	//   65  129:aload_0         
	//   66  130:getfield        #124 <Field MenuItem mHoveredMenuItem>
	//   67  133:astore          6
			if(menuitem != menuitemimpl)
	//*  68  135:aload           6
	//*  69  137:aload           5
	//*  70  139:if_acmpeq       191
			{
				obj = ((Object) (((MenuAdapter) (obj)).getAdapterMenu()));
	//   71  142:aload           4
	//   72  144:invokevirtual   #128 <Method MenuBuilder MenuAdapter.getAdapterMenu()>
	//   73  147:astore          4
				if(menuitem != null)
	//*  74  149:aload           6
	//*  75  151:ifnull          167
					mHoverListener.onItemHoverExit(((MenuBuilder) (obj)), menuitem);
	//   76  154:aload_0         
	//   77  155:getfield        #85  <Field MenuItemHoverListener mHoverListener>
	//   78  158:aload           4
	//   79  160:aload           6
	//   80  162:invokeinterface #134 <Method void MenuItemHoverListener.onItemHoverExit(MenuBuilder, MenuItem)>
				mHoveredMenuItem = ((MenuItem) (menuitemimpl));
	//   81  167:aload_0         
	//   82  168:aload           5
	//   83  170:putfield        #124 <Field MenuItem mHoveredMenuItem>
				if(menuitemimpl != null)
	//*  84  173:aload           5
	//*  85  175:ifnull          191
					mHoverListener.onItemHoverEnter(((MenuBuilder) (obj)), ((MenuItem) (menuitemimpl)));
	//   86  178:aload_0         
	//   87  179:getfield        #85  <Field MenuItemHoverListener mHoverListener>
	//   88  182:aload           4
	//   89  184:aload           5
	//   90  186:invokeinterface #137 <Method void MenuItemHoverListener.onItemHoverEnter(MenuBuilder, MenuItem)>
			}
		}
		return super.onHoverEvent(motionevent);
	//   91  191:aload_0         
	//   92  192:aload_1         
	//   93  193:invokespecial   #139 <Method boolean DropDownListView.onHoverEvent(MotionEvent)>
	//   94  196:ireturn         
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		ListMenuItemView listmenuitemview = (ListMenuItemView)getSelectedView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method android.view.View getSelectedView()>
	//    2    4:checkcast       #147 <Class ListMenuItemView>
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
	//*  11   21:invokevirtual   #150 <Method boolean ListMenuItemView.isEnabled()>
	//*  12   24:ifeq            51
	//*  13   27:aload_3         
	//*  14   28:invokevirtual   #154 <Method MenuItemImpl ListMenuItemView.getItemData()>
	//*  15   31:invokevirtual   #159 <Method boolean MenuItemImpl.hasSubMenu()>
	//*  16   34:ifeq            51
				performItemClick(((android.view.View) (listmenuitemview)), getSelectedItemPosition(), getSelectedItemId());
	//   17   37:aload_0         
	//   18   38:aload_3         
	//   19   39:aload_0         
	//   20   40:invokevirtual   #162 <Method int getSelectedItemPosition()>
	//   21   43:aload_0         
	//   22   44:invokevirtual   #166 <Method long getSelectedItemId()>
	//   23   47:invokevirtual   #170 <Method boolean performItemClick(android.view.View, int, long)>
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
	//   37   71:invokevirtual   #89  <Method android.widget.ListAdapter getAdapter()>
	//   38   74:checkcast       #99  <Class MenuAdapter>
	//   39   77:invokevirtual   #128 <Method MenuBuilder MenuAdapter.getAdapterMenu()>
	//   40   80:iconst_0        
	//   41   81:invokevirtual   #176 <Method void MenuBuilder.close(boolean)>
			return true;
	//   42   84:iconst_1        
	//   43   85:ireturn         
		} else
		{
			return super.onKeyDown(i, keyevent);
	//   44   86:aload_0         
	//   45   87:iload_1         
	//   46   88:aload_2         
	//   47   89:invokespecial   #178 <Method boolean DropDownListView.onKeyDown(int, KeyEvent)>
	//   48   92:ireturn         
		}
	}

	public volatile boolean onTouchEvent(MotionEvent motionevent)
	{
		return super.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #181 <Method boolean DropDownListView.onTouchEvent(MotionEvent)>
	//    3    5:ireturn         
	}

	public void setHoverListener(MenuItemHoverListener menuitemhoverlistener)
	{
		mHoverListener = menuitemhoverlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #85  <Field MenuItemHoverListener mHoverListener>
	//    3    5:return          
	}

	public volatile void setSelector(Drawable drawable)
	{
		super.setSelector(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #187 <Method void DropDownListView.setSelector(Drawable)>
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
