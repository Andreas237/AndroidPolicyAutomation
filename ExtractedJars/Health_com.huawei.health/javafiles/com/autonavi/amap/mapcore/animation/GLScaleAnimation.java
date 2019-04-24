// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.animation;


// Referenced classes of package com.autonavi.amap.mapcore.animation:
//			GLAnimation, GLTransformation

public class GLScaleAnimation extends GLAnimation
{

	public GLScaleAnimation(float f, float f1, float f2, float f3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void GLAnimation()>
		mFromX = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #18  <Field float mFromX>
		mToX = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #20  <Field float mToX>
		mFromY = f2;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #22  <Field float mFromY>
		mToY = f3;
	//   11   19:aload_0         
	//   12   20:fload           4
	//   13   22:putfield        #24  <Field float mToY>
		mPivotX = 0.0F;
	//   14   25:aload_0         
	//   15   26:fconst_0        
	//   16   27:putfield        #26  <Field float mPivotX>
		mPivotY = 0.0F;
	//   17   30:aload_0         
	//   18   31:fconst_0        
	//   19   32:putfield        #28  <Field float mPivotY>
	//   20   35:return          
	}

	protected void applyTransformation(float f, GLTransformation gltransformation)
	{
		float f1 = 1.0F;
	//    0    0:fconst_1        
	//    1    1:fstore_3        
		float f2 = 1.0F;
	//    2    2:fconst_1        
	//    3    3:fstore          4
		if(mFromX != 1.0F || mToX != 1.0F)
	//*   4    5:aload_0         
	//*   5    6:getfield        #18  <Field float mFromX>
	//*   6    9:fconst_1        
	//*   7   10:fcmpl           
	//*   8   11:ifne            23
	//*   9   14:aload_0         
	//*  10   15:getfield        #20  <Field float mToX>
	//*  11   18:fconst_1        
	//*  12   19:fcmpl           
	//*  13   20:ifeq            40
			f1 = mFromX + (mToX - mFromX) * f;
	//   14   23:aload_0         
	//   15   24:getfield        #18  <Field float mFromX>
	//   16   27:aload_0         
	//   17   28:getfield        #20  <Field float mToX>
	//   18   31:aload_0         
	//   19   32:getfield        #18  <Field float mFromX>
	//   20   35:fsub            
	//   21   36:fload_1         
	//   22   37:fmul            
	//   23   38:fadd            
	//   24   39:fstore_3        
		if(mFromY != 1.0F || mToY != 1.0F)
	//*  25   40:aload_0         
	//*  26   41:getfield        #22  <Field float mFromY>
	//*  27   44:fconst_1        
	//*  28   45:fcmpl           
	//*  29   46:ifne            58
	//*  30   49:aload_0         
	//*  31   50:getfield        #24  <Field float mToY>
	//*  32   53:fconst_1        
	//*  33   54:fcmpl           
	//*  34   55:ifeq            76
			f2 = mFromY + (mToY - mFromY) * f;
	//   35   58:aload_0         
	//   36   59:getfield        #22  <Field float mFromY>
	//   37   62:aload_0         
	//   38   63:getfield        #24  <Field float mToY>
	//   39   66:aload_0         
	//   40   67:getfield        #22  <Field float mFromY>
	//   41   70:fsub            
	//   42   71:fload_1         
	//   43   72:fmul            
	//   44   73:fadd            
	//   45   74:fstore          4
		if(mPivotX == 0.0F && mPivotY == 0.0F)
	//*  46   76:aload_0         
	//*  47   77:getfield        #26  <Field float mPivotX>
	//*  48   80:fconst_0        
	//*  49   81:fcmpl           
	//*  50   82:ifne            108
	//*  51   85:aload_0         
	//*  52   86:getfield        #28  <Field float mPivotY>
	//*  53   89:fconst_0        
	//*  54   90:fcmpl           
	//*  55   91:ifne            108
		{
			gltransformation.scaleX = f1;
	//   56   94:aload_2         
	//   57   95:fload_3         
	//   58   96:f2d             
	//   59   97:putfield        #37  <Field double GLTransformation.scaleX>
			gltransformation.scaleY = f2;
	//   60  100:aload_2         
	//   61  101:fload           4
	//   62  103:f2d             
	//   63  104:putfield        #40  <Field double GLTransformation.scaleY>
			return;
	//   64  107:return          
		} else
		{
			gltransformation.scaleX = f1;
	//   65  108:aload_2         
	//   66  109:fload_3         
	//   67  110:f2d             
	//   68  111:putfield        #37  <Field double GLTransformation.scaleX>
			gltransformation.scaleY = f2;
	//   69  114:aload_2         
	//   70  115:fload           4
	//   71  117:f2d             
	//   72  118:putfield        #40  <Field double GLTransformation.scaleY>
			return;
	//   73  121:return          
		}
	}

	private float mFromX;
	private float mFromY;
	private float mPivotX;
	private float mPivotY;
	private float mToX;
	private float mToY;
}
