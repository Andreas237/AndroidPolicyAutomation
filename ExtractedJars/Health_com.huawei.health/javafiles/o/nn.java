// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.*;
import android.graphics.drawable.Drawable;

// Referenced classes of package o:
//			no, oc, oa, la

public abstract class nn extends no
{

	public nn(la la, oa oa1)
	{
		super(la, oa1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void no(la, oa)>
	//    4    6:return          
	}

	private boolean b()
	{
		return oc.a() >= 18;
	//    0    0:invokestatic    #17  <Method int oc.a()>
	//    1    3:bipush          18
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	protected void b(Canvas canvas, Path path, int i, int j)
	{
		i = j << 24 | 0xffffff & i;
	//    0    0:iload           4
	//    1    2:bipush          24
	//    2    4:ishl            
	//    3    5:ldc1            #19  <Int 0xffffff>
	//    4    7:iload_3         
	//    5    8:iand            
	//    6    9:ior             
	//    7   10:istore_3        
		if(b())
	//*   8   11:aload_0         
	//*   9   12:invokespecial   #21  <Method boolean b()>
	//*  10   15:ifeq            42
		{
			j = canvas.save();
	//   11   18:aload_1         
	//   12   19:invokevirtual   #26  <Method int Canvas.save()>
	//   13   22:istore          4
			canvas.clipPath(path);
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokevirtual   #30  <Method boolean Canvas.clipPath(Path)>
	//   17   29:pop             
			canvas.drawColor(i);
	//   18   30:aload_1         
	//   19   31:iload_3         
	//   20   32:invokevirtual   #34  <Method void Canvas.drawColor(int)>
			canvas.restoreToCount(j);
	//   21   35:aload_1         
	//   22   36:iload           4
	//   23   38:invokevirtual   #37  <Method void Canvas.restoreToCount(int)>
			return;
	//   24   41:return          
		} else
		{
			android.graphics.Paint.Style style = h.getStyle();
	//   25   42:aload_0         
	//   26   43:getfield        #41  <Field Paint h>
	//   27   46:invokevirtual   #47  <Method android.graphics.Paint$Style Paint.getStyle()>
	//   28   49:astore          5
			j = h.getColor();
	//   29   51:aload_0         
	//   30   52:getfield        #41  <Field Paint h>
	//   31   55:invokevirtual   #50  <Method int Paint.getColor()>
	//   32   58:istore          4
			h.setStyle(android.graphics.Paint.Style.FILL);
	//   33   60:aload_0         
	//   34   61:getfield        #41  <Field Paint h>
	//   35   64:getstatic       #56  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   36   67:invokevirtual   #60  <Method void Paint.setStyle(android.graphics.Paint$Style)>
			h.setColor(i);
	//   37   70:aload_0         
	//   38   71:getfield        #41  <Field Paint h>
	//   39   74:iload_3         
	//   40   75:invokevirtual   #63  <Method void Paint.setColor(int)>
			canvas.drawPath(path, h);
	//   41   78:aload_1         
	//   42   79:aload_2         
	//   43   80:aload_0         
	//   44   81:getfield        #41  <Field Paint h>
	//   45   84:invokevirtual   #67  <Method void Canvas.drawPath(Path, Paint)>
			h.setColor(j);
	//   46   87:aload_0         
	//   47   88:getfield        #41  <Field Paint h>
	//   48   91:iload           4
	//   49   93:invokevirtual   #63  <Method void Paint.setColor(int)>
			h.setStyle(style);
	//   50   96:aload_0         
	//   51   97:getfield        #41  <Field Paint h>
	//   52  100:aload           5
	//   53  102:invokevirtual   #60  <Method void Paint.setStyle(android.graphics.Paint$Style)>
			return;
	//   54  105:return          
		}
	}

	protected void d(Canvas canvas, Path path, Drawable drawable)
	{
		if(b())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #21  <Method boolean b()>
	//*   2    4:ifeq            67
		{
			int i = canvas.save();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #26  <Method int Canvas.save()>
	//    5   11:istore          4
			canvas.clipPath(path);
	//    6   13:aload_1         
	//    7   14:aload_2         
	//    8   15:invokevirtual   #30  <Method boolean Canvas.clipPath(Path)>
	//    9   18:pop             
			drawable.setBounds((int)l.f(), (int)l.e(), (int)l.h(), (int)l.i());
	//   10   19:aload_3         
	//   11   20:aload_0         
	//   12   21:getfield        #73  <Field oa l>
	//   13   24:invokevirtual   #79  <Method float oa.f()>
	//   14   27:f2i             
	//   15   28:aload_0         
	//   16   29:getfield        #73  <Field oa l>
	//   17   32:invokevirtual   #82  <Method float oa.e()>
	//   18   35:f2i             
	//   19   36:aload_0         
	//   20   37:getfield        #73  <Field oa l>
	//   21   40:invokevirtual   #84  <Method float oa.h()>
	//   22   43:f2i             
	//   23   44:aload_0         
	//   24   45:getfield        #73  <Field oa l>
	//   25   48:invokevirtual   #87  <Method float oa.i()>
	//   26   51:f2i             
	//   27   52:invokevirtual   #93  <Method void Drawable.setBounds(int, int, int, int)>
			drawable.draw(canvas);
	//   28   55:aload_3         
	//   29   56:aload_1         
	//   30   57:invokevirtual   #97  <Method void Drawable.draw(Canvas)>
			canvas.restoreToCount(i);
	//   31   60:aload_1         
	//   32   61:iload           4
	//   33   63:invokevirtual   #37  <Method void Canvas.restoreToCount(int)>
			return;
	//   34   66:return          
		} else
		{
			throw new RuntimeException((new StringBuilder()).append("Fill-drawables not (yet) supported below API level 18, this code was run on API level ").append(oc.a()).append(".").toString());
	//   35   67:new             #99  <Class RuntimeException>
	//   36   70:dup             
	//   37   71:new             #101 <Class StringBuilder>
	//   38   74:dup             
	//   39   75:invokespecial   #104 <Method void StringBuilder()>
	//   40   78:ldc1            #106 <String "Fill-drawables not (yet) supported below API level 18, this code was run on API level ">
	//   41   80:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   42   83:invokestatic    #17  <Method int oc.a()>
	//   43   86:invokevirtual   #113 <Method StringBuilder StringBuilder.append(int)>
	//   44   89:ldc1            #115 <String ".">
	//   45   91:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   46   94:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   47   97:invokespecial   #122 <Method void RuntimeException(String)>
	//   48  100:athrow          
		}
	}
}
