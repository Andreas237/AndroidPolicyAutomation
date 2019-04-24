// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfName, PdfArray, PdfString, 
//			PdfNumber

public class PdfSigLockDictionary extends PdfDictionary
{
	public static final class LockAction extends Enum
	{

		public static LockAction valueOf(String s)
		{
			return (LockAction)Enum.valueOf(com/itextpdf/text/pdf/PdfSigLockDictionary$LockAction, s);
		//    0    0:ldc1            #2   <Class PdfSigLockDictionary$LockAction>
		//    1    2:aload_0         
		//    2    3:invokestatic    #54  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PdfSigLockDictionary$LockAction>
		//    4    9:areturn         
		}

		public static LockAction[] values()
		{
			return (LockAction[])((LockAction []) ($VALUES)).clone();
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

		private static final LockAction $VALUES[];
		public static final LockAction ALL;
		public static final LockAction EXCLUDE;
		public static final LockAction INCLUDE;
		private PdfName name;

		static 
		{
			ALL = new LockAction("ALL", 0, PdfName.ALL);
		//    0    0:new             #2   <Class PdfSigLockDictionary$LockAction>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "ALL">
		//    3    6:iconst_0        
		//    4    7:getstatic       #23  <Field PdfName PdfName.ALL>
		//    5   10:invokespecial   #27  <Method void PdfSigLockDictionary$LockAction(String, int, PdfName)>
		//    6   13:putstatic       #29  <Field PdfSigLockDictionary$LockAction ALL>
			INCLUDE = new LockAction("INCLUDE", 1, PdfName.INCLUDE);
		//    7   16:new             #2   <Class PdfSigLockDictionary$LockAction>
		//    8   19:dup             
		//    9   20:ldc1            #30  <String "INCLUDE">
		//   10   22:iconst_1        
		//   11   23:getstatic       #32  <Field PdfName PdfName.INCLUDE>
		//   12   26:invokespecial   #27  <Method void PdfSigLockDictionary$LockAction(String, int, PdfName)>
		//   13   29:putstatic       #34  <Field PdfSigLockDictionary$LockAction INCLUDE>
			EXCLUDE = new LockAction("EXCLUDE", 2, PdfName.EXCLUDE);
		//   14   32:new             #2   <Class PdfSigLockDictionary$LockAction>
		//   15   35:dup             
		//   16   36:ldc1            #35  <String "EXCLUDE">
		//   17   38:iconst_2        
		//   18   39:getstatic       #37  <Field PdfName PdfName.EXCLUDE>
		//   19   42:invokespecial   #27  <Method void PdfSigLockDictionary$LockAction(String, int, PdfName)>
		//   20   45:putstatic       #39  <Field PdfSigLockDictionary$LockAction EXCLUDE>
			$VALUES = (new LockAction[] {
				ALL, INCLUDE, EXCLUDE
			});
		//   21   48:iconst_3        
		//   22   49:anewarray       LockAction[]
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

		private LockAction(String s, int i, PdfName pdfname)
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

	public static final class LockPermissions extends Enum
	{

		public static LockPermissions valueOf(String s)
		{
			return (LockPermissions)Enum.valueOf(com/itextpdf/text/pdf/PdfSigLockDictionary$LockPermissions, s);
		//    0    0:ldc1            #2   <Class PdfSigLockDictionary$LockPermissions>
		//    1    2:aload_0         
		//    2    3:invokestatic    #50  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PdfSigLockDictionary$LockPermissions>
		//    4    9:areturn         
		}

		public static LockPermissions[] values()
		{
			return (LockPermissions[])((LockPermissions []) ($VALUES)).clone();
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

		private static final LockPermissions $VALUES[];
		public static final LockPermissions FORM_FILLING;
		public static final LockPermissions FORM_FILLING_AND_ANNOTATION;
		public static final LockPermissions NO_CHANGES_ALLOWED;
		private PdfNumber number;

		static 
		{
			NO_CHANGES_ALLOWED = new LockPermissions("NO_CHANGES_ALLOWED", 0, 1);
		//    0    0:new             #2   <Class PdfSigLockDictionary$LockPermissions>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "NO_CHANGES_ALLOWED">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #23  <Method void PdfSigLockDictionary$LockPermissions(String, int, int)>
		//    6   11:putstatic       #25  <Field PdfSigLockDictionary$LockPermissions NO_CHANGES_ALLOWED>
			FORM_FILLING = new LockPermissions("FORM_FILLING", 1, 2);
		//    7   14:new             #2   <Class PdfSigLockDictionary$LockPermissions>
		//    8   17:dup             
		//    9   18:ldc1            #26  <String "FORM_FILLING">
		//   10   20:iconst_1        
		//   11   21:iconst_2        
		//   12   22:invokespecial   #23  <Method void PdfSigLockDictionary$LockPermissions(String, int, int)>
		//   13   25:putstatic       #28  <Field PdfSigLockDictionary$LockPermissions FORM_FILLING>
			FORM_FILLING_AND_ANNOTATION = new LockPermissions("FORM_FILLING_AND_ANNOTATION", 2, 3);
		//   14   28:new             #2   <Class PdfSigLockDictionary$LockPermissions>
		//   15   31:dup             
		//   16   32:ldc1            #29  <String "FORM_FILLING_AND_ANNOTATION">
		//   17   34:iconst_2        
		//   18   35:iconst_3        
		//   19   36:invokespecial   #23  <Method void PdfSigLockDictionary$LockPermissions(String, int, int)>
		//   20   39:putstatic       #31  <Field PdfSigLockDictionary$LockPermissions FORM_FILLING_AND_ANNOTATION>
			$VALUES = (new LockPermissions[] {
				NO_CHANGES_ALLOWED, FORM_FILLING, FORM_FILLING_AND_ANNOTATION
			});
		//   21   42:iconst_3        
		//   22   43:anewarray       LockPermissions[]
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

		private LockPermissions(String s, int i, int j)
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


	public PdfSigLockDictionary()
	{
		super(PdfName.SIGFIELDLOCK);
	//    0    0:aload_0         
	//    1    1:getstatic       #18  <Field PdfName PdfName.SIGFIELDLOCK>
	//    2    4:invokespecial   #21  <Method void PdfDictionary(PdfName)>
		put(PdfName.ACTION, ((PdfObject) (LockAction.ALL.getValue())));
	//    3    7:aload_0         
	//    4    8:getstatic       #24  <Field PdfName PdfName.ACTION>
	//    5   11:getstatic       #28  <Field PdfSigLockDictionary$LockAction PdfSigLockDictionary$LockAction.ALL>
	//    6   14:invokevirtual   #32  <Method PdfName PdfSigLockDictionary$LockAction.getValue()>
	//    7   17:invokevirtual   #36  <Method void put(PdfName, PdfObject)>
	//    8   20:return          
	}

	public transient PdfSigLockDictionary(LockAction lockaction, LockPermissions lockpermissions, String as[])
	{
		super(PdfName.SIGFIELDLOCK);
	//    0    0:aload_0         
	//    1    1:getstatic       #18  <Field PdfName PdfName.SIGFIELDLOCK>
	//    2    4:invokespecial   #21  <Method void PdfDictionary(PdfName)>
		put(PdfName.ACTION, ((PdfObject) (lockaction.getValue())));
	//    3    7:aload_0         
	//    4    8:getstatic       #24  <Field PdfName PdfName.ACTION>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #32  <Method PdfName PdfSigLockDictionary$LockAction.getValue()>
	//    7   15:invokevirtual   #36  <Method void put(PdfName, PdfObject)>
		if(lockpermissions != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          33
			put(PdfName.P, ((PdfObject) (lockpermissions.getValue())));
	//   10   22:aload_0         
	//   11   23:getstatic       #41  <Field PdfName PdfName.P>
	//   12   26:aload_2         
	//   13   27:invokevirtual   #44  <Method PdfNumber PdfSigLockDictionary$LockPermissions.getValue()>
	//   14   30:invokevirtual   #36  <Method void put(PdfName, PdfObject)>
		lockaction = ((LockAction) (new PdfArray()));
	//   15   33:new             #46  <Class PdfArray>
	//   16   36:dup             
	//   17   37:invokespecial   #48  <Method void PdfArray()>
	//   18   40:astore_1        
		int j = as.length;
	//   19   41:aload_3         
	//   20   42:arraylength     
	//   21   43:istore          5
		for(int i = 0; i < j; i++)
	//*  22   45:iconst_0        
	//*  23   46:istore          4
	//*  24   48:iload           4
	//*  25   50:iload           5
	//*  26   52:icmpge          80
			((PdfArray) (lockaction)).add(((PdfObject) (new PdfString(as[i]))));
	//   27   55:aload_1         
	//   28   56:new             #50  <Class PdfString>
	//   29   59:dup             
	//   30   60:aload_3         
	//   31   61:iload           4
	//   32   63:aaload          
	//   33   64:invokespecial   #53  <Method void PdfString(String)>
	//   34   67:invokevirtual   #57  <Method boolean PdfArray.add(PdfObject)>
	//   35   70:pop             

	//   36   71:iload           4
	//   37   73:iconst_1        
	//   38   74:iadd            
	//   39   75:istore          4
	//*  40   77:goto            48
		put(PdfName.FIELDS, ((PdfObject) (lockaction)));
	//   41   80:aload_0         
	//   42   81:getstatic       #60  <Field PdfName PdfName.FIELDS>
	//   43   84:aload_1         
	//   44   85:invokevirtual   #36  <Method void put(PdfName, PdfObject)>
	//   45   88:return          
	}

	public transient PdfSigLockDictionary(LockAction lockaction, String as[])
	{
		this(lockaction, ((LockPermissions) (null)), as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokespecial   #63  <Method void PdfSigLockDictionary(PdfSigLockDictionary$LockAction, PdfSigLockDictionary$LockPermissions, String[])>
	//    5    7:return          
	}

	public PdfSigLockDictionary(LockPermissions lockpermissions)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void PdfSigLockDictionary()>
		put(PdfName.P, ((PdfObject) (lockpermissions.getValue())));
	//    2    4:aload_0         
	//    3    5:getstatic       #41  <Field PdfName PdfName.P>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #44  <Method PdfNumber PdfSigLockDictionary$LockPermissions.getValue()>
	//    6   12:invokevirtual   #36  <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}
}
