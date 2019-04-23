// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.support.v4.view.ViewCompat;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			FragmentTransitionImpl

class FragmentTransitionImpl$1
	implements Runnable
{

	public void run()
	{
		for(int i = 0; i < val$numSharedElements; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #26  <Field int val$numSharedElements>
	//*   5    7:icmpge          67
		{
			ViewCompat.setTransitionName((View)val$sharedElementsIn.get(i), (String)val$inNames.get(i));
	//    6   10:aload_0         
	//    7   11:getfield        #28  <Field ArrayList val$sharedElementsIn>
	//    8   14:iload_1         
	//    9   15:invokevirtual   #45  <Method Object ArrayList.get(int)>
	//   10   18:checkcast       #47  <Class View>
	//   11   21:aload_0         
	//   12   22:getfield        #30  <Field ArrayList val$inNames>
	//   13   25:iload_1         
	//   14   26:invokevirtual   #45  <Method Object ArrayList.get(int)>
	//   15   29:checkcast       #49  <Class String>
	//   16   32:invokestatic    #55  <Method void ViewCompat.setTransitionName(View, String)>
			ViewCompat.setTransitionName((View)val$sharedElementsOut.get(i), (String)val$outNames.get(i));
	//   17   35:aload_0         
	//   18   36:getfield        #32  <Field ArrayList val$sharedElementsOut>
	//   19   39:iload_1         
	//   20   40:invokevirtual   #45  <Method Object ArrayList.get(int)>
	//   21   43:checkcast       #47  <Class View>
	//   22   46:aload_0         
	//   23   47:getfield        #34  <Field ArrayList val$outNames>
	//   24   50:iload_1         
	//   25   51:invokevirtual   #45  <Method Object ArrayList.get(int)>
	//   26   54:checkcast       #49  <Class String>
	//   27   57:invokestatic    #55  <Method void ViewCompat.setTransitionName(View, String)>
		}

	//   28   60:iload_1         
	//   29   61:iconst_1        
	//   30   62:iadd            
	//   31   63:istore_1        
	//*  32   64:goto            2
	//   33   67:return          
	}

	final FragmentTransitionImpl this$0;
	final ArrayList val$inNames;
	final int val$numSharedElements;
	final ArrayList val$outNames;
	final ArrayList val$sharedElementsIn;
	final ArrayList val$sharedElementsOut;

	FragmentTransitionImpl$1()
	{
		this$0 = final_fragmenttransitionimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field FragmentTransitionImpl this$0>
		val$numSharedElements = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #26  <Field int val$numSharedElements>
		val$sharedElementsIn = arraylist;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field ArrayList val$sharedElementsIn>
		val$inNames = arraylist1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field ArrayList val$inNames>
		val$sharedElementsOut = arraylist2;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #32  <Field ArrayList val$sharedElementsOut>
		val$outNames = ArrayList.this;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #34  <Field ArrayList val$outNames>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #37  <Method void Object()>
	//   20   37:return          
	}
}
