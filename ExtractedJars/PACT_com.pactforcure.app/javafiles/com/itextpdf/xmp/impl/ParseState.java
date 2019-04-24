// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.XMPException;

class ParseState
{

	public ParseState(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		pos = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #15  <Field int pos>
		str = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #17  <Field String str>
	//    8   14:return          
	}

	public char ch()
	{
		if(pos < str.length())
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field int pos>
	//*   2    4:aload_0         
	//*   3    5:getfield        #17  <Field String str>
	//*   4    8:invokevirtual   #26  <Method int String.length()>
	//*   5   11:icmpge          26
			return str.charAt(pos);
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field String str>
	//    8   18:aload_0         
	//    9   19:getfield        #15  <Field int pos>
	//   10   22:invokevirtual   #30  <Method char String.charAt(int)>
	//   11   25:ireturn         
		else
			return '\0';
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public char ch(int i)
	{
		if(i < str.length())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #17  <Field String str>
	//*   3    5:invokevirtual   #26  <Method int String.length()>
	//*   4    8:icmpge          20
			return str.charAt(i);
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field String str>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #30  <Method char String.charAt(int)>
	//    9   19:ireturn         
		else
			return '\0';
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public int gatherInt(String s, int i)
		throws XMPException
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		boolean flag = false;
	//    2    3:iconst_0        
	//    3    4:istore          4
		for(char c = ch(pos); '0' <= c && c <= '9'; c = ch(pos))
	//*   4    6:aload_0         
	//*   5    7:aload_0         
	//*   6    8:getfield        #15  <Field int pos>
	//*   7   11:invokevirtual   #36  <Method char ch(int)>
	//*   8   14:istore_3        
	//*   9   15:bipush          48
	//*  10   17:iload_3         
	//*  11   18:icmpgt          64
	//*  12   21:iload_3         
	//*  13   22:bipush          57
	//*  14   24:icmpgt          64
		{
			j = j * 10 + (c - 48);
	//   15   27:iload           5
	//   16   29:bipush          10
	//   17   31:imul            
	//   18   32:iload_3         
	//   19   33:bipush          48
	//   20   35:isub            
	//   21   36:iadd            
	//   22   37:istore          5
			flag = true;
	//   23   39:iconst_1        
	//   24   40:istore          4
			pos = pos + 1;
	//   25   42:aload_0         
	//   26   43:aload_0         
	//   27   44:getfield        #15  <Field int pos>
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:putfield        #15  <Field int pos>
		}

	//   31   52:aload_0         
	//   32   53:aload_0         
	//   33   54:getfield        #15  <Field int pos>
	//   34   57:invokevirtual   #36  <Method char ch(int)>
	//   35   60:istore_3        
	//*  36   61:goto            15
		if(flag)
	//*  37   64:iload           4
	//*  38   66:ifeq            87
		{
			if(j > i)
	//*  39   69:iload           5
	//*  40   71:iload_2         
	//*  41   72:icmple          77
				return i;
	//   42   75:iload_2         
	//   43   76:ireturn         
			if(j < 0)
	//*  44   77:iload           5
	//*  45   79:ifge            84
				return 0;
	//   46   82:iconst_0        
	//   47   83:ireturn         
			else
				return j;
	//   48   84:iload           5
	//   49   86:ireturn         
		} else
		{
			throw new XMPException(s, 5);
	//   50   87:new             #34  <Class XMPException>
	//   51   90:dup             
	//   52   91:aload_1         
	//   53   92:iconst_5        
	//   54   93:invokespecial   #39  <Method void XMPException(String, int)>
	//   55   96:athrow          
		}
	}

	public boolean hasNext()
	{
		return pos < str.length();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int pos>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field String str>
	//    4    8:invokevirtual   #26  <Method int String.length()>
	//    5   11:icmpge          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public int length()
	{
		return str.length();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String str>
	//    2    4:invokevirtual   #26  <Method int String.length()>
	//    3    7:ireturn         
	}

	public int pos()
	{
		return pos;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int pos>
	//    2    4:ireturn         
	}

	public void skip()
	{
		pos = pos + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field int pos>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #15  <Field int pos>
	//    6   10:return          
	}

	private int pos;
	private String str;
}
