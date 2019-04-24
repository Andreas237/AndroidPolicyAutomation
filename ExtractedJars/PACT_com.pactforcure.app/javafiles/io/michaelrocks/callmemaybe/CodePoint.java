// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.callmemaybe;


class CodePoint
{

	private CodePoint()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static char toDigitChar(int i)
	{
		if(Character.charCount(i) != 1)
	//*   0    0:iload_0         
	//*   1    1:invokestatic    #23  <Method int Character.charCount(int)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          23
	//*   4    8:iload_0         
	//*   5    9:getstatic       #11  <Field char[] chars>
	//*   6   12:iconst_0        
	//*   7   13:invokestatic    #27  <Method int Character.toChars(int, char[], int)>
	//*   8   16:pop             
	//*   9   17:getstatic       #11  <Field char[] chars>
	//*  10   20:iconst_0        
	//*  11   21:caload          
	//*  12   22:ireturn         
			i = Character.digit(i, 10);
	//   13   23:iload_0         
	//   14   24:bipush          10
	//   15   26:invokestatic    #31  <Method int Character.digit(int, int)>
	//   16   29:istore_0        
		Character.toChars(i, chars, 0);
		return chars[0];
	//*  17   30:goto            8
	}

	private static final char chars[] = {
		'\0', '\0'
	};

	static 
	{
	//    0    0:iconst_2        
	//    1    1:newarray        char[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #9   <Int 0>
	//    5    7:castore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #9   <Int 0>
	//    9   12:castore         
	//   10   13:putstatic       #11  <Field char[] chars>
	//*  11   16:return          
	}
}
