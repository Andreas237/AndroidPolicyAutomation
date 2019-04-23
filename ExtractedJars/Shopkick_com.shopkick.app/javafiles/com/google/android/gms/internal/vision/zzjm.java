// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

public final class zzjm extends IOException
{

	zzjm(int i, int j)
	{
		StringBuilder stringbuilder = new StringBuilder(108);
	//    0    0:new             #8   <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          108
	//    3    6:invokespecial   #11  <Method void StringBuilder(int)>
	//    4    9:astore_3        
		stringbuilder.append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
	//    5   10:aload_3         
	//    6   11:ldc1            #13  <String "CodedOutputStream was writing to a flat byte array and ran out of space (pos ">
	//    7   13:invokevirtual   #17  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(i);
	//    9   17:aload_3         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #20  <Method StringBuilder StringBuilder.append(int)>
	//   12   22:pop             
		stringbuilder.append(" limit ");
	//   13   23:aload_3         
	//   14   24:ldc1            #22  <String " limit ">
	//   15   26:invokevirtual   #17  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
		stringbuilder.append(j);
	//   17   30:aload_3         
	//   18   31:iload_2         
	//   19   32:invokevirtual   #20  <Method StringBuilder StringBuilder.append(int)>
	//   20   35:pop             
		stringbuilder.append(").");
	//   21   36:aload_3         
	//   22   37:ldc1            #24  <String ").">
	//   23   39:invokevirtual   #17  <Method StringBuilder StringBuilder.append(String)>
	//   24   42:pop             
		super(stringbuilder.toString());
	//   25   43:aload_0         
	//   26   44:aload_3         
	//   27   45:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   28   48:invokespecial   #31  <Method void IOException(String)>
	//   29   51:return          
	}
}
