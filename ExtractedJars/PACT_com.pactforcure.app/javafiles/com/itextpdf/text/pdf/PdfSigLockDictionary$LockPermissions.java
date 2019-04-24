// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfSigLockDictionary, PdfNumber

public static final class PdfSigLockDictionary$LockPermissions extends Enum
{

	public static PdfSigLockDictionary$LockPermissions valueOf(String s)
	{
		return (PdfSigLockDictionary$LockPermissions)Enum.valueOf(com/itextpdf/text/pdf/PdfSigLockDictionary$LockPermissions, s);
	//    0    0:ldc1            #2   <Class PdfSigLockDictionary$LockPermissions>
	//    1    2:aload_0         
	//    2    3:invokestatic    #50  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PdfSigLockDictionary$LockPermissions>
	//    4    9:areturn         
	}

	public static PdfSigLockDictionary$LockPermissions[] values()
	{
		return (PdfSigLockDictionary$LockPermissions[])((PdfSigLockDictionary$LockPermissions []) ($VALUES)).clone();
	//    0    0:getstatic       #33  <Field PdfSigLockDictionary$LockPermissions[] $VALUES>
	//    1    3:invokevirtual   #57  <Method Object _5B_Lcom.itextpdf.text.pdf.PdfSigLockDictionary$LockPermissions_3B_.clone()>
	//    2    6:checkcast       #53  <Class PdfSigLockDictionary$LockPermissions[]>
	//    3    9:areturn         
	}

	public PdfNumber getValue()
	{
		return number;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field PdfNumber number>
	//    2    4:areturn         
	}

	private static final PdfSigLockDictionary$LockPermissions $VALUES[];
	public static final PdfSigLockDictionary$LockPermissions FORM_FILLING;
	public static final PdfSigLockDictionary$LockPermissions FORM_FILLING_AND_ANNOTATION;
	public static final PdfSigLockDictionary$LockPermissions NO_CHANGES_ALLOWED;
	private PdfNumber number;

	static 
	{
		NO_CHANGES_ALLOWED = new PdfSigLockDictionary$LockPermissions("NO_CHANGES_ALLOWED", 0, 1);
	//    0    0:new             #2   <Class PdfSigLockDictionary$LockPermissions>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "NO_CHANGES_ALLOWED">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #23  <Method void PdfSigLockDictionary$LockPermissions(String, int, int)>
	//    6   11:putstatic       #25  <Field PdfSigLockDictionary$LockPermissions NO_CHANGES_ALLOWED>
		FORM_FILLING = new PdfSigLockDictionary$LockPermissions("FORM_FILLING", 1, 2);
	//    7   14:new             #2   <Class PdfSigLockDictionary$LockPermissions>
	//    8   17:dup             
	//    9   18:ldc1            #26  <String "FORM_FILLING">
	//   10   20:iconst_1        
	//   11   21:iconst_2        
	//   12   22:invokespecial   #23  <Method void PdfSigLockDictionary$LockPermissions(String, int, int)>
	//   13   25:putstatic       #28  <Field PdfSigLockDictionary$LockPermissions FORM_FILLING>
		FORM_FILLING_AND_ANNOTATION = new PdfSigLockDictionary$LockPermissions("FORM_FILLING_AND_ANNOTATION", 2, 3);
	//   14   28:new             #2   <Class PdfSigLockDictionary$LockPermissions>
	//   15   31:dup             
	//   16   32:ldc1            #29  <String "FORM_FILLING_AND_ANNOTATION">
	//   17   34:iconst_2        
	//   18   35:iconst_3        
	//   19   36:invokespecial   #23  <Method void PdfSigLockDictionary$LockPermissions(String, int, int)>
	//   20   39:putstatic       #31  <Field PdfSigLockDictionary$LockPermissions FORM_FILLING_AND_ANNOTATION>
		$VALUES = (new PdfSigLockDictionary$LockPermissions[] {
			NO_CHANGES_ALLOWED, FORM_FILLING, FORM_FILLING_AND_ANNOTATION
		});
	//   21   42:iconst_3        
	//   22   43:anewarray       PdfSigLockDictionary$LockPermissions[]
	//   23   46:dup             
	//   24   47:iconst_0        
	//   25   48:getstatic       #25  <Field PdfSigLockDictionary$LockPermissions NO_CHANGES_ALLOWED>
	//   26   51:aastore         
	//   27   52:dup             
	//   28   53:iconst_1        
	//   29   54:getstatic       #28  <Field PdfSigLockDictionary$LockPermissions FORM_FILLING>
	//   30   57:aastore         
	//   31   58:dup             
	//   32   59:iconst_2        
	//   33   60:getstatic       #31  <Field PdfSigLockDictionary$LockPermissions FORM_FILLING_AND_ANNOTATION>
	//   34   63:aastore         
	//   35   64:putstatic       #33  <Field PdfSigLockDictionary$LockPermissions[] $VALUES>
	//*  36   67:return          
	}

	private PdfSigLockDictionary$LockPermissions(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		number = new PdfNumber(j);
	//    4    6:aload_0         
	//    5    7:new             #39  <Class PdfNumber>
	//    6   10:dup             
	//    7   11:iload_3         
	//    8   12:invokespecial   #42  <Method void PdfNumber(int)>
	//    9   15:putfield        #44  <Field PdfNumber number>
	//   10   18:return          
	}
}
