// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.a.c;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.transition:
//			Visibility, ac, ah, aj, 
//			ab

public class Slide extends Visibility
{
	private static interface a
	{

		public abstract float a(ViewGroup viewgroup, View view);

		public abstract float b(ViewGroup viewgroup, View view);
	}

	private static abstract class b
		implements a
	{

		public float b(ViewGroup viewgroup, View view)
		{
			return view.getTranslationY();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #23  <Method float View.getTranslationY()>
		//    2    4:freturn         
		}

		private b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static abstract class c
		implements a
	{

		public float a(ViewGroup viewgroup, View view)
		{
			return view.getTranslationX();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #24  <Method float View.getTranslationX()>
		//    2    4:freturn         
		}

		private c()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}


	public Slide()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void Visibility()>
		i = p;
	//    2    4:aload_0         
	//    3    5:getstatic       #70  <Field Slide$a p>
	//    4    8:putfield        #74  <Field Slide$a i>
		j = 80;
	//    5   11:aload_0         
	//    6   12:bipush          80
	//    7   14:putfield        #76  <Field int j>
		a(80);
	//    8   17:aload_0         
	//    9   18:bipush          80
	//   10   20:invokevirtual   #79  <Method void a(int)>
	//   11   23:return          
	}

	public Slide(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #82  <Method void Visibility(Context, AttributeSet)>
		i = p;
	//    4    6:aload_0         
	//    5    7:getstatic       #70  <Field Slide$a p>
	//    6   10:putfield        #74  <Field Slide$a i>
		j = 80;
	//    7   13:aload_0         
	//    8   14:bipush          80
	//    9   16:putfield        #76  <Field int j>
		context = ((Context) (context.obtainStyledAttributes(attributeset, ac.h)));
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:getstatic       #87  <Field int[] ac.h>
	//   13   24:invokevirtual   #93  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   14   27:astore_1        
		int i1 = android.support.v4.content.a.c.a(((TypedArray) (context)), (XmlPullParser)attributeset, "slideEdge", 0, 80);
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:checkcast       #95  <Class XmlPullParser>
	//   18   33:ldc1            #97  <String "slideEdge">
	//   19   35:iconst_0        
	//   20   36:bipush          80
	//   21   38:invokestatic    #102 <Method int c.a(TypedArray, XmlPullParser, String, int, int)>
	//   22   41:istore_3        
		((TypedArray) (context)).recycle();
	//   23   42:aload_1         
	//   24   43:invokevirtual   #107 <Method void TypedArray.recycle()>
		a(i1);
	//   25   46:aload_0         
	//   26   47:iload_3         
	//   27   48:invokevirtual   #79  <Method void a(int)>
	//   28   51:return          
	}

	private void d(ah ah1)
	{
		View view = ah1.b;
	//    0    0:aload_1         
	//    1    1:getfield        #114 <Field View ah.b>
	//    2    4:astore_2        
		int ai[] = new int[2];
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:astore_3        
		view.getLocationOnScreen(ai);
	//    6    9:aload_2         
	//    7   10:aload_3         
	//    8   11:invokevirtual   #120 <Method void View.getLocationOnScreen(int[])>
		ah1.a.put("android:slide:screenPosition", ((Object) (ai)));
	//    9   14:aload_1         
	//   10   15:getfield        #123 <Field Map ah.a>
	//   11   18:ldc1            #125 <String "android:slide:screenPosition">
	//   12   20:aload_3         
	//   13   21:invokeinterface #131 <Method Object Map.put(Object, Object)>
	//   14   26:pop             
	//   15   27:return          
	}

