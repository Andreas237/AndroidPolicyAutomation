// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfArray;
import com.itextpdf.text.pdf.PdfNumber;

public class LineDashPattern
{
	public class DashArrayElem
	{

		public float getVal()
		{
			return val;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field float val>
		//    2    4:freturn         
		}

		public boolean isGap()
		{
			return isGap;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field boolean isGap>
		//    2    4:ireturn         
		}

		public void setGap(boolean flag)
		{
			isGap = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #24  <Field boolean isGap>
		//    3    5:return          
		}

		public void setVal(float f)
		{
			val = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #22  <Field float val>
		//    3    5:return          
		}

		private boolean isGap;
		final LineDashPattern this$0;
		private float val;

		public DashArrayElem(float f, boolean flag)
		{
			this$0 = LineDashPattern.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field LineDashPattern this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			val = f;
		//    5    9:aload_0         
		//    6   10:fload_2         
		//    7   11:putfield        #22  <Field float val>
			isGap = flag;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #24  <Field boolean isGap>
		//   11   19:return          
		}
	}


	public LineDashPattern(PdfArray pdfarray, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		elemOrdinalNumber = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #23  <Field int elemOrdinalNumber>
		dashArray = new PdfArray(pdfarray);
	//    5    9:aload_0         
	//    6   10:new             #25  <Class PdfArray>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #28  <Method void PdfArray(PdfArray)>
	//   10   18:putfield        #30  <Field PdfArray dashArray>
		dashPhase = f;
	//   11   21:aload_0         
	//   12   22:fload_2         
	//   13   23:putfield        #32  <Field float dashPhase>
		initFirst(f);
	//   14   26:aload_0         
	//   15   27:fload_2         
	//   16   28:invokespecial   #36  <Method void initFirst(float)>
	//   17   31:return          
	}

