// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfSignatureAppearance

public static final class PdfSignatureAppearance$RenderingMode extends Enum
{

	public static PdfSignatureAppearance$RenderingMode valueOf(String s)
	{
		return (PdfSignatureAppearance$RenderingMode)Enum.valueOf(com/itextpdf/text/pdf/PdfSignatureAppearance$RenderingMode, s);
	//    0    0:ldc1            #2   <Class PdfSignatureAppearance$RenderingMode>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PdfSignatureAppearance$RenderingMode>
	//    4    9:areturn         
	}

	public static PdfSignatureAppearance$RenderingMode[] values()
	{
		return (PdfSignatureAppearance$RenderingMode[])((PdfSignatureAppearance$RenderingMode []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field PdfSignatureAppearance$RenderingMode[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.pdf.PdfSignatureAppearance$RenderingMode_3B_.clone()>
	//    2    6:checkcast       #46  <Class PdfSignatureAppearance$RenderingMode[]>
	//    3    9:areturn         
	}

	private static final PdfSignatureAppearance$RenderingMode $VALUES[];
	public static final PdfSignatureAppearance$RenderingMode DESCRIPTION;
	public static final PdfSignatureAppearance$RenderingMode GRAPHIC;
	public static final PdfSignatureAppearance$RenderingMode GRAPHIC_AND_DESCRIPTION;
	public static final PdfSignatureAppearance$RenderingMode NAME_AND_DESCRIPTION;

	static 
	{
		DESCRIPTION = new PdfSignatureAppearance$RenderingMode("DESCRIPTION", 0);
	//    0    0:new             #2   <Class PdfSignatureAppearance$RenderingMode>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "DESCRIPTION">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void PdfSignatureAppearance$RenderingMode(String, int)>
	//    5   10:putstatic       #24  <Field PdfSignatureAppearance$RenderingMode DESCRIPTION>
		NAME_AND_DESCRIPTION = new PdfSignatureAppearance$RenderingMode("NAME_AND_DESCRIPTION", 1);
	//    6   13:new             #2   <Class PdfSignatureAppearance$RenderingMode>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "NAME_AND_DESCRIPTION">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void PdfSignatureAppearance$RenderingMode(String, int)>
	//   11   23:putstatic       #27  <Field PdfSignatureAppearance$RenderingMode NAME_AND_DESCRIPTION>
		GRAPHIC_AND_DESCRIPTION = new PdfSignatureAppearance$RenderingMode("GRAPHIC_AND_DESCRIPTION", 2);
	//   12   26:new             #2   <Class PdfSignatureAppearance$RenderingMode>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "GRAPHIC_AND_DESCRIPTION">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void PdfSignatureAppearance$RenderingMode(String, int)>
	//   17   36:putstatic       #30  <Field PdfSignatureAppearance$RenderingMode GRAPHIC_AND_DESCRIPTION>
		GRAPHIC = new PdfSignatureAppearance$RenderingMode("GRAPHIC", 3);
	//   18   39:new             #2   <Class PdfSignatureAppearance$RenderingMode>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "GRAPHIC">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void PdfSignatureAppearance$RenderingMode(String, int)>
	//   23   49:putstatic       #33  <Field PdfSignatureAppearance$RenderingMode GRAPHIC>
		$VALUES = (new PdfSignatureAppearance$RenderingMode[] {
			DESCRIPTION, NAME_AND_DESCRIPTION, GRAPHIC_AND_DESCRIPTION, GRAPHIC
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       PdfSignatureAppearance$RenderingMode[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field PdfSignatureAppearance$RenderingMode DESCRIPTION>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field PdfSignatureAppearance$RenderingMode NAME_AND_DESCRIPTION>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field PdfSignatureAppearance$RenderingMode GRAPHIC_AND_DESCRIPTION>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field PdfSignatureAppearance$RenderingMode GRAPHIC>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field PdfSignatureAppearance$RenderingMode[] $VALUES>
	//*  43   83:return          
	}

	private PdfSignatureAppearance$RenderingMode(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
