// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.callmemaybe;

import android.text.*;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;

// Referenced classes of package io.michaelrocks.callmemaybe:
//			FormatParameters, MutableAsYouTypeFormatter, CodePoint

class PhoneFormatter
{

	PhoneFormatter(MutableAsYouTypeFormatter mutableasyoutypeformatter, FormatParameters formatparameters)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		buffer = new SpannableStringBuilder();
	//    2    4:aload_0         
	//    3    5:new             #15  <Class SpannableStringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void SpannableStringBuilder()>
	//    6   12:putfield        #18  <Field SpannableStringBuilder buffer>
		asYouTypeFormatter = mutableasyoutypeformatter;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #20  <Field MutableAsYouTypeFormatter asYouTypeFormatter>
		mutableasyoutypeformatter.setRegion(formatparameters.getRegion());
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #26  <Method String FormatParameters.getRegion()>
	//   13   25:invokevirtual   #32  <Method void MutableAsYouTypeFormatter.setRegion(String)>
	//   14   28:return          
	}

	public PhoneFormatter(PhoneNumberUtil phonenumberutil, FormatParameters formatparameters)
	{
		this(new MutableAsYouTypeFormatter(phonenumberutil), formatparameters);
	//    0    0:aload_0         
	//    1    1:new             #28  <Class MutableAsYouTypeFormatter>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #37  <Method void MutableAsYouTypeFormatter(PhoneNumberUtil)>
	//    5    9:aload_2         
	//    6   10:invokespecial   #39  <Method void PhoneFormatter(MutableAsYouTypeFormatter, FormatParameters)>
	//    7   13:return          
	}

	private void formatPhoneNumberInput(Editable editable)
	{
		int k = Selection.getSelectionStart(((CharSequence) (buffer)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SpannableStringBuilder buffer>
	//    2    4:invokestatic    #47  <Method int Selection.getSelectionStart(CharSequence)>
	//    3    7:istore          6
		boolean flag = false;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		asYouTypeFormatter.clear();
	//    6   11:aload_0         
	//    7   12:getfield        #20  <Field MutableAsYouTypeFormatter asYouTypeFormatter>
	//    8   15:invokevirtual   #50  <Method void MutableAsYouTypeFormatter.clear()>
		Object obj = "";
	//    9   18:ldc1            #52  <String "">
	//   10   20:astore          10
		int j = 0;
	//   11   22:iconst_0        
	//   12   23:istore          4
		int l = editable.length();
	//   13   25:aload_1         
	//   14   26:invokeinterface #58  <Method int Editable.length()>
	//   15   31:istore          7
		while(j < l) 
	//*  16   33:iload           4
	//*  17   35:iload           7
	//*  18   37:icmpge          131
		{
			int i1 = Character.codePointAt(((CharSequence) (editable)), j);
	//   19   40:aload_1         
	//   20   41:iload           4
	//   21   43:invokestatic    #64  <Method int Character.codePointAt(CharSequence, int)>
	//   22   46:istore          8
			boolean flag1 = flag;
	//   23   48:iload_3         
	//   24   49:istore          5
			if(Character.isDigit(i1))
	//*  25   51:iload           8
	//*  26   53:invokestatic    #68  <Method boolean Character.isDigit(int)>
	//*  27   56:ifeq            104
			{
				char c = CodePoint.toDigitChar(i1);
	//   28   59:iload           8
	//   29   61:invokestatic    #74  <Method char CodePoint.toDigitChar(int)>
	//   30   64:istore_2        
				boolean flag2;
				if(flag || j >= k)
	//*  31   65:iload_3         
	//*  32   66:ifne            76
	//*  33   69:iload           4
	//*  34   71:iload           6
	//*  35   73:icmplt          120
					flag = true;
	//   36   76:iconst_1        
	//   37   77:istore_3        
				else
	//*  38   78:aload_0         
	//*  39   79:getfield        #20  <Field MutableAsYouTypeFormatter asYouTypeFormatter>
	//*  40   82:astore          10
	//*  41   84:iload_3         
	//*  42   85:ifne            125
	//*  43   88:iconst_1        
	//*  44   89:istore          9
	//*  45   91:aload           10
	//*  46   93:iload_2         
	//*  47   94:iload           9
	//*  48   96:invokevirtual   #78  <Method String MutableAsYouTypeFormatter.inputDigit(char, boolean)>
	//*  49   99:astore          10
	//*  50  101:iload_3         
	//*  51  102:istore          5
	//*  52  104:iload           4
	//*  53  106:iload           8
	//*  54  108:invokestatic    #82  <Method int Character.charCount(int)>
	//*  55  111:iadd            
	//*  56  112:istore          4
	//*  57  114:iload           5
	//*  58  116:istore_3        
	//*  59  117:goto            33
					flag = false;
	//   60  120:iconst_0        
	//   61  121:istore_3        
				obj = ((Object) (asYouTypeFormatter));
				if(!flag)
					flag2 = true;
				else
	//*  62  122:goto            78
					flag2 = false;
	//   63  125:iconst_0        
	//   64  126:istore          9
				obj = ((Object) (((MutableAsYouTypeFormatter) (obj)).inputDigit(c, flag2)));
				flag1 = flag;
			}
			j += Character.charCount(i1);
			flag = flag1;
		}
	//*  65  128:goto            91
		editable.replace(0, editable.length(), ((CharSequence) (obj)));
	//   66  131:aload_1         
	//   67  132:iconst_0        
	//   68  133:aload_1         
	//   69  134:invokeinterface #58  <Method int Editable.length()>
	//   70  139:aload           10
	//   71  141:invokeinterface #86  <Method Editable Editable.replace(int, int, CharSequence)>
	//   72  146:pop             
		if(k != -1)
	//*  73  147:iload           6
	//*  74  149:iconst_m1       
	//*  75  150:icmpeq          170
		{
			int i;
			if(flag)
	//*  76  153:iload_3         
	//*  77  154:ifeq            171
				i = asYouTypeFormatter.getRememberedPosition();
	//   78  157:aload_0         
	//   79  158:getfield        #20  <Field MutableAsYouTypeFormatter asYouTypeFormatter>
	//   80  161:invokevirtual   #89  <Method int MutableAsYouTypeFormatter.getRememberedPosition()>
	//   81  164:istore_3        
			else
	//*  82  165:aload_1         
	//*  83  166:iload_3         
	//*  84  167:invokestatic    #93  <Method void Selection.setSelection(android.text.Spannable, int)>
	//*  85  170:return          
				i = ((String) (obj)).length();
	//   86  171:aload           10
	//   87  173:invokevirtual   #96  <Method int String.length()>
	//   88  176:istore_3        
			Selection.setSelection(((android.text.Spannable) (editable)), i);
		}
	//*  89  177:goto            165
	}

	public void format(Editable editable, int i, int j, CharSequence charsequence, int k, int l)
	{
		int i1 = Selection.getSelectionStart(((CharSequence) (editable)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #47  <Method int Selection.getSelectionStart(CharSequence)>
	//    2    4:istore          7
		int j1 = Selection.getSelectionStart(((CharSequence) (editable)));
	//    3    6:aload_1         
	//    4    7:invokestatic    #47  <Method int Selection.getSelectionStart(CharSequence)>
	//    5   10:istore          8
		buffer.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field SpannableStringBuilder buffer>
	//    8   16:invokevirtual   #99  <Method void SpannableStringBuilder.clear()>
		buffer.append(((CharSequence) (editable)));
	//    9   19:aload_0         
	//   10   20:getfield        #18  <Field SpannableStringBuilder buffer>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #103 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   13   27:pop             
		if(i1 != -1 && j1 != -1)
	//*  14   28:iload           7
	//*  15   30:iconst_m1       
	//*  16   31:icmpeq          51
	//*  17   34:iload           8
	//*  18   36:iconst_m1       
	//*  19   37:icmpeq          51
			Selection.setSelection(((android.text.Spannable) (buffer)), i1, j1);
	//   20   40:aload_0         
	//   21   41:getfield        #18  <Field SpannableStringBuilder buffer>
	//   22   44:iload           7
	//   23   46:iload           8
	//   24   48:invokestatic    #106 <Method void Selection.setSelection(android.text.Spannable, int, int)>
		buffer.replace(i, j, charsequence, k, l);
	//   25   51:aload_0         
	//   26   52:getfield        #18  <Field SpannableStringBuilder buffer>
	//   27   55:iload_2         
	//   28   56:iload_3         
	//   29   57:aload           4
	//   30   59:iload           5
	//   31   61:iload           6
	//   32   63:invokevirtual   #109 <Method SpannableStringBuilder SpannableStringBuilder.replace(int, int, CharSequence, int, int)>
	//   33   66:pop             
		if(!TextUtils.isGraphic(((CharSequence) (buffer))))
	//*  34   67:aload_0         
	//*  35   68:getfield        #18  <Field SpannableStringBuilder buffer>
	//*  36   71:invokestatic    #115 <Method boolean TextUtils.isGraphic(CharSequence)>
	//*  37   74:ifne            78
		{
			return;
	//   38   77:return          
		} else
		{
			formatPhoneNumberInput(((Editable) (buffer)));
	//   39   78:aload_0         
	//   40   79:aload_0         
	//   41   80:getfield        #18  <Field SpannableStringBuilder buffer>
	//   42   83:invokespecial   #117 <Method void formatPhoneNumberInput(Editable)>
			return;
	//   43   86:return          
		}
	}

	public CharSequence getFormattedPhone()
	{
		return ((CharSequence) (buffer));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SpannableStringBuilder buffer>
	//    2    4:areturn         
	}

	public int getSelection()
	{
		return Selection.getSelectionStart(((CharSequence) (buffer)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SpannableStringBuilder buffer>
	//    2    4:invokestatic    #47  <Method int Selection.getSelectionStart(CharSequence)>
	//    3    7:ireturn         
	}

	private final MutableAsYouTypeFormatter asYouTypeFormatter;
	private final SpannableStringBuilder buffer;
}
