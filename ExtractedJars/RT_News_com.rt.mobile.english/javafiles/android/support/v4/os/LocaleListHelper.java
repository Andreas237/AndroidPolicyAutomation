// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import java.util.*;

// Referenced classes of package android.support.v4.os:
//			LocaleHelper

final class LocaleListHelper
{

	LocaleListHelper(Locale locale, LocaleListHelper localelisthelper)
	{
		int i;
		int k;
		boolean flag;
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
			if(locale == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
				throw new NullPointerException("topLocale is null");
	//    4    8:new             #83  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:ldc1            #85  <String "topLocale is null">
	//    7   14:invokespecial   #88  <Method void NullPointerException(String)>
	//    8   17:athrow          
			flag = false;
	//    9   18:iconst_0        
	//   10   19:istore          6
			if(localelisthelper == null)
	//*  11   21:aload_2         
	//*  12   22:ifnonnull       31
				k = 0;
	//   13   25:iconst_0        
	//   14   26:istore          4
			else
	//*  15   28:goto            38
				k = localelisthelper.mList.length;
	//   16   31:aload_2         
	//   17   32:getfield        #90  <Field Locale[] mList>
	//   18   35:arraylength     
	//   19   36:istore          4
			for(i = 0; i < k; i++)
	//*  20   38:iconst_0        
	//*  21   39:istore_3        
	//*  22   40:iload_3         
	//*  23   41:iload           4
	//*  24   43:icmpge          69
				if(locale.equals(((Object) (localelisthelper.mList[i]))))
	//*  25   46:aload_1         
	//*  26   47:aload_2         
	//*  27   48:getfield        #90  <Field Locale[] mList>
	//*  28   51:iload_3         
	//*  29   52:aaload          
	//*  30   53:invokevirtual   #94  <Method boolean Locale.equals(Object)>
	//*  31   56:ifeq            62
					break label0;
	//   32   59:goto            71

	//   33   62:iload_3         
	//   34   63:iconst_1        
	//   35   64:iadd            
	//   36   65:istore_3        
	//*  37   66:goto            40
			i = -1;
	//   38   69:iconst_m1       
	//   39   70:istore_3        
		}
		int l;
		if(i == -1)
	//*  40   71:iload_3         
	//*  41   72:iconst_m1       
	//*  42   73:icmpne          82
			l = 1;
	//   43   76:iconst_1        
	//   44   77:istore          5
		else
	//*  45   79:goto            85
			l = 0;
	//   46   82:iconst_0        
	//   47   83:istore          5
		int l1 = l + k;
	//   48   85:iload           5
	//   49   87:iload           4
	//   50   89:iadd            
	//   51   90:istore          8
		Locale alocale[] = new Locale[l1];
	//   52   92:iload           8
	//   53   94:anewarray       Locale[]
	//   54   97:astore          9
		alocale[0] = (Locale)locale.clone();
	//   55   99:aload           9
	//   56  101:iconst_0        
	//   57  102:aload_1         
	//   58  103:invokevirtual   #98  <Method Object Locale.clone()>
	//   59  106:checkcast       #42  <Class Locale>
	//   60  109:aastore         
		if(i == -1)
	//*  61  110:iload_3         
	//*  62  111:iconst_m1       
	//*  63  112:icmpne          151
		{
			int i1;
			for(i = 0; i < k; i = i1)
	//*  64  115:iconst_0        
	//*  65  116:istore_3        
	//*  66  117:iload_3         
	//*  67  118:iload           4
	//*  68  120:icmpge          224
			{
				i1 = i + 1;
	//   69  123:iload_3         
	//   70  124:iconst_1        
	//   71  125:iadd            
	//   72  126:istore          5
				alocale[i1] = (Locale)localelisthelper.mList[i].clone();
	//   73  128:aload           9
	//   74  130:iload           5
	//   75  132:aload_2         
	//   76  133:getfield        #90  <Field Locale[] mList>
	//   77  136:iload_3         
	//   78  137:aaload          
	//   79  138:invokevirtual   #98  <Method Object Locale.clone()>
	//   80  141:checkcast       #42  <Class Locale>
	//   81  144:aastore         
			}

	//   82  145:iload           5
	//   83  147:istore_3        
		} else
	//*  84  148:goto            117
		{
			int k1;
			for(int j1 = 0; j1 < i; j1 = k1)
	//*  85  151:iconst_0        
	//*  86  152:istore          5
	//*  87  154:iload           5
	//*  88  156:iload_3         
	//*  89  157:icmpge          191
			{
				k1 = j1 + 1;
	//   90  160:iload           5
	//   91  162:iconst_1        
	//   92  163:iadd            
	//   93  164:istore          7
				alocale[k1] = (Locale)localelisthelper.mList[j1].clone();
	//   94  166:aload           9
	//   95  168:iload           7
	//   96  170:aload_2         
	//   97  171:getfield        #90  <Field Locale[] mList>
	//   98  174:iload           5
	//   99  176:aaload          
	//  100  177:invokevirtual   #98  <Method Object Locale.clone()>
	//  101  180:checkcast       #42  <Class Locale>
	//  102  183:aastore         
			}

	//  103  184:iload           7
	//  104  186:istore          5
	//* 105  188:goto            154
			for(i++; i < k; i++)
	//* 106  191:iload_3         
	//* 107  192:iconst_1        
	//* 108  193:iadd            
	//* 109  194:istore_3        
	//* 110  195:iload_3         
	//* 111  196:iload           4
	//* 112  198:icmpge          224
				alocale[i] = (Locale)localelisthelper.mList[i].clone();
	//  113  201:aload           9
	//  114  203:iload_3         
	//  115  204:aload_2         
	//  116  205:getfield        #90  <Field Locale[] mList>
	//  117  208:iload_3         
	//  118  209:aaload          
	//  119  210:invokevirtual   #98  <Method Object Locale.clone()>
	//  120  213:checkcast       #42  <Class Locale>
	//  121  216:aastore         

	//  122  217:iload_3         
	//  123  218:iconst_1        
	//  124  219:iadd            
	//  125  220:istore_3        
		}
	//* 126  221:goto            195
		locale = ((Locale) (new StringBuilder()));
	//  127  224:new             #100 <Class StringBuilder>
	//  128  227:dup             
	//  129  228:invokespecial   #101 <Method void StringBuilder()>
	//  130  231:astore_1        
		for(int j = ((int) (flag)); j < l1; j++)
	//* 131  232:iload           6
	//* 132  234:istore_3        
	//* 133  235:iload_3         
	//* 134  236:iload           8
	//* 135  238:icmpge          275
		{
			((StringBuilder) (locale)).append(LocaleHelper.toLanguageTag(alocale[j]));
	//  136  241:aload_1         
	//  137  242:aload           9
	//  138  244:iload_3         
	//  139  245:aaload          
	//  140  246:invokestatic    #105 <Method String LocaleHelper.toLanguageTag(Locale)>
	//  141  249:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//  142  252:pop             
			if(j < l1 - 1)
	//* 143  253:iload_3         
	//* 144  254:iload           8
	//* 145  256:iconst_1        
	//* 146  257:isub            
	//* 147  258:icmpge          268
				((StringBuilder) (locale)).append(',');
	//  148  261:aload_1         
	//  149  262:bipush          44
	//  150  264:invokevirtual   #112 <Method StringBuilder StringBuilder.append(char)>
	//  151  267:pop             
		}

	//  152  268:iload_3         
	//  153  269:iconst_1        
	//  154  270:iadd            
	//  155  271:istore_3        
	//* 156  272:goto            235
		mList = alocale;
	//  157  275:aload_0         
	//  158  276:aload           9
	//  159  278:putfield        #90  <Field Locale[] mList>
		mStringRepresentation = ((StringBuilder) (locale)).toString();
	//  160  281:aload_0         
	//  161  282:aload_1         
	//  162  283:invokevirtual   #116 <Method String StringBuilder.toString()>
	//  163  286:putfield        #118 <Field String mStringRepresentation>
	//  164  289:return          
	}

