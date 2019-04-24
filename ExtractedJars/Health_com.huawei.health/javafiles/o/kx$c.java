// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.widget.OverScroller;

// Referenced classes of package o:
//			kx, km

class kx$c
	implements Runnable
{

	public void a(int i, int j, int k, int l)
	{
		RectF rectf = a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field kx a>
	//    2    4:invokevirtual   #34  <Method RectF kx.a()>
	//    3    7:astore          10
		if(rectf == null)
	//*   4    9:aload           10
	//*   5   11:ifnonnull       15
			return;
	//    6   14:return          
		int i1 = Math.round(-rectf.left);
	//    7   15:aload           10
	//    8   17:getfield        #40  <Field float RectF.left>
	//    9   20:fneg            
	//   10   21:invokestatic    #46  <Method int Math.round(float)>
	//   11   24:istore          5
		int j1;
		if((float)i < rectf.width())
	//*  12   26:iload_1         
	//*  13   27:i2f             
	//*  14   28:aload           10
	//*  15   30:invokevirtual   #50  <Method float RectF.width()>
	//*  16   33:fcmpg           
	//*  17   34:ifge            63
		{
			j1 = 0;
	//   18   37:iconst_0        
	//   19   38:istore          6
			int k1 = Math.round(rectf.width() - (float)i);
	//   20   40:aload           10
	//   21   42:invokevirtual   #50  <Method float RectF.width()>
	//   22   45:iload_1         
	//   23   46:i2f             
	//   24   47:fsub            
	//   25   48:invokestatic    #46  <Method int Math.round(float)>
	//   26   51:istore          7
			i = j1;
	//   27   53:iload           6
	//   28   55:istore_1        
			j1 = k1;
	//   29   56:iload           7
	//   30   58:istore          6
		} else
	//*  31   60:goto            70
		{
			j1 = i1;
	//   32   63:iload           5
	//   33   65:istore          6
			i = i1;
	//   34   67:iload           5
	//   35   69:istore_1        
		}
		int l1 = Math.round(-rectf.top);
	//   36   70:aload           10
	//   37   72:getfield        #53  <Field float RectF.top>
	//   38   75:fneg            
	//   39   76:invokestatic    #46  <Method int Math.round(float)>
	//   40   79:istore          7
		int i2;
		if((float)j < rectf.height())
	//*  41   81:iload_2         
	//*  42   82:i2f             
	//*  43   83:aload           10
	//*  44   85:invokevirtual   #56  <Method float RectF.height()>
	//*  45   88:fcmpg           
	//*  46   89:ifge            118
		{
			i2 = 0;
	//   47   92:iconst_0        
	//   48   93:istore          8
			int j2 = Math.round(rectf.height() - (float)j);
	//   49   95:aload           10
	//   50   97:invokevirtual   #56  <Method float RectF.height()>
	//   51  100:iload_2         
	//   52  101:i2f             
	//   53  102:fsub            
	//   54  103:invokestatic    #46  <Method int Math.round(float)>
	//   55  106:istore          9
			j = i2;
	//   56  108:iload           8
	//   57  110:istore_2        
			i2 = j2;
	//   58  111:iload           9
	//   59  113:istore          8
		} else
	//*  60  115:goto            125
		{
			i2 = l1;
	//   61  118:iload           7
	//   62  120:istore          8
			j = l1;
	//   63  122:iload           7
	//   64  124:istore_2        
		}
		c = i1;
	//   65  125:aload_0         
	//   66  126:iload           5
	//   67  128:putfield        #58  <Field int c>
		b = l1;
	//   68  131:aload_0         
	//   69  132:iload           7
	//   70  134:putfield        #60  <Field int b>
		if(i1 != j1 || l1 != i2)
	//*  71  137:iload           5
	//*  72  139:iload           6
	//*  73  141:icmpne          151
	//*  74  144:iload           7
	//*  75  146:iload           8
	//*  76  148:icmpeq          173
			e.fling(i1, l1, k, l, i, j1, j, i2, 0, 0);
	//   77  151:aload_0         
	//   78  152:getfield        #29  <Field OverScroller e>
	//   79  155:iload           5
	//   80  157:iload           7
	//   81  159:iload_3         
	//   82  160:iload           4
	//   83  162:iload_1         
	//   84  163:iload           6
	//   85  165:iload_2         
	//   86  166:iload           8
	//   87  168:iconst_0        
	//   88  169:iconst_0        
	//   89  170:invokevirtual   #64  <Method void OverScroller.fling(int, int, int, int, int, int, int, int, int, int)>
	//   90  173:return          
	}

	public void e()
	{
		e.forceFinished(true);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field OverScroller e>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #68  <Method void OverScroller.forceFinished(boolean)>
	//    4    8:return          
	}

	public void run()
	{
		if(e.isFinished())
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field OverScroller e>
	//*   2    4:invokevirtual   #73  <Method boolean OverScroller.isFinished()>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		if(e.computeScrollOffset())
	//*   5   11:aload_0         
	//*   6   12:getfield        #29  <Field OverScroller e>
	//*   7   15:invokevirtual   #76  <Method boolean OverScroller.computeScrollOffset()>
	//*   8   18:ifeq            97
		{
			int i = e.getCurrX();
	//    9   21:aload_0         
	//   10   22:getfield        #29  <Field OverScroller e>
	//   11   25:invokevirtual   #80  <Method int OverScroller.getCurrX()>
	//   12   28:istore_1        
			int j = e.getCurrY();
	//   13   29:aload_0         
	//   14   30:getfield        #29  <Field OverScroller e>
	//   15   33:invokevirtual   #83  <Method int OverScroller.getCurrY()>
	//   16   36:istore_2        
			kx.h(a).postTranslate(c - i, b - j);
	//   17   37:aload_0         
	//   18   38:getfield        #19  <Field kx a>
	//   19   41:invokestatic    #87  <Method Matrix kx.h(kx)>
	//   20   44:aload_0         
	//   21   45:getfield        #58  <Field int c>
	//   22   48:iload_1         
	//   23   49:isub            
	//   24   50:i2f             
	//   25   51:aload_0         
	//   26   52:getfield        #60  <Field int b>
	//   27   55:iload_2         
	//   28   56:isub            
	//   29   57:i2f             
	//   30   58:invokevirtual   #93  <Method boolean Matrix.postTranslate(float, float)>
	//   31   61:pop             
			kx.c(a, kx.f(a));
	//   32   62:aload_0         
	//   33   63:getfield        #19  <Field kx a>
	//   34   66:aload_0         
	//   35   67:getfield        #19  <Field kx a>
	//   36   70:invokestatic    #96  <Method Matrix kx.f(kx)>
	//   37   73:invokestatic    #99  <Method void kx.c(kx, Matrix)>
			c = i;
	//   38   76:aload_0         
	//   39   77:iload_1         
	//   40   78:putfield        #58  <Field int c>
			b = j;
	//   41   81:aload_0         
	//   42   82:iload_2         
	//   43   83:putfield        #60  <Field int b>
			km.a(((android.view.View) (kx.c(a))), ((Runnable) (this)));
	//   44   86:aload_0         
	//   45   87:getfield        #19  <Field kx a>
	//   46   90:invokestatic    #102 <Method android.widget.ImageView kx.c(kx)>
	//   47   93:aload_0         
	//   48   94:invokestatic    #107 <Method void km.a(android.view.View, Runnable)>
		}
	//   49   97:return          
	}

	final kx a;
	private int b;
	private int c;
	private final OverScroller e;

	public kx$c(kx kx1, Context context)
	{
		a = kx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field kx a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		e = new OverScroller(context);
	//    5    9:aload_0         
	//    6   10:new             #24  <Class OverScroller>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #27  <Method void OverScroller(Context)>
	//   10   18:putfield        #29  <Field OverScroller e>
	//   11   21:return          
	}
}
