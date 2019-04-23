// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import java.io.*;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer.util:
//			Assertions

public final class Util
{

	private Util()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #341 <Method void Object()>
	//    2    4:return          
	}

	public static boolean areEqual(Object obj, Object obj1)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			return obj1 == null;
	//    2    4:aload_1         
	//    3    5:ifnonnull       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
		else
			return obj.equals(obj1);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #347 <Method boolean Object.equals(Object)>
	//   11   17:ireturn         
	}

	public static int binarySearchCeil(List list, Object obj, boolean flag, boolean flag1)
	{
		int i = Collections.binarySearch(list, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #355 <Method int Collections.binarySearch(List, Object)>
	//    3    5:istore          4
		if(i < 0)
	//*   4    7:iload           4
	//*   5    9:ifge            19
			i = i;
	//    6   12:iload           4
	//    7   14:istore          4
		else
	//*   8   16:goto            32
		if(!flag)
	//*   9   19:iload_2         
	//*  10   20:ifeq            26
	//*  11   23:goto            32
			i++;
	//   12   26:iload           4
	//   13   28:iconst_1        
	//   14   29:iadd            
	//   15   30:istore          4
		int j = i;
	//   16   32:iload           4
	//   17   34:istore          5
		if(flag1)
	//*  18   36:iload_3         
	//*  19   37:ifeq            55
			j = Math.min(list.size() - 1, i);
	//   20   40:aload_0         
	//   21   41:invokeinterface #361 <Method int List.size()>
	//   22   46:iconst_1        
	//   23   47:isub            
	//   24   48:iload           4
	//   25   50:invokestatic    #367 <Method int Math.min(int, int)>
	//   26   53:istore          5
		return j;
	//   27   55:iload           5
	//   28   57:ireturn         
	}

	public static int binarySearchCeil(long al[], long l, boolean flag, boolean flag1)
	{
		int i = Arrays.binarySearch(al, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #375 <Method int Arrays.binarySearch(long[], long)>
	//    3    5:istore          5
		if(i < 0)
	//*   4    7:iload           5
	//*   5    9:ifge            19
			i = i;
	//    6   12:iload           5
	//    7   14:istore          5
		else
	//*   8   16:goto            32
		if(!flag)
	//*   9   19:iload_3         
	//*  10   20:ifeq            26
	//*  11   23:goto            32
			i++;
	//   12   26:iload           5
	//   13   28:iconst_1        
	//   14   29:iadd            
	//   15   30:istore          5
		int j = i;
	//   16   32:iload           5
	//   17   34:istore          6
		if(flag1)
	//*  18   36:iload           4
	//*  19   38:ifeq            52
			j = Math.min(al.length - 1, i);
	//   20   41:aload_0         
	//   21   42:arraylength     
	//   22   43:iconst_1        
	//   23   44:isub            
	//   24   45:iload           5
	//   25   47:invokestatic    #367 <Method int Math.min(int, int)>
	//   26   50:istore          6
		return j;
	//   27   52:iload           6
	//   28   54:ireturn         
	}

	public static int binarySearchFloor(List list, Object obj, boolean flag, boolean flag1)
	{
		int i = Collections.binarySearch(list, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #355 <Method int Collections.binarySearch(List, Object)>
	//    3    5:istore          4
		if(i < 0)
	//*   4    7:iload           4
	//*   5    9:ifge            22
			i = -(i + 2);
	//    6   12:iload           4
	//    7   14:iconst_2        
	//    8   15:iadd            
	//    9   16:ineg            
	//   10   17:istore          4
		else
	//*  11   19:goto            35
		if(!flag)
	//*  12   22:iload_2         
	//*  13   23:ifeq            29
	//*  14   26:goto            35
			i--;
	//   15   29:iload           4
	//   16   31:iconst_1        
	//   17   32:isub            
	//   18   33:istore          4
		int j = i;
	//   19   35:iload           4
	//   20   37:istore          5
		if(flag1)
	//*  21   39:iload_3         
	//*  22   40:ifeq            51
			j = Math.max(0, i);
	//   23   43:iconst_0        
	//   24   44:iload           4
	//   25   46:invokestatic    #379 <Method int Math.max(int, int)>
	//   26   49:istore          5
		return j;
	//   27   51:iload           5
	//   28   53:ireturn         
	}

	public static int binarySearchFloor(long al[], long l, boolean flag, boolean flag1)
	{
		int i = Arrays.binarySearch(al, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #375 <Method int Arrays.binarySearch(long[], long)>
	//    3    5:istore          5
		if(i < 0)
	//*   4    7:iload           5
	//*   5    9:ifge            22
			i = -(i + 2);
	//    6   12:iload           5
	//    7   14:iconst_2        
	//    8   15:iadd            
	//    9   16:ineg            
	//   10   17:istore          5
		else
	//*  11   19:goto            35
		if(!flag)
	//*  12   22:iload_3         
	//*  13   23:ifeq            29
	//*  14   26:goto            35
			i--;
	//   15   29:iload           5
	//   16   31:iconst_1        
	//   17   32:isub            
	//   18   33:istore          5
		int j = i;
	//   19   35:iload           5
	//   20   37:istore          6
		if(flag1)
	//*  21   39:iload           4
	//*  22   41:ifeq            52
			j = Math.max(0, i);
	//   23   44:iconst_0        
	//   24   45:iload           5
	//   25   47:invokestatic    #379 <Method int Math.max(int, int)>
	//   26   50:istore          6
		return j;
	//   27   52:iload           6
	//   28   54:ireturn         
	}

	public static int ceilDivide(int i, int j)
	{
		return ((i + j) - 1) / j;
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iadd            
	//    3    3:iconst_1        
	//    4    4:isub            
	//    5    5:iload_1         
	//    6    6:idiv            
	//    7    7:ireturn         
	}

	public static long ceilDivide(long l, long l1)
	{
		return ((l + l1) - 1L) / l1;
	//    0    0:lload_0         
	//    1    1:lload_2         
	//    2    2:ladd            
	//    3    3:lconst_1        
	//    4    4:lsub            
	//    5    5:lload_2         
	//    6    6:ldiv            
	//    7    7:lreturn         
	}

	public static void closeQuietly(DataSource datasource)
	{
		if(datasource == null)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:aload_0         
	//    1    1:ifnull          10
		datasource.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #390 <Method void DataSource.close()>
		return;
	//    4   10:return          
		datasource;
	//    5   11:astore_0        
	//    6   12:return          
	}

	public static void closeQuietly(Closeable closeable)
	{
		if(closeable == null)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:aload_0         
	//    1    1:ifnull          10
		closeable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #394 <Method void Closeable.close()>
		return;
	//    4   10:return          
		closeable;
	//    5   11:astore_0        
	//    6   12:return          
	}

	public static boolean contains(Object aobj[], Object obj)
	{
		for(int i = 0; i < aobj.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:arraylength     
	//*   5    5:icmpge          27
			if(areEqual(aobj[i], obj))
	//*   6    8:aload_0         
	//*   7    9:iload_2         
	//*   8   10:aaload          
	//*   9   11:aload_1         
	//*  10   12:invokestatic    #398 <Method boolean areEqual(Object, Object)>
	//*  11   15:ifeq            20
				return true;
	//   12   18:iconst_1        
	//   13   19:ireturn         

	//   14   20:iload_2         
	//   15   21:iconst_1        
	//   16   22:iadd            
	//   17   23:istore_2        
	//*  18   24:goto            2
		return false;
	//   19   27:iconst_0        
	//   20   28:ireturn         
	}

	public static int crc(byte abyte0[], int i, int j, int k)
	{
		for(; i < j; i++)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpge          38
			k = CRC32_BYTES_MSBF[(k >>> 24 ^ abyte0[i] & 0xff) & 0xff] ^ k << 8;
	//    3    5:getstatic       #337 <Field int[] CRC32_BYTES_MSBF>
	//    4    8:iload_3         
	//    5    9:bipush          24
	//    6   11:iushr           
	//    7   12:aload_0         
	//    8   13:iload_1         
	//    9   14:baload          
	//   10   15:sipush          255
	//   11   18:iand            
	//   12   19:ixor            
	//   13   20:sipush          255
	//   14   23:iand            
	//   15   24:iaload          
	//   16   25:iload_3         
	//   17   26:bipush          8
	//   18   28:ishl            
	//   19   29:ixor            
	//   20   30:istore_3        

	//   21   31:iload_1         
	//   22   32:iconst_1        
	//   23   33:iadd            
	//   24   34:istore_1        
	//*  25   35:goto            0
		return k;
	//   26   38:iload_3         
	//   27   39:ireturn         
	}

	public static String escapeFileName(String s)
	{
		int l = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #405 <Method int String.length()>
	//    2    4:istore          6
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		int j = 0;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		int i;
		int k;
		for(i = j; j < l; i = k)
	//*   7   11:iload_3         
	//*   8   12:istore_2        
	//*   9   13:iload_3         
	//*  10   14:iload           6
	//*  11   16:icmpge          48
		{
			k = i;
	//   12   19:iload_2         
	//   13   20:istore          4
			if(shouldEscapeCharacter(s.charAt(j)))
	//*  14   22:aload_0         
	//*  15   23:iload_3         
	//*  16   24:invokevirtual   #50  <Method char String.charAt(int)>
	//*  17   27:invokestatic    #409 <Method boolean shouldEscapeCharacter(char)>
	//*  18   30:ifeq            38
				k = i + 1;
	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore          4
			j++;
	//   23   38:iload_3         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_3        
		}

	//   27   42:iload           4
	//   28   44:istore_2        
	//*  29   45:goto            13
		if(i == 0)
	//*  30   48:iload_2         
	//*  31   49:ifne            54
			return s;
	//   32   52:aload_0         
	//   33   53:areturn         
		StringBuilder stringbuilder = new StringBuilder(i * 2 + l);
	//   34   54:new             #411 <Class StringBuilder>
	//   35   57:dup             
	//   36   58:iload_2         
	//   37   59:iconst_2        
	//   38   60:imul            
	//   39   61:iload           6
	//   40   63:iadd            
	//   41   64:invokespecial   #414 <Method void StringBuilder(int)>
	//   42   67:astore          7
		j = i;
	//   43   69:iload_2         
	//   44   70:istore_3        
		for(i = ((int) (flag)); j > 0; i++)
	//*  45   71:iload           5
	//*  46   73:istore_2        
	//*  47   74:iload_3         
	//*  48   75:ifle            130
		{
			char c = s.charAt(i);
	//   49   78:aload_0         
	//   50   79:iload_2         
	//   51   80:invokevirtual   #50  <Method char String.charAt(int)>
	//   52   83:istore_1        
			if(shouldEscapeCharacter(c))
	//*  53   84:iload_1         
	//*  54   85:invokestatic    #409 <Method boolean shouldEscapeCharacter(char)>
	//*  55   88:ifeq            116
			{
				stringbuilder.append('%');
	//   56   91:aload           7
	//   57   93:bipush          37
	//   58   95:invokevirtual   #418 <Method StringBuilder StringBuilder.append(char)>
	//   59   98:pop             
				stringbuilder.append(Integer.toHexString(((int) (c))));
	//   60   99:aload           7
	//   61  101:iload_1         
	//   62  102:invokestatic    #424 <Method String Integer.toHexString(int)>
	//   63  105:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//   64  108:pop             
				j--;
	//   65  109:iload_3         
	//   66  110:iconst_1        
	//   67  111:isub            
	//   68  112:istore_3        
			} else
	//*  69  113:goto            123
			{
				stringbuilder.append(c);
	//   70  116:aload           7
	//   71  118:iload_1         
	//   72  119:invokevirtual   #418 <Method StringBuilder StringBuilder.append(char)>
	//   73  122:pop             
			}
		}

	//   74  123:iload_2         
	//   75  124:iconst_1        
	//   76  125:iadd            
	//   77  126:istore_2        
	//*  78  127:goto            74
		if(i < l)
	//*  79  130:iload_2         
	//*  80  131:iload           6
	//*  81  133:icmpge          146
			stringbuilder.append(((CharSequence) (s)), i, l);
	//   82  136:aload           7
	//   83  138:aload_0         
	//   84  139:iload_2         
	//   85  140:iload           6
	//   86  142:invokevirtual   #430 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   87  145:pop             
		return stringbuilder.toString();
	//   88  146:aload           7
	//   89  148:invokevirtual   #434 <Method String StringBuilder.toString()>
	//   90  151:areturn         
	}

	public static byte[] executePost(String s, byte abyte0[], Map map)
		throws IOException
	{
		s = ((String) ((HttpURLConnection)(new URL(s)).openConnection()));
	//    0    0:new             #438 <Class URL>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #441 <Method void URL(String)>
	//    4    8:invokevirtual   #445 <Method java.net.URLConnection URL.openConnection()>
	//    5   11:checkcast       #447 <Class HttpURLConnection>
	//    6   14:astore_0        
		((HttpURLConnection) (s)).setRequestMethod("POST");
	//    7   15:aload_0         
	//    8   16:ldc2            #449 <String "POST">
	//    9   19:invokevirtual   #452 <Method void HttpURLConnection.setRequestMethod(String)>
		boolean flag;
		if(abyte0 != null)
	//*  10   22:aload_1         
	//*  11   23:ifnull          180
			flag = true;
	//   12   26:iconst_1        
	//   13   27:istore_3        
		else
	//*  14   28:goto            31
	//*  15   31:aload_0         
	//*  16   32:iload_3         
	//*  17   33:invokevirtual   #456 <Method void HttpURLConnection.setDoOutput(boolean)>
	//*  18   36:aload_0         
	//*  19   37:iconst_1        
	//*  20   38:invokevirtual   #459 <Method void HttpURLConnection.setDoInput(boolean)>
	//*  21   41:aload_2         
	//*  22   42:ifnull          104
	//*  23   45:aload_2         
	//*  24   46:invokeinterface #465 <Method Set Map.entrySet()>
	//*  25   51:invokeinterface #471 <Method Iterator Set.iterator()>
	//*  26   56:astore_2        
	//*  27   57:aload_2         
	//*  28   58:invokeinterface #477 <Method boolean Iterator.hasNext()>
	//*  29   63:ifeq            104
	//*  30   66:aload_2         
	//*  31   67:invokeinterface #481 <Method Object Iterator.next()>
	//*  32   72:checkcast       #483 <Class java.util.Map$Entry>
	//*  33   75:astore          4
	//*  34   77:aload_0         
	//*  35   78:aload           4
	//*  36   80:invokeinterface #486 <Method Object java.util.Map$Entry.getKey()>
	//*  37   85:checkcast       #46  <Class String>
	//*  38   88:aload           4
	//*  39   90:invokeinterface #489 <Method Object java.util.Map$Entry.getValue()>
	//*  40   95:checkcast       #46  <Class String>
	//*  41   98:invokevirtual   #493 <Method void HttpURLConnection.setRequestProperty(String, String)>
	//*  42  101:goto            57
	//*  43  104:aload_1         
	//*  44  105:ifnull          132
	//*  45  108:aload_0         
	//*  46  109:invokevirtual   #497 <Method OutputStream HttpURLConnection.getOutputStream()>
	//*  47  112:astore_2        
	//*  48  113:aload_2         
	//*  49  114:aload_1         
	//*  50  115:invokevirtual   #503 <Method void OutputStream.write(byte[])>
	//*  51  118:aload_2         
	//*  52  119:invokevirtual   #504 <Method void OutputStream.close()>
	//*  53  122:goto            132
	//*  54  125:astore_1        
	//*  55  126:aload_2         
	//*  56  127:invokevirtual   #504 <Method void OutputStream.close()>
	//*  57  130:aload_1         
	//*  58  131:athrow          
	//*  59  132:aload_0         
	//*  60  133:invokevirtual   #508 <Method InputStream HttpURLConnection.getInputStream()>
	//*  61  136:astore_1        
	//*  62  137:aload_1         
	//*  63  138:invokestatic    #512 <Method byte[] toByteArray(InputStream)>
	//*  64  141:astore_2        
	//*  65  142:aload_1         
	//*  66  143:invokestatic    #514 <Method void closeQuietly(Closeable)>
	//*  67  146:aload_0         
	//*  68  147:ifnull          154
	//*  69  150:aload_0         
	//*  70  151:invokevirtual   #517 <Method void HttpURLConnection.disconnect()>
	//*  71  154:aload_2         
	//*  72  155:areturn         
	//*  73  156:astore_2        
	//*  74  157:aload_1         
	//*  75  158:invokestatic    #514 <Method void closeQuietly(Closeable)>
	//*  76  161:aload_2         
	//*  77  162:athrow          
	//*  78  163:astore_1        
	//*  79  164:goto            170
	//*  80  167:astore_1        
	//*  81  168:aconst_null     
	//*  82  169:astore_0        
	//*  83  170:aload_0         
	//*  84  171:ifnull          178
	//*  85  174:aload_0         
	//*  86  175:invokevirtual   #517 <Method void HttpURLConnection.disconnect()>
	//*  87  178:aload_1         
	//*  88  179:athrow          
			flag = false;
	//   89  180:iconst_0        
	//   90  181:istore_3        
		((HttpURLConnection) (s)).setDoOutput(flag);
		((HttpURLConnection) (s)).setDoInput(true);
		if(map == null)
			break MISSING_BLOCK_LABEL_104;
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); ((HttpURLConnection) (s)).setRequestProperty((String)entry.getKey(), (String)entry.getValue()))
			entry = (java.util.Map.Entry)((Iterator) (map)).next();

		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_132;
		map = ((Map) (((HttpURLConnection) (s)).getOutputStream()));
		((OutputStream) (map)).write(abyte0);
		((OutputStream) (map)).close();
		break MISSING_BLOCK_LABEL_132;
		abyte0;
		((OutputStream) (map)).close();
		throw abyte0;
		abyte0 = ((byte []) (((HttpURLConnection) (s)).getInputStream()));
		map = ((Map) (toByteArray(((InputStream) (abyte0)))));
		closeQuietly(((Closeable) (abyte0)));
		if(s != null)
			((HttpURLConnection) (s)).disconnect();
		return ((byte []) (map));
		map;
		closeQuietly(((Closeable) (abyte0)));
		throw map;
		abyte0;
		break MISSING_BLOCK_LABEL_170;
		abyte0;
		s = null;
		if(s != null)
			((HttpURLConnection) (s)).disconnect();
		throw abyte0;
	//*  91  182:goto            31
	}

	public static int[] firstIntegersArray(int i)
	{
		int ai[] = new int[i];
	//    0    0:iload_0         
	//    1    1:newarray        int[]
	//    2    3:astore_2        
		for(int j = 0; j < i; j++)
	//*   3    4:iconst_0        
	//*   4    5:istore_1        
	//*   5    6:iload_1         
	//*   6    7:iload_0         
	//*   7    8:icmpge          22
			ai[j] = j;
	//    8   11:aload_2         
	//    9   12:iload_1         
	//   10   13:iload_1         
	//   11   14:iastore         

	//   12   15:iload_1         
	//   13   16:iconst_1        
	//   14   17:iadd            
	//   15   18:istore_1        
	//*  16   19:goto            6
		return ai;
	//   17   22:aload_2         
	//   18   23:areturn         
	}

	public static int getBottomInt(long l)
	{
		return (int)l;
	//    0    0:lload_0         
	//    1    1:l2i             
	//    2    2:ireturn         
	}

	public static byte[] getBytesFromHexString(String s)
	{
		byte abyte0[] = new byte[s.length() / 2];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #405 <Method int String.length()>
	//    2    4:iconst_2        
	//    3    5:idiv            
	//    4    6:newarray        byte[]
	//    5    8:astore_3        
		for(int i = 0; i < abyte0.length; i++)
	//*   6    9:iconst_0        
	//*   7   10:istore_1        
	//*   8   11:iload_1         
	//*   9   12:aload_3         
	//*  10   13:arraylength     
	//*  11   14:icmpge          57
		{
			int j = i * 2;
	//   12   17:iload_1         
	//   13   18:iconst_2        
	//   14   19:imul            
	//   15   20:istore_2        
			abyte0[i] = (byte)((Character.digit(s.charAt(j), 16) << 4) + Character.digit(s.charAt(j + 1), 16));
	//   16   21:aload_3         
	//   17   22:iload_1         
	//   18   23:aload_0         
	//   19   24:iload_2         
	//   20   25:invokevirtual   #50  <Method char String.charAt(int)>
	//   21   28:bipush          16
	//   22   30:invokestatic    #531 <Method int Character.digit(char, int)>
	//   23   33:iconst_4        
	//   24   34:ishl            
	//   25   35:aload_0         
	//   26   36:iload_2         
	//   27   37:iconst_1        
	//   28   38:iadd            
	//   29   39:invokevirtual   #50  <Method char String.charAt(int)>
	//   30   42:bipush          16
	//   31   44:invokestatic    #531 <Method int Character.digit(char, int)>
	//   32   47:iadd            
	//   33   48:int2byte        
	//   34   49:bastore         
		}

	//   35   50:iload_1         
	//   36   51:iconst_1        
	//   37   52:iadd            
	//   38   53:istore_1        
	//*  39   54:goto            11
		return abyte0;
	//   40   57:aload_3         
	//   41   58:areturn         
	}

	public static String getCommaDelimitedSimpleClassNames(Object aobj[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #411 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #534 <Method void StringBuilder()>
	//    3    7:astore_2        
		for(int i = 0; i < aobj.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:arraylength     
	//*   9   13:icmpge          53
		{
			stringbuilder.append(aobj[i].getClass().getSimpleName());
	//   10   16:aload_2         
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:aaload          
	//   14   20:invokevirtual   #538 <Method Class Object.getClass()>
	//   15   23:invokevirtual   #543 <Method String Class.getSimpleName()>
	//   16   26:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//   17   29:pop             
			if(i < aobj.length - 1)
	//*  18   30:iload_1         
	//*  19   31:aload_0         
	//*  20   32:arraylength     
	//*  21   33:iconst_1        
	//*  22   34:isub            
	//*  23   35:icmpge          46
				stringbuilder.append(", ");
	//   24   38:aload_2         
	//   25   39:ldc2            #545 <String ", ">
	//   26   42:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//   27   45:pop             
		}

	//   28   46:iload_1         
	//   29   47:iconst_1        
	//   30   48:iadd            
	//   31   49:istore_1        
	//*  32   50:goto            10
		return stringbuilder.toString();
	//   33   53:aload_2         
	//   34   54:invokevirtual   #434 <Method String StringBuilder.toString()>
	//   35   57:areturn         
	}

	private static void getDisplaySizeV16(Display display, Point point)
	{
		display.getSize(point);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #557 <Method void Display.getSize(Point)>
	//    3    5:return          
	}

	private static void getDisplaySizeV17(Display display, Point point)
	{
		display.getRealSize(point);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #563 <Method void Display.getRealSize(Point)>
	//    3    5:return          
	}

	private static void getDisplaySizeV23(Display display, Point point)
	{
		display = ((Display) (display.getMode()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #569 <Method android.view.Display$Mode Display.getMode()>
	//    2    4:astore_0        
		point.x = ((android.view.Display.Mode) (display)).getPhysicalWidth();
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #574 <Method int android.view.Display$Mode.getPhysicalWidth()>
	//    6   10:putfield        #579 <Field int Point.x>
		point.y = ((android.view.Display.Mode) (display)).getPhysicalHeight();
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #582 <Method int android.view.Display$Mode.getPhysicalHeight()>
	//   10   18:putfield        #585 <Field int Point.y>
	//   11   21:return          
	}

	private static void getDisplaySizeV9(Display display, Point point)
	{
		point.x = display.getWidth();
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #589 <Method int Display.getWidth()>
	//    3    5:putfield        #579 <Field int Point.x>
		point.y = display.getHeight();
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #592 <Method int Display.getHeight()>
	//    7   13:putfield        #585 <Field int Point.y>
	//    8   16:return          
	}

	public static String getHexStringFromBytes(byte abyte0[], int i, int j)
	{
		StringBuilder stringbuilder = new StringBuilder(j - i);
	//    0    0:new             #411 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:iload_1         
	//    4    6:isub            
	//    5    7:invokespecial   #414 <Method void StringBuilder(int)>
	//    6   10:astore_3        
		for(; i < j; i++)
	//*   7   11:iload_1         
	//*   8   12:iload_2         
	//*   9   13:icmpge          50
			stringbuilder.append(String.format(Locale.US, "%02X", new Object[] {
				Byte.valueOf(abyte0[i])
			}));
	//   10   16:aload_3         
	//   11   17:getstatic       #600 <Field Locale Locale.US>
	//   12   20:ldc2            #602 <String "%02X">
	//   13   23:iconst_1        
	//   14   24:anewarray       Object[]
	//   15   27:dup             
	//   16   28:iconst_0        
	//   17   29:aload_0         
	//   18   30:iload_1         
	//   19   31:baload          
	//   20   32:invokestatic    #608 <Method Byte Byte.valueOf(byte)>
	//   21   35:aastore         
	//   22   36:invokestatic    #612 <Method String String.format(Locale, String, Object[])>
	//   23   39:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//   24   42:pop             

	//   25   43:iload_1         
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:istore_1        
	//*  29   47:goto            11
		return stringbuilder.toString();
	//   30   50:aload_3         
	//   31   51:invokevirtual   #434 <Method String StringBuilder.toString()>
	//   32   54:areturn         
	}

	public static int getIntegerCodeForString(String s)
	{
		int k = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #405 <Method int String.length()>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		boolean flag;
		if(k <= 4)
	//*   5    7:iload_3         
	//*   6    8:iconst_4        
	//*   7    9:icmpgt          18
			flag = true;
	//    8   12:iconst_1        
	//    9   13:istore          4
		else
	//*  10   15:goto            21
			flag = false;
	//   11   18:iconst_0        
	//   12   19:istore          4
		Assertions.checkArgument(flag);
	//   13   21:iload           4
	//   14   23:invokestatic    #619 <Method void Assertions.checkArgument(boolean)>
		int j = 0;
	//   15   26:iconst_0        
	//   16   27:istore_2        
		for(; i < k; i++)
	//*  17   28:iload_1         
	//*  18   29:iload_3         
	//*  19   30:icmpge          51
			j = j << 8 | s.charAt(i);
	//   20   33:iload_2         
	//   21   34:bipush          8
	//   22   36:ishl            
	//   23   37:aload_0         
	//   24   38:iload_1         
	//   25   39:invokevirtual   #50  <Method char String.charAt(int)>
	//   26   42:ior             
	//   27   43:istore_2        

	//   28   44:iload_1         
	//   29   45:iconst_1        
	//   30   46:iadd            
	//   31   47:istore_1        
	//*  32   48:goto            28
		return j;
	//   33   51:iload_2         
	//   34   52:ireturn         
	}

	public static long getLong(int i, int j)
	{
		long l = i;
	//    0    0:iload_0         
	//    1    1:i2l             
	//    2    2:lstore_2        
		return (long)j & 0xffffffffL | l << 32;
	//    3    3:iload_1         
	//    4    4:i2l             
	//    5    5:ldc2w           #622 <Long 0xffffffffL>
	//    6    8:land            
	//    7    9:lload_2         
	//    8   10:bipush          32
	//    9   12:lshl            
	//   10   13:lor             
	//   11   14:lreturn         
	}

	public static int getPcmEncoding(int i)
	{
		if(i != 8)
	//*   0    0:iload_0         
	//*   1    1:bipush          8
	//*   2    3:icmpeq          36
		{
			if(i != 16)
	//*   3    6:iload_0         
	//*   4    7:bipush          16
	//*   5    9:icmpeq          34
			{
				if(i != 24)
	//*   6   12:iload_0         
	//*   7   13:bipush          24
	//*   8   15:icmpeq          30
					return i == 32 ? 0x40000000 : 0;
	//    9   18:iload_0         
	//   10   19:bipush          32
	//   11   21:icmpeq          26
	//   12   24:iconst_0        
	//   13   25:ireturn         
	//   14   26:ldc2            #626 <Int 0x40000000>
	//   15   29:ireturn         
				else
					return 0x80000000;
	//   16   30:ldc2            #627 <Int 0x80000000>
	//   17   33:ireturn         
			} else
			{
				return 2;
	//   18   34:iconst_2        
	//   19   35:ireturn         
			}
		} else
		{
			return 3;
	//   20   36:iconst_3        
	//   21   37:ireturn         
		}
	}

	public static Point getPhysicalDisplaySize(Context context)
	{
		if(SDK_INT >= 25) goto _L2; else goto _L1
	//    0    0:getstatic       #51  <Field int SDK_INT>
	//    1    3:bipush          25
	//    2    5:icmpge          261
_L1:
		if("Sony".equals(((Object) (MANUFACTURER))))
	//*   3    8:ldc2            #635 <String "Sony">
	//*   4   11:getstatic       #59  <Field String MANUFACTURER>
	//*   5   14:invokevirtual   #636 <Method boolean String.equals(Object)>
	//*   6   17:ifeq            65
		{
			String s = MODEL;
	//    7   20:getstatic       #62  <Field String MODEL>
	//    8   23:astore_3        
			if(s != null && s.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd"))
	//*   9   24:aload_3         
	//*  10   25:ifnull          65
	//*  11   28:aload_3         
	//*  12   29:ldc2            #638 <String "BRAVIA">
	//*  13   32:invokevirtual   #642 <Method boolean String.startsWith(String)>
	//*  14   35:ifeq            65
	//*  15   38:aload_0         
	//*  16   39:invokevirtual   #648 <Method PackageManager Context.getPackageManager()>
	//*  17   42:ldc2            #650 <String "com.sony.dtv.hardware.panel.qfhd">
	//*  18   45:invokevirtual   #655 <Method boolean PackageManager.hasSystemFeature(String)>
	//*  19   48:ifeq            65
				return new Point(3840, 2160);
	//   20   51:new             #576 <Class Point>
	//   21   54:dup             
	//   22   55:sipush          3840
	//   23   58:sipush          2160
	//   24   61:invokespecial   #658 <Method void Point(int, int)>
	//   25   64:areturn         
		}
		if(!"NVIDIA".equals(((Object) (MANUFACTURER)))) goto _L2; else goto _L3
	//   26   65:ldc2            #660 <String "NVIDIA">
	//   27   68:getstatic       #59  <Field String MANUFACTURER>
	//   28   71:invokevirtual   #636 <Method boolean String.equals(Object)>
	//   29   74:ifeq            261
_L3:
		String s1 = MODEL;
	//   30   77:getstatic       #62  <Field String MODEL>
	//   31   80:astore_3        
		if(s1 == null || !s1.contains("SHIELD")) goto _L2; else goto _L4
	//   32   81:aload_3         
	//   33   82:ifnull          261
	//   34   85:aload_3         
	//   35   86:ldc2            #662 <String "SHIELD">
	//   36   89:invokevirtual   #665 <Method boolean String.contains(CharSequence)>
	//   37   92:ifeq            261
_L4:
		s1 = null;
	//   38   95:aconst_null     
	//   39   96:astore_3        
		Object obj;
		obj = ((Object) (Class.forName("android.os.SystemProperties")));
	//   40   97:ldc2            #667 <String "android.os.SystemProperties">
	//   41  100:invokestatic    #671 <Method Class Class.forName(String)>
	//   42  103:astore          4
		obj = ((Object) ((String)((Class) (obj)).getMethod("get", new Class[] {
			java/lang/String
		}).invoke(obj, new Object[] {
			"sys.display-size"
		})));
	//   43  105:aload           4
	//   44  107:ldc2            #673 <String "get">
	//   45  110:iconst_1        
	//   46  111:anewarray       Class[]
	//   47  114:dup             
	//   48  115:iconst_0        
	//   49  116:ldc1            #46  <Class String>
	//   50  118:aastore         
	//   51  119:invokevirtual   #677 <Method Method Class.getMethod(String, Class[])>
	//   52  122:aload           4
	//   53  124:iconst_1        
	//   54  125:anewarray       Object[]
	//   55  128:dup             
	//   56  129:iconst_0        
	//   57  130:ldc2            #679 <String "sys.display-size">
	//   58  133:aastore         
	//   59  134:invokevirtual   #685 <Method Object Method.invoke(Object, Object[])>
	//   60  137:checkcast       #46  <Class String>
	//   61  140:astore          4
		s1 = ((String) (obj));
	//   62  142:aload           4
	//   63  144:astore_3        
		break MISSING_BLOCK_LABEL_161;
	//   64  145:goto            161
		Object obj1;
		obj1;
	//   65  148:astore          4
		Log.e("Util", "Failed to read sys.display-size", ((Throwable) (obj1)));
	//   66  150:ldc1            #25  <String "Util">
	//   67  152:ldc2            #687 <String "Failed to read sys.display-size">
	//   68  155:aload           4
	//   69  157:invokestatic    #693 <Method int Log.e(String, String, Throwable)>
	//   70  160:pop             
		if(TextUtils.isEmpty(((CharSequence) (s1)))) goto _L2; else goto _L5
	//   71  161:aload_3         
	//   72  162:invokestatic    #698 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   73  165:ifne            261
_L5:
		int i;
		int k;
		String as[] = s1.trim().split("x");
	//   74  168:aload_3         
	//   75  169:invokevirtual   #701 <Method String String.trim()>
	//   76  172:ldc2            #702 <String "x">
	//   77  175:invokevirtual   #706 <Method String[] String.split(String)>
	//   78  178:astore          4
		if(as.length != 2)
			break MISSING_BLOCK_LABEL_225;
	//   79  180:aload           4
	//   80  182:arraylength     
	//   81  183:iconst_2        
	//   82  184:icmpne          225
		i = Integer.parseInt(as[0]);
	//   83  187:aload           4
	//   84  189:iconst_0        
	//   85  190:aaload          
	//   86  191:invokestatic    #709 <Method int Integer.parseInt(String)>
	//   87  194:istore_1        
		k = Integer.parseInt(as[1]);
	//   88  195:aload           4
	//   89  197:iconst_1        
	//   90  198:aaload          
	//   91  199:invokestatic    #709 <Method int Integer.parseInt(String)>
	//   92  202:istore_2        
		if(i <= 0 || k <= 0)
			break MISSING_BLOCK_LABEL_225;
	//   93  203:iload_1         
	//   94  204:ifle            225
	//   95  207:iload_2         
	//   96  208:ifle            225
		as = ((String []) (new Point(i, k)));
	//   97  211:new             #576 <Class Point>
	//   98  214:dup             
	//   99  215:iload_1         
	//  100  216:iload_2         
	//  101  217:invokespecial   #658 <Method void Point(int, int)>
	//  102  220:astore          4
		return ((Point) (as));
	//  103  222:aload           4
	//  104  224:areturn         
_L7:
		StringBuilder stringbuilder = new StringBuilder();
	//  105  225:new             #411 <Class StringBuilder>
	//  106  228:dup             
	//  107  229:invokespecial   #534 <Method void StringBuilder()>
	//  108  232:astore          4
		stringbuilder.append("Invalid sys.display-size: ");
	//  109  234:aload           4
	//  110  236:ldc2            #711 <String "Invalid sys.display-size: ">
	//  111  239:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//  112  242:pop             
		stringbuilder.append(s1);
	//  113  243:aload           4
	//  114  245:aload_3         
	//  115  246:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//  116  249:pop             
		Log.e("Util", stringbuilder.toString());
	//  117  250:ldc1            #25  <String "Util">
	//  118  252:aload           4
	//  119  254:invokevirtual   #434 <Method String StringBuilder.toString()>
	//  120  257:invokestatic    #714 <Method int Log.e(String, String)>
	//  121  260:pop             
_L2:
		context = ((Context) (((WindowManager)context.getSystemService("window")).getDefaultDisplay()));
	//  122  261:aload_0         
	//  123  262:ldc2            #716 <String "window">
	//  124  265:invokevirtual   #720 <Method Object Context.getSystemService(String)>
	//  125  268:checkcast       #722 <Class WindowManager>
	//  126  271:invokeinterface #726 <Method Display WindowManager.getDefaultDisplay()>
	//  127  276:astore_0        
		Point point = new Point();
	//  128  277:new             #576 <Class Point>
	//  129  280:dup             
	//  130  281:invokespecial   #727 <Method void Point()>
	//  131  284:astore_3        
		int j = SDK_INT;
	//  132  285:getstatic       #51  <Field int SDK_INT>
	//  133  288:istore_1        
		if(j >= 23)
	//* 134  289:iload_1         
	//* 135  290:bipush          23
	//* 136  292:icmplt          302
		{
			getDisplaySizeV23(((Display) (context)), point);
	//  137  295:aload_0         
	//  138  296:aload_3         
	//  139  297:invokestatic    #729 <Method void getDisplaySizeV23(Display, Point)>
			return point;
	//  140  300:aload_3         
	//  141  301:areturn         
		}
		if(j >= 17)
	//* 142  302:iload_1         
	//* 143  303:bipush          17
	//* 144  305:icmplt          315
		{
			getDisplaySizeV17(((Display) (context)), point);
	//  145  308:aload_0         
	//  146  309:aload_3         
	//  147  310:invokestatic    #731 <Method void getDisplaySizeV17(Display, Point)>
			return point;
	//  148  313:aload_3         
	//  149  314:areturn         
		}
		if(j >= 16)
	//* 150  315:iload_1         
	//* 151  316:bipush          16
	//* 152  318:icmplt          328
		{
			getDisplaySizeV16(((Display) (context)), point);
	//  153  321:aload_0         
	//  154  322:aload_3         
	//  155  323:invokestatic    #733 <Method void getDisplaySizeV16(Display, Point)>
			return point;
	//  156  326:aload_3         
	//  157  327:areturn         
		} else
		{
			getDisplaySizeV9(((Display) (context)), point);
	//  158  328:aload_0         
	//  159  329:aload_3         
	//  160  330:invokestatic    #735 <Method void getDisplaySizeV9(Display, Point)>
			return point;
	//  161  333:aload_3         
	//  162  334:areturn         
		}
		stringbuilder;
	//  163  335:astore          4
		if(true) goto _L7; else goto _L6
	//  164  337:goto            225
_L6:
	}

	public static DataSpec getRemainderDataSpec(DataSpec dataspec, int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return dataspec;
	//    2    4:aload_0         
	//    3    5:areturn         
		long l1 = dataspec.length;
	//    4    6:aload_0         
	//    5    7:getfield        #741 <Field long DataSpec.length>
	//    6   10:lstore          4
		long l = -1L;
	//    7   12:ldc2w           #742 <Long -1L>
	//    8   15:lstore_2        
		if(l1 != -1L)
	//*   9   16:lload           4
	//*  10   18:ldc2w           #742 <Long -1L>
	//*  11   21:lcmp            
	//*  12   22:ifne            28
	//*  13   25:goto            36
			l = dataspec.length - (long)i;
	//   14   28:aload_0         
	//   15   29:getfield        #741 <Field long DataSpec.length>
	//   16   32:iload_1         
	//   17   33:i2l             
	//   18   34:lsub            
	//   19   35:lstore_2        
		return new DataSpec(dataspec.uri, dataspec.position + (long)i, l, dataspec.key, dataspec.flags);
	//   20   36:new             #739 <Class DataSpec>
	//   21   39:dup             
	//   22   40:aload_0         
	//   23   41:getfield        #747 <Field Uri DataSpec.uri>
	//   24   44:aload_0         
	//   25   45:getfield        #750 <Field long DataSpec.position>
	//   26   48:iload_1         
	//   27   49:i2l             
	//   28   50:ladd            
	//   29   51:lload_2         
	//   30   52:aload_0         
	//   31   53:getfield        #753 <Field String DataSpec.key>
	//   32   56:aload_0         
	//   33   57:getfield        #756 <Field int DataSpec.flags>
	//   34   60:invokespecial   #759 <Method void DataSpec(Uri, long, long, String, int)>
	//   35   63:areturn         
	}

	public static int getTopInt(long l)
	{
		return (int)(l >>> 32);
	//    0    0:lload_0         
	//    1    1:bipush          32
	//    2    3:lushr           
	//    3    4:l2i             
	//    4    5:ireturn         
	}

	public static String getUserAgent(Context context, String s)
	{
		try
		{
			String s1 = context.getPackageName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #767 <Method String Context.getPackageName()>
	//    2    4:astore_2        
			context = ((Context) (context.getPackageManager().getPackageInfo(s1, 0).versionName));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #648 <Method PackageManager Context.getPackageManager()>
	//    5    9:aload_2         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #771 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    8   14:getfield        #776 <Field String PackageInfo.versionName>
	//    9   17:astore_0        
		}
	//*  10   18:goto            25
	//*  11   21:ldc2            #778 <String "?">
	//*  12   24:astore_0        
	//*  13   25:new             #411 <Class StringBuilder>
	//*  14   28:dup             
	//*  15   29:invokespecial   #534 <Method void StringBuilder()>
	//*  16   32:astore_2        
	//*  17   33:aload_2         
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//*  20   38:pop             
	//*  21   39:aload_2         
	//*  22   40:ldc2            #780 <String "/">
	//*  23   43:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//*  24   46:pop             
	//*  25   47:aload_2         
	//*  26   48:aload_0         
	//*  27   49:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//*  28   52:pop             
	//*  29   53:aload_2         
	//*  30   54:ldc2            #782 <String " (Linux;Android ">
	//*  31   57:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//*  32   60:pop             
	//*  33   61:aload_2         
	//*  34   62:getstatic       #785 <Field String android.os.Build$VERSION.RELEASE>
	//*  35   65:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//*  36   68:pop             
	//*  37   69:aload_2         
	//*  38   70:ldc2            #787 <String ") ExoPlayerLib/">
	//*  39   73:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//*  40   76:pop             
	//*  41   77:aload_2         
	//*  42   78:ldc2            #789 <String "1.5.15">
	//*  43   81:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//*  44   84:pop             
	//*  45   85:aload_2         
	//*  46   86:invokevirtual   #434 <Method String StringBuilder.toString()>
	//*  47   89:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			context = "?";
		}
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append(s);
		stringbuilder.append("/");
		stringbuilder.append(((String) (context)));
		stringbuilder.append(" (Linux;Android ");
		stringbuilder.append(android.os.Build.VERSION.RELEASE);
		stringbuilder.append(") ExoPlayerLib/");
		stringbuilder.append("1.5.15");
		return stringbuilder.toString();
	//*  48   90:astore_0        
	//*  49   91:goto            21
	}

	public static int inferContentType(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 3;
	//    2    4:iconst_3        
	//    3    5:ireturn         
		if(s.endsWith(".mpd"))
	//*   4    6:aload_0         
	//*   5    7:ldc2            #792 <String ".mpd">
	//*   6   10:invokevirtual   #795 <Method boolean String.endsWith(String)>
	//*   7   13:ifeq            18
			return 0;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		if(s.endsWith(".ism"))
	//*  10   18:aload_0         
	//*  11   19:ldc2            #797 <String ".ism">
	//*  12   22:invokevirtual   #795 <Method boolean String.endsWith(String)>
	//*  13   25:ifeq            30
			return 1;
	//   14   28:iconst_1        
	//   15   29:ireturn         
		return !s.endsWith(".m3u8") ? 3 : 2;
	//   16   30:aload_0         
	//   17   31:ldc2            #799 <String ".m3u8">
	//   18   34:invokevirtual   #795 <Method boolean String.endsWith(String)>
	//   19   37:ifeq            42
	//   20   40:iconst_2        
	//   21   41:ireturn         
	//   22   42:iconst_3        
	//   23   43:ireturn         
	}

	public static boolean isAndroidTv(Context context)
	{
		return context.getPackageManager().hasSystemFeature("android.software.leanback");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #648 <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc2            #805 <String "android.software.leanback">
	//    3    7:invokevirtual   #655 <Method boolean PackageManager.hasSystemFeature(String)>
	//    4   10:ireturn         
	}

	public static boolean isLocalFileUri(Uri uri)
	{
		uri = ((Uri) (uri.getScheme()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #812 <Method String Uri.getScheme()>
	//    2    4:astore_0        
		return TextUtils.isEmpty(((CharSequence) (uri))) || ((String) (uri)).equals("file");
	//    3    5:aload_0         
	//    4    6:invokestatic    #698 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    5    9:ifne            27
	//    6   12:aload_0         
	//    7   13:ldc2            #814 <String "file">
	//    8   16:invokevirtual   #636 <Method boolean String.equals(Object)>
	//    9   19:ifeq            25
	//   10   22:goto            27
	//   11   25:iconst_0        
	//   12   26:ireturn         
	//   13   27:iconst_1        
	//   14   28:ireturn         
	}

	public static void maybeTerminateInputStream(HttpURLConnection httpurlconnection, long l)
	{
		int i = SDK_INT;
	//    0    0:getstatic       #51  <Field int SDK_INT>
	//    1    3:istore_3        
		if(i != 19 && i != 20)
	//*   2    4:iload_3         
	//*   3    5:bipush          19
	//*   4    7:icmpeq          17
	//*   5   10:iload_3         
	//*   6   11:bipush          20
	//*   7   13:icmpeq          17
			return;
	//    8   16:return          
		try
		{
			httpurlconnection = ((HttpURLConnection) (httpurlconnection.getInputStream()));
	//    9   17:aload_0         
	//   10   18:invokevirtual   #508 <Method InputStream HttpURLConnection.getInputStream()>
	//   11   21:astore_0        
		}
	//*  12   22:lload_1         
	//*  13   23:ldc2w           #742 <Long -1L>
	//*  14   26:lcmp            
	//*  15   27:ifne            109
	//*  16   30:aload_0         
	//*  17   31:invokevirtual   #821 <Method int InputStream.read()>
	//*  18   34:iconst_m1       
	//*  19   35:icmpne          39
	//*  20   38:return          
	//*  21   39:aload_0         
	//*  22   40:invokevirtual   #538 <Method Class Object.getClass()>
	//*  23   43:invokevirtual   #824 <Method String Class.getName()>
	//*  24   46:astore          4
	//*  25   48:aload           4
	//*  26   50:ldc2            #826 <String "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream">
	//*  27   53:invokevirtual   #636 <Method boolean String.equals(Object)>
	//*  28   56:ifne            70
	//*  29   59:aload           4
	//*  30   61:ldc2            #828 <String "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream">
	//*  31   64:invokevirtual   #636 <Method boolean String.equals(Object)>
	//*  32   67:ifeq            106
	//*  33   70:aload_0         
	//*  34   71:invokevirtual   #538 <Method Class Object.getClass()>
	//*  35   74:invokevirtual   #831 <Method Class Class.getSuperclass()>
	//*  36   77:ldc2            #833 <String "unexpectedEndOfInput">
	//*  37   80:iconst_0        
	//*  38   81:anewarray       Class[]
	//*  39   84:invokevirtual   #836 <Method Method Class.getDeclaredMethod(String, Class[])>
	//*  40   87:astore          4
	//*  41   89:aload           4
	//*  42   91:iconst_1        
	//*  43   92:invokevirtual   #839 <Method void Method.setAccessible(boolean)>
	//*  44   95:aload           4
	//*  45   97:aload_0         
	//*  46   98:iconst_0        
	//*  47   99:anewarray       Object[]
	//*  48  102:invokevirtual   #685 <Method Object Method.invoke(Object, Object[])>
	//*  49  105:pop             
	//*  50  106:return          
		// Misplaced declaration of an exception variable
		catch(HttpURLConnection httpurlconnection)
	//*  51  107:astore_0        
		{
			return;
	//   52  108:return          
		}
		if(l != -1L) goto _L2; else goto _L1
_L1:
		if(((InputStream) (httpurlconnection)).read() == -1)
			return;
_L4:
		String s = ((Object) (httpurlconnection)).getClass().getName();
		if(s.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || s.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"))
		{
			Method method = ((Object) (httpurlconnection)).getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
			method.setAccessible(true);
			method.invoke(((Object) (httpurlconnection)), new Object[0]);
		}
		return;
_L2:
		if(l <= 2048L)
	//*  53  109:lload_1         
	//*  54  110:ldc2w           #18  <Long 2048L>
	//*  55  113:lcmp            
	//*  56  114:ifgt            39
			return;
	//   57  117:return          
		if(true) goto _L4; else goto _L3
_L3:
	}

	public static ExecutorService newSingleThreadExecutor(String s)
	{
		return Executors.newSingleThreadExecutor(new ThreadFactory(s) {

			public Thread newThread(Runnable runnable)
			{
				return new Thread(runnable, threadName);
			//    0    0:new             #25  <Class Thread>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_0         
			//    4    6:getfield        #17  <Field String val$threadName>
			//    5    9:invokespecial   #28  <Method void Thread(Runnable, String)>
			//    6   12:areturn         
			}

			final String val$threadName;

			
			{
				threadName = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field String val$threadName>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:new             #6   <Class Util$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #842 <Method void Util$1(String)>
	//    4    8:invokestatic    #847 <Method ExecutorService Executors.newSingleThreadExecutor(ThreadFactory)>
	//    5   11:areturn         
	}

	public static ScheduledExecutorService newSingleThreadScheduledExecutor(String s)
	{
		return Executors.newSingleThreadScheduledExecutor(new ThreadFactory(s) {

			public Thread newThread(Runnable runnable)
			{
				return new Thread(runnable, threadName);
			//    0    0:new             #25  <Class Thread>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_0         
			//    4    6:getfield        #17  <Field String val$threadName>
			//    5    9:invokespecial   #28  <Method void Thread(Runnable, String)>
			//    6   12:areturn         
			}

			final String val$threadName;

			
			{
				threadName = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field String val$threadName>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:new             #8   <Class Util$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #850 <Method void Util$2(String)>
	//    4    8:invokestatic    #853 <Method ScheduledExecutorService Executors.newSingleThreadScheduledExecutor(ThreadFactory)>
	//    5   11:areturn         
	}

	public static long parseXsDateTime(String s)
		throws ParseException
	{
		Matcher matcher = XS_DATE_TIME_PATTERN.matcher(((CharSequence) (s)));
	//    0    0:getstatic       #72  <Field Pattern XS_DATE_TIME_PATTERN>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #861 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore          8
		boolean flag = matcher.matches();
	//    4    9:aload           8
	//    5   11:invokevirtual   #866 <Method boolean Matcher.matches()>
	//    6   14:istore_3        
		int i = 0;
	//    7   15:iconst_0        
	//    8   16:istore_1        
		if(flag)
	//*   9   17:iload_3         
	//*  10   18:ifeq            276
		{
			if(matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z"))
	//*  11   21:aload           8
	//*  12   23:bipush          9
	//*  13   25:invokevirtual   #869 <Method String Matcher.group(int)>
	//*  14   28:ifnonnull       34
	//*  15   31:goto            100
	//*  16   34:aload           8
	//*  17   36:bipush          9
	//*  18   38:invokevirtual   #869 <Method String Matcher.group(int)>
	//*  19   41:ldc2            #871 <String "Z">
	//*  20   44:invokevirtual   #874 <Method boolean String.equalsIgnoreCase(String)>
	//*  21   47:ifeq            53
	//*  22   50:goto            100
			{
				int j = Integer.parseInt(matcher.group(12)) * 60 + Integer.parseInt(matcher.group(13));
	//   23   53:aload           8
	//   24   55:bipush          12
	//   25   57:invokevirtual   #869 <Method String Matcher.group(int)>
	//   26   60:invokestatic    #709 <Method int Integer.parseInt(String)>
	//   27   63:bipush          60
	//   28   65:imul            
	//   29   66:aload           8
	//   30   68:bipush          13
	//   31   70:invokevirtual   #869 <Method String Matcher.group(int)>
	//   32   73:invokestatic    #709 <Method int Integer.parseInt(String)>
	//   33   76:iadd            
	//   34   77:istore_2        
				i = j;
	//   35   78:iload_2         
	//   36   79:istore_1        
				if(matcher.group(11).equals("-"))
	//*  37   80:aload           8
	//*  38   82:bipush          11
	//*  39   84:invokevirtual   #869 <Method String Matcher.group(int)>
	//*  40   87:ldc2            #876 <String "-">
	//*  41   90:invokevirtual   #636 <Method boolean String.equals(Object)>
	//*  42   93:ifeq            100
					i = j * -1;
	//   43   96:iload_2         
	//   44   97:iconst_m1       
	//   45   98:imul            
	//   46   99:istore_1        
			}
			s = ((String) (new GregorianCalendar(TimeZone.getTimeZone("GMT"))));
	//   47  100:new             #878 <Class GregorianCalendar>
	//   48  103:dup             
	//   49  104:ldc2            #880 <String "GMT">
	//   50  107:invokestatic    #886 <Method TimeZone TimeZone.getTimeZone(String)>
	//   51  110:invokespecial   #889 <Method void GregorianCalendar(TimeZone)>
	//   52  113:astore_0        
			((Calendar) (s)).clear();
	//   53  114:aload_0         
	//   54  115:invokevirtual   #894 <Method void Calendar.clear()>
			((Calendar) (s)).set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
	//   55  118:aload_0         
	//   56  119:aload           8
	//   57  121:iconst_1        
	//   58  122:invokevirtual   #869 <Method String Matcher.group(int)>
	//   59  125:invokestatic    #709 <Method int Integer.parseInt(String)>
	//   60  128:aload           8
	//   61  130:iconst_2        
	//   62  131:invokevirtual   #869 <Method String Matcher.group(int)>
	//   63  134:invokestatic    #709 <Method int Integer.parseInt(String)>
	//   64  137:iconst_1        
	//   65  138:isub            
	//   66  139:aload           8
	//   67  141:iconst_3        
	//   68  142:invokevirtual   #869 <Method String Matcher.group(int)>
	//   69  145:invokestatic    #709 <Method int Integer.parseInt(String)>
	//   70  148:aload           8
	//   71  150:iconst_4        
	//   72  151:invokevirtual   #869 <Method String Matcher.group(int)>
	//   73  154:invokestatic    #709 <Method int Integer.parseInt(String)>
	//   74  157:aload           8
	//   75  159:iconst_5        
	//   76  160:invokevirtual   #869 <Method String Matcher.group(int)>
	//   77  163:invokestatic    #709 <Method int Integer.parseInt(String)>
	//   78  166:aload           8
	//   79  168:bipush          6
	//   80  170:invokevirtual   #869 <Method String Matcher.group(int)>
	//   81  173:invokestatic    #709 <Method int Integer.parseInt(String)>
	//   82  176:invokevirtual   #898 <Method void Calendar.set(int, int, int, int, int, int)>
			if(!TextUtils.isEmpty(((CharSequence) (matcher.group(8)))))
	//*  83  179:aload           8
	//*  84  181:bipush          8
	//*  85  183:invokevirtual   #869 <Method String Matcher.group(int)>
	//*  86  186:invokestatic    #698 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  87  189:ifne            248
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   88  192:new             #411 <Class StringBuilder>
	//   89  195:dup             
	//   90  196:invokespecial   #534 <Method void StringBuilder()>
	//   91  199:astore          9
				stringbuilder1.append("0.");
	//   92  201:aload           9
	//   93  203:ldc2            #900 <String "0.">
	//   94  206:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//   95  209:pop             
				stringbuilder1.append(matcher.group(8));
	//   96  210:aload           9
	//   97  212:aload           8
	//   98  214:bipush          8
	//   99  216:invokevirtual   #869 <Method String Matcher.group(int)>
	//  100  219:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//  101  222:pop             
				((Calendar) (s)).set(14, (new BigDecimal(stringbuilder1.toString())).movePointRight(3).intValue());
	//  102  223:aload_0         
	//  103  224:bipush          14
	//  104  226:new             #902 <Class BigDecimal>
	//  105  229:dup             
	//  106  230:aload           9
	//  107  232:invokevirtual   #434 <Method String StringBuilder.toString()>
	//  108  235:invokespecial   #903 <Method void BigDecimal(String)>
	//  109  238:iconst_3        
	//  110  239:invokevirtual   #907 <Method BigDecimal BigDecimal.movePointRight(int)>
	//  111  242:invokevirtual   #910 <Method int BigDecimal.intValue()>
	//  112  245:invokevirtual   #912 <Method void Calendar.set(int, int)>
			}
			long l1 = ((Calendar) (s)).getTimeInMillis();
	//  113  248:aload_0         
	//  114  249:invokevirtual   #916 <Method long Calendar.getTimeInMillis()>
	//  115  252:lstore          6
			long l = l1;
	//  116  254:lload           6
	//  117  256:lstore          4
			if(i != 0)
	//* 118  258:iload_1         
	//* 119  259:ifeq            273
				l = l1 - (long)(i * 60000);
	//  120  262:lload           6
	//  121  264:iload_1         
	//  122  265:ldc2            #917 <Int 60000>
	//  123  268:imul            
	//  124  269:i2l             
	//  125  270:lsub            
	//  126  271:lstore          4
			return l;
	//  127  273:lload           4
	//  128  275:lreturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  129  276:new             #411 <Class StringBuilder>
	//  130  279:dup             
	//  131  280:invokespecial   #534 <Method void StringBuilder()>
	//  132  283:astore          8
			stringbuilder.append("Invalid date/time format: ");
	//  133  285:aload           8
	//  134  287:ldc2            #919 <String "Invalid date/time format: ">
	//  135  290:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//  136  293:pop             
			stringbuilder.append(s);
	//  137  294:aload           8
	//  138  296:aload_0         
	//  139  297:invokevirtual   #427 <Method StringBuilder StringBuilder.append(String)>
	//  140  300:pop             
			throw new ParseException(stringbuilder.toString(), 0);
	//  141  301:new             #857 <Class ParseException>
	//  142  304:dup             
	//  143  305:aload           8
	//  144  307:invokevirtual   #434 <Method String StringBuilder.toString()>
	//  145  310:iconst_0        
	//  146  311:invokespecial   #922 <Method void ParseException(String, int)>
	//  147  314:athrow          
		}
	}

	public static long parseXsDuration(String s)
	{
		Matcher matcher = XS_DURATION_PATTERN.matcher(((CharSequence) (s)));
	//    0    0:getstatic       #76  <Field Pattern XS_DURATION_PATTERN>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #861 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore          18
		if(matcher.matches())
	//*   4    9:aload           18
	//*   5   11:invokevirtual   #866 <Method boolean Matcher.matches()>
	//*   6   14:ifeq            224
		{
			boolean flag = TextUtils.isEmpty(((CharSequence) (matcher.group(1))));
	//    7   17:aload           18
	//    8   19:iconst_1        
	//    9   20:invokevirtual   #869 <Method String Matcher.group(int)>
	//   10   23:invokestatic    #698 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   11   26:istore          13
			s = matcher.group(3);
	//   12   28:aload           18
	//   13   30:iconst_3        
	//   14   31:invokevirtual   #869 <Method String Matcher.group(int)>
	//   15   34:astore_0        
			double d5 = 0.0D;
	//   16   35:dconst_0        
	//   17   36:dstore          11
			double d;
			if(s != null)
	//*  18   38:aload_0         
	//*  19   39:ifnull          54
				d = Double.parseDouble(s) * 31556908D;
	//   20   42:aload_0         
	//   21   43:invokestatic    #929 <Method double Double.parseDouble(String)>
	//   22   46:ldc2w           #930 <Double 31556908D>
	//   23   49:dmul            
	//   24   50:dstore_1        
			else
	//*  25   51:goto            56
				d = 0.0D;
	//   26   54:dconst_0        
	//   27   55:dstore_1        
			s = matcher.group(5);
	//   28   56:aload           18
	//   29   58:iconst_5        
	//   30   59:invokevirtual   #869 <Method String Matcher.group(int)>
	//   31   62:astore_0        
			double d1;
			if(s != null)
	//*  32   63:aload_0         
	//*  33   64:ifnull          79
				d1 = Double.parseDouble(s) * 2629739D;
	//   34   67:aload_0         
	//   35   68:invokestatic    #929 <Method double Double.parseDouble(String)>
	//   36   71:ldc2w           #932 <Double 2629739D>
	//   37   74:dmul            
	//   38   75:dstore_3        
			else
	//*  39   76:goto            81
				d1 = 0.0D;
	//   40   79:dconst_0        
	//   41   80:dstore_3        
			s = matcher.group(7);
	//   42   81:aload           18
	//   43   83:bipush          7
	//   44   85:invokevirtual   #869 <Method String Matcher.group(int)>
	//   45   88:astore_0        
			double d2;
			if(s != null)
	//*  46   89:aload_0         
	//*  47   90:ifnull          106
				d2 = Double.parseDouble(s) * 86400D;
	//   48   93:aload_0         
	//   49   94:invokestatic    #929 <Method double Double.parseDouble(String)>
	//   50   97:ldc2w           #934 <Double 86400D>
	//   51  100:dmul            
	//   52  101:dstore          5
			else
	//*  53  103:goto            109
				d2 = 0.0D;
	//   54  106:dconst_0        
	//   55  107:dstore          5
			s = matcher.group(10);
	//   56  109:aload           18
	//   57  111:bipush          10
	//   58  113:invokevirtual   #869 <Method String Matcher.group(int)>
	//   59  116:astore_0        
			double d3;
			if(s != null)
	//*  60  117:aload_0         
	//*  61  118:ifnull          134
				d3 = 3600D * Double.parseDouble(s);
	//   62  121:ldc2w           #936 <Double 3600D>
	//   63  124:aload_0         
	//   64  125:invokestatic    #929 <Method double Double.parseDouble(String)>
	//   65  128:dmul            
	//   66  129:dstore          7
			else
	//*  67  131:goto            137
				d3 = 0.0D;
	//   68  134:dconst_0        
	//   69  135:dstore          7
			s = matcher.group(12);
	//   70  137:aload           18
	//   71  139:bipush          12
	//   72  141:invokevirtual   #869 <Method String Matcher.group(int)>
	//   73  144:astore_0        
			double d4;
			if(s != null)
	//*  74  145:aload_0         
	//*  75  146:ifnull          162
				d4 = Double.parseDouble(s) * 60D;
	//   76  149:aload_0         
	//   77  150:invokestatic    #929 <Method double Double.parseDouble(String)>
	//   78  153:ldc2w           #938 <Double 60D>
	//   79  156:dmul            
	//   80  157:dstore          9
			else
	//*  81  159:goto            165
				d4 = 0.0D;
	//   82  162:dconst_0        
	//   83  163:dstore          9
			s = matcher.group(14);
	//   84  165:aload           18
	//   85  167:bipush          14
	//   86  169:invokevirtual   #869 <Method String Matcher.group(int)>
	//   87  172:astore_0        
			if(s != null)
	//*  88  173:aload_0         
	//*  89  174:ifnull          183
				d5 = Double.parseDouble(s);
	//   90  177:aload_0         
	//   91  178:invokestatic    #929 <Method double Double.parseDouble(String)>
	//   92  181:dstore          11
			long l1 = (long)((d + d1 + d2 + d3 + d4 + d5) * 1000D);
	//   93  183:dload_1         
	//   94  184:dload_3         
	//   95  185:dadd            
	//   96  186:dload           5
	//   97  188:dadd            
	//   98  189:dload           7
	//   99  191:dadd            
	//  100  192:dload           9
	//  101  194:dadd            
	//  102  195:dload           11
	//  103  197:dadd            
	//  104  198:ldc2w           #940 <Double 1000D>
	//  105  201:dmul            
	//  106  202:d2l             
	//  107  203:lstore          16
			long l = l1;
	//  108  205:lload           16
	//  109  207:lstore          14
			if(true ^ flag)
	//* 110  209:iconst_1        
	//* 111  210:iload           13
	//* 112  212:ixor            
	//* 113  213:ifeq            221
				l = -l1;
	//  114  216:lload           16
	//  115  218:lneg            
	//  116  219:lstore          14
			return l;
	//  117  221:lload           14
	//  118  223:lreturn         
		} else
		{
			return (long)(Double.parseDouble(s) * 3600D * 1000D);
	//  119  224:aload_0         
	//  120  225:invokestatic    #929 <Method double Double.parseDouble(String)>
	//  121  228:ldc2w           #936 <Double 3600D>
	//  122  231:dmul            
	//  123  232:ldc2w           #940 <Double 1000D>
	//  124  235:dmul            
	//  125  236:d2l             
	//  126  237:lreturn         
		}
	}

	public static long scaleLargeTimestamp(long l, long l1, long l2)
	{
		int i = l2 != l1;
	//    0    0:lload           4
	//    1    2:lload_2         
	//    2    3:lcmp            
	//    3    4:istore          8
		if(i >= 0 && l2 % l1 == 0L)
	//*   4    6:iload           8
	//*   5    8:iflt            27
	//*   6   11:lload           4
	//*   7   13:lload_2         
	//*   8   14:lrem            
	//*   9   15:lconst_0        
	//*  10   16:lcmp            
	//*  11   17:ifne            27
			return l / (l2 / l1);
	//   12   20:lload_0         
	//   13   21:lload           4
	//   14   23:lload_2         
	//   15   24:ldiv            
	//   16   25:ldiv            
	//   17   26:lreturn         
		if(i < 0 && l1 % l2 == 0L)
	//*  18   27:iload           8
	//*  19   29:ifge            48
	//*  20   32:lload_2         
	//*  21   33:lload           4
	//*  22   35:lrem            
	//*  23   36:lconst_0        
	//*  24   37:lcmp            
	//*  25   38:ifne            48
		{
			return l * (l1 / l2);
	//   26   41:lload_0         
	//   27   42:lload_2         
	//   28   43:lload           4
	//   29   45:ldiv            
	//   30   46:lmul            
	//   31   47:lreturn         
		} else
		{
			double d = (double)l1 / (double)l2;
	//   32   48:lload_2         
	//   33   49:l2d             
	//   34   50:lload           4
	//   35   52:l2d             
	//   36   53:ddiv            
	//   37   54:dstore          6
			return (long)((double)l * d);
	//   38   56:lload_0         
	//   39   57:l2d             
	//   40   58:dload           6
	//   41   60:dmul            
	//   42   61:d2l             
	//   43   62:lreturn         
		}
	}

	public static long[] scaleLargeTimestamps(List list, long l, long l1)
	{
		long al[] = new long[list.size()];
	//    0    0:aload_0         
	//    1    1:invokeinterface #361 <Method int List.size()>
	//    2    6:newarray        long[]
	//    3    8:astore          11
		int i1 = l1 != l;
	//    4   10:lload_3         
	//    5   11:lload_1         
	//    6   12:lcmp            
	//    7   13:istore          10
		boolean flag = false;
	//    8   15:iconst_0        
	//    9   16:istore          8
		boolean flag1 = false;
	//   10   18:iconst_0        
	//   11   19:istore          9
		int i = 0;
	//   12   21:iconst_0        
	//   13   22:istore          7
		if(i1 >= 0 && l1 % l == 0L)
	//*  14   24:iload           10
	//*  15   26:iflt            79
	//*  16   29:lload_3         
	//*  17   30:lload_1         
	//*  18   31:lrem            
	//*  19   32:lconst_0        
	//*  20   33:lcmp            
	//*  21   34:ifne            79
		{
			l = l1 / l;
	//   22   37:lload_3         
	//   23   38:lload_1         
	//   24   39:ldiv            
	//   25   40:lstore_1        
			for(; i < al.length; i++)
	//*  26   41:iload           7
	//*  27   43:aload           11
	//*  28   45:arraylength     
	//*  29   46:icmpge          190
				al[i] = ((Long)list.get(i)).longValue() / l;
	//   30   49:aload           11
	//   31   51:iload           7
	//   32   53:aload_0         
	//   33   54:iload           7
	//   34   56:invokeinterface #948 <Method Object List.get(int)>
	//   35   61:checkcast       #950 <Class Long>
	//   36   64:invokevirtual   #953 <Method long Long.longValue()>
	//   37   67:lload_1         
	//   38   68:ldiv            
	//   39   69:lastore         

	//   40   70:iload           7
	//   41   72:iconst_1        
	//   42   73:iadd            
	//   43   74:istore          7
		} else
	//*  44   76:goto            41
		if(i1 < 0 && l % l1 == 0L)
	//*  45   79:iload           10
	//*  46   81:ifge            138
	//*  47   84:lload_1         
	//*  48   85:lload_3         
	//*  49   86:lrem            
	//*  50   87:lconst_0        
	//*  51   88:lcmp            
	//*  52   89:ifne            138
		{
			l /= l1;
	//   53   92:lload_1         
	//   54   93:lload_3         
	//   55   94:ldiv            
	//   56   95:lstore_1        
			for(int j = ((int) (flag)); j < al.length; j++)
	//*  57   96:iload           8
	//*  58   98:istore          7
	//*  59  100:iload           7
	//*  60  102:aload           11
	//*  61  104:arraylength     
	//*  62  105:icmpge          190
				al[j] = ((Long)list.get(j)).longValue() * l;
	//   63  108:aload           11
	//   64  110:iload           7
	//   65  112:aload_0         
	//   66  113:iload           7
	//   67  115:invokeinterface #948 <Method Object List.get(int)>
	//   68  120:checkcast       #950 <Class Long>
	//   69  123:invokevirtual   #953 <Method long Long.longValue()>
	//   70  126:lload_1         
	//   71  127:lmul            
	//   72  128:lastore         

	//   73  129:iload           7
	//   74  131:iconst_1        
	//   75  132:iadd            
	//   76  133:istore          7
		} else
	//*  77  135:goto            100
		{
			double d = (double)l / (double)l1;
	//   78  138:lload_1         
	//   79  139:l2d             
	//   80  140:lload_3         
	//   81  141:l2d             
	//   82  142:ddiv            
	//   83  143:dstore          5
			for(int k = ((int) (flag1)); k < al.length; k++)
	//*  84  145:iload           9
	//*  85  147:istore          7
	//*  86  149:iload           7
	//*  87  151:aload           11
	//*  88  153:arraylength     
	//*  89  154:icmpge          190
				al[k] = (long)((double)((Long)list.get(k)).longValue() * d);
	//   90  157:aload           11
	//   91  159:iload           7
	//   92  161:aload_0         
	//   93  162:iload           7
	//   94  164:invokeinterface #948 <Method Object List.get(int)>
	//   95  169:checkcast       #950 <Class Long>
	//   96  172:invokevirtual   #953 <Method long Long.longValue()>
	//   97  175:l2d             
	//   98  176:dload           5
	//   99  178:dmul            
	//  100  179:d2l             
	//  101  180:lastore         

	//  102  181:iload           7
	//  103  183:iconst_1        
	//  104  184:iadd            
	//  105  185:istore          7
		}
	//* 106  187:goto            149
		return al;
	//  107  190:aload           11
	//  108  192:areturn         
	}

	public static void scaleLargeTimestampsInPlace(long al[], long l, long l1)
	{
		int i1 = l1 != l;
	//    0    0:lload_3         
	//    1    1:lload_1         
	//    2    2:lcmp            
	//    3    3:istore          10
		boolean flag = false;
	//    4    5:iconst_0        
	//    5    6:istore          8
		boolean flag1 = false;
	//    6    8:iconst_0        
	//    7    9:istore          9
		int i = 0;
	//    8   11:iconst_0        
	//    9   12:istore          7
		if(i1 >= 0 && l1 % l == 0L)
	//*  10   14:iload           10
	//*  11   16:iflt            57
	//*  12   19:lload_3         
	//*  13   20:lload_1         
	//*  14   21:lrem            
	//*  15   22:lconst_0        
	//*  16   23:lcmp            
	//*  17   24:ifne            57
		{
			l = l1 / l;
	//   18   27:lload_3         
	//   19   28:lload_1         
	//   20   29:ldiv            
	//   21   30:lstore_1        
			for(; i < al.length; i++)
	//*  22   31:iload           7
	//*  23   33:aload_0         
	//*  24   34:arraylength     
	//*  25   35:icmpge          144
				al[i] = al[i] / l;
	//   26   38:aload_0         
	//   27   39:iload           7
	//   28   41:aload_0         
	//   29   42:iload           7
	//   30   44:laload          
	//   31   45:lload_1         
	//   32   46:ldiv            
	//   33   47:lastore         

	//   34   48:iload           7
	//   35   50:iconst_1        
	//   36   51:iadd            
	//   37   52:istore          7
		} else
	//*  38   54:goto            31
		if(i1 < 0 && l % l1 == 0L)
	//*  39   57:iload           10
	//*  40   59:ifge            104
	//*  41   62:lload_1         
	//*  42   63:lload_3         
	//*  43   64:lrem            
	//*  44   65:lconst_0        
	//*  45   66:lcmp            
	//*  46   67:ifne            104
		{
			l /= l1;
	//   47   70:lload_1         
	//   48   71:lload_3         
	//   49   72:ldiv            
	//   50   73:lstore_1        
			for(int j = ((int) (flag)); j < al.length; j++)
	//*  51   74:iload           8
	//*  52   76:istore          7
	//*  53   78:iload           7
	//*  54   80:aload_0         
	//*  55   81:arraylength     
	//*  56   82:icmpge          144
				al[j] = al[j] * l;
	//   57   85:aload_0         
	//   58   86:iload           7
	//   59   88:aload_0         
	//   60   89:iload           7
	//   61   91:laload          
	//   62   92:lload_1         
	//   63   93:lmul            
	//   64   94:lastore         

	//   65   95:iload           7
	//   66   97:iconst_1        
	//   67   98:iadd            
	//   68   99:istore          7
		} else
	//*  69  101:goto            78
		{
			double d = (double)l / (double)l1;
	//   70  104:lload_1         
	//   71  105:l2d             
	//   72  106:lload_3         
	//   73  107:l2d             
	//   74  108:ddiv            
	//   75  109:dstore          5
			for(int k = ((int) (flag1)); k < al.length; k++)
	//*  76  111:iload           9
	//*  77  113:istore          7
	//*  78  115:iload           7
	//*  79  117:aload_0         
	//*  80  118:arraylength     
	//*  81  119:icmpge          144
				al[k] = (long)((double)al[k] * d);
	//   82  122:aload_0         
	//   83  123:iload           7
	//   84  125:aload_0         
	//   85  126:iload           7
	//   86  128:laload          
	//   87  129:l2d             
	//   88  130:dload           5
	//   89  132:dmul            
	//   90  133:d2l             
	//   91  134:lastore         

	//   92  135:iload           7
	//   93  137:iconst_1        
	//   94  138:iadd            
	//   95  139:istore          7
		}
	//*  96  141:goto            115
	//   97  144:return          
	}

	private static boolean shouldEscapeCharacter(char c)
	{
		if(c != '"' && c != '%' && c != '*' && c != '/' && c != ':' && c != '<' && c != '\\' && c != '|')
	//*   0    0:iload_0         
	//*   1    1:bipush          34
	//*   2    3:icmpeq          74
	//*   3    6:iload_0         
	//*   4    7:bipush          37
	//*   5    9:icmpeq          74
	//*   6   12:iload_0         
	//*   7   13:bipush          42
	//*   8   15:icmpeq          74
	//*   9   18:iload_0         
	//*  10   19:bipush          47
	//*  11   21:icmpeq          74
	//*  12   24:iload_0         
	//*  13   25:bipush          58
	//*  14   27:icmpeq          74
	//*  15   30:iload_0         
	//*  16   31:bipush          60
	//*  17   33:icmpeq          74
	//*  18   36:iload_0         
	//*  19   37:bipush          92
	//*  20   39:icmpeq          74
	//*  21   42:iload_0         
	//*  22   43:bipush          124
	//*  23   45:icmpeq          74
			switch(c)
	//*  24   48:iload_0         
			{
	//*  25   49:tableswitch     62 63: default 72
	//	               62 74
	//	               63 74
			default:
				return false;
	//   26   72:iconst_0        
	//   27   73:ireturn         

			case 62: // '>'
			case 63: // '?'
				break;
			}
		return true;
	//   28   74:iconst_1        
	//   29   75:ireturn         
	}

	public static void sneakyThrow(Throwable throwable)
	{
		sneakyThrowInternal(throwable);
	//    0    0:aload_0         
	//    1    1:invokestatic    #961 <Method void sneakyThrowInternal(Throwable)>
	//    2    4:return          
	}

	private static void sneakyThrowInternal(Throwable throwable)
		throws Throwable
	{
		throw throwable;
	//    0    0:aload_0         
	//    1    1:athrow          
	}

	public static int[] toArray(List list)
	{
		if(list == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int j = list.size();
	//    4    6:aload_0         
	//    5    7:invokeinterface #361 <Method int List.size()>
	//    6   12:istore_2        
		int ai[] = new int[j];
	//    7   13:iload_2         
	//    8   14:newarray        int[]
	//    9   16:astore_3        
		for(int i = 0; i < j; i++)
	//*  10   17:iconst_0        
	//*  11   18:istore_1        
	//*  12   19:iload_1         
	//*  13   20:iload_2         
	//*  14   21:icmpge          47
			ai[i] = ((Integer)list.get(i)).intValue();
	//   15   24:aload_3         
	//   16   25:iload_1         
	//   17   26:aload_0         
	//   18   27:iload_1         
	//   19   28:invokeinterface #948 <Method Object List.get(int)>
	//   20   33:checkcast       #420 <Class Integer>
	//   21   36:invokevirtual   #967 <Method int Integer.intValue()>
	//   22   39:iastore         

	//   23   40:iload_1         
	//   24   41:iconst_1        
	//   25   42:iadd            
	//   26   43:istore_1        
	//*  27   44:goto            19
		return ai;
	//   28   47:aload_3         
	//   29   48:areturn         
	}

	public static byte[] toByteArray(InputStream inputstream)
		throws IOException
	{
		byte abyte0[] = new byte[4096];
	//    0    0:sipush          4096
	//    1    3:newarray        byte[]
	//    2    5:astore_2        
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    3    6:new             #970 <Class ByteArrayOutputStream>
	//    4    9:dup             
	//    5   10:invokespecial   #971 <Method void ByteArrayOutputStream()>
	//    6   13:astore_3        
		do
		{
			int i = inputstream.read(abyte0);
	//    7   14:aload_0         
	//    8   15:aload_2         
	//    9   16:invokevirtual   #974 <Method int InputStream.read(byte[])>
	//   10   19:istore_1        
			if(i != -1)
	//*  11   20:iload_1         
	//*  12   21:iconst_m1       
	//*  13   22:icmpeq          35
				bytearrayoutputstream.write(abyte0, 0, i);
	//   14   25:aload_3         
	//   15   26:aload_2         
	//   16   27:iconst_0        
	//   17   28:iload_1         
	//   18   29:invokevirtual   #977 <Method void ByteArrayOutputStream.write(byte[], int, int)>
			else
	//*  19   32:goto            14
				return bytearrayoutputstream.toByteArray();
	//   20   35:aload_3         
	//   21   36:invokevirtual   #980 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   22   39:areturn         
		} while(true);
	}

	public static String toLowerInvariant(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return s.toLowerCase(Locale.US);
	//    4    6:aload_0         
	//    5    7:getstatic       #600 <Field Locale Locale.US>
	//    6   10:invokevirtual   #985 <Method String String.toLowerCase(Locale)>
	//    7   13:areturn         
	}

	public static String unescapeFileName(String s)
	{
		int i1 = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #405 <Method int String.length()>
	//    2    4:istore          6
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		int j = 0;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		int i;
		int k;
		for(i = j; j < i1; i = k)
	//*   7   11:iload_3         
	//*   8   12:istore_2        
	//*   9   13:iload_3         
	//*  10   14:iload           6
	//*  11   16:icmpge          47
		{
			k = i;
	//   12   19:iload_2         
	//   13   20:istore          4
			if(s.charAt(j) == '%')
	//*  14   22:aload_0         
	//*  15   23:iload_3         
	//*  16   24:invokevirtual   #50  <Method char String.charAt(int)>
	//*  17   27:bipush          37
	//*  18   29:icmpne          37
				k = i + 1;
	//   19   32:iload_2         
	//   20   33:iconst_1        
	//   21   34:iadd            
	//   22   35:istore          4
			j++;
	//   23   37:iload_3         
	//   24   38:iconst_1        
	//   25   39:iadd            
	//   26   40:istore_3        
		}

	//   27   41:iload           4
	//   28   43:istore_2        
	//*  29   44:goto            13
		if(i == 0)
	//*  30   47:iload_2         
	//*  31   48:ifne            53
			return s;
	//   32   51:aload_0         
	//   33   52:areturn         
		int l = i1 - i * 2;
	//   34   53:iload           6
	//   35   55:iload_2         
	//   36   56:iconst_2        
	//   37   57:imul            
	//   38   58:isub            
	//   39   59:istore          4
		StringBuilder stringbuilder = new StringBuilder(l);
	//   40   61:new             #411 <Class StringBuilder>
	//   41   64:dup             
	//   42   65:iload           4
	//   43   67:invokespecial   #414 <Method void StringBuilder(int)>
	//   44   70:astore          7
		Matcher matcher = ESCAPED_CHARACTER_PATTERN.matcher(((CharSequence) (s)));
	//   45   72:getstatic       #80  <Field Pattern ESCAPED_CHARACTER_PATTERN>
	//   46   75:aload_0         
	//   47   76:invokevirtual   #861 <Method Matcher Pattern.matcher(CharSequence)>
	//   48   79:astore          8
		j = ((int) (flag));
	//   49   81:iload           5
	//   50   83:istore_3        
		for(; i > 0 && matcher.find(); i--)
	//*  51   84:iload_2         
	//*  52   85:ifle            142
	//*  53   88:aload           8
	//*  54   90:invokevirtual   #989 <Method boolean Matcher.find()>
	//*  55   93:ifeq            142
		{
			char c = (char)Integer.parseInt(matcher.group(1), 16);
	//   56   96:aload           8
	//   57   98:iconst_1        
	//   58   99:invokevirtual   #869 <Method String Matcher.group(int)>
	//   59  102:bipush          16
	//   60  104:invokestatic    #992 <Method int Integer.parseInt(String, int)>
	//   61  107:int2char        
	//   62  108:istore_1        
			stringbuilder.append(((CharSequence) (s)), j, matcher.start());
	//   63  109:aload           7
	//   64  111:aload_0         
	//   65  112:iload_3         
	//   66  113:aload           8
	//   67  115:invokevirtual   #995 <Method int Matcher.start()>
	//   68  118:invokevirtual   #430 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   69  121:pop             
			stringbuilder.append(c);
	//   70  122:aload           7
	//   71  124:iload_1         
	//   72  125:invokevirtual   #418 <Method StringBuilder StringBuilder.append(char)>
	//   73  128:pop             
			j = matcher.end();
	//   74  129:aload           8
	//   75  131:invokevirtual   #998 <Method int Matcher.end()>
	//   76  134:istore_3        
		}

	//   77  135:iload_2         
	//   78  136:iconst_1        
	//   79  137:isub            
	//   80  138:istore_2        
	//*  81  139:goto            84
		if(j < i1)
	//*  82  142:iload_3         
	//*  83  143:iload           6
	//*  84  145:icmpge          158
			stringbuilder.append(((CharSequence) (s)), j, i1);
	//   85  148:aload           7
	//   86  150:aload_0         
	//   87  151:iload_3         
	//   88  152:iload           6
	//   89  154:invokevirtual   #430 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   90  157:pop             
		if(stringbuilder.length() != l)
	//*  91  158:aload           7
	//*  92  160:invokevirtual   #999 <Method int StringBuilder.length()>
	//*  93  163:iload           4
	//*  94  165:icmpeq          170
			return null;
	//   95  168:aconst_null     
	//   96  169:areturn         
		else
			return stringbuilder.toString();
	//   97  170:aload           7
	//   98  172:invokevirtual   #434 <Method String StringBuilder.toString()>
	//   99  175:areturn         
	}

	private static final int CRC32_BYTES_MSBF[] = {
		0, 0x4c11db7, 0x9823b6e, 0xd4326d9, 0x130476dc, 0x17c56b6b, 0x1a864db2, 0x1e475005, 0x2608edb8, 0x22c9f00f, 
		0x2f8ad6d6, 0x2b4bcb61, 0x350c9b64, 0x31cd86d3, 0x3c8ea00a, 0x384fbdbd, 0x4c11db70, 0x48d0c6c7, 0x4593e01e, 0x4152fda9, 
		0x5f15adac, 0x5bd4b01b, 0x569796c2, 0x52568b75, 0x6a1936c8, 0x6ed82b7f, 0x639b0da6, 0x675a1011, 0x791d4014, 0x7ddc5da3, 
		0x709f7b7a, 0x745e66cd, 0x9823b6e0, 0x9ce2ab57, 0x91a18d8e, 0x95609039, 0x8b27c03c, 0x8fe6dd8b, 0x82a5fb52, 0x8664e6e5, 
		0xbe2b5b58, 0xbaea46ef, 0xb7a96036, 0xb3687d81, 0xad2f2d84, 0xa9ee3033, 0xa4ad16ea, 0xa06c0b5d, 0xd4326d90, 0xd0f37027, 
		0xddb056fe, 0xd9714b49, 0xc7361b4c, 0xc3f706fb, 0xceb42022, 0xca753d95, 0xf23a8028, 0xf6fb9d9f, 0xfbb8bb46, 0xff79a6f1, 
		0xe13ef6f4, 0xe5ffeb43, 0xe8bccd9a, 0xec7dd02d, 0x34867077, 0x30476dc0, 0x3d044b19, 0x39c556ae, 0x278206ab, 0x23431b1c, 
		0x2e003dc5, 0x2ac12072, 0x128e9dcf, 0x164f8078, 0x1b0ca6a1, 0x1fcdbb16, 0x18aeb13, 0x54bf6a4, 0x808d07d, 0xcc9cdca, 
		0x7897ab07, 0x7c56b6b0, 0x71159069, 0x75d48dde, 0x6b93dddb, 0x6f52c06c, 0x6211e6b5, 0x66d0fb02, 0x5e9f46bf, 0x5a5e5b08, 
		0x571d7dd1, 0x53dc6066, 0x4d9b3063, 0x495a2dd4, 0x44190b0d, 0x40d816ba, 0xaca5c697, 0xa864db20, 0xa527fdf9, 0xa1e6e04e, 
		0xbfa1b04b, 0xbb60adfc, 0xb6238b25, 0xb2e29692, 0x8aad2b2f, 0x8e6c3698, 0x832f1041, 0x87ee0df6, 0x99a95df3, 0x9d684044, 
		0x902b669d, 0x94ea7b2a, 0xe0b41de7, 0xe4750050, 0xe9362689, 0xedf73b3e, 0xf3b06b3b, 0xf771768c, 0xfa325055, 0xfef34de2, 
		0xc6bcf05f, 0xc27dede8, 0xcf3ecb31, 0xcbffd686, 0xd5b88683, 0xd1799b34, 0xdc3abded, 0xd8fba05a, 0x690ce0ee, 0x6dcdfd59, 
		0x608edb80, 0x644fc637, 0x7a089632, 0x7ec98b85, 0x738aad5c, 0x774bb0eb, 0x4f040d56, 0x4bc510e1, 0x46863638, 0x42472b8f, 
		0x5c007b8a, 0x58c1663d, 0x558240e4, 0x51435d53, 0x251d3b9e, 0x21dc2629, 0x2c9f00f0, 0x285e1d47, 0x36194d42, 0x32d850f5, 
		0x3f9b762c, 0x3b5a6b9b, 0x315d626, 0x7d4cb91, 0xa97ed48, 0xe56f0ff, 0x1011a0fa, 0x14d0bd4d, 0x19939b94, 0x1d528623, 
		0xf12f560e, 0xf5ee4bb9, 0xf8ad6d60, 0xfc6c70d7, 0xe22b20d2, 0xe6ea3d65, 0xeba91bbc, 0xef68060b, 0xd727bbb6, 0xd3e6a601, 
		0xdea580d8, 0xda649d6f, 0xc423cd6a, 0xc0e2d0dd, 0xcda1f604, 0xc960ebb3, 0xbd3e8d7e, 0xb9ff90c9, 0xb4bcb610, 0xb07daba7, 
		0xae3afba2, 0xaafbe615, 0xa7b8c0cc, 0xa379dd7b, 0x9b3660c6, 0x9ff77d71, 0x92b45ba8, 0x9675461f, 0x8832161a, 0x8cf30bad, 
		0x81b02d74, 0x857130c3, 0x5d8a9099, 0x594b8d2e, 0x5408abf7, 0x50c9b640, 0x4e8ee645, 0x4a4ffbf2, 0x470cdd2b, 0x43cdc09c, 
		0x7b827d21, 0x7f436096, 0x7200464f, 0x76c15bf8, 0x68860bfd, 0x6c47164a, 0x61043093, 0x65c52d24, 0x119b4be9, 0x155a565e, 
		0x18197087, 0x1cd86d30, 0x29f3d35, 0x65e2082, 0xb1d065b, 0xfdc1bec, 0x3793a651, 0x3352bbe6, 0x3e119d3f, 0x3ad08088, 
		0x2497d08d, 0x2056cd3a, 0x2d15ebe3, 0x29d4f654, 0xc5a92679, 0xc1683bce, 0xcc2b1d17, 0xc8ea00a0, 0xd6ad50a5, 0xd26c4d12, 
		0xdf2f6bcb, 0xdbee767c, 0xe3a1cbc1, 0xe760d676, 0xea23f0af, 0xeee2ed18, 0xf0a5bd1d, 0xf464a0aa, 0xf9278673, 0xfde69bc4, 
		0x89b8fd09, 0x8d79e0be, 0x803ac667, 0x84fbdbd0, 0x9abc8bd5, 0x9e7d9662, 0x933eb0bb, 0x97ffad0c, 0xafb010b1, 0xab710d06, 
		0xa6322bdf, 0xa2f33668, 0xbcb4666d, 0xb8757bda, 0xb5365d03, 0xb1f740b4
	};
	public static final String DEVICE;
	private static final Pattern ESCAPED_CHARACTER_PATTERN = Pattern.compile("%([A-Fa-f0-9]{2})");
	public static final String MANUFACTURER;
	private static final long MAX_BYTES_TO_DRAIN = 2048L;
	public static final String MODEL;
	public static final int SDK_INT;
	private static final String TAG = "Util";
	public static final int TYPE_DASH = 0;
	public static final int TYPE_HLS = 2;
	public static final int TYPE_OTHER = 3;
	public static final int TYPE_SS = 1;
	private static final Pattern XS_DATE_TIME_PATTERN = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)(\\.(\\d+))?([Zz]|((\\+|\\-)(\\d\\d):?(\\d\\d)))?");
	private static final Pattern XS_DURATION_PATTERN = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

	static 
	{
		int i;
		if(android.os.Build.VERSION.SDK_INT == 25 && android.os.Build.VERSION.CODENAME.charAt(0) == 'O')
	//*   0    0:getstatic       #41  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          25
	//*   2    5:icmpne          26
	//*   3    8:getstatic       #44  <Field String android.os.Build$VERSION.CODENAME>
	//*   4   11:iconst_0        
	//*   5   12:invokevirtual   #50  <Method char String.charAt(int)>
	//*   6   15:bipush          79
	//*   7   17:icmpne          26
			i = 26;
	//    8   20:bipush          26
	//    9   22:istore_0        
		else
	//*  10   23:goto            30
			i = android.os.Build.VERSION.SDK_INT;
	//   11   26:getstatic       #41  <Field int android.os.Build$VERSION.SDK_INT>
	//   12   29:istore_0        
		SDK_INT = i;
	//   13   30:iload_0         
	//   14   31:putstatic       #51  <Field int SDK_INT>
		DEVICE = Build.DEVICE;
	//   15   34:getstatic       #55  <Field String Build.DEVICE>
	//   16   37:putstatic       #56  <Field String DEVICE>
		MANUFACTURER = Build.MANUFACTURER;
	//   17   40:getstatic       #58  <Field String Build.MANUFACTURER>
	//   18   43:putstatic       #59  <Field String MANUFACTURER>
		MODEL = Build.MODEL;
	//   19   46:getstatic       #61  <Field String Build.MODEL>
	//   20   49:putstatic       #62  <Field String MODEL>
	//   21   52:ldc1            #64  <String "(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)(\\.(\\d+))?([Zz]|((\\+|\\-)(\\d\\d):?(\\d\\d)))?">
	//   22   54:invokestatic    #70  <Method Pattern Pattern.compile(String)>
	//   23   57:putstatic       #72  <Field Pattern XS_DATE_TIME_PATTERN>
	//   24   60:ldc1            #74  <String "^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$">
	//   25   62:invokestatic    #70  <Method Pattern Pattern.compile(String)>
	//   26   65:putstatic       #76  <Field Pattern XS_DURATION_PATTERN>
	//   27   68:ldc1            #78  <String "%([A-Fa-f0-9]{2})">
	//   28   70:invokestatic    #70  <Method Pattern Pattern.compile(String)>
	//   29   73:putstatic       #80  <Field Pattern ESCAPED_CHARACTER_PATTERN>
	//   30   76:sipush          256
	//   31   79:newarray        int[]
	//   32   81:dup             
	//   33   82:iconst_0        
	//   34   83:iconst_0        
	//   35   84:iastore         
	//   36   85:dup             
	//   37   86:iconst_1        
	//   38   87:ldc1            #81  <Int 0x4c11db7>
	//   39   89:iastore         
	//   40   90:dup             
	//   41   91:iconst_2        
	//   42   92:ldc1            #82  <Int 0x9823b6e>
	//   43   94:iastore         
	//   44   95:dup             
	//   45   96:iconst_3        
	//   46   97:ldc1            #83  <Int 0xd4326d9>
	//   47   99:iastore         
	//   48  100:dup             
	//   49  101:iconst_4        
	//   50  102:ldc1            #84  <Int 0x130476dc>
	//   51  104:iastore         
	//   52  105:dup             
	//   53  106:iconst_5        
	//   54  107:ldc1            #85  <Int 0x17c56b6b>
	//   55  109:iastore         
	//   56  110:dup             
	//   57  111:bipush          6
	//   58  113:ldc1            #86  <Int 0x1a864db2>
	//   59  115:iastore         
	//   60  116:dup             
	//   61  117:bipush          7
	//   62  119:ldc1            #87  <Int 0x1e475005>
	//   63  121:iastore         
	//   64  122:dup             
	//   65  123:bipush          8
	//   66  125:ldc1            #88  <Int 0x2608edb8>
	//   67  127:iastore         
	//   68  128:dup             
	//   69  129:bipush          9
	//   70  131:ldc1            #89  <Int 0x22c9f00f>
	//   71  133:iastore         
	//   72  134:dup             
	//   73  135:bipush          10
	//   74  137:ldc1            #90  <Int 0x2f8ad6d6>
	//   75  139:iastore         
	//   76  140:dup             
	//   77  141:bipush          11
	//   78  143:ldc1            #91  <Int 0x2b4bcb61>
	//   79  145:iastore         
	//   80  146:dup             
	//   81  147:bipush          12
	//   82  149:ldc1            #92  <Int 0x350c9b64>
	//   83  151:iastore         
	//   84  152:dup             
	//   85  153:bipush          13
	//   86  155:ldc1            #93  <Int 0x31cd86d3>
	//   87  157:iastore         
	//   88  158:dup             
	//   89  159:bipush          14
	//   90  161:ldc1            #94  <Int 0x3c8ea00a>
	//   91  163:iastore         
	//   92  164:dup             
	//   93  165:bipush          15
	//   94  167:ldc1            #95  <Int 0x384fbdbd>
	//   95  169:iastore         
	//   96  170:dup             
	//   97  171:bipush          16
	//   98  173:ldc1            #96  <Int 0x4c11db70>
	//   99  175:iastore         
	//  100  176:dup             
	//  101  177:bipush          17
	//  102  179:ldc1            #97  <Int 0x48d0c6c7>
	//  103  181:iastore         
	//  104  182:dup             
	//  105  183:bipush          18
	//  106  185:ldc1            #98  <Int 0x4593e01e>
	//  107  187:iastore         
	//  108  188:dup             
	//  109  189:bipush          19
	//  110  191:ldc1            #99  <Int 0x4152fda9>
	//  111  193:iastore         
	//  112  194:dup             
	//  113  195:bipush          20
	//  114  197:ldc1            #100 <Int 0x5f15adac>
	//  115  199:iastore         
	//  116  200:dup             
	//  117  201:bipush          21
	//  118  203:ldc1            #101 <Int 0x5bd4b01b>
	//  119  205:iastore         
	//  120  206:dup             
	//  121  207:bipush          22
	//  122  209:ldc1            #102 <Int 0x569796c2>
	//  123  211:iastore         
	//  124  212:dup             
	//  125  213:bipush          23
	//  126  215:ldc1            #103 <Int 0x52568b75>
	//  127  217:iastore         
	//  128  218:dup             
	//  129  219:bipush          24
	//  130  221:ldc1            #104 <Int 0x6a1936c8>
	//  131  223:iastore         
	//  132  224:dup             
	//  133  225:bipush          25
	//  134  227:ldc1            #105 <Int 0x6ed82b7f>
	//  135  229:iastore         
	//  136  230:dup             
	//  137  231:bipush          26
	//  138  233:ldc1            #106 <Int 0x639b0da6>
	//  139  235:iastore         
	//  140  236:dup             
	//  141  237:bipush          27
	//  142  239:ldc1            #107 <Int 0x675a1011>
	//  143  241:iastore         
	//  144  242:dup             
	//  145  243:bipush          28
	//  146  245:ldc1            #108 <Int 0x791d4014>
	//  147  247:iastore         
	//  148  248:dup             
	//  149  249:bipush          29
	//  150  251:ldc1            #109 <Int 0x7ddc5da3>
	//  151  253:iastore         
	//  152  254:dup             
	//  153  255:bipush          30
	//  154  257:ldc1            #110 <Int 0x709f7b7a>
	//  155  259:iastore         
	//  156  260:dup             
	//  157  261:bipush          31
	//  158  263:ldc1            #111 <Int 0x745e66cd>
	//  159  265:iastore         
	//  160  266:dup             
	//  161  267:bipush          32
	//  162  269:ldc1            #112 <Int 0x9823b6e0>
	//  163  271:iastore         
	//  164  272:dup             
	//  165  273:bipush          33
	//  166  275:ldc1            #113 <Int 0x9ce2ab57>
	//  167  277:iastore         
	//  168  278:dup             
	//  169  279:bipush          34
	//  170  281:ldc1            #114 <Int 0x91a18d8e>
	//  171  283:iastore         
	//  172  284:dup             
	//  173  285:bipush          35
	//  174  287:ldc1            #115 <Int 0x95609039>
	//  175  289:iastore         
	//  176  290:dup             
	//  177  291:bipush          36
	//  178  293:ldc1            #116 <Int 0x8b27c03c>
	//  179  295:iastore         
	//  180  296:dup             
	//  181  297:bipush          37
	//  182  299:ldc1            #117 <Int 0x8fe6dd8b>
	//  183  301:iastore         
	//  184  302:dup             
	//  185  303:bipush          38
	//  186  305:ldc1            #118 <Int 0x82a5fb52>
	//  187  307:iastore         
	//  188  308:dup             
	//  189  309:bipush          39
	//  190  311:ldc1            #119 <Int 0x8664e6e5>
	//  191  313:iastore         
	//  192  314:dup             
	//  193  315:bipush          40
	//  194  317:ldc1            #120 <Int 0xbe2b5b58>
	//  195  319:iastore         
	//  196  320:dup             
	//  197  321:bipush          41
	//  198  323:ldc1            #121 <Int 0xbaea46ef>
	//  199  325:iastore         
	//  200  326:dup             
	//  201  327:bipush          42
	//  202  329:ldc1            #122 <Int 0xb7a96036>
	//  203  331:iastore         
	//  204  332:dup             
	//  205  333:bipush          43
	//  206  335:ldc1            #123 <Int 0xb3687d81>
	//  207  337:iastore         
	//  208  338:dup             
	//  209  339:bipush          44
	//  210  341:ldc1            #124 <Int 0xad2f2d84>
	//  211  343:iastore         
	//  212  344:dup             
	//  213  345:bipush          45
	//  214  347:ldc1            #125 <Int 0xa9ee3033>
	//  215  349:iastore         
	//  216  350:dup             
	//  217  351:bipush          46
	//  218  353:ldc1            #126 <Int 0xa4ad16ea>
	//  219  355:iastore         
	//  220  356:dup             
	//  221  357:bipush          47
	//  222  359:ldc1            #127 <Int 0xa06c0b5d>
	//  223  361:iastore         
	//  224  362:dup             
	//  225  363:bipush          48
	//  226  365:ldc1            #128 <Int 0xd4326d90>
	//  227  367:iastore         
	//  228  368:dup             
	//  229  369:bipush          49
	//  230  371:ldc1            #129 <Int 0xd0f37027>
	//  231  373:iastore         
	//  232  374:dup             
	//  233  375:bipush          50
	//  234  377:ldc1            #130 <Int 0xddb056fe>
	//  235  379:iastore         
	//  236  380:dup             
	//  237  381:bipush          51
	//  238  383:ldc1            #131 <Int 0xd9714b49>
	//  239  385:iastore         
	//  240  386:dup             
	//  241  387:bipush          52
	//  242  389:ldc1            #132 <Int 0xc7361b4c>
	//  243  391:iastore         
	//  244  392:dup             
	//  245  393:bipush          53
	//  246  395:ldc1            #133 <Int 0xc3f706fb>
	//  247  397:iastore         
	//  248  398:dup             
	//  249  399:bipush          54
	//  250  401:ldc1            #134 <Int 0xceb42022>
	//  251  403:iastore         
	//  252  404:dup             
	//  253  405:bipush          55
	//  254  407:ldc1            #135 <Int 0xca753d95>
	//  255  409:iastore         
	//  256  410:dup             
	//  257  411:bipush          56
	//  258  413:ldc1            #136 <Int 0xf23a8028>
	//  259  415:iastore         
	//  260  416:dup             
	//  261  417:bipush          57
	//  262  419:ldc1            #137 <Int 0xf6fb9d9f>
	//  263  421:iastore         
	//  264  422:dup             
	//  265  423:bipush          58
	//  266  425:ldc1            #138 <Int 0xfbb8bb46>
	//  267  427:iastore         
	//  268  428:dup             
	//  269  429:bipush          59
	//  270  431:ldc1            #139 <Int 0xff79a6f1>
	//  271  433:iastore         
	//  272  434:dup             
	//  273  435:bipush          60
	//  274  437:ldc1            #140 <Int 0xe13ef6f4>
	//  275  439:iastore         
	//  276  440:dup             
	//  277  441:bipush          61
	//  278  443:ldc1            #141 <Int 0xe5ffeb43>
	//  279  445:iastore         
	//  280  446:dup             
	//  281  447:bipush          62
	//  282  449:ldc1            #142 <Int 0xe8bccd9a>
	//  283  451:iastore         
	//  284  452:dup             
	//  285  453:bipush          63
	//  286  455:ldc1            #143 <Int 0xec7dd02d>
	//  287  457:iastore         
	//  288  458:dup             
	//  289  459:bipush          64
	//  290  461:ldc1            #144 <Int 0x34867077>
	//  291  463:iastore         
	//  292  464:dup             
	//  293  465:bipush          65
	//  294  467:ldc1            #145 <Int 0x30476dc0>
	//  295  469:iastore         
	//  296  470:dup             
	//  297  471:bipush          66
	//  298  473:ldc1            #146 <Int 0x3d044b19>
	//  299  475:iastore         
	//  300  476:dup             
	//  301  477:bipush          67
	//  302  479:ldc1            #147 <Int 0x39c556ae>
	//  303  481:iastore         
	//  304  482:dup             
	//  305  483:bipush          68
	//  306  485:ldc1            #148 <Int 0x278206ab>
	//  307  487:iastore         
	//  308  488:dup             
	//  309  489:bipush          69
	//  310  491:ldc1            #149 <Int 0x23431b1c>
	//  311  493:iastore         
	//  312  494:dup             
	//  313  495:bipush          70
	//  314  497:ldc1            #150 <Int 0x2e003dc5>
	//  315  499:iastore         
	//  316  500:dup             
	//  317  501:bipush          71
	//  318  503:ldc1            #151 <Int 0x2ac12072>
	//  319  505:iastore         
	//  320  506:dup             
	//  321  507:bipush          72
	//  322  509:ldc1            #152 <Int 0x128e9dcf>
	//  323  511:iastore         
	//  324  512:dup             
	//  325  513:bipush          73
	//  326  515:ldc1            #153 <Int 0x164f8078>
	//  327  517:iastore         
	//  328  518:dup             
	//  329  519:bipush          74
	//  330  521:ldc1            #154 <Int 0x1b0ca6a1>
	//  331  523:iastore         
	//  332  524:dup             
	//  333  525:bipush          75
	//  334  527:ldc1            #155 <Int 0x1fcdbb16>
	//  335  529:iastore         
	//  336  530:dup             
	//  337  531:bipush          76
	//  338  533:ldc1            #156 <Int 0x18aeb13>
	//  339  535:iastore         
	//  340  536:dup             
	//  341  537:bipush          77
	//  342  539:ldc1            #157 <Int 0x54bf6a4>
	//  343  541:iastore         
	//  344  542:dup             
	//  345  543:bipush          78
	//  346  545:ldc1            #158 <Int 0x808d07d>
	//  347  547:iastore         
	//  348  548:dup             
	//  349  549:bipush          79
	//  350  551:ldc1            #159 <Int 0xcc9cdca>
	//  351  553:iastore         
	//  352  554:dup             
	//  353  555:bipush          80
	//  354  557:ldc1            #160 <Int 0x7897ab07>
	//  355  559:iastore         
	//  356  560:dup             
	//  357  561:bipush          81
	//  358  563:ldc1            #161 <Int 0x7c56b6b0>
	//  359  565:iastore         
	//  360  566:dup             
	//  361  567:bipush          82
	//  362  569:ldc1            #162 <Int 0x71159069>
	//  363  571:iastore         
	//  364  572:dup             
	//  365  573:bipush          83
	//  366  575:ldc1            #163 <Int 0x75d48dde>
	//  367  577:iastore         
	//  368  578:dup             
	//  369  579:bipush          84
	//  370  581:ldc1            #164 <Int 0x6b93dddb>
	//  371  583:iastore         
	//  372  584:dup             
	//  373  585:bipush          85
	//  374  587:ldc1            #165 <Int 0x6f52c06c>
	//  375  589:iastore         
	//  376  590:dup             
	//  377  591:bipush          86
	//  378  593:ldc1            #166 <Int 0x6211e6b5>
	//  379  595:iastore         
	//  380  596:dup             
	//  381  597:bipush          87
	//  382  599:ldc1            #167 <Int 0x66d0fb02>
	//  383  601:iastore         
	//  384  602:dup             
	//  385  603:bipush          88
	//  386  605:ldc1            #168 <Int 0x5e9f46bf>
	//  387  607:iastore         
	//  388  608:dup             
	//  389  609:bipush          89
	//  390  611:ldc1            #169 <Int 0x5a5e5b08>
	//  391  613:iastore         
	//  392  614:dup             
	//  393  615:bipush          90
	//  394  617:ldc1            #170 <Int 0x571d7dd1>
	//  395  619:iastore         
	//  396  620:dup             
	//  397  621:bipush          91
	//  398  623:ldc1            #171 <Int 0x53dc6066>
	//  399  625:iastore         
	//  400  626:dup             
	//  401  627:bipush          92
	//  402  629:ldc1            #172 <Int 0x4d9b3063>
	//  403  631:iastore         
	//  404  632:dup             
	//  405  633:bipush          93
	//  406  635:ldc1            #173 <Int 0x495a2dd4>
	//  407  637:iastore         
	//  408  638:dup             
	//  409  639:bipush          94
	//  410  641:ldc1            #174 <Int 0x44190b0d>
	//  411  643:iastore         
	//  412  644:dup             
	//  413  645:bipush          95
	//  414  647:ldc1            #175 <Int 0x40d816ba>
	//  415  649:iastore         
	//  416  650:dup             
	//  417  651:bipush          96
	//  418  653:ldc1            #176 <Int 0xaca5c697>
	//  419  655:iastore         
	//  420  656:dup             
	//  421  657:bipush          97
	//  422  659:ldc1            #177 <Int 0xa864db20>
	//  423  661:iastore         
	//  424  662:dup             
	//  425  663:bipush          98
	//  426  665:ldc1            #178 <Int 0xa527fdf9>
	//  427  667:iastore         
	//  428  668:dup             
	//  429  669:bipush          99
	//  430  671:ldc1            #179 <Int 0xa1e6e04e>
	//  431  673:iastore         
	//  432  674:dup             
	//  433  675:bipush          100
	//  434  677:ldc1            #180 <Int 0xbfa1b04b>
	//  435  679:iastore         
	//  436  680:dup             
	//  437  681:bipush          101
	//  438  683:ldc1            #181 <Int 0xbb60adfc>
	//  439  685:iastore         
	//  440  686:dup             
	//  441  687:bipush          102
	//  442  689:ldc1            #182 <Int 0xb6238b25>
	//  443  691:iastore         
	//  444  692:dup             
	//  445  693:bipush          103
	//  446  695:ldc1            #183 <Int 0xb2e29692>
	//  447  697:iastore         
	//  448  698:dup             
	//  449  699:bipush          104
	//  450  701:ldc1            #184 <Int 0x8aad2b2f>
	//  451  703:iastore         
	//  452  704:dup             
	//  453  705:bipush          105
	//  454  707:ldc1            #185 <Int 0x8e6c3698>
	//  455  709:iastore         
	//  456  710:dup             
	//  457  711:bipush          106
	//  458  713:ldc1            #186 <Int 0x832f1041>
	//  459  715:iastore         
	//  460  716:dup             
	//  461  717:bipush          107
	//  462  719:ldc1            #187 <Int 0x87ee0df6>
	//  463  721:iastore         
	//  464  722:dup             
	//  465  723:bipush          108
	//  466  725:ldc1            #188 <Int 0x99a95df3>
	//  467  727:iastore         
	//  468  728:dup             
	//  469  729:bipush          109
	//  470  731:ldc1            #189 <Int 0x9d684044>
	//  471  733:iastore         
	//  472  734:dup             
	//  473  735:bipush          110
	//  474  737:ldc1            #190 <Int 0x902b669d>
	//  475  739:iastore         
	//  476  740:dup             
	//  477  741:bipush          111
	//  478  743:ldc1            #191 <Int 0x94ea7b2a>
	//  479  745:iastore         
	//  480  746:dup             
	//  481  747:bipush          112
	//  482  749:ldc1            #192 <Int 0xe0b41de7>
	//  483  751:iastore         
	//  484  752:dup             
	//  485  753:bipush          113
	//  486  755:ldc1            #193 <Int 0xe4750050>
	//  487  757:iastore         
	//  488  758:dup             
	//  489  759:bipush          114
	//  490  761:ldc1            #194 <Int 0xe9362689>
	//  491  763:iastore         
	//  492  764:dup             
	//  493  765:bipush          115
	//  494  767:ldc1            #195 <Int 0xedf73b3e>
	//  495  769:iastore         
	//  496  770:dup             
	//  497  771:bipush          116
	//  498  773:ldc1            #196 <Int 0xf3b06b3b>
	//  499  775:iastore         
	//  500  776:dup             
	//  501  777:bipush          117
	//  502  779:ldc1            #197 <Int 0xf771768c>
	//  503  781:iastore         
	//  504  782:dup             
	//  505  783:bipush          118
	//  506  785:ldc1            #198 <Int 0xfa325055>
	//  507  787:iastore         
	//  508  788:dup             
	//  509  789:bipush          119
	//  510  791:ldc1            #199 <Int 0xfef34de2>
	//  511  793:iastore         
	//  512  794:dup             
	//  513  795:bipush          120
	//  514  797:ldc1            #200 <Int 0xc6bcf05f>
	//  515  799:iastore         
	//  516  800:dup             
	//  517  801:bipush          121
	//  518  803:ldc1            #201 <Int 0xc27dede8>
	//  519  805:iastore         
	//  520  806:dup             
	//  521  807:bipush          122
	//  522  809:ldc1            #202 <Int 0xcf3ecb31>
	//  523  811:iastore         
	//  524  812:dup             
	//  525  813:bipush          123
	//  526  815:ldc1            #203 <Int 0xcbffd686>
	//  527  817:iastore         
	//  528  818:dup             
	//  529  819:bipush          124
	//  530  821:ldc1            #204 <Int 0xd5b88683>
	//  531  823:iastore         
	//  532  824:dup             
	//  533  825:bipush          125
	//  534  827:ldc1            #205 <Int 0xd1799b34>
	//  535  829:iastore         
	//  536  830:dup             
	//  537  831:bipush          126
	//  538  833:ldc1            #206 <Int 0xdc3abded>
	//  539  835:iastore         
	//  540  836:dup             
	//  541  837:bipush          127
	//  542  839:ldc1            #207 <Int 0xd8fba05a>
	//  543  841:iastore         
	//  544  842:dup             
	//  545  843:sipush          128
	//  546  846:ldc1            #208 <Int 0x690ce0ee>
	//  547  848:iastore         
	//  548  849:dup             
	//  549  850:sipush          129
	//  550  853:ldc1            #209 <Int 0x6dcdfd59>
	//  551  855:iastore         
	//  552  856:dup             
	//  553  857:sipush          130
	//  554  860:ldc1            #210 <Int 0x608edb80>
	//  555  862:iastore         
	//  556  863:dup             
	//  557  864:sipush          131
	//  558  867:ldc1            #211 <Int 0x644fc637>
	//  559  869:iastore         
	//  560  870:dup             
	//  561  871:sipush          132
	//  562  874:ldc1            #212 <Int 0x7a089632>
	//  563  876:iastore         
	//  564  877:dup             
	//  565  878:sipush          133
	//  566  881:ldc1            #213 <Int 0x7ec98b85>
	//  567  883:iastore         
	//  568  884:dup             
	//  569  885:sipush          134
	//  570  888:ldc1            #214 <Int 0x738aad5c>
	//  571  890:iastore         
	//  572  891:dup             
	//  573  892:sipush          135
	//  574  895:ldc1            #215 <Int 0x774bb0eb>
	//  575  897:iastore         
	//  576  898:dup             
	//  577  899:sipush          136
	//  578  902:ldc1            #216 <Int 0x4f040d56>
	//  579  904:iastore         
	//  580  905:dup             
	//  581  906:sipush          137
	//  582  909:ldc1            #217 <Int 0x4bc510e1>
	//  583  911:iastore         
	//  584  912:dup             
	//  585  913:sipush          138
	//  586  916:ldc1            #218 <Int 0x46863638>
	//  587  918:iastore         
	//  588  919:dup             
	//  589  920:sipush          139
	//  590  923:ldc1            #219 <Int 0x42472b8f>
	//  591  925:iastore         
	//  592  926:dup             
	//  593  927:sipush          140
	//  594  930:ldc1            #220 <Int 0x5c007b8a>
	//  595  932:iastore         
	//  596  933:dup             
	//  597  934:sipush          141
	//  598  937:ldc1            #221 <Int 0x58c1663d>
	//  599  939:iastore         
	//  600  940:dup             
	//  601  941:sipush          142
	//  602  944:ldc1            #222 <Int 0x558240e4>
	//  603  946:iastore         
	//  604  947:dup             
	//  605  948:sipush          143
	//  606  951:ldc1            #223 <Int 0x51435d53>
	//  607  953:iastore         
	//  608  954:dup             
	//  609  955:sipush          144
	//  610  958:ldc1            #224 <Int 0x251d3b9e>
	//  611  960:iastore         
	//  612  961:dup             
	//  613  962:sipush          145
	//  614  965:ldc1            #225 <Int 0x21dc2629>
	//  615  967:iastore         
	//  616  968:dup             
	//  617  969:sipush          146
	//  618  972:ldc1            #226 <Int 0x2c9f00f0>
	//  619  974:iastore         
	//  620  975:dup             
	//  621  976:sipush          147
	//  622  979:ldc1            #227 <Int 0x285e1d47>
	//  623  981:iastore         
	//  624  982:dup             
	//  625  983:sipush          148
	//  626  986:ldc1            #228 <Int 0x36194d42>
	//  627  988:iastore         
	//  628  989:dup             
	//  629  990:sipush          149
	//  630  993:ldc1            #229 <Int 0x32d850f5>
	//  631  995:iastore         
	//  632  996:dup             
	//  633  997:sipush          150
	//  634 1000:ldc1            #230 <Int 0x3f9b762c>
	//  635 1002:iastore         
	//  636 1003:dup             
	//  637 1004:sipush          151
	//  638 1007:ldc1            #231 <Int 0x3b5a6b9b>
	//  639 1009:iastore         
	//  640 1010:dup             
	//  641 1011:sipush          152
	//  642 1014:ldc1            #232 <Int 0x315d626>
	//  643 1016:iastore         
	//  644 1017:dup             
	//  645 1018:sipush          153
	//  646 1021:ldc1            #233 <Int 0x7d4cb91>
	//  647 1023:iastore         
	//  648 1024:dup             
	//  649 1025:sipush          154
	//  650 1028:ldc1            #234 <Int 0xa97ed48>
	//  651 1030:iastore         
	//  652 1031:dup             
	//  653 1032:sipush          155
	//  654 1035:ldc1            #235 <Int 0xe56f0ff>
	//  655 1037:iastore         
	//  656 1038:dup             
	//  657 1039:sipush          156
	//  658 1042:ldc1            #236 <Int 0x1011a0fa>
	//  659 1044:iastore         
	//  660 1045:dup             
	//  661 1046:sipush          157
	//  662 1049:ldc1            #237 <Int 0x14d0bd4d>
	//  663 1051:iastore         
	//  664 1052:dup             
	//  665 1053:sipush          158
	//  666 1056:ldc1            #238 <Int 0x19939b94>
	//  667 1058:iastore         
	//  668 1059:dup             
	//  669 1060:sipush          159
	//  670 1063:ldc1            #239 <Int 0x1d528623>
	//  671 1065:iastore         
	//  672 1066:dup             
	//  673 1067:sipush          160
	//  674 1070:ldc1            #240 <Int 0xf12f560e>
	//  675 1072:iastore         
	//  676 1073:dup             
	//  677 1074:sipush          161
	//  678 1077:ldc1            #241 <Int 0xf5ee4bb9>
	//  679 1079:iastore         
	//  680 1080:dup             
	//  681 1081:sipush          162
	//  682 1084:ldc1            #242 <Int 0xf8ad6d60>
	//  683 1086:iastore         
	//  684 1087:dup             
	//  685 1088:sipush          163
	//  686 1091:ldc1            #243 <Int 0xfc6c70d7>
	//  687 1093:iastore         
	//  688 1094:dup             
	//  689 1095:sipush          164
	//  690 1098:ldc1            #244 <Int 0xe22b20d2>
	//  691 1100:iastore         
	//  692 1101:dup             
	//  693 1102:sipush          165
	//  694 1105:ldc1            #245 <Int 0xe6ea3d65>
	//  695 1107:iastore         
	//  696 1108:dup             
	//  697 1109:sipush          166
	//  698 1112:ldc1            #246 <Int 0xeba91bbc>
	//  699 1114:iastore         
	//  700 1115:dup             
	//  701 1116:sipush          167
	//  702 1119:ldc1            #247 <Int 0xef68060b>
	//  703 1121:iastore         
	//  704 1122:dup             
	//  705 1123:sipush          168
	//  706 1126:ldc1            #248 <Int 0xd727bbb6>
	//  707 1128:iastore         
	//  708 1129:dup             
	//  709 1130:sipush          169
	//  710 1133:ldc1            #249 <Int 0xd3e6a601>
	//  711 1135:iastore         
	//  712 1136:dup             
	//  713 1137:sipush          170
	//  714 1140:ldc1            #250 <Int 0xdea580d8>
	//  715 1142:iastore         
	//  716 1143:dup             
	//  717 1144:sipush          171
	//  718 1147:ldc1            #251 <Int 0xda649d6f>
	//  719 1149:iastore         
	//  720 1150:dup             
	//  721 1151:sipush          172
	//  722 1154:ldc1            #252 <Int 0xc423cd6a>
	//  723 1156:iastore         
	//  724 1157:dup             
	//  725 1158:sipush          173
	//  726 1161:ldc1            #253 <Int 0xc0e2d0dd>
	//  727 1163:iastore         
	//  728 1164:dup             
	//  729 1165:sipush          174
	//  730 1168:ldc1            #254 <Int 0xcda1f604>
	//  731 1170:iastore         
	//  732 1171:dup             
	//  733 1172:sipush          175
	//  734 1175:ldc1            #255 <Int 0xc960ebb3>
	//  735 1177:iastore         
	//  736 1178:dup             
	//  737 1179:sipush          176
	//  738 1182:ldc2            #256 <Int 0xbd3e8d7e>
	//  739 1185:iastore         
	//  740 1186:dup             
	//  741 1187:sipush          177
	//  742 1190:ldc2            #257 <Int 0xb9ff90c9>
	//  743 1193:iastore         
	//  744 1194:dup             
	//  745 1195:sipush          178
	//  746 1198:ldc2            #258 <Int 0xb4bcb610>
	//  747 1201:iastore         
	//  748 1202:dup             
	//  749 1203:sipush          179
	//  750 1206:ldc2            #259 <Int 0xb07daba7>
	//  751 1209:iastore         
	//  752 1210:dup             
	//  753 1211:sipush          180
	//  754 1214:ldc2            #260 <Int 0xae3afba2>
	//  755 1217:iastore         
	//  756 1218:dup             
	//  757 1219:sipush          181
	//  758 1222:ldc2            #261 <Int 0xaafbe615>
	//  759 1225:iastore         
	//  760 1226:dup             
	//  761 1227:sipush          182
	//  762 1230:ldc2            #262 <Int 0xa7b8c0cc>
	//  763 1233:iastore         
	//  764 1234:dup             
	//  765 1235:sipush          183
	//  766 1238:ldc2            #263 <Int 0xa379dd7b>
	//  767 1241:iastore         
	//  768 1242:dup             
	//  769 1243:sipush          184
	//  770 1246:ldc2            #264 <Int 0x9b3660c6>
	//  771 1249:iastore         
	//  772 1250:dup             
	//  773 1251:sipush          185
	//  774 1254:ldc2            #265 <Int 0x9ff77d71>
	//  775 1257:iastore         
	//  776 1258:dup             
	//  777 1259:sipush          186
	//  778 1262:ldc2            #266 <Int 0x92b45ba8>
	//  779 1265:iastore         
	//  780 1266:dup             
	//  781 1267:sipush          187
	//  782 1270:ldc2            #267 <Int 0x9675461f>
	//  783 1273:iastore         
	//  784 1274:dup             
	//  785 1275:sipush          188
	//  786 1278:ldc2            #268 <Int 0x8832161a>
	//  787 1281:iastore         
	//  788 1282:dup             
	//  789 1283:sipush          189
	//  790 1286:ldc2            #269 <Int 0x8cf30bad>
	//  791 1289:iastore         
	//  792 1290:dup             
	//  793 1291:sipush          190
	//  794 1294:ldc2            #270 <Int 0x81b02d74>
	//  795 1297:iastore         
	//  796 1298:dup             
	//  797 1299:sipush          191
	//  798 1302:ldc2            #271 <Int 0x857130c3>
	//  799 1305:iastore         
	//  800 1306:dup             
	//  801 1307:sipush          192
	//  802 1310:ldc2            #272 <Int 0x5d8a9099>
	//  803 1313:iastore         
	//  804 1314:dup             
	//  805 1315:sipush          193
	//  806 1318:ldc2            #273 <Int 0x594b8d2e>
	//  807 1321:iastore         
	//  808 1322:dup             
	//  809 1323:sipush          194
	//  810 1326:ldc2            #274 <Int 0x5408abf7>
	//  811 1329:iastore         
	//  812 1330:dup             
	//  813 1331:sipush          195
	//  814 1334:ldc2            #275 <Int 0x50c9b640>
	//  815 1337:iastore         
	//  816 1338:dup             
	//  817 1339:sipush          196
	//  818 1342:ldc2            #276 <Int 0x4e8ee645>
	//  819 1345:iastore         
	//  820 1346:dup             
	//  821 1347:sipush          197
	//  822 1350:ldc2            #277 <Int 0x4a4ffbf2>
	//  823 1353:iastore         
	//  824 1354:dup             
	//  825 1355:sipush          198
	//  826 1358:ldc2            #278 <Int 0x470cdd2b>
	//  827 1361:iastore         
	//  828 1362:dup             
	//  829 1363:sipush          199
	//  830 1366:ldc2            #279 <Int 0x43cdc09c>
	//  831 1369:iastore         
	//  832 1370:dup             
	//  833 1371:sipush          200
	//  834 1374:ldc2            #280 <Int 0x7b827d21>
	//  835 1377:iastore         
	//  836 1378:dup             
	//  837 1379:sipush          201
	//  838 1382:ldc2            #281 <Int 0x7f436096>
	//  839 1385:iastore         
	//  840 1386:dup             
	//  841 1387:sipush          202
	//  842 1390:ldc2            #282 <Int 0x7200464f>
	//  843 1393:iastore         
	//  844 1394:dup             
	//  845 1395:sipush          203
	//  846 1398:ldc2            #283 <Int 0x76c15bf8>
	//  847 1401:iastore         
	//  848 1402:dup             
	//  849 1403:sipush          204
	//  850 1406:ldc2            #284 <Int 0x68860bfd>
	//  851 1409:iastore         
	//  852 1410:dup             
	//  853 1411:sipush          205
	//  854 1414:ldc2            #285 <Int 0x6c47164a>
	//  855 1417:iastore         
	//  856 1418:dup             
	//  857 1419:sipush          206
	//  858 1422:ldc2            #286 <Int 0x61043093>
	//  859 1425:iastore         
	//  860 1426:dup             
	//  861 1427:sipush          207
	//  862 1430:ldc2            #287 <Int 0x65c52d24>
	//  863 1433:iastore         
	//  864 1434:dup             
	//  865 1435:sipush          208
	//  866 1438:ldc2            #288 <Int 0x119b4be9>
	//  867 1441:iastore         
	//  868 1442:dup             
	//  869 1443:sipush          209
	//  870 1446:ldc2            #289 <Int 0x155a565e>
	//  871 1449:iastore         
	//  872 1450:dup             
	//  873 1451:sipush          210
	//  874 1454:ldc2            #290 <Int 0x18197087>
	//  875 1457:iastore         
	//  876 1458:dup             
	//  877 1459:sipush          211
	//  878 1462:ldc2            #291 <Int 0x1cd86d30>
	//  879 1465:iastore         
	//  880 1466:dup             
	//  881 1467:sipush          212
	//  882 1470:ldc2            #292 <Int 0x29f3d35>
	//  883 1473:iastore         
	//  884 1474:dup             
	//  885 1475:sipush          213
	//  886 1478:ldc2            #293 <Int 0x65e2082>
	//  887 1481:iastore         
	//  888 1482:dup             
	//  889 1483:sipush          214
	//  890 1486:ldc2            #294 <Int 0xb1d065b>
	//  891 1489:iastore         
	//  892 1490:dup             
	//  893 1491:sipush          215
	//  894 1494:ldc2            #295 <Int 0xfdc1bec>
	//  895 1497:iastore         
	//  896 1498:dup             
	//  897 1499:sipush          216
	//  898 1502:ldc2            #296 <Int 0x3793a651>
	//  899 1505:iastore         
	//  900 1506:dup             
	//  901 1507:sipush          217
	//  902 1510:ldc2            #297 <Int 0x3352bbe6>
	//  903 1513:iastore         
	//  904 1514:dup             
	//  905 1515:sipush          218
	//  906 1518:ldc2            #298 <Int 0x3e119d3f>
	//  907 1521:iastore         
	//  908 1522:dup             
	//  909 1523:sipush          219
	//  910 1526:ldc2            #299 <Int 0x3ad08088>
	//  911 1529:iastore         
	//  912 1530:dup             
	//  913 1531:sipush          220
	//  914 1534:ldc2            #300 <Int 0x2497d08d>
	//  915 1537:iastore         
	//  916 1538:dup             
	//  917 1539:sipush          221
	//  918 1542:ldc2            #301 <Int 0x2056cd3a>
	//  919 1545:iastore         
	//  920 1546:dup             
	//  921 1547:sipush          222
	//  922 1550:ldc2            #302 <Int 0x2d15ebe3>
	//  923 1553:iastore         
	//  924 1554:dup             
	//  925 1555:sipush          223
	//  926 1558:ldc2            #303 <Int 0x29d4f654>
	//  927 1561:iastore         
	//  928 1562:dup             
	//  929 1563:sipush          224
	//  930 1566:ldc2            #304 <Int 0xc5a92679>
	//  931 1569:iastore         
	//  932 1570:dup             
	//  933 1571:sipush          225
	//  934 1574:ldc2            #305 <Int 0xc1683bce>
	//  935 1577:iastore         
	//  936 1578:dup             
	//  937 1579:sipush          226
	//  938 1582:ldc2            #306 <Int 0xcc2b1d17>
	//  939 1585:iastore         
	//  940 1586:dup             
	//  941 1587:sipush          227
	//  942 1590:ldc2            #307 <Int 0xc8ea00a0>
	//  943 1593:iastore         
	//  944 1594:dup             
	//  945 1595:sipush          228
	//  946 1598:ldc2            #308 <Int 0xd6ad50a5>
	//  947 1601:iastore         
	//  948 1602:dup             
	//  949 1603:sipush          229
	//  950 1606:ldc2            #309 <Int 0xd26c4d12>
	//  951 1609:iastore         
	//  952 1610:dup             
	//  953 1611:sipush          230
	//  954 1614:ldc2            #310 <Int 0xdf2f6bcb>
	//  955 1617:iastore         
	//  956 1618:dup             
	//  957 1619:sipush          231
	//  958 1622:ldc2            #311 <Int 0xdbee767c>
	//  959 1625:iastore         
	//  960 1626:dup             
	//  961 1627:sipush          232
	//  962 1630:ldc2            #312 <Int 0xe3a1cbc1>
	//  963 1633:iastore         
	//  964 1634:dup             
	//  965 1635:sipush          233
	//  966 1638:ldc2            #313 <Int 0xe760d676>
	//  967 1641:iastore         
	//  968 1642:dup             
	//  969 1643:sipush          234
	//  970 1646:ldc2            #314 <Int 0xea23f0af>
	//  971 1649:iastore         
	//  972 1650:dup             
	//  973 1651:sipush          235
	//  974 1654:ldc2            #315 <Int 0xeee2ed18>
	//  975 1657:iastore         
	//  976 1658:dup             
	//  977 1659:sipush          236
	//  978 1662:ldc2            #316 <Int 0xf0a5bd1d>
	//  979 1665:iastore         
	//  980 1666:dup             
	//  981 1667:sipush          237
	//  982 1670:ldc2            #317 <Int 0xf464a0aa>
	//  983 1673:iastore         
	//  984 1674:dup             
	//  985 1675:sipush          238
	//  986 1678:ldc2            #318 <Int 0xf9278673>
	//  987 1681:iastore         
	//  988 1682:dup             
	//  989 1683:sipush          239
	//  990 1686:ldc2            #319 <Int 0xfde69bc4>
	//  991 1689:iastore         
	//  992 1690:dup             
	//  993 1691:sipush          240
	//  994 1694:ldc2            #320 <Int 0x89b8fd09>
	//  995 1697:iastore         
	//  996 1698:dup             
	//  997 1699:sipush          241
	//  998 1702:ldc2            #321 <Int 0x8d79e0be>
	//  999 1705:iastore         
	// 1000 1706:dup             
	// 1001 1707:sipush          242
	// 1002 1710:ldc2            #322 <Int 0x803ac667>
	// 1003 1713:iastore         
	// 1004 1714:dup             
	// 1005 1715:sipush          243
	// 1006 1718:ldc2            #323 <Int 0x84fbdbd0>
	// 1007 1721:iastore         
	// 1008 1722:dup             
	// 1009 1723:sipush          244
	// 1010 1726:ldc2            #324 <Int 0x9abc8bd5>
	// 1011 1729:iastore         
	// 1012 1730:dup             
	// 1013 1731:sipush          245
	// 1014 1734:ldc2            #325 <Int 0x9e7d9662>
	// 1015 1737:iastore         
	// 1016 1738:dup             
	// 1017 1739:sipush          246
	// 1018 1742:ldc2            #326 <Int 0x933eb0bb>
	// 1019 1745:iastore         
	// 1020 1746:dup             
	// 1021 1747:sipush          247
	// 1022 1750:ldc2            #327 <Int 0x97ffad0c>
	// 1023 1753:iastore         
	// 1024 1754:dup             
	// 1025 1755:sipush          248
	// 1026 1758:ldc2            #328 <Int 0xafb010b1>
	// 1027 1761:iastore         
	// 1028 1762:dup             
	// 1029 1763:sipush          249
	// 1030 1766:ldc2            #329 <Int 0xab710d06>
	// 1031 1769:iastore         
	// 1032 1770:dup             
	// 1033 1771:sipush          250
	// 1034 1774:ldc2            #330 <Int 0xa6322bdf>
	// 1035 1777:iastore         
	// 1036 1778:dup             
	// 1037 1779:sipush          251
	// 1038 1782:ldc2            #331 <Int 0xa2f33668>
	// 1039 1785:iastore         
	// 1040 1786:dup             
	// 1041 1787:sipush          252
	// 1042 1790:ldc2            #332 <Int 0xbcb4666d>
	// 1043 1793:iastore         
	// 1044 1794:dup             
	// 1045 1795:sipush          253
	// 1046 1798:ldc2            #333 <Int 0xb8757bda>
	// 1047 1801:iastore         
	// 1048 1802:dup             
	// 1049 1803:sipush          254
	// 1050 1806:ldc2            #334 <Int 0xb5365d03>
	// 1051 1809:iastore         
	// 1052 1810:dup             
	// 1053 1811:sipush          255
	// 1054 1814:ldc2            #335 <Int 0xb1f740b4>
	// 1055 1817:iastore         
	// 1056 1818:putstatic       #337 <Field int[] CRC32_BYTES_MSBF>
	//*1057 1821:return          
	}
}
