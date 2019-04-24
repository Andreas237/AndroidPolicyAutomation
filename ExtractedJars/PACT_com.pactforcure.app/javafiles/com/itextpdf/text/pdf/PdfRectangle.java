// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.awt.geom.AffineTransform;
import com.itextpdf.text.Rectangle;

// Referenced classes of package com.itextpdf.text.pdf:
//			NumberArray, PdfNumber, PdfObject

public class PdfRectangle extends NumberArray
{

	public PdfRectangle(float f, float f1)
	{
		this(0.0F, 0.0F, f, f1, 0);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:fload_1         
	//    4    4:fload_2         
	//    5    5:iconst_0        
	//    6    6:invokespecial   #14  <Method void PdfRectangle(float, float, float, float, int)>
	//    7    9:return          
	}

	public PdfRectangle(float f, float f1, float f2, float f3)
	{
		this(f, f1, f2, f3, 0);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:iconst_0        
	//    6    7:invokespecial   #14  <Method void PdfRectangle(float, float, float, float, int)>
	//    7   10:return          
	}

	public PdfRectangle(float f, float f1, float f2, float f3, int i)
	{
		super(new float[0]);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:newarray        float[]
	//    3    4:invokespecial   #19  <Method void NumberArray(float[])>
		llx = 0.0F;
	//    4    7:aload_0         
	//    5    8:fconst_0        
	//    6    9:putfield        #21  <Field float llx>
		lly = 0.0F;
	//    7   12:aload_0         
	//    8   13:fconst_0        
	//    9   14:putfield        #23  <Field float lly>
		urx = 0.0F;
	//   10   17:aload_0         
	//   11   18:fconst_0        
	//   12   19:putfield        #25  <Field float urx>
		ury = 0.0F;
	//   13   22:aload_0         
	//   14   23:fconst_0        
	//   15   24:putfield        #27  <Field float ury>
		if(i == 90 || i == 270)
	//*  16   27:iload           5
	//*  17   29:bipush          90
	//*  18   31:icmpeq          42
	//*  19   34:iload           5
	//*  20   36:sipush          270
	//*  21   39:icmpne          128
		{
			llx = f1;
	//   22   42:aload_0         
	//   23   43:fload_2         
	//   24   44:putfield        #21  <Field float llx>
			lly = f;
	//   25   47:aload_0         
	//   26   48:fload_1         
	//   27   49:putfield        #23  <Field float lly>
			urx = f3;
	//   28   52:aload_0         
	//   29   53:fload           4
	//   30   55:putfield        #25  <Field float urx>
			ury = f2;
	//   31   58:aload_0         
	//   32   59:fload_3         
	//   33   60:putfield        #27  <Field float ury>
		} else
	//*  34   63:aload_0         
	//*  35   64:new             #29  <Class PdfNumber>
	//*  36   67:dup             
	//*  37   68:aload_0         
	//*  38   69:getfield        #21  <Field float llx>
	//*  39   72:invokespecial   #32  <Method void PdfNumber(float)>
	//*  40   75:invokespecial   #36  <Method boolean NumberArray.add(PdfObject)>
	//*  41   78:pop             
	//*  42   79:aload_0         
	//*  43   80:new             #29  <Class PdfNumber>
	//*  44   83:dup             
	//*  45   84:aload_0         
	//*  46   85:getfield        #23  <Field float lly>
	//*  47   88:invokespecial   #32  <Method void PdfNumber(float)>
	//*  48   91:invokespecial   #36  <Method boolean NumberArray.add(PdfObject)>
	//*  49   94:pop             
	//*  50   95:aload_0         
	//*  51   96:new             #29  <Class PdfNumber>
	//*  52   99:dup             
	//*  53  100:aload_0         
	//*  54  101:getfield        #25  <Field float urx>
	//*  55  104:invokespecial   #32  <Method void PdfNumber(float)>
	//*  56  107:invokespecial   #36  <Method boolean NumberArray.add(PdfObject)>
	//*  57  110:pop             
	//*  58  111:aload_0         
	//*  59  112:new             #29  <Class PdfNumber>
	//*  60  115:dup             
	//*  61  116:aload_0         
	//*  62  117:getfield        #27  <Field float ury>
	//*  63  120:invokespecial   #32  <Method void PdfNumber(float)>
	//*  64  123:invokespecial   #36  <Method boolean NumberArray.add(PdfObject)>
	//*  65  126:pop             
	//*  66  127:return          
		{
			llx = f;
	//   67  128:aload_0         
	//   68  129:fload_1         
	//   69  130:putfield        #21  <Field float llx>
			lly = f1;
	//   70  133:aload_0         
	//   71  134:fload_2         
	//   72  135:putfield        #23  <Field float lly>
			urx = f2;
	//   73  138:aload_0         
	//   74  139:fload_3         
	//   75  140:putfield        #25  <Field float urx>
			ury = f3;
	//   76  143:aload_0         
	//   77  144:fload           4
	//   78  146:putfield        #27  <Field float ury>
		}
		super.add(((PdfObject) (new PdfNumber(llx))));
		super.add(((PdfObject) (new PdfNumber(lly))));
		super.add(((PdfObject) (new PdfNumber(urx))));
		super.add(((PdfObject) (new PdfNumber(ury))));
	//*  79  149:goto            63
	}

