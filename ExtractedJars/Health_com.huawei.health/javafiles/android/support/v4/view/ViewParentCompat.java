// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//			NestedScrollingParent

public final class ViewParentCompat
{
	static class ViewParentCompatApi19Impl extends ViewParentCompatBaseImpl
	{

		public void notifySubtreeAccessibilityStateChanged(ViewParent viewparent, View view, View view1, int i)
		{
			viewparent.notifySubtreeAccessibilityStateChanged(view, view1, i);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:iload           4
		//    4    5:invokeinterface #22  <Method void ViewParent.notifySubtreeAccessibilityStateChanged(View, View, int)>
		//    5   10:return          
		}

		ViewParentCompatApi19Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ViewParentCompat$ViewParentCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class ViewParentCompatApi21Impl extends ViewParentCompatApi19Impl
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
				Log.e("ViewParentCompat", (new StringBuilder()).append("ViewParent ").append(((Object) (viewparent))).append(" does not implement interface ").append("method onNestedFling").toString(), ((Throwable) (view)));
		//   10   18:ldc1            #26  <String "ViewParentCompat">
		//   11   20:new             #28  <Class StringBuilder>
		//   12   23:dup             
		//   13   24:invokespecial   #29  <Method void StringBuilder()>
		//   14   27:ldc1            #31  <String "ViewParent ">
		//   15   29:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   16   32:aload_1         
		//   17   33:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   18   36:ldc1            #40  <String " does not implement interface ">
		//   19   38:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   20   41:ldc1            #42  <String "method onNestedFling">
		//   21   43:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   22   46:invokevirtual   #46  <Method String StringBuilder.toString()>
		//   23   49:aload_2         
		//   24   50:invokestatic    #52  <Method int Log.e(String, String, Throwable)>
		//   25   53:pop             
				return false;
		//   26   54:iconst_0        
		//   27   55:ireturn         
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
				Log.e("ViewParentCompat", (new StringBuilder()).append("ViewParent ").append(((Object) (viewparent))).append(" does not implement interface ").append("method onNestedPreFling").toString(), ((Throwable) (view)));
		//    9   16:ldc1            #26  <String "ViewParentCompat">
		//   10   18:new             #28  <Class StringBuilder>
		//   11   21:dup             
		//   12   22:invokespecial   #29  <Method void StringBuilder()>
		//   13   25:ldc1            #31  <String "ViewParent ">
		//   14   27:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   15   30:aload_1         
		//   16   31:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   17   34:ldc1            #40  <String " does not implement interface ">
		//   18   36:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   19   39:ldc1            #59  <String "method onNestedPreFling">
		//   20   41:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   21   44:invokevirtual   #46  <Method String StringBuilder.toString()>
		//   22   47:aload_2         
		//   23   48:invokestatic    #52  <Method int Log.e(String, String, Throwable)>
		//   24   51:pop             
				return false;
		//   25   52:iconst_0        
		//   26   53:ireturn         
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
				Log.e("ViewParentCompat", (new StringBuilder()).append("ViewParent ").append(((Object) (viewparent))).append(" does not implement interface ").append("method onNestedPreScroll").toString(), ((Throwable) (view)));
		//    8   14:ldc1            #26  <String "ViewParentCompat">
		//    9   16:new             #28  <Class StringBuilder>
		//   10   19:dup             
		//   11   20:invokespecial   #29  <Method void StringBuilder()>
		//   12   23:ldc1            #31  <String "ViewParent ">
		//   13   25:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   14   28:aload_1         
		//   15   29:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   16   32:ldc1            #40  <String " does not implement interface ">
		//   17   34:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   18   37:ldc1            #66  <String "method onNestedPreScroll">
		//   19   39:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   20   42:invokevirtual   #46  <Method String StringBuilder.toString()>
		//   21   45:aload_2         
		//   22   46:invokestatic    #52  <Method int Log.e(String, String, Throwable)>
		//   23   49:pop             
			}
		//   24   50:return          
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
				Log.e("ViewParentCompat", (new StringBuilder()).append("ViewParent ").append(((Object) (viewparent))).append(" does not implement interface ").append("method onNestedScroll").toString(), ((Throwable) (view)));
		//    9   16:ldc1            #26  <String "ViewParentCompat">
		//   10   18:new             #28  <Class StringBuilder>
		//   11   21:dup             
		//   12   22:invokespecial   #29  <Method void StringBuilder()>
		//   13   25:ldc1            #31  <String "ViewParent ">
		//   14   27:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   15   30:aload_1         
		//   16   31:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   17   34:ldc1            #40  <String " does not implement interface ">
		//   18   36:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   19   39:ldc1            #73  <String "method onNestedScroll">
		//   20   41:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   21   44:invokevirtual   #46  <Method String StringBuilder.toString()>
		//   22   47:aload_2         
		//   23   48:invokestatic    #52  <Method int Log.e(String, String, Throwable)>
		//   24   51:pop             
			}
		//   25   52:return          
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
				Log.e("ViewParentCompat", (new StringBuilder()).append("ViewParent ").append(((Object) (viewparent))).append(" does not implement interface ").append("method onNestedScrollAccepted").toString(), ((Throwable) (view)));
		//    7   12:ldc1            #26  <String "ViewParentCompat">
		//    8   14:new             #28  <Class StringBuilder>
		//    9   17:dup             
		//   10   18:invokespecial   #29  <Method void StringBuilder()>
		//   11   21:ldc1            #31  <String "ViewParent ">
		//   12   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:aload_1         
		//   14   27:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   15   30:ldc1            #40  <String " does not implement interface ">
		//   16   32:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   17   35:ldc1            #80  <String "method onNestedScrollAccepted">
		//   18   37:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   19   40:invokevirtual   #46  <Method String StringBuilder.toString()>
		//   20   43:aload_2         
		//   21   44:invokestatic    #52  <Method int Log.e(String, String, Throwable)>
		//   22   47:pop             
			}
		//   23   48:return          
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
				Log.e("ViewParentCompat", (new StringBuilder()).append("ViewParent ").append(((Object) (viewparent))).append(" does not implement interface ").append("method onStartNestedScroll").toString(), ((Throwable) (view)));
		//    9   16:ldc1            #26  <String "ViewParentCompat">
		//   10   18:new             #28  <Class StringBuilder>
		//   11   21:dup             
		//   12   22:invokespecial   #29  <Method void StringBuilder()>
		//   13   25:ldc1            #31  <String "ViewParent ">
		//   14   27:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   15   30:aload_1         
		//   16   31:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   17   34:ldc1            #40  <String " does not implement interface ">
		//   18   36:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   19   39:ldc1            #87  <String "method onStartNestedScroll">
		//   20   41:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   21   44:invokevirtual   #46  <Method String StringBuilder.toString()>
		//   22   47:aload_2         
		//   23   48:invokestatic    #52  <Method int Log.e(String, String, Throwable)>
		//   24   51:pop             
				return false;
		//   25   52:iconst_0        
		//   26   53:ireturn         
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
				Log.e("ViewParentCompat", (new StringBuilder()).append("ViewParent ").append(((Object) (viewparent))).append(" does not implement interface ").append("method onStopNestedScroll").toString(), ((Throwable) (view)));
		//    5    9:ldc1            #26  <String "ViewParentCompat">
		//    6   11:new             #28  <Class StringBuilder>
		//    7   14:dup             
		//    8   15:invokespecial   #29  <Method void StringBuilder()>
		//    9   18:ldc1            #31  <String "ViewParent ">
		//   10   20:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   11   23:aload_1         
		//   12   24:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   13   27:ldc1            #40  <String " does not implement interface ">
		//   14   29:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   15   32:ldc1            #94  <String "method onStopNestedScroll">
		//   16   34:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   17   37:invokevirtual   #46  <Method String StringBuilder.toString()>
		//   18   40:aload_2         
		//   19   41:invokestatic    #52  <Method int Log.e(String, String, Throwable)>
		//   20   44:pop             
			}
		//   21   45:return          
		}

		ViewParentCompatApi21Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ViewParentCompat$ViewParentCompatApi19Impl()>
		//    2    4:return          
		}
	}

	static class ViewParentCompatBaseImpl
	{

		public void notifySubtreeAccessibilityStateChanged(ViewParent viewparent, View view, View view1, int i)
		{
		//    0    0:return          
		}

		public boolean onNestedFling(ViewParent viewparent, View view, float f, float f1, boolean flag)
		{
			if(viewparent instanceof NestedScrollingParent)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #18  <Class NestedScrollingParent>
		//*   2    4:ifeq            23
				return ((NestedScrollingParent)viewparent).onNestedFling(view, f, f1, flag);
		//    3    7:aload_1         
		//    4    8:checkcast       #18  <Class NestedScrollingParent>
		//    5   11:aload_2         
		//    6   12:fload_3         
		//    7   13:fload           4
		//    8   15:iload           5
		//    9   17:invokeinterface #21  <Method boolean NestedScrollingParent.onNestedFling(View, float, float, boolean)>
		//   10   22:ireturn         
			else
				return false;
		//   11   23:iconst_0        
		//   12   24:ireturn         
		}

		public boolean onNestedPreFling(ViewParent viewparent, View view, float f, float f1)
		{
			if(viewparent instanceof NestedScrollingParent)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #18  <Class NestedScrollingParent>
		//*   2    4:ifeq            21
				return ((NestedScrollingParent)viewparent).onNestedPreFling(view, f, f1);
		//    3    7:aload_1         
		//    4    8:checkcast       #18  <Class NestedScrollingParent>
		//    5   11:aload_2         
		//    6   12:fload_3         
		//    7   13:fload           4
		//    8   15:invokeinterface #26  <Method boolean NestedScrollingParent.onNestedPreFling(View, float, float)>
		//    9   20:ireturn         
			else
				return false;
		//   10   21:iconst_0        
		//   11   22:ireturn         
		}

		public void onNestedPreScroll(ViewParent viewparent, View view, int i, int j, int ai[])
		{
			if(viewparent instanceof NestedScrollingParent)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #18  <Class NestedScrollingParent>
		//*   2    4:ifeq            22
				((NestedScrollingParent)viewparent).onNestedPreScroll(view, i, j, ai);
		//    3    7:aload_1         
		//    4    8:checkcast       #18  <Class NestedScrollingParent>
		//    5   11:aload_2         
		//    6   12:iload_3         
		//    7   13:iload           4
		//    8   15:aload           5
		//    9   17:invokeinterface #31  <Method void NestedScrollingParent.onNestedPreScroll(View, int, int, int[])>
		//   10   22:return          
		}

		public void onNestedScroll(ViewParent viewparent, View view, int i, int j, int k, int l)
		{
			if(viewparent instanceof NestedScrollingParent)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #18  <Class NestedScrollingParent>
		//*   2    4:ifeq            24
				((NestedScrollingParent)viewparent).onNestedScroll(view, i, j, k, l);
		//    3    7:aload_1         
		//    4    8:checkcast       #18  <Class NestedScrollingParent>
		//    5   11:aload_2         
		//    6   12:iload_3         
		//    7   13:iload           4
		//    8   15:iload           5
		//    9   17:iload           6
		//   10   19:invokeinterface #36  <Method void NestedScrollingParent.onNestedScroll(View, int, int, int, int)>
		//   11   24:return          
		}

		public void onNestedScrollAccepted(ViewParent viewparent, View view, View view1, int i)
		{
			if(viewparent instanceof NestedScrollingParent)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #18  <Class NestedScrollingParent>
		//*   2    4:ifeq            20
				((NestedScrollingParent)viewparent).onNestedScrollAccepted(view, view1, i);
		//    3    7:aload_1         
		//    4    8:checkcast       #18  <Class NestedScrollingParent>
		//    5   11:aload_2         
		//    6   12:aload_3         
		//    7   13:iload           4
		//    8   15:invokeinterface #40  <Method void NestedScrollingParent.onNestedScrollAccepted(View, View, int)>
		//    9   20:return          
		}

		public boolean onStartNestedScroll(ViewParent viewparent, View view, View view1, int i)
		{
			if(viewparent instanceof NestedScrollingParent)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #18  <Class NestedScrollingParent>
		//*   2    4:ifeq            21
				return ((NestedScrollingParent)viewparent).onStartNestedScroll(view, view1, i);
		//    3    7:aload_1         
		//    4    8:checkcast       #18  <Class NestedScrollingParent>
		//    5   11:aload_2         
		//    6   12:aload_3         
		//    7   13:iload           4
		//    8   15:invokeinterface #45  <Method boolean NestedScrollingParent.onStartNestedScroll(View, View, int)>
		//    9   20:ireturn         
			else
				return false;
		//   10   21:iconst_0        
		//   11   22:ireturn         
		}

		public void onStopNestedScroll(ViewParent viewparent, View view)
		{
			if(viewparent instanceof NestedScrollingParent)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #18  <Class NestedScrollingParent>
		//*   2    4:ifeq            17
				((NestedScrollingParent)viewparent).onStopNestedScroll(view);
		//    3    7:aload_1         
		//    4    8:checkcast       #18  <Class NestedScrollingParent>
		//    5   11:aload_2         
		//    6   12:invokeinterface #50  <Method void NestedScrollingParent.onStopNestedScroll(View)>
		//    7   17:return          
		}

		ViewParentCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private ViewParentCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:return          
	}

	public static void notifySubtreeAccessibilityStateChanged(ViewParent viewparent, View view, View view1, int i)
	{
		IMPL.notifySubtreeAccessibilityStateChanged(viewparent, view, view1, i);
	//    0    0:getstatic       #32  <Field ViewParentCompat$ViewParentCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #40  <Method void ViewParentCompat$ViewParentCompatBaseImpl.notifySubtreeAccessibilityStateChanged(ViewParent, View, View, int)>
	//    6   10:return          
	}

	public static boolean onNestedFling(ViewParent viewparent, View view, float f, float f1, boolean flag)
	{
		return IMPL.onNestedFling(viewparent, view, f, f1, flag);
	//    0    0:getstatic       #32  <Field ViewParentCompat$ViewParentCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:fload_2         
	//    4    6:fload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #44  <Method boolean ViewParentCompat$ViewParentCompatBaseImpl.onNestedFling(ViewParent, View, float, float, boolean)>
	//    7   12:ireturn         
	}

	public static boolean onNestedPreFling(ViewParent viewparent, View view, float f, float f1)
	{
		return IMPL.onNestedPreFling(viewparent, view, f, f1);
	//    0    0:getstatic       #32  <Field ViewParentCompat$ViewParentCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:fload_2         
	//    4    6:fload_3         
	//    5    7:invokevirtual   #48  <Method boolean ViewParentCompat$ViewParentCompatBaseImpl.onNestedPreFling(ViewParent, View, float, float)>
	//    6   10:ireturn         
	}

	public static void onNestedPreScroll(ViewParent viewparent, View view, int i, int j, int ai[])
	{
		IMPL.onNestedPreScroll(viewparent, view, i, j, ai);
	//    0    0:getstatic       #32  <Field ViewParentCompat$ViewParentCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #52  <Method void ViewParentCompat$ViewParentCompatBaseImpl.onNestedPreScroll(ViewParent, View, int, int, int[])>
	//    7   12:return          
	}

	public static void onNestedScroll(ViewParent viewparent, View view, int i, int j, int k, int l)
	{
		IMPL.onNestedScroll(viewparent, view, i, j, k, l);
	//    0    0:getstatic       #32  <Field ViewParentCompat$ViewParentCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:invokevirtual   #56  <Method void ViewParentCompat$ViewParentCompatBaseImpl.onNestedScroll(ViewParent, View, int, int, int, int)>
	//    8   14:return          
	}

	public static void onNestedScrollAccepted(ViewParent viewparent, View view, View view1, int i)
	{
		IMPL.onNestedScrollAccepted(viewparent, view, view1, i);
	//    0    0:getstatic       #32  <Field ViewParentCompat$ViewParentCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #59  <Method void ViewParentCompat$ViewParentCompatBaseImpl.onNestedScrollAccepted(ViewParent, View, View, int)>
	//    6   10:return          
	}

	public static boolean onStartNestedScroll(ViewParent viewparent, View view, View view1, int i)
	{
		return IMPL.onStartNestedScroll(viewparent, view, view1, i);
	//    0    0:getstatic       #32  <Field ViewParentCompat$ViewParentCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #63  <Method boolean ViewParentCompat$ViewParentCompatBaseImpl.onStartNestedScroll(ViewParent, View, View, int)>
	//    6   10:ireturn         
	}

	public static void onStopNestedScroll(ViewParent viewparent, View view)
	{
		IMPL.onStopNestedScroll(viewparent, view);
	//    0    0:getstatic       #32  <Field ViewParentCompat$ViewParentCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #67  <Method void ViewParentCompat$ViewParentCompatBaseImpl.onStopNestedScroll(ViewParent, View)>
	//    4    8:return          
	}

	public static boolean requestSendAccessibilityEvent(ViewParent viewparent, View view, AccessibilityEvent accessibilityevent)
	{
		return viewparent.requestSendAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokeinterface #75  <Method boolean ViewParent.requestSendAccessibilityEvent(View, AccessibilityEvent)>
	//    4    8:ireturn         
	}

	static final ViewParentCompatBaseImpl IMPL;
	private static final String TAG = "ViewParentCompat";

	static 
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #27  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_0        
		if(i >= 21)
	//*   2    4:iload_0         
	//*   3    5:bipush          21
	//*   4    7:icmplt          21
			IMPL = ((ViewParentCompatBaseImpl) (new ViewParentCompatApi21Impl()));
	//    5   10:new             #9   <Class ViewParentCompat$ViewParentCompatApi21Impl>
	//    6   13:dup             
	//    7   14:invokespecial   #30  <Method void ViewParentCompat$ViewParentCompatApi21Impl()>
	//    8   17:putstatic       #32  <Field ViewParentCompat$ViewParentCompatBaseImpl IMPL>
	//    9   20:return          
		else
		if(i >= 19)
	//*  10   21:iload_0         
	//*  11   22:bipush          19
	//*  12   24:icmplt          38
			IMPL = ((ViewParentCompatBaseImpl) (new ViewParentCompatApi19Impl()));
	//   13   27:new             #6   <Class ViewParentCompat$ViewParentCompatApi19Impl>
	//   14   30:dup             
	//   15   31:invokespecial   #33  <Method void ViewParentCompat$ViewParentCompatApi19Impl()>
	//   16   34:putstatic       #32  <Field ViewParentCompat$ViewParentCompatBaseImpl IMPL>
	//   17   37:return          
		else
			IMPL = new ViewParentCompatBaseImpl();
	//   18   38:new             #12  <Class ViewParentCompat$ViewParentCompatBaseImpl>
	//   19   41:dup             
	//   20   42:invokespecial   #34  <Method void ViewParentCompat$ViewParentCompatBaseImpl()>
	//   21   45:putstatic       #32  <Field ViewParentCompat$ViewParentCompatBaseImpl IMPL>
	//*  22   48:return          
	}
}
