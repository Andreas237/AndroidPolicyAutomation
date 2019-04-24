// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.TypeEvaluator;

class FloatArrayEvaluator
	implements TypeEvaluator
{

	FloatArrayEvaluator(float af[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mArray = af;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field float[] mArray>
	//    5    9:return          
	}

	public volatile Object evaluate(float f, Object obj, Object obj1)
	{
		return ((Object) (evaluate(f, (float[])obj, (float[])obj1)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #20  <Class float[]>
	//    4    6:aload_3         
	//    5    7:checkcast       #20  <Class float[]>
	//    6   10:invokevirtual   #23  <Method float[] evaluate(float, float[], float[])>
	//    7   13:areturn         
	}

	public float[] evaluate(float f, float af[], float af1[])
	{
		float af3[] = mArray;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field float[] mArray>
	//    2    4:astore          7
		float af2[] = af3;
	//    3    6:aload           7
	//    4    8:astore          6
		if(af3 == null)
	//*   5   10:aload           7
	//*   6   12:ifnonnull       21
			af2 = new float[af.length];
	//    7   15:aload_2         
	//    8   16:arraylength     
	//    9   17:newarray        float[]
	//   10   19:astore          6
		for(int i = 0; i < af2.length; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore          5
	//*  13   24:iload           5
	//*  14   26:aload           6
	//*  15   28:arraylength     
	//*  16   29:icmpge          64
		{
			float f1 = af[i];
	//   17   32:aload_2         
	//   18   33:iload           5
	//   19   35:faload          
	//   20   36:fstore          4
			af2[i] = f1 + (af1[i] - f1) * f;
	//   21   38:aload           6
	//   22   40:iload           5
	//   23   42:fload           4
	//   24   44:aload_3         
	//   25   45:iload           5
	//   26   47:faload          
	//   27   48:fload           4
	//   28   50:fsub            
	//   29   51:fload_1         
	//   30   52:fmul            
	//   31   53:fadd            
	//   32   54:fastore         
		}

	//   33   55:iload           5
	//   34   57:iconst_1        
	//   35   58:iadd            
	//   36   59:istore          5
	//*  37   61:goto            24
		return af2;
	//   38   64:aload           6
	//   39   66:areturn         
	}

	private float mArray[];
}
