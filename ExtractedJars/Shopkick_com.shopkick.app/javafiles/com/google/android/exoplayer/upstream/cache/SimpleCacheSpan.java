// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream.cache;

import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer.upstream.cache:
//			CacheSpan, CachedContentIndex

final class SimpleCacheSpan extends CacheSpan
{

	private SimpleCacheSpan(String s, long l, long l1, long l2, 
			File file)
	{
		super(s, l, l1, l2, file);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:lload           6
	//    5    7:aload           8
	//    6    9:invokespecial   #37  <Method void CacheSpan(String, long, long, long, File)>
	//    7   12:return          
	}

	public static SimpleCacheSpan createCacheEntry(File file, CachedContentIndex cachedcontentindex)
	{
		Object obj = ((Object) (file.getName()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method String File.getName()>
	//    2    4:astore          4
		if(!((String) (obj)).endsWith(".v3.exo"))
	//*   3    6:aload           4
	//*   4    8:ldc1            #12  <String ".v3.exo">
	//*   5   10:invokevirtual   #51  <Method boolean String.endsWith(String)>
	//*   6   13:ifne            37
		{
			file = upgradeFile(file, cachedcontentindex);
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:invokestatic    #55  <Method File upgradeFile(File, CachedContentIndex)>
	//   10   21:astore_0        
			if(file == null)
	//*  11   22:aload_0         
	//*  12   23:ifnonnull       28
				return null;
	//   13   26:aconst_null     
	//   14   27:areturn         
			obj = ((Object) (file.getName()));
	//   15   28:aload_0         
	//   16   29:invokevirtual   #45  <Method String File.getName()>
	//   17   32:astore          4
		}
	//*  18   34:goto            37
		obj = ((Object) (CACHE_FILE_PATTERN_V3.matcher(((CharSequence) (obj)))));
	//   19   37:getstatic       #32  <Field Pattern CACHE_FILE_PATTERN_V3>
	//   20   40:aload           4
	//   21   42:invokevirtual   #59  <Method Matcher Pattern.matcher(CharSequence)>
	//   22   45:astore          4
		if(!((Matcher) (obj)).matches())
	//*  23   47:aload           4
	//*  24   49:invokevirtual   #65  <Method boolean Matcher.matches()>
	//*  25   52:ifne            57
			return null;
	//   26   55:aconst_null     
	//   27   56:areturn         
		long l = file.length();
	//   28   57:aload_0         
	//   29   58:invokevirtual   #69  <Method long File.length()>
	//   30   61:lstore_2        
		cachedcontentindex = ((CachedContentIndex) (cachedcontentindex.getKeyForId(Integer.parseInt(((Matcher) (obj)).group(1)))));
	//   31   62:aload_1         
	//   32   63:aload           4
	//   33   65:iconst_1        
	//   34   66:invokevirtual   #73  <Method String Matcher.group(int)>
	//   35   69:invokestatic    #79  <Method int Integer.parseInt(String)>
	//   36   72:invokevirtual   #84  <Method String CachedContentIndex.getKeyForId(int)>
	//   37   75:astore_1        
		if(cachedcontentindex == null)
	//*  38   76:aload_1         
	//*  39   77:ifnonnull       82
			return null;
	//   40   80:aconst_null     
	//   41   81:areturn         
		else
			return new SimpleCacheSpan(((String) (cachedcontentindex)), Long.parseLong(((Matcher) (obj)).group(2)), l, Long.parseLong(((Matcher) (obj)).group(3)), file);
	//   42   82:new             #2   <Class SimpleCacheSpan>
	//   43   85:dup             
	//   44   86:aload_1         
	//   45   87:aload           4
	//   46   89:iconst_2        
	//   47   90:invokevirtual   #73  <Method String Matcher.group(int)>
	//   48   93:invokestatic    #90  <Method long Long.parseLong(String)>
	//   49   96:lload_2         
	//   50   97:aload           4
	//   51   99:iconst_3        
	//   52  100:invokevirtual   #73  <Method String Matcher.group(int)>
	//   53  103:invokestatic    #90  <Method long Long.parseLong(String)>
	//   54  106:aload_0         
	//   55  107:invokespecial   #91  <Method void SimpleCacheSpan(String, long, long, long, File)>
	//   56  110:areturn         
	}

	public static SimpleCacheSpan createClosedHole(String s, long l, long l1)
	{
		return new SimpleCacheSpan(s, l, l1, -1L, ((File) (null)));
	//    0    0:new             #2   <Class SimpleCacheSpan>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:lload_3         
	//    5    7:ldc2w           #94  <Long -1L>
	//    6   10:aconst_null     
	//    7   11:invokespecial   #91  <Method void SimpleCacheSpan(String, long, long, long, File)>
	//    8   14:areturn         
	}

	public static SimpleCacheSpan createLookup(String s, long l)
	{
		return new SimpleCacheSpan(s, l, -1L, -1L, ((File) (null)));
	//    0    0:new             #2   <Class SimpleCacheSpan>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:ldc2w           #94  <Long -1L>
	//    5    9:ldc2w           #94  <Long -1L>
	//    6   12:aconst_null     
	//    7   13:invokespecial   #91  <Method void SimpleCacheSpan(String, long, long, long, File)>
	//    8   16:areturn         
	}

	public static SimpleCacheSpan createOpenHole(String s, long l)
	{
		return new SimpleCacheSpan(s, l, -1L, -1L, ((File) (null)));
	//    0    0:new             #2   <Class SimpleCacheSpan>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:ldc2w           #94  <Long -1L>
	//    5    9:ldc2w           #94  <Long -1L>
	//    6   12:aconst_null     
	//    7   13:invokespecial   #91  <Method void SimpleCacheSpan(String, long, long, long, File)>
	//    8   16:areturn         
	}

	public static File getCacheFile(File file, int i, long l, long l1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #102 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #104 <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append(i);
	//    4    9:aload           6
	//    5   11:iload_1         
	//    6   12:invokevirtual   #108 <Method StringBuilder StringBuilder.append(int)>
	//    7   15:pop             
		stringbuilder.append(".");
	//    8   16:aload           6
	//    9   18:ldc1            #110 <String ".">
	//   10   20:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(l);
	//   12   24:aload           6
	//   13   26:lload_2         
	//   14   27:invokevirtual   #116 <Method StringBuilder StringBuilder.append(long)>
	//   15   30:pop             
		stringbuilder.append(".");
	//   16   31:aload           6
	//   17   33:ldc1            #110 <String ".">
	//   18   35:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		stringbuilder.append(l1);
	//   20   39:aload           6
	//   21   41:lload           4
	//   22   43:invokevirtual   #116 <Method StringBuilder StringBuilder.append(long)>
	//   23   46:pop             
		stringbuilder.append(".v3.exo");
	//   24   47:aload           6
	//   25   49:ldc1            #12  <String ".v3.exo">
	//   26   51:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
		return new File(file, stringbuilder.toString());
	//   28   55:new             #41  <Class File>
	//   29   58:dup             
	//   30   59:aload_0         
	//   31   60:aload           6
	//   32   62:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   33   65:invokespecial   #122 <Method void File(File, String)>
	//   34   68:areturn         
	}

	private static File upgradeFile(File file, CachedContentIndex cachedcontentindex)
	{
		String s = file.getName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method String File.getName()>
	//    2    4:astore_2        
		Matcher matcher = CACHE_FILE_PATTERN_V2.matcher(((CharSequence) (s)));
	//    3    5:getstatic       #28  <Field Pattern CACHE_FILE_PATTERN_V2>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #59  <Method Matcher Pattern.matcher(CharSequence)>
	//    6   12:astore_3        
		if(matcher.matches())
	//*   7   13:aload_3         
	//*   8   14:invokevirtual   #65  <Method boolean Matcher.matches()>
	//*   9   17:ifeq            40
		{
			String s1 = Util.unescapeFileName(matcher.group(1));
	//   10   20:aload_3         
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #73  <Method String Matcher.group(int)>
	//   13   25:invokestatic    #128 <Method String Util.unescapeFileName(String)>
	//   14   28:astore          4
			s = s1;
	//   15   30:aload           4
	//   16   32:astore_2        
			if(s1 == null)
	//*  17   33:aload           4
	//*  18   35:ifnonnull       63
				return null;
	//   19   38:aconst_null     
	//   20   39:areturn         
		} else
		{
			matcher = CACHE_FILE_PATTERN_V1.matcher(((CharSequence) (s)));
	//   21   40:getstatic       #24  <Field Pattern CACHE_FILE_PATTERN_V1>
	//   22   43:aload_2         
	//   23   44:invokevirtual   #59  <Method Matcher Pattern.matcher(CharSequence)>
	//   24   47:astore_3        
			if(!matcher.matches())
	//*  25   48:aload_3         
	//*  26   49:invokevirtual   #65  <Method boolean Matcher.matches()>
	//*  27   52:ifne            57
				return null;
	//   28   55:aconst_null     
	//   29   56:areturn         
			s = matcher.group(1);
	//   30   57:aload_3         
	//   31   58:iconst_1        
	//   32   59:invokevirtual   #73  <Method String Matcher.group(int)>
	//   33   62:astore_2        
		}
		cachedcontentindex = ((CachedContentIndex) (getCacheFile(file.getParentFile(), cachedcontentindex.assignIdForKey(s), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)))));
	//   34   63:aload_0         
	//   35   64:invokevirtual   #132 <Method File File.getParentFile()>
	//   36   67:aload_1         
	//   37   68:aload_2         
	//   38   69:invokevirtual   #135 <Method int CachedContentIndex.assignIdForKey(String)>
	//   39   72:aload_3         
	//   40   73:iconst_2        
	//   41   74:invokevirtual   #73  <Method String Matcher.group(int)>
	//   42   77:invokestatic    #90  <Method long Long.parseLong(String)>
	//   43   80:aload_3         
	//   44   81:iconst_3        
	//   45   82:invokevirtual   #73  <Method String Matcher.group(int)>
	//   46   85:invokestatic    #90  <Method long Long.parseLong(String)>
	//   47   88:invokestatic    #137 <Method File getCacheFile(File, int, long, long)>
	//   48   91:astore_1        
		if(!file.renameTo(((File) (cachedcontentindex))))
	//*  49   92:aload_0         
	//*  50   93:aload_1         
	//*  51   94:invokevirtual   #141 <Method boolean File.renameTo(File)>
	//*  52   97:ifne            102
			return null;
	//   53  100:aconst_null     
	//   54  101:areturn         
		else
			return ((File) (cachedcontentindex));
	//   55  102:aload_1         
	//   56  103:areturn         
	}

