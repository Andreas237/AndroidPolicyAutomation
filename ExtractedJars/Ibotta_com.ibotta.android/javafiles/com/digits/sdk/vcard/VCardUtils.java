// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.vcard;

import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.*;

// Referenced classes of package com.digits.sdk.vcard:
//			VCardConfig, JapaneseUtils

public class VCardUtils
{
	public static class PhoneNumberUtilsPort
	{

		public static String formatNumber(String s, int i)
		{
			s = ((String) (new SpannableStringBuilder(((CharSequence) (s)))));
		//    0    0:new             #11  <Class SpannableStringBuilder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #15  <Method void SpannableStringBuilder(CharSequence)>
		//    4    8:astore_0        
			PhoneNumberUtils.formatNumber(((android.text.Editable) (s)), i);
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:invokestatic    #20  <Method void PhoneNumberUtils.formatNumber(android.text.Editable, int)>
			return ((SpannableStringBuilder) (s)).toString();
		//    8   14:aload_0         
		//    9   15:invokevirtual   #24  <Method String SpannableStringBuilder.toString()>
		//   10   18:areturn         
		}
	}

	public static class TextUtilsPort
	{

		public static boolean isPrintableAscii(char c)
		{
			return ' ' <= c && c <= '~' || c == '\r' || c == '\n';
		//    0    0:bipush          32
		//    1    2:iload_0         
		//    2    3:icmpgt          12
		//    3    6:iload_0         
		//    4    7:bipush          126
		//    5    9:icmple          29
		//    6   12:iload_0         
		//    7   13:bipush          13
		//    8   15:icmpeq          29
		//    9   18:iload_0         
		//   10   19:bipush          10
		//   11   21:icmpne          27
		//   12   24:goto            29
		//   13   27:iconst_0        
		//   14   28:ireturn         
		//   15   29:iconst_1        
		//   16   30:ireturn         
		}

		public static boolean isPrintableAsciiOnly(CharSequence charsequence)
		{
			int j = charsequence.length();
		//    0    0:aload_0         
		//    1    1:invokeinterface #18  <Method int CharSequence.length()>
		//    2    6:istore_2        
			for(int i = 0; i < j; i++)
		//*   3    7:iconst_0        
		//*   4    8:istore_1        
		//*   5    9:iload_1         
		//*   6   10:iload_2         
		//*   7   11:icmpge          36
				if(!isPrintableAscii(charsequence.charAt(i)))
		//*   8   14:aload_0         
		//*   9   15:iload_1         
		//*  10   16:invokeinterface #22  <Method char CharSequence.charAt(int)>
		//*  11   21:invokestatic    #24  <Method boolean isPrintableAscii(char)>
		//*  12   24:ifne            29
					return false;
		//   13   27:iconst_0        
		//   14   28:ireturn         

		//   15   29:iload_1         
		//   16   30:iconst_1        
		//   17   31:iadd            
		//   18   32:istore_1        
		//*  19   33:goto            9
			return true;
		//   20   36:iconst_1        
		//   21   37:ireturn         
		}
	}


	public static String constructNameFromElements(int i, String s, String s1, String s2)
	{
		return constructNameFromElements(i, s, s1, s2, ((String) (null)), ((String) (null)));
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokestatic    #160 <Method String constructNameFromElements(int, String, String, String, String, String)>
	//    7    9:areturn         
	}

	public static String constructNameFromElements(int i, String s, String s1, String s2, String s3, String s4)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #162 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #163 <Method void StringBuilder()>
	//    3    7:astore          9
		s = ((String) (sortNameElements(i, s, s1, s2)));
	//    4    9:iload_0         
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:invokestatic    #167 <Method String[] sortNameElements(int, String, String, String)>
	//    9   16:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (s3))))
	//*  10   17:aload           4
	//*  11   19:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   22:ifne            38
		{
			stringbuilder.append(s3);
	//   13   25:aload           9
	//   14   27:aload           4
	//   15   29:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			i = 0;
	//   17   33:iconst_0        
	//   18   34:istore_0        
		} else
	//*  19   35:goto            40
		{
			i = 1;
	//   20   38:iconst_1        
	//   21   39:istore_0        
		}
		int l = s.length;
	//   22   40:aload_1         
	//   23   41:arraylength     
	//   24   42:istore          8
		for(int j = 0; j < l;)
	//*  25   44:iconst_0        
	//*  26   45:istore          6
	//*  27   47:iload           6
	//*  28   49:iload           8
	//*  29   51:icmpge          108
		{
			s1 = ((String) (s[j]));
	//   30   54:aload_1         
	//   31   55:iload           6
	//   32   57:aaload          
	//   33   58:astore_2        
			int k = i;
	//   34   59:iload_0         
	//   35   60:istore          7
			if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*  36   62:aload_2         
	//*  37   63:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  38   66:ifne            96
			{
				if(i != 0)
	//*  39   69:iload_0         
	//*  40   70:ifeq            78
					i = 0;
	//   41   73:iconst_0        
	//   42   74:istore_0        
				else
	//*  43   75:goto            86
					stringbuilder.append(' ');
	//   44   78:aload           9
	//   45   80:bipush          32
	//   46   82:invokevirtual   #180 <Method StringBuilder StringBuilder.append(char)>
	//   47   85:pop             
				stringbuilder.append(s1);
	//   48   86:aload           9
	//   49   88:aload_2         
	//   50   89:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   51   92:pop             
				k = i;
	//   52   93:iload_0         
	//   53   94:istore          7
			}
			j++;
	//   54   96:iload           6
	//   55   98:iconst_1        
	//   56   99:iadd            
	//   57  100:istore          6
			i = k;
	//   58  102:iload           7
	//   59  104:istore_0        
		}

