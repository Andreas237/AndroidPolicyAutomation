// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.AttributeSet;

// Referenced classes of package com.irobot.home.view:
//			CustomEditTextView

public class CustomEditTextNoEmoji extends CustomEditTextView
{
	private class a
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

		private a()
		{
			a = CustomEditTextNoEmoji.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field CustomEditTextNoEmoji a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void Object()>
		//    5    9:return          
		}

	}


	public CustomEditTextNoEmoji(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void CustomEditTextView(Context)>
		a();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void a()>
	//    5    9:return          
	}

	public CustomEditTextNoEmoji(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #20  <Method void CustomEditTextView(Context, AttributeSet)>
		a();
	//    4    6:aload_0         
	//    5    7:invokespecial   #16  <Method void a()>
	//    6   10:return          
	}

	public CustomEditTextNoEmoji(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #23  <Method void CustomEditTextView(Context, AttributeSet, int)>
		a();
	//    5    7:aload_0         
	//    6    8:invokespecial   #16  <Method void a()>
	//    7   11:return          
	}

	private void a()
	{
		setFilters(new InputFilter[] {
			new a()
		});
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:anewarray       InputFilter[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:new             #8   <Class CustomEditTextNoEmoji$a>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:invokespecial   #28  <Method void CustomEditTextNoEmoji$a(CustomEditTextNoEmoji, CustomEditTextNoEmoji$1)>
	//   10   16:aastore         
	//   11   17:invokevirtual   #32  <Method void setFilters(InputFilter[])>
	//   12   20:return          
	}
}
