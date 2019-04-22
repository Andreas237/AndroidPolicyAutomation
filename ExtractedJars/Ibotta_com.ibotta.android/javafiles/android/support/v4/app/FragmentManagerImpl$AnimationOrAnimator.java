// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.animation.Animator;
import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//			FragmentManagerImpl

private static class FragmentManagerImpl$AnimationOrAnimator
{

	public final Animation animation;
	public final Animator animator;

	FragmentManagerImpl$AnimationOrAnimator(Animator animator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		animation = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #18  <Field Animation animation>
		animator = animator1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #20  <Field Animator animator>
		if(animator1 != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          19
			return;
	//   10   18:return          
		else
			throw new IllegalStateException("Animator cannot be null");
	//   11   19:new             #22  <Class IllegalStateException>
	//   12   22:dup             
	//   13   23:ldc1            #24  <String "Animator cannot be null">
	//   14   25:invokespecial   #27  <Method void IllegalStateException(String)>
	//   15   28:athrow          
	}

	FragmentManagerImpl$AnimationOrAnimator(Animation animation1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		animation = animation1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Animation animation>
		animator = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #20  <Field Animator animator>
		if(animation1 != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          19
			return;
	//   10   18:return          
		else
			throw new IllegalStateException("Animation cannot be null");
	//   11   19:new             #22  <Class IllegalStateException>
	//   12   22:dup             
	//   13   23:ldc1            #31  <String "Animation cannot be null">
	//   14   25:invokespecial   #27  <Method void IllegalStateException(String)>
	//   15   28:athrow          
	}
}
