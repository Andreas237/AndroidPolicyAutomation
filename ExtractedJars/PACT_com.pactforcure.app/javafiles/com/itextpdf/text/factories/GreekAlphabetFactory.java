// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.factories;

import com.itextpdf.text.SpecialSymbol;

public class GreekAlphabetFactory
{

	public GreekAlphabetFactory()
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
		return getString(i, true);
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #17  <Method String getString(int, boolean)>
	//    3    5:areturn         
	}

	public static final String getString(int i, boolean flag)
	{
		if(i < 1)
	//*   0    0:iload_0         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          8
			return "";
	//    3    5:ldc1            #19  <String "">
	//    4    7:areturn         
		int j1 = i - 1;
	//    5    8:iload_0         
	//    6    9:iconst_1        
	//    7   10:isub            
	//    8   11:istore          4
		i = 1;
	//    9   13:iconst_1        
	//   10   14:istore_0        
		int l = 0;
	//   11   15:iconst_0        
	//   12   16:istore_3        
		for(int j = 24; j1 >= j + l; j *= 24)
	//*  13   17:bipush          24
	//*  14   19:istore_2        
	//*  15   20:iload           4
	//*  16   22:iload_2         
	//*  17   23:iload_3         
	//*  18   24:iadd            
	//*  19   25:icmplt          44
		{
			i++;
	//   20   28:iload_0         
	//   21   29:iconst_1        
	//   22   30:iadd            
	//   23   31:istore_0        
			l += j;
	//   24   32:iload_3         
	//   25   33:iload_2         
	//   26   34:iadd            
	//   27   35:istore_3        
		}

	//   28   36:iload_2         
	//   29   37:bipush          24
	//   30   39:imul            
	//   31   40:istore_2        
	//*  32   41:goto            20
		int k = j1 - l;
	//   33   44:iload           4
	//   34   46:iload_3         
	//   35   47:isub            
	//   36   48:istore_2        
		char ac[] = new char[i];
	//   37   49:iload_0         
	//   38   50:newarray        char[]
	//   39   52:astore          5
		while(i > 0) 
	//*  40   54:iload_0         
	//*  41   55:ifle            142
		{
			int i1 = i - 1;
	//   42   58:iload_0         
	//   43   59:iconst_1        
	//   44   60:isub            
	//   45   61:istore_3        
			ac[i1] = (char)(k % 24);
	//   46   62:aload           5
	//   47   64:iload_3         
	//   48   65:iload_2         
	//   49   66:bipush          24
	//   50   68:irem            
	//   51   69:int2char        
	//   52   70:castore         
			if(ac[i1] > '\020')
	//*  53   71:aload           5
	//*  54   73:iload_3         
	//*  55   74:caload          
	//*  56   75:bipush          16
	//*  57   77:icmple          91
				ac[i1] = (char)(ac[i1] + 1);
	//   58   80:aload           5
	//   59   82:iload_3         
	//   60   83:aload           5
	//   61   85:iload_3         
	//   62   86:caload          
	//   63   87:iconst_1        
	//   64   88:iadd            
	//   65   89:int2char        
	//   66   90:castore         
			char c = ac[i1];
	//   67   91:aload           5
	//   68   93:iload_3         
	//   69   94:caload          
	//   70   95:istore          4
			if(flag)
	//*  71   97:iload_1         
	//*  72   98:ifeq            135
				i = 945;
	//   73  101:sipush          945
	//   74  104:istore_0        
			else
	//*  75  105:aload           5
	//*  76  107:iload_3         
	//*  77  108:iload_0         
	//*  78  109:iload           4
	//*  79  111:iadd            
	//*  80  112:int2char        
	//*  81  113:castore         
	//*  82  114:aload           5
	//*  83  116:iload_3         
	//*  84  117:aload           5
	//*  85  119:iload_3         
	//*  86  120:caload          
	//*  87  121:invokestatic    #25  <Method char SpecialSymbol.getCorrespondingSymbol(char)>
	//*  88  124:castore         
	//*  89  125:iload_2         
	//*  90  126:bipush          24
	//*  91  128:idiv            
	//*  92  129:istore_2        
	//*  93  130:iload_3         
	//*  94  131:istore_0        
	//*  95  132:goto            54
				i = 913;
	//   96  135:sipush          913
	//   97  138:istore_0        
			ac[i1] = (char)(i + c);
			ac[i1] = SpecialSymbol.getCorrespondingSymbol(ac[i1]);
			k /= 24;
			i = i1;
		}
	//*  98  139:goto            105
		return String.valueOf(ac);
	//   99  142:aload           5
	//  100  144:invokestatic    #31  <Method String String.valueOf(char[])>
	//  101  147:areturn         
	}

	public static final String getUpperCaseString(int i)
	{
		return getString(i).toUpperCase();
	//    0    0:iload_0         
	//    1    1:invokestatic    #14  <Method String getString(int)>
	//    2    4:invokevirtual   #36  <Method String String.toUpperCase()>
	//    3    7:areturn         
	}
}
