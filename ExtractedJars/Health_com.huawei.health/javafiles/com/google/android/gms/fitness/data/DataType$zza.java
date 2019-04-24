// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;


// Referenced classes of package com.google.android.gms.fitness.data:
//			DataType, Field

public static final class DataType$zza
{

	public static final DataType zzaTb;
	public static final DataType zzaTc;

	static 
	{
		zzaTb = new DataType("com.google.internal.session.debug", new Field[] {
			Field.zza.zzaTK
		});
	//    0    0:new             #6   <Class DataType>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "com.google.internal.session.debug">
	//    3    6:iconst_1        
	//    4    7:anewarray       Field[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:getstatic       #22  <Field Field Field$zza.zzaTK>
	//    8   15:aastore         
	//    9   16:invokespecial   #26  <Method void DataType(String, Field[])>
	//   10   19:putstatic       #28  <Field DataType zzaTb>
		zzaTc = new DataType("com.google.internal.session.v2", new Field[] {
			Field.zza.zzaTL
		});
	//   11   22:new             #6   <Class DataType>
	//   12   25:dup             
	//   13   26:ldc1            #30  <String "com.google.internal.session.v2">
	//   14   28:iconst_1        
	//   15   29:anewarray       Field[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:getstatic       #33  <Field Field Field$zza.zzaTL>
	//   19   37:aastore         
	//   20   38:invokespecial   #26  <Method void DataType(String, Field[])>
	//   21   41:putstatic       #35  <Field DataType zzaTc>
	//*  22   44:return          
	}
}