	public Animator a(ViewGroup viewgroup, View view, ah ah1, ah ah2)
	{
		if(ah2 == null)
	//*   0    0:aload           4
	//*   1    2:ifnonnull       7
		{
			return null;
	//    2    5:aconst_null     
	//    3    6:areturn         
		} else
		{
			ah1 = ((ah) ((int[])ah2.a.get("android:slide:screenPosition")));
	//    4    7:aload           4
	//    5    9:getfield        #123 <Field Map ah.a>
	//    6   12:ldc1            #125 <String "android:slide:screenPosition">
	//    7   14:invokeinterface #136 <Method Object Map.get(Object)>
	//    8   19:checkcast       #137 <Class int[]>
	//    9   22:astore_3        
			float f = view.getTranslationX();
	//   10   23:aload_2         
	//   11   24:invokevirtual   #141 <Method float View.getTranslationX()>
	//   12   27:fstore          5
			float f1 = view.getTranslationY();
	//   13   29:aload_2         
	//   14   30:invokevirtual   #144 <Method float View.getTranslationY()>
	//   15   33:fstore          6
			float f2 = i.a(viewgroup, view);
	//   16   35:aload_0         
	//   17   36:getfield        #74  <Field Slide$a i>
	//   18   39:aload_1         
	//   19   40:aload_2         
	//   20   41:invokeinterface #147 <Method float Slide$a.a(ViewGroup, View)>
	//   21   46:fstore          7
			float f3 = i.b(viewgroup, view);
	//   22   48:aload_0         
	//   23   49:getfield        #74  <Field Slide$a i>
	//   24   52:aload_1         
	//   25   53:aload_2         
	//   26   54:invokeinterface #149 <Method float Slide$a.b(ViewGroup, View)>
	//   27   59:fstore          8
			return aj.a(view, ah2, ah1[0], ah1[1], f2, f3, f, f1, g);
	//   28   61:aload_2         
	//   29   62:aload           4
	//   30   64:aload_3         
	//   31   65:iconst_0        
	//   32   66:iaload          
	//   33   67:aload_3         
	//   34   68:iconst_1        
	//   35   69:iaload          
	//   36   70:fload           7
	//   37   72:fload           8
	//   38   74:fload           5
	//   39   76:fload           6
	//   40   78:getstatic       #47  <Field TimeInterpolator g>
	//   41   81:invokestatic    #154 <Method Animator aj.a(View, ah, int, int, float, float, float, float, TimeInterpolator)>
	//   42   84:areturn         
		}
	}

	public void a(int i1)
	{
		Object obj;
		if(i1 != 3)
	//*   0    0:iload_1         
	//*   1    1:iconst_3        
	//*   2    2:icmpeq          79
		{
			if(i1 != 5)
	//*   3    5:iload_1         
	//*   4    6:iconst_5        
	//*   5    7:icmpeq          72
			{
				if(i1 != 48)
	//*   6   10:iload_1         
	//*   7   11:bipush          48
	//*   8   13:icmpeq          65
				{
					if(i1 != 80)
	//*   9   16:iload_1         
	//*  10   17:bipush          80
	//*  11   19:icmpeq          58
					{
						if(i1 != 0x800003)
	//*  12   22:iload_1         
	//*  13   23:ldc1            #155 <Int 0x800003>
	//*  14   25:icmpeq          51
						{
							if(i1 != 0x800005)
	//*  15   28:iload_1         
	//*  16   29:ldc1            #156 <Int 0x800005>
	//*  17   31:icmpeq          44
								throw new IllegalArgumentException("Invalid slide direction");
	//   18   34:new             #158 <Class IllegalArgumentException>
	//   19   37:dup             
	//   20   38:ldc1            #160 <String "Invalid slide direction">
	//   21   40:invokespecial   #163 <Method void IllegalArgumentException(String)>
	//   22   43:athrow          
							obj = ((Object) (o));
	//   23   44:getstatic       #67  <Field Slide$a o>
	//   24   47:astore_2        
						} else
	//*  25   48:goto            83
						{
							obj = ((Object) (l));
	//   26   51:getstatic       #58  <Field Slide$a l>
	//   27   54:astore_2        
						}
					} else
	//*  28   55:goto            83
					{
						obj = ((Object) (p));
	//   29   58:getstatic       #70  <Field Slide$a p>
	//   30   61:astore_2        
					}
				} else
	//*  31   62:goto            83
				{
					obj = ((Object) (m));
	//   32   65:getstatic       #61  <Field Slide$a m>
	//   33   68:astore_2        
				}
			} else
	//*  34   69:goto            83
			{
				obj = ((Object) (n));
	//   35   72:getstatic       #64  <Field Slide$a n>
	//   36   75:astore_2        
			}
		} else
	//*  37   76:goto            83
		{
			obj = ((Object) (k));
	//   38   79:getstatic       #55  <Field Slide$a k>
	//   39   82:astore_2        
		}
		i = ((a) (obj));
	//   40   83:aload_0         
	//   41   84:aload_2         
	//   42   85:putfield        #74  <Field Slide$a i>
		j = i1;
	//   43   88:aload_0         
	//   44   89:iload_1         
	//   45   90:putfield        #76  <Field int j>
		obj = ((Object) (new ab()));
	//   46   93:new             #165 <Class ab>
	//   47   96:dup             
	//   48   97:invokespecial   #166 <Method void ab()>
	//   49  100:astore_2        
		((ab) (obj)).a(i1);
	//   50  101:aload_2         
	//   51  102:iload_1         
	//   52  103:invokevirtual   #167 <Method void ab.a(int)>
		a(((af) (obj)));
	//   53  106:aload_0         
	//   54  107:aload_2         
	//   55  108:invokevirtual   #170 <Method void a(af)>
	//   56  111:return          
	}

