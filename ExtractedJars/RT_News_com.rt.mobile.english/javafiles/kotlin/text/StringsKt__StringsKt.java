// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.text;

import java.util.*;
import kotlin.*;
import kotlin.collections.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.*;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

// Referenced classes of package kotlin.text:
//			StringsKt__StringsJVMKt, CharsKt, StringsKt, Regex, 
//			DelimitedRangesSequence

class StringsKt__StringsKt extends StringsKt__StringsJVMKt
{

	public StringsKt__StringsKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method void StringsKt__StringsJVMKt()>
	//    2    4:return          
	}

	public static final String commonPrefixWith(CharSequence charsequence, CharSequence charsequence1, boolean flag)
	{
		int j;
label0:
		{
			Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Intrinsics.checkParameterIsNotNull(((Object) (charsequence1)), "other");
	//    3    6:aload_1         
	//    4    7:ldc1            #146 <String "other">
	//    5    9:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			j = Math.min(charsequence.length(), charsequence1.length());
	//    6   12:aload_0         
	//    7   13:invokeinterface #151 <Method int CharSequence.length()>
	//    8   18:aload_1         
	//    9   19:invokeinterface #151 <Method int CharSequence.length()>
	//   10   24:invokestatic    #157 <Method int Math.min(int, int)>
	//   11   27:istore          4
			int i;
			for(i = 0; i < j && CharsKt.equals(charsequence.charAt(i), charsequence1.charAt(i), flag); i++);
	//   12   29:iconst_0        
	//   13   30:istore_3        
	//   14   31:iload_3         
	//   15   32:iload           4
	//   16   34:icmpge          65
	//   17   37:aload_0         
	//   18   38:iload_3         
	//   19   39:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//   20   44:aload_1         
	//   21   45:iload_3         
	//   22   46:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//   23   51:iload_2         
	//   24   52:invokestatic    #167 <Method boolean CharsKt.equals(char, char, boolean)>
	//   25   55:ifeq            65
	//   26   58:iload_3         
	//   27   59:iconst_1        
	//   28   60:iadd            
	//   29   61:istore_3        
	//*  30   62:goto            31
			int k = i - 1;
	//   31   65:iload_3         
	//   32   66:iconst_1        
	//   33   67:isub            
	//   34   68:istore          5
			if(!StringsKt.hasSurrogatePairAt(charsequence, k))
	//*  35   70:aload_0         
	//*  36   71:iload           5
	//*  37   73:invokestatic    #171 <Method boolean StringsKt.hasSurrogatePairAt(CharSequence, int)>
	//*  38   76:ifne            91
			{
				j = i;
	//   39   79:iload_3         
	//   40   80:istore          4
				if(!StringsKt.hasSurrogatePairAt(charsequence1, k))
					break label0;
	//   41   82:aload_1         
	//   42   83:iload           5
	//   43   85:invokestatic    #171 <Method boolean StringsKt.hasSurrogatePairAt(CharSequence, int)>
	//   44   88:ifeq            96
			}
			j = i - 1;
	//   45   91:iload_3         
	//   46   92:iconst_1        
	//   47   93:isub            
	//   48   94:istore          4
		}
		return ((Object) (charsequence.subSequence(0, j))).toString();
	//   49   96:aload_0         
	//   50   97:iconst_0        
	//   51   98:iload           4
	//   52  100:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   53  105:invokevirtual   #180 <Method String Object.toString()>
	//   54  108:areturn         
	}

	public static String commonPrefixWith$default(CharSequence charsequence, CharSequence charsequence1, boolean flag, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		return StringsKt.commonPrefixWith(charsequence, charsequence1, flag);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:iload_2         
	//    9   11:invokestatic    #184 <Method String StringsKt.commonPrefixWith(CharSequence, CharSequence, boolean)>
	//   10   14:areturn         
	}

	public static final String commonSuffixWith(CharSequence charsequence, CharSequence charsequence1, boolean flag)
	{
		int j;
		int k;
label0:
		{
			Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Intrinsics.checkParameterIsNotNull(((Object) (charsequence1)), "other");
	//    3    6:aload_1         
	//    4    7:ldc1            #146 <String "other">
	//    5    9:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			k = charsequence.length();
	//    6   12:aload_0         
	//    7   13:invokeinterface #151 <Method int CharSequence.length()>
	//    8   18:istore          5
			int l = charsequence1.length();
	//    9   20:aload_1         
	//   10   21:invokeinterface #151 <Method int CharSequence.length()>
	//   11   26:istore          6
			j = Math.min(k, l);
	//   12   28:iload           5
	//   13   30:iload           6
	//   14   32:invokestatic    #157 <Method int Math.min(int, int)>
	//   15   35:istore          4
			int i;
			for(i = 0; i < j && CharsKt.equals(charsequence.charAt(k - i - 1), charsequence1.charAt(l - i - 1), flag); i++);
	//   16   37:iconst_0        
	//   17   38:istore_3        
	//   18   39:iload_3         
	//   19   40:iload           4
	//   20   42:icmpge          83
	//   21   45:aload_0         
	//   22   46:iload           5
	//   23   48:iload_3         
	//   24   49:isub            
	//   25   50:iconst_1        
	//   26   51:isub            
	//   27   52:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//   28   57:aload_1         
	//   29   58:iload           6
	//   30   60:iload_3         
	//   31   61:isub            
	//   32   62:iconst_1        
	//   33   63:isub            
	//   34   64:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//   35   69:iload_2         
	//   36   70:invokestatic    #167 <Method boolean CharsKt.equals(char, char, boolean)>
	//   37   73:ifeq            83
	//   38   76:iload_3         
	//   39   77:iconst_1        
	//   40   78:iadd            
	//   41   79:istore_3        
	//*  42   80:goto            39
			if(!StringsKt.hasSurrogatePairAt(charsequence, k - i - 1))
	//*  43   83:aload_0         
	//*  44   84:iload           5
	//*  45   86:iload_3         
	//*  46   87:isub            
	//*  47   88:iconst_1        
	//*  48   89:isub            
	//*  49   90:invokestatic    #171 <Method boolean StringsKt.hasSurrogatePairAt(CharSequence, int)>
	//*  50   93:ifne            112
			{
				j = i;
	//   51   96:iload_3         
	//   52   97:istore          4
				if(!StringsKt.hasSurrogatePairAt(charsequence1, l - i - 1))
					break label0;
	//   53   99:aload_1         
	//   54  100:iload           6
	//   55  102:iload_3         
	//   56  103:isub            
	//   57  104:iconst_1        
	//   58  105:isub            
	//   59  106:invokestatic    #171 <Method boolean StringsKt.hasSurrogatePairAt(CharSequence, int)>
	//   60  109:ifeq            117
			}
			j = i - 1;
	//   61  112:iload_3         
	//   62  113:iconst_1        
	//   63  114:isub            
	//   64  115:istore          4
		}
		return ((Object) (charsequence.subSequence(k - j, k))).toString();
	//   65  117:aload_0         
	//   66  118:iload           5
	//   67  120:iload           4
	//   68  122:isub            
	//   69  123:iload           5
	//   70  125:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   71  130:invokevirtual   #180 <Method String Object.toString()>
	//   72  133:areturn         
	}

	public static String commonSuffixWith$default(CharSequence charsequence, CharSequence charsequence1, boolean flag, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		return StringsKt.commonSuffixWith(charsequence, charsequence1, flag);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:iload_2         
	//    9   11:invokestatic    #187 <Method String StringsKt.commonSuffixWith(CharSequence, CharSequence, boolean)>
	//   10   14:areturn         
	}

	public static final boolean contains(CharSequence charsequence, char c, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return StringsKt.indexOf$default(charsequence, c, 0, flag, 2, ((Object) (null))) >= 0;
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iconst_0        
	//    6    9:iload_2         
	//    7   10:iconst_2        
	//    8   11:aconst_null     
	//    9   12:invokestatic    #192 <Method int StringsKt.indexOf$default(CharSequence, char, int, boolean, int, Object)>
	//   10   15:iflt            20
	//   11   18:iconst_1        
	//   12   19:ireturn         
	//   13   20:iconst_0        
	//   14   21:ireturn         
	}

	public static final boolean contains(CharSequence charsequence, CharSequence charsequence1, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence1)), "other");
	//    3    6:aload_1         
	//    4    7:ldc1            #146 <String "other">
	//    5    9:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return (charsequence1 instanceof String) ? StringsKt.indexOf$default(charsequence, (String)charsequence1, 0, flag, 2, ((Object) (null))) < 0 : indexOf$StringsKt__StringsKt$default(charsequence, charsequence1, 0, charsequence.length(), flag, false, 16, ((Object) (null))) < 0;
	//    6   12:aload_1         
	//    7   13:instanceof      #195 <Class String>
	//    8   16:ifeq            36
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:checkcast       #195 <Class String>
	//   12   24:iconst_0        
	//   13   25:iload_2         
	//   14   26:iconst_2        
	//   15   27:aconst_null     
	//   16   28:invokestatic    #198 <Method int StringsKt.indexOf$default(CharSequence, String, int, boolean, int, Object)>
	//   17   31:iflt            59
	//   18   34:iconst_1        
	//   19   35:ireturn         
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:iconst_0        
	//   23   39:aload_0         
	//   24   40:invokeinterface #151 <Method int CharSequence.length()>
	//   25   45:iload_2         
	//   26   46:iconst_0        
	//   27   47:bipush          16
	//   28   49:aconst_null     
	//   29   50:invokestatic    #202 <Method int indexOf$StringsKt__StringsKt$default(CharSequence, CharSequence, int, int, boolean, boolean, int, Object)>
	//   30   53:iflt            59
	//   31   56:goto            34
	//   32   59:iconst_0        
	//   33   60:ireturn         
	}

	private static final boolean contains(CharSequence charsequence, Regex regex)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return regex.containsMatchIn(charsequence);
	//    3    6:aload_1         
	//    4    7:aload_0         
	//    5    8:invokevirtual   #210 <Method boolean Regex.containsMatchIn(CharSequence)>
	//    6   11:ireturn         
	}

	public static boolean contains$default(CharSequence charsequence, char c, boolean flag, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		return StringsKt.contains(charsequence, c, flag);
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:iload_2         
	//    9   11:invokestatic    #214 <Method boolean StringsKt.contains(CharSequence, char, boolean)>
	//   10   14:ireturn         
	}

	public static boolean contains$default(CharSequence charsequence, CharSequence charsequence1, boolean flag, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		return StringsKt.contains(charsequence, charsequence1, flag);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:iload_2         
	//    9   11:invokestatic    #217 <Method boolean StringsKt.contains(CharSequence, CharSequence, boolean)>
	//   10   14:ireturn         
	}

	public static final boolean endsWith(CharSequence charsequence, char c, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return charsequence.length() > 0 && CharsKt.equals(charsequence.charAt(StringsKt.getLastIndex(charsequence)), c, flag);
	//    3    6:aload_0         
	//    4    7:invokeinterface #151 <Method int CharSequence.length()>
	//    5   12:ifle            35
	//    6   15:aload_0         
	//    7   16:aload_0         
	//    8   17:invokestatic    #219 <Method int StringsKt.getLastIndex(CharSequence)>
	//    9   20:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//   10   25:iload_1         
	//   11   26:iload_2         
	//   12   27:invokestatic    #167 <Method boolean CharsKt.equals(char, char, boolean)>
	//   13   30:ifeq            35
	//   14   33:iconst_1        
	//   15   34:ireturn         
	//   16   35:iconst_0        
	//   17   36:ireturn         
	}

	public static final boolean endsWith(CharSequence charsequence, CharSequence charsequence1, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence1)), "suffix");
	//    3    6:aload_1         
	//    4    7:ldc1            #220 <String "suffix">
	//    5    9:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!flag && (charsequence instanceof String) && (charsequence1 instanceof String))
	//*   6   12:iload_2         
	//*   7   13:ifne            45
	//*   8   16:aload_0         
	//*   9   17:instanceof      #195 <Class String>
	//*  10   20:ifeq            45
	//*  11   23:aload_1         
	//*  12   24:instanceof      #195 <Class String>
	//*  13   27:ifeq            45
			return StringsKt.endsWith$default((String)charsequence, (String)charsequence1, false, 2, ((Object) (null)));
	//   14   30:aload_0         
	//   15   31:checkcast       #195 <Class String>
	//   16   34:aload_1         
	//   17   35:checkcast       #195 <Class String>
	//   18   38:iconst_0        
	//   19   39:iconst_2        
	//   20   40:aconst_null     
	//   21   41:invokestatic    #224 <Method boolean StringsKt.endsWith$default(String, String, boolean, int, Object)>
	//   22   44:ireturn         
		else
			return StringsKt.regionMatchesImpl(charsequence, charsequence.length() - charsequence1.length(), charsequence1, 0, charsequence1.length(), flag);
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:invokeinterface #151 <Method int CharSequence.length()>
	//   26   52:aload_1         
	//   27   53:invokeinterface #151 <Method int CharSequence.length()>
	//   28   58:isub            
	//   29   59:aload_1         
	//   30   60:iconst_0        
	//   31   61:aload_1         
	//   32   62:invokeinterface #151 <Method int CharSequence.length()>
	//   33   67:iload_2         
	//   34   68:invokestatic    #227 <Method boolean StringsKt.regionMatchesImpl(CharSequence, int, CharSequence, int, int, boolean)>
	//   35   71:ireturn         
	}

	public static boolean endsWith$default(CharSequence charsequence, char c, boolean flag, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		return StringsKt.endsWith(charsequence, c, flag);
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:iload_2         
	//    9   11:invokestatic    #229 <Method boolean StringsKt.endsWith(CharSequence, char, boolean)>
	//   10   14:ireturn         
	}

	public static boolean endsWith$default(CharSequence charsequence, CharSequence charsequence1, boolean flag, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		return StringsKt.endsWith(charsequence, charsequence1, flag);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:iload_2         
	//    9   11:invokestatic    #231 <Method boolean StringsKt.endsWith(CharSequence, CharSequence, boolean)>
	//   10   14:ireturn         
	}

	public static final Pair findAnyOf(CharSequence charsequence, Collection collection, int i, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "strings");
	//    3    6:aload_1         
	//    4    7:ldc1            #233 <String "strings">
	//    5    9:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return findAnyOf$StringsKt__StringsKt(charsequence, collection, i, flag, false);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:iload_3         
	//   10   16:iconst_0        
	//   11   17:invokestatic    #134 <Method Pair findAnyOf$StringsKt__StringsKt(CharSequence, Collection, int, boolean, boolean)>
	//   12   20:areturn         
	}

	private static final Pair findAnyOf$StringsKt__StringsKt(CharSequence charsequence, Collection collection, int i, boolean flag, boolean flag1)
	{
		if(!flag && collection.size() == 1)
	//*   0    0:iload_3         
	//*   1    1:ifne            68
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #240 <Method int Collection.size()>
	//*   4   10:iconst_1        
	//*   5   11:icmpne          68
		{
			collection = ((Collection) ((String)CollectionsKt.single((Iterable)collection)));
	//    6   14:aload_1         
	//    7   15:checkcast       #242 <Class Iterable>
	//    8   18:invokestatic    #248 <Method Object CollectionsKt.single(Iterable)>
	//    9   21:checkcast       #195 <Class String>
	//   10   24:astore_1        
			if(!flag1)
	//*  11   25:iload           4
	//*  12   27:ifne            43
				i = StringsKt.indexOf$default(charsequence, ((String) (collection)), i, false, 4, ((Object) (null)));
	//   13   30:aload_0         
	//   14   31:aload_1         
	//   15   32:iload_2         
	//   16   33:iconst_0        
	//   17   34:iconst_4        
	//   18   35:aconst_null     
	//   19   36:invokestatic    #198 <Method int StringsKt.indexOf$default(CharSequence, String, int, boolean, int, Object)>
	//   20   39:istore_2        
			else
	//*  21   40:goto            53
				i = StringsKt.lastIndexOf$default(charsequence, ((String) (collection)), i, false, 4, ((Object) (null)));
	//   22   43:aload_0         
	//   23   44:aload_1         
	//   24   45:iload_2         
	//   25   46:iconst_0        
	//   26   47:iconst_4        
	//   27   48:aconst_null     
	//   28   49:invokestatic    #251 <Method int StringsKt.lastIndexOf$default(CharSequence, String, int, boolean, int, Object)>
	//   29   52:istore_2        
			if(i < 0)
	//*  30   53:iload_2         
	//*  31   54:ifge            59
				return null;
	//   32   57:aconst_null     
	//   33   58:areturn         
			else
				return TuplesKt.to(((Object) (Integer.valueOf(i))), ((Object) (collection)));
	//   34   59:iload_2         
	//   35   60:invokestatic    #257 <Method Integer Integer.valueOf(int)>
	//   36   63:aload_1         
	//   37   64:invokestatic    #263 <Method Pair TuplesKt.to(Object, Object)>
	//   38   67:areturn         
		}
		Object obj;
		if(!flag1)
	//*  39   68:iload           4
	//*  40   70:ifne            99
			obj = ((Object) ((IntProgression)new IntRange(RangesKt.coerceAtLeast(i, 0), charsequence.length())));
	//   41   73:new             #265 <Class IntRange>
	//   42   76:dup             
	//   43   77:iload_2         
	//   44   78:iconst_0        
	//   45   79:invokestatic    #270 <Method int RangesKt.coerceAtLeast(int, int)>
	//   46   82:aload_0         
	//   47   83:invokeinterface #151 <Method int CharSequence.length()>
	//   48   88:invokespecial   #273 <Method void IntRange(int, int)>
	//   49   91:checkcast       #275 <Class IntProgression>
	//   50   94:astore          7
		else
	//*  51   96:goto            113
			obj = ((Object) (RangesKt.downTo(RangesKt.coerceAtMost(i, StringsKt.getLastIndex(charsequence)), 0)));
	//   52   99:iload_2         
	//   53  100:aload_0         
	//   54  101:invokestatic    #219 <Method int StringsKt.getLastIndex(CharSequence)>
	//   55  104:invokestatic    #278 <Method int RangesKt.coerceAtMost(int, int)>
	//   56  107:iconst_0        
	//   57  108:invokestatic    #282 <Method IntProgression RangesKt.downTo(int, int)>
	//   58  111:astore          7
		if(charsequence instanceof String)
	//*  59  113:aload_0         
	//*  60  114:instanceof      #195 <Class String>
	//*  61  117:ifeq            259
		{
			i = ((IntProgression) (obj)).getFirst();
	//   62  120:aload           7
	//   63  122:invokevirtual   #285 <Method int IntProgression.getFirst()>
	//   64  125:istore_2        
			int j = ((IntProgression) (obj)).getLast();
	//   65  126:aload           7
	//   66  128:invokevirtual   #288 <Method int IntProgression.getLast()>
	//   67  131:istore          5
			int l = ((IntProgression) (obj)).getStep();
	//   68  133:aload           7
	//   69  135:invokevirtual   #291 <Method int IntProgression.getStep()>
	//   70  138:istore          6
			if(l <= 0 ? i >= j : i <= j)
	//*  71  140:iload           6
	//*  72  142:ifle            154
	//*  73  145:iload_2         
	//*  74  146:iload           5
	//*  75  148:icmpgt          398
	//*  76  151:goto            160
	//*  77  154:iload_2         
	//*  78  155:iload           5
	//*  79  157:icmplt          398
				do
				{
label0:
					{
						for(Iterator iterator1 = ((Iterable)collection).iterator(); iterator1.hasNext();)
	//*  80  160:aload_1         
	//*  81  161:checkcast       #242 <Class Iterable>
	//*  82  164:invokeinterface #294 <Method Iterator Iterable.iterator()>
	//*  83  169:astore          8
	//*  84  171:aload           8
	//*  85  173:invokeinterface #300 <Method boolean Iterator.hasNext()>
	//*  86  178:ifeq            220
						{
							obj = iterator1.next();
	//   87  181:aload           8
	//   88  183:invokeinterface #304 <Method Object Iterator.next()>
	//   89  188:astore          7
							String s = (String)obj;
	//   90  190:aload           7
	//   91  192:checkcast       #195 <Class String>
	//   92  195:astore          9
							if(StringsKt.regionMatches(s, 0, (String)charsequence, i, s.length(), flag))
	//*  93  197:aload           9
	//*  94  199:iconst_0        
	//*  95  200:aload_0         
	//*  96  201:checkcast       #195 <Class String>
	//*  97  204:iload_2         
	//*  98  205:aload           9
	//*  99  207:invokevirtual   #305 <Method int String.length()>
	//* 100  210:iload_3         
	//* 101  211:invokestatic    #309 <Method boolean StringsKt.regionMatches(String, int, String, int, int, boolean)>
	//* 102  214:ifeq            171
								break label0;
	//  103  217:goto            223
						}

						obj = null;
	//  104  220:aconst_null     
	//  105  221:astore          7
					}
					obj = ((Object) ((String)obj));
	//  106  223:aload           7
	//  107  225:checkcast       #195 <Class String>
	//  108  228:astore          7
					if(obj != null)
	//* 109  230:aload           7
	//* 110  232:ifnull          245
						return TuplesKt.to(((Object) (Integer.valueOf(i))), obj);
	//  111  235:iload_2         
	//  112  236:invokestatic    #257 <Method Integer Integer.valueOf(int)>
	//  113  239:aload           7
	//  114  241:invokestatic    #263 <Method Pair TuplesKt.to(Object, Object)>
	//  115  244:areturn         
					if(i == j)
						break;
	//  116  245:iload_2         
	//  117  246:iload           5
	//  118  248:icmpeq          398
					i += l;
	//  119  251:iload_2         
	//  120  252:iload           6
	//  121  254:iadd            
	//  122  255:istore_2        
				} while(true);
	//  123  256:goto            160
		} else
		{
			i = ((IntProgression) (obj)).getFirst();
	//  124  259:aload           7
	//  125  261:invokevirtual   #285 <Method int IntProgression.getFirst()>
	//  126  264:istore_2        
			int k = ((IntProgression) (obj)).getLast();
	//  127  265:aload           7
	//  128  267:invokevirtual   #288 <Method int IntProgression.getLast()>
	//  129  270:istore          5
			int i1 = ((IntProgression) (obj)).getStep();
	//  130  272:aload           7
	//  131  274:invokevirtual   #291 <Method int IntProgression.getStep()>
	//  132  277:istore          6
			if(i1 <= 0 ? i >= k : i <= k)
	//* 133  279:iload           6
	//* 134  281:ifle            293
	//* 135  284:iload_2         
	//* 136  285:iload           5
	//* 137  287:icmpgt          398
	//* 138  290:goto            299
	//* 139  293:iload_2         
	//* 140  294:iload           5
	//* 141  296:icmplt          398
				do
				{
					Object obj1;
label1:
					{
						for(Iterator iterator2 = ((Iterable)collection).iterator(); iterator2.hasNext();)
	//* 142  299:aload_1         
	//* 143  300:checkcast       #242 <Class Iterable>
	//* 144  303:invokeinterface #294 <Method Iterator Iterable.iterator()>
	//* 145  308:astore          8
	//* 146  310:aload           8
	//* 147  312:invokeinterface #300 <Method boolean Iterator.hasNext()>
	//* 148  317:ifeq            359
						{
							obj1 = iterator2.next();
	//  149  320:aload           8
	//  150  322:invokeinterface #304 <Method Object Iterator.next()>
	//  151  327:astore          7
							String s1 = (String)obj1;
	//  152  329:aload           7
	//  153  331:checkcast       #195 <Class String>
	//  154  334:astore          9
							if(StringsKt.regionMatchesImpl((CharSequence)s1, 0, charsequence, i, s1.length(), flag))
	//* 155  336:aload           9
	//* 156  338:checkcast       #148 <Class CharSequence>
	//* 157  341:iconst_0        
	//* 158  342:aload_0         
	//* 159  343:iload_2         
	//* 160  344:aload           9
	//* 161  346:invokevirtual   #305 <Method int String.length()>
	//* 162  349:iload_3         
	//* 163  350:invokestatic    #227 <Method boolean StringsKt.regionMatchesImpl(CharSequence, int, CharSequence, int, int, boolean)>
	//* 164  353:ifeq            310
								break label1;
	//  165  356:goto            362
						}

						obj1 = null;
	//  166  359:aconst_null     
	//  167  360:astore          7
					}
					obj1 = ((Object) ((String)obj1));
	//  168  362:aload           7
	//  169  364:checkcast       #195 <Class String>
	//  170  367:astore          7
					if(obj1 != null)
	//* 171  369:aload           7
	//* 172  371:ifnull          384
						return TuplesKt.to(((Object) (Integer.valueOf(i))), obj1);
	//  173  374:iload_2         
	//  174  375:invokestatic    #257 <Method Integer Integer.valueOf(int)>
	//  175  378:aload           7
	//  176  380:invokestatic    #263 <Method Pair TuplesKt.to(Object, Object)>
	//  177  383:areturn         
					if(i == k)
						break;
	//  178  384:iload_2         
	//  179  385:iload           5
	//  180  387:icmpeq          398
					i += i1;
	//  181  390:iload_2         
	//  182  391:iload           6
	//  183  393:iadd            
	//  184  394:istore_2        
				} while(true);
	//  185  395:goto            299
		}
		return null;
	//  186  398:aconst_null     
	//  187  399:areturn         
	}

	public static Pair findAnyOf$default(CharSequence charsequence, Collection collection, int i, boolean flag, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		if((j & 4) != 0)
	//*   6    9:iload           4
	//*   7   11:iconst_4        
	//*   8   12:iand            
	//*   9   13:ifeq            18
			flag = false;
	//   10   16:iconst_0        
	//   11   17:istore_3        
		return StringsKt.findAnyOf(charsequence, collection, i, flag);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:iload_2         
	//   15   21:iload_3         
	//   16   22:invokestatic    #314 <Method Pair StringsKt.findAnyOf(CharSequence, Collection, int, boolean)>
	//   17   25:areturn         
	}

	public static final Pair findLastAnyOf(CharSequence charsequence, Collection collection, int i, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "strings");
	//    3    6:aload_1         
	//    4    7:ldc1            #233 <String "strings">
	//    5    9:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return findAnyOf$StringsKt__StringsKt(charsequence, collection, i, flag, true);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:iload_3         
	//   10   16:iconst_1        
	//   11   17:invokestatic    #134 <Method Pair findAnyOf$StringsKt__StringsKt(CharSequence, Collection, int, boolean, boolean)>
	//   12   20:areturn         
	}

	public static Pair findLastAnyOf$default(CharSequence charsequence, Collection collection, int i, boolean flag, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            12
			i = StringsKt.getLastIndex(charsequence);
	//    4    7:aload_0         
	//    5    8:invokestatic    #219 <Method int StringsKt.getLastIndex(CharSequence)>
	//    6   11:istore_2        
		if((j & 4) != 0)
	//*   7   12:iload           4
	//*   8   14:iconst_4        
	//*   9   15:iand            
	//*  10   16:ifeq            21
			flag = false;
	//   11   19:iconst_0        
	//   12   20:istore_3        
		return StringsKt.findLastAnyOf(charsequence, collection, i, flag);
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:iload_2         
	//   16   24:iload_3         
	//   17   25:invokestatic    #317 <Method Pair StringsKt.findLastAnyOf(CharSequence, Collection, int, boolean)>
	//   18   28:areturn         
	}

	public static final IntRange getIndices(CharSequence charsequence)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return new IntRange(0, charsequence.length() - 1);
	//    3    6:new             #265 <Class IntRange>
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:invokeinterface #151 <Method int CharSequence.length()>
	//    8   17:iconst_1        
	//    9   18:isub            
	//   10   19:invokespecial   #273 <Method void IntRange(int, int)>
	//   11   22:areturn         
	}

	public static final int getLastIndex(CharSequence charsequence)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return charsequence.length() - 1;
	//    3    6:aload_0         
	//    4    7:invokeinterface #151 <Method int CharSequence.length()>
	//    5   12:iconst_1        
	//    6   13:isub            
	//    7   14:ireturn         
	}

	public static final boolean hasSurrogatePairAt(CharSequence charsequence, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int j = charsequence.length();
	//    3    6:aload_0         
	//    4    7:invokeinterface #151 <Method int CharSequence.length()>
	//    5   12:istore_2        
		return i >= 0 && j - 2 >= i && Character.isHighSurrogate(charsequence.charAt(i)) && Character.isLowSurrogate(charsequence.charAt(i + 1));
	//    6   13:iload_1         
	//    7   14:ifge            20
	//    8   17:goto            57
	//    9   20:iload_2         
	//   10   21:iconst_2        
	//   11   22:isub            
	//   12   23:iload_1         
	//   13   24:icmplt          57
	//   14   27:aload_0         
	//   15   28:iload_1         
	//   16   29:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//   17   34:invokestatic    #323 <Method boolean Character.isHighSurrogate(char)>
	//   18   37:ifeq            57
	//   19   40:aload_0         
	//   20   41:iload_1         
	//   21   42:iconst_1        
	//   22   43:iadd            
	//   23   44:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//   24   49:invokestatic    #326 <Method boolean Character.isLowSurrogate(char)>
	//   25   52:ifeq            57
	//   26   55:iconst_1        
	//   27   56:ireturn         
	//   28   57:iconst_0        
	//   29   58:ireturn         
	}

	private static final Object ifBlank(CharSequence charsequence, Function0 function0)
	{
		Object obj = ((Object) (charsequence));
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(StringsKt.isBlank(charsequence))
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #332 <Method boolean StringsKt.isBlank(CharSequence)>
	//*   4    6:ifeq            16
			obj = function0.invoke();
	//    5    9:aload_1         
	//    6   10:invokeinterface #337 <Method Object Function0.invoke()>
	//    7   15:astore_2        
		return obj;
	//    8   16:aload_2         
	//    9   17:areturn         
	}

	private static final Object ifEmpty(CharSequence charsequence, Function0 function0)
	{
		boolean flag;
		if(charsequence.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #151 <Method int CharSequence.length()>
	//*   2    6:ifne            14
			flag = true;
	//    3    9:iconst_1        
	//    4   10:istore_2        
		else
	//*   5   11:goto            16
			flag = false;
	//    6   14:iconst_0        
	//    7   15:istore_2        
		if(flag)
	//*   8   16:iload_2         
	//*   9   17:ifeq            27
			charsequence = ((CharSequence) (function0.invoke()));
	//   10   20:aload_1         
	//   11   21:invokeinterface #337 <Method Object Function0.invoke()>
	//   12   26:astore_0        
		return ((Object) (charsequence));
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public static final int indexOf(CharSequence charsequence, char c, int i, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!flag && (charsequence instanceof String))
	//*   3    6:iload_3         
	//*   4    7:ifne            30
	//*   5   10:aload_0         
	//*   6   11:instanceof      #195 <Class String>
	//*   7   14:ifne            20
	//*   8   17:goto            30
			return ((String)charsequence).indexOf(((int) (c)), i);
	//    9   20:aload_0         
	//   10   21:checkcast       #195 <Class String>
	//   11   24:iload_1         
	//   12   25:iload_2         
	//   13   26:invokevirtual   #341 <Method int String.indexOf(int, int)>
	//   14   29:ireturn         
		else
			return StringsKt.indexOfAny(charsequence, new char[] {
				c
			}, i, flag);
	//   15   30:aload_0         
	//   16   31:iconst_1        
	//   17   32:newarray        char[]
	//   18   34:dup             
	//   19   35:iconst_0        
	//   20   36:iload_1         
	//   21   37:castore         
	//   22   38:iload_2         
	//   23   39:iload_3         
	//   24   40:invokestatic    #344 <Method int StringsKt.indexOfAny(CharSequence, char[], int, boolean)>
	//   25   43:ireturn         
	}

	public static final int indexOf(CharSequence charsequence, String s, int i, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "string");
	//    3    6:aload_1         
	//    4    7:ldc2            #346 <String "string">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!flag && (charsequence instanceof String))
	//*   6   13:iload_3         
	//*   7   14:ifne            37
	//*   8   17:aload_0         
	//*   9   18:instanceof      #195 <Class String>
	//*  10   21:ifne            27
	//*  11   24:goto            37
			return ((String)charsequence).indexOf(s, i);
	//   12   27:aload_0         
	//   13   28:checkcast       #195 <Class String>
	//   14   31:aload_1         
	//   15   32:iload_2         
	//   16   33:invokevirtual   #349 <Method int String.indexOf(String, int)>
	//   17   36:ireturn         
		else
			return indexOf$StringsKt__StringsKt$default(charsequence, (CharSequence)s, i, charsequence.length(), flag, false, 16, ((Object) (null)));
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:checkcast       #148 <Class CharSequence>
	//   21   42:iload_2         
	//   22   43:aload_0         
	//   23   44:invokeinterface #151 <Method int CharSequence.length()>
	//   24   49:iload_3         
	//   25   50:iconst_0        
	//   26   51:bipush          16
	//   27   53:aconst_null     
	//   28   54:invokestatic    #202 <Method int indexOf$StringsKt__StringsKt$default(CharSequence, CharSequence, int, int, boolean, boolean, int, Object)>
	//   29   57:ireturn         
	}

	private static final int indexOf$StringsKt__StringsKt(CharSequence charsequence, CharSequence charsequence1, int i, int j, boolean flag, boolean flag1)
	{
		IntProgression intprogression;
		if(!flag1)
	//*   0    0:iload           5
	//*   1    2:ifne            35
			intprogression = (IntProgression)new IntRange(RangesKt.coerceAtLeast(i, 0), RangesKt.coerceAtMost(j, charsequence.length()));
	//    2    5:new             #265 <Class IntRange>
	//    3    8:dup             
	//    4    9:iload_2         
	//    5   10:iconst_0        
	//    6   11:invokestatic    #270 <Method int RangesKt.coerceAtLeast(int, int)>
	//    7   14:iload_3         
	//    8   15:aload_0         
	//    9   16:invokeinterface #151 <Method int CharSequence.length()>
	//   10   21:invokestatic    #278 <Method int RangesKt.coerceAtMost(int, int)>
	//   11   24:invokespecial   #273 <Method void IntRange(int, int)>
	//   12   27:checkcast       #275 <Class IntProgression>
	//   13   30:astore          7
		else
	//*  14   32:goto            53
			intprogression = RangesKt.downTo(RangesKt.coerceAtMost(i, StringsKt.getLastIndex(charsequence)), RangesKt.coerceAtLeast(j, 0));
	//   15   35:iload_2         
	//   16   36:aload_0         
	//   17   37:invokestatic    #219 <Method int StringsKt.getLastIndex(CharSequence)>
	//   18   40:invokestatic    #278 <Method int RangesKt.coerceAtMost(int, int)>
	//   19   43:iload_3         
	//   20   44:iconst_0        
	//   21   45:invokestatic    #270 <Method int RangesKt.coerceAtLeast(int, int)>
	//   22   48:invokestatic    #282 <Method IntProgression RangesKt.downTo(int, int)>
	//   23   51:astore          7
		if((charsequence instanceof String) && (charsequence1 instanceof String))
	//*  24   53:aload_0         
	//*  25   54:instanceof      #195 <Class String>
	//*  26   57:ifeq            143
	//*  27   60:aload_1         
	//*  28   61:instanceof      #195 <Class String>
	//*  29   64:ifeq            143
		{
			i = intprogression.getFirst();
	//   30   67:aload           7
	//   31   69:invokevirtual   #285 <Method int IntProgression.getFirst()>
	//   32   72:istore_2        
			j = intprogression.getLast();
	//   33   73:aload           7
	//   34   75:invokevirtual   #288 <Method int IntProgression.getLast()>
	//   35   78:istore_3        
			int k = intprogression.getStep();
	//   36   79:aload           7
	//   37   81:invokevirtual   #291 <Method int IntProgression.getStep()>
	//   38   84:istore          6
			if(k <= 0 ? i >= j : i <= j)
	//*  39   86:iload           6
	//*  40   88:ifle            99
	//*  41   91:iload_2         
	//*  42   92:iload_3         
	//*  43   93:icmpgt          213
	//*  44   96:goto            104
	//*  45   99:iload_2         
	//*  46  100:iload_3         
	//*  47  101:icmplt          213
				do
				{
					if(StringsKt.regionMatches((String)charsequence1, 0, (String)charsequence, i, charsequence1.length(), flag))
	//*  48  104:aload_1         
	//*  49  105:checkcast       #195 <Class String>
	//*  50  108:iconst_0        
	//*  51  109:aload_0         
	//*  52  110:checkcast       #195 <Class String>
	//*  53  113:iload_2         
	//*  54  114:aload_1         
	//*  55  115:invokeinterface #151 <Method int CharSequence.length()>
	//*  56  120:iload           4
	//*  57  122:invokestatic    #309 <Method boolean StringsKt.regionMatches(String, int, String, int, int, boolean)>
	//*  58  125:ifeq            130
						return i;
	//   59  128:iload_2         
	//   60  129:ireturn         
					if(i == j)
						break;
	//   61  130:iload_2         
	//   62  131:iload_3         
	//   63  132:icmpeq          213
					i += k;
	//   64  135:iload_2         
	//   65  136:iload           6
	//   66  138:iadd            
	//   67  139:istore_2        
				} while(true);
	//   68  140:goto            104
		} else
		{
			i = intprogression.getFirst();
	//   69  143:aload           7
	//   70  145:invokevirtual   #285 <Method int IntProgression.getFirst()>
	//   71  148:istore_2        
			j = intprogression.getLast();
	//   72  149:aload           7
	//   73  151:invokevirtual   #288 <Method int IntProgression.getLast()>
	//   74  154:istore_3        
			int l = intprogression.getStep();
	//   75  155:aload           7
	//   76  157:invokevirtual   #291 <Method int IntProgression.getStep()>
	//   77  160:istore          6
			if(l <= 0 ? i >= j : i <= j)
	//*  78  162:iload           6
	//*  79  164:ifle            175
	//*  80  167:iload_2         
	//*  81  168:iload_3         
	//*  82  169:icmpgt          213
	//*  83  172:goto            180
	//*  84  175:iload_2         
	//*  85  176:iload_3         
	//*  86  177:icmplt          213
				do
				{
					if(StringsKt.regionMatchesImpl(charsequence1, 0, charsequence, i, charsequence1.length(), flag))
	//*  87  180:aload_1         
	//*  88  181:iconst_0        
	//*  89  182:aload_0         
	//*  90  183:iload_2         
	//*  91  184:aload_1         
	//*  92  185:invokeinterface #151 <Method int CharSequence.length()>
	//*  93  190:iload           4
	//*  94  192:invokestatic    #227 <Method boolean StringsKt.regionMatchesImpl(CharSequence, int, CharSequence, int, int, boolean)>
	//*  95  195:ifeq            200
						return i;
	//   96  198:iload_2         
	//   97  199:ireturn         
					if(i == j)
						break;
	//   98  200:iload_2         
	//   99  201:iload_3         
	//  100  202:icmpeq          213
					i += l;
	//  101  205:iload_2         
	//  102  206:iload           6
	//  103  208:iadd            
	//  104  209:istore_2        
				} while(true);
	//  105  210:goto            180
		}
		return -1;
	//  106  213:iconst_m1       
	//  107  214:ireturn         
	}

	static int indexOf$StringsKt__StringsKt$default(CharSequence charsequence, CharSequence charsequence1, int i, int j, boolean flag, boolean flag1, int k, Object obj)
	{
		if((k & 0x10) != 0)
	//*   0    0:iload           6
	//*   1    2:bipush          16
	//*   2    4:iand            
	//*   3    5:ifeq            11
			flag1 = false;
	//    4    8:iconst_0        
	//    5    9:istore          5
		return indexOf$StringsKt__StringsKt(charsequence, charsequence1, i, j, flag, flag1);
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:iload_2         
	//    9   14:iload_3         
	//   10   15:iload           4
	//   11   17:iload           5
	//   12   19:invokestatic    #352 <Method int indexOf$StringsKt__StringsKt(CharSequence, CharSequence, int, int, boolean, boolean)>
	//   13   22:ireturn         
	}

	public static int indexOf$default(CharSequence charsequence, char c, int i, boolean flag, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		if((j & 4) != 0)
	//*   6    9:iload           4
	//*   7   11:iconst_4        
	//*   8   12:iand            
	//*   9   13:ifeq            18
			flag = false;
	//   10   16:iconst_0        
	//   11   17:istore_3        
		return StringsKt.indexOf(charsequence, c, i, flag);
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:iload_2         
	//   15   21:iload_3         
	//   16   22:invokestatic    #354 <Method int StringsKt.indexOf(CharSequence, char, int, boolean)>
	//   17   25:ireturn         
	}

	public static int indexOf$default(CharSequence charsequence, String s, int i, boolean flag, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		if((j & 4) != 0)
	//*   6    9:iload           4
	//*   7   11:iconst_4        
	//*   8   12:iand            
	//*   9   13:ifeq            18
			flag = false;
	//   10   16:iconst_0        
	//   11   17:istore_3        
		return StringsKt.indexOf(charsequence, s, i, flag);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:iload_2         
	//   15   21:iload_3         
	//   16   22:invokestatic    #356 <Method int StringsKt.indexOf(CharSequence, String, int, boolean)>
	//   17   25:ireturn         
	}

	public static final int indexOfAny(CharSequence charsequence, Collection collection, int i, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "strings");
	//    3    6:aload_1         
	//    4    7:ldc1            #233 <String "strings">
	//    5    9:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		charsequence = ((CharSequence) (findAnyOf$StringsKt__StringsKt(charsequence, collection, i, flag, false)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:iload_3         
	//   10   16:iconst_0        
	//   11   17:invokestatic    #134 <Method Pair findAnyOf$StringsKt__StringsKt(CharSequence, Collection, int, boolean, boolean)>
	//   12   20:astore_0        
		if(charsequence != null)
	//*  13   21:aload_0         
	//*  14   22:ifnull          42
		{
			charsequence = ((CharSequence) ((Integer)((Pair) (charsequence)).getFirst()));
	//   15   25:aload_0         
	//   16   26:invokevirtual   #361 <Method Object Pair.getFirst()>
	//   17   29:checkcast       #253 <Class Integer>
	//   18   32:astore_0        
			if(charsequence != null)
	//*  19   33:aload_0         
	//*  20   34:ifnull          42
				return ((Integer) (charsequence)).intValue();
	//   21   37:aload_0         
	//   22   38:invokevirtual   #364 <Method int Integer.intValue()>
	//   23   41:ireturn         
		}
		return -1;
	//   24   42:iconst_m1       
	//   25   43:ireturn         
	}

	public static final int indexOfAny(CharSequence charsequence, char ac[], int i, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (ac)), "chars");
	//    3    6:aload_1         
	//    4    7:ldc2            #366 <String "chars">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!flag && ac.length == 1 && (charsequence instanceof String))
	//*   6   13:iload_3         
	//*   7   14:ifne            47
	//*   8   17:aload_1         
	//*   9   18:arraylength     
	//*  10   19:iconst_1        
	//*  11   20:icmpne          47
	//*  12   23:aload_0         
	//*  13   24:instanceof      #195 <Class String>
	//*  14   27:ifeq            47
		{
			char c1 = ArraysKt.single(ac);
	//   15   30:aload_1         
	//   16   31:invokestatic    #371 <Method char ArraysKt.single(char[])>
	//   17   34:istore          5
			return ((String)charsequence).indexOf(((int) (c1)), i);
	//   18   36:aload_0         
	//   19   37:checkcast       #195 <Class String>
	//   20   40:iload           5
	//   21   42:iload_2         
	//   22   43:invokevirtual   #341 <Method int String.indexOf(int, int)>
	//   23   46:ireturn         
		}
		i = RangesKt.coerceAtLeast(i, 0);
	//   24   47:iload_2         
	//   25   48:iconst_0        
	//   26   49:invokestatic    #270 <Method int RangesKt.coerceAtLeast(int, int)>
	//   27   52:istore_2        
		int k = StringsKt.getLastIndex(charsequence);
	//   28   53:aload_0         
	//   29   54:invokestatic    #219 <Method int StringsKt.getLastIndex(CharSequence)>
	//   30   57:istore          6
		if(i <= k)
	//*  31   59:iload_2         
	//*  32   60:iload           6
	//*  33   62:icmpgt          139
			do
			{
				int j;
label0:
				{
					char c = charsequence.charAt(i);
	//   34   65:aload_0         
	//   35   66:iload_2         
	//   36   67:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//   37   72:istore          4
					int l = ac.length;
	//   38   74:aload_1         
	//   39   75:arraylength     
	//   40   76:istore          7
					j = 0;
	//   41   78:iconst_0        
	//   42   79:istore          5
					do
					{
						if(j >= l)
							break;
	//   43   81:iload           5
	//   44   83:iload           7
	//   45   85:icmpge          116
						if(CharsKt.equals(ac[j], c, flag))
	//*  46   88:aload_1         
	//*  47   89:iload           5
	//*  48   91:caload          
	//*  49   92:iload           4
	//*  50   94:iload_3         
	//*  51   95:invokestatic    #167 <Method boolean CharsKt.equals(char, char, boolean)>
	//*  52   98:ifeq            107
						{
							j = 1;
	//   53  101:iconst_1        
	//   54  102:istore          5
							break label0;
	//   55  104:goto            119
						}
						j++;
	//   56  107:iload           5
	//   57  109:iconst_1        
	//   58  110:iadd            
	//   59  111:istore          5
					} while(true);
	//   60  113:goto            81
					j = 0;
	//   61  116:iconst_0        
	//   62  117:istore          5
				}
				if(j != 0)
	//*  63  119:iload           5
	//*  64  121:ifeq            126
					return i;
	//   65  124:iload_2         
	//   66  125:ireturn         
				if(i == k)
					break;
	//   67  126:iload_2         
	//   68  127:iload           6
	//   69  129:icmpeq          139
				i++;
	//   70  132:iload_2         
	//   71  133:iconst_1        
	//   72  134:iadd            
	//   73  135:istore_2        
			} while(true);
	//   74  136:goto            65
		return -1;
	//   75  139:iconst_m1       
	//   76  140:ireturn         
	}

	public static int indexOfAny$default(CharSequence charsequence, Collection collection, int i, boolean flag, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		if((j & 4) != 0)
	//*   6    9:iload           4
	//*   7   11:iconst_4        
	//*   8   12:iand            
	//*   9   13:ifeq            18
			flag = false;
	//   10   16:iconst_0        
	//   11   17:istore_3        
		return StringsKt.indexOfAny(charsequence, collection, i, flag);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:iload_2         
	//   15   21:iload_3         
	//   16   22:invokestatic    #375 <Method int StringsKt.indexOfAny(CharSequence, Collection, int, boolean)>
	//   17   25:ireturn         
	}

	public static int indexOfAny$default(CharSequence charsequence, char ac[], int i, boolean flag, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		if((j & 4) != 0)
	//*   6    9:iload           4
	//*   7   11:iconst_4        
	//*   8   12:iand            
	//*   9   13:ifeq            18
			flag = false;
	//   10   16:iconst_0        
	//   11   17:istore_3        
		return StringsKt.indexOfAny(charsequence, ac, i, flag);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:iload_2         
	//   15   21:iload_3         
	//   16   22:invokestatic    #344 <Method int StringsKt.indexOfAny(CharSequence, char[], int, boolean)>
	//   17   25:ireturn         
	}

	private static final boolean isEmpty(CharSequence charsequence)
	{
		return charsequence.length() == 0;
	//    0    0:aload_0         
	//    1    1:invokeinterface #151 <Method int CharSequence.length()>
	//    2    6:ifne            11
	//    3    9:iconst_1        
	//    4   10:ireturn         
	//    5   11:iconst_0        
	//    6   12:ireturn         
	}

	private static final boolean isNotBlank(CharSequence charsequence)
	{
		return StringsKt.isBlank(charsequence) ^ true;
	//    0    0:aload_0         
	//    1    1:invokestatic    #332 <Method boolean StringsKt.isBlank(CharSequence)>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	private static final boolean isNotEmpty(CharSequence charsequence)
	{
		return charsequence.length() > 0;
	//    0    0:aload_0         
	//    1    1:invokeinterface #151 <Method int CharSequence.length()>
	//    2    6:ifle            11
	//    3    9:iconst_1        
	//    4   10:ireturn         
	//    5   11:iconst_0        
	//    6   12:ireturn         
	}

	private static final boolean isNullOrBlank(CharSequence charsequence)
	{
		return charsequence == null || StringsKt.isBlank(charsequence);
	//    0    0:aload_0         
	//    1    1:ifnull          16
	//    2    4:aload_0         
	//    3    5:invokestatic    #332 <Method boolean StringsKt.isBlank(CharSequence)>
	//    4    8:ifeq            14
	//    5   11:goto            16
	//    6   14:iconst_0        
	//    7   15:ireturn         
	//    8   16:iconst_1        
	//    9   17:ireturn         
	}

	private static final boolean isNullOrEmpty(CharSequence charsequence)
	{
		return charsequence == null || charsequence.length() == 0;
	//    0    0:aload_0         
	//    1    1:ifnull          18
	//    2    4:aload_0         
	//    3    5:invokeinterface #151 <Method int CharSequence.length()>
	//    4   10:ifne            16
	//    5   13:goto            18
	//    6   16:iconst_0        
	//    7   17:ireturn         
	//    8   18:iconst_1        
	//    9   19:ireturn         
	}

	public static final CharIterator iterator(CharSequence charsequence)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
	/* block-local class not found */
	class iterator._cls1 {}

		return (CharIterator)new iterator._cls1(charsequence);
	//    3    6:new             #379 <Class StringsKt__StringsKt$iterator$1>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:invokespecial   #382 <Method void StringsKt__StringsKt$iterator$1(CharSequence)>
	//    7   14:checkcast       #384 <Class CharIterator>
	//    8   17:areturn         
	}

	public static final int lastIndexOf(CharSequence charsequence, char c, int i, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!flag && (charsequence instanceof String))
	//*   3    6:iload_3         
	//*   4    7:ifne            30
	//*   5   10:aload_0         
	//*   6   11:instanceof      #195 <Class String>
	//*   7   14:ifne            20
	//*   8   17:goto            30
			return ((String)charsequence).lastIndexOf(((int) (c)), i);
	//    9   20:aload_0         
	//   10   21:checkcast       #195 <Class String>
	//   11   24:iload_1         
	//   12   25:iload_2         
	//   13   26:invokevirtual   #386 <Method int String.lastIndexOf(int, int)>
	//   14   29:ireturn         
		else
			return StringsKt.lastIndexOfAny(charsequence, new char[] {
				c
			}, i, flag);
	//   15   30:aload_0         
	//   16   31:iconst_1        
	//   17   32:newarray        char[]
	//   18   34:dup             
	//   19   35:iconst_0        
	//   20   36:iload_1         
	//   21   37:castore         
	//   22   38:iload_2         
	//   23   39:iload_3         
	//   24   40:invokestatic    #388 <Method int StringsKt.lastIndexOfAny(CharSequence, char[], int, boolean)>
	//   25   43:ireturn         
	}

	public static final int lastIndexOf(CharSequence charsequence, String s, int i, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "string");
	//    3    6:aload_1         
	//    4    7:ldc2            #346 <String "string">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!flag && (charsequence instanceof String))
	//*   6   13:iload_3         
	//*   7   14:ifne            37
	//*   8   17:aload_0         
	//*   9   18:instanceof      #195 <Class String>
	//*  10   21:ifne            27
	//*  11   24:goto            37
			return ((String)charsequence).lastIndexOf(s, i);
	//   12   27:aload_0         
	//   13   28:checkcast       #195 <Class String>
	//   14   31:aload_1         
	//   15   32:iload_2         
	//   16   33:invokevirtual   #390 <Method int String.lastIndexOf(String, int)>
	//   17   36:ireturn         
		else
			return indexOf$StringsKt__StringsKt(charsequence, (CharSequence)s, i, 0, flag, true);
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:checkcast       #148 <Class CharSequence>
	//   21   42:iload_2         
	//   22   43:iconst_0        
	//   23   44:iload_3         
	//   24   45:iconst_1        
	//   25   46:invokestatic    #352 <Method int indexOf$StringsKt__StringsKt(CharSequence, CharSequence, int, int, boolean, boolean)>
	//   26   49:ireturn         
	}

	public static int lastIndexOf$default(CharSequence charsequence, char c, int i, boolean flag, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            12
			i = StringsKt.getLastIndex(charsequence);
	//    4    7:aload_0         
	//    5    8:invokestatic    #219 <Method int StringsKt.getLastIndex(CharSequence)>
	//    6   11:istore_2        
		if((j & 4) != 0)
	//*   7   12:iload           4
	//*   8   14:iconst_4        
	//*   9   15:iand            
	//*  10   16:ifeq            21
			flag = false;
	//   11   19:iconst_0        
	//   12   20:istore_3        
		return StringsKt.lastIndexOf(charsequence, c, i, flag);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:iload_2         
	//   16   24:iload_3         
	//   17   25:invokestatic    #392 <Method int StringsKt.lastIndexOf(CharSequence, char, int, boolean)>
	//   18   28:ireturn         
	}

	public static int lastIndexOf$default(CharSequence charsequence, String s, int i, boolean flag, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            12
			i = StringsKt.getLastIndex(charsequence);
	//    4    7:aload_0         
	//    5    8:invokestatic    #219 <Method int StringsKt.getLastIndex(CharSequence)>
	//    6   11:istore_2        
		if((j & 4) != 0)
	//*   7   12:iload           4
	//*   8   14:iconst_4        
	//*   9   15:iand            
	//*  10   16:ifeq            21
			flag = false;
	//   11   19:iconst_0        
	//   12   20:istore_3        
		return StringsKt.lastIndexOf(charsequence, s, i, flag);
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:iload_2         
	//   16   24:iload_3         
	//   17   25:invokestatic    #394 <Method int StringsKt.lastIndexOf(CharSequence, String, int, boolean)>
	//   18   28:ireturn         
	}

	public static final int lastIndexOfAny(CharSequence charsequence, Collection collection, int i, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "strings");
	//    3    6:aload_1         
	//    4    7:ldc1            #233 <String "strings">
	//    5    9:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		charsequence = ((CharSequence) (findAnyOf$StringsKt__StringsKt(charsequence, collection, i, flag, true)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:iload_3         
	//   10   16:iconst_1        
	//   11   17:invokestatic    #134 <Method Pair findAnyOf$StringsKt__StringsKt(CharSequence, Collection, int, boolean, boolean)>
	//   12   20:astore_0        
		if(charsequence != null)
	//*  13   21:aload_0         
	//*  14   22:ifnull          42
		{
			charsequence = ((CharSequence) ((Integer)((Pair) (charsequence)).getFirst()));
	//   15   25:aload_0         
	//   16   26:invokevirtual   #361 <Method Object Pair.getFirst()>
	//   17   29:checkcast       #253 <Class Integer>
	//   18   32:astore_0        
			if(charsequence != null)
	//*  19   33:aload_0         
	//*  20   34:ifnull          42
				return ((Integer) (charsequence)).intValue();
	//   21   37:aload_0         
	//   22   38:invokevirtual   #364 <Method int Integer.intValue()>
	//   23   41:ireturn         
		}
		return -1;
	//   24   42:iconst_m1       
	//   25   43:ireturn         
	}

	public static final int lastIndexOfAny(CharSequence charsequence, char ac[], int i, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (ac)), "chars");
	//    3    6:aload_1         
	//    4    7:ldc2            #366 <String "chars">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!flag && ac.length == 1 && (charsequence instanceof String))
	//*   6   13:iload_3         
	//*   7   14:ifne            47
	//*   8   17:aload_1         
	//*   9   18:arraylength     
	//*  10   19:iconst_1        
	//*  11   20:icmpne          47
	//*  12   23:aload_0         
	//*  13   24:instanceof      #195 <Class String>
	//*  14   27:ifeq            47
		{
			char c1 = ArraysKt.single(ac);
	//   15   30:aload_1         
	//   16   31:invokestatic    #371 <Method char ArraysKt.single(char[])>
	//   17   34:istore          5
			return ((String)charsequence).lastIndexOf(((int) (c1)), i);
	//   18   36:aload_0         
	//   19   37:checkcast       #195 <Class String>
	//   20   40:iload           5
	//   21   42:iload_2         
	//   22   43:invokevirtual   #386 <Method int String.lastIndexOf(int, int)>
	//   23   46:ireturn         
		}
		for(i = RangesKt.coerceAtMost(i, StringsKt.getLastIndex(charsequence)); i >= 0; i--)
	//*  24   47:iload_2         
	//*  25   48:aload_0         
	//*  26   49:invokestatic    #219 <Method int StringsKt.getLastIndex(CharSequence)>
	//*  27   52:invokestatic    #278 <Method int RangesKt.coerceAtMost(int, int)>
	//*  28   55:istore_2        
	//*  29   56:iload_2         
	//*  30   57:iflt            132
		{
			char c = charsequence.charAt(i);
	//   31   60:aload_0         
	//   32   61:iload_2         
	//   33   62:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//   34   67:istore          4
			boolean flag2 = false;
	//   35   69:iconst_0        
	//   36   70:istore          7
			int k = ac.length;
	//   37   72:aload_1         
	//   38   73:arraylength     
	//   39   74:istore          8
			int j = 0;
	//   40   76:iconst_0        
	//   41   77:istore          5
			boolean flag1;
			do
			{
				flag1 = flag2;
	//   42   79:iload           7
	//   43   81:istore          6
				if(j >= k)
					break;
	//   44   83:iload           5
	//   45   85:iload           8
	//   46   87:icmpge          118
				if(CharsKt.equals(ac[j], c, flag))
	//*  47   90:aload_1         
	//*  48   91:iload           5
	//*  49   93:caload          
	//*  50   94:iload           4
	//*  51   96:iload_3         
	//*  52   97:invokestatic    #167 <Method boolean CharsKt.equals(char, char, boolean)>
	//*  53  100:ifeq            109
				{
					flag1 = true;
	//   54  103:iconst_1        
	//   55  104:istore          6
					break;
	//   56  106:goto            118
				}
				j++;
	//   57  109:iload           5
	//   58  111:iconst_1        
	//   59  112:iadd            
	//   60  113:istore          5
			} while(true);
	//   61  115:goto            79
			if(flag1)
	//*  62  118:iload           6
	//*  63  120:ifeq            125
				return i;
	//   64  123:iload_2         
	//   65  124:ireturn         
		}

	//   66  125:iload_2         
	//   67  126:iconst_1        
	//   68  127:isub            
	//   69  128:istore_2        
	//*  70  129:goto            56
		return -1;
	//   71  132:iconst_m1       
	//   72  133:ireturn         
	}

	public static int lastIndexOfAny$default(CharSequence charsequence, Collection collection, int i, boolean flag, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            12
			i = StringsKt.getLastIndex(charsequence);
	//    4    7:aload_0         
	//    5    8:invokestatic    #219 <Method int StringsKt.getLastIndex(CharSequence)>
	//    6   11:istore_2        
		if((j & 4) != 0)
	//*   7   12:iload           4
	//*   8   14:iconst_4        
	//*   9   15:iand            
	//*  10   16:ifeq            21
			flag = false;
	//   11   19:iconst_0        
	//   12   20:istore_3        
		return StringsKt.lastIndexOfAny(charsequence, collection, i, flag);
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:iload_2         
	//   16   24:iload_3         
	//   17   25:invokestatic    #397 <Method int StringsKt.lastIndexOfAny(CharSequence, Collection, int, boolean)>
	//   18   28:ireturn         
	}

	public static int lastIndexOfAny$default(CharSequence charsequence, char ac[], int i, boolean flag, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            12
			i = StringsKt.getLastIndex(charsequence);
	//    4    7:aload_0         
	//    5    8:invokestatic    #219 <Method int StringsKt.getLastIndex(CharSequence)>
	//    6   11:istore_2        
		if((j & 4) != 0)
	//*   7   12:iload           4
	//*   8   14:iconst_4        
	//*   9   15:iand            
	//*  10   16:ifeq            21
			flag = false;
	//   11   19:iconst_0        
	//   12   20:istore_3        
		return StringsKt.lastIndexOfAny(charsequence, ac, i, flag);
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:iload_2         
	//   16   24:iload_3         
	//   17   25:invokestatic    #388 <Method int StringsKt.lastIndexOfAny(CharSequence, char[], int, boolean)>
	//   18   28:ireturn         
	}

	public static final Sequence lineSequence(CharSequence charsequence)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return StringsKt.splitToSequence$default(charsequence, new String[] {
			"\r\n", "\n", "\r"
		}, false, 0, 6, ((Object) (null)));
	//    3    6:aload_0         
	//    4    7:iconst_3        
	//    5    8:anewarray       String[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:ldc2            #400 <String "\r\n">
	//    9   16:aastore         
	//   10   17:dup             
	//   11   18:iconst_1        
	//   12   19:ldc2            #402 <String "\n">
	//   13   22:aastore         
	//   14   23:dup             
	//   15   24:iconst_2        
	//   16   25:ldc2            #404 <String "\r">
	//   17   28:aastore         
	//   18   29:iconst_0        
	//   19   30:iconst_0        
	//   20   31:bipush          6
	//   21   33:aconst_null     
	//   22   34:invokestatic    #408 <Method Sequence StringsKt.splitToSequence$default(CharSequence, String[], boolean, int, int, Object)>
	//   23   37:areturn         
	}

	public static final List lines(CharSequence charsequence)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return SequencesKt.toList(StringsKt.lineSequence(charsequence));
	//    3    6:aload_0         
	//    4    7:invokestatic    #412 <Method Sequence StringsKt.lineSequence(CharSequence)>
	//    5   10:invokestatic    #418 <Method List SequencesKt.toList(Sequence)>
	//    6   13:areturn         
	}

	private static final boolean matches(CharSequence charsequence, Regex regex)
	{
		return regex.matches(charsequence);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #421 <Method boolean Regex.matches(CharSequence)>
	//    3    5:ireturn         
	}

	private static final String orEmpty(String s)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          6
			return s;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return "";
	//    4    6:ldc2            #423 <String "">
	//    5    9:areturn         
	}

	public static final CharSequence padEnd(CharSequence charsequence, int i, char c)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(i < 0)
	//*   3    6:iload_1         
	//*   4    7:ifge            55
		{
			charsequence = ((CharSequence) (new StringBuilder()));
	//    5   10:new             #426 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #427 <Method void StringBuilder()>
	//    8   17:astore_0        
			((StringBuilder) (charsequence)).append("Desired length ");
	//    9   18:aload_0         
	//   10   19:ldc2            #429 <String "Desired length ">
	//   11   22:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			((StringBuilder) (charsequence)).append(i);
	//   13   26:aload_0         
	//   14   27:iload_1         
	//   15   28:invokevirtual   #436 <Method StringBuilder StringBuilder.append(int)>
	//   16   31:pop             
			((StringBuilder) (charsequence)).append(" is less than zero.");
	//   17   32:aload_0         
	//   18   33:ldc2            #438 <String " is less than zero.">
	//   19   36:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			throw (Throwable)new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
	//   21   40:new             #440 <Class IllegalArgumentException>
	//   22   43:dup             
	//   23   44:aload_0         
	//   24   45:invokevirtual   #441 <Method String StringBuilder.toString()>
	//   25   48:invokespecial   #444 <Method void IllegalArgumentException(String)>
	//   26   51:checkcast       #446 <Class Throwable>
	//   27   54:athrow          
		}
		if(i <= charsequence.length())
	//*  28   55:iload_1         
	//*  29   56:aload_0         
	//*  30   57:invokeinterface #151 <Method int CharSequence.length()>
	//*  31   62:icmpgt          79
			return charsequence.subSequence(0, charsequence.length());
	//   32   65:aload_0         
	//   33   66:iconst_0        
	//   34   67:aload_0         
	//   35   68:invokeinterface #151 <Method int CharSequence.length()>
	//   36   73:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   37   78:areturn         
		StringBuilder stringbuilder = new StringBuilder(i);
	//   38   79:new             #426 <Class StringBuilder>
	//   39   82:dup             
	//   40   83:iload_1         
	//   41   84:invokespecial   #449 <Method void StringBuilder(int)>
	//   42   87:astore          4
		stringbuilder.append(charsequence);
	//   43   89:aload           4
	//   44   91:aload_0         
	//   45   92:invokevirtual   #452 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   46   95:pop             
		int j = i - charsequence.length();
	//   47   96:iload_1         
	//   48   97:aload_0         
	//   49   98:invokeinterface #151 <Method int CharSequence.length()>
	//   50  103:isub            
	//   51  104:istore_3        
		i = 1;
	//   52  105:iconst_1        
	//   53  106:istore_1        
		if(1 <= j)
	//*  54  107:iconst_1        
	//*  55  108:iload_3         
	//*  56  109:icmpgt          131
			do
			{
				stringbuilder.append(c);
	//   57  112:aload           4
	//   58  114:iload_2         
	//   59  115:invokevirtual   #455 <Method StringBuilder StringBuilder.append(char)>
	//   60  118:pop             
				if(i == j)
					break;
	//   61  119:iload_1         
	//   62  120:iload_3         
	//   63  121:icmpeq          131
				i++;
	//   64  124:iload_1         
	//   65  125:iconst_1        
	//   66  126:iadd            
	//   67  127:istore_1        
			} while(true);
	//   68  128:goto            112
		return (CharSequence)stringbuilder;
	//   69  131:aload           4
	//   70  133:checkcast       #148 <Class CharSequence>
	//   71  136:areturn         
	}

	public static final String padEnd(String s, int i, char c)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return ((Object) (StringsKt.padEnd((CharSequence)s, i, c))).toString();
	//    3    6:aload_0         
	//    4    7:checkcast       #148 <Class CharSequence>
	//    5   10:iload_1         
	//    6   11:iload_2         
	//    7   12:invokestatic    #458 <Method CharSequence StringsKt.padEnd(CharSequence, int, char)>
	//    8   15:invokevirtual   #180 <Method String Object.toString()>
	//    9   18:areturn         
	}

	public static CharSequence padEnd$default(CharSequence charsequence, int i, char c, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            9
			c = ' ';
	//    4    6:bipush          32
	//    5    8:istore_2        
		return StringsKt.padEnd(charsequence, i, c);
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:iload_2         
	//    9   12:invokestatic    #458 <Method CharSequence StringsKt.padEnd(CharSequence, int, char)>
	//   10   15:areturn         
	}

	public static String padEnd$default(String s, int i, char c, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            9
			c = ' ';
	//    4    6:bipush          32
	//    5    8:istore_2        
		return StringsKt.padEnd(s, i, c);
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:iload_2         
	//    9   12:invokestatic    #463 <Method String StringsKt.padEnd(String, int, char)>
	//   10   15:areturn         
	}

	public static final CharSequence padStart(CharSequence charsequence, int i, char c)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(i < 0)
	//*   3    6:iload_1         
	//*   4    7:ifge            55
		{
			charsequence = ((CharSequence) (new StringBuilder()));
	//    5   10:new             #426 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #427 <Method void StringBuilder()>
	//    8   17:astore_0        
			((StringBuilder) (charsequence)).append("Desired length ");
	//    9   18:aload_0         
	//   10   19:ldc2            #429 <String "Desired length ">
	//   11   22:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			((StringBuilder) (charsequence)).append(i);
	//   13   26:aload_0         
	//   14   27:iload_1         
	//   15   28:invokevirtual   #436 <Method StringBuilder StringBuilder.append(int)>
	//   16   31:pop             
			((StringBuilder) (charsequence)).append(" is less than zero.");
	//   17   32:aload_0         
	//   18   33:ldc2            #438 <String " is less than zero.">
	//   19   36:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			throw (Throwable)new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
	//   21   40:new             #440 <Class IllegalArgumentException>
	//   22   43:dup             
	//   23   44:aload_0         
	//   24   45:invokevirtual   #441 <Method String StringBuilder.toString()>
	//   25   48:invokespecial   #444 <Method void IllegalArgumentException(String)>
	//   26   51:checkcast       #446 <Class Throwable>
	//   27   54:athrow          
		}
		if(i <= charsequence.length())
	//*  28   55:iload_1         
	//*  29   56:aload_0         
	//*  30   57:invokeinterface #151 <Method int CharSequence.length()>
	//*  31   62:icmpgt          79
			return charsequence.subSequence(0, charsequence.length());
	//   32   65:aload_0         
	//   33   66:iconst_0        
	//   34   67:aload_0         
	//   35   68:invokeinterface #151 <Method int CharSequence.length()>
	//   36   73:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   37   78:areturn         
		StringBuilder stringbuilder = new StringBuilder(i);
	//   38   79:new             #426 <Class StringBuilder>
	//   39   82:dup             
	//   40   83:iload_1         
	//   41   84:invokespecial   #449 <Method void StringBuilder(int)>
	//   42   87:astore          4
		int j = i - charsequence.length();
	//   43   89:iload_1         
	//   44   90:aload_0         
	//   45   91:invokeinterface #151 <Method int CharSequence.length()>
	//   46   96:isub            
	//   47   97:istore_3        
		i = 1;
	//   48   98:iconst_1        
	//   49   99:istore_1        
		if(1 <= j)
	//*  50  100:iconst_1        
	//*  51  101:iload_3         
	//*  52  102:icmpgt          124
			do
			{
				stringbuilder.append(c);
	//   53  105:aload           4
	//   54  107:iload_2         
	//   55  108:invokevirtual   #455 <Method StringBuilder StringBuilder.append(char)>
	//   56  111:pop             
				if(i == j)
					break;
	//   57  112:iload_1         
	//   58  113:iload_3         
	//   59  114:icmpeq          124
				i++;
	//   60  117:iload_1         
	//   61  118:iconst_1        
	//   62  119:iadd            
	//   63  120:istore_1        
			} while(true);
	//   64  121:goto            105
		stringbuilder.append(charsequence);
	//   65  124:aload           4
	//   66  126:aload_0         
	//   67  127:invokevirtual   #452 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   68  130:pop             
		return (CharSequence)stringbuilder;
	//   69  131:aload           4
	//   70  133:checkcast       #148 <Class CharSequence>
	//   71  136:areturn         
	}

	public static final String padStart(String s, int i, char c)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return ((Object) (StringsKt.padStart((CharSequence)s, i, c))).toString();
	//    3    6:aload_0         
	//    4    7:checkcast       #148 <Class CharSequence>
	//    5   10:iload_1         
	//    6   11:iload_2         
	//    7   12:invokestatic    #465 <Method CharSequence StringsKt.padStart(CharSequence, int, char)>
	//    8   15:invokevirtual   #180 <Method String Object.toString()>
	//    9   18:areturn         
	}

	public static CharSequence padStart$default(CharSequence charsequence, int i, char c, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            9
			c = ' ';
	//    4    6:bipush          32
	//    5    8:istore_2        
		return StringsKt.padStart(charsequence, i, c);
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:iload_2         
	//    9   12:invokestatic    #465 <Method CharSequence StringsKt.padStart(CharSequence, int, char)>
	//   10   15:areturn         
	}

	public static String padStart$default(String s, int i, char c, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            9
			c = ' ';
	//    4    6:bipush          32
	//    5    8:istore_2        
		return StringsKt.padStart(s, i, c);
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:iload_2         
	//    9   12:invokestatic    #468 <Method String StringsKt.padStart(String, int, char)>
	//   10   15:areturn         
	}

	private static final Sequence rangesDelimitedBy$StringsKt__StringsKt(CharSequence charsequence, char ac[], int i, boolean flag, int j)
	{
		boolean flag1;
		if(j >= 0)
	//*   0    0:iload           4
	//*   1    2:iflt            11
			flag1 = true;
	//    2    5:iconst_1        
	//    3    6:istore          5
		else
	//*   4    8:goto            14
			flag1 = false;
	//    5   11:iconst_0        
	//    6   12:istore          5
	/* block-local class not found */
	class rangesDelimitedBy._cls2 {}

		if(!flag1)
	//*   7   14:iload           5
	//*   8   16:ifne            67
		{
			charsequence = ((CharSequence) (new StringBuilder()));
	//    9   19:new             #426 <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #427 <Method void StringBuilder()>
	//   12   26:astore_0        
			((StringBuilder) (charsequence)).append("Limit must be non-negative, but was ");
	//   13   27:aload_0         
	//   14   28:ldc2            #471 <String "Limit must be non-negative, but was ">
	//   15   31:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
			((StringBuilder) (charsequence)).append(j);
	//   17   35:aload_0         
	//   18   36:iload           4
	//   19   38:invokevirtual   #436 <Method StringBuilder StringBuilder.append(int)>
	//   20   41:pop             
			((StringBuilder) (charsequence)).append('.');
	//   21   42:aload_0         
	//   22   43:bipush          46
	//   23   45:invokevirtual   #455 <Method StringBuilder StringBuilder.append(char)>
	//   24   48:pop             
			throw (Throwable)new IllegalArgumentException(((Object) (((StringBuilder) (charsequence)).toString())).toString());
	//   25   49:new             #440 <Class IllegalArgumentException>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:invokevirtual   #441 <Method String StringBuilder.toString()>
	//   29   57:invokevirtual   #180 <Method String Object.toString()>
	//   30   60:invokespecial   #444 <Method void IllegalArgumentException(String)>
	//   31   63:checkcast       #446 <Class Throwable>
	//   32   66:athrow          
		} else
		{
			return (Sequence)new DelimitedRangesSequence(charsequence, i, j, (Function2)new rangesDelimitedBy._cls2(ac, flag));
	//   33   67:new             #473 <Class DelimitedRangesSequence>
	//   34   70:dup             
	//   35   71:aload_0         
	//   36   72:iload_2         
	//   37   73:iload           4
	//   38   75:new             #475 <Class StringsKt__StringsKt$rangesDelimitedBy$2>
	//   39   78:dup             
	//   40   79:aload_1         
	//   41   80:iload_3         
	//   42   81:invokespecial   #478 <Method void StringsKt__StringsKt$rangesDelimitedBy$2(char[], boolean)>
	//   43   84:checkcast       #480 <Class Function2>
	//   44   87:invokespecial   #483 <Method void DelimitedRangesSequence(CharSequence, int, int, Function2)>
	//   45   90:checkcast       #485 <Class Sequence>
	//   46   93:areturn         
		}
	}

	private static final Sequence rangesDelimitedBy$StringsKt__StringsKt(CharSequence charsequence, String as[], int i, boolean flag, int j)
	{
		boolean flag1;
		if(j >= 0)
	//*   0    0:iload           4
	//*   1    2:iflt            11
			flag1 = true;
	//    2    5:iconst_1        
	//    3    6:istore          5
		else
	//*   4    8:goto            14
			flag1 = false;
	//    5   11:iconst_0        
	//    6   12:istore          5
	/* block-local class not found */
	class rangesDelimitedBy._cls4 {}

		if(!flag1)
	//*   7   14:iload           5
	//*   8   16:ifne            67
		{
			charsequence = ((CharSequence) (new StringBuilder()));
	//    9   19:new             #426 <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #427 <Method void StringBuilder()>
	//   12   26:astore_0        
			((StringBuilder) (charsequence)).append("Limit must be non-negative, but was ");
	//   13   27:aload_0         
	//   14   28:ldc2            #471 <String "Limit must be non-negative, but was ">
	//   15   31:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
			((StringBuilder) (charsequence)).append(j);
	//   17   35:aload_0         
	//   18   36:iload           4
	//   19   38:invokevirtual   #436 <Method StringBuilder StringBuilder.append(int)>
	//   20   41:pop             
			((StringBuilder) (charsequence)).append('.');
	//   21   42:aload_0         
	//   22   43:bipush          46
	//   23   45:invokevirtual   #455 <Method StringBuilder StringBuilder.append(char)>
	//   24   48:pop             
			throw (Throwable)new IllegalArgumentException(((Object) (((StringBuilder) (charsequence)).toString())).toString());
	//   25   49:new             #440 <Class IllegalArgumentException>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:invokevirtual   #441 <Method String StringBuilder.toString()>
	//   29   57:invokevirtual   #180 <Method String Object.toString()>
	//   30   60:invokespecial   #444 <Method void IllegalArgumentException(String)>
	//   31   63:checkcast       #446 <Class Throwable>
	//   32   66:athrow          
		} else
		{
			return (Sequence)new DelimitedRangesSequence(charsequence, i, j, (Function2)new rangesDelimitedBy._cls4(ArraysKt.asList(((Object []) (as))), flag));
	//   33   67:new             #473 <Class DelimitedRangesSequence>
	//   34   70:dup             
	//   35   71:aload_0         
	//   36   72:iload_2         
	//   37   73:iload           4
	//   38   75:new             #488 <Class StringsKt__StringsKt$rangesDelimitedBy$4>
	//   39   78:dup             
	//   40   79:aload_1         
	//   41   80:invokestatic    #492 <Method List ArraysKt.asList(Object[])>
	//   42   83:iload_3         
	//   43   84:invokespecial   #495 <Method void StringsKt__StringsKt$rangesDelimitedBy$4(List, boolean)>
	//   44   87:checkcast       #480 <Class Function2>
	//   45   90:invokespecial   #483 <Method void DelimitedRangesSequence(CharSequence, int, int, Function2)>
	//   46   93:checkcast       #485 <Class Sequence>
	//   47   96:areturn         
		}
	}

	static Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charsequence, char ac[], int i, boolean flag, int j, int k, Object obj)
	{
		if((k & 2) != 0)
	//*   0    0:iload           5
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		if((k & 4) != 0)
	//*   6    9:iload           5
	//*   7   11:iconst_4        
	//*   8   12:iand            
	//*   9   13:ifeq            18
			flag = false;
	//   10   16:iconst_0        
	//   11   17:istore_3        
		if((k & 8) != 0)
	//*  12   18:iload           5
	//*  13   20:bipush          8
	//*  14   22:iand            
	//*  15   23:ifeq            29
			j = 0;
	//   16   26:iconst_0        
	//   17   27:istore          4
		return rangesDelimitedBy$StringsKt__StringsKt(charsequence, ac, i, flag, j);
	//   18   29:aload_0         
	//   19   30:aload_1         
	//   20   31:iload_2         
	//   21   32:iload_3         
	//   22   33:iload           4
	//   23   35:invokestatic    #500 <Method Sequence rangesDelimitedBy$StringsKt__StringsKt(CharSequence, char[], int, boolean, int)>
	//   24   38:areturn         
	}

	static Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charsequence, String as[], int i, boolean flag, int j, int k, Object obj)
	{
		if((k & 2) != 0)
	//*   0    0:iload           5
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		if((k & 4) != 0)
	//*   6    9:iload           5
	//*   7   11:iconst_4        
	//*   8   12:iand            
	//*   9   13:ifeq            18
			flag = false;
	//   10   16:iconst_0        
	//   11   17:istore_3        
		if((k & 8) != 0)
	//*  12   18:iload           5
	//*  13   20:bipush          8
	//*  14   22:iand            
	//*  15   23:ifeq            29
			j = 0;
	//   16   26:iconst_0        
	//   17   27:istore          4
		return rangesDelimitedBy$StringsKt__StringsKt(charsequence, as, i, flag, j);
	//   18   29:aload_0         
	//   19   30:aload_1         
	//   20   31:iload_2         
	//   21   32:iload_3         
	//   22   33:iload           4
	//   23   35:invokestatic    #503 <Method Sequence rangesDelimitedBy$StringsKt__StringsKt(CharSequence, String[], int, boolean, int)>
	//   24   38:areturn         
	}

	public static final boolean regionMatchesImpl(CharSequence charsequence, int i, CharSequence charsequence1, int j, int k, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence1)), "other");
	//    3    6:aload_2         
	//    4    7:ldc1            #146 <String "other">
	//    5    9:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(j >= 0 && i >= 0 && i <= charsequence.length() - k)
	//*   6   12:iload_3         
	//*   7   13:iflt            99
	//*   8   16:iload_1         
	//*   9   17:iflt            99
	//*  10   20:iload_1         
	//*  11   21:aload_0         
	//*  12   22:invokeinterface #151 <Method int CharSequence.length()>
	//*  13   27:iload           4
	//*  14   29:isub            
	//*  15   30:icmpgt          99
		{
			if(j > charsequence1.length() - k)
	//*  16   33:iload_3         
	//*  17   34:aload_2         
	//*  18   35:invokeinterface #151 <Method int CharSequence.length()>
	//*  19   40:iload           4
	//*  20   42:isub            
	//*  21   43:icmple          48
				return false;
	//   22   46:iconst_0        
	//   23   47:ireturn         
			for(int l = 0; l < k; l++)
	//*  24   48:iconst_0        
	//*  25   49:istore          6
	//*  26   51:iload           6
	//*  27   53:iload           4
	//*  28   55:icmpge          97
				if(!CharsKt.equals(charsequence.charAt(i + l), charsequence1.charAt(j + l), flag))
	//*  29   58:aload_0         
	//*  30   59:iload_1         
	//*  31   60:iload           6
	//*  32   62:iadd            
	//*  33   63:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//*  34   68:aload_2         
	//*  35   69:iload_3         
	//*  36   70:iload           6
	//*  37   72:iadd            
	//*  38   73:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//*  39   78:iload           5
	//*  40   80:invokestatic    #167 <Method boolean CharsKt.equals(char, char, boolean)>
	//*  41   83:ifne            88
					return false;
	//   42   86:iconst_0        
	//   43   87:ireturn         

	//   44   88:iload           6
	//   45   90:iconst_1        
	//   46   91:iadd            
	//   47   92:istore          6
	//*  48   94:goto            51
			return true;
	//   49   97:iconst_1        
	//   50   98:ireturn         
		} else
		{
			return false;
	//   51   99:iconst_0        
	//   52  100:ireturn         
		}
	}

	public static final CharSequence removePrefix(CharSequence charsequence, CharSequence charsequence1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence1)), "prefix");
	//    3    6:aload_1         
	//    4    7:ldc2            #505 <String "prefix">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(StringsKt.startsWith$default(charsequence, charsequence1, false, 2, ((Object) (null))))
	//*   6   13:aload_0         
	//*   7   14:aload_1         
	//*   8   15:iconst_0        
	//*   9   16:iconst_2        
	//*  10   17:aconst_null     
	//*  11   18:invokestatic    #508 <Method boolean StringsKt.startsWith$default(CharSequence, CharSequence, boolean, int, Object)>
	//*  12   21:ifeq            43
			return charsequence.subSequence(charsequence1.length(), charsequence.length());
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokeinterface #151 <Method int CharSequence.length()>
	//   16   31:aload_0         
	//   17   32:invokeinterface #151 <Method int CharSequence.length()>
	//   18   37:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   19   42:areturn         
		else
			return charsequence.subSequence(0, charsequence.length());
	//   20   43:aload_0         
	//   21   44:iconst_0        
	//   22   45:aload_0         
	//   23   46:invokeinterface #151 <Method int CharSequence.length()>
	//   24   51:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   25   56:areturn         
	}

	public static final String removePrefix(String s, CharSequence charsequence)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "prefix");
	//    3    6:aload_1         
	//    4    7:ldc2            #505 <String "prefix">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(StringsKt.startsWith$default((CharSequence)s, charsequence, false, 2, ((Object) (null))))
	//*   6   13:aload_0         
	//*   7   14:checkcast       #148 <Class CharSequence>
	//*   8   17:aload_1         
	//*   9   18:iconst_0        
	//*  10   19:iconst_2        
	//*  11   20:aconst_null     
	//*  12   21:invokestatic    #508 <Method boolean StringsKt.startsWith$default(CharSequence, CharSequence, boolean, int, Object)>
	//*  13   24:ifeq            47
		{
			s = s.substring(charsequence.length());
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:invokeinterface #151 <Method int CharSequence.length()>
	//   17   34:invokevirtual   #512 <Method String String.substring(int)>
	//   18   37:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.String).substring(startIndex)");
	//   19   38:aload_0         
	//   20   39:ldc2            #514 <String "(this as java.lang.String).substring(startIndex)">
	//   21   42:invokestatic    #517 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   22   45:aload_0         
	//   23   46:areturn         
		} else
		{
			return s;
	//   24   47:aload_0         
	//   25   48:areturn         
		}
	}

	public static final CharSequence removeRange(CharSequence charsequence, int i, int j)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(j < i)
	//*   3    6:iload_2         
	//*   4    7:iload_1         
	//*   5    8:icmpge          70
		{
			charsequence = ((CharSequence) (new StringBuilder()));
	//    6   11:new             #426 <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #427 <Method void StringBuilder()>
	//    9   18:astore_0        
			((StringBuilder) (charsequence)).append("End index (");
	//   10   19:aload_0         
	//   11   20:ldc2            #520 <String "End index (">
	//   12   23:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
			((StringBuilder) (charsequence)).append(j);
	//   14   27:aload_0         
	//   15   28:iload_2         
	//   16   29:invokevirtual   #436 <Method StringBuilder StringBuilder.append(int)>
	//   17   32:pop             
			((StringBuilder) (charsequence)).append(") is less than start index (");
	//   18   33:aload_0         
	//   19   34:ldc2            #522 <String ") is less than start index (">
	//   20   37:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			((StringBuilder) (charsequence)).append(i);
	//   22   41:aload_0         
	//   23   42:iload_1         
	//   24   43:invokevirtual   #436 <Method StringBuilder StringBuilder.append(int)>
	//   25   46:pop             
			((StringBuilder) (charsequence)).append(").");
	//   26   47:aload_0         
	//   27   48:ldc2            #524 <String ").">
	//   28   51:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
			throw (Throwable)new IndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//   30   55:new             #526 <Class IndexOutOfBoundsException>
	//   31   58:dup             
	//   32   59:aload_0         
	//   33   60:invokevirtual   #441 <Method String StringBuilder.toString()>
	//   34   63:invokespecial   #527 <Method void IndexOutOfBoundsException(String)>
	//   35   66:checkcast       #446 <Class Throwable>
	//   36   69:athrow          
		}
		if(j == i)
	//*  37   70:iload_2         
	//*  38   71:iload_1         
	//*  39   72:icmpne          89
		{
			return charsequence.subSequence(0, charsequence.length());
	//   40   75:aload_0         
	//   41   76:iconst_0        
	//   42   77:aload_0         
	//   43   78:invokeinterface #151 <Method int CharSequence.length()>
	//   44   83:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   45   88:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(charsequence.length() - (j - i));
	//   46   89:new             #426 <Class StringBuilder>
	//   47   92:dup             
	//   48   93:aload_0         
	//   49   94:invokeinterface #151 <Method int CharSequence.length()>
	//   50   99:iload_2         
	//   51  100:iload_1         
	//   52  101:isub            
	//   53  102:isub            
	//   54  103:invokespecial   #449 <Method void StringBuilder(int)>
	//   55  106:astore_3        
			stringbuilder.append(charsequence, 0, i);
	//   56  107:aload_3         
	//   57  108:aload_0         
	//   58  109:iconst_0        
	//   59  110:iload_1         
	//   60  111:invokevirtual   #530 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   61  114:pop             
			stringbuilder.append(charsequence, j, charsequence.length());
	//   62  115:aload_3         
	//   63  116:aload_0         
	//   64  117:iload_2         
	//   65  118:aload_0         
	//   66  119:invokeinterface #151 <Method int CharSequence.length()>
	//   67  124:invokevirtual   #530 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   68  127:pop             
			return (CharSequence)stringbuilder;
	//   69  128:aload_3         
	//   70  129:checkcast       #148 <Class CharSequence>
	//   71  132:areturn         
		}
	}

	public static final CharSequence removeRange(CharSequence charsequence, IntRange intrange)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (intrange)), "range");
	//    3    6:aload_1         
	//    4    7:ldc2            #532 <String "range">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return StringsKt.removeRange(charsequence, intrange.getStart().intValue(), intrange.getEndInclusive().intValue() + 1);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #536 <Method Integer IntRange.getStart()>
	//    9   18:invokevirtual   #364 <Method int Integer.intValue()>
	//   10   21:aload_1         
	//   11   22:invokevirtual   #539 <Method Integer IntRange.getEndInclusive()>
	//   12   25:invokevirtual   #364 <Method int Integer.intValue()>
	//   13   28:iconst_1        
	//   14   29:iadd            
	//   15   30:invokestatic    #541 <Method CharSequence StringsKt.removeRange(CharSequence, int, int)>
	//   16   33:areturn         
	}

	private static final String removeRange(String s, int i, int j)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
	//    2    4:new             #544 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc2            #546 <String "null cannot be cast to non-null type kotlin.CharSequence">
	//    5   11:invokespecial   #547 <Method void TypeCastException(String)>
	//    6   14:athrow          
		else
			return ((Object) (StringsKt.removeRange((CharSequence)s, i, j))).toString();
	//    7   15:aload_0         
	//    8   16:checkcast       #148 <Class CharSequence>
	//    9   19:iload_1         
	//   10   20:iload_2         
	//   11   21:invokestatic    #541 <Method CharSequence StringsKt.removeRange(CharSequence, int, int)>
	//   12   24:invokevirtual   #180 <Method String Object.toString()>
	//   13   27:areturn         
	}

	private static final String removeRange(String s, IntRange intrange)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
	//    2    4:new             #544 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc2            #546 <String "null cannot be cast to non-null type kotlin.CharSequence">
	//    5   11:invokespecial   #547 <Method void TypeCastException(String)>
	//    6   14:athrow          
		else
			return ((Object) (StringsKt.removeRange((CharSequence)s, intrange))).toString();
	//    7   15:aload_0         
	//    8   16:checkcast       #148 <Class CharSequence>
	//    9   19:aload_1         
	//   10   20:invokestatic    #550 <Method CharSequence StringsKt.removeRange(CharSequence, IntRange)>
	//   11   23:invokevirtual   #180 <Method String Object.toString()>
	//   12   26:areturn         
	}

	public static final CharSequence removeSuffix(CharSequence charsequence, CharSequence charsequence1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence1)), "suffix");
	//    3    6:aload_1         
	//    4    7:ldc1            #220 <String "suffix">
	//    5    9:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(StringsKt.endsWith$default(charsequence, charsequence1, false, 2, ((Object) (null))))
	//*   6   12:aload_0         
	//*   7   13:aload_1         
	//*   8   14:iconst_0        
	//*   9   15:iconst_2        
	//*  10   16:aconst_null     
	//*  11   17:invokestatic    #552 <Method boolean StringsKt.endsWith$default(CharSequence, CharSequence, boolean, int, Object)>
	//*  12   20:ifeq            44
			return charsequence.subSequence(0, charsequence.length() - charsequence1.length());
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:aload_0         
	//   16   26:invokeinterface #151 <Method int CharSequence.length()>
	//   17   31:aload_1         
	//   18   32:invokeinterface #151 <Method int CharSequence.length()>
	//   19   37:isub            
	//   20   38:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   21   43:areturn         
		else
			return charsequence.subSequence(0, charsequence.length());
	//   22   44:aload_0         
	//   23   45:iconst_0        
	//   24   46:aload_0         
	//   25   47:invokeinterface #151 <Method int CharSequence.length()>
	//   26   52:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   27   57:areturn         
	}

	public static final String removeSuffix(String s, CharSequence charsequence)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "suffix");
	//    3    6:aload_1         
	//    4    7:ldc1            #220 <String "suffix">
	//    5    9:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(StringsKt.endsWith$default((CharSequence)s, charsequence, false, 2, ((Object) (null))))
	//*   6   12:aload_0         
	//*   7   13:checkcast       #148 <Class CharSequence>
	//*   8   16:aload_1         
	//*   9   17:iconst_0        
	//*  10   18:iconst_2        
	//*  11   19:aconst_null     
	//*  12   20:invokestatic    #552 <Method boolean StringsKt.endsWith$default(CharSequence, CharSequence, boolean, int, Object)>
	//*  13   23:ifeq            52
		{
			s = s.substring(0, s.length() - charsequence.length());
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:aload_0         
	//   17   29:invokevirtual   #305 <Method int String.length()>
	//   18   32:aload_1         
	//   19   33:invokeinterface #151 <Method int CharSequence.length()>
	//   20   38:isub            
	//   21   39:invokevirtual   #555 <Method String String.substring(int, int)>
	//   22   42:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
	//   23   43:aload_0         
	//   24   44:ldc2            #557 <String "(this as java.lang.Strin\u2026ing(startIndex, endIndex)">
	//   25   47:invokestatic    #517 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   26   50:aload_0         
	//   27   51:areturn         
		} else
		{
			return s;
	//   28   52:aload_0         
	//   29   53:areturn         
		}
	}

	public static final CharSequence removeSurrounding(CharSequence charsequence, CharSequence charsequence1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence1)), "delimiter");
	//    3    6:aload_1         
	//    4    7:ldc2            #558 <String "delimiter">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return StringsKt.removeSurrounding(charsequence, charsequence1, charsequence1);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:aload_1         
	//    9   16:invokestatic    #561 <Method CharSequence StringsKt.removeSurrounding(CharSequence, CharSequence, CharSequence)>
	//   10   19:areturn         
	}

	public static final CharSequence removeSurrounding(CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence1)), "prefix");
	//    3    6:aload_1         
	//    4    7:ldc2            #505 <String "prefix">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence2)), "suffix");
	//    6   13:aload_2         
	//    7   14:ldc1            #220 <String "suffix">
	//    8   16:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(charsequence.length() >= charsequence1.length() + charsequence2.length() && StringsKt.startsWith$default(charsequence, charsequence1, false, 2, ((Object) (null))) && StringsKt.endsWith$default(charsequence, charsequence2, false, 2, ((Object) (null))))
	//*   9   19:aload_0         
	//*  10   20:invokeinterface #151 <Method int CharSequence.length()>
	//*  11   25:aload_1         
	//*  12   26:invokeinterface #151 <Method int CharSequence.length()>
	//*  13   31:aload_2         
	//*  14   32:invokeinterface #151 <Method int CharSequence.length()>
	//*  15   37:iadd            
	//*  16   38:icmplt          89
	//*  17   41:aload_0         
	//*  18   42:aload_1         
	//*  19   43:iconst_0        
	//*  20   44:iconst_2        
	//*  21   45:aconst_null     
	//*  22   46:invokestatic    #508 <Method boolean StringsKt.startsWith$default(CharSequence, CharSequence, boolean, int, Object)>
	//*  23   49:ifeq            89
	//*  24   52:aload_0         
	//*  25   53:aload_2         
	//*  26   54:iconst_0        
	//*  27   55:iconst_2        
	//*  28   56:aconst_null     
	//*  29   57:invokestatic    #552 <Method boolean StringsKt.endsWith$default(CharSequence, CharSequence, boolean, int, Object)>
	//*  30   60:ifeq            89
			return charsequence.subSequence(charsequence1.length(), charsequence.length() - charsequence2.length());
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:invokeinterface #151 <Method int CharSequence.length()>
	//   34   70:aload_0         
	//   35   71:invokeinterface #151 <Method int CharSequence.length()>
	//   36   76:aload_2         
	//   37   77:invokeinterface #151 <Method int CharSequence.length()>
	//   38   82:isub            
	//   39   83:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   40   88:areturn         
		else
			return charsequence.subSequence(0, charsequence.length());
	//   41   89:aload_0         
	//   42   90:iconst_0        
	//   43   91:aload_0         
	//   44   92:invokeinterface #151 <Method int CharSequence.length()>
	//   45   97:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   46  102:areturn         
	}

	public static final String removeSurrounding(String s, CharSequence charsequence)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "delimiter");
	//    3    6:aload_1         
	//    4    7:ldc2            #558 <String "delimiter">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return StringsKt.removeSurrounding(s, charsequence, charsequence);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:aload_1         
	//    9   16:invokestatic    #564 <Method String StringsKt.removeSurrounding(String, CharSequence, CharSequence)>
	//   10   19:areturn         
	}

	public static final String removeSurrounding(String s, CharSequence charsequence, CharSequence charsequence1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "prefix");
	//    3    6:aload_1         
	//    4    7:ldc2            #505 <String "prefix">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence1)), "suffix");
	//    6   13:aload_2         
	//    7   14:ldc1            #220 <String "suffix">
	//    8   16:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(s.length() >= charsequence.length() + charsequence1.length())
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #305 <Method int String.length()>
	//*  11   23:aload_1         
	//*  12   24:invokeinterface #151 <Method int CharSequence.length()>
	//*  13   29:aload_2         
	//*  14   30:invokeinterface #151 <Method int CharSequence.length()>
	//*  15   35:iadd            
	//*  16   36:icmplt          97
		{
			CharSequence charsequence2 = (CharSequence)s;
	//   17   39:aload_0         
	//   18   40:checkcast       #148 <Class CharSequence>
	//   19   43:astore_3        
			if(StringsKt.startsWith$default(charsequence2, charsequence, false, 2, ((Object) (null))) && StringsKt.endsWith$default(charsequence2, charsequence1, false, 2, ((Object) (null))))
	//*  20   44:aload_3         
	//*  21   45:aload_1         
	//*  22   46:iconst_0        
	//*  23   47:iconst_2        
	//*  24   48:aconst_null     
	//*  25   49:invokestatic    #508 <Method boolean StringsKt.startsWith$default(CharSequence, CharSequence, boolean, int, Object)>
	//*  26   52:ifeq            97
	//*  27   55:aload_3         
	//*  28   56:aload_2         
	//*  29   57:iconst_0        
	//*  30   58:iconst_2        
	//*  31   59:aconst_null     
	//*  32   60:invokestatic    #552 <Method boolean StringsKt.endsWith$default(CharSequence, CharSequence, boolean, int, Object)>
	//*  33   63:ifeq            97
			{
				s = s.substring(charsequence.length(), s.length() - charsequence1.length());
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:invokeinterface #151 <Method int CharSequence.length()>
	//   37   73:aload_0         
	//   38   74:invokevirtual   #305 <Method int String.length()>
	//   39   77:aload_2         
	//   40   78:invokeinterface #151 <Method int CharSequence.length()>
	//   41   83:isub            
	//   42   84:invokevirtual   #555 <Method String String.substring(int, int)>
	//   43   87:astore_0        
				Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
	//   44   88:aload_0         
	//   45   89:ldc2            #557 <String "(this as java.lang.Strin\u2026ing(startIndex, endIndex)">
	//   46   92:invokestatic    #517 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
				return s;
	//   47   95:aload_0         
	//   48   96:areturn         
			}
		}
		return s;
	//   49   97:aload_0         
	//   50   98:areturn         
	}

	private static final String replace(CharSequence charsequence, Regex regex, String s)
	{
		return regex.replace(charsequence, s);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #568 <Method String Regex.replace(CharSequence, String)>
	//    4    6:areturn         
	}

	private static final String replace(CharSequence charsequence, Regex regex, Function1 function1)
	{
		return regex.replace(charsequence, function1);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #572 <Method String Regex.replace(CharSequence, Function1)>
	//    4    6:areturn         
	}

	public static final String replaceAfter(String s, char c, String s1, String s2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "replacement");
	//    3    6:aload_2         
	//    4    7:ldc2            #575 <String "replacement">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s2)), "missingDelimiterValue");
	//    6   13:aload_3         
	//    7   14:ldc2            #576 <String "missingDelimiterValue">
	//    8   17:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		CharSequence charsequence = (CharSequence)s;
	//    9   20:aload_0         
	//   10   21:checkcast       #148 <Class CharSequence>
	//   11   24:astore          5
		int i = StringsKt.indexOf$default(charsequence, c, 0, false, 6, ((Object) (null)));
	//   12   26:aload           5
	//   13   28:iload_1         
	//   14   29:iconst_0        
	//   15   30:iconst_0        
	//   16   31:bipush          6
	//   17   33:aconst_null     
	//   18   34:invokestatic    #192 <Method int StringsKt.indexOf$default(CharSequence, char, int, boolean, int, Object)>
	//   19   37:istore          4
		if(i == -1)
	//*  20   39:iload           4
	//*  21   41:iconst_m1       
	//*  22   42:icmpne          47
			return s2;
	//   23   45:aload_3         
	//   24   46:areturn         
		else
			return ((Object) (StringsKt.replaceRange(charsequence, i + 1, s.length(), (CharSequence)s1))).toString();
	//   25   47:aload           5
	//   26   49:iload           4
	//   27   51:iconst_1        
	//   28   52:iadd            
	//   29   53:aload_0         
	//   30   54:invokevirtual   #305 <Method int String.length()>
	//   31   57:aload_2         
	//   32   58:checkcast       #148 <Class CharSequence>
	//   33   61:invokestatic    #579 <Method CharSequence StringsKt.replaceRange(CharSequence, int, int, CharSequence)>
	//   34   64:invokevirtual   #180 <Method String Object.toString()>
	//   35   67:areturn         
	}

	public static final String replaceAfter(String s, String s1, String s2, String s3)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "delimiter");
	//    3    6:aload_1         
	//    4    7:ldc2            #558 <String "delimiter">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s2)), "replacement");
	//    6   13:aload_2         
	//    7   14:ldc2            #575 <String "replacement">
	//    8   17:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s3)), "missingDelimiterValue");
	//    9   20:aload_3         
	//   10   21:ldc2            #576 <String "missingDelimiterValue">
	//   11   24:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		CharSequence charsequence = (CharSequence)s;
	//   12   27:aload_0         
	//   13   28:checkcast       #148 <Class CharSequence>
	//   14   31:astore          5
		int i = StringsKt.indexOf$default(charsequence, s1, 0, false, 6, ((Object) (null)));
	//   15   33:aload           5
	//   16   35:aload_1         
	//   17   36:iconst_0        
	//   18   37:iconst_0        
	//   19   38:bipush          6
	//   20   40:aconst_null     
	//   21   41:invokestatic    #198 <Method int StringsKt.indexOf$default(CharSequence, String, int, boolean, int, Object)>
	//   22   44:istore          4
		if(i == -1)
	//*  23   46:iload           4
	//*  24   48:iconst_m1       
	//*  25   49:icmpne          54
			return s3;
	//   26   52:aload_3         
	//   27   53:areturn         
		else
			return ((Object) (StringsKt.replaceRange(charsequence, i + s1.length(), s.length(), (CharSequence)s2))).toString();
	//   28   54:aload           5
	//   29   56:iload           4
	//   30   58:aload_1         
	//   31   59:invokevirtual   #305 <Method int String.length()>
	//   32   62:iadd            
	//   33   63:aload_0         
	//   34   64:invokevirtual   #305 <Method int String.length()>
	//   35   67:aload_2         
	//   36   68:checkcast       #148 <Class CharSequence>
	//   37   71:invokestatic    #579 <Method CharSequence StringsKt.replaceRange(CharSequence, int, int, CharSequence)>
	//   38   74:invokevirtual   #180 <Method String Object.toString()>
	//   39   77:areturn         
	}

	public static String replaceAfter$default(String s, char c, String s1, String s2, int i, Object obj)
	{
		if((i & 4) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_4        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			s2 = s;
	//    4    7:aload_0         
	//    5    8:astore_3        
		return StringsKt.replaceAfter(s, c, s1, s2);
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:aload_2         
	//    9   12:aload_3         
	//   10   13:invokestatic    #584 <Method String StringsKt.replaceAfter(String, char, String, String)>
	//   11   16:areturn         
	}

	public static String replaceAfter$default(String s, String s1, String s2, String s3, int i, Object obj)
	{
		if((i & 4) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_4        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			s3 = s;
	//    4    7:aload_0         
	//    5    8:astore_3        
		return StringsKt.replaceAfter(s, s1, s2, s3);
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:aload_2         
	//    9   12:aload_3         
	//   10   13:invokestatic    #587 <Method String StringsKt.replaceAfter(String, String, String, String)>
	//   11   16:areturn         
	}

	public static final String replaceAfterLast(String s, char c, String s1, String s2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "replacement");
	//    3    6:aload_2         
	//    4    7:ldc2            #575 <String "replacement">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s2)), "missingDelimiterValue");
	//    6   13:aload_3         
	//    7   14:ldc2            #576 <String "missingDelimiterValue">
	//    8   17:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		CharSequence charsequence = (CharSequence)s;
	//    9   20:aload_0         
	//   10   21:checkcast       #148 <Class CharSequence>
	//   11   24:astore          5
		int i = StringsKt.lastIndexOf$default(charsequence, c, 0, false, 6, ((Object) (null)));
	//   12   26:aload           5
	//   13   28:iload_1         
	//   14   29:iconst_0        
	//   15   30:iconst_0        
	//   16   31:bipush          6
	//   17   33:aconst_null     
	//   18   34:invokestatic    #589 <Method int StringsKt.lastIndexOf$default(CharSequence, char, int, boolean, int, Object)>
	//   19   37:istore          4
		if(i == -1)
	//*  20   39:iload           4
	//*  21   41:iconst_m1       
	//*  22   42:icmpne          47
			return s2;
	//   23   45:aload_3         
	//   24   46:areturn         
		else
			return ((Object) (StringsKt.replaceRange(charsequence, i + 1, s.length(), (CharSequence)s1))).toString();
	//   25   47:aload           5
	//   26   49:iload           4
	//   27   51:iconst_1        
	//   28   52:iadd            
	//   29   53:aload_0         
	//   30   54:invokevirtual   #305 <Method int String.length()>
	//   31   57:aload_2         
	//   32   58:checkcast       #148 <Class CharSequence>
	//   33   61:invokestatic    #579 <Method CharSequence StringsKt.replaceRange(CharSequence, int, int, CharSequence)>
	//   34   64:invokevirtual   #180 <Method String Object.toString()>
	//   35   67:areturn         
	}

	public static final String replaceAfterLast(String s, String s1, String s2, String s3)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "delimiter");
	//    3    6:aload_1         
	//    4    7:ldc2            #558 <String "delimiter">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s2)), "replacement");
	//    6   13:aload_2         
	//    7   14:ldc2            #575 <String "replacement">
	//    8   17:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s3)), "missingDelimiterValue");
	//    9   20:aload_3         
	//   10   21:ldc2            #576 <String "missingDelimiterValue">
	//   11   24:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		CharSequence charsequence = (CharSequence)s;
	//   12   27:aload_0         
	//   13   28:checkcast       #148 <Class CharSequence>
	//   14   31:astore          5
		int i = StringsKt.lastIndexOf$default(charsequence, s1, 0, false, 6, ((Object) (null)));
	//   15   33:aload           5
	//   16   35:aload_1         
	//   17   36:iconst_0        
	//   18   37:iconst_0        
	//   19   38:bipush          6
	//   20   40:aconst_null     
	//   21   41:invokestatic    #251 <Method int StringsKt.lastIndexOf$default(CharSequence, String, int, boolean, int, Object)>
	//   22   44:istore          4
		if(i == -1)
	//*  23   46:iload           4
	//*  24   48:iconst_m1       
	//*  25   49:icmpne          54
			return s3;
	//   26   52:aload_3         
	//   27   53:areturn         
		else
			return ((Object) (StringsKt.replaceRange(charsequence, i + s1.length(), s.length(), (CharSequence)s2))).toString();
	//   28   54:aload           5
	//   29   56:iload           4
	//   30   58:aload_1         
	//   31   59:invokevirtual   #305 <Method int String.length()>
	//   32   62:iadd            
	//   33   63:aload_0         
	//   34   64:invokevirtual   #305 <Method int String.length()>
	//   35   67:aload_2         
	//   36   68:checkcast       #148 <Class CharSequence>
	//   37   71:invokestatic    #579 <Method CharSequence StringsKt.replaceRange(CharSequence, int, int, CharSequence)>
	//   38   74:invokevirtual   #180 <Method String Object.toString()>
	//   39   77:areturn         
	}

	public static String replaceAfterLast$default(String s, char c, String s1, String s2, int i, Object obj)
	{
		if((i & 4) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_4        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			s2 = s;
	//    4    7:aload_0         
	//    5    8:astore_3        
		return StringsKt.replaceAfterLast(s, c, s1, s2);
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:aload_2         
	//    9   12:aload_3         
	//   10   13:invokestatic    #592 <Method String StringsKt.replaceAfterLast(String, char, String, String)>
	//   11   16:areturn         
	}

	public static String replaceAfterLast$default(String s, String s1, String s2, String s3, int i, Object obj)
	{
		if((i & 4) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_4        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			s3 = s;
	//    4    7:aload_0         
	//    5    8:astore_3        
		return StringsKt.replaceAfterLast(s, s1, s2, s3);
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:aload_2         
	//    9   12:aload_3         
	//   10   13:invokestatic    #594 <Method String StringsKt.replaceAfterLast(String, String, String, String)>
	//   11   16:areturn         
	}

	public static final String replaceBefore(String s, char c, String s1, String s2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "replacement");
	//    3    6:aload_2         
	//    4    7:ldc2            #575 <String "replacement">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s2)), "missingDelimiterValue");
	//    6   13:aload_3         
	//    7   14:ldc2            #576 <String "missingDelimiterValue">
	//    8   17:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		s = ((String) ((CharSequence)s));
	//    9   20:aload_0         
	//   10   21:checkcast       #148 <Class CharSequence>
	//   11   24:astore_0        
		int i = StringsKt.indexOf$default(((CharSequence) (s)), c, 0, false, 6, ((Object) (null)));
	//   12   25:aload_0         
	//   13   26:iload_1         
	//   14   27:iconst_0        
	//   15   28:iconst_0        
	//   16   29:bipush          6
	//   17   31:aconst_null     
	//   18   32:invokestatic    #192 <Method int StringsKt.indexOf$default(CharSequence, char, int, boolean, int, Object)>
	//   19   35:istore          4
		if(i == -1)
	//*  20   37:iload           4
	//*  21   39:iconst_m1       
	//*  22   40:icmpne          45
			return s2;
	//   23   43:aload_3         
	//   24   44:areturn         
		else
			return ((Object) (StringsKt.replaceRange(((CharSequence) (s)), 0, i, (CharSequence)s1))).toString();
	//   25   45:aload_0         
	//   26   46:iconst_0        
	//   27   47:iload           4
	//   28   49:aload_2         
	//   29   50:checkcast       #148 <Class CharSequence>
	//   30   53:invokestatic    #579 <Method CharSequence StringsKt.replaceRange(CharSequence, int, int, CharSequence)>
	//   31   56:invokevirtual   #180 <Method String Object.toString()>
	//   32   59:areturn         
	}

	public static final String replaceBefore(String s, String s1, String s2, String s3)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "delimiter");
	//    3    6:aload_1         
	//    4    7:ldc2            #558 <String "delimiter">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s2)), "replacement");
	//    6   13:aload_2         
	//    7   14:ldc2            #575 <String "replacement">
	//    8   17:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s3)), "missingDelimiterValue");
	//    9   20:aload_3         
	//   10   21:ldc2            #576 <String "missingDelimiterValue">
	//   11   24:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		s = ((String) ((CharSequence)s));
	//   12   27:aload_0         
	//   13   28:checkcast       #148 <Class CharSequence>
	//   14   31:astore_0        
		int i = StringsKt.indexOf$default(((CharSequence) (s)), s1, 0, false, 6, ((Object) (null)));
	//   15   32:aload_0         
	//   16   33:aload_1         
	//   17   34:iconst_0        
	//   18   35:iconst_0        
	//   19   36:bipush          6
	//   20   38:aconst_null     
	//   21   39:invokestatic    #198 <Method int StringsKt.indexOf$default(CharSequence, String, int, boolean, int, Object)>
	//   22   42:istore          4
		if(i == -1)
	//*  23   44:iload           4
	//*  24   46:iconst_m1       
	//*  25   47:icmpne          52
			return s3;
	//   26   50:aload_3         
	//   27   51:areturn         
		else
			return ((Object) (StringsKt.replaceRange(((CharSequence) (s)), 0, i, (CharSequence)s2))).toString();
	//   28   52:aload_0         
	//   29   53:iconst_0        
	//   30   54:iload           4
	//   31   56:aload_2         
	//   32   57:checkcast       #148 <Class CharSequence>
	//   33   60:invokestatic    #579 <Method CharSequence StringsKt.replaceRange(CharSequence, int, int, CharSequence)>
	//   34   63:invokevirtual   #180 <Method String Object.toString()>
	//   35   66:areturn         
	}

	public static String replaceBefore$default(String s, char c, String s1, String s2, int i, Object obj)
	{
		if((i & 4) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_4        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			s2 = s;
	//    4    7:aload_0         
	//    5    8:astore_3        
		return StringsKt.replaceBefore(s, c, s1, s2);
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:aload_2         
	//    9   12:aload_3         
	//   10   13:invokestatic    #597 <Method String StringsKt.replaceBefore(String, char, String, String)>
	//   11   16:areturn         
	}

	public static String replaceBefore$default(String s, String s1, String s2, String s3, int i, Object obj)
	{
		if((i & 4) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_4        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			s3 = s;
	//    4    7:aload_0         
	//    5    8:astore_3        
		return StringsKt.replaceBefore(s, s1, s2, s3);
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:aload_2         
	//    9   12:aload_3         
	//   10   13:invokestatic    #599 <Method String StringsKt.replaceBefore(String, String, String, String)>
	//   11   16:areturn         
	}

	public static final String replaceBeforeLast(String s, char c, String s1, String s2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "replacement");
	//    3    6:aload_2         
	//    4    7:ldc2            #575 <String "replacement">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s2)), "missingDelimiterValue");
	//    6   13:aload_3         
	//    7   14:ldc2            #576 <String "missingDelimiterValue">
	//    8   17:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		s = ((String) ((CharSequence)s));
	//    9   20:aload_0         
	//   10   21:checkcast       #148 <Class CharSequence>
	//   11   24:astore_0        
		int i = StringsKt.lastIndexOf$default(((CharSequence) (s)), c, 0, false, 6, ((Object) (null)));
	//   12   25:aload_0         
	//   13   26:iload_1         
	//   14   27:iconst_0        
	//   15   28:iconst_0        
	//   16   29:bipush          6
	//   17   31:aconst_null     
	//   18   32:invokestatic    #589 <Method int StringsKt.lastIndexOf$default(CharSequence, char, int, boolean, int, Object)>
	//   19   35:istore          4
		if(i == -1)
	//*  20   37:iload           4
	//*  21   39:iconst_m1       
	//*  22   40:icmpne          45
			return s2;
	//   23   43:aload_3         
	//   24   44:areturn         
		else
			return ((Object) (StringsKt.replaceRange(((CharSequence) (s)), 0, i, (CharSequence)s1))).toString();
	//   25   45:aload_0         
	//   26   46:iconst_0        
	//   27   47:iload           4
	//   28   49:aload_2         
	//   29   50:checkcast       #148 <Class CharSequence>
	//   30   53:invokestatic    #579 <Method CharSequence StringsKt.replaceRange(CharSequence, int, int, CharSequence)>
	//   31   56:invokevirtual   #180 <Method String Object.toString()>
	//   32   59:areturn         
	}

	public static final String replaceBeforeLast(String s, String s1, String s2, String s3)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "delimiter");
	//    3    6:aload_1         
	//    4    7:ldc2            #558 <String "delimiter">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s2)), "replacement");
	//    6   13:aload_2         
	//    7   14:ldc2            #575 <String "replacement">
	//    8   17:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s3)), "missingDelimiterValue");
	//    9   20:aload_3         
	//   10   21:ldc2            #576 <String "missingDelimiterValue">
	//   11   24:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		s = ((String) ((CharSequence)s));
	//   12   27:aload_0         
	//   13   28:checkcast       #148 <Class CharSequence>
	//   14   31:astore_0        
		int i = StringsKt.lastIndexOf$default(((CharSequence) (s)), s1, 0, false, 6, ((Object) (null)));
	//   15   32:aload_0         
	//   16   33:aload_1         
	//   17   34:iconst_0        
	//   18   35:iconst_0        
	//   19   36:bipush          6
	//   20   38:aconst_null     
	//   21   39:invokestatic    #251 <Method int StringsKt.lastIndexOf$default(CharSequence, String, int, boolean, int, Object)>
	//   22   42:istore          4
		if(i == -1)
	//*  23   44:iload           4
	//*  24   46:iconst_m1       
	//*  25   47:icmpne          52
			return s3;
	//   26   50:aload_3         
	//   27   51:areturn         
		else
			return ((Object) (StringsKt.replaceRange(((CharSequence) (s)), 0, i, (CharSequence)s2))).toString();
	//   28   52:aload_0         
	//   29   53:iconst_0        
	//   30   54:iload           4
	//   31   56:aload_2         
	//   32   57:checkcast       #148 <Class CharSequence>
	//   33   60:invokestatic    #579 <Method CharSequence StringsKt.replaceRange(CharSequence, int, int, CharSequence)>
	//   34   63:invokevirtual   #180 <Method String Object.toString()>
	//   35   66:areturn         
	}

	public static String replaceBeforeLast$default(String s, char c, String s1, String s2, int i, Object obj)
	{
		if((i & 4) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_4        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			s2 = s;
	//    4    7:aload_0         
	//    5    8:astore_3        
		return StringsKt.replaceBeforeLast(s, c, s1, s2);
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:aload_2         
	//    9   12:aload_3         
	//   10   13:invokestatic    #602 <Method String StringsKt.replaceBeforeLast(String, char, String, String)>
	//   11   16:areturn         
	}

	public static String replaceBeforeLast$default(String s, String s1, String s2, String s3, int i, Object obj)
	{
		if((i & 4) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_4        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			s3 = s;
	//    4    7:aload_0         
	//    5    8:astore_3        
		return StringsKt.replaceBeforeLast(s, s1, s2, s3);
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:aload_2         
	//    9   12:aload_3         
	//   10   13:invokestatic    #604 <Method String StringsKt.replaceBeforeLast(String, String, String, String)>
	//   11   16:areturn         
	}

	private static final String replaceFirst(CharSequence charsequence, Regex regex, String s)
	{
		return regex.replaceFirst(charsequence, s);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #606 <Method String Regex.replaceFirst(CharSequence, String)>
	//    4    6:areturn         
	}

	public static final CharSequence replaceRange(CharSequence charsequence, int i, int j, CharSequence charsequence1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence1)), "replacement");
	//    3    6:aload_3         
	//    4    7:ldc2            #575 <String "replacement">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(j < i)
	//*   6   13:iload_2         
	//*   7   14:iload_1         
	//*   8   15:icmpge          77
		{
			charsequence = ((CharSequence) (new StringBuilder()));
	//    9   18:new             #426 <Class StringBuilder>
	//   10   21:dup             
	//   11   22:invokespecial   #427 <Method void StringBuilder()>
	//   12   25:astore_0        
			((StringBuilder) (charsequence)).append("End index (");
	//   13   26:aload_0         
	//   14   27:ldc2            #520 <String "End index (">
	//   15   30:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			((StringBuilder) (charsequence)).append(j);
	//   17   34:aload_0         
	//   18   35:iload_2         
	//   19   36:invokevirtual   #436 <Method StringBuilder StringBuilder.append(int)>
	//   20   39:pop             
			((StringBuilder) (charsequence)).append(") is less than start index (");
	//   21   40:aload_0         
	//   22   41:ldc2            #522 <String ") is less than start index (">
	//   23   44:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
			((StringBuilder) (charsequence)).append(i);
	//   25   48:aload_0         
	//   26   49:iload_1         
	//   27   50:invokevirtual   #436 <Method StringBuilder StringBuilder.append(int)>
	//   28   53:pop             
			((StringBuilder) (charsequence)).append(").");
	//   29   54:aload_0         
	//   30   55:ldc2            #524 <String ").">
	//   31   58:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//   32   61:pop             
			throw (Throwable)new IndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//   33   62:new             #526 <Class IndexOutOfBoundsException>
	//   34   65:dup             
	//   35   66:aload_0         
	//   36   67:invokevirtual   #441 <Method String StringBuilder.toString()>
	//   37   70:invokespecial   #527 <Method void IndexOutOfBoundsException(String)>
	//   38   73:checkcast       #446 <Class Throwable>
	//   39   76:athrow          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   40   77:new             #426 <Class StringBuilder>
	//   41   80:dup             
	//   42   81:invokespecial   #427 <Method void StringBuilder()>
	//   43   84:astore          4
			stringbuilder.append(charsequence, 0, i);
	//   44   86:aload           4
	//   45   88:aload_0         
	//   46   89:iconst_0        
	//   47   90:iload_1         
	//   48   91:invokevirtual   #530 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   49   94:pop             
			stringbuilder.append(charsequence1);
	//   50   95:aload           4
	//   51   97:aload_3         
	//   52   98:invokevirtual   #452 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   53  101:pop             
			stringbuilder.append(charsequence, j, charsequence.length());
	//   54  102:aload           4
	//   55  104:aload_0         
	//   56  105:iload_2         
	//   57  106:aload_0         
	//   58  107:invokeinterface #151 <Method int CharSequence.length()>
	//   59  112:invokevirtual   #530 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   60  115:pop             
			return (CharSequence)stringbuilder;
	//   61  116:aload           4
	//   62  118:checkcast       #148 <Class CharSequence>
	//   63  121:areturn         
		}
	}

	public static final CharSequence replaceRange(CharSequence charsequence, IntRange intrange, CharSequence charsequence1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (intrange)), "range");
	//    3    6:aload_1         
	//    4    7:ldc2            #532 <String "range">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence1)), "replacement");
	//    6   13:aload_2         
	//    7   14:ldc2            #575 <String "replacement">
	//    8   17:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return StringsKt.replaceRange(charsequence, intrange.getStart().intValue(), intrange.getEndInclusive().intValue() + 1, charsequence1);
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:invokevirtual   #536 <Method Integer IntRange.getStart()>
	//   12   25:invokevirtual   #364 <Method int Integer.intValue()>
	//   13   28:aload_1         
	//   14   29:invokevirtual   #539 <Method Integer IntRange.getEndInclusive()>
	//   15   32:invokevirtual   #364 <Method int Integer.intValue()>
	//   16   35:iconst_1        
	//   17   36:iadd            
	//   18   37:aload_2         
	//   19   38:invokestatic    #579 <Method CharSequence StringsKt.replaceRange(CharSequence, int, int, CharSequence)>
	//   20   41:areturn         
	}

	private static final String replaceRange(String s, int i, int j, CharSequence charsequence)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
	//    2    4:new             #544 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc2            #546 <String "null cannot be cast to non-null type kotlin.CharSequence">
	//    5   11:invokespecial   #547 <Method void TypeCastException(String)>
	//    6   14:athrow          
		else
			return ((Object) (StringsKt.replaceRange((CharSequence)s, i, j, charsequence))).toString();
	//    7   15:aload_0         
	//    8   16:checkcast       #148 <Class CharSequence>
	//    9   19:iload_1         
	//   10   20:iload_2         
	//   11   21:aload_3         
	//   12   22:invokestatic    #579 <Method CharSequence StringsKt.replaceRange(CharSequence, int, int, CharSequence)>
	//   13   25:invokevirtual   #180 <Method String Object.toString()>
	//   14   28:areturn         
	}

	private static final String replaceRange(String s, IntRange intrange, CharSequence charsequence)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
	//    2    4:new             #544 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc2            #546 <String "null cannot be cast to non-null type kotlin.CharSequence">
	//    5   11:invokespecial   #547 <Method void TypeCastException(String)>
	//    6   14:athrow          
		else
			return ((Object) (StringsKt.replaceRange((CharSequence)s, intrange, charsequence))).toString();
	//    7   15:aload_0         
	//    8   16:checkcast       #148 <Class CharSequence>
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokestatic    #611 <Method CharSequence StringsKt.replaceRange(CharSequence, IntRange, CharSequence)>
	//   12   24:invokevirtual   #180 <Method String Object.toString()>
	//   13   27:areturn         
	}

	private static final List split(CharSequence charsequence, Regex regex, int i)
	{
		return regex.split(charsequence, i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #615 <Method List Regex.split(CharSequence, int)>
	//    4    6:areturn         
	}

	public static final List split(CharSequence charsequence, char ac[], boolean flag, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (ac)), "delimiters");
	//    3    6:aload_1         
	//    4    7:ldc2            #618 <String "delimiters">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(ac.length == 1)
	//*   6   13:aload_1         
	//*   7   14:arraylength     
	//*   8   15:iconst_1        
	//*   9   16:icmpne          32
			return split$StringsKt__StringsKt(charsequence, String.valueOf(ac[0]), flag, i);
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:iconst_0        
	//   13   22:caload          
	//   14   23:invokestatic    #621 <Method String String.valueOf(char)>
	//   15   26:iload_2         
	//   16   27:iload_3         
	//   17   28:invokestatic    #624 <Method List split$StringsKt__StringsKt(CharSequence, String, boolean, int)>
	//   18   31:areturn         
		Object obj = ((Object) (SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charsequence, ac, 0, flag, i, 2, ((Object) (null))))));
	//   19   32:aload_0         
	//   20   33:aload_1         
	//   21   34:iconst_0        
	//   22   35:iload_2         
	//   23   36:iload_3         
	//   24   37:iconst_2        
	//   25   38:aconst_null     
	//   26   39:invokestatic    #626 <Method Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence, char[], int, boolean, int, int, Object)>
	//   27   42:invokestatic    #630 <Method Iterable SequencesKt.asIterable(Sequence)>
	//   28   45:astore          4
		ac = ((char []) ((Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(((Iterable) (obj)), 10))));
	//   29   47:new             #632 <Class ArrayList>
	//   30   50:dup             
	//   31   51:aload           4
	//   32   53:bipush          10
	//   33   55:invokestatic    #636 <Method int CollectionsKt.collectionSizeOrDefault(Iterable, int)>
	//   34   58:invokespecial   #637 <Method void ArrayList(int)>
	//   35   61:checkcast       #237 <Class Collection>
	//   36   64:astore_1        
		for(obj = ((Object) (((Iterable) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Collection) (ac)).add(((Object) (StringsKt.substring(charsequence, (IntRange)((Iterator) (obj)).next())))));
	//   37   65:aload           4
	//   38   67:invokeinterface #294 <Method Iterator Iterable.iterator()>
	//   39   72:astore          4
	//   40   74:aload           4
	//   41   76:invokeinterface #300 <Method boolean Iterator.hasNext()>
	//   42   81:ifeq            108
	//   43   84:aload_1         
	//   44   85:aload_0         
	//   45   86:aload           4
	//   46   88:invokeinterface #304 <Method Object Iterator.next()>
	//   47   93:checkcast       #265 <Class IntRange>
	//   48   96:invokestatic    #640 <Method String StringsKt.substring(CharSequence, IntRange)>
	//   49   99:invokeinterface #644 <Method boolean Collection.add(Object)>
	//   50  104:pop             
	//*  51  105:goto            74
		return (List)ac;
	//   52  108:aload_1         
	//   53  109:checkcast       #646 <Class List>
	//   54  112:areturn         
	}

	public static final List split(CharSequence charsequence, String as[], boolean flag, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (as)), "delimiters");
	//    3    6:aload_1         
	//    4    7:ldc2            #618 <String "delimiters">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		boolean flag1 = true;
	//    6   13:iconst_1        
	//    7   14:istore          4
		if(as.length == 1)
	//*   8   16:aload_1         
	//*   9   17:arraylength     
	//*  10   18:iconst_1        
	//*  11   19:icmpne          60
		{
			String s = as[0];
	//   12   22:aload_1         
	//   13   23:iconst_0        
	//   14   24:aaload          
	//   15   25:astore          5
			if(((CharSequence)s).length() != 0)
	//*  16   27:aload           5
	//*  17   29:checkcast       #148 <Class CharSequence>
	//*  18   32:invokeinterface #151 <Method int CharSequence.length()>
	//*  19   37:ifne            43
	//*  20   40:goto            46
				flag1 = false;
	//   21   43:iconst_0        
	//   22   44:istore          4
			if(!flag1)
	//*  23   46:iload           4
	//*  24   48:ifne            60
				return split$StringsKt__StringsKt(charsequence, s, flag, i);
	//   25   51:aload_0         
	//   26   52:aload           5
	//   27   54:iload_2         
	//   28   55:iload_3         
	//   29   56:invokestatic    #624 <Method List split$StringsKt__StringsKt(CharSequence, String, boolean, int)>
	//   30   59:areturn         
		}
		Object obj = ((Object) (SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charsequence, as, 0, flag, i, 2, ((Object) (null))))));
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:iconst_0        
	//   34   63:iload_2         
	//   35   64:iload_3         
	//   36   65:iconst_2        
	//   37   66:aconst_null     
	//   38   67:invokestatic    #649 <Method Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence, String[], int, boolean, int, int, Object)>
	//   39   70:invokestatic    #630 <Method Iterable SequencesKt.asIterable(Sequence)>
	//   40   73:astore          5
		as = ((String []) ((Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(((Iterable) (obj)), 10))));
	//   41   75:new             #632 <Class ArrayList>
	//   42   78:dup             
	//   43   79:aload           5
	//   44   81:bipush          10
	//   45   83:invokestatic    #636 <Method int CollectionsKt.collectionSizeOrDefault(Iterable, int)>
	//   46   86:invokespecial   #637 <Method void ArrayList(int)>
	//   47   89:checkcast       #237 <Class Collection>
	//   48   92:astore_1        
		for(obj = ((Object) (((Iterable) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Collection) (as)).add(((Object) (StringsKt.substring(charsequence, (IntRange)((Iterator) (obj)).next())))));
	//   49   93:aload           5
	//   50   95:invokeinterface #294 <Method Iterator Iterable.iterator()>
	//   51  100:astore          5
	//   52  102:aload           5
	//   53  104:invokeinterface #300 <Method boolean Iterator.hasNext()>
	//   54  109:ifeq            136
	//   55  112:aload_1         
	//   56  113:aload_0         
	//   57  114:aload           5
	//   58  116:invokeinterface #304 <Method Object Iterator.next()>
	//   59  121:checkcast       #265 <Class IntRange>
	//   60  124:invokestatic    #640 <Method String StringsKt.substring(CharSequence, IntRange)>
	//   61  127:invokeinterface #644 <Method boolean Collection.add(Object)>
	//   62  132:pop             
	//*  63  133:goto            102
		return (List)as;
	//   64  136:aload_1         
	//   65  137:checkcast       #646 <Class List>
	//   66  140:areturn         
	}

	private static final List split$StringsKt__StringsKt(CharSequence charsequence, String s, boolean flag, int i)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          6
		boolean flag1;
		if(i >= 0)
	//*   2    3:iload_3         
	//*   3    4:iflt            13
			flag1 = true;
	//    4    7:iconst_1        
	//    5    8:istore          4
		else
	//*   6   10:goto            16
			flag1 = false;
	//    7   13:iconst_0        
	//    8   14:istore          4
		if(!flag1)
	//*   9   16:iload           4
	//*  10   18:ifne            68
		{
			charsequence = ((CharSequence) (new StringBuilder()));
	//   11   21:new             #426 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #427 <Method void StringBuilder()>
	//   14   28:astore_0        
			((StringBuilder) (charsequence)).append("Limit must be non-negative, but was ");
	//   15   29:aload_0         
	//   16   30:ldc2            #471 <String "Limit must be non-negative, but was ">
	//   17   33:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			((StringBuilder) (charsequence)).append(i);
	//   19   37:aload_0         
	//   20   38:iload_3         
	//   21   39:invokevirtual   #436 <Method StringBuilder StringBuilder.append(int)>
	//   22   42:pop             
			((StringBuilder) (charsequence)).append('.');
	//   23   43:aload_0         
	//   24   44:bipush          46
	//   25   46:invokevirtual   #455 <Method StringBuilder StringBuilder.append(char)>
	//   26   49:pop             
			throw (Throwable)new IllegalArgumentException(((Object) (((StringBuilder) (charsequence)).toString())).toString());
	//   27   50:new             #440 <Class IllegalArgumentException>
	//   28   53:dup             
	//   29   54:aload_0         
	//   30   55:invokevirtual   #441 <Method String StringBuilder.toString()>
	//   31   58:invokevirtual   #180 <Method String Object.toString()>
	//   32   61:invokespecial   #444 <Method void IllegalArgumentException(String)>
	//   33   64:checkcast       #446 <Class Throwable>
	//   34   67:athrow          
		}
		int l = StringsKt.indexOf(charsequence, s, 0, flag);
	//   35   68:aload_0         
	//   36   69:aload_1         
	//   37   70:iconst_0        
	//   38   71:iload_2         
	//   39   72:invokestatic    #356 <Method int StringsKt.indexOf(CharSequence, String, int, boolean)>
	//   40   75:istore          7
		if(l != -1 && i != 1)
	//*  41   77:iload           7
	//*  42   79:iconst_m1       
	//*  43   80:icmpeq          236
	//*  44   83:iload_3         
	//*  45   84:iconst_1        
	//*  46   85:icmpne          91
	//*  47   88:goto            236
		{
			boolean flag2;
			if(i > 0)
	//*  48   91:iload_3         
	//*  49   92:ifle            101
				flag2 = true;
	//   50   95:iconst_1        
	//   51   96:istore          4
			else
	//*  52   98:goto            104
				flag2 = false;
	//   53  101:iconst_0        
	//   54  102:istore          4
			int j = 10;
	//   55  104:bipush          10
	//   56  106:istore          5
			if(flag2)
	//*  57  108:iload           4
	//*  58  110:ifeq            121
				j = RangesKt.coerceAtMost(i, 10);
	//   59  113:iload_3         
	//   60  114:bipush          10
	//   61  116:invokestatic    #278 <Method int RangesKt.coerceAtMost(int, int)>
	//   62  119:istore          5
			ArrayList arraylist = new ArrayList(j);
	//   63  121:new             #632 <Class ArrayList>
	//   64  124:dup             
	//   65  125:iload           5
	//   66  127:invokespecial   #637 <Method void ArrayList(int)>
	//   67  130:astore          9
			j = l;
	//   68  132:iload           7
	//   69  134:istore          5
			int i1;
			do
			{
				arraylist.add(((Object) (((Object) (charsequence.subSequence(k, j))).toString())));
	//   70  136:aload           9
	//   71  138:aload_0         
	//   72  139:iload           6
	//   73  141:iload           5
	//   74  143:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   75  148:invokevirtual   #180 <Method String Object.toString()>
	//   76  151:invokevirtual   #651 <Method boolean ArrayList.add(Object)>
	//   77  154:pop             
				l = s.length() + j;
	//   78  155:aload_1         
	//   79  156:invokevirtual   #305 <Method int String.length()>
	//   80  159:iload           5
	//   81  161:iadd            
	//   82  162:istore          7
				if(flag2 && arraylist.size() == i - 1)
	//*  83  164:iload           4
	//*  84  166:ifeq            183
	//*  85  169:aload           9
	//*  86  171:invokevirtual   #652 <Method int ArrayList.size()>
	//*  87  174:iload_3         
	//*  88  175:iconst_1        
	//*  89  176:isub            
	//*  90  177:icmpne          183
					break;
	//   91  180:goto            207
				i1 = StringsKt.indexOf(charsequence, s, l, flag);
	//   92  183:aload_0         
	//   93  184:aload_1         
	//   94  185:iload           7
	//   95  187:iload_2         
	//   96  188:invokestatic    #356 <Method int StringsKt.indexOf(CharSequence, String, int, boolean)>
	//   97  191:istore          8
				k = l;
	//   98  193:iload           7
	//   99  195:istore          6
				j = i1;
	//  100  197:iload           8
	//  101  199:istore          5
			} while(i1 != -1);
	//  102  201:iload           8
	//  103  203:iconst_m1       
	//  104  204:icmpne          136
			arraylist.add(((Object) (((Object) (charsequence.subSequence(l, charsequence.length()))).toString())));
	//  105  207:aload           9
	//  106  209:aload_0         
	//  107  210:iload           7
	//  108  212:aload_0         
	//  109  213:invokeinterface #151 <Method int CharSequence.length()>
	//  110  218:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//  111  223:invokevirtual   #180 <Method String Object.toString()>
	//  112  226:invokevirtual   #651 <Method boolean ArrayList.add(Object)>
	//  113  229:pop             
			return (List)arraylist;
	//  114  230:aload           9
	//  115  232:checkcast       #646 <Class List>
	//  116  235:areturn         
		} else
		{
			return CollectionsKt.listOf(((Object) (((Object) (charsequence)).toString())));
	//  117  236:aload_0         
	//  118  237:invokevirtual   #180 <Method String Object.toString()>
	//  119  240:invokestatic    #656 <Method List CollectionsKt.listOf(Object)>
	//  120  243:areturn         
		}
	}

	static List split$default(CharSequence charsequence, Regex regex, int i, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			i = 0;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		return regex.split(charsequence, i);
	//    6    8:aload_1         
	//    7    9:aload_0         
	//    8   10:iload_2         
	//    9   11:invokevirtual   #615 <Method List Regex.split(CharSequence, int)>
	//   10   14:areturn         
	}

	public static List split$default(CharSequence charsequence, char ac[], boolean flag, int i, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			flag = false;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		if((j & 4) != 0)
	//*   6    9:iload           4
	//*   7   11:iconst_4        
	//*   8   12:iand            
	//*   9   13:ifeq            18
			i = 0;
	//   10   16:iconst_0        
	//   11   17:istore_3        
		return StringsKt.split(charsequence, ac, flag, i);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:iload_2         
	//   15   21:iload_3         
	//   16   22:invokestatic    #662 <Method List StringsKt.split(CharSequence, char[], boolean, int)>
	//   17   25:areturn         
	}

	public static List split$default(CharSequence charsequence, String as[], boolean flag, int i, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			flag = false;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		if((j & 4) != 0)
	//*   6    9:iload           4
	//*   7   11:iconst_4        
	//*   8   12:iand            
	//*   9   13:ifeq            18
			i = 0;
	//   10   16:iconst_0        
	//   11   17:istore_3        
		return StringsKt.split(charsequence, as, flag, i);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:iload_2         
	//   15   21:iload_3         
	//   16   22:invokestatic    #665 <Method List StringsKt.split(CharSequence, String[], boolean, int)>
	//   17   25:areturn         
	}

	public static final Sequence splitToSequence(CharSequence charsequence, char ac[], boolean flag, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (ac)), "delimiters");
	//    3    6:aload_1         
	//    4    7:ldc2            #618 <String "delimiters">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
	/* block-local class not found */
	class splitToSequence._cls2 {}

		return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charsequence, ac, 0, flag, i, 2, ((Object) (null))), (Function1)new splitToSequence._cls2(charsequence));
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:iconst_0        
	//    9   16:iload_2         
	//   10   17:iload_3         
	//   11   18:iconst_2        
	//   12   19:aconst_null     
	//   13   20:invokestatic    #626 <Method Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence, char[], int, boolean, int, int, Object)>
	//   14   23:new             #668 <Class StringsKt__StringsKt$splitToSequence$2>
	//   15   26:dup             
	//   16   27:aload_0         
	//   17   28:invokespecial   #669 <Method void StringsKt__StringsKt$splitToSequence$2(CharSequence)>
	//   18   31:checkcast       #671 <Class Function1>
	//   19   34:invokestatic    #675 <Method Sequence SequencesKt.map(Sequence, Function1)>
	//   20   37:areturn         
	}

	public static final Sequence splitToSequence(CharSequence charsequence, String as[], boolean flag, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (as)), "delimiters");
	//    3    6:aload_1         
	//    4    7:ldc2            #618 <String "delimiters">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
	/* block-local class not found */
	class splitToSequence._cls1 {}

		return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charsequence, as, 0, flag, i, 2, ((Object) (null))), (Function1)new splitToSequence._cls1(charsequence));
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:iconst_0        
	//    9   16:iload_2         
	//   10   17:iload_3         
	//   11   18:iconst_2        
	//   12   19:aconst_null     
	//   13   20:invokestatic    #649 <Method Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence, String[], int, boolean, int, int, Object)>
	//   14   23:new             #678 <Class StringsKt__StringsKt$splitToSequence$1>
	//   15   26:dup             
	//   16   27:aload_0         
	//   17   28:invokespecial   #679 <Method void StringsKt__StringsKt$splitToSequence$1(CharSequence)>
	//   18   31:checkcast       #671 <Class Function1>
	//   19   34:invokestatic    #675 <Method Sequence SequencesKt.map(Sequence, Function1)>
	//   20   37:areturn         
	}

	public static Sequence splitToSequence$default(CharSequence charsequence, char ac[], boolean flag, int i, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			flag = false;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		if((j & 4) != 0)
	//*   6    9:iload           4
	//*   7   11:iconst_4        
	//*   8   12:iand            
	//*   9   13:ifeq            18
			i = 0;
	//   10   16:iconst_0        
	//   11   17:istore_3        
		return StringsKt.splitToSequence(charsequence, ac, flag, i);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:iload_2         
	//   15   21:iload_3         
	//   16   22:invokestatic    #683 <Method Sequence StringsKt.splitToSequence(CharSequence, char[], boolean, int)>
	//   17   25:areturn         
	}

	public static Sequence splitToSequence$default(CharSequence charsequence, String as[], boolean flag, int i, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			flag = false;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		if((j & 4) != 0)
	//*   6    9:iload           4
	//*   7   11:iconst_4        
	//*   8   12:iand            
	//*   9   13:ifeq            18
			i = 0;
	//   10   16:iconst_0        
	//   11   17:istore_3        
		return StringsKt.splitToSequence(charsequence, as, flag, i);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:iload_2         
	//   15   21:iload_3         
	//   16   22:invokestatic    #685 <Method Sequence StringsKt.splitToSequence(CharSequence, String[], boolean, int)>
	//   17   25:areturn         
	}

	public static final boolean startsWith(CharSequence charsequence, char c, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = charsequence.length();
	//    3    6:aload_0         
	//    4    7:invokeinterface #151 <Method int CharSequence.length()>
	//    5   12:istore_3        
		boolean flag2 = false;
	//    6   13:iconst_0        
	//    7   14:istore          5
		boolean flag1 = flag2;
	//    8   16:iload           5
	//    9   18:istore          4
		if(i > 0)
	//*  10   20:iload_3         
	//*  11   21:ifle            46
		{
			flag1 = flag2;
	//   12   24:iload           5
	//   13   26:istore          4
			if(CharsKt.equals(charsequence.charAt(0), c, flag))
	//*  14   28:aload_0         
	//*  15   29:iconst_0        
	//*  16   30:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//*  17   35:iload_1         
	//*  18   36:iload_2         
	//*  19   37:invokestatic    #167 <Method boolean CharsKt.equals(char, char, boolean)>
	//*  20   40:ifeq            46
				flag1 = true;
	//   21   43:iconst_1        
	//   22   44:istore          4
		}
		return flag1;
	//   23   46:iload           4
	//   24   48:ireturn         
	}

	public static final boolean startsWith(CharSequence charsequence, CharSequence charsequence1, int i, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence1)), "prefix");
	//    3    6:aload_1         
	//    4    7:ldc2            #505 <String "prefix">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!flag && (charsequence instanceof String) && (charsequence1 instanceof String))
	//*   6   13:iload_3         
	//*   7   14:ifne            47
	//*   8   17:aload_0         
	//*   9   18:instanceof      #195 <Class String>
	//*  10   21:ifeq            47
	//*  11   24:aload_1         
	//*  12   25:instanceof      #195 <Class String>
	//*  13   28:ifeq            47
			return StringsKt.startsWith$default((String)charsequence, (String)charsequence1, i, false, 4, ((Object) (null)));
	//   14   31:aload_0         
	//   15   32:checkcast       #195 <Class String>
	//   16   35:aload_1         
	//   17   36:checkcast       #195 <Class String>
	//   18   39:iload_2         
	//   19   40:iconst_0        
	//   20   41:iconst_4        
	//   21   42:aconst_null     
	//   22   43:invokestatic    #689 <Method boolean StringsKt.startsWith$default(String, String, int, boolean, int, Object)>
	//   23   46:ireturn         
		else
			return StringsKt.regionMatchesImpl(charsequence, i, charsequence1, 0, charsequence1.length(), flag);
	//   24   47:aload_0         
	//   25   48:iload_2         
	//   26   49:aload_1         
	//   27   50:iconst_0        
	//   28   51:aload_1         
	//   29   52:invokeinterface #151 <Method int CharSequence.length()>
	//   30   57:iload_3         
	//   31   58:invokestatic    #227 <Method boolean StringsKt.regionMatchesImpl(CharSequence, int, CharSequence, int, int, boolean)>
	//   32   61:ireturn         
	}

	public static final boolean startsWith(CharSequence charsequence, CharSequence charsequence1, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence1)), "prefix");
	//    3    6:aload_1         
	//    4    7:ldc2            #505 <String "prefix">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!flag && (charsequence instanceof String) && (charsequence1 instanceof String))
	//*   6   13:iload_2         
	//*   7   14:ifne            46
	//*   8   17:aload_0         
	//*   9   18:instanceof      #195 <Class String>
	//*  10   21:ifeq            46
	//*  11   24:aload_1         
	//*  12   25:instanceof      #195 <Class String>
	//*  13   28:ifeq            46
			return StringsKt.startsWith$default((String)charsequence, (String)charsequence1, false, 2, ((Object) (null)));
	//   14   31:aload_0         
	//   15   32:checkcast       #195 <Class String>
	//   16   35:aload_1         
	//   17   36:checkcast       #195 <Class String>
	//   18   39:iconst_0        
	//   19   40:iconst_2        
	//   20   41:aconst_null     
	//   21   42:invokestatic    #691 <Method boolean StringsKt.startsWith$default(String, String, boolean, int, Object)>
	//   22   45:ireturn         
		else
			return StringsKt.regionMatchesImpl(charsequence, 0, charsequence1, 0, charsequence1.length(), flag);
	//   23   46:aload_0         
	//   24   47:iconst_0        
	//   25   48:aload_1         
	//   26   49:iconst_0        
	//   27   50:aload_1         
	//   28   51:invokeinterface #151 <Method int CharSequence.length()>
	//   29   56:iload_2         
	//   30   57:invokestatic    #227 <Method boolean StringsKt.regionMatchesImpl(CharSequence, int, CharSequence, int, int, boolean)>
	//   31   60:ireturn         
	}

	public static boolean startsWith$default(CharSequence charsequence, char c, boolean flag, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		return StringsKt.startsWith(charsequence, c, flag);
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:iload_2         
	//    9   11:invokestatic    #693 <Method boolean StringsKt.startsWith(CharSequence, char, boolean)>
	//   10   14:ireturn         
	}

	public static boolean startsWith$default(CharSequence charsequence, CharSequence charsequence1, int i, boolean flag, int j, Object obj)
	{
		if((j & 4) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_4        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			flag = false;
	//    4    7:iconst_0        
	//    5    8:istore_3        
		return StringsKt.startsWith(charsequence, charsequence1, i, flag);
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:iload_2         
	//    9   12:iload_3         
	//   10   13:invokestatic    #696 <Method boolean StringsKt.startsWith(CharSequence, CharSequence, int, boolean)>
	//   11   16:ireturn         
	}

	public static boolean startsWith$default(CharSequence charsequence, CharSequence charsequence1, boolean flag, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		return StringsKt.startsWith(charsequence, charsequence1, flag);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:iload_2         
	//    9   11:invokestatic    #698 <Method boolean StringsKt.startsWith(CharSequence, CharSequence, boolean)>
	//   10   14:ireturn         
	}

	public static final CharSequence subSequence(CharSequence charsequence, IntRange intrange)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (intrange)), "range");
	//    3    6:aload_1         
	//    4    7:ldc2            #532 <String "range">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return charsequence.subSequence(intrange.getStart().intValue(), intrange.getEndInclusive().intValue() + 1);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #536 <Method Integer IntRange.getStart()>
	//    9   18:invokevirtual   #364 <Method int Integer.intValue()>
	//   10   21:aload_1         
	//   11   22:invokevirtual   #539 <Method Integer IntRange.getEndInclusive()>
	//   12   25:invokevirtual   #364 <Method int Integer.intValue()>
	//   13   28:iconst_1        
	//   14   29:iadd            
	//   15   30:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   16   35:areturn         
	}

	private static final CharSequence subSequence(String s, int i, int j)
	{
		return s.subSequence(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #708 <Method CharSequence String.subSequence(int, int)>
	//    4    6:areturn         
	}

	private static final String substring(CharSequence charsequence, int i, int j)
	{
		return ((Object) (charsequence.subSequence(i, j))).toString();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//    4    8:invokevirtual   #180 <Method String Object.toString()>
	//    5   11:areturn         
	}

	public static final String substring(CharSequence charsequence, IntRange intrange)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (intrange)), "range");
	//    3    6:aload_1         
	//    4    7:ldc2            #532 <String "range">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return ((Object) (charsequence.subSequence(intrange.getStart().intValue(), intrange.getEndInclusive().intValue() + 1))).toString();
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #536 <Method Integer IntRange.getStart()>
	//    9   18:invokevirtual   #364 <Method int Integer.intValue()>
	//   10   21:aload_1         
	//   11   22:invokevirtual   #539 <Method Integer IntRange.getEndInclusive()>
	//   12   25:invokevirtual   #364 <Method int Integer.intValue()>
	//   13   28:iconst_1        
	//   14   29:iadd            
	//   15   30:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   16   35:invokevirtual   #180 <Method String Object.toString()>
	//   17   38:areturn         
	}

	public static final String substring(String s, IntRange intrange)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (intrange)), "range");
	//    3    6:aload_1         
	//    4    7:ldc2            #532 <String "range">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		s = s.substring(intrange.getStart().intValue(), intrange.getEndInclusive().intValue() + 1);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #536 <Method Integer IntRange.getStart()>
	//    9   18:invokevirtual   #364 <Method int Integer.intValue()>
	//   10   21:aload_1         
	//   11   22:invokevirtual   #539 <Method Integer IntRange.getEndInclusive()>
	//   12   25:invokevirtual   #364 <Method int Integer.intValue()>
	//   13   28:iconst_1        
	//   14   29:iadd            
	//   15   30:invokevirtual   #555 <Method String String.substring(int, int)>
	//   16   33:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
	//   17   34:aload_0         
	//   18   35:ldc2            #557 <String "(this as java.lang.Strin\u2026ing(startIndex, endIndex)">
	//   19   38:invokestatic    #517 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return s;
	//   20   41:aload_0         
	//   21   42:areturn         
	}

	static String substring$default(CharSequence charsequence, int i, int j, int k, Object obj)
	{
		if((k & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            13
			j = charsequence.length();
	//    4    6:aload_0         
	//    5    7:invokeinterface #151 <Method int CharSequence.length()>
	//    6   12:istore_2        
		return ((Object) (charsequence.subSequence(i, j))).toString();
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:iload_2         
	//   10   16:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   11   21:invokevirtual   #180 <Method String Object.toString()>
	//   12   24:areturn         
	}

	public static final String substringAfter(String s, char c, String s1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "missingDelimiterValue");
	//    3    6:aload_2         
	//    4    7:ldc2            #576 <String "missingDelimiterValue">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = StringsKt.indexOf$default((CharSequence)s, c, 0, false, 6, ((Object) (null)));
	//    6   13:aload_0         
	//    7   14:checkcast       #148 <Class CharSequence>
	//    8   17:iload_1         
	//    9   18:iconst_0        
	//   10   19:iconst_0        
	//   11   20:bipush          6
	//   12   22:aconst_null     
	//   13   23:invokestatic    #192 <Method int StringsKt.indexOf$default(CharSequence, char, int, boolean, int, Object)>
	//   14   26:istore_3        
		if(i == -1)
	//*  15   27:iload_3         
	//*  16   28:iconst_m1       
	//*  17   29:icmpne          34
		{
			return s1;
	//   18   32:aload_2         
	//   19   33:areturn         
		} else
		{
			s = s.substring(i + 1, s.length());
	//   20   34:aload_0         
	//   21   35:iload_3         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:aload_0         
	//   25   39:invokevirtual   #305 <Method int String.length()>
	//   26   42:invokevirtual   #555 <Method String String.substring(int, int)>
	//   27   45:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
	//   28   46:aload_0         
	//   29   47:ldc2            #557 <String "(this as java.lang.Strin\u2026ing(startIndex, endIndex)">
	//   30   50:invokestatic    #517 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   31   53:aload_0         
	//   32   54:areturn         
		}
	}

	public static final String substringAfter(String s, String s1, String s2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "delimiter");
	//    3    6:aload_1         
	//    4    7:ldc2            #558 <String "delimiter">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s2)), "missingDelimiterValue");
	//    6   13:aload_2         
	//    7   14:ldc2            #576 <String "missingDelimiterValue">
	//    8   17:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = StringsKt.indexOf$default((CharSequence)s, s1, 0, false, 6, ((Object) (null)));
	//    9   20:aload_0         
	//   10   21:checkcast       #148 <Class CharSequence>
	//   11   24:aload_1         
	//   12   25:iconst_0        
	//   13   26:iconst_0        
	//   14   27:bipush          6
	//   15   29:aconst_null     
	//   16   30:invokestatic    #198 <Method int StringsKt.indexOf$default(CharSequence, String, int, boolean, int, Object)>
	//   17   33:istore_3        
		if(i == -1)
	//*  18   34:iload_3         
	//*  19   35:iconst_m1       
	//*  20   36:icmpne          41
		{
			return s2;
	//   21   39:aload_2         
	//   22   40:areturn         
		} else
		{
			s = s.substring(i + s1.length(), s.length());
	//   23   41:aload_0         
	//   24   42:iload_3         
	//   25   43:aload_1         
	//   26   44:invokevirtual   #305 <Method int String.length()>
	//   27   47:iadd            
	//   28   48:aload_0         
	//   29   49:invokevirtual   #305 <Method int String.length()>
	//   30   52:invokevirtual   #555 <Method String String.substring(int, int)>
	//   31   55:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
	//   32   56:aload_0         
	//   33   57:ldc2            #557 <String "(this as java.lang.Strin\u2026ing(startIndex, endIndex)">
	//   34   60:invokestatic    #517 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   35   63:aload_0         
	//   36   64:areturn         
		}
	}

	public static String substringAfter$default(String s, char c, String s1, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			s1 = s;
	//    4    6:aload_0         
	//    5    7:astore_2        
		return StringsKt.substringAfter(s, c, s1);
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aload_2         
	//    9   11:invokestatic    #718 <Method String StringsKt.substringAfter(String, char, String)>
	//   10   14:areturn         
	}

	public static String substringAfter$default(String s, String s1, String s2, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			s2 = s;
	//    4    6:aload_0         
	//    5    7:astore_2        
		return StringsKt.substringAfter(s, s1, s2);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:aload_2         
	//    9   11:invokestatic    #721 <Method String StringsKt.substringAfter(String, String, String)>
	//   10   14:areturn         
	}

	public static final String substringAfterLast(String s, char c, String s1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "missingDelimiterValue");
	//    3    6:aload_2         
	//    4    7:ldc2            #576 <String "missingDelimiterValue">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = StringsKt.lastIndexOf$default((CharSequence)s, c, 0, false, 6, ((Object) (null)));
	//    6   13:aload_0         
	//    7   14:checkcast       #148 <Class CharSequence>
	//    8   17:iload_1         
	//    9   18:iconst_0        
	//   10   19:iconst_0        
	//   11   20:bipush          6
	//   12   22:aconst_null     
	//   13   23:invokestatic    #589 <Method int StringsKt.lastIndexOf$default(CharSequence, char, int, boolean, int, Object)>
	//   14   26:istore_3        
		if(i == -1)
	//*  15   27:iload_3         
	//*  16   28:iconst_m1       
	//*  17   29:icmpne          34
		{
			return s1;
	//   18   32:aload_2         
	//   19   33:areturn         
		} else
		{
			s = s.substring(i + 1, s.length());
	//   20   34:aload_0         
	//   21   35:iload_3         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:aload_0         
	//   25   39:invokevirtual   #305 <Method int String.length()>
	//   26   42:invokevirtual   #555 <Method String String.substring(int, int)>
	//   27   45:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
	//   28   46:aload_0         
	//   29   47:ldc2            #557 <String "(this as java.lang.Strin\u2026ing(startIndex, endIndex)">
	//   30   50:invokestatic    #517 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   31   53:aload_0         
	//   32   54:areturn         
		}
	}

	public static final String substringAfterLast(String s, String s1, String s2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "delimiter");
	//    3    6:aload_1         
	//    4    7:ldc2            #558 <String "delimiter">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s2)), "missingDelimiterValue");
	//    6   13:aload_2         
	//    7   14:ldc2            #576 <String "missingDelimiterValue">
	//    8   17:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = StringsKt.lastIndexOf$default((CharSequence)s, s1, 0, false, 6, ((Object) (null)));
	//    9   20:aload_0         
	//   10   21:checkcast       #148 <Class CharSequence>
	//   11   24:aload_1         
	//   12   25:iconst_0        
	//   13   26:iconst_0        
	//   14   27:bipush          6
	//   15   29:aconst_null     
	//   16   30:invokestatic    #251 <Method int StringsKt.lastIndexOf$default(CharSequence, String, int, boolean, int, Object)>
	//   17   33:istore_3        
		if(i == -1)
	//*  18   34:iload_3         
	//*  19   35:iconst_m1       
	//*  20   36:icmpne          41
		{
			return s2;
	//   21   39:aload_2         
	//   22   40:areturn         
		} else
		{
			s = s.substring(i + s1.length(), s.length());
	//   23   41:aload_0         
	//   24   42:iload_3         
	//   25   43:aload_1         
	//   26   44:invokevirtual   #305 <Method int String.length()>
	//   27   47:iadd            
	//   28   48:aload_0         
	//   29   49:invokevirtual   #305 <Method int String.length()>
	//   30   52:invokevirtual   #555 <Method String String.substring(int, int)>
	//   31   55:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
	//   32   56:aload_0         
	//   33   57:ldc2            #557 <String "(this as java.lang.Strin\u2026ing(startIndex, endIndex)">
	//   34   60:invokestatic    #517 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   35   63:aload_0         
	//   36   64:areturn         
		}
	}

	public static String substringAfterLast$default(String s, char c, String s1, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			s1 = s;
	//    4    6:aload_0         
	//    5    7:astore_2        
		return StringsKt.substringAfterLast(s, c, s1);
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aload_2         
	//    9   11:invokestatic    #724 <Method String StringsKt.substringAfterLast(String, char, String)>
	//   10   14:areturn         
	}

	public static String substringAfterLast$default(String s, String s1, String s2, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			s2 = s;
	//    4    6:aload_0         
	//    5    7:astore_2        
		return StringsKt.substringAfterLast(s, s1, s2);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:aload_2         
	//    9   11:invokestatic    #726 <Method String StringsKt.substringAfterLast(String, String, String)>
	//   10   14:areturn         
	}

	public static final String substringBefore(String s, char c, String s1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "missingDelimiterValue");
	//    3    6:aload_2         
	//    4    7:ldc2            #576 <String "missingDelimiterValue">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = StringsKt.indexOf$default((CharSequence)s, c, 0, false, 6, ((Object) (null)));
	//    6   13:aload_0         
	//    7   14:checkcast       #148 <Class CharSequence>
	//    8   17:iload_1         
	//    9   18:iconst_0        
	//   10   19:iconst_0        
	//   11   20:bipush          6
	//   12   22:aconst_null     
	//   13   23:invokestatic    #192 <Method int StringsKt.indexOf$default(CharSequence, char, int, boolean, int, Object)>
	//   14   26:istore_3        
		if(i == -1)
	//*  15   27:iload_3         
	//*  16   28:iconst_m1       
	//*  17   29:icmpne          34
		{
			return s1;
	//   18   32:aload_2         
	//   19   33:areturn         
		} else
		{
			s = s.substring(0, i);
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:iload_3         
	//   23   37:invokevirtual   #555 <Method String String.substring(int, int)>
	//   24   40:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
	//   25   41:aload_0         
	//   26   42:ldc2            #557 <String "(this as java.lang.Strin\u2026ing(startIndex, endIndex)">
	//   27   45:invokestatic    #517 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   28   48:aload_0         
	//   29   49:areturn         
		}
	}

	public static final String substringBefore(String s, String s1, String s2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "delimiter");
	//    3    6:aload_1         
	//    4    7:ldc2            #558 <String "delimiter">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s2)), "missingDelimiterValue");
	//    6   13:aload_2         
	//    7   14:ldc2            #576 <String "missingDelimiterValue">
	//    8   17:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = StringsKt.indexOf$default((CharSequence)s, s1, 0, false, 6, ((Object) (null)));
	//    9   20:aload_0         
	//   10   21:checkcast       #148 <Class CharSequence>
	//   11   24:aload_1         
	//   12   25:iconst_0        
	//   13   26:iconst_0        
	//   14   27:bipush          6
	//   15   29:aconst_null     
	//   16   30:invokestatic    #198 <Method int StringsKt.indexOf$default(CharSequence, String, int, boolean, int, Object)>
	//   17   33:istore_3        
		if(i == -1)
	//*  18   34:iload_3         
	//*  19   35:iconst_m1       
	//*  20   36:icmpne          41
		{
			return s2;
	//   21   39:aload_2         
	//   22   40:areturn         
		} else
		{
			s = s.substring(0, i);
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:iload_3         
	//   26   44:invokevirtual   #555 <Method String String.substring(int, int)>
	//   27   47:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
	//   28   48:aload_0         
	//   29   49:ldc2            #557 <String "(this as java.lang.Strin\u2026ing(startIndex, endIndex)">
	//   30   52:invokestatic    #517 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   31   55:aload_0         
	//   32   56:areturn         
		}
	}

	public static String substringBefore$default(String s, char c, String s1, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			s1 = s;
	//    4    6:aload_0         
	//    5    7:astore_2        
		return StringsKt.substringBefore(s, c, s1);
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aload_2         
	//    9   11:invokestatic    #729 <Method String StringsKt.substringBefore(String, char, String)>
	//   10   14:areturn         
	}

	public static String substringBefore$default(String s, String s1, String s2, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			s2 = s;
	//    4    6:aload_0         
	//    5    7:astore_2        
		return StringsKt.substringBefore(s, s1, s2);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:aload_2         
	//    9   11:invokestatic    #731 <Method String StringsKt.substringBefore(String, String, String)>
	//   10   14:areturn         
	}

	public static final String substringBeforeLast(String s, char c, String s1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "missingDelimiterValue");
	//    3    6:aload_2         
	//    4    7:ldc2            #576 <String "missingDelimiterValue">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = StringsKt.lastIndexOf$default((CharSequence)s, c, 0, false, 6, ((Object) (null)));
	//    6   13:aload_0         
	//    7   14:checkcast       #148 <Class CharSequence>
	//    8   17:iload_1         
	//    9   18:iconst_0        
	//   10   19:iconst_0        
	//   11   20:bipush          6
	//   12   22:aconst_null     
	//   13   23:invokestatic    #589 <Method int StringsKt.lastIndexOf$default(CharSequence, char, int, boolean, int, Object)>
	//   14   26:istore_3        
		if(i == -1)
	//*  15   27:iload_3         
	//*  16   28:iconst_m1       
	//*  17   29:icmpne          34
		{
			return s1;
	//   18   32:aload_2         
	//   19   33:areturn         
		} else
		{
			s = s.substring(0, i);
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:iload_3         
	//   23   37:invokevirtual   #555 <Method String String.substring(int, int)>
	//   24   40:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
	//   25   41:aload_0         
	//   26   42:ldc2            #557 <String "(this as java.lang.Strin\u2026ing(startIndex, endIndex)">
	//   27   45:invokestatic    #517 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   28   48:aload_0         
	//   29   49:areturn         
		}
	}

	public static final String substringBeforeLast(String s, String s1, String s2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "delimiter");
	//    3    6:aload_1         
	//    4    7:ldc2            #558 <String "delimiter">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s2)), "missingDelimiterValue");
	//    6   13:aload_2         
	//    7   14:ldc2            #576 <String "missingDelimiterValue">
	//    8   17:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = StringsKt.lastIndexOf$default((CharSequence)s, s1, 0, false, 6, ((Object) (null)));
	//    9   20:aload_0         
	//   10   21:checkcast       #148 <Class CharSequence>
	//   11   24:aload_1         
	//   12   25:iconst_0        
	//   13   26:iconst_0        
	//   14   27:bipush          6
	//   15   29:aconst_null     
	//   16   30:invokestatic    #251 <Method int StringsKt.lastIndexOf$default(CharSequence, String, int, boolean, int, Object)>
	//   17   33:istore_3        
		if(i == -1)
	//*  18   34:iload_3         
	//*  19   35:iconst_m1       
	//*  20   36:icmpne          41
		{
			return s2;
	//   21   39:aload_2         
	//   22   40:areturn         
		} else
		{
			s = s.substring(0, i);
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:iload_3         
	//   26   44:invokevirtual   #555 <Method String String.substring(int, int)>
	//   27   47:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
	//   28   48:aload_0         
	//   29   49:ldc2            #557 <String "(this as java.lang.Strin\u2026ing(startIndex, endIndex)">
	//   30   52:invokestatic    #517 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return s;
	//   31   55:aload_0         
	//   32   56:areturn         
		}
	}

	public static String substringBeforeLast$default(String s, char c, String s1, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			s1 = s;
	//    4    6:aload_0         
	//    5    7:astore_2        
		return StringsKt.substringBeforeLast(s, c, s1);
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aload_2         
	//    9   11:invokestatic    #734 <Method String StringsKt.substringBeforeLast(String, char, String)>
	//   10   14:areturn         
	}

	public static String substringBeforeLast$default(String s, String s1, String s2, int i, Object obj)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			s2 = s;
	//    4    6:aload_0         
	//    5    7:astore_2        
		return StringsKt.substringBeforeLast(s, s1, s2);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:aload_2         
	//    9   11:invokestatic    #736 <Method String StringsKt.substringBeforeLast(String, String, String)>
	//   10   14:areturn         
	}

	public static final CharSequence trim(CharSequence charsequence)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int j = charsequence.length() - 1;
	//    3    6:aload_0         
	//    4    7:invokeinterface #151 <Method int CharSequence.length()>
	//    5   12:iconst_1        
	//    6   13:isub            
	//    7   14:istore_2        
		int i = 0;
	//    8   15:iconst_0        
	//    9   16:istore_1        
		boolean flag = false;
	//   10   17:iconst_0        
	//   11   18:istore_3        
		do
		{
			if(i > j)
				break;
	//   12   19:iload_1         
	//   13   20:iload_2         
	//   14   21:icmpgt          86
			int k;
			if(!flag)
	//*  15   24:iload_3         
	//*  16   25:ifne            34
				k = i;
	//   17   28:iload_1         
	//   18   29:istore          4
			else
	//*  19   31:goto            37
				k = j;
	//   20   34:iload_2         
	//   21   35:istore          4
			boolean flag1 = CharsKt.isWhitespace(charsequence.charAt(k));
	//   22   37:aload_0         
	//   23   38:iload           4
	//   24   40:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//   25   45:invokestatic    #740 <Method boolean CharsKt.isWhitespace(char)>
	//   26   48:istore          5
			if(!flag)
	//*  27   50:iload_3         
	//*  28   51:ifne            71
			{
				if(!flag1)
	//*  29   54:iload           5
	//*  30   56:ifne            64
					flag = true;
	//   31   59:iconst_1        
	//   32   60:istore_3        
				else
	//*  33   61:goto            19
					i++;
	//   34   64:iload_1         
	//   35   65:iconst_1        
	//   36   66:iadd            
	//   37   67:istore_1        
				continue;
	//   38   68:goto            19
			}
			if(!flag1)
	//*  39   71:iload           5
	//*  40   73:ifne            79
				break;
	//   41   76:goto            86
			j--;
	//   42   79:iload_2         
	//   43   80:iconst_1        
	//   44   81:isub            
	//   45   82:istore_2        
		} while(true);
	//   46   83:goto            19
		return charsequence.subSequence(i, j + 1);
	//   47   86:aload_0         
	//   48   87:iload_1         
	//   49   88:iload_2         
	//   50   89:iconst_1        
	//   51   90:iadd            
	//   52   91:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   53   96:areturn         
	}

	public static final CharSequence trim(CharSequence charsequence, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "predicate");
	//    3    6:aload_1         
	//    4    7:ldc2            #742 <String "predicate">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int j = charsequence.length() - 1;
	//    6   13:aload_0         
	//    7   14:invokeinterface #151 <Method int CharSequence.length()>
	//    8   19:iconst_1        
	//    9   20:isub            
	//   10   21:istore_3        
		int i = 0;
	//   11   22:iconst_0        
	//   12   23:istore_2        
		boolean flag = false;
	//   13   24:iconst_0        
	//   14   25:istore          4
		do
		{
			if(i > j)
				break;
	//   15   27:iload_2         
	//   16   28:iload_3         
	//   17   29:icmpgt          109
			int k;
			if(!flag)
	//*  18   32:iload           4
	//*  19   34:ifne            43
				k = i;
	//   20   37:iload_2         
	//   21   38:istore          5
			else
	//*  22   40:goto            46
				k = j;
	//   23   43:iload_3         
	//   24   44:istore          5
			boolean flag1 = ((Boolean)function1.invoke(((Object) (Character.valueOf(charsequence.charAt(k)))))).booleanValue();
	//   25   46:aload_1         
	//   26   47:aload_0         
	//   27   48:iload           5
	//   28   50:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//   29   55:invokestatic    #745 <Method Character Character.valueOf(char)>
	//   30   58:invokeinterface #748 <Method Object Function1.invoke(Object)>
	//   31   63:checkcast       #750 <Class Boolean>
	//   32   66:invokevirtual   #753 <Method boolean Boolean.booleanValue()>
	//   33   69:istore          6
			if(!flag)
	//*  34   71:iload           4
	//*  35   73:ifne            94
			{
				if(!flag1)
	//*  36   76:iload           6
	//*  37   78:ifne            87
					flag = true;
	//   38   81:iconst_1        
	//   39   82:istore          4
				else
	//*  40   84:goto            27
					i++;
	//   41   87:iload_2         
	//   42   88:iconst_1        
	//   43   89:iadd            
	//   44   90:istore_2        
				continue;
	//   45   91:goto            27
			}
			if(!flag1)
	//*  46   94:iload           6
	//*  47   96:ifne            102
				break;
	//   48   99:goto            109
			j--;
	//   49  102:iload_3         
	//   50  103:iconst_1        
	//   51  104:isub            
	//   52  105:istore_3        
		} while(true);
	//   53  106:goto            27
		return charsequence.subSequence(i, j + 1);
	//   54  109:aload_0         
	//   55  110:iload_2         
	//   56  111:iload_3         
	//   57  112:iconst_1        
	//   58  113:iadd            
	//   59  114:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   60  119:areturn         
	}

	public static final transient CharSequence trim(CharSequence charsequence, char ac[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (ac)), "chars");
	//    3    6:aload_1         
	//    4    7:ldc2            #366 <String "chars">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int j = charsequence.length() - 1;
	//    6   13:aload_0         
	//    7   14:invokeinterface #151 <Method int CharSequence.length()>
	//    8   19:iconst_1        
	//    9   20:isub            
	//   10   21:istore_3        
		int i = 0;
	//   11   22:iconst_0        
	//   12   23:istore_2        
		boolean flag = false;
	//   13   24:iconst_0        
	//   14   25:istore          4
		do
		{
			if(i > j)
				break;
	//   15   27:iload_2         
	//   16   28:iload_3         
	//   17   29:icmpgt          98
			int k;
			if(!flag)
	//*  18   32:iload           4
	//*  19   34:ifne            43
				k = i;
	//   20   37:iload_2         
	//   21   38:istore          5
			else
	//*  22   40:goto            46
				k = j;
	//   23   43:iload_3         
	//   24   44:istore          5
			boolean flag1 = ArraysKt.contains(ac, charsequence.charAt(k));
	//   25   46:aload_1         
	//   26   47:aload_0         
	//   27   48:iload           5
	//   28   50:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//   29   55:invokestatic    #758 <Method boolean ArraysKt.contains(char[], char)>
	//   30   58:istore          6
			if(!flag)
	//*  31   60:iload           4
	//*  32   62:ifne            83
			{
				if(!flag1)
	//*  33   65:iload           6
	//*  34   67:ifne            76
					flag = true;
	//   35   70:iconst_1        
	//   36   71:istore          4
				else
	//*  37   73:goto            27
					i++;
	//   38   76:iload_2         
	//   39   77:iconst_1        
	//   40   78:iadd            
	//   41   79:istore_2        
				continue;
	//   42   80:goto            27
			}
			if(!flag1)
	//*  43   83:iload           6
	//*  44   85:ifne            91
				break;
	//   45   88:goto            98
			j--;
	//   46   91:iload_3         
	//   47   92:iconst_1        
	//   48   93:isub            
	//   49   94:istore_3        
		} while(true);
	//   50   95:goto            27
		return charsequence.subSequence(i, j + 1);
	//   51   98:aload_0         
	//   52   99:iload_2         
	//   53  100:iload_3         
	//   54  101:iconst_1        
	//   55  102:iadd            
	//   56  103:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   57  108:areturn         
	}

	private static final String trim(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
	//    2    4:new             #544 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc2            #546 <String "null cannot be cast to non-null type kotlin.CharSequence">
	//    5   11:invokespecial   #547 <Method void TypeCastException(String)>
	//    6   14:athrow          
		else
			return ((Object) (StringsKt.trim((CharSequence)s))).toString();
	//    7   15:aload_0         
	//    8   16:checkcast       #148 <Class CharSequence>
	//    9   19:invokestatic    #760 <Method CharSequence StringsKt.trim(CharSequence)>
	//   10   22:invokevirtual   #180 <Method String Object.toString()>
	//   11   25:areturn         
	}

	public static final String trim(String s, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "predicate");
	//    3    6:aload_1         
	//    4    7:ldc2            #742 <String "predicate">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		s = ((String) ((CharSequence)s));
	//    6   13:aload_0         
	//    7   14:checkcast       #148 <Class CharSequence>
	//    8   17:astore_0        
		int j = ((CharSequence) (s)).length() - 1;
	//    9   18:aload_0         
	//   10   19:invokeinterface #151 <Method int CharSequence.length()>
	//   11   24:iconst_1        
	//   12   25:isub            
	//   13   26:istore_3        
		int i = 0;
	//   14   27:iconst_0        
	//   15   28:istore_2        
		boolean flag = false;
	//   16   29:iconst_0        
	//   17   30:istore          4
		do
		{
			if(i > j)
				break;
	//   18   32:iload_2         
	//   19   33:iload_3         
	//   20   34:icmpgt          114
			int k;
			if(!flag)
	//*  21   37:iload           4
	//*  22   39:ifne            48
				k = i;
	//   23   42:iload_2         
	//   24   43:istore          5
			else
	//*  25   45:goto            51
				k = j;
	//   26   48:iload_3         
	//   27   49:istore          5
			boolean flag1 = ((Boolean)function1.invoke(((Object) (Character.valueOf(((CharSequence) (s)).charAt(k)))))).booleanValue();
	//   28   51:aload_1         
	//   29   52:aload_0         
	//   30   53:iload           5
	//   31   55:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//   32   60:invokestatic    #745 <Method Character Character.valueOf(char)>
	//   33   63:invokeinterface #748 <Method Object Function1.invoke(Object)>
	//   34   68:checkcast       #750 <Class Boolean>
	//   35   71:invokevirtual   #753 <Method boolean Boolean.booleanValue()>
	//   36   74:istore          6
			if(!flag)
	//*  37   76:iload           4
	//*  38   78:ifne            99
			{
				if(!flag1)
	//*  39   81:iload           6
	//*  40   83:ifne            92
					flag = true;
	//   41   86:iconst_1        
	//   42   87:istore          4
				else
	//*  43   89:goto            32
					i++;
	//   44   92:iload_2         
	//   45   93:iconst_1        
	//   46   94:iadd            
	//   47   95:istore_2        
				continue;
	//   48   96:goto            32
			}
			if(!flag1)
	//*  49   99:iload           6
	//*  50  101:ifne            107
				break;
	//   51  104:goto            114
			j--;
	//   52  107:iload_3         
	//   53  108:iconst_1        
	//   54  109:isub            
	//   55  110:istore_3        
		} while(true);
	//   56  111:goto            32
		return ((Object) (((CharSequence) (s)).subSequence(i, j + 1))).toString();
	//   57  114:aload_0         
	//   58  115:iload_2         
	//   59  116:iload_3         
	//   60  117:iconst_1        
	//   61  118:iadd            
	//   62  119:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   63  124:invokevirtual   #180 <Method String Object.toString()>
	//   64  127:areturn         
	}

	public static final transient String trim(String s, char ac[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (ac)), "chars");
	//    3    6:aload_1         
	//    4    7:ldc2            #366 <String "chars">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		s = ((String) ((CharSequence)s));
	//    6   13:aload_0         
	//    7   14:checkcast       #148 <Class CharSequence>
	//    8   17:astore_0        
		int j = ((CharSequence) (s)).length() - 1;
	//    9   18:aload_0         
	//   10   19:invokeinterface #151 <Method int CharSequence.length()>
	//   11   24:iconst_1        
	//   12   25:isub            
	//   13   26:istore_3        
		int i = 0;
	//   14   27:iconst_0        
	//   15   28:istore_2        
		boolean flag = false;
	//   16   29:iconst_0        
	//   17   30:istore          4
		do
		{
			if(i > j)
				break;
	//   18   32:iload_2         
	//   19   33:iload_3         
	//   20   34:icmpgt          103
			int k;
			if(!flag)
	//*  21   37:iload           4
	//*  22   39:ifne            48
				k = i;
	//   23   42:iload_2         
	//   24   43:istore          5
			else
	//*  25   45:goto            51
				k = j;
	//   26   48:iload_3         
	//   27   49:istore          5
			boolean flag1 = ArraysKt.contains(ac, ((CharSequence) (s)).charAt(k));
	//   28   51:aload_1         
	//   29   52:aload_0         
	//   30   53:iload           5
	//   31   55:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//   32   60:invokestatic    #758 <Method boolean ArraysKt.contains(char[], char)>
	//   33   63:istore          6
			if(!flag)
	//*  34   65:iload           4
	//*  35   67:ifne            88
			{
				if(!flag1)
	//*  36   70:iload           6
	//*  37   72:ifne            81
					flag = true;
	//   38   75:iconst_1        
	//   39   76:istore          4
				else
	//*  40   78:goto            32
					i++;
	//   41   81:iload_2         
	//   42   82:iconst_1        
	//   43   83:iadd            
	//   44   84:istore_2        
				continue;
	//   45   85:goto            32
			}
			if(!flag1)
	//*  46   88:iload           6
	//*  47   90:ifne            96
				break;
	//   48   93:goto            103
			j--;
	//   49   96:iload_3         
	//   50   97:iconst_1        
	//   51   98:isub            
	//   52   99:istore_3        
		} while(true);
	//   53  100:goto            32
		return ((Object) (((CharSequence) (s)).subSequence(i, j + 1))).toString();
	//   54  103:aload_0         
	//   55  104:iload_2         
	//   56  105:iload_3         
	//   57  106:iconst_1        
	//   58  107:iadd            
	//   59  108:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   60  113:invokevirtual   #180 <Method String Object.toString()>
	//   61  116:areturn         
	}

	public static final CharSequence trimEnd(CharSequence charsequence)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = charsequence.length();
	//    3    6:aload_0         
	//    4    7:invokeinterface #151 <Method int CharSequence.length()>
	//    5   12:istore_1        
		do
		{
			int j = i - 1;
	//    6   13:iload_1         
	//    7   14:iconst_1        
	//    8   15:isub            
	//    9   16:istore_2        
			if(j >= 0)
	//*  10   17:iload_2         
	//*  11   18:iflt            47
			{
				i = j;
	//   12   21:iload_2         
	//   13   22:istore_1        
				if(!CharsKt.isWhitespace(charsequence.charAt(j)))
	//*  14   23:aload_0         
	//*  15   24:iload_2         
	//*  16   25:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//*  17   30:invokestatic    #740 <Method boolean CharsKt.isWhitespace(char)>
	//*  18   33:ifne            13
					return charsequence.subSequence(0, j + 1);
	//   19   36:aload_0         
	//   20   37:iconst_0        
	//   21   38:iload_2         
	//   22   39:iconst_1        
	//   23   40:iadd            
	//   24   41:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   25   46:areturn         
			} else
			{
				return (CharSequence)"";
	//   26   47:ldc2            #423 <String "">
	//   27   50:checkcast       #148 <Class CharSequence>
	//   28   53:areturn         
			}
		} while(true);
	}

	public static final CharSequence trimEnd(CharSequence charsequence, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "predicate");
	//    3    6:aload_1         
	//    4    7:ldc2            #742 <String "predicate">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = charsequence.length();
	//    6   13:aload_0         
	//    7   14:invokeinterface #151 <Method int CharSequence.length()>
	//    8   19:istore_2        
		do
		{
			int j = i - 1;
	//    9   20:iload_2         
	//   10   21:iconst_1        
	//   11   22:isub            
	//   12   23:istore_3        
			if(j >= 0)
	//*  13   24:iload_3         
	//*  14   25:iflt            66
			{
				i = j;
	//   15   28:iload_3         
	//   16   29:istore_2        
				if(!((Boolean)function1.invoke(((Object) (Character.valueOf(charsequence.charAt(j)))))).booleanValue())
	//*  17   30:aload_1         
	//*  18   31:aload_0         
	//*  19   32:iload_3         
	//*  20   33:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//*  21   38:invokestatic    #745 <Method Character Character.valueOf(char)>
	//*  22   41:invokeinterface #748 <Method Object Function1.invoke(Object)>
	//*  23   46:checkcast       #750 <Class Boolean>
	//*  24   49:invokevirtual   #753 <Method boolean Boolean.booleanValue()>
	//*  25   52:ifne            20
					return charsequence.subSequence(0, j + 1);
	//   26   55:aload_0         
	//   27   56:iconst_0        
	//   28   57:iload_3         
	//   29   58:iconst_1        
	//   30   59:iadd            
	//   31   60:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   32   65:areturn         
			} else
			{
				return (CharSequence)"";
	//   33   66:ldc2            #423 <String "">
	//   34   69:checkcast       #148 <Class CharSequence>
	//   35   72:areturn         
			}
		} while(true);
	}

	public static final transient CharSequence trimEnd(CharSequence charsequence, char ac[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (ac)), "chars");
	//    3    6:aload_1         
	//    4    7:ldc2            #366 <String "chars">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = charsequence.length();
	//    6   13:aload_0         
	//    7   14:invokeinterface #151 <Method int CharSequence.length()>
	//    8   19:istore_2        
		do
		{
			int j = i - 1;
	//    9   20:iload_2         
	//   10   21:iconst_1        
	//   11   22:isub            
	//   12   23:istore_3        
			if(j >= 0)
	//*  13   24:iload_3         
	//*  14   25:iflt            55
			{
				i = j;
	//   15   28:iload_3         
	//   16   29:istore_2        
				if(!ArraysKt.contains(ac, charsequence.charAt(j)))
	//*  17   30:aload_1         
	//*  18   31:aload_0         
	//*  19   32:iload_3         
	//*  20   33:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//*  21   38:invokestatic    #758 <Method boolean ArraysKt.contains(char[], char)>
	//*  22   41:ifne            20
					return charsequence.subSequence(0, j + 1);
	//   23   44:aload_0         
	//   24   45:iconst_0        
	//   25   46:iload_3         
	//   26   47:iconst_1        
	//   27   48:iadd            
	//   28   49:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   29   54:areturn         
			} else
			{
				return (CharSequence)"";
	//   30   55:ldc2            #423 <String "">
	//   31   58:checkcast       #148 <Class CharSequence>
	//   32   61:areturn         
			}
		} while(true);
	}

	private static final String trimEnd(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
	//    2    4:new             #544 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc2            #546 <String "null cannot be cast to non-null type kotlin.CharSequence">
	//    5   11:invokespecial   #547 <Method void TypeCastException(String)>
	//    6   14:athrow          
		else
			return ((Object) (StringsKt.trimEnd((CharSequence)s))).toString();
	//    7   15:aload_0         
	//    8   16:checkcast       #148 <Class CharSequence>
	//    9   19:invokestatic    #765 <Method CharSequence StringsKt.trimEnd(CharSequence)>
	//   10   22:invokevirtual   #180 <Method String Object.toString()>
	//   11   25:areturn         
	}

	public static final String trimEnd(String s, Function1 function1)
	{
label0:
		{
			Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Intrinsics.checkParameterIsNotNull(((Object) (function1)), "predicate");
	//    3    6:aload_1         
	//    4    7:ldc2            #742 <String "predicate">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			s = ((String) ((CharSequence)s));
	//    6   13:aload_0         
	//    7   14:checkcast       #148 <Class CharSequence>
	//    8   17:astore_0        
			int i = ((CharSequence) (s)).length();
	//    9   18:aload_0         
	//   10   19:invokeinterface #151 <Method int CharSequence.length()>
	//   11   24:istore_2        
			do
			{
				int j = i - 1;
	//   12   25:iload_2         
	//   13   26:iconst_1        
	//   14   27:isub            
	//   15   28:istore_3        
				if(j < 0)
					break;
	//   16   29:iload_3         
	//   17   30:iflt            74
				i = j;
	//   18   33:iload_3         
	//   19   34:istore_2        
				if(!((Boolean)function1.invoke(((Object) (Character.valueOf(((CharSequence) (s)).charAt(j)))))).booleanValue())
	//*  20   35:aload_1         
	//*  21   36:aload_0         
	//*  22   37:iload_3         
	//*  23   38:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//*  24   43:invokestatic    #745 <Method Character Character.valueOf(char)>
	//*  25   46:invokeinterface #748 <Method Object Function1.invoke(Object)>
	//*  26   51:checkcast       #750 <Class Boolean>
	//*  27   54:invokevirtual   #753 <Method boolean Boolean.booleanValue()>
	//*  28   57:ifne            25
				{
					s = ((String) (((CharSequence) (s)).subSequence(0, j + 1)));
	//   29   60:aload_0         
	//   30   61:iconst_0        
	//   31   62:iload_3         
	//   32   63:iconst_1        
	//   33   64:iadd            
	//   34   65:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   35   70:astore_0        
					break label0;
	//   36   71:goto            81
				}
			} while(true);
			s = ((String) ((CharSequence)""));
	//   37   74:ldc2            #423 <String "">
	//   38   77:checkcast       #148 <Class CharSequence>
	//   39   80:astore_0        
		}
		return ((Object) (s)).toString();
	//   40   81:aload_0         
	//   41   82:invokevirtual   #180 <Method String Object.toString()>
	//   42   85:areturn         
	}

	public static final transient String trimEnd(String s, char ac[])
	{
label0:
		{
			Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Intrinsics.checkParameterIsNotNull(((Object) (ac)), "chars");
	//    3    6:aload_1         
	//    4    7:ldc2            #366 <String "chars">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			s = ((String) ((CharSequence)s));
	//    6   13:aload_0         
	//    7   14:checkcast       #148 <Class CharSequence>
	//    8   17:astore_0        
			int i = ((CharSequence) (s)).length();
	//    9   18:aload_0         
	//   10   19:invokeinterface #151 <Method int CharSequence.length()>
	//   11   24:istore_2        
			do
			{
				int j = i - 1;
	//   12   25:iload_2         
	//   13   26:iconst_1        
	//   14   27:isub            
	//   15   28:istore_3        
				if(j < 0)
					break;
	//   16   29:iload_3         
	//   17   30:iflt            63
				i = j;
	//   18   33:iload_3         
	//   19   34:istore_2        
				if(!ArraysKt.contains(ac, ((CharSequence) (s)).charAt(j)))
	//*  20   35:aload_1         
	//*  21   36:aload_0         
	//*  22   37:iload_3         
	//*  23   38:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//*  24   43:invokestatic    #758 <Method boolean ArraysKt.contains(char[], char)>
	//*  25   46:ifne            25
				{
					s = ((String) (((CharSequence) (s)).subSequence(0, j + 1)));
	//   26   49:aload_0         
	//   27   50:iconst_0        
	//   28   51:iload_3         
	//   29   52:iconst_1        
	//   30   53:iadd            
	//   31   54:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   32   59:astore_0        
					break label0;
	//   33   60:goto            70
				}
			} while(true);
			s = ((String) ((CharSequence)""));
	//   34   63:ldc2            #423 <String "">
	//   35   66:checkcast       #148 <Class CharSequence>
	//   36   69:astore_0        
		}
		return ((Object) (s)).toString();
	//   37   70:aload_0         
	//   38   71:invokevirtual   #180 <Method String Object.toString()>
	//   39   74:areturn         
	}

	public static final CharSequence trimStart(CharSequence charsequence)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int j = charsequence.length();
	//    3    6:aload_0         
	//    4    7:invokeinterface #151 <Method int CharSequence.length()>
	//    5   12:istore_2        
		for(int i = 0; i < j; i++)
	//*   6   13:iconst_0        
	//*   7   14:istore_1        
	//*   8   15:iload_1         
	//*   9   16:iload_2         
	//*  10   17:icmpge          54
			if(!CharsKt.isWhitespace(charsequence.charAt(i)))
	//*  11   20:aload_0         
	//*  12   21:iload_1         
	//*  13   22:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//*  14   27:invokestatic    #740 <Method boolean CharsKt.isWhitespace(char)>
	//*  15   30:ifne            47
				return charsequence.subSequence(i, charsequence.length());
	//   16   33:aload_0         
	//   17   34:iload_1         
	//   18   35:aload_0         
	//   19   36:invokeinterface #151 <Method int CharSequence.length()>
	//   20   41:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   21   46:areturn         

	//   22   47:iload_1         
	//   23   48:iconst_1        
	//   24   49:iadd            
	//   25   50:istore_1        
	//*  26   51:goto            15
		return (CharSequence)"";
	//   27   54:ldc2            #423 <String "">
	//   28   57:checkcast       #148 <Class CharSequence>
	//   29   60:areturn         
	}

	public static final CharSequence trimStart(CharSequence charsequence, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "predicate");
	//    3    6:aload_1         
	//    4    7:ldc2            #742 <String "predicate">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int j = charsequence.length();
	//    6   13:aload_0         
	//    7   14:invokeinterface #151 <Method int CharSequence.length()>
	//    8   19:istore_3        
		for(int i = 0; i < j; i++)
	//*   9   20:iconst_0        
	//*  10   21:istore_2        
	//*  11   22:iload_2         
	//*  12   23:iload_3         
	//*  13   24:icmpge          73
			if(!((Boolean)function1.invoke(((Object) (Character.valueOf(charsequence.charAt(i)))))).booleanValue())
	//*  14   27:aload_1         
	//*  15   28:aload_0         
	//*  16   29:iload_2         
	//*  17   30:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//*  18   35:invokestatic    #745 <Method Character Character.valueOf(char)>
	//*  19   38:invokeinterface #748 <Method Object Function1.invoke(Object)>
	//*  20   43:checkcast       #750 <Class Boolean>
	//*  21   46:invokevirtual   #753 <Method boolean Boolean.booleanValue()>
	//*  22   49:ifne            66
				return charsequence.subSequence(i, charsequence.length());
	//   23   52:aload_0         
	//   24   53:iload_2         
	//   25   54:aload_0         
	//   26   55:invokeinterface #151 <Method int CharSequence.length()>
	//   27   60:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   28   65:areturn         

	//   29   66:iload_2         
	//   30   67:iconst_1        
	//   31   68:iadd            
	//   32   69:istore_2        
	//*  33   70:goto            22
		return (CharSequence)"";
	//   34   73:ldc2            #423 <String "">
	//   35   76:checkcast       #148 <Class CharSequence>
	//   36   79:areturn         
	}

	public static final transient CharSequence trimStart(CharSequence charsequence, char ac[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charsequence)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (ac)), "chars");
	//    3    6:aload_1         
	//    4    7:ldc2            #366 <String "chars">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int j = charsequence.length();
	//    6   13:aload_0         
	//    7   14:invokeinterface #151 <Method int CharSequence.length()>
	//    8   19:istore_3        
		for(int i = 0; i < j; i++)
	//*   9   20:iconst_0        
	//*  10   21:istore_2        
	//*  11   22:iload_2         
	//*  12   23:iload_3         
	//*  13   24:icmpge          62
			if(!ArraysKt.contains(ac, charsequence.charAt(i)))
	//*  14   27:aload_1         
	//*  15   28:aload_0         
	//*  16   29:iload_2         
	//*  17   30:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//*  18   35:invokestatic    #758 <Method boolean ArraysKt.contains(char[], char)>
	//*  19   38:ifne            55
				return charsequence.subSequence(i, charsequence.length());
	//   20   41:aload_0         
	//   21   42:iload_2         
	//   22   43:aload_0         
	//   23   44:invokeinterface #151 <Method int CharSequence.length()>
	//   24   49:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   25   54:areturn         

	//   26   55:iload_2         
	//   27   56:iconst_1        
	//   28   57:iadd            
	//   29   58:istore_2        
	//*  30   59:goto            22
		return (CharSequence)"";
	//   31   62:ldc2            #423 <String "">
	//   32   65:checkcast       #148 <Class CharSequence>
	//   33   68:areturn         
	}

	private static final String trimStart(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
	//    2    4:new             #544 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc2            #546 <String "null cannot be cast to non-null type kotlin.CharSequence">
	//    5   11:invokespecial   #547 <Method void TypeCastException(String)>
	//    6   14:athrow          
		else
			return ((Object) (StringsKt.trimStart((CharSequence)s))).toString();
	//    7   15:aload_0         
	//    8   16:checkcast       #148 <Class CharSequence>
	//    9   19:invokestatic    #767 <Method CharSequence StringsKt.trimStart(CharSequence)>
	//   10   22:invokevirtual   #180 <Method String Object.toString()>
	//   11   25:areturn         
	}

	public static final String trimStart(String s, Function1 function1)
	{
label0:
		{
			Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Intrinsics.checkParameterIsNotNull(((Object) (function1)), "predicate");
	//    3    6:aload_1         
	//    4    7:ldc2            #742 <String "predicate">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			s = ((String) ((CharSequence)s));
	//    6   13:aload_0         
	//    7   14:checkcast       #148 <Class CharSequence>
	//    8   17:astore_0        
			int j = ((CharSequence) (s)).length();
	//    9   18:aload_0         
	//   10   19:invokeinterface #151 <Method int CharSequence.length()>
	//   11   24:istore_3        
			int i = 0;
	//   12   25:iconst_0        
	//   13   26:istore_2        
			do
			{
				if(i >= j)
					break;
	//   14   27:iload_2         
	//   15   28:iload_3         
	//   16   29:icmpge          81
				if(!((Boolean)function1.invoke(((Object) (Character.valueOf(((CharSequence) (s)).charAt(i)))))).booleanValue())
	//*  17   32:aload_1         
	//*  18   33:aload_0         
	//*  19   34:iload_2         
	//*  20   35:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//*  21   40:invokestatic    #745 <Method Character Character.valueOf(char)>
	//*  22   43:invokeinterface #748 <Method Object Function1.invoke(Object)>
	//*  23   48:checkcast       #750 <Class Boolean>
	//*  24   51:invokevirtual   #753 <Method boolean Boolean.booleanValue()>
	//*  25   54:ifne            74
				{
					s = ((String) (((CharSequence) (s)).subSequence(i, ((CharSequence) (s)).length())));
	//   26   57:aload_0         
	//   27   58:iload_2         
	//   28   59:aload_0         
	//   29   60:invokeinterface #151 <Method int CharSequence.length()>
	//   30   65:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   31   70:astore_0        
					break label0;
	//   32   71:goto            88
				}
				i++;
	//   33   74:iload_2         
	//   34   75:iconst_1        
	//   35   76:iadd            
	//   36   77:istore_2        
			} while(true);
	//   37   78:goto            27
			s = ((String) ((CharSequence)""));
	//   38   81:ldc2            #423 <String "">
	//   39   84:checkcast       #148 <Class CharSequence>
	//   40   87:astore_0        
		}
		return ((Object) (s)).toString();
	//   41   88:aload_0         
	//   42   89:invokevirtual   #180 <Method String Object.toString()>
	//   43   92:areturn         
	}

	public static final transient String trimStart(String s, char ac[])
	{
label0:
		{
			Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <String "receiver$0">
	//    2    3:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Intrinsics.checkParameterIsNotNull(((Object) (ac)), "chars");
	//    3    6:aload_1         
	//    4    7:ldc2            #366 <String "chars">
	//    5   10:invokestatic    #145 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			s = ((String) ((CharSequence)s));
	//    6   13:aload_0         
	//    7   14:checkcast       #148 <Class CharSequence>
	//    8   17:astore_0        
			int j = ((CharSequence) (s)).length();
	//    9   18:aload_0         
	//   10   19:invokeinterface #151 <Method int CharSequence.length()>
	//   11   24:istore_3        
			int i = 0;
	//   12   25:iconst_0        
	//   13   26:istore_2        
			do
			{
				if(i >= j)
					break;
	//   14   27:iload_2         
	//   15   28:iload_3         
	//   16   29:icmpge          70
				if(!ArraysKt.contains(ac, ((CharSequence) (s)).charAt(i)))
	//*  17   32:aload_1         
	//*  18   33:aload_0         
	//*  19   34:iload_2         
	//*  20   35:invokeinterface #161 <Method char CharSequence.charAt(int)>
	//*  21   40:invokestatic    #758 <Method boolean ArraysKt.contains(char[], char)>
	//*  22   43:ifne            63
				{
					s = ((String) (((CharSequence) (s)).subSequence(i, ((CharSequence) (s)).length())));
	//   23   46:aload_0         
	//   24   47:iload_2         
	//   25   48:aload_0         
	//   26   49:invokeinterface #151 <Method int CharSequence.length()>
	//   27   54:invokeinterface #174 <Method CharSequence CharSequence.subSequence(int, int)>
	//   28   59:astore_0        
					break label0;
	//   29   60:goto            77
				}
				i++;
	//   30   63:iload_2         
	//   31   64:iconst_1        
	//   32   65:iadd            
	//   33   66:istore_2        
			} while(true);
	//   34   67:goto            27
			s = ((String) ((CharSequence)""));
	//   35   70:ldc2            #423 <String "">
	//   36   73:checkcast       #148 <Class CharSequence>
	//   37   76:astore_0        
		}
		return ((Object) (s)).toString();
	//   38   77:aload_0         
	//   39   78:invokevirtual   #180 <Method String Object.toString()>
	//   40   81:areturn         
	}


/*
	public static final Pair access$findAnyOf(CharSequence charsequence, Collection collection, int i, boolean flag, boolean flag1)
	{
		return findAnyOf$StringsKt__StringsKt(charsequence, collection, i, flag, flag1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokestatic    #134 <Method Pair findAnyOf$StringsKt__StringsKt(CharSequence, Collection, int, boolean, boolean)>
	//    6    9:areturn         
	}

*/
}
