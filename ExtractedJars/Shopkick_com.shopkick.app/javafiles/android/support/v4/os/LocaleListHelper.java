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
label0:
		{
			int i;
			int k;
			boolean flag;
label1:
			{
				super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void Object()>
				if(locale == null)
					break label0;
	//    2    4:aload_1         
	//    3    5:ifnull          280
				flag = false;
	//    4    8:iconst_0        
	//    5    9:istore          6
				if(localelisthelper == null)
	//*   6   11:aload_2         
	//*   7   12:ifnonnull       21
					k = 0;
	//    8   15:iconst_0        
	//    9   16:istore          4
				else
	//*  10   18:goto            28
					k = localelisthelper.mList.length;
	//   11   21:aload_2         
	//   12   22:getfield        #89  <Field Locale[] mList>
	//   13   25:arraylength     
	//   14   26:istore          4
				for(i = 0; i < k; i++)
	//*  15   28:iconst_0        
	//*  16   29:istore_3        
	//*  17   30:iload_3         
	//*  18   31:iload           4
	//*  19   33:icmpge          59
					if(locale.equals(((Object) (localelisthelper.mList[i]))))
	//*  20   36:aload_1         
	//*  21   37:aload_2         
	//*  22   38:getfield        #89  <Field Locale[] mList>
	//*  23   41:iload_3         
	//*  24   42:aaload          
	//*  25   43:invokevirtual   #93  <Method boolean Locale.equals(Object)>
	//*  26   46:ifeq            52
						break label1;
	//   27   49:goto            61

	//   28   52:iload_3         
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_3        
	//*  32   56:goto            30
				i = -1;
	//   33   59:iconst_m1       
	//   34   60:istore_3        
			}
			int l;
			if(i == -1)
	//*  35   61:iload_3         
	//*  36   62:iconst_m1       
	//*  37   63:icmpne          72
				l = 1;
	//   38   66:iconst_1        
	//   39   67:istore          5
			else
	//*  40   69:goto            75
				l = 0;
	//   41   72:iconst_0        
	//   42   73:istore          5
			int l1 = l + k;
	//   43   75:iload           5
	//   44   77:iload           4
	//   45   79:iadd            
	//   46   80:istore          8
			Locale alocale[] = new Locale[l1];
	//   47   82:iload           8
	//   48   84:anewarray       Locale[]
	//   49   87:astore          9
			alocale[0] = (Locale)locale.clone();
	//   50   89:aload           9
	//   51   91:iconst_0        
	//   52   92:aload_1         
	//   53   93:invokevirtual   #97  <Method Object Locale.clone()>
	//   54   96:checkcast       #40  <Class Locale>
	//   55   99:aastore         
			if(i == -1)
	//*  56  100:iload_3         
	//*  57  101:iconst_m1       
	//*  58  102:icmpne          141
			{
				int i1;
				for(i = 0; i < k; i = i1)
	//*  59  105:iconst_0        
	//*  60  106:istore_3        
	//*  61  107:iload_3         
	//*  62  108:iload           4
	//*  63  110:icmpge          214
				{
					i1 = i + 1;
	//   64  113:iload_3         
	//   65  114:iconst_1        
	//   66  115:iadd            
	//   67  116:istore          5
					alocale[i1] = (Locale)localelisthelper.mList[i].clone();
	//   68  118:aload           9
	//   69  120:iload           5
	//   70  122:aload_2         
	//   71  123:getfield        #89  <Field Locale[] mList>
	//   72  126:iload_3         
	//   73  127:aaload          
	//   74  128:invokevirtual   #97  <Method Object Locale.clone()>
	//   75  131:checkcast       #40  <Class Locale>
	//   76  134:aastore         
				}

	//   77  135:iload           5
	//   78  137:istore_3        
			} else
	//*  79  138:goto            107
			{
				int k1;
				for(int j1 = 0; j1 < i; j1 = k1)
	//*  80  141:iconst_0        
	//*  81  142:istore          5
	//*  82  144:iload           5
	//*  83  146:iload_3         
	//*  84  147:icmpge          181
				{
					k1 = j1 + 1;
	//   85  150:iload           5
	//   86  152:iconst_1        
	//   87  153:iadd            
	//   88  154:istore          7
					alocale[k1] = (Locale)localelisthelper.mList[j1].clone();
	//   89  156:aload           9
	//   90  158:iload           7
	//   91  160:aload_2         
	//   92  161:getfield        #89  <Field Locale[] mList>
	//   93  164:iload           5
	//   94  166:aaload          
	//   95  167:invokevirtual   #97  <Method Object Locale.clone()>
	//   96  170:checkcast       #40  <Class Locale>
	//   97  173:aastore         
				}

	//   98  174:iload           7
	//   99  176:istore          5
	//* 100  178:goto            144
				for(i++; i < k; i++)
	//* 101  181:iload_3         
	//* 102  182:iconst_1        
	//* 103  183:iadd            
	//* 104  184:istore_3        
	//* 105  185:iload_3         
	//* 106  186:iload           4
	//* 107  188:icmpge          214
					alocale[i] = (Locale)localelisthelper.mList[i].clone();
	//  108  191:aload           9
	//  109  193:iload_3         
	//  110  194:aload_2         
	//  111  195:getfield        #89  <Field Locale[] mList>
	//  112  198:iload_3         
	//  113  199:aaload          
	//  114  200:invokevirtual   #97  <Method Object Locale.clone()>
	//  115  203:checkcast       #40  <Class Locale>
	//  116  206:aastore         

	//  117  207:iload_3         
	//  118  208:iconst_1        
	//  119  209:iadd            
	//  120  210:istore_3        
			}
	//* 121  211:goto            185
			locale = ((Locale) (new StringBuilder()));
	//  122  214:new             #99  <Class StringBuilder>
	//  123  217:dup             
	//  124  218:invokespecial   #100 <Method void StringBuilder()>
	//  125  221:astore_1        
			for(int j = ((int) (flag)); j < l1; j++)
	//* 126  222:iload           6
	//* 127  224:istore_3        
	//* 128  225:iload_3         
	//* 129  226:iload           8
	//* 130  228:icmpge          265
			{
				((StringBuilder) (locale)).append(LocaleHelper.toLanguageTag(alocale[j]));
	//  131  231:aload_1         
	//  132  232:aload           9
	//  133  234:iload_3         
	//  134  235:aaload          
	//  135  236:invokestatic    #104 <Method String LocaleHelper.toLanguageTag(Locale)>
	//  136  239:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  137  242:pop             
				if(j < l1 - 1)
	//* 138  243:iload_3         
	//* 139  244:iload           8
	//* 140  246:iconst_1        
	//* 141  247:isub            
	//* 142  248:icmpge          258
					((StringBuilder) (locale)).append(',');
	//  143  251:aload_1         
	//  144  252:bipush          44
	//  145  254:invokevirtual   #111 <Method StringBuilder StringBuilder.append(char)>
	//  146  257:pop             
			}

	//  147  258:iload_3         
	//  148  259:iconst_1        
	//  149  260:iadd            
	//  150  261:istore_3        
	//* 151  262:goto            225
			mList = alocale;
	//  152  265:aload_0         
	//  153  266:aload           9
	//  154  268:putfield        #89  <Field Locale[] mList>
			mStringRepresentation = ((StringBuilder) (locale)).toString();
	//  155  271:aload_0         
	//  156  272:aload_1         
	//  157  273:invokevirtual   #115 <Method String StringBuilder.toString()>
	//  158  276:putfield        #117 <Field String mStringRepresentation>
			return;
	//  159  279:return          
		}
		throw new NullPointerException("topLocale is null");
	//  160  280:new             #119 <Class NullPointerException>
	//  161  283:dup             
	//  162  284:ldc1            #121 <String "topLocale is null">
	//  163  286:invokespecial   #124 <Method void NullPointerException(String)>
	//  164  289:athrow          
	}

	transient LocaleListHelper(Locale alocale[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void Object()>
		if(alocale.length == 0)
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifne            23
		{
			mList = sEmptyList;
	//    5    9:aload_0         
	//    6   10:getstatic       #42  <Field Locale[] sEmptyList>
	//    7   13:putfield        #89  <Field Locale[] mList>
			mStringRepresentation = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #128 <String "">
	//   10   19:putfield        #117 <Field String mStringRepresentation>
			return;
	//   11   22:return          
		}
		Locale alocale1[] = new Locale[alocale.length];
	//   12   23:aload_1         
	//   13   24:arraylength     
	//   14   25:anewarray       Locale[]
	//   15   28:astore_3        
		HashSet hashset = new HashSet();
	//   16   29:new             #130 <Class HashSet>
	//   17   32:dup             
	//   18   33:invokespecial   #131 <Method void HashSet()>
	//   19   36:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   20   38:new             #99  <Class StringBuilder>
	//   21   41:dup             
	//   22   42:invokespecial   #100 <Method void StringBuilder()>
	//   23   45:astore          5
		for(int i = 0; i < alocale.length;)
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
			if(locale != null)
	//*  34   60:aload           6
	//*  35   62:ifnull          172
			{
				if(!hashset.contains(((Object) (locale))))
	//*  36   65:aload           4
	//*  37   67:aload           6
	//*  38   69:invokevirtual   #134 <Method boolean HashSet.contains(Object)>
	//*  39   72:ifne            132
				{
					locale = (Locale)locale.clone();
	//   40   75:aload           6
	//   41   77:invokevirtual   #97  <Method Object Locale.clone()>
	//   42   80:checkcast       #40  <Class Locale>
	//   43   83:astore          6
					alocale1[i] = locale;
	//   44   85:aload_3         
	//   45   86:iload_2         
	//   46   87:aload           6
	//   47   89:aastore         
					stringbuilder.append(LocaleHelper.toLanguageTag(locale));
	//   48   90:aload           5
	//   49   92:aload           6
	//   50   94:invokestatic    #104 <Method String LocaleHelper.toLanguageTag(Locale)>
	//   51   97:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   52  100:pop             
					if(i < alocale.length - 1)
	//*  53  101:iload_2         
	//*  54  102:aload_1         
	//*  55  103:arraylength     
	//*  56  104:iconst_1        
	//*  57  105:isub            
	//*  58  106:icmpge          117
						stringbuilder.append(',');
	//   59  109:aload           5
	//   60  111:bipush          44
	//   61  113:invokevirtual   #111 <Method StringBuilder StringBuilder.append(char)>
	//   62  116:pop             
					hashset.add(((Object) (locale)));
	//   63  117:aload           4
	//   64  119:aload           6
	//   65  121:invokevirtual   #137 <Method boolean HashSet.add(Object)>
	//   66  124:pop             
					i++;
	//   67  125:iload_2         
	//   68  126:iconst_1        
	//   69  127:iadd            
	//   70  128:istore_2        
				} else
	//*  71  129:goto            49
				{
					alocale = ((Locale []) (new StringBuilder()));
	//   72  132:new             #99  <Class StringBuilder>
	//   73  135:dup             
	//   74  136:invokespecial   #100 <Method void StringBuilder()>
	//   75  139:astore_1        
					((StringBuilder) (alocale)).append("list[");
	//   76  140:aload_1         
	//   77  141:ldc1            #139 <String "list[">
	//   78  143:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   79  146:pop             
					((StringBuilder) (alocale)).append(i);
	//   80  147:aload_1         
	//   81  148:iload_2         
	//   82  149:invokevirtual   #142 <Method StringBuilder StringBuilder.append(int)>
	//   83  152:pop             
					((StringBuilder) (alocale)).append("] is a repetition");
	//   84  153:aload_1         
	//   85  154:ldc1            #144 <String "] is a repetition">
	//   86  156:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   87  159:pop             
					throw new IllegalArgumentException(((StringBuilder) (alocale)).toString());
	//   88  160:new             #146 <Class IllegalArgumentException>
	//   89  163:dup             
	//   90  164:aload_1         
	//   91  165:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   92  168:invokespecial   #147 <Method void IllegalArgumentException(String)>
	//   93  171:athrow          
				}
			} else
			{
				alocale = ((Locale []) (new StringBuilder()));
	//   94  172:new             #99  <Class StringBuilder>
	//   95  175:dup             
	//   96  176:invokespecial   #100 <Method void StringBuilder()>
	//   97  179:astore_1        
				((StringBuilder) (alocale)).append("list[");
	//   98  180:aload_1         
	//   99  181:ldc1            #139 <String "list[">
	//  100  183:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  101  186:pop             
				((StringBuilder) (alocale)).append(i);
	//  102  187:aload_1         
	//  103  188:iload_2         
	//  104  189:invokevirtual   #142 <Method StringBuilder StringBuilder.append(int)>
	//  105  192:pop             
				((StringBuilder) (alocale)).append("] is null");
	//  106  193:aload_1         
	//  107  194:ldc1            #149 <String "] is null">
	//  108  196:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  109  199:pop             
				throw new NullPointerException(((StringBuilder) (alocale)).toString());
	//  110  200:new             #119 <Class NullPointerException>
	//  111  203:dup             
	//  112  204:aload_1         
	//  113  205:invokevirtual   #115 <Method String StringBuilder.toString()>
	//  114  208:invokespecial   #124 <Method void NullPointerException(String)>
	//  115  211:athrow          
			}
		}

		mList = alocale1;
	//  116  212:aload_0         
	//  117  213:aload_3         
	//  118  214:putfield        #89  <Field Locale[] mList>
		mStringRepresentation = stringbuilder.toString();
	//  119  217:aload_0         
	//  120  218:aload           5
	//  121  220:invokevirtual   #115 <Method String StringBuilder.toString()>
	//  122  223:putfield        #117 <Field String mStringRepresentation>
	//  123  226:return          
	}

	private Locale computeFirstMatch(Collection collection, boolean flag)
	{
		int i = computeFirstMatchIndex(collection, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #155 <Method int computeFirstMatchIndex(Collection, boolean)>
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
	//   11   15:getfield        #89  <Field Locale[] mList>
	//   12   18:iload_3         
	//   13   19:aaload          
	//   14   20:areturn         
	}

	private int computeFirstMatchIndex(Collection collection, boolean flag)
	{
		int i;
label0:
		{
			Locale alocale[] = mList;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Locale[] mList>
	//    2    4:astore          5
			if(alocale.length == 1)
	//*   3    6:aload           5
	//*   4    8:arraylength     
	//*   5    9:iconst_1        
	//*   6   10:icmpne          15
				return 0;
	//    7   13:iconst_0        
	//    8   14:ireturn         
			if(alocale.length == 0)
	//*   9   15:aload           5
	//*  10   17:arraylength     
	//*  11   18:ifne            23
				return -1;
	//   12   21:iconst_m1       
	//   13   22:ireturn         
			if(flag)
	//*  14   23:iload_2         
	//*  15   24:ifeq            50
			{
				i = findFirstMatchIndex(EN_LATN);
	//   16   27:aload_0         
	//   17   28:getstatic       #73  <Field Locale EN_LATN>
	//   18   31:invokespecial   #161 <Method int findFirstMatchIndex(Locale)>
	//   19   34:istore_3        
				if(i == 0)
	//*  20   35:iload_3         
	//*  21   36:ifne            41
					return 0;
	//   22   39:iconst_0        
	//   23   40:ireturn         
				if(i < 0x7fffffff)
	//*  24   41:iload_3         
	//*  25   42:ldc1            #162 <Int 0x7fffffff>
	//*  26   44:icmpge          50
					break label0;
	//   27   47:goto            53
			}
			i = 0x7fffffff;
	//   28   50:ldc1            #162 <Int 0x7fffffff>
	//   29   52:istore_3        
		}
		collection = ((Collection) (collection.iterator()));
	//   30   53:aload_1         
	//   31   54:invokeinterface #168 <Method Iterator Collection.iterator()>
	//   32   59:astore_1        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//   33   60:aload_1         
	//   34   61:invokeinterface #174 <Method boolean Iterator.hasNext()>
	//   35   66:ifeq            106
			int j = findFirstMatchIndex(LocaleHelper.forLanguageTag((String)((Iterator) (collection)).next()));
	//   36   69:aload_0         
	//   37   70:aload_1         
	//   38   71:invokeinterface #177 <Method Object Iterator.next()>
	//   39   76:checkcast       #179 <Class String>
	//   40   79:invokestatic    #71  <Method Locale LocaleHelper.forLanguageTag(String)>
	//   41   82:invokespecial   #161 <Method int findFirstMatchIndex(Locale)>
	//   42   85:istore          4
			if(j == 0)
	//*  43   87:iload           4
	//*  44   89:ifne            94
				return 0;
	//   45   92:iconst_0        
	//   46   93:ireturn         
			if(j < i)
	//*  47   94:iload           4
	//*  48   96:iload_3         
	//*  49   97:icmpge          60
				i = j;
	//   50  100:iload           4
	//   51  102:istore_3        
		} while(true);
	//   52  103:goto            60
		if(i == 0x7fffffff)
	//*  53  106:iload_3         
	//*  54  107:ldc1            #162 <Int 0x7fffffff>
	//*  55  109:icmpne          114
			return 0;
	//   56  112:iconst_0        
	//   57  113:ireturn         
		else
			return i;
	//   58  114:iload_3         
	//   59  115:ireturn         
	}

	private int findFirstMatchIndex(Locale locale)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		do
		{
			Locale alocale[] = mList;
	//    2    2:aload_0         
	//    3    3:getfield        #89  <Field Locale[] mList>
	//    4    6:astore_3        
			if(i < alocale.length)
	//*   5    7:iload_2         
	//*   6    8:aload_3         
	//*   7    9:arraylength     
	//*   8   10:icmpge          32
			{
				if(matchScore(locale, alocale[i]) > 0)
	//*   9   13:aload_1         
	//*  10   14:aload_3         
	//*  11   15:iload_2         
	//*  12   16:aaload          
	//*  13   17:invokestatic    #184 <Method int matchScore(Locale, Locale)>
	//*  14   20:ifle            25
					return i;
	//   15   23:iload_2         
	//   16   24:ireturn         
				i++;
	//   17   25:iload_2         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:istore_2        
			} else
	//*  21   29:goto            2
			{
				return 0x7fffffff;
	//   22   32:ldc1            #162 <Int 0x7fffffff>
	//   23   34:ireturn         
			}
		} while(true);
	}

	static LocaleListHelper forLanguageTags(String s)
	{
		if(s != null && !s.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:ifnull          61
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #190 <Method boolean String.isEmpty()>
	//*   4    8:ifeq            14
	//*   5   11:goto            61
		{
			s = ((String) (s.split(",", -1)));
	//    6   14:aload_0         
	//    7   15:ldc1            #192 <String ",">
	//    8   17:iconst_m1       
	//    9   18:invokevirtual   #196 <Method String[] String.split(String, int)>
	//   10   21:astore_0        
			Locale alocale[] = new Locale[s.length];
	//   11   22:aload_0         
	//   12   23:arraylength     
	//   13   24:anewarray       Locale[]
	//   14   27:astore_2        
			for(int i = 0; i < alocale.length; i++)
	//*  15   28:iconst_0        
	//*  16   29:istore_1        
	//*  17   30:iload_1         
	//*  18   31:aload_2         
	//*  19   32:arraylength     
	//*  20   33:icmpge          52
				alocale[i] = LocaleHelper.forLanguageTag(((String) (s[i])));
	//   21   36:aload_2         
	//   22   37:iload_1         
	//   23   38:aload_0         
	//   24   39:iload_1         
	//   25   40:aaload          
	//   26   41:invokestatic    #71  <Method Locale LocaleHelper.forLanguageTag(String)>
	//   27   44:aastore         

	//   28   45:iload_1         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:istore_1        
	//*  32   49:goto            30
			return new LocaleListHelper(alocale);
	//   33   52:new             #2   <Class LocaleListHelper>
	//   34   55:dup             
	//   35   56:aload_2         
	//   36   57:invokespecial   #46  <Method void LocaleListHelper(Locale[])>
	//   37   60:areturn         
		} else
		{
			return getEmptyLocaleList();
	//   38   61:invokestatic    #200 <Method LocaleListHelper getEmptyLocaleList()>
	//   39   64:areturn         
		}
	}

	static LocaleListHelper getAdjustedDefault()
	{
		getDefault();
	//    0    0:invokestatic    #208 <Method LocaleListHelper getDefault()>
	//    1    3:pop             
		LocaleListHelper localelisthelper;
		synchronized(sLock)
	//*   2    4:getstatic       #77  <Field Object sLock>
	//*   3    7:astore_0        
	//*   4    8:aload_0         
	//*   5    9:monitorenter    
		{
			localelisthelper = sDefaultAdjustedLocaleList;
	//    6   10:getstatic       #83  <Field LocaleListHelper sDefaultAdjustedLocaleList>
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
	//    0    0:invokestatic    #211 <Method Locale Locale.getDefault()>
	//    1    3:astore_1        
			synchronized(sLock)
	//*   2    4:getstatic       #77  <Field Object sLock>
	//*   3    7:astore_0        
	//*   4    8:aload_0         
	//*   5    9:monitorenter    
			{
				if(((Locale) (obj1)).equals(((Object) (sLastDefaultLocale))))
					break MISSING_BLOCK_LABEL_72;
	//    6   10:aload_1         
	//    7   11:getstatic       #85  <Field Locale sLastDefaultLocale>
	//    8   14:invokevirtual   #93  <Method boolean Locale.equals(Object)>
	//    9   17:ifne            72
				sLastDefaultLocale = ((Locale) (obj1));
	//   10   20:aload_1         
	//   11   21:putstatic       #85  <Field Locale sLastDefaultLocale>
				if(sDefaultLocaleList == null || !((Locale) (obj1)).equals(((Object) (sDefaultLocaleList.get(0)))))
					break label0;
	//   12   24:getstatic       #81  <Field LocaleListHelper sDefaultLocaleList>
	//   13   27:ifnull          52
	//   14   30:aload_1         
	//   15   31:getstatic       #81  <Field LocaleListHelper sDefaultLocaleList>
	//   16   34:iconst_0        
	//   17   35:invokevirtual   #215 <Method Locale get(int)>
	//   18   38:invokevirtual   #93  <Method boolean Locale.equals(Object)>
	//   19   41:ifeq            52
				obj1 = ((Object) (sDefaultLocaleList));
	//   20   44:getstatic       #81  <Field LocaleListHelper sDefaultLocaleList>
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
	//   29   57:getstatic       #79  <Field LocaleListHelper sLastExplicitlySetLocaleList>
	//   30   60:invokespecial   #217 <Method void LocaleListHelper(Locale, LocaleListHelper)>
	//   31   63:putstatic       #81  <Field LocaleListHelper sDefaultLocaleList>
		sDefaultAdjustedLocaleList = sDefaultLocaleList;
	//   32   66:getstatic       #81  <Field LocaleListHelper sDefaultLocaleList>
	//   33   69:putstatic       #83  <Field LocaleListHelper sDefaultAdjustedLocaleList>
		obj1 = ((Object) (sDefaultLocaleList));
	//   34   72:getstatic       #81  <Field LocaleListHelper sDefaultLocaleList>
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
	//    0    0:getstatic       #48  <Field LocaleListHelper sEmptyLocaleList>
	//    1    3:areturn         
	}

	private static String getLikelyScript(Locale locale)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #223 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          25
		{
			locale = ((Locale) (locale.getScript()));
	//    3    8:aload_0         
	//    4    9:invokevirtual   #226 <Method String Locale.getScript()>
	//    5   12:astore_0        
			if(!((String) (locale)).isEmpty())
	//*   6   13:aload_0         
	//*   7   14:invokevirtual   #190 <Method boolean String.isEmpty()>
	//*   8   17:ifne            22
				return ((String) (locale));
	//    9   20:aload_0         
	//   10   21:areturn         
			else
				return "";
	//   11   22:ldc1            #128 <String "">
	//   12   24:areturn         
		} else
		{
			return "";
	//   13   25:ldc1            #128 <String "">
	//   14   27:areturn         
		}
	}

	private static boolean isPseudoLocale(String s)
	{
		return "en-XA".equals(((Object) (s))) || "ar-XB".equals(((Object) (s)));
	//    0    0:ldc1            #22  <String "en-XA">
	//    1    2:aload_0         
	//    2    3:invokevirtual   #229 <Method boolean String.equals(Object)>
	//    3    6:ifne            23
	//    4    9:ldc1            #19  <String "ar-XB">
	//    5   11:aload_0         
	//    6   12:invokevirtual   #229 <Method boolean String.equals(Object)>
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
	//    0    0:getstatic       #57  <Field Locale LOCALE_EN_XA>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #93  <Method boolean Locale.equals(Object)>
	//    3    7:ifne            25
	//    4   10:getstatic       #63  <Field Locale LOCALE_AR_XB>
	//    5   13:aload_0         
	//    6   14:invokevirtual   #93  <Method boolean Locale.equals(Object)>
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
	//*  23   29:invokevirtual   #190 <Method boolean String.isEmpty()>
	//*  24   32:ifne            44
	//*  25   35:aload_3         
	//*  26   36:invokestatic    #234 <Method boolean isPseudoLocale(String)>
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
	//    0    0:new             #241 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #243 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #246 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	static void setDefault(LocaleListHelper localelisthelper)
	{
		setDefault(localelisthelper, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #251 <Method void setDefault(LocaleListHelper, int)>
	//    3    5:return          
	}

	static void setDefault(LocaleListHelper localelisthelper, int i)
	{
		if(localelisthelper == null)
			break MISSING_BLOCK_LABEL_87;
	//    0    0:aload_0         
	//    1    1:ifnull          87
		if(localelisthelper.isEmpty())
			break MISSING_BLOCK_LABEL_76;
	//    2    4:aload_0         
	//    3    5:invokevirtual   #252 <Method boolean isEmpty()>
	//    4    8:ifne            76
		Object obj = sLock;
	//    5   11:getstatic       #77  <Field Object sLock>
	//    6   14:astore_2        
		obj;
	//    7   15:aload_2         
		JVM INSTR monitorenter ;
	//    8   16:monitorenter    
		sLastDefaultLocale = localelisthelper.get(i);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #215 <Method Locale get(int)>
	//   12   22:putstatic       #85  <Field Locale sLastDefaultLocale>
		Locale.setDefault(sLastDefaultLocale);
	//   13   25:getstatic       #85  <Field Locale sLastDefaultLocale>
	//   14   28:invokestatic    #255 <Method void Locale.setDefault(Locale)>
		sLastExplicitlySetLocaleList = localelisthelper;
	//   15   31:aload_0         
	//   16   32:putstatic       #79  <Field LocaleListHelper sLastExplicitlySetLocaleList>
		sDefaultLocaleList = localelisthelper;
	//   17   35:aload_0         
	//   18   36:putstatic       #81  <Field LocaleListHelper sDefaultLocaleList>
		if(i != 0)
			break MISSING_BLOCK_LABEL_52;
	//   19   39:iload_1         
	//   20   40:ifne            52
		sDefaultAdjustedLocaleList = sDefaultLocaleList;
	//   21   43:getstatic       #81  <Field LocaleListHelper sDefaultLocaleList>
	//   22   46:putstatic       #83  <Field LocaleListHelper sDefaultAdjustedLocaleList>
		break MISSING_BLOCK_LABEL_68;
	//   23   49:goto            68
		sDefaultAdjustedLocaleList = new LocaleListHelper(sLastDefaultLocale, sDefaultLocaleList);
	//   24   52:new             #2   <Class LocaleListHelper>
	//   25   55:dup             
	//   26   56:getstatic       #85  <Field Locale sLastDefaultLocale>
	//   27   59:getstatic       #81  <Field LocaleListHelper sDefaultLocaleList>
	//   28   62:invokespecial   #217 <Method void LocaleListHelper(Locale, LocaleListHelper)>
	//   29   65:putstatic       #83  <Field LocaleListHelper sDefaultAdjustedLocaleList>
		obj;
	//   30   68:aload_2         
		JVM INSTR monitorexit ;
	//   31   69:monitorexit     
		return;
	//   32   70:return          
		localelisthelper;
	//   33   71:astore_0        
		obj;
	//   34   72:aload_2         
		JVM INSTR monitorexit ;
	//   35   73:monitorexit     
		throw localelisthelper;
	//   36   74:aload_0         
	//   37   75:athrow          
		throw new IllegalArgumentException("locales is empty");
	//   38   76:new             #146 <Class IllegalArgumentException>
	//   39   79:dup             
	//   40   80:ldc2            #257 <String "locales is empty">
	//   41   83:invokespecial   #147 <Method void IllegalArgumentException(String)>
	//   42   86:athrow          
		throw new NullPointerException("locales is null");
	//   43   87:new             #119 <Class NullPointerException>
	//   44   90:dup             
	//   45   91:ldc2            #259 <String "locales is null">
	//   46   94:invokespecial   #124 <Method void NullPointerException(String)>
	//   47   97:athrow          
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
	//   12   20:getfield        #89  <Field Locale[] mList>
	//   13   23:astore_1        
		if(mList.length != obj.length)
	//*  14   24:aload_0         
	//*  15   25:getfield        #89  <Field Locale[] mList>
	//*  16   28:arraylength     
	//*  17   29:aload_1         
	//*  18   30:arraylength     
	//*  19   31:icmpeq          36
			return false;
	//   20   34:iconst_0        
	//   21   35:ireturn         
		int i = 0;
	//   22   36:iconst_0        
	//   23   37:istore_2        
		do
		{
			Locale alocale[] = mList;
	//   24   38:aload_0         
	//   25   39:getfield        #89  <Field Locale[] mList>
	//   26   42:astore_3        
			if(i < alocale.length)
	//*  27   43:iload_2         
	//*  28   44:aload_3         
	//*  29   45:arraylength     
	//*  30   46:icmpge          70
			{
				if(!alocale[i].equals(((Object) (obj[i]))))
	//*  31   49:aload_3         
	//*  32   50:iload_2         
	//*  33   51:aaload          
	//*  34   52:aload_1         
	//*  35   53:iload_2         
	//*  36   54:aaload          
	//*  37   55:invokevirtual   #93  <Method boolean Locale.equals(Object)>
	//*  38   58:ifne            63
					return false;
	//   39   61:iconst_0        
	//   40   62:ireturn         
				i++;
	//   41   63:iload_2         
	//   42   64:iconst_1        
	//   43   65:iadd            
	//   44   66:istore_2        
			} else
	//*  45   67:goto            38
			{
				return true;
	//   46   70:iconst_1        
	//   47   71:ireturn         
			}
		} while(true);
	}

	Locale get(int i)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            19
		{
			Locale alocale[] = mList;
	//    2    4:aload_0         
	//    3    5:getfield        #89  <Field Locale[] mList>
	//    4    8:astore_2        
			if(i < alocale.length)
	//*   5    9:iload_1         
	//*   6   10:aload_2         
	//*   7   11:arraylength     
	//*   8   12:icmpge          19
				return alocale[i];
	//    9   15:aload_2         
	//   10   16:iload_1         
	//   11   17:aaload          
	//   12   18:areturn         
		}
		return null;
	//   13   19:aconst_null     
	//   14   20:areturn         
	}

	Locale getFirstMatch(String as[])
	{
		return computeFirstMatch(((Collection) (Arrays.asList(((Object []) (as))))), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #267 <Method java.util.List Arrays.asList(Object[])>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #269 <Method Locale computeFirstMatch(Collection, boolean)>
	//    5    9:areturn         
	}

	int getFirstMatchIndex(String as[])
	{
		return computeFirstMatchIndex(((Collection) (Arrays.asList(((Object []) (as))))), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #267 <Method java.util.List Arrays.asList(Object[])>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #155 <Method int computeFirstMatchIndex(Collection, boolean)>
	//    5    9:ireturn         
	}

	int getFirstMatchIndexWithEnglishSupported(Collection collection)
	{
		return computeFirstMatchIndex(collection, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #155 <Method int computeFirstMatchIndex(Collection, boolean)>
	//    4    6:ireturn         
	}

	int getFirstMatchIndexWithEnglishSupported(String as[])
	{
		return getFirstMatchIndexWithEnglishSupported(((Collection) (Arrays.asList(((Object []) (as))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #267 <Method java.util.List Arrays.asList(Object[])>
	//    3    5:invokevirtual   #276 <Method int getFirstMatchIndexWithEnglishSupported(Collection)>
	//    4    8:ireturn         
	}

	Locale getFirstMatchWithEnglishSupported(String as[])
	{
		return computeFirstMatch(((Collection) (Arrays.asList(((Object []) (as))))), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #267 <Method java.util.List Arrays.asList(Object[])>
	//    3    5:iconst_1        
	//    4    6:invokespecial   #269 <Method Locale computeFirstMatch(Collection, boolean)>
	//    5    9:areturn         
	}

	public int hashCode()
	{
		int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		do
		{
			Locale alocale[] = mList;
	//    4    4:aload_0         
	//    5    5:getfield        #89  <Field Locale[] mList>
	//    6    8:astore_3        
			if(i < alocale.length)
	//*   7    9:iload_1         
	//*   8   10:aload_3         
	//*   9   11:arraylength     
	//*  10   12:icmpge          34
			{
				j = j * 31 + alocale[i].hashCode();
	//   11   15:iload_2         
	//   12   16:bipush          31
	//   13   18:imul            
	//   14   19:aload_3         
	//   15   20:iload_1         
	//   16   21:aaload          
	//   17   22:invokevirtual   #281 <Method int Locale.hashCode()>
	//   18   25:iadd            
	//   19   26:istore_2        
				i++;
	//   20   27:iload_1         
	//   21   28:iconst_1        
	//   22   29:iadd            
	//   23   30:istore_1        
			} else
	//*  24   31:goto            4
			{
				return j;
	//   25   34:iload_2         
	//   26   35:ireturn         
			}
		} while(true);
	}

	int indexOf(Locale locale)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		do
		{
			Locale alocale[] = mList;
	//    2    2:aload_0         
	//    3    3:getfield        #89  <Field Locale[] mList>
	//    4    6:astore_3        
			if(i < alocale.length)
	//*   5    7:iload_2         
	//*   6    8:aload_3         
	//*   7    9:arraylength     
	//*   8   10:icmpge          32
			{
				if(alocale[i].equals(((Object) (locale))))
	//*   9   13:aload_3         
	//*  10   14:iload_2         
	//*  11   15:aaload          
	//*  12   16:aload_1         
	//*  13   17:invokevirtual   #93  <Method boolean Locale.equals(Object)>
	//*  14   20:ifeq            25
					return i;
	//   15   23:iload_2         
	//   16   24:ireturn         
				i++;
	//   17   25:iload_2         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:istore_2        
			} else
	//*  21   29:goto            2
			{
				return -1;
	//   22   32:iconst_m1       
	//   23   33:ireturn         
			}
		} while(true);
	}

	boolean isEmpty()
	{
		return mList.length == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Locale[] mList>
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
	//    1    1:getfield        #89  <Field Locale[] mList>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	String toLanguageTags()
	{
		return mStringRepresentation;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field String mStringRepresentation>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #99  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("[");
	//    4    8:aload_2         
	//    5    9:ldc2            #288 <String "[">
	//    6   12:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		int i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_1        
		do
		{
			Locale alocale[] = mList;
	//   10   18:aload_0         
	//   11   19:getfield        #89  <Field Locale[] mList>
	//   12   22:astore_3        
			if(i < alocale.length)
	//*  13   23:iload_1         
	//*  14   24:aload_3         
	//*  15   25:arraylength     
	//*  16   26:icmpge          62
			{
				stringbuilder.append(((Object) (alocale[i])));
	//   17   29:aload_2         
	//   18   30:aload_3         
	//   19   31:iload_1         
	//   20   32:aaload          
	//   21   33:invokevirtual   #291 <Method StringBuilder StringBuilder.append(Object)>
	//   22   36:pop             
				if(i < mList.length - 1)
	//*  23   37:iload_1         
	//*  24   38:aload_0         
	//*  25   39:getfield        #89  <Field Locale[] mList>
	//*  26   42:arraylength     
	//*  27   43:iconst_1        
	//*  28   44:isub            
	//*  29   45:icmpge          55
					stringbuilder.append(',');
	//   30   48:aload_2         
	//   31   49:bipush          44
	//   32   51:invokevirtual   #111 <Method StringBuilder StringBuilder.append(char)>
	//   33   54:pop             
				i++;
	//   34   55:iload_1         
	//   35   56:iconst_1        
	//   36   57:iadd            
	//   37   58:istore_1        
			} else
	//*  38   59:goto            18
			{
				stringbuilder.append("]");
	//   39   62:aload_2         
	//   40   63:ldc2            #293 <String "]">
	//   41   66:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   42   69:pop             
				return stringbuilder.toString();
	//   43   70:aload_2         
	//   44   71:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   45   74:areturn         
			}
		} while(true);
	}

	private static final Locale EN_LATN = LocaleHelper.forLanguageTag("en-Latn");
	private static final Locale LOCALE_AR_XB = new Locale("ar", "XB");
	private static final Locale LOCALE_EN_XA = new Locale("en", "XA");
	private static final int NUM_PSEUDO_LOCALES = 2;
	private static final String STRING_AR_XB = "ar-XB";
	private static final String STRING_EN_XA = "en-XA";
	private static LocaleListHelper sDefaultAdjustedLocaleList = null;
	private static LocaleListHelper sDefaultLocaleList = null;
	private static final Locale sEmptyList[] = new Locale[0];
	private static final LocaleListHelper sEmptyLocaleList = new LocaleListHelper(new Locale[0]);
	private static Locale sLastDefaultLocale = null;
	private static LocaleListHelper sLastExplicitlySetLocaleList = null;
	private static final Object sLock = new Object();
	private final Locale mList[];
	private final String mStringRepresentation;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Locale[]
	//    2    4:putstatic       #42  <Field Locale[] sEmptyList>
	//    3    7:new             #2   <Class LocaleListHelper>
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:anewarray       Locale[]
	//    7   15:invokespecial   #46  <Method void LocaleListHelper(Locale[])>
	//    8   18:putstatic       #48  <Field LocaleListHelper sEmptyLocaleList>
	//    9   21:new             #40  <Class Locale>
	//   10   24:dup             
	//   11   25:ldc1            #50  <String "en">
	//   12   27:ldc1            #52  <String "XA">
	//   13   29:invokespecial   #55  <Method void Locale(String, String)>
	//   14   32:putstatic       #57  <Field Locale LOCALE_EN_XA>
	//   15   35:new             #40  <Class Locale>
	//   16   38:dup             
	//   17   39:ldc1            #59  <String "ar">
	//   18   41:ldc1            #61  <String "XB">
	//   19   43:invokespecial   #55  <Method void Locale(String, String)>
	//   20   46:putstatic       #63  <Field Locale LOCALE_AR_XB>
	//   21   49:ldc1            #65  <String "en-Latn">
	//   22   51:invokestatic    #71  <Method Locale LocaleHelper.forLanguageTag(String)>
	//   23   54:putstatic       #73  <Field Locale EN_LATN>
	//   24   57:new             #4   <Class Object>
	//   25   60:dup             
	//   26   61:invokespecial   #75  <Method void Object()>
	//   27   64:putstatic       #77  <Field Object sLock>
	//   28   67:aconst_null     
	//   29   68:putstatic       #79  <Field LocaleListHelper sLastExplicitlySetLocaleList>
	//   30   71:aconst_null     
	//   31   72:putstatic       #81  <Field LocaleListHelper sDefaultLocaleList>
	//   32   75:aconst_null     
	//   33   76:putstatic       #83  <Field LocaleListHelper sDefaultAdjustedLocaleList>
	//   34   79:aconst_null     
	//   35   80:putstatic       #85  <Field Locale sLastDefaultLocale>
	//*  36   83:return          
	}
}
