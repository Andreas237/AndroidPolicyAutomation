// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.libphonenumber.android;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package io.michaelrocks.libphonenumber.android:
//			RegexCache, PhoneNumberUtil

public class AsYouTypeFormatter
{

	AsYouTypeFormatter(PhoneNumberUtil phonenumberutil, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void Object()>
		currentOutput = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #94  <String "">
	//    4    7:putfield        #96  <Field String currentOutput>
		formattingTemplate = new StringBuilder();
	//    5   10:aload_0         
	//    6   11:new             #98  <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #99  <Method void StringBuilder()>
	//    9   18:putfield        #101 <Field StringBuilder formattingTemplate>
		currentFormattingPattern = "";
	//   10   21:aload_0         
	//   11   22:ldc1            #94  <String "">
	//   12   24:putfield        #103 <Field String currentFormattingPattern>
		accruedInput = new StringBuilder();
	//   13   27:aload_0         
	//   14   28:new             #98  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #99  <Method void StringBuilder()>
	//   17   35:putfield        #105 <Field StringBuilder accruedInput>
		accruedInputWithoutFormatting = new StringBuilder();
	//   18   38:aload_0         
	//   19   39:new             #98  <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #99  <Method void StringBuilder()>
	//   22   46:putfield        #107 <Field StringBuilder accruedInputWithoutFormatting>
		ableToFormat = true;
	//   23   49:aload_0         
	//   24   50:iconst_1        
	//   25   51:putfield        #109 <Field boolean ableToFormat>
		inputHasFormatting = false;
	//   26   54:aload_0         
	//   27   55:iconst_0        
	//   28   56:putfield        #111 <Field boolean inputHasFormatting>
		isCompleteNumber = false;
	//   29   59:aload_0         
	//   30   60:iconst_0        
	//   31   61:putfield        #113 <Field boolean isCompleteNumber>
		isExpectingCountryCallingCode = false;
	//   32   64:aload_0         
	//   33   65:iconst_0        
	//   34   66:putfield        #115 <Field boolean isExpectingCountryCallingCode>
		lastMatchPosition = 0;
	//   35   69:aload_0         
	//   36   70:iconst_0        
	//   37   71:putfield        #117 <Field int lastMatchPosition>
		originalPosition = 0;
	//   38   74:aload_0         
	//   39   75:iconst_0        
	//   40   76:putfield        #119 <Field int originalPosition>
		positionToRemember = 0;
	//   41   79:aload_0         
	//   42   80:iconst_0        
	//   43   81:putfield        #121 <Field int positionToRemember>
		prefixBeforeNationalNumber = new StringBuilder();
	//   44   84:aload_0         
	//   45   85:new             #98  <Class StringBuilder>
	//   46   88:dup             
	//   47   89:invokespecial   #99  <Method void StringBuilder()>
	//   48   92:putfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
		shouldAddSpaceAfterNationalPrefix = false;
	//   49   95:aload_0         
	//   50   96:iconst_0        
	//   51   97:putfield        #125 <Field boolean shouldAddSpaceAfterNationalPrefix>
		extractedNationalPrefix = "";
	//   52  100:aload_0         
	//   53  101:ldc1            #94  <String "">
	//   54  103:putfield        #127 <Field String extractedNationalPrefix>
		nationalNumber = new StringBuilder();
	//   55  106:aload_0         
	//   56  107:new             #98  <Class StringBuilder>
	//   57  110:dup             
	//   58  111:invokespecial   #99  <Method void StringBuilder()>
	//   59  114:putfield        #129 <Field StringBuilder nationalNumber>
		possibleFormats = ((List) (new ArrayList()));
	//   60  117:aload_0         
	//   61  118:new             #131 <Class ArrayList>
	//   62  121:dup             
	//   63  122:invokespecial   #132 <Method void ArrayList()>
	//   64  125:putfield        #134 <Field List possibleFormats>
		regexCache = new RegexCache(64);
	//   65  128:aload_0         
	//   66  129:new             #136 <Class RegexCache>
	//   67  132:dup             
	//   68  133:bipush          64
	//   69  135:invokespecial   #139 <Method void RegexCache(int)>
	//   70  138:putfield        #141 <Field RegexCache regexCache>
		phoneUtil = phonenumberutil;
	//   71  141:aload_0         
	//   72  142:aload_1         
	//   73  143:putfield        #143 <Field PhoneNumberUtil phoneUtil>
		defaultCountry = s;
	//   74  146:aload_0         
	//   75  147:aload_2         
	//   76  148:putfield        #145 <Field String defaultCountry>
		currentMetadata = getMetadataForRegion(defaultCountry);
	//   77  151:aload_0         
	//   78  152:aload_0         
	//   79  153:aload_0         
	//   80  154:getfield        #145 <Field String defaultCountry>
	//   81  157:invokespecial   #148 <Method Phonemetadata$PhoneMetadata getMetadataForRegion(String)>
	//   82  160:putfield        #150 <Field Phonemetadata$PhoneMetadata currentMetadata>
		defaultMetadata = currentMetadata;
	//   83  163:aload_0         
	//   84  164:aload_0         
	//   85  165:getfield        #150 <Field Phonemetadata$PhoneMetadata currentMetadata>
	//   86  168:putfield        #152 <Field Phonemetadata$PhoneMetadata defaultMetadata>
	//   87  171:return          
	}

	private boolean ableToExtractLongerNdd()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(extractedNationalPrefix.length() > 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #127 <Field String extractedNationalPrefix>
	//*   4    6:invokevirtual   #160 <Method int String.length()>
	//*   5    9:ifle            45
		{
			nationalNumber.insert(0, extractedNationalPrefix);
	//    6   12:aload_0         
	//    7   13:getfield        #129 <Field StringBuilder nationalNumber>
	//    8   16:iconst_0        
	//    9   17:aload_0         
	//   10   18:getfield        #127 <Field String extractedNationalPrefix>
	//   11   21:invokevirtual   #164 <Method StringBuilder StringBuilder.insert(int, String)>
	//   12   24:pop             
			int i = prefixBeforeNationalNumber.lastIndexOf(extractedNationalPrefix);
	//   13   25:aload_0         
	//   14   26:getfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
	//   15   29:aload_0         
	//   16   30:getfield        #127 <Field String extractedNationalPrefix>
	//   17   33:invokevirtual   #168 <Method int StringBuilder.lastIndexOf(String)>
	//   18   36:istore_1        
			prefixBeforeNationalNumber.setLength(i);
	//   19   37:aload_0         
	//   20   38:getfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
	//   21   41:iload_1         
	//   22   42:invokevirtual   #171 <Method void StringBuilder.setLength(int)>
		}
		if(!extractedNationalPrefix.equals(((Object) (removeNationalPrefixFromNationalNumber()))))
	//*  23   45:aload_0         
	//*  24   46:getfield        #127 <Field String extractedNationalPrefix>
	//*  25   49:aload_0         
	//*  26   50:invokespecial   #175 <Method String removeNationalPrefixFromNationalNumber()>
	//*  27   53:invokevirtual   #179 <Method boolean String.equals(Object)>
	//*  28   56:ifne            61
			flag = true;
	//   29   59:iconst_1        
	//   30   60:istore_2        
		return flag;
	//   31   61:iload_2         
	//   32   62:ireturn         
	}

	private String appendNationalNumber(String s)
	{
		int i = prefixBeforeNationalNumber.length();
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
	//    2    4:invokevirtual   #182 <Method int StringBuilder.length()>
	//    3    7:istore_2        
		if(shouldAddSpaceAfterNationalPrefix && i > 0 && prefixBeforeNationalNumber.charAt(i - 1) != ' ')
	//*   4    8:aload_0         
	//*   5    9:getfield        #125 <Field boolean shouldAddSpaceAfterNationalPrefix>
	//*   6   12:ifeq            68
	//*   7   15:iload_2         
	//*   8   16:ifle            68
	//*   9   19:aload_0         
	//*  10   20:getfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
	//*  11   23:iload_2         
	//*  12   24:iconst_1        
	//*  13   25:isub            
	//*  14   26:invokevirtual   #186 <Method char StringBuilder.charAt(int)>
	//*  15   29:bipush          32
	//*  16   31:icmpeq          68
			return (new StringBuilder()).append(new String(prefixBeforeNationalNumber)).append(' ').append(s).toString();
	//   17   34:new             #98  <Class StringBuilder>
	//   18   37:dup             
	//   19   38:invokespecial   #99  <Method void StringBuilder()>
	//   20   41:new             #156 <Class String>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:getfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
	//   24   49:invokespecial   #189 <Method void String(StringBuilder)>
	//   25   52:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   26   55:bipush          32
	//   27   57:invokevirtual   #196 <Method StringBuilder StringBuilder.append(char)>
	//   28   60:aload_1         
	//   29   61:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   30   64:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   31   67:areturn         
		else
			return (new StringBuilder()).append(((Object) (prefixBeforeNationalNumber))).append(s).toString();
	//   32   68:new             #98  <Class StringBuilder>
	//   33   71:dup             
	//   34   72:invokespecial   #99  <Method void StringBuilder()>
	//   35   75:aload_0         
	//   36   76:getfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
	//   37   79:invokevirtual   #202 <Method StringBuilder StringBuilder.append(Object)>
	//   38   82:aload_1         
	//   39   83:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   40   86:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   41   89:areturn         
	}

