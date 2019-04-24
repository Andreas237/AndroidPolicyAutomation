// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.v4.content.a.c;
import android.support.v4.f.a;
import android.support.v4.f.f;
import android.support.v4.view.s;
import android.util.*;
import android.view.*;
import android.view.animation.AnimationUtils;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.*;

// Referenced classes of package android.support.transition:
//			ai, ac, ah, TransitionSet, 
//			au, af, a, PathMotion, 
//			be

public abstract class Transition
	implements Cloneable
{
	private static class a
	{

		View a;
		String b;
		ah c;
		be d;
		Transition e;

		a(View view, String s1, Transition transition, be be, ah ah1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			a = view;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field View a>
			b = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field String b>
			c = ah1;
		//    8   14:aload_0         
		//    9   15:aload           5
		//   10   17:putfield        #27  <Field ah c>
			d = be;
		//   11   20:aload_0         
		//   12   21:aload           4
		//   13   23:putfield        #29  <Field be d>
			e = transition;
		//   14   26:aload_0         
		//   15   27:aload_3         
		//   16   28:putfield        #31  <Field Transition e>
		//   17   31:return          
		}
	}

	public static abstract class b
	{

		public abstract Rect a(Transition transition);
	}

	public static interface c
	{

		public abstract void a(Transition transition);

		public abstract void b(Transition transition);

		public abstract void c(Transition transition);

		public abstract void d(Transition transition);
	}


	public Transition()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void Object()>
		i = ((Object)this).getClass().getName();
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #96  <Method Class Object.getClass()>
	//    5    9:invokevirtual   #102 <Method String Class.getName()>
	//    6   12:putfield        #104 <Field String i>
		j = -1L;
	//    7   15:aload_0         
	//    8   16:ldc2w           #105 <Long -1L>
	//    9   19:putfield        #108 <Field long j>
		a = -1L;
	//   10   22:aload_0         
	//   11   23:ldc2w           #105 <Long -1L>
	//   12   26:putfield        #110 <Field long a>
		k = null;
	//   13   29:aload_0         
	//   14   30:aconst_null     
	//   15   31:putfield        #112 <Field TimeInterpolator k>
		b = new ArrayList();
	//   16   34:aload_0         
	//   17   35:new             #114 <Class ArrayList>
	//   18   38:dup             
	//   19   39:invokespecial   #115 <Method void ArrayList()>
	//   20   42:putfield        #117 <Field ArrayList b>
		c = new ArrayList();
	//   21   45:aload_0         
	//   22   46:new             #114 <Class ArrayList>
	//   23   49:dup             
	//   24   50:invokespecial   #115 <Method void ArrayList()>
	//   25   53:putfield        #119 <Field ArrayList c>
		l = null;
	//   26   56:aload_0         
	//   27   57:aconst_null     
	//   28   58:putfield        #121 <Field ArrayList l>
		m = null;
	//   29   61:aload_0         
	//   30   62:aconst_null     
	//   31   63:putfield        #123 <Field ArrayList m>
		n = null;
	//   32   66:aload_0         
	//   33   67:aconst_null     
	//   34   68:putfield        #125 <Field ArrayList n>
		o = null;
	//   35   71:aload_0         
	//   36   72:aconst_null     
	//   37   73:putfield        #127 <Field ArrayList o>
		p = null;
	//   38   76:aload_0         
	//   39   77:aconst_null     
	//   40   78:putfield        #129 <Field ArrayList p>
		q = null;
	//   41   81:aload_0         
	//   42   82:aconst_null     
	//   43   83:putfield        #131 <Field ArrayList q>
		r = null;
	//   44   86:aload_0         
	//   45   87:aconst_null     
	//   46   88:putfield        #133 <Field ArrayList r>
		s = null;
	//   47   91:aload_0         
	//   48   92:aconst_null     
	//   49   93:putfield        #135 <Field ArrayList s>
		t = null;
	//   50   96:aload_0         
	//   51   97:aconst_null     
	//   52   98:putfield        #137 <Field ArrayList t>
		u = new ai();
	//   53  101:aload_0         
	//   54  102:new             #139 <Class ai>
	//   55  105:dup             
	//   56  106:invokespecial   #140 <Method void ai()>
	//   57  109:putfield        #142 <Field ai u>
		v = new ai();
	//   58  112:aload_0         
	//   59  113:new             #139 <Class ai>
	//   60  116:dup             
	//   61  117:invokespecial   #140 <Method void ai()>
	//   62  120:putfield        #144 <Field ai v>
		d = null;
	//   63  123:aload_0         
	//   64  124:aconst_null     
	//   65  125:putfield        #146 <Field TransitionSet d>
		w = g;
	//   66  128:aload_0         
	//   67  129:getstatic       #80  <Field int[] g>
	//   68  132:putfield        #148 <Field int[] w>
		A = null;
	//   69  135:aload_0         
	//   70  136:aconst_null     
	//   71  137:putfield        #150 <Field ViewGroup A>
		e = false;
	//   72  140:aload_0         
	//   73  141:iconst_0        
	//   74  142:putfield        #152 <Field boolean e>
		B = new ArrayList();
	//   75  145:aload_0         
	//   76  146:new             #114 <Class ArrayList>
	//   77  149:dup             
	//   78  150:invokespecial   #115 <Method void ArrayList()>
	//   79  153:putfield        #154 <Field ArrayList B>
		C = 0;
	//   80  156:aload_0         
	//   81  157:iconst_0        
	//   82  158:putfield        #156 <Field int C>
		D = false;
	//   83  161:aload_0         
	//   84  162:iconst_0        
	//   85  163:putfield        #158 <Field boolean D>
		E = false;
	//   86  166:aload_0         
	//   87  167:iconst_0        
	//   88  168:putfield        #160 <Field boolean E>
		F = null;
	//   89  171:aload_0         
	//   90  172:aconst_null     
	//   91  173:putfield        #162 <Field ArrayList F>
		G = new ArrayList();
	//   92  176:aload_0         
	//   93  177:new             #114 <Class ArrayList>
	//   94  180:dup             
	//   95  181:invokespecial   #115 <Method void ArrayList()>
	//   96  184:putfield        #164 <Field ArrayList G>
		J = h;
	//   97  187:aload_0         
	//   98  188:getstatic       #85  <Field PathMotion h>
	//   99  191:putfield        #166 <Field PathMotion J>
	//  100  194:return          
	}

	public Transition(Context context, AttributeSet attributeset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void Object()>
		i = ((Object)this).getClass().getName();
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #96  <Method Class Object.getClass()>
	//    5    9:invokevirtual   #102 <Method String Class.getName()>
	//    6   12:putfield        #104 <Field String i>
		j = -1L;
	//    7   15:aload_0         
	//    8   16:ldc2w           #105 <Long -1L>
	//    9   19:putfield        #108 <Field long j>
		a = -1L;
	//   10   22:aload_0         
	//   11   23:ldc2w           #105 <Long -1L>
	//   12   26:putfield        #110 <Field long a>
		k = null;
	//   13   29:aload_0         
	//   14   30:aconst_null     
	//   15   31:putfield        #112 <Field TimeInterpolator k>
		b = new ArrayList();
	//   16   34:aload_0         
	//   17   35:new             #114 <Class ArrayList>
	//   18   38:dup             
	//   19   39:invokespecial   #115 <Method void ArrayList()>
	//   20   42:putfield        #117 <Field ArrayList b>
		c = new ArrayList();
	//   21   45:aload_0         
	//   22   46:new             #114 <Class ArrayList>
	//   23   49:dup             
	//   24   50:invokespecial   #115 <Method void ArrayList()>
	//   25   53:putfield        #119 <Field ArrayList c>
		l = null;
	//   26   56:aload_0         
	//   27   57:aconst_null     
	//   28   58:putfield        #121 <Field ArrayList l>
		m = null;
	//   29   61:aload_0         
	//   30   62:aconst_null     
	//   31   63:putfield        #123 <Field ArrayList m>
		n = null;
	//   32   66:aload_0         
	//   33   67:aconst_null     
	//   34   68:putfield        #125 <Field ArrayList n>
		o = null;
	//   35   71:aload_0         
	//   36   72:aconst_null     
	//   37   73:putfield        #127 <Field ArrayList o>
		p = null;
	//   38   76:aload_0         
	//   39   77:aconst_null     
	//   40   78:putfield        #129 <Field ArrayList p>
		q = null;
	//   41   81:aload_0         
	//   42   82:aconst_null     
	//   43   83:putfield        #131 <Field ArrayList q>
		r = null;
	//   44   86:aload_0         
	//   45   87:aconst_null     
	//   46   88:putfield        #133 <Field ArrayList r>
		s = null;
	//   47   91:aload_0         
	//   48   92:aconst_null     
	//   49   93:putfield        #135 <Field ArrayList s>
		t = null;
	//   50   96:aload_0         
	//   51   97:aconst_null     
	//   52   98:putfield        #137 <Field ArrayList t>
		u = new ai();
	//   53  101:aload_0         
	//   54  102:new             #139 <Class ai>
	//   55  105:dup             
	//   56  106:invokespecial   #140 <Method void ai()>
	//   57  109:putfield        #142 <Field ai u>
		v = new ai();
	//   58  112:aload_0         
	//   59  113:new             #139 <Class ai>
	//   60  116:dup             
	//   61  117:invokespecial   #140 <Method void ai()>
	//   62  120:putfield        #144 <Field ai v>
		d = null;
	//   63  123:aload_0         
	//   64  124:aconst_null     
	//   65  125:putfield        #146 <Field TransitionSet d>
		w = g;
	//   66  128:aload_0         
	//   67  129:getstatic       #80  <Field int[] g>
	//   68  132:putfield        #148 <Field int[] w>
		A = null;
	//   69  135:aload_0         
	//   70  136:aconst_null     
	//   71  137:putfield        #150 <Field ViewGroup A>
		e = false;
	//   72  140:aload_0         
	//   73  141:iconst_0        
	//   74  142:putfield        #152 <Field boolean e>
		B = new ArrayList();
	//   75  145:aload_0         
	//   76  146:new             #114 <Class ArrayList>
	//   77  149:dup             
	//   78  150:invokespecial   #115 <Method void ArrayList()>
	//   79  153:putfield        #154 <Field ArrayList B>
		C = 0;
	//   80  156:aload_0         
	//   81  157:iconst_0        
	//   82  158:putfield        #156 <Field int C>
		D = false;
	//   83  161:aload_0         
	//   84  162:iconst_0        
	//   85  163:putfield        #158 <Field boolean D>
		E = false;
	//   86  166:aload_0         
	//   87  167:iconst_0        
	//   88  168:putfield        #160 <Field boolean E>
		F = null;
	//   89  171:aload_0         
	//   90  172:aconst_null     
	//   91  173:putfield        #162 <Field ArrayList F>
		G = new ArrayList();
	//   92  176:aload_0         
	//   93  177:new             #114 <Class ArrayList>
	//   94  180:dup             
	//   95  181:invokespecial   #115 <Method void ArrayList()>
	//   96  184:putfield        #164 <Field ArrayList G>
		J = h;
	//   97  187:aload_0         
	//   98  188:getstatic       #85  <Field PathMotion h>
	//   99  191:putfield        #166 <Field PathMotion J>
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.transition.ac.c);
	//  100  194:aload_1         
	//  101  195:aload_2         
	//  102  196:getstatic       #171 <Field int[] android.support.transition.ac.c>
	//  103  199:invokevirtual   #177 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//  104  202:astore          6
		attributeset = ((AttributeSet) ((XmlResourceParser)attributeset));
	//  105  204:aload_2         
	//  106  205:checkcast       #179 <Class XmlResourceParser>
	//  107  208:astore_2        
		long l1 = android.support.v4.content.a.c.a(typedarray, ((org.xmlpull.v1.XmlPullParser) (attributeset)), "duration", 1, -1);
	//  108  209:aload           6
	//  109  211:aload_2         
	//  110  212:ldc1            #181 <String "duration">
	//  111  214:iconst_1        
	//  112  215:iconst_m1       
	//  113  216:invokestatic    #186 <Method int c.a(TypedArray, org.xmlpull.v1.XmlPullParser, String, int, int)>
	//  114  219:i2l             
	//  115  220:lstore          4
		if(l1 >= 0L)
	//* 116  222:lload           4
	//* 117  224:lconst_0        
	//* 118  225:lcmp            
	//* 119  226:iflt            236
			a(l1);
	//  120  229:aload_0         
	//  121  230:lload           4
	//  122  232:invokevirtual   #189 <Method Transition a(long)>
	//  123  235:pop             
		l1 = android.support.v4.content.a.c.a(typedarray, ((org.xmlpull.v1.XmlPullParser) (attributeset)), "startDelay", 2, -1);
	//  124  236:aload           6
	//  125  238:aload_2         
	//  126  239:ldc1            #191 <String "startDelay">
	//  127  241:iconst_2        
	//  128  242:iconst_m1       
	//  129  243:invokestatic    #186 <Method int c.a(TypedArray, org.xmlpull.v1.XmlPullParser, String, int, int)>
	//  130  246:i2l             
	//  131  247:lstore          4
		if(l1 > 0L)
	//* 132  249:lload           4
	//* 133  251:lconst_0        
	//* 134  252:lcmp            
	//* 135  253:ifle            263
			b(l1);
	//  136  256:aload_0         
	//  137  257:lload           4
	//  138  259:invokevirtual   #193 <Method Transition b(long)>
	//  139  262:pop             
		int i1 = android.support.v4.content.a.c.c(typedarray, ((org.xmlpull.v1.XmlPullParser) (attributeset)), "interpolator", 0, 0);
	//  140  263:aload           6
	//  141  265:aload_2         
	//  142  266:ldc1            #195 <String "interpolator">
	//  143  268:iconst_0        
	//  144  269:iconst_0        
	//  145  270:invokestatic    #197 <Method int c.c(TypedArray, org.xmlpull.v1.XmlPullParser, String, int, int)>
	//  146  273:istore_3        
		if(i1 > 0)
	//* 147  274:iload_3         
	//* 148  275:ifle            288
			a(((TimeInterpolator) (AnimationUtils.loadInterpolator(context, i1))));
	//  149  278:aload_0         
	//  150  279:aload_1         
	//  151  280:iload_3         
	//  152  281:invokestatic    #203 <Method android.view.animation.Interpolator AnimationUtils.loadInterpolator(Context, int)>
	//  153  284:invokevirtual   #206 <Method Transition a(TimeInterpolator)>
	//  154  287:pop             
		context = ((Context) (android.support.v4.content.a.c.a(typedarray, ((org.xmlpull.v1.XmlPullParser) (attributeset)), "matchOrder", 3)));
	//  155  288:aload           6
	//  156  290:aload_2         
	//  157  291:ldc1            #208 <String "matchOrder">
	//  158  293:iconst_3        
	//  159  294:invokestatic    #211 <Method String c.a(TypedArray, org.xmlpull.v1.XmlPullParser, String, int)>
	//  160  297:astore_1        
		if(context != null)
	//* 161  298:aload_1         
	//* 162  299:ifnull          310
			a(b(((String) (context))));
	//  163  302:aload_0         
	//  164  303:aload_1         
	//  165  304:invokestatic    #214 <Method int[] b(String)>
	//  166  307:invokevirtual   #217 <Method void a(int[])>
		typedarray.recycle();
	//  167  310:aload           6
	//  168  312:invokevirtual   #222 <Method void TypedArray.recycle()>
	//  169  315:return          
	}

	static ArrayList a(Transition transition)
	{
		return transition.B;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field ArrayList B>
	//    2    4:areturn         
	}

	private void a(Animator animator, android.support.v4.f.a a1)
	{
		if(animator != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
		{
			animator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter(a1) {

				public void onAnimationEnd(Animator animator1)
				{
					a.remove(((Object) (animator1)));
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field a a>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #30  <Method Object a.remove(Object)>
				//    4    8:pop             
					android.support.transition.Transition.a(b).remove(((Object) (animator1)));
				//    5    9:aload_0         
				//    6   10:getfield        #16  <Field Transition b>
				//    7   13:invokestatic    #33  <Method ArrayList android.support.transition.Transition.a(Transition)>
				//    8   16:aload_1         
				//    9   17:invokevirtual   #38  <Method boolean ArrayList.remove(Object)>
				//   10   20:pop             
				//   11   21:return          
				}

				public void onAnimationStart(Animator animator1)
				{
					android.support.transition.Transition.a(b).add(((Object) (animator1)));
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field Transition b>
				//    2    4:invokestatic    #33  <Method ArrayList android.support.transition.Transition.a(Transition)>
				//    3    7:aload_1         
				//    4    8:invokevirtual   #42  <Method boolean ArrayList.add(Object)>
				//    5   11:pop             
				//    6   12:return          
				}

				final android.support.v4.f.a a;
				final Transition b;

			
			{
				b = Transition.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Transition b>
				a = a1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #18  <Field a a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
			}
)));
	//    2    4:aload_1         
	//    3    5:new             #10  <Class Transition$2>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #227 <Method void Transition$2(Transition, a)>
	//    8   14:invokevirtual   #233 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
			a(animator);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #236 <Method void a(Animator)>
		}
	//   12   22:return          
	}

	private void a(ai ai1, ai ai2)
	{
		android.support.v4.f.a a1 = new android.support.v4.f.a(((android.support.v4.f.m) (ai1.a)));
	//    0    0:new             #241 <Class a>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #243 <Field a android.support.transition.ai.a>
	//    4    8:invokespecial   #246 <Method void a(android.support.v4.f.m)>
	//    5   11:astore          4
		android.support.v4.f.a a2 = new android.support.v4.f.a(((android.support.v4.f.m) (ai2.a)));
	//    6   13:new             #241 <Class a>
	//    7   16:dup             
	//    8   17:aload_2         
	//    9   18:getfield        #243 <Field a android.support.transition.ai.a>
	//   10   21:invokespecial   #246 <Method void a(android.support.v4.f.m)>
	//   11   24:astore          5
		for(int i1 = 0; i1 < w.length; i1++)
	//*  12   26:iconst_0        
	//*  13   27:istore_3        
	//*  14   28:iload_3         
	//*  15   29:aload_0         
	//*  16   30:getfield        #148 <Field int[] w>
	//*  17   33:arraylength     
	//*  18   34:icmpge          147
			switch(w[i1])
	//*  19   37:aload_0         
	//*  20   38:getfield        #148 <Field int[] w>
	//*  21   41:iload_3         
	//*  22   42:iaload          
			{
	//*  23   43:tableswitch     1 4: default 72
	//	               1 132
	//	               2 113
	//	               3 94
	//	               4 75
	//*  24   72:goto            140
			case 4: // '\004'
				a(a1, a2, ai1.c, ai2.c);
	//   25   75:aload_0         
	//   26   76:aload           4
	//   27   78:aload           5
	//   28   80:aload_1         
	//   29   81:getfield        #249 <Field f android.support.transition.ai.c>
	//   30   84:aload_2         
	//   31   85:getfield        #249 <Field f android.support.transition.ai.c>
	//   32   88:invokespecial   #252 <Method void a(a, a, f, f)>
				break;

	//*  33   91:goto            140
			case 3: // '\003'
				a(a1, a2, ai1.b, ai2.b);
	//   34   94:aload_0         
	//   35   95:aload           4
	//   36   97:aload           5
	//   37   99:aload_1         
	//   38  100:getfield        #255 <Field SparseArray ai.b>
	//   39  103:aload_2         
	//   40  104:getfield        #255 <Field SparseArray ai.b>
	//   41  107:invokespecial   #258 <Method void a(a, a, SparseArray, SparseArray)>
				break;

	//*  42  110:goto            140
			case 2: // '\002'
				a(a1, a2, ai1.d, ai2.d);
	//   43  113:aload_0         
	//   44  114:aload           4
	//   45  116:aload           5
	//   46  118:aload_1         
	//   47  119:getfield        #260 <Field a ai.d>
	//   48  122:aload_2         
	//   49  123:getfield        #260 <Field a ai.d>
	//   50  126:invokespecial   #263 <Method void a(a, a, a, a)>
				break;

	//*  51  129:goto            140
			case 1: // '\001'
				a(a1, a2);
	//   52  132:aload_0         
	//   53  133:aload           4
	//   54  135:aload           5
	//   55  137:invokespecial   #266 <Method void a(a, a)>
				break;
			}

	//   56  140:iload_3         
	//   57  141:iconst_1        
	//   58  142:iadd            
	//   59  143:istore_3        
	//*  60  144:goto            28
		b(a1, a2);
	//   61  147:aload_0         
	//   62  148:aload           4
	//   63  150:aload           5
	//   64  152:invokespecial   #268 <Method void b(a, a)>
	//   65  155:return          
	}

	private static void a(ai ai1, View view, ah ah1)
	{
		ai1.a.put(((Object) (view)), ((Object) (ah1)));
	//    0    0:aload_0         
	//    1    1:getfield        #243 <Field a android.support.transition.ai.a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #273 <Method Object a.put(Object, Object)>
	//    5    9:pop             
		int i1 = view.getId();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #279 <Method int View.getId()>
	//    8   14:istore_3        
		if(i1 >= 0)
	//*   9   15:iload_3         
	//*  10   16:iflt            51
			if(ai1.b.indexOfKey(i1) >= 0)
	//*  11   19:aload_0         
	//*  12   20:getfield        #255 <Field SparseArray ai.b>
	//*  13   23:iload_3         
	//*  14   24:invokevirtual   #285 <Method int SparseArray.indexOfKey(int)>
	//*  15   27:iflt            42
				ai1.b.put(i1, ((Object) (null)));
	//   16   30:aload_0         
	//   17   31:getfield        #255 <Field SparseArray ai.b>
	//   18   34:iload_3         
	//   19   35:aconst_null     
	//   20   36:invokevirtual   #288 <Method void SparseArray.put(int, Object)>
			else
	//*  21   39:goto            51
				ai1.b.put(i1, ((Object) (view)));
	//   22   42:aload_0         
	//   23   43:getfield        #255 <Field SparseArray ai.b>
	//   24   46:iload_3         
	//   25   47:aload_1         
	//   26   48:invokevirtual   #288 <Method void SparseArray.put(int, Object)>
		ah1 = ((ah) (android.support.v4.view.s.n(view)));
	//   27   51:aload_1         
	//   28   52:invokestatic    #293 <Method String s.n(View)>
	//   29   55:astore_2        
		if(ah1 != null)
	//*  30   56:aload_2         
	//*  31   57:ifnull          94
			if(ai1.d.containsKey(((Object) (ah1))))
	//*  32   60:aload_0         
	//*  33   61:getfield        #260 <Field a ai.d>
	//*  34   64:aload_2         
	//*  35   65:invokevirtual   #297 <Method boolean a.containsKey(Object)>
	//*  36   68:ifeq            84
				ai1.d.put(((Object) (ah1)), ((Object) (null)));
	//   37   71:aload_0         
	//   38   72:getfield        #260 <Field a ai.d>
	//   39   75:aload_2         
	//   40   76:aconst_null     
	//   41   77:invokevirtual   #273 <Method Object a.put(Object, Object)>
	//   42   80:pop             
			else
	//*  43   81:goto            94
				ai1.d.put(((Object) (ah1)), ((Object) (view)));
	//   44   84:aload_0         
	//   45   85:getfield        #260 <Field a ai.d>
	//   46   88:aload_2         
	//   47   89:aload_1         
	//   48   90:invokevirtual   #273 <Method Object a.put(Object, Object)>
	//   49   93:pop             
		if(view.getParent() instanceof ListView)
	//*  50   94:aload_1         
	//*  51   95:invokevirtual   #301 <Method android.view.ViewParent View.getParent()>
	//*  52   98:instanceof      #303 <Class ListView>
	//*  53  101:ifeq            195
		{
			ah1 = ((ah) ((ListView)view.getParent()));
	//   54  104:aload_1         
	//   55  105:invokevirtual   #301 <Method android.view.ViewParent View.getParent()>
	//   56  108:checkcast       #303 <Class ListView>
	//   57  111:astore_2        
			if(((ListView) (ah1)).getAdapter().hasStableIds())
	//*  58  112:aload_2         
	//*  59  113:invokevirtual   #307 <Method ListAdapter ListView.getAdapter()>
	//*  60  116:invokeinterface #313 <Method boolean ListAdapter.hasStableIds()>
	//*  61  121:ifeq            195
			{
				long l1 = ((ListView) (ah1)).getItemIdAtPosition(((ListView) (ah1)).getPositionForView(view));
	//   62  124:aload_2         
	//   63  125:aload_2         
	//   64  126:aload_1         
	//   65  127:invokevirtual   #317 <Method int ListView.getPositionForView(View)>
	//   66  130:invokevirtual   #321 <Method long ListView.getItemIdAtPosition(int)>
	//   67  133:lstore          4
				if(ai1.c.c(l1) >= 0)
	//*  68  135:aload_0         
	//*  69  136:getfield        #249 <Field f android.support.transition.ai.c>
	//*  70  139:lload           4
	//*  71  141:invokevirtual   #326 <Method int f.c(long)>
	//*  72  144:iflt            180
				{
					view = (View)ai1.c.a(l1);
	//   73  147:aload_0         
	//   74  148:getfield        #249 <Field f android.support.transition.ai.c>
	//   75  151:lload           4
	//   76  153:invokevirtual   #329 <Method Object f.a(long)>
	//   77  156:checkcast       #275 <Class View>
	//   78  159:astore_1        
					if(view != null)
	//*  79  160:aload_1         
	//*  80  161:ifnull          195
					{
						android.support.v4.view.s.a(view, false);
	//   81  164:aload_1         
	//   82  165:iconst_0        
	//   83  166:invokestatic    #332 <Method void s.a(View, boolean)>
						ai1.c.b(l1, ((Object) (null)));
	//   84  169:aload_0         
	//   85  170:getfield        #249 <Field f android.support.transition.ai.c>
	//   86  173:lload           4
	//   87  175:aconst_null     
	//   88  176:invokevirtual   #335 <Method void f.b(long, Object)>
						return;
	//   89  179:return          
					}
				} else
				{
					android.support.v4.view.s.a(view, true);
	//   90  180:aload_1         
	//   91  181:iconst_1        
	//   92  182:invokestatic    #332 <Method void s.a(View, boolean)>
					ai1.c.b(l1, ((Object) (view)));
	//   93  185:aload_0         
	//   94  186:getfield        #249 <Field f android.support.transition.ai.c>
	//   95  189:lload           4
	//   96  191:aload_1         
	//   97  192:invokevirtual   #335 <Method void f.b(long, Object)>
				}
			}
		}
	//   98  195:return          
	}

	private void a(android.support.v4.f.a a1, android.support.v4.f.a a2)
	{
		for(int i1 = a1.size() - 1; i1 >= 0; i1--)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #338 <Method int a.size()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:iflt            108
		{
			Object obj = ((Object) ((View)a1.b(i1)));
	//    7   11:aload_1         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #341 <Method Object a.b(int)>
	//   10   16:checkcast       #275 <Class View>
	//   11   19:astore          4
			if(obj == null || !b(((View) (obj))))
				continue;
	//   12   21:aload           4
	//   13   23:ifnull          101
	//   14   26:aload_0         
	//   15   27:aload           4
	//   16   29:invokevirtual   #344 <Method boolean b(View)>
	//   17   32:ifeq            101
			obj = ((Object) ((ah)a2.remove(obj)));
	//   18   35:aload_2         
	//   19   36:aload           4
	//   20   38:invokevirtual   #348 <Method Object a.remove(Object)>
	//   21   41:checkcast       #350 <Class ah>
	//   22   44:astore          4
			if(obj != null && ((ah) (obj)).b != null && b(((ah) (obj)).b))
	//*  23   46:aload           4
	//*  24   48:ifnull          101
	//*  25   51:aload           4
	//*  26   53:getfield        #353 <Field View ah.b>
	//*  27   56:ifnull          101
	//*  28   59:aload_0         
	//*  29   60:aload           4
	//*  30   62:getfield        #353 <Field View ah.b>
	//*  31   65:invokevirtual   #344 <Method boolean b(View)>
	//*  32   68:ifeq            101
			{
				ah ah1 = (ah)a1.d(i1);
	//   33   71:aload_1         
	//   34   72:iload_3         
	//   35   73:invokevirtual   #355 <Method Object a.d(int)>
	//   36   76:checkcast       #350 <Class ah>
	//   37   79:astore          5
				x.add(((Object) (ah1)));
	//   38   81:aload_0         
	//   39   82:getfield        #357 <Field ArrayList x>
	//   40   85:aload           5
	//   41   87:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//   42   90:pop             
				y.add(obj);
	//   43   91:aload_0         
	//   44   92:getfield        #362 <Field ArrayList y>
	//   45   95:aload           4
	//   46   97:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//   47  100:pop             
			}
		}

	//   48  101:iload_3         
	//   49  102:iconst_1        
	//   50  103:isub            
	//   51  104:istore_3        
	//*  52  105:goto            7
	//   53  108:return          
	}

	private void a(android.support.v4.f.a a1, android.support.v4.f.a a2, android.support.v4.f.a a3, android.support.v4.f.a a4)
	{
		int j1 = a3.size();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #338 <Method int a.size()>
	//    2    4:istore          6
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    6:iconst_0        
	//*   4    7:istore          5
	//*   5    9:iload           5
	//*   6   11:iload           6
	//*   7   13:icmpge          146
		{
			View view = (View)a3.c(i1);
	//    8   16:aload_3         
	//    9   17:iload           5
	//   10   19:invokevirtual   #365 <Method Object a.c(int)>
	//   11   22:checkcast       #275 <Class View>
	//   12   25:astore          7
			if(view == null || !b(view))
				continue;
	//   13   27:aload           7
	//   14   29:ifnull          137
	//   15   32:aload_0         
	//   16   33:aload           7
	//   17   35:invokevirtual   #344 <Method boolean b(View)>
	//   18   38:ifeq            137
			View view1 = (View)a4.get(a3.b(i1));
	//   19   41:aload           4
	//   20   43:aload_3         
	//   21   44:iload           5
	//   22   46:invokevirtual   #341 <Method Object a.b(int)>
	//   23   49:invokevirtual   #368 <Method Object a.get(Object)>
	//   24   52:checkcast       #275 <Class View>
	//   25   55:astore          8
			if(view1 == null || !b(view1))
				continue;
	//   26   57:aload           8
	//   27   59:ifnull          137
	//   28   62:aload_0         
	//   29   63:aload           8
	//   30   65:invokevirtual   #344 <Method boolean b(View)>
	//   31   68:ifeq            137
			ah ah1 = (ah)a1.get(((Object) (view)));
	//   32   71:aload_1         
	//   33   72:aload           7
	//   34   74:invokevirtual   #368 <Method Object a.get(Object)>
	//   35   77:checkcast       #350 <Class ah>
	//   36   80:astore          9
			ah ah2 = (ah)a2.get(((Object) (view1)));
	//   37   82:aload_2         
	//   38   83:aload           8
	//   39   85:invokevirtual   #368 <Method Object a.get(Object)>
	//   40   88:checkcast       #350 <Class ah>
	//   41   91:astore          10
			if(ah1 != null && ah2 != null)
	//*  42   93:aload           9
	//*  43   95:ifnull          137
	//*  44   98:aload           10
	//*  45  100:ifnull          137
			{
				x.add(((Object) (ah1)));
	//   46  103:aload_0         
	//   47  104:getfield        #357 <Field ArrayList x>
	//   48  107:aload           9
	//   49  109:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//   50  112:pop             
				y.add(((Object) (ah2)));
	//   51  113:aload_0         
	//   52  114:getfield        #362 <Field ArrayList y>
	//   53  117:aload           10
	//   54  119:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//   55  122:pop             
				a1.remove(((Object) (view)));
	//   56  123:aload_1         
	//   57  124:aload           7
	//   58  126:invokevirtual   #348 <Method Object a.remove(Object)>
	//   59  129:pop             
				a2.remove(((Object) (view1)));
	//   60  130:aload_2         
	//   61  131:aload           8
	//   62  133:invokevirtual   #348 <Method Object a.remove(Object)>
	//   63  136:pop             
			}
		}

	//   64  137:iload           5
	//   65  139:iconst_1        
	//   66  140:iadd            
	//   67  141:istore          5
	//*  68  143:goto            9
	//   69  146:return          
	}

	private void a(android.support.v4.f.a a1, android.support.v4.f.a a2, f f1, f f2)
	{
		int j1 = f1.b();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #371 <Method int f.b()>
	//    2    4:istore          6
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    6:iconst_0        
	//*   4    7:istore          5
	//*   5    9:iload           5
	//*   6   11:iload           6
	//*   7   13:icmpge          146
		{
			View view = (View)f1.c(i1);
	//    8   16:aload_3         
	//    9   17:iload           5
	//   10   19:invokevirtual   #372 <Method Object f.c(int)>
	//   11   22:checkcast       #275 <Class View>
	//   12   25:astore          7
			if(view == null || !b(view))
				continue;
	//   13   27:aload           7
	//   14   29:ifnull          137
	//   15   32:aload_0         
	//   16   33:aload           7
	//   17   35:invokevirtual   #344 <Method boolean b(View)>
	//   18   38:ifeq            137
			View view1 = (View)f2.a(f1.b(i1));
	//   19   41:aload           4
	//   20   43:aload_3         
	//   21   44:iload           5
	//   22   46:invokevirtual   #374 <Method long f.b(int)>
	//   23   49:invokevirtual   #329 <Method Object f.a(long)>
	//   24   52:checkcast       #275 <Class View>
	//   25   55:astore          8
			if(view1 == null || !b(view1))
				continue;
	//   26   57:aload           8
	//   27   59:ifnull          137
	//   28   62:aload_0         
	//   29   63:aload           8
	//   30   65:invokevirtual   #344 <Method boolean b(View)>
	//   31   68:ifeq            137
			ah ah1 = (ah)a1.get(((Object) (view)));
	//   32   71:aload_1         
	//   33   72:aload           7
	//   34   74:invokevirtual   #368 <Method Object a.get(Object)>
	//   35   77:checkcast       #350 <Class ah>
	//   36   80:astore          9
			ah ah2 = (ah)a2.get(((Object) (view1)));
	//   37   82:aload_2         
	//   38   83:aload           8
	//   39   85:invokevirtual   #368 <Method Object a.get(Object)>
	//   40   88:checkcast       #350 <Class ah>
	//   41   91:astore          10
			if(ah1 != null && ah2 != null)
	//*  42   93:aload           9
	//*  43   95:ifnull          137
	//*  44   98:aload           10
	//*  45  100:ifnull          137
			{
				x.add(((Object) (ah1)));
	//   46  103:aload_0         
	//   47  104:getfield        #357 <Field ArrayList x>
	//   48  107:aload           9
	//   49  109:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//   50  112:pop             
				y.add(((Object) (ah2)));
	//   51  113:aload_0         
	//   52  114:getfield        #362 <Field ArrayList y>
	//   53  117:aload           10
	//   54  119:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//   55  122:pop             
				a1.remove(((Object) (view)));
	//   56  123:aload_1         
	//   57  124:aload           7
	//   58  126:invokevirtual   #348 <Method Object a.remove(Object)>
	//   59  129:pop             
				a2.remove(((Object) (view1)));
	//   60  130:aload_2         
	//   61  131:aload           8
	//   62  133:invokevirtual   #348 <Method Object a.remove(Object)>
	//   63  136:pop             
			}
		}

	//   64  137:iload           5
	//   65  139:iconst_1        
	//   66  140:iadd            
	//   67  141:istore          5
	//*  68  143:goto            9
	//   69  146:return          
	}

	private void a(android.support.v4.f.a a1, android.support.v4.f.a a2, SparseArray sparsearray, SparseArray sparsearray1)
	{
		int j1 = sparsearray.size();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #376 <Method int SparseArray.size()>
	//    2    4:istore          6
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    6:iconst_0        
	//*   4    7:istore          5
	//*   5    9:iload           5
	//*   6   11:iload           6
	//*   7   13:icmpge          146
		{
			View view = (View)sparsearray.valueAt(i1);
	//    8   16:aload_3         
	//    9   17:iload           5
	//   10   19:invokevirtual   #379 <Method Object SparseArray.valueAt(int)>
	//   11   22:checkcast       #275 <Class View>
	//   12   25:astore          7
			if(view == null || !b(view))
				continue;
	//   13   27:aload           7
	//   14   29:ifnull          137
	//   15   32:aload_0         
	//   16   33:aload           7
	//   17   35:invokevirtual   #344 <Method boolean b(View)>
	//   18   38:ifeq            137
			View view1 = (View)sparsearray1.get(sparsearray.keyAt(i1));
	//   19   41:aload           4
	//   20   43:aload_3         
	//   21   44:iload           5
	//   22   46:invokevirtual   #382 <Method int SparseArray.keyAt(int)>
	//   23   49:invokevirtual   #384 <Method Object SparseArray.get(int)>
	//   24   52:checkcast       #275 <Class View>
	//   25   55:astore          8
			if(view1 == null || !b(view1))
				continue;
	//   26   57:aload           8
	//   27   59:ifnull          137
	//   28   62:aload_0         
	//   29   63:aload           8
	//   30   65:invokevirtual   #344 <Method boolean b(View)>
	//   31   68:ifeq            137
			ah ah1 = (ah)a1.get(((Object) (view)));
	//   32   71:aload_1         
	//   33   72:aload           7
	//   34   74:invokevirtual   #368 <Method Object a.get(Object)>
	//   35   77:checkcast       #350 <Class ah>
	//   36   80:astore          9
			ah ah2 = (ah)a2.get(((Object) (view1)));
	//   37   82:aload_2         
	//   38   83:aload           8
	//   39   85:invokevirtual   #368 <Method Object a.get(Object)>
	//   40   88:checkcast       #350 <Class ah>
	//   41   91:astore          10
			if(ah1 != null && ah2 != null)
	//*  42   93:aload           9
	//*  43   95:ifnull          137
	//*  44   98:aload           10
	//*  45  100:ifnull          137
			{
				x.add(((Object) (ah1)));
	//   46  103:aload_0         
	//   47  104:getfield        #357 <Field ArrayList x>
	//   48  107:aload           9
	//   49  109:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//   50  112:pop             
				y.add(((Object) (ah2)));
	//   51  113:aload_0         
	//   52  114:getfield        #362 <Field ArrayList y>
	//   53  117:aload           10
	//   54  119:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//   55  122:pop             
				a1.remove(((Object) (view)));
	//   56  123:aload_1         
	//   57  124:aload           7
	//   58  126:invokevirtual   #348 <Method Object a.remove(Object)>
	//   59  129:pop             
				a2.remove(((Object) (view1)));
	//   60  130:aload_2         
	//   61  131:aload           8
	//   62  133:invokevirtual   #348 <Method Object a.remove(Object)>
	//   63  136:pop             
			}
		}

	//   64  137:iload           5
	//   65  139:iconst_1        
	//   66  140:iadd            
	//   67  141:istore          5
	//*  68  143:goto            9
	//   69  146:return          
	}

	private static boolean a(int i1)
	{
		return i1 >= 1 && i1 <= 4;
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:icmplt          12
	//    3    5:iload_0         
	//    4    6:iconst_4        
	//    5    7:icmpgt          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	private static boolean a(ah ah1, ah ah2, String s1)
	{
		ah1 = ((ah) (ah1.a.get(((Object) (s1)))));
	//    0    0:aload_0         
	//    1    1:getfield        #390 <Field Map android.support.transition.ah.a>
	//    2    4:aload_2         
	//    3    5:invokeinterface #393 <Method Object Map.get(Object)>
	//    4   10:astore_0        
		ah2 = ((ah) (ah2.a.get(((Object) (s1)))));
	//    5   11:aload_1         
	//    6   12:getfield        #390 <Field Map android.support.transition.ah.a>
	//    7   15:aload_2         
	//    8   16:invokeinterface #393 <Method Object Map.get(Object)>
	//    9   21:astore_1        
		boolean flag = true;
	//   10   22:iconst_1        
	//   11   23:istore_3        
		if(ah1 == null && ah2 == null)
	//*  12   24:aload_0         
	//*  13   25:ifnonnull       34
	//*  14   28:aload_1         
	//*  15   29:ifnonnull       34
			return false;
	//   16   32:iconst_0        
	//   17   33:ireturn         
		if(ah1 != null)
	//*  18   34:aload_0         
	//*  19   35:ifnull          52
		{
			if(ah2 == null)
	//*  20   38:aload_1         
	//*  21   39:ifnonnull       44
				return true;
	//   22   42:iconst_1        
	//   23   43:ireturn         
			flag = true ^ ((Object) (ah1)).equals(((Object) (ah2)));
	//   24   44:iconst_1        
	//   25   45:aload_0         
	//   26   46:aload_1         
	//   27   47:invokevirtual   #396 <Method boolean Object.equals(Object)>
	//   28   50:ixor            
	//   29   51:istore_3        
		}
		return flag;
	//   30   52:iload_3         
	//   31   53:ireturn         
	}

	private static boolean a(int ai1[], int i1)
	{
		int k1 = ai1[i1];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iaload          
	//    3    3:istore_3        
		for(int j1 = 0; j1 < i1; j1++)
	//*   4    4:iconst_0        
	//*   5    5:istore_2        
	//*   6    6:iload_2         
	//*   7    7:iload_1         
	//*   8    8:icmpge          27
			if(ai1[j1] == k1)
	//*   9   11:aload_0         
	//*  10   12:iload_2         
	//*  11   13:iaload          
	//*  12   14:iload_3         
	//*  13   15:icmpne          20
				return true;
	//   14   18:iconst_1        
	//   15   19:ireturn         

	//   16   20:iload_2         
	//   17   21:iconst_1        
	//   18   22:iadd            
	//   19   23:istore_2        
	//*  20   24:goto            6
		return false;
	//   21   27:iconst_0        
	//   22   28:ireturn         
	}

	private void b(android.support.v4.f.a a1, android.support.v4.f.a a2)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		int i1 = 0;
	//    2    3:iconst_0        
	//    3    4:istore_3        
		int j1;
		do
		{
			j1 = ((int) (flag));
	//    4    5:iload           5
	//    5    7:istore          4
			if(i1 >= a1.size())
				break;
	//    6    9:iload_3         
	//    7   10:aload_1         
	//    8   11:invokevirtual   #338 <Method int a.size()>
	//    9   14:icmpge          65
			ah ah1 = (ah)a1.c(i1);
	//   10   17:aload_1         
	//   11   18:iload_3         
	//   12   19:invokevirtual   #365 <Method Object a.c(int)>
	//   13   22:checkcast       #350 <Class ah>
	//   14   25:astore          6
			if(b(ah1.b))
	//*  15   27:aload_0         
	//*  16   28:aload           6
	//*  17   30:getfield        #353 <Field View ah.b>
	//*  18   33:invokevirtual   #344 <Method boolean b(View)>
	//*  19   36:ifeq            58
			{
				x.add(((Object) (ah1)));
	//   20   39:aload_0         
	//   21   40:getfield        #357 <Field ArrayList x>
	//   22   43:aload           6
	//   23   45:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//   24   48:pop             
				y.add(((Object) (null)));
	//   25   49:aload_0         
	//   26   50:getfield        #362 <Field ArrayList y>
	//   27   53:aconst_null     
	//   28   54:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//   29   57:pop             
			}
			i1++;
	//   30   58:iload_3         
	//   31   59:iconst_1        
	//   32   60:iadd            
	//   33   61:istore_3        
		} while(true);
	//   34   62:goto            5
		for(; j1 < a2.size(); j1++)
	//*  35   65:iload           4
	//*  36   67:aload_2         
	//*  37   68:invokevirtual   #338 <Method int a.size()>
	//*  38   71:icmpge          122
		{
			a1 = ((android.support.v4.f.a) ((ah)a2.c(j1)));
	//   39   74:aload_2         
	//   40   75:iload           4
	//   41   77:invokevirtual   #365 <Method Object a.c(int)>
	//   42   80:checkcast       #350 <Class ah>
	//   43   83:astore_1        
			if(b(((ah) (a1)).b))
	//*  44   84:aload_0         
	//*  45   85:aload_1         
	//*  46   86:getfield        #353 <Field View ah.b>
	//*  47   89:invokevirtual   #344 <Method boolean b(View)>
	//*  48   92:ifeq            113
			{
				y.add(((Object) (a1)));
	//   49   95:aload_0         
	//   50   96:getfield        #362 <Field ArrayList y>
	//   51   99:aload_1         
	//   52  100:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//   53  103:pop             
				x.add(((Object) (null)));
	//   54  104:aload_0         
	//   55  105:getfield        #357 <Field ArrayList x>
	//   56  108:aconst_null     
	//   57  109:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//   58  112:pop             
			}
		}

	//   59  113:iload           4
	//   60  115:iconst_1        
	//   61  116:iadd            
	//   62  117:istore          4
	//*  63  119:goto            65
	//   64  122:return          
	}

	private static int[] b(String s1)
	{
label0:
		{
			StringTokenizer stringtokenizer = new StringTokenizer(s1, ",");
	//    0    0:new             #399 <Class StringTokenizer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc2            #401 <String ",">
	//    4    8:invokespecial   #404 <Method void StringTokenizer(String, String)>
	//    5   11:astore_3        
			s1 = ((String) (new int[stringtokenizer.countTokens()]));
	//    6   12:aload_3         
	//    7   13:invokevirtual   #407 <Method int StringTokenizer.countTokens()>
	//    8   16:newarray        int[]
	//    9   18:astore_0        
			int i1 = 0;
	//   10   19:iconst_0        
	//   11   20:istore_1        
			Object obj;
			do
			{
				if(!stringtokenizer.hasMoreTokens())
					break label0;
	//   12   21:aload_3         
	//   13   22:invokevirtual   #410 <Method boolean StringTokenizer.hasMoreTokens()>
	//   14   25:ifeq            181
				obj = ((Object) (stringtokenizer.nextToken().trim()));
	//   15   28:aload_3         
	//   16   29:invokevirtual   #413 <Method String StringTokenizer.nextToken()>
	//   17   32:invokevirtual   #418 <Method String String.trim()>
	//   18   35:astore_2        
				if("id".equalsIgnoreCase(((String) (obj))))
	//*  19   36:ldc2            #420 <String "id">
	//*  20   39:aload_2         
	//*  21   40:invokevirtual   #424 <Method boolean String.equalsIgnoreCase(String)>
	//*  22   43:ifeq            53
					s1[i1] = 3;
	//   23   46:aload_0         
	//   24   47:iload_1         
	//   25   48:iconst_3        
	//   26   49:iastore         
				else
	//*  27   50:goto            132
				if("instance".equalsIgnoreCase(((String) (obj))))
	//*  28   53:ldc2            #426 <String "instance">
	//*  29   56:aload_2         
	//*  30   57:invokevirtual   #424 <Method boolean String.equalsIgnoreCase(String)>
	//*  31   60:ifeq            70
					s1[i1] = 1;
	//   32   63:aload_0         
	//   33   64:iload_1         
	//   34   65:iconst_1        
	//   35   66:iastore         
				else
	//*  36   67:goto            132
				if("name".equalsIgnoreCase(((String) (obj))))
	//*  37   70:ldc2            #428 <String "name">
	//*  38   73:aload_2         
	//*  39   74:invokevirtual   #424 <Method boolean String.equalsIgnoreCase(String)>
	//*  40   77:ifeq            87
					s1[i1] = 2;
	//   41   80:aload_0         
	//   42   81:iload_1         
	//   43   82:iconst_2        
	//   44   83:iastore         
				else
	//*  45   84:goto            132
				if("itemId".equalsIgnoreCase(((String) (obj))))
	//*  46   87:ldc2            #430 <String "itemId">
	//*  47   90:aload_2         
	//*  48   91:invokevirtual   #424 <Method boolean String.equalsIgnoreCase(String)>
	//*  49   94:ifeq            104
				{
					s1[i1] = 4;
	//   50   97:aload_0         
	//   51   98:iload_1         
	//   52   99:iconst_4        
	//   53  100:iastore         
				} else
	//*  54  101:goto            132
				{
					if(!((String) (obj)).isEmpty())
						break;
	//   55  104:aload_2         
	//   56  105:invokevirtual   #433 <Method boolean String.isEmpty()>
	//   57  108:ifeq            139
					obj = ((Object) (new int[s1.length - 1]));
	//   58  111:aload_0         
	//   59  112:arraylength     
	//   60  113:iconst_1        
	//   61  114:isub            
	//   62  115:newarray        int[]
	//   63  117:astore_2        
					System.arraycopy(((Object) (s1)), 0, obj, 0, i1);
	//   64  118:aload_0         
	//   65  119:iconst_0        
	//   66  120:aload_2         
	//   67  121:iconst_0        
	//   68  122:iload_1         
	//   69  123:invokestatic    #439 <Method void System.arraycopy(Object, int, Object, int, int)>
					i1--;
	//   70  126:iload_1         
	//   71  127:iconst_1        
	//   72  128:isub            
	//   73  129:istore_1        
					s1 = ((String) (obj));
	//   74  130:aload_2         
	//   75  131:astore_0        
				}
				i1++;
	//   76  132:iload_1         
	//   77  133:iconst_1        
	//   78  134:iadd            
	//   79  135:istore_1        
			} while(true);
	//   80  136:goto            21
			s1 = ((String) (new StringBuilder()));
	//   81  139:new             #441 <Class StringBuilder>
	//   82  142:dup             
	//   83  143:invokespecial   #442 <Method void StringBuilder()>
	//   84  146:astore_0        
			((StringBuilder) (s1)).append("Unknown match type in matchOrder: '");
	//   85  147:aload_0         
	//   86  148:ldc2            #444 <String "Unknown match type in matchOrder: '">
	//   87  151:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//   88  154:pop             
			((StringBuilder) (s1)).append(((String) (obj)));
	//   89  155:aload_0         
	//   90  156:aload_2         
	//   91  157:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//   92  160:pop             
			((StringBuilder) (s1)).append("'");
	//   93  161:aload_0         
	//   94  162:ldc2            #450 <String "'">
	//   95  165:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//   96  168:pop             
			throw new InflateException(((StringBuilder) (s1)).toString());
	//   97  169:new             #452 <Class InflateException>
	//   98  172:dup             
	//   99  173:aload_0         
	//  100  174:invokevirtual   #455 <Method String StringBuilder.toString()>
	//  101  177:invokespecial   #458 <Method void InflateException(String)>
	//  102  180:athrow          
		}
		return ((int []) (s1));
	//  103  181:aload_0         
	//  104  182:areturn         
	}

	private void c(View view, boolean flag)
	{
		if(view == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		int l1 = view.getId();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #279 <Method int View.getId()>
	//    5    9:istore          5
		if(n != null && n.contains(((Object) (Integer.valueOf(l1)))))
	//*   6   11:aload_0         
	//*   7   12:getfield        #125 <Field ArrayList n>
	//*   8   15:ifnull          34
	//*   9   18:aload_0         
	//*  10   19:getfield        #125 <Field ArrayList n>
	//*  11   22:iload           5
	//*  12   24:invokestatic    #464 <Method Integer Integer.valueOf(int)>
	//*  13   27:invokevirtual   #467 <Method boolean ArrayList.contains(Object)>
	//*  14   30:ifeq            34
			return;
	//   15   33:return          
		if(o != null && o.contains(((Object) (view))))
	//*  16   34:aload_0         
	//*  17   35:getfield        #127 <Field ArrayList o>
	//*  18   38:ifnull          53
	//*  19   41:aload_0         
	//*  20   42:getfield        #127 <Field ArrayList o>
	//*  21   45:aload_1         
	//*  22   46:invokevirtual   #467 <Method boolean ArrayList.contains(Object)>
	//*  23   49:ifeq            53
			return;
	//   24   52:return          
		ArrayList arraylist = p;
	//   25   53:aload_0         
	//   26   54:getfield        #129 <Field ArrayList p>
	//   27   57:astore          7
		boolean flag1 = false;
	//   28   59:iconst_0        
	//   29   60:istore          4
		if(arraylist != null)
	//*  30   62:aload           7
	//*  31   64:ifnull          110
		{
			int j2 = p.size();
	//   32   67:aload_0         
	//   33   68:getfield        #129 <Field ArrayList p>
	//   34   71:invokevirtual   #468 <Method int ArrayList.size()>
	//   35   74:istore          6
			for(int i1 = 0; i1 < j2; i1++)
	//*  36   76:iconst_0        
	//*  37   77:istore_3        
	//*  38   78:iload_3         
	//*  39   79:iload           6
	//*  40   81:icmpge          110
				if(((Class)p.get(i1)).isInstance(((Object) (view))))
	//*  41   84:aload_0         
	//*  42   85:getfield        #129 <Field ArrayList p>
	//*  43   88:iload_3         
	//*  44   89:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//*  45   92:checkcast       #98  <Class Class>
	//*  46   95:aload_1         
	//*  47   96:invokevirtual   #472 <Method boolean Class.isInstance(Object)>
	//*  48   99:ifeq            103
					return;
	//   49  102:return          

	//   50  103:iload_3         
	//   51  104:iconst_1        
	//   52  105:iadd            
	//   53  106:istore_3        
		}
	//*  54  107:goto            78
		if(view.getParent() instanceof ViewGroup)
	//*  55  110:aload_1         
	//*  56  111:invokevirtual   #301 <Method android.view.ViewParent View.getParent()>
	//*  57  114:instanceof      #474 <Class ViewGroup>
	//*  58  117:ifeq            200
		{
			ah ah1 = new ah();
	//   59  120:new             #350 <Class ah>
	//   60  123:dup             
	//   61  124:invokespecial   #475 <Method void ah()>
	//   62  127:astore          8
			ah1.b = view;
	//   63  129:aload           8
	//   64  131:aload_1         
	//   65  132:putfield        #353 <Field View ah.b>
			if(flag)
	//*  66  135:iload_2         
	//*  67  136:ifeq            148
				a(ah1);
	//   68  139:aload_0         
	//   69  140:aload           8
	//   70  142:invokevirtual   #478 <Method void a(ah)>
			else
	//*  71  145:goto            154
				b(ah1);
	//   72  148:aload_0         
	//   73  149:aload           8
	//   74  151:invokevirtual   #480 <Method void b(ah)>
			ah1.c.add(((Object) (this)));
	//   75  154:aload           8
	//   76  156:getfield        #481 <Field ArrayList android.support.transition.ah.c>
	//   77  159:aload_0         
	//   78  160:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//   79  163:pop             
			c(ah1);
	//   80  164:aload_0         
	//   81  165:aload           8
	//   82  167:invokevirtual   #483 <Method void c(ah)>
			ai ai1;
			if(flag)
	//*  83  170:iload_2         
	//*  84  171:ifeq            191
				ai1 = u;
	//   85  174:aload_0         
	//   86  175:getfield        #142 <Field ai u>
	//   87  178:astore          7
			else
	//*  88  180:aload           7
	//*  89  182:aload_1         
	//*  90  183:aload           8
	//*  91  185:invokestatic    #485 <Method void a(ai, View, ah)>
	//*  92  188:goto            200
				ai1 = v;
	//   93  191:aload_0         
	//   94  192:getfield        #144 <Field ai v>
	//   95  195:astore          7
			a(ai1, view, ah1);
		}
	//*  96  197:goto            180
		if(view instanceof ViewGroup)
	//*  97  200:aload_1         
	//*  98  201:instanceof      #474 <Class ViewGroup>
	//*  99  204:ifeq            332
		{
			if(r != null && r.contains(((Object) (Integer.valueOf(l1)))))
	//* 100  207:aload_0         
	//* 101  208:getfield        #133 <Field ArrayList r>
	//* 102  211:ifnull          230
	//* 103  214:aload_0         
	//* 104  215:getfield        #133 <Field ArrayList r>
	//* 105  218:iload           5
	//* 106  220:invokestatic    #464 <Method Integer Integer.valueOf(int)>
	//* 107  223:invokevirtual   #467 <Method boolean ArrayList.contains(Object)>
	//* 108  226:ifeq            230
				return;
	//  109  229:return          
			if(s != null && s.contains(((Object) (view))))
	//* 110  230:aload_0         
	//* 111  231:getfield        #135 <Field ArrayList s>
	//* 112  234:ifnull          249
	//* 113  237:aload_0         
	//* 114  238:getfield        #135 <Field ArrayList s>
	//* 115  241:aload_1         
	//* 116  242:invokevirtual   #467 <Method boolean ArrayList.contains(Object)>
	//* 117  245:ifeq            249
				return;
	//  118  248:return          
			if(t != null)
	//* 119  249:aload_0         
	//* 120  250:getfield        #137 <Field ArrayList t>
	//* 121  253:ifnull          299
			{
				int i2 = t.size();
	//  122  256:aload_0         
	//  123  257:getfield        #137 <Field ArrayList t>
	//  124  260:invokevirtual   #468 <Method int ArrayList.size()>
	//  125  263:istore          5
				for(int j1 = 0; j1 < i2; j1++)
	//* 126  265:iconst_0        
	//* 127  266:istore_3        
	//* 128  267:iload_3         
	//* 129  268:iload           5
	//* 130  270:icmpge          299
					if(((Class)t.get(j1)).isInstance(((Object) (view))))
	//* 131  273:aload_0         
	//* 132  274:getfield        #137 <Field ArrayList t>
	//* 133  277:iload_3         
	//* 134  278:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//* 135  281:checkcast       #98  <Class Class>
	//* 136  284:aload_1         
	//* 137  285:invokevirtual   #472 <Method boolean Class.isInstance(Object)>
	//* 138  288:ifeq            292
						return;
	//  139  291:return          

	//  140  292:iload_3         
	//  141  293:iconst_1        
	//  142  294:iadd            
	//  143  295:istore_3        
			}
	//* 144  296:goto            267
			view = ((View) ((ViewGroup)view));
	//  145  299:aload_1         
	//  146  300:checkcast       #474 <Class ViewGroup>
	//  147  303:astore_1        
			for(int k1 = ((int) (flag1)); k1 < ((ViewGroup) (view)).getChildCount(); k1++)
	//* 148  304:iload           4
	//* 149  306:istore_3        
	//* 150  307:iload_3         
	//* 151  308:aload_1         
	//* 152  309:invokevirtual   #488 <Method int ViewGroup.getChildCount()>
	//* 153  312:icmpge          332
				c(((ViewGroup) (view)).getChildAt(k1), flag);
	//  154  315:aload_0         
	//  155  316:aload_1         
	//  156  317:iload_3         
	//  157  318:invokevirtual   #492 <Method View ViewGroup.getChildAt(int)>
	//  158  321:iload_2         
	//  159  322:invokespecial   #494 <Method void c(View, boolean)>

	//  160  325:iload_3         
	//  161  326:iconst_1        
	//  162  327:iadd            
	//  163  328:istore_3        
		}
	//* 164  329:goto            307
	//  165  332:return          
	}

	private static android.support.v4.f.a l()
	{
		android.support.v4.f.a a2 = (android.support.v4.f.a)z.get();
	//    0    0:getstatic       #90  <Field ThreadLocal z>
	//    1    3:invokevirtual   #498 <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #241 <Class a>
	//    3    9:astore_1        
		android.support.v4.f.a a1 = a2;
	//    4   10:aload_1         
	//    5   11:astore_0        
		if(a2 == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       31
		{
			a1 = new android.support.v4.f.a();
	//    8   16:new             #241 <Class a>
	//    9   19:dup             
	//   10   20:invokespecial   #499 <Method void a()>
	//   11   23:astore_0        
			z.set(((Object) (a1)));
	//   12   24:getstatic       #90  <Field ThreadLocal z>
	//   13   27:aload_0         
	//   14   28:invokevirtual   #503 <Method void ThreadLocal.set(Object)>
		}
		return a1;
	//   15   31:aload_0         
	//   16   32:areturn         
	}

	public Animator a(ViewGroup viewgroup, ah ah1, ah ah2)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Transition a(long l1)
	{
		a = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #110 <Field long a>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Transition a(TimeInterpolator timeinterpolator)
	{
		k = timeinterpolator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #112 <Field TimeInterpolator k>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Transition a(c c1)
	{
		if(F == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field ArrayList F>
	//*   2    4:ifnonnull       18
			F = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #114 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #115 <Method void ArrayList()>
	//    7   15:putfield        #162 <Field ArrayList F>
		F.add(((Object) (c1)));
	//    8   18:aload_0         
	//    9   19:getfield        #162 <Field ArrayList F>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public ah a(View view, boolean flag)
	{
		if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #146 <Field TransitionSet d>
	//*   2    4:ifnull          17
			return d.a(view, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #146 <Field TransitionSet d>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #511 <Method ah android.support.transition.TransitionSet.a(View, boolean)>
	//    8   16:areturn         
		ai ai1;
		if(flag)
	//*   9   17:iload_2         
	//*  10   18:ifeq            29
			ai1 = u;
	//   11   21:aload_0         
	//   12   22:getfield        #142 <Field ai u>
	//   13   25:astore_3        
		else
	//*  14   26:goto            34
			ai1 = v;
	//   15   29:aload_0         
	//   16   30:getfield        #144 <Field ai v>
	//   17   33:astore_3        
		return (ah)ai1.a.get(((Object) (view)));
	//   18   34:aload_3         
	//   19   35:getfield        #243 <Field a android.support.transition.ai.a>
	//   20   38:aload_1         
	//   21   39:invokevirtual   #368 <Method Object a.get(Object)>
	//   22   42:checkcast       #350 <Class ah>
	//   23   45:areturn         
	}

	String a(String s1)
	{
		Object obj;
label0:
		{
			obj = ((Object) (new StringBuilder()));
	//    0    0:new             #441 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #442 <Method void StringBuilder()>
	//    3    7:astore          4
			((StringBuilder) (obj)).append(s1);
	//    4    9:aload           4
	//    5   11:aload_1         
	//    6   12:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
			((StringBuilder) (obj)).append(((Object)this).getClass().getSimpleName());
	//    8   16:aload           4
	//    9   18:aload_0         
	//   10   19:invokevirtual   #96  <Method Class Object.getClass()>
	//   11   22:invokevirtual   #515 <Method String Class.getSimpleName()>
	//   12   25:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
			((StringBuilder) (obj)).append("@");
	//   14   29:aload           4
	//   15   31:ldc2            #517 <String "@">
	//   16   34:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			((StringBuilder) (obj)).append(Integer.toHexString(((Object)this).hashCode()));
	//   18   38:aload           4
	//   19   40:aload_0         
	//   20   41:invokevirtual   #520 <Method int Object.hashCode()>
	//   21   44:invokestatic    #524 <Method String Integer.toHexString(int)>
	//   22   47:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//   23   50:pop             
			((StringBuilder) (obj)).append(": ");
	//   24   51:aload           4
	//   25   53:ldc2            #526 <String ": ">
	//   26   56:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//   27   59:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   28   60:aload           4
	//   29   62:invokevirtual   #455 <Method String StringBuilder.toString()>
	//   30   65:astore          4
			s1 = ((String) (obj));
	//   31   67:aload           4
	//   32   69:astore_1        
			if(a != -1L)
	//*  33   70:aload_0         
	//*  34   71:getfield        #110 <Field long a>
	//*  35   74:ldc2w           #105 <Long -1L>
	//*  36   77:lcmp            
	//*  37   78:ifeq            126
			{
				s1 = ((String) (new StringBuilder()));
	//   38   81:new             #441 <Class StringBuilder>
	//   39   84:dup             
	//   40   85:invokespecial   #442 <Method void StringBuilder()>
	//   41   88:astore_1        
				((StringBuilder) (s1)).append(((String) (obj)));
	//   42   89:aload_1         
	//   43   90:aload           4
	//   44   92:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//   45   95:pop             
				((StringBuilder) (s1)).append("dur(");
	//   46   96:aload_1         
	//   47   97:ldc2            #528 <String "dur(">
	//   48  100:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//   49  103:pop             
				((StringBuilder) (s1)).append(a);
	//   50  104:aload_1         
	//   51  105:aload_0         
	//   52  106:getfield        #110 <Field long a>
	//   53  109:invokevirtual   #531 <Method StringBuilder StringBuilder.append(long)>
	//   54  112:pop             
				((StringBuilder) (s1)).append(") ");
	//   55  113:aload_1         
	//   56  114:ldc2            #533 <String ") ">
	//   57  117:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//   58  120:pop             
				s1 = ((StringBuilder) (s1)).toString();
	//   59  121:aload_1         
	//   60  122:invokevirtual   #455 <Method String StringBuilder.toString()>
	//   61  125:astore_1        
			}
			obj = ((Object) (s1));
	//   62  126:aload_1         
	//   63  127:astore          4
			if(j != -1L)
	//*  64  129:aload_0         
	//*  65  130:getfield        #108 <Field long j>
	//*  66  133:ldc2w           #105 <Long -1L>
	//*  67  136:lcmp            
	//*  68  137:ifeq            191
			{
				obj = ((Object) (new StringBuilder()));
	//   69  140:new             #441 <Class StringBuilder>
	//   70  143:dup             
	//   71  144:invokespecial   #442 <Method void StringBuilder()>
	//   72  147:astore          4
				((StringBuilder) (obj)).append(s1);
	//   73  149:aload           4
	//   74  151:aload_1         
	//   75  152:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//   76  155:pop             
				((StringBuilder) (obj)).append("dly(");
	//   77  156:aload           4
	//   78  158:ldc2            #535 <String "dly(">
	//   79  161:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//   80  164:pop             
				((StringBuilder) (obj)).append(j);
	//   81  165:aload           4
	//   82  167:aload_0         
	//   83  168:getfield        #108 <Field long j>
	//   84  171:invokevirtual   #531 <Method StringBuilder StringBuilder.append(long)>
	//   85  174:pop             
				((StringBuilder) (obj)).append(") ");
	//   86  175:aload           4
	//   87  177:ldc2            #533 <String ") ">
	//   88  180:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//   89  183:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   90  184:aload           4
	//   91  186:invokevirtual   #455 <Method String StringBuilder.toString()>
	//   92  189:astore          4
			}
			s1 = ((String) (obj));
	//   93  191:aload           4
	//   94  193:astore_1        
			if(k != null)
	//*  95  194:aload_0         
	//*  96  195:getfield        #112 <Field TimeInterpolator k>
	//*  97  198:ifnull          246
			{
				s1 = ((String) (new StringBuilder()));
	//   98  201:new             #441 <Class StringBuilder>
	//   99  204:dup             
	//  100  205:invokespecial   #442 <Method void StringBuilder()>
	//  101  208:astore_1        
				((StringBuilder) (s1)).append(((String) (obj)));
	//  102  209:aload_1         
	//  103  210:aload           4
	//  104  212:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//  105  215:pop             
				((StringBuilder) (s1)).append("interp(");
	//  106  216:aload_1         
	//  107  217:ldc2            #537 <String "interp(">
	//  108  220:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//  109  223:pop             
				((StringBuilder) (s1)).append(((Object) (k)));
	//  110  224:aload_1         
	//  111  225:aload_0         
	//  112  226:getfield        #112 <Field TimeInterpolator k>
	//  113  229:invokevirtual   #540 <Method StringBuilder StringBuilder.append(Object)>
	//  114  232:pop             
				((StringBuilder) (s1)).append(") ");
	//  115  233:aload_1         
	//  116  234:ldc2            #533 <String ") ">
	//  117  237:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//  118  240:pop             
				s1 = ((StringBuilder) (s1)).toString();
	//  119  241:aload_1         
	//  120  242:invokevirtual   #455 <Method String StringBuilder.toString()>
	//  121  245:astore_1        
			}
			if(b.size() <= 0)
	//* 122  246:aload_0         
	//* 123  247:getfield        #117 <Field ArrayList b>
	//* 124  250:invokevirtual   #468 <Method int ArrayList.size()>
	//* 125  253:ifgt            269
			{
				obj = ((Object) (s1));
	//  126  256:aload_1         
	//  127  257:astore          4
				if(c.size() <= 0)
					break label0;
	//  128  259:aload_0         
	//  129  260:getfield        #119 <Field ArrayList c>
	//  130  263:invokevirtual   #468 <Method int ArrayList.size()>
	//  131  266:ifle            550
			}
			obj = ((Object) (new StringBuilder()));
	//  132  269:new             #441 <Class StringBuilder>
	//  133  272:dup             
	//  134  273:invokespecial   #442 <Method void StringBuilder()>
	//  135  276:astore          4
			((StringBuilder) (obj)).append(s1);
	//  136  278:aload           4
	//  137  280:aload_1         
	//  138  281:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//  139  284:pop             
			((StringBuilder) (obj)).append("tgts(");
	//  140  285:aload           4
	//  141  287:ldc2            #542 <String "tgts(">
	//  142  290:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//  143  293:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  144  294:aload           4
	//  145  296:invokevirtual   #455 <Method String StringBuilder.toString()>
	//  146  299:astore          4
			int i1 = b.size();
	//  147  301:aload_0         
	//  148  302:getfield        #117 <Field ArrayList b>
	//  149  305:invokevirtual   #468 <Method int ArrayList.size()>
	//  150  308:istore_2        
			boolean flag = false;
	//  151  309:iconst_0        
	//  152  310:istore_3        
			s1 = ((String) (obj));
	//  153  311:aload           4
	//  154  313:astore_1        
			if(i1 > 0)
	//* 155  314:iload_2         
	//* 156  315:ifle            413
			{
				s1 = ((String) (obj));
	//  157  318:aload           4
	//  158  320:astore_1        
				for(int j1 = 0; j1 < b.size(); j1++)
	//* 159  321:iconst_0        
	//* 160  322:istore_2        
	//* 161  323:iload_2         
	//* 162  324:aload_0         
	//* 163  325:getfield        #117 <Field ArrayList b>
	//* 164  328:invokevirtual   #468 <Method int ArrayList.size()>
	//* 165  331:icmpge          413
				{
					obj = ((Object) (s1));
	//  166  334:aload_1         
	//  167  335:astore          4
					if(j1 > 0)
	//* 168  337:iload_2         
	//* 169  338:ifle            373
					{
						obj = ((Object) (new StringBuilder()));
	//  170  341:new             #441 <Class StringBuilder>
	//  171  344:dup             
	//  172  345:invokespecial   #442 <Method void StringBuilder()>
	//  173  348:astore          4
						((StringBuilder) (obj)).append(s1);
	//  174  350:aload           4
	//  175  352:aload_1         
	//  176  353:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//  177  356:pop             
						((StringBuilder) (obj)).append(", ");
	//  178  357:aload           4
	//  179  359:ldc2            #544 <String ", ">
	//  180  362:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//  181  365:pop             
						obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  182  366:aload           4
	//  183  368:invokevirtual   #455 <Method String StringBuilder.toString()>
	//  184  371:astore          4
					}
					s1 = ((String) (new StringBuilder()));
	//  185  373:new             #441 <Class StringBuilder>
	//  186  376:dup             
	//  187  377:invokespecial   #442 <Method void StringBuilder()>
	//  188  380:astore_1        
					((StringBuilder) (s1)).append(((String) (obj)));
	//  189  381:aload_1         
	//  190  382:aload           4
	//  191  384:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//  192  387:pop             
					((StringBuilder) (s1)).append(b.get(j1));
	//  193  388:aload_1         
	//  194  389:aload_0         
	//  195  390:getfield        #117 <Field ArrayList b>
	//  196  393:iload_2         
	//  197  394:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//  198  397:invokevirtual   #540 <Method StringBuilder StringBuilder.append(Object)>
	//  199  400:pop             
					s1 = ((StringBuilder) (s1)).toString();
	//  200  401:aload_1         
	//  201  402:invokevirtual   #455 <Method String StringBuilder.toString()>
	//  202  405:astore_1        
				}

	//  203  406:iload_2         
	//  204  407:iconst_1        
	//  205  408:iadd            
	//  206  409:istore_2        
			}
	//* 207  410:goto            323
			obj = ((Object) (s1));
	//  208  413:aload_1         
	//  209  414:astore          4
			if(c.size() > 0)
	//* 210  416:aload_0         
	//* 211  417:getfield        #119 <Field ArrayList c>
	//* 212  420:invokevirtual   #468 <Method int ArrayList.size()>
	//* 213  423:ifle            521
			{
				int k1 = ((int) (flag));
	//  214  426:iload_3         
	//  215  427:istore_2        
				do
				{
					obj = ((Object) (s1));
	//  216  428:aload_1         
	//  217  429:astore          4
					if(k1 >= c.size())
						break;
	//  218  431:iload_2         
	//  219  432:aload_0         
	//  220  433:getfield        #119 <Field ArrayList c>
	//  221  436:invokevirtual   #468 <Method int ArrayList.size()>
	//  222  439:icmpge          521
					obj = ((Object) (s1));
	//  223  442:aload_1         
	//  224  443:astore          4
					if(k1 > 0)
	//* 225  445:iload_2         
	//* 226  446:ifle            481
					{
						obj = ((Object) (new StringBuilder()));
	//  227  449:new             #441 <Class StringBuilder>
	//  228  452:dup             
	//  229  453:invokespecial   #442 <Method void StringBuilder()>
	//  230  456:astore          4
						((StringBuilder) (obj)).append(s1);
	//  231  458:aload           4
	//  232  460:aload_1         
	//  233  461:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//  234  464:pop             
						((StringBuilder) (obj)).append(", ");
	//  235  465:aload           4
	//  236  467:ldc2            #544 <String ", ">
	//  237  470:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//  238  473:pop             
						obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  239  474:aload           4
	//  240  476:invokevirtual   #455 <Method String StringBuilder.toString()>
	//  241  479:astore          4
					}
					s1 = ((String) (new StringBuilder()));
	//  242  481:new             #441 <Class StringBuilder>
	//  243  484:dup             
	//  244  485:invokespecial   #442 <Method void StringBuilder()>
	//  245  488:astore_1        
					((StringBuilder) (s1)).append(((String) (obj)));
	//  246  489:aload_1         
	//  247  490:aload           4
	//  248  492:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//  249  495:pop             
					((StringBuilder) (s1)).append(c.get(k1));
	//  250  496:aload_1         
	//  251  497:aload_0         
	//  252  498:getfield        #119 <Field ArrayList c>
	//  253  501:iload_2         
	//  254  502:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//  255  505:invokevirtual   #540 <Method StringBuilder StringBuilder.append(Object)>
	//  256  508:pop             
					s1 = ((StringBuilder) (s1)).toString();
	//  257  509:aload_1         
	//  258  510:invokevirtual   #455 <Method String StringBuilder.toString()>
	//  259  513:astore_1        
					k1++;
	//  260  514:iload_2         
	//  261  515:iconst_1        
	//  262  516:iadd            
	//  263  517:istore_2        
				} while(true);
	//  264  518:goto            428
			}
			s1 = ((String) (new StringBuilder()));
	//  265  521:new             #441 <Class StringBuilder>
	//  266  524:dup             
	//  267  525:invokespecial   #442 <Method void StringBuilder()>
	//  268  528:astore_1        
			((StringBuilder) (s1)).append(((String) (obj)));
	//  269  529:aload_1         
	//  270  530:aload           4
	//  271  532:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//  272  535:pop             
			((StringBuilder) (s1)).append(")");
	//  273  536:aload_1         
	//  274  537:ldc2            #546 <String ")">
	//  275  540:invokevirtual   #448 <Method StringBuilder StringBuilder.append(String)>
	//  276  543:pop             
			obj = ((Object) (((StringBuilder) (s1)).toString()));
	//  277  544:aload_1         
	//  278  545:invokevirtual   #455 <Method String StringBuilder.toString()>
	//  279  548:astore          4
		}
		return ((String) (obj));
	//  280  550:aload           4
	//  281  552:areturn         
	}

	protected void a(Animator animator)
	{
		if(animator == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
		{
			g();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #548 <Method void g()>
			return;
	//    4    8:return          
		}
		if(b() >= 0L)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #551 <Method long b()>
	//*   7   13:lconst_0        
	//*   8   14:lcmp            
	//*   9   15:iflt            27
			animator.setDuration(b());
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #551 <Method long b()>
	//   13   23:invokevirtual   #555 <Method Animator Animator.setDuration(long)>
	//   14   26:pop             
		if(c() >= 0L)
	//*  15   27:aload_0         
	//*  16   28:invokevirtual   #557 <Method long c()>
	//*  17   31:lconst_0        
	//*  18   32:lcmp            
	//*  19   33:iflt            44
			animator.setStartDelay(c());
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:invokevirtual   #557 <Method long c()>
	//   23   41:invokevirtual   #561 <Method void Animator.setStartDelay(long)>
		if(d() != null)
	//*  24   44:aload_0         
	//*  25   45:invokevirtual   #564 <Method TimeInterpolator d()>
	//*  26   48:ifnull          59
			animator.setInterpolator(d());
	//   27   51:aload_1         
	//   28   52:aload_0         
	//   29   53:invokevirtual   #564 <Method TimeInterpolator d()>
	//   30   56:invokevirtual   #568 <Method void Animator.setInterpolator(TimeInterpolator)>
		animator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationEnd(Animator animator1)
			{
				a.g();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field Transition a>
			//    2    4:invokevirtual   #22  <Method void Transition.g()>
				animator1.removeListener(((android.animation.Animator.AnimatorListener) (this)));
			//    3    7:aload_1         
			//    4    8:aload_0         
			//    5    9:invokevirtual   #28  <Method void Animator.removeListener(android.animation.Animator$AnimatorListener)>
			//    6   12:return          
			}

			final Transition a;

			
			{
				a = Transition.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field Transition a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
		}
)));
	//   31   59:aload_1         
	//   32   60:new             #12  <Class Transition$3>
	//   33   63:dup             
	//   34   64:aload_0         
	//   35   65:invokespecial   #571 <Method void Transition$3(Transition)>
	//   36   68:invokevirtual   #233 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
		animator.start();
	//   37   71:aload_1         
	//   38   72:invokevirtual   #574 <Method void Animator.start()>
	//   39   75:return          
	}

	public void a(af af1)
	{
		f = af1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #577 <Field af f>
	//    3    5:return          
	}

	public abstract void a(ah ah1);

	void a(ViewGroup viewgroup)
	{
		x = new ArrayList();
	//    0    0:aload_0         
	//    1    1:new             #114 <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #115 <Method void ArrayList()>
	//    4    8:putfield        #357 <Field ArrayList x>
		y = new ArrayList();
	//    5   11:aload_0         
	//    6   12:new             #114 <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #115 <Method void ArrayList()>
	//    9   19:putfield        #362 <Field ArrayList y>
		a(u, v);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #142 <Field ai u>
	//   13   27:aload_0         
	//   14   28:getfield        #144 <Field ai v>
	//   15   31:invokespecial   #580 <Method void a(ai, ai)>
		android.support.v4.f.a a1 = l();
	//   16   34:invokestatic    #582 <Method a l()>
	//   17   37:astore          4
		int i1 = a1.size();
	//   18   39:aload           4
	//   19   41:invokevirtual   #338 <Method int a.size()>
	//   20   44:istore_2        
		be be = au.b(((View) (viewgroup)));
	//   21   45:aload_1         
	//   22   46:invokestatic    #587 <Method be au.b(View)>
	//   23   49:astore          5
		for(i1--; i1 >= 0; i1--)
	//*  24   51:iload_2         
	//*  25   52:iconst_1        
	//*  26   53:isub            
	//*  27   54:istore_2        
	//*  28   55:iload_2         
	//*  29   56:iflt            223
		{
			Animator animator = (Animator)a1.b(i1);
	//   30   59:aload           4
	//   31   61:iload_2         
	//   32   62:invokevirtual   #341 <Method Object a.b(int)>
	//   33   65:checkcast       #229 <Class Animator>
	//   34   68:astore          6
			if(animator == null)
				continue;
	//   35   70:aload           6
	//   36   72:ifnull          216
			a a2 = (a)a1.get(((Object) (animator)));
	//   37   75:aload           4
	//   38   77:aload           6
	//   39   79:invokevirtual   #368 <Method Object a.get(Object)>
	//   40   82:checkcast       #14  <Class Transition$a>
	//   41   85:astore          7
			if(a2 == null || a2.a == null || !((Object) (be)).equals(((Object) (a2.d))))
				continue;
	//   42   87:aload           7
	//   43   89:ifnull          216
	//   44   92:aload           7
	//   45   94:getfield        #589 <Field View android.support.transition.Transition$a.a>
	//   46   97:ifnull          216
	//   47  100:aload           5
	//   48  102:aload           7
	//   49  104:getfield        #592 <Field be Transition$a.d>
	//   50  107:invokevirtual   #396 <Method boolean Object.equals(Object)>
	//   51  110:ifeq            216
			ah ah1 = a2.c;
	//   52  113:aload           7
	//   53  115:getfield        #595 <Field ah android.support.transition.Transition$a.c>
	//   54  118:astore          8
			Object obj = ((Object) (a2.a));
	//   55  120:aload           7
	//   56  122:getfield        #589 <Field View android.support.transition.Transition$a.a>
	//   57  125:astore          10
			ah ah2 = a(((View) (obj)), true);
	//   58  127:aload_0         
	//   59  128:aload           10
	//   60  130:iconst_1        
	//   61  131:invokevirtual   #596 <Method ah a(View, boolean)>
	//   62  134:astore          9
			obj = ((Object) (b(((View) (obj)), true)));
	//   63  136:aload_0         
	//   64  137:aload           10
	//   65  139:iconst_1        
	//   66  140:invokevirtual   #598 <Method ah b(View, boolean)>
	//   67  143:astore          10
			boolean flag;
			if((ah2 != null || obj != null) && a2.e.a(ah1, ((ah) (obj))))
	//*  68  145:aload           9
	//*  69  147:ifnonnull       155
	//*  70  150:aload           10
	//*  71  152:ifnull          175
	//*  72  155:aload           7
	//*  73  157:getfield        #601 <Field Transition Transition$a.e>
	//*  74  160:aload           8
	//*  75  162:aload           10
	//*  76  164:invokevirtual   #604 <Method boolean a(ah, ah)>
	//*  77  167:ifeq            175
				flag = true;
	//   78  170:iconst_1        
	//   79  171:istore_3        
			else
	//*  80  172:goto            177
				flag = false;
	//   81  175:iconst_0        
	//   82  176:istore_3        
			if(!flag)
				continue;
	//   83  177:iload_3         
	//   84  178:ifeq            216
			if(!animator.isRunning() && !animator.isStarted())
	//*  85  181:aload           6
	//*  86  183:invokevirtual   #607 <Method boolean Animator.isRunning()>
	//*  87  186:ifne            211
	//*  88  189:aload           6
	//*  89  191:invokevirtual   #610 <Method boolean Animator.isStarted()>
	//*  90  194:ifeq            200
	//*  91  197:goto            211
				a1.remove(((Object) (animator)));
	//   92  200:aload           4
	//   93  202:aload           6
	//   94  204:invokevirtual   #348 <Method Object a.remove(Object)>
	//   95  207:pop             
			else
	//*  96  208:goto            216
				animator.cancel();
	//   97  211:aload           6
	//   98  213:invokevirtual   #613 <Method void Animator.cancel()>
		}

	//   99  216:iload_2         
	//  100  217:iconst_1        
	//  101  218:isub            
	//  102  219:istore_2        
	//* 103  220:goto            55
		a(viewgroup, u, v, x, y);
	//  104  223:aload_0         
	//  105  224:aload_1         
	//  106  225:aload_0         
	//  107  226:getfield        #142 <Field ai u>
	//  108  229:aload_0         
	//  109  230:getfield        #144 <Field ai v>
	//  110  233:aload_0         
	//  111  234:getfield        #357 <Field ArrayList x>
	//  112  237:aload_0         
	//  113  238:getfield        #362 <Field ArrayList y>
	//  114  241:invokevirtual   #616 <Method void a(ViewGroup, ai, ai, ArrayList, ArrayList)>
		e();
	//  115  244:aload_0         
	//  116  245:invokevirtual   #618 <Method void e()>
	//  117  248:return          
	}

	protected void a(ViewGroup viewgroup, ai ai1, ai ai2, ArrayList arraylist, ArrayList arraylist1)
	{
		int i1;
		int i2;
		long l2;
		SparseIntArray sparseintarray;
		android.support.v4.f.a a1;
		a1 = l();
	//    0    0:invokestatic    #582 <Method a l()>
	//    1    3:astore          20
		sparseintarray = new SparseIntArray();
	//    2    5:new             #620 <Class SparseIntArray>
	//    3    8:dup             
	//    4    9:invokespecial   #621 <Method void SparseIntArray()>
	//    5   12:astore          19
		i2 = arraylist.size();
	//    6   14:aload           4
	//    7   16:invokevirtual   #468 <Method int ArrayList.size()>
	//    8   19:istore          8
		l2 = 0xffffffffL;
	//    9   21:ldc2w           #622 <Long 0xffffffffL>
	//   10   24:lstore          10
		i1 = 0;
	//   11   26:iconst_0        
	//   12   27:istore          6
_L7:
		if(i1 >= i2) goto _L2; else goto _L1
	//   13   29:iload           6
	//   14   31:iload           8
	//   15   33:icmpge          555
_L1:
		ah ah2;
		ai ai3;
		ah ah1 = (ah)arraylist.get(i1);
	//   16   36:aload           4
	//   17   38:iload           6
	//   18   40:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//   19   43:checkcast       #350 <Class ah>
	//   20   46:astore          14
		ai1 = ((ai) ((ah)arraylist1.get(i1)));
	//   21   48:aload           5
	//   22   50:iload           6
	//   23   52:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//   24   55:checkcast       #350 <Class ah>
	//   25   58:astore_2        
		ah2 = ah1;
	//   26   59:aload           14
	//   27   61:astore          15
		if(ah1 != null)
	//*  28   63:aload           14
	//*  29   65:ifnull          87
		{
			ah2 = ah1;
	//   30   68:aload           14
	//   31   70:astore          15
			if(!ah1.c.contains(((Object) (this))))
	//*  32   72:aload           14
	//*  33   74:getfield        #481 <Field ArrayList android.support.transition.ah.c>
	//*  34   77:aload_0         
	//*  35   78:invokevirtual   #467 <Method boolean ArrayList.contains(Object)>
	//*  36   81:ifne            87
				ah2 = null;
	//   37   84:aconst_null     
	//   38   85:astore          15
		}
		ai3 = ai1;
	//   39   87:aload_2         
	//   40   88:astore          16
		if(ai1 != null)
	//*  41   90:aload_2         
	//*  42   91:ifnull          111
		{
			ai3 = ai1;
	//   43   94:aload_2         
	//   44   95:astore          16
			if(!((ah) (ai1)).c.contains(((Object) (this))))
	//*  45   97:aload_2         
	//*  46   98:getfield        #481 <Field ArrayList android.support.transition.ah.c>
	//*  47  101:aload_0         
	//*  48  102:invokevirtual   #467 <Method boolean ArrayList.contains(Object)>
	//*  49  105:ifne            111
				ai3 = null;
	//   50  108:aconst_null     
	//   51  109:astore          16
		}
		if(ah2 != null || ai3 != null) goto _L4; else goto _L3
	//   52  111:aload           15
	//   53  113:ifnonnull       132
	//   54  116:aload           16
	//   55  118:ifnonnull       132
_L3:
		int k1;
		long l3;
		l3 = l2;
	//   56  121:lload           10
	//   57  123:lstore          12
		k1 = i1;
	//   58  125:iload           6
	//   59  127:istore          7
		break MISSING_BLOCK_LABEL_542;
	//   60  129:goto            542
_L4:
		if(ah2 != null && ai3 != null && !a(ah2, ((ah) (ai3))))
	//*  61  132:aload           15
	//*  62  134:ifnull          162
	//*  63  137:aload           16
	//*  64  139:ifnull          162
	//*  65  142:aload_0         
	//*  66  143:aload           15
	//*  67  145:aload           16
	//*  68  147:invokevirtual   #604 <Method boolean a(ah, ah)>
	//*  69  150:ifeq            156
	//*  70  153:goto            162
			k1 = 0;
	//   71  156:iconst_0        
	//   72  157:istore          7
		else
	//*  73  159:goto            165
			k1 = 1;
	//   74  162:iconst_1        
	//   75  163:istore          7
		if(k1 == 0) goto _L3; else goto _L5
	//   76  165:iload           7
	//   77  167:ifeq            121
_L5:
		ai1 = ((ai) (a(viewgroup, ah2, ((ah) (ai3)))));
	//   78  170:aload_0         
	//   79  171:aload_1         
	//   80  172:aload           15
	//   81  174:aload           16
	//   82  176:invokevirtual   #625 <Method Animator a(ViewGroup, ah, ah)>
	//   83  179:astore_2        
		if(ai1 == null) goto _L3; else goto _L6
	//   84  180:aload_2         
	//   85  181:ifnull          121
_L6:
		Object obj;
		View view;
		if(ai3 != null)
	//*  86  184:aload           16
	//*  87  186:ifnull          430
		{
			view = ((ah) (ai3)).b;
	//   88  189:aload           16
	//   89  191:getfield        #353 <Field View ah.b>
	//   90  194:astore          17
			String as[] = a();
	//   91  196:aload_0         
	//   92  197:invokevirtual   #628 <Method String[] a()>
	//   93  200:astore          21
			if(view != null && as != null && as.length > 0)
	//*  94  202:aload           17
	//*  95  204:ifnull          424
	//*  96  207:aload           21
	//*  97  209:ifnull          424
	//*  98  212:aload           21
	//*  99  214:arraylength     
	//* 100  215:ifle            424
			{
				ah ah3 = new ah();
	//  101  218:new             #350 <Class ah>
	//  102  221:dup             
	//  103  222:invokespecial   #475 <Method void ah()>
	//  104  225:astore          18
				ah3.b = view;
	//  105  227:aload           18
	//  106  229:aload           17
	//  107  231:putfield        #353 <Field View ah.b>
				obj = ((Object) ((ah)ai2.a.get(((Object) (view)))));
	//  108  234:aload_3         
	//  109  235:getfield        #243 <Field a android.support.transition.ai.a>
	//  110  238:aload           17
	//  111  240:invokevirtual   #368 <Method Object a.get(Object)>
	//  112  243:checkcast       #350 <Class ah>
	//  113  246:astore          14
				k1 = i1;
	//  114  248:iload           6
	//  115  250:istore          7
				if(obj != null)
	//* 116  252:aload           14
	//* 117  254:ifnull          312
				{
					int j2 = 0;
	//  118  257:iconst_0        
	//  119  258:istore          9
					do
					{
						k1 = i1;
	//  120  260:iload           6
	//  121  262:istore          7
						if(j2 >= as.length)
							break;
	//  122  264:iload           9
	//  123  266:aload           21
	//  124  268:arraylength     
	//  125  269:icmpge          312
						ah3.a.put(((Object) (as[j2])), ((ah) (obj)).a.get(((Object) (as[j2]))));
	//  126  272:aload           18
	//  127  274:getfield        #390 <Field Map android.support.transition.ah.a>
	//  128  277:aload           21
	//  129  279:iload           9
	//  130  281:aaload          
	//  131  282:aload           14
	//  132  284:getfield        #390 <Field Map android.support.transition.ah.a>
	//  133  287:aload           21
	//  134  289:iload           9
	//  135  291:aaload          
	//  136  292:invokeinterface #393 <Method Object Map.get(Object)>
	//  137  297:invokeinterface #629 <Method Object Map.put(Object, Object)>
	//  138  302:pop             
						j2++;
	//  139  303:iload           9
	//  140  305:iconst_1        
	//  141  306:iadd            
	//  142  307:istore          9
					} while(true);
	//  143  309:goto            260
				}
				i1 = k1;
	//  144  312:iload           7
	//  145  314:istore          6
				int k2 = a1.size();
	//  146  316:aload           20
	//  147  318:invokevirtual   #338 <Method int a.size()>
	//  148  321:istore          9
				k1 = 0;
	//  149  323:iconst_0        
	//  150  324:istore          7
				do
				{
					if(k1 >= k2)
						break;
	//  151  326:iload           7
	//  152  328:iload           9
	//  153  330:icmpge          417
					obj = ((Object) ((a)a1.get(((Object) ((Animator)a1.b(k1))))));
	//  154  333:aload           20
	//  155  335:aload           20
	//  156  337:iload           7
	//  157  339:invokevirtual   #341 <Method Object a.b(int)>
	//  158  342:checkcast       #229 <Class Animator>
	//  159  345:invokevirtual   #368 <Method Object a.get(Object)>
	//  160  348:checkcast       #14  <Class Transition$a>
	//  161  351:astore          14
					if(((a) (obj)).c != null && ((a) (obj)).a == view && ((a) (obj)).b.equals(((Object) (k()))) && ((a) (obj)).c.equals(((Object) (ah3))))
	//* 162  353:aload           14
	//* 163  355:getfield        #595 <Field ah android.support.transition.Transition$a.c>
	//* 164  358:ifnull          408
	//* 165  361:aload           14
	//* 166  363:getfield        #589 <Field View android.support.transition.Transition$a.a>
	//* 167  366:aload           17
	//* 168  368:if_acmpne       408
	//* 169  371:aload           14
	//* 170  373:getfield        #631 <Field String Transition$a.b>
	//* 171  376:aload_0         
	//* 172  377:invokevirtual   #633 <Method String k()>
	//* 173  380:invokevirtual   #634 <Method boolean String.equals(Object)>
	//* 174  383:ifeq            408
	//* 175  386:aload           14
	//* 176  388:getfield        #595 <Field ah android.support.transition.Transition$a.c>
	//* 177  391:aload           18
	//* 178  393:invokevirtual   #635 <Method boolean ah.equals(Object)>
	//* 179  396:ifeq            408
					{
						ai1 = null;
	//  180  399:aconst_null     
	//  181  400:astore_2        
						obj = ((Object) (ah3));
	//  182  401:aload           18
	//  183  403:astore          14
						break MISSING_BLOCK_LABEL_440;
	//  184  405:goto            427
					}
					k1++;
	//  185  408:iload           7
	//  186  410:iconst_1        
	//  187  411:iadd            
	//  188  412:istore          7
				} while(true);
	//  189  414:goto            326
				obj = ((Object) (ah3));
	//  190  417:aload           18
	//  191  419:astore          14
			} else
	//* 192  421:goto            427
			{
				obj = null;
	//  193  424:aconst_null     
	//  194  425:astore          14
			}
		} else
	//* 195  427:goto            440
		{
			view = ah2.b;
	//  196  430:aload           15
	//  197  432:getfield        #353 <Field View ah.b>
	//  198  435:astore          17
			obj = null;
	//  199  437:aconst_null     
	//  200  438:astore          14
		}
		l3 = l2;
	//  201  440:lload           10
	//  202  442:lstore          12
		k1 = i1;
	//  203  444:iload           6
	//  204  446:istore          7
		if(ai1 != null)
	//* 205  448:aload_2         
	//* 206  449:ifnull          542
		{
			l3 = l2;
	//  207  452:lload           10
	//  208  454:lstore          12
			if(f != null)
	//* 209  456:aload_0         
	//* 210  457:getfield        #577 <Field af f>
	//* 211  460:ifnull          502
			{
				l3 = f.a(viewgroup, this, ah2, ((ah) (ai3)));
	//  212  463:aload_0         
	//  213  464:getfield        #577 <Field af f>
	//  214  467:aload_1         
	//  215  468:aload_0         
	//  216  469:aload           15
	//  217  471:aload           16
	//  218  473:invokevirtual   #640 <Method long android.support.transition.af.a(ViewGroup, Transition, ah, ah)>
	//  219  476:lstore          12
				sparseintarray.put(G.size(), (int)l3);
	//  220  478:aload           19
	//  221  480:aload_0         
	//  222  481:getfield        #164 <Field ArrayList G>
	//  223  484:invokevirtual   #468 <Method int ArrayList.size()>
	//  224  487:lload           12
	//  225  489:l2i             
	//  226  490:invokevirtual   #643 <Method void SparseIntArray.put(int, int)>
				l3 = Math.min(l3, l2);
	//  227  493:lload           12
	//  228  495:lload           10
	//  229  497:invokestatic    #649 <Method long Math.min(long, long)>
	//  230  500:lstore          12
			}
			a1.put(((Object) (ai1)), ((Object) (new a(view, k(), this, au.b(((View) (viewgroup))), ((ah) (obj))))));
	//  231  502:aload           20
	//  232  504:aload_2         
	//  233  505:new             #14  <Class Transition$a>
	//  234  508:dup             
	//  235  509:aload           17
	//  236  511:aload_0         
	//  237  512:invokevirtual   #633 <Method String k()>
	//  238  515:aload_0         
	//  239  516:aload_1         
	//  240  517:invokestatic    #587 <Method be au.b(View)>
	//  241  520:aload           14
	//  242  522:invokespecial   #652 <Method void Transition$a(View, String, Transition, be, ah)>
	//  243  525:invokevirtual   #273 <Method Object a.put(Object, Object)>
	//  244  528:pop             
			G.add(((Object) (ai1)));
	//  245  529:aload_0         
	//  246  530:getfield        #164 <Field ArrayList G>
	//  247  533:aload_2         
	//  248  534:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//  249  537:pop             
			k1 = i1;
	//  250  538:iload           6
	//  251  540:istore          7
		}
		i1 = k1 + 1;
	//  252  542:iload           7
	//  253  544:iconst_1        
	//  254  545:iadd            
	//  255  546:istore          6
		l2 = l3;
	//  256  548:lload           12
	//  257  550:lstore          10
		  goto _L7
	//* 258  552:goto            29
_L2:
		if(l2 != 0L)
	//* 259  555:lload           10
	//* 260  557:lconst_0        
	//* 261  558:lcmp            
	//* 262  559:ifeq            626
		{
			for(int j1 = 0; j1 < sparseintarray.size(); j1++)
	//* 263  562:iconst_0        
	//* 264  563:istore          6
	//* 265  565:iload           6
	//* 266  567:aload           19
	//* 267  569:invokevirtual   #653 <Method int SparseIntArray.size()>
	//* 268  572:icmpge          626
			{
				int l1 = sparseintarray.keyAt(j1);
	//  269  575:aload           19
	//  270  577:iload           6
	//  271  579:invokevirtual   #654 <Method int SparseIntArray.keyAt(int)>
	//  272  582:istore          7
				viewgroup = ((ViewGroup) ((Animator)G.get(l1)));
	//  273  584:aload_0         
	//  274  585:getfield        #164 <Field ArrayList G>
	//  275  588:iload           7
	//  276  590:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//  277  593:checkcast       #229 <Class Animator>
	//  278  596:astore_1        
				((Animator) (viewgroup)).setStartDelay(((long)sparseintarray.valueAt(j1) - l2) + ((Animator) (viewgroup)).getStartDelay());
	//  279  597:aload_1         
	//  280  598:aload           19
	//  281  600:iload           6
	//  282  602:invokevirtual   #656 <Method int SparseIntArray.valueAt(int)>
	//  283  605:i2l             
	//  284  606:lload           10
	//  285  608:lsub            
	//  286  609:aload_1         
	//  287  610:invokevirtual   #659 <Method long Animator.getStartDelay()>
	//  288  613:ladd            
	//  289  614:invokevirtual   #561 <Method void Animator.setStartDelay(long)>
			}

	//  290  617:iload           6
	//  291  619:iconst_1        
	//  292  620:iadd            
	//  293  621:istore          6
		}
	//* 294  623:goto            565
		return;
	//  295  626:return          
	}

	void a(ViewGroup viewgroup, boolean flag)
	{
		b(flag);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #664 <Method void b(boolean)>
		int i1 = b.size();
	//    3    5:aload_0         
	//    4    6:getfield        #117 <Field ArrayList b>
	//    5    9:invokevirtual   #468 <Method int ArrayList.size()>
	//    6   12:istore_3        
		boolean flag1 = false;
	//    7   13:iconst_0        
	//    8   14:istore          5
		if(i1 <= 0 && c.size() <= 0 || l != null && !l.isEmpty() || m != null && !m.isEmpty())
	//*   9   16:iload_3         
	//*  10   17:ifgt            30
	//*  11   20:aload_0         
	//*  12   21:getfield        #119 <Field ArrayList c>
	//*  13   24:invokevirtual   #468 <Method int ArrayList.size()>
	//*  14   27:ifle            67
	//*  15   30:aload_0         
	//*  16   31:getfield        #121 <Field ArrayList l>
	//*  17   34:ifnull          47
	//*  18   37:aload_0         
	//*  19   38:getfield        #121 <Field ArrayList l>
	//*  20   41:invokevirtual   #665 <Method boolean ArrayList.isEmpty()>
	//*  21   44:ifeq            67
	//*  22   47:aload_0         
	//*  23   48:getfield        #123 <Field ArrayList m>
	//*  24   51:ifnull          76
	//*  25   54:aload_0         
	//*  26   55:getfield        #123 <Field ArrayList m>
	//*  27   58:invokevirtual   #665 <Method boolean ArrayList.isEmpty()>
	//*  28   61:ifeq            67
	//*  29   64:goto            76
		{
			c(((View) (viewgroup)), flag);
	//   30   67:aload_0         
	//   31   68:aload_1         
	//   32   69:iload_2         
	//   33   70:invokespecial   #494 <Method void c(View, boolean)>
		} else
	//*  34   73:goto            315
		{
			ai ai1;
			for(int j1 = 0; j1 < b.size(); j1++)
	//*  35   76:iconst_0        
	//*  36   77:istore_3        
	//*  37   78:iload_3         
	//*  38   79:aload_0         
	//*  39   80:getfield        #117 <Field ArrayList b>
	//*  40   83:invokevirtual   #468 <Method int ArrayList.size()>
	//*  41   86:icmpge          203
			{
				View view2 = viewgroup.findViewById(((Integer)b.get(j1)).intValue());
	//   42   89:aload_1         
	//   43   90:aload_0         
	//   44   91:getfield        #117 <Field ArrayList b>
	//   45   94:iload_3         
	//   46   95:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//   47   98:checkcast       #460 <Class Integer>
	//   48  101:invokevirtual   #668 <Method int Integer.intValue()>
	//   49  104:invokevirtual   #671 <Method View ViewGroup.findViewById(int)>
	//   50  107:astore          8
				if(view2 == null)
					continue;
	//   51  109:aload           8
	//   52  111:ifnull          196
				ah ah2 = new ah();
	//   53  114:new             #350 <Class ah>
	//   54  117:dup             
	//   55  118:invokespecial   #475 <Method void ah()>
	//   56  121:astore          9
				ah2.b = view2;
	//   57  123:aload           9
	//   58  125:aload           8
	//   59  127:putfield        #353 <Field View ah.b>
				if(flag)
	//*  60  130:iload_2         
	//*  61  131:ifeq            143
					a(ah2);
	//   62  134:aload_0         
	//   63  135:aload           9
	//   64  137:invokevirtual   #478 <Method void a(ah)>
				else
	//*  65  140:goto            149
					b(ah2);
	//   66  143:aload_0         
	//   67  144:aload           9
	//   68  146:invokevirtual   #480 <Method void b(ah)>
				ah2.c.add(((Object) (this)));
	//   69  149:aload           9
	//   70  151:getfield        #481 <Field ArrayList android.support.transition.ah.c>
	//   71  154:aload_0         
	//   72  155:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//   73  158:pop             
				c(ah2);
	//   74  159:aload_0         
	//   75  160:aload           9
	//   76  162:invokevirtual   #483 <Method void c(ah)>
				if(flag)
	//*  77  165:iload_2         
	//*  78  166:ifeq            187
					ai1 = u;
	//   79  169:aload_0         
	//   80  170:getfield        #142 <Field ai u>
	//   81  173:astore          7
				else
	//*  82  175:aload           7
	//*  83  177:aload           8
	//*  84  179:aload           9
	//*  85  181:invokestatic    #485 <Method void a(ai, View, ah)>
	//*  86  184:goto            196
					ai1 = v;
	//   87  187:aload_0         
	//   88  188:getfield        #144 <Field ai v>
	//   89  191:astore          7
				a(ai1, view2, ah2);
			}

	//   90  193:goto            175
	//   91  196:iload_3         
	//   92  197:iconst_1        
	//   93  198:iadd            
	//   94  199:istore_3        
	//*  95  200:goto            78
			for(int k1 = 0; k1 < c.size(); k1++)
	//*  96  203:iconst_0        
	//*  97  204:istore_3        
	//*  98  205:iload_3         
	//*  99  206:aload_0         
	//* 100  207:getfield        #119 <Field ArrayList c>
	//* 101  210:invokevirtual   #468 <Method int ArrayList.size()>
	//* 102  213:icmpge          315
			{
				View view = (View)c.get(k1);
	//  103  216:aload_0         
	//  104  217:getfield        #119 <Field ArrayList c>
	//  105  220:iload_3         
	//  106  221:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//  107  224:checkcast       #275 <Class View>
	//  108  227:astore          7
				ah ah1 = new ah();
	//  109  229:new             #350 <Class ah>
	//  110  232:dup             
	//  111  233:invokespecial   #475 <Method void ah()>
	//  112  236:astore          8
				ah1.b = view;
	//  113  238:aload           8
	//  114  240:aload           7
	//  115  242:putfield        #353 <Field View ah.b>
				if(flag)
	//* 116  245:iload_2         
	//* 117  246:ifeq            258
					a(ah1);
	//  118  249:aload_0         
	//  119  250:aload           8
	//  120  252:invokevirtual   #478 <Method void a(ah)>
				else
	//* 121  255:goto            264
					b(ah1);
	//  122  258:aload_0         
	//  123  259:aload           8
	//  124  261:invokevirtual   #480 <Method void b(ah)>
				ah1.c.add(((Object) (this)));
	//  125  264:aload           8
	//  126  266:getfield        #481 <Field ArrayList android.support.transition.ah.c>
	//  127  269:aload_0         
	//  128  270:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//  129  273:pop             
				c(ah1);
	//  130  274:aload_0         
	//  131  275:aload           8
	//  132  277:invokevirtual   #483 <Method void c(ah)>
				if(flag)
	//* 133  280:iload_2         
	//* 134  281:ifeq            300
					viewgroup = ((ViewGroup) (u));
	//  135  284:aload_0         
	//  136  285:getfield        #142 <Field ai u>
	//  137  288:astore_1        
				else
	//* 138  289:aload_1         
	//* 139  290:aload           7
	//* 140  292:aload           8
	//* 141  294:invokestatic    #485 <Method void a(ai, View, ah)>
	//* 142  297:goto            308
					viewgroup = ((ViewGroup) (v));
	//  143  300:aload_0         
	//  144  301:getfield        #144 <Field ai v>
	//  145  304:astore_1        
				a(((ai) (viewgroup)), view, ah1);
			}

	//  146  305:goto            289
	//  147  308:iload_3         
	//  148  309:iconst_1        
	//  149  310:iadd            
	//  150  311:istore_3        
		}
	//* 151  312:goto            205
		if(!flag && I != null)
	//* 152  315:iload_2         
	//* 153  316:ifne            455
	//* 154  319:aload_0         
	//* 155  320:getfield        #673 <Field a I>
	//* 156  323:ifnull          455
		{
			int j2 = I.size();
	//  157  326:aload_0         
	//  158  327:getfield        #673 <Field a I>
	//  159  330:invokevirtual   #338 <Method int a.size()>
	//  160  333:istore          6
			viewgroup = ((ViewGroup) (new ArrayList(j2)));
	//  161  335:new             #114 <Class ArrayList>
	//  162  338:dup             
	//  163  339:iload           6
	//  164  341:invokespecial   #676 <Method void ArrayList(int)>
	//  165  344:astore_1        
			int l1 = 0;
	//  166  345:iconst_0        
	//  167  346:istore_3        
			int i2;
			do
			{
				i2 = ((int) (flag1));
	//  168  347:iload           5
	//  169  349:istore          4
				if(l1 >= j2)
					break;
	//  170  351:iload_3         
	//  171  352:iload           6
	//  172  354:icmpge          394
				String s1 = (String)I.b(l1);
	//  173  357:aload_0         
	//  174  358:getfield        #673 <Field a I>
	//  175  361:iload_3         
	//  176  362:invokevirtual   #341 <Method Object a.b(int)>
	//  177  365:checkcast       #415 <Class String>
	//  178  368:astore          7
				((ArrayList) (viewgroup)).add(u.d.remove(((Object) (s1))));
	//  179  370:aload_1         
	//  180  371:aload_0         
	//  181  372:getfield        #142 <Field ai u>
	//  182  375:getfield        #260 <Field a ai.d>
	//  183  378:aload           7
	//  184  380:invokevirtual   #348 <Method Object a.remove(Object)>
	//  185  383:invokevirtual   #360 <Method boolean ArrayList.add(Object)>
	//  186  386:pop             
				l1++;
	//  187  387:iload_3         
	//  188  388:iconst_1        
	//  189  389:iadd            
	//  190  390:istore_3        
			} while(true);
	//  191  391:goto            347
			for(; i2 < j2; i2++)
	//* 192  394:iload           4
	//* 193  396:iload           6
	//* 194  398:icmpge          455
			{
				View view1 = (View)((ArrayList) (viewgroup)).get(i2);
	//  195  401:aload_1         
	//  196  402:iload           4
	//  197  404:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//  198  407:checkcast       #275 <Class View>
	//  199  410:astore          7
				if(view1 != null)
	//* 200  412:aload           7
	//* 201  414:ifnull          446
				{
					String s2 = (String)I.c(i2);
	//  202  417:aload_0         
	//  203  418:getfield        #673 <Field a I>
	//  204  421:iload           4
	//  205  423:invokevirtual   #365 <Method Object a.c(int)>
	//  206  426:checkcast       #415 <Class String>
	//  207  429:astore          8
					u.d.put(((Object) (s2)), ((Object) (view1)));
	//  208  431:aload_0         
	//  209  432:getfield        #142 <Field ai u>
	//  210  435:getfield        #260 <Field a ai.d>
	//  211  438:aload           8
	//  212  440:aload           7
	//  213  442:invokevirtual   #273 <Method Object a.put(Object, Object)>
	//  214  445:pop             
				}
			}

	//  215  446:iload           4
	//  216  448:iconst_1        
	//  217  449:iadd            
	//  218  450:istore          4
		}
	//* 219  452:goto            394
	//  220  455:return          
	}

	public transient void a(int ai1[])
	{
		if(ai1 != null && ai1.length != 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          77
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifne            12
	//*   5    9:goto            77
		{
			for(int i1 = 0; i1 < ai1.length; i1++)
	//*   6   12:iconst_0        
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:aload_1         
	//*  10   16:arraylength     
	//*  11   17:icmpge          66
			{
				if(!a(ai1[i1]))
	//*  12   20:aload_1         
	//*  13   21:iload_2         
	//*  14   22:iaload          
	//*  15   23:invokestatic    #678 <Method boolean a(int)>
	//*  16   26:ifne            40
					throw new IllegalArgumentException("matches contains invalid value");
	//   17   29:new             #680 <Class IllegalArgumentException>
	//   18   32:dup             
	//   19   33:ldc2            #682 <String "matches contains invalid value">
	//   20   36:invokespecial   #683 <Method void IllegalArgumentException(String)>
	//   21   39:athrow          
				if(a(ai1, i1))
	//*  22   40:aload_1         
	//*  23   41:iload_2         
	//*  24   42:invokestatic    #685 <Method boolean a(int[], int)>
	//*  25   45:ifeq            59
					throw new IllegalArgumentException("matches contains a duplicate value");
	//   26   48:new             #680 <Class IllegalArgumentException>
	//   27   51:dup             
	//   28   52:ldc2            #687 <String "matches contains a duplicate value">
	//   29   55:invokespecial   #683 <Method void IllegalArgumentException(String)>
	//   30   58:athrow          
			}

	//   31   59:iload_2         
	//   32   60:iconst_1        
	//   33   61:iadd            
	//   34   62:istore_2        
	//*  35   63:goto            14
			ai1 = (int[])((int []) (ai1)).clone();
	//   36   66:aload_1         
	//   37   67:invokevirtual   #691 <Method Object _5B_I.clone()>
	//   38   70:checkcast       #688 <Class int[]>
	//   39   73:astore_1        
		} else
	//*  40   74:goto            81
		{
			ai1 = g;
	//   41   77:getstatic       #80  <Field int[] g>
	//   42   80:astore_1        
		}
		w = ai1;
	//   43   81:aload_0         
	//   44   82:aload_1         
	//   45   83:putfield        #148 <Field int[] w>
	//   46   86:return          
	}

	public boolean a(ah ah1, ah ah2)
	{
		boolean flag;
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
			flag = flag1;
	//    2    3:iload           6
	//    3    5:istore          5
			if(ah1 == null)
				break label0;
	//    4    7:aload_1         
	//    5    8:ifnull          120
			flag = flag1;
	//    6   11:iload           6
	//    7   13:istore          5
			if(ah2 == null)
				break label0;
	//    8   15:aload_2         
	//    9   16:ifnull          120
			String as[] = a();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #628 <Method String[] a()>
	//   12   23:astore          7
			if(as != null)
	//*  13   25:aload           7
	//*  14   27:ifnull          69
			{
				int j1 = as.length;
	//   15   30:aload           7
	//   16   32:arraylength     
	//   17   33:istore          4
				int i1 = 0;
	//   18   35:iconst_0        
	//   19   36:istore_3        
				do
				{
					flag = flag1;
	//   20   37:iload           6
	//   21   39:istore          5
					if(i1 >= j1)
						break label0;
	//   22   41:iload_3         
	//   23   42:iload           4
	//   24   44:icmpge          120
					if(a(ah1, ah2, as[i1]))
	//*  25   47:aload_1         
	//*  26   48:aload_2         
	//*  27   49:aload           7
	//*  28   51:iload_3         
	//*  29   52:aaload          
	//*  30   53:invokestatic    #693 <Method boolean a(ah, ah, String)>
	//*  31   56:ifeq            62
						break;
	//   32   59:goto            117
					i1++;
	//   33   62:iload_3         
	//   34   63:iconst_1        
	//   35   64:iadd            
	//   36   65:istore_3        
				} while(true);
	//   37   66:goto            37
			} else
			{
				Iterator iterator = ah1.a.keySet().iterator();
	//   38   69:aload_1         
	//   39   70:getfield        #390 <Field Map android.support.transition.ah.a>
	//   40   73:invokeinterface #697 <Method Set Map.keySet()>
	//   41   78:invokeinterface #703 <Method Iterator Set.iterator()>
	//   42   83:astore          7
				do
				{
					flag = flag1;
	//   43   85:iload           6
	//   44   87:istore          5
					if(!iterator.hasNext())
						break label0;
	//   45   89:aload           7
	//   46   91:invokeinterface #708 <Method boolean Iterator.hasNext()>
	//   47   96:ifeq            120
				} while(!a(ah1, ah2, (String)iterator.next()));
	//   48   99:aload_1         
	//   49  100:aload_2         
	//   50  101:aload           7
	//   51  103:invokeinterface #711 <Method Object Iterator.next()>
	//   52  108:checkcast       #415 <Class String>
	//   53  111:invokestatic    #693 <Method boolean a(ah, ah, String)>
	//   54  114:ifeq            85
			}
			flag = true;
	//   55  117:iconst_1        
	//   56  118:istore          5
		}
		return flag;
	//   57  120:iload           5
	//   58  122:ireturn         
	}

	public String[] a()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public long b()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field long a>
	//    2    4:lreturn         
	}

	public Transition b(long l1)
	{
		j = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #108 <Field long j>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Transition b(c c1)
	{
		if(F == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field ArrayList F>
	//*   2    4:ifnonnull       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		F.remove(((Object) (c1)));
	//    5    9:aload_0         
	//    6   10:getfield        #162 <Field ArrayList F>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #713 <Method boolean ArrayList.remove(Object)>
	//    9   17:pop             
		if(F.size() == 0)
	//*  10   18:aload_0         
	//*  11   19:getfield        #162 <Field ArrayList F>
	//*  12   22:invokevirtual   #468 <Method int ArrayList.size()>
	//*  13   25:ifne            33
			F = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #162 <Field ArrayList F>
		return this;
	//   17   33:aload_0         
	//   18   34:areturn         
	}

	ah b(View view, boolean flag)
	{
		if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #146 <Field TransitionSet d>
	//*   2    4:ifnull          17
			return d.b(view, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #146 <Field TransitionSet d>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #714 <Method ah TransitionSet.b(View, boolean)>
	//    8   16:areturn         
		ArrayList arraylist;
		if(flag)
	//*   9   17:iload_2         
	//*  10   18:ifeq            30
			arraylist = x;
	//   11   21:aload_0         
	//   12   22:getfield        #357 <Field ArrayList x>
	//   13   25:astore          7
		else
	//*  14   27:goto            36
			arraylist = y;
	//   15   30:aload_0         
	//   16   31:getfield        #362 <Field ArrayList y>
	//   17   34:astore          7
		Object obj = null;
	//   18   36:aconst_null     
	//   19   37:astore          8
		if(arraylist == null)
	//*  20   39:aload           7
	//*  21   41:ifnonnull       46
			return null;
	//   22   44:aconst_null     
	//   23   45:areturn         
		int k1 = arraylist.size();
	//   24   46:aload           7
	//   25   48:invokevirtual   #468 <Method int ArrayList.size()>
	//   26   51:istore          6
		byte byte0 = -1;
	//   27   53:iconst_m1       
	//   28   54:istore          5
		int i1 = 0;
	//   29   56:iconst_0        
	//   30   57:istore_3        
		int j1;
		do
		{
			j1 = ((int) (byte0));
	//   31   58:iload           5
	//   32   60:istore          4
			if(i1 >= k1)
				break;
	//   33   62:iload_3         
	//   34   63:iload           6
	//   35   65:icmpge          108
			ah ah1 = (ah)arraylist.get(i1);
	//   36   68:aload           7
	//   37   70:iload_3         
	//   38   71:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//   39   74:checkcast       #350 <Class ah>
	//   40   77:astore          9
			if(ah1 == null)
	//*  41   79:aload           9
	//*  42   81:ifnonnull       86
				return null;
	//   43   84:aconst_null     
	//   44   85:areturn         
			if(ah1.b == view)
	//*  45   86:aload           9
	//*  46   88:getfield        #353 <Field View ah.b>
	//*  47   91:aload_1         
	//*  48   92:if_acmpne       101
			{
				j1 = i1;
	//   49   95:iload_3         
	//   50   96:istore          4
				break;
	//   51   98:goto            108
			}
			i1++;
	//   52  101:iload_3         
	//   53  102:iconst_1        
	//   54  103:iadd            
	//   55  104:istore_3        
		} while(true);
	//   56  105:goto            58
		view = ((View) (obj));
	//   57  108:aload           8
	//   58  110:astore_1        
		if(j1 >= 0)
	//*  59  111:iload           4
	//*  60  113:iflt            143
		{
			if(flag)
	//*  61  116:iload_2         
	//*  62  117:ifeq            128
				view = ((View) (y));
	//   63  120:aload_0         
	//   64  121:getfield        #362 <Field ArrayList y>
	//   65  124:astore_1        
			else
	//*  66  125:goto            133
				view = ((View) (x));
	//   67  128:aload_0         
	//   68  129:getfield        #357 <Field ArrayList x>
	//   69  132:astore_1        
			view = ((View) ((ah)((ArrayList) (view)).get(j1)));
	//   70  133:aload_1         
	//   71  134:iload           4
	//   72  136:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//   73  139:checkcast       #350 <Class ah>
	//   74  142:astore_1        
		}
		return ((ah) (view));
	//   75  143:aload_1         
	//   76  144:areturn         
	}

	public abstract void b(ah ah1);

	void b(boolean flag)
	{
		ai ai1;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            37
		{
			u.a.clear();
	//    2    4:aload_0         
	//    3    5:getfield        #142 <Field ai u>
	//    4    8:getfield        #243 <Field a android.support.transition.ai.a>
	//    5   11:invokevirtual   #717 <Method void a.clear()>
			u.b.clear();
	//    6   14:aload_0         
	//    7   15:getfield        #142 <Field ai u>
	//    8   18:getfield        #255 <Field SparseArray ai.b>
	//    9   21:invokevirtual   #718 <Method void SparseArray.clear()>
			ai1 = u;
	//   10   24:aload_0         
	//   11   25:getfield        #142 <Field ai u>
	//   12   28:astore_2        
		} else
	//*  13   29:aload_2         
	//*  14   30:getfield        #249 <Field f android.support.transition.ai.c>
	//*  15   33:invokevirtual   #720 <Method void f.c()>
	//*  16   36:return          
		{
			v.a.clear();
	//   17   37:aload_0         
	//   18   38:getfield        #144 <Field ai v>
	//   19   41:getfield        #243 <Field a android.support.transition.ai.a>
	//   20   44:invokevirtual   #717 <Method void a.clear()>
			v.b.clear();
	//   21   47:aload_0         
	//   22   48:getfield        #144 <Field ai v>
	//   23   51:getfield        #255 <Field SparseArray ai.b>
	//   24   54:invokevirtual   #718 <Method void SparseArray.clear()>
			ai1 = v;
	//   25   57:aload_0         
	//   26   58:getfield        #144 <Field ai v>
	//   27   61:astore_2        
		}
		ai1.c.c();
	//*  28   62:goto            29
	}

	boolean b(View view)
	{
		int k1 = view.getId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #279 <Method int View.getId()>
	//    2    4:istore_3        
		if(n != null && n.contains(((Object) (Integer.valueOf(k1)))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #125 <Field ArrayList n>
	//*   5    9:ifnull          28
	//*   6   12:aload_0         
	//*   7   13:getfield        #125 <Field ArrayList n>
	//*   8   16:iload_3         
	//*   9   17:invokestatic    #464 <Method Integer Integer.valueOf(int)>
	//*  10   20:invokevirtual   #467 <Method boolean ArrayList.contains(Object)>
	//*  11   23:ifeq            28
			return false;
	//   12   26:iconst_0        
	//   13   27:ireturn         
		if(o != null && o.contains(((Object) (view))))
	//*  14   28:aload_0         
	//*  15   29:getfield        #127 <Field ArrayList o>
	//*  16   32:ifnull          48
	//*  17   35:aload_0         
	//*  18   36:getfield        #127 <Field ArrayList o>
	//*  19   39:aload_1         
	//*  20   40:invokevirtual   #467 <Method boolean ArrayList.contains(Object)>
	//*  21   43:ifeq            48
			return false;
	//   22   46:iconst_0        
	//   23   47:ireturn         
		if(p != null)
	//*  24   48:aload_0         
	//*  25   49:getfield        #129 <Field ArrayList p>
	//*  26   52:ifnull          99
		{
			int l1 = p.size();
	//   27   55:aload_0         
	//   28   56:getfield        #129 <Field ArrayList p>
	//   29   59:invokevirtual   #468 <Method int ArrayList.size()>
	//   30   62:istore          4
			for(int i1 = 0; i1 < l1; i1++)
	//*  31   64:iconst_0        
	//*  32   65:istore_2        
	//*  33   66:iload_2         
	//*  34   67:iload           4
	//*  35   69:icmpge          99
				if(((Class)p.get(i1)).isInstance(((Object) (view))))
	//*  36   72:aload_0         
	//*  37   73:getfield        #129 <Field ArrayList p>
	//*  38   76:iload_2         
	//*  39   77:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//*  40   80:checkcast       #98  <Class Class>
	//*  41   83:aload_1         
	//*  42   84:invokevirtual   #472 <Method boolean Class.isInstance(Object)>
	//*  43   87:ifeq            92
					return false;
	//   44   90:iconst_0        
	//   45   91:ireturn         

	//   46   92:iload_2         
	//   47   93:iconst_1        
	//   48   94:iadd            
	//   49   95:istore_2        
		}
	//*  50   96:goto            66
		if(q != null && android.support.v4.view.s.n(view) != null && q.contains(((Object) (android.support.v4.view.s.n(view)))))
	//*  51   99:aload_0         
	//*  52  100:getfield        #131 <Field ArrayList q>
	//*  53  103:ifnull          129
	//*  54  106:aload_1         
	//*  55  107:invokestatic    #293 <Method String s.n(View)>
	//*  56  110:ifnull          129
	//*  57  113:aload_0         
	//*  58  114:getfield        #131 <Field ArrayList q>
	//*  59  117:aload_1         
	//*  60  118:invokestatic    #293 <Method String s.n(View)>
	//*  61  121:invokevirtual   #467 <Method boolean ArrayList.contains(Object)>
	//*  62  124:ifeq            129
			return false;
	//   63  127:iconst_0        
	//   64  128:ireturn         
		if(b.size() == 0 && c.size() == 0 && (m == null || m.isEmpty()) && (l == null || l.isEmpty()))
	//*  65  129:aload_0         
	//*  66  130:getfield        #117 <Field ArrayList b>
	//*  67  133:invokevirtual   #468 <Method int ArrayList.size()>
	//*  68  136:ifne            185
	//*  69  139:aload_0         
	//*  70  140:getfield        #119 <Field ArrayList c>
	//*  71  143:invokevirtual   #468 <Method int ArrayList.size()>
	//*  72  146:ifne            185
	//*  73  149:aload_0         
	//*  74  150:getfield        #123 <Field ArrayList m>
	//*  75  153:ifnull          166
	//*  76  156:aload_0         
	//*  77  157:getfield        #123 <Field ArrayList m>
	//*  78  160:invokevirtual   #665 <Method boolean ArrayList.isEmpty()>
	//*  79  163:ifeq            185
	//*  80  166:aload_0         
	//*  81  167:getfield        #121 <Field ArrayList l>
	//*  82  170:ifnull          183
	//*  83  173:aload_0         
	//*  84  174:getfield        #121 <Field ArrayList l>
	//*  85  177:invokevirtual   #665 <Method boolean ArrayList.isEmpty()>
	//*  86  180:ifeq            185
			return true;
	//   87  183:iconst_1        
	//   88  184:ireturn         
		if(!b.contains(((Object) (Integer.valueOf(k1)))))
	//*  89  185:aload_0         
	//*  90  186:getfield        #117 <Field ArrayList b>
	//*  91  189:iload_3         
	//*  92  190:invokestatic    #464 <Method Integer Integer.valueOf(int)>
	//*  93  193:invokevirtual   #467 <Method boolean ArrayList.contains(Object)>
	//*  94  196:ifne            284
		{
			if(c.contains(((Object) (view))))
	//*  95  199:aload_0         
	//*  96  200:getfield        #119 <Field ArrayList c>
	//*  97  203:aload_1         
	//*  98  204:invokevirtual   #467 <Method boolean ArrayList.contains(Object)>
	//*  99  207:ifeq            212
				return true;
	//  100  210:iconst_1        
	//  101  211:ireturn         
			if(l != null && l.contains(((Object) (android.support.v4.view.s.n(view)))))
	//* 102  212:aload_0         
	//* 103  213:getfield        #121 <Field ArrayList l>
	//* 104  216:ifnull          235
	//* 105  219:aload_0         
	//* 106  220:getfield        #121 <Field ArrayList l>
	//* 107  223:aload_1         
	//* 108  224:invokestatic    #293 <Method String s.n(View)>
	//* 109  227:invokevirtual   #467 <Method boolean ArrayList.contains(Object)>
	//* 110  230:ifeq            235
				return true;
	//  111  233:iconst_1        
	//  112  234:ireturn         
			if(m != null)
	//* 113  235:aload_0         
	//* 114  236:getfield        #123 <Field ArrayList m>
	//* 115  239:ifnull          282
			{
				for(int j1 = 0; j1 < m.size(); j1++)
	//* 116  242:iconst_0        
	//* 117  243:istore_2        
	//* 118  244:iload_2         
	//* 119  245:aload_0         
	//* 120  246:getfield        #123 <Field ArrayList m>
	//* 121  249:invokevirtual   #468 <Method int ArrayList.size()>
	//* 122  252:icmpge          282
					if(((Class)m.get(j1)).isInstance(((Object) (view))))
	//* 123  255:aload_0         
	//* 124  256:getfield        #123 <Field ArrayList m>
	//* 125  259:iload_2         
	//* 126  260:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//* 127  263:checkcast       #98  <Class Class>
	//* 128  266:aload_1         
	//* 129  267:invokevirtual   #472 <Method boolean Class.isInstance(Object)>
	//* 130  270:ifeq            275
						return true;
	//  131  273:iconst_1        
	//  132  274:ireturn         

	//  133  275:iload_2         
	//  134  276:iconst_1        
	//  135  277:iadd            
	//  136  278:istore_2        
			}
	//* 137  279:goto            244
			return false;
	//  138  282:iconst_0        
	//  139  283:ireturn         
		} else
		{
			return true;
	//  140  284:iconst_1        
	//  141  285:ireturn         
		}
	}

	public long c()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field long j>
	//    2    4:lreturn         
	}

	void c(ah ah1)
	{
label0:
		{
			int i1;
label1:
			{
				if(f == null || ah1.a.isEmpty())
					break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #577 <Field af f>
	//    2    4:ifnull          87
	//    3    7:aload_1         
	//    4    8:getfield        #390 <Field Map android.support.transition.ah.a>
	//    5   11:invokeinterface #721 <Method boolean Map.isEmpty()>
	//    6   16:ifne            87
				String as[] = f.a();
	//    7   19:aload_0         
	//    8   20:getfield        #577 <Field af f>
	//    9   23:invokevirtual   #722 <Method String[] android.support.transition.af.a()>
	//   10   26:astore          4
				if(as == null)
	//*  11   28:aload           4
	//*  12   30:ifnonnull       34
					return;
	//   13   33:return          
				boolean flag = false;
	//   14   34:iconst_0        
	//   15   35:istore_3        
				i1 = 0;
	//   16   36:iconst_0        
	//   17   37:istore_2        
				do
				{
					if(i1 >= as.length)
						break;
	//   18   38:iload_2         
	//   19   39:aload           4
	//   20   41:arraylength     
	//   21   42:icmpge          73
					if(!ah1.a.containsKey(((Object) (as[i1]))))
	//*  22   45:aload_1         
	//*  23   46:getfield        #390 <Field Map android.support.transition.ah.a>
	//*  24   49:aload           4
	//*  25   51:iload_2         
	//*  26   52:aaload          
	//*  27   53:invokeinterface #723 <Method boolean Map.containsKey(Object)>
	//*  28   58:ifne            66
					{
						i1 = ((int) (flag));
	//   29   61:iload_3         
	//   30   62:istore_2        
						break label1;
	//   31   63:goto            75
					}
					i1++;
	//   32   66:iload_2         
	//   33   67:iconst_1        
	//   34   68:iadd            
	//   35   69:istore_2        
				} while(true);
	//   36   70:goto            38
				i1 = 1;
	//   37   73:iconst_1        
	//   38   74:istore_2        
			}
			if(i1 == 0)
	//*  39   75:iload_2         
	//*  40   76:ifne            87
				f.a(ah1);
	//   41   79:aload_0         
	//   42   80:getfield        #577 <Field af f>
	//   43   83:aload_1         
	//   44   84:invokevirtual   #724 <Method void android.support.transition.af.a(ah)>
		}
	//   45   87:return          
	}

	public void c(View view)
	{
		if(!E)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field boolean E>
	//*   2    4:ifne            147
		{
			android.support.v4.f.a a1 = l();
	//    3    7:invokestatic    #582 <Method a l()>
	//    4   10:astore          4
			int i1 = a1.size();
	//    5   12:aload           4
	//    6   14:invokevirtual   #338 <Method int a.size()>
	//    7   17:istore_2        
			view = ((View) (au.b(view)));
	//    8   18:aload_1         
	//    9   19:invokestatic    #587 <Method be au.b(View)>
	//   10   22:astore_1        
			for(i1--; i1 >= 0; i1--)
	//*  11   23:iload_2         
	//*  12   24:iconst_1        
	//*  13   25:isub            
	//*  14   26:istore_2        
	//*  15   27:iload_2         
	//*  16   28:iflt            81
			{
				a a2 = (a)a1.c(i1);
	//   17   31:aload           4
	//   18   33:iload_2         
	//   19   34:invokevirtual   #365 <Method Object a.c(int)>
	//   20   37:checkcast       #14  <Class Transition$a>
	//   21   40:astore          5
				if(a2.a != null && ((Object) (view)).equals(((Object) (a2.d))))
	//*  22   42:aload           5
	//*  23   44:getfield        #589 <Field View android.support.transition.Transition$a.a>
	//*  24   47:ifnull          74
	//*  25   50:aload_1         
	//*  26   51:aload           5
	//*  27   53:getfield        #592 <Field be Transition$a.d>
	//*  28   56:invokevirtual   #396 <Method boolean Object.equals(Object)>
	//*  29   59:ifeq            74
					android.support.transition.a.a((Animator)a1.b(i1));
	//   30   62:aload           4
	//   31   64:iload_2         
	//   32   65:invokevirtual   #341 <Method Object a.b(int)>
	//   33   68:checkcast       #229 <Class Animator>
	//   34   71:invokestatic    #728 <Method void android.support.transition.a.a(Animator)>
			}

	//   35   74:iload_2         
	//   36   75:iconst_1        
	//   37   76:isub            
	//   38   77:istore_2        
	//*  39   78:goto            27
			if(F != null && F.size() > 0)
	//*  40   81:aload_0         
	//*  41   82:getfield        #162 <Field ArrayList F>
	//*  42   85:ifnull          142
	//*  43   88:aload_0         
	//*  44   89:getfield        #162 <Field ArrayList F>
	//*  45   92:invokevirtual   #468 <Method int ArrayList.size()>
	//*  46   95:ifle            142
			{
				view = ((View) ((ArrayList)F.clone()));
	//   47   98:aload_0         
	//   48   99:getfield        #162 <Field ArrayList F>
	//   49  102:invokevirtual   #729 <Method Object ArrayList.clone()>
	//   50  105:checkcast       #114 <Class ArrayList>
	//   51  108:astore_1        
				int k1 = ((ArrayList) (view)).size();
	//   52  109:aload_1         
	//   53  110:invokevirtual   #468 <Method int ArrayList.size()>
	//   54  113:istore_3        
				for(int j1 = 0; j1 < k1; j1++)
	//*  55  114:iconst_0        
	//*  56  115:istore_2        
	//*  57  116:iload_2         
	//*  58  117:iload_3         
	//*  59  118:icmpge          142
					((c)((ArrayList) (view)).get(j1)).b(this);
	//   60  121:aload_1         
	//   61  122:iload_2         
	//   62  123:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//   63  126:checkcast       #20  <Class Transition$c>
	//   64  129:aload_0         
	//   65  130:invokeinterface #731 <Method void Transition$c.b(Transition)>

	//   66  135:iload_2         
	//   67  136:iconst_1        
	//   68  137:iadd            
	//   69  138:istore_2        
			}
	//*  70  139:goto            116
			D = true;
	//   71  142:aload_0         
	//   72  143:iconst_1        
	//   73  144:putfield        #158 <Field boolean D>
		}
	//   74  147:return          
	}

	public Object clone()
	{
		return ((Object) (j()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #734 <Method Transition j()>
	//    2    4:areturn         
	}

	public TimeInterpolator d()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field TimeInterpolator k>
	//    2    4:areturn         
	}

	public void d(View view)
	{
		if(D)
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field boolean D>
	//*   2    4:ifeq            154
		{
			if(!E)
	//*   3    7:aload_0         
	//*   4    8:getfield        #160 <Field boolean E>
	//*   5   11:ifne            149
			{
				android.support.v4.f.a a1 = l();
	//    6   14:invokestatic    #582 <Method a l()>
	//    7   17:astore          4
				int i1 = a1.size();
	//    8   19:aload           4
	//    9   21:invokevirtual   #338 <Method int a.size()>
	//   10   24:istore_2        
				view = ((View) (au.b(view)));
	//   11   25:aload_1         
	//   12   26:invokestatic    #587 <Method be au.b(View)>
	//   13   29:astore_1        
				for(i1--; i1 >= 0; i1--)
	//*  14   30:iload_2         
	//*  15   31:iconst_1        
	//*  16   32:isub            
	//*  17   33:istore_2        
	//*  18   34:iload_2         
	//*  19   35:iflt            88
				{
					a a2 = (a)a1.c(i1);
	//   20   38:aload           4
	//   21   40:iload_2         
	//   22   41:invokevirtual   #365 <Method Object a.c(int)>
	//   23   44:checkcast       #14  <Class Transition$a>
	//   24   47:astore          5
					if(a2.a != null && ((Object) (view)).equals(((Object) (a2.d))))
	//*  25   49:aload           5
	//*  26   51:getfield        #589 <Field View android.support.transition.Transition$a.a>
	//*  27   54:ifnull          81
	//*  28   57:aload_1         
	//*  29   58:aload           5
	//*  30   60:getfield        #592 <Field be Transition$a.d>
	//*  31   63:invokevirtual   #396 <Method boolean Object.equals(Object)>
	//*  32   66:ifeq            81
						android.support.transition.a.b((Animator)a1.b(i1));
	//   33   69:aload           4
	//   34   71:iload_2         
	//   35   72:invokevirtual   #341 <Method Object a.b(int)>
	//   36   75:checkcast       #229 <Class Animator>
	//   37   78:invokestatic    #736 <Method void a.b(Animator)>
				}

	//   38   81:iload_2         
	//   39   82:iconst_1        
	//   40   83:isub            
	//   41   84:istore_2        
	//*  42   85:goto            34
				if(F != null && F.size() > 0)
	//*  43   88:aload_0         
	//*  44   89:getfield        #162 <Field ArrayList F>
	//*  45   92:ifnull          149
	//*  46   95:aload_0         
	//*  47   96:getfield        #162 <Field ArrayList F>
	//*  48   99:invokevirtual   #468 <Method int ArrayList.size()>
	//*  49  102:ifle            149
				{
					view = ((View) ((ArrayList)F.clone()));
	//   50  105:aload_0         
	//   51  106:getfield        #162 <Field ArrayList F>
	//   52  109:invokevirtual   #729 <Method Object ArrayList.clone()>
	//   53  112:checkcast       #114 <Class ArrayList>
	//   54  115:astore_1        
					int k1 = ((ArrayList) (view)).size();
	//   55  116:aload_1         
	//   56  117:invokevirtual   #468 <Method int ArrayList.size()>
	//   57  120:istore_3        
					for(int j1 = 0; j1 < k1; j1++)
	//*  58  121:iconst_0        
	//*  59  122:istore_2        
	//*  60  123:iload_2         
	//*  61  124:iload_3         
	//*  62  125:icmpge          149
						((c)((ArrayList) (view)).get(j1)).c(this);
	//   63  128:aload_1         
	//   64  129:iload_2         
	//   65  130:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//   66  133:checkcast       #20  <Class Transition$c>
	//   67  136:aload_0         
	//   68  137:invokeinterface #738 <Method void android.support.transition.Transition$c.c(Transition)>

	//   69  142:iload_2         
	//   70  143:iconst_1        
	//   71  144:iadd            
	//   72  145:istore_2        
				}
			}
	//*  73  146:goto            123
			D = false;
	//   74  149:aload_0         
	//   75  150:iconst_0        
	//   76  151:putfield        #158 <Field boolean D>
		}
	//   77  154:return          
	}

	protected void e()
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #740 <Method void f()>
		android.support.v4.f.a a1 = l();
	//    2    4:invokestatic    #582 <Method a l()>
	//    3    7:astore_1        
		Iterator iterator = G.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #164 <Field ArrayList G>
	//    6   12:invokevirtual   #741 <Method Iterator ArrayList.iterator()>
	//    7   15:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   16:aload_2         
	//    9   17:invokeinterface #708 <Method boolean Iterator.hasNext()>
	//   10   22:ifeq            56
			Animator animator = (Animator)iterator.next();
	//   11   25:aload_2         
	//   12   26:invokeinterface #711 <Method Object Iterator.next()>
	//   13   31:checkcast       #229 <Class Animator>
	//   14   34:astore_3        
			if(a1.containsKey(((Object) (animator))))
	//*  15   35:aload_1         
	//*  16   36:aload_3         
	//*  17   37:invokevirtual   #297 <Method boolean a.containsKey(Object)>
	//*  18   40:ifeq            16
			{
				f();
	//   19   43:aload_0         
	//   20   44:invokevirtual   #740 <Method void f()>
				a(animator, a1);
	//   21   47:aload_0         
	//   22   48:aload_3         
	//   23   49:aload_1         
	//   24   50:invokespecial   #743 <Method void a(Animator, a)>
			}
		} while(true);
	//   25   53:goto            16
		G.clear();
	//   26   56:aload_0         
	//   27   57:getfield        #164 <Field ArrayList G>
	//   28   60:invokevirtual   #744 <Method void ArrayList.clear()>
		g();
	//   29   63:aload_0         
	//   30   64:invokevirtual   #548 <Method void g()>
	//   31   67:return          
	}

	protected void f()
	{
		if(C == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field int C>
	//*   2    4:ifne            73
		{
			if(F != null && F.size() > 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #162 <Field ArrayList F>
	//*   5   11:ifnull          68
	//*   6   14:aload_0         
	//*   7   15:getfield        #162 <Field ArrayList F>
	//*   8   18:invokevirtual   #468 <Method int ArrayList.size()>
	//*   9   21:ifle            68
			{
				ArrayList arraylist = (ArrayList)F.clone();
	//   10   24:aload_0         
	//   11   25:getfield        #162 <Field ArrayList F>
	//   12   28:invokevirtual   #729 <Method Object ArrayList.clone()>
	//   13   31:checkcast       #114 <Class ArrayList>
	//   14   34:astore_3        
				int j1 = arraylist.size();
	//   15   35:aload_3         
	//   16   36:invokevirtual   #468 <Method int ArrayList.size()>
	//   17   39:istore_2        
				for(int i1 = 0; i1 < j1; i1++)
	//*  18   40:iconst_0        
	//*  19   41:istore_1        
	//*  20   42:iload_1         
	//*  21   43:iload_2         
	//*  22   44:icmpge          68
					((c)arraylist.get(i1)).d(this);
	//   23   47:aload_3         
	//   24   48:iload_1         
	//   25   49:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//   26   52:checkcast       #20  <Class Transition$c>
	//   27   55:aload_0         
	//   28   56:invokeinterface #746 <Method void Transition$c.d(Transition)>

	//   29   61:iload_1         
	//   30   62:iconst_1        
	//   31   63:iadd            
	//   32   64:istore_1        
			}
	//*  33   65:goto            42
			E = false;
	//   34   68:aload_0         
	//   35   69:iconst_0        
	//   36   70:putfield        #160 <Field boolean E>
		}
		C = C + 1;
	//   37   73:aload_0         
	//   38   74:aload_0         
	//   39   75:getfield        #156 <Field int C>
	//   40   78:iconst_1        
	//   41   79:iadd            
	//   42   80:putfield        #156 <Field int C>
	//   43   83:return          
	}

	protected void g()
	{
		C = C - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #156 <Field int C>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #156 <Field int C>
		if(C == 0)
	//*   6   10:aload_0         
	//*   7   11:getfield        #156 <Field int C>
	//*   8   14:ifne            177
		{
			if(F != null && F.size() > 0)
	//*   9   17:aload_0         
	//*  10   18:getfield        #162 <Field ArrayList F>
	//*  11   21:ifnull          78
	//*  12   24:aload_0         
	//*  13   25:getfield        #162 <Field ArrayList F>
	//*  14   28:invokevirtual   #468 <Method int ArrayList.size()>
	//*  15   31:ifle            78
			{
				ArrayList arraylist = (ArrayList)F.clone();
	//   16   34:aload_0         
	//   17   35:getfield        #162 <Field ArrayList F>
	//   18   38:invokevirtual   #729 <Method Object ArrayList.clone()>
	//   19   41:checkcast       #114 <Class ArrayList>
	//   20   44:astore_3        
				int l1 = arraylist.size();
	//   21   45:aload_3         
	//   22   46:invokevirtual   #468 <Method int ArrayList.size()>
	//   23   49:istore_2        
				for(int i1 = 0; i1 < l1; i1++)
	//*  24   50:iconst_0        
	//*  25   51:istore_1        
	//*  26   52:iload_1         
	//*  27   53:iload_2         
	//*  28   54:icmpge          78
					((c)arraylist.get(i1)).a(this);
	//   29   57:aload_3         
	//   30   58:iload_1         
	//   31   59:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//   32   62:checkcast       #20  <Class Transition$c>
	//   33   65:aload_0         
	//   34   66:invokeinterface #748 <Method void android.support.transition.Transition$c.a(Transition)>

	//   35   71:iload_1         
	//   36   72:iconst_1        
	//   37   73:iadd            
	//   38   74:istore_1        
			}
	//*  39   75:goto            52
			for(int j1 = 0; j1 < u.c.b(); j1++)
	//*  40   78:iconst_0        
	//*  41   79:istore_1        
	//*  42   80:iload_1         
	//*  43   81:aload_0         
	//*  44   82:getfield        #142 <Field ai u>
	//*  45   85:getfield        #249 <Field f android.support.transition.ai.c>
	//*  46   88:invokevirtual   #371 <Method int f.b()>
	//*  47   91:icmpge          125
			{
				View view = (View)u.c.c(j1);
	//   48   94:aload_0         
	//   49   95:getfield        #142 <Field ai u>
	//   50   98:getfield        #249 <Field f android.support.transition.ai.c>
	//   51  101:iload_1         
	//   52  102:invokevirtual   #372 <Method Object f.c(int)>
	//   53  105:checkcast       #275 <Class View>
	//   54  108:astore_3        
				if(view != null)
	//*  55  109:aload_3         
	//*  56  110:ifnull          118
					android.support.v4.view.s.a(view, false);
	//   57  113:aload_3         
	//   58  114:iconst_0        
	//   59  115:invokestatic    #332 <Method void s.a(View, boolean)>
			}

	//   60  118:iload_1         
	//   61  119:iconst_1        
	//   62  120:iadd            
	//   63  121:istore_1        
	//*  64  122:goto            80
			for(int k1 = 0; k1 < v.c.b(); k1++)
	//*  65  125:iconst_0        
	//*  66  126:istore_1        
	//*  67  127:iload_1         
	//*  68  128:aload_0         
	//*  69  129:getfield        #144 <Field ai v>
	//*  70  132:getfield        #249 <Field f android.support.transition.ai.c>
	//*  71  135:invokevirtual   #371 <Method int f.b()>
	//*  72  138:icmpge          172
			{
				View view1 = (View)v.c.c(k1);
	//   73  141:aload_0         
	//   74  142:getfield        #144 <Field ai v>
	//   75  145:getfield        #249 <Field f android.support.transition.ai.c>
	//   76  148:iload_1         
	//   77  149:invokevirtual   #372 <Method Object f.c(int)>
	//   78  152:checkcast       #275 <Class View>
	//   79  155:astore_3        
				if(view1 != null)
	//*  80  156:aload_3         
	//*  81  157:ifnull          165
					android.support.v4.view.s.a(view1, false);
	//   82  160:aload_3         
	//   83  161:iconst_0        
	//   84  162:invokestatic    #332 <Method void s.a(View, boolean)>
			}

	//   85  165:iload_1         
	//   86  166:iconst_1        
	//   87  167:iadd            
	//   88  168:istore_1        
	//*  89  169:goto            127
			E = true;
	//   90  172:aload_0         
	//   91  173:iconst_1        
	//   92  174:putfield        #160 <Field boolean E>
		}
	//   93  177:return          
	}

	public PathMotion h()
	{
		return J;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field PathMotion J>
	//    2    4:areturn         
	}

	public Rect i()
	{
		if(H == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #752 <Field Transition$b H>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return H.a(this);
	//    5    9:aload_0         
	//    6   10:getfield        #752 <Field Transition$b H>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #755 <Method Rect android.support.transition.Transition$b.a(Transition)>
	//    9   17:areturn         
	}

	public Transition j()
	{
		Transition transition;
		try
		{
			transition = (Transition)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #758 <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class Transition>
	//    3    7:astore_1        
			transition.G = new ArrayList();
	//    4    8:aload_1         
	//    5    9:new             #114 <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #115 <Method void ArrayList()>
	//    8   16:putfield        #164 <Field ArrayList G>
			transition.u = new ai();
	//    9   19:aload_1         
	//   10   20:new             #139 <Class ai>
	//   11   23:dup             
	//   12   24:invokespecial   #140 <Method void ai()>
	//   13   27:putfield        #142 <Field ai u>
			transition.v = new ai();
	//   14   30:aload_1         
	//   15   31:new             #139 <Class ai>
	//   16   34:dup             
	//   17   35:invokespecial   #140 <Method void ai()>
	//   18   38:putfield        #144 <Field ai v>
			transition.x = null;
	//   19   41:aload_1         
	//   20   42:aconst_null     
	//   21   43:putfield        #357 <Field ArrayList x>
			transition.y = null;
	//   22   46:aload_1         
	//   23   47:aconst_null     
	//   24   48:putfield        #362 <Field ArrayList y>
		}
	//*  25   51:aload_1         
	//*  26   52:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  27   53:astore_1        
		{
			return null;
	//   28   54:aconst_null     
	//   29   55:areturn         
		}
		return transition;
	}

	public String k()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field String i>
	//    2    4:areturn         
	}

	public String toString()
	{
		return a("");
	//    0    0:aload_0         
	//    1    1:ldc2            #760 <String "">
	//    2    4:invokevirtual   #762 <Method String a(String)>
	//    3    7:areturn         
	}

	private static final int g[] = {
		2, 1, 3, 4
	};
	private static final PathMotion h = new PathMotion() {

		public Path a(float f1, float f2, float f3, float f4)
		{
			Path path = new Path();
		//    0    0:new             #15  <Class Path>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void Path()>
		//    3    7:astore          5
			path.moveTo(f1, f2);
		//    4    9:aload           5
		//    5   11:fload_1         
		//    6   12:fload_2         
		//    7   13:invokevirtual   #20  <Method void Path.moveTo(float, float)>
			path.lineTo(f3, f4);
		//    8   16:aload           5
		//    9   18:fload_3         
		//   10   19:fload           4
		//   11   21:invokevirtual   #23  <Method void Path.lineTo(float, float)>
			return path;
		//   12   24:aload           5
		//   13   26:areturn         
		}

	}
;
	private static ThreadLocal z = new ThreadLocal();
	private ViewGroup A;
	private ArrayList B;
	private int C;
	private boolean D;
	private boolean E;
	private ArrayList F;
	private ArrayList G;
	private b H;
	private android.support.v4.f.a I;
	private PathMotion J;
	long a;
	ArrayList b;
	ArrayList c;
	TransitionSet d;
	boolean e;
	af f;
	private String i;
	private long j;
	private TimeInterpolator k;
	private ArrayList l;
	private ArrayList m;
	private ArrayList n;
	private ArrayList o;
	private ArrayList p;
	private ArrayList q;
	private ArrayList r;
	private ArrayList s;
	private ArrayList t;
	private ai u;
	private ai v;
	private int w[];
	private ArrayList x;
	private ArrayList y;

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iconst_2        
	//    5    6:iastore         
	//    6    7:dup             
	//    7    8:iconst_1        
	//    8    9:iconst_1        
	//    9   10:iastore         
	//   10   11:dup             
	//   11   12:iconst_2        
	//   12   13:iconst_3        
	//   13   14:iastore         
	//   14   15:dup             
	//   15   16:iconst_3        
	//   16   17:iconst_4        
	//   17   18:iastore         
	//   18   19:putstatic       #80  <Field int[] g>
	//   19   22:new             #8   <Class Transition$1>
	//   20   25:dup             
	//   21   26:invokespecial   #83  <Method void Transition$1()>
	//   22   29:putstatic       #85  <Field PathMotion h>
	//   23   32:new             #87  <Class ThreadLocal>
	//   24   35:dup             
	//   25   36:invokespecial   #88  <Method void ThreadLocal()>
	//   26   39:putstatic       #90  <Field ThreadLocal z>
	//*  27   42:return          
	}
}
