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

	public SensitiveUserDataUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static boolean isCreditCard(TextView textview)
	{
		textview = ((TextView) (ViewHierarchy.getTextOfView(((View) (textview))).replaceAll("\\s", "")));
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method String ViewHierarchy.getTextOfView(View)>
	//    2    4:ldc1            #19  <String "\\s">
	//    3    6:ldc1            #21  <String "">
	//    4    8:invokevirtual   #27  <Method String String.replaceAll(String, String)>
	//    5   11:astore_0        
		int i = ((String) (textview)).length();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #31  <Method int String.length()>
	//    8   16:istore_1        
		boolean flag = false;
	//    9   17:iconst_0        
	//   10   18:istore          6
		if(i >= 12)
	//*  11   20:iload_1         
	//*  12   21:bipush          12
	//*  13   23:icmplt          138
		{
			if(i > 19)
	//*  14   26:iload_1         
	//*  15   27:bipush          19
	//*  16   29:icmple          34
				return false;
	//   17   32:iconst_0        
	//   18   33:ireturn         
			int l = i - 1;
	//   19   34:iload_1         
	//   20   35:iconst_1        
	//   21   36:isub            
	//   22   37:istore_3        
			int i1 = 0;
	//   23   38:iconst_0        
	//   24   39:istore          4
			int k = i1;
	//   25   41:iload           4
	//   26   43:istore_2        
			while(l >= 0) 
	//*  27   44:iload_3         
	//*  28   45:iflt            124
			{
				int j = ((int) (((String) (textview)).charAt(l)));
	//   29   48:aload_0         
	//   30   49:iload_3         
	//   31   50:invokevirtual   #35  <Method char String.charAt(int)>
	//   32   53:istore_1        
				if(j >= '0')
	//*  33   54:iload_1         
	//*  34   55:bipush          48
	//*  35   57:icmplt          122
				{
					if(j > '9')
	//*  36   60:iload_1         
	//*  37   61:bipush          57
	//*  38   63:icmple          68
						return false;
	//   39   66:iconst_0        
	//   40   67:ireturn         
					int j1 = j - 48;
	//   41   68:iload_1         
	//   42   69:bipush          48
	//   43   71:isub            
	//   44   72:istore          5
					j = j1;
	//   45   74:iload           5
	//   46   76:istore_1        
					if(k != 0)
	//*  47   77:iload_2         
	//*  48   78:ifeq            105
					{
						j1 *= 2;
	//   49   81:iload           5
	//   50   83:iconst_2        
	//   51   84:imul            
	//   52   85:istore          5
						j = j1;
	//   53   87:iload           5
	//   54   89:istore_1        
						if(j1 > 9)
	//*  55   90:iload           5
	//*  56   92:bipush          9
	//*  57   94:icmple          105
							j = j1 % 10 + 1;
	//   58   97:iload           5
	//   59   99:bipush          10
	//   60  101:irem            
	//   61  102:iconst_1        
	//   62  103:iadd            
	//   63  104:istore_1        
					}
					i1 += j;
	//   64  105:iload           4
	//   65  107:iload_1         
	//   66  108:iadd            
	//   67  109:istore          4
					k ^= 1;
	//   68  111:iload_2         
	//   69  112:iconst_1        
	//   70  113:ixor            
	//   71  114:istore_2        
					l--;
	//   72  115:iload_3         
	//   73  116:iconst_1        
	//   74  117:isub            
	//   75  118:istore_3        
				} else
	//*  76  119:goto            44
				{
					return false;
	//   77  122:iconst_0        
	//   78  123:ireturn         
				}
			}
			if(i1 % 10 == 0)
	//*  79  124:iload           4
	//*  80  126:bipush          10
	//*  81  128:irem            
	//*  82  129:ifne            135
				flag = true;
	//   83  132:iconst_1        
	//   84  133:istore          6
			return flag;
	//   85  135:iload           6
	//   86  137:ireturn         
		} else
		{
			return false;
	//   87  138:iconst_0        
	//   88  139:ireturn         
		}
	}

	private static boolean isEmail(TextView textview)
	{
		if(textview.getInputType() == 32)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #41  <Method int TextView.getInputType()>
	//*   2    4:bipush          32
	//*   3    6:icmpne          11
			return true;
	//    4    9:iconst_1        
	//    5   10:ireturn         
		textview = ((TextView) (ViewHierarchy.getTextOfView(((View) (textview)))));
	//    6   11:aload_0         
	//    7   12:invokestatic    #17  <Method String ViewHierarchy.getTextOfView(View)>
	//    8   15:astore_0        
		if(textview != null && ((String) (textview)).length() != 0)
	//*   9   16:aload_0         
	//*  10   17:ifnull          41
	//*  11   20:aload_0         
	//*  12   21:invokevirtual   #31  <Method int String.length()>
	//*  13   24:ifne            30
	//*  14   27:goto            41
			return Patterns.EMAIL_ADDRESS.matcher(((CharSequence) (textview))).matches();
	//   15   30:getstatic       #47  <Field Pattern Patterns.EMAIL_ADDRESS>
	//   16   33:aload_0         
	//   17   34:invokevirtual   #53  <Method Matcher Pattern.matcher(CharSequence)>
	//   18   37:invokevirtual   #59  <Method boolean Matcher.matches()>
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
	//*   1    1:invokevirtual   #41  <Method int TextView.getInputType()>
	//*   2    4:sipush          128
	//*   3    7:icmpne          12
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		else
			return textview.getTransformationMethod() instanceof PasswordTransformationMethod;
	//    6   12:aload_0         
	//    7   13:invokevirtual   #64  <Method android.text.method.TransformationMethod TextView.getTransformationMethod()>
	//    8   16:instanceof      #66  <Class PasswordTransformationMethod>
	//    9   19:ireturn         
	}

	private static boolean isPersonName(TextView textview)
	{
		return textview.getInputType() == 96;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method int TextView.getInputType()>
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
	//    1    1:invokevirtual   #41  <Method int TextView.getInputType()>
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
	//    1    1:invokevirtual   #41  <Method int TextView.getInputType()>
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
	//    1    1:instanceof      #38  <Class TextView>
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
	//    8   12:checkcast       #38  <Class TextView>
	//    9   15:astore_0        
			if(isPassword(((TextView) (view))) || isCreditCard(((TextView) (view))) || isPersonName(((TextView) (view))) || isPostalAddress(((TextView) (view))) || isPhoneNumber(((TextView) (view))) || isEmail(((TextView) (view))))
	//*  10   16:aload_0         
	//*  11   17:invokestatic    #73  <Method boolean isPassword(TextView)>
	//*  12   20:ifne            58
	//*  13   23:aload_0         
	//*  14   24:invokestatic    #75  <Method boolean isCreditCard(TextView)>
	//*  15   27:ifne            58
	//*  16   30:aload_0         
	//*  17   31:invokestatic    #77  <Method boolean isPersonName(TextView)>
	//*  18   34:ifne            58
	//*  19   37:aload_0         
	//*  20   38:invokestatic    #79  <Method boolean isPostalAddress(TextView)>
	//*  21   41:ifne            58
	//*  22   44:aload_0         
	//*  23   45:invokestatic    #81  <Method boolean isPhoneNumber(TextView)>
	//*  24   48:ifne            58
	//*  25   51:aload_0         
	//*  26   52:invokestatic    #83  <Method boolean isEmail(TextView)>
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
