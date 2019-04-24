// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//			FragmentTransitionCompat21

static final class FragmentTransitionCompat21$7
	implements Runnable
{

	public void run()
	{
		int j = val$sharedElementsIn.size();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ArrayList val$sharedElementsIn>
	//    2    4:invokevirtual   #32  <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          58
		{
			View view = (View)val$sharedElementsIn.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #19  <Field ArrayList val$sharedElementsIn>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #36  <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #38  <Class View>
	//   14   26:astore_3        
			String s = view.getTransitionName();
	//   15   27:aload_3         
	//   16   28:invokevirtual   #42  <Method String View.getTransitionName()>
	//   17   31:astore          4
			view.setTransitionName((String)val$nameOverrides.get(((Object) (s))));
	//   18   33:aload_3         
	//   19   34:aload_0         
	//   20   35:getfield        #21  <Field Map val$nameOverrides>
	//   21   38:aload           4
	//   22   40:invokeinterface #47  <Method Object Map.get(Object)>
	//   23   45:checkcast       #49  <Class String>
	//   24   48:invokevirtual   #53  <Method void View.setTransitionName(String)>
		}

	//   25   51:iload_1         
	//   26   52:iconst_1        
	//   27   53:iadd            
	//   28   54:istore_1        
	//*  29   55:goto            10
	//   30   58:return          
	}

	final Map val$nameOverrides;
	final ArrayList val$sharedElementsIn;

	FragmentTransitionCompat21$7(ArrayList arraylist, Map map)
	{
		val$sharedElementsIn = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ArrayList val$sharedElementsIn>
		val$nameOverrides = map;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Map val$nameOverrides>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
