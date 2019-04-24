// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//			ViewPager

static class ViewPager$ViewPositionComparator
	implements Comparator
{

	public int compare(View view, View view1)
	{
		view = ((View) ((ViewPager.LayoutParams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #23  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #25  <Class ViewPager$LayoutParams>
	//    3    7:astore_1        
		view1 = ((View) ((ViewPager.LayoutParams)view1.getLayoutParams()));
	//    4    8:aload_2         
	//    5    9:invokevirtual   #23  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   12:checkcast       #25  <Class ViewPager$LayoutParams>
	//    7   15:astore_2        
		if(((ViewPager.LayoutParams) (view)).isDecor != ((ViewPager.LayoutParams) (view1)).isDecor)
	//*   8   16:aload_1         
	//*   9   17:getfield        #29  <Field boolean ViewPager$LayoutParams.isDecor>
	//*  10   20:aload_2         
	//*  11   21:getfield        #29  <Field boolean ViewPager$LayoutParams.isDecor>
	//*  12   24:icmpeq          38
			return !((ViewPager.LayoutParams) (view)).isDecor ? -1 : 1;
	//   13   27:aload_1         
	//   14   28:getfield        #29  <Field boolean ViewPager$LayoutParams.isDecor>
	//   15   31:ifeq            36
	//   16   34:iconst_1        
	//   17   35:ireturn         
	//   18   36:iconst_m1       
	//   19   37:ireturn         
		else
			return ((ViewPager.LayoutParams) (view)).position - ((ViewPager.LayoutParams) (view1)).position;
	//   20   38:aload_1         
	//   21   39:getfield        #33  <Field int ViewPager$LayoutParams.position>
	//   22   42:aload_2         
	//   23   43:getfield        #33  <Field int ViewPager$LayoutParams.position>
	//   24   46:isub            
	//   25   47:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((View)obj, (View)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #19  <Class View>
	//    3    5:aload_2         
	//    4    6:checkcast       #19  <Class View>
	//    5    9:invokevirtual   #36  <Method int compare(View, View)>
	//    6   12:ireturn         
	}

	ViewPager$ViewPositionComparator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
