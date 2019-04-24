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
		ListView listview = mTarget;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ListView mTarget>
	//    2    4:astore          5
		int j = listview.getCount();
	//    3    6:aload           5
	//    4    8:invokevirtual   #23  <Method int ListView.getCount()>
	//    5   11:istore_2        
		if(j == 0)
	//*   6   12:iload_2         
	//*   7   13:ifne            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		int k = listview.getChildCount();
	//   10   18:aload           5
	//   11   20:invokevirtual   #26  <Method int ListView.getChildCount()>
	//   12   23:istore_3        
		int l = listview.getFirstVisiblePosition();
	//   13   24:aload           5
	//   14   26:invokevirtual   #29  <Method int ListView.getFirstVisiblePosition()>
	//   15   29:istore          4
		if(i > 0)
	//*  16   31:iload_1         
	//*  17   32:ifle            67
		{
			if(l + k >= j && listview.getChildAt(k - 1).getBottom() <= listview.getHeight())
	//*  18   35:iload           4
	//*  19   37:iload_3         
	//*  20   38:iadd            
	//*  21   39:iload_2         
	//*  22   40:icmplt          95
	//*  23   43:aload           5
	//*  24   45:iload_3         
	//*  25   46:iconst_1        
	//*  26   47:isub            
	//*  27   48:invokevirtual   #33  <Method View ListView.getChildAt(int)>
	//*  28   51:invokevirtual   #38  <Method int View.getBottom()>
	//*  29   54:aload           5
	//*  30   56:invokevirtual   #41  <Method int ListView.getHeight()>
	//*  31   59:icmpgt          64
				return false;
	//   32   62:iconst_0        
	//   33   63:ireturn         
		} else
	//*  34   64:goto            95
		if(i < 0)
	//*  35   67:iload_1         
	//*  36   68:ifge            93
		{
			if(l <= 0 && listview.getChildAt(0).getTop() >= 0)
	//*  37   71:iload           4
	//*  38   73:ifgt            95
	//*  39   76:aload           5
	//*  40   78:iconst_0        
	//*  41   79:invokevirtual   #33  <Method View ListView.getChildAt(int)>
	//*  42   82:invokevirtual   #44  <Method int View.getTop()>
	//*  43   85:iflt            90
				return false;
	//   44   88:iconst_0        
	//   45   89:ireturn         
		} else
	//*  46   90:goto            95
		{
			return false;
	//   47   93:iconst_0        
	//   48   94:ireturn         
		}
		return true;
	//   49   95:iconst_1        
	//   50   96:ireturn         
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
