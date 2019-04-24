// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfArray, PdfNumber, PdfWriter

public class PdfDashPattern extends PdfArray
{

	public PdfDashPattern()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void PdfArray()>
		dash = -1F;
	//    2    4:aload_0         
	//    3    5:ldc1            #13  <Float -1F>
	//    4    7:putfield        #15  <Field float dash>
		gap = -1F;
	//    5   10:aload_0         
	//    6   11:ldc1            #13  <Float -1F>
	//    7   13:putfield        #17  <Field float gap>
		phase = -1F;
	//    8   16:aload_0         
	//    9   17:ldc1            #13  <Float -1F>
	//   10   19:putfield        #19  <Field float phase>
	//   11   22:return          
	}

	public PdfDashPattern(float f)
	{
		super(((PdfObject) (new PdfNumber(f))));
	//    0    0:aload_0         
	//    1    1:new             #23  <Class PdfNumber>
	//    2    4:dup             
	//    3    5:fload_1         
	//    4    6:invokespecial   #25  <Method void PdfNumber(float)>
	//    5    9:invokespecial   #28  <Method void PdfArray(PdfObject)>
		dash = -1F;
	//    6   12:aload_0         
	//    7   13:ldc1            #13  <Float -1F>
	//    8   15:putfield        #15  <Field float dash>
		gap = -1F;
	//    9   18:aload_0         
	//   10   19:ldc1            #13  <Float -1F>
	//   11   21:putfield        #17  <Field float gap>
		phase = -1F;
	//   12   24:aload_0         
	//   13   25:ldc1            #13  <Float -1F>
	//   14   27:putfield        #19  <Field float phase>
		dash = f;
	//   15   30:aload_0         
	//   16   31:fload_1         
	//   17   32:putfield        #15  <Field float dash>
	//   18   35:return          
	}

	public PdfDashPattern(float f, float f1)
	{
		super(((PdfObject) (new PdfNumber(f))));
	//    0    0:aload_0         
	//    1    1:new             #23  <Class PdfNumber>
	//    2    4:dup             
	//    3    5:fload_1         
	//    4    6:invokespecial   #25  <Method void PdfNumber(float)>
	//    5    9:invokespecial   #28  <Method void PdfArray(PdfObject)>
		dash = -1F;
	//    6   12:aload_0         
	//    7   13:ldc1            #13  <Float -1F>
	//    8   15:putfield        #15  <Field float dash>
		gap = -1F;
	//    9   18:aload_0         
	//   10   19:ldc1            #13  <Float -1F>
	//   11   21:putfield        #17  <Field float gap>
		phase = -1F;
	//   12   24:aload_0         
	//   13   25:ldc1            #13  <Float -1F>
	//   14   27:putfield        #19  <Field float phase>
		add(((PdfObject) (new PdfNumber(f1))));
	//   15   30:aload_0         
	//   16   31:new             #23  <Class PdfNumber>
	//   17   34:dup             
	//   18   35:fload_2         
	//   19   36:invokespecial   #25  <Method void PdfNumber(float)>
	//   20   39:invokevirtual   #33  <Method boolean add(PdfObject)>
	//   21   42:pop             
		dash = f;
	//   22   43:aload_0         
	//   23   44:fload_1         
	//   24   45:putfield        #15  <Field float dash>
		gap = f1;
	//   25   48:aload_0         
	//   26   49:fload_2         
	//   27   50:putfield        #17  <Field float gap>
	//   28   53:return          
	}

	public PdfDashPattern(float f, float f1, float f2)
	{
		super(((PdfObject) (new PdfNumber(f))));
	//    0    0:aload_0         
	//    1    1:new             #23  <Class PdfNumber>
	//    2    4:dup             
	//    3    5:fload_1         
	//    4    6:invokespecial   #25  <Method void PdfNumber(float)>
	//    5    9:invokespecial   #28  <Method void PdfArray(PdfObject)>
		dash = -1F;
	//    6   12:aload_0         
	//    7   13:ldc1            #13  <Float -1F>
	//    8   15:putfield        #15  <Field float dash>
		gap = -1F;
	//    9   18:aload_0         
	//   10   19:ldc1            #13  <Float -1F>
	//   11   21:putfield        #17  <Field float gap>
		phase = -1F;
	//   12   24:aload_0         
	//   13   25:ldc1            #13  <Float -1F>
	//   14   27:putfield        #19  <Field float phase>
		add(((PdfObject) (new PdfNumber(f1))));
	//   15   30:aload_0         
	//   16   31:new             #23  <Class PdfNumber>
	//   17   34:dup             
	//   18   35:fload_2         
	//   19   36:invokespecial   #25  <Method void PdfNumber(float)>
	//   20   39:invokevirtual   #33  <Method boolean add(PdfObject)>
	//   21   42:pop             
		dash = f;
	//   22   43:aload_0         
	//   23   44:fload_1         
	//   24   45:putfield        #15  <Field float dash>
		gap = f1;
	//   25   48:aload_0         
	//   26   49:fload_2         
	//   27   50:putfield        #17  <Field float gap>
		phase = f2;
	//   28   53:aload_0         
	//   29   54:fload_3         
	//   30   55:putfield        #19  <Field float phase>
	//   31   58:return          
	}

	public void add(float f)
	{
		add(((PdfObject) (new PdfNumber(f))));
	//    0    0:aload_0         
	//    1    1:new             #23  <Class PdfNumber>
	//    2    4:dup             
	//    3    5:fload_1         
	//    4    6:invokespecial   #25  <Method void PdfNumber(float)>
	//    5    9:invokevirtual   #33  <Method boolean add(PdfObject)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		outputstream.write(91);
	//    0    0:aload_2         
	//    1    1:bipush          91
	//    2    3:invokevirtual   #44  <Method void OutputStream.write(int)>
		if(dash >= 0.0F)
	//*   3    6:aload_0         
	//*   4    7:getfield        #15  <Field float dash>
	//*   5   10:fconst_0        
	//*   6   11:fcmpl           
	//*   7   12:iflt            62
		{
			(new PdfNumber(dash)).toPdf(pdfwriter, outputstream);
	//    8   15:new             #23  <Class PdfNumber>
	//    9   18:dup             
	//   10   19:aload_0         
	//   11   20:getfield        #15  <Field float dash>
	//   12   23:invokespecial   #25  <Method void PdfNumber(float)>
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:invokevirtual   #46  <Method void PdfNumber.toPdf(PdfWriter, OutputStream)>
			if(gap >= 0.0F)
	//*  16   31:aload_0         
	//*  17   32:getfield        #17  <Field float gap>
	//*  18   35:fconst_0        
	//*  19   36:fcmpl           
	//*  20   37:iflt            62
			{
				outputstream.write(32);
	//   21   40:aload_2         
	//   22   41:bipush          32
	//   23   43:invokevirtual   #44  <Method void OutputStream.write(int)>
				(new PdfNumber(gap)).toPdf(pdfwriter, outputstream);
	//   24   46:new             #23  <Class PdfNumber>
	//   25   49:dup             
	//   26   50:aload_0         
	//   27   51:getfield        #17  <Field float gap>
	//   28   54:invokespecial   #25  <Method void PdfNumber(float)>
	//   29   57:aload_1         
	//   30   58:aload_2         
	//   31   59:invokevirtual   #46  <Method void PdfNumber.toPdf(PdfWriter, OutputStream)>
			}
		}
		outputstream.write(93);
	//   32   62:aload_2         
	//   33   63:bipush          93
	//   34   65:invokevirtual   #44  <Method void OutputStream.write(int)>
		if(phase >= 0.0F)
	//*  35   68:aload_0         
	//*  36   69:getfield        #19  <Field float phase>
	//*  37   72:fconst_0        
	//*  38   73:fcmpl           
	//*  39   74:iflt            99
		{
			outputstream.write(32);
	//   40   77:aload_2         
	//   41   78:bipush          32
	//   42   80:invokevirtual   #44  <Method void OutputStream.write(int)>
			(new PdfNumber(phase)).toPdf(pdfwriter, outputstream);
	//   43   83:new             #23  <Class PdfNumber>
	//   44   86:dup             
	//   45   87:aload_0         
	//   46   88:getfield        #19  <Field float phase>
	//   47   91:invokespecial   #25  <Method void PdfNumber(float)>
	//   48   94:aload_1         
	//   49   95:aload_2         
	//   50   96:invokevirtual   #46  <Method void PdfNumber.toPdf(PdfWriter, OutputStream)>
		}
	//   51   99:return          
	}

	private float dash;
	private float gap;
	private float phase;
}
