// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.encoder;

import ch.qos.logback.core.CoreConstants;
import java.io.OutputStream;

// Referenced classes of package ch.qos.logback.core.encoder:
//			EncoderBase

public class EchoEncoder extends EncoderBase
{

	public EchoEncoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void EncoderBase()>
	//    2    4:return          
	}

	public void close()
	{
	//    0    0:return          
	}

	public void doEncode(Object obj)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #15  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(obj);
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #20  <Method StringBuilder StringBuilder.append(Object)>
	//    7   13:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//    8   14:aload_2         
	//    9   15:getstatic       #26  <Field String CoreConstants.LINE_SEPARATOR>
	//   10   18:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		obj = ((Object) (stringbuilder.toString()));
	//   12   22:aload_2         
	//   13   23:invokevirtual   #33  <Method String StringBuilder.toString()>
	//   14   26:astore_1        
		outputStream.write(((String) (obj)).getBytes());
	//   15   27:aload_0         
	//   16   28:getfield        #37  <Field OutputStream outputStream>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #43  <Method byte[] String.getBytes()>
	//   19   35:invokevirtual   #49  <Method void OutputStream.write(byte[])>
		outputStream.flush();
	//   20   38:aload_0         
	//   21   39:getfield        #37  <Field OutputStream outputStream>
	//   22   42:invokevirtual   #52  <Method void OutputStream.flush()>
	//   23   45:return          
	}

	public void init(OutputStream outputstream)
	{
		super.init(outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #58  <Method void EncoderBase.init(OutputStream)>
	//    3    5:return          
	}
}
