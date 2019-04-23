// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

// Referenced classes of package android.support.v7.graphics.drawable:
//			AnimatedStateListDrawableCompat

private static class AnimatedStateListDrawableCompat$FrameInterpolator
	implements TimeInterpolator
{

	public float getInterpolation(float f)
	{
		int j = (int)(f * (float)mTotalDuration + 0.5F);
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field int mTotalDuration>
	//    3    5:i2f             
	//    4    6:fmul            
	//    5    7:ldc1            #29  <Float 0.5F>
	//    6    9:fadd            
	//    7   10:f2i             
	//    8   11:istore_3        
		int k = mFrames;
	//    9   12:aload_0         
	//   10   13:getfield        #31  <Field int mFrames>
	//   11   16:istore          4
		int ai[] = mFrameTimes;
	//   12   18:aload_0         
	//   13   19:getfield        #33  <Field int[] mFrameTimes>
	//   14   22:astore          5
		int i;
		for(i = 0; i < k && j >= ai[i]; i++)
	//*  15   24:iconst_0        
	//*  16   25:istore_2        
	//*  17   26:iload_2         
	//*  18   27:iload           4
	//*  19   29:icmpge          54
	//*  20   32:iload_3         
	//*  21   33:aload           5
	//*  22   35:iload_2         
	//*  23   36:iaload          
	//*  24   37:icmplt          54
			j -= ai[i];
	//   25   40:iload_3         
	//   26   41:aload           5
	//   27   43:iload_2         
	//   28   44:iaload          
	//   29   45:isub            
	//   30   46:istore_3        

	//   31   47:iload_2         
	//   32   48:iconst_1        
	//   33   49:iadd            
	//   34   50:istore_2        
	//*  35   51:goto            26
		if(i < k)
	//*  36   54:iload_2         
	//*  37   55:iload           4
	//*  38   57:icmpge          72
			f = (float)j / (float)mTotalDuration;
	//   39   60:iload_3         
	//   40   61:i2f             
	//   41   62:aload_0         
	//   42   63:getfield        #28  <Field int mTotalDuration>
	//   43   66:i2f             
	//   44   67:fdiv            
	//   45   68:fstore_1        
		else
	//*  46   69:goto            74
			f = 0.0F;
	//   47   72:fconst_0        
	//   48   73:fstore_1        
		return (float)i / (float)k + f;
	//   49   74:iload_2         
	//   50   75:i2f             
	//   51   76:iload           4
	//   52   78:i2f             
	//   53   79:fdiv            
	//   54   80:fload_1         
	//   55   81:fadd            
	//   56   82:freturn         
	}

	int getTotalDuration()
	{
		return mTotalDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int mTotalDuration>
	//    2    4:ireturn         
	}

	int updateFrames(AnimationDrawable animationdrawable, boolean flag)
	{
		int l = animationdrawable.getNumberOfFrames();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #40  <Method int AnimationDrawable.getNumberOfFrames()>
	//    2    4:istore          6
		mFrames = l;
	//    3    6:aload_0         
	//    4    7:iload           6
	//    5    9:putfield        #31  <Field int mFrames>
		int ai[] = mFrameTimes;
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field int[] mFrameTimes>
	//    8   16:astore          7
		if(ai == null || ai.length < l)
	//*   9   18:aload           7
	//*  10   20:ifnull          31
	//*  11   23:aload           7
	//*  12   25:arraylength     
	//*  13   26:iload           6
	//*  14   28:icmpge          39
			mFrameTimes = new int[l];
	//   15   31:aload_0         
	//   16   32:iload           6
	//   17   34:newarray        int[]
	//   18   36:putfield        #33  <Field int[] mFrameTimes>
		ai = mFrameTimes;
	//   19   39:aload_0         
	//   20   40:getfield        #33  <Field int[] mFrameTimes>
	//   21   43:astore          7
		int i = 0;
	//   22   45:iconst_0        
	//   23   46:istore_3        
		int j = 0;
	//   24   47:iconst_0        
	//   25   48:istore          4
		for(; i < l; i++)
	//*  26   50:iload_3         
	//*  27   51:iload           6
	//*  28   53:icmpge          102
		{
			int k;
			if(flag)
	//*  29   56:iload_2         
	//*  30   57:ifeq            71
				k = l - i - 1;
	//   31   60:iload           6
	//   32   62:iload_3         
	//   33   63:isub            
	//   34   64:iconst_1        
	//   35   65:isub            
	//   36   66:istore          5
			else
	//*  37   68:goto            74
				k = i;
	//   38   71:iload_3         
	//   39   72:istore          5
			k = animationdrawable.getDuration(k);
	//   40   74:aload_1         
	//   41   75:iload           5
	//   42   77:invokevirtual   #44  <Method int AnimationDrawable.getDuration(int)>
	//   43   80:istore          5
			ai[i] = k;
	//   44   82:aload           7
	//   45   84:iload_3         
	//   46   85:iload           5
	//   47   87:iastore         
			j += k;
	//   48   88:iload           4
	//   49   90:iload           5
	//   50   92:iadd            
	//   51   93:istore          4
		}

	//   52   95:iload_3         
	//   53   96:iconst_1        
	//   54   97:iadd            
	//   55   98:istore_3        
	//*  56   99:goto            50
		mTotalDuration = j;
	//   57  102:aload_0         
	//   58  103:iload           4
	//   59  105:putfield        #28  <Field int mTotalDuration>
		return j;
	//   60  108:iload           4
	//   61  110:ireturn         
	}

	private int mFrameTimes[];
	private int mFrames;
	private int mTotalDuration;

	AnimatedStateListDrawableCompat$FrameInterpolator(AnimationDrawable animationdrawable, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		updateFrames(animationdrawable, flag);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #23  <Method int updateFrames(AnimationDrawable, boolean)>
	//    6   10:pop             
	//    7   11:return          
	}
}
