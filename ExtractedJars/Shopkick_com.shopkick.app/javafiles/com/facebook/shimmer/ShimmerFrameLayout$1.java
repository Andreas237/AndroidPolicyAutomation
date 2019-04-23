// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.shimmer;


// Referenced classes of package com.facebook.shimmer:
//			ShimmerFrameLayout

class ShimmerFrameLayout$1
	implements android.view.obalLayoutListener
{

	public void onGlobalLayout()
	{
		boolean flag = ShimmerFrameLayout.access$200(ShimmerFrameLayout.this);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ShimmerFrameLayout this$0>
	//    2    4:invokestatic    #26  <Method boolean ShimmerFrameLayout.access$200(ShimmerFrameLayout)>
	//    3    7:istore_1        
		ShimmerFrameLayout.access$300(ShimmerFrameLayout.this);
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field ShimmerFrameLayout this$0>
	//    6   12:invokestatic    #29  <Method void ShimmerFrameLayout.access$300(ShimmerFrameLayout)>
		if(ShimmerFrameLayout.access$400(ShimmerFrameLayout.this) || flag)
	//*   7   15:aload_0         
	//*   8   16:getfield        #17  <Field ShimmerFrameLayout this$0>
	//*   9   19:invokestatic    #32  <Method boolean ShimmerFrameLayout.access$400(ShimmerFrameLayout)>
	//*  10   22:ifne            29
	//*  11   25:iload_1         
	//*  12   26:ifeq            36
			startShimmerAnimation();
	//   13   29:aload_0         
	//   14   30:getfield        #17  <Field ShimmerFrameLayout this$0>
	//   15   33:invokevirtual   #35  <Method void ShimmerFrameLayout.startShimmerAnimation()>
	//   16   36:return          
	}

	final ShimmerFrameLayout this$0;

	ShimmerFrameLayout$1()
	{
		this$0 = ShimmerFrameLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ShimmerFrameLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
