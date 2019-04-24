// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.content.a.c;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Transition, ac, ah, ag, 
//			an, am, au, a

public abstract class Visibility extends Transition
{
	private static class a extends AnimatorListenerAdapter
		implements Transition.c, b.a
	{

		private void a()
		{
			if(!a)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field boolean a>
		//*   2    4:ifne            32
			{
				au.a(b, c);
		//    3    7:aload_0         
		//    4    8:getfield        #29  <Field View b>
		//    5   11:aload_0         
		//    6   12:getfield        #31  <Field int c>
		//    7   15:invokestatic    #52  <Method void au.a(View, int)>
				if(d != null)
		//*   8   18:aload_0         
		//*   9   19:getfield        #41  <Field ViewGroup d>
		//*  10   22:ifnull          32
					d.invalidate();
		//   11   25:aload_0         
		//   12   26:getfield        #41  <Field ViewGroup d>
		//   13   29:invokevirtual   #55  <Method void ViewGroup.invalidate()>
			}
			a(false);
		//   14   32:aload_0         
		//   15   33:iconst_0        
		//   16   34:invokespecial   #46  <Method void a(boolean)>
		//   17   37:return          
		}

		private void a(boolean flag)
		{
			if(e && f != flag && d != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #43  <Field boolean e>
		//*   2    4:ifeq            35
		//*   3    7:aload_0         
		//*   4    8:getfield        #57  <Field boolean f>
		//*   5   11:iload_1         
		//*   6   12:icmpeq          35
		//*   7   15:aload_0         
		//*   8   16:getfield        #41  <Field ViewGroup d>
		//*   9   19:ifnull          35
			{
				f = flag;
		//   10   22:aload_0         
		//   11   23:iload_1         
		//   12   24:putfield        #57  <Field boolean f>
				an.a(d, flag);
		//   13   27:aload_0         
		//   14   28:getfield        #41  <Field ViewGroup d>
		//   15   31:iload_1         
		//   16   32:invokestatic    #62  <Method void an.a(ViewGroup, boolean)>
			}
		//   17   35:return          
		}

		public void a(Transition transition)
		{
			a();
		//    0    0:aload_0         
		//    1    1:invokespecial   #65  <Method void a()>
			transition.b(((Transition.c) (this)));
		//    2    4:aload_1         
		//    3    5:aload_0         
		//    4    6:invokevirtual   #70  <Method Transition Transition.b(Transition$c)>
		//    5    9:pop             
		//    6   10:return          
		}

		public void b(Transition transition)
		{
			a(false);
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:invokespecial   #46  <Method void a(boolean)>
		//    3    5:return          
		}

		public void c(Transition transition)
		{
			a(true);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:invokespecial   #46  <Method void a(boolean)>
		//    3    5:return          
		}

		public void d(Transition transition)
		{
		//    0    0:return          
		}

		public void onAnimationCancel(Animator animator)
		{
			a = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #27  <Field boolean a>
		//    3    5:return          
		}

		public void onAnimationEnd(Animator animator)
		{
			a();
		//    0    0:aload_0         
		//    1    1:invokespecial   #65  <Method void a()>
		//    2    4:return          
		}

		public void onAnimationPause(Animator animator)
		{
			if(!a)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field boolean a>
		//*   2    4:ifne            18
				au.a(b, c);
		//    3    7:aload_0         
		//    4    8:getfield        #29  <Field View b>
		//    5   11:aload_0         
		//    6   12:getfield        #31  <Field int c>
		//    7   15:invokestatic    #52  <Method void au.a(View, int)>
		//    8   18:return          
		}

		public void onAnimationRepeat(Animator animator)
		{
		//    0    0:return          
		}

		public void onAnimationResume(Animator animator)
		{
			if(!a)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field boolean a>
		//*   2    4:ifne            15
				au.a(b, 0);
		//    3    7:aload_0         
		//    4    8:getfield        #29  <Field View b>
		//    5   11:iconst_0        
		//    6   12:invokestatic    #52  <Method void au.a(View, int)>
		//    7   15:return          
		}

		public void onAnimationStart(Animator animator)
		{
		//    0    0:return          
		}

		boolean a;
		private final View b;
		private final int c;
		private final ViewGroup d;
		private final boolean e;
		private boolean f;

		a(View view, int i, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void AnimatorListenerAdapter()>
			a = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #27  <Field boolean a>
			b = view;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #29  <Field View b>
			c = i;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #31  <Field int c>
			d = (ViewGroup)view.getParent();
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:invokevirtual   #37  <Method android.view.ViewParent View.getParent()>
		//   14   24:checkcast       #39  <Class ViewGroup>
		//   15   27:putfield        #41  <Field ViewGroup d>
			e = flag;
		//   16   30:aload_0         
		//   17   31:iload_3         
		//   18   32:putfield        #43  <Field boolean e>
			a(true);
		//   19   35:aload_0         
		//   20   36:iconst_1        
		//   21   37:invokespecial   #46  <Method void a(boolean)>
		//   22   40:return          
		}
	}

	private static class b
	{

		boolean a;
		boolean b;
		int c;
		int d;
		ViewGroup e;
		ViewGroup f;

		private b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}

	}


