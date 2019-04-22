// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.animation;

import android.animation.*;
import java.util.List;

public class AnimatorSetCompat
{

	public static void playTogether(AnimatorSet animatorset, List list)
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #16  <Method int List.size()>
	//    2    6:istore_3        
		long l = 0L;
	//    3    7:lconst_0        
	//    4    8:lstore          4
		for(int i = 0; i < j; i++)
	//*   5   10:iconst_0        
	//*   6   11:istore_2        
	//*   7   12:iload_2         
	//*   8   13:iload_3         
	//*   9   14:icmpge          54
		{
			Animator animator = (Animator)list.get(i);
	//   10   17:aload_1         
	//   11   18:iload_2         
	//   12   19:invokeinterface #20  <Method Object List.get(int)>
	//   13   24:checkcast       #22  <Class Animator>
	//   14   27:astore          6
			l = Math.max(l, animator.getStartDelay() + animator.getDuration());
	//   15   29:lload           4
	//   16   31:aload           6
	//   17   33:invokevirtual   #26  <Method long Animator.getStartDelay()>
	//   18   36:aload           6
	//   19   38:invokevirtual   #29  <Method long Animator.getDuration()>
	//   20   41:ladd            
	//   21   42:invokestatic    #35  <Method long Math.max(long, long)>
	//   22   45:lstore          4
		}

	//   23   47:iload_2         
	//   24   48:iconst_1        
	//   25   49:iadd            
	//   26   50:istore_2        
	//*  27   51:goto            12
		ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
			0, 0
		});
	//   28   54:iconst_2        
	//   29   55:newarray        int[]
	//   30   57:dup             
	//   31   58:iconst_0        
	//   32   59:iconst_0        
	//   33   60:iastore         
	//   34   61:dup             
	//   35   62:iconst_1        
	//   36   63:iconst_0        
	//   37   64:iastore         
	//   38   65:invokestatic    #41  <Method ValueAnimator ValueAnimator.ofInt(int[])>
	//   39   68:astore          6
		((Animator) (valueanimator)).setDuration(l);
	//   40   70:aload           6
	//   41   72:lload           4
	//   42   74:invokevirtual   #45  <Method Animator Animator.setDuration(long)>
	//   43   77:pop             
		list.add(0, ((Object) (valueanimator)));
	//   44   78:aload_1         
	//   45   79:iconst_0        
	//   46   80:aload           6
	//   47   82:invokeinterface #49  <Method void List.add(int, Object)>
		animatorset.playTogether(((java.util.Collection) (list)));
	//   48   87:aload_0         
	//   49   88:aload_1         
	//   50   89:invokevirtual   #54  <Method void AnimatorSet.playTogether(java.util.Collection)>
	//   51   92:return          
	}
}
