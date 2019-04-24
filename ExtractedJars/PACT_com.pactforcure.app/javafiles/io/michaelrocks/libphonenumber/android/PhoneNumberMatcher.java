// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.libphonenumber.android;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package io.michaelrocks.libphonenumber.android:
//			PhoneNumberUtil, MetadataSource, NumberParseException, PhoneNumberMatch

final class PhoneNumberMatcher
	implements Iterator
{
	static interface NumberGroupingChecker
	{

		public abstract boolean checkGroups(PhoneNumberUtil phonenumberutil, Phonenumber.PhoneNumber phonenumber, StringBuilder stringbuilder, String as[]);
	}

	private static final class State extends Enum
	{

		public static State valueOf(String s)
		{
			return (State)Enum.valueOf(io/michaelrocks/libphonenumber/android/PhoneNumberMatcher$State, s);
		//    0    0:ldc1            #2   <Class PhoneNumberMatcher$State>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PhoneNumberMatcher$State>
		//    4    9:areturn         
		}

		public static State[] values()
		{
			return (State[])((State []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field PhoneNumberMatcher$State[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lio.michaelrocks.libphonenumber.android.PhoneNumberMatcher$State_3B_.clone()>
		//    2    6:checkcast       #42  <Class PhoneNumberMatcher$State[]>
		//    3    9:areturn         
		}

		private static final State $VALUES[];
		public static final State DONE;
		public static final State NOT_READY;
		public static final State READY;

		static 
		{
			NOT_READY = new State("NOT_READY", 0);
		//    0    0:new             #2   <Class PhoneNumberMatcher$State>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "NOT_READY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void PhoneNumberMatcher$State(String, int)>
		//    5   10:putstatic       #23  <Field PhoneNumberMatcher$State NOT_READY>
			READY = new State("READY", 1);
		//    6   13:new             #2   <Class PhoneNumberMatcher$State>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "READY">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void PhoneNumberMatcher$State(String, int)>
		//   11   23:putstatic       #26  <Field PhoneNumberMatcher$State READY>
			DONE = new State("DONE", 2);
		//   12   26:new             #2   <Class PhoneNumberMatcher$State>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "DONE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void PhoneNumberMatcher$State(String, int)>
		//   17   36:putstatic       #29  <Field PhoneNumberMatcher$State DONE>
			$VALUES = (new State[] {
				NOT_READY, READY, DONE
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       State[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field PhoneNumberMatcher$State NOT_READY>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field PhoneNumberMatcher$State READY>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field PhoneNumberMatcher$State DONE>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field PhoneNumberMatcher$State[] $VALUES>
		//*  33   64:return          
		}

		private State(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	PhoneNumberMatcher(PhoneNumberUtil phonenumberutil, CharSequence charsequence, String s, PhoneNumberUtil.Leniency leniency1, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method void Object()>
		state = State.NOT_READY;
	//    2    4:aload_0         
	//    3    5:getstatic       #150 <Field PhoneNumberMatcher$State PhoneNumberMatcher$State.NOT_READY>
	//    4    8:putfield        #152 <Field PhoneNumberMatcher$State state>
		lastMatch = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #154 <Field PhoneNumberMatch lastMatch>
		searchIndex = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #156 <Field int searchIndex>
		if(phonenumberutil == null || leniency1 == null)
	//*  11   21:aload_1         
	//*  12   22:ifnull          30
	//*  13   25:aload           4
	//*  14   27:ifnonnull       38
			throw new NullPointerException();
	//   15   30:new             #158 <Class NullPointerException>
	//   16   33:dup             
	//   17   34:invokespecial   #159 <Method void NullPointerException()>
	//   18   37:athrow          
		if(l < 0L)
	//*  19   38:lload           5
	//*  20   40:lconst_0        
	//*  21   41:lcmp            
	//*  22   42:ifge            53
			throw new IllegalArgumentException();
	//   23   45:new             #161 <Class IllegalArgumentException>
	//   24   48:dup             
	//   25   49:invokespecial   #162 <Method void IllegalArgumentException()>
	//   26   52:athrow          
		phoneUtil = phonenumberutil;
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:putfield        #164 <Field PhoneNumberUtil phoneUtil>
		if(charsequence == null)
	//*  30   58:aload_2         
	//*  31   59:ifnull          85
	//*  32   62:aload_0         
	//*  33   63:aload_2         
	//*  34   64:putfield        #166 <Field CharSequence text>
	//*  35   67:aload_0         
	//*  36   68:aload_3         
	//*  37   69:putfield        #168 <Field String preferredRegion>
	//*  38   72:aload_0         
	//*  39   73:aload           4
	//*  40   75:putfield        #170 <Field PhoneNumberUtil$Leniency leniency>
	//*  41   78:aload_0         
	//*  42   79:lload           5
	//*  43   81:putfield        #172 <Field long maxTries>
	//*  44   84:return          
			charsequence = "";
	//   45   85:ldc1            #174 <String "">
	//   46   87:astore_2        
		text = charsequence;
		preferredRegion = s;
		leniency = leniency1;
		maxTries = l;
	//*  47   88:goto            62
	}

	static boolean allNumberGroupsAreExactlyPresent(PhoneNumberUtil phonenumberutil, Phonenumber.PhoneNumber phonenumber, StringBuilder stringbuilder, String as[])
	{
		stringbuilder = ((StringBuilder) (PhoneNumberUtil.NON_DIGITS_PATTERN.split(((CharSequence) (stringbuilder.toString())))));
	//    0    0:getstatic       #179 <Field Pattern PhoneNumberUtil.NON_DIGITS_PATTERN>
	//    1    3:aload_2         
	//    2    4:invokevirtual   #98  <Method String StringBuilder.toString()>
	//    3    7:invokevirtual   #183 <Method String[] Pattern.split(CharSequence)>
	//    4   10:astore_2        
		int i;
		if(phonenumber.hasExtension())
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #189 <Method boolean Phonenumber$PhoneNumber.hasExtension()>
	//*   7   15:ifeq            47
			i = stringbuilder.length - 2;
	//    8   18:aload_2         
	//    9   19:arraylength     
	//   10   20:iconst_2        
	//   11   21:isub            
	//   12   22:istore          4
		else
	//*  13   24:aload_2         
	//*  14   25:arraylength     
	//*  15   26:iconst_1        
	//*  16   27:icmpeq          45
	//*  17   30:aload_2         
	//*  18   31:iload           4
	//*  19   33:aaload          
	//*  20   34:aload_0         
	//*  21   35:aload_1         
	//*  22   36:invokevirtual   #193 <Method String PhoneNumberUtil.getNationalSignificantNumber(Phonenumber$PhoneNumber)>
	//*  23   39:invokevirtual   #199 <Method boolean String.contains(CharSequence)>
	//*  24   42:ifeq            56
	//*  25   45:iconst_1        
	//*  26   46:ireturn         
			i = stringbuilder.length - 1;
	//   27   47:aload_2         
	//   28   48:arraylength     
	//   29   49:iconst_1        
	//   30   50:isub            
	//   31   51:istore          4
		if(stringbuilder.length != 1 && !((String) (stringbuilder[i])).contains(((CharSequence) (phonenumberutil.getNationalSignificantNumber(phonenumber)))))
	//*  32   53:goto            24
		{
			for(int j = as.length - 1; j > 0 && i >= 0; i--)
	//*  33   56:aload_3         
	//*  34   57:arraylength     
	//*  35   58:iconst_1        
	//*  36   59:isub            
	//*  37   60:istore          5
	//*  38   62:iload           5
	//*  39   64:ifle            103
	//*  40   67:iload           4
	//*  41   69:iflt            103
			{
				if(!((String) (stringbuilder[i])).equals(((Object) (as[j]))))
	//*  42   72:aload_2         
	//*  43   73:iload           4
	//*  44   75:aaload          
	//*  45   76:aload_3         
	//*  46   77:iload           5
	//*  47   79:aaload          
	//*  48   80:invokevirtual   #203 <Method boolean String.equals(Object)>
	//*  49   83:ifne            88
					return false;
	//   50   86:iconst_0        
	//   51   87:ireturn         
				j--;
	//   52   88:iload           5
	//   53   90:iconst_1        
	//   54   91:isub            
	//   55   92:istore          5
			}

	//   56   94:iload           4
	//   57   96:iconst_1        
	//   58   97:isub            
	//   59   98:istore          4
	//*  60  100:goto            62
			if(i < 0 || !((String) (stringbuilder[i])).endsWith(as[0]))
	//*  61  103:iload           4
	//*  62  105:iflt            121
	//*  63  108:aload_2         
	//*  64  109:iload           4
	//*  65  111:aaload          
	//*  66  112:aload_3         
	//*  67  113:iconst_0        
	//*  68  114:aaload          
	//*  69  115:invokevirtual   #207 <Method boolean String.endsWith(String)>
	//*  70  118:ifne            45
				return false;
	//   71  121:iconst_0        
	//   72  122:ireturn         
		}
		return true;
	}

	static boolean allNumberGroupsRemainGrouped(PhoneNumberUtil phonenumberutil, Phonenumber.PhoneNumber phonenumber, StringBuilder stringbuilder, String as[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(phonenumber.getCountryCodeSource() != Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY)
	//*   2    3:aload_1         
	//*   3    4:invokevirtual   #212 <Method Phonenumber$PhoneNumber$CountryCodeSource Phonenumber$PhoneNumber.getCountryCodeSource()>
	//*   4    7:getstatic       #218 <Field Phonenumber$PhoneNumber$CountryCodeSource Phonenumber$PhoneNumber$CountryCodeSource.FROM_DEFAULT_COUNTRY>
	//*   5   10:if_acmpeq       36
		{
			String s = Integer.toString(phonenumber.getCountryCode());
	//    6   13:aload_1         
	//    7   14:invokevirtual   #222 <Method int Phonenumber$PhoneNumber.getCountryCode()>
	//    8   17:invokestatic    #227 <Method String Integer.toString(int)>
	//    9   20:astore          6
			i = stringbuilder.indexOf(s) + s.length();
	//   10   22:aload_2         
	//   11   23:aload           6
	//   12   25:invokevirtual   #231 <Method int StringBuilder.indexOf(String)>
	//   13   28:aload           6
	//   14   30:invokevirtual   #234 <Method int String.length()>
	//   15   33:iadd            
	//   16   34:istore          4
		}
		for(int j = 0; j < as.length; j++)
	//*  17   36:iconst_0        
	//*  18   37:istore          5
	//*  19   39:iload           5
	//*  20   41:aload_3         
	//*  21   42:arraylength     
	//*  22   43:icmpge          153
		{
			i = stringbuilder.indexOf(as[j], i);
	//   23   46:aload_2         
	//   24   47:aload_3         
	//   25   48:iload           5
	//   26   50:aaload          
	//   27   51:iload           4
	//   28   53:invokevirtual   #237 <Method int StringBuilder.indexOf(String, int)>
	//   29   56:istore          4
			if(i < 0)
	//*  30   58:iload           4
	//*  31   60:ifge            65
				return false;
	//   32   63:iconst_0        
	//   33   64:ireturn         
			i += as[j].length();
	//   34   65:iload           4
	//   35   67:aload_3         
	//   36   68:iload           5
	//   37   70:aaload          
	//   38   71:invokevirtual   #234 <Method int String.length()>
	//   39   74:iadd            
	//   40   75:istore          4
			if(j == 0 && i < stringbuilder.length() && phonenumberutil.getNddPrefixForRegion(phonenumberutil.getRegionCodeForCountryCode(phonenumber.getCountryCode()), true) != null && Character.isDigit(stringbuilder.charAt(i)))
	//*  41   77:iload           5
	//*  42   79:ifne            144
	//*  43   82:iload           4
	//*  44   84:aload_2         
	//*  45   85:invokevirtual   #238 <Method int StringBuilder.length()>
	//*  46   88:icmpge          144
	//*  47   91:aload_0         
	//*  48   92:aload_0         
	//*  49   93:aload_1         
	//*  50   94:invokevirtual   #222 <Method int Phonenumber$PhoneNumber.getCountryCode()>
	//*  51   97:invokevirtual   #241 <Method String PhoneNumberUtil.getRegionCodeForCountryCode(int)>
	//*  52  100:iconst_1        
	//*  53  101:invokevirtual   #245 <Method String PhoneNumberUtil.getNddPrefixForRegion(String, boolean)>
	//*  54  104:ifnull          144
	//*  55  107:aload_2         
	//*  56  108:iload           4
	//*  57  110:invokevirtual   #249 <Method char StringBuilder.charAt(int)>
	//*  58  113:invokestatic    #255 <Method boolean Character.isDigit(char)>
	//*  59  116:ifeq            144
			{
				phonenumberutil = ((PhoneNumberUtil) (phonenumberutil.getNationalSignificantNumber(phonenumber)));
	//   60  119:aload_0         
	//   61  120:aload_1         
	//   62  121:invokevirtual   #193 <Method String PhoneNumberUtil.getNationalSignificantNumber(Phonenumber$PhoneNumber)>
	//   63  124:astore_0        
				return stringbuilder.substring(i - as[j].length()).startsWith(((String) (phonenumberutil)));
	//   64  125:aload_2         
	//   65  126:iload           4
	//   66  128:aload_3         
	//   67  129:iload           5
	//   68  131:aaload          
	//   69  132:invokevirtual   #234 <Method int String.length()>
	//   70  135:isub            
	//   71  136:invokevirtual   #258 <Method String StringBuilder.substring(int)>
	//   72  139:aload_0         
	//   73  140:invokevirtual   #261 <Method boolean String.startsWith(String)>
	//   74  143:ireturn         
			}
		}

	//   75  144:iload           5
	//   76  146:iconst_1        
	//   77  147:iadd            
	//   78  148:istore          5
	//*  79  150:goto            39
		return stringbuilder.substring(i).contains(((CharSequence) (phonenumber.getExtension())));
	//   80  153:aload_2         
	//   81  154:iload           4
	//   82  156:invokevirtual   #258 <Method String StringBuilder.substring(int)>
	//   83  159:aload_1         
	//   84  160:invokevirtual   #264 <Method String Phonenumber$PhoneNumber.getExtension()>
	//   85  163:invokevirtual   #199 <Method boolean String.contains(CharSequence)>
	//   86  166:ireturn         
	}

	static boolean checkNumberGroupingIsValid(Phonenumber.PhoneNumber phonenumber, String s, PhoneNumberUtil phonenumberutil, NumberGroupingChecker numbergroupingchecker)
	{
label0:
		{
			s = ((String) (PhoneNumberUtil.normalizeDigits(s, true)));
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #270 <Method StringBuilder PhoneNumberUtil.normalizeDigits(String, boolean)>
	//    3    5:astore_1        
			if(numbergroupingchecker.checkGroups(phonenumberutil, phonenumber, ((StringBuilder) (s)), getNationalNumberGroups(phonenumberutil, phonenumber, ((Phonemetadata.NumberFormat) (null)))))
	//*   4    6:aload_3         
	//*   5    7:aload_2         
	//*   6    8:aload_0         
	//*   7    9:aload_1         
	//*   8   10:aload_2         
	//*   9   11:aload_0         
	//*  10   12:aconst_null     
	//*  11   13:invokestatic    #274 <Method String[] getNationalNumberGroups(PhoneNumberUtil, Phonenumber$PhoneNumber, Phonemetadata$NumberFormat)>
	//*  12   16:invokeinterface #277 <Method boolean PhoneNumberMatcher$NumberGroupingChecker.checkGroups(PhoneNumberUtil, Phonenumber$PhoneNumber, StringBuilder, String[])>
	//*  13   21:ifeq            26
				return true;
	//   14   24:iconst_1        
	//   15   25:ireturn         
			Object obj = ((Object) (phonenumberutil.getMetadataSource().getAlternateFormatsForCountry(phonenumber.getCountryCode())));
	//   16   26:aload_2         
	//   17   27:invokevirtual   #281 <Method MetadataSource PhoneNumberUtil.getMetadataSource()>
	//   18   30:aload_0         
	//   19   31:invokevirtual   #222 <Method int Phonenumber$PhoneNumber.getCountryCode()>
	//   20   34:invokeinterface #287 <Method Phonemetadata$PhoneMetadata MetadataSource.getAlternateFormatsForCountry(int)>
	//   21   39:astore          4
			if(obj == null)
				break label0;
	//   22   41:aload           4
	//   23   43:ifnull          97
			obj = ((Object) (((Phonemetadata.PhoneMetadata) (obj)).numberFormats().iterator()));
	//   24   46:aload           4
	//   25   48:invokevirtual   #293 <Method List Phonemetadata$PhoneMetadata.numberFormats()>
	//   26   51:invokeinterface #299 <Method Iterator List.iterator()>
	//   27   56:astore          4
			do
				if(!((Iterator) (obj)).hasNext())
					break label0;
	//   28   58:aload           4
	//   29   60:invokeinterface #302 <Method boolean Iterator.hasNext()>
	//   30   65:ifeq            97
			while(!numbergroupingchecker.checkGroups(phonenumberutil, phonenumber, ((StringBuilder) (s)), getNationalNumberGroups(phonenumberutil, phonenumber, (Phonemetadata.NumberFormat)((Iterator) (obj)).next())));
	//   31   68:aload_3         
	//   32   69:aload_2         
	//   33   70:aload_0         
	//   34   71:aload_1         
	//   35   72:aload_2         
	//   36   73:aload_0         
	//   37   74:aload           4
	//   38   76:invokeinterface #306 <Method Object Iterator.next()>
	//   39   81:checkcast       #308 <Class Phonemetadata$NumberFormat>
	//   40   84:invokestatic    #274 <Method String[] getNationalNumberGroups(PhoneNumberUtil, Phonenumber$PhoneNumber, Phonemetadata$NumberFormat)>
	//   41   87:invokeinterface #277 <Method boolean PhoneNumberMatcher$NumberGroupingChecker.checkGroups(PhoneNumberUtil, Phonenumber$PhoneNumber, StringBuilder, String[])>
	//   42   92:ifeq            58
			return true;
	//   43   95:iconst_1        
	//   44   96:ireturn         
		}
		return false;
	//   45   97:iconst_0        
	//   46   98:ireturn         
	}

	static boolean containsMoreThanOneSlashInNationalNumber(Phonenumber.PhoneNumber phonenumber, String s)
	{
		int i = s.indexOf('/');
	//    0    0:aload_1         
	//    1    1:bipush          47
	//    2    3:invokevirtual   #313 <Method int String.indexOf(int)>
	//    3    6:istore_3        
		int j;
		if(i >= 0)
	//*   4    7:iload_3         
	//*   5    8:ifge            13
	//*   6   11:iconst_0        
	//*   7   12:ireturn         
	//*   8   13:aload_1         
	//*   9   14:bipush          47
	//*  10   16:iload_3         
	//*  11   17:iconst_1        
	//*  12   18:iadd            
	//*  13   19:invokevirtual   #316 <Method int String.indexOf(int, int)>
	//*  14   22:istore          4
			if((j = s.indexOf('/', i + 1)) >= 0)
	//*  15   24:iload           4
	//*  16   26:iflt            11
			{
				boolean flag;
				if(phonenumber.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN || phonenumber.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN)
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #212 <Method Phonenumber$PhoneNumber$CountryCodeSource Phonenumber$PhoneNumber.getCountryCodeSource()>
	//*  19   33:getstatic       #319 <Field Phonenumber$PhoneNumber$CountryCodeSource Phonenumber$PhoneNumber$CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN>
	//*  20   36:if_acmpeq       49
	//*  21   39:aload_0         
	//*  22   40:invokevirtual   #212 <Method Phonenumber$PhoneNumber$CountryCodeSource Phonenumber$PhoneNumber.getCountryCodeSource()>
	//*  23   43:getstatic       #322 <Field Phonenumber$PhoneNumber$CountryCodeSource Phonenumber$PhoneNumber$CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN>
	//*  24   46:if_acmpne       92
					flag = true;
	//   25   49:iconst_1        
	//   26   50:istore_2        
				else
	//*  27   51:iload_2         
	//*  28   52:ifeq            97
	//*  29   55:aload_1         
	//*  30   56:iconst_0        
	//*  31   57:iload_3         
	//*  32   58:invokevirtual   #324 <Method String String.substring(int, int)>
	//*  33   61:invokestatic    #328 <Method String PhoneNumberUtil.normalizeDigitsOnly(String)>
	//*  34   64:aload_0         
	//*  35   65:invokevirtual   #222 <Method int Phonenumber$PhoneNumber.getCountryCode()>
	//*  36   68:invokestatic    #227 <Method String Integer.toString(int)>
	//*  37   71:invokevirtual   #203 <Method boolean String.equals(Object)>
	//*  38   74:ifeq            97
	//*  39   77:aload_1         
	//*  40   78:iload           4
	//*  41   80:iconst_1        
	//*  42   81:iadd            
	//*  43   82:invokevirtual   #329 <Method String String.substring(int)>
	//*  44   85:ldc2            #331 <String "/">
	//*  45   88:invokevirtual   #199 <Method boolean String.contains(CharSequence)>
	//*  46   91:ireturn         
					flag = false;
	//   47   92:iconst_0        
	//   48   93:istore_2        
				if(flag && PhoneNumberUtil.normalizeDigitsOnly(s.substring(0, i)).equals(((Object) (Integer.toString(phonenumber.getCountryCode())))))
					return s.substring(j + 1).contains("/");
				else
	//*  49   94:goto            51
					return true;
	//   50   97:iconst_1        
	//   51   98:ireturn         
			}
		return false;
	}

	static boolean containsOnlyValidXChars(Phonenumber.PhoneNumber phonenumber, String s, PhoneNumberUtil phonenumberutil)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
_L7:
		if(i >= s.length() - 1) goto _L2; else goto _L1
	//    2    2:iload_3         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #234 <Method int String.length()>
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:icmpge          113
_L1:
		int j;
		char c = s.charAt(i);
	//    8   12:aload_1         
	//    9   13:iload_3         
	//   10   14:invokevirtual   #334 <Method char String.charAt(int)>
	//   11   17:istore          5
		if(c != 'x')
	//*  12   19:iload           5
	//*  13   21:bipush          120
	//*  14   23:icmpeq          36
		{
			j = i;
	//   15   26:iload_3         
	//   16   27:istore          4
			if(c != 'X')
				continue; /* Loop/switch isn't completed */
	//   17   29:iload           5
	//   18   31:bipush          88
	//   19   33:icmpne          105
		}
		j = ((int) (s.charAt(i + 1)));
	//   20   36:aload_1         
	//   21   37:iload_3         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:invokevirtual   #334 <Method char String.charAt(int)>
	//   25   43:istore          4
		if(j != 120 && j != 88) goto _L4; else goto _L3
	//   26   45:iload           4
	//   27   47:bipush          120
	//   28   49:icmpeq          59
	//   29   52:iload           4
	//   30   54:bipush          88
	//   31   56:icmpne          84
_L3:
		i++;
	//   32   59:iload_3         
	//   33   60:iconst_1        
	//   34   61:iadd            
	//   35   62:istore_3        
		j = i;
	//   36   63:iload_3         
	//   37   64:istore          4
		if(phonenumberutil.isNumberMatch(phonenumber, s.substring(i)) == PhoneNumberUtil.MatchType.NSN_MATCH)
			continue; /* Loop/switch isn't completed */
	//   38   66:aload_2         
	//   39   67:aload_0         
	//   40   68:aload_1         
	//   41   69:iload_3         
	//   42   70:invokevirtual   #329 <Method String String.substring(int)>
	//   43   73:invokevirtual   #338 <Method PhoneNumberUtil$MatchType PhoneNumberUtil.isNumberMatch(Phonenumber$PhoneNumber, String)>
	//   44   76:getstatic       #344 <Field PhoneNumberUtil$MatchType PhoneNumberUtil$MatchType.NSN_MATCH>
	//   45   79:if_acmpeq       105
_L6:
		return false;
	//   46   82:iconst_0        
	//   47   83:ireturn         
_L4:
		if(!PhoneNumberUtil.normalizeDigitsOnly(s.substring(i)).equals(((Object) (phonenumber.getExtension())))) goto _L6; else goto _L5
	//   48   84:aload_1         
	//   49   85:iload_3         
	//   50   86:invokevirtual   #329 <Method String String.substring(int)>
	//   51   89:invokestatic    #328 <Method String PhoneNumberUtil.normalizeDigitsOnly(String)>
	//   52   92:aload_0         
	//   53   93:invokevirtual   #264 <Method String Phonenumber$PhoneNumber.getExtension()>
	//   54   96:invokevirtual   #203 <Method boolean String.equals(Object)>
	//   55   99:ifeq            82
_L5:
		j = i;
	//   56  102:iload_3         
	//   57  103:istore          4
		i = j + 1;
	//   58  105:iload           4
	//   59  107:iconst_1        
	//   60  108:iadd            
	//   61  109:istore_3        
		  goto _L7
	//*  62  110:goto            2
_L2:
		return true;
	//   63  113:iconst_1        
	//   64  114:ireturn         
	}

	private PhoneNumberMatch extractInnerMatch(String s, int i)
	{
		int j;
		int k;
		Pattern apattern[];
		apattern = INNER_MATCHES;
	//    0    0:getstatic       #77  <Field Pattern[] INNER_MATCHES>
	//    1    3:astore          9
		k = apattern.length;
	//    2    5:aload           9
	//    3    7:arraylength     
	//    4    8:istore          6
		j = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
_L10:
		if(j >= k) goto _L2; else goto _L1
	//    7   12:iload_3         
	//    8   13:iload           6
	//    9   15:icmpge          170
_L1:
		boolean flag;
		Matcher matcher;
		matcher = apattern[j].matcher(((CharSequence) (s)));
	//   10   18:aload           9
	//   11   20:iload_3         
	//   12   21:aaload          
	//   13   22:aload_1         
	//   14   23:invokevirtual   #350 <Method Matcher Pattern.matcher(CharSequence)>
	//   15   26:astore          10
		flag = true;
	//   16   28:iconst_1        
	//   17   29:istore          4
_L9:
		boolean flag1;
		if(!matcher.find() || maxTries <= 0L)
			continue; /* Loop/switch isn't completed */
	//   18   31:aload           10
	//   19   33:invokevirtual   #355 <Method boolean Matcher.find()>
	//   20   36:ifeq            163
	//   21   39:aload_0         
	//   22   40:getfield        #172 <Field long maxTries>
	//   23   43:lconst_0        
	//   24   44:lcmp            
	//   25   45:ifle            163
		flag1 = flag;
	//   26   48:iload           4
	//   27   50:istore          5
		if(!flag) goto _L4; else goto _L3
	//   28   52:iload           4
	//   29   54:ifeq            106
_L3:
		PhoneNumberMatch phonenumbermatch = parseAndVerify(trimAfterFirstMatch(PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN, ((CharSequence) (s.substring(0, matcher.start())))).toString(), i);
	//   30   57:aload_0         
	//   31   58:getstatic       #358 <Field Pattern PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN>
	//   32   61:aload_1         
	//   33   62:iconst_0        
	//   34   63:aload           10
	//   35   65:invokevirtual   #361 <Method int Matcher.start()>
	//   36   68:invokevirtual   #324 <Method String String.substring(int, int)>
	//   37   71:invokestatic    #365 <Method CharSequence trimAfterFirstMatch(Pattern, CharSequence)>
	//   38   74:invokeinterface #368 <Method String CharSequence.toString()>
	//   39   79:iload_2         
	//   40   80:invokespecial   #371 <Method PhoneNumberMatch parseAndVerify(String, int)>
	//   41   83:astore          7
		if(phonenumbermatch == null) goto _L6; else goto _L5
	//   42   85:aload           7
	//   43   87:ifnull          93
_L5:
		return phonenumbermatch;
	//   44   90:aload           7
	//   45   92:areturn         
_L6:
		maxTries = maxTries - 1L;
	//   46   93:aload_0         
	//   47   94:aload_0         
	//   48   95:getfield        #172 <Field long maxTries>
	//   49   98:lconst_1        
	//   50   99:lsub            
	//   51  100:putfield        #172 <Field long maxTries>
		flag1 = false;
	//   52  103:iconst_0        
	//   53  104:istore          5
_L4:
		PhoneNumberMatch phonenumbermatch1;
		phonenumbermatch1 = parseAndVerify(trimAfterFirstMatch(PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN, ((CharSequence) (matcher.group(1)))).toString(), matcher.start(1) + i);
	//   54  106:aload_0         
	//   55  107:getstatic       #358 <Field Pattern PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN>
	//   56  110:aload           10
	//   57  112:iconst_1        
	//   58  113:invokevirtual   #374 <Method String Matcher.group(int)>
	//   59  116:invokestatic    #365 <Method CharSequence trimAfterFirstMatch(Pattern, CharSequence)>
	//   60  119:invokeinterface #368 <Method String CharSequence.toString()>
	//   61  124:aload           10
	//   62  126:iconst_1        
	//   63  127:invokevirtual   #376 <Method int Matcher.start(int)>
	//   64  130:iload_2         
	//   65  131:iadd            
	//   66  132:invokespecial   #371 <Method PhoneNumberMatch parseAndVerify(String, int)>
	//   67  135:astore          8
		phonenumbermatch = phonenumbermatch1;
	//   68  137:aload           8
	//   69  139:astore          7
		if(phonenumbermatch1 != null) goto _L5; else goto _L7
	//   70  141:aload           8
	//   71  143:ifnonnull       90
_L7:
		maxTries = maxTries - 1L;
	//   72  146:aload_0         
	//   73  147:aload_0         
	//   74  148:getfield        #172 <Field long maxTries>
	//   75  151:lconst_1        
	//   76  152:lsub            
	//   77  153:putfield        #172 <Field long maxTries>
		flag = flag1;
	//   78  156:iload           5
	//   79  158:istore          4
		if(true) goto _L9; else goto _L8
	//   80  160:goto            31
_L8:
		j++;
	//   81  163:iload_3         
	//   82  164:iconst_1        
	//   83  165:iadd            
	//   84  166:istore_3        
		  goto _L10
	//*  85  167:goto            12
_L2:
		return null;
	//   86  170:aconst_null     
	//   87  171:areturn         
	}

	private PhoneNumberMatch extractMatch(CharSequence charsequence, int i)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		String s;
		if(!SLASH_SEPARATED_DATES.matcher(charsequence).find())
	//*   2    2:getstatic       #55  <Field Pattern SLASH_SEPARATED_DATES>
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #350 <Method Matcher Pattern.matcher(CharSequence)>
	//*   5    9:invokevirtual   #355 <Method boolean Matcher.find()>
	//*   6   12:ifeq            17
	//*   7   15:aload_3         
	//*   8   16:areturn         
			if(!TIME_STAMPS.matcher(charsequence).find() || !TIME_STAMPS_SUFFIX.matcher(((CharSequence) (s = text.toString().substring(charsequence.length() + i)))).lookingAt())
	//*   9   17:getstatic       #59  <Field Pattern TIME_STAMPS>
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #350 <Method Matcher Pattern.matcher(CharSequence)>
	//*  12   24:invokevirtual   #355 <Method boolean Matcher.find()>
	//*  13   27:ifeq            66
	//*  14   30:aload_0         
	//*  15   31:getfield        #166 <Field CharSequence text>
	//*  16   34:invokeinterface #368 <Method String CharSequence.toString()>
	//*  17   39:aload_1         
	//*  18   40:invokeinterface #379 <Method int CharSequence.length()>
	//*  19   45:iload_2         
	//*  20   46:iadd            
	//*  21   47:invokevirtual   #329 <Method String String.substring(int)>
	//*  22   50:astore          4
	//*  23   52:getstatic       #63  <Field Pattern TIME_STAMPS_SUFFIX>
	//*  24   55:aload           4
	//*  25   57:invokevirtual   #350 <Method Matcher Pattern.matcher(CharSequence)>
	//*  26   60:invokevirtual   #382 <Method boolean Matcher.lookingAt()>
	//*  27   63:ifne            15
			{
				String s1 = charsequence.toString();
	//   28   66:aload_1         
	//   29   67:invokeinterface #368 <Method String CharSequence.toString()>
	//   30   72:astore          4
				charsequence = ((CharSequence) (parseAndVerify(s1, i)));
	//   31   74:aload_0         
	//   32   75:aload           4
	//   33   77:iload_2         
	//   34   78:invokespecial   #371 <Method PhoneNumberMatch parseAndVerify(String, int)>
	//   35   81:astore_1        
				obj = ((Object) (charsequence));
	//   36   82:aload_1         
	//   37   83:astore_3        
				if(charsequence == null)
	//*  38   84:aload_1         
	//*  39   85:ifnonnull       15
					return extractInnerMatch(s1, i);
	//   40   88:aload_0         
	//   41   89:aload           4
	//   42   91:iload_2         
	//   43   92:invokespecial   #384 <Method PhoneNumberMatch extractInnerMatch(String, int)>
	//   44   95:areturn         
			}
		return ((PhoneNumberMatch) (obj));
	}

	private PhoneNumberMatch find(int i)
	{
		for(Matcher matcher = PATTERN.matcher(text); maxTries > 0L && matcher.find(i); maxTries = maxTries - 1L)
	//*   0    0:getstatic       #144 <Field Pattern PATTERN>
	//*   1    3:aload_0         
	//*   2    4:getfield        #166 <Field CharSequence text>
	//*   3    7:invokevirtual   #350 <Method Matcher Pattern.matcher(CharSequence)>
	//*   4   10:astore_2        
	//*   5   11:aload_0         
	//*   6   12:getfield        #172 <Field long maxTries>
	//*   7   15:lconst_0        
	//*   8   16:lcmp            
	//*   9   17:ifle            94
	//*  10   20:aload_2         
	//*  11   21:iload_1         
	//*  12   22:invokevirtual   #388 <Method boolean Matcher.find(int)>
	//*  13   25:ifeq            94
		{
			i = matcher.start();
	//   14   28:aload_2         
	//   15   29:invokevirtual   #361 <Method int Matcher.start()>
	//   16   32:istore_1        
			CharSequence charsequence = text.subSequence(i, matcher.end());
	//   17   33:aload_0         
	//   18   34:getfield        #166 <Field CharSequence text>
	//   19   37:iload_1         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #391 <Method int Matcher.end()>
	//   22   42:invokeinterface #395 <Method CharSequence CharSequence.subSequence(int, int)>
	//   23   47:astore_3        
			charsequence = trimAfterFirstMatch(PhoneNumberUtil.SECOND_NUMBER_START_PATTERN, charsequence);
	//   24   48:getstatic       #398 <Field Pattern PhoneNumberUtil.SECOND_NUMBER_START_PATTERN>
	//   25   51:aload_3         
	//   26   52:invokestatic    #365 <Method CharSequence trimAfterFirstMatch(Pattern, CharSequence)>
	//   27   55:astore_3        
			PhoneNumberMatch phonenumbermatch = extractMatch(charsequence, i);
	//   28   56:aload_0         
	//   29   57:aload_3         
	//   30   58:iload_1         
	//   31   59:invokespecial   #400 <Method PhoneNumberMatch extractMatch(CharSequence, int)>
	//   32   62:astore          4
			if(phonenumbermatch != null)
	//*  33   64:aload           4
	//*  34   66:ifnull          72
				return phonenumbermatch;
	//   35   69:aload           4
	//   36   71:areturn         
			i += charsequence.length();
	//   37   72:iload_1         
	//   38   73:aload_3         
	//   39   74:invokeinterface #379 <Method int CharSequence.length()>
	//   40   79:iadd            
	//   41   80:istore_1        
		}

	//   42   81:aload_0         
	//   43   82:aload_0         
	//   44   83:getfield        #172 <Field long maxTries>
	//   45   86:lconst_1        
	//   46   87:lsub            
	//   47   88:putfield        #172 <Field long maxTries>
	//*  48   91:goto            11
		return null;
	//   49   94:aconst_null     
	//   50   95:areturn         
	}

	private static String[] getNationalNumberGroups(PhoneNumberUtil phonenumberutil, Phonenumber.PhoneNumber phonenumber, Phonemetadata.NumberFormat numberformat)
	{
		if(numberformat == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       54
		{
			phonenumberutil = ((PhoneNumberUtil) (phonenumberutil.format(phonenumber, PhoneNumberUtil.PhoneNumberFormat.RFC3966)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getstatic       #406 <Field PhoneNumberUtil$PhoneNumberFormat PhoneNumberUtil$PhoneNumberFormat.RFC3966>
	//    5    9:invokevirtual   #410 <Method String PhoneNumberUtil.format(Phonenumber$PhoneNumber, PhoneNumberUtil$PhoneNumberFormat)>
	//    6   12:astore_0        
			int j = ((String) (phonenumberutil)).indexOf(';');
	//    7   13:aload_0         
	//    8   14:bipush          59
	//    9   16:invokevirtual   #313 <Method int String.indexOf(int)>
	//   10   19:istore          4
			int i = j;
	//   11   21:iload           4
	//   12   23:istore_3        
			if(j < 0)
	//*  13   24:iload           4
	//*  14   26:ifge            34
				i = ((String) (phonenumberutil)).length();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #234 <Method int String.length()>
	//   17   33:istore_3        
			return ((String) (phonenumberutil)).substring(((String) (phonenumberutil)).indexOf('-') + 1, i).split("-");
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:bipush          45
	//   21   38:invokevirtual   #313 <Method int String.indexOf(int)>
	//   22   41:iconst_1        
	//   23   42:iadd            
	//   24   43:iload_3         
	//   25   44:invokevirtual   #324 <Method String String.substring(int, int)>
	//   26   47:ldc2            #412 <String "-">
	//   27   50:invokevirtual   #415 <Method String[] String.split(String)>
	//   28   53:areturn         
		} else
		{
			return phonenumberutil.formatNsnUsingPattern(phonenumberutil.getNationalSignificantNumber(phonenumber), numberformat, PhoneNumberUtil.PhoneNumberFormat.RFC3966).split("-");
	//   29   54:aload_0         
	//   30   55:aload_0         
	//   31   56:aload_1         
	//   32   57:invokevirtual   #193 <Method String PhoneNumberUtil.getNationalSignificantNumber(Phonenumber$PhoneNumber)>
	//   33   60:aload_2         
	//   34   61:getstatic       #406 <Field PhoneNumberUtil$PhoneNumberFormat PhoneNumberUtil$PhoneNumberFormat.RFC3966>
	//   35   64:invokevirtual   #419 <Method String PhoneNumberUtil.formatNsnUsingPattern(String, Phonemetadata$NumberFormat, PhoneNumberUtil$PhoneNumberFormat)>
	//   36   67:ldc2            #412 <String "-">
	//   37   70:invokevirtual   #415 <Method String[] String.split(String)>
	//   38   73:areturn         
		}
	}

	private static boolean isInvalidPunctuationSymbol(char c)
	{
		return c == '%' || Character.getType(c) == 26;
	//    0    0:iload_0         
	//    1    1:bipush          37
	//    2    3:icmpeq          15
	//    3    6:iload_0         
	//    4    7:invokestatic    #424 <Method int Character.getType(char)>
	//    5   10:bipush          26
	//    6   12:icmpne          17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	static boolean isLatinLetter(char c)
	{
		Character.UnicodeBlock unicodeblock;
		if(Character.isLetter(c) || Character.getType(c) == 6)
	//*   0    0:iload_0         
	//*   1    1:invokestatic    #428 <Method boolean Character.isLetter(char)>
	//*   2    4:ifne            18
	//*   3    7:iload_0         
	//*   4    8:invokestatic    #424 <Method int Character.getType(char)>
	//*   5   11:bipush          6
	//*   6   13:icmpeq          18
	//*   7   16:iconst_0        
	//*   8   17:ireturn         
	//*   9   18:iload_0         
	//*  10   19:invokestatic    #434 <Method Character$UnicodeBlock Character$UnicodeBlock.of(char)>
	//*  11   22:astore_1        
			if((unicodeblock = Character.UnicodeBlock.of(c)).equals(((Object) (Character.UnicodeBlock.BASIC_LATIN))) || unicodeblock.equals(((Object) (Character.UnicodeBlock.LATIN_1_SUPPLEMENT))) || unicodeblock.equals(((Object) (Character.UnicodeBlock.LATIN_EXTENDED_A))) || unicodeblock.equals(((Object) (Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL))) || unicodeblock.equals(((Object) (Character.UnicodeBlock.LATIN_EXTENDED_B))) || unicodeblock.equals(((Object) (Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS))))
	//*  12   23:aload_1         
	//*  13   24:getstatic       #438 <Field Character$UnicodeBlock Character$UnicodeBlock.BASIC_LATIN>
	//*  14   27:invokevirtual   #439 <Method boolean Character$UnicodeBlock.equals(Object)>
	//*  15   30:ifne            83
	//*  16   33:aload_1         
	//*  17   34:getstatic       #442 <Field Character$UnicodeBlock Character$UnicodeBlock.LATIN_1_SUPPLEMENT>
	//*  18   37:invokevirtual   #439 <Method boolean Character$UnicodeBlock.equals(Object)>
	//*  19   40:ifne            83
	//*  20   43:aload_1         
	//*  21   44:getstatic       #445 <Field Character$UnicodeBlock Character$UnicodeBlock.LATIN_EXTENDED_A>
	//*  22   47:invokevirtual   #439 <Method boolean Character$UnicodeBlock.equals(Object)>
	//*  23   50:ifne            83
	//*  24   53:aload_1         
	//*  25   54:getstatic       #448 <Field Character$UnicodeBlock Character$UnicodeBlock.LATIN_EXTENDED_ADDITIONAL>
	//*  26   57:invokevirtual   #439 <Method boolean Character$UnicodeBlock.equals(Object)>
	//*  27   60:ifne            83
	//*  28   63:aload_1         
	//*  29   64:getstatic       #451 <Field Character$UnicodeBlock Character$UnicodeBlock.LATIN_EXTENDED_B>
	//*  30   67:invokevirtual   #439 <Method boolean Character$UnicodeBlock.equals(Object)>
	//*  31   70:ifne            83
	//*  32   73:aload_1         
	//*  33   74:getstatic       #454 <Field Character$UnicodeBlock Character$UnicodeBlock.COMBINING_DIACRITICAL_MARKS>
	//*  34   77:invokevirtual   #439 <Method boolean Character$UnicodeBlock.equals(Object)>
	//*  35   80:ifeq            16
				return true;
	//   36   83:iconst_1        
	//   37   84:ireturn         
		return false;
	}

	static boolean isNationalPrefixPresentIfRequired(Phonenumber.PhoneNumber phonenumber, PhoneNumberUtil phonenumberutil)
	{
		Phonemetadata.PhoneMetadata phonemetadata;
		if(phonenumber.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #212 <Method Phonenumber$PhoneNumber$CountryCodeSource Phonenumber$PhoneNumber.getCountryCodeSource()>
	//*   2    4:getstatic       #218 <Field Phonenumber$PhoneNumber$CountryCodeSource Phonenumber$PhoneNumber$CountryCodeSource.FROM_DEFAULT_COUNTRY>
	//*   3    7:if_acmpeq       12
	//*   4   10:iconst_1        
	//*   5   11:ireturn         
	//*   6   12:aload_1         
	//*   7   13:aload_1         
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #222 <Method int Phonenumber$PhoneNumber.getCountryCode()>
	//*  10   18:invokevirtual   #241 <Method String PhoneNumberUtil.getRegionCodeForCountryCode(int)>
	//*  11   21:invokevirtual   #460 <Method Phonemetadata$PhoneMetadata PhoneNumberUtil.getMetadataForRegion(String)>
	//*  12   24:astore_2        
			if((phonemetadata = phonenumberutil.getMetadataForRegion(phonenumberutil.getRegionCodeForCountryCode(phonenumber.getCountryCode()))) != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          10
			{
				Object obj = ((Object) (phonenumberutil.getNationalSignificantNumber(phonenumber)));
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #193 <Method String PhoneNumberUtil.getNationalSignificantNumber(Phonenumber$PhoneNumber)>
	//   18   34:astore_3        
				obj = ((Object) (phonenumberutil.chooseFormattingPatternForNumber(phonemetadata.numberFormats(), ((String) (obj)))));
	//   19   35:aload_1         
	//   20   36:aload_2         
	//   21   37:invokevirtual   #293 <Method List Phonemetadata$PhoneMetadata.numberFormats()>
	//   22   40:aload_3         
	//   23   41:invokevirtual   #464 <Method Phonemetadata$NumberFormat PhoneNumberUtil.chooseFormattingPatternForNumber(List, String)>
	//   24   44:astore_3        
				if(obj != null && ((Phonemetadata.NumberFormat) (obj)).getNationalPrefixFormattingRule().length() > 0 && !((Phonemetadata.NumberFormat) (obj)).isNationalPrefixOptionalWhenFormatting() && !PhoneNumberUtil.formattingRuleHasFirstGroupOnly(((Phonemetadata.NumberFormat) (obj)).getNationalPrefixFormattingRule()))
	//*  25   45:aload_3         
	//*  26   46:ifnull          10
	//*  27   49:aload_3         
	//*  28   50:invokevirtual   #467 <Method String Phonemetadata$NumberFormat.getNationalPrefixFormattingRule()>
	//*  29   53:invokevirtual   #234 <Method int String.length()>
	//*  30   56:ifle            10
	//*  31   59:aload_3         
	//*  32   60:invokevirtual   #470 <Method boolean Phonemetadata$NumberFormat.isNationalPrefixOptionalWhenFormatting()>
	//*  33   63:ifne            10
	//*  34   66:aload_3         
	//*  35   67:invokevirtual   #467 <Method String Phonemetadata$NumberFormat.getNationalPrefixFormattingRule()>
	//*  36   70:invokestatic    #473 <Method boolean PhoneNumberUtil.formattingRuleHasFirstGroupOnly(String)>
	//*  37   73:ifne            10
					return phonenumberutil.maybeStripNationalPrefixAndCarrierCode(new StringBuilder(PhoneNumberUtil.normalizeDigitsOnly(phonenumber.getRawInput())), phonemetadata, ((StringBuilder) (null)));
	//   38   76:aload_1         
	//   39   77:new             #79  <Class StringBuilder>
	//   40   80:dup             
	//   41   81:aload_0         
	//   42   82:invokevirtual   #476 <Method String Phonenumber$PhoneNumber.getRawInput()>
	//   43   85:invokestatic    #328 <Method String PhoneNumberUtil.normalizeDigitsOnly(String)>
	//   44   88:invokespecial   #479 <Method void StringBuilder(String)>
	//   45   91:aload_2         
	//   46   92:aconst_null     
	//   47   93:invokevirtual   #483 <Method boolean PhoneNumberUtil.maybeStripNationalPrefixAndCarrierCode(StringBuilder, Phonemetadata$PhoneMetadata, StringBuilder)>
	//   48   96:ireturn         
			}
		return true;
	}

	private static String limit(int i, int j)
	{
		if(i < 0 || j <= 0 || j < i)
	//*   0    0:iload_0         
	//*   1    1:iflt            13
	//*   2    4:iload_1         
	//*   3    5:ifle            13
	//*   4    8:iload_1         
	//*   5    9:iload_0         
	//*   6   10:icmpge          21
			throw new IllegalArgumentException();
	//    7   13:new             #161 <Class IllegalArgumentException>
	//    8   16:dup             
	//    9   17:invokespecial   #162 <Method void IllegalArgumentException()>
	//   10   20:athrow          
		else
			return (new StringBuilder()).append("{").append(i).append(",").append(j).append("}").toString();
	//   11   21:new             #79  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #82  <Method void StringBuilder()>
	//   14   28:ldc2            #485 <String "{">
	//   15   31:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:iload_0         
	//   17   35:invokevirtual   #488 <Method StringBuilder StringBuilder.append(int)>
	//   18   38:ldc2            #490 <String ",">
	//   19   41:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   20   44:iload_1         
	//   21   45:invokevirtual   #488 <Method StringBuilder StringBuilder.append(int)>
	//   22   48:ldc2            #492 <String "}">
	//   23   51:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   24   54:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   25   57:areturn         
	}

	private PhoneNumberMatch parseAndVerify(String s, int i)
	{
		if(!MATCHING_BRACKETS.matcher(((CharSequence) (s))).matches())
			break MISSING_BLOCK_LABEL_259;
	//    0    0:getstatic       #118 <Field Pattern MATCHING_BRACKETS>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #350 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:invokevirtual   #497 <Method boolean Matcher.matches()>
	//    4   10:ifeq            259
		if(PUB_PAGES.matcher(((CharSequence) (s))).find())
	//*   5   13:getstatic       #51  <Field Pattern PUB_PAGES>
	//*   6   16:aload_1         
	//*   7   17:invokevirtual   #350 <Method Matcher Pattern.matcher(CharSequence)>
	//*   8   20:invokevirtual   #355 <Method boolean Matcher.find()>
	//*   9   23:ifeq            28
			return null;
	//   10   26:aconst_null     
	//   11   27:areturn         
		if(leniency.compareTo(((Enum) (PhoneNumberUtil.Leniency.VALID))) < 0)
			break MISSING_BLOCK_LABEL_133;
	//   12   28:aload_0         
	//   13   29:getfield        #170 <Field PhoneNumberUtil$Leniency leniency>
	//   14   32:getstatic       #502 <Field PhoneNumberUtil$Leniency PhoneNumberUtil$Leniency.VALID>
	//   15   35:invokevirtual   #506 <Method int PhoneNumberUtil$Leniency.compareTo(Enum)>
	//   16   38:iflt            133
		if(i <= 0)
			break MISSING_BLOCK_LABEL_85;
	//   17   41:iload_2         
	//   18   42:ifle            85
		if(!LEAD_CLASS.matcher(((CharSequence) (s))).lookingAt())
	//*  19   45:getstatic       #128 <Field Pattern LEAD_CLASS>
	//*  20   48:aload_1         
	//*  21   49:invokevirtual   #350 <Method Matcher Pattern.matcher(CharSequence)>
	//*  22   52:invokevirtual   #382 <Method boolean Matcher.lookingAt()>
	//*  23   55:ifne            85
		{
			char c = text.charAt(i - 1);
	//   24   58:aload_0         
	//   25   59:getfield        #166 <Field CharSequence text>
	//   26   62:iload_2         
	//   27   63:iconst_1        
	//   28   64:isub            
	//   29   65:invokeinterface #507 <Method char CharSequence.charAt(int)>
	//   30   70:istore_3        
			if(isInvalidPunctuationSymbol(c) || isLatinLetter(c))
				break MISSING_BLOCK_LABEL_259;
	//   31   71:iload_3         
	//   32   72:invokestatic    #509 <Method boolean isInvalidPunctuationSymbol(char)>
	//   33   75:ifne            259
	//   34   78:iload_3         
	//   35   79:invokestatic    #511 <Method boolean isLatinLetter(char)>
	//   36   82:ifne            259
		}
		int j = i + s.length();
	//   37   85:iload_2         
	//   38   86:aload_1         
	//   39   87:invokevirtual   #234 <Method int String.length()>
	//   40   90:iadd            
	//   41   91:istore          4
		if(j < text.length())
	//*  42   93:iload           4
	//*  43   95:aload_0         
	//*  44   96:getfield        #166 <Field CharSequence text>
	//*  45   99:invokeinterface #379 <Method int CharSequence.length()>
	//*  46  104:icmpge          133
		{
			char c1 = text.charAt(j);
	//   47  107:aload_0         
	//   48  108:getfield        #166 <Field CharSequence text>
	//   49  111:iload           4
	//   50  113:invokeinterface #507 <Method char CharSequence.charAt(int)>
	//   51  118:istore_3        
			if(isInvalidPunctuationSymbol(c1) || isLatinLetter(c1))
				break MISSING_BLOCK_LABEL_259;
	//   52  119:iload_3         
	//   53  120:invokestatic    #509 <Method boolean isInvalidPunctuationSymbol(char)>
	//   54  123:ifne            259
	//   55  126:iload_3         
	//   56  127:invokestatic    #511 <Method boolean isLatinLetter(char)>
	//   57  130:ifne            259
		}
		Phonenumber.PhoneNumber phonenumber;
		phonenumber = phoneUtil.parseAndKeepRawInput(s, preferredRegion);
	//   58  133:aload_0         
	//   59  134:getfield        #164 <Field PhoneNumberUtil phoneUtil>
	//   60  137:aload_1         
	//   61  138:aload_0         
	//   62  139:getfield        #168 <Field String preferredRegion>
	//   63  142:invokevirtual   #515 <Method Phonenumber$PhoneNumber PhoneNumberUtil.parseAndKeepRawInput(String, String)>
	//   64  145:astore          5
		if(!phoneUtil.getRegionCodeForCountryCode(phonenumber.getCountryCode()).equals("IL") || phoneUtil.getNationalSignificantNumber(phonenumber).length() != 4)
			break MISSING_BLOCK_LABEL_209;
	//   65  147:aload_0         
	//   66  148:getfield        #164 <Field PhoneNumberUtil phoneUtil>
	//   67  151:aload           5
	//   68  153:invokevirtual   #222 <Method int Phonenumber$PhoneNumber.getCountryCode()>
	//   69  156:invokevirtual   #241 <Method String PhoneNumberUtil.getRegionCodeForCountryCode(int)>
	//   70  159:ldc2            #517 <String "IL">
	//   71  162:invokevirtual   #203 <Method boolean String.equals(Object)>
	//   72  165:ifeq            209
	//   73  168:aload_0         
	//   74  169:getfield        #164 <Field PhoneNumberUtil phoneUtil>
	//   75  172:aload           5
	//   76  174:invokevirtual   #193 <Method String PhoneNumberUtil.getNationalSignificantNumber(Phonenumber$PhoneNumber)>
	//   77  177:invokevirtual   #234 <Method int String.length()>
	//   78  180:iconst_4        
	//   79  181:icmpne          209
		if(i == 0)
			break MISSING_BLOCK_LABEL_259;
	//   80  184:iload_2         
	//   81  185:ifeq            259
		if(i <= 0)
			break MISSING_BLOCK_LABEL_209;
	//   82  188:iload_2         
	//   83  189:ifle            209
		if(text.charAt(i - 1) != '*')
			break MISSING_BLOCK_LABEL_259;
	//   84  192:aload_0         
	//   85  193:getfield        #166 <Field CharSequence text>
	//   86  196:iload_2         
	//   87  197:iconst_1        
	//   88  198:isub            
	//   89  199:invokeinterface #507 <Method char CharSequence.charAt(int)>
	//   90  204:bipush          42
	//   91  206:icmpne          259
		if(!leniency.verify(phonenumber, s, phoneUtil))
			break MISSING_BLOCK_LABEL_259;
	//   92  209:aload_0         
	//   93  210:getfield        #170 <Field PhoneNumberUtil$Leniency leniency>
	//   94  213:aload           5
	//   95  215:aload_1         
	//   96  216:aload_0         
	//   97  217:getfield        #164 <Field PhoneNumberUtil phoneUtil>
	//   98  220:invokevirtual   #520 <Method boolean PhoneNumberUtil$Leniency.verify(Phonenumber$PhoneNumber, String, PhoneNumberUtil)>
	//   99  223:ifeq            259
		phonenumber.clearCountryCodeSource();
	//  100  226:aload           5
	//  101  228:invokevirtual   #524 <Method Phonenumber$PhoneNumber Phonenumber$PhoneNumber.clearCountryCodeSource()>
	//  102  231:pop             
		phonenumber.clearRawInput();
	//  103  232:aload           5
	//  104  234:invokevirtual   #527 <Method Phonenumber$PhoneNumber Phonenumber$PhoneNumber.clearRawInput()>
	//  105  237:pop             
		phonenumber.clearPreferredDomesticCarrierCode();
	//  106  238:aload           5
	//  107  240:invokevirtual   #530 <Method Phonenumber$PhoneNumber Phonenumber$PhoneNumber.clearPreferredDomesticCarrierCode()>
	//  108  243:pop             
		s = ((String) (new PhoneNumberMatch(i, s, phonenumber)));
	//  109  244:new             #532 <Class PhoneNumberMatch>
	//  110  247:dup             
	//  111  248:iload_2         
	//  112  249:aload_1         
	//  113  250:aload           5
	//  114  252:invokespecial   #535 <Method void PhoneNumberMatch(int, String, Phonenumber$PhoneNumber)>
	//  115  255:astore_1        
		return ((PhoneNumberMatch) (s));
	//  116  256:aload_1         
	//  117  257:areturn         
		s;
	//  118  258:astore_1        
		return null;
	//  119  259:aconst_null     
	//  120  260:areturn         
	}

	private static CharSequence trimAfterFirstMatch(Pattern pattern, CharSequence charsequence)
	{
		Matcher matcher = pattern.matcher(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #350 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    5:astore_2        
		pattern = ((Pattern) (charsequence));
	//    4    6:aload_1         
	//    5    7:astore_0        
		if(matcher.find())
	//*   6    8:aload_2         
	//*   7    9:invokevirtual   #355 <Method boolean Matcher.find()>
	//*   8   12:ifeq            27
			pattern = ((Pattern) (charsequence.subSequence(0, matcher.start())));
	//    9   15:aload_1         
	//   10   16:iconst_0        
	//   11   17:aload_2         
	//   12   18:invokevirtual   #361 <Method int Matcher.start()>
	//   13   21:invokeinterface #395 <Method CharSequence CharSequence.subSequence(int, int)>
	//   14   26:astore_0        
		return ((CharSequence) (pattern));
	//   15   27:aload_0         
	//   16   28:areturn         
	}

	public boolean hasNext()
	{
		if(state == State.NOT_READY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field PhoneNumberMatcher$State state>
	//*   2    4:getstatic       #150 <Field PhoneNumberMatcher$State PhoneNumberMatcher$State.NOT_READY>
	//*   3    7:if_acmpne       36
		{
			lastMatch = find(searchIndex);
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #156 <Field int searchIndex>
	//    8   16:invokespecial   #537 <Method PhoneNumberMatch find(int)>
	//    9   19:putfield        #154 <Field PhoneNumberMatch lastMatch>
			if(lastMatch == null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #154 <Field PhoneNumberMatch lastMatch>
	//*  12   26:ifnonnull       48
			{
				state = State.DONE;
	//   13   29:aload_0         
	//   14   30:getstatic       #540 <Field PhoneNumberMatcher$State PhoneNumberMatcher$State.DONE>
	//   15   33:putfield        #152 <Field PhoneNumberMatcher$State state>
			} else
	//*  16   36:aload_0         
	//*  17   37:getfield        #152 <Field PhoneNumberMatcher$State state>
	//*  18   40:getstatic       #543 <Field PhoneNumberMatcher$State PhoneNumberMatcher$State.READY>
	//*  19   43:if_acmpne       69
	//*  20   46:iconst_1        
	//*  21   47:ireturn         
			{
				searchIndex = lastMatch.end();
	//   22   48:aload_0         
	//   23   49:aload_0         
	//   24   50:getfield        #154 <Field PhoneNumberMatch lastMatch>
	//   25   53:invokevirtual   #544 <Method int PhoneNumberMatch.end()>
	//   26   56:putfield        #156 <Field int searchIndex>
				state = State.READY;
	//   27   59:aload_0         
	//   28   60:getstatic       #543 <Field PhoneNumberMatcher$State PhoneNumberMatcher$State.READY>
	//   29   63:putfield        #152 <Field PhoneNumberMatcher$State state>
			}
		}
		return state == State.READY;
	//   30   66:goto            36
	//   31   69:iconst_0        
	//   32   70:ireturn         
	}

	public PhoneNumberMatch next()
	{
		if(!hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #546 <Method boolean hasNext()>
	//*   2    4:ifne            15
		{
			throw new NoSuchElementException();
	//    3    7:new             #548 <Class NoSuchElementException>
	//    4   10:dup             
	//    5   11:invokespecial   #549 <Method void NoSuchElementException()>
	//    6   14:athrow          
		} else
		{
			PhoneNumberMatch phonenumbermatch = lastMatch;
	//    7   15:aload_0         
	//    8   16:getfield        #154 <Field PhoneNumberMatch lastMatch>
	//    9   19:astore_1        
			lastMatch = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #154 <Field PhoneNumberMatch lastMatch>
			state = State.NOT_READY;
	//   13   25:aload_0         
	//   14   26:getstatic       #150 <Field PhoneNumberMatcher$State PhoneNumberMatcher$State.NOT_READY>
	//   15   29:putfield        #152 <Field PhoneNumberMatcher$State state>
			return phonenumbermatch;
	//   16   32:aload_1         
	//   17   33:areturn         
		}
	}

	public volatile Object next()
	{
		return ((Object) (next()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #551 <Method PhoneNumberMatch next()>
	//    2    4:areturn         
	}

	public void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #554 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #555 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private static final Pattern INNER_MATCHES[] = {
		Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[\u2012-\u2015\uFF0D]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")
	};
	private static final Pattern LEAD_CLASS;
	private static final Pattern MATCHING_BRACKETS;
	private static final Pattern PATTERN;
	private static final Pattern PUB_PAGES = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
	private static final Pattern SLASH_SEPARATED_DATES = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
	private static final Pattern TIME_STAMPS = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");
	private static final Pattern TIME_STAMPS_SUFFIX = Pattern.compile(":[0-5]\\d");
	private PhoneNumberMatch lastMatch;
	private final PhoneNumberUtil.Leniency leniency;
	private long maxTries;
	private final PhoneNumberUtil phoneUtil;
	private final String preferredRegion;
	private int searchIndex;
	private State state;
	private final CharSequence text;

	static 
	{
	//    0    0:ldc1            #43  <String "\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}">
	//    1    2:invokestatic    #49  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #51  <Field Pattern PUB_PAGES>
	//    3    8:ldc1            #53  <String "(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}">
	//    4   10:invokestatic    #49  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #55  <Field Pattern SLASH_SEPARATED_DATES>
	//    6   16:ldc1            #57  <String "[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$">
	//    7   18:invokestatic    #49  <Method Pattern Pattern.compile(String)>
	//    8   21:putstatic       #59  <Field Pattern TIME_STAMPS>
	//    9   24:ldc1            #61  <String ":[0-5]\\d">
	//   10   26:invokestatic    #49  <Method Pattern Pattern.compile(String)>
	//   11   29:putstatic       #63  <Field Pattern TIME_STAMPS_SUFFIX>
	//   12   32:bipush          6
	//   13   34:anewarray       Pattern[]
	//   14   37:dup             
	//   15   38:iconst_0        
	//   16   39:ldc1            #65  <String "/+(.*)">
	//   17   41:invokestatic    #49  <Method Pattern Pattern.compile(String)>
	//   18   44:aastore         
	//   19   45:dup             
	//   20   46:iconst_1        
	//   21   47:ldc1            #67  <String "(\\([^(]*)">
	//   22   49:invokestatic    #49  <Method Pattern Pattern.compile(String)>
	//   23   52:aastore         
	//   24   53:dup             
	//   25   54:iconst_2        
	//   26   55:ldc1            #69  <String "(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)">
	//   27   57:invokestatic    #49  <Method Pattern Pattern.compile(String)>
	//   28   60:aastore         
	//   29   61:dup             
	//   30   62:iconst_3        
	//   31   63:ldc1            #71  <String "[\u2012-\u2015\uFF0D]\\p{Z}*(.+)">
	//   32   65:invokestatic    #49  <Method Pattern Pattern.compile(String)>
	//   33   68:aastore         
	//   34   69:dup             
	//   35   70:iconst_4        
	//   36   71:ldc1            #73  <String "\\.+\\p{Z}*([^.]+)">
	//   37   73:invokestatic    #49  <Method Pattern Pattern.compile(String)>
	//   38   76:aastore         
	//   39   77:dup             
	//   40   78:iconst_5        
	//   41   79:ldc1            #75  <String "\\p{Z}+(\\P{Z}+)">
	//   42   81:invokestatic    #49  <Method Pattern Pattern.compile(String)>
	//   43   84:aastore         
	//   44   85:putstatic       #77  <Field Pattern[] INNER_MATCHES>
		String s = (new StringBuilder()).append("[^").append("(\\[\uFF08\uFF3B").append(")\\]\uFF09\uFF3D").append("]").toString();
	//   45   88:new             #79  <Class StringBuilder>
	//   46   91:dup             
	//   47   92:invokespecial   #82  <Method void StringBuilder()>
	//   48   95:ldc1            #84  <String "[^">
	//   49   97:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   50  100:ldc1            #90  <String "(\\[\uFF08\uFF3B">
	//   51  102:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   52  105:ldc1            #92  <String ")\\]\uFF09\uFF3D">
	//   53  107:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   54  110:ldc1            #94  <String "]">
	//   55  112:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   56  115:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   57  118:astore_0        
		String s1 = limit(0, 3);
	//   58  119:iconst_0        
	//   59  120:iconst_3        
	//   60  121:invokestatic    #102 <Method String limit(int, int)>
	//   61  124:astore_1        
		MATCHING_BRACKETS = Pattern.compile((new StringBuilder()).append("(?:[").append("(\\[\uFF08\uFF3B").append("])?(?:").append(s).append("+[").append(")\\]\uFF09\uFF3D").append("])?").append(s).append("+(?:[").append("(\\[\uFF08\uFF3B").append("]").append(s).append("+[").append(")\\]\uFF09\uFF3D").append("])").append(s1).append(s).append("*").toString());
	//   62  125:new             #79  <Class StringBuilder>
	//   63  128:dup             
	//   64  129:invokespecial   #82  <Method void StringBuilder()>
	//   65  132:ldc1            #104 <String "(?:[">
	//   66  134:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   67  137:ldc1            #90  <String "(\\[\uFF08\uFF3B">
	//   68  139:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   69  142:ldc1            #106 <String "])?(?:">
	//   70  144:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   71  147:aload_0         
	//   72  148:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   73  151:ldc1            #108 <String "+[">
	//   74  153:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   75  156:ldc1            #92  <String ")\\]\uFF09\uFF3D">
	//   76  158:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   77  161:ldc1            #110 <String "])?">
	//   78  163:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   79  166:aload_0         
	//   80  167:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   81  170:ldc1            #112 <String "+(?:[">
	//   82  172:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   83  175:ldc1            #90  <String "(\\[\uFF08\uFF3B">
	//   84  177:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   85  180:ldc1            #94  <String "]">
	//   86  182:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   87  185:aload_0         
	//   88  186:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   89  189:ldc1            #108 <String "+[">
	//   90  191:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   91  194:ldc1            #92  <String ")\\]\uFF09\uFF3D">
	//   92  196:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   93  199:ldc1            #114 <String "])">
	//   94  201:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   95  204:aload_1         
	//   96  205:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   97  208:aload_0         
	//   98  209:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   99  212:ldc1            #116 <String "*">
	//  100  214:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  101  217:invokevirtual   #98  <Method String StringBuilder.toString()>
	//  102  220:invokestatic    #49  <Method Pattern Pattern.compile(String)>
	//  103  223:putstatic       #118 <Field Pattern MATCHING_BRACKETS>
		s = limit(0, 2);
	//  104  226:iconst_0        
	//  105  227:iconst_2        
	//  106  228:invokestatic    #102 <Method String limit(int, int)>
	//  107  231:astore_0        
		String s2 = limit(0, 4);
	//  108  232:iconst_0        
	//  109  233:iconst_4        
	//  110  234:invokestatic    #102 <Method String limit(int, int)>
	//  111  237:astore_2        
		s1 = limit(0, 20);
	//  112  238:iconst_0        
	//  113  239:bipush          20
	//  114  241:invokestatic    #102 <Method String limit(int, int)>
	//  115  244:astore_1        
		s2 = (new StringBuilder()).append("[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]").append(s2).toString();
	//  116  245:new             #79  <Class StringBuilder>
	//  117  248:dup             
	//  118  249:invokespecial   #82  <Method void StringBuilder()>
	//  119  252:ldc1            #120 <String "[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]">
	//  120  254:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  121  257:aload_2         
	//  122  258:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  123  261:invokevirtual   #98  <Method String StringBuilder.toString()>
	//  124  264:astore_2        
		String s3 = (new StringBuilder()).append("\\p{Nd}").append(limit(1, 20)).toString();
	//  125  265:new             #79  <Class StringBuilder>
	//  126  268:dup             
	//  127  269:invokespecial   #82  <Method void StringBuilder()>
	//  128  272:ldc1            #122 <String "\\p{Nd}">
	//  129  274:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  130  277:iconst_1        
	//  131  278:bipush          20
	//  132  280:invokestatic    #102 <Method String limit(int, int)>
	//  133  283:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  134  286:invokevirtual   #98  <Method String StringBuilder.toString()>
	//  135  289:astore_3        
		String s4 = (new StringBuilder()).append("(\\[\uFF08\uFF3B").append("+\uFF0B").toString();
	//  136  290:new             #79  <Class StringBuilder>
	//  137  293:dup             
	//  138  294:invokespecial   #82  <Method void StringBuilder()>
	//  139  297:ldc1            #90  <String "(\\[\uFF08\uFF3B">
	//  140  299:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  141  302:ldc1            #124 <String "+\uFF0B">
	//  142  304:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  143  307:invokevirtual   #98  <Method String StringBuilder.toString()>
	//  144  310:astore          4
		s4 = (new StringBuilder()).append("[").append(s4).append("]").toString();
	//  145  312:new             #79  <Class StringBuilder>
	//  146  315:dup             
	//  147  316:invokespecial   #82  <Method void StringBuilder()>
	//  148  319:ldc1            #126 <String "[">
	//  149  321:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  150  324:aload           4
	//  151  326:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  152  329:ldc1            #94  <String "]">
	//  153  331:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  154  334:invokevirtual   #98  <Method String StringBuilder.toString()>
	//  155  337:astore          4
		LEAD_CLASS = Pattern.compile(s4);
	//  156  339:aload           4
	//  157  341:invokestatic    #49  <Method Pattern Pattern.compile(String)>
	//  158  344:putstatic       #128 <Field Pattern LEAD_CLASS>
		PATTERN = Pattern.compile((new StringBuilder()).append("(?:").append(s4).append(s2).append(")").append(s).append(s3).append("(?:").append(s2).append(s3).append(")").append(s1).append("(?:").append(PhoneNumberUtil.EXTN_PATTERNS_FOR_MATCHING).append(")?").toString(), 66);
	//  159  347:new             #79  <Class StringBuilder>
	//  160  350:dup             
	//  161  351:invokespecial   #82  <Method void StringBuilder()>
	//  162  354:ldc1            #130 <String "(?:">
	//  163  356:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  164  359:aload           4
	//  165  361:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  166  364:aload_2         
	//  167  365:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  168  368:ldc1            #132 <String ")">
	//  169  370:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  170  373:aload_0         
	//  171  374:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  172  377:aload_3         
	//  173  378:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  174  381:ldc1            #130 <String "(?:">
	//  175  383:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  176  386:aload_2         
	//  177  387:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  178  390:aload_3         
	//  179  391:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  180  394:ldc1            #132 <String ")">
	//  181  396:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  182  399:aload_1         
	//  183  400:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  184  403:ldc1            #130 <String "(?:">
	//  185  405:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  186  408:getstatic       #137 <Field String PhoneNumberUtil.EXTN_PATTERNS_FOR_MATCHING>
	//  187  411:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  188  414:ldc1            #139 <String ")?">
	//  189  416:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  190  419:invokevirtual   #98  <Method String StringBuilder.toString()>
	//  191  422:bipush          66
	//  192  424:invokestatic    #142 <Method Pattern Pattern.compile(String, int)>
	//  193  427:putstatic       #144 <Field Pattern PATTERN>
	//* 194  430:return          
	}
}
