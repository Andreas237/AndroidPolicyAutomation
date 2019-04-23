// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//			NestedScrollingParent, NestedScrollingParent2

public final class ViewParentCompat
{

	private ViewParentCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static void notifySubtreeAccessibilityStateChanged(ViewParent viewparent, View view, View view1, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          17
			viewparent.notifySubtreeAccessibilityStateChanged(view, view1, i);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:iload_3         
	//    7   12:invokeinterface #26  <Method void ViewParent.notifySubtreeAccessibilityStateChanged(View, View, int)>
	//    8   17:return          
	}

	public static boolean onNestedFling(ViewParent viewparent, View view, float f, float f1, boolean flag)
	{
label0:
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          80
			{
				try
				{
					flag = viewparent.onNestedFling(view, f, f1, flag);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:fload_2         
	//    6   11:fload_3         
	//    7   12:iload           4
	//    8   14:invokeinterface #33  <Method boolean ViewParent.onNestedFling(View, float, float, boolean)>
	//    9   19:istore          4
				}
	//*  10   21:iload           4
	//*  11   23:ireturn         
				// Misplaced declaration of an exception variable
				catch(View view)
	//*  12   24:astore_1        
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   13   25:new             #35  <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #36  <Method void StringBuilder()>
	//   16   32:astore          5
					stringbuilder.append("ViewParent ");
	//   17   34:aload           5
	//   18   36:ldc1            #38  <String "ViewParent ">
	//   19   38:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
					stringbuilder.append(((Object) (viewparent)));
	//   21   42:aload           5
	//   22   44:aload_0         
	//   23   45:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
	//   24   48:pop             
					stringbuilder.append(" does not implement interface ");
	//   25   49:aload           5
	//   26   51:ldc1            #47  <String " does not implement interface ">
	//   27   53:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
					stringbuilder.append("method onNestedFling");
	//   29   57:aload           5
	//   30   59:ldc1            #49  <String "method onNestedFling">
	//   31   61:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
					Log.e("ViewParentCompat", stringbuilder.toString(), ((Throwable) (view)));
	//   33   65:ldc1            #8   <String "ViewParentCompat">
	//   34   67:aload           5
	//   35   69:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   36   72:aload_1         
	//   37   73:invokestatic    #59  <Method int Log.e(String, String, Throwable)>
	//   38   76:pop             
					break label0;
	//   39   77:goto            102
				}
				return flag;
			}
			if(viewparent instanceof NestedScrollingParent)
	//*  40   80:aload_0         
	//*  41   81:instanceof      #61  <Class NestedScrollingParent>
	//*  42   84:ifeq            102
				return ((NestedScrollingParent)viewparent).onNestedFling(view, f, f1, flag);
	//   43   87:aload_0         
	//   44   88:checkcast       #61  <Class NestedScrollingParent>
	//   45   91:aload_1         
	//   46   92:fload_2         
	//   47   93:fload_3         
	//   48   94:iload           4
	//   49   96:invokeinterface #62  <Method boolean NestedScrollingParent.onNestedFling(View, float, float, boolean)>
	//   50  101:ireturn         
		}
		return false;
	//   51  102:iconst_0        
	//   52  103:ireturn         
	}

	public static boolean onNestedPreFling(ViewParent viewparent, View view, float f, float f1)
	{
label0:
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          78
			{
				boolean flag;
				try
				{
					flag = viewparent.onNestedPreFling(view, f, f1);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:fload_2         
	//    6   11:fload_3         
	//    7   12:invokeinterface #67  <Method boolean ViewParent.onNestedPreFling(View, float, float)>
	//    8   17:istore          4
				}
	//*   9   19:iload           4
	//*  10   21:ireturn         
				// Misplaced declaration of an exception variable
				catch(View view)
	//*  11   22:astore_1        
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   12   23:new             #35  <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #36  <Method void StringBuilder()>
	//   15   30:astore          5
					stringbuilder.append("ViewParent ");
	//   16   32:aload           5
	//   17   34:ldc1            #38  <String "ViewParent ">
	//   18   36:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
					stringbuilder.append(((Object) (viewparent)));
	//   20   40:aload           5
	//   21   42:aload_0         
	//   22   43:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
	//   23   46:pop             
					stringbuilder.append(" does not implement interface ");
	//   24   47:aload           5
	//   25   49:ldc1            #47  <String " does not implement interface ">
	//   26   51:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
					stringbuilder.append("method onNestedPreFling");
	//   28   55:aload           5
	//   29   57:ldc1            #69  <String "method onNestedPreFling">
	//   30   59:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
					Log.e("ViewParentCompat", stringbuilder.toString(), ((Throwable) (view)));
	//   32   63:ldc1            #8   <String "ViewParentCompat">
	//   33   65:aload           5
	//   34   67:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   35   70:aload_1         
	//   36   71:invokestatic    #59  <Method int Log.e(String, String, Throwable)>
	//   37   74:pop             
					break label0;
	//   38   75:goto            98
				}
				return flag;
			}
			if(viewparent instanceof NestedScrollingParent)
	//*  39   78:aload_0         
	//*  40   79:instanceof      #61  <Class NestedScrollingParent>
	//*  41   82:ifeq            98
				return ((NestedScrollingParent)viewparent).onNestedPreFling(view, f, f1);
	//   42   85:aload_0         
	//   43   86:checkcast       #61  <Class NestedScrollingParent>
	//   44   89:aload_1         
	//   45   90:fload_2         
	//   46   91:fload_3         
	//   47   92:invokeinterface #70  <Method boolean NestedScrollingParent.onNestedPreFling(View, float, float)>
	//   48   97:ireturn         
		}
		return false;
	//   49   98:iconst_0        
	//   50   99:ireturn         
	}

	public static void onNestedPreScroll(ViewParent viewparent, View view, int i, int j, int ai[])
	{
		onNestedPreScroll(viewparent, view, i, j, ai, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:iconst_0        
	//    6    7:invokestatic    #75  <Method void onNestedPreScroll(ViewParent, View, int, int, int[], int)>
	//    7   10:return          
	}

	public static void onNestedPreScroll(ViewParent viewparent, View view, int i, int j, int ai[], int k)
	{
		if(viewparent instanceof NestedScrollingParent2)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #77  <Class NestedScrollingParent2>
	//*   2    4:ifeq            24
		{
			((NestedScrollingParent2)viewparent).onNestedPreScroll(view, i, j, ai, k);
	//    3    7:aload_0         
	//    4    8:checkcast       #77  <Class NestedScrollingParent2>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:aload           4
	//    9   16:iload           5
	//   10   18:invokeinterface #80  <Method void NestedScrollingParent2.onNestedPreScroll(View, int, int, int[], int)>
			return;
	//   11   23:return          
		}
		if(k == 0)
	//*  12   24:iload           5
	//*  13   26:ifne            124
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  14   29:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   32:bipush          21
	//*  16   34:icmplt          103
			{
				try
				{
					viewparent.onNestedPreScroll(view, i, j, ai);
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:iload_2         
	//   20   40:iload_3         
	//   21   41:aload           4
	//   22   43:invokeinterface #83  <Method void ViewParent.onNestedPreScroll(View, int, int, int[])>
					return;
	//   23   48:return          
				}
				// Misplaced declaration of an exception variable
				catch(View view)
	//*  24   49:astore_1        
				{
					ai = ((int []) (new StringBuilder()));
	//   25   50:new             #35  <Class StringBuilder>
	//   26   53:dup             
	//   27   54:invokespecial   #36  <Method void StringBuilder()>
	//   28   57:astore          4
				}
				((StringBuilder) (ai)).append("ViewParent ");
	//   29   59:aload           4
	//   30   61:ldc1            #38  <String "ViewParent ">
	//   31   63:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
				((StringBuilder) (ai)).append(((Object) (viewparent)));
	//   33   67:aload           4
	//   34   69:aload_0         
	//   35   70:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
	//   36   73:pop             
				((StringBuilder) (ai)).append(" does not implement interface ");
	//   37   74:aload           4
	//   38   76:ldc1            #47  <String " does not implement interface ">
	//   39   78:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   40   81:pop             
				((StringBuilder) (ai)).append("method onNestedPreScroll");
	//   41   82:aload           4
	//   42   84:ldc1            #85  <String "method onNestedPreScroll">
	//   43   86:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   44   89:pop             
				Log.e("ViewParentCompat", ((StringBuilder) (ai)).toString(), ((Throwable) (view)));
	//   45   90:ldc1            #8   <String "ViewParentCompat">
	//   46   92:aload           4
	//   47   94:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   48   97:aload_1         
	//   49   98:invokestatic    #59  <Method int Log.e(String, String, Throwable)>
	//   50  101:pop             
				return;
	//   51  102:return          
			}
			if(viewparent instanceof NestedScrollingParent)
	//*  52  103:aload_0         
	//*  53  104:instanceof      #61  <Class NestedScrollingParent>
	//*  54  107:ifeq            124
				((NestedScrollingParent)viewparent).onNestedPreScroll(view, i, j, ai);
	//   55  110:aload_0         
	//   56  111:checkcast       #61  <Class NestedScrollingParent>
	//   57  114:aload_1         
	//   58  115:iload_2         
	//   59  116:iload_3         
	//   60  117:aload           4
	//   61  119:invokeinterface #86  <Method void NestedScrollingParent.onNestedPreScroll(View, int, int, int[])>
		}
	//   62  124:return          
	}

	public static void onNestedScroll(ViewParent viewparent, View view, int i, int j, int k, int l)
	{
		onNestedScroll(viewparent, view, i, j, k, l, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iconst_0        
	//    7    9:invokestatic    #91  <Method void onNestedScroll(ViewParent, View, int, int, int, int, int)>
	//    8   12:return          
	}

	public static void onNestedScroll(ViewParent viewparent, View view, int i, int j, int k, int l, int i1)
	{
		if(viewparent instanceof NestedScrollingParent2)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #77  <Class NestedScrollingParent2>
	//*   2    4:ifeq            26
		{
			((NestedScrollingParent2)viewparent).onNestedScroll(view, i, j, k, l, i1);
	//    3    7:aload_0         
	//    4    8:checkcast       #77  <Class NestedScrollingParent2>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:iload           4
	//    9   16:iload           5
	//   10   18:iload           6
	//   11   20:invokeinterface #94  <Method void NestedScrollingParent2.onNestedScroll(View, int, int, int, int, int)>
			return;
	//   12   25:return          
		}
		if(i1 == 0)
	//*  13   26:iload           6
	//*  14   28:ifne            130
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  15   31:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   34:bipush          21
	//*  17   36:icmplt          107
				try
				{
					viewparent.onNestedScroll(view, i, j, k, l);
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:iload_2         
	//   21   42:iload_3         
	//   22   43:iload           4
	//   23   45:iload           5
	//   24   47:invokeinterface #97  <Method void ViewParent.onNestedScroll(View, int, int, int, int)>
					return;
	//   25   52:return          
				}
				// Misplaced declaration of an exception variable
				catch(View view)
	//*  26   53:astore_1        
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   27   54:new             #35  <Class StringBuilder>
	//   28   57:dup             
	//   29   58:invokespecial   #36  <Method void StringBuilder()>
	//   30   61:astore          7
					stringbuilder.append("ViewParent ");
	//   31   63:aload           7
	//   32   65:ldc1            #38  <String "ViewParent ">
	//   33   67:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   34   70:pop             
					stringbuilder.append(((Object) (viewparent)));
	//   35   71:aload           7
	//   36   73:aload_0         
	//   37   74:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
	//   38   77:pop             
					stringbuilder.append(" does not implement interface ");
	//   39   78:aload           7
	//   40   80:ldc1            #47  <String " does not implement interface ">
	//   41   82:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   42   85:pop             
					stringbuilder.append("method onNestedScroll");
	//   43   86:aload           7
	//   44   88:ldc1            #99  <String "method onNestedScroll">
	//   45   90:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   46   93:pop             
					Log.e("ViewParentCompat", stringbuilder.toString(), ((Throwable) (view)));
	//   47   94:ldc1            #8   <String "ViewParentCompat">
	//   48   96:aload           7
	//   49   98:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   50  101:aload_1         
	//   51  102:invokestatic    #59  <Method int Log.e(String, String, Throwable)>
	//   52  105:pop             
					return;
	//   53  106:return          
				}
			if(viewparent instanceof NestedScrollingParent)
	//*  54  107:aload_0         
	//*  55  108:instanceof      #61  <Class NestedScrollingParent>
	//*  56  111:ifeq            130
				((NestedScrollingParent)viewparent).onNestedScroll(view, i, j, k, l);
	//   57  114:aload_0         
	//   58  115:checkcast       #61  <Class NestedScrollingParent>
	//   59  118:aload_1         
	//   60  119:iload_2         
	//   61  120:iload_3         
	//   62  121:iload           4
	//   63  123:iload           5
	//   64  125:invokeinterface #100 <Method void NestedScrollingParent.onNestedScroll(View, int, int, int, int)>
		}
	//   65  130:return          
	}

	public static void onNestedScrollAccepted(ViewParent viewparent, View view, View view1, int i)
	{
		onNestedScrollAccepted(viewparent, view, view1, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokestatic    #104 <Method void onNestedScrollAccepted(ViewParent, View, View, int, int)>
	//    6    8:return          
	}

	public static void onNestedScrollAccepted(ViewParent viewparent, View view, View view1, int i, int j)
	{
		if(viewparent instanceof NestedScrollingParent2)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #77  <Class NestedScrollingParent2>
	//*   2    4:ifeq            22
		{
			((NestedScrollingParent2)viewparent).onNestedScrollAccepted(view, view1, i, j);
	//    3    7:aload_0         
	//    4    8:checkcast       #77  <Class NestedScrollingParent2>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:iload_3         
	//    8   14:iload           4
	//    9   16:invokeinterface #107 <Method void NestedScrollingParent2.onNestedScrollAccepted(View, View, int, int)>
			return;
	//   10   21:return          
		}
		if(j == 0)
	//*  11   22:iload           4
	//*  12   24:ifne            112
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  13   27:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   30:bipush          21
	//*  15   32:icmplt          93
			{
				try
				{
					viewparent.onNestedScrollAccepted(view, view1, i);
	//   16   35:aload_0         
	//   17   36:aload_1         
	//   18   37:aload_2         
	//   19   38:iload_3         
	//   20   39:invokeinterface #109 <Method void ViewParent.onNestedScrollAccepted(View, View, int)>
					return;
	//   21   44:return          
				}
				// Misplaced declaration of an exception variable
				catch(View view)
	//*  22   45:astore_1        
				{
					view1 = ((View) (new StringBuilder()));
	//   23   46:new             #35  <Class StringBuilder>
	//   24   49:dup             
	//   25   50:invokespecial   #36  <Method void StringBuilder()>
	//   26   53:astore_2        
				}
				((StringBuilder) (view1)).append("ViewParent ");
	//   27   54:aload_2         
	//   28   55:ldc1            #38  <String "ViewParent ">
	//   29   57:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   30   60:pop             
				((StringBuilder) (view1)).append(((Object) (viewparent)));
	//   31   61:aload_2         
	//   32   62:aload_0         
	//   33   63:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
	//   34   66:pop             
				((StringBuilder) (view1)).append(" does not implement interface ");
	//   35   67:aload_2         
	//   36   68:ldc1            #47  <String " does not implement interface ">
	//   37   70:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   38   73:pop             
				((StringBuilder) (view1)).append("method onNestedScrollAccepted");
	//   39   74:aload_2         
	//   40   75:ldc1            #111 <String "method onNestedScrollAccepted">
	//   41   77:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   42   80:pop             
				Log.e("ViewParentCompat", ((StringBuilder) (view1)).toString(), ((Throwable) (view)));
	//   43   81:ldc1            #8   <String "ViewParentCompat">
	//   44   83:aload_2         
	//   45   84:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   46   87:aload_1         
	//   47   88:invokestatic    #59  <Method int Log.e(String, String, Throwable)>
	//   48   91:pop             
				return;
	//   49   92:return          
			}
			if(viewparent instanceof NestedScrollingParent)
	//*  50   93:aload_0         
	//*  51   94:instanceof      #61  <Class NestedScrollingParent>
	//*  52   97:ifeq            112
				((NestedScrollingParent)viewparent).onNestedScrollAccepted(view, view1, i);
	//   53  100:aload_0         
	//   54  101:checkcast       #61  <Class NestedScrollingParent>
	//   55  104:aload_1         
	//   56  105:aload_2         
	//   57  106:iload_3         
	//   58  107:invokeinterface #112 <Method void NestedScrollingParent.onNestedScrollAccepted(View, View, int)>
		}
	//   59  112:return          
	}

	public static boolean onStartNestedScroll(ViewParent viewparent, View view, View view1, int i)
	{
		return onStartNestedScroll(viewparent, view, view1, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokestatic    #117 <Method boolean onStartNestedScroll(ViewParent, View, View, int, int)>
	//    6    8:ireturn         
	}

	public static boolean onStartNestedScroll(ViewParent viewparent, View view, View view1, int i, int j)
	{
label0:
		{
			if(viewparent instanceof NestedScrollingParent2)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #77  <Class NestedScrollingParent2>
	//*   2    4:ifeq            22
				return ((NestedScrollingParent2)viewparent).onStartNestedScroll(view, view1, i, j);
	//    3    7:aload_0         
	//    4    8:checkcast       #77  <Class NestedScrollingParent2>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:iload_3         
	//    8   14:iload           4
	//    9   16:invokeinterface #120 <Method boolean NestedScrollingParent2.onStartNestedScroll(View, View, int, int)>
	//   10   21:ireturn         
			if(j != 0)
				break label0;
	//   11   22:iload           4
	//   12   24:ifne            119
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  13   27:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   30:bipush          21
	//*  15   32:icmplt          99
			{
				boolean flag;
				try
				{
					flag = viewparent.onStartNestedScroll(view, view1, i);
	//   16   35:aload_0         
	//   17   36:aload_1         
	//   18   37:aload_2         
	//   19   38:iload_3         
	//   20   39:invokeinterface #123 <Method boolean ViewParent.onStartNestedScroll(View, View, int)>
	//   21   44:istore          5
				}
	//*  22   46:iload           5
	//*  23   48:ireturn         
				// Misplaced declaration of an exception variable
				catch(View view)
	//*  24   49:astore_1        
				{
					view1 = ((View) (new StringBuilder()));
	//   25   50:new             #35  <Class StringBuilder>
	//   26   53:dup             
	//   27   54:invokespecial   #36  <Method void StringBuilder()>
	//   28   57:astore_2        
					((StringBuilder) (view1)).append("ViewParent ");
	//   29   58:aload_2         
	//   30   59:ldc1            #38  <String "ViewParent ">
	//   31   61:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
					((StringBuilder) (view1)).append(((Object) (viewparent)));
	//   33   65:aload_2         
	//   34   66:aload_0         
	//   35   67:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
	//   36   70:pop             
					((StringBuilder) (view1)).append(" does not implement interface ");
	//   37   71:aload_2         
	//   38   72:ldc1            #47  <String " does not implement interface ">
	//   39   74:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   40   77:pop             
					((StringBuilder) (view1)).append("method onStartNestedScroll");
	//   41   78:aload_2         
	//   42   79:ldc1            #125 <String "method onStartNestedScroll">
	//   43   81:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   44   84:pop             
					Log.e("ViewParentCompat", ((StringBuilder) (view1)).toString(), ((Throwable) (view)));
	//   45   85:ldc1            #8   <String "ViewParentCompat">
	//   46   87:aload_2         
	//   47   88:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   48   91:aload_1         
	//   49   92:invokestatic    #59  <Method int Log.e(String, String, Throwable)>
	//   50   95:pop             
					break label0;
	//   51   96:goto            119
				}
				return flag;
			}
			if(viewparent instanceof NestedScrollingParent)
	//*  52   99:aload_0         
	//*  53  100:instanceof      #61  <Class NestedScrollingParent>
	//*  54  103:ifeq            119
				return ((NestedScrollingParent)viewparent).onStartNestedScroll(view, view1, i);
	//   55  106:aload_0         
	//   56  107:checkcast       #61  <Class NestedScrollingParent>
	//   57  110:aload_1         
	//   58  111:aload_2         
	//   59  112:iload_3         
	//   60  113:invokeinterface #126 <Method boolean NestedScrollingParent.onStartNestedScroll(View, View, int)>
	//   61  118:ireturn         
		}
		return false;
	//   62  119:iconst_0        
	//   63  120:ireturn         
	}

	public static void onStopNestedScroll(ViewParent viewparent, View view)
	{
		onStopNestedScroll(viewparent, view, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #131 <Method void onStopNestedScroll(ViewParent, View, int)>
	//    4    6:return          
	}

	public static void onStopNestedScroll(ViewParent viewparent, View view, int i)
	{
		if(viewparent instanceof NestedScrollingParent2)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #77  <Class NestedScrollingParent2>
	//*   2    4:ifeq            19
		{
			((NestedScrollingParent2)viewparent).onStopNestedScroll(view, i);
	//    3    7:aload_0         
	//    4    8:checkcast       #77  <Class NestedScrollingParent2>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #134 <Method void NestedScrollingParent2.onStopNestedScroll(View, int)>
			return;
	//    8   18:return          
		}
		if(i == 0)
	//*   9   19:iload_2         
	//*  10   20:ifne            104
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  11   23:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   26:bipush          21
	//*  13   28:icmplt          87
				try
				{
					viewparent.onStopNestedScroll(view);
	//   14   31:aload_0         
	//   15   32:aload_1         
	//   16   33:invokeinterface #137 <Method void ViewParent.onStopNestedScroll(View)>
					return;
	//   17   38:return          
				}
				// Misplaced declaration of an exception variable
				catch(View view)
	//*  18   39:astore_1        
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   19   40:new             #35  <Class StringBuilder>
	//   20   43:dup             
	//   21   44:invokespecial   #36  <Method void StringBuilder()>
	//   22   47:astore_3        
					stringbuilder.append("ViewParent ");
	//   23   48:aload_3         
	//   24   49:ldc1            #38  <String "ViewParent ">
	//   25   51:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
					stringbuilder.append(((Object) (viewparent)));
	//   27   55:aload_3         
	//   28   56:aload_0         
	//   29   57:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
	//   30   60:pop             
					stringbuilder.append(" does not implement interface ");
	//   31   61:aload_3         
	//   32   62:ldc1            #47  <String " does not implement interface ">
	//   33   64:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   34   67:pop             
					stringbuilder.append("method onStopNestedScroll");
	//   35   68:aload_3         
	//   36   69:ldc1            #139 <String "method onStopNestedScroll">
	//   37   71:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   38   74:pop             
					Log.e("ViewParentCompat", stringbuilder.toString(), ((Throwable) (view)));
	//   39   75:ldc1            #8   <String "ViewParentCompat">
	//   40   77:aload_3         
	//   41   78:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   42   81:aload_1         
	//   43   82:invokestatic    #59  <Method int Log.e(String, String, Throwable)>
	//   44   85:pop             
					return;
	//   45   86:return          
				}
			if(viewparent instanceof NestedScrollingParent)
	//*  46   87:aload_0         
	//*  47   88:instanceof      #61  <Class NestedScrollingParent>
	//*  48   91:ifeq            104
				((NestedScrollingParent)viewparent).onStopNestedScroll(view);
	//   49   94:aload_0         
	//   50   95:checkcast       #61  <Class NestedScrollingParent>
	//   51   98:aload_1         
	//   52   99:invokeinterface #140 <Method void NestedScrollingParent.onStopNestedScroll(View)>
		}
	//   53  104:return          
	}

	public static boolean requestSendAccessibilityEvent(ViewParent viewparent, View view, AccessibilityEvent accessibilityevent)
	{
		return viewparent.requestSendAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokeinterface #146 <Method boolean ViewParent.requestSendAccessibilityEvent(View, AccessibilityEvent)>
	//    4    8:ireturn         
	}

	private static final String TAG = "ViewParentCompat";
}