	private String attemptToChooseFormattingPattern()
	{
		if(nationalNumber.length() >= 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field StringBuilder nationalNumber>
	//*   2    4:invokevirtual   #182 <Method int StringBuilder.length()>
	//*   3    7:iconst_3        
	//*   4    8:icmplt          61
		{
			getAvailableFormats(nationalNumber.toString());
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #129 <Field StringBuilder nationalNumber>
	//    8   16:invokevirtual   #199 <Method String StringBuilder.toString()>
	//    9   19:invokespecial   #207 <Method void getAvailableFormats(String)>
			String s = attemptToFormatAccruedDigits();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #210 <Method String attemptToFormatAccruedDigits()>
	//   12   26:astore_1        
			if(s.length() > 0)
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #160 <Method int String.length()>
	//*  15   31:ifle            36
				return s;
	//   16   34:aload_1         
	//   17   35:areturn         
			if(maybeCreateNewTemplate())
	//*  18   36:aload_0         
	//*  19   37:invokespecial   #213 <Method boolean maybeCreateNewTemplate()>
	//*  20   40:ifeq            50
				s = inputAccruedNationalNumber();
	//   21   43:aload_0         
	//   22   44:invokespecial   #216 <Method String inputAccruedNationalNumber()>
	//   23   47:astore_1        
			else
	//*  24   48:aload_1         
	//*  25   49:areturn         
				s = accruedInput.toString();
	//   26   50:aload_0         
	//   27   51:getfield        #105 <Field StringBuilder accruedInput>
	//   28   54:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   29   57:astore_1        
			return s;
		} else
	//*  30   58:goto            48
		{
			return appendNationalNumber(nationalNumber.toString());
	//   31   61:aload_0         
	//   32   62:aload_0         
	//   33   63:getfield        #129 <Field StringBuilder nationalNumber>
	//   34   66:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   35   69:invokespecial   #218 <Method String appendNationalNumber(String)>
	//   36   72:areturn         
		}
	}

	private String attemptToChoosePatternWithPrefixExtracted()
	{
		ableToFormat = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #109 <Field boolean ableToFormat>
		isExpectingCountryCallingCode = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #115 <Field boolean isExpectingCountryCallingCode>
		possibleFormats.clear();
	//    6   10:aload_0         
	//    7   11:getfield        #134 <Field List possibleFormats>
	//    8   14:invokeinterface #224 <Method void List.clear()>
		lastMatchPosition = 0;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #117 <Field int lastMatchPosition>
		formattingTemplate.setLength(0);
	//   12   24:aload_0         
	//   13   25:getfield        #101 <Field StringBuilder formattingTemplate>
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #171 <Method void StringBuilder.setLength(int)>
		currentFormattingPattern = "";
	//   16   32:aload_0         
	//   17   33:ldc1            #94  <String "">
	//   18   35:putfield        #103 <Field String currentFormattingPattern>
		return attemptToChooseFormattingPattern();
	//   19   38:aload_0         
	//   20   39:invokespecial   #226 <Method String attemptToChooseFormattingPattern()>
	//   21   42:areturn         
	}

	private boolean attemptToExtractCountryCallingCode()
	{
		if(nationalNumber.length() != 0) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field StringBuilder nationalNumber>
	//    2    4:invokevirtual   #182 <Method int StringBuilder.length()>
	//    3    7:ifne            12
_L1:
		return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
_L2:
		int i;
		Object obj;
		obj = ((Object) (new StringBuilder()));
	//    6   12:new             #98  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #99  <Method void StringBuilder()>
	//    9   19:astore_2        
		i = phoneUtil.extractCountryCode(nationalNumber, ((StringBuilder) (obj)));
	//   10   20:aload_0         
	//   11   21:getfield        #143 <Field PhoneNumberUtil phoneUtil>
	//   12   24:aload_0         
	//   13   25:getfield        #129 <Field StringBuilder nationalNumber>
	//   14   28:aload_2         
	//   15   29:invokevirtual   #233 <Method int PhoneNumberUtil.extractCountryCode(StringBuilder, StringBuilder)>
	//   16   32:istore_1        
		if(i == 0) goto _L1; else goto _L3
	//   17   33:iload_1         
	//   18   34:ifeq            10
_L3:
		nationalNumber.setLength(0);
	//   19   37:aload_0         
	//   20   38:getfield        #129 <Field StringBuilder nationalNumber>
	//   21   41:iconst_0        
	//   22   42:invokevirtual   #171 <Method void StringBuilder.setLength(int)>
		nationalNumber.append(((CharSequence) (obj)));
	//   23   45:aload_0         
	//   24   46:getfield        #129 <Field StringBuilder nationalNumber>
	//   25   49:aload_2         
	//   26   50:invokevirtual   #236 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   27   53:pop             
		obj = ((Object) (phoneUtil.getRegionCodeForCountryCode(i)));
	//   28   54:aload_0         
	//   29   55:getfield        #143 <Field PhoneNumberUtil phoneUtil>
	//   30   58:iload_1         
	//   31   59:invokevirtual   #240 <Method String PhoneNumberUtil.getRegionCodeForCountryCode(int)>
	//   32   62:astore_2        
		if(!"001".equals(obj)) goto _L5; else goto _L4
	//   33   63:ldc1            #242 <String "001">
	//   34   65:aload_2         
	//   35   66:invokevirtual   #179 <Method boolean String.equals(Object)>
	//   36   69:ifeq            111
_L4:
		currentMetadata = phoneUtil.getMetadataForNonGeographicalRegion(i);
	//   37   72:aload_0         
	//   38   73:aload_0         
	//   39   74:getfield        #143 <Field PhoneNumberUtil phoneUtil>
	//   40   77:iload_1         
	//   41   78:invokevirtual   #246 <Method Phonemetadata$PhoneMetadata PhoneNumberUtil.getMetadataForNonGeographicalRegion(int)>
	//   42   81:putfield        #150 <Field Phonemetadata$PhoneMetadata currentMetadata>
_L7:
		obj = ((Object) (Integer.toString(i)));
	//   43   84:iload_1         
	//   44   85:invokestatic    #250 <Method String Integer.toString(int)>
	//   45   88:astore_2        
		prefixBeforeNationalNumber.append(((String) (obj))).append(' ');
	//   46   89:aload_0         
	//   47   90:getfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
	//   48   93:aload_2         
	//   49   94:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   50   97:bipush          32
	//   51   99:invokevirtual   #196 <Method StringBuilder StringBuilder.append(char)>
	//   52  102:pop             
		extractedNationalPrefix = "";
	//   53  103:aload_0         
	//   54  104:ldc1            #94  <String "">
	//   55  106:putfield        #127 <Field String extractedNationalPrefix>
		return true;
	//   56  109:iconst_1        
	//   57  110:ireturn         
_L5:
		if(!((String) (obj)).equals(((Object) (defaultCountry))))
	//*  58  111:aload_2         
	//*  59  112:aload_0         
	//*  60  113:getfield        #145 <Field String defaultCountry>
	//*  61  116:invokevirtual   #179 <Method boolean String.equals(Object)>
	//*  62  119:ifne            84
			currentMetadata = getMetadataForRegion(((String) (obj)));
	//   63  122:aload_0         
	//   64  123:aload_0         
	//   65  124:aload_2         
	//   66  125:invokespecial   #148 <Method Phonemetadata$PhoneMetadata getMetadataForRegion(String)>
	//   67  128:putfield        #150 <Field Phonemetadata$PhoneMetadata currentMetadata>
		if(true) goto _L7; else goto _L6
	//   68  131:goto            84
_L6:
	}

	private boolean attemptToExtractIdd()
	{
		Matcher matcher = regexCache.getPatternForRegex((new StringBuilder()).append("\\+|").append(currentMetadata.getInternationalPrefix()).toString()).matcher(((CharSequence) (accruedInputWithoutFormatting)));
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field RegexCache regexCache>
	//    2    4:new             #98  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #99  <Method void StringBuilder()>
	//    5   11:ldc1            #253 <String "\\+|">
	//    6   13:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:getfield        #150 <Field Phonemetadata$PhoneMetadata currentMetadata>
	//    9   20:invokevirtual   #256 <Method String Phonemetadata$PhoneMetadata.getInternationalPrefix()>
	//   10   23:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   12   29:invokevirtual   #259 <Method Pattern RegexCache.getPatternForRegex(String)>
	//   13   32:aload_0         
	//   14   33:getfield        #107 <Field StringBuilder accruedInputWithoutFormatting>
	//   15   36:invokevirtual   #263 <Method Matcher Pattern.matcher(CharSequence)>
	//   16   39:astore_2        
		if(matcher.lookingAt())
	//*  17   40:aload_2         
	//*  18   41:invokevirtual   #268 <Method boolean Matcher.lookingAt()>
	//*  19   44:ifeq            131
		{
			isCompleteNumber = true;
	//   20   47:aload_0         
	//   21   48:iconst_1        
	//   22   49:putfield        #113 <Field boolean isCompleteNumber>
			int i = matcher.end();
	//   23   52:aload_2         
	//   24   53:invokevirtual   #271 <Method int Matcher.end()>
	//   25   56:istore_1        
			nationalNumber.setLength(0);
	//   26   57:aload_0         
	//   27   58:getfield        #129 <Field StringBuilder nationalNumber>
	//   28   61:iconst_0        
	//   29   62:invokevirtual   #171 <Method void StringBuilder.setLength(int)>
			nationalNumber.append(accruedInputWithoutFormatting.substring(i));
	//   30   65:aload_0         
	//   31   66:getfield        #129 <Field StringBuilder nationalNumber>
	//   32   69:aload_0         
	//   33   70:getfield        #107 <Field StringBuilder accruedInputWithoutFormatting>
	//   34   73:iload_1         
	//   35   74:invokevirtual   #274 <Method String StringBuilder.substring(int)>
	//   36   77:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   37   80:pop             
			prefixBeforeNationalNumber.setLength(0);
	//   38   81:aload_0         
	//   39   82:getfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
	//   40   85:iconst_0        
	//   41   86:invokevirtual   #171 <Method void StringBuilder.setLength(int)>
			prefixBeforeNationalNumber.append(accruedInputWithoutFormatting.substring(0, i));
	//   42   89:aload_0         
	//   43   90:getfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
	//   44   93:aload_0         
	//   45   94:getfield        #107 <Field StringBuilder accruedInputWithoutFormatting>
	//   46   97:iconst_0        
	//   47   98:iload_1         
	//   48   99:invokevirtual   #277 <Method String StringBuilder.substring(int, int)>
	//   49  102:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   50  105:pop             
			if(accruedInputWithoutFormatting.charAt(0) != '+')
	//*  51  106:aload_0         
	//*  52  107:getfield        #107 <Field StringBuilder accruedInputWithoutFormatting>
	//*  53  110:iconst_0        
	//*  54  111:invokevirtual   #186 <Method char StringBuilder.charAt(int)>
	//*  55  114:bipush          43
	//*  56  116:icmpeq          129
				prefixBeforeNationalNumber.append(' ');
	//   57  119:aload_0         
	//   58  120:getfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
	//   59  123:bipush          32
	//   60  125:invokevirtual   #196 <Method StringBuilder StringBuilder.append(char)>
	//   61  128:pop             
			return true;
	//   62  129:iconst_1        
	//   63  130:ireturn         
		} else
		{
			return false;
	//   64  131:iconst_0        
	//   65  132:ireturn         
		}
	}

	private boolean createFormattingTemplate(Phonemetadata.NumberFormat numberformat)
	{
		String s = numberformat.getPattern();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #284 <Method String Phonemetadata$NumberFormat.getPattern()>
	//    2    4:astore_2        
		if(s.indexOf('|') == -1)
	//*   3    5:aload_2         
	//*   4    6:bipush          124
	//*   5    8:invokevirtual   #288 <Method int String.indexOf(int)>
	//*   6   11:iconst_m1       
	//*   7   12:icmpeq          17
	//*   8   15:iconst_0        
	//*   9   16:ireturn         
		{
			s = CHARACTER_CLASS_PATTERN.matcher(((CharSequence) (s))).replaceAll("\\\\d");
	//   10   17:getstatic       #75  <Field Pattern CHARACTER_CLASS_PATTERN>
	//   11   20:aload_2         
	//   12   21:invokevirtual   #263 <Method Matcher Pattern.matcher(CharSequence)>
	//   13   24:ldc2            #290 <String "\\\\d">
	//   14   27:invokevirtual   #293 <Method String Matcher.replaceAll(String)>
	//   15   30:astore_2        
			s = STANDALONE_DIGIT_PATTERN.matcher(((CharSequence) (s))).replaceAll("\\\\d");
	//   16   31:getstatic       #79  <Field Pattern STANDALONE_DIGIT_PATTERN>
	//   17   34:aload_2         
	//   18   35:invokevirtual   #263 <Method Matcher Pattern.matcher(CharSequence)>
	//   19   38:ldc2            #290 <String "\\\\d">
	//   20   41:invokevirtual   #293 <Method String Matcher.replaceAll(String)>
	//   21   44:astore_2        
			formattingTemplate.setLength(0);
	//   22   45:aload_0         
	//   23   46:getfield        #101 <Field StringBuilder formattingTemplate>
	//   24   49:iconst_0        
	//   25   50:invokevirtual   #171 <Method void StringBuilder.setLength(int)>
			numberformat = ((Phonemetadata.NumberFormat) (getFormattingTemplate(s, numberformat.getFormat())));
	//   26   53:aload_0         
	//   27   54:aload_2         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #296 <Method String Phonemetadata$NumberFormat.getFormat()>
	//   30   59:invokespecial   #300 <Method String getFormattingTemplate(String, String)>
	//   31   62:astore_1        
			if(((String) (numberformat)).length() > 0)
	//*  32   63:aload_1         
	//*  33   64:invokevirtual   #160 <Method int String.length()>
	//*  34   67:ifle            15
			{
				formattingTemplate.append(((String) (numberformat)));
	//   35   70:aload_0         
	//   36   71:getfield        #101 <Field StringBuilder formattingTemplate>
	//   37   74:aload_1         
	//   38   75:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
				return true;
	//   40   79:iconst_1        
	//   41   80:ireturn         
			}
		}
		return false;
	}

	private void getAvailableFormats(String s)
	{
		boolean flag;
		Object obj;
		if(isCompleteNumber && currentMetadata.intlNumberFormatSize() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field boolean isCompleteNumber>
	//*   2    4:ifeq            117
	//*   3    7:aload_0         
	//*   4    8:getfield        #150 <Field Phonemetadata$PhoneMetadata currentMetadata>
	//*   5   11:invokevirtual   #303 <Method int Phonemetadata$PhoneMetadata.intlNumberFormatSize()>
	//*   6   14:ifle            117
			obj = ((Object) (currentMetadata.intlNumberFormats()));
	//    7   17:aload_0         
	//    8   18:getfield        #150 <Field Phonemetadata$PhoneMetadata currentMetadata>
	//    9   21:invokevirtual   #307 <Method List Phonemetadata$PhoneMetadata.intlNumberFormats()>
	//   10   24:astore_3        
		else
	//*  11   25:aload_0         
	//*  12   26:getfield        #150 <Field Phonemetadata$PhoneMetadata currentMetadata>
	//*  13   29:invokevirtual   #310 <Method boolean Phonemetadata$PhoneMetadata.hasNationalPrefix()>
	//*  14   32:istore_2        
	//*  15   33:aload_3         
	//*  16   34:invokeinterface #314 <Method Iterator List.iterator()>
	//*  17   39:astore_3        
	//*  18   40:aload_3         
	//*  19   41:invokeinterface #319 <Method boolean Iterator.hasNext()>
	//*  20   46:ifeq            128
	//*  21   49:aload_3         
	//*  22   50:invokeinterface #323 <Method Object Iterator.next()>
	//*  23   55:checkcast       #281 <Class Phonemetadata$NumberFormat>
	//*  24   58:astore          4
	//*  25   60:iload_2         
	//*  26   61:ifeq            90
	//*  27   64:aload_0         
	//*  28   65:getfield        #113 <Field boolean isCompleteNumber>
	//*  29   68:ifne            90
	//*  30   71:aload           4
	//*  31   73:invokevirtual   #326 <Method boolean Phonemetadata$NumberFormat.isNationalPrefixOptionalWhenFormatting()>
	//*  32   76:ifne            90
	//*  33   79:aload           4
	//*  34   81:invokevirtual   #329 <Method String Phonemetadata$NumberFormat.getNationalPrefixFormattingRule()>
	//*  35   84:invokestatic    #333 <Method boolean PhoneNumberUtil.formattingRuleHasFirstGroupOnly(String)>
	//*  36   87:ifeq            40
	//*  37   90:aload_0         
	//*  38   91:aload           4
	//*  39   93:invokevirtual   #296 <Method String Phonemetadata$NumberFormat.getFormat()>
	//*  40   96:invokespecial   #336 <Method boolean isFormatEligible(String)>
	//*  41   99:ifeq            40
	//*  42  102:aload_0         
	//*  43  103:getfield        #134 <Field List possibleFormats>
	//*  44  106:aload           4
	//*  45  108:invokeinterface #339 <Method boolean List.add(Object)>
	//*  46  113:pop             
	//*  47  114:goto            40
			obj = ((Object) (currentMetadata.numberFormats()));
	//   48  117:aload_0         
	//   49  118:getfield        #150 <Field Phonemetadata$PhoneMetadata currentMetadata>
	//   50  121:invokevirtual   #342 <Method List Phonemetadata$PhoneMetadata.numberFormats()>
	//   51  124:astore_3        
		flag = currentMetadata.hasNationalPrefix();
		obj = ((Object) (((List) (obj)).iterator()));
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
			Phonemetadata.NumberFormat numberformat = (Phonemetadata.NumberFormat)((Iterator) (obj)).next();
			if((!flag || isCompleteNumber || numberformat.isNationalPrefixOptionalWhenFormatting() || PhoneNumberUtil.formattingRuleHasFirstGroupOnly(numberformat.getNationalPrefixFormattingRule())) && isFormatEligible(numberformat.getFormat()))
				possibleFormats.add(((Object) (numberformat)));
		} while(true);
	//*  52  125:goto            25
		narrowDownPossibleFormats(s);
	//   53  128:aload_0         
	//   54  129:aload_1         
	//   55  130:invokespecial   #345 <Method void narrowDownPossibleFormats(String)>
	//   56  133:return          
	}

	private String getFormattingTemplate(String s, String s1)
	{
		Object obj = ((Object) (regexCache.getPatternForRegex(s).matcher("999999999999999")));
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field RegexCache regexCache>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #259 <Method Pattern RegexCache.getPatternForRegex(String)>
	//    4    8:ldc2            #347 <String "999999999999999">
	//    5   11:invokevirtual   #263 <Method Matcher Pattern.matcher(CharSequence)>
	//    6   14:astore_3        
		((Matcher) (obj)).find();
	//    7   15:aload_3         
	//    8   16:invokevirtual   #350 <Method boolean Matcher.find()>
	//    9   19:pop             
		obj = ((Object) (((Matcher) (obj)).group()));
	//   10   20:aload_3         
	//   11   21:invokevirtual   #353 <Method String Matcher.group()>
	//   12   24:astore_3        
		if(((String) (obj)).length() < nationalNumber.length())
	//*  13   25:aload_3         
	//*  14   26:invokevirtual   #160 <Method int String.length()>
	//*  15   29:aload_0         
	//*  16   30:getfield        #129 <Field StringBuilder nationalNumber>
	//*  17   33:invokevirtual   #182 <Method int StringBuilder.length()>
	//*  18   36:icmpge          42
			return "";
	//   19   39:ldc1            #94  <String "">
	//   20   41:areturn         
		else
			return ((String) (obj)).replaceAll(s, s1).replaceAll("9", "\u2008");
	//   21   42:aload_3         
	//   22   43:aload_1         
	//   23   44:aload_2         
	//   24   45:invokevirtual   #355 <Method String String.replaceAll(String, String)>
	//   25   48:ldc2            #357 <String "9">
	//   26   51:ldc1            #11  <String "\u2008">
	//   27   53:invokevirtual   #355 <Method String String.replaceAll(String, String)>
	//   28   56:areturn         
	}

	private Phonemetadata.PhoneMetadata getMetadataForRegion(String s)
	{
		int i = phoneUtil.getCountryCodeForRegion(s);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field PhoneNumberUtil phoneUtil>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #360 <Method int PhoneNumberUtil.getCountryCodeForRegion(String)>
	//    4    8:istore_2        
		s = phoneUtil.getRegionCodeForCountryCode(i);
	//    5    9:aload_0         
	//    6   10:getfield        #143 <Field PhoneNumberUtil phoneUtil>
	//    7   13:iload_2         
	//    8   14:invokevirtual   #240 <Method String PhoneNumberUtil.getRegionCodeForCountryCode(int)>
	//    9   17:astore_1        
		s = ((String) (phoneUtil.getMetadataForRegion(s)));
	//   10   18:aload_0         
	//   11   19:getfield        #143 <Field PhoneNumberUtil phoneUtil>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #361 <Method Phonemetadata$PhoneMetadata PhoneNumberUtil.getMetadataForRegion(String)>
	//   14   26:astore_1        
		if(s != null)
	//*  15   27:aload_1         
	//*  16   28:ifnull          33
			return ((Phonemetadata.PhoneMetadata) (s));
	//   17   31:aload_1         
	//   18   32:areturn         
		else
			return EMPTY_METADATA;
	//   19   33:getstatic       #65  <Field Phonemetadata$PhoneMetadata EMPTY_METADATA>
	//   20   36:areturn         
	}

	private String inputAccruedNationalNumber()
	{
		int j = nationalNumber.length();
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field StringBuilder nationalNumber>
	//    2    4:invokevirtual   #182 <Method int StringBuilder.length()>
	//    3    7:istore_2        
		if(j > 0)
	//*   4    8:iload_2         
	//*   5    9:ifle            63
		{
			String s = "";
	//    6   12:ldc1            #94  <String "">
	//    7   14:astore_3        
			for(int i = 0; i < j; i++)
	//*   8   15:iconst_0        
	//*   9   16:istore_1        
	//*  10   17:iload_1         
	//*  11   18:iload_2         
	//*  12   19:icmpge          42
				s = inputDigitHelper(nationalNumber.charAt(i));
	//   13   22:aload_0         
	//   14   23:aload_0         
	//   15   24:getfield        #129 <Field StringBuilder nationalNumber>
	//   16   27:iload_1         
	//   17   28:invokevirtual   #186 <Method char StringBuilder.charAt(int)>
	//   18   31:invokespecial   #365 <Method String inputDigitHelper(char)>
	//   19   34:astore_3        

	//   20   35:iload_1         
	//   21   36:iconst_1        
	//   22   37:iadd            
	//   23   38:istore_1        
	//*  24   39:goto            17
			if(ableToFormat)
	//*  25   42:aload_0         
	//*  26   43:getfield        #109 <Field boolean ableToFormat>
	//*  27   46:ifeq            55
				return appendNationalNumber(s);
	//   28   49:aload_0         
	//   29   50:aload_3         
	//   30   51:invokespecial   #218 <Method String appendNationalNumber(String)>
	//   31   54:areturn         
			else
				return accruedInput.toString();
	//   32   55:aload_0         
	//   33   56:getfield        #105 <Field StringBuilder accruedInput>
	//   34   59:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   35   62:areturn         
		} else
		{
			return prefixBeforeNationalNumber.toString();
	//   36   63:aload_0         
	//   37   64:getfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
	//   38   67:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   39   70:areturn         
		}
	}

	private String inputDigitHelper(char c)
	{
		Matcher matcher = DIGIT_PATTERN.matcher(((CharSequence) (formattingTemplate)));
	//    0    0:getstatic       #89  <Field Pattern DIGIT_PATTERN>
	//    1    3:aload_0         
	//    2    4:getfield        #101 <Field StringBuilder formattingTemplate>
	//    3    7:invokevirtual   #263 <Method Matcher Pattern.matcher(CharSequence)>
	//    4   10:astore_2        
		if(matcher.find(lastMatchPosition))
	//*   5   11:aload_2         
	//*   6   12:aload_0         
	//*   7   13:getfield        #117 <Field int lastMatchPosition>
	//*   8   16:invokevirtual   #368 <Method boolean Matcher.find(int)>
	//*   9   19:ifeq            68
		{
			String s = matcher.replaceFirst(Character.toString(c));
	//   10   22:aload_2         
	//   11   23:iload_1         
	//   12   24:invokestatic    #372 <Method String Character.toString(char)>
	//   13   27:invokevirtual   #375 <Method String Matcher.replaceFirst(String)>
	//   14   30:astore_3        
			formattingTemplate.replace(0, s.length(), s);
	//   15   31:aload_0         
	//   16   32:getfield        #101 <Field StringBuilder formattingTemplate>
	//   17   35:iconst_0        
	//   18   36:aload_3         
	//   19   37:invokevirtual   #160 <Method int String.length()>
	//   20   40:aload_3         
	//   21   41:invokevirtual   #379 <Method StringBuilder StringBuilder.replace(int, int, String)>
	//   22   44:pop             
			lastMatchPosition = matcher.start();
	//   23   45:aload_0         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #382 <Method int Matcher.start()>
	//   26   50:putfield        #117 <Field int lastMatchPosition>
			return formattingTemplate.substring(0, lastMatchPosition + 1);
	//   27   53:aload_0         
	//   28   54:getfield        #101 <Field StringBuilder formattingTemplate>
	//   29   57:iconst_0        
	//   30   58:aload_0         
	//   31   59:getfield        #117 <Field int lastMatchPosition>
	//   32   62:iconst_1        
	//   33   63:iadd            
	//   34   64:invokevirtual   #277 <Method String StringBuilder.substring(int, int)>
	//   35   67:areturn         
		}
		if(possibleFormats.size() == 1)
	//*  36   68:aload_0         
	//*  37   69:getfield        #134 <Field List possibleFormats>
	//*  38   72:invokeinterface #385 <Method int List.size()>
	//*  39   77:iconst_1        
	//*  40   78:icmpne          86
			ableToFormat = false;
	//   41   81:aload_0         
	//   42   82:iconst_0        
	//   43   83:putfield        #109 <Field boolean ableToFormat>
		currentFormattingPattern = "";
	//   44   86:aload_0         
	//   45   87:ldc1            #94  <String "">
	//   46   89:putfield        #103 <Field String currentFormattingPattern>
		return accruedInput.toString();
	//   47   92:aload_0         
	//   48   93:getfield        #105 <Field StringBuilder accruedInput>
	//   49   96:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   50   99:areturn         
	}

	private String inputDigitWithOptionToRememberPosition(char c, boolean flag)
	{
		String s;
		accruedInput.append(c);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field StringBuilder accruedInput>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #196 <Method StringBuilder StringBuilder.append(char)>
	//    4    8:pop             
		if(flag)
	//*   5    9:iload_2         
	//*   6   10:ifeq            24
			originalPosition = accruedInput.length();
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #105 <Field StringBuilder accruedInput>
	//   10   18:invokevirtual   #182 <Method int StringBuilder.length()>
	//   11   21:putfield        #119 <Field int originalPosition>
		if(!isDigitOrLeadingPlusSign(c))
	//*  12   24:aload_0         
	//*  13   25:iload_1         
	//*  14   26:invokespecial   #391 <Method boolean isDigitOrLeadingPlusSign(char)>
	//*  15   29:ifne            66
		{
			ableToFormat = false;
	//   16   32:aload_0         
	//   17   33:iconst_0        
	//   18   34:putfield        #109 <Field boolean ableToFormat>
			inputHasFormatting = true;
	//   19   37:aload_0         
	//   20   38:iconst_1        
	//   21   39:putfield        #111 <Field boolean inputHasFormatting>
		} else
	//*  22   42:aload_0         
	//*  23   43:getfield        #109 <Field boolean ableToFormat>
	//*  24   46:ifne            125
	//*  25   49:aload_0         
	//*  26   50:getfield        #111 <Field boolean inputHasFormatting>
	//*  27   53:ifeq            76
	//*  28   56:aload_0         
	//*  29   57:getfield        #105 <Field StringBuilder accruedInput>
	//*  30   60:invokevirtual   #199 <Method String StringBuilder.toString()>
	//*  31   63:astore_3        
	//*  32   64:aload_3         
	//*  33   65:areturn         
		{
			c = normalizeAndAccrueDigitsAndPlusSign(c, flag);
	//   34   66:aload_0         
	//   35   67:iload_1         
	//   36   68:iload_2         
	//   37   69:invokespecial   #395 <Method char normalizeAndAccrueDigitsAndPlusSign(char, boolean)>
	//   38   72:istore_1        
		}
		if(ableToFormat) goto _L2; else goto _L1
_L1:
		if(!inputHasFormatting) goto _L4; else goto _L3
_L3:
		s = accruedInput.toString();
_L10:
		return s;
	//*  39   73:goto            42
_L4:
		if(attemptToExtractIdd())
	//*  40   76:aload_0         
	//*  41   77:invokespecial   #397 <Method boolean attemptToExtractIdd()>
	//*  42   80:ifeq            95
		{
			if(attemptToExtractCountryCallingCode())
	//*  43   83:aload_0         
	//*  44   84:invokespecial   #399 <Method boolean attemptToExtractCountryCallingCode()>
	//*  45   87:ifeq            117
				return attemptToChoosePatternWithPrefixExtracted();
	//   46   90:aload_0         
	//   47   91:invokespecial   #401 <Method String attemptToChoosePatternWithPrefixExtracted()>
	//   48   94:areturn         
		} else
		if(ableToExtractLongerNdd())
	//*  49   95:aload_0         
	//*  50   96:invokespecial   #403 <Method boolean ableToExtractLongerNdd()>
	//*  51   99:ifeq            117
		{
			prefixBeforeNationalNumber.append(' ');
	//   52  102:aload_0         
	//   53  103:getfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
	//   54  106:bipush          32
	//   55  108:invokevirtual   #196 <Method StringBuilder StringBuilder.append(char)>
	//   56  111:pop             
			return attemptToChoosePatternWithPrefixExtracted();
	//   57  112:aload_0         
	//   58  113:invokespecial   #401 <Method String attemptToChoosePatternWithPrefixExtracted()>
	//   59  116:areturn         
		}
		return accruedInput.toString();
	//   60  117:aload_0         
	//   61  118:getfield        #105 <Field StringBuilder accruedInput>
	//   62  121:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   63  124:areturn         
_L2:
		accruedInputWithoutFormatting.length();
	//   64  125:aload_0         
	//   65  126:getfield        #107 <Field StringBuilder accruedInputWithoutFormatting>
	//   66  129:invokevirtual   #182 <Method int StringBuilder.length()>
		JVM INSTR tableswitch 0 3: default 164
	//	               0 211
	//	               1 211
	//	               2 211
	//	               3 219;
	//   67  132:tableswitch     0 3: default 164
	//	               0 211
	//	               1 211
	//	               2 211
	//	               3 219
		   goto _L5 _L6 _L6 _L6 _L7
_L5:
		if(isExpectingCountryCallingCode)
	//*  68  164:aload_0         
	//*  69  165:getfield        #115 <Field boolean isExpectingCountryCallingCode>
	//*  70  168:ifeq            247
		{
			if(attemptToExtractCountryCallingCode())
	//*  71  171:aload_0         
	//*  72  172:invokespecial   #399 <Method boolean attemptToExtractCountryCallingCode()>
	//*  73  175:ifeq            183
				isExpectingCountryCallingCode = false;
	//   74  178:aload_0         
	//   75  179:iconst_0        
	//   76  180:putfield        #115 <Field boolean isExpectingCountryCallingCode>
			return (new StringBuilder()).append(((Object) (prefixBeforeNationalNumber))).append(nationalNumber.toString()).toString();
	//   77  183:new             #98  <Class StringBuilder>
	//   78  186:dup             
	//   79  187:invokespecial   #99  <Method void StringBuilder()>
	//   80  190:aload_0         
	//   81  191:getfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
	//   82  194:invokevirtual   #202 <Method StringBuilder StringBuilder.append(Object)>
	//   83  197:aload_0         
	//   84  198:getfield        #129 <Field StringBuilder nationalNumber>
	//   85  201:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   86  204:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   87  207:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   88  210:areturn         
		}
		break; /* Loop/switch isn't completed */
_L6:
		return accruedInput.toString();
	//   89  211:aload_0         
	//   90  212:getfield        #105 <Field StringBuilder accruedInput>
	//   91  215:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   92  218:areturn         
_L7:
		if(attemptToExtractIdd())
	//*  93  219:aload_0         
	//*  94  220:invokespecial   #397 <Method boolean attemptToExtractIdd()>
	//*  95  223:ifeq            234
		{
			isExpectingCountryCallingCode = true;
	//   96  226:aload_0         
	//   97  227:iconst_1        
	//   98  228:putfield        #115 <Field boolean isExpectingCountryCallingCode>
		} else
	//*  99  231:goto            164
		{
			extractedNationalPrefix = removeNationalPrefixFromNationalNumber();
	//  100  234:aload_0         
	//  101  235:aload_0         
	//  102  236:invokespecial   #175 <Method String removeNationalPrefixFromNationalNumber()>
	//  103  239:putfield        #127 <Field String extractedNationalPrefix>
			return attemptToChooseFormattingPattern();
	//  104  242:aload_0         
	//  105  243:invokespecial   #226 <Method String attemptToChooseFormattingPattern()>
	//  106  246:areturn         
		}
		if(true) goto _L5; else goto _L8
_L8:
		if(possibleFormats.size() > 0)
	//* 107  247:aload_0         
	//* 108  248:getfield        #134 <Field List possibleFormats>
	//* 109  251:invokeinterface #385 <Method int List.size()>
	//* 110  256:ifle            333
		{
			String s3 = inputDigitHelper(c);
	//  111  259:aload_0         
	//  112  260:iload_1         
	//  113  261:invokespecial   #365 <Method String inputDigitHelper(char)>
	//  114  264:astore          5
			String s2 = attemptToFormatAccruedDigits();
	//  115  266:aload_0         
	//  116  267:invokevirtual   #210 <Method String attemptToFormatAccruedDigits()>
	//  117  270:astore          4
			s = s2;
	//  118  272:aload           4
	//  119  274:astore_3        
			if(s2.length() <= 0)
	//* 120  275:aload           4
	//* 121  277:invokevirtual   #160 <Method int String.length()>
	//* 122  280:ifgt            64
			{
				narrowDownPossibleFormats(nationalNumber.toString());
	//  123  283:aload_0         
	//  124  284:aload_0         
	//  125  285:getfield        #129 <Field StringBuilder nationalNumber>
	//  126  288:invokevirtual   #199 <Method String StringBuilder.toString()>
	//  127  291:invokespecial   #345 <Method void narrowDownPossibleFormats(String)>
				if(maybeCreateNewTemplate())
	//* 128  294:aload_0         
	//* 129  295:invokespecial   #213 <Method boolean maybeCreateNewTemplate()>
	//* 130  298:ifeq            306
					return inputAccruedNationalNumber();
	//  131  301:aload_0         
	//  132  302:invokespecial   #216 <Method String inputAccruedNationalNumber()>
	//  133  305:areturn         
				String s1;
				if(ableToFormat)
	//* 134  306:aload_0         
	//* 135  307:getfield        #109 <Field boolean ableToFormat>
	//* 136  310:ifeq            322
					s1 = appendNationalNumber(s3);
	//  137  313:aload_0         
	//  138  314:aload           5
	//  139  316:invokespecial   #218 <Method String appendNationalNumber(String)>
	//  140  319:astore_3        
				else
	//* 141  320:aload_3         
	//* 142  321:areturn         
					s1 = accruedInput.toString();
	//  143  322:aload_0         
	//  144  323:getfield        #105 <Field StringBuilder accruedInput>
	//  145  326:invokevirtual   #199 <Method String StringBuilder.toString()>
	//  146  329:astore_3        
				return s1;
			}
		} else
	//* 147  330:goto            320
		{
			return attemptToChooseFormattingPattern();
	//  148  333:aload_0         
	//  149  334:invokespecial   #226 <Method String attemptToChooseFormattingPattern()>
	//  150  337:areturn         
		}
		if(true) goto _L10; else goto _L9
_L9:
	}

	private boolean isDigitOrLeadingPlusSign(char c)
	{
		return Character.isDigit(c) || accruedInput.length() == 1 && PhoneNumberUtil.PLUS_CHARS_PATTERN.matcher(((CharSequence) (Character.toString(c)))).matches();
	//    0    0:iload_1         
	//    1    1:invokestatic    #406 <Method boolean Character.isDigit(char)>
	//    2    4:ifne            34
	//    3    7:aload_0         
	//    4    8:getfield        #105 <Field StringBuilder accruedInput>
	//    5   11:invokevirtual   #182 <Method int StringBuilder.length()>
	//    6   14:iconst_1        
	//    7   15:icmpne          36
	//    8   18:getstatic       #409 <Field Pattern PhoneNumberUtil.PLUS_CHARS_PATTERN>
	//    9   21:iload_1         
	//   10   22:invokestatic    #372 <Method String Character.toString(char)>
	//   11   25:invokevirtual   #263 <Method Matcher Pattern.matcher(CharSequence)>
	//   12   28:invokevirtual   #412 <Method boolean Matcher.matches()>
	//   13   31:ifeq            36
	//   14   34:iconst_1        
	//   15   35:ireturn         
	//   16   36:iconst_0        
	//   17   37:ireturn         
	}

	private boolean isFormatEligible(String s)
	{
		return ELIGIBLE_FORMAT_PATTERN.matcher(((CharSequence) (s))).matches();
	//    0    0:getstatic       #83  <Field Pattern ELIGIBLE_FORMAT_PATTERN>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #263 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:invokevirtual   #412 <Method boolean Matcher.matches()>
	//    4   10:ireturn         
	}

	private boolean isNanpaNumberWithNationalPrefix()
	{
		return currentMetadata.getCountryCode() == 1 && nationalNumber.charAt(0) == '1' && nationalNumber.charAt(1) != '0' && nationalNumber.charAt(1) != '1';
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field Phonemetadata$PhoneMetadata currentMetadata>
	//    2    4:invokevirtual   #416 <Method int Phonemetadata$PhoneMetadata.getCountryCode()>
	//    3    7:iconst_1        
	//    4    8:icmpne          52
	//    5   11:aload_0         
	//    6   12:getfield        #129 <Field StringBuilder nationalNumber>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #186 <Method char StringBuilder.charAt(int)>
	//    9   19:bipush          49
	//   10   21:icmpne          52
	//   11   24:aload_0         
	//   12   25:getfield        #129 <Field StringBuilder nationalNumber>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #186 <Method char StringBuilder.charAt(int)>
	//   15   32:bipush          48
	//   16   34:icmpeq          52
	//   17   37:aload_0         
	//   18   38:getfield        #129 <Field StringBuilder nationalNumber>
	//   19   41:iconst_1        
	//   20   42:invokevirtual   #186 <Method char StringBuilder.charAt(int)>
	//   21   45:bipush          49
	//   22   47:icmpeq          52
	//   23   50:iconst_1        
	//   24   51:ireturn         
	//   25   52:iconst_0        
	//   26   53:ireturn         
	}

	private boolean maybeCreateNewTemplate()
	{
		for(Iterator iterator = possibleFormats.iterator(); iterator.hasNext(); iterator.remove())
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field List possibleFormats>
	//*   2    4:invokeinterface #314 <Method Iterator List.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #319 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            93
		{
			Phonemetadata.NumberFormat numberformat = (Phonemetadata.NumberFormat)iterator.next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #323 <Method Object Iterator.next()>
	//    9   25:checkcast       #281 <Class Phonemetadata$NumberFormat>
	//   10   28:astore_2        
			String s = numberformat.getPattern();
	//   11   29:aload_2         
	//   12   30:invokevirtual   #284 <Method String Phonemetadata$NumberFormat.getPattern()>
	//   13   33:astore_3        
			if(currentFormattingPattern.equals(((Object) (s))))
	//*  14   34:aload_0         
	//*  15   35:getfield        #103 <Field String currentFormattingPattern>
	//*  16   38:aload_3         
	//*  17   39:invokevirtual   #179 <Method boolean String.equals(Object)>
	//*  18   42:ifeq            47
				return false;
	//   19   45:iconst_0        
	//   20   46:ireturn         
			if(createFormattingTemplate(numberformat))
	//*  21   47:aload_0         
	//*  22   48:aload_2         
	//*  23   49:invokespecial   #418 <Method boolean createFormattingTemplate(Phonemetadata$NumberFormat)>
	//*  24   52:ifeq            84
			{
				currentFormattingPattern = s;
	//   25   55:aload_0         
	//   26   56:aload_3         
	//   27   57:putfield        #103 <Field String currentFormattingPattern>
				shouldAddSpaceAfterNationalPrefix = NATIONAL_PREFIX_SEPARATORS_PATTERN.matcher(((CharSequence) (numberformat.getNationalPrefixFormattingRule()))).find();
	//   28   60:aload_0         
	//   29   61:getstatic       #87  <Field Pattern NATIONAL_PREFIX_SEPARATORS_PATTERN>
	//   30   64:aload_2         
	//   31   65:invokevirtual   #329 <Method String Phonemetadata$NumberFormat.getNationalPrefixFormattingRule()>
	//   32   68:invokevirtual   #263 <Method Matcher Pattern.matcher(CharSequence)>
	//   33   71:invokevirtual   #350 <Method boolean Matcher.find()>
	//   34   74:putfield        #125 <Field boolean shouldAddSpaceAfterNationalPrefix>
				lastMatchPosition = 0;
	//   35   77:aload_0         
	//   36   78:iconst_0        
	//   37   79:putfield        #117 <Field int lastMatchPosition>
				return true;
	//   38   82:iconst_1        
	//   39   83:ireturn         
			}
		}

	//   40   84:aload_1         
	//   41   85:invokeinterface #421 <Method void Iterator.remove()>
	//*  42   90:goto            10
		ableToFormat = false;
	//   43   93:aload_0         
	//   44   94:iconst_0        
	//   45   95:putfield        #109 <Field boolean ableToFormat>
		return false;
	//   46   98:iconst_0        
	//   47   99:ireturn         
	}

	private void narrowDownPossibleFormats(String s)
	{
		int i = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #160 <Method int String.length()>
	//    2    4:istore_2        
		Iterator iterator = possibleFormats.iterator();
	//    3    5:aload_0         
	//    4    6:getfield        #134 <Field List possibleFormats>
	//    5    9:invokeinterface #314 <Method Iterator List.iterator()>
	//    6   14:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   16:aload           4
	//    8   18:invokeinterface #319 <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            93
			Phonemetadata.NumberFormat numberformat = (Phonemetadata.NumberFormat)iterator.next();
	//   10   26:aload           4
	//   11   28:invokeinterface #323 <Method Object Iterator.next()>
	//   12   33:checkcast       #281 <Class Phonemetadata$NumberFormat>
	//   13   36:astore          5
			if(numberformat.leadingDigitsPatternSize() != 0)
	//*  14   38:aload           5
	//*  15   40:invokevirtual   #424 <Method int Phonemetadata$NumberFormat.leadingDigitsPatternSize()>
	//*  16   43:ifeq            16
			{
				int j = Math.min(i - 3, numberformat.leadingDigitsPatternSize() - 1);
	//   17   46:iload_2         
	//   18   47:iconst_3        
	//   19   48:isub            
	//   20   49:aload           5
	//   21   51:invokevirtual   #424 <Method int Phonemetadata$NumberFormat.leadingDigitsPatternSize()>
	//   22   54:iconst_1        
	//   23   55:isub            
	//   24   56:invokestatic    #430 <Method int Math.min(int, int)>
	//   25   59:istore_3        
				if(!regexCache.getPatternForRegex(numberformat.getLeadingDigitsPattern(j)).matcher(((CharSequence) (s))).lookingAt())
	//*  26   60:aload_0         
	//*  27   61:getfield        #141 <Field RegexCache regexCache>
	//*  28   64:aload           5
	//*  29   66:iload_3         
	//*  30   67:invokevirtual   #433 <Method String Phonemetadata$NumberFormat.getLeadingDigitsPattern(int)>
	//*  31   70:invokevirtual   #259 <Method Pattern RegexCache.getPatternForRegex(String)>
	//*  32   73:aload_1         
	//*  33   74:invokevirtual   #263 <Method Matcher Pattern.matcher(CharSequence)>
	//*  34   77:invokevirtual   #268 <Method boolean Matcher.lookingAt()>
	//*  35   80:ifne            16
					iterator.remove();
	//   36   83:aload           4
	//   37   85:invokeinterface #421 <Method void Iterator.remove()>
			}
		} while(true);
	//   38   90:goto            16
	//   39   93:return          
	}

