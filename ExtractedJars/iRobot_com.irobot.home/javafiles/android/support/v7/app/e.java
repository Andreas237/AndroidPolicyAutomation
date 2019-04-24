// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.view.Menu;
import android.view.Window;
import java.util.List;

// Referenced classes of package android.support.v7.app:
//			h, b

class e extends h
{
	class a extends h.a
	{

		public void onProvideKeyboardShortcuts(List list, Menu menu, int i)
		{
			AppCompatDelegateImplV9.PanelFeatureState panelfeaturestate = b.a(0, true);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field e b>
		//    2    4:iconst_0        
		//    3    5:iconst_1        
		//    4    6:invokevirtual   #22  <Method AppCompatDelegateImplV9$PanelFeatureState e.a(int, boolean)>
		//    5    9:astore          5
			Object obj = ((Object) (menu));
		//    6   11:aload_2         
		//    7   12:astore          4
			if(panelfeaturestate != null)
		//*   8   14:aload           5
		//*   9   16:ifnull          37
			{
				obj = ((Object) (menu));
		//   10   19:aload_2         
		//   11   20:astore          4
				if(panelfeaturestate.j != null)
		//*  12   22:aload           5
		//*  13   24:getfield        #28  <Field android.support.v7.view.menu.h AppCompatDelegateImplV9$PanelFeatureState.j>
		//*  14   27:ifnull          37
					obj = ((Object) (panelfeaturestate.j));
		//   15   30:aload           5
		//   16   32:getfield        #28  <Field android.support.v7.view.menu.h AppCompatDelegateImplV9$PanelFeatureState.j>
		//   17   35:astore          4
			}
			super.onProvideKeyboardShortcuts(list, ((Menu) (obj)), i);
		//   18   37:aload_0         
		//   19   38:aload_1         
		//   20   39:aload           4
		//   21   41:iload_3         
		//   22   42:invokespecial   #30  <Method void h$a.onProvideKeyboardShortcuts(List, Menu, int)>
		//   23   45:return          
		}

		final e b;

		a(android.view.Window.Callback callback)
		{
			b = e.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field e b>
			super(((h) (e.this)), callback);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:invokespecial   #16  <Method void h$a(h, android.view.Window$Callback)>
		//    7   11:return          
		}
	}


	e(Context context, Window window, b b)
	{
		super(context, window, b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #11  <Method void h(Context, Window, b)>
	//    5    7:return          
	}

	android.view.Window.Callback a(android.view.Window.Callback callback)
	{
		return ((android.view.Window.Callback) (new a(callback)));
	//    0    0:new             #6   <Class e$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #16  <Method void e$a(e, android.view.Window$Callback)>
	//    5    9:areturn         
	}
}
