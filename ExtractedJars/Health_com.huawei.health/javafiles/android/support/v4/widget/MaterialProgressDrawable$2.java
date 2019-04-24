// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//			MaterialProgressDrawable

class MaterialProgressDrawable$2
	implements android.view.animation.
{

	public void onAnimationEnd(Animation animation)
	{
	//    0    0:return          
	}

	public void onAnimationRepeat(Animation animation)
	{
		val$ring.storeOriginals();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MaterialProgressDrawable$Ring val$ring>
	//    2    4:invokevirtual   #32  <Method void MaterialProgressDrawable$Ring.storeOriginals()>
		val$ring.goToNextColor();
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field MaterialProgressDrawable$Ring val$ring>
	//    5   11:invokevirtual   #35  <Method void MaterialProgressDrawable$Ring.goToNextColor()>
		val$ring.setStartTrim(val$ring.getEndTrim());
	//    6   14:aload_0         
	//    7   15:getfield        #21  <Field MaterialProgressDrawable$Ring val$ring>
	//    8   18:aload_0         
	//    9   19:getfield        #21  <Field MaterialProgressDrawable$Ring val$ring>
	//   10   22:invokevirtual   #39  <Method float MaterialProgressDrawable$Ring.getEndTrim()>
	//   11   25:invokevirtual   #43  <Method void MaterialProgressDrawable$Ring.setStartTrim(float)>
		if(mFinishing)
	//*  12   28:aload_0         
	//*  13   29:getfield        #19  <Field MaterialProgressDrawable this$0>
	//*  14   32:getfield        #47  <Field boolean MaterialProgressDrawable.mFinishing>
	//*  15   35:ifeq            62
		{
			mFinishing = false;
	//   16   38:aload_0         
	//   17   39:getfield        #19  <Field MaterialProgressDrawable this$0>
	//   18   42:iconst_0        
	//   19   43:putfield        #47  <Field boolean MaterialProgressDrawable.mFinishing>
			animation.setDuration(1332L);
	//   20   46:aload_1         
	//   21   47:ldc2w           #48  <Long 1332L>
	//   22   50:invokevirtual   #55  <Method void Animation.setDuration(long)>
			val$ring.setShowArrow(false);
	//   23   53:aload_0         
	//   24   54:getfield        #21  <Field MaterialProgressDrawable$Ring val$ring>
	//   25   57:iconst_0        
	//   26   58:invokevirtual   #59  <Method void MaterialProgressDrawable$Ring.setShowArrow(boolean)>
			return;
	//   27   61:return          
		} else
		{
			mRotationCount = (mRotationCount + 1.0F) % 5F;
	//   28   62:aload_0         
	//   29   63:getfield        #19  <Field MaterialProgressDrawable this$0>
	//   30   66:aload_0         
	//   31   67:getfield        #19  <Field MaterialProgressDrawable this$0>
	//   32   70:getfield        #63  <Field float MaterialProgressDrawable.mRotationCount>
	//   33   73:fconst_1        
	//   34   74:fadd            
	//   35   75:ldc1            #64  <Float 5F>
	//   36   77:frem            
	//   37   78:putfield        #63  <Field float MaterialProgressDrawable.mRotationCount>
			return;
	//   38   81:return          
		}
	}

	public void onAnimationStart(Animation animation)
	{
		mRotationCount = 0.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field MaterialProgressDrawable this$0>
	//    2    4:fconst_0        
	//    3    5:putfield        #63  <Field float MaterialProgressDrawable.mRotationCount>
	//    4    8:return          
	}

	final MaterialProgressDrawable this$0;
	final ng val$ring;

	MaterialProgressDrawable$2()
	{
		this$0 = final_materialprogressdrawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field MaterialProgressDrawable this$0>
		val$ring = ng.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field MaterialProgressDrawable$Ring val$ring>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