	private char normalizeAndAccrueDigitsAndPlusSign(char c, boolean flag)
	{
		char c1;
		if(c == '+')
	//*   0    0:iload_1         
	//*   1    1:bipush          43
	//*   2    3:icmpne          34
		{
			c1 = c;
	//    3    6:iload_1         
	//    4    7:istore_3        
			accruedInputWithoutFormatting.append(c);
	//    5    8:aload_0         
	//    6    9:getfield        #107 <Field StringBuilder accruedInputWithoutFormatting>
	//    7   12:iload_1         
	//    8   13:invokevirtual   #196 <Method StringBuilder StringBuilder.append(char)>
	//    9   16:pop             
		} else
	//*  10   17:iload_2         
	//*  11   18:ifeq            32
	//*  12   21:aload_0         
	//*  13   22:aload_0         
	//*  14   23:getfield        #107 <Field StringBuilder accruedInputWithoutFormatting>
	//*  15   26:invokevirtual   #182 <Method int StringBuilder.length()>
	//*  16   29:putfield        #121 <Field int positionToRemember>
	//*  17   32:iload_3         
	//*  18   33:ireturn         
		{
			c1 = Character.forDigit(Character.digit(c, 10), 10);
	//   19   34:iload_1         
	//   20   35:bipush          10
	//   21   37:invokestatic    #437 <Method int Character.digit(char, int)>
	//   22   40:bipush          10
	//   23   42:invokestatic    #441 <Method char Character.forDigit(int, int)>
	//   24   45:istore_3        
			accruedInputWithoutFormatting.append(c1);
	//   25   46:aload_0         
	//   26   47:getfield        #107 <Field StringBuilder accruedInputWithoutFormatting>
	//   27   50:iload_3         
	//   28   51:invokevirtual   #196 <Method StringBuilder StringBuilder.append(char)>
	//   29   54:pop             
			nationalNumber.append(c1);
	//   30   55:aload_0         
	//   31   56:getfield        #129 <Field StringBuilder nationalNumber>
	//   32   59:iload_3         
	//   33   60:invokevirtual   #196 <Method StringBuilder StringBuilder.append(char)>
	//   34   63:pop             
		}
		if(flag)
			positionToRemember = accruedInputWithoutFormatting.length();
		return c1;
	//*  35   64:goto            17
	}

