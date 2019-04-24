// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;
import android.widget.ListView;

// Referenced classes of package android.support.v4.widget:
//			AutoScrollHelper, ListViewCompat

public class ListViewAutoScrollHelper extends AutoScrollHelper
{

	public ListViewAutoScrollHelper(ListView listview)
	{
		super(((View) (listview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void AutoScrollHelper(View)>
		mTarget = listview;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #13  <Field ListView mTarget>
	//    6   10:return          
	}

	public boolean canTargetScrollHorizontally(int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canTargetScrollVertically(int i)
	{
		int j;
		ListView listview;
		listview = mTarget;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ListView mTarget>
	//    2    4:astore          5
		j = listview.getCount();
	//    3    6:aload           5
	//    4    8:invokevirtual   #23  <Method int ListView.getCount()>
	//    5   11:istore_2        
		if(j != 0) goto _L2; else goto _L1
	//    6   12:iload_2         
	//    7   13:ifne            18
_L1:
		return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
_L2:
		int l;
		int k = listview.getChildCount();
	//   10   18:aload           5
	//   11   20:invokevirtual   #26  <Method int ListView.getChildCount()>
	//   12   23:istore_3        
		l = listview.getFirstVisiblePosition();
	//   13   24:aload           5
	//   14   26:invokevirtual   #29  <Method int ListView.getFirstVisiblePosition()>
	//   15   29:istore          4
		if(i <= 0)
			continue; /* Loop/switch isn't completed */
	//   16   31:iload_1         
	//   17   32:ifle            64
		if(l + k >= j && listview.getChildAt(k - 1).getBottom() <= listview.getHeight())
			continue; /* Loop/switch isn't completed */
	//   18   35:iload           4
	//   19   37:iload_3         
	//   20   38:iadd            
	//   21   39:iload_2         
	//   22   40:icmplt          62
	//   23   43:aload           5
	//   24   45:iload_3         
	//   25   46:iconst_1        
	//   26   47:isub            
	//   27   48:invokevirtual   #33  <Method View ListView.getChildAt(int)>
	//   28   51:invokevirtual   #38  <Method int View.getBottom()>
	//   29   54:aload           5
	//   30   56:invokevirtual   #41  <Method int ListView.getHeight()>
	//   31   59:icmple          16
_L4:
		return true;
	//   32   62:iconst_1        
	//   33   63:ireturn         
		if(i >= 0) goto _L1; else goto _L3
	//   34   64:iload_1         
	//   35   65:ifge            16
_L3:
		if(l <= 0 && listview.getChildAt(0).getTop() >= 0)
	//*  36   68:iload           4
	//*  37   70:ifgt            62
	//*  38   73:aload           5
	//*  39   75:iconst_0        
	//*  40   76:invokevirtual   #33  <Method View ListView.getChildAt(int)>
	//*  41   79:invokevirtual   #44  <Method int View.getTop()>
	//*  42   82:iflt            62
			return false;
	//   43   85:iconst_0        
	//   44   86:ireturn         
		  goto _L4
		if(true) goto _L1; else goto _L5
_L5:
	}

	public void scrollTargetBy(int i, int j)
	{
		ListViewCompat.scrollListBy(mTarget, j);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ListView mTarget>
	//    2    4:iload_2         
	//    3    5:invokestatic    #52  <Method void ListViewCompat.scrollListBy(ListView, int)>
	//    4    8:return          
	}

	private final ListView mTarget;
}
