// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class MessageLengthT
{

	public MessageLengthT(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		mPayloadOffset = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #14  <Field int mPayloadOffset>
		mPayloadLength = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #16  <Field int mPayloadLength>
	//    8   14:return          
	}

	public int getPayloadLength()
	{
		return mPayloadLength;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int mPayloadLength>
	//    2    4:ireturn         
	}

	public int getPayloadOffset()
	{
		return mPayloadOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field int mPayloadOffset>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #24  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MessageLengthT{mPayloadOffset=");
	//    4    8:aload_1         
	//    5    9:ldc1            #27  <String "MessageLengthT{mPayloadOffset=">
	//    6   11:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mPayloadOffset);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #14  <Field int mPayloadOffset>
	//   11   20:invokevirtual   #34  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(",mPayloadLength=");
	//   13   24:aload_1         
	//   14   25:ldc1            #36  <String ",mPayloadLength=">
	//   15   27:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mPayloadLength);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #16  <Field int mPayloadLength>
	//   20   36:invokevirtual   #34  <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append("}");
	//   22   40:aload_1         
	//   23   41:ldc1            #38  <String "}">
	//   24   43:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	final int mPayloadLength;
	final int mPayloadOffset;
}