	private String removeNationalPrefixFromNationalNumber()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(!isNanpaNumberWithNationalPrefix()) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:invokespecial   #443 <Method boolean isNanpaNumberWithNationalPrefix()>
	//    4    6:ifeq            53
_L1:
		int i;
		i = 1;
	//    5    9:iconst_1        
	//    6   10:istore_1        
		prefixBeforeNationalNumber.append('1').append(' ');
	//    7   11:aload_0         
	//    8   12:getfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
	//    9   15:bipush          49
	//   10   17:invokevirtual   #196 <Method StringBuilder StringBuilder.append(char)>
	//   11   20:bipush          32
	//   12   22:invokevirtual   #196 <Method StringBuilder StringBuilder.append(char)>
	//   13   25:pop             
		isCompleteNumber = true;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #113 <Field boolean isCompleteNumber>
_L4:
		String s = nationalNumber.substring(0, i);
	//   17   31:aload_0         
	//   18   32:getfield        #129 <Field StringBuilder nationalNumber>
	//   19   35:iconst_0        
	//   20   36:iload_1         
	//   21   37:invokevirtual   #277 <Method String StringBuilder.substring(int, int)>
	//   22   40:astore_3        
		nationalNumber.delete(0, i);
	//   23   41:aload_0         
	//   24   42:getfield        #129 <Field StringBuilder nationalNumber>
	//   25   45:iconst_0        
	//   26   46:iload_1         
	//   27   47:invokevirtual   #447 <Method StringBuilder StringBuilder.delete(int, int)>
	//   28   50:pop             
		return s;
	//   29   51:aload_3         
	//   30   52:areturn         
_L2:
		i = ((int) (flag));
	//   31   53:iload_2         
	//   32   54:istore_1        
		if(currentMetadata.hasNationalPrefixForParsing())
	//*  33   55:aload_0         
	//*  34   56:getfield        #150 <Field Phonemetadata$PhoneMetadata currentMetadata>
	//*  35   59:invokevirtual   #450 <Method boolean Phonemetadata$PhoneMetadata.hasNationalPrefixForParsing()>
	//*  36   62:ifeq            31
		{
			Matcher matcher = regexCache.getPatternForRegex(currentMetadata.getNationalPrefixForParsing()).matcher(((CharSequence) (nationalNumber)));
	//   37   65:aload_0         
	//   38   66:getfield        #141 <Field RegexCache regexCache>
	//   39   69:aload_0         
	//   40   70:getfield        #150 <Field Phonemetadata$PhoneMetadata currentMetadata>
	//   41   73:invokevirtual   #453 <Method String Phonemetadata$PhoneMetadata.getNationalPrefixForParsing()>
	//   42   76:invokevirtual   #259 <Method Pattern RegexCache.getPatternForRegex(String)>
	//   43   79:aload_0         
	//   44   80:getfield        #129 <Field StringBuilder nationalNumber>
	//   45   83:invokevirtual   #263 <Method Matcher Pattern.matcher(CharSequence)>
	//   46   86:astore_3        
			i = ((int) (flag));
	//   47   87:iload_2         
	//   48   88:istore_1        
			if(matcher.lookingAt())
	//*  49   89:aload_3         
	//*  50   90:invokevirtual   #268 <Method boolean Matcher.lookingAt()>
	//*  51   93:ifeq            31
			{
				i = ((int) (flag));
	//   52   96:iload_2         
	//   53   97:istore_1        
				if(matcher.end() > 0)
	//*  54   98:aload_3         
	//*  55   99:invokevirtual   #271 <Method int Matcher.end()>
	//*  56  102:ifle            31
				{
					isCompleteNumber = true;
	//   57  105:aload_0         
	//   58  106:iconst_1        
	//   59  107:putfield        #113 <Field boolean isCompleteNumber>
					i = matcher.end();
	//   60  110:aload_3         
	//   61  111:invokevirtual   #271 <Method int Matcher.end()>
	//   62  114:istore_1        
					prefixBeforeNationalNumber.append(nationalNumber.substring(0, i));
	//   63  115:aload_0         
	//   64  116:getfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
	//   65  119:aload_0         
	//   66  120:getfield        #129 <Field StringBuilder nationalNumber>
	//   67  123:iconst_0        
	//   68  124:iload_1         
	//   69  125:invokevirtual   #277 <Method String StringBuilder.substring(int, int)>
	//   70  128:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   71  131:pop             
				}
			}
		}
		if(true) goto _L4; else goto _L3
	//   72  132:goto            31
_L3:
	}

	String attemptToFormatAccruedDigits()
	{
		for(Iterator iterator = possibleFormats.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field List possibleFormats>
	//*   2    4:invokeinterface #314 <Method Iterator List.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #319 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            85
		{
			Phonemetadata.NumberFormat numberformat = (Phonemetadata.NumberFormat)iterator.next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #323 <Method Object Iterator.next()>
	//    9   25:checkcast       #281 <Class Phonemetadata$NumberFormat>
	//   10   28:astore_2        
			Matcher matcher = regexCache.getPatternForRegex(numberformat.getPattern()).matcher(((CharSequence) (nationalNumber)));
	//   11   29:aload_0         
	//   12   30:getfield        #141 <Field RegexCache regexCache>
	//   13   33:aload_2         
	//   14   34:invokevirtual   #284 <Method String Phonemetadata$NumberFormat.getPattern()>
	//   15   37:invokevirtual   #259 <Method Pattern RegexCache.getPatternForRegex(String)>
	//   16   40:aload_0         
	//   17   41:getfield        #129 <Field StringBuilder nationalNumber>
	//   18   44:invokevirtual   #263 <Method Matcher Pattern.matcher(CharSequence)>
	//   19   47:astore_3        
			if(matcher.matches())
	//*  20   48:aload_3         
	//*  21   49:invokevirtual   #412 <Method boolean Matcher.matches()>
	//*  22   52:ifeq            10
			{
				shouldAddSpaceAfterNationalPrefix = NATIONAL_PREFIX_SEPARATORS_PATTERN.matcher(((CharSequence) (numberformat.getNationalPrefixFormattingRule()))).find();
	//   23   55:aload_0         
	//   24   56:getstatic       #87  <Field Pattern NATIONAL_PREFIX_SEPARATORS_PATTERN>
	//   25   59:aload_2         
	//   26   60:invokevirtual   #329 <Method String Phonemetadata$NumberFormat.getNationalPrefixFormattingRule()>
	//   27   63:invokevirtual   #263 <Method Matcher Pattern.matcher(CharSequence)>
	//   28   66:invokevirtual   #350 <Method boolean Matcher.find()>
	//   29   69:putfield        #125 <Field boolean shouldAddSpaceAfterNationalPrefix>
				return appendNationalNumber(matcher.replaceAll(numberformat.getFormat()));
	//   30   72:aload_0         
	//   31   73:aload_3         
	//   32   74:aload_2         
	//   33   75:invokevirtual   #296 <Method String Phonemetadata$NumberFormat.getFormat()>
	//   34   78:invokevirtual   #293 <Method String Matcher.replaceAll(String)>
	//   35   81:invokespecial   #218 <Method String appendNationalNumber(String)>
	//   36   84:areturn         
			}
		}

		return "";
	//   37   85:ldc1            #94  <String "">
	//   38   87:areturn         
	}

	public void clear()
	{
		currentOutput = "";
	//    0    0:aload_0         
	//    1    1:ldc1            #94  <String "">
	//    2    3:putfield        #96  <Field String currentOutput>
		accruedInput.setLength(0);
	//    3    6:aload_0         
	//    4    7:getfield        #105 <Field StringBuilder accruedInput>
	//    5   10:iconst_0        
	//    6   11:invokevirtual   #171 <Method void StringBuilder.setLength(int)>
		accruedInputWithoutFormatting.setLength(0);
	//    7   14:aload_0         
	//    8   15:getfield        #107 <Field StringBuilder accruedInputWithoutFormatting>
	//    9   18:iconst_0        
	//   10   19:invokevirtual   #171 <Method void StringBuilder.setLength(int)>
		formattingTemplate.setLength(0);
	//   11   22:aload_0         
	//   12   23:getfield        #101 <Field StringBuilder formattingTemplate>
	//   13   26:iconst_0        
	//   14   27:invokevirtual   #171 <Method void StringBuilder.setLength(int)>
		lastMatchPosition = 0;
	//   15   30:aload_0         
	//   16   31:iconst_0        
	//   17   32:putfield        #117 <Field int lastMatchPosition>
		currentFormattingPattern = "";
	//   18   35:aload_0         
	//   19   36:ldc1            #94  <String "">
	//   20   38:putfield        #103 <Field String currentFormattingPattern>
		prefixBeforeNationalNumber.setLength(0);
	//   21   41:aload_0         
	//   22   42:getfield        #123 <Field StringBuilder prefixBeforeNationalNumber>
	//   23   45:iconst_0        
	//   24   46:invokevirtual   #171 <Method void StringBuilder.setLength(int)>
		extractedNationalPrefix = "";
	//   25   49:aload_0         
	//   26   50:ldc1            #94  <String "">
	//   27   52:putfield        #127 <Field String extractedNationalPrefix>
		nationalNumber.setLength(0);
	//   28   55:aload_0         
	//   29   56:getfield        #129 <Field StringBuilder nationalNumber>
	//   30   59:iconst_0        
	//   31   60:invokevirtual   #171 <Method void StringBuilder.setLength(int)>
		ableToFormat = true;
	//   32   63:aload_0         
	//   33   64:iconst_1        
	//   34   65:putfield        #109 <Field boolean ableToFormat>
		inputHasFormatting = false;
	//   35   68:aload_0         
	//   36   69:iconst_0        
	//   37   70:putfield        #111 <Field boolean inputHasFormatting>
		positionToRemember = 0;
	//   38   73:aload_0         
	//   39   74:iconst_0        
	//   40   75:putfield        #121 <Field int positionToRemember>
		originalPosition = 0;
	//   41   78:aload_0         
	//   42   79:iconst_0        
	//   43   80:putfield        #119 <Field int originalPosition>
		isCompleteNumber = false;
	//   44   83:aload_0         
	//   45   84:iconst_0        
	//   46   85:putfield        #113 <Field boolean isCompleteNumber>
		isExpectingCountryCallingCode = false;
	//   47   88:aload_0         
	//   48   89:iconst_0        
	//   49   90:putfield        #115 <Field boolean isExpectingCountryCallingCode>
		possibleFormats.clear();
	//   50   93:aload_0         
	//   51   94:getfield        #134 <Field List possibleFormats>
	//   52   97:invokeinterface #224 <Method void List.clear()>
		shouldAddSpaceAfterNationalPrefix = false;
	//   53  102:aload_0         
	//   54  103:iconst_0        
	//   55  104:putfield        #125 <Field boolean shouldAddSpaceAfterNationalPrefix>
		if(!((Object) (currentMetadata)).equals(((Object) (defaultMetadata))))
	//*  56  107:aload_0         
	//*  57  108:getfield        #150 <Field Phonemetadata$PhoneMetadata currentMetadata>
	//*  58  111:aload_0         
	//*  59  112:getfield        #152 <Field Phonemetadata$PhoneMetadata defaultMetadata>
	//*  60  115:invokevirtual   #454 <Method boolean Object.equals(Object)>
	//*  61  118:ifne            133
			currentMetadata = getMetadataForRegion(defaultCountry);
	//   62  121:aload_0         
	//   63  122:aload_0         
	//   64  123:aload_0         
	//   65  124:getfield        #145 <Field String defaultCountry>
	//   66  127:invokespecial   #148 <Method Phonemetadata$PhoneMetadata getMetadataForRegion(String)>
	//   67  130:putfield        #150 <Field Phonemetadata$PhoneMetadata currentMetadata>
	//   68  133:return          
	}

	String getExtractedNationalPrefix()
	{
		return extractedNationalPrefix;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field String extractedNationalPrefix>
	//    2    4:areturn         
	}

	public int getRememberedPosition()
	{
		if(ableToFormat) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field boolean ableToFormat>
	//    2    4:ifne            14
_L1:
		int k = originalPosition;
	//    3    7:aload_0         
	//    4    8:getfield        #119 <Field int originalPosition>
	//    5   11:istore_3        
_L4:
		return k;
	//    6   12:iload_3         
	//    7   13:ireturn         
_L2:
		int i;
		int j;
		j = 0;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		i = 0;
	//   10   16:iconst_0        
	//   11   17:istore_1        
_L6:
		k = i;
	//   12   18:iload_1         
	//   13   19:istore_3        
		if(j >= positionToRemember) goto _L4; else goto _L3
	//   14   20:iload_2         
	//   15   21:aload_0         
	//   16   22:getfield        #121 <Field int positionToRemember>
	//   17   25:icmpge          12
_L3:
		k = i;
	//   18   28:iload_1         
	//   19   29:istore_3        
		if(i >= currentOutput.length()) goto _L4; else goto _L5
	//   20   30:iload_1         
	//   21   31:aload_0         
	//   22   32:getfield        #96  <Field String currentOutput>
	//   23   35:invokevirtual   #160 <Method int String.length()>
	//   24   38:icmpge          12
_L5:
		int l = j;
	//   25   41:iload_2         
	//   26   42:istore_3        
		if(accruedInputWithoutFormatting.charAt(j) == currentOutput.charAt(i))
	//*  27   43:aload_0         
	//*  28   44:getfield        #107 <Field StringBuilder accruedInputWithoutFormatting>
	//*  29   47:iload_2         
	//*  30   48:invokevirtual   #186 <Method char StringBuilder.charAt(int)>
	//*  31   51:aload_0         
	//*  32   52:getfield        #96  <Field String currentOutput>
	//*  33   55:iload_1         
	//*  34   56:invokevirtual   #457 <Method char String.charAt(int)>
	//*  35   59:icmpne          66
			l = j + 1;
	//   36   62:iload_2         
	//   37   63:iconst_1        
	//   38   64:iadd            
	//   39   65:istore_3        
		i++;
	//   40   66:iload_1         
	//   41   67:iconst_1        
	//   42   68:iadd            
	//   43   69:istore_1        
		j = l;
	//   44   70:iload_3         
	//   45   71:istore_2        
		  goto _L6
	//*  46   72:goto            18
	}

	public String inputDigit(char c)
	{
		currentOutput = inputDigitWithOptionToRememberPosition(c, false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #460 <Method String inputDigitWithOptionToRememberPosition(char, boolean)>
	//    5    7:putfield        #96  <Field String currentOutput>
		return currentOutput;
	//    6   10:aload_0         
	//    7   11:getfield        #96  <Field String currentOutput>
	//    8   14:areturn         
	}

	public String inputDigitAndRememberPosition(char c)
	{
		currentOutput = inputDigitWithOptionToRememberPosition(c, true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #460 <Method String inputDigitWithOptionToRememberPosition(char, boolean)>
	//    5    7:putfield        #96  <Field String currentOutput>
		return currentOutput;
	//    6   10:aload_0         
	//    7   11:getfield        #96  <Field String currentOutput>
	//    8   14:areturn         
	}

	private static final Pattern CHARACTER_CLASS_PATTERN = Pattern.compile("\\[([^\\[\\]])*\\]");
	private static final Pattern DIGIT_PATTERN = Pattern.compile("\u2008");
	private static final String DIGIT_PLACEHOLDER = "\u2008";
	private static final Pattern ELIGIBLE_FORMAT_PATTERN = Pattern.compile("[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]*(\\$\\d[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]*)+");
	private static final Phonemetadata.PhoneMetadata EMPTY_METADATA = (new Phonemetadata.PhoneMetadata()).setInternationalPrefix("NA");
	private static final int MIN_LEADING_DIGITS_LENGTH = 3;
	private static final Pattern NATIONAL_PREFIX_SEPARATORS_PATTERN = Pattern.compile("[- ]");
	private static final char SEPARATOR_BEFORE_NATIONAL_NUMBER = 32;
	private static final Pattern STANDALONE_DIGIT_PATTERN = Pattern.compile("\\d(?=[^,}][^,}])");
	private boolean ableToFormat;
	private StringBuilder accruedInput;
	private StringBuilder accruedInputWithoutFormatting;
	private String currentFormattingPattern;
	private Phonemetadata.PhoneMetadata currentMetadata;
	private String currentOutput;
	private String defaultCountry;
	private Phonemetadata.PhoneMetadata defaultMetadata;
	private String extractedNationalPrefix;
	private StringBuilder formattingTemplate;
	private boolean inputHasFormatting;
	private boolean isCompleteNumber;
	private boolean isExpectingCountryCallingCode;
	private int lastMatchPosition;
	private StringBuilder nationalNumber;
	private int originalPosition;
	private final PhoneNumberUtil phoneUtil;
	private int positionToRemember;
	private List possibleFormats;
	private StringBuilder prefixBeforeNationalNumber;
	private RegexCache regexCache;
	private boolean shouldAddSpaceAfterNationalPrefix;

	static 
	{
	//    0    0:new             #54  <Class Phonemetadata$PhoneMetadata>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void Phonemetadata$PhoneMetadata()>
	//    3    7:ldc1            #59  <String "NA">
	//    4    9:invokevirtual   #63  <Method Phonemetadata$PhoneMetadata Phonemetadata$PhoneMetadata.setInternationalPrefix(String)>
	//    5   12:putstatic       #65  <Field Phonemetadata$PhoneMetadata EMPTY_METADATA>
	//    6   15:ldc1            #67  <String "\\[([^\\[\\]])*\\]">
	//    7   17:invokestatic    #73  <Method Pattern Pattern.compile(String)>
	//    8   20:putstatic       #75  <Field Pattern CHARACTER_CLASS_PATTERN>
	//    9   23:ldc1            #77  <String "\\d(?=[^,}][^,}])">
	//   10   25:invokestatic    #73  <Method Pattern Pattern.compile(String)>
	//   11   28:putstatic       #79  <Field Pattern STANDALONE_DIGIT_PATTERN>
	//   12   31:ldc1            #81  <String "[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]*(\\$\\d[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]*)+">
	//   13   33:invokestatic    #73  <Method Pattern Pattern.compile(String)>
	//   14   36:putstatic       #83  <Field Pattern ELIGIBLE_FORMAT_PATTERN>
	//   15   39:ldc1            #85  <String "[- ]">
	//   16   41:invokestatic    #73  <Method Pattern Pattern.compile(String)>
	//   17   44:putstatic       #87  <Field Pattern NATIONAL_PREFIX_SEPARATORS_PATTERN>
	//   18   47:ldc1            #11  <String "\u2008">
	//   19   49:invokestatic    #73  <Method Pattern Pattern.compile(String)>
	//   20   52:putstatic       #89  <Field Pattern DIGIT_PATTERN>
	//*  21   55:return          
	}
}
