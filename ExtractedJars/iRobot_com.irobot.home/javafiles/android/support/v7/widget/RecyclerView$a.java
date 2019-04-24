// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.os.b;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static abstract class RecyclerView$a
{

	public abstract int a();

	public long a(int i)
	{
		return -1L;
	//    0    0:ldc2w           #26  <Long -1L>
	//    1    3:lreturn         
	}

	public void a(RecyclerView$c recyclerview$c)
	{
		a.registerObserver(((Object) (recyclerview$c)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field RecyclerView$b a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method void RecyclerView$b.registerObserver(Object)>
	//    4    8:return          
	}

	public void a(RecyclerView$u recyclerview$u)
	{
	//    0    0:return          
	}

	public abstract void a(RecyclerView$u recyclerview$u, int i);

	public void a(RecyclerView$u recyclerview$u, int i, List list)
	{
		a(recyclerview$u, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #39  <Method void a(RecyclerView$u, int)>
	//    4    6:return          
	}

	public void a(RecyclerView recyclerview)
	{
	//    0    0:return          
	}

	public int b(int i)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract RecyclerView$u b(ViewGroup viewgroup, int i);

	public void b(RecyclerView$c recyclerview$c)
	{
		a.unregisterObserver(((Object) (recyclerview$c)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field RecyclerView$b a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #46  <Method void RecyclerView$b.unregisterObserver(Object)>
	//    4    8:return          
	}

	public final void b(RecyclerView$u recyclerview$u, int i)
	{
		recyclerview$u.c = i;
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:putfield        #52  <Field int RecyclerView$u.c>
		if(d())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #56  <Method boolean d()>
	//*   5    9:ifeq            21
			recyclerview$u.e = a(i);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #58  <Method long a(int)>
	//   10   18:putfield        #62  <Field long RecyclerView$u.e>
		recyclerview$u.a(1, 519);
	//   11   21:aload_1         
	//   12   22:iconst_1        
	//   13   23:sipush          519
	//   14   26:invokevirtual   #65  <Method void RecyclerView$u.a(int, int)>
		android.support.v4.os.b.a("RV OnBindView");
	//   15   29:ldc1            #67  <String "RV OnBindView">
	//   16   31:invokestatic    #72  <Method void b.a(String)>
		a(recyclerview$u, i, recyclerview$u.u());
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:iload_2         
	//   20   37:aload_1         
	//   21   38:invokevirtual   #76  <Method List RecyclerView$u.u()>
	//   22   41:invokevirtual   #78  <Method void a(RecyclerView$u, int, List)>
		recyclerview$u.t();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #81  <Method void RecyclerView$u.t()>
		recyclerview$u = ((RecyclerView$u) (recyclerview$u.a.getLayoutParams()));
	//   25   48:aload_1         
	//   26   49:getfield        #84  <Field View RecyclerView$u.a>
	//   27   52:invokevirtual   #90  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   28   55:astore_1        
		if(recyclerview$u instanceof youtParams)
	//*  29   56:aload_1         
	//*  30   57:instanceof      #92  <Class RecyclerView$LayoutParams>
	//*  31   60:ifeq            71
			((youtParams)recyclerview$u).e = true;
	//   32   63:aload_1         
	//   33   64:checkcast       #92  <Class RecyclerView$LayoutParams>
	//   34   67:iconst_1        
	//   35   68:putfield        #94  <Field boolean RecyclerView$LayoutParams.e>
		android.support.v4.os.b.a();
	//   36   71:invokestatic    #96  <Method void b.a()>
	//   37   74:return          
	}

	public void b(RecyclerView recyclerview)
	{
	//    0    0:return          
	}

	public boolean b(RecyclerView$u recyclerview$u)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final RecyclerView$u c(ViewGroup viewgroup, int i)
	{
		android.support.v4.os.b.a("RV CreateView");
	//    0    0:ldc1            #101 <String "RV CreateView">
	//    1    2:invokestatic    #72  <Method void b.a(String)>
		viewgroup = ((ViewGroup) (b(viewgroup, i)));
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:invokevirtual   #103 <Method RecyclerView$u b(ViewGroup, int)>
	//    6   11:astore_1        
		viewgroup.f = i;
	//    7   12:aload_1         
	//    8   13:iload_2         
	//    9   14:putfield        #106 <Field int RecyclerView$u.f>
		android.support.v4.os.b.a();
	//   10   17:invokestatic    #96  <Method void b.a()>
		return ((RecyclerView$u) (viewgroup));
	//   11   20:aload_1         
	//   12   21:areturn         
	}

	public final void c(int i)
	{
		a.a(i, 1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field RecyclerView$b a>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #109 <Method void RecyclerView$b.a(int, int)>
	//    5    9:return          
	}

	public void c(RecyclerView$u recyclerview$u)
	{
	//    0    0:return          
	}

	public final void d(int i)
	{
		a.b(i, 1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field RecyclerView$b a>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #111 <Method void android.support.v7.widget.RecyclerView$b.b(int, int)>
	//    5    9:return          
	}

	public void d(RecyclerView$u recyclerview$u)
	{
	//    0    0:return          
	}

	public final boolean d()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean b>
	//    2    4:ireturn         
	}

	public final void e()
	{
		a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field RecyclerView$b a>
	//    2    4:invokevirtual   #112 <Method void RecyclerView$b.a()>
	//    3    7:return          
	}

	private final RecyclerView$b a = new RecyclerView$b();
	private boolean b;

	public RecyclerView$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class RecyclerView$b>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void RecyclerView$b()>
	//    6   12:putfield        #20  <Field RecyclerView$b a>
		b = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #22  <Field boolean b>
	//   10   20:return          
	}
}
