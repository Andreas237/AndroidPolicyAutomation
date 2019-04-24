// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.factories;

import com.itextpdf.text.error_messages.MessageLocalization;

public class RomanAlphabetFactory
{

	public RomanAlphabetFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static final String getLowerCaseString(int i)
	{
		return getString(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #14  <Method String getString(int)>
	//    2    4:areturn         
	}

	public static final String getString(int i)
	{
		if(i < 1)
	//*   0    0:iload_0         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          22
			throw new NumberFormatException(MessageLocalization.getComposedMessage("you.can.t.translate.a.negative.number.into.an.alphabetical.value", new Object[0]));
	//    3    5:new             #16  <Class NumberFormatException>
	//    4    8:dup             
	//    5    9:ldc1            #18  <String "you.can.t.translate.a.negative.number.into.an.alphabetical.value">
	//    6   11:iconst_0        
	//    7   12:anewarray       Object[]
	//    8   15:invokestatic    #24  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   18:invokespecial   #27  <Method void NumberFormatException(String)>
	//   10   21:athrow          
		int i1 = i - 1;
	//   11   22:iload_0         
	//   12   23:iconst_1        
	//   13   24:isub            
	//   14   25:istore_3        
		i = 1;
	//   15   26:iconst_1        
	//   16   27:istore_0        
		int l = 0;
	//   17   28:iconst_0        
	//   18   29:istore_2        
		for(int j = 26; i1 >= j + l; j *= 26)
	//*  19   30:bipush          26
	//*  20   32:istore_1        
	//*  21   33:iload_3         
	//*  22   34:iload_1         
	//*  23   35:iload_2         
	//*  24   36:iadd            
	//*  25   37:icmplt          56
		{
			i++;
	//   26   40:iload_0         
	//   27   41:iconst_1        
	//   28   42:iadd            
	//   29   43:istore_0        
			l += j;
	//   30   44:iload_2         
	//   31   45:iload_1         
	//   32   46:iadd            
	//   33   47:istore_2        
		}

	//   34   48:iload_1         
	//   35   49:bipush          26
	//   36   51:imul            
	//   37   52:istore_1        
	//*  38   53:goto            33
		int k = i1 - l;
	//   39   56:iload_3         
	//   40   57:iload_2         
	//   41   58:isub            
	//   42   59:istore_1        
		char ac[] = new char[i];
	//   43   60:iload_0         
	//   44   61:newarray        char[]
	//   45   63:astore          4
		while(i > 0) 
	//*  46   65:iload_0         
	//*  47   66:ifle            93
		{
			i--;
	//   48   69:iload_0         
	//   49   70:iconst_1        
	//   50   71:isub            
	//   51   72:istore_0        
			ac[i] = (char)(k % 26 + 97);
	//   52   73:aload           4
	//   53   75:iload_0         
	//   54   76:iload_1         
	//   55   77:bipush          26
	//   56   79:irem            
	//   57   80:bipush          97
	//   58   82:iadd            
	//   59   83:int2char        
	//   60   84:castore         
			k /= 26;
	//   61   85:iload_1         
	//   62   86:bipush          26
	//   63   88:idiv            
	//   64   89:istore_1        
		}
	//*  65   90:goto            65
		return new String(ac);
	//   66   93:new             #29  <Class String>
	//   67   96:dup             
	//   68   97:aload           4
	//   69   99:invokespecial   #32  <Method void String(char[])>
	//   70  102:areturn         
	}

	public static final String getString(int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			return getLowerCaseString(i);
	//    2    4:iload_0         
	//    3    5:invokestatic    #35  <Method String getLowerCaseString(int)>
	//    4    8:areturn         
		else
			return getUpperCaseString(i);
	//    5    9:iload_0         
	//    6   10:invokestatic    #38  <Method String getUpperCaseString(int)>
	//    7   13:areturn         
	}

	public static final String getUpperCaseString(int i)
	{
		return getString(i).toUpperCase();
	//    0    0:iload_0         
	//    1    1:invokestatic    #14  <Method String getString(int)>
	//    2    4:invokevirtual   #42  <Method String String.toUpperCase()>
	//    3    7:areturn         
	}
}