	private void initFirst(float f)
	{
label0:
		{
			if(dashArray.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field PdfArray dashArray>
	//*   2    4:invokevirtual   #41  <Method int PdfArray.size()>
	//*   3    7:ifle            112
			{
				while(f > 0.0F) 
	//*   4   10:fload_1         
	//*   5   11:fconst_0        
	//*   6   12:fcmpl           
	//*   7   13:ifle            64
				{
					f -= dashArray.getAsNumber(currentIndex).floatValue();
	//    8   16:fload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #30  <Field PdfArray dashArray>
	//   11   21:aload_0         
	//   12   22:getfield        #43  <Field int currentIndex>
	//   13   25:invokevirtual   #47  <Method PdfNumber PdfArray.getAsNumber(int)>
	//   14   28:invokevirtual   #53  <Method float PdfNumber.floatValue()>
	//   15   31:fsub            
	//   16   32:fstore_1        
					currentIndex = (currentIndex + 1) % dashArray.size();
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #43  <Field int currentIndex>
	//   20   38:iconst_1        
	//   21   39:iadd            
	//   22   40:aload_0         
	//   23   41:getfield        #30  <Field PdfArray dashArray>
	//   24   44:invokevirtual   #41  <Method int PdfArray.size()>
	//   25   47:irem            
	//   26   48:putfield        #43  <Field int currentIndex>
					elemOrdinalNumber = elemOrdinalNumber + 1;
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #23  <Field int elemOrdinalNumber>
	//   30   56:iconst_1        
	//   31   57:iadd            
	//   32   58:putfield        #23  <Field int elemOrdinalNumber>
				}
	//*  33   61:goto            10
				if(f >= 0.0F)
					break label0;
	//   34   64:fload_1         
	//   35   65:fconst_0        
	//   36   66:fcmpg           
	//   37   67:ifge            113
				elemOrdinalNumber = elemOrdinalNumber - 1;
	//   38   70:aload_0         
	//   39   71:aload_0         
	//   40   72:getfield        #23  <Field int elemOrdinalNumber>
	//   41   75:iconst_1        
	//   42   76:isub            
	//   43   77:putfield        #23  <Field int elemOrdinalNumber>
				currentIndex = currentIndex - 1;
	//   44   80:aload_0         
	//   45   81:aload_0         
	//   46   82:getfield        #43  <Field int currentIndex>
	//   47   85:iconst_1        
	//   48   86:isub            
	//   49   87:putfield        #43  <Field int currentIndex>
				currentElem = new DashArrayElem(-f, isEven(elemOrdinalNumber));
	//   50   90:aload_0         
	//   51   91:new             #6   <Class LineDashPattern$DashArrayElem>
	//   52   94:dup             
	//   53   95:aload_0         
	//   54   96:fload_1         
	//   55   97:fneg            
	//   56   98:aload_0         
	//   57   99:aload_0         
	//   58  100:getfield        #23  <Field int elemOrdinalNumber>
	//   59  103:invokespecial   #57  <Method boolean isEven(int)>
	//   60  106:invokespecial   #60  <Method void LineDashPattern$DashArrayElem(LineDashPattern, float, boolean)>
	//   61  109:putfield        #62  <Field LineDashPattern$DashArrayElem currentElem>
			}
			return;
	//   62  112:return          
		}
		currentElem = new DashArrayElem(dashArray.getAsNumber(currentIndex).floatValue(), isEven(elemOrdinalNumber));
	//   63  113:aload_0         
	//   64  114:new             #6   <Class LineDashPattern$DashArrayElem>
	//   65  117:dup             
	//   66  118:aload_0         
	//   67  119:aload_0         
	//   68  120:getfield        #30  <Field PdfArray dashArray>
	//   69  123:aload_0         
	//   70  124:getfield        #43  <Field int currentIndex>
	//   71  127:invokevirtual   #47  <Method PdfNumber PdfArray.getAsNumber(int)>
	//   72  130:invokevirtual   #53  <Method float PdfNumber.floatValue()>
	//   73  133:aload_0         
	//   74  134:aload_0         
	//   75  135:getfield        #23  <Field int elemOrdinalNumber>
	//   76  138:invokespecial   #57  <Method boolean isEven(int)>
	//   77  141:invokespecial   #60  <Method void LineDashPattern$DashArrayElem(LineDashPattern, float, boolean)>
	//   78  144:putfield        #62  <Field LineDashPattern$DashArrayElem currentElem>
	//   79  147:return          
	}

	private boolean isEven(int i)
	{
		return i % 2 == 0;
	//    0    0:iload_1         
	//    1    1:iconst_2        
	//    2    2:irem            
	//    3    3:ifne            8
	//    4    6:iconst_1        
	//    5    7:ireturn         
	//    6    8:iconst_0        
	//    7    9:ireturn         
	}

	public PdfArray getDashArray()
	{
		return dashArray;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field PdfArray dashArray>
	//    2    4:areturn         
	}

	public float getDashPhase()
	{
		return dashPhase;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field float dashPhase>
	//    2    4:freturn         
	}

	public boolean isSolid()
	{
		if(dashArray.size() % 2 == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field PdfArray dashArray>
	//*   2    4:invokevirtual   #41  <Method int PdfArray.size()>
	//*   3    7:iconst_2        
	//*   4    8:irem            
	//*   5    9:ifeq            14
	//*   6   12:iconst_0        
	//*   7   13:ireturn         
		{
			float f = 0.0F;
	//    8   14:fconst_0        
	//    9   15:fstore_1        
			for(int i = 1; i < dashArray.size(); i += 2)
	//*  10   16:iconst_1        
	//*  11   17:istore_2        
	//*  12   18:iload_2         
	//*  13   19:aload_0         
	//*  14   20:getfield        #30  <Field PdfArray dashArray>
	//*  15   23:invokevirtual   #41  <Method int PdfArray.size()>
	//*  16   26:icmpge          50
				f += dashArray.getAsNumber(i).floatValue();
	//   17   29:fload_1         
	//   18   30:aload_0         
	//   19   31:getfield        #30  <Field PdfArray dashArray>
	//   20   34:iload_2         
	//   21   35:invokevirtual   #47  <Method PdfNumber PdfArray.getAsNumber(int)>
	//   22   38:invokevirtual   #53  <Method float PdfNumber.floatValue()>
	//   23   41:fadd            
	//   24   42:fstore_1        

	//   25   43:iload_2         
	//   26   44:iconst_2        
	//   27   45:iadd            
	//   28   46:istore_2        
	//*  29   47:goto            18
			if(Float.compare(f, 0.0F) == 0)
	//*  30   50:fload_1         
	//*  31   51:fconst_0        
	//*  32   52:invokestatic    #73  <Method int Float.compare(float, float)>
	//*  33   55:ifne            12
				return true;
	//   34   58:iconst_1        
	//   35   59:ireturn         
		}
		return false;
	}

	public DashArrayElem next()
	{
		DashArrayElem dasharrayelem = currentElem;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field LineDashPattern$DashArrayElem currentElem>
	//    2    4:astore_3        
		if(dashArray.size() > 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #30  <Field PdfArray dashArray>
	//*   5    9:invokevirtual   #41  <Method int PdfArray.size()>
	//*   6   12:ifle            78
		{
			currentIndex = (currentIndex + 1) % dashArray.size();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field int currentIndex>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:aload_0         
	//   13   23:getfield        #30  <Field PdfArray dashArray>
	//   14   26:invokevirtual   #41  <Method int PdfArray.size()>
	//   15   29:irem            
	//   16   30:putfield        #43  <Field int currentIndex>
			float f = dashArray.getAsNumber(currentIndex).floatValue();
	//   17   33:aload_0         
	//   18   34:getfield        #30  <Field PdfArray dashArray>
	//   19   37:aload_0         
	//   20   38:getfield        #43  <Field int currentIndex>
	//   21   41:invokevirtual   #47  <Method PdfNumber PdfArray.getAsNumber(int)>
	//   22   44:invokevirtual   #53  <Method float PdfNumber.floatValue()>
	//   23   47:fstore_1        
			int i = elemOrdinalNumber + 1;
	//   24   48:aload_0         
	//   25   49:getfield        #23  <Field int elemOrdinalNumber>
	//   26   52:iconst_1        
	//   27   53:iadd            
	//   28   54:istore_2        
			elemOrdinalNumber = i;
	//   29   55:aload_0         
	//   30   56:iload_2         
	//   31   57:putfield        #23  <Field int elemOrdinalNumber>
			currentElem = new DashArrayElem(f, isEven(i));
	//   32   60:aload_0         
	//   33   61:new             #6   <Class LineDashPattern$DashArrayElem>
	//   34   64:dup             
	//   35   65:aload_0         
	//   36   66:fload_1         
	//   37   67:aload_0         
	//   38   68:iload_2         
	//   39   69:invokespecial   #57  <Method boolean isEven(int)>
	//   40   72:invokespecial   #60  <Method void LineDashPattern$DashArrayElem(LineDashPattern, float, boolean)>
	//   41   75:putfield        #62  <Field LineDashPattern$DashArrayElem currentElem>
		}
		return dasharrayelem;
	//   42   78:aload_3         
	//   43   79:areturn         
	}

	public void reset()
	{
		currentIndex = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #43  <Field int currentIndex>
		elemOrdinalNumber = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #23  <Field int elemOrdinalNumber>
		initFirst(dashPhase);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #32  <Field float dashPhase>
	//    9   15:invokespecial   #36  <Method void initFirst(float)>
	//   10   18:return          
	}

	public void setDashArray(PdfArray pdfarray)
	{
		dashArray = pdfarray;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field PdfArray dashArray>
	//    3    5:return          
	}

	public void setDashPhase(float f)
	{
		dashPhase = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #32  <Field float dashPhase>
	//    3    5:return          
	}

	private DashArrayElem currentElem;
	private int currentIndex;
	private PdfArray dashArray;
	private float dashPhase;
	private int elemOrdinalNumber;
}
