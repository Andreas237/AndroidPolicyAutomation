// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;

import com.itextpdf.awt.geom.misc.Messages;
import java.util.NoSuchElementException;

// Referenced classes of package com.itextpdf.awt.geom:
//			PathIterator, Line2D, AffineTransform

class Line2D$Iterator
	implements PathIterator
{

	public int currentSegment(double ad[])
	{
		if(isDone())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #57  <Method boolean isDone()>
	//*   2    4:ifeq            20
			throw new NoSuchElementException(Messages.getString("awt.4B"));
	//    3    7:new             #59  <Class NoSuchElementException>
	//    4   10:dup             
	//    5   11:ldc1            #61  <String "awt.4B">
	//    6   13:invokestatic    #67  <Method String Messages.getString(String)>
	//    7   16:invokespecial   #70  <Method void NoSuchElementException(String)>
	//    8   19:athrow          
		int i;
		if(index == 0)
	//*   9   20:aload_0         
	//*  10   21:getfield        #72  <Field int index>
	//*  11   24:ifne            64
		{
			i = 0;
	//   12   27:iconst_0        
	//   13   28:istore_2        
			ad[0] = x1;
	//   14   29:aload_1         
	//   15   30:iconst_0        
	//   16   31:aload_0         
	//   17   32:getfield        #33  <Field double x1>
	//   18   35:dastore         
			ad[1] = y1;
	//   19   36:aload_1         
	//   20   37:iconst_1        
	//   21   38:aload_0         
	//   22   39:getfield        #38  <Field double y1>
	//   23   42:dastore         
		} else
	//*  24   43:aload_0         
	//*  25   44:getfield        #50  <Field AffineTransform t>
	//*  26   47:ifnull          62
	//*  27   50:aload_0         
	//*  28   51:getfield        #50  <Field AffineTransform t>
	//*  29   54:aload_1         
	//*  30   55:iconst_0        
	//*  31   56:aload_1         
	//*  32   57:iconst_0        
	//*  33   58:iconst_1        
	//*  34   59:invokevirtual   #78  <Method void AffineTransform.transform(double[], int, double[], int, int)>
	//*  35   62:iload_2         
	//*  36   63:ireturn         
		{
			i = 1;
	//   37   64:iconst_1        
	//   38   65:istore_2        
			ad[0] = x2;
	//   39   66:aload_1         
	//   40   67:iconst_0        
	//   41   68:aload_0         
	//   42   69:getfield        #43  <Field double x2>
	//   43   72:dastore         
			ad[1] = y2;
	//   44   73:aload_1         
	//   45   74:iconst_1        
	//   46   75:aload_0         
	//   47   76:getfield        #48  <Field double y2>
	//   48   79:dastore         
		}
		if(t != null)
			t.transform(ad, 0, ad, 0, 1);
		return i;
	//*  49   80:goto            43
	}

	public int currentSegment(float af[])
	{
		if(isDone())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #57  <Method boolean isDone()>
	//*   2    4:ifeq            20
			throw new NoSuchElementException(Messages.getString("awt.4B"));
	//    3    7:new             #59  <Class NoSuchElementException>
	//    4   10:dup             
	//    5   11:ldc1            #61  <String "awt.4B">
	//    6   13:invokestatic    #67  <Method String Messages.getString(String)>
	//    7   16:invokespecial   #70  <Method void NoSuchElementException(String)>
	//    8   19:athrow          
		int i;
		if(index == 0)
	//*   9   20:aload_0         
	//*  10   21:getfield        #72  <Field int index>
	//*  11   24:ifne            66
		{
			i = 0;
	//   12   27:iconst_0        
	//   13   28:istore_2        
			af[0] = (float)x1;
	//   14   29:aload_1         
	//   15   30:iconst_0        
	//   16   31:aload_0         
	//   17   32:getfield        #33  <Field double x1>
	//   18   35:d2f             
	//   19   36:fastore         
			af[1] = (float)y1;
	//   20   37:aload_1         
	//   21   38:iconst_1        
	//   22   39:aload_0         
	//   23   40:getfield        #38  <Field double y1>
	//   24   43:d2f             
	//   25   44:fastore         
		} else
	//*  26   45:aload_0         
	//*  27   46:getfield        #50  <Field AffineTransform t>
	//*  28   49:ifnull          64
	//*  29   52:aload_0         
	//*  30   53:getfield        #50  <Field AffineTransform t>
	//*  31   56:aload_1         
	//*  32   57:iconst_0        
	//*  33   58:aload_1         
	//*  34   59:iconst_0        
	//*  35   60:iconst_1        
	//*  36   61:invokevirtual   #82  <Method void AffineTransform.transform(float[], int, float[], int, int)>
	//*  37   64:iload_2         
	//*  38   65:ireturn         
		{
			i = 1;
	//   39   66:iconst_1        
	//   40   67:istore_2        
			af[0] = (float)x2;
	//   41   68:aload_1         
	//   42   69:iconst_0        
	//   43   70:aload_0         
	//   44   71:getfield        #43  <Field double x2>
	//   45   74:d2f             
	//   46   75:fastore         
			af[1] = (float)y2;
	//   47   76:aload_1         
	//   48   77:iconst_1        
	//   49   78:aload_0         
	//   50   79:getfield        #48  <Field double y2>
	//   51   82:d2f             
	//   52   83:fastore         
		}
		if(t != null)
			t.transform(af, 0, af, 0, 1);
		return i;
	//*  53   84:goto            45
	}

	public int getWindingRule()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isDone()
	{
		return index > 1;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int index>
	//    2    4:iconst_1        
	//    3    5:icmple          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void next()
	{
		index = index + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #72  <Field int index>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #72  <Field int index>
	//    6   10:return          
	}

	int index;
	AffineTransform t;
	final Line2D this$0;
	double x1;
	double x2;
	double y1;
	double y2;

	Line2D$Iterator(Line2D line2d1, AffineTransform affinetransform)
	{
		this$0 = Line2D.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field Line2D this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #27  <Method void Object()>
		x1 = line2d1.getX1();
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #31  <Method double Line2D.getX1()>
	//    8   14:putfield        #33  <Field double x1>
		y1 = line2d1.getY1();
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #36  <Method double Line2D.getY1()>
	//   12   22:putfield        #38  <Field double y1>
		x2 = line2d1.getX2();
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #41  <Method double Line2D.getX2()>
	//   16   30:putfield        #43  <Field double x2>
		y2 = line2d1.getY2();
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:invokevirtual   #46  <Method double Line2D.getY2()>
	//   20   38:putfield        #48  <Field double y2>
		t = affinetransform;
	//   21   41:aload_0         
	//   22   42:aload_3         
	//   23   43:putfield        #50  <Field AffineTransform t>
	//   24   46:return          
	}
}
