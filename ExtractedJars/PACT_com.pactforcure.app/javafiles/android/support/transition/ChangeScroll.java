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
		viewgroup = null;
	//   37   92:aconst_null     
	//   38   93:astore_1        
		transitionvalues = null;
	//   39   94:aconst_null     
	//   40   95:astore_2        
		if(i != j)
	//*  41   96:iload           4
	//*  42   98:iload           5
	//*  43  100:icmpeq          131
		{
			view.setScrollX(i);
	//   44  103:aload           8
	//   45  105:iload           4
	//   46  107:invokevirtual   #79  <Method void View.setScrollX(int)>
			viewgroup = ((ViewGroup) (ObjectAnimator.ofInt(((Object) (view)), "scrollX", new int[] {
				i, j
			})));
	//   47  110:aload           8
	//   48  112:ldc1            #81  <String "scrollX">
	//   49  114:iconst_2        
	//   50  115:newarray        int[]
	//   51  117:dup             
	//   52  118:iconst_0        
	//   53  119:iload           4
	//   54  121:iastore         
	//   55  122:dup             
	//   56  123:iconst_1        
	//   57  124:iload           5
	//   58  126:iastore         
	//   59  127:invokestatic    #87  <Method ObjectAnimator ObjectAnimator.ofInt(Object, String, int[])>
	//   60  130:astore_1        
		}
		if(k != l)
	//*  61  131:iload           6
	//*  62  133:iload           7
	//*  63  135:icmpeq          166
		{
			view.setScrollY(k);
	//   64  138:aload           8
	//   65  140:iload           6
	//   66  142:invokevirtual   #90  <Method void View.setScrollY(int)>
			transitionvalues = ((TransitionValues) (ObjectAnimator.ofInt(((Object) (view)), "scrollY", new int[] {
				k, l
			})));
	//   67  145:aload           8
	//   68  147:ldc1            #92  <String "scrollY">
	//   69  149:iconst_2        
	//   70  150:newarray        int[]
	//   71  152:dup             
	//   72  153:iconst_0        
	//   73  154:iload           6
	//   74  156:iastore         
	//   75  157:dup             
	//   76  158:iconst_1        
	//   77  159:iload           7
	//   78  161:iastore         
	//   79  162:invokestatic    #87  <Method ObjectAnimator ObjectAnimator.ofInt(Object, String, int[])>
	//   80  165:astore_2        
		}
		return TransitionUtils.mergeAnimators(((Animator) (viewgroup)), ((Animator) (transitionvalues)));
	//   81  166:aload_1         
	//   82  167:aload_2         
	//   83  168:invokestatic    #98  <Method Animator TransitionUtils.mergeAnimators(Animator, Animator)>
	//   84  171:areturn         
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