	//*  60  105:goto            47
		if(!TextUtils.isEmpty(((CharSequence) (s4))))
	//*  61  108:aload           5
	//*  62  110:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  63  113:ifne            136
		{
			if(i == 0)
	//*  64  116:iload_0         
	//*  65  117:ifne            128
				stringbuilder.append(' ');
	//   66  120:aload           9
	//   67  122:bipush          32
	//   68  124:invokevirtual   #180 <Method StringBuilder StringBuilder.append(char)>
	//   69  127:pop             
			stringbuilder.append(s4);
	//   70  128:aload           9
	//   71  130:aload           5
	//   72  132:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   73  135:pop             
		}
		return stringbuilder.toString();
	//   74  136:aload           9
	//   75  138:invokevirtual   #184 <Method String StringBuilder.toString()>
	//   76  141:areturn         
	}

	public static boolean containsOnlyAlphaDigitHyphen(Collection collection)
	{
		if(collection == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		collection = ((Collection) (collection.iterator()));
	//    4    6:aload_0         
	//    5    7:invokeinterface #192 <Method Iterator Collection.iterator()>
	//    6   12:astore_0        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//    7   13:aload_0         
	//    8   14:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            119
			String s = (String)((Iterator) (collection)).next();
	//   10   22:aload_0         
	//   11   23:invokeinterface #202 <Method Object Iterator.next()>
	//   12   28:checkcast       #122 <Class String>
	//   13   31:astore          4
			if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  14   33:aload           4
	//*  15   35:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   38:ifeq            44
	//*  17   41:goto            13
			{
				int j = s.length();
	//   18   44:aload           4
	//   19   46:invokevirtual   #206 <Method int String.length()>
	//   20   49:istore_2        
				int i = 0;
	//   21   50:iconst_0        
	//   22   51:istore_1        
				while(i < j) 
	//*  23   52:iload_1         
	//*  24   53:iload_2         
	//*  25   54:icmpge          13
				{
					int k = s.codePointAt(i);
	//   26   57:aload           4
	//   27   59:iload_1         
	//   28   60:invokevirtual   #210 <Method int String.codePointAt(int)>
	//   29   63:istore_3        
					if((97 > k || k >= 123) && (65 > k || k >= 91) && (48 > k || k >= 58) && k != 45)
	//*  30   64:bipush          97
	//*  31   66:iload_3         
	//*  32   67:icmpgt          76
	//*  33   70:iload_3         
	//*  34   71:bipush          123
	//*  35   73:icmplt          108
	//*  36   76:bipush          65
	//*  37   78:iload_3         
	//*  38   79:icmpgt          88
	//*  39   82:iload_3         
	//*  40   83:bipush          91
	//*  41   85:icmplt          108
	//*  42   88:bipush          48
	//*  43   90:iload_3         
	//*  44   91:icmpgt          100
	//*  45   94:iload_3         
	//*  46   95:bipush          58
	//*  47   97:icmplt          108
	//*  48  100:iload_3         
	//*  49  101:bipush          45
	//*  50  103:icmpeq          108
						return false;
	//   51  106:iconst_0        
	//   52  107:ireturn         
					i = s.offsetByCodePoints(i, 1);
	//   53  108:aload           4
	//   54  110:iload_1         
	//   55  111:iconst_1        
	//   56  112:invokevirtual   #214 <Method int String.offsetByCodePoints(int, int)>
	//   57  115:istore_1        
				}
			}
		} while(true);
	//   58  116:goto            52
		return true;
	//   59  119:iconst_1        
	//   60  120:ireturn         
	}

	public static transient boolean containsOnlyAlphaDigitHyphen(String as[])
	{
		if(as == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		else
			return containsOnlyAlphaDigitHyphen(((Collection) (Arrays.asList(((Object []) (as))))));
	//    4    6:aload_0         
	//    5    7:invokestatic    #138 <Method java.util.List Arrays.asList(Object[])>
	//    6   10:invokestatic    #219 <Method boolean containsOnlyAlphaDigitHyphen(Collection)>
	//    7   13:ireturn         
	}

	public static boolean containsOnlyNonCrLfPrintableAscii(Collection collection)
	{
		if(collection == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		collection = ((Collection) (collection.iterator()));
	//    4    6:aload_0         
	//    5    7:invokeinterface #192 <Method Iterator Collection.iterator()>
	//    6   12:astore_0        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//    7   13:aload_0         
	//    8   14:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            91
			String s = (String)((Iterator) (collection)).next();
	//   10   22:aload_0         
	//   11   23:invokeinterface #202 <Method Object Iterator.next()>
	//   12   28:checkcast       #122 <Class String>
	//   13   31:astore          4
			if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  14   33:aload           4
	//*  15   35:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   38:ifeq            44
	//*  17   41:goto            13
			{
				int j = s.length();
	//   18   44:aload           4
	//   19   46:invokevirtual   #206 <Method int String.length()>
	//   20   49:istore_2        
				int i = 0;
	//   21   50:iconst_0        
	//   22   51:istore_1        
				while(i < j) 
	//*  23   52:iload_1         
	//*  24   53:iload_2         
	//*  25   54:icmpge          13
				{
					int k = s.codePointAt(i);
	//   26   57:aload           4
	//   27   59:iload_1         
	//   28   60:invokevirtual   #210 <Method int String.codePointAt(int)>
	//   29   63:istore_3        
					if(32 <= k)
	//*  30   64:bipush          32
	//*  31   66:iload_3         
	//*  32   67:icmpgt          89
					{
						if(k > 126)
	//*  33   70:iload_3         
	//*  34   71:bipush          126
	//*  35   73:icmple          78
							return false;
	//   36   76:iconst_0        
	//   37   77:ireturn         
						i = s.offsetByCodePoints(i, 1);
	//   38   78:aload           4
	//   39   80:iload_1         
	//   40   81:iconst_1        
	//   41   82:invokevirtual   #214 <Method int String.offsetByCodePoints(int, int)>
	//   42   85:istore_1        
					} else
	//*  43   86:goto            52
					{
						return false;
	//   44   89:iconst_0        
	//   45   90:ireturn         
					}
				}
			}
		} while(true);
		return true;
	//   46   91:iconst_1        
	//   47   92:ireturn         
	}

	public static transient boolean containsOnlyNonCrLfPrintableAscii(String as[])
	{
		if(as == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		else
			return containsOnlyNonCrLfPrintableAscii(((Collection) (Arrays.asList(((Object []) (as))))));
	//    4    6:aload_0         
	//    5    7:invokestatic    #138 <Method java.util.List Arrays.asList(Object[])>
	//    6   10:invokestatic    #222 <Method boolean containsOnlyNonCrLfPrintableAscii(Collection)>
	//    7   13:ireturn         
	}

	public static boolean containsOnlyPrintableAscii(Collection collection)
	{
		if(collection == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*   4    6:aload_0         
	//*   5    7:invokeinterface #192 <Method Iterator Collection.iterator()>
	//*   6   12:astore_0        
	//*   7   13:aload_0         
	//*   8   14:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//*   9   19:ifeq            51
		{
			String s = (String)((Iterator) (collection)).next();
	//   10   22:aload_0         
	//   11   23:invokeinterface #202 <Method Object Iterator.next()>
	//   12   28:checkcast       #122 <Class String>
	//   13   31:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (s))) && !TextUtilsPort.isPrintableAsciiOnly(((CharSequence) (s))))
	//*  14   32:aload_1         
	//*  15   33:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   36:ifeq            42
	//*  17   39:goto            13
	//*  18   42:aload_1         
	//*  19   43:invokestatic    #226 <Method boolean VCardUtils$TextUtilsPort.isPrintableAsciiOnly(CharSequence)>
	//*  20   46:ifne            13
				return false;
	//   21   49:iconst_0        
	//   22   50:ireturn         
		}

		return true;
	//   23   51:iconst_1        
	//   24   52:ireturn         
	}

	public static transient boolean containsOnlyPrintableAscii(String as[])
	{
		if(as == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		else
			return containsOnlyPrintableAscii(((Collection) (Arrays.asList(((Object []) (as))))));
	//    4    6:aload_0         
	//    5    7:invokestatic    #138 <Method java.util.List Arrays.asList(Object[])>
	//    6   10:invokestatic    #228 <Method boolean containsOnlyPrintableAscii(Collection)>
	//    7   13:ireturn         
	}

	public static boolean containsOnlyWhiteSpaces(Collection collection)
	{
		if(collection == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		collection = ((Collection) (collection.iterator()));
	//    4    6:aload_0         
	//    5    7:invokeinterface #192 <Method Iterator Collection.iterator()>
	//    6   12:astore_0        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//    7   13:aload_0         
	//    8   14:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            77
			String s = (String)((Iterator) (collection)).next();
	//   10   22:aload_0         
	//   11   23:invokeinterface #202 <Method Object Iterator.next()>
	//   12   28:checkcast       #122 <Class String>
	//   13   31:astore_3        
			if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  14   32:aload_3         
	//*  15   33:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   36:ifeq            42
	//*  17   39:goto            13
			{
				int j = s.length();
	//   18   42:aload_3         
	//   19   43:invokevirtual   #206 <Method int String.length()>
	//   20   46:istore_2        
				int i = 0;
	//   21   47:iconst_0        
	//   22   48:istore_1        
				while(i < j) 
	//*  23   49:iload_1         
	//*  24   50:iload_2         
	//*  25   51:icmpge          13
				{
					if(!Character.isWhitespace(s.codePointAt(i)))
	//*  26   54:aload_3         
	//*  27   55:iload_1         
	//*  28   56:invokevirtual   #210 <Method int String.codePointAt(int)>
	//*  29   59:invokestatic    #233 <Method boolean Character.isWhitespace(int)>
	//*  30   62:ifne            67
						return false;
	//   31   65:iconst_0        
	//   32   66:ireturn         
					i = s.offsetByCodePoints(i, 1);
	//   33   67:aload_3         
	//   34   68:iload_1         
	//   35   69:iconst_1        
	//   36   70:invokevirtual   #214 <Method int String.offsetByCodePoints(int, int)>
	//   37   73:istore_1        
				}
			}
		} while(true);
	//   38   74:goto            49
		return true;
	//   39   77:iconst_1        
	//   40   78:ireturn         
	}

	public static transient boolean containsOnlyWhiteSpaces(String as[])
	{
		if(as == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		else
			return containsOnlyWhiteSpaces(((Collection) (Arrays.asList(((Object []) (as))))));
	//    4    6:aload_0         
	//    5    7:invokestatic    #138 <Method java.util.List Arrays.asList(Object[])>
	//    6   10:invokestatic    #235 <Method boolean containsOnlyWhiteSpaces(Collection)>
	//    7   13:ireturn         
	}

	public static int getPhoneNumberFormat(int i)
	{
		return !VCardConfig.isJapaneseDevice(i) ? 1 : 2;
	//    0    0:iload_0         
	//    1    1:invokestatic    #241 <Method boolean VCardConfig.isJapaneseDevice(int)>
	//    2    4:ifeq            9
	//    3    7:iconst_2        
	//    4    8:ireturn         
	//    5    9:iconst_1        
	//    6   10:ireturn         
	}

	public static String getPhoneTypeString(Integer integer)
	{
		return (String)sKnownPhoneTypesMap_ItoS.get(integer.intValue());
	//    0    0:getstatic       #35  <Field SparseArray sKnownPhoneTypesMap_ItoS>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #246 <Method int Integer.intValue()>
	//    3    7:invokevirtual   #250 <Method Object SparseArray.get(int)>
	//    4   10:checkcast       #122 <Class String>
	//    5   13:areturn         
	}

	public static boolean isMobilePhoneLabel(String s)
	{
		return "_AUTO_CELL".equals(((Object) (s))) || sMobilePhoneLabelSet.contains(((Object) (s)));
	//    0    0:ldc1            #254 <String "_AUTO_CELL">
	//    1    2:aload_0         
	//    2    3:invokevirtual   #257 <Method boolean String.equals(Object)>
	//    3    6:ifne            26
	//    4    9:getstatic       #143 <Field Set sMobilePhoneLabelSet>
	//    5   12:aload_0         
	//    6   13:invokeinterface #260 <Method boolean Set.contains(Object)>
	//    7   18:ifeq            24
	//    8   21:goto            26
	//    9   24:iconst_0        
	//   10   25:ireturn         
	//   11   26:iconst_1        
	//   12   27:ireturn         
	}

	public static boolean isV21Word(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		int j = s.length();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #206 <Method int String.length()>
	//    7   13:istore_2        
		for(int i = 0; i < j;)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          69
		{
			int k = s.codePointAt(i);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #210 <Method int String.codePointAt(int)>
	//   16   26:istore_3        
			if(32 <= k && k <= 126)
	//*  17   27:bipush          32
	//*  18   29:iload_3         
	//*  19   30:icmpgt          67
	//*  20   33:iload_3         
	//*  21   34:bipush          126
	//*  22   36:icmpgt          67
			{
				if(sUnAcceptableAsciiInV21WordSet.contains(((Object) (Character.valueOf((char)k)))))
	//*  23   39:getstatic       #150 <Field Set sUnAcceptableAsciiInV21WordSet>
	//*  24   42:iload_3         
	//*  25   43:int2char        
	//*  26   44:invokestatic    #148 <Method Character Character.valueOf(char)>
	//*  27   47:invokeinterface #260 <Method boolean Set.contains(Object)>
	//*  28   52:ifeq            57
					return false;
	//   29   55:iconst_0        
	//   30   56:ireturn         
				i = s.offsetByCodePoints(i, 1);
	//   31   57:aload_0         
	//   32   58:iload_1         
	//   33   59:iconst_1        
	//   34   60:invokevirtual   #214 <Method int String.offsetByCodePoints(int, int)>
	//   35   63:istore_1        
			} else
	//*  36   64:goto            16
			{
				return false;
	//   37   67:iconst_0        
	//   38   68:ireturn         
			}
		}

		return true;
	//   39   69:iconst_1        
	//   40   70:ireturn         
	}

	public static boolean isValidInV21ButUnknownToContactsPhoteType(String s)
	{
		return sPhoneTypesUnknownToContactsSet.contains(((Object) (s)));
	//    0    0:getstatic       #86  <Field Set sPhoneTypesUnknownToContactsSet>
	//    1    3:aload_0         
	//    2    4:invokeinterface #260 <Method boolean Set.contains(Object)>
	//    3    9:ireturn         
	}

	public static String[] sortNameElements(int i, String s, String s1, String s2)
	{
		String as[] = new String[3];
	//    0    0:iconst_3        
	//    1    1:anewarray       String[]
	//    2    4:astore          4
		i = VCardConfig.getNameOrderType(i);
	//    3    6:iload_0         
	//    4    7:invokestatic    #265 <Method int VCardConfig.getNameOrderType(int)>
	//    5   10:istore_0        
		if(i != 4)
	//*   6   11:iload_0         
	//*   7   12:iconst_4        
	//*   8   13:icmpeq          104
		{
			if(i != 8)
	//*   9   16:iload_0         
	//*  10   17:bipush          8
	//*  11   19:icmpeq          40
			{
				as[0] = s2;
	//   12   22:aload           4
	//   13   24:iconst_0        
	//   14   25:aload_3         
	//   15   26:aastore         
				as[1] = s1;
	//   16   27:aload           4
	//   17   29:iconst_1        
	//   18   30:aload_2         
	//   19   31:aastore         
				as[2] = s;
	//   20   32:aload           4
	//   21   34:iconst_2        
	//   22   35:aload_1         
	//   23   36:aastore         
				return as;
	//   24   37:aload           4
	//   25   39:areturn         
			}
			if(containsOnlyPrintableAscii(new String[] {
	s
}) && containsOnlyPrintableAscii(new String[] {
	s2
}))
	//*  26   40:iconst_1        
	//*  27   41:anewarray       String[]
	//*  28   44:dup             
	//*  29   45:iconst_0        
	//*  30   46:aload_1         
	//*  31   47:aastore         
	//*  32   48:invokestatic    #267 <Method boolean containsOnlyPrintableAscii(String[])>
	//*  33   51:ifeq            86
	//*  34   54:iconst_1        
	//*  35   55:anewarray       String[]
	//*  36   58:dup             
	//*  37   59:iconst_0        
	//*  38   60:aload_3         
	//*  39   61:aastore         
	//*  40   62:invokestatic    #267 <Method boolean containsOnlyPrintableAscii(String[])>
	//*  41   65:ifeq            86
			{
				as[0] = s2;
	//   42   68:aload           4
	//   43   70:iconst_0        
	//   44   71:aload_3         
	//   45   72:aastore         
				as[1] = s1;
	//   46   73:aload           4
	//   47   75:iconst_1        
	//   48   76:aload_2         
	//   49   77:aastore         
				as[2] = s;
	//   50   78:aload           4
	//   51   80:iconst_2        
	//   52   81:aload_1         
	//   53   82:aastore         
				return as;
	//   54   83:aload           4
	//   55   85:areturn         
			} else
			{
				as[0] = s;
	//   56   86:aload           4
	//   57   88:iconst_0        
	//   58   89:aload_1         
	//   59   90:aastore         
				as[1] = s1;
	//   60   91:aload           4
	//   61   93:iconst_1        
	//   62   94:aload_2         
	//   63   95:aastore         
				as[2] = s2;
	//   64   96:aload           4
	//   65   98:iconst_2        
	//   66   99:aload_3         
	//   67  100:aastore         
				return as;
	//   68  101:aload           4
	//   69  103:areturn         
			}
		} else
		{
			as[0] = s1;
	//   70  104:aload           4
	//   71  106:iconst_0        
	//   72  107:aload_2         
	//   73  108:aastore         
			as[1] = s2;
	//   74  109:aload           4
	//   75  111:iconst_1        
	//   76  112:aload_3         
	//   77  113:aastore         
			as[2] = s;
	//   78  114:aload           4
	//   79  116:iconst_2        
	//   80  117:aload_1         
	//   81  118:aastore         
			return as;
	//   82  119:aload           4
	//   83  121:areturn         
		}
	}

	public static String toHalfWidthString(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #162 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #163 <Method void StringBuilder()>
	//    8   16:astore          4
		int j = s.length();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #206 <Method int String.length()>
	//   11   22:istore_3        
		for(int i = 0; i < j; i = s.offsetByCodePoints(i, 1))
	//*  12   23:iconst_0        
	//*  13   24:istore_2        
	//*  14   25:iload_2         
	//*  15   26:iload_3         
	//*  16   27:icmpge          75
		{
			char c = s.charAt(i);
	//   17   30:aload_0         
	//   18   31:iload_2         
	//   19   32:invokevirtual   #273 <Method char String.charAt(int)>
	//   20   35:istore_1        
			String s1 = JapaneseUtils.tryGetHalfWidthText(c);
	//   21   36:iload_1         
	//   22   37:invokestatic    #279 <Method String JapaneseUtils.tryGetHalfWidthText(char)>
	//   23   40:astore          5
			if(s1 != null)
	//*  24   42:aload           5
	//*  25   44:ifnull          58
				stringbuilder.append(s1);
	//   26   47:aload           4
	//   27   49:aload           5
	//   28   51:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
			else
	//*  30   55:goto            65
				stringbuilder.append(c);
	//   31   58:aload           4
	//   32   60:iload_1         
	//   33   61:invokevirtual   #180 <Method StringBuilder StringBuilder.append(char)>
	//   34   64:pop             
		}

	//   35   65:aload_0         
	//   36   66:iload_2         
	//   37   67:iconst_1        
	//   38   68:invokevirtual   #214 <Method int String.offsetByCodePoints(int, int)>
	//   39   71:istore_2        
	//*  40   72:goto            25
		return stringbuilder.toString();
	//   41   75:aload           4
	//   42   77:invokevirtual   #184 <Method String StringBuilder.toString()>
	//   43   80:areturn         
	}

	private static String toStringAsParamValue(String s, int ai[])
	{
		String s1 = s;
	//    0    0:aload_0         
	//    1    1:astore          9
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   2    3:aload_0         
	//*   3    4:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4    7:ifeq            15
			s1 = "";
	//    5   10:ldc2            #283 <String "">
	//    6   13:astore          9
		s = ((String) (new StringBuilder()));
	//    7   15:new             #162 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #163 <Method void StringBuilder()>
	//   10   22:astore_0        
		int k = s1.length();
	//   11   23:aload           9
	//   12   25:invokevirtual   #206 <Method int String.length()>
	//   13   28:istore          6
		int i = 0;
	//   14   30:iconst_0        
	//   15   31:istore_2        
		boolean flag;
		boolean flag1;
		for(flag = false; i < k; flag = flag1)
	//*  16   32:iconst_0        
	//*  17   33:istore_3        
	//*  18   34:iload_2         
	//*  19   35:iload           6
	//*  20   37:icmpge          133
		{
			int l = s1.codePointAt(i);
	//   21   40:aload           9
	//   22   42:iload_2         
	//   23   43:invokevirtual   #210 <Method int String.codePointAt(int)>
	//   24   46:istore          7
			flag1 = flag;
	//   25   48:iload_3         
	//   26   49:istore          4
			if(l >= 32)
	//*  27   51:iload           7
	//*  28   53:bipush          32
	//*  29   55:icmplt          119
				if(l == 34)
	//*  30   58:iload           7
	//*  31   60:bipush          34
	//*  32   62:icmpne          71
				{
					flag1 = flag;
	//   33   65:iload_3         
	//   34   66:istore          4
				} else
	//*  35   68:goto            119
				{
					((StringBuilder) (s)).appendCodePoint(l);
	//   36   71:aload_0         
	//   37   72:iload           7
	//   38   74:invokevirtual   #287 <Method StringBuilder StringBuilder.appendCodePoint(int)>
	//   39   77:pop             
					int i1 = ai.length;
	//   40   78:aload_1         
	//   41   79:arraylength     
	//   42   80:istore          8
					int j = 0;
	//   43   82:iconst_0        
	//   44   83:istore          5
					do
					{
						flag1 = flag;
	//   45   85:iload_3         
	//   46   86:istore          4
						if(j >= i1)
							break;
	//   47   88:iload           5
	//   48   90:iload           8
	//   49   92:icmpge          119
						if(l == ai[j])
	//*  50   95:iload           7
	//*  51   97:aload_1         
	//*  52   98:iload           5
	//*  53  100:iaload          
	//*  54  101:icmpne          110
						{
							flag1 = true;
	//   55  104:iconst_1        
	//   56  105:istore          4
							break;
	//   57  107:goto            119
						}
						j++;
	//   58  110:iload           5
	//   59  112:iconst_1        
	//   60  113:iadd            
	//   61  114:istore          5
					} while(true);
	//   62  116:goto            85
				}
			i = s1.offsetByCodePoints(i, 1);
	//   63  119:aload           9
	//   64  121:iload_2         
	//   65  122:iconst_1        
	//   66  123:invokevirtual   #214 <Method int String.offsetByCodePoints(int, int)>
	//   67  126:istore_2        
		}

	//   68  127:iload           4
	//   69  129:istore_3        
	//*  70  130:goto            34
		ai = ((int []) (((StringBuilder) (s)).toString()));
	//   71  133:aload_0         
	//   72  134:invokevirtual   #184 <Method String StringBuilder.toString()>
	//   73  137:astore_1        
		if(((String) (ai)).length() != 0 && !containsOnlyWhiteSpaces(new String[] {
	ai
}))
	//*  74  138:aload_1         
	//*  75  139:invokevirtual   #206 <Method int String.length()>
	//*  76  142:ifeq            201
	//*  77  145:iconst_1        
	//*  78  146:anewarray       String[]
	//*  79  149:dup             
	//*  80  150:iconst_0        
	//*  81  151:aload_1         
	//*  82  152:aastore         
	//*  83  153:invokestatic    #289 <Method boolean containsOnlyWhiteSpaces(String[])>
	//*  84  156:ifeq            162
	//*  85  159:goto            201
		{
			s = ((String) (ai));
	//   86  162:aload_1         
	//   87  163:astore_0        
			if(flag)
	//*  88  164:iload_3         
	//*  89  165:ifeq            205
			{
				s = ((String) (new StringBuilder()));
	//   90  168:new             #162 <Class StringBuilder>
	//   91  171:dup             
	//   92  172:invokespecial   #163 <Method void StringBuilder()>
	//   93  175:astore_0        
				((StringBuilder) (s)).append('"');
	//   94  176:aload_0         
	//   95  177:bipush          34
	//   96  179:invokevirtual   #180 <Method StringBuilder StringBuilder.append(char)>
	//   97  182:pop             
				((StringBuilder) (s)).append(((String) (ai)));
	//   98  183:aload_0         
	//   99  184:aload_1         
	//  100  185:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//  101  188:pop             
				((StringBuilder) (s)).append('"');
	//  102  189:aload_0         
	//  103  190:bipush          34
	//  104  192:invokevirtual   #180 <Method StringBuilder StringBuilder.append(char)>
	//  105  195:pop             
				return ((StringBuilder) (s)).toString();
	//  106  196:aload_0         
	//  107  197:invokevirtual   #184 <Method String StringBuilder.toString()>
	//  108  200:areturn         
			}
		} else
		{
			s = "";
	//  109  201:ldc2            #283 <String "">
	//  110  204:astore_0        
		}
		return s;
	//  111  205:aload_0         
	//  112  206:areturn         
	}

	public static String toStringAsV30ParamValue(String s)
	{
		return toStringAsParamValue(s, sEscapeIndicatorsV30);
	//    0    0:aload_0         
	//    1    1:getstatic       #152 <Field int[] sEscapeIndicatorsV30>
	//    2    4:invokestatic    #292 <Method String toStringAsParamValue(String, int[])>
	//    3    7:areturn         
	}

	public static String toStringAsV40ParamValue(String s)
	{
		return toStringAsParamValue(s, sEscapeIndicatorsV40);
	//    0    0:aload_0         
	//    1    1:getstatic       #154 <Field int[] sEscapeIndicatorsV40>
	//    2    4:invokestatic    #292 <Method String toStringAsParamValue(String, int[])>
	//    3    7:areturn         
	}

	private static final int sEscapeIndicatorsV30[] = {
		58, 59, 44, 32
	};
	private static final int sEscapeIndicatorsV40[] = {
		59, 58
	};
	private static final SparseArray sKnownImPropNameMap_ItoS;
	private static final Map sKnownPhoneTypeMap_StoI;
	private static final SparseArray sKnownPhoneTypesMap_ItoS;
	private static final Set sMobilePhoneLabelSet = new HashSet(((Collection) (Arrays.asList(((Object []) (new String[] {
		"MOBILE", "\u643A\u5E2F\u96FB\u8A71", "\u643A\u5E2F", "\u30B1\u30A4\u30BF\u30A4", "\uFF79\uFF72\uFF80\uFF72"
	}))))));
	private static final Set sPhoneTypesUnknownToContactsSet;
	private static final Set sUnAcceptableAsciiInV21WordSet = new HashSet(((Collection) (Arrays.asList(((Object []) (new Character[] {
		Character.valueOf('['), Character.valueOf(']'), Character.valueOf('='), Character.valueOf(':'), Character.valueOf('.'), Character.valueOf(','), Character.valueOf(' ')
	}))))));

	static 
	{
		sKnownPhoneTypesMap_ItoS = new SparseArray();
	//    0    0:new             #30  <Class SparseArray>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void SparseArray()>
	//    3    7:putstatic       #35  <Field SparseArray sKnownPhoneTypesMap_ItoS>
		sKnownPhoneTypeMap_StoI = ((Map) (new HashMap()));
	//    4   10:new             #37  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #38  <Method void HashMap()>
	//    7   17:putstatic       #40  <Field Map sKnownPhoneTypeMap_StoI>
		sKnownPhoneTypesMap_ItoS.put(9, "CAR");
	//    8   20:getstatic       #35  <Field SparseArray sKnownPhoneTypesMap_ItoS>
	//    9   23:bipush          9
	//   10   25:ldc1            #42  <String "CAR">
	//   11   27:invokevirtual   #46  <Method void SparseArray.put(int, Object)>
		sKnownPhoneTypeMap_StoI.put("CAR", ((Object) (Integer.valueOf(9))));
	//   12   30:getstatic       #40  <Field Map sKnownPhoneTypeMap_StoI>
	//   13   33:ldc1            #42  <String "CAR">
	//   14   35:bipush          9
	//   15   37:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   16   40:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   17   45:pop             
		sKnownPhoneTypesMap_ItoS.put(6, "PAGER");
	//   18   46:getstatic       #35  <Field SparseArray sKnownPhoneTypesMap_ItoS>
	//   19   49:bipush          6
	//   20   51:ldc1            #59  <String "PAGER">
	//   21   53:invokevirtual   #46  <Method void SparseArray.put(int, Object)>
		sKnownPhoneTypeMap_StoI.put("PAGER", ((Object) (Integer.valueOf(6))));
	//   22   56:getstatic       #40  <Field Map sKnownPhoneTypeMap_StoI>
	//   23   59:ldc1            #59  <String "PAGER">
	//   24   61:bipush          6
	//   25   63:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   26   66:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   27   71:pop             
		sKnownPhoneTypesMap_ItoS.put(11, "ISDN");
	//   28   72:getstatic       #35  <Field SparseArray sKnownPhoneTypesMap_ItoS>
	//   29   75:bipush          11
	//   30   77:ldc1            #61  <String "ISDN">
	//   31   79:invokevirtual   #46  <Method void SparseArray.put(int, Object)>
		sKnownPhoneTypeMap_StoI.put("ISDN", ((Object) (Integer.valueOf(11))));
	//   32   82:getstatic       #40  <Field Map sKnownPhoneTypeMap_StoI>
	//   33   85:ldc1            #61  <String "ISDN">
	//   34   87:bipush          11
	//   35   89:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   36   92:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   37   97:pop             
		sKnownPhoneTypeMap_StoI.put("HOME", ((Object) (Integer.valueOf(1))));
	//   38   98:getstatic       #40  <Field Map sKnownPhoneTypeMap_StoI>
	//   39  101:ldc1            #63  <String "HOME">
	//   40  103:iconst_1        
	//   41  104:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   42  107:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   43  112:pop             
		sKnownPhoneTypeMap_StoI.put("WORK", ((Object) (Integer.valueOf(3))));
	//   44  113:getstatic       #40  <Field Map sKnownPhoneTypeMap_StoI>
	//   45  116:ldc1            #65  <String "WORK">
	//   46  118:iconst_3        
	//   47  119:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   48  122:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   49  127:pop             
		sKnownPhoneTypeMap_StoI.put("CELL", ((Object) (Integer.valueOf(2))));
	//   50  128:getstatic       #40  <Field Map sKnownPhoneTypeMap_StoI>
	//   51  131:ldc1            #67  <String "CELL">
	//   52  133:iconst_2        
	//   53  134:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   54  137:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   55  142:pop             
		sKnownPhoneTypeMap_StoI.put("OTHER", ((Object) (Integer.valueOf(7))));
	//   56  143:getstatic       #40  <Field Map sKnownPhoneTypeMap_StoI>
	//   57  146:ldc1            #69  <String "OTHER">
	//   58  148:bipush          7
	//   59  150:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   60  153:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   61  158:pop             
		sKnownPhoneTypeMap_StoI.put("CALLBACK", ((Object) (Integer.valueOf(8))));
	//   62  159:getstatic       #40  <Field Map sKnownPhoneTypeMap_StoI>
	//   63  162:ldc1            #71  <String "CALLBACK">
	//   64  164:bipush          8
	//   65  166:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   66  169:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   67  174:pop             
		sKnownPhoneTypeMap_StoI.put("COMPANY-MAIN", ((Object) (Integer.valueOf(10))));
	//   68  175:getstatic       #40  <Field Map sKnownPhoneTypeMap_StoI>
	//   69  178:ldc1            #73  <String "COMPANY-MAIN">
	//   70  180:bipush          10
	//   71  182:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   72  185:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   73  190:pop             
		sKnownPhoneTypeMap_StoI.put("RADIO", ((Object) (Integer.valueOf(14))));
	//   74  191:getstatic       #40  <Field Map sKnownPhoneTypeMap_StoI>
	//   75  194:ldc1            #75  <String "RADIO">
	//   76  196:bipush          14
	//   77  198:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   78  201:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   79  206:pop             
		sKnownPhoneTypeMap_StoI.put("TTY-TDD", ((Object) (Integer.valueOf(16))));
	//   80  207:getstatic       #40  <Field Map sKnownPhoneTypeMap_StoI>
	//   81  210:ldc1            #77  <String "TTY-TDD">
	//   82  212:bipush          16
	//   83  214:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   84  217:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   85  222:pop             
		sKnownPhoneTypeMap_StoI.put("ASSISTANT", ((Object) (Integer.valueOf(19))));
	//   86  223:getstatic       #40  <Field Map sKnownPhoneTypeMap_StoI>
	//   87  226:ldc1            #79  <String "ASSISTANT">
	//   88  228:bipush          19
	//   89  230:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   90  233:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   91  238:pop             
		sKnownPhoneTypeMap_StoI.put("VOICE", ((Object) (Integer.valueOf(7))));
	//   92  239:getstatic       #40  <Field Map sKnownPhoneTypeMap_StoI>
	//   93  242:ldc1            #81  <String "VOICE">
	//   94  244:bipush          7
	//   95  246:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   96  249:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   97  254:pop             
		sPhoneTypesUnknownToContactsSet = ((Set) (new HashSet()));
	//   98  255:new             #83  <Class HashSet>
	//   99  258:dup             
	//  100  259:invokespecial   #84  <Method void HashSet()>
	//  101  262:putstatic       #86  <Field Set sPhoneTypesUnknownToContactsSet>
		sPhoneTypesUnknownToContactsSet.add("MODEM");
	//  102  265:getstatic       #86  <Field Set sPhoneTypesUnknownToContactsSet>
	//  103  268:ldc1            #88  <String "MODEM">
	//  104  270:invokeinterface #94  <Method boolean Set.add(Object)>
	//  105  275:pop             
		sPhoneTypesUnknownToContactsSet.add("MSG");
	//  106  276:getstatic       #86  <Field Set sPhoneTypesUnknownToContactsSet>
	//  107  279:ldc1            #96  <String "MSG">
	//  108  281:invokeinterface #94  <Method boolean Set.add(Object)>
	//  109  286:pop             
		sPhoneTypesUnknownToContactsSet.add("BBS");
	//  110  287:getstatic       #86  <Field Set sPhoneTypesUnknownToContactsSet>
	//  111  290:ldc1            #98  <String "BBS">
	//  112  292:invokeinterface #94  <Method boolean Set.add(Object)>
	//  113  297:pop             
		sPhoneTypesUnknownToContactsSet.add("VIDEO");
	//  114  298:getstatic       #86  <Field Set sPhoneTypesUnknownToContactsSet>
	//  115  301:ldc1            #100 <String "VIDEO">
	//  116  303:invokeinterface #94  <Method boolean Set.add(Object)>
	//  117  308:pop             
		sKnownImPropNameMap_ItoS = new SparseArray();
	//  118  309:new             #30  <Class SparseArray>
	//  119  312:dup             
	//  120  313:invokespecial   #33  <Method void SparseArray()>
	//  121  316:putstatic       #102 <Field SparseArray sKnownImPropNameMap_ItoS>
		sKnownImPropNameMap_ItoS.put(0, "X-AIM");
	//  122  319:getstatic       #102 <Field SparseArray sKnownImPropNameMap_ItoS>
	//  123  322:iconst_0        
	//  124  323:ldc1            #104 <String "X-AIM">
	//  125  325:invokevirtual   #46  <Method void SparseArray.put(int, Object)>
		sKnownImPropNameMap_ItoS.put(1, "X-MSN");
	//  126  328:getstatic       #102 <Field SparseArray sKnownImPropNameMap_ItoS>
	//  127  331:iconst_1        
	//  128  332:ldc1            #106 <String "X-MSN">
	//  129  334:invokevirtual   #46  <Method void SparseArray.put(int, Object)>
		sKnownImPropNameMap_ItoS.put(2, "X-YAHOO");
	//  130  337:getstatic       #102 <Field SparseArray sKnownImPropNameMap_ItoS>
	//  131  340:iconst_2        
	//  132  341:ldc1            #108 <String "X-YAHOO">
	//  133  343:invokevirtual   #46  <Method void SparseArray.put(int, Object)>
		sKnownImPropNameMap_ItoS.put(3, "X-SKYPE-USERNAME");
	//  134  346:getstatic       #102 <Field SparseArray sKnownImPropNameMap_ItoS>
	//  135  349:iconst_3        
	//  136  350:ldc1            #110 <String "X-SKYPE-USERNAME">
	//  137  352:invokevirtual   #46  <Method void SparseArray.put(int, Object)>
		sKnownImPropNameMap_ItoS.put(5, "X-GOOGLE-TALK");
	//  138  355:getstatic       #102 <Field SparseArray sKnownImPropNameMap_ItoS>
	//  139  358:iconst_5        
	//  140  359:ldc1            #112 <String "X-GOOGLE-TALK">
	//  141  361:invokevirtual   #46  <Method void SparseArray.put(int, Object)>
		sKnownImPropNameMap_ItoS.put(6, "X-ICQ");
	//  142  364:getstatic       #102 <Field SparseArray sKnownImPropNameMap_ItoS>
	//  143  367:bipush          6
	//  144  369:ldc1            #114 <String "X-ICQ">
	//  145  371:invokevirtual   #46  <Method void SparseArray.put(int, Object)>
		sKnownImPropNameMap_ItoS.put(7, "X-JABBER");
	//  146  374:getstatic       #102 <Field SparseArray sKnownImPropNameMap_ItoS>
	//  147  377:bipush          7
	//  148  379:ldc1            #116 <String "X-JABBER">
	//  149  381:invokevirtual   #46  <Method void SparseArray.put(int, Object)>
		sKnownImPropNameMap_ItoS.put(4, "X-QQ");
	//  150  384:getstatic       #102 <Field SparseArray sKnownImPropNameMap_ItoS>
	//  151  387:iconst_4        
	//  152  388:ldc1            #118 <String "X-QQ">
	//  153  390:invokevirtual   #46  <Method void SparseArray.put(int, Object)>
		sKnownImPropNameMap_ItoS.put(8, "X-NETMEETING");
	//  154  393:getstatic       #102 <Field SparseArray sKnownImPropNameMap_ItoS>
	//  155  396:bipush          8
	//  156  398:ldc1            #120 <String "X-NETMEETING">
	//  157  400:invokevirtual   #46  <Method void SparseArray.put(int, Object)>
	//  158  403:new             #83  <Class HashSet>
	//  159  406:dup             
	//  160  407:iconst_5        
	//  161  408:anewarray       String[]
	//  162  411:dup             
	//  163  412:iconst_0        
	//  164  413:ldc1            #124 <String "MOBILE">
	//  165  415:aastore         
	//  166  416:dup             
	//  167  417:iconst_1        
	//  168  418:ldc1            #126 <String "\u643A\u5E2F\u96FB\u8A71">
	//  169  420:aastore         
	//  170  421:dup             
	//  171  422:iconst_2        
	//  172  423:ldc1            #128 <String "\u643A\u5E2F">
	//  173  425:aastore         
	//  174  426:dup             
	//  175  427:iconst_3        
	//  176  428:ldc1            #130 <String "\u30B1\u30A4\u30BF\u30A4">
	//  177  430:aastore         
	//  178  431:dup             
	//  179  432:iconst_4        
	//  180  433:ldc1            #132 <String "\uFF79\uFF72\uFF80\uFF72">
	//  181  435:aastore         
	//  182  436:invokestatic    #138 <Method java.util.List Arrays.asList(Object[])>
	//  183  439:invokespecial   #141 <Method void HashSet(Collection)>
	//  184  442:putstatic       #143 <Field Set sMobilePhoneLabelSet>
	//  185  445:new             #83  <Class HashSet>
	//  186  448:dup             
	//  187  449:bipush          7
	//  188  451:anewarray       Character[]
	//  189  454:dup             
	//  190  455:iconst_0        
	//  191  456:bipush          91
	//  192  458:invokestatic    #148 <Method Character Character.valueOf(char)>
	//  193  461:aastore         
	//  194  462:dup             
	//  195  463:iconst_1        
	//  196  464:bipush          93
	//  197  466:invokestatic    #148 <Method Character Character.valueOf(char)>
	//  198  469:aastore         
	//  199  470:dup             
	//  200  471:iconst_2        
	//  201  472:bipush          61
	//  202  474:invokestatic    #148 <Method Character Character.valueOf(char)>
	//  203  477:aastore         
	//  204  478:dup             
	//  205  479:iconst_3        
	//  206  480:bipush          58
	//  207  482:invokestatic    #148 <Method Character Character.valueOf(char)>
	//  208  485:aastore         
	//  209  486:dup             
	//  210  487:iconst_4        
	//  211  488:bipush          46
	//  212  490:invokestatic    #148 <Method Character Character.valueOf(char)>
	//  213  493:aastore         
	//  214  494:dup             
	//  215  495:iconst_5        
	//  216  496:bipush          44
	//  217  498:invokestatic    #148 <Method Character Character.valueOf(char)>
	//  218  501:aastore         
	//  219  502:dup             
	//  220  503:bipush          6
	//  221  505:bipush          32
	//  222  507:invokestatic    #148 <Method Character Character.valueOf(char)>
	//  223  510:aastore         
	//  224  511:invokestatic    #138 <Method java.util.List Arrays.asList(Object[])>
	//  225  514:invokespecial   #141 <Method void HashSet(Collection)>
	//  226  517:putstatic       #150 <Field Set sUnAcceptableAsciiInV21WordSet>
	//  227  520:iconst_4        
	//  228  521:newarray        int[]
	//  229  523:dup             
	//  230  524:iconst_0        
	//  231  525:bipush          58
	//  232  527:iastore         
	//  233  528:dup             
	//  234  529:iconst_1        
	//  235  530:bipush          59
	//  236  532:iastore         
	//  237  533:dup             
	//  238  534:iconst_2        
	//  239  535:bipush          44
	//  240  537:iastore         
	//  241  538:dup             
	//  242  539:iconst_3        
	//  243  540:bipush          32
	//  244  542:iastore         
	//  245  543:putstatic       #152 <Field int[] sEscapeIndicatorsV30>
	//  246  546:iconst_2        
	//  247  547:newarray        int[]
	//  248  549:dup             
	//  249  550:iconst_0        
	//  250  551:bipush          59
	//  251  553:iastore         
	//  252  554:dup             
	//  253  555:iconst_1        
	//  254  556:bipush          58
	//  255  558:iastore         
	//  256  559:putstatic       #154 <Field int[] sEscapeIndicatorsV40>
	//* 257  562:return          
	}
}
