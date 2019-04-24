// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.ActionMode;

// Referenced classes of package android.support.v7.app:
//			h

class h$a extends g$a
{

	public ActionMode onWindowStartingActionMode(android.view.onMode.Callback callback)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public ActionMode onWindowStartingActionMode(android.view.onMode.Callback callback, int i)
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

	h$a(h h1, android.view.ow.Callback callback)
	{
		d = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field h d>
		super(((g) (h1)), callback);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #16  <Method void g$a(g, android.view.Window$Callback)>
	//    7   11:return          
	}
}
