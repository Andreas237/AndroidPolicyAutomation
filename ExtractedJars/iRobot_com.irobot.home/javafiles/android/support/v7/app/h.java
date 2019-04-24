// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//			g, b

class h extends g
{
	class a extends g.a
	{

		public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i)
		{
			if(d.o() && i == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field h d>
		//*   2    4:invokevirtual   #24  <Method boolean h.o()>
		//*   3    7:ifeq            23
		//*   4   10:iload_2         
		//*   5   11:ifeq            17
		//*   6   14:goto            23
				return a(callback);
		//    7   17:aload_0         
		//    8   18:aload_1         
		//    9   19:invokevirtual   #26  <Method ActionMode a(android.view.ActionMode$Callback)>
		//   10   22:areturn         
			else
				return super.onWindowStartingActionMode(callback, i);
		//   11   23:aload_0         
		//   12   24:aload_1         
		//   13   25:iload_2         
		//   14   26:invokespecial   #28  <Method ActionMode g$a.onWindowStartingActionMode(android.view.ActionMode$Callback, int)>
		//   15   29:areturn         
		}

		final h d;

		a(android.view.Window.Callback callback)
		{
			d = h.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field h d>
			super(((g) (h.this)), callback);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:invokespecial   #16  <Method void g$a(g, android.view.Window$Callback)>
		//    7   11:return          
		}
	}


	h(Context context, Window window, b b)
	{
		super(context, window, b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #13  <Method void g(Context, Window, b)>
		t = (UiModeManager)context.getSystemService("uimode");
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:ldc1            #15  <String "uimode">
	//    8   11:invokevirtual   #21  <Method Object Context.getSystemService(String)>
	//    9   14:checkcast       #23  <Class UiModeManager>
	//   10   17:putfield        #25  <Field UiModeManager t>
	//   11   20:return          
	}

	android.view.Window.Callback a(android.view.Window.Callback callback)
	{
		return ((android.view.Window.Callback) (new a(callback)));
	//    0    0:new             #6   <Class h$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #30  <Method void h$a(h, android.view.Window$Callback)>
	//    5    9:areturn         
	}

	int d(int i)
	{
		if(i == 0 && t.getNightMode() == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            16
	//*   2    4:aload_0         
	//*   3    5:getfield        #25  <Field UiModeManager t>
	//*   4    8:invokevirtual   #36  <Method int UiModeManager.getNightMode()>
	//*   5   11:ifne            16
			return -1;
	//    6   14:iconst_m1       
	//    7   15:ireturn         
		else
			return super.d(i);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokespecial   #38  <Method int g.d(int)>
	//   11   21:ireturn         
	}

	private final UiModeManager t;
}
