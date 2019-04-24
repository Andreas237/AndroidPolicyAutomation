// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			VisibilityPropagation, Transition, TransitionValues

public class CircularPropagation extends VisibilityPropagation
{

	public CircularPropagation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void VisibilityPropagation()>
		mPropagationSpeed = 3F;
	//    2    4:aload_0         
	//    3    5:ldc1            #11  <Float 3F>
	//    4    7:putfield        #13  <Field float mPropagationSpeed>
	//    5   10:return          
	}

	private static float distance(float f, float f1, float f2, float f3)
	{
		f = f2 - f;
	//    0    0:fload_2         
	//    1    1:fload_0         
	//    2    2:fsub            
	//    3    3:fstore_0        
		f1 = f3 - f1;
	//    4    4:fload_3         
	//    5    5:fload_1         
	//    6    6:fsub            
	//    7    7:fstore_1        
		return (float)Math.sqrt(f * f + f1 * f1);
	//    8    8:fload_0         
	//    9    9:fload_0         
	//   10   10:fmul            
	//   11   11:fload_1         
	//   12   12:fload_1         
	//   13   13:fmul            
	//   14   14:fadd            
	//   15   15:f2d             
	//   16   16:invokestatic    #22  <Method double Math.sqrt(double)>
	//   17   19:d2f             
	//   18   20:freturn         
	}

	public long getStartDelay(ViewGroup viewgroup, Transition transition, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		if(transitionvalues == null && transitionvalues1 == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       11
	//*   2    4:aload           4
	//*   3    6:ifnonnull       11
			return 0L;
	//    4    9:lconst_0        
	//    5   10:lreturn         
		float f;
		int i;
		int j;
		int k;
		int l;
		int i1;
		long l1;
		long l2;
		if(transitionvalues1 == null || getViewVisibility(transitionvalues) == 0)
	//*   6   11:aload           4
	//*   7   13:ifnull          24
	//*   8   16:aload_0         
	//*   9   17:aload_3         
	//*  10   18:invokevirtual   #28  <Method int getViewVisibility(TransitionValues)>
	//*  11   21:ifne            137
		{
			i = -1;
	//   12   24:iconst_m1       
	//   13   25:istore          6
		} else
	//*  14   27:aload_0         
	//*  15   28:aload_3         
	//*  16   29:invokevirtual   #31  <Method int getViewX(TransitionValues)>
	//*  17   32:istore          9
	//*  18   34:aload_0         
	//*  19   35:aload_3         
	//*  20   36:invokevirtual   #34  <Method int getViewY(TransitionValues)>
	//*  21   39:istore          10
	//*  22   41:aload_2         
	//*  23   42:invokevirtual   #40  <Method Rect Transition.getEpicenter()>
	//*  24   45:astore_3        
	//*  25   46:aload_3         
	//*  26   47:ifnull          146
	//*  27   50:aload_3         
	//*  28   51:invokevirtual   #46  <Method int Rect.centerX()>
	//*  29   54:istore          8
	//*  30   56:aload_3         
	//*  31   57:invokevirtual   #49  <Method int Rect.centerY()>
	//*  32   60:istore          7
	//*  33   62:iload           9
	//*  34   64:i2f             
	//*  35   65:iload           10
	//*  36   67:i2f             
	//*  37   68:iload           8
	//*  38   70:i2f             
	//*  39   71:iload           7
	//*  40   73:i2f             
	//*  41   74:invokestatic    #51  <Method float distance(float, float, float, float)>
	//*  42   77:fconst_0        
	//*  43   78:fconst_0        
	//*  44   79:aload_1         
	//*  45   80:invokevirtual   #56  <Method int ViewGroup.getWidth()>
	//*  46   83:i2f             
	//*  47   84:aload_1         
	//*  48   85:invokevirtual   #59  <Method int ViewGroup.getHeight()>
	//*  49   88:i2f             
	//*  50   89:invokestatic    #51  <Method float distance(float, float, float, float)>
	//*  51   92:fdiv            
	//*  52   93:fstore          5
	//*  53   95:aload_2         
	//*  54   96:invokevirtual   #63  <Method long Transition.getDuration()>
	//*  55   99:lstore          13
	//*  56  101:lload           13
	//*  57  103:lstore          11
	//*  58  105:lload           13
	//*  59  107:lconst_0        
	//*  60  108:lcmp            
	//*  61  109:ifge            117
	//*  62  112:ldc2w           #64  <Long 300L>
	//*  63  115:lstore          11
	//*  64  117:lload           11
	//*  65  119:iload           6
	//*  66  121:i2l             
	//*  67  122:lmul            
	//*  68  123:l2f             
	//*  69  124:aload_0         
	//*  70  125:getfield        #13  <Field float mPropagationSpeed>
	//*  71  128:fdiv            
	//*  72  129:fload           5
	//*  73  131:fmul            
	//*  74  132:invokestatic    #69  <Method int Math.round(float)>
	//*  75  135:i2l             
	//*  76  136:lreturn         
		{
			i = 1;
	//   77  137:iconst_1        
	//   78  138:istore          6
			transitionvalues = transitionvalues1;
	//   79  140:aload           4
	//   80  142:astore_3        
		}
		l = getViewX(transitionvalues);
		i1 = getViewY(transitionvalues);
		transitionvalues = ((TransitionValues) (transition.getEpicenter()));
		if(transitionvalues != null)
		{
			k = ((Rect) (transitionvalues)).centerX();
			j = ((Rect) (transitionvalues)).centerY();
		} else
	//*  81  143:goto            27
		{
			transitionvalues = ((TransitionValues) (new int[2]));
	//   82  146:iconst_2        
	//   83  147:newarray        int[]
	//   84  149:astore_3        
			viewgroup.getLocationOnScreen(((int []) (transitionvalues)));
	//   85  150:aload_1         
	//   86  151:aload_3         
	//   87  152:invokevirtual   #73  <Method void ViewGroup.getLocationOnScreen(int[])>
			k = Math.round((float)(transitionvalues[0] + viewgroup.getWidth() / 2) + viewgroup.getTranslationX());
	//   88  155:aload_3         
	//   89  156:iconst_0        
	//   90  157:iaload          
	//   91  158:aload_1         
	//   92  159:invokevirtual   #56  <Method int ViewGroup.getWidth()>
	//   93  162:iconst_2        
	//   94  163:idiv            
	//   95  164:iadd            
	//   96  165:i2f             
	//   97  166:aload_1         
	//   98  167:invokevirtual   #77  <Method float ViewGroup.getTranslationX()>
	//   99  170:fadd            
	//  100  171:invokestatic    #69  <Method int Math.round(float)>
	//  101  174:istore          8
			j = Math.round((float)(transitionvalues[1] + viewgroup.getHeight() / 2) + viewgroup.getTranslationY());
	//  102  176:aload_3         
	//  103  177:iconst_1        
	//  104  178:iaload          
	//  105  179:aload_1         
	//  106  180:invokevirtual   #59  <Method int ViewGroup.getHeight()>
	//  107  183:iconst_2        
	//  108  184:idiv            
	//  109  185:iadd            
	//  110  186:i2f             
	//  111  187:aload_1         
	//  112  188:invokevirtual   #80  <Method float ViewGroup.getTranslationY()>
	//  113  191:fadd            
	//  114  192:invokestatic    #69  <Method int Math.round(float)>
	//  115  195:istore          7
		}
		f = distance(l, i1, k, j) / distance(0.0F, 0.0F, viewgroup.getWidth(), viewgroup.getHeight());
		l2 = transition.getDuration();
		l1 = l2;
		if(l2 < 0L)
			l1 = 300L;
		return (long)Math.round(((float)(l1 * (long)i) / mPropagationSpeed) * f);
	//* 116  197:goto            62
	}

	public void setPropagationSpeed(float f)
	{
		if(f == 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifne            16
		{
			throw new IllegalArgumentException("propagationSpeed may not be 0");
	//    4    6:new             #84  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #86  <String "propagationSpeed may not be 0">
	//    7   12:invokespecial   #89  <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
		} else
		{
			mPropagationSpeed = f;
	//    9   16:aload_0         
	//   10   17:fload_1         
	//   11   18:putfield        #13  <Field float mPropagationSpeed>
			return;
	//   12   21:return          
		}
	}

	private float mPropagationSpeed;
}
