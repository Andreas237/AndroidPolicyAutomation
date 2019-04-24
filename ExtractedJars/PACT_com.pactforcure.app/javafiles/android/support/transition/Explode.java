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
	//*  18   32:ifnonnull       217
		{
			i = view.getWidth() / 2 + k + Math.round(view.getTranslationX());
	//   19   35:aload_1         
	//   20   36:invokevirtual   #57  <Method int View.getWidth()>
	//   21   39:iconst_2        
	//   22   40:idiv            
	//   23   41:iload           10
	//   24   43:iadd            
	//   25   44:aload_1         
	//   26   45:invokevirtual   #80  <Method float View.getTranslationX()>
	//   27   48:invokestatic    #84  <Method int Math.round(float)>
	//   28   51:iadd            
	//   29   52:istore          8
			j = view.getHeight() / 2 + l + Math.round(view.getTranslationY());
	//   30   54:aload_1         
	//   31   55:invokevirtual   #64  <Method int View.getHeight()>
	//   32   58:iconst_2        
	//   33   59:idiv            
	//   34   60:iload           11
	//   35   62:iadd            
	//   36   63:aload_1         
	//   37   64:invokevirtual   #87  <Method float View.getTranslationY()>
	//   38   67:invokestatic    #84  <Method int Math.round(float)>
	//   39   70:iadd            
	//   40   71:istore          9
		} else
	//*  41   73:aload_2         
	//*  42   74:invokevirtual   #92  <Method int Rect.centerX()>
	//*  43   77:istore          12
	//*  44   79:aload_2         
	//*  45   80:invokevirtual   #95  <Method int Rect.centerY()>
	//*  46   83:istore          13
	//*  47   85:iload           12
	//*  48   87:iload           8
	//*  49   89:isub            
	//*  50   90:i2f             
	//*  51   91:fstore          6
	//*  52   93:iload           13
	//*  53   95:iload           9
	//*  54   97:isub            
	//*  55   98:i2f             
	//*  56   99:fstore          7
	//*  57  101:fload           6
	//*  58  103:fstore          5
	//*  59  105:fload           7
	//*  60  107:fstore          4
	//*  61  109:fload           6
	//*  62  111:fconst_0        
	//*  63  112:fcmpl           
	//*  64  113:ifne            155
	//*  65  116:fload           6
	//*  66  118:fstore          5
	//*  67  120:fload           7
	//*  68  122:fstore          4
	//*  69  124:fload           7
	//*  70  126:fconst_0        
	//*  71  127:fcmpl           
	//*  72  128:ifne            155
	//*  73  131:invokestatic    #99  <Method double Math.random()>
	//*  74  134:ldc2w           #100 <Double 2D>
	//*  75  137:dmul            
	//*  76  138:d2f             
	//*  77  139:fconst_1        
	//*  78  140:fsub            
	//*  79  141:fstore          5
	//*  80  143:invokestatic    #99  <Method double Math.random()>
	//*  81  146:ldc2w           #100 <Double 2D>
	//*  82  149:dmul            
	//*  83  150:d2f             
	//*  84  151:fconst_1        
	//*  85  152:fsub            
	//*  86  153:fstore          4
	//*  87  155:fload           5
	//*  88  157:fload           4
	//*  89  159:invokestatic    #66  <Method float calculateDistance(float, float)>
	//*  90  162:fstore          6
	//*  91  164:fload           5
	//*  92  166:fload           6
	//*  93  168:fdiv            
	//*  94  169:fstore          5
	//*  95  171:fload           4
	//*  96  173:fload           6
	//*  97  175:fdiv            
	//*  98  176:fstore          4
	//*  99  178:aload_1         
	//* 100  179:iload           8
	//* 101  181:iload           10
	//* 102  183:isub            
	//* 103  184:iload           9
	//* 104  186:iload           11
	//* 105  188:isub            
	//* 106  189:invokestatic    #103 <Method float calculateMaxDistance(View, int, int)>
	//* 107  192:fstore          6
	//* 108  194:aload_3         
	//* 109  195:iconst_0        
	//* 110  196:fload           6
	//* 111  198:fload           5
	//* 112  200:fmul            
	//* 113  201:invokestatic    #84  <Method int Math.round(float)>
	//* 114  204:iastore         
	//* 115  205:aload_3         
	//* 116  206:iconst_1        
	//* 117  207:fload           6
	//* 118  209:fload           4
	//* 119  211:fmul            
	//* 120  212:invokestatic    #84  <Method int Math.round(float)>
	//* 121  215:iastore         
	//* 122  216:return          
		{
			i = rect1.centerX();
	//  123  217:aload           14
	//  124  219:invokevirtual   #92  <Method int Rect.centerX()>
	//  125  222:istore          8
			j = rect1.centerY();
	//  126  224:aload           14
	//  127  226:invokevirtual   #95  <Method int Rect.centerY()>
	//  128  229:istore          9
		}
		i1 = rect.centerX();
		j1 = rect.centerY();
		f2 = i1 - i;
		f3 = j1 - j;
		f1 = f2;
		f = f3;
		if(f2 == 0.0F)
		{
			f1 = f2;
			f = f3;
			if(f3 == 0.0F)
			{
				f1 = (float)(Math.random() * 2D) - 1.0F;
				f = (float)(Math.random() * 2D) - 1.0F;
			}
		}
		f2 = calculateDistance(f1, f);
		f1 /= f2;
		f /= f2;
		f2 = calculateMaxDistance(view, i - k, j - l);
		ai[0] = Math.round(f2 * f1);
		ai[1] = Math.round(f2 * f);
	//* 129  231:goto            73
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
		transitionvalues.values.put("android:explode:screenBounds", ((Object) (new Rect(i, j, i + k, j + l))));
	//   23   43:aload_1         
	//   24   44:getfield        #115 <Field Map TransitionValues.values>
	//   25   47:ldc1            #8   <String "android:explode:screenBounds">
	//   26   49:new             #89  <Class Rect>
	//   27   52:dup             
	//   28   53:iload_2         
	//   29   54:iload_3         
	//   30   55:iload_2         
	//   31   56:iload           4
	//   32   58:iadd            
	//   33   59:iload_3         
	//   34   60:iload           5
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
	//   12   27:istore          11
		int j = ((Rect) (transitionvalues1)).top;
	//   13   29:aload           4
	//   14   31:getfield        #149 <Field int Rect.top>
	//   15   34:istore          12
		float f4 = view.getTranslationX();
	//   16   36:aload_2         
	//   17   37:invokevirtual   #80  <Method float View.getTranslationX()>
	//   18   40:fstore          9
		float f5 = view.getTranslationY();
	//   19   42:aload_2         
	//   20   43:invokevirtual   #87  <Method float View.getTranslationY()>
	//   21   46:fstore          10
		float f2 = f4;
	//   22   48:fload           9
	//   23   50:fstore          7
		float f = f5;
	//   24   52:fload           10
	//   25   54:fstore          5
		int ai[] = (int[])(int[])transitionvalues.view.getTag(R.id.transition_position);
	//   26   56:aload_3         
	//   27   57:getfield        #111 <Field View TransitionValues.view>
	//   28   60:getstatic       #161 <Field int R$id.transition_position>
	//   29   63:invokevirtual   #165 <Method Object View.getTag(int)>
	//   30   66:checkcast       #166 <Class int[]>
	//   31   69:checkcast       #166 <Class int[]>
	//   32   72:astore          13
		float f3 = f2;
	//   33   74:fload           7
	//   34   76:fstore          8
		float f1 = f;
	//   35   78:fload           5
	//   36   80:fstore          6
		if(ai != null)
	//*  37   82:aload           13
	//*  38   84:ifnull          132
		{
			f3 = f2 + (float)(ai[0] - ((Rect) (transitionvalues1)).left);
	//   39   87:fload           7
	//   40   89:aload           13
	//   41   91:iconst_0        
	//   42   92:iaload          
	//   43   93:aload           4
	//   44   95:getfield        #146 <Field int Rect.left>
	//   45   98:isub            
	//   46   99:i2f             
	//   47  100:fadd            
	//   48  101:fstore          8
			f1 = f + (float)(ai[1] - ((Rect) (transitionvalues1)).top);
	//   49  103:fload           5
	//   50  105:aload           13
	//   51  107:iconst_1        
	//   52  108:iaload          
	//   53  109:aload           4
	//   54  111:getfield        #149 <Field int Rect.top>
	//   55  114:isub            
	//   56  115:i2f             
	//   57  116:fadd            
	//   58  117:fstore          6
			((Rect) (transitionvalues1)).offsetTo(ai[0], ai[1]);
	//   59  119:aload           4
	//   60  121:aload           13
	//   61  123:iconst_0        
	//   62  124:iaload          
	//   63  125:aload           13
	//   64  127:iconst_1        
	//   65  128:iaload          
	//   66  129:invokevirtual   #170 <Method void Rect.offsetTo(int, int)>
		}
		calculateOut(((View) (viewgroup)), ((Rect) (transitionvalues1)), mTempLoc);
	//   67  132:aload_0         
	//   68  133:aload_1         
	//   69  134:aload           4
	//   70  136:aload_0         
	//   71  137:getfield        #31  <Field int[] mTempLoc>
	//   72  140:invokespecial   #142 <Method void calculateOut(View, Rect, int[])>
		return TranslationAnimationCreator.createAnimation(view, transitionvalues, i, j, f4, f5, f3 + (float)mTempLoc[0], f1 + (float)mTempLoc[1], sAccelerate);
	//   73  143:aload_2         
	//   74  144:aload_3         
	//   75  145:iload           11
	//   76  147:iload           12
	//   77  149:fload           9
	//   78  151:fload           10
	//   79  153:fload           8
	//   80  155:aload_0         
	//   81  156:getfield        #31  <Field int[] mTempLoc>
	//   82  159:iconst_0        
	//   83  160:iaload          
	//   84  161:i2f             
	//   85  162:fadd            
	//   86  163:fload           6
	//   87  165:aload_0         
	//   88  166:getfield        #31  <Field int[] mTempLoc>
	//   89  169:iconst_1        
	//   90  170:iaload          
	//   91  171:i2f             
	//   92  172:fadd            
	//   93  173:getstatic       #27  <Field TimeInterpolator sAccelerate>
	//   94  176:invokestatic    #155 <Method Animator TranslationAnimationCreator.createAnimation(View, TransitionValues, int, int, float, float, float, float, TimeInterpolator)>
	//   95  179:areturn         
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
