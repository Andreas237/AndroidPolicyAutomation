// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless.internal;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.appevents.codeless.internal:
//			ViewHierarchy

public class SensitiveUserDataUtils
{

	private static boolean isCreditCard(TextView textview)
	{
		textview = ((TextView) (ViewHierarchy.getTextOfView(((View) (textview))).replaceAll("\\s", "")));
	//    0    0:aload_0         
	//    1    1:invokestatic    #12  <Method String ViewHierarchy.getTextOfView(View)>
	//    2    4:ldc1            #14  <String "\\s">
	//    3    6:ldc1            #16  <String "">
	//    4    8:invokevirtual   #22  <Method String String.replaceAll(String, String)>
	//    5   11:astore_0        
		int i = ((String) (textview)).length();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #26  <Method int String.length()>
	//    8   16:istore_1        
		boolean flag1 = false;
	//    9   17:iconst_0        
	//   10   18:istore          6
		if(i >= 12)
	//*  11   20:iload_1         
	//*  12   21:bipush          12
	//*  13   23:icmplt          137
		{
			if(i > 19)
	//*  14   26:iload_1         
	//*  15   27:bipush          19
	//*  16   29:icmple          34
				return false;
	//   17   32:iconst_0        
	//   18   33:ireturn         
			int k = i - 1;
	//   19   34:iload_1         
	//   20   35:iconst_1        
	//   21   36:isub            
	//   22   37:istore_3        
			int l = 0;
	//   23   38:iconst_0        
	//   24   39:istore          4
			boolean flag = false;
	//   25   41:iconst_0        
	//   26   42:istore_2        
			while(k >= 0) 
	//*  27   43:iload_3         
	//*  28   44:iflt            123
			{
				int j = ((int) (((String) (textview)).charAt(k)));
	//   29   47:aload_0         
	//   30   48:iload_3         
	//   31   49:invokevirtual   #30  <Method char String.charAt(int)>
	//   32   52:istore_1        
				if(j >= '0')
	//*  33   53:iload_1         
	//*  34   54:bipush          48
	//*  35   56:icmplt          121
				{
					if(j > '9')
	//*  36   59:iload_1         
	//*  37   60:bipush          57
	//*  38   62:icmple          67
						return false;
	//   39   65:iconst_0        
	//   40   66:ireturn         
					int i1 = j - 48;
	//   41   67:iload_1         
	//   42   68:bipush          48
	//   43   70:isub            
	//   44   71:istore          5
					j = i1;
	//   45   73:iload           5
	//   46   75:istore_1        
					if(flag)
	//*  47   76:iload_2         
	//*  48   77:ifeq            104
					{
						i1 *= 2;
	//   49   80:iload           5
	//   50   82:iconst_2        
	//   51   83:imul            
	//   52   84:istore          5
						j = i1;
	//   53   86:iload           5
	//   54   88:istore_1        
						if(i1 > 9)
	//*  55   89:iload           5
	//*  56   91:bipush          9
	//*  57   93:icmple          104
							j = i1 % 10 + 1;
	//   58   96:iload           5
	//   59   98:bipush          10
	//   60  100:irem            
	//   61  101:iconst_1        
	//   62  102:iadd            
	//   63  103:istore_1        
					}
					l += j;
	//   64  104:iload           4
	//   65  106:iload_1         
	//   66  107:iadd            
	//   67  108:istore          4
					flag ^= true;
	//   68  110:iload_2         
	//   69  111:iconst_1        
	//   70  112:ixor            
	//   71  113:istore_2        
					k--;
	//   72  114:iload_3         
	//   73  115:iconst_1        
	//   74  116:isub            
	//   75  117:istore_3        
				} else
	//*  76  118:goto            43
				{
					return false;
	//   77  121:iconst_0        
	//   78  122:ireturn         
				}
			}
			if(l % 10 == 0)
	//*  79  123:iload           4
	//*  80  125:bipush          10
	//*  81  127:irem            
	//*  82  128:ifne            134
				flag1 = true;
	//   83  131:iconst_1        
	//   84  132:istore          6
			return flag1;
	//   85  134:iload           6
	//   86  136:ireturn         
		} else
		{
			return false;
	//   87  137:iconst_0        
	//   88  138:ireturn         
		}
	}

