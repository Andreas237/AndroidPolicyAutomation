// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			CFFFont

protected final class CFFFont$Font
{

	public int CharsetLength;
	public int CharstringType;
	public int FDArrayCount;
	public int FDArrayOffsets[];
	public int FDArrayOffsize;
	public int FDSelect[];
	public int FDSelectFormat;
	public int FDSelectLength;
	public int PrivateSubrsOffset[];
	public int PrivateSubrsOffsetsArray[][];
	public int SubrsOffsets[];
	public int charset[];
	public int charsetOffset;
	public int charstringsOffset;
	public int charstringsOffsets[];
	public int encodingOffset;
	public int fdarrayOffset;
	public int fdprivateLengths[];
	public int fdprivateOffsets[];
	public int fdprivateSubrs[];
	public int fdselectOffset;
	public String fullName;
	public boolean isCID;
	public String name;
	public int nglyphs;
	public int nstrings;
	public int privateLength;
	public int privateOffset;
	public int privateSubrs;
	final CFFFont this$0;

	protected CFFFont$Font()
	{
		this$0 = CFFFont.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field CFFFont this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #50  <Method void Object()>
		isCID = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #52  <Field boolean isCID>
		privateOffset = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #54  <Field int privateOffset>
		privateLength = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #56  <Field int privateLength>
		privateSubrs = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #58  <Field int privateSubrs>
		charstringsOffset = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #60  <Field int charstringsOffset>
		encodingOffset = -1;
	//   20   34:aload_0         
	//   21   35:iconst_m1       
	//   22   36:putfield        #62  <Field int encodingOffset>
		charsetOffset = -1;
	//   23   39:aload_0         
	//   24   40:iconst_m1       
	//   25   41:putfield        #64  <Field int charsetOffset>
		fdarrayOffset = -1;
	//   26   44:aload_0         
	//   27   45:iconst_m1       
	//   28   46:putfield        #66  <Field int fdarrayOffset>
		fdselectOffset = -1;
	//   29   49:aload_0         
	//   30   50:iconst_m1       
	//   31   51:putfield        #68  <Field int fdselectOffset>
		CharstringType = 2;
	//   32   54:aload_0         
	//   33   55:iconst_2        
	//   34   56:putfield        #70  <Field int CharstringType>
	//   35   59:return          
	}
}
