// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.studies;


public final class StudyId extends Enum
{

	private StudyId(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #30  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static StudyId valueOf(String s)
	{
		return (StudyId)Enum.valueOf(com/pactforcure/app/studies/StudyId, s);
	//    0    0:ldc1            #2   <Class StudyId>
	//    1    2:aload_0         
	//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class StudyId>
	//    4    9:areturn         
	}

	public static StudyId[] values()
	{
		return (StudyId[])((StudyId []) ($VALUES)).clone();
	//    0    0:getstatic       #28  <Field StudyId[] $VALUES>
	//    1    3:invokevirtual   #43  <Method Object _5B_Lcom.pactforcure.app.studies.StudyId_3B_.clone()>
	//    2    6:checkcast       #39  <Class StudyId[]>
	//    3    9:areturn         
	}

	private static final StudyId $VALUES[];
	public static final StudyId AU;
	public static final StudyId UK;
	public static final StudyId US;

	static 
	{
		AU = new StudyId("AU", 0);
	//    0    0:new             #2   <Class StudyId>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "AU">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #18  <Method void StudyId(String, int)>
	//    5   10:putstatic       #20  <Field StudyId AU>
		UK = new StudyId("UK", 1);
	//    6   13:new             #2   <Class StudyId>
	//    7   16:dup             
	//    8   17:ldc1            #21  <String "UK">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #18  <Method void StudyId(String, int)>
	//   11   23:putstatic       #23  <Field StudyId UK>
		US = new StudyId("US", 2);
	//   12   26:new             #2   <Class StudyId>
	//   13   29:dup             
	//   14   30:ldc1            #24  <String "US">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #18  <Method void StudyId(String, int)>
	//   17   36:putstatic       #26  <Field StudyId US>
		$VALUES = (new StudyId[] {
			AU, UK, US
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       StudyId[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #20  <Field StudyId AU>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #23  <Field StudyId UK>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #26  <Field StudyId US>
	//   31   60:aastore         
	//   32   61:putstatic       #28  <Field StudyId[] $VALUES>
	//*  33   64:return          
	}
}
