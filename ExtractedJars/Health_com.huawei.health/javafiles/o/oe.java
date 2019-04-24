// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.Matrix;

// Referenced classes of package o:
//			nv, oa

public class oe extends nv
{

	public oe(oa oa1)
	{
		super(oa1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void nv(oa)>
	//    3    5:return          
	}

	public void e(boolean flag)
	{
		c.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Matrix c>
	//    2    4:invokevirtual   #21  <Method void Matrix.reset()>
		if(!flag)
	//*   3    7:iload_1         
	//*   4    8:ifne            42
		{
			c.postTranslate(a.a(), a.n() - a.d());
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field Matrix c>
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field oa a>
	//    9   19:invokevirtual   #30  <Method float oa.a()>
	//   10   22:aload_0         
	//   11   23:getfield        #25  <Field oa a>
	//   12   26:invokevirtual   #33  <Method float oa.n()>
	//   13   29:aload_0         
	//   14   30:getfield        #25  <Field oa a>
	//   15   33:invokevirtual   #36  <Method float oa.d()>
	//   16   36:fsub            
	//   17   37:invokevirtual   #40  <Method boolean Matrix.postTranslate(float, float)>
	//   18   40:pop             
			return;
	//   19   41:return          
		} else
		{
			c.setTranslate(-(a.o() - a.b()), a.n() - a.d());
	//   20   42:aload_0         
	//   21   43:getfield        #15  <Field Matrix c>
	//   22   46:aload_0         
	//   23   47:getfield        #25  <Field oa a>
	//   24   50:invokevirtual   #43  <Method float oa.o()>
	//   25   53:aload_0         
	//   26   54:getfield        #25  <Field oa a>
	//   27   57:invokevirtual   #46  <Method float oa.b()>
	//   28   60:fsub            
	//   29   61:fneg            
	//   30   62:aload_0         
	//   31   63:getfield        #25  <Field oa a>
	//   32   66:invokevirtual   #33  <Method float oa.n()>
	//   33   69:aload_0         
	//   34   70:getfield        #25  <Field oa a>
	//   35   73:invokevirtual   #36  <Method float oa.d()>
	//   36   76:fsub            
	//   37   77:invokevirtual   #50  <Method void Matrix.setTranslate(float, float)>
			c.postScale(-1F, 1.0F);
	//   38   80:aload_0         
	//   39   81:getfield        #15  <Field Matrix c>
	//   40   84:ldc1            #51  <Float -1F>
	//   41   86:fconst_1        
	//   42   87:invokevirtual   #54  <Method boolean Matrix.postScale(float, float)>
	//   43   90:pop             
			return;
	//   44   91:return          
		}
	}
}
