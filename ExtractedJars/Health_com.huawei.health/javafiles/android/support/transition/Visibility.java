// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Transition, TransitionValues

public abstract class Visibility extends Transition
{
	static class d
	{

		ViewGroup a;
		int b;
		boolean c;
		boolean d;
		int e;
		ViewGroup h;

		private d()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}

	}


	public Visibility()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Transition()>
	//    2    4:return          
	}

	private void captureValues(TransitionValues transitionvalues)
	{
		int i = transitionvalues.view.getVisibility();
	//    0    0:aload_1         
	//    1    1:getfield        #36  <Field View TransitionValues.view>
	//    2    4:invokevirtual   #42  <Method int View.getVisibility()>
	//    3    7:istore_2        
		transitionvalues.values.put("android:visibility:visibility", ((Object) (Integer.valueOf(i))));
	//    4    8:aload_1         
	//    5    9:getfield        #46  <Field Map TransitionValues.values>
	//    6   12:ldc1            #16  <String "android:visibility:visibility">
	//    7   14:iload_2         
	//    8   15:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//    9   18:invokeinterface #58  <Method Object Map.put(Object, Object)>
	//   10   23:pop             
		transitionvalues.values.put("android:visibility:parent", ((Object) (transitionvalues.view.getParent())));
	//   11   24:aload_1         
	//   12   25:getfield        #46  <Field Map TransitionValues.values>
	//   13   28:ldc1            #13  <String "android:visibility:parent">
	//   14   30:aload_1         
	//   15   31:getfield        #36  <Field View TransitionValues.view>
	//   16   34:invokevirtual   #62  <Method android.view.ViewParent View.getParent()>
	//   17   37:invokeinterface #58  <Method Object Map.put(Object, Object)>
	//   18   42:pop             
	//   19   43:return          
	}

	private d getVisibilityChangeInfo(TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		d d1 = new d();
	//    0    0:new             #8   <Class Visibility$d>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #67  <Method void Visibility$d(Visibility$2)>
	//    4    8:astore_3        
		d1.c = false;
	//    5    9:aload_3         
	//    6   10:iconst_0        
	//    7   11:putfield        #71  <Field boolean Visibility$d.c>
		d1.d = false;
	//    8   14:aload_3         
	//    9   15:iconst_0        
	//   10   16:putfield        #73  <Field boolean Visibility$d.d>
		if(transitionvalues != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          65
		{
			d1.b = ((Integer)transitionvalues.values.get("android:visibility:visibility")).intValue();
	//   13   23:aload_3         
	//   14   24:aload_1         
	//   15   25:getfield        #46  <Field Map TransitionValues.values>
	//   16   28:ldc1            #16  <String "android:visibility:visibility">
	//   17   30:invokeinterface #77  <Method Object Map.get(Object)>
	//   18   35:checkcast       #48  <Class Integer>
	//   19   38:invokevirtual   #80  <Method int Integer.intValue()>
	//   20   41:putfield        #84  <Field int Visibility$d.b>
			d1.a = (ViewGroup)transitionvalues.values.get("android:visibility:parent");
	//   21   44:aload_3         
	//   22   45:aload_1         
	//   23   46:getfield        #46  <Field Map TransitionValues.values>
	//   24   49:ldc1            #13  <String "android:visibility:parent">
	//   25   51:invokeinterface #77  <Method Object Map.get(Object)>
	//   26   56:checkcast       #86  <Class ViewGroup>
	//   27   59:putfield        #90  <Field ViewGroup Visibility$d.a>
		} else
	//*  28   62:goto            75
		{
			d1.b = -1;
	//   29   65:aload_3         
	//   30   66:iconst_m1       
	//   31   67:putfield        #84  <Field int Visibility$d.b>
			d1.a = null;
	//   32   70:aload_3         
	//   33   71:aconst_null     
	//   34   72:putfield        #90  <Field ViewGroup Visibility$d.a>
		}
		if(transitionvalues1 != null)
	//*  35   75:aload_2         
	//*  36   76:ifnull          121
		{
			d1.e = ((Integer)transitionvalues1.values.get("android:visibility:visibility")).intValue();
	//   37   79:aload_3         
	//   38   80:aload_2         
	//   39   81:getfield        #46  <Field Map TransitionValues.values>
	//   40   84:ldc1            #16  <String "android:visibility:visibility">
	//   41   86:invokeinterface #77  <Method Object Map.get(Object)>
	//   42   91:checkcast       #48  <Class Integer>
	//   43   94:invokevirtual   #80  <Method int Integer.intValue()>
	//   44   97:putfield        #93  <Field int Visibility$d.e>
			d1.h = (ViewGroup)transitionvalues1.values.get("android:visibility:parent");
	//   45  100:aload_3         
	//   46  101:aload_2         
	//   47  102:getfield        #46  <Field Map TransitionValues.values>
	//   48  105:ldc1            #13  <String "android:visibility:parent">
	//   49  107:invokeinterface #77  <Method Object Map.get(Object)>
	//   50  112:checkcast       #86  <Class ViewGroup>
	//   51  115:putfield        #96  <Field ViewGroup Visibility$d.h>
		} else
	//*  52  118:goto            131
		{
			d1.e = -1;
	//   53  121:aload_3         
	//   54  122:iconst_m1       
	//   55  123:putfield        #93  <Field int Visibility$d.e>
			d1.h = null;
	//   56  126:aload_3         
	//   57  127:aconst_null     
	//   58  128:putfield        #96  <Field ViewGroup Visibility$d.h>
		}
		if(transitionvalues != null && transitionvalues1 != null)
	//*  59  131:aload_1         
	//*  60  132:ifnull          251
	//*  61  135:aload_2         
	//*  62  136:ifnull          251
		{
			if(d1.b == d1.e && d1.a == d1.h)
	//*  63  139:aload_3         
	//*  64  140:getfield        #84  <Field int Visibility$d.b>
	//*  65  143:aload_3         
	//*  66  144:getfield        #93  <Field int Visibility$d.e>
	//*  67  147:icmpne          163
	//*  68  150:aload_3         
	//*  69  151:getfield        #90  <Field ViewGroup Visibility$d.a>
	//*  70  154:aload_3         
	//*  71  155:getfield        #96  <Field ViewGroup Visibility$d.h>
	//*  72  158:if_acmpne       163
				return d1;
	//   73  161:aload_3         
	//   74  162:areturn         
			if(d1.b != d1.e)
	//*  75  163:aload_3         
	//*  76  164:getfield        #84  <Field int Visibility$d.b>
	//*  77  167:aload_3         
	//*  78  168:getfield        #93  <Field int Visibility$d.e>
	//*  79  171:icmpeq          214
			{
				if(d1.b == 0)
	//*  80  174:aload_3         
	//*  81  175:getfield        #84  <Field int Visibility$d.b>
	//*  82  178:ifne            194
				{
					d1.d = false;
	//   83  181:aload_3         
	//   84  182:iconst_0        
	//   85  183:putfield        #73  <Field boolean Visibility$d.d>
					d1.c = true;
	//   86  186:aload_3         
	//   87  187:iconst_1        
	//   88  188:putfield        #71  <Field boolean Visibility$d.c>
				} else
	//*  89  191:goto            251
				if(d1.e == 0)
	//*  90  194:aload_3         
	//*  91  195:getfield        #93  <Field int Visibility$d.e>
	//*  92  198:ifne            251
				{
					d1.d = true;
	//   93  201:aload_3         
	//   94  202:iconst_1        
	//   95  203:putfield        #73  <Field boolean Visibility$d.d>
					d1.c = true;
	//   96  206:aload_3         
	//   97  207:iconst_1        
	//   98  208:putfield        #71  <Field boolean Visibility$d.c>
				}
			} else
	//*  99  211:goto            251
			if(d1.h == null)
	//* 100  214:aload_3         
	//* 101  215:getfield        #96  <Field ViewGroup Visibility$d.h>
	//* 102  218:ifnonnull       234
			{
				d1.d = false;
	//  103  221:aload_3         
	//  104  222:iconst_0        
	//  105  223:putfield        #73  <Field boolean Visibility$d.d>
				d1.c = true;
	//  106  226:aload_3         
	//  107  227:iconst_1        
	//  108  228:putfield        #71  <Field boolean Visibility$d.c>
			} else
	//* 109  231:goto            251
			if(d1.a == null)
	//* 110  234:aload_3         
	//* 111  235:getfield        #90  <Field ViewGroup Visibility$d.a>
	//* 112  238:ifnonnull       251
			{
				d1.d = true;
	//  113  241:aload_3         
	//  114  242:iconst_1        
	//  115  243:putfield        #73  <Field boolean Visibility$d.d>
				d1.c = true;
	//  116  246:aload_3         
	//  117  247:iconst_1        
	//  118  248:putfield        #71  <Field boolean Visibility$d.c>
			}
		}
		if(transitionvalues == null)
	//* 119  251:aload_1         
	//* 120  252:ifnonnull       267
		{
			d1.d = true;
	//  121  255:aload_3         
	//  122  256:iconst_1        
	//  123  257:putfield        #73  <Field boolean Visibility$d.d>
			d1.c = true;
	//  124  260:aload_3         
	//  125  261:iconst_1        
	//  126  262:putfield        #71  <Field boolean Visibility$d.c>
			return d1;
	//  127  265:aload_3         
	//  128  266:areturn         
		}
		if(transitionvalues1 == null)
	//* 129  267:aload_2         
	//* 130  268:ifnonnull       281
		{
			d1.d = false;
	//  131  271:aload_3         
	//  132  272:iconst_0        
	//  133  273:putfield        #73  <Field boolean Visibility$d.d>
			d1.c = true;
	//  134  276:aload_3         
	//  135  277:iconst_1        
	//  136  278:putfield        #71  <Field boolean Visibility$d.c>
		}
		return d1;
	//  137  281:aload_3         
	//  138  282:areturn         
	}

	boolean areValuesChanged(TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		if(transitionvalues == null && transitionvalues1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		transitionvalues = ((TransitionValues) (getVisibilityChangeInfo(transitionvalues, transitionvalues1)));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokespecial   #100 <Method Visibility$d getVisibilityChangeInfo(TransitionValues, TransitionValues)>
	//   10   16:astore_1        
		return ((d) (transitionvalues)).c && (((d) (transitionvalues)).b == 0 || ((d) (transitionvalues)).e == 0);
	//   11   17:aload_1         
	//   12   18:getfield        #71  <Field boolean Visibility$d.c>
	//   13   21:ifeq            40
	//   14   24:aload_1         
	//   15   25:getfield        #84  <Field int Visibility$d.b>
	//   16   28:ifeq            38
	//   17   31:aload_1         
	//   18   32:getfield        #93  <Field int Visibility$d.e>
	//   19   35:ifne            40
	//   20   38:iconst_1        
	//   21   39:ireturn         
	//   22   40:iconst_0        
	//   23   41:ireturn         
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #104 <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #104 <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public Animator createAnimator(ViewGroup viewgroup, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		d d1 = getVisibilityChangeInfo(transitionvalues, transitionvalues1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #100 <Method Visibility$d getVisibilityChangeInfo(TransitionValues, TransitionValues)>
	//    4    6:astore          7
		if(d1.c)
	//*   5    8:aload           7
	//*   6   10:getfield        #71  <Field boolean Visibility$d.c>
	//*   7   13:ifeq            163
		{
			boolean flag = false;
	//    8   16:iconst_0        
	//    9   17:istore          4
			if(mTargets.size() > 0 || mTargetIds.size() > 0)
	//*  10   19:aload_0         
	//*  11   20:getfield        #113 <Field ArrayList mTargets>
	//*  12   23:invokevirtual   #118 <Method int ArrayList.size()>
	//*  13   26:ifgt            39
	//*  14   29:aload_0         
	//*  15   30:getfield        #121 <Field ArrayList mTargetIds>
	//*  16   33:invokevirtual   #118 <Method int ArrayList.size()>
	//*  17   36:ifle            98
			{
				View view;
				if(transitionvalues != null)
	//*  18   39:aload_2         
	//*  19   40:ifnull          52
					view = transitionvalues.view;
	//   20   43:aload_2         
	//   21   44:getfield        #36  <Field View TransitionValues.view>
	//   22   47:astore          5
				else
	//*  23   49:goto            55
					view = null;
	//   24   52:aconst_null     
	//   25   53:astore          5
				View view1;
				if(transitionvalues1 != null)
	//*  26   55:aload_3         
	//*  27   56:ifnull          68
					view1 = transitionvalues1.view;
	//   28   59:aload_3         
	//   29   60:getfield        #36  <Field View TransitionValues.view>
	//   30   63:astore          6
				else
	//*  31   65:goto            71
					view1 = null;
	//   32   68:aconst_null     
	//   33   69:astore          6
				if(isValidTarget(view) || isValidTarget(view1))
	//*  34   71:aload_0         
	//*  35   72:aload           5
	//*  36   74:invokevirtual   #125 <Method boolean isValidTarget(View)>
	//*  37   77:ifne            89
	//*  38   80:aload_0         
	//*  39   81:aload           6
	//*  40   83:invokevirtual   #125 <Method boolean isValidTarget(View)>
	//*  41   86:ifeq            95
					flag = true;
	//   42   89:iconst_1        
	//   43   90:istore          4
				else
	//*  44   92:goto            98
					flag = false;
	//   45   95:iconst_0        
	//   46   96:istore          4
			}
			if(flag || d1.a != null || d1.h != null)
	//*  47   98:iload           4
	//*  48  100:ifne            119
	//*  49  103:aload           7
	//*  50  105:getfield        #90  <Field ViewGroup Visibility$d.a>
	//*  51  108:ifnonnull       119
	//*  52  111:aload           7
	//*  53  113:getfield        #96  <Field ViewGroup Visibility$d.h>
	//*  54  116:ifnull          163
				if(d1.d)
	//*  55  119:aload           7
	//*  56  121:getfield        #73  <Field boolean Visibility$d.d>
	//*  57  124:ifeq            145
					return onAppear(viewgroup, transitionvalues, d1.b, transitionvalues1, d1.e);
	//   58  127:aload_0         
	//   59  128:aload_1         
	//   60  129:aload_2         
	//   61  130:aload           7
	//   62  132:getfield        #84  <Field int Visibility$d.b>
	//   63  135:aload_3         
	//   64  136:aload           7
	//   65  138:getfield        #93  <Field int Visibility$d.e>
	//   66  141:invokevirtual   #129 <Method Animator onAppear(ViewGroup, TransitionValues, int, TransitionValues, int)>
	//   67  144:areturn         
				else
					return onDisappear(viewgroup, transitionvalues, d1.b, transitionvalues1, d1.e);
	//   68  145:aload_0         
	//   69  146:aload_1         
	//   70  147:aload_2         
	//   71  148:aload           7
	//   72  150:getfield        #84  <Field int Visibility$d.b>
	//   73  153:aload_3         
	//   74  154:aload           7
	//   75  156:getfield        #93  <Field int Visibility$d.e>
	//   76  159:invokevirtual   #132 <Method Animator onDisappear(ViewGroup, TransitionValues, int, TransitionValues, int)>
	//   77  162:areturn         
		}
		return null;
	//   78  163:aconst_null     
	//   79  164:areturn         
	}

	public String[] getTransitionProperties()
	{
		return sTransitionProperties;
	//    0    0:getstatic       #24  <Field String[] sTransitionProperties>
	//    1    3:areturn         
	}

	public boolean isVisible(TransitionValues transitionvalues)
	{
		if(transitionvalues == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int i = ((Integer)transitionvalues.values.get("android:visibility:visibility")).intValue();
	//    4    6:aload_1         
	//    5    7:getfield        #46  <Field Map TransitionValues.values>
	//    6   10:ldc1            #16  <String "android:visibility:visibility">
	//    7   12:invokeinterface #77  <Method Object Map.get(Object)>
	//    8   17:checkcast       #48  <Class Integer>
	//    9   20:invokevirtual   #80  <Method int Integer.intValue()>
	//   10   23:istore_2        
		transitionvalues = ((TransitionValues) ((View)transitionvalues.values.get("android:visibility:parent")));
	//   11   24:aload_1         
	//   12   25:getfield        #46  <Field Map TransitionValues.values>
	//   13   28:ldc1            #13  <String "android:visibility:parent">
	//   14   30:invokeinterface #77  <Method Object Map.get(Object)>
	//   15   35:checkcast       #38  <Class View>
	//   16   38:astore_1        
		return i == 0 && transitionvalues != null;
	//   17   39:iload_2         
	//   18   40:ifne            49
	//   19   43:aload_1         
	//   20   44:ifnull          49
	//   21   47:iconst_1        
	//   22   48:ireturn         
	//   23   49:iconst_0        
	//   24   50:ireturn         
	}

	public Animator onAppear(ViewGroup viewgroup, TransitionValues transitionvalues, int i, TransitionValues transitionvalues1, int j)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Animator onDisappear(ViewGroup viewgroup, TransitionValues transitionvalues, int i, TransitionValues transitionvalues1, int j)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private static final String PROPNAME_PARENT = "android:visibility:parent";
	private static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
	private static final String sTransitionProperties[] = {
		"android:visibility:visibility", "android:visibility:parent"
	};

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #16  <String "android:visibility:visibility">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #13  <String "android:visibility:parent">
	//    9   13:aastore         
	//   10   14:putstatic       #24  <Field String[] sTransitionProperties>
	//*  11   17:return          
	}
}
