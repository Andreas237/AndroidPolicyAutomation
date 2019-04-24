// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.app.*;
import android.os.Bundle;

// Referenced classes of package android.arch.lifecycle:
//			e, d, c

public class ReportFragment extends Fragment
{
	static interface a
	{

		public abstract void a();

		public abstract void b();

		public abstract void c();
	}


	public ReportFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Fragment()>
	//    2    4:return          
	}

	public static void a(Activity activity)
	{
		activity = ((Activity) (activity.getFragmentManager()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method FragmentManager Activity.getFragmentManager()>
	//    2    4:astore_0        
		if(((FragmentManager) (activity)).findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null)
	//*   3    5:aload_0         
	//*   4    6:ldc1            #26  <String "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag">
	//*   5    8:invokevirtual   #32  <Method Fragment FragmentManager.findFragmentByTag(String)>
	//*   6   11:ifnonnull       39
		{
			((FragmentManager) (activity)).beginTransaction().add(((Fragment) (new ReportFragment())), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #36  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    9   18:new             #2   <Class ReportFragment>
	//   10   21:dup             
	//   11   22:invokespecial   #37  <Method void ReportFragment()>
	//   12   25:ldc1            #26  <String "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag">
	//   13   27:invokevirtual   #43  <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//   14   30:invokevirtual   #47  <Method int FragmentTransaction.commit()>
	//   15   33:pop             
			((FragmentManager) (activity)).executePendingTransactions();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #51  <Method boolean FragmentManager.executePendingTransactions()>
	//   18   38:pop             
		}
	//   19   39:return          
	}

	private void a(a a1)
	{
		if(a1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
			a1.a();
	//    2    4:aload_1         
	//    3    5:invokeinterface #54  <Method void ReportFragment$a.a()>
	//    4   10:return          
	}

	private void a(b.a a1)
	{
		Object obj = ((Object) (getActivity()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method Activity getActivity()>
	//    2    4:astore_2        
		if(obj instanceof e)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #61  <Class e>
	//*   5    9:ifeq            26
			((e)obj).a().a(a1);
	//    6   12:aload_2         
	//    7   13:checkcast       #61  <Class e>
	//    8   16:invokeinterface #64  <Method d e.a()>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #68  <Method void d.a(b$a)>
		else
	//*  11   25:return          
		if(obj instanceof c)
	//*  12   26:aload_2         
	//*  13   27:instanceof      #70  <Class c>
	//*  14   30:ifeq            25
		{
			obj = ((Object) (((c)obj).getLifecycle()));
	//   15   33:aload_2         
	//   16   34:checkcast       #70  <Class c>
	//   17   37:invokeinterface #74  <Method b c.getLifecycle()>
	//   18   42:astore_2        
			if(obj instanceof d)
	//*  19   43:aload_2         
	//*  20   44:instanceof      #66  <Class d>
	//*  21   47:ifeq            25
			{
				((d)obj).a(a1);
	//   22   50:aload_2         
	//   23   51:checkcast       #66  <Class d>
	//   24   54:aload_1         
	//   25   55:invokevirtual   #68  <Method void d.a(b$a)>
				return;
	//   26   58:return          
			}
		}
	}

	private void b(a a1)
	{
		if(a1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
			a1.b();
	//    2    4:aload_1         
	//    3    5:invokeinterface #77  <Method void ReportFragment$a.b()>
	//    4   10:return          
	}

	private void c(a a1)
	{
		if(a1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
			a1.c();
	//    2    4:aload_1         
	//    3    5:invokeinterface #80  <Method void ReportFragment$a.c()>
	//    4   10:return          
	}

	public void onActivityCreated(Bundle bundle)
	{
		super.onActivityCreated(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #84  <Method void Fragment.onActivityCreated(Bundle)>
		a(a);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #86  <Field ReportFragment$a a>
	//    6   10:invokespecial   #88  <Method void a(ReportFragment$a)>
		a(b.a.ON_CREATE);
	//    7   13:aload_0         
	//    8   14:getstatic       #94  <Field b$a b$a.ON_CREATE>
	//    9   17:invokespecial   #95  <Method void a(b$a)>
	//   10   20:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void Fragment.onDestroy()>
		a(b.a.ON_DESTROY);
	//    2    4:aload_0         
	//    3    5:getstatic       #101 <Field b$a b$a.ON_DESTROY>
	//    4    8:invokespecial   #95  <Method void a(b$a)>
		a = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #86  <Field ReportFragment$a a>
	//    8   16:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #104 <Method void Fragment.onPause()>
		a(b.a.ON_PAUSE);
	//    2    4:aload_0         
	//    3    5:getstatic       #107 <Field b$a b$a.ON_PAUSE>
	//    4    8:invokespecial   #95  <Method void a(b$a)>
	//    5   11:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #110 <Method void Fragment.onResume()>
		c(a);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #86  <Field ReportFragment$a a>
	//    5    9:invokespecial   #112 <Method void c(ReportFragment$a)>
		a(b.a.ON_RESUME);
	//    6   12:aload_0         
	//    7   13:getstatic       #115 <Field b$a b$a.ON_RESUME>
	//    8   16:invokespecial   #95  <Method void a(b$a)>
	//    9   19:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #118 <Method void Fragment.onStart()>
		b(a);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #86  <Field ReportFragment$a a>
	//    5    9:invokespecial   #120 <Method void b(ReportFragment$a)>
		a(b.a.ON_START);
	//    6   12:aload_0         
	//    7   13:getstatic       #123 <Field b$a b$a.ON_START>
	//    8   16:invokespecial   #95  <Method void a(b$a)>
	//    9   19:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #126 <Method void Fragment.onStop()>
		a(b.a.ON_STOP);
	//    2    4:aload_0         
	//    3    5:getstatic       #129 <Field b$a b$a.ON_STOP>
	//    4    8:invokespecial   #95  <Method void a(b$a)>
	//    5   11:return          
	}

	private a a;
}
