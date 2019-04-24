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
//			z, MenuPopupWindow, af

public static class MenuPopupWindow$MenuDropDownListView extends z
{

	public volatile boolean a(MotionEvent motionevent, int k)
	{
		return super.a(motionevent, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #50  <Method boolean z.a(MotionEvent, int)>
	//    4    6:ireturn         
	}

	public volatile boolean hasFocus()
	{
		return super.hasFocus();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method boolean z.hasFocus()>
	//    2    4:ireturn         
	}

	public volatile boolean hasWindowFocus()
	{
		return super.hasWindowFocus();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method boolean z.hasWindowFocus()>
	//    2    4:ireturn         
	}

	public volatile boolean isFocused()
	{
		return super.isFocused();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method boolean z.isFocused()>
	//    2    4:ireturn         
	}

	public volatile boolean isInTouchMode()
	{
		return super.isInTouchMode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method boolean z.isInTouchMode()>
	//    2    4:ireturn         
	}

	public boolean onHoverEvent(MotionEvent motionevent)
	{
		if(i != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field af i>
	//*   2    4:ifnull          191
		{
			Object obj = ((Object) (getAdapter()));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #71  <Method android.widget.ListAdapter getAdapter()>
	//    5   11:astore          4
			int k;
			Object obj1;
			if(obj instanceof HeaderViewListAdapter)
	//*   6   13:aload           4
	//*   7   15:instanceof      #73  <Class HeaderViewListAdapter>
	//*   8   18:ifeq            51
			{
				obj = ((Object) ((HeaderViewListAdapter)obj));
	//    9   21:aload           4
	//   10   23:checkcast       #73  <Class HeaderViewListAdapter>
	//   11   26:astore          4
				k = ((HeaderViewListAdapter) (obj)).getHeadersCount();
	//   12   28:aload           4
	//   13   30:invokevirtual   #76  <Method int HeaderViewListAdapter.getHeadersCount()>
	//   14   33:istore_2        
				obj = ((Object) (((HeaderViewListAdapter) (obj)).getWrappedAdapter()));
	//   15   34:aload           4
	//   16   36:invokevirtual   #79  <Method android.widget.ListAdapter HeaderViewListAdapter.getWrappedAdapter()>
	//   17   39:astore          4
			} else
	//*  18   41:aload           4
	//*  19   43:checkcast       #81  <Class g>
	//*  20   46:astore          6
	//*  21   48:goto            56
			{
				k = 0;
	//   22   51:iconst_0        
	//   23   52:istore_2        
			}
			obj1 = ((Object) ((g)obj));
	//*  24   53:goto            41
			MenuItem menuitem = null;
	//   25   56:aconst_null     
	//   26   57:astore          5
			obj = ((Object) (menuitem));
	//   27   59:aload           5
	//   28   61:astore          4
			if(motionevent.getAction() != 10)
	//*  29   63:aload_1         
	//*  30   64:invokevirtual   #86  <Method int MotionEvent.getAction()>
	//*  31   67:bipush          10
	//*  32   69:icmpeq          129
			{
				int l = pointToPosition((int)motionevent.getX(), (int)motionevent.getY());
	//   33   72:aload_0         
	//   34   73:aload_1         
	//   35   74:invokevirtual   #90  <Method float MotionEvent.getX()>
	//   36   77:f2i             
	//   37   78:aload_1         
	//   38   79:invokevirtual   #93  <Method float MotionEvent.getY()>
	//   39   82:f2i             
	//   40   83:invokevirtual   #97  <Method int pointToPosition(int, int)>
	//   41   86:istore_3        
				obj = ((Object) (menuitem));
	//   42   87:aload           5
	//   43   89:astore          4
				if(l != -1)
	//*  44   91:iload_3         
	//*  45   92:iconst_m1       
	//*  46   93:icmpeq          129
				{
					k = l - k;
	//   47   96:iload_3         
	//   48   97:iload_2         
	//   49   98:isub            
	//   50   99:istore_2        
					obj = ((Object) (menuitem));
	//   51  100:aload           5
	//   52  102:astore          4
					if(k >= 0)
	//*  53  104:iload_2         
	//*  54  105:iflt            129
					{
						obj = ((Object) (menuitem));
	//   55  108:aload           5
	//   56  110:astore          4
						if(k < ((g) (obj1)).getCount())
	//*  57  112:iload_2         
	//*  58  113:aload           6
	//*  59  115:invokevirtual   #100 <Method int g.getCount()>
	//*  60  118:icmpge          129
							obj = ((Object) (((g) (obj1)).a(k)));
	//   61  121:aload           6
	//   62  123:iload_2         
	//   63  124:invokevirtual   #103 <Method j g.a(int)>
	//   64  127:astore          4
					}
				}
			}
			menuitem = j;
	//   65  129:aload_0         
	//   66  130:getfield        #105 <Field MenuItem j>
	//   67  133:astore          5
			if(menuitem != obj)
	//*  68  135:aload           5
	//*  69  137:aload           4
	//*  70  139:if_acmpeq       191
			{
				obj1 = ((Object) (((g) (obj1)).a()));
	//   71  142:aload           6
	//   72  144:invokevirtual   #108 <Method h g.a()>
	//   73  147:astore          6
				if(menuitem != null)
	//*  74  149:aload           5
	//*  75  151:ifnull          167
					i.a(((h) (obj1)), menuitem);
	//   76  154:aload_0         
	//   77  155:getfield        #67  <Field af i>
	//   78  158:aload           6
	//   79  160:aload           5
	//   80  162:invokeinterface #113 <Method void af.a(h, MenuItem)>
				j = ((MenuItem) (obj));
	//   81  167:aload_0         
	//   82  168:aload           4
	//   83  170:putfield        #105 <Field MenuItem j>
				if(obj != null)
	//*  84  173:aload           4
	//*  85  175:ifnull          191
					i.b(((h) (obj1)), ((MenuItem) (obj)));
	//   86  178:aload_0         
	//   87  179:getfield        #67  <Field af i>
	//   88  182:aload           6
	//   89  184:aload           4
	//   90  186:invokeinterface #116 <Method void af.b(h, MenuItem)>
			}
		}
		return super.onHoverEvent(motionevent);
	//   91  191:aload_0         
	//   92  192:aload_1         
	//   93  193:invokespecial   #118 <Method boolean z.onHoverEvent(MotionEvent)>
	//   94  196:ireturn         
	}

	public boolean onKeyDown(int k, KeyEvent keyevent)
	{
		ListMenuItemView listmenuitemview = (ListMenuItemView)getSelectedView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method android.view.View getSelectedView()>
	//    2    4:checkcast       #126 <Class ListMenuItemView>
	//    3    7:astore_3        
		if(listmenuitemview != null && k == g)
	//*   4    8:aload_3         
	//*   5    9:ifnull          53
	//*   6   12:iload_1         
	//*   7   13:aload_0         
	//*   8   14:getfield        #43  <Field int g>
	//*   9   17:icmpne          53
		{
			if(listmenuitemview.isEnabled() && listmenuitemview.getItemData().hasSubMenu())
	//*  10   20:aload_3         
	//*  11   21:invokevirtual   #129 <Method boolean ListMenuItemView.isEnabled()>
	//*  12   24:ifeq            51
	//*  13   27:aload_3         
	//*  14   28:invokevirtual   #133 <Method j ListMenuItemView.getItemData()>
	//*  15   31:invokevirtual   #138 <Method boolean j.hasSubMenu()>
	//*  16   34:ifeq            51
				performItemClick(((android.view.View) (listmenuitemview)), getSelectedItemPosition(), getSelectedItemId());
	//   17   37:aload_0         
	//   18   38:aload_3         
	//   19   39:aload_0         
	//   20   40:invokevirtual   #141 <Method int getSelectedItemPosition()>
	//   21   43:aload_0         
	//   22   44:invokevirtual   #145 <Method long getSelectedItemId()>
	//   23   47:invokevirtual   #149 <Method boolean performItemClick(android.view.View, int, long)>
	//   24   50:pop             
			return true;
	//   25   51:iconst_1        
	//   26   52:ireturn         
		}
		if(listmenuitemview != null && k == h)
	//*  27   53:aload_3         
	//*  28   54:ifnull          86
	//*  29   57:iload_1         
	//*  30   58:aload_0         
	//*  31   59:getfield        #45  <Field int h>
	//*  32   62:icmpne          86
		{
			setSelection(-1);
	//   33   65:aload_0         
	//   34   66:iconst_m1       
	//   35   67:invokevirtual   #153 <Method void setSelection(int)>
			((g)getAdapter()).a().b(false);
	//   36   70:aload_0         
	//   37   71:invokevirtual   #71  <Method android.widget.ListAdapter getAdapter()>
	//   38   74:checkcast       #81  <Class g>
	//   39   77:invokevirtual   #108 <Method h g.a()>
	//   40   80:iconst_0        
	//   41   81:invokevirtual   #158 <Method void h.b(boolean)>
			return true;
	//   42   84:iconst_1        
	//   43   85:ireturn         
		} else
		{
			return super.onKeyDown(k, keyevent);
	//   44   86:aload_0         
	//   45   87:iload_1         
	//   46   88:aload_2         
	//   47   89:invokespecial   #160 <Method boolean z.onKeyDown(int, KeyEvent)>
	//   48   92:ireturn         
		}
	}

	public void setHoverListener(af af1)
	{
		i = af1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field af i>
	//    3    5:return          
	}

	final int g;
	final int h;
	private af i;
	private MenuItem j;

	public MenuPopupWindow$MenuDropDownListView(Context context, boolean flag)
	{
		super(context, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #18  <Method void z(Context, boolean)>
		context = ((Context) (context.getResources().getConfiguration()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #24  <Method Resources Context.getResources()>
	//    6   10:invokevirtual   #30  <Method Configuration Resources.getConfiguration()>
	//    7   13:astore_1        
		if(android.os.Build.VERSION.SDK_INT >= 17 && 1 == ((Configuration) (context)).getLayoutDirection())
	//*   8   14:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   17:bipush          17
	//*  10   19:icmplt          43
	//*  11   22:iconst_1        
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #41  <Method int Configuration.getLayoutDirection()>
	//*  14   27:icmpne          43
		{
			g = 21;
	//   15   30:aload_0         
	//   16   31:bipush          21
	//   17   33:putfield        #43  <Field int g>
			h = 22;
	//   18   36:aload_0         
	//   19   37:bipush          22
	//   20   39:putfield        #45  <Field int h>
			return;
	//   21   42:return          
		} else
		{
			g = 22;
	//   22   43:aload_0         
	//   23   44:bipush          22
	//   24   46:putfield        #43  <Field int g>
			h = 21;
	//   25   49:aload_0         
	//   26   50:bipush          21
	//   27   52:putfield        #45  <Field int h>
			return;
	//   28   55:return          
		}
	}
}
