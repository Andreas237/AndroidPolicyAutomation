// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import java.io.Serializable;

public final class UploadStatus extends Enum
	implements Serializable
{

	private UploadStatus(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #28  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static UploadStatus valueOf(String s)
	{
		return (UploadStatus)Enum.valueOf(com/pactforcure/app/survey/UploadStatus, s);
	//    0    0:ldc1            #2   <Class UploadStatus>
	//    1    2:aload_0         
	//    2    3:invokestatic    #34  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class UploadStatus>
	//    4    9:areturn         
	}

	public static UploadStatus[] values()
	{
		return (UploadStatus[])((UploadStatus []) ($VALUES)).clone();
	//    0    0:getstatic       #26  <Field UploadStatus[] $VALUES>
	//    1    3:invokevirtual   #41  <Method Object _5B_Lcom.pactforcure.app.survey.UploadStatus_3B_.clone()>
	//    2    6:checkcast       #37  <Class UploadStatus[]>
	//    3    9:areturn         
	}

	private static final UploadStatus $VALUES[];
	public static final UploadStatus UploadStatusNotUploaded;
	public static final UploadStatus UploadStatusUploaded;

	static 
	{
		UploadStatusNotUploaded = new UploadStatus("UploadStatusNotUploaded", 0);
	//    0    0:new             #2   <Class UploadStatus>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "UploadStatusNotUploaded">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #19  <Method void UploadStatus(String, int)>
	//    5   10:putstatic       #21  <Field UploadStatus UploadStatusNotUploaded>
		UploadStatusUploaded = new UploadStatus("UploadStatusUploaded", 1);
	//    6   13:new             #2   <Class UploadStatus>
	//    7   16:dup             
	//    8   17:ldc1            #22  <String "UploadStatusUploaded">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #19  <Method void UploadStatus(String, int)>
	//   11   23:putstatic       #24  <Field UploadStatus UploadStatusUploaded>
		$VALUES = (new UploadStatus[] {
			UploadStatusNotUploaded, UploadStatusUploaded
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       UploadStatus[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #21  <Field UploadStatus UploadStatusNotUploaded>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #24  <Field UploadStatus UploadStatusUploaded>
	//   21   41:aastore         
	//   22   42:putstatic       #26  <Field UploadStatus[] $VALUES>
	//*  23   45:return          
	}
}
