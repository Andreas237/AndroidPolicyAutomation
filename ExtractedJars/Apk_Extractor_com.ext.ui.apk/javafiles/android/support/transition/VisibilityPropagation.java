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
	//    2    4:astore          5
		Integer integer1 = (Integer)transitionvalues.values.get("android:visibility:visibility");
	//    3    6:aload_1         
	//    4    7:getfield        #31  <Field Map TransitionValues.values>
	//    5   10:ldc1            #47  <String "android:visibility:visibility">
	//    6   12:invokeinterface #37  <Method Object Map.get(Object)>
	//    7   17:checkcast       #49  <Class Integer>
	//    8   20:astore          4
		Integer integer = integer1;
	//    9   22:aload           4
	//   10   24:astore_3        
		if(integer1 == null)
	//*  11   25:aload           4
	//*  12   27:ifnonnull       39
			integer = Integer.valueOf(view.getVisibility());
	//   13   30:aload           5
	//   14   32:invokevirtual   #55  <Method int View.getVisibility()>
	//   15   35:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//   16   38:astore_3        
		transitionvalues.values.put("android:visibilityPropagation:visibility", ((Object) (integer)));
	//   17   39:aload_1         
	//   18   40:getfield        #31  <Field Map TransitionValues.values>
	//   19   43:ldc1            #11  <String "android:visibilityPropagation:visibility">
	//   20   45:aload_3         
	//   21   46:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   22   51:pop             
		int ai[] = new int[2];
	//   23   52:iconst_2        
	//   24   53:newarray        int[]
	//   25   55:astore_3        
		view.getLocationOnScreen(ai);
	//   26   56:aload           5
	//   27   58:aload_3         
	//   28   59:invokevirtual   #67  <Method void View.getLocationOnScreen(int[])>
		ai[0] = ai[0] + Math.round(view.getTranslationX());
	//   29   62:aload_3         
	//   30   63:iconst_0        
	//   31   64:aload_3         
	//   32   65:iconst_0        
	//   33   66:iaload          
	//   34   67:aload           5
	//   35   69:invokevirtual   #71  <Method float View.getTranslationX()>
	//   36   72:invokestatic    #77  <Method int Math.round(float)>
	//   37   75:iadd            
	//   38   76:iastore         
		ai[0] = ai[0] + view.getWidth() / 2;
	//   39   77:aload_3         
	//   40   78:iconst_0        
	//   41   79:aload_3         
	//   42   80:iconst_0        
	//   43   81:iaload          
	//   44   82:aload           5
	//   45   84:invokevirtual   #80  <Method int View.getWidth()>
	//   46   87:iconst_2        
	//   47   88:idiv            
	//   48   89:iadd            
	//   49   90:iastore         
		ai[1] = ai[1] + Math.round(view.getTranslationY());
	//   50   91:aload_3         
	//   51   92:iconst_1        
	//   52   93:aload_3         
	//   53   94:iconst_1        
	//   54   95:iaload          
	//   55   96:aload           5
	//   56   98:invokevirtual   #83  <Method float View.getTranslationY()>
	//   57  101:invokestatic    #77  <Method int Math.round(float)>
	//   58  104:iadd            
	//   59  105:iastore         
		int i = ai[1];
	//   60  106:aload_3         
	//   61  107:iconst_1        
	//   62  108:iaload          
	//   63  109:istore_2        
		ai[1] = view.getHeight() / 2 + i;
	//   64  110:aload_3         
	//   65  111:iconst_1        
	//   66  112:aload           5
	//   67  114:invokevirtual   #86  <Method int View.getHeight()>
	//   68  117:iconst_2        
	//   69  118:idiv            
	//   70  119:iload_2         
	//   71  120:iadd            
	//   72  121:iastore         
		transitionvalues.values.put("android:visibilityPropagation:center", ((Object) (ai)));
	//   73  122:aload_1         
	//   74  123:getfield        #31  <Field Map TransitionValues.values>
	//   75  126:ldc1            #8   <String "android:visibilityPropagation:center">
	//   76  128:aload_3         
	//   77  129:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   78  134:pop             
	//   79  135:return          
	}

	public String[] getPropagationProperties()
	{
		return VISIBILITY_PROPAGATION_VALUES;
	//    0    0:getstatic       #19  <Field String[] VISIBILITY_PROPAGATION_VALUES>
	//    1    3:areturn         
	}

	public int getViewVisibility(TransitionValues transitionvalues)
	{
		if(transitionvalues == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       7
			return 8;
	//    2    4:bipush          8
	//    3    6:ireturn         
		transitionvalues = ((TransitionValues) ((Integer)transitionvalues.values.get("android:visibilityPropagation:visibility")));
	//    4    7:aload_1         
	//    5    8:getfield        #31  <Field Map TransitionValues.values>
	//    6   11:ldc1            #11  <String "android:visibilityPropagation:visibility">
	//    7   13:invokeinterface #37  <Method Object Map.get(Object)>
	//    8   18:checkcast       #49  <Class Integer>
	//    9   21:astore_1        
		if(transitionvalues == null)
	//*  10   22:aload_1         
	//*  11   23:ifnonnull       29
			return 8;
	//   12   26:bipush          8
	//   13   28:ireturn         
		else
			return ((Integer) (transitionvalues)).intValue();
	//   14   29:aload_1         
	//   15   30:invokevirtual   #93  <Method int Integer.intValue()>
	//   16   33:ireturn         
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
