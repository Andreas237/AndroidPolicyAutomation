// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.view.menu.h;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

private final class AppCompatDelegateImplV9$d
	implements android.support.v7.view.menu.o.a
{

	public void a(h h1, boolean flag)
	{
		h h2 = h1.p();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method h h.p()>
	//    2    4:astore          4
		boolean flag1;
		if(h2 != h1)
	//*   3    6:aload           4
	//*   4    8:aload_1         
	//*   5    9:if_acmpeq       17
			flag1 = true;
	//    6   12:iconst_1        
	//    7   13:istore_3        
		else
	//*   8   14:goto            19
			flag1 = false;
	//    9   17:iconst_0        
	//   10   18:istore_3        
		AppCompatDelegateImplV9 appcompatdelegateimplv9 = a;
	//   11   19:aload_0         
	//   12   20:getfield        #15  <Field AppCompatDelegateImplV9 a>
	//   13   23:astore          5
		if(flag1)
	//*  14   25:iload_3         
	//*  15   26:ifeq            32
			h1 = h2;
	//   16   29:aload           4
	//   17   31:astore_1        
		h1 = ((h) (appcompatdelegateimplv9.a(((android.view.Menu) (h1)))));
	//   18   32:aload           5
	//   19   34:aload_1         
	//   20   35:invokevirtual   #29  <Method AppCompatDelegateImplV9$PanelFeatureState AppCompatDelegateImplV9.a(android.view.Menu)>
	//   21   38:astore_1        
		if(h1 != null)
	//*  22   39:aload_1         
	//*  23   40:ifnull          80
		{
			if(flag1)
	//*  24   43:iload_3         
	//*  25   44:ifeq            71
			{
				a.a(((nelFeatureState) (h1)).a, ((nelFeatureState) (h1)), ((android.view.Menu) (h2)));
	//   26   47:aload_0         
	//   27   48:getfield        #15  <Field AppCompatDelegateImplV9 a>
	//   28   51:aload_1         
	//   29   52:getfield        #34  <Field int AppCompatDelegateImplV9$PanelFeatureState.a>
	//   30   55:aload_1         
	//   31   56:aload           4
	//   32   58:invokevirtual   #37  <Method void AppCompatDelegateImplV9.a(int, AppCompatDelegateImplV9$PanelFeatureState, android.view.Menu)>
				a.a(((nelFeatureState) (h1)), true);
	//   33   61:aload_0         
	//   34   62:getfield        #15  <Field AppCompatDelegateImplV9 a>
	//   35   65:aload_1         
	//   36   66:iconst_1        
	//   37   67:invokevirtual   #40  <Method void AppCompatDelegateImplV9.a(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
				return;
	//   38   70:return          
			}
			a.a(((nelFeatureState) (h1)), flag);
	//   39   71:aload_0         
	//   40   72:getfield        #15  <Field AppCompatDelegateImplV9 a>
	//   41   75:aload_1         
	//   42   76:iload_2         
	//   43   77:invokevirtual   #40  <Method void AppCompatDelegateImplV9.a(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
		}
	//   44   80:return          
	}

	public boolean a(h h1)
	{
		if(h1 == null && a.h)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       46
	//*   2    4:aload_0         
	//*   3    5:getfield        #15  <Field AppCompatDelegateImplV9 a>
	//*   4    8:getfield        #45  <Field boolean android.support.v7.app.AppCompatDelegateImplV9.h>
	//*   5   11:ifeq            46
		{
			android.view.Window.Callback callback = a.q();
	//    6   14:aload_0         
	//    7   15:getfield        #15  <Field AppCompatDelegateImplV9 a>
	//    8   18:invokevirtual   #49  <Method android.view.Window$Callback AppCompatDelegateImplV9.q()>
	//    9   21:astore_2        
			if(callback != null && !a.p())
	//*  10   22:aload_2         
	//*  11   23:ifnull          46
	//*  12   26:aload_0         
	//*  13   27:getfield        #15  <Field AppCompatDelegateImplV9 a>
	//*  14   30:invokevirtual   #52  <Method boolean AppCompatDelegateImplV9.p()>
	//*  15   33:ifne            46
				callback.onMenuOpened(108, ((android.view.Menu) (h1)));
	//   16   36:aload_2         
	//   17   37:bipush          108
	//   18   39:aload_1         
	//   19   40:invokeinterface #58  <Method boolean android.view.Window$Callback.onMenuOpened(int, android.view.Menu)>
	//   20   45:pop             
		}
		return true;
	//   21   46:iconst_1        
	//   22   47:ireturn         
	}

	final AppCompatDelegateImplV9 a;

	AppCompatDelegateImplV9$d(AppCompatDelegateImplV9 appcompatdelegateimplv9)
	{
		a = appcompatdelegateimplv9;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AppCompatDelegateImplV9 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
