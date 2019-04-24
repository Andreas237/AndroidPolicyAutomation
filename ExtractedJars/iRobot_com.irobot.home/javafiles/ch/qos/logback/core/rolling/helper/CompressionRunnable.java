// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;


// Referenced classes of package ch.qos.logback.core.rolling.helper:
//			Compressor

public class CompressionRunnable
	implements Runnable
{

	public CompressionRunnable(Compressor compressor1, String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		compressor = compressor1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Compressor compressor>
		nameOfFile2Compress = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field String nameOfFile2Compress>
		nameOfCompressedFile = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field String nameOfCompressedFile>
		innerEntryName = s2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #25  <Field String innerEntryName>
	//   14   25:return          
	}

	public void run()
	{
		compressor.compress(nameOfFile2Compress, nameOfCompressedFile, innerEntryName);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Compressor compressor>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field String nameOfFile2Compress>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field String nameOfCompressedFile>
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field String innerEntryName>
	//    8   16:invokevirtual   #33  <Method void Compressor.compress(String, String, String)>
	//    9   19:return          
	}

	final Compressor compressor;
	final String innerEntryName;
	final String nameOfCompressedFile;
	final String nameOfFile2Compress;
}
