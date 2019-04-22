// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.tubesock;


public class WebSocketMessage
{

	public WebSocketMessage(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		stringMessage = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String stringMessage>
		opcode = 1;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #19  <Field byte opcode>
	//    8   14:return          
	}

	public WebSocketMessage(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		byteMessage = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field byte[] byteMessage>
		opcode = 2;
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:putfield        #19  <Field byte opcode>
	//    8   14:return          
	}

	public byte[] getBytes()
	{
		return byteMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field byte[] byteMessage>
	//    2    4:areturn         
	}

	public String getText()
	{
		return stringMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String stringMessage>
	//    2    4:areturn         
	}

	public boolean isBinary()
	{
		return opcode == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field byte opcode>
	//    2    4:iconst_2        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isText()
	{
		return opcode == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field byte opcode>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private byte byteMessage[];
	private byte opcode;
	private String stringMessage;
}
