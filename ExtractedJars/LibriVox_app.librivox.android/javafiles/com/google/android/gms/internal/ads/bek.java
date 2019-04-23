// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class bek extends Exception
{

	public bek(int i, int j, int k, int l)
	{
		StringBuilder stringbuilder = new StringBuilder(82);
	//    0    0:new             #10  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          82
	//    3    6:invokespecial   #13  <Method void StringBuilder(int)>
	//    4    9:astore          5
		stringbuilder.append("AudioTrack init failed: ");
	//    5   11:aload           5
	//    6   13:ldc1            #15  <String "AudioTrack init failed: ">
	//    7   15:invokevirtual   #19  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(i);
	//    9   19:aload           5
	//   10   21:iload_1         
	//   11   22:invokevirtual   #22  <Method StringBuilder StringBuilder.append(int)>
	//   12   25:pop             
		stringbuilder.append(", Config(");
	//   13   26:aload           5
	//   14   28:ldc1            #24  <String ", Config(">
	//   15   30:invokevirtual   #19  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		stringbuilder.append(j);
	//   17   34:aload           5
	//   18   36:iload_2         
	//   19   37:invokevirtual   #22  <Method StringBuilder StringBuilder.append(int)>
	//   20   40:pop             
		stringbuilder.append(", ");
	//   21   41:aload           5
	//   22   43:ldc1            #26  <String ", ">
	//   23   45:invokevirtual   #19  <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
		stringbuilder.append(k);
	//   25   49:aload           5
	//   26   51:iload_3         
	//   27   52:invokevirtual   #22  <Method StringBuilder StringBuilder.append(int)>
	//   28   55:pop             
		stringbuilder.append(", ");
	//   29   56:aload           5
	//   30   58:ldc1            #26  <String ", ">
	//   31   60:invokevirtual   #19  <Method StringBuilder StringBuilder.append(String)>
	//   32   63:pop             
		stringbuilder.append(l);
	//   33   64:aload           5
	//   34   66:iload           4
	//   35   68:invokevirtual   #22  <Method StringBuilder StringBuilder.append(int)>
	//   36   71:pop             
		stringbuilder.append(")");
	//   37   72:aload           5
	//   38   74:ldc1            #28  <String ")">
	//   39   76:invokevirtual   #19  <Method StringBuilder StringBuilder.append(String)>
	//   40   79:pop             
		super(stringbuilder.toString());
	//   41   80:aload_0         
	//   42   81:aload           5
	//   43   83:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   44   86:invokespecial   #35  <Method void Exception(String)>
		a = i;
	//   45   89:aload_0         
	//   46   90:iload_1         
	//   47   91:putfield        #37  <Field int a>
	//   48   94:return          
	}

	private final int a;
}
