// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.*;

// Referenced classes of package o:
//			nm, na

class nm$b
{

	protected void d(na na1, boolean flag, boolean flag1)
	{
		int j = na1.N();
	//    0    0:aload_1         
	//    1    1:invokeinterface #37  <Method int na.N()>
	//    2    6:istore          7
		float f = na1.e();
	//    3    8:aload_1         
	//    4    9:invokeinterface #40  <Method float na.e()>
	//    5   14:fstore          4
		float f1 = na1.b();
	//    6   16:aload_1         
	//    7   17:invokeinterface #42  <Method float na.b()>
	//    8   22:fstore          5
		for(int i = 0; i < j; i++)
	//*   9   24:iconst_0        
	//*  10   25:istore          6
	//*  11   27:iload           6
	//*  12   29:iload           7
	//*  13   31:icmpge          211
		{
			Object obj = ((Object) (android.graphics.p.Config.ARGB_4444));
	//   14   34:getstatic       #48  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_4444>
	//   15   37:astore          8
			obj = ((Object) (Bitmap.createBitmap((int)((double)f * 2.1000000000000001D), (int)((double)f * 2.1000000000000001D), ((android.graphics.p.Config) (obj)))));
	//   16   39:fload           4
	//   17   41:f2d             
	//   18   42:ldc2w           #49  <Double 2.1000000000000001D>
	//   19   45:dmul            
	//   20   46:d2i             
	//   21   47:fload           4
	//   22   49:f2d             
	//   23   50:ldc2w           #49  <Double 2.1000000000000001D>
	//   24   53:dmul            
	//   25   54:d2i             
	//   26   55:aload           8
	//   27   57:invokestatic    #56  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   28   60:astore          8
			Canvas canvas = new Canvas(((Bitmap) (obj)));
	//   29   62:new             #58  <Class Canvas>
	//   30   65:dup             
	//   31   66:aload           8
	//   32   68:invokespecial   #61  <Method void Canvas(Bitmap)>
	//   33   71:astore          9
			e[i] = ((Bitmap) (obj));
	//   34   73:aload_0         
	//   35   74:getfield        #63  <Field Bitmap[] e>
	//   36   77:iload           6
	//   37   79:aload           8
	//   38   81:aastore         
			a.h.setColor(na1.k(i));
	//   39   82:aload_0         
	//   40   83:getfield        #17  <Field nm a>
	//   41   86:getfield        #67  <Field Paint nm.h>
	//   42   89:aload_1         
	//   43   90:iload           6
	//   44   92:invokeinterface #71  <Method int na.k(int)>
	//   45   97:invokevirtual   #77  <Method void Paint.setColor(int)>
			if(flag1)
	//*  46  100:iload_3         
	//*  47  101:ifeq            162
			{
				c.reset();
	//   48  104:aload_0         
	//   49  105:getfield        #25  <Field Path c>
	//   50  108:invokevirtual   #80  <Method void Path.reset()>
				c.addCircle(f, f, f, android.graphics.Direction.CW);
	//   51  111:aload_0         
	//   52  112:getfield        #25  <Field Path c>
	//   53  115:fload           4
	//   54  117:fload           4
	//   55  119:fload           4
	//   56  121:getstatic       #86  <Field android.graphics.Path$Direction android.graphics.Path$Direction.CW>
	//   57  124:invokevirtual   #90  <Method void Path.addCircle(float, float, float, android.graphics.Path$Direction)>
				c.addCircle(f, f, f1, android.graphics.Direction.CCW);
	//   58  127:aload_0         
	//   59  128:getfield        #25  <Field Path c>
	//   60  131:fload           4
	//   61  133:fload           4
	//   62  135:fload           5
	//   63  137:getstatic       #93  <Field android.graphics.Path$Direction android.graphics.Path$Direction.CCW>
	//   64  140:invokevirtual   #90  <Method void Path.addCircle(float, float, float, android.graphics.Path$Direction)>
				canvas.drawPath(c, a.h);
	//   65  143:aload           9
	//   66  145:aload_0         
	//   67  146:getfield        #25  <Field Path c>
	//   68  149:aload_0         
	//   69  150:getfield        #17  <Field nm a>
	//   70  153:getfield        #67  <Field Paint nm.h>
	//   71  156:invokevirtual   #97  <Method void Canvas.drawPath(Path, Paint)>
				continue;
	//   72  159:goto            202
			}
			canvas.drawCircle(f, f, f, a.h);
	//   73  162:aload           9
	//   74  164:fload           4
	//   75  166:fload           4
	//   76  168:fload           4
	//   77  170:aload_0         
	//   78  171:getfield        #17  <Field nm a>
	//   79  174:getfield        #67  <Field Paint nm.h>
	//   80  177:invokevirtual   #101 <Method void Canvas.drawCircle(float, float, float, Paint)>
			if(flag)
	//*  81  180:iload_2         
	//*  82  181:ifeq            202
				canvas.drawCircle(f, f, f1, a.b);
	//   83  184:aload           9
	//   84  186:fload           4
	//   85  188:fload           4
	//   86  190:fload           5
	//   87  192:aload_0         
	//   88  193:getfield        #17  <Field nm a>
	//   89  196:getfield        #103 <Field Paint nm.b>
	//   90  199:invokevirtual   #101 <Method void Canvas.drawCircle(float, float, float, Paint)>
		}

	//   91  202:iload           6
	//   92  204:iconst_1        
	//   93  205:iadd            
	//   94  206:istore          6
	//*  95  208:goto            27
	//   96  211:return          
	}

	protected boolean d(na na1)
	{
		int i = na1.N();
	//    0    0:aload_1         
	//    1    1:invokeinterface #37  <Method int na.N()>
	//    2    6:istore_2        
		boolean flag = false;
	//    3    7:iconst_0        
	//    4    8:istore_3        
		if(e == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #63  <Field Bitmap[] e>
	//*   7   13:ifnonnull       26
		{
			e = new Bitmap[i];
	//    8   16:aload_0         
	//    9   17:iload_2         
	//   10   18:anewarray       Bitmap[]
	//   11   21:putfield        #63  <Field Bitmap[] e>
			return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		}
		if(e.length != i)
	//*  14   26:aload_0         
	//*  15   27:getfield        #63  <Field Bitmap[] e>
	//*  16   30:arraylength     
	//*  17   31:iload_2         
	//*  18   32:icmpeq          45
		{
			e = new Bitmap[i];
	//   19   35:aload_0         
	//   20   36:iload_2         
	//   21   37:anewarray       Bitmap[]
	//   22   40:putfield        #63  <Field Bitmap[] e>
			flag = true;
	//   23   43:iconst_1        
	//   24   44:istore_3        
		}
		return flag;
	//   25   45:iload_3         
	//   26   46:ireturn         
	}

	protected Bitmap e(int i)
	{
		return e[i % e.length];
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Bitmap[] e>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #63  <Field Bitmap[] e>
	//    5    9:arraylength     
	//    6   10:irem            
	//    7   11:aaload          
	//    8   12:areturn         
	}

	final nm a;
	private Path c;
	private Bitmap e[];

	private nm$b(nm nm1)
	{
		a = nm1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field nm a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		c = new Path();
	//    5    9:aload_0         
	//    6   10:new             #22  <Class Path>
	//    7   13:dup             
	//    8   14:invokespecial   #23  <Method void Path()>
	//    9   17:putfield        #25  <Field Path c>
	//   10   20:return          
	}

	nm$b(nm nm1, nm$2 nm$2)
	{
		this(nm1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void nm$b(nm)>
	//    3    5:return          
	}
}
