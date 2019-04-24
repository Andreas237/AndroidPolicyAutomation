// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


final class zzxp extends IllegalArgumentException
{

	zzxp(int i, int j)
	{
		StringBuilder stringbuilder = new StringBuilder(54);
	//    0    0:new             #8   <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          54
	//    3    6:invokespecial   #11  <Method void StringBuilder(int)>
	//    4    9:astore_3        
		stringbuilder.append("Unpaired surrogate at index ");
	//    5   10:aload_3         
	//    6   11:ldc1            #13  <String "Unpaired surrogate at index ">
	//    7   13:invokevirtual   #17  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(i);
	//    9   17:aload_3         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #20  <Method StringBuilder StringBuilder.append(int)>
	//   12   22:pop             
		stringbuilder.append(" of ");
	//   13   23:aload_3         
	//   14   24:ldc1            #22  <String " of ">
	//   15   26:invokevirtual   #17  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
		stringbuilder.append(j);
	//   17   30:aload_3         
	//   18   31:iload_2         
	//   19   32:invokevirtual   #20  <Method StringBuilder StringBuilder.append(int)>
	//   20   35:pop             
		super(stringbuilder.toString());
	//   21   36:aload_0         
	//   22   37:aload_3         
	//   23   38:invokevirtual   #26  <Method String StringBuilder.toString()>
	//   24   41:invokespecial   #29  <Method void IllegalArgumentException(String)>
	//   25   44:return          
	}
}
