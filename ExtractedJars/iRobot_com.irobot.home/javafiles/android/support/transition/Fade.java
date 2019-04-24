// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.content.a.c;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Visibility, ac, ah, au, 
//			ad, Transition

public class Fade extends Visibility
{
	private static class a extends AnimatorListenerAdapter
	{

		public void onAnimationEnd(Animator animator)
		{
			au.a(a, 1.0F);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field View a>
		//    2    4:fconst_1        
		//    3    5:invokestatic    #27  <Method void au.a(View, float)>
			if(b)
		//*   4    8:aload_0         
		//*   5    9:getfield        #17  <Field boolean b>
		//*   6   12:ifeq            24
				a.setLayerType(0, ((android.graphics.Paint) (null)));
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field View a>
		//    9   19:iconst_0        
		//   10   20:aconst_null     
		//   11   21:invokevirtual   #33  <Method void View.setLayerType(int, android.graphics.Paint)>
		//   12   24:return          
		}

		public void onAnimationStart(Animator animator)
		{
			if(s.r(a) && a.getLayerType() == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field View a>
		//*   2    4:invokestatic    #40  <Method boolean s.r(View)>
		//*   3    7:ifeq            34
		//*   4   10:aload_0         
		//*   5   11:getfield        #19  <Field View a>
		//*   6   14:invokevirtual   #44  <Method int View.getLayerType()>
		//*   7   17:ifne            34
			{
				b = true;
		//    8   20:aload_0         
		//    9   21:iconst_1        
		//   10   22:putfield        #17  <Field boolean b>
				a.setLayerType(2, ((android.graphics.Paint) (null)));
		//   11   25:aload_0         
		//   12   26:getfield        #19  <Field View a>
		//   13   29:iconst_2        
		//   14   30:aconst_null     
		//   15   31:invokevirtual   #33  <Method void View.setLayerType(int, android.graphics.Paint)>
			}
		//   16   34:return          
		}

		private final View a;
		private boolean b;

		a(View view)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void AnimatorListenerAdapter()>
			b = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #17  <Field boolean b>
			a = view;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #19  <Field View a>
		//    8   14:return          
		}
	}


