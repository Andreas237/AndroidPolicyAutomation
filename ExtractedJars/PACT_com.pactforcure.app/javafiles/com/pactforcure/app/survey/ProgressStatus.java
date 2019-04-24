// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import java.io.Serializable;

public final class ProgressStatus extends Enum
	implements Serializable
{

	private ProgressStatus(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #36  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ProgressStatus valueOf(String s)
	{
		return (ProgressStatus)Enum.valueOf(com/pactforcure/app/survey/ProgressStatus, s);
	//    0    0:ldc1            #2   <Class ProgressStatus>
	//    1    2:aload_0         
	//    2    3:invokestatic    #42  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ProgressStatus>
	//    4    9:areturn         
	}

	public static ProgressStatus[] values()
	{
		return (ProgressStatus[])((ProgressStatus []) ($VALUES)).clone();
	//    0    0:getstatic       #34  <Field ProgressStatus[] $VALUES>
	//    1    3:invokevirtual   #49  <Method Object _5B_Lcom.pactforcure.app.survey.ProgressStatus_3B_.clone()>
	//    2    6:checkcast       #45  <Class ProgressStatus[]>
	//    3    9:areturn         
	}

	private static final ProgressStatus $VALUES[];
	public static final ProgressStatus Completed;
	public static final ProgressStatus New;
	public static final ProgressStatus Started;
	public static final ProgressStatus Uploaded;

	static 
	{
		New = new ProgressStatus("New", 0);
	//    0    0:new             #2   <Class ProgressStatus>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "New">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void ProgressStatus(String, int)>
	//    5   10:putstatic       #23  <Field ProgressStatus New>
		Started = new ProgressStatus("Started", 1);
	//    6   13:new             #2   <Class ProgressStatus>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "Started">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void ProgressStatus(String, int)>
	//   11   23:putstatic       #26  <Field ProgressStatus Started>
		Completed = new ProgressStatus("Completed", 2);
	//   12   26:new             #2   <Class ProgressStatus>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "Completed">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void ProgressStatus(String, int)>
	//   17   36:putstatic       #29  <Field ProgressStatus Completed>
		Uploaded = new ProgressStatus("Uploaded", 3);
	//   18   39:new             #2   <Class ProgressStatus>
	//   19   42:dup             
	//   20   43:ldc1            #30  <String "Uploaded">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #21  <Method void ProgressStatus(String, int)>
	//   23   49:putstatic       #32  <Field ProgressStatus Uploaded>
		$VALUES = (new ProgressStatus[] {
			New, Started, Completed, Uploaded
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       ProgressStatus[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #23  <Field ProgressStatus New>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #26  <Field ProgressStatus Started>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #29  <Field ProgressStatus Completed>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #32  <Field ProgressStatus Uploaded>
	//   41   79:aastore         
	//   42   80:putstatic       #34  <Field ProgressStatus[] $VALUES>
	//*  43   83:return          
	}
}
