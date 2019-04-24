// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			PdfImageObject

public static final class PdfImageObject$ImageBytesType extends Enum
{

	public static PdfImageObject$ImageBytesType valueOf(String s)
	{
		return (PdfImageObject$ImageBytesType)Enum.valueOf(com/itextpdf/text/pdf/parser/PdfImageObject$ImageBytesType, s);
	//    0    0:ldc1            #2   <Class PdfImageObject$ImageBytesType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #64  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PdfImageObject$ImageBytesType>
	//    4    9:areturn         
	}

	public static PdfImageObject$ImageBytesType[] values()
	{
		return (PdfImageObject$ImageBytesType[])((PdfImageObject$ImageBytesType []) ($VALUES)).clone();
	//    0    0:getstatic       #51  <Field PdfImageObject$ImageBytesType[] $VALUES>
	//    1    3:invokevirtual   #71  <Method Object _5B_Lcom.itextpdf.text.pdf.parser.PdfImageObject$ImageBytesType_3B_.clone()>
	//    2    6:checkcast       #67  <Class PdfImageObject$ImageBytesType[]>
	//    3    9:areturn         
	}

	public String getFileExtension()
	{
		return fileExtension;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String fileExtension>
	//    2    4:areturn         
	}

	private static final PdfImageObject$ImageBytesType $VALUES[];
	public static final PdfImageObject$ImageBytesType CCITT;
	public static final PdfImageObject$ImageBytesType JBIG2;
	public static final PdfImageObject$ImageBytesType JP2;
	public static final PdfImageObject$ImageBytesType JPG;
	public static final PdfImageObject$ImageBytesType PNG;
	private final String fileExtension;

	static 
	{
		PNG = new PdfImageObject$ImageBytesType("PNG", 0, "png");
	//    0    0:new             #2   <Class PdfImageObject$ImageBytesType>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "PNG">
	//    3    6:iconst_0        
	//    4    7:ldc1            #23  <String "png">
	//    5    9:invokespecial   #27  <Method void PdfImageObject$ImageBytesType(String, int, String)>
	//    6   12:putstatic       #29  <Field PdfImageObject$ImageBytesType PNG>
		JPG = new PdfImageObject$ImageBytesType("JPG", 1, "jpg");
	//    7   15:new             #2   <Class PdfImageObject$ImageBytesType>
	//    8   18:dup             
	//    9   19:ldc1            #30  <String "JPG">
	//   10   21:iconst_1        
	//   11   22:ldc1            #32  <String "jpg">
	//   12   24:invokespecial   #27  <Method void PdfImageObject$ImageBytesType(String, int, String)>
	//   13   27:putstatic       #34  <Field PdfImageObject$ImageBytesType JPG>
		JP2 = new PdfImageObject$ImageBytesType("JP2", 2, "jp2");
	//   14   30:new             #2   <Class PdfImageObject$ImageBytesType>
	//   15   33:dup             
	//   16   34:ldc1            #35  <String "JP2">
	//   17   36:iconst_2        
	//   18   37:ldc1            #37  <String "jp2">
	//   19   39:invokespecial   #27  <Method void PdfImageObject$ImageBytesType(String, int, String)>
	//   20   42:putstatic       #39  <Field PdfImageObject$ImageBytesType JP2>
		CCITT = new PdfImageObject$ImageBytesType("CCITT", 3, "tif");
	//   21   45:new             #2   <Class PdfImageObject$ImageBytesType>
	//   22   48:dup             
	//   23   49:ldc1            #40  <String "CCITT">
	//   24   51:iconst_3        
	//   25   52:ldc1            #42  <String "tif">
	//   26   54:invokespecial   #27  <Method void PdfImageObject$ImageBytesType(String, int, String)>
	//   27   57:putstatic       #44  <Field PdfImageObject$ImageBytesType CCITT>
		JBIG2 = new PdfImageObject$ImageBytesType("JBIG2", 4, "jbig2");
	//   28   60:new             #2   <Class PdfImageObject$ImageBytesType>
	//   29   63:dup             
	//   30   64:ldc1            #45  <String "JBIG2">
	//   31   66:iconst_4        
	//   32   67:ldc1            #47  <String "jbig2">
	//   33   69:invokespecial   #27  <Method void PdfImageObject$ImageBytesType(String, int, String)>
	//   34   72:putstatic       #49  <Field PdfImageObject$ImageBytesType JBIG2>
		$VALUES = (new PdfImageObject$ImageBytesType[] {
			PNG, JPG, JP2, CCITT, JBIG2
		});
	//   35   75:iconst_5        
	//   36   76:anewarray       PdfImageObject$ImageBytesType[]
	//   37   79:dup             
	//   38   80:iconst_0        
	//   39   81:getstatic       #29  <Field PdfImageObject$ImageBytesType PNG>
	//   40   84:aastore         
	//   41   85:dup             
	//   42   86:iconst_1        
	//   43   87:getstatic       #34  <Field PdfImageObject$ImageBytesType JPG>
	//   44   90:aastore         
	//   45   91:dup             
	//   46   92:iconst_2        
	//   47   93:getstatic       #39  <Field PdfImageObject$ImageBytesType JP2>
	//   48   96:aastore         
	//   49   97:dup             
	//   50   98:iconst_3        
	//   51   99:getstatic       #44  <Field PdfImageObject$ImageBytesType CCITT>
	//   52  102:aastore         
	//   53  103:dup             
	//   54  104:iconst_4        
	//   55  105:getstatic       #49  <Field PdfImageObject$ImageBytesType JBIG2>
	//   56  108:aastore         
	//   57  109:putstatic       #51  <Field PdfImageObject$ImageBytesType[] $VALUES>
	//*  58  112:return          
	}

	private PdfImageObject$ImageBytesType(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #55  <Method void Enum(String, int)>
		fileExtension = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #57  <Field String fileExtension>
	//    7   11:return          
	}
}
