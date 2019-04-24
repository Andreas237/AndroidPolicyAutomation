// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//			ViewParentCompat

static class ViewParentCompat$ViewParentCompatApi21Impl extends ViewParentCompat$ViewParentCompatApi19Impl
{

	public boolean onNestedFling(ViewParent viewparent, View view, float f, float f1, boolean flag)
	{
		try
		{
			flag = viewparent.onNestedFling(view, f, f1, flag);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:fload_3         
	//    3    3:fload           4
	//    4    5:iload           5
	//    5    7:invokeinterface #24  <Method boolean ViewParent.onNestedFling(View, float, float, boolean)>
	//    6   12:istore          5
		}
	//*   7   14:iload           5
	//*   8   16:ireturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*   9   17:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   18:new             #26  <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #27  <Method void StringBuilder()>
	//   13   25:astore          6
			stringbuilder.append("ViewParent ");
	//   14   27:aload           6
	//   15   29:ldc1            #29  <String "ViewParent ">
	//   16   31:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			stringbuilder.append(((Object) (viewparent)));
	//   18   35:aload           6
	//   19   37:aload_1         
	//   20   38:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
	//   21   41:pop             
			stringbuilder.append(" does not implement interface ");
	//   22   42:aload           6
	//   23   44:ldc1            #38  <String " does not implement interface ">
	//   24   46:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
			stringbuilder.append("method onNestedFling");
	//   26   50:aload           6
	//   27   52:ldc1            #40  <String "method onNestedFling">
	//   28   54:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
			Log.e("ViewParentCompat", stringbuilder.toString(), ((Throwable) (view)));
	//   30   58:ldc1            #42  <String "ViewParentCompat">
	//   31   60:aload           6
	//   32   62:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   33   65:aload_2         
	//   34   66:invokestatic    #52  <Method int Log.e(String, String, Throwable)>
	//   35   69:pop             
			return false;
	//   36   70:iconst_0        
	//   37   71:ireturn         
		}
		return flag;
	}

	public boolean onNestedPreFling(ViewParent viewparent, View view, float f, float f1)
	{
		boolean flag;
		try
		{
			flag = viewparent.onNestedPreFling(view, f, f1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:fload_3         
	//    3    3:fload           4
	//    4    5:invokeinterface #57  <Method boolean ViewParent.onNestedPreFling(View, float, float)>
	//    5   10:istore          5
		}
	//*   6   12:iload           5
	//*   7   14:ireturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*   8   15:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   16:new             #26  <Class StringBuilder>
	//   10   19:dup             
	//   11   20:invokespecial   #27  <Method void StringBuilder()>
	//   12   23:astore          6
			stringbuilder.append("ViewParent ");
	//   13   25:aload           6
	//   14   27:ldc1            #29  <String "ViewParent ">
	//   15   29:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(((Object) (viewparent)));
	//   17   33:aload           6
	//   18   35:aload_1         
	//   19   36:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
	//   20   39:pop             
			stringbuilder.append(" does not implement interface ");
	//   21   40:aload           6
	//   22   42:ldc1            #38  <String " does not implement interface ">
	//   23   44:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
			stringbuilder.append("method onNestedPreFling");
	//   25   48:aload           6
	//   26   50:ldc1            #59  <String "method onNestedPreFling">
	//   27   52:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   28   55:pop             
			Log.e("ViewParentCompat", stringbuilder.toString(), ((Throwable) (view)));
	//   29   56:ldc1            #42  <String "ViewParentCompat">
	//   30   58:aload           6
	//   31   60:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   32   63:aload_2         
	//   33   64:invokestatic    #52  <Method int Log.e(String, String, Throwable)>
	//   34   67:pop             
			return false;
	//   35   68:iconst_0        
	//   36   69:ireturn         
		}
		return flag;
	}

	public void onNestedPreScroll(ViewParent viewparent, View view, int i, int j, int ai[])
	{
		try
		{
			viewparent.onNestedPreScroll(view, i, j, ai);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:aload           5
	//    5    7:invokeinterface #64  <Method void ViewParent.onNestedPreScroll(View, int, int, int[])>
			return;
	//    6   12:return          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*   7   13:astore_2        
		{
			ai = ((int []) (new StringBuilder()));
	//    8   14:new             #26  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #27  <Method void StringBuilder()>
	//   11   21:astore          5
		}
		((StringBuilder) (ai)).append("ViewParent ");
	//   12   23:aload           5
	//   13   25:ldc1            #29  <String "ViewParent ">
	//   14   27:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
		((StringBuilder) (ai)).append(((Object) (viewparent)));
	//   16   31:aload           5
	//   17   33:aload_1         
	//   18   34:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
	//   19   37:pop             
		((StringBuilder) (ai)).append(" does not implement interface ");
	//   20   38:aload           5
	//   21   40:ldc1            #38  <String " does not implement interface ">
	//   22   42:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		((StringBuilder) (ai)).append("method onNestedPreScroll");
	//   24   46:aload           5
	//   25   48:ldc1            #66  <String "method onNestedPreScroll">
	//   26   50:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
		Log.e("ViewParentCompat", ((StringBuilder) (ai)).toString(), ((Throwable) (view)));
	//   28   54:ldc1            #42  <String "ViewParentCompat">
	//   29   56:aload           5
	//   30   58:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   31   61:aload_2         
	//   32   62:invokestatic    #52  <Method int Log.e(String, String, Throwable)>
	//   33   65:pop             
	//   34   66:return          
	}

	public void onNestedScroll(ViewParent viewparent, View view, int i, int j, int k, int l)
	{
		try
		{
			viewparent.onNestedScroll(view, i, j, k, l);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:iload           6
	//    6    9:invokeinterface #71  <Method void ViewParent.onNestedScroll(View, int, int, int, int)>
			return;
	//    7   14:return          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*   8   15:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   16:new             #26  <Class StringBuilder>
	//   10   19:dup             
	//   11   20:invokespecial   #27  <Method void StringBuilder()>
	//   12   23:astore          7
			stringbuilder.append("ViewParent ");
	//   13   25:aload           7
	//   14   27:ldc1            #29  <String "ViewParent ">
	//   15   29:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(((Object) (viewparent)));
	//   17   33:aload           7
	//   18   35:aload_1         
	//   19   36:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
	//   20   39:pop             
			stringbuilder.append(" does not implement interface ");
	//   21   40:aload           7
	//   22   42:ldc1            #38  <String " does not implement interface ">
	//   23   44:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
			stringbuilder.append("method onNestedScroll");
	//   25   48:aload           7
	//   26   50:ldc1            #73  <String "method onNestedScroll">
	//   27   52:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   28   55:pop             
			Log.e("ViewParentCompat", stringbuilder.toString(), ((Throwable) (view)));
	//   29   56:ldc1            #42  <String "ViewParentCompat">
	//   30   58:aload           7
	//   31   60:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   32   63:aload_2         
	//   33   64:invokestatic    #52  <Method int Log.e(String, String, Throwable)>
	//   34   67:pop             
			return;
	//   35   68:return          
		}
	}

	public void onNestedScrollAccepted(ViewParent viewparent, View view, View view1, int i)
	{
		try
		{
			viewparent.onNestedScrollAccepted(view, view1, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:iload           4
	//    4    5:invokeinterface #78  <Method void ViewParent.onNestedScrollAccepted(View, View, int)>
			return;
	//    5   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*   6   11:astore_2        
		{
			view1 = ((View) (new StringBuilder()));
	//    7   12:new             #26  <Class StringBuilder>
	//    8   15:dup             
	//    9   16:invokespecial   #27  <Method void StringBuilder()>
	//   10   19:astore_3        
		}
		((StringBuilder) (view1)).append("ViewParent ");
	//   11   20:aload_3         
	//   12   21:ldc1            #29  <String "ViewParent ">
	//   13   23:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
		((StringBuilder) (view1)).append(((Object) (viewparent)));
	//   15   27:aload_3         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
	//   18   32:pop             
		((StringBuilder) (view1)).append(" does not implement interface ");
	//   19   33:aload_3         
	//   20   34:ldc1            #38  <String " does not implement interface ">
	//   21   36:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   22   39:pop             
		((StringBuilder) (view1)).append("method onNestedScrollAccepted");
	//   23   40:aload_3         
	//   24   41:ldc1            #80  <String "method onNestedScrollAccepted">
	//   25   43:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   26   46:pop             
		Log.e("ViewParentCompat", ((StringBuilder) (view1)).toString(), ((Throwable) (view)));
	//   27   47:ldc1            #42  <String "ViewParentCompat">
	//   28   49:aload_3         
	//   29   50:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   30   53:aload_2         
	//   31   54:invokestatic    #52  <Method int Log.e(String, String, Throwable)>
	//   32   57:pop             
	//   33   58:return          
	}

	public boolean onStartNestedScroll(ViewParent viewparent, View view, View view1, int i)
	{
		boolean flag;
		try
		{
			flag = viewparent.onStartNestedScroll(view, view1, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:iload           4
	//    4    5:invokeinterface #85  <Method boolean ViewParent.onStartNestedScroll(View, View, int)>
	//    5   10:istore          5
		}
	//*   6   12:iload           5
	//*   7   14:ireturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*   8   15:astore_2        
		{
			view1 = ((View) (new StringBuilder()));
	//    9   16:new             #26  <Class StringBuilder>
	//   10   19:dup             
	//   11   20:invokespecial   #27  <Method void StringBuilder()>
	//   12   23:astore_3        
			((StringBuilder) (view1)).append("ViewParent ");
	//   13   24:aload_3         
	//   14   25:ldc1            #29  <String "ViewParent ">
	//   15   27:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
			((StringBuilder) (view1)).append(((Object) (viewparent)));
	//   17   31:aload_3         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
	//   20   36:pop             
			((StringBuilder) (view1)).append(" does not implement interface ");
	//   21   37:aload_3         
	//   22   38:ldc1            #38  <String " does not implement interface ">
	//   23   40:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   24   43:pop             
			((StringBuilder) (view1)).append("method onStartNestedScroll");
	//   25   44:aload_3         
	//   26   45:ldc1            #87  <String "method onStartNestedScroll">
	//   27   47:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   28   50:pop             
			Log.e("ViewParentCompat", ((StringBuilder) (view1)).toString(), ((Throwable) (view)));
	//   29   51:ldc1            #42  <String "ViewParentCompat">
	//   30   53:aload_3         
	//   31   54:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   32   57:aload_2         
	//   33   58:invokestatic    #52  <Method int Log.e(String, String, Throwable)>
	//   34   61:pop             
			return false;
	//   35   62:iconst_0        
	//   36   63:ireturn         
		}
		return flag;
	}

	public void onStopNestedScroll(ViewParent viewparent, View view)
	{
		try
		{
			viewparent.onStopNestedScroll(view);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #92  <Method void ViewParent.onStopNestedScroll(View)>
			return;
	//    3    7:return          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*   4    8:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #26  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #27  <Method void StringBuilder()>
	//    8   16:astore_3        
			stringbuilder.append("ViewParent ");
	//    9   17:aload_3         
	//   10   18:ldc1            #29  <String "ViewParent ">
	//   11   20:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
			stringbuilder.append(((Object) (viewparent)));
	//   13   24:aload_3         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
	//   16   29:pop             
			stringbuilder.append(" does not implement interface ");
	//   17   30:aload_3         
	//   18   31:ldc1            #38  <String " does not implement interface ">
	//   19   33:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
			stringbuilder.append("method onStopNestedScroll");
	//   21   37:aload_3         
	//   22   38:ldc1            #94  <String "method onStopNestedScroll">
	//   23   40:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   24   43:pop             
			Log.e("ViewParentCompat", stringbuilder.toString(), ((Throwable) (view)));
	//   25   44:ldc1            #42  <String "ViewParentCompat">
	//   26   46:aload_3         
	//   27   47:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   28   50:aload_2         
	//   29   51:invokestatic    #52  <Method int Log.e(String, String, Throwable)>
	//   30   54:pop             
			return;
	//   31   55:return          
		}
	}

	ViewParentCompat$ViewParentCompatApi21Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ViewParentCompat$ViewParentCompatApi19Impl()>
	//    2    4:return          
	}
}
