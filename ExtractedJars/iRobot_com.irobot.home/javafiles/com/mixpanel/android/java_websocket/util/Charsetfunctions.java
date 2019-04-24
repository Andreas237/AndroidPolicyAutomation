// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.java_websocket.util;

import com.mixpanel.android.java_websocket.c.b;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.*;

public class Charsetfunctions
{

	public Charsetfunctions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public static String a(ByteBuffer bytebuffer)
	{
		Object obj = ((Object) (Charset.forName("UTF8").newDecoder()));
	//    0    0:ldc1            #24  <String "UTF8">
	//    1    2:invokestatic    #30  <Method Charset Charset.forName(String)>
	//    2    5:invokevirtual   #34  <Method CharsetDecoder Charset.newDecoder()>
	//    3    8:astore_1        
		((CharsetDecoder) (obj)).onMalformedInput(a);
	//    4    9:aload_1         
	//    5   10:getstatic       #15  <Field CodingErrorAction a>
	//    6   13:invokevirtual   #40  <Method CharsetDecoder CharsetDecoder.onMalformedInput(CodingErrorAction)>
	//    7   16:pop             
		((CharsetDecoder) (obj)).onUnmappableCharacter(a);
	//    8   17:aload_1         
	//    9   18:getstatic       #15  <Field CodingErrorAction a>
	//   10   21:invokevirtual   #43  <Method CharsetDecoder CharsetDecoder.onUnmappableCharacter(CodingErrorAction)>
	//   11   24:pop             
		try
		{
			bytebuffer.mark();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #49  <Method java.nio.Buffer ByteBuffer.mark()>
	//   14   29:pop             
			obj = ((Object) (((CharsetDecoder) (obj)).decode(bytebuffer).toString()));
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:invokevirtual   #53  <Method CharBuffer CharsetDecoder.decode(ByteBuffer)>
	//   18   35:invokevirtual   #59  <Method String CharBuffer.toString()>
	//   19   38:astore_1        
			bytebuffer.reset();
	//   20   39:aload_0         
	//   21   40:invokevirtual   #62  <Method java.nio.Buffer ByteBuffer.reset()>
	//   22   43:pop             
		}
	//*  23   44:aload_1         
	//*  24   45:areturn         
		// Misplaced declaration of an exception variable
		catch(ByteBuffer bytebuffer)
	//*  25   46:astore_0        
		{
			throw new b(1007, ((Throwable) (bytebuffer)));
	//   26   47:new             #64  <Class b>
	//   27   50:dup             
	//   28   51:sipush          1007
	//   29   54:aload_0         
	//   30   55:invokespecial   #67  <Method void b(int, Throwable)>
	//   31   58:athrow          
		}
		return ((String) (obj));
	}

	public static String a(byte abyte0[])
	{
		return a(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #71  <Method String a(byte[], int, int)>
	//    5    7:areturn         
	}

	public static String a(byte abyte0[], int i, int j)
	{
		try
		{
			abyte0 = ((byte []) (new String(abyte0, i, j, "ASCII")));
	//    0    0:new             #75  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:ldc1            #77  <String "ASCII">
	//    6    9:invokespecial   #80  <Method void String(byte[], int, int, String)>
	//    7   12:astore_0        
		}
	//*   8   13:aload_0         
	//*   9   14:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  10   15:astore_0        
		{
			throw new RuntimeException(((Throwable) (abyte0)));
	//   11   16:new             #82  <Class RuntimeException>
	//   12   19:dup             
	//   13   20:aload_0         
	//   14   21:invokespecial   #85  <Method void RuntimeException(Throwable)>
	//   15   24:athrow          
		}
		return ((String) (abyte0));
	}

	public static byte[] a(String s)
	{
		try
		{
			s = ((String) (s.getBytes("UTF8")));
	//    0    0:aload_0         
	//    1    1:ldc1            #24  <String "UTF8">
	//    2    3:invokevirtual   #89  <Method byte[] String.getBytes(String)>
	//    3    6:astore_0        
		}
	//*   4    7:aload_0         
	//*   5    8:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6    9:astore_0        
		{
			throw new RuntimeException(((Throwable) (s)));
	//    7   10:new             #82  <Class RuntimeException>
	//    8   13:dup             
	//    9   14:aload_0         
	//   10   15:invokespecial   #85  <Method void RuntimeException(Throwable)>
	//   11   18:athrow          
		}
		return ((byte []) (s));
	}

	public static String b(byte abyte0[])
	{
		return a(ByteBuffer.wrap(abyte0));
	//    0    0:aload_0         
	//    1    1:invokestatic    #94  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    2    4:invokestatic    #96  <Method String a(ByteBuffer)>
	//    3    7:areturn         
	}

	public static byte[] b(String s)
	{
		try
		{
			s = ((String) (s.getBytes("ASCII")));
	//    0    0:aload_0         
	//    1    1:ldc1            #77  <String "ASCII">
	//    2    3:invokevirtual   #89  <Method byte[] String.getBytes(String)>
	//    3    6:astore_0        
		}
	//*   4    7:aload_0         
	//*   5    8:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6    9:astore_0        
		{
			throw new RuntimeException(((Throwable) (s)));
	//    7   10:new             #82  <Class RuntimeException>
	//    8   13:dup             
	//    9   14:aload_0         
	//   10   15:invokespecial   #85  <Method void RuntimeException(Throwable)>
	//   11   18:athrow          
		}
		return ((byte []) (s));
	}

	public static void main(String args[])
	{
		b(a("\0"));
	//    0    0:ldc1            #100 <String "\0">
	//    1    2:invokestatic    #102 <Method byte[] a(String)>
	//    2    5:invokestatic    #104 <Method String b(byte[])>
	//    3    8:pop             
		a(b("\0"));
	//    4    9:ldc1            #100 <String "\0">
	//    5   11:invokestatic    #106 <Method byte[] b(String)>
	//    6   14:invokestatic    #108 <Method String a(byte[])>
	//    7   17:pop             
	//    8   18:return          
	}

	public static CodingErrorAction a;

	static 
	{
		a = CodingErrorAction.REPORT;
	//    0    0:getstatic       #13  <Field CodingErrorAction CodingErrorAction.REPORT>
	//    1    3:putstatic       #15  <Field CodingErrorAction a>
	//*   2    6:return          
	}
}
