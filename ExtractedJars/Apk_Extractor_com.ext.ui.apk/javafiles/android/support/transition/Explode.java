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
		int k = mTempLoc[0];
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field int[] mTempLoc>
	//    6   12:iconst_0        
	//    7   13:iaload          
	//    8   14:istore          10
		int l = mTempLoc[1];
	//    9   16:aload_0         
	//   10   17:getfield        #31  <Field int[] mTempLoc>
	//   11   20:iconst_1        
	//   12   21:iaload          
	//   13   22:istore          11
		Rect rect1 = getEpicenter();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #76  <Method Rect getEpicenter()>
	//   16   28:astore          14
		float f;
		float f1;
		float f2;
		float f3;
		int i;
		int j;
		int i1;
		int j1;
		if(rect1 == null)
	//*  17   30:aload           14
	//*  18   32:ifnonnull       221
		{
			i = view.getWidth() / 2;
	//   19   35:aload_1         
	//   20   36:invokevirtual   #57  <Method int View.getWidth()>
	//   21   39:iconst_2        
	//   22   40:idiv            
	//   23   41:istore          8
			j = Math.round(view.getTranslationX()) + (i + k);
	//   24   43:aload_1         
	//   25   44:invokevirtual   #80  <Method float View.getTranslationX()>
	//   26   47:invokestatic    #84  <Method int Math.round(float)>
	//   27   50:iload           8
	//   28   52:iload           10
	//   29   54:iadd            
	//   30   55:iadd            
	//   31   56:istore          9
			i = view.getHeight() / 2 + l + Math.round(view.getTranslationY());
	//   32   58:aload_1         
	//   33   59:invokevirtual   #64  <Method int View.getHeight()>
	//   34   62:iconst_2        
	//   35   63:idiv            
	//   36   64:iload           11
	//   37   66:iadd            
	//   38   67:aload_1         
	//   39   68:invokevirtual   #87  <Method float View.getTranslationY()>
	//   40   71:invokestatic    #84  <Method int Math.round(float)>
	//   41   74:iadd            
	//   42   75:istore          8
		} else
	//*  43   77:aload_2         
	//*  44   78:invokevirtual   #92  <Method int Rect.centerX()>
	//*  45   81:istore          12
	//*  46   83:aload_2         
	//*  47   84:invokevirtual   #95  <Method int Rect.centerY()>
	//*  48   87:istore          13
	//*  49   89:iload           12
	//*  50   91:iload           9
	//*  51   93:isub            
	//*  52   94:i2f             
	//*  53   95:fstore          6
	//*  54   97:iload           13
	//*  55   99:iload           8
	//*  56  101:isub            
	//*  57  102:i2f             
	//*  58  103:fstore          7
	//*  59  105:fload           7
	//*  60  107:fstore          4
	//*  61  109:fload           6
	//*  62  111:fstore          5
	//*  63  113:fload           6
	//*  64  115:fconst_0        
	//*  65  116:fcmpl           
	//*  66  117:ifne            159
	//*  67  120:fload           7
	//*  68  122:fstore          4
	//*  69  124:fload           6
	//*  70  126:fstore          5
	//*  71  128:fload           7
	//*  72  130:fconst_0        
	//*  73  131:fcmpl           
	//*  74  132:ifne            159
	//*  75  135:invokestatic    #99  <Method double Math.random()>
	//*  76  138:ldc2w           #100 <Double 2D>
	//*  77  141:dmul            
	//*  78  142:d2f             
	//*  79  143:fconst_1        
	//*  80  144:fsub            
	//*  81  145:fstore          5
	//*  82  147:invokestatic    #99  <Method double Math.random()>
	//*  83  150:ldc2w           #100 <Double 2D>
	//*  84  153:dmul            
	//*  85  154:d2f             
	//*  86  155:fconst_1        
	//*  87  156:fsub            
	//*  88  157:fstore          4
	//*  89  159:fload           5
	//*  90  161:fload           4
	//*  91  163:invokestatic    #66  <Method float calculateDistance(float, float)>
	//*  92  166:fstore          6
	//*  93  168:fload           5
	//*  94  170:fload           6
	//*  95  172:fdiv            
	//*  96  173:fstore          5
	//*  97  175:fload           4
	//*  98  177:fload           6
	//*  99  179:fdiv            
	//* 100  180:fstore          4
	//* 101  182:aload_1         
	//* 102  183:iload           9
	//* 103  185:iload           10
	//* 104  187:isub            
	//* 105  188:iload           8
	//* 106  190:iload           11
	//* 107  192:isub            
	//* 108  193:invokestatic    #103 <Method float calculateMaxDistance(View, int, int)>
	//* 109  196:fstore          6
	//* 110  198:aload_3         
	//* 111  199:iconst_0        
	//* 112  200:fload           5
	//* 113  202:fload           6
	//* 114  204:fmul            
	//* 115  205:invokestatic    #84  <Method int Math.round(float)>
	//* 116  208:iastore         
	//* 117  209:aload_3         
	//* 118  210:iconst_1        
	//* 119  211:fload           6
	//* 120  213:fload           4
	//* 121  215:fmul            
	//* 122  216:invokestatic    #84  <Method int Math.round(float)>
	//* 123  219:iastore         
	//* 124  220:return          
		{
			j = rect1.centerX();
	//  125  221:aload           14
	//  126  223:invokevirtual   #92  <Method int Rect.centerX()>
	//  127  226:istore          9
			i = rect1.centerY();
	//  128  228:aload           14
	//  129  230:invokevirtual   #95  <Method int Rect.centerY()>
	//  130  233:istore          8
		}
		i1 = rect.centerX();
		j1 = rect.centerY();
		f2 = i1 - j;
		f3 = j1 - i;
		f = f3;
		f1 = f2;
		if(f2 == 0.0F)
		{
			f = f3;
			f1 = f2;
			if(f3 == 0.0F)
			{
				f1 = (float)(Math.random() * 2D) - 1.0F;
				f = (float)(Math.random() * 2D) - 1.0F;
			}
		}
		f2 = calculateDistance(f1, f);
		f1 /= f2;
		f /= f2;
		f2 = calculateMaxDistance(view, j - k, i - l);
		ai[0] = Math.round(f1 * f2);
		ai[1] = Math.round(f2 * f);
	//* 131  235:goto            77
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
		int i = mTempLoc[0];
	//    7   15:aload_0         
	//    8   16:getfield        #31  <Field int[] mTempLoc>
	//    9   19:iconst_0        
	//   10   20:iaload          
	//   11   21:istore_2        
		int j = mTempLoc[1];
	//   12   22:aload_0         
	//   13   23:getfield        #31  <Field int[] mTempLoc>
	//   14   26:iconst_1        
	//   15   27:iaload          
	//   16   28:istore_3        
		int k = view.getWidth();
	//   17   29:aload           6
	//   18   31:invokevirtual   #57  <Method int View.getWidth()>
	//   19   34:istore          4
		int l = view.getHeight();
	//   20   36:aload           6
	//   21   38:invokevirtual   #64  <Method int View.getHeight()>
	//   22   41:istore          5
		transitionvalues.values.put("android:explode:screenBounds", ((Object) (new Rect(i, j, k + i, l + j))));
	//   23   43:aload_1         
	//   24   44:getfield        #115 <Field Map TransitionValues.values>
	//   25   47:ldc1            #8   <String "android:explode:screenBounds">
	//   26   49:new             #89  <Class Rect>
	//   27   52:dup             
	//   28   53:iload_2         
	//   29   54:iload_3         
	//   30   55:iload           4
	//   31   57:iload_2         
	//   32   58:iadd            
	//   33   59:iload           5
	//   34   61:iload_3         
	//   35   62:iadd            
	//   36   63:invokespecial   #118 <Method void Rect(int, int, int, int)>
	//   37   66:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//   38   71:pop             
	//   39   72:return          
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
			float f2 = mTempLoc[0];
	//   22   45:aload_0         
	//   23   46:getfield        #31  <Field int[] mTempLoc>
	//   24   49:iconst_0        
	//   25   50:iaload          
	//   26   51:i2f             
	//   27   52:fstore          7
			float f3 = mTempLoc[1];
	//   28   54:aload_0         
	//   29   55:getfield        #31  <Field int[] mTempLoc>
	//   30   58:iconst_1        
	//   31   59:iaload          
	//   32   60:i2f             
	//   33   61:fstore          8
			return TranslationAnimationCreator.createAnimation(view, transitionvalues1, ((Rect) (transitionvalues)).left, ((Rect) (transitionvalues)).top, f + f2, f1 + f3, f, f1, sDecelerate);
	//   34   63:aload_2         
	//   35   64:aload           4
	//   36   66:aload_3         
	//   37   67:getfield        #146 <Field int Rect.left>
	//   38   70:aload_3         
	//   39   71:getfield        #149 <Field int Rect.top>
	//   40   74:fload           5
	//   41   76:fload           7
	//   42   78:fadd            
	//   43   79:fload           6
	//   44   81:fload           8
	//   45   83:fadd            
	//   46   84:fload           5
	//   47   86:fload           6
	//   48   88:getstatic       #22  <Field TimeInterpolator sDecelerate>
	//   49   91:invokestatic    #155 <Method Animator TranslationAnimationCreator.createAnimation(View, TransitionValues, int, int, float, float, float, float, TimeInterpolator)>
	//   50   94:areturn         
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
		int ai[] = (int[])(int[])transitionvalues.view.getTag(R.id.transition_position);
	//   22   48:aload_3         
	//   23   49:getfield        #111 <Field View TransitionValues.view>
	//   24   52:getstatic       #161 <Field int R$id.transition_position>
	//   25   55:invokevirtual   #165 <Method Object View.getTag(int)>
	//   26   58:checkcast       #166 <Class int[]>
	//   27   61:checkcast       #166 <Class int[]>
	//   28   64:astore          11
		float f;
		float f1;
		if(ai != null)
	//*  29   66:aload           11
	//*  30   68:ifnull          172
		{
			f1 = ai[0] - ((Rect) (transitionvalues1)).left;
	//   31   71:aload           11
	//   32   73:iconst_0        
	//   33   74:iaload          
	//   34   75:aload           4
	//   35   77:getfield        #146 <Field int Rect.left>
	//   36   80:isub            
	//   37   81:i2f             
	//   38   82:fstore          6
			f = ai[1] - ((Rect) (transitionvalues1)).top;
	//   39   84:aload           11
	//   40   86:iconst_1        
	//   41   87:iaload          
	//   42   88:aload           4
	//   43   90:getfield        #149 <Field int Rect.top>
	//   44   93:isub            
	//   45   94:i2f             
	//   46   95:fstore          5
			((Rect) (transitionvalues1)).offsetTo(ai[0], ai[1]);
	//   47   97:aload           4
	//   48   99:aload           11
	//   49  101:iconst_0        
	//   50  102:iaload          
	//   51  103:aload           11
	//   52  105:iconst_1        
	//   53  106:iaload          
	//   54  107:invokevirtual   #170 <Method void Rect.offsetTo(int, int)>
			f += f3;
	//   55  110:fload           5
	//   56  112:fload           8
	//   57  114:fadd            
	//   58  115:fstore          5
			f1 = f2 + f1;
	//   59  117:fload           7
	//   60  119:fload           6
	//   61  121:fadd            
	//   62  122:fstore          6
		} else
	//*  63  124:aload_0         
	//*  64  125:aload_1         
	//*  65  126:aload           4
	//*  66  128:aload_0         
	//*  67  129:getfield        #31  <Field int[] mTempLoc>
	//*  68  132:invokespecial   #142 <Method void calculateOut(View, Rect, int[])>
	//*  69  135:aload_2         
	//*  70  136:aload_3         
	//*  71  137:iload           9
	//*  72  139:iload           10
	//*  73  141:fload           7
	//*  74  143:fload           8
	//*  75  145:fload           6
	//*  76  147:aload_0         
	//*  77  148:getfield        #31  <Field int[] mTempLoc>
	//*  78  151:iconst_0        
	//*  79  152:iaload          
	//*  80  153:i2f             
	//*  81  154:fadd            
	//*  82  155:fload           5
	//*  83  157:aload_0         
	//*  84  158:getfield        #31  <Field int[] mTempLoc>
	//*  85  161:iconst_1        
	//*  86  162:iaload          
	//*  87  163:i2f             
	//*  88  164:fadd            
	//*  89  165:getstatic       #27  <Field TimeInterpolator sAccelerate>
	//*  90  168:invokestatic    #155 <Method Animator TranslationAnimationCreator.createAnimation(View, TransitionValues, int, int, float, float, float, float, TimeInterpolator)>
	//*  91  171:areturn         
		{
			f = f3;
	//   92  172:fload           8
	//   93  174:fstore          5
			f1 = f2;
	//   94  176:fload           7
	//   95  178:fstore          6
		}
		calculateOut(((View) (viewgroup)), ((Rect) (transitionvalues1)), mTempLoc);
		return TranslationAnimationCreator.createAnimation(view, transitionvalues, i, j, f2, f3, f1 + (float)mTempLoc[0], f + (float)mTempLoc[1], sAccelerate);
	//*  96  180:goto            124
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
