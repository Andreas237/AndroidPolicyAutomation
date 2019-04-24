// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.text.InputFilter;
import android.text.Spanned;

// Referenced classes of package com.irobot.home.view:
//			CustomEditTextNoEmoji

private class CustomEditTextNoEmoji$a
	implements InputFilter
{

	public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
	{
		while(i < j) 
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:icmpge          44
		{
			k = Character.getType(charsequence.charAt(i));
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokeinterface #29  <Method char CharSequence.charAt(int)>
	//    6   12:invokestatic    #35  <Method int Character.getType(char)>
	//    7   15:istore          5
			if(k != 19 && k != 28)
	//*   8   17:iload           5
	//*   9   19:bipush          19
	//*  10   21:icmpeq          41
	//*  11   24:iload           5
	//*  12   26:bipush          28
	//*  13   28:icmpne          34
	//*  14   31:goto            41
				i++;
	//   15   34:iload_2         
	//   16   35:iconst_1        
	//   17   36:iadd            
	//   18   37:istore_2        
			else
	//*  19   38:goto            0
				return "";
	//   20   41:ldc1            #37  <String "">
	//   21   43:areturn         
		}
		return null;
	//   22   44:aconst_null     
	//   23   45:areturn         
	}

	final CustomEditTextNoEmoji a;

	private CustomEditTextNoEmoji$a(CustomEditTextNoEmoji customedittextnoemoji)
	{
		a = customedittextnoemoji;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field CustomEditTextNoEmoji a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}

	CustomEditTextNoEmoji$a(CustomEditTextNoEmoji customedittextnoemoji, CustomEditTextNoEmoji$1 customedittextnoemoji$1)
	{
		this(customedittextnoemoji);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void CustomEditTextNoEmoji$a(CustomEditTextNoEmoji)>
	//    3    5:return          
	}
}
