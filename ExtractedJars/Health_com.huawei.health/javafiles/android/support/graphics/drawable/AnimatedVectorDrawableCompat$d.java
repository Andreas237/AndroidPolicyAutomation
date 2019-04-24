// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.util.ArrayMap;
import java.util.ArrayList;

// Referenced classes of package android.support.graphics.drawable:
//			AnimatedVectorDrawableCompat, VectorDrawableCompat

static class AnimatedVectorDrawableCompat$d extends android.graphics.drawable.Drawable.ConstantState
{

	public int getChangingConfigurations()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int d>
	//    2    4:ireturn         
	}

	public Drawable newDrawable()
	{
		throw new IllegalStateException("No constant state support for SDK < 24.");
	//    0    0:new             #108 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #110 <String "No constant state support for SDK < 24.">
	//    3    6:invokespecial   #113 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public Drawable newDrawable(Resources resources)
	{
		throw new IllegalStateException("No constant state support for SDK < 24.");
	//    0    0:new             #108 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #110 <String "No constant state support for SDK < 24.">
	//    3    6:invokespecial   #113 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	ArrayMap a;
	VectorDrawableCompat c;
	int d;
	ArrayList e;

	public AnimatedVectorDrawableCompat$d(Context context, AnimatedVectorDrawableCompat$d animatedvectordrawablecompat$d, android.graphics.drawable.Drawable.Callback callback, Resources resources)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void android.graphics.drawable.Drawable$ConstantState()>
		if(animatedvectordrawablecompat$d != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          229
		{
			d = animatedvectordrawablecompat$d.d;
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:getfield        #23  <Field int d>
	//    7   13:putfield        #23  <Field int d>
			if(animatedvectordrawablecompat$d.c != null)
	//*   8   16:aload_2         
	//*   9   17:getfield        #25  <Field VectorDrawableCompat c>
	//*  10   20:ifnull          107
			{
				context = ((Context) (animatedvectordrawablecompat$d.c.getConstantState()));
	//   11   23:aload_2         
	//   12   24:getfield        #25  <Field VectorDrawableCompat c>
	//   13   27:invokevirtual   #31  <Method android.graphics.drawable.Drawable$ConstantState VectorDrawableCompat.getConstantState()>
	//   14   30:astore_1        
				if(resources != null)
	//*  15   31:aload           4
	//*  16   33:ifnull          52
					c = (VectorDrawableCompat)((android.graphics.drawable.Drawable.ConstantState) (context)).newDrawable(resources);
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:aload           4
	//   20   40:invokevirtual   #35  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//   21   43:checkcast       #27  <Class VectorDrawableCompat>
	//   22   46:putfield        #25  <Field VectorDrawableCompat c>
				else
	//*  23   49:goto            63
					c = (VectorDrawableCompat)((android.graphics.drawable.Drawable.ConstantState) (context)).newDrawable();
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:invokevirtual   #38  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   27   57:checkcast       #27  <Class VectorDrawableCompat>
	//   28   60:putfield        #25  <Field VectorDrawableCompat c>
				c = (VectorDrawableCompat)c.mutate();
	//   29   63:aload_0         
	//   30   64:aload_0         
	//   31   65:getfield        #25  <Field VectorDrawableCompat c>
	//   32   68:invokevirtual   #41  <Method Drawable VectorDrawableCompat.mutate()>
	//   33   71:checkcast       #27  <Class VectorDrawableCompat>
	//   34   74:putfield        #25  <Field VectorDrawableCompat c>
				c.setCallback(callback);
	//   35   77:aload_0         
	//   36   78:getfield        #25  <Field VectorDrawableCompat c>
	//   37   81:aload_3         
	//   38   82:invokevirtual   #45  <Method void VectorDrawableCompat.setCallback(android.graphics.drawable.Drawable$Callback)>
				c.setBounds(animatedvectordrawablecompat$d.c.getBounds());
	//   39   85:aload_0         
	//   40   86:getfield        #25  <Field VectorDrawableCompat c>
	//   41   89:aload_2         
	//   42   90:getfield        #25  <Field VectorDrawableCompat c>
	//   43   93:invokevirtual   #49  <Method android.graphics.Rect VectorDrawableCompat.getBounds()>
	//   44   96:invokevirtual   #53  <Method void VectorDrawableCompat.setBounds(android.graphics.Rect)>
				c.setAllowCaching(false);
	//   45   99:aload_0         
	//   46  100:getfield        #25  <Field VectorDrawableCompat c>
	//   47  103:iconst_0        
	//   48  104:invokevirtual   #57  <Method void VectorDrawableCompat.setAllowCaching(boolean)>
			}
			if(animatedvectordrawablecompat$d.e != null)
	//*  49  107:aload_2         
	//*  50  108:getfield        #59  <Field ArrayList e>
	//*  51  111:ifnull          229
			{
				int j = animatedvectordrawablecompat$d.e.size();
	//   52  114:aload_2         
	//   53  115:getfield        #59  <Field ArrayList e>
	//   54  118:invokevirtual   #65  <Method int ArrayList.size()>
	//   55  121:istore          6
				e = new ArrayList(j);
	//   56  123:aload_0         
	//   57  124:new             #61  <Class ArrayList>
	//   58  127:dup             
	//   59  128:iload           6
	//   60  130:invokespecial   #68  <Method void ArrayList(int)>
	//   61  133:putfield        #59  <Field ArrayList e>
				a = new ArrayMap(j);
	//   62  136:aload_0         
	//   63  137:new             #70  <Class ArrayMap>
	//   64  140:dup             
	//   65  141:iload           6
	//   66  143:invokespecial   #71  <Method void ArrayMap(int)>
	//   67  146:putfield        #73  <Field ArrayMap a>
				for(int i = 0; i < j; i++)
	//*  68  149:iconst_0        
	//*  69  150:istore          5
	//*  70  152:iload           5
	//*  71  154:iload           6
	//*  72  156:icmpge          229
				{
					callback = ((android.graphics.drawable.Drawable.Callback) ((Animator)animatedvectordrawablecompat$d.e.get(i)));
	//   73  159:aload_2         
	//   74  160:getfield        #59  <Field ArrayList e>
	//   75  163:iload           5
	//   76  165:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   77  168:checkcast       #79  <Class Animator>
	//   78  171:astore_3        
					context = ((Context) (((Animator) (callback)).clone()));
	//   79  172:aload_3         
	//   80  173:invokevirtual   #83  <Method Animator Animator.clone()>
	//   81  176:astore_1        
					callback = ((android.graphics.drawable.Drawable.Callback) ((String)animatedvectordrawablecompat$d.a.get(((Object) (callback)))));
	//   82  177:aload_2         
	//   83  178:getfield        #73  <Field ArrayMap a>
	//   84  181:aload_3         
	//   85  182:invokevirtual   #86  <Method Object ArrayMap.get(Object)>
	//   86  185:checkcast       #88  <Class String>
	//   87  188:astore_3        
					((Animator) (context)).setTarget(c.getTargetByName(((String) (callback))));
	//   88  189:aload_1         
	//   89  190:aload_0         
	//   90  191:getfield        #25  <Field VectorDrawableCompat c>
	//   91  194:aload_3         
	//   92  195:invokevirtual   #92  <Method Object VectorDrawableCompat.getTargetByName(String)>
	//   93  198:invokevirtual   #96  <Method void Animator.setTarget(Object)>
					e.add(((Object) (context)));
	//   94  201:aload_0         
	//   95  202:getfield        #59  <Field ArrayList e>
	//   96  205:aload_1         
	//   97  206:invokevirtual   #100 <Method boolean ArrayList.add(Object)>
	//   98  209:pop             
					a.put(((Object) (context)), ((Object) (callback)));
	//   99  210:aload_0         
	//  100  211:getfield        #73  <Field ArrayMap a>
	//  101  214:aload_1         
	//  102  215:aload_3         
	//  103  216:invokevirtual   #104 <Method Object ArrayMap.put(Object, Object)>
	//  104  219:pop             
				}

	//  105  220:iload           5
	//  106  222:iconst_1        
	//  107  223:iadd            
	//  108  224:istore          5
			}
		}
	//* 109  226:goto            152
	//  110  229:return          
	}
}
