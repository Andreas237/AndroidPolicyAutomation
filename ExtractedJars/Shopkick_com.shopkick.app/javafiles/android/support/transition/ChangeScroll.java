// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Transition, TransitionValues, TransitionUtils

public class ChangeScroll extends Transition
{

	public ChangeScroll()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Transition()>
	//    2    4:return          
	}

	public ChangeScroll(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void Transition(Context, AttributeSet)>
	//    4    6:return          
	}

	private void captureValues(TransitionValues transitionvalues)
	{
		transitionvalues.values.put("android:changeScroll:x", ((Object) (Integer.valueOf(transitionvalues.view.getScrollX()))));
	//    0    0:aload_1         
	//    1    1:getfield        #34  <Field Map TransitionValues.values>
	//    2    4:ldc1            #10  <String "android:changeScroll:x">
	//    3    6:aload_1         
	//    4    7:getfield        #38  <Field View TransitionValues.view>
	//    5   10:invokevirtual   #44  <Method int View.getScrollX()>
	//    6   13:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//    7   16:invokeinterface #56  <Method Object Map.put(Object, Object)>
	//    8   21:pop             
		transitionvalues.values.put("android:changeScroll:y", ((Object) (Integer.valueOf(transitionvalues.view.getScrollY()))));
	//    9   22:aload_1         
	//   10   23:getfield        #34  <Field Map TransitionValues.values>
	//   11   26:ldc1            #13  <String "android:changeScroll:y">
	//   12   28:aload_1         
	//   13   29:getfield        #38  <Field View TransitionValues.view>
	//   14   32:invokevirtual   #59  <Method int View.getScrollY()>
	//   15   35:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   16   38:invokeinterface #56  <Method Object Map.put(Object, Object)>
	//   17   43:pop             
	//   18   44:return          
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #63  <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #63  <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public Animator createAnimator(ViewGroup viewgroup, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		if(transitionvalues != null)
	//*   2    3:aload_2         
	//*   3    4:ifnull          179
		{
			if(transitionvalues1 == null)
	//*   4    7:aload_3         
	//*   5    8:ifnonnull       13
				return null;
	//    6   11:aconst_null     
	//    7   12:areturn         
			View view = transitionvalues1.view;
	//    8   13:aload_3         
	//    9   14:getfield        #38  <Field View TransitionValues.view>
	//   10   17:astore          9
			int i = ((Integer)transitionvalues.values.get("android:changeScroll:x")).intValue();
	//   11   19:aload_2         
	//   12   20:getfield        #34  <Field Map TransitionValues.values>
	//   13   23:ldc1            #10  <String "android:changeScroll:x">
	//   14   25:invokeinterface #72  <Method Object Map.get(Object)>
	//   15   30:checkcast       #46  <Class Integer>
	//   16   33:invokevirtual   #75  <Method int Integer.intValue()>
	//   17   36:istore          4
			int j = ((Integer)transitionvalues1.values.get("android:changeScroll:x")).intValue();
	//   18   38:aload_3         
	//   19   39:getfield        #34  <Field Map TransitionValues.values>
	//   20   42:ldc1            #10  <String "android:changeScroll:x">
	//   21   44:invokeinterface #72  <Method Object Map.get(Object)>
	//   22   49:checkcast       #46  <Class Integer>
	//   23   52:invokevirtual   #75  <Method int Integer.intValue()>
	//   24   55:istore          5
			int k = ((Integer)transitionvalues.values.get("android:changeScroll:y")).intValue();
	//   25   57:aload_2         
	//   26   58:getfield        #34  <Field Map TransitionValues.values>
	//   27   61:ldc1            #13  <String "android:changeScroll:y">
	//   28   63:invokeinterface #72  <Method Object Map.get(Object)>
	//   29   68:checkcast       #46  <Class Integer>
	//   30   71:invokevirtual   #75  <Method int Integer.intValue()>
	//   31   74:istore          6
			int l = ((Integer)transitionvalues1.values.get("android:changeScroll:y")).intValue();
	//   32   76:aload_3         
	//   33   77:getfield        #34  <Field Map TransitionValues.values>
	//   34   80:ldc1            #13  <String "android:changeScroll:y">
	//   35   82:invokeinterface #72  <Method Object Map.get(Object)>
	//   36   87:checkcast       #46  <Class Integer>
	//   37   90:invokevirtual   #75  <Method int Integer.intValue()>
	//   38   93:istore          7
			if(i != j)
	//*  39   95:iload           4
	//*  40   97:iload           5
	//*  41   99:icmpeq          133
			{
				view.setScrollX(i);
	//   42  102:aload           9
	//   43  104:iload           4
	//   44  106:invokevirtual   #79  <Method void View.setScrollX(int)>
				viewgroup = ((ViewGroup) (ObjectAnimator.ofInt(((Object) (view)), "scrollX", new int[] {
					i, j
				})));
	//   45  109:aload           9
	//   46  111:ldc1            #81  <String "scrollX">
	//   47  113:iconst_2        
	//   48  114:newarray        int[]
	//   49  116:dup             
	//   50  117:iconst_0        
	//   51  118:iload           4
	//   52  120:iastore         
	//   53  121:dup             
	//   54  122:iconst_1        
	//   55  123:iload           5
	//   56  125:iastore         
	//   57  126:invokestatic    #87  <Method ObjectAnimator ObjectAnimator.ofInt(Object, String, int[])>
	//   58  129:astore_1        
			} else
	//*  59  130:goto            135
			{
				viewgroup = null;
	//   60  133:aconst_null     
	//   61  134:astore_1        
			}
			transitionvalues = ((TransitionValues) (obj));
	//   62  135:aload           8
	//   63  137:astore_2        
			if(k != l)
	//*  64  138:iload           6
	//*  65  140:iload           7
	//*  66  142:icmpeq          173
			{
				view.setScrollY(k);
	//   67  145:aload           9
	//   68  147:iload           6
	//   69  149:invokevirtual   #90  <Method void View.setScrollY(int)>
				transitionvalues = ((TransitionValues) (ObjectAnimator.ofInt(((Object) (view)), "scrollY", new int[] {
					k, l
				})));
	//   70  152:aload           9
	//   71  154:ldc1            #92  <String "scrollY">
	//   72  156:iconst_2        
	//   73  157:newarray        int[]
	//   74  159:dup             
	//   75  160:iconst_0        
	//   76  161:iload           6
	//   77  163:iastore         
	//   78  164:dup             
	//   79  165:iconst_1        
	//   80  166:iload           7
	//   81  168:iastore         
	//   82  169:invokestatic    #87  <Method ObjectAnimator ObjectAnimator.ofInt(Object, String, int[])>
	//   83  172:astore_2        
			}
			return TransitionUtils.mergeAnimators(((Animator) (viewgroup)), ((Animator) (transitionvalues)));
	//   84  173:aload_1         
	//   85  174:aload_2         
	//   86  175:invokestatic    #98  <Method Animator TransitionUtils.mergeAnimators(Animator, Animator)>
	//   87  178:areturn         
		} else
		{
			return null;
	//   88  179:aconst_null     
	//   89  180:areturn         
		}
	}

	public String[] getTransitionProperties()
	{
		return PROPERTIES;
	//    0    0:getstatic       #19  <Field String[] PROPERTIES>
	//    1    3:areturn         
	}

	private static final String PROPERTIES[] = {
		"android:changeScroll:x", "android:changeScroll:y"
	};
	private static final String PROPNAME_SCROLL_X = "android:changeScroll:x";
	private static final String PROPNAME_SCROLL_Y = "android:changeScroll:y";

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #10  <String "android:changeScroll:x">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #13  <String "android:changeScroll:y">
	//    9   13:aastore         
	//   10   14:putstatic       #19  <Field String[] PROPERTIES>
	//*  11   17:return          
	}
}
