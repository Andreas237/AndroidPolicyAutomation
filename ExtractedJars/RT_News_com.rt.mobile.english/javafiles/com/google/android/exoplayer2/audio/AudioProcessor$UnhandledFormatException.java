// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;


// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioProcessor

public static final class AudioProcessor$UnhandledFormatException extends Exception
{

	public AudioProcessor$UnhandledFormatException(int i, int j, int k)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #11  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("Unhandled format: ");
	//    4    9:aload           4
	//    5   11:ldc1            #16  <String "Unhandled format: ">
	//    6   13:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(i);
	//    8   17:aload           4
	//    9   19:iload_1         
	//   10   20:invokevirtual   #23  <Method StringBuilder StringBuilder.append(int)>
	//   11   23:pop             
		stringbuilder.append(" Hz, ");
	//   12   24:aload           4
	//   13   26:ldc1            #25  <String " Hz, ">
	//   14   28:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		stringbuilder.append(j);
	//   16   32:aload           4
	//   17   34:iload_2         
	//   18   35:invokevirtual   #23  <Method StringBuilder StringBuilder.append(int)>
	//   19   38:pop             
		stringbuilder.append(" channels in encoding ");
	//   20   39:aload           4
	//   21   41:ldc1            #27  <String " channels in encoding ">
	//   22   43:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		stringbuilder.append(k);
	//   24   47:aload           4
	//   25   49:iload_3         
	//   26   50:invokevirtual   #23  <Method StringBuilder StringBuilder.append(int)>
	//   27   53:pop             
		super(stringbuilder.toString());
	//   28   54:aload_0         
	//   29   55:aload           4
	//   30   57:invokevirtual   #31  <Method String StringBuilder.toString()>
	//   31   60:invokespecial   #34  <Method void Exception(String)>
	//   32   63:return          
	}
}
