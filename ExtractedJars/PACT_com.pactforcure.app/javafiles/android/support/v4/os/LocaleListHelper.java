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
		int k1;
		Locale alocale[];
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
			if(locale == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
				throw new NullPointerException("topLocale is null");
	//    4    8:new             #91  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:ldc1            #93  <String "topLocale is null">
	//    7   14:invokespecial   #96  <Method void NullPointerException(String)>
	//    8   17:athrow          
			int i;
			int i1;
			int j1;
			if(localelisthelper == null)
	//*   9   18:aload_2         
	//*  10   19:ifnonnull       127
				i1 = 0;
	//   11   22:iconst_0        
	//   12   23:istore          4
			else
	//*  13   25:iconst_m1       
	//*  14   26:istore          6
	//*  15   28:iconst_0        
	//*  16   29:istore_3        
	//*  17   30:iload           6
	//*  18   32:istore          5
	//*  19   34:iload_3         
	//*  20   35:iload           4
	//*  21   37:icmpge          56
	//*  22   40:aload_1         
	//*  23   41:aload_2         
	//*  24   42:getfield        #98  <Field Locale[] mList>
	//*  25   45:iload_3         
	//*  26   46:aaload          
	//*  27   47:invokevirtual   #102 <Method boolean Locale.equals(Object)>
	//*  28   50:ifeq            137
	//*  29   53:iload_3         
	//*  30   54:istore          5
	//*  31   56:iload           5
	//*  32   58:iconst_m1       
	//*  33   59:icmpne          144
	//*  34   62:iconst_1        
	//*  35   63:istore_3        
	//*  36   64:iload           4
	//*  37   66:iload_3         
	//*  38   67:iadd            
	//*  39   68:istore          6
	//*  40   70:iload           6
	//*  41   72:anewarray       Locale[]
	//*  42   75:astore          7
	//*  43   77:aload           7
	//*  44   79:iconst_0        
	//*  45   80:aload_1         
	//*  46   81:invokevirtual   #106 <Method Object Locale.clone()>
	//*  47   84:checkcast       #42  <Class Locale>
	//*  48   87:aastore         
	//*  49   88:iload           5
	//*  50   90:iconst_m1       
	//*  51   91:icmpne          149
	//*  52   94:iconst_0        
	//*  53   95:istore_3        
	//*  54   96:iload_3         
	//*  55   97:iload           4
	//*  56   99:icmpge          216
	//*  57  102:aload           7
	//*  58  104:iload_3         
	//*  59  105:iconst_1        
	//*  60  106:iadd            
	//*  61  107:aload_2         
	//*  62  108:getfield        #98  <Field Locale[] mList>
	//*  63  111:iload_3         
	//*  64  112:aaload          
	//*  65  113:invokevirtual   #106 <Method Object Locale.clone()>
	//*  66  116:checkcast       #42  <Class Locale>
	//*  67  119:aastore         
	//*  68  120:iload_3         
	//*  69  121:iconst_1        
	//*  70  122:iadd            
	//*  71  123:istore_3        
	//*  72  124:goto            96
				i1 = localelisthelper.mList.length;
	//   73  127:aload_2         
	//   74  128:getfield        #98  <Field Locale[] mList>
	//   75  131:arraylength     
	//   76  132:istore          4
			k1 = -1;
			i = 0;
label1:
			do
			{
label2:
				{
					j1 = k1;
					if(i < i1)
					{
						if(!locale.equals(((Object) (localelisthelper.mList[i]))))
							break label2;
						j1 = i;
					}
					if(j1 == -1)
						i = 1;
					else
	//*  77  134:goto            25
	//*  78  137:iload_3         
	//*  79  138:iconst_1        
	//*  80  139:iadd            
	//*  81  140:istore_3        
	//*  82  141:goto            30
						i = 0;
	//   83  144:iconst_0        
	//   84  145:istore_3        
					k1 = i1 + i;
					alocale = new Locale[k1];
					alocale[0] = (Locale)locale.clone();
					if(j1 != -1)
						break label1;
					for(i = 0; i < i1; i++)
						alocale[i + 1] = (Locale)localelisthelper.mList[i].clone();

					break label0;
	//   85  146:goto            64
				}
				i++;
			} while(true);
			for(int j = 0; j < j1; j++)
	//*  86  149:iconst_0        
	//*  87  150:istore_3        
	//*  88  151:iload_3         
	//*  89  152:iload           5
	//*  90  154:icmpge          182
				alocale[j + 1] = (Locale)localelisthelper.mList[j].clone();
	//   91  157:aload           7
	//   92  159:iload_3         
	//   93  160:iconst_1        
	//   94  161:iadd            
	//   95  162:aload_2         
	//   96  163:getfield        #98  <Field Locale[] mList>
	//   97  166:iload_3         
	//   98  167:aaload          
	//   99  168:invokevirtual   #106 <Method Object Locale.clone()>
	//  100  171:checkcast       #42  <Class Locale>
	//  101  174:aastore         

	//  102  175:iload_3         
	//  103  176:iconst_1        
	//  104  177:iadd            
	//  105  178:istore_3        
	//* 106  179:goto            151
			for(int k = j1 + 1; k < i1; k++)
	//* 107  182:iload           5
	//* 108  184:iconst_1        
	//* 109  185:iadd            
	//* 110  186:istore_3        
	//* 111  187:iload_3         
	//* 112  188:iload           4
	//* 113  190:icmpge          216
				alocale[k] = (Locale)localelisthelper.mList[k].clone();
	//  114  193:aload           7
	//  115  195:iload_3         
	//  116  196:aload_2         
	//  117  197:getfield        #98  <Field Locale[] mList>
	//  118  200:iload_3         
	//  119  201:aaload          
	//  120  202:invokevirtual   #106 <Method Object Locale.clone()>
	//  121  205:checkcast       #42  <Class Locale>
	//  122  208:aastore         

	//  123  209:iload_3         
	//  124  210:iconst_1        
	//  125  211:iadd            
	//  126  212:istore_3        
		}
	//* 127  213:goto            187
		locale = ((Locale) (new StringBuilder()));
	//  128  216:new             #108 <Class StringBuilder>
	//  129  219:dup             
	//  130  220:invokespecial   #109 <Method void StringBuilder()>
	//  131  223:astore_1        
		for(int l = 0; l < k1; l++)
	//* 132  224:iconst_0        
	//* 133  225:istore_3        
	//* 134  226:iload_3         
	//* 135  227:iload           6
	//* 136  229:icmpge          266
		{
			((StringBuilder) (locale)).append(LocaleHelper.toLanguageTag(alocale[l]));
	//  137  232:aload_1         
	//  138  233:aload           7
	//  139  235:iload_3         
	//  140  236:aaload          
	//  141  237:invokestatic    #113 <Method String LocaleHelper.toLanguageTag(Locale)>
	//  142  240:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//  143  243:pop             
			if(l < k1 - 1)
	//* 144  244:iload_3         
	//* 145  245:iload           6
	//* 146  247:iconst_1        
	//* 147  248:isub            
	//* 148  249:icmpge          259
				((StringBuilder) (locale)).append(',');
	//  149  252:aload_1         
	//  150  253:bipush          44
	//  151  255:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
	//  152  258:pop             
		}

	//  153  259:iload_3         
	//  154  260:iconst_1        
	//  155  261:iadd            
	//  156  262:istore_3        
	//* 157  263:goto            226
		mList = alocale;
	//  158  266:aload_0         
	//  159  267:aload           7
	//  160  269:putfield        #98  <Field Locale[] mList>
		mStringRepresentation = ((StringBuilder) (locale)).toString();
	//  161  272:aload_0         
	//  162  273:aload_1         
	//  163  274:invokevirtual   #124 <Method String StringBuilder.toString()>
	//  164  277:putfield        #126 <Field String mStringRepresentation>
	//  165  280:return          
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
	//    7   13:putfield        #98  <Field Locale[] mList>
			mStringRepresentation = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #130 <String "">
	//   10   19:putfield        #126 <Field String mStringRepresentation>
			return;
	//   11   22:return          
		}
		Locale alocale1[] = new Locale[alocale.length];
	//   12   23:aload_1         
	//   13   24:arraylength     
	//   14   25:anewarray       Locale[]
	//   15   28:astore_3        
		HashSet hashset = new HashSet();
	//   16   29:new             #132 <Class HashSet>
	//   17   32:dup             
	//   18   33:invokespecial   #133 <Method void HashSet()>
	//   19   36:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   20   38:new             #108 <Class StringBuilder>
	//   21   41:dup             
	//   22   42:invokespecial   #109 <Method void StringBuilder()>
	//   23   45:astore          5
		for(int i = 0; i < alocale.length; i++)
	//*  24   47:iconst_0        
	//*  25   48:istore_2        
	//*  26   49:iload_2         
	//*  27   50:aload_1         
	//*  28   51:arraylength     
	//*  29   52:icmpge          196
		{
			Locale locale = alocale[i];
	//   30   55:aload_1         
	//   31   56:iload_2         
	//   32   57:aaload          
	//   33   58:astore          6
			if(locale == null)
	//*  34   60:aload           6
	//*  35   62:ifnonnull       97
				throw new NullPointerException((new StringBuilder()).append("list[").append(i).append("] is null").toString());
	//   36   65:new             #91  <Class NullPointerException>
	//   37   68:dup             
	//   38   69:new             #108 <Class StringBuilder>
	//   39   72:dup             
	//   40   73:invokespecial   #109 <Method void StringBuilder()>
	//   41   76:ldc1            #135 <String "list[">
	//   42   78:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   43   81:iload_2         
	//   44   82:invokevirtual   #138 <Method StringBuilder StringBuilder.append(int)>
	//   45   85:ldc1            #140 <String "] is null">
	//   46   87:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   47   90:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   48   93:invokespecial   #96  <Method void NullPointerException(String)>
	//   49   96:athrow          
			if(hashset.contains(((Object) (locale))))
	//*  50   97:aload           4
	//*  51   99:aload           6
	//*  52  101:invokevirtual   #143 <Method boolean HashSet.contains(Object)>
	//*  53  104:ifeq            139
				throw new IllegalArgumentException((new StringBuilder()).append("list[").append(i).append("] is a repetition").toString());
	//   54  107:new             #145 <Class IllegalArgumentException>
	//   55  110:dup             
	//   56  111:new             #108 <Class StringBuilder>
	//   57  114:dup             
	//   58  115:invokespecial   #109 <Method void StringBuilder()>
	//   59  118:ldc1            #135 <String "list[">
	//   60  120:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   61  123:iload_2         
	//   62  124:invokevirtual   #138 <Method StringBuilder StringBuilder.append(int)>
	//   63  127:ldc1            #147 <String "] is a repetition">
	//   64  129:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   65  132:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   66  135:invokespecial   #148 <Method void IllegalArgumentException(String)>
	//   67  138:athrow          
			locale = (Locale)locale.clone();
	//   68  139:aload           6
	//   69  141:invokevirtual   #106 <Method Object Locale.clone()>
	//   70  144:checkcast       #42  <Class Locale>
	//   71  147:astore          6
			alocale1[i] = locale;
	//   72  149:aload_3         
	//   73  150:iload_2         
	//   74  151:aload           6
	//   75  153:aastore         
			stringbuilder.append(LocaleHelper.toLanguageTag(locale));
	//   76  154:aload           5
	//   77  156:aload           6
	//   78  158:invokestatic    #113 <Method String LocaleHelper.toLanguageTag(Locale)>
	//   79  161:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   80  164:pop             
			if(i < alocale.length - 1)
	//*  81  165:iload_2         
	//*  82  166:aload_1         
	//*  83  167:arraylength     
	//*  84  168:iconst_1        
	//*  85  169:isub            
	//*  86  170:icmpge          181
				stringbuilder.append(',');
	//   87  173:aload           5
	//   88  175:bipush          44
	//   89  177:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
	//   90  180:pop             
			hashset.add(((Object) (locale)));
	//   91  181:aload           4
	//   92  183:aload           6
	//   93  185:invokevirtual   #151 <Method boolean HashSet.add(Object)>
	//   94  188:pop             
		}

	//   95  189:iload_2         
	//   96  190:iconst_1        
	//   97  191:iadd            
	//   98  192:istore_2        
	//*  99  193:goto            49
		mList = alocale1;
	//  100  196:aload_0         
	//  101  197:aload_3         
	//  102  198:putfield        #98  <Field Locale[] mList>
		mStringRepresentation = stringbuilder.toString();
	//  103  201:aload_0         
	//  104  202:aload           5
	//  105  204:invokevirtual   #124 <Method String StringBuilder.toString()>
	//  106  207:putfield        #126 <Field String mStringRepresentation>
	//  107  210:return          
	}

	private Locale computeFirstMatch(Collection collection, boolean flag)
	{
		int i = computeFirstMatchIndex(collection, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #157 <Method int computeFirstMatchIndex(Collection, boolean)>
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
	//   11   15:getfield        #98  <Field Locale[] mList>
	//   12   18:iload_3         
	//   13   19:aaload          
	//   14   20:areturn         
	}

	private int computeFirstMatchIndex(Collection collection, boolean flag)
	{
		int j;
		if(mList.length == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field Locale[] mList>
	//*   2    4:arraylength     
	//*   3    5:iconst_1        
	//*   4    6:icmpne          15
		{
			j = 0;
	//    5    9:iconst_0        
	//    6   10:istore          4
		} else
	//*   7   12:iload           4
	//*   8   14:ireturn         
		{
			if(mList.length == 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #98  <Field Locale[] mList>
	//*  11   19:arraylength     
	//*  12   20:ifne            25
				return -1;
	//   13   23:iconst_m1       
	//   14   24:ireturn         
			j = 0x7fffffff;
	//   15   25:ldc1            #160 <Int 0x7fffffff>
	//   16   27:istore          4
			int i = j;
	//   17   29:iload           4
	//   18   31:istore_3        
			if(flag)
	//*  19   32:iload_2         
	//*  20   33:ifeq            65
			{
				int k = findFirstMatchIndex(EN_LATN);
	//   21   36:aload_0         
	//   22   37:getstatic       #75  <Field Locale EN_LATN>
	//   23   40:invokespecial   #164 <Method int findFirstMatchIndex(Locale)>
	//   24   43:istore          5
				if(k == 0)
	//*  25   45:iload           5
	//*  26   47:ifne            52
					return 0;
	//   27   50:iconst_0        
	//   28   51:ireturn         
				i = j;
	//   29   52:iload           4
	//   30   54:istore_3        
				if(k < 0x7fffffff)
	//*  31   55:iload           5
	//*  32   57:ldc1            #160 <Int 0x7fffffff>
	//*  33   59:icmpge          65
					i = k;
	//   34   62:iload           5
	//   35   64:istore_3        
			}
			collection = ((Collection) (collection.iterator()));
	//   36   65:aload_1         
	//   37   66:invokeinterface #170 <Method Iterator Collection.iterator()>
	//   38   71:astore_1        
			do
			{
				if(!((Iterator) (collection)).hasNext())
					break;
	//   39   72:aload_1         
	//   40   73:invokeinterface #176 <Method boolean Iterator.hasNext()>
	//   41   78:ifeq            118
				j = findFirstMatchIndex(LocaleHelper.forLanguageTag((String)((Iterator) (collection)).next()));
	//   42   81:aload_0         
	//   43   82:aload_1         
	//   44   83:invokeinterface #179 <Method Object Iterator.next()>
	//   45   88:checkcast       #181 <Class String>
	//   46   91:invokestatic    #73  <Method Locale LocaleHelper.forLanguageTag(String)>
	//   47   94:invokespecial   #164 <Method int findFirstMatchIndex(Locale)>
	//   48   97:istore          4
				if(j == 0)
	//*  49   99:iload           4
	//*  50  101:ifne            106
					return 0;
	//   51  104:iconst_0        
	//   52  105:ireturn         
				if(j < i)
	//*  53  106:iload           4
	//*  54  108:iload_3         
	//*  55  109:icmpge          72
					i = j;
	//   56  112:iload           4
	//   57  114:istore_3        
			} while(true);
	//   58  115:goto            72
			j = i;
	//   59  118:iload_3         
	//   60  119:istore          4
			if(i == 0x7fffffff)
	//*  61  121:iload_3         
	//*  62  122:ldc1            #160 <Int 0x7fffffff>
	//*  63  124:icmpne          12
				return 0;
	//   64  127:iconst_0        
	//   65  128:ireturn         
		}
		return j;
	}

	private int findFirstMatchIndex(Locale locale)
	{
		for(int i = 0; i < mList.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #98  <Field Locale[] mList>
	//*   5    7:arraylength     
	//*   6    8:icmpge          33
			if(matchScore(locale, mList[i]) > 0)
	//*   7   11:aload_1         
	//*   8   12:aload_0         
	//*   9   13:getfield        #98  <Field Locale[] mList>
	//*  10   16:iload_2         
	//*  11   17:aaload          
	//*  12   18:invokestatic    #186 <Method int matchScore(Locale, Locale)>
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
	//   21   33:ldc1            #160 <Int 0x7fffffff>
	//   22   35:ireturn         
	}

	static LocaleListHelper forLanguageTags(String s)
	{
		if(s == null || s.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #192 <Method boolean String.isEmpty()>
	//*   4    8:ifeq            15
			return getEmptyLocaleList();
	//    5   11:invokestatic    #196 <Method LocaleListHelper getEmptyLocaleList()>
	//    6   14:areturn         
		s = ((String) (s.split(",")));
	//    7   15:aload_0         
	//    8   16:ldc1            #198 <String ",">
	//    9   18:invokevirtual   #202 <Method String[] String.split(String)>
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
	//   26   41:invokestatic    #73  <Method Locale LocaleHelper.forLanguageTag(String)>
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
	//   36   57:invokespecial   #48  <Method void LocaleListHelper(Locale[])>
	//   37   60:areturn         
	}

	static LocaleListHelper getAdjustedDefault()
	{
		getDefault();
	//    0    0:invokestatic    #210 <Method LocaleListHelper getDefault()>
	//    1    3:pop             
		LocaleListHelper localelisthelper;
		synchronized(sLock)
	//*   2    4:getstatic       #79  <Field Object sLock>
	//*   3    7:astore_0        
	//*   4    8:aload_0         
	//*   5    9:monitorenter    
		{
			localelisthelper = sDefaultAdjustedLocaleList;
	//    6   10:getstatic       #85  <Field LocaleListHelper sDefaultAdjustedLocaleList>
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
	//    0    0:invokestatic    #213 <Method Locale Locale.getDefault()>
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
	//    7   11:getstatic       #87  <Field Locale sLastDefaultLocale>
	//    8   14:invokevirtual   #102 <Method boolean Locale.equals(Object)>
	//    9   17:ifne            72
				sLastDefaultLocale = ((Locale) (obj1));
	//   10   20:aload_1         
	//   11   21:putstatic       #87  <Field Locale sLastDefaultLocale>
				if(sDefaultLocaleList == null || !((Locale) (obj1)).equals(((Object) (sDefaultLocaleList.get(0)))))
					break label0;
	//   12   24:getstatic       #83  <Field LocaleListHelper sDefaultLocaleList>
	//   13   27:ifnull          52
	//   14   30:aload_1         
	//   15   31:getstatic       #83  <Field LocaleListHelper sDefaultLocaleList>
	//   16   34:iconst_0        
	//   17   35:invokevirtual   #217 <Method Locale get(int)>
	//   18   38:invokevirtual   #102 <Method boolean Locale.equals(Object)>
	//   19   41:ifeq            52
				obj1 = ((Object) (sDefaultLocaleList));
	//   20   44:getstatic       #83  <Field LocaleListHelper sDefaultLocaleList>
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
	//   29   57:getstatic       #81  <Field LocaleListHelper sLastExplicitlySetLocaleList>
	//   30   60:invokespecial   #219 <Method void LocaleListHelper(Locale, LocaleListHelper)>
	//   31   63:putstatic       #83  <Field LocaleListHelper sDefaultLocaleList>
		sDefaultAdjustedLocaleList = sDefaultLocaleList;
	//   32   66:getstatic       #83  <Field LocaleListHelper sDefaultLocaleList>
	//   33   69:putstatic       #85  <Field LocaleListHelper sDefaultAdjustedLocaleList>
		obj1 = ((Object) (sDefaultLocaleList));
	//   34   72:getstatic       #83  <Field LocaleListHelper sDefaultLocaleList>
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
	//*   7   14:invokevirtual   #192 <Method boolean String.isEmpty()>
	//*   8   17:ifne            22
				return ((String) (locale));
	//    9   20:aload_0         
	//   10   21:areturn         
			else
				return "";
	//   11   22:ldc1            #130 <String "">
	//   12   24:areturn         
		} else
		{
			return "";
	//   13   25:ldc1            #130 <String "">
	//   14   27:areturn         
		}
	}

	private static boolean isPseudoLocale(String s)
	{
		return "en-XA".equals(((Object) (s))) || "ar-XB".equals(((Object) (s)));
	//    0    0:ldc1            #24  <String "en-XA">
	//    1    2:aload_0         
	//    2    3:invokevirtual   #231 <Method boolean String.equals(Object)>
	//    3    6:ifne            18
	//    4    9:ldc1            #21  <String "ar-XB">
	//    5   11:aload_0         
	//    6   12:invokevirtual   #231 <Method boolean String.equals(Object)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private static boolean isPseudoLocale(Locale locale)
	{
		return LOCALE_EN_XA.equals(((Object) (locale))) || LOCALE_AR_XB.equals(((Object) (locale)));
	//    0    0:getstatic       #59  <Field Locale LOCALE_EN_XA>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #102 <Method boolean Locale.equals(Object)>
	//    3    7:ifne            20
	//    4   10:getstatic       #65  <Field Locale LOCALE_AR_XB>
	//    5   13:aload_0         
	//    6   14:invokevirtual   #102 <Method boolean Locale.equals(Object)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	static boolean isPseudoLocalesOnly(String as[])
	{
		if(as != null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
	//*   2    4:iconst_1        
	//*   3    5:ireturn         
		{
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
			int i = 0;
	//   13   17:iconst_0        
	//   14   18:istore_1        
			while(i < j) 
	//*  15   19:iload_1         
	//*  16   20:iload_2         
	//*  17   21:icmpge          4
			{
				String s = as[i];
	//   18   24:aload_0         
	//   19   25:iload_1         
	//   20   26:aaload          
	//   21   27:astore_3        
				if(!s.isEmpty() && !isPseudoLocale(s))
	//*  22   28:aload_3         
	//*  23   29:invokevirtual   #192 <Method boolean String.isEmpty()>
	//*  24   32:ifne            44
	//*  25   35:aload_3         
	//*  26   36:invokestatic    #236 <Method boolean isPseudoLocale(String)>
	//*  27   39:ifne            44
					return false;
	//   28   42:iconst_0        
	//   29   43:ireturn         
				i++;
	//   30   44:iload_1         
	//   31   45:iconst_1        
	//   32   46:iadd            
	//   33   47:istore_1        
			}
		}
		return true;
	//*  34   48:goto            19
	}

	private static int matchScore(Locale locale, Locale locale1)
	{
		boolean flag;
		boolean flag1;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		flag1 = false;
	//    2    2:iconst_0        
	//    3    3:istore          4
		if(!locale.equals(((Object) (locale1)))) goto _L2; else goto _L1
	//    4    5:aload_0         
	//    5    6:aload_1         
	//    6    7:invokevirtual   #102 <Method boolean Locale.equals(Object)>
	//    7   10:ifeq            17
_L1:
		int i = 1;
	//    8   13:iconst_1        
	//    9   14:istore_2        
_L4:
		return i;
	//   10   15:iload_2         
	//   11   16:ireturn         
_L2:
		i = ((int) (flag1));
	//   12   17:iload           4
	//   13   19:istore_2        
		if(!locale.getLanguage().equals(((Object) (locale1.getLanguage())))) goto _L4; else goto _L3
	//   14   20:aload_0         
	//   15   21:invokevirtual   #244 <Method String Locale.getLanguage()>
	//   16   24:aload_1         
	//   17   25:invokevirtual   #244 <Method String Locale.getLanguage()>
	//   18   28:invokevirtual   #231 <Method boolean String.equals(Object)>
	//   19   31:ifeq            15
_L3:
		i = ((int) (flag1));
	//   20   34:iload           4
	//   21   36:istore_2        
		if(isPseudoLocale(locale)) goto _L4; else goto _L5
	//   22   37:aload_0         
	//   23   38:invokestatic    #246 <Method boolean isPseudoLocale(Locale)>
	//   24   41:ifne            15
_L5:
		i = ((int) (flag1));
	//   25   44:iload           4
	//   26   46:istore_2        
		if(isPseudoLocale(locale1)) goto _L4; else goto _L6
	//   27   47:aload_1         
	//   28   48:invokestatic    #246 <Method boolean isPseudoLocale(Locale)>
	//   29   51:ifne            15
_L6:
		String s;
		s = getLikelyScript(locale);
	//   30   54:aload_0         
	//   31   55:invokestatic    #248 <Method String getLikelyScript(Locale)>
	//   32   58:astore          5
		if(!s.isEmpty())
			break MISSING_BLOCK_LABEL_96;
	//   33   60:aload           5
	//   34   62:invokevirtual   #192 <Method boolean String.isEmpty()>
	//   35   65:ifeq            96
		locale = ((Locale) (locale.getCountry()));
	//   36   68:aload_0         
	//   37   69:invokevirtual   #251 <Method String Locale.getCountry()>
	//   38   72:astore_0        
		if(((String) (locale)).isEmpty())
			break; /* Loop/switch isn't completed */
	//   39   73:aload_0         
	//   40   74:invokevirtual   #192 <Method boolean String.isEmpty()>
	//   41   77:ifne            94
		i = ((int) (flag1));
	//   42   80:iload           4
	//   43   82:istore_2        
		if(!((String) (locale)).equals(((Object) (locale1.getCountry())))) goto _L4; else goto _L7
	//   44   83:aload_0         
	//   45   84:aload_1         
	//   46   85:invokevirtual   #251 <Method String Locale.getCountry()>
	//   47   88:invokevirtual   #231 <Method boolean String.equals(Object)>
	//   48   91:ifeq            15
_L7:
		return 1;
	//   49   94:iconst_1        
	//   50   95:ireturn         
		int j;
		if(s.equals(((Object) (getLikelyScript(locale1)))))
	//*  51   96:aload           5
	//*  52   98:aload_1         
	//*  53   99:invokestatic    #248 <Method String getLikelyScript(Locale)>
	//*  54  102:invokevirtual   #231 <Method boolean String.equals(Object)>
	//*  55  105:ifeq            112
			j = ((int) (flag));
	//   56  108:iload_3         
	//   57  109:istore_2        
		else
	//*  58  110:iload_2         
	//*  59  111:ireturn         
			j = 0;
	//   60  112:iconst_0        
	//   61  113:istore_2        
		return j;
	//*  62  114:goto            110
	}

	static void setDefault(LocaleListHelper localelisthelper)
	{
		setDefault(localelisthelper, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #256 <Method void setDefault(LocaleListHelper, int)>
	//    3    5:return          
	}

	static void setDefault(LocaleListHelper localelisthelper, int i)
	{
		if(localelisthelper == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new NullPointerException("locales is null");
	//    2    4:new             #91  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc2            #258 <String "locales is null">
	//    5   11:invokespecial   #96  <Method void NullPointerException(String)>
	//    6   14:athrow          
		if(localelisthelper.isEmpty())
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #259 <Method boolean isEmpty()>
	//*   9   19:ifeq            33
			throw new IllegalArgumentException("locales is empty");
	//   10   22:new             #145 <Class IllegalArgumentException>
	//   11   25:dup             
	//   12   26:ldc2            #261 <String "locales is empty">
	//   13   29:invokespecial   #148 <Method void IllegalArgumentException(String)>
	//   14   32:athrow          
		Object obj = sLock;
	//   15   33:getstatic       #79  <Field Object sLock>
	//   16   36:astore_2        
		obj;
	//   17   37:aload_2         
		JVM INSTR monitorenter ;
	//   18   38:monitorenter    
		sLastDefaultLocale = localelisthelper.get(i);
	//   19   39:aload_0         
	//   20   40:iload_1         
	//   21   41:invokevirtual   #217 <Method Locale get(int)>
	//   22   44:putstatic       #87  <Field Locale sLastDefaultLocale>
		Locale.setDefault(sLastDefaultLocale);
	//   23   47:getstatic       #87  <Field Locale sLastDefaultLocale>
	//   24   50:invokestatic    #264 <Method void Locale.setDefault(Locale)>
		sLastExplicitlySetLocaleList = localelisthelper;
	//   25   53:aload_0         
	//   26   54:putstatic       #81  <Field LocaleListHelper sLastExplicitlySetLocaleList>
		sDefaultLocaleList = localelisthelper;
	//   27   57:aload_0         
	//   28   58:putstatic       #83  <Field LocaleListHelper sDefaultLocaleList>
		if(i != 0)
			break MISSING_BLOCK_LABEL_74;
	//   29   61:iload_1         
	//   30   62:ifne            74
		sDefaultAdjustedLocaleList = sDefaultLocaleList;
	//   31   65:getstatic       #83  <Field LocaleListHelper sDefaultLocaleList>
	//   32   68:putstatic       #85  <Field LocaleListHelper sDefaultAdjustedLocaleList>
_L2:
		obj;
	//   33   71:aload_2         
		JVM INSTR monitorexit ;
	//   34   72:monitorexit     
		return;
	//   35   73:return          
		sDefaultAdjustedLocaleList = new LocaleListHelper(sLastDefaultLocale, sDefaultLocaleList);
	//   36   74:new             #2   <Class LocaleListHelper>
	//   37   77:dup             
	//   38   78:getstatic       #87  <Field Locale sLastDefaultLocale>
	//   39   81:getstatic       #83  <Field LocaleListHelper sDefaultLocaleList>
	//   40   84:invokespecial   #219 <Method void LocaleListHelper(Locale, LocaleListHelper)>
	//   41   87:putstatic       #85  <Field LocaleListHelper sDefaultAdjustedLocaleList>
		if(true) goto _L2; else goto _L1
	//   42   90:goto            71
_L1:
		localelisthelper;
	//   43   93:astore_0        
		obj;
	//   44   94:aload_2         
		JVM INSTR monitorexit ;
	//   45   95:monitorexit     
		throw localelisthelper;
	//   46   96:aload_0         
	//   47   97:athrow          
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
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
	//   12   20:getfield        #98  <Field Locale[] mList>
	//   13   23:astore_1        
			if(mList.length != obj.length)
	//*  14   24:aload_0         
	//*  15   25:getfield        #98  <Field Locale[] mList>
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
			while(i < mList.length) 
	//*  24   38:iload_2         
	//*  25   39:aload_0         
	//*  26   40:getfield        #98  <Field Locale[] mList>
	//*  27   43:arraylength     
	//*  28   44:icmpge          5
			{
				if(!mList[i].equals(((Object) (obj[i]))))
	//*  29   47:aload_0         
	//*  30   48:getfield        #98  <Field Locale[] mList>
	//*  31   51:iload_2         
	//*  32   52:aaload          
	//*  33   53:aload_1         
	//*  34   54:iload_2         
	//*  35   55:aaload          
	//*  36   56:invokevirtual   #102 <Method boolean Locale.equals(Object)>
	//*  37   59:ifne            64
					return false;
	//   38   62:iconst_0        
	//   39   63:ireturn         
				i++;
	//   40   64:iload_2         
	//   41   65:iconst_1        
	//   42   66:iadd            
	//   43   67:istore_2        
			}
		}
		return true;
	//*  44   68:goto            38
	}

	Locale get(int i)
	{
		if(i >= 0 && i < mList.length)
	//*   0    0:iload_1         
	//*   1    1:iflt            20
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #98  <Field Locale[] mList>
	//*   5    9:arraylength     
	//*   6   10:icmpge          20
			return mList[i];
	//    7   13:aload_0         
	//    8   14:getfield        #98  <Field Locale[] mList>
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
	//    2    2:invokestatic    #272 <Method java.util.List Arrays.asList(Object[])>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #274 <Method Locale computeFirstMatch(Collection, boolean)>
	//    5    9:areturn         
	}

	int getFirstMatchIndex(String as[])
	{
		return computeFirstMatchIndex(((Collection) (Arrays.asList(((Object []) (as))))), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #272 <Method java.util.List Arrays.asList(Object[])>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #157 <Method int computeFirstMatchIndex(Collection, boolean)>
	//    5    9:ireturn         
	}

	int getFirstMatchIndexWithEnglishSupported(Collection collection)
	{
		return computeFirstMatchIndex(collection, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #157 <Method int computeFirstMatchIndex(Collection, boolean)>
	//    4    6:ireturn         
	}

	int getFirstMatchIndexWithEnglishSupported(String as[])
	{
		return getFirstMatchIndexWithEnglishSupported(((Collection) (Arrays.asList(((Object []) (as))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #272 <Method java.util.List Arrays.asList(Object[])>
	//    3    5:invokevirtual   #281 <Method int getFirstMatchIndexWithEnglishSupported(Collection)>
	//    4    8:ireturn         
	}

	Locale getFirstMatchWithEnglishSupported(String as[])
	{
		return computeFirstMatch(((Collection) (Arrays.asList(((Object []) (as))))), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #272 <Method java.util.List Arrays.asList(Object[])>
	//    3    5:iconst_1        
	//    4    6:invokespecial   #274 <Method Locale computeFirstMatch(Collection, boolean)>
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
	//*   6    6:getfield        #98  <Field Locale[] mList>
	//*   7    9:arraylength     
	//*   8   10:icmpge          35
			j = j * 31 + mList[i].hashCode();
	//    9   13:iload_2         
	//   10   14:bipush          31
	//   11   16:imul            
	//   12   17:aload_0         
	//   13   18:getfield        #98  <Field Locale[] mList>
	//   14   21:iload_1         
	//   15   22:aaload          
	//   16   23:invokevirtual   #286 <Method int Locale.hashCode()>
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
	//*   4    4:getfield        #98  <Field Locale[] mList>
	//*   5    7:arraylength     
	//*   6    8:icmpge          33
			if(mList[i].equals(((Object) (locale))))
	//*   7   11:aload_0         
	//*   8   12:getfield        #98  <Field Locale[] mList>
	//*   9   15:iload_2         
	//*  10   16:aaload          
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #102 <Method boolean Locale.equals(Object)>
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
	//    1    1:getfield        #98  <Field Locale[] mList>
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
	//    1    1:getfield        #98  <Field Locale[] mList>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	String toLanguageTags()
	{
		return mStringRepresentation;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field String mStringRepresentation>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #108 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #109 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("[");
	//    4    8:aload_2         
	//    5    9:ldc2            #293 <String "[">
	//    6   12:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		for(int i = 0; i < mList.length; i++)
	//*   8   16:iconst_0        
	//*   9   17:istore_1        
	//*  10   18:iload_1         
	//*  11   19:aload_0         
	//*  12   20:getfield        #98  <Field Locale[] mList>
	//*  13   23:arraylength     
	//*  14   24:icmpge          63
		{
			stringbuilder.append(((Object) (mList[i])));
	//   15   27:aload_2         
	//   16   28:aload_0         
	//   17   29:getfield        #98  <Field Locale[] mList>
	//   18   32:iload_1         
	//   19   33:aaload          
	//   20   34:invokevirtual   #296 <Method StringBuilder StringBuilder.append(Object)>
	//   21   37:pop             
			if(i < mList.length - 1)
	//*  22   38:iload_1         
	//*  23   39:aload_0         
	//*  24   40:getfield        #98  <Field Locale[] mList>
	//*  25   43:arraylength     
	//*  26   44:iconst_1        
	//*  27   45:isub            
	//*  28   46:icmpge          56
				stringbuilder.append(',');
	//   29   49:aload_2         
	//   30   50:bipush          44
	//   31   52:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
	//   32   55:pop             
		}

	//   33   56:iload_1         
	//   34   57:iconst_1        
	//   35   58:iadd            
	//   36   59:istore_1        
	//*  37   60:goto            18
		stringbuilder.append("]");
	//   38   63:aload_2         
	//   39   64:ldc2            #298 <String "]">
	//   40   67:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   41   70:pop             
		return stringbuilder.toString();
	//   42   71:aload_2         
	//   43   72:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   44   75:areturn         
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
	//   28   67:aconst_null     
	//   29   68:putstatic       #81  <Field LocaleListHelper sLastExplicitlySetLocaleList>
	//   30   71:aconst_null     
	//   31   72:putstatic       #83  <Field LocaleListHelper sDefaultLocaleList>
	//   32   75:aconst_null     
	//   33   76:putstatic       #85  <Field LocaleListHelper sDefaultAdjustedLocaleList>
	//   34   79:aconst_null     
	//   35   80:putstatic       #87  <Field Locale sLastDefaultLocale>
	//*  36   83:return          
	}
}
