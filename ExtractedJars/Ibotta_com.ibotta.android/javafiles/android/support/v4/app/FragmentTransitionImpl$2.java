// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.support.v4.view.ViewCompat;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//			FragmentTransitionImpl

class FragmentTransitionImpl$2
	implements Runnable
{

	public void run()
	{
		int j = val$sharedElementsIn.size();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ArrayList val$sharedElementsIn>
	//    2    4:invokevirtual   #36  <Method int ArrayList.size()>
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
	//   10   16:getfield        #23  <Field ArrayList val$sharedElementsIn>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #40  <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #42  <Class View>
	//   14   26:astore_3        
			String s = ViewCompat.getTransitionName(view);
	//   15   27:aload_3         
	//   16   28:invokestatic    #48  <Method String ViewCompat.getTransitionName(View)>
	//   17   31:astore          4
			if(s != null)
	//*  18   33:aload           4
	//*  19   35:ifnull          51
				ViewCompat.setTransitionName(view, FragmentTransitionImpl.findKeyForValue(val$nameOverrides, s));
	//   20   38:aload_3         
	//   21   39:aload_0         
	//   22   40:getfield        #25  <Field Map val$nameOverrides>
	//   23   43:aload           4
	//   24   45:invokestatic    #52  <Method String FragmentTransitionImpl.findKeyForValue(Map, String)>
	//   25   48:invokestatic    #56  <Method void ViewCompat.setTransitionName(View, String)>
		}

	//   26   51:iload_1         
	//   27   52:iconst_1        
	//   28   53:iadd            
	//   29   54:istore_1        
	//*  30   55:goto            10
	//   31   58:return          
	}

	final FragmentTransitionImpl this$0;
	final Map val$nameOverrides;
	final ArrayList val$sharedElementsIn;

	FragmentTransitionImpl$2()
	{
		this$0 = final_fragmenttransitionimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field FragmentTransitionImpl this$0>
		val$sharedElementsIn = arraylist;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field ArrayList val$sharedElementsIn>
		val$nameOverrides = Map.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field Map val$nameOverrides>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
