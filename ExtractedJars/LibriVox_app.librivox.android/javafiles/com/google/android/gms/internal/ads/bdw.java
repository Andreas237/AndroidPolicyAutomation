// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class bdw extends Exception
{

	public bdw(int i, int j, int k)
	{
		StringBuilder stringbuilder = new StringBuilder(78);
	//    0    0:new             #8   <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          78
	//    3    6:invokespecial   #11  <Method void StringBuilder(int)>
	//    4    9:astore          4
		stringbuilder.append("Unhandled format: ");
	//    5   11:aload           4
	//    6   13:ldc1            #13  <String "Unhandled format: ">
	//    7   15:invokevirtual   #17  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(i);
	//    9   19:aload           4
	//   10   21:iload_1         
	//   11   22:invokevirtual   #20  <Method StringBuilder StringBuilder.append(int)>
	//   12   25:pop             
		stringbuilder.append(" Hz, ");
	//   13   26:aload           4
	//   14   28:ldc1            #22  <String " Hz, ">
	//   15   30:invokevirtual   #17  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		stringbuilder.append(j);
	//   17   34:aload           4
	//   18   36:iload_2         
	//   19   37:invokevirtual   #20  <Method StringBuilder StringBuilder.append(int)>
	//   20   40:pop             
		stringbuilder.append(" channels in encoding ");
	//   21   41:aload           4
	//   22   43:ldc1            #24  <String " channels in encoding ">
	//   23   45:invokevirtual   #17  <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
		stringbuilder.append(k);
	//   25   49:aload           4
	//   26   51:iload_3         
	//   27   52:invokevirtual   #20  <Method StringBuilder StringBuilder.append(int)>
	//   28   55:pop             
		super(stringbuilder.toString());
	//   29   56:aload_0         
	//   30   57:aload           4
	//   31   59:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   32   62:invokespecial   #31  <Method void Exception(String)>
	//   33   65:return          
	}
}
