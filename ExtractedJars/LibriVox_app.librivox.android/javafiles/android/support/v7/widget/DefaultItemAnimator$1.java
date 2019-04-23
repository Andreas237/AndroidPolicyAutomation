// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.widget:
//			DefaultItemAnimator

class DefaultItemAnimator$1
	implements Runnable
{

	public void run()
	{
		veInfo veinfo;
		for(Iterator iterator = val$moves.iterator(); iterator.hasNext(); animateMoveImpl(veinfo.holder, veinfo.fromX, veinfo.fromY, veinfo.toX, veinfo.toY))
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ArrayList val$moves>
	//*   2    4:invokevirtual   #27  <Method Iterator ArrayList.iterator()>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #33  <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            57
			veinfo = (veInfo)iterator.next();
	//    7   17:aload_1         
	//    8   18:invokeinterface #37  <Method Object Iterator.next()>
	//    9   23:checkcast       #39  <Class DefaultItemAnimator$MoveInfo>
	//   10   26:astore_2        

	//   11   27:aload_0         
	//   12   28:getfield        #14  <Field DefaultItemAnimator this$0>
	//   13   31:aload_2         
	//   14   32:getfield        #43  <Field RecyclerView$ViewHolder DefaultItemAnimator$MoveInfo.holder>
	//   15   35:aload_2         
	//   16   36:getfield        #47  <Field int DefaultItemAnimator$MoveInfo.fromX>
	//   17   39:aload_2         
	//   18   40:getfield        #50  <Field int DefaultItemAnimator$MoveInfo.fromY>
	//   19   43:aload_2         
	//   20   44:getfield        #53  <Field int DefaultItemAnimator$MoveInfo.toX>
	//   21   47:aload_2         
	//   22   48:getfield        #56  <Field int DefaultItemAnimator$MoveInfo.toY>
	//   23   51:invokevirtual   #62  <Method void DefaultItemAnimator.animateMoveImpl(RecyclerView$ViewHolder, int, int, int, int)>
	//*  24   54:goto            8
		val$moves.clear();
	//   25   57:aload_0         
	//   26   58:getfield        #16  <Field ArrayList val$moves>
	//   27   61:invokevirtual   #65  <Method void ArrayList.clear()>
		mMovesList.remove(((Object) (val$moves)));
	//   28   64:aload_0         
	//   29   65:getfield        #14  <Field DefaultItemAnimator this$0>
	//   30   68:getfield        #68  <Field ArrayList DefaultItemAnimator.mMovesList>
	//   31   71:aload_0         
	//   32   72:getfield        #16  <Field ArrayList val$moves>
	//   33   75:invokevirtual   #72  <Method boolean ArrayList.remove(Object)>
	//   34   78:pop             
	//   35   79:return          
	}

	final DefaultItemAnimator this$0;
	final ArrayList val$moves;

	DefaultItemAnimator$1()
	{
		this$0 = final_defaultitemanimator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field DefaultItemAnimator this$0>
		val$moves = ArrayList.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field ArrayList val$moves>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}
}
