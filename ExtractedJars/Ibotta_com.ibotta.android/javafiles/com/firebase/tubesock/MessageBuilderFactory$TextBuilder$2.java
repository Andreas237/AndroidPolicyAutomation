// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.tubesock;

import java.nio.charset.*;

// Referenced classes of package com.firebase.tubesock:
//			MessageBuilderFactory

static final class MessageBuilderFactory$TextBuilder$2 extends ThreadLocal
{

	protected volatile Object initialValue()
	{
		return ((Object) (initialValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method CharsetEncoder initialValue()>
	//    2    4:areturn         
	}

	protected CharsetEncoder initialValue()
	{
		CharsetEncoder charsetencoder = Charset.forName("UTF8").newEncoder();
	//    0    0:ldc1            #22  <String "UTF8">
	//    1    2:invokestatic    #28  <Method Charset Charset.forName(String)>
	//    2    5:invokevirtual   #31  <Method CharsetEncoder Charset.newEncoder()>
	//    3    8:astore_1        
		charsetencoder.onMalformedInput(CodingErrorAction.REPORT);
	//    4    9:aload_1         
	//    5   10:getstatic       #37  <Field CodingErrorAction CodingErrorAction.REPORT>
	//    6   13:invokevirtual   #43  <Method CharsetEncoder CharsetEncoder.onMalformedInput(CodingErrorAction)>
	//    7   16:pop             
		charsetencoder.onUnmappableCharacter(CodingErrorAction.REPORT);
	//    8   17:aload_1         
	//    9   18:getstatic       #37  <Field CodingErrorAction CodingErrorAction.REPORT>
	//   10   21:invokevirtual   #46  <Method CharsetEncoder CharsetEncoder.onUnmappableCharacter(CodingErrorAction)>
	//   11   24:pop             
		return charsetencoder;
	//   12   25:aload_1         
	//   13   26:areturn         
	}

	MessageBuilderFactory$TextBuilder$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ThreadLocal()>
	//    2    4:return          
	}
}