	public SimpleCacheSpan copyWithUpdatedLastAccessTime(int i)
	{
		Assertions.checkState(isCached);
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field boolean isCached>
	//    2    4:invokestatic    #153 <Method void Assertions.checkState(boolean)>
		long l = System.currentTimeMillis();
	//    3    7:invokestatic    #158 <Method long System.currentTimeMillis()>
	//    4   10:lstore_2        
		File file = getCacheFile(this.file.getParentFile(), i, position, l);
	//    5   11:aload_0         
	//    6   12:getfield        #162 <Field File file>
	//    7   15:invokevirtual   #132 <Method File File.getParentFile()>
	//    8   18:iload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #166 <Field long position>
	//   11   23:lload_2         
	//   12   24:invokestatic    #137 <Method File getCacheFile(File, int, long, long)>
	//   13   27:astore          4
		return new SimpleCacheSpan(key, position, length, l, file);
	//   14   29:new             #2   <Class SimpleCacheSpan>
	//   15   32:dup             
	//   16   33:aload_0         
	//   17   34:getfield        #169 <Field String key>
	//   18   37:aload_0         
	//   19   38:getfield        #166 <Field long position>
	//   20   41:aload_0         
	//   21   42:getfield        #171 <Field long length>
	//   22   45:lload_2         
	//   23   46:aload           4
	//   24   48:invokespecial   #91  <Method void SimpleCacheSpan(String, long, long, long, File)>
	//   25   51:areturn         
	}

	private static final Pattern CACHE_FILE_PATTERN_V1 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
	private static final Pattern CACHE_FILE_PATTERN_V2 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
	private static final Pattern CACHE_FILE_PATTERN_V3 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
	private static final String SUFFIX = ".v3.exo";

	static 
	{
	//    0    0:ldc1            #16  <String "^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$">
	//    1    2:bipush          32
	//    2    4:invokestatic    #22  <Method Pattern Pattern.compile(String, int)>
	//    3    7:putstatic       #24  <Field Pattern CACHE_FILE_PATTERN_V1>
	//    4   10:ldc1            #26  <String "^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$">
	//    5   12:bipush          32
	//    6   14:invokestatic    #22  <Method Pattern Pattern.compile(String, int)>
	//    7   17:putstatic       #28  <Field Pattern CACHE_FILE_PATTERN_V2>
	//    8   20:ldc1            #30  <String "^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$">
	//    9   22:bipush          32
	//   10   24:invokestatic    #22  <Method Pattern Pattern.compile(String, int)>
	//   11   27:putstatic       #32  <Field Pattern CACHE_FILE_PATTERN_V3>
	//*  12   30:return          
	}
}