	public Fade()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Visibility()>
	//    2    4:return          
	}

	public Fade(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Visibility()>
		b(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #18  <Method void b(int)>
	//    5    9:return          
	}

	public Fade(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void Visibility(Context, AttributeSet)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, ac.f)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #27  <Field int[] ac.f>
	//    7   11:invokevirtual   #33  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    8   14:astore_1        
		b(c.a(((TypedArray) (context)), ((org.xmlpull.v1.XmlPullParser) ((XmlResourceParser)attributeset)), "fadingMode", 0, l()));
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:checkcast       #35  <Class XmlResourceParser>
	//   13   21:ldc1            #37  <String "fadingMode">
	//   14   23:iconst_0        
	//   15   24:aload_0         
	//   16   25:invokevirtual   #41  <Method int l()>
	//   17   28:invokestatic    #46  <Method int c.a(TypedArray, org.xmlpull.v1.XmlPullParser, String, int, int)>
	//   18   31:invokevirtual   #18  <Method void b(int)>
		((TypedArray) (context)).recycle();
	//   19   34:aload_1         
	//   20   35:invokevirtual   #51  <Method void TypedArray.recycle()>
	//   21   38:return          
	}

	private static float a(ah ah1, float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(ah1 != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          32
		{
			ah1 = ((ah) ((Float)ah1.a.get("android:fade:transitionAlpha")));
	//    4    6:aload_0         
	//    5    7:getfield        #57  <Field Map ah.a>
	//    6   10:ldc1            #59  <String "android:fade:transitionAlpha">
	//    7   12:invokeinterface #65  <Method Object Map.get(Object)>
	//    8   17:checkcast       #67  <Class Float>
	//    9   20:astore_0        
			f1 = f;
	//   10   21:fload_1         
	//   11   22:fstore_2        
			if(ah1 != null)
	//*  12   23:aload_0         
	//*  13   24:ifnull          32
				f1 = ((Float) (ah1)).floatValue();
	//   14   27:aload_0         
	//   15   28:invokevirtual   #71  <Method float Float.floatValue()>
	//   16   31:fstore_2        
		}
		return f1;
	//   17   32:fload_2         
	//   18   33:freturn         
	}

	private Animator a(View view, float f, float f1)
	{
		if(f == f1)
	//*   0    0:fload_2         
	//*   1    1:fload_3         
	//*   2    2:fcmpl           
	//*   3    3:ifne            8
		{
			return null;
	//    4    6:aconst_null     
	//    5    7:areturn         
		} else
		{
			au.a(view, f);
	//    6    8:aload_1         
	//    7    9:fload_2         
	//    8   10:invokestatic    #77  <Method void au.a(View, float)>
			ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (view)), au.a, new float[] {
				f1
			});
	//    9   13:aload_1         
	//   10   14:getstatic       #80  <Field android.util.Property au.a>
	//   11   17:iconst_1        
	//   12   18:newarray        float[]
	//   13   20:dup             
	//   14   21:iconst_0        
	//   15   22:fload_3         
	//   16   23:fastore         
	//   17   24:invokestatic    #86  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   18   27:astore          4
			objectanimator.addListener(((android.animation.Animator.AnimatorListener) (new a(view))));
	//   19   29:aload           4
	//   20   31:new             #8   <Class Fade$a>
	//   21   34:dup             
	//   22   35:aload_1         
	//   23   36:invokespecial   #89  <Method void Fade$a(View)>
	//   24   39:invokevirtual   #93  <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
			a(((Transition.c) (new ad(view) {

				public void a(Transition transition)
				{
					au.a(a, 1.0F);
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field View a>
				//    2    4:fconst_1        
				//    3    5:invokestatic    #28  <Method void au.a(View, float)>
					au.e(a);
				//    4    8:aload_0         
				//    5    9:getfield        #18  <Field View a>
				//    6   12:invokestatic    #32  <Method void au.e(View)>
					transition.b(((Transition.c) (this)));
				//    7   15:aload_1         
				//    8   16:aload_0         
				//    9   17:invokevirtual   #37  <Method Transition Transition.b(Transition$c)>
				//   10   20:pop             
				//   11   21:return          
				}

				final View a;
				final Fade b;

			
			{
				b = Fade.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Fade b>
				a = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #18  <Field View a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void ad()>
			//    8   14:return          
			}
			}
)));
	//   25   42:aload_0         
	//   26   43:new             #6   <Class Fade$1>
	//   27   46:dup             
	//   28   47:aload_0         
	//   29   48:aload_1         
	//   30   49:invokespecial   #96  <Method void Fade$1(Fade, View)>
	//   31   52:invokevirtual   #99  <Method Transition a(Transition$c)>
	//   32   55:pop             
			return ((Animator) (objectanimator));
	//   33   56:aload           4
	//   34   58:areturn         
		}
	}

	public Animator a(ViewGroup viewgroup, View view, ah ah1, ah ah2)
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          5
		float f1 = a(ah1, 0.0F);
	//    2    3:aload_3         
	//    3    4:fconst_0        
	//    4    5:invokestatic    #102 <Method float a(ah, float)>
	//    5    8:fstore          6
		if(f1 != 1.0F)
	//*   6   10:fload           6
	//*   7   12:fconst_1        
	//*   8   13:fcmpl           
	//*   9   14:ifne            20
	//*  10   17:goto            24
			f = f1;
	//   11   20:fload           6
	//   12   22:fstore          5
		return a(view, f, 1.0F);
	//   13   24:aload_0         
	//   14   25:aload_2         
	//   15   26:fload           5
	//   16   28:fconst_1        
	//   17   29:invokespecial   #104 <Method Animator a(View, float, float)>
	//   18   32:areturn         
	}

	public void a(ah ah1)
	{
		super.a(ah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #107 <Method void Visibility.a(ah)>
		ah1.a.put("android:fade:transitionAlpha", ((Object) (Float.valueOf(android.support.transition.au.c(ah1.b)))));
	//    3    5:aload_1         
	//    4    6:getfield        #57  <Field Map ah.a>
	//    5    9:ldc1            #59  <String "android:fade:transitionAlpha">
	//    6   11:aload_1         
	//    7   12:getfield        #110 <Field View ah.b>
	//    8   15:invokestatic    #114 <Method float android.support.transition.au.c(View)>
	//    9   18:invokestatic    #118 <Method Float Float.valueOf(float)>
	//   10   21:invokeinterface #122 <Method Object Map.put(Object, Object)>
	//   11   26:pop             
	//   12   27:return          
	}

	public Animator b(ViewGroup viewgroup, View view, ah ah1, ah ah2)
	{
		au.d(view);
	//    0    0:aload_2         
	//    1    1:invokestatic    #125 <Method void au.d(View)>
		return a(view, a(ah1, 1.0F), 0.0F);
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:fconst_1        
	//    6    8:invokestatic    #102 <Method float a(ah, float)>
	//    7   11:fconst_0        
	//    8   12:invokespecial   #104 <Method Animator a(View, float, float)>
	//    9   15:areturn         
	}
}
