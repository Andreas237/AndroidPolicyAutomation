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
		int i = 1;
	//    6   11:iconst_1        
	//    7   12:istore          6
		float f;
		int j;
		int k;
		int l;
		int i1;
		long l1;
		long l2;
		if(transitionvalues1 == null || getViewVisibility(transitionvalues) == 0)
	//*   8   14:aload           4
	//*   9   16:ifnull          27
	//*  10   19:aload_0         
	//*  11   20:aload_3         
	//*  12   21:invokevirtual   #28  <Method int getViewVisibility(TransitionValues)>
	//*  13   24:ifne            140
			i = -1;
	//   14   27:iconst_m1       
	//   15   28:istore          6
		else
	//*  16   30:aload_0         
	//*  17   31:aload_3         
	//*  18   32:invokevirtual   #31  <Method int getViewX(TransitionValues)>
	//*  19   35:istore          9
	//*  20   37:aload_0         
	//*  21   38:aload_3         
	//*  22   39:invokevirtual   #34  <Method int getViewY(TransitionValues)>
	//*  23   42:istore          10
	//*  24   44:aload_2         
	//*  25   45:invokevirtual   #40  <Method Rect Transition.getEpicenter()>
	//*  26   48:astore_3        
	//*  27   49:aload_3         
	//*  28   50:ifnull          146
	//*  29   53:aload_3         
	//*  30   54:invokevirtual   #46  <Method int Rect.centerX()>
	//*  31   57:istore          7
	//*  32   59:aload_3         
	//*  33   60:invokevirtual   #49  <Method int Rect.centerY()>
	//*  34   63:istore          8
	//*  35   65:iload           9
	//*  36   67:i2f             
	//*  37   68:iload           10
	//*  38   70:i2f             
	//*  39   71:iload           7
	//*  40   73:i2f             
	//*  41   74:iload           8
	//*  42   76:i2f             
	//*  43   77:invokestatic    #51  <Method float distance(float, float, float, float)>
	//*  44   80:fconst_0        
	//*  45   81:fconst_0        
	//*  46   82:aload_1         
	//*  47   83:invokevirtual   #56  <Method int ViewGroup.getWidth()>
	//*  48   86:i2f             
	//*  49   87:aload_1         
	//*  50   88:invokevirtual   #59  <Method int ViewGroup.getHeight()>
	//*  51   91:i2f             
	//*  52   92:invokestatic    #51  <Method float distance(float, float, float, float)>
	//*  53   95:fdiv            
	//*  54   96:fstore          5
	//*  55   98:aload_2         
	//*  56   99:invokevirtual   #63  <Method long Transition.getDuration()>
	//*  57  102:lstore          13
	//*  58  104:lload           13
	//*  59  106:lstore          11
	//*  60  108:lload           13
	//*  61  110:lconst_0        
	//*  62  111:lcmp            
	//*  63  112:ifge            120
	//*  64  115:ldc2w           #64  <Long 300L>
	//*  65  118:lstore          11
	//*  66  120:iload           6
	//*  67  122:i2l             
	//*  68  123:lload           11
	//*  69  125:lmul            
	//*  70  126:l2f             
	//*  71  127:aload_0         
	//*  72  128:getfield        #13  <Field float mPropagationSpeed>
	//*  73  131:fdiv            
	//*  74  132:fload           5
	//*  75  134:fmul            
	//*  76  135:invokestatic    #69  <Method int Math.round(float)>
	//*  77  138:i2l             
	//*  78  139:lreturn         
			transitionvalues = transitionvalues1;
	//   79  140:aload           4
	//   80  142:astore_3        
		l = getViewX(transitionvalues);
		i1 = getViewY(transitionvalues);
		transitionvalues = ((TransitionValues) (transition.getEpicenter()));
		if(transitionvalues != null)
		{
			j = ((Rect) (transitionvalues)).centerX();
			k = ((Rect) (transitionvalues)).centerY();
		} else
	//*  81  143:goto            30
		{
			transitionvalues = ((TransitionValues) (new int[2]));
	//   82  146:iconst_2        
	//   83  147:newarray        int[]
	//   84  149:astore_3        
			viewgroup.getLocationOnScreen(((int []) (transitionvalues)));
	//   85  150:aload_1         
	//   86  151:aload_3         
	//   87  152:invokevirtual   #73  <Method void ViewGroup.getLocationOnScreen(int[])>
			j = Math.round((float)(transitionvalues[0] + viewgroup.getWidth() / 2) + viewgroup.getTranslationX());
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
	//  101  174:istore          7
			k = Math.round((float)(transitionvalues[1] + viewgroup.getHeight() / 2) + viewgroup.getTranslationY());
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
	//  115  195:istore          8
		}
		f = distance(l, i1, j, k) / distance(0.0F, 0.0F, viewgroup.getWidth(), viewgroup.getHeight());
		l2 = transition.getDuration();
		l1 = l2;
		if(l2 < 0L)
			l1 = 300L;
		return (long)Math.round(((float)((long)i * l1) / mPropagationSpeed) * f);
	//* 116  197:goto            65
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