	private static boolean isEmail(TextView textview)
	{
		if(textview.getInputType() == 32)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #37  <Method int TextView.getInputType()>
	//*   2    4:bipush          32
	//*   3    6:icmpne          11
			return true;
	//    4    9:iconst_1        
	//    5   10:ireturn         
		textview = ((TextView) (ViewHierarchy.getTextOfView(((View) (textview)))));
	//    6   11:aload_0         
	//    7   12:invokestatic    #12  <Method String ViewHierarchy.getTextOfView(View)>
	//    8   15:astore_0        
		if(textview != null && ((String) (textview)).length() != 0)
	//*   9   16:aload_0         
	//*  10   17:ifnull          41
	//*  11   20:aload_0         
	//*  12   21:invokevirtual   #26  <Method int String.length()>
	//*  13   24:ifne            30
	//*  14   27:goto            41
			return Patterns.EMAIL_ADDRESS.matcher(((CharSequence) (textview))).matches();
	//   15   30:getstatic       #43  <Field Pattern Patterns.EMAIL_ADDRESS>
	//   16   33:aload_0         
	//   17   34:invokevirtual   #49  <Method Matcher Pattern.matcher(CharSequence)>
	//   18   37:invokevirtual   #55  <Method boolean Matcher.matches()>
	//   19   40:ireturn         
		else
			return false;
	//   20   41:iconst_0        
	//   21   42:ireturn         
	}

	private static boolean isPassword(TextView textview)
	{
		if(textview.getInputType() == 128)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #37  <Method int TextView.getInputType()>
	//*   2    4:sipush          128
	//*   3    7:icmpne          12
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		else
			return textview.getTransformationMethod() instanceof PasswordTransformationMethod;
	//    6   12:aload_0         
	//    7   13:invokevirtual   #60  <Method android.text.method.TransformationMethod TextView.getTransformationMethod()>
	//    8   16:instanceof      #62  <Class PasswordTransformationMethod>
	//    9   19:ireturn         
	}

	private static boolean isPersonName(TextView textview)
	{
		return textview.getInputType() == 96;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method int TextView.getInputType()>
	//    2    4:bipush          96
	//    3    6:icmpne          11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	private static boolean isPhoneNumber(TextView textview)
	{
		return textview.getInputType() == 3;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method int TextView.getInputType()>
	//    2    4:iconst_3        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private static boolean isPostalAddress(TextView textview)
	{
		return textview.getInputType() == 112;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method int TextView.getInputType()>
	//    2    4:bipush          112
	//    3    6:icmpne          11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	public static boolean isSensitiveUserData(View view)
	{
		boolean flag1 = view instanceof TextView;
	//    0    0:aload_0         
	//    1    1:instanceof      #34  <Class TextView>
	//    2    4:istore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(flag1)
	//*   5    7:iload_2         
	//*   6    8:ifeq            62
		{
			view = ((View) ((TextView)view));
	//    7   11:aload_0         
	//    8   12:checkcast       #34  <Class TextView>
	//    9   15:astore_0        
			if(isPassword(((TextView) (view))) || isCreditCard(((TextView) (view))) || isPersonName(((TextView) (view))) || isPostalAddress(((TextView) (view))) || isPhoneNumber(((TextView) (view))) || isEmail(((TextView) (view))))
	//*  10   16:aload_0         
	//*  11   17:invokestatic    #69  <Method boolean isPassword(TextView)>
	//*  12   20:ifne            58
	//*  13   23:aload_0         
	//*  14   24:invokestatic    #71  <Method boolean isCreditCard(TextView)>
	//*  15   27:ifne            58
	//*  16   30:aload_0         
	//*  17   31:invokestatic    #73  <Method boolean isPersonName(TextView)>
	//*  18   34:ifne            58
	//*  19   37:aload_0         
	//*  20   38:invokestatic    #75  <Method boolean isPostalAddress(TextView)>
	//*  21   41:ifne            58
	//*  22   44:aload_0         
	//*  23   45:invokestatic    #77  <Method boolean isPhoneNumber(TextView)>
	//*  24   48:ifne            58
	//*  25   51:aload_0         
	//*  26   52:invokestatic    #79  <Method boolean isEmail(TextView)>
	//*  27   55:ifeq            60
				flag = true;
	//   28   58:iconst_1        
	//   29   59:istore_1        
			return flag;
	//   30   60:iload_1         
	//   31   61:ireturn         
		} else
		{
			return false;
	//   32   62:iconst_0        
	//   33   63:ireturn         
		}
	}
}
