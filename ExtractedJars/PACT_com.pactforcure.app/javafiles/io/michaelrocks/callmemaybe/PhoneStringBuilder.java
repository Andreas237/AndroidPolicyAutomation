// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.callmemaybe;

import android.text.*;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;

// Referenced classes of package io.michaelrocks.callmemaybe:
//			PhoneFormatter, FormatParameters

class PhoneStringBuilder extends SpannableStringBuilder
{

	public PhoneStringBuilder(PhoneNumberUtil phonenumberutil, CharSequence charsequence, FormatParameters formatparameters)
	{
		this(charsequence, new PhoneFormatter(phonenumberutil, formatparameters));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:new             #10  <Class PhoneFormatter>
	//    3    5:dup             
	//    4    6:aload_1         
	//    5    7:aload_3         
	//    6    8:invokespecial   #13  <Method void PhoneFormatter(PhoneNumberUtil, FormatParameters)>
	//    7   11:invokespecial   #16  <Method void PhoneStringBuilder(CharSequence, PhoneFormatter)>
	//    8   14:return          
	}

	PhoneStringBuilder(CharSequence charsequence, PhoneFormatter phoneformatter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void SpannableStringBuilder()>
		phoneFormatter = phoneformatter;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #22  <Field PhoneFormatter phoneFormatter>
		replace(0, length(), charsequence);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:aload_0         
	//    8   12:invokevirtual   #26  <Method int length()>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #30  <Method SpannableStringBuilder replace(int, int, CharSequence)>
	//   11   19:pop             
	//   12   20:return          
	}

	private boolean containsDigits(int i, int j)
	{
		int k;
		for(; i < j; i += Character.charCount(k))
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpge          30
		{
			k = Character.codePointAt(((CharSequence) (this)), i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokestatic    #38  <Method int Character.codePointAt(CharSequence, int)>
	//    6   10:istore_3        
			if(Character.isDigit(k))
	//*   7   11:iload_3         
	//*   8   12:invokestatic    #42  <Method boolean Character.isDigit(int)>
	//*   9   15:ifeq            20
				return true;
	//   10   18:iconst_1        
	//   11   19:ireturn         
		}

	//   12   20:iload_1         
	//   13   21:iload_3         
	//   14   22:invokestatic    #46  <Method int Character.charCount(int)>
	//   15   25:iadd            
	//   16   26:istore_1        
	//*  17   27:goto            0
		return false;
	//   18   30:iconst_0        
	//   19   31:ireturn         
	}

	private int indexOfLastDigit(int i, int j)
	{
		while(j > i) 
	//*   0    0:iload_2         
	//*   1    1:iload_1         
	//*   2    2:icmple          32
		{
			int l = Character.codePointBefore(((CharSequence) (this)), j);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokestatic    #51  <Method int Character.codePointBefore(CharSequence, int)>
	//    6   10:istore          4
			int k = j - Character.charCount(l);
	//    7   12:iload_2         
	//    8   13:iload           4
	//    9   15:invokestatic    #46  <Method int Character.charCount(int)>
	//   10   18:isub            
	//   11   19:istore_3        
			j = k;
	//   12   20:iload_3         
	//   13   21:istore_2        
			if(Character.isDigit(l))
	//*  14   22:iload           4
	//*  15   24:invokestatic    #42  <Method boolean Character.isDigit(int)>
	//*  16   27:ifeq            0
				return k;
	//   17   30:iload_3         
	//   18   31:ireturn         
		}
		return -1;
	//   19   32:iconst_m1       
	//   20   33:ireturn         
	}

	public volatile Editable delete(int i, int j)
	{
		return ((Editable) (delete(i, j)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #56  <Method SpannableStringBuilder delete(int, int)>
	//    4    6:areturn         
	}

	public SpannableStringBuilder delete(int i, int j)
	{
		if(containsDigits(i, j))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:iload_2         
	//*   3    3:invokespecial   #58  <Method boolean containsDigits(int, int)>
	//*   4    6:ifeq            16
			return super.delete(i, j);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:iload_2         
	//    8   12:invokespecial   #59  <Method SpannableStringBuilder SpannableStringBuilder.delete(int, int)>
	//    9   15:areturn         
		else
			return super.delete(Math.max(0, indexOfLastDigit(0, i)), j);
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:aload_0         
	//   13   19:iconst_0        
	//   14   20:iload_1         
	//   15   21:invokespecial   #61  <Method int indexOfLastDigit(int, int)>
	//   16   24:invokestatic    #66  <Method int Math.max(int, int)>
	//   17   27:iload_2         
	//   18   28:invokespecial   #59  <Method SpannableStringBuilder SpannableStringBuilder.delete(int, int)>
	//   19   31:areturn         
	}

	public volatile Editable replace(int i, int j, CharSequence charsequence, int k, int l)
	{
		return ((Editable) (replace(i, j, charsequence, k, l)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokevirtual   #70  <Method SpannableStringBuilder replace(int, int, CharSequence, int, int)>
	//    7   11:areturn         
	}

	public SpannableStringBuilder replace(int i, int j, CharSequence charsequence, int k, int l)
	{
		phoneFormatter.format(((Editable) (this)), i, j, charsequence, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field PhoneFormatter phoneFormatter>
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:iload           5
	//    8   12:invokevirtual   #74  <Method void PhoneFormatter.format(Editable, int, int, CharSequence, int, int)>
		charsequence = phoneFormatter.getFormattedPhone();
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field PhoneFormatter phoneFormatter>
	//   11   19:invokevirtual   #78  <Method CharSequence PhoneFormatter.getFormattedPhone()>
	//   12   22:astore_3        
		charsequence = ((CharSequence) (super.replace(0, length(), charsequence, 0, charsequence.length())));
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #26  <Method int length()>
	//   17   29:aload_3         
	//   18   30:iconst_0        
	//   19   31:aload_3         
	//   20   32:invokeinterface #81  <Method int CharSequence.length()>
	//   21   37:invokespecial   #82  <Method SpannableStringBuilder SpannableStringBuilder.replace(int, int, CharSequence, int, int)>
	//   22   40:astore_3        
		i = phoneFormatter.getSelection();
	//   23   41:aload_0         
	//   24   42:getfield        #22  <Field PhoneFormatter phoneFormatter>
	//   25   45:invokevirtual   #85  <Method int PhoneFormatter.getSelection()>
	//   26   48:istore_1        
		if(i != -1 && i <= ((SpannableStringBuilder) (charsequence)).length())
	//*  27   49:iload_1         
	//*  28   50:iconst_m1       
	//*  29   51:icmpeq          67
	//*  30   54:iload_1         
	//*  31   55:aload_3         
	//*  32   56:invokevirtual   #86  <Method int SpannableStringBuilder.length()>
	//*  33   59:icmpgt          67
			Selection.setSelection(((android.text.Spannable) (charsequence)), i);
	//   34   62:aload_3         
	//   35   63:iload_1         
	//   36   64:invokestatic    #92  <Method void Selection.setSelection(android.text.Spannable, int)>
		return ((SpannableStringBuilder) (charsequence));
	//   37   67:aload_3         
	//   38   68:areturn         
	}

	private final PhoneFormatter phoneFormatter;
}
