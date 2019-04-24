// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;

import com.itextpdf.awt.geom.misc.Messages;
import java.util.NoSuchElementException;

// Referenced classes of package com.itextpdf.awt.geom:
//			PathIterator, QuadCurve2D, AffineTransform

class QuadCurve2D$Iterator
	implements PathIterator
{

	public int currentSegment(double ad[])
	{
		if(isDone())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #34  <Method boolean isDone()>
	//*   2    4:ifeq            20
			throw new NoSuchElementException(Messages.getString("awt.4B"));
	//    3    7:new             #36  <Class NoSuchElementException>
	//    4   10:dup             
	//    5   11:ldc1            #38  <String "awt.4B">
	//    6   13:invokestatic    #44  <Method String Messages.getString(String)>
	//    7   16:invokespecial   #47  <Method void NoSuchElementException(String)>
	//    8   19:athrow          
		int i;
		int j;
		if(index == 0)
	//*   9   20:aload_0         
	//*  10   21:getfield        #49  <Field int index>
	//*  11   24:ifne            72
		{
			j = 0;
	//   12   27:iconst_0        
	//   13   28:istore_3        
			ad[0] = c.getX1();
	//   14   29:aload_1         
	//   15   30:iconst_0        
	//   16   31:aload_0         
	//   17   32:getfield        #25  <Field QuadCurve2D c>
	//   18   35:invokevirtual   #53  <Method double QuadCurve2D.getX1()>
	//   19   38:dastore         
			ad[1] = c.getY1();
	//   20   39:aload_1         
	//   21   40:iconst_1        
	//   22   41:aload_0         
	//   23   42:getfield        #25  <Field QuadCurve2D c>
	//   24   45:invokevirtual   #56  <Method double QuadCurve2D.getY1()>
	//   25   48:dastore         
			i = 1;
	//   26   49:iconst_1        
	//   27   50:istore_2        
		} else
	//*  28   51:aload_0         
	//*  29   52:getfield        #27  <Field AffineTransform t>
	//*  30   55:ifnull          70
	//*  31   58:aload_0         
	//*  32   59:getfield        #27  <Field AffineTransform t>
	//*  33   62:aload_1         
	//*  34   63:iconst_0        
	//*  35   64:aload_1         
	//*  36   65:iconst_0        
	//*  37   66:iload_2         
	//*  38   67:invokevirtual   #62  <Method void AffineTransform.transform(double[], int, double[], int, int)>
	//*  39   70:iload_3         
	//*  40   71:ireturn         
		{
			j = 2;
	//   41   72:iconst_2        
	//   42   73:istore_3        
			ad[0] = c.getCtrlX();
	//   43   74:aload_1         
	//   44   75:iconst_0        
	//   45   76:aload_0         
	//   46   77:getfield        #25  <Field QuadCurve2D c>
	//   47   80:invokevirtual   #65  <Method double QuadCurve2D.getCtrlX()>
	//   48   83:dastore         
			ad[1] = c.getCtrlY();
	//   49   84:aload_1         
	//   50   85:iconst_1        
	//   51   86:aload_0         
	//   52   87:getfield        #25  <Field QuadCurve2D c>
	//   53   90:invokevirtual   #68  <Method double QuadCurve2D.getCtrlY()>
	//   54   93:dastore         
			ad[2] = c.getX2();
	//   55   94:aload_1         
	//   56   95:iconst_2        
	//   57   96:aload_0         
	//   58   97:getfield        #25  <Field QuadCurve2D c>
	//   59  100:invokevirtual   #71  <Method double QuadCurve2D.getX2()>
	//   60  103:dastore         
			ad[3] = c.getY2();
	//   61  104:aload_1         
	//   62  105:iconst_3        
	//   63  106:aload_0         
	//   64  107:getfield        #25  <Field QuadCurve2D c>
	//   65  110:invokevirtual   #74  <Method double QuadCurve2D.getY2()>
	//   66  113:dastore         
			i = 2;
	//   67  114:iconst_2        
	//   68  115:istore_2        
		}
		if(t != null)
			t.transform(ad, 0, ad, 0, i);
		return j;
	//*  69  116:goto            51
	}

	public int currentSegment(float af[])
	{
		if(isDone())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #34  <Method boolean isDone()>
	//*   2    4:ifeq            20
			throw new NoSuchElementException(Messages.getString("awt.4B"));
	//    3    7:new             #36  <Class NoSuchElementException>
	//    4   10:dup             
	//    5   11:ldc1            #38  <String "awt.4B">
	//    6   13:invokestatic    #44  <Method String Messages.getString(String)>
	//    7   16:invokespecial   #47  <Method void NoSuchElementException(String)>
	//    8   19:athrow          
		int i;
		int j;
		if(index == 0)
	//*   9   20:aload_0         
	//*  10   21:getfield        #49  <Field int index>
	//*  11   24:ifne            74
		{
			j = 0;
	//   12   27:iconst_0        
	//   13   28:istore_3        
			af[0] = (float)c.getX1();
	//   14   29:aload_1         
	//   15   30:iconst_0        
	//   16   31:aload_0         
	//   17   32:getfield        #25  <Field QuadCurve2D c>
	//   18   35:invokevirtual   #53  <Method double QuadCurve2D.getX1()>
	//   19   38:d2f             
	//   20   39:fastore         
			af[1] = (float)c.getY1();
	//   21   40:aload_1         
	//   22   41:iconst_1        
	//   23   42:aload_0         
	//   24   43:getfield        #25  <Field QuadCurve2D c>
	//   25   46:invokevirtual   #56  <Method double QuadCurve2D.getY1()>
	//   26   49:d2f             
	//   27   50:fastore         
			i = 1;
	//   28   51:iconst_1        
	//   29   52:istore_2        
		} else
	//*  30   53:aload_0         
	//*  31   54:getfield        #27  <Field AffineTransform t>
	//*  32   57:ifnull          72
	//*  33   60:aload_0         
	//*  34   61:getfield        #27  <Field AffineTransform t>
	//*  35   64:aload_1         
	//*  36   65:iconst_0        
	//*  37   66:aload_1         
	//*  38   67:iconst_0        
	//*  39   68:iload_2         
	//*  40   69:invokevirtual   #78  <Method void AffineTransform.transform(float[], int, float[], int, int)>
	//*  41   72:iload_3         
	//*  42   73:ireturn         
		{
			j = 2;
	//   43   74:iconst_2        
	//   44   75:istore_3        
			af[0] = (float)c.getCtrlX();
	//   45   76:aload_1         
	//   46   77:iconst_0        
	//   47   78:aload_0         
	//   48   79:getfield        #25  <Field QuadCurve2D c>
	//   49   82:invokevirtual   #65  <Method double QuadCurve2D.getCtrlX()>
	//   50   85:d2f             
	//   51   86:fastore         
			af[1] = (float)c.getCtrlY();
	//   52   87:aload_1         
	//   53   88:iconst_1        
	//   54   89:aload_0         
	//   55   90:getfield        #25  <Field QuadCurve2D c>
	//   56   93:invokevirtual   #68  <Method double QuadCurve2D.getCtrlY()>
	//   57   96:d2f             
	//   58   97:fastore         
			af[2] = (float)c.getX2();
	//   59   98:aload_1         
	//   60   99:iconst_2        
	//   61  100:aload_0         
	//   62  101:getfield        #25  <Field QuadCurve2D c>
	//   63  104:invokevirtual   #71  <Method double QuadCurve2D.getX2()>
	//   64  107:d2f             
	//   65  108:fastore         
			af[3] = (float)c.getY2();
	//   66  109:aload_1         
	//   67  110:iconst_3        
	//   68  111:aload_0         
	//   69  112:getfield        #25  <Field QuadCurve2D c>
	//   70  115:invokevirtual   #74  <Method double QuadCurve2D.getY2()>
	//   71  118:d2f             
	//   72  119:fastore         
			i = 2;
	//   73  120:iconst_2        
	//   74  121:istore_2        
		}
		if(t != null)
			t.transform(af, 0, af, 0, i);
		return j;
	//*  75  122:goto            53
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
	//    1    1:getfield        #49  <Field int index>
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
	//    2    2:getfield        #49  <Field int index>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #49  <Field int index>
	//    6   10:return          
	}

	QuadCurve2D c;
	int index;
	AffineTransform t;
	final QuadCurve2D this$0;

	QuadCurve2D$Iterator(QuadCurve2D quadcurve2d1, AffineTransform affinetransform)
	{
		this$0 = QuadCurve2D.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field QuadCurve2D this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
		c = quadcurve2d1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field QuadCurve2D c>
		t = affinetransform;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field AffineTransform t>
	//   11   19:return          
	}
}
