// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.support.v4.content.a.c;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.transition:
//			Transition, ac, ah, o, 
//			f, PathMotion, u, a, 
//			au, j, i, ad

public class ChangeTransform extends Transition
{
	private static class a extends ad
	{

		public void a(Transition transition)
		{
			transition.b(((Transition.c) (this)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #26  <Method Transition Transition.b(Transition$c)>
		//    3    5:pop             
			android.support.transition.j.a(a);
		//    4    6:aload_0         
		//    5    7:getfield        #17  <Field View a>
		//    6   10:invokestatic    #31  <Method void j.a(View)>
			a.setTag(y.a.transition_transform, ((Object) (null)));
		//    7   13:aload_0         
		//    8   14:getfield        #17  <Field View a>
		//    9   17:getstatic       #37  <Field int y$a.transition_transform>
		//   10   20:aconst_null     
		//   11   21:invokevirtual   #43  <Method void View.setTag(int, Object)>
			a.setTag(y.a.parent_matrix, ((Object) (null)));
		//   12   24:aload_0         
		//   13   25:getfield        #17  <Field View a>
		//   14   28:getstatic       #46  <Field int y$a.parent_matrix>
		//   15   31:aconst_null     
		//   16   32:invokevirtual   #43  <Method void View.setTag(int, Object)>
		//   17   35:return          
		}

		public void b(Transition transition)
		{
			b.setVisibility(4);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field i b>
		//    2    4:iconst_4        
		//    3    5:invokeinterface #52  <Method void i.setVisibility(int)>
		//    4   10:return          
		}

		public void c(Transition transition)
		{
			b.setVisibility(0);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field i b>
		//    2    4:iconst_0        
		//    3    5:invokeinterface #52  <Method void i.setVisibility(int)>
		//    4   10:return          
		}

		private View a;
		private i b;

		a(View view, i i1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void ad()>
			a = view;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field View a>
			b = i1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #19  <Field i b>
		//    8   14:return          
		}
	}

	private static class b
	{

		private void b()
		{
			c[2] = d;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field float[] c>
		//    2    4:iconst_2        
		//    3    5:aload_0         
		//    4    6:getfield        #36  <Field float d>
		//    5    9:fastore         
			c[5] = e;
		//    6   10:aload_0         
		//    7   11:getfield        #34  <Field float[] c>
		//    8   14:iconst_5        
		//    9   15:aload_0         
		//   10   16:getfield        #38  <Field float e>
		//   11   19:fastore         
			a.setValues(c);
		//   12   20:aload_0         
		//   13   21:getfield        #25  <Field Matrix a>
		//   14   24:aload_0         
		//   15   25:getfield        #34  <Field float[] c>
		//   16   28:invokevirtual   #45  <Method void Matrix.setValues(float[])>
			android.support.transition.au.c(b, a);
		//   17   31:aload_0         
		//   18   32:getfield        #27  <Field View b>
		//   19   35:aload_0         
		//   20   36:getfield        #25  <Field Matrix a>
		//   21   39:invokestatic    #50  <Method void android.support.transition.au.c(View, Matrix)>
		//   22   42:return          
		}

		Matrix a()
		{
			return a;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Matrix a>
		//    2    4:areturn         
		}

		void a(PointF pointf)
		{
			d = pointf.x;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #57  <Field float PointF.x>
		//    3    5:putfield        #36  <Field float d>
			e = pointf.y;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:getfield        #60  <Field float PointF.y>
		//    7   13:putfield        #38  <Field float e>
			b();
		//    8   16:aload_0         
		//    9   17:invokespecial   #40  <Method void b()>
		//   10   20:return          
		}

		void a(float af[])
		{
			System.arraycopy(((Object) (af)), 0, ((Object) (c)), 0, af.length);
		//    0    0:aload_1         
		//    1    1:iconst_0        
		//    2    2:aload_0         
		//    3    3:getfield        #34  <Field float[] c>
		//    4    6:iconst_0        
		//    5    7:aload_1         
		//    6    8:arraylength     
		//    7    9:invokestatic    #66  <Method void System.arraycopy(Object, int, Object, int, int)>
			b();
		//    8   12:aload_0         
		//    9   13:invokespecial   #40  <Method void b()>
		//   10   16:return          
		}

		private final Matrix a = new Matrix();
		private final View b;
		private final float c[];
		private float d;
		private float e;

		b(View view, float af[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #22  <Class Matrix>
		//    4    8:dup             
		//    5    9:invokespecial   #23  <Method void Matrix()>
		//    6   12:putfield        #25  <Field Matrix a>
			b = view;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #27  <Field View b>
			c = (float[])((float []) (af)).clone();
		//   10   20:aload_0         
		//   11   21:aload_2         
		//   12   22:invokevirtual   #32  <Method Object _5B_F.clone()>
		//   13   25:checkcast       #28  <Class float[]>
		//   14   28:putfield        #34  <Field float[] c>
			d = c[2];
		//   15   31:aload_0         
		//   16   32:aload_0         
		//   17   33:getfield        #34  <Field float[] c>
		//   18   36:iconst_2        
		//   19   37:faload          
		//   20   38:putfield        #36  <Field float d>
			e = c[5];
		//   21   41:aload_0         
		//   22   42:aload_0         
		//   23   43:getfield        #34  <Field float[] c>
		//   24   46:iconst_5        
		//   25   47:faload          
		//   26   48:putfield        #38  <Field float e>
			b();
		//   27   51:aload_0         
		//   28   52:invokespecial   #40  <Method void b()>
		//   29   55:return          
		}
	}

	private static class c
	{

		public void a(View view)
		{
			ChangeTransform.a(view, a, b, c, d, e, f, g, h);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #28  <Field float a>
		//    3    5:aload_0         
		//    4    6:getfield        #33  <Field float b>
		//    5    9:aload_0         
		//    6   10:getfield        #41  <Field float c>
		//    7   13:aload_0         
		//    8   14:getfield        #46  <Field float d>
		//    9   17:aload_0         
		//   10   18:getfield        #51  <Field float e>
		//   11   21:aload_0         
		//   12   22:getfield        #56  <Field float f>
		//   13   25:aload_0         
		//   14   26:getfield        #61  <Field float g>
		//   15   29:aload_0         
		//   16   30:getfield        #66  <Field float h>
		//   17   33:invokestatic    #70  <Method void ChangeTransform.a(View, float, float, float, float, float, float, float, float)>
		//   18   36:return          
		}

		public boolean equals(Object obj)
		{
			boolean flag = obj instanceof c;
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class ChangeTransform$c>
		//    2    4:istore_2        
			boolean flag1 = false;
		//    3    5:iconst_0        
		//    4    6:istore_3        
			if(!flag)
		//*   5    7:iload_2         
		//*   6    8:ifne            13
				return false;
		//    7   11:iconst_0        
		//    8   12:ireturn         
			obj = ((Object) ((c)obj));
		//    9   13:aload_1         
		//   10   14:checkcast       #2   <Class ChangeTransform$c>
		//   11   17:astore_1        
			flag = flag1;
		//   12   18:iload_3         
		//   13   19:istore_2        
			if(((c) (obj)).a == a)
		//*  14   20:aload_1         
		//*  15   21:getfield        #28  <Field float a>
		//*  16   24:aload_0         
		//*  17   25:getfield        #28  <Field float a>
		//*  18   28:fcmpl           
		//*  19   29:ifne            132
			{
				flag = flag1;
		//   20   32:iload_3         
		//   21   33:istore_2        
				if(((c) (obj)).b == b)
		//*  22   34:aload_1         
		//*  23   35:getfield        #33  <Field float b>
		//*  24   38:aload_0         
		//*  25   39:getfield        #33  <Field float b>
		//*  26   42:fcmpl           
		//*  27   43:ifne            132
				{
					flag = flag1;
		//   28   46:iload_3         
		//   29   47:istore_2        
					if(((c) (obj)).c == c)
		//*  30   48:aload_1         
		//*  31   49:getfield        #41  <Field float c>
		//*  32   52:aload_0         
		//*  33   53:getfield        #41  <Field float c>
		//*  34   56:fcmpl           
		//*  35   57:ifne            132
					{
						flag = flag1;
		//   36   60:iload_3         
		//   37   61:istore_2        
						if(((c) (obj)).d == d)
		//*  38   62:aload_1         
		//*  39   63:getfield        #46  <Field float d>
		//*  40   66:aload_0         
		//*  41   67:getfield        #46  <Field float d>
		//*  42   70:fcmpl           
		//*  43   71:ifne            132
						{
							flag = flag1;
		//   44   74:iload_3         
		//   45   75:istore_2        
							if(((c) (obj)).e == e)
		//*  46   76:aload_1         
		//*  47   77:getfield        #51  <Field float e>
		//*  48   80:aload_0         
		//*  49   81:getfield        #51  <Field float e>
		//*  50   84:fcmpl           
		//*  51   85:ifne            132
							{
								flag = flag1;
		//   52   88:iload_3         
		//   53   89:istore_2        
								if(((c) (obj)).f == f)
		//*  54   90:aload_1         
		//*  55   91:getfield        #56  <Field float f>
		//*  56   94:aload_0         
		//*  57   95:getfield        #56  <Field float f>
		//*  58   98:fcmpl           
		//*  59   99:ifne            132
								{
									flag = flag1;
		//   60  102:iload_3         
		//   61  103:istore_2        
									if(((c) (obj)).g == g)
		//*  62  104:aload_1         
		//*  63  105:getfield        #61  <Field float g>
		//*  64  108:aload_0         
		//*  65  109:getfield        #61  <Field float g>
		//*  66  112:fcmpl           
		//*  67  113:ifne            132
									{
										flag = flag1;
		//   68  116:iload_3         
		//   69  117:istore_2        
										if(((c) (obj)).h == h)
		//*  70  118:aload_1         
		//*  71  119:getfield        #66  <Field float h>
		//*  72  122:aload_0         
		//*  73  123:getfield        #66  <Field float h>
		//*  74  126:fcmpl           
		//*  75  127:ifne            132
											flag = true;
		//   76  130:iconst_1        
		//   77  131:istore_2        
									}
								}
							}
						}
					}
				}
			}
			return flag;
		//   78  132:iload_2         
		//   79  133:ireturn         
		}

		public int hashCode()
		{
			float f1 = a;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field float a>
		//    2    4:fstore_1        
			int l2 = 0;
		//    3    5:iconst_0        
		//    4    6:istore          9
			int i1;
			if(f1 != 0.0F)
		//*   5    8:fload_1         
		//*   6    9:fconst_0        
		//*   7   10:fcmpl           
		//*   8   11:ifeq            25
				i1 = Float.floatToIntBits(a);
		//    9   14:aload_0         
		//   10   15:getfield        #28  <Field float a>
		//   11   18:invokestatic    #80  <Method int Float.floatToIntBits(float)>
		//   12   21:istore_2        
			else
		//*  13   22:goto            27
				i1 = 0;
		//   14   25:iconst_0        
		//   15   26:istore_2        
			int j1;
			if(b != 0.0F)
		//*  16   27:aload_0         
		//*  17   28:getfield        #33  <Field float b>
		//*  18   31:fconst_0        
		//*  19   32:fcmpl           
		//*  20   33:ifeq            47
				j1 = Float.floatToIntBits(b);
		//   21   36:aload_0         
		//   22   37:getfield        #33  <Field float b>
		//   23   40:invokestatic    #80  <Method int Float.floatToIntBits(float)>
		//   24   43:istore_3        
			else
		//*  25   44:goto            49
				j1 = 0;
		//   26   47:iconst_0        
		//   27   48:istore_3        
			int k1;
			if(c != 0.0F)
		//*  28   49:aload_0         
		//*  29   50:getfield        #41  <Field float c>
		//*  30   53:fconst_0        
		//*  31   54:fcmpl           
		//*  32   55:ifeq            70
				k1 = Float.floatToIntBits(c);
		//   33   58:aload_0         
		//   34   59:getfield        #41  <Field float c>
		//   35   62:invokestatic    #80  <Method int Float.floatToIntBits(float)>
		//   36   65:istore          4
			else
		//*  37   67:goto            73
				k1 = 0;
		//   38   70:iconst_0        
		//   39   71:istore          4
			int l1;
			if(d != 0.0F)
		//*  40   73:aload_0         
		//*  41   74:getfield        #46  <Field float d>
		//*  42   77:fconst_0        
		//*  43   78:fcmpl           
		//*  44   79:ifeq            94
				l1 = Float.floatToIntBits(d);
		//   45   82:aload_0         
		//   46   83:getfield        #46  <Field float d>
		//   47   86:invokestatic    #80  <Method int Float.floatToIntBits(float)>
		//   48   89:istore          5
			else
		//*  49   91:goto            97
				l1 = 0;
		//   50   94:iconst_0        
		//   51   95:istore          5
			int i2;
			if(e != 0.0F)
		//*  52   97:aload_0         
		//*  53   98:getfield        #51  <Field float e>
		//*  54  101:fconst_0        
		//*  55  102:fcmpl           
		//*  56  103:ifeq            118
				i2 = Float.floatToIntBits(e);
		//   57  106:aload_0         
		//   58  107:getfield        #51  <Field float e>
		//   59  110:invokestatic    #80  <Method int Float.floatToIntBits(float)>
		//   60  113:istore          6
			else
		//*  61  115:goto            121
				i2 = 0;
		//   62  118:iconst_0        
		//   63  119:istore          6
			int j2;
			if(f != 0.0F)
		//*  64  121:aload_0         
		//*  65  122:getfield        #56  <Field float f>
		//*  66  125:fconst_0        
		//*  67  126:fcmpl           
		//*  68  127:ifeq            142
				j2 = Float.floatToIntBits(f);
		//   69  130:aload_0         
		//   70  131:getfield        #56  <Field float f>
		//   71  134:invokestatic    #80  <Method int Float.floatToIntBits(float)>
		//   72  137:istore          7
			else
		//*  73  139:goto            145
				j2 = 0;
		//   74  142:iconst_0        
		//   75  143:istore          7
			int k2;
			if(g != 0.0F)
		//*  76  145:aload_0         
		//*  77  146:getfield        #61  <Field float g>
		//*  78  149:fconst_0        
		//*  79  150:fcmpl           
		//*  80  151:ifeq            166
				k2 = Float.floatToIntBits(g);
		//   81  154:aload_0         
		//   82  155:getfield        #61  <Field float g>
		//   83  158:invokestatic    #80  <Method int Float.floatToIntBits(float)>
		//   84  161:istore          8
			else
		//*  85  163:goto            169
				k2 = 0;
		//   86  166:iconst_0        
		//   87  167:istore          8
			if(h != 0.0F)
		//*  88  169:aload_0         
		//*  89  170:getfield        #66  <Field float h>
		//*  90  173:fconst_0        
		//*  91  174:fcmpl           
		//*  92  175:ifeq            187
				l2 = Float.floatToIntBits(h);
		//   93  178:aload_0         
		//   94  179:getfield        #66  <Field float h>
		//   95  182:invokestatic    #80  <Method int Float.floatToIntBits(float)>
		//   96  185:istore          9
			return ((((((i1 * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2;
		//   97  187:iload_2         
		//   98  188:bipush          31
		//   99  190:imul            
		//  100  191:iload_3         
		//  101  192:iadd            
		//  102  193:bipush          31
		//  103  195:imul            
		//  104  196:iload           4
		//  105  198:iadd            
		//  106  199:bipush          31
		//  107  201:imul            
		//  108  202:iload           5
		//  109  204:iadd            
		//  110  205:bipush          31
		//  111  207:imul            
		//  112  208:iload           6
		//  113  210:iadd            
		//  114  211:bipush          31
		//  115  213:imul            
		//  116  214:iload           7
		//  117  216:iadd            
		//  118  217:bipush          31
		//  119  219:imul            
		//  120  220:iload           8
		//  121  222:iadd            
		//  122  223:bipush          31
		//  123  225:imul            
		//  124  226:iload           9
		//  125  228:iadd            
		//  126  229:ireturn         
		}

		final float a;
		final float b;
		final float c;
		final float d;
		final float e;
		final float f;
		final float g;
		final float h;

		c(View view)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			a = view.getTranslationX();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #26  <Method float View.getTranslationX()>
		//    5    9:putfield        #28  <Field float a>
			b = view.getTranslationY();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #31  <Method float View.getTranslationY()>
		//    9   17:putfield        #33  <Field float b>
			c = s.m(view);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokestatic    #39  <Method float s.m(View)>
		//   13   25:putfield        #41  <Field float c>
			d = view.getScaleX();
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:invokevirtual   #44  <Method float View.getScaleX()>
		//   17   33:putfield        #46  <Field float d>
			e = view.getScaleY();
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:invokevirtual   #49  <Method float View.getScaleY()>
		//   21   41:putfield        #51  <Field float e>
			f = view.getRotationX();
		//   22   44:aload_0         
		//   23   45:aload_1         
		//   24   46:invokevirtual   #54  <Method float View.getRotationX()>
		//   25   49:putfield        #56  <Field float f>
			g = view.getRotationY();
		//   26   52:aload_0         
		//   27   53:aload_1         
		//   28   54:invokevirtual   #59  <Method float View.getRotationY()>
		//   29   57:putfield        #61  <Field float g>
			h = view.getRotation();
		//   30   60:aload_0         
		//   31   61:aload_1         
		//   32   62:invokevirtual   #64  <Method float View.getRotation()>
		//   33   65:putfield        #66  <Field float h>
		//   34   68:return          
		}
	}


	public ChangeTransform()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void Transition()>
		k = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #74  <Field boolean k>
		l = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #76  <Field boolean l>
		m = new Matrix();
	//    8   14:aload_0         
	//    9   15:new             #78  <Class Matrix>
	//   10   18:dup             
	//   11   19:invokespecial   #79  <Method void Matrix()>
	//   12   22:putfield        #81  <Field Matrix m>
	//   13   25:return          
	}

	public ChangeTransform(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #84  <Method void Transition(Context, AttributeSet)>
		k = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #74  <Field boolean k>
		l = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #76  <Field boolean l>
		m = new Matrix();
	//   10   16:aload_0         
	//   11   17:new             #78  <Class Matrix>
	//   12   20:dup             
	//   13   21:invokespecial   #79  <Method void Matrix()>
	//   14   24:putfield        #81  <Field Matrix m>
		context = ((Context) (context.obtainStyledAttributes(attributeset, ac.g)));
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:getstatic       #89  <Field int[] ac.g>
	//   18   32:invokevirtual   #95  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   19   35:astore_1        
		attributeset = ((AttributeSet) ((XmlPullParser)attributeset));
	//   20   36:aload_2         
	//   21   37:checkcast       #97  <Class XmlPullParser>
	//   22   40:astore_2        
		k = android.support.v4.content.a.c.a(((TypedArray) (context)), ((XmlPullParser) (attributeset)), "reparentWithOverlay", 1, true);
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:aload_2         
	//   26   44:ldc1            #99  <String "reparentWithOverlay">
	//   27   46:iconst_1        
	//   28   47:iconst_1        
	//   29   48:invokestatic    #104 <Method boolean c.a(TypedArray, XmlPullParser, String, int, boolean)>
	//   30   51:putfield        #74  <Field boolean k>
		l = android.support.v4.content.a.c.a(((TypedArray) (context)), ((XmlPullParser) (attributeset)), "reparent", 0, true);
	//   31   54:aload_0         
	//   32   55:aload_1         
	//   33   56:aload_2         
	//   34   57:ldc1            #106 <String "reparent">
	//   35   59:iconst_0        
	//   36   60:iconst_1        
	//   37   61:invokestatic    #104 <Method boolean c.a(TypedArray, XmlPullParser, String, int, boolean)>
	//   38   64:putfield        #76  <Field boolean l>
		((TypedArray) (context)).recycle();
	//   39   67:aload_1         
	//   40   68:invokevirtual   #111 <Method void TypedArray.recycle()>
	//   41   71:return          
	}

	private ObjectAnimator a(ah ah1, ah ah2, boolean flag)
	{
		ah1 = ((ah) ((Matrix)ah1.a.get("android:changeTransform:matrix")));
	//    0    0:aload_1         
	//    1    1:getfield        #117 <Field Map ah.a>
	//    2    4:ldc1            #38  <String "android:changeTransform:matrix">
	//    3    6:invokeinterface #123 <Method Object Map.get(Object)>
	//    4   11:checkcast       #78  <Class Matrix>
	//    5   14:astore_1        
		Matrix matrix = (Matrix)ah2.a.get("android:changeTransform:matrix");
	//    6   15:aload_2         
	//    7   16:getfield        #117 <Field Map ah.a>
	//    8   19:ldc1            #38  <String "android:changeTransform:matrix">
	//    9   21:invokeinterface #123 <Method Object Map.get(Object)>
	//   10   26:checkcast       #78  <Class Matrix>
	//   11   29:astore          5
		Object obj = ((Object) (ah1));
	//   12   31:aload_1         
	//   13   32:astore          4
		if(ah1 == null)
	//*  14   34:aload_1         
	//*  15   35:ifnonnull       43
			obj = ((Object) (o.a));
	//   16   38:getstatic       #127 <Field Matrix o.a>
	//   17   41:astore          4
		ah1 = ((ah) (matrix));
	//   18   43:aload           5
	//   19   45:astore_1        
		if(matrix == null)
	//*  20   46:aload           5
	//*  21   48:ifnonnull       55
			ah1 = ((ah) (o.a));
	//   22   51:getstatic       #127 <Field Matrix o.a>
	//   23   54:astore_1        
		if(((Matrix) (obj)).equals(((Object) (ah1))))
	//*  24   55:aload           4
	//*  25   57:aload_1         
	//*  26   58:invokevirtual   #131 <Method boolean Matrix.equals(Object)>
	//*  27   61:ifeq            66
		{
			return null;
	//   28   64:aconst_null     
	//   29   65:areturn         
		} else
		{
			c c1 = (c)ah2.a.get("android:changeTransform:transforms");
	//   30   66:aload_2         
	//   31   67:getfield        #117 <Field Map ah.a>
	//   32   70:ldc1            #40  <String "android:changeTransform:transforms">
	//   33   72:invokeinterface #123 <Method Object Map.get(Object)>
	//   34   77:checkcast       #18  <Class ChangeTransform$c>
	//   35   80:astore          5
			ah2 = ((ah) (ah2.b));
	//   36   82:aload_2         
	//   37   83:getfield        #134 <Field View ah.b>
	//   38   86:astore_2        
			e(((View) (ah2)));
	//   39   87:aload_2         
	//   40   88:invokestatic    #138 <Method void e(View)>
			float af[] = new float[9];
	//   41   91:bipush          9
	//   42   93:newarray        float[]
	//   43   95:astore          6
			((Matrix) (obj)).getValues(af);
	//   44   97:aload           4
	//   45   99:aload           6
	//   46  101:invokevirtual   #142 <Method void Matrix.getValues(float[])>
			float af1[] = new float[9];
	//   47  104:bipush          9
	//   48  106:newarray        float[]
	//   49  108:astore          8
			((Matrix) (ah1)).getValues(af1);
	//   50  110:aload_1         
	//   51  111:aload           8
	//   52  113:invokevirtual   #142 <Method void Matrix.getValues(float[])>
			obj = ((Object) (new b(((View) (ah2)), af)));
	//   53  116:new             #15  <Class ChangeTransform$b>
	//   54  119:dup             
	//   55  120:aload_2         
	//   56  121:aload           6
	//   57  123:invokespecial   #145 <Method void ChangeTransform$b(View, float[])>
	//   58  126:astore          4
			PropertyValuesHolder propertyvaluesholder = PropertyValuesHolder.ofObject(h, ((android.animation.TypeEvaluator) (new f(new float[9]))), ((Object []) (new float[][] {
				af, af1
			})));
	//   59  128:getstatic       #54  <Field Property h>
	//   60  131:new             #147 <Class f>
	//   61  134:dup             
	//   62  135:bipush          9
	//   63  137:newarray        float[]
	//   64  139:invokespecial   #149 <Method void f(float[])>
	//   65  142:iconst_2        
	//   66  143:anewarray       float[][]
	//   67  146:dup             
	//   68  147:iconst_0        
	//   69  148:aload           6
	//   70  150:aastore         
	//   71  151:dup             
	//   72  152:iconst_1        
	//   73  153:aload           8
	//   74  155:aastore         
	//   75  156:invokestatic    #155 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(Property, android.animation.TypeEvaluator, Object[])>
	//   76  159:astore          7
			Object obj1 = ((Object) (h().a(af[2], af[5], af1[2], af1[5])));
	//   77  161:aload_0         
	//   78  162:invokevirtual   #158 <Method PathMotion h()>
	//   79  165:aload           6
	//   80  167:iconst_2        
	//   81  168:faload          
	//   82  169:aload           6
	//   83  171:iconst_5        
	//   84  172:faload          
	//   85  173:aload           8
	//   86  175:iconst_2        
	//   87  176:faload          
	//   88  177:aload           8
	//   89  179:iconst_5        
	//   90  180:faload          
	//   91  181:invokevirtual   #163 <Method android.graphics.Path PathMotion.a(float, float, float, float)>
	//   92  184:astore          6
			obj1 = ((Object) (ObjectAnimator.ofPropertyValuesHolder(obj, new PropertyValuesHolder[] {
				propertyvaluesholder, u.a(i, ((android.graphics.Path) (obj1)))
			})));
	//   93  186:aload           4
	//   94  188:iconst_2        
	//   95  189:anewarray       PropertyValuesHolder[]
	//   96  192:dup             
	//   97  193:iconst_0        
	//   98  194:aload           7
	//   99  196:aastore         
	//  100  197:dup             
	//  101  198:iconst_1        
	//  102  199:getstatic       #61  <Field Property i>
	//  103  202:aload           6
	//  104  204:invokestatic    #168 <Method PropertyValuesHolder u.a(Property, android.graphics.Path)>
	//  105  207:aastore         
	//  106  208:invokestatic    #174 <Method ObjectAnimator ObjectAnimator.ofPropertyValuesHolder(Object, PropertyValuesHolder[])>
	//  107  211:astore          6
			ah1 = ((ah) (new AnimatorListenerAdapter(flag, ((Matrix) (ah1)), ((View) (ah2)), c1, ((b) (obj))) {

				private void a(Matrix matrix1)
				{
					h.set(matrix1);
				//    0    0:aload_0         
				//    1    1:getfield        #44  <Field Matrix h>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #49  <Method void Matrix.set(Matrix)>
					c.setTag(y.a.transition_transform, ((Object) (h)));
				//    4    8:aload_0         
				//    5    9:getfield        #32  <Field View c>
				//    6   12:getstatic       #55  <Field int y$a.transition_transform>
				//    7   15:aload_0         
				//    8   16:getfield        #44  <Field Matrix h>
				//    9   19:invokevirtual   #61  <Method void View.setTag(int, Object)>
					d.a(c);
				//   10   22:aload_0         
				//   11   23:getfield        #34  <Field ChangeTransform$c d>
				//   12   26:aload_0         
				//   13   27:getfield        #32  <Field View c>
				//   14   30:invokevirtual   #66  <Method void ChangeTransform$c.a(View)>
				//   15   33:return          
				}

				public void onAnimationCancel(Animator animator)
				{
					g = true;
				//    0    0:aload_0         
				//    1    1:iconst_1        
				//    2    2:putfield        #70  <Field boolean g>
				//    3    5:return          
				}

				public void onAnimationEnd(Animator animator)
				{
					if(!g)
				//*   0    0:aload_0         
				//*   1    1:getfield        #70  <Field boolean g>
				//*   2    4:ifne            57
						if(a && ChangeTransform.a(f))
				//*   3    7:aload_0         
				//*   4    8:getfield        #28  <Field boolean a>
				//*   5   11:ifeq            35
				//*   6   14:aload_0         
				//*   7   15:getfield        #26  <Field ChangeTransform f>
				//*   8   18:invokestatic    #74  <Method boolean ChangeTransform.a(ChangeTransform)>
				//*   9   21:ifeq            35
						{
							a(b);
				//   10   24:aload_0         
				//   11   25:aload_0         
				//   12   26:getfield        #30  <Field Matrix b>
				//   13   29:invokespecial   #76  <Method void a(Matrix)>
						} else
				//*  14   32:goto            57
						{
							c.setTag(y.a.transition_transform, ((Object) (null)));
				//   15   35:aload_0         
				//   16   36:getfield        #32  <Field View c>
				//   17   39:getstatic       #55  <Field int y$a.transition_transform>
				//   18   42:aconst_null     
				//   19   43:invokevirtual   #61  <Method void View.setTag(int, Object)>
							c.setTag(y.a.parent_matrix, ((Object) (null)));
				//   20   46:aload_0         
				//   21   47:getfield        #32  <Field View c>
				//   22   50:getstatic       #79  <Field int y$a.parent_matrix>
				//   23   53:aconst_null     
				//   24   54:invokevirtual   #61  <Method void View.setTag(int, Object)>
						}
					android.support.transition.au.c(c, ((Matrix) (null)));
				//   25   57:aload_0         
				//   26   58:getfield        #32  <Field View c>
				//   27   61:aconst_null     
				//   28   62:invokestatic    #84  <Method void android.support.transition.au.c(View, Matrix)>
					d.a(c);
				//   29   65:aload_0         
				//   30   66:getfield        #34  <Field ChangeTransform$c d>
				//   31   69:aload_0         
				//   32   70:getfield        #32  <Field View c>
				//   33   73:invokevirtual   #66  <Method void ChangeTransform$c.a(View)>
				//   34   76:return          
				}

				public void onAnimationPause(Animator animator)
				{
					a(e.a());
				//    0    0:aload_0         
				//    1    1:aload_0         
				//    2    2:getfield        #36  <Field ChangeTransform$b e>
				//    3    5:invokevirtual   #90  <Method Matrix ChangeTransform$b.a()>
				//    4    8:invokespecial   #76  <Method void a(Matrix)>
				//    5   11:return          
				}

				public void onAnimationResume(Animator animator)
				{
					ChangeTransform.a(c);
				//    0    0:aload_0         
				//    1    1:getfield        #32  <Field View c>
				//    2    4:invokestatic    #92  <Method void ChangeTransform.a(View)>
				//    3    7:return          
				}

				final boolean a;
				final Matrix b;
				final View c;
				final c d;
				final b e;
				final ChangeTransform f;
				private boolean g;
				private Matrix h;

			
			{
				f = ChangeTransform.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field ChangeTransform f>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #28  <Field boolean a>
				b = matrix;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field Matrix b>
				c = view;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field View c>
				d = c1;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #34  <Field ChangeTransform$c d>
				e = b1;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #36  <Field ChangeTransform$b e>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #39  <Method void AnimatorListenerAdapter()>
				h = new Matrix();
			//   20   37:aload_0         
			//   21   38:new             #41  <Class Matrix>
			//   22   41:dup             
			//   23   42:invokespecial   #42  <Method void Matrix()>
			//   24   45:putfield        #44  <Field Matrix h>
			//   25   48:return          
			}
			}
));
	//  108  213:new             #10  <Class ChangeTransform$3>
	//  109  216:dup             
	//  110  217:aload_0         
	//  111  218:iload_3         
	//  112  219:aload_1         
	//  113  220:aload_2         
	//  114  221:aload           5
	//  115  223:aload           4
	//  116  225:invokespecial   #177 <Method void ChangeTransform$3(ChangeTransform, boolean, Matrix, View, ChangeTransform$c, ChangeTransform$b)>
	//  117  228:astore_1        
			((ObjectAnimator) (obj1)).addListener(((android.animation.Animator.AnimatorListener) (ah1)));
	//  118  229:aload           6
	//  119  231:aload_1         
	//  120  232:invokevirtual   #181 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
			android.support.transition.a.a(((Animator) (obj1)), ((AnimatorListenerAdapter) (ah1)));
	//  121  235:aload           6
	//  122  237:aload_1         
	//  123  238:invokestatic    #186 <Method void a.a(Animator, AnimatorListenerAdapter)>
			return ((ObjectAnimator) (obj1));
	//  124  241:aload           6
	//  125  243:areturn         
		}
	}

	static void a(View view)
	{
		e(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #138 <Method void e(View)>
	//    2    4:return          
	}

	static void a(View view, float f1, float f2, float f3, float f4, float f5, float f6, float f7, 
			float f8)
	{
		b(view, f1, f2, f3, f4, f5, f6, f7, f8);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:fload           5
	//    6    8:fload           6
	//    7   10:fload           7
	//    8   12:fload           8
	//    9   14:invokestatic    #189 <Method void b(View, float, float, float, float, float, float, float, float)>
	//   10   17:return          
	}

	static boolean a(ChangeTransform changetransform)
	{
		return changetransform.k;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field boolean k>
	//    2    4:ireturn         
	}

	private boolean a(ViewGroup viewgroup, ViewGroup viewgroup1)
	{
		return b(((View) (viewgroup))) && b(((View) (viewgroup1))) ? (viewgroup = ((ViewGroup) (b(((View) (viewgroup)), true)))) == null || viewgroup1 != ((ah) (viewgroup)).b : viewgroup != viewgroup1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #194 <Method boolean b(View)>
	//    3    5:ifeq            40
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #194 <Method boolean b(View)>
	//    7   13:ifne            19
	//    8   16:goto            40
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #197 <Method ah b(View, boolean)>
	//   13   25:astore_1        
	//   14   26:aload_1         
	//   15   27:ifnull          48
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:getfield        #134 <Field View ah.b>
	//   19   35:if_acmpne       48
	//   20   38:iconst_1        
	//   21   39:ireturn         
	//   22   40:aload_1         
	//   23   41:aload_2         
	//   24   42:if_acmpne       48
	//   25   45:goto            38
	//   26   48:iconst_0        
	//   27   49:ireturn         
	}

	private void b(ah ah1, ah ah2)
	{
		Matrix matrix = (Matrix)ah2.a.get("android:changeTransform:parentMatrix");
	//    0    0:aload_2         
	//    1    1:getfield        #117 <Field Map ah.a>
	//    2    4:ldc1            #42  <String "android:changeTransform:parentMatrix">
	//    3    6:invokeinterface #123 <Method Object Map.get(Object)>
	//    4   11:checkcast       #78  <Class Matrix>
	//    5   14:astore_3        
		ah2.b.setTag(y.a.parent_matrix, ((Object) (matrix)));
	//    6   15:aload_2         
	//    7   16:getfield        #134 <Field View ah.b>
	//    8   19:getstatic       #203 <Field int y$a.parent_matrix>
	//    9   22:aload_3         
	//   10   23:invokevirtual   #209 <Method void View.setTag(int, Object)>
		Matrix matrix1 = m;
	//   11   26:aload_0         
	//   12   27:getfield        #81  <Field Matrix m>
	//   13   30:astore          4
		matrix1.reset();
	//   14   32:aload           4
	//   15   34:invokevirtual   #212 <Method void Matrix.reset()>
		matrix.invert(matrix1);
	//   16   37:aload_3         
	//   17   38:aload           4
	//   18   40:invokevirtual   #216 <Method boolean Matrix.invert(Matrix)>
	//   19   43:pop             
		matrix = (Matrix)ah1.a.get("android:changeTransform:matrix");
	//   20   44:aload_1         
	//   21   45:getfield        #117 <Field Map ah.a>
	//   22   48:ldc1            #38  <String "android:changeTransform:matrix">
	//   23   50:invokeinterface #123 <Method Object Map.get(Object)>
	//   24   55:checkcast       #78  <Class Matrix>
	//   25   58:astore_3        
		ah2 = ((ah) (matrix));
	//   26   59:aload_3         
	//   27   60:astore_2        
		if(matrix == null)
	//*  28   61:aload_3         
	//*  29   62:ifnonnull       86
		{
			ah2 = ((ah) (new Matrix()));
	//   30   65:new             #78  <Class Matrix>
	//   31   68:dup             
	//   32   69:invokespecial   #79  <Method void Matrix()>
	//   33   72:astore_2        
			ah1.a.put("android:changeTransform:matrix", ((Object) (ah2)));
	//   34   73:aload_1         
	//   35   74:getfield        #117 <Field Map ah.a>
	//   36   77:ldc1            #38  <String "android:changeTransform:matrix">
	//   37   79:aload_2         
	//   38   80:invokeinterface #220 <Method Object Map.put(Object, Object)>
	//   39   85:pop             
		}
		((Matrix) (ah2)).postConcat((Matrix)ah1.a.get("android:changeTransform:parentMatrix"));
	//   40   86:aload_2         
	//   41   87:aload_1         
	//   42   88:getfield        #117 <Field Map ah.a>
	//   43   91:ldc1            #42  <String "android:changeTransform:parentMatrix">
	//   44   93:invokeinterface #123 <Method Object Map.get(Object)>
	//   45   98:checkcast       #78  <Class Matrix>
	//   46  101:invokevirtual   #223 <Method boolean Matrix.postConcat(Matrix)>
	//   47  104:pop             
		((Matrix) (ah2)).postConcat(matrix1);
	//   48  105:aload_2         
	//   49  106:aload           4
	//   50  108:invokevirtual   #223 <Method boolean Matrix.postConcat(Matrix)>
	//   51  111:pop             
	//   52  112:return          
	}

	private static void b(View view, float f1, float f2, float f3, float f4, float f5, float f6, float f7, 
			float f8)
	{
		view.setTranslationX(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #227 <Method void View.setTranslationX(float)>
		view.setTranslationY(f2);
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:invokevirtual   #230 <Method void View.setTranslationY(float)>
		s.b(view, f3);
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:invokestatic    #235 <Method void s.b(View, float)>
		view.setScaleX(f4);
	//    9   15:aload_0         
	//   10   16:fload           4
	//   11   18:invokevirtual   #238 <Method void View.setScaleX(float)>
		view.setScaleY(f5);
	//   12   21:aload_0         
	//   13   22:fload           5
	//   14   24:invokevirtual   #241 <Method void View.setScaleY(float)>
		view.setRotationX(f6);
	//   15   27:aload_0         
	//   16   28:fload           6
	//   17   30:invokevirtual   #244 <Method void View.setRotationX(float)>
		view.setRotationY(f7);
	//   18   33:aload_0         
	//   19   34:fload           7
	//   20   36:invokevirtual   #247 <Method void View.setRotationY(float)>
		view.setRotation(f8);
	//   21   39:aload_0         
	//   22   40:fload           8
	//   23   42:invokevirtual   #250 <Method void View.setRotation(float)>
	//   24   45:return          
	}

	private void b(ViewGroup viewgroup, ah ah1, ah ah2)
	{
		View view = ah2.b;
	//    0    0:aload_3         
	//    1    1:getfield        #134 <Field View ah.b>
	//    2    4:astore          4
		Object obj = ((Object) (new Matrix((Matrix)ah2.a.get("android:changeTransform:parentMatrix"))));
	//    3    6:new             #78  <Class Matrix>
	//    4    9:dup             
	//    5   10:aload_3         
	//    6   11:getfield        #117 <Field Map ah.a>
	//    7   14:ldc1            #42  <String "android:changeTransform:parentMatrix">
	//    8   16:invokeinterface #123 <Method Object Map.get(Object)>
	//    9   21:checkcast       #78  <Class Matrix>
	//   10   24:invokespecial   #254 <Method void Matrix(Matrix)>
	//   11   27:astore          5
		au.b(((View) (viewgroup)), ((Matrix) (obj)));
	//   12   29:aload_1         
	//   13   30:aload           5
	//   14   32:invokestatic    #259 <Method void au.b(View, Matrix)>
		obj = ((Object) (android.support.transition.j.a(view, viewgroup, ((Matrix) (obj)))));
	//   15   35:aload           4
	//   16   37:aload_1         
	//   17   38:aload           5
	//   18   40:invokestatic    #264 <Method i j.a(View, ViewGroup, Matrix)>
	//   19   43:astore          5
		if(obj == null)
	//*  20   45:aload           5
	//*  21   47:ifnonnull       51
			return;
	//   22   50:return          
		((i) (obj)).a((ViewGroup)ah1.a.get("android:changeTransform:parent"), ah1.b);
	//   23   51:aload           5
	//   24   53:aload_2         
	//   25   54:getfield        #117 <Field Map ah.a>
	//   26   57:ldc2            #266 <String "android:changeTransform:parent">
	//   27   60:invokeinterface #123 <Method Object Map.get(Object)>
	//   28   65:checkcast       #268 <Class ViewGroup>
	//   29   68:aload_2         
	//   30   69:getfield        #134 <Field View ah.b>
	//   31   72:invokeinterface #273 <Method void i.a(ViewGroup, View)>
		for(viewgroup = ((ViewGroup) (this)); ((Transition) (viewgroup)).d != null; viewgroup = ((ViewGroup) (((Transition) (viewgroup)).d)));
	//   32   77:aload_0         
	//   33   78:astore_1        
	//   34   79:aload_1         
	//   35   80:getfield        #277 <Field TransitionSet Transition.d>
	//   36   83:ifnull          94
	//   37   86:aload_1         
	//   38   87:getfield        #277 <Field TransitionSet Transition.d>
	//   39   90:astore_1        
	//*  40   91:goto            79
		((Transition) (viewgroup)).a(((Transition.c) (new a(view, ((i) (obj))))));
	//   41   94:aload_1         
	//   42   95:new             #12  <Class ChangeTransform$a>
	//   43   98:dup             
	//   44   99:aload           4
	//   45  101:aload           5
	//   46  103:invokespecial   #280 <Method void ChangeTransform$a(View, i)>
	//   47  106:invokevirtual   #283 <Method Transition Transition.a(Transition$c)>
	//   48  109:pop             
		if(j)
	//*  49  110:getstatic       #69  <Field boolean j>
	//*  50  113:ifeq            141
		{
			if(ah1.b != ah2.b)
	//*  51  116:aload_2         
	//*  52  117:getfield        #134 <Field View ah.b>
	//*  53  120:aload_3         
	//*  54  121:getfield        #134 <Field View ah.b>
	//*  55  124:if_acmpeq       135
				au.a(ah1.b, 0.0F);
	//   56  127:aload_2         
	//   57  128:getfield        #134 <Field View ah.b>
	//   58  131:fconst_0        
	//   59  132:invokestatic    #285 <Method void au.a(View, float)>
			au.a(view, 1.0F);
	//   60  135:aload           4
	//   61  137:fconst_1        
	//   62  138:invokestatic    #285 <Method void au.a(View, float)>
		}
	//   63  141:return          
	}

	private void d(ah ah1)
	{
		View view = ah1.b;
	//    0    0:aload_1         
	//    1    1:getfield        #134 <Field View ah.b>
	//    2    4:astore_3        
		if(view.getVisibility() == 8)
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #290 <Method int View.getVisibility()>
	//*   5    9:bipush          8
	//*   6   11:icmpne          15
			return;
	//    7   14:return          
		ah1.a.put("android:changeTransform:parent", ((Object) (view.getParent())));
	//    8   15:aload_1         
	//    9   16:getfield        #117 <Field Map ah.a>
	//   10   19:ldc2            #266 <String "android:changeTransform:parent">
	//   11   22:aload_3         
	//   12   23:invokevirtual   #294 <Method android.view.ViewParent View.getParent()>
	//   13   26:invokeinterface #220 <Method Object Map.put(Object, Object)>
	//   14   31:pop             
		Object obj = ((Object) (new c(view)));
	//   15   32:new             #18  <Class ChangeTransform$c>
	//   16   35:dup             
	//   17   36:aload_3         
	//   18   37:invokespecial   #296 <Method void ChangeTransform$c(View)>
	//   19   40:astore_2        
		ah1.a.put("android:changeTransform:transforms", obj);
	//   20   41:aload_1         
	//   21   42:getfield        #117 <Field Map ah.a>
	//   22   45:ldc1            #40  <String "android:changeTransform:transforms">
	//   23   47:aload_2         
	//   24   48:invokeinterface #220 <Method Object Map.put(Object, Object)>
	//   25   53:pop             
		obj = ((Object) (view.getMatrix()));
	//   26   54:aload_3         
	//   27   55:invokevirtual   #300 <Method Matrix View.getMatrix()>
	//   28   58:astore_2        
		if(obj != null && !((Matrix) (obj)).isIdentity())
	//*  29   59:aload_2         
	//*  30   60:ifnull          85
	//*  31   63:aload_2         
	//*  32   64:invokevirtual   #304 <Method boolean Matrix.isIdentity()>
	//*  33   67:ifeq            73
	//*  34   70:goto            85
			obj = ((Object) (new Matrix(((Matrix) (obj)))));
	//   35   73:new             #78  <Class Matrix>
	//   36   76:dup             
	//   37   77:aload_2         
	//   38   78:invokespecial   #254 <Method void Matrix(Matrix)>
	//   39   81:astore_2        
		else
	//*  40   82:goto            87
			obj = null;
	//   41   85:aconst_null     
	//   42   86:astore_2        
		ah1.a.put("android:changeTransform:matrix", obj);
	//   43   87:aload_1         
	//   44   88:getfield        #117 <Field Map ah.a>
	//   45   91:ldc1            #38  <String "android:changeTransform:matrix">
	//   46   93:aload_2         
	//   47   94:invokeinterface #220 <Method Object Map.put(Object, Object)>
	//   48   99:pop             
		if(l)
	//*  49  100:aload_0         
	//*  50  101:getfield        #76  <Field boolean l>
	//*  51  104:ifeq            202
		{
			Matrix matrix = new Matrix();
	//   52  107:new             #78  <Class Matrix>
	//   53  110:dup             
	//   54  111:invokespecial   #79  <Method void Matrix()>
	//   55  114:astore_2        
			ViewGroup viewgroup = (ViewGroup)view.getParent();
	//   56  115:aload_3         
	//   57  116:invokevirtual   #294 <Method android.view.ViewParent View.getParent()>
	//   58  119:checkcast       #268 <Class ViewGroup>
	//   59  122:astore          4
			au.a(((View) (viewgroup)), matrix);
	//   60  124:aload           4
	//   61  126:aload_2         
	//   62  127:invokestatic    #306 <Method void au.a(View, Matrix)>
			matrix.preTranslate(-viewgroup.getScrollX(), -viewgroup.getScrollY());
	//   63  130:aload_2         
	//   64  131:aload           4
	//   65  133:invokevirtual   #309 <Method int ViewGroup.getScrollX()>
	//   66  136:ineg            
	//   67  137:i2f             
	//   68  138:aload           4
	//   69  140:invokevirtual   #312 <Method int ViewGroup.getScrollY()>
	//   70  143:ineg            
	//   71  144:i2f             
	//   72  145:invokevirtual   #316 <Method boolean Matrix.preTranslate(float, float)>
	//   73  148:pop             
			ah1.a.put("android:changeTransform:parentMatrix", ((Object) (matrix)));
	//   74  149:aload_1         
	//   75  150:getfield        #117 <Field Map ah.a>
	//   76  153:ldc1            #42  <String "android:changeTransform:parentMatrix">
	//   77  155:aload_2         
	//   78  156:invokeinterface #220 <Method Object Map.put(Object, Object)>
	//   79  161:pop             
			ah1.a.put("android:changeTransform:intermediateMatrix", view.getTag(y.a.transition_transform));
	//   80  162:aload_1         
	//   81  163:getfield        #117 <Field Map ah.a>
	//   82  166:ldc2            #318 <String "android:changeTransform:intermediateMatrix">
	//   83  169:aload_3         
	//   84  170:getstatic       #321 <Field int y$a.transition_transform>
	//   85  173:invokevirtual   #325 <Method Object View.getTag(int)>
	//   86  176:invokeinterface #220 <Method Object Map.put(Object, Object)>
	//   87  181:pop             
			ah1.a.put("android:changeTransform:intermediateParentMatrix", view.getTag(y.a.parent_matrix));
	//   88  182:aload_1         
	//   89  183:getfield        #117 <Field Map ah.a>
	//   90  186:ldc2            #327 <String "android:changeTransform:intermediateParentMatrix">
	//   91  189:aload_3         
	//   92  190:getstatic       #203 <Field int y$a.parent_matrix>
	//   93  193:invokevirtual   #325 <Method Object View.getTag(int)>
	//   94  196:invokeinterface #220 <Method Object Map.put(Object, Object)>
	//   95  201:pop             
		}
	//   96  202:return          
	}

	private static void e(View view)
	{
		b(view, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:fconst_0        
	//    4    4:fconst_1        
	//    5    5:fconst_1        
	//    6    6:fconst_0        
	//    7    7:fconst_0        
	//    8    8:fconst_0        
	//    9    9:invokestatic    #189 <Method void b(View, float, float, float, float, float, float, float, float)>
	//   10   12:return          
	}

	public Animator a(ViewGroup viewgroup, ah ah1, ah ah2)
	{
		if(ah1 != null && ah2 != null && ah1.a.containsKey("android:changeTransform:parent") && ah2.a.containsKey("android:changeTransform:parent"))
	//*   0    0:aload_2         
	//*   1    1:ifnull          240
	//*   2    4:aload_3         
	//*   3    5:ifnull          240
	//*   4    8:aload_2         
	//*   5    9:getfield        #117 <Field Map ah.a>
	//*   6   12:ldc2            #266 <String "android:changeTransform:parent">
	//*   7   15:invokeinterface #331 <Method boolean Map.containsKey(Object)>
	//*   8   20:ifeq            240
	//*   9   23:aload_3         
	//*  10   24:getfield        #117 <Field Map ah.a>
	//*  11   27:ldc2            #266 <String "android:changeTransform:parent">
	//*  12   30:invokeinterface #331 <Method boolean Map.containsKey(Object)>
	//*  13   35:ifne            41
	//*  14   38:goto            240
		{
			ViewGroup viewgroup1 = (ViewGroup)ah1.a.get("android:changeTransform:parent");
	//   15   41:aload_2         
	//   16   42:getfield        #117 <Field Map ah.a>
	//   17   45:ldc2            #266 <String "android:changeTransform:parent">
	//   18   48:invokeinterface #123 <Method Object Map.get(Object)>
	//   19   53:checkcast       #268 <Class ViewGroup>
	//   20   56:astore          5
			Object obj = ((Object) ((ViewGroup)ah2.a.get("android:changeTransform:parent")));
	//   21   58:aload_3         
	//   22   59:getfield        #117 <Field Map ah.a>
	//   23   62:ldc2            #266 <String "android:changeTransform:parent">
	//   24   65:invokeinterface #123 <Method Object Map.get(Object)>
	//   25   70:checkcast       #268 <Class ViewGroup>
	//   26   73:astore          6
			boolean flag;
			if(l && !a(viewgroup1, ((ViewGroup) (obj))))
	//*  27   75:aload_0         
	//*  28   76:getfield        #76  <Field boolean l>
	//*  29   79:ifeq            99
	//*  30   82:aload_0         
	//*  31   83:aload           5
	//*  32   85:aload           6
	//*  33   87:invokespecial   #333 <Method boolean a(ViewGroup, ViewGroup)>
	//*  34   90:ifne            99
				flag = true;
	//   35   93:iconst_1        
	//   36   94:istore          4
			else
	//*  37   96:goto            102
				flag = false;
	//   38   99:iconst_0        
	//   39  100:istore          4
			obj = ((Object) ((Matrix)ah1.a.get("android:changeTransform:intermediateMatrix")));
	//   40  102:aload_2         
	//   41  103:getfield        #117 <Field Map ah.a>
	//   42  106:ldc2            #318 <String "android:changeTransform:intermediateMatrix">
	//   43  109:invokeinterface #123 <Method Object Map.get(Object)>
	//   44  114:checkcast       #78  <Class Matrix>
	//   45  117:astore          6
			if(obj != null)
	//*  46  119:aload           6
	//*  47  121:ifnull          138
				ah1.a.put("android:changeTransform:matrix", obj);
	//   48  124:aload_2         
	//   49  125:getfield        #117 <Field Map ah.a>
	//   50  128:ldc1            #38  <String "android:changeTransform:matrix">
	//   51  130:aload           6
	//   52  132:invokeinterface #220 <Method Object Map.put(Object, Object)>
	//   53  137:pop             
			obj = ((Object) ((Matrix)ah1.a.get("android:changeTransform:intermediateParentMatrix")));
	//   54  138:aload_2         
	//   55  139:getfield        #117 <Field Map ah.a>
	//   56  142:ldc2            #327 <String "android:changeTransform:intermediateParentMatrix">
	//   57  145:invokeinterface #123 <Method Object Map.get(Object)>
	//   58  150:checkcast       #78  <Class Matrix>
	//   59  153:astore          6
			if(obj != null)
	//*  60  155:aload           6
	//*  61  157:ifnull          174
				ah1.a.put("android:changeTransform:parentMatrix", obj);
	//   62  160:aload_2         
	//   63  161:getfield        #117 <Field Map ah.a>
	//   64  164:ldc1            #42  <String "android:changeTransform:parentMatrix">
	//   65  166:aload           6
	//   66  168:invokeinterface #220 <Method Object Map.put(Object, Object)>
	//   67  173:pop             
			if(flag)
	//*  68  174:iload           4
	//*  69  176:ifeq            185
				b(ah1, ah2);
	//   70  179:aload_0         
	//   71  180:aload_2         
	//   72  181:aload_3         
	//   73  182:invokespecial   #335 <Method void b(ah, ah)>
			obj = ((Object) (a(ah1, ah2, flag)));
	//   74  185:aload_0         
	//   75  186:aload_2         
	//   76  187:aload_3         
	//   77  188:iload           4
	//   78  190:invokespecial   #337 <Method ObjectAnimator a(ah, ah, boolean)>
	//   79  193:astore          6
			if(flag && obj != null && k)
	//*  80  195:iload           4
	//*  81  197:ifeq            222
	//*  82  200:aload           6
	//*  83  202:ifnull          222
	//*  84  205:aload_0         
	//*  85  206:getfield        #74  <Field boolean k>
	//*  86  209:ifeq            222
			{
				b(viewgroup, ah1, ah2);
	//   87  212:aload_0         
	//   88  213:aload_1         
	//   89  214:aload_2         
	//   90  215:aload_3         
	//   91  216:invokespecial   #339 <Method void b(ViewGroup, ah, ah)>
				return ((Animator) (obj));
	//   92  219:aload           6
	//   93  221:areturn         
			}
			if(!j)
	//*  94  222:getstatic       #69  <Field boolean j>
	//*  95  225:ifne            237
				viewgroup1.endViewTransition(ah1.b);
	//   96  228:aload           5
	//   97  230:aload_2         
	//   98  231:getfield        #134 <Field View ah.b>
	//   99  234:invokevirtual   #342 <Method void ViewGroup.endViewTransition(View)>
			return ((Animator) (obj));
	//  100  237:aload           6
	//  101  239:areturn         
		} else
		{
			return null;
	//  102  240:aconst_null     
	//  103  241:areturn         
		}
	}

	public void a(ah ah1)
	{
		d(ah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #344 <Method void d(ah)>
		if(!j)
	//*   3    5:getstatic       #69  <Field boolean j>
	//*   4    8:ifne            28
			((ViewGroup)ah1.b.getParent()).startViewTransition(ah1.b);
	//    5   11:aload_1         
	//    6   12:getfield        #134 <Field View ah.b>
	//    7   15:invokevirtual   #294 <Method android.view.ViewParent View.getParent()>
	//    8   18:checkcast       #268 <Class ViewGroup>
	//    9   21:aload_1         
	//   10   22:getfield        #134 <Field View ah.b>
	//   11   25:invokevirtual   #347 <Method void ViewGroup.startViewTransition(View)>
	//   12   28:return          
	}

	public String[] a()
	{
		return g;
	//    0    0:getstatic       #44  <Field String[] g>
	//    1    3:areturn         
	}

	public void b(ah ah1)
	{
		d(ah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #344 <Method void d(ah)>
	//    3    5:return          
	}

	private static final String g[] = {
		"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"
	};
	private static final Property h = new Property([F, "nonTranslations") {

		public void a(b b1, float af[])
		{
			b1.a(af);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #19  <Method void ChangeTransform$b.a(float[])>
		//    3    5:return          
		}

		public float[] a(b b1)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Object get(Object obj)
		{
			return ((Object) (a((b)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #16  <Class ChangeTransform$b>
		//    3    5:invokevirtual   #24  <Method float[] a(ChangeTransform$b)>
		//    4    8:areturn         
		}

		public void set(Object obj, Object obj1)
		{
			a((b)obj, (float[])obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #16  <Class ChangeTransform$b>
		//    3    5:aload_2         
		//    4    6:checkcast       #28  <Class float[]>
		//    5    9:invokevirtual   #30  <Method void a(ChangeTransform$b, float[])>
		//    6   12:return          
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #11  <Method void Property(Class, String)>
			//    4    6:return          
			}
	}
;
	private static final Property i = new Property(android/graphics/PointF, "translations") {

		public PointF a(b b1)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void a(b b1, PointF pointf)
		{
			b1.a(pointf);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #20  <Method void ChangeTransform$b.a(PointF)>
		//    3    5:return          
		}

		public Object get(Object obj)
		{
			return ((Object) (a((b)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class ChangeTransform$b>
		//    3    5:invokevirtual   #24  <Method PointF a(ChangeTransform$b)>
		//    4    8:areturn         
		}

		public void set(Object obj, Object obj1)
		{
			a((b)obj, (PointF)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class ChangeTransform$b>
		//    3    5:aload_2         
		//    4    6:checkcast       #28  <Class PointF>
		//    5    9:invokevirtual   #30  <Method void a(ChangeTransform$b, PointF)>
		//    6   12:return          
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #11  <Method void Property(Class, String)>
			//    4    6:return          
			}
	}
;
	private static final boolean j;
	private boolean k;
	private boolean l;
	private Matrix m;

	static 
	{
	//    0    0:iconst_3        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #38  <String "android:changeTransform:matrix">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #40  <String "android:changeTransform:transforms">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #42  <String "android:changeTransform:parentMatrix">
	//   13   18:aastore         
	//   14   19:putstatic       #44  <Field String[] g>
	//   15   22:new             #6   <Class ChangeTransform$1>
	//   16   25:dup             
	//   17   26:ldc1            #46  <Class float[]>
	//   18   28:ldc1            #48  <String "nonTranslations">
	//   19   30:invokespecial   #52  <Method void ChangeTransform$1(Class, String)>
	//   20   33:putstatic       #54  <Field Property h>
	//   21   36:new             #8   <Class ChangeTransform$2>
	//   22   39:dup             
	//   23   40:ldc1            #56  <Class PointF>
	//   24   42:ldc1            #58  <String "translations">
	//   25   44:invokespecial   #59  <Method void ChangeTransform$2(Class, String)>
	//   26   47:putstatic       #61  <Field Property i>
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  27   50:getstatic       #67  <Field int android.os.Build$VERSION.SDK_INT>
	//*  28   53:bipush          21
	//*  29   55:icmplt          63
			flag = true;
	//   30   58:iconst_1        
	//   31   59:istore_0        
		else
	//*  32   60:goto            65
			flag = false;
	//   33   63:iconst_0        
	//   34   64:istore_0        
		j = flag;
	//   35   65:iload_0         
	//   36   66:putstatic       #69  <Field boolean j>
	//*  37   69:return          
	}
}
