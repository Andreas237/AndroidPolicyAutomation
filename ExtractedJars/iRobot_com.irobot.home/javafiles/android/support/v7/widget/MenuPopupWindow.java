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
//			ListPopupWindow, af, z

public class MenuPopupWindow extends ListPopupWindow
	implements af
{
	public static class MenuDropDownListView extends z
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

		public MenuDropDownListView(Context context, boolean flag)
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


	public MenuPopupWindow(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #50  <Method void ListPopupWindow(Context, AttributeSet, int, int)>
	//    6    9:return          
	}

	z a(Context context, boolean flag)
	{
		context = ((Context) (new MenuDropDownListView(context, flag)));
	//    0    0:new             #8   <Class MenuPopupWindow$MenuDropDownListView>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #54  <Method void MenuPopupWindow$MenuDropDownListView(Context, boolean)>
	//    5    9:astore_1        
		((MenuDropDownListView) (context)).setHoverListener(((af) (this)));
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #58  <Method void MenuPopupWindow$MenuDropDownListView.setHoverListener(af)>
		return ((z) (context));
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public void a(h h, MenuItem menuitem)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field af b>
	//*   2    4:ifnull          18
			b.a(h, menuitem);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field af b>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #63  <Method void af.a(h, MenuItem)>
	//    8   18:return          
	}

	public void a(af af1)
	{
		b = af1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field af b>
	//    3    5:return          
	}

	public void a(Object obj)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #70  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          19
			g.setEnterTransition((Transition)obj);
	//    3    8:aload_0         
	//    4    9:getfield        #74  <Field PopupWindow g>
	//    5   12:aload_1         
	//    6   13:checkcast       #76  <Class Transition>
	//    7   16:invokevirtual   #80  <Method void PopupWindow.setEnterTransition(Transition)>
	//    8   19:return          
	}

	public void b(h h, MenuItem menuitem)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field af b>
	//*   2    4:ifnull          18
			b.b(h, menuitem);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field af b>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #82  <Method void af.b(h, MenuItem)>
	//    8   18:return          
	}

	public void b(Object obj)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #70  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          19
			g.setExitTransition((Transition)obj);
	//    3    8:aload_0         
	//    4    9:getfield        #74  <Field PopupWindow g>
	//    5   12:aload_1         
	//    6   13:checkcast       #76  <Class Transition>
	//    7   16:invokevirtual   #85  <Method void PopupWindow.setExitTransition(Transition)>
	//    8   19:return          
	}

	public void c(boolean flag)
	{
		Exception exception;
		if(a != null)
	//*   0    0:getstatic       #35  <Field Method a>
	//*   1    3:ifnull          37
			try
			{
				a.invoke(((Object) (g)), new Object[] {
					Boolean.valueOf(flag)
				});
	//    2    6:getstatic       #35  <Field Method a>
	//    3    9:aload_0         
	//    4   10:getfield        #74  <Field PopupWindow g>
	//    5   13:iconst_1        
	//    6   14:anewarray       Object[]
	//    7   17:dup             
	//    8   18:iconst_0        
	//    9   19:iload_1         
	//   10   20:invokestatic    #95  <Method Boolean Boolean.valueOf(boolean)>
	//   11   23:aastore         
	//   12   24:invokevirtual   #101 <Method Object Method.invoke(Object, Object[])>
	//   13   27:pop             
				return;
	//   14   28:return          
			}
	//*  15   29:ldc1            #37  <String "MenuPopupWindow">
	//*  16   31:ldc1            #103 <String "Could not invoke setTouchModal() on PopupWindow. Oh well.">
	//*  17   33:invokestatic    #45  <Method int Log.i(String, String)>
	//*  18   36:pop             
	//*  19   37:return          
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
			}
	//*  20   38:astore_2        
	//*  21   39:goto            29
	}

	private static Method a;
	private af b;

	static 
	{
		NoSuchMethodException nosuchmethodexception;
		try
		{
			a = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("setTouchModal", new Class[] {
				Boolean.TYPE
			});
	//    0    0:ldc1            #19  <Class PopupWindow>
	//    1    2:ldc1            #21  <String "setTouchModal">
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #29  <Field Class Boolean.TYPE>
	//    7   13:aastore         
	//    8   14:invokevirtual   #33  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    9   17:putstatic       #35  <Field Method a>
			return;
	//   10   20:return          
		}
	//*  11   21:ldc1            #37  <String "MenuPopupWindow">
	//*  12   23:ldc1            #39  <String "Could not find method setTouchModal() on PopupWindow. Oh well.">
	//*  13   25:invokestatic    #45  <Method int Log.i(String, String)>
	//*  14   28:pop             
	//*  15   29:return          
		// Misplaced declaration of an exception variable
		catch(NoSuchMethodException nosuchmethodexception)
		{
			Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
		}
	//*  16   30:astore_0        
	//*  17   31:goto            21
	}
}
