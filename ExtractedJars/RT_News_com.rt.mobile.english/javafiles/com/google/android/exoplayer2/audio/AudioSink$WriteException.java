// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;


// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioSink

public static final class AudioSink$WriteException extends Exception
{

	public final int errorCode;

	public AudioSink$WriteException(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("AudioTrack write failed: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #18  <String "AudioTrack write failed: ">
	//    6   11:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(i);
	//    8   15:aload_2         
	//    9   16:iload_1         
	//   10   17:invokevirtual   #25  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		super(stringbuilder.toString());
	//   12   21:aload_0         
	//   13   22:aload_2         
	//   14   23:invokevirtual   #29  <Method String StringBuilder.toString()>
	//   15   26:invokespecial   #32  <Method void Exception(String)>
		errorCode = i;
	//   16   29:aload_0         
	//   17   30:iload_1         
	//   18   31:putfield        #34  <Field int errorCode>
	//   19   34:return          
	}
}
