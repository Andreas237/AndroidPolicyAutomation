// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.io;

import java.io.*;
import java.nio.charset.Charset;
import kotlin.TypeCastException;
import kotlin.collections.ByteIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class ByteStreamsKt
{

	private static final BufferedInputStream buffered(InputStream inputstream, int i)
	{
		if(inputstream instanceof BufferedInputStream)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #53  <Class BufferedInputStream>
	//*   2    4:ifeq            12
			return (BufferedInputStream)inputstream;
	//    3    7:aload_0         
	//    4    8:checkcast       #53  <Class BufferedInputStream>
	//    5   11:areturn         
		else
			return new BufferedInputStream(inputstream, i);
	//    6   12:new             #53  <Class BufferedInputStream>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokespecial   #57  <Method void BufferedInputStream(InputStream, int)>
	//   11   21:areturn         
	}

	private static final BufferedOutputStream buffered(OutputStream outputstream, int i)
	{
		if(outputstream instanceof BufferedOutputStream)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #63  <Class BufferedOutputStream>
	//*   2    4:ifeq            12
			return (BufferedOutputStream)outputstream;
	//    3    7:aload_0         
	//    4    8:checkcast       #63  <Class BufferedOutputStream>
	//    5   11:areturn         
		else
			return new BufferedOutputStream(outputstream, i);
	//    6   12:new             #63  <Class BufferedOutputStream>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokespecial   #66  <Method void BufferedOutputStream(OutputStream, int)>
	//   11   21:areturn         
	}

	static BufferedInputStream buffered$default(InputStream inputstream, int i, int j, Object obj)
	{
		if((j & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            10
			i = 8192;
	//    4    6:sipush          8192
	//    5    9:istore_1        
		if(inputstream instanceof BufferedInputStream)
	//*   6   10:aload_0         
	//*   7   11:instanceof      #53  <Class BufferedInputStream>
	//*   8   14:ifeq            22
			return (BufferedInputStream)inputstream;
	//    9   17:aload_0         
	//   10   18:checkcast       #53  <Class BufferedInputStream>
	//   11   21:areturn         
		else
			return new BufferedInputStream(inputstream, i);
	//   12   22:new             #53  <Class BufferedInputStream>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:iload_1         
	//   16   28:invokespecial   #57  <Method void BufferedInputStream(InputStream, int)>
	//   17   31:areturn         
	}

	static BufferedOutputStream buffered$default(OutputStream outputstream, int i, int j, Object obj)
	{
		if((j & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            10
			i = 8192;
	//    4    6:sipush          8192
	//    5    9:istore_1        
		if(outputstream instanceof BufferedOutputStream)
	//*   6   10:aload_0         
	//*   7   11:instanceof      #63  <Class BufferedOutputStream>
	//*   8   14:ifeq            22
			return (BufferedOutputStream)outputstream;
	//    9   17:aload_0         
	//   10   18:checkcast       #63  <Class BufferedOutputStream>
	//   11   21:areturn         
		else
			return new BufferedOutputStream(outputstream, i);
	//   12   22:new             #63  <Class BufferedOutputStream>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:iload_1         
	//   16   28:invokespecial   #66  <Method void BufferedOutputStream(OutputStream, int)>
	//   17   31:areturn         
	}

	private static final BufferedReader bufferedReader(InputStream inputstream, Charset charset)
	{
		inputstream = ((InputStream) ((Reader)new InputStreamReader(inputstream, charset)));
	//    0    0:new             #72  <Class InputStreamReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #75  <Method void InputStreamReader(InputStream, Charset)>
	//    5    9:checkcast       #77  <Class Reader>
	//    6   12:astore_0        
		if(inputstream instanceof BufferedReader)
	//*   7   13:aload_0         
	//*   8   14:instanceof      #79  <Class BufferedReader>
	//*   9   17:ifeq            25
			return (BufferedReader)inputstream;
	//   10   20:aload_0         
	//   11   21:checkcast       #79  <Class BufferedReader>
	//   12   24:areturn         
		else
			return new BufferedReader(((Reader) (inputstream)), 8192);
	//   13   25:new             #79  <Class BufferedReader>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:sipush          8192
	//   17   33:invokespecial   #82  <Method void BufferedReader(Reader, int)>
	//   18   36:areturn         
	}

	static BufferedReader bufferedReader$default(InputStream inputstream, Charset charset, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            10
			charset = Charsets.UTF_8;
	//    4    6:getstatic       #89  <Field Charset Charsets.UTF_8>
	//    5    9:astore_1        
		inputstream = ((InputStream) ((Reader)new InputStreamReader(inputstream, charset)));
	//    6   10:new             #72  <Class InputStreamReader>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #75  <Method void InputStreamReader(InputStream, Charset)>
	//   11   19:checkcast       #77  <Class Reader>
	//   12   22:astore_0        
		if(inputstream instanceof BufferedReader)
	//*  13   23:aload_0         
	//*  14   24:instanceof      #79  <Class BufferedReader>
	//*  15   27:ifeq            35
			return (BufferedReader)inputstream;
	//   16   30:aload_0         
	//   17   31:checkcast       #79  <Class BufferedReader>
	//   18   34:areturn         
		else
			return new BufferedReader(((Reader) (inputstream)), 8192);
	//   19   35:new             #79  <Class BufferedReader>
	//   20   38:dup             
	//   21   39:aload_0         
	//   22   40:sipush          8192
	//   23   43:invokespecial   #82  <Method void BufferedReader(Reader, int)>
	//   24   46:areturn         
	}

	private static final BufferedWriter bufferedWriter(OutputStream outputstream, Charset charset)
	{
		outputstream = ((OutputStream) ((Writer)new OutputStreamWriter(outputstream, charset)));
	//    0    0:new             #92  <Class OutputStreamWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #95  <Method void OutputStreamWriter(OutputStream, Charset)>
	//    5    9:checkcast       #97  <Class Writer>
	//    6   12:astore_0        
		if(outputstream instanceof BufferedWriter)
	//*   7   13:aload_0         
	//*   8   14:instanceof      #99  <Class BufferedWriter>
	//*   9   17:ifeq            25
			return (BufferedWriter)outputstream;
	//   10   20:aload_0         
	//   11   21:checkcast       #99  <Class BufferedWriter>
	//   12   24:areturn         
		else
			return new BufferedWriter(((Writer) (outputstream)), 8192);
	//   13   25:new             #99  <Class BufferedWriter>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:sipush          8192
	//   17   33:invokespecial   #102 <Method void BufferedWriter(Writer, int)>
	//   18   36:areturn         
	}

	static BufferedWriter bufferedWriter$default(OutputStream outputstream, Charset charset, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            10
			charset = Charsets.UTF_8;
	//    4    6:getstatic       #89  <Field Charset Charsets.UTF_8>
	//    5    9:astore_1        
		outputstream = ((OutputStream) ((Writer)new OutputStreamWriter(outputstream, charset)));
	//    6   10:new             #92  <Class OutputStreamWriter>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #95  <Method void OutputStreamWriter(OutputStream, Charset)>
	//   11   19:checkcast       #97  <Class Writer>
	//   12   22:astore_0        
		if(outputstream instanceof BufferedWriter)
	//*  13   23:aload_0         
	//*  14   24:instanceof      #99  <Class BufferedWriter>
	//*  15   27:ifeq            35
			return (BufferedWriter)outputstream;
	//   16   30:aload_0         
	//   17   31:checkcast       #99  <Class BufferedWriter>
	//   18   34:areturn         
		else
			return new BufferedWriter(((Writer) (outputstream)), 8192);
	//   19   35:new             #99  <Class BufferedWriter>
	//   20   38:dup             
	//   21   39:aload_0         
	//   22   40:sipush          8192
	//   23   43:invokespecial   #102 <Method void BufferedWriter(Writer, int)>
	//   24   46:areturn         
	}

	private static final ByteArrayInputStream byteInputStream(String s, Charset charset)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    2    4:new             #107 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #109 <String "null cannot be cast to non-null type java.lang.String">
	//    5   10:invokespecial   #112 <Method void TypeCastException(String)>
	//    6   13:athrow          
		} else
		{
			s = ((String) (s.getBytes(charset)));
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #118 <Method byte[] String.getBytes(Charset)>
	//   10   19:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.String).getBytes(charset)");
	//   11   20:aload_0         
	//   12   21:ldc1            #120 <String "(this as java.lang.String).getBytes(charset)">
	//   13   23:invokestatic    #126 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return new ByteArrayInputStream(((byte []) (s)));
	//   14   26:new             #128 <Class ByteArrayInputStream>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:invokespecial   #131 <Method void ByteArrayInputStream(byte[])>
	//   18   34:areturn         
		}
	}

	static ByteArrayInputStream byteInputStream$default(String s, Charset charset, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            10
			charset = Charsets.UTF_8;
	//    4    6:getstatic       #89  <Field Charset Charsets.UTF_8>
	//    5    9:astore_1        
		if(s == null)
	//*   6   10:aload_0         
	//*   7   11:ifnonnull       24
		{
			throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//    8   14:new             #107 <Class TypeCastException>
	//    9   17:dup             
	//   10   18:ldc1            #109 <String "null cannot be cast to non-null type java.lang.String">
	//   11   20:invokespecial   #112 <Method void TypeCastException(String)>
	//   12   23:athrow          
		} else
		{
			s = ((String) (s.getBytes(charset)));
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #118 <Method byte[] String.getBytes(Charset)>
	//   16   29:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.String).getBytes(charset)");
	//   17   30:aload_0         
	//   18   31:ldc1            #120 <String "(this as java.lang.String).getBytes(charset)">
	//   19   33:invokestatic    #126 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return new ByteArrayInputStream(((byte []) (s)));
	//   20   36:new             #128 <Class ByteArrayInputStream>
	//   21   39:dup             
	//   22   40:aload_0         
	//   23   41:invokespecial   #131 <Method void ByteArrayInputStream(byte[])>
	//   24   44:areturn         
		}
	}

	public static final long copyTo(InputStream inputstream, OutputStream outputstream, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (inputstream)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #136 <String "receiver$0">
	//    2    3:invokestatic    #139 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (outputstream)), "out");
	//    3    6:aload_1         
	//    4    7:ldc1            #140 <String "out">
	//    5    9:invokestatic    #139 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		byte abyte0[] = new byte[i];
	//    6   12:iload_2         
	//    7   13:newarray        byte[]
	//    8   15:astore          7
		i = inputstream.read(abyte0);
	//    9   17:aload_0         
	//   10   18:aload           7
	//   11   20:invokevirtual   #146 <Method int InputStream.read(byte[])>
	//   12   23:istore_2        
		long l;
		long l1;
		for(l = 0L; i >= 0; l += l1)
	//*  13   24:lconst_0        
	//*  14   25:lstore_3        
	//*  15   26:iload_2         
	//*  16   27:iflt            57
		{
			outputstream.write(abyte0, 0, i);
	//   17   30:aload_1         
	//   18   31:aload           7
	//   19   33:iconst_0        
	//   20   34:iload_2         
	//   21   35:invokevirtual   #152 <Method void OutputStream.write(byte[], int, int)>
			l1 = i;
	//   22   38:iload_2         
	//   23   39:i2l             
	//   24   40:lstore          5
			i = inputstream.read(abyte0);
	//   25   42:aload_0         
	//   26   43:aload           7
	//   27   45:invokevirtual   #146 <Method int InputStream.read(byte[])>
	//   28   48:istore_2        
		}

	//   29   49:lload_3         
	//   30   50:lload           5
	//   31   52:ladd            
	//   32   53:lstore_3        
	//*  33   54:goto            26
		return l;
	//   34   57:lload_3         
	//   35   58:lreturn         
	}

	public static long copyTo$default(InputStream inputstream, OutputStream outputstream, int i, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            10
			i = 8192;
	//    4    6:sipush          8192
	//    5    9:istore_2        
		return copyTo(inputstream, outputstream, i);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iload_2         
	//    9   13:invokestatic    #156 <Method long copyTo(InputStream, OutputStream, int)>
	//   10   16:lreturn         
	}

	private static final ByteArrayInputStream inputStream(byte abyte0[])
	{
		return new ByteArrayInputStream(abyte0);
	//    0    0:new             #128 <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #131 <Method void ByteArrayInputStream(byte[])>
	//    4    8:areturn         
	}

	private static final ByteArrayInputStream inputStream(byte abyte0[], int i, int j)
	{
		return new ByteArrayInputStream(abyte0, i, j);
	//    0    0:new             #128 <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #160 <Method void ByteArrayInputStream(byte[], int, int)>
	//    6   10:areturn         
	}

	public static final ByteIterator iterator(BufferedInputStream bufferedinputstream)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (bufferedinputstream)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #136 <String "receiver$0">
	//    2    3:invokestatic    #139 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
	/* block-local class not found */
	class iterator._cls1 {}

		return (ByteIterator)new iterator._cls1(bufferedinputstream);
	//    3    6:new             #163 <Class ByteStreamsKt$iterator$1>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:invokespecial   #166 <Method void ByteStreamsKt$iterator$1(BufferedInputStream)>
	//    7   14:checkcast       #168 <Class ByteIterator>
	//    8   17:areturn         
	}

	public static final byte[] readBytes(InputStream inputstream)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (inputstream)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #136 <String "receiver$0">
	//    2    3:invokestatic    #139 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(Math.max(8192, inputstream.available()));
	//    3    6:new             #174 <Class ByteArrayOutputStream>
	//    4    9:dup             
	//    5   10:sipush          8192
	//    6   13:aload_0         
	//    7   14:invokevirtual   #178 <Method int InputStream.available()>
	//    8   17:invokestatic    #184 <Method int Math.max(int, int)>
	//    9   20:invokespecial   #187 <Method void ByteArrayOutputStream(int)>
	//   10   23:astore_1        
		copyTo$default(inputstream, (OutputStream)bytearrayoutputstream, 0, 2, ((Object) (null)));
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:checkcast       #148 <Class OutputStream>
	//   14   29:iconst_0        
	//   15   30:iconst_2        
	//   16   31:aconst_null     
	//   17   32:invokestatic    #189 <Method long copyTo$default(InputStream, OutputStream, int, int, Object)>
	//   18   35:pop2            
		inputstream = ((InputStream) (bytearrayoutputstream.toByteArray()));
	//   19   36:aload_1         
	//   20   37:invokevirtual   #193 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   21   40:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (inputstream)), "buffer.toByteArray()");
	//   22   41:aload_0         
	//   23   42:ldc1            #195 <String "buffer.toByteArray()">
	//   24   44:invokestatic    #126 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((byte []) (inputstream));
	//   25   47:aload_0         
	//   26   48:areturn         
	}

	public static final byte[] readBytes(InputStream inputstream, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (inputstream)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #136 <String "receiver$0">
	//    2    3:invokestatic    #139 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(Math.max(i, inputstream.available()));
	//    3    6:new             #174 <Class ByteArrayOutputStream>
	//    4    9:dup             
	//    5   10:iload_1         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #178 <Method int InputStream.available()>
	//    8   15:invokestatic    #184 <Method int Math.max(int, int)>
	//    9   18:invokespecial   #187 <Method void ByteArrayOutputStream(int)>
	//   10   21:astore_2        
		copyTo$default(inputstream, (OutputStream)bytearrayoutputstream, 0, 2, ((Object) (null)));
	//   11   22:aload_0         
	//   12   23:aload_2         
	//   13   24:checkcast       #148 <Class OutputStream>
	//   14   27:iconst_0        
	//   15   28:iconst_2        
	//   16   29:aconst_null     
	//   17   30:invokestatic    #189 <Method long copyTo$default(InputStream, OutputStream, int, int, Object)>
	//   18   33:pop2            
		inputstream = ((InputStream) (bytearrayoutputstream.toByteArray()));
	//   19   34:aload_2         
	//   20   35:invokevirtual   #193 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   21   38:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (inputstream)), "buffer.toByteArray()");
	//   22   39:aload_0         
	//   23   40:ldc1            #195 <String "buffer.toByteArray()">
	//   24   42:invokestatic    #126 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((byte []) (inputstream));
	//   25   45:aload_0         
	//   26   46:areturn         
	}

	public static byte[] readBytes$default(InputStream inputstream, int i, int j, Object obj)
	{
		if((j & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            10
			i = 8192;
	//    4    6:sipush          8192
	//    5    9:istore_1        
		return readBytes(inputstream, i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokestatic    #209 <Method byte[] readBytes(InputStream, int)>
	//    9   15:areturn         
	}

	private static final InputStreamReader reader(InputStream inputstream, Charset charset)
	{
		return new InputStreamReader(inputstream, charset);
	//    0    0:new             #72  <Class InputStreamReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #75  <Method void InputStreamReader(InputStream, Charset)>
	//    5    9:areturn         
	}

	static InputStreamReader reader$default(InputStream inputstream, Charset charset, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            10
			charset = Charsets.UTF_8;
	//    4    6:getstatic       #89  <Field Charset Charsets.UTF_8>
	//    5    9:astore_1        
		return new InputStreamReader(inputstream, charset);
	//    6   10:new             #72  <Class InputStreamReader>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #75  <Method void InputStreamReader(InputStream, Charset)>
	//   11   19:areturn         
	}

	private static final OutputStreamWriter writer(OutputStream outputstream, Charset charset)
	{
		return new OutputStreamWriter(outputstream, charset);
	//    0    0:new             #92  <Class OutputStreamWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #95  <Method void OutputStreamWriter(OutputStream, Charset)>
	//    5    9:areturn         
	}

	static OutputStreamWriter writer$default(OutputStream outputstream, Charset charset, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            10
			charset = Charsets.UTF_8;
	//    4    6:getstatic       #89  <Field Charset Charsets.UTF_8>
	//    5    9:astore_1        
		return new OutputStreamWriter(outputstream, charset);
	//    6   10:new             #92  <Class OutputStreamWriter>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #95  <Method void OutputStreamWriter(OutputStream, Charset)>
	//   11   19:areturn         
	}
}
