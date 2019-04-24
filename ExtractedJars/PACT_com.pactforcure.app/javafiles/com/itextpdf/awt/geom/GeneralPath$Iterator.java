// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;

import com.itextpdf.awt.geom.misc.Messages;
import java.util.NoSuchElementException;

// Referenced classes of package com.itextpdf.awt.geom:
//			PathIterator, GeneralPath, AffineTransform

class GeneralPath$Iterator
	implements PathIterator
{

	public int currentSegment(double ad[])
	{
		if(isDone())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #38  <Method boolean isDone()>
	//*   2    4:ifeq            20
			throw new NoSuchElementException(Messages.getString("awt.4B"));
	//    3    7:new             #40  <Class NoSuchElementException>
	//    4   10:dup             
	//    5   11:ldc1            #42  <String "awt.4B">
	//    6   13:invokestatic    #48  <Method String Messages.getString(String)>
	//    7   16:invokespecial   #51  <Method void NoSuchElementException(String)>
	//    8   19:athrow          
		byte byte0 = p.types[typeIndex];
	//    9   20:aload_0         
	//   10   21:getfield        #30  <Field GeneralPath p>
	//   11   24:getfield        #55  <Field byte[] GeneralPath.types>
	//   12   27:aload_0         
	//   13   28:getfield        #57  <Field int typeIndex>
	//   14   31:baload          
	//   15   32:istore_3        
		int j = GeneralPath.pointShift[byte0];
	//   16   33:getstatic       #61  <Field int[] GeneralPath.pointShift>
	//   17   36:iload_3         
	//   18   37:iaload          
	//   19   38:istore          4
		for(int i = 0; i < j; i++)
	//*  20   40:iconst_0        
	//*  21   41:istore_2        
	//*  22   42:iload_2         
	//*  23   43:iload           4
	//*  24   45:icmpge          73
			ad[i] = p.points[pointIndex + i];
	//   25   48:aload_1         
	//   26   49:iload_2         
	//   27   50:aload_0         
	//   28   51:getfield        #30  <Field GeneralPath p>
	//   29   54:getfield        #65  <Field float[] GeneralPath.points>
	//   30   57:aload_0         
	//   31   58:getfield        #67  <Field int pointIndex>
	//   32   61:iload_2         
	//   33   62:iadd            
	//   34   63:faload          
	//   35   64:f2d             
	//   36   65:dastore         

	//   37   66:iload_2         
	//   38   67:iconst_1        
	//   39   68:iadd            
	//   40   69:istore_2        
	//*  41   70:goto            42
		if(t != null)
	//*  42   73:aload_0         
	//*  43   74:getfield        #32  <Field AffineTransform t>
	//*  44   77:ifnull          95
			t.transform(ad, 0, ad, 0, j / 2);
	//   45   80:aload_0         
	//   46   81:getfield        #32  <Field AffineTransform t>
	//   47   84:aload_1         
	//   48   85:iconst_0        
	//   49   86:aload_1         
	//   50   87:iconst_0        
	//   51   88:iload           4
	//   52   90:iconst_2        
	//   53   91:idiv            
	//   54   92:invokevirtual   #73  <Method void AffineTransform.transform(double[], int, double[], int, int)>
		pointIndex = pointIndex + j;
	//   55   95:aload_0         
	//   56   96:aload_0         
	//   57   97:getfield        #67  <Field int pointIndex>
	//   58  100:iload           4
	//   59  102:iadd            
	//   60  103:putfield        #67  <Field int pointIndex>
		return ((int) (byte0));
	//   61  106:iload_3         
	//   62  107:ireturn         
	}

	public int currentSegment(float af[])
	{
		if(isDone())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #38  <Method boolean isDone()>
	//*   2    4:ifeq            20
			throw new NoSuchElementException(Messages.getString("awt.4B"));
	//    3    7:new             #40  <Class NoSuchElementException>
	//    4   10:dup             
	//    5   11:ldc1            #42  <String "awt.4B">
	//    6   13:invokestatic    #48  <Method String Messages.getString(String)>
	//    7   16:invokespecial   #51  <Method void NoSuchElementException(String)>
	//    8   19:athrow          
		byte byte0 = p.types[typeIndex];
	//    9   20:aload_0         
	//   10   21:getfield        #30  <Field GeneralPath p>
	//   11   24:getfield        #55  <Field byte[] GeneralPath.types>
	//   12   27:aload_0         
	//   13   28:getfield        #57  <Field int typeIndex>
	//   14   31:baload          
	//   15   32:istore_2        
		int i = GeneralPath.pointShift[byte0];
	//   16   33:getstatic       #61  <Field int[] GeneralPath.pointShift>
	//   17   36:iload_2         
	//   18   37:iaload          
	//   19   38:istore_3        
		System.arraycopy(((Object) (p.points)), pointIndex, ((Object) (af)), 0, i);
	//   20   39:aload_0         
	//   21   40:getfield        #30  <Field GeneralPath p>
	//   22   43:getfield        #65  <Field float[] GeneralPath.points>
	//   23   46:aload_0         
	//   24   47:getfield        #67  <Field int pointIndex>
	//   25   50:aload_1         
	//   26   51:iconst_0        
	//   27   52:iload_3         
	//   28   53:invokestatic    #80  <Method void System.arraycopy(Object, int, Object, int, int)>
		if(t != null)
	//*  29   56:aload_0         
	//*  30   57:getfield        #32  <Field AffineTransform t>
	//*  31   60:ifnull          77
			t.transform(af, 0, af, 0, i / 2);
	//   32   63:aload_0         
	//   33   64:getfield        #32  <Field AffineTransform t>
	//   34   67:aload_1         
	//   35   68:iconst_0        
	//   36   69:aload_1         
	//   37   70:iconst_0        
	//   38   71:iload_3         
	//   39   72:iconst_2        
	//   40   73:idiv            
	//   41   74:invokevirtual   #83  <Method void AffineTransform.transform(float[], int, float[], int, int)>
		pointIndex = pointIndex + i;
	//   42   77:aload_0         
	//   43   78:aload_0         
	//   44   79:getfield        #67  <Field int pointIndex>
	//   45   82:iload_3         
	//   46   83:iadd            
	//   47   84:putfield        #67  <Field int pointIndex>
		return ((int) (byte0));
	//   48   87:iload_2         
	//   49   88:ireturn         
	}

	public int getWindingRule()
	{
		return p.getWindingRule();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field GeneralPath p>
	//    2    4:invokevirtual   #87  <Method int GeneralPath.getWindingRule()>
	//    3    7:ireturn         
	}

	public boolean isDone()
	{
		return typeIndex >= p.typeSize;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int typeIndex>
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field GeneralPath p>
	//    4    8:getfield        #90  <Field int GeneralPath.typeSize>
	//    5   11:icmplt          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public void next()
	{
		typeIndex = typeIndex + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #57  <Field int typeIndex>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #57  <Field int typeIndex>
	//    6   10:return          
	}

	GeneralPath p;
	int pointIndex;
	AffineTransform t;
	final GeneralPath this$0;
	int typeIndex;

	GeneralPath$Iterator(GeneralPath generalpath1)
	{
		this(generalpath1, ((AffineTransform) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #22  <Method void GeneralPath$Iterator(GeneralPath, GeneralPath, AffineTransform)>
	//    5    7:return          
	}

	GeneralPath$Iterator(GeneralPath generalpath1, AffineTransform affinetransform)
	{
		this$0 = GeneralPath.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field GeneralPath this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #28  <Method void Object()>
		p = generalpath1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field GeneralPath p>
		t = affinetransform;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field AffineTransform t>
	//   11   19:return          
	}
}
