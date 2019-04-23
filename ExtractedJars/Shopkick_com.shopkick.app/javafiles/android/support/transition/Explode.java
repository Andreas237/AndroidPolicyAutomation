// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Visibility, CircularPropagation, TransitionValues, TranslationAnimationCreator

public class Explode extends Visibility
{

	public Explode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Visibility()>
		mTempLoc = new int[2];
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:putfield        #31  <Field int[] mTempLoc>
		setPropagation(((TransitionPropagation) (new CircularPropagation())));
	//    6   11:aload_0         
	//    7   12:new             #33  <Class CircularPropagation>
	//    8   15:dup             
	//    9   16:invokespecial   #34  <Method void CircularPropagation()>
	//   10   19:invokevirtual   #38  <Method void setPropagation(TransitionPropagation)>
	//   11   22:return          
	}

	public Explode(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #41  <Method void Visibility(Context, AttributeSet)>
		mTempLoc = new int[2];
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:newarray        int[]
	//    7   10:putfield        #31  <Field int[] mTempLoc>
		setPropagation(((TransitionPropagation) (new CircularPropagation())));
	//    8   13:aload_0         
	//    9   14:new             #33  <Class CircularPropagation>
	//   10   17:dup             
	//   11   18:invokespecial   #34  <Method void CircularPropagation()>
	//   12   21:invokevirtual   #38  <Method void setPropagation(TransitionPropagation)>
	//   13   24:return          
	}

	private static float calculateDistance(float f, float f1)
	{
		return (float)Math.sqrt(f * f + f1 * f1);
	//    0    0:fload_0         
	//    1    1:fload_0         
	//    2    2:fmul            
	//    3    3:fload_1         
	//    4    4:fload_1         
	//    5    5:fmul            
	//    6    6:fadd            
	//    7    7:f2d             
	//    8    8:invokestatic    #49  <Method double Math.sqrt(double)>
	//    9   11:d2f             
	//   10   12:freturn         
	}

	private static float calculateMaxDistance(View view, int i, int j)
	{
		i = Math.max(i, view.getWidth() - i);
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #57  <Method int View.getWidth()>
	//    3    5:iload_1         
	//    4    6:isub            
	//    5    7:invokestatic    #61  <Method int Math.max(int, int)>
	//    6   10:istore_1        
		j = Math.max(j, view.getHeight() - j);
	//    7   11:iload_2         
	//    8   12:aload_0         
	//    9   13:invokevirtual   #64  <Method int View.getHeight()>
	//   10   16:iload_2         
	//   11   17:isub            
	//   12   18:invokestatic    #61  <Method int Math.max(int, int)>
	//   13   21:istore_2        
		return calculateDistance(i, j);
	//   14   22:iload_1         
	//   15   23:i2f             
	//   16   24:iload_2         
	//   17   25:i2f             
	//   18   26:invokestatic    #66  <Method float calculateDistance(float, float)>
	//   19   29:freturn         
	}

	private void calculateOut(View view, Rect rect, int ai[])
	{
		view.getLocationOnScreen(mTempLoc);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field int[] mTempLoc>
	//    3    5:invokevirtual   #72  <Method void View.getLocationOnScreen(int[])>
		int ai1[] = mTempLoc;
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field int[] mTempLoc>
	//    6   12:astore          14
		int k = ai1[0];
	//    7   14:aload           14
	//    8   16:iconst_0        
	//    9   17:iaload          
	//   10   18:istore          10
		int l = ai1[1];
	//   11   20:aload           14
	//   12   22:iconst_1        
	//   13   23:iaload          
	//   14   24:istore          11
		Rect rect1 = getEpicenter();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #76  <Method Rect getEpicenter()>
	//   17   30:astore          14
		int i;
		int j;
		if(rect1 == null)
	//*  18   32:aload           14
	//*  19   34:ifnonnull       78
		{
			i = view.getWidth() / 2 + k + Math.round(view.getTranslationX());
	//   20   37:aload_1         
	//   21   38:invokevirtual   #57  <Method int View.getWidth()>
	//   22   41:iconst_2        
	//   23   42:idiv            
	//   24   43:iload           10
	//   25   45:iadd            
	//   26   46:aload_1         
	//   27   47:invokevirtual   #80  <Method float View.getTranslationX()>
	//   28   50:invokestatic    #84  <Method int Math.round(float)>
	//   29   53:iadd            
	//   30   54:istore          8
			j = view.getHeight() / 2 + l + Math.round(view.getTranslationY());
	//   31   56:aload_1         
	//   32   57:invokevirtual   #64  <Method int View.getHeight()>
	//   33   60:iconst_2        
	//   34   61:idiv            
	//   35   62:iload           11
	//   36   64:iadd            
	//   37   65:aload_1         
	//   38   66:invokevirtual   #87  <Method float View.getTranslationY()>
	//   39   69:invokestatic    #84  <Method int Math.round(float)>
	//   40   72:iadd            
	//   41   73:istore          9
		} else
	//*  42   75:goto            92
		{
			i = rect1.centerX();
	//   43   78:aload           14
	//   44   80:invokevirtual   #92  <Method int Rect.centerX()>
	//   45   83:istore          8
			j = rect1.centerY();
	//   46   85:aload           14
	//   47   87:invokevirtual   #95  <Method int Rect.centerY()>
	//   48   90:istore          9
		}
		int i1 = rect.centerX();
	//   49   92:aload_2         
	//   50   93:invokevirtual   #92  <Method int Rect.centerX()>
	//   51   96:istore          12
		int j1 = rect.centerY();
	//   52   98:aload_2         
	//   53   99:invokevirtual   #95  <Method int Rect.centerY()>
	//   54  102:istore          13
		float f2 = i1 - i;
	//   55  104:iload           12
	//   56  106:iload           8
	//   57  108:isub            
	//   58  109:i2f             
	//   59  110:fstore          6
		float f3 = j1 - j;
	//   60  112:iload           13
	//   61  114:iload           9
	//   62  116:isub            
	//   63  117:i2f             
	//   64  118:fstore          7
		float f1 = f2;
	//   65  120:fload           6
	//   66  122:fstore          5
		float f = f3;
	//   67  124:fload           7
	//   68  126:fstore          4
		if(f2 == 0.0F)
	//*  69  128:fload           6
	//*  70  130:fconst_0        
	//*  71  131:fcmpl           
	//*  72  132:ifne            174
		{
			f1 = f2;
	//   73  135:fload           6
	//   74  137:fstore          5
			f = f3;
	//   75  139:fload           7
	//   76  141:fstore          4
			if(f3 == 0.0F)
	//*  77  143:fload           7
	//*  78  145:fconst_0        
	//*  79  146:fcmpl           
	//*  80  147:ifne            174
			{
				f1 = (float)(Math.random() * 2D) - 1.0F;
	//   81  150:invokestatic    #99  <Method double Math.random()>
	//   82  153:ldc2w           #100 <Double 2D>
	//   83  156:dmul            
	//   84  157:d2f             
	//   85  158:fconst_1        
	//   86  159:fsub            
	//   87  160:fstore          5
				f = (float)(Math.random() * 2D) - 1.0F;
	//   88  162:invokestatic    #99  <Method double Math.random()>
	//   89  165:ldc2w           #100 <Double 2D>
	//   90  168:dmul            
	//   91  169:d2f             
	//   92  170:fconst_1        
	//   93  171:fsub            
	//   94  172:fstore          4
			}
		}
		f2 = calculateDistance(f1, f);
	//   95  174:fload           5
	//   96  176:fload           4
	//   97  178:invokestatic    #66  <Method float calculateDistance(float, float)>
	//   98  181:fstore          6
		f1 /= f2;
	//   99  183:fload           5
	//  100  185:fload           6
	//  101  187:fdiv            
	//  102  188:fstore          5
		f /= f2;
	//  103  190:fload           4
	//  104  192:fload           6
	//  105  194:fdiv            
	//  106  195:fstore          4
		f2 = calculateMaxDistance(view, i - k, j - l);
	//  107  197:aload_1         
	//  108  198:iload           8
	//  109  200:iload           10
	//  110  202:isub            
	//  111  203:iload           9
	//  112  205:iload           11
	//  113  207:isub            
	//  114  208:invokestatic    #103 <Method float calculateMaxDistance(View, int, int)>
	//  115  211:fstore          6
		ai[0] = Math.round(f1 * f2);
	//  116  213:aload_3         
	//  117  214:iconst_0        
	//  118  215:fload           5
	//  119  217:fload           6
	//  120  219:fmul            
	//  121  220:invokestatic    #84  <Method int Math.round(float)>
	//  122  223:iastore         
		ai[1] = Math.round(f2 * f);
	//  123  224:aload_3         
	//  124  225:iconst_1        
	//  125  226:fload           6
	//  126  228:fload           4
	//  127  230:fmul            
	//  128  231:invokestatic    #84  <Method int Math.round(float)>
	//  129  234:iastore         
	//  130  235:return          
	}

	private void captureValues(TransitionValues transitionvalues)
	{
		View view = transitionvalues.view;
	//    0    0:aload_1         
	//    1    1:getfield        #111 <Field View TransitionValues.view>
	//    2    4:astore          6
		view.getLocationOnScreen(mTempLoc);
	//    3    6:aload           6
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field int[] mTempLoc>
	//    6   12:invokevirtual   #72  <Method void View.getLocationOnScreen(int[])>
		int ai[] = mTempLoc;
	//    7   15:aload_0         
	//    8   16:getfield        #31  <Field int[] mTempLoc>
	//    9   19:astore          7
		int i = ai[0];
	//   10   21:aload           7
	//   11   23:iconst_0        
	//   12   24:iaload          
	//   13   25:istore_2        
		int j = ai[1];
	//   14   26:aload           7
	//   15   28:iconst_1        
	//   16   29:iaload          
	//   17   30:istore_3        
		int k = view.getWidth();
	//   18   31:aload           6
	//   19   33:invokevirtual   #57  <Method int View.getWidth()>
	//   20   36:istore          4
		int l = view.getHeight();
	//   21   38:aload           6
	//   22   40:invokevirtual   #64  <Method int View.getHeight()>
	//   23   43:istore          5
		transitionvalues.values.put("android:explode:screenBounds", ((Object) (new Rect(i, j, k + i, l + j))));
	//   24   45:aload_1         
	//   25   46:getfield        #115 <Field Map TransitionValues.values>
	//   26   49:ldc1            #8   <String "android:explode:screenBounds">
	//   27   51:new             #89  <Class Rect>
	//   28   54:dup             
	//   29   55:iload_2         
	//   30   56:iload_3         
	//   31   57:iload           4
	//   32   59:iload_2         
	//   33   60:iadd            
	//   34   61:iload           5
	//   35   63:iload_3         
	//   36   64:iadd            
	//   37   65:invokespecial   #118 <Method void Rect(int, int, int, int)>
	//   38   68:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//   39   73:pop             
	//   40   74:return          
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		super.captureEndValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #128 <Method void Visibility.captureEndValues(TransitionValues)>
		captureValues(transitionvalues);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #130 <Method void captureValues(TransitionValues)>
	//    6   10:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		super.captureStartValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #134 <Method void Visibility.captureStartValues(TransitionValues)>
		captureValues(transitionvalues);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #130 <Method void captureValues(TransitionValues)>
	//    6   10:return          
	}

	public Animator onAppear(ViewGroup viewgroup, View view, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		if(transitionvalues1 == null)
	//*   0    0:aload           4
	//*   1    2:ifnonnull       7
		{
			return null;
	//    2    5:aconst_null     
	//    3    6:areturn         
		} else
		{
			transitionvalues = ((TransitionValues) ((Rect)transitionvalues1.values.get("android:explode:screenBounds")));
	//    4    7:aload           4
	//    5    9:getfield        #115 <Field Map TransitionValues.values>
	//    6   12:ldc1            #8   <String "android:explode:screenBounds">
	//    7   14:invokeinterface #140 <Method Object Map.get(Object)>
	//    8   19:checkcast       #89  <Class Rect>
	//    9   22:astore_3        
			float f = view.getTranslationX();
	//   10   23:aload_2         
	//   11   24:invokevirtual   #80  <Method float View.getTranslationX()>
	//   12   27:fstore          5
			float f1 = view.getTranslationY();
	//   13   29:aload_2         
	//   14   30:invokevirtual   #87  <Method float View.getTranslationY()>
	//   15   33:fstore          6
			calculateOut(((View) (viewgroup)), ((Rect) (transitionvalues)), mTempLoc);
	//   16   35:aload_0         
	//   17   36:aload_1         
	//   18   37:aload_3         
	//   19   38:aload_0         
	//   20   39:getfield        #31  <Field int[] mTempLoc>
	//   21   42:invokespecial   #142 <Method void calculateOut(View, Rect, int[])>
			viewgroup = ((ViewGroup) (mTempLoc));
	//   22   45:aload_0         
	//   23   46:getfield        #31  <Field int[] mTempLoc>
	//   24   49:astore_1        
			float f2 = viewgroup[0];
	//   25   50:aload_1         
	//   26   51:iconst_0        
	//   27   52:iaload          
	//   28   53:i2f             
	//   29   54:fstore          7
			float f3 = viewgroup[1];
	//   30   56:aload_1         
	//   31   57:iconst_1        
	//   32   58:iaload          
	//   33   59:i2f             
	//   34   60:fstore          8
			return TranslationAnimationCreator.createAnimation(view, transitionvalues1, ((Rect) (transitionvalues)).left, ((Rect) (transitionvalues)).top, f + f2, f1 + f3, f, f1, sDecelerate);
	//   35   62:aload_2         
	//   36   63:aload           4
	//   37   65:aload_3         
	//   38   66:getfield        #146 <Field int Rect.left>
	//   39   69:aload_3         
	//   40   70:getfield        #149 <Field int Rect.top>
	//   41   73:fload           5
	//   42   75:fload           7
	//   43   77:fadd            
	//   44   78:fload           6
	//   45   80:fload           8
	//   46   82:fadd            
	//   47   83:fload           5
	//   48   85:fload           6
	//   49   87:getstatic       #22  <Field TimeInterpolator sDecelerate>
	//   50   90:invokestatic    #155 <Method Animator TranslationAnimationCreator.createAnimation(View, TransitionValues, int, int, float, float, float, float, TimeInterpolator)>
	//   51   93:areturn         
		}
	}

	public Animator onDisappear(ViewGroup viewgroup, View view, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		if(transitionvalues == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		transitionvalues1 = ((TransitionValues) ((Rect)transitionvalues.values.get("android:explode:screenBounds")));
	//    4    6:aload_3         
	//    5    7:getfield        #115 <Field Map TransitionValues.values>
	//    6   10:ldc1            #8   <String "android:explode:screenBounds">
	//    7   12:invokeinterface #140 <Method Object Map.get(Object)>
	//    8   17:checkcast       #89  <Class Rect>
	//    9   20:astore          4
		int i = ((Rect) (transitionvalues1)).left;
	//   10   22:aload           4
	//   11   24:getfield        #146 <Field int Rect.left>
	//   12   27:istore          9
		int j = ((Rect) (transitionvalues1)).top;
	//   13   29:aload           4
	//   14   31:getfield        #149 <Field int Rect.top>
	//   15   34:istore          10
		float f2 = view.getTranslationX();
	//   16   36:aload_2         
	//   17   37:invokevirtual   #80  <Method float View.getTranslationX()>
	//   18   40:fstore          7
		float f3 = view.getTranslationY();
	//   19   42:aload_2         
	//   20   43:invokevirtual   #87  <Method float View.getTranslationY()>
	//   21   46:fstore          8
		int ai[] = (int[])transitionvalues.view.getTag(R.id.transition_position);
	//   22   48:aload_3         
	//   23   49:getfield        #111 <Field View TransitionValues.view>
	//   24   52:getstatic       #161 <Field int R$id.transition_position>
	//   25   55:invokevirtual   #165 <Method Object View.getTag(int)>
	//   26   58:checkcast       #166 <Class int[]>
	//   27   61:astore          11
		float f;
		float f1;
		if(ai != null)
	//*  28   63:aload           11
	//*  29   65:ifnull          116
		{
			f = (float)(ai[0] - ((Rect) (transitionvalues1)).left) + f2;
	//   30   68:aload           11
	//   31   70:iconst_0        
	//   32   71:iaload          
	//   33   72:aload           4
	//   34   74:getfield        #146 <Field int Rect.left>
	//   35   77:isub            
	//   36   78:i2f             
	//   37   79:fload           7
	//   38   81:fadd            
	//   39   82:fstore          5
			f1 = (float)(ai[1] - ((Rect) (transitionvalues1)).top) + f3;
	//   40   84:aload           11
	//   41   86:iconst_1        
	//   42   87:iaload          
	//   43   88:aload           4
	//   44   90:getfield        #149 <Field int Rect.top>
	//   45   93:isub            
	//   46   94:i2f             
	//   47   95:fload           8
	//   48   97:fadd            
	//   49   98:fstore          6
			((Rect) (transitionvalues1)).offsetTo(ai[0], ai[1]);
	//   50  100:aload           4
	//   51  102:aload           11
	//   52  104:iconst_0        
	//   53  105:iaload          
	//   54  106:aload           11
	//   55  108:iconst_1        
	//   56  109:iaload          
	//   57  110:invokevirtual   #170 <Method void Rect.offsetTo(int, int)>
		} else
	//*  58  113:goto            124
		{
			f = f2;
	//   59  116:fload           7
	//   60  118:fstore          5
			f1 = f3;
	//   61  120:fload           8
	//   62  122:fstore          6
		}
		calculateOut(((View) (viewgroup)), ((Rect) (transitionvalues1)), mTempLoc);
	//   63  124:aload_0         
	//   64  125:aload_1         
	//   65  126:aload           4
	//   66  128:aload_0         
	//   67  129:getfield        #31  <Field int[] mTempLoc>
	//   68  132:invokespecial   #142 <Method void calculateOut(View, Rect, int[])>
		viewgroup = ((ViewGroup) (mTempLoc));
	//   69  135:aload_0         
	//   70  136:getfield        #31  <Field int[] mTempLoc>
	//   71  139:astore_1        
		return TranslationAnimationCreator.createAnimation(view, transitionvalues, i, j, f2, f3, f + (float)viewgroup[0], f1 + (float)viewgroup[1], sAccelerate);
	//   72  140:aload_2         
	//   73  141:aload_3         
	//   74  142:iload           9
	//   75  144:iload           10
	//   76  146:fload           7
	//   77  148:fload           8
	//   78  150:fload           5
	//   79  152:aload_1         
	//   80  153:iconst_0        
	//   81  154:iaload          
	//   82  155:i2f             
	//   83  156:fadd            
	//   84  157:fload           6
	//   85  159:aload_1         
	//   86  160:iconst_1        
	//   87  161:iaload          
	//   88  162:i2f             
	//   89  163:fadd            
	//   90  164:getstatic       #27  <Field TimeInterpolator sAccelerate>
	//   91  167:invokestatic    #155 <Method Animator TranslationAnimationCreator.createAnimation(View, TransitionValues, int, int, float, float, float, float, TimeInterpolator)>
	//   92  170:areturn         
	}

	private static final String PROPNAME_SCREEN_BOUNDS = "android:explode:screenBounds";
	private static final TimeInterpolator sAccelerate = new AccelerateInterpolator();
	private static final TimeInterpolator sDecelerate = new DecelerateInterpolator();
	private int mTempLoc[];

	static 
	{
	//    0    0:new             #17  <Class DecelerateInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void DecelerateInterpolator()>
	//    3    7:putstatic       #22  <Field TimeInterpolator sDecelerate>
	//    4   10:new             #24  <Class AccelerateInterpolator>
	//    5   13:dup             
	//    6   14:invokespecial   #25  <Method void AccelerateInterpolator()>
	//    7   17:putstatic       #27  <Field TimeInterpolator sAccelerate>
	//*   8   20:return          
	}
}
