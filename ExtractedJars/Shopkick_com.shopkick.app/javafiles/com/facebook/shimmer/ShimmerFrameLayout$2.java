// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.shimmer;

import android.animation.ValueAnimator;

// Referenced classes of package com.facebook.shimmer:
//			ShimmerFrameLayout

class ShimmerFrameLayout$2
	implements android.animation.rUpdateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		float f = Math.max(0.0F, Math.min(1.0F, ((Float)valueanimator.getAnimatedValue()).floatValue()));
	//    0    0:fconst_0        
	//    1    1:fconst_1        
	//    2    2:aload_1         
	//    3    3:invokevirtual   #29  <Method Object ValueAnimator.getAnimatedValue()>
	//    4    6:checkcast       #31  <Class Float>
	//    5    9:invokevirtual   #35  <Method float Float.floatValue()>
	//    6   12:invokestatic    #41  <Method float Math.min(float, float)>
	//    7   15:invokestatic    #44  <Method float Math.max(float, float)>
	//    8   18:fstore_2        
		valueanimator = ((ValueAnimator) (ShimmerFrameLayout.this));
	//    9   19:aload_0         
	//   10   20:getfield        #17  <Field ShimmerFrameLayout this$0>
	//   11   23:astore_1        
		float f1 = ShimmerFrameLayout.access$500(((ShimmerFrameLayout) (valueanimator))).fromX;
	//   12   24:aload_1         
	//   13   25:invokestatic    #48  <Method ShimmerFrameLayout$MaskTranslation ShimmerFrameLayout.access$500(ShimmerFrameLayout)>
	//   14   28:getfield        #54  <Field int ShimmerFrameLayout$MaskTranslation.fromX>
	//   15   31:i2f             
	//   16   32:fstore_3        
		float f2 = 1.0F - f;
	//   17   33:fconst_1        
	//   18   34:fload_2         
	//   19   35:fsub            
	//   20   36:fstore          4
		ShimmerFrameLayout.access$600(((ShimmerFrameLayout) (valueanimator)), (int)(f1 * f2 + (float)ShimmerFrameLayout.access$500(ShimmerFrameLayout.this).toX * f));
	//   21   38:aload_1         
	//   22   39:fload_3         
	//   23   40:fload           4
	//   24   42:fmul            
	//   25   43:aload_0         
	//   26   44:getfield        #17  <Field ShimmerFrameLayout this$0>
	//   27   47:invokestatic    #48  <Method ShimmerFrameLayout$MaskTranslation ShimmerFrameLayout.access$500(ShimmerFrameLayout)>
	//   28   50:getfield        #57  <Field int ShimmerFrameLayout$MaskTranslation.toX>
	//   29   53:i2f             
	//   30   54:fload_2         
	//   31   55:fmul            
	//   32   56:fadd            
	//   33   57:f2i             
	//   34   58:invokestatic    #61  <Method void ShimmerFrameLayout.access$600(ShimmerFrameLayout, int)>
		valueanimator = ((ValueAnimator) (ShimmerFrameLayout.this));
	//   35   61:aload_0         
	//   36   62:getfield        #17  <Field ShimmerFrameLayout this$0>
	//   37   65:astore_1        
		ShimmerFrameLayout.access$700(((ShimmerFrameLayout) (valueanimator)), (int)((float)ShimmerFrameLayout.access$500(((ShimmerFrameLayout) (valueanimator))).fromY * f2 + (float)ShimmerFrameLayout.access$500(ShimmerFrameLayout.this).toY * f));
	//   38   66:aload_1         
	//   39   67:aload_1         
	//   40   68:invokestatic    #48  <Method ShimmerFrameLayout$MaskTranslation ShimmerFrameLayout.access$500(ShimmerFrameLayout)>
	//   41   71:getfield        #64  <Field int ShimmerFrameLayout$MaskTranslation.fromY>
	//   42   74:i2f             
	//   43   75:fload           4
	//   44   77:fmul            
	//   45   78:aload_0         
	//   46   79:getfield        #17  <Field ShimmerFrameLayout this$0>
	//   47   82:invokestatic    #48  <Method ShimmerFrameLayout$MaskTranslation ShimmerFrameLayout.access$500(ShimmerFrameLayout)>
	//   48   85:getfield        #67  <Field int ShimmerFrameLayout$MaskTranslation.toY>
	//   49   88:i2f             
	//   50   89:fload_2         
	//   51   90:fmul            
	//   52   91:fadd            
	//   53   92:f2i             
	//   54   93:invokestatic    #70  <Method void ShimmerFrameLayout.access$700(ShimmerFrameLayout, int)>
	//   55   96:return          
	}

	final ShimmerFrameLayout this$0;

	ShimmerFrameLayout$2()
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
