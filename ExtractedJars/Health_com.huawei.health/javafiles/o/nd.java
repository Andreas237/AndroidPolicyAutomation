// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.view.GestureDetector;
import android.view.MotionEvent;

// Referenced classes of package o:
//			ld, ne, mh

public abstract class nd extends android.view.GestureDetector.SimpleOnGestureListener
	implements android.view.View.OnTouchListener
{
	public static final class d extends Enum
	{

		public static d valueOf(String s)
		{
			return (d)Enum.valueOf(o/nd$d, s);
		//    0    0:ldc1            #2   <Class nd$d>
		//    1    2:aload_0         
		//    2    3:invokestatic    #76  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class nd$d>
		//    4    9:areturn         
		}

		public static d[] values()
		{
			return (d[])((d []) (n)).clone();
		//    0    0:getstatic       #68  <Field nd$d[] n>
		//    1    3:invokevirtual   #83  <Method Object _5B_Lo.nd$d_3B_.clone()>
		//    2    6:checkcast       #79  <Class nd$d[]>
		//    3    9:areturn         
		}

		public static final d a;
		public static final d b;
		public static final d c;
		public static final d d;
		public static final d e;
		public static final d f;
		public static final d g;
		public static final d h;
		public static final d i;
		public static final d k;
		private static final d n[];

		static 
		{
			e = new d("NONE", 0);
		//    0    0:new             #2   <Class nd$d>
		//    1    3:dup             
		//    2    4:ldc1            #24  <String "NONE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #28  <Method void nd$d(String, int)>
		//    5   10:putstatic       #30  <Field nd$d e>
			c = new d("DRAG", 1);
		//    6   13:new             #2   <Class nd$d>
		//    7   16:dup             
		//    8   17:ldc1            #32  <String "DRAG">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #28  <Method void nd$d(String, int)>
		//   11   23:putstatic       #34  <Field nd$d c>
			d = new d("X_ZOOM", 2);
		//   12   26:new             #2   <Class nd$d>
		//   13   29:dup             
		//   14   30:ldc1            #36  <String "X_ZOOM">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #28  <Method void nd$d(String, int)>
		//   17   36:putstatic       #38  <Field nd$d d>
			a = new d("Y_ZOOM", 3);
		//   18   39:new             #2   <Class nd$d>
		//   19   42:dup             
		//   20   43:ldc1            #40  <String "Y_ZOOM">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #28  <Method void nd$d(String, int)>
		//   23   49:putstatic       #42  <Field nd$d a>
			b = new d("PINCH_ZOOM", 4);
		//   24   52:new             #2   <Class nd$d>
		//   25   55:dup             
		//   26   56:ldc1            #44  <String "PINCH_ZOOM">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #28  <Method void nd$d(String, int)>
		//   29   62:putstatic       #46  <Field nd$d b>
			i = new d("ROTATE", 5);
		//   30   65:new             #2   <Class nd$d>
		//   31   68:dup             
		//   32   69:ldc1            #48  <String "ROTATE">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #28  <Method void nd$d(String, int)>
		//   35   75:putstatic       #50  <Field nd$d i>
			h = new d("SINGLE_TAP", 6);
		//   36   78:new             #2   <Class nd$d>
		//   37   81:dup             
		//   38   82:ldc1            #52  <String "SINGLE_TAP">
		//   39   84:bipush          6
		//   40   86:invokespecial   #28  <Method void nd$d(String, int)>
		//   41   89:putstatic       #54  <Field nd$d h>
			k = new d("DOUBLE_TAP", 7);
		//   42   92:new             #2   <Class nd$d>
		//   43   95:dup             
		//   44   96:ldc1            #56  <String "DOUBLE_TAP">
		//   45   98:bipush          7
		//   46  100:invokespecial   #28  <Method void nd$d(String, int)>
		//   47  103:putstatic       #58  <Field nd$d k>
			f = new d("LONG_PRESS", 8);
		//   48  106:new             #2   <Class nd$d>
		//   49  109:dup             
		//   50  110:ldc1            #60  <String "LONG_PRESS">
		//   51  112:bipush          8
		//   52  114:invokespecial   #28  <Method void nd$d(String, int)>
		//   53  117:putstatic       #62  <Field nd$d f>
			g = new d("FLING", 9);
		//   54  120:new             #2   <Class nd$d>
		//   55  123:dup             
		//   56  124:ldc1            #64  <String "FLING">
		//   57  126:bipush          9
		//   58  128:invokespecial   #28  <Method void nd$d(String, int)>
		//   59  131:putstatic       #66  <Field nd$d g>
			n = (new d[] {
				e, c, d, a, b, i, h, k, f, g
			});
		//   60  134:bipush          10
		//   61  136:anewarray       d[]
		//   62  139:dup             
		//   63  140:iconst_0        
		//   64  141:getstatic       #30  <Field nd$d e>
		//   65  144:aastore         
		//   66  145:dup             
		//   67  146:iconst_1        
		//   68  147:getstatic       #34  <Field nd$d c>
		//   69  150:aastore         
		//   70  151:dup             
		//   71  152:iconst_2        
		//   72  153:getstatic       #38  <Field nd$d d>
		//   73  156:aastore         
		//   74  157:dup             
		//   75  158:iconst_3        
		//   76  159:getstatic       #42  <Field nd$d a>
		//   77  162:aastore         
		//   78  163:dup             
		//   79  164:iconst_4        
		//   80  165:getstatic       #46  <Field nd$d b>
		//   81  168:aastore         
		//   82  169:dup             
		//   83  170:iconst_5        
		//   84  171:getstatic       #50  <Field nd$d i>
		//   85  174:aastore         
		//   86  175:dup             
		//   87  176:bipush          6
		//   88  178:getstatic       #54  <Field nd$d h>
		//   89  181:aastore         
		//   90  182:dup             
		//   91  183:bipush          7
		//   92  185:getstatic       #58  <Field nd$d k>
		//   93  188:aastore         
		//   94  189:dup             
		//   95  190:bipush          8
		//   96  192:getstatic       #62  <Field nd$d f>
		//   97  195:aastore         
		//   98  196:dup             
		//   99  197:bipush          9
		//  100  199:getstatic       #66  <Field nd$d g>
		//  101  202:aastore         
		//  102  203:putstatic       #68  <Field nd$d[] n>
		//* 103  206:return          
		}

		private d(String s, int j)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #70  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public nd(ld ld1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
		c = d.e;
	//    2    4:aload_0         
	//    3    5:getstatic       #27  <Field nd$d nd$d.e>
	//    4    8:putfield        #29  <Field nd$d c>
		a = 0;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #31  <Field int a>
		b = ld1;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #33  <Field ld b>
		e = new GestureDetector(ld1.getContext(), ((android.view.GestureDetector.OnGestureListener) (this)));
	//   11   21:aload_0         
	//   12   22:new             #35  <Class GestureDetector>
	//   13   25:dup             
	//   14   26:aload_1         
	//   15   27:invokevirtual   #41  <Method android.content.Context ld.getContext()>
	//   16   30:aload_0         
	//   17   31:invokespecial   #44  <Method void GestureDetector(android.content.Context, android.view.GestureDetector$OnGestureListener)>
	//   18   34:putfield        #46  <Field GestureDetector e>
	//   19   37:return          
	}

	protected static float d(float f, float f1, float f2, float f3)
	{
		f -= f1;
	//    0    0:fload_0         
	//    1    1:fload_1         
	//    2    2:fsub            
	//    3    3:fstore_0        
		f1 = f2 - f3;
	//    4    4:fload_2         
	//    5    5:fload_3         
	//    6    6:fsub            
	//    7    7:fstore_1        
		return (float)Math.sqrt(f * f + f1 * f1);
	//    8    8:fload_0         
	//    9    9:fload_0         
	//   10   10:fmul            
	//   11   11:fload_1         
	//   12   12:fload_1         
	//   13   13:fmul            
	//   14   14:fadd            
	//   15   15:f2d             
	//   16   16:invokestatic    #56  <Method double Math.sqrt(double)>
	//   17   19:d2f             
	//   18   20:freturn         
	}

	public void b(MotionEvent motionevent)
	{
		ne ne1 = b.getOnChartGestureListener();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ld b>
	//    2    4:invokevirtual   #61  <Method ne ld.getOnChartGestureListener()>
	//    3    7:astore_2        
		if(ne1 != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          23
			ne1.e(motionevent, c);
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field nd$d c>
	//   10   18:invokeinterface #66  <Method void ne.e(MotionEvent, nd$d)>
	//   11   23:return          
	}

	public void b(mh mh1)
	{
		d = mh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field mh d>
	//    3    5:return          
	}

	protected void c(mh mh1, MotionEvent motionevent)
	{
		if(mh1 == null || mh1.b(d))
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #69  <Field mh d>
	//*   5    9:invokevirtual   #75  <Method boolean mh.b(mh)>
	//*   6   12:ifeq            30
		{
			b.c(((mh) (null)), true);
	//    7   15:aload_0         
	//    8   16:getfield        #33  <Field ld b>
	//    9   19:aconst_null     
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #78  <Method void ld.c(mh, boolean)>
			d = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #69  <Field mh d>
			return;
	//   15   29:return          
		} else
		{
			b.c(mh1, true);
	//   16   30:aload_0         
	//   17   31:getfield        #33  <Field ld b>
	//   18   34:aload_1         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #78  <Method void ld.c(mh, boolean)>
			d = mh1;
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:putfield        #69  <Field mh d>
			return;
	//   24   44:return          
		}
	}

	public void e(MotionEvent motionevent)
	{
		ne ne1 = b.getOnChartGestureListener();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ld b>
	//    2    4:invokevirtual   #61  <Method ne ld.getOnChartGestureListener()>
	//    3    7:astore_2        
		if(ne1 != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          23
			ne1.a(motionevent, c);
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field nd$d c>
	//   10   18:invokeinterface #80  <Method void ne.a(MotionEvent, nd$d)>
	//   11   23:return          
	}

	protected int a;
	protected ld b;
	protected d c;
	protected mh d;
	protected GestureDetector e;
}
