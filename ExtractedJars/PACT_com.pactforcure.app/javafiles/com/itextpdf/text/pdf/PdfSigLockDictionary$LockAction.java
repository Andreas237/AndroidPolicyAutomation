// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfSigLockDictionary, PdfName

public static final class PdfSigLockDictionary$LockAction extends Enum
{

	public static PdfSigLockDictionary$LockAction valueOf(String s)
	{
		return (PdfSigLockDictionary$LockAction)Enum.valueOf(com/itextpdf/text/pdf/PdfSigLockDictionary$LockAction, s);
	//    0    0:ldc1            #2   <Class PdfSigLockDictionary$LockAction>
	//    1    2:aload_0         
	//    2    3:invokestatic    #54  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PdfSigLockDictionary$LockAction>
	//    4    9:areturn         
	}

	public static PdfSigLockDictionary$LockAction[] values()
	{
		return (PdfSigLockDictionary$LockAction[])((PdfSigLockDictionary$LockAction []) ($VALUES)).clone();
	//    0    0:getstatic       #41  <Field PdfSigLockDictionary$LockAction[] $VALUES>
	//    1    3:invokevirtual   #61  <Method Object _5B_Lcom.itextpdf.text.pdf.PdfSigLockDictionary$LockAction_3B_.clone()>
	//    2    6:checkcast       #57  <Class PdfSigLockDictionary$LockAction[]>
	//    3    9:areturn         
	}

	public PdfName getValue()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field PdfName name>
	//    2    4:areturn         
	}

	private static final PdfSigLockDictionary$LockAction $VALUES[];
	public static final PdfSigLockDictionary$LockAction ALL;
	public static final PdfSigLockDictionary$LockAction EXCLUDE;
	public static final PdfSigLockDictionary$LockAction INCLUDE;
	private PdfName name;

	static 
	{
		ALL = new PdfSigLockDictionary$LockAction("ALL", 0, PdfName.ALL);
	//    0    0:new             #2   <Class PdfSigLockDictionary$LockAction>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "ALL">
	//    3    6:iconst_0        
	//    4    7:getstatic       #23  <Field PdfName PdfName.ALL>
	//    5   10:invokespecial   #27  <Method void PdfSigLockDictionary$LockAction(String, int, PdfName)>
	//    6   13:putstatic       #29  <Field PdfSigLockDictionary$LockAction ALL>
		INCLUDE = new PdfSigLockDictionary$LockAction("INCLUDE", 1, PdfName.INCLUDE);
	//    7   16:new             #2   <Class PdfSigLockDictionary$LockAction>
	//    8   19:dup             
	//    9   20:ldc1            #30  <String "INCLUDE">
	//   10   22:iconst_1        
	//   11   23:getstatic       #32  <Field PdfName PdfName.INCLUDE>
	//   12   26:invokespecial   #27  <Method void PdfSigLockDictionary$LockAction(String, int, PdfName)>
	//   13   29:putstatic       #34  <Field PdfSigLockDictionary$LockAction INCLUDE>
		EXCLUDE = new PdfSigLockDictionary$LockAction("EXCLUDE", 2, PdfName.EXCLUDE);
	//   14   32:new             #2   <Class PdfSigLockDictionary$LockAction>
	//   15   35:dup             
	//   16   36:ldc1            #35  <String "EXCLUDE">
	//   17   38:iconst_2        
	//   18   39:getstatic       #37  <Field PdfName PdfName.EXCLUDE>
	//   19   42:invokespecial   #27  <Method void PdfSigLockDictionary$LockAction(String, int, PdfName)>
	//   20   45:putstatic       #39  <Field PdfSigLockDictionary$LockAction EXCLUDE>
		$VALUES = (new PdfSigLockDictionary$LockAction[] {
			ALL, INCLUDE, EXCLUDE
		});
	//   21   48:iconst_3        
	//   22   49:anewarray       PdfSigLockDictionary$LockAction[]
	//   23   52:dup             
	//   24   53:iconst_0        
	//   25   54:getstatic       #29  <Field PdfSigLockDictionary$LockAction ALL>
	//   26   57:aastore         
	//   27   58:dup             
	//   28   59:iconst_1        
	//   29   60:getstatic       #34  <Field PdfSigLockDictionary$LockAction INCLUDE>
	//   30   63:aastore         
	//   31   64:dup             
	//   32   65:iconst_2        
	//   33   66:getstatic       #39  <Field PdfSigLockDictionary$LockAction EXCLUDE>
	//   34   69:aastore         
	//   35   70:putstatic       #41  <Field PdfSigLockDictionary$LockAction[] $VALUES>
	//*  36   73:return          
	}

	private PdfSigLockDictionary$LockAction(String s, int i, PdfName pdfname)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		name = pdfname;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #47  <Field PdfName name>
	//    7   11:return          
	}
}
