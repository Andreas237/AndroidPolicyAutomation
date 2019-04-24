// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.gloverlay;

import com.amap.api.mapcore.util.ac;

// Referenced classes of package com.autonavi.ae.gmap.gloverlay:
//			CrossVectorOverlay, GLCrossVector

class CrossVectorOverlay$1
	implements Runnable
{

	public void run()
	{
		if(mGLOverlay != null && ((GLCrossVector)mGLOverlay).isVisible() && CrossVectorOverlay.access$000(CrossVectorOverlay.this) != null && !CrossVectorOverlay.access$000(CrossVectorOverlay.this).c())
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field CrossVectorOverlay this$0>
	//*   2    4:getfield        #33  <Field GLOverlay CrossVectorOverlay.mGLOverlay>
	//*   3    7:ifnull          77
	//*   4   10:aload_0         
	//*   5   11:getfield        #20  <Field CrossVectorOverlay this$0>
	//*   6   14:getfield        #33  <Field GLOverlay CrossVectorOverlay.mGLOverlay>
	//*   7   17:checkcast       #35  <Class GLCrossVector>
	//*   8   20:invokevirtual   #39  <Method boolean GLCrossVector.isVisible()>
	//*   9   23:ifeq            77
	//*  10   26:aload_0         
	//*  11   27:getfield        #20  <Field CrossVectorOverlay this$0>
	//*  12   30:invokestatic    #43  <Method ac CrossVectorOverlay.access$000(CrossVectorOverlay)>
	//*  13   33:ifnull          77
	//*  14   36:aload_0         
	//*  15   37:getfield        #20  <Field CrossVectorOverlay this$0>
	//*  16   40:invokestatic    #43  <Method ac CrossVectorOverlay.access$000(CrossVectorOverlay)>
	//*  17   43:invokevirtual   #48  <Method boolean ac.c()>
	//*  18   46:ifne            77
		{
			CrossVectorOverlay.access$000(CrossVectorOverlay.this).a(val$mapWidth, val$mapHeight);
	//   19   49:aload_0         
	//   20   50:getfield        #20  <Field CrossVectorOverlay this$0>
	//   21   53:invokestatic    #43  <Method ac CrossVectorOverlay.access$000(CrossVectorOverlay)>
	//   22   56:aload_0         
	//   23   57:getfield        #22  <Field int val$mapWidth>
	//   24   60:aload_0         
	//   25   61:getfield        #24  <Field int val$mapHeight>
	//   26   64:invokevirtual   #52  <Method void ac.a(int, int)>
			CrossVectorOverlay.access$000(CrossVectorOverlay.this).a();
	//   27   67:aload_0         
	//   28   68:getfield        #20  <Field CrossVectorOverlay this$0>
	//   29   71:invokestatic    #43  <Method ac CrossVectorOverlay.access$000(CrossVectorOverlay)>
	//   30   74:invokevirtual   #54  <Method void ac.a()>
		}
	//   31   77:return          
	}

	final CrossVectorOverlay this$0;
	final int val$mapHeight;
	final int val$mapWidth;

	CrossVectorOverlay$1()
	{
		this$0 = final_crossvectoroverlay;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CrossVectorOverlay this$0>
		val$mapWidth = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int val$mapWidth>
		val$mapHeight = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #24  <Field int val$mapHeight>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
