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
		int i;
		if(transitionvalues1 != null && getViewVisibility(transitionvalues) != 0)
	//*   6   11:aload           4
	//*   7   13:ifnull          36
	//*   8   16:aload_0         
	//*   9   17:aload_3         
	//*  10   18:invokevirtual   #28  <Method int getViewVisibility(TransitionValues)>
	//*  11   21:ifne            27
	//*  12   24:goto            36
		{
			i = 1;
	//   13   27:iconst_1        
	//   14   28:istore          6
			transitionvalues = transitionvalues1;
	//   15   30:aload           4
	//   16   32:astore_3        
		} else
	//*  17   33:goto            39
		{
			i = -1;
	//   18   36:iconst_m1       
	//   19   37:istore          6
		}
		int l = getViewX(transitionvalues);
	//   20   39:aload_0         
	//   21   40:aload_3         
	//   22   41:invokevirtual   #31  <Method int getViewX(TransitionValues)>
	//   23   44:istore          9
		int i1 = getViewY(transitionvalues);
	//   24   46:aload_0         
	//   25   47:aload_3         
	//   26   48:invokevirtual   #34  <Method int getViewY(TransitionValues)>
	//   27   51:istore          10
		transitionvalues = ((TransitionValues) (transition.getEpicenter()));
	//   28   53:aload_2         
	//   29   54:invokevirtual   #40  <Method Rect Transition.getEpicenter()>
	//   30   57:astore_3        
		int j;
		int k;
		if(transitionvalues != null)
	//*  31   58:aload_3         
	//*  32   59:ifnull          77
		{
			j = ((Rect) (transitionvalues)).centerX();
	//   33   62:aload_3         
	//   34   63:invokevirtual   #46  <Method int Rect.centerX()>
	//   35   66:istore          7
			k = ((Rect) (transitionvalues)).centerY();
	//   36   68:aload_3         
	//   37   69:invokevirtual   #49  <Method int Rect.centerY()>
	//   38   72:istore          8
		} else
	//*  39   74:goto            128
		{
			transitionvalues = ((TransitionValues) (new int[2]));
	//   40   77:iconst_2        
	//   41   78:newarray        int[]
	//   42   80:astore_3        
			viewgroup.getLocationOnScreen(((int []) (transitionvalues)));
	//   43   81:aload_1         
	//   44   82:aload_3         
	//   45   83:invokevirtual   #55  <Method void ViewGroup.getLocationOnScreen(int[])>
			j = Math.round((float)(transitionvalues[0] + viewgroup.getWidth() / 2) + viewgroup.getTranslationX());
	//   46   86:aload_3         
	//   47   87:iconst_0        
	//   48   88:iaload          
	//   49   89:aload_1         
	//   50   90:invokevirtual   #58  <Method int ViewGroup.getWidth()>
	//   51   93:iconst_2        
	//   52   94:idiv            
	//   53   95:iadd            
	//   54   96:i2f             
	//   55   97:aload_1         
	//   56   98:invokevirtual   #62  <Method float ViewGroup.getTranslationX()>
	//   57  101:fadd            
	//   58  102:invokestatic    #66  <Method int Math.round(float)>
	//   59  105:istore          7
			k = Math.round((float)(transitionvalues[1] + viewgroup.getHeight() / 2) + viewgroup.getTranslationY());
	//   60  107:aload_3         
	//   61  108:iconst_1        
	//   62  109:iaload          
	//   63  110:aload_1         
	//   64  111:invokevirtual   #69  <Method int ViewGroup.getHeight()>
	//   65  114:iconst_2        
	//   66  115:idiv            
	//   67  116:iadd            
	//   68  117:i2f             
	//   69  118:aload_1         
	//   70  119:invokevirtual   #72  <Method float ViewGroup.getTranslationY()>
	//   71  122:fadd            
	//   72  123:invokestatic    #66  <Method int Math.round(float)>
	//   73  126:istore          8
		}
		float f = distance(l, i1, j, k) / distance(0.0F, 0.0F, viewgroup.getWidth(), viewgroup.getHeight());
	//   74  128:iload           9
	//   75  130:i2f             
	//   76  131:iload           10
	//   77  133:i2f             
	//   78  134:iload           7
	//   79  136:i2f             
	//   80  137:iload           8
	//   81  139:i2f             
	//   82  140:invokestatic    #74  <Method float distance(float, float, float, float)>
	//   83  143:fconst_0        
	//   84  144:fconst_0        
	//   85  145:aload_1         
	//   86  146:invokevirtual   #58  <Method int ViewGroup.getWidth()>
	//   87  149:i2f             
	//   88  150:aload_1         
	//   89  151:invokevirtual   #69  <Method int ViewGroup.getHeight()>
	//   90  154:i2f             
	//   91  155:invokestatic    #74  <Method float distance(float, float, float, float)>
	//   92  158:fdiv            
	//   93  159:fstore          5
		long l2 = transition.getDuration();
	//   94  161:aload_2         
	//   95  162:invokevirtual   #78  <Method long Transition.getDuration()>
	//   96  165:lstore          13
		long l1 = l2;
	//   97  167:lload           13
	//   98  169:lstore          11
		if(l2 < 0L)
	//*  99  171:lload           13
	//* 100  173:lconst_0        
	//* 101  174:lcmp            
	//* 102  175:ifge            183
			l1 = 300L;
	//  103  178:ldc2w           #79  <Long 300L>
	//  104  181:lstore          11
		return (long)Math.round(((float)(l1 * (long)i) / mPropagationSpeed) * f);
	//  105  183:lload           11
	//  106  185:iload           6
	//  107  187:i2l             
	//  108  188:lmul            
	//  109  189:l2f             
	//  110  190:aload_0         
	//  111  191:getfield        #13  <Field float mPropagationSpeed>
	//  112  194:fdiv            
	//  113  195:fload           5
	//  114  197:fmul            
	//  115  198:invokestatic    #66  <Method int Math.round(float)>
	//  116  201:i2l             
	//  117  202:lreturn         
	}

	public void setPropagationSpeed(float f)
	{
		if(f != 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifeq            12
		{
			mPropagationSpeed = f;
	//    4    6:aload_0         
	//    5    7:fload_1         
	//    6    8:putfield        #13  <Field float mPropagationSpeed>
			return;
	//    7   11:return          
		} else
		{
			throw new IllegalArgumentException("propagationSpeed may not be 0");
	//    8   12:new             #84  <Class IllegalArgumentException>
	//    9   15:dup             
	//   10   16:ldc1            #86  <String "propagationSpeed may not be 0">
	//   11   18:invokespecial   #89  <Method void IllegalArgumentException(String)>
	//   12   21:athrow          
		}
	}

	private float mPropagationSpeed;
}