	transient LocaleListHelper(Locale alocale[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
		if(alocale.length == 0)
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifne            23
		{
			mList = sEmptyList;
	//    5    9:aload_0         
	//    6   10:getstatic       #44  <Field Locale[] sEmptyList>
	//    7   13:putfield        #90  <Field Locale[] mList>
			mStringRepresentation = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #122 <String "">
	//   10   19:putfield        #118 <Field String mStringRepresentation>
			return;
	//   11   22:return          
		}
		Locale alocale1[] = new Locale[alocale.length];
	//   12   23:aload_1         
	//   13   24:arraylength     
	//   14   25:anewarray       Locale[]
	//   15   28:astore_3        
		HashSet hashset = new HashSet();
	//   16   29:new             #124 <Class HashSet>
	//   17   32:dup             
	//   18   33:invokespecial   #125 <Method void HashSet()>
	//   19   36:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   20   38:new             #100 <Class StringBuilder>
	//   21   41:dup             
	//   22   42:invokespecial   #101 <Method void StringBuilder()>
	//   23   45:astore          5
		for(int i = 0; i < alocale.length; i++)
	//*  24   47:iconst_0        
	//*  25   48:istore_2        
	//*  26   49:iload_2         
	//*  27   50:aload_1         
	//*  28   51:arraylength     
	//*  29   52:icmpge          212
		{
			Locale locale = alocale[i];
	//   30   55:aload_1         
	//   31   56:iload_2         
	//   32   57:aaload          
	//   33   58:astore          6
			if(locale == null)
	//*  34   60:aload           6
	//*  35   62:ifnonnull       105
			{
				alocale = ((Locale []) (new StringBuilder()));
	//   36   65:new             #100 <Class StringBuilder>
	//   37   68:dup             
	//   38   69:invokespecial   #101 <Method void StringBuilder()>
	//   39   72:astore_1        
				((StringBuilder) (alocale)).append("list[");
	//   40   73:aload_1         
	//   41   74:ldc1            #127 <String "list[">
	//   42   76:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   43   79:pop             
				((StringBuilder) (alocale)).append(i);
	//   44   80:aload_1         
	//   45   81:iload_2         
	//   46   82:invokevirtual   #130 <Method StringBuilder StringBuilder.append(int)>
	//   47   85:pop             
				((StringBuilder) (alocale)).append("] is null");
	//   48   86:aload_1         
	//   49   87:ldc1            #132 <String "] is null">
	//   50   89:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   51   92:pop             
				throw new NullPointerException(((StringBuilder) (alocale)).toString());
	//   52   93:new             #83  <Class NullPointerException>
	//   53   96:dup             
	//   54   97:aload_1         
	//   55   98:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   56  101:invokespecial   #88  <Method void NullPointerException(String)>
	//   57  104:athrow          
			}
			if(hashset.contains(((Object) (locale))))
	//*  58  105:aload           4
	//*  59  107:aload           6
	//*  60  109:invokevirtual   #135 <Method boolean HashSet.contains(Object)>
	//*  61  112:ifeq            155
			{
				alocale = ((Locale []) (new StringBuilder()));
	//   62  115:new             #100 <Class StringBuilder>
	//   63  118:dup             
	//   64  119:invokespecial   #101 <Method void StringBuilder()>
	//   65  122:astore_1        
				((StringBuilder) (alocale)).append("list[");
	//   66  123:aload_1         
	//   67  124:ldc1            #127 <String "list[">
	//   68  126:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   69  129:pop             
				((StringBuilder) (alocale)).append(i);
	//   70  130:aload_1         
	//   71  131:iload_2         
	//   72  132:invokevirtual   #130 <Method StringBuilder StringBuilder.append(int)>
	//   73  135:pop             
				((StringBuilder) (alocale)).append("] is a repetition");
	//   74  136:aload_1         
	//   75  137:ldc1            #137 <String "] is a repetition">
	//   76  139:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   77  142:pop             
				throw new IllegalArgumentException(((StringBuilder) (alocale)).toString());
	//   78  143:new             #139 <Class IllegalArgumentException>
	//   79  146:dup             
	//   80  147:aload_1         
	//   81  148:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   82  151:invokespecial   #140 <Method void IllegalArgumentException(String)>
	//   83  154:athrow          
			}
			locale = (Locale)locale.clone();
	//   84  155:aload           6
	//   85  157:invokevirtual   #98  <Method Object Locale.clone()>
	//   86  160:checkcast       #42  <Class Locale>
	//   87  163:astore          6
			alocale1[i] = locale;
	//   88  165:aload_3         
	//   89  166:iload_2         
	//   90  167:aload           6
	//   91  169:aastore         
			stringbuilder.append(LocaleHelper.toLanguageTag(locale));
	//   92  170:aload           5
	//   93  172:aload           6
	//   94  174:invokestatic    #105 <Method String LocaleHelper.toLanguageTag(Locale)>
	//   95  177:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   96  180:pop             
			if(i < alocale.length - 1)
	//*  97  181:iload_2         
	//*  98  182:aload_1         
	//*  99  183:arraylength     
	//* 100  184:iconst_1        
	//* 101  185:isub            
	//* 102  186:icmpge          197
				stringbuilder.append(',');
	//  103  189:aload           5
	//  104  191:bipush          44
	//  105  193:invokevirtual   #112 <Method StringBuilder StringBuilder.append(char)>
	//  106  196:pop             
			hashset.add(((Object) (locale)));
	//  107  197:aload           4
	//  108  199:aload           6
	//  109  201:invokevirtual   #143 <Method boolean HashSet.add(Object)>
	//  110  204:pop             
		}

	//  111  205:iload_2         
	//  112  206:iconst_1        
	//  113  207:iadd            
	//  114  208:istore_2        
	//* 115  209:goto            49
		mList = alocale1;
	//  116  212:aload_0         
	//  117  213:aload_3         
	//  118  214:putfield        #90  <Field Locale[] mList>
		mStringRepresentation = stringbuilder.toString();
	//  119  217:aload_0         
	//  120  218:aload           5
	//  121  220:invokevirtual   #116 <Method String StringBuilder.toString()>
	//  122  223:putfield        #118 <Field String mStringRepresentation>
	//  123  226:return          
	}

	private Locale computeFirstMatch(Collection collection, boolean flag)
	{
		int i = computeFirstMatchIndex(collection, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #149 <Method int computeFirstMatchIndex(Collection, boolean)>
	//    4    6:istore_3        
		if(i == -1)
	//*   5    7:iload_3         
	//*   6    8:iconst_m1       
	//*   7    9:icmpne          14
			return null;
	//    8   12:aconst_null     
	//    9   13:areturn         
		else
			return mList[i];
	//   10   14:aload_0         
	//   11   15:getfield        #90  <Field Locale[] mList>
	//   12   18:iload_3         
	//   13   19:aaload          
	//   14   20:areturn         
	}

	private int computeFirstMatchIndex(Collection collection, boolean flag)
	{
		int i;
label0:
		{
			if(mList.length == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field Locale[] mList>
	//*   2    4:arraylength     
	//*   3    5:iconst_1        
	//*   4    6:icmpne          11
				return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
			if(mList.length == 0)
	//*   7   11:aload_0         
	//*   8   12:getfield        #90  <Field Locale[] mList>
	//*   9   15:arraylength     
	//*  10   16:ifne            21
				return -1;
	//   11   19:iconst_m1       
	//   12   20:ireturn         
			if(flag)
	//*  13   21:iload_2         
	//*  14   22:ifeq            48
			{
				i = findFirstMatchIndex(EN_LATN);
	//   15   25:aload_0         
	//   16   26:getstatic       #75  <Field Locale EN_LATN>
	//   17   29:invokespecial   #155 <Method int findFirstMatchIndex(Locale)>
	//   18   32:istore_3        
				if(i == 0)
	//*  19   33:iload_3         
	//*  20   34:ifne            39
					return 0;
	//   21   37:iconst_0        
	//   22   38:ireturn         
				if(i < 0x7fffffff)
	//*  23   39:iload_3         
	//*  24   40:ldc1            #156 <Int 0x7fffffff>
	//*  25   42:icmpge          48
					break label0;
	//   26   45:goto            51
			}
			i = 0x7fffffff;
	//   27   48:ldc1            #156 <Int 0x7fffffff>
	//   28   50:istore_3        
		}
		collection = ((Collection) (collection.iterator()));
	//   29   51:aload_1         
	//   30   52:invokeinterface #162 <Method Iterator Collection.iterator()>
	//   31   57:astore_1        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//   32   58:aload_1         
	//   33   59:invokeinterface #168 <Method boolean Iterator.hasNext()>
	//   34   64:ifeq            104
			int j = findFirstMatchIndex(LocaleHelper.forLanguageTag((String)((Iterator) (collection)).next()));
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:invokeinterface #171 <Method Object Iterator.next()>
	//   38   74:checkcast       #173 <Class String>
	//   39   77:invokestatic    #73  <Method Locale LocaleHelper.forLanguageTag(String)>
	//   40   80:invokespecial   #155 <Method int findFirstMatchIndex(Locale)>
	//   41   83:istore          4
			if(j == 0)
	//*  42   85:iload           4
	//*  43   87:ifne            92
				return 0;
	//   44   90:iconst_0        
	//   45   91:ireturn         
			if(j < i)
	//*  46   92:iload           4
	//*  47   94:iload_3         
	//*  48   95:icmpge          58
				i = j;
	//   49   98:iload           4
	//   50  100:istore_3        
		} while(true);
	//   51  101:goto            58
		if(i == 0x7fffffff)
	//*  52  104:iload_3         
	//*  53  105:ldc1            #156 <Int 0x7fffffff>
	//*  54  107:icmpne          112
			return 0;
	//   55  110:iconst_0        
	//   56  111:ireturn         
		else
			return i;
	//   57  112:iload_3         
	//   58  113:ireturn         
	}

	private int findFirstMatchIndex(Locale locale)
	{
		for(int i = 0; i < mList.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #90  <Field Locale[] mList>
	//*   5    7:arraylength     
	//*   6    8:icmpge          33
			if(matchScore(locale, mList[i]) > 0)
	//*   7   11:aload_1         
	//*   8   12:aload_0         
	//*   9   13:getfield        #90  <Field Locale[] mList>
	//*  10   16:iload_2         
	//*  11   17:aaload          
	//*  12   18:invokestatic    #178 <Method int matchScore(Locale, Locale)>
	//*  13   21:ifle            26
				return i;
	//   14   24:iload_2         
	//   15   25:ireturn         

	//   16   26:iload_2         
	//   17   27:iconst_1        
	//   18   28:iadd            
	//   19   29:istore_2        
	//*  20   30:goto            2
		return 0x7fffffff;
	//   21   33:ldc1            #156 <Int 0x7fffffff>
	//   22   35:ireturn         
	}

	static LocaleListHelper forLanguageTags(String s)
	{
		if(s != null && !s.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:ifnull          60
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #184 <Method boolean String.isEmpty()>
	//*   4    8:ifeq            14
	//*   5   11:goto            60
		{
			s = ((String) (s.split(",")));
	//    6   14:aload_0         
	//    7   15:ldc1            #186 <String ",">
	//    8   17:invokevirtual   #190 <Method String[] String.split(String)>
	//    9   20:astore_0        
			Locale alocale[] = new Locale[s.length];
	//   10   21:aload_0         
	//   11   22:arraylength     
	//   12   23:anewarray       Locale[]
	//   13   26:astore_2        
			for(int i = 0; i < alocale.length; i++)
	//*  14   27:iconst_0        
	//*  15   28:istore_1        
	//*  16   29:iload_1         
	//*  17   30:aload_2         
	//*  18   31:arraylength     
	//*  19   32:icmpge          51
				alocale[i] = LocaleHelper.forLanguageTag(((String) (s[i])));
	//   20   35:aload_2         
	//   21   36:iload_1         
	//   22   37:aload_0         
	//   23   38:iload_1         
	//   24   39:aaload          
	//   25   40:invokestatic    #73  <Method Locale LocaleHelper.forLanguageTag(String)>
	//   26   43:aastore         

	//   27   44:iload_1         
	//   28   45:iconst_1        
	//   29   46:iadd            
	//   30   47:istore_1        
	//*  31   48:goto            29
			return new LocaleListHelper(alocale);
	//   32   51:new             #2   <Class LocaleListHelper>
	//   33   54:dup             
	//   34   55:aload_2         
	//   35   56:invokespecial   #48  <Method void LocaleListHelper(Locale[])>
	//   36   59:areturn         
		} else
		{
			return getEmptyLocaleList();
	//   37   60:invokestatic    #194 <Method LocaleListHelper getEmptyLocaleList()>
	//   38   63:areturn         
		}
	}

	static LocaleListHelper getAdjustedDefault()
	{
		getDefault();
	//    0    0:invokestatic    #202 <Method LocaleListHelper getDefault()>
	//    1    3:pop             
		LocaleListHelper localelisthelper;
		synchronized(sLock)
	//*   2    4:getstatic       #79  <Field Object sLock>
	//*   3    7:astore_0        
	//*   4    8:aload_0         
	//*   5    9:monitorenter    
		{
			localelisthelper = sDefaultAdjustedLocaleList;
	//    6   10:getstatic       #204 <Field LocaleListHelper sDefaultAdjustedLocaleList>
	//    7   13:astore_1        
		}
	//    8   14:aload_0         
	//    9   15:monitorexit     
		return localelisthelper;
	//   10   16:aload_1         
	//   11   17:areturn         
		exception;
	//   12   18:astore_1        
		obj;
	//   13   19:aload_0         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		throw exception;
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	static LocaleListHelper getDefault()
	{
		Object obj1;
label0:
		{
			obj1 = ((Object) (Locale.getDefault()));
	//    0    0:invokestatic    #207 <Method Locale Locale.getDefault()>
	//    1    3:astore_1        
			synchronized(sLock)
	//*   2    4:getstatic       #79  <Field Object sLock>
	//*   3    7:astore_0        
	//*   4    8:aload_0         
	//*   5    9:monitorenter    
			{
				if(((Locale) (obj1)).equals(((Object) (sLastDefaultLocale))))
					break MISSING_BLOCK_LABEL_72;
	//    6   10:aload_1         
	//    7   11:getstatic       #209 <Field Locale sLastDefaultLocale>
	//    8   14:invokevirtual   #94  <Method boolean Locale.equals(Object)>
	//    9   17:ifne            72
				sLastDefaultLocale = ((Locale) (obj1));
	//   10   20:aload_1         
	//   11   21:putstatic       #209 <Field Locale sLastDefaultLocale>
				if(sDefaultLocaleList == null || !((Locale) (obj1)).equals(((Object) (sDefaultLocaleList.get(0)))))
					break label0;
	//   12   24:getstatic       #211 <Field LocaleListHelper sDefaultLocaleList>
	//   13   27:ifnull          52
	//   14   30:aload_1         
	//   15   31:getstatic       #211 <Field LocaleListHelper sDefaultLocaleList>
	//   16   34:iconst_0        
	//   17   35:invokevirtual   #215 <Method Locale get(int)>
	//   18   38:invokevirtual   #94  <Method boolean Locale.equals(Object)>
	//   19   41:ifeq            52
				obj1 = ((Object) (sDefaultLocaleList));
	//   20   44:getstatic       #211 <Field LocaleListHelper sDefaultLocaleList>
	//   21   47:astore_1        
			}
	//   22   48:aload_0         
	//   23   49:monitorexit     
			return ((LocaleListHelper) (obj1));
	//   24   50:aload_1         
	//   25   51:areturn         
		}
		sDefaultLocaleList = new LocaleListHelper(((Locale) (obj1)), sLastExplicitlySetLocaleList);
	//   26   52:new             #2   <Class LocaleListHelper>
	//   27   55:dup             
	//   28   56:aload_1         
	//   29   57:getstatic       #217 <Field LocaleListHelper sLastExplicitlySetLocaleList>
	//   30   60:invokespecial   #219 <Method void LocaleListHelper(Locale, LocaleListHelper)>
	//   31   63:putstatic       #211 <Field LocaleListHelper sDefaultLocaleList>
		sDefaultAdjustedLocaleList = sDefaultLocaleList;
	//   32   66:getstatic       #211 <Field LocaleListHelper sDefaultLocaleList>
	//   33   69:putstatic       #204 <Field LocaleListHelper sDefaultAdjustedLocaleList>
		obj1 = ((Object) (sDefaultLocaleList));
	//   34   72:getstatic       #211 <Field LocaleListHelper sDefaultLocaleList>
	//   35   75:astore_1        
		obj;
	//   36   76:aload_0         
		JVM INSTR monitorexit ;
	//   37   77:monitorexit     
		return ((LocaleListHelper) (obj1));
	//   38   78:aload_1         
	//   39   79:areturn         
		exception;
	//   40   80:astore_1        
		obj;
	//   41   81:aload_0         
		JVM INSTR monitorexit ;
	//   42   82:monitorexit     
		throw exception;
	//   43   83:aload_1         
	//   44   84:athrow          
	}

	static LocaleListHelper getEmptyLocaleList()
	{
		return sEmptyLocaleList;
	//    0    0:getstatic       #50  <Field LocaleListHelper sEmptyLocaleList>
	//    1    3:areturn         
	}

	private static String getLikelyScript(Locale locale)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #225 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          25
		{
			locale = ((Locale) (locale.getScript()));
	//    3    8:aload_0         
	//    4    9:invokevirtual   #228 <Method String Locale.getScript()>
	//    5   12:astore_0        
			if(!((String) (locale)).isEmpty())
	//*   6   13:aload_0         
	//*   7   14:invokevirtual   #184 <Method boolean String.isEmpty()>
	//*   8   17:ifne            22
				return ((String) (locale));
	//    9   20:aload_0         
	//   10   21:areturn         
			else
				return "";
	//   11   22:ldc1            #122 <String "">
	//   12   24:areturn         
		} else
		{
			return "";
	//   13   25:ldc1            #122 <String "">
	//   14   27:areturn         
		}
	}

	private static boolean isPseudoLocale(String s)
	{
		return "en-XA".equals(((Object) (s))) || "ar-XB".equals(((Object) (s)));
	//    0    0:ldc1            #24  <String "en-XA">
	//    1    2:aload_0         
	//    2    3:invokevirtual   #231 <Method boolean String.equals(Object)>
	//    3    6:ifne            23
	//    4    9:ldc1            #21  <String "ar-XB">
	//    5   11:aload_0         
	//    6   12:invokevirtual   #231 <Method boolean String.equals(Object)>
	//    7   15:ifeq            21
	//    8   18:goto            23
	//    9   21:iconst_0        
	//   10   22:ireturn         
	//   11   23:iconst_1        
	//   12   24:ireturn         
	}

	private static boolean isPseudoLocale(Locale locale)
	{
		return LOCALE_EN_XA.equals(((Object) (locale))) || LOCALE_AR_XB.equals(((Object) (locale)));
	//    0    0:getstatic       #59  <Field Locale LOCALE_EN_XA>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #94  <Method boolean Locale.equals(Object)>
	//    3    7:ifne            25
	//    4   10:getstatic       #65  <Field Locale LOCALE_AR_XB>
	//    5   13:aload_0         
	//    6   14:invokevirtual   #94  <Method boolean Locale.equals(Object)>
	//    7   17:ifeq            23
	//    8   20:goto            25
	//    9   23:iconst_0        
	//   10   24:ireturn         
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	static boolean isPseudoLocalesOnly(String as[])
	{
		if(as == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		if(as.length > 3)
	//*   4    6:aload_0         
	//*   5    7:arraylength     
	//*   6    8:iconst_3        
	//*   7    9:icmple          14
			return false;
	//    8   12:iconst_0        
	//    9   13:ireturn         
		int j = as.length;
	//   10   14:aload_0         
	//   11   15:arraylength     
	//   12   16:istore_2        
		for(int i = 0; i < j; i++)
	//*  13   17:iconst_0        
	//*  14   18:istore_1        
	//*  15   19:iload_1         
	//*  16   20:iload_2         
	//*  17   21:icmpge          51
		{
			String s = as[i];
	//   18   24:aload_0         
	//   19   25:iload_1         
	//   20   26:aaload          
	//   21   27:astore_3        
			if(!s.isEmpty() && !isPseudoLocale(s))
	//*  22   28:aload_3         
	//*  23   29:invokevirtual   #184 <Method boolean String.isEmpty()>
	//*  24   32:ifne            44
	//*  25   35:aload_3         
	//*  26   36:invokestatic    #236 <Method boolean isPseudoLocale(String)>
	//*  27   39:ifne            44
				return false;
	//   28   42:iconst_0        
	//   29   43:ireturn         
		}

	//   30   44:iload_1         
	//   31   45:iconst_1        
	//   32   46:iadd            
	//   33   47:istore_1        
	//*  34   48:goto            19
		return true;
	//   35   51:iconst_1        
	//   36   52:ireturn         
	}

	private static int matchScore(Locale locale, Locale locale1)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #243 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #245 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #248 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	static void setDefault(LocaleListHelper localelisthelper)
	{
		setDefault(localelisthelper, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #253 <Method void setDefault(LocaleListHelper, int)>
	//    3    5:return          
	}

	static void setDefault(LocaleListHelper localelisthelper, int i)
	{
		if(localelisthelper == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("locales is null");
	//    2    4:new             #83  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #255 <String "locales is null">
	//    5   10:invokespecial   #88  <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(localelisthelper.isEmpty())
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #256 <Method boolean isEmpty()>
	//*   9   18:ifeq            32
			throw new IllegalArgumentException("locales is empty");
	//   10   21:new             #139 <Class IllegalArgumentException>
	//   11   24:dup             
	//   12   25:ldc2            #258 <String "locales is empty">
	//   13   28:invokespecial   #140 <Method void IllegalArgumentException(String)>
	//   14   31:athrow          
		Object obj = sLock;
	//   15   32:getstatic       #79  <Field Object sLock>
	//   16   35:astore_2        
		obj;
	//   17   36:aload_2         
		JVM INSTR monitorenter ;
	//   18   37:monitorenter    
		sLastDefaultLocale = localelisthelper.get(i);
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:invokevirtual   #215 <Method Locale get(int)>
	//   22   43:putstatic       #209 <Field Locale sLastDefaultLocale>
		Locale.setDefault(sLastDefaultLocale);
	//   23   46:getstatic       #209 <Field Locale sLastDefaultLocale>
	//   24   49:invokestatic    #261 <Method void Locale.setDefault(Locale)>
		sLastExplicitlySetLocaleList = localelisthelper;
	//   25   52:aload_0         
	//   26   53:putstatic       #217 <Field LocaleListHelper sLastExplicitlySetLocaleList>
		sDefaultLocaleList = localelisthelper;
	//   27   56:aload_0         
	//   28   57:putstatic       #211 <Field LocaleListHelper sDefaultLocaleList>
		if(i != 0)
			break MISSING_BLOCK_LABEL_73;
	//   29   60:iload_1         
	//   30   61:ifne            73
		sDefaultAdjustedLocaleList = sDefaultLocaleList;
	//   31   64:getstatic       #211 <Field LocaleListHelper sDefaultLocaleList>
	//   32   67:putstatic       #204 <Field LocaleListHelper sDefaultAdjustedLocaleList>
		break MISSING_BLOCK_LABEL_89;
	//   33   70:goto            89
		sDefaultAdjustedLocaleList = new LocaleListHelper(sLastDefaultLocale, sDefaultLocaleList);
	//   34   73:new             #2   <Class LocaleListHelper>
	//   35   76:dup             
	//   36   77:getstatic       #209 <Field Locale sLastDefaultLocale>
	//   37   80:getstatic       #211 <Field LocaleListHelper sDefaultLocaleList>
	//   38   83:invokespecial   #219 <Method void LocaleListHelper(Locale, LocaleListHelper)>
	//   39   86:putstatic       #204 <Field LocaleListHelper sDefaultAdjustedLocaleList>
		obj;
	//   40   89:aload_2         
		JVM INSTR monitorexit ;
	//   41   90:monitorexit     
		return;
	//   42   91:return          
		localelisthelper;
	//   43   92:astore_0        
		obj;
	//   44   93:aload_2         
		JVM INSTR monitorexit ;
	//   45   94:monitorexit     
		throw localelisthelper;
	//   46   95:aload_0         
	//   47   96:athrow          
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof LocaleListHelper))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class LocaleListHelper>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) (((LocaleListHelper)obj).mList));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class LocaleListHelper>
	//   12   20:getfield        #90  <Field Locale[] mList>
	//   13   23:astore_1        
		if(mList.length != obj.length)
	//*  14   24:aload_0         
	//*  15   25:getfield        #90  <Field Locale[] mList>
	//*  16   28:arraylength     
	//*  17   29:aload_1         
	//*  18   30:arraylength     
	//*  19   31:icmpeq          36
			return false;
	//   20   34:iconst_0        
	//   21   35:ireturn         
		for(int i = 0; i < mList.length; i++)
	//*  22   36:iconst_0        
	//*  23   37:istore_2        
	//*  24   38:iload_2         
	//*  25   39:aload_0         
	//*  26   40:getfield        #90  <Field Locale[] mList>
	//*  27   43:arraylength     
	//*  28   44:icmpge          71
			if(!mList[i].equals(((Object) (obj[i]))))
	//*  29   47:aload_0         
	//*  30   48:getfield        #90  <Field Locale[] mList>
	//*  31   51:iload_2         
	//*  32   52:aaload          
	//*  33   53:aload_1         
	//*  34   54:iload_2         
	//*  35   55:aaload          
	//*  36   56:invokevirtual   #94  <Method boolean Locale.equals(Object)>
	//*  37   59:ifne            64
				return false;
	//   38   62:iconst_0        
	//   39   63:ireturn         

	//   40   64:iload_2         
	//   41   65:iconst_1        
	//   42   66:iadd            
	//   43   67:istore_2        
	//*  44   68:goto            38
		return true;
	//   45   71:iconst_1        
	//   46   72:ireturn         
	}

	Locale get(int i)
	{
		if(i >= 0 && i < mList.length)
	//*   0    0:iload_1         
	//*   1    1:iflt            20
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #90  <Field Locale[] mList>
	//*   5    9:arraylength     
	//*   6   10:icmpge          20
			return mList[i];
	//    7   13:aload_0         
	//    8   14:getfield        #90  <Field Locale[] mList>
	//    9   17:iload_1         
	//   10   18:aaload          
	//   11   19:areturn         
		else
			return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
	}

	Locale getFirstMatch(String as[])
	{
		return computeFirstMatch(((Collection) (Arrays.asList(((Object []) (as))))), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #269 <Method java.util.List Arrays.asList(Object[])>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #271 <Method Locale computeFirstMatch(Collection, boolean)>
	//    5    9:areturn         
	}

	int getFirstMatchIndex(String as[])
	{
		return computeFirstMatchIndex(((Collection) (Arrays.asList(((Object []) (as))))), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #269 <Method java.util.List Arrays.asList(Object[])>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #149 <Method int computeFirstMatchIndex(Collection, boolean)>
	//    5    9:ireturn         
	}

	int getFirstMatchIndexWithEnglishSupported(Collection collection)
	{
		return computeFirstMatchIndex(collection, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #149 <Method int computeFirstMatchIndex(Collection, boolean)>
	//    4    6:ireturn         
	}

	int getFirstMatchIndexWithEnglishSupported(String as[])
	{
		return getFirstMatchIndexWithEnglishSupported(((Collection) (Arrays.asList(((Object []) (as))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #269 <Method java.util.List Arrays.asList(Object[])>
	//    3    5:invokevirtual   #278 <Method int getFirstMatchIndexWithEnglishSupported(Collection)>
	//    4    8:ireturn         
	}

	Locale getFirstMatchWithEnglishSupported(String as[])
	{
		return computeFirstMatch(((Collection) (Arrays.asList(((Object []) (as))))), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #269 <Method java.util.List Arrays.asList(Object[])>
	//    3    5:iconst_1        
	//    4    6:invokespecial   #271 <Method Locale computeFirstMatch(Collection, boolean)>
	//    5    9:areturn         
	}

	public int hashCode()
	{
		int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		for(int i = 0; i < mList.length; i++)
	//*   2    2:iconst_0        
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:getfield        #90  <Field Locale[] mList>
	//*   7    9:arraylength     
	//*   8   10:icmpge          35
			j = mList[i].hashCode() + 31 * j;
	//    9   13:aload_0         
	//   10   14:getfield        #90  <Field Locale[] mList>
	//   11   17:iload_1         
	//   12   18:aaload          
	//   13   19:invokevirtual   #283 <Method int Locale.hashCode()>
	//   14   22:bipush          31
	//   15   24:iload_2         
	//   16   25:imul            
	//   17   26:iadd            
	//   18   27:istore_2        

	//   19   28:iload_1         
	//   20   29:iconst_1        
	//   21   30:iadd            
	//   22   31:istore_1        
	//*  23   32:goto            4
		return j;
	//   24   35:iload_2         
	//   25   36:ireturn         
	}

	int indexOf(Locale locale)
	{
		for(int i = 0; i < mList.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #90  <Field Locale[] mList>
	//*   5    7:arraylength     
	//*   6    8:icmpge          33
			if(mList[i].equals(((Object) (locale))))
	//*   7   11:aload_0         
	//*   8   12:getfield        #90  <Field Locale[] mList>
	//*   9   15:iload_2         
	//*  10   16:aaload          
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #94  <Method boolean Locale.equals(Object)>
	//*  13   21:ifeq            26
				return i;
	//   14   24:iload_2         
	//   15   25:ireturn         

	//   16   26:iload_2         
	//   17   27:iconst_1        
	//   18   28:iadd            
	//   19   29:istore_2        
	//*  20   30:goto            2
		return -1;
	//   21   33:iconst_m1       
	//   22   34:ireturn         
	}

	boolean isEmpty()
	{
		return mList.length == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Locale[] mList>
	//    2    4:arraylength     
	//    3    5:ifne            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	int size()
	{
		return mList.length;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Locale[] mList>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	String toLanguageTags()
	{
		return mStringRepresentation;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field String mStringRepresentation>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #100 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #101 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("[");
	//    4    8:aload_2         
	//    5    9:ldc2            #290 <String "[">
	//    6   12:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		for(int i = 0; i < mList.length; i++)
	//*   8   16:iconst_0        
	//*   9   17:istore_1        
	//*  10   18:iload_1         
	//*  11   19:aload_0         
	//*  12   20:getfield        #90  <Field Locale[] mList>
	//*  13   23:arraylength     
	//*  14   24:icmpge          63
		{
			stringbuilder.append(((Object) (mList[i])));
	//   15   27:aload_2         
	//   16   28:aload_0         
	//   17   29:getfield        #90  <Field Locale[] mList>
	//   18   32:iload_1         
	//   19   33:aaload          
	//   20   34:invokevirtual   #293 <Method StringBuilder StringBuilder.append(Object)>
	//   21   37:pop             
			if(i < mList.length - 1)
	//*  22   38:iload_1         
	//*  23   39:aload_0         
	//*  24   40:getfield        #90  <Field Locale[] mList>
	//*  25   43:arraylength     
	//*  26   44:iconst_1        
	//*  27   45:isub            
	//*  28   46:icmpge          56
				stringbuilder.append(',');
	//   29   49:aload_2         
	//   30   50:bipush          44
	//   31   52:invokevirtual   #112 <Method StringBuilder StringBuilder.append(char)>
	//   32   55:pop             
		}

	//   33   56:iload_1         
	//   34   57:iconst_1        
	//   35   58:iadd            
	//   36   59:istore_1        
	//*  37   60:goto            18
		stringbuilder.append("]");
	//   38   63:aload_2         
	//   39   64:ldc2            #295 <String "]">
	//   40   67:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   41   70:pop             
		return stringbuilder.toString();
	//   42   71:aload_2         
	//   43   72:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   44   75:areturn         
	}

	private static final Locale EN_LATN = LocaleHelper.forLanguageTag("en-Latn");
	private static final Locale LOCALE_AR_XB = new Locale("ar", "XB");
	private static final Locale LOCALE_EN_XA = new Locale("en", "XA");
	private static final int NUM_PSEUDO_LOCALES = 2;
	private static final String STRING_AR_XB = "ar-XB";
	private static final String STRING_EN_XA = "en-XA";
	private static LocaleListHelper sDefaultAdjustedLocaleList;
	private static LocaleListHelper sDefaultLocaleList;
	private static final Locale sEmptyList[] = new Locale[0];
	private static final LocaleListHelper sEmptyLocaleList = new LocaleListHelper(new Locale[0]);
	private static Locale sLastDefaultLocale;
	private static LocaleListHelper sLastExplicitlySetLocaleList;
	private static final Object sLock = new Object();
	private final Locale mList[];
	private final String mStringRepresentation;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Locale[]
	//    2    4:putstatic       #44  <Field Locale[] sEmptyList>
	//    3    7:new             #2   <Class LocaleListHelper>
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:anewarray       Locale[]
	//    7   15:invokespecial   #48  <Method void LocaleListHelper(Locale[])>
	//    8   18:putstatic       #50  <Field LocaleListHelper sEmptyLocaleList>
	//    9   21:new             #42  <Class Locale>
	//   10   24:dup             
	//   11   25:ldc1            #52  <String "en">
	//   12   27:ldc1            #54  <String "XA">
	//   13   29:invokespecial   #57  <Method void Locale(String, String)>
	//   14   32:putstatic       #59  <Field Locale LOCALE_EN_XA>
	//   15   35:new             #42  <Class Locale>
	//   16   38:dup             
	//   17   39:ldc1            #61  <String "ar">
	//   18   41:ldc1            #63  <String "XB">
	//   19   43:invokespecial   #57  <Method void Locale(String, String)>
	//   20   46:putstatic       #65  <Field Locale LOCALE_AR_XB>
	//   21   49:ldc1            #67  <String "en-Latn">
	//   22   51:invokestatic    #73  <Method Locale LocaleHelper.forLanguageTag(String)>
	//   23   54:putstatic       #75  <Field Locale EN_LATN>
	//   24   57:new             #4   <Class Object>
	//   25   60:dup             
	//   26   61:invokespecial   #77  <Method void Object()>
	//   27   64:putstatic       #79  <Field Object sLock>
	//*  28   67:return          
	}
}