	public PdfRectangle(float f, float f1, int i)
	{
		this(0.0F, 0.0F, f, f1, i);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:fload_1         
	//    4    4:fload_2         
	//    5    5:iload_3         
	//    6    6:invokespecial   #14  <Method void PdfRectangle(float, float, float, float, int)>
	//    7    9:return          
	}

	public PdfRectangle(Rectangle rectangle)
	{
		this(rectangle.getLeft(), rectangle.getBottom(), rectangle.getRight(), rectangle.getTop(), 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #44  <Method float Rectangle.getLeft()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #47  <Method float Rectangle.getBottom()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #50  <Method float Rectangle.getRight()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #53  <Method float Rectangle.getTop()>
	//    9   17:iconst_0        
	//   10   18:invokespecial   #14  <Method void PdfRectangle(float, float, float, float, int)>
	//   11   21:return          
	}

	public PdfRectangle(Rectangle rectangle, int i)
	{
		this(rectangle.getLeft(), rectangle.getBottom(), rectangle.getRight(), rectangle.getTop(), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #44  <Method float Rectangle.getLeft()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #47  <Method float Rectangle.getBottom()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #50  <Method float Rectangle.getRight()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #53  <Method float Rectangle.getTop()>
	//    9   17:iload_2         
	//   10   18:invokespecial   #14  <Method void PdfRectangle(float, float, float, float, int)>
	//   11   21:return          
	}

	public boolean add(PdfObject pdfobject)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean add(float af[])
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean add(int ai[])
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void addFirst(PdfObject pdfobject)
	{
	//    0    0:return          
	}

	public float bottom()
	{
		return lly;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field float lly>
	//    2    4:freturn         
	}

	public float bottom(int i)
	{
		return lly + (float)i;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field float lly>
	//    2    4:iload_1         
	//    3    5:i2f             
	//    4    6:fadd            
	//    5    7:freturn         
	}

	public Rectangle getRectangle()
	{
		return new Rectangle(left(), bottom(), right(), top());
	//    0    0:new             #40  <Class Rectangle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #65  <Method float left()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #67  <Method float bottom()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #70  <Method float right()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #73  <Method float top()>
	//   10   20:invokespecial   #75  <Method void Rectangle(float, float, float, float)>
	//   11   23:areturn         
	}

	public float height()
	{
		return ury - lly;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field float ury>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field float lly>
	//    4    8:fsub            
	//    5    9:freturn         
	}

	public float left()
	{
		return llx;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field float llx>
	//    2    4:freturn         
	}

	public float left(int i)
	{
		return llx + (float)i;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field float llx>
	//    2    4:iload_1         
	//    3    5:i2f             
	//    4    6:fadd            
	//    5    7:freturn         
	}

	public float right()
	{
		return urx;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float urx>
	//    2    4:freturn         
	}

	public float right(int i)
	{
		return urx - (float)i;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float urx>
	//    2    4:iload_1         
	//    3    5:i2f             
	//    4    6:fsub            
	//    5    7:freturn         
	}

	public PdfRectangle rotate()
	{
		return new PdfRectangle(lly, llx, ury, urx, 0);
	//    0    0:new             #2   <Class PdfRectangle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field float lly>
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field float llx>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field float ury>
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field float urx>
	//   10   20:iconst_0        
	//   11   21:invokespecial   #14  <Method void PdfRectangle(float, float, float, float, int)>
	//   12   24:areturn         
	}

	public float top()
	{
		return ury;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field float ury>
	//    2    4:freturn         
	}

	public float top(int i)
	{
		return ury - (float)i;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field float ury>
	//    2    4:iload_1         
	//    3    5:i2f             
	//    4    6:fsub            
	//    5    7:freturn         
	}

	public PdfRectangle transform(AffineTransform affinetransform)
	{
		float af[] = new float[4];
	//    0    0:iconst_4        
	//    1    1:newarray        float[]
	//    2    3:astore_2        
		af[0] = llx;
	//    3    4:aload_2         
	//    4    5:iconst_0        
	//    5    6:aload_0         
	//    6    7:getfield        #21  <Field float llx>
	//    7   10:fastore         
		af[1] = lly;
	//    8   11:aload_2         
	//    9   12:iconst_1        
	//   10   13:aload_0         
	//   11   14:getfield        #23  <Field float lly>
	//   12   17:fastore         
		af[2] = urx;
	//   13   18:aload_2         
	//   14   19:iconst_2        
	//   15   20:aload_0         
	//   16   21:getfield        #25  <Field float urx>
	//   17   24:fastore         
		af[3] = ury;
	//   18   25:aload_2         
	//   19   26:iconst_3        
	//   20   27:aload_0         
	//   21   28:getfield        #27  <Field float ury>
	//   22   31:fastore         
		affinetransform.transform(af, 0, af, 0, 2);
	//   23   32:aload_1         
	//   24   33:aload_2         
	//   25   34:iconst_0        
	//   26   35:aload_2         
	//   27   36:iconst_0        
	//   28   37:iconst_2        
	//   29   38:invokevirtual   #85  <Method void AffineTransform.transform(float[], int, float[], int, int)>
		affinetransform = ((AffineTransform) (new float[4]));
	//   30   41:iconst_4        
	//   31   42:newarray        float[]
	//   32   44:astore_1        
		affinetransform[0] = af[0];
	//   33   45:aload_1         
	//   34   46:iconst_0        
	//   35   47:aload_2         
	//   36   48:iconst_0        
	//   37   49:faload          
	//   38   50:fastore         
		affinetransform[1] = af[1];
	//   39   51:aload_1         
	//   40   52:iconst_1        
	//   41   53:aload_2         
	//   42   54:iconst_1        
	//   43   55:faload          
	//   44   56:fastore         
		affinetransform[2] = af[2];
	//   45   57:aload_1         
	//   46   58:iconst_2        
	//   47   59:aload_2         
	//   48   60:iconst_2        
	//   49   61:faload          
	//   50   62:fastore         
		affinetransform[3] = af[3];
	//   51   63:aload_1         
	//   52   64:iconst_3        
	//   53   65:aload_2         
	//   54   66:iconst_3        
	//   55   67:faload          
	//   56   68:fastore         
		if(af[0] > af[2])
	//*  57   69:aload_2         
	//*  58   70:iconst_0        
	//*  59   71:faload          
	//*  60   72:aload_2         
	//*  61   73:iconst_2        
	//*  62   74:faload          
	//*  63   75:fcmpl           
	//*  64   76:ifle            91
		{
			affinetransform[0] = af[2];
	//   65   79:aload_1         
	//   66   80:iconst_0        
	//   67   81:aload_2         
	//   68   82:iconst_2        
	//   69   83:faload          
	//   70   84:fastore         
			affinetransform[2] = af[0];
	//   71   85:aload_1         
	//   72   86:iconst_2        
	//   73   87:aload_2         
	//   74   88:iconst_0        
	//   75   89:faload          
	//   76   90:fastore         
		}
		if(af[1] > af[3])
	//*  77   91:aload_2         
	//*  78   92:iconst_1        
	//*  79   93:faload          
	//*  80   94:aload_2         
	//*  81   95:iconst_3        
	//*  82   96:faload          
	//*  83   97:fcmpl           
	//*  84   98:ifle            113
		{
			affinetransform[1] = af[3];
	//   85  101:aload_1         
	//   86  102:iconst_1        
	//   87  103:aload_2         
	//   88  104:iconst_3        
	//   89  105:faload          
	//   90  106:fastore         
			affinetransform[3] = af[1];
	//   91  107:aload_1         
	//   92  108:iconst_3        
	//   93  109:aload_2         
	//   94  110:iconst_1        
	//   95  111:faload          
	//   96  112:fastore         
		}
		return new PdfRectangle(affinetransform[0], affinetransform[1], affinetransform[2], affinetransform[3]);
	//   97  113:new             #2   <Class PdfRectangle>
	//   98  116:dup             
	//   99  117:aload_1         
	//  100  118:iconst_0        
	//  101  119:faload          
	//  102  120:aload_1         
	//  103  121:iconst_1        
	//  104  122:faload          
	//  105  123:aload_1         
	//  106  124:iconst_2        
	//  107  125:faload          
	//  108  126:aload_1         
	//  109  127:iconst_3        
	//  110  128:faload          
	//  111  129:invokespecial   #86  <Method void PdfRectangle(float, float, float, float)>
	//  112  132:areturn         
	}

	public float width()
	{
		return urx - llx;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float urx>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field float llx>
	//    4    8:fsub            
	//    5    9:freturn         
	}

	private float llx;
	private float lly;
	private float urx;
	private float ury;
}
