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
		if(transitionvalues == null || transitionvalues1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          8
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		View view = transitionvalues1.view;
	//    6   10:aload_3         
	//    7   11:getfield        #38  <Field View TransitionValues.view>
	//    8   14:astore          8
		int i = ((Integer)transitionvalues.values.get("android:changeScroll:x")).intValue();
	//    9   16:aload_2         
	//   10   17:getfield        #34  <Field Map TransitionValues.values>
	//   11   20:ldc1            #10  <String "android:changeScroll:x">
	//   12   22:invokeinterface #72  <Method Object Map.get(Object)>
	//   13   27:checkcast       #46  <Class Integer>
	//   14   30:invokevirtual   #75  <Method int Integer.intValue()>
	//   15   33:istore          4
		int j = ((Integer)transitionvalues1.values.get("android:changeScroll:x")).intValue();
	//   16   35:aload_3         
	//   17   36:getfield        #34  <Field Map TransitionValues.values>
	//   18   39:ldc1            #10  <String "android:changeScroll:x">
	//   19   41:invokeinterface #72  <Method Object Map.get(Object)>
	//   20   46:checkcast       #46  <Class Integer>
	//   21   49:invokevirtual   #75  <Method int Integer.intValue()>
	//   22   52:istore          5
		int k = ((Integer)transitionvalues.values.get("android:changeScroll:y")).intValue();
	//   23   54:aload_2         
	//   24   55:getfield        #34  <Field Map TransitionValues.values>
	//   25   58:ldc1            #13  <String "android:changeScroll:y">
	//   26   60:invokeinterface #72  <Method Object Map.get(Object)>
	//   27   65:checkcast       #46  <Class Integer>
	//   28   68:invokevirtual   #75  <Method int Integer.intValue()>
	//   29   71:istore          6
		int l = ((Integer)transitionvalues1.values.get("android:changeScroll:y")).intValue();
	//   30   73:aload_3         
	//   31   74:getfield        #34  <Field Map TransitionValues.values>
	//   32   77:ldc1            #13  <String "android:changeScroll:y">
	//   33   79:invokeinterface #72  <Method Object Map.get(Object)>
	//   34   84:checkcast       #46  <Class Integer>
	//   35   87:invokevirtual   #75  <Method int Integer.intValue()>
	//   36   90:istore          7
		if(i != j)
	//*  37   92:iload           4
	//*  38   94:iload           5
	//*  39   96:icmpeq          173
		{
			view.setScrollX(i);
	//   40   99:aload           8
	//   41  101:iload           4
	//   42  103:invokevirtual   #79  <Method void View.setScrollX(int)>
			viewgroup = ((ViewGroup) (ObjectAnimator.ofInt(((Object) (view)), "scrollX", new int[] {
				i, j
			})));
	//   43  106:aload           8
	//   44  108:ldc1            #81  <String "scrollX">
	//   45  110:iconst_2        
	//   46  111:newarray        int[]
	//   47  113:dup             
	//   48  114:iconst_0        
	//   49  115:iload           4
	//   50  117:iastore         
	//   51  118:dup             
	//   52  119:iconst_1        
	//   53  120:iload           5
	//   54  122:iastore         
	//   55  123:invokestatic    #87  <Method ObjectAnimator ObjectAnimator.ofInt(Object, String, int[])>
	//   56  126:astore_1        
		} else
	//*  57  127:iload           6
	//*  58  129:iload           7
	//*  59  131:icmpeq          168
	//*  60  134:aload           8
	//*  61  136:iload           6
	//*  62  138:invokevirtual   #90  <Method void View.setScrollY(int)>
	//*  63  141:aload           8
	//*  64  143:ldc1            #92  <String "scrollY">
	//*  65  145:iconst_2        
	//*  66  146:newarray        int[]
	//*  67  148:dup             
	//*  68  149:iconst_0        
	//*  69  150:iload           6
	//*  70  152:iastore         
	//*  71  153:dup             
	//*  72  154:iconst_1        
	//*  73  155:iload           7
	//*  74  157:iastore         
	//*  75  158:invokestatic    #87  <Method ObjectAnimator ObjectAnimator.ofInt(Object, String, int[])>
	//*  76  161:astore_2        
	//*  77  162:aload_1         
	//*  78  163:aload_2         
	//*  79  164:invokestatic    #98  <Method Animator TransitionUtils.mergeAnimators(Animator, Animator)>
	//*  80  167:areturn         
	//*  81  168:aconst_null     
	//*  82  169:astore_2        
	//*  83  170:goto            162
		{
			viewgroup = null;
	//   84  173:aconst_null     
	//   85  174:astore_1        
		}
		if(k != l)
		{
			view.setScrollY(k);
			transitionvalues = ((TransitionValues) (ObjectAnimator.ofInt(((Object) (view)), "scrollY", new int[] {
				k, l
			})));
		} else
		{
			transitionvalues = null;
		}
		return TransitionUtils.mergeAnimators(((Animator) (viewgroup)), ((Animator) (transitionvalues)));
	//*  86  175:goto            127
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