	public Visibility()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Transition()>
		h = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #32  <Field int h>
	//    5    9:return          
	}

	public Visibility(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #35  <Method void Transition(Context, AttributeSet)>
		h = 3;
	//    4    6:aload_0         
	//    5    7:iconst_3        
	//    6    8:putfield        #32  <Field int h>
		context = ((Context) (context.obtainStyledAttributes(attributeset, ac.e)));
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:getstatic       #41  <Field int[] ac.e>
	//   10   16:invokevirtual   #47  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   11   19:astore_1        
		int i = c.a(((TypedArray) (context)), ((org.xmlpull.v1.XmlPullParser) ((XmlResourceParser)attributeset)), "transitionVisibilityMode", 0, 0);
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:checkcast       #49  <Class XmlResourceParser>
	//   15   25:ldc1            #51  <String "transitionVisibilityMode">
	//   16   27:iconst_0        
	//   17   28:iconst_0        
	//   18   29:invokestatic    #56  <Method int c.a(TypedArray, org.xmlpull.v1.XmlPullParser, String, int, int)>
	//   19   32:istore_3        
		((TypedArray) (context)).recycle();
	//   20   33:aload_1         
	//   21   34:invokevirtual   #61  <Method void TypedArray.recycle()>
		if(i != 0)
	//*  22   37:iload_3         
	//*  23   38:ifeq            46
			b(i);
	//   24   41:aload_0         
	//   25   42:iload_3         
	//   26   43:invokevirtual   #64  <Method void b(int)>
	//   27   46:return          
	}

	private b b(ah ah1, ah ah2)
	{
		b b1;
		ViewGroup viewgroup = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		b1 = new b();
	//    2    2:new             #11  <Class Visibility$b>
	//    3    5:dup             
	//    4    6:aconst_null     
	//    5    7:invokespecial   #68  <Method void Visibility$b(Visibility$1)>
	//    6   10:astore          4
		b1.a = false;
	//    7   12:aload           4
	//    8   14:iconst_0        
	//    9   15:putfield        #71  <Field boolean Visibility$b.a>
		b1.b = false;
	//   10   18:aload           4
	//   11   20:iconst_0        
	//   12   21:putfield        #73  <Field boolean Visibility$b.b>
		if(ah1 != null && ah1.a.containsKey("android:visibility:visibility"))
	//*  13   24:aload_1         
	//*  14   25:ifnull          86
	//*  15   28:aload_1         
	//*  16   29:getfield        #78  <Field Map ah.a>
	//*  17   32:ldc1            #22  <String "android:visibility:visibility">
	//*  18   34:invokeinterface #84  <Method boolean Map.containsKey(Object)>
	//*  19   39:ifeq            86
		{
			b1.c = ((Integer)ah1.a.get("android:visibility:visibility")).intValue();
	//   20   42:aload           4
	//   21   44:aload_1         
	//   22   45:getfield        #78  <Field Map ah.a>
	//   23   48:ldc1            #22  <String "android:visibility:visibility">
	//   24   50:invokeinterface #88  <Method Object Map.get(Object)>
	//   25   55:checkcast       #90  <Class Integer>
	//   26   58:invokevirtual   #94  <Method int Integer.intValue()>
	//   27   61:putfield        #97  <Field int android.support.transition.Visibility$b.c>
			b1.e = (ViewGroup)ah1.a.get("android:visibility:parent");
	//   28   64:aload           4
	//   29   66:aload_1         
	//   30   67:getfield        #78  <Field Map ah.a>
	//   31   70:ldc1            #24  <String "android:visibility:parent">
	//   32   72:invokeinterface #88  <Method Object Map.get(Object)>
	//   33   77:checkcast       #99  <Class ViewGroup>
	//   34   80:putfield        #102 <Field ViewGroup Visibility$b.e>
		} else
	//*  35   83:goto            98
		{
			b1.c = -1;
	//   36   86:aload           4
	//   37   88:iconst_m1       
	//   38   89:putfield        #97  <Field int android.support.transition.Visibility$b.c>
			b1.e = null;
	//   39   92:aload           4
	//   40   94:aconst_null     
	//   41   95:putfield        #102 <Field ViewGroup Visibility$b.e>
		}
		if(ah2 != null && ah2.a.containsKey("android:visibility:visibility"))
	//*  42   98:aload_2         
	//*  43   99:ifnull          156
	//*  44  102:aload_2         
	//*  45  103:getfield        #78  <Field Map ah.a>
	//*  46  106:ldc1            #22  <String "android:visibility:visibility">
	//*  47  108:invokeinterface #84  <Method boolean Map.containsKey(Object)>
	//*  48  113:ifeq            156
		{
			b1.d = ((Integer)ah2.a.get("android:visibility:visibility")).intValue();
	//   49  116:aload           4
	//   50  118:aload_2         
	//   51  119:getfield        #78  <Field Map ah.a>
	//   52  122:ldc1            #22  <String "android:visibility:visibility">
	//   53  124:invokeinterface #88  <Method Object Map.get(Object)>
	//   54  129:checkcast       #90  <Class Integer>
	//   55  132:invokevirtual   #94  <Method int Integer.intValue()>
	//   56  135:putfield        #105 <Field int Visibility$b.d>
			viewgroup = (ViewGroup)ah2.a.get("android:visibility:parent");
	//   57  138:aload_2         
	//   58  139:getfield        #78  <Field Map ah.a>
	//   59  142:ldc1            #24  <String "android:visibility:parent">
	//   60  144:invokeinterface #88  <Method Object Map.get(Object)>
	//   61  149:checkcast       #99  <Class ViewGroup>
	//   62  152:astore_3        
		} else
	//*  63  153:goto            162
		{
			b1.d = -1;
	//   64  156:aload           4
	//   65  158:iconst_m1       
	//   66  159:putfield        #105 <Field int Visibility$b.d>
		}
		b1.f = viewgroup;
	//   67  162:aload           4
	//   68  164:aload_3         
	//   69  165:putfield        #108 <Field ViewGroup Visibility$b.f>
		if(ah1 == null || ah2 == null) goto _L2; else goto _L1
	//   70  168:aload_1         
	//   71  169:ifnull          262
	//   72  172:aload_2         
	//   73  173:ifnull          262
_L1:
		if(b1.c == b1.d && b1.e == b1.f)
	//*  74  176:aload           4
	//*  75  178:getfield        #97  <Field int android.support.transition.Visibility$b.c>
	//*  76  181:aload           4
	//*  77  183:getfield        #105 <Field int Visibility$b.d>
	//*  78  186:icmpne          205
	//*  79  189:aload           4
	//*  80  191:getfield        #102 <Field ViewGroup Visibility$b.e>
	//*  81  194:aload           4
	//*  82  196:getfield        #108 <Field ViewGroup Visibility$b.f>
	//*  83  199:if_acmpne       205
			return b1;
	//   84  202:aload           4
	//   85  204:areturn         
		if(b1.c == b1.d) goto _L4; else goto _L3
	//   86  205:aload           4
	//   87  207:getfield        #97  <Field int android.support.transition.Visibility$b.c>
	//   88  210:aload           4
	//   89  212:getfield        #105 <Field int Visibility$b.d>
	//   90  215:icmpeq          240
_L3:
		if(b1.c != 0) goto _L6; else goto _L5
	//   91  218:aload           4
	//   92  220:getfield        #97  <Field int android.support.transition.Visibility$b.c>
	//   93  223:ifne            229
	//*  94  226:goto            301
_L6:
		if(b1.d != 0) goto _L8; else goto _L7
	//   95  229:aload           4
	//   96  231:getfield        #105 <Field int Visibility$b.d>
	//   97  234:ifne            310
	//*  98  237:goto            274
_L4:
		if(b1.f != null) goto _L9; else goto _L5
	//   99  240:aload           4
	//  100  242:getfield        #108 <Field ViewGroup Visibility$b.f>
	//  101  245:ifnonnull       251
	//* 102  248:goto            301
_L9:
		if(b1.e != null) goto _L8; else goto _L7
	//  103  251:aload           4
	//  104  253:getfield        #102 <Field ViewGroup Visibility$b.e>
	//  105  256:ifnonnull       310
	//* 106  259:goto            274
_L2:
		if(ah1 != null || b1.d != 0) goto _L10; else goto _L7
	//  107  262:aload_1         
	//  108  263:ifnonnull       289
	//  109  266:aload           4
	//  110  268:getfield        #105 <Field int Visibility$b.d>
	//  111  271:ifne            289
_L7:
		b1.b = true;
	//  112  274:aload           4
	//  113  276:iconst_1        
	//  114  277:putfield        #73  <Field boolean Visibility$b.b>
_L11:
		b1.a = true;
	//  115  280:aload           4
	//  116  282:iconst_1        
	//  117  283:putfield        #71  <Field boolean Visibility$b.a>
		return b1;
	//  118  286:aload           4
	//  119  288:areturn         
_L10:
		if(ah2 != null || b1.c != 0)
			break; /* Loop/switch isn't completed */
	//  120  289:aload_2         
	//  121  290:ifnonnull       310
	//  122  293:aload           4
	//  123  295:getfield        #97  <Field int android.support.transition.Visibility$b.c>
	//  124  298:ifne            310
_L5:
		b1.b = false;
	//  125  301:aload           4
	//  126  303:iconst_0        
	//  127  304:putfield        #73  <Field boolean Visibility$b.b>
		if(true) goto _L11; else goto _L8
	//  128  307:goto            280
_L8:
		return b1;
	//  129  310:aload           4
	//  130  312:areturn         
	}

	private void d(ah ah1)
	{
		int i = ah1.b.getVisibility();
	//    0    0:aload_1         
	//    1    1:getfield        #112 <Field View ah.b>
	//    2    4:invokevirtual   #117 <Method int View.getVisibility()>
	//    3    7:istore_2        
		ah1.a.put("android:visibility:visibility", ((Object) (Integer.valueOf(i))));
	//    4    8:aload_1         
	//    5    9:getfield        #78  <Field Map ah.a>
	//    6   12:ldc1            #22  <String "android:visibility:visibility">
	//    7   14:iload_2         
	//    8   15:invokestatic    #121 <Method Integer Integer.valueOf(int)>
	//    9   18:invokeinterface #125 <Method Object Map.put(Object, Object)>
	//   10   23:pop             
		ah1.a.put("android:visibility:parent", ((Object) (ah1.b.getParent())));
	//   11   24:aload_1         
	//   12   25:getfield        #78  <Field Map ah.a>
	//   13   28:ldc1            #24  <String "android:visibility:parent">
	//   14   30:aload_1         
	//   15   31:getfield        #112 <Field View ah.b>
	//   16   34:invokevirtual   #129 <Method android.view.ViewParent View.getParent()>
	//   17   37:invokeinterface #125 <Method Object Map.put(Object, Object)>
	//   18   42:pop             
		int ai[] = new int[2];
	//   19   43:iconst_2        
	//   20   44:newarray        int[]
	//   21   46:astore_3        
		ah1.b.getLocationOnScreen(ai);
	//   22   47:aload_1         
	//   23   48:getfield        #112 <Field View ah.b>
	//   24   51:aload_3         
	//   25   52:invokevirtual   #133 <Method void View.getLocationOnScreen(int[])>
		ah1.a.put("android:visibility:screenLocation", ((Object) (ai)));
	//   26   55:aload_1         
	//   27   56:getfield        #78  <Field Map ah.a>
	//   28   59:ldc1            #135 <String "android:visibility:screenLocation">
	//   29   61:aload_3         
	//   30   62:invokeinterface #125 <Method Object Map.put(Object, Object)>
	//   31   67:pop             
	//   32   68:return          
	}

	public Animator a(ViewGroup viewgroup, ah ah1, int i, ah ah2, int j)
	{
		if((h & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field int h>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          74
		{
			if(ah2 == null)
	//*   6   10:aload           4
	//*   7   12:ifnonnull       17
				return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
			if(ah1 == null)
	//*  10   17:aload_2         
	//*  11   18:ifnonnull       60
			{
				View view = (View)ah2.b.getParent();
	//   12   21:aload           4
	//   13   23:getfield        #112 <Field View ah.b>
	//   14   26:invokevirtual   #129 <Method android.view.ViewParent View.getParent()>
	//   15   29:checkcast       #114 <Class View>
	//   16   32:astore          6
				if(b(b(view, false), a(view, false)).a)
	//*  17   34:aload_0         
	//*  18   35:aload_0         
	//*  19   36:aload           6
	//*  20   38:iconst_0        
	//*  21   39:invokevirtual   #139 <Method ah b(View, boolean)>
	//*  22   42:aload_0         
	//*  23   43:aload           6
	//*  24   45:iconst_0        
	//*  25   46:invokevirtual   #141 <Method ah a(View, boolean)>
	//*  26   49:invokespecial   #143 <Method Visibility$b b(ah, ah)>
	//*  27   52:getfield        #71  <Field boolean Visibility$b.a>
	//*  28   55:ifeq            60
					return null;
	//   29   58:aconst_null     
	//   30   59:areturn         
			}
			return a(viewgroup, ah2.b, ah1, ah2);
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:aload           4
	//   34   64:getfield        #112 <Field View ah.b>
	//   35   67:aload_2         
	//   36   68:aload           4
	//   37   70:invokevirtual   #146 <Method Animator a(ViewGroup, View, ah, ah)>
	//   38   73:areturn         
		} else
		{
			return null;
	//   39   74:aconst_null     
	//   40   75:areturn         
		}
	}

	public Animator a(ViewGroup viewgroup, ah ah1, ah ah2)
	{
		b b1 = b(ah1, ah2);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #143 <Method Visibility$b b(ah, ah)>
	//    4    6:astore          4
		if(b1.a && (b1.e != null || b1.f != null))
	//*   5    8:aload           4
	//*   6   10:getfield        #71  <Field boolean Visibility$b.a>
	//*   7   13:ifeq            76
	//*   8   16:aload           4
	//*   9   18:getfield        #102 <Field ViewGroup Visibility$b.e>
	//*  10   21:ifnonnull       32
	//*  11   24:aload           4
	//*  12   26:getfield        #108 <Field ViewGroup Visibility$b.f>
	//*  13   29:ifnull          76
		{
			if(b1.b)
	//*  14   32:aload           4
	//*  15   34:getfield        #73  <Field boolean Visibility$b.b>
	//*  16   37:ifeq            58
				return a(viewgroup, ah1, b1.c, ah2, b1.d);
	//   17   40:aload_0         
	//   18   41:aload_1         
	//   19   42:aload_2         
	//   20   43:aload           4
	//   21   45:getfield        #97  <Field int android.support.transition.Visibility$b.c>
	//   22   48:aload_3         
	//   23   49:aload           4
	//   24   51:getfield        #105 <Field int Visibility$b.d>
	//   25   54:invokevirtual   #149 <Method Animator a(ViewGroup, ah, int, ah, int)>
	//   26   57:areturn         
			else
				return b(viewgroup, ah1, b1.c, ah2, b1.d);
	//   27   58:aload_0         
	//   28   59:aload_1         
	//   29   60:aload_2         
	//   30   61:aload           4
	//   31   63:getfield        #97  <Field int android.support.transition.Visibility$b.c>
	//   32   66:aload_3         
	//   33   67:aload           4
	//   34   69:getfield        #105 <Field int Visibility$b.d>
	//   35   72:invokevirtual   #151 <Method Animator b(ViewGroup, ah, int, ah, int)>
	//   36   75:areturn         
		} else
		{
			return null;
	//   37   76:aconst_null     
	//   38   77:areturn         
		}
	}

	public Animator a(ViewGroup viewgroup, View view, ah ah1, ah ah2)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void a(ah ah1)
	{
		d(ah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #153 <Method void d(ah)>
	//    3    5:return          
	}

	public boolean a(ah ah1, ah ah2)
	{
		boolean flag;
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
			if(ah1 == null && ah2 == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       13
	//*   4    7:aload_2         
	//*   5    8:ifnonnull       13
				return false;
	//    6   11:iconst_0        
	//    7   12:ireturn         
			if(ah1 != null && ah2 != null && ah2.a.containsKey("android:visibility:visibility") != ah1.a.containsKey("android:visibility:visibility"))
	//*   8   13:aload_1         
	//*   9   14:ifnull          48
	//*  10   17:aload_2         
	//*  11   18:ifnull          48
	//*  12   21:aload_2         
	//*  13   22:getfield        #78  <Field Map ah.a>
	//*  14   25:ldc1            #22  <String "android:visibility:visibility">
	//*  15   27:invokeinterface #84  <Method boolean Map.containsKey(Object)>
	//*  16   32:aload_1         
	//*  17   33:getfield        #78  <Field Map ah.a>
	//*  18   36:ldc1            #22  <String "android:visibility:visibility">
	//*  19   38:invokeinterface #84  <Method boolean Map.containsKey(Object)>
	//*  20   43:icmpeq          48
				return false;
	//   21   46:iconst_0        
	//   22   47:ireturn         
			ah1 = ((ah) (b(ah1, ah2)));
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:aload_2         
	//   26   51:invokespecial   #143 <Method Visibility$b b(ah, ah)>
	//   27   54:astore_1        
			flag = flag1;
	//   28   55:iload           4
	//   29   57:istore_3        
			if(!((b) (ah1)).a)
				break label0;
	//   30   58:aload_1         
	//   31   59:getfield        #71  <Field boolean Visibility$b.a>
	//   32   62:ifeq            84
			if(((b) (ah1)).c != 0)
	//*  33   65:aload_1         
	//*  34   66:getfield        #97  <Field int android.support.transition.Visibility$b.c>
	//*  35   69:ifeq            82
			{
				flag = flag1;
	//   36   72:iload           4
	//   37   74:istore_3        
				if(((b) (ah1)).d != 0)
					break label0;
	//   38   75:aload_1         
	//   39   76:getfield        #105 <Field int Visibility$b.d>
	//   40   79:ifne            84
			}
			flag = true;
	//   41   82:iconst_1        
	//   42   83:istore_3        
		}
		return flag;
	//   43   84:iload_3         
	//   44   85:ireturn         
	}

	public String[] a()
	{
		return g;
	//    0    0:getstatic       #26  <Field String[] g>
	//    1    3:areturn         
	}

	public Animator b(ViewGroup viewgroup, ah ah1, int i, ah ah2, int j)
	{
		Object obj1;
		View view;
		if((h & 2) != 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field int h>
	//*   2    4:iconst_2        
	//*   3    5:iand            
	//*   4    6:iconst_2        
	//*   5    7:icmpeq          12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		if(ah1 != null)
	//*   8   12:aload_2         
	//*   9   13:ifnull          25
			view = ah1.b;
	//   10   16:aload_2         
	//   11   17:getfield        #112 <Field View ah.b>
	//   12   20:astore          8
		else
	//*  13   22:goto            28
			view = null;
	//   14   25:aconst_null     
	//   15   26:astore          8
		if(ah2 != null)
	//*  16   28:aload           4
	//*  17   30:ifnull          43
			obj1 = ((Object) (ah2.b));
	//   18   33:aload           4
	//   19   35:getfield        #112 <Field View ah.b>
	//   20   38:astore          7
		else
	//*  21   40:goto            46
			obj1 = null;
	//   22   43:aconst_null     
	//   23   44:astore          7
		if(obj1 != null && ((View) (obj1)).getParent() != null) goto _L2; else goto _L1
	//   24   46:aload           7
	//   25   48:ifnull          88
	//   26   51:aload           7
	//   27   53:invokevirtual   #129 <Method android.view.ViewParent View.getParent()>
	//   28   56:ifnonnull       62
	//*  29   59:goto            88
_L2:
		if(j != 4) goto _L4; else goto _L3
	//   30   62:iload           5
	//   31   64:iconst_4        
	//   32   65:icmpne          71
	//*  33   68:goto            82
_L4:
		Object obj = ((Object) (view));
	//   34   71:aload           8
	//   35   73:astore          6
		if(view != obj1) goto _L5; else goto _L3
	//   36   75:aload           8
	//   37   77:aload           7
	//   38   79:if_acmpne       97
_L3:
		obj = null;
	//   39   82:aconst_null     
	//   40   83:astore          6
		break MISSING_BLOCK_LABEL_235;
	//   41   85:goto            235
_L1:
		if(obj1 == null) goto _L7; else goto _L6
	//   42   88:aload           7
	//   43   90:ifnull          103
_L6:
		obj = obj1;
	//   44   93:aload           7
	//   45   95:astore          6
_L5:
		obj1 = null;
	//   46   97:aconst_null     
	//   47   98:astore          7
		break MISSING_BLOCK_LABEL_235;
	//   48  100:goto            235
_L7:
		if(view == null)
			break; /* Loop/switch isn't completed */
	//   49  103:aload           8
	//   50  105:ifnull          228
		if(view.getParent() == null)
	//*  51  108:aload           8
	//*  52  110:invokevirtual   #129 <Method android.view.ViewParent View.getParent()>
	//*  53  113:ifnonnull       123
		{
			obj = ((Object) (view));
	//   54  116:aload           8
	//   55  118:astore          6
			continue; /* Loop/switch isn't completed */
	//   56  120:goto            97
		}
		if(!(view.getParent() instanceof View))
			break; /* Loop/switch isn't completed */
	//   57  123:aload           8
	//   58  125:invokevirtual   #129 <Method android.view.ViewParent View.getParent()>
	//   59  128:instanceof      #114 <Class View>
	//   60  131:ifeq            228
		obj = ((Object) ((View)view.getParent()));
	//   61  134:aload           8
	//   62  136:invokevirtual   #129 <Method android.view.ViewParent View.getParent()>
	//   63  139:checkcast       #114 <Class View>
	//   64  142:astore          6
		if(!b(a(((View) (obj)), true), b(((View) (obj)), true)).a)
	//*  65  144:aload_0         
	//*  66  145:aload_0         
	//*  67  146:aload           6
	//*  68  148:iconst_1        
	//*  69  149:invokevirtual   #141 <Method ah a(View, boolean)>
	//*  70  152:aload_0         
	//*  71  153:aload           6
	//*  72  155:iconst_1        
	//*  73  156:invokevirtual   #139 <Method ah b(View, boolean)>
	//*  74  159:invokespecial   #143 <Method Visibility$b b(ah, ah)>
	//*  75  162:getfield        #71  <Field boolean Visibility$b.a>
	//*  76  165:ifne            181
		{
			obj = ((Object) (ag.a(viewgroup, view, ((View) (obj)))));
	//   77  168:aload_1         
	//   78  169:aload           8
	//   79  171:aload           6
	//   80  173:invokestatic    #160 <Method View ag.a(ViewGroup, View, View)>
	//   81  176:astore          6
			continue; /* Loop/switch isn't completed */
	//   82  178:goto            97
		}
		if(((View) (obj)).getParent() == null)
	//*  83  181:aload           6
	//*  84  183:invokevirtual   #129 <Method android.view.ViewParent View.getParent()>
	//*  85  186:ifnonnull       222
		{
			i = ((View) (obj)).getId();
	//   86  189:aload           6
	//   87  191:invokevirtual   #163 <Method int View.getId()>
	//   88  194:istore_3        
			if(i != -1 && viewgroup.findViewById(i) != null && e)
	//*  89  195:iload_3         
	//*  90  196:iconst_m1       
	//*  91  197:icmpeq          222
	//*  92  200:aload_1         
	//*  93  201:iload_3         
	//*  94  202:invokevirtual   #167 <Method View ViewGroup.findViewById(int)>
	//*  95  205:ifnull          222
	//*  96  208:aload_0         
	//*  97  209:getfield        #169 <Field boolean e>
	//*  98  212:ifeq            222
			{
				obj = ((Object) (view));
	//   99  215:aload           8
	//  100  217:astore          6
				continue; /* Loop/switch isn't completed */
	//  101  219:goto            97
			}
		}
		obj = null;
	//  102  222:aconst_null     
	//  103  223:astore          6
		if(true) goto _L5; else goto _L8
	//  104  225:goto            97
_L8:
		obj = null;
	//  105  228:aconst_null     
	//  106  229:astore          6
		obj1 = obj;
	//  107  231:aload           6
	//  108  233:astore          7
		if(obj != null && ah1 != null)
	//* 109  235:aload           6
	//* 110  237:ifnull          376
	//* 111  240:aload_2         
	//* 112  241:ifnull          376
		{
			obj1 = ((Object) ((int[])ah1.a.get("android:visibility:screenLocation")));
	//  113  244:aload_2         
	//  114  245:getfield        #78  <Field Map ah.a>
	//  115  248:ldc1            #135 <String "android:visibility:screenLocation">
	//  116  250:invokeinterface #88  <Method Object Map.get(Object)>
	//  117  255:checkcast       #170 <Class int[]>
	//  118  258:astore          7
			i = obj1[0];
	//  119  260:aload           7
	//  120  262:iconst_0        
	//  121  263:iaload          
	//  122  264:istore_3        
			j = obj1[1];
	//  123  265:aload           7
	//  124  267:iconst_1        
	//  125  268:iaload          
	//  126  269:istore          5
			obj1 = ((Object) (new int[2]));
	//  127  271:iconst_2        
	//  128  272:newarray        int[]
	//  129  274:astore          7
			viewgroup.getLocationOnScreen(((int []) (obj1)));
	//  130  276:aload_1         
	//  131  277:aload           7
	//  132  279:invokevirtual   #171 <Method void ViewGroup.getLocationOnScreen(int[])>
			((View) (obj)).offsetLeftAndRight(i - obj1[0] - ((View) (obj)).getLeft());
	//  133  282:aload           6
	//  134  284:iload_3         
	//  135  285:aload           7
	//  136  287:iconst_0        
	//  137  288:iaload          
	//  138  289:isub            
	//  139  290:aload           6
	//  140  292:invokevirtual   #174 <Method int View.getLeft()>
	//  141  295:isub            
	//  142  296:invokevirtual   #177 <Method void View.offsetLeftAndRight(int)>
			((View) (obj)).offsetTopAndBottom(j - obj1[1] - ((View) (obj)).getTop());
	//  143  299:aload           6
	//  144  301:iload           5
	//  145  303:aload           7
	//  146  305:iconst_1        
	//  147  306:iaload          
	//  148  307:isub            
	//  149  308:aload           6
	//  150  310:invokevirtual   #180 <Method int View.getTop()>
	//  151  313:isub            
	//  152  314:invokevirtual   #183 <Method void View.offsetTopAndBottom(int)>
			obj1 = ((Object) (an.a(viewgroup)));
	//  153  317:aload_1         
	//  154  318:invokestatic    #188 <Method am an.a(ViewGroup)>
	//  155  321:astore          7
			((am) (obj1)).a(((View) (obj)));
	//  156  323:aload           7
	//  157  325:aload           6
	//  158  327:invokeinterface #193 <Method void am.a(View)>
			viewgroup = ((ViewGroup) (b(viewgroup, ((View) (obj)), ah1, ah2)));
	//  159  332:aload_0         
	//  160  333:aload_1         
	//  161  334:aload           6
	//  162  336:aload_2         
	//  163  337:aload           4
	//  164  339:invokevirtual   #195 <Method Animator b(ViewGroup, View, ah, ah)>
	//  165  342:astore_1        
			if(viewgroup == null)
	//* 166  343:aload_1         
	//* 167  344:ifnonnull       358
			{
				((am) (obj1)).b(((View) (obj)));
	//  168  347:aload           7
	//  169  349:aload           6
	//  170  351:invokeinterface #197 <Method void am.b(View)>
				return ((Animator) (viewgroup));
	//  171  356:aload_1         
	//  172  357:areturn         
			} else
			{
				((Animator) (viewgroup)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter(((am) (obj1)), ((View) (obj))) {

					public void onAnimationEnd(Animator animator)
					{
						a.b(b);
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field am a>
					//    2    4:aload_0         
					//    3    5:getfield        #22  <Field View b>
					//    4    8:invokeinterface #33  <Method void am.b(View)>
					//    5   13:return          
					}

					final am a;
					final View b;
					final Visibility c;

			
			{
				c = Visibility.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Visibility c>
				a = am1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field am a>
				b = view;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #22  <Field View b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #25  <Method void AnimatorListenerAdapter()>
			//   11   19:return          
			}
				}
)));
	//  173  358:aload_1         
	//  174  359:new             #6   <Class Visibility$1>
	//  175  362:dup             
	//  176  363:aload_0         
	//  177  364:aload           7
	//  178  366:aload           6
	//  179  368:invokespecial   #200 <Method void Visibility$1(Visibility, am, View)>
	//  180  371:invokevirtual   #206 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
				return ((Animator) (viewgroup));
	//  181  374:aload_1         
	//  182  375:areturn         
			}
		}
		if(obj1 != null)
	//* 183  376:aload           7
	//* 184  378:ifnull          447
		{
			i = ((View) (obj1)).getVisibility();
	//  185  381:aload           7
	//  186  383:invokevirtual   #117 <Method int View.getVisibility()>
	//  187  386:istore_3        
			au.a(((View) (obj1)), 0);
	//  188  387:aload           7
	//  189  389:iconst_0        
	//  190  390:invokestatic    #211 <Method void au.a(View, int)>
			viewgroup = ((ViewGroup) (b(viewgroup, ((View) (obj1)), ah1, ah2)));
	//  191  393:aload_0         
	//  192  394:aload_1         
	//  193  395:aload           7
	//  194  397:aload_2         
	//  195  398:aload           4
	//  196  400:invokevirtual   #195 <Method Animator b(ViewGroup, View, ah, ah)>
	//  197  403:astore_1        
			if(viewgroup != null)
	//* 198  404:aload_1         
	//* 199  405:ifnull          439
			{
				ah1 = ((ah) (new a(((View) (obj1)), j, true)));
	//  200  408:new             #8   <Class Visibility$a>
	//  201  411:dup             
	//  202  412:aload           7
	//  203  414:iload           5
	//  204  416:iconst_1        
	//  205  417:invokespecial   #214 <Method void Visibility$a(View, int, boolean)>
	//  206  420:astore_2        
				((Animator) (viewgroup)).addListener(((android.animation.Animator.AnimatorListener) (ah1)));
	//  207  421:aload_1         
	//  208  422:aload_2         
	//  209  423:invokevirtual   #206 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
				android.support.transition.a.a(((Animator) (viewgroup)), ((AnimatorListenerAdapter) (ah1)));
	//  210  426:aload_1         
	//  211  427:aload_2         
	//  212  428:invokestatic    #219 <Method void a.a(Animator, AnimatorListenerAdapter)>
				a(((Transition.c) (ah1)));
	//  213  431:aload_0         
	//  214  432:aload_2         
	//  215  433:invokevirtual   #222 <Method Transition a(Transition$c)>
	//  216  436:pop             
				return ((Animator) (viewgroup));
	//  217  437:aload_1         
	//  218  438:areturn         
			} else
			{
				au.a(((View) (obj1)), i);
	//  219  439:aload           7
	//  220  441:iload_3         
	//  221  442:invokestatic    #211 <Method void au.a(View, int)>
				return ((Animator) (viewgroup));
	//  222  445:aload_1         
	//  223  446:areturn         
			}
		} else
		{
			return null;
	//  224  447:aconst_null     
	//  225  448:areturn         
		}
	}

	public Animator b(ViewGroup viewgroup, View view, ah ah1, ah ah2)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void b(int i)
	{
		if((i & -4) != 0)
	//*   0    0:iload_1         
	//*   1    1:bipush          -4
	//*   2    3:iand            
	//*   3    4:ifeq            17
		{
			throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
	//    4    7:new             #224 <Class IllegalArgumentException>
	//    5   10:dup             
	//    6   11:ldc1            #226 <String "Only MODE_IN and MODE_OUT flags are allowed">
	//    7   13:invokespecial   #229 <Method void IllegalArgumentException(String)>
	//    8   16:athrow          
		} else
		{
			h = i;
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:putfield        #32  <Field int h>
			return;
	//   12   22:return          
		}
	}

	public void b(ah ah1)
	{
		d(ah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #153 <Method void d(ah)>
	//    3    5:return          
	}

	public int l()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int h>
	//    2    4:ireturn         
	}

	private static final String g[] = {
		"android:visibility:visibility", "android:visibility:parent"
	};
	private int h;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #22  <String "android:visibility:visibility">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #24  <String "android:visibility:parent">
	//    9   13:aastore         
	//   10   14:putstatic       #26  <Field String[] g>
	//*  11   17:return          
	}
}
