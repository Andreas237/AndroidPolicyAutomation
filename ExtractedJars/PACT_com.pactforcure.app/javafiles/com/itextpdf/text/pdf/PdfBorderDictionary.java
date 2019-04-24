// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfName, PdfNumber, PdfDashPattern

public class PdfBorderDictionary extends PdfDictionary
{

	public PdfBorderDictionary(float f, int i)
	{
		this(f, i, ((PdfDashPattern) (null)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #20  <Method void PdfBorderDictionary(float, int, PdfDashPattern)>
	//    5    7:return          
	}

	public PdfBorderDictionary(float f, int i, PdfDashPattern pdfdashpattern)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void PdfDictionary()>
		put(PdfName.W, ((PdfObject) (new PdfNumber(f))));
	//    2    4:aload_0         
	//    3    5:getstatic       #30  <Field PdfName PdfName.W>
	//    4    8:new             #32  <Class PdfNumber>
	//    5   11:dup             
	//    6   12:fload_1         
	//    7   13:invokespecial   #35  <Method void PdfNumber(float)>
	//    8   16:invokevirtual   #39  <Method void put(PdfName, PdfObject)>
		switch(i)
	//*   9   19:iload_2         
		{
	//*  10   20:tableswitch     0 4: default 56
	//	               0 73
	//	               1 84
	//	               2 107
	//	               3 118
	//	               4 129
		default:
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("invalid.border.style", new Object[0]));
	//   11   56:new             #41  <Class IllegalArgumentException>
	//   12   59:dup             
	//   13   60:ldc1            #43  <String "invalid.border.style">
	//   14   62:iconst_0        
	//   15   63:anewarray       Object[]
	//   16   66:invokestatic    #51  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   17   69:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   18   72:athrow          

		case 0: // '\0'
			put(PdfName.S, ((PdfObject) (PdfName.S)));
	//   19   73:aload_0         
	//   20   74:getstatic       #57  <Field PdfName PdfName.S>
	//   21   77:getstatic       #57  <Field PdfName PdfName.S>
	//   22   80:invokevirtual   #39  <Method void put(PdfName, PdfObject)>
			return;
	//   23   83:return          

		case 1: // '\001'
			if(pdfdashpattern != null)
	//*  24   84:aload_3         
	//*  25   85:ifnull          96
				put(PdfName.D, ((PdfObject) (pdfdashpattern)));
	//   26   88:aload_0         
	//   27   89:getstatic       #60  <Field PdfName PdfName.D>
	//   28   92:aload_3         
	//   29   93:invokevirtual   #39  <Method void put(PdfName, PdfObject)>
			put(PdfName.S, ((PdfObject) (PdfName.D)));
	//   30   96:aload_0         
	//   31   97:getstatic       #57  <Field PdfName PdfName.S>
	//   32  100:getstatic       #60  <Field PdfName PdfName.D>
	//   33  103:invokevirtual   #39  <Method void put(PdfName, PdfObject)>
			return;
	//   34  106:return          

		case 2: // '\002'
			put(PdfName.S, ((PdfObject) (PdfName.B)));
	//   35  107:aload_0         
	//   36  108:getstatic       #57  <Field PdfName PdfName.S>
	//   37  111:getstatic       #63  <Field PdfName PdfName.B>
	//   38  114:invokevirtual   #39  <Method void put(PdfName, PdfObject)>
			return;
	//   39  117:return          

		case 3: // '\003'
			put(PdfName.S, ((PdfObject) (PdfName.I)));
	//   40  118:aload_0         
	//   41  119:getstatic       #57  <Field PdfName PdfName.S>
	//   42  122:getstatic       #65  <Field PdfName PdfName.I>
	//   43  125:invokevirtual   #39  <Method void put(PdfName, PdfObject)>
			return;
	//   44  128:return          

		case 4: // '\004'
			put(PdfName.S, ((PdfObject) (PdfName.U)));
	//   45  129:aload_0         
	//   46  130:getstatic       #57  <Field PdfName PdfName.S>
	//   47  133:getstatic       #68  <Field PdfName PdfName.U>
	//   48  136:invokevirtual   #39  <Method void put(PdfName, PdfObject)>
			return;
	//   49  139:return          
		}
	}

	public static final int STYLE_BEVELED = 2;
	public static final int STYLE_DASHED = 1;
	public static final int STYLE_INSET = 3;
	public static final int STYLE_SOLID = 0;
	public static final int STYLE_UNDERLINE = 4;
}
