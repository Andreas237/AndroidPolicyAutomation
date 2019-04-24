// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.hyphenation;


public class Hyphenation
{

	public Hyphenation(String s, int ai[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		word = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String word>
		hyphenPoints = ai;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field int[] hyphenPoints>
		len = ai.length;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:arraylength     
	//   11   17:putfield        #21  <Field int len>
	//   12   20:return          
	}

	public int[] getHyphenationPoints()
	{
		return hyphenPoints;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int[] hyphenPoints>
	//    2    4:areturn         
	}

	public String getPostHyphenText(int i)
	{
		return word.substring(hyphenPoints[i]);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String word>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field int[] hyphenPoints>
	//    4    8:iload_1         
	//    5    9:iaload          
	//    6   10:invokevirtual   #31  <Method String String.substring(int)>
	//    7   13:areturn         
	}

	public String getPreHyphenText(int i)
	{
		return word.substring(0, hyphenPoints[i]);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String word>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field int[] hyphenPoints>
	//    5    9:iload_1         
	//    6   10:iaload          
	//    7   11:invokevirtual   #35  <Method String String.substring(int, int)>
	//    8   14:areturn         
	}

	public int length()
	{
		return len;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int len>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #41  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void StringBuffer()>
	//    3    7:astore_3        
		int j = 0;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		for(int i = 0; i < len; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:aload_0         
	//*  10   14:getfield        #21  <Field int len>
	//*  11   17:icmpge          58
		{
			stringbuffer.append(word.substring(j, hyphenPoints[i])).append('-');
	//   12   20:aload_3         
	//   13   21:aload_0         
	//   14   22:getfield        #17  <Field String word>
	//   15   25:iload_2         
	//   16   26:aload_0         
	//   17   27:getfield        #19  <Field int[] hyphenPoints>
	//   18   30:iload_1         
	//   19   31:iaload          
	//   20   32:invokevirtual   #35  <Method String String.substring(int, int)>
	//   21   35:invokevirtual   #46  <Method StringBuffer StringBuffer.append(String)>
	//   22   38:bipush          45
	//   23   40:invokevirtual   #49  <Method StringBuffer StringBuffer.append(char)>
	//   24   43:pop             
			j = hyphenPoints[i];
	//   25   44:aload_0         
	//   26   45:getfield        #19  <Field int[] hyphenPoints>
	//   27   48:iload_1         
	//   28   49:iaload          
	//   29   50:istore_2        
		}

	//   30   51:iload_1         
	//   31   52:iconst_1        
	//   32   53:iadd            
	//   33   54:istore_1        
	//*  34   55:goto            12
		stringbuffer.append(word.substring(j));
	//   35   58:aload_3         
	//   36   59:aload_0         
	//   37   60:getfield        #17  <Field String word>
	//   38   63:iload_2         
	//   39   64:invokevirtual   #31  <Method String String.substring(int)>
	//   40   67:invokevirtual   #46  <Method StringBuffer StringBuffer.append(String)>
	//   41   70:pop             
		return stringbuffer.toString();
	//   42   71:aload_3         
	//   43   72:invokevirtual   #51  <Method String StringBuffer.toString()>
	//   44   75:areturn         
	}

	private int hyphenPoints[];
	private int len;
	private String word;
}
