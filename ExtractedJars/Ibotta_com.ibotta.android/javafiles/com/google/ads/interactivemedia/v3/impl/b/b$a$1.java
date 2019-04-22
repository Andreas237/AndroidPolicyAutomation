// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl.b;

import android.graphics.*;
import android.graphics.drawable.shapes.Shape;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl.b:
//			b

class b$a$1 extends Shape
{

	public void draw(Canvas canvas, Paint paint)
	{
		canvas.drawPath(a, paint);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field Path a>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #25  <Method void Canvas.drawPath(Path, Paint)>
	//    5    9:return          
	}

	public void onResize(float f, float f1)
	{
		a = new Path();
	//    0    0:aload_0         
	//    1    1:new             #29  <Class Path>
	//    2    4:dup             
	//    3    5:invokespecial   #30  <Method void Path()>
	//    4    8:putfield        #19  <Field Path a>
		a.moveTo(getWidth(), getHeight());
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field Path a>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #34  <Method float getWidth()>
	//    9   19:aload_0         
	//   10   20:invokevirtual   #37  <Method float getHeight()>
	//   11   23:invokevirtual   #40  <Method void Path.moveTo(float, float)>
		Path path = a;
	//   12   26:aload_0         
	//   13   27:getfield        #19  <Field Path a>
	//   14   30:astore          4
		f = 6;
	//   15   32:bipush          6
	//   16   34:i2f             
	//   17   35:fstore_1        
		path.lineTo(f, getHeight());
	//   18   36:aload           4
	//   19   38:fload_1         
	//   20   39:aload_0         
	//   21   40:invokevirtual   #37  <Method float getHeight()>
	//   22   43:invokevirtual   #43  <Method void Path.lineTo(float, float)>
		path = a;
	//   23   46:aload_0         
	//   24   47:getfield        #19  <Field Path a>
	//   25   50:astore          4
		f1 = getHeight();
	//   26   52:aload_0         
	//   27   53:invokevirtual   #37  <Method float getHeight()>
	//   28   56:fstore_2        
		float f2 = 12;
	//   29   57:bipush          12
	//   30   59:i2f             
	//   31   60:fstore_3        
		path.arcTo(new RectF(0.0F, f1 - f2, f2, getHeight()), 90F, 90F);
	//   32   61:aload           4
	//   33   63:new             #45  <Class RectF>
	//   34   66:dup             
	//   35   67:fconst_0        
	//   36   68:fload_2         
	//   37   69:fload_3         
	//   38   70:fsub            
	//   39   71:fload_3         
	//   40   72:aload_0         
	//   41   73:invokevirtual   #37  <Method float getHeight()>
	//   42   76:invokespecial   #48  <Method void RectF(float, float, float, float)>
	//   43   79:ldc1            #49  <Float 90F>
	//   44   81:ldc1            #49  <Float 90F>
	//   45   83:invokevirtual   #53  <Method void Path.arcTo(RectF, float, float)>
		a.lineTo(0.0F, f);
	//   46   86:aload_0         
	//   47   87:getfield        #19  <Field Path a>
	//   48   90:fconst_0        
	//   49   91:fload_1         
	//   50   92:invokevirtual   #43  <Method void Path.lineTo(float, float)>
		a.arcTo(new RectF(0.0F, 0.0F, f2, f2), 180F, 90F);
	//   51   95:aload_0         
	//   52   96:getfield        #19  <Field Path a>
	//   53   99:new             #45  <Class RectF>
	//   54  102:dup             
	//   55  103:fconst_0        
	//   56  104:fconst_0        
	//   57  105:fload_3         
	//   58  106:fload_3         
	//   59  107:invokespecial   #48  <Method void RectF(float, float, float, float)>
	//   60  110:ldc1            #54  <Float 180F>
	//   61  112:ldc1            #49  <Float 90F>
	//   62  114:invokevirtual   #53  <Method void Path.arcTo(RectF, float, float)>
		a.lineTo(getWidth(), 0.0F);
	//   63  117:aload_0         
	//   64  118:getfield        #19  <Field Path a>
	//   65  121:aload_0         
	//   66  122:invokevirtual   #34  <Method float getWidth()>
	//   67  125:fconst_0        
	//   68  126:invokevirtual   #43  <Method void Path.lineTo(float, float)>
	//   69  129:return          
	}

	private Path a;

	b$a$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Shape()>
	//    2    4:return          
	}
}
