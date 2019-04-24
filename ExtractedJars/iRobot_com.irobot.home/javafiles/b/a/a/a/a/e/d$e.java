// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package b.a.a.a.a.e;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

// Referenced classes of package b.a.a.a.a.e:
//			d

public static class d$e extends BufferedOutputStream
{

	public d$e a(String s)
	{
		s = ((String) (a.encode(CharBuffer.wrap(((CharSequence) (s))))));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field CharsetEncoder a>
	//    2    4:aload_1         
	//    3    5:invokestatic    #37  <Method CharBuffer CharBuffer.wrap(CharSequence)>
	//    4    8:invokevirtual   #43  <Method ByteBuffer CharsetEncoder.encode(CharBuffer)>
	//    5   11:astore_1        
		super.write(((ByteBuffer) (s)).array(), 0, ((ByteBuffer) (s)).limit());
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #49  <Method byte[] ByteBuffer.array()>
	//    9   17:iconst_0        
	//   10   18:aload_1         
	//   11   19:invokevirtual   #53  <Method int ByteBuffer.limit()>
	//   12   22:invokespecial   #57  <Method void BufferedOutputStream.write(byte[], int, int)>
		return this;
	//   13   25:aload_0         
	//   14   26:areturn         
	}

	private final CharsetEncoder a;

	public d$e(OutputStream outputstream, String s, int i)
	{
		super(outputstream, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_3         
	//    3    3:invokespecial   #14  <Method void BufferedOutputStream(OutputStream, int)>
		a = Charset.forName(d.e(s)).newEncoder();
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokestatic    #17  <Method String d.e(String)>
	//    7   11:invokestatic    #23  <Method Charset Charset.forName(String)>
	//    8   14:invokevirtual   #27  <Method CharsetEncoder Charset.newEncoder()>
	//    9   17:putfield        #29  <Field CharsetEncoder a>
	//   10   20:return          
	}
}
