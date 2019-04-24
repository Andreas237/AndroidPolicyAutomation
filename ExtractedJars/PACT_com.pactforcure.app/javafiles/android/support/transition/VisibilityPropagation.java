// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.View;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			TransitionPropagation, TransitionValues

public abstract class VisibilityPropagation extends TransitionPropagation
{

	public VisibilityPropagation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void TransitionPropagation()>
	//    2    4:return          
	}

	private static int getViewCoordinate(TransitionValues transitionvalues, int i)
	{
		if(transitionvalues == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
		transitionvalues = ((TransitionValues) ((int[])(int[])transitionvalues.values.get("android:visibilityPropagation:center")));
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field Map TransitionValues.values>
	//    6   10:ldc1            #8   <String "android:visibilityPropagation:center">
	//    7   12:invokeinterface #37  <Method Object Map.get(Object)>
	//    8   17:checkcast       #39  <Class int[]>
	//    9   20:checkcast       #39  <Class int[]>
	//   10   23:astore_0        
		if(transitionvalues == null)
	//*  11   24:aload_0         
	//*  12   25:ifnonnull       30
			return -1;
	//   13   28:iconst_m1       
	//   14   29:ireturn         
		else
			return transitionvalues[i];
	//   15   30:aload_0         
	//   16   31:iload_1         
	//   17   32:iaload          
	//   18   33:ireturn         
	}

	public void captureValues(TransitionValues transitionvalues)
	{
		View view = transitionvalues.view;
	//    0    0:aload_1         
	//    1    1:getfield        #45  <Field View TransitionValues.view>
	//    2    4:astore          4
		Integer integer1 = (Integer)transitionvalues.values.get("android:visibility:visibility");
	//    3    6:aload_1         
	//    4    7:getfield        #31  <Field Map TransitionValues.values>
	//    5   10:ldc1            #47  <String "android:visibility:visibility">
	//    6   12:invokeinterface #37  <Method Object Map.get(Object)>
	//    7   17:checkcast       #49  <Class Integer>
	//    8   20:astore_3        
		Integer integer = integer1;
	//    9   21:aload_3         
	//   10   22:astore_2        
		if(integer1 == null)
	//*  11   23:aload_3         
	//*  12   24:ifnonnull       36
			integer = Integer.valueOf(view.getVisibility());
	//   13   27:aload           4
	//   14   29:invokevirtual   #55  <Method int View.getVisibility()>
	//   15   32:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//   16   35:astore_2        
		transitionvalues.values.put("android:visibilityPropagation:visibility", ((Object) (integer)));
	//   17   36:aload_1         
	//   18   37:getfield        #31  <Field Map TransitionValues.values>
	//   19   40:ldc1            #11  <String "android:visibilityPropagation:visibility">
	//   20   42:aload_2         
	//   21   43:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   22   48:pop             
		int ai[] = new int[2];
	//   23   49:iconst_2        
	//   24   50:newarray        int[]
	//   25   52:astore_2        
		view.getLocationOnScreen(ai);
	//   26   53:aload           4
	//   27   55:aload_2         
	//   28   56:invokevirtual   #67  <Method void View.getLocationOnScreen(int[])>
		ai[0] = ai[0] + Math.round(view.getTranslationX());
	//   29   59:aload_2         
	//   30   60:iconst_0        
	//   31   61:aload_2         
	//   32   62:iconst_0        
	//   33   63:iaload          
	//   34   64:aload           4
	//   35   66:invokevirtual   #71  <Method float View.getTranslationX()>
	//   36   69:invokestatic    #77  <Method int Math.round(float)>
	//   37   72:iadd            
	//   38   73:iastore         
		ai[0] = ai[0] + view.getWidth() / 2;
	//   39   74:aload_2         
	//   40   75:iconst_0        
	//   41   76:aload_2         
	//   42   77:iconst_0        
	//   43   78:iaload          
	//   44   79:aload           4
	//   45   81:invokevirtual   #80  <Method int View.getWidth()>
	//   46   84:iconst_2        
	//   47   85:idiv            
	//   48   86:iadd            
	//   49   87:iastore         
		ai[1] = ai[1] + Math.round(view.getTranslationY());
	//   50   88:aload_2         
	//   51   89:iconst_1        
	//   52   90:aload_2         
	//   53   91:iconst_1        
	//   54   92:iaload          
	//   55   93:aload           4
	//   56   95:invokevirtual   #83  <Method float View.getTranslationY()>
	//   57   98:invokestatic    #77  <Method int Math.round(float)>
	//   58  101:iadd            
	//   59  102:iastore         
		ai[1] = ai[1] + view.getHeight() / 2;
	//   60  103:aload_2         
	//   61  104:iconst_1        
	//   62  105:aload_2         
	//   63  106:iconst_1        
	//   64  107:iaload          
	//   65  108:aload           4
	//   66  110:invokevirtual   #86  <Method int View.getHeight()>
	//   67  113:iconst_2        
	//   68  114:idiv            
	//   69  115:iadd            
	//   70  116:iastore         
		transitionvalues.values.put("android:visibilityPropagation:center", ((Object) (ai)));
	//   71  117:aload_1         
	//   72  118:getfield        #31  <Field Map TransitionValues.values>
	//   73  121:ldc1            #8   <String "android:visibilityPropagation:center">
	//   74  123:aload_2         
	//   75  124:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   76  129:pop             
	//   77  130:return          
	}

	public String[] getPropagationProperties()
	{
		return VISIBILITY_PROPAGATION_VALUES;
	//    0    0:getstatic       #19  <Field String[] VISIBILITY_PROPAGATION_VALUES>
	//    1    3:areturn         
	}

	public int getViewVisibility(TransitionValues transitionvalues)
	{
		if(transitionvalues != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       7
	//*   2    4:bipush          8
	//*   3    6:ireturn         
	//*   4    7:aload_1         
	//*   5    8:getfield        #31  <Field Map TransitionValues.values>
	//*   6   11:ldc1            #11  <String "android:visibilityPropagation:visibility">
	//*   7   13:invokeinterface #37  <Method Object Map.get(Object)>
	//*   8   18:checkcast       #49  <Class Integer>
	//*   9   21:astore_1        
			if((transitionvalues = ((TransitionValues) ((Integer)transitionvalues.values.get("android:visibilityPropagation:visibility")))) != null)
	//*  10   22:aload_1         
	//*  11   23:ifnull          4
				return ((Integer) (transitionvalues)).intValue();
	//   12   26:aload_1         
	//   13   27:invokevirtual   #93  <Method int Integer.intValue()>
	//   14   30:ireturn         
		return 8;
	}

	public int getViewX(TransitionValues transitionvalues)
	{
		return getViewCoordinate(transitionvalues, 0);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #96  <Method int getViewCoordinate(TransitionValues, int)>
	//    3    5:ireturn         
	}

	public int getViewY(TransitionValues transitionvalues)
	{
		return getViewCoordinate(transitionvalues, 1);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #96  <Method int getViewCoordinate(TransitionValues, int)>
	//    3    5:ireturn         
	}

	private static final String PROPNAME_VIEW_CENTER = "android:visibilityPropagation:center";
	private static final String PROPNAME_VISIBILITY = "android:visibilityPropagation:visibility";
	private static final String VISIBILITY_PROPAGATION_VALUES[] = {
		"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"
	};

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #11  <String "android:visibilityPropagation:visibility">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #8   <String "android:visibilityPropagation:center">
	//    9   13:aastore         
	//   10   14:putstatic       #19  <Field String[] VISIBILITY_PROPAGATION_VALUES>
	//*  11   17:return          
	}
}
