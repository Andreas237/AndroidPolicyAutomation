// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.widget:
//			DefaultItemAnimator

class DefaultItemAnimator$3
	implements Runnable
{

	public void run()
	{
		r r;
		for(Iterator iterator = val$additions.iterator(); iterator.hasNext(); animateAddImpl(r))
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ArrayList val$additions>
	//*   2    4:invokevirtual   #27  <Method Iterator ArrayList.iterator()>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #33  <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            38
			r = (r)iterator.next();
	//    7   17:aload_1         
	//    8   18:invokeinterface #37  <Method Object Iterator.next()>
	//    9   23:checkcast       #39  <Class RecyclerView$ViewHolder>
	//   10   26:astore_2        

	//   11   27:aload_0         
	//   12   28:getfield        #14  <Field DefaultItemAnimator this$0>
	//   13   31:aload_2         
	//   14   32:invokevirtual   #45  <Method void DefaultItemAnimator.animateAddImpl(RecyclerView$ViewHolder)>
	//*  15   35:goto            8
		val$additions.clear();
	//   16   38:aload_0         
	//   17   39:getfield        #16  <Field ArrayList val$additions>
	//   18   42:invokevirtual   #48  <Method void ArrayList.clear()>
		mAdditionsList.remove(((Object) (val$additions)));
	//   19   45:aload_0         
	//   20   46:getfield        #14  <Field DefaultItemAnimator this$0>
	//   21   49:getfield        #51  <Field ArrayList DefaultItemAnimator.mAdditionsList>
	//   22   52:aload_0         
	//   23   53:getfield        #16  <Field ArrayList val$additions>
	//   24   56:invokevirtual   #55  <Method boolean ArrayList.remove(Object)>
	//   25   59:pop             
	//   26   60:return          
	}

	final DefaultItemAnimator this$0;
	final ArrayList val$additions;

	DefaultItemAnimator$3()
	{
		this$0 = final_defaultitemanimator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field DefaultItemAnimator this$0>
		val$additions = ArrayList.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field ArrayList val$additions>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}
}