	public void a(ah ah1)
	{
		super.a(ah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #172 <Method void Visibility.a(ah)>
		d(ah1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #174 <Method void d(ah)>
	//    6   10:return          
	}

	public Animator b(ViewGroup viewgroup, View view, ah ah1, ah ah2)
	{
		if(ah1 == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			ah2 = ((ah) ((int[])ah1.a.get("android:slide:screenPosition")));
	//    4    6:aload_3         
	//    5    7:getfield        #123 <Field Map ah.a>
	//    6   10:ldc1            #125 <String "android:slide:screenPosition">
	//    7   12:invokeinterface #136 <Method Object Map.get(Object)>
	//    8   17:checkcast       #137 <Class int[]>
	//    9   20:astore          4
			float f = view.getTranslationX();
	//   10   22:aload_2         
	//   11   23:invokevirtual   #141 <Method float View.getTranslationX()>
	//   12   26:fstore          5
			float f1 = view.getTranslationY();
	//   13   28:aload_2         
	//   14   29:invokevirtual   #144 <Method float View.getTranslationY()>
	//   15   32:fstore          6
			float f2 = i.a(viewgroup, view);
	//   16   34:aload_0         
	//   17   35:getfield        #74  <Field Slide$a i>
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:invokeinterface #147 <Method float Slide$a.a(ViewGroup, View)>
	//   21   45:fstore          7
			float f3 = i.b(viewgroup, view);
	//   22   47:aload_0         
	//   23   48:getfield        #74  <Field Slide$a i>
	//   24   51:aload_1         
	//   25   52:aload_2         
	//   26   53:invokeinterface #149 <Method float Slide$a.b(ViewGroup, View)>
	//   27   58:fstore          8
			return aj.a(view, ah1, ah2[0], ah2[1], f, f1, f2, f3, h);
	//   28   60:aload_2         
	//   29   61:aload_3         
	//   30   62:aload           4
	//   31   64:iconst_0        
	//   32   65:iaload          
	//   33   66:aload           4
	//   34   68:iconst_1        
	//   35   69:iaload          
	//   36   70:fload           5
	//   37   72:fload           6
	//   38   74:fload           7
	//   39   76:fload           8
	//   40   78:getstatic       #52  <Field TimeInterpolator h>
	//   41   81:invokestatic    #154 <Method Animator aj.a(View, ah, int, int, float, float, float, float, TimeInterpolator)>
	//   42   84:areturn         
		}
	}

	public void b(ah ah1)
	{
		super.b(ah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #176 <Method void Visibility.b(ah)>
		d(ah1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #174 <Method void d(ah)>
	//    6   10:return          
	}

	private static final TimeInterpolator g = new DecelerateInterpolator();
	private static final TimeInterpolator h = new AccelerateInterpolator();
	private static final a k = new b() {

		public float a(ViewGroup viewgroup, View view)
		{
			return view.getTranslationX() - (float)viewgroup.getWidth();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #20  <Method float View.getTranslationX()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #26  <Method int ViewGroup.getWidth()>
		//    4    8:i2f             
		//    5    9:fsub            
		//    6   10:freturn         
		}

	}
;
	private static final a l = new b() {

		public float a(ViewGroup viewgroup, View view)
		{
			int i1 = s.e(((View) (viewgroup)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #20  <Method int s.e(View)>
		//    2    4:istore          4
			boolean flag = true;
		//    3    6:iconst_1        
		//    4    7:istore_3        
			if(i1 != 1)
		//*   5    8:iload           4
		//*   6   10:iconst_1        
		//*   7   11:icmpne          17
		//*   8   14:goto            19
				flag = false;
		//    9   17:iconst_0        
		//   10   18:istore_3        
			if(flag)
		//*  11   19:iload_3         
		//*  12   20:ifeq            34
				return view.getTranslationX() + (float)viewgroup.getWidth();
		//   13   23:aload_2         
		//   14   24:invokevirtual   #26  <Method float View.getTranslationX()>
		//   15   27:aload_1         
		//   16   28:invokevirtual   #32  <Method int ViewGroup.getWidth()>
		//   17   31:i2f             
		//   18   32:fadd            
		//   19   33:freturn         
			else
				return view.getTranslationX() - (float)viewgroup.getWidth();
		//   20   34:aload_2         
		//   21   35:invokevirtual   #26  <Method float View.getTranslationX()>
		//   22   38:aload_1         
		//   23   39:invokevirtual   #32  <Method int ViewGroup.getWidth()>
		//   24   42:i2f             
		//   25   43:fsub            
		//   26   44:freturn         
		}

	}
;
	private static final a m = new c() {

		public float b(ViewGroup viewgroup, View view)
		{
			return view.getTranslationY() - (float)viewgroup.getHeight();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #20  <Method float View.getTranslationY()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #26  <Method int ViewGroup.getHeight()>
		//    4    8:i2f             
		//    5    9:fsub            
		//    6   10:freturn         
		}

	}
;
	private static final a n = new b() {

		public float a(ViewGroup viewgroup, View view)
		{
			return view.getTranslationX() + (float)viewgroup.getWidth();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #20  <Method float View.getTranslationX()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #26  <Method int ViewGroup.getWidth()>
		//    4    8:i2f             
		//    5    9:fadd            
		//    6   10:freturn         
		}

	}
;
	private static final a o = new b() {

		public float a(ViewGroup viewgroup, View view)
		{
			int i1 = s.e(((View) (viewgroup)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #20  <Method int s.e(View)>
		//    2    4:istore          4
			boolean flag = true;
		//    3    6:iconst_1        
		//    4    7:istore_3        
			if(i1 != 1)
		//*   5    8:iload           4
		//*   6   10:iconst_1        
		//*   7   11:icmpne          17
		//*   8   14:goto            19
				flag = false;
		//    9   17:iconst_0        
		//   10   18:istore_3        
			if(flag)
		//*  11   19:iload_3         
		//*  12   20:ifeq            34
				return view.getTranslationX() - (float)viewgroup.getWidth();
		//   13   23:aload_2         
		//   14   24:invokevirtual   #26  <Method float View.getTranslationX()>
		//   15   27:aload_1         
		//   16   28:invokevirtual   #32  <Method int ViewGroup.getWidth()>
		//   17   31:i2f             
		//   18   32:fsub            
		//   19   33:freturn         
			else
				return view.getTranslationX() + (float)viewgroup.getWidth();
		//   20   34:aload_2         
		//   21   35:invokevirtual   #26  <Method float View.getTranslationX()>
		//   22   38:aload_1         
		//   23   39:invokevirtual   #32  <Method int ViewGroup.getWidth()>
		//   24   42:i2f             
		//   25   43:fadd            
		//   26   44:freturn         
		}

	}
;
	private static final a p = new c() {

		public float b(ViewGroup viewgroup, View view)
		{
			return view.getTranslationY() + (float)viewgroup.getHeight();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #20  <Method float View.getTranslationY()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #26  <Method int ViewGroup.getHeight()>
		//    4    8:i2f             
		//    5    9:fadd            
		//    6   10:freturn         
		}

	}
;
	private a i;
	private int j;

	static 
	{
	//    0    0:new             #42  <Class DecelerateInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void DecelerateInterpolator()>
	//    3    7:putstatic       #47  <Field TimeInterpolator g>
	//    4   10:new             #49  <Class AccelerateInterpolator>
	//    5   13:dup             
	//    6   14:invokespecial   #50  <Method void AccelerateInterpolator()>
	//    7   17:putstatic       #52  <Field TimeInterpolator h>
	//    8   20:new             #6   <Class Slide$1>
	//    9   23:dup             
	//   10   24:invokespecial   #53  <Method void Slide$1()>
	//   11   27:putstatic       #55  <Field Slide$a k>
	//   12   30:new             #8   <Class Slide$2>
	//   13   33:dup             
	//   14   34:invokespecial   #56  <Method void Slide$2()>
	//   15   37:putstatic       #58  <Field Slide$a l>
	//   16   40:new             #10  <Class Slide$3>
	//   17   43:dup             
	//   18   44:invokespecial   #59  <Method void Slide$3()>
	//   19   47:putstatic       #61  <Field Slide$a m>
	//   20   50:new             #12  <Class Slide$4>
	//   21   53:dup             
	//   22   54:invokespecial   #62  <Method void Slide$4()>
	//   23   57:putstatic       #64  <Field Slide$a n>
	//   24   60:new             #14  <Class Slide$5>
	//   25   63:dup             
	//   26   64:invokespecial   #65  <Method void Slide$5()>
	//   27   67:putstatic       #67  <Field Slide$a o>
	//   28   70:new             #16  <Class Slide$6>
	//   29   73:dup             
	//   30   74:invokespecial   #68  <Method void Slide$6()>
	//   31   77:putstatic       #70  <Field Slide$a p>
	//*  32   80:return          
	}
}
