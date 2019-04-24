// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.animation;


// Referenced classes of package com.autonavi.amap.mapcore.animation:
//			GLAnimation, GLTransformation

public class GLAlphaAnimation extends GLAnimation
{

	public GLAlphaAnimation(float f, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void GLAnimation()>
		mFromAlpha = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #15  <Field float mFromAlpha>
		mToAlpha = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #17  <Field float mToAlpha>
		mCurAlpha = 0.0F;
	//    8   14:aload_0         
	//    9   15:fconst_0        
	//   10   16:putfield        #19  <Field float mCurAlpha>
		mFromAlpha = f;
	//   11   19:aload_0         
	//   12   20:fload_1         
	//   13   21:putfield        #15  <Field float mFromAlpha>
		mToAlpha = f1;
	//   14   24:aload_0         
	//   15   25:fload_2         
	//   16   26:putfield        #17  <Field float mToAlpha>
	//   17   29:return          
	}

	protected void applyTransformation(float f, GLTransformation gltransformation)
	{
		float f1 = mFromAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field float mFromAlpha>
	//    2    4:fstore_3        
		mCurAlpha = (mToAlpha - f1) * f + f1;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #17  <Field float mToAlpha>
	//    6   10:fload_3         
	//    7   11:fsub            
	//    8   12:fload_1         
	//    9   13:fmul            
	//   10   14:fload_3         
	//   11   15:fadd            
	//   12   16:putfield        #19  <Field float mCurAlpha>
		gltransformation.alpha = mCurAlpha;
	//   13   19:aload_2         
	//   14   20:aload_0         
	//   15   21:getfield        #19  <Field float mCurAlpha>
	//   16   24:f2d             
	//   17   25:putfield        #28  <Field double GLTransformation.alpha>
	//   18   28:return          
	}

	public float mCurAlpha;
	public float mFromAlpha;
	public float mToAlpha;
}
