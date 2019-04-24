// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.hyphenation;

import java.io.Serializable;

public class Hyphen
	implements Serializable
{

	Hyphen(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		preBreak = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field String preBreak>
		noBreak = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #23  <Field String noBreak>
		postBreak = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #25  <Field String postBreak>
	//   11   19:return          
	}

	Hyphen(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		preBreak = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field String preBreak>
		noBreak = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field String noBreak>
		postBreak = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field String postBreak>
	//   11   19:return          
	}

	public String toString()
	{
		if(noBreak == null && postBreak == null && preBreak != null && preBreak.equals("-"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field String noBreak>
	//*   2    4:ifnonnull       36
	//*   3    7:aload_0         
	//*   4    8:getfield        #25  <Field String postBreak>
	//*   5   11:ifnonnull       36
	//*   6   14:aload_0         
	//*   7   15:getfield        #21  <Field String preBreak>
	//*   8   18:ifnull          36
	//*   9   21:aload_0         
	//*  10   22:getfield        #21  <Field String preBreak>
	//*  11   25:ldc1            #31  <String "-">
	//*  12   27:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  13   30:ifeq            36
		{
			return "-";
	//   14   33:ldc1            #31  <String "-">
	//   15   35:areturn         
		} else
		{
			StringBuffer stringbuffer = new StringBuffer("{");
	//   16   36:new             #39  <Class StringBuffer>
	//   17   39:dup             
	//   18   40:ldc1            #41  <String "{">
	//   19   42:invokespecial   #43  <Method void StringBuffer(String)>
	//   20   45:astore_1        
			stringbuffer.append(preBreak);
	//   21   46:aload_1         
	//   22   47:aload_0         
	//   23   48:getfield        #21  <Field String preBreak>
	//   24   51:invokevirtual   #47  <Method StringBuffer StringBuffer.append(String)>
	//   25   54:pop             
			stringbuffer.append("}{");
	//   26   55:aload_1         
	//   27   56:ldc1            #49  <String "}{">
	//   28   58:invokevirtual   #47  <Method StringBuffer StringBuffer.append(String)>
	//   29   61:pop             
			stringbuffer.append(postBreak);
	//   30   62:aload_1         
	//   31   63:aload_0         
	//   32   64:getfield        #25  <Field String postBreak>
	//   33   67:invokevirtual   #47  <Method StringBuffer StringBuffer.append(String)>
	//   34   70:pop             
			stringbuffer.append("}{");
	//   35   71:aload_1         
	//   36   72:ldc1            #49  <String "}{">
	//   37   74:invokevirtual   #47  <Method StringBuffer StringBuffer.append(String)>
	//   38   77:pop             
			stringbuffer.append(noBreak);
	//   39   78:aload_1         
	//   40   79:aload_0         
	//   41   80:getfield        #23  <Field String noBreak>
	//   42   83:invokevirtual   #47  <Method StringBuffer StringBuffer.append(String)>
	//   43   86:pop             
			stringbuffer.append('}');
	//   44   87:aload_1         
	//   45   88:bipush          125
	//   46   90:invokevirtual   #52  <Method StringBuffer StringBuffer.append(char)>
	//   47   93:pop             
			return stringbuffer.toString();
	//   48   94:aload_1         
	//   49   95:invokevirtual   #54  <Method String StringBuffer.toString()>
	//   50   98:areturn         
		}
	}

	private static final long serialVersionUID = 0xabeaf049L;
	public String noBreak;
	public String postBreak;
	public String preBreak;
}
